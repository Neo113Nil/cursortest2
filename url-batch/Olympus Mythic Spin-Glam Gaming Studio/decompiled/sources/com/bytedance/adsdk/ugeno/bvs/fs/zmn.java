package com.bytedance.adsdk.ugeno.bvs.fs;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.bytedance.adsdk.ugeno.core.mw;
import com.bytedance.adsdk.ugeno.fb;
import java.util.Map;

/* loaded from: classes5.dex */
public class zmn extends FrameLayout {
    private Map<Integer, mw> fs;
    private fb zmn;

    public zmn(Context context) {
        super(context);
    }

    public void setEventMap(Map<Integer, mw> map) {
        this.fs = map;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        fb fbVar = this.zmn;
        if (fbVar != null) {
            int[] zmn = fbVar.zmn(i, i2);
            super.onMeasure(zmn[0], zmn[1]);
        } else {
            super.onMeasure(i, i2);
        }
        fb fbVar2 = this.zmn;
        if (fbVar2 != null) {
            fbVar2.btk();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        fb fbVar = this.zmn;
        if (fbVar != null) {
            fbVar.hhw();
        }
        super.onLayout(z, i, i2, i3, i4);
        fb fbVar2 = this.zmn;
        if (fbVar2 != null) {
            fbVar2.zmn(i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Map<Integer, mw> map = this.fs;
        if (map == null || !map.containsKey(4)) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return true;
    }

    public void zmn(fb fbVar) {
        this.zmn = fbVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        fb fbVar = this.zmn;
        if (fbVar != null) {
            fbVar.nps();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        fb fbVar = this.zmn;
        if (fbVar != null) {
            fbVar.zg();
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        fb fbVar = this.zmn;
        if (fbVar != null) {
            fbVar.fs(i, i2, i3, i4);
        }
    }
}
