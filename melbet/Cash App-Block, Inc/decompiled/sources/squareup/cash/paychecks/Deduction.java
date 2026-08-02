package squareup.cash.paychecks;

import android.os.Parcelable;
import com.datadog.android.rum.model.ViewEvent;
import com.google.android.gms.internal.mlkit_vision_face.zzko;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.scheduledreloader.resources.v1.ScheduledReloadPreference;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.common.Money;
import com.squareup.protos.common.time.DateTime;
import com.squareup.protos.employeejobs.Job;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.protos.franklin.common.SyncEntity;
import com.squareup.protos.timecards.AutomaticClockoutDetails;
import com.squareup.protos.timecards.CalculationTotal;
import com.squareup.protos.timecards.EmployeeJobInfo;
import com.squareup.protos.timecards.EmployeeRole;
import com.squareup.protos.timecards.GetClockinEssentialsResponse;
import com.squareup.protos.timecards.GetShiftsOverviewRequest;
import com.squareup.protos.timecards.LaborCostTotal;
import com.squareup.protos.timecards.OvertimeReportByTimecardForEmployeeResponse;
import com.squareup.protos.timecards.StartTimecardResponse;
import com.squareup.protos.timecards.StopTimecardResponse;
import com.squareup.protos.timecards.Timecard;
import com.squareup.protos.timecards.TimecardBreak;
import com.squareup.protos.timecards.scheduling.Shift;
import com.squareup.protos.timecards.scheduling.ShiftSchedule;
import com.squareup.protos.wire.roster.mds.ContactMethod;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.io.Serializable;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;
import squareup.cash.analytics.CdfEvent;
import squareup.cash.bills.BillsApplet;
import squareup.cash.earnings.EarningStreamsData;
import squareup.cash.earnings.EarningsTimeFrame;
import squareup.cash.earnings.EarningsYearMonth;
import squareup.cash.overdraft.OverdraftStatus;
import squareup.cash.paychecks.BenefitsDetails;
import squareup.cash.paychecks.PaychecksHomeUi;
import squareup.cash.paychecks.RealizedAllocationAmount;
import squareup.cash.savings.ArcadeElement;
import squareup.cash.savings.SavingsHome;
import squareup.cash.savings.action.ClientRouteTemplate;
import squareup.cash.savings.action.SavingsAction;
import squareup.cash.savings.bespoke_elements.Card;
import squareup.cash.savings.bespoke_elements.FolderList;
import squareup.cash.savings.bespoke_elements.NoGoalHeader;
import squareup.cash.scheduledreloader.api.external.v1.ExternalCreateOrUpdateScheduledReloadPreferenceResponse;
import squareup.cash.scheduledreloader.api.external.v1.ExternalSkipNextReloadResponse;
import squareup.cash.ui.arcade.elements.ButtonCompact;
import squareup.cash.ui.arcade.elements.ButtonDefault;
import squareup.cash.ui.arcade.elements.ButtonDefaultGroup;
import squareup.cash.ui.arcade.elements.ButtonProminence;
import squareup.cash.ui.arcade.elements.CellDefault;
import squareup.cash.ui.arcade.elements.HeroNumericsHeader;
import squareup.cash.wires.WiresAccountInfo;
import xyz.block.protos.genie.Navigate;

/* loaded from: classes10.dex */
public final class Deduction extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Deduction> CREATOR;
    public final Money amount;
    public final LocalizedString description;
    public final LocalizedString note;
    public final Color tint_color;

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public Object amount;
        public Object description;
        public Serializable note;
        public Object tint_color;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new Deduction((Money) this.amount, (LocalizedString) this.description, (LocalizedString) this.note, (Color) this.tint_color, buildUnknownFields());
                case 1:
                    return new EmployeeRole((String) this.amount, (String) this.description, (Boolean) this.note, (Boolean) this.tint_color, buildUnknownFields());
                case 2:
                    return new GetClockinEssentialsResponse((Shift) this.amount, (ShiftSchedule) this.description, (AutomaticClockoutDetails) this.note, (Job) this.tint_color, buildUnknownFields());
                case 3:
                    return new GetShiftsOverviewRequest((ViewEvent.Companion) this.amount, (String) this.description, (String) this.note, (GetShiftsOverviewRequest.APIVersion) this.tint_color, buildUnknownFields());
                case 4:
                    return new OvertimeReportByTimecardForEmployeeResponse.BySalary((CalculationTotal) this.amount, (Boolean) this.description, (LaborCostTotal) this.note, (EmployeeJobInfo) this.tint_color, buildUnknownFields());
                case 5:
                    return new StartTimecardResponse((Timecard) this.amount, (TimecardBreak) this.description, (Boolean) this.note, (List) this.tint_color, buildUnknownFields());
                case 6:
                    return new StopTimecardResponse((Timecard) this.amount, (TimecardBreak) this.description, (Boolean) this.note, (StopTimecardResponse.WorkdayShiftSummary) this.tint_color, buildUnknownFields());
                case 7:
                    return new StopTimecardResponse.WorkdayShiftSummary.JobSummary((EmployeeJobInfo) this.amount, (DateTime) this.description, (DateTime) this.note, (Long) this.tint_color, buildUnknownFields());
                case 8:
                    return new ContactMethod((zzko) this.amount, (ContactMethod.VerificationStatus) this.description, (Long) this.note, (List) this.tint_color, buildUnknownFields());
                case 9:
                    return new BillsApplet.BillsAppletAction.OpenDialog((LocalizedString) this.description, (LocalizedString) this.note, (BillsApplet.BillsAppletAction.Button) this.amount, (BillsApplet.BillsAppletAction.Button) this.tint_color, buildUnknownFields());
                case 10:
                    return new BillsApplet.FullAppletLine((Image) this.amount, (LocalizedString) this.description, (Color) this.tint_color, (LocalizedString) this.note, buildUnknownFields());
                case 11:
                    return new EarningStreamsData((List) this.description, (Money) this.amount, (EarningsTimeFrame) this.note, (EarningsYearMonth) this.tint_color, buildUnknownFields());
                case 12:
                    return new OverdraftStatus((LocalizedString) this.description, (OverdraftStatus.Button) this.amount, (OverdraftStatus.Button) this.note, (OverdraftStatus.State_) this.tint_color, buildUnknownFields());
                case 13:
                    return new OverdraftStatus.ToggleButton((LocalizedString) this.description, (Boolean) this.amount, (Boolean) this.note, (OverdraftStatus.Action) this.tint_color, buildUnknownFields());
                case 14:
                    return new BenefitsDetails((BenefitsDetails.MoneyTabSection) this.amount, (BenefitsDetails.InsightsSection) this.description, (BenefitsDetails.PaychecksSection) this.note, (BenefitsDetails.State) this.tint_color, buildUnknownFields());
                case 15:
                    return new BenefitsDetails.MoneyTabSection((BenefitsDetails.State) this.amount, (LocalizedString) this.description, (LocalizedString) this.note, (String) this.tint_color, buildUnknownFields());
                case 16:
                    return new PaychecksHomeUi.AddOrUpdateDirectDepositSection((String) this.amount, (LocalizedString) this.description, (String) this.note, (PaychecksHomeUi.AddOrUpdateDirectDepositSection.PendingDirectDepositInfo) this.tint_color, buildUnknownFields());
                case 17:
                    return new PaychecksHomeUi.AddOrUpdateDirectDepositSection.HalfSheet((Icon) this.amount, (LocalizedString) this.description, (LocalizedString) this.note, (LocalizedString) this.tint_color, buildUnknownFields());
                case 18:
                    return new RealizedAllocationAmount((AllocationDestination) this.note, (Money) this.amount, (RealizedAllocationAmount.State) this.tint_color, (LocalizedString) this.description, buildUnknownFields());
                case 19:
                    return new ArcadeElement.TappableCellDefault((CellDefault) this.amount, (SavingsAction) this.description, (CdfEvent) this.note, (ClientRouteTemplate) this.tint_color, buildUnknownFields());
                case 20:
                    return new SavingsHome.TransfersSection.AddCashConfig((List) this.description, (Money) this.amount, (Money) this.note, (Money) this.tint_color, buildUnknownFields());
                case 21:
                    return new FolderList.LocalizedTemplateString((LocalizedString) this.description, (LocalizedString) this.note, (LocalizedString) this.amount, (Long) this.tint_color, buildUnknownFields());
                case 22:
                    return new NoGoalHeader((HeroNumericsHeader) this.amount, (SavingsAction) this.description, (Card) this.note, (CdfEvent) this.tint_color, buildUnknownFields());
                case 23:
                    return new ExternalCreateOrUpdateScheduledReloadPreferenceResponse((ScheduledReloadPreference) this.amount, (Instant) this.description, (SyncEntity) this.note, (ResponseContext) this.tint_color, buildUnknownFields());
                case 24:
                    return new ExternalSkipNextReloadResponse((Boolean) this.amount, (Instant) this.description, (SyncEntity) this.note, (ResponseContext) this.tint_color, buildUnknownFields());
                case 25:
                    return new ButtonCompact((ButtonProminence) this.amount, (Boolean) this.note, (LocalizedString) this.description, (Icon) this.tint_color, buildUnknownFields());
                case 26:
                    return new ButtonDefaultGroup((ButtonDefault) this.amount, (ButtonDefault) this.description, (ButtonDefault) this.note, (ButtonDefaultGroup.Direction) this.tint_color, buildUnknownFields());
                case 27:
                    return new WiresAccountInfo.DeactivationDetails((String) this.amount, (String) this.description, (String) this.note, (WiresAccountInfo.Action) this.tint_color, buildUnknownFields());
                default:
                    return new Navigate.Dismiss((Navigate.Dismiss.Pop) this.amount, (Navigate.Dismiss.DismissModal) this.description, (Navigate.Dismiss.RetreatToView) this.note, (Navigate.Dismiss.Transition) this.tint_color, buildUnknownFields());
            }
        }
    }

    static {
        Deduction$Companion$ADAPTER$1 deduction$Companion$ADAPTER$1 = new Deduction$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Deduction.class), "type.googleapis.com/squareup.cash.paychecks.Deduction", Syntax.PROTO_2, null, "squareup/cash/paychecks/common.proto");
        ADAPTER = deduction$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(deduction$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Deduction(Money money, LocalizedString localizedString, LocalizedString localizedString2, Color color, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.amount = money;
        this.description = localizedString;
        this.note = localizedString2;
        this.tint_color = color;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Deduction)) {
            return false;
        }
        Deduction deduction = (Deduction) obj;
        return Intrinsics.areEqual(unknownFields(), deduction.unknownFields()) && Intrinsics.areEqual(this.amount, deduction.amount) && Intrinsics.areEqual(this.description, deduction.description) && Intrinsics.areEqual(this.note, deduction.note) && Intrinsics.areEqual(this.tint_color, deduction.tint_color);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Money money = this.amount;
        int hashCode2 = (hashCode + (money != null ? money.hashCode() : 0)) * 37;
        LocalizedString localizedString = this.description;
        int hashCode3 = (hashCode2 + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
        LocalizedString localizedString2 = this.note;
        int hashCode4 = (hashCode3 + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37;
        Color color = this.tint_color;
        int hashCode5 = hashCode4 + (color != null ? color.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.amount = this.amount;
        builder.description = this.description;
        builder.note = this.note;
        builder.tint_color = this.tint_color;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Money money = this.amount;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("amount=", money, arrayList);
        }
        LocalizedString localizedString = this.description;
        if (localizedString != null) {
            Matcher$$ExternalSyntheticOutline0.m("description=", localizedString, arrayList);
        }
        LocalizedString localizedString2 = this.note;
        if (localizedString2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("note=", localizedString2, arrayList);
        }
        Color color = this.tint_color;
        if (color != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("tint_color=", color, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Deduction{", "}", 0, null, null, 56);
    }
}
