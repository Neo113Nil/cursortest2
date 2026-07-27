package i3;

import M2.C0251c;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;

/* loaded from: classes.dex */
public final class d0 implements KSerializer {

    /* renamed from: a, reason: collision with root package name */
    public static final d0 f7063a = new d0();

    /* renamed from: b, reason: collision with root package name */
    public static final C0702x f7064b;

    static {
        Intrinsics.checkNotNullParameter(C0251c.f3588a, "<this>");
        f7064b = M.a("kotlin.UByte", C0688i.f7078a);
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return new y2.u(decoder.d(f7064b).r());
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f7064b;
    }
}
