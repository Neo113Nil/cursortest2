package i3;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;

/* loaded from: classes.dex */
public final class a0 implements KSerializer {

    /* renamed from: a, reason: collision with root package name */
    public static final a0 f7055a = new a0();

    /* renamed from: b, reason: collision with root package name */
    public static final T f7056b = new T("kotlin.String", g3.d.f6792p);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return decoder.u();
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f7056b;
    }
}
