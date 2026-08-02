package androidx.lifecycle;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import m.C1106a;
import n.C1115a;
import n.C1116b;
import n.C1117c;
import n.C1118d;
import w0.AbstractC1234c;

/* loaded from: classes.dex */
public final class o extends i {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f2387a;

    /* renamed from: b, reason: collision with root package name */
    public C1115a f2388b;

    /* renamed from: c, reason: collision with root package name */
    public h f2389c;

    /* renamed from: d, reason: collision with root package name */
    public final WeakReference f2390d;

    /* renamed from: e, reason: collision with root package name */
    public int f2391e;
    public boolean f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2392g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f2393h;

    /* renamed from: i, reason: collision with root package name */
    public final w2.p f2394i;

    public o(m mVar) {
        new AtomicReference();
        this.f2387a = true;
        this.f2388b = new C1115a();
        h hVar = h.f2380b;
        this.f2389c = hVar;
        this.f2393h = new ArrayList();
        this.f2390d = new WeakReference(mVar);
        this.f2394i = new w2.p(hVar);
    }

    @Override // androidx.lifecycle.i
    public final void a(l lVar) {
        Object obj;
        m mVar;
        ArrayList arrayList = this.f2393h;
        d("addObserver");
        h hVar = this.f2389c;
        h hVar2 = h.f2379a;
        if (hVar != hVar2) {
            hVar2 = h.f2380b;
        }
        n nVar = new n();
        int i3 = p.f2395a;
        nVar.f2386b = lVar;
        nVar.f2385a = hVar2;
        C1115a c1115a = this.f2388b;
        C1117c b3 = c1115a.b(lVar);
        if (b3 != null) {
            obj = b3.f9975b;
        } else {
            HashMap hashMap = c1115a.f9970e;
            C1117c c1117c = new C1117c(lVar, nVar);
            c1115a.f9984d++;
            C1117c c1117c2 = c1115a.f9982b;
            if (c1117c2 == null) {
                c1115a.f9981a = c1117c;
                c1115a.f9982b = c1117c;
            } else {
                c1117c2.f9976c = c1117c;
                c1117c.f9977d = c1117c2;
                c1115a.f9982b = c1117c;
            }
            hashMap.put(lVar, c1117c);
            obj = null;
        }
        if (((n) obj) == null && (mVar = (m) this.f2390d.get()) != null) {
            boolean z = this.f2391e != 0 || this.f;
            h c3 = c(lVar);
            this.f2391e++;
            while (nVar.f2385a.compareTo(c3) < 0 && this.f2388b.f9970e.containsKey(lVar)) {
                arrayList.add(nVar.f2385a);
                C0163e c0163e = EnumC0165g.Companion;
                h state = nVar.f2385a;
                c0163e.getClass();
                kotlin.jvm.internal.j.e(state, "state");
                int ordinal = state.ordinal();
                EnumC0165g enumC0165g = ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? null : EnumC0165g.ON_RESUME : EnumC0165g.ON_START : EnumC0165g.ON_CREATE;
                if (enumC0165g == null) {
                    throw new IllegalStateException("no event up from " + nVar.f2385a);
                }
                nVar.a(mVar, enumC0165g);
                arrayList.remove(arrayList.size() - 1);
                c3 = c(lVar);
            }
            if (!z) {
                g();
            }
            this.f2391e--;
        }
    }

    @Override // androidx.lifecycle.i
    public final void b(l observer) {
        kotlin.jvm.internal.j.e(observer, "observer");
        d("removeObserver");
        this.f2388b.c(observer);
    }

    public final h c(l lVar) {
        n nVar;
        HashMap hashMap = this.f2388b.f9970e;
        C1117c c1117c = hashMap.containsKey(lVar) ? ((C1117c) hashMap.get(lVar)).f9977d : null;
        h hVar = (c1117c == null || (nVar = (n) c1117c.f9975b) == null) ? null : nVar.f2385a;
        ArrayList arrayList = this.f2393h;
        h hVar2 = arrayList.isEmpty() ? null : (h) arrayList.get(arrayList.size() - 1);
        h state1 = this.f2389c;
        kotlin.jvm.internal.j.e(state1, "state1");
        if (hVar == null || hVar.compareTo(state1) >= 0) {
            hVar = state1;
        }
        return (hVar2 == null || hVar2.compareTo(hVar) >= 0) ? hVar : hVar2;
    }

    public final void d(String str) {
        C1106a c1106a;
        if (this.f2387a) {
            if (C1106a.f9944c != null) {
                c1106a = C1106a.f9944c;
            } else {
                synchronized (C1106a.class) {
                    try {
                        if (C1106a.f9944c == null) {
                            C1106a.f9944c = new C1106a(0);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                c1106a = C1106a.f9944c;
            }
            ((C1106a) c1106a.f9945b).getClass();
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                throw new IllegalStateException(AbstractC1234c.a("Method ", str, " must be called on the main thread").toString());
            }
        }
    }

    public final void e(EnumC0165g event) {
        kotlin.jvm.internal.j.e(event, "event");
        d("handleLifecycleEvent");
        f(event.a());
    }

    public final void f(h hVar) {
        h hVar2 = this.f2389c;
        if (hVar2 == hVar) {
            return;
        }
        h hVar3 = h.f2380b;
        h hVar4 = h.f2379a;
        if (hVar2 == hVar3 && hVar == hVar4) {
            throw new IllegalStateException(("no event down from " + this.f2389c + " in component " + this.f2390d.get()).toString());
        }
        this.f2389c = hVar;
        if (this.f || this.f2391e != 0) {
            this.f2392g = true;
            return;
        }
        this.f = true;
        g();
        this.f = false;
        if (this.f2389c == hVar4) {
            this.f2388b = new C1115a();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0031, code lost:
    
        r12.f2392g = false;
        r0 = r12.f2389c;
        r1 = r12.f2394i;
        r1.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003a, code lost:
    
        if (r0 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003c, code lost:
    
        r0 = x2.k.f10788a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003e, code lost:
    
        r1.b(null, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g() {
        m mVar = (m) this.f2390d.get();
        if (mVar == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (true) {
            C1115a c1115a = this.f2388b;
            if (c1115a.f9984d != 0) {
                C1117c c1117c = c1115a.f9981a;
                kotlin.jvm.internal.j.b(c1117c);
                h hVar = ((n) c1117c.f9975b).f2385a;
                C1117c c1117c2 = this.f2388b.f9982b;
                kotlin.jvm.internal.j.b(c1117c2);
                h hVar2 = ((n) c1117c2.f9975b).f2385a;
                if (hVar == hVar2 && this.f2389c == hVar2) {
                    break;
                }
                this.f2392g = false;
                h hVar3 = this.f2389c;
                C1117c c1117c3 = this.f2388b.f9981a;
                kotlin.jvm.internal.j.b(c1117c3);
                if (hVar3.compareTo(((n) c1117c3.f9975b).f2385a) < 0) {
                    C1115a c1115a2 = this.f2388b;
                    C1116b c1116b = new C1116b(c1115a2.f9982b, c1115a2.f9981a, 1);
                    c1115a2.f9983c.put(c1116b, Boolean.FALSE);
                    while (c1116b.hasNext() && !this.f2392g) {
                        Map.Entry entry = (Map.Entry) c1116b.next();
                        kotlin.jvm.internal.j.d(entry, "next()");
                        l lVar = (l) entry.getKey();
                        n nVar = (n) entry.getValue();
                        while (nVar.f2385a.compareTo(this.f2389c) > 0 && !this.f2392g && this.f2388b.f9970e.containsKey(lVar)) {
                            C0163e c0163e = EnumC0165g.Companion;
                            h state = nVar.f2385a;
                            c0163e.getClass();
                            kotlin.jvm.internal.j.e(state, "state");
                            int ordinal = state.ordinal();
                            EnumC0165g enumC0165g = ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? null : EnumC0165g.ON_PAUSE : EnumC0165g.ON_STOP : EnumC0165g.ON_DESTROY;
                            if (enumC0165g == null) {
                                throw new IllegalStateException("no event down from " + nVar.f2385a);
                            }
                            this.f2393h.add(enumC0165g.a());
                            nVar.a(mVar, enumC0165g);
                            ArrayList arrayList = this.f2393h;
                            arrayList.remove(arrayList.size() - 1);
                        }
                    }
                }
                C1117c c1117c4 = this.f2388b.f9982b;
                if (!this.f2392g && c1117c4 != null && this.f2389c.compareTo(((n) c1117c4.f9975b).f2385a) > 0) {
                    C1115a c1115a3 = this.f2388b;
                    c1115a3.getClass();
                    C1118d c1118d = new C1118d(c1115a3);
                    c1115a3.f9983c.put(c1118d, Boolean.FALSE);
                    while (c1118d.hasNext() && !this.f2392g) {
                        Map.Entry entry2 = (Map.Entry) c1118d.next();
                        l lVar2 = (l) entry2.getKey();
                        n nVar2 = (n) entry2.getValue();
                        while (nVar2.f2385a.compareTo(this.f2389c) < 0 && !this.f2392g && this.f2388b.f9970e.containsKey(lVar2)) {
                            this.f2393h.add(nVar2.f2385a);
                            C0163e c0163e2 = EnumC0165g.Companion;
                            h state2 = nVar2.f2385a;
                            c0163e2.getClass();
                            kotlin.jvm.internal.j.e(state2, "state");
                            int ordinal2 = state2.ordinal();
                            EnumC0165g enumC0165g2 = ordinal2 != 1 ? ordinal2 != 2 ? ordinal2 != 3 ? null : EnumC0165g.ON_RESUME : EnumC0165g.ON_START : EnumC0165g.ON_CREATE;
                            if (enumC0165g2 == null) {
                                throw new IllegalStateException("no event up from " + nVar2.f2385a);
                            }
                            nVar2.a(mVar, enumC0165g2);
                            ArrayList arrayList2 = this.f2393h;
                            arrayList2.remove(arrayList2.size() - 1);
                        }
                    }
                }
            } else {
                break;
            }
        }
    }
}
