package w2;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;

/* renamed from: w2.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1045y implements InterfaceC1043w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ KSerializer f8707a;

    public C1045y(KSerializer kSerializer) {
        this.f8707a = kSerializer;
    }

    @Override // w2.InterfaceC1043w
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{this.f8707a};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        throw new IllegalStateException("unsupported");
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        throw new IllegalStateException("unsupported");
    }

    @Override // w2.InterfaceC1043w
    public final KSerializer[] typeParametersSerializers() {
        return M.f8619b;
    }
}
