package i3;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;

/* loaded from: classes.dex */
public final class H implements KSerializer {

    /* renamed from: a, reason: collision with root package name */
    public static final H f7018a = new H();

    /* renamed from: b, reason: collision with root package name */
    public static final T f7019b = new T("kotlin.Long", g3.d.f6790n);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return Long.valueOf(decoder.e());
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f7019b;
    }
}
