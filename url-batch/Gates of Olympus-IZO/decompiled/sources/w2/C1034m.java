package w2;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;

/* renamed from: w2.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1034m implements KSerializer {

    /* renamed from: a, reason: collision with root package name */
    public static final C1034m f8680a = new C1034m();

    /* renamed from: b, reason: collision with root package name */
    public static final T f8681b = new T("kotlin.Char", u2.d.f8530d);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        return Character.valueOf(decoder.p());
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f8681b;
    }
}
