package com.anythink.basead.ui.component;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;

/* loaded from: classes.dex */
public class SplashBottomContainer extends LinearLayout {
    public SplashBottomContainer(Context context) {
        super(context);
    }

    private static void a() {
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    public SplashBottomContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SplashBottomContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
