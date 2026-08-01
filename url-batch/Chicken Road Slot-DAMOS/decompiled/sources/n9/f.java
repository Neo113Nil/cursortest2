package n9;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import n0.i0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7211d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j9.a f7212e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ d1.l f7213i;

    public /* synthetic */ f(j9.a aVar, d1.l lVar, int i3, int i10) {
        this.f7211d = i10;
        this.f7212e = aVar;
        this.f7213i = lVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i3 = this.f7211d;
        i0 i0Var = (i0) obj;
        ((Integer) obj2).getClass();
        switch (i3) {
            case 0:
                i7.a.k(this.f7212e, this.f7213i, i0Var, n0.h.z(49));
                break;
            case 1:
                i7.a.g(this.f7212e, this.f7213i, i0Var, n0.h.z(49));
                break;
            default:
                i7.a.i(this.f7212e, this.f7213i, i0Var, n0.h.z(1));
                break;
        }
        return Unit.f5554a;
    }
}
