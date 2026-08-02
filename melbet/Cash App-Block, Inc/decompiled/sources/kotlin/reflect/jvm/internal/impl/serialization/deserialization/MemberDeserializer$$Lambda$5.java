package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;

/* loaded from: classes9.dex */
public final class MemberDeserializer$$Lambda$5 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final MemberDeserializer arg$0;
    public final ProtoContainer arg$1;
    public final MessageLite arg$2;
    public final AnnotatedCallableKind arg$3;
    public final int arg$4;
    public final ProtoBuf.ValueParameter arg$5;

    public /* synthetic */ MemberDeserializer$$Lambda$5(MemberDeserializer memberDeserializer, ProtoContainer protoContainer, MessageLite messageLite, AnnotatedCallableKind annotatedCallableKind, int i, ProtoBuf.ValueParameter valueParameter, int i2) {
        this.$r8$classId = i2;
        this.arg$0 = memberDeserializer;
        this.arg$1 = protoContainer;
        this.arg$2 = messageLite;
        this.arg$3 = annotatedCallableKind;
        this.arg$4 = i;
        this.arg$5 = valueParameter;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        MemberDeserializer memberDeserializer = this.arg$0;
        switch (i) {
            case 0:
                return CollectionsKt.toList(memberDeserializer.c.getComponents().getAnnotationAndConstantLoader().loadValueParameterAnnotations(this.arg$1, this.arg$2, this.arg$3, this.arg$4, this.arg$5));
            default:
                return CollectionsKt.toList(memberDeserializer.c.getComponents().getAnnotationAndConstantLoader().loadContextParameterAnnotations(this.arg$1, this.arg$2, this.arg$3, this.arg$4, this.arg$5));
        }
    }
}
