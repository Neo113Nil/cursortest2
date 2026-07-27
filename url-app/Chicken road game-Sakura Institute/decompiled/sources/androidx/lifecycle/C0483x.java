package androidx.lifecycle;

import A.AbstractC0017m;
import android.os.Looper;
import g.C0633a;
import h.C0640a;
import h.C0641b;
import h.C0642c;
import h.C0643d;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;
import v1.C1245b;

/* renamed from: androidx.lifecycle.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0483x {

    /* renamed from: a, reason: collision with root package name */
    public AtomicReference f5493a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f5494b;

    /* renamed from: c, reason: collision with root package name */
    public C0640a f5495c;

    /* renamed from: d, reason: collision with root package name */
    public EnumC0475o f5496d;

    /* renamed from: e, reason: collision with root package name */
    public final WeakReference f5497e;

    /* renamed from: f, reason: collision with root package name */
    public int f5498f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f5499g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f5500h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f5501i;

    /* renamed from: j, reason: collision with root package name */
    public final Z2.S f5502j;

    public C0483x(InterfaceC0481v provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.f5493a = new AtomicReference(null);
        this.f5494b = true;
        this.f5495c = new C0640a();
        EnumC0475o enumC0475o = EnumC0475o.f5481e;
        this.f5496d = enumC0475o;
        this.f5501i = new ArrayList();
        this.f5497e = new WeakReference(provider);
        this.f5502j = Z2.H.c(enumC0475o);
    }

    public final void a(InterfaceC0480u object) {
        InterfaceC0479t c0467g;
        InterfaceC0481v interfaceC0481v;
        ArrayList arrayList = this.f5501i;
        Object obj = null;
        Intrinsics.checkNotNullParameter(object, "observer");
        c("addObserver");
        EnumC0475o enumC0475o = this.f5496d;
        EnumC0475o initialState = EnumC0475o.f5480d;
        if (enumC0475o != initialState) {
            initialState = EnumC0475o.f5481e;
        }
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        C0482w c0482w = new C0482w();
        Intrinsics.c(object);
        HashMap hashMap = AbstractC0484y.f5503a;
        Intrinsics.checkNotNullParameter(object, "object");
        boolean z4 = object instanceof InterfaceC0479t;
        boolean z5 = object instanceof InterfaceC0465e;
        if (z4 && z5) {
            c0467g = new C0467g((InterfaceC0465e) object, (InterfaceC0479t) object);
        } else if (z5) {
            c0467g = new C0467g((InterfaceC0465e) object, (InterfaceC0479t) null);
        } else if (z4) {
            c0467g = (InterfaceC0479t) object;
        } else {
            Class<?> cls = object.getClass();
            if (AbstractC0484y.c(cls) == 2) {
                Object obj2 = AbstractC0484y.f5504b.get(cls);
                Intrinsics.c(obj2);
                List list = (List) obj2;
                if (list.size() == 1) {
                    AbstractC0484y.a((Constructor) list.get(0), object);
                    Intrinsics.checkNotNullParameter(null, "generatedAdapter");
                    c0467g = new S();
                } else {
                    int size = list.size();
                    InterfaceC0469i[] interfaceC0469iArr = new InterfaceC0469i[size];
                    for (int i2 = 0; i2 < size; i2++) {
                        AbstractC0484y.a((Constructor) list.get(i2), object);
                        interfaceC0469iArr[i2] = null;
                    }
                    c0467g = new C1245b(interfaceC0469iArr);
                }
            } else {
                c0467g = new C0467g(object);
            }
        }
        c0482w.f5492b = c0467g;
        c0482w.f5491a = initialState;
        C0640a c0640a = this.f5495c;
        C0642c e4 = c0640a.e(object);
        if (e4 != null) {
            obj = e4.f6816e;
        } else {
            HashMap hashMap2 = c0640a.f6811k;
            C0642c c0642c = new C0642c(object, c0482w);
            c0640a.f6825j++;
            C0642c c0642c2 = c0640a.f6823e;
            if (c0642c2 == null) {
                c0640a.f6822d = c0642c;
                c0640a.f6823e = c0642c;
            } else {
                c0642c2.f6817i = c0642c;
                c0642c.f6818j = c0642c2;
                c0640a.f6823e = c0642c;
            }
            hashMap2.put(object, c0642c);
        }
        if (((C0482w) obj) == null && (interfaceC0481v = (InterfaceC0481v) this.f5497e.get()) != null) {
            boolean z6 = this.f5498f != 0 || this.f5499g;
            EnumC0475o b4 = b(object);
            this.f5498f++;
            while (c0482w.f5491a.compareTo(b4) < 0 && this.f5495c.f6811k.containsKey(object)) {
                arrayList.add(c0482w.f5491a);
                C0472l c0472l = EnumC0474n.Companion;
                EnumC0475o enumC0475o2 = c0482w.f5491a;
                c0472l.getClass();
                EnumC0474n a4 = C0472l.a(enumC0475o2);
                if (a4 == null) {
                    throw new IllegalStateException("no event up from " + c0482w.f5491a);
                }
                c0482w.a(interfaceC0481v, a4);
                arrayList.remove(arrayList.size() - 1);
                b4 = b(object);
            }
            if (!z6) {
                h();
            }
            this.f5498f--;
        }
    }

    public final EnumC0475o b(InterfaceC0480u interfaceC0480u) {
        C0482w c0482w;
        HashMap hashMap = this.f5495c.f6811k;
        C0642c c0642c = hashMap.containsKey(interfaceC0480u) ? ((C0642c) hashMap.get(interfaceC0480u)).f6818j : null;
        EnumC0475o state1 = (c0642c == null || (c0482w = (C0482w) c0642c.f6816e) == null) ? null : c0482w.f5491a;
        ArrayList arrayList = this.f5501i;
        EnumC0475o enumC0475o = arrayList.isEmpty() ? null : (EnumC0475o) arrayList.get(arrayList.size() - 1);
        EnumC0475o state12 = this.f5496d;
        Intrinsics.checkNotNullParameter(state12, "state1");
        if (state1 == null || state1.compareTo(state12) >= 0) {
            state1 = state12;
        }
        Intrinsics.checkNotNullParameter(state1, "state1");
        return (enumC0475o == null || enumC0475o.compareTo(state1) >= 0) ? state1 : enumC0475o;
    }

    public final void c(String str) {
        if (this.f5494b) {
            C0633a.u0().f6664j.getClass();
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                throw new IllegalStateException(AbstractC0017m.j("Method ", str, " must be called on the main thread").toString());
            }
        }
    }

    public final void d(EnumC0474n event) {
        Intrinsics.checkNotNullParameter(event, "event");
        c("handleLifecycleEvent");
        e(event.a());
    }

    public final void e(EnumC0475o enumC0475o) {
        EnumC0475o enumC0475o2 = this.f5496d;
        if (enumC0475o2 == enumC0475o) {
            return;
        }
        EnumC0475o enumC0475o3 = EnumC0475o.f5481e;
        EnumC0475o enumC0475o4 = EnumC0475o.f5480d;
        if (enumC0475o2 == enumC0475o3 && enumC0475o == enumC0475o4) {
            throw new IllegalStateException(("State must be at least CREATED to move to " + enumC0475o + ", but was " + this.f5496d + " in component " + this.f5497e.get()).toString());
        }
        this.f5496d = enumC0475o;
        if (this.f5499g || this.f5498f != 0) {
            this.f5500h = true;
            return;
        }
        this.f5499g = true;
        h();
        this.f5499g = false;
        if (this.f5496d == enumC0475o4) {
            this.f5495c = new C0640a();
        }
    }

    public final void f(InterfaceC0480u observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        c("removeObserver");
        this.f5495c.h(observer);
    }

    public final void g(EnumC0475o state) {
        Intrinsics.checkNotNullParameter(state, "state");
        c("setCurrentState");
        e(state);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        r7.f5500h = false;
        r7.f5502j.k(r7.f5496d);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h() {
        InterfaceC0481v interfaceC0481v = (InterfaceC0481v) this.f5497e.get();
        if (interfaceC0481v == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (true) {
            C0640a c0640a = this.f5495c;
            if (c0640a.f6825j != 0) {
                C0642c c0642c = c0640a.f6822d;
                Intrinsics.c(c0642c);
                EnumC0475o enumC0475o = ((C0482w) c0642c.f6816e).f5491a;
                C0642c c0642c2 = this.f5495c.f6823e;
                Intrinsics.c(c0642c2);
                EnumC0475o enumC0475o2 = ((C0482w) c0642c2.f6816e).f5491a;
                if (enumC0475o == enumC0475o2 && this.f5496d == enumC0475o2) {
                    break;
                }
                this.f5500h = false;
                EnumC0475o enumC0475o3 = this.f5496d;
                C0642c c0642c3 = this.f5495c.f6822d;
                Intrinsics.c(c0642c3);
                if (enumC0475o3.compareTo(((C0482w) c0642c3.f6816e).f5491a) < 0) {
                    C0640a c0640a2 = this.f5495c;
                    C0641b c0641b = new C0641b(c0640a2.f6823e, c0640a2.f6822d, 1);
                    c0640a2.f6824i.put(c0641b, Boolean.FALSE);
                    Intrinsics.checkNotNullExpressionValue(c0641b, "observerMap.descendingIterator()");
                    while (c0641b.hasNext() && !this.f5500h) {
                        Map.Entry entry = (Map.Entry) c0641b.next();
                        Intrinsics.checkNotNullExpressionValue(entry, "next()");
                        InterfaceC0480u interfaceC0480u = (InterfaceC0480u) entry.getKey();
                        C0482w c0482w = (C0482w) entry.getValue();
                        while (c0482w.f5491a.compareTo(this.f5496d) > 0 && !this.f5500h && this.f5495c.f6811k.containsKey(interfaceC0480u)) {
                            C0472l c0472l = EnumC0474n.Companion;
                            EnumC0475o state = c0482w.f5491a;
                            c0472l.getClass();
                            Intrinsics.checkNotNullParameter(state, "state");
                            int ordinal = state.ordinal();
                            EnumC0474n enumC0474n = ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? null : EnumC0474n.ON_PAUSE : EnumC0474n.ON_STOP : EnumC0474n.ON_DESTROY;
                            if (enumC0474n == null) {
                                throw new IllegalStateException("no event down from " + c0482w.f5491a);
                            }
                            this.f5501i.add(enumC0474n.a());
                            c0482w.a(interfaceC0481v, enumC0474n);
                            this.f5501i.remove(r4.size() - 1);
                        }
                    }
                }
                C0642c c0642c4 = this.f5495c.f6823e;
                if (!this.f5500h && c0642c4 != null && this.f5496d.compareTo(((C0482w) c0642c4.f6816e).f5491a) > 0) {
                    C0640a c0640a3 = this.f5495c;
                    c0640a3.getClass();
                    C0643d c0643d = new C0643d(c0640a3);
                    c0640a3.f6824i.put(c0643d, Boolean.FALSE);
                    Intrinsics.checkNotNullExpressionValue(c0643d, "observerMap.iteratorWithAdditions()");
                    while (c0643d.hasNext() && !this.f5500h) {
                        Map.Entry entry2 = (Map.Entry) c0643d.next();
                        InterfaceC0480u interfaceC0480u2 = (InterfaceC0480u) entry2.getKey();
                        C0482w c0482w2 = (C0482w) entry2.getValue();
                        while (c0482w2.f5491a.compareTo(this.f5496d) < 0 && !this.f5500h && this.f5495c.f6811k.containsKey(interfaceC0480u2)) {
                            this.f5501i.add(c0482w2.f5491a);
                            C0472l c0472l2 = EnumC0474n.Companion;
                            EnumC0475o enumC0475o4 = c0482w2.f5491a;
                            c0472l2.getClass();
                            EnumC0474n a4 = C0472l.a(enumC0475o4);
                            if (a4 == null) {
                                throw new IllegalStateException("no event up from " + c0482w2.f5491a);
                            }
                            c0482w2.a(interfaceC0481v, a4);
                            this.f5501i.remove(r4.size() - 1);
                        }
                    }
                }
            } else {
                break;
            }
        }
    }
}
