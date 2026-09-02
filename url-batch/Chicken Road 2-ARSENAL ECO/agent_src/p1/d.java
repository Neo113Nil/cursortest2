package p1;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import m1.AbstractC0521b;
import x1.InterfaceC0726a;
import x1.InterfaceC0727b;
import y1.C0760d;

/* loaded from: classes.dex */
public final class d implements InterfaceC0577b {

    /* renamed from: m, reason: collision with root package name */
    public static final H1.o f5667m = new H1.o(1);

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f5668f;

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f5669g;

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f5670h;

    /* renamed from: i, reason: collision with root package name */
    public final HashSet f5671i;

    /* renamed from: j, reason: collision with root package name */
    public final i f5672j;

    /* renamed from: k, reason: collision with root package name */
    public final AtomicReference f5673k;

    /* renamed from: l, reason: collision with root package name */
    public final C0760d f5674l;

    public d(ArrayList arrayList, ArrayList arrayList2, C0760d c0760d) {
        q1.i iVar = q1.i.f5781f;
        this.f5668f = new HashMap();
        this.f5669g = new HashMap();
        this.f5670h = new HashMap();
        this.f5671i = new HashSet();
        this.f5673k = new AtomicReference();
        i iVar2 = new i();
        this.f5672j = iVar2;
        this.f5674l = c0760d;
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(C0576a.b(iVar2, i.class, InterfaceC0727b.class, InterfaceC0726a.class));
        int i7 = 0;
        arrayList3.add(C0576a.b(this, d.class, new Class[0]));
        int size = arrayList2.size();
        int i8 = 0;
        while (i8 < size) {
            Object obj = arrayList2.get(i8);
            i8++;
            C0576a c0576a = (C0576a) obj;
            if (c0576a != null) {
                arrayList3.add(c0576a);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        int size2 = arrayList.size();
        int i9 = 0;
        while (i9 < size2) {
            Object obj2 = arrayList.get(i9);
            i9++;
            arrayList4.add(obj2);
        }
        ArrayList arrayList5 = new ArrayList();
        synchronized (this) {
            Iterator it = arrayList4.iterator();
            while (it.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((A1.a) it.next()).get();
                    if (componentRegistrar != null) {
                        arrayList3.addAll(this.f5674l.i(componentRegistrar));
                        it.remove();
                    }
                } catch (j e4) {
                    it.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e4);
                }
            }
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                Object[] array = ((C0576a) it2.next()).f5661b.toArray();
                int length = array.length;
                int i10 = 0;
                while (true) {
                    if (i10 < length) {
                        Object obj3 = array[i10];
                        if (obj3.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                            if (this.f5671i.contains(obj3.toString())) {
                                it2.remove();
                                break;
                            }
                            this.f5671i.add(obj3.toString());
                        }
                        i10++;
                    }
                }
            }
            if (this.f5668f.isEmpty()) {
                i6.g.m(arrayList3);
            } else {
                ArrayList arrayList6 = new ArrayList(this.f5668f.keySet());
                arrayList6.addAll(arrayList3);
                i6.g.m(arrayList6);
            }
            int size3 = arrayList3.size();
            int i11 = 0;
            while (i11 < size3) {
                Object obj4 = arrayList3.get(i11);
                i11++;
                C0576a c0576a2 = (C0576a) obj4;
                this.f5668f.put(c0576a2, new k(new m1.c(this, 1, c0576a2)));
            }
            arrayList5.addAll(i(arrayList3));
            arrayList5.addAll(j());
            h();
        }
        int size4 = arrayList5.size();
        while (i7 < size4) {
            Object obj5 = arrayList5.get(i7);
            i7++;
            ((Runnable) obj5).run();
        }
        Boolean bool = (Boolean) this.f5673k.get();
        if (bool != null) {
            g(this.f5668f, bool.booleanValue());
        }
    }

    @Override // p1.InterfaceC0577b
    public final synchronized A1.a d(o oVar) {
        AbstractC0521b.f(oVar, "Null interface requested.");
        return (A1.a) this.f5669g.get(oVar);
    }

    @Override // p1.InterfaceC0577b
    public final synchronized A1.a f(o oVar) {
        l lVar = (l) this.f5670h.get(oVar);
        if (lVar != null) {
            return lVar;
        }
        return f5667m;
    }

    public final void g(HashMap hashMap, boolean z5) {
        ArrayDeque arrayDeque;
        for (Map.Entry entry : hashMap.entrySet()) {
            C0576a c0576a = (C0576a) entry.getKey();
            A1.a aVar = (A1.a) entry.getValue();
            int i7 = c0576a.f5663d;
            if (i7 == 1 || (i7 == 2 && z5)) {
                aVar.get();
            }
        }
        i iVar = this.f5672j;
        synchronized (iVar) {
            try {
                arrayDeque = iVar.f5684b;
                if (arrayDeque != null) {
                    iVar.f5684b = null;
                } else {
                    arrayDeque = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (arrayDeque != null) {
            Iterator it = arrayDeque.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
        }
    }

    public final void h() {
        for (C0576a c0576a : this.f5668f.keySet()) {
            for (g gVar : c0576a.f5662c) {
                if (gVar.f5681b == 2 && !this.f5670h.containsKey(gVar.f5680a)) {
                    HashMap hashMap = this.f5670h;
                    o oVar = gVar.f5680a;
                    Set set = Collections.EMPTY_SET;
                    l lVar = new l();
                    lVar.f5690b = null;
                    lVar.f5689a = Collections.newSetFromMap(new ConcurrentHashMap());
                    lVar.f5689a.addAll(set);
                    hashMap.put(oVar, lVar);
                } else if (this.f5669g.containsKey(gVar.f5680a)) {
                    continue;
                } else {
                    int i7 = gVar.f5681b;
                    if (i7 == 1) {
                        throw new h("Unsatisfied dependency for component " + c0576a + ": " + gVar.f5680a);
                    }
                    if (i7 != 2) {
                        HashMap hashMap2 = this.f5669g;
                        o oVar2 = gVar.f5680a;
                        B1.g gVar2 = m.f5691c;
                        H1.o oVar3 = m.f5692d;
                        m mVar = new m();
                        mVar.f5693a = gVar2;
                        mVar.f5694b = oVar3;
                        hashMap2.put(oVar2, mVar);
                    }
                }
            }
        }
    }

    public final ArrayList i(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            C0576a c0576a = (C0576a) obj;
            if (c0576a.f5664e == 0) {
                A1.a aVar = (A1.a) this.f5668f.get(c0576a);
                for (o oVar : c0576a.f5661b) {
                    HashMap hashMap = this.f5669g;
                    if (hashMap.containsKey(oVar)) {
                        arrayList2.add(new G4.c((m) ((A1.a) hashMap.get(oVar)), 7, aVar));
                    } else {
                        hashMap.put(oVar, aVar);
                    }
                }
            }
        }
        return arrayList2;
    }

    public final ArrayList j() {
        HashMap hashMap = this.f5670h;
        ArrayList arrayList = new ArrayList();
        HashMap hashMap2 = new HashMap();
        for (Map.Entry entry : this.f5668f.entrySet()) {
            C0576a c0576a = (C0576a) entry.getKey();
            if (c0576a.f5664e != 0) {
                A1.a aVar = (A1.a) entry.getValue();
                for (o oVar : c0576a.f5661b) {
                    if (!hashMap2.containsKey(oVar)) {
                        hashMap2.put(oVar, new HashSet());
                    }
                    ((Set) hashMap2.get(oVar)).add(aVar);
                }
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (hashMap.containsKey(entry2.getKey())) {
                l lVar = (l) hashMap.get(entry2.getKey());
                Iterator it = ((Set) entry2.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new G4.c(lVar, 8, (A1.a) it.next()));
                }
            } else {
                o oVar2 = (o) entry2.getKey();
                Set set = (Set) ((Collection) entry2.getValue());
                l lVar2 = new l();
                lVar2.f5690b = null;
                lVar2.f5689a = Collections.newSetFromMap(new ConcurrentHashMap());
                lVar2.f5689a.addAll(set);
                hashMap.put(oVar2, lVar2);
            }
        }
        return arrayList;
    }
}
