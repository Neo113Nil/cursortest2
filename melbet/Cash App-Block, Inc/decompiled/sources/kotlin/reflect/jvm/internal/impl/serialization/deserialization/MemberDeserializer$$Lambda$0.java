package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* loaded from: classes9.dex */
public final class MemberDeserializer$$Lambda$0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final MemberDeserializer arg$0;
    public final ProtoBuf.Property arg$1;
    public final DeserializedPropertyDescriptor arg$2;

    public /* synthetic */ MemberDeserializer$$Lambda$0(MemberDeserializer memberDeserializer, ProtoBuf.Property property, DeserializedPropertyDescriptor deserializedPropertyDescriptor, int i) {
        this.$r8$classId = i;
        this.arg$0 = memberDeserializer;
        this.arg$1 = property;
        this.arg$2 = deserializedPropertyDescriptor;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        DeserializedPropertyDescriptor deserializedPropertyDescriptor = this.arg$2;
        ProtoBuf.Property property = this.arg$1;
        MemberDeserializer memberDeserializer = this.arg$0;
        switch (i) {
            case 0:
                return memberDeserializer.c.getStorageManager().createNullableLazyValue(new MemberDeserializer$$Lambda$0(memberDeserializer, property, deserializedPropertyDescriptor, 2));
            case 1:
                return memberDeserializer.c.getStorageManager().createNullableLazyValue(new MemberDeserializer$$Lambda$0(memberDeserializer, property, deserializedPropertyDescriptor, 3));
            case 2:
                DeserializationContext deserializationContext = memberDeserializer.c;
                ProtoContainer asProtoContainer = memberDeserializer.asProtoContainer(deserializationContext.getContainingDeclaration());
                asProtoContainer.getClass();
                AnnotationAndConstantLoader<AnnotationDescriptor, ConstantValue<?>> annotationAndConstantLoader = deserializationContext.getComponents().getAnnotationAndConstantLoader();
                KotlinType returnType = deserializedPropertyDescriptor.getReturnType();
                returnType.getClass();
                return annotationAndConstantLoader.loadPropertyConstant(asProtoContainer, property, returnType);
            default:
                DeserializationContext deserializationContext2 = memberDeserializer.c;
                ProtoContainer asProtoContainer2 = memberDeserializer.asProtoContainer(deserializationContext2.getContainingDeclaration());
                asProtoContainer2.getClass();
                AnnotationAndConstantLoader<AnnotationDescriptor, ConstantValue<?>> annotationAndConstantLoader2 = deserializationContext2.getComponents().getAnnotationAndConstantLoader();
                KotlinType returnType2 = deserializedPropertyDescriptor.getReturnType();
                returnType2.getClass();
                return annotationAndConstantLoader2.loadAnnotationDefaultValue(asProtoContainer2, property, returnType2);
        }
    }
}
