package com.applovin.impl.sdk;

import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import com.applovin.mediation.ads.MaxAdView;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class v {

    /* renamed from: a, reason: collision with root package name */
    private final j f3379a;
    private final Runnable e;
    private WeakReference<ViewTreeObserver> g;
    private View h;
    private int i;
    private long j;

    /* renamed from: b, reason: collision with root package name */
    private final Object f3380b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private final Rect f3381c = new Rect();
    private long k = Long.MIN_VALUE;

    /* renamed from: d, reason: collision with root package name */
    private final Handler f3382d = new Handler();
    private final ViewTreeObserver.OnPreDrawListener f = new ViewTreeObserver.OnPreDrawListener() { // from class: com.applovin.impl.sdk.v.2
        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            v.this.b();
            return true;
        }
    };

    public interface a {
        void onLogVisibilityImpression();
    }

    public v(final MaxAdView maxAdView, j jVar, final a aVar) {
        this.f3379a = jVar;
        this.e = new Runnable() { // from class: com.applovin.impl.sdk.v.1
            @Override // java.lang.Runnable
            public void run() {
                if (v.this.h == null) {
                    return;
                }
                if (!v.this.b(maxAdView, v.this.h)) {
                    v.this.b();
                } else {
                    v.this.a();
                    aVar.onLogVisibilityImpression();
                }
            }
        };
    }

    private void a(Context context, View view) {
        View a2 = com.applovin.impl.sdk.e.l.a(context, view);
        if (a2 == null) {
            this.f3379a.u().a("VisibilityTracker", "Unable to set view tree observer due to no root view.");
            return;
        }
        ViewTreeObserver viewTreeObserver = a2.getViewTreeObserver();
        if (!viewTreeObserver.isAlive()) {
            this.f3379a.u().c("VisibilityTracker", "Unable to set view tree observer since the view tree observer is not alive.");
        } else {
            this.g = new WeakReference<>(viewTreeObserver);
            viewTreeObserver.addOnPreDrawListener(this.f);
        }
    }

    private boolean a(View view, View view2) {
        return view2 != null && view2.getVisibility() == 0 && view.getParent() != null && view2.getWidth() > 0 && view2.getHeight() > 0 && view2.getGlobalVisibleRect(this.f3381c) && ((long) (AppLovinSdkUtils.pxToDp(view2.getContext(), this.f3381c.width()) * AppLovinSdkUtils.pxToDp(view2.getContext(), this.f3381c.height()))) >= ((long) this.i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        this.f3382d.postDelayed(this.e, ((Long) this.f3379a.a(com.applovin.impl.sdk.b.b.cr)).longValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(View view, View view2) {
        if (!a(view, view2)) {
            return false;
        }
        if (this.k == Long.MIN_VALUE) {
            this.k = SystemClock.uptimeMillis();
        }
        return SystemClock.uptimeMillis() - this.k >= this.j;
    }

    public void a() {
        synchronized (this.f3380b) {
            this.f3382d.removeMessages(0);
            if (this.g != null) {
                ViewTreeObserver viewTreeObserver = this.g.get();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnPreDrawListener(this.f);
                }
                this.g.clear();
            }
            this.k = Long.MIN_VALUE;
            this.h = null;
        }
    }

    public void a(Context context, com.applovin.impl.mediation.a.b bVar) {
        synchronized (this.f3380b) {
            a();
            this.h = bVar.j();
            this.i = bVar.o();
            this.j = bVar.q();
            a(context, this.h);
        }
    }
}
