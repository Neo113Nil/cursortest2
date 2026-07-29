package com.tapjoy.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.tapjoy.TJContentActivity;
import com.tapjoy.TapjoyErrorMessage;
import com.tapjoy.TapjoyLog;
import com.tapjoy.internal.ip;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class gw extends hh {
    private static final String h = "gw";
    private static gw i;

    /* renamed from: a, reason: collision with root package name */
    final String f8216a;

    /* renamed from: b, reason: collision with root package name */
    final hs f8217b;
    private final ha j;
    private boolean k;
    private boolean l;
    private long m;
    private Context n;
    private ip o;
    private Activity p;
    private hb q;
    private Handler r;
    private Runnable s;

    public static void a() {
        gw gwVar = i;
        if (gwVar != null) {
            Runnable runnable = new Runnable() { // from class: com.tapjoy.internal.gw.1
                @Override // java.lang.Runnable
                public final void run() {
                    gw.a(gw.this);
                }
            };
            Looper mainLooper = Looper.getMainLooper();
            if (mainLooper != null && mainLooper.getThread() == Thread.currentThread()) {
                runnable.run();
            } else {
                u.a().post(runnable);
            }
        }
    }

    public gw(ha haVar, String str, hs hsVar, Context context) {
        this.j = haVar;
        this.f8216a = str;
        this.f8217b = hsVar;
        this.n = context;
    }

    @Override // com.tapjoy.internal.hh
    public final void b() {
        Iterator it = this.f8217b.f8313a.iterator();
        while (it.hasNext()) {
            Iterator it2 = ((ib) it.next()).f8357c.iterator();
            while (it2.hasNext()) {
                ia iaVar = (ia) it2.next();
                if (iaVar.l != null) {
                    iaVar.l.b();
                }
                if (iaVar.m != null) {
                    iaVar.m.b();
                }
            }
        }
    }

    @Override // com.tapjoy.internal.hh
    public final boolean c() {
        Iterator it = this.f8217b.f8313a.iterator();
        boolean z = true;
        while (it.hasNext()) {
            Iterator it2 = ((ib) it.next()).f8357c.iterator();
            while (it2.hasNext()) {
                ia iaVar = (ia) it2.next();
                if ((iaVar.l != null && !iaVar.l.a()) || (iaVar.m != null && !iaVar.m.a())) {
                    z = false;
                    break;
                }
            }
            z = true;
            if (!z) {
                return false;
            }
        }
        return z;
    }

    @Override // com.tapjoy.internal.hh
    public final void a(hb hbVar, fx fxVar) {
        this.q = hbVar;
        this.p = gs.a();
        if (this.p != null && !this.p.isFinishing()) {
            try {
                a(this.p, hbVar, fxVar);
                new Object[1][0] = this.f8216a;
                return;
            } catch (WindowManager.BadTokenException unused) {
            }
        }
        this.p = a.a(this.n);
        if (this.p != null && !this.p.isFinishing()) {
            try {
                a(this.p, hbVar, fxVar);
                new Object[1][0] = this.f8216a;
                return;
            } catch (WindowManager.BadTokenException unused2) {
            }
        }
        gx.b("Failed to show the content for \"{}\". No usable activity found.", this.f8216a);
        hbVar.a(this.f8216a, this.f, null);
    }

    private void a(final Activity activity, final hb hbVar, fx fxVar) {
        if (this.k) {
            TapjoyLog.e(h, new TapjoyErrorMessage(TapjoyErrorMessage.ErrorType.INTEGRATION_ERROR, "Content is already displayed"));
            return;
        }
        this.k = true;
        this.l = true;
        i = this;
        this.g = fxVar.f8134a;
        this.o = new ip(activity, this.f8217b, new ip.a() { // from class: com.tapjoy.internal.gw.2
            @Override // com.tapjoy.internal.ip.a
            public final void a(ia iaVar) {
                fw fwVar;
                if ((gw.this.g instanceof fw) && (fwVar = (fw) gw.this.g) != null && fwVar.f8133c != null) {
                    fwVar.f8133c.a();
                }
                gw.this.j.a(gw.this.f8217b.f8314b, iaVar.k);
                if (!jr.c(iaVar.h)) {
                    gw.this.e.a(activity, iaVar.h, jr.b(iaVar.i));
                    gw.this.f8278d = true;
                } else if (!jr.c(iaVar.g)) {
                    hh.a(activity, iaVar.g);
                }
                hbVar.a(gw.this.f8216a, null);
                if (iaVar.j) {
                    gw.a(gw.this);
                }
            }

            @Override // com.tapjoy.internal.ip.a
            public final void a() {
                gw.a(gw.this);
            }
        });
        Window window = activity.getWindow();
        ip ipVar = this.o;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1, 17);
        Window.Callback callback = window.getCallback();
        window.setCallback(null);
        window.addContentView(ipVar, layoutParams);
        window.setCallback(callback);
        this.m = SystemClock.elapsedRealtime();
        this.j.a(this.f8217b.f8314b);
        fxVar.a();
        fr frVar = this.g;
        if (frVar != null) {
            frVar.b();
        }
        hbVar.c(this.f8216a);
        if (this.f8217b.f8315c > 0.0f) {
            this.r = new Handler(Looper.getMainLooper());
            this.s = new Runnable() { // from class: com.tapjoy.internal.gw.3
                @Override // java.lang.Runnable
                public final void run() {
                    gw.a(gw.this);
                }
            };
            this.r.postDelayed(this.s, (long) (this.f8217b.f8315c * 1000.0f));
        }
    }

    static /* synthetic */ void a(gw gwVar) {
        if (gwVar.l) {
            gwVar.l = false;
            if (gwVar.r != null) {
                gwVar.r.removeCallbacks(gwVar.s);
                gwVar.s = null;
                gwVar.r = null;
            }
            if (i == gwVar) {
                i = null;
            }
            gwVar.j.a(gwVar.f8217b.f8314b, SystemClock.elapsedRealtime() - gwVar.m);
            if (!gwVar.f8278d && gwVar.q != null) {
                gwVar.q.a(gwVar.f8216a, gwVar.f, null);
                gwVar.q = null;
            }
            ViewGroup viewGroup = (ViewGroup) gwVar.o.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(gwVar.o);
            }
            gwVar.o = null;
            if (gwVar.p instanceof TJContentActivity) {
                gwVar.p.finish();
            }
            gwVar.p = null;
        }
    }
}
