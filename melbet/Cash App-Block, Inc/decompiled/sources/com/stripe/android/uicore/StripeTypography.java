package com.stripe.android.uicore;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitType;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes8.dex */
public final class StripeTypography {
    public final int fontWeightBold;
    public final int fontWeightMedium;
    public final int fontWeightNormal;
    public final long largeFontSize;
    public final long mediumFontSize;
    public final long smallFontSize;
    public final long xLargeFontSize;
    public final long xSmallFontSize;
    public final long xxSmallFontSize;

    public StripeTypography(int i, int i2, int i3, long j, long j2, long j3, long j4, long j5, long j6) {
        this.fontWeightNormal = i;
        this.fontWeightMedium = i2;
        this.fontWeightBold = i3;
        this.xxSmallFontSize = j;
        this.xSmallFontSize = j2;
        this.smallFontSize = j3;
        this.mediumFontSize = j4;
        this.largeFontSize = j5;
        this.xLargeFontSize = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StripeTypography)) {
            return false;
        }
        StripeTypography stripeTypography = (StripeTypography) obj;
        return this.fontWeightNormal == stripeTypography.fontWeightNormal && this.fontWeightMedium == stripeTypography.fontWeightMedium && this.fontWeightBold == stripeTypography.fontWeightBold && Float.compare(1.0f, 1.0f) == 0 && TextUnit.m1057equalsimpl0(this.xxSmallFontSize, stripeTypography.xxSmallFontSize) && TextUnit.m1057equalsimpl0(this.xSmallFontSize, stripeTypography.xSmallFontSize) && TextUnit.m1057equalsimpl0(this.smallFontSize, stripeTypography.smallFontSize) && TextUnit.m1057equalsimpl0(this.mediumFontSize, stripeTypography.mediumFontSize) && TextUnit.m1057equalsimpl0(this.largeFontSize, stripeTypography.largeFontSize) && TextUnit.m1057equalsimpl0(this.xLargeFontSize, stripeTypography.xLargeFontSize);
    }

    public final int hashCode() {
        int m = CameraState$Type$EnumUnboxingLocalUtility.m(1.0f, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.fontWeightBold, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.fontWeightMedium, Integer.hashCode(this.fontWeightNormal) * 31, 31), 31), 31);
        TextUnitType[] textUnitTypeArr = TextUnit.TextUnitTypes;
        return Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(m, 31, this.xxSmallFontSize), 31, this.xSmallFontSize), 31, this.smallFontSize), 31, this.mediumFontSize), 31, this.largeFontSize), -1807454463, this.xLargeFontSize);
    }

    public final String toString() {
        String m1061toStringimpl = TextUnit.m1061toStringimpl(this.xxSmallFontSize);
        String m1061toStringimpl2 = TextUnit.m1061toStringimpl(this.xSmallFontSize);
        String m1061toStringimpl3 = TextUnit.m1061toStringimpl(this.smallFontSize);
        String m1061toStringimpl4 = TextUnit.m1061toStringimpl(this.mediumFontSize);
        String m1061toStringimpl5 = TextUnit.m1061toStringimpl(this.largeFontSize);
        String m1061toStringimpl6 = TextUnit.m1061toStringimpl(this.xLargeFontSize);
        StringBuilder m107m = Recorder$$ExternalSyntheticOutline2.m107m(this.fontWeightNormal, this.fontWeightMedium, "StripeTypography(fontWeightNormal=", ", fontWeightMedium=", ", fontWeightBold=");
        m107m.append(this.fontWeightBold);
        m107m.append(", fontSizeMultiplier=1.0, xxSmallFontSize=");
        m107m.append(m1061toStringimpl);
        m107m.append(", xSmallFontSize=");
        Boxes$$ExternalSyntheticOutline1.m(m107m, m1061toStringimpl2, ", smallFontSize=", m1061toStringimpl3, ", mediumFontSize=");
        Boxes$$ExternalSyntheticOutline1.m(m107m, m1061toStringimpl4, ", largeFontSize=", m1061toStringimpl5, ", xLargeFontSize=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m107m, m1061toStringimpl6, ", fontFamily=null, h4=null, body1FontFamily=null, body2FontFamily=null, h5FontFamily=null, h6FontFamily=null, subtitle1FontFamily=null, captionFontFamily=null)");
    }
}
