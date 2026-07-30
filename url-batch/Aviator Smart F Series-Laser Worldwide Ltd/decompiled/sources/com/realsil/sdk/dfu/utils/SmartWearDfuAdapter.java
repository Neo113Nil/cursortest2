package com.realsil.sdk.dfu.utils;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.os.Message;
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
import com.realsil.sdk.dfu.model.OtaDeviceInfo;
import com.realsil.sdk.dfu.model.OtaModeInfo;
import com.realsil.sdk.dfu.smartwear.SmartWearBinConfig;
import com.realsil.sdk.dfu.u.a;
import com.realsil.sdk.dfu.utils.DfuAdapter;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
import java.util.Locale;

/* loaded from: classes4.dex */
public class SmartWearDfuAdapter extends BluetoothDfuAdapter {
    public static volatile SmartWearDfuAdapter P;
    public BluetoothSppPeripheral I;
    public com.realsil.sdk.dfu.u.a J;
    public int K;
    public SmartWearBinConfig L;
    public SmartWearDfuProgressInfo M;
    public final PeripheralCallback N;
    public final a.c O;

    public static abstract class SmartWearDfuAdapterCallback extends DfuAdapter.DfuHelperCallback {
        public void onSmartWearProgressChanged(SmartWearDfuProgressInfo smartWearDfuProgressInfo) {
        }
    }

    public static class SmartWearDfuProgressInfo {
        public static final byte DEVICE_ID_BT = 2;
        public static final byte DEVICE_ID_WIFI = 1;
        public static final byte ROLE_SIDE_LEFT = 1;
        public static final byte ROLE_SIDE_RIGHT = 2;
        public static final byte ROLE_SIDE_SINGLE = 0;

        /* renamed from: a, reason: collision with root package name */
        public int f16407a;

        /* renamed from: b, reason: collision with root package name */
        public int f16408b = -1;
        public int progressValue;
        public byte roleSide;
        public int updateDeviceId;

        public SmartWearDfuProgressInfo(byte b8, int i8, int i9) {
            this.roleSide = b8;
            this.updateDeviceId = i8;
            this.progressValue = i9;
        }

        public static SmartWearDfuProgressInfo fromBytes(byte[] bArr) {
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            wrap.order(ByteOrder.LITTLE_ENDIAN);
            return new SmartWearDfuProgressInfo(wrap.get(), wrap.get(), wrap.get());
        }

        public void clear() {
            this.roleSide = (byte) 0;
            this.updateDeviceId = 0;
            this.progressValue = 0;
            this.f16408b = -1;
        }

        public int getTotalProgressValue() {
            return this.f16407a == 2 ? this.f16408b == 0 ? this.progressValue / 2 : (this.progressValue / 2) + 50 : this.progressValue;
        }

        public void init(int i8) {
            this.f16407a = i8;
            clear();
        }

        public String toString() {
            return "SmartWearDfuProgressInfo{roleSide=" + ((int) this.roleSide) + String.format(", updateImage(%d/%d) deviceId=%d", Integer.valueOf(this.f16408b), Integer.valueOf(this.f16407a), Integer.valueOf(this.updateDeviceId)) + ", progressValue=" + this.progressValue + ", totalProgressValue=" + getTotalProgressValue() + '}';
        }

        public void update(byte[] bArr) {
            int i8;
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            wrap.order(ByteOrder.LITTLE_ENDIAN);
            this.roleSide = wrap.get();
            byte b8 = wrap.get();
            this.progressValue = wrap.get();
            int i9 = this.updateDeviceId;
            if (i9 != 0) {
                i8 = i9 != b8 ? 1 : 0;
                this.updateDeviceId = b8;
            }
            this.f16408b = i8;
            this.updateDeviceId = b8;
        }
    }

    public static class StatusCode {
        public static final int DFU_STATUS_BT_CHECK_IMAGE_ERROR = 4;
        public static final int DFU_STATUS_BT_CMD_TRANSFER_TIMEOUT = 5;
        public static final int DFU_STATUS_BT_START_FW_UPGRADE_ERROR = 2;
        public static final int DFU_STATUS_BT_WRITE_IMAGE_ERROR = 3;
        public static final int DFU_STATUS_CANCEL_SYS_UPGRADE_ERROR = 7;
        public static final int DFU_STATUS_SUCCESS = 0;
        public static final int DFU_STATUS_TOTAL_TIMEOUT = 6;
        public static final int DFU_STATUS_WIFI_START_FW_UPGRADE_ERROR = 1;
    }

    public SmartWearDfuAdapter(Context context) {
        super(context);
        this.L = new SmartWearBinConfig();
        this.M = new SmartWearDfuProgressInfo((byte) 0, 0, 0);
        this.N = new PeripheralCallback() { // from class: com.realsil.sdk.dfu.utils.SmartWearDfuAdapter.1
            public void onAckReceive(Peripheral peripheral, AckPacket ackPacket) {
                super.onAckReceive(peripheral, ackPacket);
                SmartWearDfuAdapter.this.a(ackPacket);
            }

            public void onConnectionStateChanged(Peripheral peripheral, int i8) {
                super.onConnectionStateChanged(peripheral, i8);
                if (i8 == 2) {
                    if (SmartWearDfuAdapter.this.isPreparing() || SmartWearDfuAdapter.this.isBackConnecting()) {
                        SmartWearDfuAdapter.this.notifyLock();
                        return;
                    } else {
                        SmartWearDfuAdapter.this.notifyLock();
                        ZLogger.d(String.format("ignore connection update when state=0x%04X", Integer.valueOf(SmartWearDfuAdapter.this.f16389p)));
                        return;
                    }
                }
                if (i8 == 0) {
                    if (SmartWearDfuAdapter.this.isStageBusy(512) || SmartWearDfuAdapter.this.isStageBusy(2048)) {
                        SmartWearDfuAdapter.this.a((DfuException) new ConnectionException(6), false);
                    }
                    SmartWearDfuAdapter.this.notifyStateChanged(4097);
                }
            }

            public void onDataReceive(Peripheral peripheral, TransportLayerPacket transportLayerPacket) {
                super.onDataReceive(peripheral, transportLayerPacket);
                try {
                    SmartWearDfuAdapter.this.a(transportLayerPacket);
                } catch (Exception e8) {
                    ZLogger.w(e8.toString());
                }
            }
        };
        this.O = new a.c() { // from class: com.realsil.sdk.dfu.utils.SmartWearDfuAdapter.2
            @Override // com.realsil.sdk.dfu.u.a.c
            public void onStateChanged(int i8) {
                if (i8 != 1) {
                    if (i8 != 2) {
                        return;
                    }
                    if (SmartWearDfuAdapter.this.isPreparing() || SmartWearDfuAdapter.this.isBackConnecting()) {
                        SmartWearDfuAdapter.this.a((DfuException) new ConnectionException(5), false);
                        return;
                    }
                    return;
                }
                if (SmartWearDfuAdapter.this.isPreparing()) {
                    SmartWearDfuAdapter smartWearDfuAdapter = SmartWearDfuAdapter.this;
                    smartWearDfuAdapter.f16392s = smartWearDfuAdapter.getOtaDeviceInfo();
                    SmartWearDfuAdapter.this.notifyStateChanged(527);
                } else if (!SmartWearDfuAdapter.this.isBackConnecting()) {
                    SmartWearDfuAdapter smartWearDfuAdapter2 = SmartWearDfuAdapter.this;
                    ZLogger.v(smartWearDfuAdapter2.f16382i, String.format("ignore, is not in preparing or back connect state: 0x%04X", Integer.valueOf(smartWearDfuAdapter2.f16389p)));
                } else {
                    if (!SmartWearDfuAdapter.this.b()) {
                        SmartWearDfuAdapter.this.notifyStateChanged(DfuAdapter.STATE_BACKCONNECT_COMPLETED);
                        return;
                    }
                    SmartWearDfuAdapter.this.notifyStateChanged(DfuAdapter.STATE_BACKCONNECT_VALIDATE);
                    SmartWearDfuAdapter smartWearDfuAdapter3 = SmartWearDfuAdapter.this;
                    if (smartWearDfuAdapter3.validate(smartWearDfuAdapter3.getOtaDeviceInfo())) {
                        SmartWearDfuAdapter.this.notifyStateChanged(DfuAdapter.STATE_BACKCONNECT_COMPLETED);
                    } else {
                        SmartWearDfuAdapter.this.notifyStateChanged(DfuAdapter.STATE_BACKCONNECT_VALIDATE_FAILED);
                    }
                }
            }
        };
    }

    private BluetoothSppPeripheral a(String str) {
        BluetoothSppPeripheral registerPeripheral = PeripheralManager.getInstance().registerPeripheral(getContext(), 1, str, this.N);
        this.I = registerPeripheral;
        if (registerPeripheral == null) {
            ZLogger.w("registerPeripheral failed");
        }
        return this.I;
    }

    private synchronized void b(int i8) {
        try {
            ZLogger.v(this.f16382i, String.format("initSubAdapter, protocolType=0x%04X", Integer.valueOf(i8)));
            com.realsil.sdk.dfu.u.a aVar = this.J;
            if (aVar != null) {
                aVar.a();
            }
            this.J = i8 == 17 ? new com.realsil.sdk.dfu.z.a() : i8 == 22 ? new com.realsil.sdk.dfu.v.a() : new com.realsil.sdk.dfu.w.a();
            this.J.a(this.mContext, this.f16384k, this.O);
        } catch (Throwable th) {
            throw th;
        }
    }

    public static SmartWearDfuAdapter getDfuAdapter(Context context) {
        if (P == null) {
            synchronized (SmartWearDfuAdapter.class) {
                try {
                    if (P == null) {
                        P = new SmartWearDfuAdapter(context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return P;
    }

    @Override // com.realsil.sdk.dfu.utils.DfuAdapter
    public boolean abort() {
        super.abort();
        return sendCmd(1590, null);
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
            bluetoothSppPeripheral.unregisterPeripheralCallback(this.N);
        }
        com.realsil.sdk.dfu.u.a aVar = this.J;
        if (aVar != null) {
            aVar.a();
        }
        i();
        P = null;
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
        return new BluetoothProfileCallback() { // from class: com.realsil.sdk.dfu.utils.SmartWearDfuAdapter.3
            @Override // com.realsil.sdk.core.bluetooth.BluetoothProfileCallback
            public void onHfpConnectionStateChanged(BluetoothDevice bluetoothDevice, int i8) {
                BaseDfuTask baseDfuTask;
                super.onHfpConnectionStateChanged(bluetoothDevice, i8);
                if (i8 == 2 && (baseDfuTask = SmartWearDfuAdapter.this.f16395v) != null && (baseDfuTask instanceof com.realsil.sdk.dfu.k.b)) {
                    ((com.realsil.sdk.dfu.k.b) baseDfuTask).a(bluetoothDevice, i8);
                }
            }
        };
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
        if (this.f16384k.isCreateBond()) {
            if (f()) {
                d();
                e();
            } else {
                ZLogger.w("device has not been paired, just ignore here");
            }
        }
        notifyStateChanged(this.f16388o | 23);
        a(this.B.getAddress());
        BluetoothSppPeripheral bluetoothSppPeripheral = this.I;
        if (bluetoothSppPeripheral == null || bluetoothSppPeripheral.startConnect(new SppTransportConnParams.Builder(this.B.getAddress()).uuid(this.f16384k.getSppConfig().getUuid().getUuid()).transport(this.f16384k.getSppConfig().getTransport()).build()) == 1) {
            ZLogger.w("connect failed");
        } else {
            ZLogger.v(this.f16383j, "wait connect result");
            synchronized (this.f16387n) {
                if (!this.I.isConnected()) {
                    try {
                        this.f16387n.wait(30000L);
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

    public boolean startOtaProcedure(DfuConfig dfuConfig, OtaDeviceInfo otaDeviceInfo, boolean z7, SmartWearBinConfig smartWearBinConfig) {
        if (!super.startOtaProcedure(dfuConfig, otaDeviceInfo, z7)) {
            return false;
        }
        this.L = smartWearBinConfig;
        notifyStateChanged(1025);
        com.realsil.sdk.dfu.u.a aVar = this.J;
        if (aVar != null) {
            aVar.a();
        }
        this.M.init(smartWearBinConfig.getImageNumber());
        boolean z8 = this.f16390q;
        if (z8 && (this.f16391r & 512) == 512) {
            ZLogger.w(String.format(Locale.US, "isInOtaProcess=%b, mProcessState=0x%04X", Boolean.valueOf(z8), Integer.valueOf(this.f16391r)));
            return false;
        }
        this.f16391r = 257;
        com.realsil.sdk.dfu.z.b bVar = new com.realsil.sdk.dfu.z.b(this.mContext, dfuConfig, smartWearBinConfig, this.f16397x);
        this.f16395v = bVar;
        bVar.start();
        return true;
    }

    @Override // com.realsil.sdk.dfu.utils.DfuAdapter
    public void a(Message message) {
        super.a(message);
        if (message.what == 16) {
            a((SmartWearDfuProgressInfo) message.obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(AckPacket ackPacket) {
        int toAckId = ackPacket.getToAckId();
        byte status = ackPacket.getStatus();
        if (toAckId == 1548 && checkState(this.f16388o, 28)) {
            if (status == 2 || status == 1) {
                ZLogger.v(this.f16382i, "CMD_OTA_PROTOCOL_TYPE not support");
                this.K = 0;
                notifyLock();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(TransportLayerPacket transportLayerPacket) {
        int opcode = transportLayerPacket.getOpcode();
        transportLayerPacket.getPayload();
        byte[] parameters = transportLayerPacket.getParameters();
        if (opcode != 1546) {
            if (opcode == 1589) {
                this.M.update(parameters);
                b(16, this.M);
                return;
            }
            return;
        }
        if (checkState(this.f16388o, 28)) {
            ByteBuffer wrap = ByteBuffer.wrap(parameters);
            wrap.order(ByteOrder.LITTLE_ENDIAN);
            this.K = wrap.getShort(0);
            ZLogger.v(this.f16382i, String.format("protocolType=0x%04X, specVersion=0x%04X", Integer.valueOf(this.K), Integer.valueOf(parameters.length > 2 ? wrap.get(2) : (byte) -1)));
            notifyLock();
        }
    }

    public final void a(SmartWearDfuProgressInfo smartWearDfuProgressInfo) {
        DfuAdapter.DfuHelperCallback dfuHelperCallback = this.f16386m;
        if (dfuHelperCallback == null) {
            ZLogger.v(this.f16382i, "no callback registered");
        } else if (dfuHelperCallback instanceof SmartWearDfuAdapterCallback) {
            ZLogger.v(this.f16382i, smartWearDfuProgressInfo.toString());
            ((SmartWearDfuAdapterCallback) this.f16386m).onSmartWearProgressChanged(smartWearDfuProgressInfo);
        }
    }
}
