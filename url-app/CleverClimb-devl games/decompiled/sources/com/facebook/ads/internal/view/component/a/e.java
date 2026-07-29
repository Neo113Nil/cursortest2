package com.facebook.ads.internal.view.component.a;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.facebook.ads.internal.q.a.v;
import com.facebook.ads.internal.view.component.f;
import com.facebook.ads.internal.view.component.i;

/* loaded from: classes.dex */
final class e extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    private final View f5588a;

    /* renamed from: b, reason: collision with root package name */
    private final f f5589b;

    public e(Context context, View view) {
        super(context);
        this.f5588a = view;
        this.f5589b = new f(context);
        v.a(this.f5589b);
    }

    public void a(int i) {
        this.f5588a.setLayoutParams(new RelativeLayout.LayoutParams(-1, i));
    }

    public void a(View view, View view2, i iVar, boolean z) {
        this.f5589b.addView(this.f5588a, new RelativeLayout.LayoutParams(-1, -2));
        if (view2 != null) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(b.f5581b, b.f5581b);
            layoutParams.addRule(6, this.f5588a.getId());
            layoutParams.addRule(7, this.f5588a.getId());
            layoutParams.setMargins(b.f5580a, b.f5580a, b.f5580a, b.f5580a);
            this.f5589b.addView(view2, layoutParams);
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(8, this.f5588a.getId());
        if (iVar != null) {
            if (z) {
                LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
                iVar.setAlignment(3);
                layoutParams3.setMargins(b.f5580a / 2, b.f5580a / 2, b.f5580a / 2, b.f5580a / 2);
                linearLayout.addView(iVar, layoutParams3);
                GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{-1778384896, 0});
                gradientDrawable.setCornerRadius(0.0f);
                gradientDrawable.setGradientType(0);
                v.a(linearLayout, gradientDrawable);
            } else {
                RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams4.addRule(3, this.f5589b.getId());
                layoutParams4.setMargins(0, b.f5580a, 0, 0);
                iVar.setAlignment(17);
                addView(iVar, layoutParams4);
            }
        }
        if (view != null) {
            linearLayout.addView(view, new RelativeLayout.LayoutParams(-1, -2));
        }
        this.f5589b.addView(linearLayout, layoutParams2);
        addView(this.f5589b, new RelativeLayout.LayoutParams(-1, -2));
    }
}
