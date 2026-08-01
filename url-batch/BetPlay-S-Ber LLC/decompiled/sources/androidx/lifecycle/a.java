package androidx.lifecycle;

import android.os.Looper;
import defpackage.eq;
import defpackage.gq;
import defpackage.hq;
import defpackage.iq;
import defpackage.l10;
import defpackage.lq;
import defpackage.m10;
import defpackage.mq;
import defpackage.n10;
import defpackage.nq;
import defpackage.o8;
import defpackage.oq;
import defpackage.pq;
import defpackage.te;
import defpackage.ti;
import defpackage.v6;
import defpackage.vm;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class a extends iq {
    public final boolean a;
    public ti b;
    public hq c;
    public final WeakReference d;
    public int e;
    public boolean f;
    public boolean g;
    public final ArrayList h;

    public a(nq nqVar) {
        new AtomicReference();
        this.a = true;
        this.b = new ti();
        this.c = hq.g;
        this.h = new ArrayList();
        this.d = new WeakReference(nqVar);
    }

    @Override // defpackage.iq
    public final void a(mq mqVar) {
        lq reflectiveGenericLifecycleObserver;
        Object obj;
        nq nqVar;
        d("addObserver");
        hq hqVar = this.c;
        hq hqVar2 = hq.f;
        if (hqVar != hqVar2) {
            hqVar2 = hq.g;
        }
        oq oqVar = new oq();
        HashMap hashMap = pq.a;
        boolean z = mqVar instanceof lq;
        boolean z2 = mqVar instanceof te;
        if (z && z2) {
            reflectiveGenericLifecycleObserver = new DefaultLifecycleObserverAdapter((te) mqVar, (lq) mqVar);
        } else if (z2) {
            reflectiveGenericLifecycleObserver = new DefaultLifecycleObserverAdapter((te) mqVar, null);
        } else if (z) {
            reflectiveGenericLifecycleObserver = (lq) mqVar;
        } else {
            Class<?> cls = mqVar.getClass();
            if (pq.b(cls) == 2) {
                Object obj2 = pq.b.get(cls);
                obj2.getClass();
                List list = (List) obj2;
                if (list.size() == 1) {
                    pq.a((Constructor) list.get(0), mqVar);
                    throw null;
                }
                int size = list.size();
                vm[] vmVarArr = new vm[size];
                if (size > 0) {
                    pq.a((Constructor) list.get(0), mqVar);
                    throw null;
                }
                reflectiveGenericLifecycleObserver = new CompositeGeneratedAdaptersObserver(vmVarArr);
            } else {
                reflectiveGenericLifecycleObserver = new ReflectiveGenericLifecycleObserver(mqVar);
            }
        }
        oqVar.b = reflectiveGenericLifecycleObserver;
        oqVar.a = hqVar2;
        ti tiVar = this.b;
        m10 a = tiVar.a(mqVar);
        if (a != null) {
            obj = a.g;
        } else {
            HashMap hashMap2 = tiVar.j;
            m10 m10Var = new m10(mqVar, oqVar);
            tiVar.i++;
            m10 m10Var2 = tiVar.g;
            if (m10Var2 == null) {
                tiVar.f = m10Var;
                tiVar.g = m10Var;
            } else {
                m10Var2.h = m10Var;
                m10Var.i = m10Var2;
                tiVar.g = m10Var;
            }
            hashMap2.put(mqVar, m10Var);
            obj = null;
        }
        if (((oq) obj) == null && (nqVar = (nq) this.d.get()) != null) {
            boolean z3 = this.e != 0 || this.f;
            hq c = c(mqVar);
            this.e++;
            while (oqVar.a.compareTo(c) < 0 && this.b.j.containsKey(mqVar)) {
                hq hqVar3 = oqVar.a;
                ArrayList arrayList = this.h;
                arrayList.add(hqVar3);
                eq eqVar = gq.Companion;
                hq hqVar4 = oqVar.a;
                eqVar.getClass();
                hqVar4.getClass();
                int ordinal = hqVar4.ordinal();
                gq gqVar = ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? null : gq.ON_RESUME : gq.ON_START : gq.ON_CREATE;
                if (gqVar == null) {
                    throw new IllegalStateException("no event up from " + oqVar.a);
                }
                oqVar.a(nqVar, gqVar);
                arrayList.remove(arrayList.size() - 1);
                c = c(mqVar);
            }
            if (!z3) {
                g();
            }
            this.e--;
        }
    }

    @Override // defpackage.iq
    public final void b(mq mqVar) {
        mqVar.getClass();
        d("removeObserver");
        this.b.b(mqVar);
    }

    public final hq c(mq mqVar) {
        oq oqVar;
        HashMap hashMap = this.b.j;
        m10 m10Var = hashMap.containsKey(mqVar) ? ((m10) hashMap.get(mqVar)).i : null;
        hq hqVar = (m10Var == null || (oqVar = (oq) m10Var.g) == null) ? null : oqVar.a;
        ArrayList arrayList = this.h;
        hq hqVar2 = arrayList.isEmpty() ? null : (hq) arrayList.get(arrayList.size() - 1);
        hq hqVar3 = this.c;
        hqVar3.getClass();
        if (hqVar == null || hqVar.compareTo(hqVar3) >= 0) {
            hqVar = hqVar3;
        }
        return (hqVar2 == null || hqVar2.compareTo(hqVar) >= 0) ? hqVar : hqVar2;
    }

    public final void d(String str) {
        if (this.a) {
            ((v6) v6.e0().o).getClass();
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                return;
            }
            o8.g(str, " must be called on the main thread", "Method ");
        }
    }

    public final void e(gq gqVar) {
        gqVar.getClass();
        d("handleLifecycleEvent");
        f(gqVar.a());
    }

    public final void f(hq hqVar) {
        hq hqVar2 = this.c;
        if (hqVar2 == hqVar) {
            return;
        }
        hq hqVar3 = hq.g;
        hq hqVar4 = hq.f;
        if (hqVar2 == hqVar3 && hqVar == hqVar4) {
            StringBuilder sb = new StringBuilder("no event down from ");
            sb.append(this.c);
            Object obj = this.d.get();
            sb.append(" in component ");
            sb.append(obj);
            throw new IllegalStateException(sb.toString().toString());
        }
        this.c = hqVar;
        if (this.f || this.e != 0) {
            this.g = true;
            return;
        }
        this.f = true;
        g();
        this.f = false;
        if (this.c == hqVar4) {
            this.b = new ti();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        r11.g = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g() {
        nq nqVar = (nq) this.d.get();
        if (nqVar == null) {
            o8.t("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
            return;
        }
        while (true) {
            ti tiVar = this.b;
            if (tiVar.i != 0) {
                m10 m10Var = tiVar.f;
                m10Var.getClass();
                hq hqVar = ((oq) m10Var.g).a;
                m10 m10Var2 = this.b.g;
                m10Var2.getClass();
                hq hqVar2 = ((oq) m10Var2.g).a;
                if (hqVar == hqVar2 && this.c == hqVar2) {
                    break;
                }
                this.g = false;
                hq hqVar3 = this.c;
                m10 m10Var3 = this.b.f;
                m10Var3.getClass();
                int compareTo = hqVar3.compareTo(((oq) m10Var3.g).a);
                ArrayList arrayList = this.h;
                if (compareTo < 0) {
                    ti tiVar2 = this.b;
                    l10 l10Var = new l10(tiVar2.g, tiVar2.f, 1);
                    tiVar2.h.put(l10Var, Boolean.FALSE);
                    while (l10Var.hasNext() && !this.g) {
                        Map.Entry entry = (Map.Entry) l10Var.next();
                        entry.getClass();
                        mq mqVar = (mq) entry.getKey();
                        oq oqVar = (oq) entry.getValue();
                        while (oqVar.a.compareTo(this.c) > 0 && !this.g && this.b.j.containsKey(mqVar)) {
                            eq eqVar = gq.Companion;
                            hq hqVar4 = oqVar.a;
                            eqVar.getClass();
                            hqVar4.getClass();
                            int ordinal = hqVar4.ordinal();
                            gq gqVar = ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? null : gq.ON_PAUSE : gq.ON_STOP : gq.ON_DESTROY;
                            if (gqVar == null) {
                                throw new IllegalStateException("no event down from " + oqVar.a);
                            }
                            arrayList.add(gqVar.a());
                            oqVar.a(nqVar, gqVar);
                            arrayList.remove(arrayList.size() - 1);
                        }
                    }
                }
                m10 m10Var4 = this.b.g;
                if (!this.g && m10Var4 != null && this.c.compareTo(((oq) m10Var4.g).a) > 0) {
                    ti tiVar3 = this.b;
                    tiVar3.getClass();
                    n10 n10Var = new n10(tiVar3);
                    tiVar3.h.put(n10Var, Boolean.FALSE);
                    while (n10Var.hasNext() && !this.g) {
                        Map.Entry entry2 = (Map.Entry) n10Var.next();
                        mq mqVar2 = (mq) entry2.getKey();
                        oq oqVar2 = (oq) entry2.getValue();
                        while (oqVar2.a.compareTo(this.c) < 0 && !this.g && this.b.j.containsKey(mqVar2)) {
                            arrayList.add(oqVar2.a);
                            eq eqVar2 = gq.Companion;
                            hq hqVar5 = oqVar2.a;
                            eqVar2.getClass();
                            hqVar5.getClass();
                            int ordinal2 = hqVar5.ordinal();
                            gq gqVar2 = ordinal2 != 1 ? ordinal2 != 2 ? ordinal2 != 3 ? null : gq.ON_RESUME : gq.ON_START : gq.ON_CREATE;
                            if (gqVar2 == null) {
                                throw new IllegalStateException("no event up from " + oqVar2.a);
                            }
                            oqVar2.a(nqVar, gqVar2);
                            arrayList.remove(arrayList.size() - 1);
                        }
                    }
                }
            } else {
                break;
            }
        }
    }
}
