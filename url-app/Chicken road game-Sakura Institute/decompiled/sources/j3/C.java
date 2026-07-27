package j3;

import A1.v0;
import M2.F;
import a.AbstractC0345a;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;

/* loaded from: classes.dex */
public final class C implements KSerializer {

    /* renamed from: a, reason: collision with root package name */
    public static final C f7168a = new C();

    /* renamed from: b, reason: collision with root package name */
    public static final g3.f f7169b = j0.c.n("kotlinx.serialization.json.JsonPrimitive", g3.d.f6792p, new SerialDescriptor[0], new v0(8));

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        m i2 = AbstractC0345a.h(decoder).i();
        if (i2 instanceof B) {
            return (B) i2;
        }
        throw k3.h.d(-1, "Unexpected JSON element, expected JsonPrimitive, had " + F.a(i2.getClass()), i2.toString());
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f7169b;
    }
}
