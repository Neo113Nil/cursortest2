package com.chartboost.sdk.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import com.chartboost.sdk.e;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public class bc extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    private e.a f3772a;

    /* renamed from: b, reason: collision with root package name */
    private ax f3773b;

    /* renamed from: c, reason: collision with root package name */
    private ax f3774c;

    /* renamed from: d, reason: collision with root package name */
    private final com.chartboost.sdk.Model.c f3775d;

    public void b() {
    }

    public bc(Context context, com.chartboost.sdk.Model.c cVar) {
        super(context);
        this.f3775d = cVar;
        if (cVar.p.f3611b == 0) {
            this.f3773b = new ax(context);
            addView(this.f3773b, new RelativeLayout.LayoutParams(-1, -1));
            this.f3774c = new ax(context);
            addView(this.f3774c, new RelativeLayout.LayoutParams(-1, -1));
            this.f3774c.setVisibility(8);
        }
    }

    public void a() {
        if (this.f3772a == null) {
            this.f3772a = this.f3775d.k();
            if (this.f3772a != null) {
                addView(this.f3772a, new RelativeLayout.LayoutParams(-1, -1));
                this.f3772a.a();
            }
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        performClick();
        return true;
    }

    public ax c() {
        return this.f3773b;
    }

    public View d() {
        return this.f3772a;
    }

    public com.chartboost.sdk.Model.c e() {
        return this.f3775d;
    }

    public boolean f() {
        return this.f3772a != null && this.f3772a.getVisibility() == 0;
    }

    @Override // android.view.View
    public boolean performClick() {
        super.performClick();
        return true;
    }
}
