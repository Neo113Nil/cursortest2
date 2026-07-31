package s2;

import R1.y;
import e2.InterfaceC0424c;
import e2.InterfaceC0427f;

/* renamed from: s2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0970d extends f2.h implements InterfaceC0427f {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f8369l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0970d(int i3, Object obj, Class cls, String str, String str2, int i4, int i5) {
        super(i3, i4, cls, obj, str, str2);
        this.f8369l = i5;
    }

    @Override // e2.InterfaceC0427f
    public final Object g(Object obj, Object obj2, Object obj3) {
        switch (this.f8369l) {
            case 0:
                InterfaceC0424c interfaceC0424c = ((g) this.f5813e).f8386e;
                f2.j.c(interfaceC0424c);
                v2.a.a(interfaceC0424c, obj2, (V1.i) obj3);
                break;
            default:
                Object obj4 = ((n) obj2).f8412a;
                InterfaceC0424c interfaceC0424c2 = ((g) this.f5813e).f8386e;
                f2.j.c(interfaceC0424c2);
                Object a3 = n.a(obj4);
                f2.j.c(a3);
                v2.a.a(interfaceC0424c2, a3, (V1.i) obj3);
                break;
        }
        return y.f4171a;
    }
}
