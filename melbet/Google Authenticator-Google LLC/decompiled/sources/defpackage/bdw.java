package defpackage;

import j$.util.DesugarCollections;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bdw implements bcw, bbt {
    private final bcv a;
    private final bcx b;
    private int c;
    private int d = -1;
    private bbh e;
    private List f;
    private int g;
    private File h;
    private bdx i;
    private volatile bvw j;

    public bdw(bcx bcxVar, bcv bcvVar) {
        this.b = bcxVar;
        this.a = bcvVar;
    }

    private final boolean d() {
        return this.g < this.f.size();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [bbu, java.lang.Object] */
    @Override // defpackage.bcw
    public final void a() {
        bvw bvwVar = this.j;
        if (bvwVar != null) {
            bvwVar.b.bo();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [bbu, java.lang.Object] */
    @Override // defpackage.bbt
    public final void b(Object obj) {
        this.a.d(this.e, obj, this.j.b, 4, this.i);
    }

    /* JADX WARN: Type inference failed for: r1v27, types: [bbu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v31, types: [bbu, java.lang.Object] */
    @Override // defpackage.bcw
    public final boolean c() {
        List list;
        bcx bcxVar = this.b;
        List d = bcxVar.d();
        boolean z = false;
        if (d.isEmpty()) {
            return false;
        }
        bac a = bcxVar.c.a();
        Class<?> cls = bcxVar.d.getClass();
        Class cls2 = bcxVar.g;
        Class cls3 = bcxVar.j;
        afr afrVar = a.g;
        bmg bmgVar = (bmg) ((AtomicReference) afrVar.a).getAndSet(null);
        if (bmgVar == null) {
            bmgVar = new bmg(cls, cls2, cls3);
        } else {
            bmgVar.a(cls, cls2, cls3);
        }
        Object obj = afrVar.b;
        synchronized (obj) {
            list = (List) ((qy) obj).get(bmgVar);
        }
        ((AtomicReference) afrVar.a).set(bmgVar);
        if (list == null) {
            list = new ArrayList();
            Iterator it = a.h.D(cls).iterator();
            while (it.hasNext()) {
                for (Class cls4 : a.f.t((Class) it.next(), cls2)) {
                    if (!a.e.i(cls4, cls3).isEmpty() && !list.contains(cls4)) {
                        list.add(cls4);
                    }
                }
            }
            afr afrVar2 = a.g;
            List unmodifiableList = DesugarCollections.unmodifiableList(list);
            Object obj2 = afrVar2.b;
            synchronized (obj2) {
                ((qy) obj2).put(new bmg(cls, cls2, cls3), unmodifiableList);
            }
        }
        if (list.isEmpty()) {
            bcx bcxVar2 = this.b;
            if (File.class.equals(bcxVar2.j)) {
                return false;
            }
            throw new IllegalStateException("Failed to find any load path from " + String.valueOf(bcxVar2.d.getClass()) + " to " + String.valueOf(bcxVar2.j));
        }
        while (true) {
            if (this.f != null && d()) {
                this.j = null;
                while (!z && d()) {
                    List list2 = this.f;
                    int i = this.g;
                    this.g = i + 1;
                    bge bgeVar = (bge) list2.get(i);
                    File file = this.h;
                    bcx bcxVar3 = this.b;
                    this.j = bgeVar.b(file, bcxVar3.e, bcxVar3.f, bcxVar3.h);
                    if (this.j != null && bcxVar3.g(this.j.b.a())) {
                        this.j.b.f(bcxVar3.n, this);
                        z = true;
                    }
                }
                return z;
            }
            int i2 = this.d + 1;
            this.d = i2;
            if (i2 >= list.size()) {
                int i3 = this.c + 1;
                this.c = i3;
                if (i3 >= d.size()) {
                    return false;
                }
                this.d = 0;
            }
            bbh bbhVar = (bbh) d.get(this.c);
            Class cls5 = (Class) list.get(this.d);
            bcx bcxVar4 = this.b;
            this.i = new bdx(bcxVar4.h(), bbhVar, bcxVar4.m, bcxVar4.e, bcxVar4.f, bcxVar4.a(cls5), cls5, bcxVar4.h);
            File a2 = bcxVar4.c().a(this.i);
            this.h = a2;
            if (a2 != null) {
                this.e = bbhVar;
                this.f = bcxVar4.f(a2);
                this.g = 0;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [bbu, java.lang.Object] */
    @Override // defpackage.bbt
    public final void e(Exception exc) {
        this.a.b(this.i, exc, this.j.b, 4);
    }
}
