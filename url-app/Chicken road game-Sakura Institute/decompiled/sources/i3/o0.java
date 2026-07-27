package i3;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;

/* loaded from: classes.dex */
public final class o0 implements KSerializer {

    /* renamed from: a, reason: collision with root package name */
    public static final o0 f7098a = new o0();

    /* renamed from: b, reason: collision with root package name */
    public static final T f7099b = new T("kotlin.uuid.Uuid", g3.d.f6792p);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        String uuidString = decoder.u();
        Intrinsics.checkNotNullParameter(uuidString, "uuidString");
        if (uuidString.length() != 36) {
            throw new IllegalArgumentException("Expected a 36-char string in the standard uuid format.");
        }
        long b4 = kotlin.text.d.b(uuidString, 0, 8);
        u3.d.j(8, uuidString);
        long b5 = kotlin.text.d.b(uuidString, 9, 13);
        u3.d.j(13, uuidString);
        long b6 = kotlin.text.d.b(uuidString, 14, 18);
        u3.d.j(18, uuidString);
        long b7 = kotlin.text.d.b(uuidString, 19, 23);
        u3.d.j(23, uuidString);
        long j4 = (b4 << 32) | (b5 << 16) | b6;
        long b8 = kotlin.text.d.b(uuidString, 24, 36) | (b7 << 48);
        return (j4 == 0 && b8 == 0) ? V2.a.f4186j : new V2.a(j4, b8);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f7099b;
    }
}
