package i3;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import y2.C1322B;

/* loaded from: classes.dex */
public final class m0 implements KSerializer {

    /* renamed from: a, reason: collision with root package name */
    public static final m0 f7091a = new m0();

    /* renamed from: b, reason: collision with root package name */
    public static final C0702x f7092b;

    static {
        Intrinsics.checkNotNullParameter(M2.H.f3582a, "<this>");
        f7092b = M.a("kotlin.UShort", Z.f7053a);
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return new C1322B(decoder.d(f7092b).t());
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f7092b;
    }
}
