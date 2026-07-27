package A;

import G.C0192d;
import G.C0216p;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import s0.AbstractC1144g0;
import s0.P0;

/* renamed from: A.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0008d extends M2.p implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ P0 f116d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f117e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f118i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ S.o f119j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0019o f120k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0008d(P0 p02, long j4, boolean z4, S.o oVar, InterfaceC0019o interfaceC0019o) {
        super(2);
        this.f116d = p02;
        this.f117e = j4;
        this.f118i = z4;
        this.f119j = oVar;
        this.f120k = interfaceC0019o;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        C0216p c0216p = (C0216p) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0216p.z()) {
            c0216p.N();
        } else {
            C0192d.a(AbstractC1144g0.f10229q.a(this.f116d), O.f.b(-1426434671, new C0007c(this.f117e, this.f118i, this.f119j, this.f120k), c0216p), c0216p, 56);
        }
        return Unit.f7487a;
    }
}
