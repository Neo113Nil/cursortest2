package com.squareup.scannerview;

import bo.app.re$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class Step {
    public final boolean bitmapRequired;
    public final FlashState defaultFlashState;
    public final OverlayType overlayType;
    public final boolean previewRequired;
    public final String previewText;
    public final ScanType scanType;
    public final String text;

    public Step(String str, String str2, ScanType scanType, OverlayType overlayType, boolean z) {
        FlashState flashState = FlashState.OFF;
        str.getClass();
        this.text = str;
        this.previewText = str2;
        this.scanType = scanType;
        this.overlayType = overlayType;
        this.bitmapRequired = true;
        this.previewRequired = z;
        this.defaultFlashState = flashState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Step)) {
            return false;
        }
        Step step = (Step) obj;
        return Intrinsics.areEqual(this.text, step.text) && Intrinsics.areEqual(this.previewText, step.previewText) && this.scanType == step.scanType && this.overlayType == step.overlayType && this.bitmapRequired == step.bitmapRequired && this.previewRequired == step.previewRequired && this.defaultFlashState == step.defaultFlashState;
    }

    public final int hashCode() {
        int hashCode = this.text.hashCode() * 31;
        String str = this.previewText;
        return Boolean.hashCode(false) + ((this.defaultFlashState.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.overlayType.hashCode() + ((this.scanType.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31, 31, this.bitmapRequired), 31, this.previewRequired)) * 961);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Step(text=", this.text, ", previewText=", this.previewText, ", scanType=");
        m.append(this.scanType);
        m.append(", overlayType=");
        m.append(this.overlayType);
        m.append(", bitmapRequired=");
        re$$ExternalSyntheticOutline0.m(m, this.bitmapRequired, ", previewRequired=", this.previewRequired, ", defaultFlashState=");
        m.append(this.defaultFlashState);
        m.append(", hint=null, showSuccessBeforePreview=false)");
        return m.toString();
    }
}
