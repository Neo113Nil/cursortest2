package A;

import G.C0192d;
import G.C0216p;
import a.AbstractC0345a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class U extends M2.p implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f56d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ S.o f57e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ O.a f58i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f59j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ U(S.o oVar, O.a aVar, int i2, int i4) {
        super(2);
        this.f56d = i4;
        this.f57e = oVar;
        this.f58i = aVar;
        this.f59j = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        int i2 = this.f56d;
        C0216p c0216p = (C0216p) obj;
        ((Number) obj2).intValue();
        switch (i2) {
            case 0:
                int U3 = C0192d.U(this.f59j | 1);
                AbstractC0345a.d(this.f57e, this.f58i, c0216p, U3);
                break;
            default:
                int U4 = C0192d.U(this.f59j | 1);
                AbstractC0345a.e(this.f57e, this.f58i, c0216p, U4);
                break;
        }
        return Unit.f7487a;
    }
}
