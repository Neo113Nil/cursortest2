package com.squareup.cash.transfers.viewmodels;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.instruments.viewmodels.InstrumentCellViewModel;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public interface BalanceBasedAutoReloadConfirmationViewModel {

    public final class Content implements BalanceBasedAutoReloadConfirmationViewModel {
        public final String buttonLabel;
        public final FundingSource fundingSource;
        public final Preference incrementAmount;
        public final InstrumentCellViewModel instrumentCellViewModel;
        public final Preference minimumBalance;
        public final String subtitle;
        public final String title;

        public final class FundingSource {
            public final String header;
            public final String subtitle;
            public final String title;

            public FundingSource(String str, String str2, String str3) {
                str.getClass();
                str2.getClass();
                this.header = str;
                this.title = str2;
                this.subtitle = str3;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof FundingSource)) {
                    return false;
                }
                FundingSource fundingSource = (FundingSource) obj;
                return Intrinsics.areEqual(this.header, fundingSource.header) && Intrinsics.areEqual(this.title, fundingSource.title) && Intrinsics.areEqual(this.subtitle, fundingSource.subtitle);
            }

            public final int hashCode() {
                int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.header.hashCode() * 31, 31, this.title);
                String str = this.subtitle;
                return m + (str == null ? 0 : str.hashCode());
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("FundingSource(header=", this.header, ", title=", this.title, ", subtitle="), this.subtitle, ")");
            }
        }

        public final class Preference {
            public final String amount;
            public final String title;

            public Preference(String str, String str2) {
                str.getClass();
                str2.getClass();
                this.title = str;
                this.amount = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Preference)) {
                    return false;
                }
                Preference preference = (Preference) obj;
                return Intrinsics.areEqual(this.title, preference.title) && Intrinsics.areEqual(this.amount, preference.amount);
            }

            public final int hashCode() {
                return this.amount.hashCode() + (this.title.hashCode() * 31);
            }

            public final String toString() {
                return Boxes$$ExternalSyntheticOutline1.m("Preference(title=", this.title, ", amount=", this.amount, ")");
            }
        }

        public Content(String str, String str2, Preference preference, Preference preference2, FundingSource fundingSource, InstrumentCellViewModel instrumentCellViewModel, String str3) {
            re$$ExternalSyntheticOutline0.m1432m(str, str2, str3);
            this.title = str;
            this.subtitle = str2;
            this.minimumBalance = preference;
            this.incrementAmount = preference2;
            this.fundingSource = fundingSource;
            this.instrumentCellViewModel = instrumentCellViewModel;
            this.buttonLabel = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Content)) {
                return false;
            }
            Content content = (Content) obj;
            return Intrinsics.areEqual(this.title, content.title) && Intrinsics.areEqual(this.subtitle, content.subtitle) && this.minimumBalance.equals(content.minimumBalance) && this.incrementAmount.equals(content.incrementAmount) && this.fundingSource.equals(content.fundingSource) && Intrinsics.areEqual(this.instrumentCellViewModel, content.instrumentCellViewModel) && Intrinsics.areEqual(this.buttonLabel, content.buttonLabel);
        }

        public final int hashCode() {
            int hashCode = (this.fundingSource.hashCode() + ((this.incrementAmount.hashCode() + ((this.minimumBalance.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.subtitle)) * 31)) * 31)) * 31;
            InstrumentCellViewModel instrumentCellViewModel = this.instrumentCellViewModel;
            return this.buttonLabel.hashCode() + ((hashCode + (instrumentCellViewModel == null ? 0 : instrumentCellViewModel.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Content(title=", this.title, ", subtitle=", this.subtitle, ", minimumBalance=");
            m.append(this.minimumBalance);
            m.append(", incrementAmount=");
            m.append(this.incrementAmount);
            m.append(", fundingSource=");
            m.append(this.fundingSource);
            m.append(", instrumentCellViewModel=");
            m.append(this.instrumentCellViewModel);
            m.append(", buttonLabel=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.buttonLabel, ")");
        }
    }

    public final class Loading implements BalanceBasedAutoReloadConfirmationViewModel {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return 630996343;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
