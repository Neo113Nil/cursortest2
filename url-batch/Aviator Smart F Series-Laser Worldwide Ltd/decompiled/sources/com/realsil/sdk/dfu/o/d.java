package com.realsil.sdk.dfu.o;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import com.google.android.exoplayer2.C;
import com.realsil.sdk.core.logger.ZLogger;
import com.realsil.sdk.dfu.DfuException;
import com.realsil.sdk.dfu.image.stream.BaseBinInputStream;
import com.realsil.sdk.dfu.internal.base.DfuThreadCallback;
import com.realsil.sdk.dfu.model.DfuConfig;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes4.dex */
public class d extends b {
    public d(Context context, DfuConfig dfuConfig, DfuThreadCallback dfuThreadCallback) {
        super(context, dfuConfig, dfuThreadCallback);
    }

    private boolean R() {
        d(this.mOtaDeviceAddress);
        w();
        if (this.otaEnvironmentPrepared) {
            l();
        } else {
            J();
        }
        if (this.mCurBinInputStream != null) {
            return true;
        }
        notifyError(4097);
        return false;
    }

    @Override // com.realsil.sdk.dfu.o.b
    public boolean I() {
        BaseBinInputStream baseBinInputStream;
        notifyStateChanged(514);
        this.mOtaDeviceAddress = this.mDeviceAddress;
        this.otaModeEnabled = true;
        boolean z7 = false;
        while (a()) {
            try {
                if (!R() || !P()) {
                    return false;
                }
                this.mBytesSentBuffer += getDfuProgressInfo().getBytesSent();
                if (getDfuProgressInfo().isLastImageFile()) {
                    ZLogger.v("no pending image file to upload.");
                    F();
                    z7 = true;
                } else {
                    ZLogger.v("has pending image file to upload");
                    if (getOtaDeviceInfo().getUpdateMechanism() == 1) {
                        this.mOtaDeviceAddress = this.mDeviceAddress;
                        this.otaModeEnabled = true;
                        this.mBytesSentBuffer = 0;
                        E();
                    } else if (getOtaDeviceInfo().getUpdateMechanism() == 3 && (baseBinInputStream = this.mNextBinInputStream) != null && a(baseBinInputStream, this.mBytesSentBuffer, getOtaDeviceInfo().otaTempBufferSize * 4096)) {
                        ZLogger.d(this.DBG, "make device to enter the ota advertiser mode, and let the app continue update image");
                        this.otaModeEnabled = true;
                        this.mBytesSentBuffer = 0;
                        b((byte) 1);
                    }
                    j();
                }
                sleepInner(1000L);
                if (z7) {
                    return z7;
                }
            } catch (DfuException e8) {
                a(e8);
                return z7;
            }
        }
        notifyError(4128, true);
        return false;
    }

    @Override // com.realsil.sdk.dfu.o.b
    public boolean P() {
        if (!C()) {
            return false;
        }
        if (getOtaDeviceInfo().isBufferCheckEnabled()) {
            this.f15967q = G();
        } else {
            this.f15967q = 0;
        }
        if (this.VDBG) {
            ZLogger.v("mRemoteOtaFunctionInfo=" + this.f15967q);
        }
        getDfuProgressInfo().start();
        f(10131);
        g(getDfuProgressInfo().getCurImageId());
        A();
        if (this.mImageUpdateOffset == 0) {
            O();
        }
        if (this.mImageUpdateOffset - 12 >= getDfuProgressInfo().getImageSizeInBytes()) {
            ZLogger.v(this.VDBG, "Last send reach the bottom");
        } else {
            h(getDfuProgressInfo().getCurImageId());
            if (this.f15967q == 1) {
                b(this.I, this.f16040a0, this.mCurBinInputStream);
            } else {
                a(this.I, this.f16040a0, this.mCurBinInputStream);
            }
        }
        getDfuProgressInfo().sendOver();
        i(getDfuProgressInfo().getCurImageId());
        return true;
    }

    @Override // com.realsil.sdk.dfu.internal.base.BaseDfuTask
    public boolean activeImage(boolean z7) {
        if (!super.activeImage(z7)) {
            return false;
        }
        if (this.mConnectionState != 515) {
            if (this.DBG) {
                ZLogger.d("start to re-connect the RCU which going to active image, current state is: " + this.mConnectionState);
            }
            int e8 = e(this.mOtaDeviceAddress);
            if (e8 != 0) {
                ZLogger.e("Something error in OTA process, errorCode: " + e8 + "mProcessState" + this.mProcessState);
                notifyError(e8, true);
                return false;
            }
        }
        if (z7) {
            try {
                E();
                notifyStateChanged(258);
            } catch (DfuException e9) {
                ZLogger.w(e9.toString());
                notifyError(e9.getErrCode());
            }
        } else {
            N();
            notifyError(DfuException.ERROR_USER_NOT_ACTIVE_IMAGE_ERROR, false);
        }
        return true;
    }

    @Override // com.realsil.sdk.dfu.o.b, com.realsil.sdk.dfu.m.d, com.realsil.sdk.dfu.k.b, com.realsil.sdk.dfu.internal.base.BaseDfuTask
    public /* bridge */ /* synthetic */ void executeOtaProcedure() {
        super.executeOtaProcedure();
    }

    @Override // com.realsil.sdk.dfu.internal.base.BaseDfuTask
    public void j() {
        BluetoothDevice bluetoothDevice;
        if (!getDfuConfig().isHid()) {
            ZLogger.v("wait back connect");
            super.j();
            return;
        }
        if (this.mOtaDeviceAddress == null) {
            ZLogger.v("invalid mOtaDeviceAddress, wait back connect");
            super.j();
            return;
        }
        Set<BluetoothDevice> bondedDevices = this.A.getBondedDevices();
        if (bondedDevices != null && bondedDevices.size() > 0) {
            Iterator<BluetoothDevice> it = bondedDevices.iterator();
            while (it.hasNext()) {
                bluetoothDevice = it.next();
                if (bluetoothDevice != null && this.mOtaDeviceAddress.equals(bluetoothDevice.getAddress())) {
                    break;
                }
            }
        }
        bluetoothDevice = null;
        if (bluetoothDevice == null) {
            ZLogger.v(this.VDBG, "device not paired, wait back connect");
            super.j();
        } else {
            if (!a(bluetoothDevice)) {
                ZLogger.v(this.VDBG, "wait hid device back connect");
                a(C.DEFAULT_SEEK_FORWARD_INCREMENT_MS);
                return;
            }
            ZLogger.v(this.VDBG, "HID device already connected:" + bluetoothDevice.getAddress());
            super.j();
        }
    }

    @Override // com.realsil.sdk.dfu.o.b, com.realsil.sdk.dfu.internal.base.BaseDfuTask
    public /* bridge */ /* synthetic */ void notifyError(int i8, boolean z7) {
        super.notifyError(i8, z7);
    }
}
