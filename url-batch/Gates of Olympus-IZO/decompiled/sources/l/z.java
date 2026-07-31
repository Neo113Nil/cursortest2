package l;

import h1.C0438i;
import m.InterfaceC0615z;
import m.m0;

/* loaded from: classes.dex */
public final class z extends Z1.j implements Y1.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f5524e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ F f5525f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ G f5526g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(F f3, G g3, int i3) {
        super(1);
        this.f5524e = i3;
        this.f5525f = f3;
        this.f5526g = g3;
    }

    @Override // Y1.c
    public final Object j(Object obj) {
        InterfaceC0615z interfaceC0615z;
        InterfaceC0615z interfaceC0615z2;
        switch (this.f5524e) {
            case 0:
                m0 m0Var = (m0) obj;
                x xVar = x.f5514d;
                x xVar2 = x.f5515e;
                if (m0Var.a(xVar, xVar2)) {
                    H h3 = this.f5525f.f5432a.f5448a;
                    return (h3 == null || (interfaceC0615z2 = h3.f5437b) == null) ? AbstractC0555B.f5414b : interfaceC0615z2;
                }
                if (!m0Var.a(xVar2, x.f5516f)) {
                    return AbstractC0555B.f5414b;
                }
                H h4 = this.f5526g.f5435a.f5448a;
                return (h4 == null || (interfaceC0615z = h4.f5437b) == null) ? AbstractC0555B.f5414b : interfaceC0615z;
            case 1:
                int ordinal = ((x) obj).ordinal();
                float f3 = 1.0f;
                if (ordinal == 0) {
                    H h5 = this.f5525f.f5432a.f5448a;
                    if (h5 != null) {
                        f3 = h5.f5436a;
                    }
                } else if (ordinal != 1) {
                    if (ordinal != 2) {
                        throw new L1.f();
                    }
                    H h6 = this.f5526g.f5435a.f5448a;
                    if (h6 != null) {
                        f3 = h6.f5436a;
                    }
                }
                return Float.valueOf(f3);
            case C0438i.FLOAT_FIELD_NUMBER /* 2 */:
                m0 m0Var2 = (m0) obj;
                x xVar3 = x.f5514d;
                x xVar4 = x.f5515e;
                if (m0Var2.a(xVar3, xVar4)) {
                    return AbstractC0555B.f5414b;
                }
                if (!m0Var2.a(xVar4, x.f5516f)) {
                    return AbstractC0555B.f5414b;
                }
                O o3 = this.f5526g.f5435a;
                return AbstractC0555B.f5414b;
            default:
                int ordinal2 = ((x) obj).ordinal();
                if (ordinal2 != 0 && ordinal2 != 1) {
                    if (ordinal2 != 2) {
                        throw new L1.f();
                    }
                    O o4 = this.f5526g.f5435a;
                }
                return Float.valueOf(1.0f);
        }
    }
}
