package com.chartboost.sdk.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.MotionEvent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public class y extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    final v f3883a;

    /* renamed from: b, reason: collision with root package name */
    final az f3884b;

    /* renamed from: c, reason: collision with root package name */
    private LinearLayout f3885c;

    /* renamed from: d, reason: collision with root package name */
    private ay f3886d;
    private TextView e;
    private int f;

    public y(Context context, v vVar) {
        super(context);
        this.f = Integer.MIN_VALUE;
        this.f3883a = vVar;
        int round = Math.round(context.getResources().getDisplayMetrics().density * 8.0f);
        setOrientation(1);
        setGravity(17);
        this.f3885c = new LinearLayout(context);
        this.f3885c.setGravity(17);
        this.f3885c.setOrientation(0);
        this.f3885c.setPadding(round, round, round, round);
        this.f3886d = new ay(context);
        this.f3886d.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.f3886d.setPadding(0, 0, round, 0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        vVar.a(layoutParams, vVar.H, 1.0f);
        this.e = new TextView(getContext());
        this.e.setTextColor(-1);
        this.e.setTypeface(null, 1);
        this.e.setGravity(17);
        this.e.setTextSize(2, com.chartboost.sdk.e.a(context) ? 26.0f : 16.0f);
        this.f3885c.addView(this.f3886d, layoutParams);
        this.f3885c.addView(this.e, new LinearLayout.LayoutParams(-2, -2));
        this.f3884b = new az(getContext()) { // from class: com.chartboost.sdk.impl.y.1
            @Override // com.chartboost.sdk.impl.az
            protected void a(MotionEvent motionEvent) {
                y.this.f3884b.setEnabled(false);
                y.this.f3883a.e().g();
            }
        };
        this.f3884b.setContentDescription("CBWatch");
        this.f3884b.setPadding(0, 0, 0, round);
        this.f3884b.a(ImageView.ScaleType.FIT_CENTER);
        this.f3884b.setPadding(round, round, round, round);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        vVar.a(layoutParams2, vVar.G, 1.0f);
        this.f3886d.a(vVar.H);
        this.f3884b.a(vVar.G);
        addView(this.f3885c, new LinearLayout.LayoutParams(-2, -2));
        addView(this.f3884b, layoutParams2);
        a();
    }

    public void a(boolean z) {
        setBackgroundColor(z ? -16777216 : this.f);
    }

    public void a(String str, int i) {
        this.e.setText(str);
        this.f = i;
        a(this.f3883a.s());
    }

    public void a() {
        a(this.f3883a.s());
    }
}
