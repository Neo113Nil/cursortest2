package com.squareup.cash.tax.viewmodels;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public interface TaxWebAppViewModel {

    public final class ErrorUrl implements TaxWebAppViewModel {
        public static final ErrorUrl INSTANCE = new ErrorUrl();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ErrorUrl);
        }

        public final int hashCode() {
            return -1887335233;
        }

        public final String toString() {
            return "ErrorUrl";
        }
    }

    public final class LoadUrl implements TaxWebAppViewModel {
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

    public final class Loading implements TaxWebAppViewModel {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return -184908860;
        }

        public final String toString() {
            return "Loading";
        }
    }

    public final class TransitoryWebModel implements TaxWebAppViewModel {
        public final String currentUrl;
        public final ArrayList presenterHandledCommandResponses;

        public TransitoryWebModel(String str, ArrayList arrayList) {
            this.currentUrl = str;
            this.presenterHandledCommandResponses = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TransitoryWebModel)) {
                return false;
            }
            TransitoryWebModel transitoryWebModel = (TransitoryWebModel) obj;
            return this.currentUrl.equals(transitoryWebModel.currentUrl) && this.presenterHandledCommandResponses.equals(transitoryWebModel.presenterHandledCommandResponses);
        }

        public final int hashCode() {
            return this.presenterHandledCommandResponses.hashCode() + (this.currentUrl.hashCode() * 31);
        }

        public final String toString() {
            return NavAction$$ExternalSyntheticOutline0.m(this.presenterHandledCommandResponses, "TransitoryWebModel(currentUrl=", this.currentUrl, ", presenterHandledCommandResponses=", ")");
        }
    }
}
