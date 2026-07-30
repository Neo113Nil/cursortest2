package p7;

import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import o7.a1;
import o7.d0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class x implements KSerializer {

    /* renamed from: a, reason: collision with root package name */
    public static final x f7241a = new x();

    /* renamed from: b, reason: collision with root package name */
    public static final w f7242b = w.f7238b;

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        t6.a.p(decoder);
        a1 a1Var = a1.f6856a;
        m mVar = m.f7230a;
        return new v((Map) new d0().c(decoder));
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f7242b;
    }
}
