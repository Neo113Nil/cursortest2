package com.squareup.cash.support.viewmodels;

import com.squareup.cash.activity.backend.FormattedPaymentHistoryActivityItem;
import com.squareup.cash.support.backend.api.articles.Article;
import com.squareup.cash.support.backend.api.articles.Link;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public abstract class ArticleViewEvent {

    public final class ActivityTransactionClicked extends ArticleViewEvent {
        public final FormattedPaymentHistoryActivityItem activityItem;

        public ActivityTransactionClicked(FormattedPaymentHistoryActivityItem formattedPaymentHistoryActivityItem) {
            this.activityItem = formattedPaymentHistoryActivityItem;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ActivityTransactionClicked) && this.activityItem.equals(((ActivityTransactionClicked) obj).activityItem);
        }

        public final int hashCode() {
            return this.activityItem.hashCode();
        }

        public final String toString() {
            return "ActivityTransactionClicked(activityItem=" + this.activityItem + ")";
        }
    }

    public final class ClickCallToAction extends ClickLink {
        public final Link link;

        public ClickCallToAction(Link link) {
            link.getClass();
            this.link = link;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ClickCallToAction) && Intrinsics.areEqual(this.link, ((ClickCallToAction) obj).link);
        }

        @Override // com.squareup.cash.support.viewmodels.ArticleViewEvent.ClickLink
        public final Link getLink() {
            return this.link;
        }

        public final int hashCode() {
            return this.link.hashCode();
        }

        public final String toString() {
            return "ClickCallToAction(link=" + this.link + ")";
        }
    }

    public abstract class ClickLink extends ArticleViewEvent {
        public abstract Link getLink();
    }

    public final class ClickSupportLink extends ClickLink {
        public final Link link;

        public ClickSupportLink(Link link) {
            link.getClass();
            this.link = link;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ClickSupportLink) && Intrinsics.areEqual(this.link, ((ClickSupportLink) obj).link);
        }

        @Override // com.squareup.cash.support.viewmodels.ArticleViewEvent.ClickLink
        public final Link getLink() {
            return this.link;
        }

        public final int hashCode() {
            return this.link.hashCode();
        }

        public final String toString() {
            return "ClickSupportLink(link=" + this.link + ")";
        }
    }

    public final class Contact extends ArticleViewEvent {
        public final Article.ContactOption option;

        public Contact(Article.ContactOption contactOption) {
            contactOption.getClass();
            this.option = contactOption;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Contact) && this.option == ((Contact) obj).option;
        }

        public final int hashCode() {
            return this.option.hashCode();
        }

        public final String toString() {
            return "Contact(option=" + this.option + ")";
        }
    }

    public final class GoBack extends ArticleViewEvent {
        public static final GoBack INSTANCE = new GoBack();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof GoBack);
        }

        public final int hashCode() {
            return 1470358256;
        }

        public final String toString() {
            return "GoBack";
        }
    }

    /* loaded from: classes6.dex */
    public final class NoWebViewProvided extends ArticleViewEvent {
        public static final NoWebViewProvided INSTANCE = new NoWebViewProvided();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NoWebViewProvided);
        }

        public final int hashCode() {
            return 1369519482;
        }

        public final String toString() {
            return "NoWebViewProvided";
        }
    }

    public final class OpenUrl extends ArticleViewEvent {
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

    public final class Retry extends ArticleViewEvent {
        public static final Retry INSTANCE = new Retry();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Retry);
        }

        public final int hashCode() {
            return -1051038329;
        }

        public final String toString() {
            return "Retry";
        }
    }
}
