package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.TextView;

/* loaded from: assets/audience_network.dex */
public final class Mn extends AbstractC0950Zv {
    public final TextView A00;
    public final TextView A01;
    public static final int A02 = (int) (AbstractC0862Wl.A02 * 36.0f);
    public static final int A05 = (int) (AbstractC0862Wl.A02 * 4.0f);
    public static final int A03 = (int) (AbstractC0862Wl.A02 * 8.0f);
    public static final int A04 = (int) (AbstractC0862Wl.A02 * 4.0f);

    public Mn(C1159dL c1159dL, int i, C0622My c0622My, boolean z, String str, US us, InterfaceC0890Xn interfaceC0890Xn, C1232eX c1232eX, XH xh, N3 n3) {
        super(c1159dL, null, i, c0622My, z, str, us, interfaceC0890Xn, c1232eX, xh, n3, false, "");
        setOrientation(0);
        setPadding(A05, A05, A05, A05);
        this.A01 = A01(-16448251, 13, true);
        this.A00 = A01(-10131605, 12, false);
        this.A06.addView(A00(i), new LinearLayout.LayoutParams(-1, -2));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
        layoutParams.weight = 1.0f;
        addView(this.A06, layoutParams);
        this.A08.setPadding(A03, 0, A03, 0);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, A02);
        layoutParams2.gravity = 17;
        addView(this.A08, layoutParams2);
    }

    private LinearLayout A00(int i) {
        LinearLayout linearLayout = new LinearLayout(this.A07);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(A04, 0, A04, 0);
        linearLayout.addView(this.A01, AbstractC0950Zv.A0B);
        linearLayout.addView(this.A00, AbstractC0950Zv.A0B);
        LinearLayout linearLayout2 = new LinearLayout(this.A07);
        linearLayout2.setOrientation(0);
        linearLayout2.addView(this.A09, new LinearLayout.LayoutParams(i, i));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 16;
        linearLayout2.addView(linearLayout, layoutParams);
        return linearLayout2;
    }

    private TextView A01(int i, int i2, boolean z) {
        TextView textView = new TextView(this.A07);
        textView.setTextColor(i);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        XP.A0W(textView, z, i2);
        return textView;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0950Zv
    public final void A0g() {
        super.A0g();
        setOnClickListener(this.A05);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0950Zv
    public final void A0h(int i) {
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0950Zv
    public void setInfo(C0620Mw c0620Mw, C0623Mz c0623Mz, String str, String str2, InterfaceC0872Wv interfaceC0872Wv, InterfaceC0959a4 interfaceC0959a4) {
        super.setInfo(c0620Mw, c0623Mz, str, str2, interfaceC0872Wv, interfaceC0959a4);
        this.A01.setText(c0620Mw.A0F());
        this.A00.setText(c0620Mw.A0E());
        if (TextUtils.isEmpty(c0623Mz.A04())) {
            XP.A0F(this.A08);
        }
    }
}
