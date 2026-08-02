package com.squareup.protos.rewardly.ui;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.google.android.gms.internal.mlkit_vision_face.zzja;
import com.google.android.gms.internal.mlkit_vision_face.zzjb;
import com.google.android.gms.internal.mlkit_vision_face.zzjc;
import com.google.android.gms.internal.mlkit_vision_face.zzjh;
import com.google.android.gms.internal.mlkit_vision_face.zzjl;
import com.google.android.gms.internal.mlkit_vision_face.zzjo;
import com.google.android.gms.internal.mlkit_vision_face.zzjr;
import com.squareup.protos.cash.investautomator.model.Automation;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.common.Headers;
import com.squareup.protos.common.countries.Country;
import com.squareup.protos.common.time.LocalTime;
import com.squareup.protos.common.time.YearMonthDay;
import com.squareup.protos.franklin.api.SelectPaymentPlanBlocker;
import com.squareup.protos.franklin.api.UiAlias;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.protos.franklin.common.ScheduledReloadData;
import com.squareup.protos.franklin.lending.SelectPaymentPlanBlockerSubmitResponse;
import com.squareup.protos.franklin.lending.SyncPrepurchaseAfterpayResponse;
import com.squareup.protos.franklin.ui.UiInvestingAutomation;
import com.squareup.protos.franklin.ui.UiNotificationPreference;
import com.squareup.protos.franklin.ui.UiScheduledPayments;
import com.squareup.protos.investing.notifications.settings.NotificationsSettingsOptionsConfiguration;
import com.squareup.protos.investing.notifications.settings.NotificationsSettingsOptionsConfiguration$Value$Performance;
import com.squareup.protos.lending.CustomAmountPickerData;
import com.squareup.protos.lending.CustomRepaymentAmountSelectionData;
import com.squareup.protos.lending.PrepurchaseAfterpayAppletData;
import com.squareup.protos.lending.sync_values.AfterpayPrepurchaseData;
import com.squareup.protos.lending.sync_values.BorrowAppletBulletinsTile;
import com.squareup.protos.lending.sync_values.BorrowAppletLoanHistoryTile;
import com.squareup.protos.lending.sync_values.BorrowLimitHubData;
import com.squareup.protos.lending.sync_values.GlobalBorrowData;
import com.squareup.protos.multipass.common.ScopedSession;
import com.squareup.protos.multipass.service.ClientCredentials;
import com.squareup.protos.multipass.service.ClientSessionCookie;
import com.squareup.protos.multipass.service.CreateOtkResponse;
import com.squareup.protos.multipass.service.DeviceDetails;
import com.squareup.protos.multipass.service.Error;
import com.squareup.protos.multipass.service.OneTimeKey;
import com.squareup.protos.multipass.service.SessionHeaders;
import com.squareup.protos.payroll.service.GetEmployeePayrollOverviewRequest;
import com.squareup.protos.payrollconnector.common.PayrollProviderUiAvatar;
import com.squareup.protos.payrollconnector.common.PayrollProviderUiSpecification;
import com.squareup.protos.rewardly.ui.UiBoostAttribute;
import com.squareup.protos.timecards.CalculationTotal;
import com.squareup.protos.timecards.LocalDateRange;
import com.squareup.protos.timecards.LocalDateTime;
import com.squareup.protos.timecards.LocalDateTimeRange;
import com.squareup.protos.timecards.OvertimeRule;
import com.squareup.protos.timecards.ShiftsToSwap;
import com.squareup.protos.timecards.scheduling.ShiftSchedule;
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

/* loaded from: classes.dex */
public final class AppLinks extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<AppLinks> CREATOR;

    /* renamed from: android, reason: collision with root package name */
    public final AppLinkAndroid f1410android;
    public final AppLinkIOS ios;

    /* loaded from: classes8.dex */
    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;

        /* renamed from: android, reason: collision with root package name */
        public Object f1411android;
        public Object ios;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new AppLinks((AppLinkAndroid) this.f1411android, (AppLinkIOS) this.ios, buildUnknownFields());
                case 1:
                    return new SelectPaymentPlanBlockerSubmitResponse((SelectPaymentPlanBlocker) this.f1411android, (ResponseContext) this.ios, buildUnknownFields());
                case 2:
                    return new SyncPrepurchaseAfterpayResponse((ResponseContext) this.f1411android, (PrepurchaseAfterpayAppletData) this.ios, buildUnknownFields());
                case 3:
                    return new UiInvestingAutomation((Automation) this.f1411android, (UiInvestingAutomation.UiAutomationStatistics) this.ios, buildUnknownFields());
                case 4:
                    return new UiNotificationPreference((UiAlias) this.f1411android, (Boolean) this.ios, buildUnknownFields());
                case 5:
                    return new UiScheduledPayments((ScheduledReloadData) this.f1411android, (Boolean) this.ios, buildUnknownFields());
                case 6:
                    return new NotificationsSettingsOptionsConfiguration((NotificationsSettingsOptionsConfiguration.NotificationsSettingsOptionsConfigurationType) this.f1411android, (NotificationsSettingsOptionsConfiguration$Value$Performance) this.ios, buildUnknownFields());
                case 7:
                    return new CustomRepaymentAmountSelectionData((String) this.f1411android, (CustomAmountPickerData) this.ios, buildUnknownFields());
                case 8:
                    return new PrepurchaseAfterpayAppletData.AppletRow((zzjb) this.f1411android, (String) this.ios, buildUnknownFields());
                case 9:
                    return new PrepurchaseAfterpayAppletData.AppletRow.Cell((LocalizedString) this.f1411android, (zzja) this.ios, buildUnknownFields());
                case 10:
                    return new PrepurchaseAfterpayAppletData.AppletRow.UnorderedList.ListItem((LocalizedString) this.f1411android, (zzjc) this.ios, buildUnknownFields());
                case 11:
                    return new AfterpayPrepurchaseData((AfterpayPrepurchaseData.CardsEntryPoint) this.f1411android, (PrepurchaseAfterpayAppletData) this.ios, buildUnknownFields());
                case 12:
                    return new BorrowAppletBulletinsTile.Data((List) this.f1411android, (BorrowAppletBulletinsTile.Data.UpsellCard) this.ios, buildUnknownFields());
                case 13:
                    return new BorrowAppletLoanHistoryTile.Data.Loan.Details.ButtonData((LocalizedString) this.f1411android, (zzjh) this.ios, buildUnknownFields());
                case 14:
                    return new BorrowLimitHubData.Section((List) this.f1411android, (zzjl) this.ios, buildUnknownFields());
                case 15:
                    return new GlobalBorrowData.CountrySupport((Country) this.f1411android, (List) this.ios, buildUnknownFields());
                case 16:
                    return new ClientCredentials((zzjo) this.f1411android, (DeviceDetails) this.ios, buildUnknownFields());
                case 17:
                    return new ClientSessionCookie((String) this.f1411android, (ScopedSession) this.ios, buildUnknownFields());
                case 18:
                    return new CreateOtkResponse((Error) this.f1411android, (OneTimeKey) this.ios, buildUnknownFields());
                case 19:
                    return new SessionHeaders((Headers) this.f1411android, (List) this.ios, buildUnknownFields());
                case 20:
                    String str = (String) this.f1411android;
                    if (str != null) {
                        return new GetEmployeePayrollOverviewRequest(str, (GetEmployeePayrollOverviewRequest.APIVersion) this.ios, buildUnknownFields());
                    }
                    TransactorKt.missingRequiredFields(str, "team_member_id");
                    throw null;
                case 21:
                    return new PayrollProviderUiSpecification((PayrollProviderUiAvatar) this.f1411android, (String) this.ios, buildUnknownFields());
                case 22:
                    return new UiBoostAttribute((UiBoostAttribute.Type) this.f1411android, (Icon) this.ios, buildUnknownFields());
                case 23:
                    return new UiRewardSelectionState((String) this.f1411android, (zzjr) this.ios, buildUnknownFields());
                case 24:
                    return new CalculationTotal.MapEntry((CalculationTotal.PayState) this.f1411android, (Integer) this.ios, buildUnknownFields());
                case 25:
                    return new LocalDateRange((YearMonthDay) this.f1411android, (YearMonthDay) this.ios, buildUnknownFields());
                case 26:
                    return new LocalDateTime((YearMonthDay) this.f1411android, (LocalTime) this.ios, buildUnknownFields());
                case 27:
                    return new LocalDateTimeRange((LocalDateTime) this.f1411android, (LocalDateTime) this.ios, buildUnknownFields());
                case 28:
                    return new OvertimeRule((OvertimeRule.Reason) this.f1411android, (Integer) this.ios, buildUnknownFields());
                default:
                    return new ShiftsToSwap((ShiftSchedule) this.f1411android, (ShiftSchedule) this.ios, buildUnknownFields());
            }
        }
    }

    static {
        AppLinks$Companion$ADAPTER$1 appLinks$Companion$ADAPTER$1 = new AppLinks$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(AppLinks.class), "type.googleapis.com/squareup.rewardly.ui.AppLinks", Syntax.PROTO_2, null, "squareup/rewardly/ui.proto");
        ADAPTER = appLinks$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(appLinks$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppLinks(AppLinkAndroid appLinkAndroid, AppLinkIOS appLinkIOS, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.f1410android = appLinkAndroid;
        this.ios = appLinkIOS;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AppLinks)) {
            return false;
        }
        AppLinks appLinks = (AppLinks) obj;
        return Intrinsics.areEqual(unknownFields(), appLinks.unknownFields()) && Intrinsics.areEqual(this.f1410android, appLinks.f1410android) && Intrinsics.areEqual(this.ios, appLinks.ios);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        AppLinkAndroid appLinkAndroid = this.f1410android;
        int hashCode2 = (hashCode + (appLinkAndroid != null ? appLinkAndroid.hashCode() : 0)) * 37;
        AppLinkIOS appLinkIOS = this.ios;
        int hashCode3 = hashCode2 + (appLinkIOS != null ? appLinkIOS.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.f1411android = this.f1410android;
        builder.ios = this.ios;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        AppLinkAndroid appLinkAndroid = this.f1410android;
        if (appLinkAndroid != null) {
            arrayList.add("android=" + appLinkAndroid);
        }
        AppLinkIOS appLinkIOS = this.ios;
        if (appLinkIOS != null) {
            arrayList.add("ios=" + appLinkIOS);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AppLinks{", "}", 0, null, null, 56);
    }
}
