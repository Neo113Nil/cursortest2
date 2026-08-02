package com.squareup.protos.cash.marketdata;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.nearby.api.v1.BLEPayload;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/marketdata/GetInvestmentEntityNewsResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/nearby/api/v1/BLEPayload$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GetInvestmentEntityNewsResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetInvestmentEntityNewsResponse> CREATOR;
    public final List investment_entity_news;
    public final Long next_cache_refresh_after;
    public final Integer number_of_news_in_carousel;

    static {
        GetInvestmentEntityNewsResponse$Companion$ADAPTER$1 getInvestmentEntityNewsResponse$Companion$ADAPTER$1 = new GetInvestmentEntityNewsResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetInvestmentEntityNewsResponse.class), "type.googleapis.com/squareup.cash.marketdata.GetInvestmentEntityNewsResponse", Syntax.PROTO_2, null, "squareup/cash/marketdata/service.proto");
        ADAPTER = getInvestmentEntityNewsResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getInvestmentEntityNewsResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetInvestmentEntityNewsResponse(List list, Integer num, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.number_of_news_in_carousel = num;
        this.next_cache_refresh_after = l;
        this.investment_entity_news = TransactorKt.immutableCopyOf("investment_entity_news", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetInvestmentEntityNewsResponse)) {
            return false;
        }
        GetInvestmentEntityNewsResponse getInvestmentEntityNewsResponse = (GetInvestmentEntityNewsResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getInvestmentEntityNewsResponse.unknownFields()) && Intrinsics.areEqual(this.investment_entity_news, getInvestmentEntityNewsResponse.investment_entity_news) && Intrinsics.areEqual(this.number_of_news_in_carousel, getInvestmentEntityNewsResponse.number_of_news_in_carousel) && Intrinsics.areEqual(this.next_cache_refresh_after, getInvestmentEntityNewsResponse.next_cache_refresh_after);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.investment_entity_news);
        Integer num = this.number_of_news_in_carousel;
        int hashCode = (m + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
        Long l = this.next_cache_refresh_after;
        int hashCode2 = hashCode + (l != null ? Long.hashCode(l.longValue()) : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        BLEPayload.Builder builder = new BLEPayload.Builder(9, false);
        builder.advertisement_data = this.investment_entity_news;
        builder.transmission_level = this.number_of_news_in_carousel;
        builder.frequency = this.next_cache_refresh_after;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.investment_entity_news;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("investment_entity_news=", arrayList, list);
        }
        Integer num = this.number_of_news_in_carousel;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("number_of_news_in_carousel=", num, arrayList);
        }
        Long l = this.next_cache_refresh_after;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("next_cache_refresh_after=", l, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetInvestmentEntityNewsResponse{", "}", 0, null, null, 56);
    }
}
