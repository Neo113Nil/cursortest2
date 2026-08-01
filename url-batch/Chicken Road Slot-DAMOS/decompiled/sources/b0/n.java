package b0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final /* synthetic */ class n implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f866d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d1.l f867e;

    public /* synthetic */ n(d1.l lVar, int i3, int i10) {
        this.f866d = i10;
        this.f867e = lVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i3 = this.f866d;
        n0.i0 i0Var = (n0.i0) obj;
        ((Integer) obj2).getClass();
        switch (i3) {
            case 0:
                p.a(this.f867e, i0Var, n0.h.z(1));
                break;
            default:
                g8.b.a(this.f867e, i0Var, n0.h.z(1));
                break;
        }
        return Unit.f5554a;
    }
}
