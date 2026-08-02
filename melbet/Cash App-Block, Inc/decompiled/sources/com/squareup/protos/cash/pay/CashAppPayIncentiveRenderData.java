package com.squareup.protos.cash.pay;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.common.Money;
import com.squareup.protos.timecards.LaborCalculation;
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
public final class CashAppPayIncentiveRenderData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CashAppPayIncentiveRenderData> CREATOR;
    public final Long discount_bps;
    public final Money flat_discount_money;
    public final String incentive_id;
    public final Money maximum_variable_discount_money;
    public final Money minimum_eligible_money;

    static {
        CashAppPayIncentiveRenderData$Companion$ADAPTER$1 cashAppPayIncentiveRenderData$Companion$ADAPTER$1 = new CashAppPayIncentiveRenderData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CashAppPayIncentiveRenderData.class), "type.googleapis.com/squareup.cash.pay.CashAppPayIncentiveRenderData", Syntax.PROTO_2, null, "squareup/cash/pay/cash_app_pay_incentive.proto");
        ADAPTER = cashAppPayIncentiveRenderData$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(cashAppPayIncentiveRenderData$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CashAppPayIncentiveRenderData(String str, Long l, Money money, Money money2, Money money3, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.incentive_id = str;
        this.discount_bps = l;
        this.flat_discount_money = money;
        this.maximum_variable_discount_money = money2;
        this.minimum_eligible_money = money3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CashAppPayIncentiveRenderData)) {
            return false;
        }
        CashAppPayIncentiveRenderData cashAppPayIncentiveRenderData = (CashAppPayIncentiveRenderData) obj;
        return Intrinsics.areEqual(unknownFields(), cashAppPayIncentiveRenderData.unknownFields()) && Intrinsics.areEqual(this.incentive_id, cashAppPayIncentiveRenderData.incentive_id) && Intrinsics.areEqual(this.discount_bps, cashAppPayIncentiveRenderData.discount_bps) && Intrinsics.areEqual(this.flat_discount_money, cashAppPayIncentiveRenderData.flat_discount_money) && Intrinsics.areEqual(this.maximum_variable_discount_money, cashAppPayIncentiveRenderData.maximum_variable_discount_money) && Intrinsics.areEqual(this.minimum_eligible_money, cashAppPayIncentiveRenderData.minimum_eligible_money);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.incentive_id;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        Long l = this.discount_bps;
        int hashCode3 = (hashCode2 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        Money money = this.flat_discount_money;
        int hashCode4 = (hashCode3 + (money != null ? money.hashCode() : 0)) * 37;
        Money money2 = this.maximum_variable_discount_money;
        int hashCode5 = (hashCode4 + (money2 != null ? money2.hashCode() : 0)) * 37;
        Money money3 = this.minimum_eligible_money;
        int hashCode6 = hashCode5 + (money3 != null ? money3.hashCode() : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        LaborCalculation.Builder builder = new LaborCalculation.Builder(1);
        builder.job_title = this.incentive_id;
        builder.paid_seconds = this.discount_bps;
        builder.base_hourly_rate = this.flat_discount_money;
        builder.premium_hourly_rate = this.maximum_variable_discount_money;
        builder.labor_money = this.minimum_eligible_money;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.incentive_id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "incentive_id=", arrayList);
        }
        Long l = this.discount_bps;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("discount_bps=", l, arrayList);
        }
        Money money = this.flat_discount_money;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("flat_discount_money=", money, arrayList);
        }
        Money money2 = this.maximum_variable_discount_money;
        if (money2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("maximum_variable_discount_money=", money2, arrayList);
        }
        Money money3 = this.minimum_eligible_money;
        if (money3 != null) {
            Matcher$$ExternalSyntheticOutline0.m("minimum_eligible_money=", money3, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CashAppPayIncentiveRenderData{", "}", 0, null, null, 56);
    }
}
