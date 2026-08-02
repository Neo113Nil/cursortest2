package com.stripe.android.financialconnections.presentation;

import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetActivityResult;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes8.dex */
public interface FinancialConnectionsSheetNativeViewEffect {

    public final class Finish implements FinancialConnectionsSheetNativeViewEffect {
        public final FinancialConnectionsSheetActivityResult result;

        public Finish(FinancialConnectionsSheetActivityResult financialConnectionsSheetActivityResult) {
            this.result = financialConnectionsSheetActivityResult;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Finish) && this.result.equals(((Finish) obj).result);
        }

        public final int hashCode() {
            return this.result.hashCode();
        }

        public final String toString() {
            return "Finish(result=" + this.result + ")";
        }
    }

    /* loaded from: classes7.dex */
    public final class OpenUrl implements FinancialConnectionsSheetNativeViewEffect {
        public final String url;

        public OpenUrl(String str) {
            this.url = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenUrl) && this.url.equals(((OpenUrl) obj).url);
        }

        public final int hashCode() {
            return this.url.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("OpenUrl(url=", this.url, ")");
        }
    }
}
