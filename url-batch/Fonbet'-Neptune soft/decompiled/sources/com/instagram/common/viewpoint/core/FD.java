package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import android.util.SparseBooleanArray;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

/* loaded from: assets/audience_network.dex */
public final class FD extends AbstractC0700Qg implements InterfaceC0891Xu {
    public static String[] A08 = {"biNTtjxa0xULALtZEUOcP", "rMVpYr4hwZgX", "y0rebd1hOaNR", "snwXdVXwO66aPvNuuMD2", "jxkMgVVp1g5", "Dcah1JX", "lglxOXHbCZFpcLf1TWQPAMUDis4zLCZx", "n80A5ryznQOlcAJIvKv7FeLq2ck19EHB"};
    public N3 A00;
    public AbstractC1225eW A01;
    public C1226eX A02;
    public C1226eX A03;
    public final int A04;
    public final SparseBooleanArray A05;
    public final C1153dL A06;
    public final C01755h A07;

    public FD(C01755h c01755h, SparseBooleanArray sparseBooleanArray, C1226eX c1226eX, int i, C1153dL c1153dL, N3 n3) {
        super(c01755h);
        this.A06 = c1153dL;
        this.A07 = c01755h;
        this.A05 = sparseBooleanArray;
        this.A02 = c1226eX;
        this.A04 = i;
        this.A00 = n3;
    }

    private void A05(US us, XH xh, String str, C1120cn c1120cn) {
        if (this.A05.get(c1120cn.A02())) {
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
        this.A01 = new FF(this, str, c1120cn, us, c1120cn.A04(), xh);
        this.A03 = new C1226eX(this.A07, 10, new WeakReference(this.A01), this.A06);
        this.A03.A0Y(false);
        this.A03.A0W(100);
        this.A03.A0X(100);
        this.A07.setOnAssetsLoadedListener(new FE(this, c1120cn));
    }

    public final void A0p(C1120cn c1120cn, US us, SF sf, XH xh, String str, int i, int i2, int i3) {
        int A02 = c1120cn.A02();
        this.A07.setTag(-1593835536, Integer.valueOf(A02));
        this.A07.setupNativeCtaExtension(c1120cn);
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
        String A082 = c1120cn.A03().A0H().A08();
        String A09 = c1120cn.A03().A0H().A09();
        this.A07.setIsVideo(!TextUtils.isEmpty(A09));
        if (this.A07.A1T()) {
            this.A07.setVideoPlaceholderUrl(A082);
            this.A07.setVideoUrl(sf.A0T(A09));
        } else {
            this.A07.setImageUrl(A082);
        }
        this.A07.setLayoutParams(marginLayoutParams);
        this.A07.setCTAInfo(c1120cn.A03().A0J(), c1120cn.A04());
        this.A07.A1U(c1120cn.A04());
        A05(us, xh, str, c1120cn);
    }

    public final void A0q(C1226eX c1226eX) {
        this.A02 = c1226eX;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0891Xu
    public final void AIV() {
        this.A07.A1O();
    }
}
