package com.facebook.ads.internal.view.component.a;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.facebook.ads.internal.adapters.j;
import com.facebook.ads.internal.view.a;

/* loaded from: classes.dex */
public class d extends b {

    /* renamed from: c, reason: collision with root package name */
    private static final int f5586c = Resources.getSystem().getDisplayMetrics().widthPixels;

    /* renamed from: d, reason: collision with root package name */
    private final e f5587d;

    public d(Context context, com.facebook.ads.internal.m.c cVar, a.InterfaceC0352a interfaceC0352a, View view, View view2, View view3, boolean z, j jVar) {
        super(context, cVar, interfaceC0352a, jVar, z);
        this.f5587d = new e(context, view);
        this.f5587d.a(view2, view3, getTextContainer(), z);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12);
        layoutParams.setMargins(f5580a, f5580a, f5580a, f5580a);
        getCtaButton().setLayoutParams(layoutParams);
        FrameLayout frameLayout = new FrameLayout(context);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams2.addRule(2, getCtaButton().getId());
        frameLayout.setLayoutParams(layoutParams2);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams3.gravity = 17;
        layoutParams3.setMargins(f5580a, 0, f5580a, 0);
        frameLayout.addView(this.f5587d, layoutParams3);
        addView(frameLayout);
        addView(getCtaButton());
    }

    @Override // com.facebook.ads.internal.view.component.a.b
    public void a(String str, String str2, String str3, String str4, String str5, double d2) {
        super.a(str, str2, str3, str4, str5, d2);
        if (d2 > 0.0d) {
            double d3 = f5586c - (f5580a * 2);
            Double.isNaN(d3);
            this.f5587d.a((int) (d2 * d3));
        }
    }

    @Override // com.facebook.ads.internal.view.component.a.b
    public boolean a() {
        return false;
    }

    @Override // com.facebook.ads.internal.view.component.a.b
    protected boolean b() {
        return false;
    }

    @Override // com.facebook.ads.internal.view.component.a.b
    protected boolean c() {
        return false;
    }
}
