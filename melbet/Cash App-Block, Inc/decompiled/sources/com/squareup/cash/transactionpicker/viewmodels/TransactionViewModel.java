package com.squareup.cash.transactionpicker.viewmodels;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.ui.widget.StackedAvatarViewModel;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class TransactionViewModel {
    public final String accessibilityLabel;
    public final StackedAvatarViewModel.Avatar avatarViewModel;
    public final long id;
    public final String subtitle;
    public final String title;
    public final String token;

    public TransactionViewModel(long j, String str, String str2, String str3, String str4, StackedAvatarViewModel.Avatar avatar) {
        this.id = j;
        this.token = str;
        this.title = str2;
        this.subtitle = str3;
        this.accessibilityLabel = str4;
        this.avatarViewModel = avatar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransactionViewModel)) {
            return false;
        }
        TransactionViewModel transactionViewModel = (TransactionViewModel) obj;
        return this.id == transactionViewModel.id && this.token.equals(transactionViewModel.token) && Intrinsics.areEqual(this.title, transactionViewModel.title) && Intrinsics.areEqual(this.subtitle, transactionViewModel.subtitle) && Intrinsics.areEqual(this.accessibilityLabel, transactionViewModel.accessibilityLabel) && this.avatarViewModel.equals(transactionViewModel.avatarViewModel);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Long.hashCode(this.id) * 31, 31, this.token);
        String str = this.title;
        int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.subtitle;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.accessibilityLabel;
        return this.avatarViewModel.hashCode() + ((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder m = re$$ExternalSyntheticOutline0.m("TransactionViewModel(id=", this.id, ", token=", this.token);
        Boxes$$ExternalSyntheticOutline1.m(m, ", title=", this.title, ", subtitle=", this.subtitle);
        m.append(", accessibilityLabel=");
        m.append(this.accessibilityLabel);
        m.append(", avatarViewModel=");
        m.append(this.avatarViewModel);
        m.append(")");
        return m.toString();
    }
}
