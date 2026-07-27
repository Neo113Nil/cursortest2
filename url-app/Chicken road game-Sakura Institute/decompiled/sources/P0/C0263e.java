package P0;

import G.C0216p;
import G.C0235z;
import G.InterfaceC0191c0;
import a.AbstractC0345a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* renamed from: P0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0263e extends M2.p implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3720d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0191c0 f3721e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0263e(int i2, InterfaceC0191c0 interfaceC0191c0) {
        super(2);
        this.f3720d = i2;
        this.f3721e = interfaceC0191c0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        int i2 = 0;
        InterfaceC0191c0 interfaceC0191c0 = this.f3721e;
        switch (this.f3720d) {
            case 0:
                C0216p c0216p = (C0216p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0216p.z()) {
                    c0216p.N();
                } else {
                    ((Function2) interfaceC0191c0.getValue()).h(c0216p, 0);
                }
                break;
            case 1:
                C0216p c0216p2 = (C0216p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0216p2.z()) {
                    c0216p2.N();
                } else {
                    AbstractC0345a.e(y0.k.a(S.l.f3977a, C0262d.f3713e), O.f.b(-533674951, new C0263e(i2, interfaceC0191c0), c0216p2), c0216p2, 48);
                }
                break;
            default:
                C0216p c0216p3 = (C0216p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0216p3.z()) {
                    c0216p3.N();
                } else {
                    C0235z c0235z = o.f3753a;
                    ((Function2) interfaceC0191c0.getValue()).h(c0216p3, 0);
                }
                break;
        }
        return Unit.f7487a;
    }
}
