package com.squareup.cash.support.viewmodels;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.support.backend.api.activities.SupportTransaction;
import com.squareup.cash.support.backend.api.articles.Article;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public interface ArticleViewModel {

    public final class ContactOption {
        public final boolean isEnabled;
        public final String subtitle;

        /* renamed from: type, reason: collision with root package name */
        public final Article.ContactOption f1208type;

        public ContactOption(String str, boolean z, Article.ContactOption contactOption) {
            this.subtitle = str;
            this.isEnabled = z;
            this.f1208type = contactOption;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ContactOption)) {
                return false;
            }
            ContactOption contactOption = (ContactOption) obj;
            return Intrinsics.areEqual(this.subtitle, contactOption.subtitle) && this.isEnabled == contactOption.isEnabled && this.f1208type == contactOption.f1208type;
        }

        public final int hashCode() {
            String str = this.subtitle;
            return this.f1208type.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((str == null ? 0 : str.hashCode()) * 31, 31, this.isEnabled);
        }

        public final String toString() {
            StringBuilder m1540m = Request$Priority$EnumUnboxingLocalUtility.m1540m("ContactOption(subtitle=", this.subtitle, ", isEnabled=", ", type=", this.isEnabled);
            m1540m.append(this.f1208type);
            m1540m.append(")");
            return m1540m.toString();
        }
    }

    public final class Error implements ArticleViewModel {
        public final boolean isRetryable;

        public Error(boolean z) {
            this.isRetryable = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Error) && this.isRetryable == ((Error) obj).isRetryable;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.isRetryable);
        }

        public final String toString() {
            return Fragment$5$$ExternalSyntheticOutline0.m("Error(isRetryable=", ")", this.isRetryable);
        }
    }

    public final class Loading implements ArticleViewModel {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return 397244906;
        }

        public final String toString() {
            return "Loading";
        }
    }

    public final class Loaded implements ArticleViewModel {
        public final Article article;
        public final List displayContactOptions;
        public final String html;
        public final SupportTransaction transaction;

        public Loaded(Article article, String str, List list, SupportTransaction supportTransaction) {
            list.getClass();
            this.article = article;
            this.html = str;
            this.displayContactOptions = list;
            this.transaction = supportTransaction;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) obj;
            return Intrinsics.areEqual(this.article, loaded.article) && Intrinsics.areEqual(this.html, loaded.html) && Intrinsics.areEqual(this.displayContactOptions, loaded.displayContactOptions) && Intrinsics.areEqual(this.transaction, loaded.transaction);
        }

        public final int hashCode() {
            int m = Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.article.hashCode() * 31, 31, this.html), 31, this.displayContactOptions);
            SupportTransaction supportTransaction = this.transaction;
            return m + (supportTransaction == null ? 0 : supportTransaction.hashCode());
        }

        public final String toString() {
            return "Loaded(article=" + this.article + ", html=" + this.html + ", displayContactOptions=" + this.displayContactOptions + ", transaction=" + this.transaction + ")";
        }

        public Loaded(Article article, String str, List list, SupportTransaction supportTransaction, int i) {
            this(article, str, (i & 4) != 0 ? EmptyList.INSTANCE : list, (i & 8) != 0 ? null : supportTransaction);
        }
    }
}
