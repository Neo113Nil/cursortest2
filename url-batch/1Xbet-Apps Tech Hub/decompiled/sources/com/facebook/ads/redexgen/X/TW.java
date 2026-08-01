package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class TW implements InterfaceC0621Km {
    public static byte[] A01;
    public static String[] A02 = {"XQ6pDaA1rZEM", "XoeGOYiSv0w2M1U1qXC2kK0WxpTFbq6C", "goNPtYs5sZFfNSJyOgs171oDuCl7t69H", "IBRmsKraW8ihcuaNuynFKjmRlH", "udOMyB", "k9bLdXox5SSCuqwZoRmzAy5kJm", "rLCACxpviKCtWgunDsmekf59Ef0kXw8R", "IiDilnQTvcIperbA6lCpmy3utrrmGEhT"};
    public final /* synthetic */ TU A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 68);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-32, -8, -22, -24, -8, -30};
    }

    static {
        A01();
    }

    public TW(TU tu) {
        this.A00 = tu;
    }

    public /* synthetic */ TW(TU tu, C0843Tc c0843Tc) {
        this(tu);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003e  */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0621Km
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void AAv() {
        boolean z;
        boolean z2;
        T3 t3;
        T3 t32;
        boolean A0Y;
        this.A00.A0Y.setToolbarActionMessage(A00(0, 0, 7));
        this.A00.A0J();
        z = this.A00.A0V;
        if (z) {
            A0Y = this.A00.A0Y();
            if (A0Y) {
                this.A00.A0Y.setToolbarActionMode(1);
                z2 = this.A00.A0W;
                if (A02[4].length() == 6) {
                    throw new RuntimeException();
                }
                A02[4] = "RNuzR8";
                if (!z2) {
                    LV.A0U(this.A00, 500);
                    t3 = this.A00.A06;
                    if (t3 != null) {
                        t32 = this.A00.A06;
                        LV.A0N(t32, 0);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        this.A00.A0Y.setToolbarActionMode(0);
        z2 = this.A00.A0W;
        if (A02[4].length() == 6) {
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0621Km
    public final void ACZ(float f) {
        boolean z;
        C1Z c1z;
        boolean z2;
        AbstractC1045aS abstractC1045aS;
        float A03;
        AbstractC1045aS abstractC1045aS2;
        AbstractC1045aS abstractC1045aS3;
        boolean z3;
        AbstractC1045aS abstractC1045aS4;
        boolean z4;
        AbstractC1045aS abstractC1045aS5;
        this.A00.A0Q((int) f);
        z = this.A00.A0X;
        if (!z) {
            c1z = this.A00.A0H;
            float percentage = 1.0f - (f / c1z.A07());
            this.A00.A0Y.setProgress(100.0f * percentage);
            return;
        }
        z2 = this.A00.A0C;
        if (z2) {
            abstractC1045aS4 = this.A00.A0G;
            A03 = 1.0f - (f / abstractC1045aS4.A0v().A0D().A02());
            z4 = this.A00.A0F;
            if (z4 || A03 < 1.0f) {
                this.A00.A0F = false;
                abstractC1045aS5 = this.A00.A0G;
                String A022 = abstractC1045aS5.A10().A02();
                String[] strArr = A02;
                if (strArr[1].charAt(20) != strArr[6].charAt(20)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A02;
                strArr2[0] = "16sMGD3KF8iI";
                strArr2[5] = "yItCOMUcMHVXea4ql8lykvs7qx";
                String rewardMessage = A022.replace(A00(0, 6, 65), String.valueOf((int) f));
                this.A00.A0Y.setToolbarActionMessage(rewardMessage);
            } else {
                this.A00.A0F = true;
                this.A00.A0Y.setToolbarActionMessage(A00(0, 0, 7));
            }
        } else {
            abstractC1045aS = this.A00.A0G;
            A03 = 1.0f - (f / abstractC1045aS.A0v().A0D().A03());
        }
        this.A00.A0Y.setProgress(100.0f * A03);
        abstractC1045aS2 = this.A00.A0G;
        float A023 = abstractC1045aS2.A0v().A0D().A02() - f;
        abstractC1045aS3 = this.A00.A0G;
        float percentageOfReward = abstractC1045aS3.A0v().A0D().A03();
        boolean z5 = A023 >= percentageOfReward;
        z3 = this.A00.A0F;
        if (!z3 && z5) {
            this.A00.A0Y.setToolbarActionMode(1);
        }
    }
}
