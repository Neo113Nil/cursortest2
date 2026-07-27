package D;

import C.C0107b;
import C.C0109d;
import C.C0113h;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import p.InterfaceC0934j;
import r0.AbstractC1065f;

/* loaded from: classes.dex */
public final class U extends M2.p implements Function0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1656d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ V f1657e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ U(V v4, int i2) {
        super(0);
        this.f1656d = i2;
        this.f1657e = v4;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        C0113h c0113h;
        int i2 = 0;
        V v4 = this.f1657e;
        switch (this.f1656d) {
            case 0:
                V0 v02 = (V0) AbstractC1065f.i(v4, X0.f1675b);
                return (v02 == null || (c0113h = v02.f1669b) == null) ? W0.f1671a : c0113h;
            default:
                if (((V0) AbstractC1065f.i(v4, X0.f1675b)) == null) {
                    C.y yVar = v4.f1667z;
                    if (yVar != null) {
                        v4.C0(yVar);
                    }
                } else if (v4.f1667z == null) {
                    T t4 = new T(0, v4);
                    U u4 = new U(v4, i2);
                    l.u0 u0Var = C.w.f1137a;
                    boolean z4 = C.C.f1043a;
                    InterfaceC0934j interfaceC0934j = v4.f1663v;
                    boolean z5 = v4.f1664w;
                    float f4 = v4.f1665x;
                    C.y c0109d = z4 ? new C0109d(interfaceC0934j, z5, f4, t4, u4) : new C0107b(interfaceC0934j, z5, f4, t4, u4);
                    v4.B0(c0109d);
                    v4.f1667z = c0109d;
                }
                return Unit.f7487a;
        }
    }
}
