package w2;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;

/* renamed from: w2.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1042v implements KSerializer {

    /* renamed from: a, reason: collision with root package name */
    public static final C1042v f8704a = new C1042v();

    /* renamed from: b, reason: collision with root package name */
    public static final T f8705b = new T("kotlin.Float", u2.d.f8532f);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        return Float.valueOf(decoder.v());
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f8705b;
    }
}
