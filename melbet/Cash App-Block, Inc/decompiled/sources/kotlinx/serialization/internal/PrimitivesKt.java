package kotlinx.serialization.internal;

import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Iterator;
import kotlin.UByte;
import kotlin.UByteArray;
import kotlin.UInt;
import kotlin.UIntArray;
import kotlin.ULong;
import kotlin.ULongArray;
import kotlin.UShort;
import kotlin.UShortArray;
import kotlin.Unit;
import kotlin.collections.builders.MapBuilder;
import kotlin.collections.builders.MapBuilderValues;
import kotlin.jvm.internal.BooleanCompanionObject;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.CharCompanionObject;
import kotlin.jvm.internal.DoubleCompanionObject;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.ShortCompanionObject;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt__IndentKt;
import kotlin.time.Duration;
import kotlin.time.Instant;
import kotlin.uuid.Uuid;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;

/* loaded from: classes3.dex */
public abstract class PrimitivesKt {
    public static final MapBuilder BUILTIN_SERIALIZERS;

    static {
        MapBuilder mapBuilder = new MapBuilder();
        ReflectionFactory reflectionFactory = Reflection.factory;
        mapBuilder.put(reflectionFactory.getOrCreateKotlinClass(String.class), BuiltinSerializersKt.serializer(StringCompanionObject.INSTANCE));
        mapBuilder.put(reflectionFactory.getOrCreateKotlinClass(Character.TYPE), BuiltinSerializersKt.serializer(CharCompanionObject.INSTANCE));
        mapBuilder.put(reflectionFactory.getOrCreateKotlinClass(char[].class), CharArraySerializer.INSTANCE);
        mapBuilder.put(reflectionFactory.getOrCreateKotlinClass(Double.TYPE), BuiltinSerializersKt.serializer(DoubleCompanionObject.INSTANCE));
        mapBuilder.put(reflectionFactory.getOrCreateKotlinClass(double[].class), DoubleArraySerializer.INSTANCE);
        mapBuilder.put(reflectionFactory.getOrCreateKotlinClass(Float.TYPE), BuiltinSerializersKt.serializer(FloatCompanionObject.INSTANCE));
        mapBuilder.put(reflectionFactory.getOrCreateKotlinClass(float[].class), FloatArraySerializer.INSTANCE);
        mapBuilder.put(reflectionFactory.getOrCreateKotlinClass(Long.TYPE), BuiltinSerializersKt.serializer(LongCompanionObject.INSTANCE));
        mapBuilder.put(reflectionFactory.getOrCreateKotlinClass(long[].class), LongArraySerializer.INSTANCE);
        mapBuilder.put(reflectionFactory.getOrCreateKotlinClass(ULong.class), BuiltinSerializersKt.serializer(ULong.Companion));
        mapBuilder.put(reflectionFactory.getOrCreateKotlinClass(Integer.TYPE), BuiltinSerializersKt.serializer(IntCompanionObject.INSTANCE));
        mapBuilder.put(reflectionFactory.getOrCreateKotlinClass(int[].class), IntArraySerializer.INSTANCE);
        mapBuilder.put(reflectionFactory.getOrCreateKotlinClass(UInt.class), BuiltinSerializersKt.serializer(UInt.Companion));
        mapBuilder.put(reflectionFactory.getOrCreateKotlinClass(Short.TYPE), BuiltinSerializersKt.serializer(ShortCompanionObject.INSTANCE));
        mapBuilder.put(reflectionFactory.getOrCreateKotlinClass(short[].class), ShortArraySerializer.INSTANCE);
        mapBuilder.put(reflectionFactory.getOrCreateKotlinClass(UShort.class), BuiltinSerializersKt.serializer(UShort.Companion));
        mapBuilder.put(reflectionFactory.getOrCreateKotlinClass(Byte.TYPE), BuiltinSerializersKt.serializer(ByteCompanionObject.INSTANCE));
        mapBuilder.put(reflectionFactory.getOrCreateKotlinClass(byte[].class), ByteArraySerializer.INSTANCE);
        mapBuilder.put(reflectionFactory.getOrCreateKotlinClass(UByte.class), BuiltinSerializersKt.serializer(UByte.Companion));
        mapBuilder.put(reflectionFactory.getOrCreateKotlinClass(Boolean.TYPE), BuiltinSerializersKt.serializer(BooleanCompanionObject.INSTANCE));
        mapBuilder.put(reflectionFactory.getOrCreateKotlinClass(boolean[].class), BooleanArraySerializer.INSTANCE);
        mapBuilder.put(reflectionFactory.getOrCreateKotlinClass(Unit.class), BuiltinSerializersKt.serializer(Unit.INSTANCE));
        mapBuilder.put(reflectionFactory.getOrCreateKotlinClass(Void.class), NothingSerializer.INSTANCE);
        try {
            mapBuilder.put(reflectionFactory.getOrCreateKotlinClass(Duration.class), BuiltinSerializersKt.serializer(Duration.Companion));
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        try {
            mapBuilder.put(Reflection.factory.getOrCreateKotlinClass(ULongArray.class), ULongArraySerializer.INSTANCE);
        } catch (ClassNotFoundException | NoClassDefFoundError unused2) {
        }
        try {
            mapBuilder.put(Reflection.factory.getOrCreateKotlinClass(UIntArray.class), UIntArraySerializer.INSTANCE);
        } catch (ClassNotFoundException | NoClassDefFoundError unused3) {
        }
        try {
            mapBuilder.put(Reflection.factory.getOrCreateKotlinClass(UShortArray.class), UShortArraySerializer.INSTANCE);
        } catch (ClassNotFoundException | NoClassDefFoundError unused4) {
        }
        try {
            mapBuilder.put(Reflection.factory.getOrCreateKotlinClass(UByteArray.class), UByteArraySerializer.INSTANCE);
        } catch (ClassNotFoundException | NoClassDefFoundError unused5) {
        }
        try {
            mapBuilder.put(Reflection.factory.getOrCreateKotlinClass(Uuid.class), BuiltinSerializersKt.serializer(Uuid.Companion));
        } catch (ClassNotFoundException | NoClassDefFoundError unused6) {
        }
        try {
            mapBuilder.put(Reflection.factory.getOrCreateKotlinClass(Instant.class), BuiltinSerializersKt.serializer(Instant.Companion));
        } catch (ClassNotFoundException | NoClassDefFoundError unused7) {
        }
        BUILTIN_SERIALIZERS = mapBuilder.build();
    }

    public static final void checkNameIsNotAPrimitive(String str) {
        Iterator it = ((MapBuilderValues) BUILTIN_SERIALIZERS.values()).iterator();
        while (it.hasNext()) {
            KSerializer kSerializer = (KSerializer) it.next();
            if (str.equals(kSerializer.getDescriptor().getSerialName())) {
                StringBuilder m3m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m3m("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name ", str, " there already exists ");
                m3m.append(Reflection.factory.getOrCreateKotlinClass(kSerializer.getClass()).getSimpleName());
                m3m.append(".\n                Please refer to SerialDescriptor documentation for additional information.\n            ");
                a$$ExternalSyntheticBUOutline0.m$3(StringsKt__IndentKt.replaceIndent(m3m.toString()));
                return;
            }
        }
    }
}
