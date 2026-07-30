package defpackage;

import android.content.Context;
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
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class ek implements yj, tw {
    public static final ck l = new ck(0);
    public Object d;
    public Object e;
    public Object g;
    public Object h;
    public Object i;
    public Object j;
    public Object k;

    @Override // defpackage.yj
    public synchronized p01 b(v01 v01Var) {
        ag0 ag0Var = (ag0) ((HashMap) this.g).get(v01Var);
        if (ag0Var != null) {
            return ag0Var;
        }
        return l;
    }

    @Override // defpackage.yj
    public synchronized p01 e(v01 v01Var) {
        ca0.f(v01Var, "Null interface requested.");
        return (p01) ((HashMap) this.e).get(v01Var);
    }

    public void g(HashMap hashMap, boolean z) {
        ArrayDeque arrayDeque;
        for (Map.Entry entry : hashMap.entrySet()) {
            mj mjVar = (mj) entry.getKey();
            p01 p01Var = (p01) entry.getValue();
            int i = mjVar.d;
            if (i == 1 || (i == 2 && z)) {
                p01Var.get();
            }
        }
        dw dwVar = (dw) this.i;
        synchronized (dwVar) {
            try {
                arrayDeque = dwVar.b;
                if (arrayDeque != null) {
                    dwVar.b = null;
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
                af.c();
            }
        }
    }

    @Override // defpackage.o01
    public Object get() {
        return new ne0((Context) ((o01) this.d).get(), (ql0) ((o01) this.e).get(), (b51) ((o01) this.g).get(), (i8) ((i8) this.h).get(), (Executor) ((o01) this.i).get(), (b51) ((o01) this.j).get(), new me1(5), new me1(3), (b51) ((o01) this.k).get());
    }

    public void h() {
        for (mj mjVar : ((HashMap) this.d).keySet()) {
            for (qr qrVar : mjVar.c) {
                if (qrVar.b == 2 && !((HashMap) this.g).containsKey(qrVar.a)) {
                    HashMap hashMap = (HashMap) this.g;
                    v01 v01Var = qrVar.a;
                    Set set = Collections.EMPTY_SET;
                    ag0 ag0Var = new ag0();
                    ag0Var.b = null;
                    ag0Var.a = Collections.newSetFromMap(new ConcurrentHashMap());
                    ag0Var.a.addAll(set);
                    hashMap.put(v01Var, ag0Var);
                } else if (((HashMap) this.e).containsKey(qrVar.a)) {
                    continue;
                } else {
                    int i = qrVar.b;
                    if (i == 1) {
                        throw new rr("Unsatisfied dependency for component " + mjVar + ": " + qrVar.a);
                    }
                    if (i != 2) {
                        HashMap hashMap2 = (HashMap) this.e;
                        v01 v01Var2 = qrVar.a;
                        dd0 dd0Var = ct0.c;
                        ck ckVar = ct0.d;
                        ct0 ct0Var = new ct0();
                        ct0Var.a = dd0Var;
                        ct0Var.b = ckVar;
                        hashMap2.put(v01Var2, ct0Var);
                    }
                }
            }
        }
    }

    public ArrayList i(ArrayList arrayList) {
        HashMap hashMap = (HashMap) this.e;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            mj mjVar = (mj) obj;
            if (mjVar.e == 0) {
                p01 p01Var = (p01) ((HashMap) this.d).get(mjVar);
                for (v01 v01Var : mjVar.b) {
                    if (hashMap.containsKey(v01Var)) {
                        arrayList2.add(new x4((ct0) ((p01) hashMap.get(v01Var)), 1, p01Var));
                    } else {
                        hashMap.put(v01Var, p01Var);
                    }
                }
            }
        }
        return arrayList2;
    }

    public ArrayList j() {
        HashMap hashMap = (HashMap) this.g;
        ArrayList arrayList = new ArrayList();
        HashMap hashMap2 = new HashMap();
        for (Map.Entry entry : ((HashMap) this.d).entrySet()) {
            mj mjVar = (mj) entry.getKey();
            if (mjVar.e != 0) {
                p01 p01Var = (p01) entry.getValue();
                for (v01 v01Var : mjVar.b) {
                    if (!hashMap2.containsKey(v01Var)) {
                        hashMap2.put(v01Var, new HashSet());
                    }
                    ((Set) hashMap2.get(v01Var)).add(p01Var);
                }
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (hashMap.containsKey(entry2.getKey())) {
                ag0 ag0Var = (ag0) hashMap.get(entry2.getKey());
                Iterator it = ((Set) entry2.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new x4(ag0Var, 2, (p01) it.next()));
                }
            } else {
                v01 v01Var2 = (v01) entry2.getKey();
                Set set = (Set) ((Collection) entry2.getValue());
                ag0 ag0Var2 = new ag0();
                ag0Var2.b = null;
                ag0Var2.a = Collections.newSetFromMap(new ConcurrentHashMap());
                ag0Var2.a.addAll(set);
                hashMap.put(v01Var2, ag0Var2);
            }
        }
        return arrayList;
    }
}
