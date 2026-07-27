package p0;

import G.C0192d;
import G.C0216p;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* renamed from: p0.U, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0959U extends M2.p implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f9018d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f9019e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f9020i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f9021j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f9022k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0959U(S.o oVar, Function2 function2, int i2, int i4) {
        super(2);
        this.f9021j = oVar;
        this.f9022k = function2;
        this.f9019e = i2;
        this.f9020i = i4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        int i2 = this.f9018d;
        C0216p c0216p = (C0216p) obj;
        ((Number) obj2).intValue();
        switch (i2) {
            case 0:
                int U3 = C0192d.U(this.f9019e | 1);
                AbstractC0960V.b((S.o) this.f9021j, (Function2) this.f9022k, c0216p, U3, this.f9020i);
                break;
            default:
                int U4 = C0192d.U(this.f9020i | 1);
                ((r.h) this.f9021j).a(this.f9019e, this.f9022k, c0216p, U4);
                break;
        }
        return Unit.f7487a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0959U(r.h hVar, int i2, Object obj, int i4) {
        super(2);
        this.f9021j = hVar;
        this.f9019e = i2;
        this.f9022k = obj;
        this.f9020i = i4;
    }
}
