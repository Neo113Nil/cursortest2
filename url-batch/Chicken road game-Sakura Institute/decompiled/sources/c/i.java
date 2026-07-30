package c;

import d6.z;
import g0.p;
import r6.l;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class i extends l implements q6.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f1435g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ q6.e f1436h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(boolean z8, q6.e eVar, int i7) {
        super(2);
        this.f1435g = z8;
        this.f1436h = eVar;
    }

    @Override // q6.e
    public final Object d(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        q6.e eVar = this.f1436h;
        t6.a.i(this.f1435g, eVar, (p) obj, 1);
        return z.f2639a;
    }
}
