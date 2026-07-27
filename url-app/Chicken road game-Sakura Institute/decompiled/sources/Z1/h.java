package Z1;

import a.AbstractC0345a;
import a2.EnumC0421j;
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
import s2.InterfaceC1195a;
import s2.InterfaceC1196b;
import u2.InterfaceC1229b;

/* loaded from: classes.dex */
public final class h implements c {

    /* renamed from: h, reason: collision with root package name */
    public static final f f4573h = new f(0);

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f4574a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f4575b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f4576c;

    /* renamed from: d, reason: collision with root package name */
    public final HashSet f4577d;

    /* renamed from: e, reason: collision with root package name */
    public final m f4578e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReference f4579f;

    /* renamed from: g, reason: collision with root package name */
    public final E1.i f4580g;

    public h(ArrayList arrayList, ArrayList arrayList2, E1.i iVar) {
        int i2 = 0;
        EnumC0421j enumC0421j = EnumC0421j.f4935d;
        this.f4574a = new HashMap();
        this.f4575b = new HashMap();
        this.f4576c = new HashMap();
        this.f4577d = new HashSet();
        this.f4579f = new AtomicReference();
        EnumC0421j enumC0421j2 = EnumC0421j.f4935d;
        m mVar = new m();
        new HashMap();
        mVar.f4589a = new ArrayDeque();
        this.f4578e = mVar;
        this.f4580g = iVar;
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(b.b(mVar, m.class, InterfaceC1196b.class, InterfaceC1195a.class));
        arrayList3.add(b.b(this, h.class, new Class[0]));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar != null) {
                arrayList3.add(bVar);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList4.add(it2.next());
        }
        ArrayList arrayList5 = new ArrayList();
        synchronized (this) {
            Iterator it3 = arrayList4.iterator();
            while (it3.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((InterfaceC1229b) it3.next()).get();
                    if (componentRegistrar != null) {
                        arrayList3.addAll(this.f4580g.l(componentRegistrar));
                        it3.remove();
                    }
                } catch (n e4) {
                    it3.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e4);
                }
            }
            Iterator it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                Object[] array = ((b) it4.next()).f4562b.toArray();
                int length = array.length;
                int i4 = 0;
                while (true) {
                    if (i4 < length) {
                        Object obj = array[i4];
                        if (obj.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                            if (this.f4577d.contains(obj.toString())) {
                                it4.remove();
                                break;
                            }
                            this.f4577d.add(obj.toString());
                        }
                        i4++;
                    }
                }
            }
            if (this.f4574a.isEmpty()) {
                AbstractC0345a.p(arrayList3);
            } else {
                ArrayList arrayList6 = new ArrayList(this.f4574a.keySet());
                arrayList6.addAll(arrayList3);
                AbstractC0345a.p(arrayList6);
            }
            Iterator it5 = arrayList3.iterator();
            while (it5.hasNext()) {
                b bVar2 = (b) it5.next();
                this.f4574a.put(bVar2, new o(new g(this, i2, bVar2)));
            }
            arrayList5.addAll(k(arrayList3));
            arrayList5.addAll(l());
            j();
        }
        Iterator it6 = arrayList5.iterator();
        while (it6.hasNext()) {
            ((Runnable) it6.next()).run();
        }
        Boolean bool = (Boolean) this.f4579f.get();
        if (bool != null) {
            i(this.f4574a, bool.booleanValue());
        }
    }

    @Override // Z1.c
    public final synchronized InterfaceC1229b c(t tVar) {
        p pVar = (p) this.f4576c.get(tVar);
        if (pVar != null) {
            return pVar;
        }
        return f4573h;
    }

    @Override // Z1.c
    public final synchronized InterfaceC1229b e(t tVar) {
        return (InterfaceC1229b) this.f4575b.get(tVar);
    }

    @Override // Z1.c
    public final r g(t tVar) {
        InterfaceC1229b e4 = e(tVar);
        return e4 == null ? new r(r.f4598c, r.f4599d) : e4 instanceof r ? (r) e4 : new r(null, e4);
    }

    public final void i(HashMap hashMap, boolean z4) {
        ArrayDeque arrayDeque;
        for (Map.Entry entry : hashMap.entrySet()) {
            b bVar = (b) entry.getKey();
            bVar.getClass();
        }
        m mVar = this.f4578e;
        synchronized (mVar) {
            arrayDeque = mVar.f4589a;
            if (arrayDeque != null) {
                mVar.f4589a = null;
            } else {
                arrayDeque = null;
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

    public final void j() {
        for (b bVar : this.f4574a.keySet()) {
            for (k kVar : bVar.f4563c) {
                boolean z4 = kVar.f4587b == 2;
                t tVar = kVar.f4586a;
                if (z4) {
                    HashMap hashMap = this.f4576c;
                    if (!hashMap.containsKey(tVar)) {
                        Set emptySet = Collections.emptySet();
                        p pVar = new p();
                        pVar.f4594b = null;
                        pVar.f4593a = Collections.newSetFromMap(new ConcurrentHashMap());
                        pVar.f4593a.addAll(emptySet);
                        hashMap.put(tVar, pVar);
                    }
                }
                HashMap hashMap2 = this.f4575b;
                if (hashMap2.containsKey(tVar)) {
                    continue;
                } else {
                    int i2 = kVar.f4587b;
                    if (i2 == 1) {
                        throw new l("Unsatisfied dependency for component " + bVar + ": " + tVar);
                    }
                    if (i2 != 2) {
                        hashMap2.put(tVar, new r(r.f4598c, r.f4599d));
                    }
                }
            }
        }
    }

    public final ArrayList k(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar.f4564d == 0) {
                InterfaceC1229b interfaceC1229b = (InterfaceC1229b) this.f4574a.get(bVar);
                for (t tVar : bVar.f4562b) {
                    HashMap hashMap = this.f4575b;
                    if (hashMap.containsKey(tVar)) {
                        arrayList2.add(new B1.o((r) ((InterfaceC1229b) hashMap.get(tVar)), 2, interfaceC1229b));
                    } else {
                        hashMap.put(tVar, interfaceC1229b);
                    }
                }
            }
        }
        return arrayList2;
    }

    public final ArrayList l() {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.f4574a.entrySet()) {
            b bVar = (b) entry.getKey();
            if (bVar.f4564d != 0) {
                InterfaceC1229b interfaceC1229b = (InterfaceC1229b) entry.getValue();
                for (t tVar : bVar.f4562b) {
                    if (!hashMap.containsKey(tVar)) {
                        hashMap.put(tVar, new HashSet());
                    }
                    ((Set) hashMap.get(tVar)).add(interfaceC1229b);
                }
            }
        }
        for (Map.Entry entry2 : hashMap.entrySet()) {
            Object key = entry2.getKey();
            HashMap hashMap2 = this.f4576c;
            if (hashMap2.containsKey(key)) {
                p pVar = (p) hashMap2.get(entry2.getKey());
                Iterator it = ((Set) entry2.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new B1.o(pVar, 3, (InterfaceC1229b) it.next()));
                }
            } else {
                t tVar2 = (t) entry2.getKey();
                Set set = (Set) ((Collection) entry2.getValue());
                p pVar2 = new p();
                pVar2.f4594b = null;
                pVar2.f4593a = Collections.newSetFromMap(new ConcurrentHashMap());
                pVar2.f4593a.addAll(set);
                hashMap2.put(tVar2, pVar2);
            }
        }
        return arrayList;
    }
}
