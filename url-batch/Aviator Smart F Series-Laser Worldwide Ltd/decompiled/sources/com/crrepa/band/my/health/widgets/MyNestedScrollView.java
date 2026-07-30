package com.crrepa.band.my.health.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;

/* loaded from: classes2.dex */
public class MyNestedScrollView extends NestedScrollView {
    private boolean scroll;

    public MyNestedScrollView(@NonNull Context context) {
        super(context);
        this.scroll = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return super.dispatchTouchEvent(motionEvent);
    }

    public boolean isScroll() {
        return this.scroll;
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.orhanobut.logger.f.d("onAttachedToWindow");
        org.greenrobot.eventbus.c.getDefault().register(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.orhanobut.logger.f.d("onDetachedFromWindow");
        org.greenrobot.eventbus.c.getDefault().unregister(this);
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (isScroll()) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    @org.greenrobot.eventbus.l
    public void onNestedScrollChangeEvent(l0.h hVar) {
        com.orhanobut.logger.f.d("onNestedScrollChangeEvent: " + hVar.isScroll());
        setScroll(hVar.isScroll());
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (isScroll()) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public void setScroll(boolean z7) {
        this.scroll = z7;
    }

    public MyNestedScrollView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.scroll = true;
    }

    public MyNestedScrollView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.scroll = true;
    }
}
