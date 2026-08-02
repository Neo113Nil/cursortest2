package kotlinx.serialization;

import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.StringCompanionObject;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind$CONTEXTUAL;
import okhttp3.internal.Tags;

/* loaded from: classes9.dex */
public final /* synthetic */ class SealedClassSerializer$$ExternalSyntheticLambda1 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ SealedClassSerializer f$0;

    public /* synthetic */ SealedClassSerializer$$ExternalSyntheticLambda1(SealedClassSerializer sealedClassSerializer, int i) {
        this.$r8$classId = i;
        this.f$0 = sealedClassSerializer;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        SealedClassSerializer sealedClassSerializer = this.f$0;
        ClassSerialDescriptorBuilder classSerialDescriptorBuilder = (ClassSerialDescriptorBuilder) obj;
        switch (i) {
            case 0:
                classSerialDescriptorBuilder.getClass();
                SerialDescriptor descriptor = BuiltinSerializersKt.serializer(StringCompanionObject.INSTANCE).getDescriptor();
                EmptyList emptyList = EmptyList.INSTANCE;
                classSerialDescriptorBuilder.element("type", descriptor, emptyList, false);
                classSerialDescriptorBuilder.element("value", Tags.buildSerialDescriptor("kotlinx.serialization.Sealed<" + sealedClassSerializer.baseClass.getSimpleName() + '>', SerialKind$CONTEXTUAL.INSTANCE, new SerialDescriptor[0], new SealedClassSerializer$$ExternalSyntheticLambda1(sealedClassSerializer, 1)), emptyList, false);
                List list = sealedClassSerializer._annotations;
                list.getClass();
                classSerialDescriptorBuilder.annotations = list;
                break;
            default:
                classSerialDescriptorBuilder.getClass();
                for (Map.Entry entry : sealedClassSerializer.serialName2Serializer.entrySet()) {
                    classSerialDescriptorBuilder.element((String) entry.getKey(), ((KSerializer) entry.getValue()).getDescriptor(), EmptyList.INSTANCE, false);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
