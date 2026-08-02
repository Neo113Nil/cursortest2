package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.authenticator2.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bqs extends brb implements gjg, gxy {
    private final brn aj = new brn((byte[]) null, (short[]) null);
    private bqw d;
    private Context e;
    private boolean f;

    @Override // defpackage.glo, defpackage.faa, defpackage.bd
    public final View I(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.b.i();
        try {
            aQ(layoutInflater, viewGroup, bundle);
            bqw z = z();
            z.f.g(R.id.local_accounts_with_consent, new bqj(z.u, z.i), new buz(z, 1));
            View inflate = layoutInflater.inflate(R.layout.edit_otp_fragment, viewGroup, false);
            if (inflate == null) {
                e.n(this, z());
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

    @Override // defpackage.brb, defpackage.faa, defpackage.bd
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

    @Override // defpackage.gjg
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bqw z() {
        bqw bqwVar = this.d;
        if (bqwVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.f) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return bqwVar;
    }

    @Override // defpackage.glo, defpackage.faa, defpackage.bd
    public final void ad(View view, Bundle bundle) {
        this.b.i();
        try {
            hoq.ad(this);
            z();
            e.n(this, z());
            aP(view, bundle);
            bqw z = z();
            bqs bqsVar = z.c;
            RecyclerView a = bqw.a(bqsVar);
            bqsVar.x();
            a.Y(new LinearLayoutManager(1));
            bqw.a(bqsVar).X(z.h);
            bqw.a(bqsVar).av(new jj(z.g));
            bqw.c(bqsVar).addTextChangedListener(new brf(z, 1));
            z.v.r(bqw.b(bqsVar), new bqp());
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

    @Override // defpackage.brb
    protected final /* bridge */ /* synthetic */ gmk d() {
        return new gma(this);
    }

    @Override // defpackage.brb, defpackage.glo, defpackage.bd
    public final void e(Context context) {
        this.b.i();
        try {
            if (this.f) {
                throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.e(context);
            if (this.d == null) {
                bqx bqxVar = (bqx) hnu.bh(this, bqx.class);
                gty aA = hoq.aA(9, bqs.class, "CreatePeer");
                try {
                    this.d = bqxVar.c();
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
            bqw z = z();
            gbi gbiVar = z.e;
            gbiVar.h(z.k);
            gbiVar.h(z.l);
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

    @Override // defpackage.brb, defpackage.bd
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
