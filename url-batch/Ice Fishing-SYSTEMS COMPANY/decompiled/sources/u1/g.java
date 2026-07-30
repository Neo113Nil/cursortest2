package u1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import s1.InterfaceC4989b;
import s1.InterfaceC4992e;
import y1.C5243r;
import y1.InterfaceC5244s;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f41073a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f41074b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public com.bumptech.glide.i f41075c;

    /* renamed from: d, reason: collision with root package name */
    public Object f41076d;

    /* renamed from: e, reason: collision with root package name */
    public int f41077e;

    /* renamed from: f, reason: collision with root package name */
    public int f41078f;

    /* renamed from: g, reason: collision with root package name */
    public Class f41079g;

    /* renamed from: h, reason: collision with root package name */
    public N1.h f41080h;
    public s1.h i;

    /* renamed from: j, reason: collision with root package name */
    public N1.c f41081j;

    /* renamed from: k, reason: collision with root package name */
    public Class f41082k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f41083l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f41084m;

    /* renamed from: n, reason: collision with root package name */
    public InterfaceC4992e f41085n;

    /* renamed from: o, reason: collision with root package name */
    public com.bumptech.glide.j f41086o;

    /* renamed from: p, reason: collision with root package name */
    public j f41087p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f41088q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f41089r;

    public final ArrayList a() {
        boolean z8 = this.f41084m;
        ArrayList arrayList = this.f41074b;
        if (!z8) {
            this.f41084m = true;
            arrayList.clear();
            ArrayList b9 = b();
            int size = b9.size();
            for (int i = 0; i < size; i++) {
                C5243r c5243r = (C5243r) b9.get(i);
                if (!arrayList.contains(c5243r.f41857a)) {
                    arrayList.add(c5243r.f41857a);
                }
                int i4 = 0;
                while (true) {
                    List list = c5243r.f41858b;
                    if (i4 < list.size()) {
                        if (!arrayList.contains(list.get(i4))) {
                            arrayList.add((InterfaceC4992e) list.get(i4));
                        }
                        i4++;
                    }
                }
            }
        }
        return arrayList;
    }

    public final ArrayList b() {
        boolean z8 = this.f41083l;
        ArrayList arrayList = this.f41073a;
        if (!z8) {
            this.f41083l = true;
            arrayList.clear();
            List f6 = this.f41075c.a().f(this.f41076d);
            int size = f6.size();
            for (int i = 0; i < size; i++) {
                C5243r b9 = ((InterfaceC5244s) f6.get(i)).b(this.f41076d, this.f41077e, this.f41078f, this.i);
                if (b9 != null) {
                    arrayList.add(b9);
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final v c(Class cls) {
        v vVar;
        Class cls2;
        Class cls3;
        Class cls4;
        v vVar2;
        ArrayList arrayList;
        G1.c cVar;
        Class cls5 = cls;
        com.bumptech.glide.l a9 = this.f41075c.a();
        Class cls6 = this.f41079g;
        Class cls7 = this.f41082k;
        I1.c cVar2 = a9.i;
        N1.n nVar = (N1.n) cVar2.f1249b.getAndSet(null);
        if (nVar == null) {
            nVar = new N1.n();
        }
        nVar.f1972a = cls5;
        nVar.f1973b = cls6;
        nVar.f1974c = cls7;
        synchronized (cVar2.f1248a) {
            vVar = (v) cVar2.f1248a.getOrDefault(nVar, null);
        }
        cVar2.f1249b.set(nVar);
        a9.i.getClass();
        if (I1.c.f1247c.equals(vVar)) {
            return null;
        }
        if (vVar != null) {
            return vVar;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = a9.f23564c.x(cls5, cls6).iterator();
        while (it.hasNext()) {
            Class<?> cls8 = (Class) it.next();
            Iterator it2 = a9.f23567f.B(cls8, cls7).iterator();
            while (it2.hasNext()) {
                Class cls9 = (Class) it2.next();
                S0.c cVar3 = a9.f23564c;
                synchronized (cVar3) {
                    arrayList = new ArrayList();
                    Iterator it3 = ((ArrayList) cVar3.f2886u).iterator();
                    while (it3.hasNext()) {
                        List<I1.d> list = (List) ((HashMap) cVar3.f2887v).get((String) it3.next());
                        if (list != null) {
                            for (I1.d dVar : list) {
                                if (dVar.f1250a.isAssignableFrom(cls5) && cls8.isAssignableFrom(dVar.f1251b)) {
                                    arrayList.add(dVar.f1252c);
                                }
                            }
                        }
                    }
                }
                h4.c cVar4 = a9.f23567f;
                synchronized (cVar4) {
                    if (!cls9.isAssignableFrom(cls8)) {
                        Iterator it4 = ((ArrayList) cVar4.f38233u).iterator();
                        while (it4.hasNext()) {
                            G1.d dVar2 = (G1.d) it4.next();
                            if (dVar2.f1197a.isAssignableFrom(cls8) && cls9.isAssignableFrom(dVar2.f1198b)) {
                                cVar = dVar2.f1199c;
                            } else {
                                cls5 = cls;
                            }
                        }
                        throw new IllegalArgumentException("No transcoder registered to transcode from " + cls8 + " to " + cls9);
                    }
                    cVar = G1.e.f1200u;
                }
                arrayList2.add(new i(cls5, cls8, cls9, arrayList, cVar, a9.f23570j));
                cls5 = cls;
            }
            cls5 = cls;
        }
        if (arrayList2.isEmpty()) {
            cls2 = cls;
            cls3 = cls6;
            cls4 = cls7;
            vVar2 = null;
        } else {
            cls2 = cls;
            cls3 = cls6;
            cls4 = cls7;
            vVar2 = new v(cls2, cls3, cls4, arrayList2, a9.f23570j);
        }
        I1.c cVar5 = a9.i;
        synchronized (cVar5.f1248a) {
            cVar5.f1248a.put(new N1.n(cls2, cls3, cls4), vVar2 != null ? vVar2 : I1.c.f1247c);
        }
        return vVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0029, code lost:
    
        r1 = r3.f1245b;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InterfaceC4989b d(Object obj) {
        InterfaceC4989b interfaceC4989b;
        I0.j jVar = this.f41075c.a().f23563b;
        Class<?> cls = obj.getClass();
        synchronized (jVar) {
            Iterator it = ((ArrayList) jVar.f1233u).iterator();
            while (true) {
                if (!it.hasNext()) {
                    interfaceC4989b = null;
                    break;
                }
                I1.a aVar = (I1.a) it.next();
                if (aVar.f1244a.isAssignableFrom(cls)) {
                    break;
                }
            }
        }
        if (interfaceC4989b != null) {
            return interfaceC4989b;
        }
        throw new com.bumptech.glide.k("Failed to find source encoder for data class: " + obj.getClass());
    }

    public final s1.l e(Class cls) {
        s1.l lVar = (s1.l) this.f41081j.getOrDefault(cls, null);
        if (lVar == null) {
            Iterator it = ((s.g) this.f41081j.entrySet()).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    lVar = (s1.l) entry.getValue();
                    break;
                }
            }
        }
        if (lVar != null) {
            return lVar;
        }
        if (!this.f41081j.isEmpty() || !this.f41088q) {
            return A1.e.f18b;
        }
        throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
    }
}
