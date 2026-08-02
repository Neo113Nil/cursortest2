package com.squareup.cash.support.viewmodels;

import com.knotapi.knot.utilities.Constants;
import com.squareup.cash.support.backend.api.articles.Link;
import com.squareup.cash.support.viewmodels.SupportNotification;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public interface SupportHomeViewEvent {

    /* loaded from: classes6.dex */
    public final class CategoryClicked implements SupportHomeViewEvent {
        public final String token;

        public CategoryClicked(String str) {
            str.getClass();
            this.token = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CategoryClicked) && Intrinsics.areEqual(this.token, ((CategoryClicked) obj).token);
        }

        public final int hashCode() {
            return this.token.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("CategoryClicked(token=", this.token, ")");
        }
    }

    public final class ChatModuleClicked implements SupportHomeViewEvent {
        public static final ChatModuleClicked INSTANCE = new ChatModuleClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ChatModuleClicked);
        }

        public final int hashCode() {
            return 1853498794;
        }

        public final String toString() {
            return "ChatModuleClicked";
        }
    }

    public final class Close implements SupportHomeViewEvent {
        public static final Close INSTANCE = new Close();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Close);
        }

        public final int hashCode() {
            return -690152833;
        }

        public final String toString() {
            return Constants.META_CLOSE;
        }
    }

    public final class DisputesClicked implements SupportHomeViewEvent {
        public static final DisputesClicked INSTANCE = new DisputesClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof DisputesClicked);
        }

        public final int hashCode() {
            return -726726465;
        }

        public final String toString() {
            return "DisputesClicked";
        }
    }

    public final class MoreContactOptionsClicked implements SupportHomeViewEvent {
        public static final MoreContactOptionsClicked INSTANCE = new MoreContactOptionsClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof MoreContactOptionsClicked);
        }

        public final int hashCode() {
            return 1689414299;
        }

        public final String toString() {
            return "MoreContactOptionsClicked";
        }
    }

    public final class NotificationClicked implements SupportHomeViewEvent {
        public final SupportNotification.Trigger trigger;

        public NotificationClicked(SupportNotification.Trigger trigger) {
            trigger.getClass();
            this.trigger = trigger;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NotificationClicked) && Intrinsics.areEqual(this.trigger, ((NotificationClicked) obj).trigger);
        }

        public final int hashCode() {
            return this.trigger.hashCode();
        }

        public final String toString() {
            return "NotificationClicked(trigger=" + this.trigger + ")";
        }
    }

    public final class PhoneClicked implements SupportHomeViewEvent {
        public static final PhoneClicked INSTANCE = new PhoneClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof PhoneClicked);
        }

        public final int hashCode() {
            return 1332117618;
        }

        public final String toString() {
            return "PhoneClicked";
        }
    }

    public final class ProminentSupportContactClicked implements SupportHomeViewEvent {
        public static final ProminentSupportContactClicked INSTANCE = new ProminentSupportContactClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ProminentSupportContactClicked);
        }

        public final int hashCode() {
            return 1443536969;
        }

        public final String toString() {
            return "ProminentSupportContactClicked";
        }
    }

    public final class SearchClicked implements SupportHomeViewEvent {
        public static final SearchClicked INSTANCE = new SearchClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SearchClicked);
        }

        public final int hashCode() {
            return 1712610022;
        }

        public final String toString() {
            return "SearchClicked";
        }
    }

    public final class SuggestedActionClicked implements SupportHomeViewEvent {
        public final Link link;

        public SuggestedActionClicked(Link link) {
            this.link = link;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SuggestedActionClicked) && this.link.equals(((SuggestedActionClicked) obj).link);
        }

        public final int hashCode() {
            return this.link.hashCode();
        }

        public final String toString() {
            return "SuggestedActionClicked(link=" + this.link + ")";
        }
    }

    public final class ViewMoreTransactionClicked implements SupportHomeViewEvent {
        public static final ViewMoreTransactionClicked INSTANCE = new ViewMoreTransactionClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ViewMoreTransactionClicked);
        }

        public final int hashCode() {
            return -559708548;
        }

        public final String toString() {
            return "ViewMoreTransactionClicked";
        }
    }
}
