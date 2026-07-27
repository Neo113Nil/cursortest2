package D;

import A.InterfaceC0019o;
import G.C0192d;
import G.C0216p;
import f0.C0578I;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import w.AbstractC1264d;

/* renamed from: D.q0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0163q0 extends M2.p implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1969d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ S.o f1970e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f1971i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f1972j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f1973k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0163q0(Object obj, S.o oVar, long j4, int i2, int i4) {
        super(2);
        this.f1969d = i4;
        this.f1973k = obj;
        this.f1970e = oVar;
        this.f1971i = j4;
        this.f1972j = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        switch (this.f1969d) {
            case 0:
                ((Number) obj2).intValue();
                int U3 = C0192d.U(this.f1972j | 1);
                long j4 = this.f1971i;
                AbstractC0165r0.b((C0578I) this.f1973k, this.f1970e, j4, (C0216p) obj, U3);
                break;
            default:
                ((Number) obj2).intValue();
                int U4 = C0192d.U(this.f1972j | 1);
                long j5 = this.f1971i;
                AbstractC1264d.a((InterfaceC0019o) this.f1973k, this.f1970e, j5, (C0216p) obj, U4);
                break;
        }
        return Unit.f7487a;
    }
}
