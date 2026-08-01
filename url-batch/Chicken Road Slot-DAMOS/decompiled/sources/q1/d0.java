package q1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class d0 extends wd.p implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7825d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e0 f7826e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d0(e0 e0Var, int i3) {
        super(1);
        this.f7825d = i3;
        this.f7826e = e0Var;
    }

    /* JADX WARN: Type inference failed for: r10v3, types: [kotlin.jvm.functions.Function0, wd.p] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f7825d) {
            case 0:
                e0 e0Var = this.f7826e;
                e0Var.f7838d = true;
                e0Var.f7840f.invoke();
                return Unit.f5554a;
            default:
                m1.d dVar = (m1.d) obj;
                e0 e0Var2 = this.f7826e;
                c cVar = e0Var2.f7836b;
                float f3 = e0Var2.f7843k;
                float f10 = e0Var2.f7844l;
                a1.n s3 = dVar.s();
                long u2 = s3.u();
                s3.p().h();
                try {
                    ((l.d) s3.f41i).z(f3, f10, 0L);
                    cVar.a(dVar);
                    s3.p().f();
                    s3.K(u2);
                    return Unit.f5554a;
                } catch (Throwable th) {
                    s3.p().f();
                    s3.K(u2);
                    throw th;
                }
        }
    }
}
