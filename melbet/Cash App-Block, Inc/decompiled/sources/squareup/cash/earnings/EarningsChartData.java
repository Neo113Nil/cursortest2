package squareup.cash.earnings;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
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
import squareup.cash.bills.BillsConfig;

/* loaded from: classes10.dex */
public final class EarningsChartData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<EarningsChartData> CREATOR;
    public final List earnings;
    public final EarningsTimeFrame period;

    static {
        EarningsChartData$Companion$ADAPTER$1 earningsChartData$Companion$ADAPTER$1 = new EarningsChartData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(EarningsChartData.class), "type.googleapis.com/squareup.cash.earnings.EarningsChartData", Syntax.PROTO_2, null, "squareup/cash/earnings/earnings_common.proto");
        ADAPTER = earningsChartData$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(earningsChartData$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EarningsChartData(EarningsTimeFrame earningsTimeFrame, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.period = earningsTimeFrame;
        this.earnings = TransactorKt.immutableCopyOf("earnings", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EarningsChartData)) {
            return false;
        }
        EarningsChartData earningsChartData = (EarningsChartData) obj;
        return Intrinsics.areEqual(unknownFields(), earningsChartData.unknownFields()) && Intrinsics.areEqual(this.period, earningsChartData.period) && Intrinsics.areEqual(this.earnings, earningsChartData.earnings);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        EarningsTimeFrame earningsTimeFrame = this.period;
        int hashCode2 = this.earnings.hashCode() + ((hashCode + (earningsTimeFrame != null ? earningsTimeFrame.hashCode() : 0)) * 37);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        BillsConfig.Builder builder = new BillsConfig.Builder(12);
        builder.bills_applet_default_action = this.period;
        builder.half_applet_content = this.earnings;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        EarningsTimeFrame earningsTimeFrame = this.period;
        if (earningsTimeFrame != null) {
            arrayList.add("period=" + earningsTimeFrame);
        }
        List list = this.earnings;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("earnings=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "EarningsChartData{", "}", 0, null, null, 56);
    }
}
