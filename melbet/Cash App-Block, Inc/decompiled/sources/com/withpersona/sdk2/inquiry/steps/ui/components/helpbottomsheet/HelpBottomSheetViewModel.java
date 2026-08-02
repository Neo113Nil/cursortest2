package com.withpersona.sdk2.inquiry.steps.ui.components.helpbottomsheet;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.GovernmentIdNfcScan;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.HelpBottomSheetComponentStyle;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public final class HelpBottomSheetViewModel {
    public final String buttonText;
    public final HelpBottomSheetComponentStyle componentStyle;
    public final String secondaryButtonActionComponentName;
    public final String secondaryButtonText;
    public final ArrayList tips;

    public HelpBottomSheetViewModel(String str, String str2, String str3, ArrayList arrayList, GovernmentIdNfcScan.GovernmentIdNfcScanStyles governmentIdNfcScanStyles) {
        this.buttonText = str;
        this.secondaryButtonText = str2;
        this.secondaryButtonActionComponentName = str3;
        this.tips = arrayList;
        this.componentStyle = governmentIdNfcScanStyles;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HelpBottomSheetViewModel)) {
            return false;
        }
        HelpBottomSheetViewModel helpBottomSheetViewModel = (HelpBottomSheetViewModel) obj;
        return Intrinsics.areEqual(this.buttonText, helpBottomSheetViewModel.buttonText) && Intrinsics.areEqual(this.secondaryButtonText, helpBottomSheetViewModel.secondaryButtonText) && Intrinsics.areEqual(this.secondaryButtonActionComponentName, helpBottomSheetViewModel.secondaryButtonActionComponentName) && this.tips.equals(helpBottomSheetViewModel.tips) && Intrinsics.areEqual(this.componentStyle, helpBottomSheetViewModel.componentStyle);
    }

    public final int hashCode() {
        String str = this.buttonText;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.secondaryButtonText;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.secondaryButtonActionComponentName;
        int m = CameraState$Type$EnumUnboxingLocalUtility.m(this.tips, (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31);
        HelpBottomSheetComponentStyle helpBottomSheetComponentStyle = this.componentStyle;
        return m + (helpBottomSheetComponentStyle != null ? helpBottomSheetComponentStyle.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("HelpBottomSheetViewModel(title=null, buttonText=", this.buttonText, ", secondaryButtonText=", this.secondaryButtonText, ", secondaryButtonActionComponentName=");
        m.append(this.secondaryButtonActionComponentName);
        m.append(", tips=");
        m.append(this.tips);
        m.append(", componentStyle=");
        m.append(this.componentStyle);
        m.append(")");
        return m.toString();
    }
}
