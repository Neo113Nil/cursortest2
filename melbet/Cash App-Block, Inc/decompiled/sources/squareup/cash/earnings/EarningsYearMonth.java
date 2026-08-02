package squareup.cash.earnings;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.customersearch.api.PriceRange;
import com.squareup.protos.cash.disputron.core.GetClaimResolutionStatisticsResponse;
import com.squareup.protos.cash.grantly.api.Expiration;
import com.squareup.protos.cash.p2p.profile_directory.ui.Range;
import com.squareup.protos.cash.registrar.api.StatementCoverage;
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

/* loaded from: classes10.dex */
public final class EarningsYearMonth extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<EarningsYearMonth> CREATOR;
    public final Integer month;
    public final Integer year;

    /* loaded from: classes7.dex */
    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public Integer month;
        public Integer year;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new EarningsYearMonth(this.year, this.month, buildUnknownFields());
                case 1:
                    Integer num = this.year;
                    if (num == null) {
                        TransactorKt.missingRequiredFields(num, "min");
                        throw null;
                    }
                    int intValue = num.intValue();
                    Integer num2 = this.month;
                    if (num2 != null) {
                        return new PriceRange(intValue, num2.intValue(), buildUnknownFields());
                    }
                    TransactorKt.missingRequiredFields(num2, "max");
                    throw null;
                case 2:
                    return new GetClaimResolutionStatisticsResponse(this.year, this.month, buildUnknownFields());
                case 3:
                    return new Expiration(this.year, this.month, buildUnknownFields());
                case 4:
                    Integer num3 = this.year;
                    if (num3 == null) {
                        TransactorKt.missingRequiredFields(num3, "start");
                        throw null;
                    }
                    int intValue2 = num3.intValue();
                    Integer num4 = this.month;
                    if (num4 != null) {
                        return new Range(intValue2, num4.intValue(), buildUnknownFields());
                    }
                    TransactorKt.missingRequiredFields(num4, "end");
                    throw null;
                default:
                    return new StatementCoverage.Monthly(this.year, this.month, buildUnknownFields());
            }
        }
    }

    static {
        EarningsYearMonth$Companion$ADAPTER$1 earningsYearMonth$Companion$ADAPTER$1 = new EarningsYearMonth$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(EarningsYearMonth.class), "type.googleapis.com/squareup.cash.earnings.EarningsYearMonth", Syntax.PROTO_2, null, "squareup/cash/earnings/earnings_common.proto");
        ADAPTER = earningsYearMonth$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(earningsYearMonth$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EarningsYearMonth(Integer num, Integer num2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.year = num;
        this.month = num2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EarningsYearMonth)) {
            return false;
        }
        EarningsYearMonth earningsYearMonth = (EarningsYearMonth) obj;
        return Intrinsics.areEqual(unknownFields(), earningsYearMonth.unknownFields()) && Intrinsics.areEqual(this.year, earningsYearMonth.year) && Intrinsics.areEqual(this.month, earningsYearMonth.month);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Integer num = this.year;
        int hashCode2 = (hashCode + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
        Integer num2 = this.month;
        int hashCode3 = hashCode2 + (num2 != null ? Integer.hashCode(num2.intValue()) : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.year = this.year;
        builder.month = this.month;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Integer num = this.year;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("year=", num, arrayList);
        }
        Integer num2 = this.month;
        if (num2 != null) {
            re$$ExternalSyntheticOutline0.m("month=", num2, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "EarningsYearMonth{", "}", 0, null, null, 56);
    }

    public /* synthetic */ EarningsYearMonth(Integer num, Integer num2) {
        this(num, num2, ByteString.EMPTY);
    }
}
