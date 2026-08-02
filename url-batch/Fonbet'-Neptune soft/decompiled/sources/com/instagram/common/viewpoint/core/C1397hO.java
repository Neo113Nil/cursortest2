package com.instagram.common.viewpoint.core;

import android.content.Intent;
import android.text.TextUtils;
import com.facebook.ads.AdError;
import com.google.common.base.Ascii;
import java.util.Arrays;
import kotlin.io.encoding.Base64;
import okio.Utf8;

/* renamed from: com.facebook.ads.redexgen.X.hO, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1397hO implements InterfaceC0593Ma {
    public static byte[] A02;
    public final /* synthetic */ C02186y A00;
    public final /* synthetic */ Runnable A01;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 58);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{64, 78, 68, 71, 78, Ascii.DC4, 79, Ascii.DC2, 77, 104, 109, 124, 120, 105, 126, 44, 101, Byte.MAX_VALUE, 44, 98, 121, 96, 96, 44, 99, 98, 44, 96, 99, 109, 104, 69, 98, 120, 105, 126, Byte.MAX_VALUE, 120, 101, 120, 101, 109, 96, 77, 104, 59, Ascii.FS, 6, Ascii.ETB, 0, 1, 6, Ascii.ESC, 6, Ascii.ESC, 19, Ascii.RS, 82, Ascii.ESC, Ascii.US, 2, 0, Ascii.ETB, 1, 1, Ascii.ESC, Ascii.GS, Ascii.FS, 82, Ascii.DC4, Ascii.ESC, 0, Ascii.ETB, Ascii.SYN, Utf8.REPLACEMENT_BYTE, 48, 1, Utf8.REPLACEMENT_BYTE, Base64.padSymbol, 42, 55, 40, 55, 42, 39, 101, 106, 96, 118, 107, 109, 96, 42, 109, 106, 112, 97, 106, 112, 42, 101, 103, 112, 109, 107, 106, 42, 82, 77, 65, 83, 34, 51, 42, 109, 108, 75, 108, 118, 103, 112, 113, 118, 107, 118, 107, 99, 110, 78, 109, 101, 101, 107, 108, 101, 75, 111, 114, 112, 103, 113, 113, 107, 109, 108};
    }

    public C1397hO(C02186y c02186y, Runnable runnable) {
        this.A00 = c02186y;
        this.A01 = runnable;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0593Ma
    public final void ADY(C1454iS c1454iS, String str, boolean z) {
        this.A00.A07.A0C();
        boolean z2 = !TextUtils.isEmpty(str);
        if (z && z2) {
            try {
                Intent intent = new Intent(A00(85, 26, 62));
                intent.setData(WQ.A00(str));
                WB.A0D(this.A00.A0B, intent);
            } catch (W9 e) {
                Throwable cause = e.getCause();
                Throwable th = e;
                if (cause != null) {
                    th = e.getCause();
                }
                this.A00.A0B.A08().AAy(A00(74, 11, 100), AbstractC0766Sv.A04, new C0767Sw(th));
            }
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0593Ma
    public final void ADZ(C1454iS c1454iS) {
        this.A00.A07.A04();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0593Ma
    public final void ADa(C1454iS c1454iS) {
        this.A00.A07.A05();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0593Ma
    public final void ADb(C1454iS c1454iS) {
        if (c1454iS != this.A00.A00) {
            return;
        }
        if (c1454iS == null) {
            this.A00.A0B.A08().AAy(A00(111, 3, 121), AbstractC0766Sv.A0X, new C0767Sw(A00(8, 37, 54)));
            ADc(c1454iS, AdError.internalError(AdError.INTERNAL_ERROR_2004));
            return;
        }
        this.A00.A0H().removeCallbacks(this.A01);
        this.A00.A01 = c1454iS;
        this.A00.A0L();
        this.A00.A07.A0F(c1454iS);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0593Ma
    public final void ADc(C1454iS c1454iS, AdError adError) {
        if (c1454iS != this.A00.A00) {
            return;
        }
        this.A00.A0H().removeCallbacks(this.A01);
        this.A00.A0Q(c1454iS);
        this.A00.A0B.A0F().A5Y(adError.getErrorCode(), adError.getErrorMessage());
        this.A00.A07.A0G(new V1(adError.getErrorCode(), adError.getErrorMessage()));
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0593Ma
    public final void ADd(C1454iS c1454iS) {
        VF.A05(A00(114, 31, 56), A00(45, 29, 72), A00(0, 8, 77));
        this.A00.A07.A0D();
        this.A00.A0O();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0593Ma
    public final void ADe() {
        this.A00.A07.A08();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0593Ma
    public final void ADf() {
        this.A00.A07.A06();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0593Ma
    public final void ADg() {
        this.A00.A07.A07();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0593Ma
    public final void onInterstitialActivityDestroyed() {
        this.A00.A07.A02();
    }
}
