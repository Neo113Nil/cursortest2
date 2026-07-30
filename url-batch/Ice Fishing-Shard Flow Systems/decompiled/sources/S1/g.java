package S1;

import android.util.Log;
import b2.C0270a;
import b2.InterfaceC0271b;
import b2.InterfaceC0272c;
import com.google.firebase.components.ComponentRegistrar;
import e2.InterfaceC0372a;
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
import z1.AbstractC1053a;

/* loaded from: classes.dex */
public final class g implements c {

    /* renamed from: h, reason: collision with root package name */
    public static final f f2475h = new f(0);

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f2476a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f2477b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f2478c;

    /* renamed from: d, reason: collision with root package name */
    public final HashSet f2479d;

    /* renamed from: e, reason: collision with root package name */
    public final l f2480e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReference f2481f;

    /* renamed from: g, reason: collision with root package name */
    public final q1.h f2482g;

    public g(ArrayList arrayList, ArrayList arrayList2, q1.h hVar) {
        T1.k kVar = T1.k.f2597d;
        this.f2476a = new HashMap();
        this.f2477b = new HashMap();
        this.f2478c = new HashMap();
        this.f2479d = new HashSet();
        this.f2481f = new AtomicReference();
        l lVar = new l();
        this.f2480e = lVar;
        this.f2482g = hVar;
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(b.b(lVar, l.class, InterfaceC0272c.class, InterfaceC0271b.class));
        int i2 = 0;
        arrayList3.add(b.b(this, g.class, new Class[0]));
        int size = arrayList2.size();
        int i5 = 0;
        while (i5 < size) {
            Object obj = arrayList2.get(i5);
            i5++;
            b bVar = (b) obj;
            if (bVar != null) {
                arrayList3.add(bVar);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        int size2 = arrayList.size();
        int i7 = 0;
        while (i7 < size2) {
            Object obj2 = arrayList.get(i7);
            i7++;
            arrayList4.add(obj2);
        }
        ArrayList arrayList5 = new ArrayList();
        synchronized (this) {
            Iterator it = arrayList4.iterator();
            while (it.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((InterfaceC0372a) it.next()).get();
                    if (componentRegistrar != null) {
                        arrayList3.addAll(this.f2482g.t(componentRegistrar));
                        it.remove();
                    }
                } catch (m e7) {
                    it.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e7);
                }
            }
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                Object[] array = ((b) it2.next()).f2466b.toArray();
                int length = array.length;
                int i8 = 0;
                while (true) {
                    if (i8 < length) {
                        Object obj3 = array[i8];
                        if (obj3.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                            if (this.f2479d.contains(obj3.toString())) {
                                it2.remove();
                                break;
                            }
                            this.f2479d.add(obj3.toString());
                        }
                        i8++;
                    }
                }
            }
            if (this.f2476a.isEmpty()) {
                AbstractC1053a.q(arrayList3);
            } else {
                ArrayList arrayList6 = new ArrayList(this.f2476a.keySet());
                arrayList6.addAll(arrayList3);
                AbstractC1053a.q(arrayList6);
            }
            int size3 = arrayList3.size();
            int i9 = 0;
            while (i9 < size3) {
                Object obj4 = arrayList3.get(i9);
                i9++;
                b bVar2 = (b) obj4;
                this.f2476a.put(bVar2, new n(new P1.c(this, 1, bVar2)));
            }
            arrayList5.addAll(i(arrayList3));
            arrayList5.addAll(j());
            h();
        }
        int size4 = arrayList5.size();
        while (i2 < size4) {
            Object obj5 = arrayList5.get(i2);
            i2++;
            ((Runnable) obj5).run();
        }
        Boolean bool = (Boolean) this.f2481f.get();
        if (bool != null) {
            g(this.f2476a, bool.booleanValue());
        }
    }

    @Override // S1.c
    public final synchronized InterfaceC0372a c(r rVar) {
        o oVar = (o) this.f2478c.get(rVar);
        if (oVar != null) {
            return oVar;
        }
        return f2475h;
    }

    @Override // S1.c
    public final synchronized InterfaceC0372a f(r rVar) {
        O6.g.A(rVar, "Null interface requested.");
        return (InterfaceC0372a) this.f2477b.get(rVar);
    }

    public final void g(HashMap hashMap, boolean z7) {
        ArrayDeque arrayDeque;
        for (Map.Entry entry : hashMap.entrySet()) {
            b bVar = (b) entry.getKey();
            InterfaceC0372a interfaceC0372a = (InterfaceC0372a) entry.getValue();
            int i2 = bVar.f2468d;
            if (i2 == 1 || (i2 == 2 && z7)) {
                interfaceC0372a.get();
            }
        }
        l lVar = this.f2480e;
        synchronized (lVar) {
            try {
                arrayDeque = lVar.f2492b;
                if (arrayDeque != null) {
                    lVar.f2492b = null;
                } else {
                    arrayDeque = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (arrayDeque != null) {
            Iterator it = arrayDeque.iterator();
            while (it.hasNext()) {
                lVar.a((C0270a) it.next());
            }
        }
    }

    public final void h() {
        for (b bVar : this.f2476a.keySet()) {
            for (j jVar : bVar.f2467c) {
                if (jVar.f2489b == 2 && !this.f2478c.containsKey(jVar.f2488a)) {
                    HashMap hashMap = this.f2478c;
                    r rVar = jVar.f2488a;
                    Set set = Collections.EMPTY_SET;
                    o oVar = new o();
                    oVar.f2498b = null;
                    oVar.f2497a = Collections.newSetFromMap(new ConcurrentHashMap());
                    oVar.f2497a.addAll(set);
                    hashMap.put(rVar, oVar);
                } else if (this.f2477b.containsKey(jVar.f2488a)) {
                    continue;
                } else {
                    int i2 = jVar.f2489b;
                    if (i2 == 1) {
                        throw new k("Unsatisfied dependency for component " + bVar + ": " + jVar.f2488a);
                    }
                    if (i2 != 2) {
                        HashMap hashMap2 = this.f2477b;
                        r rVar2 = jVar.f2488a;
                        A4.c cVar = p.f2499c;
                        f fVar = p.f2500d;
                        p pVar = new p();
                        pVar.f2501a = cVar;
                        pVar.f2502b = fVar;
                        hashMap2.put(rVar2, pVar);
                    }
                }
            }
        }
    }

    public final ArrayList i(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            b bVar = (b) obj;
            if (bVar.f2469e == 0) {
                InterfaceC0372a interfaceC0372a = (InterfaceC0372a) this.f2476a.get(bVar);
                for (r rVar : bVar.f2466b) {
                    HashMap hashMap = this.f2477b;
                    if (hashMap.containsKey(rVar)) {
                        arrayList2.add(new A.j((p) ((InterfaceC0372a) hashMap.get(rVar)), 7, interfaceC0372a));
                    } else {
                        hashMap.put(rVar, interfaceC0372a);
                    }
                }
            }
        }
        return arrayList2;
    }

    public final ArrayList j() {
        HashMap hashMap = this.f2478c;
        ArrayList arrayList = new ArrayList();
        HashMap hashMap2 = new HashMap();
        for (Map.Entry entry : this.f2476a.entrySet()) {
            b bVar = (b) entry.getKey();
            if (bVar.f2469e != 0) {
                InterfaceC0372a interfaceC0372a = (InterfaceC0372a) entry.getValue();
                for (r rVar : bVar.f2466b) {
                    if (!hashMap2.containsKey(rVar)) {
                        hashMap2.put(rVar, new HashSet());
                    }
                    ((Set) hashMap2.get(rVar)).add(interfaceC0372a);
                }
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (hashMap.containsKey(entry2.getKey())) {
                o oVar = (o) hashMap.get(entry2.getKey());
                Iterator it = ((Set) entry2.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new A.j(oVar, 8, (InterfaceC0372a) it.next()));
                }
            } else {
                r rVar2 = (r) entry2.getKey();
                Set set = (Set) ((Collection) entry2.getValue());
                o oVar2 = new o();
                oVar2.f2498b = null;
                oVar2.f2497a = Collections.newSetFromMap(new ConcurrentHashMap());
                oVar2.f2497a.addAll(set);
                hashMap.put(rVar2, oVar2);
            }
        }
        return arrayList;
    }
}
