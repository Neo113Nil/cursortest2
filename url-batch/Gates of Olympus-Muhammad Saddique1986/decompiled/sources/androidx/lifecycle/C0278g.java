package androidx.lifecycle;

import java.util.HashMap;
import java.util.List;

/* renamed from: androidx.lifecycle.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0278g implements InterfaceC0290t {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5222d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final Object f5223e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f5224f;

    public C0278g(InterfaceC0276e interfaceC0276e, InterfaceC0290t interfaceC0290t) {
        f2.j.f(interfaceC0276e, "defaultLifecycleObserver");
        this.f5223e = interfaceC0276e;
        this.f5224f = interfaceC0290t;
    }

    @Override // androidx.lifecycle.InterfaceC0290t
    public final void b(InterfaceC0292v interfaceC0292v, EnumC0285n enumC0285n) {
        switch (this.f5222d) {
            case 0:
                int i3 = AbstractC0277f.f5221a[enumC0285n.ordinal()];
                InterfaceC0276e interfaceC0276e = (InterfaceC0276e) this.f5223e;
                switch (i3) {
                    case 1:
                        interfaceC0276e.getClass();
                        break;
                    case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                        interfaceC0276e.e(interfaceC0292v);
                        break;
                    case k1.i.INTEGER_FIELD_NUMBER /* 3 */:
                        interfaceC0276e.a(interfaceC0292v);
                        break;
                    case k1.i.LONG_FIELD_NUMBER /* 4 */:
                        interfaceC0276e.getClass();
                        break;
                    case 5:
                        interfaceC0276e.d(interfaceC0292v);
                        break;
                    case 6:
                        interfaceC0276e.getClass();
                        break;
                    case k1.i.DOUBLE_FIELD_NUMBER /* 7 */:
                        throw new IllegalArgumentException("ON_ANY must not been send by anybody");
                }
                InterfaceC0290t interfaceC0290t = (InterfaceC0290t) this.f5224f;
                if (interfaceC0290t != null) {
                    interfaceC0290t.b(interfaceC0292v, enumC0285n);
                    return;
                }
                return;
            case 1:
                if (enumC0285n == EnumC0285n.ON_START) {
                    ((C0294x) this.f5223e).f(this);
                    ((y1.e) this.f5224f).d();
                    return;
                }
                return;
            default:
                HashMap hashMap = ((C0273b) this.f5224f).f5209a;
                List list = (List) hashMap.get(enumC0285n);
                InterfaceC0291u interfaceC0291u = (InterfaceC0291u) this.f5223e;
                C0273b.a(list, interfaceC0292v, enumC0285n, interfaceC0291u);
                C0273b.a((List) hashMap.get(EnumC0285n.ON_ANY), interfaceC0292v, enumC0285n, interfaceC0291u);
                return;
        }
    }

    public C0278g(InterfaceC0291u interfaceC0291u) {
        this.f5223e = interfaceC0291u;
        C0275d c0275d = C0275d.f5218c;
        Class<?> cls = interfaceC0291u.getClass();
        C0273b c0273b = (C0273b) c0275d.f5219a.get(cls);
        this.f5224f = c0273b == null ? c0275d.a(cls, null) : c0273b;
    }

    public C0278g(C0294x c0294x, y1.e eVar) {
        this.f5223e = c0294x;
        this.f5224f = eVar;
    }
}
