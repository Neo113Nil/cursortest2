package com.squareup.protos.cash.postbank.api;

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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/postbank/api/GetCustomerPrimaryDdaDetailsResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/postcard/CardModule$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class GetCustomerPrimaryDdaDetailsResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetCustomerPrimaryDdaDetailsResponse> CREATOR;
    public final DdaAccountNumbers dda_account_numbers;
    public final ResponseContext response_context;

    static {
        GetCustomerPrimaryDdaDetailsResponse$Companion$ADAPTER$1 getCustomerPrimaryDdaDetailsResponse$Companion$ADAPTER$1 = new GetCustomerPrimaryDdaDetailsResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetCustomerPrimaryDdaDetailsResponse.class), "type.googleapis.com/squareup.cash.postbank.api.GetCustomerPrimaryDdaDetailsResponse", Syntax.PROTO_2, null, "squareup/cash/postbank/api/GetCustomerPrimaryDdaDetails.proto");
        ADAPTER = getCustomerPrimaryDdaDetailsResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getCustomerPrimaryDdaDetailsResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetCustomerPrimaryDdaDetailsResponse(DdaAccountNumbers ddaAccountNumbers, ResponseContext responseContext, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.dda_account_numbers = ddaAccountNumbers;
        this.response_context = responseContext;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetCustomerPrimaryDdaDetailsResponse)) {
            return false;
        }
        GetCustomerPrimaryDdaDetailsResponse getCustomerPrimaryDdaDetailsResponse = (GetCustomerPrimaryDdaDetailsResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getCustomerPrimaryDdaDetailsResponse.unknownFields()) && Intrinsics.areEqual(this.dda_account_numbers, getCustomerPrimaryDdaDetailsResponse.dda_account_numbers) && Intrinsics.areEqual(this.response_context, getCustomerPrimaryDdaDetailsResponse.response_context);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        DdaAccountNumbers ddaAccountNumbers = this.dda_account_numbers;
        int hashCode2 = (hashCode + (ddaAccountNumbers != null ? ddaAccountNumbers.hashCode() : 0)) * 37;
        ResponseContext responseContext = this.response_context;
        int hashCode3 = hashCode2 + (responseContext != null ? responseContext.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        CardModule.Builder builder = new CardModule.Builder(22);
        builder.f1329type = this.dda_account_numbers;
        builder.use_case = this.response_context;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        DdaAccountNumbers ddaAccountNumbers = this.dda_account_numbers;
        if (ddaAccountNumbers != null) {
            arrayList.add("dda_account_numbers=" + ddaAccountNumbers);
        }
        ResponseContext responseContext = this.response_context;
        if (responseContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("response_context=", responseContext, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetCustomerPrimaryDdaDetailsResponse{", "}", 0, null, null, 56);
    }
}
