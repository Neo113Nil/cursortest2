package com.realsil.sdk.dfu.u;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import com.google.android.exoplayer2.C;
import com.realsil.sdk.bbpro.core.peripheral.BluetoothSppPeripheral;
import com.realsil.sdk.bbpro.core.peripheral.Peripheral;
import com.realsil.sdk.bbpro.core.peripheral.PeripheralCallback;
import com.realsil.sdk.bbpro.core.peripheral.PeripheralManager;
import com.realsil.sdk.bbpro.core.spp.SppTransportConnParams;
import com.realsil.sdk.bbpro.core.transportlayer.AckPacket;
import com.realsil.sdk.bbpro.core.transportlayer.Command;
import com.realsil.sdk.bbpro.core.transportlayer.TransportLayerPacket;
import com.realsil.sdk.core.bluetooth.BluetoothProfileManager;
import com.realsil.sdk.core.bluetooth.scanner.BrEdrScannerPresenter;
import com.realsil.sdk.core.bluetooth.scanner.ExtendedBluetoothDevice;
import com.realsil.sdk.core.bluetooth.scanner.ScannerCallback;
import com.realsil.sdk.core.bluetooth.scanner.ScannerParams;
import com.realsil.sdk.core.bluetooth.utils.BluetoothHelper;
import com.realsil.sdk.core.logger.ZLogger;
import com.realsil.sdk.dfu.DfuException;
import com.realsil.sdk.dfu.exception.LoadFileException;
import com.realsil.sdk.dfu.exception.OtaException;
import com.realsil.sdk.dfu.image.FirmwareLoaderX;
import com.realsil.sdk.dfu.image.LoadParams;
import com.realsil.sdk.dfu.image.stream.BaseBinInputStream;
import com.realsil.sdk.dfu.internal.base.DfuThreadCallback;
import com.realsil.sdk.dfu.model.DfuConfig;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* loaded from: classes4.dex */
public abstract class c extends com.realsil.sdk.dfu.k.b {
    public BrEdrScannerPresenter E;
    public volatile boolean F;
    public b G;
    public volatile byte[] H;
    public volatile boolean I;
    public Set J;
    public Map K;
    public BluetoothSppPeripheral L;
    public PeripheralCallback M;

    public class a extends PeripheralCallback {
        public a() {
        }

        public void onAckReceive(Peripheral peripheral, AckPacket ackPacket) {
            super.onAckReceive(peripheral, ackPacket);
            c.this.a(ackPacket);
        }

        public void onConnectionStateChanged(Peripheral peripheral, int i8) {
            super.onConnectionStateChanged(peripheral, i8);
            ZLogger.v(c.this.VDBG, String.format("onConnectionStateChanged: newsTATE=0x%04X", Integer.valueOf(i8)));
            if (i8 == 2) {
                c.this.setConnectionState(515);
            } else {
                if (i8 != 0) {
                    return;
                }
                if (c.this.mProcessState == 521) {
                    c.this.mErrorState = 2048;
                    if (c.this.DBG) {
                        ZLogger.d("disconnect in OTA process, mErrorState: " + c.this.mErrorState);
                    }
                }
                c.this.setConnectionState(0);
                synchronized (c.this.mReadLock) {
                    c.this.mReadRequestCompleted = false;
                    c.this.mReadLock.notifyAll();
                }
            }
            c.this.notifyConnectionLock();
            c.this.h();
        }

        public void onDataReceive(Peripheral peripheral, TransportLayerPacket transportLayerPacket) {
            super.onDataReceive(peripheral, transportLayerPacket);
            c.this.a(transportLayerPacket);
        }
    }

    public class b extends ScannerCallback {
        public b() {
        }

        @Override // com.realsil.sdk.core.bluetooth.scanner.ScannerCallback
        public void onNewDevice(ExtendedBluetoothDevice extendedBluetoothDevice) {
            super.onNewDevice(extendedBluetoothDevice);
            if (!c.this.F) {
                if (c.this.DBG) {
                    ZLogger.d("is already stop the scan, do nothing");
                }
            } else if (extendedBluetoothDevice != null) {
                c.this.a(extendedBluetoothDevice);
            } else if (c.this.DBG) {
                ZLogger.d("ignore, device == null");
            }
        }

        @Override // com.realsil.sdk.core.bluetooth.scanner.ScannerCallback
        public void onScanStateChanged(int i8) {
            super.onScanStateChanged(i8);
            if (c.this.VDBG) {
                ZLogger.v("state= " + i8);
            }
        }
    }

    public c(Context context, DfuConfig dfuConfig, DfuThreadCallback dfuThreadCallback) {
        super(context, dfuConfig, dfuThreadCallback);
        this.H = null;
        this.I = false;
        this.M = new a();
    }

    public int a(String str, int i8) {
        int i9 = 0;
        while (a()) {
            int c8 = c(str);
            if (c8 == 0) {
                return 0;
            }
            if ((c8 & (-2049)) != 133) {
                p();
            } else {
                ZLogger.w(this.DBG, "connect fail with GATT_ERROR, do not need disconnect");
            }
            setConnectionState(1280);
            sleepInner(1600L);
            i9++;
            if (i9 > i8) {
                return c8;
            }
        }
        return 4128;
    }

    public abstract void a(AckPacket ackPacket);

    public abstract void a(TransportLayerPacket transportLayerPacket);

    public abstract void a(boolean z7);

    public void b(boolean z7) {
        int i8;
        if (this.VDBG) {
            ZLogger.d("terminateConnection");
        }
        if (z7 && (i8 = this.mConnectionState) != 0 && i8 != 1280) {
            p();
        }
        BluetoothSppPeripheral bluetoothSppPeripheral = this.L;
        if (bluetoothSppPeripheral != null) {
            bluetoothSppPeripheral.unregisterPeripheralCallback(this.M);
        }
        setConnectionState(1280);
    }

    public int c(String str) {
        if (b(str) == null) {
            return 4112;
        }
        setConnectionState(256);
        this.mErrorState = 0;
        this.isConnectedCallbackCome = false;
        d(str);
        if (this.L == null) {
            return 4112;
        }
        ZLogger.v(this.DBG, "connecting to " + BluetoothHelper.formatAddress(str, true));
        if (this.L.startConnect(new SppTransportConnParams.Builder(str).uuid(getDfuConfig().getSppConfig().getUuid().getUuid()).transport(getDfuConfig().getSppConfig().getTransport()).build()) != 0) {
            this.mErrorState = DfuException.ERROR_CONNECT_ERROR;
            return this.mErrorState;
        }
        try {
            synchronized (this.mConnectionLock) {
                try {
                    if (!this.isConnectedCallbackCome && this.mErrorState == 0) {
                        ZLogger.d(this.DBG, "wait for connect for " + getDfuConfig().getConnectionTimeout() + " ms");
                        this.mConnectionLock.wait(getDfuConfig().getConnectionTimeout());
                    }
                } finally {
                }
            }
        } catch (InterruptedException e8) {
            ZLogger.w("Sleeping interrupted : " + e8.toString());
            this.mErrorState = 259;
        }
        if (this.mErrorState == 0) {
            if (!this.isConnectedCallbackCome) {
                ZLogger.w("wait connect callback timeout");
                this.mErrorState = 260;
            } else if (this.mConnectionState != 515) {
                ZLogger.w("connect with some error, mConnectionState" + this.mConnectionState);
                this.mErrorState = DfuException.ERROR_CONNECT_ERROR;
            }
        }
        if (this.mErrorState == 0) {
            ZLogger.v(this.VDBG, "connected the device which going to upgrade");
        } else if (this.mConnectionState == 256) {
            setConnectionState(0);
        }
        return this.mErrorState;
    }

    public BluetoothSppPeripheral d(String str) {
        BluetoothSppPeripheral registerPeripheral = PeripheralManager.getInstance().registerPeripheral(this.mContext, 1, str, this.M);
        this.L = registerPeripheral;
        return registerPeripheral;
    }

    public void e(int i8) {
        synchronized (this.f15960j) {
            this.mWriteRetransFlag = false;
            this.mWriteRequestStatus = i8;
            this.mWriteRequestCompleted = true;
            this.f15960j.notifyAll();
        }
    }

    public void f(int i8) {
        if (this.mImageUpdateOffset == 0 && e()) {
            this.mImageUpdateOffset = 12;
            ZLogger.v("reset imageUpdateOffset to " + this.mImageUpdateOffset);
        }
        if (o()) {
            return;
        }
        ZLogger.v(this.VDBG, "reload image bin file");
        this.imageFileLoaded = false;
        m();
        alignmentSendBytes(this.mImageUpdateOffset, false);
    }

    @Override // com.realsil.sdk.dfu.k.b, com.realsil.sdk.dfu.internal.base.BaseDfuTask
    public void initialize() {
        super.initialize();
        this.J = new HashSet();
        this.K = new HashMap();
        c((ScannerParams) null);
        this.initialized = true;
        ZLogger.v("initialize success");
    }

    @Override // com.realsil.sdk.dfu.k.b
    public void l() {
        int maxFileCount = getDfuProgressInfo().getMaxFileCount();
        int pendingUpdateImageFileIndex = getDfuProgressInfo().getPendingUpdateImageFileIndex();
        BaseBinInputStream baseBinInputStream = this.pendingImageInputStreams.get(pendingUpdateImageFileIndex);
        this.mCurBinInputStream = baseBinInputStream;
        if (baseBinInputStream != null) {
            getDfuProgressInfo().initialize(this.mCurBinInputStream, getDfuConfig().isThroughputEnabled());
        }
        int i8 = pendingUpdateImageFileIndex + 1;
        if (i8 < maxFileCount) {
            this.mNextBinInputStream = this.pendingImageInputStreams.get(i8);
            this.mNextBinIndex = i8;
        } else {
            this.mNextBinInputStream = null;
            this.mNextBinIndex = -1;
        }
    }

    @Override // com.realsil.sdk.dfu.k.b
    public void m() {
        closeInputStream(this.mCurBinInputStream);
        List<BaseBinInputStream> loadImageFile = FirmwareLoaderX.loadImageFile(new LoadParams.Builder().preferredIcType(getDfuConfig().getPrimaryIcType()).binParameters(getDfuConfig().getBinParameters()).with(this.mContext).setWorkMode(this.mOtaWorkMode).vpId(getDfuConfig().getVpId()).setOtaDeviceInfo(getOtaDeviceInfo()).setIcCheckEnabled(getDfuConfig().isIcCheckEnabled()).setSectionSizeCheckEnabled(getDfuConfig().isSectionSizeCheckEnabled()).versionCheckEnabled(getDfuConfig().isVersionCheckEnabled(), getDfuConfig().getVersionCheckMode()).build());
        this.pendingImageInputStreams = loadImageFile;
        if (loadImageFile == null || loadImageFile.size() <= 0) {
            ZLogger.v(this.VDBG, "pendingImageInputStreams == null || pendingImageInputStreams.size() <= 0");
            throw new LoadFileException("no available file to update", LoadFileException.ERROR_NO_AVAILABLE_FILE_TO_UPDATE);
        }
        if (getDfuProgressInfo().getNextFileIndex() == 0) {
            this.D = new int[this.pendingImageInputStreams.size()];
        }
        getDfuProgressInfo().setUpdateContent(this.pendingImageInputStreams);
        if (this.DBG) {
            ZLogger.v(getDfuProgressInfo().toString());
        }
        l();
        this.imageFileLoaded = true;
    }

    @Override // com.realsil.sdk.dfu.internal.base.BaseDfuTask
    public void notifyError(int i8, boolean z7) {
        if (this.mAborted) {
            i8 = 4128;
        }
        if (this.DBG) {
            ZLogger.v(String.format("error = 0x%04X, needReset=%b", Integer.valueOf(i8), Boolean.valueOf(z7)));
        }
        if (i8 != 4128) {
            notifyStateChanged(260, true);
        }
        if (z7) {
            v();
        }
        BrEdrScannerPresenter brEdrScannerPresenter = this.E;
        if (brEdrScannerPresenter != null) {
            brEdrScannerPresenter.stopScan();
        }
        if (getDfuConfig().isErrorActionEnabled(1)) {
            b(true);
        }
        closeInputStream(this.mCurBinInputStream);
        DfuThreadCallback dfuThreadCallback = this.mThreadCallback;
        if (dfuThreadCallback != null) {
            dfuThreadCallback.onError(i8);
        }
        this.mAborted = true;
    }

    public boolean o() {
        int i8 = this.mImageUpdateOffset;
        boolean z7 = i8 == -1 || i8 == getDfuProgressInfo().getBytesSent();
        if (this.VDBG) {
            ZLogger.v(String.format(Locale.US, "checkUpdateOffsetAlignment, imageUpdateOffset=0x%08X(%d), localOffset=%d", Integer.valueOf(this.mImageUpdateOffset), Integer.valueOf(this.mImageUpdateOffset), Integer.valueOf(getDfuProgressInfo().getBytesSent())));
        }
        return z7;
    }

    @Override // com.realsil.sdk.dfu.internal.base.BaseDfuTask
    public void onDestroy() {
        super.onDestroy();
        ZLogger.v(this.VDBG, "onDestroy");
        this.F = false;
        BrEdrScannerPresenter brEdrScannerPresenter = this.E;
        if (brEdrScannerPresenter != null) {
            brEdrScannerPresenter.onDestroy();
        }
        BluetoothSppPeripheral bluetoothSppPeripheral = this.L;
        if (bluetoothSppPeripheral != null) {
            bluetoothSppPeripheral.unregisterPeripheralCallback(this.M);
        }
    }

    public void p() {
        int i8 = this.mConnectionState;
        if (i8 == 0 || i8 == 1280) {
            ZLogger.d(this.DBG, "already disconnect");
            return;
        }
        BluetoothSppPeripheral bluetoothSppPeripheral = this.L;
        if (bluetoothSppPeripheral != null) {
            bluetoothSppPeripheral.disconnect();
        }
        waitUntilDisconnected();
    }

    public void q() {
        int i8;
        if (this.f15964n) {
            a(true);
            if (getDfuConfig().isCompleteActionEnabled(1)) {
                BluetoothProfileManager.getInstance().disconnectA2dpSource(this.mOtaDeviceAddress);
                BluetoothProfileManager.getInstance().disconnectHfp(this.mOtaDeviceAddress);
            }
            i8 = 258;
        } else {
            i8 = 523;
        }
        notifyStateChanged(i8);
    }

    public ScannerParams r() {
        ScannerParams scannerParams = new ScannerParams(32);
        scannerParams.setScanPeriod(31000L);
        return scannerParams;
    }

    public boolean s() {
        BluetoothSppPeripheral bluetoothSppPeripheral = this.L;
        if (bluetoothSppPeripheral == null) {
            return true;
        }
        return bluetoothSppPeripheral.isDisConnected();
    }

    public boolean t() {
        if (!a()) {
            notifyError(4128, true);
            return false;
        }
        if (getOtaDeviceInfo().isAesEncryptEnabled() && !b()) {
            notifyError(4113);
            return false;
        }
        notifyStateChanged(521);
        if (this.DBG) {
            ZLogger.d(String.format("mOtaWorkMode=0x%04X, ICType=%02X", Integer.valueOf(this.mOtaWorkMode), Integer.valueOf(getOtaDeviceInfo().icType)));
            ZLogger.v(String.format(Locale.US, "mImageUpdateOffset=0x%08X(%d)", Integer.valueOf(this.mImageUpdateOffset), Integer.valueOf(this.mImageUpdateOffset)));
        }
        if (this.VDBG) {
            ZLogger.v(getDfuProgressInfo().toString());
        }
        return true;
    }

    public byte[] u() {
        return b(getDfuConfig().getNotificationTimeout());
    }

    public abstract boolean v();

    public boolean w() {
        this.F = false;
        BrEdrScannerPresenter brEdrScannerPresenter = this.E;
        if (brEdrScannerPresenter == null) {
            return true;
        }
        brEdrScannerPresenter.stopScan();
        return true;
    }

    private void c(ScannerParams scannerParams) {
        if (this.G == null) {
            this.G = new b();
        }
        this.E = new BrEdrScannerPresenter(this.mContext, scannerParams, this.G);
    }

    public void a(ExtendedBluetoothDevice extendedBluetoothDevice) {
        BluetoothDevice device = extendedBluetoothDevice.getDevice();
        if (this.mProcessState != 515) {
            ZLogger.v("ignore process state: " + this.mProcessState);
            return;
        }
        String str = this.mDeviceAddress;
        if (str == null || !str.equals(device.getAddress())) {
            return;
        }
        this.mOtaDeviceName = extendedBluetoothDevice.getName();
        this.mOtaDeviceAddress = device.getAddress();
        if (this.DBG) {
            ZLogger.d("find target device: name=" + this.mOtaDeviceName + " addr=" + BluetoothHelper.formatAddress(this.mOtaDeviceAddress, true));
        }
        w();
        synchronized (this.B) {
            this.C = true;
            this.B.notifyAll();
        }
    }

    public boolean b(int i8, byte[] bArr) {
        return a(new Command.Builder().writeType(2).packet(i8, bArr).build(), false);
    }

    public void d(int i8) {
        this.f15969s = com.realsil.sdk.dfu.j.c.a(2, i8, 256);
    }

    @Override // com.realsil.sdk.dfu.internal.base.BaseDfuTask
    public boolean e() {
        return false;
    }

    public void a(DfuException dfuException) {
        int errCode = dfuException.getErrCode();
        if (errCode == 4128) {
            notifyError(errCode, true);
            return;
        }
        if (errCode == 4097) {
            notifyError(errCode, false);
        } else if (errCode == 287) {
            notifyError(errCode, false);
        } else {
            v();
            notifyError(errCode);
        }
    }

    @Override // com.realsil.sdk.dfu.k.b
    public boolean b(ScannerParams scannerParams) {
        if (this.DBG) {
            ZLogger.v("start le scan");
        }
        this.F = true;
        BrEdrScannerPresenter brEdrScannerPresenter = this.E;
        if (brEdrScannerPresenter == null) {
            c(scannerParams);
        } else {
            brEdrScannerPresenter.setScannerParams(scannerParams);
        }
        return this.E.startScan();
    }

    public byte[] b(long j8) {
        this.mErrorState = 0;
        this.I = true;
        try {
            synchronized (this.f15965o) {
                try {
                    if (this.mErrorState == 0 && this.H == null && this.mConnectionState == 515) {
                        this.I = false;
                        if (this.DEBUG_DEV) {
                            ZLogger.v("wait for notification for " + j8 + "ms");
                        }
                        this.f15965o.wait(j8);
                    }
                    if (this.mErrorState == 0 && !this.I) {
                        ZLogger.w(this.VDBG, "wait notification timeout");
                        this.mErrorState = DfuException.ERROR_NOTIFICATION_NO_RESPONSE;
                    }
                } finally {
                }
            }
        } catch (InterruptedException e8) {
            ZLogger.w("readNotificationResponse interrupted, " + e8.toString());
            this.mErrorState = 259;
        }
        if (this.mErrorState == 0) {
            return this.H == null ? new byte[0] : this.H;
        }
        throw new OtaException("Unable to receive notification", this.mErrorState);
    }

    public boolean a(int i8, byte[] bArr) {
        Command build = new Command.Builder().writeType(2).packet(i8, bArr).build();
        BluetoothSppPeripheral bluetoothSppPeripheral = this.L;
        return bluetoothSppPeripheral != null && bluetoothSppPeripheral.sendVendorCommand(build).code == 0;
    }

    public boolean a(int i8, byte[] bArr, boolean z7) {
        return a(new Command.Builder().writeType(2).packet(i8, bArr).build(), z7);
    }

    public final boolean a(Command command) {
        BluetoothSppPeripheral bluetoothSppPeripheral = this.L;
        if (bluetoothSppPeripheral != null) {
            return bluetoothSppPeripheral.sendVendorCommand(command).code == 0;
        }
        ZLogger.w("mTransportLayer == null");
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00c8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean a(Command command, boolean z7) {
        String format;
        if (this.mAborted && !z7) {
            throw new OtaException("user aborted", 4128);
        }
        this.H = null;
        this.mWriteRetransFlag = true;
        boolean z8 = false;
        this.mWriteRequestCompleted = false;
        boolean a8 = a(command);
        if (a8) {
            if (command.getWriteType() == 1) {
                return true;
            }
            synchronized (this.f15960j) {
                try {
                    if (!this.mWriteRequestCompleted && this.mConnectionState == 515) {
                        this.f15960j.wait(C.DEFAULT_SEEK_FORWARD_INCREMENT_MS);
                    }
                } catch (InterruptedException e8) {
                    ZLogger.w("mWriteLock Sleeping interrupted,e:" + e8);
                    if (this.mErrorState == 0) {
                        this.mErrorState = 259;
                    }
                }
            }
            if (this.VDBG) {
                ZLogger.v(String.format("errorCode=0x%04X,reqComp=%b, connState=0x%04X, retransFlag=%b", 0, Boolean.valueOf(this.mWriteRequestCompleted), Integer.valueOf(this.mConnectionState), Boolean.valueOf(this.mWriteRetransFlag)));
            }
            if (this.mErrorState == 0) {
                if (this.mWriteRequestCompleted) {
                    format = this.mWriteRequestStatus != 0 ? String.format("write failed, mWriteRequestStatus=0x%02X", Integer.valueOf(this.mWriteRequestStatus)) : "write spp data error";
                } else {
                    ZLogger.d(this.DBG, "send command but no callback");
                    this.mErrorState = 261;
                }
            }
            z8 = a8;
            if (this.mErrorState != 0) {
                return z8;
            }
            throw new OtaException("Error while send command", this.mErrorState);
        }
        ZLogger.w(format);
        this.mErrorState = DfuException.ERROR_WRITE_CHARAC_ERROR;
        if (this.mErrorState != 0) {
        }
    }

    public boolean a(BaseBinInputStream baseBinInputStream, int i8, int i9) {
        ZLogger.v(this.DBG, String.format(Locale.US, "nextBinSize=%d, mBytesSentBuffer=%d, bufferSize=%d", Integer.valueOf(baseBinInputStream.remainSizeInBytes()), Integer.valueOf(i8), Integer.valueOf(i9)));
        return baseBinInputStream.remainSizeInBytes() + i8 > i9;
    }

    public boolean a(com.realsil.sdk.dfu.k.d dVar) {
        ZLogger.v(this.VDBG, dVar.toString());
        return b(dVar.b(), dVar.a());
    }

    public byte[] a(int i8, int i9, byte[] bArr) {
        this.mErrorState = 0;
        this.mReadRxData = null;
        this.mReadRequestCompleted = false;
        this.J.add(Integer.valueOf(i9));
        if (!a(i8, bArr)) {
            return null;
        }
        synchronized (this.mReadLock) {
            try {
                if (this.mErrorState == 0 && !this.mReadRequestCompleted && this.mConnectionState == 515) {
                    this.mReadLock.wait(C.DEFAULT_SEEK_FORWARD_INCREMENT_MS);
                }
            } catch (InterruptedException e8) {
                ZLogger.w(this.DBG, "sleeping interrupted:" + e8);
                this.mErrorState = 259;
            }
        }
        if (this.mErrorState == 0 && !this.mReadRequestCompleted) {
            ZLogger.d(this.VDBG, "read value but no callback");
            this.mErrorState = 261;
        }
        if (this.mErrorState == 0) {
            return this.mReadRxData;
        }
        throw new OtaException("Error while send command", this.mErrorState);
    }
}
