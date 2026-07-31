package x2;

import D1.E;
import h.AbstractC0416e;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;

/* loaded from: classes.dex */
public final class n implements KSerializer {

    /* renamed from: a, reason: collision with root package name */
    public static final n f8756a = new n();

    /* renamed from: b, reason: collision with root package name */
    public static final u2.f f8757b = AbstractC0416e.m("kotlinx.serialization.json.JsonElement", u2.c.f8527b, new SerialDescriptor[0], new E(6));

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        return AbstractC0416e.l(decoder).a0();
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f8757b;
    }
}
