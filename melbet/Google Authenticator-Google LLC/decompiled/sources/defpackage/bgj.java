package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bgj {
    private static final bge a = new bgi(0);
    private final List b = new ArrayList();
    private final Set c = new HashSet();
    private final wq d;

    public bgj(wq wqVar) {
        this.d = wqVar;
    }

    private final void f(Class cls, Class cls2, bgf bgfVar, boolean z) {
        this.b.add(z ? this.b.size() : 0, new bvw(cls, cls2, bgfVar));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [bgf, java.lang.Object] */
    private final bge g(bvw bvwVar) {
        return bvwVar.c.b(this);
    }

    public final synchronized bge a(Class cls, Class cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            for (bvw bvwVar : this.b) {
                Set set = this.c;
                if (set.contains(bvwVar)) {
                    z = true;
                } else if (bvwVar.i(cls) && ((Class) bvwVar.b).isAssignableFrom(cls2)) {
                    set.add(bvwVar);
                    arrayList.add(g(bvwVar));
                    set.remove(bvwVar);
                }
            }
            if (arrayList.size() > 1) {
                return new bgh(arrayList, this.d);
            }
            if (arrayList.size() == 1) {
                return (bge) arrayList.get(0);
            }
            if (!z) {
                throw new azz(cls, cls2);
            }
            return a;
        } catch (Throwable th) {
            this.c.clear();
            throw th;
        }
    }

    public final synchronized List b(Class cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (bvw bvwVar : this.b) {
                Set set = this.c;
                if (!set.contains(bvwVar) && bvwVar.i(cls)) {
                    set.add(bvwVar);
                    arrayList.add(g(bvwVar));
                    set.remove(bvwVar);
                }
            }
        } finally {
        }
        return arrayList;
    }

    public final synchronized List c(Class cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (bvw bvwVar : this.b) {
            Object obj = bvwVar.b;
            if (!arrayList.contains(obj) && bvwVar.i(cls)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final synchronized void d(Class cls, Class cls2, bgf bgfVar) {
        f(cls, cls2, bgfVar, true);
    }

    public final synchronized void e(Class cls, Class cls2, bgf bgfVar) {
        f(cls, cls2, bgfVar, false);
    }
}
