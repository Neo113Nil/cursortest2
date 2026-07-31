package C2;

import kotlinx.serialization.KSerializer;

/* renamed from: C2.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0051n extends AbstractC0038a {

    /* renamed from: a, reason: collision with root package name */
    public final KSerializer f771a;

    public AbstractC0051n(KSerializer kSerializer) {
        this.f771a = kSerializer;
    }

    @Override // C2.AbstractC0038a
    public void d(B2.a aVar, int i3, Object obj, boolean z3) {
        g(obj, i3, aVar.g(getDescriptor(), i3, this.f771a, null));
    }

    public abstract void g(Object obj, int i3, Object obj2);
}
