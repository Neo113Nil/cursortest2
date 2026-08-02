package defpackage;

import android.content.Context;
import android.support.v7.widget.ActionMenuView;
import android.support.v7.widget.Toolbar;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.Window;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ef extends cs {
    public final Window.Callback a;
    boolean b;
    public final mk c;
    final kee d;
    private boolean e;
    private boolean f;
    private final ArrayList g = new ArrayList();
    private final Runnable h = new bo(this, 6, null);
    private final kee i;

    public ef(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        kee keeVar = new kee(this);
        this.i = keeVar;
        mk mkVar = new mk(toolbar, false);
        this.c = mkVar;
        tw.F(callback);
        this.a = callback;
        mkVar.d = callback;
        toolbar.y = keeVar;
        mkVar.j(charSequence);
        this.d = new kee(this);
    }

    @Override // defpackage.cs
    public final int a() {
        return this.c.b;
    }

    @Override // defpackage.cs
    public final Context b() {
        return this.c.a();
    }

    @Override // defpackage.cs
    public final void d(boolean z) {
        if (z == this.f) {
            return;
        }
        this.f = z;
        ArrayList arrayList = this.g;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((cr) arrayList.get(i)).a();
        }
    }

    @Override // defpackage.cs
    public final void e() {
        this.c.a.removeCallbacks(this.h);
    }

    @Override // defpackage.cs
    public final void g(int i) {
        this.c.g(i);
    }

    @Override // defpackage.cs
    public final void i(int i) {
        mk mkVar = this.c;
        mkVar.h(mkVar.a().getText(i));
    }

    @Override // defpackage.cs
    public final void j(CharSequence charSequence) {
        this.c.h(charSequence);
    }

    @Override // defpackage.cs
    public final void k(CharSequence charSequence) {
        this.c.j(charSequence);
    }

    @Override // defpackage.cs
    public final boolean l() {
        return this.c.l();
    }

    @Override // defpackage.cs
    public final boolean m() {
        mk mkVar = this.c;
        if (!mkVar.k()) {
            return false;
        }
        mkVar.b();
        return true;
    }

    @Override // defpackage.cs
    public final boolean n() {
        Toolbar toolbar = this.c.a;
        Runnable runnable = this.h;
        toolbar.removeCallbacks(runnable);
        int i = yq.a;
        toolbar.postOnAnimation(runnable);
        return true;
    }

    @Override // defpackage.cs
    public final boolean o(int i, KeyEvent keyEvent) {
        Menu w = w();
        if (w == null) {
            return false;
        }
        w.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return w.performShortcut(i, keyEvent, 0);
    }

    @Override // defpackage.cs
    public final boolean p(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            q();
        }
        return true;
    }

    @Override // defpackage.cs
    public final boolean q() {
        return this.c.n();
    }

    @Override // defpackage.cs
    public final void s() {
        x(2, 2);
    }

    @Override // defpackage.cs
    public final void t() {
        x(0, 8);
    }

    @Override // defpackage.cs
    public final void u() {
        this.c.e(null);
    }

    @Override // defpackage.cs
    public final void v() {
        x(4, 4);
    }

    public final Menu w() {
        if (!this.e) {
            mk mkVar = this.c;
            ee eeVar = new ee(this);
            ho hoVar = new ho(this, 1);
            Toolbar toolbar = mkVar.a;
            toolbar.u = eeVar;
            toolbar.v = hoVar;
            ActionMenuView actionMenuView = toolbar.a;
            if (actionMenuView != null) {
                actionMenuView.i(eeVar, hoVar);
            }
            this.e = true;
        }
        return this.c.a.f();
    }

    public final void x(int i, int i2) {
        mk mkVar = this.c;
        mkVar.d((i & i2) | (mkVar.b & (~i2)));
    }

    @Override // defpackage.cs
    public final void r() {
    }

    @Override // defpackage.cs
    public final void f(boolean z) {
    }

    @Override // defpackage.cs
    public final void h(boolean z) {
    }
}
