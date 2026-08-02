package defpackage;

import android.app.Activity;
import android.content.DialogInterface;
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
public class ezz extends ar {
    protected final ezc aj = new ezc();

    @Override // defpackage.bd
    public View I(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.aj.f(bundle);
        return null;
    }

    @Override // defpackage.bd
    public void V(Bundle bundle) {
        this.aj.c(bundle);
        super.V(bundle);
    }

    @Override // defpackage.bd
    public void W(int i, int i2, Intent intent) {
        super.W(i, i2, intent);
        this.aj.t();
    }

    @Override // defpackage.bd
    public void X(Activity activity) {
        this.aj.g();
        super.X(activity);
    }

    @Override // defpackage.bd
    public final void Y(Menu menu, MenuInflater menuInflater) {
        if (this.aj.x()) {
            aw();
        }
    }

    @Override // defpackage.bd
    public void Z() {
        this.aj.a();
        super.Z();
    }

    @Override // defpackage.bd
    public final boolean aC() {
        return this.aj.v();
    }

    @Override // defpackage.bd
    public final void aD() {
        this.aj.A();
    }

    @Override // defpackage.bd
    public void aa() {
        this.aj.b();
        super.aa();
    }

    @Override // defpackage.bd
    public final void ab(Menu menu) {
        if (this.aj.z()) {
            aw();
        }
    }

    @Override // defpackage.bd
    public void ac() {
        exf.j(F());
        this.aj.k();
        super.ac();
    }

    @Override // defpackage.bd
    public void ad(View view, Bundle bundle) {
        this.aj.h(bundle);
    }

    @Override // defpackage.bd
    public boolean as(MenuItem menuItem) {
        return this.aj.y();
    }

    @Override // defpackage.ar, defpackage.bd
    public void f(Bundle bundle) {
        this.aj.i(bundle);
        super.f(bundle);
    }

    @Override // defpackage.ar, defpackage.bd
    public void g() {
        this.aj.d();
        super.g();
    }

    @Override // defpackage.ar, defpackage.bd
    public void h() {
        this.aj.e();
        super.h();
    }

    @Override // defpackage.ar, defpackage.bd
    public void i(Bundle bundle) {
        this.aj.l(bundle);
        super.i(bundle);
    }

    @Override // defpackage.ar, defpackage.bd
    public void j() {
        exf.j(F());
        this.aj.m();
        super.j();
    }

    @Override // defpackage.ar, defpackage.bd
    public void k() {
        this.aj.n();
        super.k();
    }

    @Override // defpackage.bd, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.aj.u();
        super.onConfigurationChanged(configuration);
    }

    @Override // defpackage.bd, android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.aj.w();
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // defpackage.ar, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        exf.k();
        ezc ezcVar = this.aj;
        try {
            if (ezcVar.a == null) {
                eyt eytVar = new eyt(3);
                ezcVar.p(eytVar);
                ezcVar.a = eytVar;
            }
            exf.k();
            super.onDismiss(dialogInterface);
        } catch (Throwable th) {
            exf.k();
            throw th;
        }
    }

    @Override // defpackage.bd, android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.aj.j();
        super.onLowMemory();
    }
}
