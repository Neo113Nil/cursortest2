package a2;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class w0 extends wd.p implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z0 f177d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d1.l f178e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Function2 f179i;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f180r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(z0 z0Var, d1.l lVar, Function2 function2, int i3) {
        super(2);
        this.f177d = z0Var;
        this.f178e = lVar;
        this.f179i = function2;
        this.f180r = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int z10 = n0.h.z(this.f180r | 1);
        q.a(this.f177d, this.f178e, this.f179i, (n0.i0) obj, z10);
        return Unit.f5554a;
    }
}
