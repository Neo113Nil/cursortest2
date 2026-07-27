package i3;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;

/* renamed from: i3.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0696q implements KSerializer {

    /* renamed from: a, reason: collision with root package name */
    public static final C0696q f7101a = new C0696q();

    /* renamed from: b, reason: collision with root package name */
    public static final T f7102b = new T("kotlin.Double", g3.d.f6787k);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return Double.valueOf(decoder.D());
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f7102b;
    }
}
