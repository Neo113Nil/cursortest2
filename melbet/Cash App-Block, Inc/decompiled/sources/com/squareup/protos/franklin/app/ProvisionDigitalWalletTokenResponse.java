package com.squareup.protos.franklin.app;

import android.os.Parcelable;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.app.BankingConfig;
import com.squareup.protos.franklin.common.DigitalWalletTokenProvisioningResponseData;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/franklin/app/ProvisionDigitalWalletTokenResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/app/BankingConfig$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ProvisionDigitalWalletTokenResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ProvisionDigitalWalletTokenResponse> CREATOR;
    public final DigitalWalletTokenProvisioningResponseData provisioning_response;
    public final ResponseContext response_context;

    static {
        ProvisionDigitalWalletTokenResponse$Companion$ADAPTER$1 provisionDigitalWalletTokenResponse$Companion$ADAPTER$1 = new ProvisionDigitalWalletTokenResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ProvisionDigitalWalletTokenResponse.class), "type.googleapis.com/squareup.franklin.app.ProvisionDigitalWalletTokenResponse", Syntax.PROTO_2, null, "squareup/franklin/app/digital_wallet_token.proto");
        ADAPTER = provisionDigitalWalletTokenResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(provisionDigitalWalletTokenResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProvisionDigitalWalletTokenResponse(DigitalWalletTokenProvisioningResponseData digitalWalletTokenProvisioningResponseData, ResponseContext responseContext, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.provisioning_response = digitalWalletTokenProvisioningResponseData;
        this.response_context = responseContext;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProvisionDigitalWalletTokenResponse)) {
            return false;
        }
        ProvisionDigitalWalletTokenResponse provisionDigitalWalletTokenResponse = (ProvisionDigitalWalletTokenResponse) obj;
        return Intrinsics.areEqual(unknownFields(), provisionDigitalWalletTokenResponse.unknownFields()) && Intrinsics.areEqual(this.provisioning_response, provisionDigitalWalletTokenResponse.provisioning_response) && Intrinsics.areEqual(this.response_context, provisionDigitalWalletTokenResponse.response_context);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        DigitalWalletTokenProvisioningResponseData digitalWalletTokenProvisioningResponseData = this.provisioning_response;
        int hashCode2 = (hashCode + (digitalWalletTokenProvisioningResponseData != null ? digitalWalletTokenProvisioningResponseData.hashCode() : 0)) * 37;
        ResponseContext responseContext = this.response_context;
        int hashCode3 = hashCode2 + (responseContext != null ? responseContext.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        BankingConfig.Builder builder = new BankingConfig.Builder(23);
        builder.strings = this.provisioning_response;
        builder.recurring_deposits_dda_upsell = this.response_context;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        DigitalWalletTokenProvisioningResponseData digitalWalletTokenProvisioningResponseData = this.provisioning_response;
        if (digitalWalletTokenProvisioningResponseData != null) {
            arrayList.add("provisioning_response=" + digitalWalletTokenProvisioningResponseData);
        }
        ResponseContext responseContext = this.response_context;
        if (responseContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("response_context=", responseContext, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ProvisionDigitalWalletTokenResponse{", "}", 0, null, null, 56);
    }
}
