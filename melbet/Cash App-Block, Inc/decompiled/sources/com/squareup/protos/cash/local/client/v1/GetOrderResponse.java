package com.squareup.protos.cash.local.client.v1;

import android.os.Parcelable;
import com.datadog.android.rum.internal.utils.SdkCoreExtKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.groups.Group;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/GetOrderResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/groups/Group$Builder;", "Builder", "com/datadog/android/rum/internal/utils/SdkCoreExtKt", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GetOrderResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetOrderResponse> CREATOR;
    public final String account_creation_intent_token;
    public final SdkCoreExtKt response;
    public final SignupOrEnrollUpsell signup_or_enroll_upsell;

    static {
        GetOrderResponse$Companion$ADAPTER$1 getOrderResponse$Companion$ADAPTER$1 = new GetOrderResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetOrderResponse.class), "type.googleapis.com/squareup.cash.local.client.v1.GetOrderResponse", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/cash_app_local_client_service.proto");
        ADAPTER = getOrderResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getOrderResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetOrderResponse(SdkCoreExtKt sdkCoreExtKt, SignupOrEnrollUpsell signupOrEnrollUpsell, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.response = sdkCoreExtKt;
        this.signup_or_enroll_upsell = signupOrEnrollUpsell;
        this.account_creation_intent_token = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetOrderResponse)) {
            return false;
        }
        GetOrderResponse getOrderResponse = (GetOrderResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getOrderResponse.unknownFields()) && Intrinsics.areEqual(this.response, getOrderResponse.response) && Intrinsics.areEqual(this.signup_or_enroll_upsell, getOrderResponse.signup_or_enroll_upsell) && Intrinsics.areEqual(this.account_creation_intent_token, getOrderResponse.account_creation_intent_token);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        SdkCoreExtKt sdkCoreExtKt = this.response;
        int hashCode2 = (hashCode + (sdkCoreExtKt != null ? sdkCoreExtKt.hashCode() : 0)) * 37;
        SignupOrEnrollUpsell signupOrEnrollUpsell = this.signup_or_enroll_upsell;
        int hashCode3 = (hashCode2 + (signupOrEnrollUpsell != null ? signupOrEnrollUpsell.hashCode() : 0)) * 37;
        String str = this.account_creation_intent_token;
        int hashCode4 = hashCode3 + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Group.Builder builder = new Group.Builder(20);
        builder.group_image = this.response;
        builder.participants = this.signup_or_enroll_upsell;
        builder.name = this.account_creation_intent_token;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        SdkCoreExtKt sdkCoreExtKt = this.response;
        if (sdkCoreExtKt != null) {
            arrayList.add("response=" + sdkCoreExtKt);
        }
        SignupOrEnrollUpsell signupOrEnrollUpsell = this.signup_or_enroll_upsell;
        if (signupOrEnrollUpsell != null) {
            arrayList.add("signup_or_enroll_upsell=" + signupOrEnrollUpsell);
        }
        String str = this.account_creation_intent_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "account_creation_intent_token=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetOrderResponse{", "}", 0, null, null, 56);
    }
}
