package u;

import H2.AbstractC0080b;
import k2.AbstractC0552y;

/* renamed from: u.K, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0929K extends Z1.j implements Y1.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f8015e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0931M f8016f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0929K(C0931M c0931m, int i3) {
        super(1);
        this.f8015e = i3;
        this.f8016f = c0931m;
    }

    @Override // Y1.c
    public final Object j(Object obj) {
        switch (this.f8015e) {
            case 0:
                InterfaceC0953v interfaceC0953v = (InterfaceC0953v) this.f8016f.f8020q.b();
                int a3 = interfaceC0953v.a();
                int i3 = 0;
                while (true) {
                    if (i3 >= a3) {
                        i3 = -1;
                    } else if (!interfaceC0953v.c(i3).equals(obj)) {
                        i3++;
                    }
                }
                return Integer.valueOf(i3);
            default:
                int intValue = ((Number) obj).intValue();
                C0931M c0931m = this.f8016f;
                InterfaceC0953v interfaceC0953v2 = (InterfaceC0953v) c0931m.f8020q.b();
                if (intValue >= 0 && intValue < interfaceC0953v2.a()) {
                    AbstractC0552y.q(c0931m.j0(), null, null, new C0930L(c0931m, intValue, null), 3);
                    return Boolean.TRUE;
                }
                StringBuilder l3 = AbstractC0080b.l("Can't scroll to index ", intValue, ", it is out of bounds [0, ");
                l3.append(interfaceC0953v2.a());
                l3.append(')');
                throw new IllegalArgumentException(l3.toString().toString());
        }
    }
}
