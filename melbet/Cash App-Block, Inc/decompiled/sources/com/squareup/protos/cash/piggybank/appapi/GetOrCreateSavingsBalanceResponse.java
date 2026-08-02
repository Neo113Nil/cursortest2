package com.squareup.protos.cash.piggybank.appapi;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.protos.moneta.api.CashInResponse;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/piggybank/appapi/GetOrCreateSavingsBalanceResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/moneta/api/CashInResponse$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GetOrCreateSavingsBalanceResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetOrCreateSavingsBalanceResponse> CREATOR;
    public final String balance_token;
    public final ResponseContext response_context;

    static {
        GetOrCreateSavingsBalanceResponse$Companion$ADAPTER$1 getOrCreateSavingsBalanceResponse$Companion$ADAPTER$1 = new GetOrCreateSavingsBalanceResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetOrCreateSavingsBalanceResponse.class), "type.googleapis.com/squareup.cash.piggybank.appapi.GetOrCreateSavingsBalanceResponse", Syntax.PROTO_2, null, "squareup/cash/app/get_or_create_savings_balance.proto");
        ADAPTER = getOrCreateSavingsBalanceResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getOrCreateSavingsBalanceResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetOrCreateSavingsBalanceResponse(ResponseContext responseContext, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.response_context = responseContext;
        this.balance_token = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetOrCreateSavingsBalanceResponse)) {
            return false;
        }
        GetOrCreateSavingsBalanceResponse getOrCreateSavingsBalanceResponse = (GetOrCreateSavingsBalanceResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getOrCreateSavingsBalanceResponse.unknownFields()) && Intrinsics.areEqual(this.response_context, getOrCreateSavingsBalanceResponse.response_context) && Intrinsics.areEqual(this.balance_token, getOrCreateSavingsBalanceResponse.balance_token);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ResponseContext responseContext = this.response_context;
        int hashCode2 = (hashCode + (responseContext != null ? responseContext.hashCode() : 0)) * 37;
        String str = this.balance_token;
        int hashCode3 = hashCode2 + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        CashInResponse.Builder builder = new CashInResponse.Builder(4);
        builder.response_context = this.response_context;
        builder.passcode_token = this.balance_token;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ResponseContext responseContext = this.response_context;
        if (responseContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("response_context=", responseContext, arrayList);
        }
        String str = this.balance_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "balance_token=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetOrCreateSavingsBalanceResponse{", "}", 0, null, null, 56);
    }
}
