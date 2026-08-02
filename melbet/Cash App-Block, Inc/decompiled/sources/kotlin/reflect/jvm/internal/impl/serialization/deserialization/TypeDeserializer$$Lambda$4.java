package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;

/* loaded from: classes9.dex */
public final class TypeDeserializer$$Lambda$4 implements Function1 {
    public static final TypeDeserializer$$Lambda$4 INSTANCE = new TypeDeserializer$$Lambda$4();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ProtoBuf.Type type2 = (ProtoBuf.Type) obj;
        type2.getClass();
        return Integer.valueOf(type2.getArgumentCount());
    }
}
