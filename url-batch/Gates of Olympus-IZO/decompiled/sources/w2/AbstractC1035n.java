package w2;

import kotlinx.serialization.KSerializer;

/* renamed from: w2.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1035n extends AbstractC1022a {

    /* renamed from: a, reason: collision with root package name */
    public final KSerializer f8684a;

    public AbstractC1035n(KSerializer kSerializer) {
        this.f8684a = kSerializer;
    }

    @Override // w2.AbstractC1022a
    public void d(v2.a aVar, int i3, Object obj, boolean z3) {
        g(obj, i3, aVar.i(getDescriptor(), i3, this.f8684a, null));
    }

    public abstract void g(Object obj, int i3, Object obj2);
}
