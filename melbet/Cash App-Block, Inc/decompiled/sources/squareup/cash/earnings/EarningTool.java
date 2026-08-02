package squareup.cash.earnings;

import android.os.Build;
import android.os.Parcelable;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.Modifier;
import androidx.room.TransactorKt;
import coil3.compose.AsyncImageKt;
import com.google.android.gms.internal.mlkit_vision_face.zzkp;
import com.squareup.cash.arcade.util.ThemablesKt;
import com.squareup.cash.maps.views.CashMapViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.money.booklet.DisclosureSectionKt;
import com.squareup.cash.money.booklet.HeaderSectionKt;
import com.squareup.cash.money.booklet.HeroSection;
import com.squareup.cash.money.booklet.MoneyTabBookletKt;
import com.squareup.cash.moneybot.analytics.AnalyticsMappersKt;
import com.squareup.cash.util.money.Moneys;
import com.squareup.protos.cash.cashsuggest.api.AfterpayAppletResponse;
import com.squareup.protos.cash.cashsuggest.api.CreditLineData;
import com.squareup.protos.cash.cashsuggest.api.CreditLineSnapshot;
import com.squareup.protos.cash.cashsuggest.api.CreditLineType;
import com.squareup.protos.cash.scheduledreloader.resources.v1.ScheduledReloadPreference;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.common.location.Phone;
import com.squareup.protos.timecards.CreateOrUpdateTimecardResponse;
import com.squareup.protos.timecards.OpenShiftToClaim;
import com.squareup.protos.timecards.ProposedTimeOff;
import com.squareup.protos.timecards.Timecard;
import com.squareup.protos.timecards.scheduling.ShiftSchedule;
import com.squareup.protos.timecards.scheduling.TimeOff;
import com.squareup.protos.wire.roster.mds.PhoneContactMethod;
import com.squareup.protos.wiremate.WiresEligibilityState;
import com.squareup.stafftasks.endpoints.UpsertTaskResponse;
import com.squareup.stafftasks.resources.Task;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt__StringsJVMKt;
import okhttp3.Cache;
import okio.ByteString;
import squareup.cash.bankingbenefits.ui.CashGreenV1;
import squareup.cash.bankingbenefits.ui.GreenBenefitsV1;
import squareup.cash.bankingbenefits.ui.GreenBookletV1;
import squareup.cash.bankingbenefits.ui.PathProgress;
import squareup.cash.bankingbenefits.ui.PathProgress$Progress$Spend;
import squareup.cash.bankingbenefits.ui.VersionedCashGreen;
import squareup.cash.bankingbenefits.ui.VersionedGreenBenefits;
import squareup.cash.bankingbenefits.ui.VersionedGreenBooklet;
import squareup.cash.bills.BillsApplet;
import squareup.cash.customer_feed.service.RequestEnvelope;
import squareup.cash.customer_feed.service.RequestEnvelope$Type$Subscribe;
import squareup.cash.customer_feed.service.ResponseEnvelope;
import squareup.cash.earnings.EarningsHomeUIState;
import squareup.cash.earnings.EarningsHomeUi;
import squareup.cash.earnings.EarningsTimeFrame;
import squareup.cash.investcustomer.syncvalues.InvestDividendSetting;
import squareup.cash.overdraft.OverdraftStatus;
import squareup.cash.paychecks.AlertUi;
import squareup.cash.paychecks.CalendarMonthPaychecksAggregation;
import squareup.cash.paychecks.UiConfiguration;
import squareup.cash.paychecks.UiState;
import squareup.cash.phoneplans.syncvalues.PhonePlanAppletV1;
import squareup.cash.phoneplans.syncvalues.VersionedPhonePlanApplet;
import squareup.cash.savings.ArcadeElement;
import squareup.cash.savings.SavingsConfig;
import squareup.cash.savings.SavingsElement;
import squareup.cash.savings.SavingsScreen;
import squareup.cash.savings.SavingsScreens;
import squareup.cash.savings.VersionedSavingsScreens;
import squareup.cash.scheduledreloader.api.external.v1.ExternalGetLatestScheduledReloadPreferenceResponse;

/* loaded from: classes10.dex */
public final class EarningTool extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<EarningTool> CREATOR;
    public final Tool tool;

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public Object tool;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new EarningTool((Tool) this.tool, buildUnknownFields());
                case 1:
                    return new CreateOrUpdateTimecardResponse.ConflictError((Timecard) this.tool, buildUnknownFields());
                case 2:
                    return new OpenShiftToClaim((ShiftSchedule) this.tool, buildUnknownFields());
                case 3:
                    return new ProposedTimeOff((TimeOff) this.tool, buildUnknownFields());
                case 4:
                    return new PhoneContactMethod((Phone) this.tool, buildUnknownFields());
                case 5:
                    return new WiresEligibilityState((zzkp) this.tool, buildUnknownFields());
                case 6:
                    return new UpsertTaskResponse((Task) this.tool, buildUnknownFields());
                case 7:
                    return new GreenBenefitsV1.Benefit((DisclosureSectionKt) this.tool, buildUnknownFields());
                case 8:
                    return new PathProgress((PathProgress$Progress$Spend) this.tool, buildUnknownFields());
                case 9:
                    return new VersionedCashGreen((CashGreenV1) this.tool, buildUnknownFields());
                case 10:
                    return new VersionedGreenBenefits((GreenBenefitsV1) this.tool, buildUnknownFields());
                case 11:
                    return new VersionedGreenBooklet((GreenBookletV1) this.tool, buildUnknownFields());
                case 12:
                    return new BillsApplet.BillsAppletAction((HeaderSectionKt) this.tool, buildUnknownFields());
                case 13:
                    return new RequestEnvelope((RequestEnvelope$Type$Subscribe) this.tool, buildUnknownFields());
                case 14:
                    return new ResponseEnvelope((Cache.Companion) this.tool, buildUnknownFields());
                case 15:
                    return new EarningsHomeUIState.EarningsHomeConfiguration((EarningsHomeUi) this.tool, buildUnknownFields());
                case 16:
                    return new EarningsHomeUi.Section((EarningsHomeUi.Section.AbstractC0087Section) this.tool, buildUnknownFields());
                case 17:
                    return new EarningsTimeFrame((EarningsTimeFrame.TimeFrame) this.tool, buildUnknownFields());
                case 18:
                    InvestDividendSetting.DividendSetting dividendSetting = (InvestDividendSetting.DividendSetting) this.tool;
                    if (dividendSetting != null) {
                        return new InvestDividendSetting(dividendSetting, buildUnknownFields());
                    }
                    TransactorKt.missingRequiredFields(dividendSetting, "dividend_setting");
                    throw null;
                case 19:
                    return new OverdraftStatus.Action((MoneyTabBookletKt) this.tool, buildUnknownFields());
                case 20:
                    return new UiConfiguration.ReceiptUi((AlertUi) this.tool, buildUnknownFields());
                case 21:
                    return new UiState.CurrentMonthPaychecksAggregation((CalendarMonthPaychecksAggregation) this.tool, buildUnknownFields());
                case 22:
                    return new VersionedPhonePlanApplet((PhonePlanAppletV1) this.tool, buildUnknownFields());
                case 23:
                    return new ArcadeElement((ArcadeElement.Element) this.tool, buildUnknownFields());
                case 24:
                    return new SavingsConfig.SavingsAppletUi((SavingsConfig.SavingsAppletUi.FolderSubtitles) this.tool, buildUnknownFields());
                case 25:
                    return new SavingsConfig.SavingsAppletUi.FolderSubtitles((SavingsConfig.SavingsAppletUi.FolderSubtitles.Yield) this.tool, buildUnknownFields());
                case 26:
                    return new SavingsElement((SavingsElement.Element) this.tool, buildUnknownFields());
                case 27:
                    return new SavingsScreen.Element((AnalyticsMappersKt) this.tool, buildUnknownFields());
                case 28:
                    return new VersionedSavingsScreens((SavingsScreens) this.tool, buildUnknownFields());
                default:
                    return new ExternalGetLatestScheduledReloadPreferenceResponse((ScheduledReloadPreference) this.tool, buildUnknownFields());
            }
        }
    }

    /* loaded from: classes5.dex */
    public abstract class Tool {

        /* loaded from: classes10.dex */
        public final class AddPaycheck extends Tool {
            public final AddPaycheckTool value;

            public AddPaycheck(AddPaycheckTool addPaycheckTool) {
                addPaycheckTool.getClass();
                this.value = addPaycheckTool;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof AddPaycheck) && Intrinsics.areEqual(this.value, ((AddPaycheck) obj).value);
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "AddPaycheck(value=" + this.value + ")";
            }
        }

        /* loaded from: classes10.dex */
        public final class EarnerMode extends Tool {
            public final EarnerModeTool value;

            public EarnerMode(EarnerModeTool earnerModeTool) {
                earnerModeTool.getClass();
                this.value = earnerModeTool;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof EarnerMode) && Intrinsics.areEqual(this.value, ((EarnerMode) obj).value);
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "EarnerMode(value=" + this.value + ")";
            }
        }

        /* loaded from: classes10.dex */
        public final class EarnerOnboarding extends Tool {
            public final EarnerOnboardingTool value;

            public EarnerOnboarding(EarnerOnboardingTool earnerOnboardingTool) {
                earnerOnboardingTool.getClass();
                this.value = earnerOnboardingTool;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof EarnerOnboarding) && Intrinsics.areEqual(this.value, ((EarnerOnboarding) obj).value);
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "EarnerOnboarding(value=" + this.value + ")";
            }
        }

        /* loaded from: classes10.dex */
        public final class ManageCustomers extends Tool {
            public final ManageCustomersTool value;

            public ManageCustomers(ManageCustomersTool manageCustomersTool) {
                manageCustomersTool.getClass();
                this.value = manageCustomersTool;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ManageCustomers) && Intrinsics.areEqual(this.value, ((ManageCustomers) obj).value);
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "ManageCustomers(value=" + this.value + ")";
            }
        }

        /* loaded from: classes10.dex */
        public final class PaycheckDistribution extends Tool {
            public final PaycheckDistributionTool value;

            public PaycheckDistribution(PaycheckDistributionTool paycheckDistributionTool) {
                paycheckDistributionTool.getClass();
                this.value = paycheckDistributionTool;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof PaycheckDistribution) && Intrinsics.areEqual(this.value, ((PaycheckDistribution) obj).value);
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "PaycheckDistribution(value=" + this.value + ")";
            }
        }

        public static final void HeroSection(HeroSection heroSection, Composer composer, int i) {
            GapComposer gapComposer = (GapComposer) composer;
            gapComposer.startRestartGroup(1433981629);
            int i2 = (gapComposer.changedInstance(heroSection) ? 4 : 2) | i;
            if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
                AsyncImageKt.m1438AsyncImage10Xjiaw(ThemablesKt.urlForTheme(heroSection.image, gapComposer), null, OffsetKt.aspectRatio(heroSection.imageAspectRatio, SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f), false), null, null, null, gapComposer, 48, 2040);
            } else {
                gapComposer.skipToGroupEnd();
            }
            RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup != null) {
                endRestartGroup.block = new CashMapViewKt$$ExternalSyntheticLambda5(heroSection, i, 24);
            }
        }

        public static ArrayList creditLines(CreditLineSnapshot creditLineSnapshot) {
            List list = creditLineSnapshot.credit_lines;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((CreditLineData) obj).line_type != CreditLineType.ALL) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }

        public static boolean isBluStudioX10() {
            String str = Build.MANUFACTURER;
            str.getClass();
            if (!str.equalsIgnoreCase("Blu")) {
                String str2 = Build.BRAND;
                str2.getClass();
                if (!str2.equalsIgnoreCase("Blu")) {
                    return false;
                }
            }
            return "studio x10".equalsIgnoreCase(Build.MODEL);
        }

        public static boolean isItelW6004() {
            String str = Build.MANUFACTURER;
            str.getClass();
            if (!str.equalsIgnoreCase("Itel")) {
                String str2 = Build.BRAND;
                str2.getClass();
                if (!str2.equalsIgnoreCase("Itel")) {
                    return false;
                }
            }
            return "itel w6004".equalsIgnoreCase(Build.MODEL);
        }

        public static boolean isMotoE13() {
            String str = Build.MANUFACTURER;
            str.getClass();
            if (!str.equalsIgnoreCase("Motorola")) {
                String str2 = Build.BRAND;
                str2.getClass();
                if (!str2.equalsIgnoreCase("Motorola")) {
                    return false;
                }
            }
            return "moto e13".equalsIgnoreCase(Build.MODEL);
        }

        public static boolean isPositivoTwist2Pro() {
            String str = Build.MANUFACTURER;
            str.getClass();
            if (!str.equalsIgnoreCase("Positivo")) {
                String str2 = Build.BRAND;
                str2.getClass();
                if (!str2.equalsIgnoreCase("Positivo")) {
                    return false;
                }
            }
            return "twist 2 pro".equalsIgnoreCase(Build.MODEL);
        }

        /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
        
            if (r0.equalsIgnoreCase("Samsung") != false) goto L6;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static boolean isSamsungA53() {
            String str = Build.MANUFACTURER;
            str.getClass();
            if (!str.equalsIgnoreCase("Samsung")) {
                String str2 = Build.BRAND;
                str2.getClass();
            }
            String str3 = Build.MODEL;
            str3.getClass();
            return StringsKt__StringsJVMKt.startsWith(str3, "SM-A536", false);
        }

        public static boolean isSamsungTabA8() {
            String str = Build.MANUFACTURER;
            str.getClass();
            if (!str.equalsIgnoreCase("Samsung")) {
                String str2 = Build.BRAND;
                str2.getClass();
                if (!str2.equalsIgnoreCase("Samsung")) {
                    return false;
                }
            }
            String str3 = Build.DEVICE;
            return "gta8".equalsIgnoreCase(str3) || "gta8wifi".equalsIgnoreCase(str3);
        }

        public static boolean isVivo1805() {
            String str = Build.MANUFACTURER;
            str.getClass();
            if (!str.equalsIgnoreCase("Vivo")) {
                String str2 = Build.BRAND;
                str2.getClass();
                if (!str2.equalsIgnoreCase("Vivo")) {
                    return false;
                }
            }
            return "vivo 1805".equalsIgnoreCase(Build.MODEL);
        }

        public static Money remainingINNCredit(AfterpayAppletResponse afterpayAppletResponse) {
            CreditLineSnapshot creditLineSnapshot;
            List list;
            Object obj;
            if (afterpayAppletResponse != null && (creditLineSnapshot = afterpayAppletResponse.credit_line_snapshot) != null && (list = creditLineSnapshot.credit_lines) != null) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((CreditLineData) obj).line_type == CreditLineType.INN) {
                        break;
                    }
                }
                CreditLineData creditLineData = (CreditLineData) obj;
                if (creditLineData != null) {
                    return creditLineData.remaining_credit;
                }
            }
            return null;
        }

        public static Money remainingINNMoney(CreditLineSnapshot creditLineSnapshot) {
            creditLineSnapshot.getClass();
            ArrayList creditLines = creditLines(creditLineSnapshot);
            ArrayList arrayList = new ArrayList();
            Iterator it = creditLines.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (((CreditLineData) next).line_type == CreditLineType.INN) {
                    arrayList.add(next);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Money money = ((CreditLineData) it2.next()).remaining_credit;
                if (money != null) {
                    arrayList2.add(money);
                }
            }
            return sumOfMoney(arrayList2);
        }

        public static Money remainingONNMoney(CreditLineSnapshot creditLineSnapshot) {
            creditLineSnapshot.getClass();
            ArrayList creditLines = creditLines(creditLineSnapshot);
            ArrayList arrayList = new ArrayList();
            Iterator it = creditLines.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (((CreditLineData) next).line_type == CreditLineType.OON) {
                    arrayList.add(next);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Money money = ((CreditLineData) it2.next()).remaining_credit;
                if (money != null) {
                    arrayList2.add(money);
                }
            }
            return sumOfMoney(arrayList2);
        }

        public static Money remainingRetroMoney(CreditLineSnapshot creditLineSnapshot) {
            creditLineSnapshot.getClass();
            ArrayList creditLines = creditLines(creditLineSnapshot);
            ArrayList arrayList = new ArrayList();
            Iterator it = creditLines.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (((CreditLineData) next).line_type == CreditLineType.RETRO) {
                    arrayList.add(next);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Money money = ((CreditLineData) it2.next()).remaining_credit;
                if (money != null) {
                    arrayList2.add(money);
                }
            }
            return sumOfMoney(arrayList2);
        }

        public static Money sumOfMoney(ArrayList arrayList) {
            Money money = new Money((Long) 0L, CurrencyCode.USD, 4);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                money = Moneys.plus(money, (Money) it.next());
            }
            return money;
        }

        public static Money totalBalanceMoney(CreditLineSnapshot creditLineSnapshot) {
            creditLineSnapshot.getClass();
            ArrayList creditLines = creditLines(creditLineSnapshot);
            ArrayList arrayList = new ArrayList();
            Iterator it = creditLines.iterator();
            while (it.hasNext()) {
                Money money = ((CreditLineData) it.next()).outstanding_balance;
                if (money != null) {
                    arrayList.add(money);
                }
            }
            return sumOfMoney(arrayList);
        }

        public static Money totalRemainingMoney(CreditLineSnapshot creditLineSnapshot) {
            creditLineSnapshot.getClass();
            ArrayList creditLines = creditLines(creditLineSnapshot);
            ArrayList arrayList = new ArrayList();
            Iterator it = creditLines.iterator();
            while (it.hasNext()) {
                Money money = ((CreditLineData) it.next()).remaining_credit;
                if (money != null) {
                    arrayList.add(money);
                }
            }
            return sumOfMoney(arrayList);
        }
    }

    static {
        EarningTool$Companion$ADAPTER$1 earningTool$Companion$ADAPTER$1 = new EarningTool$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(EarningTool.class), "type.googleapis.com/squareup.cash.earnings.EarningTool", Syntax.PROTO_2, null, "squareup/cash/earnings/EarningsHomeUi.proto");
        ADAPTER = earningTool$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(earningTool$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EarningTool(Tool tool, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.tool = tool;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EarningTool)) {
            return false;
        }
        EarningTool earningTool = (EarningTool) obj;
        return Intrinsics.areEqual(unknownFields(), earningTool.unknownFields()) && Intrinsics.areEqual(this.tool, earningTool.tool);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Tool tool = this.tool;
        int hashCode2 = hashCode + (tool != null ? tool.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.tool = this.tool;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Tool tool = this.tool;
        if (tool != null) {
            arrayList.add("tool=" + tool);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "EarningTool{", "}", 0, null, null, 56);
    }
}
