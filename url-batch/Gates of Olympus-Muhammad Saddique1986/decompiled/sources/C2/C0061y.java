package C2;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;

/* renamed from: C2.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0061y implements InterfaceC0059w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ KSerializer f794a;

    public C0061y(KSerializer kSerializer) {
        this.f794a = kSerializer;
    }

    @Override // C2.InterfaceC0059w
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{this.f794a};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        throw new IllegalStateException("unsupported");
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        throw new IllegalStateException("unsupported");
    }

    @Override // C2.InterfaceC0059w
    public final KSerializer[] typeParametersSerializers() {
        return M.f706b;
    }
}
