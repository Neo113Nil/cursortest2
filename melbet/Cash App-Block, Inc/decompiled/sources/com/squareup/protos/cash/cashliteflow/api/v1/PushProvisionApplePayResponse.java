package com.squareup.protos.cash.cashliteflow.api.v1;

import android.os.Parcelable;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashregistrar.Account;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/cashliteflow/api/v1/PushProvisionApplePayResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/cashregistrar/Account$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PushProvisionApplePayResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<PushProvisionApplePayResponse> CREATOR;
    public final String activation_data;
    public final String encrypted_pass_data;
    public final String ephemeral_public_key;
    public final ResponseContext response_context;
    public final PushProvisionStatus status;

    static {
        PushProvisionApplePayResponse$Companion$ADAPTER$1 pushProvisionApplePayResponse$Companion$ADAPTER$1 = new PushProvisionApplePayResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(PushProvisionApplePayResponse.class), "type.googleapis.com/squareup.cash.cashliteflow.api.v1beta1.PushProvisionApplePayResponse", Syntax.PROTO_2, null, "squareup/cash/cashliteflow/api/v1beta1/push_provision_digital_wallet_token.proto");
        ADAPTER = pushProvisionApplePayResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(pushProvisionApplePayResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PushProvisionApplePayResponse(ResponseContext responseContext, String str, String str2, String str3, PushProvisionStatus pushProvisionStatus, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.response_context = responseContext;
        this.encrypted_pass_data = str;
        this.activation_data = str2;
        this.ephemeral_public_key = str3;
        this.status = pushProvisionStatus;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PushProvisionApplePayResponse)) {
            return false;
        }
        PushProvisionApplePayResponse pushProvisionApplePayResponse = (PushProvisionApplePayResponse) obj;
        return Intrinsics.areEqual(unknownFields(), pushProvisionApplePayResponse.unknownFields()) && Intrinsics.areEqual(this.response_context, pushProvisionApplePayResponse.response_context) && Intrinsics.areEqual(this.encrypted_pass_data, pushProvisionApplePayResponse.encrypted_pass_data) && Intrinsics.areEqual(this.activation_data, pushProvisionApplePayResponse.activation_data) && Intrinsics.areEqual(this.ephemeral_public_key, pushProvisionApplePayResponse.ephemeral_public_key) && this.status == pushProvisionApplePayResponse.status;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ResponseContext responseContext = this.response_context;
        int hashCode2 = (hashCode + (responseContext != null ? responseContext.hashCode() : 0)) * 37;
        String str = this.encrypted_pass_data;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.activation_data;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.ephemeral_public_key;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 37;
        PushProvisionStatus pushProvisionStatus = this.status;
        int hashCode6 = hashCode5 + (pushProvisionStatus != null ? pushProvisionStatus.hashCode() : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Account.Builder builder = new Account.Builder(11, false);
        builder.account_type = this.response_context;
        builder.customer_token = this.encrypted_pass_data;
        builder.account_token = this.activation_data;
        builder.display_name = this.ephemeral_public_key;
        builder.is_sponsored_account = this.status;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ResponseContext responseContext = this.response_context;
        if (responseContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("response_context=", responseContext, arrayList);
        }
        if (this.encrypted_pass_data != null) {
            arrayList.add("encrypted_pass_data=██");
        }
        if (this.activation_data != null) {
            arrayList.add("activation_data=██");
        }
        if (this.ephemeral_public_key != null) {
            arrayList.add("ephemeral_public_key=██");
        }
        PushProvisionStatus pushProvisionStatus = this.status;
        if (pushProvisionStatus != null) {
            arrayList.add("status=" + pushProvisionStatus);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PushProvisionApplePayResponse{", "}", 0, null, null, 56);
    }
}
