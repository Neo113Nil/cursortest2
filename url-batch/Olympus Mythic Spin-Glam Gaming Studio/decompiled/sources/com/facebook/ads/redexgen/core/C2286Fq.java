package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import android.util.SparseBooleanArray;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.redexgen.X.Fq, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2286Fq extends RK implements InterfaceC2766Yo {
    public static String[] A08 = {"biNTtjxa0xULALtZEUOcP", "rMVpYr4hwZgX", "y0rebd1hOaNR", "snwXdVXwO66aPvNuuMD2", "jxkMgVVp1g5", "Dcah1JX", "lglxOXHbCZFpcLf1TWQPAMUDis4zLCZx", "n80A5ryznQOlcAJIvKv7FeLq2ck19EHB"};
    public C2482Ng A00;
    public AbstractC3162fo A01;
    public C3163fp A02;
    public C3163fp A03;
    public final int A04;
    public final SparseBooleanArray A05;
    public final C3218gi A06;
    public final C6M A07;

    public C2286Fq(C6M c6m, SparseBooleanArray sparseBooleanArray, C3163fp c3163fp, int i, C3218gi c3218gi, C2482Ng c2482Ng) {
        super(c6m);
        this.A06 = c3218gi;
        this.A07 = c6m;
        this.A05 = sparseBooleanArray;
        this.A02 = c3163fp;
        this.A04 = i;
        this.A00 = c2482Ng;
    }

    private void A05(VA va, Y2 y2, String str, C3056e5 c3056e5) {
        if (this.A05.get(c3056e5.A02())) {
            return;
        }
        if (this.A03 != null) {
            this.A03.A0V();
            String[] strArr = A08;
            if (strArr[1].length() != strArr[2].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A08;
            strArr2[3] = "sEemyGdXpNnP2WRBMWcD";
            strArr2[0] = "kawPFcVLuq3VyedHvbBIc";
            this.A03 = null;
        }
        this.A01 = new C2288Fs(this, str, c3056e5, va, c3056e5.A04(), y2);
        this.A03 = new C3163fp(this.A07, 10, new WeakReference(this.A01), this.A06);
        this.A03.A0Y(false);
        this.A03.A0W(100);
        this.A03.A0X(100);
        this.A07.setOnAssetsLoadedListener(new C2287Fr(this, c3056e5));
    }

    public final void A0p(C3056e5 c3056e5, VA va, C2624Sx c2624Sx, Y2 y2, String str, int i, int i2, int i3) {
        int A02 = c3056e5.A02();
        this.A07.setTag(-1593835536, Integer.valueOf(A02));
        this.A07.setupNativeCtaExtension(c3056e5);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(i, -2);
        int rightMargin = A02 == 0 ? i3 : i2;
        if (A02 < this.A04 - 1) {
            i3 = i2;
        }
        String[] strArr = A08;
        if (strArr[1].length() != strArr[2].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A08;
        strArr2[1] = "ng4t5bAKqCWK";
        strArr2[2] = "n9xBZs9SEWUc";
        marginLayoutParams.setMargins(rightMargin, 0, i3, 0);
        String A082 = c3056e5.A03().A0H().A08();
        String A09 = c3056e5.A03().A0H().A09();
        this.A07.setIsVideo(!TextUtils.isEmpty(A09));
        if (this.A07.A1V()) {
            this.A07.setVideoPlaceholderUrl(A082);
            this.A07.setVideoUrl(c2624Sx.A0T(A09));
        } else {
            this.A07.setImageUrl(A082);
        }
        this.A07.setLayoutParams(marginLayoutParams);
        this.A07.setCTAInfo(c3056e5.A03().A0J(), c3056e5.A04());
        this.A07.A1W(c3056e5.A04());
        A05(va, y2, str, c3056e5);
    }

    public final void A0q(C3163fp c3163fp) {
        this.A02 = c3163fp;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2766Yo
    public final void AJF() {
        this.A07.A1Q();
    }
}
