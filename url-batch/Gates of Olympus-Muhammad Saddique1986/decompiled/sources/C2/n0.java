package C2;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;

/* loaded from: classes.dex */
public final class n0 implements KSerializer {

    /* renamed from: b, reason: collision with root package name */
    public static final n0 f772b = new n0();

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ L f773a = new L();

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        this.f773a.deserialize(decoder);
        return R1.y.f4171a;
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return this.f773a.getDescriptor();
    }
}
