package androidx.lifecycle;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import l.C0484a;
import m.C0513a;
import m.C0514b;
import m.C0515c;
import m.C0516d;

/* renamed from: androidx.lifecycle.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0255w extends AbstractC0248o {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3525b;

    /* renamed from: c, reason: collision with root package name */
    public C0513a f3526c;

    /* renamed from: d, reason: collision with root package name */
    public EnumC0247n f3527d;

    /* renamed from: e, reason: collision with root package name */
    public final WeakReference f3528e;

    /* renamed from: f, reason: collision with root package name */
    public int f3529f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3530g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f3531h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f3532i;

    /* renamed from: j, reason: collision with root package name */
    public final K5.k f3533j;

    public C0255w(InterfaceC0253u interfaceC0253u) {
        this.f3517a = new AtomicReference();
        this.f3525b = true;
        this.f3526c = new C0513a();
        EnumC0247n enumC0247n = EnumC0247n.f3512g;
        this.f3527d = enumC0247n;
        this.f3532i = new ArrayList();
        this.f3528e = new WeakReference(interfaceC0253u);
        this.f3533j = new K5.k(enumC0247n);
    }

    @Override // androidx.lifecycle.AbstractC0248o
    public final void a(InterfaceC0252t interfaceC0252t) {
        InterfaceC0252t c0243j;
        Object obj;
        InterfaceC0253u interfaceC0253u;
        d("addObserver");
        EnumC0247n enumC0247n = this.f3527d;
        EnumC0247n enumC0247n2 = EnumC0247n.f3511f;
        if (enumC0247n != enumC0247n2) {
            enumC0247n2 = EnumC0247n.f3512g;
        }
        C0254v c0254v = new C0254v();
        HashMap hashMap = AbstractC0257y.f3535a;
        int i7 = 1;
        if (interfaceC0252t instanceof InterfaceC0252t) {
            c0243j = interfaceC0252t;
        } else {
            Class<?> cls = interfaceC0252t.getClass();
            if (AbstractC0257y.b(cls) == 2) {
                Object obj2 = AbstractC0257y.f3536b.get(cls);
                kotlin.jvm.internal.i.b(obj2);
                List list = (List) obj2;
                if (list.size() == 1) {
                    AbstractC0257y.a((Constructor) list.get(0), interfaceC0252t);
                    throw null;
                }
                int size = list.size();
                InterfaceC0240g[] interfaceC0240gArr = new InterfaceC0240g[size];
                if (size > 0) {
                    AbstractC0257y.a((Constructor) list.get(0), interfaceC0252t);
                    throw null;
                }
                c0243j = new T.b(i7, interfaceC0240gArr);
            } else {
                c0243j = new C0243j(interfaceC0252t);
            }
        }
        c0254v.f3524b = c0243j;
        c0254v.f3523a = enumC0247n2;
        C0513a c0513a = this.f3526c;
        C0515c a7 = c0513a.a(interfaceC0252t);
        if (a7 != null) {
            obj = a7.f5316g;
        } else {
            HashMap hashMap2 = c0513a.f5311j;
            C0515c c0515c = new C0515c(interfaceC0252t, c0254v);
            c0513a.f5325i++;
            C0515c c0515c2 = c0513a.f5323g;
            if (c0515c2 == null) {
                c0513a.f5322f = c0515c;
                c0513a.f5323g = c0515c;
            } else {
                c0515c2.f5317h = c0515c;
                c0515c.f5318i = c0515c2;
                c0513a.f5323g = c0515c;
            }
            hashMap2.put(interfaceC0252t, c0515c);
            obj = null;
        }
        if (((C0254v) obj) == null && (interfaceC0253u = (InterfaceC0253u) this.f3528e.get()) != null) {
            boolean z5 = this.f3529f != 0 || this.f3530g;
            EnumC0247n c7 = c(interfaceC0252t);
            this.f3529f++;
            while (c0254v.f3523a.compareTo(c7) < 0 && this.f3526c.f5311j.containsKey(interfaceC0252t)) {
                EnumC0247n enumC0247n3 = c0254v.f3523a;
                ArrayList arrayList = this.f3532i;
                arrayList.add(enumC0247n3);
                C0244k c0244k = EnumC0246m.Companion;
                EnumC0247n state = c0254v.f3523a;
                c0244k.getClass();
                kotlin.jvm.internal.i.e(state, "state");
                int ordinal = state.ordinal();
                EnumC0246m enumC0246m = ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? null : EnumC0246m.ON_RESUME : EnumC0246m.ON_START : EnumC0246m.ON_CREATE;
                if (enumC0246m == null) {
                    throw new IllegalStateException("no event up from " + c0254v.f3523a);
                }
                c0254v.a(interfaceC0253u, enumC0246m);
                arrayList.remove(arrayList.size() - 1);
                c7 = c(interfaceC0252t);
            }
            if (!z5) {
                g();
            }
            this.f3529f--;
        }
    }

    @Override // androidx.lifecycle.AbstractC0248o
    public final void b(InterfaceC0252t observer) {
        kotlin.jvm.internal.i.e(observer, "observer");
        d("removeObserver");
        this.f3526c.b(observer);
    }

    public final EnumC0247n c(InterfaceC0252t interfaceC0252t) {
        C0254v c0254v;
        HashMap hashMap = this.f3526c.f5311j;
        C0515c c0515c = hashMap.containsKey(interfaceC0252t) ? ((C0515c) hashMap.get(interfaceC0252t)).f5318i : null;
        EnumC0247n enumC0247n = (c0515c == null || (c0254v = (C0254v) c0515c.f5316g) == null) ? null : c0254v.f3523a;
        ArrayList arrayList = this.f3532i;
        EnumC0247n enumC0247n2 = arrayList.isEmpty() ? null : (EnumC0247n) arrayList.get(arrayList.size() - 1);
        EnumC0247n state1 = this.f3527d;
        kotlin.jvm.internal.i.e(state1, "state1");
        if (enumC0247n == null || enumC0247n.compareTo(state1) >= 0) {
            enumC0247n = state1;
        }
        return (enumC0247n2 == null || enumC0247n2.compareTo(enumC0247n) >= 0) ? enumC0247n : enumC0247n2;
    }

    public final void d(String str) {
        if (this.f3525b) {
            C0484a.o0().f5237b.getClass();
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                throw new IllegalStateException(W4.o.e("Method ", str, " must be called on the main thread").toString());
            }
        }
    }

    public final void e(EnumC0246m event) {
        kotlin.jvm.internal.i.e(event, "event");
        d("handleLifecycleEvent");
        f(event.a());
    }

    public final void f(EnumC0247n enumC0247n) {
        EnumC0247n enumC0247n2 = this.f3527d;
        if (enumC0247n2 == enumC0247n) {
            return;
        }
        EnumC0247n enumC0247n3 = EnumC0247n.f3512g;
        EnumC0247n enumC0247n4 = EnumC0247n.f3511f;
        if (enumC0247n2 == enumC0247n3 && enumC0247n == enumC0247n4) {
            throw new IllegalStateException(("no event down from " + this.f3527d + " in component " + this.f3528e.get()).toString());
        }
        this.f3527d = enumC0247n;
        if (this.f3530g || this.f3529f != 0) {
            this.f3531h = true;
            return;
        }
        this.f3530g = true;
        g();
        this.f3530g = false;
        if (this.f3527d == enumC0247n4) {
            this.f3526c = new C0513a();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        r12.f3531h = false;
        r12.f3533j.e(r12.f3527d);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g() {
        InterfaceC0253u interfaceC0253u = (InterfaceC0253u) this.f3528e.get();
        if (interfaceC0253u == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (true) {
            C0513a c0513a = this.f3526c;
            if (c0513a.f5325i != 0) {
                C0515c c0515c = c0513a.f5322f;
                kotlin.jvm.internal.i.b(c0515c);
                EnumC0247n enumC0247n = ((C0254v) c0515c.f5316g).f3523a;
                C0515c c0515c2 = this.f3526c.f5323g;
                kotlin.jvm.internal.i.b(c0515c2);
                EnumC0247n enumC0247n2 = ((C0254v) c0515c2.f5316g).f3523a;
                if (enumC0247n == enumC0247n2 && this.f3527d == enumC0247n2) {
                    break;
                }
                this.f3531h = false;
                EnumC0247n enumC0247n3 = this.f3527d;
                C0515c c0515c3 = this.f3526c.f5322f;
                kotlin.jvm.internal.i.b(c0515c3);
                if (enumC0247n3.compareTo(((C0254v) c0515c3.f5316g).f3523a) < 0) {
                    C0513a c0513a2 = this.f3526c;
                    C0514b c0514b = new C0514b(c0513a2.f5323g, c0513a2.f5322f, 1);
                    c0513a2.f5324h.put(c0514b, Boolean.FALSE);
                    while (c0514b.hasNext() && !this.f3531h) {
                        Map.Entry entry = (Map.Entry) c0514b.next();
                        kotlin.jvm.internal.i.d(entry, "next()");
                        InterfaceC0252t interfaceC0252t = (InterfaceC0252t) entry.getKey();
                        C0254v c0254v = (C0254v) entry.getValue();
                        while (c0254v.f3523a.compareTo(this.f3527d) > 0 && !this.f3531h && this.f3526c.f5311j.containsKey(interfaceC0252t)) {
                            C0244k c0244k = EnumC0246m.Companion;
                            EnumC0247n state = c0254v.f3523a;
                            c0244k.getClass();
                            kotlin.jvm.internal.i.e(state, "state");
                            int ordinal = state.ordinal();
                            EnumC0246m enumC0246m = ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? null : EnumC0246m.ON_PAUSE : EnumC0246m.ON_STOP : EnumC0246m.ON_DESTROY;
                            if (enumC0246m == null) {
                                throw new IllegalStateException("no event down from " + c0254v.f3523a);
                            }
                            this.f3532i.add(enumC0246m.a());
                            c0254v.a(interfaceC0253u, enumC0246m);
                            ArrayList arrayList = this.f3532i;
                            arrayList.remove(arrayList.size() - 1);
                        }
                    }
                }
                C0515c c0515c4 = this.f3526c.f5323g;
                if (!this.f3531h && c0515c4 != null && this.f3527d.compareTo(((C0254v) c0515c4.f5316g).f3523a) > 0) {
                    C0513a c0513a3 = this.f3526c;
                    c0513a3.getClass();
                    C0516d c0516d = new C0516d(c0513a3);
                    c0513a3.f5324h.put(c0516d, Boolean.FALSE);
                    while (c0516d.hasNext() && !this.f3531h) {
                        Map.Entry entry2 = (Map.Entry) c0516d.next();
                        InterfaceC0252t interfaceC0252t2 = (InterfaceC0252t) entry2.getKey();
                        C0254v c0254v2 = (C0254v) entry2.getValue();
                        while (c0254v2.f3523a.compareTo(this.f3527d) < 0 && !this.f3531h && this.f3526c.f5311j.containsKey(interfaceC0252t2)) {
                            this.f3532i.add(c0254v2.f3523a);
                            C0244k c0244k2 = EnumC0246m.Companion;
                            EnumC0247n state2 = c0254v2.f3523a;
                            c0244k2.getClass();
                            kotlin.jvm.internal.i.e(state2, "state");
                            int ordinal2 = state2.ordinal();
                            EnumC0246m enumC0246m2 = ordinal2 != 1 ? ordinal2 != 2 ? ordinal2 != 3 ? null : EnumC0246m.ON_RESUME : EnumC0246m.ON_START : EnumC0246m.ON_CREATE;
                            if (enumC0246m2 == null) {
                                throw new IllegalStateException("no event up from " + c0254v2.f3523a);
                            }
                            c0254v2.a(interfaceC0253u, enumC0246m2);
                            ArrayList arrayList2 = this.f3532i;
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
