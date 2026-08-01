package dev.cct.translatorapp.dataModel;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.Serializable;

/* compiled from: DictionaryModel.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J+\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR \u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\b\"\u0004\b\n\u0010\u000bR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\u000b¨\u0006\u0018"}, d2 = {"Ldev/cct/translatorapp/dataModel/DictionaryModel;", "", "definition", "", "synonyms", "example", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDefinition", "()Ljava/lang/String;", "getExample", "setExample", "(Ljava/lang/String;)V", "getSynonyms", "setSynonyms", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "Translator_1.0.32_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Serializable
/* loaded from: classes3.dex */
public final /* data */ class DictionaryModel {

    @SerializedName("definition")
    private final String definition;

    @SerializedName("example")
    private String example;

    @SerializedName("synonyms")
    private String synonyms;

    public DictionaryModel() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ DictionaryModel copy$default(DictionaryModel dictionaryModel, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dictionaryModel.definition;
        }
        if ((i & 2) != 0) {
            str2 = dictionaryModel.synonyms;
        }
        if ((i & 4) != 0) {
            str3 = dictionaryModel.example;
        }
        return dictionaryModel.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getDefinition() {
        return this.definition;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSynonyms() {
        return this.synonyms;
    }

    /* renamed from: component3, reason: from getter */
    public final String getExample() {
        return this.example;
    }

    public final DictionaryModel copy(String definition, String synonyms, String example) {
        Intrinsics.checkNotNullParameter(synonyms, "synonyms");
        return new DictionaryModel(definition, synonyms, example);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DictionaryModel)) {
            return false;
        }
        DictionaryModel dictionaryModel = (DictionaryModel) other;
        return Intrinsics.areEqual(this.definition, dictionaryModel.definition) && Intrinsics.areEqual(this.synonyms, dictionaryModel.synonyms) && Intrinsics.areEqual(this.example, dictionaryModel.example);
    }

    public int hashCode() {
        String str = this.definition;
        int hashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.synonyms.hashCode()) * 31;
        String str2 = this.example;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "DictionaryModel(definition=" + this.definition + ", synonyms=" + this.synonyms + ", example=" + this.example + ")";
    }

    public DictionaryModel(String str, String synonyms, String str2) {
        Intrinsics.checkNotNullParameter(synonyms, "synonyms");
        this.definition = str;
        this.synonyms = synonyms;
        this.example = str2;
    }

    public /* synthetic */ DictionaryModel(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : str3);
    }

    public final String getDefinition() {
        return this.definition;
    }

    public final String getSynonyms() {
        return this.synonyms;
    }

    public final void setSynonyms(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.synonyms = str;
    }

    public final String getExample() {
        return this.example;
    }

    public final void setExample(String str) {
        this.example = str;
    }
}
