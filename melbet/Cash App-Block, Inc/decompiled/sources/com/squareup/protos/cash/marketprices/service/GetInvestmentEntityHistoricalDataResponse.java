package com.squareup.protos.cash.marketprices.service;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.document.DocumentEntity;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/marketprices/service/GetInvestmentEntityHistoricalDataResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/document/DocumentEntity$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GetInvestmentEntityHistoricalDataResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetInvestmentEntityHistoricalDataResponse> CREATOR;
    public final CurrencyCode base_currency_code;
    public final List comparison_price_ticks;
    public final Long end_time;
    public final Long next_refresh_ms;
    public final List price_ticks;
    public final Long prior_trading_day_price_cents;
    public final Long start_time;
    public final Long tick_frequency_ms;

    static {
        GetInvestmentEntityHistoricalDataResponse$Companion$ADAPTER$1 getInvestmentEntityHistoricalDataResponse$Companion$ADAPTER$1 = new GetInvestmentEntityHistoricalDataResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetInvestmentEntityHistoricalDataResponse.class), "type.googleapis.com/squareup.cash.marketprices.service.GetInvestmentEntityHistoricalDataResponse", Syntax.PROTO_2, null, "squareup/cash/marketprices/service.proto");
        ADAPTER = getInvestmentEntityHistoricalDataResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getInvestmentEntityHistoricalDataResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetInvestmentEntityHistoricalDataResponse(Long l, Long l2, CurrencyCode currencyCode, List list, Long l3, Long l4, Long l5, List list2, ByteString byteString) {
        super(ADAPTER, byteString);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, byteString);
        this.start_time = l;
        this.tick_frequency_ms = l2;
        this.base_currency_code = currencyCode;
        this.prior_trading_day_price_cents = l3;
        this.end_time = l4;
        this.next_refresh_ms = l5;
        this.price_ticks = TransactorKt.immutableCopyOf("price_ticks", list);
        this.comparison_price_ticks = TransactorKt.immutableCopyOf("comparison_price_ticks", list2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.util.List] */
    public static GetInvestmentEntityHistoricalDataResponse copy$default(GetInvestmentEntityHistoricalDataResponse getInvestmentEntityHistoricalDataResponse, ArrayList arrayList, ArrayList arrayList2, ByteString byteString, int i) {
        Long l = getInvestmentEntityHistoricalDataResponse.start_time;
        Long l2 = getInvestmentEntityHistoricalDataResponse.tick_frequency_ms;
        CurrencyCode currencyCode = getInvestmentEntityHistoricalDataResponse.base_currency_code;
        Long l3 = getInvestmentEntityHistoricalDataResponse.prior_trading_day_price_cents;
        Long l4 = getInvestmentEntityHistoricalDataResponse.end_time;
        Long l5 = getInvestmentEntityHistoricalDataResponse.next_refresh_ms;
        ArrayList arrayList3 = arrayList2;
        if ((i & 128) != 0) {
            arrayList3 = getInvestmentEntityHistoricalDataResponse.comparison_price_ticks;
        }
        ArrayList arrayList4 = arrayList3;
        if ((i & 256) != 0) {
            byteString = getInvestmentEntityHistoricalDataResponse.unknownFields();
        }
        ByteString byteString2 = byteString;
        getInvestmentEntityHistoricalDataResponse.getClass();
        arrayList4.getClass();
        byteString2.getClass();
        return new GetInvestmentEntityHistoricalDataResponse(l, l2, currencyCode, arrayList, l3, l4, l5, arrayList4, byteString2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetInvestmentEntityHistoricalDataResponse)) {
            return false;
        }
        GetInvestmentEntityHistoricalDataResponse getInvestmentEntityHistoricalDataResponse = (GetInvestmentEntityHistoricalDataResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getInvestmentEntityHistoricalDataResponse.unknownFields()) && Intrinsics.areEqual(this.start_time, getInvestmentEntityHistoricalDataResponse.start_time) && Intrinsics.areEqual(this.tick_frequency_ms, getInvestmentEntityHistoricalDataResponse.tick_frequency_ms) && this.base_currency_code == getInvestmentEntityHistoricalDataResponse.base_currency_code && Intrinsics.areEqual(this.price_ticks, getInvestmentEntityHistoricalDataResponse.price_ticks) && Intrinsics.areEqual(this.prior_trading_day_price_cents, getInvestmentEntityHistoricalDataResponse.prior_trading_day_price_cents) && Intrinsics.areEqual(this.end_time, getInvestmentEntityHistoricalDataResponse.end_time) && Intrinsics.areEqual(this.next_refresh_ms, getInvestmentEntityHistoricalDataResponse.next_refresh_ms) && Intrinsics.areEqual(this.comparison_price_ticks, getInvestmentEntityHistoricalDataResponse.comparison_price_ticks);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Long l = this.start_time;
        int hashCode2 = (hashCode + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        Long l2 = this.tick_frequency_ms;
        int hashCode3 = (hashCode2 + (l2 != null ? Long.hashCode(l2.longValue()) : 0)) * 37;
        CurrencyCode currencyCode = this.base_currency_code;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode3 + (currencyCode != null ? currencyCode.hashCode() : 0)) * 37, 37, this.price_ticks);
        Long l3 = this.prior_trading_day_price_cents;
        int hashCode4 = (m + (l3 != null ? Long.hashCode(l3.longValue()) : 0)) * 37;
        Long l4 = this.end_time;
        int hashCode5 = (hashCode4 + (l4 != null ? Long.hashCode(l4.longValue()) : 0)) * 37;
        Long l5 = this.next_refresh_ms;
        int hashCode6 = this.comparison_price_ticks.hashCode() + ((hashCode5 + (l5 != null ? Long.hashCode(l5.longValue()) : 0)) * 37);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        DocumentEntity.Builder builder = new DocumentEntity.Builder(7, false);
        builder.category = this.start_time;
        builder.token = this.tick_frequency_ms;
        builder.title = this.base_currency_code;
        builder.client_route = this.price_ticks;
        builder.url = this.prior_trading_day_price_cents;
        builder.owner_token = this.end_time;
        builder.version_data = this.next_refresh_ms;
        builder.localizable_title = this.comparison_price_ticks;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Long l = this.start_time;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("start_time=", l, arrayList);
        }
        Long l2 = this.tick_frequency_ms;
        if (l2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("tick_frequency_ms=", l2, arrayList);
        }
        CurrencyCode currencyCode = this.base_currency_code;
        if (currencyCode != null) {
            Matcher$$ExternalSyntheticOutline0.m("base_currency_code=", currencyCode, arrayList);
        }
        List list = this.price_ticks;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("price_ticks=", arrayList, list);
        }
        Long l3 = this.prior_trading_day_price_cents;
        if (l3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("prior_trading_day_price_cents=", l3, arrayList);
        }
        Long l4 = this.end_time;
        if (l4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("end_time=", l4, arrayList);
        }
        Long l5 = this.next_refresh_ms;
        if (l5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("next_refresh_ms=", l5, arrayList);
        }
        List list2 = this.comparison_price_ticks;
        if (!list2.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("comparison_price_ticks=", arrayList, list2);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetInvestmentEntityHistoricalDataResponse{", "}", 0, null, null, 56);
    }
}
