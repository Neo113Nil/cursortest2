package com.squareup.protos.cash.taply.app.v1;

import android.os.Parcelable;
import com.squareup.protos.franklin.api.FidesmoProvisioningBlocker;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/taply/app/v1/GetCustomerDetailsForDeprovisioningResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/taply/app/v1/GetCustomerDetailsForDeprovisioningResponse$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class GetCustomerDetailsForDeprovisioningResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetCustomerDetailsForDeprovisioningResponse> CREATOR;
    public final String customer_token_hash_email;
    public final FidesmoProvisioningBlocker.PreScanUiConfig pre_scan;
    public final FidesmoProvisioningBlocker.ErrorUiConfigs reset_errors;

    public final class Builder extends Message.Builder {
        public String customer_token_hash_email;
        public FidesmoProvisioningBlocker.PreScanUiConfig pre_scan;
        public FidesmoProvisioningBlocker.ErrorUiConfigs reset_errors;

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            return new GetCustomerDetailsForDeprovisioningResponse(this.customer_token_hash_email, this.pre_scan, this.reset_errors, buildUnknownFields());
        }
    }

    static {
        GetCustomerDetailsForDeprovisioningResponse$Companion$ADAPTER$1 getCustomerDetailsForDeprovisioningResponse$Companion$ADAPTER$1 = new GetCustomerDetailsForDeprovisioningResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetCustomerDetailsForDeprovisioningResponse.class), "type.googleapis.com/squareup.cash.taply.app.v1beta1.GetCustomerDetailsForDeprovisioningResponse", Syntax.PROTO_2, null, "squareup/cash/taply/app/v1beta1/get_customer_details_for_deprovisioning.proto");
        ADAPTER = getCustomerDetailsForDeprovisioningResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getCustomerDetailsForDeprovisioningResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetCustomerDetailsForDeprovisioningResponse(String str, FidesmoProvisioningBlocker.PreScanUiConfig preScanUiConfig, FidesmoProvisioningBlocker.ErrorUiConfigs errorUiConfigs, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.customer_token_hash_email = str;
        this.pre_scan = preScanUiConfig;
        this.reset_errors = errorUiConfigs;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetCustomerDetailsForDeprovisioningResponse)) {
            return false;
        }
        GetCustomerDetailsForDeprovisioningResponse getCustomerDetailsForDeprovisioningResponse = (GetCustomerDetailsForDeprovisioningResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getCustomerDetailsForDeprovisioningResponse.unknownFields()) && Intrinsics.areEqual(this.customer_token_hash_email, getCustomerDetailsForDeprovisioningResponse.customer_token_hash_email) && Intrinsics.areEqual(this.pre_scan, getCustomerDetailsForDeprovisioningResponse.pre_scan) && Intrinsics.areEqual(this.reset_errors, getCustomerDetailsForDeprovisioningResponse.reset_errors);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.customer_token_hash_email;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        FidesmoProvisioningBlocker.PreScanUiConfig preScanUiConfig = this.pre_scan;
        int hashCode3 = (hashCode2 + (preScanUiConfig != null ? preScanUiConfig.hashCode() : 0)) * 37;
        FidesmoProvisioningBlocker.ErrorUiConfigs errorUiConfigs = this.reset_errors;
        int hashCode4 = hashCode3 + (errorUiConfigs != null ? errorUiConfigs.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.customer_token_hash_email = this.customer_token_hash_email;
        builder.pre_scan = this.pre_scan;
        builder.reset_errors = this.reset_errors;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.customer_token_hash_email != null) {
            arrayList.add("customer_token_hash_email=██");
        }
        FidesmoProvisioningBlocker.PreScanUiConfig preScanUiConfig = this.pre_scan;
        if (preScanUiConfig != null) {
            arrayList.add("pre_scan=" + preScanUiConfig);
        }
        FidesmoProvisioningBlocker.ErrorUiConfigs errorUiConfigs = this.reset_errors;
        if (errorUiConfigs != null) {
            arrayList.add("reset_errors=" + errorUiConfigs);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetCustomerDetailsForDeprovisioningResponse{", "}", 0, null, null, 56);
    }
}
