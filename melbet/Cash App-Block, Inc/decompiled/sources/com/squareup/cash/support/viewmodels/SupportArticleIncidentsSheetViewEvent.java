package com.squareup.cash.support.viewmodels;

import com.knotapi.knot.utilities.Constants;
import com.squareup.cash.support.viewmodels.SupportNotification;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public interface SupportArticleIncidentsSheetViewEvent {

    public final class Close implements SupportArticleIncidentsSheetViewEvent {
        public static final Close INSTANCE = new Close();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Close);
        }

        public final int hashCode() {
            return 1862655628;
        }

        public final String toString() {
            return Constants.META_CLOSE;
        }
    }

    public final class IncidentNotificationClicked implements SupportArticleIncidentsSheetViewEvent {
        public final SupportNotification.Trigger trigger;

        public IncidentNotificationClicked(SupportNotification.Trigger trigger) {
            trigger.getClass();
            this.trigger = trigger;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof IncidentNotificationClicked) && Intrinsics.areEqual(this.trigger, ((IncidentNotificationClicked) obj).trigger);
        }

        public final int hashCode() {
            return this.trigger.hashCode();
        }

        public final String toString() {
            return "IncidentNotificationClicked(trigger=" + this.trigger + ")";
        }
    }
}
