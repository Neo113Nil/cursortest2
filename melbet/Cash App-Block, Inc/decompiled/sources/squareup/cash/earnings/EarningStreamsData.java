package squareup.cash.earnings;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.common.Money;
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
import squareup.cash.paychecks.Deduction;

/* loaded from: classes10.dex */
public final class EarningStreamsData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<EarningStreamsData> CREATOR;
    public final Money monthly_total;
    public final EarningsTimeFrame period;
    public final List streams;
    public final EarningsYearMonth year_month_period;

    static {
        EarningStreamsData$Companion$ADAPTER$1 earningStreamsData$Companion$ADAPTER$1 = new EarningStreamsData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(EarningStreamsData.class), "type.googleapis.com/squareup.cash.earnings.EarningStreamsData", Syntax.PROTO_2, null, "squareup/cash/earnings/earnings_common.proto");
        ADAPTER = earningStreamsData$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(earningStreamsData$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EarningStreamsData(List list, Money money, EarningsTimeFrame earningsTimeFrame, EarningsYearMonth earningsYearMonth, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.monthly_total = money;
        this.period = earningsTimeFrame;
        this.year_month_period = earningsYearMonth;
        this.streams = TransactorKt.immutableCopyOf("streams", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EarningStreamsData)) {
            return false;
        }
        EarningStreamsData earningStreamsData = (EarningStreamsData) obj;
        return Intrinsics.areEqual(unknownFields(), earningStreamsData.unknownFields()) && Intrinsics.areEqual(this.streams, earningStreamsData.streams) && Intrinsics.areEqual(this.monthly_total, earningStreamsData.monthly_total) && Intrinsics.areEqual(this.period, earningStreamsData.period) && Intrinsics.areEqual(this.year_month_period, earningStreamsData.year_month_period);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.streams);
        Money money = this.monthly_total;
        int hashCode = (m + (money != null ? money.hashCode() : 0)) * 37;
        EarningsTimeFrame earningsTimeFrame = this.period;
        int hashCode2 = (hashCode + (earningsTimeFrame != null ? earningsTimeFrame.hashCode() : 0)) * 37;
        EarningsYearMonth earningsYearMonth = this.year_month_period;
        int hashCode3 = hashCode2 + (earningsYearMonth != null ? earningsYearMonth.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Deduction.Builder builder = new Deduction.Builder(11);
        builder.description = this.streams;
        builder.amount = this.monthly_total;
        builder.note = this.period;
        builder.tint_color = this.year_month_period;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.streams;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("streams=", arrayList, list);
        }
        Money money = this.monthly_total;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("monthly_total=", money, arrayList);
        }
        EarningsTimeFrame earningsTimeFrame = this.period;
        if (earningsTimeFrame != null) {
            arrayList.add("period=" + earningsTimeFrame);
        }
        EarningsYearMonth earningsYearMonth = this.year_month_period;
        if (earningsYearMonth != null) {
            arrayList.add("year_month_period=" + earningsYearMonth);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "EarningStreamsData{", "}", 0, null, null, 56);
    }
}
