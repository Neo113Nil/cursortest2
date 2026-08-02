package com.squareup.cash.tax.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes7.dex */
public final class WebViewState {
    public final String currentUrl;

    public WebViewState(String str) {
        this.currentUrl = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WebViewState) && this.currentUrl.equals(((WebViewState) obj).currentUrl);
    }

    public final int hashCode() {
        return this.currentUrl.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("WebViewState(currentUrl=", this.currentUrl, ")");
    }
}
