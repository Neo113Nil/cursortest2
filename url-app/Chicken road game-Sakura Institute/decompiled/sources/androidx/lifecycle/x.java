package androidx.lifecycle;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public AtomicReference f1043a = new AtomicReference(null);

    /* renamed from: b, reason: collision with root package name */
    public final boolean f1044b = true;

    /* renamed from: c, reason: collision with root package name */
    public h.a f1045c = new h.a();

    /* renamed from: d, reason: collision with root package name */
    public o f1046d;

    /* renamed from: e, reason: collision with root package name */
    public final WeakReference f1047e;

    /* renamed from: f, reason: collision with root package name */
    public int f1048f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1049g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f1050h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f1051i;

    /* renamed from: j, reason: collision with root package name */
    public final f7.q0 f1052j;

    public x(v vVar) {
        o oVar = o.f1008g;
        this.f1046d = oVar;
        this.f1051i = new ArrayList();
        this.f1047e = new WeakReference(vVar);
        this.f1052j = f7.f0.c(oVar);
    }

    public final void a(u uVar) {
        t gVar;
        Object obj;
        v vVar;
        r6.k.f(uVar, "observer");
        c("addObserver");
        o oVar = this.f1046d;
        o oVar2 = o.f1007f;
        if (oVar != oVar2) {
            oVar2 = o.f1008g;
        }
        w wVar = new w();
        HashMap hashMap = y.f1056a;
        boolean z8 = uVar instanceof t;
        boolean z9 = uVar instanceof e;
        int i7 = 1;
        if (z8 && z9) {
            gVar = new g((e) uVar, (t) uVar);
        } else if (z9) {
            gVar = new g((e) uVar, (t) null);
        } else if (z8) {
            gVar = (t) uVar;
        } else {
            Class<?> cls = uVar.getClass();
            if (y.b(cls) == 2) {
                Object obj2 = y.f1057b.get(cls);
                r6.k.c(obj2);
                List list = (List) obj2;
                if (list.size() == 1) {
                    y.a((Constructor) list.get(0), uVar);
                    throw null;
                }
                int size = list.size();
                i[] iVarArr = new i[size];
                if (size > 0) {
                    y.a((Constructor) list.get(0), uVar);
                    throw null;
                }
                gVar = new x3.b(i7, iVarArr);
            } else {
                gVar = new g(uVar);
            }
        }
        wVar.f1041b = gVar;
        wVar.f1040a = oVar2;
        h.a aVar = this.f1045c;
        h.c a3 = aVar.a(uVar);
        if (a3 != null) {
            obj = a3.f4577g;
        } else {
            HashMap hashMap2 = aVar.f4572j;
            h.c cVar = new h.c(uVar, wVar);
            aVar.f4586i++;
            h.c cVar2 = aVar.f4584g;
            if (cVar2 == null) {
                aVar.f4583f = cVar;
                aVar.f4584g = cVar;
            } else {
                cVar2.f4578h = cVar;
                cVar.f4579i = cVar2;
                aVar.f4584g = cVar;
            }
            hashMap2.put(uVar, cVar);
            obj = null;
        }
        if (((w) obj) == null && (vVar = (v) this.f1047e.get()) != null) {
            boolean z10 = this.f1048f != 0 || this.f1049g;
            o b9 = b(uVar);
            this.f1048f++;
            while (wVar.f1040a.compareTo(b9) < 0 && this.f1045c.f4572j.containsKey(uVar)) {
                o oVar3 = wVar.f1040a;
                ArrayList arrayList = this.f1051i;
                arrayList.add(oVar3);
                l lVar = n.Companion;
                o oVar4 = wVar.f1040a;
                lVar.getClass();
                r6.k.f(oVar4, "state");
                int ordinal = oVar4.ordinal();
                n nVar = ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? null : n.ON_RESUME : n.ON_START : n.ON_CREATE;
                if (nVar == null) {
                    throw new IllegalStateException("no event up from " + wVar.f1040a);
                }
                wVar.a(vVar, nVar);
                arrayList.remove(arrayList.size() - 1);
                b9 = b(uVar);
            }
            if (!z10) {
                h();
            }
            this.f1048f--;
        }
    }

    public final o b(u uVar) {
        w wVar;
        HashMap hashMap = this.f1045c.f4572j;
        h.c cVar = hashMap.containsKey(uVar) ? ((h.c) hashMap.get(uVar)).f4579i : null;
        o oVar = (cVar == null || (wVar = (w) cVar.f4577g) == null) ? null : wVar.f1040a;
        ArrayList arrayList = this.f1051i;
        o oVar2 = arrayList.isEmpty() ? null : (o) arrayList.get(arrayList.size() - 1);
        o oVar3 = this.f1046d;
        r6.k.f(oVar3, "state1");
        if (oVar == null || oVar.compareTo(oVar3) >= 0) {
            oVar = oVar3;
        }
        return (oVar2 == null || oVar2.compareTo(oVar) >= 0) ? oVar : oVar2;
    }

    public final void c(String str) {
        if (this.f1044b) {
            g.b.p0().f3655d.getClass();
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                throw new IllegalStateException(a0.m.j("Method ", str, " must be called on the main thread").toString());
            }
        }
    }

    public final void d(n nVar) {
        r6.k.f(nVar, "event");
        c("handleLifecycleEvent");
        e(nVar.a());
    }

    public final void e(o oVar) {
        o oVar2 = this.f1046d;
        if (oVar2 == oVar) {
            return;
        }
        o oVar3 = o.f1008g;
        o oVar4 = o.f1007f;
        if (oVar2 == oVar3 && oVar == oVar4) {
            throw new IllegalStateException(("State must be at least CREATED to move to " + oVar + ", but was " + this.f1046d + " in component " + this.f1047e.get()).toString());
        }
        this.f1046d = oVar;
        if (this.f1049g || this.f1048f != 0) {
            this.f1050h = true;
            return;
        }
        this.f1049g = true;
        h();
        this.f1049g = false;
        if (this.f1046d == oVar4) {
            this.f1045c = new h.a();
        }
    }

    public final void f(u uVar) {
        r6.k.f(uVar, "observer");
        c("removeObserver");
        this.f1045c.g(uVar);
    }

    public final void g(o oVar) {
        r6.k.f(oVar, "state");
        c("setCurrentState");
        e(oVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        r12.f1050h = false;
        r12.f1052j.j(r12.f1046d);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h() {
        v vVar = (v) this.f1047e.get();
        if (vVar == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (true) {
            h.a aVar = this.f1045c;
            if (aVar.f4586i != 0) {
                h.c cVar = aVar.f4583f;
                r6.k.c(cVar);
                o oVar = ((w) cVar.f4577g).f1040a;
                h.c cVar2 = this.f1045c.f4584g;
                r6.k.c(cVar2);
                o oVar2 = ((w) cVar2.f4577g).f1040a;
                if (oVar == oVar2 && this.f1046d == oVar2) {
                    break;
                }
                this.f1050h = false;
                o oVar3 = this.f1046d;
                h.c cVar3 = this.f1045c.f4583f;
                r6.k.c(cVar3);
                int compareTo = oVar3.compareTo(((w) cVar3.f4577g).f1040a);
                ArrayList arrayList = this.f1051i;
                if (compareTo < 0) {
                    h.a aVar2 = this.f1045c;
                    h.b bVar = new h.b(aVar2.f4584g, aVar2.f4583f, 1);
                    aVar2.f4585h.put(bVar, Boolean.FALSE);
                    while (bVar.hasNext() && !this.f1050h) {
                        Map.Entry entry = (Map.Entry) bVar.next();
                        r6.k.e(entry, "next()");
                        u uVar = (u) entry.getKey();
                        w wVar = (w) entry.getValue();
                        while (wVar.f1040a.compareTo(this.f1046d) > 0 && !this.f1050h && this.f1045c.f4572j.containsKey(uVar)) {
                            l lVar = n.Companion;
                            o oVar4 = wVar.f1040a;
                            lVar.getClass();
                            r6.k.f(oVar4, "state");
                            int ordinal = oVar4.ordinal();
                            n nVar = ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? null : n.ON_PAUSE : n.ON_STOP : n.ON_DESTROY;
                            if (nVar == null) {
                                throw new IllegalStateException("no event down from " + wVar.f1040a);
                            }
                            arrayList.add(nVar.a());
                            wVar.a(vVar, nVar);
                            arrayList.remove(arrayList.size() - 1);
                        }
                    }
                }
                h.c cVar4 = this.f1045c.f4584g;
                if (!this.f1050h && cVar4 != null && this.f1046d.compareTo(((w) cVar4.f4577g).f1040a) > 0) {
                    h.a aVar3 = this.f1045c;
                    aVar3.getClass();
                    h.d dVar = new h.d(aVar3);
                    aVar3.f4585h.put(dVar, Boolean.FALSE);
                    while (dVar.hasNext() && !this.f1050h) {
                        Map.Entry entry2 = (Map.Entry) dVar.next();
                        u uVar2 = (u) entry2.getKey();
                        w wVar2 = (w) entry2.getValue();
                        while (wVar2.f1040a.compareTo(this.f1046d) < 0 && !this.f1050h && this.f1045c.f4572j.containsKey(uVar2)) {
                            arrayList.add(wVar2.f1040a);
                            l lVar2 = n.Companion;
                            o oVar5 = wVar2.f1040a;
                            lVar2.getClass();
                            r6.k.f(oVar5, "state");
                            int ordinal2 = oVar5.ordinal();
                            n nVar2 = ordinal2 != 1 ? ordinal2 != 2 ? ordinal2 != 3 ? null : n.ON_RESUME : n.ON_START : n.ON_CREATE;
                            if (nVar2 == null) {
                                throw new IllegalStateException("no event up from " + wVar2.f1040a);
                            }
                            wVar2.a(vVar, nVar2);
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
