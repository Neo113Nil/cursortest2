package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class lb2 {
    public m30 a;
    public CoroutineContext b;
    public Executor c;
    public cf d;
    public ib2 e;
    public z41 f;
    public final t21 g = new t21(new j7(0, this, lb2.class, "onClosed", "onClosed()V", 0, 0, 2));
    public final ThreadLocal h = new ThreadLocal();
    public final LinkedHashMap i = new LinkedHashMap();
    public boolean j = true;

    public List a(LinkedHashMap linkedHashMap) {
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(li1.a(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            linkedHashMap2.put(yj1.y((h71) entry.getKey()), entry.getValue());
        }
        return ah0.m;
    }

    public abstract z41 b();

    public xf0 c() {
        throw new ws1(null, 1, null);
    }

    public final z41 d() {
        z41 z41Var = this.f;
        if (z41Var != null) {
            return z41Var;
        }
        Intrinsics.f("internalTracker");
        throw null;
    }

    public Set e() {
        ArrayList arrayList = new ArrayList(rv.l(fh0.m, 10));
        zg0.m.getClass();
        return zv.Q(arrayList);
    }

    public LinkedHashMap f() {
        Set<Map.Entry> entrySet = mi1.c().entrySet();
        int a = li1.a(rv.l(entrySet, 10));
        if (a < 16) {
            a = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(a);
        for (Map.Entry entry : entrySet) {
            Class cls = (Class) entry.getKey();
            List list = (List) entry.getValue();
            gu A = yj1.A(cls);
            ArrayList arrayList = new ArrayList(rv.l(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(yj1.A((Class) it.next()));
            }
            linkedHashMap.put(A, arrayList);
        }
        return linkedHashMap;
    }

    public final boolean g() {
        ib2 ib2Var = this.e;
        if (ib2Var != null) {
            return ib2Var.c() != null;
        }
        Intrinsics.f("connectionManager");
        throw null;
    }

    public final boolean h() {
        ib2 ib2Var = this.e;
        if (ib2Var == null) {
            Intrinsics.f("connectionManager");
            throw null;
        }
        zs0 zs0Var = ib2Var.g;
        if (zs0Var != null) {
            return zs0Var.m.isOpen();
        }
        return false;
    }

    public final Object i(boolean z, Function2 function2, r30 r30Var) {
        ib2 ib2Var = this.e;
        if (ib2Var != null) {
            return ib2Var.f.g(z, function2, r30Var);
        }
        Intrinsics.f("connectionManager");
        throw null;
    }
}
