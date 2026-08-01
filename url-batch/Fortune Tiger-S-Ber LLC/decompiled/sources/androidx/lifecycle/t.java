package androidx.lifecycle;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f600a;

    /* renamed from: b, reason: collision with root package name */
    public m.a f601b;
    public m c;

    /* renamed from: d, reason: collision with root package name */
    public final WeakReference f602d;

    /* renamed from: e, reason: collision with root package name */
    public int f603e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f604f;
    public boolean g;
    public final ArrayList h;

    public t(r rVar) {
        new AtomicReference();
        this.f600a = true;
        this.f601b = new m.a();
        this.c = m.g;
        this.h = new ArrayList();
        this.f602d = new WeakReference(rVar);
    }

    public final void a(q qVar) {
        p reflectiveGenericLifecycleObserver;
        Object obj;
        r rVar;
        c("addObserver");
        m mVar = this.c;
        m mVar2 = m.f590f;
        if (mVar != mVar2) {
            mVar2 = m.g;
        }
        s sVar = new s();
        HashMap hashMap = u.f605a;
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
            if (u.b(cls) == 2) {
                Object obj2 = u.f606b.get(cls);
                u2.c.b(obj2);
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
        sVar.f599b = reflectiveGenericLifecycleObserver;
        sVar.f598a = mVar2;
        m.a aVar = this.f601b;
        m.c a4 = aVar.a(qVar);
        if (a4 != null) {
            obj = a4.g;
        } else {
            HashMap hashMap2 = aVar.f2897j;
            m.c cVar = new m.c(qVar, sVar);
            aVar.f2903i++;
            m.c cVar2 = aVar.g;
            if (cVar2 == null) {
                aVar.f2902f = cVar;
                aVar.g = cVar;
            } else {
                cVar2.h = cVar;
                cVar.f2900i = cVar2;
                aVar.g = cVar;
            }
            hashMap2.put(qVar, cVar);
            obj = null;
        }
        if (((s) obj) == null && (rVar = (r) this.f602d.get()) != null) {
            boolean z5 = this.f603e != 0 || this.f604f;
            m b2 = b(qVar);
            this.f603e++;
            while (sVar.f598a.compareTo(b2) < 0 && this.f601b.f2897j.containsKey(qVar)) {
                m mVar3 = sVar.f598a;
                ArrayList arrayList = this.h;
                arrayList.add(mVar3);
                j jVar = l.Companion;
                m mVar4 = sVar.f598a;
                jVar.getClass();
                u2.c.e(mVar4, "state");
                int ordinal = mVar4.ordinal();
                l lVar = ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? null : l.ON_RESUME : l.ON_START : l.ON_CREATE;
                if (lVar == null) {
                    throw new IllegalStateException("no event up from " + sVar.f598a);
                }
                sVar.a(rVar, lVar);
                arrayList.remove(arrayList.size() - 1);
                b2 = b(qVar);
            }
            if (!z5) {
                h();
            }
            this.f603e--;
        }
    }

    public final m b(q qVar) {
        s sVar;
        HashMap hashMap = this.f601b.f2897j;
        m.c cVar = hashMap.containsKey(qVar) ? ((m.c) hashMap.get(qVar)).f2900i : null;
        m mVar = (cVar == null || (sVar = (s) cVar.g) == null) ? null : sVar.f598a;
        ArrayList arrayList = this.h;
        m mVar2 = arrayList.isEmpty() ? null : (m) arrayList.get(arrayList.size() - 1);
        m mVar3 = this.c;
        u2.c.e(mVar3, "state1");
        if (mVar == null || mVar.compareTo(mVar3) >= 0) {
            mVar = mVar3;
        }
        return (mVar2 == null || mVar2.compareTo(mVar) >= 0) ? mVar : mVar2;
    }

    public final void c(String str) {
        if (this.f600a) {
            ((l.a) l.a.W().f2844k).getClass();
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                return;
            }
            throw new IllegalStateException(("Method " + str + " must be called on the main thread").toString());
        }
    }

    public final void d(l lVar) {
        u2.c.e(lVar, "event");
        c("handleLifecycleEvent");
        e(lVar.a());
    }

    public final void e(m mVar) {
        m mVar2 = this.c;
        if (mVar2 == mVar) {
            return;
        }
        m mVar3 = m.g;
        m mVar4 = m.f590f;
        if (mVar2 == mVar3 && mVar == mVar4) {
            throw new IllegalStateException(("no event down from " + this.c + " in component " + this.f602d.get()).toString());
        }
        this.c = mVar;
        if (this.f604f || this.f603e != 0) {
            this.g = true;
            return;
        }
        this.f604f = true;
        h();
        this.f604f = false;
        if (this.c == mVar4) {
            this.f601b = new m.a();
        }
    }

    public final void f(q qVar) {
        c("removeObserver");
        this.f601b.b(qVar);
    }

    public final void g() {
        c("setCurrentState");
        e(m.h);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        r12.g = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h() {
        r rVar = (r) this.f602d.get();
        if (rVar == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (true) {
            m.a aVar = this.f601b;
            if (aVar.f2903i != 0) {
                m.c cVar = aVar.f2902f;
                u2.c.b(cVar);
                m mVar = ((s) cVar.g).f598a;
                m.c cVar2 = this.f601b.g;
                u2.c.b(cVar2);
                m mVar2 = ((s) cVar2.g).f598a;
                if (mVar == mVar2 && this.c == mVar2) {
                    break;
                }
                this.g = false;
                m mVar3 = this.c;
                m.c cVar3 = this.f601b.f2902f;
                u2.c.b(cVar3);
                int compareTo = mVar3.compareTo(((s) cVar3.g).f598a);
                ArrayList arrayList = this.h;
                if (compareTo < 0) {
                    m.a aVar2 = this.f601b;
                    m.b bVar = new m.b(aVar2.g, aVar2.f2902f, 1);
                    aVar2.h.put(bVar, Boolean.FALSE);
                    while (bVar.hasNext() && !this.g) {
                        Map.Entry entry = (Map.Entry) bVar.next();
                        u2.c.d(entry, "next()");
                        q qVar = (q) entry.getKey();
                        s sVar = (s) entry.getValue();
                        while (sVar.f598a.compareTo(this.c) > 0 && !this.g && this.f601b.f2897j.containsKey(qVar)) {
                            j jVar = l.Companion;
                            m mVar4 = sVar.f598a;
                            jVar.getClass();
                            u2.c.e(mVar4, "state");
                            int ordinal = mVar4.ordinal();
                            l lVar = ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? null : l.ON_PAUSE : l.ON_STOP : l.ON_DESTROY;
                            if (lVar == null) {
                                throw new IllegalStateException("no event down from " + sVar.f598a);
                            }
                            arrayList.add(lVar.a());
                            sVar.a(rVar, lVar);
                            arrayList.remove(arrayList.size() - 1);
                        }
                    }
                }
                m.c cVar4 = this.f601b.g;
                if (!this.g && cVar4 != null && this.c.compareTo(((s) cVar4.g).f598a) > 0) {
                    m.a aVar3 = this.f601b;
                    aVar3.getClass();
                    m.d dVar = new m.d(aVar3);
                    aVar3.h.put(dVar, Boolean.FALSE);
                    while (dVar.hasNext() && !this.g) {
                        Map.Entry entry2 = (Map.Entry) dVar.next();
                        q qVar2 = (q) entry2.getKey();
                        s sVar2 = (s) entry2.getValue();
                        while (sVar2.f598a.compareTo(this.c) < 0 && !this.g && this.f601b.f2897j.containsKey(qVar2)) {
                            arrayList.add(sVar2.f598a);
                            j jVar2 = l.Companion;
                            m mVar5 = sVar2.f598a;
                            jVar2.getClass();
                            u2.c.e(mVar5, "state");
                            int ordinal2 = mVar5.ordinal();
                            l lVar2 = ordinal2 != 1 ? ordinal2 != 2 ? ordinal2 != 3 ? null : l.ON_RESUME : l.ON_START : l.ON_CREATE;
                            if (lVar2 == null) {
                                throw new IllegalStateException("no event up from " + sVar2.f598a);
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
