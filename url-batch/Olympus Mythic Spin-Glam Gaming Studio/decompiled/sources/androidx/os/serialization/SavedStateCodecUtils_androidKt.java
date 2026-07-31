package androidx.os.serialization;

import android.os.IBinder;
import android.os.Parcelable;
import androidx.os.serialization.serializers.CharSequenceSerializer;
import androidx.os.serialization.serializers.DefaultParcelableSerializer;
import androidx.os.serialization.serializers.SparseArraySerializer;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.PolymorphicSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: SavedStateCodecUtils.android.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b&\"\u001a\u0010\u0001\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004\"\u001a\u0010\u0005\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0004\"\u001a\u0010\u0007\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0002\u001a\u0004\b\b\u0010\u0004\"\u001a\u0010\t\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\u0002\u001a\u0004\b\n\u0010\u0004\" \u0010\u000b\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010\u0002\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\f\u0010\u0004\" \u0010\u000f\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010\u0002\u0012\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0010\u0010\u0004\"\u001a\u0010\u0012\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0002\u001a\u0004\b\u0013\u0010\u0004\"\u001a\u0010\u0014\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0002\u001a\u0004\b\u0015\u0010\u0004\" \u0010\u0016\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\u0002\u0012\u0004\b\u0018\u0010\u000e\u001a\u0004\b\u0017\u0010\u0004\" \u0010\u0019\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010\u0002\u0012\u0004\b\u001b\u0010\u000e\u001a\u0004\b\u001a\u0010\u0004\"\u001a\u0010\u001c\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0002\u001a\u0004\b\u001d\u0010\u0004\"\u001a\u0010\u001e\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0002\u001a\u0004\b\u001f\u0010\u0004\"\u001a\u0010 \u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b \u0010\u0002\u001a\u0004\b!\u0010\u0004\"\u001a\u0010\"\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\"\u0010\u0002\u001a\u0004\b#\u0010\u0004\"\u001a\u0010$\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b$\u0010\u0002\u001a\u0004\b%\u0010\u0004¨\u0006&"}, d2 = {"Lkotlinx/serialization/descriptors/SerialDescriptor;", "polymorphicCharSequenceDescriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getPolymorphicCharSequenceDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "polymorphicParcelableDescriptor", "getPolymorphicParcelableDescriptor", "polymorphicJavaSerializableDescriptor", "getPolymorphicJavaSerializableDescriptor", "polymorphicIBinderDescriptor", "getPolymorphicIBinderDescriptor", "parcelableArrayDescriptor", "getParcelableArrayDescriptor", "getParcelableArrayDescriptor$annotations", "()V", "polymorphicParcelableArrayDescriptor", "getPolymorphicParcelableArrayDescriptor", "getPolymorphicParcelableArrayDescriptor$annotations", "parcelableListDescriptor", "getParcelableListDescriptor", "polymorphicParcelableListDescriptor", "getPolymorphicParcelableListDescriptor", "charSequenceArrayDescriptor", "getCharSequenceArrayDescriptor", "getCharSequenceArrayDescriptor$annotations", "polymorphicCharSequenceArrayDescriptor", "getPolymorphicCharSequenceArrayDescriptor", "getPolymorphicCharSequenceArrayDescriptor$annotations", "charSequenceListDescriptor", "getCharSequenceListDescriptor", "polymorphicCharSequenceListDescriptor", "getPolymorphicCharSequenceListDescriptor", "sparseParcelableArrayDescriptor", "getSparseParcelableArrayDescriptor", "polymorphicSparseParcelableArrayDescriptor", "getPolymorphicSparseParcelableArrayDescriptor", "nullablePolymorphicSparseParcelableArrayDescriptor", "getNullablePolymorphicSparseParcelableArrayDescriptor", "savedstate"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SavedStateCodecUtils_androidKt {
    private static final SerialDescriptor charSequenceArrayDescriptor;
    private static final SerialDescriptor charSequenceListDescriptor;
    private static final SerialDescriptor nullablePolymorphicSparseParcelableArrayDescriptor;
    private static final SerialDescriptor parcelableArrayDescriptor;
    private static final SerialDescriptor parcelableListDescriptor;
    private static final SerialDescriptor polymorphicCharSequenceArrayDescriptor;
    private static final SerialDescriptor polymorphicCharSequenceListDescriptor;
    private static final SerialDescriptor polymorphicParcelableArrayDescriptor;
    private static final SerialDescriptor polymorphicParcelableListDescriptor;
    private static final SerialDescriptor polymorphicSparseParcelableArrayDescriptor;
    private static final SerialDescriptor sparseParcelableArrayDescriptor;
    private static final SerialDescriptor polymorphicCharSequenceDescriptor = new PolymorphicSerializer(Reflection.getOrCreateKotlinClass(CharSequence.class)).getDescriptor();
    private static final SerialDescriptor polymorphicParcelableDescriptor = new PolymorphicSerializer(Reflection.getOrCreateKotlinClass(Parcelable.class)).getDescriptor();
    private static final SerialDescriptor polymorphicJavaSerializableDescriptor = new PolymorphicSerializer(Reflection.getOrCreateKotlinClass(Serializable.class)).getDescriptor();
    private static final SerialDescriptor polymorphicIBinderDescriptor = new PolymorphicSerializer(Reflection.getOrCreateKotlinClass(IBinder.class)).getDescriptor();

    public static final SerialDescriptor getPolymorphicCharSequenceDescriptor() {
        return polymorphicCharSequenceDescriptor;
    }

    static {
        DefaultParcelableSerializer defaultParcelableSerializer = DefaultParcelableSerializer.INSTANCE;
        parcelableArrayDescriptor = BuiltinSerializersKt.ArraySerializer(Reflection.getOrCreateKotlinClass(Parcelable.class), defaultParcelableSerializer).getDescriptor();
        polymorphicParcelableArrayDescriptor = BuiltinSerializersKt.ArraySerializer(Reflection.getOrCreateKotlinClass(Parcelable.class), new PolymorphicSerializer(Reflection.getOrCreateKotlinClass(Parcelable.class))).getDescriptor();
        parcelableListDescriptor = BuiltinSerializersKt.ListSerializer(defaultParcelableSerializer).getDescriptor();
        polymorphicParcelableListDescriptor = BuiltinSerializersKt.ListSerializer(new PolymorphicSerializer(Reflection.getOrCreateKotlinClass(Parcelable.class))).getDescriptor();
        CharSequenceSerializer charSequenceSerializer = CharSequenceSerializer.INSTANCE;
        charSequenceArrayDescriptor = BuiltinSerializersKt.ArraySerializer(Reflection.getOrCreateKotlinClass(CharSequence.class), charSequenceSerializer).getDescriptor();
        polymorphicCharSequenceArrayDescriptor = BuiltinSerializersKt.ArraySerializer(Reflection.getOrCreateKotlinClass(CharSequence.class), new PolymorphicSerializer(Reflection.getOrCreateKotlinClass(CharSequence.class))).getDescriptor();
        charSequenceListDescriptor = BuiltinSerializersKt.ListSerializer(charSequenceSerializer).getDescriptor();
        polymorphicCharSequenceListDescriptor = BuiltinSerializersKt.ListSerializer(new PolymorphicSerializer(Reflection.getOrCreateKotlinClass(CharSequence.class))).getDescriptor();
        sparseParcelableArrayDescriptor = new SparseArraySerializer(defaultParcelableSerializer).getDescriptor();
        polymorphicSparseParcelableArrayDescriptor = new SparseArraySerializer(new PolymorphicSerializer(Reflection.getOrCreateKotlinClass(Parcelable.class))).getDescriptor();
        nullablePolymorphicSparseParcelableArrayDescriptor = new SparseArraySerializer(BuiltinSerializersKt.getNullable(new PolymorphicSerializer(Reflection.getOrCreateKotlinClass(Parcelable.class)))).getDescriptor();
    }

    public static final SerialDescriptor getPolymorphicParcelableDescriptor() {
        return polymorphicParcelableDescriptor;
    }

    public static final SerialDescriptor getPolymorphicJavaSerializableDescriptor() {
        return polymorphicJavaSerializableDescriptor;
    }

    public static final SerialDescriptor getPolymorphicIBinderDescriptor() {
        return polymorphicIBinderDescriptor;
    }

    public static final SerialDescriptor getParcelableArrayDescriptor() {
        return parcelableArrayDescriptor;
    }

    public static final SerialDescriptor getPolymorphicParcelableArrayDescriptor() {
        return polymorphicParcelableArrayDescriptor;
    }

    public static final SerialDescriptor getParcelableListDescriptor() {
        return parcelableListDescriptor;
    }

    public static final SerialDescriptor getPolymorphicParcelableListDescriptor() {
        return polymorphicParcelableListDescriptor;
    }

    public static final SerialDescriptor getCharSequenceArrayDescriptor() {
        return charSequenceArrayDescriptor;
    }

    public static final SerialDescriptor getPolymorphicCharSequenceArrayDescriptor() {
        return polymorphicCharSequenceArrayDescriptor;
    }

    public static final SerialDescriptor getCharSequenceListDescriptor() {
        return charSequenceListDescriptor;
    }

    public static final SerialDescriptor getPolymorphicCharSequenceListDescriptor() {
        return polymorphicCharSequenceListDescriptor;
    }

    public static final SerialDescriptor getSparseParcelableArrayDescriptor() {
        return sparseParcelableArrayDescriptor;
    }

    public static final SerialDescriptor getPolymorphicSparseParcelableArrayDescriptor() {
        return polymorphicSparseParcelableArrayDescriptor;
    }

    public static final SerialDescriptor getNullablePolymorphicSparseParcelableArrayDescriptor() {
        return nullablePolymorphicSparseParcelableArrayDescriptor;
    }
}
