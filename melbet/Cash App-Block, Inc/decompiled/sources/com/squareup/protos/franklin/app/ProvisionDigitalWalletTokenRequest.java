package com.squareup.protos.franklin.app;

import android.os.Parcelable;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.app.BankingConfig;
import com.squareup.protos.franklin.common.DigitalWalletTokenProvisioningRequestData;
import com.squareup.protos.franklin.common.RequestContext;
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
public final class ProvisionDigitalWalletTokenRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ProvisionDigitalWalletTokenRequest> CREATOR;
    public final DigitalWalletTokenProvisioningRequestData provisioning_request;
    public final RequestContext request_context;

    static {
        ProvisionDigitalWalletTokenRequest$Companion$ADAPTER$1 provisionDigitalWalletTokenRequest$Companion$ADAPTER$1 = new ProvisionDigitalWalletTokenRequest$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ProvisionDigitalWalletTokenRequest.class), "type.googleapis.com/squareup.franklin.app.ProvisionDigitalWalletTokenRequest", Syntax.PROTO_2, null, "squareup/franklin/app/digital_wallet_token.proto");
        ADAPTER = provisionDigitalWalletTokenRequest$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(provisionDigitalWalletTokenRequest$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProvisionDigitalWalletTokenRequest(DigitalWalletTokenProvisioningRequestData digitalWalletTokenProvisioningRequestData, RequestContext requestContext, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.provisioning_request = digitalWalletTokenProvisioningRequestData;
        this.request_context = requestContext;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProvisionDigitalWalletTokenRequest)) {
            return false;
        }
        ProvisionDigitalWalletTokenRequest provisionDigitalWalletTokenRequest = (ProvisionDigitalWalletTokenRequest) obj;
        return Intrinsics.areEqual(unknownFields(), provisionDigitalWalletTokenRequest.unknownFields()) && Intrinsics.areEqual(this.provisioning_request, provisionDigitalWalletTokenRequest.provisioning_request) && Intrinsics.areEqual(this.request_context, provisionDigitalWalletTokenRequest.request_context);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        DigitalWalletTokenProvisioningRequestData digitalWalletTokenProvisioningRequestData = this.provisioning_request;
        int hashCode2 = (hashCode + (digitalWalletTokenProvisioningRequestData != null ? digitalWalletTokenProvisioningRequestData.hashCode() : 0)) * 37;
        RequestContext requestContext = this.request_context;
        int hashCode3 = hashCode2 + (requestContext != null ? requestContext.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        BankingConfig.Builder builder = new BankingConfig.Builder(22);
        builder.strings = this.provisioning_request;
        builder.recurring_deposits_dda_upsell = this.request_context;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        DigitalWalletTokenProvisioningRequestData digitalWalletTokenProvisioningRequestData = this.provisioning_request;
        if (digitalWalletTokenProvisioningRequestData != null) {
            arrayList.add("provisioning_request=" + digitalWalletTokenProvisioningRequestData);
        }
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ProvisionDigitalWalletTokenRequest{", "}", 0, null, null, 56);
    }
}
