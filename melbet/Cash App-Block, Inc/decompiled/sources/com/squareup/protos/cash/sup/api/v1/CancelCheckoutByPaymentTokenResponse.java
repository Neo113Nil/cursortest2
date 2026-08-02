package com.squareup.protos.cash.sup.api.v1;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.api.ResponseMetadata;
import com.squareup.protos.cash.ui.SplitButtons;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/sup/api/v1/CancelCheckoutByPaymentTokenResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/ui/SplitButtons$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class CancelCheckoutByPaymentTokenResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CancelCheckoutByPaymentTokenResponse> CREATOR;
    public final ResponseMetadata metadata;
    public final Long sleep_duration_ms;

    static {
        CancelCheckoutByPaymentTokenResponse$Companion$ADAPTER$1 cancelCheckoutByPaymentTokenResponse$Companion$ADAPTER$1 = new CancelCheckoutByPaymentTokenResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CancelCheckoutByPaymentTokenResponse.class), "type.googleapis.com/squareup.cash.sup.api.v1.CancelCheckoutByPaymentTokenResponse", Syntax.PROTO_2, null, "squareup/cash/sup/api/v1/checkout.proto");
        ADAPTER = cancelCheckoutByPaymentTokenResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(cancelCheckoutByPaymentTokenResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CancelCheckoutByPaymentTokenResponse(ResponseMetadata responseMetadata, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.metadata = responseMetadata;
        this.sleep_duration_ms = l;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CancelCheckoutByPaymentTokenResponse)) {
            return false;
        }
        CancelCheckoutByPaymentTokenResponse cancelCheckoutByPaymentTokenResponse = (CancelCheckoutByPaymentTokenResponse) obj;
        return Intrinsics.areEqual(unknownFields(), cancelCheckoutByPaymentTokenResponse.unknownFields()) && Intrinsics.areEqual(this.metadata, cancelCheckoutByPaymentTokenResponse.metadata) && Intrinsics.areEqual(this.sleep_duration_ms, cancelCheckoutByPaymentTokenResponse.sleep_duration_ms);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ResponseMetadata responseMetadata = this.metadata;
        int hashCode2 = (hashCode + (responseMetadata != null ? responseMetadata.hashCode() : 0)) * 37;
        Long l = this.sleep_duration_ms;
        int hashCode3 = hashCode2 + (l != null ? Long.hashCode(l.longValue()) : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        SplitButtons.Builder builder = new SplitButtons.Builder(9);
        builder.primary_button = this.metadata;
        builder.secondary_button = this.sleep_duration_ms;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ResponseMetadata responseMetadata = this.metadata;
        if (responseMetadata != null) {
            arrayList.add("metadata=" + responseMetadata);
        }
        Long l = this.sleep_duration_ms;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("sleep_duration_ms=", l, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CancelCheckoutByPaymentTokenResponse{", "}", 0, null, null, 56);
    }
}
