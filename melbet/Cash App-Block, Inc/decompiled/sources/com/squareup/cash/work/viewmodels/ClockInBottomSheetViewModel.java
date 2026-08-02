package com.squareup.cash.work.viewmodels;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.re$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.work.identifiers.JobIdentifier;
import com.squareup.cash.work.identifiers.LocationIdentifier;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class ClockInBottomSheetViewModel {
    public final boolean isClockInButtonEnabled;
    public final boolean isClockInButtonLoading;
    public final List jobs;
    public final List locations;
    public final ReasonAction reasonAction;
    public final String reasonText;
    public final String shiftDateTimeText;
    public final boolean shouldSendShiftToken;
    public final String title;
    public final ToastState toastState;

    public final class JobItem {
        public final JobIdentifier identifier;
        public final boolean isScheduled;
        public final boolean isSelected;
        public final String title;

        public JobItem(JobIdentifier jobIdentifier, String str, boolean z, boolean z2) {
            str.getClass();
            this.identifier = jobIdentifier;
            this.title = str;
            this.isSelected = z;
            this.isScheduled = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof JobItem)) {
                return false;
            }
            JobItem jobItem = (JobItem) obj;
            return this.identifier.equals(jobItem.identifier) && Intrinsics.areEqual(this.title, jobItem.title) && this.isSelected == jobItem.isSelected && this.isScheduled == jobItem.isScheduled;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.isScheduled) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.identifier.token.hashCode() * 31, 31, this.title), 31, this.isSelected);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("JobItem(identifier=");
            sb.append(this.identifier);
            sb.append(", title=");
            sb.append(this.title);
            sb.append(", isSelected=");
            return Request$Priority$EnumUnboxingLocalUtility.m(sb, this.isSelected, ", isScheduled=", this.isScheduled, ")");
        }
    }

    public final class LocationItem {
        public final LocationIdentifier identifier;
        public final boolean isScheduled;
        public final boolean isSelected;
        public final String name;

        public LocationItem(LocationIdentifier locationIdentifier, String str, boolean z, boolean z2) {
            str.getClass();
            this.identifier = locationIdentifier;
            this.name = str;
            this.isSelected = z;
            this.isScheduled = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LocationItem)) {
                return false;
            }
            LocationItem locationItem = (LocationItem) obj;
            return this.identifier.equals(locationItem.identifier) && Intrinsics.areEqual(this.name, locationItem.name) && this.isSelected == locationItem.isSelected && this.isScheduled == locationItem.isScheduled;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.isScheduled) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.identifier.token.hashCode() * 31, 31, this.name), 31, this.isSelected);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("LocationItem(identifier=");
            sb.append(this.identifier);
            sb.append(", name=");
            sb.append(this.name);
            sb.append(", isSelected=");
            return Request$Priority$EnumUnboxingLocalUtility.m(sb, this.isSelected, ", isScheduled=", this.isScheduled, ")");
        }
    }

    public interface ReasonAction {

        public final class OpenSettings implements ReasonAction {
            public final String text;

            public OpenSettings(String str) {
                str.getClass();
                this.text = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof OpenSettings) && Intrinsics.areEqual(this.text, ((OpenSettings) obj).text);
            }

            @Override // com.squareup.cash.work.viewmodels.ClockInBottomSheetViewModel.ReasonAction
            public final String getText() {
                return this.text;
            }

            public final int hashCode() {
                return this.text.hashCode();
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("OpenSettings(text=", this.text, ")");
            }
        }

        public final class RequestLocationPermission implements ReasonAction {
            public final String text;

            public RequestLocationPermission(String str) {
                str.getClass();
                this.text = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof RequestLocationPermission) && Intrinsics.areEqual(this.text, ((RequestLocationPermission) obj).text);
            }

            @Override // com.squareup.cash.work.viewmodels.ClockInBottomSheetViewModel.ReasonAction
            public final String getText() {
                return this.text;
            }

            public final int hashCode() {
                return this.text.hashCode();
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("RequestLocationPermission(text=", this.text, ")");
            }
        }

        String getText();
    }

    public ClockInBottomSheetViewModel(String str, String str2, List list, List list2, String str3, ReasonAction reasonAction, boolean z, boolean z2, ToastState toastState, boolean z3) {
        list.getClass();
        list2.getClass();
        this.title = str;
        this.shiftDateTimeText = str2;
        this.jobs = list;
        this.locations = list2;
        this.reasonText = str3;
        this.reasonAction = reasonAction;
        this.isClockInButtonLoading = z;
        this.isClockInButtonEnabled = z2;
        this.toastState = toastState;
        this.shouldSendShiftToken = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClockInBottomSheetViewModel)) {
            return false;
        }
        ClockInBottomSheetViewModel clockInBottomSheetViewModel = (ClockInBottomSheetViewModel) obj;
        return Intrinsics.areEqual(this.title, clockInBottomSheetViewModel.title) && Intrinsics.areEqual(this.shiftDateTimeText, clockInBottomSheetViewModel.shiftDateTimeText) && Intrinsics.areEqual(this.jobs, clockInBottomSheetViewModel.jobs) && Intrinsics.areEqual(this.locations, clockInBottomSheetViewModel.locations) && Intrinsics.areEqual(this.reasonText, clockInBottomSheetViewModel.reasonText) && Intrinsics.areEqual(this.reasonAction, clockInBottomSheetViewModel.reasonAction) && this.isClockInButtonLoading == clockInBottomSheetViewModel.isClockInButtonLoading && this.isClockInButtonEnabled == clockInBottomSheetViewModel.isClockInButtonEnabled && Intrinsics.areEqual(this.toastState, clockInBottomSheetViewModel.toastState) && this.shouldSendShiftToken == clockInBottomSheetViewModel.shouldSendShiftToken;
    }

    public final int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        String str = this.shiftDateTimeText;
        int m = Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.jobs), 31, this.locations);
        String str2 = this.reasonText;
        int hashCode2 = (m + (str2 == null ? 0 : str2.hashCode())) * 31;
        ReasonAction reasonAction = this.reasonAction;
        int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode2 + (reasonAction == null ? 0 : reasonAction.hashCode())) * 31, 31, this.isClockInButtonLoading), 31, this.isClockInButtonEnabled);
        ToastState toastState = this.toastState;
        return Boolean.hashCode(this.shouldSendShiftToken) + ((m2 + (toastState != null ? toastState.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ClockInBottomSheetViewModel(title=", this.title, ", shiftDateTimeText=", this.shiftDateTimeText, ", jobs=");
        Request$Priority$EnumUnboxingLocalUtility.m(m, this.jobs, ", locations=", this.locations, ", reasonText=");
        m.append(this.reasonText);
        m.append(", reasonAction=");
        m.append(this.reasonAction);
        m.append(", isClockInButtonLoading=");
        re$$ExternalSyntheticOutline0.m(m, this.isClockInButtonLoading, ", isClockInButtonEnabled=", this.isClockInButtonEnabled, ", toastState=");
        m.append(this.toastState);
        m.append(", shouldSendShiftToken=");
        m.append(this.shouldSendShiftToken);
        m.append(")");
        return m.toString();
    }
}
