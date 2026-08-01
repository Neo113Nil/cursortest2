package defpackage;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class d60 implements cu {
    public mt f;
    public pt g;
    public final /* synthetic */ Toolbar h;

    public d60(Toolbar toolbar) {
        this.h = toolbar;
    }

    @Override // defpackage.cu
    public final boolean c(pt ptVar) {
        Toolbar toolbar = this.h;
        KeyEvent.Callback callback = toolbar.n;
        if (callback instanceof za) {
            ((za) callback).onActionViewCollapsed();
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
        ptVar.C = false;
        ptVar.n.p(false);
        toolbar.v();
        return true;
    }

    @Override // defpackage.cu
    public final boolean f(pt ptVar) {
        Toolbar toolbar = this.h;
        toolbar.c();
        ViewParent parent = toolbar.m.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.m);
            }
            toolbar.addView(toolbar.m);
        }
        View actionView = ptVar.getActionView();
        toolbar.n = actionView;
        this.g = ptVar;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.n);
            }
            e60 h = Toolbar.h();
            h.a = (toolbar.s & 112) | 8388611;
            h.b = 2;
            toolbar.n.setLayoutParams(h);
            toolbar.addView(toolbar.n);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((e60) childAt.getLayoutParams()).b != 2 && childAt != toolbar.f) {
                toolbar.removeViewAt(childCount);
                toolbar.J.add(childAt);
            }
        }
        toolbar.requestLayout();
        ptVar.C = true;
        ptVar.n.p(false);
        KeyEvent.Callback callback = toolbar.n;
        if (callback instanceof za) {
            ((za) callback).onActionViewExpanded();
        }
        toolbar.v();
        return true;
    }

    @Override // defpackage.cu
    public final void g() {
        if (this.g != null) {
            mt mtVar = this.f;
            if (mtVar != null) {
                int size = mtVar.f.size();
                for (int i = 0; i < size; i++) {
                    if (this.f.getItem(i) == this.g) {
                        return;
                    }
                }
            }
            c(this.g);
        }
    }

    @Override // defpackage.cu
    public final void i(Context context, mt mtVar) {
        pt ptVar;
        mt mtVar2 = this.f;
        if (mtVar2 != null && (ptVar = this.g) != null) {
            mtVar2.d(ptVar);
        }
        this.f = mtVar;
    }

    @Override // defpackage.cu
    public final boolean j(m40 m40Var) {
        return false;
    }

    @Override // defpackage.cu
    public final boolean k() {
        return false;
    }

    @Override // defpackage.cu
    public final void a(mt mtVar, boolean z) {
    }
}
