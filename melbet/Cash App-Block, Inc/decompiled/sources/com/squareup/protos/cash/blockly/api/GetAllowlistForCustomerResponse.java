package com.squareup.protos.cash.blockly.api;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.ui.UiAppMesssages;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/blockly/api/GetAllowlistForCustomerResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/ui/UiAppMesssages$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class GetAllowlistForCustomerResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetAllowlistForCustomerResponse> CREATOR;
    public final List allowed_customers;
    public final Boolean has_had_approved_contacts;

    static {
        GetAllowlistForCustomerResponse$Companion$ADAPTER$1 getAllowlistForCustomerResponse$Companion$ADAPTER$1 = new GetAllowlistForCustomerResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetAllowlistForCustomerResponse.class), "type.googleapis.com/squareup.cash.blockly.api.GetAllowlistForCustomerResponse", Syntax.PROTO_2, null, "squareup/cash/blockly/api/BlocklyServiceProto.proto");
        ADAPTER = getAllowlistForCustomerResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getAllowlistForCustomerResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetAllowlistForCustomerResponse(Boolean bool, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.has_had_approved_contacts = bool;
        this.allowed_customers = TransactorKt.immutableCopyOf("allowed_customers", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetAllowlistForCustomerResponse)) {
            return false;
        }
        GetAllowlistForCustomerResponse getAllowlistForCustomerResponse = (GetAllowlistForCustomerResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getAllowlistForCustomerResponse.unknownFields()) && Intrinsics.areEqual(this.allowed_customers, getAllowlistForCustomerResponse.allowed_customers) && Intrinsics.areEqual(this.has_had_approved_contacts, getAllowlistForCustomerResponse.has_had_approved_contacts);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.allowed_customers);
        Boolean bool = this.has_had_approved_contacts;
        int hashCode = m + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        UiAppMesssages.Builder builder = new UiAppMesssages.Builder(2, false);
        builder.app_message_tokens = this.allowed_customers;
        builder.app_message_notifications_enabled = this.has_had_approved_contacts;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.allowed_customers;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("allowed_customers=", arrayList, list);
        }
        Boolean bool = this.has_had_approved_contacts;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("has_had_approved_contacts=", bool, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetAllowlistForCustomerResponse{", "}", 0, null, null, 56);
    }
}
