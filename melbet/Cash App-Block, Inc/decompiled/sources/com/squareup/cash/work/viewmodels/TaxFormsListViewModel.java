package com.squareup.cash.work.viewmodels;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public interface TaxFormsListViewModel {

    public final class Empty implements TaxFormsListViewModel {
        public final String message;
        public final String title;

        public Empty(String str, String str2) {
            str.getClass();
            str2.getClass();
            this.title = str;
            this.message = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Empty)) {
                return false;
            }
            Empty empty = (Empty) obj;
            return Intrinsics.areEqual(this.title, empty.title) && Intrinsics.areEqual(this.message, empty.message);
        }

        public final int hashCode() {
            return this.message.hashCode() + (this.title.hashCode() * 31);
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m("Empty(title=", this.title, ", message=", this.message, ")");
        }
    }

    /* loaded from: classes8.dex */
    public final class Error implements TaxFormsListViewModel {
        public final String message;

        public Error(String str) {
            str.getClass();
            this.message = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Error) && Intrinsics.areEqual(this.message, ((Error) obj).message);
        }

        public final int hashCode() {
            return this.message.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Error(message=", this.message, ")");
        }
    }

    /* loaded from: classes8.dex */
    public final class Loaded implements TaxFormsListViewModel {
        public final ArrayList forms;

        public Loaded(ArrayList arrayList) {
            this.forms = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Loaded) && this.forms.equals(((Loaded) obj).forms);
        }

        public final int hashCode() {
            return this.forms.hashCode();
        }

        public final String toString() {
            return Request$Priority$EnumUnboxingLocalUtility.m("Loaded(forms=", ")", this.forms);
        }
    }

    public final class Loading implements TaxFormsListViewModel {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return -513129636;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
