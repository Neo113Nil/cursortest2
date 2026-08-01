package com.facebook.ads.redexgen.X;

import android.os.Bundle;
import android.os.Message;
import android.util.Log;
import androidx.core.view.InputDeviceCompat;
import androidx.core.view.PointerIconCompat;
import androidx.vectordrawable.graphics.drawable.PathInterpolatorCompat;
import com.facebook.ads.AdError;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdExtendedListener;
import com.facebook.ads.RewardedAdListener;
import com.google.common.base.Ascii;
import java.util.Arrays;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.Zk, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1003Zk implements AnonymousClass25 {
    public static byte[] A04;
    public static String[] A05 = {"PyT2XUnl", "3EmvKqRjFYzRkizxlD8eotggUBC8U5J9", "Ib6uyfMRsh5ysHZ3i8ryXk3sO16qq9Ys", "q2kkzr74cnXMazMYxmC9c", "9U931lGThJH7Qz6wctlm6EKEWHFtvDAV", "f15MquYM06llw3BWZWASFwAp5egI2HKX", "yMUgiPhi", "t3xZZPMR"};
    public final AbstractC1013Zw A00;
    public final InterfaceC01791y A01;
    public final AnonymousClass23 A02;
    public final YA A03;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 57);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{-77, -42, -110, -31, -44, -36, -41, -43, -26, -110, -37, -27, -110, -32, -25, -34, -34, -115, -96, -103, -113, -105, -112, -86, -112, -93, -97, -99, -116, -98, -86, -106, -112, -92, -74, -78, -79, -27, -44, -39, -43, -34, -45, -43, -66, -43, -28, -25, -33, -30, -37, -87, -82, -76, -65, -91, -78, -78, -81, -78, -65, -93, -81, -92, -91, -65, -85, -91, -71, 4, 7, 6, -1, Ascii.ETB, 1, 6, Ascii.SO, -7, 4, 1, -4, -7, Ascii.FF, 1, 7, 6, Ascii.ETB, Ascii.FF, 1, 5, -3, Ascii.ETB, 3, -3, 17, -61, -37, -23, -23, -41, -35, -37, -80, -106, -66, -38, -28, -28, -38, -33, -40, -111, -45, -26, -33, -43, -35, -42, -111, -41, -32, -29, -111, -34, -42, -28, -28, -46, -40, -42, -97, -95, -94, -96, -83, -109, -96, -96, -99, -96, -83, -101, -109, -95, -95, -113, -107, -109, -83, -103, -109, -89, 4, 19, Ascii.FF};
    }

    static {
        A01();
    }

    public C1003Zk(YA ya, AnonymousClass23 anonymousClass23, InterfaceC01791y interfaceC01791y, AbstractC1013Zw abstractC1013Zw) {
        this.A03 = ya;
        this.A02 = anonymousClass23;
        this.A01 = interfaceC01791y;
        this.A00 = abstractC1013Zw;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00b5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00e2  */
    @Override // com.facebook.ads.redexgen.X.AnonymousClass25
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A8M(Message message) {
        InterstitialAd A01 = this.A02.A01();
        String A00 = A00(Opcodes.DCMPG, 3, 106);
        if (A01 == null) {
            this.A03.A07().A9M(A00, C03207x.A0K, new C03217y(A00(0, 17, 57)));
            return;
        }
        int i = message.what;
        String A002 = A00(95, 9, 61);
        String A003 = A00(104, 27, 56);
        String A004 = A00(17, 17, 18);
        switch (i) {
            case 10:
            case 1023:
                Bundle bundle = message.getData().getBundle(A004);
                if (bundle != null) {
                    int i2 = bundle.getInt(A00(51, 18, 39));
                    String string = bundle.getString(A00(Opcodes.LXOR, 21, 21));
                    AdError adError = new AdError(i2, string);
                    this.A01.AFG(adError);
                    if (this.A02.A02() != null) {
                        this.A02.A02().onError(A01, adError);
                    } else {
                        Log.e(A00(34, 17, 55), string);
                    }
                } else {
                    this.A01.AFC(EnumC01781x.A05);
                    this.A03.A07().A9M(A00, C03207x.A0V, new C03217y(A003, A002 + message));
                }
                this.A02.A0C(null);
                return;
            case PointerIconCompat.TYPE_GRAB /* 1020 */:
                this.A01.AFK();
                Bundle bundle2 = message.getData().getBundle(A004);
                if (bundle2 != null) {
                    this.A02.A0B(bundle2.getLong(A00(69, 26, 127)));
                } else {
                    this.A03.A07().A9M(A00, C03207x.A0V, new C03217y(A003, A002 + message));
                }
                this.A02.A0C(null);
                break;
            case 1022:
                this.A01.AFU();
                break;
        }
        if (this.A02.A02() == null) {
            return;
        }
        switch (message.what) {
            case PointerIconCompat.TYPE_GRAB /* 1020 */:
                this.A02.A02().onAdLoaded(A01);
                return;
            case PointerIconCompat.TYPE_GRABBING /* 1021 */:
                this.A02.A02().onInterstitialDisplayed(A01);
                if (A05[2].charAt(18) != 'n') {
                    String[] strArr = A05;
                    strArr[1] = "IMuRostxJ5htnzhiOcsxYcu1iidsGUgj";
                    strArr[5] = "ubJ4M5GxN6FfPval4rtOnbhl8vPUgGKC";
                    return;
                }
                throw new RuntimeException();
            case 1022:
                this.A02.A02().onInterstitialDismissed(A01);
                return;
            case 1023:
            default:
                if (this.A02.A04() != null) {
                    return;
                }
                int i3 = message.what;
                String[] strArr2 = A05;
                if (strArr2[3].length() != strArr2[7].length()) {
                    A05[4] = "YO9dGq40ZDljeOjTjHA4uB3VVKU9R56I";
                    switch (i3) {
                        case PathInterpolatorCompat.MAX_NUM_POINTS /* 3000 */:
                            this.A02.A04().onRewardedAdCompleted();
                            return;
                        case AdError.MEDIATION_ERROR_CODE /* 3001 */:
                            RewardedAdListener A042 = this.A02.A04();
                            if (A05[2].charAt(18) == 'n') {
                                A042.onRewardedAdServerSucceeded();
                                return;
                            }
                            String[] strArr3 = A05;
                            strArr3[1] = "4ubpoteMIucGsWyTMsTtOH4ZOdBl9bHr";
                            strArr3[5] = "Xxx4qDjyhZoijrhiIp4u1mFMOEMCLZoL";
                            A042.onRewardedAdServerSucceeded();
                            return;
                        case 3002:
                            this.A02.A04().onRewardedAdServerFailed();
                            return;
                        default:
                            return;
                    }
                }
                throw new RuntimeException();
            case 1024:
                this.A02.A02().onAdClicked(A01);
                return;
            case InputDeviceCompat.SOURCE_GAMEPAD /* 1025 */:
                this.A02.A02().onLoggingImpression(A01);
                return;
            case 1026:
                if (this.A02.A02() instanceof InterstitialAdExtendedListener) {
                    AnonymousClass23 anonymousClass23 = this.A02;
                    if (A05[2].charAt(18) != 'n') {
                        A05[2] = "QiAUsDkapNh1fTZA9J8Gsz0JLC17Ghy8";
                        ((InterstitialAdExtendedListener) anonymousClass23.A02()).onInterstitialActivityDestroyed();
                    }
                    throw new RuntimeException();
                }
                if (this.A02.A04() != null) {
                }
                break;
        }
    }
}
