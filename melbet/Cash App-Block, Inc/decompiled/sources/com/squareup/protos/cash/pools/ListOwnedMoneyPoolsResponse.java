package com.squareup.protos.cash.pools;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.pools.ListPoolsResponse;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/pools/ListOwnedMoneyPoolsResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/pools/ListPoolsResponse$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ListOwnedMoneyPoolsResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ListOwnedMoneyPoolsResponse> CREATOR;
    public final List pools;

    static {
        ListOwnedMoneyPoolsResponse$Companion$ADAPTER$1 listOwnedMoneyPoolsResponse$Companion$ADAPTER$1 = new ListOwnedMoneyPoolsResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ListOwnedMoneyPoolsResponse.class), "type.googleapis.com/squareup.cash.pools.v1beta.ListOwnedMoneyPoolsResponse", Syntax.PROTO_2, null, "squareup/cash/pools/v1beta/pools.proto");
        ADAPTER = listOwnedMoneyPoolsResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(listOwnedMoneyPoolsResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListOwnedMoneyPoolsResponse(List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.pools = TransactorKt.immutableCopyOf("pools", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ListOwnedMoneyPoolsResponse)) {
            return false;
        }
        ListOwnedMoneyPoolsResponse listOwnedMoneyPoolsResponse = (ListOwnedMoneyPoolsResponse) obj;
        return Intrinsics.areEqual(unknownFields(), listOwnedMoneyPoolsResponse.unknownFields()) && Intrinsics.areEqual(this.pools, listOwnedMoneyPoolsResponse.pools);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.pools.hashCode() + (unknownFields().hashCode() * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ListPoolsResponse.Builder builder = new ListPoolsResponse.Builder(7, false);
        builder.pools = this.pools;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.pools;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("pools=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ListOwnedMoneyPoolsResponse{", "}", 0, null, null, 56);
    }
}
