package D;

import G.C0216p;
import java.util.List;
import kotlin.Unit;
import s0.C1157n;

/* loaded from: classes.dex */
public final class D1 extends M2.p implements L2.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1217d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D1(int i2) {
        super(3);
        this.f1217d = i2;
    }

    @Override // L2.c
    public final Object g(Object obj, Object obj2, Object obj3) {
        List list = (List) obj;
        C0216p c0216p = (C0216p) obj2;
        ((Number) obj3).intValue();
        int size = list.size();
        int i2 = this.f1217d;
        if (i2 < size) {
            C1.f1211a.a(S.a.b(S.l.f3977a, C1157n.f10272m, new A.i0(1, (A1) list.get(i2))), 0.0f, 0L, c0216p, 3072);
        }
        return Unit.f7487a;
    }
}
