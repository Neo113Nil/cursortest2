package defpackage;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class n90 implements dx {
    public mw f;
    public qw g;
    public final /* synthetic */ Toolbar h;

    public n90(Toolbar toolbar) {
        this.h = toolbar;
    }

    @Override // defpackage.dx
    public final boolean c(qw qwVar) {
        Toolbar toolbar = this.h;
        KeyEvent.Callback callback = toolbar.n;
        if (callback instanceof ub) {
            ((sw) ((ub) callback)).f.onActionViewCollapsed();
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
        qwVar.C = false;
        qwVar.n.p(false);
        toolbar.t();
        return true;
    }

    @Override // defpackage.dx
    public final boolean f(qw qwVar) {
        Toolbar toolbar = this.h;
        toolbar.c();
        ViewParent parent = toolbar.m.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.m);
            }
            toolbar.addView(toolbar.m);
        }
        View actionView = qwVar.getActionView();
        toolbar.n = actionView;
        this.g = qwVar;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.n);
            }
            o90 h = Toolbar.h();
            h.a = (toolbar.s & 112) | 8388611;
            h.b = 2;
            toolbar.n.setLayoutParams(h);
            toolbar.addView(toolbar.n);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((o90) childAt.getLayoutParams()).b != 2 && childAt != toolbar.f) {
                toolbar.removeViewAt(childCount);
                toolbar.J.add(childAt);
            }
        }
        toolbar.requestLayout();
        qwVar.C = true;
        qwVar.n.p(false);
        KeyEvent.Callback callback = toolbar.n;
        if (callback instanceof ub) {
            ((sw) ((ub) callback)).f.onActionViewExpanded();
        }
        toolbar.t();
        return true;
    }

    @Override // defpackage.dx
    public final void g() {
        if (this.g != null) {
            mw mwVar = this.f;
            if (mwVar != null) {
                int size = mwVar.f.size();
                for (int i = 0; i < size; i++) {
                    if (this.f.getItem(i) == this.g) {
                        return;
                    }
                }
            }
            c(this.g);
        }
    }

    @Override // defpackage.dx
    public final void h(Context context, mw mwVar) {
        qw qwVar;
        mw mwVar2 = this.f;
        if (mwVar2 != null && (qwVar = this.g) != null) {
            mwVar2.d(qwVar);
        }
        this.f = mwVar;
    }

    @Override // defpackage.dx
    public final boolean j(p70 p70Var) {
        return false;
    }

    @Override // defpackage.dx
    public final boolean k() {
        return false;
    }

    @Override // defpackage.dx
    public final void a(mw mwVar, boolean z) {
    }
}
