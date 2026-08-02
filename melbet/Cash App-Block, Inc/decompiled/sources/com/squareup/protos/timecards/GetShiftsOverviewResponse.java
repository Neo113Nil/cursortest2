package com.squareup.protos.timecards;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.common.Money;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import net.oneformapp.helper.matching.POPMatchingFactory;
import okio.ByteString;
import xyz.block.protos.genie.Expression;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/squareup/protos/timecards/GetShiftsOverviewResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lxyz/block/protos/genie/Expression$Builder;", "Builder", "IntervalType", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class GetShiftsOverviewResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetShiftsOverviewResponse> CREATOR;
    public final DatetimeInterval current_interval;
    public final IntervalType interval_type;
    public final List next_intervals;
    public final List previous_intervals;
    public final List rows;
    public final Money total_commissions;
    public final Money total_estimated_pay;
    public final String total_hours_scheduled;
    public final String total_hours_worked;
    public final Integer total_timecards;
    public final Money total_tips;
    public final String workweek_start;

    public enum IntervalType implements WireEnum {
        INTERVAL_TYPE_DO_NOT_USE(0),
        PAY_PERIOD(1),
        WORKWEEK(2);

        public static final GetShiftsOverviewResponse$IntervalType$Companion$ADAPTER$1 ADAPTER;
        public static final POPMatchingFactory Companion;
        public final int value;

        static {
            IntervalType intervalType = INTERVAL_TYPE_DO_NOT_USE;
            Companion = new POPMatchingFactory(5);
            ADAPTER = new GetShiftsOverviewResponse$IntervalType$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(IntervalType.class), Syntax.PROTO_2, intervalType);
        }

        IntervalType(int i) {
            this.value = i;
        }

        public static final IntervalType fromValue(int i) {
            Companion.getClass();
            if (i == 0) {
                return INTERVAL_TYPE_DO_NOT_USE;
            }
            if (i == 1) {
                return PAY_PERIOD;
            }
            if (i != 2) {
                return null;
            }
            return WORKWEEK;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        GetShiftsOverviewResponse$Companion$ADAPTER$1 getShiftsOverviewResponse$Companion$ADAPTER$1 = new GetShiftsOverviewResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetShiftsOverviewResponse.class), "type.googleapis.com/squareup.timecards.GetShiftsOverviewResponse", Syntax.PROTO_2, null, "squareup/timecards/timecards_service.proto");
        ADAPTER = getShiftsOverviewResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getShiftsOverviewResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetShiftsOverviewResponse(String str, List list, List list2, List list3, DatetimeInterval datetimeInterval, IntervalType intervalType, String str2, String str3, Money money, Money money2, Money money3, Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, list3, byteString);
        this.workweek_start = str;
        this.current_interval = datetimeInterval;
        this.interval_type = intervalType;
        this.total_hours_worked = str2;
        this.total_hours_scheduled = str3;
        this.total_tips = money;
        this.total_estimated_pay = money2;
        this.total_commissions = money3;
        this.total_timecards = num;
        this.rows = TransactorKt.immutableCopyOf("rows", list);
        this.previous_intervals = TransactorKt.immutableCopyOf("previous_intervals", list2);
        this.next_intervals = TransactorKt.immutableCopyOf("next_intervals", list3);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetShiftsOverviewResponse)) {
            return false;
        }
        GetShiftsOverviewResponse getShiftsOverviewResponse = (GetShiftsOverviewResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getShiftsOverviewResponse.unknownFields()) && Intrinsics.areEqual(this.workweek_start, getShiftsOverviewResponse.workweek_start) && Intrinsics.areEqual(this.rows, getShiftsOverviewResponse.rows) && Intrinsics.areEqual(this.previous_intervals, getShiftsOverviewResponse.previous_intervals) && Intrinsics.areEqual(this.next_intervals, getShiftsOverviewResponse.next_intervals) && Intrinsics.areEqual(this.current_interval, getShiftsOverviewResponse.current_interval) && this.interval_type == getShiftsOverviewResponse.interval_type && Intrinsics.areEqual(this.total_hours_worked, getShiftsOverviewResponse.total_hours_worked) && Intrinsics.areEqual(this.total_hours_scheduled, getShiftsOverviewResponse.total_hours_scheduled) && Intrinsics.areEqual(this.total_tips, getShiftsOverviewResponse.total_tips) && Intrinsics.areEqual(this.total_estimated_pay, getShiftsOverviewResponse.total_estimated_pay) && Intrinsics.areEqual(this.total_commissions, getShiftsOverviewResponse.total_commissions) && Intrinsics.areEqual(this.total_timecards, getShiftsOverviewResponse.total_timecards);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.workweek_start;
        int m = Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m((hashCode + (str != null ? str.hashCode() : 0)) * 37, 37, this.rows), 37, this.previous_intervals), 37, this.next_intervals);
        DatetimeInterval datetimeInterval = this.current_interval;
        int hashCode2 = (m + (datetimeInterval != null ? datetimeInterval.hashCode() : 0)) * 37;
        IntervalType intervalType = this.interval_type;
        int hashCode3 = (hashCode2 + (intervalType != null ? intervalType.hashCode() : 0)) * 37;
        String str2 = this.total_hours_worked;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.total_hours_scheduled;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 37;
        Money money = this.total_tips;
        int hashCode6 = (hashCode5 + (money != null ? money.hashCode() : 0)) * 37;
        Money money2 = this.total_estimated_pay;
        int hashCode7 = (hashCode6 + (money2 != null ? money2.hashCode() : 0)) * 37;
        Money money3 = this.total_commissions;
        int hashCode8 = (hashCode7 + (money3 != null ? money3.hashCode() : 0)) * 37;
        Integer num = this.total_timecards;
        int hashCode9 = hashCode8 + (num != null ? Integer.hashCode(num.intValue()) : 0);
        this.hashCode = hashCode9;
        return hashCode9;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Expression.Builder builder = new Expression.Builder(26, false);
        builder.string_literal = this.workweek_start;
        builder.key_path_ref = this.rows;
        builder.int_literal = this.previous_intervals;
        builder.float_literal = this.next_intervals;
        builder.bool_literal = this.current_interval;
        builder.blob_literal = this.interval_type;
        builder.unary_op = this.total_hours_worked;
        builder.binary_op = this.total_hours_scheduled;
        builder.conditional_op = this.total_tips;
        builder.filter_op = this.total_estimated_pay;
        builder.collection_literal = this.total_commissions;
        builder.format_string_op = this.total_timecards;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.workweek_start;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "workweek_start=", arrayList);
        }
        List list = this.rows;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("rows=", arrayList, list);
        }
        List list2 = this.previous_intervals;
        if (!list2.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("previous_intervals=", arrayList, list2);
        }
        List list3 = this.next_intervals;
        if (!list3.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("next_intervals=", arrayList, list3);
        }
        DatetimeInterval datetimeInterval = this.current_interval;
        if (datetimeInterval != null) {
            arrayList.add("current_interval=" + datetimeInterval);
        }
        IntervalType intervalType = this.interval_type;
        if (intervalType != null) {
            arrayList.add("interval_type=" + intervalType);
        }
        String str2 = this.total_hours_worked;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "total_hours_worked=", arrayList);
        }
        String str3 = this.total_hours_scheduled;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "total_hours_scheduled=", arrayList);
        }
        Money money = this.total_tips;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("total_tips=", money, arrayList);
        }
        Money money2 = this.total_estimated_pay;
        if (money2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("total_estimated_pay=", money2, arrayList);
        }
        Money money3 = this.total_commissions;
        if (money3 != null) {
            Matcher$$ExternalSyntheticOutline0.m("total_commissions=", money3, arrayList);
        }
        Integer num = this.total_timecards;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("total_timecards=", num, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetShiftsOverviewResponse{", "}", 0, null, null, 56);
    }
}
