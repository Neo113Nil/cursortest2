package com.instagram.common.viewpoint.core;

import java.util.Arrays;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.Le, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0577Le implements InterfaceC0855Wc {
    public static byte[] A01;
    public static String[] A02 = {"RKj", "", "UN15gotjq8", "ajoBiEUEQKFJNLqm", "ifgUnXqkKiJSPGKzKRtyUVwCV1ynqJ", "MgNPOwYKG3krpOkrgoqalUsb7GIlLECG", "4d5pH5OlBXd1RidH0kkNXmSukCNaNWUQ", "ZdfTYbLhRFsUmKvgir0oysIbzYx0fUOP"};
    public final /* synthetic */ C0575Lc A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 17);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-31, -7, -21, -23, -7, -29};
    }

    static {
        A01();
    }

    public C0577Le(C0575Lc c0575Lc) {
        this.A00 = c0575Lc;
    }

    public /* synthetic */ C0577Le(C0575Lc c0575Lc, C0593Lu c0593Lu) {
        this(c0575Lc);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0855Wc
    public final void ACp() {
        boolean z;
        boolean A0V;
        this.A00.A0a.setToolbarActionMessage(A00(0, 0, 19));
        this.A00.A0I();
        z = this.A00.A0X;
        if (z) {
            A0V = this.A00.A0V();
            String[] strArr = A02;
            if (strArr[5].charAt(0) == strArr[7].charAt(0)) {
                throw new RuntimeException();
            }
            A02[4] = "QDC88FCswtzFK8CArK72WEL9jXMBl5";
            if (A0V) {
                this.A00.A0a.setToolbarActionMode(1);
                return;
            }
        }
        this.A00.A0a.setToolbarActionMode(0);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0855Wc
    public final void AEn(float f) {
        boolean z;
        NB nb;
        boolean z2;
        AbstractC1434hy abstractC1434hy;
        float A04;
        AbstractC1434hy abstractC1434hy2;
        AbstractC1434hy abstractC1434hy3;
        boolean z3;
        AbstractC1434hy abstractC1434hy4;
        boolean z4;
        AbstractC1434hy abstractC1434hy5;
        this.A00.A0O((int) f);
        z = this.A00.A0Y;
        if (!z) {
            nb = this.A00.A0J;
            this.A00.A0a.setProgress(100.0f * (1.0f - (f / nb.A07())));
            return;
        }
        z2 = this.A00.A0E;
        if (z2) {
            abstractC1434hy4 = this.A00.A0I;
            if (A02[6].charAt(27) != 'a') {
                throw new RuntimeException();
            }
            A02[4] = "3MuDy2E798EtOoHK0e0a3SiH1QgAy5";
            A04 = 1.0f - (f / abstractC1434hy4.A20().A0H().A03());
            z4 = this.A00.A0H;
            if (z4 || A04 < 1.0f) {
                this.A00.A0H = false;
                abstractC1434hy5 = this.A00.A0I;
                this.A00.A0a.setToolbarActionMessage(abstractC1434hy5.A24().A02().replace(A00(0, 6, Opcodes.LNEG), String.valueOf((int) f)));
            } else {
                this.A00.A0H = true;
                AbstractC0889Xm abstractC0889Xm = this.A00.A0a;
                String A00 = A00(0, 0, 19);
                if (A02[3].length() != 16) {
                    abstractC0889Xm.setToolbarActionMessage(A00);
                } else {
                    String[] strArr = A02;
                    strArr[5] = "wpbUz5ctYXHuYyRf6fVCU3uRzsMt7dE8";
                    strArr[7] = "BBfRd69Z77LUH69GeqVAIKhho7h2fuMA";
                    abstractC0889Xm.setToolbarActionMessage(A00);
                }
            }
        } else {
            abstractC1434hy = this.A00.A0I;
            A04 = 1.0f - (f / abstractC1434hy.A20().A0H().A04());
        }
        this.A00.A0a.setProgress(100.0f * A04);
        abstractC1434hy2 = this.A00.A0I;
        float A03 = abstractC1434hy2.A20().A0H().A03() - f;
        abstractC1434hy3 = this.A00.A0I;
        float percentageOfReward = abstractC1434hy3.A20().A0H().A04();
        boolean z5 = A03 >= percentageOfReward;
        z3 = this.A00.A0H;
        if (!z3 && z5) {
            this.A00.A0a.setToolbarActionMode(1);
        }
    }
}
