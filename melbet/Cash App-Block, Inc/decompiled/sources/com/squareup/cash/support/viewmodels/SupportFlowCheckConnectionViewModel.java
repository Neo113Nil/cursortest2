package com.squareup.cash.support.viewmodels;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class SupportFlowCheckConnectionViewModel {
    public final String message;
    public final String title;

    public SupportFlowCheckConnectionViewModel(String str, String str2) {
        this.title = str;
        this.message = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SupportFlowCheckConnectionViewModel)) {
            return false;
        }
        SupportFlowCheckConnectionViewModel supportFlowCheckConnectionViewModel = (SupportFlowCheckConnectionViewModel) obj;
        return Intrinsics.areEqual(this.title, supportFlowCheckConnectionViewModel.title) && Intrinsics.areEqual(this.message, supportFlowCheckConnectionViewModel.message);
    }

    public final int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.message;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("SupportFlowCheckConnectionViewModel(title=", this.title, ", message=", this.message, ")");
    }
}
