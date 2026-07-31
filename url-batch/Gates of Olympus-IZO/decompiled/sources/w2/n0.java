package w2;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;

/* loaded from: classes.dex */
public final class n0 implements KSerializer {

    /* renamed from: b, reason: collision with root package name */
    public static final n0 f8685b = new n0();

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ L f8686a = new L();

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        this.f8686a.deserialize(decoder);
        return L1.z.f2729a;
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return this.f8686a.getDescriptor();
    }
}
