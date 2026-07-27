package i3;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;

/* loaded from: classes.dex */
public final class g0 implements KSerializer {

    /* renamed from: a, reason: collision with root package name */
    public static final g0 f7073a = new g0();

    /* renamed from: b, reason: collision with root package name */
    public static final C0702x f7074b;

    static {
        Intrinsics.checkNotNullParameter(M2.n.f3606a, "<this>");
        f7074b = M.a("kotlin.UInt", B.f7009a);
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return new y2.w(decoder.d(f7074b).l());
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f7074b;
    }
}
