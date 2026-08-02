package com.squareup.protos.cash.marketprices.service;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.out.sync_entity.CashOutFeeData;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/marketprices/service/GetCurrentPricesResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/cash/out/sync_entity/CashOutFeeData$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GetCurrentPricesResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetCurrentPricesResponse> CREATOR;
    public final Long next_refresh_ms;
    public final List prices;

    static {
        GetCurrentPricesResponse$Companion$ADAPTER$1 getCurrentPricesResponse$Companion$ADAPTER$1 = new GetCurrentPricesResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetCurrentPricesResponse.class), "type.googleapis.com/squareup.cash.marketprices.service.GetCurrentPricesResponse", Syntax.PROTO_2, null, "squareup/cash/marketprices/service.proto");
        ADAPTER = getCurrentPricesResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getCurrentPricesResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetCurrentPricesResponse(Long l, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.next_refresh_ms = l;
        this.prices = TransactorKt.immutableCopyOf("prices", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetCurrentPricesResponse)) {
            return false;
        }
        GetCurrentPricesResponse getCurrentPricesResponse = (GetCurrentPricesResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getCurrentPricesResponse.unknownFields()) && Intrinsics.areEqual(this.prices, getCurrentPricesResponse.prices) && Intrinsics.areEqual(this.next_refresh_ms, getCurrentPricesResponse.next_refresh_ms);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.prices);
        Long l = this.next_refresh_ms;
        int hashCode = m + (l != null ? Long.hashCode(l.longValue()) : 0);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        CashOutFeeData.Builder builder = new CashOutFeeData.Builder(3);
        builder.min_fee_steps = this.prices;
        builder.version = this.next_refresh_ms;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.prices;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("prices=", arrayList, list);
        }
        Long l = this.next_refresh_ms;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("next_refresh_ms=", l, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetCurrentPricesResponse{", "}", 0, null, null, 56);
    }
}
