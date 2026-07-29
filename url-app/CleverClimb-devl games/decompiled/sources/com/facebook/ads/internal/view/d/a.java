package com.facebook.ads.internal.view.d;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.support.v4.view.GravityCompat;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.facebook.ads.internal.adapters.ad;
import com.facebook.ads.internal.adapters.j;
import com.facebook.ads.internal.q.a.v;
import com.facebook.ads.internal.view.a;
import com.facebook.ads.internal.view.component.i;
import com.facebook.ads.internal.view.e.b.z;
import java.util.HashMap;

/* loaded from: classes.dex */
public class a extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    private static final int f5615a = (int) (v.f5438b * 12.0f);

    /* renamed from: b, reason: collision with root package name */
    private static final int f5616b = (int) (v.f5438b * 16.0f);

    /* renamed from: c, reason: collision with root package name */
    private final i f5617c;

    /* renamed from: d, reason: collision with root package name */
    private final ImageView f5618d;
    private final RelativeLayout e;
    private final com.facebook.ads.internal.view.component.a f;
    private final int g;

    public a(Context context, int i, j jVar, com.facebook.ads.internal.m.c cVar, a.InterfaceC0352a interfaceC0352a, boolean z, boolean z2) {
        super(context);
        this.g = i;
        this.f5618d = new com.facebook.ads.internal.view.component.e(context);
        v.a(this.f5618d);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i, i);
        layoutParams.addRule(15);
        layoutParams.addRule(9);
        layoutParams.setMargins(0, 0, f5615a, 0);
        if (z2) {
            this.f5618d.setVisibility(8);
        }
        this.f5617c = new i(context, jVar, true, z, true);
        this.f5617c.setAlignment(GravityCompat.START);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(1, this.f5618d.getId());
        layoutParams2.addRule(15);
        this.f = new com.facebook.ads.internal.view.component.a(context, true, false, z.REWARDED_VIDEO_AD_CLICK.a(), jVar, cVar, interfaceC0352a);
        this.f.setVisibility(8);
        this.e = new RelativeLayout(context);
        v.a(this.e);
        this.e.addView(this.f5618d, layoutParams);
        this.e.addView(this.f5617c, layoutParams2);
        addView(this.e, new LinearLayout.LayoutParams(-2, -2));
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{0, -15658735});
        gradientDrawable.setCornerRadius(0.0f);
        v.a(this, gradientDrawable);
    }

    public void a() {
        this.f.setVisibility(0);
    }

    public void a(int i) {
        v.b(this.f);
        int i2 = i != 1 ? 0 : 1;
        setOrientation(i2);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i2 != 0 ? -1 : 0, -2);
        layoutParams.weight = 1.0f;
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(i2 == 0 ? -2 : -1, -2);
        layoutParams2.setMargins(i2 != 0 ? 0 : f5616b, i2 != 0 ? f5616b : 0, 0, 0);
        layoutParams2.gravity = 80;
        this.e.setLayoutParams(layoutParams);
        addView(this.f, layoutParams2);
    }

    public void setInfo(ad adVar) {
        this.f5617c.a(adVar.f(), adVar.g(), false, false);
        this.f.a(adVar.q(), adVar.p(), adVar.b(), new HashMap());
        if (TextUtils.isEmpty(adVar.i())) {
            return;
        }
        new com.facebook.ads.internal.view.b.d(this.f5618d).a(this.g, this.g).a(adVar.i());
    }
}
