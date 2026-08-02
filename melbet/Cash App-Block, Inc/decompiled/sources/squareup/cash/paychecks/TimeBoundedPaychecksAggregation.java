package squareup.cash.paychecks;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
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
import xyz.block.protos.genie.Action;

/* loaded from: classes10.dex */
public final class TimeBoundedPaychecksAggregation extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<TimeBoundedPaychecksAggregation> CREATOR;
    public final List deductions;
    public final List employers;
    public final Long end_date;
    public final List realized_allocation_amounts;
    public final Long start_date;
    public final String time_bounded_paychecks_aggregation_token;

    static {
        TimeBoundedPaychecksAggregation$Companion$ADAPTER$1 timeBoundedPaychecksAggregation$Companion$ADAPTER$1 = new TimeBoundedPaychecksAggregation$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(TimeBoundedPaychecksAggregation.class), "type.googleapis.com/squareup.cash.paychecks.TimeBoundedPaychecksAggregation", Syntax.PROTO_2, null, "squareup/cash/paychecks/TimeBoundedPaychecksAggregation.proto");
        ADAPTER = timeBoundedPaychecksAggregation$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(timeBoundedPaychecksAggregation$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimeBoundedPaychecksAggregation(String str, Long l, Long l2, List list, List list2, List list3, ByteString byteString) {
        super(ADAPTER, byteString);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, list3, byteString);
        this.time_bounded_paychecks_aggregation_token = str;
        this.start_date = l;
        this.end_date = l2;
        this.employers = TransactorKt.immutableCopyOf("employers", list);
        this.deductions = TransactorKt.immutableCopyOf("deductions", list2);
        this.realized_allocation_amounts = TransactorKt.immutableCopyOf("realized_allocation_amounts", list3);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TimeBoundedPaychecksAggregation)) {
            return false;
        }
        TimeBoundedPaychecksAggregation timeBoundedPaychecksAggregation = (TimeBoundedPaychecksAggregation) obj;
        return Intrinsics.areEqual(unknownFields(), timeBoundedPaychecksAggregation.unknownFields()) && Intrinsics.areEqual(this.time_bounded_paychecks_aggregation_token, timeBoundedPaychecksAggregation.time_bounded_paychecks_aggregation_token) && Intrinsics.areEqual(this.start_date, timeBoundedPaychecksAggregation.start_date) && Intrinsics.areEqual(this.end_date, timeBoundedPaychecksAggregation.end_date) && Intrinsics.areEqual(this.employers, timeBoundedPaychecksAggregation.employers) && Intrinsics.areEqual(this.deductions, timeBoundedPaychecksAggregation.deductions) && Intrinsics.areEqual(this.realized_allocation_amounts, timeBoundedPaychecksAggregation.realized_allocation_amounts);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.time_bounded_paychecks_aggregation_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        Long l = this.start_date;
        int hashCode3 = (hashCode2 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        Long l2 = this.end_date;
        int hashCode4 = this.realized_allocation_amounts.hashCode() + Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m((hashCode3 + (l2 != null ? Long.hashCode(l2.longValue()) : 0)) * 37, 37, this.employers), 37, this.deductions);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Action.Builder builder = new Action.Builder(9);
        builder.navigate = this.time_bounded_paychecks_aggregation_token;
        builder.set_view_state_value = this.start_date;
        builder.open_url = this.end_date;
        builder.compound_action = this.employers;
        builder.submit = this.deductions;
        builder.collection_mutation = this.realized_allocation_amounts;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.time_bounded_paychecks_aggregation_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "time_bounded_paychecks_aggregation_token=", arrayList);
        }
        Long l = this.start_date;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("start_date=", l, arrayList);
        }
        Long l2 = this.end_date;
        if (l2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("end_date=", l2, arrayList);
        }
        List list = this.employers;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("employers=", arrayList, list);
        }
        List list2 = this.deductions;
        if (!list2.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("deductions=", arrayList, list2);
        }
        List list3 = this.realized_allocation_amounts;
        if (!list3.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("realized_allocation_amounts=", arrayList, list3);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "TimeBoundedPaychecksAggregation{", "}", 0, null, null, 56);
    }
}
