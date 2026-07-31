package androidx.os.compose.serialization.serializers;

import androidx.compose.runtime.snapshots.SnapshotStateMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: SnapshotStateMapSerializer.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0003J+\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ#\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR&\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000f0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R \u0010\u0013\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Landroidx/savedstate/compose/serialization/serializers/SnapshotStateMapSerializer;", "K", "V", "Lkotlinx/serialization/KSerializer;", "Landroidx/compose/runtime/snapshots/SnapshotStateMap;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Landroidx/compose/runtime/snapshots/SnapshotStateMap;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Landroidx/compose/runtime/snapshots/SnapshotStateMap;", "", "base", "Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor$annotations", "()V", "savedstate-compose"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SnapshotStateMapSerializer<K, V> implements KSerializer {
    private final KSerializer base;
    private final SerialDescriptor descriptor;

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return this.descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, SnapshotStateMap value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        encoder.encodeSerializableValue(this.base, value);
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public SnapshotStateMap deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Map map = (Map) decoder.decodeSerializableValue(this.base);
        SnapshotStateMap snapshotStateMap = new SnapshotStateMap();
        snapshotStateMap.putAll(map);
        return snapshotStateMap;
    }
}
