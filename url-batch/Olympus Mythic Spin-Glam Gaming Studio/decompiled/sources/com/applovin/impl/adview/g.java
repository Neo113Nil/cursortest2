package com.applovin.impl.adview;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.applovin.impl.adview.e;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* loaded from: classes10.dex */
public class g extends FrameLayout {
    private e a;
    private int b;

    public g(e.a aVar, Activity activity) {
        super(activity);
        setBackgroundColor(0);
        e a = e.a(aVar, activity);
        this.a = a;
        addView(a);
    }

    public void a(e.a aVar) {
        if (aVar == null || aVar == this.a.getStyle()) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.a.getLayoutParams();
        removeView(this.a);
        e a = e.a(aVar, getContext());
        this.a = a;
        addView(a);
        this.a.setLayoutParams(layoutParams);
        this.a.a(this.b);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.a, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public void a(int i, int i2, int i3, int i4) {
        this.b = i;
        int i5 = i2 + i + i3;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = i5;
            layoutParams.width = i5;
        } else {
            setLayoutParams(new FrameLayout.LayoutParams(i5, i5));
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i, i, i4);
        layoutParams2.setMargins(i3, i3, i3, 0);
        this.a.setLayoutParams(layoutParams2);
        this.a.a(i);
    }
}
