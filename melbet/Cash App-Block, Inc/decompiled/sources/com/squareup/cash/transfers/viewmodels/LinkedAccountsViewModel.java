package com.squareup.cash.transfers.viewmodels;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.cash.instruments.viewmodels.InstrumentCellViewModel;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public interface LinkedAccountsViewModel {

    public final class Loading implements LinkedAccountsViewModel {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return 421553612;
        }

        public final String toString() {
            return "Loading";
        }
    }

    public final class Ready implements LinkedAccountsViewModel {
        public final List instrumentSections;
        public final String linkAccountButtonLabel;

        public final class InstrumentSection {
            public final List instrumentRows;
            public final String title;
            public final boolean useStackedCardLayout;

            public final class InstrumentRow {
                public final InstrumentCellViewModel instrumentCellViewModel;
                public final LinkedAccountsViewEvent linkedAccountsViewEvent;

                public InstrumentRow(InstrumentCellViewModel instrumentCellViewModel, LinkedAccountsViewEvent linkedAccountsViewEvent) {
                    this.instrumentCellViewModel = instrumentCellViewModel;
                    this.linkedAccountsViewEvent = linkedAccountsViewEvent;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof InstrumentRow)) {
                        return false;
                    }
                    InstrumentRow instrumentRow = (InstrumentRow) obj;
                    return this.instrumentCellViewModel.equals(instrumentRow.instrumentCellViewModel) && this.linkedAccountsViewEvent.equals(instrumentRow.linkedAccountsViewEvent);
                }

                public final int hashCode() {
                    return this.linkedAccountsViewEvent.hashCode() + (this.instrumentCellViewModel.hashCode() * 31);
                }

                public final String toString() {
                    return "InstrumentRow(instrumentCellViewModel=" + this.instrumentCellViewModel + ", linkedAccountsViewEvent=" + this.linkedAccountsViewEvent + ")";
                }
            }

            public InstrumentSection(String str, List list, boolean z) {
                list.getClass();
                this.title = str;
                this.instrumentRows = list;
                this.useStackedCardLayout = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof InstrumentSection)) {
                    return false;
                }
                InstrumentSection instrumentSection = (InstrumentSection) obj;
                return Intrinsics.areEqual(this.title, instrumentSection.title) && Intrinsics.areEqual(this.instrumentRows, instrumentSection.instrumentRows) && this.useStackedCardLayout == instrumentSection.useStackedCardLayout;
            }

            public final int hashCode() {
                String str = this.title;
                return Boolean.hashCode(this.useStackedCardLayout) + Recorder$$ExternalSyntheticOutline2.m((str == null ? 0 : str.hashCode()) * 31, 31, this.instrumentRows);
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(NavAction$$ExternalSyntheticOutline0.m("InstrumentSection(title=", this.title, ", instrumentRows=", ", useStackedCardLayout=", this.instrumentRows), this.useStackedCardLayout, ")");
            }
        }

        public Ready(List list, String str) {
            list.getClass();
            this.instrumentSections = list;
            this.linkAccountButtonLabel = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Ready)) {
                return false;
            }
            Ready ready = (Ready) obj;
            return Intrinsics.areEqual(this.instrumentSections, ready.instrumentSections) && Intrinsics.areEqual(this.linkAccountButtonLabel, ready.linkAccountButtonLabel);
        }

        public final int hashCode() {
            int hashCode = this.instrumentSections.hashCode() * 31;
            String str = this.linkAccountButtonLabel;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return "Ready(instrumentSections=" + this.instrumentSections + ", linkAccountButtonLabel=" + this.linkAccountButtonLabel + ")";
        }
    }
}
