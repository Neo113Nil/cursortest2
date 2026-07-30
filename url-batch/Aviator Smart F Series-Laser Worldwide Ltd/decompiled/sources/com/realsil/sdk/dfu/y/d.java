package com.realsil.sdk.dfu.y;

import android.content.Context;
import android.hardware.usb.UsbDevice;
import android.os.Build;
import com.realsil.sdk.core.bluetooth.compat.BluetoothUuidCompat;
import com.realsil.sdk.core.bluetooth.utils.BluetoothHelper;
import com.realsil.sdk.core.logger.ZLogger;
import com.realsil.sdk.core.usb.UsbGatt;
import com.realsil.sdk.core.usb.UsbGattCallback;
import com.realsil.sdk.core.usb.UsbGattCharacteristic;
import com.realsil.sdk.core.utility.ByteArrayConverter;
import com.realsil.sdk.core.utility.DataConverter;
import com.realsil.sdk.dfu.DfuConstants;
import com.realsil.sdk.dfu.DfuException;
import com.realsil.sdk.dfu.exception.OtaException;
import com.realsil.sdk.dfu.image.stream.BaseBinInputStream;
import com.realsil.sdk.dfu.internal.base.DfuThreadCallback;
import com.realsil.sdk.dfu.m.j;
import com.realsil.sdk.dfu.model.DfuConfig;
import com.realsil.sdk.dfu.model.OtaDeviceInfo;
import com.realsil.sdk.dfu.r.g;
import com.realsil.sdk.dfu.r.h;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import y5.u;

/* loaded from: classes4.dex */
public class d extends f {
    public UsbGattCharacteristic J;
    public UsbGattCharacteristic K;
    public UsbGattCharacteristic L;
    public UsbGattCharacteristic M;
    public UsbGattCharacteristic N;
    public UsbGattCharacteristic O;
    public List P;
    public UUID Q;
    public UUID R;
    public UsbGattCharacteristic S;
    public UsbGattCharacteristic T;
    public final UsbGattCallback U;

    public class a extends UsbGattCallback {
        public a() {
        }

        public final synchronized void a(byte[] bArr) {
            j a8 = j.a(bArr);
            if (a8 == null) {
                ZLogger.w("notification data invalid");
                return;
            }
            if (d.this.VDBG) {
                ZLogger.v(a8.toString());
            }
            if (a8.b()) {
                int i8 = a8.f16062b;
                if (i8 == 7) {
                    synchronized (d.this.f15965o) {
                        ZLogger.d("ignore connection parameters notification");
                        d.this.D = bArr;
                        d.this.F = true;
                        d.this.f15965o.notifyAll();
                    }
                    return;
                }
                if (i8 == 8) {
                    d.this.updateRemoteState(bArr.length >= 3 ? bArr[2] : (byte) 0);
                    return;
                }
                synchronized (d.this.f15965o) {
                    d.this.D = bArr;
                    d.this.F = true;
                    d.this.f15965o.notifyAll();
                }
                return;
            }
        }

        public void onCharacteristicChanged(UsbGatt usbGatt, UsbGattCharacteristic usbGattCharacteristic) {
            a(usbGattCharacteristic.getValue());
        }

        public void onCharacteristicRead(UsbGatt usbGatt, UsbGattCharacteristic usbGattCharacteristic, int i8) {
            String format;
            if (i8 == 0) {
                d.this.mReadRxData = usbGattCharacteristic.getValue();
            } else {
                if (i8 == 257) {
                    d.this.mErrorState = 1157;
                    format = String.format(Locale.US, "read Characteristic error:0x%04X", Integer.valueOf(d.this.mErrorState));
                } else {
                    d.this.mErrorState = i8 | 1024;
                    format = String.format(Locale.US, "read Characteristic error:0x%04X", Integer.valueOf(d.this.mErrorState));
                }
                ZLogger.w(format);
            }
            d.this.notifyReadLock();
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x0079, code lost:
        
            if (r5 != null) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0023, code lost:
        
            if (r5 != null) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
        
            r4.f16467a.getDfuProgressInfo().addBytesSent(r5.length);
            r4.f16467a.notifyProcessChanged();
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x007c, code lost:
        
            r5 = "characteristic's value is null, exception";
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void onCharacteristicWrite(UsbGatt usbGatt, UsbGattCharacteristic usbGattCharacteristic, int i8) {
            byte[] value = usbGattCharacteristic.getValue();
            if (i8 == 0) {
                d.this.mWriteRetransFlag = false;
                if (d.this.Q != null && d.this.Q.equals(usbGattCharacteristic.getUuid())) {
                }
            } else if (i8 != 257 && i8 != 143) {
                d.this.mErrorState = i8 | 1024;
                String format = String.format("Characteristic write error: 0x%04X", Integer.valueOf(d.this.mErrorState));
                ZLogger.w(format);
            } else if (d.this.Q != null && d.this.Q.equals(usbGattCharacteristic.getUuid())) {
                if (i8 == 143) {
                    d.this.mWriteRetransFlag = false;
                } else {
                    d.this.mWriteRetransFlag = true;
                    ZLogger.d(d.this.DBG, "write image packet error, status=" + i8 + ", please retry.");
                }
            }
            d.this.h();
        }

        public void onConnectionStateChange(UsbGatt usbGatt, int i8, int i9) {
            if (i8 != 0) {
                if (i9 == 0) {
                    d.this.setConnectionState(0);
                }
                d.this.mErrorState = i8 | 2048;
            } else if (i9 == 2) {
                d dVar = d.this;
                if (dVar.mAborted) {
                    ZLogger.w("task already aborted, ignore");
                    return;
                } else {
                    if (dVar.mConnectionState == 256) {
                        dVar.o();
                        return;
                    }
                    ZLogger.v("ignore connected state");
                }
            } else if (i9 == 0) {
                if (d.this.mProcessState == 521) {
                    d.this.mErrorState = i8 | 2048;
                    ZLogger.d(d.this.DBG, "disconnect in OTA process, mErrorState: " + d.this.mErrorState);
                    d.this.h();
                }
                d.this.setConnectionState(0);
            }
            d.this.notifyConnectionLock();
        }

        public void onMtuChanged(UsbGatt usbGatt, int i8, int i9) {
            if (i9 == 0) {
                ZLogger.v(d.this.TDBG, "mtu=" + i8);
                if (d.this.getDfuConfig().isMtuUpdateEnabled()) {
                    d.this.MAX_PACKET_SIZE = com.realsil.sdk.dfu.j.c.a(i8);
                }
            }
            d.this.G = true;
            d.this.f();
        }

        public void onServicesDiscovered(UsbGatt usbGatt, int i8) {
            d dVar = d.this;
            if (dVar.mAborted) {
                ZLogger.w("task already aborted, ignore");
                return;
            }
            if (i8 == 0) {
                try {
                    dVar.Q = UUID.fromString(dVar.getDfuConfig().getGattConfig().getDfuDataUuid());
                    d dVar2 = d.this;
                    dVar2.R = UUID.fromString(dVar2.getDfuConfig().getGattConfig().getDfuControlPointUuid());
                } catch (Exception e8) {
                    ZLogger.w(e8.toString());
                }
                d.this.e(usbGatt);
                d.this.d(usbGatt);
                d.this.c(usbGatt);
                d.this.setConnectionState(515);
            } else {
                dVar.mErrorState = i8 | 2048;
            }
            d.this.notifyConnectionLock();
        }
    }

    public d(Context context, DfuConfig dfuConfig, DfuThreadCallback dfuThreadCallback) {
        super(context, dfuConfig, dfuThreadCallback);
        this.Q = g.f16274b;
        this.R = g.f16275c;
        this.U = new a();
    }

    private int A() {
        if (this.S == null) {
            ZLogger.w("no mControlPointCharacteristic found");
            return 0;
        }
        ZLogger.d("<< OPCODE_DFU_ENABLE_BUFFER_CHECK_MODE(0x09)");
        a(this.S, new byte[]{9}, false);
        try {
            ZLogger.d(this.DBG, "... Reading OPCODE_DFU_ENABLE_BUFFER_CHECK_MODE notification");
            byte[] b8 = b(1600L);
            if (b8[2] == 1) {
                ByteBuffer wrap = ByteBuffer.wrap(b8);
                wrap.order(ByteOrder.LITTLE_ENDIAN);
                int i8 = (((short) (wrap.get(4) & 255)) << 8) | ((short) (wrap.get(3) & 255));
                int i9 = ((short) (wrap.get(5) & 255)) | (((short) (wrap.get(6) & 255)) << 8);
                ZLogger.v(this.DBG, "maxBufferSize=" + i8 + ", bufferCheckMtuSize=" + i9);
                a(i8);
                b(i9);
                return 1;
            }
        } catch (DfuException unused) {
            ZLogger.w("Read DFU_REPORT_OTA_FUNCTION_VERSION failed, just think remote is normal function.");
            this.mErrorState = 0;
        }
        return 0;
    }

    private int B() {
        byte[] b8;
        byte b9;
        if (this.S == null) {
            ZLogger.w("no mControlPointCharacteristic found");
            return 0;
        }
        ZLogger.d("<< OPCODE_DFU_REPORT_OTA_FUNCTION_VERSION(0x09)");
        a(this.S, new byte[]{9}, false);
        try {
            ZLogger.d(this.DBG, "Reading OPCODE_DFU_REPORT_OTA_FUNCTION_VERSION notification");
            b8 = b(1600L);
            b9 = b8[2];
        } catch (DfuException unused) {
            ZLogger.w("Reading OPCODE_DFU_REPORT_OTA_FUNCTION_VERSION notification failed, just think remote is normal function.");
            this.mErrorState = 0;
        }
        if (b9 == 1) {
            ByteBuffer.wrap(b8).order(ByteOrder.LITTLE_ENDIAN);
            return 1;
        }
        ZLogger.w("reportOtaFunctionVersion failed, status: " + ((int) b9));
        return 0;
    }

    private boolean C() {
        try {
            ZLogger.d(this.DBG, "<< OPCODE_DFU_RESET_SYSTEM (0x05)");
            return a(this.S, new byte[]{5}, true);
        } catch (DfuException e8) {
            ZLogger.d(String.format("Send OPCODE_DFU_RESET_SYSTEM failed, ignore it, errorcode= 0x%04X", Integer.valueOf(e8.getErrCode())));
            this.mErrorState = 0;
            return false;
        }
    }

    private void D() {
        ZLogger.v("<< OPCODE_DFU_START_DFU(0x01)");
        byte[] bArr = new byte[16];
        System.arraycopy(this.mCurBinInputStream.getHeaderBuf(), 0, bArr, 0, 12);
        byte[] bArr2 = new byte[17];
        bArr2[0] = 1;
        if (getOtaDeviceInfo().isAesEncryptEnabled()) {
            System.arraycopy(this.f15962l.aesEncrypt(bArr, 0, 16), 0, bArr2, 1, 16);
        } else {
            System.arraycopy(bArr, 0, bArr2, 1, 16);
        }
        a(this.S, bArr2, false);
        ZLogger.v(this.DBG, "... Reading OPCODE_DFU_START_DFU(0x01) notification");
        byte b8 = w()[2];
        if (b8 == 1) {
            return;
        }
        ZLogger.w(String.format("start dfu failed (0x%02X)", Byte.valueOf(b8)));
        throw new OtaException("start dfu failed", b8 | 512);
    }

    private boolean E() {
        if (!a()) {
            notifyError(4128, true);
            return false;
        }
        if (getOtaDeviceInfo().isAesEncryptEnabled() && !b()) {
            notifyError(4113);
            return false;
        }
        notifyStateChanged(521);
        ZLogger.d(String.format("mOtaWorkMode=0x%04X, ICType=%02X", Integer.valueOf(this.mOtaWorkMode), Integer.valueOf(getOtaDeviceInfo().icType)));
        if (this.DBG) {
            ZLogger.v(getDfuProgressInfo().toString());
        }
        if (Build.VERSION.SDK_INT >= 23) {
            a(this.C, 256);
        }
        if (getOtaDeviceInfo().icType <= 3) {
            if (this.mOtaWorkMode == 16 && getDfuConfig().isConParamUpdateLatencyEnabled()) {
                sleepInner(getDfuConfig().getLatencyTimeout() * 1000);
            }
            this.f15967q = B();
            ZLogger.v(this.DBG, "mRemoteOtaFunctionInfo=" + this.f15967q);
            if (this.f15967q == 1) {
                z();
            }
        } else {
            ZLogger.d("isBufferCheckEnabled=" + getOtaDeviceInfo().isBufferCheckEnabled());
            if (getOtaDeviceInfo().isBufferCheckEnabled()) {
                this.f15967q = A();
            } else {
                this.f15967q = 0;
            }
            ZLogger.v(this.DBG, "mRemoteOtaFunctionInfo=" + this.f15967q);
        }
        getDfuProgressInfo().start();
        e(getDfuProgressInfo().getCurImageId());
        if (!getDfuConfig().isBreakpointResumeEnabled()) {
            this.mImageUpdateOffset = 0;
            ZLogger.d(String.format(Locale.US, "BreakpointResume disable: mImageUpdateOffset=0x%08X(%d)", 0, Integer.valueOf(this.mImageUpdateOffset)));
        }
        if (this.mImageUpdateOffset == 0) {
            D();
        }
        if (this.mImageUpdateOffset - 12 >= getDfuProgressInfo().getImageSizeInBytes()) {
            ZLogger.d("Last send reach the bottom");
        } else if (getOtaDeviceInfo().icType <= 3) {
            g(getDfuProgressInfo().getCurImageId());
            if (this.f15967q == 1) {
                a(this.C, this.T, this.mCurBinInputStream);
            } else {
                c(this.C, this.T, this.mCurBinInputStream);
            }
        } else {
            f(getDfuProgressInfo().getCurImageId());
            if (this.f15967q == 1) {
                b(this.C, this.T, this.mCurBinInputStream);
            } else {
                d(this.C, this.T, this.mCurBinInputStream);
            }
        }
        getDfuProgressInfo().sendOver();
        h(getDfuProgressInfo().getCurImageId());
        return true;
    }

    private int a(String str, int i8) {
        int i9 = 0;
        while (a()) {
            int b8 = b(str);
            if (b8 == 0) {
                return 0;
            }
            if ((b8 & (-2049)) != 133) {
                b(this.C);
            } else {
                ZLogger.w("connect fail with GATT_ERROR, do not need disconnect");
            }
            a(this.C);
            sleepInner(1600L);
            i9++;
            ZLogger.d(this.DBG, "tryConnectTime=" + i9);
            if (i9 > i8) {
                return b8;
            }
        }
        return 4128;
    }

    private void e(int i8) {
        int i9;
        int i10;
        ZLogger.d(this.DBG, "<< OPCODE_DFU_REPORT_TARGET_IMAGE_INFO(0x06)");
        a(this.S, new byte[]{6, (byte) (i8 & 255), (byte) ((i8 >> 8) & 255)}, false);
        ZLogger.d(this.VDBG, "... Reading OPCODE_DFU_REPORT_TARGET_IMAGE_INFO(0x06) notification");
        byte[] w7 = w();
        int length = w7 != null ? w7.length : 0;
        if (length <= 2 || w7[2] != 1) {
            ZLogger.w(String.format("0x%02X, Get target image info failed", Integer.valueOf(DfuException.ERROR_OPCODE_RESPONSE_NOT_SUPPORTED)));
            throw new OtaException("Get target image info failed", DfuException.ERROR_OPCODE_RESPONSE_NOT_SUPPORTED);
        }
        ByteBuffer wrap = ByteBuffer.wrap(w7);
        wrap.order(ByteOrder.LITTLE_ENDIAN);
        if (length >= 11) {
            i9 = wrap.getShort(3) & u.MAX_VALUE;
            i10 = 7;
        } else {
            if (length < 9) {
                this.mImageUpdateOffset = 0;
                i9 = 0;
                ZLogger.v(String.format(Locale.US, "mOriginalFwVersion=%d, mImageUpdateOffset=0x%08X(%d)", Integer.valueOf(i9), Integer.valueOf(this.mImageUpdateOffset), Integer.valueOf(this.mImageUpdateOffset)));
            }
            i9 = wrap.getShort(3) & u.MAX_VALUE;
            i10 = 5;
        }
        this.mImageUpdateOffset = wrap.getInt(i10);
        ZLogger.v(String.format(Locale.US, "mOriginalFwVersion=%d, mImageUpdateOffset=0x%08X(%d)", Integer.valueOf(i9), Integer.valueOf(this.mImageUpdateOffset), Integer.valueOf(this.mImageUpdateOffset)));
    }

    private void f(int i8) {
        boolean z7;
        String format;
        int i9 = this.mImageUpdateOffset;
        if (i9 == 0) {
            this.mImageUpdateOffset = 12;
            z7 = this.DBG;
            format = String.format(Locale.US, "First Packet, mImageUpdateOffset=0x%08X(%d)", 12, Integer.valueOf(this.mImageUpdateOffset));
        } else {
            z7 = this.DBG;
            format = String.format(Locale.US, "mImageUpdateOffset=0x%08X(%d)", Integer.valueOf(i9), Integer.valueOf(this.mImageUpdateOffset));
        }
        ZLogger.d(z7, format);
        a(i8, this.mImageUpdateOffset);
        int bytesSent = getDfuProgressInfo().getBytesSent();
        int i10 = this.mImageUpdateOffset;
        if (bytesSent == i10 || i10 == -1) {
            return;
        }
        ZLogger.v(this.VDBG, "mBytesSent != mImageUpdateOffset, reload image bin file");
        this.imageFileLoaded = false;
        m();
        alignmentSendBytes(this.mImageUpdateOffset, false);
    }

    private void p() {
        b(new byte[]{4});
    }

    private int q() {
        StringBuilder sb;
        UUID uuid;
        if (this.S == null) {
            sb = new StringBuilder();
            sb.append("not found DFU_CONTROL_POINT_UUID : ");
            uuid = this.R;
        } else {
            ZLogger.v(this.DBG, "find DFU_CONTROL_POINT_UUID: " + this.R.toString());
            if (this.T != null) {
                ZLogger.v(this.DBG, "find DFU_DATA_UUID: " + this.Q.toString());
                return 0;
            }
            sb = new StringBuilder();
            sb.append("not found DFU_DATA_UUID :");
            uuid = this.Q;
        }
        sb.append(uuid.toString());
        ZLogger.w(sb.toString());
        return DfuException.ERROR_NO_CHARACTERISTIC_FOUND_OR_LOSS;
    }

    private boolean r() {
        c(this.mOtaDeviceAddress);
        q();
        if (this.otaEnvironmentPrepared) {
            l();
        } else {
            u();
        }
        if (this.mCurBinInputStream != null) {
            return true;
        }
        notifyError(4097);
        return false;
    }

    private boolean t() {
        BaseBinInputStream baseBinInputStream;
        notifyStateChanged(514);
        this.mOtaDeviceAddress = this.mDeviceAddress;
        this.otaModeEnabled = this.mOtaWorkMode != 0;
        boolean z7 = false;
        while (a()) {
            try {
                if (!r() || !E()) {
                    return false;
                }
                this.mBytesSentBuffer += getDfuProgressInfo().getBytesSent();
                if (getDfuProgressInfo().isLastImageFile()) {
                    ZLogger.d("no pending image file to upload.");
                    getDfuProgressInfo().setActiveImageSize(this.mBytesSentBuffer);
                    if (this.f15964n) {
                        p();
                        notifyStateChanged(258);
                    } else {
                        notifyStateChanged(523);
                    }
                    z7 = true;
                } else {
                    ZLogger.d("has pending image file to upload");
                    if (getOtaDeviceInfo().getUpdateMechanism() == 1) {
                        this.mOtaDeviceAddress = this.mDeviceAddress;
                        this.otaModeEnabled = this.mOtaWorkMode != 0;
                        this.mBytesSentBuffer = 0;
                        p();
                    } else if (getOtaDeviceInfo().getUpdateMechanism() == 3 && (baseBinInputStream = this.mNextBinInputStream) != null && a(baseBinInputStream, this.mBytesSentBuffer, getOtaDeviceInfo().otaTempBufferSize * 4096)) {
                        ZLogger.i("make device to enter the ota advertiser mode, and let the app continue update image");
                        this.otaModeEnabled = true;
                        this.mBytesSentBuffer = 0;
                        a((byte) 1);
                    }
                    j();
                }
                sleepInner(1000L);
                if (z7) {
                    return z7;
                }
            } catch (DfuException e8) {
                ZLogger.w(DfuConstants.parseOtaState(this.mProcessState) + ", " + e8.toString());
                int errCode = e8.getErrCode();
                if (errCode == 4128) {
                    notifyError(errCode, true);
                } else {
                    if (errCode != 4097 && errCode != 265) {
                        C();
                    }
                    notifyError(errCode, false);
                }
                return z7;
            }
        }
        notifyError(4128, true);
        return false;
    }

    private void u() {
        this.otaEnvironmentPrepared = false;
        notifyStateChanged(517);
        sleepInner(1500L);
        this.mOtaDeviceInfo = new OtaDeviceInfo(this.f15958h, 2);
        x();
        if (getOtaDeviceInfo().icType == 5 || getOtaDeviceInfo().icType == 9 || getOtaDeviceInfo().icType == 4 || getOtaDeviceInfo().icType == 6 || getOtaDeviceInfo().icType == 7 || getOtaDeviceInfo().icType == 8 || getOtaDeviceInfo().icType == 11 || getOtaDeviceInfo().icType == 17 || getOtaDeviceInfo().icType == 19 || getOtaDeviceInfo().icType == 12) {
            y();
        }
        v();
        if (this.DBG) {
            ZLogger.d(getOtaDeviceInfo().toString());
        }
        m();
        this.otaEnvironmentPrepared = true;
        ZLogger.d("Ota Environment prepared.");
    }

    private void v() {
        int i8;
        int i9;
        if (getOtaDeviceInfo().specVersion != 0) {
            List list = this.P;
            byte[] bArr = null;
            if (list == null || list.size() <= 0) {
                getOtaDeviceInfo().setImageVersionValues(null);
                ZLogger.d(this.DBG, "no ImageVersionCharacteristics to read");
                return;
            }
            for (UsbGattCharacteristic usbGattCharacteristic : this.P) {
                ZLogger.v(this.DBG ? "read image version : " + usbGattCharacteristic.getUuid().toString() : "read image version");
                byte[] a8 = a(usbGattCharacteristic);
                if (a8 != null) {
                    if (bArr == null) {
                        bArr = a8;
                    } else {
                        byte[] bArr2 = new byte[bArr.length + a8.length];
                        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                        System.arraycopy(a8, 0, bArr2, bArr.length, a8.length);
                        bArr = bArr2;
                    }
                }
            }
            getOtaDeviceInfo().setImageVersionValues(bArr);
            return;
        }
        if (this.M != null) {
            ZLogger.v("read patch version");
            byte[] a9 = a(this.M);
            if (a9 != null) {
                try {
                    ByteBuffer wrap = ByteBuffer.wrap(a9);
                    wrap.order(ByteOrder.LITTLE_ENDIAN);
                    if (getOtaDeviceInfo().icType > 3) {
                        if (getOtaDeviceInfo().icType != 5) {
                            if (getOtaDeviceInfo().icType != 9) {
                                if (getOtaDeviceInfo().icType == 12) {
                                }
                            }
                        }
                        i9 = wrap.getInt(0);
                        getOtaDeviceInfo().setPatchVersion(i9);
                    }
                    i9 = wrap.getShort(0) & u.MAX_VALUE;
                    getOtaDeviceInfo().setPatchVersion(i9);
                } catch (Exception e8) {
                    ZLogger.e(e8.toString());
                }
            }
        }
        if (this.L != null) {
            ZLogger.v("read app version");
            byte[] a10 = a(this.L);
            if (a10 != null) {
                try {
                    ByteBuffer wrap2 = ByteBuffer.wrap(a10);
                    wrap2.order(ByteOrder.LITTLE_ENDIAN);
                    if (getOtaDeviceInfo().icType > 3) {
                        if (getOtaDeviceInfo().icType != 5) {
                            if (getOtaDeviceInfo().icType != 9) {
                                if (getOtaDeviceInfo().icType == 12) {
                                }
                            }
                        }
                        i8 = wrap2.getInt(0);
                        getOtaDeviceInfo().setAppVersion(i8);
                    }
                    i8 = wrap2.getShort(0) & u.MAX_VALUE;
                    getOtaDeviceInfo().setAppVersion(i8);
                } catch (Exception e9) {
                    ZLogger.e(e9.toString());
                }
            }
        }
        if (this.N != null) {
            ZLogger.v("read patch extension version");
            byte[] a11 = a(this.N);
            if (a11 != null) {
                ByteBuffer wrap3 = ByteBuffer.wrap(a11);
                wrap3.order(ByteOrder.LITTLE_ENDIAN);
                getOtaDeviceInfo().setPatchExtensionVersion(wrap3.getShort(0) & u.MAX_VALUE);
            }
        }
    }

    private byte[] w() {
        return b(getDfuConfig().getNotificationTimeout());
    }

    private boolean x() {
        if (this.O == null) {
            return false;
        }
        ZLogger.v(this.DBG, "start to read remote dev info");
        byte[] a8 = a(this.O);
        if (a8 == null) {
            ZLogger.e("Get dev info failed");
            throw new OtaException("get remote dev info failed", 270);
        }
        getOtaDeviceInfo().parseX0000(a8);
        a(getOtaDeviceInfo().maxBufferCheckSize);
        return true;
    }

    private boolean y() {
        if (this.K == null) {
            return false;
        }
        ZLogger.v(this.DBG, "start to read remote dev Mac Addr info");
        return getOtaDeviceInfo().parseDeviceMac(a(this.K));
    }

    private void z() {
        ZLogger.d("<<  OPCODE_DFU_REPORT_CURRENT_BUFFER_SIZE(0x0A)");
        a(this.S, new byte[]{10}, false);
        ZLogger.d(this.DBG, "... Reading OPCODE_DFU_REPORT_CURRENT_BUFFER_SIZE notification");
        byte[] w7 = w();
        byte b8 = w7[2];
        if (b8 != 1) {
            ZLogger.w("Get remote buffer size info failed, status: " + ((int) b8));
            throw new OtaException("Get remote buffer size info failed", b8 | 512);
        }
        ByteBuffer wrap = ByteBuffer.wrap(w7);
        wrap.order(ByteOrder.LITTLE_ENDIAN);
        int i8 = wrap.getInt(3);
        ZLogger.v(String.format(Locale.US, "maxBufferCheckSize=(0x%04X, %d)", Integer.valueOf(i8), Integer.valueOf(i8)));
        a(i8);
    }

    @Override // com.realsil.sdk.dfu.internal.base.BaseDfuTask
    public boolean activeImage(boolean z7) {
        if (!super.activeImage(z7)) {
            return false;
        }
        if (this.mConnectionState != 515) {
            ZLogger.d(this.DBG, "start to re-connect the RCU which going to active image, current state is: " + this.mConnectionState);
            int a8 = a(this.mOtaDeviceAddress, getDfuConfig().getRetransConnectTimes());
            if (a8 != 0) {
                ZLogger.e("Something error in OTA process, errorCode: " + a8 + "mProcessState" + this.mProcessState);
                notifyError(a8, true);
                return false;
            }
        }
        if (z7) {
            try {
                p();
                notifyStateChanged(258);
            } catch (DfuException e8) {
                ZLogger.w(e8.toString());
                notifyError(e8.getErrCode());
            }
        } else {
            if (C() && !s()) {
                waitUntilDisconnected();
            }
            notifyError(DfuException.ERROR_USER_NOT_ACTIVE_IMAGE_ERROR, false);
        }
        return true;
    }

    public final int c(UsbGatt usbGatt) {
        ZLogger.d(this.DBG, "find DEVICE_INFORMATION_SERVICE: " + com.realsil.sdk.dfu.m.g.f16050a.toString());
        UUID uuid = com.realsil.sdk.dfu.m.g.f16054e;
        UsbGattCharacteristic characteristic = usbGatt.getCharacteristic(uuid);
        this.J = characteristic;
        if (characteristic == null) {
            ZLogger.w("DIS_PNP_ID_CHARACTERISTIC not found:" + uuid);
            return DfuException.ERROR_NO_CHARACTERISTIC_FOUND_OR_LOSS;
        }
        ZLogger.d(this.DBG, "find DIS_PNP_ID_CHARACTERISTIC: " + uuid.toString());
        return 0;
    }

    public final int d(UsbGatt usbGatt) {
        StringBuilder sb;
        UUID uuid;
        UsbGattCharacteristic characteristic = usbGatt.getCharacteristic(this.R);
        this.S = characteristic;
        if (characteristic == null) {
            sb = new StringBuilder();
            sb.append("not found DFU_CONTROL_POINT_UUID: ");
            uuid = this.R;
        } else {
            ZLogger.d(this.DBG, "find DFU_CONTROL_POINT_UUID: " + this.R.toString());
            this.S.setWriteType(2);
            UsbGattCharacteristic characteristic2 = usbGatt.getCharacteristic(this.Q);
            this.T = characteristic2;
            if (characteristic2 != null) {
                ZLogger.d(this.DBG, "find DFU_DATA_UUID: " + this.Q.toString());
                this.T.setWriteType(1);
                return 0;
            }
            sb = new StringBuilder();
            sb.append("not found DFU_DATA_UUID: ");
            uuid = this.Q;
        }
        sb.append(uuid.toString());
        ZLogger.w(sb.toString());
        return DfuException.ERROR_NO_CHARACTERISTIC_FOUND_OR_LOSS;
    }

    @Override // com.realsil.sdk.dfu.internal.base.BaseDfuTask
    public void executeOtaProcedure() {
        int innerCheck;
        try {
            innerCheck = innerCheck();
        } catch (Exception e8) {
            ZLogger.w(e8.toString());
            notifyError(0);
        }
        if (innerCheck != 0) {
            notifyError(innerCheck);
            return;
        }
        t();
        closeInputStream(this.mCurBinInputStream);
        ZLogger.d(this.DBG, "GattDfuTaskX0000 stopped");
        if (this.mProcessState == 525) {
            notifyStateChanged(259);
        }
    }

    @Override // com.realsil.sdk.dfu.y.f, com.realsil.sdk.dfu.y.c, com.realsil.sdk.dfu.internal.base.BaseDfuTask
    public void initialize() {
        super.initialize();
        try {
            this.Q = UUID.fromString(getDfuConfig().getGattConfig().getDfuDataUuid());
            this.R = UUID.fromString(getDfuConfig().getGattConfig().getDfuControlPointUuid());
        } catch (Exception e8) {
            ZLogger.w(e8.toString());
        }
        this.initialized = true;
    }

    @Override // com.realsil.sdk.dfu.internal.base.BaseDfuTask
    public void notifyError(int i8, boolean z7) {
        if (this.mAborted) {
            i8 = 4128;
        }
        if (i8 != 4128) {
            notifyStateChanged(260, true);
        }
        ZLogger.v(String.format("error = 0x%04X, needReset=%b", Integer.valueOf(i8), Boolean.valueOf(z7)));
        if (z7) {
            C();
        }
        closeInputStream(this.mCurBinInputStream);
        if (getDfuConfig().isErrorActionEnabled(1)) {
            c(i8);
        }
        DfuThreadCallback dfuThreadCallback = this.mThreadCallback;
        if (dfuThreadCallback != null) {
            dfuThreadCallback.onError(i8);
        }
        this.mAborted = true;
    }

    public boolean s() {
        return this.mOtaWorkMode == 16;
    }

    private int b(String str) {
        int i8;
        setConnectionState(256);
        this.mErrorState = 0;
        this.isConnectedCallbackCome = false;
        ZLogger.d(this.DBG, "Connecting to device..." + BluetoothHelper.formatAddress(str, true));
        UsbDevice a8 = a(str);
        UsbGatt usbGatt = null;
        if (a8 == null) {
            ZLogger.w("device is null");
            this.C = null;
            return 256;
        }
        this.B.unRegisterCallback(str, this.U);
        if (this.B.connect(a8, this.mContext, this.U)) {
            usbGatt = this.B.getBluetoothGatt(str);
            this.C = usbGatt;
            try {
                synchronized (this.mConnectionLock) {
                    try {
                        if (!this.isConnectedCallbackCome && this.mErrorState == 0) {
                            ZLogger.d(this.DBG, "wait for connect gatt for " + getDfuConfig().getConnectionTimeout() + " ms");
                            this.mConnectionLock.wait(getDfuConfig().getConnectionTimeout());
                        }
                    } finally {
                    }
                }
            } catch (InterruptedException e8) {
                ZLogger.w("Sleeping interrupted : " + e8.toString());
                this.mErrorState = 259;
            }
        } else {
            this.mErrorState = 256;
        }
        if (this.mErrorState == 0) {
            if (!this.isConnectedCallbackCome) {
                ZLogger.w("wait connect callback timeout");
                i8 = 260;
            } else if (usbGatt == null || this.mConnectionState != 515) {
                ZLogger.w("connect with some error, ConnectionState=" + this.mConnectionState);
                i8 = DfuException.ERROR_CONNECT_ERROR;
            }
            this.mErrorState = i8;
        }
        if (this.mErrorState == 0) {
            ZLogger.v(this.DBG, "connected the device which going to upgrade");
        }
        return this.mErrorState;
    }

    private void g(int i8) {
        int i9 = this.mImageUpdateOffset;
        if (i9 == 0) {
            i9 = 12;
        }
        a(i8, i9);
        if (getDfuProgressInfo().getBytesSent() != this.mImageUpdateOffset) {
            ZLogger.v(this.VDBG, "mBytesSent != mImageUpdateOffset, reload image bin file");
            this.imageFileLoaded = false;
            m();
            alignmentSendBytes(this.mImageUpdateOffset, false);
        }
        ZLogger.v(getDfuProgressInfo().toString());
    }

    private void h(int i8) {
        ZLogger.d("<< OPCODE_DFU_VALIDATE_FW_IMAGE (0x03)");
        a(this.S, new byte[]{3, (byte) (i8 & 255), (byte) ((i8 >> 8) & 255)}, false);
        ZLogger.d(this.DBG, "... waiting DFU_VALIDATE_FW_IMAGE response");
        byte b8 = w()[2];
        if (b8 == 1) {
            return;
        }
        ZLogger.w(String.format("0x%02X, Validate FW failed", Byte.valueOf(b8)));
        throw new OtaException("Validate FW failed", b8 | 512);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(UsbGatt usbGatt) {
        StringBuilder sb;
        String str;
        UsbGattCharacteristic characteristic;
        UsbGattCharacteristic characteristic2;
        UsbGattCharacteristic characteristic3;
        UsbGattCharacteristic characteristic4;
        int i8;
        UUID uuid = h.f16278b;
        UsbGattCharacteristic characteristic5 = usbGatt.getCharacteristic(uuid);
        this.K = characteristic5;
        if (characteristic5 != null) {
            if (this.DBG) {
                sb = new StringBuilder();
                str = "find OTA_MAC_ADDR_CHARACTERISTIC_UUID = ";
            }
            UUID uuid2 = h.f16279c;
            characteristic = usbGatt.getCharacteristic(uuid2);
            this.M = characteristic;
            if (characteristic != null) {
                ZLogger.d(this.DBG, "OTA_READ_PATCH_CHARACTERISTIC_UUID not found:" + uuid2);
            } else if (this.VDBG) {
                ZLogger.d("find OTA_PATCH_VERSION_CHARACTERISTIC_UUID: " + uuid2.toString());
            }
            UUID uuid3 = h.f16280d;
            characteristic2 = usbGatt.getCharacteristic(uuid3);
            this.L = characteristic2;
            if (characteristic2 != null) {
                ZLogger.w(this.DBG, "OTA_READ_APP_CHARACTERISTIC_UUID not found: " + uuid3);
            } else if (this.VDBG) {
                ZLogger.d("find OTA_APP_VERSION_CHARACTERISTIC_UUID: " + uuid3.toString());
            }
            UUID uuid4 = h.f16281e;
            characteristic3 = usbGatt.getCharacteristic(uuid4);
            this.N = characteristic3;
            if (characteristic3 != null) {
                ZLogger.w("OTA_PATCH_EXTENSION_VERSION_CHARACTERISTIC_UUID not found:" + uuid4);
            } else if (this.DBG) {
                ZLogger.d("find OTA_PATCH_EXTENSION_VERSION_CHARACTERISTIC_UUID: " + uuid4.toString());
            }
            UUID uuid5 = h.f16283g;
            characteristic4 = usbGatt.getCharacteristic(uuid5);
            this.O = characteristic4;
            if (characteristic4 != null) {
                ZLogger.w("OTA_DEVICE_INFO_CHARACTERISTIC_UUID not found:" + uuid5);
            } else if (this.DBG) {
                ZLogger.d("find OTA_DEVICE_INFO_CHARACTERISTIC_UUID: " + uuid5);
            }
            this.P = new ArrayList();
            for (i8 = 65504; i8 < 65519; i8++) {
                UUID fromShortValue = BluetoothUuidCompat.fromShortValue(i8);
                UsbGattCharacteristic characteristic6 = usbGatt.getCharacteristic(fromShortValue);
                if (characteristic6 == null) {
                    ZLogger.w(this.DBG, "not found image version characteristic:" + fromShortValue.toString());
                    return;
                }
                ZLogger.d(this.DBG, "find image version characteristic: " + fromShortValue.toString());
                this.P.add(characteristic6);
            }
        }
        sb = new StringBuilder();
        str = "OTA_MAC_ADDR_CHARACTERISTIC_UUID not found:";
        sb.append(str);
        sb.append(uuid);
        ZLogger.d(sb.toString());
        UUID uuid22 = h.f16279c;
        characteristic = usbGatt.getCharacteristic(uuid22);
        this.M = characteristic;
        if (characteristic != null) {
        }
        UUID uuid32 = h.f16280d;
        characteristic2 = usbGatt.getCharacteristic(uuid32);
        this.L = characteristic2;
        if (characteristic2 != null) {
        }
        UUID uuid42 = h.f16281e;
        characteristic3 = usbGatt.getCharacteristic(uuid42);
        this.N = characteristic3;
        if (characteristic3 != null) {
        }
        UUID uuid52 = h.f16283g;
        characteristic4 = usbGatt.getCharacteristic(uuid52);
        this.O = characteristic4;
        if (characteristic4 != null) {
        }
        this.P = new ArrayList();
        while (i8 < 65519) {
        }
    }

    private void a(byte b8) {
        b(new byte[]{4, b8});
    }

    public final void d(UsbGatt usbGatt, UsbGattCharacteristic usbGattCharacteristic, BaseBinInputStream baseBinInputStream) {
        int read;
        ZLogger.d(this.DBG, "uploadFirmwareImageForBeeUpdate");
        c();
        this.mErrorState = 0;
        this.lastPacketTransferred = false;
        int i8 = this.MAX_PACKET_SIZE;
        byte[] bArr = new byte[i8];
        while (!this.lastPacketTransferred) {
            if (this.mAborted) {
                throw new OtaException("user aborted", 4128);
            }
            startSpeedControl();
            if (this.DBG) {
                ZLogger.v(getDfuProgressInfo().toString());
            }
            try {
                if (this.mImageUpdateOffset == 0) {
                    int i9 = this.MAX_PACKET_SIZE;
                    byte[] bArr2 = new byte[i9];
                    baseBinInputStream.read(bArr2, i9 - 12);
                    System.arraycopy(baseBinInputStream.getHeaderBuf(), 0, bArr, 0, 12);
                    System.arraycopy(bArr2, 0, bArr, 12, this.MAX_PACKET_SIZE - 12);
                    read = this.MAX_PACKET_SIZE;
                } else {
                    read = baseBinInputStream.read(bArr, i8);
                }
                if (getDfuProgressInfo().getRemainSizeInBytes() < this.MAX_PACKET_SIZE) {
                    ZLogger.v("reach the end of the file, only read some");
                    read = getDfuProgressInfo().getRemainSizeInBytes();
                }
                int i10 = read;
                if (i10 <= 0) {
                    if (getDfuProgressInfo().isFileSendOver()) {
                        ZLogger.i("image file has already been send over");
                        return;
                    }
                    ZLogger.e("Error while reading file with size: " + i10);
                    throw new OtaException("Error while reading file", 257);
                }
                if (getOtaDeviceInfo().isAesEncryptEnabled()) {
                    b(bArr, i10);
                }
                a(usbGatt, usbGattCharacteristic, bArr, i10, false);
                k();
                blockSpeedControl();
            } catch (IOException unused) {
                throw new OtaException("Error while reading file", 257);
            }
        }
    }

    private void a(int i8, int i9) {
        ZLogger.d("<< OPCODE_DFU_RECEIVE_FW_IMAGE (0x02)");
        a(this.S, new byte[]{2, (byte) (i8 & 255), (byte) ((i8 >> 8) & 255), (byte) (i9 & 255), (byte) ((i9 >> 8) & 255), (byte) ((i9 >> 16) & 255), (byte) ((i9 >> 24) & 255)}, false);
    }

    private boolean d(int i8) {
        String str;
        ZLogger.d(String.format("<< OPCODE_DFU_CHECK_CURRENT_BUFFER(0x0B) , crc=0x%04X", Integer.valueOf(i8)));
        a(this.S, new byte[]{11}, false);
        ZLogger.d(this.DBG, "... waiting CHECK_CURRENT_BUFFER response");
        byte[] w7 = w();
        byte b8 = w7[2];
        if (b8 == 1) {
            short s7 = ByteArrayConverter.toShort(w7, 3, 0);
            if (s7 == i8) {
                return true;
            }
            str = "CRC check error, local: " + i8 + ", remote : " + ((int) s7);
        } else {
            str = "check current buffer failed, status: " + ((int) b8);
        }
        ZLogger.w(str);
        return false;
    }

    public final void c(UsbGatt usbGatt, UsbGattCharacteristic usbGattCharacteristic, BaseBinInputStream baseBinInputStream) {
        ZLogger.d(this.DBG, "uploadFirmwareImage");
        c();
        this.mErrorState = 0;
        this.lastPacketTransferred = false;
        int i8 = this.MAX_PACKET_SIZE;
        byte[] bArr = new byte[i8];
        while (!this.lastPacketTransferred) {
            if (this.mAborted) {
                throw new OtaException("user aborted", 4128);
            }
            if (this.mOtaWorkMode != 17) {
                a(baseBinInputStream);
            }
            ZLogger.v(this.DBG, getDfuProgressInfo().toString());
            startSpeedControl();
            try {
                int read = baseBinInputStream.read(bArr, i8);
                if (getDfuProgressInfo().getRemainSizeInBytes() < this.MAX_PACKET_SIZE) {
                    ZLogger.v(this.DBG, "reach the end of the file, only read some");
                    read = getDfuProgressInfo().getRemainSizeInBytes();
                }
                int i9 = read;
                if (i9 <= 0) {
                    if (getDfuProgressInfo().isFileSendOver()) {
                        ZLogger.i("image file has already been send over");
                        return;
                    }
                    ZLogger.e("Error while reading file with size: " + i9);
                    throw new OtaException("Error while reading file", 257);
                }
                if (getOtaDeviceInfo().isAesEncryptEnabled()) {
                    b(bArr, i9);
                }
                a(usbGatt, usbGattCharacteristic, bArr, i9, false);
                k();
                blockSpeedControl();
            } catch (IOException unused) {
                throw new OtaException("Error while reading file", 257);
            }
        }
    }

    private void c(String str) {
        if (this.mAborted) {
            throw new OtaException("user aborted", 4128);
        }
        notifyStateChanged(516);
        int a8 = a(str, getDfuConfig().getRetransConnectTimes());
        if (a8 == 0) {
            return;
        }
        if (a8 != 4128) {
            throw new OtaException("connectRemoteDevice failed", a8);
        }
        throw new OtaException("aborted, connectRemoteDevice failed", a8);
    }

    private boolean d(byte[] bArr, int i8) {
        if (bArr == null) {
            ZLogger.w("buffer == null");
            return false;
        }
        if (this.TDBG) {
            ZLogger.v(String.format(Locale.US, "bufferCheck (%d) >> (%d) %s", Integer.valueOf(i8), Integer.valueOf(bArr.length), DataConverter.bytes2Hex(bArr)));
        }
        short a8 = com.realsil.sdk.dfu.j.c.a(bArr, i8);
        ZLogger.d(this.DBG, "<< OPCODE_DFU_REPORT_BUFFER_CRC(0x0A)");
        a(this.S, new byte[]{10, (byte) (i8 & 255), (byte) (i8 >> 8), (byte) (a8 & 255), (byte) ((a8 >> 8) & 255)}, false);
        ZLogger.d(this.DBG, "... waiting OPCODE_DFU_REPORT_BUFFER_CRC(0x0A) response");
        byte[] w7 = w();
        byte b8 = w7[2];
        ByteBuffer wrap = ByteBuffer.wrap(w7);
        wrap.order(ByteOrder.LITTLE_ENDIAN);
        this.mImageUpdateOffset = wrap.getInt(3);
        ZLogger.d(this.DBG, String.format(Locale.US, "status:0x%04X, mImageUpdateOffset=0x%08X(%d)", Byte.valueOf(b8), Integer.valueOf(this.mImageUpdateOffset), Integer.valueOf(this.mImageUpdateOffset)));
        if (b8 == 1) {
            return true;
        }
        if (b8 == 5 || b8 == 6) {
            return false;
        }
        throw new OtaException("DFU_STATUS_FLASH_ERASE_ERROR", b8 | 512);
    }

    public final void a(UsbGatt usbGatt, UsbGattCharacteristic usbGattCharacteristic, BaseBinInputStream baseBinInputStream) {
        int i8;
        ZLogger.d(this.DBG, String.format(Locale.US, "updateImageWithCheckBufferForBee1, packetSize=%d, mCurrentMaxBufferSize=%d", Integer.valueOf(this.MAX_PACKET_SIZE), Integer.valueOf(this.f15968r)));
        this.mErrorState = 0;
        this.lastPacketTransferred = false;
        int i9 = this.MAX_PACKET_SIZE;
        byte[] bArr = new byte[i9];
        byte[] bArr2 = new byte[this.f15968r];
        while (!this.lastPacketTransferred) {
            if (this.mAborted) {
                throw new OtaException("user aborted", 4128);
            }
            if (this.mOtaWorkMode != 17) {
                a(baseBinInputStream);
            }
            ZLogger.v(this.DBG, getDfuProgressInfo().toString());
            try {
                int correctBufferCheckSize = getDfuProgressInfo().correctBufferCheckSize(baseBinInputStream.read(bArr2));
                byte[] bArr3 = new byte[this.f15968r];
                int i10 = 0;
                while (true) {
                    int i11 = 0;
                    while (i11 < correctBufferCheckSize) {
                        int min = Math.min(i9, correctBufferCheckSize - i11);
                        System.arraycopy(bArr2, i11, bArr, 0, min);
                        if (getOtaDeviceInfo().isAesEncryptEnabled() && min >= 16) {
                            System.arraycopy(this.f15962l.aesEncrypt(bArr, 0, 16), 0, bArr, 0, 16);
                        } else if (min <= 0) {
                            ZLogger.e("Error while reading file with bufferSize= " + min);
                            throw new OtaException("Error while reading file", 257);
                        }
                        System.arraycopy(bArr, 0, bArr3, i11, min);
                        a(usbGatt, usbGattCharacteristic, bArr, min, false);
                        k();
                        i11 += min;
                    }
                    ZLogger.v(this.VDBG, "pos: " + i11 + ", checkImageBufferSize: " + correctBufferCheckSize);
                    boolean d8 = d(com.realsil.sdk.dfu.a.a.a(bArr2, 0, correctBufferCheckSize));
                    if (d8) {
                        i8 = i10;
                    } else {
                        getDfuProgressInfo().addBytesSent(0 - correctBufferCheckSize);
                        i8 = i10 + 1;
                        ZLogger.d("check failed, retransBufferCheckTimes: " + i8);
                    }
                    a(d8);
                    if (i8 >= 3) {
                        ZLogger.w("Error while buffer check, reach max try times: " + i8 + ", MAX_BUFFER_CHECK_RETRANS_TIME: 3");
                        throw new OtaException("Error while buffer check", DfuException.ERROR_BUFFER_CHECK_REACH_MAX_RETRY_TIMES);
                    }
                    if (d8) {
                        break;
                    } else {
                        i10 = i8;
                    }
                }
            } catch (IOException unused) {
                throw new OtaException("Error while reading file", 257);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ce, code lost:
    
        r0 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x005a, code lost:
    
        if (r4 != (getDfuProgressInfo().getBytesSent() + 12)) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x006d A[Catch: IOException -> 0x0171, TryCatch #0 {IOException -> 0x0171, blocks: (B:52:0x004c, B:54:0x0051, B:10:0x0069, B:12:0x006d, B:14:0x0082, B:15:0x0087, B:16:0x00aa, B:48:0x0091, B:49:0x0095, B:50:0x009b, B:9:0x005c), top: B:51:0x004c }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bf A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(UsbGatt usbGatt, UsbGattCharacteristic usbGattCharacteristic, BaseBinInputStream baseBinInputStream) {
        int i8;
        int min;
        BaseBinInputStream baseBinInputStream2;
        int correctBufferCheckSize;
        ZLogger.v("updateImageWithCheckBufferForBeeUpdate");
        this.mErrorState = 0;
        this.lastPacketTransferred = false;
        int i9 = 0;
        while (!this.lastPacketTransferred) {
            if (this.mAborted) {
                throw new OtaException("user aborted", 4128);
            }
            int i10 = this.f15968r;
            byte[] bArr = new byte[i10];
            int i11 = i9;
            while (true) {
                ZLogger.v(this.DBG, String.format(Locale.US, "mCurrentMaxBufferSize=%d, mImageUpdateOffset=0x%08X(%d)", Integer.valueOf(this.f15968r), Integer.valueOf(this.mImageUpdateOffset), Integer.valueOf(this.mImageUpdateOffset)));
                int i12 = 12;
                if (i11 <= 0) {
                    try {
                        int i13 = this.mImageUpdateOffset;
                        if (i13 != -1) {
                        }
                        i8 = this.mImageUpdateOffset;
                        if (i8 != 0) {
                            System.arraycopy(this.mCurBinInputStream.getHeaderBuf(), 0, bArr, 0, 12);
                            int i14 = i10 - 12;
                            byte[] bArr2 = new byte[i14];
                            int read = this.mCurBinInputStream.read(bArr2, i14);
                            if (read > 0) {
                                System.arraycopy(bArr2, 0, bArr, 12, read);
                                i12 = read + 12;
                            }
                            getDfuProgressInfo().setBytesSent(0);
                        } else {
                            if (i8 == 12) {
                                min = i10 - 12;
                                baseBinInputStream2 = this.mCurBinInputStream;
                            } else {
                                min = Math.min(this.f15968r, this.mCurBinInputStream.remainSizeInBytes());
                                baseBinInputStream2 = this.mCurBinInputStream;
                            }
                            i12 = baseBinInputStream2.read(bArr, min);
                        }
                        correctBufferCheckSize = getDfuProgressInfo().correctBufferCheckSize(i12);
                        ZLogger.d(getDfuProgressInfo().toString());
                        if (correctBufferCheckSize <= 0) {
                            if (getOtaDeviceInfo().isAesEncryptEnabled()) {
                                a(bArr, correctBufferCheckSize);
                            }
                            int i15 = this.f15969s;
                            byte[] bArr3 = new byte[i15];
                            int i16 = 0;
                            while (i16 < correctBufferCheckSize) {
                                int min2 = Math.min(i15, correctBufferCheckSize - i16);
                                System.arraycopy(bArr, i16, bArr3, 0, min2);
                                a(usbGatt, usbGattCharacteristic, bArr3, min2, false);
                                i16 += min2;
                                k();
                            }
                            boolean d8 = d(bArr, correctBufferCheckSize);
                            if (d8) {
                                i11 = 0;
                            } else {
                                getDfuProgressInfo().addBytesSent(0 - correctBufferCheckSize);
                                i11++;
                                ZLogger.d("check failed, retransTimes: " + i11);
                            }
                            if (i11 >= 3) {
                                ZLogger.w("Error while buffer check, reach max try times: " + i11 + ", MAX_BUFFER_CHECK_RETRANS_TIME: 3");
                                throw new OtaException("Error while buffer check", DfuException.ERROR_BUFFER_CHECK_REACH_MAX_RETRY_TIMES);
                            }
                            if (d8) {
                                break;
                            }
                        } else {
                            if (!getDfuProgressInfo().isFileSendOver()) {
                                ZLogger.e("Error while reading file with size: " + correctBufferCheckSize);
                                throw new OtaException("Error while reading file", 257);
                            }
                            ZLogger.i("image file has already been send over");
                        }
                    } catch (IOException unused) {
                        throw new OtaException("Error while reading file", 257);
                    }
                }
                ZLogger.d("the last sent to remote may not alignment, reinstall input stream");
                m();
                alignmentSendBytes(this.mImageUpdateOffset, true);
                i8 = this.mImageUpdateOffset;
                if (i8 != 0) {
                }
                correctBufferCheckSize = getDfuProgressInfo().correctBufferCheckSize(i12);
                ZLogger.d(getDfuProgressInfo().toString());
                if (correctBufferCheckSize <= 0) {
                }
            }
        }
    }

    private void b(byte[] bArr) {
        notifyStateChanged(DfuConstants.PROGRESS_ACTIVE_IMAGE_AND_RESET);
        int i8 = 4128;
        if (this.mAborted) {
            throw new OtaException("user aborted", 4128);
        }
        boolean z7 = false;
        try {
            ZLogger.d("<< OPCODE_DFU_ACTIVE_IMAGE_RESET(0x04)");
            z7 = a(this.S, bArr, false);
        } catch (DfuException e8) {
            if (e8.getErrCode() != 4128) {
                if (getDfuConfig().isWaitActiveCmdAckEnabled()) {
                    ZLogger.w("active cmd has no response, notify error");
                    i8 = e8.getErrCode();
                } else {
                    ZLogger.d("active cmd has no response, ignore");
                    z7 = true;
                }
            }
        }
        i8 = 0;
        if (!z7) {
            throw new OtaException(i8);
        }
        ZLogger.d("image active success");
        c(this.mErrorState);
        closeInputStream(this.mCurBinInputStream);
    }

    private byte[] b(long j8) {
        this.mErrorState = 0;
        this.F = true;
        try {
            synchronized (this.f15965o) {
                try {
                    if (this.mErrorState == 0 && this.D == null && this.mConnectionState == 515) {
                        this.F = false;
                        ZLogger.v(this.TDBG, "wait for notification, wait for " + j8 + "ms");
                        this.f15965o.wait(j8);
                    }
                    if (this.mErrorState == 0 && !this.F) {
                        ZLogger.w("wait for notification, but not come");
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
            return this.D;
        }
        throw new OtaException("Unable to receive notification", this.mErrorState);
    }

    private void a(boolean z7) {
        ZLogger.d("<< OPCODE_DFU_ENSURE_CURRENT_BUFFER(0x0C)");
        a(this.S, new byte[]{12, !z7 ? 1 : 0}, false);
    }

    public boolean a(BaseBinInputStream baseBinInputStream, int i8, int i9) {
        ZLogger.v(this.DBG, String.format(Locale.US, "nextBinSize=%d, mBytesSentBuffer=%d, bufferSize=%d", Integer.valueOf(baseBinInputStream.remainSizeInBytes()), Integer.valueOf(i8), Integer.valueOf(i9)));
        return baseBinInputStream.remainSizeInBytes() + i8 > i9;
    }
}
