package com.stripe.android.financialconnections.navigation.topappbar;

import bo.app.re$$ExternalSyntheticOutline0;
import com.stripe.android.financialconnections.ui.theme.Theme;
import com.stripe.android.model.LinkBrand;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class TopAppBarState {
    public final boolean allowBackNavigation;
    public final boolean allowElevation;
    public final boolean canCloseWithoutConfirmation;
    public final Throwable error;
    public final boolean forceHideStripeLogo;
    public final boolean hideStripeLogo;
    public final boolean isContentScrolled;
    public final boolean isTestMode;
    public final LinkBrand linkBrand;
    public final Theme theme;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public TopAppBarState(LinkBrand linkBrand, boolean z, Theme theme, boolean z2, boolean z3, int i) {
        this(linkBrand, z, r6, false, r8, (i & 32) != 0 ? false : z2, true, (i & 128) != 0 ? false : z3, null, false);
        Theme theme2;
        boolean z4 = (i & 4) == 0;
        if ((i & 16) != 0) {
            Theme.Companion.getClass();
            theme2 = Theme.f825default;
        } else {
            theme2 = theme;
        }
    }

    public static TopAppBarState copy$default(TopAppBarState topAppBarState, LinkBrand linkBrand, boolean z, boolean z2, boolean z3, boolean z4, Throwable th, boolean z5, int i) {
        if ((i & 1) != 0) {
            linkBrand = topAppBarState.linkBrand;
        }
        LinkBrand linkBrand2 = linkBrand;
        if ((i & 2) != 0) {
            z = topAppBarState.hideStripeLogo;
        }
        boolean z6 = z;
        boolean z7 = (i & 4) != 0 ? topAppBarState.forceHideStripeLogo : false;
        boolean z8 = (i & 8) != 0 ? topAppBarState.allowBackNavigation : z2;
        Theme theme = topAppBarState.theme;
        boolean z9 = topAppBarState.isTestMode;
        boolean z10 = (i & 64) != 0 ? topAppBarState.allowElevation : z3;
        boolean z11 = (i & 128) != 0 ? topAppBarState.isContentScrolled : z4;
        Throwable th2 = (i & 256) != 0 ? topAppBarState.error : th;
        boolean z12 = (i & 512) != 0 ? topAppBarState.canCloseWithoutConfirmation : z5;
        topAppBarState.getClass();
        linkBrand2.getClass();
        theme.getClass();
        return new TopAppBarState(linkBrand2, z6, z7, z8, theme, z9, z10, z11, th2, z12);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TopAppBarState)) {
            return false;
        }
        TopAppBarState topAppBarState = (TopAppBarState) obj;
        return this.linkBrand == topAppBarState.linkBrand && this.hideStripeLogo == topAppBarState.hideStripeLogo && this.forceHideStripeLogo == topAppBarState.forceHideStripeLogo && this.allowBackNavigation == topAppBarState.allowBackNavigation && this.theme == topAppBarState.theme && this.isTestMode == topAppBarState.isTestMode && this.allowElevation == topAppBarState.allowElevation && this.isContentScrolled == topAppBarState.isContentScrolled && Intrinsics.areEqual(this.error, topAppBarState.error) && this.canCloseWithoutConfirmation == topAppBarState.canCloseWithoutConfirmation;
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.theme.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.linkBrand.hashCode() * 31, 31, this.hideStripeLogo), 31, this.forceHideStripeLogo), 31, this.allowBackNavigation)) * 31, 31, this.isTestMode), 31, this.allowElevation), 31, this.isContentScrolled);
        Throwable th = this.error;
        return Boolean.hashCode(this.canCloseWithoutConfirmation) + ((m + (th == null ? 0 : th.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TopAppBarState(linkBrand=");
        sb.append(this.linkBrand);
        sb.append(", hideStripeLogo=");
        sb.append(this.hideStripeLogo);
        sb.append(", forceHideStripeLogo=");
        re$$ExternalSyntheticOutline0.m(sb, this.forceHideStripeLogo, ", allowBackNavigation=", this.allowBackNavigation, ", theme=");
        sb.append(this.theme);
        sb.append(", isTestMode=");
        sb.append(this.isTestMode);
        sb.append(", allowElevation=");
        re$$ExternalSyntheticOutline0.m(sb, this.allowElevation, ", isContentScrolled=", this.isContentScrolled, ", error=");
        sb.append(this.error);
        sb.append(", canCloseWithoutConfirmation=");
        sb.append(this.canCloseWithoutConfirmation);
        sb.append(")");
        return sb.toString();
    }

    public TopAppBarState(LinkBrand linkBrand, boolean z, boolean z2, boolean z3, Theme theme, boolean z4, boolean z5, boolean z6, Throwable th, boolean z7) {
        linkBrand.getClass();
        theme.getClass();
        this.linkBrand = linkBrand;
        this.hideStripeLogo = z;
        this.forceHideStripeLogo = z2;
        this.allowBackNavigation = z3;
        this.theme = theme;
        this.isTestMode = z4;
        this.allowElevation = z5;
        this.isContentScrolled = z6;
        this.error = th;
        this.canCloseWithoutConfirmation = z7;
    }
}
