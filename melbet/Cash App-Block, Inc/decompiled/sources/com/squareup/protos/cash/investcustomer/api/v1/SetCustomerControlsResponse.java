package com.squareup.protos.cash.investcustomer.api.v1;

import android.os.Parcelable;
import com.squareup.protos.cash.groups.GroupParticipant;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/investcustomer/api/v1/SetCustomerControlsResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/groups/GroupParticipant$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SetCustomerControlsResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SetCustomerControlsResponse> CREATOR;
    public final CustomerControls customer_controls;

    static {
        SetCustomerControlsResponse$Companion$ADAPTER$1 setCustomerControlsResponse$Companion$ADAPTER$1 = new SetCustomerControlsResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SetCustomerControlsResponse.class), "type.googleapis.com/squareup.cash.investcustomer.api.v1.SetCustomerControlsResponse", Syntax.PROTO_2, null, "squareup/cash/investcustomer/api/v1/service.proto");
        ADAPTER = setCustomerControlsResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(setCustomerControlsResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetCustomerControlsResponse(CustomerControls customerControls, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.customer_controls = customerControls;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SetCustomerControlsResponse)) {
            return false;
        }
        SetCustomerControlsResponse setCustomerControlsResponse = (SetCustomerControlsResponse) obj;
        return Intrinsics.areEqual(unknownFields(), setCustomerControlsResponse.unknownFields()) && Intrinsics.areEqual(this.customer_controls, setCustomerControlsResponse.customer_controls);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        CustomerControls customerControls = this.customer_controls;
        int hashCode2 = hashCode + (customerControls != null ? customerControls.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        GroupParticipant.Builder builder = new GroupParticipant.Builder(8);
        builder.f1276type = this.customer_controls;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        CustomerControls customerControls = this.customer_controls;
        if (customerControls != null) {
            arrayList.add("customer_controls=" + customerControls);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SetCustomerControlsResponse{", "}", 0, null, null, 56);
    }
}
