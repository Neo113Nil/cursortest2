package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.authenticator2.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bza extends bzg implements gjg, gxy {
    private final brn aj = new brn((byte[]) null, (short[]) null);
    private bze d;
    private Context e;
    private boolean f;

    public static bza a(frv frvVar) {
        bza bzaVar = new bza();
        jqq.g(bzaVar);
        gmk.d(bzaVar, frvVar);
        return bzaVar;
    }

    @Override // defpackage.glo, defpackage.faa, defpackage.bd
    public final View I(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.b.i();
        try {
            aQ(layoutInflater, viewGroup, bundle);
            z();
            View inflate = layoutInflater.inflate(R.layout.import_fragment, viewGroup, false);
            if (inflate == null) {
                kt.D(this, z());
            }
            gta.o();
            return inflate;
        } catch (Throwable th) {
            try {
                gta.o();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.bzg, defpackage.faa, defpackage.bd
    public final void X(Activity activity) {
        this.b.i();
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

    @Override // defpackage.glo, defpackage.faa, defpackage.bd
    public final void ad(View view, Bundle bundle) {
        this.b.i();
        try {
            hoq.ad(this);
            z();
            kt.D(this, z());
            aP(view, bundle);
            bze z = z();
            brn brnVar = z.l;
            bza bzaVar = z.c;
            brnVar.r(bze.a(bzaVar), new bzd());
            TextView textView = (TextView) bzaVar.J().findViewById(R.id.instructions1);
            Context context = z.b;
            textView.setText(afg.g(context, R.string.instructions_step_1, "one", 1));
            ((TextView) bzaVar.J().findViewById(R.id.instructions2)).setText(afg.g(context, R.string.instructions_step_2, "two", 2));
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
        this.b.i();
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

    @Override // defpackage.gjg
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final bze z() {
        bze bzeVar = this.d;
        if (bzeVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.f) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return bzeVar;
    }

    @Override // defpackage.bzg, defpackage.glo, defpackage.bd
    public final void e(Context context) {
        this.b.i();
        try {
            if (this.f) {
                throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.e(context);
            if (this.d == null) {
                bzf bzfVar = (bzf) hnu.bh(this, bzf.class);
                gty aA = hoq.aA(47, bza.class, "CreatePeer");
                try {
                    this.d = bzfVar.m();
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

    @Override // defpackage.glo, defpackage.faa, defpackage.bd
    public final void f(Bundle bundle) {
        this.b.i();
        try {
            aG(bundle);
            bze z = z();
            gbi gbiVar = z.f;
            gbiVar.h(z.h);
            gbiVar.h(z.k);
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

    @Override // defpackage.glo, defpackage.faa, defpackage.bd
    public final void g() {
        gut c = this.b.c();
        try {
            aL();
            if (this.R == null) {
                this.aj.q();
            }
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

    @Override // defpackage.faa, defpackage.bd
    public final void h() {
        gut b = this.b.b();
        try {
            aM();
            this.f = true;
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

    @Override // defpackage.gxy
    public final gxv n(gxq gxqVar) {
        return this.aj.o(gxqVar);
    }

    @Override // defpackage.gxy
    public final void o(Class cls, gxu gxuVar) {
        this.aj.p(cls, gxuVar);
    }

    @Override // defpackage.bzg
    protected final /* bridge */ /* synthetic */ gmk p() {
        return new gma(this);
    }

    @Override // defpackage.bzg, defpackage.bd
    public final Context x() {
        if (super.x() == null) {
            return null;
        }
        if (this.e == null) {
            this.e = new glx(this, super.x());
        }
        return this.e;
    }
}
