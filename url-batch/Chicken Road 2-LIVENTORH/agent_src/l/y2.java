package l;

import android.content.Context;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class y2 implements k.y {

    /* renamed from: f, reason: collision with root package name */
    public k.m f2521f;

    /* renamed from: g, reason: collision with root package name */
    public k.o f2522g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Toolbar f2523h;

    public y2(Toolbar toolbar) {
        this.f2523h = toolbar;
    }

    @Override // k.y
    public final boolean c(k.o oVar) {
        Toolbar toolbar = this.f2523h;
        toolbar.c();
        ViewParent parent = toolbar.f224m.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.f224m);
            }
            toolbar.addView(toolbar.f224m);
        }
        View actionView = oVar.getActionView();
        toolbar.f225n = actionView;
        this.f2522g = oVar;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.f225n);
            }
            z2 h4 = Toolbar.h();
            h4.f2527a = (toolbar.f230s & 112) | 8388611;
            h4.f2528b = 2;
            toolbar.f225n.setLayoutParams(h4);
            toolbar.addView(toolbar.f225n);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((z2) childAt.getLayoutParams()).f2528b != 2 && childAt != toolbar.f218f) {
                toolbar.removeViewAt(childCount);
                toolbar.J.add(childAt);
            }
        }
        toolbar.requestLayout();
        oVar.C = true;
        oVar.f2096n.p(false);
        KeyEvent.Callback callback = toolbar.f225n;
        if (callback instanceof j.b) {
            ((k.q) ((j.b) callback)).f2111f.onActionViewExpanded();
        }
        toolbar.t();
        return true;
    }

    @Override // k.y
    public final boolean d(k.e0 e0Var) {
        return false;
    }

    @Override // k.y
    public final boolean e(k.o oVar) {
        Toolbar toolbar = this.f2523h;
        KeyEvent.Callback callback = toolbar.f225n;
        if (callback instanceof j.b) {
            ((k.q) ((j.b) callback)).f2111f.onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.f225n);
        toolbar.removeView(toolbar.f224m);
        toolbar.f225n = null;
        ArrayList arrayList = toolbar.J;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.f2522g = null;
        toolbar.requestLayout();
        oVar.C = false;
        oVar.f2096n.p(false);
        toolbar.t();
        return true;
    }

    @Override // k.y
    public final void g(Context context, k.m mVar) {
        k.o oVar;
        k.m mVar2 = this.f2521f;
        if (mVar2 != null && (oVar = this.f2522g) != null) {
            mVar2.d(oVar);
        }
        this.f2521f = mVar;
    }

    @Override // k.y
    public final int getId() {
        return 0;
    }

    @Override // k.y
    public final boolean h() {
        return false;
    }

    @Override // k.y
    public final Parcelable i() {
        return null;
    }

    @Override // k.y
    public final void m(boolean z3) {
        if (this.f2522g != null) {
            k.m mVar = this.f2521f;
            if (mVar != null) {
                int size = mVar.f2064f.size();
                for (int i = 0; i < size; i++) {
                    if (this.f2521f.getItem(i) == this.f2522g) {
                        return;
                    }
                }
            }
            e(this.f2522g);
        }
    }

    @Override // k.y
    public final void j(Parcelable parcelable) {
    }

    @Override // k.y
    public final void a(k.m mVar, boolean z3) {
    }
}
