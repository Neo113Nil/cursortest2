package C2;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import n2.AbstractC0724d;
import p2.C0804a;

/* loaded from: classes.dex */
public final class o0 implements KSerializer {

    /* renamed from: a, reason: collision with root package name */
    public static final o0 f776a = new o0();

    /* renamed from: b, reason: collision with root package name */
    public static final T f777b = new T("kotlin.uuid.Uuid", A2.d.f238k);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        String t3 = decoder.t();
        f2.j.f(t3, "uuidString");
        if (t3.length() != 36) {
            throw new IllegalArgumentException("Expected a 36-char string in the standard uuid format.");
        }
        long b3 = AbstractC0724d.b(0, 8, t3);
        n.T.e(t3, 8);
        long b4 = AbstractC0724d.b(9, 13, t3);
        n.T.e(t3, 13);
        long b5 = AbstractC0724d.b(14, 18, t3);
        n.T.e(t3, 18);
        long b6 = AbstractC0724d.b(19, 23, t3);
        n.T.e(t3, 23);
        long j3 = (b3 << 32) | (b4 << 16) | b5;
        long b7 = AbstractC0724d.b(24, 36, t3) | (b6 << 48);
        return (j3 == 0 && b7 == 0) ? C0804a.f7833f : new C0804a(j3, b7);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f777b;
    }
}
