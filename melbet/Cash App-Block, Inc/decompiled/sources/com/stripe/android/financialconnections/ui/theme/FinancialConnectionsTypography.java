package com.stripe.android.financialconnections.ui.theme;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.compose.ui.text.TextStyle;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;

/* loaded from: classes8.dex */
public final class FinancialConnectionsTypography {
    public final TextStyle bodyMedium;
    public final TextStyle bodyMediumEmphasized;
    public final TextStyle bodySmall;
    public final TextStyle headingLarge;
    public final TextStyle headingMedium;
    public final TextStyle headingXLarge;
    public final TextStyle headingXLargeSubdued;
    public final TextStyle labelLarge;
    public final TextStyle labelLargeEmphasized;
    public final TextStyle labelMedium;
    public final TextStyle labelMediumEmphasized;
    public final TextStyle labelSmall;

    public FinancialConnectionsTypography(TextStyle textStyle, TextStyle textStyle2, TextStyle textStyle3, TextStyle textStyle4, TextStyle textStyle5, TextStyle textStyle6, TextStyle textStyle7, TextStyle textStyle8, TextStyle textStyle9, TextStyle textStyle10, TextStyle textStyle11, TextStyle textStyle12) {
        this.headingXLarge = textStyle;
        this.headingXLargeSubdued = textStyle2;
        this.headingLarge = textStyle3;
        this.headingMedium = textStyle4;
        this.bodyMediumEmphasized = textStyle5;
        this.bodyMedium = textStyle6;
        this.bodySmall = textStyle7;
        this.labelLargeEmphasized = textStyle8;
        this.labelLarge = textStyle9;
        this.labelMediumEmphasized = textStyle10;
        this.labelMedium = textStyle11;
        this.labelSmall = textStyle12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FinancialConnectionsTypography)) {
            return false;
        }
        FinancialConnectionsTypography financialConnectionsTypography = (FinancialConnectionsTypography) obj;
        return this.headingXLarge.equals(financialConnectionsTypography.headingXLarge) && this.headingXLargeSubdued.equals(financialConnectionsTypography.headingXLargeSubdued) && this.headingLarge.equals(financialConnectionsTypography.headingLarge) && this.headingMedium.equals(financialConnectionsTypography.headingMedium) && this.bodyMediumEmphasized.equals(financialConnectionsTypography.bodyMediumEmphasized) && this.bodyMedium.equals(financialConnectionsTypography.bodyMedium) && this.bodySmall.equals(financialConnectionsTypography.bodySmall) && this.labelLargeEmphasized.equals(financialConnectionsTypography.labelLargeEmphasized) && this.labelLarge.equals(financialConnectionsTypography.labelLarge) && this.labelMediumEmphasized.equals(financialConnectionsTypography.labelMediumEmphasized) && this.labelMedium.equals(financialConnectionsTypography.labelMedium) && this.labelSmall.equals(financialConnectionsTypography.labelSmall);
    }

    public final int hashCode() {
        return this.labelSmall.hashCode() + Recorder$$ExternalSyntheticOutline1.m(this.labelMedium, Recorder$$ExternalSyntheticOutline1.m(this.labelMediumEmphasized, Recorder$$ExternalSyntheticOutline1.m(this.labelLarge, Recorder$$ExternalSyntheticOutline1.m(this.labelLargeEmphasized, Recorder$$ExternalSyntheticOutline1.m(this.bodySmall, Recorder$$ExternalSyntheticOutline1.m(this.bodyMedium, Recorder$$ExternalSyntheticOutline1.m(this.bodyMediumEmphasized, Recorder$$ExternalSyntheticOutline1.m(this.headingMedium, Recorder$$ExternalSyntheticOutline1.m(this.headingLarge, Recorder$$ExternalSyntheticOutline1.m(this.headingXLargeSubdued, this.headingXLarge.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FinancialConnectionsTypography(headingXLarge=");
        sb.append(this.headingXLarge);
        sb.append(", headingXLargeSubdued=");
        sb.append(this.headingXLargeSubdued);
        sb.append(", headingLarge=");
        SVG$Unit$EnumUnboxingLocalUtility.m(sb, this.headingLarge, ", headingMedium=", this.headingMedium, ", bodyMediumEmphasized=");
        SVG$Unit$EnumUnboxingLocalUtility.m(sb, this.bodyMediumEmphasized, ", bodyMedium=", this.bodyMedium, ", bodySmall=");
        SVG$Unit$EnumUnboxingLocalUtility.m(sb, this.bodySmall, ", labelLargeEmphasized=", this.labelLargeEmphasized, ", labelLarge=");
        SVG$Unit$EnumUnboxingLocalUtility.m(sb, this.labelLarge, ", labelMediumEmphasized=", this.labelMediumEmphasized, ", labelMedium=");
        sb.append(this.labelMedium);
        sb.append(", labelSmall=");
        sb.append(this.labelSmall);
        sb.append(")");
        return sb.toString();
    }
}
