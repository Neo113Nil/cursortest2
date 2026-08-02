package com.squareup.cash.support.backend.api.articles;

import bo.app.re$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class Link {
    public final boolean includeInRecentlyViewed;
    public final boolean isMlSuggestion;
    public final String previewText;
    public final Target target;
    public final String title;
    public final String token;

    public interface Target {

        public final class Article implements Target {
            public final String token;

            public Article(String str) {
                str.getClass();
                this.token = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Article) && Intrinsics.areEqual(this.token, ((Article) obj).token);
            }

            public final int hashCode() {
                return this.token.hashCode();
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Article(token=", this.token, ")");
            }
        }

        public final class ClientRoute implements Target {
            public final String url;

            public ClientRoute(String str) {
                str.getClass();
                this.url = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ClientRoute) && Intrinsics.areEqual(this.url, ((ClientRoute) obj).url);
            }

            public final int hashCode() {
                return this.url.hashCode();
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ClientRoute(url=", this.url, ")");
            }
        }

        public final class ClientScenario implements Target {
            public final String stringRepresentation;

            public ClientScenario(String str) {
                str.getClass();
                this.stringRepresentation = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ClientScenario) && Intrinsics.areEqual(this.stringRepresentation, ((ClientScenario) obj).stringRepresentation);
            }

            public final int hashCode() {
                return this.stringRepresentation.hashCode();
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ClientScenario(stringRepresentation=", this.stringRepresentation, ")");
            }
        }

        public final class External implements Target {
            public final String url;

            public External(String str) {
                str.getClass();
                this.url = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof External) && Intrinsics.areEqual(this.url, ((External) obj).url);
            }

            public final int hashCode() {
                return this.url.hashCode();
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("External(url=", this.url, ")");
            }
        }
    }

    public /* synthetic */ Link(String str, String str2, Target target, boolean z, int i) {
        this(str, str2, target, z, (i & 16) != 0 ? null : "preview text", false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Link)) {
            return false;
        }
        Link link = (Link) obj;
        return Intrinsics.areEqual(this.token, link.token) && Intrinsics.areEqual(this.title, link.title) && Intrinsics.areEqual(this.target, link.target) && this.includeInRecentlyViewed == link.includeInRecentlyViewed && Intrinsics.areEqual(this.previewText, link.previewText) && this.isMlSuggestion == link.isMlSuggestion;
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.target.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.token.hashCode() * 31, 31, this.title)) * 31, 31, this.includeInRecentlyViewed);
        String str = this.previewText;
        return Boolean.hashCode(this.isMlSuggestion) + ((m + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Link(token=", this.token, ", title=", this.title, ", target=");
        m.append(this.target);
        m.append(", includeInRecentlyViewed=");
        m.append(this.includeInRecentlyViewed);
        m.append(", previewText=");
        return re$$ExternalSyntheticOutline0.m(m, this.previewText, ", isMlSuggestion=", this.isMlSuggestion, ")");
    }

    public Link(String str, String str2, Target target, boolean z, String str3, boolean z2) {
        str.getClass();
        this.token = str;
        this.title = str2;
        this.target = target;
        this.includeInRecentlyViewed = z;
        this.previewText = str3;
        this.isMlSuggestion = z2;
    }
}
