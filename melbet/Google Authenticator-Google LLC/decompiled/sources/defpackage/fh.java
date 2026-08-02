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
public final class fh extends fg implements gb {
    public final gd a;
    private final Context b;
    private final ActionBarContextView c;
    private final ff f;
    private WeakReference g;
    private boolean h;

    public fh(Context context, ActionBarContextView actionBarContextView, ff ffVar) {
        this.b = context;
        this.c = actionBarContextView;
        this.f = ffVar;
        gd gdVar = new gd(actionBarContextView.getContext());
        gdVar.C();
        this.a = gdVar;
        gdVar.b = this;
    }

    @Override // defpackage.gb
    public final void F(gd gdVar) {
        g();
        this.c.o();
    }

    @Override // defpackage.gb
    public final boolean J(gd gdVar, MenuItem menuItem) {
        return this.f.b(this, menuItem);
    }

    @Override // defpackage.fg
    public final Menu a() {
        return this.a;
    }

    @Override // defpackage.fg
    public final MenuInflater b() {
        return new fm(this.c.getContext());
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
        return this.c.h;
    }

    @Override // defpackage.fg
    public final CharSequence e() {
        return this.c.g;
    }

    @Override // defpackage.fg
    public final void f() {
        if (this.h) {
            return;
        }
        this.h = true;
        this.f.a(this);
    }

    @Override // defpackage.fg
    public final void g() {
        this.f.d(this, this.a);
    }

    @Override // defpackage.fg
    public final void h(View view) {
        this.c.j(view);
        this.g = view != null ? new WeakReference(view) : null;
    }

    @Override // defpackage.fg
    public final void i(int i) {
        j(this.b.getString(i));
    }

    @Override // defpackage.fg
    public final void j(CharSequence charSequence) {
        this.c.k(charSequence);
    }

    @Override // defpackage.fg
    public final void k(int i) {
        l(this.b.getString(i));
    }

    @Override // defpackage.fg
    public final void l(CharSequence charSequence) {
        this.c.l(charSequence);
    }

    @Override // defpackage.fg
    public final void m(boolean z) {
        this.e = z;
        this.c.m(z);
    }

    @Override // defpackage.fg
    public final boolean n() {
        return this.c.j;
    }
}
