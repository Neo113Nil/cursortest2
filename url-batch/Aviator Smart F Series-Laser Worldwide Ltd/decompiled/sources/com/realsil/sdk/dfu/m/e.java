package com.realsil.sdk.dfu.m;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import android.content.Context;
import android.os.Build;
import com.realsil.sdk.core.bluetooth.compat.BluetoothGattCompat;
import com.realsil.sdk.core.bluetooth.connection.le.BluetoothGattCallbackCompat;
import com.realsil.sdk.core.bluetooth.scanner.ScannerParams;
import com.realsil.sdk.core.bluetooth.scanner.compat.CompatScanFilter;
import com.realsil.sdk.core.bluetooth.utils.BluetoothHelper;
import com.realsil.sdk.core.logger.ZLogger;
import com.realsil.sdk.dfu.DfuException;
import com.realsil.sdk.dfu.exception.OtaException;
import com.realsil.sdk.dfu.image.stream.BaseBinInputStream;
import com.realsil.sdk.dfu.internal.base.DfuThreadCallback;
import com.realsil.sdk.dfu.m.c;
import com.realsil.sdk.dfu.m.m;
import com.realsil.sdk.dfu.m.n;
import com.realsil.sdk.dfu.model.ConnectionParameters;
import com.realsil.sdk.dfu.model.DfuConfig;
import java.util.ArrayList;
import java.util.Locale;
import java.util.UUID;

/* loaded from: classes4.dex */
public abstract class e extends d {
    public UUID Q;
    public BluetoothGattService R;
    public BluetoothGattCharacteristic S;
    public BluetoothGattCharacteristic T;
    public BluetoothGattCharacteristic U;
    public UUID V;
    public UUID W;
    public UUID X;
    public BluetoothGattService Y;
    public BluetoothGattCharacteristic Z;

    /* renamed from: a0, reason: collision with root package name */
    public BluetoothGattCharacteristic f16040a0;

    /* renamed from: b0, reason: collision with root package name */
    public BluetoothGattCharacteristic f16041b0;

    /* renamed from: c0, reason: collision with root package name */
    public byte f16042c0;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f16043d0;

    /* renamed from: e0, reason: collision with root package name */
    public final BluetoothGattCallbackCompat f16044e0;

    public class a extends BluetoothGattCallbackCompat {
        public a() {
        }

        @Override // com.realsil.sdk.core.bluetooth.connection.le.BluetoothGattCallbackCompat
        public void onCharacteristicChanged(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr) {
            j a8 = j.a(bArr);
            if (a8 == null) {
                ZLogger.w("notification data invalid");
                return;
            }
            if (e.this.TDBG) {
                ZLogger.v(a8.toString());
            }
            if (a8.b()) {
                e.this.b(a8);
            }
        }

        @Override // com.realsil.sdk.core.bluetooth.connection.le.BluetoothGattCallbackCompat
        public void onCharacteristicRead(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr, int i8) {
            e eVar = e.this;
            if (i8 == 0) {
                eVar.mReadRxData = bArr;
            } else {
                eVar.mErrorState = i8 | 1024;
                ZLogger.w(String.format(Locale.US, "read Characteristic error:0x%04X", Integer.valueOf(e.this.mErrorState)));
            }
            e.this.notifyReadLock();
        }

        @Override // com.realsil.sdk.core.bluetooth.connection.le.BluetoothGattCallbackCompat
        public void onCharacteristicWrite(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i8) {
            if (i8 == 0) {
                e.this.mWriteRetransFlag = false;
                if (e.this.TDBG) {
                    ZLogger.v("gattCharacteristicCacheValueEnabled=" + e.this.N);
                }
                UUID uuid = e.this.W;
                if (uuid != null && uuid.equals(bluetoothGattCharacteristic.getUuid()) && e.this.N) {
                    e.this.a(bluetoothGattCharacteristic.getValue());
                }
            } else if (i8 == 257 || i8 == 143) {
                UUID uuid2 = e.this.W;
                if (uuid2 != null && uuid2.equals(bluetoothGattCharacteristic.getUuid())) {
                    if (i8 == 143) {
                        e.this.mWriteRetransFlag = false;
                        if (e.this.N) {
                            e.this.a(bluetoothGattCharacteristic.getValue());
                        }
                    } else {
                        e.this.mWriteRetransFlag = true;
                        if (e.this.DBG) {
                            ZLogger.d("write image packet error, status=" + i8 + ", please retry.");
                        }
                    }
                }
            } else {
                e.this.mErrorState = i8 | 1024;
                ZLogger.w(String.format("Characteristic write error: 0x%04X", Integer.valueOf(e.this.mErrorState)));
            }
            e.this.h();
        }

        @Override // com.realsil.sdk.core.bluetooth.connection.le.BluetoothGattCallbackCompat
        public void onConnectionStateChange(BluetoothGatt bluetoothGatt, int i8, int i9) {
            if (i8 != 0) {
                if (i9 == 0) {
                    e.this.setConnectionState(0);
                }
                e.this.mErrorState = i8 | 2048;
            } else if (i9 == 2) {
                e eVar = e.this;
                if (eVar.mAborted) {
                    ZLogger.w("task already aborted, ignore");
                    return;
                } else if (eVar.mConnectionState == 256) {
                    if (eVar.r()) {
                        BluetoothGattCompat.refresh(bluetoothGatt);
                    }
                    e.this.f16043d0 = true;
                    e.this.s();
                    return;
                }
            } else if (i9 == 0) {
                if (e.this.mProcessState == 521) {
                    e.this.mErrorState = i8 | 2048;
                    e eVar2 = e.this;
                    if (eVar2.DBG) {
                        ZLogger.d(String.format("disconnect in OTA process, mErrorState: 0x%04X", Integer.valueOf(eVar2.mErrorState)));
                    }
                    e.this.h();
                }
                e.this.setConnectionState(0);
            }
            e.this.notifyConnectionLock();
        }

        @Override // com.realsil.sdk.core.bluetooth.connection.le.BluetoothGattCallbackCompat
        public void onDescriptorWrite(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i8) {
            if (i8 != 0) {
                e.this.mErrorState = i8 | 1024;
            } else if (o.f16092a.equals(bluetoothGattDescriptor.getUuid())) {
                e.this.K = true;
            }
            e.this.f();
        }

        @Override // com.realsil.sdk.core.bluetooth.connection.le.BluetoothGattCallbackCompat
        public void onMtuChanged(BluetoothGatt bluetoothGatt, int i8, int i9) {
            if (i9 == 0) {
                if (e.this.getDfuConfig().isMtuUpdateEnabled()) {
                    e.this.MAX_PACKET_SIZE = com.realsil.sdk.dfu.j.c.a(i8);
                }
                e.this.d(i8);
            }
            e.this.M = true;
            e.this.f();
        }

        @Override // com.realsil.sdk.core.bluetooth.connection.le.BluetoothGattCallbackCompat
        public void onPhyUpdate(BluetoothGatt bluetoothGatt, int i8, int i9, int i10) {
            super.onPhyUpdate(bluetoothGatt, i8, i9, i10);
            e eVar = e.this;
            ZLogger.v(eVar.VDBG, String.format("onPhyUpdate: mConnectionState=0x%04X", Integer.valueOf(eVar.mConnectionState)));
        }

        @Override // com.realsil.sdk.core.bluetooth.connection.le.BluetoothGattCallbackCompat
        public void onServicesDiscovered(BluetoothGatt bluetoothGatt, int i8) {
            e eVar = e.this;
            if (eVar.mAborted) {
                ZLogger.w("task already aborted, ignore");
                return;
            }
            if (i8 != 0) {
                eVar.mErrorState = i8 | 2048;
                e.this.notifyConnectionLock();
            } else if (bluetoothGatt.getServices().isEmpty() && e.this.f16043d0) {
                ZLogger.v(e.this.DBG, "service list is empty, auto retry");
                e.this.f16043d0 = false;
                e.this.s();
                return;
            } else {
                if (e.this.VDBG) {
                    ZLogger.v(BluetoothHelper.dumpBluetoothGattService(bluetoothGatt));
                }
                e.this.z();
                e.this.e(bluetoothGatt);
                e.this.c(bluetoothGatt);
                e.this.d(bluetoothGatt);
                e.this.notifyConnectionLock(515);
            }
            e.this.f16043d0 = false;
        }
    }

    public e(Context context, DfuConfig dfuConfig, DfuThreadCallback dfuThreadCallback) {
        super(context, dfuConfig, dfuThreadCallback);
        this.Q = o.f16094c;
        this.V = o.f16096e;
        this.W = o.f16097f;
        this.X = o.f16098g;
        this.f16042c0 = (byte) -1;
        this.f16043d0 = false;
        this.f16044e0 = new a();
    }

    public void A() {
        if (getDfuConfig().isBreakpointResumeEnabled() || this.mImageUpdateOffset == 0) {
            return;
        }
        this.mImageUpdateOffset = 0;
        ZLogger.v(this.DBG, String.format(Locale.US, "correctImageUpdateOffsetForBreakResume, imageUpdateOffset=0x%08X(%d)", 0, Integer.valueOf(this.mImageUpdateOffset)));
    }

    public void B() {
        a(this.I, this.Z, true);
    }

    public boolean C() {
        if (!a()) {
            notifyError(4128, true);
            return false;
        }
        if (getOtaDeviceInfo().isAesEncryptEnabled() && !b()) {
            notifyError(4113);
            return false;
        }
        notifyStateChanged(521);
        ZLogger.d(this.DBG, String.format("mOtaWorkMode=0x%04X, ICType=%02X", Integer.valueOf(this.mOtaWorkMode), Integer.valueOf(getOtaDeviceInfo().icType)));
        if (this.VDBG) {
            ZLogger.v(getDfuProgressInfo().toString());
        }
        B();
        if (getDfuConfig().getGattConfig().getConnectionTransport() != 1 && Build.VERSION.SDK_INT >= 23) {
            a(this.I, 256);
        }
        u();
        return true;
    }

    public void D() {
        m a8 = new m.b(this.f15958h, getOtaDeviceInfo().specVersion).a(getDfuProgressInfo().getCurImageId()).a(getDfuProgressInfo().getCurrentFileIndex() + 1, getDfuProgressInfo().getMaxFileCount()).a();
        if (this.DBG) {
            ZLogger.d(a8.toString());
        }
        a(this.Z, a8.a(), false);
    }

    public int a(String str, int i8) {
        if (b(str) == null) {
            return DfuException.ERROR_CONNECT_ERROR;
        }
        setConnectionState(256);
        this.mErrorState = 0;
        this.isConnectedCallbackCome = false;
        if (this.DBG) {
            ZLogger.v(String.format("Connecting to device:%s, isConnectedCallbackCome=%b", BluetoothHelper.formatAddress(str, true), Boolean.valueOf(this.isConnectedCallbackCome)));
        }
        this.H.unRegisterCallback(str, this.f16044e0);
        this.H.connect(str, i8, this.f16044e0);
        BluetoothGatt bluetoothGatt = this.H.getBluetoothGatt(str);
        this.I = bluetoothGatt;
        synchronized (this.mConnectionLock) {
            try {
                if (this.VDBG) {
                    ZLogger.v(String.format("isConnectedCallbackCome=%b, mErrorState=0x%04X", Boolean.valueOf(this.isConnectedCallbackCome), Integer.valueOf(this.mErrorState)));
                }
                if (!this.isConnectedCallbackCome && this.mErrorState == 0) {
                    if (this.DBG) {
                        ZLogger.d("wait for connect gatt for " + getDfuConfig().getConnectionTimeout() + " ms");
                    }
                    try {
                        this.mConnectionLock.wait(getDfuConfig().getConnectionTimeout());
                    } catch (InterruptedException e8) {
                        ZLogger.d("connect interrupted : " + e8.toString());
                        this.mErrorState = 259;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (this.mErrorState == 0) {
            if (!this.isConnectedCallbackCome) {
                ZLogger.w("wait connect callback timeout");
                this.mErrorState = 260;
            } else if (bluetoothGatt == null || this.mConnectionState != 515) {
                ZLogger.w("connect with some error, mConnectionState=" + this.mConnectionState);
                this.mErrorState = DfuException.ERROR_CONNECT_ERROR;
            }
        }
        if (this.mErrorState == 0 && this.TDBG) {
            ZLogger.v("connected the device which going to upgrade");
        }
        return this.mErrorState;
    }

    public abstract void b(j jVar);

    public void c(BluetoothGatt bluetoothGatt) {
        BluetoothGattService service = bluetoothGatt.getService(this.V);
        this.Y = service;
        if (service == null) {
            ZLogger.w("DFU_SERVICE not found:" + this.V);
            return;
        }
        if (this.TDBG) {
            ZLogger.d("find DFU_SERVICE: " + this.V.toString());
        }
        BluetoothGattCharacteristic characteristic = this.Y.getCharacteristic(this.X);
        this.Z = characteristic;
        if (characteristic == null) {
            ZLogger.d(this.DBG, "not found DFU_CONTROL_POINT_UUID: " + this.X.toString());
            return;
        }
        if (this.TDBG) {
            ZLogger.d("find DFU_CONTROL_POINT_UUID: " + this.X.toString());
        }
        this.Z.setWriteType(2);
        BluetoothGattCharacteristic characteristic2 = this.Y.getCharacteristic(this.W);
        this.f16040a0 = characteristic2;
        if (characteristic2 == null) {
            ZLogger.w("not found DFU_DATA_UUID: " + this.W.toString());
            return;
        }
        if (this.TDBG) {
            ZLogger.d("find DFU_DATA_UUID: " + this.W.toString());
        }
        this.f16040a0.setWriteType(1);
    }

    public int d(BluetoothGatt bluetoothGatt) {
        UUID uuid = g.f16050a;
        BluetoothGattService service = bluetoothGatt.getService(uuid);
        if (service == null) {
            if (!this.DBG) {
                return DfuException.ERROR_NO_SERVICE_FOUND_OR_LOSS;
            }
            ZLogger.d("DEVICE_INFORMATION_SERVICE not found:" + uuid);
            return DfuException.ERROR_NO_SERVICE_FOUND_OR_LOSS;
        }
        if (this.TDBG) {
            ZLogger.v("find DEVICE_INFORMATION_SERVICE: " + uuid.toString());
        }
        UUID uuid2 = g.f16054e;
        BluetoothGattCharacteristic characteristic = service.getCharacteristic(uuid2);
        this.f16041b0 = characteristic;
        if (characteristic == null) {
            ZLogger.d(this.VDBG, "DIS_PNP_ID_CHARACTERISTIC not found:" + uuid2);
            return DfuException.ERROR_NO_CHARACTERISTIC_FOUND_OR_LOSS;
        }
        if (!this.TDBG) {
            return 0;
        }
        ZLogger.d("find DIS_PNP_ID_CHARACTERISTIC: " + uuid2.toString());
        return 0;
    }

    public int e(String str) {
        int connectionTransport = getDfuConfig().getGattConfig().getConnectionTransport();
        int retransConnectTimes = getDfuConfig().getRetransConnectTimes();
        int i8 = 0;
        while (a()) {
            int a8 = a(str, connectionTransport);
            if (a8 == 0) {
                return 0;
            }
            if ((a8 & (-2049)) != 133) {
                b(this.I);
            } else {
                ZLogger.w(this.DBG, "connect fail with GATT_ERROR, do not need disconnect");
            }
            a(this.I);
            sleepInner(1600L);
            i8++;
            ZLogger.d(this.VDBG, "tryConnectTime=" + i8);
            if (i8 >= retransConnectTimes) {
                return a8;
            }
        }
        return 4128;
    }

    @Override // com.realsil.sdk.dfu.m.d, com.realsil.sdk.dfu.k.b, com.realsil.sdk.dfu.internal.base.BaseDfuTask
    public void initialize() {
        super.initialize();
        z();
        this.initialized = true;
    }

    public int w() {
        if (this.Y == null) {
            ZLogger.w(this.DBG, "DFU_SERVICE not found:" + this.V.toString());
            throw new OtaException("load dfu service failed", DfuException.ERROR_NO_SERVICE_FOUND_OR_LOSS);
        }
        if (this.Z == null) {
            ZLogger.w(this.DBG, "not found DFU_CONTROL_POINT_UUID : " + this.X.toString());
            throw new OtaException("load dfu service failed", DfuException.ERROR_NO_CHARACTERISTIC_FOUND_OR_LOSS);
        }
        if (this.f16040a0 == null) {
            ZLogger.w(this.DBG, "not found DFU_DATA_UUID :" + this.W.toString());
            throw new OtaException("load dfu service failed", DfuException.ERROR_NO_CHARACTERISTIC_FOUND_OR_LOSS);
        }
        if (!this.TDBG) {
            return 0;
        }
        ZLogger.v("find DFU_CONTROL_POINT_UUID: " + this.X.toString());
        ZLogger.v("find DFU_DATA_UUID: " + this.W.toString());
        return 0;
    }

    public int x() {
        if (this.R == null) {
            ZLogger.w("OTA SERVICE not found:" + this.Q.toString());
            return DfuException.ERROR_NO_SERVICE_FOUND_OR_LOSS;
        }
        if (this.S != null) {
            return 0;
        }
        ZLogger.w("not found OTA_CONTROL_ENTER_OTA_MODE_CHARACTERISTIC : " + com.realsil.sdk.dfu.n.h.f16232a.toString());
        return DfuException.ERROR_NO_CHARACTERISTIC_FOUND_OR_LOSS;
    }

    public boolean y() {
        int i8 = this.mImageUpdateOffset;
        boolean z7 = i8 == -1 || i8 == getDfuProgressInfo().getBytesSent();
        if (this.VDBG) {
            ZLogger.v(String.format(Locale.US, "checkUpdateOffsetAlignment(%b), imageUpdateOffset=%d, localOffset=%d", Boolean.valueOf(z7), Integer.valueOf(this.mImageUpdateOffset), Integer.valueOf(getDfuProgressInfo().getBytesSent())));
        }
        return z7;
    }

    public void z() {
        try {
            this.Q = UUID.fromString(getDfuConfig().getGattConfig().getOtaServiceUuid());
            this.V = UUID.fromString(getDfuConfig().getGattConfig().getDfuServiceUuid());
            this.W = UUID.fromString(getDfuConfig().getGattConfig().getDfuDataUuid());
            this.X = UUID.fromString(getDfuConfig().getGattConfig().getDfuControlPointUuid());
        } catch (Exception e8) {
            ZLogger.w(e8.toString());
        }
    }

    public j a(byte b8, byte[] bArr) {
        return a(b8, bArr, getDfuConfig().getNotificationTimeout());
    }

    public j a(byte b8, byte[] bArr, long j8) {
        ZLogger.v(this.VDBG, String.format("<< sendControlCommandWithResponse(0x%02X)", Byte.valueOf(b8)));
        this.f16042c0 = b8;
        a(this.Z, bArr, false);
        j b9 = b(j8);
        this.f16042c0 = (byte) -1;
        return b9;
    }

    public boolean b(byte[] bArr) {
        boolean z7;
        if (this.mAborted) {
            throw new OtaException("user aborted", 4128);
        }
        if (this.S == null) {
            return false;
        }
        notifyStateChanged(518);
        ZLogger.d(this.DBG, "<< enable device to enter OTA mode");
        try {
            z7 = a(this.S, bArr, false);
        } catch (DfuException e8) {
            boolean z8 = e8.getErrCode() != 267;
            ZLogger.d("<< enter ota mode failed, ignore it: " + e8.getMessage());
            this.mErrorState = 0;
            z7 = z8;
        }
        sleepInner(1000L);
        if (z7 && getDfuConfig().isWaitDisconnectWhenEnterOtaMode()) {
            waitUntilDisconnected();
        }
        a(this.I);
        return z7;
    }

    public void c(String str) {
        if (this.mAborted) {
            throw new OtaException("user aborted", 4128);
        }
        notifyStateChanged(520);
        int e8 = e(str);
        if (e8 == 0) {
            return;
        }
        if (e8 != 4128) {
            throw new OtaException("connectOtaRemoteDevice failed", e8);
        }
        throw new OtaException("aborted, connectRemoteDevice failed", e8);
    }

    public void d(String str) {
        if (this.mAborted) {
            throw new OtaException("user aborted", 4128);
        }
        notifyStateChanged(516);
        int e8 = e(str);
        if (e8 == 0) {
            return;
        }
        if (e8 == 4128) {
            throw new OtaException("aborted, connectRemoteDevice failed", e8);
        }
        ScannerParams q8 = q();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new CompatScanFilter.Builder().setDeviceAddress(str).build());
        q8.setScanFilters(arrayList);
        q8.setAddressFilter(str);
        a(q8);
        if (this.mAborted) {
            throw new OtaException("user aborted", 4128);
        }
        int e9 = e(str);
        if (e9 == 0) {
            return;
        }
        if (e9 != 4128) {
            throw new OtaException("connectRemoteDevice failed", e9);
        }
        throw new OtaException("aborted, connectRemoteDevice failed", e9);
    }

    public boolean e(BluetoothGatt bluetoothGatt) {
        BluetoothGattService service = bluetoothGatt.getService(this.Q);
        this.R = service;
        if (service == null) {
            ZLogger.w("OTA_SERVICE not found: " + this.Q.toString());
            return false;
        }
        if (this.TDBG) {
            ZLogger.d("find OTA_SERVICE: " + this.Q.toString());
        }
        BluetoothGattService bluetoothGattService = this.R;
        UUID uuid = com.realsil.sdk.dfu.r.h.f16277a;
        BluetoothGattCharacteristic characteristic = bluetoothGattService.getCharacteristic(uuid);
        this.S = characteristic;
        if (characteristic == null) {
            ZLogger.d(this.DBG, "OTA_CONTROL_ENTER_OTA_MODE_CHARACTERISTIC not found: " + uuid);
        } else {
            if (this.TDBG) {
                ZLogger.v("find OTA_CONTROL_ENTER_OTA_MODE_CHARACTERISTIC = " + uuid);
            }
            this.S.setWriteType(1);
        }
        BluetoothGattService bluetoothGattService2 = this.R;
        UUID uuid2 = com.realsil.sdk.dfu.r.h.f16278b;
        BluetoothGattCharacteristic characteristic2 = bluetoothGattService2.getCharacteristic(uuid2);
        this.U = characteristic2;
        if (characteristic2 == null) {
            ZLogger.d(this.DBG, "OTA_MAC_ADDR_CHARACTERISTIC_UUID not found:" + uuid2);
        } else if (this.TDBG) {
            ZLogger.v("find OTA_MAC_ADDR_CHARACTERISTIC_UUID = " + uuid2);
        }
        BluetoothGattService bluetoothGattService3 = this.R;
        UUID uuid3 = com.realsil.sdk.dfu.r.h.f16283g;
        BluetoothGattCharacteristic characteristic3 = bluetoothGattService3.getCharacteristic(uuid3);
        this.T = characteristic3;
        if (characteristic3 == null) {
            ZLogger.d(this.DBG, "OTA_DEVICE_INFO_CHARACTERISTIC_UUID not found:" + uuid3);
        } else if (this.TDBG) {
            ZLogger.v("find OTA_DEVICE_INFO_CHARACTERISTIC_UUID: " + uuid3);
        }
        return true;
    }

    public void a(byte b8) {
        if (this.mAborted) {
            throw new OtaException("user aborted", 4128);
        }
        byte[] bArr = new byte[8];
        ConnectionParameters connectionParameters = getDfuConfig().getConnectionParameters();
        if (connectionParameters != null) {
            bArr[0] = (byte) (connectionParameters.getMinInterval() & 255);
            bArr[1] = (byte) ((connectionParameters.getMinInterval() >> 8) & 255);
            bArr[2] = (byte) (connectionParameters.getMaxInterval() & 255);
            bArr[3] = (byte) ((connectionParameters.getMaxInterval() >> 8) & 255);
            bArr[4] = (byte) (connectionParameters.getLatency() & 255);
            bArr[5] = (byte) ((connectionParameters.getLatency() >> 8) & 255);
            bArr[6] = (byte) (connectionParameters.getTimeout() & 255);
            bArr[7] = (byte) ((connectionParameters.getTimeout() >> 8) & 255);
        }
        c a8 = new c.b().a(b8).a(bArr).a();
        a(this.Z, a8.a(), false);
        ZLogger.d(this.DBG, a8.toString());
        try {
            ZLogger.v(this.VDBG, "... waiting updateConnectionParameters response");
            t();
        } catch (DfuException e8) {
            ZLogger.w("ignore connection parameters update exception: " + e8.getMessage());
            this.mErrorState = 0;
        }
    }

    public void a(int i8, int i9) {
        n a8 = new n.b(getOtaDeviceInfo().specVersion).a(i8).b(i9).a();
        if (this.VDBG) {
            ZLogger.v(a8.toString());
        }
        a(this.Z, a8.a(), false);
    }

    public void a(j jVar) {
        synchronized (this.f15965o) {
            try {
                if (this.f16042c0 == 7) {
                    this.J = jVar;
                    this.L = true;
                    this.f15965o.notifyAll();
                } else {
                    ZLogger.v(this.VDBG, "ignore connection parameters notification");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean a(BaseBinInputStream baseBinInputStream, int i8, int i9) {
        ZLogger.v(this.DBG, String.format(Locale.US, "nextBinSize=%d, mBytesSentBuffer=%d, bufferSize=%d", Integer.valueOf(baseBinInputStream.remainSizeInBytes()), Integer.valueOf(i8), Integer.valueOf(i9)));
        return baseBinInputStream.remainSizeInBytes() + i8 > i9;
    }
}
