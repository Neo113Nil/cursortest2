package u;

import a2.n0;
import a2.o0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class e0 extends wd.p implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o0 f9503d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f9504e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f9505i;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ a3.i f9506r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(o0 o0Var, long j, long j3, a3.i iVar) {
        super(1);
        this.f9503d = o0Var;
        this.f9504e = j;
        this.f9505i = j3;
        this.f9506r = iVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        n0 n0Var = (n0) obj;
        long j = this.f9504e;
        long j3 = this.f9505i;
        n0Var.getClass();
        o0 o0Var = this.f9503d;
        n0.a(n0Var, o0Var);
        o0Var.Z(x2.i.c(((((int) (j >> 32)) + ((int) (j3 >> 32))) << 32) | ((((int) (j & 4294967295L)) + ((int) (j3 & 4294967295L))) & 4294967295L), o0Var.f135s), 0.0f, this.f9506r);
        return Unit.f5554a;
    }
}
