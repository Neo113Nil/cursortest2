package E;

import G.C0192d;
import G.C0216p;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class s extends M2.p implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f2246d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Function2 f2247e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f2248i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(long j4, Function2 function2, int i2) {
        super(2);
        this.f2246d = j4;
        this.f2247e = function2;
        this.f2248i = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int U3 = C0192d.U(this.f2248i | 1);
        v.c(this.f2246d, this.f2247e, (C0216p) obj, U3);
        return Unit.f7487a;
    }
}
