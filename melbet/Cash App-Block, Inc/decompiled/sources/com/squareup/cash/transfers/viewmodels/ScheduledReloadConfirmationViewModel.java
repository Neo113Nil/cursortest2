package com.squareup.cash.transfers.viewmodels;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.instruments.viewmodels.InstrumentCellViewModel;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public interface ScheduledReloadConfirmationViewModel {

    public final class Content implements ScheduledReloadConfirmationViewModel {
        public final String amountLabel;
        public final String amountValue;
        public final boolean buttonEnabled;
        public final String buttonLabel;
        public final String dayLabel;
        public final String dayValue;
        public final String frequencyLabel;
        public final String frequencyValue;
        public final InstrumentCellViewModel instrumentCellViewModel;
        public final boolean showDay;
        public final String title;

        public Content(String str, String str2, String str3, String str4, String str5, boolean z, String str6, String str7, InstrumentCellViewModel instrumentCellViewModel, String str8, boolean z2) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, str2, str4, str6, str8);
            this.title = str;
            this.frequencyLabel = str2;
            this.frequencyValue = str3;
            this.dayLabel = str4;
            this.dayValue = str5;
            this.showDay = z;
            this.amountLabel = str6;
            this.amountValue = str7;
            this.instrumentCellViewModel = instrumentCellViewModel;
            this.buttonLabel = str8;
            this.buttonEnabled = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Content)) {
                return false;
            }
            Content content = (Content) obj;
            return Intrinsics.areEqual(this.title, content.title) && Intrinsics.areEqual(this.frequencyLabel, content.frequencyLabel) && Intrinsics.areEqual(this.frequencyValue, content.frequencyValue) && Intrinsics.areEqual(this.dayLabel, content.dayLabel) && Intrinsics.areEqual(this.dayValue, content.dayValue) && this.showDay == content.showDay && Intrinsics.areEqual(this.amountLabel, content.amountLabel) && Intrinsics.areEqual(this.amountValue, content.amountValue) && Intrinsics.areEqual(this.instrumentCellViewModel, content.instrumentCellViewModel) && Intrinsics.areEqual(this.buttonLabel, content.buttonLabel) && this.buttonEnabled == content.buttonEnabled;
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.frequencyLabel);
            String str = this.frequencyValue;
            int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m + (str == null ? 0 : str.hashCode())) * 31, 31, this.dayLabel);
            String str2 = this.dayValue;
            int m3 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.showDay), 31, this.amountLabel);
            String str3 = this.amountValue;
            int hashCode = (m3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            InstrumentCellViewModel instrumentCellViewModel = this.instrumentCellViewModel;
            return Boolean.hashCode(this.buttonEnabled) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (instrumentCellViewModel != null ? instrumentCellViewModel.hashCode() : 0)) * 31, 31, this.buttonLabel);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Content(title=", this.title, ", frequencyLabel=", this.frequencyLabel, ", frequencyValue=");
            Boxes$$ExternalSyntheticOutline1.m(m, this.frequencyValue, ", dayLabel=", this.dayLabel, ", dayValue=");
            NavAction$$ExternalSyntheticOutline0.m(m, this.dayValue, ", showDay=", this.showDay, ", amountLabel=");
            Boxes$$ExternalSyntheticOutline1.m(m, this.amountLabel, ", amountValue=", this.amountValue, ", instrumentCellViewModel=");
            m.append(this.instrumentCellViewModel);
            m.append(", buttonLabel=");
            m.append(this.buttonLabel);
            m.append(", buttonEnabled=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.buttonEnabled, ")");
        }
    }

    public final class Loading implements ScheduledReloadConfirmationViewModel {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return 1266317854;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
