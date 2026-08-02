package com.squareup.protos.cash.cashcustomerprofile.api.v1;

import android.os.Parcelable;
import com.squareup.protos.cash.cashapproxy.api.Divider;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/cashcustomerprofile/api/v1/UpdateDisclosureAcceptanceResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/cashapproxy/api/Divider$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class UpdateDisclosureAcceptanceResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<UpdateDisclosureAcceptanceResponse> CREATOR;

    static {
        UpdateDisclosureAcceptanceResponse$Companion$ADAPTER$1 updateDisclosureAcceptanceResponse$Companion$ADAPTER$1 = new UpdateDisclosureAcceptanceResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(UpdateDisclosureAcceptanceResponse.class), "type.googleapis.com/squareup.cash.cashcustomerprofile.api.v1.UpdateDisclosureAcceptanceResponse", Syntax.PROTO_2, null, "squareup/cash/cashcustomerprofile/api/v1/update_disclosure_acceptance.proto");
        ADAPTER = updateDisclosureAcceptanceResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(updateDisclosureAcceptanceResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateDisclosureAcceptanceResponse(ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof UpdateDisclosureAcceptanceResponse) && Intrinsics.areEqual(unknownFields(), ((UpdateDisclosureAcceptanceResponse) obj).unknownFields());
    }

    public final int hashCode() {
        return unknownFields().hashCode();
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Divider.Builder builder = new Divider.Builder(26);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        return "UpdateDisclosureAcceptanceResponse{}";
    }
}
