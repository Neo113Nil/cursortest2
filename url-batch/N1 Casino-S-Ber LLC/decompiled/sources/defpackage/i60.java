package defpackage;

import android.content.Context;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.Window;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class i60 extends o8 {
    public final k60 s;
    public final Window.Callback t;
    public final h60 u;
    public boolean v;
    public boolean w;
    public boolean x;
    public final ArrayList y = new ArrayList();
    public final z6 z = new z6(12, this);

    public i60(Toolbar toolbar, CharSequence charSequence, x3 x3Var) {
        h60 h60Var = new h60(this);
        k60 k60Var = new k60(toolbar, false);
        this.s = k60Var;
        x3Var.getClass();
        this.t = x3Var;
        k60Var.k = x3Var;
        toolbar.setOnMenuItemClickListener(h60Var);
        boolean z = k60Var.g;
        if (!z) {
            k60Var.h = charSequence;
            if ((k60Var.b & 8) != 0) {
                toolbar.setTitle(charSequence);
                if (z) {
                    x80.n(toolbar.getRootView(), charSequence);
                }
            }
        }
        this.u = new h60(this);
    }

    public final Menu F0() {
        boolean z = this.w;
        k60 k60Var = this.s;
        if (!z) {
            e8 e8Var = new e8(this);
            h60 h60Var = new h60(this);
            Toolbar toolbar = k60Var.a;
            toolbar.S = e8Var;
            toolbar.T = h60Var;
            ActionMenuView actionMenuView = toolbar.f;
            if (actionMenuView != null) {
                actionMenuView.z = e8Var;
                actionMenuView.A = h60Var;
            }
            this.w = true;
        }
        return k60Var.a.getMenu();
    }

    @Override // defpackage.o8
    public final Context J() {
        return this.s.a.getContext();
    }

    @Override // defpackage.o8
    public final boolean M() {
        k60 k60Var = this.s;
        Toolbar toolbar = k60Var.a;
        z6 z6Var = this.z;
        toolbar.removeCallbacks(z6Var);
        Toolbar toolbar2 = k60Var.a;
        WeakHashMap weakHashMap = x80.a;
        toolbar2.postOnAnimation(z6Var);
        return true;
    }

    @Override // defpackage.o8
    public final void Z() {
        this.s.a.removeCallbacks(this.z);
    }

    @Override // defpackage.o8
    public final boolean a0(int i, KeyEvent keyEvent) {
        Menu F0 = F0();
        if (F0 == null) {
            return false;
        }
        F0.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
        return F0.performShortcut(i, keyEvent, 0);
    }

    @Override // defpackage.o8
    public final boolean b0(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            c0();
        }
        return true;
    }

    @Override // defpackage.o8
    public final boolean c0() {
        return this.s.a.u();
    }

    @Override // defpackage.o8
    public final boolean n() {
        h1 h1Var;
        ActionMenuView actionMenuView = this.s.a.f;
        return (actionMenuView == null || (h1Var = actionMenuView.y) == null || !h1Var.d()) ? false : true;
    }

    @Override // defpackage.o8
    public final boolean o() {
        pt ptVar;
        d60 d60Var = this.s.a.R;
        if (d60Var == null || (ptVar = d60Var.g) == null) {
            return false;
        }
        if (d60Var == null) {
            ptVar = null;
        }
        if (ptVar == null) {
            return true;
        }
        ptVar.collapseActionView();
        return true;
    }

    @Override // defpackage.o8
    public final void p0(CharSequence charSequence) {
        k60 k60Var = this.s;
        if (k60Var.g) {
            return;
        }
        Toolbar toolbar = k60Var.a;
        k60Var.h = charSequence;
        if ((k60Var.b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (k60Var.g) {
                x80.n(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // defpackage.o8
    public final void s(boolean z) {
        if (z == this.x) {
            return;
        }
        this.x = z;
        ArrayList arrayList = this.y;
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        t8.c();
    }

    @Override // defpackage.o8
    public final int x() {
        return this.s.b;
    }

    @Override // defpackage.o8
    public final void l0(boolean z) {
    }

    @Override // defpackage.o8
    public final void n0(boolean z) {
    }

    @Override // defpackage.o8
    public final void X() {
    }
}
