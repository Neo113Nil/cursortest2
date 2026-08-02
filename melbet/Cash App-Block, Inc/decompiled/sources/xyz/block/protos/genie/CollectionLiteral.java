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
public final class CollectionLiteral extends Message {
    public static final ProtoAdapter ADAPTER = new CollectionLiteral$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CollectionLiteral.class), "type.googleapis.com/xyz.block.genie.v1.CollectionLiteral", Syntax.PROTO_2, null, "xyz/block/genie/v1/expression.proto");
    public final List items;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectionLiteral(List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.items = TransactorKt.immutableCopyOf("items", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CollectionLiteral)) {
            return false;
        }
        CollectionLiteral collectionLiteral = (CollectionLiteral) obj;
        return Intrinsics.areEqual(unknownFields(), collectionLiteral.unknownFields()) && Intrinsics.areEqual(this.items, collectionLiteral.items);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.items.hashCode() + (unknownFields().hashCode() * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        KeyPath.Builder builder = new KeyPath.Builder(1);
        builder.segments = this.items;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.items;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("items=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CollectionLiteral{", "}", 0, null, null, 56);
    }
}
