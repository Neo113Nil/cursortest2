package com.squareup.cash.support.viewmodels;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class ContactSupportEmailMessageViewModel$Editing {
    public final boolean continueButtonEnabled;
    public final boolean isSubmitting;
    public final boolean showMinimumCharactersNotMetMessage;
    public final StatusResult statusResult;

    public final class StatusResult {
        public final String body;
        public final String title;

        public StatusResult(String str, String str2) {
            str.getClass();
            this.title = str;
            this.body = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StatusResult)) {
                return false;
            }
            StatusResult statusResult = (StatusResult) obj;
            return Intrinsics.areEqual(this.title, statusResult.title) && Intrinsics.areEqual(this.body, statusResult.body);
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Boolean.hashCode(false) * 31, 31, this.title);
            String str = this.body;
            return m + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m("StatusResult(isSuccess=false, title=", this.title, ", body=", this.body, ")");
        }
    }

    public ContactSupportEmailMessageViewModel$Editing(boolean z, boolean z2, boolean z3, StatusResult statusResult) {
        this.continueButtonEnabled = z;
        this.showMinimumCharactersNotMetMessage = z2;
        this.isSubmitting = z3;
        this.statusResult = statusResult;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContactSupportEmailMessageViewModel$Editing)) {
            return false;
        }
        ContactSupportEmailMessageViewModel$Editing contactSupportEmailMessageViewModel$Editing = (ContactSupportEmailMessageViewModel$Editing) obj;
        return this.continueButtonEnabled == contactSupportEmailMessageViewModel$Editing.continueButtonEnabled && this.showMinimumCharactersNotMetMessage == contactSupportEmailMessageViewModel$Editing.showMinimumCharactersNotMetMessage && this.isSubmitting == contactSupportEmailMessageViewModel$Editing.isSubmitting && Intrinsics.areEqual(this.statusResult, contactSupportEmailMessageViewModel$Editing.statusResult);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Boolean.hashCode(this.continueButtonEnabled) * 31, 31, this.showMinimumCharactersNotMetMessage), 31, this.isSubmitting);
        StatusResult statusResult = this.statusResult;
        return m + (statusResult == null ? 0 : statusResult.hashCode());
    }

    public final String toString() {
        StringBuilder m = NavAction$$ExternalSyntheticOutline0.m("Editing(continueButtonEnabled=", ", showMinimumCharactersNotMetMessage=", ", isSubmitting=", this.continueButtonEnabled, this.showMinimumCharactersNotMetMessage);
        m.append(this.isSubmitting);
        m.append(", statusResult=");
        m.append(this.statusResult);
        m.append(")");
        return m.toString();
    }
}
