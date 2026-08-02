package com.squareup.cash.ui;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;

/* loaded from: classes.dex */
public final class WindowFlags {
    public boolean enforceTransparentNavigationBar;
    public boolean isFullScreen;
    public boolean isLandscape;
    public boolean isLightNavigationBar;
    public boolean isLightStatusBar;
    public boolean isSecure;

    public final String toString() {
        boolean z = this.isSecure;
        boolean z2 = this.isLandscape;
        boolean z3 = this.isLightStatusBar;
        boolean z4 = this.isLightNavigationBar;
        boolean z5 = this.enforceTransparentNavigationBar;
        boolean z6 = this.isFullScreen;
        StringBuilder m = NavAction$$ExternalSyntheticOutline0.m("WindowFlags(isSecure=", ", isLandscape=", ", isLightStatusBar=", z, z2);
        re$$ExternalSyntheticOutline0.m(m, z3, ", isLightNavigationBar=", z4, ", enforceTransparentNavigationBar=");
        return Request$Priority$EnumUnboxingLocalUtility.m(m, z5, ", isFullScreen=", z6, ")");
    }
}
