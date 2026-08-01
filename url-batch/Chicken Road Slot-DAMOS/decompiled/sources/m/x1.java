package m;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class x1 implements l.o {

    /* renamed from: d, reason: collision with root package name */
    public l.i f6203d;

    /* renamed from: e, reason: collision with root package name */
    public l.j f6204e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Toolbar f6205i;

    public x1(Toolbar toolbar) {
        this.f6205i = toolbar;
    }

    @Override // l.o
    public final void c() {
        if (this.f6204e != null) {
            l.i iVar = this.f6203d;
            if (iVar != null) {
                int size = iVar.f5670f.size();
                for (int i3 = 0; i3 < size; i3++) {
                    if (this.f6203d.getItem(i3) == this.f6204e) {
                        return;
                    }
                }
            }
            k(this.f6204e);
        }
    }

    @Override // l.o
    public final boolean f(l.j jVar) {
        Toolbar toolbar = this.f6205i;
        toolbar.c();
        ViewParent parent = toolbar.f455v.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.f455v);
            }
            toolbar.addView(toolbar.f455v);
        }
        View view = jVar.f5706z;
        if (view == null) {
            view = null;
        }
        toolbar.f456w = view;
        this.f6204e = jVar;
        ViewParent parent2 = view.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.f456w);
            }
            y1 g = Toolbar.g();
            g.f6219a = (toolbar.B & 112) | 8388611;
            g.f6220b = 2;
            toolbar.f456w.setLayoutParams(g);
            toolbar.addView(toolbar.f456w);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((y1) childAt.getLayoutParams()).f6220b != 2 && childAt != toolbar.f444d) {
                toolbar.removeViewAt(childCount);
                toolbar.S.add(childAt);
            }
        }
        toolbar.requestLayout();
        jVar.B = true;
        jVar.f5694n.o(false);
        toolbar.s();
        return true;
    }

    @Override // l.o
    public final void g(Context context, l.i iVar) {
        l.j jVar;
        l.i iVar2 = this.f6203d;
        if (iVar2 != null && (jVar = this.f6204e) != null) {
            iVar2.d(jVar);
        }
        this.f6203d = iVar;
    }

    @Override // l.o
    public final boolean h() {
        return false;
    }

    @Override // l.o
    public final boolean i(l.s sVar) {
        return false;
    }

    @Override // l.o
    public final boolean k(l.j jVar) {
        Toolbar toolbar = this.f6205i;
        toolbar.removeView(toolbar.f456w);
        toolbar.removeView(toolbar.f455v);
        toolbar.f456w = null;
        ArrayList arrayList = toolbar.S;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.f6204e = null;
        toolbar.requestLayout();
        jVar.B = false;
        jVar.f5694n.o(false);
        toolbar.s();
        return true;
    }

    @Override // l.o
    public final void b(l.i iVar, boolean z10) {
    }
}
