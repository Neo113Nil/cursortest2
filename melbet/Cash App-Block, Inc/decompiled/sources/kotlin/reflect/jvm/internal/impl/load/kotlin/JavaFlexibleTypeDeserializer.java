package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawTypeImpl;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.FlexibleTypeDeserializer;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;

/* loaded from: classes9.dex */
public final class JavaFlexibleTypeDeserializer implements FlexibleTypeDeserializer {
    public static final JavaFlexibleTypeDeserializer INSTANCE = new JavaFlexibleTypeDeserializer();

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.FlexibleTypeDeserializer
    public KotlinType create(ProtoBuf.Type type2, String str, SimpleType simpleType, SimpleType simpleType2) {
        type2.getClass();
        str.getClass();
        simpleType.getClass();
        simpleType2.getClass();
        return !Intrinsics.areEqual(str, "kotlin.jvm.PlatformType") ? ErrorUtils.createErrorType(ErrorTypeKind.ERROR_FLEXIBLE_TYPE, str, simpleType.toString(), simpleType2.toString()) : type2.hasExtension(JvmProtoBuf.isRaw) ? new RawTypeImpl(simpleType, simpleType2) : KotlinTypeFactory.flexibleType(simpleType, simpleType2);
    }
}
