package p7;

import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class g implements KSerializer {

    /* renamed from: a, reason: collision with root package name */
    public static final g f7221a = new g();

    /* renamed from: b, reason: collision with root package name */
    public static final f f7222b = f.f7218b;

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        t6.a.p(decoder);
        m mVar = m.f7230a;
        return new e((List) new o7.c().c(decoder));
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f7222b;
    }
}
