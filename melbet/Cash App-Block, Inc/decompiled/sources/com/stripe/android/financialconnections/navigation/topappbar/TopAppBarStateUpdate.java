package com.stripe.android.financialconnections.navigation.topappbar;

import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class TopAppBarStateUpdate {
    public final boolean allowBackNavigation;
    public final boolean allowElevation;
    public final boolean canCloseWithoutConfirmation;
    public final Throwable error;
    public final Boolean hideStripeLogo;
    public final FinancialConnectionsSessionManifest.Pane pane;

    public TopAppBarStateUpdate(FinancialConnectionsSessionManifest.Pane pane, boolean z, Throwable th, boolean z2, Boolean bool, int i) {
        z2 = (i & 8) != 0 ? false : z2;
        bool = (i & 16) != 0 ? null : bool;
        boolean z3 = (i & 32) != 0;
        pane.getClass();
        this.pane = pane;
        this.allowBackNavigation = z;
        this.error = th;
        this.canCloseWithoutConfirmation = z2;
        this.hideStripeLogo = bool;
        this.allowElevation = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TopAppBarStateUpdate)) {
            return false;
        }
        TopAppBarStateUpdate topAppBarStateUpdate = (TopAppBarStateUpdate) obj;
        return this.pane == topAppBarStateUpdate.pane && this.allowBackNavigation == topAppBarStateUpdate.allowBackNavigation && Intrinsics.areEqual(this.error, topAppBarStateUpdate.error) && this.canCloseWithoutConfirmation == topAppBarStateUpdate.canCloseWithoutConfirmation && Intrinsics.areEqual(this.hideStripeLogo, topAppBarStateUpdate.hideStripeLogo) && this.allowElevation == topAppBarStateUpdate.allowElevation;
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.pane.hashCode() * 31, 31, this.allowBackNavigation);
        Throwable th = this.error;
        int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m + (th == null ? 0 : th.hashCode())) * 31, 31, this.canCloseWithoutConfirmation);
        Boolean bool = this.hideStripeLogo;
        return Boolean.hashCode(this.allowElevation) + ((m2 + (bool != null ? bool.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "TopAppBarStateUpdate(pane=" + this.pane + ", allowBackNavigation=" + this.allowBackNavigation + ", error=" + this.error + ", canCloseWithoutConfirmation=" + this.canCloseWithoutConfirmation + ", hideStripeLogo=" + this.hideStripeLogo + ", allowElevation=" + this.allowElevation + ")";
    }
}
