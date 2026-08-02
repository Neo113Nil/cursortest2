package com.withpersona.sdk2.inquiry.shared.external_inquiry_controller;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.google.android.play.core.splitcompat.zzd;
import com.withpersona.sdk2.inquiry.shared.external_inquiry_controller.SelfiePage;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public final class InquiryPage$Selfie extends zzd {
    public final String stepName;
    public final SelfiePage subPage;

    public InquiryPage$Selfie(String str, SelfiePage selfiePage) {
        str.getClass();
        selfiePage.getClass();
        this.stepName = str;
        this.subPage = selfiePage;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InquiryPage$Selfie)) {
            return false;
        }
        InquiryPage$Selfie inquiryPage$Selfie = (InquiryPage$Selfie) obj;
        return Intrinsics.areEqual(this.stepName, inquiryPage$Selfie.stepName) && Intrinsics.areEqual(this.subPage, inquiryPage$Selfie.subPage);
    }

    @Override // com.google.android.play.core.splitcompat.zzd
    public final String getStepName() {
        return this.stepName;
    }

    public final int hashCode() {
        return this.subPage.hashCode() + (this.stepName.hashCode() * 31);
    }

    public final String toString() {
        String str;
        SelfiePage.FinalizeVideo finalizeVideo = SelfiePage.FinalizeVideo.INSTANCE;
        SelfiePage selfiePage = this.subPage;
        if (Intrinsics.areEqual(selfiePage, finalizeVideo)) {
            str = "finalize-video";
        } else if (Intrinsics.areEqual(selfiePage, SelfiePage.Pending.INSTANCE)) {
            str = "pending";
        } else if (Intrinsics.areEqual(selfiePage, SelfiePage.Prompt.INSTANCE)) {
            str = "prompt";
        } else if (selfiePage instanceof SelfiePage.LeadInAnimation) {
            str = Recorder$$ExternalSyntheticOutline2.m$1(((SelfiePage.LeadInAnimation) selfiePage).pose, "/capture-lead-in-animation");
        } else if (selfiePage instanceof SelfiePage.TakePhoto) {
            str = Recorder$$ExternalSyntheticOutline2.m$1(((SelfiePage.TakePhoto) selfiePage).pose, "/capture");
        } else {
            if (!Intrinsics.areEqual(selfiePage, SelfiePage.CheckUpload.INSTANCE)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            str = "check-upload";
        }
        return "/inquiry/selfie/".concat(str);
    }
}
