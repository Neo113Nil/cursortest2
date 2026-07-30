package com.realsil.sdk.dfu.m;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.baidu.ar.auth.FeatureCodes;
import com.google.android.exoplayer2.C;
import com.realsil.sdk.core.bluetooth.BluetoothProfileManager;
import com.realsil.sdk.core.bluetooth.GlobalGatt;
import com.realsil.sdk.core.bluetooth.compat.BluetoothGattCompat;
import com.realsil.sdk.core.bluetooth.scanner.ExtendedBluetoothDevice;
import com.realsil.sdk.core.bluetooth.scanner.LeScannerPresenter;
import com.realsil.sdk.core.bluetooth.scanner.ScannerCallback;
import com.realsil.sdk.core.bluetooth.scanner.ScannerParams;
import com.realsil.sdk.core.bluetooth.scanner.SpecScanRecord;
import com.realsil.sdk.core.bluetooth.scanner.compat.CompatScanFilter;
import com.realsil.sdk.core.bluetooth.utils.BluetoothHelper;
import com.realsil.sdk.core.logger.ZLogger;
import com.realsil.sdk.core.utility.DataConverter;
import com.realsil.sdk.dfu.DfuException;
import com.realsil.sdk.dfu.exception.OtaException;
import com.realsil.sdk.dfu.gatt.GattConfig;
import com.realsil.sdk.dfu.internal.base.BaseDfuTask;
import com.realsil.sdk.dfu.internal.base.DfuThreadCallback;
import com.realsil.sdk.dfu.model.DfuConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes4.dex */
public abstract class d extends com.realsil.sdk.dfu.k.b implements o {
    public LeScannerPresenter E;
    public volatile boolean F;
    public b G;
    public GlobalGatt H;
    public BluetoothGatt I;
    public volatile j J;
    public volatile boolean K;
    public volatile boolean L;
    public volatile boolean M;
    public volatile boolean N;
    public final Handler O;
    public final Runnable P;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d dVar = d.this;
            if (dVar.mConnectionState == 513) {
                int a8 = dVar.a(dVar.mOtaDeviceAddress);
                ZLogger.v(d.this.DBG, ">> mBondState: " + a8);
                d.this.o();
            }
        }
    }

    public class b extends ScannerCallback {
        public b() {
        }

        @Override // com.realsil.sdk.core.bluetooth.scanner.ScannerCallback
        public void onNewDevice(ExtendedBluetoothDevice extendedBluetoothDevice) {
            super.onNewDevice(extendedBluetoothDevice);
            if (d.this.F) {
                d.this.a(extendedBluetoothDevice);
            } else if (d.this.DBG) {
                ZLogger.d("is already stop the scan, do nothing");
            }
        }

        @Override // com.realsil.sdk.core.bluetooth.scanner.ScannerCallback
        public void onScanStateChanged(int i8) {
            super.onScanStateChanged(i8);
            if (d.this.VDBG) {
                ZLogger.v("state= " + i8);
            }
        }

        public /* synthetic */ b(d dVar, a aVar) {
            this();
        }
    }

    public d(Context context, DfuConfig dfuConfig, DfuThreadCallback dfuThreadCallback) {
        super(context, dfuConfig, dfuThreadCallback);
        this.J = null;
        this.K = false;
        this.L = false;
        this.M = false;
        this.N = false;
        this.O = new Handler(Looper.getMainLooper());
        this.P = new a();
    }

    public void a(BluetoothGatt bluetoothGatt) {
        if (bluetoothGatt != null) {
            BluetoothDevice device = bluetoothGatt.getDevice();
            boolean isErrorActionEnabled = getDfuConfig().isErrorActionEnabled(4);
            if (this.DBG) {
                ZLogger.v(String.format("close gatt connection: %s, closeClient=%b", BluetoothHelper.formatAddress(device.getAddress(), true), Boolean.valueOf(isErrorActionEnabled)));
            }
            GlobalGatt globalGatt = this.H;
            if (globalGatt != null) {
                globalGatt.closeGatt(device.getAddress(), isErrorActionEnabled);
            } else if (isErrorActionEnabled) {
                bluetoothGatt.close();
            }
        }
        setConnectionState(1280);
    }

    @Override // com.realsil.sdk.dfu.internal.base.BaseDfuTask
    public boolean abort() {
        Handler handler = this.O;
        if (handler != null) {
            handler.removeCallbacks(this.P);
        }
        return super.abort();
    }

    public j b(long j8) {
        this.mErrorState = 0;
        this.L = true;
        try {
            synchronized (this.f15965o) {
                try {
                    if (this.mErrorState == 0 && this.J == null && this.mConnectionState == 515) {
                        this.L = false;
                        if (this.TDBG) {
                            ZLogger.v("wait for notification, wait for " + j8 + "ms");
                        }
                        this.f15965o.wait(j8);
                    }
                    if (this.mErrorState == 0 && !this.L) {
                        ZLogger.w(this.VDBG, "wait notification timeout");
                        this.mErrorState = DfuException.ERROR_NOTIFICATION_NO_RESPONSE;
                    }
                } finally {
                }
            }
        } catch (InterruptedException e8) {
            ZLogger.w(this.VDBG, "readNotificationResponse interrupted, " + e8.toString());
            this.mErrorState = 259;
        }
        if (this.mErrorState == 0) {
            return this.J;
        }
        throw new OtaException("Unable to receive notification", this.mErrorState);
    }

    public final void c(ScannerParams scannerParams) {
        if (this.G == null) {
            this.G = new b(this, null);
        }
        this.E = new LeScannerPresenter(this.mContext, scannerParams, this.G);
    }

    public void d(int i8) {
        this.f15969s = com.realsil.sdk.dfu.j.c.a(getDfuConfig().getBufferCheckConfig(), i8 - 3);
    }

    public void e(int i8) {
        sleepInner(1000L);
        ZLogger.d(this.DBG, String.format("terminateConnection, error = 0x%04X", Integer.valueOf(i8)));
        BluetoothGatt bluetoothGatt = this.I;
        if (bluetoothGatt != null) {
            b(bluetoothGatt);
            a(this.I, getDfuConfig().isErrorActionEnabled(2));
            a(this.I);
        }
    }

    @Override // com.realsil.sdk.dfu.k.b, com.realsil.sdk.dfu.internal.base.BaseDfuTask
    public void executeOtaProcedure() {
        super.executeOtaProcedure();
        this.N = getDfuConfig().getGattConfig().isGattCharacteristicCacheValueEnabled();
        if (this.TDBG) {
            ZLogger.v("gattCharacteristicCacheValueEnabled=" + this.N);
        }
    }

    @Override // com.realsil.sdk.dfu.k.b, com.realsil.sdk.dfu.internal.base.BaseDfuTask
    public void initialize() {
        super.initialize();
        this.H = GlobalGatt.getInstance();
        c((ScannerParams) null);
    }

    public boolean o() {
        if (this.I == null) {
            ZLogger.w("mBluetoothGatt == null");
            this.mErrorState = 258;
            notifyConnectionLock();
            return false;
        }
        if (this.mAborted) {
            ZLogger.w("task already aborted, ignore");
            this.mErrorState = 4128;
            return false;
        }
        if (this.VDBG) {
            ZLogger.d("Attempting to start service discovery...");
        }
        boolean discoverServices = this.I.discoverServices();
        if (!discoverServices) {
            if (this.VDBG) {
                ZLogger.w("discoverServices failed");
            }
            this.mErrorState = 258;
            notifyConnectionLock();
        }
        return discoverServices;
    }

    @Override // com.realsil.sdk.dfu.internal.base.BaseDfuTask
    public void onDestroy() {
        super.onDestroy();
        this.F = false;
        LeScannerPresenter leScannerPresenter = this.E;
        if (leScannerPresenter != null) {
            leScannerPresenter.onDestroy();
        }
    }

    public void p() {
        ScannerParams q8 = q();
        ArrayList arrayList = new ArrayList();
        arrayList.add((getOtaDeviceInfo().isFilterAdvByDeviceMacSupported() ? new CompatScanFilter.Builder().setManufacturerData(getDfuConfig().getManufacturerId(), getOtaDeviceInfo().getDeviceMac()) : new CompatScanFilter.Builder().setManufacturerData(getDfuConfig().getManufacturerId(), BaseDfuTask.convertAddress(this.mDeviceAddress))).build());
        q8.setScanFilters(arrayList);
        a(q8, 31000L);
    }

    public ScannerParams q() {
        ScannerParams scannerParams = new ScannerParams(17);
        scannerParams.setScanPeriod(31000L);
        return scannerParams;
    }

    public boolean r() {
        GattConfig gattConfig = getDfuConfig().getGattConfig();
        if (gattConfig == null) {
            return false;
        }
        return gattConfig.isRefreshCacheEnabled();
    }

    public void s() {
        setConnectionState(513);
        if (this.O == null) {
            o();
        } else {
            ZLogger.v(String.format(Locale.US, "delay to discover service for :%d ms ", Integer.valueOf(FeatureCodes.ADVANCE_BEAUTY)));
            this.O.postDelayed(this.P, 1600L);
        }
    }

    public j t() {
        return b(getDfuConfig().getNotificationTimeout());
    }

    public boolean u() {
        String str;
        boolean z7;
        String str2;
        if (!this.mAborted) {
            int phy = getDfuConfig().getGattConfig().getPhy();
            if (phy == 0) {
                z7 = this.VDBG;
                str2 = "no need to set phy";
            } else if (Build.VERSION.SDK_INT < 26) {
                z7 = this.VDBG;
                str2 = "PHY not supported";
            } else {
                if (this.I != null) {
                    ZLogger.v(this.DBG, "setPreferredPhy:" + phy);
                    if (phy != 1) {
                        if (phy == 2) {
                            this.I.setPreferredPhy(4, 4, 1);
                        } else if (phy == 3) {
                            this.I.setPreferredPhy(4, 4, 2);
                        }
                        return true;
                    }
                    this.I.setPreferredPhy(2, 2, 0);
                    return true;
                }
                str = "mBluetoothGatt == null";
            }
            ZLogger.v(z7, str2);
            return true;
        }
        str = "task already aborted, ignore";
        ZLogger.w(str);
        return false;
    }

    public boolean v() {
        this.F = false;
        LeScannerPresenter leScannerPresenter = this.E;
        if (leScannerPresenter != null) {
            return leScannerPresenter.stopScan();
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0078, code lost:
    
        if (r8.getValue()[1] == 0) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, boolean z7) {
        StringBuilder sb;
        String str;
        String str2;
        int properties = bluetoothGattCharacteristic.getProperties();
        if ((properties & 16) == 0) {
            str2 = "check properties failed: " + properties;
        } else {
            if (this.DBG) {
                sb = new StringBuilder();
                sb.append("setCharacteristicNotification() - uuid: ");
                sb.append(bluetoothGattCharacteristic.getUuid());
                str = " enabled: ";
            } else {
                sb = new StringBuilder();
                str = "setCharacteristicNotification() enabled: ";
            }
            sb.append(str);
            sb.append(z7);
            ZLogger.v(sb.toString());
            if (!bluetoothGatt.setCharacteristicNotification(bluetoothGattCharacteristic, z7)) {
                this.mErrorState = DfuException.ERROR_WRITE_CHARAC_NOTIFY_ERROR;
                throw new OtaException("setCharacteristicNotification failed", this.mErrorState);
            }
            BluetoothGattDescriptor descriptor = bluetoothGattCharacteristic.getDescriptor(o.f16092a);
            if (descriptor == null) {
                this.mErrorState = DfuException.ERROR_WRITE_CHARAC_NOTIFY_ERROR;
                throw new OtaException("no descriptor exist", this.mErrorState);
            }
            boolean z8 = descriptor.getValue() != null && descriptor.getValue().length == 2 && descriptor.getValue()[0] > 0;
            ZLogger.v(this.DBG, "current cccd state: " + z8);
            if (z7 && z8) {
                str2 = "cccd already enabled";
            } else {
                if (z7 || z8) {
                    this.mErrorState = 0;
                    this.K = false;
                    if (!(z7 ? BluetoothGattCompat.writeDescriptor(bluetoothGatt, descriptor, BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE) : BluetoothGattCompat.writeDescriptor(bluetoothGatt, descriptor, BluetoothGattDescriptor.DISABLE_NOTIFICATION_VALUE))) {
                        this.mErrorState = DfuException.ERROR_WRITE_CHARAC_NOTIFY_ERROR;
                        throw new OtaException("writeDescriptor failed", this.mErrorState);
                    }
                    synchronized (this.f15965o) {
                        try {
                            if (this.mErrorState == 0 && !this.K) {
                                try {
                                    if (this.VDBG) {
                                        ZLogger.v("wait writeDescriptor for 15000ms");
                                    }
                                    this.f15965o.wait(C.DEFAULT_SEEK_FORWARD_INCREMENT_MS);
                                } catch (InterruptedException e8) {
                                    ZLogger.d(this.DBG, "wait writeDescriptor interrupted: " + e8.toString());
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (this.mErrorState == 0 && !this.K) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(z7 ? "Enabling " : "Disabling");
                        sb2.append(" notifications failed");
                        ZLogger.w(sb2.toString());
                        this.mErrorState = DfuException.ERROR_WRITE_CHARAC_NOTIFY_ERROR;
                    }
                    if (this.mErrorState != 0) {
                        throw new OtaException("Unable to set notifications state", this.mErrorState);
                    }
                    if (this.DBG) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(z7 ? "enable" : "disable");
                        sb3.append(" notifications success");
                        ZLogger.v(sb3.toString());
                        return;
                    }
                    return;
                }
                str2 = "cccd already disable";
            }
        }
        ZLogger.w(str2);
    }

    public void b(BluetoothGatt bluetoothGatt) {
        int i8 = this.mConnectionState;
        if (i8 == 0 || i8 == 1280) {
            if (this.DBG) {
                ZLogger.d("already disconnect");
            }
        } else if (bluetoothGatt == null) {
            if (this.DBG) {
                ZLogger.v("gatt == null");
            }
            setConnectionState(0);
        } else {
            setConnectionState(1024);
            if (this.DBG) {
                ZLogger.v("disconnect()");
            }
            bluetoothGatt.disconnect();
            waitUntilDisconnected();
        }
    }

    public void a(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr, int i8, boolean z7) {
        b(bluetoothGatt, bluetoothGattCharacteristic, bArr, i8, z7);
        if (this.N) {
            return;
        }
        if (this.TDBG) {
            ZLogger.v(String.format(Locale.US, "gattCharacteristicCacheValueEnabled=%b, outBuffer=%s", Boolean.valueOf(this.N), DataConverter.bytes2Hex(bArr)));
        }
        c(bArr, i8);
    }

    public boolean b(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr, int i8, boolean z7) {
        String str;
        if (!z7 && this.mAborted) {
            throw new OtaException("user aborted", 4128);
        }
        if (bluetoothGattCharacteristic == null) {
            str = "characteristic == null";
        } else {
            if (bArr != null && i8 >= 0) {
                this.J = null;
                this.mWriteRetransFlag = true;
                boolean z8 = false;
                int i9 = 0;
                while (this.mWriteRetransFlag) {
                    this.mWriteRequestCompleted = false;
                    if (i9 > 0) {
                        if (this.VDBG) {
                            ZLogger.v("re-send command just wait a while");
                        }
                        sleepInner(1000L);
                        if (!z7 && this.mAborted) {
                            throw new OtaException("user aborted", 4128);
                        }
                    }
                    long j8 = bluetoothGattCharacteristic.getWriteType() == 2 ? 30000L : C.DEFAULT_SEEK_FORWARD_INCREMENT_MS;
                    z8 = a(bluetoothGatt, bluetoothGattCharacteristic, bArr, i8);
                    if (z8 || getDfuConfig().getGattConfig().isIgnoreWriteResult()) {
                        synchronized (this.f15960j) {
                            try {
                                try {
                                    if (!this.mWriteRequestCompleted && this.mConnectionState == 515) {
                                        this.f15960j.wait(j8);
                                    } else if (this.TDBG) {
                                        ZLogger.v("writePacket success");
                                    }
                                } catch (InterruptedException e8) {
                                    ZLogger.w(this.DBG, "mWriteLock Sleeping interrupted,e:" + e8);
                                    if (this.mErrorState == 0) {
                                        this.mErrorState = 259;
                                    }
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        if (this.mErrorState == 0 && !this.mWriteRequestCompleted) {
                            ZLogger.w("send command but no callback");
                            this.mErrorState = 261;
                        }
                    } else {
                        ZLogger.w("writePacket failed");
                        this.mErrorState = DfuException.ERROR_WRITE_CHARAC_ERROR;
                        z8 = false;
                    }
                    if (this.mErrorState != 0 || i9 <= 3) {
                        i9++;
                    } else {
                        ZLogger.w("send command reach max try time");
                        this.mErrorState = DfuException.ERROR_SEND_COMMAND_REACH_MAX_RETRY_TIMES;
                    }
                    if (this.mErrorState != 0) {
                        throw new OtaException("Error while send command", this.mErrorState);
                    }
                }
                return z8;
            }
            str = "value == null || size < 0";
        }
        ZLogger.w(str);
        return false;
    }

    public final void a(BluetoothGatt bluetoothGatt, boolean z7) {
        if (z7 || bluetoothGatt.getDevice().getBondState() == 10) {
            BluetoothGattCompat.refresh(bluetoothGatt);
        }
    }

    @Override // com.realsil.sdk.dfu.k.b
    public boolean b(ScannerParams scannerParams) {
        if (this.VDBG) {
            ZLogger.v("start le scan");
        }
        this.F = true;
        LeScannerPresenter leScannerPresenter = this.E;
        if (leScannerPresenter == null) {
            c(scannerParams);
        } else {
            leScannerPresenter.setScannerParams(scannerParams);
        }
        return this.E.startScan();
    }

    public void a(ExtendedBluetoothDevice extendedBluetoothDevice) {
        BluetoothDevice device = extendedBluetoothDevice.getDevice();
        SpecScanRecord parseFromBytes = SpecScanRecord.parseFromBytes(extendedBluetoothDevice.getScanRecord());
        if (this.mProcessState == 519) {
            if (parseFromBytes == null) {
                ZLogger.d(this.DBG, "ignore , specScanRecord is null");
                return;
            }
            if (this.VDBG) {
                ZLogger.v(parseFromBytes.toString());
            }
            byte[] manufacturerSpecificData = parseFromBytes.getManufacturerSpecificData(getDfuConfig().getManufacturerId());
            if (manufacturerSpecificData == null) {
                ZLogger.d(this.DBG, "no match manufacture data found");
                return;
            }
            if (this.DBG) {
                ZLogger.v("manufacturerSpecificData=" + DataConverter.bytes2Hex(manufacturerSpecificData));
            }
            if (getOtaDeviceInfo().isFilterAdvByDeviceMacSupported()) {
                if (this.VDBG) {
                    ZLogger.v("deviceMac= " + DataConverter.bytes2Hex(getOtaDeviceInfo().getDeviceMac()));
                }
                if (!Arrays.equals(manufacturerSpecificData, getOtaDeviceInfo().getDeviceMac())) {
                    return;
                }
            } else {
                String formatAddressPositive = BluetoothHelper.formatAddressPositive(manufacturerSpecificData);
                if (this.VDBG) {
                    ZLogger.v("manufacturerAddr= " + BluetoothHelper.formatAddress(formatAddressPositive, true) + ", mDeviceAddress= " + BluetoothHelper.formatAddress(this.mDeviceAddress, true));
                }
                if (formatAddressPositive == null || !formatAddressPositive.equals(this.mDeviceAddress)) {
                    return;
                }
            }
        } else {
            if (this.mProcessState != 515) {
                ZLogger.v("ignore process state: " + this.mProcessState);
                return;
            }
            String str = this.mDeviceAddress;
            if (str == null || !str.equals(device.getAddress())) {
                return;
            }
        }
        this.mOtaDeviceName = extendedBluetoothDevice.getName();
        this.mOtaDeviceAddress = device.getAddress();
        if (this.DBG) {
            ZLogger.d("find target device: name=" + this.mOtaDeviceName + " addr=" + this.mOtaDeviceAddress);
        }
        v();
        synchronized (this.B) {
            this.C = true;
            this.B.notifyAll();
        }
    }

    public void a(ScannerParams scannerParams, long j8) {
        if (this.mAborted) {
            throw new OtaException("user aborted", 4128);
        }
        notifyStateChanged(519);
        this.mErrorState = 0;
        this.C = false;
        b(scannerParams);
        try {
            synchronized (this.B) {
                try {
                    if (this.mErrorState == 0 && !this.C) {
                        this.B.wait(j8);
                    }
                } finally {
                }
            }
        } catch (InterruptedException e8) {
            ZLogger.w("scanLeDevice interrupted, e = " + e8.toString());
            this.mErrorState = 259;
        }
        if (this.mErrorState == 0 && !this.C) {
            ZLogger.w("didn't find the special device");
            this.mErrorState = DfuException.ERROR_CANNOT_FIND_DEVICE;
        }
        if (this.mErrorState != 0) {
            throw new OtaException("Error while scan remote ota device", this.mErrorState);
        }
    }

    public boolean a(BluetoothDevice bluetoothDevice) {
        return bluetoothDevice != null && BluetoothProfileManager.getInstance().getConnectionState(4, bluetoothDevice) == 2;
    }

    public boolean a(BluetoothGatt bluetoothGatt, int i8) {
        this.mErrorState = 0;
        this.M = false;
        if (this.DBG) {
            ZLogger.d("requestMtu: " + i8);
        }
        if (!bluetoothGatt.requestMtu(i8)) {
            ZLogger.w("requestMtu failed");
            return false;
        }
        try {
            synchronized (this.f15965o) {
                try {
                    if (!this.M && this.mErrorState == 0) {
                        if (this.TDBG) {
                            ZLogger.v("wait mtu request callback for 15000ms");
                        }
                        this.f15965o.wait(C.DEFAULT_SEEK_FORWARD_INCREMENT_MS);
                    }
                } finally {
                }
            }
        } catch (InterruptedException e8) {
            ZLogger.w(this.DBG, "requestMtu: Sleeping interrupted, e = " + e8);
        }
        if (this.M || this.mErrorState != 0) {
            return true;
        }
        if (this.VDBG) {
            ZLogger.d("requestMtu No CallBack");
        }
        return false;
    }

    public final boolean a(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr, int i8) {
        String str;
        if (bluetoothGatt == null) {
            str = "gatt == null";
        } else {
            if (bluetoothGattCharacteristic != null) {
                if (bArr.length > i8) {
                    byte[] bArr2 = new byte[i8];
                    System.arraycopy(bArr, 0, bArr2, 0, i8);
                    bArr = bArr2;
                }
                if (this.DBG) {
                    ZLogger.v(String.format(Locale.US, "[TX] WRITE_TYPE_0x%02X, (%d)%s << (%d)%s", Integer.valueOf(bluetoothGattCharacteristic.getWriteType()), Integer.valueOf(bluetoothGattCharacteristic.getInstanceId()), bluetoothGattCharacteristic.getUuid(), Integer.valueOf(bArr.length), DataConverter.bytes2Hex(bArr)));
                }
                return BluetoothGattCompat.writeCharacteristic(bluetoothGatt, bluetoothGattCharacteristic, bArr);
            }
            str = "characteristic == null";
        }
        ZLogger.w(str);
        return false;
    }

    public boolean a(BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr, boolean z7) {
        return b(this.I, bluetoothGattCharacteristic, bArr, bArr != null ? bArr.length : -1, z7);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public byte[] a(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        int i8;
        String str;
        if (this.mAborted) {
            throw new OtaException("user aborted", 4128);
        }
        if (bluetoothGatt == null) {
            str = "gatt == null";
        } else if (bluetoothGattCharacteristic == null) {
            str = "characteristic == null";
        } else if ((bluetoothGattCharacteristic.getProperties() & 2) == 0) {
            str = "characteristic not support PROPERTY_READ";
        } else {
            ZLogger.v(this.DBG, String.format(Locale.US, "readCharacteristic:(handler=%d) %s", Integer.valueOf(bluetoothGattCharacteristic.getInstanceId()), bluetoothGattCharacteristic.getUuid().toString()));
            this.mErrorState = 0;
            this.mReadRxData = null;
            this.mReadRequestCompleted = false;
            if (bluetoothGatt.readCharacteristic(bluetoothGattCharacteristic)) {
                synchronized (this.mReadLock) {
                    try {
                        if (this.mErrorState == 0 && !this.mReadRequestCompleted && this.mConnectionState == 515) {
                            this.mReadLock.wait(C.DEFAULT_SEEK_FORWARD_INCREMENT_MS);
                        }
                    } catch (InterruptedException e8) {
                        ZLogger.w("mCharacteristicReadCalledLock Sleeping interrupted,e:" + e8);
                        this.mErrorState = 259;
                    }
                }
                if (this.mErrorState == 0 && !this.mReadRequestCompleted) {
                    ZLogger.w("read value but no callback");
                    i8 = 261;
                }
                if (this.mErrorState != 0) {
                    return this.mReadRxData;
                }
                throw new OtaException("Error while send command", this.mErrorState);
            }
            ZLogger.d(this.DBG, "readCharacteristic failed");
            i8 = DfuException.ERROR_SEND_COMMAND_FAIL;
            this.mErrorState = i8;
            if (this.mErrorState != 0) {
            }
        }
        ZLogger.w(str);
        return null;
    }

    public byte[] a(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        return a(this.I, bluetoothGattCharacteristic);
    }
}
