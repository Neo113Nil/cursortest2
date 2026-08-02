package com.squareup.protos.cash.cashbusinessaccounts.api.v1;

import android.os.Parcelable;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashbusinessaccounts.EarningsTrackerSummary;
import com.squareup.protos.cash.cashstorefronts.api.RewardRelativeAmount;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.ui.UiInvestingAutomation;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class YearlyData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<YearlyData> CREATOR;
    public final Money earnings;
    public final Integer year;

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public Money earnings;
        public Integer year;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new YearlyData(this.earnings, this.year, buildUnknownFields());
                case 1:
                    return new EarningsTrackerSummary.SummaryDailyData(this.earnings, this.year, buildUnknownFields());
                case 2:
                    return new RewardRelativeAmount(this.earnings, this.year, buildUnknownFields());
                default:
                    return new UiInvestingAutomation.UiAutomationStatistics(this.earnings, this.year, buildUnknownFields());
            }
        }
    }

    static {
        YearlyData$Companion$ADAPTER$1 yearlyData$Companion$ADAPTER$1 = new YearlyData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(YearlyData.class), "type.googleapis.com/squareup.cash.cashbusinessaccounts.api.v1beta1.YearlyData", Syntax.PROTO_2, null, "squareup/cash/cashbusinessaccounts/api/v1beta1/earnings_tracker.proto");
        ADAPTER = yearlyData$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(yearlyData$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YearlyData(Money money, Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.earnings = money;
        this.year = num;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof YearlyData)) {
            return false;
        }
        YearlyData yearlyData = (YearlyData) obj;
        return Intrinsics.areEqual(unknownFields(), yearlyData.unknownFields()) && Intrinsics.areEqual(this.earnings, yearlyData.earnings) && Intrinsics.areEqual(this.year, yearlyData.year);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Money money = this.earnings;
        int hashCode2 = (hashCode + (money != null ? money.hashCode() : 0)) * 37;
        Integer num = this.year;
        int hashCode3 = hashCode2 + (num != null ? Integer.hashCode(num.intValue()) : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.earnings = this.earnings;
        builder.year = this.year;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Money money = this.earnings;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("earnings=", money, arrayList);
        }
        Integer num = this.year;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("year=", num, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "YearlyData{", "}", 0, null, null, 56);
    }
}
