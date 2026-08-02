package com.squareup.cash.transfers.viewmodels;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class LinkedAccountsNuxViewModel {
    public final String ctaLabel;
    public final String heroText;
    public final List infoItems;

    public final class InfoItem {
        public final String icon;
        public final String label;

        public InfoItem(String str, String str2) {
            str.getClass();
            this.label = str;
            this.icon = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InfoItem)) {
                return false;
            }
            InfoItem infoItem = (InfoItem) obj;
            return Intrinsics.areEqual(this.label, infoItem.label) && this.icon.equals(infoItem.icon);
        }

        public final int hashCode() {
            return this.icon.hashCode() + (this.label.hashCode() * 31);
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m("InfoItem(label=", this.label, ", icon=", this.icon, ")");
        }
    }

    public LinkedAccountsNuxViewModel(String str, String str2, List list) {
        str.getClass();
        list.getClass();
        str2.getClass();
        this.heroText = str;
        this.infoItems = list;
        this.ctaLabel = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LinkedAccountsNuxViewModel)) {
            return false;
        }
        LinkedAccountsNuxViewModel linkedAccountsNuxViewModel = (LinkedAccountsNuxViewModel) obj;
        return Intrinsics.areEqual(this.heroText, linkedAccountsNuxViewModel.heroText) && Intrinsics.areEqual(this.infoItems, linkedAccountsNuxViewModel.infoItems) && Intrinsics.areEqual(this.ctaLabel, linkedAccountsNuxViewModel.ctaLabel);
    }

    public final int hashCode() {
        return this.ctaLabel.hashCode() + Recorder$$ExternalSyntheticOutline2.m(this.heroText.hashCode() * 31, 31, this.infoItems);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(NavAction$$ExternalSyntheticOutline0.m("LinkedAccountsNuxViewModel(heroText=", this.heroText, ", infoItems=", ", ctaLabel=", this.infoItems), this.ctaLabel, ")");
    }
}
