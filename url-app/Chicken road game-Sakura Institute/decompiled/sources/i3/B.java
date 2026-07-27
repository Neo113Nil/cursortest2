package i3;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;

/* loaded from: classes.dex */
public final class B implements KSerializer {

    /* renamed from: a, reason: collision with root package name */
    public static final B f7009a = new B();

    /* renamed from: b, reason: collision with root package name */
    public static final T f7010b = new T("kotlin.Int", g3.d.f6789m);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return Integer.valueOf(decoder.l());
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f7010b;
    }
}
