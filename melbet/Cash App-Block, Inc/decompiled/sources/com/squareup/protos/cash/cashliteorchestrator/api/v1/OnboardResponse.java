package com.squareup.protos.cash.cashliteorchestrator.api.v1;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.security.mri.api.v1.Identifiers;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/OnboardResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/security/mri/api/v1/Identifiers$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class OnboardResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<OnboardResponse> CREATOR;
    public final String bitcoin_deposit_address;
    public final String evm_wallet_address;
    public final String spark_identity_public_key;
    public final String spark_wallet_address;
    public final String sub_org_id;
    public final String svm_wallet_address;

    static {
        OnboardResponse$Companion$ADAPTER$1 onboardResponse$Companion$ADAPTER$1 = new OnboardResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(OnboardResponse.class), "type.googleapis.com/squareup.cash.cashliteorchestrator.api.v1beta1.OnboardResponse", Syntax.PROTO_2, null, "squareup/cash/cashliteorchestrator/api/v1beta1/orchestrator.proto");
        ADAPTER = onboardResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(onboardResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardResponse(String str, String str2, String str3, String str4, String str5, String str6, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.sub_org_id = str;
        this.evm_wallet_address = str2;
        this.spark_wallet_address = str3;
        this.spark_identity_public_key = str4;
        this.svm_wallet_address = str5;
        this.bitcoin_deposit_address = str6;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OnboardResponse)) {
            return false;
        }
        OnboardResponse onboardResponse = (OnboardResponse) obj;
        return Intrinsics.areEqual(unknownFields(), onboardResponse.unknownFields()) && Intrinsics.areEqual(this.sub_org_id, onboardResponse.sub_org_id) && Intrinsics.areEqual(this.evm_wallet_address, onboardResponse.evm_wallet_address) && Intrinsics.areEqual(this.spark_wallet_address, onboardResponse.spark_wallet_address) && Intrinsics.areEqual(this.spark_identity_public_key, onboardResponse.spark_identity_public_key) && Intrinsics.areEqual(this.svm_wallet_address, onboardResponse.svm_wallet_address) && Intrinsics.areEqual(this.bitcoin_deposit_address, onboardResponse.bitcoin_deposit_address);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.sub_org_id;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.evm_wallet_address;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.spark_wallet_address;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.spark_identity_public_key;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.svm_wallet_address;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 37;
        String str6 = this.bitcoin_deposit_address;
        int hashCode7 = hashCode6 + (str6 != null ? str6.hashCode() : 0);
        this.hashCode = hashCode7;
        return hashCode7;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Identifiers.Builder builder = new Identifiers.Builder(3);
        builder.operating_system = this.sub_org_id;
        builder.operating_system_version = this.evm_wallet_address;
        builder.app_version = this.spark_wallet_address;
        builder.app_token = this.spark_identity_public_key;
        builder.device_id = this.svm_wallet_address;
        builder.vendor_id = this.bitcoin_deposit_address;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.sub_org_id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "sub_org_id=", arrayList);
        }
        String str2 = this.evm_wallet_address;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "evm_wallet_address=", arrayList);
        }
        String str3 = this.spark_wallet_address;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "spark_wallet_address=", arrayList);
        }
        String str4 = this.spark_identity_public_key;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "spark_identity_public_key=", arrayList);
        }
        String str5 = this.svm_wallet_address;
        if (str5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "svm_wallet_address=", arrayList);
        }
        String str6 = this.bitcoin_deposit_address;
        if (str6 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str6, "bitcoin_deposit_address=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "OnboardResponse{", "}", 0, null, null, 56);
    }
}
