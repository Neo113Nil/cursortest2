package o7;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class o1 implements KSerializer {

    /* renamed from: a, reason: collision with root package name */
    public static final o1 f6920a = new o1();

    /* renamed from: b, reason: collision with root package name */
    public static final t0 f6921b = new t0("kotlin.uuid.Uuid", m7.d.f6449o);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        String y4 = decoder.y();
        r6.k.f(y4, "uuidString");
        if (y4.length() != 36) {
            throw new IllegalArgumentException("Expected a 36-char string in the standard uuid format.");
        }
        long b9 = z6.c.b(0, 8, y4);
        r4.a.j(y4, 8);
        long b10 = z6.c.b(9, 13, y4);
        r4.a.j(y4, 13);
        long b11 = z6.c.b(14, 18, y4);
        r4.a.j(y4, 18);
        long b12 = z6.c.b(19, 23, y4);
        r4.a.j(y4, 23);
        long j8 = (b9 << 32) | (b10 << 16) | b11;
        long b13 = z6.c.b(24, 36, y4) | (b12 << 48);
        return (j8 == 0 && b13 == 0) ? b7.a.f1398h : new b7.a(j8, b13);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f6921b;
    }
}
