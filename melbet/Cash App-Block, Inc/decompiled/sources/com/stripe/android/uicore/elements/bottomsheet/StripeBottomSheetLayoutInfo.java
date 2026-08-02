package com.stripe.android.uicore.elements.bottomsheet;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.ui.graphics.Color;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.ULong;

/* loaded from: classes8.dex */
public final class StripeBottomSheetLayoutInfo {
    public final long scrimColor;
    public final long sheetBackgroundColor;
    public final RoundedCornerShape sheetShape;

    public StripeBottomSheetLayoutInfo(RoundedCornerShape roundedCornerShape, long j, long j2) {
        this.sheetShape = roundedCornerShape;
        this.sheetBackgroundColor = j;
        this.scrimColor = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StripeBottomSheetLayoutInfo)) {
            return false;
        }
        StripeBottomSheetLayoutInfo stripeBottomSheetLayoutInfo = (StripeBottomSheetLayoutInfo) obj;
        return this.sheetShape.equals(stripeBottomSheetLayoutInfo.sheetShape) && Color.m676equalsimpl0(this.sheetBackgroundColor, stripeBottomSheetLayoutInfo.sheetBackgroundColor) && Color.m676equalsimpl0(this.scrimColor, stripeBottomSheetLayoutInfo.scrimColor);
    }

    public final int hashCode() {
        int hashCode = this.sheetShape.hashCode() * 31;
        int i = Color.$r8$clinit;
        ULong.Companion companion = ULong.Companion;
        return Long.hashCode(this.scrimColor) + Recorder$$ExternalSyntheticOutline2.m(hashCode, 31, this.sheetBackgroundColor);
    }

    public final String toString() {
        String m682toStringimpl = Color.m682toStringimpl(this.sheetBackgroundColor);
        String m682toStringimpl2 = Color.m682toStringimpl(this.scrimColor);
        StringBuilder sb = new StringBuilder("StripeBottomSheetLayoutInfo(sheetShape=");
        sb.append(this.sheetShape);
        sb.append(", sheetBackgroundColor=");
        sb.append(m682toStringimpl);
        sb.append(", scrimColor=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, m682toStringimpl2, ")");
    }
}
