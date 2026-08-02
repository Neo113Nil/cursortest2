package com.squareup.protos.cash.pools;

import android.os.Parcelable;
import com.squareup.protos.cash.pools.ListPoolsRequest;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/pools/AdminGetMoneyPoolResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/pools/ListPoolsRequest$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AdminGetMoneyPoolResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<AdminGetMoneyPoolResponse> CREATOR;
    public final MoneyPool pool;

    static {
        AdminGetMoneyPoolResponse$Companion$ADAPTER$1 adminGetMoneyPoolResponse$Companion$ADAPTER$1 = new AdminGetMoneyPoolResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(AdminGetMoneyPoolResponse.class), "type.googleapis.com/squareup.cash.pools.v1beta.AdminGetMoneyPoolResponse", Syntax.PROTO_2, null, "squareup/cash/pools/v1beta/pools.proto");
        ADAPTER = adminGetMoneyPoolResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(adminGetMoneyPoolResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdminGetMoneyPoolResponse(MoneyPool moneyPool, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.pool = moneyPool;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AdminGetMoneyPoolResponse)) {
            return false;
        }
        AdminGetMoneyPoolResponse adminGetMoneyPoolResponse = (AdminGetMoneyPoolResponse) obj;
        return Intrinsics.areEqual(unknownFields(), adminGetMoneyPoolResponse.unknownFields()) && Intrinsics.areEqual(this.pool, adminGetMoneyPoolResponse.pool);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        MoneyPool moneyPool = this.pool;
        int hashCode2 = hashCode + (moneyPool != null ? moneyPool.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ListPoolsRequest.Builder builder = new ListPoolsRequest.Builder(3);
        builder.pool_lifecycle_filter = this.pool;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        MoneyPool moneyPool = this.pool;
        if (moneyPool != null) {
            arrayList.add("pool=" + moneyPool);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AdminGetMoneyPoolResponse{", "}", 0, null, null, 56);
    }
}
