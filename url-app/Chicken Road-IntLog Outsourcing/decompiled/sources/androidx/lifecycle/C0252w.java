package androidx.lifecycle;

import a0.C0171b;
import android.os.Looper;
import b2.AbstractC0279e;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import m.C1263a;

/* renamed from: androidx.lifecycle.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0252w extends AbstractC0245o {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f4590b;

    /* renamed from: c, reason: collision with root package name */
    public n.a f4591c;

    /* renamed from: d, reason: collision with root package name */
    public EnumC0244n f4592d;

    /* renamed from: e, reason: collision with root package name */
    public final WeakReference f4593e;

    /* renamed from: f, reason: collision with root package name */
    public int f4594f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f4595g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f4596h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f4597i;

    /* renamed from: j, reason: collision with root package name */
    public final G4.w f4598j;

    public C0252w(InterfaceC0250u interfaceC0250u) {
        this.f4582a = new AtomicReference();
        this.f4590b = true;
        this.f4591c = new n.a();
        EnumC0244n enumC0244n = EnumC0244n.f4577b;
        this.f4592d = enumC0244n;
        this.f4597i = new ArrayList();
        this.f4593e = new WeakReference(interfaceC0250u);
        this.f4598j = new G4.w(enumC0244n);
    }

    @Override // androidx.lifecycle.AbstractC0245o
    public final void a(InterfaceC0249t interfaceC0249t) {
        InterfaceC0249t c0240j;
        InterfaceC0250u interfaceC0250u;
        ArrayList arrayList = this.f4597i;
        Object obj = null;
        int i2 = 1;
        d("addObserver");
        EnumC0244n enumC0244n = this.f4592d;
        EnumC0244n enumC0244n2 = EnumC0244n.f4576a;
        if (enumC0244n != enumC0244n2) {
            enumC0244n2 = EnumC0244n.f4577b;
        }
        C0251v c0251v = new C0251v();
        HashMap hashMap = AbstractC0254y.f4600a;
        if (interfaceC0249t instanceof InterfaceC0249t) {
            c0240j = interfaceC0249t;
        } else {
            Class<?> cls = interfaceC0249t.getClass();
            if (AbstractC0254y.b(cls) == 2) {
                Object obj2 = AbstractC0254y.f4601b.get(cls);
                kotlin.jvm.internal.i.b(obj2);
                List list = (List) obj2;
                if (list.size() == 1) {
                    AbstractC0254y.a((Constructor) list.get(0), interfaceC0249t);
                    throw null;
                }
                int size = list.size();
                InterfaceC0237g[] interfaceC0237gArr = new InterfaceC0237g[size];
                if (size > 0) {
                    AbstractC0254y.a((Constructor) list.get(0), interfaceC0249t);
                    throw null;
                }
                c0240j = new C0171b(i2, interfaceC0237gArr);
            } else {
                c0240j = new C0240j(interfaceC0249t);
            }
        }
        c0251v.f4589b = c0240j;
        c0251v.f4588a = enumC0244n2;
        n.a aVar = this.f4591c;
        n.c b6 = aVar.b(interfaceC0249t);
        if (b6 != null) {
            obj = b6.f11267b;
        } else {
            HashMap hashMap2 = aVar.f11262e;
            n.c cVar = new n.c(interfaceC0249t, c0251v);
            aVar.f11276d++;
            n.c cVar2 = aVar.f11274b;
            if (cVar2 == null) {
                aVar.f11273a = cVar;
                aVar.f11274b = cVar;
            } else {
                cVar2.f11268c = cVar;
                cVar.f11269d = cVar2;
                aVar.f11274b = cVar;
            }
            hashMap2.put(interfaceC0249t, cVar);
        }
        if (((C0251v) obj) == null && (interfaceC0250u = (InterfaceC0250u) this.f4593e.get()) != null) {
            boolean z = this.f4594f != 0 || this.f4595g;
            EnumC0244n c2 = c(interfaceC0249t);
            this.f4594f++;
            while (c0251v.f4588a.compareTo(c2) < 0 && this.f4591c.f11262e.containsKey(interfaceC0249t)) {
                arrayList.add(c0251v.f4588a);
                C0241k c0241k = EnumC0243m.Companion;
                EnumC0244n enumC0244n3 = c0251v.f4588a;
                c0241k.getClass();
                EnumC0243m b7 = C0241k.b(enumC0244n3);
                if (b7 == null) {
                    throw new IllegalStateException("no event up from " + c0251v.f4588a);
                }
                c0251v.a(interfaceC0250u, b7);
                arrayList.remove(arrayList.size() - 1);
                c2 = c(interfaceC0249t);
            }
            if (!z) {
                g();
            }
            this.f4594f--;
        }
    }

    @Override // androidx.lifecycle.AbstractC0245o
    public final void b(InterfaceC0249t observer) {
        kotlin.jvm.internal.i.e(observer, "observer");
        d("removeObserver");
        this.f4591c.c(observer);
    }

    public final EnumC0244n c(InterfaceC0249t interfaceC0249t) {
        C0251v c0251v;
        HashMap hashMap = this.f4591c.f11262e;
        n.c cVar = hashMap.containsKey(interfaceC0249t) ? ((n.c) hashMap.get(interfaceC0249t)).f11269d : null;
        EnumC0244n enumC0244n = (cVar == null || (c0251v = (C0251v) cVar.f11267b) == null) ? null : c0251v.f4588a;
        ArrayList arrayList = this.f4597i;
        EnumC0244n enumC0244n2 = arrayList.isEmpty() ? null : (EnumC0244n) arrayList.get(arrayList.size() - 1);
        EnumC0244n state1 = this.f4592d;
        kotlin.jvm.internal.i.e(state1, "state1");
        if (enumC0244n == null || enumC0244n.compareTo(state1) >= 0) {
            enumC0244n = state1;
        }
        return (enumC0244n2 == null || enumC0244n2.compareTo(enumC0244n) >= 0) ? enumC0244n : enumC0244n2;
    }

    public final void d(String str) {
        if (this.f4590b) {
            C1263a.U().f11083g.getClass();
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                throw new IllegalStateException(AbstractC0279e.f("Method ", str, " must be called on the main thread").toString());
            }
        }
    }

    public final void e(EnumC0243m event) {
        kotlin.jvm.internal.i.e(event, "event");
        d("handleLifecycleEvent");
        f(event.a());
    }

    public final void f(EnumC0244n enumC0244n) {
        EnumC0244n enumC0244n2 = this.f4592d;
        if (enumC0244n2 == enumC0244n) {
            return;
        }
        EnumC0244n enumC0244n3 = EnumC0244n.f4577b;
        EnumC0244n enumC0244n4 = EnumC0244n.f4576a;
        if (enumC0244n2 == enumC0244n3 && enumC0244n == enumC0244n4) {
            throw new IllegalStateException(("no event down from " + this.f4592d + " in component " + this.f4593e.get()).toString());
        }
        this.f4592d = enumC0244n;
        if (this.f4595g || this.f4594f != 0) {
            this.f4596h = true;
            return;
        }
        this.f4595g = true;
        g();
        this.f4595g = false;
        if (this.f4592d == enumC0244n4) {
            this.f4591c = new n.a();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        r7.f4596h = false;
        r0 = r7.f4592d;
        r1 = r7.f4598j;
        r1.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
    
        if (r0 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003b, code lost:
    
        r0 = H4.t.f1201a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003d, code lost:
    
        r1.c(null, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g() {
        InterfaceC0250u interfaceC0250u = (InterfaceC0250u) this.f4593e.get();
        if (interfaceC0250u == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (true) {
            n.a aVar = this.f4591c;
            if (aVar.f11276d != 0) {
                n.c cVar = aVar.f11273a;
                kotlin.jvm.internal.i.b(cVar);
                EnumC0244n enumC0244n = ((C0251v) cVar.f11267b).f4588a;
                n.c cVar2 = this.f4591c.f11274b;
                kotlin.jvm.internal.i.b(cVar2);
                EnumC0244n enumC0244n2 = ((C0251v) cVar2.f11267b).f4588a;
                if (enumC0244n == enumC0244n2 && this.f4592d == enumC0244n2) {
                    break;
                }
                this.f4596h = false;
                EnumC0244n enumC0244n3 = this.f4592d;
                n.c cVar3 = this.f4591c.f11273a;
                kotlin.jvm.internal.i.b(cVar3);
                if (enumC0244n3.compareTo(((C0251v) cVar3.f11267b).f4588a) < 0) {
                    n.a aVar2 = this.f4591c;
                    n.b bVar = new n.b(aVar2.f11274b, aVar2.f11273a, 1);
                    aVar2.f11275c.put(bVar, Boolean.FALSE);
                    while (bVar.hasNext() && !this.f4596h) {
                        Map.Entry entry = (Map.Entry) bVar.next();
                        kotlin.jvm.internal.i.d(entry, "next()");
                        InterfaceC0249t interfaceC0249t = (InterfaceC0249t) entry.getKey();
                        C0251v c0251v = (C0251v) entry.getValue();
                        while (c0251v.f4588a.compareTo(this.f4592d) > 0 && !this.f4596h && this.f4591c.f11262e.containsKey(interfaceC0249t)) {
                            C0241k c0241k = EnumC0243m.Companion;
                            EnumC0244n enumC0244n4 = c0251v.f4588a;
                            c0241k.getClass();
                            EnumC0243m a6 = C0241k.a(enumC0244n4);
                            if (a6 == null) {
                                throw new IllegalStateException("no event down from " + c0251v.f4588a);
                            }
                            this.f4597i.add(a6.a());
                            c0251v.a(interfaceC0250u, a6);
                            this.f4597i.remove(r4.size() - 1);
                        }
                    }
                }
                n.c cVar4 = this.f4591c.f11274b;
                if (!this.f4596h && cVar4 != null && this.f4592d.compareTo(((C0251v) cVar4.f11267b).f4588a) > 0) {
                    n.a aVar3 = this.f4591c;
                    aVar3.getClass();
                    n.d dVar = new n.d(aVar3);
                    aVar3.f11275c.put(dVar, Boolean.FALSE);
                    while (dVar.hasNext() && !this.f4596h) {
                        Map.Entry entry2 = (Map.Entry) dVar.next();
                        InterfaceC0249t interfaceC0249t2 = (InterfaceC0249t) entry2.getKey();
                        C0251v c0251v2 = (C0251v) entry2.getValue();
                        while (c0251v2.f4588a.compareTo(this.f4592d) < 0 && !this.f4596h && this.f4591c.f11262e.containsKey(interfaceC0249t2)) {
                            this.f4597i.add(c0251v2.f4588a);
                            C0241k c0241k2 = EnumC0243m.Companion;
                            EnumC0244n enumC0244n5 = c0251v2.f4588a;
                            c0241k2.getClass();
                            EnumC0243m b6 = C0241k.b(enumC0244n5);
                            if (b6 == null) {
                                throw new IllegalStateException("no event up from " + c0251v2.f4588a);
                            }
                            c0251v2.a(interfaceC0250u, b6);
                            this.f4597i.remove(r4.size() - 1);
                        }
                    }
                }
            } else {
                break;
            }
        }
    }
}
