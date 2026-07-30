package u1;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import s1.InterfaceC4992e;
import y1.C5243r;
import y1.C5247v;
import y1.InterfaceC5244s;

/* loaded from: classes.dex */
public final class y implements InterfaceC5106f, com.bumptech.glide.load.data.c {

    /* renamed from: A, reason: collision with root package name */
    public volatile C5243r f41199A;

    /* renamed from: B, reason: collision with root package name */
    public File f41200B;

    /* renamed from: C, reason: collision with root package name */
    public z f41201C;

    /* renamed from: n, reason: collision with root package name */
    public final h f41202n;

    /* renamed from: u, reason: collision with root package name */
    public final g f41203u;

    /* renamed from: v, reason: collision with root package name */
    public int f41204v;

    /* renamed from: w, reason: collision with root package name */
    public int f41205w = -1;

    /* renamed from: x, reason: collision with root package name */
    public InterfaceC4992e f41206x;

    /* renamed from: y, reason: collision with root package name */
    public List f41207y;

    /* renamed from: z, reason: collision with root package name */
    public int f41208z;

    public y(g gVar, h hVar) {
        this.f41203u = gVar;
        this.f41202n = hVar;
    }

    @Override // u1.InterfaceC5106f
    public final boolean b() {
        List list;
        ArrayList c4;
        ArrayList a9 = this.f41203u.a();
        boolean z8 = false;
        if (!a9.isEmpty()) {
            g gVar = this.f41203u;
            com.bumptech.glide.l a10 = gVar.f41075c.a();
            Class<?> cls = gVar.f41076d.getClass();
            Class cls2 = gVar.f41079g;
            Class cls3 = gVar.f41082k;
            S0.s sVar = a10.f23569h;
            N1.n nVar = (N1.n) ((AtomicReference) sVar.f2952u).getAndSet(null);
            if (nVar == null) {
                nVar = new N1.n(cls, cls2, cls3);
            } else {
                nVar.f1972a = cls;
                nVar.f1973b = cls2;
                nVar.f1974c = cls3;
            }
            synchronized (((s.b) sVar.f2953v)) {
                list = (List) ((s.b) sVar.f2953v).getOrDefault(nVar, null);
            }
            ((AtomicReference) sVar.f2952u).set(nVar);
            List list2 = list;
            if (list == null) {
                ArrayList arrayList = new ArrayList();
                C5247v c5247v = a10.f23562a;
                synchronized (c5247v) {
                    c4 = c5247v.f41861a.c(cls);
                }
                Iterator it = c4.iterator();
                while (it.hasNext()) {
                    Iterator it2 = a10.f23564c.x((Class) it.next(), cls2).iterator();
                    while (it2.hasNext()) {
                        Class cls4 = (Class) it2.next();
                        if (!a10.f23567f.B(cls4, cls3).isEmpty() && !arrayList.contains(cls4)) {
                            arrayList.add(cls4);
                        }
                    }
                }
                S0.s sVar2 = a10.f23569h;
                List unmodifiableList = Collections.unmodifiableList(arrayList);
                synchronized (((s.b) sVar2.f2953v)) {
                    ((s.b) sVar2.f2953v).put(new N1.n(cls, cls2, cls3), unmodifiableList);
                }
                list2 = arrayList;
            }
            if (!list2.isEmpty()) {
                while (true) {
                    List list3 = this.f41207y;
                    if (list3 != null && this.f41208z < list3.size()) {
                        this.f41199A = null;
                        while (!z8 && this.f41208z < this.f41207y.size()) {
                            List list4 = this.f41207y;
                            int i = this.f41208z;
                            this.f41208z = i + 1;
                            InterfaceC5244s interfaceC5244s = (InterfaceC5244s) list4.get(i);
                            File file = this.f41200B;
                            g gVar2 = this.f41203u;
                            this.f41199A = interfaceC5244s.b(file, gVar2.f41077e, gVar2.f41078f, gVar2.i);
                            if (this.f41199A != null && this.f41203u.c(this.f41199A.f41859c.a()) != null) {
                                this.f41199A.f41859c.e(this.f41203u.f41086o, this);
                                z8 = true;
                            }
                        }
                        return z8;
                    }
                    int i4 = this.f41205w + 1;
                    this.f41205w = i4;
                    if (i4 >= list2.size()) {
                        int i9 = this.f41204v + 1;
                        this.f41204v = i9;
                        if (i9 >= a9.size()) {
                            break;
                        }
                        this.f41205w = 0;
                    }
                    InterfaceC4992e interfaceC4992e = (InterfaceC4992e) a9.get(this.f41204v);
                    Class cls5 = (Class) list2.get(this.f41205w);
                    s1.l e6 = this.f41203u.e(cls5);
                    g gVar3 = this.f41203u;
                    this.f41201C = new z(gVar3.f41075c.f23548a, interfaceC4992e, gVar3.f41085n, gVar3.f41077e, gVar3.f41078f, e6, cls5, gVar3.i);
                    File d2 = gVar3.f41080h.a().d(this.f41201C);
                    this.f41200B = d2;
                    if (d2 != null) {
                        this.f41206x = interfaceC4992e;
                        this.f41207y = this.f41203u.f41075c.a().f(d2);
                        this.f41208z = 0;
                    }
                }
            } else if (!File.class.equals(this.f41203u.f41082k)) {
                throw new IllegalStateException("Failed to find any load path from " + this.f41203u.f41076d.getClass() + " to " + this.f41203u.f41082k);
            }
        }
        return false;
    }

    @Override // u1.InterfaceC5106f
    public final void cancel() {
        C5243r c5243r = this.f41199A;
        if (c5243r != null) {
            c5243r.f41859c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.c
    public final void d(Exception exc) {
        this.f41202n.c(this.f41201C, exc, this.f41199A.f41859c, 4);
    }

    @Override // com.bumptech.glide.load.data.c
    public final void g(Object obj) {
        this.f41202n.a(this.f41206x, obj, this.f41199A.f41859c, 4, this.f41201C);
    }
}
