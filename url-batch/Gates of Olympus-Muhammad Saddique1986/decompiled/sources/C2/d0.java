package C2;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;

/* loaded from: classes.dex */
public final class d0 implements KSerializer {

    /* renamed from: a, reason: collision with root package name */
    public static final d0 f741a = new d0();

    /* renamed from: b, reason: collision with root package name */
    public static final C0060x f742b = M.a("kotlin.UByte", C0046i.f756a);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        return new R1.o(decoder.b(f742b).o());
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f742b;
    }
}
