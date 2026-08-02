package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.authenticator2.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bsg extends brx implements gjg {
    private bsh d;
    private Context e;
    private boolean f;

    @Override // defpackage.glo, defpackage.faa, defpackage.bd
    public final View I(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.b.i();
        try {
            aQ(layoutInflater, viewGroup, bundle);
            z();
            View inflate = layoutInflater.inflate(R.layout.how_it_works_page_fragment, viewGroup, false);
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

    @Override // defpackage.brx, defpackage.faa, defpackage.bd
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
            aP(view, bundle);
            bsh z = z();
            int i = z.a;
            if (i == 0) {
                Object obj = z.b;
                bsh.c((bsg) obj).setText(R.string.title0);
                bsh.b((bsg) obj).setText(R.string.description0);
                bsh.a((bsg) obj).setImageResource(R.drawable.warm_welcome0);
            } else if (i == 1) {
                Object obj2 = z.b;
                bsh.c((bsg) obj2).setText(R.string.title1);
                bsh.b((bsg) obj2).setText(R.string.description1);
                bsh.a((bsg) obj2).setImageResource(R.drawable.warm_welcome1);
            } else if (i == 2) {
                Object obj3 = z.b;
                bsh.c((bsg) obj3).setText(R.string.title2);
                bsh.b((bsg) obj3).setText(R.string.description2);
                bsh.a((bsg) obj3).setImageResource(R.drawable.warm_welcome2);
            } else if (i == 3) {
                Object obj4 = z.b;
                bsh.c((bsg) obj4).setText(R.string.title3);
                bsh.b((bsg) obj4).setText(R.string.description3);
                bsh.a((bsg) obj4).setImageResource(R.drawable.warm_welcome3);
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
            LayoutInflater cloneInContext = at.cloneInContext(new jrg(at, this));
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

    @Override // defpackage.brx
    protected final /* synthetic */ jqq d() {
        return new gmb(this);
    }

    @Override // defpackage.brx, defpackage.glo, defpackage.bd
    public final void e(Context context) {
        this.b.i();
        try {
            if (this.f) {
                throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.e(context);
            if (this.d == null) {
                bsi bsiVar = (bsi) hnu.bh(this, bsi.class);
                gty aA = hoq.aA(19, bsg.class, "CreatePeer");
                try {
                    this.d = bsiVar.c();
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

    @Override // defpackage.gjg
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public final bsh z() {
        bsh bshVar = this.d;
        if (bshVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.f) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return bshVar;
    }

    @Override // defpackage.brx, defpackage.bd
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
