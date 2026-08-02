package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fyl extends fza implements gjg {
    private fym c;
    private Context d;
    private boolean e;

    @Override // defpackage.fza, defpackage.bd
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
    public final fym z() {
        fym fymVar = this.c;
        if (fymVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.e) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return fymVar;
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

    @Override // defpackage.fza
    protected final /* bridge */ /* synthetic */ gmk d() {
        return new gma(this);
    }

    @Override // defpackage.fza, defpackage.gln, defpackage.bd
    public final void e(Context context) {
        this.a.i();
        try {
            if (this.e) {
                throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.e(context);
            if (this.c == null) {
                fyn fynVar = (fyn) hnu.bh(this, fyn.class);
                gty aA = hoq.aA(111, fyl.class, "CreatePeer");
                try {
                    this.c = fynVar.o();
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

    /* JADX WARN: Type inference failed for: r5v0, types: [gel, java.lang.Object] */
    @Override // defpackage.bd
    public final void f(Bundle bundle) {
        this.a.i();
        try {
            p(bundle);
            fym z = z();
            if (bundle == null) {
                Object obj = z.d;
                Object obj2 = z.a;
                boolean z2 = true;
                hoq.I(!((fyx) obj).a.L().c.a(aek.c), "setInitialActiveAccount should only be invoked before or during #onCreate!");
                if (((fyx) obj).f != null) {
                    z2 = false;
                }
                hoq.I(z2, "activeAccount has already been set!");
                ((fyx) obj).f = (frv) obj2;
            }
            Object obj3 = z.b;
            gdn a = ((fug) z.c).a();
            geh gehVar = geh.SAME_DAY;
            ?? r5 = z.e;
            fao.c();
            ((gbf) ((gpj) obj3).a).execute(new fv((gpj) obj3, a, gehVar, (gel) r5, 8));
            gta.o();
        } finally {
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

    @Override // defpackage.fza, defpackage.bd
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
