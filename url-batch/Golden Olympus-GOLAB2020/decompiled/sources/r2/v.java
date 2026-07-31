package r2;

import kotlin.coroutines.CoroutineContext;
import o2.InterfaceC3359v0;
import q2.EnumC3383a;

/* loaded from: classes3.dex */
final class v implements G, InterfaceC3396f, s2.p {

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3359v0 f43618b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ G f43619c;

    public v(G g4, InterfaceC3359v0 interfaceC3359v0) {
        this.f43618b = interfaceC3359v0;
        this.f43619c = g4;
    }

    @Override // r2.x, r2.InterfaceC3396f
    public Object a(InterfaceC3397g interfaceC3397g, kotlin.coroutines.d dVar) {
        return this.f43619c.a(interfaceC3397g, dVar);
    }

    @Override // s2.p
    public InterfaceC3396f f(CoroutineContext coroutineContext, int i4, EnumC3383a enumC3383a) {
        return I.d(this, coroutineContext, i4, enumC3383a);
    }

    @Override // r2.G
    public Object getValue() {
        return this.f43619c.getValue();
    }
}
