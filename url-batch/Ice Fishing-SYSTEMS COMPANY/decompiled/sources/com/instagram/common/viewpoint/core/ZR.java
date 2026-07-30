package com.instagram.common.viewpoint.core;

import android.content.Context;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderImpl;
import com.facebook.ads.internal.util.process.ProcessUtils;
import java.util.Arrays;

/* loaded from: assets/audience_network/classes2.dex */
public final class ZR implements TA {
    public static ZR A07;
    public static byte[] A08;
    public InterfaceC1069Lx A00;
    public T1 A01;
    public T9 A02;
    public TP A03;
    public U7 A04;
    public VM A05;
    public CY A06;

    static {
        A07();
    }

    public static String A06(int i, int i4, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A08, i, i + i4);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] - i9) - 118);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A08 = new byte[]{44, 62, 76, 76, 66, 72, 71, -7, 61, 58, 77, 58, -7, 66, 71, 66, 77, 66, 58, 69, 66, 83, 62, 61, 28, -13, -19, 32, 27, -15, 28, 15, 26, 25, 28, 30, -3, 15, 29, 29, 19, 25, 24, -18, 11, 30, 11, -13, 24, 19, 30, 19, 11, 22, 19, 36, 15, 14};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final synchronized void A0C(C1835ge c1835ge) {
        if (this.A06 != null) {
            return;
        }
        this.A03 = A01(c1835ge);
        this.A06 = A05(c1835ge, this.A03, A03(c1835ge));
        A09(c1835ge, A00(c1835ge, this.A06));
        A0A(c1835ge, this.A06);
        A0B(c1835ge, this.A06);
        if (this.A06 != null) {
            this.A06.A6d();
        }
    }

    public static SR A00(C1835ge c1835ge, CY cy) {
        if (!C1289Up.A1r(c1835ge) || cy == null) {
            return null;
        }
        return SS.A00().A00(cy);
    }

    public static TP A01(C1835ge c1835ge) {
        return TQ.A00().A00(c1835ge, new C1538bp());
    }

    public static synchronized ZR A02() {
        ZR zr;
        synchronized (ZR.class) {
            if (A07 == null) {
                A07 = new ZR();
            }
            zr = A07;
        }
        return zr;
    }

    public static InterfaceC1790fv A03(C1835ge c1835ge) {
        if (!C1289Up.A1n(c1835ge)) {
            return null;
        }
        return C1808gD.A01(c1835ge);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.TA
    /* renamed from: A04, reason: merged with bridge method [inline-methods] */
    public final synchronized CY A9F() {
        return this.A06;
    }

    public static CY A05(C1835ge c1835ge, TP tp, InterfaceC1790fv interfaceC1790fv) {
        if (!C1289Up.A2m(c1835ge) || interfaceC1790fv == null || ProcessUtils.isRemoteRenderingProcess()) {
            return null;
        }
        return AbstractC1831ga.A00().A00(c1835ge, tp, interfaceC1790fv, WI.A04(c1835ge), new ZW(new WA(c1835ge, A06(0, 0, 9), null, EnumC1314Vq.A08, 0, new C1318Vu(), AbstractC1366Xt.A01(C1289Up.A0N(c1835ge)), null, null, new C1958ij()), c1835ge), C1829gY.A00().A00());
    }

    public static void A08() {
        AbstractC1322Vy.A05(A06(30, 28, 52), A06(0, 24, 99), A06(24, 6, 68));
    }

    public static void A09(C1835ge c1835ge, SR sr) {
        if (!C1289Up.A1r(c1835ge) || sr == null) {
            return;
        }
        SP.A00().A00(sr, c1835ge);
    }

    public static void A0A(C1835ge c1835ge, CY cy) {
        if (!C1289Up.A0m(c1835ge) || cy == null) {
            return;
        }
        new C1234Sm(c1835ge, cy, new C1235Sn(), DynamicLoaderImpl.getBidderTokenProviderApi().A00());
    }

    public static void A0B(C1835ge c1835ge, CY cy) {
        if (cy == null) {
            return;
        }
        AbstractC1293Ut.A00(c1835ge, cy);
    }

    @Override // com.instagram.common.viewpoint.core.TA
    public final VA A6n(C1835ge c1835ge) {
        return WW.A01(c1835ge);
    }

    @Override // com.instagram.common.viewpoint.core.TA
    public final synchronized T9 A74(T8 t82) {
        if (this.A02 == null) {
            this.A02 = new C1405Zg(this);
        }
        return this.A02;
    }

    @Override // com.instagram.common.viewpoint.core.TA
    public final synchronized T1 A7G() {
        if (this.A01 == null) {
            this.A01 = new C1840gj();
        }
        return this.A01;
    }

    @Override // com.instagram.common.viewpoint.core.TA
    public final synchronized TP A7l(T8 t82) {
        if (this.A03 == null) {
            this.A03 = A01(t82.A02());
        }
        return this.A03;
    }

    @Override // com.instagram.common.viewpoint.core.TA
    public final synchronized InterfaceC1250Tc A7n(T8 t82) {
        return new C1733f0(t82);
    }

    @Override // com.instagram.common.viewpoint.core.TA
    public final synchronized TB A7x(final T8 t82) {
        return new AbstractC1537bo(t82) { // from class: com.facebook.ads.redexgen.X.72
            @Override // com.instagram.common.viewpoint.core.TB
            public final boolean A9m() {
                return TextureViewSurfaceTextureListenerC0839Cz.A09();
            }

            @Override // com.instagram.common.viewpoint.core.TB
            public final void ACP() {
                U2.A06(C1212Rp.A09(super.A00));
            }

            @Override // com.instagram.common.viewpoint.core.TB
            public final void ACn() {
                U2.A07(C1212Rp.A09(super.A00));
            }

            @Override // com.instagram.common.viewpoint.core.TB
            public final void ADI(C1835ge c1835ge) {
                OP.A01(c1835ge);
            }
        };
    }

    @Override // com.instagram.common.viewpoint.core.TA
    public final synchronized InterfaceC1069Lx A8C(T8 t82) {
        if (!C1289Up.A13(t82)) {
            return null;
        }
        if (this.A00 == null) {
            this.A00 = AbstractC1070Ly.A00().A00(new C1501bE(t82));
        }
        return this.A00;
    }

    @Override // com.instagram.common.viewpoint.core.TA
    public final synchronized TD A8y(T8 t82) {
        return new C1475ao(t82);
    }

    @Override // com.instagram.common.viewpoint.core.TA
    public final C1835ge A8z(Context context) {
        C1835ge sdkContext = T7.A00();
        if (sdkContext == null) {
            C1835ge sdkContext2 = new C1835ge(context, this);
            T7.A01(sdkContext2);
            return sdkContext2;
        }
        return sdkContext;
    }

    @Override // com.instagram.common.viewpoint.core.TA
    public final synchronized VM A90(C1835ge c1835ge) {
        if (this.A05 == null) {
            this.A05 = new XP(c1835ge);
        }
        return this.A05;
    }

    @Override // com.instagram.common.viewpoint.core.TA
    public final synchronized U7 A96() {
        if (this.A04 == null) {
            this.A04 = new U7();
            A08();
        }
        return this.A04;
    }
}
