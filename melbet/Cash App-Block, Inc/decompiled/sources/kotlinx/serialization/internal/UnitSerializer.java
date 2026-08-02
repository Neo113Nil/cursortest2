package kotlinx.serialization.internal;

import kotlin.Unit;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes3.dex */
public final class UnitSerializer implements KSerializer {
    public static final UnitSerializer INSTANCE = new UnitSerializer();
    public final /* synthetic */ EnumSerializer $$delegate_0 = new EnumSerializer("kotlin.Unit", Unit.INSTANCE);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        this.$$delegate_0.deserialize(decoder);
        return Unit.INSTANCE;
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return this.$$delegate_0.getDescriptor();
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        Unit unit = (Unit) obj;
        unit.getClass();
        this.$$delegate_0.serialize(encoder, unit);
    }
}
