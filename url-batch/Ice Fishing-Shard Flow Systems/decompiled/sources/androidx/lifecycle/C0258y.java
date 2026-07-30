package androidx.lifecycle;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import k0.C0590a;
import kotlin.jvm.internal.Intrinsics;
import o.C0793a;
import p.C0811a;
import p.C0812b;
import p.C0813c;
import p.C0814d;

/* renamed from: androidx.lifecycle.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0258y extends AbstractC0250p {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3920b;

    /* renamed from: c, reason: collision with root package name */
    public C0811a f3921c;

    /* renamed from: d, reason: collision with root package name */
    public EnumC0249o f3922d;

    /* renamed from: e, reason: collision with root package name */
    public final WeakReference f3923e;

    /* renamed from: f, reason: collision with root package name */
    public int f3924f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3925g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f3926h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f3927i;
    public final q6.v j;

    public C0258y(InterfaceC0256w provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.f3912a = new AtomicReference();
        this.f3920b = true;
        this.f3921c = new C0811a();
        EnumC0249o enumC0249o = EnumC0249o.f3907e;
        this.f3922d = enumC0249o;
        this.f3927i = new ArrayList();
        this.f3923e = new WeakReference(provider);
        this.j = new q6.v(enumC0249o);
    }

    @Override // androidx.lifecycle.AbstractC0250p
    public final void a(InterfaceC0255v object) {
        InterfaceC0254u c0241g;
        Object obj;
        InterfaceC0256w interfaceC0256w;
        Intrinsics.checkNotNullParameter(object, "observer");
        d("addObserver");
        EnumC0249o enumC0249o = this.f3922d;
        EnumC0249o initialState = EnumC0249o.f3906d;
        if (enumC0249o != initialState) {
            initialState = EnumC0249o.f3907e;
        }
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        C0257x c0257x = new C0257x();
        HashMap hashMap = A.f3831a;
        Intrinsics.checkNotNullParameter(object, "object");
        boolean z7 = object instanceof InterfaceC0254u;
        boolean z8 = object instanceof U.k;
        if (z7 && z8) {
            c0241g = new C0241g((U.k) object, (InterfaceC0254u) object);
        } else if (z8) {
            c0241g = new C0241g((U.k) object, (InterfaceC0254u) null);
        } else if (z7) {
            c0241g = (InterfaceC0254u) object;
        } else {
            Class<?> cls = object.getClass();
            if (A.c(cls) == 2) {
                Object obj2 = A.f3832b.get(cls);
                Intrinsics.b(obj2);
                List list = (List) obj2;
                if (list.size() == 1) {
                    A.a((Constructor) list.get(0), object);
                    Intrinsics.checkNotNullParameter(null, "generatedAdapter");
                    c0241g = new V();
                } else {
                    int size = list.size();
                    InterfaceC0243i[] interfaceC0243iArr = new InterfaceC0243i[size];
                    for (int i2 = 0; i2 < size; i2++) {
                        A.a((Constructor) list.get(i2), object);
                        interfaceC0243iArr[i2] = null;
                    }
                    c0241g = new C0590a(interfaceC0243iArr);
                }
            } else {
                c0241g = new C0241g(object);
            }
        }
        c0257x.f3919b = c0241g;
        c0257x.f3918a = initialState;
        C0811a c0811a = this.f3921c;
        C0813c a7 = c0811a.a(object);
        if (a7 != null) {
            obj = a7.f7141e;
        } else {
            HashMap hashMap2 = c0811a.f7136m;
            C0813c c0813c = new C0813c(object, c0257x);
            c0811a.f7150l++;
            C0813c c0813c2 = c0811a.f7148e;
            if (c0813c2 == null) {
                c0811a.f7147d = c0813c;
                c0811a.f7148e = c0813c;
            } else {
                c0813c2.f7142i = c0813c;
                c0813c.f7143l = c0813c2;
                c0811a.f7148e = c0813c;
            }
            hashMap2.put(object, c0813c);
            obj = null;
        }
        if (((C0257x) obj) == null && (interfaceC0256w = (InterfaceC0256w) this.f3923e.get()) != null) {
            boolean z9 = this.f3924f != 0 || this.f3925g;
            EnumC0249o c7 = c(object);
            this.f3924f++;
            while (c0257x.f3918a.compareTo(c7) < 0 && this.f3921c.f7136m.containsKey(object)) {
                EnumC0249o enumC0249o2 = c0257x.f3918a;
                ArrayList arrayList = this.f3927i;
                arrayList.add(enumC0249o2);
                C0246l c0246l = EnumC0248n.Companion;
                EnumC0249o state = c0257x.f3918a;
                c0246l.getClass();
                Intrinsics.checkNotNullParameter(state, "state");
                int ordinal = state.ordinal();
                EnumC0248n enumC0248n = ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? null : EnumC0248n.ON_RESUME : EnumC0248n.ON_START : EnumC0248n.ON_CREATE;
                if (enumC0248n == null) {
                    throw new IllegalStateException("no event up from " + c0257x.f3918a);
                }
                c0257x.a(interfaceC0256w, enumC0248n);
                arrayList.remove(arrayList.size() - 1);
                c7 = c(object);
            }
            if (!z9) {
                h();
            }
            this.f3924f--;
        }
    }

    @Override // androidx.lifecycle.AbstractC0250p
    public final void b(InterfaceC0255v observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        d("removeObserver");
        this.f3921c.b(observer);
    }

    public final EnumC0249o c(InterfaceC0255v interfaceC0255v) {
        C0257x c0257x;
        HashMap hashMap = this.f3921c.f7136m;
        C0813c c0813c = hashMap.containsKey(interfaceC0255v) ? ((C0813c) hashMap.get(interfaceC0255v)).f7143l : null;
        EnumC0249o state1 = (c0813c == null || (c0257x = (C0257x) c0813c.f7141e) == null) ? null : c0257x.f3918a;
        ArrayList arrayList = this.f3927i;
        EnumC0249o enumC0249o = arrayList.isEmpty() ? null : (EnumC0249o) arrayList.get(arrayList.size() - 1);
        EnumC0249o state12 = this.f3922d;
        Intrinsics.checkNotNullParameter(state12, "state1");
        if (state1 == null || state1.compareTo(state12) >= 0) {
            state1 = state12;
        }
        Intrinsics.checkNotNullParameter(state1, "state1");
        return (enumC0249o == null || enumC0249o.compareTo(state1) >= 0) ? state1 : enumC0249o;
    }

    public final void d(String str) {
        if (this.f3920b) {
            C0793a.T().f7106b.getClass();
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                throw new IllegalStateException(r4.f.d("Method ", str, " must be called on the main thread").toString());
            }
        }
    }

    public final void e(EnumC0248n event) {
        Intrinsics.checkNotNullParameter(event, "event");
        d("handleLifecycleEvent");
        f(event.a());
    }

    public final void f(EnumC0249o enumC0249o) {
        EnumC0249o enumC0249o2 = this.f3922d;
        if (enumC0249o2 == enumC0249o) {
            return;
        }
        EnumC0249o enumC0249o3 = EnumC0249o.f3907e;
        EnumC0249o enumC0249o4 = EnumC0249o.f3906d;
        if (enumC0249o2 == enumC0249o3 && enumC0249o == enumC0249o4) {
            throw new IllegalStateException(("no event down from " + this.f3922d + " in component " + this.f3923e.get()).toString());
        }
        this.f3922d = enumC0249o;
        if (this.f3925g || this.f3924f != 0) {
            this.f3926h = true;
            return;
        }
        this.f3925g = true;
        h();
        this.f3925g = false;
        if (this.f3922d == enumC0249o4) {
            this.f3921c = new C0811a();
        }
    }

    public final void g() {
        EnumC0249o state = EnumC0249o.f3908i;
        Intrinsics.checkNotNullParameter(state, "state");
        d("setCurrentState");
        f(state);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        r12.f3926h = false;
        r12.j.b(r12.f3922d);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h() {
        InterfaceC0256w interfaceC0256w = (InterfaceC0256w) this.f3923e.get();
        if (interfaceC0256w == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (true) {
            C0811a c0811a = this.f3921c;
            if (c0811a.f7150l != 0) {
                C0813c c0813c = c0811a.f7147d;
                Intrinsics.b(c0813c);
                EnumC0249o enumC0249o = ((C0257x) c0813c.f7141e).f3918a;
                C0813c c0813c2 = this.f3921c.f7148e;
                Intrinsics.b(c0813c2);
                EnumC0249o enumC0249o2 = ((C0257x) c0813c2.f7141e).f3918a;
                if (enumC0249o == enumC0249o2 && this.f3922d == enumC0249o2) {
                    break;
                }
                this.f3926h = false;
                EnumC0249o enumC0249o3 = this.f3922d;
                C0813c c0813c3 = this.f3921c.f7147d;
                Intrinsics.b(c0813c3);
                if (enumC0249o3.compareTo(((C0257x) c0813c3.f7141e).f3918a) < 0) {
                    C0811a c0811a2 = this.f3921c;
                    C0812b c0812b = new C0812b(c0811a2.f7148e, c0811a2.f7147d, 1);
                    c0811a2.f7149i.put(c0812b, Boolean.FALSE);
                    Intrinsics.checkNotNullExpressionValue(c0812b, "observerMap.descendingIterator()");
                    while (c0812b.hasNext() && !this.f3926h) {
                        Map.Entry entry = (Map.Entry) c0812b.next();
                        Intrinsics.checkNotNullExpressionValue(entry, "next()");
                        InterfaceC0255v interfaceC0255v = (InterfaceC0255v) entry.getKey();
                        C0257x c0257x = (C0257x) entry.getValue();
                        while (c0257x.f3918a.compareTo(this.f3922d) > 0 && !this.f3926h && this.f3921c.f7136m.containsKey(interfaceC0255v)) {
                            C0246l c0246l = EnumC0248n.Companion;
                            EnumC0249o state = c0257x.f3918a;
                            c0246l.getClass();
                            Intrinsics.checkNotNullParameter(state, "state");
                            int ordinal = state.ordinal();
                            EnumC0248n enumC0248n = ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? null : EnumC0248n.ON_PAUSE : EnumC0248n.ON_STOP : EnumC0248n.ON_DESTROY;
                            if (enumC0248n == null) {
                                throw new IllegalStateException("no event down from " + c0257x.f3918a);
                            }
                            this.f3927i.add(enumC0248n.a());
                            c0257x.a(interfaceC0256w, enumC0248n);
                            ArrayList arrayList = this.f3927i;
                            arrayList.remove(arrayList.size() - 1);
                        }
                    }
                }
                C0813c c0813c4 = this.f3921c.f7148e;
                if (!this.f3926h && c0813c4 != null && this.f3922d.compareTo(((C0257x) c0813c4.f7141e).f3918a) > 0) {
                    C0811a c0811a3 = this.f3921c;
                    c0811a3.getClass();
                    C0814d c0814d = new C0814d(c0811a3);
                    c0811a3.f7149i.put(c0814d, Boolean.FALSE);
                    Intrinsics.checkNotNullExpressionValue(c0814d, "observerMap.iteratorWithAdditions()");
                    while (c0814d.hasNext() && !this.f3926h) {
                        Map.Entry entry2 = (Map.Entry) c0814d.next();
                        InterfaceC0255v interfaceC0255v2 = (InterfaceC0255v) entry2.getKey();
                        C0257x c0257x2 = (C0257x) entry2.getValue();
                        while (c0257x2.f3918a.compareTo(this.f3922d) < 0 && !this.f3926h && this.f3921c.f7136m.containsKey(interfaceC0255v2)) {
                            this.f3927i.add(c0257x2.f3918a);
                            C0246l c0246l2 = EnumC0248n.Companion;
                            EnumC0249o state2 = c0257x2.f3918a;
                            c0246l2.getClass();
                            Intrinsics.checkNotNullParameter(state2, "state");
                            int ordinal2 = state2.ordinal();
                            EnumC0248n enumC0248n2 = ordinal2 != 1 ? ordinal2 != 2 ? ordinal2 != 3 ? null : EnumC0248n.ON_RESUME : EnumC0248n.ON_START : EnumC0248n.ON_CREATE;
                            if (enumC0248n2 == null) {
                                throw new IllegalStateException("no event up from " + c0257x2.f3918a);
                            }
                            c0257x2.a(interfaceC0256w, enumC0248n2);
                            ArrayList arrayList2 = this.f3927i;
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
