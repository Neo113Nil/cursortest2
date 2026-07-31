package C2;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;

/* renamed from: C2.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0050m implements KSerializer {

    /* renamed from: a, reason: collision with root package name */
    public static final C0050m f767a = new C0050m();

    /* renamed from: b, reason: collision with root package name */
    public static final T f768b = new T("kotlin.Char", A2.d.f232e);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        return Character.valueOf(decoder.n());
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f768b;
    }
}
