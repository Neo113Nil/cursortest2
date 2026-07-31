package androidx.os.serialization;

import kotlin.Metadata;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.StringCompanionObject;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: SavedStateCodecUtils.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0017\"\u001a\u0010\u0001\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004\"\u001a\u0010\u0005\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0004\"\u001a\u0010\u0007\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0002\u001a\u0004\b\b\u0010\u0004\"\u001a\u0010\t\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\u0002\u001a\u0004\b\n\u0010\u0004\"\u001a\u0010\u000b\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0002\u001a\u0004\b\f\u0010\u0004\"\u001a\u0010\r\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\u0002\u001a\u0004\b\u000e\u0010\u0004\"\u001a\u0010\u000f\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0002\u001a\u0004\b\u0010\u0010\u0004\"\u001a\u0010\u0011\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0002\u001a\u0004\b\u0012\u0010\u0004\" \u0010\u0013\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010\u0002\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0014\u0010\u0004¨\u0006\u0017"}, d2 = {"Lkotlinx/serialization/descriptors/SerialDescriptor;", "intListDescriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getIntListDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "stringListDescriptor", "getStringListDescriptor", "booleanArrayDescriptor", "getBooleanArrayDescriptor", "charArrayDescriptor", "getCharArrayDescriptor", "doubleArrayDescriptor", "getDoubleArrayDescriptor", "floatArrayDescriptor", "getFloatArrayDescriptor", "intArrayDescriptor", "getIntArrayDescriptor", "longArrayDescriptor", "getLongArrayDescriptor", "stringArrayDescriptor", "getStringArrayDescriptor", "getStringArrayDescriptor$annotations", "()V", "savedstate"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SavedStateCodecUtilsKt {
    private static final SerialDescriptor booleanArrayDescriptor;
    private static final SerialDescriptor charArrayDescriptor;
    private static final SerialDescriptor doubleArrayDescriptor;
    private static final SerialDescriptor floatArrayDescriptor;
    private static final SerialDescriptor intArrayDescriptor;
    private static final SerialDescriptor intListDescriptor = BuiltinSerializersKt.ListSerializer(BuiltinSerializersKt.serializer(IntCompanionObject.INSTANCE)).getDescriptor();
    private static final SerialDescriptor longArrayDescriptor;
    private static final SerialDescriptor stringArrayDescriptor;
    private static final SerialDescriptor stringListDescriptor;

    static {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        stringListDescriptor = BuiltinSerializersKt.ListSerializer(BuiltinSerializersKt.serializer(stringCompanionObject)).getDescriptor();
        booleanArrayDescriptor = BuiltinSerializersKt.BooleanArraySerializer().getDescriptor();
        charArrayDescriptor = BuiltinSerializersKt.CharArraySerializer().getDescriptor();
        doubleArrayDescriptor = BuiltinSerializersKt.DoubleArraySerializer().getDescriptor();
        floatArrayDescriptor = BuiltinSerializersKt.FloatArraySerializer().getDescriptor();
        intArrayDescriptor = BuiltinSerializersKt.IntArraySerializer().getDescriptor();
        longArrayDescriptor = BuiltinSerializersKt.LongArraySerializer().getDescriptor();
        stringArrayDescriptor = BuiltinSerializersKt.ArraySerializer(Reflection.getOrCreateKotlinClass(String.class), BuiltinSerializersKt.serializer(stringCompanionObject)).getDescriptor();
    }

    public static final SerialDescriptor getIntListDescriptor() {
        return intListDescriptor;
    }

    public static final SerialDescriptor getStringListDescriptor() {
        return stringListDescriptor;
    }

    public static final SerialDescriptor getBooleanArrayDescriptor() {
        return booleanArrayDescriptor;
    }

    public static final SerialDescriptor getCharArrayDescriptor() {
        return charArrayDescriptor;
    }

    public static final SerialDescriptor getDoubleArrayDescriptor() {
        return doubleArrayDescriptor;
    }

    public static final SerialDescriptor getFloatArrayDescriptor() {
        return floatArrayDescriptor;
    }

    public static final SerialDescriptor getIntArrayDescriptor() {
        return intArrayDescriptor;
    }

    public static final SerialDescriptor getLongArrayDescriptor() {
        return longArrayDescriptor;
    }

    public static final SerialDescriptor getStringArrayDescriptor() {
        return stringArrayDescriptor;
    }
}
