package com.unity3d.player.a;

import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;
import com.unity3d.player.UnityPlayerForActivityOrService;

/* renamed from: com.unity3d.player.a.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0006f extends SurfaceView {
    public float a;
    public final UnityPlayerForActivityOrService b;

    public C0006f(UnityPlayerForActivityOrService unityPlayerForActivityOrService) {
        super(unityPlayerForActivityOrService.getContext());
        this.b = unityPlayerForActivityOrService;
    }

    @Override // android.view.SurfaceView, android.view.View
    public void onMeasure(int i, int i2) {
        if (this.a <= 0.0f) {
            super.onMeasure(i, i2);
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (size <= 0 || size2 <= 0 || View.MeasureSpec.getMode(i) != Integer.MIN_VALUE || View.MeasureSpec.getMode(i2) != Integer.MIN_VALUE) {
            super.onMeasure(i, i2);
            return;
        }
        float f = size;
        float f2 = size2;
        float f3 = f / f2;
        float f4 = this.a;
        if (f3 < f4) {
            size2 = (int) (f / f4);
        } else {
            size = (int) (f2 * f4);
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if (this.a > 0.0f) {
            return this.b.injectEvent(motionEvent);
        }
        return false;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.a > 0.0f) {
            return this.b.injectEvent(motionEvent);
        }
        return false;
    }

    @Override // android.view.View
    public final boolean onCapturedPointerEvent(MotionEvent motionEvent) {
        return this.b.injectEvent(motionEvent);
    }
}
