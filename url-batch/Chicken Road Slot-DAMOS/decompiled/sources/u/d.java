package u;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import v.z0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class d extends wd.p implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z0 f9491d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d1.l f9492e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Function1 f9493i;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ d1.d f9494r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Function1 f9495s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ x0.d f9496t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f9497u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(z0 z0Var, d1.l lVar, Function1 function1, d1.d dVar, Function1 function12, x0.d dVar2, int i3) {
        super(2);
        this.f9491d = z0Var;
        this.f9492e = lVar;
        this.f9493i = function1;
        this.f9494r = dVar;
        this.f9495s = function12;
        this.f9496t = dVar2;
        this.f9497u = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        f.a(this.f9491d, this.f9492e, this.f9493i, this.f9494r, this.f9495s, this.f9496t, (n0.i0) obj, n0.h.z(this.f9497u | 1));
        return Unit.f5554a;
    }
}
