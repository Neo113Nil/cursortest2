package com.bytedance.sdk.openadsdk.common;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes5.dex */
public class cn extends View {
    private View fs;
    private final zmn zmn;

    public interface zmn {
        View zmn(Context context);
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    protected void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.u, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
    }

    public cn(Context context, zmn zmnVar) {
        super(context);
        this.zmn = zmnVar;
        zmn();
    }

    private void zmn() {
        setVisibility(8);
        setWillNotDraw(true);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        View view = this.fs;
        if (view != null) {
            view.setVisibility(i);
            return;
        }
        super.setVisibility(i);
        if (i == 0 || i == 4) {
            fs();
        }
    }

    private View fs() {
        zmn zmnVar;
        if (this.fs == null && (zmnVar = this.zmn) != null) {
            this.fs = zmnVar.zmn(getContext());
            zmn(this.fs, (ViewGroup) getParent());
        }
        return this.fs;
    }

    private void zmn(View view, ViewGroup viewGroup) {
        int indexOfChild = viewGroup.indexOfChild(this);
        viewGroup.removeViewInLayout(this);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(view, indexOfChild, layoutParams);
        } else {
            viewGroup.addView(view, indexOfChild);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }
}
