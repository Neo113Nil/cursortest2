package androidx.lifecycle;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f732a;

    /* renamed from: b, reason: collision with root package name */
    public n.a f733b;

    /* renamed from: c, reason: collision with root package name */
    public m f734c;
    public final WeakReference d;

    /* renamed from: e, reason: collision with root package name */
    public int f735e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f736f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f737g;
    public final ArrayList h;

    public t(r rVar) {
        new AtomicReference();
        this.f732a = true;
        this.f733b = new n.a();
        this.f734c = m.f723g;
        this.h = new ArrayList();
        this.d = new WeakReference(rVar);
    }

    public final void a(q qVar) {
        p reflectiveGenericLifecycleObserver;
        Object obj;
        r rVar;
        c("addObserver");
        m mVar = this.f734c;
        m mVar2 = m.f722f;
        if (mVar != mVar2) {
            mVar2 = m.f723g;
        }
        s sVar = new s();
        HashMap hashMap = u.f738a;
        boolean z4 = qVar instanceof p;
        boolean z5 = qVar instanceof d;
        if (z4 && z5) {
            reflectiveGenericLifecycleObserver = new DefaultLifecycleObserverAdapter((d) qVar, (p) qVar);
        } else if (z5) {
            reflectiveGenericLifecycleObserver = new DefaultLifecycleObserverAdapter((d) qVar, null);
        } else if (z4) {
            reflectiveGenericLifecycleObserver = (p) qVar;
        } else {
            Class<?> cls = qVar.getClass();
            if (u.b(cls) == 2) {
                Object obj2 = u.f739b.get(cls);
                i3.d.b(obj2);
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
        sVar.f731b = reflectiveGenericLifecycleObserver;
        sVar.f730a = mVar2;
        n.a aVar = this.f733b;
        n.c a5 = aVar.a(qVar);
        if (a5 != null) {
            obj = a5.f2743g;
        } else {
            HashMap hashMap2 = aVar.f2739j;
            n.c cVar = new n.c(qVar, sVar);
            aVar.i++;
            n.c cVar2 = aVar.f2747g;
            if (cVar2 == null) {
                aVar.f2746f = cVar;
                aVar.f2747g = cVar;
            } else {
                cVar2.h = cVar;
                cVar.i = cVar2;
                aVar.f2747g = cVar;
            }
            hashMap2.put(qVar, cVar);
            obj = null;
        }
        if (((s) obj) == null && (rVar = (r) this.d.get()) != null) {
            boolean z6 = this.f735e != 0 || this.f736f;
            m b2 = b(qVar);
            this.f735e++;
            while (sVar.f730a.compareTo(b2) < 0 && this.f733b.f2739j.containsKey(qVar)) {
                m mVar3 = sVar.f730a;
                ArrayList arrayList = this.h;
                arrayList.add(mVar3);
                j jVar = l.Companion;
                m mVar4 = sVar.f730a;
                jVar.getClass();
                i3.d.e(mVar4, "state");
                int ordinal = mVar4.ordinal();
                l lVar = ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? null : l.ON_RESUME : l.ON_START : l.ON_CREATE;
                if (lVar == null) {
                    throw new IllegalStateException("no event up from " + sVar.f730a);
                }
                sVar.a(rVar, lVar);
                arrayList.remove(arrayList.size() - 1);
                b2 = b(qVar);
            }
            if (!z6) {
                h();
            }
            this.f735e--;
        }
    }

    public final m b(q qVar) {
        s sVar;
        HashMap hashMap = this.f733b.f2739j;
        n.c cVar = hashMap.containsKey(qVar) ? ((n.c) hashMap.get(qVar)).i : null;
        m mVar = (cVar == null || (sVar = (s) cVar.f2743g) == null) ? null : sVar.f730a;
        ArrayList arrayList = this.h;
        m mVar2 = arrayList.isEmpty() ? null : (m) arrayList.get(arrayList.size() - 1);
        m mVar3 = this.f734c;
        i3.d.e(mVar3, "state1");
        if (mVar == null || mVar.compareTo(mVar3) >= 0) {
            mVar = mVar3;
        }
        return (mVar2 == null || mVar2.compareTo(mVar) >= 0) ? mVar : mVar2;
    }

    public final void c(String str) {
        if (this.f732a) {
            ((m.a) m.a.Z().f2720o).getClass();
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                return;
            }
            throw new IllegalStateException(("Method " + str + " must be called on the main thread").toString());
        }
    }

    public final void d(l lVar) {
        i3.d.e(lVar, "event");
        c("handleLifecycleEvent");
        e(lVar.a());
    }

    public final void e(m mVar) {
        m mVar2 = this.f734c;
        if (mVar2 == mVar) {
            return;
        }
        m mVar3 = m.f723g;
        m mVar4 = m.f722f;
        if (mVar2 == mVar3 && mVar == mVar4) {
            throw new IllegalStateException(("no event down from " + this.f734c + " in component " + this.d.get()).toString());
        }
        this.f734c = mVar;
        if (this.f736f || this.f735e != 0) {
            this.f737g = true;
            return;
        }
        this.f736f = true;
        h();
        this.f736f = false;
        if (this.f734c == mVar4) {
            this.f733b = new n.a();
        }
    }

    public final void f(q qVar) {
        c("removeObserver");
        this.f733b.b(qVar);
    }

    public final void g() {
        c("setCurrentState");
        e(m.h);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        r12.f737g = false;
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
            n.a aVar = this.f733b;
            if (aVar.i != 0) {
                n.c cVar = aVar.f2746f;
                i3.d.b(cVar);
                m mVar = ((s) cVar.f2743g).f730a;
                n.c cVar2 = this.f733b.f2747g;
                i3.d.b(cVar2);
                m mVar2 = ((s) cVar2.f2743g).f730a;
                if (mVar == mVar2 && this.f734c == mVar2) {
                    break;
                }
                this.f737g = false;
                m mVar3 = this.f734c;
                n.c cVar3 = this.f733b.f2746f;
                i3.d.b(cVar3);
                int compareTo = mVar3.compareTo(((s) cVar3.f2743g).f730a);
                ArrayList arrayList = this.h;
                if (compareTo < 0) {
                    n.a aVar2 = this.f733b;
                    n.b bVar = new n.b(aVar2.f2747g, aVar2.f2746f, 1);
                    aVar2.h.put(bVar, Boolean.FALSE);
                    while (bVar.hasNext() && !this.f737g) {
                        Map.Entry entry = (Map.Entry) bVar.next();
                        i3.d.d(entry, "next()");
                        q qVar = (q) entry.getKey();
                        s sVar = (s) entry.getValue();
                        while (sVar.f730a.compareTo(this.f734c) > 0 && !this.f737g && this.f733b.f2739j.containsKey(qVar)) {
                            j jVar = l.Companion;
                            m mVar4 = sVar.f730a;
                            jVar.getClass();
                            i3.d.e(mVar4, "state");
                            int ordinal = mVar4.ordinal();
                            l lVar = ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? null : l.ON_PAUSE : l.ON_STOP : l.ON_DESTROY;
                            if (lVar == null) {
                                throw new IllegalStateException("no event down from " + sVar.f730a);
                            }
                            arrayList.add(lVar.a());
                            sVar.a(rVar, lVar);
                            arrayList.remove(arrayList.size() - 1);
                        }
                    }
                }
                n.c cVar4 = this.f733b.f2747g;
                if (!this.f737g && cVar4 != null && this.f734c.compareTo(((s) cVar4.f2743g).f730a) > 0) {
                    n.a aVar3 = this.f733b;
                    aVar3.getClass();
                    n.d dVar = new n.d(aVar3);
                    aVar3.h.put(dVar, Boolean.FALSE);
                    while (dVar.hasNext() && !this.f737g) {
                        Map.Entry entry2 = (Map.Entry) dVar.next();
                        q qVar2 = (q) entry2.getKey();
                        s sVar2 = (s) entry2.getValue();
                        while (sVar2.f730a.compareTo(this.f734c) < 0 && !this.f737g && this.f733b.f2739j.containsKey(qVar2)) {
                            arrayList.add(sVar2.f730a);
                            j jVar2 = l.Companion;
                            m mVar5 = sVar2.f730a;
                            jVar2.getClass();
                            i3.d.e(mVar5, "state");
                            int ordinal2 = mVar5.ordinal();
                            l lVar2 = ordinal2 != 1 ? ordinal2 != 2 ? ordinal2 != 3 ? null : l.ON_RESUME : l.ON_START : l.ON_CREATE;
                            if (lVar2 == null) {
                                throw new IllegalStateException("no event up from " + sVar2.f730a);
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
