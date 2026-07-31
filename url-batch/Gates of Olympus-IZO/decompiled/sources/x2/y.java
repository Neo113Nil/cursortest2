package x2;

import h.AbstractC0416e;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import w2.D;
import w2.a0;

/* loaded from: classes.dex */
public final class y implements KSerializer {

    /* renamed from: a, reason: collision with root package name */
    public static final y f8768a = new y();

    /* renamed from: b, reason: collision with root package name */
    public static final x f8769b = x.f8765b;

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC0416e.l(decoder);
        a0 a0Var = a0.f8646a;
        n nVar = n.f8756a;
        return new w((Map) new D().c(decoder));
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f8769b;
    }
}
