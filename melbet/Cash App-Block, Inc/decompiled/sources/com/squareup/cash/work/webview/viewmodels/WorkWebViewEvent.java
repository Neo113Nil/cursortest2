package com.squareup.cash.work.webview.viewmodels;

import android.net.Uri;
import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import com.knotapi.knot.utilities.Constants;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes7.dex */
public interface WorkWebViewEvent {

    public final class Close implements WorkWebViewEvent {
        public static final Close INSTANCE = new Close();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Close);
        }

        public final int hashCode() {
            return -193441829;
        }

        public final String toString() {
            return Constants.META_CLOSE;
        }
    }

    public final class ExitWebView implements WorkWebViewEvent {
        public static final ExitWebView INSTANCE = new ExitWebView();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ExitWebView);
        }

        public final int hashCode() {
            return 1619455166;
        }

        public final String toString() {
            return "ExitWebView";
        }
    }

    /* loaded from: classes8.dex */
    public final class PageError implements WorkWebViewEvent {
        public final boolean canRetry;

        public PageError(boolean z) {
            this.canRetry = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PageError) && this.canRetry == ((PageError) obj).canRetry;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.canRetry);
        }

        public final String toString() {
            return Fragment$5$$ExternalSyntheticOutline0.m("PageError(canRetry=", ")", this.canRetry);
        }
    }

    public final class PageFinished implements WorkWebViewEvent {
        public static final PageFinished INSTANCE = new PageFinished();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof PageFinished);
        }

        public final int hashCode() {
            return 252100830;
        }

        public final String toString() {
            return "PageFinished";
        }
    }

    public final class PageStarted implements WorkWebViewEvent {
        public final String url;

        public PageStarted(String str) {
            this.url = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PageStarted) && this.url.equals(((PageStarted) obj).url);
        }

        public final int hashCode() {
            return this.url.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("PageStarted(url=", this.url, ")");
        }
    }

    public final class RetryLoad implements WorkWebViewEvent {
        public static final RetryLoad INSTANCE = new RetryLoad();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof RetryLoad);
        }

        public final int hashCode() {
            return 1051299857;
        }

        public final String toString() {
            return "RetryLoad";
        }
    }

    public final class WebResult implements WorkWebViewEvent {
        public final Uri actionUri;

        public WebResult(Uri uri) {
            this.actionUri = uri;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof WebResult) && this.actionUri.equals(((WebResult) obj).actionUri);
        }

        public final int hashCode() {
            return this.actionUri.hashCode();
        }

        public final String toString() {
            return "WebResult(actionUri=" + this.actionUri + ")";
        }
    }
}
