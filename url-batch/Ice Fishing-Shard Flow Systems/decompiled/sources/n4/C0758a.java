package n4;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
import h4.AbstractActivityC0488c;
import h4.C0486a;
import io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack;
import io.flutter.plugin.platform.k;
import java.util.Iterator;

/* renamed from: n4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0758a extends FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public FlutterMutatorsStack f6979d;

    /* renamed from: e, reason: collision with root package name */
    public final float f6980e;

    /* renamed from: i, reason: collision with root package name */
    public int f6981i;

    /* renamed from: l, reason: collision with root package name */
    public int f6982l;

    /* renamed from: m, reason: collision with root package name */
    public final C0486a f6983m;

    /* renamed from: n, reason: collision with root package name */
    public final Paint f6984n;

    /* renamed from: o, reason: collision with root package name */
    public k f6985o;

    public C0758a(AbstractActivityC0488c abstractActivityC0488c, float f7, C0486a c0486a) {
        super(abstractActivityC0488c, null);
        this.f6980e = f7;
        this.f6983m = c0486a;
        this.f6984n = new Paint();
    }

    private Matrix getPlatformViewMatrix() {
        Matrix matrix = new Matrix(this.f6979d.getFinalMatrix());
        float f7 = this.f6980e;
        matrix.preScale(1.0f / f7, 1.0f / f7);
        matrix.postTranslate(-this.f6981i, -this.f6982l);
        return matrix;
    }

    public final void a() {
        k kVar;
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (!viewTreeObserver.isAlive() || (kVar = this.f6985o) == null) {
            return;
        }
        this.f6985o = null;
        viewTreeObserver.removeOnGlobalFocusChangeListener(kVar);
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
        Iterator<Path> it = this.f6979d.getFinalClippingPaths().iterator();
        while (it.hasNext()) {
            Path path = new Path(it.next());
            path.offset(-this.f6981i, -this.f6982l);
            canvas.clipPath(path);
        }
        int finalOpacity = (int) (this.f6979d.getFinalOpacity() * 255.0f);
        Paint paint = this.f6984n;
        if (paint.getAlpha() != finalOpacity) {
            paint.setAlpha((int) (this.f6979d.getFinalOpacity() * 255.0f));
            setLayerType(2, paint);
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
        C0486a c0486a = this.f6983m;
        if (c0486a == null) {
            return super.onTouchEvent(motionEvent);
        }
        Matrix matrix = new Matrix();
        matrix.postTranslate(getLeft(), getTop());
        c0486a.d(motionEvent, matrix);
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
        a();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive() && this.f6985o == null) {
            k kVar = new k(onFocusChangeListener, this);
            this.f6985o = kVar;
            viewTreeObserver.addOnGlobalFocusChangeListener(kVar);
        }
    }
}
