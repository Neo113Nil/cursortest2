package com.google.apps.tiktok.account.ui.onegoogle.expresssignin.selector;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.Menu;
import android.view.MenuItem;
import com.google.android.apps.authenticator2.R;
import defpackage.ae;
import defpackage.ael;
import defpackage.dh;
import defpackage.di;
import defpackage.fzc;
import defpackage.fzd;
import defpackage.fzg;
import defpackage.fzi;
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
public final class ExpressSignInActivity extends fzg implements gjg, gje, glp {
    private fzc p;
    private boolean r;
    private Context s;
    private boolean u;
    private ael v;
    private final gsh q = new gsh(this, this);
    private final long t = SystemClock.elapsedRealtime();

    public ExpressSignInActivity() {
        s(new dh((di) this, 20));
    }

    public final void A() {
        if (this.p == null) {
            if (!this.r) {
                throw new IllegalStateException("createPeer() called outside of onCreate");
            }
            if (this.u && !isFinishing()) {
                throw new IllegalStateException("createPeer() called after destroyed.");
            }
            gty aC = hoq.aC(115, "CreateComponent");
            try {
                C();
                aC.close();
                aC = hoq.aC(116, "CreatePeer");
                try {
                    this.p = ((fzd) hnu.bh(this, fzd.class)).k();
                    aC.close();
                } finally {
                }
            } finally {
            }
        }
    }

    @Override // defpackage.cp, defpackage.aer
    public final ael L() {
        if (this.v == null) {
            this.v = new glq(this);
        }
        return this.v;
    }

    @Override // android.view.ContextThemeWrapper
    public final void applyOverrideConfiguration(Configuration configuration) {
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            baseContext = this.s;
        }
        hoq.V(baseContext);
        super.applyOverrideConfiguration(configuration);
    }

    @Override // defpackage.di, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    protected final void attachBaseContext(Context context) {
        this.s = context;
        hoq.U(context);
        super.attachBaseContext(context);
        this.s = null;
    }

    @Override // android.app.Activity
    public final void finish() {
        gut a = this.q.a();
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
        gut l = this.q.l();
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

    @Override // defpackage.bg, defpackage.ng, android.app.Activity
    protected final void onActivityResult(int i, int i2, Intent intent) {
        gut t = this.q.t();
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

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onAttachedToWindow() {
        gut b = this.q.b();
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

    @Override // defpackage.ng, android.app.Activity
    public final void onBackPressed() {
        gut c = this.q.c();
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

    @Override // defpackage.di, defpackage.ng, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        gut n = this.q.n("onConfigurationChanged", null);
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

    @Override // defpackage.fzg, defpackage.bg, defpackage.ng, defpackage.cp, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        gsh gshVar = this.q;
        gut u = gshVar.u();
        try {
            this.r = true;
            ((glq) L()).f(gshVar);
            super.onCreate(bundle);
            A();
            fzc fzcVar = this.p;
            boolean z = fzcVar.c;
            boolean z2 = fzcVar.d;
            ExpressSignInActivity expressSignInActivity = fzcVar.a;
            expressSignInActivity.setContentView(R.layout.express_sign_in_activity);
            expressSignInActivity.setFinishOnTouchOutside(false);
            if (expressSignInActivity.a().c(R.id.fragment_container) == null) {
                ae aeVar = new ae(expressSignInActivity.a());
                fzi fziVar = new fzi();
                jqq.g(fziVar);
                aeVar.d(R.id.fragment_container, fziVar, null, 1);
                aeVar.c();
            }
            this.r = false;
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
        gut v = this.q.v();
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

    @Override // defpackage.fzg, defpackage.di, defpackage.bg, android.app.Activity
    protected final void onDestroy() {
        gut d = this.q.d();
        try {
            super.onDestroy();
            this.u = true;
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

    @Override // defpackage.ng, android.app.Activity
    protected final void onNewIntent(Intent intent) {
        gut e = this.q.e(intent);
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

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        gut w = this.q.w();
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

    @Override // defpackage.bg, android.app.Activity
    protected final void onPause() {
        gut f = this.q.f();
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
        gut x = this.q.x();
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

    @Override // defpackage.di, android.app.Activity
    protected final void onPostCreate(Bundle bundle) {
        gut y = this.q.y();
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

    @Override // defpackage.di, defpackage.bg, android.app.Activity
    protected final void onPostResume() {
        gut g = this.q.g();
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

    @Override // android.app.Activity
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

    @Override // defpackage.bg, defpackage.ng, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        gut n = this.q.n("onRequestPermissionsResult", null);
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
        gut h = this.q.h();
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

    @Override // defpackage.bg, android.app.Activity
    protected final void onResume() {
        gut i = this.q.i();
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

    @Override // defpackage.ng, defpackage.cp, android.app.Activity
    protected final void onSaveInstanceState(Bundle bundle) {
        gut z = this.q.z();
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

    @Override // defpackage.di, defpackage.bg, android.app.Activity
    protected final void onStart() {
        gut j = this.q.j();
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

    @Override // defpackage.di, defpackage.bg, android.app.Activity
    protected final void onStop() {
        gut k = this.q.k();
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

    @Override // android.app.Activity
    public final void onUserInteraction() {
        gut m = this.q.m();
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

    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context
    public final void startActivity(Intent intent) {
        hnu.bi(intent, getApplicationContext());
        super.startActivity(intent);
    }

    @Override // defpackage.gje
    public final long x() {
        return this.t;
    }

    @Override // defpackage.fzg
    public final /* synthetic */ jqi y() {
        return new glz(this);
    }

    @Override // defpackage.gjg
    public final /* bridge */ /* synthetic */ Object z() {
        fzc fzcVar = this.p;
        if (fzcVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.u) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return fzcVar;
    }

    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context
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
