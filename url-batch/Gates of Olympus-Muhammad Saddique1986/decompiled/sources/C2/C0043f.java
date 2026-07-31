package C2;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;

/* renamed from: C2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0043f implements KSerializer {

    /* renamed from: a, reason: collision with root package name */
    public static final C0043f f746a = new C0043f();

    /* renamed from: b, reason: collision with root package name */
    public static final T f747b = new T("kotlin.Boolean", A2.d.f230c);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        return Boolean.valueOf(decoder.h());
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f747b;
    }
}
