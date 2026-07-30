package com.aviatorvaangu.aviapp46.data;

import androidx.compose.ui.tooling.preview.AndroidUiModes;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AppModels.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/aviatorvaangu/aviapp46/data/GuideTopic;", "", "title", "", "articleBeforeAd", "articleAfterAd", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getArticleBeforeAd", "getArticleAfterAd", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app"}, k = 1, mv = {2, 2, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes3.dex */
public final /* data */ class GuideTopic {
    public static final int $stable = 0;
    private final String articleAfterAd;
    private final String articleBeforeAd;
    private final String title;

    public static /* synthetic */ GuideTopic copy$default(GuideTopic guideTopic, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = guideTopic.title;
        }
        if ((i & 2) != 0) {
            str2 = guideTopic.articleBeforeAd;
        }
        if ((i & 4) != 0) {
            str3 = guideTopic.articleAfterAd;
        }
        return guideTopic.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getArticleBeforeAd() {
        return this.articleBeforeAd;
    }

    /* renamed from: component3, reason: from getter */
    public final String getArticleAfterAd() {
        return this.articleAfterAd;
    }

    public final GuideTopic copy(String title, String articleBeforeAd, String articleAfterAd) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(articleBeforeAd, "articleBeforeAd");
        Intrinsics.checkNotNullParameter(articleAfterAd, "articleAfterAd");
        return new GuideTopic(title, articleBeforeAd, articleAfterAd);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GuideTopic)) {
            return false;
        }
        GuideTopic guideTopic = (GuideTopic) other;
        return Intrinsics.areEqual(this.title, guideTopic.title) && Intrinsics.areEqual(this.articleBeforeAd, guideTopic.articleBeforeAd) && Intrinsics.areEqual(this.articleAfterAd, guideTopic.articleAfterAd);
    }

    public int hashCode() {
        return (((this.title.hashCode() * 31) + this.articleBeforeAd.hashCode()) * 31) + this.articleAfterAd.hashCode();
    }

    public String toString() {
        return "GuideTopic(title=" + this.title + ", articleBeforeAd=" + this.articleBeforeAd + ", articleAfterAd=" + this.articleAfterAd + ")";
    }

    public GuideTopic(String title, String articleBeforeAd, String articleAfterAd) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(articleBeforeAd, "articleBeforeAd");
        Intrinsics.checkNotNullParameter(articleAfterAd, "articleAfterAd");
        this.title = title;
        this.articleBeforeAd = articleBeforeAd;
        this.articleAfterAd = articleAfterAd;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getArticleBeforeAd() {
        return this.articleBeforeAd;
    }

    public final String getArticleAfterAd() {
        return this.articleAfterAd;
    }
}
