package com.squareup.cash.support.backend.api;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import java.util.List;

/* loaded from: classes7.dex */
public abstract class SupportSearchService$Result {

    public final class Failed extends SupportSearchService$Result {
        public static final Failed INSTANCE = new Failed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Failed);
        }

        public final int hashCode() {
            return 1153757085;
        }

        public final String toString() {
            return "Failed";
        }
    }

    public final class Success extends SupportSearchService$Result {
        public final List searchResults;

        public Success(List list) {
            this.searchResults = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && this.searchResults.equals(((Success) obj).searchResults);
        }

        public final int hashCode() {
            return this.searchResults.hashCode();
        }

        public final String toString() {
            return CameraState$Type$EnumUnboxingLocalUtility.m("Success(searchResults=", ")", this.searchResults);
        }
    }
}
