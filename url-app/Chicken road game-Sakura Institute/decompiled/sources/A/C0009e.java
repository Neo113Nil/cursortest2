package A;

import G.C0192d;
import G.C0216p;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* renamed from: A.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0009e extends M2.p implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0019o f122d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f123e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ L0.h f124i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f125j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ long f126k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ S.o f127l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f128m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0009e(InterfaceC0019o interfaceC0019o, boolean z4, L0.h hVar, boolean z5, long j4, S.o oVar, int i2) {
        super(2);
        this.f122d = interfaceC0019o;
        this.f123e = z4;
        this.f124i = hVar;
        this.f125j = z5;
        this.f126k = j4;
        this.f127l = oVar;
        this.f128m = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int U3 = C0192d.U(this.f128m | 1);
        L0.h hVar = this.f124i;
        boolean z4 = this.f125j;
        M1.a.h(this.f122d, this.f123e, hVar, z4, this.f126k, this.f127l, (C0216p) obj, U3);
        return Unit.f7487a;
    }
}
