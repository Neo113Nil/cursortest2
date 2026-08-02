package com.squareup.protos.cash.blocksmith.actions.merchant_blocking.v1;

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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/blocksmith/actions/merchant_blocking/v1/GetCardBlockedBusinessesUIConfigResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/api/ResponseMetadata$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GetCardBlockedBusinessesUIConfigResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetCardBlockedBusinessesUIConfigResponse> CREATOR;
    public final CardBlockedBusinessesUIConfig card_blocked_businesses_ui_config;
    public final ResponseContext response_context;

    static {
        GetCardBlockedBusinessesUIConfigResponse$Companion$ADAPTER$1 getCardBlockedBusinessesUIConfigResponse$Companion$ADAPTER$1 = new GetCardBlockedBusinessesUIConfigResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetCardBlockedBusinessesUIConfigResponse.class), "type.googleapis.com/squareup.cash.blocksmith.actions.merchant_blocking.v1beta1.GetCardBlockedBusinessesUIConfigResponse", Syntax.PROTO_2, null, "squareup/cash/blocksmith/actions/merchant_blocking/v1beta1/get_card_blocked_businesses_ui_config.proto");
        ADAPTER = getCardBlockedBusinessesUIConfigResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getCardBlockedBusinessesUIConfigResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetCardBlockedBusinessesUIConfigResponse(CardBlockedBusinessesUIConfig cardBlockedBusinessesUIConfig, ResponseContext responseContext, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.card_blocked_businesses_ui_config = cardBlockedBusinessesUIConfig;
        this.response_context = responseContext;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetCardBlockedBusinessesUIConfigResponse)) {
            return false;
        }
        GetCardBlockedBusinessesUIConfigResponse getCardBlockedBusinessesUIConfigResponse = (GetCardBlockedBusinessesUIConfigResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getCardBlockedBusinessesUIConfigResponse.unknownFields()) && Intrinsics.areEqual(this.card_blocked_businesses_ui_config, getCardBlockedBusinessesUIConfigResponse.card_blocked_businesses_ui_config) && Intrinsics.areEqual(this.response_context, getCardBlockedBusinessesUIConfigResponse.response_context);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        CardBlockedBusinessesUIConfig cardBlockedBusinessesUIConfig = this.card_blocked_businesses_ui_config;
        int hashCode2 = (hashCode + (cardBlockedBusinessesUIConfig != null ? cardBlockedBusinessesUIConfig.hashCode() : 0)) * 37;
        ResponseContext responseContext = this.response_context;
        int hashCode3 = hashCode2 + (responseContext != null ? responseContext.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ResponseMetadata.Builder builder = new ResponseMetadata.Builder(7);
        builder.errors = this.card_blocked_businesses_ui_config;
        builder.result = this.response_context;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        CardBlockedBusinessesUIConfig cardBlockedBusinessesUIConfig = this.card_blocked_businesses_ui_config;
        if (cardBlockedBusinessesUIConfig != null) {
            arrayList.add("card_blocked_businesses_ui_config=" + cardBlockedBusinessesUIConfig);
        }
        ResponseContext responseContext = this.response_context;
        if (responseContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("response_context=", responseContext, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetCardBlockedBusinessesUIConfigResponse{", "}", 0, null, null, 56);
    }
}
