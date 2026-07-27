package i3;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;

/* renamed from: i3.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0693n extends AbstractC0680a {

    /* renamed from: a, reason: collision with root package name */
    public final KSerializer f7093a;

    public AbstractC0693n(KSerializer kSerializer) {
        this.f7093a = kSerializer;
    }

    @Override // i3.AbstractC0680a
    public void d(h3.a decoder, int i2, Object obj, boolean z4) {
        Object j4;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        j4 = decoder.j(getDescriptor(), i2, this.f7093a, null);
        g(obj, i2, j4);
    }

    public abstract void g(Object obj, int i2, Object obj2);
}
