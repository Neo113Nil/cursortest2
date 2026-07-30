package m;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import k.InterfaceC4615c;
import l.SubMenuC4672D;

/* loaded from: classes.dex */
public final class T0 implements l.x {

    /* renamed from: n, reason: collision with root package name */
    public l.l f39330n;

    /* renamed from: u, reason: collision with root package name */
    public l.n f39331u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Toolbar f39332v;

    public T0(Toolbar toolbar) {
        this.f39332v = toolbar;
    }

    @Override // l.x
    public final boolean b(l.n nVar) {
        Toolbar toolbar = this.f39332v;
        toolbar.c();
        ViewParent parent = toolbar.f4700A.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.f4700A);
            }
            toolbar.addView(toolbar.f4700A);
        }
        View actionView = nVar.getActionView();
        toolbar.f4702B = actionView;
        this.f39331u = nVar;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.f4702B);
            }
            U0 h9 = Toolbar.h();
            h9.f39333a = (toolbar.f4708G & 112) | 8388611;
            h9.f39334b = 2;
            toolbar.f4702B.setLayoutParams(h9);
            toolbar.addView(toolbar.f4702B);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((U0) childAt.getLayoutParams()).f39334b != 2 && childAt != toolbar.f4724n) {
                toolbar.removeViewAt(childCount);
                toolbar.f4725n0.add(childAt);
            }
        }
        toolbar.requestLayout();
        nVar.f38992V = true;
        nVar.f38978G.p(false);
        KeyEvent.Callback callback = toolbar.f4702B;
        if (callback instanceof InterfaceC4615c) {
            ((l.p) ((InterfaceC4615c) callback)).f39003n.onActionViewExpanded();
        }
        toolbar.w();
        return true;
    }

    @Override // l.x
    public final boolean c() {
        return false;
    }

    @Override // l.x
    public final void d() {
        if (this.f39331u != null) {
            l.l lVar = this.f39330n;
            if (lVar != null) {
                int size = lVar.f38967y.size();
                for (int i = 0; i < size; i++) {
                    if (this.f39330n.getItem(i) == this.f39331u) {
                        return;
                    }
                }
            }
            j(this.f39331u);
        }
    }

    @Override // l.x
    public final void h(Context context, l.l lVar) {
        l.n nVar;
        l.l lVar2 = this.f39330n;
        if (lVar2 != null && (nVar = this.f39331u) != null) {
            lVar2.d(nVar);
        }
        this.f39330n = lVar;
    }

    @Override // l.x
    public final boolean i(SubMenuC4672D subMenuC4672D) {
        return false;
    }

    @Override // l.x
    public final boolean j(l.n nVar) {
        Toolbar toolbar = this.f39332v;
        KeyEvent.Callback callback = toolbar.f4702B;
        if (callback instanceof InterfaceC4615c) {
            ((l.p) ((InterfaceC4615c) callback)).f39003n.onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.f4702B);
        toolbar.removeView(toolbar.f4700A);
        toolbar.f4702B = null;
        ArrayList arrayList = toolbar.f4725n0;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.f39331u = null;
        toolbar.requestLayout();
        nVar.f38992V = false;
        nVar.f38978G.p(false);
        toolbar.w();
        return true;
    }

    @Override // l.x
    public final void e(l.l lVar, boolean z8) {
    }
}
