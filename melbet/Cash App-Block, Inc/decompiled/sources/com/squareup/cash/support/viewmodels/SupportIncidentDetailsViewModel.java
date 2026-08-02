package com.squareup.cash.support.viewmodels;

import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.support.incidents.viewmodels.IncidentViewModel$Severity;
import com.squareup.cash.support.incidents.viewmodels.IncidentViewModel$SubscriptionAction;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public interface SupportIncidentDetailsViewModel {

    public interface ButtonViewModel {

        public final class Display implements ButtonViewModel {
            public final IncidentViewModel$SubscriptionAction action;
            public final String text;

            public Display(String str, IncidentViewModel$SubscriptionAction incidentViewModel$SubscriptionAction) {
                str.getClass();
                this.text = str;
                this.action = incidentViewModel$SubscriptionAction;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Display)) {
                    return false;
                }
                Display display = (Display) obj;
                return Intrinsics.areEqual(this.text, display.text) && this.action == display.action;
            }

            public final int hashCode() {
                return this.action.hashCode() + (this.text.hashCode() * 31);
            }

            public final String toString() {
                return "Display(text=" + this.text + ", action=" + this.action + ")";
            }
        }

        public final class UpdatingSubscription implements ButtonViewModel {
            public static final UpdatingSubscription INSTANCE = new UpdatingSubscription();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof UpdatingSubscription);
            }

            public final int hashCode() {
                return -2139344360;
            }

            public final String toString() {
                return "UpdatingSubscription";
            }
        }
    }

    public final class Empty implements SupportIncidentDetailsViewModel {
        public static final Empty INSTANCE = new Empty();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Empty);
        }

        public final int hashCode() {
            return 1148782068;
        }

        public final String toString() {
            return "Empty";
        }
    }

    public final class Loaded implements SupportIncidentDetailsViewModel {
        public final ButtonViewModel button;
        public final String details;
        public final String id;
        public final IncidentViewModel$Severity severity;
        public final String status;
        public final String title;

        public Loaded(String str, String str2, String str3, IncidentViewModel$Severity incidentViewModel$Severity, String str4, ButtonViewModel buttonViewModel) {
            re$$ExternalSyntheticOutline0.m1432m(str, str2, str3);
            this.id = str;
            this.title = str2;
            this.details = str3;
            this.severity = incidentViewModel$Severity;
            this.status = str4;
            this.button = buttonViewModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) obj;
            return Intrinsics.areEqual(this.id, loaded.id) && Intrinsics.areEqual(this.title, loaded.title) && Intrinsics.areEqual(this.details, loaded.details) && this.severity == loaded.severity && this.status.equals(loaded.status) && Intrinsics.areEqual(this.button, loaded.button);
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.severity.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.id.hashCode() * 31, 31, this.title), 31, this.details)) * 31, 31, this.status);
            ButtonViewModel buttonViewModel = this.button;
            return m + (buttonViewModel == null ? 0 : buttonViewModel.hashCode());
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Loaded(id=", this.id, ", title=", this.title, ", details=");
            m.append(this.details);
            m.append(", severity=");
            m.append(this.severity);
            m.append(", status=");
            m.append(this.status);
            m.append(", button=");
            m.append(this.button);
            m.append(")");
            return m.toString();
        }
    }

    public final class Loading implements SupportIncidentDetailsViewModel {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return 2133447715;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
