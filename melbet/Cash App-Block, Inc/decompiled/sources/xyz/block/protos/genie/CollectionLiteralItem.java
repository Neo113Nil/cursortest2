package xyz.block.protos.genie;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;
import xyz.block.protos.genie.KeyPath;

/* loaded from: classes10.dex */
public final class CollectionLiteralItem extends Message {
    public static final ProtoAdapter ADAPTER = new CollectionLiteralItem$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CollectionLiteralItem.class), "type.googleapis.com/xyz.block.genie.v1.CollectionLiteralItem", Syntax.PROTO_2, null, "xyz/block/genie/v1/expression.proto");
    public final List fields;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectionLiteralItem(List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.fields = TransactorKt.immutableCopyOf("fields", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CollectionLiteralItem)) {
            return false;
        }
        CollectionLiteralItem collectionLiteralItem = (CollectionLiteralItem) obj;
        return Intrinsics.areEqual(unknownFields(), collectionLiteralItem.unknownFields()) && Intrinsics.areEqual(this.fields, collectionLiteralItem.fields);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.fields.hashCode() + (unknownFields().hashCode() * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        KeyPath.Builder builder = new KeyPath.Builder(2);
        builder.segments = this.fields;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.fields;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("fields=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CollectionLiteralItem{", "}", 0, null, null, 56);
    }
}
