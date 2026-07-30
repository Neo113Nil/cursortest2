package com.anythink.basead.ui.thirdparty;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.anythink.basead.ui.thirdparty.a;
import com.anythink.core.common.v.q;
import com.anythink.expressad.foundation.h.k;

/* loaded from: classes.dex */
public class ThirdPartySplashBannerATView extends RelativeLayout implements com.anythink.core.common.l.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    private Context f11513a;

    /* renamed from: b, reason: collision with root package name */
    private a f11514b;

    public ThirdPartySplashBannerATView(Context context) {
        this(context, null);
    }

    private void a() {
        TextView textView = new TextView(this.f11513a);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        int a9 = q.a(this.f11513a, 5.0f);
        layoutParams.leftMargin = a9;
        layoutParams.topMargin = a9;
        layoutParams.addRule(10);
        layoutParams.addRule(9);
        textView.setBackgroundResource(q.a(this.f11513a, "myoffer_splash_ad_label_bg", k.f19790c));
        int a10 = q.a(this.f11513a, 2.0f);
        textView.setPadding(a9, a10, a9, a10);
        textView.setText(q.a(this.f11513a, "basead_ad_text", k.f19794g));
        textView.setTextColor(Color.parseColor("#ffffff"));
        textView.setTextSize(2, 11.0f);
        textView.setGravity(17);
        addView(textView, layoutParams);
    }

    private void b() {
        TextView textView = new TextView(this.f11513a);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        int a9 = q.a(this.f11513a, 5.0f);
        layoutParams.leftMargin = a9;
        layoutParams.topMargin = a9;
        layoutParams.addRule(10);
        layoutParams.addRule(9);
        textView.setBackgroundResource(q.a(this.f11513a, "myoffer_splash_ad_label_bg", k.f19790c));
        int a10 = q.a(this.f11513a, 2.0f);
        textView.setPadding(a9, a10, a9, a10);
        textView.setText(q.a(this.f11513a, "basead_ad_text", k.f19794g));
        textView.setTextColor(Color.parseColor("#ffffff"));
        textView.setTextSize(2, 11.0f);
        textView.setGravity(17);
        addView(textView, layoutParams);
    }

    public void addBannerView(View view) {
        if (view == null) {
            return;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(view);
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(12);
        layoutParams.addRule(14);
        addView(view, layoutParams);
    }

    public void addCountDownView(int i, a.InterfaceC0064a interfaceC0064a) {
        a aVar = new a(this.f11513a, this, i * 1000, interfaceC0064a);
        this.f11514b = aVar;
        View a9 = aVar.a();
        if (a9 == null) {
            return;
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(11);
        layoutParams.addRule(10);
        layoutParams.setMargins(0, q.a(this.f11513a, 32.0f), q.a(this.f11513a, 18.0f), 0);
        addView(a9, layoutParams);
        this.f11514b.b();
    }

    public ThirdPartySplashBannerATView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ThirdPartySplashBannerATView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f11513a = context;
        TextView textView = new TextView(this.f11513a);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        int a9 = q.a(this.f11513a, 5.0f);
        layoutParams.leftMargin = a9;
        layoutParams.topMargin = a9;
        layoutParams.addRule(10);
        layoutParams.addRule(9);
        textView.setBackgroundResource(q.a(this.f11513a, "myoffer_splash_ad_label_bg", k.f19790c));
        int a10 = q.a(this.f11513a, 2.0f);
        textView.setPadding(a9, a10, a9, a10);
        textView.setText(q.a(this.f11513a, "basead_ad_text", k.f19794g));
        textView.setTextColor(Color.parseColor("#ffffff"));
        textView.setTextSize(2, 11.0f);
        textView.setGravity(17);
        addView(textView, layoutParams);
    }
}
