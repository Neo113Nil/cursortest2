package com.facebook.ads.internal.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.facebook.ads.internal.view.a;
import java.util.Map;

/* loaded from: classes.dex */
public class h extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    private final Paint f5853a;

    /* renamed from: b, reason: collision with root package name */
    private final float f5854b;

    /* renamed from: c, reason: collision with root package name */
    private final float f5855c;

    /* renamed from: d, reason: collision with root package name */
    private final float f5856d;
    private LinearLayout e;
    private com.facebook.ads.internal.view.component.i f;
    private com.facebook.ads.internal.view.component.a g;
    private u h;
    private com.facebook.ads.internal.m.c i;
    private a.InterfaceC0352a j;
    private final String k;

    public h(Context context, com.facebook.ads.internal.adapters.j jVar, boolean z, com.facebook.ads.internal.m.c cVar, a.InterfaceC0352a interfaceC0352a, String str) {
        super(context);
        this.i = cVar;
        this.j = interfaceC0352a;
        this.k = str;
        float f = getResources().getDisplayMetrics().density;
        this.f5854b = 1.0f * f;
        this.f5856d = 4.0f * f;
        this.f5855c = 6.0f * f;
        setGravity(17);
        setPadding((int) this.f5854b, 0, (int) this.f5854b, (int) this.f5854b);
        com.facebook.ads.internal.q.a.v.a(this, 0);
        if (z) {
            b(context, f, jVar);
        } else {
            a(context, f, jVar);
        }
        this.f5853a = new Paint();
        this.f5853a.setColor(-16777216);
        this.f5853a.setStyle(Paint.Style.FILL);
        this.f5853a.setAlpha(16);
        this.f5853a.setAntiAlias(true);
        if (Build.VERSION.SDK_INT < 18) {
            setLayerType(1, null);
        }
    }

    private void a(Context context, float f, com.facebook.ads.internal.adapters.j jVar) {
        this.h = new u(context);
        this.h.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        com.facebook.ads.internal.q.a.v.a(this.h);
        this.f = new com.facebook.ads.internal.view.component.i(context, jVar, false, false, true);
        this.f.setAlignment(3);
        this.f.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        this.f.setPadding(0, 0, 0, (int) (20.0f * f));
        this.g = new com.facebook.ads.internal.view.component.a(context, true, false, "com.facebook.ads.interstitial.clicked", jVar, this.i, this.j);
        this.g.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        this.e = new LinearLayout(context);
        if (Build.VERSION.SDK_INT >= 16) {
            this.e.setBackground(new ColorDrawable(-1));
        } else {
            this.e.setBackgroundDrawable(new ColorDrawable(-1));
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(3, this.h.getId());
        this.e.setLayoutParams(layoutParams);
        this.e.setOrientation(1);
        int i = (int) (16.0f * f);
        this.e.setPadding(i, i, i, i);
        this.e.addView(this.f);
        this.e.addView(this.g);
        addView(this.h);
        addView(this.e);
    }

    private void b(Context context, float f, com.facebook.ads.internal.adapters.j jVar) {
        u uVar;
        int a2;
        this.h = new u(context);
        this.h.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        if (Build.VERSION.SDK_INT >= 17) {
            uVar = this.h;
            a2 = View.generateViewId();
        } else {
            uVar = this.h;
            a2 = com.facebook.ads.internal.q.a.v.a();
        }
        uVar.setId(a2);
        this.f = new com.facebook.ads.internal.view.component.i(context, jVar, true, true, true);
        this.f.setAlignment(3);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(8, this.h.getId());
        int i = (int) (f * 12.0f);
        this.f.setLayoutParams(layoutParams);
        this.f.setPadding(i, i, i, i);
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{0, -15658735});
        gradientDrawable.setCornerRadius(0.0f);
        com.facebook.ads.internal.q.a.v.a(this.f, gradientDrawable);
        this.g = new com.facebook.ads.internal.view.component.a(context, false, false, "com.facebook.ads.interstitial.clicked", jVar, this.i, this.j);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(3, this.h.getId());
        this.g.setLayoutParams(layoutParams2);
        addView(this.h);
        addView(this.f);
        addView(this.g);
    }

    public void a(String str, String str2) {
        this.f.a(str, str2, true, false);
    }

    public void a(String str, String str2, Map<String, String> map) {
        this.g.a(str, str2, this.k, map);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        Path path = new Path();
        path.addRoundRect(new RectF(0.0f, 0.0f, getWidth(), getHeight()), this.f5855c, this.f5855c, Path.Direction.CW);
        canvas.drawPath(path, this.f5853a);
        Path path2 = new Path();
        path2.addRoundRect(new RectF(this.f5854b, 0.0f, getWidth() - this.f5854b, getHeight() - this.f5854b), this.f5856d, this.f5856d, Path.Direction.CW);
        canvas.clipPath(path2);
        super.onDraw(canvas);
    }

    public void setImageUrl(String str) {
        new com.facebook.ads.internal.view.b.d(this.h).a(str);
    }
}
