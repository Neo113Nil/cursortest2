package n9;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import n0.i0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7216d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f7217e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ d1.l f7218i;

    public /* synthetic */ h(float f3, d1.l lVar, int i3, int i10) {
        this.f7216d = i10;
        this.f7217e = f3;
        this.f7218i = lVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i3 = this.f7216d;
        i0 i0Var = (i0) obj;
        ((Integer) obj2).getClass();
        switch (i3) {
            case 0:
                i7.a.j(this.f7217e, this.f7218i, i0Var, n0.h.z(3073));
                break;
            default:
                t9.b.b(this.f7217e, this.f7218i, i0Var, n0.h.z(1));
                break;
        }
        return Unit.f5554a;
    }
}
