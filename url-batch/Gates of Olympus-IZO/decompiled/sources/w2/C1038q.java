package w2;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;

/* renamed from: w2.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1038q implements KSerializer {

    /* renamed from: a, reason: collision with root package name */
    public static final C1038q f8692a = new C1038q();

    /* renamed from: b, reason: collision with root package name */
    public static final T f8693b = new T("kotlin.Double", u2.d.f8531e);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        return Double.valueOf(decoder.A());
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f8693b;
    }
}
