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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/sup/api/v1/CancelCheckoutResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/ui/SplitButtons$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class CancelCheckoutResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CancelCheckoutResponse> CREATOR;
    public final Boolean cancel_confirmed;
    public final ResponseMetadata metadata;

    static {
        CancelCheckoutResponse$Companion$ADAPTER$1 cancelCheckoutResponse$Companion$ADAPTER$1 = new CancelCheckoutResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CancelCheckoutResponse.class), "type.googleapis.com/squareup.cash.sup.api.v1.CancelCheckoutResponse", Syntax.PROTO_2, null, "squareup/cash/sup/api/v1/checkout.proto");
        ADAPTER = cancelCheckoutResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(cancelCheckoutResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CancelCheckoutResponse(Boolean bool, ResponseMetadata responseMetadata, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.cancel_confirmed = bool;
        this.metadata = responseMetadata;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CancelCheckoutResponse)) {
            return false;
        }
        CancelCheckoutResponse cancelCheckoutResponse = (CancelCheckoutResponse) obj;
        return Intrinsics.areEqual(unknownFields(), cancelCheckoutResponse.unknownFields()) && Intrinsics.areEqual(this.cancel_confirmed, cancelCheckoutResponse.cancel_confirmed) && Intrinsics.areEqual(this.metadata, cancelCheckoutResponse.metadata);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Boolean bool = this.cancel_confirmed;
        int hashCode2 = (hashCode + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        ResponseMetadata responseMetadata = this.metadata;
        int hashCode3 = hashCode2 + (responseMetadata != null ? responseMetadata.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        SplitButtons.Builder builder = new SplitButtons.Builder(10);
        builder.primary_button = this.cancel_confirmed;
        builder.secondary_button = this.metadata;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Boolean bool = this.cancel_confirmed;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("cancel_confirmed=", bool, arrayList);
        }
        ResponseMetadata responseMetadata = this.metadata;
        if (responseMetadata != null) {
            arrayList.add("metadata=" + responseMetadata);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CancelCheckoutResponse{", "}", 0, null, null, 56);
    }
}
