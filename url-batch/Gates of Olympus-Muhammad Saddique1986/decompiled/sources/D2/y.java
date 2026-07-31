package D2;

import C2.D;
import C2.a0;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;

/* loaded from: classes.dex */
public final class y implements KSerializer {

    /* renamed from: a, reason: collision with root package name */
    public static final y f908a = new y();

    /* renamed from: b, reason: collision with root package name */
    public static final x f909b = x.f905b;

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        O2.d.q(decoder);
        a0 a0Var = a0.f733a;
        n nVar = n.f896a;
        return new w((Map) new D().c(decoder));
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f909b;
    }
}
