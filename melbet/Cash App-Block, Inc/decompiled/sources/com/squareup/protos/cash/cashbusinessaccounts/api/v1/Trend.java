package com.squareup.protos.cash.cashbusinessaccounts.api.v1;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.aegis.core.Section;
import com.squareup.protos.cash.api.Error;
import com.squareup.protos.common.Money;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class Trend extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Trend> CREATOR;
    public final Money amount_difference;
    public final String comparison_period;
    public final TrendDirection trend_direction;

    public enum TrendDirection implements WireEnum {
        TREND_DIRECTION_POSITIVE(1),
        TREND_DIRECTION_NEGATIVE(2);

        public final int value;
        public static final Error.Code.Companion Companion = new Error.Code.Companion(22);
        public static final Trend$TrendDirection$Companion$ADAPTER$1 ADAPTER = new Trend$TrendDirection$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(TrendDirection.class), Syntax.PROTO_2, null);

        TrendDirection(int i) {
            this.value = i;
        }

        public static final TrendDirection fromValue(int i) {
            Companion.getClass();
            if (i == 1) {
                return TREND_DIRECTION_POSITIVE;
            }
            if (i != 2) {
                return null;
            }
            return TREND_DIRECTION_NEGATIVE;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        Trend$Companion$ADAPTER$1 trend$Companion$ADAPTER$1 = new Trend$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Trend.class), "type.googleapis.com/squareup.cash.cashbusinessaccounts.api.v1beta1.Trend", Syntax.PROTO_2, null, "squareup/cash/cashbusinessaccounts/api/v1beta1/earnings_tracker.proto");
        ADAPTER = trend$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(trend$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Trend(Money money, TrendDirection trendDirection, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.amount_difference = money;
        this.trend_direction = trendDirection;
        this.comparison_period = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Trend)) {
            return false;
        }
        Trend trend = (Trend) obj;
        return Intrinsics.areEqual(unknownFields(), trend.unknownFields()) && Intrinsics.areEqual(this.amount_difference, trend.amount_difference) && this.trend_direction == trend.trend_direction && Intrinsics.areEqual(this.comparison_period, trend.comparison_period);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Money money = this.amount_difference;
        int hashCode2 = (hashCode + (money != null ? money.hashCode() : 0)) * 37;
        TrendDirection trendDirection = this.trend_direction;
        int hashCode3 = (hashCode2 + (trendDirection != null ? trendDirection.hashCode() : 0)) * 37;
        String str = this.comparison_period;
        int hashCode4 = hashCode3 + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Section.Builder builder = new Section.Builder(27);
        builder.header_button = this.amount_difference;
        builder.groups = this.trend_direction;
        builder.header_text = this.comparison_period;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Money money = this.amount_difference;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("amount_difference=", money, arrayList);
        }
        TrendDirection trendDirection = this.trend_direction;
        if (trendDirection != null) {
            arrayList.add("trend_direction=" + trendDirection);
        }
        String str = this.comparison_period;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "comparison_period=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Trend{", "}", 0, null, null, 56);
    }
}
