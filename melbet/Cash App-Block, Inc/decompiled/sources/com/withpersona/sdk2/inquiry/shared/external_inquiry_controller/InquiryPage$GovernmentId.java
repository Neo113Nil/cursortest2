package com.withpersona.sdk2.inquiry.shared.external_inquiry_controller;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.google.android.play.core.splitcompat.zzd;
import com.withpersona.sdk2.inquiry.shared.external_inquiry_controller.GovernmentIdPage;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public final class InquiryPage$GovernmentId extends zzd {
    public final String stepName;
    public final GovernmentIdPage subPage;

    public InquiryPage$GovernmentId(String str, GovernmentIdPage governmentIdPage) {
        str.getClass();
        this.stepName = str;
        this.subPage = governmentIdPage;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InquiryPage$GovernmentId)) {
            return false;
        }
        InquiryPage$GovernmentId inquiryPage$GovernmentId = (InquiryPage$GovernmentId) obj;
        return Intrinsics.areEqual(this.stepName, inquiryPage$GovernmentId.stepName) && this.subPage.equals(inquiryPage$GovernmentId.subPage);
    }

    @Override // com.google.android.play.core.splitcompat.zzd
    public final String getStepName() {
        return this.stepName;
    }

    public final int hashCode() {
        return this.subPage.hashCode() + (this.stepName.hashCode() * 31);
    }

    public final String toString() {
        String m;
        GovernmentIdPage.AutoClassificationFailure autoClassificationFailure = GovernmentIdPage.AutoClassificationFailure.INSTANCE;
        GovernmentIdPage governmentIdPage = this.subPage;
        if (governmentIdPage.equals(autoClassificationFailure)) {
            m = "autoclassification-failure";
        } else if (governmentIdPage.equals(GovernmentIdPage.AutoClassificationSelect.INSTANCE)) {
            m = "autoclassification-select";
        } else if (governmentIdPage.equals(GovernmentIdPage.Select.INSTANCE)) {
            m = "select";
        } else if (governmentIdPage.equals(GovernmentIdPage.Pending.INSTANCE)) {
            m = "pending";
        } else if (governmentIdPage instanceof GovernmentIdPage.Check) {
            m = Boxes$$ExternalSyntheticOutline1.m(((GovernmentIdPage.Check) governmentIdPage).pageIndex, "/check");
        } else if (governmentIdPage instanceof GovernmentIdPage.CheckUpload) {
            m = Boxes$$ExternalSyntheticOutline1.m(((GovernmentIdPage.CheckUpload) governmentIdPage).pageIndex, "/check-upload");
        } else if (governmentIdPage instanceof GovernmentIdPage.Prompt) {
            m = Boxes$$ExternalSyntheticOutline1.m(((GovernmentIdPage.Prompt) governmentIdPage).pageIndex, "/prompt");
        } else {
            if (!(governmentIdPage instanceof GovernmentIdPage.TakePhoto)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            m = Boxes$$ExternalSyntheticOutline1.m(((GovernmentIdPage.TakePhoto) governmentIdPage).pageIndex, "/capture");
        }
        return "/inquiry/government-id/".concat(m);
    }
}
