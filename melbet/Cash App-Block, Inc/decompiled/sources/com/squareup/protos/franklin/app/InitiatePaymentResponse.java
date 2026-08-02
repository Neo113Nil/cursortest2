package com.squareup.protos.franklin.app;

import android.os.Parcelable;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.api.UiAlias;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/squareup/protos/franklin/app/InitiatePaymentResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/UiAlias$Builder;", "Builder", "Status", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class InitiatePaymentResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<InitiatePaymentResponse> CREATOR;
    public final ClaimData claim_data;
    public final ResponseContext response_context;
    public final Status status;

    /* loaded from: classes.dex */
    public enum Status implements WireEnum {
        INVALID(0),
        SUCCESS(1);

        public static final InitiatePaymentResponse$Status$Companion$ADAPTER$1 ADAPTER;
        public static final UiAlias.Type.Companion Companion;
        public final int value;

        static {
            Status status = INVALID;
            Companion = new UiAlias.Type.Companion();
            ADAPTER = new InitiatePaymentResponse$Status$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Status.class), Syntax.PROTO_2, status);
        }

        Status(int i) {
            this.value = i;
        }

        public static final Status fromValue(int i) {
            Companion.getClass();
            if (i == 0) {
                return INVALID;
            }
            if (i != 1) {
                return null;
            }
            return SUCCESS;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        InitiatePaymentResponse$Companion$ADAPTER$1 initiatePaymentResponse$Companion$ADAPTER$1 = new InitiatePaymentResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(InitiatePaymentResponse.class), "type.googleapis.com/squareup.franklin.app.InitiatePaymentResponse", Syntax.PROTO_2, null, "squareup/franklin/app/payment.proto");
        ADAPTER = initiatePaymentResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(initiatePaymentResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitiatePaymentResponse(ResponseContext responseContext, Status status, ClaimData claimData, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.response_context = responseContext;
        this.status = status;
        this.claim_data = claimData;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InitiatePaymentResponse)) {
            return false;
        }
        InitiatePaymentResponse initiatePaymentResponse = (InitiatePaymentResponse) obj;
        return Intrinsics.areEqual(unknownFields(), initiatePaymentResponse.unknownFields()) && Intrinsics.areEqual(this.response_context, initiatePaymentResponse.response_context) && this.status == initiatePaymentResponse.status && Intrinsics.areEqual(this.claim_data, initiatePaymentResponse.claim_data);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ResponseContext responseContext = this.response_context;
        int hashCode2 = (hashCode + (responseContext != null ? responseContext.hashCode() : 0)) * 37;
        Status status = this.status;
        int hashCode3 = (hashCode2 + (status != null ? status.hashCode() : 0)) * 37;
        ClaimData claimData = this.claim_data;
        int hashCode4 = hashCode3 + (claimData != null ? claimData.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        UiAlias.Builder builder = new UiAlias.Builder(25);
        builder.f1364type = this.response_context;
        builder.canonical_text = this.status;
        builder.formatted = this.claim_data;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ResponseContext responseContext = this.response_context;
        if (responseContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("response_context=", responseContext, arrayList);
        }
        Status status = this.status;
        if (status != null) {
            arrayList.add("status=" + status);
        }
        ClaimData claimData = this.claim_data;
        if (claimData != null) {
            arrayList.add("claim_data=" + claimData);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "InitiatePaymentResponse{", "}", 0, null, null, 56);
    }
}
