package com.squareup.protos.timecards;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.pay.CashAppPayIncentiveRenderData;
import com.squareup.protos.common.Money;
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

/* loaded from: classes8.dex */
public final class LaborCalculation extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<LaborCalculation> CREATOR;
    public final Money base_hourly_rate;
    public final String job_title;
    public final Money labor_money;
    public final Long paid_seconds;
    public final Money premium_hourly_rate;

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public Money base_hourly_rate;
        public String job_title;
        public Money labor_money;
        public Long paid_seconds;
        public Money premium_hourly_rate;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new LaborCalculation(this.job_title, this.paid_seconds, this.base_hourly_rate, this.premium_hourly_rate, this.labor_money, buildUnknownFields());
                default:
                    return new CashAppPayIncentiveRenderData(this.job_title, this.paid_seconds, this.base_hourly_rate, this.premium_hourly_rate, this.labor_money, buildUnknownFields());
            }
        }
    }

    static {
        LaborCalculation$Companion$ADAPTER$1 laborCalculation$Companion$ADAPTER$1 = new LaborCalculation$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LaborCalculation.class), "type.googleapis.com/squareup.timecards.LaborCalculation", Syntax.PROTO_2, null, "squareup/timecards/time_calculation.proto");
        ADAPTER = laborCalculation$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(laborCalculation$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LaborCalculation(String str, Long l, Money money, Money money2, Money money3, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.job_title = str;
        this.paid_seconds = l;
        this.base_hourly_rate = money;
        this.premium_hourly_rate = money2;
        this.labor_money = money3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LaborCalculation)) {
            return false;
        }
        LaborCalculation laborCalculation = (LaborCalculation) obj;
        return Intrinsics.areEqual(unknownFields(), laborCalculation.unknownFields()) && Intrinsics.areEqual(this.job_title, laborCalculation.job_title) && Intrinsics.areEqual(this.paid_seconds, laborCalculation.paid_seconds) && Intrinsics.areEqual(this.base_hourly_rate, laborCalculation.base_hourly_rate) && Intrinsics.areEqual(this.premium_hourly_rate, laborCalculation.premium_hourly_rate) && Intrinsics.areEqual(this.labor_money, laborCalculation.labor_money);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.job_title;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        Long l = this.paid_seconds;
        int hashCode3 = (hashCode2 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        Money money = this.base_hourly_rate;
        int hashCode4 = (hashCode3 + (money != null ? money.hashCode() : 0)) * 37;
        Money money2 = this.premium_hourly_rate;
        int hashCode5 = (hashCode4 + (money2 != null ? money2.hashCode() : 0)) * 37;
        Money money3 = this.labor_money;
        int hashCode6 = hashCode5 + (money3 != null ? money3.hashCode() : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.job_title = this.job_title;
        builder.paid_seconds = this.paid_seconds;
        builder.base_hourly_rate = this.base_hourly_rate;
        builder.premium_hourly_rate = this.premium_hourly_rate;
        builder.labor_money = this.labor_money;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.job_title;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "job_title=", arrayList);
        }
        Long l = this.paid_seconds;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("paid_seconds=", l, arrayList);
        }
        Money money = this.base_hourly_rate;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("base_hourly_rate=", money, arrayList);
        }
        Money money2 = this.premium_hourly_rate;
        if (money2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("premium_hourly_rate=", money2, arrayList);
        }
        Money money3 = this.labor_money;
        if (money3 != null) {
            Matcher$$ExternalSyntheticOutline0.m("labor_money=", money3, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "LaborCalculation{", "}", 0, null, null, 56);
    }
}
