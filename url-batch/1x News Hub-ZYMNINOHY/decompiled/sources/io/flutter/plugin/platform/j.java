package io.flutter.plugin.platform;

import E1.C0025a;
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

/* loaded from: classes.dex */
public final class j extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public int f9256a;

    /* renamed from: b, reason: collision with root package name */
    public int f9257b;

    /* renamed from: c, reason: collision with root package name */
    public int f9258c;

    /* renamed from: d, reason: collision with root package name */
    public int f9259d;

    /* renamed from: e, reason: collision with root package name */
    public C0025a f9260e;
    public i f;

    /* renamed from: g, reason: collision with root package name */
    public K1.a f9261g;

    public j(Activity activity) {
        super(activity);
        setWillNotDraw(false);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        i iVar = this.f;
        if (iVar == null) {
            super.draw(canvas);
            Log.e("PlatformViewWrapper", "Platform view cannot be composed without a RenderTarget.");
            return;
        }
        Surface surface = iVar.getSurface();
        if (!surface.isValid()) {
            Log.e("PlatformViewWrapper", "Platform view cannot be composed without a valid RenderTarget surface.");
            return;
        }
        Canvas lockHardwareCanvas = surface.lockHardwareCanvas();
        if (lockHardwareCanvas == null) {
            invalidate();
            return;
        }
        try {
            lockHardwareCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
            super.draw(lockHardwareCanvas);
        } finally {
            this.f.scheduleFrame();
            surface.unlockCanvasAndPost(lockHardwareCanvas);
        }
    }

    public ViewTreeObserver.OnGlobalFocusChangeListener getActiveFocusListener() {
        return this.f9261g;
    }

    public int getRenderTargetHeight() {
        i iVar = this.f;
        if (iVar != null) {
            return iVar.getHeight();
        }
        return 0;
    }

    public int getRenderTargetWidth() {
        i iVar = this.f;
        if (iVar != null) {
            return iVar.getWidth();
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
        if (this.f9260e == null) {
            return super.onTouchEvent(motionEvent);
        }
        Matrix matrix = new Matrix();
        int action = motionEvent.getAction();
        if (action == 0) {
            int i3 = this.f9258c;
            this.f9256a = i3;
            int i4 = this.f9259d;
            this.f9257b = i4;
            matrix.postTranslate(i3, i4);
        } else if (action != 2) {
            matrix.postTranslate(this.f9258c, this.f9259d);
        } else {
            matrix.postTranslate(this.f9256a, this.f9257b);
            this.f9256a = this.f9258c;
            this.f9257b = this.f9259d;
        }
        this.f9260e.d(motionEvent, matrix);
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
        this.f9258c = layoutParams.leftMargin;
        this.f9259d = layoutParams.topMargin;
    }

    public void setOnDescendantFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        K1.a aVar;
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive() && (aVar = this.f9261g) != null) {
            this.f9261g = null;
            viewTreeObserver.removeOnGlobalFocusChangeListener(aVar);
        }
        ViewTreeObserver viewTreeObserver2 = getViewTreeObserver();
        if (viewTreeObserver2.isAlive() && this.f9261g == null) {
            K1.a aVar2 = new K1.a(this, onFocusChangeListener);
            this.f9261g = aVar2;
            viewTreeObserver2.addOnGlobalFocusChangeListener(aVar2);
        }
    }

    public void setTouchProcessor(C0025a c0025a) {
        this.f9260e = c0025a;
    }
}
