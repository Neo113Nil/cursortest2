package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class faa extends bd {
    protected final ezc a = new ezc();

    @Override // defpackage.bd
    public View I(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.a.f(bundle);
        return null;
    }

    @Override // defpackage.bd
    public void V(Bundle bundle) {
        this.a.c(bundle);
        super.V(bundle);
    }

    @Override // defpackage.bd
    public void W(int i, int i2, Intent intent) {
        super.W(i, i2, intent);
        this.a.t();
    }

    @Override // defpackage.bd
    public void X(Activity activity) {
        this.a.g();
        super.X(activity);
    }

    @Override // defpackage.bd
    public void Y(Menu menu, MenuInflater menuInflater) {
        if (this.a.x()) {
            aw();
        }
    }

    @Override // defpackage.bd
    public void Z() {
        this.a.a();
        super.Z();
    }

    @Override // defpackage.bd
    public final boolean aC() {
        return this.a.v();
    }

    @Override // defpackage.bd
    public final void aD() {
        this.a.A();
    }

    @Override // defpackage.bd
    public void aa() {
        this.a.b();
        super.aa();
    }

    @Override // defpackage.bd
    public void ab(Menu menu) {
        if (this.a.z()) {
            aw();
        }
    }

    @Override // defpackage.bd
    public void ac() {
        this.a.k();
        super.ac();
    }

    @Override // defpackage.bd
    public void ad(View view, Bundle bundle) {
        this.a.h(bundle);
    }

    @Override // defpackage.bd
    public boolean as(MenuItem menuItem) {
        return this.a.y();
    }

    @Override // defpackage.bd
    public void f(Bundle bundle) {
        this.a.i(bundle);
        super.f(bundle);
    }

    @Override // defpackage.bd
    public void g() {
        this.a.d();
        super.g();
    }

    @Override // defpackage.bd
    public void h() {
        this.a.e();
        super.h();
    }

    @Override // defpackage.bd
    public void i(Bundle bundle) {
        this.a.l(bundle);
    }

    @Override // defpackage.bd
    public void j() {
        this.a.m();
        super.j();
    }

    @Override // defpackage.bd
    public void k() {
        this.a.n();
        super.k();
    }

    @Override // defpackage.bd, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.a.u();
        super.onConfigurationChanged(configuration);
    }

    @Override // defpackage.bd, android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.a.w();
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // defpackage.bd, android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.a.j();
        super.onLowMemory();
    }
}
