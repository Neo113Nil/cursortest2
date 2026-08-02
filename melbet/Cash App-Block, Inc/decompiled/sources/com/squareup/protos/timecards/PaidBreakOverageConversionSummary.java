package com.squareup.protos.timecards;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.common.BalanceImpact;
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
public final class PaidBreakOverageConversionSummary extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<PaidBreakOverageConversionSummary> CREATOR;
    public final String converted_duration;
    public final Money total_labor_cost_saved;

    static {
        PaidBreakOverageConversionSummary$Companion$ADAPTER$1 paidBreakOverageConversionSummary$Companion$ADAPTER$1 = new PaidBreakOverageConversionSummary$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(PaidBreakOverageConversionSummary.class), "type.googleapis.com/squareup.timecards.PaidBreakOverageConversionSummary", Syntax.PROTO_2, null, "squareup/timecards/time_calculation.proto");
        ADAPTER = paidBreakOverageConversionSummary$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(paidBreakOverageConversionSummary$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaidBreakOverageConversionSummary(Money money, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.converted_duration = str;
        this.total_labor_cost_saved = money;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PaidBreakOverageConversionSummary)) {
            return false;
        }
        PaidBreakOverageConversionSummary paidBreakOverageConversionSummary = (PaidBreakOverageConversionSummary) obj;
        return Intrinsics.areEqual(unknownFields(), paidBreakOverageConversionSummary.unknownFields()) && Intrinsics.areEqual(this.converted_duration, paidBreakOverageConversionSummary.converted_duration) && Intrinsics.areEqual(this.total_labor_cost_saved, paidBreakOverageConversionSummary.total_labor_cost_saved);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.converted_duration;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        Money money = this.total_labor_cost_saved;
        int hashCode3 = hashCode2 + (money != null ? money.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        BalanceImpact.Builder builder = new BalanceImpact.Builder(8);
        builder.balance_name = this.converted_duration;
        builder.amount = this.total_labor_cost_saved;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.converted_duration;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "converted_duration=", arrayList);
        }
        Money money = this.total_labor_cost_saved;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("total_labor_cost_saved=", money, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PaidBreakOverageConversionSummary{", "}", 0, null, null, 56);
    }
}
