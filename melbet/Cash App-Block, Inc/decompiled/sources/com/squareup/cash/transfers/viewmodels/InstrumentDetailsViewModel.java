package com.squareup.cash.transfers.viewmodels;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.instruments.viewmodels.InstrumentIcon;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class InstrumentDetailsViewModel {
    public final String cardInfoLabel;
    public final String cardNameLabel;
    public final DefaultState defaultState;
    public final String displayNameCompact;
    public final boolean enableHeroImage;
    public final InstrumentIcon instrumentIcon;
    public final String instrumentToken;
    public final String removeCtaLabel;
    public final String replaceCtaLabel;
    public final String subtitle;
    public final String title;

    public interface DefaultState {

        public final class Invalid implements DefaultState {
            public static final Invalid INSTANCE = new Invalid();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Invalid);
            }

            @Override // com.squareup.cash.transfers.viewmodels.InstrumentDetailsViewModel.DefaultState
            public final String getSubtitle() {
                return null;
            }

            @Override // com.squareup.cash.transfers.viewmodels.InstrumentDetailsViewModel.DefaultState
            public final String getTitle() {
                return null;
            }

            public final int hashCode() {
                return -1007026505;
            }

            public final String toString() {
                return "Invalid";
            }
        }

        public final class NotSet implements DefaultState {
            public final String setDefaultButtonLabel;
            public final String subtitle;
            public final String title;

            public NotSet(String str, String str2, String str3) {
                str3.getClass();
                this.title = str;
                this.subtitle = str2;
                this.setDefaultButtonLabel = str3;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof NotSet)) {
                    return false;
                }
                NotSet notSet = (NotSet) obj;
                return Intrinsics.areEqual(this.title, notSet.title) && Intrinsics.areEqual(this.subtitle, notSet.subtitle) && Intrinsics.areEqual(this.setDefaultButtonLabel, notSet.setDefaultButtonLabel);
            }

            @Override // com.squareup.cash.transfers.viewmodels.InstrumentDetailsViewModel.DefaultState
            public final String getSubtitle() {
                return this.subtitle;
            }

            @Override // com.squareup.cash.transfers.viewmodels.InstrumentDetailsViewModel.DefaultState
            public final String getTitle() {
                return this.title;
            }

            public final int hashCode() {
                String str = this.title;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.subtitle;
                return this.setDefaultButtonLabel.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("NotSet(title=", this.title, ", subtitle=", this.subtitle, ", setDefaultButtonLabel="), this.setDefaultButtonLabel, ")");
            }
        }

        public final class Set implements DefaultState {
            public final String subtitle;
            public final String title;

            public Set(String str, String str2) {
                this.title = str;
                this.subtitle = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Set)) {
                    return false;
                }
                Set set = (Set) obj;
                return Intrinsics.areEqual(this.title, set.title) && Intrinsics.areEqual(this.subtitle, set.subtitle);
            }

            @Override // com.squareup.cash.transfers.viewmodels.InstrumentDetailsViewModel.DefaultState
            public final String getSubtitle() {
                return this.subtitle;
            }

            @Override // com.squareup.cash.transfers.viewmodels.InstrumentDetailsViewModel.DefaultState
            public final String getTitle() {
                return this.title;
            }

            public final int hashCode() {
                String str = this.title;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.subtitle;
                return hashCode + (str2 != null ? str2.hashCode() : 0);
            }

            public final String toString() {
                return Boxes$$ExternalSyntheticOutline1.m("Set(title=", this.title, ", subtitle=", this.subtitle, ")");
            }
        }

        String getSubtitle();

        String getTitle();
    }

    public InstrumentDetailsViewModel(String str, String str2, String str3, String str4, InstrumentIcon instrumentIcon, String str5, String str6, DefaultState defaultState, boolean z, String str7, String str8) {
        re$$ExternalSyntheticOutline0.m1432m(str, str5, str6);
        this.instrumentToken = str;
        this.title = str2;
        this.displayNameCompact = str3;
        this.subtitle = str4;
        this.instrumentIcon = instrumentIcon;
        this.removeCtaLabel = str5;
        this.replaceCtaLabel = str6;
        this.defaultState = defaultState;
        this.enableHeroImage = z;
        this.cardInfoLabel = str7;
        this.cardNameLabel = str8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InstrumentDetailsViewModel)) {
            return false;
        }
        InstrumentDetailsViewModel instrumentDetailsViewModel = (InstrumentDetailsViewModel) obj;
        return Intrinsics.areEqual(this.instrumentToken, instrumentDetailsViewModel.instrumentToken) && Intrinsics.areEqual(this.title, instrumentDetailsViewModel.title) && Intrinsics.areEqual(this.displayNameCompact, instrumentDetailsViewModel.displayNameCompact) && Intrinsics.areEqual(this.subtitle, instrumentDetailsViewModel.subtitle) && Intrinsics.areEqual(this.instrumentIcon, instrumentDetailsViewModel.instrumentIcon) && Intrinsics.areEqual(this.removeCtaLabel, instrumentDetailsViewModel.removeCtaLabel) && Intrinsics.areEqual(this.replaceCtaLabel, instrumentDetailsViewModel.replaceCtaLabel) && this.defaultState.equals(instrumentDetailsViewModel.defaultState) && this.enableHeroImage == instrumentDetailsViewModel.enableHeroImage && Intrinsics.areEqual(this.cardInfoLabel, instrumentDetailsViewModel.cardInfoLabel) && Intrinsics.areEqual(this.cardNameLabel, instrumentDetailsViewModel.cardNameLabel);
    }

    public final int hashCode() {
        int hashCode = this.instrumentToken.hashCode() * 31;
        String str = this.title;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.displayNameCompact;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.subtitle;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        InstrumentIcon instrumentIcon = this.instrumentIcon;
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.defaultState.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode4 + (instrumentIcon == null ? 0 : instrumentIcon.hashCode())) * 31, 31, this.removeCtaLabel), 31, this.replaceCtaLabel)) * 31, 31, this.enableHeroImage);
        String str4 = this.cardInfoLabel;
        int hashCode5 = (m + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.cardNameLabel;
        return hashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("InstrumentDetailsViewModel(instrumentToken=", this.instrumentToken, ", title=", this.title, ", displayNameCompact=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.displayNameCompact, ", subtitle=", this.subtitle, ", instrumentIcon=");
        m.append(this.instrumentIcon);
        m.append(", removeCtaLabel=");
        m.append(this.removeCtaLabel);
        m.append(", replaceCtaLabel=");
        m.append(this.replaceCtaLabel);
        m.append(", defaultState=");
        m.append(this.defaultState);
        m.append(", enableHeroImage=");
        NavAction$$ExternalSyntheticOutline0.m(m, this.enableHeroImage, ", cardInfoLabel=", this.cardInfoLabel, ", cardNameLabel=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.cardNameLabel, ")");
    }
}
