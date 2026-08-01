package dev.cct.translatorapp;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LanguageListModel.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Ldev/cct/translatorapp/LanguageListModel;", "", "langName", "", "currentLangName", "", "langCode", "(ILjava/lang/String;Ljava/lang/String;)V", "getCurrentLangName", "()Ljava/lang/String;", "setCurrentLangName", "(Ljava/lang/String;)V", "getLangCode", "getLangName", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "Translator_1.0.32_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class LanguageListModel {
    private String currentLangName;
    private final String langCode;
    private final int langName;

    public static /* synthetic */ LanguageListModel copy$default(LanguageListModel languageListModel, int i, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = languageListModel.langName;
        }
        if ((i2 & 2) != 0) {
            str = languageListModel.currentLangName;
        }
        if ((i2 & 4) != 0) {
            str2 = languageListModel.langCode;
        }
        return languageListModel.copy(i, str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getLangName() {
        return this.langName;
    }

    /* renamed from: component2, reason: from getter */
    public final String getCurrentLangName() {
        return this.currentLangName;
    }

    /* renamed from: component3, reason: from getter */
    public final String getLangCode() {
        return this.langCode;
    }

    public final LanguageListModel copy(int langName, String currentLangName, String langCode) {
        Intrinsics.checkNotNullParameter(currentLangName, "currentLangName");
        Intrinsics.checkNotNullParameter(langCode, "langCode");
        return new LanguageListModel(langName, currentLangName, langCode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LanguageListModel)) {
            return false;
        }
        LanguageListModel languageListModel = (LanguageListModel) other;
        return this.langName == languageListModel.langName && Intrinsics.areEqual(this.currentLangName, languageListModel.currentLangName) && Intrinsics.areEqual(this.langCode, languageListModel.langCode);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.langName) * 31) + this.currentLangName.hashCode()) * 31) + this.langCode.hashCode();
    }

    public String toString() {
        return "LanguageListModel(langName=" + this.langName + ", currentLangName=" + this.currentLangName + ", langCode=" + this.langCode + ")";
    }

    public LanguageListModel(int i, String currentLangName, String langCode) {
        Intrinsics.checkNotNullParameter(currentLangName, "currentLangName");
        Intrinsics.checkNotNullParameter(langCode, "langCode");
        this.langName = i;
        this.currentLangName = currentLangName;
        this.langCode = langCode;
    }

    public final String getCurrentLangName() {
        return this.currentLangName;
    }

    public final String getLangCode() {
        return this.langCode;
    }

    public final int getLangName() {
        return this.langName;
    }

    public final void setCurrentLangName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.currentLangName = str;
    }
}
