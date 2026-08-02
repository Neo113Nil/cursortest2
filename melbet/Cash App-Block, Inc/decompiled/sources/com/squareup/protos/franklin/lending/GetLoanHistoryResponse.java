package com.squareup.protos.franklin.lending;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.protos.giftly.GiftCard;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/franklin/lending/GetLoanHistoryResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/giftly/GiftCard$Options$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class GetLoanHistoryResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetLoanHistoryResponse> CREATOR;
    public final List loans;
    public final String next_page_pagination_token;
    public final ResponseContext response_context;

    static {
        GetLoanHistoryResponse$Companion$ADAPTER$1 getLoanHistoryResponse$Companion$ADAPTER$1 = new GetLoanHistoryResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetLoanHistoryResponse.class), "type.googleapis.com/squareup.franklin.lending.GetLoanHistoryResponse", Syntax.PROTO_2, null, "squareup/franklin/lending_api.proto");
        ADAPTER = getLoanHistoryResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getLoanHistoryResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetLoanHistoryResponse(ResponseContext responseContext, String str, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.response_context = responseContext;
        this.next_page_pagination_token = str;
        this.loans = TransactorKt.immutableCopyOf("loans", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetLoanHistoryResponse)) {
            return false;
        }
        GetLoanHistoryResponse getLoanHistoryResponse = (GetLoanHistoryResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getLoanHistoryResponse.unknownFields()) && Intrinsics.areEqual(this.response_context, getLoanHistoryResponse.response_context) && Intrinsics.areEqual(this.next_page_pagination_token, getLoanHistoryResponse.next_page_pagination_token) && Intrinsics.areEqual(this.loans, getLoanHistoryResponse.loans);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ResponseContext responseContext = this.response_context;
        int hashCode2 = (hashCode + (responseContext != null ? responseContext.hashCode() : 0)) * 37;
        String str = this.next_page_pagination_token;
        int hashCode3 = this.loans.hashCode() + ((hashCode2 + (str != null ? str.hashCode() : 0)) * 37);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        GiftCard.Options.Builder builder = new GiftCard.Options.Builder(5);
        builder.localizable_label = this.response_context;
        builder.label = this.next_page_pagination_token;
        builder.client_scenario = this.loans;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ResponseContext responseContext = this.response_context;
        if (responseContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("response_context=", responseContext, arrayList);
        }
        String str = this.next_page_pagination_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "next_page_pagination_token=", arrayList);
        }
        List list = this.loans;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("loans=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetLoanHistoryResponse{", "}", 0, null, null, 56);
    }
}
