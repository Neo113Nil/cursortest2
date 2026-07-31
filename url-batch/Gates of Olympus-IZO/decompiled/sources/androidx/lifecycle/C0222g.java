package androidx.lifecycle;

import h1.C0438i;
import java.util.HashMap;
import java.util.List;

/* renamed from: androidx.lifecycle.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0222g implements InterfaceC0234t {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4021d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final Object f4022e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f4023f;

    public C0222g(InterfaceC0220e interfaceC0220e, InterfaceC0234t interfaceC0234t) {
        Z1.i.f(interfaceC0220e, "defaultLifecycleObserver");
        this.f4022e = interfaceC0220e;
        this.f4023f = interfaceC0234t;
    }

    @Override // androidx.lifecycle.InterfaceC0234t
    public final void b(InterfaceC0236v interfaceC0236v, EnumC0229n enumC0229n) {
        switch (this.f4021d) {
            case 0:
                int i3 = AbstractC0221f.f4020a[enumC0229n.ordinal()];
                InterfaceC0220e interfaceC0220e = (InterfaceC0220e) this.f4022e;
                switch (i3) {
                    case 1:
                        interfaceC0220e.getClass();
                        break;
                    case C0438i.FLOAT_FIELD_NUMBER /* 2 */:
                        interfaceC0220e.h(interfaceC0236v);
                        break;
                    case C0438i.INTEGER_FIELD_NUMBER /* 3 */:
                        interfaceC0220e.a(interfaceC0236v);
                        break;
                    case C0438i.LONG_FIELD_NUMBER /* 4 */:
                        interfaceC0220e.getClass();
                        break;
                    case 5:
                        interfaceC0220e.e(interfaceC0236v);
                        break;
                    case 6:
                        interfaceC0220e.getClass();
                        break;
                    case C0438i.DOUBLE_FIELD_NUMBER /* 7 */:
                        throw new IllegalArgumentException("ON_ANY must not been send by anybody");
                }
                InterfaceC0234t interfaceC0234t = (InterfaceC0234t) this.f4023f;
                if (interfaceC0234t != null) {
                    interfaceC0234t.b(interfaceC0236v, enumC0229n);
                    return;
                }
                return;
            case 1:
                if (enumC0229n == EnumC0229n.ON_START) {
                    ((C0238x) this.f4022e).f(this);
                    ((u1.e) this.f4023f).d();
                    return;
                }
                return;
            default:
                HashMap hashMap = ((C0217b) this.f4023f).f4008a;
                List list = (List) hashMap.get(enumC0229n);
                InterfaceC0235u interfaceC0235u = (InterfaceC0235u) this.f4022e;
                C0217b.a(list, interfaceC0236v, enumC0229n, interfaceC0235u);
                C0217b.a((List) hashMap.get(EnumC0229n.ON_ANY), interfaceC0236v, enumC0229n, interfaceC0235u);
                return;
        }
    }

    public C0222g(InterfaceC0235u interfaceC0235u) {
        this.f4022e = interfaceC0235u;
        C0219d c0219d = C0219d.f4017c;
        Class<?> cls = interfaceC0235u.getClass();
        C0217b c0217b = (C0217b) c0219d.f4018a.get(cls);
        this.f4023f = c0217b == null ? c0219d.a(cls, null) : c0217b;
    }

    public C0222g(C0238x c0238x, u1.e eVar) {
        this.f4022e = c0238x;
        this.f4023f = eVar;
    }
}
