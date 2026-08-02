package com.squareup.protos.timecards;

import android.os.Parcelable;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashlimitsxp.api.v1.GetCustomerLimitsResponse;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.common.FeeAmounts;
import com.squareup.protos.franklin.common.ReimbursedAmounts;
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
public final class LaborCostTotal extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<LaborCostTotal> CREATOR;
    public final Money doubletime_labor_money;
    public final Money overtime_labor_money;
    public final Money regular_labor_money;

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public Money doubletime_labor_money;
        public Money overtime_labor_money;
        public Money regular_labor_money;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new LaborCostTotal(this.regular_labor_money, this.overtime_labor_money, this.doubletime_labor_money, buildUnknownFields());
                case 1:
                    return new GetCustomerLimitsResponse.FlatLimits.LimitUsage.MoneyLimit(this.regular_labor_money, this.overtime_labor_money, this.doubletime_labor_money, buildUnknownFields());
                case 2:
                    return new GetCustomerLimitsResponse.LimitsSection.LimitsCategory.LimitUsage.MoneyLimit(this.regular_labor_money, this.overtime_labor_money, this.doubletime_labor_money, buildUnknownFields());
                case 3:
                    return new FeeAmounts(this.regular_labor_money, this.overtime_labor_money, this.doubletime_labor_money, buildUnknownFields());
                default:
                    return new ReimbursedAmounts(this.regular_labor_money, this.overtime_labor_money, this.doubletime_labor_money, buildUnknownFields());
            }
        }
    }

    static {
        LaborCostTotal$Companion$ADAPTER$1 laborCostTotal$Companion$ADAPTER$1 = new LaborCostTotal$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LaborCostTotal.class), "type.googleapis.com/squareup.timecards.LaborCostTotal", Syntax.PROTO_2, null, "squareup/timecards/time_calculation.proto");
        ADAPTER = laborCostTotal$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(laborCostTotal$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LaborCostTotal(Money money, Money money2, Money money3, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.regular_labor_money = money;
        this.overtime_labor_money = money2;
        this.doubletime_labor_money = money3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LaborCostTotal)) {
            return false;
        }
        LaborCostTotal laborCostTotal = (LaborCostTotal) obj;
        return Intrinsics.areEqual(unknownFields(), laborCostTotal.unknownFields()) && Intrinsics.areEqual(this.regular_labor_money, laborCostTotal.regular_labor_money) && Intrinsics.areEqual(this.overtime_labor_money, laborCostTotal.overtime_labor_money) && Intrinsics.areEqual(this.doubletime_labor_money, laborCostTotal.doubletime_labor_money);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Money money = this.regular_labor_money;
        int hashCode2 = (hashCode + (money != null ? money.hashCode() : 0)) * 37;
        Money money2 = this.overtime_labor_money;
        int hashCode3 = (hashCode2 + (money2 != null ? money2.hashCode() : 0)) * 37;
        Money money3 = this.doubletime_labor_money;
        int hashCode4 = hashCode3 + (money3 != null ? money3.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.regular_labor_money = this.regular_labor_money;
        builder.overtime_labor_money = this.overtime_labor_money;
        builder.doubletime_labor_money = this.doubletime_labor_money;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Money money = this.regular_labor_money;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("regular_labor_money=", money, arrayList);
        }
        Money money2 = this.overtime_labor_money;
        if (money2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("overtime_labor_money=", money2, arrayList);
        }
        Money money3 = this.doubletime_labor_money;
        if (money3 != null) {
            Matcher$$ExternalSyntheticOutline0.m("doubletime_labor_money=", money3, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "LaborCostTotal{", "}", 0, null, null, 56);
    }
}
