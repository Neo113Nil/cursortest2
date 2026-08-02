package com.squareup.protos.cash.cashbusinessaccounts;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.cash.moneybot.genie.protos.Node;
import com.squareup.protos.cash.aegis.core.Section;
import com.squareup.protos.cash.cashbusinessaccounts.api.v1.YearlyData;
import com.squareup.protos.common.Money;
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
public final class EarningsTrackerSummary extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<EarningsTrackerSummary> CREATOR;
    public final Long first_business_upgrade_at;
    public final Boolean onboarded;
    public final Earnings total_earnings;

    public final class Earnings extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Earnings> CREATOR;
        public final Money amount;
        public final List daily_data;
        public final String duration;
        public final Integer month;
        public final Integer year;

        static {
            EarningsTrackerSummary$Earnings$Companion$ADAPTER$1 earningsTrackerSummary$Earnings$Companion$ADAPTER$1 = new EarningsTrackerSummary$Earnings$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Earnings.class), "type.googleapis.com/squareup.cash.cashbusinessaccounts.EarningsTrackerSummary.Earnings", Syntax.PROTO_2, null, "squareup/cash/cashbusinessaccounts/earnings_tracker_summary.proto");
            ADAPTER = earningsTrackerSummary$Earnings$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(earningsTrackerSummary$Earnings$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Earnings(Money money, String str, Integer num, Integer num2, List list, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.amount = money;
            this.duration = str;
            this.month = num;
            this.year = num2;
            this.daily_data = TransactorKt.immutableCopyOf("daily_data", list);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Earnings)) {
                return false;
            }
            Earnings earnings = (Earnings) obj;
            return Intrinsics.areEqual(unknownFields(), earnings.unknownFields()) && Intrinsics.areEqual(this.amount, earnings.amount) && Intrinsics.areEqual(this.duration, earnings.duration) && Intrinsics.areEqual(this.month, earnings.month) && Intrinsics.areEqual(this.year, earnings.year) && Intrinsics.areEqual(this.daily_data, earnings.daily_data);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Money money = this.amount;
            int hashCode2 = (hashCode + (money != null ? money.hashCode() : 0)) * 37;
            String str = this.duration;
            int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
            Integer num = this.month;
            int hashCode4 = (hashCode3 + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
            Integer num2 = this.year;
            int hashCode5 = this.daily_data.hashCode() + ((hashCode4 + (num2 != null ? Integer.hashCode(num2.intValue()) : 0)) * 37);
            this.hashCode = hashCode5;
            return hashCode5;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Node.Builder builder = new Node.Builder(24);
            builder.for_each = this.amount;
            builder.moneybot_scaffold = this.duration;
            builder.compose_platform = this.month;
            builder.is_included = this.year;
            builder.motion = this.daily_data;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            if (this.amount != null) {
                arrayList.add("amount=██");
            }
            String str = this.duration;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "duration=", arrayList);
            }
            Integer num = this.month;
            if (num != null) {
                re$$ExternalSyntheticOutline0.m("month=", num, arrayList);
            }
            Integer num2 = this.year;
            if (num2 != null) {
                re$$ExternalSyntheticOutline0.m("year=", num2, arrayList);
            }
            List list = this.daily_data;
            if (!list.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("daily_data=", arrayList, list);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Earnings{", "}", 0, null, null, 56);
        }
    }

    public final class SummaryDailyData extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<SummaryDailyData> CREATOR;
        public final Money amount;
        public final Integer day;

        static {
            EarningsTrackerSummary$SummaryDailyData$Companion$ADAPTER$1 earningsTrackerSummary$SummaryDailyData$Companion$ADAPTER$1 = new EarningsTrackerSummary$SummaryDailyData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SummaryDailyData.class), "type.googleapis.com/squareup.cash.cashbusinessaccounts.EarningsTrackerSummary.SummaryDailyData", Syntax.PROTO_2, null, "squareup/cash/cashbusinessaccounts/earnings_tracker_summary.proto");
            ADAPTER = earningsTrackerSummary$SummaryDailyData$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(earningsTrackerSummary$SummaryDailyData$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SummaryDailyData(Money money, Integer num, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.day = num;
            this.amount = money;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SummaryDailyData)) {
                return false;
            }
            SummaryDailyData summaryDailyData = (SummaryDailyData) obj;
            return Intrinsics.areEqual(unknownFields(), summaryDailyData.unknownFields()) && Intrinsics.areEqual(this.day, summaryDailyData.day) && Intrinsics.areEqual(this.amount, summaryDailyData.amount);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Integer num = this.day;
            int hashCode2 = (hashCode + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
            Money money = this.amount;
            int hashCode3 = hashCode2 + (money != null ? money.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            YearlyData.Builder builder = new YearlyData.Builder(1);
            builder.year = this.day;
            builder.earnings = this.amount;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            Integer num = this.day;
            if (num != null) {
                re$$ExternalSyntheticOutline0.m("day=", num, arrayList);
            }
            Money money = this.amount;
            if (money != null) {
                Matcher$$ExternalSyntheticOutline0.m("amount=", money, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "SummaryDailyData{", "}", 0, null, null, 56);
        }
    }

    static {
        EarningsTrackerSummary$Companion$ADAPTER$1 earningsTrackerSummary$Companion$ADAPTER$1 = new EarningsTrackerSummary$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(EarningsTrackerSummary.class), "type.googleapis.com/squareup.cash.cashbusinessaccounts.EarningsTrackerSummary", Syntax.PROTO_2, null, "squareup/cash/cashbusinessaccounts/earnings_tracker_summary.proto");
        ADAPTER = earningsTrackerSummary$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(earningsTrackerSummary$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EarningsTrackerSummary(Boolean bool, Earnings earnings, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.onboarded = bool;
        this.total_earnings = earnings;
        this.first_business_upgrade_at = l;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EarningsTrackerSummary)) {
            return false;
        }
        EarningsTrackerSummary earningsTrackerSummary = (EarningsTrackerSummary) obj;
        return Intrinsics.areEqual(unknownFields(), earningsTrackerSummary.unknownFields()) && Intrinsics.areEqual(this.onboarded, earningsTrackerSummary.onboarded) && Intrinsics.areEqual(this.total_earnings, earningsTrackerSummary.total_earnings) && Intrinsics.areEqual(this.first_business_upgrade_at, earningsTrackerSummary.first_business_upgrade_at);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Boolean bool = this.onboarded;
        int hashCode2 = (hashCode + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        Earnings earnings = this.total_earnings;
        int hashCode3 = (hashCode2 + (earnings != null ? earnings.hashCode() : 0)) * 37;
        Long l = this.first_business_upgrade_at;
        int hashCode4 = hashCode3 + (l != null ? Long.hashCode(l.longValue()) : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Section.Builder builder = new Section.Builder(22);
        builder.header_text = this.onboarded;
        builder.header_button = this.total_earnings;
        builder.groups = this.first_business_upgrade_at;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Boolean bool = this.onboarded;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("onboarded=", bool, arrayList);
        }
        Earnings earnings = this.total_earnings;
        if (earnings != null) {
            arrayList.add("total_earnings=" + earnings);
        }
        Long l = this.first_business_upgrade_at;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("first_business_upgrade_at=", l, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "EarningsTrackerSummary{", "}", 0, null, null, 56);
    }
}
