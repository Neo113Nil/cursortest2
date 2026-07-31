package l;

import e2.InterfaceC0426e;
import m.AbstractC0620e;
import m.z0;

/* renamed from: l.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0579e extends f2.k implements InterfaceC0426e {

    /* renamed from: f, reason: collision with root package name */
    public static final C0579e f6486f = new C0579e(2, 0);

    /* renamed from: g, reason: collision with root package name */
    public static final C0579e f6487g = new C0579e(2, 1);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f6488e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0579e(int i3, int i4) {
        super(i3);
        this.f6488e = i4;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        switch (this.f6488e) {
            case 0:
                long j3 = ((O0.j) obj).f3740a;
                long j4 = ((O0.j) obj2).f3740a;
                Object obj3 = z0.f6914a;
                return AbstractC0620e.i(400.0f, new O0.j(O2.d.d(1, 1)), 1);
            default:
                x xVar = (x) obj2;
                return Boolean.valueOf(((x) obj) == xVar && xVar == x.f6549f);
        }
    }
}
