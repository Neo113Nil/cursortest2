package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.AndroidMessage;
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
import xyz.block.protos.genie.Collection;

/* loaded from: classes8.dex */
public final class TransactionAmountHistory extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<TransactionAmountHistory> CREATOR;
    public final List line_items;

    static {
        TransactionAmountHistory$Companion$ADAPTER$1 transactionAmountHistory$Companion$ADAPTER$1 = new TransactionAmountHistory$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(TransactionAmountHistory.class), "type.googleapis.com/squareup.franklin.TransactionAmountHistory", Syntax.PROTO_2, null, "squareup/franklin/render_data.proto");
        ADAPTER = transactionAmountHistory$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(transactionAmountHistory$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransactionAmountHistory(List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.line_items = TransactorKt.immutableCopyOf("line_items", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TransactionAmountHistory)) {
            return false;
        }
        TransactionAmountHistory transactionAmountHistory = (TransactionAmountHistory) obj;
        return Intrinsics.areEqual(unknownFields(), transactionAmountHistory.unknownFields()) && Intrinsics.areEqual(this.line_items, transactionAmountHistory.line_items);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.line_items.hashCode() + (unknownFields().hashCode() * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Collection.Builder builder = new Collection.Builder(1, false);
        builder.items = this.line_items;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.line_items;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("line_items=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "TransactionAmountHistory{", "}", 0, null, null, 56);
    }
}
