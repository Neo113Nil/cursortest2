package u;

import a2.n0;
import a2.o0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class l extends wd.p implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n f9526d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o0 f9527e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f9528i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(n nVar, o0 o0Var, long j) {
        super(1);
        this.f9526d = nVar;
        this.f9527e = o0Var;
        this.f9528i = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        d1.d dVar = this.f9526d.E.f9537b;
        n0.o((n0) obj, this.f9527e, dVar.a((r0.f132e & 4294967295L) | (r0.f131d << 32), this.f9528i, x2.l.f10330d));
        return Unit.f5554a;
    }
}
