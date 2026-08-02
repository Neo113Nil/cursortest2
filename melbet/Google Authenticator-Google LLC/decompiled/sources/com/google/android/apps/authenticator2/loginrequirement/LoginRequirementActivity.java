package com.google.android.apps.authenticator2.loginrequirement;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.Menu;
import android.view.MenuItem;
import defpackage.ae;
import defpackage.ael;
import defpackage.bg;
import defpackage.bsm;
import defpackage.bst;
import defpackage.bsu;
import defpackage.bsv;
import defpackage.fhk;
import defpackage.gje;
import defpackage.gjg;
import defpackage.glp;
import defpackage.glq;
import defpackage.glz;
import defpackage.gsh;
import defpackage.gta;
import defpackage.gty;
import defpackage.gut;
import defpackage.hnu;
import defpackage.hoq;
import defpackage.jqi;
import defpackage.jqq;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class LoginRequirementActivity extends bsm implements gjg, gje, glp {
    private bst q;
    private boolean s;
    private Context t;
    private boolean v;
    private ael w;
    private final gsh r = new gsh(this, this);
    private final long u = SystemClock.elapsedRealtime();

    private final void B() {
        if (this.q == null) {
            if (!this.s) {
                throw new IllegalStateException("createPeer() called outside of onCreate");
            }
            if (this.v && !isFinishing()) {
                throw new IllegalStateException("createPeer() called after destroyed.");
            }
            gty aC = hoq.aC(20, "CreateComponent");
            try {
                C();
                aC.close();
                aC = hoq.aC(21, "CreatePeer");
                try {
                    this.q = ((bsu) hnu.bh(this, bsu.class)).f();
                    aC.close();
                } finally {
                }
            } finally {
            }
        }
    }

    @Override // defpackage.bsm
    public final /* synthetic */ jqi A() {
        return new glz(this);
    }

    @Override // defpackage.cp, defpackage.aer
    public final ael L() {
        if (this.w == null) {
            this.w = new glq(this);
        }
        return this.w;
    }

    @Override // android.view.ContextThemeWrapper
    public final void applyOverrideConfiguration(Configuration configuration) {
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            baseContext = this.t;
        }
        hoq.V(baseContext);
        super.applyOverrideConfiguration(configuration);
    }

    @Override // defpackage.di, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    protected final void attachBaseContext(Context context) {
        this.t = context;
        hoq.U(context);
        super.attachBaseContext(context);
        this.t = null;
    }

    @Override // defpackage.ezx, android.app.Activity
    public final void finish() {
        gut a = this.r.a();
        try {
            super.finish();
            a.close();
        } catch (Throwable th) {
            try {
                a.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.di, android.app.Activity
    public final void invalidateOptionsMenu() {
        gut j = gta.j();
        try {
            super.invalidateOptionsMenu();
            j.close();
        } catch (Throwable th) {
            try {
                j.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.di
    public final boolean l() {
        gut l = this.r.l();
        try {
            boolean l2 = super.l();
            l.close();
            return l2;
        } catch (Throwable th) {
            try {
                l.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ezx, defpackage.bg, defpackage.ng, android.app.Activity
    protected final void onActivityResult(int i, int i2, Intent intent) {
        gut t = this.r.t();
        try {
            super.onActivityResult(i, i2, intent);
            t.close();
        } catch (Throwable th) {
            try {
                t.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ezx, android.app.Activity, android.view.Window.Callback
    public final void onAttachedToWindow() {
        gut b = this.r.b();
        try {
            super.onAttachedToWindow();
            b.close();
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ezx, defpackage.ng, android.app.Activity
    public final void onBackPressed() {
        gut c = this.r.c();
        try {
            super.onBackPressed();
            c.close();
        } catch (Throwable th) {
            try {
                c.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ezx, defpackage.di, defpackage.ng, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        gut n = this.r.n("onConfigurationChanged", null);
        try {
            super.onConfigurationChanged(configuration);
            n.close();
        } catch (Throwable th) {
            try {
                n.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [gly, java.lang.Object] */
    @Override // defpackage.bsm, defpackage.ezx, defpackage.bg, defpackage.ng, defpackage.cp, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        gsh gshVar = this.r;
        gut u = gshVar.u();
        try {
            this.s = true;
            B();
            ((glq) L()).f(gshVar);
            C().i().b();
            super.onCreate(bundle);
            B();
            Object obj = this.q.a;
            fhk.a((Activity) obj);
            if (bundle == null) {
                ae aeVar = new ae(((bg) obj).a());
                bsv bsvVar = new bsv();
                jqq.g(bsvVar);
                aeVar.m(R.id.content, bsvVar, null);
                aeVar.c();
            }
            this.s = false;
            gshVar.o();
            u.close();
        } catch (Throwable th) {
            try {
                u.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ng, android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        gut v = this.r.v();
        try {
            super.onCreatePanelMenu(i, menu);
            v.close();
            return true;
        } catch (Throwable th) {
            try {
                v.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.bsm, defpackage.ezx, defpackage.di, defpackage.bg, android.app.Activity
    protected final void onDestroy() {
        gut d = this.r.d();
        try {
            super.onDestroy();
            this.v = true;
            d.close();
        } catch (Throwable th) {
            try {
                d.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ezx, defpackage.ng, android.app.Activity
    protected final void onNewIntent(Intent intent) {
        gut e = this.r.e(intent);
        try {
            super.onNewIntent(intent);
            e.close();
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ezx, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        gut w = this.r.w();
        try {
            boolean onOptionsItemSelected = super.onOptionsItemSelected(menuItem);
            w.close();
            return onOptionsItemSelected;
        } catch (Throwable th) {
            try {
                w.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ezx, defpackage.bg, android.app.Activity
    protected final void onPause() {
        gut f = this.r.f();
        try {
            super.onPause();
            f.close();
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ng, android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        gut x = this.r.x();
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            x.close();
        } catch (Throwable th) {
            try {
                x.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ezx, defpackage.di, android.app.Activity
    protected final void onPostCreate(Bundle bundle) {
        gut y = this.r.y();
        try {
            super.onPostCreate(bundle);
            y.close();
        } catch (Throwable th) {
            try {
                y.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ezx, defpackage.di, defpackage.bg, android.app.Activity
    protected final void onPostResume() {
        gut g = this.r.g();
        try {
            super.onPostResume();
            g.close();
        } catch (Throwable th) {
            try {
                g.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ezx, android.app.Activity
    public final boolean onPrepareOptionsMenu(Menu menu) {
        gut j = gta.j();
        try {
            boolean onPrepareOptionsMenu = super.onPrepareOptionsMenu(menu);
            j.close();
            return onPrepareOptionsMenu;
        } catch (Throwable th) {
            try {
                j.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ezx, defpackage.bg, defpackage.ng, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        gut n = this.r.n("onRequestPermissionsResult", null);
        try {
            super.onRequestPermissionsResult(i, strArr, iArr);
            n.close();
        } catch (Throwable th) {
            try {
                n.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.app.Activity
    protected final void onRestart() {
        gut h = this.r.h();
        try {
            super.onRestart();
            h.close();
        } catch (Throwable th) {
            try {
                h.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ezx, defpackage.bg, android.app.Activity
    protected final void onResume() {
        gut i = this.r.i();
        try {
            super.onResume();
            i.close();
        } catch (Throwable th) {
            try {
                i.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ezx, defpackage.ng, defpackage.cp, android.app.Activity
    protected final void onSaveInstanceState(Bundle bundle) {
        gut z = this.r.z();
        try {
            super.onSaveInstanceState(bundle);
            z.close();
        } catch (Throwable th) {
            try {
                z.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ezx, defpackage.di, defpackage.bg, android.app.Activity
    protected final void onStart() {
        gut j = this.r.j();
        try {
            super.onStart();
            j.close();
        } catch (Throwable th) {
            try {
                j.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ezx, defpackage.di, defpackage.bg, android.app.Activity
    protected final void onStop() {
        gut k = this.r.k();
        try {
            super.onStop();
            k.close();
        } catch (Throwable th) {
            try {
                k.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ezx, android.app.Activity
    public final void onUserInteraction() {
        gut m = this.r.m();
        try {
            super.onUserInteraction();
            m.close();
        } catch (Throwable th) {
            try {
                m.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ezx, android.app.Activity, android.content.ContextWrapper, android.content.Context
    public final void startActivity(Intent intent) {
        hnu.bi(intent, getApplicationContext());
        super.startActivity(intent);
    }

    @Override // defpackage.gje
    public final long x() {
        return this.u;
    }

    @Override // defpackage.gjg
    public final /* bridge */ /* synthetic */ Object z() {
        bst bstVar = this.q;
        if (bstVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.v) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return bstVar;
    }

    @Override // defpackage.ezx, android.app.Activity, android.content.ContextWrapper, android.content.Context
    public final void startActivity(Intent intent, Bundle bundle) {
        hnu.bi(intent, getApplicationContext());
        super.startActivity(intent, bundle);
    }

    @Override // defpackage.di
    protected final void m() {
    }

    @Override // defpackage.di
    protected final void n() {
    }
}
