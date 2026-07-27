package i3;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;

/* renamed from: i3.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0703y implements InterfaceC0701w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ KSerializer f7116a;

    public C0703y(KSerializer kSerializer) {
        this.f7116a = kSerializer;
    }

    @Override // i3.InterfaceC0701w
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{this.f7116a};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        throw new IllegalStateException("unsupported");
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        throw new IllegalStateException("unsupported");
    }

    @Override // i3.InterfaceC0701w
    public final KSerializer[] typeParametersSerializers() {
        return M.f7028b;
    }
}
