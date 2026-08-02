package com.squareup.protos.cash.local.client.app.v1;

import android.os.Parcelable;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.grantly.api.Card;
import com.squareup.protos.cash.local.client.v1.GetShortlinkResponse;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/local/client/app/v1/GetAppShortlinkResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/grantly/api/Card$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GetAppShortlinkResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetAppShortlinkResponse> CREATOR;
    public final GetShortlinkResponse response;
    public final ResponseContext response_context;

    static {
        GetAppShortlinkResponse$Companion$ADAPTER$1 getAppShortlinkResponse$Companion$ADAPTER$1 = new GetAppShortlinkResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetAppShortlinkResponse.class), "type.googleapis.com/squareup.cash.local.client.app.v1.GetAppShortlinkResponse", Syntax.PROTO_2, null, "squareup/cash/local/client/app/v1/cash_app_local_client_app_service.proto");
        ADAPTER = getAppShortlinkResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getAppShortlinkResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetAppShortlinkResponse(ResponseContext responseContext, GetShortlinkResponse getShortlinkResponse, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.response_context = responseContext;
        this.response = getShortlinkResponse;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetAppShortlinkResponse)) {
            return false;
        }
        GetAppShortlinkResponse getAppShortlinkResponse = (GetAppShortlinkResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getAppShortlinkResponse.unknownFields()) && Intrinsics.areEqual(this.response_context, getAppShortlinkResponse.response_context) && Intrinsics.areEqual(this.response, getAppShortlinkResponse.response);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ResponseContext responseContext = this.response_context;
        int hashCode2 = (hashCode + (responseContext != null ? responseContext.hashCode() : 0)) * 37;
        GetShortlinkResponse getShortlinkResponse = this.response;
        int hashCode3 = hashCode2 + (getShortlinkResponse != null ? getShortlinkResponse.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Card.Builder builder = new Card.Builder(24);
        builder.card_type = this.response_context;
        builder.card_pii = this.response;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ResponseContext responseContext = this.response_context;
        if (responseContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("response_context=", responseContext, arrayList);
        }
        GetShortlinkResponse getShortlinkResponse = this.response;
        if (getShortlinkResponse != null) {
            arrayList.add("response=" + getShortlinkResponse);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetAppShortlinkResponse{", "}", 0, null, null, 56);
    }
}
