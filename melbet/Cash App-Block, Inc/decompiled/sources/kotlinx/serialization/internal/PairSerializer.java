package kotlinx.serialization.internal;

import java.util.Map;
import kotlin.Pair;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorImpl;
import kotlinx.serialization.descriptors.StructureKind;
import okhttp3.internal.Tags;

/* loaded from: classes9.dex */
public final class PairSerializer extends KeyValueSerializer {
    public final /* synthetic */ int $r8$classId;
    public final SerialDescriptorImpl descriptor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PairSerializer(KSerializer kSerializer, KSerializer kSerializer2, int i) {
        super(kSerializer, kSerializer2);
        this.$r8$classId = i;
        kSerializer.getClass();
        kSerializer2.getClass();
        switch (i) {
            case 1:
                super(kSerializer, kSerializer2);
                this.descriptor = Tags.buildSerialDescriptor("kotlin.collections.Map.Entry", StructureKind.MAP.INSTANCE, new SerialDescriptor[0], new PairSerializer$$ExternalSyntheticLambda0(kSerializer, kSerializer2, 1));
                break;
            default:
                this.descriptor = Tags.buildClassSerialDescriptor("kotlin.Pair", new SerialDescriptor[0], new PairSerializer$$ExternalSyntheticLambda0(kSerializer, kSerializer2, 0));
                break;
        }
    }

    @Override // kotlinx.serialization.internal.KeyValueSerializer, kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        switch (this.$r8$classId) {
        }
        return this.descriptor;
    }

    @Override // kotlinx.serialization.internal.KeyValueSerializer
    public final Object getKey(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                Pair pair = (Pair) obj;
                pair.getClass();
                return pair.first;
            default:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                return entry.getKey();
        }
    }

    @Override // kotlinx.serialization.internal.KeyValueSerializer
    public final Object getValue(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                Pair pair = (Pair) obj;
                pair.getClass();
                return pair.second;
            default:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                return entry.getValue();
        }
    }

    @Override // kotlinx.serialization.internal.KeyValueSerializer
    public final Object toResult(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                return new Pair(obj, obj2);
            default:
                return new MapEntrySerializer$MapEntry(obj, obj2);
        }
    }
}
