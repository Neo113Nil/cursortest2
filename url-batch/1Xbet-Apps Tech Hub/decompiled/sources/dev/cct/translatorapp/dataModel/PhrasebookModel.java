package dev.cct.translatorapp.dataModel;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PhrasebookModel.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0016"}, d2 = {"Ldev/cct/translatorapp/dataModel/PhrasebookModel;", "", "icon", "", "category", "", "path", "(ILjava/lang/String;Ljava/lang/String;)V", "getCategory", "()Ljava/lang/String;", "getIcon", "()I", "getPath", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "Translator_1.0.32_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PhrasebookModel {
    private final String category;
    private final int icon;
    private final String path;

    public static /* synthetic */ PhrasebookModel copy$default(PhrasebookModel phrasebookModel, int i, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = phrasebookModel.icon;
        }
        if ((i2 & 2) != 0) {
            str = phrasebookModel.category;
        }
        if ((i2 & 4) != 0) {
            str2 = phrasebookModel.path;
        }
        return phrasebookModel.copy(i, str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getIcon() {
        return this.icon;
    }

    /* renamed from: component2, reason: from getter */
    public final String getCategory() {
        return this.category;
    }

    /* renamed from: component3, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    public final PhrasebookModel copy(int icon, String category, String path) {
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(path, "path");
        return new PhrasebookModel(icon, category, path);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PhrasebookModel)) {
            return false;
        }
        PhrasebookModel phrasebookModel = (PhrasebookModel) other;
        return this.icon == phrasebookModel.icon && Intrinsics.areEqual(this.category, phrasebookModel.category) && Intrinsics.areEqual(this.path, phrasebookModel.path);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.icon) * 31) + this.category.hashCode()) * 31) + this.path.hashCode();
    }

    public String toString() {
        return "PhrasebookModel(icon=" + this.icon + ", category=" + this.category + ", path=" + this.path + ")";
    }

    public PhrasebookModel(int i, String category, String path) {
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(path, "path");
        this.icon = i;
        this.category = category;
        this.path = path;
    }

    public final String getCategory() {
        return this.category;
    }

    public final int getIcon() {
        return this.icon;
    }

    public final String getPath() {
        return this.path;
    }
}
