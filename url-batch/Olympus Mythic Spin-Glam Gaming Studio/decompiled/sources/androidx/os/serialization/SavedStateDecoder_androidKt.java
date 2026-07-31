package androidx.os.serialization;

import android.os.Parcelable;
import androidx.os.serialization.serializers.CharSequenceArraySerializer;
import androidx.os.serialization.serializers.CharSequenceListSerializer;
import androidx.os.serialization.serializers.CharSequenceSerializer;
import androidx.os.serialization.serializers.DefaultJavaSerializableSerializer;
import androidx.os.serialization.serializers.DefaultParcelableSerializer;
import androidx.os.serialization.serializers.IBinderSerializer;
import androidx.os.serialization.serializers.ParcelableArraySerializer;
import androidx.os.serialization.serializers.ParcelableListSerializer;
import androidx.os.serialization.serializers.SparseParcelableArraySerializer;
import com.ironsource.X3;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;

/* compiled from: SavedStateDecoder.android.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\u001a'\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0004H\u0000¢\u0006\u0002\u0010\u0005\u001a$\u0010\u0006\u001a\u0012\u0012\u000e\u0012\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\t0\b0\u00072\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0002¨\u0006\u000b"}, d2 = {"decodeFormatSpecificTypesOnPlatform", "T", "Landroidx/savedstate/serialization/SavedStateDecoder;", X3.f.e, "Lkotlinx/serialization/DeserializationStrategy;", "(Landroidx/savedstate/serialization/SavedStateDecoder;Lkotlinx/serialization/DeserializationStrategy;)Ljava/lang/Object;", "getArrayKClass", "Lkotlin/reflect/KClass;", "", "", "referenceArraySerializer", "savedstate"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SavedStateDecoder_androidKt {
    public static final Object decodeFormatSpecificTypesOnPlatform(SavedStateDecoder savedStateDecoder, DeserializationStrategy strategy) {
        Intrinsics.checkNotNullParameter(savedStateDecoder, "<this>");
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        SerialDescriptor descriptor = strategy.getDescriptor();
        if (Intrinsics.areEqual(descriptor, SavedStateCodecUtils_androidKt.getPolymorphicCharSequenceDescriptor())) {
            return CharSequenceSerializer.INSTANCE.deserialize((Decoder) savedStateDecoder);
        }
        if (Intrinsics.areEqual(descriptor, SavedStateCodecUtils_androidKt.getPolymorphicParcelableDescriptor())) {
            return DefaultParcelableSerializer.INSTANCE.deserialize((Decoder) savedStateDecoder);
        }
        if (Intrinsics.areEqual(descriptor, SavedStateCodecUtils_androidKt.getPolymorphicJavaSerializableDescriptor())) {
            return DefaultJavaSerializableSerializer.INSTANCE.deserialize((Decoder) savedStateDecoder);
        }
        if (Intrinsics.areEqual(descriptor, SavedStateCodecUtils_androidKt.getPolymorphicIBinderDescriptor())) {
            return IBinderSerializer.INSTANCE.deserialize((Decoder) savedStateDecoder);
        }
        if (Intrinsics.areEqual(descriptor, SavedStateCodecUtils_androidKt.getCharSequenceArrayDescriptor()) || Intrinsics.areEqual(descriptor, SavedStateCodecUtils_androidKt.getPolymorphicCharSequenceArrayDescriptor())) {
            return CharSequenceArraySerializer.INSTANCE.deserialize((Decoder) savedStateDecoder);
        }
        if (Intrinsics.areEqual(descriptor, SavedStateCodecUtils_androidKt.getCharSequenceListDescriptor()) || Intrinsics.areEqual(descriptor, SavedStateCodecUtils_androidKt.getPolymorphicCharSequenceListDescriptor())) {
            return CharSequenceListSerializer.INSTANCE.deserialize((Decoder) savedStateDecoder);
        }
        if (Intrinsics.areEqual(descriptor, SavedStateCodecUtils_androidKt.getParcelableArrayDescriptor())) {
            Parcelable[] deserialize = ParcelableArraySerializer.INSTANCE.deserialize((Decoder) savedStateDecoder);
            return Arrays.copyOf(deserialize, deserialize.length, JvmClassMappingKt.getJavaClass(getArrayKClass(strategy)));
        }
        if (Intrinsics.areEqual(descriptor, SavedStateCodecUtils_androidKt.getPolymorphicParcelableArrayDescriptor())) {
            return ParcelableArraySerializer.INSTANCE.deserialize((Decoder) savedStateDecoder);
        }
        if (Intrinsics.areEqual(descriptor, SavedStateCodecUtils_androidKt.getParcelableListDescriptor()) || Intrinsics.areEqual(descriptor, SavedStateCodecUtils_androidKt.getPolymorphicParcelableListDescriptor())) {
            return ParcelableListSerializer.INSTANCE.deserialize((Decoder) savedStateDecoder);
        }
        if (Intrinsics.areEqual(descriptor, SavedStateCodecUtils_androidKt.getSparseParcelableArrayDescriptor()) || Intrinsics.areEqual(descriptor, SavedStateCodecUtils_androidKt.getPolymorphicSparseParcelableArrayDescriptor()) || Intrinsics.areEqual(descriptor, SavedStateCodecUtils_androidKt.getNullablePolymorphicSparseParcelableArrayDescriptor())) {
            return SparseParcelableArraySerializer.INSTANCE.deserialize((Decoder) savedStateDecoder);
        }
        return null;
    }

    private static final KClass getArrayKClass(DeserializationStrategy deserializationStrategy) {
        Object deserialize = deserializationStrategy.deserialize(EmptyArrayDecoder.INSTANCE);
        Intrinsics.checkNotNull(deserialize);
        return Reflection.getOrCreateKotlinClass(deserialize.getClass());
    }
}
