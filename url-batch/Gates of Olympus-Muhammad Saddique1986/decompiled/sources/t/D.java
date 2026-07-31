package t;

import e2.InterfaceC0424c;
import q2.AbstractC0837y;
import s.C0939h;

/* loaded from: classes.dex */
public final class D extends f2.k implements InterfaceC0424c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f8426e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ F f8427f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ D(F f3, int i3) {
        super(1);
        this.f8426e = i3;
        this.f8427f = f3;
    }

    @Override // e2.InterfaceC0424c
    public final Object n(Object obj) {
        switch (this.f8426e) {
            case 0:
                C0939h c0939h = (C0939h) this.f8427f.f8431q.b();
                int c2 = c0939h.c();
                int i3 = 0;
                while (true) {
                    if (i3 >= c2) {
                        i3 = -1;
                    } else if (!c0939h.d(i3).equals(obj)) {
                        i3++;
                    }
                }
                return Integer.valueOf(i3);
            default:
                int intValue = ((Number) obj).intValue();
                F f3 = this.f8427f;
                C0939h c0939h2 = (C0939h) f3.f8431q.b();
                if (intValue >= 0 && intValue < c0939h2.c()) {
                    AbstractC0837y.r(f3.m0(), null, null, new E(f3, intValue, null), 3);
                    return Boolean.TRUE;
                }
                StringBuilder k3 = A.k.k(intValue, "Can't scroll to index ", ", it is out of bounds [0, ");
                k3.append(c0939h2.c());
                k3.append(')');
                throw new IllegalArgumentException(k3.toString().toString());
        }
    }
}
