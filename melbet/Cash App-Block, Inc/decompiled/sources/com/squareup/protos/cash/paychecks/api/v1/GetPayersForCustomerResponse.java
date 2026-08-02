package com.squareup.protos.cash.paychecks.api.v1;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.giftly.app.GetGiftCardStoreInfoResponse;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/paychecks/api/v1/GetPayersForCustomerResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/giftly/app/GetGiftCardStoreInfoResponse$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GetPayersForCustomerResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetPayersForCustomerResponse> CREATOR;
    public final List payers;
    public final List recent_senders;
    public final List tagged_payers;

    static {
        GetPayersForCustomerResponse$Companion$ADAPTER$1 getPayersForCustomerResponse$Companion$ADAPTER$1 = new GetPayersForCustomerResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetPayersForCustomerResponse.class), "type.googleapis.com/squareup.cash.paychecks.api.v1.GetPayersForCustomerResponse", Syntax.PROTO_2, null, "squareup/cash/paychecks/api/v1/paychecks_app_service.proto");
        ADAPTER = getPayersForCustomerResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getPayersForCustomerResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetPayersForCustomerResponse(List list, List list2, List list3, ByteString byteString) {
        super(ADAPTER, byteString);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, list3, byteString);
        this.payers = TransactorKt.immutableCopyOf("payers", list);
        this.tagged_payers = TransactorKt.immutableCopyOf("tagged_payers", list2);
        this.recent_senders = TransactorKt.immutableCopyOf("recent_senders", list3);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetPayersForCustomerResponse)) {
            return false;
        }
        GetPayersForCustomerResponse getPayersForCustomerResponse = (GetPayersForCustomerResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getPayersForCustomerResponse.unknownFields()) && Intrinsics.areEqual(this.payers, getPayersForCustomerResponse.payers) && Intrinsics.areEqual(this.tagged_payers, getPayersForCustomerResponse.tagged_payers) && Intrinsics.areEqual(this.recent_senders, getPayersForCustomerResponse.recent_senders);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.recent_senders.hashCode() + Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.payers), 37, this.tagged_payers);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        GetGiftCardStoreInfoResponse.Builder builder = new GetGiftCardStoreInfoResponse.Builder(2);
        builder.gift_card_types = this.payers;
        builder.gift_card_categories = this.tagged_payers;
        builder.gift_card_upsells = this.recent_senders;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.payers;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("payers=", arrayList, list);
        }
        List list2 = this.tagged_payers;
        if (!list2.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("tagged_payers=", arrayList, list2);
        }
        List list3 = this.recent_senders;
        if (!list3.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("recent_senders=", arrayList, list3);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetPayersForCustomerResponse{", "}", 0, null, null, 56);
    }
}
