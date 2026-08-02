package com.squareup.cash.work.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public interface TaxFormsListViewEvent {

    public final class BackPressed implements TaxFormsListViewEvent {
        public static final BackPressed INSTANCE = new BackPressed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof BackPressed);
        }

        public final int hashCode() {
            return -448895668;
        }

        public final String toString() {
            return "BackPressed";
        }
    }

    /* loaded from: classes8.dex */
    public final class FormClicked implements TaxFormsListViewEvent {
        public final String downloadUrl;
        public final String title;
        public final String token;

        public FormClicked(String str, String str2, String str3) {
            str2.getClass();
            this.token = str;
            this.title = str2;
            this.downloadUrl = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FormClicked)) {
                return false;
            }
            FormClicked formClicked = (FormClicked) obj;
            return this.token.equals(formClicked.token) && Intrinsics.areEqual(this.title, formClicked.title) && Intrinsics.areEqual(this.downloadUrl, formClicked.downloadUrl);
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.token.hashCode() * 31, 31, this.title);
            String str = this.downloadUrl;
            return m + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("FormClicked(token=", this.token, ", title=", this.title, ", downloadUrl="), this.downloadUrl, ")");
        }
    }

    public final class RetryClicked implements TaxFormsListViewEvent {
        public static final RetryClicked INSTANCE = new RetryClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof RetryClicked);
        }

        public final int hashCode() {
            return -802942354;
        }

        public final String toString() {
            return "RetryClicked";
        }
    }
}
