package com.squareup.scannerview;

import com.squareup.cash.clientsync.UtilsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class StepResult {
    public final UtilsKt bitmapResult;
    public final Step step;
    public final String text;

    public StepResult(Step step, String str, UtilsKt utilsKt) {
        step.getClass();
        this.step = step;
        this.text = str;
        this.bitmapResult = utilsKt;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StepResult)) {
            return false;
        }
        StepResult stepResult = (StepResult) obj;
        return Intrinsics.areEqual(this.step, stepResult.step) && Intrinsics.areEqual(this.text, stepResult.text) && Intrinsics.areEqual(this.bitmapResult, stepResult.bitmapResult);
    }

    public final int hashCode() {
        int hashCode = this.step.hashCode() * 31;
        String str = this.text;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        UtilsKt utilsKt = this.bitmapResult;
        return hashCode2 + (utilsKt != null ? utilsKt.hashCode() : 0);
    }

    public final String toString() {
        return "StepResult(step=" + this.step + ", text=" + this.text + ", bitmapResult=" + this.bitmapResult + ")";
    }
}
