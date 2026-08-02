package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Random;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gow implements jrw {
    private final jsb a;
    private final jsb b;

    public gow(jsb jsbVar, jsb jsbVar2) {
        this.a = jsbVar;
        this.b = jsbVar2;
    }

    @Override // defpackage.koe, defpackage.kod
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final hel b() {
        List list;
        int i;
        Map b = ((gov) this.a).b();
        qy qyVar = (qy) this.b.b();
        Set keySet = b.keySet();
        synchronized (qyVar) {
            list = (List) qyVar.get(keySet);
            if (list == null) {
                Random random = ifq.a;
                list = new ArrayList(keySet);
                Collections.shuffle(list, ifq.a);
                int i2 = 0;
                qy qyVar2 = new qy(0);
                ArrayDeque arrayDeque = new ArrayDeque(list);
                HashSet hashSet = new HashSet(list);
                while (!arrayDeque.isEmpty()) {
                    ifp ifpVar = (ifp) arrayDeque.remove();
                    hel helVar = ifpVar.b;
                    int i3 = ((his) helVar).c;
                    for (int i4 = 0; i4 < i3; i4++) {
                        ifp ifpVar2 = (ifp) helVar.get(i4);
                        ifq.b(qyVar2, ifpVar, ifpVar2);
                        if (hashSet.add(ifpVar2)) {
                            arrayDeque.add(ifpVar2);
                        }
                    }
                    hel helVar2 = ifpVar.c;
                    int i5 = ((his) helVar2).c;
                    for (int i6 = 0; i6 < i5; i6++) {
                        ifp ifpVar3 = (ifp) helVar2.get(i6);
                        ifq.b(qyVar2, ifpVar3, ifpVar);
                        if (hashSet.add(ifpVar3)) {
                            arrayDeque.add(ifpVar3);
                        }
                    }
                }
                hfm n = hfm.n(list);
                try {
                    ArrayList<hsi> arrayList = new ArrayList(list.size());
                    HashMap hashMap = new HashMap(list.size());
                    int i7 = 0;
                    for (Object obj : list) {
                        hsi hsiVar = new hsi(obj, i7);
                        arrayList.add(hsiVar);
                        List list2 = (List) hashMap.get(obj);
                        if (list2 == null) {
                            list2 = new ArrayList();
                            hashMap.put(obj, list2);
                        }
                        list2.add(hsiVar);
                        i7++;
                    }
                    int size = arrayList.size();
                    while (i2 < size) {
                        hsi hsiVar2 = (hsi) arrayList.get(i2);
                        Iterator it = ifq.a(n, qyVar2, (ifp) hsiVar2.a).iterator();
                        while (true) {
                            i = i2 + 1;
                            if (it.hasNext()) {
                                List list3 = (List) hashMap.get(it.next());
                                if (list3 != null) {
                                    Iterator it2 = list3.iterator();
                                    while (it2.hasNext()) {
                                        ((hsi) it2.next()).c.add(hsiVar2);
                                        hsiVar2.d++;
                                    }
                                } else {
                                    hsiVar2.d++;
                                }
                            }
                        }
                        i2 = i;
                    }
                    ArrayList arrayList2 = new ArrayList(list.size());
                    PriorityQueue priorityQueue = new PriorityQueue();
                    for (hsi hsiVar3 : arrayList) {
                        if (hsiVar3.d == 0) {
                            priorityQueue.add(hsiVar3);
                        }
                    }
                    while (!priorityQueue.isEmpty()) {
                        hsi hsiVar4 = (hsi) priorityQueue.poll();
                        arrayList2.add(hsiVar4);
                        for (hsi hsiVar5 : hsiVar4.c) {
                            int i8 = hsiVar5.d - 1;
                            hsiVar5.d = i8;
                            if (i8 == 0) {
                                priorityQueue.add(hsiVar5);
                            }
                        }
                    }
                    if (arrayList2.size() != list.size()) {
                        ArrayList arrayList3 = new ArrayList();
                        for (hsi hsiVar6 : arrayList) {
                            if (hsiVar6.d > 0) {
                                arrayList3.add(hsiVar6.a);
                            }
                        }
                        throw new hsh(arrayList3);
                    }
                    list.clear();
                    Iterator it3 = arrayList2.iterator();
                    while (it3.hasNext()) {
                        list.add(((hsi) it3.next()).a);
                    }
                    qyVar.put(keySet, list);
                } catch (hsh e) {
                    throw new IllegalStateException("Cycle: ".concat(String.valueOf(String.valueOf(DesugarCollections.unmodifiableList(e.a)))), e);
                }
            }
        }
        int i9 = hel.d;
        heg hegVar = new heg(4);
        Iterator it4 = list.iterator();
        while (it4.hasNext()) {
            Iterator it5 = ((Set) b.get((ifp) it4.next())).iterator();
            while (it5.hasNext()) {
                hegVar.h((ifg) ((koe) it5.next()).b());
            }
        }
        hel g = hegVar.g();
        g.getClass();
        return g;
    }
}
