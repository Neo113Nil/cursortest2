package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;

/* loaded from: classes9.dex */
public final class MemberDeserializer$$Lambda$2 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final MemberDeserializer arg$0;
    public final MessageLite arg$1;
    public final AnnotatedCallableKind arg$2;

    public /* synthetic */ MemberDeserializer$$Lambda$2(MemberDeserializer memberDeserializer, MessageLite messageLite, AnnotatedCallableKind annotatedCallableKind, int i) {
        this.$r8$classId = i;
        this.arg$0 = memberDeserializer;
        this.arg$1 = messageLite;
        this.arg$2 = annotatedCallableKind;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        List<AnnotationDescriptor> list;
        int i = this.$r8$classId;
        AnnotatedCallableKind annotatedCallableKind = this.arg$2;
        MessageLite messageLite = this.arg$1;
        MemberDeserializer memberDeserializer = this.arg$0;
        switch (i) {
            case 0:
                DeserializationContext deserializationContext = memberDeserializer.c;
                ProtoContainer asProtoContainer = memberDeserializer.asProtoContainer(deserializationContext.getContainingDeclaration());
                list = asProtoContainer != null ? CollectionsKt.toList(deserializationContext.getComponents().getAnnotationAndConstantLoader().loadCallableAnnotations(asProtoContainer, messageLite, annotatedCallableKind)) : null;
                if (list == null) {
                    break;
                }
                break;
            default:
                DeserializationContext deserializationContext2 = memberDeserializer.c;
                ProtoContainer asProtoContainer2 = memberDeserializer.asProtoContainer(deserializationContext2.getContainingDeclaration());
                list = asProtoContainer2 != null ? deserializationContext2.getComponents().getAnnotationAndConstantLoader().loadExtensionReceiverParameterAnnotations(asProtoContainer2, messageLite, annotatedCallableKind) : null;
                if (list == null) {
                    break;
                }
                break;
        }
        return EmptyList.INSTANCE;
    }
}
