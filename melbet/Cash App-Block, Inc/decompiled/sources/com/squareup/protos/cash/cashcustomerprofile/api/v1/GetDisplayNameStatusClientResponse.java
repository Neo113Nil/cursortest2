package com.squareup.protos.cash.cashcustomerprofile.api.v1;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cats.Cats;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/cashcustomerprofile/api/v1/GetDisplayNameStatusClientResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/cats/Cats$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GetDisplayNameStatusClientResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetDisplayNameStatusClientResponse> CREATOR;
    public final Long remaining_limit;

    static {
        GetDisplayNameStatusClientResponse$Companion$ADAPTER$1 getDisplayNameStatusClientResponse$Companion$ADAPTER$1 = new GetDisplayNameStatusClientResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetDisplayNameStatusClientResponse.class), "type.googleapis.com/squareup.cash.cashcustomerprofile.api.v1.GetDisplayNameStatusClientResponse", Syntax.PROTO_2, null, "squareup/cash/cashcustomerprofile/api/v1/get_display_name_status_client.proto");
        ADAPTER = getDisplayNameStatusClientResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getDisplayNameStatusClientResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetDisplayNameStatusClientResponse(Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.remaining_limit = l;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetDisplayNameStatusClientResponse)) {
            return false;
        }
        GetDisplayNameStatusClientResponse getDisplayNameStatusClientResponse = (GetDisplayNameStatusClientResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getDisplayNameStatusClientResponse.unknownFields()) && Intrinsics.areEqual(this.remaining_limit, getDisplayNameStatusClientResponse.remaining_limit);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Long l = this.remaining_limit;
        int hashCode2 = hashCode + (l != null ? Long.hashCode(l.longValue()) : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Cats.Builder builder = new Cats.Builder(2);
        builder.cat_count = this.remaining_limit;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Long l = this.remaining_limit;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("remaining_limit=", l, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetDisplayNameStatusClientResponse{", "}", 0, null, null, 56);
    }
}
