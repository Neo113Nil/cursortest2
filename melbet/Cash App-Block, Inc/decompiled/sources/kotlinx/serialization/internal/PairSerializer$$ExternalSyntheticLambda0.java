package kotlinx.serialization.internal;

import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class PairSerializer$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ KSerializer f$0;
    public final /* synthetic */ KSerializer f$1;

    public /* synthetic */ PairSerializer$$ExternalSyntheticLambda0(KSerializer kSerializer, KSerializer kSerializer2, int i) {
        this.$r8$classId = i;
        this.f$0 = kSerializer;
        this.f$1 = kSerializer2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        KSerializer kSerializer = this.f$1;
        KSerializer kSerializer2 = this.f$0;
        ClassSerialDescriptorBuilder classSerialDescriptorBuilder = (ClassSerialDescriptorBuilder) obj;
        switch (i) {
            case 0:
                classSerialDescriptorBuilder.getClass();
                SerialDescriptor descriptor = kSerializer2.getDescriptor();
                EmptyList emptyList = EmptyList.INSTANCE;
                classSerialDescriptorBuilder.element("first", descriptor, emptyList, false);
                classSerialDescriptorBuilder.element("second", kSerializer.getDescriptor(), emptyList, false);
                break;
            default:
                classSerialDescriptorBuilder.getClass();
                SerialDescriptor descriptor2 = kSerializer2.getDescriptor();
                EmptyList emptyList2 = EmptyList.INSTANCE;
                classSerialDescriptorBuilder.element("key", descriptor2, emptyList2, false);
                classSerialDescriptorBuilder.element("value", kSerializer.getDescriptor(), emptyList2, false);
                break;
        }
        return Unit.INSTANCE;
    }
}
