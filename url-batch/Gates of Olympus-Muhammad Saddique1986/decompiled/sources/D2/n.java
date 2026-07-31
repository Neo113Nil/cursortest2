package D2;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;

/* loaded from: classes.dex */
public final class n implements KSerializer {

    /* renamed from: a, reason: collision with root package name */
    public static final n f896a = new n();

    /* renamed from: b, reason: collision with root package name */
    public static final A2.h f897b = O2.l.Q("kotlinx.serialization.json.JsonElement", A2.c.f229c, new SerialDescriptor[0], new A2.i(1));

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        return O2.d.q(decoder).x0();
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f897b;
    }
}
