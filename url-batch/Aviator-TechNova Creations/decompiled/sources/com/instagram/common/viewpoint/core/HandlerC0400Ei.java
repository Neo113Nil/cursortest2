package com.instagram.common.viewpoint.core;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.google.common.base.Ascii;
import com.instagram.common.viewpoint.core.InterfaceC0401Ej;
import java.io.IOException;
import java.util.Arrays;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.Ei, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class HandlerC0400Ei<T extends InterfaceC0401Ej> extends Handler implements Runnable {
    public static byte[] A0C;
    public static String[] A0D = {"YmYVw2S8DUZhSIJBKV9mYTBB1tKcIZso", "NDdcnO0NsMMFHF2bezmvYcIUkVZ5OtU8", "8rmJYKaybwW0Gr1XfrD6wU0k3D4t0vPA", "YmCBBtrMVj6S7IBVYd0tuHNRqLOHp", "BNlgZVMbySVAlN8KpxiSIEQEMbKarpeH", "QLj0CyLyWcLoHh5we5tUZrDrecYjAsKC", "eBbXtTNPiPKoehNQThYFNgHDUWIcJfTE", "1Eh"};
    public boolean A00;
    public int A01;
    public InterfaceC0398Eg<T> A02;
    public C0399Eh A03;
    public IOException A04;
    public Thread A05;
    public boolean A06;
    public final int A07;
    public final long A08;
    public final T A09;
    public volatile boolean A0A;
    public final /* synthetic */ C1639lc A0B;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0C, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 58);
        }
        return new String(copyOfRange);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @MetaExoPlayerCustomization("Customized to support load retries")
    private void A02() {
        InterfaceExecutorC0417Ez interfaceExecutorC0417Ez;
        HandlerC0400Ei handlerC0400Ei;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.A02.AE3(this.A09, elapsedRealtime, elapsedRealtime - this.A08, this.A01);
        this.A04 = null;
        interfaceExecutorC0417Ez = this.A0B.A02;
        handlerC0400Ei = this.A0B.A00;
        interfaceExecutorC0417Ez.execute((Runnable) C3M.A01(handlerC0400Ei));
    }

    public static void A04() {
        A0C = new byte[]{-122, -87, -101, -98, -114, -101, -83, -91, -99, -61, -62, -99, -76, -101, -77, -69, -67, -64, -57, 110, -77, -64, -64, -67, -64, 110, -70, -67, -81, -78, -73, -68, -75, 110, -63, -62, -64, -77, -81, -69, -28, -3, -12, 7, -1, -12, -14, 3, -12, -13, -81, -12, 1, 1, -2, 1, -81, -5, -2, -16, -13, -8, -3, -10, -81, 2, 3, 1, -12, -16, -4, 5, Ascii.RS, Ascii.NAK, 40, 32, Ascii.NAK, 19, 36, Ascii.NAK, Ascii.DC4, -48, Ascii.NAK, 40, 19, Ascii.NAK, 32, 36, Ascii.EM, Ascii.US, Ascii.RS, -48, Ascii.CAN, 17, Ascii.RS, Ascii.DC4, Ascii.FS, Ascii.EM, Ascii.RS, Ascii.ETB, -48, Ascii.FS, Ascii.US, 17, Ascii.DC4, -48, 19, Ascii.US, Ascii.GS, 32, Ascii.FS, Ascii.NAK, 36, Ascii.NAK, Ascii.DC4, -63, -38, -47, -28, -36, -47, -49, -32, -47, -48, -116, -47, -28, -49, -47, -36, -32, -43, -37, -38, -116, -40, -37, -51, -48, -43, -38, -45, -116, -33, -32, -34, -47, -51, -39, Ascii.EM, Ascii.FS, Ascii.SO, 17, -25};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // android.os.Handler
    @MetaExoPlayerCustomization("enableContinueLoadingLogging and currentLoadErrorAction saving are custom")
    public final void handleMessage(Message message) {
        int i;
        int i2;
        int i3;
        long j;
        if (AbstractC0838Vl.A02(this)) {
            return;
        }
        String[] strArr = A0D;
        if (strArr[3].length() == strArr[7].length()) {
            throw new RuntimeException();
        }
        A0D[6] = "QgUPNZuYIqR5G6UUc33KVEWLFVIzbhR6";
        try {
        } catch (Throwable th) {
            AbstractC0838Vl.A00(th, this);
        }
        if (this.A0A) {
            return;
        }
        if (message.what == 0) {
            A02();
            this.A00 = false;
            return;
        }
        if (message.what == 3) {
            throw ((Error) message.obj);
        }
        A03();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = elapsedRealtime - this.A08;
        InterfaceC0398Eg interfaceC0398Eg = (InterfaceC0398Eg) C3M.A01(this.A02);
        if (this.A06) {
            interfaceC0398Eg.ADx(this.A09, elapsedRealtime, j2, false);
            return;
        }
        switch (message.what) {
            case 1:
                try {
                    interfaceC0398Eg.ADz(this.A09, elapsedRealtime, j2);
                    return;
                } catch (RuntimeException e) {
                    AnonymousClass44.A08(A01(0, 8, 0), A01(71, 44, Opcodes.FNEG), e);
                    this.A0B.A01 = new C0405En(e);
                    return;
                }
            case 2:
                this.A04 = (IOException) message.obj;
                this.A01++;
                C0399Eh AE0 = interfaceC0398Eg.AE0(this.A09, elapsedRealtime, j2, this.A04, this.A01);
                this.A03 = AE0;
                i = AE0.A00;
                if (i == 3) {
                    this.A0B.A01 = this.A04;
                    return;
                }
                i2 = AE0.A00;
                if (i2 != 2) {
                    i3 = AE0.A00;
                    if (i3 == 1) {
                        this.A01 = 1;
                    }
                    this.A00 = true;
                    j = AE0.A01;
                    A06(j != -9223372036854775807L ? AE0.A01 : A00());
                    return;
                }
                return;
            default:
                return;
        }
        AbstractC0838Vl.A00(th, this);
    }

    static {
        A04();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Eg != com.facebook.ads.androidx.media3.exoplayer.upstream.Loader$Callback<T extends com.facebook.ads.redexgen.X.Ej> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Ei != com.facebook.ads.androidx.media3.exoplayer.upstream.Loader$LoadTask<T extends com.facebook.ads.redexgen.X.Ej> */
    public HandlerC0400Ei(C1639lc c1639lc, Looper looper, T loadable, InterfaceC0398Eg<T> interfaceC0398Eg, int i, long j) {
        super(looper);
        this.A0B = c1639lc;
        this.A09 = loadable;
        this.A02 = interfaceC0398Eg;
        this.A07 = i;
        this.A08 = j;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Ei != com.facebook.ads.androidx.media3.exoplayer.upstream.Loader$LoadTask<T extends com.facebook.ads.redexgen.X.Ej> */
    @MetaExoPlayerCustomization("D36993743 Customized Hero Retry Delay Values")
    private long A00() {
        return AbstractC1413hY.A00(this.A01, 0);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Ei != com.facebook.ads.androidx.media3.exoplayer.upstream.Loader$LoadTask<T extends com.facebook.ads.redexgen.X.Ej> */
    private void A03() {
        this.A0B.A00 = null;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Ei != com.facebook.ads.androidx.media3.exoplayer.upstream.Loader$LoadTask<T extends com.facebook.ads.redexgen.X.Ej> */
    public final void A05(int i) throws IOException {
        if (this.A04 == null || this.A01 <= i) {
        } else {
            throw this.A04;
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Ei != com.facebook.ads.androidx.media3.exoplayer.upstream.Loader$LoadTask<T extends com.facebook.ads.redexgen.X.Ej> */
    public final void A06(long j) {
        HandlerC0400Ei handlerC0400Ei;
        handlerC0400Ei = this.A0B.A00;
        C3M.A08(handlerC0400Ei == null);
        this.A0B.A00 = this;
        if (j > 0) {
            sendEmptyMessageDelayed(0, j);
        } else {
            A02();
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Ei != com.facebook.ads.androidx.media3.exoplayer.upstream.Loader$LoadTask<T extends com.facebook.ads.redexgen.X.Ej> */
    public final void A07(boolean z) {
        this.A0A = z;
        this.A04 = null;
        if (hasMessages(0)) {
            this.A06 = true;
            removeMessages(0);
            if (!z) {
                sendEmptyMessage(1);
            }
        } else {
            synchronized (this) {
                this.A06 = true;
                this.A09.A4j();
                Thread thread = this.A05;
                if (thread != null) {
                    thread.interrupt();
                }
            }
        }
        if (z) {
            A03();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            ((InterfaceC0398Eg) C3M.A01(this.A02)).ADx(this.A09, elapsedRealtime, elapsedRealtime - this.A08, true);
            this.A02 = null;
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Ei != com.facebook.ads.androidx.media3.exoplayer.upstream.Loader$LoadTask<T extends com.facebook.ads.redexgen.X.Ej> */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        if (AbstractC0838Vl.A02(this)) {
            return;
        }
        try {
            try {
                try {
                    try {
                        synchronized (this) {
                            z = !this.A06;
                            this.A05 = Thread.currentThread();
                        }
                        if (z) {
                            C4S.A02(A01(Opcodes.FCMPG, 5, Opcodes.DREM) + this.A09.getClass().getSimpleName());
                            try {
                                this.A09.AAi();
                            } finally {
                                C4S.A00();
                            }
                        }
                        synchronized (this) {
                            this.A05 = null;
                            Thread.interrupted();
                        }
                        if (!this.A0A) {
                            sendEmptyMessage(1);
                        }
                    } catch (Throwable th) {
                        AbstractC0838Vl.A00(th, this);
                    }
                } catch (Error e) {
                    if (!this.A0A) {
                        AnonymousClass44.A08(A01(0, 8, 0), A01(40, 31, 85), e);
                        obtainMessage(3, e).sendToTarget();
                    }
                    throw e;
                }
            } catch (Exception e2) {
                if (!this.A0A) {
                    AnonymousClass44.A08(A01(0, 8, 0), A01(Opcodes.DREM, 35, 50), e2);
                    obtainMessage(2, new C0405En(e2)).sendToTarget();
                }
            }
        } catch (IOException e3) {
            if (!this.A0A) {
                obtainMessage(2, e3).sendToTarget();
            }
        } catch (OutOfMemoryError e4) {
            if (!this.A0A) {
                AnonymousClass44.A08(A01(0, 8, 0), A01(8, 32, 20), e4);
                obtainMessage(2, new C0405En(e4)).sendToTarget();
            }
        }
    }
}
