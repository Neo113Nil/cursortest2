package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer;

/* loaded from: classes9.dex */
public final /* synthetic */ class DeserializedClassDescriptor$computeValueClassRepresentation$1 extends AdaptedFunctionReference implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ProtoBuf.Type type2 = (ProtoBuf.Type) obj;
        type2.getClass();
        return TypeDeserializer.simpleType$default((TypeDeserializer) this.receiver, type2, false, 2, null);
    }
}
