package com.squareup.protos.cash.investcustomer.api.v1;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.grantly.api.Card;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/investcustomer/api/v1/GetCustomerControlsResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/grantly/api/Card$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GetCustomerControlsResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetCustomerControlsResponse> CREATOR;
    public final CustomerControls customer_controls;
    public final String prerequisite_link;

    static {
        GetCustomerControlsResponse$Companion$ADAPTER$1 getCustomerControlsResponse$Companion$ADAPTER$1 = new GetCustomerControlsResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetCustomerControlsResponse.class), "type.googleapis.com/squareup.cash.investcustomer.api.v1.GetCustomerControlsResponse", Syntax.PROTO_2, null, "squareup/cash/investcustomer/api/v1/service.proto");
        ADAPTER = getCustomerControlsResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getCustomerControlsResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetCustomerControlsResponse(String str, CustomerControls customerControls, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.prerequisite_link = str;
        this.customer_controls = customerControls;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetCustomerControlsResponse)) {
            return false;
        }
        GetCustomerControlsResponse getCustomerControlsResponse = (GetCustomerControlsResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getCustomerControlsResponse.unknownFields()) && Intrinsics.areEqual(this.prerequisite_link, getCustomerControlsResponse.prerequisite_link) && Intrinsics.areEqual(this.customer_controls, getCustomerControlsResponse.customer_controls);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.prerequisite_link;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        CustomerControls customerControls = this.customer_controls;
        int hashCode3 = hashCode2 + (customerControls != null ? customerControls.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Card.Builder builder = new Card.Builder(8);
        builder.card_type = this.prerequisite_link;
        builder.card_pii = this.customer_controls;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.prerequisite_link;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "prerequisite_link=", arrayList);
        }
        CustomerControls customerControls = this.customer_controls;
        if (customerControls != null) {
            arrayList.add("customer_controls=" + customerControls);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetCustomerControlsResponse{", "}", 0, null, null, 56);
    }
}
