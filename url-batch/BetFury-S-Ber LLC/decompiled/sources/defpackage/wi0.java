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

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class wi0 extends n9 {
    public final yi0 s;
    public final Window.Callback t;
    public final vi0 u;
    public boolean v;
    public boolean w;
    public boolean x;
    public final ArrayList y = new ArrayList();
    public final v7 z = new v7(13, this);

    public wi0(Toolbar toolbar, CharSequence charSequence, p4 p4Var) {
        vi0 vi0Var = new vi0(this);
        toolbar.getClass();
        yi0 yi0Var = new yi0(toolbar, false);
        this.s = yi0Var;
        p4Var.getClass();
        this.t = p4Var;
        yi0Var.k = p4Var;
        toolbar.setOnMenuItemClickListener(vi0Var);
        boolean z = yi0Var.g;
        if (!z) {
            yi0Var.h = charSequence;
            if ((yi0Var.b & 8) != 0) {
                toolbar.setTitle(charSequence);
                if (z) {
                    hm0.n(toolbar.getRootView(), charSequence);
                }
            }
        }
        this.u = new vi0(this);
    }

    @Override // defpackage.n9
    public final boolean A() {
        yi0 yi0Var = this.s;
        Toolbar toolbar = yi0Var.a;
        v7 v7Var = this.z;
        toolbar.removeCallbacks(v7Var);
        Toolbar toolbar2 = yi0Var.a;
        WeakHashMap weakHashMap = hm0.a;
        toolbar2.postOnAnimation(v7Var);
        return true;
    }

    @Override // defpackage.n9
    public final void F() {
        this.s.a.removeCallbacks(this.z);
    }

    @Override // defpackage.n9
    public final boolean G(int i, KeyEvent keyEvent) {
        Menu W = W();
        if (W == null) {
            return false;
        }
        W.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
        return W.performShortcut(i, keyEvent, 0);
    }

    @Override // defpackage.n9
    public final boolean H(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            I();
        }
        return true;
    }

    @Override // defpackage.n9
    public final boolean I() {
        return this.s.a.u();
    }

    @Override // defpackage.n9
    public final void Q(CharSequence charSequence) {
        yi0 yi0Var = this.s;
        if (yi0Var.g) {
            return;
        }
        Toolbar toolbar = yi0Var.a;
        yi0Var.h = charSequence;
        if ((yi0Var.b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (yi0Var.g) {
                hm0.n(toolbar.getRootView(), charSequence);
            }
        }
    }

    public final Menu W() {
        boolean z = this.w;
        yi0 yi0Var = this.s;
        if (!z) {
            e9 e9Var = new e9(this);
            vi0 vi0Var = new vi0(this);
            Toolbar toolbar = yi0Var.a;
            toolbar.S = e9Var;
            toolbar.T = vi0Var;
            ActionMenuView actionMenuView = toolbar.f;
            if (actionMenuView != null) {
                actionMenuView.z = e9Var;
                actionMenuView.A = vi0Var;
            }
            this.w = true;
        }
        return yi0Var.a.getMenu();
    }

    @Override // defpackage.n9
    public final boolean f() {
        l1 l1Var;
        ActionMenuView actionMenuView = this.s.a.f;
        return (actionMenuView == null || (l1Var = actionMenuView.y) == null || !l1Var.d()) ? false : true;
    }

    @Override // defpackage.n9
    public final boolean g() {
        u10 u10Var;
        ri0 ri0Var = this.s.a.R;
        if (ri0Var == null || (u10Var = ri0Var.g) == null) {
            return false;
        }
        if (ri0Var == null) {
            u10Var = null;
        }
        if (u10Var == null) {
            return true;
        }
        u10Var.collapseActionView();
        return true;
    }

    @Override // defpackage.n9
    public final void j(boolean z) {
        if (z == this.x) {
            return;
        }
        this.x = z;
        ArrayList arrayList = this.y;
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        s9.c();
    }

    @Override // defpackage.n9
    public final int n() {
        return this.s.b;
    }

    @Override // defpackage.n9
    public final Context t() {
        return this.s.a.getContext();
    }

    @Override // defpackage.n9
    public final void N(boolean z) {
    }

    @Override // defpackage.n9
    public final void O(boolean z) {
    }

    @Override // defpackage.n9
    public final void E() {
    }
}
