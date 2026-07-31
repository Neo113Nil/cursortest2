package io.flutter.plugin.platform;

import android.annotation.TargetApi;
import android.app.AlertDialog;
import android.app.Presentation;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.MutableContextWrapper;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import androidx.annotation.Keep;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

@Keep
@TargetApi(17)
/* loaded from: classes.dex */
class SingleViewPresentation extends Presentation {
    private final io.flutter.plugin.platform.a accessibilityEventsDelegate;
    private FrameLayout container;
    private Object createParams;
    private final View.OnFocusChangeListener focusChangeListener;
    private final Context outerContext;
    private a rootView;
    private boolean startFocused;
    private final e state;
    private int viewId;

    private static class a extends FrameLayout {

        /* renamed from: f, reason: collision with root package name */
        private final io.flutter.plugin.platform.a f17334f;

        /* renamed from: g, reason: collision with root package name */
        private final View f17335g;

        public a(Context context, io.flutter.plugin.platform.a aVar, View view) {
            super(context);
            this.f17334f = aVar;
            this.f17335g = view;
        }

        @Override // android.view.ViewGroup, android.view.ViewParent
        public boolean requestSendAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f17334f.a(this.f17335g, view, accessibilityEvent);
        }
    }

    static class b extends ViewGroup {

        /* renamed from: f, reason: collision with root package name */
        private final Rect f17336f;

        /* renamed from: g, reason: collision with root package name */
        private final Rect f17337g;

        public b(Context context) {
            super(context);
            this.f17336f = new Rect();
            this.f17337g = new Rect();
        }

        private static int a(int i7) {
            return View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), Integer.MIN_VALUE);
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
            for (int i11 = 0; i11 < getChildCount(); i11++) {
                View childAt = getChildAt(i11);
                WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) childAt.getLayoutParams();
                this.f17336f.set(i7, i8, i9, i10);
                Gravity.apply(layoutParams.gravity, childAt.getMeasuredWidth(), childAt.getMeasuredHeight(), this.f17336f, layoutParams.x, layoutParams.y, this.f17337g);
                Rect rect = this.f17337g;
                childAt.layout(rect.left, rect.top, rect.right, rect.bottom);
            }
        }

        @Override // android.view.View
        protected void onMeasure(int i7, int i8) {
            for (int i9 = 0; i9 < getChildCount(); i9++) {
                getChildAt(i9).measure(a(i7), a(i8));
            }
            super.onMeasure(i7, i8);
        }
    }

    private static class c extends ContextWrapper {

        /* renamed from: a, reason: collision with root package name */
        private final InputMethodManager f17338a;

        c(Context context) {
            this(context, null);
        }

        private c(Context context, InputMethodManager inputMethodManager) {
            super(context);
            this.f17338a = inputMethodManager == null ? (InputMethodManager) context.getSystemService("input_method") : inputMethodManager;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public Context createDisplayContext(Display display) {
            return new c(super.createDisplayContext(display), this.f17338a);
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public Object getSystemService(String str) {
            return "input_method".equals(str) ? this.f17338a : super.getSystemService(str);
        }
    }

    private static class d extends ContextWrapper {

        /* renamed from: a, reason: collision with root package name */
        private final f f17339a;

        /* renamed from: b, reason: collision with root package name */
        private WindowManager f17340b;

        /* renamed from: c, reason: collision with root package name */
        private final Context f17341c;

        d(Context context, f fVar, Context context2) {
            super(context);
            this.f17339a = fVar;
            this.f17341c = context2;
        }

        private WindowManager a() {
            if (this.f17340b == null) {
                this.f17340b = this.f17339a.b();
            }
            return this.f17340b;
        }

        private boolean b() {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            for (int i7 = 0; i7 < stackTrace.length && i7 < 11; i7++) {
                if (stackTrace[i7].getClassName().equals(AlertDialog.class.getCanonicalName()) && stackTrace[i7].getMethodName().equals("<init>")) {
                    return true;
                }
            }
            return false;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public Object getSystemService(String str) {
            return "window".equals(str) ? b() ? this.f17341c.getSystemService(str) : a() : super.getSystemService(str);
        }
    }

    static class e {

        /* renamed from: a, reason: collision with root package name */
        private io.flutter.plugin.platform.d f17342a;

        /* renamed from: b, reason: collision with root package name */
        private f f17343b;

        /* renamed from: c, reason: collision with root package name */
        private b f17344c;

        e() {
        }
    }

    static class f implements InvocationHandler {

        /* renamed from: a, reason: collision with root package name */
        private final WindowManager f17345a;

        /* renamed from: b, reason: collision with root package name */
        b f17346b;

        f(WindowManager windowManager, b bVar) {
            this.f17345a = windowManager;
            this.f17346b = bVar;
        }

        private void a(Object[] objArr) {
            b bVar = this.f17346b;
            if (bVar == null) {
                z4.b.f("PlatformViewsController", "Embedded view called addView while detached from presentation");
            } else {
                bVar.addView((View) objArr[0], (WindowManager.LayoutParams) objArr[1]);
            }
        }

        private void c(Object[] objArr) {
            b bVar = this.f17346b;
            if (bVar == null) {
                z4.b.f("PlatformViewsController", "Embedded view called removeView while detached from presentation");
            } else {
                bVar.removeView((View) objArr[0]);
            }
        }

        private void d(Object[] objArr) {
            if (this.f17346b == null) {
                z4.b.f("PlatformViewsController", "Embedded view called removeViewImmediate while detached from presentation");
                return;
            }
            View view = (View) objArr[0];
            view.clearAnimation();
            this.f17346b.removeView(view);
        }

        private void e(Object[] objArr) {
            b bVar = this.f17346b;
            if (bVar == null) {
                z4.b.f("PlatformViewsController", "Embedded view called updateViewLayout while detached from presentation");
            } else {
                bVar.updateViewLayout((View) objArr[0], (WindowManager.LayoutParams) objArr[1]);
            }
        }

        public WindowManager b() {
            return (WindowManager) Proxy.newProxyInstance(WindowManager.class.getClassLoader(), new Class[]{WindowManager.class}, this);
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            String name = method.getName();
            name.hashCode();
            switch (name) {
                case "addView":
                    a(objArr);
                    return null;
                case "removeViewImmediate":
                    d(objArr);
                    return null;
                case "updateViewLayout":
                    e(objArr);
                    return null;
                case "removeView":
                    c(objArr);
                    return null;
                default:
                    try {
                        return method.invoke(this.f17345a, objArr);
                    } catch (InvocationTargetException e7) {
                        throw e7.getCause();
                    }
            }
        }
    }

    public SingleViewPresentation(Context context, Display display, io.flutter.plugin.platform.a aVar, e eVar, View.OnFocusChangeListener onFocusChangeListener, boolean z6) {
        super(new c(context), display);
        this.startFocused = false;
        this.accessibilityEventsDelegate = aVar;
        this.state = eVar;
        this.focusChangeListener = onFocusChangeListener;
        this.outerContext = context;
        getWindow().setFlags(8, 8);
        this.startFocused = z6;
    }

    public SingleViewPresentation(Context context, Display display, io.flutter.plugin.platform.d dVar, io.flutter.plugin.platform.a aVar, int i7, Object obj, View.OnFocusChangeListener onFocusChangeListener) {
        super(new c(context), display);
        this.startFocused = false;
        this.accessibilityEventsDelegate = aVar;
        this.viewId = i7;
        this.createParams = obj;
        this.focusChangeListener = onFocusChangeListener;
        this.outerContext = context;
        e eVar = new e();
        this.state = eVar;
        eVar.f17342a = dVar;
        getWindow().setFlags(8, 8);
        if (Build.VERSION.SDK_INT >= 19) {
            getWindow().setType(2030);
        }
    }

    public e detachState() {
        this.container.removeAllViews();
        this.rootView.removeAllViews();
        return this.state;
    }

    public io.flutter.plugin.platform.d getView() {
        if (this.state.f17342a == null) {
            return null;
        }
        return this.state.f17342a;
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        if (this.state.f17344c == null) {
            this.state.f17344c = new b(getContext());
        }
        if (this.state.f17343b == null) {
            WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
            e eVar = this.state;
            eVar.f17343b = new f(windowManager, eVar.f17344c);
        }
        this.container = new FrameLayout(getContext());
        d dVar = new d(getContext(), this.state.f17343b, this.outerContext);
        View view = this.state.f17342a.getView();
        if (!(view.getContext() instanceof MutableContextWrapper)) {
            throw new IllegalStateException("Unexpected platform view context. When constructing a platform view in the factory, use the context from PlatformViewFactory#create, view id: " + this.viewId);
        }
        ((MutableContextWrapper) view.getContext()).setBaseContext(dVar);
        this.container.addView(view);
        a aVar = new a(getContext(), this.accessibilityEventsDelegate, view);
        this.rootView = aVar;
        aVar.addView(this.container);
        this.rootView.addView(this.state.f17344c);
        view.setOnFocusChangeListener(this.focusChangeListener);
        this.rootView.setFocusableInTouchMode(true);
        if (this.startFocused) {
            view.requestFocus();
        } else {
            this.rootView.requestFocus();
        }
        setContentView(this.rootView);
    }
}
