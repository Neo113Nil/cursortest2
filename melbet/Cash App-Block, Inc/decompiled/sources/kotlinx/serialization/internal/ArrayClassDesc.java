package kotlinx.serialization.internal;

import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes9.dex */
public final class ArrayClassDesc extends ListLikeDescriptor {
    public final /* synthetic */ int $r8$classId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ArrayClassDesc(SerialDescriptor serialDescriptor, int i) {
        super(serialDescriptor);
        this.$r8$classId = i;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String getSerialName() {
        switch (this.$r8$classId) {
            case 0:
                return "kotlin.Array";
            case 1:
                return "kotlin.collections.ArrayList";
            case 2:
                return "kotlin.collections.HashSet";
            default:
                return "kotlin.collections.LinkedHashSet";
        }
    }
}
