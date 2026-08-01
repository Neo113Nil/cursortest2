package n9;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import n0.i0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final /* synthetic */ class k implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7224d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d1.l f7225e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Function0 f7226i;

    public /* synthetic */ k(d1.l lVar, Function0 function0, int i3, int i10) {
        this.f7224d = i10;
        this.f7225e = lVar;
        this.f7226i = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i3 = this.f7224d;
        i0 i0Var = (i0) obj;
        ((Integer) obj2).getClass();
        switch (i3) {
            case 0:
                i7.a.f(this.f7225e, this.f7226i, i0Var, n0.h.z(1));
                break;
            case 1:
                c6.f.a(this.f7225e, this.f7226i, i0Var, n0.h.z(1));
                break;
            default:
                g8.b.e(this.f7225e, this.f7226i, i0Var, n0.h.z(1));
                break;
        }
        return Unit.f5554a;
    }
}
