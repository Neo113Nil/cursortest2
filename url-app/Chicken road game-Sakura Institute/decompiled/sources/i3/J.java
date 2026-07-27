package i3;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;

/* loaded from: classes.dex */
public final class J implements KSerializer {

    /* renamed from: a, reason: collision with root package name */
    public static final J f7021a = new J();

    /* renamed from: b, reason: collision with root package name */
    public static final I f7022b = I.f7020a;

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        throw new f3.c("'kotlin.Nothing' does not have instances");
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f7022b;
    }
}
