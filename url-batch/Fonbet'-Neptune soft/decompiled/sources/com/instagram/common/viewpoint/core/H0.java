package com.instagram.common.viewpoint.core;

import com.google.common.base.Ascii;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class H0 implements ZY {
    public static byte[] A01;
    public static String[] A02 = {"lymitVL5Elx23yNuagrdcc1tj4byFzuO", "OtHhm4I6MY8qhok47NcALtT", "GJmhN4rXhrf709OMeDU9UKBK4KfDlX2Y", "UKN", "ioCWBc07RK8NAgZ7uqzQ2Ov99bHrMaFb", "vsb8Ufoa8H", "zp4FcHB1hqlJdpy7ZALmHMQwB62WRf78", "qbR"};
    public final /* synthetic */ C4K A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 102);
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
        A01 = new byte[]{51, 49, 35, 48, Ascii.GS, 44, Ascii.US, 52, 39, 37, Ascii.US, 50, 39, 45, 44, Ascii.GS, 39, Ascii.US, 32};
    }

    static {
        A01();
    }

    public H0(C4K c4k) {
        this.A00 = c4k;
    }

    @Override // com.instagram.common.viewpoint.core.ZY
    public final void AES(String str) {
        ZP zp;
        ZP zp2;
        ZP zp3;
        this.A00.A0F = false;
        zp = this.A00.A05;
        if (zp != null) {
            zp3 = this.A00.A05;
            zp3.setProgress(100);
        }
        zp2 = this.A00.A05;
        XP.A0L(zp2, 8);
    }

    @Override // com.instagram.common.viewpoint.core.ZY
    public final void AEU(String str) {
        ZP zp;
        ZH zh;
        boolean z;
        int i;
        ZH zh2;
        this.A00.A0F = true;
        zp = this.A00.A05;
        XP.A0L(zp, 0);
        zh = this.A00.A04;
        if (zh != null) {
            zh2 = this.A00.A04;
            zh2.setUrl(str);
        }
        z = this.A00.A0E;
        if (!z) {
            i = this.A00.A01;
            if (i > 1) {
                this.A00.A0E = true;
                this.A00.A0n(A00(0, 19, 88));
            }
        }
        C4K c4k = this.A00;
        if (A02[1].length() != 23) {
            throw new RuntimeException();
        }
        String[] strArr = A02;
        strArr[7] = "Ijw";
        strArr[3] = "65M";
        C4K.A03(c4k);
    }

    @Override // com.instagram.common.viewpoint.core.ZY
    public final void AEq(int i) {
        boolean z;
        ZP zp;
        ZP zp2;
        z = this.A00.A0F;
        if (z) {
            zp = this.A00.A05;
            if (zp != null) {
                zp2 = this.A00.A05;
                zp2.setProgress(i);
            }
        }
    }

    @Override // com.instagram.common.viewpoint.core.ZY
    public final void AEt(String str) {
        ZH zh;
        ZH zh2;
        zh = this.A00.A04;
        if (zh != null) {
            zh2 = this.A00.A04;
            zh2.setTitle(str);
        }
    }

    @Override // com.instagram.common.viewpoint.core.ZY
    public final void AEw() {
        ((AbstractC0480Hr) this.A00).A0B.ACf(14);
    }
}
