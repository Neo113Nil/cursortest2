package com.squareup.protos.cash.marketdata.model;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.nearby.api.v1.BLEPayload;
import com.squareup.protos.cash.pay.CashAppPayOrderRenderData;
import com.squareup.protos.common.Money;
import com.squareup.protos.invest.ui.Section;
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
public final class InvestmentFinancials extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<InvestmentFinancials> CREATOR;
    public final Section.Row.MoreInfo more_info;
    public final List quarters;
    public final List years;

    public final class Revenue extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Revenue> CREATOR;
        public final Money profit;
        public final String quarter;
        public final Money revenue;
        public final String year;

        public final class Builder extends Message.Builder {
            public final /* synthetic */ int $r8$classId;
            public Money profit;
            public String quarter;
            public Money revenue;
            public String year;

            public /* synthetic */ Builder(int i) {
                this.$r8$classId = i;
            }

            @Override // com.squareup.wire.Message.Builder
            public final Message build() {
                switch (this.$r8$classId) {
                    case 0:
                        return new Revenue(this.quarter, this.year, this.revenue, this.profit, buildUnknownFields());
                    default:
                        return new CashAppPayOrderRenderData.RetroEligibility.ConvertedData(this.quarter, this.year, this.revenue, this.profit, buildUnknownFields());
                }
            }
        }

        static {
            InvestmentFinancials$Revenue$Companion$ADAPTER$1 investmentFinancials$Revenue$Companion$ADAPTER$1 = new InvestmentFinancials$Revenue$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Revenue.class), "type.googleapis.com/squareup.cash.marketdata.model.InvestmentFinancials.Revenue", Syntax.PROTO_2, null, "squareup/cash/marketdata/model/investment_metrics.proto");
            ADAPTER = investmentFinancials$Revenue$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(investmentFinancials$Revenue$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Revenue(String str, String str2, Money money, Money money2, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.quarter = str;
            this.year = str2;
            this.revenue = money;
            this.profit = money2;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Revenue)) {
                return false;
            }
            Revenue revenue = (Revenue) obj;
            return Intrinsics.areEqual(unknownFields(), revenue.unknownFields()) && Intrinsics.areEqual(this.quarter, revenue.quarter) && Intrinsics.areEqual(this.year, revenue.year) && Intrinsics.areEqual(this.revenue, revenue.revenue) && Intrinsics.areEqual(this.profit, revenue.profit);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.quarter;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.year;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
            Money money = this.revenue;
            int hashCode4 = (hashCode3 + (money != null ? money.hashCode() : 0)) * 37;
            Money money2 = this.profit;
            int hashCode5 = hashCode4 + (money2 != null ? money2.hashCode() : 0);
            this.hashCode = hashCode5;
            return hashCode5;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Builder builder = new Builder(0);
            builder.quarter = this.quarter;
            builder.year = this.year;
            builder.revenue = this.revenue;
            builder.profit = this.profit;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.quarter;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "quarter=", arrayList);
            }
            String str2 = this.year;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "year=", arrayList);
            }
            Money money = this.revenue;
            if (money != null) {
                Matcher$$ExternalSyntheticOutline0.m("revenue=", money, arrayList);
            }
            Money money2 = this.profit;
            if (money2 != null) {
                Matcher$$ExternalSyntheticOutline0.m("profit=", money2, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Revenue{", "}", 0, null, null, 56);
        }
    }

    static {
        InvestmentFinancials$Companion$ADAPTER$1 investmentFinancials$Companion$ADAPTER$1 = new InvestmentFinancials$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(InvestmentFinancials.class), "type.googleapis.com/squareup.cash.marketdata.model.InvestmentFinancials", Syntax.PROTO_2, null, "squareup/cash/marketdata/model/investment_metrics.proto");
        ADAPTER = investmentFinancials$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(investmentFinancials$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestmentFinancials(List list, List list2, Section.Row.MoreInfo moreInfo, ByteString byteString) {
        super(ADAPTER, byteString);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, byteString);
        this.more_info = moreInfo;
        this.years = TransactorKt.immutableCopyOf("years", list);
        this.quarters = TransactorKt.immutableCopyOf("quarters", list2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InvestmentFinancials)) {
            return false;
        }
        InvestmentFinancials investmentFinancials = (InvestmentFinancials) obj;
        return Intrinsics.areEqual(unknownFields(), investmentFinancials.unknownFields()) && Intrinsics.areEqual(this.years, investmentFinancials.years) && Intrinsics.areEqual(this.quarters, investmentFinancials.quarters) && Intrinsics.areEqual(this.more_info, investmentFinancials.more_info);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.years), 37, this.quarters);
        Section.Row.MoreInfo moreInfo = this.more_info;
        int hashCode = m + (moreInfo != null ? moreInfo.hashCode() : 0);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        BLEPayload.Builder builder = new BLEPayload.Builder(10, false);
        builder.advertisement_data = this.years;
        builder.transmission_level = this.quarters;
        builder.frequency = this.more_info;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.years;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("years=", arrayList, list);
        }
        List list2 = this.quarters;
        if (!list2.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("quarters=", arrayList, list2);
        }
        Section.Row.MoreInfo moreInfo = this.more_info;
        if (moreInfo != null) {
            arrayList.add("more_info=" + moreInfo);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "InvestmentFinancials{", "}", 0, null, null, 56);
    }
}
