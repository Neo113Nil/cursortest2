package r0;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
import io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack;
import io.flutter.plugin.platform.i;
import java.util.Iterator;
import m0.C0261a;

/* renamed from: r0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0289a extends FrameLayout {

    /* renamed from: e, reason: collision with root package name */
    public FlutterMutatorsStack f3386e;

    /* renamed from: f, reason: collision with root package name */
    public final float f3387f;

    /* renamed from: g, reason: collision with root package name */
    public int f3388g;

    /* renamed from: h, reason: collision with root package name */
    public int f3389h;

    /* renamed from: i, reason: collision with root package name */
    public int f3390i;

    /* renamed from: j, reason: collision with root package name */
    public int f3391j;

    /* renamed from: k, reason: collision with root package name */
    public final C0261a f3392k;

    /* renamed from: l, reason: collision with root package name */
    public i f3393l;

    public C0289a(Activity activity, float f2, C0261a c0261a) {
        super(activity, null);
        this.f3387f = f2;
        this.f3392k = c0261a;
    }

    private Matrix getPlatformViewMatrix() {
        Matrix matrix = new Matrix(this.f3386e.getFinalMatrix());
        float f2 = this.f3387f;
        matrix.preScale(1.0f / f2, 1.0f / f2);
        matrix.postTranslate(-this.f3388g, -this.f3389h);
        return matrix;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.concat(getPlatformViewMatrix());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        canvas.save();
        Iterator<Path> it = this.f3386e.getFinalClippingPaths().iterator();
        while (it.hasNext()) {
            Path path = new Path(it.next());
            path.offset(-this.f3388g, -this.f3389h);
            canvas.clipPath(path);
        }
        super.draw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C0261a c0261a = this.f3392k;
        if (c0261a == null) {
            return super.onTouchEvent(motionEvent);
        }
        Matrix matrix = new Matrix();
        int action = motionEvent.getAction();
        if (action == 0) {
            int i2 = this.f3388g;
            this.f3390i = i2;
            int i3 = this.f3389h;
            this.f3391j = i3;
            matrix.postTranslate(i2, i3);
        } else if (action != 2) {
            matrix.postTranslate(this.f3388g, this.f3389h);
        } else {
            matrix.postTranslate(this.f3390i, this.f3391j);
            this.f3390i = this.f3388g;
            this.f3391j = this.f3389h;
        }
        c0261a.d(motionEvent, matrix);
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

    public void setOnDescendantFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        i iVar;
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive() && (iVar = this.f3393l) != null) {
            this.f3393l = null;
            viewTreeObserver.removeOnGlobalFocusChangeListener(iVar);
        }
        ViewTreeObserver viewTreeObserver2 = getViewTreeObserver();
        if (viewTreeObserver2.isAlive() && this.f3393l == null) {
            i iVar2 = new i(onFocusChangeListener, this);
            this.f3393l = iVar2;
            viewTreeObserver2.addOnGlobalFocusChangeListener(iVar2);
        }
    }
}
