package p1;

import E.H;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.RunnableC0208l;
import androidx.fragment.app.w0;
import com.rockchicken.pump.up.road.R;
import java.lang.reflect.Field;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class m extends w0 {
    @Override // androidx.fragment.app.w0
    public final void a(Object obj, View view) {
        ((q) obj).b(view);
    }

    @Override // androidx.fragment.app.w0
    public final void b(Object obj, ArrayList arrayList) {
        q qVar = (q) obj;
        if (qVar == null) {
            return;
        }
        int i4 = 0;
        if (qVar instanceof v) {
            v vVar = (v) qVar;
            int size = vVar.v.size();
            while (i4 < size) {
                b((i4 < 0 || i4 >= vVar.v.size()) ? null : (q) vVar.v.get(i4), arrayList);
                i4++;
            }
            return;
        }
        if (w0.h(qVar.f14777c) && w0.h(qVar.f14778d)) {
            int size2 = arrayList.size();
            while (i4 < size2) {
                qVar.b((View) arrayList.get(i4));
                i4++;
            }
        }
    }

    @Override // androidx.fragment.app.w0
    public final void c(ViewGroup viewGroup, Object obj) {
        q qVar = (q) obj;
        ArrayList arrayList = u.f14797c;
        if (arrayList.contains(viewGroup)) {
            return;
        }
        Field field = H.f375a;
        if (viewGroup.isLaidOut()) {
            arrayList.add(viewGroup);
            if (qVar == null) {
                qVar = u.f14795a;
            }
            q clone = qVar.clone();
            ArrayList arrayList2 = (ArrayList) u.a().get(viewGroup);
            if (arrayList2 != null && arrayList2.size() > 0) {
                int size = arrayList2.size();
                int i4 = 0;
                while (i4 < size) {
                    Object obj2 = arrayList2.get(i4);
                    i4++;
                    ((q) obj2).v(viewGroup);
                }
            }
            if (clone != null) {
                clone.i(viewGroup, true);
            }
            if (viewGroup.getTag(R.id.transition_current_scene) != null) {
                throw new ClassCastException();
            }
            viewGroup.setTag(R.id.transition_current_scene, null);
            if (clone != null) {
                t tVar = new t();
                tVar.f14793a = clone;
                tVar.f14794b = viewGroup;
                viewGroup.addOnAttachStateChangeListener(tVar);
                viewGroup.getViewTreeObserver().addOnPreDrawListener(tVar);
            }
        }
    }

    @Override // androidx.fragment.app.w0
    public final boolean e(Object obj) {
        return obj instanceof q;
    }

    @Override // androidx.fragment.app.w0
    public final Object f(Object obj) {
        if (obj != null) {
            return ((q) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.w0
    public final Object j(Object obj, Object obj2, Object obj3) {
        q qVar = (q) obj;
        q qVar2 = (q) obj2;
        q qVar3 = (q) obj3;
        if (qVar != null && qVar2 != null) {
            v vVar = new v();
            vVar.H(qVar);
            vVar.H(qVar2);
            vVar.f14798w = false;
            qVar = vVar;
        } else if (qVar == null) {
            qVar = qVar2 != null ? qVar2 : null;
        }
        if (qVar3 == null) {
            return qVar;
        }
        v vVar2 = new v();
        if (qVar != null) {
            vVar2.H(qVar);
        }
        vVar2.H(qVar3);
        return vVar2;
    }

    @Override // androidx.fragment.app.w0
    public final Object k(Object obj, Object obj2) {
        v vVar = new v();
        if (obj != null) {
            vVar.H((q) obj);
        }
        vVar.H((q) obj2);
        return vVar;
    }

    @Override // androidx.fragment.app.w0
    public final void l(Object obj, View view, ArrayList arrayList) {
        ((q) obj).a(new j(view, arrayList));
    }

    @Override // androidx.fragment.app.w0
    public final void m(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2) {
        ((q) obj).a(new k(this, obj2, arrayList, obj3, arrayList2));
    }

    @Override // androidx.fragment.app.w0
    public final void n(Object obj, Rect rect) {
        ((q) obj).A(new i());
    }

    @Override // androidx.fragment.app.w0
    public final void o(Object obj, View view) {
        if (view != null) {
            w0.g(view, new Rect());
            ((q) obj).A(new i());
        }
    }

    @Override // androidx.fragment.app.w0
    public final void p(Object obj, A.b bVar, RunnableC0208l runnableC0208l) {
        q qVar = (q) obj;
        e0.t tVar = new e0.t(qVar);
        synchronized (bVar) {
            while (bVar.f2c) {
                try {
                    try {
                        bVar.wait();
                    } catch (InterruptedException unused) {
                    }
                } finally {
                }
            }
            if (bVar.f1b != tVar) {
                bVar.f1b = tVar;
                if (bVar.f0a) {
                    ((q) tVar.f8416a).d();
                }
            }
        }
        qVar.a(new l(runnableC0208l));
    }

    @Override // androidx.fragment.app.w0
    public final void q(Object obj, View view, ArrayList arrayList) {
        v vVar = (v) obj;
        ArrayList arrayList2 = vVar.f14778d;
        arrayList2.clear();
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            w0.d((View) arrayList.get(i4), arrayList2);
        }
        arrayList2.add(view);
        arrayList.add(view);
        b(vVar, arrayList);
    }

    @Override // androidx.fragment.app.w0
    public final void r(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        v vVar = (v) obj;
        if (vVar != null) {
            ArrayList arrayList3 = vVar.f14778d;
            arrayList3.clear();
            arrayList3.addAll(arrayList2);
            t(vVar, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.w0
    public final Object s(Object obj) {
        if (obj == null) {
            return null;
        }
        v vVar = new v();
        vVar.H((q) obj);
        return vVar;
    }

    public final void t(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        q qVar = (q) obj;
        int i4 = 0;
        if (qVar instanceof v) {
            v vVar = (v) qVar;
            int size = vVar.v.size();
            while (i4 < size) {
                t((i4 < 0 || i4 >= vVar.v.size()) ? null : (q) vVar.v.get(i4), arrayList, arrayList2);
                i4++;
            }
            return;
        }
        if (w0.h(qVar.f14777c)) {
            ArrayList arrayList3 = qVar.f14778d;
            if (arrayList3.size() == arrayList.size() && arrayList3.containsAll(arrayList)) {
                int size2 = arrayList2 == null ? 0 : arrayList2.size();
                while (i4 < size2) {
                    qVar.b((View) arrayList2.get(i4));
                    i4++;
                }
                for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                    qVar.x((View) arrayList.get(size3));
                }
            }
        }
    }
}
