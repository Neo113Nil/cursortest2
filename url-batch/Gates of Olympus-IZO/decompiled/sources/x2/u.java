package x2;

import D1.E;
import h.AbstractC0416e;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;

/* loaded from: classes.dex */
public final class u implements KSerializer {

    /* renamed from: a, reason: collision with root package name */
    public static final u f8763a = new u();

    /* renamed from: b, reason: collision with root package name */
    public static final u2.f f8764b = AbstractC0416e.m("kotlinx.serialization.json.JsonNull", u2.g.f8549c, new SerialDescriptor[0], new E(5));

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC0416e.l(decoder);
        if (decoder.m()) {
            throw new y2.c("Expected 'null' literal");
        }
        return t.INSTANCE;
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f8764b;
    }
}
