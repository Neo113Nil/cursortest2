package l8;

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
import kotlin.collections.i0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class g implements c {

    /* renamed from: v, reason: collision with root package name */
    public static final f f5907v = new f(0);

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f5908d;

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f5909e;

    /* renamed from: i, reason: collision with root package name */
    public final HashMap f5910i;

    /* renamed from: r, reason: collision with root package name */
    public final HashSet f5911r;

    /* renamed from: s, reason: collision with root package name */
    public final l f5912s;

    /* renamed from: t, reason: collision with root package name */
    public final AtomicReference f5913t;

    /* renamed from: u, reason: collision with root package name */
    public final u8.d f5914u;

    public g(ArrayList arrayList, ArrayList arrayList2, u8.d dVar) {
        m8.k kVar = m8.k.f6608d;
        this.f5908d = new HashMap();
        this.f5909e = new HashMap();
        this.f5910i = new HashMap();
        this.f5911r = new HashSet();
        this.f5913t = new AtomicReference();
        l lVar = new l();
        this.f5912s = lVar;
        this.f5914u = dVar;
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(b.c(lVar, l.class, t8.c.class, t8.b.class));
        int i3 = 0;
        arrayList3.add(b.c(this, g.class, new Class[0]));
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            b bVar = (b) obj;
            if (bVar != null) {
                arrayList3.add(bVar);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        int size2 = arrayList.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj2 = arrayList.get(i11);
            i11++;
            arrayList4.add(obj2);
        }
        ArrayList arrayList5 = new ArrayList();
        synchronized (this) {
            Iterator it = arrayList4.iterator();
            while (it.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((w8.a) it.next()).get();
                    if (componentRegistrar != null) {
                        arrayList3.addAll(this.f5914u.f(componentRegistrar));
                        it.remove();
                    }
                } catch (m e2) {
                    it.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e2);
                }
            }
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                Object[] array = ((b) it2.next()).f5899b.toArray();
                int length = array.length;
                int i12 = 0;
                while (true) {
                    if (i12 < length) {
                        Object obj3 = array[i12];
                        if (obj3.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                            if (this.f5911r.contains(obj3.toString())) {
                                it2.remove();
                                break;
                            }
                            this.f5911r.add(obj3.toString());
                        }
                        i12++;
                    }
                }
            }
            if (this.f5908d.isEmpty()) {
                g8.b.v(arrayList3);
            } else {
                ArrayList arrayList6 = new ArrayList(this.f5908d.keySet());
                arrayList6.addAll(arrayList3);
                g8.b.v(arrayList6);
            }
            int size3 = arrayList3.size();
            int i13 = 0;
            while (i13 < size3) {
                Object obj4 = arrayList3.get(i13);
                i13++;
                b bVar2 = (b) obj4;
                this.f5908d.put(bVar2, new n(new g8.c(1, this, bVar2)));
            }
            arrayList5.addAll(i(arrayList3));
            arrayList5.addAll(j());
            h();
        }
        int size4 = arrayList5.size();
        while (i3 < size4) {
            Object obj5 = arrayList5.get(i3);
            i3++;
            ((Runnable) obj5).run();
        }
        Boolean bool = (Boolean) this.f5913t.get();
        if (bool != null) {
            b(this.f5908d, bool.booleanValue());
        }
    }

    public final void b(HashMap hashMap, boolean z10) {
        ArrayDeque arrayDeque;
        for (Map.Entry entry : hashMap.entrySet()) {
            b bVar = (b) entry.getKey();
            w8.a aVar = (w8.a) entry.getValue();
            int i3 = bVar.f5901d;
            if (i3 == 1 || (i3 == 2 && z10)) {
                aVar.get();
            }
        }
        l lVar = this.f5912s;
        synchronized (lVar) {
            try {
                arrayDeque = lVar.f5924b;
                if (arrayDeque != null) {
                    lVar.f5924b = null;
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
                throw v4.a.i(it);
            }
        }
    }

    @Override // l8.c
    public final synchronized w8.a c(r rVar) {
        i7.a.z(rVar, "Null interface requested.");
        return (w8.a) this.f5909e.get(rVar);
    }

    @Override // l8.c
    public final synchronized w8.a g(r rVar) {
        o oVar = (o) this.f5910i.get(rVar);
        if (oVar != null) {
            return oVar;
        }
        return f5907v;
    }

    public final void h() {
        for (b bVar : this.f5908d.keySet()) {
            for (j jVar : bVar.f5900c) {
                if (jVar.f5921b == 2 && !this.f5910i.containsKey(jVar.f5920a)) {
                    HashMap hashMap = this.f5910i;
                    r rVar = jVar.f5920a;
                    Set set = Collections.EMPTY_SET;
                    o oVar = new o();
                    oVar.f5930b = null;
                    oVar.f5929a = Collections.newSetFromMap(new ConcurrentHashMap());
                    oVar.f5929a.addAll(set);
                    hashMap.put(rVar, oVar);
                } else if (this.f5909e.containsKey(jVar.f5920a)) {
                    continue;
                } else {
                    int i3 = jVar.f5921b;
                    if (i3 == 1) {
                        throw new k("Unsatisfied dependency for component " + bVar + ": " + jVar.f5920a, 3);
                    }
                    if (i3 != 2) {
                        HashMap hashMap2 = this.f5909e;
                        r rVar2 = jVar.f5920a;
                        i0 i0Var = p.f5931c;
                        f fVar = p.f5932d;
                        p pVar = new p();
                        pVar.f5933a = i0Var;
                        pVar.f5934b = fVar;
                        hashMap2.put(rVar2, pVar);
                    }
                }
            }
        }
    }

    public final ArrayList i(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            b bVar = (b) obj;
            if (bVar.f5902e == 0) {
                w8.a aVar = (w8.a) this.f5908d.get(bVar);
                for (r rVar : bVar.f5899b) {
                    HashMap hashMap = this.f5909e;
                    if (hashMap.containsKey(rVar)) {
                        arrayList2.add(new a6.f(13, (p) ((w8.a) hashMap.get(rVar)), aVar));
                    } else {
                        hashMap.put(rVar, aVar);
                    }
                }
            }
        }
        return arrayList2;
    }

    public final ArrayList j() {
        HashMap hashMap = this.f5910i;
        ArrayList arrayList = new ArrayList();
        HashMap hashMap2 = new HashMap();
        for (Map.Entry entry : this.f5908d.entrySet()) {
            b bVar = (b) entry.getKey();
            if (bVar.f5902e != 0) {
                w8.a aVar = (w8.a) entry.getValue();
                for (r rVar : bVar.f5899b) {
                    if (!hashMap2.containsKey(rVar)) {
                        hashMap2.put(rVar, new HashSet());
                    }
                    ((Set) hashMap2.get(rVar)).add(aVar);
                }
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (hashMap.containsKey(entry2.getKey())) {
                o oVar = (o) hashMap.get(entry2.getKey());
                Iterator it = ((Set) entry2.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new a6.f(14, oVar, (w8.a) it.next()));
                }
            } else {
                r rVar2 = (r) entry2.getKey();
                Set set = (Set) ((Collection) entry2.getValue());
                o oVar2 = new o();
                oVar2.f5930b = null;
                oVar2.f5929a = Collections.newSetFromMap(new ConcurrentHashMap());
                oVar2.f5929a.addAll(set);
                hashMap.put(rVar2, oVar2);
            }
        }
        return arrayList;
    }
}
