package androidx.os.serialization;

import android.os.IBinder;
import android.os.Parcelable;
import android.util.SparseArray;
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
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: SavedStateEncoder.android.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a-\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00052\u0006\u0010\u0006\u001a\u0002H\u0002H\u0000¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"encodeFormatSpecificTypesOnPlatform", "", "T", "Landroidx/savedstate/serialization/SavedStateEncoder;", X3.f.e, "Lkotlinx/serialization/SerializationStrategy;", "value", "(Landroidx/savedstate/serialization/SavedStateEncoder;Lkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)Z", "savedstate"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class SavedStateEncoder_androidKt {
    public static final boolean encodeFormatSpecificTypesOnPlatform(SavedStateEncoder savedStateEncoder, SerializationStrategy strategy, Object obj) {
        Intrinsics.checkNotNullParameter(savedStateEncoder, "<this>");
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        SerialDescriptor descriptor = strategy.getDescriptor();
        if (Intrinsics.areEqual(descriptor, SavedStateCodecUtils_androidKt.getPolymorphicCharSequenceDescriptor())) {
            CharSequenceSerializer charSequenceSerializer = CharSequenceSerializer.INSTANCE;
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.CharSequence");
            charSequenceSerializer.serialize((Encoder) savedStateEncoder, (CharSequence) obj);
            return true;
        }
        if (Intrinsics.areEqual(descriptor, SavedStateCodecUtils_androidKt.getPolymorphicParcelableDescriptor())) {
            DefaultParcelableSerializer defaultParcelableSerializer = DefaultParcelableSerializer.INSTANCE;
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type android.os.Parcelable");
            defaultParcelableSerializer.serialize((Encoder) savedStateEncoder, (Parcelable) obj);
            return true;
        }
        if (Intrinsics.areEqual(descriptor, SavedStateCodecUtils_androidKt.getPolymorphicJavaSerializableDescriptor())) {
            DefaultJavaSerializableSerializer defaultJavaSerializableSerializer = DefaultJavaSerializableSerializer.INSTANCE;
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type java.io.Serializable");
            defaultJavaSerializableSerializer.serialize((Encoder) savedStateEncoder, (Serializable) obj);
            return true;
        }
        if (Intrinsics.areEqual(descriptor, SavedStateCodecUtils_androidKt.getPolymorphicIBinderDescriptor())) {
            IBinderSerializer iBinderSerializer = IBinderSerializer.INSTANCE;
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type android.os.IBinder");
            iBinderSerializer.serialize((Encoder) savedStateEncoder, (IBinder) obj);
            return true;
        }
        if (Intrinsics.areEqual(descriptor, SavedStateCodecUtils_androidKt.getCharSequenceArrayDescriptor()) || Intrinsics.areEqual(descriptor, SavedStateCodecUtils_androidKt.getPolymorphicCharSequenceArrayDescriptor())) {
            CharSequenceArraySerializer charSequenceArraySerializer = CharSequenceArraySerializer.INSTANCE;
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.CharSequence>");
            charSequenceArraySerializer.serialize((Encoder) savedStateEncoder, (CharSequence[]) obj);
            return true;
        }
        if (Intrinsics.areEqual(descriptor, SavedStateCodecUtils_androidKt.getCharSequenceListDescriptor()) || Intrinsics.areEqual(descriptor, SavedStateCodecUtils_androidKt.getPolymorphicCharSequenceListDescriptor())) {
            CharSequenceListSerializer charSequenceListSerializer = CharSequenceListSerializer.INSTANCE;
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.CharSequence>");
            charSequenceListSerializer.serialize((Encoder) savedStateEncoder, (List) obj);
            return true;
        }
        if (Intrinsics.areEqual(descriptor, SavedStateCodecUtils_androidKt.getParcelableArrayDescriptor()) || Intrinsics.areEqual(descriptor, SavedStateCodecUtils_androidKt.getPolymorphicParcelableArrayDescriptor())) {
            ParcelableArraySerializer parcelableArraySerializer = ParcelableArraySerializer.INSTANCE;
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Array<android.os.Parcelable>");
            parcelableArraySerializer.serialize((Encoder) savedStateEncoder, (Parcelable[]) obj);
            return true;
        }
        if (Intrinsics.areEqual(descriptor, SavedStateCodecUtils_androidKt.getParcelableListDescriptor()) || Intrinsics.areEqual(descriptor, SavedStateCodecUtils_androidKt.getPolymorphicParcelableListDescriptor())) {
            ParcelableListSerializer parcelableListSerializer = ParcelableListSerializer.INSTANCE;
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<android.os.Parcelable>");
            parcelableListSerializer.serialize((Encoder) savedStateEncoder, (List) obj);
            return true;
        }
        if (!Intrinsics.areEqual(descriptor, SavedStateCodecUtils_androidKt.getSparseParcelableArrayDescriptor()) && !Intrinsics.areEqual(descriptor, SavedStateCodecUtils_androidKt.getPolymorphicSparseParcelableArrayDescriptor()) && !Intrinsics.areEqual(descriptor, SavedStateCodecUtils_androidKt.getNullablePolymorphicSparseParcelableArrayDescriptor())) {
            return false;
        }
        SparseParcelableArraySerializer sparseParcelableArraySerializer = SparseParcelableArraySerializer.INSTANCE;
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type android.util.SparseArray<android.os.Parcelable>");
        sparseParcelableArraySerializer.serialize((Encoder) savedStateEncoder, (SparseArray) obj);
        return true;
    }
}
