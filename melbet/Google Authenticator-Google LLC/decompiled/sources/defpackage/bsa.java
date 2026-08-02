package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.apps.authenticator2.R;
import com.google.android.material.tabs.TabLayout;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bsa extends brw implements gjg, gxy {
    private final brn aj = new brn((byte[]) null, (short[]) null);
    private bse d;
    private Context e;
    private boolean f;

    @Override // defpackage.glo, defpackage.faa, defpackage.bd
    public final View I(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.b.i();
        try {
            aQ(layoutInflater, viewGroup, bundle);
            z();
            View inflate = layoutInflater.inflate(R.layout.how_it_works_fragment, viewGroup, false);
            if (inflate == null) {
                e.l(this, z());
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

    @Override // defpackage.brw, defpackage.faa, defpackage.bd
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

    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.glo, defpackage.faa, defpackage.bd
    public final void ad(View view, Bundle bundle) {
        this.b.i();
        try {
            hoq.ad(this);
            z();
            e.l(this, z());
            aP(view, bundle);
            bse z = z();
            boolean z2 = z.a;
            if (z2) {
                bse.a((bsa) z.b).setText(R.string.get_started);
            }
            Object obj = z.b;
            ara araVar = new ara((bd) obj);
            araVar.j.a.add(new gws((brn) z.d));
            ViewPager2 b = bse.b((bsa) obj);
            kr krVar = b.e.l;
            ym ymVar = b.j;
            if (krVar != null) {
                krVar.s(((aro) ymVar).b);
            }
            if (krVar != null) {
                krVar.s(b.i);
            }
            b.e.X(araVar);
            b.b = 0;
            b.d();
            ym ymVar2 = b.j;
            ((aro) ymVar2).t();
            araVar.r(((aro) ymVar2).b);
            araVar.r(b.i);
            fqb fqbVar = new fqb((TabLayout) ((bd) obj).J().findViewById(R.id.tab_layout), bse.b((bsa) obj));
            if (fqbVar.d) {
                throw new IllegalStateException("TabLayoutMediator is already attached");
            }
            ViewPager2 viewPager2 = fqbVar.b;
            fqbVar.c = viewPager2.c();
            if (fqbVar.c == null) {
                throw new IllegalStateException("TabLayoutMediator attached before ViewPager2 has an adapter");
            }
            fqbVar.d = true;
            TabLayout tabLayout = fqbVar.a;
            fqbVar.e = new fqa(tabLayout);
            viewPager2.j(fqbVar.e);
            fqbVar.g = new bst(viewPager2);
            bst bstVar = fqbVar.g;
            ArrayList arrayList = tabLayout.A;
            if (!arrayList.contains(bstVar)) {
                arrayList.add(bstVar);
            }
            fqbVar.f = new fpz(fqbVar);
            fqbVar.c.r(fqbVar.f);
            fqbVar.a();
            tabLayout.h(viewPager2.b, 0.0f, true, true, true);
            ((brn) z.c).r(bse.a((bsa) obj), new brm(z2));
            ((bd) obj).E().f().b(((bd) obj).M(), new bsb(z));
            View J = ((bd) obj).J();
            boh bohVar = new boh(5);
            int i = yq.a;
            yi.c(J, bohVar);
            gta.o();
        } catch (Throwable th) {
            try {
                gta.o();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
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

    @Override // defpackage.brw
    protected final /* synthetic */ jqq d() {
        return new gmb(this);
    }

    @Override // defpackage.brw, defpackage.glo, defpackage.bd
    public final void e(Context context) {
        this.b.i();
        try {
            if (this.f) {
                throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.e(context);
            if (this.d == null) {
                bsf bsfVar = (bsf) hnu.bh(this, bsf.class);
                gty aA = hoq.aA(18, bsa.class, "CreatePeer");
                try {
                    this.d = bsfVar.b();
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
            z();
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

    @Override // defpackage.gjg
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public final bse z() {
        bse bseVar = this.d;
        if (bseVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.f) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return bseVar;
    }

    @Override // defpackage.brw, defpackage.bd
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
