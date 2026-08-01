package androidx.lifecycle;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f628a;

    /* renamed from: b, reason: collision with root package name */
    public n.a f629b;

    /* renamed from: c, reason: collision with root package name */
    public m f630c;
    public final WeakReference d;

    /* renamed from: e, reason: collision with root package name */
    public int f631e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f632f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f633g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f634h;

    public t(r rVar) {
        new AtomicReference();
        this.f628a = true;
        this.f629b = new n.a();
        this.f630c = m.f618g;
        this.f634h = new ArrayList();
        this.d = new WeakReference(rVar);
    }

    public final void a(q qVar) {
        p reflectiveGenericLifecycleObserver;
        Object obj;
        r rVar;
        c("addObserver");
        m mVar = this.f630c;
        m mVar2 = m.f617f;
        if (mVar != mVar2) {
            mVar2 = m.f618g;
        }
        s sVar = new s();
        HashMap hashMap = u.f635a;
        boolean z3 = qVar instanceof p;
        boolean z4 = qVar instanceof d;
        if (z3 && z4) {
            reflectiveGenericLifecycleObserver = new DefaultLifecycleObserverAdapter((d) qVar, (p) qVar);
        } else if (z4) {
            reflectiveGenericLifecycleObserver = new DefaultLifecycleObserverAdapter((d) qVar, null);
        } else if (z3) {
            reflectiveGenericLifecycleObserver = (p) qVar;
        } else {
            Class<?> cls = qVar.getClass();
            if (u.c(cls) == 2) {
                Object obj2 = u.f636b.get(cls);
                f3.d.b(obj2);
                List list = (List) obj2;
                if (list.size() == 1) {
                    u.a((Constructor) list.get(0), qVar);
                    throw null;
                }
                int size = list.size();
                g[] gVarArr = new g[size];
                if (size > 0) {
                    u.a((Constructor) list.get(0), qVar);
                    throw null;
                }
                reflectiveGenericLifecycleObserver = new CompositeGeneratedAdaptersObserver(gVarArr);
            } else {
                reflectiveGenericLifecycleObserver = new ReflectiveGenericLifecycleObserver(qVar);
            }
        }
        sVar.f627b = reflectiveGenericLifecycleObserver;
        sVar.f626a = mVar2;
        n.a aVar = this.f629b;
        n.c a2 = aVar.a(qVar);
        if (a2 != null) {
            obj = a2.f2701g;
        } else {
            HashMap hashMap2 = aVar.f2696j;
            n.c cVar = new n.c(qVar, sVar);
            aVar.i++;
            n.c cVar2 = aVar.f2707g;
            if (cVar2 == null) {
                aVar.f2706f = cVar;
                aVar.f2707g = cVar;
            } else {
                cVar2.f2702h = cVar;
                cVar.i = cVar2;
                aVar.f2707g = cVar;
            }
            hashMap2.put(qVar, cVar);
            obj = null;
        }
        if (((s) obj) == null && (rVar = (r) this.d.get()) != null) {
            boolean z5 = this.f631e != 0 || this.f632f;
            m b4 = b(qVar);
            this.f631e++;
            while (sVar.f626a.compareTo(b4) < 0 && this.f629b.f2696j.containsKey(qVar)) {
                m mVar3 = sVar.f626a;
                ArrayList arrayList = this.f634h;
                arrayList.add(mVar3);
                j jVar = l.Companion;
                m mVar4 = sVar.f626a;
                jVar.getClass();
                f3.d.e(mVar4, "state");
                int ordinal = mVar4.ordinal();
                l lVar = ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? null : l.ON_RESUME : l.ON_START : l.ON_CREATE;
                if (lVar == null) {
                    throw new IllegalStateException("no event up from " + sVar.f626a);
                }
                sVar.a(rVar, lVar);
                arrayList.remove(arrayList.size() - 1);
                b4 = b(qVar);
            }
            if (!z5) {
                h();
            }
            this.f631e--;
        }
    }

    public final m b(q qVar) {
        s sVar;
        HashMap hashMap = this.f629b.f2696j;
        n.c cVar = hashMap.containsKey(qVar) ? ((n.c) hashMap.get(qVar)).i : null;
        m mVar = (cVar == null || (sVar = (s) cVar.f2701g) == null) ? null : sVar.f626a;
        ArrayList arrayList = this.f634h;
        m mVar2 = arrayList.isEmpty() ? null : (m) arrayList.get(arrayList.size() - 1);
        m mVar3 = this.f630c;
        f3.d.e(mVar3, "state1");
        if (mVar == null || mVar.compareTo(mVar3) >= 0) {
            mVar = mVar3;
        }
        return (mVar2 == null || mVar2.compareTo(mVar) >= 0) ? mVar : mVar2;
    }

    public final void c(String str) {
        if (this.f628a) {
            ((m.a) m.a.t0().f2680k).getClass();
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                return;
            }
            throw new IllegalStateException(("Method " + str + " must be called on the main thread").toString());
        }
    }

    public final void d(l lVar) {
        f3.d.e(lVar, "event");
        c("handleLifecycleEvent");
        e(lVar.a());
    }

    public final void e(m mVar) {
        m mVar2 = this.f630c;
        if (mVar2 == mVar) {
            return;
        }
        m mVar3 = m.f618g;
        m mVar4 = m.f617f;
        if (mVar2 == mVar3 && mVar == mVar4) {
            throw new IllegalStateException(("no event down from " + this.f630c + " in component " + this.d.get()).toString());
        }
        this.f630c = mVar;
        if (this.f632f || this.f631e != 0) {
            this.f633g = true;
            return;
        }
        this.f632f = true;
        h();
        this.f632f = false;
        if (this.f630c == mVar4) {
            this.f629b = new n.a();
        }
    }

    public final void f(q qVar) {
        c("removeObserver");
        this.f629b.b(qVar);
    }

    public final void g() {
        c("setCurrentState");
        e(m.f619h);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        r12.f633g = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h() {
        r rVar = (r) this.d.get();
        if (rVar == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (true) {
            n.a aVar = this.f629b;
            if (aVar.i != 0) {
                n.c cVar = aVar.f2706f;
                f3.d.b(cVar);
                m mVar = ((s) cVar.f2701g).f626a;
                n.c cVar2 = this.f629b.f2707g;
                f3.d.b(cVar2);
                m mVar2 = ((s) cVar2.f2701g).f626a;
                if (mVar == mVar2 && this.f630c == mVar2) {
                    break;
                }
                this.f633g = false;
                m mVar3 = this.f630c;
                n.c cVar3 = this.f629b.f2706f;
                f3.d.b(cVar3);
                int compareTo = mVar3.compareTo(((s) cVar3.f2701g).f626a);
                ArrayList arrayList = this.f634h;
                if (compareTo < 0) {
                    n.a aVar2 = this.f629b;
                    n.b bVar = new n.b(aVar2.f2707g, aVar2.f2706f, 1);
                    aVar2.f2708h.put(bVar, Boolean.FALSE);
                    while (bVar.hasNext() && !this.f633g) {
                        Map.Entry entry = (Map.Entry) bVar.next();
                        f3.d.d(entry, "next()");
                        q qVar = (q) entry.getKey();
                        s sVar = (s) entry.getValue();
                        while (sVar.f626a.compareTo(this.f630c) > 0 && !this.f633g && this.f629b.f2696j.containsKey(qVar)) {
                            j jVar = l.Companion;
                            m mVar4 = sVar.f626a;
                            jVar.getClass();
                            f3.d.e(mVar4, "state");
                            int ordinal = mVar4.ordinal();
                            l lVar = ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? null : l.ON_PAUSE : l.ON_STOP : l.ON_DESTROY;
                            if (lVar == null) {
                                throw new IllegalStateException("no event down from " + sVar.f626a);
                            }
                            arrayList.add(lVar.a());
                            sVar.a(rVar, lVar);
                            arrayList.remove(arrayList.size() - 1);
                        }
                    }
                }
                n.c cVar4 = this.f629b.f2707g;
                if (!this.f633g && cVar4 != null && this.f630c.compareTo(((s) cVar4.f2701g).f626a) > 0) {
                    n.a aVar3 = this.f629b;
                    aVar3.getClass();
                    n.d dVar = new n.d(aVar3);
                    aVar3.f2708h.put(dVar, Boolean.FALSE);
                    while (dVar.hasNext() && !this.f633g) {
                        Map.Entry entry2 = (Map.Entry) dVar.next();
                        q qVar2 = (q) entry2.getKey();
                        s sVar2 = (s) entry2.getValue();
                        while (sVar2.f626a.compareTo(this.f630c) < 0 && !this.f633g && this.f629b.f2696j.containsKey(qVar2)) {
                            arrayList.add(sVar2.f626a);
                            j jVar2 = l.Companion;
                            m mVar5 = sVar2.f626a;
                            jVar2.getClass();
                            f3.d.e(mVar5, "state");
                            int ordinal2 = mVar5.ordinal();
                            l lVar2 = ordinal2 != 1 ? ordinal2 != 2 ? ordinal2 != 3 ? null : l.ON_RESUME : l.ON_START : l.ON_CREATE;
                            if (lVar2 == null) {
                                throw new IllegalStateException("no event up from " + sVar2.f626a);
                            }
                            sVar2.a(rVar, lVar2);
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
