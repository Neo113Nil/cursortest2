package defpackage;

import android.content.Context;
import android.support.v7.widget.ActionBarContextView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ek extends fg implements gb {
    public final gd a;
    public ff b;
    final /* synthetic */ el c;
    private final Context f;
    private WeakReference g;

    public ek(el elVar, Context context, ff ffVar) {
        this.c = elVar;
        this.f = context;
        this.b = ffVar;
        gd gdVar = new gd(context);
        gdVar.C();
        this.a = gdVar;
        gdVar.b = this;
    }

    @Override // defpackage.gb
    public final void F(gd gdVar) {
        if (this.b == null) {
            return;
        }
        g();
        this.c.d.o();
    }

    @Override // defpackage.gb
    public final boolean J(gd gdVar, MenuItem menuItem) {
        ff ffVar = this.b;
        if (ffVar != null) {
            return ffVar.b(this, menuItem);
        }
        return false;
    }

    @Override // defpackage.fg
    public final Menu a() {
        return this.a;
    }

    @Override // defpackage.fg
    public final MenuInflater b() {
        return new fm(this.f);
    }

    @Override // defpackage.fg
    public final View c() {
        WeakReference weakReference = this.g;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // defpackage.fg
    public final CharSequence d() {
        return this.c.d.h;
    }

    @Override // defpackage.fg
    public final CharSequence e() {
        return this.c.d.g;
    }

    @Override // defpackage.fg
    public final void f() {
        el elVar = this.c;
        if (elVar.f != this) {
            return;
        }
        if (el.z(elVar.k, false)) {
            this.b.a(this);
        } else {
            elVar.g = this;
            elVar.h = this.b;
        }
        this.b = null;
        elVar.w(false);
        ActionBarContextView actionBarContextView = elVar.d;
        if (actionBarContextView.i == null) {
            actionBarContextView.i();
        }
        elVar.b.k(elVar.m);
        elVar.f = null;
    }

    @Override // defpackage.fg
    public final void g() {
        if (this.c.f != this) {
            return;
        }
        gd gdVar = this.a;
        gdVar.s();
        try {
            this.b.d(this, gdVar);
        } finally {
            this.a.r();
        }
    }

    @Override // defpackage.fg
    public final void h(View view) {
        this.c.d.j(view);
        this.g = new WeakReference(view);
    }

    @Override // defpackage.fg
    public final void i(int i) {
        j(this.c.a.getResources().getString(i));
    }

    @Override // defpackage.fg
    public final void j(CharSequence charSequence) {
        this.c.d.k(charSequence);
    }

    @Override // defpackage.fg
    public final void k(int i) {
        l(this.c.a.getResources().getString(i));
    }

    @Override // defpackage.fg
    public final void l(CharSequence charSequence) {
        this.c.d.l(charSequence);
    }

    @Override // defpackage.fg
    public final void m(boolean z) {
        this.e = z;
        this.c.d.m(z);
    }

    @Override // defpackage.fg
    public final boolean n() {
        return this.c.d.j;
    }
}
