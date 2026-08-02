package com.squareup.cash.work.webview.viewmodels;

import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public interface WorkWebViewModel {

    public final class ErrorUrl implements WorkWebViewModel {
        public static final ErrorUrl INSTANCE = new ErrorUrl();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ErrorUrl);
        }

        public final int hashCode() {
            return -230971947;
        }

        public final String toString() {
            return "ErrorUrl";
        }
    }

    public final class LoadUrl implements WorkWebViewModel {
        public final String url;

        public LoadUrl(String str) {
            str.getClass();
            this.url = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LoadUrl) && Intrinsics.areEqual(this.url, ((LoadUrl) obj).url);
        }

        public final int hashCode() {
            return this.url.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("LoadUrl(url=", this.url, ")");
        }
    }

    public final class OtkInitializing implements WorkWebViewModel {
        public static final OtkInitializing INSTANCE = new OtkInitializing();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OtkInitializing);
        }

        public final int hashCode() {
            return -828572859;
        }

        public final String toString() {
            return "OtkInitializing";
        }
    }

    /* loaded from: classes6.dex */
    public final class ShowError implements WorkWebViewModel {
        public final boolean canRetry;
        public final String message;

        public ShowError(String str, boolean z) {
            str.getClass();
            this.message = str;
            this.canRetry = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShowError)) {
                return false;
            }
            ShowError showError = (ShowError) obj;
            return Intrinsics.areEqual(this.message, showError.message) && this.canRetry == showError.canRetry;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.canRetry) + (this.message.hashCode() * 31);
        }

        public final String toString() {
            return Request$Priority$EnumUnboxingLocalUtility.m("ShowError(message=", this.message, ", canRetry=", ")", this.canRetry);
        }
    }
}
