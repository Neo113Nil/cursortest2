package com.withpersona.sdk2.inquiry.governmentid.captureTips;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.withpersona.sdk2.inquiry.governmentid.IdConfig;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public final class BottomSheetCaptureTipsViewModel implements CaptureTipsViewModel {
    public final String buttonText;
    public final String helpButtonText;
    public final String prompt;
    public final IdConfig.Side side;
    public final String tips;
    public final String title;

    public BottomSheetCaptureTipsViewModel(String str, String str2, String str3, String str4, String str5, IdConfig.Side side) {
        BalanceFeedKt$$ExternalSyntheticOutline0.m(str, str2, str3, str4, str5);
        side.getClass();
        this.helpButtonText = str;
        this.title = str2;
        this.prompt = str3;
        this.tips = str4;
        this.buttonText = str5;
        this.side = side;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BottomSheetCaptureTipsViewModel)) {
            return false;
        }
        BottomSheetCaptureTipsViewModel bottomSheetCaptureTipsViewModel = (BottomSheetCaptureTipsViewModel) obj;
        return Intrinsics.areEqual(this.helpButtonText, bottomSheetCaptureTipsViewModel.helpButtonText) && Intrinsics.areEqual(this.title, bottomSheetCaptureTipsViewModel.title) && Intrinsics.areEqual(this.prompt, bottomSheetCaptureTipsViewModel.prompt) && Intrinsics.areEqual(this.tips, bottomSheetCaptureTipsViewModel.tips) && Intrinsics.areEqual(this.buttonText, bottomSheetCaptureTipsViewModel.buttonText) && this.side == bottomSheetCaptureTipsViewModel.side;
    }

    public final int hashCode() {
        return this.side.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.helpButtonText.hashCode() * 31, 31, this.title), 31, this.prompt), 31, this.tips), 31, this.buttonText);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("BottomSheetCaptureTipsViewModel(helpButtonText=", this.helpButtonText, ", title=", this.title, ", prompt=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.prompt, ", tips=", this.tips, ", buttonText=");
        m.append(this.buttonText);
        m.append(", side=");
        m.append(this.side);
        m.append(")");
        return m.toString();
    }
}
