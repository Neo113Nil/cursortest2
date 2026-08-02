package com.instagram.common.viewpoint.core;

import com.google.common.base.Ascii;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* renamed from: com.facebook.ads.redexgen.X.mV, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1687mV implements InterfaceC0315Bf {
    public static byte[] A08;
    public static String[] A09 = {"6Pd6msxcVNGBSX02eJXjJuTK1755qRBj", "HohFYYIoFYVFLjySAriRsbI1EyK3MfzH", "CeUiguCmFwn8TW5CDLSIDkbyI8ACimQb", "zlyrIOO0KfkMjpYTb9psfC0NNgHcfA", "hplEZcFLtp2y3xCWfrXOGnyD7Ln2K5MA", "IDL7x3RfZufseciwLxrhiUDjrsxZNied", "XKrD5ajpOT4k5Fxpc35DaF0adCV7zARl", "Sdgzg0MlhPfZZU1TENhiXzUXxxUExQMT"};
    public InterfaceC0314Be A00;
    public final AnonymousClass31 A01;
    public final AnonymousClass56 A02;
    public final C7S A03;
    public final M2 A04;
    public final Executor A05;
    public volatile C4M<Void, IOException> A06;
    public volatile boolean A07;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A08, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A09;
            if (strArr[5].charAt(20) == strArr[2].charAt(20)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A09;
            strArr2[1] = "fxMtGUUqqO78zEEYN3IhZEPjI2AJG4xW";
            strArr2[6] = "cS7s2KNWeBHf1m4W4BuqIbsBl519HGHJ";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 68);
            i4++;
        }
    }

    public static void A02() {
        A08 = new byte[]{Ascii.US, 34, 34, Ascii.FS, Ascii.RS, Ascii.ESC, Ascii.SI, 17, 17, 16, Ascii.FF, -1, 7, 9, 16, -1};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.instagram.common.viewpoint.core.InterfaceC0315Bf
    public final void A5v(InterfaceC0314Be interfaceC0314Be) throws IOException, InterruptedException {
        this.A00 = interfaceC0314Be;
        if (0 != 0) {
            throw new NullPointerException(A01(0, 3, 122));
        }
        boolean z = false;
        while (!z) {
            try {
                if (this.A07) {
                    break;
                }
                this.A06 = new C1688mW(this);
                if (0 != 0) {
                    throw new NullPointerException(A01(3, 7, 104));
                }
                this.A05.execute(this.A06);
                try {
                    this.A06.get();
                    z = true;
                } catch (ExecutionException e) {
                    Throwable th = (Throwable) C3M.A01(e.getCause());
                    if (0 == 0) {
                        if (th instanceof IOException) {
                            throw ((IOException) th);
                        }
                        AbstractC01424a.A11(th);
                        throw null;
                    }
                }
            } catch (Throwable th2) {
                ((C4M) C3M.A01(this.A06)).A02();
                if (0 == 0) {
                    throw th2;
                }
                throw new NullPointerException(A01(10, 6, 86));
            }
        }
        ((C4M) C3M.A01(this.A06)).A02();
        if (0 != 0) {
            throw new NullPointerException(A01(10, 6, 86));
        }
    }

    static {
        A02();
    }

    public C1687mV(C1821oi c1821oi, C1483ix c1483ix, Executor executor) {
        this.A05 = (Executor) C3M.A01(executor);
        C3M.A01(c1821oi.A03);
        this.A02 = new AnonymousClass53().A06(c1821oi.A03.A00).A08(c1821oi.A03.A04).A02(4).A09();
        this.A03 = c1483ix.A07();
        this.A04 = new M2(this.A03, this.A02, null, new M1() { // from class: com.facebook.ads.redexgen.X.mX
            @Override // com.instagram.common.viewpoint.core.M1
            public final void AEp(long j, long j2, long j3) {
                C1687mV.this.A03(j, j2, j3);
            }
        });
        this.A01 = c1483ix.A02();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A03(long j, long j2, long j3) {
        float f;
        if (this.A00 == null) {
            return;
        }
        if (j == -1 || j == 0) {
            f = -1.0f;
        } else {
            f = (j2 * 100.0f) / j;
        }
        this.A00.AEo(j, j2, f);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4M != com.facebook.ads.androidx.media3.common.util.RunnableFutureTask<java.lang.Void, java.io.IOException> */
    @Override // com.instagram.common.viewpoint.core.InterfaceC0315Bf
    public final void cancel() {
        this.A07 = true;
        C4M<Void, IOException> c4m = this.A06;
        if (c4m != null) {
            c4m.cancel(true);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0315Bf
    public final void remove() {
        this.A03.A0E().AHk(this.A03.A0F().A4d(this.A02));
    }
}
