package com.squareup.cash.support.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public interface ContactSupportEmailInputViewEvent {

    public final class ConfirmEmail implements ContactSupportEmailInputViewEvent {
        public final String email;

        public ConfirmEmail(String str) {
            str.getClass();
            this.email = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ConfirmEmail) && Intrinsics.areEqual(this.email, ((ConfirmEmail) obj).email);
        }

        public final int hashCode() {
            return this.email.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ConfirmEmail(email=", this.email, ")");
        }
    }

    public final class DismissModal implements ContactSupportEmailInputViewEvent {
        public static final DismissModal INSTANCE = new DismissModal();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof DismissModal);
        }

        public final int hashCode() {
            return 1187313831;
        }

        public final String toString() {
            return "DismissModal";
        }
    }

    public final class EditEmail implements ContactSupportEmailInputViewEvent {
        public static final EditEmail INSTANCE = new EditEmail();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof EditEmail);
        }

        public final int hashCode() {
            return 1657947086;
        }

        public final String toString() {
            return "EditEmail";
        }
    }

    public final class ExitFlow implements ContactSupportEmailInputViewEvent {
        public static final ExitFlow INSTANCE = new ExitFlow();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ExitFlow);
        }

        public final int hashCode() {
            return -2147230768;
        }

        public final String toString() {
            return "ExitFlow";
        }
    }

    /* loaded from: classes9.dex */
    public final class UpdateEmailText implements ContactSupportEmailInputViewEvent {
        public final String email;

        public UpdateEmailText(String str) {
            str.getClass();
            this.email = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateEmailText) && Intrinsics.areEqual(this.email, ((UpdateEmailText) obj).email);
        }

        public final int hashCode() {
            return this.email.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("UpdateEmailText(email=", this.email, ")");
        }
    }
}
