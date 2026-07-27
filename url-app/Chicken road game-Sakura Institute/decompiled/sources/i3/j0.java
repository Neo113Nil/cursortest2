package i3;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;

/* loaded from: classes.dex */
public final class j0 implements KSerializer {

    /* renamed from: a, reason: collision with root package name */
    public static final j0 f7081a = new j0();

    /* renamed from: b, reason: collision with root package name */
    public static final C0702x f7082b;

    static {
        Intrinsics.checkNotNullParameter(M2.q.f3608a, "<this>");
        f7082b = M.a("kotlin.ULong", H.f7018a);
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return new y2.y(decoder.d(f7082b).e());
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f7082b;
    }
}
