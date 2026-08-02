package com.squareup.cash.work.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes7.dex */
public final class ShiftNotStartedDialogViewModel {
    public final String bodyText;

    public ShiftNotStartedDialogViewModel(String str) {
        this.bodyText = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ShiftNotStartedDialogViewModel) && this.bodyText.equals(((ShiftNotStartedDialogViewModel) obj).bodyText);
    }

    public final int hashCode() {
        return this.bodyText.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ShiftNotStartedDialogViewModel(bodyText=", this.bodyText, ")");
    }
}
