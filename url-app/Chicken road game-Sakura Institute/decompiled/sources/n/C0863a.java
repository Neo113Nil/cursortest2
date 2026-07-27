package n;

import A.C0028y;
import G.C0192d;
import G.C0216p;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* renamed from: n.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0863a extends M2.p implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8495d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o f8496e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Function0 f8497i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ S.o f8498j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C0028y f8499k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f8500l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0863a(o oVar, Function0 function0, S.o oVar2, C0028y c0028y, int i2, int i4) {
        super(2);
        this.f8495d = i4;
        this.f8496e = oVar;
        this.f8497i = function0;
        this.f8498j = oVar2;
        this.f8499k = c0028y;
        this.f8500l = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        switch (this.f8495d) {
            case 0:
                ((Number) obj2).intValue();
                int U3 = C0192d.U(this.f8500l | 1);
                C0028y c0028y = this.f8499k;
                AbstractC0864b.b(this.f8496e, this.f8497i, this.f8498j, c0028y, (C0216p) obj, U3);
                break;
            default:
                ((Number) obj2).intValue();
                int U4 = C0192d.U(this.f8500l | 1);
                C0028y c0028y2 = this.f8499k;
                AbstractC0864b.b(this.f8496e, this.f8497i, this.f8498j, c0028y2, (C0216p) obj, U4);
                break;
        }
        return Unit.f7487a;
    }
}
