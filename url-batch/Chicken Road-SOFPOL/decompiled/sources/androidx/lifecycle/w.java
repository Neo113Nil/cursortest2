package androidx.lifecycle;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f869a;

    /* renamed from: b, reason: collision with root package name */
    public n.a f870b;

    /* renamed from: c, reason: collision with root package name */
    public p f871c;

    /* renamed from: d, reason: collision with root package name */
    public final WeakReference f872d;

    /* renamed from: e, reason: collision with root package name */
    public int f873e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f874f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f875g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f876h;
    public final d7.n0 i;

    public w(u uVar, boolean z3) {
        new AtomicReference(null);
        this.f869a = z3;
        this.f870b = new n.a();
        p pVar = p.f848e;
        this.f871c = pVar;
        this.f876h = new ArrayList();
        this.f872d = new WeakReference(uVar);
        this.i = d7.e0.b(pVar);
    }

    public final void a(t tVar) {
        s hVar;
        Object obj;
        u uVar;
        q6.i.e(tVar, "observer");
        c("addObserver");
        p pVar = this.f871c;
        p pVar2 = p.f847d;
        if (pVar != pVar2) {
            pVar2 = p.f848e;
        }
        v vVar = new v();
        HashMap hashMap = x.f878a;
        boolean z3 = tVar instanceof s;
        boolean z7 = tVar instanceof f;
        if (z3 && z7) {
            hVar = new h((f) tVar, (s) tVar);
        } else if (z7) {
            hVar = new h((f) tVar, (s) null);
        } else if (z3) {
            hVar = (s) tVar;
        } else {
            Class<?> cls = tVar.getClass();
            if (x.b(cls) == 2) {
                Object obj2 = x.f879b.get(cls);
                q6.i.b(obj2);
                List list = (List) obj2;
                if (list.size() == 1) {
                    x.a((Constructor) list.get(0), tVar);
                    throw null;
                }
                int size = list.size();
                j[] jVarArr = new j[size];
                if (size > 0) {
                    x.a((Constructor) list.get(0), tVar);
                    throw null;
                }
                hVar = new e(r6, jVarArr);
            } else {
                hVar = new h(tVar);
            }
        }
        vVar.f866b = hVar;
        vVar.f865a = pVar2;
        n.a aVar = this.f870b;
        n.c a8 = aVar.a(tVar);
        if (a8 != null) {
            obj = a8.f5235e;
        } else {
            HashMap hashMap2 = aVar.f5230h;
            n.c cVar = new n.c(tVar, vVar);
            aVar.f5244g++;
            n.c cVar2 = aVar.f5242e;
            if (cVar2 == null) {
                aVar.f5241d = cVar;
                aVar.f5242e = cVar;
            } else {
                cVar2.f5236f = cVar;
                cVar.f5237g = cVar2;
                aVar.f5242e = cVar;
            }
            hashMap2.put(tVar, cVar);
            obj = null;
        }
        if (((v) obj) == null && (uVar = (u) this.f872d.get()) != null) {
            r6 = (this.f873e != 0 || this.f874f) ? 1 : 0;
            p b8 = b(tVar);
            this.f873e++;
            while (vVar.f865a.compareTo(b8) < 0 && this.f870b.f5230h.containsKey(tVar)) {
                p pVar3 = vVar.f865a;
                ArrayList arrayList = this.f876h;
                arrayList.add(pVar3);
                m mVar = o.Companion;
                p pVar4 = vVar.f865a;
                mVar.getClass();
                q6.i.e(pVar4, "state");
                int ordinal = pVar4.ordinal();
                o oVar = ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? null : o.ON_RESUME : o.ON_START : o.ON_CREATE;
                if (oVar == null) {
                    throw new IllegalStateException("no event up from " + vVar.f865a);
                }
                vVar.a(uVar, oVar);
                arrayList.remove(arrayList.size() - 1);
                b8 = b(tVar);
            }
            if (r6 == 0) {
                h();
            }
            this.f873e--;
        }
    }

    public final p b(t tVar) {
        HashMap hashMap = this.f870b.f5230h;
        n.c cVar = hashMap.containsKey(tVar) ? ((n.c) hashMap.get(tVar)).f5237g : null;
        p pVar = cVar != null ? ((v) cVar.f5235e).f865a : null;
        ArrayList arrayList = this.f876h;
        p pVar2 = arrayList.isEmpty() ? null : (p) arrayList.get(arrayList.size() - 1);
        p pVar3 = this.f871c;
        q6.i.e(pVar3, "state1");
        if (pVar == null || pVar.compareTo(pVar3) >= 0) {
            pVar = pVar3;
        }
        return (pVar2 == null || pVar2.compareTo(pVar) >= 0) ? pVar : pVar2;
    }

    public final void c(String str) {
        if (this.f869a) {
            ((m.a) m.a.y().f4872a).getClass();
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                return;
            }
            throw new IllegalStateException(("Method " + str + " must be called on the main thread").toString());
        }
    }

    public final void d(o oVar) {
        q6.i.e(oVar, "event");
        c("handleLifecycleEvent");
        e(oVar.a());
    }

    public final void e(p pVar) {
        if (this.f871c == pVar) {
            return;
        }
        u uVar = (u) this.f872d.get();
        p pVar2 = this.f871c;
        q6.i.e(pVar2, "current");
        q6.i.e(pVar, "next");
        p pVar3 = p.f848e;
        p pVar4 = p.f847d;
        if (pVar2 == pVar3 && pVar == pVar4) {
            throw new IllegalStateException(("State must be at least '" + p.f849f + "' to be moved to '" + pVar + "' in component " + uVar).toString());
        }
        if (pVar2 == pVar4 && pVar2 != pVar) {
            throw new IllegalStateException(("State is '" + pVar4 + "' and cannot be moved to `" + pVar + "` in component " + uVar).toString());
        }
        this.f871c = pVar;
        if (this.f874f || this.f873e != 0) {
            this.f875g = true;
            return;
        }
        this.f874f = true;
        h();
        this.f874f = false;
        if (this.f871c == pVar4) {
            this.f870b = new n.a();
        }
    }

    public final void f(t tVar) {
        q6.i.e(tVar, "observer");
        c("removeObserver");
        this.f870b.b(tVar);
    }

    public final void g(p pVar) {
        q6.i.e(pVar, "state");
        c("setCurrentState");
        e(pVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        r12.f875g = false;
        r12.i.i(r12.f871c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h() {
        u uVar = (u) this.f872d.get();
        if (uVar == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (true) {
            n.a aVar = this.f870b;
            if (aVar.f5244g != 0) {
                n.c cVar = aVar.f5241d;
                q6.i.b(cVar);
                p pVar = ((v) cVar.f5235e).f865a;
                n.c cVar2 = this.f870b.f5242e;
                q6.i.b(cVar2);
                p pVar2 = ((v) cVar2.f5235e).f865a;
                if (pVar == pVar2 && this.f871c == pVar2) {
                    break;
                }
                this.f875g = false;
                p pVar3 = this.f871c;
                n.c cVar3 = this.f870b.f5241d;
                q6.i.b(cVar3);
                int compareTo = pVar3.compareTo(((v) cVar3.f5235e).f865a);
                ArrayList arrayList = this.f876h;
                if (compareTo < 0) {
                    n.a aVar2 = this.f870b;
                    n.b bVar = new n.b(aVar2.f5242e, aVar2.f5241d, 1);
                    aVar2.f5243f.put(bVar, Boolean.FALSE);
                    while (bVar.hasNext() && !this.f875g) {
                        Map.Entry entry = (Map.Entry) bVar.next();
                        q6.i.b(entry);
                        t tVar = (t) entry.getKey();
                        v vVar = (v) entry.getValue();
                        while (vVar.f865a.compareTo(this.f871c) > 0 && !this.f875g && this.f870b.f5230h.containsKey(tVar)) {
                            m mVar = o.Companion;
                            p pVar4 = vVar.f865a;
                            mVar.getClass();
                            q6.i.e(pVar4, "state");
                            int ordinal = pVar4.ordinal();
                            o oVar = ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? null : o.ON_PAUSE : o.ON_STOP : o.ON_DESTROY;
                            if (oVar == null) {
                                throw new IllegalStateException("no event down from " + vVar.f865a);
                            }
                            arrayList.add(oVar.a());
                            vVar.a(uVar, oVar);
                            arrayList.remove(arrayList.size() - 1);
                        }
                    }
                }
                n.c cVar4 = this.f870b.f5242e;
                if (!this.f875g && cVar4 != null && this.f871c.compareTo(((v) cVar4.f5235e).f865a) > 0) {
                    n.a aVar3 = this.f870b;
                    aVar3.getClass();
                    n.d dVar = new n.d(aVar3);
                    aVar3.f5243f.put(dVar, Boolean.FALSE);
                    while (dVar.hasNext() && !this.f875g) {
                        Map.Entry entry2 = (Map.Entry) dVar.next();
                        t tVar2 = (t) entry2.getKey();
                        v vVar2 = (v) entry2.getValue();
                        while (vVar2.f865a.compareTo(this.f871c) < 0 && !this.f875g && this.f870b.f5230h.containsKey(tVar2)) {
                            arrayList.add(vVar2.f865a);
                            m mVar2 = o.Companion;
                            p pVar5 = vVar2.f865a;
                            mVar2.getClass();
                            q6.i.e(pVar5, "state");
                            int ordinal2 = pVar5.ordinal();
                            o oVar2 = ordinal2 != 1 ? ordinal2 != 2 ? ordinal2 != 3 ? null : o.ON_RESUME : o.ON_START : o.ON_CREATE;
                            if (oVar2 == null) {
                                throw new IllegalStateException("no event up from " + vVar2.f865a);
                            }
                            vVar2.a(uVar, oVar2);
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
