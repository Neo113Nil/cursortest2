package com.squareup.protos.cash.marketdata.server;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.local.client.v1.BrandBanner;
import com.squareup.protos.cash.marketdata.model.InvestmentAnalystOpinions;
import com.squareup.protos.cash.marketdata.model.InvestmentEarnings;
import com.squareup.protos.cash.marketdata.model.InvestmentEntityStats;
import com.squareup.protos.cash.marketdata.model.InvestmentFinancials;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/marketdata/server/GetInvestingMetricsResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/local/client/v1/BrandBanner$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GetInvestingMetricsResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetInvestingMetricsResponse> CREATOR;
    public final InvestmentEarnings earnings;
    public final InvestmentFinancials financials;
    public final Long next_refresh_ms;
    public final InvestmentAnalystOpinions opinions;
    public final InvestmentEntityStats stats;

    static {
        GetInvestingMetricsResponse$Companion$ADAPTER$1 getInvestingMetricsResponse$Companion$ADAPTER$1 = new GetInvestingMetricsResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetInvestingMetricsResponse.class), "type.googleapis.com/squareup.cash.marketdata.server.GetInvestingMetricsResponse", Syntax.PROTO_2, null, "squareup/cash/marketdata/server/investment_metrics_service.proto");
        ADAPTER = getInvestingMetricsResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getInvestingMetricsResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetInvestingMetricsResponse(Long l, InvestmentEntityStats investmentEntityStats, InvestmentFinancials investmentFinancials, InvestmentEarnings investmentEarnings, InvestmentAnalystOpinions investmentAnalystOpinions, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.next_refresh_ms = l;
        this.stats = investmentEntityStats;
        this.financials = investmentFinancials;
        this.earnings = investmentEarnings;
        this.opinions = investmentAnalystOpinions;
    }

    public static GetInvestingMetricsResponse copy$default(GetInvestingMetricsResponse getInvestingMetricsResponse, InvestmentEntityStats investmentEntityStats, InvestmentFinancials investmentFinancials, InvestmentEarnings investmentEarnings, InvestmentAnalystOpinions investmentAnalystOpinions, ByteString byteString, int i) {
        InvestmentFinancials investmentFinancials2 = investmentFinancials;
        Long l = getInvestingMetricsResponse.next_refresh_ms;
        if ((i & 4) != 0) {
            investmentFinancials2 = getInvestingMetricsResponse.financials;
        }
        if ((i & 8) != 0) {
            investmentEarnings = getInvestingMetricsResponse.earnings;
        }
        if ((i & 16) != 0) {
            investmentAnalystOpinions = getInvestingMetricsResponse.opinions;
        }
        if ((i & 32) != 0) {
            byteString = getInvestingMetricsResponse.unknownFields();
        }
        ByteString byteString2 = byteString;
        getInvestingMetricsResponse.getClass();
        byteString2.getClass();
        InvestmentAnalystOpinions investmentAnalystOpinions2 = investmentAnalystOpinions;
        return new GetInvestingMetricsResponse(l, investmentEntityStats, investmentFinancials2, investmentEarnings, investmentAnalystOpinions2, byteString2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetInvestingMetricsResponse)) {
            return false;
        }
        GetInvestingMetricsResponse getInvestingMetricsResponse = (GetInvestingMetricsResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getInvestingMetricsResponse.unknownFields()) && Intrinsics.areEqual(this.next_refresh_ms, getInvestingMetricsResponse.next_refresh_ms) && Intrinsics.areEqual(this.stats, getInvestingMetricsResponse.stats) && Intrinsics.areEqual(this.financials, getInvestingMetricsResponse.financials) && Intrinsics.areEqual(this.earnings, getInvestingMetricsResponse.earnings) && Intrinsics.areEqual(this.opinions, getInvestingMetricsResponse.opinions);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Long l = this.next_refresh_ms;
        int hashCode2 = (hashCode + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        InvestmentEntityStats investmentEntityStats = this.stats;
        int hashCode3 = (hashCode2 + (investmentEntityStats != null ? investmentEntityStats.hashCode() : 0)) * 37;
        InvestmentFinancials investmentFinancials = this.financials;
        int hashCode4 = (hashCode3 + (investmentFinancials != null ? investmentFinancials.hashCode() : 0)) * 37;
        InvestmentEarnings investmentEarnings = this.earnings;
        int hashCode5 = (hashCode4 + (investmentEarnings != null ? investmentEarnings.hashCode() : 0)) * 37;
        InvestmentAnalystOpinions investmentAnalystOpinions = this.opinions;
        int hashCode6 = hashCode5 + (investmentAnalystOpinions != null ? investmentAnalystOpinions.hashCode() : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        BrandBanner.Builder builder = new BrandBanner.Builder(18);
        builder.icon = this.next_refresh_ms;
        builder.title = this.stats;
        builder.subtitle = this.financials;
        builder.action = this.earnings;
        builder.icon_background_color = this.opinions;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Long l = this.next_refresh_ms;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("next_refresh_ms=", l, arrayList);
        }
        InvestmentEntityStats investmentEntityStats = this.stats;
        if (investmentEntityStats != null) {
            arrayList.add("stats=" + investmentEntityStats);
        }
        InvestmentFinancials investmentFinancials = this.financials;
        if (investmentFinancials != null) {
            arrayList.add("financials=" + investmentFinancials);
        }
        InvestmentEarnings investmentEarnings = this.earnings;
        if (investmentEarnings != null) {
            arrayList.add("earnings=" + investmentEarnings);
        }
        InvestmentAnalystOpinions investmentAnalystOpinions = this.opinions;
        if (investmentAnalystOpinions != null) {
            arrayList.add("opinions=" + investmentAnalystOpinions);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetInvestingMetricsResponse{", "}", 0, null, null, 56);
    }
}
