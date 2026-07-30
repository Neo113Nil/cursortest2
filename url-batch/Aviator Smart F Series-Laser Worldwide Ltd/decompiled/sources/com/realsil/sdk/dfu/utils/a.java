package com.realsil.sdk.dfu.utils;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import android.content.Context;
import com.google.android.exoplayer2.C;
import com.realsil.sdk.core.bluetooth.BluetoothProfileCallback;
import com.realsil.sdk.core.bluetooth.GlobalGatt;
import com.realsil.sdk.core.bluetooth.compat.BluetoothGattCompat;
import com.realsil.sdk.core.bluetooth.connection.le.BluetoothGattCallbackCompat;
import com.realsil.sdk.core.bluetooth.utils.BluetoothHelper;
import com.realsil.sdk.core.logger.ZLogger;
import com.realsil.sdk.dfu.DfuException;
import com.realsil.sdk.dfu.exception.ConnectionException;
import com.realsil.sdk.dfu.internal.base.BaseDfuTask;
import com.realsil.sdk.dfu.m.a;
import com.realsil.sdk.dfu.m.o;
import com.realsil.sdk.dfu.model.DfuConfig;
import com.realsil.sdk.dfu.model.OtaDeviceInfo;
import com.realsil.sdk.dfu.model.OtaModeInfo;
import com.realsil.sdk.dfu.utils.DfuAdapter;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import y5.u;

/* loaded from: classes4.dex */
public abstract class a extends BluetoothDfuAdapter {
    public GlobalGatt I;
    public BluetoothGatt J;
    public com.realsil.sdk.dfu.m.a K;
    public BluetoothGattService L;
    public BluetoothGattService M;
    public BluetoothGattCharacteristic N;
    public boolean O;
    public volatile boolean P;
    public int Q;
    public final a.c R;
    public final BluetoothGattCallbackCompat S;

    /* renamed from: com.realsil.sdk.dfu.utils.a$a, reason: collision with other inner class name */
    public class C0334a implements a.c {
        public C0334a() {
        }

        @Override // com.realsil.sdk.dfu.m.a.c
        public void a(int i8) {
            a.this.b(i8);
        }
    }

    public class b extends BluetoothGattCallbackCompat {
        public b() {
        }

        public final void a() {
            a aVar = a.this;
            aVar.O = false;
            if (aVar.isPreparing()) {
                a.this.notifyLock();
            } else {
                a.this.notifyStateChanged(4097);
            }
        }

        @Override // com.realsil.sdk.core.bluetooth.connection.le.BluetoothGattCallbackCompat
        public void onCharacteristicRead(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr, int i8) {
            a(bluetoothGatt, bluetoothGattCharacteristic, bArr, i8);
        }

        @Override // com.realsil.sdk.core.bluetooth.connection.le.BluetoothGattCallbackCompat
        public void onConnectionStateChange(BluetoothGatt bluetoothGatt, int i8, int i9) {
            if (i8 != 0) {
                a();
                return;
            }
            if (i9 != 2) {
                if (i9 == 0) {
                    a.this.disconnect();
                    a();
                    return;
                }
                return;
            }
            a aVar = a.this;
            aVar.J = aVar.I.getBluetoothGatt(aVar.D);
            a aVar2 = a.this;
            aVar2.O = false;
            if (bluetoothGatt != null) {
                aVar2.k();
            } else {
                a();
            }
        }

        @Override // com.realsil.sdk.core.bluetooth.connection.le.BluetoothGattCallbackCompat
        public void onMtuChanged(BluetoothGatt bluetoothGatt, int i8, int i9) {
            super.onMtuChanged(bluetoothGatt, i8, i9);
            a.this.P = true;
            a aVar = a.this;
            if (aVar.checkState(aVar.f16388o, DfuAdapter.ConnectState.REQUEST_MTU)) {
                a.this.notifyLock();
            }
        }

        @Override // com.realsil.sdk.core.bluetooth.connection.le.BluetoothGattCallbackCompat
        public void onServicesDiscovered(BluetoothGatt bluetoothGatt, int i8) {
            a aVar = a.this;
            if (aVar.f16389p == 1025) {
                ZLogger.d("ignore, when it is ota processing");
                return;
            }
            if (i8 == 0) {
                aVar.b(aVar.J);
            }
            a aVar2 = a.this;
            if (aVar2.checkState(aVar2.f16388o, 25)) {
                a.this.notifyLock();
            }
        }

        public final void a(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr, int i8) {
            UUID uuid = bluetoothGattCharacteristic.getUuid();
            if (i8 != 0) {
                ZLogger.d(a.this.f16382i, String.format("Characteristic read error:0x%04X ", Integer.valueOf(i8)));
                if (!o.f16095d.equals(uuid)) {
                    ZLogger.v(a.this.f16382i, "ignore exception when read other info");
                    return;
                } else {
                    if (a.this.isPreparing()) {
                        a.this.a((DfuException) new ConnectionException(5), false);
                        return;
                    }
                    return;
                }
            }
            if (o.f16095d.equals(uuid)) {
                a aVar = a.this;
                if (aVar.f16389p != 540) {
                    ZLogger.v(aVar.f16381h, "ignore duplicate data");
                    return;
                }
                ByteBuffer wrap = ByteBuffer.wrap(bArr);
                wrap.order(ByteOrder.LITTLE_ENDIAN);
                a.this.c(wrap.getShort(0) & u.MAX_VALUE);
            }
        }
    }

    public class c extends BluetoothProfileCallback {
        public c() {
        }

        @Override // com.realsil.sdk.core.bluetooth.BluetoothProfileCallback
        public void onHidStateChanged(BluetoothDevice bluetoothDevice, int i8) {
            BaseDfuTask baseDfuTask;
            super.onHidStateChanged(bluetoothDevice, i8);
            if (i8 == 2 && (baseDfuTask = a.this.f16395v) != null && (baseDfuTask instanceof com.realsil.sdk.dfu.k.b)) {
                ((com.realsil.sdk.dfu.k.b) baseDfuTask).a(bluetoothDevice, i8);
            }
        }
    }

    public a(Context context) {
        super(context);
        this.O = false;
        this.P = false;
        this.Q = 2;
        this.R = new C0334a();
        this.S = new b();
    }

    @Override // com.realsil.sdk.dfu.utils.BluetoothDfuAdapter, com.realsil.sdk.dfu.utils.DfuAdapter
    public void a() {
        super.a();
        GlobalGatt globalGatt = GlobalGatt.getInstance();
        this.I = globalGatt;
        if (globalGatt == null) {
            GlobalGatt.initial(this.mContext);
            this.I = GlobalGatt.getInstance();
        }
    }

    public void b(int i8) {
        if (i8 != 1) {
            if (i8 == 2) {
                if (isPreparing() || isBackConnecting()) {
                    a((DfuException) new ConnectionException(5), false);
                    return;
                } else {
                    ZLogger.d(String.format("ignore, is not in preparing state: 0x%04X", Integer.valueOf(this.f16389p)));
                    return;
                }
            }
            return;
        }
        if (isPreparing()) {
            notifyStateChanged(527);
            return;
        }
        if (!isBackConnecting()) {
            ZLogger.v(this.f16382i, String.format("ignore, is not in preparing or back connect state: 0x%04X", Integer.valueOf(this.f16389p)));
            return;
        }
        if (!b()) {
            notifyStateChanged(DfuAdapter.STATE_BACKCONNECT_COMPLETED);
            return;
        }
        notifyStateChanged(DfuAdapter.STATE_BACKCONNECT_VALIDATE);
        if (validate(getOtaDeviceInfo())) {
            notifyStateChanged(DfuAdapter.STATE_BACKCONNECT_COMPLETED);
        } else {
            notifyStateChanged(DfuAdapter.STATE_BACKCONNECT_VALIDATE_FAILED);
        }
    }

    public final void c(int i8) {
        com.realsil.sdk.dfu.m.a aVar;
        ZLogger.v(this.f16382i, String.format("protocolType=0x%04X", Integer.valueOf(i8)));
        notifyStateChanged(DfuAdapter.STATE_SYNC_SUB_INFO);
        com.realsil.sdk.dfu.m.a aVar2 = this.K;
        if (aVar2 != null) {
            aVar2.a();
        }
        if (i8 == 16) {
            aVar = new com.realsil.sdk.dfu.s.a(i8, this.f16384k, this.D, this.J, this.L, this.M, this.R);
        } else if (i8 == 20) {
            aVar = new com.realsil.sdk.dfu.p.a(i8, this.f16384k, this.D, this.J, this.L, this.M, this.R);
        } else if (i8 == 21) {
            aVar = new com.realsil.sdk.dfu.q.a(i8, this.f16384k, this.D, this.J, this.L, this.M, this.R);
        } else if (i8 == 18) {
            aVar = new com.realsil.sdk.dfu.n.a(i8, this.f16384k, this.D, this.J, this.L, this.M, this.R);
        } else {
            if (i8 != 19) {
                ConnectParams connectParams = this.f16384k;
                this.K = new com.realsil.sdk.dfu.r.a(0, this.f16384k, this.D, this.J, this.L, this.M, this.R, connectParams != null && "BeeTgt02".equals(connectParams.getLocalName()));
                this.K.h();
            }
            aVar = new com.realsil.sdk.dfu.o.a(i8, this.f16384k, this.D, this.J, this.L, this.M, this.R);
        }
        this.K = aVar;
        this.K.h();
    }

    @Override // com.realsil.sdk.dfu.utils.BluetoothDfuAdapter, com.realsil.sdk.dfu.utils.DfuAdapter
    public boolean connectDevice(ConnectParams connectParams) {
        if (!super.connectDevice(connectParams)) {
            return false;
        }
        String str = this.D;
        if (str != null && !str.equals(this.f16384k.getAddress())) {
            this.I.unRegisterCallback(this.D, this.S);
            this.I.close(this.D);
        }
        this.B = getRemoteDevice(this.f16384k.getAddress());
        this.D = this.f16384k.getAddress();
        this.Q = this.f16384k.getGattConfig().getConnectionTransport();
        g();
        return true;
    }

    @Override // com.realsil.sdk.dfu.utils.BluetoothDfuAdapter, com.realsil.sdk.dfu.utils.DfuAdapter
    public void destroy() {
        super.destroy();
        GlobalGatt globalGatt = this.I;
        if (globalGatt != null) {
            globalGatt.unRegisterCallback(this.D, this.S);
        }
        com.realsil.sdk.dfu.m.a aVar = this.K;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // com.realsil.sdk.dfu.utils.DfuAdapter
    public void disconnect() {
        super.disconnect();
        String str = this.D;
        if (str == null) {
            ZLogger.d("no device registered");
        } else {
            GlobalGatt globalGatt = this.I;
            if (globalGatt != null) {
                if (!globalGatt.isConnected(str)) {
                    ZLogger.v("already disconnected");
                } else {
                    if (this.I.isCallbackRegisterd(this.D, this.S)) {
                        notifyStateChanged(4096);
                        this.I.disconnect(this.D);
                        this.O = false;
                        this.J = null;
                    }
                    ZLogger.v(this.f16381h, "no gatt callback registered");
                }
            }
        }
        notifyStateChanged(4097);
        this.O = false;
        this.J = null;
    }

    @Override // com.realsil.sdk.dfu.utils.BluetoothDfuAdapter
    public BluetoothProfileCallback getBluetoothProfileCallback() {
        return new c();
    }

    @Override // com.realsil.sdk.dfu.utils.BluetoothDfuAdapter
    public OtaDeviceInfo getOtaDeviceInfo() {
        com.realsil.sdk.dfu.m.a aVar = this.K;
        return aVar != null ? aVar.b() : super.getOtaDeviceInfo();
    }

    @Override // com.realsil.sdk.dfu.utils.DfuAdapter
    public OtaModeInfo getPriorityWorkMode(int i8) {
        com.realsil.sdk.dfu.m.a aVar = this.K;
        return aVar != null ? aVar.a(i8) : super.getPriorityWorkMode(i8);
    }

    @Override // com.realsil.sdk.dfu.utils.DfuAdapter
    public List<OtaModeInfo> getSupportedModes() {
        com.realsil.sdk.dfu.m.a aVar = this.K;
        return aVar != null ? aVar.c() : super.getSupportedModes();
    }

    public boolean isGattExist() {
        return this.J != null;
    }

    public void k() {
        notifyLock();
    }

    @Override // com.realsil.sdk.dfu.utils.BluetoothDfuAdapter
    public void processConnectRunnable() {
        super.processConnectRunnable();
        if (!toEstablishGattConnection() || this.J == null) {
            notifyStateChanged(4098);
            return;
        }
        if (this.f16389p != 536) {
            try {
                Thread.sleep(1600L);
            } catch (InterruptedException unused) {
            }
            if (this.J == null) {
                notifyStateChanged(4098);
                return;
            }
            ConnectParams connectParams = this.f16384k;
            if (connectParams != null && connectParams.isRefreshCache()) {
                BluetoothGattCompat.refresh(this.J);
            }
            notifyStateChanged(DfuAdapter.STATE_PENDDING_DISCOVERY_SERVICE);
            if (getBondState(this.D) == 11) {
                ZLogger.v(this.f16381h, "wait bonding result");
                a(C.DEFAULT_SEEK_FORWARD_INCREMENT_MS);
                int bondState = getBondState(this.D);
                ZLogger.v(this.f16382i, "bondState" + bondState);
            }
            if (!a(this.J)) {
                notifyStateChanged(4098);
                disconnect();
            } else {
                if (this.Q != 1) {
                    a(this.J, 256);
                }
                readDeviceInfo(this.J);
            }
        }
    }

    public void readDeviceInfo(BluetoothGatt bluetoothGatt) {
        if (this.N == null) {
            c(0);
            return;
        }
        ZLogger.v(this.f16383j, "find CHARACTERISTIC_PROTOCOL_TYPE = " + o.f16095d);
        notifyStateChanged(540);
        a(this.N);
    }

    @Override // com.realsil.sdk.dfu.utils.BluetoothDfuAdapter
    public boolean startOtaProcedure(DfuConfig dfuConfig, OtaDeviceInfo otaDeviceInfo, boolean z7) {
        if (!super.startOtaProcedure(dfuConfig, otaDeviceInfo, z7)) {
            return false;
        }
        notifyStateChanged(1025);
        GlobalGatt globalGatt = this.I;
        if (globalGatt != null) {
            globalGatt.unRegisterCallback(this.D, this.S);
        }
        com.realsil.sdk.dfu.m.a aVar = this.K;
        if (aVar != null) {
            aVar.a();
        }
        ZLogger.v("startOtaProcedure:" + dfuConfig.toString());
        boolean startOtaTask = startOtaTask(dfuConfig);
        if (!startOtaTask) {
            notifyStateChanged(1026);
        }
        return startOtaTask;
    }

    public boolean toEstablishGattConnection() {
        return a(this.D);
    }

    public a(Context context, DfuAdapter.DfuHelperCallback dfuHelperCallback) {
        super(context, dfuHelperCallback);
        this.O = false;
        this.P = false;
        this.Q = 2;
        this.R = new C0334a();
        this.S = new b();
    }

    public void b(BluetoothGatt bluetoothGatt) {
        BluetoothGattService service;
        UUID uuid;
        if (this.f16382i) {
            ZLogger.v(BluetoothHelper.dumpBluetoothGattService(bluetoothGatt));
        }
        ConnectParams connectParams = this.f16384k;
        if (connectParams != null) {
            service = bluetoothGatt.getService(connectParams.getOtaServiceUuid());
            uuid = this.f16384k.getDfuServiceUuid();
        } else {
            service = bluetoothGatt.getService(o.f16094c);
            uuid = o.f16096e;
        }
        BluetoothGattService service2 = bluetoothGatt.getService(uuid);
        this.L = service;
        this.M = service2;
        if (service != null) {
            this.N = service.getCharacteristic(o.f16095d);
        }
        if (this.L != null || this.M != null) {
            this.O = true;
        } else {
            this.O = false;
            ZLogger.d(this.f16381h, "not support OTA feature");
        }
    }

    public boolean a(BluetoothGatt bluetoothGatt) {
        if (this.f16389p == 537) {
            ZLogger.w(this.f16381h, "discoverServices already started");
            return true;
        }
        if (bluetoothGatt == null) {
            ZLogger.w("gatt can not be null");
            return false;
        }
        notifyStateChanged(DfuAdapter.STATE_DISCOVERY_SERVICE);
        if (!bluetoothGatt.discoverServices()) {
            ZLogger.d(this.f16381h, "discoverServices failed");
            return false;
        }
        ZLogger.v(this.f16383j, "wait discover service complete");
        a(30000L);
        if (this.O) {
            ZLogger.d(this.f16382i, "service discovery complete");
            return true;
        }
        ZLogger.w(this.f16381h, "discoverServices timeout or failed");
        return false;
    }

    public boolean a(BluetoothGatt bluetoothGatt, int i8) {
        String str;
        if (bluetoothGatt == null) {
            str = "gatt can not be null";
        } else {
            notifyStateChanged(DfuAdapter.STATE_REQUEST_MTU);
            if (this.f16382i) {
                ZLogger.v("requestMtu: " + i8);
            }
            this.P = false;
            if (bluetoothGatt.requestMtu(i8)) {
                try {
                    synchronized (this.f16387n) {
                        try {
                            if (!this.P) {
                                if (this.f16383j) {
                                    ZLogger.v("wait mtu request callback for 15000ms");
                                }
                                this.f16387n.wait(C.DEFAULT_SEEK_FORWARD_INCREMENT_MS);
                            }
                        } finally {
                        }
                    }
                } catch (InterruptedException e8) {
                    ZLogger.w(this.f16381h, "requestMtu: Sleeping interrupted, e = " + e8);
                }
                if (this.P) {
                    return true;
                }
                if (this.f16382i) {
                    ZLogger.d("requestMtu No CallBack");
                }
                return false;
            }
            str = "requestMtu failed";
        }
        ZLogger.w(str);
        return false;
    }

    private boolean a(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        if (this.J == null || bluetoothGattCharacteristic == null) {
            ZLogger.w("mBtGatt is null maybe disconnected just now");
            return false;
        }
        if (this.f16382i) {
            ZLogger.v(String.format(Locale.US, "readCharacteristic:(%d) %s", Integer.valueOf(bluetoothGattCharacteristic.getInstanceId()), bluetoothGattCharacteristic.getUuid().toString()));
        }
        return this.J.readCharacteristic(bluetoothGattCharacteristic);
    }

    public boolean a(String str) {
        boolean isConnected;
        notifyStateChanged(this.f16388o | 23);
        do {
            if (this.I.connect(str, this.Q, this.S)) {
                synchronized (this.f16387n) {
                    if (!this.I.isConnected(str)) {
                        ZLogger.v(this.f16382i, "wait connect result");
                        try {
                            this.f16387n.wait(30000L);
                        } catch (InterruptedException unused) {
                        }
                    }
                }
            } else {
                ZLogger.w(this.f16381h, "connect failed");
            }
            this.f16385l--;
            isConnected = this.I.isConnected(str);
            if (isConnected) {
                break;
            }
        } while (this.f16385l > 0);
        return isConnected;
    }
}
