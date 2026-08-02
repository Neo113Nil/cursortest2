package com.squareup.cash.work.viewmodels;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public interface ClockInOverlayViewModel {

    public final class BreakIdentifier {
        public final String token;
        public final long versionNumber;

        public BreakIdentifier(String str, long j) {
            str.getClass();
            this.token = str;
            this.versionNumber = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BreakIdentifier)) {
                return false;
            }
            BreakIdentifier breakIdentifier = (BreakIdentifier) obj;
            return Intrinsics.areEqual(this.token, breakIdentifier.token) && this.versionNumber == breakIdentifier.versionNumber;
        }

        public final int hashCode() {
            return Long.hashCode(this.versionNumber) + (this.token.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder m = re$$ExternalSyntheticOutline0.m("BreakIdentifier(token=", this.token, ", versionNumber=", this.versionNumber);
            m.append(")");
            return m.toString();
        }
    }

    public final class Error implements ClockInOverlayViewModel {
        public final SellerCardViewModel sellerCard;

        public Error(SellerCardViewModel sellerCardViewModel) {
            sellerCardViewModel.getClass();
            this.sellerCard = sellerCardViewModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Error) && Intrinsics.areEqual(this.sellerCard, ((Error) obj).sellerCard);
        }

        @Override // com.squareup.cash.work.viewmodels.ClockInOverlayViewModel
        public final SellerCardViewModel getSellerCard() {
            return this.sellerCard;
        }

        @Override // com.squareup.cash.work.viewmodels.ClockInOverlayViewModel
        public final boolean getShowErrorDialog() {
            return true;
        }

        public final int hashCode() {
            return this.sellerCard.hashCode();
        }

        public final String toString() {
            return "Error(sellerCard=" + this.sellerCard + ")";
        }
    }

    public interface Loaded extends ClockInOverlayViewModel {

        public final class ClockedIn implements Loaded {
            public final List breakItems;
            public final String currencyCode;
            public final String currencySymbol;
            public final CurrentTimeMillisProvider$Companion$$ExternalSyntheticLambda0 currentTimeMillisProvider;
            public final long elapsedTimeStartMillis;
            public final boolean isClockOutLoading;
            public final SellerCardViewModel sellerCard;
            public final boolean shouldDeclareCashTips;
            public final boolean showErrorDialog;
            public final boolean showTakeBreakButton;
            public final String wagesText;

            public ClockedIn(SellerCardViewModel sellerCardViewModel, String str, long j, List list, boolean z, boolean z2, CurrentTimeMillisProvider$Companion$$ExternalSyntheticLambda0 currentTimeMillisProvider$Companion$$ExternalSyntheticLambda0, boolean z3, String str2, String str3) {
                sellerCardViewModel.getClass();
                str.getClass();
                list.getClass();
                currentTimeMillisProvider$Companion$$ExternalSyntheticLambda0.getClass();
                str2.getClass();
                str3.getClass();
                this.sellerCard = sellerCardViewModel;
                this.wagesText = str;
                this.elapsedTimeStartMillis = j;
                this.breakItems = list;
                this.isClockOutLoading = z;
                this.showErrorDialog = z2;
                this.currentTimeMillisProvider = currentTimeMillisProvider$Companion$$ExternalSyntheticLambda0;
                this.shouldDeclareCashTips = z3;
                this.currencySymbol = str2;
                this.currencyCode = str3;
                this.showTakeBreakButton = !list.isEmpty();
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ClockedIn)) {
                    return false;
                }
                ClockedIn clockedIn = (ClockedIn) obj;
                return Intrinsics.areEqual(this.sellerCard, clockedIn.sellerCard) && Intrinsics.areEqual(this.wagesText, clockedIn.wagesText) && this.elapsedTimeStartMillis == clockedIn.elapsedTimeStartMillis && Intrinsics.areEqual(this.breakItems, clockedIn.breakItems) && this.isClockOutLoading == clockedIn.isClockOutLoading && this.showErrorDialog == clockedIn.showErrorDialog && Intrinsics.areEqual(this.currentTimeMillisProvider, clockedIn.currentTimeMillisProvider) && this.shouldDeclareCashTips == clockedIn.shouldDeclareCashTips && Intrinsics.areEqual(this.currencySymbol, clockedIn.currencySymbol) && Intrinsics.areEqual(this.currencyCode, clockedIn.currencyCode);
            }

            @Override // com.squareup.cash.work.viewmodels.ClockInOverlayViewModel
            public final SellerCardViewModel getSellerCard() {
                return this.sellerCard;
            }

            @Override // com.squareup.cash.work.viewmodels.ClockInOverlayViewModel
            public final boolean getShowErrorDialog() {
                return this.showErrorDialog;
            }

            public final int hashCode() {
                return this.currencyCode.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.currentTimeMillisProvider.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.sellerCard.hashCode() * 31, 31, this.wagesText), 31, this.elapsedTimeStartMillis), 31, this.breakItems), 31, this.isClockOutLoading), 31, this.showErrorDialog)) * 31, 31, this.shouldDeclareCashTips), 31, this.currencySymbol);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("ClockedIn(sellerCard=");
                sb.append(this.sellerCard);
                sb.append(", wagesText=");
                sb.append(this.wagesText);
                sb.append(", elapsedTimeStartMillis=");
                sb.append(this.elapsedTimeStartMillis);
                sb.append(", breakItems=");
                sb.append(this.breakItems);
                sb.append(", isClockOutLoading=");
                sb.append(this.isClockOutLoading);
                sb.append(", showErrorDialog=");
                sb.append(this.showErrorDialog);
                sb.append(", currentTimeMillisProvider=");
                sb.append(this.currentTimeMillisProvider);
                sb.append(", shouldDeclareCashTips=");
                sb.append(this.shouldDeclareCashTips);
                Boxes$$ExternalSyntheticOutline1.m(sb, ", currencySymbol=", this.currencySymbol, ", currencyCode=", this.currencyCode);
                sb.append(")");
                return sb.toString();
            }
        }

        public final class ClockedOut implements Loaded {
            public final String geofenceReasonText;
            public final String geofenceSettingsLinkText;
            public final boolean isGeofenceAllowed;
            public final boolean isGeofenceLoading;
            public final List jobs;
            public final List locations;
            public final SellerCardViewModel sellerCard;
            public final ShiftScheduleDisplay shiftSchedule;
            public final boolean shouldSendShiftToken;
            public final boolean showErrorDialog;

            public ClockedOut(SellerCardViewModel sellerCardViewModel, ShiftScheduleDisplay shiftScheduleDisplay, List list, List list2, boolean z, String str, String str2, boolean z2, boolean z3, boolean z4) {
                sellerCardViewModel.getClass();
                list.getClass();
                list2.getClass();
                this.sellerCard = sellerCardViewModel;
                this.shiftSchedule = shiftScheduleDisplay;
                this.locations = list;
                this.jobs = list2;
                this.shouldSendShiftToken = z;
                this.geofenceReasonText = str;
                this.geofenceSettingsLinkText = str2;
                this.isGeofenceLoading = z2;
                this.isGeofenceAllowed = z3;
                this.showErrorDialog = z4;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ClockedOut)) {
                    return false;
                }
                ClockedOut clockedOut = (ClockedOut) obj;
                return Intrinsics.areEqual(this.sellerCard, clockedOut.sellerCard) && Intrinsics.areEqual(this.shiftSchedule, clockedOut.shiftSchedule) && Intrinsics.areEqual(this.locations, clockedOut.locations) && Intrinsics.areEqual(this.jobs, clockedOut.jobs) && this.shouldSendShiftToken == clockedOut.shouldSendShiftToken && Intrinsics.areEqual(this.geofenceReasonText, clockedOut.geofenceReasonText) && Intrinsics.areEqual(this.geofenceSettingsLinkText, clockedOut.geofenceSettingsLinkText) && this.isGeofenceLoading == clockedOut.isGeofenceLoading && this.isGeofenceAllowed == clockedOut.isGeofenceAllowed && this.showErrorDialog == clockedOut.showErrorDialog;
            }

            public final String getSelectedJobTitle() {
                Object obj;
                Iterator it = this.jobs.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((PickerItem) obj).isSelected) {
                        break;
                    }
                }
                PickerItem pickerItem = (PickerItem) obj;
                if (pickerItem != null) {
                    return pickerItem.name;
                }
                return null;
            }

            @Override // com.squareup.cash.work.viewmodels.ClockInOverlayViewModel
            public final SellerCardViewModel getSellerCard() {
                return this.sellerCard;
            }

            @Override // com.squareup.cash.work.viewmodels.ClockInOverlayViewModel
            public final boolean getShowErrorDialog() {
                return this.showErrorDialog;
            }

            public final int hashCode() {
                int hashCode = this.sellerCard.hashCode() * 31;
                ShiftScheduleDisplay shiftScheduleDisplay = this.shiftSchedule;
                int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m((hashCode + (shiftScheduleDisplay == null ? 0 : shiftScheduleDisplay.text.hashCode())) * 31, 31, this.locations), 31, this.jobs), 31, this.shouldSendShiftToken);
                String str = this.geofenceReasonText;
                int hashCode2 = (m + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.geofenceSettingsLinkText;
                return Boolean.hashCode(this.showErrorDialog) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.isGeofenceLoading), 31, this.isGeofenceAllowed);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("ClockedOut(sellerCard=");
                sb.append(this.sellerCard);
                sb.append(", shiftSchedule=");
                sb.append(this.shiftSchedule);
                sb.append(", locations=");
                Request$Priority$EnumUnboxingLocalUtility.m(sb, this.locations, ", jobs=", this.jobs, ", shouldSendShiftToken=");
                NavAction$$ExternalSyntheticOutline0.m(sb, this.shouldSendShiftToken, ", geofenceReasonText=", this.geofenceReasonText, ", geofenceSettingsLinkText=");
                NavAction$$ExternalSyntheticOutline0.m(sb, this.geofenceSettingsLinkText, ", isGeofenceLoading=", this.isGeofenceLoading, ", isGeofenceAllowed=");
                return Request$Priority$EnumUnboxingLocalUtility.m(sb, this.isGeofenceAllowed, ", showErrorDialog=", this.showErrorDialog, ")");
            }
        }

        public final class ClockedOutSummary implements Loaded {
            public final String cashTipsText;
            public final SellerCardViewModel sellerCard;
            public final boolean showErrorDialog;
            public final String timeText;
            public final ToastState toastState;
            public final String wagesText;

            public ClockedOutSummary(SellerCardViewModel sellerCardViewModel, String str, String str2, String str3, boolean z, ToastState toastState) {
                sellerCardViewModel.getClass();
                str.getClass();
                this.sellerCard = sellerCardViewModel;
                this.wagesText = str;
                this.cashTipsText = str2;
                this.timeText = str3;
                this.showErrorDialog = z;
                this.toastState = toastState;
            }

            public static ClockedOutSummary copy$default(ClockedOutSummary clockedOutSummary, SellerCardViewModel sellerCardViewModel, boolean z, ToastState toastState, int i) {
                if ((i & 1) != 0) {
                    sellerCardViewModel = clockedOutSummary.sellerCard;
                }
                SellerCardViewModel sellerCardViewModel2 = sellerCardViewModel;
                String str = clockedOutSummary.wagesText;
                String str2 = clockedOutSummary.cashTipsText;
                String str3 = clockedOutSummary.timeText;
                if ((i & 32) != 0) {
                    toastState = clockedOutSummary.toastState;
                }
                sellerCardViewModel2.getClass();
                str.getClass();
                str3.getClass();
                return new ClockedOutSummary(sellerCardViewModel2, str, str2, str3, z, toastState);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ClockedOutSummary)) {
                    return false;
                }
                ClockedOutSummary clockedOutSummary = (ClockedOutSummary) obj;
                return Intrinsics.areEqual(this.sellerCard, clockedOutSummary.sellerCard) && Intrinsics.areEqual(this.wagesText, clockedOutSummary.wagesText) && Intrinsics.areEqual(this.cashTipsText, clockedOutSummary.cashTipsText) && Intrinsics.areEqual(this.timeText, clockedOutSummary.timeText) && this.showErrorDialog == clockedOutSummary.showErrorDialog && Intrinsics.areEqual(this.toastState, clockedOutSummary.toastState);
            }

            @Override // com.squareup.cash.work.viewmodels.ClockInOverlayViewModel
            public final SellerCardViewModel getSellerCard() {
                return this.sellerCard;
            }

            @Override // com.squareup.cash.work.viewmodels.ClockInOverlayViewModel
            public final boolean getShowErrorDialog() {
                return this.showErrorDialog;
            }

            @Override // com.squareup.cash.work.viewmodels.ClockInOverlayViewModel
            public final ToastState getToastState() {
                return this.toastState;
            }

            public final int hashCode() {
                int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.sellerCard.hashCode() * 31, 31, this.wagesText);
                String str = this.cashTipsText;
                int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m + (str == null ? 0 : str.hashCode())) * 31, 31, this.timeText), 31, this.showErrorDialog);
                ToastState toastState = this.toastState;
                return m2 + (toastState != null ? toastState.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("ClockedOutSummary(sellerCard=");
                sb.append(this.sellerCard);
                sb.append(", wagesText=");
                sb.append(this.wagesText);
                sb.append(", cashTipsText=");
                Boxes$$ExternalSyntheticOutline1.m(sb, this.cashTipsText, ", timeText=", this.timeText, ", showErrorDialog=");
                sb.append(this.showErrorDialog);
                sb.append(", toastState=");
                sb.append(this.toastState);
                sb.append(")");
                return sb.toString();
            }
        }

        public final class OnBreak implements Loaded {
            public final CurrentTimeMillisProvider$Companion$$ExternalSyntheticLambda0 currentTimeMillisProvider;
            public final long elapsedTimeStartMillis;
            public final Long endBreakEnabledAtMillis;
            public final SellerCardViewModel sellerCard;
            public final boolean showErrorDialog;
            public final ToastState toastState;
            public final String wagesText;

            public OnBreak(SellerCardViewModel sellerCardViewModel, String str, long j, Long l, boolean z, ToastState toastState, CurrentTimeMillisProvider$Companion$$ExternalSyntheticLambda0 currentTimeMillisProvider$Companion$$ExternalSyntheticLambda0) {
                sellerCardViewModel.getClass();
                str.getClass();
                currentTimeMillisProvider$Companion$$ExternalSyntheticLambda0.getClass();
                this.sellerCard = sellerCardViewModel;
                this.wagesText = str;
                this.elapsedTimeStartMillis = j;
                this.endBreakEnabledAtMillis = l;
                this.showErrorDialog = z;
                this.toastState = toastState;
                this.currentTimeMillisProvider = currentTimeMillisProvider$Companion$$ExternalSyntheticLambda0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof OnBreak)) {
                    return false;
                }
                OnBreak onBreak = (OnBreak) obj;
                return Intrinsics.areEqual(this.sellerCard, onBreak.sellerCard) && Intrinsics.areEqual(this.wagesText, onBreak.wagesText) && this.elapsedTimeStartMillis == onBreak.elapsedTimeStartMillis && Intrinsics.areEqual(this.endBreakEnabledAtMillis, onBreak.endBreakEnabledAtMillis) && this.showErrorDialog == onBreak.showErrorDialog && Intrinsics.areEqual(this.toastState, onBreak.toastState) && Intrinsics.areEqual(this.currentTimeMillisProvider, onBreak.currentTimeMillisProvider);
            }

            @Override // com.squareup.cash.work.viewmodels.ClockInOverlayViewModel
            public final SellerCardViewModel getSellerCard() {
                return this.sellerCard;
            }

            @Override // com.squareup.cash.work.viewmodels.ClockInOverlayViewModel
            public final boolean getShowErrorDialog() {
                return this.showErrorDialog;
            }

            @Override // com.squareup.cash.work.viewmodels.ClockInOverlayViewModel
            public final ToastState getToastState() {
                return this.toastState;
            }

            public final int hashCode() {
                int m = Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.sellerCard.hashCode() * 31, 31, this.wagesText), 31, this.elapsedTimeStartMillis);
                Long l = this.endBreakEnabledAtMillis;
                int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m + (l == null ? 0 : l.hashCode())) * 31, 31, this.showErrorDialog);
                ToastState toastState = this.toastState;
                return this.currentTimeMillisProvider.hashCode() + ((m2 + (toastState != null ? toastState.hashCode() : 0)) * 31);
            }

            public final String toString() {
                return "OnBreak(sellerCard=" + this.sellerCard + ", wagesText=" + this.wagesText + ", elapsedTimeStartMillis=" + this.elapsedTimeStartMillis + ", endBreakEnabledAtMillis=" + this.endBreakEnabledAtMillis + ", showErrorDialog=" + this.showErrorDialog + ", toastState=" + this.toastState + ", currentTimeMillisProvider=" + this.currentTimeMillisProvider + ")";
            }
        }
    }

    public final class Loading implements ClockInOverlayViewModel {
        public final SellerCardViewModel sellerCard;

        public Loading(SellerCardViewModel sellerCardViewModel) {
            sellerCardViewModel.getClass();
            this.sellerCard = sellerCardViewModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Loading) && Intrinsics.areEqual(this.sellerCard, ((Loading) obj).sellerCard);
        }

        @Override // com.squareup.cash.work.viewmodels.ClockInOverlayViewModel
        public final SellerCardViewModel getSellerCard() {
            return this.sellerCard;
        }

        public final int hashCode() {
            return this.sellerCard.hashCode();
        }

        public final String toString() {
            return "Loading(sellerCard=" + this.sellerCard + ")";
        }
    }

    public final class PickerItem {
        public final String body;
        public final Object identifier;
        public final boolean isEnabled;
        public final boolean isSelected;
        public final String name;

        public PickerItem(Object obj, String str, boolean z, String str2, boolean z2) {
            str.getClass();
            this.identifier = obj;
            this.name = str;
            this.isSelected = z;
            this.body = str2;
            this.isEnabled = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PickerItem)) {
                return false;
            }
            PickerItem pickerItem = (PickerItem) obj;
            return Intrinsics.areEqual(this.identifier, pickerItem.identifier) && Intrinsics.areEqual(this.name, pickerItem.name) && this.isSelected == pickerItem.isSelected && Intrinsics.areEqual(this.body, pickerItem.body) && this.isEnabled == pickerItem.isEnabled;
        }

        public final int hashCode() {
            Object obj = this.identifier;
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((obj == null ? 0 : obj.hashCode()) * 31, 31, this.name), 31, this.isSelected);
            String str = this.body;
            return Boolean.hashCode(this.isEnabled) + ((m + (str != null ? str.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PickerItem(identifier=");
            sb.append(this.identifier);
            sb.append(", name=");
            sb.append(this.name);
            sb.append(", isSelected=");
            NavAction$$ExternalSyntheticOutline0.m(sb, this.isSelected, ", body=", this.body, ", isEnabled=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.isEnabled, ")");
        }
    }

    public final class ShiftScheduleDisplay {
        public final String text;

        public ShiftScheduleDisplay(String str) {
            this.text = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShiftScheduleDisplay) && this.text.equals(((ShiftScheduleDisplay) obj).text);
        }

        public final int hashCode() {
            return this.text.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ShiftScheduleDisplay(text=", this.text, ")");
        }
    }

    SellerCardViewModel getSellerCard();

    default boolean getShowErrorDialog() {
        return false;
    }

    default ToastState getToastState() {
        return null;
    }
}
