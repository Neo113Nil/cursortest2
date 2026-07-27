package i3;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;

/* loaded from: classes.dex */
public final class n0 implements KSerializer {

    /* renamed from: b, reason: collision with root package name */
    public static final n0 f7094b = new n0();

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ L f7095a = new L(Unit.f7487a);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        this.f7095a.deserialize(decoder);
        return Unit.f7487a;
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return this.f7095a.getDescriptor();
    }
}
