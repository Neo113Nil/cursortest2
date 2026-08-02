package io.flutter.plugin.platform;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.util.Log;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
import m0.C0261a;

/* loaded from: classes.dex */
public final class j extends FrameLayout {

    /* renamed from: e, reason: collision with root package name */
    public int f2637e;

    /* renamed from: f, reason: collision with root package name */
    public int f2638f;

    /* renamed from: g, reason: collision with root package name */
    public int f2639g;

    /* renamed from: h, reason: collision with root package name */
    public int f2640h;

    /* renamed from: i, reason: collision with root package name */
    public C0261a f2641i;

    /* renamed from: j, reason: collision with root package name */
    public h f2642j;

    /* renamed from: k, reason: collision with root package name */
    public i f2643k;

    public j(Activity activity) {
        super(activity);
        setWillNotDraw(false);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        Canvas lockHardwareCanvas;
        h hVar = this.f2642j;
        if (hVar == null) {
            super.draw(canvas);
            Log.e("PlatformViewWrapper", "Platform view cannot be composed without a RenderTarget.");
            return;
        }
        Surface surface = hVar.getSurface();
        if (!surface.isValid()) {
            Log.e("PlatformViewWrapper", "Platform view cannot be composed without a valid RenderTarget surface.");
            return;
        }
        lockHardwareCanvas = surface.lockHardwareCanvas();
        if (lockHardwareCanvas == null) {
            invalidate();
            return;
        }
        try {
            lockHardwareCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
            super.draw(lockHardwareCanvas);
        } finally {
            this.f2642j.scheduleFrame();
            surface.unlockCanvasAndPost(lockHardwareCanvas);
        }
    }

    public ViewTreeObserver.OnGlobalFocusChangeListener getActiveFocusListener() {
        return this.f2643k;
    }

    public int getRenderTargetHeight() {
        h hVar = this.f2642j;
        if (hVar != null) {
            return hVar.getHeight();
        }
        return 0;
    }

    public int getRenderTargetWidth() {
        h hVar = this.f2642j;
        if (hVar != null) {
            return hVar.getWidth();
        }
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        invalidate();
        return super.invalidateChildInParent(iArr, rect);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
        invalidate();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f2641i == null) {
            return super.onTouchEvent(motionEvent);
        }
        Matrix matrix = new Matrix();
        int action = motionEvent.getAction();
        if (action == 0) {
            int i2 = this.f2639g;
            this.f2637e = i2;
            int i3 = this.f2640h;
            this.f2638f = i3;
            matrix.postTranslate(i2, i3);
        } else if (action != 2) {
            matrix.postTranslate(this.f2639g, this.f2640h);
        } else {
            matrix.postTranslate(this.f2637e, this.f2638f);
            this.f2637e = this.f2639g;
            this.f2638f = this.f2640h;
        }
        this.f2641i.d(motionEvent, matrix);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestSendAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getImportantForAccessibility() != 4) {
            return super.requestSendAccessibilityEvent(view, accessibilityEvent);
        }
        return false;
    }

    public void setLayoutParams(FrameLayout.LayoutParams layoutParams) {
        setLayoutParams((ViewGroup.LayoutParams) layoutParams);
        this.f2639g = layoutParams.leftMargin;
        this.f2640h = layoutParams.topMargin;
    }

    public void setOnDescendantFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        i iVar;
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive() && (iVar = this.f2643k) != null) {
            this.f2643k = null;
            viewTreeObserver.removeOnGlobalFocusChangeListener(iVar);
        }
        ViewTreeObserver viewTreeObserver2 = getViewTreeObserver();
        if (viewTreeObserver2.isAlive() && this.f2643k == null) {
            i iVar2 = new i(this, onFocusChangeListener);
            this.f2643k = iVar2;
            viewTreeObserver2.addOnGlobalFocusChangeListener(iVar2);
        }
    }

    public void setTouchProcessor(C0261a c0261a) {
        this.f2641i = c0261a;
    }
}
