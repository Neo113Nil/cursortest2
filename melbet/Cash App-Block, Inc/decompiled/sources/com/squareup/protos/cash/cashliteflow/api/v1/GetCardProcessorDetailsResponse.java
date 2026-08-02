package com.squareup.protos.cash.cashliteflow.api.v1;

import android.os.Parcelable;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.api.ResponseMetadata;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/cashliteflow/api/v1/GetCardProcessorDetailsResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/api/ResponseMetadata$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GetCardProcessorDetailsResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetCardProcessorDetailsResponse> CREATOR;
    public final CardProcessorDetails card_processor_details;
    public final ResponseContext response_context;

    static {
        GetCardProcessorDetailsResponse$Companion$ADAPTER$1 getCardProcessorDetailsResponse$Companion$ADAPTER$1 = new GetCardProcessorDetailsResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetCardProcessorDetailsResponse.class), "type.googleapis.com/squareup.cash.cashliteflow.api.v1beta1.GetCardProcessorDetailsResponse", Syntax.PROTO_2, null, "squareup/cash/cashliteflow/api/v1beta1/get_card_processor_details.proto");
        ADAPTER = getCardProcessorDetailsResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getCardProcessorDetailsResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetCardProcessorDetailsResponse(CardProcessorDetails cardProcessorDetails, ResponseContext responseContext, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.card_processor_details = cardProcessorDetails;
        this.response_context = responseContext;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetCardProcessorDetailsResponse)) {
            return false;
        }
        GetCardProcessorDetailsResponse getCardProcessorDetailsResponse = (GetCardProcessorDetailsResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getCardProcessorDetailsResponse.unknownFields()) && Intrinsics.areEqual(this.card_processor_details, getCardProcessorDetailsResponse.card_processor_details) && Intrinsics.areEqual(this.response_context, getCardProcessorDetailsResponse.response_context);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        CardProcessorDetails cardProcessorDetails = this.card_processor_details;
        int hashCode2 = (hashCode + (cardProcessorDetails != null ? cardProcessorDetails.hashCode() : 0)) * 37;
        ResponseContext responseContext = this.response_context;
        int hashCode3 = hashCode2 + (responseContext != null ? responseContext.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ResponseMetadata.Builder builder = new ResponseMetadata.Builder(28);
        builder.errors = this.card_processor_details;
        builder.result = this.response_context;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        CardProcessorDetails cardProcessorDetails = this.card_processor_details;
        if (cardProcessorDetails != null) {
            arrayList.add("card_processor_details=" + cardProcessorDetails);
        }
        ResponseContext responseContext = this.response_context;
        if (responseContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("response_context=", responseContext, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetCardProcessorDetailsResponse{", "}", 0, null, null, 56);
    }
}
