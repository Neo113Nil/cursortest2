package com.chartboost.sdk.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.v4.view.GravityCompat;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public class t extends z {

    /* renamed from: b, reason: collision with root package name */
    private LinearLayout f3860b;

    /* renamed from: c, reason: collision with root package name */
    private LinearLayout f3861c;

    /* renamed from: d, reason: collision with root package name */
    private ay f3862d;
    private az e;
    private TextView f;
    private TextView g;

    @Override // com.chartboost.sdk.impl.z
    protected int b() {
        return 72;
    }

    public t(Context context, v vVar) {
        super(context, vVar);
    }

    @Override // com.chartboost.sdk.impl.z
    protected View a() {
        Context context = getContext();
        int round = Math.round(getContext().getResources().getDisplayMetrics().density * 6.0f);
        this.f3860b = new LinearLayout(context);
        this.f3860b.setOrientation(0);
        this.f3860b.setGravity(17);
        this.f3861c = new LinearLayout(context);
        this.f3861c.setOrientation(1);
        this.f3861c.setGravity(8388627);
        this.f3862d = new ay(context);
        this.f3862d.setPadding(round, round, round, round);
        if (this.f3888a.J.c()) {
            this.f3862d.a(this.f3888a.J);
        }
        this.e = new az(context) { // from class: com.chartboost.sdk.impl.t.1
            @Override // com.chartboost.sdk.impl.az
            protected void a(MotionEvent motionEvent) {
                t.this.f3888a.e().b(motionEvent.getX(), motionEvent.getY(), super.getWidth(), super.getHeight());
            }
        };
        this.e.setPadding(round, round, round, round);
        if (this.f3888a.K.c()) {
            this.e.a(this.f3888a.K);
        }
        this.f = new TextView(getContext());
        this.f.setTextColor(-15264491);
        this.f.setTypeface(null, 1);
        this.f.setGravity(GravityCompat.START);
        this.f.setPadding(round, round, round, round / 2);
        this.g = new TextView(getContext());
        this.g.setTextColor(-15264491);
        this.g.setTypeface(null, 1);
        this.g.setGravity(GravityCompat.START);
        this.g.setPadding(round, 0, round, round);
        this.f.setTextSize(2, 14.0f);
        this.g.setTextSize(2, 11.0f);
        this.f3861c.addView(this.f);
        this.f3861c.addView(this.g);
        this.f3860b.addView(this.f3862d);
        this.f3860b.addView(this.f3861c, new LinearLayout.LayoutParams(0, -2, 1.0f));
        this.f3860b.addView(this.e);
        return this.f3860b;
    }

    public void a(String str, String str2) {
        this.f.setText(str);
        this.g.setText(str2);
    }
}
