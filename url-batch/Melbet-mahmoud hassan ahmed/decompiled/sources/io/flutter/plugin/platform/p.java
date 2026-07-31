package io.flutter.plugin.platform;

import android.annotation.TargetApi;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.hardware.display.VirtualDisplay;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.View;
import android.view.ViewTreeObserver;
import io.flutter.plugin.platform.SingleViewPresentation;
import io.flutter.view.d;

@TargetApi(20)
/* loaded from: classes.dex */
class p {

    /* renamed from: a, reason: collision with root package name */
    SingleViewPresentation f17413a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f17414b;

    /* renamed from: c, reason: collision with root package name */
    private final io.flutter.plugin.platform.a f17415c;

    /* renamed from: d, reason: collision with root package name */
    private final int f17416d;

    /* renamed from: e, reason: collision with root package name */
    private final d.c f17417e;

    /* renamed from: f, reason: collision with root package name */
    private final View.OnFocusChangeListener f17418f;

    /* renamed from: g, reason: collision with root package name */
    private final Surface f17419g;

    /* renamed from: h, reason: collision with root package name */
    private VirtualDisplay f17420h;

    /* renamed from: i, reason: collision with root package name */
    private int f17421i;

    /* renamed from: j, reason: collision with root package name */
    private int f17422j;

    class a implements View.OnAttachStateChangeListener {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ View f17423f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Runnable f17424g;

        /* renamed from: io.flutter.plugin.platform.p$a$a, reason: collision with other inner class name */
        class RunnableC0074a implements Runnable {
            RunnableC0074a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                a aVar = a.this;
                aVar.f17423f.postDelayed(aVar.f17424g, 128L);
            }
        }

        a(View view, Runnable runnable) {
            this.f17423f = view;
            this.f17424g = runnable;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            b.a(this.f17423f, new RunnableC0074a());
            this.f17423f.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    static class b implements ViewTreeObserver.OnDrawListener {

        /* renamed from: a, reason: collision with root package name */
        final View f17427a;

        /* renamed from: b, reason: collision with root package name */
        Runnable f17428b;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f17427a.getViewTreeObserver().removeOnDrawListener(b.this);
            }
        }

        b(View view, Runnable runnable) {
            this.f17427a = view;
            this.f17428b = runnable;
        }

        static void a(View view, Runnable runnable) {
            view.getViewTreeObserver().addOnDrawListener(new b(view, runnable));
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public void onDraw() {
            Runnable runnable = this.f17428b;
            if (runnable == null) {
                return;
            }
            runnable.run();
            this.f17428b = null;
            this.f17427a.post(new a());
        }
    }

    private p(Context context, io.flutter.plugin.platform.a aVar, VirtualDisplay virtualDisplay, d dVar, Surface surface, d.c cVar, View.OnFocusChangeListener onFocusChangeListener, int i7, Object obj) {
        this.f17414b = context;
        this.f17415c = aVar;
        this.f17417e = cVar;
        this.f17418f = onFocusChangeListener;
        this.f17419g = surface;
        this.f17420h = virtualDisplay;
        this.f17416d = context.getResources().getDisplayMetrics().densityDpi;
        SingleViewPresentation singleViewPresentation = new SingleViewPresentation(context, this.f17420h.getDisplay(), dVar, aVar, i7, obj, onFocusChangeListener);
        this.f17413a = singleViewPresentation;
        singleViewPresentation.show();
    }

    public static p a(Context context, io.flutter.plugin.platform.a aVar, d dVar, d.c cVar, int i7, int i8, int i9, Object obj, View.OnFocusChangeListener onFocusChangeListener) {
        context.getResources().getDisplayMetrics();
        if (i7 == 0 || i8 == 0) {
            return null;
        }
        cVar.d().setDefaultBufferSize(i7, i8);
        Surface surface = new Surface(cVar.d());
        VirtualDisplay createVirtualDisplay = ((DisplayManager) context.getSystemService("display")).createVirtualDisplay("flutter-vd", i7, i8, context.getResources().getDisplayMetrics().densityDpi, surface, 0);
        if (createVirtualDisplay == null) {
            return null;
        }
        p pVar = new p(context, aVar, createVirtualDisplay, dVar, surface, cVar, onFocusChangeListener, i9, obj);
        pVar.f17421i = i7;
        pVar.f17422j = i8;
        return pVar;
    }

    public void b(MotionEvent motionEvent) {
        SingleViewPresentation singleViewPresentation = this.f17413a;
        if (singleViewPresentation == null) {
            return;
        }
        singleViewPresentation.dispatchTouchEvent(motionEvent);
    }

    public int c() {
        return this.f17422j;
    }

    public int d() {
        return this.f17421i;
    }

    public View e() {
        SingleViewPresentation singleViewPresentation = this.f17413a;
        if (singleViewPresentation == null) {
            return null;
        }
        return singleViewPresentation.getView().getView();
    }

    void f(View view) {
        SingleViewPresentation singleViewPresentation = this.f17413a;
        if (singleViewPresentation == null || singleViewPresentation.getView() == null) {
            return;
        }
        this.f17413a.getView().f(view);
    }

    void g() {
        SingleViewPresentation singleViewPresentation = this.f17413a;
        if (singleViewPresentation == null || singleViewPresentation.getView() == null) {
            return;
        }
        this.f17413a.getView().h();
    }

    void h() {
        SingleViewPresentation singleViewPresentation = this.f17413a;
        if (singleViewPresentation == null || singleViewPresentation.getView() == null) {
            return;
        }
        this.f17413a.getView().e();
    }

    public void i(int i7, int i8, Runnable runnable) {
        boolean isFocused = e().isFocused();
        SingleViewPresentation.e detachState = this.f17413a.detachState();
        this.f17420h.setSurface(null);
        this.f17420h.release();
        this.f17421i = i7;
        this.f17422j = i8;
        this.f17417e.d().setDefaultBufferSize(i7, i8);
        this.f17420h = ((DisplayManager) this.f17414b.getSystemService("display")).createVirtualDisplay("flutter-vd", i7, i8, this.f17416d, this.f17419g, 0);
        View e7 = e();
        e7.addOnAttachStateChangeListener(new a(e7, runnable));
        SingleViewPresentation singleViewPresentation = new SingleViewPresentation(this.f17414b, this.f17420h.getDisplay(), this.f17415c, detachState, this.f17418f, isFocused);
        singleViewPresentation.show();
        this.f17413a.cancel();
        this.f17413a = singleViewPresentation;
    }
}
