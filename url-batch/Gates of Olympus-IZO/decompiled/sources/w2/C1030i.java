package w2;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;

/* renamed from: w2.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1030i implements KSerializer {

    /* renamed from: a, reason: collision with root package name */
    public static final C1030i f8669a = new C1030i();

    /* renamed from: b, reason: collision with root package name */
    public static final T f8670b = new T("kotlin.Byte", u2.d.f8529c);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        return Byte.valueOf(decoder.q());
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f8670b;
    }
}
