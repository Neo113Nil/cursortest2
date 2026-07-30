package defpackage;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ey2 implements zk1 {
    public fk1 m;
    public lk1 n;
    public final /* synthetic */ Toolbar o;

    public ey2(Toolbar toolbar) {
        this.o = toolbar;
    }

    @Override // defpackage.zk1
    public final boolean d(lk1 lk1Var) {
        Toolbar toolbar = this.o;
        KeyEvent.Callback callback = toolbar.u;
        if (callback instanceof mv) {
            ((ok1) ((mv) callback)).m.onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.u);
        toolbar.removeView(toolbar.t);
        toolbar.u = null;
        ArrayList arrayList = toolbar.Q;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.n = null;
        toolbar.requestLayout();
        lk1Var.C = false;
        lk1Var.n.p(false);
        toolbar.t();
        return true;
    }

    @Override // defpackage.zk1
    public final boolean f(lk1 lk1Var) {
        Toolbar toolbar = this.o;
        toolbar.c();
        ViewParent parent = toolbar.t.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.t);
            }
            toolbar.addView(toolbar.t);
        }
        View actionView = lk1Var.getActionView();
        toolbar.u = actionView;
        this.n = lk1Var;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.u);
            }
            fy2 h = Toolbar.h();
            h.a = (toolbar.z & 112) | 8388611;
            h.b = 2;
            toolbar.u.setLayoutParams(h);
            toolbar.addView(toolbar.u);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((fy2) childAt.getLayoutParams()).b != 2 && childAt != toolbar.m) {
                toolbar.removeViewAt(childCount);
                toolbar.Q.add(childAt);
            }
        }
        toolbar.requestLayout();
        lk1Var.C = true;
        lk1Var.n.p(false);
        KeyEvent.Callback callback = toolbar.u;
        if (callback instanceof mv) {
            ((ok1) ((mv) callback)).m.onActionViewExpanded();
        }
        toolbar.t();
        return true;
    }

    @Override // defpackage.zk1
    public final void g() {
        if (this.n != null) {
            fk1 fk1Var = this.m;
            if (fk1Var != null) {
                int size = fk1Var.f.size();
                for (int i = 0; i < size; i++) {
                    if (this.m.getItem(i) == this.n) {
                        return;
                    }
                }
            }
            d(this.n);
        }
    }

    @Override // defpackage.zk1
    public final void i(Context context, fk1 fk1Var) {
        lk1 lk1Var;
        fk1 fk1Var2 = this.m;
        if (fk1Var2 != null && (lk1Var = this.n) != null) {
            fk1Var2.d(lk1Var);
        }
        this.m = fk1Var;
    }

    @Override // defpackage.zk1
    public final boolean j(cq2 cq2Var) {
        return false;
    }

    @Override // defpackage.zk1
    public final boolean k() {
        return false;
    }

    @Override // defpackage.zk1
    public final void b(fk1 fk1Var, boolean z) {
    }
}
