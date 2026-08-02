package com.withpersona.sdk2.inquiry.shared.external_inquiry_controller;

import com.google.android.play.core.splitcompat.zzd;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public final class InquiryPage$Ui extends zzd {
    public final String stepName;

    public InquiryPage$Ui(String str) {
        str.getClass();
        this.stepName = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InquiryPage$Ui) && Intrinsics.areEqual(this.stepName, ((InquiryPage$Ui) obj).stepName);
    }

    @Override // com.google.android.play.core.splitcompat.zzd
    public final String getStepName() {
        return this.stepName;
    }

    public final int hashCode() {
        return this.stepName.hashCode();
    }

    public final String toString() {
        return "/inquiry/ui";
    }
}
