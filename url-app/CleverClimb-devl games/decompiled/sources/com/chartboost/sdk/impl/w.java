package com.chartboost.sdk.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.chartboost.sdk.Libraries.CBUtility;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public class w extends z {

    /* renamed from: b, reason: collision with root package name */
    private LinearLayout f3876b;

    /* renamed from: c, reason: collision with root package name */
    private ay f3877c;

    /* renamed from: d, reason: collision with root package name */
    private TextView f3878d;

    @Override // com.chartboost.sdk.impl.z
    protected int b() {
        return 48;
    }

    public w(Context context, v vVar) {
        super(context, vVar);
    }

    @Override // com.chartboost.sdk.impl.z
    protected View a() {
        Context context = getContext();
        int round = Math.round(getContext().getResources().getDisplayMetrics().density * 8.0f);
        this.f3876b = new LinearLayout(context);
        this.f3876b.setOrientation(0);
        this.f3876b.setGravity(17);
        int a2 = CBUtility.a(36, context);
        this.f3877c = new ay(context);
        this.f3877c.setPadding(round, round, round, round);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(a2, a2);
        this.f3877c.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.f3878d = new TextView(context);
        this.f3878d.setPadding(round / 2, round, round, round);
        this.f3878d.setTextColor(-15264491);
        this.f3878d.setTextSize(2, 16.0f);
        this.f3878d.setTypeface(null, 1);
        this.f3878d.setGravity(17);
        this.f3876b.addView(this.f3877c, layoutParams);
        this.f3876b.addView(this.f3878d, new LinearLayout.LayoutParams(-2, -1));
        return this.f3876b;
    }

    public void a(com.chartboost.sdk.Libraries.h hVar) {
        this.f3877c.a(hVar);
        this.f3877c.setScaleType(ImageView.ScaleType.FIT_CENTER);
    }

    public void a(String str) {
        this.f3878d.setText(str);
    }
}
