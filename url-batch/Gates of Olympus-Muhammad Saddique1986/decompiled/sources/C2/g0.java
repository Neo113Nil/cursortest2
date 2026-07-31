package C2;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;

/* loaded from: classes.dex */
public final class g0 implements KSerializer {

    /* renamed from: a, reason: collision with root package name */
    public static final g0 f751a = new g0();

    /* renamed from: b, reason: collision with root package name */
    public static final C0060x f752b = M.a("kotlin.UInt", B.f689a);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        return new R1.r(decoder.b(f752b).i());
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f752b;
    }
}
