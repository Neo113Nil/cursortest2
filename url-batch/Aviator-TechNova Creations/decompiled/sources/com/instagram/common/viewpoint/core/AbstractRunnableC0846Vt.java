package com.instagram.common.viewpoint.core;

import com.google.common.base.Ascii;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.facebook.ads.redexgen.X.Vt, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractRunnableC0846Vt implements Runnable {
    public static byte[] A01;
    public static final AtomicBoolean A02;
    public static final AtomicBoolean A03;
    public static final AtomicReference<InterfaceC0836Vj> A04;
    public final C0834Vh A00;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 32);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A01 = new byte[]{44, Ascii.VT, 16, 16, Ascii.US, Ascii.FS, Ascii.DC2, Ascii.ESC, 94, Ascii.GS, Ascii.FF, Ascii.ESC, Ascii.US, 10, Ascii.ESC, Ascii.SUB, 80, 94, 42, Ascii.SYN, Ascii.FF, Ascii.ESC, Ascii.US, Ascii.SUB, 68, 94};
    }

    public abstract void A07();

    static {
        A03();
        A02 = new AtomicBoolean();
        A03 = new AtomicBoolean(false);
        A04 = new AtomicReference<>();
    }

    public AbstractRunnableC0846Vt() {
        if (A03.get()) {
            this.A00 = C0851Vy.A01(new C0850Vx(A02(0, 26, 94) + Thread.currentThread().getName()));
        } else {
            this.A00 = null;
        }
    }

    public static void A04(boolean z) {
        A03.set(z);
    }

    public static void A05(boolean z, InterfaceC0836Vj interfaceC0836Vj) {
        A02.set(z);
        A04.set(interfaceC0836Vj);
    }

    public final C0834Vh A06() {
        return this.A00;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (AbstractC0838Vl.A02(this)) {
            return;
        }
        try {
            if (A03.get()) {
                C0851Vy.A03(this);
            }
            try {
                A07();
            } catch (Throwable th) {
                if (A02.get()) {
                    W0.A00().AAo(3301, th);
                    InterfaceC0836Vj interfaceC0836Vj = A04.get();
                    if (interfaceC0836Vj != null) {
                        interfaceC0836Vj.AHp(th, this);
                    }
                } else {
                    throw th;
                }
            }
            if (A03.get()) {
                C0851Vy.A04(this);
            }
        } catch (Throwable th2) {
            AbstractC0838Vl.A00(th2, this);
        }
    }
}
