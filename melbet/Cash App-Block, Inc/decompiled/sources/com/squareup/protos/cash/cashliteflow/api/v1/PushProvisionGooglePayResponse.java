package com.squareup.protos.cash.cashliteflow.api.v1;

import android.os.Parcelable;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashliteflow.api.v1.Row;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/cashliteflow/api/v1/PushProvisionGooglePayResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/cashliteflow/api/v1/Row$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PushProvisionGooglePayResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<PushProvisionGooglePayResponse> CREATOR;
    public final String opaque_payment_card;
    public final ResponseContext response_context;
    public final PushProvisionStatus status;

    static {
        PushProvisionGooglePayResponse$Companion$ADAPTER$1 pushProvisionGooglePayResponse$Companion$ADAPTER$1 = new PushProvisionGooglePayResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(PushProvisionGooglePayResponse.class), "type.googleapis.com/squareup.cash.cashliteflow.api.v1beta1.PushProvisionGooglePayResponse", Syntax.PROTO_2, null, "squareup/cash/cashliteflow/api/v1beta1/push_provision_digital_wallet_token.proto");
        ADAPTER = pushProvisionGooglePayResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(pushProvisionGooglePayResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PushProvisionGooglePayResponse(String str, ResponseContext responseContext, PushProvisionStatus pushProvisionStatus, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.opaque_payment_card = str;
        this.response_context = responseContext;
        this.status = pushProvisionStatus;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PushProvisionGooglePayResponse)) {
            return false;
        }
        PushProvisionGooglePayResponse pushProvisionGooglePayResponse = (PushProvisionGooglePayResponse) obj;
        return Intrinsics.areEqual(unknownFields(), pushProvisionGooglePayResponse.unknownFields()) && Intrinsics.areEqual(this.opaque_payment_card, pushProvisionGooglePayResponse.opaque_payment_card) && Intrinsics.areEqual(this.response_context, pushProvisionGooglePayResponse.response_context) && this.status == pushProvisionGooglePayResponse.status;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.opaque_payment_card;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        ResponseContext responseContext = this.response_context;
        int hashCode3 = (hashCode2 + (responseContext != null ? responseContext.hashCode() : 0)) * 37;
        PushProvisionStatus pushProvisionStatus = this.status;
        int hashCode4 = hashCode3 + (pushProvisionStatus != null ? pushProvisionStatus.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Row.Builder builder = new Row.Builder(13);
        builder.title = this.opaque_payment_card;
        builder.subtitle = this.response_context;
        builder.action = this.status;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.opaque_payment_card != null) {
            arrayList.add("opaque_payment_card=██");
        }
        ResponseContext responseContext = this.response_context;
        if (responseContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("response_context=", responseContext, arrayList);
        }
        PushProvisionStatus pushProvisionStatus = this.status;
        if (pushProvisionStatus != null) {
            arrayList.add("status=" + pushProvisionStatus);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PushProvisionGooglePayResponse{", "}", 0, null, null, 56);
    }
}
