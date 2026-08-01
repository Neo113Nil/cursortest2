package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public class sl extends ml {
    @Override // defpackage.ml
    public final void a(View view, Object obj) {
        ((y60) obj).b(view);
    }

    @Override // defpackage.ml
    public final void b(Object obj, ArrayList arrayList) {
        y60 y60Var = (y60) obj;
        if (y60Var == null) {
            return;
        }
        int i = 0;
        if (y60Var instanceof e70) {
            e70 e70Var = (e70) y60Var;
            int size = e70Var.G.size();
            while (i < size) {
                b((i < 0 || i >= e70Var.G.size()) ? null : (y60) e70Var.G.get(i), arrayList);
                i++;
            }
            return;
        }
        if (ml.h(y60Var.j) && ml.h(y60Var.k)) {
            int size2 = arrayList.size();
            while (i < size2) {
                y60Var.b((View) arrayList.get(i));
                i++;
            }
        }
    }

    @Override // defpackage.ml
    public final void c(ViewGroup viewGroup, Object obj) {
        c70.a(viewGroup, (y60) obj);
    }

    @Override // defpackage.ml
    public final boolean e(Object obj) {
        return obj instanceof y60;
    }

    @Override // defpackage.ml
    public final Object f(Object obj) {
        if (obj != null) {
            return ((y60) obj).clone();
        }
        return null;
    }

    @Override // defpackage.ml
    public final Object i(Object obj, Object obj2, Object obj3) {
        y60 y60Var = (y60) obj;
        y60 y60Var2 = (y60) obj2;
        y60 y60Var3 = (y60) obj3;
        if (y60Var != null && y60Var2 != null) {
            e70 e70Var = new e70();
            e70Var.K(y60Var);
            e70Var.K(y60Var2);
            e70Var.H = false;
            y60Var = e70Var;
        } else if (y60Var == null) {
            y60Var = y60Var2 != null ? y60Var2 : null;
        }
        if (y60Var3 == null) {
            return y60Var;
        }
        e70 e70Var2 = new e70();
        if (y60Var != null) {
            e70Var2.K(y60Var);
        }
        e70Var2.K(y60Var3);
        return e70Var2;
    }

    @Override // defpackage.ml
    public final Object j(Object obj, Object obj2) {
        e70 e70Var = new e70();
        if (obj != null) {
            e70Var.K((y60) obj);
        }
        e70Var.K((y60) obj2);
        return e70Var;
    }

    @Override // defpackage.ml
    public final void k(Object obj, View view, ArrayList arrayList) {
        ((y60) obj).a(new pl(view, arrayList));
    }

    @Override // defpackage.ml
    public final void l(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2) {
        ((y60) obj).a(new ql(this, obj2, arrayList, obj3, arrayList2));
    }

    @Override // defpackage.ml
    public final void m(View view, Object obj) {
        if (view != null) {
            ml.g(view, new Rect());
            ((y60) obj).D(new ol());
        }
    }

    @Override // defpackage.ml
    public final void n(Object obj, Rect rect) {
        ((y60) obj).D(new ol());
    }

    @Override // defpackage.ml
    public final void o(Object obj, c9 c9Var, final h1 h1Var) {
        final y60 y60Var = (y60) obj;
        c9Var.a(new b9() { // from class: nl
            @Override // defpackage.b9
            public final void onCancel() {
                y60.this.d();
                h1Var.run();
            }
        });
        y60Var.a(new rl(h1Var));
    }

    @Override // defpackage.ml
    public final void p(Object obj, View view, ArrayList arrayList) {
        e70 e70Var = (e70) obj;
        ArrayList arrayList2 = e70Var.k;
        arrayList2.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ml.d(arrayList2, (View) arrayList.get(i));
        }
        arrayList2.add(view);
        arrayList.add(view);
        b(e70Var, arrayList);
    }

    @Override // defpackage.ml
    public final void q(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        e70 e70Var = (e70) obj;
        if (e70Var != null) {
            ArrayList arrayList3 = e70Var.k;
            arrayList3.clear();
            arrayList3.addAll(arrayList2);
            s(e70Var, arrayList, arrayList2);
        }
    }

    @Override // defpackage.ml
    public final Object r(Object obj) {
        if (obj == null) {
            return null;
        }
        e70 e70Var = new e70();
        e70Var.K((y60) obj);
        return e70Var;
    }

    public final void s(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        y60 y60Var = (y60) obj;
        int i = 0;
        if (y60Var instanceof e70) {
            e70 e70Var = (e70) y60Var;
            int size = e70Var.G.size();
            while (i < size) {
                s((i < 0 || i >= e70Var.G.size()) ? null : (y60) e70Var.G.get(i), arrayList, arrayList2);
                i++;
            }
            return;
        }
        if (ml.h(y60Var.j)) {
            ArrayList arrayList3 = y60Var.k;
            if (arrayList3.size() == arrayList.size() && arrayList3.containsAll(arrayList)) {
                int size2 = arrayList2 == null ? 0 : arrayList2.size();
                while (i < size2) {
                    y60Var.b((View) arrayList2.get(i));
                    i++;
                }
                for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                    y60Var.z((View) arrayList.get(size3));
                }
            }
        }
    }
}
