package a0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class z implements p6.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z.h f181d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f182e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f183f;

    public z(int i, Object obj, z.h hVar) {
        this.f181d = hVar;
        this.f182e = i;
        this.f183f = obj;
    }

    @Override // p6.e
    public final Object g(Object obj, Object obj2) {
        m0.s sVar = (m0.s) obj;
        int intValue = ((Number) obj2).intValue();
        if (sVar.N(intValue & 1, (intValue & 3) != 2)) {
            this.f181d.a(this.f182e, this.f183f, sVar, 0);
        } else {
            sVar.Q();
        }
        return c6.m.f1757a;
    }
}
