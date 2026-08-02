package com.squareup.protos.cash.giftly.app;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.mosaic.resources.api.v2.GetResourcesRecommendedResponse;
import com.squareup.protos.cash.paychecks.api.v1.GetPayersForCustomerResponse;
import com.squareup.protos.cash.syncentitygateway.syncvalues.ClientSyncConfig;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/giftly/app/GetGiftCardStoreInfoResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/giftly/app/GetGiftCardStoreInfoResponse$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GetGiftCardStoreInfoResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetGiftCardStoreInfoResponse> CREATOR;
    public final List gift_card_categories;
    public final List gift_card_types;
    public final List gift_card_upsells;

    static {
        GetGiftCardStoreInfoResponse$Companion$ADAPTER$1 getGiftCardStoreInfoResponse$Companion$ADAPTER$1 = new GetGiftCardStoreInfoResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetGiftCardStoreInfoResponse.class), "type.googleapis.com/squareup.cash.giftly.app.GetGiftCardStoreInfoResponse", Syntax.PROTO_2, null, "squareup/cash/giftly/app/GetGiftCardStoreInfo.proto");
        ADAPTER = getGiftCardStoreInfoResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getGiftCardStoreInfoResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetGiftCardStoreInfoResponse(List list, List list2, List list3, ByteString byteString) {
        super(ADAPTER, byteString);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, list3, byteString);
        this.gift_card_types = TransactorKt.immutableCopyOf("gift_card_types", list);
        this.gift_card_categories = TransactorKt.immutableCopyOf("gift_card_categories", list2);
        this.gift_card_upsells = TransactorKt.immutableCopyOf("gift_card_upsells", list3);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetGiftCardStoreInfoResponse)) {
            return false;
        }
        GetGiftCardStoreInfoResponse getGiftCardStoreInfoResponse = (GetGiftCardStoreInfoResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getGiftCardStoreInfoResponse.unknownFields()) && Intrinsics.areEqual(this.gift_card_types, getGiftCardStoreInfoResponse.gift_card_types) && Intrinsics.areEqual(this.gift_card_categories, getGiftCardStoreInfoResponse.gift_card_categories) && Intrinsics.areEqual(this.gift_card_upsells, getGiftCardStoreInfoResponse.gift_card_upsells);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.gift_card_upsells.hashCode() + Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.gift_card_types), 37, this.gift_card_categories);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.gift_card_types = this.gift_card_types;
        builder.gift_card_categories = this.gift_card_categories;
        builder.gift_card_upsells = this.gift_card_upsells;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.gift_card_types;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("gift_card_types=", arrayList, list);
        }
        List list2 = this.gift_card_categories;
        if (!list2.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("gift_card_categories=", arrayList, list2);
        }
        List list3 = this.gift_card_upsells;
        if (!list3.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("gift_card_upsells=", arrayList, list3);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetGiftCardStoreInfoResponse{", "}", 0, null, null, 56);
    }

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public List gift_card_categories;
        public List gift_card_types;
        public List gift_card_upsells;

        public Builder() {
            this.$r8$classId = 3;
            EmptyList emptyList = EmptyList.INSTANCE;
            this.gift_card_types = emptyList;
            this.gift_card_categories = emptyList;
            this.gift_card_upsells = emptyList;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new GetGiftCardStoreInfoResponse(this.gift_card_types, this.gift_card_categories, this.gift_card_upsells, buildUnknownFields());
                case 1:
                    return new GetResourcesRecommendedResponse(this.gift_card_types, this.gift_card_categories, this.gift_card_upsells, buildUnknownFields());
                case 2:
                    return new GetPayersForCustomerResponse(this.gift_card_types, this.gift_card_categories, this.gift_card_upsells, buildUnknownFields());
                default:
                    return new ClientSyncConfig(this.gift_card_types, this.gift_card_categories, this.gift_card_upsells, buildUnknownFields());
            }
        }

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }
    }
}
