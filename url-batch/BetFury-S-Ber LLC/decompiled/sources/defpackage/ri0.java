package defpackage;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class ri0 implements h20 {
    public r10 f;
    public u10 g;
    public final /* synthetic */ Toolbar h;

    public ri0(Toolbar toolbar) {
        this.h = toolbar;
    }

    @Override // defpackage.h20
    public final boolean c(u10 u10Var) {
        Toolbar toolbar = this.h;
        KeyEvent.Callback callback = toolbar.n;
        if (callback instanceof sc) {
            ((sc) callback).onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.n);
        toolbar.removeView(toolbar.m);
        toolbar.n = null;
        ArrayList arrayList = toolbar.J;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.g = null;
        toolbar.requestLayout();
        u10Var.C = false;
        u10Var.n.p(false);
        toolbar.v();
        return true;
    }

    @Override // defpackage.h20
    public final boolean f(u10 u10Var) {
        Toolbar toolbar = this.h;
        toolbar.c();
        ViewParent parent = toolbar.m.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.m);
            }
            toolbar.addView(toolbar.m);
        }
        View actionView = u10Var.getActionView();
        toolbar.n = actionView;
        this.g = u10Var;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.n);
            }
            si0 h = Toolbar.h();
            h.a = (toolbar.s & 112) | 8388611;
            h.b = 2;
            toolbar.n.setLayoutParams(h);
            toolbar.addView(toolbar.n);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((si0) childAt.getLayoutParams()).b != 2 && childAt != toolbar.f) {
                toolbar.removeViewAt(childCount);
                toolbar.J.add(childAt);
            }
        }
        toolbar.requestLayout();
        u10Var.C = true;
        u10Var.n.p(false);
        KeyEvent.Callback callback = toolbar.n;
        if (callback instanceof sc) {
            ((sc) callback).onActionViewExpanded();
        }
        toolbar.v();
        return true;
    }

    @Override // defpackage.h20
    public final void g() {
        if (this.g != null) {
            r10 r10Var = this.f;
            if (r10Var != null) {
                int size = r10Var.f.size();
                for (int i = 0; i < size; i++) {
                    if (this.f.getItem(i) == this.g) {
                        return;
                    }
                }
            }
            c(this.g);
        }
    }

    @Override // defpackage.h20
    public final void h(Context context, r10 r10Var) {
        u10 u10Var;
        r10 r10Var2 = this.f;
        if (r10Var2 != null && (u10Var = this.g) != null) {
            r10Var2.d(u10Var);
        }
        this.f = r10Var;
    }

    @Override // defpackage.h20
    public final boolean j(wf0 wf0Var) {
        return false;
    }

    @Override // defpackage.h20
    public final boolean k() {
        return false;
    }

    @Override // defpackage.h20
    public final void a(r10 r10Var, boolean z) {
    }
}
