package com.squareup.protos.cash.cashapproxy.api;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.aegis.core.Section;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/cashapproxy/api/GetApOrdersHubResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/aegis/core/Section$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GetApOrdersHubResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetApOrdersHubResponse> CREATOR;
    public final String next_completed_orders_pagination_token;
    public final List rows;
    public final Summary summary;

    static {
        GetApOrdersHubResponse$Companion$ADAPTER$1 getApOrdersHubResponse$Companion$ADAPTER$1 = new GetApOrdersHubResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetApOrdersHubResponse.class), "type.googleapis.com/squareup.cash.cashapproxy.api.v1.GetApOrdersHubResponse", Syntax.PROTO_2, null, "squareup/cash/cashapproxy/api/v1/afterpay_hub.proto");
        ADAPTER = getApOrdersHubResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getApOrdersHubResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetApOrdersHubResponse(Summary summary, List list, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.summary = summary;
        this.next_completed_orders_pagination_token = str;
        this.rows = TransactorKt.immutableCopyOf("rows", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetApOrdersHubResponse)) {
            return false;
        }
        GetApOrdersHubResponse getApOrdersHubResponse = (GetApOrdersHubResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getApOrdersHubResponse.unknownFields()) && Intrinsics.areEqual(this.summary, getApOrdersHubResponse.summary) && Intrinsics.areEqual(this.rows, getApOrdersHubResponse.rows) && Intrinsics.areEqual(this.next_completed_orders_pagination_token, getApOrdersHubResponse.next_completed_orders_pagination_token);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Summary summary = this.summary;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode + (summary != null ? summary.hashCode() : 0)) * 37, 37, this.rows);
        String str = this.next_completed_orders_pagination_token;
        int hashCode2 = m + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Section.Builder builder = new Section.Builder(18);
        builder.header_button = this.summary;
        builder.groups = this.rows;
        builder.header_text = this.next_completed_orders_pagination_token;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Summary summary = this.summary;
        if (summary != null) {
            arrayList.add("summary=" + summary);
        }
        List list = this.rows;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("rows=", arrayList, list);
        }
        String str = this.next_completed_orders_pagination_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "next_completed_orders_pagination_token=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetApOrdersHubResponse{", "}", 0, null, null, 56);
    }
}
