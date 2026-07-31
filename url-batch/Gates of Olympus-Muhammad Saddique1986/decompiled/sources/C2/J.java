package C2;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;

/* loaded from: classes.dex */
public final class J implements KSerializer {

    /* renamed from: a, reason: collision with root package name */
    public static final J f701a = new J();

    /* renamed from: b, reason: collision with root package name */
    public static final I f702b = I.f700a;

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        throw new z2.c("'kotlin.Nothing' does not have instances");
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f702b;
    }
}
