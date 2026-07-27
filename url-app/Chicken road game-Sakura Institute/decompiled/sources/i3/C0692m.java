package i3;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;

/* renamed from: i3.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0692m implements KSerializer {

    /* renamed from: a, reason: collision with root package name */
    public static final C0692m f7089a = new C0692m();

    /* renamed from: b, reason: collision with root package name */
    public static final T f7090b = new T("kotlin.Char", g3.d.f6786j);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return Character.valueOf(decoder.p());
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f7090b;
    }
}
