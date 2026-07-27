package i3;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;

/* renamed from: i3.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0685f implements KSerializer {

    /* renamed from: a, reason: collision with root package name */
    public static final C0685f f7068a = new C0685f();

    /* renamed from: b, reason: collision with root package name */
    public static final T f7069b = new T("kotlin.Boolean", g3.d.f6784h);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return Boolean.valueOf(decoder.k());
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f7069b;
    }
}
