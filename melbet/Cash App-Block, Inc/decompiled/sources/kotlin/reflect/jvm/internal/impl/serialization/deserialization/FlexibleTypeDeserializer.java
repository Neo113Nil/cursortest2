package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;

/* loaded from: classes9.dex */
public interface FlexibleTypeDeserializer {

    public static final class ThrowException implements FlexibleTypeDeserializer {
        public static final ThrowException INSTANCE = new ThrowException();

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.FlexibleTypeDeserializer
        public KotlinType create(ProtoBuf.Type type2, String str, SimpleType simpleType, SimpleType simpleType2) {
            type2.getClass();
            str.getClass();
            simpleType.getClass();
            simpleType2.getClass();
            throw new IllegalArgumentException("This method should not be used.");
        }
    }

    KotlinType create(ProtoBuf.Type type2, String str, SimpleType simpleType, SimpleType simpleType2);
}
