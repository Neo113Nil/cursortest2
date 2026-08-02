package com.squareup.cash.taptopay.viewmodels;

import com.knotapi.knot.utilities.Constants;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public interface TapToPayInitiatorNotesViewEvent {

    public final class Back implements TapToPayInitiatorNotesViewEvent {
        public static final Back INSTANCE = new Back();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Back);
        }

        public final int hashCode() {
            return 897616041;
        }

        public final String toString() {
            return Constants.META_BACK_BUTTON;
        }
    }

    public final class Next implements TapToPayInitiatorNotesViewEvent {
        public static final Next INSTANCE = new Next();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Next);
        }

        public final int hashCode() {
            return 897978037;
        }

        public final String toString() {
            return "Next";
        }
    }

    /* loaded from: classes9.dex */
    public final class TextInput implements TapToPayInitiatorNotesViewEvent {
        public final String input;

        public TextInput(String str) {
            str.getClass();
            this.input = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TextInput) && Intrinsics.areEqual(this.input, ((TextInput) obj).input);
        }

        public final int hashCode() {
            return this.input.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("TextInput(input=", this.input, ")");
        }
    }
}
