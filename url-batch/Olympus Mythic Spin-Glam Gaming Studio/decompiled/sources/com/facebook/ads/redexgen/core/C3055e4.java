package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

/* renamed from: com.facebook.ads.redexgen.X.e4, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C3055e4 extends LinearLayout {
    public static final int A04 = (int) (XX.A02 * 32.0f);
    public static final int A05 = (int) (XX.A02 * 8.0f);
    public TextView A00;
    public TextView A01;
    public C2912bk A02;
    public final C3218gi A03;

    public C3055e4(C3218gi c3218gi) {
        super(c3218gi);
        this.A03 = c3218gi;
        A00(c3218gi);
    }

    private final void A00(C3218gi c3218gi) {
        setGravity(16);
        this.A02 = new C2912bk(c3218gi);
        this.A02.setFullCircleCorners(true);
        LinearLayout.LayoutParams pageImageViewParams = new LinearLayout.LayoutParams(A04, A04);
        pageImageViewParams.setMargins(0, 0, A05, 0);
        addView(this.A02, pageImageViewParams);
        LinearLayout pageInfoView = new LinearLayout(c3218gi);
        pageInfoView.setOrientation(1);
        this.A00 = new TextView(c3218gi);
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        YB.A0a(this.A00, true, 16);
        this.A00.setEllipsize(TextUtils.TruncateAt.END);
        this.A00.setSingleLine(true);
        this.A01 = new TextView(c3218gi);
        YB.A0a(this.A01, false, 14);
        pageInfoView.addView(this.A00);
        pageInfoView.addView(this.A01);
        addView(pageInfoView, layoutParams);
    }

    public final void A01() {
        this.A02.setImageBitmap(null);
        this.A00.setText("");
        this.A01.setText("");
    }

    public final void A02(int i, int i2) {
        this.A00.setTextColor(i);
        this.A01.setTextColor(i2);
    }

    public void setPageDetails(C2488Nm c2488Nm) {
        LM lm = new LM(this.A02, this.A03);
        lm.A05(A04, A04);
        lm.A07(c2488Nm.A01());
        this.A00.setText(c2488Nm.A02());
        this.A01.setText(c2488Nm.A03());
    }
}
