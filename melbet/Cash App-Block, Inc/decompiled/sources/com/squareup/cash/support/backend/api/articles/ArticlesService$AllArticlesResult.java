package com.squareup.cash.support.backend.api.articles;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public interface ArticlesService$AllArticlesResult {

    public final class Failure implements ArticlesService$AllArticlesResult {
        public static final Failure INSTANCE = new Failure();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Failure);
        }

        public final int hashCode() {
            return -775523409;
        }

        public final String toString() {
            return "Failure";
        }
    }

    public final class Success implements ArticlesService$AllArticlesResult {
        public final ArrayList homeArticles;
        public final List recommendedArticles;

        public Success(ArrayList arrayList, List list) {
            list.getClass();
            this.recommendedArticles = list;
            this.homeArticles = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Success)) {
                return false;
            }
            Success success = (Success) obj;
            return Intrinsics.areEqual(this.recommendedArticles, success.recommendedArticles) && this.homeArticles.equals(success.homeArticles);
        }

        public final int hashCode() {
            return this.homeArticles.hashCode() + (this.recommendedArticles.hashCode() * 31);
        }

        public final String toString() {
            return "Success(recommendedArticles=" + this.recommendedArticles + ", homeArticles=" + this.homeArticles + ")";
        }
    }
}
