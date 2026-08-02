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
public final class bxx extends byw implements gjg, gxy {
    private final brn aj = new brn((byte[]) null, (short[]) null);
    private bya d;
    private Context e;
    private boolean f;

    public static bxx a(frv frvVar) {
        bxx bxxVar = new bxx();
        jqq.g(bxxVar);
        gmk.d(bxxVar, frvVar);
        return bxxVar;
    }

    @Override // defpackage.glo, defpackage.faa, defpackage.bd
    public final View I(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.b.i();
        try {
            aQ(layoutInflater, viewGroup, bundle);
            bya z = z();
            z.e.g(R.id.read_otps_from_local_db, new btf(z.d, 7), new buz(z, 7));
            View inflate = layoutInflater.inflate(R.layout.export_fragment, viewGroup, false);
            if (inflate == null) {
                e.i(this, z());
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

    @Override // defpackage.byw, defpackage.faa, defpackage.bd
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
            e.i(this, z());
            aP(view, bundle);
            bya z = z();
            bxx bxxVar = z.b;
            RecyclerView a = bya.a(bxxVar);
            Context context = z.c;
            a.Y(new LinearLayoutManager(1));
            bya.a(bxxVar).X(z.f);
            bya.a(bxxVar).av(new jj(context));
            z.j.r(bya.b(bxxVar), new bxz());
            if (bundle != null && bundle.getBoolean("noOtpsToExport", false)) {
                z.c();
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
    public final bya z() {
        bya byaVar = this.d;
        if (byaVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.f) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return byaVar;
    }

    @Override // defpackage.byw, defpackage.glo, defpackage.bd
    public final void e(Context context) {
        this.b.i();
        try {
            if (this.f) {
                throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.e(context);
            if (this.d == null) {
                byc bycVar = (byc) hnu.bh(this, byc.class);
                gty aA = hoq.aA(44, bxx.class, "CreatePeer");
                try {
                    this.d = bycVar.j();
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

    @Override // defpackage.glo, defpackage.faa, defpackage.bd
    public final void i(Bundle bundle) {
        this.b.i();
        try {
            aO(bundle);
            bundle.putBoolean("noOtpsToExport", z().h);
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

    @Override // defpackage.gxy
    public final gxv n(gxq gxqVar) {
        return this.aj.o(gxqVar);
    }

    @Override // defpackage.gxy
    public final void o(Class cls, gxu gxuVar) {
        this.aj.p(cls, gxuVar);
    }

    @Override // defpackage.byw
    protected final /* bridge */ /* synthetic */ gmk p() {
        return new gma(this);
    }

    @Override // defpackage.byw, defpackage.bd
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
