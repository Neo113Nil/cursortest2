package com.squareup.protos.cash.marketdata.model;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.local.client.v1.BrandBanner;
import com.squareup.protos.cash.money.content.MoneyTab;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class InvestmentEntityStats extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<InvestmentEntityStats> CREATOR;
    public final InvestmentEntityStatsDetails details;
    public final Long num_equity_screen_stats;
    public final List rows;
    public final Long stats_per_page;
    public final String title;

    public final class InvestmentEntityStatsDetails extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<InvestmentEntityStatsDetails> CREATOR;
        public final List rows;

        static {
            InvestmentEntityStats$InvestmentEntityStatsDetails$Companion$ADAPTER$1 investmentEntityStats$InvestmentEntityStatsDetails$Companion$ADAPTER$1 = new InvestmentEntityStats$InvestmentEntityStatsDetails$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(InvestmentEntityStatsDetails.class), "type.googleapis.com/squareup.cash.marketdata.model.InvestmentEntityStats.InvestmentEntityStatsDetails", Syntax.PROTO_2, null, "squareup/cash/marketdata/model/investment_metrics.proto");
            ADAPTER = investmentEntityStats$InvestmentEntityStatsDetails$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(investmentEntityStats$InvestmentEntityStatsDetails$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InvestmentEntityStatsDetails(List list, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.rows = TransactorKt.immutableCopyOf("rows", list);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof InvestmentEntityStatsDetails)) {
                return false;
            }
            InvestmentEntityStatsDetails investmentEntityStatsDetails = (InvestmentEntityStatsDetails) obj;
            return Intrinsics.areEqual(unknownFields(), investmentEntityStatsDetails.unknownFields()) && Intrinsics.areEqual(this.rows, investmentEntityStatsDetails.rows);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = this.rows.hashCode() + (unknownFields().hashCode() * 37);
            this.hashCode = hashCode;
            return hashCode;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            MoneyTab.Builder builder = new MoneyTab.Builder(16, false);
            builder.applets = this.rows;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            List list = this.rows;
            if (!list.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("rows=", arrayList, list);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "InvestmentEntityStatsDetails{", "}", 0, null, null, 56);
        }
    }

    static {
        InvestmentEntityStats$Companion$ADAPTER$1 investmentEntityStats$Companion$ADAPTER$1 = new InvestmentEntityStats$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(InvestmentEntityStats.class), "type.googleapis.com/squareup.cash.marketdata.model.InvestmentEntityStats", Syntax.PROTO_2, null, "squareup/cash/marketdata/model/investment_metrics.proto");
        ADAPTER = investmentEntityStats$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(investmentEntityStats$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestmentEntityStats(Long l, List list, String str, InvestmentEntityStatsDetails investmentEntityStatsDetails, Long l2, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.stats_per_page = l;
        this.title = str;
        this.details = investmentEntityStatsDetails;
        this.num_equity_screen_stats = l2;
        this.rows = TransactorKt.immutableCopyOf("rows", list);
    }

    public static InvestmentEntityStats copy$default(InvestmentEntityStats investmentEntityStats, ArrayList arrayList, InvestmentEntityStatsDetails investmentEntityStatsDetails, ByteString byteString, int i) {
        Long l = investmentEntityStats.stats_per_page;
        String str = investmentEntityStats.title;
        if ((i & 8) != 0) {
            investmentEntityStatsDetails = investmentEntityStats.details;
        }
        InvestmentEntityStatsDetails investmentEntityStatsDetails2 = investmentEntityStatsDetails;
        Long l2 = investmentEntityStats.num_equity_screen_stats;
        if ((i & 32) != 0) {
            byteString = investmentEntityStats.unknownFields();
        }
        ByteString byteString2 = byteString;
        investmentEntityStats.getClass();
        byteString2.getClass();
        return new InvestmentEntityStats(l, arrayList, str, investmentEntityStatsDetails2, l2, byteString2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InvestmentEntityStats)) {
            return false;
        }
        InvestmentEntityStats investmentEntityStats = (InvestmentEntityStats) obj;
        return Intrinsics.areEqual(unknownFields(), investmentEntityStats.unknownFields()) && Intrinsics.areEqual(this.stats_per_page, investmentEntityStats.stats_per_page) && Intrinsics.areEqual(this.rows, investmentEntityStats.rows) && Intrinsics.areEqual(this.title, investmentEntityStats.title) && Intrinsics.areEqual(this.details, investmentEntityStats.details) && Intrinsics.areEqual(this.num_equity_screen_stats, investmentEntityStats.num_equity_screen_stats);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Long l = this.stats_per_page;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37, 37, this.rows);
        String str = this.title;
        int hashCode2 = (m + (str != null ? str.hashCode() : 0)) * 37;
        InvestmentEntityStatsDetails investmentEntityStatsDetails = this.details;
        int hashCode3 = (hashCode2 + (investmentEntityStatsDetails != null ? investmentEntityStatsDetails.hashCode() : 0)) * 37;
        Long l2 = this.num_equity_screen_stats;
        int hashCode4 = hashCode3 + (l2 != null ? Long.hashCode(l2.longValue()) : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        BrandBanner.Builder builder = new BrandBanner.Builder(17);
        builder.icon = this.stats_per_page;
        builder.title = this.rows;
        builder.subtitle = this.title;
        builder.action = this.details;
        builder.icon_background_color = this.num_equity_screen_stats;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Long l = this.stats_per_page;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("stats_per_page=", l, arrayList);
        }
        List list = this.rows;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("rows=", arrayList, list);
        }
        String str = this.title;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title=", arrayList);
        }
        InvestmentEntityStatsDetails investmentEntityStatsDetails = this.details;
        if (investmentEntityStatsDetails != null) {
            arrayList.add("details=" + investmentEntityStatsDetails);
        }
        Long l2 = this.num_equity_screen_stats;
        if (l2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("num_equity_screen_stats=", l2, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "InvestmentEntityStats{", "}", 0, null, null, 56);
    }
}
