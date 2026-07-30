package com.aviatorvaangu.aviapp46.data;

import androidx.compose.ui.tooling.preview.AndroidUiModes;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AppModels.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, d2 = {"Lcom/aviatorvaangu/aviapp46/data/OnboardingPage;", "", "title", "", "description", "imageMode", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;I)V", "getTitle", "()Ljava/lang/String;", "getDescription", "getImageMode", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "app"}, k = 1, mv = {2, 2, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes3.dex */
public final /* data */ class OnboardingPage {
    public static final int $stable = 0;
    private final String description;
    private final int imageMode;
    private final String title;

    public static /* synthetic */ OnboardingPage copy$default(OnboardingPage onboardingPage, String str, String str2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = onboardingPage.title;
        }
        if ((i2 & 2) != 0) {
            str2 = onboardingPage.description;
        }
        if ((i2 & 4) != 0) {
            i = onboardingPage.imageMode;
        }
        return onboardingPage.copy(str, str2, i);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component3, reason: from getter */
    public final int getImageMode() {
        return this.imageMode;
    }

    public final OnboardingPage copy(String title, String description, int imageMode) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        return new OnboardingPage(title, description, imageMode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OnboardingPage)) {
            return false;
        }
        OnboardingPage onboardingPage = (OnboardingPage) other;
        return Intrinsics.areEqual(this.title, onboardingPage.title) && Intrinsics.areEqual(this.description, onboardingPage.description) && this.imageMode == onboardingPage.imageMode;
    }

    public int hashCode() {
        return (((this.title.hashCode() * 31) + this.description.hashCode()) * 31) + Integer.hashCode(this.imageMode);
    }

    public String toString() {
        return "OnboardingPage(title=" + this.title + ", description=" + this.description + ", imageMode=" + this.imageMode + ")";
    }

    public OnboardingPage(String title, String description, int i) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.title = title;
        this.description = description;
        this.imageMode = i;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getDescription() {
        return this.description;
    }

    public final int getImageMode() {
        return this.imageMode;
    }
}
