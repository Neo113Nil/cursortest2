package e5;

import android.util.Log;
import androidx.room.b0;
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

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class i implements d {

    /* renamed from: h, reason: collision with root package name */
    public static final g f2772h = new g(0);

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f2773a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f2774b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f2775c;

    /* renamed from: d, reason: collision with root package name */
    public final HashSet f2776d;

    /* renamed from: e, reason: collision with root package name */
    public final n f2777e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReference f2778f;

    /* renamed from: g, reason: collision with root package name */
    public final m4.f f2779g;

    public i(ArrayList arrayList, ArrayList arrayList2, m4.f fVar) {
        f5.j jVar = f5.j.f3393f;
        this.f2773a = new HashMap();
        this.f2774b = new HashMap();
        this.f2775c = new HashMap();
        this.f2776d = new HashSet();
        this.f2778f = new AtomicReference();
        f5.j jVar2 = f5.j.f3393f;
        n nVar = new n();
        new HashMap();
        nVar.f2788a = new ArrayDeque();
        this.f2777e = nVar;
        this.f2779g = fVar;
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(c.b(nVar, n.class, x5.b.class, x5.a.class));
        int i7 = 0;
        arrayList3.add(c.b(this, i.class, new Class[0]));
        int size = arrayList2.size();
        int i8 = 0;
        while (i8 < size) {
            Object obj = arrayList2.get(i8);
            i8++;
            c cVar = (c) obj;
            if (cVar != null) {
                arrayList3.add(cVar);
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
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((z5.b) it.next()).get();
                    if (componentRegistrar != null) {
                        arrayList3.addAll(this.f2779g.l(componentRegistrar));
                        it.remove();
                    }
                } catch (o e9) {
                    it.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e9);
                }
            }
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                Object[] array = ((c) it2.next()).f2761b.toArray();
                int length = array.length;
                int i10 = 0;
                while (true) {
                    if (i10 < length) {
                        Object obj3 = array[i10];
                        if (obj3.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                            if (this.f2776d.contains(obj3.toString())) {
                                it2.remove();
                                break;
                            }
                            this.f2776d.add(obj3.toString());
                        }
                        i10++;
                    }
                }
            }
            if (this.f2773a.isEmpty()) {
                a8.d.A(arrayList3);
            } else {
                ArrayList arrayList6 = new ArrayList(this.f2773a.keySet());
                arrayList6.addAll(arrayList3);
                a8.d.A(arrayList6);
            }
            int size3 = arrayList3.size();
            int i11 = 0;
            while (i11 < size3) {
                Object obj4 = arrayList3.get(i11);
                i11++;
                c cVar2 = (c) obj4;
                this.f2773a.put(cVar2, new p(new h(this, i7, cVar2)));
            }
            arrayList5.addAll(k(arrayList3));
            arrayList5.addAll(l());
            j();
        }
        int size4 = arrayList5.size();
        while (i7 < size4) {
            Object obj5 = arrayList5.get(i7);
            i7++;
            ((Runnable) obj5).run();
        }
        Boolean bool = (Boolean) this.f2778f.get();
        if (bool != null) {
            i(this.f2773a, bool.booleanValue());
        }
    }

    @Override // e5.d
    public final synchronized z5.b b(t tVar) {
        return (z5.b) this.f2774b.get(tVar);
    }

    @Override // e5.d
    public final synchronized z5.b c(t tVar) {
        q qVar = (q) this.f2775c.get(tVar);
        if (qVar != null) {
            return qVar;
        }
        return f2772h;
    }

    @Override // e5.d
    public final r g(t tVar) {
        z5.b b9 = b(tVar);
        return b9 == null ? new r(r.f2794c, r.f2795d) : b9 instanceof r ? (r) b9 : new r(null, b9);
    }

    public final void i(HashMap hashMap, boolean z8) {
        ArrayDeque arrayDeque;
        for (Map.Entry entry : hashMap.entrySet()) {
            c cVar = (c) entry.getKey();
            cVar.getClass();
        }
        n nVar = this.f2777e;
        synchronized (nVar) {
            try {
                arrayDeque = nVar.f2788a;
                if (arrayDeque != null) {
                    nVar.f2788a = null;
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

    public final void j() {
        HashMap hashMap = this.f2774b;
        HashMap hashMap2 = this.f2775c;
        for (c cVar : this.f2773a.keySet()) {
            for (l lVar : cVar.f2762c) {
                boolean z8 = lVar.f2786b == 2;
                t tVar = lVar.f2785a;
                if (z8 && !hashMap2.containsKey(tVar)) {
                    Set set = Collections.EMPTY_SET;
                    q qVar = new q();
                    qVar.f2793b = null;
                    qVar.f2792a = Collections.newSetFromMap(new ConcurrentHashMap());
                    qVar.f2792a.addAll(set);
                    hashMap2.put(tVar, qVar);
                } else if (hashMap.containsKey(tVar)) {
                    continue;
                } else {
                    int i7 = lVar.f2786b;
                    if (i7 == 1) {
                        throw new m("Unsatisfied dependency for component " + cVar + ": " + tVar);
                    }
                    if (i7 != 2) {
                        hashMap.put(tVar, new r(r.f2794c, r.f2795d));
                    }
                }
            }
        }
    }

    public final ArrayList k(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            c cVar = (c) obj;
            if (cVar.f2763d == 0) {
                z5.b bVar = (z5.b) this.f2773a.get(cVar);
                for (t tVar : cVar.f2761b) {
                    HashMap hashMap = this.f2774b;
                    if (hashMap.containsKey(tVar)) {
                        arrayList2.add(new b0((r) ((z5.b) hashMap.get(tVar)), 2, bVar));
                    } else {
                        hashMap.put(tVar, bVar);
                    }
                }
            }
        }
        return arrayList2;
    }

    public final ArrayList l() {
        HashMap hashMap = this.f2775c;
        ArrayList arrayList = new ArrayList();
        HashMap hashMap2 = new HashMap();
        for (Map.Entry entry : this.f2773a.entrySet()) {
            c cVar = (c) entry.getKey();
            if (cVar.f2763d != 0) {
                z5.b bVar = (z5.b) entry.getValue();
                for (t tVar : cVar.f2761b) {
                    if (!hashMap2.containsKey(tVar)) {
                        hashMap2.put(tVar, new HashSet());
                    }
                    ((Set) hashMap2.get(tVar)).add(bVar);
                }
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (hashMap.containsKey(entry2.getKey())) {
                q qVar = (q) hashMap.get(entry2.getKey());
                Iterator it = ((Set) entry2.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new b0(qVar, 3, (z5.b) it.next()));
                }
            } else {
                t tVar2 = (t) entry2.getKey();
                Set set = (Set) ((Collection) entry2.getValue());
                q qVar2 = new q();
                qVar2.f2793b = null;
                qVar2.f2792a = Collections.newSetFromMap(new ConcurrentHashMap());
                qVar2.f2792a.addAll(set);
                hashMap.put(tVar2, qVar2);
            }
        }
        return arrayList;
    }
}
