package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fyo extends fzb implements gjg {
    private fyq c;
    private Context d;
    private boolean e;

    @Override // defpackage.fzb, defpackage.bd
    public final void X(Activity activity) {
        this.a.i();
        try {
            super.X(activity);
            gta.o();
        } catch (Throwable th) {
            try {
                gta.o();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.gjg
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final fyq z() {
        fyq fyqVar = this.c;
        if (fyqVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.e) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return fyqVar;
    }

    @Override // defpackage.bd
    public final void ah(Bundle bundle) {
        Bundle bundle2 = this.n;
        boolean z = true;
        if (bundle2 != null && bundle2 != bundle) {
            z = false;
        }
        hoq.I(z, "Cannot overwrite fragment arguments. See - http://go/tiktok/dev/dagger/fragmentpeers.md#argument");
        super.ah(bundle);
    }

    @Override // defpackage.bd
    public final LayoutInflater bv(Bundle bundle) {
        this.a.i();
        try {
            LayoutInflater at = at();
            LayoutInflater cloneInContext = at.cloneInContext(new gmq(at, this));
            LayoutInflater cloneInContext2 = cloneInContext.cloneInContext(new glx(this, cloneInContext));
            gta.o();
            return cloneInContext2;
        } catch (Throwable th) {
            try {
                gta.o();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.fzb
    protected final /* bridge */ /* synthetic */ gmk d() {
        return new gma(this);
    }

    @Override // defpackage.fzb, defpackage.gln, defpackage.bd
    public final void e(Context context) {
        this.a.i();
        try {
            if (this.e) {
                throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.e(context);
            if (this.c == null) {
                fyr fyrVar = (fyr) hnu.bh(this, fyr.class);
                gty aA = hoq.aA(112, fyo.class, "CreatePeer");
                try {
                    this.c = fyrVar.p();
                    aA.close();
                } finally {
                }
            }
            gta.o();
        } catch (Throwable th) {
            try {
                gta.o();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.bd
    public final void f(Bundle bundle) {
        this.a.i();
        try {
            p(bundle);
            fyq z = z();
            if (bundle != null) {
                z.f = bundle.getBoolean("state_disc_visible", true);
            }
            bd bdVar = z.a;
            frv frvVar = z.b;
            bdVar.getClass();
            frvVar.getClass();
            try {
                by F = bdVar.F();
                F.getClass();
                fyl fylVar = (fyl) F.d("$TikTok$AccountScopedOGAccountMenuManagerProviderFragment");
                if (fylVar == null) {
                    fylVar = new fyl();
                    jqq.g(fylVar);
                    gmk.d(fylVar, frvVar);
                    ae aeVar = new ae(F);
                    aeVar.d(0, fylVar, "$TikTok$AccountScopedOGAccountMenuManagerProviderFragment", 1);
                    aeVar.c();
                }
                z.d = (dsf) fylVar.z().f;
                z.e = z.d.b;
                gta.o();
            } catch (Exception e) {
                if (!(e instanceof IllegalStateException) && !(e instanceof ClassCastException)) {
                    throw e;
                }
                throw new IllegalStateException("#getManager can only be invoked with an account Fragment. Use NonAccountScopedOGAccountMenuManagerProviderFragmentPeer if you want to attach the OneGoogle view to an non-account-scoped Fragment / Activity.", e);
            }
        } catch (Throwable th) {
            try {
                gta.o();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.bd
    public final void h() {
        gut b = this.a.b();
        try {
            q();
            this.e = true;
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

    @Override // defpackage.gln, defpackage.bd
    public final void i(Bundle bundle) {
        this.a.i();
        try {
            bundle.putBoolean("state_disc_visible", z().f);
            gta.o();
        } catch (Throwable th) {
            try {
                gta.o();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.gln, defpackage.bd
    public final void j() {
        this.a.i();
        try {
            r();
            fyq z = z();
            z.e.e(z.g);
            gta.o();
        } catch (Throwable th) {
            try {
                gta.o();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.gln, defpackage.bd
    public final void k() {
        this.a.i();
        try {
            aF();
            fyq z = z();
            z.e.f(z.g);
            gta.o();
        } catch (Throwable th) {
            try {
                gta.o();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.fzb, defpackage.bd
    public final Context x() {
        if (super.x() == null) {
            return null;
        }
        if (this.d == null) {
            this.d = new glx(this, super.x());
        }
        return this.d;
    }
}
