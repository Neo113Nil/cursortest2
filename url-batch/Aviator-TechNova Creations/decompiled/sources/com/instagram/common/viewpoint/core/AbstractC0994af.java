package com.instagram.common.viewpoint.core;

import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.common.base.Ascii;
import java.util.Arrays;
import java.util.HashMap;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.af, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0994af {
    public static byte[] A00;
    public static String[] A01 = {"e7juOHCMVCS96MucXvvyM5upzpE0CxcL", "6Axk6XM18YFtFlcC0tEdKqjogVlmemrm", "CHYE97fUe", "94l1C", "pvrd7E3JtMrEOvPAC3lcGaqqDdvc2Rnk", "mswd2ljSuB4EOxjza27Iz7krcpdQKmDN", "x2gmwPWroRNX0socjzMaFBH0Y3mBhUE3", "1dJrelJWCcDuEHtNsp3IaM8Oqex3ZZ7a"};

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 41);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{-73, -32, 10, -73, -32, 5, 10, Ascii.VT, -8, 5, Ascii.VT, -73, -2, -8, 4, -4, 10, -73, -8, 3, 3, 6, Ascii.SO, -4, -5, -47, -73, -121, -80, -38, -121, -80, -43, -38, -37, -56, -43, -37, -121, -50, -56, -44, -52, -38, -95, -121, -57, Ascii.SO, Ascii.SYN, Ascii.SYN, Ascii.SO, 19, Ascii.FF, -57, Ascii.CR, 8, 19, 19, 9, 8, 10, Ascii.DC2, -57, Ascii.FS, Ascii.EM, 19, -57, 8, Ascii.GS, 8, 16, 19, 8, 9, 19, Ascii.FF, -31, -57, 79, -104, -94, -126, -93, -98, -95, -108, 105, 79, 90, -95, -9, -22, -27, -26, -16, -95, -10, -13, -19, -95, -22, -12, -95, -17, -10, -19, -19, -69, -95, 4, 16, Ascii.SO, -49, 7, 2, 4, 6, 3, 16, 16, Ascii.FF, -49, Ascii.FF, 2, Ascii.NAK, 2, Ascii.SI, 2, -42, -41, -46, -43, -56, -35, -34, -39, -36, -49, -55, -33, -36, -42, -55, -31, -49, -52, -55, -48, -53, -42, -42, -52, -53, -51, -43, -30, -43, -48, -47, -37, -53, -31, -34, -40};
        String[] strArr = A01;
        if (strArr[5].charAt(19) != strArr[7].charAt(19)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[3] = "ump74";
        strArr2[2] = "QJx5Vwz5z";
    }

    static {
        A02();
    }

    public static AbstractC0993ae A00(C0997ai c0997ai, Bundle bundle, boolean z) {
        AbstractC0993ae c0536Jp;
        c0997ai.A06().A0H().A00(false);
        C0613Mp A20 = c0997ai.A05().A20();
        double A002 = AbstractC0984aV.A00(A20);
        boolean isWatchAndBrowse = c0997ai.A05().A20().A0T();
        boolean A06 = AbstractC0984aV.A06(c0997ai.A00(), c0997ai.A01(), A002);
        MH A003 = MI.A00(c0997ai.A06(), c0997ai.A07(), A01(0, 0, 8), WQ.A00(c0997ai.A05().A20().A0J().A05()), new HashMap(), c0997ai.A05().A21());
        boolean z2 = !TextUtils.isEmpty(A20.A0H().A09());
        if (U7.A1u(c0997ai.A06())) {
            C1159dL A062 = c0997ai.A06();
            String[] strArr = A01;
            if (strArr[4].charAt(27) == strArr[6].charAt(27)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[5] = "oHCvC4ERmXYMU8sW9KKIPv7pnY2wXb01";
            strArr2[7] = "G3HUaMks2xBdg2z9mSbIts1gYwx1OgmU";
            A062.A0B().AK2(c0997ai.A02(), c0997ai.A05().A25(), z2);
        }
        boolean A04 = A04(c0997ai, z2);
        if ((isWatchAndBrowse && (A003 instanceof C7O)) || A04) {
            c0536Jp = A03(c0997ai) ? new C0513Is(c0997ai) : new JU(c0997ai, A04);
        } else if (z2) {
            c0536Jp = new C01775d(c0997ai);
        } else {
            if (c0997ai.A05().A1U()) {
                return new C0544Jx(c0997ai);
            }
            if (c0997ai.A05().A1b()) {
                c0536Jp = new C01795f(c0997ai);
            } else if (U7.A2a(c0997ai.A06())) {
                c0536Jp = new C01785e(c0997ai, A06);
            } else if (A06) {
                c0536Jp = new C0541Ju(c0997ai, c0997ai.A00() == 2);
            } else {
                c0536Jp = new C0536Jp(c0997ai, AbstractC0984aV.A04(A002));
            }
        }
        if (z) {
            c0536Jp.A1G(A20, c0997ai.A05().A25(), A002, bundle);
        }
        return c0536Jp;
    }

    public static boolean A03(C0997ai c0997ai) {
        if (!c0997ai.A05().A1o()) {
            boolean A1U = c0997ai.A05().A1U();
            String[] strArr = A01;
            if (strArr[4].charAt(27) == strArr[6].charAt(27)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[5] = "BfXu055milBajq8QiXDIPY7ZZDWb7rZy";
            strArr2[7] = "zfsTxDhfKJjHYbZVz1DIv6IoDbSXcVhK";
            if (!A1U) {
                return false;
            }
        }
        return true;
    }

    public static boolean A04(C0997ai c0997ai, boolean z) {
        boolean z2 = false;
        if (!c0997ai.A05().A1r() || !z) {
            return false;
        }
        Uri A002 = WQ.A00(c0997ai.A05().A20().A0J().A05());
        String authority = A002.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            c0997ai.A06().A0F().ABk();
            return false;
        }
        boolean isInstantGamesEnabled = authority.equals(A01(128, 5, 58));
        boolean isInstantGames = A002.getQueryParameter(A01(155, 9, 67)) == null;
        String queryParameter = A002.getQueryParameter(A01(Opcodes.I2L, 22, 65));
        boolean isGoogleFallBackUrlAvailable = !TextUtils.isEmpty(queryParameter) && queryParameter.contains(c0997ai.A05().A0w());
        boolean equals = c0997ai.A06().getPackageName().equals(A01(109, 19, 120));
        boolean A1s = c0997ai.A05().A1s();
        if (isInstantGamesEnabled && isInstantGames && isGoogleFallBackUrlAvailable && (!equals || A1s)) {
            z2 = true;
        }
        if (!z2 && Build.VERSION.SDK_INT >= 24) {
            c0997ai.A06().A0F().ABj(A01(78, 11, 6) + isInstantGamesEnabled + A01(89, 20, 88) + isInstantGames + A01(46, 32, 126) + isGoogleFallBackUrlAvailable + A01(27, 19, 62) + equals + A01(0, 27, 110) + A1s);
        }
        return z2;
    }
}
