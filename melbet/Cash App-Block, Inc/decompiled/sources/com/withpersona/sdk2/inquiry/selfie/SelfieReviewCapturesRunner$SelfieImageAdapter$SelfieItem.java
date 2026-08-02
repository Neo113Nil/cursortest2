package com.withpersona.sdk2.inquiry.selfie;

import com.withpersona.sdk2.inquiry.selfie.Selfie;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public final class SelfieReviewCapturesRunner$SelfieImageAdapter$SelfieItem {
    public final String label;
    public final Selfie.SelfieImage selfie;

    public SelfieReviewCapturesRunner$SelfieImageAdapter$SelfieItem(String str, Selfie.SelfieImage selfieImage) {
        this.label = str;
        this.selfie = selfieImage;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelfieReviewCapturesRunner$SelfieImageAdapter$SelfieItem)) {
            return false;
        }
        SelfieReviewCapturesRunner$SelfieImageAdapter$SelfieItem selfieReviewCapturesRunner$SelfieImageAdapter$SelfieItem = (SelfieReviewCapturesRunner$SelfieImageAdapter$SelfieItem) obj;
        return Intrinsics.areEqual(this.label, selfieReviewCapturesRunner$SelfieImageAdapter$SelfieItem.label) && this.selfie.equals(selfieReviewCapturesRunner$SelfieImageAdapter$SelfieItem.selfie);
    }

    public final int hashCode() {
        String str = this.label;
        return this.selfie.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "SelfieItem(label=" + this.label + ", selfie=" + this.selfie + ")";
    }
}
