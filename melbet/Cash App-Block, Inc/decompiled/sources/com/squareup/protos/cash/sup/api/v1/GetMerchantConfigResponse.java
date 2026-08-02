package com.squareup.protos.cash.sup.api.v1;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.taply.app.v1.Allowed;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/sup/api/v1/GetMerchantConfigResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/taply/app/v1/Allowed$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class GetMerchantConfigResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetMerchantConfigResponse> CREATOR;
    public final Long active_loans;
    public final AvailableCreditLimit available_credit_limit;
    public final Boolean card_on_file;
    public final Long loan_limit;

    static {
        GetMerchantConfigResponse$Companion$ADAPTER$1 getMerchantConfigResponse$Companion$ADAPTER$1 = new GetMerchantConfigResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetMerchantConfigResponse.class), "type.googleapis.com/squareup.cash.sup.api.v1.GetMerchantConfigResponse", Syntax.PROTO_2, null, "squareup/cash/sup/api/v1/merchant_config.proto");
        ADAPTER = getMerchantConfigResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getMerchantConfigResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetMerchantConfigResponse(AvailableCreditLimit availableCreditLimit, Boolean bool, Long l, Long l2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.available_credit_limit = availableCreditLimit;
        this.card_on_file = bool;
        this.loan_limit = l;
        this.active_loans = l2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetMerchantConfigResponse)) {
            return false;
        }
        GetMerchantConfigResponse getMerchantConfigResponse = (GetMerchantConfigResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getMerchantConfigResponse.unknownFields()) && Intrinsics.areEqual(this.available_credit_limit, getMerchantConfigResponse.available_credit_limit) && Intrinsics.areEqual(this.card_on_file, getMerchantConfigResponse.card_on_file) && Intrinsics.areEqual(this.loan_limit, getMerchantConfigResponse.loan_limit) && Intrinsics.areEqual(this.active_loans, getMerchantConfigResponse.active_loans);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        AvailableCreditLimit availableCreditLimit = this.available_credit_limit;
        int hashCode2 = (hashCode + (availableCreditLimit != null ? availableCreditLimit.hashCode() : 0)) * 37;
        Boolean bool = this.card_on_file;
        int hashCode3 = (hashCode2 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        Long l = this.loan_limit;
        int hashCode4 = (hashCode3 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        Long l2 = this.active_loans;
        int hashCode5 = hashCode4 + (l2 != null ? Long.hashCode(l2.longValue()) : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Allowed.Builder builder = new Allowed.Builder(22);
        builder.card_encryption_data = this.available_credit_limit;
        builder.customer_token_hash_email = this.card_on_file;
        builder.device_metadata = this.loan_limit;
        builder.success_screen = this.active_loans;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        AvailableCreditLimit availableCreditLimit = this.available_credit_limit;
        if (availableCreditLimit != null) {
            arrayList.add("available_credit_limit=" + availableCreditLimit);
        }
        Boolean bool = this.card_on_file;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("card_on_file=", bool, arrayList);
        }
        Long l = this.loan_limit;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("loan_limit=", l, arrayList);
        }
        Long l2 = this.active_loans;
        if (l2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("active_loans=", l2, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetMerchantConfigResponse{", "}", 0, null, null, 56);
    }
}
