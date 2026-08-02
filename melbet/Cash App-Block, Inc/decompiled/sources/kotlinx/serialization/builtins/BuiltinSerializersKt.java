package kotlinx.serialization.builtins;

import kotlin.Metadata;
import kotlin.UByte;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.UShort;
import kotlin.Unit;
import kotlin.jvm.internal.BooleanCompanionObject;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.CharCompanionObject;
import kotlin.jvm.internal.DoubleCompanionObject;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.jvm.internal.ShortCompanionObject;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.time.Duration;
import kotlin.time.Instant;
import kotlin.uuid.Uuid;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.ByteSerializer;
import kotlinx.serialization.internal.CharSerializer;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.DurationSerializer;
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.HashMapSerializer;
import kotlinx.serialization.internal.InstantSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.NullableSerializer;
import kotlinx.serialization.internal.ShortSerializer;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.internal.UByteSerializer;
import kotlinx.serialization.internal.UIntSerializer;
import kotlinx.serialization.internal.ULongSerializer;
import kotlinx.serialization.internal.UShortSerializer;
import kotlinx.serialization.internal.UnitSerializer;
import kotlinx.serialization.internal.UuidSerializer;

@Metadata(d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001*\u00020\u0005¢\u0006\u0004\b\u0003\u0010\u0007\u001a\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\t0\u0001*\u00020\b¢\u0006\u0004\b\u0003\u0010\n\u001a\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\f0\u0001*\u00020\u000b¢\u0006\u0004\b\u0003\u0010\r\u001a\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0001*\u00020\u000e¢\u0006\u0004\b\u0003\u0010\u0010\u001a\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00120\u0001*\u00020\u0011¢\u0006\u0004\b\u0003\u0010\u0013\u001a\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00150\u0001*\u00020\u0014¢\u0006\u0004\b\u0003\u0010\u0016\u001a\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00180\u0001*\u00020\u0017¢\u0006\u0004\b\u0003\u0010\u0019\u001a\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0001*\u00020\u001a¢\u0006\u0004\b\u0003\u0010\u001b\u001a\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0001*\u00020\u001c¢\u0006\u0004\b\u0003\u0010\u001e\u001a\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020 0\u0001*\u00020\u001f¢\u0006\u0004\b\u0003\u0010!\u001a\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020#0\u0001*\u00020\"¢\u0006\u0004\b\u0003\u0010$\u001a\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020&0\u0001*\u00020%¢\u0006\u0004\b\u0003\u0010'\u001a\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020)0\u0001*\u00020(¢\u0006\u0004\b\u0003\u0010*\u001a\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020,0\u0001*\u00020+¢\u0006\u0004\b\u0003\u0010-\u001a\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020/0\u0001*\u00020.H\u0007¢\u0006\u0004\b\u0003\u00100\u001a\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002020\u0001*\u000201H\u0007¢\u0006\u0004\b\u0003\u00103¨\u00064"}, d2 = {"Lkotlin/Char$Companion;", "Lkotlinx/serialization/KSerializer;", "", "serializer", "(Lkotlin/jvm/internal/CharCompanionObject;)Lkotlinx/serialization/KSerializer;", "Lkotlin/Byte$Companion;", "", "(Lkotlin/jvm/internal/ByteCompanionObject;)Lkotlinx/serialization/KSerializer;", "Lkotlin/Short$Companion;", "", "(Lkotlin/jvm/internal/ShortCompanionObject;)Lkotlinx/serialization/KSerializer;", "Lkotlin/Int$Companion;", "", "(Lkotlin/jvm/internal/IntCompanionObject;)Lkotlinx/serialization/KSerializer;", "Lkotlin/Long$Companion;", "", "(Lkotlin/jvm/internal/LongCompanionObject;)Lkotlinx/serialization/KSerializer;", "Lkotlin/Float$Companion;", "", "(Lkotlin/jvm/internal/FloatCompanionObject;)Lkotlinx/serialization/KSerializer;", "Lkotlin/Double$Companion;", "", "(Lkotlin/jvm/internal/DoubleCompanionObject;)Lkotlinx/serialization/KSerializer;", "Lkotlin/Boolean$Companion;", "", "(Lkotlin/jvm/internal/BooleanCompanionObject;)Lkotlinx/serialization/KSerializer;", "", "(Lkotlin/Unit;)Lkotlinx/serialization/KSerializer;", "Lkotlin/String$Companion;", "", "(Lkotlin/jvm/internal/StringCompanionObject;)Lkotlinx/serialization/KSerializer;", "Lkotlin/UInt$Companion;", "Lkotlin/UInt;", "(Lkotlin/UInt$Companion;)Lkotlinx/serialization/KSerializer;", "Lkotlin/ULong$Companion;", "Lkotlin/ULong;", "(Lkotlin/ULong$Companion;)Lkotlinx/serialization/KSerializer;", "Lkotlin/UByte$Companion;", "Lkotlin/UByte;", "(Lkotlin/UByte$Companion;)Lkotlinx/serialization/KSerializer;", "Lkotlin/UShort$Companion;", "Lkotlin/UShort;", "(Lkotlin/UShort$Companion;)Lkotlinx/serialization/KSerializer;", "Lkotlin/time/Duration$Companion;", "Lkotlin/time/Duration;", "(Lkotlin/time/Duration$Companion;)Lkotlinx/serialization/KSerializer;", "Lkotlin/time/Instant$Companion;", "Lkotlin/time/Instant;", "(Lkotlin/time/Instant$Companion;)Lkotlinx/serialization/KSerializer;", "Lkotlin/uuid/Uuid$Companion;", "Lkotlin/uuid/Uuid;", "(Lkotlin/uuid/Uuid$Companion;)Lkotlinx/serialization/KSerializer;", "kotlinx-serialization-core"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BuiltinSerializersKt {
    public static final HashMapSerializer MapSerializer(KSerializer kSerializer, KSerializer kSerializer2) {
        kSerializer.getClass();
        kSerializer2.getClass();
        return new HashMapSerializer(kSerializer, kSerializer2, 1);
    }

    public static final KSerializer getNullable(KSerializer kSerializer) {
        kSerializer.getClass();
        return kSerializer.getDescriptor().isNullable() ? kSerializer : new NullableSerializer(kSerializer);
    }

    public static final KSerializer serializer(CharCompanionObject charCompanionObject) {
        charCompanionObject.getClass();
        return CharSerializer.INSTANCE;
    }

    public static final KSerializer serializer(ByteCompanionObject byteCompanionObject) {
        byteCompanionObject.getClass();
        return ByteSerializer.INSTANCE;
    }

    public static final KSerializer serializer(ShortCompanionObject shortCompanionObject) {
        shortCompanionObject.getClass();
        return ShortSerializer.INSTANCE;
    }

    public static final KSerializer serializer(IntCompanionObject intCompanionObject) {
        intCompanionObject.getClass();
        return IntSerializer.INSTANCE;
    }

    public static final KSerializer serializer(LongCompanionObject longCompanionObject) {
        longCompanionObject.getClass();
        return LongSerializer.INSTANCE;
    }

    public static final KSerializer serializer(FloatCompanionObject floatCompanionObject) {
        floatCompanionObject.getClass();
        return FloatSerializer.INSTANCE;
    }

    public static final KSerializer serializer(DoubleCompanionObject doubleCompanionObject) {
        doubleCompanionObject.getClass();
        return DoubleSerializer.INSTANCE;
    }

    public static final KSerializer serializer(BooleanCompanionObject booleanCompanionObject) {
        booleanCompanionObject.getClass();
        return BooleanSerializer.INSTANCE;
    }

    public static final KSerializer serializer(Unit unit) {
        unit.getClass();
        return UnitSerializer.INSTANCE;
    }

    public static final KSerializer serializer(StringCompanionObject stringCompanionObject) {
        stringCompanionObject.getClass();
        return StringSerializer.INSTANCE;
    }

    public static final KSerializer serializer(UInt.Companion companion) {
        companion.getClass();
        return UIntSerializer.INSTANCE;
    }

    public static final KSerializer serializer(ULong.Companion companion) {
        companion.getClass();
        return ULongSerializer.INSTANCE;
    }

    public static final KSerializer serializer(UByte.Companion companion) {
        companion.getClass();
        return UByteSerializer.INSTANCE;
    }

    public static final KSerializer serializer(UShort.Companion companion) {
        companion.getClass();
        return UShortSerializer.INSTANCE;
    }

    public static final KSerializer serializer(Duration.Companion companion) {
        companion.getClass();
        return DurationSerializer.INSTANCE;
    }

    public static final KSerializer serializer(Instant.Companion companion) {
        companion.getClass();
        return InstantSerializer.INSTANCE;
    }

    public static final KSerializer serializer(Uuid.Companion companion) {
        companion.getClass();
        return UuidSerializer.INSTANCE;
    }
}
