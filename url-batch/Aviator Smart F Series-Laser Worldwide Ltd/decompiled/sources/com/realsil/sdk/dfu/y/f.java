package com.realsil.sdk.dfu.y;

import android.content.Context;
import android.hardware.usb.UsbDevice;
import android.os.Handler;
import android.os.Looper;
import com.google.android.exoplayer2.C;
import com.realsil.sdk.core.logger.ZLogger;
import com.realsil.sdk.core.usb.GlobalUsbGatt;
import com.realsil.sdk.core.usb.UsbGatt;
import com.realsil.sdk.core.usb.UsbGattCharacteristic;
import com.realsil.sdk.core.utility.DataConverter;
import com.realsil.sdk.dfu.DfuException;
import com.realsil.sdk.dfu.exception.OtaException;
import com.realsil.sdk.dfu.internal.base.DfuThreadCallback;
import com.realsil.sdk.dfu.m.o;
import com.realsil.sdk.dfu.model.DfuConfig;
import java.util.Locale;

/* loaded from: classes4.dex */
public abstract class f extends c implements o {
    public GlobalUsbGatt B;
    public UsbGatt C;
    public volatile byte[] D;
    public volatile boolean E;
    public volatile boolean F;
    public volatile boolean G;
    public final Handler H;
    public Runnable I;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            f fVar = f.this;
            if (fVar.mConnectionState == 513) {
                fVar.n();
            }
        }
    }

    public f(Context context, DfuConfig dfuConfig, DfuThreadCallback dfuThreadCallback) {
        super(context, dfuConfig, dfuThreadCallback);
        this.D = null;
        this.E = false;
        this.F = false;
        this.G = false;
        this.H = new Handler(Looper.getMainLooper());
        this.I = new a();
    }

    public void a(UsbGatt usbGatt) {
        if (usbGatt != null) {
            UsbDevice device = usbGatt.getDevice();
            ZLogger.d(this.DBG, "close gatt connection: " + device.getDeviceName());
            GlobalUsbGatt globalUsbGatt = this.B;
            if (globalUsbGatt != null) {
                globalUsbGatt.closeGatt(device.getDeviceName());
            } else {
                usbGatt.close();
            }
        }
        setConnectionState(1280);
    }

    @Override // com.realsil.sdk.dfu.internal.base.BaseDfuTask
    public boolean abort() {
        Handler handler = this.H;
        if (handler != null) {
            handler.removeCallbacks(this.I);
        }
        return super.abort();
    }

    public void b(int i8) {
        this.f15969s = i8 + (-3) > 16 ? (i8 / 16) * 16 : 16;
        ZLogger.d("> mBufferCheckMtuSize=" + this.f15969s);
    }

    public void c(int i8) {
        sleepInner(1000L);
        ZLogger.d(String.format("terminateConnection, error = 0x%04X", Integer.valueOf(i8)));
        UsbGatt usbGatt = this.C;
        if (usbGatt != null) {
            b(usbGatt);
            a(this.C, getDfuConfig().isErrorActionEnabled(2));
            a(this.C);
        }
    }

    @Override // com.realsil.sdk.dfu.y.c, com.realsil.sdk.dfu.internal.base.BaseDfuTask
    public void initialize() {
        super.initialize();
        this.B = GlobalUsbGatt.getInstance();
    }

    public boolean n() {
        if (this.C == null) {
            ZLogger.w("mUsbGatt == null");
            this.mErrorState = 258;
            notifyConnectionLock();
            return false;
        }
        if (this.mAborted) {
            ZLogger.w("task already aborted, ignore");
            return false;
        }
        ZLogger.d(this.VDBG, "Attempting to start service discovery...");
        boolean discoverServices = this.C.discoverServices();
        if (!discoverServices) {
            ZLogger.w(this.DBG, "discoverServices failed");
            this.mErrorState = 258;
            notifyConnectionLock();
        }
        return discoverServices;
    }

    public void o() {
        setConnectionState(513);
        if (this.H == null) {
            n();
        } else {
            ZLogger.d("delay to discover service for : 1600");
            this.H.postDelayed(this.I, 1600L);
        }
    }

    public final void a(UsbGatt usbGatt, boolean z7) {
    }

    public void b(UsbGatt usbGatt) {
        int i8 = this.mConnectionState;
        if (i8 == 0 || i8 == 1280) {
            ZLogger.d(this.DBG, "already disconnect");
            return;
        }
        if (usbGatt == null) {
            ZLogger.d(this.DBG, "gatt == null");
            setConnectionState(0);
        } else {
            setConnectionState(1024);
            usbGatt.disconnect();
            waitUntilDisconnected();
        }
    }

    public boolean a(UsbGatt usbGatt, int i8) {
        this.mErrorState = 0;
        this.G = false;
        ZLogger.d(this.DBG, "requestMtu: " + i8);
        if (!usbGatt.requestMtu(i8)) {
            ZLogger.w("requestMtu failed");
            return false;
        }
        try {
            synchronized (this.f15965o) {
                try {
                    if (!this.G && this.mErrorState == 0) {
                        if (this.VDBG) {
                            ZLogger.v("wait mtu request callback for 15000ms");
                        }
                        this.f15965o.wait(C.DEFAULT_SEEK_FORWARD_INCREMENT_MS);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (InterruptedException e8) {
            ZLogger.w("requestMtu: Sleeping interrupted, e = " + e8);
        }
        if (this.G || this.mErrorState != 0) {
            return true;
        }
        ZLogger.d(this.DBG, "requestMtu No CallBack");
        return false;
    }

    public final boolean a(UsbGatt usbGatt, UsbGattCharacteristic usbGattCharacteristic, byte[] bArr, int i8) {
        String str;
        if (usbGatt == null) {
            str = "gatt == null";
        } else {
            if (usbGattCharacteristic != null) {
                if (bArr.length > i8) {
                    byte[] bArr2 = new byte[i8];
                    System.arraycopy(bArr, 0, bArr2, 0, i8);
                    bArr = bArr2;
                }
                if (this.DBG) {
                    ZLogger.v(String.format(Locale.US, "[TX] WRITE_TYPE_0x%02X, %s << (%d)%s", Integer.valueOf(usbGattCharacteristic.getWriteType()), usbGattCharacteristic.getUuid(), Integer.valueOf(bArr.length), DataConverter.bytes2Hex(bArr)));
                }
                usbGattCharacteristic.setValue(bArr);
                return usbGatt.writeCharacteristic(usbGattCharacteristic);
            }
            str = "characteristic == null";
        }
        ZLogger.w(str);
        return false;
    }

    public boolean a(UsbGatt usbGatt, UsbGattCharacteristic usbGattCharacteristic, byte[] bArr, int i8, boolean z7) {
        if (!z7 && this.mAborted) {
            throw new OtaException("user aborted", 4128);
        }
        if (bArr == null || i8 < 0) {
            ZLogger.w("value == null || size < 0");
            return false;
        }
        this.D = null;
        this.mWriteRetransFlag = true;
        boolean z8 = false;
        int i9 = 0;
        while (this.mWriteRetransFlag) {
            this.mWriteRequestCompleted = false;
            if (i9 > 0) {
                ZLogger.d(this.DBG, "re-send command just wait a while");
                sleepInner(1000L);
                if (!z7 && this.mAborted) {
                    throw new OtaException("user aborted", 4128);
                }
            }
            z8 = a(usbGatt, usbGattCharacteristic, bArr, i8);
            if (z8) {
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

    public final boolean a(UsbGatt usbGatt, UsbGattCharacteristic usbGattCharacteristic, byte[] bArr, boolean z7) {
        return a(usbGatt, usbGattCharacteristic, bArr, bArr != null ? bArr.length : -1, z7);
    }

    public boolean a(UsbGattCharacteristic usbGattCharacteristic, byte[] bArr, boolean z7) {
        return a(this.C, usbGattCharacteristic, bArr, z7);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public byte[] a(UsbGatt usbGatt, UsbGattCharacteristic usbGattCharacteristic) {
        int i8;
        String str;
        if (this.mAborted) {
            throw new OtaException("user aborted", 4128);
        }
        if (usbGatt == null) {
            str = "gatt == null";
        } else if (usbGattCharacteristic == null) {
            str = "characteristic == null";
        } else {
            this.mErrorState = 0;
            this.mReadRxData = null;
            this.mReadRequestCompleted = false;
            if (usbGatt.readCharacteristic(usbGattCharacteristic)) {
                synchronized (this.mReadLock) {
                    try {
                        if (this.mErrorState == 0 && !this.mReadRequestCompleted && this.mConnectionState == 515) {
                            this.mReadLock.wait(C.DEFAULT_SEEK_FORWARD_INCREMENT_MS);
                        }
                    } catch (InterruptedException e8) {
                        ZLogger.w("sleeping interrupted:" + e8);
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
            ZLogger.w("readCharacteristic failed");
            i8 = DfuException.ERROR_SEND_COMMAND_FAIL;
            this.mErrorState = i8;
            if (this.mErrorState != 0) {
            }
        }
        ZLogger.w(str);
        return null;
    }

    public byte[] a(UsbGattCharacteristic usbGattCharacteristic) {
        return a(this.C, usbGattCharacteristic);
    }
}
