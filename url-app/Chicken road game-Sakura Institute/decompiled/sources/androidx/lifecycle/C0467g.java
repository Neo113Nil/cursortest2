package androidx.lifecycle;

import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import v1.C1248e;

/* renamed from: androidx.lifecycle.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0467g implements InterfaceC0479t {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5476d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final Object f5477e;

    /* renamed from: i, reason: collision with root package name */
    public final Object f5478i;

    public C0467g(InterfaceC0465e defaultLifecycleObserver, InterfaceC0479t interfaceC0479t) {
        Intrinsics.checkNotNullParameter(defaultLifecycleObserver, "defaultLifecycleObserver");
        this.f5477e = defaultLifecycleObserver;
        this.f5478i = interfaceC0479t;
    }

    @Override // androidx.lifecycle.InterfaceC0479t
    public final void b(InterfaceC0481v owner, EnumC0474n event) {
        switch (this.f5476d) {
            case 0:
                Intrinsics.checkNotNullParameter(owner, "source");
                Intrinsics.checkNotNullParameter(event, "event");
                int i2 = AbstractC0466f.f5475a[event.ordinal()];
                InterfaceC0465e interfaceC0465e = (InterfaceC0465e) this.f5477e;
                switch (i2) {
                    case 1:
                        interfaceC0465e.getClass();
                        Intrinsics.checkNotNullParameter(owner, "owner");
                        break;
                    case 2:
                        interfaceC0465e.f(owner);
                        break;
                    case 3:
                        interfaceC0465e.a(owner);
                        break;
                    case 4:
                        interfaceC0465e.getClass();
                        Intrinsics.checkNotNullParameter(owner, "owner");
                        break;
                    case 5:
                        interfaceC0465e.d(owner);
                        break;
                    case 6:
                        interfaceC0465e.getClass();
                        Intrinsics.checkNotNullParameter(owner, "owner");
                        break;
                    case i1.i.DOUBLE_FIELD_NUMBER /* 7 */:
                        throw new IllegalArgumentException("ON_ANY must not been send by anybody");
                }
                InterfaceC0479t interfaceC0479t = (InterfaceC0479t) this.f5478i;
                if (interfaceC0479t != null) {
                    interfaceC0479t.b(owner, event);
                    return;
                }
                return;
            case 1:
                Intrinsics.checkNotNullParameter(owner, "source");
                Intrinsics.checkNotNullParameter(event, "event");
                if (event == EnumC0474n.ON_START) {
                    ((C0483x) this.f5477e).f(this);
                    ((C1248e) this.f5478i).d();
                    return;
                }
                return;
            default:
                HashMap hashMap = ((C0462b) this.f5478i).f5468a;
                List list = (List) hashMap.get(event);
                InterfaceC0480u interfaceC0480u = (InterfaceC0480u) this.f5477e;
                C0462b.a(list, owner, event, interfaceC0480u);
                C0462b.a((List) hashMap.get(EnumC0474n.ON_ANY), owner, event, interfaceC0480u);
                return;
        }
    }

    public C0467g(InterfaceC0480u interfaceC0480u) {
        this.f5477e = interfaceC0480u;
        C0464d c0464d = C0464d.f5472c;
        Class<?> cls = interfaceC0480u.getClass();
        C0462b c0462b = (C0462b) c0464d.f5473a.get(cls);
        this.f5478i = c0462b == null ? c0464d.a(cls, null) : c0462b;
    }

    public C0467g(C0483x c0483x, C1248e c1248e) {
        this.f5477e = c0483x;
        this.f5478i = c1248e;
    }
}
