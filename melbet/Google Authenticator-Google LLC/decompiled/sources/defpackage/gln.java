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
public class gln extends bd implements guo, glw {
    protected final gsu a;
    protected final ael b;
    private final AtomicBoolean c;

    public gln() {
        fao.c();
        this.a = new gsu(this);
        this.b = new ael(this);
        this.c = new AtomicBoolean(false);
    }

    @Override // defpackage.bd
    public final View I(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        ixf.j(this.a.d(), null);
        return null;
    }

    @Override // defpackage.bd, defpackage.aer
    public final ael L() {
        return this.b;
    }

    @Override // defpackage.bd
    public final void V(Bundle bundle) {
        gut d = this.a.d();
        try {
            super.V(bundle);
            ixf.j(d, null);
        } finally {
        }
    }

    @Override // defpackage.bd
    public final void W(int i, int i2, Intent intent) {
        gut a = this.a.a("Fragment:onActivityResult");
        try {
            super.W(i, i2, intent);
            ixf.j(a, null);
        } finally {
        }
    }

    @Override // defpackage.bd
    public final void Z() {
        gut c = this.a.c();
        try {
            super.Z();
            ixf.j(c, null);
        } finally {
        }
    }

    @Override // defpackage.bd
    public final void aA(int i, int i2) {
        ixf.j(this.a.h(i, i2), null);
    }

    @Override // defpackage.bd
    public final void aB(int i, int i2) {
        ixf.j(this.a.h(i, i2), null);
    }

    protected final void aF() {
        super.k();
    }

    @Override // defpackage.guo
    public final gvz aH() {
        return this.a.a;
    }

    @Override // defpackage.glw
    public final Locale aI() {
        return hnu.bj(this);
    }

    @Override // defpackage.guo
    public final void aJ(gvz gvzVar, boolean z) {
        this.a.g(gvzVar, z);
    }

    @Override // defpackage.guo
    public final void aK(gvz gvzVar) {
        this.a.b = gvzVar;
    }

    @Override // defpackage.bd
    public final void aa() {
        gut d = this.a.d();
        try {
            super.aa();
            ixf.j(d, null);
        } finally {
        }
    }

    @Override // defpackage.bd
    public final void ac() {
        gut c = this.a.c();
        try {
            super.ac();
            ixf.j(c, null);
        } finally {
        }
    }

    @Override // defpackage.bd
    public final void ad(View view, Bundle bundle) {
        view.getClass();
        ixf.j(this.a.d(), null);
    }

    @Override // defpackage.bd
    public final boolean as(MenuItem menuItem) {
        ixf.j(this.a.a("Fragment:onOptionsItemSelected"), null);
        return false;
    }

    @Override // defpackage.bd
    public void e(Context context) {
        super.e(context);
        aeh aehVar = this.F;
        if (aehVar instanceof guo) {
            gsu gsuVar = this.a;
            if (gsuVar.a == null) {
                gsuVar.g(((guo) aehVar).aH(), true);
            }
        }
        gsu gsuVar2 = this.a;
        gsuVar2.f();
        if (this.c.compareAndSet(false, true)) {
            this.ag.a(new glr(gsuVar2, this.b));
        }
    }

    @Override // defpackage.bd
    public final void g() {
        gut c = this.a.c();
        try {
            super.g();
            ixf.j(c, null);
        } finally {
        }
    }

    @Override // defpackage.bd
    public void i(Bundle bundle) {
        ixf.j(this.a.d(), null);
    }

    @Override // defpackage.bd
    public void j() {
        gut d = this.a.d();
        try {
            super.j();
            ixf.j(d, null);
        } finally {
        }
    }

    @Override // defpackage.bd
    public void k() {
        gut d = this.a.d();
        try {
            super.k();
            ixf.j(d, null);
        } finally {
        }
    }

    protected final void p(Bundle bundle) {
        super.f(bundle);
    }

    protected final void q() {
        super.h();
    }

    protected final void r() {
        super.j();
    }
}
