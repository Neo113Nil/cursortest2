package d5;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
import io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack;
import java.util.Iterator;
import u5.h;

@TargetApi(19)
/* loaded from: classes.dex */
public class a extends FrameLayout {

    /* renamed from: f, reason: collision with root package name */
    private FlutterMutatorsStack f15748f;

    /* renamed from: g, reason: collision with root package name */
    private float f15749g;

    /* renamed from: h, reason: collision with root package name */
    private int f15750h;

    /* renamed from: i, reason: collision with root package name */
    private int f15751i;

    /* renamed from: j, reason: collision with root package name */
    private int f15752j;

    /* renamed from: k, reason: collision with root package name */
    private int f15753k;

    /* renamed from: l, reason: collision with root package name */
    private final io.flutter.embedding.android.a f15754l;

    /* renamed from: m, reason: collision with root package name */
    ViewTreeObserver.OnGlobalFocusChangeListener f15755m;

    /* renamed from: d5.a$a, reason: collision with other inner class name */
    class ViewTreeObserverOnGlobalFocusChangeListenerC0055a implements ViewTreeObserver.OnGlobalFocusChangeListener {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ View.OnFocusChangeListener f15756f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ View f15757g;

        ViewTreeObserverOnGlobalFocusChangeListenerC0055a(View.OnFocusChangeListener onFocusChangeListener, View view) {
            this.f15756f = onFocusChangeListener;
            this.f15757g = view;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
        public void onGlobalFocusChanged(View view, View view2) {
            View.OnFocusChangeListener onFocusChangeListener = this.f15756f;
            View view3 = this.f15757g;
            onFocusChangeListener.onFocusChange(view3, h.c(view3));
        }
    }

    public a(Context context, float f7, io.flutter.embedding.android.a aVar) {
        super(context, null);
        this.f15749g = f7;
        this.f15754l = aVar;
    }

    private Matrix getPlatformViewMatrix() {
        Matrix matrix = new Matrix(this.f15748f.getFinalMatrix());
        float f7 = this.f15749g;
        matrix.preScale(1.0f / f7, 1.0f / f7);
        matrix.postTranslate(-this.f15750h, -this.f15751i);
        return matrix;
    }

    public void a(FlutterMutatorsStack flutterMutatorsStack, int i7, int i8, int i9, int i10) {
        this.f15748f = flutterMutatorsStack;
        this.f15750h = i7;
        this.f15751i = i8;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i9, i10);
        layoutParams.leftMargin = i7;
        layoutParams.topMargin = i8;
        setLayoutParams(layoutParams);
        setWillNotDraw(false);
    }

    public void b() {
        ViewTreeObserver.OnGlobalFocusChangeListener onGlobalFocusChangeListener;
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (!viewTreeObserver.isAlive() || (onGlobalFocusChangeListener = this.f15755m) == null) {
            return;
        }
        this.f15755m = null;
        viewTreeObserver.removeOnGlobalFocusChangeListener(onGlobalFocusChangeListener);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.concat(getPlatformViewMatrix());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        canvas.save();
        Iterator<Path> it = this.f15748f.getFinalClippingPaths().iterator();
        while (it.hasNext()) {
            Path path = new Path(it.next());
            path.offset(-this.f15750h, -this.f15751i);
            canvas.clipPath(path);
        }
        super.draw(canvas);
        canvas.restore();
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
        if (this.f15754l == null) {
            return super.onTouchEvent(motionEvent);
        }
        Matrix matrix = new Matrix();
        int action = motionEvent.getAction();
        if (action == 0) {
            int i8 = this.f15750h;
            this.f15752j = i8;
            i7 = this.f15751i;
            this.f15753k = i7;
            f7 = i8;
        } else {
            if (action == 2) {
                matrix.postTranslate(this.f15752j, this.f15753k);
                this.f15752j = this.f15750h;
                this.f15753k = this.f15751i;
                return this.f15754l.g(motionEvent, matrix);
            }
            f7 = this.f15750h;
            i7 = this.f15751i;
        }
        matrix.postTranslate(f7, i7);
        return this.f15754l.g(motionEvent, matrix);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestSendAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getImportantForAccessibility() != 4) {
            return super.requestSendAccessibilityEvent(view, accessibilityEvent);
        }
        return false;
    }

    public void setOnDescendantFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        b();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive() && this.f15755m == null) {
            ViewTreeObserverOnGlobalFocusChangeListenerC0055a viewTreeObserverOnGlobalFocusChangeListenerC0055a = new ViewTreeObserverOnGlobalFocusChangeListenerC0055a(onFocusChangeListener, this);
            this.f15755m = viewTreeObserverOnGlobalFocusChangeListenerC0055a;
            viewTreeObserver.addOnGlobalFocusChangeListener(viewTreeObserverOnGlobalFocusChangeListenerC0055a);
        }
    }
}
