package xyz.block.protos.genie;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;
import xyz.block.protos.genie.UnaryOp;

/* loaded from: classes10.dex */
public final class CollectionItem extends Message {
    public static final ProtoAdapter ADAPTER = new CollectionItem$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CollectionItem.class), "type.googleapis.com/xyz.block.genie.v1.CollectionItem", Syntax.PROTO_2, null, "xyz/block/genie/v1/state.proto");
    public final KeyValueMap fields;
    public final IdValue identity;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectionItem(KeyValueMap keyValueMap, IdValue idValue, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.fields = keyValueMap;
        this.identity = idValue;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CollectionItem)) {
            return false;
        }
        CollectionItem collectionItem = (CollectionItem) obj;
        return Intrinsics.areEqual(unknownFields(), collectionItem.unknownFields()) && Intrinsics.areEqual(this.fields, collectionItem.fields) && Intrinsics.areEqual(this.identity, collectionItem.identity);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        KeyValueMap keyValueMap = this.fields;
        int hashCode2 = (hashCode + (keyValueMap != null ? keyValueMap.hashCode() : 0)) * 37;
        IdValue idValue = this.identity;
        int hashCode3 = hashCode2 + (idValue != null ? idValue.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        UnaryOp.Builder builder = new UnaryOp.Builder(1);
        builder.operator_ = this.fields;
        builder.operand = this.identity;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        KeyValueMap keyValueMap = this.fields;
        if (keyValueMap != null) {
            arrayList.add("fields=" + keyValueMap);
        }
        IdValue idValue = this.identity;
        if (idValue != null) {
            arrayList.add("identity=" + idValue);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CollectionItem{", "}", 0, null, null, 56);
    }
}
