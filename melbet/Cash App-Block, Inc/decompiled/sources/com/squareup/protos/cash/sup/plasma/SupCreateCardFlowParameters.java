package com.squareup.protos.cash.sup.plasma;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.api.SupportConfig;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class SupCreateCardFlowParameters extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SupCreateCardFlowParameters> CREATOR;
    public final String cart_details_json;
    public final String merchant_token;
    public final String referral_flow_token;

    static {
        SupCreateCardFlowParameters$Companion$ADAPTER$1 supCreateCardFlowParameters$Companion$ADAPTER$1 = new SupCreateCardFlowParameters$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SupCreateCardFlowParameters.class), "type.googleapis.com/squareup.cash.sup.plasma.v1.SupCreateCardFlowParameters", Syntax.PROTO_2, null, "squareup/cash/sup/plasma/v1/sup_create_card_flow.proto");
        ADAPTER = supCreateCardFlowParameters$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(supCreateCardFlowParameters$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SupCreateCardFlowParameters(String str, String str2, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.cart_details_json = str;
        this.merchant_token = str2;
        this.referral_flow_token = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SupCreateCardFlowParameters)) {
            return false;
        }
        SupCreateCardFlowParameters supCreateCardFlowParameters = (SupCreateCardFlowParameters) obj;
        return Intrinsics.areEqual(unknownFields(), supCreateCardFlowParameters.unknownFields()) && Intrinsics.areEqual(this.cart_details_json, supCreateCardFlowParameters.cart_details_json) && Intrinsics.areEqual(this.merchant_token, supCreateCardFlowParameters.merchant_token) && Intrinsics.areEqual(this.referral_flow_token, supCreateCardFlowParameters.referral_flow_token);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.cart_details_json;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.merchant_token;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.referral_flow_token;
        int hashCode4 = hashCode3 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        SupportConfig.Builder builder = new SupportConfig.Builder(26);
        builder.contact_support_url = this.cart_details_json;
        builder.privacy_policy_url = this.merchant_token;
        builder.terms_of_service_url = this.referral_flow_token;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.cart_details_json != null) {
            arrayList.add("cart_details_json=██");
        }
        String str = this.merchant_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "merchant_token=", arrayList);
        }
        String str2 = this.referral_flow_token;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "referral_flow_token=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SupCreateCardFlowParameters{", "}", 0, null, null, 56);
    }
}
