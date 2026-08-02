package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class glo extends faa implements guo, glw {
    protected final gsu b = new gsu(this);
    public final ael c = new ael(this);
    private final AtomicBoolean d = new AtomicBoolean(false);

    public glo() {
        fao.c();
    }

    public static final boolean aS(Intent intent, Context context) {
        if (intent.getPackage() == null || context == null) {
            return false;
        }
        return intent.getPackage().equals(context.getPackageName());
    }

    @Override // defpackage.faa, defpackage.bd
    public View I(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.b.d();
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
        return this.c;
    }

    @Override // defpackage.faa, defpackage.bd
    public final void V(Bundle bundle) {
        this.b.d();
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

    @Override // defpackage.faa, defpackage.bd
    public void W(int i, int i2, Intent intent) {
        gut a = this.b.a("Fragment:onActivityResult");
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

    @Override // defpackage.faa, defpackage.bd
    public final void Z() {
        gut c = this.b.c();
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
        this.b.h(i, i2);
        gta.o();
    }

    @Override // defpackage.bd
    public final void aB(int i, int i2) {
        gta.i();
        if (i != 0 || i2 != 0) {
            this.b.g(gvz.b(), true);
        }
        gta.o();
    }

    protected final void aF(int i, int i2, Intent intent) {
        super.W(i, i2, intent);
    }

    protected final void aG(Bundle bundle) {
        super.f(bundle);
    }

    @Override // defpackage.guo
    public final gvz aH() {
        return this.b.a;
    }

    @Override // defpackage.glw
    public final Locale aI() {
        return hnu.bj(this);
    }

    @Override // defpackage.guo
    public final void aJ(gvz gvzVar, boolean z) {
        this.b.g(gvzVar, z);
    }

    @Override // defpackage.guo
    public final void aK(gvz gvzVar) {
        this.b.b = gvzVar;
    }

    protected final void aL() {
        super.g();
    }

    protected final void aM() {
        super.h();
    }

    protected final void aN() {
        super.ac();
    }

    protected final void aO(Bundle bundle) {
        super.i(bundle);
    }

    protected final void aP(View view, Bundle bundle) {
        super.ad(view, bundle);
    }

    protected final void aQ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.I(layoutInflater, viewGroup, bundle);
    }

    protected final void aR(MenuItem menuItem) {
        super.as(menuItem);
    }

    @Override // defpackage.faa, defpackage.bd
    public final void aa() {
        this.b.d();
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

    @Override // defpackage.faa, defpackage.bd
    public void ac() {
        gut c = this.b.c();
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

    @Override // defpackage.faa, defpackage.bd
    public void ad(View view, Bundle bundle) {
        this.b.d();
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

    @Override // defpackage.faa, defpackage.bd
    public boolean as(MenuItem menuItem) {
        gut a = this.b.a("Fragment:onOptionsItemSelected");
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

    @Override // defpackage.bd
    public final void ay(Intent intent) {
        Context x = x();
        if (aS(intent, x == null ? null : x.getApplicationContext())) {
            gvx.k(intent);
        }
        super.ay(intent);
    }

    @Override // defpackage.bd
    public void e(Context context) {
        super.e(context);
        aeh aehVar = this.F;
        if (aehVar instanceof guo) {
            gsu gsuVar = this.b;
            if (gsuVar.a == null) {
                gsuVar.g(((guo) aehVar).aH(), true);
            }
        }
        gsu gsuVar2 = this.b;
        gsuVar2.f();
        if (this.d.compareAndSet(false, true)) {
            this.ag.a(new glr(gsuVar2, this.c));
        }
    }

    @Override // defpackage.faa, defpackage.bd
    public void f(Bundle bundle) {
        this.b.d();
        try {
            super.f(bundle);
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
    public void g() {
        gut c = this.b.c();
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

    @Override // defpackage.faa, defpackage.bd
    public void i(Bundle bundle) {
        this.b.d();
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

    @Override // defpackage.faa, defpackage.bd
    public final void j() {
        this.b.d();
        try {
            super.j();
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
    public final void k() {
        this.b.d();
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
}
