package com.squareup.protos.cash.local.client.app.v1;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.discover.api.app.v1.model.Text;
import com.squareup.protos.franklin.common.ResponseContext;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/local/client/app/v1/GetMarketScreenDataResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/discover/api/app/v1/model/Text$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GetMarketScreenDataResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetMarketScreenDataResponse> CREATOR;
    public final Long expires_at;
    public final MarketScreenData market_screen_data;
    public final MarketScreenFeed market_screen_feed;
    public final MarketTilesScreen market_tiles_screen;
    public final ResponseContext response_context;

    static {
        GetMarketScreenDataResponse$Companion$ADAPTER$1 getMarketScreenDataResponse$Companion$ADAPTER$1 = new GetMarketScreenDataResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetMarketScreenDataResponse.class), "type.googleapis.com/squareup.cash.local.client.app.v1.GetMarketScreenDataResponse", Syntax.PROTO_2, null, "squareup/cash/local/client/app/v1/cash_app_local_client_app_service.proto");
        ADAPTER = getMarketScreenDataResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getMarketScreenDataResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetMarketScreenDataResponse(ResponseContext responseContext, MarketScreenData marketScreenData, Long l, MarketScreenFeed marketScreenFeed, MarketTilesScreen marketTilesScreen, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.response_context = responseContext;
        this.market_screen_data = marketScreenData;
        this.expires_at = l;
        this.market_screen_feed = marketScreenFeed;
        this.market_tiles_screen = marketTilesScreen;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetMarketScreenDataResponse)) {
            return false;
        }
        GetMarketScreenDataResponse getMarketScreenDataResponse = (GetMarketScreenDataResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getMarketScreenDataResponse.unknownFields()) && Intrinsics.areEqual(this.response_context, getMarketScreenDataResponse.response_context) && Intrinsics.areEqual(this.market_screen_data, getMarketScreenDataResponse.market_screen_data) && Intrinsics.areEqual(this.expires_at, getMarketScreenDataResponse.expires_at) && Intrinsics.areEqual(this.market_screen_feed, getMarketScreenDataResponse.market_screen_feed) && Intrinsics.areEqual(this.market_tiles_screen, getMarketScreenDataResponse.market_tiles_screen);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ResponseContext responseContext = this.response_context;
        int hashCode2 = (hashCode + (responseContext != null ? responseContext.hashCode() : 0)) * 37;
        MarketScreenData marketScreenData = this.market_screen_data;
        int hashCode3 = (hashCode2 + (marketScreenData != null ? marketScreenData.hashCode() : 0)) * 37;
        Long l = this.expires_at;
        int hashCode4 = (hashCode3 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        MarketScreenFeed marketScreenFeed = this.market_screen_feed;
        int hashCode5 = (hashCode4 + (marketScreenFeed != null ? marketScreenFeed.hashCode() : 0)) * 37;
        MarketTilesScreen marketTilesScreen = this.market_tiles_screen;
        int hashCode6 = hashCode5 + (marketTilesScreen != null ? marketTilesScreen.hashCode() : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Text.Builder builder = new Text.Builder(21);
        builder.text = this.response_context;
        builder.text_style = this.market_screen_data;
        builder.text_decoration = this.expires_at;
        builder.text_color = this.market_screen_feed;
        builder.icon = this.market_tiles_screen;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ResponseContext responseContext = this.response_context;
        if (responseContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("response_context=", responseContext, arrayList);
        }
        MarketScreenData marketScreenData = this.market_screen_data;
        if (marketScreenData != null) {
            arrayList.add("market_screen_data=" + marketScreenData);
        }
        Long l = this.expires_at;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("expires_at=", l, arrayList);
        }
        MarketScreenFeed marketScreenFeed = this.market_screen_feed;
        if (marketScreenFeed != null) {
            arrayList.add("market_screen_feed=" + marketScreenFeed);
        }
        MarketTilesScreen marketTilesScreen = this.market_tiles_screen;
        if (marketTilesScreen != null) {
            arrayList.add("market_tiles_screen=" + marketTilesScreen);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetMarketScreenDataResponse{", "}", 0, null, null, 56);
    }
}
