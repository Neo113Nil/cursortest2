package A;

import G.C0192d;
import G.C0216p;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* renamed from: A.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0011g extends M2.p implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f138d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f139e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f140i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f141j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f142k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0011g(S.o oVar, Function0 function0, boolean z4, int i2) {
        super(2);
        this.f141j = oVar;
        this.f142k = function0;
        this.f139e = z4;
        this.f140i = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        int i2 = this.f138d;
        C0216p c0216p = (C0216p) obj;
        ((Number) obj2).intValue();
        switch (i2) {
            case 0:
                int U3 = C0192d.U(this.f140i | 1);
                M1.a.i((S.o) this.f141j, (Function0) this.f142k, this.f139e, c0216p, U3);
                break;
            default:
                int U4 = C0192d.U(this.f140i | 1);
                j0.c.i(this.f139e, (L0.h) this.f141j, (a0) this.f142k, c0216p, U4);
                break;
        }
        return Unit.f7487a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0011g(boolean z4, L0.h hVar, a0 a0Var, int i2) {
        super(2);
        this.f139e = z4;
        this.f141j = hVar;
        this.f142k = a0Var;
        this.f140i = i2;
    }
}
