package l;

import e2.InterfaceC0424c;
import m.InterfaceC0640z;
import m.g0;

/* loaded from: classes.dex */
public final class z extends f2.k implements InterfaceC0424c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f6557e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ G f6558f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ H f6559g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(G g3, H h3, int i3) {
        super(1);
        this.f6557e = i3;
        this.f6558f = g3;
        this.f6559g = h3;
    }

    @Override // e2.InterfaceC0424c
    public final Object n(Object obj) {
        InterfaceC0640z interfaceC0640z;
        InterfaceC0640z interfaceC0640z2;
        switch (this.f6557e) {
            case 0:
                g0 g0Var = (g0) obj;
                x xVar = x.f6547d;
                x xVar2 = x.f6548e;
                if (g0Var.a(xVar, xVar2)) {
                    I i3 = this.f6558f.f6453a.f6468a;
                    return (i3 == null || (interfaceC0640z2 = i3.f6458b) == null) ? AbstractC0574B.f6429b : interfaceC0640z2;
                }
                if (!g0Var.a(xVar2, x.f6549f)) {
                    return AbstractC0574B.f6429b;
                }
                I i4 = this.f6559g.f6456a.f6468a;
                return (i4 == null || (interfaceC0640z = i4.f6458b) == null) ? AbstractC0574B.f6429b : interfaceC0640z;
            case 1:
                int ordinal = ((x) obj).ordinal();
                float f3 = 1.0f;
                if (ordinal == 0) {
                    I i5 = this.f6558f.f6453a.f6468a;
                    if (i5 != null) {
                        f3 = i5.f6457a;
                    }
                } else if (ordinal != 1) {
                    if (ordinal != 2) {
                        throw new C1.c();
                    }
                    I i6 = this.f6559g.f6456a.f6468a;
                    if (i6 != null) {
                        f3 = i6.f6457a;
                    }
                }
                return Float.valueOf(f3);
            case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                g0 g0Var2 = (g0) obj;
                x xVar3 = x.f6547d;
                x xVar4 = x.f6548e;
                if (g0Var2.a(xVar3, xVar4)) {
                    return AbstractC0574B.f6429b;
                }
                if (!g0Var2.a(xVar4, x.f6549f)) {
                    return AbstractC0574B.f6429b;
                }
                P p3 = this.f6559g.f6456a;
                return AbstractC0574B.f6429b;
            default:
                int ordinal2 = ((x) obj).ordinal();
                if (ordinal2 != 0 && ordinal2 != 1) {
                    if (ordinal2 != 2) {
                        throw new C1.c();
                    }
                    P p4 = this.f6559g.f6456a;
                }
                return Float.valueOf(1.0f);
        }
    }
}
