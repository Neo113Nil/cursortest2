package l;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class e2 implements k.o {

    /* renamed from: d, reason: collision with root package name */
    public k.i f4227d;

    /* renamed from: e, reason: collision with root package name */
    public k.j f4228e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Toolbar f4229f;

    public e2(Toolbar toolbar) {
        this.f4229f = toolbar;
    }

    @Override // k.o
    public final boolean b(k.j jVar) {
        Toolbar toolbar = this.f4229f;
        toolbar.c();
        ViewParent parent = toolbar.f425k.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.f425k);
            }
            toolbar.addView(toolbar.f425k);
        }
        View view = jVar.f4113z;
        if (view == null) {
            view = null;
        }
        toolbar.f426l = view;
        this.f4228e = jVar;
        ViewParent parent2 = view.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.f426l);
            }
            f2 g3 = Toolbar.g();
            g3.f4246a = (toolbar.f431q & 112) | 8388611;
            g3.f4247b = 2;
            toolbar.f426l.setLayoutParams(g3);
            toolbar.addView(toolbar.f426l);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((f2) childAt.getLayoutParams()).f4247b != 2 && childAt != toolbar.f419d) {
                toolbar.removeViewAt(childCount);
                toolbar.H.add(childAt);
            }
        }
        toolbar.requestLayout();
        jVar.B = true;
        jVar.f4101n.o(false);
        toolbar.s();
        return true;
    }

    @Override // k.o
    public final boolean c(k.s sVar) {
        return false;
    }

    @Override // k.o
    public final boolean e(k.j jVar) {
        Toolbar toolbar = this.f4229f;
        toolbar.removeView(toolbar.f426l);
        toolbar.removeView(toolbar.f425k);
        toolbar.f426l = null;
        ArrayList arrayList = toolbar.H;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.f4228e = null;
        toolbar.requestLayout();
        jVar.B = false;
        jVar.f4101n.o(false);
        toolbar.s();
        return true;
    }

    @Override // k.o
    public final void f() {
        if (this.f4228e != null) {
            k.i iVar = this.f4227d;
            if (iVar != null) {
                int size = iVar.f4075f.size();
                for (int i = 0; i < size; i++) {
                    if (this.f4227d.getItem(i) == this.f4228e) {
                        return;
                    }
                }
            }
            e(this.f4228e);
        }
    }

    @Override // k.o
    public final void i(Context context, k.i iVar) {
        k.j jVar;
        k.i iVar2 = this.f4227d;
        if (iVar2 != null && (jVar = this.f4228e) != null) {
            iVar2.d(jVar);
        }
        this.f4227d = iVar;
    }

    @Override // k.o
    public final boolean j() {
        return false;
    }

    @Override // k.o
    public final void a(k.i iVar, boolean z3) {
    }
}
