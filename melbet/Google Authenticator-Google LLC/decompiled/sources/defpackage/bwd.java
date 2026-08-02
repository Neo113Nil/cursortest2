package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.authenticator2.R;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bwd extends bwn implements gjg, glw, guo {
    private bwg ak;
    private Context al;
    private boolean an;
    private final ael ao = new ael(this);
    private final gsu am = new gsu(this);

    @Deprecated
    public bwd() {
        fao.c();
    }

    @Override // defpackage.ezz, defpackage.bd
    public final View I(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.am.i();
        try {
            super.I(layoutInflater, viewGroup, bundle);
            gta.o();
            return null;
        } catch (Throwable th) {
            try {
                gta.o();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.bd, defpackage.aer
    public final ael L() {
        return this.ao;
    }

    @Override // defpackage.ezz, defpackage.bd
    public final void V(Bundle bundle) {
        this.am.i();
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

    @Override // defpackage.ezz, defpackage.bd
    public final void W(int i, int i2, Intent intent) {
        gut a = this.am.a("Fragment:onActivityResult");
        try {
            super.W(i, i2, intent);
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

    @Override // defpackage.bwn, defpackage.ezz, defpackage.bd
    public final void X(Activity activity) {
        this.am.i();
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

    @Override // defpackage.ezz, defpackage.bd
    public final void Z() {
        gut c = this.am.c();
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

    @Override // defpackage.ar
    public final Dialog a(Bundle bundle) {
        super.a(bundle);
        bwg z = z();
        fhm fhmVar = new fhm(((bd) z.a).y(), R.style.ThemeOverlay_Authenticator_OsmosisImportDialog);
        fhmVar.s(R.string.staged_import_dialog_title);
        fhmVar.l(R.string.staged_import_dialog_message);
        fhmVar.q(R.string.staged_import_dialog_positive_button, z.a(1));
        fhmVar.n(R.string.staged_import_dialog_negative_button, z.a(2));
        DialogInterface.OnClickListener a = z.a(3);
        db dbVar = fhmVar.a;
        dbVar.l = dbVar.a.getText(R.string.staged_import_dialog_neutral_button);
        dbVar.m = a;
        dg b = fhmVar.b();
        b.setCanceledOnTouchOutside(true);
        return b;
    }

    @Override // defpackage.bd
    public final void aA(int i, int i2) {
        this.am.h(i, i2);
        gta.o();
    }

    @Override // defpackage.gjg
    /* renamed from: aF, reason: merged with bridge method [inline-methods] */
    public final bwg z() {
        bwg bwgVar = this.ak;
        if (bwgVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.an) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return bwgVar;
    }

    @Override // defpackage.bwn
    protected final /* bridge */ /* synthetic */ gmk aG() {
        return new gma(this);
    }

    @Override // defpackage.guo
    public final gvz aH() {
        return this.am.a;
    }

    @Override // defpackage.glw
    public final Locale aI() {
        return hnu.bj(this);
    }

    @Override // defpackage.guo
    public final void aJ(gvz gvzVar, boolean z) {
        this.am.g(gvzVar, z);
    }

    @Override // defpackage.guo
    public final void aK(gvz gvzVar) {
        this.am.b = gvzVar;
    }

    @Override // defpackage.ezz, defpackage.bd
    public final void aa() {
        this.am.i();
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

    @Override // defpackage.ezz, defpackage.bd
    public final void ac() {
        gut c = this.am.c();
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

    @Override // defpackage.ezz, defpackage.bd
    public final void ad(View view, Bundle bundle) {
        this.am.i();
        try {
            super.ad(view, bundle);
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

    @Override // defpackage.ezz, defpackage.bd
    public final boolean as(MenuItem menuItem) {
        gut a = this.am.a("Fragment:onOptionsItemSelected");
        try {
            boolean as = super.as(menuItem);
            a.close();
            return as;
        } catch (Throwable th) {
            try {
                a.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.bwn, defpackage.ar, defpackage.bd
    public final LayoutInflater bv(Bundle bundle) {
        this.am.i();
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

    @Override // defpackage.bwn, defpackage.ar, defpackage.bd
    public final void e(Context context) {
        this.am.i();
        try {
            if (this.an) {
                throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.e(context);
            if (this.ak == null) {
                bwh bwhVar = (bwh) hnu.bh(this, bwh.class);
                gty aA = hoq.aA(36, bwd.class, "CreatePeer");
                try {
                    this.ak = bwhVar.g();
                    aA.close();
                    this.ag.a(new glr(this.am, this.ao));
                } finally {
                }
            }
            aeh aehVar = this.F;
            if (aehVar instanceof guo) {
                gsu gsuVar = this.am;
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

    @Override // defpackage.ezz, defpackage.ar, defpackage.bd
    public final void f(Bundle bundle) {
        this.am.i();
        try {
            super.f(bundle);
            ((ar) z().a).r();
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

    @Override // defpackage.ezz, defpackage.ar, defpackage.bd
    public final void g() {
        gut c = this.am.c();
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

    @Override // defpackage.ezz, defpackage.ar, defpackage.bd
    public final void h() {
        gut b = this.am.b();
        try {
            super.h();
            this.an = true;
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

    @Override // defpackage.ezz, defpackage.ar, defpackage.bd
    public final void i(Bundle bundle) {
        this.am.i();
        try {
            super.i(bundle);
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

    @Override // defpackage.ezz, defpackage.ar, defpackage.bd
    public final void j() {
        this.am.i();
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

    @Override // defpackage.ezz, defpackage.ar, defpackage.bd
    public final void k() {
        this.am.i();
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
        this.am.i();
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
        gut e = this.am.e("DialogFragment:onCancel");
        try {
            hoq.Z(new bwf(4), (ar) z().a);
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

    @Override // defpackage.ezz, defpackage.ar, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        gut e = this.am.e("DialogFragment:onDismiss");
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

    @Override // defpackage.bwn, defpackage.bd
    public final Context x() {
        if (super.x() == null) {
            return null;
        }
        if (this.al == null) {
            this.al = new glx(this, super.x());
        }
        return this.al;
    }
}
