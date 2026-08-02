package squareup.cash.earnings;

import android.os.Parcelable;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.aegis.api.GetAllowlistLimitForDependentResponse;
import com.squareup.protos.cash.cashapproxy.api.Spacer;
import com.squareup.protos.cash.cashsuggest.api.InAppBrowserMetadata;
import com.squareup.protos.cash.investautomator.model.Automation;
import com.squareup.protos.cash.registrar.api.StatementCoverage;
import com.squareup.protos.franklin.common.InvestingAutomationExecutionRenderData;
import com.squareup.protos.investing.notifications.settings.NotificationsSettingsPerformanceConfiguration;
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
import squareup.cash.bankingbenefits.ui.GreenBenefitsV1;
import squareup.cash.bankingbenefits.ui.RiskStatus;

/* loaded from: classes10.dex */
public final class EarningsYearToDate extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<EarningsYearToDate> CREATOR;
    public final Integer year;

    /* loaded from: classes7.dex */
    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public Integer year;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new EarningsYearToDate(this.year, buildUnknownFields());
                case 1:
                    return new GetAllowlistLimitForDependentResponse(this.year, buildUnknownFields());
                case 2:
                    return new Spacer(this.year, buildUnknownFields());
                case 3:
                    return new InAppBrowserMetadata.IABMetadataAfterpay(this.year, buildUnknownFields());
                case 4:
                    return new Automation.AllocationStrategy.RoundUp(this.year, buildUnknownFields());
                case 5:
                    return new StatementCoverage.Annual(this.year, buildUnknownFields());
                case 6:
                    return new InvestingAutomationExecutionRenderData.PaycheckAllocationMetadata(this.year, buildUnknownFields());
                case 7:
                    return new NotificationsSettingsPerformanceConfiguration(this.year, buildUnknownFields());
                case 8:
                    return new GreenBenefitsV1.Benefit.SavingsBenefit(this.year, buildUnknownFields());
                case 9:
                    return new GreenBenefitsV1.Benefit.WeeklyOffersBenefit(this.year, buildUnknownFields());
                default:
                    return new RiskStatus(this.year, buildUnknownFields());
            }
        }
    }

    static {
        EarningsYearToDate$Companion$ADAPTER$1 earningsYearToDate$Companion$ADAPTER$1 = new EarningsYearToDate$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(EarningsYearToDate.class), "type.googleapis.com/squareup.cash.earnings.EarningsYearToDate", Syntax.PROTO_2, null, "squareup/cash/earnings/earnings_common.proto");
        ADAPTER = earningsYearToDate$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(earningsYearToDate$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EarningsYearToDate(Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.year = num;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EarningsYearToDate)) {
            return false;
        }
        EarningsYearToDate earningsYearToDate = (EarningsYearToDate) obj;
        return Intrinsics.areEqual(unknownFields(), earningsYearToDate.unknownFields()) && Intrinsics.areEqual(this.year, earningsYearToDate.year);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Integer num = this.year;
        int hashCode2 = hashCode + (num != null ? Integer.hashCode(num.intValue()) : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.year = this.year;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Integer num = this.year;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("year=", num, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "EarningsYearToDate{", "}", 0, null, null, 56);
    }

    public /* synthetic */ EarningsYearToDate(Integer num) {
        this(num, ByteString.EMPTY);
    }
}
