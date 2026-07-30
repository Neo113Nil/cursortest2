package com.instagram.common.viewpoint.core;

import android.widget.RelativeLayout;
import com.google.common.base.Ascii;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.Zc, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0931Zc extends RelativeLayout {
    public static InterfaceC0890Xn A05;
    public static byte[] A06;
    public static final int A07;
    public static final int A08;
    public static final int A09;
    public AbstractC1320fy A00;
    public C1159dL A01;
    public C0K A02;
    public LE A03;
    public C0972aJ A04;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 60);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A06 = new byte[]{2, 32, 51, 46, 52, 50, 36, 45, 97, Ascii.SI, 32, 53, 40, 55, 36, 97, 55, 40, 36, 54, 97, 32, 37, 36, 49, 53, 36, 51, 97, 40, 50, 47, 102, 53, 97, 34, 51, 36, 32, 53, 36, 37, 97, 49, 51, 46, 49, 36, 51, 45, 56, 67, 65, 74, 65, 86, 77, 71};
    }

    static {
        A02();
        A08 = (int) (AbstractC0862Wl.A02 * 8.0f);
        A07 = A08 * 10;
        A09 = (int) (AbstractC0862Wl.A02 * 15.0f);
        A05 = new LD();
    }

    public C0931Zc(C1159dL c1159dL) {
        super(c1159dL);
        this.A01 = c1159dL;
        this.A02 = new C0K(c1159dL);
        XP.A0I(this.A02);
        this.A00 = new C02076h();
        this.A00.A0G(this.A02);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        addView(this.A02, layoutParams);
    }

    private ArrayList<C1126cn> A01(AbstractC1434hy abstractC1434hy) {
        if (abstractC1434hy == null) {
            return new ArrayList<>();
        }
        List<C0613Mp> A27 = abstractC1434hy.A27();
        ArrayList<C1126cn> arrayList = new ArrayList<>(A27.size());
        for (int i = 0; i < A27.size(); i++) {
            arrayList.add(new C1126cn(i, A27.size(), A27.get(i)));
        }
        return arrayList;
    }

    public final void A04() {
        this.A02.setAdapter(null);
    }

    public final void A05(C0702Qc c0702Qc, int i) {
        ArrayList<C1126cn> A01 = A01(c0702Qc.A10());
        this.A02.setCardsInfo(A01);
        this.A03 = new LE(this.A01, A01, c0702Qc.A10(), this.A01.A02().A0A(), c0702Qc, A05, c0702Qc.A10().A25(), this.A02.getCarouselCardBehaviorHelper(), null);
        this.A02.setAdapter(this.A03);
        if (i == 0) {
            i = AbstractC0862Wl.A04.widthPixels;
        }
        this.A03.A0O(i - A07, 16, 0);
        this.A03.A0G();
        setupDotsLayout(c0702Qc, A01);
    }

    public final void A06(C1232eX c1232eX) {
        if (this.A03 != null) {
            this.A03.A0P(c1232eX);
        } else {
            this.A01.A08().AAy(A00(51, 7, 24), AbstractC0772Sv.A1v, new C0773Sw(A00(0, 51, Opcodes.LUSHR)));
        }
        this.A02.A20(c1232eX);
    }

    public static InterfaceC0890Xn getDummyListener() {
        return A05;
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (z && this.A03 != null) {
            this.A03.A0O((i3 - i) - A07, 16, 0);
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUpLayoutForCardAtIndex(int i) {
        if (this.A04 != null) {
            this.A04.A00(i);
        }
    }

    private void setupDotsLayout(C0702Qc c0702Qc, ArrayList<C1126cn> arrayList) {
        this.A02.getCarouselCardBehaviorHelper().A0Y(new L5(this));
        this.A04 = new C0972aJ(this.A01, c0702Qc.A10().A1z().A01(), arrayList.size());
        XP.A0I(this.A04);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(3, this.A02.getId());
        layoutParams.setMargins(0, A09, 0, 0);
        addView(this.A04, layoutParams);
    }
}
