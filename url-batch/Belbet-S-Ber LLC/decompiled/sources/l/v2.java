package l;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class v2 implements k.y {

    /* renamed from: f, reason: collision with root package name */
    public k.m f2598f;

    /* renamed from: g, reason: collision with root package name */
    public k.o f2599g;
    public final /* synthetic */ Toolbar h;

    public v2(Toolbar toolbar) {
        this.h = toolbar;
    }

    @Override // k.y
    public final boolean c(k.o oVar) {
        Toolbar toolbar = this.h;
        toolbar.c();
        ViewParent parent = toolbar.f350m.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.f350m);
            }
            toolbar.addView(toolbar.f350m);
        }
        View actionView = oVar.getActionView();
        toolbar.f351n = actionView;
        this.f2599g = oVar;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.f351n);
            }
            w2 h = Toolbar.h();
            h.f2602a = (toolbar.f356s & 112) | 8388611;
            h.f2603b = 2;
            toolbar.f351n.setLayoutParams(h);
            toolbar.addView(toolbar.f351n);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((w2) childAt.getLayoutParams()).f2603b != 2 && childAt != toolbar.f345f) {
                toolbar.removeViewAt(childCount);
                toolbar.J.add(childAt);
            }
        }
        toolbar.requestLayout();
        oVar.C = true;
        oVar.f2244n.p(false);
        KeyEvent.Callback callback = toolbar.f351n;
        if (callback instanceof j.b) {
            ((k.q) ((j.b) callback)).f2259f.onActionViewExpanded();
        }
        toolbar.t();
        return true;
    }

    @Override // k.y
    public final boolean d(k.e0 e0Var) {
        return false;
    }

    @Override // k.y
    public final boolean f(k.o oVar) {
        Toolbar toolbar = this.h;
        KeyEvent.Callback callback = toolbar.f351n;
        if (callback instanceof j.b) {
            ((k.q) ((j.b) callback)).f2259f.onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.f351n);
        toolbar.removeView(toolbar.f350m);
        toolbar.f351n = null;
        ArrayList arrayList = toolbar.J;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.f2599g = null;
        toolbar.requestLayout();
        oVar.C = false;
        oVar.f2244n.p(false);
        toolbar.t();
        return true;
    }

    @Override // k.y
    public final void g() {
        if (this.f2599g != null) {
            k.m mVar = this.f2598f;
            if (mVar != null) {
                int size = mVar.f2215f.size();
                for (int i = 0; i < size; i++) {
                    if (this.f2598f.getItem(i) == this.f2599g) {
                        return;
                    }
                }
            }
            f(this.f2599g);
        }
    }

    @Override // k.y
    public final void j(Context context, k.m mVar) {
        k.o oVar;
        k.m mVar2 = this.f2598f;
        if (mVar2 != null && (oVar = this.f2599g) != null) {
            mVar2.d(oVar);
        }
        this.f2598f = mVar;
    }

    @Override // k.y
    public final boolean k() {
        return false;
    }

    @Override // k.y
    public final void a(k.m mVar, boolean z4) {
    }
}
