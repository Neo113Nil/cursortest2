package squareup.cash.bankingbenefits.ui;

import android.os.Parcelable;
import bo.app.re$$ExternalSyntheticOutline0;
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
import squareup.cash.earnings.EarningsYearToDate;

/* loaded from: classes10.dex */
public final class RiskStatus extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<RiskStatus> CREATOR;
    public final Integer days_remaining;

    static {
        RiskStatus$Companion$ADAPTER$1 riskStatus$Companion$ADAPTER$1 = new RiskStatus$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(RiskStatus.class), "type.googleapis.com/squareup.cash.bankingbenefits.ui.RiskStatus", Syntax.PROTO_2, null, "squareup/cash/bankingbenefits/ui/CashGreen.proto");
        ADAPTER = riskStatus$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(riskStatus$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RiskStatus(Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.days_remaining = num;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RiskStatus)) {
            return false;
        }
        RiskStatus riskStatus = (RiskStatus) obj;
        return Intrinsics.areEqual(unknownFields(), riskStatus.unknownFields()) && Intrinsics.areEqual(this.days_remaining, riskStatus.days_remaining);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Integer num = this.days_remaining;
        int hashCode2 = hashCode + (num != null ? Integer.hashCode(num.intValue()) : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        EarningsYearToDate.Builder builder = new EarningsYearToDate.Builder(10);
        builder.year = this.days_remaining;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Integer num = this.days_remaining;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("days_remaining=", num, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "RiskStatus{", "}", 0, null, null, 56);
    }
}
