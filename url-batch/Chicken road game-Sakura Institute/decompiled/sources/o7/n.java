package o7;

import kotlinx.serialization.KSerializer;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class n extends a {

    /* renamed from: a, reason: collision with root package name */
    public final KSerializer f6911a;

    public n(KSerializer kSerializer) {
        this.f6911a = kSerializer;
    }

    @Override // o7.a
    public void d(n7.a aVar, int i7, Object obj) {
        g(obj, i7, aVar.q(getDescriptor(), i7, this.f6911a, null));
    }

    public abstract void g(Object obj, int i7, Object obj2);
}
