package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class ezy extends aij {
    protected final ezc c = new ezc();

    @Override // defpackage.aij, defpackage.bd
    public View I(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.c.f(bundle);
        return super.I(layoutInflater, viewGroup, bundle);
    }

    @Override // defpackage.bd
    public void V(Bundle bundle) {
        this.c.c(bundle);
        super.V(bundle);
    }

    @Override // defpackage.bd
    public void W(int i, int i2, Intent intent) {
        super.W(i, i2, intent);
        this.c.t();
    }

    @Override // defpackage.bd
    public void X(Activity activity) {
        this.c.g();
        super.X(activity);
    }

    @Override // defpackage.bd
    public final void Y(Menu menu, MenuInflater menuInflater) {
        if (this.c.x()) {
            aw();
        }
    }

    @Override // defpackage.bd
    public void Z() {
        this.c.a();
        super.Z();
    }

    @Override // defpackage.bd
    public final boolean aC() {
        return this.c.v();
    }

    @Override // defpackage.bd
    public final void aD() {
        this.c.A();
    }

    @Override // defpackage.bd
    public void aa() {
        this.c.b();
        super.aa();
    }

    @Override // defpackage.bd
    public final void ab(Menu menu) {
        if (this.c.z()) {
            aw();
        }
    }

    @Override // defpackage.bd
    public void ac() {
        exf.j(F());
        this.c.k();
        super.ac();
    }

    @Override // defpackage.aij, defpackage.bd
    public void ad(View view, Bundle bundle) {
        this.c.h(bundle);
        super.ad(view, bundle);
    }

    @Override // defpackage.aij, defpackage.bd
    public void f(Bundle bundle) {
        this.c.i(bundle);
        super.f(bundle);
    }

    @Override // defpackage.aij, defpackage.bd
    public void g() {
        this.c.d();
        super.g();
    }

    @Override // defpackage.bd
    public void h() {
        this.c.e();
        super.h();
    }

    @Override // defpackage.aij, defpackage.bd
    public void i(Bundle bundle) {
        this.c.l(bundle);
        super.i(bundle);
    }

    @Override // defpackage.aij, defpackage.bd
    public void j() {
        exf.j(F());
        this.c.m();
        super.j();
    }

    @Override // defpackage.aij, defpackage.bd
    public void k() {
        this.c.n();
        super.k();
    }

    @Override // defpackage.bd, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.c.u();
        super.onConfigurationChanged(configuration);
    }

    @Override // defpackage.bd, android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.c.w();
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // defpackage.bd, android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.c.j();
        super.onLowMemory();
    }
}
