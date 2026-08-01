package com.facebook.ads.redexgen.X;

import android.os.Bundle;
import android.os.Message;
import android.util.Log;
import androidx.vectordrawable.graphics.drawable.PathInterpolatorCompat;
import com.facebook.ads.AdError;
import com.facebook.ads.RewardedVideoAdExtendedListener;
import com.facebook.ads.S2SRewardedVideoAdListener;
import com.google.common.base.Ascii;
import java.util.Arrays;
import kotlin.io.encoding.Base64;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.Zj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1002Zj implements AnonymousClass25 {
    public static byte[] A04;
    public static String[] A05 = {"l1o30ubgNMqwIxdsvAhdwl", "uEolzpc8zYF03u8DLAeDfs0A9wQx2vsd", "zKwy", "mFz9Za5MD8BXE4Lkxv", "Wms6Ep20", "", "s6yiLC", "izOiniaIEQHycLDhhOkzL"};
    public final AbstractC1013Zw A00;
    public final InterfaceC01791y A01;
    public final AnonymousClass27 A02;
    public final YA A03;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 116);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{57, Ascii.FS, 88, Ascii.ETB, Ascii.SUB, Ascii.DC2, Ascii.GS, Ascii.ESC, Ascii.FF, 88, 17, Ascii.VT, 88, Ascii.SYN, Ascii.CR, Ascii.DC4, Ascii.DC4, 56, 47, 52, 62, 54, 63, 37, 63, 34, 46, 40, 59, 41, 37, 49, 63, 35, 9, Ascii.CR, Ascii.SO, 58, 43, 38, 42, 33, 44, 42, 1, 42, 59, 56, 32, Base64.padSymbol, 36, 98, 101, Byte.MAX_VALUE, 116, 110, 121, 121, 100, 121, 116, 104, 100, 111, 110, 116, 96, 110, 114, Ascii.SO, 9, 19, Ascii.CAN, Ascii.NAK, 17, Ascii.CAN, 17, Ascii.SO, 3, 2, 8, Ascii.CAN, 3, Ascii.DC2, Ascii.NAK, 6, 19, Ascii.SO, 8, 9, Ascii.CAN, Ascii.FF, 2, Ascii.RS, 111, 108, 109, 100, 124, 106, 109, 117, 98, 111, 106, 103, 98, 119, 106, 108, 109, 124, 119, 106, 110, 102, 124, 104, 102, 122, 59, 19, 5, 5, Ascii.ETB, 17, 19, 76, 86, 96, 68, 94, 94, 68, 67, 74, Ascii.CR, 79, 88, 67, 73, 65, 72, Ascii.CR, 75, 66, 95, Ascii.CR, 64, 72, 94, 94, 76, 74, 72, 8, 44, 54, 54, 44, 43, 34, 101, 39, 48, 43, 33, 41, 32, 101, 35, 42, 55, 101, 40, 32, 54, 54, 36, 34, 32, 107, 90, 93, 91, 86, 76, 91, 91, 70, 91, 86, 68, 76, 90, 90, 72, 78, 76, 86, 66, 76, 80, 5, Ascii.DC4, Ascii.CR};
        String[] strArr = A05;
        if (strArr[6].length() == strArr[7].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A05;
        strArr2[1] = "11z8nLjTbJ8kXGgkHyQ0qsLYj80GB6ec";
        strArr2[2] = "E5wc";
    }

    static {
        A01();
    }

    public C1002Zj(YA ya, AnonymousClass27 anonymousClass27, InterfaceC01791y interfaceC01791y, AbstractC1013Zw abstractC1013Zw) {
        this.A03 = ya;
        this.A02 = anonymousClass27;
        this.A01 = interfaceC01791y;
        this.A00 = abstractC1013Zw;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass25
    public final void A8M(Message message) {
        com.facebook.ads.Ad A00 = this.A02.A00();
        String A002 = A00(203, 3, 16);
        if (A00 == null) {
            this.A03.A07().A9M(A002, C03207x.A0K, new C03217y(A00(0, 17, 12)));
            return;
        }
        int i = message.what;
        String A003 = A00(120, 9, 2);
        String A004 = A00(17, 17, 14);
        switch (i) {
            case 10:
            case 2103:
                Bundle bundle = message.getData().getBundle(A004);
                if (bundle != null) {
                    int i2 = bundle.getInt(A00(51, 18, 95));
                    String errorMessage = bundle.getString(A00(Opcodes.INVOKEVIRTUAL, 21, 125));
                    AdError adError = new AdError(i2, errorMessage);
                    this.A01.AFG(adError);
                    if (this.A02.A04 != null) {
                        this.A02.A04.onError(A00, adError);
                    } else {
                        Log.e(A00(34, 17, 59), errorMessage);
                    }
                } else {
                    this.A01.AFC(EnumC01781x.A05);
                    this.A03.A07().A9M(A002, C03207x.A0V, new C03217y(A00(155, 27, 49), A003 + message));
                }
                this.A02.A01(null);
                return;
            case AdError.BROKEN_MEDIA_ERROR_CODE /* 2100 */:
                this.A01.AFK();
                Bundle bundle2 = message.getData().getBundle(A004);
                if (bundle2 != null) {
                    this.A02.A01 = bundle2.getLong(A00(94, 26, 87));
                    AnonymousClass27 anonymousClass27 = this.A02;
                    int i3 = bundle2.getInt(A00(69, 25, 51));
                    String[] strArr = A05;
                    if (strArr[6].length() == strArr[7].length()) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A05;
                    strArr2[6] = "eimvHB";
                    strArr2[7] = "9nAYjps8XJWkdVKe7ORqJ";
                    anonymousClass27.A00 = i3;
                } else {
                    this.A03.A07().A9M(A002, C03207x.A0V, new C03217y(A00(Opcodes.LOR, 26, 89), A003 + message));
                }
                this.A02.A01(null);
                break;
            case 2106:
                this.A02.A01(null);
                break;
            case 2110:
                this.A01.AFU();
                break;
        }
        if (this.A02.A04 == null) {
            return;
        }
        switch (message.what) {
            case AdError.BROKEN_MEDIA_ERROR_CODE /* 2100 */:
                this.A02.A04.onAdLoaded(A00);
                return;
            case 2104:
                this.A02.A04.onAdClicked(A00);
                return;
            case 2105:
                this.A02.A04.onLoggingImpression(A00);
                return;
            case 2106:
                if (this.A02.A04 instanceof RewardedVideoAdExtendedListener) {
                    ((RewardedVideoAdExtendedListener) this.A02.A04).onRewardedVideoActivityDestroyed();
                    return;
                }
                return;
            case 2110:
                this.A02.A04.onRewardedVideoClosed();
                return;
            case PathInterpolatorCompat.MAX_NUM_POINTS /* 3000 */:
                this.A02.A04.onRewardedVideoCompleted();
                return;
            case AdError.MEDIATION_ERROR_CODE /* 3001 */:
                if (this.A02.A04 instanceof S2SRewardedVideoAdListener) {
                    ((S2SRewardedVideoAdListener) this.A02.A04).onRewardServerSuccess();
                    return;
                }
                return;
            case 3002:
                if (this.A02.A04 instanceof S2SRewardedVideoAdListener) {
                    ((S2SRewardedVideoAdListener) this.A02.A04).onRewardServerFailed();
                    return;
                }
                return;
            default:
                return;
        }
    }
}
