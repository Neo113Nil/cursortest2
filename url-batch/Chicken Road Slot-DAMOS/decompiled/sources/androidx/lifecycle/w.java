package androidx.lifecycle;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f735a;

    /* renamed from: b, reason: collision with root package name */
    public o.a f736b;

    /* renamed from: c, reason: collision with root package name */
    public p f737c;

    /* renamed from: d, reason: collision with root package name */
    public final WeakReference f738d;

    /* renamed from: e, reason: collision with root package name */
    public int f739e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f740f;
    public boolean g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f741h;

    /* renamed from: i, reason: collision with root package name */
    public final je.l0 f742i;

    public w(u uVar, boolean z10) {
        new AtomicReference(null);
        this.f735a = z10;
        this.f736b = new o.a();
        p pVar = p.f708e;
        this.f737c = pVar;
        this.f741h = new ArrayList();
        this.f738d = new WeakReference(uVar);
        this.f742i = je.b0.b(pVar);
    }

    public final void a(t tVar) {
        s hVar;
        Object obj;
        u uVar;
        tVar.getClass();
        c("addObserver");
        p pVar = this.f737c;
        p pVar2 = p.f707d;
        if (pVar != pVar2) {
            pVar2 = p.f708e;
        }
        v vVar = new v();
        HashMap hashMap = y.f745a;
        boolean z10 = tVar instanceof s;
        boolean z11 = tVar instanceof f;
        if (z10 && z11) {
            hVar = new h((f) tVar, (s) tVar);
        } else if (z11) {
            hVar = new h((f) tVar, (s) null);
        } else if (z10) {
            hVar = (s) tVar;
        } else {
            Class<?> cls = tVar.getClass();
            if (y.b(cls) == 2) {
                Object obj2 = y.f746b.get(cls);
                obj2.getClass();
                List list = (List) obj2;
                if (list.size() == 1) {
                    y.a((Constructor) list.get(0), tVar);
                    throw null;
                }
                int size = list.size();
                j[] jVarArr = new j[size];
                if (size > 0) {
                    y.a((Constructor) list.get(0), tVar);
                    throw null;
                }
                hVar = new e(r6, jVarArr);
            } else {
                hVar = new h(tVar);
            }
        }
        vVar.f731b = hVar;
        vVar.f730a = pVar2;
        o.a aVar = this.f736b;
        o.c b10 = aVar.b(tVar);
        if (b10 != null) {
            obj = b10.f7300e;
        } else {
            HashMap hashMap2 = aVar.f7295s;
            o.c cVar = new o.c(tVar, vVar);
            aVar.f7309r++;
            o.c cVar2 = aVar.f7307e;
            if (cVar2 == null) {
                aVar.f7306d = cVar;
                aVar.f7307e = cVar;
            } else {
                cVar2.f7301i = cVar;
                cVar.f7302r = cVar2;
                aVar.f7307e = cVar;
            }
            hashMap2.put(tVar, cVar);
            obj = null;
        }
        if (((v) obj) == null && (uVar = (u) this.f738d.get()) != null) {
            r6 = (this.f739e != 0 || this.f740f) ? 1 : 0;
            p b11 = b(tVar);
            this.f739e++;
            while (vVar.f730a.compareTo(b11) < 0 && this.f736b.f7295s.containsKey(tVar)) {
                p pVar3 = vVar.f730a;
                ArrayList arrayList = this.f741h;
                arrayList.add(pVar3);
                m mVar = o.Companion;
                p pVar4 = vVar.f730a;
                mVar.getClass();
                pVar4.getClass();
                int ordinal = pVar4.ordinal();
                o oVar = ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? null : o.ON_RESUME : o.ON_START : o.ON_CREATE;
                if (oVar == null) {
                    te.a1.i(vVar.f730a, "no event up from ");
                    return;
                } else {
                    vVar.a(uVar, oVar);
                    arrayList.remove(arrayList.size() - 1);
                    b11 = b(tVar);
                }
            }
            if (r6 == 0) {
                g();
            }
            this.f739e--;
        }
    }

    public final p b(t tVar) {
        HashMap hashMap = this.f736b.f7295s;
        o.c cVar = hashMap.containsKey(tVar) ? ((o.c) hashMap.get(tVar)).f7302r : null;
        p pVar = cVar != null ? ((v) cVar.f7300e).f730a : null;
        ArrayList arrayList = this.f741h;
        p pVar2 = arrayList.isEmpty() ? null : (p) arrayList.get(arrayList.size() - 1);
        p pVar3 = this.f737c;
        pVar3.getClass();
        if (pVar == null || pVar.compareTo(pVar3) >= 0) {
            pVar = pVar3;
        }
        return (pVar2 == null || pVar2.compareTo(pVar) >= 0) ? pVar : pVar2;
    }

    public final void c(String str) {
        if (this.f735a) {
            n.b.Q().f6634a.getClass();
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                throw new IllegalStateException(n0.l.g("Method ", str, " must be called on the main thread").toString());
            }
        }
    }

    public final void d(o oVar) {
        oVar.getClass();
        c("handleLifecycleEvent");
        e(oVar.a());
    }

    public final void e(p pVar) {
        if (this.f737c == pVar) {
            return;
        }
        u uVar = (u) this.f738d.get();
        p pVar2 = this.f737c;
        pVar2.getClass();
        pVar.getClass();
        if (pVar2 == p.f708e && pVar == p.f707d) {
            throw new IllegalStateException(("State must be at least '" + p.f709i + "' to be moved to '" + pVar + "' in component " + uVar).toString());
        }
        p pVar3 = p.f707d;
        if (pVar2 == pVar3 && pVar2 != pVar) {
            throw new IllegalStateException(("State is '" + pVar3 + "' and cannot be moved to `" + pVar + "` in component " + uVar).toString());
        }
        this.f737c = pVar;
        if (this.f740f || this.f739e != 0) {
            this.g = true;
            return;
        }
        this.f740f = true;
        g();
        this.f740f = false;
        if (this.f737c == pVar3) {
            this.f736b = new o.a();
        }
    }

    public final void f(t tVar) {
        tVar.getClass();
        c("removeObserver");
        this.f736b.c(tVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        r11.g = false;
        r11.f742i.j(r11.f737c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g() {
        u uVar = (u) this.f738d.get();
        if (uVar == null) {
            kotlin.collections.i0.l("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
            return;
        }
        while (true) {
            o.a aVar = this.f736b;
            if (aVar.f7309r != 0) {
                o.c cVar = aVar.f7306d;
                cVar.getClass();
                p pVar = ((v) cVar.f7300e).f730a;
                o.c cVar2 = this.f736b.f7307e;
                cVar2.getClass();
                p pVar2 = ((v) cVar2.f7300e).f730a;
                if (pVar == pVar2 && this.f737c == pVar2) {
                    break;
                }
                this.g = false;
                p pVar3 = this.f737c;
                o.c cVar3 = this.f736b.f7306d;
                cVar3.getClass();
                int compareTo = pVar3.compareTo(((v) cVar3.f7300e).f730a);
                ArrayList arrayList = this.f741h;
                if (compareTo < 0) {
                    o.a aVar2 = this.f736b;
                    o.b bVar = new o.b(aVar2.f7307e, aVar2.f7306d, 1);
                    aVar2.f7308i.put(bVar, Boolean.FALSE);
                    while (bVar.hasNext() && !this.g) {
                        Map.Entry entry = (Map.Entry) bVar.next();
                        entry.getClass();
                        t tVar = (t) entry.getKey();
                        v vVar = (v) entry.getValue();
                        while (vVar.f730a.compareTo(this.f737c) > 0 && !this.g && this.f736b.f7295s.containsKey(tVar)) {
                            m mVar = o.Companion;
                            p pVar4 = vVar.f730a;
                            mVar.getClass();
                            pVar4.getClass();
                            int ordinal = pVar4.ordinal();
                            o oVar = ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? null : o.ON_PAUSE : o.ON_STOP : o.ON_DESTROY;
                            if (oVar == null) {
                                te.a1.i(vVar.f730a, "no event down from ");
                                return;
                            } else {
                                arrayList.add(oVar.a());
                                vVar.a(uVar, oVar);
                                arrayList.remove(arrayList.size() - 1);
                            }
                        }
                    }
                }
                o.c cVar4 = this.f736b.f7307e;
                if (!this.g && cVar4 != null && this.f737c.compareTo(((v) cVar4.f7300e).f730a) > 0) {
                    o.a aVar3 = this.f736b;
                    aVar3.getClass();
                    o.d dVar = new o.d(aVar3);
                    aVar3.f7308i.put(dVar, Boolean.FALSE);
                    while (dVar.hasNext() && !this.g) {
                        Map.Entry entry2 = (Map.Entry) dVar.next();
                        t tVar2 = (t) entry2.getKey();
                        v vVar2 = (v) entry2.getValue();
                        while (vVar2.f730a.compareTo(this.f737c) < 0 && !this.g && this.f736b.f7295s.containsKey(tVar2)) {
                            arrayList.add(vVar2.f730a);
                            m mVar2 = o.Companion;
                            p pVar5 = vVar2.f730a;
                            mVar2.getClass();
                            pVar5.getClass();
                            int ordinal2 = pVar5.ordinal();
                            o oVar2 = ordinal2 != 1 ? ordinal2 != 2 ? ordinal2 != 3 ? null : o.ON_RESUME : o.ON_START : o.ON_CREATE;
                            if (oVar2 == null) {
                                te.a1.i(vVar2.f730a, "no event up from ");
                                return;
                            } else {
                                vVar2.a(uVar, oVar2);
                                arrayList.remove(arrayList.size() - 1);
                            }
                        }
                    }
                }
            } else {
                break;
            }
        }
    }
}
