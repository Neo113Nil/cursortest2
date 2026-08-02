package com.squareup.protos.franklin.app;

import android.os.Parcelable;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.app.BankingConfig;
import com.squareup.protos.franklin.common.DigitalWalletTokenProvisioningCompletionData;
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
public final class CompleteDigitalWalletTokenProvisioningRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CompleteDigitalWalletTokenProvisioningRequest> CREATOR;
    public final DigitalWalletTokenProvisioningCompletionData completion_request;
    public final RequestContext request_context;

    static {
        CompleteDigitalWalletTokenProvisioningRequest$Companion$ADAPTER$1 completeDigitalWalletTokenProvisioningRequest$Companion$ADAPTER$1 = new CompleteDigitalWalletTokenProvisioningRequest$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CompleteDigitalWalletTokenProvisioningRequest.class), "type.googleapis.com/squareup.franklin.app.CompleteDigitalWalletTokenProvisioningRequest", Syntax.PROTO_2, null, "squareup/franklin/app/digital_wallet_token.proto");
        ADAPTER = completeDigitalWalletTokenProvisioningRequest$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(completeDigitalWalletTokenProvisioningRequest$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CompleteDigitalWalletTokenProvisioningRequest(RequestContext requestContext, DigitalWalletTokenProvisioningCompletionData digitalWalletTokenProvisioningCompletionData, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.request_context = requestContext;
        this.completion_request = digitalWalletTokenProvisioningCompletionData;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CompleteDigitalWalletTokenProvisioningRequest)) {
            return false;
        }
        CompleteDigitalWalletTokenProvisioningRequest completeDigitalWalletTokenProvisioningRequest = (CompleteDigitalWalletTokenProvisioningRequest) obj;
        return Intrinsics.areEqual(unknownFields(), completeDigitalWalletTokenProvisioningRequest.unknownFields()) && Intrinsics.areEqual(this.request_context, completeDigitalWalletTokenProvisioningRequest.request_context) && Intrinsics.areEqual(this.completion_request, completeDigitalWalletTokenProvisioningRequest.completion_request);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        RequestContext requestContext = this.request_context;
        int hashCode2 = (hashCode + (requestContext != null ? requestContext.hashCode() : 0)) * 37;
        DigitalWalletTokenProvisioningCompletionData digitalWalletTokenProvisioningCompletionData = this.completion_request;
        int hashCode3 = hashCode2 + (digitalWalletTokenProvisioningCompletionData != null ? digitalWalletTokenProvisioningCompletionData.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        BankingConfig.Builder builder = new BankingConfig.Builder(9);
        builder.strings = this.request_context;
        builder.recurring_deposits_dda_upsell = this.completion_request;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        DigitalWalletTokenProvisioningCompletionData digitalWalletTokenProvisioningCompletionData = this.completion_request;
        if (digitalWalletTokenProvisioningCompletionData != null) {
            arrayList.add("completion_request=" + digitalWalletTokenProvisioningCompletionData);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CompleteDigitalWalletTokenProvisioningRequest{", "}", 0, null, null, 56);
    }

    public /* synthetic */ CompleteDigitalWalletTokenProvisioningRequest(RequestContext requestContext, DigitalWalletTokenProvisioningCompletionData digitalWalletTokenProvisioningCompletionData) {
        this(requestContext, digitalWalletTokenProvisioningCompletionData, ByteString.EMPTY);
    }
}
