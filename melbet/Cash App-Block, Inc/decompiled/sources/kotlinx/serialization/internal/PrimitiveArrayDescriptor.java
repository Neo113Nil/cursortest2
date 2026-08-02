package kotlinx.serialization.internal;

import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes3.dex */
public final class PrimitiveArrayDescriptor extends ListLikeDescriptor {
    public final String serialName;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrimitiveArrayDescriptor(SerialDescriptor serialDescriptor) {
        super(serialDescriptor);
        serialDescriptor.getClass();
        this.serialName = serialDescriptor.getSerialName() + "Array";
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String getSerialName() {
        return this.serialName;
    }
}
