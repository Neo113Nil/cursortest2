package D2;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;

/* loaded from: classes.dex */
public final class u implements KSerializer {

    /* renamed from: a, reason: collision with root package name */
    public static final u f903a = new u();

    /* renamed from: b, reason: collision with root package name */
    public static final A2.h f904b = O2.l.Q("kotlinx.serialization.json.JsonNull", A2.j.f256d, new SerialDescriptor[0], new A2.i(0));

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        O2.d.q(decoder);
        if (decoder.j()) {
            throw new E2.c("Expected 'null' literal");
        }
        return t.INSTANCE;
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f904b;
    }
}
