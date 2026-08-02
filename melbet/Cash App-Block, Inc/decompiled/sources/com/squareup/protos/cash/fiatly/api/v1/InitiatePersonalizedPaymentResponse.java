package com.squareup.protos.cash.fiatly.api.v1;

import android.os.Parcelable;
import com.squareup.protos.cash.composer.app.Asset;
import com.squareup.protos.franklin.app.InitiatePaymentResponse;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/fiatly/api/v1/InitiatePersonalizedPaymentResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/composer/app/Asset$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class InitiatePersonalizedPaymentResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<InitiatePersonalizedPaymentResponse> CREATOR;
    public final InitiatePaymentResponse response;

    static {
        InitiatePersonalizedPaymentResponse$Companion$ADAPTER$1 initiatePersonalizedPaymentResponse$Companion$ADAPTER$1 = new InitiatePersonalizedPaymentResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(InitiatePersonalizedPaymentResponse.class), "type.googleapis.com/squareup.cash.fiatly.api.v1.InitiatePersonalizedPaymentResponse", Syntax.PROTO_2, null, "squareup/cash/fiatly/api/v1/personalized_payment.proto");
        ADAPTER = initiatePersonalizedPaymentResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(initiatePersonalizedPaymentResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitiatePersonalizedPaymentResponse(InitiatePaymentResponse initiatePaymentResponse, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.response = initiatePaymentResponse;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InitiatePersonalizedPaymentResponse)) {
            return false;
        }
        InitiatePersonalizedPaymentResponse initiatePersonalizedPaymentResponse = (InitiatePersonalizedPaymentResponse) obj;
        return Intrinsics.areEqual(unknownFields(), initiatePersonalizedPaymentResponse.unknownFields()) && Intrinsics.areEqual(this.response, initiatePersonalizedPaymentResponse.response);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        InitiatePaymentResponse initiatePaymentResponse = this.response;
        int hashCode2 = hashCode + (initiatePaymentResponse != null ? initiatePaymentResponse.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Asset.Builder builder = new Asset.Builder(18);
        builder.asset_type = this.response;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        InitiatePaymentResponse initiatePaymentResponse = this.response;
        if (initiatePaymentResponse != null) {
            arrayList.add("response=" + initiatePaymentResponse);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "InitiatePersonalizedPaymentResponse{", "}", 0, null, null, 56);
    }
}
