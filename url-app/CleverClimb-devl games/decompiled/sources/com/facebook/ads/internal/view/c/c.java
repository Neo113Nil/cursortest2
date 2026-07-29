package com.facebook.ads.internal.view.c;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.ads.internal.q.a.v;

/* loaded from: classes.dex */
public class c extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    private d f5565a;

    /* renamed from: b, reason: collision with root package name */
    private TextView f5566b;

    /* renamed from: c, reason: collision with root package name */
    private TextView f5567c;

    public c(Context context) {
        super(context);
        a(context);
    }

    public void a(int i, int i2) {
        this.f5566b.setTextColor(i);
        this.f5567c.setTextColor(i2);
    }

    public void a(Context context) {
        int i = (int) (v.f5438b * 32.0f);
        setGravity(16);
        this.f5565a = new d(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i, i);
        layoutParams.setMargins(0, 0, (int) (v.f5438b * 8.0f), 0);
        addView(this.f5565a, layoutParams);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        this.f5566b = new TextView(context);
        ViewGroup.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        this.f5566b.setTypeface(Typeface.SANS_SERIF, 1);
        this.f5566b.setTextSize(2, 16.0f);
        this.f5566b.setEllipsize(TextUtils.TruncateAt.END);
        this.f5566b.setSingleLine(true);
        this.f5567c = new TextView(context);
        this.f5567c.setTypeface(Typeface.SANS_SERIF, 0);
        this.f5567c.setTextSize(2, 14.0f);
        linearLayout.addView(this.f5566b);
        linearLayout.addView(this.f5567c);
        addView(linearLayout, layoutParams2);
    }

    public void a(String str, String str2, String str3) {
        com.facebook.ads.internal.view.b.d dVar = new com.facebook.ads.internal.view.b.d(this.f5565a);
        dVar.a((int) (v.f5438b * 32.0f), (int) (v.f5438b * 32.0f));
        dVar.a(str2);
        this.f5566b.setText(str);
        this.f5567c.setText(str3);
    }
}
