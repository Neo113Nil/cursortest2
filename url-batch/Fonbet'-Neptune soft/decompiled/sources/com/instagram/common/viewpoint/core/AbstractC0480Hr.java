package com.instagram.common.viewpoint.core;

import android.content.res.Configuration;
import android.widget.RelativeLayout;
import com.google.common.base.Ascii;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Hr, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0480Hr extends RelativeLayout implements Wf {
    public static byte[] A0E;
    public static String[] A0F = {"uUMDphsbcltlMAasrXzhzXIIsD27sBrh", "kD4ASPr1mkkPPQg7686pKphnCznMXNdE", "3u4w9tHTXiQc09zCQQwrpogVyGpuea0B", "uLxjLzdSNqmjg5WlrsUTBNxe2IHJHDsH", "sowIyJkgs7pChNHWV216bYY5IvqkL5", "woZqrf3JBfr8DagdWcXdOyEt75sBOiDm", "mZPGIv6MosabarlDevuwzM4J02qRjqBR", "rZe00TaCIEKWr55DYJNI366SEGcMY1oV"};
    public static final int A0G;
    public String A00;
    public boolean A01;
    public final int A02;
    public final AbstractC1225eW A03;
    public final boolean A04;
    public final boolean A05;
    public final AbstractC1428hy A06;
    public final C1153dL A07;
    public final US A08;
    public final C0852Wh A09;
    public final XH A0A;
    public final InterfaceC0884Xn A0B;
    public final YY A0C;
    public final C1226eX A0D;

    public static String A16(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0E, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 77);
        }
        return new String(copyOfRange);
    }

    public static void A17() {
        A0E = new byte[]{95, 16, Ascii.EM, 95, 5, 32, 100};
        if (A0F[4].length() == 22) {
            throw new RuntimeException();
        }
        String[] strArr = A0F;
        strArr[2] = "lGg0879wdsNhw7V1Qtd20OQ8gEXobd5O";
        strArr[0] = "a2lydBkKvgM6UKG9QoQR6B5cBx9Kev1F";
    }

    public abstract ME A1A(String str);

    public abstract void A1D();

    public abstract void A1E();

    public abstract void A1G(boolean z);

    public abstract void A1H(boolean z);

    public abstract boolean A1I();

    public abstract boolean A1J();

    public abstract boolean A1K();

    public abstract C1098cR getFullScreenAdStyle();

    static {
        A17();
        A0G = (int) (AbstractC0856Wl.A02 * 80.0f);
    }

    public AbstractC0480Hr(C1153dL c1153dL, YY yy, US us, AbstractC1428hy abstractC1428hy, int i, boolean z, boolean z2, InterfaceC0884Xn interfaceC0884Xn, int i2) {
        super(c1153dL);
        this.A0A = new XH();
        this.A01 = false;
        this.A00 = A16(0, 0, 48);
        this.A03 = new C0481Hs(this);
        this.A02 = i;
        this.A07 = c1153dL;
        this.A05 = z;
        this.A04 = z2;
        this.A0B = interfaceC0884Xn;
        this.A0C = yy;
        this.A06 = abstractC1428hy;
        this.A08 = us;
        this.A0D = new C1226eX(this, 1, new WeakReference(this.A03), c1153dL);
        this.A0D.A0W(abstractC1428hy.A0i());
        this.A0D.A0X(abstractC1428hy.A0j());
        this.A09 = C0852Wh.A00(this.A07, this.A06, this);
        if (this.A06.A1U()) {
            this.A00 = A15(this.A02, i2);
        }
    }

    public static String A15(int i, int i2) {
        return A16(4, 3, 9) + (i + 1) + A16(0, 4, 50) + i2;
    }

    public void A1B() {
        this.A09.A03();
    }

    public final void A1C() {
        if (!this.A01) {
            this.A0D.A0U();
            this.A01 = true;
        }
    }

    public void A1F(boolean z) {
    }

    public AbstractC1428hy getAdDataBundle() {
        return this.A06;
    }

    public C1226eX getAdViewabilityChecker() {
        return this.A0D;
    }

    public XH getTouchDataRecorder() {
        return this.A0A;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }
}
