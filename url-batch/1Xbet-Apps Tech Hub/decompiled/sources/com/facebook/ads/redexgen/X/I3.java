package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.util.Log;
import com.facebook.ads.internal.exoplayer2.thirdparty.video.DummySurface;
import com.google.common.base.Ascii;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class I3 extends HandlerThread implements Handler.Callback {
    public static byte[] A05;
    public Handler A00;
    public HS A01;
    public DummySurface A02;
    public Error A03;
    public RuntimeException A04;

    static {
        A02();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 57);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A05 = new byte[]{-34, Ascii.SI, 7, 7, 19, -19, Ascii.SI, Ascii.FF, 0, -5, -3, -1, -70, -43, -35, -32, -39, -40, -108, -24, -29, -108, -35, -30, -35, -24, -35, -43, -32, -35, -18, -39, -108, -40, -23, -31, -31, -19, -108, -25, -23, -26, -38, -43, -41, -39, -121, -94, -86, -83, -90, -91, 97, -75, -80, 97, -77, -90, -83, -90, -94, -76, -90, 97, -91, -74, -82, -82, -70, 97, -76, -74, -77, -89, -94, -92, -90, -35, -18, -26, -26, -14, -52, -18, -21, -33, -38, -36, -34};
    }

    public I3() {
        super(A00(77, 12, 64));
    }

    private void A01() {
        HI.A01(this.A01);
        this.A01.A08();
    }

    private void A03(int i) {
        HI.A01(this.A01);
        this.A01.A09(i);
        this.A02 = new DummySurface(this, this.A01.A07(), i != 0);
    }

    public final DummySurface A04(int i) {
        start();
        this.A00 = new Handler(getLooper(), this);
        this.A01 = new HS(this.A00);
        boolean z = false;
        synchronized (this) {
            this.A00.obtainMessage(1, i, 0).sendToTarget();
            while (this.A02 == null && this.A04 == null && this.A03 == null) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = this.A04;
        if (runtimeException == null) {
            Error error = this.A03;
            if (error == null) {
                return (DummySurface) HI.A01(this.A02);
            }
            throw error;
        }
        throw runtimeException;
    }

    public final void A05() {
        HI.A01(this.A00);
        this.A00.sendEmptyMessage(2);
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x007f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean handleMessage(Message message) {
        try {
            switch (message.what) {
                case 1:
                    try {
                        A03(message.arg1);
                        synchronized (this) {
                            notify();
                        }
                    } catch (Error e) {
                        Log.e(A00(0, 12, 97), A00(12, 34, 59), e);
                        this.A03 = e;
                        synchronized (this) {
                            notify();
                        }
                    } catch (RuntimeException e2) {
                        Log.e(A00(0, 12, 97), A00(12, 34, 59), e2);
                        this.A04 = e2;
                        synchronized (this) {
                            notify();
                        }
                    }
                    return true;
                case 2:
                    try {
                        A01();
                    } finally {
                        try {
                            return true;
                        } finally {
                        }
                    }
                    return true;
                default:
                    return true;
            }
        } catch (Throwable th) {
            synchronized (this) {
            }
        }
        synchronized (this) {
            notify();
            throw th;
        }
    }
}
