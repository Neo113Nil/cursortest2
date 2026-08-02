package xyz.block.protos.genie;

import androidx.room.TransactorKt;
import com.google.android.gms.internal.mlkit_vision_face.zzjk;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.localization.LocalizableString;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.cash.ui.SplitButtons;
import com.squareup.protos.common.Money;
import com.squareup.protos.common.location.GlobalAddress;
import com.squareup.protos.lending.sync_values.BorrowData;
import com.squareup.protos.lending.sync_values.BorrowLimitHubData;
import com.squareup.protos.lending.sync_values.BorrowLimitHubData$IncreaseLimitActionsSection$CTABullet$Action$ClientRoute;
import com.squareup.protos.lending.sync_values.LendingInfo;
import com.squareup.protos.timecards.CalculationTotal;
import com.squareup.protos.timecards.Employee;
import com.squareup.protos.timecards.EmployeeJobInfo;
import com.squareup.protos.timecards.EmployeeRole;
import com.squareup.protos.timecards.StartTimecardBreakResponse;
import com.squareup.protos.timecards.Timecard;
import com.squareup.protos.timecards.TimecardBreak;
import com.squareup.protos.timecards.TimecardEditRequest;
import com.squareup.protos.timecards.TimecardEvent;
import com.squareup.protos.timecards.scheduling.Shift;
import com.squareup.protos.timecards.scheduling.ShiftSchedule;
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
import squareup.cash.analytics.CdfEvent;
import squareup.cash.earnings.EarningCardSection;
import squareup.cash.earnings.EarningStreamsData;
import squareup.cash.earnings.EarningsAppletState;
import squareup.cash.earnings.EarningsAppletUIState;
import squareup.cash.earnings.EarningsChartData;
import squareup.cash.earnings.EarningsHomeUIState;
import squareup.cash.earnings.EarningsTimeFrame;
import squareup.cash.paychecks.BenefitsDetails;
import squareup.cash.paychecks.BenefitsStatusSection;
import squareup.cash.paychecks.DistributionSummaryUi;
import squareup.cash.paychecks.Employer;
import squareup.cash.paychecks.PaychecksHomeUi;
import squareup.cash.paychecks.PaychecksHomeUi$Header$NullStateUpsell$DetailRow$Action_$ClientRoute;
import squareup.cash.paychecks.TreehouseAppletBrief;
import squareup.cash.paychecks.UiConfiguration;
import squareup.cash.phoneplans.syncvalues.PhonePlanAppletV1;
import squareup.cash.savings.SavingsApplet;
import squareup.cash.savings.SavingsCustomerActiveState;
import squareup.cash.savings.SavingsHome;
import squareup.cash.savings.action.SavingsAction;
import squareup.cash.savings.bespoke_elements.CardImage;
import squareup.cash.savings.bespoke_elements.CompactCard;
import squareup.cash.savings.bespoke_elements.TransferButtons;
import squareup.cash.ui.arcade.elements.ButtonCompact;
import squareup.cash.ui.arcade.elements.HorizontalAlignment;
import squareup.cash.ui.arcade.elements.InlineMessage;
import squareup.cash.ui.arcade.elements.RemoteImage;
import squareup.cash.wires.WiresAccountInfo;
import xyz.block.protos.genie.CollectionMutation;

/* loaded from: classes10.dex */
public final class Binding extends Message {
    public static final ProtoAdapter ADAPTER = new Binding$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Binding.class), "type.googleapis.com/xyz.block.genie.v1.Binding", Syntax.PROTO_2, null, "xyz/block/genie/v1/binding.proto");
    public final Expression get_transform;
    public final KeyPath key_path;
    public final Action on_invalid;
    public final Expression set_transform;
    public final Expression validation;

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public Object get_transform;
        public Object key_path;
        public Object on_invalid;
        public Object set_transform;
        public Object validation;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    KeyPath keyPath = (KeyPath) this.key_path;
                    if (keyPath != null) {
                        return new Binding(keyPath, (Expression) this.get_transform, (Expression) this.set_transform, (Expression) this.validation, (Action) this.on_invalid, buildUnknownFields());
                    }
                    TransactorKt.missingRequiredFields(keyPath, "key_path");
                    throw null;
                case 1:
                    return new BorrowData.AppletData.EntryPointData.TileEntryPoint.Row((BorrowData.AppletData.EntryPointData.TileEntryPoint.Row.Icon) this.key_path, (Color) this.get_transform, (Color) this.set_transform, (zzjk) this.validation, (BorrowData.AppletData.EntryPointData.TileEntryPoint.Row.DetailText) this.on_invalid, buildUnknownFields());
                case 2:
                    return new BorrowLimitHubData.IncreaseLimitActionsSection.CTABullet((LocalizedString) this.key_path, (LocalizedString) this.get_transform, (Icon) this.set_transform, (LocalizedString) this.validation, (BorrowLimitHubData$IncreaseLimitActionsSection$CTABullet$Action$ClientRoute) this.on_invalid, buildUnknownFields());
                case 3:
                    return new LendingInfo.AccessData.Button((String) this.key_path, (LendingInfo.AccessData.Button.Icon) this.get_transform, (Boolean) this.set_transform, (String) this.validation, (LocalizableString) this.on_invalid, buildUnknownFields());
                case 4:
                    return new LendingInfo.AccessData.DetailRow((LendingInfo.AccessData.DetailRow.Icon) this.key_path, (String) this.get_transform, (String) this.set_transform, (LocalizableString) this.validation, (LocalizableString) this.on_invalid, buildUnknownFields());
                case 5:
                    return new CalculationTotal((Integer) this.key_path, (Integer) this.get_transform, (Integer) this.set_transform, (List) this.validation, (Integer) this.on_invalid, buildUnknownFields());
                case 6:
                    return new Employee((String) this.key_path, (String) this.get_transform, (String) this.set_transform, (EmployeeRole) this.validation, (String) this.on_invalid, buildUnknownFields());
                case 7:
                    return new EmployeeJobInfo((String) this.key_path, (String) this.get_transform, (Money) this.set_transform, (Boolean) this.validation, (Integer) this.on_invalid, buildUnknownFields());
                case 8:
                    return new StartTimecardBreakResponse((Timecard) this.key_path, (TimecardBreak) this.get_transform, (List) this.set_transform, (Boolean) this.validation, (Boolean) this.on_invalid, buildUnknownFields());
                case 9:
                    return new TimecardEditRequest.TimecardBreakEditRequest((String) this.key_path, (String) this.get_transform, (TimecardEditRequest.TimecardBreakEditRequest.ProposedBreakDefinition) this.set_transform, (String) this.validation, (String) this.on_invalid, buildUnknownFields());
                case 10:
                    return new TimecardEvent((String) this.key_path, (String) this.get_transform, (String) this.set_transform, (TimecardEvent.EventType) this.validation, (Timecard) this.on_invalid, buildUnknownFields());
                case 11:
                    return new Shift((String) this.key_path, (ShiftSchedule) this.get_transform, (Timecard) this.set_transform, (List) this.validation, (Shift.Traits) this.on_invalid, buildUnknownFields());
                case 12:
                    return new EarningCardSection((Image) this.key_path, (LocalizedString) this.get_transform, (LocalizedString) this.set_transform, (String) this.validation, (LocalizedString) this.on_invalid, buildUnknownFields());
                case 13:
                    return new EarningsAppletUIState((EarningsAppletState) this.key_path, (LocalizedString) this.get_transform, (LocalizedString) this.set_transform, (String) this.validation, (List) this.on_invalid, buildUnknownFields());
                case 14:
                    return new EarningsHomeUIState((EarningStreamsData) this.key_path, (EarningsTimeFrame) this.get_transform, (EarningsHomeUIState.EarningsHomeConfiguration) this.set_transform, (EarningsChartData) this.validation, (Boolean) this.on_invalid, buildUnknownFields());
                case 15:
                    return new BenefitsDetails.InsightsSection((BenefitsDetails.ColoredText) this.key_path, (LocalizedString) this.get_transform, (BenefitsDetails.Button) this.set_transform, (List) this.validation, (LocalizedString) this.on_invalid, buildUnknownFields());
                case 16:
                    return new BenefitsStatusSection((BenefitsStatusSection.ColoredText) this.key_path, (LocalizedString) this.get_transform, (BenefitsStatusSection.State) this.set_transform, (BenefitsStatusSection.Button) this.validation, (BenefitsStatusSection.Button) this.on_invalid, buildUnknownFields());
                case 17:
                    return new PaychecksHomeUi((List) this.key_path, (PaychecksHomeUi.Header) this.get_transform, (PaychecksHomeUi.TermsOfService) this.set_transform, (String) this.validation, (PaychecksHomeUi.TermsOfService) this.on_invalid, buildUnknownFields());
                case 18:
                    return new PaychecksHomeUi.Header.NullStateUpsell.DetailRow((LocalizedString) this.key_path, (LocalizedString) this.get_transform, (LocalizedString) this.set_transform, (Boolean) this.validation, (PaychecksHomeUi$Header$NullStateUpsell$DetailRow$Action_$ClientRoute) this.on_invalid, buildUnknownFields());
                case 19:
                    return new TreehouseAppletBrief((Long) this.key_path, (LocalizedString) this.get_transform, (LocalizedString) this.set_transform, (Employer) this.validation, (Employer) this.on_invalid, buildUnknownFields());
                case 20:
                    return new UiConfiguration((List) this.key_path, (PaychecksHomeUi) this.get_transform, (DistributionSummaryUi) this.set_transform, (UiConfiguration.ReceiptUi) this.validation, (List) this.on_invalid, buildUnknownFields());
                case 21:
                    return new PhonePlanAppletV1((LocalizedString) this.key_path, (LocalizedString) this.get_transform, (PhonePlanAppletV1.State) this.set_transform, (String) this.validation, (LocalizedString) this.on_invalid, buildUnknownFields());
                case 22:
                    return new SavingsApplet((Boolean) this.key_path, (SavingsCustomerActiveState) this.get_transform, (SavingsAction) this.set_transform, (LocalizedString) this.validation, (LocalizedString) this.on_invalid, buildUnknownFields());
                case 23:
                    return new SavingsHome.TransfersSection((SplitButtons) this.key_path, (SavingsHome.TransfersSection.AddCashConfig) this.get_transform, (SavingsHome.TransfersSection.AlternativeButtonBehavior) this.set_transform, (SavingsHome.TransfersSection.AlternativeButtonBehavior) this.validation, (SavingsHome.TransfersSection.TransferOutConfig) this.on_invalid, buildUnknownFields());
                case 24:
                    return new CompactCard((CardImage) this.key_path, (LocalizedString) this.get_transform, (ButtonCompact) this.set_transform, (String) this.validation, (CdfEvent) this.on_invalid, buildUnknownFields());
                case 25:
                    return new TransferButtons.TransferInConfig((CdfEvent) this.key_path, (List) this.get_transform, (Money) this.set_transform, (Money) this.validation, (Money) this.on_invalid, buildUnknownFields());
                case 26:
                    return new InlineMessage((Image) this.key_path, (LocalizedString) this.get_transform, (LocalizedString) this.set_transform, (LocalizedString) this.validation, (LocalizedString) this.on_invalid, buildUnknownFields());
                case 27:
                    return new RemoteImage((Integer) this.key_path, (Integer) this.get_transform, (Image) this.set_transform, (HorizontalAlignment) this.validation, (String) this.on_invalid, buildUnknownFields());
                case 28:
                    return new WiresAccountInfo.EligibilityDetails((String) this.key_path, (String) this.get_transform, (String) this.set_transform, (GlobalAddress) this.validation, (WiresAccountInfo.Action) this.on_invalid, buildUnknownFields());
                default:
                    KeyPath keyPath2 = (KeyPath) this.key_path;
                    if (keyPath2 != null) {
                        return new CollectionMutation(keyPath2, (CollectionMutation.AppendItem) this.get_transform, (CollectionMutation.RemoveItems) this.set_transform, (CollectionMutation.RemoveAll) this.validation, (CollectionMutation.UpdateItem) this.on_invalid, buildUnknownFields());
                    }
                    TransactorKt.missingRequiredFields(keyPath2, "target");
                    throw null;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Binding(KeyPath keyPath, Expression expression, Expression expression2, Expression expression3, Action action, ByteString byteString) {
        super(ADAPTER, byteString);
        keyPath.getClass();
        byteString.getClass();
        this.key_path = keyPath;
        this.get_transform = expression;
        this.set_transform = expression2;
        this.validation = expression3;
        this.on_invalid = action;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Binding)) {
            return false;
        }
        Binding binding = (Binding) obj;
        return Intrinsics.areEqual(unknownFields(), binding.unknownFields()) && Intrinsics.areEqual(this.key_path, binding.key_path) && Intrinsics.areEqual(this.get_transform, binding.get_transform) && Intrinsics.areEqual(this.set_transform, binding.set_transform) && Intrinsics.areEqual(this.validation, binding.validation) && Intrinsics.areEqual(this.on_invalid, binding.on_invalid);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = (this.key_path.hashCode() + (unknownFields().hashCode() * 37)) * 37;
        Expression expression = this.get_transform;
        int hashCode2 = (hashCode + (expression != null ? expression.hashCode() : 0)) * 37;
        Expression expression2 = this.set_transform;
        int hashCode3 = (hashCode2 + (expression2 != null ? expression2.hashCode() : 0)) * 37;
        Expression expression3 = this.validation;
        int hashCode4 = (hashCode3 + (expression3 != null ? expression3.hashCode() : 0)) * 37;
        Action action = this.on_invalid;
        int hashCode5 = hashCode4 + (action != null ? action.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.key_path = this.key_path;
        builder.get_transform = this.get_transform;
        builder.set_transform = this.set_transform;
        builder.validation = this.validation;
        builder.on_invalid = this.on_invalid;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("key_path=" + this.key_path);
        Expression expression = this.get_transform;
        if (expression != null) {
            Matcher$$ExternalSyntheticOutline0.m("get_transform=", expression, arrayList);
        }
        Expression expression2 = this.set_transform;
        if (expression2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("set_transform=", expression2, arrayList);
        }
        Expression expression3 = this.validation;
        if (expression3 != null) {
            Matcher$$ExternalSyntheticOutline0.m("validation=", expression3, arrayList);
        }
        Action action = this.on_invalid;
        if (action != null) {
            arrayList.add("on_invalid=" + action);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Binding{", "}", 0, null, null, 56);
    }
}
