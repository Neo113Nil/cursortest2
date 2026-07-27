package i3;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;

/* renamed from: i3.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0688i implements KSerializer {

    /* renamed from: a, reason: collision with root package name */
    public static final C0688i f7078a = new C0688i();

    /* renamed from: b, reason: collision with root package name */
    public static final T f7079b = new T("kotlin.Byte", g3.d.f6785i);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return Byte.valueOf(decoder.r());
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f7079b;
    }
}
