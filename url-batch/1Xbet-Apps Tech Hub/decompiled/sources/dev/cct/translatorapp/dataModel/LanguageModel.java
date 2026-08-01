package dev.cct.translatorapp.dataModel;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LanguageModel.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J1\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0006HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\u001a\u0010\u0007\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012¨\u0006\u001f"}, d2 = {"Ldev/cct/translatorapp/dataModel/LanguageModel;", "", "image", "", "lang", "langName", "", "langCode", "(IILjava/lang/String;Ljava/lang/String;)V", "getImage", "()I", "setImage", "(I)V", "getLang", "setLang", "getLangCode", "()Ljava/lang/String;", "setLangCode", "(Ljava/lang/String;)V", "getLangName", "setLangName", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "Translator_1.0.32_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class LanguageModel {
    private int image;
    private int lang;
    private String langCode;
    private String langName;

    public static /* synthetic */ LanguageModel copy$default(LanguageModel languageModel, int i, int i2, String str, String str2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = languageModel.image;
        }
        if ((i3 & 2) != 0) {
            i2 = languageModel.lang;
        }
        if ((i3 & 4) != 0) {
            str = languageModel.langName;
        }
        if ((i3 & 8) != 0) {
            str2 = languageModel.langCode;
        }
        return languageModel.copy(i, i2, str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getImage() {
        return this.image;
    }

    /* renamed from: component2, reason: from getter */
    public final int getLang() {
        return this.lang;
    }

    /* renamed from: component3, reason: from getter */
    public final String getLangName() {
        return this.langName;
    }

    /* renamed from: component4, reason: from getter */
    public final String getLangCode() {
        return this.langCode;
    }

    public final LanguageModel copy(int image, int lang, String langName, String langCode) {
        Intrinsics.checkNotNullParameter(langName, "langName");
        Intrinsics.checkNotNullParameter(langCode, "langCode");
        return new LanguageModel(image, lang, langName, langCode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LanguageModel)) {
            return false;
        }
        LanguageModel languageModel = (LanguageModel) other;
        return this.image == languageModel.image && this.lang == languageModel.lang && Intrinsics.areEqual(this.langName, languageModel.langName) && Intrinsics.areEqual(this.langCode, languageModel.langCode);
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.image) * 31) + Integer.hashCode(this.lang)) * 31) + this.langName.hashCode()) * 31) + this.langCode.hashCode();
    }

    public String toString() {
        return "LanguageModel(image=" + this.image + ", lang=" + this.lang + ", langName=" + this.langName + ", langCode=" + this.langCode + ")";
    }

    public LanguageModel(int i, int i2, String langName, String langCode) {
        Intrinsics.checkNotNullParameter(langName, "langName");
        Intrinsics.checkNotNullParameter(langCode, "langCode");
        this.image = i;
        this.lang = i2;
        this.langName = langName;
        this.langCode = langCode;
    }

    public final int getImage() {
        return this.image;
    }

    public final int getLang() {
        return this.lang;
    }

    public final String getLangCode() {
        return this.langCode;
    }

    public final String getLangName() {
        return this.langName;
    }

    public final void setImage(int i) {
        this.image = i;
    }

    public final void setLang(int i) {
        this.lang = i;
    }

    public final void setLangCode(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.langCode = str;
    }

    public final void setLangName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.langName = str;
    }
}
