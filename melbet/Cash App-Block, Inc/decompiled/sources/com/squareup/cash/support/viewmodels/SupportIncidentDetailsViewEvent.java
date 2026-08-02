package com.squareup.cash.support.viewmodels;

import com.knotapi.knot.utilities.Constants;
import com.squareup.cash.support.incidents.viewmodels.IncidentViewModel$SubscriptionAction;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public interface SupportIncidentDetailsViewEvent {

    public final class Close implements SupportIncidentDetailsViewEvent {
        public static final Close INSTANCE = new Close();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Close);
        }

        public final int hashCode() {
            return 765050192;
        }

        public final String toString() {
            return Constants.META_CLOSE;
        }
    }

    public final class OpenUrl implements SupportIncidentDetailsViewEvent {
        public final String url;

        public OpenUrl(String str) {
            str.getClass();
            this.url = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenUrl) && Intrinsics.areEqual(this.url, ((OpenUrl) obj).url);
        }

        public final int hashCode() {
            return this.url.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("OpenUrl(url=", this.url, ")");
        }
    }

    public final class UpdateIncidentSubscription implements SupportIncidentDetailsViewEvent {
        public final IncidentViewModel$SubscriptionAction action;

        public UpdateIncidentSubscription(IncidentViewModel$SubscriptionAction incidentViewModel$SubscriptionAction) {
            this.action = incidentViewModel$SubscriptionAction;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateIncidentSubscription) && this.action == ((UpdateIncidentSubscription) obj).action;
        }

        public final int hashCode() {
            return this.action.hashCode();
        }

        public final String toString() {
            return "UpdateIncidentSubscription(action=" + this.action + ")";
        }
    }
}
