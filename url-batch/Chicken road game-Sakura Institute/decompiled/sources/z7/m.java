package z7;

import java.io.IOException;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class m extends v7.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n f10178e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f10179f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f10180g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(String str, n nVar, int i7, long j8) {
        super(str, true);
        this.f10178e = nVar;
        this.f10179f = i7;
        this.f10180g = j8;
    }

    @Override // v7.a
    public final long a() {
        n nVar = this.f10178e;
        try {
            nVar.B.z(this.f10180g, this.f10179f);
            return -1L;
        } catch (IOException e9) {
            nVar.b(2, 2, e9);
            return -1L;
        }
    }
}
