package com.applovin.impl.adview;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes.dex */
public class AppLovinTouchToClickListener implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    private long f2457a;

    /* renamed from: b, reason: collision with root package name */
    private float f2458b;

    /* renamed from: c, reason: collision with root package name */
    private float f2459c;

    /* renamed from: d, reason: collision with root package name */
    private final Context f2460d;
    private final View.OnClickListener e;

    public AppLovinTouchToClickListener(Context context, View.OnClickListener onClickListener) {
        this.f2460d = context;
        this.e = onClickListener;
    }

    private float a(float f) {
        return f / this.f2460d.getResources().getDisplayMetrics().density;
    }

    private float a(float f, float f2, float f3, float f4) {
        float f5 = f - f3;
        float f6 = f2 - f4;
        return a((float) Math.sqrt((f5 * f5) + (f6 * f6)));
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        switch (motionEvent.getAction()) {
            case 0:
                this.f2457a = System.currentTimeMillis();
                this.f2458b = motionEvent.getX();
                this.f2459c = motionEvent.getY();
                break;
            case 1:
                if (System.currentTimeMillis() - this.f2457a < 1000 && a(this.f2458b, this.f2459c, motionEvent.getX(), motionEvent.getY()) < 10.0f) {
                    this.e.onClick(view);
                    break;
                }
                break;
        }
        return true;
    }
}
