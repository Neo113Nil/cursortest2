package com.squareup.cash.support.viewmodels;

import com.squareup.cash.support.incidents.viewmodels.IncidentViewModel$Severity;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class SupportNotification {
    public final String message;
    public final boolean showUnreadDot;
    public final String title;
    public final Trigger trigger;

    public interface Trigger {

        public final class ChatMessage implements Trigger {
            public static final ChatMessage INSTANCE = new ChatMessage();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof ChatMessage);
            }

            public final int hashCode() {
                return -1843456201;
            }

            public final String toString() {
                return "ChatMessage";
            }
        }

        public final class Incident implements Trigger {
            public final String id;
            public final IncidentViewModel$Severity severity;

            public Incident(String str, IncidentViewModel$Severity incidentViewModel$Severity) {
                str.getClass();
                this.id = str;
                this.severity = incidentViewModel$Severity;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Incident)) {
                    return false;
                }
                Incident incident = (Incident) obj;
                return Intrinsics.areEqual(this.id, incident.id) && this.severity == incident.severity;
            }

            public final int hashCode() {
                return this.severity.hashCode() + (this.id.hashCode() * 31);
            }

            public final String toString() {
                return "Incident(id=" + this.id + ", severity=" + this.severity + ")";
            }
        }

        public final class PhoneMessage implements Trigger {
            public static final PhoneMessage INSTANCE = new PhoneMessage();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof PhoneMessage);
            }

            public final int hashCode() {
                return -1478643183;
            }

            public final String toString() {
                return "PhoneMessage";
            }
        }
    }

    public SupportNotification(String str, String str2, Trigger trigger, boolean z) {
        str.getClass();
        str2.getClass();
        this.title = str;
        this.message = str2;
        this.trigger = trigger;
        this.showUnreadDot = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SupportNotification)) {
            return false;
        }
        SupportNotification supportNotification = (SupportNotification) obj;
        return Intrinsics.areEqual(this.title, supportNotification.title) && Intrinsics.areEqual(this.message, supportNotification.message) && Intrinsics.areEqual(this.trigger, supportNotification.trigger) && this.showUnreadDot == supportNotification.showUnreadDot;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.showUnreadDot) + ((this.trigger.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.message)) * 31);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SupportNotification(title=", this.title, ", message=", this.message, ", trigger=");
        m.append(this.trigger);
        m.append(", showUnreadDot=");
        m.append(this.showUnreadDot);
        m.append(")");
        return m.toString();
    }
}
