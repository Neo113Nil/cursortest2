package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.authenticator2.R;
import com.google.android.libraries.onegoogle.expresssignin.ExpressSignInLayout;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fzi extends fzr implements gjg, glw, guo {
    private fzp aj;
    private Context ak;
    private boolean am;
    private final ael an = new ael(this);
    private final gsu al = new gsu(this);

    @Deprecated
    public fzi() {
        fao.c();
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [eef, java.lang.Object] */
    @Override // defpackage.bd
    public final View I(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Object obj;
        this.al.i();
        try {
            fzp z = z();
            View inflate = layoutInflater.inflate(R.layout.express_sign_in_fragment, viewGroup, false);
            ExpressSignInLayout expressSignInLayout = (ExpressSignInLayout) inflate.findViewById(R.id.express_sign_in_layout);
            aeh aehVar = z.e;
            hoq.I(aehVar instanceof gjg, "Given class does not have a peer");
            fzs fzsVar = ((fzc) ((gjg) aehVar).z()).b;
            eed eedVar = z.k;
            fem femVar = new fem();
            femVar.b(eej.a().a());
            femVar.a = new gxb(z.t, new fzj(z));
            femVar.b(fzsVar.a);
            ?? r5 = femVar.a;
            if (r5 != 0 && (obj = femVar.b) != null) {
                expressSignInLayout.a(eedVar, new eeg(r5, (eej) obj));
                Object obj2 = ((gzs) fzsVar.b).a;
                expressSignInLayout.addView(layoutInflater.inflate(R.layout.express_sign_in_background, viewGroup, false));
                gpj gpjVar = z.p;
                fyh fyhVar = z.i;
                gel gelVar = z.d;
                fao.c();
                ((gbf) gpjVar.a).execute(new gbm(gpjVar, fyhVar, gelVar, 3, null));
                gta.o();
                return inflate;
            }
            StringBuilder sb = new StringBuilder();
            if (femVar.a == null) {
                sb.append(" onContinueWithAccountListenerWithAsyncCallback");
            }
            if (femVar.b == null) {
                sb.append(" features");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
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

    @Override // defpackage.bd, defpackage.aer
    public final ael L() {
        return this.an;
    }

    @Override // defpackage.bd
    public final void V(Bundle bundle) {
        this.al.i();
        try {
            super.V(bundle);
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
    public final void W(int i, int i2, Intent intent) {
        gut a = this.al.a("Fragment:onActivityResult");
        try {
            super.W(i, i2, intent);
            fzp z = z();
            if (i == 29878) {
                z.a();
            }
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

    @Override // defpackage.fzr, defpackage.bd
    public final void X(Activity activity) {
        this.al.i();
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

    @Override // defpackage.bd
    public final void Z() {
        gut c = this.al.c();
        try {
            super.Z();
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

    @Override // defpackage.bd
    public final void aA(int i, int i2) {
        this.al.h(i, i2);
        gta.o();
    }

    @Override // defpackage.gjg
    /* renamed from: aF, reason: merged with bridge method [inline-methods] */
    public final fzp z() {
        fzp fzpVar = this.aj;
        if (fzpVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.am) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return fzpVar;
    }

    @Override // defpackage.fzr
    protected final /* synthetic */ jqq aG() {
        return new gmb(this);
    }

    @Override // defpackage.guo
    public final gvz aH() {
        return this.al.a;
    }

    @Override // defpackage.glw
    public final Locale aI() {
        return hnu.bj(this);
    }

    @Override // defpackage.guo
    public final void aJ(gvz gvzVar, boolean z) {
        this.al.g(gvzVar, z);
    }

    @Override // defpackage.guo
    public final void aK(gvz gvzVar) {
        this.al.b = gvzVar;
    }

    @Override // defpackage.bd
    public final void aa() {
        this.al.i();
        try {
            super.aa();
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
    public final void ac() {
        gut c = this.al.c();
        try {
            super.ac();
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

    @Override // defpackage.bd
    public final void ad(View view, Bundle bundle) {
        this.al.i();
        gta.o();
    }

    @Override // defpackage.bd
    public final boolean as(MenuItem menuItem) {
        this.al.a("Fragment:onOptionsItemSelected").close();
        return false;
    }

    @Override // defpackage.fzr, defpackage.ar, defpackage.bd
    public final LayoutInflater bv(Bundle bundle) {
        this.al.i();
        try {
            LayoutInflater bv = super.bv(bundle);
            LayoutInflater cloneInContext = bv.cloneInContext(new glx(this, bv));
            gta.o();
            return cloneInContext;
        } catch (Throwable th) {
            try {
                gta.o();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.fzr, defpackage.ar, defpackage.bd
    public final void e(Context context) {
        this.al.i();
        try {
            if (this.am) {
                throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.e(context);
            if (this.aj == null) {
                fzq fzqVar = (fzq) hnu.bh(this, fzq.class);
                gty aA = hoq.aA(117, fzi.class, "CreatePeer");
                try {
                    this.aj = fzqVar.g();
                    aA.close();
                    this.ag.a(new glr(this.al, this.an));
                } finally {
                }
            }
            aeh aehVar = this.F;
            if (aehVar instanceof guo) {
                gsu gsuVar = this.al;
                if (gsuVar.a == null) {
                    gsuVar.g(((guo) aehVar).aH(), true);
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

    @Override // defpackage.ar, defpackage.bd
    public final void f(Bundle bundle) {
        this.al.i();
        try {
            super.f(bundle);
            fzp z = z();
            if (bundle != null) {
                z.l.b.f.c = bundle.getString(eee.a);
            }
            gbi gbiVar = z.g;
            gbiVar.h(z.b);
            gbiVar.h(z.c);
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

    @Override // defpackage.ar, defpackage.bd
    public final void g() {
        gut c = this.al.c();
        try {
            super.g();
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

    @Override // defpackage.ar, defpackage.bd
    public final void h() {
        gut b = this.al.b();
        try {
            super.h();
            this.am = true;
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

    @Override // defpackage.ar, defpackage.bd
    public final void i(Bundle bundle) {
        this.al.i();
        try {
            super.i(bundle);
            eed eedVar = z().l.b;
            Object a = eedVar.a.a();
            if (a != null) {
                bundle.putString(eee.a, eedVar.e.a.c(a));
            } else {
                bundle.remove(eee.a);
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

    @Override // defpackage.ar, defpackage.bd
    public final void j() {
        this.al.i();
        try {
            super.j();
            hoq.ah(this);
            if (this.d) {
                hoq.ag(this);
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

    @Override // defpackage.ar, defpackage.bd
    public final void k() {
        this.al.i();
        try {
            super.k();
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

    @Override // defpackage.ar, defpackage.bd
    public final void l(Bundle bundle) {
        this.al.i();
        try {
            super.l(bundle);
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

    @Override // defpackage.ar, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.al.e("DialogFragment:onCancel").close();
    }

    @Override // defpackage.ar, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        gut e = this.al.e("DialogFragment:onDismiss");
        try {
            super.onDismiss(dialogInterface);
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

    @Override // defpackage.fzr, defpackage.bd
    public final Context x() {
        if (super.x() == null) {
            return null;
        }
        if (this.ak == null) {
            this.ak = new glx(this, super.x());
        }
        return this.ak;
    }
}
