package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.PowerManager;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

@TargetApi(14)
/* loaded from: classes.dex */
public final class ao implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Application.ActivityLifecycleCallbacks {

    /* renamed from: u, reason: collision with root package name */
    private static final long f2880u = ((Long) sw.c().b(m10.X0)).longValue();

    /* renamed from: f, reason: collision with root package name */
    private final Context f2881f;

    /* renamed from: g, reason: collision with root package name */
    private Application f2882g;

    /* renamed from: h, reason: collision with root package name */
    private final WindowManager f2883h;

    /* renamed from: i, reason: collision with root package name */
    private final PowerManager f2884i;

    /* renamed from: j, reason: collision with root package name */
    private final KeyguardManager f2885j;

    /* renamed from: k, reason: collision with root package name */
    BroadcastReceiver f2886k;

    /* renamed from: l, reason: collision with root package name */
    private WeakReference<ViewTreeObserver> f2887l;

    /* renamed from: m, reason: collision with root package name */
    final WeakReference<View> f2888m;

    /* renamed from: n, reason: collision with root package name */
    private mo f2889n;

    /* renamed from: o, reason: collision with root package name */
    private final a3.g1 f2890o = new a3.g1(f2880u);

    /* renamed from: p, reason: collision with root package name */
    private boolean f2891p = false;

    /* renamed from: q, reason: collision with root package name */
    private int f2892q = -1;

    /* renamed from: r, reason: collision with root package name */
    private final HashSet<zn> f2893r = new HashSet<>();

    /* renamed from: s, reason: collision with root package name */
    private final DisplayMetrics f2894s;

    /* renamed from: t, reason: collision with root package name */
    private final Rect f2895t;

    public ao(Context context, View view) {
        Context applicationContext = context.getApplicationContext();
        this.f2881f = applicationContext;
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        this.f2883h = windowManager;
        this.f2884i = (PowerManager) applicationContext.getSystemService("power");
        this.f2885j = (KeyguardManager) context.getSystemService("keyguard");
        if (applicationContext instanceof Application) {
            Application application = (Application) applicationContext;
            this.f2882g = application;
            this.f2889n = new mo(application, this);
        }
        this.f2894s = context.getResources().getDisplayMetrics();
        Rect rect = new Rect();
        this.f2895t = rect;
        rect.right = windowManager.getDefaultDisplay().getWidth();
        rect.bottom = windowManager.getDefaultDisplay().getHeight();
        WeakReference<View> weakReference = this.f2888m;
        View view2 = weakReference != null ? weakReference.get() : null;
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(this);
            m(view2);
        }
        this.f2888m = new WeakReference<>(view);
        if (view != null) {
            if (y2.t.r().i(view)) {
                l(view);
            }
            view.addOnAttachStateChangeListener(this);
        }
    }

    private final int h(int i7) {
        return (int) (i7 / this.f2894s.density);
    }

    private final void i(Activity activity, int i7) {
        Window window;
        if (this.f2888m == null || (window = activity.getWindow()) == null) {
            return;
        }
        View peekDecorView = window.peekDecorView();
        View view = this.f2888m.get();
        if (view == null || peekDecorView == null || view.getRootView() != peekDecorView.getRootView()) {
            return;
        }
        this.f2892q = i7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x0126, code lost:
    
        if (r11 == 0) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0110, code lost:
    
        if (r11 == 0) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0128, code lost:
    
        r3 = 1;
        r11 = 0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0200 A[LOOP:1: B:86:0x01fa->B:88:0x0200, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0113  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(int i7) {
        WeakReference<View> weakReference;
        View view;
        boolean z6;
        boolean z7;
        List emptyList;
        int i8;
        long a7;
        boolean z8;
        Iterator<zn> it;
        if (this.f2893r.size() == 0 || (weakReference = this.f2888m) == null) {
            return;
        }
        View view2 = weakReference.get();
        Rect rect = new Rect();
        Rect rect2 = new Rect();
        Rect rect3 = new Rect();
        Rect rect4 = new Rect();
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        if (view2 != null) {
            z6 = view2.getGlobalVisibleRect(rect2);
            z7 = view2.getLocalVisibleRect(rect3);
            view2.getHitRect(rect4);
            try {
                view2.getLocationOnScreen(iArr);
                view2.getLocationInWindow(iArr2);
            } catch (Exception e7) {
                io0.e("Failure getting view location.", e7);
            }
            int i9 = iArr[0];
            rect.left = i9;
            rect.top = iArr[1];
            rect.right = i9 + view2.getWidth();
            rect.bottom = rect.top + view2.getHeight();
            view = view2;
        } else {
            view = null;
            z6 = false;
            z7 = false;
        }
        if (((Boolean) sw.c().b(m10.f8154a1)).booleanValue() && view != null) {
            try {
                emptyList = new ArrayList();
                ViewParent parent = view.getParent();
                while (parent instanceof View) {
                    View view3 = (View) parent;
                    Rect rect5 = new Rect();
                    if (view3.isScrollContainer() && view3.getGlobalVisibleRect(rect5)) {
                        emptyList.add(a(rect5));
                    }
                    parent = parent.getParent();
                }
            } catch (Exception e8) {
                y2.t.p().s(e8, "PositionWatcher.getParentScrollViewRects");
            }
            List list = emptyList;
            int windowVisibility = view == null ? view.getWindowVisibility() : 8;
            i8 = this.f2892q;
            if (i8 != -1) {
                windowVisibility = i8;
            }
            y2.t.q();
            a7 = a3.g2.a(view);
            if (((Boolean) sw.c().b(m10.b7)).booleanValue()) {
                if (view2 != null) {
                    y2.t.q();
                    if (a3.g2.x(view, this.f2884i, this.f2885j)) {
                        if (z6) {
                            if (z7) {
                            }
                        }
                    }
                }
                z8 = 0;
            } else {
                if (view2 != null) {
                    y2.t.q();
                    if (a3.g2.x(view, this.f2884i, this.f2885j) && z6 && z7) {
                        if (a7 >= ((Integer) sw.c().b(m10.e7)).intValue()) {
                        }
                    }
                }
                z8 = 0;
            }
            if (((Boolean) sw.c().b(m10.g7)).booleanValue()) {
                y2.t.q();
                int i10 = (windowVisibility == 0 ? 128 : 0) | (true != a3.g2.x(view, this.f2884i, this.f2885j) ? 0 : 64) | (true != z6 ? 0 : 8) | (true != z7 ? 0 : 16);
                int i11 = a7 >= ((long) ((Integer) sw.c().b(m10.e7)).intValue()) ? 32 : 0;
                y2.t.q();
                a3.g2.n(view, i10 | i11 | z8, null);
            }
            if (i7 == 1 || this.f2890o.b() || z8 != this.f2891p) {
                if (z8 == 0 || this.f2891p || i7 != 1) {
                    xn xnVar = new xn(y2.t.a().a(), this.f2884i.isScreenOn(), view == null && y2.t.r().i(view), view == null ? view.getWindowVisibility() : 8, a(this.f2895t), a(rect), a(rect2), z6, a(rect3), z7, a7, a(rect4), this.f2894s.density, z8, list);
                    it = this.f2893r.iterator();
                    while (it.hasNext()) {
                        it.next().o0(xnVar);
                    }
                    this.f2891p = z8;
                }
                return;
            }
            return;
        }
        emptyList = Collections.emptyList();
        List list2 = emptyList;
        if (view == null) {
        }
        i8 = this.f2892q;
        if (i8 != -1) {
        }
        y2.t.q();
        a7 = a3.g2.a(view);
        if (((Boolean) sw.c().b(m10.b7)).booleanValue()) {
        }
        if (((Boolean) sw.c().b(m10.g7)).booleanValue()) {
        }
        if (i7 == 1) {
        }
        if (z8 == 0) {
        }
        xn xnVar2 = new xn(y2.t.a().a(), this.f2884i.isScreenOn(), view == null && y2.t.r().i(view), view == null ? view.getWindowVisibility() : 8, a(this.f2895t), a(rect), a(rect2), z6, a(rect3), z7, a7, a(rect4), this.f2894s.density, z8, list2);
        it = this.f2893r.iterator();
        while (it.hasNext()) {
        }
        this.f2891p = z8;
    }

    private final void k() {
        a3.g2.f72i.post(new Runnable() { // from class: com.google.android.gms.internal.ads.vn
            @Override // java.lang.Runnable
            public final void run() {
                ao.this.d();
            }
        });
    }

    private final void l(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.f2887l = new WeakReference<>(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.f2886k == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            this.f2886k = new wn(this);
            y2.t.w().c(this.f2881f, this.f2886k, intentFilter);
        }
        Application application = this.f2882g;
        if (application != null) {
            try {
                application.registerActivityLifecycleCallbacks(this.f2889n);
            } catch (Exception e7) {
                io0.e("Error registering activity lifecycle callbacks.", e7);
            }
        }
    }

    private final void m(View view) {
        try {
            WeakReference<ViewTreeObserver> weakReference = this.f2887l;
            if (weakReference != null) {
                ViewTreeObserver viewTreeObserver = weakReference.get();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this);
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
                this.f2887l = null;
            }
        } catch (Exception e7) {
            io0.e("Error while unregistering listeners from the last ViewTreeObserver.", e7);
        }
        try {
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnScrollChangedListener(this);
                viewTreeObserver2.removeGlobalOnLayoutListener(this);
            }
        } catch (Exception e8) {
            io0.e("Error while unregistering listeners from the ViewTreeObserver.", e8);
        }
        if (this.f2886k != null) {
            try {
                y2.t.w().d(this.f2881f, this.f2886k);
            } catch (IllegalStateException e9) {
                io0.e("Failed trying to unregister the receiver", e9);
            } catch (Exception e10) {
                y2.t.p().s(e10, "ActiveViewUnit.stopScreenStatusMonitoring");
            }
            this.f2886k = null;
        }
        Application application = this.f2882g;
        if (application != null) {
            try {
                application.unregisterActivityLifecycleCallbacks(this.f2889n);
            } catch (Exception e11) {
                io0.e("Error registering activity lifecycle callbacks.", e11);
            }
        }
    }

    final Rect a(Rect rect) {
        return new Rect(h(rect.left), h(rect.top), h(rect.right), h(rect.bottom));
    }

    public final void c(zn znVar) {
        this.f2893r.add(znVar);
        j(3);
    }

    final /* synthetic */ void d() {
        j(3);
    }

    public final void e(zn znVar) {
        this.f2893r.remove(znVar);
    }

    public final void f() {
        this.f2890o.a(f2880u);
    }

    public final void g(long j7) {
        this.f2890o.a(j7);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        i(activity, 0);
        j(3);
        k();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        j(3);
        k();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        i(activity, 4);
        j(3);
        k();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        i(activity, 0);
        j(3);
        k();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        j(3);
        k();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        i(activity, 0);
        j(3);
        k();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        j(3);
        k();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        j(2);
        k();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        j(1);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f2892q = -1;
        l(view);
        j(3);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f2892q = -1;
        j(3);
        k();
        m(view);
    }
}
