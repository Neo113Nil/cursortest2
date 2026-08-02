package com.squareup.protos.cash.local.client.app.v1;

import android.os.Parcelable;
import com.squareup.protos.cash.grantly.api.Card;
import com.squareup.protos.cash.local.client.v1.LocalErrorResponse;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/local/client/app/v1/GetMarketingMessageResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/grantly/api/Card$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GetMarketingMessageResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetMarketingMessageResponse> CREATOR;
    public final LocalErrorResponse error_response;
    public final MarketingMessage marketing_message;

    static {
        GetMarketingMessageResponse$Companion$ADAPTER$1 getMarketingMessageResponse$Companion$ADAPTER$1 = new GetMarketingMessageResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetMarketingMessageResponse.class), "type.googleapis.com/squareup.cash.local.client.app.v1.GetMarketingMessageResponse", Syntax.PROTO_2, null, "squareup/cash/local/client/app/v1/cash_app_local_client_app_service.proto");
        ADAPTER = getMarketingMessageResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getMarketingMessageResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetMarketingMessageResponse(MarketingMessage marketingMessage, LocalErrorResponse localErrorResponse, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.marketing_message = marketingMessage;
        this.error_response = localErrorResponse;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetMarketingMessageResponse)) {
            return false;
        }
        GetMarketingMessageResponse getMarketingMessageResponse = (GetMarketingMessageResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getMarketingMessageResponse.unknownFields()) && Intrinsics.areEqual(this.marketing_message, getMarketingMessageResponse.marketing_message) && Intrinsics.areEqual(this.error_response, getMarketingMessageResponse.error_response);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        MarketingMessage marketingMessage = this.marketing_message;
        int hashCode2 = (hashCode + (marketingMessage != null ? marketingMessage.hashCode() : 0)) * 37;
        LocalErrorResponse localErrorResponse = this.error_response;
        int hashCode3 = hashCode2 + (localErrorResponse != null ? localErrorResponse.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Card.Builder builder = new Card.Builder(25);
        builder.card_type = this.marketing_message;
        builder.card_pii = this.error_response;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        MarketingMessage marketingMessage = this.marketing_message;
        if (marketingMessage != null) {
            arrayList.add("marketing_message=" + marketingMessage);
        }
        LocalErrorResponse localErrorResponse = this.error_response;
        if (localErrorResponse != null) {
            arrayList.add("error_response=" + localErrorResponse);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetMarketingMessageResponse{", "}", 0, null, null, 56);
    }
}
