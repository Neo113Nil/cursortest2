package com.withpersona.sdk2.inquiry.inline_inquiry;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes9.dex */
public final class ScreenState {
    public final boolean isNavigationEnabled;
    public final boolean shouldShowBackButton;
    public final boolean shouldShowCancelButton;
    public final boolean shouldShowHelpButton;

    public ScreenState(boolean z, boolean z2, boolean z3, boolean z4) {
        this.shouldShowBackButton = z;
        this.shouldShowCancelButton = z2;
        this.isNavigationEnabled = z3;
        this.shouldShowHelpButton = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScreenState)) {
            return false;
        }
        ScreenState screenState = (ScreenState) obj;
        return this.shouldShowBackButton == screenState.shouldShowBackButton && this.shouldShowCancelButton == screenState.shouldShowCancelButton && this.isNavigationEnabled == screenState.isNavigationEnabled && this.shouldShowHelpButton == screenState.shouldShowHelpButton;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.shouldShowHelpButton) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Boolean.hashCode(this.shouldShowBackButton) * 31, 31, this.shouldShowCancelButton), 31, this.isNavigationEnabled);
    }

    public final String toString() {
        return Request$Priority$EnumUnboxingLocalUtility.m(NavAction$$ExternalSyntheticOutline0.m("ScreenState(shouldShowBackButton=", ", shouldShowCancelButton=", ", isNavigationEnabled=", this.shouldShowBackButton, this.shouldShowCancelButton), this.isNavigationEnabled, ", shouldShowHelpButton=", this.shouldShowHelpButton, ")");
    }
}
