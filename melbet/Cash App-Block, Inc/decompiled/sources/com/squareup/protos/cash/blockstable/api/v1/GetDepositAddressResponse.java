package com.squareup.protos.cash.blockstable.api.v1;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.cash.moneybot.genie.protos.ForEach;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/blockstable/api/v1/GetDepositAddressResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/cash/moneybot/genie/protos/ForEach$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GetDepositAddressResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetDepositAddressResponse> CREATOR;
    public final String deposit_address;
    public final String qr_code_url;
    public final ResponseContext response_context;
    public final String truncated_deposit_address;

    static {
        GetDepositAddressResponse$Companion$ADAPTER$1 getDepositAddressResponse$Companion$ADAPTER$1 = new GetDepositAddressResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetDepositAddressResponse.class), "type.googleapis.com/squareup.cash.blockstable.api.v1beta1.GetDepositAddressResponse", Syntax.PROTO_2, null, "squareup/cash/blockstable/api/v1beta1/public.proto");
        ADAPTER = getDepositAddressResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getDepositAddressResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetDepositAddressResponse(String str, String str2, String str3, ResponseContext responseContext, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.deposit_address = str;
        this.truncated_deposit_address = str2;
        this.qr_code_url = str3;
        this.response_context = responseContext;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetDepositAddressResponse)) {
            return false;
        }
        GetDepositAddressResponse getDepositAddressResponse = (GetDepositAddressResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getDepositAddressResponse.unknownFields()) && Intrinsics.areEqual(this.deposit_address, getDepositAddressResponse.deposit_address) && Intrinsics.areEqual(this.truncated_deposit_address, getDepositAddressResponse.truncated_deposit_address) && Intrinsics.areEqual(this.qr_code_url, getDepositAddressResponse.qr_code_url) && Intrinsics.areEqual(this.response_context, getDepositAddressResponse.response_context);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.deposit_address;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.truncated_deposit_address;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.qr_code_url;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        ResponseContext responseContext = this.response_context;
        int hashCode5 = hashCode4 + (responseContext != null ? responseContext.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ForEach.Builder builder = new ForEach.Builder(27);
        builder.item_variable = this.deposit_address;
        builder.collection = this.truncated_deposit_address;
        builder.template = this.qr_code_url;
        builder.source = this.response_context;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.deposit_address;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "deposit_address=", arrayList);
        }
        String str2 = this.truncated_deposit_address;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "truncated_deposit_address=", arrayList);
        }
        String str3 = this.qr_code_url;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "qr_code_url=", arrayList);
        }
        ResponseContext responseContext = this.response_context;
        if (responseContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("response_context=", responseContext, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetDepositAddressResponse{", "}", 0, null, null, 56);
    }
}
