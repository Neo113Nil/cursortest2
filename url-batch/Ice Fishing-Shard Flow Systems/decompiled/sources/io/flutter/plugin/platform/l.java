package io.flutter.plugin.platform;

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
import h4.AbstractActivityC0488c;
import h4.C0486a;

/* loaded from: classes.dex */
public final class l extends FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public int f5706d;

    /* renamed from: e, reason: collision with root package name */
    public int f5707e;

    /* renamed from: i, reason: collision with root package name */
    public int f5708i;

    /* renamed from: l, reason: collision with root package name */
    public int f5709l;

    /* renamed from: m, reason: collision with root package name */
    public C0486a f5710m;

    /* renamed from: n, reason: collision with root package name */
    public j f5711n;

    /* renamed from: o, reason: collision with root package name */
    public k f5712o;

    public l(AbstractActivityC0488c abstractActivityC0488c) {
        super(abstractActivityC0488c);
        setWillNotDraw(false);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        j jVar = this.f5711n;
        if (jVar == null) {
            super.draw(canvas);
            Log.e("PlatformViewWrapper", "Platform view cannot be composed without a RenderTarget.");
            return;
        }
        Surface surface = jVar.getSurface();
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
            this.f5711n.scheduleFrame();
            surface.unlockCanvasAndPost(lockHardwareCanvas);
        }
    }

    public ViewTreeObserver.OnGlobalFocusChangeListener getActiveFocusListener() {
        return this.f5712o;
    }

    public int getRenderTargetHeight() {
        j jVar = this.f5711n;
        if (jVar != null) {
            return jVar.getHeight();
        }
        return 0;
    }

    public int getRenderTargetWidth() {
        j jVar = this.f5711n;
        if (jVar != null) {
            return jVar.getWidth();
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
        if (this.f5710m == null) {
            return super.onTouchEvent(motionEvent);
        }
        Matrix matrix = new Matrix();
        int action = motionEvent.getAction();
        if (action == 0) {
            int i2 = this.f5708i;
            this.f5706d = i2;
            int i5 = this.f5709l;
            this.f5707e = i5;
            matrix.postTranslate(i2, i5);
        } else if (action != 2) {
            matrix.postTranslate(this.f5708i, this.f5709l);
        } else {
            matrix.postTranslate(this.f5706d, this.f5707e);
            this.f5706d = this.f5708i;
            this.f5707e = this.f5709l;
        }
        this.f5710m.d(motionEvent, matrix);
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
        this.f5708i = layoutParams.leftMargin;
        this.f5709l = layoutParams.topMargin;
    }

    public void setOnDescendantFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        k kVar;
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive() && (kVar = this.f5712o) != null) {
            this.f5712o = null;
            viewTreeObserver.removeOnGlobalFocusChangeListener(kVar);
        }
        ViewTreeObserver viewTreeObserver2 = getViewTreeObserver();
        if (viewTreeObserver2.isAlive() && this.f5712o == null) {
            k kVar2 = new k(this, onFocusChangeListener);
            this.f5712o = kVar2;
            viewTreeObserver2.addOnGlobalFocusChangeListener(kVar2);
        }
    }

    public void setTouchProcessor(C0486a c0486a) {
        this.f5710m = c0486a;
    }
}
