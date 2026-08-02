package com.squareup.cash.support.backend.api.articles;

import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;

/* loaded from: classes7.dex */
public interface ArticlesService$ArticleResult {

    public final class Failure implements ArticlesService$ArticleResult {
        public final boolean isRetryable;

        public Failure(boolean z) {
            this.isRetryable = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Failure) && this.isRetryable == ((Failure) obj).isRetryable;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.isRetryable);
        }

        public final String toString() {
            return Fragment$5$$ExternalSyntheticOutline0.m("Failure(isRetryable=", ")", this.isRetryable);
        }
    }

    public final class Success implements ArticlesService$ArticleResult {
        public final Article article;
        public final String html;

        public Success(Article article, String str) {
            this.article = article;
            this.html = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Success)) {
                return false;
            }
            Success success = (Success) obj;
            return this.article.equals(success.article) && this.html.equals(success.html);
        }

        public final int hashCode() {
            return this.html.hashCode() + (this.article.hashCode() * 31);
        }

        public final String toString() {
            return "Success(article=" + this.article + ", html=" + this.html + ")";
        }
    }
}
