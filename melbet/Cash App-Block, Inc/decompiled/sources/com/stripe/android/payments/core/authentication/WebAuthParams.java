package com.stripe.android.payments.core.authentication;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class WebAuthParams {
    public final String authUrl;
    public final boolean forceInAppWebView;
    public final String referrer;
    public final String returnUrl;
    public final boolean shouldCancelIntentOnUserNavigation;

    public WebAuthParams(String str, String str2, String str3, int i) {
        boolean z = (i & 8) != 0;
        str3 = (i & 16) != 0 ? null : str3;
        boolean z2 = (i & 32) == 0;
        str.getClass();
        this.authUrl = str;
        this.returnUrl = str2;
        this.shouldCancelIntentOnUserNavigation = z;
        this.referrer = str3;
        this.forceInAppWebView = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebAuthParams)) {
            return false;
        }
        WebAuthParams webAuthParams = (WebAuthParams) obj;
        return Intrinsics.areEqual(this.authUrl, webAuthParams.authUrl) && Intrinsics.areEqual(this.returnUrl, webAuthParams.returnUrl) && this.shouldCancelIntentOnUserNavigation == webAuthParams.shouldCancelIntentOnUserNavigation && Intrinsics.areEqual(this.referrer, webAuthParams.referrer) && this.forceInAppWebView == webAuthParams.forceInAppWebView;
    }

    public final int hashCode() {
        int hashCode = this.authUrl.hashCode() * 31;
        String str = this.returnUrl;
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, false), 31, this.shouldCancelIntentOnUserNavigation);
        String str2 = this.referrer;
        return Boolean.hashCode(this.forceInAppWebView) + ((m + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("WebAuthParams(authUrl=", this.authUrl, ", returnUrl=", this.returnUrl, ", shouldCancelSource=false, shouldCancelIntentOnUserNavigation=");
        NavAction$$ExternalSyntheticOutline0.m(m, this.shouldCancelIntentOnUserNavigation, ", referrer=", this.referrer, ", forceInAppWebView=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.forceInAppWebView, ")");
    }
}
