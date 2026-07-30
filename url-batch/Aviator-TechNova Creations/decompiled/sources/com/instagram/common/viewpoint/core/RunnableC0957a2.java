package com.instagram.common.viewpoint.core;

import android.animation.ObjectAnimator;
import com.google.common.base.Ascii;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.a2, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC0957a2 implements Runnable {
    public static byte[] A01;
    public final /* synthetic */ C01905q A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 45);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{Ascii.FF, 1, Ascii.GS, 5, Ascii.FF};
    }

    public RunnableC0957a2(C01905q c01905q) {
        this.A00 = c01905q;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String A00 = A00(0, 5, 64);
        if (AbstractC0838Vl.A02(this)) {
            return;
        }
        try {
            this.A00.A0T.A0F().AJx();
            ObjectAnimator.ofFloat(this.A00.A0Q, A00, 1.0f, 0.0f).setDuration(100L).start();
            ObjectAnimator.ofFloat(this.A00.A0P, A00, 1.0f, 0.0f).setDuration(100L).start();
            ObjectAnimator duration = ObjectAnimator.ofFloat(((AbstractC0950Zv) this.A00).A09, A00, 1.0f, 0.0f).setDuration(100L);
            duration.addListener(new C0956a1(this));
            duration.start();
        } catch (Throwable th) {
            AbstractC0838Vl.A00(th, this);
        }
    }
}
