package com.instagram.common.viewpoint.core;

import android.content.Context;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderImpl;
import com.facebook.ads.internal.util.process.ProcessUtils;
import com.google.common.base.Ascii;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Wt, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0870Wt implements SS {
    public static C0870Wt A07;
    public static byte[] A08;
    public LL A00;
    public SJ A01;
    public SR A02;
    public InterfaceC0758Sh A03;
    public TP A04;
    public InterfaceC0806Ue A05;
    public InterfaceC0329Bn A06;

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
    public final synchronized void A0C(C1133cu c1133cu) {
        if (this.A06 != null) {
            return;
        }
        this.A03 = A01(c1133cu);
        this.A06 = A05(c1133cu, this.A03, A03(c1133cu));
        A09(c1133cu, A00(c1133cu, this.A06));
        A0A(c1133cu, this.A06);
        A0B(c1133cu, this.A06);
        if (this.A06 != null) {
            this.A06.A6V();
        }
    }

    public static InterfaceC0735Rj A00(C1133cu c1133cu, InterfaceC0329Bn interfaceC0329Bn) {
        if (!U7.A1m(c1133cu) || interfaceC0329Bn == null) {
            return null;
        }
        return AbstractC0736Rk.A00().A00(interfaceC0329Bn);
    }

    public static InterfaceC0758Sh A01(C1133cu c1133cu) {
        return AbstractC0759Si.A00().A00(c1133cu, new YJ());
    }

    public static synchronized C0870Wt A02() {
        C0870Wt c0870Wt;
        synchronized (C0870Wt.class) {
            if (A07 == null) {
                A07 = new C0870Wt();
            }
            c0870Wt = A07;
        }
        return c0870Wt;
    }

    public static InterfaceC1238ed A03(C1133cu c1133cu) {
        if (!U7.A1i(c1133cu)) {
            return null;
        }
        return C1256ev.A01(c1133cu);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.SS
    /* renamed from: A04, reason: merged with bridge method [inline-methods] */
    public final synchronized InterfaceC0329Bn A97() {
        return this.A06;
    }

    public static InterfaceC0329Bn A05(C1133cu c1133cu, InterfaceC0758Sh interfaceC0758Sh, InterfaceC1238ed interfaceC1238ed) {
        if (!U7.A2e(c1133cu) || interfaceC1238ed == null || ProcessUtils.isRemoteRenderingProcess()) {
            return null;
        }
        return AbstractC1278fI.A00().A00(c1133cu, interfaceC0758Sh, interfaceC1238ed, VZ.A04(c1133cu), new X8(new VR(c1133cu, A06(0, 0, 9), null, V6.A08, 0, new VB(), X7.A01(U7.A0N(c1133cu)), null, null, new C1391hB()), c1133cu), C1276fG.A00().A00());
    }

    public static void A08() {
        VF.A05(A06(32, 28, 52), A06(8, 24, 68), A06(0, 8, 99));
    }

    public static void A09(C1133cu c1133cu, InterfaceC0735Rj interfaceC0735Rj) {
        if (!U7.A1m(c1133cu) || interfaceC0735Rj == null) {
            return;
        }
        AbstractC0733Rh.A00().A00(interfaceC0735Rj, c1133cu);
    }

    public static void A0A(C1133cu c1133cu, InterfaceC0329Bn interfaceC0329Bn) {
        if (!U7.A0m(c1133cu) || interfaceC0329Bn == null) {
            return;
        }
        new S4(c1133cu, interfaceC0329Bn, new S5(), DynamicLoaderImpl.getBidderTokenProviderApi().A00());
    }

    public static void A0B(C1133cu c1133cu, InterfaceC0329Bn interfaceC0329Bn) {
        if (interfaceC0329Bn == null) {
            return;
        }
        UB.A00(c1133cu, interfaceC0329Bn);
    }

    @Override // com.instagram.common.viewpoint.core.SS
    public final US A6f(C1133cu c1133cu) {
        return VG.A01(c1133cu);
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
            this.A01 = new C1182di();
        }
        return this.A01;
    }

    @Override // com.instagram.common.viewpoint.core.SS
    public final synchronized InterfaceC0758Sh A7d(SQ sq) {
        if (this.A03 == null) {
            this.A03 = A01(sq.A02());
        }
        return this.A03;
    }

    @Override // com.instagram.common.viewpoint.core.SS
    public final synchronized InterfaceC0771Su A7f(SQ sq) {
        return new C0932Zd(sq);
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
            public final void ACe(C1133cu c1133cu) {
                AbstractC0635Nl.A01(c1133cu);
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
    public final C1133cu A8r(Context context) {
        C1133cu sdkContext = SP.A00();
        if (sdkContext == null) {
            C1133cu sdkContext2 = new C1133cu(context, this);
            SP.A01(sdkContext2);
            return sdkContext2;
        }
        return sdkContext;
    }

    @Override // com.instagram.common.viewpoint.core.SS
    public final synchronized InterfaceC0806Ue A8s(C1133cu c1133cu) {
        if (this.A05 == null) {
            this.A05 = new VO(c1133cu);
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
