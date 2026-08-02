package squareup.cash.bills;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.UriValidator;
import com.squareup.cash.money.booklet.HeaderSectionKt;
import com.squareup.cash.money.loadable.LoadableStateKt;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.lending.CashCreditScoreEntryPointData;
import com.squareup.lending.CashCreditScoreHomeData;
import com.squareup.protos.cash.aegis.core.DropDownElement;
import com.squareup.protos.cash.aegis.core.DropDownSection;
import com.squareup.protos.cash.aegis.core.LinkSection;
import com.squareup.protos.cash.aegis.core.Subsection;
import com.squareup.protos.cash.blocksmith.actions.merchant_blocking.v1.CardBlockedBusinessesUIConfig;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.postcard.CardModule;
import com.squareup.protos.cash.postcard.LockDevices;
import com.squareup.protos.cash.shop.rendering.api.InfoSheet;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.cash.ui.SegmentedCircle;
import com.squareup.protos.common.Money;
import com.squareup.protos.lending.sync_values.BorrowData;
import com.squareup.protos.lending.sync_values.BorrowLimitHubData;
import com.squareup.protos.rewardly.common.RewardSlotState;
import com.squareup.protos.rewardly.ui.UiRewardProgramDetails;
import com.squareup.protos.rewardly.ui.UiRewardSelectionState;
import com.squareup.protos.rewardly.ui.UiRewardSlot;
import com.squareup.protos.rewardly.ui.UiSelectedReward;
import com.squareup.protos.roster.business_hours.BusinessHoursPeriod;
import com.squareup.protos.roster.business_hours.DayOfWeek;
import com.squareup.protos.teamapp.ui.Duration;
import com.squareup.protos.teamapp.ui.Link;
import com.squareup.protos.teamapp.ui.Number;
import com.squareup.protos.teamapp.ui.ParameterizedText;
import com.squareup.protos.teamapp.ui.ParameterizedTextParameters;
import com.squareup.protos.teamapp.ui.Row;
import com.squareup.protos.timecards.AutomaticClockoutDetails;
import com.squareup.protos.timecards.ShiftToCover;
import com.squareup.protos.timecards.StopTimecardBreakResponse;
import com.squareup.protos.timecards.StopTimecardResponse;
import com.squareup.protos.timecards.Timecard;
import com.squareup.protos.timecards.TimecardBreak;
import com.squareup.protos.timecards.scheduling.ShiftCover;
import com.squareup.protos.timecards.scheduling.ShiftSchedule;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;
import squareup.cash.analytics.CdfEvent;
import squareup.cash.bankingbenefits.ui.GreenBenefitsV1;
import squareup.cash.bills.BillsConfig;
import squareup.cash.cryptocurrency.AutoBtcWithdrawThresholdSyncValue;
import squareup.cash.cryptocurrency.BitcoinDisplayUnits;
import squareup.cash.cryptocurrency.CryptoEligibilities;
import squareup.cash.cryptocurrency.CryptocurrencyProfile;
import squareup.cash.cryptocurrency.WithdrawalSpeed;
import squareup.cash.earnings.EarningTool;
import squareup.cash.earnings.EarningToolsSection;
import squareup.cash.earnings.PaycheckDistributionTool;
import squareup.cash.investcore.trading.syncvalues.TradingState;
import squareup.cash.paychecks.BenefitsDetails;
import squareup.cash.paychecks.BenefitsDetails$Button$Action_$ClientRoute;
import squareup.cash.paychecks.CalendarMonthPaychecksAggregation;
import squareup.cash.paychecks.Deduction;
import squareup.cash.paychecks.PaychecksHomeUi;
import squareup.cash.paychecks.TimeBoundedPaychecksAggregation;
import squareup.cash.paychecks.UiConfiguration;
import squareup.cash.savings.GoalFolder;
import squareup.cash.savings.SavingsFolder;
import squareup.cash.savings.action.Button;
import squareup.cash.savings.action.Card;
import squareup.cash.savings.action.CompactCard;
import squareup.cash.savings.bespoke_elements.ActivitySection;
import squareup.cash.savings.bespoke_elements.TransferButtons;
import squareup.cash.ui.arcade.elements.SectionHeader;
import squareup.cash.wires.WiresAccountInfo;
import xyz.block.protos.genie.BinaryOp;
import xyz.block.protos.genie.Expression;
import xyz.block.protos.genie.OpenURL;

/* loaded from: classes10.dex */
public final class BillsApplet extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<BillsApplet> CREATOR;
    public final BillsAppletAction action;
    public final FullApplet full_applet;
    public final HalfApplet half_applet;

    public final class BillsAppletAction extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<BillsAppletAction> CREATOR;
        public final HeaderSectionKt action;

        public final class Button extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<Button> CREATOR;
            public final LocalizedString button_text;
            public final ClientRoute client_route;

            static {
                BillsApplet$BillsAppletAction$Button$Companion$ADAPTER$1 billsApplet$BillsAppletAction$Button$Companion$ADAPTER$1 = new BillsApplet$BillsAppletAction$Button$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Button.class), "type.googleapis.com/squareup.cash.bills.BillsApplet.BillsAppletAction.Button", Syntax.PROTO_2, null, "squareup/cash/bills/Bills.proto");
                ADAPTER = billsApplet$BillsAppletAction$Button$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(billsApplet$BillsAppletAction$Button$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Button(LocalizedString localizedString, ClientRoute clientRoute, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.button_text = localizedString;
                this.client_route = clientRoute;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Button)) {
                    return false;
                }
                Button button = (Button) obj;
                return Intrinsics.areEqual(unknownFields(), button.unknownFields()) && Intrinsics.areEqual(this.button_text, button.button_text) && Intrinsics.areEqual(this.client_route, button.client_route);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                LocalizedString localizedString = this.button_text;
                int hashCode2 = (hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
                ClientRoute clientRoute = this.client_route;
                int hashCode3 = hashCode2 + (clientRoute != null ? clientRoute.hashCode() : 0);
                this.hashCode = hashCode3;
                return hashCode3;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                BillsConfig.Builder builder = new BillsConfig.Builder(10);
                builder.bills_applet_default_action = this.button_text;
                builder.half_applet_content = this.client_route;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                LocalizedString localizedString = this.button_text;
                if (localizedString != null) {
                    Matcher$$ExternalSyntheticOutline0.m("button_text=", localizedString, arrayList);
                }
                ClientRoute clientRoute = this.client_route;
                if (clientRoute != null) {
                    arrayList.add("client_route=" + clientRoute);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "Button{", "}", 0, null, null, 56);
            }
        }

        public final class ClientRoute extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<ClientRoute> CREATOR;
            public final String route_url;

            static {
                BillsApplet$BillsAppletAction$ClientRoute$Companion$ADAPTER$1 billsApplet$BillsAppletAction$ClientRoute$Companion$ADAPTER$1 = new BillsApplet$BillsAppletAction$ClientRoute$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ClientRoute.class), "type.googleapis.com/squareup.cash.bills.BillsApplet.BillsAppletAction.ClientRoute", Syntax.PROTO_2, null, "squareup/cash/bills/Bills.proto");
                ADAPTER = billsApplet$BillsAppletAction$ClientRoute$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(billsApplet$BillsAppletAction$ClientRoute$Companion$ADAPTER$1);
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
                OpenURL.Builder builder = new OpenURL.Builder(3);
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

        public final class OpenDialog extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<OpenDialog> CREATOR;
            public final LocalizedString body;
            public final Button primary_button;
            public final Button secondary_button;
            public final LocalizedString title;

            static {
                BillsApplet$BillsAppletAction$OpenDialog$Companion$ADAPTER$1 billsApplet$BillsAppletAction$OpenDialog$Companion$ADAPTER$1 = new BillsApplet$BillsAppletAction$OpenDialog$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(OpenDialog.class), "type.googleapis.com/squareup.cash.bills.BillsApplet.BillsAppletAction.OpenDialog", Syntax.PROTO_2, null, "squareup/cash/bills/Bills.proto");
                ADAPTER = billsApplet$BillsAppletAction$OpenDialog$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(billsApplet$BillsAppletAction$OpenDialog$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OpenDialog(LocalizedString localizedString, LocalizedString localizedString2, Button button, Button button2, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.title = localizedString;
                this.body = localizedString2;
                this.primary_button = button;
                this.secondary_button = button2;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof OpenDialog)) {
                    return false;
                }
                OpenDialog openDialog = (OpenDialog) obj;
                return Intrinsics.areEqual(unknownFields(), openDialog.unknownFields()) && Intrinsics.areEqual(this.title, openDialog.title) && Intrinsics.areEqual(this.body, openDialog.body) && Intrinsics.areEqual(this.primary_button, openDialog.primary_button) && Intrinsics.areEqual(this.secondary_button, openDialog.secondary_button);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                LocalizedString localizedString = this.title;
                int hashCode2 = (hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
                LocalizedString localizedString2 = this.body;
                int hashCode3 = (hashCode2 + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37;
                Button button = this.primary_button;
                int hashCode4 = (hashCode3 + (button != null ? button.hashCode() : 0)) * 37;
                Button button2 = this.secondary_button;
                int hashCode5 = hashCode4 + (button2 != null ? button2.hashCode() : 0);
                this.hashCode = hashCode5;
                return hashCode5;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                Deduction.Builder builder = new Deduction.Builder(9);
                builder.description = this.title;
                builder.note = this.body;
                builder.amount = this.primary_button;
                builder.tint_color = this.secondary_button;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                LocalizedString localizedString = this.title;
                if (localizedString != null) {
                    Matcher$$ExternalSyntheticOutline0.m("title=", localizedString, arrayList);
                }
                LocalizedString localizedString2 = this.body;
                if (localizedString2 != null) {
                    Matcher$$ExternalSyntheticOutline0.m("body=", localizedString2, arrayList);
                }
                Button button = this.primary_button;
                if (button != null) {
                    arrayList.add("primary_button=" + button);
                }
                Button button2 = this.secondary_button;
                if (button2 != null) {
                    arrayList.add("secondary_button=" + button2);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "OpenDialog{", "}", 0, null, null, 56);
            }
        }

        static {
            BillsApplet$BillsAppletAction$Companion$ADAPTER$1 billsApplet$BillsAppletAction$Companion$ADAPTER$1 = new BillsApplet$BillsAppletAction$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(BillsAppletAction.class), "type.googleapis.com/squareup.cash.bills.BillsApplet.BillsAppletAction", Syntax.PROTO_2, null, "squareup/cash/bills/Bills.proto");
            ADAPTER = billsApplet$BillsAppletAction$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(billsApplet$BillsAppletAction$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BillsAppletAction(HeaderSectionKt headerSectionKt, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.action = headerSectionKt;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BillsAppletAction)) {
                return false;
            }
            BillsAppletAction billsAppletAction = (BillsAppletAction) obj;
            return Intrinsics.areEqual(unknownFields(), billsAppletAction.unknownFields()) && Intrinsics.areEqual(this.action, billsAppletAction.action);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            HeaderSectionKt headerSectionKt = this.action;
            int hashCode2 = hashCode + (headerSectionKt != null ? headerSectionKt.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            EarningTool.Builder builder = new EarningTool.Builder(12);
            builder.tool = this.action;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            HeaderSectionKt headerSectionKt = this.action;
            if (headerSectionKt != null) {
                arrayList.add("action=" + headerSectionKt);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "BillsAppletAction{", "}", 0, null, null, 56);
        }
    }

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public Object action;
        public Object full_applet;
        public Object half_applet;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new BillsApplet((BillsAppletAction) this.action, (FullApplet) this.full_applet, (HalfApplet) this.half_applet, buildUnknownFields());
                case 1:
                    return new UiRewardProgramDetails.DetailRow((String) this.action, (String) this.full_applet, (UriValidator) this.half_applet, buildUnknownFields());
                case 2:
                    return new UiRewardSelectionState.UnlockInProgress((String) this.action, (String) this.full_applet, (UiRewardSelectionState.UnlockInProgress.Button) this.half_applet, buildUnknownFields());
                case 3:
                    return new UiRewardSlot((String) this.action, (RewardSlotState) this.full_applet, (UiSelectedReward) this.half_applet, buildUnknownFields());
                case 4:
                    return new BusinessHoursPeriod((DayOfWeek) this.action, (String) this.full_applet, (String) this.half_applet, buildUnknownFields());
                case 5:
                    String str = (String) this.action;
                    if (str != null) {
                        return new Duration(str, (List) this.full_applet, (Integer) this.half_applet, buildUnknownFields());
                    }
                    TransactorKt.missingRequiredFields(str, "duration");
                    throw null;
                case 6:
                    Double d = (Double) this.action;
                    if (d != null) {
                        return new Number(d.doubleValue(), (Number.Format) this.full_applet, (Integer) this.half_applet, buildUnknownFields());
                    }
                    TransactorKt.missingRequiredFields(d, "amount");
                    throw null;
                case 7:
                    return new ParameterizedTextParameters((Map) this.action, (Map) this.full_applet, (Map) this.half_applet, buildUnknownFields());
                case 8:
                    return new Row((ParameterizedText) this.action, (ParameterizedText) this.full_applet, (Link) this.half_applet, buildUnknownFields());
                case 9:
                    return new AutomaticClockoutDetails((Timecard) this.action, (String) this.full_applet, (String) this.half_applet, buildUnknownFields());
                case 10:
                    return new ShiftToCover((ShiftSchedule) this.action, (String) this.full_applet, (ShiftCover) this.half_applet, buildUnknownFields());
                case 11:
                    return new StopTimecardBreakResponse((Timecard) this.action, (TimecardBreak) this.full_applet, (Boolean) this.half_applet, buildUnknownFields());
                case 12:
                    return new StopTimecardResponse.WorkdayShiftSummary((Long) this.action, (Long) this.full_applet, (List) this.half_applet, buildUnknownFields());
                case 13:
                    return new GreenBenefitsV1.Benefit.OverdraftBenefit((Money) this.action, (Boolean) this.full_applet, (LocalizedString) this.half_applet, buildUnknownFields());
                case 14:
                    return new AutoBtcWithdrawThresholdSyncValue((Long) this.action, (Long) this.full_applet, (WithdrawalSpeed) this.half_applet, buildUnknownFields());
                case 15:
                    return new CryptocurrencyProfile((CryptoEligibilities) this.action, (BitcoinDisplayUnits) this.full_applet, (Boolean) this.half_applet, buildUnknownFields());
                case 16:
                    return new PaycheckDistributionTool((LocalizedString) this.action, (String) this.half_applet, (List) this.full_applet, buildUnknownFields());
                case 17:
                    Boolean bool = (Boolean) this.action;
                    if (bool != null) {
                        return new TradingState(bool.booleanValue(), (TradingState.DividendSetting) this.full_applet, (Instant) this.half_applet, buildUnknownFields());
                    }
                    TransactorKt.missingRequiredFields(bool, "has_active_brokerage_account");
                    throw null;
                case 18:
                    return new BenefitsDetails.Button((LocalizedString) this.action, (BenefitsDetails$Button$Action_$ClientRoute) this.full_applet, (Color) this.half_applet, buildUnknownFields());
                case 19:
                    return new BenefitsDetails.PaychecksSection((BenefitsDetails.ColoredText) this.action, (LocalizedString) this.full_applet, (BenefitsDetails.Button) this.half_applet, buildUnknownFields());
                case 20:
                    return new CalendarMonthPaychecksAggregation((Long) this.action, (Long) this.full_applet, (TimeBoundedPaychecksAggregation) this.half_applet, buildUnknownFields());
                case 21:
                    return new PaychecksHomeUi.AddOrUpdateDirectDepositSection.PendingDirectDepositInfo((LocalizedString) this.action, (LocalizedString) this.full_applet, (PaychecksHomeUi.AddOrUpdateDirectDepositSection.HalfSheet) this.half_applet, buildUnknownFields());
                case 22:
                    return new PaychecksHomeUi.Section((PaychecksHomeUi.SectionVisibilityPredicate) this.action, (LoadableStateKt) this.full_applet, (List) this.half_applet, buildUnknownFields());
                case 23:
                    return new UiConfiguration.DestinationUiConfiguration.DestinationUiConfigurationValues((Color) this.action, (LocalizedString) this.full_applet, (Icon) this.half_applet, buildUnknownFields());
                case 24:
                    return new SavingsFolder((String) this.action, (GoalFolder) this.full_applet, (String) this.half_applet, buildUnknownFields());
                case 25:
                    return new CompactCard((Card.Image) this.action, (LocalizedString) this.full_applet, (Button) this.half_applet, buildUnknownFields());
                case 26:
                    return new ActivitySection((SectionHeader) this.action, (LocalizedString) this.full_applet, (LocalizedString) this.half_applet, buildUnknownFields());
                case 27:
                    return new TransferButtons.TransferOutConfig((CdfEvent) this.action, (Money) this.full_applet, (TransferButtons.AlternativeButtonBehavior) this.half_applet, buildUnknownFields());
                case 28:
                    return new WiresAccountInfo.IneligibilityDetails((LocalizedString) this.action, (LocalizedString) this.full_applet, (WiresAccountInfo.Action) this.half_applet, buildUnknownFields());
                default:
                    BinaryOp.Operator operator = (BinaryOp.Operator) this.action;
                    if (operator == null) {
                        TransactorKt.missingRequiredFields(operator, "operator_");
                        throw null;
                    }
                    Expression expression = (Expression) this.full_applet;
                    if (expression == null) {
                        TransactorKt.missingRequiredFields(expression, "left");
                        throw null;
                    }
                    Expression expression2 = (Expression) this.half_applet;
                    if (expression2 != null) {
                        return new BinaryOp(operator, expression, expression2, buildUnknownFields());
                    }
                    TransactorKt.missingRequiredFields(expression2, "right");
                    throw null;
            }
        }
    }

    public final class FullApplet extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<FullApplet> CREATOR;
        public final List lines;
        public final LocalizedString title;

        /* loaded from: classes7.dex */
        public final class Builder extends Message.Builder {
            public final /* synthetic */ int $r8$classId;
            public List lines;
            public LocalizedString title;

            public /* synthetic */ Builder(int i) {
                this.$r8$classId = i;
            }

            @Override // com.squareup.wire.Message.Builder
            public final Message build() {
                switch (this.$r8$classId) {
                    case 0:
                        return new FullApplet(this.title, this.lines, buildUnknownFields());
                    case 1:
                        return new DropDownElement(this.title, this.lines, buildUnknownFields());
                    case 2:
                        return new DropDownSection(this.title, this.lines, buildUnknownFields());
                    case 3:
                        return new LinkSection(this.title, this.lines, buildUnknownFields());
                    case 4:
                        return new Subsection(this.title, this.lines, buildUnknownFields());
                    case 5:
                        return new CardBlockedBusinessesUIConfig.SectionConfig(this.title, this.lines, buildUnknownFields());
                    case 6:
                        return new CardModule.DeliveryStatusModule(this.title, this.lines, buildUnknownFields());
                    case 7:
                        return new SegmentedCircle(this.title, this.lines, buildUnknownFields());
                    case 8:
                        return new BorrowLimitHubData(this.title, this.lines, buildUnknownFields());
                    case 9:
                        return new BorrowLimitHubData.LimitProgressSection.SegmentedProgressBar(this.title, this.lines, buildUnknownFields());
                    default:
                        return new EarningToolsSection(this.title, this.lines, buildUnknownFields());
                }
            }
        }

        static {
            BillsApplet$FullApplet$Companion$ADAPTER$1 billsApplet$FullApplet$Companion$ADAPTER$1 = new BillsApplet$FullApplet$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(FullApplet.class), "type.googleapis.com/squareup.cash.bills.BillsApplet.FullApplet", Syntax.PROTO_2, null, "squareup/cash/bills/Bills.proto");
            ADAPTER = billsApplet$FullApplet$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(billsApplet$FullApplet$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FullApplet(LocalizedString localizedString, List list, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.title = localizedString;
            this.lines = TransactorKt.immutableCopyOf("lines", list);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof FullApplet)) {
                return false;
            }
            FullApplet fullApplet = (FullApplet) obj;
            return Intrinsics.areEqual(unknownFields(), fullApplet.unknownFields()) && Intrinsics.areEqual(this.title, fullApplet.title) && Intrinsics.areEqual(this.lines, fullApplet.lines);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            LocalizedString localizedString = this.title;
            int hashCode2 = this.lines.hashCode() + ((hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Builder builder = new Builder(0);
            builder.title = this.title;
            builder.lines = this.lines;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            LocalizedString localizedString = this.title;
            if (localizedString != null) {
                Matcher$$ExternalSyntheticOutline0.m("title=", localizedString, arrayList);
            }
            List list = this.lines;
            if (!list.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("lines=", arrayList, list);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "FullApplet{", "}", 0, null, null, 56);
        }
    }

    public final class FullAppletLine extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<FullAppletLine> CREATOR;
        public final LocalizedString description;
        public final Image icon;
        public final LocalizedString status;
        public final Color ui_status_color;

        static {
            BillsApplet$FullAppletLine$Companion$ADAPTER$1 billsApplet$FullAppletLine$Companion$ADAPTER$1 = new BillsApplet$FullAppletLine$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(FullAppletLine.class), "type.googleapis.com/squareup.cash.bills.BillsApplet.FullAppletLine", Syntax.PROTO_2, null, "squareup/cash/bills/Bills.proto");
            ADAPTER = billsApplet$FullAppletLine$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(billsApplet$FullAppletLine$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FullAppletLine(Image image, LocalizedString localizedString, Color color, LocalizedString localizedString2, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.icon = image;
            this.status = localizedString;
            this.ui_status_color = color;
            this.description = localizedString2;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof FullAppletLine)) {
                return false;
            }
            FullAppletLine fullAppletLine = (FullAppletLine) obj;
            return Intrinsics.areEqual(unknownFields(), fullAppletLine.unknownFields()) && Intrinsics.areEqual(this.icon, fullAppletLine.icon) && Intrinsics.areEqual(this.status, fullAppletLine.status) && Intrinsics.areEqual(this.ui_status_color, fullAppletLine.ui_status_color) && Intrinsics.areEqual(this.description, fullAppletLine.description);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Image image = this.icon;
            int hashCode2 = (hashCode + (image != null ? image.hashCode() : 0)) * 37;
            LocalizedString localizedString = this.status;
            int hashCode3 = (hashCode2 + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
            Color color = this.ui_status_color;
            int hashCode4 = (hashCode3 + (color != null ? color.hashCode() : 0)) * 37;
            LocalizedString localizedString2 = this.description;
            int hashCode5 = hashCode4 + (localizedString2 != null ? localizedString2.hashCode() : 0);
            this.hashCode = hashCode5;
            return hashCode5;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Deduction.Builder builder = new Deduction.Builder(10);
            builder.amount = this.icon;
            builder.description = this.status;
            builder.tint_color = this.ui_status_color;
            builder.note = this.description;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            Image image = this.icon;
            if (image != null) {
                SizeMode$EnumUnboxingLocalUtility.m("icon=", image, arrayList);
            }
            LocalizedString localizedString = this.status;
            if (localizedString != null) {
                Matcher$$ExternalSyntheticOutline0.m("status=", localizedString, arrayList);
            }
            Color color = this.ui_status_color;
            if (color != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("ui_status_color=", color, arrayList);
            }
            LocalizedString localizedString2 = this.description;
            if (localizedString2 != null) {
                Matcher$$ExternalSyntheticOutline0.m("description=", localizedString2, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "FullAppletLine{", "}", 0, null, null, 56);
        }
    }

    public final class HalfApplet extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<HalfApplet> CREATOR;
        public final LocalizedString description;
        public final LocalizedString title;

        /* loaded from: classes7.dex */
        public final class Builder extends Message.Builder {
            public final /* synthetic */ int $r8$classId;
            public LocalizedString description;
            public LocalizedString title;

            public /* synthetic */ Builder(int i) {
                this.$r8$classId = i;
            }

            @Override // com.squareup.wire.Message.Builder
            public final Message build() {
                switch (this.$r8$classId) {
                    case 0:
                        return new HalfApplet(this.title, this.description, buildUnknownFields());
                    case 1:
                        return new CashCreditScoreEntryPointData.UninstalledState(this.title, this.description, buildUnknownFields());
                    case 2:
                        return new CashCreditScoreHomeData.InfoSection.CollapsingItem(this.title, this.description, buildUnknownFields());
                    case 3:
                        return new LockDevices(this.title, this.description, buildUnknownFields());
                    case 4:
                        return new InfoSheet.NumberedListItem(this.title, this.description, buildUnknownFields());
                    case 5:
                        return new BorrowData.AppletData.EntryPointData.TileEntryPoint.Row.DetailText(this.title, this.description, buildUnknownFields());
                    default:
                        return new BillsConfig.HalfApplet(this.title, this.description, buildUnknownFields());
                }
            }
        }

        static {
            BillsApplet$HalfApplet$Companion$ADAPTER$1 billsApplet$HalfApplet$Companion$ADAPTER$1 = new BillsApplet$HalfApplet$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(HalfApplet.class), "type.googleapis.com/squareup.cash.bills.BillsApplet.HalfApplet", Syntax.PROTO_2, null, "squareup/cash/bills/Bills.proto");
            ADAPTER = billsApplet$HalfApplet$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(billsApplet$HalfApplet$Companion$ADAPTER$1);
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
            Builder builder = new Builder(0);
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
        BillsApplet$Companion$ADAPTER$1 billsApplet$Companion$ADAPTER$1 = new BillsApplet$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(BillsApplet.class), "type.googleapis.com/squareup.cash.bills.BillsApplet", Syntax.PROTO_2, null, "squareup/cash/bills/Bills.proto");
        ADAPTER = billsApplet$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(billsApplet$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BillsApplet(BillsAppletAction billsAppletAction, FullApplet fullApplet, HalfApplet halfApplet, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.action = billsAppletAction;
        this.full_applet = fullApplet;
        this.half_applet = halfApplet;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BillsApplet)) {
            return false;
        }
        BillsApplet billsApplet = (BillsApplet) obj;
        return Intrinsics.areEqual(unknownFields(), billsApplet.unknownFields()) && Intrinsics.areEqual(this.action, billsApplet.action) && Intrinsics.areEqual(this.full_applet, billsApplet.full_applet) && Intrinsics.areEqual(this.half_applet, billsApplet.half_applet);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        BillsAppletAction billsAppletAction = this.action;
        int hashCode2 = (hashCode + (billsAppletAction != null ? billsAppletAction.hashCode() : 0)) * 37;
        FullApplet fullApplet = this.full_applet;
        int hashCode3 = (hashCode2 + (fullApplet != null ? fullApplet.hashCode() : 0)) * 37;
        HalfApplet halfApplet = this.half_applet;
        int hashCode4 = hashCode3 + (halfApplet != null ? halfApplet.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.action = this.action;
        builder.full_applet = this.full_applet;
        builder.half_applet = this.half_applet;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        BillsAppletAction billsAppletAction = this.action;
        if (billsAppletAction != null) {
            arrayList.add("action=" + billsAppletAction);
        }
        FullApplet fullApplet = this.full_applet;
        if (fullApplet != null) {
            arrayList.add("full_applet=" + fullApplet);
        }
        HalfApplet halfApplet = this.half_applet;
        if (halfApplet != null) {
            arrayList.add("half_applet=" + halfApplet);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "BillsApplet{", "}", 0, null, null, 56);
    }
}
