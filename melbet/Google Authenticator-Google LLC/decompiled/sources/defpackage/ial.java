package defpackage;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ial implements iai, ibc {
    private static final icd c = new iaw(1);
    private final List f;
    private final iar h;
    public final Map a = new HashMap();
    private final Map d = new HashMap();
    private final Map e = new HashMap();
    private Set g = new HashSet();
    public final AtomicReference b = new AtomicReference();

    public ial(Iterable iterable, Collection collection) {
        iar iarVar = new iar();
        this.h = iarVar;
        ArrayList<iah> arrayList = new ArrayList();
        arrayList.add(iah.b(iarVar, iar.class, icc.class, icb.class));
        arrayList.add(iah.b(this, ibc.class, new Class[0]));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            iah iahVar = (iah) it.next();
            if (iahVar != null) {
                arrayList.add(iahVar);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = iterable.iterator();
        while (it2.hasNext()) {
            arrayList2.add(it2.next());
        }
        this.f = arrayList2;
        ArrayList arrayList3 = new ArrayList();
        synchronized (this) {
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((icd) it3.next()).a();
                    if (componentRegistrar != null) {
                        arrayList.addAll(componentRegistrar.a());
                        it3.remove();
                    }
                } catch (ias e) {
                    it3.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e);
                }
            }
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                Object[] array = ((iah) it4.next()).a.toArray();
                int length = array.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        Object obj = array[i];
                        if (obj.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                            if (this.g.contains(obj.toString())) {
                                it4.remove();
                                break;
                            }
                            this.g.add(obj.toString());
                        }
                        i++;
                    }
                }
            }
            if (this.a.isEmpty()) {
                hnu.ar(arrayList);
            } else {
                ArrayList arrayList4 = new ArrayList(this.a.keySet());
                arrayList4.addAll(arrayList);
                hnu.ar(arrayList4);
            }
            for (final iah iahVar2 : arrayList) {
                this.a.put(iahVar2, new iat(new icd() { // from class: iak
                    @Override // defpackage.icd
                    public final Object a() {
                        iah iahVar3 = iahVar2;
                        return iahVar3.c.a(new ibb(iahVar3, ial.this));
                    }
                }));
            }
            ArrayList arrayList5 = new ArrayList();
            for (iah iahVar3 : arrayList) {
                if (iahVar3.c()) {
                    icd icdVar = (icd) this.a.get(iahVar3);
                    for (iaz iazVar : iahVar3.a) {
                        boolean containsKey = this.d.containsKey(iazVar);
                        Map map = this.d;
                        if (containsKey) {
                            arrayList5.add(new evb((iax) ((icd) map.get(iazVar)), icdVar, 18));
                        } else {
                            map.put(iazVar, icdVar);
                        }
                    }
                }
            }
            arrayList3.addAll(arrayList5);
            ArrayList arrayList6 = new ArrayList();
            HashMap hashMap = new HashMap();
            for (Map.Entry entry : this.a.entrySet()) {
                iah iahVar4 = (iah) entry.getKey();
                if (!iahVar4.c()) {
                    icd icdVar2 = (icd) entry.getValue();
                    for (iaz iazVar2 : iahVar4.a) {
                        if (!hashMap.containsKey(iazVar2)) {
                            hashMap.put(iazVar2, new HashSet());
                        }
                        ((Set) hashMap.get(iazVar2)).add(icdVar2);
                    }
                }
            }
            for (Map.Entry entry2 : hashMap.entrySet()) {
                boolean containsKey2 = this.e.containsKey(entry2.getKey());
                Map map2 = this.e;
                if (containsKey2) {
                    iau iauVar = (iau) map2.get(entry2.getKey());
                    Iterator it5 = ((Set) entry2.getValue()).iterator();
                    while (it5.hasNext()) {
                        arrayList6.add(new evb(iauVar, (icd) it5.next(), 19));
                    }
                } else {
                    map2.put((iaz) entry2.getKey(), iau.b((Collection) entry2.getValue()));
                }
            }
            arrayList3.addAll(arrayList6);
            for (iah iahVar5 : this.a.keySet()) {
                for (ian ianVar : iahVar5.b) {
                    if (ianVar.b() && !this.e.containsKey(ianVar.a)) {
                        this.e.put(ianVar.a, iau.b(Collections.EMPTY_SET));
                    } else if (this.d.containsKey(ianVar.a)) {
                        continue;
                    } else {
                        if (ianVar.b == 1) {
                            throw new iav(String.format("Unsatisfied dependency for component %s: %s", iahVar5, ianVar.a));
                        }
                        if (!ianVar.b()) {
                            this.d.put(ianVar.a, new iax(iax.a));
                        }
                    }
                }
            }
        }
        int size = arrayList3.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((Runnable) arrayList3.get(i2)).run();
        }
        Boolean bool = (Boolean) this.b.get();
        if (bool != null) {
            Map map3 = this.a;
            bool.booleanValue();
            e(map3);
        }
    }

    @Override // defpackage.iai
    public final synchronized icd a(iaz iazVar) {
        return (icd) this.d.get(iazVar);
    }

    @Override // defpackage.iai
    public final /* synthetic */ icd b(Class cls) {
        throw null;
    }

    @Override // defpackage.iai
    public final synchronized icd c(iaz iazVar) {
        iau iauVar = (iau) this.e.get(iazVar);
        if (iauVar != null) {
            return iauVar;
        }
        return c;
    }

    @Override // defpackage.iai
    public final /* synthetic */ Object d(Class cls) {
        throw null;
    }

    public final void e(Map map) {
        Queue<ibz> queue;
        for (Map.Entry entry : map.entrySet()) {
        }
        iar iarVar = this.h;
        synchronized (iarVar) {
            queue = iarVar.a;
            if (queue != null) {
                iarVar.a = null;
            } else {
                queue = null;
            }
        }
        if (queue != null) {
            for (ibz ibzVar : queue) {
                ibzVar.getClass();
                synchronized (iarVar) {
                    Queue queue2 = iarVar.a;
                    if (queue2 != null) {
                        queue2.add(ibzVar);
                    } else {
                        for (Map.Entry entry2 : iarVar.a()) {
                            ((Executor) entry2.getValue()).execute(new iaq(entry2, 0));
                        }
                    }
                }
            }
        }
    }
}
