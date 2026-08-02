package K1;

import E1.C0025a;
import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
import io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class b extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public FlutterMutatorsStack f869a;

    /* renamed from: b, reason: collision with root package name */
    public final float f870b;

    /* renamed from: c, reason: collision with root package name */
    public int f871c;

    /* renamed from: d, reason: collision with root package name */
    public int f872d;

    /* renamed from: e, reason: collision with root package name */
    public final C0025a f873e;
    public final Paint f;

    /* renamed from: g, reason: collision with root package name */
    public a f874g;

    public b(Activity activity, float f, C0025a c0025a) {
        super(activity, null);
        this.f870b = f;
        this.f873e = c0025a;
        this.f = new Paint();
    }

    private Matrix getPlatformViewMatrix() {
        Matrix matrix = new Matrix(this.f869a.getFinalMatrix());
        float f = this.f870b;
        matrix.preScale(1.0f / f, 1.0f / f);
        matrix.postTranslate(-this.f871c, -this.f872d);
        return matrix;
    }

    public final void a() {
        a aVar;
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (!viewTreeObserver.isAlive() || (aVar = this.f874g) == null) {
            return;
        }
        this.f874g = null;
        viewTreeObserver.removeOnGlobalFocusChangeListener(aVar);
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
        Iterator<Path> it = this.f869a.getFinalClippingPaths().iterator();
        while (it.hasNext()) {
            Path path = new Path(it.next());
            path.offset(-this.f871c, -this.f872d);
            canvas.clipPath(path);
        }
        int finalOpacity = (int) (this.f869a.getFinalOpacity() * 255.0f);
        Paint paint = this.f;
        if (paint.getAlpha() != finalOpacity) {
            paint.setAlpha((int) (this.f869a.getFinalOpacity() * 255.0f));
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
        C0025a c0025a = this.f873e;
        if (c0025a == null) {
            return super.onTouchEvent(motionEvent);
        }
        Matrix matrix = new Matrix();
        matrix.postTranslate(getLeft(), getTop());
        c0025a.d(motionEvent, matrix);
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
        if (viewTreeObserver.isAlive() && this.f874g == null) {
            a aVar = new a(onFocusChangeListener, this);
            this.f874g = aVar;
            viewTreeObserver.addOnGlobalFocusChangeListener(aVar);
        }
    }
}
