package io.flutter.plugin.platform;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
import io.flutter.view.d;
import java.util.concurrent.atomic.AtomicLong;

@TargetApi(23)
/* loaded from: classes.dex */
class h extends FrameLayout {

    /* renamed from: f, reason: collision with root package name */
    private int f17361f;

    /* renamed from: g, reason: collision with root package name */
    private int f17362g;

    /* renamed from: h, reason: collision with root package name */
    private int f17363h;

    /* renamed from: i, reason: collision with root package name */
    private int f17364i;

    /* renamed from: j, reason: collision with root package name */
    private int f17365j;

    /* renamed from: k, reason: collision with root package name */
    private int f17366k;

    /* renamed from: l, reason: collision with root package name */
    private SurfaceTexture f17367l;

    /* renamed from: m, reason: collision with root package name */
    private Surface f17368m;

    /* renamed from: n, reason: collision with root package name */
    private io.flutter.embedding.android.a f17369n;

    /* renamed from: o, reason: collision with root package name */
    ViewTreeObserver.OnGlobalFocusChangeListener f17370o;

    /* renamed from: p, reason: collision with root package name */
    private final AtomicLong f17371p;

    /* renamed from: q, reason: collision with root package name */
    private final d.a f17372q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f17373r;

    /* renamed from: s, reason: collision with root package name */
    private final d.b f17374s;

    class a implements d.a {
        a() {
        }

        @Override // io.flutter.view.d.a
        public void a() {
            if (Build.VERSION.SDK_INT == 29) {
                h.this.f17371p.decrementAndGet();
            }
        }
    }

    class b implements d.b {
        b() {
        }

        @Override // io.flutter.view.d.b
        public void onTrimMemory(int i7) {
            if (i7 != 80 || Build.VERSION.SDK_INT < 29) {
                return;
            }
            h.this.f17373r = true;
        }
    }

    class c implements ViewTreeObserver.OnGlobalFocusChangeListener {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ View.OnFocusChangeListener f17377f;

        c(View.OnFocusChangeListener onFocusChangeListener) {
            this.f17377f = onFocusChangeListener;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
        public void onGlobalFocusChanged(View view, View view2) {
            View.OnFocusChangeListener onFocusChangeListener = this.f17377f;
            h hVar = h.this;
            onFocusChangeListener.onFocusChange(hVar, u5.h.c(hVar));
        }
    }

    public h(Context context) {
        super(context);
        this.f17371p = new AtomicLong(0L);
        this.f17372q = new a();
        this.f17373r = false;
        this.f17374s = new b();
        setWillNotDraw(false);
    }

    public h(Context context, d.c cVar) {
        this(context);
        cVar.c(this.f17372q);
        cVar.b(this.f17374s);
        l(cVar.d());
    }

    private void f() {
        if (Build.VERSION.SDK_INT == 29) {
            this.f17371p.incrementAndGet();
        }
    }

    private void g() {
        if (this.f17373r) {
            Surface surface = this.f17368m;
            if (surface != null) {
                surface.release();
            }
            this.f17368m = c(this.f17367l);
            this.f17373r = false;
        }
    }

    private boolean n() {
        return Build.VERSION.SDK_INT != 29 || this.f17371p.get() <= 0;
    }

    protected Surface c(SurfaceTexture surfaceTexture) {
        return new Surface(surfaceTexture);
    }

    public int d() {
        return this.f17366k;
    }

    @Override // android.view.View
    @SuppressLint({"NewApi"})
    public void draw(Canvas canvas) {
        String str;
        Surface surface = this.f17368m;
        if (surface == null) {
            super.draw(canvas);
            str = "Platform view cannot be composed without a surface.";
        } else if (surface.isValid()) {
            SurfaceTexture surfaceTexture = this.f17367l;
            if (surfaceTexture != null && !surfaceTexture.isReleased()) {
                if (!n()) {
                    invalidate();
                    return;
                }
                g();
                Canvas lockHardwareCanvas = this.f17368m.lockHardwareCanvas();
                try {
                    lockHardwareCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
                    super.draw(lockHardwareCanvas);
                    f();
                    return;
                } finally {
                    this.f17368m.unlockCanvasAndPost(lockHardwareCanvas);
                }
            }
            str = "Invalid texture. The platform view cannot be displayed.";
        } else {
            str = "Invalid surface. The platform view cannot be displayed.";
        }
        z4.b.b("PlatformViewWrapper", str);
    }

    public int e() {
        return this.f17365j;
    }

    public void h() {
        this.f17367l = null;
        Surface surface = this.f17368m;
        if (surface != null) {
            surface.release();
            this.f17368m = null;
        }
    }

    public void i(int i7, int i8) {
        this.f17365j = i7;
        this.f17366k = i8;
        SurfaceTexture surfaceTexture = this.f17367l;
        if (surfaceTexture != null) {
            surfaceTexture.setDefaultBufferSize(i7, i8);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        invalidate();
        return super.invalidateChildInParent(iArr, rect);
    }

    public void j(FrameLayout.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        this.f17363h = layoutParams.leftMargin;
        this.f17364i = layoutParams.topMargin;
    }

    public void k(View.OnFocusChangeListener onFocusChangeListener) {
        o();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive() && this.f17370o == null) {
            c cVar = new c(onFocusChangeListener);
            this.f17370o = cVar;
            viewTreeObserver.addOnGlobalFocusChangeListener(cVar);
        }
    }

    @SuppressLint({"NewApi"})
    public void l(SurfaceTexture surfaceTexture) {
        int i7;
        if (Build.VERSION.SDK_INT < 23) {
            z4.b.b("PlatformViewWrapper", "Platform views cannot be displayed below API level 23. You can prevent this issue by setting `minSdkVersion: 23` in build.gradle.");
            return;
        }
        this.f17367l = surfaceTexture;
        int i8 = this.f17365j;
        if (i8 > 0 && (i7 = this.f17366k) > 0) {
            surfaceTexture.setDefaultBufferSize(i8, i7);
        }
        Surface surface = this.f17368m;
        if (surface != null) {
            surface.release();
        }
        Surface c7 = c(surfaceTexture);
        this.f17368m = c7;
        Canvas lockHardwareCanvas = c7.lockHardwareCanvas();
        try {
            lockHardwareCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
            f();
        } finally {
            this.f17368m.unlockCanvasAndPost(lockHardwareCanvas);
        }
    }

    public void m(io.flutter.embedding.android.a aVar) {
        this.f17369n = aVar;
    }

    public void o() {
        ViewTreeObserver.OnGlobalFocusChangeListener onGlobalFocusChangeListener;
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (!viewTreeObserver.isAlive() || (onGlobalFocusChangeListener = this.f17370o) == null) {
            return;
        }
        this.f17370o = null;
        viewTreeObserver.removeOnGlobalFocusChangeListener(onGlobalFocusChangeListener);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    @SuppressLint({"NewApi"})
    public void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
        invalidate();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i7;
        float f7;
        if (this.f17369n == null) {
            return super.onTouchEvent(motionEvent);
        }
        Matrix matrix = new Matrix();
        int action = motionEvent.getAction();
        if (action == 0) {
            int i8 = this.f17363h;
            this.f17361f = i8;
            i7 = this.f17364i;
            this.f17362g = i7;
            f7 = i8;
        } else {
            if (action == 2) {
                matrix.postTranslate(this.f17361f, this.f17362g);
                this.f17361f = this.f17363h;
                this.f17362g = this.f17364i;
                return this.f17369n.g(motionEvent, matrix);
            }
            f7 = this.f17363h;
            i7 = this.f17364i;
        }
        matrix.postTranslate(f7, i7);
        return this.f17369n.g(motionEvent, matrix);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestSendAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getImportantForAccessibility() != 4) {
            return super.requestSendAccessibilityEvent(view, accessibilityEvent);
        }
        return false;
    }
}
