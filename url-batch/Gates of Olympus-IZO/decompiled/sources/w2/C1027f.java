package w2;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;

/* renamed from: w2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1027f implements KSerializer {

    /* renamed from: a, reason: collision with root package name */
    public static final C1027f f8659a = new C1027f();

    /* renamed from: b, reason: collision with root package name */
    public static final T f8660b = new T("kotlin.Boolean", u2.d.f8528b);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        return Boolean.valueOf(decoder.k());
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f8660b;
    }
}
