package androidx.os.compose.serialization.serializers;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: SnapshotStateListSerializer.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002J%\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rR \u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R \u0010\u0012\u001a\u00020\u00118\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Landroidx/savedstate/compose/serialization/serializers/SnapshotStateListSerializer;", "T", "Lkotlinx/serialization/KSerializer;", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Landroidx/compose/runtime/snapshots/SnapshotStateList;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Landroidx/compose/runtime/snapshots/SnapshotStateList;", "", "base", "Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor$annotations", "()V", "savedstate-compose"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SnapshotStateListSerializer<T> implements KSerializer {
    private final KSerializer base;
    private final SerialDescriptor descriptor;

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return this.descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, SnapshotStateList value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        encoder.encodeSerializableValue(this.base, value);
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public SnapshotStateList deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        List list = (List) decoder.decodeSerializableValue(this.base);
        SnapshotStateList snapshotStateList = new SnapshotStateList();
        snapshotStateList.addAll(CollectionsKt.toList(list));
        return snapshotStateList;
    }
}
