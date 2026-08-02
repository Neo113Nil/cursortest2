package xyz.block.protos.genie;

import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;
import xyz.block.protos.genie.CollectionMutation;

/* loaded from: classes10.dex */
public final class KeyPath extends Message {
    public static final ProtoAdapter ADAPTER = new KeyPath$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(KeyPath.class), "type.googleapis.com/xyz.block.genie.v1.KeyPath", Syntax.PROTO_2, null, "xyz/block/genie/v1/expression.proto");
    public final List segments;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KeyPath(List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.segments = TransactorKt.immutableCopyOf("segments", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof KeyPath)) {
            return false;
        }
        KeyPath keyPath = (KeyPath) obj;
        return Intrinsics.areEqual(unknownFields(), keyPath.unknownFields()) && Intrinsics.areEqual(this.segments, keyPath.segments);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.segments.hashCode() + (unknownFields().hashCode() * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.segments = this.segments;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.segments;
        if (!list.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("segments=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "KeyPath{", "}", 0, null, null, 56);
    }

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public List segments;

        public Builder() {
            this.$r8$classId = 5;
            this.segments = EmptyList.INSTANCE;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new KeyPath(this.segments, buildUnknownFields());
                case 1:
                    return new CollectionLiteral(this.segments, buildUnknownFields());
                case 2:
                    return new CollectionLiteralItem(this.segments, buildUnknownFields());
                case 3:
                    return new CollectionMutation.RemoveItems(this.segments, buildUnknownFields());
                case 4:
                    return new CompoundAction(this.segments, buildUnknownFields());
                default:
                    return build();
            }
        }

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public KeyValueMap build() {
            return new KeyValueMap(this.segments, buildUnknownFields());
        }
    }
}
