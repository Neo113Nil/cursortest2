package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/* renamed from: com.facebook.ads.redexgen.X.Zv, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2799Zv extends LinearLayout {
    public static final int A03 = (int) (XX.A02 * 40.0f);
    public static final int A04 = (int) (XX.A02 * 20.0f);
    public static final int A05 = (int) (XX.A02 * 10.0f);
    public final C2512Ok A00;
    public final C3218gi A01;
    public final InterfaceC2783Zf A02;

    public C2799Zv(C3218gi c3218gi, C2512Ok c2512Ok, InterfaceC2783Zf interfaceC2783Zf, YM ym) {
        this(c3218gi, c2512Ok, interfaceC2783Zf, null, ym);
    }

    public C2799Zv(C3218gi c3218gi, C2512Ok c2512Ok, InterfaceC2783Zf interfaceC2783Zf, String str, YM ym) {
        super(c3218gi);
        this.A01 = c3218gi;
        this.A00 = c2512Ok;
        this.A02 = interfaceC2783Zf;
        setOrientation(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        if (!TextUtils.isEmpty(str)) {
            View headerView = A01(str);
            headerView.setPadding(0, 0, 0, 0);
            View view = new View(getContext());
            view.setLayoutParams(new LinearLayout.LayoutParams(-1, 1));
            YB.A0N(view, -10459280);
            addView(headerView, layoutParams);
            addView(view);
        }
        if (!TextUtils.isEmpty(this.A00.A03())) {
            View A00 = A00(ym, this.A00.A03());
            A00.setPadding(0, A05, 0, A05);
            addView(A00, layoutParams);
        }
        C2805a1 A032 = A03();
        A032.setPadding(0, A05, 0, 0);
        addView(A032, layoutParams);
    }

    private View A00(YM ym, String str) {
        ImageView imageView = new ImageView(getContext());
        imageView.setColorFilter(-10459280);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(A04, A04);
        layoutParams.gravity = 16;
        imageView.setImageBitmap(YN.A01(ym));
        TextView textView = new TextView(getContext());
        YB.A0a(textView, true, 14);
        textView.setTextColor(-10459280);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        textView.setText(str);
        textView.setPadding(A05, 0, 0, 0);
        textView.setFocusable(true);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.addView(imageView, layoutParams);
        linearLayout.addView(textView, layoutParams2);
        return linearLayout;
    }

    private View A01(String str) {
        ImageView imageView = new ImageView(getContext());
        imageView.setColorFilter(-10459280);
        imageView.setImageBitmap(YN.A01(YM.BACK_ARROW));
        imageView.setPadding(0, A05, A05 * 2, A05);
        LinearLayout.LayoutParams titleParams = new LinearLayout.LayoutParams(A03, A03);
        imageView.setOnClickListener(new ViewOnClickListenerC2797Zt(this));
        TextView textView = new TextView(getContext());
        textView.setGravity(17);
        textView.setText(str);
        YB.A0a(textView, true, 16);
        textView.setTextColor(-14934495);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, 0, A03, 0);
        layoutParams.gravity = 17;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.addView(imageView, titleParams);
        linearLayout.addView(textView, layoutParams);
        return linearLayout;
    }

    private C2805a1 A03() {
        C2805a1 c2805a1 = new C2805a1(this.A01);
        for (C2512Ok c2512Ok : this.A00.A05()) {
            C2785Zh c2785Zh = new C2785Zh(this.A01);
            c2785Zh.setData(c2512Ok.A04(), null);
            c2785Zh.setOnClickListener(new ViewOnClickListenerC2798Zu(this, c2785Zh, c2512Ok));
            c2805a1.addView(c2785Zh);
        }
        return c2805a1;
    }
}
