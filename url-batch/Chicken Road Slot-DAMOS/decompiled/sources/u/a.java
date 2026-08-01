package u;

import a2.o0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a extends wd.p implements vd.n {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v f9474d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(v vVar) {
        super(3);
        this.f9474d = vVar;
    }

    @Override // vd.n
    public final Object a(Object obj, Object obj2, Object obj3) {
        o0 c10 = ((a2.f0) obj2).c(((x2.a) obj3).f10316a);
        return a2.i0.V((a2.i0) obj, c10.f131d, c10.f132e, new a3.d(7, c10, this.f9474d));
    }
}
