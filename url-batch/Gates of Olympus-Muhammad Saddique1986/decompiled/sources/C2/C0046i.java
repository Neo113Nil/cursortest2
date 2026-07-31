package C2;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;

/* renamed from: C2.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0046i implements KSerializer {

    /* renamed from: a, reason: collision with root package name */
    public static final C0046i f756a = new C0046i();

    /* renamed from: b, reason: collision with root package name */
    public static final T f757b = new T("kotlin.Byte", A2.d.f231d);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        return Byte.valueOf(decoder.o());
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f757b;
    }
}
