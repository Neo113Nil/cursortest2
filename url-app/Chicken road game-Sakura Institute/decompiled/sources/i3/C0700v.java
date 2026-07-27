package i3;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;

/* renamed from: i3.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0700v implements KSerializer {

    /* renamed from: a, reason: collision with root package name */
    public static final C0700v f7113a = new C0700v();

    /* renamed from: b, reason: collision with root package name */
    public static final T f7114b = new T("kotlin.Float", g3.d.f6788l);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return Float.valueOf(decoder.v());
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f7114b;
    }
}
