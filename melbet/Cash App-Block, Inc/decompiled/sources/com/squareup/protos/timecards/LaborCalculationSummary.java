package com.squareup.protos.timecards;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.common.Money;
import com.squareup.protos.person.Alias;
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

/* loaded from: classes8.dex */
public final class LaborCalculationSummary extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<LaborCalculationSummary> CREATOR;
    public final Money average_wage;
    public final List doubletime_labor_calculations;
    public final LocalDateTimeRange local_date_time_range;
    public final List overtime_labor_calculations;
    public final List regular_labor_calculations;
    public final Money total_labor_money;
    public final Long total_paid_seconds;

    static {
        LaborCalculationSummary$Companion$ADAPTER$1 laborCalculationSummary$Companion$ADAPTER$1 = new LaborCalculationSummary$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LaborCalculationSummary.class), "type.googleapis.com/squareup.timecards.LaborCalculationSummary", Syntax.PROTO_2, null, "squareup/timecards/time_calculation.proto");
        ADAPTER = laborCalculationSummary$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(laborCalculationSummary$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LaborCalculationSummary(LocalDateTimeRange localDateTimeRange, Money money, Long l, Money money2, List list, List list2, List list3, ByteString byteString) {
        super(ADAPTER, byteString);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, list3, byteString);
        this.local_date_time_range = localDateTimeRange;
        this.average_wage = money;
        this.total_paid_seconds = l;
        this.total_labor_money = money2;
        this.regular_labor_calculations = TransactorKt.immutableCopyOf("regular_labor_calculations", list);
        this.overtime_labor_calculations = TransactorKt.immutableCopyOf("overtime_labor_calculations", list2);
        this.doubletime_labor_calculations = TransactorKt.immutableCopyOf("doubletime_labor_calculations", list3);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LaborCalculationSummary)) {
            return false;
        }
        LaborCalculationSummary laborCalculationSummary = (LaborCalculationSummary) obj;
        return Intrinsics.areEqual(unknownFields(), laborCalculationSummary.unknownFields()) && Intrinsics.areEqual(this.local_date_time_range, laborCalculationSummary.local_date_time_range) && Intrinsics.areEqual(this.average_wage, laborCalculationSummary.average_wage) && Intrinsics.areEqual(this.total_paid_seconds, laborCalculationSummary.total_paid_seconds) && Intrinsics.areEqual(this.total_labor_money, laborCalculationSummary.total_labor_money) && Intrinsics.areEqual(this.regular_labor_calculations, laborCalculationSummary.regular_labor_calculations) && Intrinsics.areEqual(this.overtime_labor_calculations, laborCalculationSummary.overtime_labor_calculations) && Intrinsics.areEqual(this.doubletime_labor_calculations, laborCalculationSummary.doubletime_labor_calculations);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        LocalDateTimeRange localDateTimeRange = this.local_date_time_range;
        int hashCode2 = (hashCode + (localDateTimeRange != null ? localDateTimeRange.hashCode() : 0)) * 37;
        Money money = this.average_wage;
        int hashCode3 = (hashCode2 + (money != null ? money.hashCode() : 0)) * 37;
        Long l = this.total_paid_seconds;
        int hashCode4 = (hashCode3 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        Money money2 = this.total_labor_money;
        int hashCode5 = this.doubletime_labor_calculations.hashCode() + Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m((hashCode4 + (money2 != null ? money2.hashCode() : 0)) * 37, 37, this.regular_labor_calculations), 37, this.overtime_labor_calculations);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Alias.Builder builder = new Alias.Builder(22, false);
        builder.f1407type = this.local_date_time_range;
        builder.scope = this.average_wage;
        builder.first_verified_at_ms = this.total_paid_seconds;
        builder.value = this.total_labor_money;
        builder.last_verified_at_ms = this.regular_labor_calculations;
        builder.created_at = this.overtime_labor_calculations;
        builder.updated_at = this.doubletime_labor_calculations;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        LocalDateTimeRange localDateTimeRange = this.local_date_time_range;
        if (localDateTimeRange != null) {
            arrayList.add("local_date_time_range=" + localDateTimeRange);
        }
        Money money = this.average_wage;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("average_wage=", money, arrayList);
        }
        Long l = this.total_paid_seconds;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("total_paid_seconds=", l, arrayList);
        }
        Money money2 = this.total_labor_money;
        if (money2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("total_labor_money=", money2, arrayList);
        }
        List list = this.regular_labor_calculations;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("regular_labor_calculations=", arrayList, list);
        }
        List list2 = this.overtime_labor_calculations;
        if (!list2.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("overtime_labor_calculations=", arrayList, list2);
        }
        List list3 = this.doubletime_labor_calculations;
        if (!list3.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("doubletime_labor_calculations=", arrayList, list3);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "LaborCalculationSummary{", "}", 0, null, null, 56);
    }
}
