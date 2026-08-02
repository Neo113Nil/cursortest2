package com.instagram.common.viewpoint.core;

import android.content.Context;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderImpl;
import com.facebook.ads.internal.util.process.ProcessUtils;
import com.google.common.base.Ascii;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Wt, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0864Wt implements SS {
    public static C0864Wt A07;
    public static byte[] A08;
    public LL A00;
    public SJ A01;
    public SR A02;
    public InterfaceC0752Sh A03;
    public TP A04;
    public InterfaceC0800Ue A05;
    public InterfaceC0323Bn A06;

    static {
        A07();
    }

    public static String A06(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A08, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 118);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A08 = new byte[]{Ascii.SI, Ascii.CR, Ascii.CR, Ascii.DC2, Ascii.CR, 17, Ascii.SO, 58, Ascii.CR, Ascii.US, 45, 45, 35, 41, 40, -38, Ascii.RS, Ascii.ESC, 46, Ascii.ESC, -38, 35, 40, 35, 46, 35, Ascii.ESC, 38, 35, 52, Ascii.US, Ascii.RS, Ascii.FS, Ascii.SI, Ascii.SUB, Ascii.EM, Ascii.FS, Ascii.RS, -3, Ascii.SI, Ascii.GS, Ascii.GS, 19, Ascii.EM, Ascii.CAN, -18, Ascii.VT, Ascii.RS, Ascii.VT, -13, Ascii.CAN, 19, Ascii.RS, 19, Ascii.VT, Ascii.SYN, 19, 36, Ascii.SI, Ascii.SO};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final synchronized void A0C(C1127cu c1127cu) {
        if (this.A06 != null) {
            return;
        }
        this.A03 = A01(c1127cu);
        this.A06 = A05(c1127cu, this.A03, A03(c1127cu));
        A09(c1127cu, A00(c1127cu, this.A06));
        A0A(c1127cu, this.A06);
        A0B(c1127cu, this.A06);
        if (this.A06 != null) {
            this.A06.A6V();
        }
    }

    public static InterfaceC0729Rj A00(C1127cu c1127cu, InterfaceC0323Bn interfaceC0323Bn) {
        if (!U7.A1m(c1127cu) || interfaceC0323Bn == null) {
            return null;
        }
        return AbstractC0730Rk.A00().A00(interfaceC0323Bn);
    }

    public static InterfaceC0752Sh A01(C1127cu c1127cu) {
        return AbstractC0753Si.A00().A00(c1127cu, new YJ());
    }

    public static synchronized C0864Wt A02() {
        C0864Wt c0864Wt;
        synchronized (C0864Wt.class) {
            if (A07 == null) {
                A07 = new C0864Wt();
            }
            c0864Wt = A07;
        }
        return c0864Wt;
    }

    public static InterfaceC1232ed A03(C1127cu c1127cu) {
        if (!U7.A1i(c1127cu)) {
            return null;
        }
        return C1250ev.A01(c1127cu);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.SS
    /* renamed from: A04, reason: merged with bridge method [inline-methods] */
    public final synchronized InterfaceC0323Bn A97() {
        return this.A06;
    }

    public static InterfaceC0323Bn A05(C1127cu c1127cu, InterfaceC0752Sh interfaceC0752Sh, InterfaceC1232ed interfaceC1232ed) {
        if (!U7.A2e(c1127cu) || interfaceC1232ed == null || ProcessUtils.isRemoteRenderingProcess()) {
            return null;
        }
        return AbstractC1272fI.A00().A00(c1127cu, interfaceC0752Sh, interfaceC1232ed, VZ.A04(c1127cu), new X8(new VR(c1127cu, A06(0, 0, 9), null, V6.A08, 0, new VB(), X7.A01(U7.A0N(c1127cu)), null, null, new C1385hB()), c1127cu), C1270fG.A00().A00());
    }

    public static void A08() {
        VF.A05(A06(32, 28, 52), A06(8, 24, 68), A06(0, 8, 99));
    }

    public static void A09(C1127cu c1127cu, InterfaceC0729Rj interfaceC0729Rj) {
        if (!U7.A1m(c1127cu) || interfaceC0729Rj == null) {
            return;
        }
        AbstractC0727Rh.A00().A00(interfaceC0729Rj, c1127cu);
    }

    public static void A0A(C1127cu c1127cu, InterfaceC0323Bn interfaceC0323Bn) {
        if (!U7.A0m(c1127cu) || interfaceC0323Bn == null) {
            return;
        }
        new S4(c1127cu, interfaceC0323Bn, new S5(), DynamicLoaderImpl.getBidderTokenProviderApi().A00());
    }

    public static void A0B(C1127cu c1127cu, InterfaceC0323Bn interfaceC0323Bn) {
        if (interfaceC0323Bn == null) {
            return;
        }
        UB.A00(c1127cu, interfaceC0323Bn);
    }

    @Override // com.instagram.common.viewpoint.core.SS
    public final US A6f(C1127cu c1127cu) {
        return VG.A01(c1127cu);
    }

    @Override // com.instagram.common.viewpoint.core.SS
    public final synchronized SR A6w(SQ sq) {
        if (this.A02 == null) {
            this.A02 = new XI(this);
        }
        return this.A02;
    }

    @Override // com.instagram.common.viewpoint.core.SS
    public final synchronized SJ A78() {
        if (this.A01 == null) {
            this.A01 = new C1176di();
        }
        return this.A01;
    }

    @Override // com.instagram.common.viewpoint.core.SS
    public final synchronized InterfaceC0752Sh A7d(SQ sq) {
        if (this.A03 == null) {
            this.A03 = A01(sq.A02());
        }
        return this.A03;
    }

    @Override // com.instagram.common.viewpoint.core.SS
    public final synchronized InterfaceC0765Su A7f(SQ sq) {
        return new C0926Zd(sq);
    }

    @Override // com.instagram.common.viewpoint.core.SS
    public final synchronized ST A7p(final SQ sq) {
        return new YI(sq) { // from class: com.facebook.ads.redexgen.X.6K
            @Override // com.instagram.common.viewpoint.core.ST
            public final boolean A9e() {
                return CM.A09();
            }

            @Override // com.instagram.common.viewpoint.core.ST
            public final void ABq() {
                TK.A06(RB.A09(super.A00));
            }

            @Override // com.instagram.common.viewpoint.core.ST
            public final void ACE() {
                TK.A07(RB.A09(super.A00));
            }

            @Override // com.instagram.common.viewpoint.core.ST
            public final void ACe(C1127cu c1127cu) {
                AbstractC0629Nl.A01(c1127cu);
            }
        };
    }

    @Override // com.instagram.common.viewpoint.core.SS
    public final synchronized LL A84(SQ sq) {
        if (!U7.A13(sq)) {
            return null;
        }
        if (this.A00 == null) {
            this.A00 = LM.A00().A00(new YH(sq));
        }
        return this.A00;
    }

    @Override // com.instagram.common.viewpoint.core.SS
    public final synchronized SV A8q(SQ sq) {
        return new XN(sq);
    }

    @Override // com.instagram.common.viewpoint.core.SS
    public final C1127cu A8r(Context context) {
        C1127cu sdkContext = SP.A00();
        if (sdkContext == null) {
            C1127cu sdkContext2 = new C1127cu(context, this);
            SP.A01(sdkContext2);
            return sdkContext2;
        }
        return sdkContext;
    }

    @Override // com.instagram.common.viewpoint.core.SS
    public final synchronized InterfaceC0800Ue A8s(C1127cu c1127cu) {
        if (this.A05 == null) {
            this.A05 = new VO(c1127cu);
        }
        return this.A05;
    }

    @Override // com.instagram.common.viewpoint.core.SS
    public final synchronized TP A8y() {
        if (this.A04 == null) {
            this.A04 = new TP();
            A08();
        }
        return this.A04;
    }
}
