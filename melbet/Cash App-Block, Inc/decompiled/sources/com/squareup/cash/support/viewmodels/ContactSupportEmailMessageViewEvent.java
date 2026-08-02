package com.squareup.cash.support.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public interface ContactSupportEmailMessageViewEvent {

    public final class DismissModal implements ContactSupportEmailMessageViewEvent {
        public static final DismissModal INSTANCE = new DismissModal();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof DismissModal);
        }

        public final int hashCode() {
            return 735004900;
        }

        public final String toString() {
            return "DismissModal";
        }
    }

    public final class ExitFlow implements ContactSupportEmailMessageViewEvent {
        public static final ExitFlow INSTANCE = new ExitFlow();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ExitFlow);
        }

        public final int hashCode() {
            return -560868723;
        }

        public final String toString() {
            return "ExitFlow";
        }
    }

    public final class SubmitMessage implements ContactSupportEmailMessageViewEvent {
        public final String message;

        public SubmitMessage(String str) {
            str.getClass();
            this.message = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SubmitMessage) && Intrinsics.areEqual(this.message, ((SubmitMessage) obj).message);
        }

        public final int hashCode() {
            return this.message.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SubmitMessage(message=", this.message, ")");
        }
    }

    /* loaded from: classes6.dex */
    public final class UpdateMessage implements ContactSupportEmailMessageViewEvent {
        public final String message;

        public UpdateMessage(String str) {
            str.getClass();
            this.message = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateMessage) && Intrinsics.areEqual(this.message, ((UpdateMessage) obj).message);
        }

        public final int hashCode() {
            return this.message.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("UpdateMessage(message=", this.message, ")");
        }
    }
}
