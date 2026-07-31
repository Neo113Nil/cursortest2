package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class nc implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Application.ActivityLifecycleCallbacks {

    /* renamed from: r, reason: collision with root package name */
    private static final Handler f9028r = new Handler(Looper.getMainLooper());

    /* renamed from: f, reason: collision with root package name */
    private final Context f9029f;

    /* renamed from: g, reason: collision with root package name */
    private Application f9030g;

    /* renamed from: h, reason: collision with root package name */
    private final PowerManager f9031h;

    /* renamed from: i, reason: collision with root package name */
    private final KeyguardManager f9032i;

    /* renamed from: j, reason: collision with root package name */
    private BroadcastReceiver f9033j;

    /* renamed from: k, reason: collision with root package name */
    private final zb f9034k;

    /* renamed from: l, reason: collision with root package name */
    private WeakReference<ViewTreeObserver> f9035l;

    /* renamed from: m, reason: collision with root package name */
    private WeakReference<View> f9036m;

    /* renamed from: n, reason: collision with root package name */
    private wb f9037n;

    /* renamed from: o, reason: collision with root package name */
    private byte f9038o = -1;

    /* renamed from: p, reason: collision with root package name */
    private int f9039p = -1;

    /* renamed from: q, reason: collision with root package name */
    private long f9040q = -3;

    public nc(Context context, zb zbVar) {
        Context applicationContext = context.getApplicationContext();
        this.f9029f = applicationContext;
        this.f9034k = zbVar;
        this.f9031h = (PowerManager) applicationContext.getSystemService("power");
        this.f9032i = (KeyguardManager) applicationContext.getSystemService("keyguard");
        if (applicationContext instanceof Application) {
            Application application = (Application) applicationContext;
            this.f9030g = application;
            this.f9037n = new wb(application, this);
        }
        d(null);
    }

    private final void e(Activity activity, int i7) {
        Window window;
        if (this.f9036m == null || (window = activity.getWindow()) == null) {
            return;
        }
        View peekDecorView = window.peekDecorView();
        View b7 = b();
        if (b7 == null || peekDecorView == null || b7.getRootView() != peekDecorView.getRootView()) {
            return;
        }
        this.f9039p = i7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x005c, code lost:
    
        if ((r5.flags & 524288) != 0) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f() {
        Activity b7;
        if (this.f9036m == null) {
            return;
        }
        View b8 = b();
        if (b8 == null) {
            this.f9040q = -3L;
            this.f9038o = (byte) -1;
            return;
        }
        int i7 = b8.getVisibility() != 0 ? 1 : 0;
        if (!b8.isShown()) {
            i7 |= 2;
        }
        PowerManager powerManager = this.f9031h;
        if (powerManager != null && !powerManager.isScreenOn()) {
            i7 |= 4;
        }
        if (!this.f9034k.a()) {
            KeyguardManager keyguardManager = this.f9032i;
            if (keyguardManager != null && keyguardManager.inKeyguardRestrictedInputMode() && (b7 = jc.b(b8)) != null) {
                Window window = b7.getWindow();
                WindowManager.LayoutParams attributes = window == null ? null : window.getAttributes();
                if (attributes != null) {
                }
            }
            i7 |= 8;
        }
        if (!b8.getGlobalVisibleRect(new Rect())) {
            i7 |= 16;
        }
        if (!b8.getLocalVisibleRect(new Rect())) {
            i7 |= 32;
        }
        int windowVisibility = b8.getWindowVisibility();
        int i8 = this.f9039p;
        if (i8 != -1) {
            windowVisibility = i8;
        }
        if (windowVisibility != 0) {
            i7 |= 64;
        }
        if (this.f9038o != i7) {
            this.f9038o = (byte) i7;
            this.f9040q = i7 == 0 ? SystemClock.elapsedRealtime() : (-3) - i7;
        }
    }

    private final void g() {
        f9028r.post(new lc(this));
    }

    private final void h(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.f9035l = new WeakReference<>(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.f9033j == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            mc mcVar = new mc(this);
            this.f9033j = mcVar;
            this.f9029f.registerReceiver(mcVar, intentFilter);
        }
        Application application = this.f9030g;
        if (application != null) {
            try {
                application.registerActivityLifecycleCallbacks(this.f9037n);
            } catch (Exception unused) {
            }
        }
    }

    private final void i(View view) {
        try {
            WeakReference<ViewTreeObserver> weakReference = this.f9035l;
            if (weakReference != null) {
                ViewTreeObserver viewTreeObserver = weakReference.get();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this);
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
                this.f9035l = null;
            }
        } catch (Exception unused) {
        }
        try {
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnScrollChangedListener(this);
                viewTreeObserver2.removeGlobalOnLayoutListener(this);
            }
        } catch (Exception unused2) {
        }
        BroadcastReceiver broadcastReceiver = this.f9033j;
        if (broadcastReceiver != null) {
            try {
                this.f9029f.unregisterReceiver(broadcastReceiver);
            } catch (Exception unused3) {
            }
            this.f9033j = null;
        }
        Application application = this.f9030g;
        if (application != null) {
            try {
                application.unregisterActivityLifecycleCallbacks(this.f9037n);
            } catch (Exception unused4) {
            }
        }
    }

    public final long a() {
        if (this.f9040q <= -2 && b() == null) {
            this.f9040q = -3L;
        }
        return this.f9040q;
    }

    final View b() {
        WeakReference<View> weakReference = this.f9036m;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    final void d(View view) {
        long j7;
        View b7 = b();
        if (b7 != null) {
            b7.removeOnAttachStateChangeListener(this);
            i(b7);
        }
        this.f9036m = new WeakReference<>(view);
        if (view != null) {
            if (view.getWindowToken() != null || view.getWindowVisibility() != 8) {
                h(view);
            }
            view.addOnAttachStateChangeListener(this);
            j7 = -2;
        } else {
            j7 = -3;
        }
        this.f9040q = j7;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        e(activity, 0);
        f();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        f();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        e(activity, 4);
        f();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        e(activity, 0);
        f();
        g();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        f();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        e(activity, 0);
        f();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        f();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        f();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        f();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f9039p = -1;
        h(view);
        f();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f9039p = -1;
        f();
        g();
        i(view);
    }
}
