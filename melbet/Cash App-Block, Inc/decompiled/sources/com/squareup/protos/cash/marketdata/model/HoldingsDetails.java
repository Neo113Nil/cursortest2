package com.squareup.protos.cash.marketdata.model;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.document.DocumentEntity;
import com.squareup.protos.franklin.app.ReactionConfig;
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
public final class HoldingsDetails extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<HoldingsDetails> CREATOR;
    public final List holdings;
    public final Integer num_holdings_display_on_equity_page;

    public final class Holding extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Holding> CREATOR;
        public final String dark_icon_url;
        public final String icon_url;
        public final String name;
        public final String symbol;
        public final String token;
        public final InvestmentEntityTradability tradability;
        public final InvestmentEntityVisibility visibility;
        public final Long weight;

        static {
            HoldingsDetails$Holding$Companion$ADAPTER$1 holdingsDetails$Holding$Companion$ADAPTER$1 = new HoldingsDetails$Holding$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Holding.class), "type.googleapis.com/squareup.cash.marketdata.model.HoldingsDetails.Holding", Syntax.PROTO_2, null, "squareup/cash/marketdata/model/investment_metrics.proto");
            ADAPTER = holdingsDetails$Holding$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(holdingsDetails$Holding$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Holding(String str, String str2, String str3, InvestmentEntityVisibility investmentEntityVisibility, InvestmentEntityTradability investmentEntityTradability, String str4, String str5, Long l, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.symbol = str;
            this.token = str2;
            this.name = str3;
            this.visibility = investmentEntityVisibility;
            this.tradability = investmentEntityTradability;
            this.icon_url = str4;
            this.dark_icon_url = str5;
            this.weight = l;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Holding)) {
                return false;
            }
            Holding holding = (Holding) obj;
            return Intrinsics.areEqual(unknownFields(), holding.unknownFields()) && Intrinsics.areEqual(this.symbol, holding.symbol) && Intrinsics.areEqual(this.token, holding.token) && Intrinsics.areEqual(this.name, holding.name) && this.visibility == holding.visibility && this.tradability == holding.tradability && Intrinsics.areEqual(this.icon_url, holding.icon_url) && Intrinsics.areEqual(this.dark_icon_url, holding.dark_icon_url) && Intrinsics.areEqual(this.weight, holding.weight);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.symbol;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.token;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
            String str3 = this.name;
            int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
            InvestmentEntityVisibility investmentEntityVisibility = this.visibility;
            int hashCode5 = (hashCode4 + (investmentEntityVisibility != null ? investmentEntityVisibility.hashCode() : 0)) * 37;
            InvestmentEntityTradability investmentEntityTradability = this.tradability;
            int hashCode6 = (hashCode5 + (investmentEntityTradability != null ? investmentEntityTradability.hashCode() : 0)) * 37;
            String str4 = this.icon_url;
            int hashCode7 = (hashCode6 + (str4 != null ? str4.hashCode() : 0)) * 37;
            String str5 = this.dark_icon_url;
            int hashCode8 = (hashCode7 + (str5 != null ? str5.hashCode() : 0)) * 37;
            Long l = this.weight;
            int hashCode9 = hashCode8 + (l != null ? Long.hashCode(l.longValue()) : 0);
            this.hashCode = hashCode9;
            return hashCode9;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            DocumentEntity.Builder builder = new DocumentEntity.Builder(6, false);
            builder.category = this.symbol;
            builder.token = this.token;
            builder.title = this.name;
            builder.owner_token = this.visibility;
            builder.version_data = this.tradability;
            builder.client_route = this.icon_url;
            builder.url = this.dark_icon_url;
            builder.localizable_title = this.weight;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.symbol;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "symbol=", arrayList);
            }
            String str2 = this.token;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "token=", arrayList);
            }
            String str3 = this.name;
            if (str3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "name=", arrayList);
            }
            InvestmentEntityVisibility investmentEntityVisibility = this.visibility;
            if (investmentEntityVisibility != null) {
                arrayList.add("visibility=" + investmentEntityVisibility);
            }
            InvestmentEntityTradability investmentEntityTradability = this.tradability;
            if (investmentEntityTradability != null) {
                arrayList.add("tradability=" + investmentEntityTradability);
            }
            String str4 = this.icon_url;
            if (str4 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "icon_url=", arrayList);
            }
            String str5 = this.dark_icon_url;
            if (str5 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "dark_icon_url=", arrayList);
            }
            Long l = this.weight;
            if (l != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("weight=", l, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Holding{", "}", 0, null, null, 56);
        }
    }

    static {
        HoldingsDetails$Companion$ADAPTER$1 holdingsDetails$Companion$ADAPTER$1 = new HoldingsDetails$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(HoldingsDetails.class), "type.googleapis.com/squareup.cash.marketdata.model.HoldingsDetails", Syntax.PROTO_2, null, "squareup/cash/marketdata/model/investment_metrics.proto");
        ADAPTER = holdingsDetails$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(holdingsDetails$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HoldingsDetails(Integer num, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.num_holdings_display_on_equity_page = num;
        this.holdings = TransactorKt.immutableCopyOf("holdings", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof HoldingsDetails)) {
            return false;
        }
        HoldingsDetails holdingsDetails = (HoldingsDetails) obj;
        return Intrinsics.areEqual(unknownFields(), holdingsDetails.unknownFields()) && Intrinsics.areEqual(this.holdings, holdingsDetails.holdings) && Intrinsics.areEqual(this.num_holdings_display_on_equity_page, holdingsDetails.num_holdings_display_on_equity_page);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.holdings);
        Integer num = this.num_holdings_display_on_equity_page;
        int hashCode = m + (num != null ? Integer.hashCode(num.intValue()) : 0);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ReactionConfig.Builder builder = new ReactionConfig.Builder(1);
        builder.extended_picker_reactions = this.holdings;
        builder.max_emoji_per_reaction = this.num_holdings_display_on_equity_page;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.holdings;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("holdings=", arrayList, list);
        }
        Integer num = this.num_holdings_display_on_equity_page;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("num_holdings_display_on_equity_page=", num, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "HoldingsDetails{", "}", 0, null, null, 56);
    }
}
