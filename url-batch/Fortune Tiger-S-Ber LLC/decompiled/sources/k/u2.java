package k;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class u2 implements j.y {

    /* renamed from: f, reason: collision with root package name */
    public j.m f2668f;
    public j.o g;
    public final /* synthetic */ Toolbar h;

    public u2(Toolbar toolbar) {
        this.h = toolbar;
    }

    @Override // j.y
    public final boolean d(j.o oVar) {
        Toolbar toolbar = this.h;
        toolbar.c();
        ViewParent parent = toolbar.f241m.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.f241m);
            }
            toolbar.addView(toolbar.f241m);
        }
        View actionView = oVar.getActionView();
        toolbar.f242n = actionView;
        this.g = oVar;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.f242n);
            }
            v2 h = Toolbar.h();
            h.f2682a = (toolbar.f247s & 112) | 8388611;
            h.f2683b = 2;
            toolbar.f242n.setLayoutParams(h);
            toolbar.addView(toolbar.f242n);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((v2) childAt.getLayoutParams()).f2683b != 2 && childAt != toolbar.f236f) {
                toolbar.removeViewAt(childCount);
                toolbar.J.add(childAt);
            }
        }
        toolbar.requestLayout();
        oVar.C = true;
        oVar.f2221n.p(false);
        KeyEvent.Callback callback = toolbar.f242n;
        if (callback instanceof i.b) {
            ((j.q) ((i.b) callback)).f2236f.onActionViewExpanded();
        }
        toolbar.t();
        return true;
    }

    @Override // j.y
    public final void e() {
        if (this.g != null) {
            j.m mVar = this.f2668f;
            if (mVar != null) {
                int size = mVar.f2193f.size();
                for (int i4 = 0; i4 < size; i4++) {
                    if (this.f2668f.getItem(i4) == this.g) {
                        return;
                    }
                }
            }
            i(this.g);
        }
    }

    @Override // j.y
    public final void g(Context context, j.m mVar) {
        j.o oVar;
        j.m mVar2 = this.f2668f;
        if (mVar2 != null && (oVar = this.g) != null) {
            mVar2.d(oVar);
        }
        this.f2668f = mVar;
    }

    @Override // j.y
    public final boolean h() {
        return false;
    }

    @Override // j.y
    public final boolean i(j.o oVar) {
        Toolbar toolbar = this.h;
        KeyEvent.Callback callback = toolbar.f242n;
        if (callback instanceof i.b) {
            ((j.q) ((i.b) callback)).f2236f.onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.f242n);
        toolbar.removeView(toolbar.f241m);
        toolbar.f242n = null;
        ArrayList arrayList = toolbar.J;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.g = null;
        toolbar.requestLayout();
        oVar.C = false;
        oVar.f2221n.p(false);
        toolbar.t();
        return true;
    }

    @Override // j.y
    public final boolean k(j.e0 e0Var) {
        return false;
    }

    @Override // j.y
    public final void a(j.m mVar, boolean z3) {
    }
}
