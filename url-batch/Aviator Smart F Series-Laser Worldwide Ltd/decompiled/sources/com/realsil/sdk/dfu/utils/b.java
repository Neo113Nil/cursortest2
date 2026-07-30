package com.realsil.sdk.dfu.utils;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import com.realsil.sdk.bbpro.core.peripheral.BluetoothSppPeripheral;
import com.realsil.sdk.bbpro.core.peripheral.Peripheral;
import com.realsil.sdk.bbpro.core.peripheral.PeripheralCallback;
import com.realsil.sdk.bbpro.core.peripheral.PeripheralManager;
import com.realsil.sdk.bbpro.core.spp.SppTransportConnParams;
import com.realsil.sdk.bbpro.core.transportlayer.AckPacket;
import com.realsil.sdk.bbpro.core.transportlayer.Command;
import com.realsil.sdk.bbpro.core.transportlayer.TransportLayerPacket;
import com.realsil.sdk.core.bluetooth.BluetoothProfileCallback;
import com.realsil.sdk.core.logger.ZLogger;
import com.realsil.sdk.dfu.DfuException;
import com.realsil.sdk.dfu.exception.ConnectionException;
import com.realsil.sdk.dfu.internal.base.BaseDfuTask;
import com.realsil.sdk.dfu.model.DfuConfig;
import com.realsil.sdk.dfu.model.DfuQcConfig;
import com.realsil.sdk.dfu.model.OtaDeviceInfo;
import com.realsil.sdk.dfu.model.OtaModeInfo;
import com.realsil.sdk.dfu.u.a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
import y5.u;

/* loaded from: classes4.dex */
public class b extends BluetoothDfuAdapter {
    public static volatile b N;
    public BluetoothSppPeripheral I;
    public com.realsil.sdk.dfu.u.a J;
    public int K;
    public final PeripheralCallback L;
    public final a.c M;

    public class a extends PeripheralCallback {
        public a() {
        }

        public void onAckReceive(Peripheral peripheral, AckPacket ackPacket) {
            super.onAckReceive(peripheral, ackPacket);
            b.this.a(ackPacket);
        }

        public void onConnectionStateChanged(Peripheral peripheral, int i8) {
            super.onConnectionStateChanged(peripheral, i8);
            if (i8 == 2) {
                if (b.this.isPreparing() || b.this.isBackConnecting()) {
                    b.this.notifyLock();
                    return;
                } else {
                    b.this.notifyLock();
                    ZLogger.d(String.format("ignore connection update when state=0x%04X", Integer.valueOf(b.this.f16389p)));
                    return;
                }
            }
            if (i8 == 0) {
                if (b.this.isStageBusy(512) || b.this.isStageBusy(2048)) {
                    b.this.a((DfuException) new ConnectionException(6), false);
                }
                b.this.notifyStateChanged(4097);
            }
        }

        public void onDataReceive(Peripheral peripheral, TransportLayerPacket transportLayerPacket) {
            super.onDataReceive(peripheral, transportLayerPacket);
            try {
                b.this.a(transportLayerPacket);
            } catch (Exception e8) {
                ZLogger.w(e8.toString());
            }
        }
    }

    /* renamed from: com.realsil.sdk.dfu.utils.b$b, reason: collision with other inner class name */
    public class C0335b implements a.c {
        public C0335b() {
        }

        @Override // com.realsil.sdk.dfu.u.a.c
        public void onStateChanged(int i8) {
            if (i8 != 1) {
                if (i8 != 2) {
                    return;
                }
                if (b.this.isPreparing() || b.this.isBackConnecting()) {
                    b.this.a((DfuException) new ConnectionException(5), false);
                    return;
                }
                return;
            }
            if (b.this.isPreparing()) {
                b bVar = b.this;
                bVar.f16392s = bVar.getOtaDeviceInfo();
                b.this.notifyStateChanged(527);
            } else if (!b.this.isBackConnecting()) {
                b bVar2 = b.this;
                ZLogger.v(bVar2.f16382i, String.format("ignore, is not in preparing or back connect state: 0x%04X", Integer.valueOf(bVar2.f16389p)));
            } else {
                if (!b.this.b()) {
                    b.this.notifyStateChanged(DfuAdapter.STATE_BACKCONNECT_COMPLETED);
                    return;
                }
                b.this.notifyStateChanged(DfuAdapter.STATE_BACKCONNECT_VALIDATE);
                b bVar3 = b.this;
                if (bVar3.validate(bVar3.getOtaDeviceInfo())) {
                    b.this.notifyStateChanged(DfuAdapter.STATE_BACKCONNECT_COMPLETED);
                } else {
                    b.this.notifyStateChanged(DfuAdapter.STATE_BACKCONNECT_VALIDATE_FAILED);
                }
            }
        }
    }

    public class c extends BluetoothProfileCallback {
        public c() {
        }

        @Override // com.realsil.sdk.core.bluetooth.BluetoothProfileCallback
        public void onHfpConnectionStateChanged(BluetoothDevice bluetoothDevice, int i8) {
            BaseDfuTask baseDfuTask;
            super.onHfpConnectionStateChanged(bluetoothDevice, i8);
            if (i8 == 2 && (baseDfuTask = b.this.f16395v) != null && (baseDfuTask instanceof com.realsil.sdk.dfu.k.b)) {
                ((com.realsil.sdk.dfu.k.b) baseDfuTask).a(bluetoothDevice, i8);
            }
        }
    }

    public b(Context context) {
        super(context);
        this.L = new a();
        this.M = new C0335b();
    }

    private synchronized void b(int i8) {
        try {
            ZLogger.v(this.f16382i, String.format("initSubAdapter, protocolType=0x%04X", Integer.valueOf(i8)));
            com.realsil.sdk.dfu.u.a aVar = this.J;
            if (aVar != null) {
                aVar.a();
            }
            this.J = i8 == 17 ? new com.realsil.sdk.dfu.x.a() : i8 == 22 ? new com.realsil.sdk.dfu.v.a() : new com.realsil.sdk.dfu.w.a();
            this.J.a(this.mContext, this.f16384k, this.M);
        } catch (Throwable th) {
            throw th;
        }
    }

    public static b getDfuAdapter(Context context) {
        if (N == null) {
            synchronized (b.class) {
                try {
                    if (N == null) {
                        N = new b(context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return N;
    }

    public final BluetoothSppPeripheral a(String str) {
        BluetoothSppPeripheral registerPeripheral = PeripheralManager.getInstance().registerPeripheral(getContext(), 1, str, this.L);
        this.I = registerPeripheral;
        if (registerPeripheral == null) {
            ZLogger.w("registerPeripheral failed");
        }
        return this.I;
    }

    @Override // com.realsil.sdk.dfu.utils.BluetoothDfuAdapter, com.realsil.sdk.dfu.utils.DfuAdapter
    public boolean connectDevice(ConnectParams connectParams) {
        if (!super.connectDevice(connectParams)) {
            return false;
        }
        this.D = connectParams.getAddress();
        this.B = getRemoteDevice(connectParams.getAddress());
        g();
        return true;
    }

    @Override // com.realsil.sdk.dfu.utils.BluetoothDfuAdapter, com.realsil.sdk.dfu.utils.DfuAdapter
    public void destroy() {
        super.destroy();
        BluetoothSppPeripheral bluetoothSppPeripheral = this.I;
        if (bluetoothSppPeripheral != null) {
            bluetoothSppPeripheral.unregisterPeripheralCallback(this.L);
        }
        com.realsil.sdk.dfu.u.a aVar = this.J;
        if (aVar != null) {
            aVar.a();
        }
        i();
        N = null;
    }

    @Override // com.realsil.sdk.dfu.utils.DfuAdapter
    public void disconnect() {
        super.disconnect();
        notifyStateChanged(4096);
        BluetoothSppPeripheral bluetoothSppPeripheral = this.I;
        if (bluetoothSppPeripheral != null) {
            bluetoothSppPeripheral.disconnect();
        }
        h();
    }

    @Override // com.realsil.sdk.dfu.utils.BluetoothDfuAdapter
    public BluetoothProfileCallback getBluetoothProfileCallback() {
        return new c();
    }

    @Override // com.realsil.sdk.dfu.utils.BluetoothDfuAdapter
    public OtaDeviceInfo getOtaDeviceInfo() {
        com.realsil.sdk.dfu.u.a aVar = this.J;
        return aVar != null ? aVar.b() : super.getOtaDeviceInfo();
    }

    @Override // com.realsil.sdk.dfu.utils.DfuAdapter
    public OtaModeInfo getPriorityWorkMode(int i8) {
        com.realsil.sdk.dfu.u.a aVar = this.J;
        return aVar != null ? aVar.a(i8) : super.getPriorityWorkMode(i8);
    }

    @Override // com.realsil.sdk.dfu.utils.DfuAdapter
    public List<OtaModeInfo> getSupportedModes() {
        com.realsil.sdk.dfu.u.a aVar = this.J;
        return aVar != null ? aVar.c() : super.getSupportedModes();
    }

    @Override // com.realsil.sdk.dfu.utils.BluetoothDfuAdapter
    public void processConnectRunnable() {
        super.processConnectRunnable();
        notifyStateChanged(this.f16388o | 23);
        a(this.B.getAddress());
        BluetoothSppPeripheral bluetoothSppPeripheral = this.I;
        if (bluetoothSppPeripheral == null || bluetoothSppPeripheral.startConnect(new SppTransportConnParams.Builder(this.B.getAddress()).uuid(this.f16384k.getSppConfig().getUuid().getUuid()).transport(this.f16384k.getSppConfig().getTransport()).createBond(true, 1).build()) == 1) {
            ZLogger.w("connect failed");
        } else {
            synchronized (this.f16387n) {
                if (!this.I.isConnected()) {
                    try {
                        ZLogger.v(this.f16383j, "wait connect result");
                        this.f16387n.wait(60000L);
                    } catch (InterruptedException unused) {
                    }
                }
            }
            if (this.I.isConnected()) {
                this.K = 0;
                notifyStateChanged(this.f16388o, 28);
                if (sendCmd(1548, null)) {
                    a(10000L);
                    if (checkState(this.f16388o, 28)) {
                        b(this.K);
                        this.J.e();
                        return;
                    }
                    return;
                }
                if (this.f16382i) {
                    ZLogger.d(getOtaDeviceInfo().toString());
                }
                notifyStateChanged(527);
                notifyLock();
                if (this.f16384k.isCreateBond()) {
                    c();
                    return;
                }
                return;
            }
            ZLogger.d(String.format("connect failed, state=0x%04X", Integer.valueOf(this.f16389p)));
        }
        notifyStateChanged(4098);
    }

    public boolean sendCmd(int i8, byte[] bArr) {
        Command build = new Command.Builder().writeType(2).packet(i8, bArr).build();
        BluetoothSppPeripheral bluetoothSppPeripheral = this.I;
        return bluetoothSppPeripheral != null && bluetoothSppPeripheral.sendVendorCommand(build).code == 0;
    }

    @Override // com.realsil.sdk.dfu.utils.DfuAdapter
    public boolean setTestParams(OtaDeviceInfo otaDeviceInfo, DfuQcConfig dfuQcConfig) {
        if (otaDeviceInfo == null || dfuQcConfig == null) {
            ZLogger.w("IllegalArgumentException: deviceInfo and params can not be null");
            return false;
        }
        com.realsil.sdk.dfu.u.a aVar = this.J;
        if (aVar != null) {
            return aVar.a(otaDeviceInfo, dfuQcConfig);
        }
        return false;
    }

    @Override // com.realsil.sdk.dfu.utils.BluetoothDfuAdapter
    public boolean startOtaProcedure(DfuConfig dfuConfig, OtaDeviceInfo otaDeviceInfo, boolean z7) {
        if (!super.startOtaProcedure(dfuConfig, otaDeviceInfo, z7)) {
            return false;
        }
        notifyStateChanged(1025);
        BluetoothSppPeripheral bluetoothSppPeripheral = this.I;
        if (bluetoothSppPeripheral != null) {
            bluetoothSppPeripheral.unregisterPeripheralCallback(this.L);
        }
        com.realsil.sdk.dfu.u.a aVar = this.J;
        if (aVar != null) {
            aVar.a();
        }
        boolean startOtaTask = startOtaTask(dfuConfig);
        if (!startOtaTask) {
            notifyStateChanged(1026);
        }
        return startOtaTask;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(AckPacket ackPacket) {
        int toAckId = ackPacket.getToAckId();
        byte status = ackPacket.getStatus();
        if (toAckId == 1548 && checkState(this.f16388o, 28)) {
            if (status != 2 && status != 1) {
                ZLogger.v(this.f16382i, "ACK-CMD_OTA_PROTOCOL_TYPE");
                return;
            }
            ZLogger.d(this.f16381h, "CMD_OTA_PROTOCOL_TYPE not support");
            this.K = 0;
            notifyLock();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(TransportLayerPacket transportLayerPacket) {
        int opcode = transportLayerPacket.getOpcode();
        transportLayerPacket.getPayload();
        byte[] parameters = transportLayerPacket.getParameters();
        if (opcode == 1546 && checkState(this.f16388o, 28)) {
            ByteBuffer wrap = ByteBuffer.wrap(parameters);
            wrap.order(ByteOrder.LITTLE_ENDIAN);
            this.K = wrap.getShort(0) & u.MAX_VALUE;
            ZLogger.v(this.f16382i, String.format("protocolType=0x%04X, specVersion=0x%04X", Integer.valueOf(this.K), Integer.valueOf(parameters.length > 2 ? wrap.get(2) : (byte) -1)));
            notifyLock();
        }
    }
}
