package com.squareup.cash.support.viewmodels;

import com.squareup.cash.support.viewmodels.SupportSearchViewModel;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public abstract class SupportSearchViewEvent {

    public final class ContactOptionSelected extends SupportSearchViewEvent {
        public final SupportSearchViewModel.ContactOptionType contactOptionType;

        public ContactOptionSelected(SupportSearchViewModel.ContactOptionType contactOptionType) {
            contactOptionType.getClass();
            this.contactOptionType = contactOptionType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ContactOptionSelected) && this.contactOptionType == ((ContactOptionSelected) obj).contactOptionType;
        }

        public final int hashCode() {
            return this.contactOptionType.hashCode();
        }

        public final String toString() {
            return "ContactOptionSelected(contactOptionType=" + this.contactOptionType + ")";
        }
    }

    public final class GoBack extends SupportSearchViewEvent {
        public static final GoBack INSTANCE = new GoBack();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof GoBack);
        }

        public final int hashCode() {
            return -1092525871;
        }

        public final String toString() {
            return "GoBack";
        }
    }

    public final class ResultSelected extends SupportSearchViewEvent {
        public final SupportSearchViewModel.Node node;

        public ResultSelected(SupportSearchViewModel.Node node) {
            node.getClass();
            this.node = node;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ResultSelected) && Intrinsics.areEqual(this.node, ((ResultSelected) obj).node);
        }

        public final int hashCode() {
            return this.node.hashCode();
        }

        public final String toString() {
            return "ResultSelected(node=" + this.node + ")";
        }
    }

    /* loaded from: classes6.dex */
    public final class SearchTextChanged extends SupportSearchViewEvent {
        public final String text;

        public SearchTextChanged(String str) {
            str.getClass();
            this.text = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SearchTextChanged) && Intrinsics.areEqual(this.text, ((SearchTextChanged) obj).text);
        }

        public final int hashCode() {
            return this.text.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SearchTextChanged(text=", this.text, ")");
        }
    }
}
