package i3;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;

/* loaded from: classes.dex */
public final class Z implements KSerializer {

    /* renamed from: a, reason: collision with root package name */
    public static final Z f7053a = new Z();

    /* renamed from: b, reason: collision with root package name */
    public static final T f7054b = new T("kotlin.Short", g3.d.f6791o);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return Short.valueOf(decoder.t());
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f7054b;
    }
}
