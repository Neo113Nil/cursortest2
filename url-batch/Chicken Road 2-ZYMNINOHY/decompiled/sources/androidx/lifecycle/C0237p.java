package androidx.lifecycle;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import m.C1273a;
import m.C1274b;
import m.C1275c;
import m.C1276d;
import x.AbstractC1514c;

/* renamed from: androidx.lifecycle.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0237p extends AbstractC0231j {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f5050a;

    /* renamed from: b, reason: collision with root package name */
    public C1273a f5051b;

    /* renamed from: c, reason: collision with root package name */
    public EnumC0230i f5052c;

    /* renamed from: d, reason: collision with root package name */
    public final WeakReference f5053d;

    /* renamed from: e, reason: collision with root package name */
    public int f5054e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f5055f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f5056g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f5057h;

    /* renamed from: i, reason: collision with root package name */
    public final A3.v f5058i;

    public C0237p(InterfaceC0235n interfaceC0235n) {
        new AtomicReference();
        this.f5050a = true;
        this.f5051b = new C1273a();
        EnumC0230i enumC0230i = EnumC0230i.f5042b;
        this.f5052c = enumC0230i;
        this.f5057h = new ArrayList();
        this.f5053d = new WeakReference(interfaceC0235n);
        this.f5058i = new A3.v(enumC0230i);
    }

    @Override // androidx.lifecycle.AbstractC0231j
    public final void a(InterfaceC0234m interfaceC0234m) {
        Object obj;
        InterfaceC0235n interfaceC0235n;
        d("addObserver");
        EnumC0230i enumC0230i = this.f5052c;
        EnumC0230i enumC0230i2 = EnumC0230i.f5041a;
        if (enumC0230i != enumC0230i2) {
            enumC0230i2 = EnumC0230i.f5042b;
        }
        C0236o c0236o = new C0236o();
        int i4 = q.f5059a;
        c0236o.f5049b = interfaceC0234m;
        c0236o.f5048a = enumC0230i2;
        C1273a c1273a = this.f5051b;
        C1275c b4 = c1273a.b(interfaceC0234m);
        if (b4 != null) {
            obj = b4.f14282b;
        } else {
            HashMap hashMap = c1273a.f14277e;
            C1275c c1275c = new C1275c(interfaceC0234m, c0236o);
            c1273a.f14291d++;
            C1275c c1275c2 = c1273a.f14289b;
            if (c1275c2 == null) {
                c1273a.f14288a = c1275c;
                c1273a.f14289b = c1275c;
            } else {
                c1275c2.f14283c = c1275c;
                c1275c.f14284d = c1275c2;
                c1273a.f14289b = c1275c;
            }
            hashMap.put(interfaceC0234m, c1275c);
            obj = null;
        }
        if (((C0236o) obj) == null && (interfaceC0235n = (InterfaceC0235n) this.f5053d.get()) != null) {
            boolean z = this.f5054e != 0 || this.f5055f;
            EnumC0230i c4 = c(interfaceC0234m);
            this.f5054e++;
            while (c0236o.f5048a.compareTo(c4) < 0 && this.f5051b.f14277e.containsKey(interfaceC0234m)) {
                EnumC0230i enumC0230i3 = c0236o.f5048a;
                ArrayList arrayList = this.f5057h;
                arrayList.add(enumC0230i3);
                C0227f c0227f = EnumC0229h.Companion;
                EnumC0230i state = c0236o.f5048a;
                c0227f.getClass();
                kotlin.jvm.internal.i.e(state, "state");
                int ordinal = state.ordinal();
                EnumC0229h enumC0229h = ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? null : EnumC0229h.ON_RESUME : EnumC0229h.ON_START : EnumC0229h.ON_CREATE;
                if (enumC0229h == null) {
                    throw new IllegalStateException("no event up from " + c0236o.f5048a);
                }
                c0236o.a(interfaceC0235n, enumC0229h);
                arrayList.remove(arrayList.size() - 1);
                c4 = c(interfaceC0234m);
            }
            if (!z) {
                h();
            }
            this.f5054e--;
        }
    }

    @Override // androidx.lifecycle.AbstractC0231j
    public final void b(InterfaceC0234m observer) {
        kotlin.jvm.internal.i.e(observer, "observer");
        d("removeObserver");
        this.f5051b.c(observer);
    }

    public final EnumC0230i c(InterfaceC0234m interfaceC0234m) {
        C0236o c0236o;
        HashMap hashMap = this.f5051b.f14277e;
        C1275c c1275c = hashMap.containsKey(interfaceC0234m) ? ((C1275c) hashMap.get(interfaceC0234m)).f14284d : null;
        EnumC0230i enumC0230i = (c1275c == null || (c0236o = (C0236o) c1275c.f14282b) == null) ? null : c0236o.f5048a;
        ArrayList arrayList = this.f5057h;
        EnumC0230i enumC0230i2 = arrayList.isEmpty() ? null : (EnumC0230i) arrayList.get(arrayList.size() - 1);
        EnumC0230i state1 = this.f5052c;
        kotlin.jvm.internal.i.e(state1, "state1");
        if (enumC0230i == null || enumC0230i.compareTo(state1) >= 0) {
            enumC0230i = state1;
        }
        return (enumC0230i2 == null || enumC0230i2.compareTo(enumC0230i) >= 0) ? enumC0230i : enumC0230i2;
    }

    public final void d(String str) {
        if (this.f5050a) {
            ((l.a) l.a.z().f14162c).getClass();
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                throw new IllegalStateException(AbstractC1514c.a("Method ", str, " must be called on the main thread").toString());
            }
        }
    }

    public final void e(EnumC0229h event) {
        kotlin.jvm.internal.i.e(event, "event");
        d("handleLifecycleEvent");
        f(event.a());
    }

    public final void f(EnumC0230i enumC0230i) {
        EnumC0230i enumC0230i2 = this.f5052c;
        if (enumC0230i2 == enumC0230i) {
            return;
        }
        EnumC0230i enumC0230i3 = EnumC0230i.f5042b;
        EnumC0230i enumC0230i4 = EnumC0230i.f5041a;
        if (enumC0230i2 == enumC0230i3 && enumC0230i == enumC0230i4) {
            throw new IllegalStateException(("no event down from " + this.f5052c + " in component " + this.f5053d.get()).toString());
        }
        this.f5052c = enumC0230i;
        if (this.f5055f || this.f5054e != 0) {
            this.f5056g = true;
            return;
        }
        this.f5055f = true;
        h();
        this.f5055f = false;
        if (this.f5052c == enumC0230i4) {
            this.f5051b = new C1273a();
        }
    }

    public final void g() {
        d("setCurrentState");
        f(EnumC0230i.f5043c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0031, code lost:
    
        r12.f5056g = false;
        r0 = r12.f5052c;
        r1 = r12.f5058i;
        r1.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003a, code lost:
    
        if (r0 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003c, code lost:
    
        r0 = B3.k.f239a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003e, code lost:
    
        r1.a(null, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h() {
        InterfaceC0235n interfaceC0235n = (InterfaceC0235n) this.f5053d.get();
        if (interfaceC0235n == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (true) {
            C1273a c1273a = this.f5051b;
            if (c1273a.f14291d != 0) {
                C1275c c1275c = c1273a.f14288a;
                kotlin.jvm.internal.i.b(c1275c);
                EnumC0230i enumC0230i = ((C0236o) c1275c.f14282b).f5048a;
                C1275c c1275c2 = this.f5051b.f14289b;
                kotlin.jvm.internal.i.b(c1275c2);
                EnumC0230i enumC0230i2 = ((C0236o) c1275c2.f14282b).f5048a;
                if (enumC0230i == enumC0230i2 && this.f5052c == enumC0230i2) {
                    break;
                }
                this.f5056g = false;
                EnumC0230i enumC0230i3 = this.f5052c;
                C1275c c1275c3 = this.f5051b.f14288a;
                kotlin.jvm.internal.i.b(c1275c3);
                if (enumC0230i3.compareTo(((C0236o) c1275c3.f14282b).f5048a) < 0) {
                    C1273a c1273a2 = this.f5051b;
                    C1274b c1274b = new C1274b(c1273a2.f14289b, c1273a2.f14288a, 1);
                    c1273a2.f14290c.put(c1274b, Boolean.FALSE);
                    while (c1274b.hasNext() && !this.f5056g) {
                        Map.Entry entry = (Map.Entry) c1274b.next();
                        kotlin.jvm.internal.i.d(entry, "next()");
                        InterfaceC0234m interfaceC0234m = (InterfaceC0234m) entry.getKey();
                        C0236o c0236o = (C0236o) entry.getValue();
                        while (c0236o.f5048a.compareTo(this.f5052c) > 0 && !this.f5056g && this.f5051b.f14277e.containsKey(interfaceC0234m)) {
                            C0227f c0227f = EnumC0229h.Companion;
                            EnumC0230i state = c0236o.f5048a;
                            c0227f.getClass();
                            kotlin.jvm.internal.i.e(state, "state");
                            int ordinal = state.ordinal();
                            EnumC0229h enumC0229h = ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? null : EnumC0229h.ON_PAUSE : EnumC0229h.ON_STOP : EnumC0229h.ON_DESTROY;
                            if (enumC0229h == null) {
                                throw new IllegalStateException("no event down from " + c0236o.f5048a);
                            }
                            this.f5057h.add(enumC0229h.a());
                            c0236o.a(interfaceC0235n, enumC0229h);
                            ArrayList arrayList = this.f5057h;
                            arrayList.remove(arrayList.size() - 1);
                        }
                    }
                }
                C1275c c1275c4 = this.f5051b.f14289b;
                if (!this.f5056g && c1275c4 != null && this.f5052c.compareTo(((C0236o) c1275c4.f14282b).f5048a) > 0) {
                    C1273a c1273a3 = this.f5051b;
                    c1273a3.getClass();
                    C1276d c1276d = new C1276d(c1273a3);
                    c1273a3.f14290c.put(c1276d, Boolean.FALSE);
                    while (c1276d.hasNext() && !this.f5056g) {
                        Map.Entry entry2 = (Map.Entry) c1276d.next();
                        InterfaceC0234m interfaceC0234m2 = (InterfaceC0234m) entry2.getKey();
                        C0236o c0236o2 = (C0236o) entry2.getValue();
                        while (c0236o2.f5048a.compareTo(this.f5052c) < 0 && !this.f5056g && this.f5051b.f14277e.containsKey(interfaceC0234m2)) {
                            this.f5057h.add(c0236o2.f5048a);
                            C0227f c0227f2 = EnumC0229h.Companion;
                            EnumC0230i state2 = c0236o2.f5048a;
                            c0227f2.getClass();
                            kotlin.jvm.internal.i.e(state2, "state");
                            int ordinal2 = state2.ordinal();
                            EnumC0229h enumC0229h2 = ordinal2 != 1 ? ordinal2 != 2 ? ordinal2 != 3 ? null : EnumC0229h.ON_RESUME : EnumC0229h.ON_START : EnumC0229h.ON_CREATE;
                            if (enumC0229h2 == null) {
                                throw new IllegalStateException("no event up from " + c0236o2.f5048a);
                            }
                            c0236o2.a(interfaceC0235n, enumC0229h2);
                            ArrayList arrayList2 = this.f5057h;
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
