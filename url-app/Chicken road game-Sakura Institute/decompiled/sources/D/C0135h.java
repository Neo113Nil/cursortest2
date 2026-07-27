package D;

import G.C0216p;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* renamed from: D.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0135h extends M2.p implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1805d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Function2 f1806e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ O.a f1807i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0135h(Function2 function2, O.a aVar, int i2) {
        super(2);
        this.f1805d = i2;
        this.f1806e = function2;
        this.f1807i = aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        int i2 = 0;
        Function2 function2 = this.f1806e;
        O.a aVar = this.f1807i;
        switch (this.f1805d) {
            case 0:
                C0216p c0216p = (C0216p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0216p.z()) {
                    c0216p.N();
                } else {
                    c0216p.S(1497073862);
                    if (function2 != null) {
                        function2.h(c0216p, 0);
                        Unit unit = Unit.f7487a;
                    }
                    c0216p.q(false);
                    aVar.h(c0216p, 0);
                }
                break;
            default:
                C0216p c0216p2 = (C0216p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0216p2.z()) {
                    c0216p2.N();
                } else {
                    float f4 = AbstractC0150m.f1888a;
                    AbstractC0150m.b(O.f.b(1887135077, new C0135h(function2, aVar, i2), c0216p2), c0216p2, 438);
                }
                break;
        }
        return Unit.f7487a;
    }
}
