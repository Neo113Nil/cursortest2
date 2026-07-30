package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
import android.os.SystemClock;
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
import java.util.WeakHashMap;

/* renamed from: com.google.android.gms.internal.ads.q8, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ViewOnAttachStateChangeListenerC3779q8 implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Application.ActivityLifecycleCallbacks {

    /* renamed from: H, reason: collision with root package name */
    public static final long f33647H = ((Long) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31563U1)).longValue();

    /* renamed from: A, reason: collision with root package name */
    public final C3724p7 f33648A;

    /* renamed from: B, reason: collision with root package name */
    public final N1.l f33649B = new N1.l(f33647H, 3);

    /* renamed from: C, reason: collision with root package name */
    public boolean f33650C = false;

    /* renamed from: D, reason: collision with root package name */
    public int f33651D = -1;

    /* renamed from: E, reason: collision with root package name */
    public final HashSet f33652E = new HashSet();

    /* renamed from: F, reason: collision with root package name */
    public final DisplayMetrics f33653F;

    /* renamed from: G, reason: collision with root package name */
    public final Rect f33654G;

    /* renamed from: n, reason: collision with root package name */
    public final Context f33655n;

    /* renamed from: u, reason: collision with root package name */
    public final Application f33656u;

    /* renamed from: v, reason: collision with root package name */
    public final PowerManager f33657v;

    /* renamed from: w, reason: collision with root package name */
    public final KeyguardManager f33658w;

    /* renamed from: x, reason: collision with root package name */
    public Q0.d f33659x;

    /* renamed from: y, reason: collision with root package name */
    public WeakReference f33660y;

    /* renamed from: z, reason: collision with root package name */
    public final WeakReference f33661z;

    public ViewOnAttachStateChangeListenerC3779q8(Context context, View view) {
        Context applicationContext = context.getApplicationContext();
        this.f33655n = applicationContext;
        WindowManager windowManager = (WindowManager) applicationContext.getSystemService("window");
        this.f33657v = (PowerManager) applicationContext.getSystemService("power");
        this.f33658w = (KeyguardManager) applicationContext.getSystemService("keyguard");
        if (applicationContext instanceof Application) {
            Application application = (Application) applicationContext;
            this.f33656u = application;
            this.f33648A = new C3724p7(application, this);
        }
        this.f33653F = context.getResources().getDisplayMetrics();
        Rect rect = new Rect();
        this.f33654G = rect;
        rect.right = windowManager.getDefaultDisplay().getWidth();
        rect.bottom = windowManager.getDefaultDisplay().getHeight();
        WeakReference weakReference = this.f33661z;
        View view2 = weakReference != null ? (View) weakReference.get() : null;
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(this);
            f(view2);
        }
        this.f33661z = new WeakReference(view);
        if (view != null) {
            if (view.isAttachedToWindow()) {
                e(view);
            }
            view.addOnAttachStateChangeListener(this);
        }
    }

    public final Rect a(Rect rect) {
        float f6 = rect.left;
        float f9 = this.f33653F.density;
        return new Rect((int) (f6 / f9), (int) (rect.top / f9), (int) (rect.right / f9), (int) (rect.bottom / f9));
    }

    public final void b() {
        t2.G.f40858l.post(new RunnableC3068d(8, this));
    }

    public final void c(Activity activity, int i) {
        Window window;
        WeakReference weakReference = this.f33661z;
        if (weakReference == null || (window = activity.getWindow()) == null) {
            return;
        }
        View peekDecorView = window.peekDecorView();
        View view = (View) weakReference.get();
        if (view == null || peekDecorView == null || view.getRootView() != peekDecorView.getRootView()) {
            return;
        }
        this.f33651D = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:122:0x014e, code lost:
    
        if (r10 == 0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0130, code lost:
    
        if (r10 == 0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0132, code lost:
    
        r4 = true;
        r10 = 0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x023c A[LOOP:1: B:87:0x0236->B:89:0x023c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x020d  */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(int i) {
        WeakReference weakReference;
        View view;
        boolean z8;
        boolean z9;
        ?? r02;
        ?? r42;
        PowerManager powerManager;
        boolean z10;
        boolean z11;
        boolean z12;
        Iterator it;
        HashSet hashSet = this.f33652E;
        if (hashSet.isEmpty() || (weakReference = this.f33661z) == null) {
            return;
        }
        View view2 = (View) weakReference.get();
        Rect rect = new Rect();
        Rect rect2 = new Rect();
        Rect rect3 = new Rect();
        Rect rect4 = new Rect();
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        if (view2 != null) {
            z8 = view2.getGlobalVisibleRect(rect2);
            z9 = view2.getLocalVisibleRect(rect3);
            view2.getHitRect(rect4);
            try {
                view2.getLocationOnScreen(iArr);
                view2.getLocationInWindow(iArr2);
            } catch (Exception e6) {
                int i4 = t2.C.f40822b;
                u2.i.d("Failure getting view location.", e6);
            }
            if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31610Z5)).booleanValue()) {
                rect.left = iArr2[0];
                rect.top = iArr2[1];
            } else {
                rect.left = iArr[0];
                rect.top = iArr[1];
            }
            rect.right = view2.getWidth() + rect.left;
            rect.bottom = view2.getHeight() + rect.top;
            view = view2;
        } else {
            view = null;
            z8 = false;
            z9 = false;
        }
        if (!((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31589X1)).booleanValue() || view == null) {
            r02 = Collections.EMPTY_LIST;
        } else {
            try {
                r02 = new ArrayList();
                ViewParent parent = view.getParent();
                while (parent instanceof View) {
                    View view3 = (View) parent;
                    Rect rect5 = new Rect();
                    if (view3.isScrollContainer() && view3.getGlobalVisibleRect(rect5)) {
                        r02.add(a(rect5));
                    }
                    parent = parent.getParent();
                }
            } catch (Exception e9) {
                p2.j.f39798C.f39808h.d("PositionWatcher.getParentScrollViewRects", e9);
                r02 = Collections.EMPTY_LIST;
            }
        }
        List list = r02;
        int windowVisibility = view != null ? view.getWindowVisibility() : 8;
        int i9 = this.f33651D;
        if (i9 != -1) {
            windowVisibility = i9;
        }
        p2.j jVar = p2.j.f39798C;
        t2.G g9 = jVar.f39803c;
        long Q3 = t2.G.Q(view);
        C3151ea c3151ea = AbstractC3368ia.Wb;
        q2.r rVar = q2.r.f40116e;
        boolean booleanValue = ((Boolean) rVar.f40119c.a(c3151ea)).booleanValue();
        KeyguardManager keyguardManager = this.f33658w;
        PowerManager powerManager2 = this.f33657v;
        if (!booleanValue) {
            if (view2 != null && t2.G.r(view, powerManager2, keyguardManager)) {
                if (z8) {
                    if (z9) {
                    }
                    r42 = 0;
                    z8 = true;
                    z9 = false;
                    int i10 = windowVisibility;
                    if (((Boolean) rVar.f40119c.a(AbstractC3368ia.bc)).booleanValue()) {
                    }
                    if (i == 1) {
                    }
                    if (r42 == 0) {
                    }
                    z12 = true;
                    jVar.f39810k.getClass();
                    SystemClock.elapsedRealtime();
                    powerManager.isScreenOn();
                    if (view == null) {
                    }
                    if (view != null) {
                    }
                    Rect a9 = a(this.f33654G);
                    Rect a10 = a(rect);
                    Rect a11 = a(rect2);
                    Rect a12 = a(rect3);
                    Rect a13 = a(rect4);
                    float f6 = this.f33653F.density;
                    boolean z13 = r42;
                    C3671o8 c3671o8 = new C3671o8(r17, r18, a9, a10, a11, z10, a12, z11, a13, z13, list);
                    it = hashSet.iterator();
                    while (it.hasNext()) {
                    }
                    this.f33650C = z13;
                }
                r42 = 0;
                z8 = false;
                int i102 = windowVisibility;
                if (((Boolean) rVar.f40119c.a(AbstractC3368ia.bc)).booleanValue()) {
                }
                if (i == 1) {
                }
                if (r42 == 0) {
                }
                z12 = true;
                jVar.f39810k.getClass();
                SystemClock.elapsedRealtime();
                powerManager.isScreenOn();
                if (view == null) {
                }
                if (view != null) {
                }
                Rect a92 = a(this.f33654G);
                Rect a102 = a(rect);
                Rect a112 = a(rect2);
                Rect a122 = a(rect3);
                Rect a132 = a(rect4);
                float f62 = this.f33653F.density;
                boolean z132 = r42;
                C3671o8 c3671o82 = new C3671o8(r17, r18, a92, a102, a112, z10, a122, z11, a132, z132, list);
                it = hashSet.iterator();
                while (it.hasNext()) {
                }
                this.f33650C = z132;
            }
            r42 = 0;
            int i1022 = windowVisibility;
            if (((Boolean) rVar.f40119c.a(AbstractC3368ia.bc)).booleanValue()) {
            }
            if (i == 1) {
            }
            if (r42 == 0) {
            }
            z12 = true;
            jVar.f39810k.getClass();
            SystemClock.elapsedRealtime();
            powerManager.isScreenOn();
            if (view == null) {
            }
            if (view != null) {
            }
            Rect a922 = a(this.f33654G);
            Rect a1022 = a(rect);
            Rect a1122 = a(rect2);
            Rect a1222 = a(rect3);
            Rect a1322 = a(rect4);
            float f622 = this.f33653F.density;
            boolean z1322 = r42;
            C3671o8 c3671o822 = new C3671o8(r17, r18, a922, a1022, a1122, z10, a1222, z11, a1322, z1322, list);
            it = hashSet.iterator();
            while (it.hasNext()) {
            }
            this.f33650C = z1322;
        }
        if (view2 != null && t2.G.r(view, powerManager2, keyguardManager)) {
            if (z8) {
                if (z9) {
                    if (Q3 >= ((Integer) rVar.f40119c.a(AbstractC3368ia.Zb)).intValue()) {
                    }
                    boolean z14 = false;
                    z8 = true;
                    z9 = true;
                    r42 = z14;
                    int i10222 = windowVisibility;
                    if (((Boolean) rVar.f40119c.a(AbstractC3368ia.bc)).booleanValue()) {
                        int i11 = true != t2.G.r(view, powerManager2, keyguardManager) ? 0 : 64;
                        int i12 = true != z8 ? 0 : 8;
                        powerManager = powerManager2;
                        t2.G.j((Q3 >= ((long) ((Integer) rVar.f40119c.a(AbstractC3368ia.Zb)).intValue()) ? 32 : 0) | i11 | i12 | (true != z9 ? 0 : 16) | (i10222 == 0 ? 128 : 0) | r42, view);
                    } else {
                        powerManager = powerManager2;
                    }
                    if (i == 1) {
                        N1.l lVar = this.f33649B;
                        synchronized (lVar.f1970v) {
                            jVar.f39810k.getClass();
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            z10 = z8;
                            z11 = z9;
                            if (lVar.f1969u + lVar.f1968n <= elapsedRealtime) {
                                lVar.f1969u = elapsedRealtime;
                            } else if (r42 == this.f33650C) {
                                return;
                            }
                        }
                    } else {
                        z10 = z8;
                        z11 = z9;
                    }
                    if (r42 == 0 || this.f33650C) {
                        z12 = true;
                    } else {
                        z12 = true;
                        if (i == 1) {
                            return;
                        }
                    }
                    jVar.f39810k.getClass();
                    SystemClock.elapsedRealtime();
                    powerManager.isScreenOn();
                    boolean z15 = (view == null && view.isAttachedToWindow()) ? z12 : false;
                    int windowVisibility2 = view != null ? view.getWindowVisibility() : 8;
                    Rect a9222 = a(this.f33654G);
                    Rect a10222 = a(rect);
                    Rect a11222 = a(rect2);
                    Rect a12222 = a(rect3);
                    Rect a13222 = a(rect4);
                    float f6222 = this.f33653F.density;
                    boolean z13222 = r42;
                    C3671o8 c3671o8222 = new C3671o8(z15, windowVisibility2, a9222, a10222, a11222, z10, a12222, z11, a13222, z13222, list);
                    it = hashSet.iterator();
                    while (it.hasNext()) {
                        ((InterfaceC3725p8) it.next()).A(c3671o8222);
                    }
                    this.f33650C = z13222;
                }
                r42 = 0;
                z8 = true;
                z9 = false;
                int i102222 = windowVisibility;
                if (((Boolean) rVar.f40119c.a(AbstractC3368ia.bc)).booleanValue()) {
                }
                if (i == 1) {
                }
                if (r42 == 0) {
                }
                z12 = true;
                jVar.f39810k.getClass();
                SystemClock.elapsedRealtime();
                powerManager.isScreenOn();
                if (view == null) {
                }
                if (view != null) {
                }
                Rect a92222 = a(this.f33654G);
                Rect a102222 = a(rect);
                Rect a112222 = a(rect2);
                Rect a122222 = a(rect3);
                Rect a132222 = a(rect4);
                float f62222 = this.f33653F.density;
                boolean z132222 = r42;
                C3671o8 c3671o82222 = new C3671o8(z15, windowVisibility2, a92222, a102222, a112222, z10, a122222, z11, a132222, z132222, list);
                it = hashSet.iterator();
                while (it.hasNext()) {
                }
                this.f33650C = z132222;
            }
            r42 = 0;
            z8 = false;
            int i1022222 = windowVisibility;
            if (((Boolean) rVar.f40119c.a(AbstractC3368ia.bc)).booleanValue()) {
            }
            if (i == 1) {
            }
            if (r42 == 0) {
            }
            z12 = true;
            jVar.f39810k.getClass();
            SystemClock.elapsedRealtime();
            powerManager.isScreenOn();
            if (view == null) {
            }
            if (view != null) {
            }
            Rect a922222 = a(this.f33654G);
            Rect a1022222 = a(rect);
            Rect a1122222 = a(rect2);
            Rect a1222222 = a(rect3);
            Rect a1322222 = a(rect4);
            float f622222 = this.f33653F.density;
            boolean z1322222 = r42;
            C3671o8 c3671o822222 = new C3671o8(z15, windowVisibility2, a922222, a1022222, a1122222, z10, a1222222, z11, a1322222, z1322222, list);
            it = hashSet.iterator();
            while (it.hasNext()) {
            }
            this.f33650C = z1322222;
        }
        r42 = 0;
        int i10222222 = windowVisibility;
        if (((Boolean) rVar.f40119c.a(AbstractC3368ia.bc)).booleanValue()) {
        }
        if (i == 1) {
        }
        if (r42 == 0) {
        }
        z12 = true;
        jVar.f39810k.getClass();
        SystemClock.elapsedRealtime();
        powerManager.isScreenOn();
        if (view == null) {
        }
        if (view != null) {
        }
        Rect a9222222 = a(this.f33654G);
        Rect a10222222 = a(rect);
        Rect a11222222 = a(rect2);
        Rect a12222222 = a(rect3);
        Rect a13222222 = a(rect4);
        float f6222222 = this.f33653F.density;
        boolean z13222222 = r42;
        C3671o8 c3671o8222222 = new C3671o8(z15, windowVisibility2, a9222222, a10222222, a11222222, z10, a12222222, z11, a13222222, z13222222, list);
        it = hashSet.iterator();
        while (it.hasNext()) {
        }
        this.f33650C = z13222222;
    }

    public final void e(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.f33660y = new WeakReference(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.f33659x == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            Q0.d dVar = new Q0.d(this);
            this.f33659x = dVar;
            Context context = this.f33655n;
            C4088vv c4088vv = p2.j.f39798C.f39825z;
            synchronized (c4088vv) {
                if (c4088vv.f34898u) {
                    ((WeakHashMap) c4088vv.f34900w).put(dVar, intentFilter);
                } else {
                    AbstractC3368ia.a(context);
                    if (!((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.tc)).booleanValue() || Build.VERSION.SDK_INT < 33) {
                        context.registerReceiver(dVar, intentFilter);
                    } else {
                        context.registerReceiver(dVar, intentFilter, 4);
                    }
                }
            }
        }
        Application application = this.f33656u;
        if (application != null) {
            try {
                application.registerActivityLifecycleCallbacks(this.f33648A);
            } catch (Exception e6) {
                int i = t2.C.f40822b;
                u2.i.d("Error registering activity lifecycle callbacks.", e6);
            }
        }
    }

    public final void f(View view) {
        try {
            WeakReference weakReference = this.f33660y;
            if (weakReference != null) {
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) weakReference.get();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this);
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
                this.f33660y = null;
            }
        } catch (Exception e6) {
            int i = t2.C.f40822b;
            u2.i.d("Error while unregistering listeners from the last ViewTreeObserver.", e6);
        }
        try {
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnScrollChangedListener(this);
                viewTreeObserver2.removeGlobalOnLayoutListener(this);
            }
        } catch (Exception e9) {
            int i4 = t2.C.f40822b;
            u2.i.d("Error while unregistering listeners from the ViewTreeObserver.", e9);
        }
        Q0.d dVar = this.f33659x;
        if (dVar != null) {
            try {
                p2.j.f39798C.f39825z.i(this.f33655n, dVar);
            } catch (IllegalStateException e10) {
                int i9 = t2.C.f40822b;
                u2.i.d("Failed trying to unregister the receiver", e10);
            } catch (Exception e11) {
                p2.j.f39798C.f39808h.d("ActiveViewUnit.stopScreenStatusMonitoring", e11);
            }
            this.f33659x = null;
        }
        Application application = this.f33656u;
        if (application != null) {
            try {
                application.unregisterActivityLifecycleCallbacks(this.f33648A);
            } catch (Exception e12) {
                int i10 = t2.C.f40822b;
                u2.i.d("Error registering activity lifecycle callbacks.", e12);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        c(activity, 0);
        d(3);
        b();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        d(3);
        b();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        c(activity, 4);
        d(3);
        b();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        c(activity, 0);
        d(3);
        b();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        d(3);
        b();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        c(activity, 0);
        d(3);
        b();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        d(3);
        b();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        d(2);
        b();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        d(1);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f33651D = -1;
        e(view);
        d(3);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f33651D = -1;
        d(3);
        b();
        f(view);
    }
}
