package com.google.android.apps.authenticator2.addfirstotp;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import com.google.android.apps.authenticator2.R;
import defpackage.ael;
import defpackage.afx;
import defpackage.ago;
import defpackage.agp;
import defpackage.boh;
import defpackage.boi;
import defpackage.boj;
import defpackage.bos;
import defpackage.cs;
import defpackage.dh;
import defpackage.di;
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
import defpackage.yi;
import defpackage.yq;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class AddFirstOtpActivity extends bos implements gjg, gje, glp {
    private boi p;
    private boolean r;
    private Context s;
    private boolean u;
    private ael v;
    private final gsh q = new gsh(this, this);
    private final long t = SystemClock.elapsedRealtime();

    public AddFirstOtpActivity() {
        s(new dh((di) this, 3));
    }

    private final boi D() {
        A();
        return this.p;
    }

    public final void A() {
        if (this.p == null) {
            if (!this.r) {
                throw new IllegalStateException("createPeer() called outside of onCreate");
            }
            if (this.u && !isFinishing()) {
                throw new IllegalStateException("createPeer() called after destroyed.");
            }
            gty aC = hoq.aC(4, "CreateComponent");
            try {
                C();
                aC.close();
                aC = hoq.aC(5, "CreatePeer");
                try {
                    this.p = ((boj) hnu.bh(this, boj.class)).a();
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

    @Override // defpackage.ng, defpackage.aeh
    public final ago P() {
        agp agpVar = new agp(super.P());
        agpVar.b(afx.c, new Bundle());
        return agpVar;
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

    @Override // defpackage.bos, defpackage.bg, defpackage.ng, defpackage.cp, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        gsh gshVar = this.q;
        gut u = gshVar.u();
        try {
            this.r = true;
            ((glq) L()).f(gshVar);
            super.onCreate(bundle);
            AddFirstOtpActivity addFirstOtpActivity = D().a;
            fhk.a(addFirstOtpActivity);
            addFirstOtpActivity.setContentView(R.layout.add_first_otp_activity);
            addFirstOtpActivity.k(boi.a(addFirstOtpActivity));
            cs h = addFirstOtpActivity.h();
            h.v();
            h.i(R.string.add_first_otp_activity_title);
            Toolbar a = boi.a(addFirstOtpActivity);
            boh bohVar = new boh(0);
            int i = yq.a;
            yi.c(a, bohVar);
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

    @Override // defpackage.bos, defpackage.di, defpackage.bg, android.app.Activity
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
            super.onOptionsItemSelected(menuItem);
            boi D = D();
            if (menuItem.getItemId() == 16908332) {
                D.a.f().c();
            }
            w.close();
            return true;
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

    @Override // defpackage.bos
    public final /* synthetic */ jqi y() {
        return new glz(this);
    }

    @Override // defpackage.gjg
    public final /* bridge */ /* synthetic */ Object z() {
        boi boiVar = this.p;
        if (boiVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.u) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return boiVar;
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
