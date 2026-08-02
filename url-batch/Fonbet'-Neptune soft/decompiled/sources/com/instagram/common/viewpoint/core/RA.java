package com.instagram.common.viewpoint.core;

import android.content.Intent;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.internal.api.AudienceNetworkActivityApi;
import com.google.common.base.Ascii;
import java.util.Arrays;
import kotlin.io.encoding.Base64;
import okio.Utf8;
import org.objectweb.asm.Opcodes;

/* loaded from: assets/audience_network.dex */
public final class RA {
    public static byte[] A07;
    public static String[] A08 = {"WrVVpIlV0mVOOesXyJjac9RJgGDEsYiy", "55KqVxwk4ItPenJ0PbzoYHpl7VLiDDoF", "", "85Uc86a0UVsoWW8LIwye7frNycSrKuPv", "TRaam", "0wWSnm1p2XMm3vcxH", "", "BPzoua9RAnM56oYN7Gpf0cmvKga9OU"};
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public final AudienceNetworkActivity A04;
    public final AudienceNetworkActivityApi A05;
    public final C1153dL A06;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 82);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A07 = new byte[]{-78, -19, -7, -9, -72, -16, -21, -19, -17, -20, -7, -7, -11, -72, -21, -18, -3, -72, -21, -18, -4, -17, -6, -7, -4, -2, -13, -8, -15, -72, -48, -45, -40, -45, -35, -46, -23, -53, -50, -23, -36, -49, -38, -39, -36, -34, -45, -40, -47, -23, -48, -42, -39, -31, Ascii.FS, 40, 38, -25, Ascii.US, Ascii.SUB, Ascii.FS, Ascii.RS, Ascii.ESC, 40, 40, 36, -25, Ascii.SUB, Ascii.GS, 44, -25, 34, 39, 45, Ascii.RS, 43, 44, 45, 34, 45, 34, Ascii.SUB, 37, -25, Ascii.SUB, Ascii.FS, 45, 34, 47, 34, 45, 50, Ascii.CAN, Ascii.GS, Ascii.RS, 44, 45, 43, 40, 50, Ascii.RS, Ascii.GS, 16, Ascii.FS, Ascii.SUB, -37, 19, Ascii.SO, 16, Ascii.DC2, Ascii.SI, Ascii.FS, Ascii.FS, Ascii.CAN, -37, Ascii.SO, 17, 32, -37, Ascii.SYN, Ascii.ESC, 33, Ascii.DC2, Ascii.US, 32, 33, Ascii.SYN, 33, Ascii.SYN, Ascii.SO, Ascii.EM, -37, 17, Ascii.SYN, 32, Ascii.SUB, Ascii.SYN, 32, 32, Ascii.DC2, 17, 46, 58, 56, -7, 49, 44, 46, 48, 45, 58, 58, 54, -7, 44, 47, 62, -7, 52, 57, Utf8.REPLACEMENT_BYTE, 48, Base64.padSymbol, 62, Utf8.REPLACEMENT_BYTE, 52, Utf8.REPLACEMENT_BYTE, 52, 44, 55, -7, 48, Base64.padSymbol, Base64.padSymbol, 58, Base64.padSymbol, -39, -27, -29, -92, -36, -41, -39, -37, -40, -27, -27, -31, -92, -41, -38, -23, -92, -33, -28, -22, -37, -24, -23, -22, -33, -22, -33, -41, -30, -92, -36, -33, -28, -33, -23, -34, -43, -41, -39, -22, -33, -20, -33, -22, -17, -4, 8, 6, -57, -1, -6, -4, -2, -5, 8, 8, 4, -57, -6, -3, Ascii.FF, -57, 2, 7, Ascii.CR, -2, Ascii.VT, Ascii.FF, Ascii.CR, 2, Ascii.CR, 2, -6, 5, -57, 2, 6, 9, Ascii.VT, -2, Ascii.FF, Ascii.FF, 2, 8, 7, -57, 5, 8, 0, 0, -2, -3, Ascii.SO, Ascii.US, Ascii.SO, Ascii.ETB, Ascii.GS};
    }

    static {
        A01();
    }

    public RA(AudienceNetworkActivityApi audienceNetworkActivityApi, C1153dL c1153dL, AudienceNetworkActivity audienceNetworkActivity) {
        this.A05 = audienceNetworkActivityApi;
        this.A06 = c1153dL;
        this.A04 = audienceNetworkActivity;
    }

    private final void A02(boolean z) {
        this.A03 = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0067 A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean A03(EnumC0823Vb enumC0823Vb) {
        if (enumC0823Vb != EnumC0823Vb.A0H && enumC0823Vb != EnumC0823Vb.A0G) {
            EnumC0823Vb enumC0823Vb2 = EnumC0823Vb.A08;
            String[] strArr = A08;
            if (strArr[3].charAt(18) == strArr[0].charAt(18)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A08;
            strArr2[4] = "QK9lt";
            strArr2[5] = "71ldustRCfnIbk6ZF";
            if (enumC0823Vb != enumC0823Vb2 && enumC0823Vb != EnumC0823Vb.A05 && enumC0823Vb != EnumC0823Vb.A0F) {
                EnumC0823Vb enumC0823Vb3 = EnumC0823Vb.A0I;
                String[] strArr3 = A08;
                if (strArr3[6].length() != strArr3[2].length()) {
                    String[] strArr4 = A08;
                    strArr4[4] = "n7dEG";
                    strArr4[5] = "EMW1RUsZodH5Xcp8C";
                    if (enumC0823Vb != enumC0823Vb3) {
                        return false;
                    }
                } else {
                    String[] strArr5 = A08;
                    strArr5[6] = "";
                    strArr5[2] = "";
                    if (enumC0823Vb == enumC0823Vb3) {
                    }
                }
            }
        }
        return true;
    }

    public final void A04(EnumC0823Vb enumC0823Vb, String str) {
        boolean z = !this.A03 || U7.A1x(this.A06);
        boolean shouldCallOnDestroy = this.A02;
        if (!shouldCallOnDestroy && z) {
            boolean shouldCallOnDestroy2 = A03(enumC0823Vb);
            if (shouldCallOnDestroy2) {
                A09(EnumC1175dh.A03.A03(), str);
            } else {
                A09(A00(54, 48, 103), str);
            }
            this.A02 = true;
        }
    }

    public final void A05(EnumC0823Vb enumC0823Vb, String str) {
        if (A03(enumC0823Vb)) {
            A09(EnumC1175dh.A09.A03(), str);
        } else {
            A09(A00(Opcodes.F2D, 35, 121), str);
        }
    }

    public final void A06(EnumC0823Vb enumC0823Vb, String str) {
        if (A03(enumC0823Vb)) {
            A09(EnumC1175dh.A05.A03(), str);
        } else {
            A09(A00(102, 39, 91), str);
        }
        A02(true);
        A04(enumC0823Vb, str);
    }

    public final void A07(EnumC0823Vb enumC0823Vb, String str) {
        if (U7.A1s(this.A06) && !this.A01 && !this.A00) {
            LH A0F = this.A06.A0F();
            String[] strArr = A08;
            if (strArr[3].charAt(18) == strArr[0].charAt(18)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A08;
            strArr2[3] = "ERQ6CJuvlb3tCwq1OYCzpUpdhNPz9IsE";
            strArr2[0] = "fdli8mgwNbZyMwMFsZ54k8DyiigEG2Sx";
            A0F.AC4();
            A05(enumC0823Vb, str);
        }
    }

    public final void A08(String str, C0774Td c0774Td, String str2) {
        Intent intent = new Intent(str + A00(0, 1, 38) + str2);
        if (c0774Td != null) {
            intent.putExtra(A00(268, 5, 87), c0774Td);
        }
        OO.A00(this.A04).A07(intent);
    }

    public final void A09(String str, String str2) {
        if (A00(221, 47, 71).equals(str) || EnumC1175dh.A0A.A03().equals(str)) {
            this.A01 = true;
        }
        boolean equals = A00(Opcodes.F2D, 35, 121).equals(str);
        if (A08[7].length() == 29) {
            throw new RuntimeException();
        }
        String[] strArr = A08;
        strArr[3] = "q8Yu3i76ZTlYqxP4qtQeXX4gnui9AJbb";
        strArr[0] = "UYbwc2QJiguNdyXAgiRTefqPyIZvniQg";
        if (equals || EnumC1175dh.A09.A03().equals(str)) {
            this.A00 = true;
        }
        if (A00(1, 53, 56).equals(str)) {
            this.A05.finish(9);
        } else if (A00(Opcodes.ARETURN, 45, 36).equals(str)) {
            this.A05.finish(10);
        } else {
            A08(str, null, str2);
        }
    }
}
