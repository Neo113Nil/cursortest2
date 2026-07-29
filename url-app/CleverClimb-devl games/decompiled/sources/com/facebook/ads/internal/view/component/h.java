package com.facebook.ads.internal.view.component;

import android.content.Context;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.ads.internal.q.a.v;
import com.facebook.ads.internal.view.p;

/* loaded from: classes.dex */
public class h extends LinearLayout {
    public h(Context context, com.facebook.ads.internal.n.e eVar, com.facebook.ads.internal.n.h hVar) {
        super(context);
        float f = v.f5438b;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.setVerticalGravity(16);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        float f2 = f * 15.0f;
        layoutParams.setMargins(Math.round(f2), Math.round(f2), Math.round(f2), Math.round(f2));
        linearLayout.setLayoutParams(layoutParams);
        addView(linearLayout);
        String m = eVar.m();
        TextView textView = new TextView(getContext());
        textView.setText(TextUtils.isEmpty(m) ? eVar.l() : m);
        p.a(textView, hVar);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setSingleLine(true);
        linearLayout.addView(textView);
        TextView textView2 = new TextView(getContext());
        textView2.setText(eVar.n());
        p.b(textView2, hVar);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setMaxLines(2);
        linearLayout.addView(textView2);
    }
}
