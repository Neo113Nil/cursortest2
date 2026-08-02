package com.squareup.protos.cash.marketdata;

import android.os.Parcelable;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.local.client.v1.GiftCard;
import com.squareup.protos.cash.marketdata.model.PortfolioNews;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/marketdata/GetCustomerNewsResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/local/client/v1/GiftCard$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GetCustomerNewsResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetCustomerNewsResponse> CREATOR;
    public final PortfolioNews bitcoin;
    public final PortfolioNews equity;
    public final Long next_cache_refresh_after;
    public final Integer number_of_news_in_carousel;

    static {
        GetCustomerNewsResponse$Companion$ADAPTER$1 getCustomerNewsResponse$Companion$ADAPTER$1 = new GetCustomerNewsResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetCustomerNewsResponse.class), "type.googleapis.com/squareup.cash.marketdata.GetCustomerNewsResponse", Syntax.PROTO_2, null, "squareup/cash/marketdata/service.proto");
        ADAPTER = getCustomerNewsResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getCustomerNewsResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetCustomerNewsResponse(PortfolioNews portfolioNews, PortfolioNews portfolioNews2, Integer num, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.equity = portfolioNews;
        this.bitcoin = portfolioNews2;
        this.number_of_news_in_carousel = num;
        this.next_cache_refresh_after = l;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetCustomerNewsResponse)) {
            return false;
        }
        GetCustomerNewsResponse getCustomerNewsResponse = (GetCustomerNewsResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getCustomerNewsResponse.unknownFields()) && Intrinsics.areEqual(this.equity, getCustomerNewsResponse.equity) && Intrinsics.areEqual(this.bitcoin, getCustomerNewsResponse.bitcoin) && Intrinsics.areEqual(this.number_of_news_in_carousel, getCustomerNewsResponse.number_of_news_in_carousel) && Intrinsics.areEqual(this.next_cache_refresh_after, getCustomerNewsResponse.next_cache_refresh_after);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        PortfolioNews portfolioNews = this.equity;
        int hashCode2 = (hashCode + (portfolioNews != null ? portfolioNews.hashCode() : 0)) * 37;
        PortfolioNews portfolioNews2 = this.bitcoin;
        int hashCode3 = (hashCode2 + (portfolioNews2 != null ? portfolioNews2.hashCode() : 0)) * 37;
        Integer num = this.number_of_news_in_carousel;
        int hashCode4 = (hashCode3 + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
        Long l = this.next_cache_refresh_after;
        int hashCode5 = hashCode4 + (l != null ? Long.hashCode(l.longValue()) : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        GiftCard.Builder builder = new GiftCard.Builder(17, false);
        builder.id = this.equity;
        builder.last_4 = this.bitcoin;
        builder.gift_card_id = this.number_of_news_in_carousel;
        builder.gift_card_amount = this.next_cache_refresh_after;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        PortfolioNews portfolioNews = this.equity;
        if (portfolioNews != null) {
            arrayList.add("equity=" + portfolioNews);
        }
        PortfolioNews portfolioNews2 = this.bitcoin;
        if (portfolioNews2 != null) {
            arrayList.add("bitcoin=" + portfolioNews2);
        }
        Integer num = this.number_of_news_in_carousel;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("number_of_news_in_carousel=", num, arrayList);
        }
        Long l = this.next_cache_refresh_after;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("next_cache_refresh_after=", l, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetCustomerNewsResponse{", "}", 0, null, null, 56);
    }
}
