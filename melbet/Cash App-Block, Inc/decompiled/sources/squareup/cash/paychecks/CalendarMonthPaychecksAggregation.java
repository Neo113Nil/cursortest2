package squareup.cash.paychecks;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
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
import squareup.cash.bills.BillsApplet;

/* loaded from: classes10.dex */
public final class CalendarMonthPaychecksAggregation extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CalendarMonthPaychecksAggregation> CREATOR;
    public final TimeBoundedPaychecksAggregation aggregation;
    public final Long month_in_year;
    public final Long year;

    static {
        CalendarMonthPaychecksAggregation$Companion$ADAPTER$1 calendarMonthPaychecksAggregation$Companion$ADAPTER$1 = new CalendarMonthPaychecksAggregation$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CalendarMonthPaychecksAggregation.class), "type.googleapis.com/squareup.cash.paychecks.CalendarMonthPaychecksAggregation", Syntax.PROTO_2, null, "squareup/cash/paychecks/CalendarMonthPaychecksAggregation.proto");
        ADAPTER = calendarMonthPaychecksAggregation$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(calendarMonthPaychecksAggregation$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CalendarMonthPaychecksAggregation(Long l, Long l2, TimeBoundedPaychecksAggregation timeBoundedPaychecksAggregation, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.month_in_year = l;
        this.year = l2;
        this.aggregation = timeBoundedPaychecksAggregation;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CalendarMonthPaychecksAggregation)) {
            return false;
        }
        CalendarMonthPaychecksAggregation calendarMonthPaychecksAggregation = (CalendarMonthPaychecksAggregation) obj;
        return Intrinsics.areEqual(unknownFields(), calendarMonthPaychecksAggregation.unknownFields()) && Intrinsics.areEqual(this.month_in_year, calendarMonthPaychecksAggregation.month_in_year) && Intrinsics.areEqual(this.year, calendarMonthPaychecksAggregation.year) && Intrinsics.areEqual(this.aggregation, calendarMonthPaychecksAggregation.aggregation);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Long l = this.month_in_year;
        int hashCode2 = (hashCode + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        Long l2 = this.year;
        int hashCode3 = (hashCode2 + (l2 != null ? Long.hashCode(l2.longValue()) : 0)) * 37;
        TimeBoundedPaychecksAggregation timeBoundedPaychecksAggregation = this.aggregation;
        int hashCode4 = hashCode3 + (timeBoundedPaychecksAggregation != null ? timeBoundedPaychecksAggregation.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        BillsApplet.Builder builder = new BillsApplet.Builder(20);
        builder.action = this.month_in_year;
        builder.full_applet = this.year;
        builder.half_applet = this.aggregation;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Long l = this.month_in_year;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("month_in_year=", l, arrayList);
        }
        Long l2 = this.year;
        if (l2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("year=", l2, arrayList);
        }
        TimeBoundedPaychecksAggregation timeBoundedPaychecksAggregation = this.aggregation;
        if (timeBoundedPaychecksAggregation != null) {
            arrayList.add("aggregation=" + timeBoundedPaychecksAggregation);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CalendarMonthPaychecksAggregation{", "}", 0, null, null, 56);
    }
}
