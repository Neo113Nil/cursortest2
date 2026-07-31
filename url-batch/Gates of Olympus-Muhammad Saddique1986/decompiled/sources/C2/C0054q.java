package C2;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;

/* renamed from: C2.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0054q implements KSerializer {

    /* renamed from: a, reason: collision with root package name */
    public static final C0054q f779a = new C0054q();

    /* renamed from: b, reason: collision with root package name */
    public static final T f780b = new T("kotlin.Double", A2.d.f233f);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        return Double.valueOf(decoder.C());
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f780b;
    }
}
