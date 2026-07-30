package com.instagram.common.viewpoint.core;

import com.anythink.basead.ui.f.d;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Hr, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0960Hr implements InterfaceC1477aq {
    public static byte[] A01;
    public static String[] A02 = {"lymitVL5Elx23yNuagrdcc1tj4byFzuO", "OtHhm4I6MY8qhok47NcALtT", "GJmhN4rXhrf709OMeDU9UKBK4KfDlX2Y", "UKN", "ioCWBc07RK8NAgZ7uqzQ2Ov99bHrMaFb", "vsb8Ufoa8H", "zp4FcHB1hqlJdpy7ZALmHMQwB62WRf78", "qbR"};
    public final /* synthetic */ AnonymousClass55 A00;

    public static String A00(int i, int i4, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i4);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] - i9) + d.f10958c);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        if (A02[1].length() != 23) {
            throw new RuntimeException();
        }
        String[] strArr = A02;
        strArr[0] = "68tvMXLM0DzUKrc9PEEpmru8eIlurAzh";
        strArr[2] = "oZlS45uLmtttWs7KR8Y8sKnmk93hftbi";
        A01 = new byte[]{51, 49, 35, 48, 29, 44, 31, 52, 39, 37, 31, 50, 39, 45, 44, 29, 39, 31, 32};
    }

    static {
        A01();
    }

    public C0960Hr(AnonymousClass55 anonymousClass55) {
        this.A00 = anonymousClass55;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1477aq
    public final void AF7(String str) {
        C1468ah c1468ah;
        C1468ah c1468ah2;
        C1468ah c1468ah3;
        this.A00.A0H = false;
        c1468ah = this.A00.A05;
        if (c1468ah != null) {
            c1468ah3 = this.A00.A05;
            c1468ah3.setProgress(100);
        }
        c1468ah2 = this.A00.A05;
        YB.A0O(c1468ah2, 8);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1477aq
    public final void AF9(String str) {
        C1468ah c1468ah;
        M8 m8;
        boolean z8;
        int i;
        M8 m82;
        this.A00.A0H = true;
        c1468ah = this.A00.A05;
        YB.A0O(c1468ah, 0);
        m8 = this.A00.A04;
        if (m8 != null) {
            m82 = this.A00.A04;
            m82.setUrl(str);
        }
        z8 = this.A00.A0G;
        if (!z8) {
            i = this.A00.A01;
            if (i > 1) {
                this.A00.A0G = true;
                this.A00.A0r(A00(0, 19, 88));
            }
        }
        AnonymousClass55 anonymousClass55 = this.A00;
        if (A02[1].length() != 23) {
            throw new RuntimeException();
        }
        String[] strArr = A02;
        strArr[7] = "Ijw";
        strArr[3] = "65M";
        AnonymousClass55.A03(anonymousClass55);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1477aq
    public final void AFY(int i) {
        boolean z8;
        C1468ah c1468ah;
        C1468ah c1468ah2;
        z8 = this.A00.A0H;
        if (z8) {
            c1468ah = this.A00.A05;
            if (c1468ah != null) {
                c1468ah2 = this.A00.A05;
                c1468ah2.setProgress(i);
            }
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1477aq
    public final void AFb(String str) {
        M8 m8;
        M8 m82;
        m8 = this.A00.A04;
        if (m8 != null) {
            m82 = this.A00.A04;
            m82.setTitle(str);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1477aq
    public final void AFe() {
        ((AbstractC0978Ij) this.A00).A0B.ADJ(14);
    }
}
