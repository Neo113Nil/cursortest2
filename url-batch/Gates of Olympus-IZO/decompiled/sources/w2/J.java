package w2;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;

/* loaded from: classes.dex */
public final class J implements KSerializer {

    /* renamed from: a, reason: collision with root package name */
    public static final J f8614a = new J();

    /* renamed from: b, reason: collision with root package name */
    public static final I f8615b = I.f8613a;

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        throw new t2.c("'kotlin.Nothing' does not have instances");
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f8615b;
    }
}
