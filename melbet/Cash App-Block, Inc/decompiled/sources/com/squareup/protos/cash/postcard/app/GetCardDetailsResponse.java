package com.squareup.protos.cash.postcard.app;

import android.os.Parcelable;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.postcard.CardModule;
import com.squareup.protos.franklin.common.ResponseContext;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/postcard/app/GetCardDetailsResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/postcard/CardModule$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GetCardDetailsResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetCardDetailsResponse> CREATOR;
    public final CardDetails card_details;
    public final ResponseContext response_context;

    static {
        GetCardDetailsResponse$Companion$ADAPTER$1 getCardDetailsResponse$Companion$ADAPTER$1 = new GetCardDetailsResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetCardDetailsResponse.class), "type.googleapis.com/squareup.cash.postcard.app.GetCardDetailsResponse", Syntax.PROTO_2, null, "squareup/cash/postcard/app/GetCardDetails.proto");
        ADAPTER = getCardDetailsResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getCardDetailsResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetCardDetailsResponse(CardDetails cardDetails, ResponseContext responseContext, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.card_details = cardDetails;
        this.response_context = responseContext;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetCardDetailsResponse)) {
            return false;
        }
        GetCardDetailsResponse getCardDetailsResponse = (GetCardDetailsResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getCardDetailsResponse.unknownFields()) && Intrinsics.areEqual(this.card_details, getCardDetailsResponse.card_details) && Intrinsics.areEqual(this.response_context, getCardDetailsResponse.response_context);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        CardDetails cardDetails = this.card_details;
        int hashCode2 = (hashCode + (cardDetails != null ? cardDetails.hashCode() : 0)) * 37;
        ResponseContext responseContext = this.response_context;
        int hashCode3 = hashCode2 + (responseContext != null ? responseContext.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        CardModule.Builder builder = new CardModule.Builder(27);
        builder.f1329type = this.card_details;
        builder.use_case = this.response_context;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        CardDetails cardDetails = this.card_details;
        if (cardDetails != null) {
            arrayList.add("card_details=" + cardDetails);
        }
        ResponseContext responseContext = this.response_context;
        if (responseContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("response_context=", responseContext, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetCardDetailsResponse{", "}", 0, null, null, 56);
    }
}
