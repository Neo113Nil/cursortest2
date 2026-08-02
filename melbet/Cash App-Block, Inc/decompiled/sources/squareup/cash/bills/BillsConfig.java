package squareup.cash.bills;

import android.os.Parcelable;
import androidx.camera.camera2.pipe.CameraGraph$OperatingMode;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.advertising.views.FullscreenAdViewKt;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.cash.money.viewmodels.api.Section;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.scheduledreloader.resources.v1.ScheduledReloadPreference;
import com.squareup.protos.common.Money;
import com.squareup.protos.common.location.GlobalAddress;
import com.squareup.protos.franklin.api.DirectDepositBlockerBenefitsIcon;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.protos.payrollconnector.common.PayrollProviderUiSpecification;
import com.squareup.protos.timecards.Timecard;
import com.squareup.protos.timecards.TimecardAndBreaks;
import com.squareup.protos.timecards.scheduling.Shift;
import com.squareup.protos.wire.roster.mds.Name;
import com.squareup.protos.wire.roster.mds.Names;
import com.squareup.protos.wire.roster.mds.ScriptAddress;
import com.squareup.protos.wire.roster.mds.ScriptScope$Script;
import com.squareup.stafftasks.resources.TargetEntity;
import com.squareup.stafftasks.resources.TargetEntityType;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;
import squareup.cash.analytics.CdfEvent;
import squareup.cash.bankingbenefits.api.v1_0.app.GetBankingBenefitsForComparisonBookletResponse;
import squareup.cash.bankingbenefits.ui.GreenBenefitsV1;
import squareup.cash.bills.BillsApplet;
import squareup.cash.earnings.EarnerModeStatus;
import squareup.cash.earnings.EarningsChartData;
import squareup.cash.earnings.EarningsTimeFrame;
import squareup.cash.overdraft.OverdraftStatus;
import squareup.cash.paychecks.AllocationDestination;
import squareup.cash.paychecks.BenefitsStatusSection;
import squareup.cash.paychecks.BenefitsStatusSection$Button$Action_$ClientRoute;
import squareup.cash.paychecks.DistributionSummaryUi;
import squareup.cash.paychecks.Employer;
import squareup.cash.paychecks.Paycheck;
import squareup.cash.paychecks.PaychecksHomeUi;
import squareup.cash.paychecks.PaychecksHomeUi$Header$ViewBenefitsButton$Action_$ClientRoute;
import squareup.cash.paychecks.UiConfiguration;
import squareup.cash.savings.SavingsConfig;
import squareup.cash.savings.SavingsExternalReference;
import squareup.cash.savings.SavingsExternalReferenceIdentifier;
import squareup.cash.savings.SavingsHome;
import squareup.cash.savings.action.Button;
import squareup.cash.savings.action.Icon;
import squareup.cash.savings.action.SavingsAction;
import squareup.cash.scheduledreloader.api.external.v1.ExternalCreateOrUpdateScheduledReloadPreferenceRequest;
import squareup.cash.scheduledreloader.api.external.v1.ExternalGetLatestScheduledReloadPreferenceRequest;
import squareup.cash.ui.arcade.elements.ArcadeComponent;
import xyz.block.protos.genie.OpenURL;

/* loaded from: classes10.dex */
public final class BillsConfig extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<BillsConfig> CREATOR;
    public final ClientRoute bills_applet_default_action;
    public final HalfApplet half_applet_content;

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public Object bills_applet_default_action;
        public Object half_applet_content;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new BillsConfig((ClientRoute) this.bills_applet_default_action, (HalfApplet) this.half_applet_content, buildUnknownFields());
                case 1:
                    return new TimecardAndBreaks((Timecard) this.bills_applet_default_action, (List) this.half_applet_content, buildUnknownFields());
                case 2:
                    return new Shift.Traits((Shift.Traits.Status) this.bills_applet_default_action, (Boolean) this.half_applet_content, buildUnknownFields());
                case 3:
                    return new Name((ScriptScope$Script) this.bills_applet_default_action, (String) this.half_applet_content, buildUnknownFields());
                case 4:
                    return new Names((Name) this.bills_applet_default_action, (List) this.half_applet_content, buildUnknownFields());
                case 5:
                    return new ScriptAddress((GlobalAddress) this.bills_applet_default_action, (ScriptScope$Script) this.half_applet_content, buildUnknownFields());
                case 6:
                    return new TargetEntity((String) this.bills_applet_default_action, (TargetEntityType) this.half_applet_content, buildUnknownFields());
                case 7:
                    return new GetBankingBenefitsForComparisonBookletResponse.BenefitForComparisonBooklet((String) this.bills_applet_default_action, (FullscreenAdViewKt) this.half_applet_content, buildUnknownFields());
                case 8:
                    return new GetBankingBenefitsForComparisonBookletResponse.BenefitForComparisonBooklet.SavingsYield((Float) this.bills_applet_default_action, (Float) this.half_applet_content, buildUnknownFields());
                case 9:
                    return new GreenBenefitsV1.Benefit.BorrowBenefit((Money) this.bills_applet_default_action, (Boolean) this.half_applet_content, buildUnknownFields());
                case 10:
                    return new BillsApplet.BillsAppletAction.Button((LocalizedString) this.bills_applet_default_action, (BillsApplet.BillsAppletAction.ClientRoute) this.half_applet_content, buildUnknownFields());
                case 11:
                    return new EarnerModeStatus((EarnerModeStatus.Status) this.bills_applet_default_action, (Instant) this.half_applet_content, buildUnknownFields());
                case 12:
                    return new EarningsChartData((EarningsTimeFrame) this.bills_applet_default_action, (List) this.half_applet_content, buildUnknownFields());
                case 13:
                    return new OverdraftStatus.Eligible((LocalizedString) this.bills_applet_default_action, (OverdraftStatus.ToggleButton) this.half_applet_content, buildUnknownFields());
                case 14:
                    return new BenefitsStatusSection.Button((LocalizedString) this.bills_applet_default_action, (BenefitsStatusSection$Button$Action_$ClientRoute) this.half_applet_content, buildUnknownFields());
                case 15:
                    return new DistributionSummaryUi.DestinationUiConfiguration((AllocationDestination) this.bills_applet_default_action, (DistributionSummaryUi.DestinationUiConfiguration.UiConfiguration) this.half_applet_content, buildUnknownFields());
                case 16:
                    return new DistributionSummaryUi.DestinationUiConfiguration.UiConfiguration((Boolean) this.bills_applet_default_action, (LocalizedString) this.half_applet_content, buildUnknownFields());
                case 17:
                    return new Employer((String) this.bills_applet_default_action, (PayrollProviderUiSpecification) this.half_applet_content, buildUnknownFields());
                case 18:
                    return new Paycheck.SettlementDate((Paycheck.SettlementDate.Type) this.bills_applet_default_action, (Long) this.half_applet_content, buildUnknownFields());
                case 19:
                    return new PaychecksHomeUi.Header((PaychecksHomeUi.Header.NullStateUpsell) this.bills_applet_default_action, (PaychecksHomeUi.Header.ViewBenefitsButton) this.half_applet_content, buildUnknownFields());
                case 20:
                    return new PaychecksHomeUi.Header.ViewBenefitsButton((LocalizedString) this.bills_applet_default_action, (PaychecksHomeUi$Header$ViewBenefitsButton$Action_$ClientRoute) this.half_applet_content, buildUnknownFields());
                case 21:
                    return new UiConfiguration.DestinationUiConfiguration((AllocationDestination) this.bills_applet_default_action, (UiConfiguration.DestinationUiConfiguration.DestinationUiConfigurationValues) this.half_applet_content, buildUnknownFields());
                case 22:
                    return new SavingsConfig.DirectDepositSavingsBenefit((LocalizedString) this.bills_applet_default_action, (DirectDepositBlockerBenefitsIcon) this.half_applet_content, buildUnknownFields());
                case 23:
                    return new SavingsExternalReferenceIdentifier((SavingsExternalReference) this.bills_applet_default_action, (Section.Header) this.half_applet_content, buildUnknownFields());
                case 24:
                    return new SavingsHome.Footer((Icon) this.bills_applet_default_action, (LocalizedString) this.half_applet_content, buildUnknownFields());
                case 25:
                    return new SavingsHome.Header((Button) this.bills_applet_default_action, (Button) this.half_applet_content, buildUnknownFields());
                case 26:
                    return new SavingsAction((SavingsAction.Action) this.bills_applet_default_action, (CdfEvent) this.half_applet_content, buildUnknownFields());
                case 27:
                    return new ExternalCreateOrUpdateScheduledReloadPreferenceRequest((ScheduledReloadPreference) this.bills_applet_default_action, (RequestContext) this.half_applet_content, buildUnknownFields());
                case 28:
                    return new ExternalGetLatestScheduledReloadPreferenceRequest((ScheduledReloadPreference.Type) this.bills_applet_default_action, (String) this.half_applet_content, buildUnknownFields());
                default:
                    return new ArcadeComponent((Integer) this.bills_applet_default_action, (CameraGraph$OperatingMode) this.half_applet_content, buildUnknownFields());
            }
        }
    }

    public final class ClientRoute extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<ClientRoute> CREATOR;
        public final String route_url;

        static {
            BillsConfig$ClientRoute$Companion$ADAPTER$1 billsConfig$ClientRoute$Companion$ADAPTER$1 = new BillsConfig$ClientRoute$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ClientRoute.class), "type.googleapis.com/squareup.cash.bills.BillsConfig.ClientRoute", Syntax.PROTO_2, null, "squareup/cash/bills/Bills.proto");
            ADAPTER = billsConfig$ClientRoute$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(billsConfig$ClientRoute$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ClientRoute(String str, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.route_url = str;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ClientRoute)) {
                return false;
            }
            ClientRoute clientRoute = (ClientRoute) obj;
            return Intrinsics.areEqual(unknownFields(), clientRoute.unknownFields()) && Intrinsics.areEqual(this.route_url, clientRoute.route_url);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.route_url;
            int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            OpenURL.Builder builder = new OpenURL.Builder(4);
            builder.url = this.route_url;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.route_url;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "route_url=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "ClientRoute{", "}", 0, null, null, 56);
        }
    }

    public final class HalfApplet extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<HalfApplet> CREATOR;
        public final LocalizedString description;
        public final LocalizedString title;

        static {
            BillsConfig$HalfApplet$Companion$ADAPTER$1 billsConfig$HalfApplet$Companion$ADAPTER$1 = new BillsConfig$HalfApplet$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(HalfApplet.class), "type.googleapis.com/squareup.cash.bills.BillsConfig.HalfApplet", Syntax.PROTO_2, null, "squareup/cash/bills/Bills.proto");
            ADAPTER = billsConfig$HalfApplet$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(billsConfig$HalfApplet$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HalfApplet(LocalizedString localizedString, LocalizedString localizedString2, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.title = localizedString;
            this.description = localizedString2;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof HalfApplet)) {
                return false;
            }
            HalfApplet halfApplet = (HalfApplet) obj;
            return Intrinsics.areEqual(unknownFields(), halfApplet.unknownFields()) && Intrinsics.areEqual(this.title, halfApplet.title) && Intrinsics.areEqual(this.description, halfApplet.description);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            LocalizedString localizedString = this.title;
            int hashCode2 = (hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
            LocalizedString localizedString2 = this.description;
            int hashCode3 = hashCode2 + (localizedString2 != null ? localizedString2.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            BillsApplet.HalfApplet.Builder builder = new BillsApplet.HalfApplet.Builder(6);
            builder.title = this.title;
            builder.description = this.description;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            LocalizedString localizedString = this.title;
            if (localizedString != null) {
                Matcher$$ExternalSyntheticOutline0.m("title=", localizedString, arrayList);
            }
            LocalizedString localizedString2 = this.description;
            if (localizedString2 != null) {
                Matcher$$ExternalSyntheticOutline0.m("description=", localizedString2, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "HalfApplet{", "}", 0, null, null, 56);
        }
    }

    static {
        BillsConfig$Companion$ADAPTER$1 billsConfig$Companion$ADAPTER$1 = new BillsConfig$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(BillsConfig.class), "type.googleapis.com/squareup.cash.bills.BillsConfig", Syntax.PROTO_2, null, "squareup/cash/bills/Bills.proto");
        ADAPTER = billsConfig$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(billsConfig$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BillsConfig(ClientRoute clientRoute, HalfApplet halfApplet, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.bills_applet_default_action = clientRoute;
        this.half_applet_content = halfApplet;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BillsConfig)) {
            return false;
        }
        BillsConfig billsConfig = (BillsConfig) obj;
        return Intrinsics.areEqual(unknownFields(), billsConfig.unknownFields()) && Intrinsics.areEqual(this.bills_applet_default_action, billsConfig.bills_applet_default_action) && Intrinsics.areEqual(this.half_applet_content, billsConfig.half_applet_content);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ClientRoute clientRoute = this.bills_applet_default_action;
        int hashCode2 = (hashCode + (clientRoute != null ? clientRoute.hashCode() : 0)) * 37;
        HalfApplet halfApplet = this.half_applet_content;
        int hashCode3 = hashCode2 + (halfApplet != null ? halfApplet.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.bills_applet_default_action = this.bills_applet_default_action;
        builder.half_applet_content = this.half_applet_content;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ClientRoute clientRoute = this.bills_applet_default_action;
        if (clientRoute != null) {
            arrayList.add("bills_applet_default_action=" + clientRoute);
        }
        HalfApplet halfApplet = this.half_applet_content;
        if (halfApplet != null) {
            arrayList.add("half_applet_content=" + halfApplet);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "BillsConfig{", "}", 0, null, null, 56);
    }
}
