package dev.cct.translatorapp.dataModel;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jacoco.core.runtime.AgentOptions;

/* compiled from: TranslationModel.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0002\u0010\fJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\nHÆ\u0003J\t\u0010\u001e\u001a\u00020\nHÆ\u0003JO\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001J\u0013\u0010 \u001a\u00020\n2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\u0003HÖ\u0001J\t\u0010#\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u000b\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0012\"\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000e¨\u0006$"}, d2 = {"Ldev/cct/translatorapp/dataModel/FavoriteModel;", "", FacebookMediationAdapter.KEY_ID, "", "iLangC", "", "oLangC", "input", AgentOptions.OUTPUT, "isFavorite", "", "isSelected", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V", "getILangC", "()Ljava/lang/String;", "getId", "()I", "getInput", "()Z", "setFavorite", "(Z)V", "setSelected", "getOLangC", "getOutput", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "Translator_1.0.32_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class FavoriteModel {
    private final String iLangC;
    private final int id;
    private final String input;
    private boolean isFavorite;
    private boolean isSelected;
    private final String oLangC;
    private final String output;

    public static /* synthetic */ FavoriteModel copy$default(FavoriteModel favoriteModel, int i, String str, String str2, String str3, String str4, boolean z, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = favoriteModel.id;
        }
        if ((i2 & 2) != 0) {
            str = favoriteModel.iLangC;
        }
        String str5 = str;
        if ((i2 & 4) != 0) {
            str2 = favoriteModel.oLangC;
        }
        String str6 = str2;
        if ((i2 & 8) != 0) {
            str3 = favoriteModel.input;
        }
        String str7 = str3;
        if ((i2 & 16) != 0) {
            str4 = favoriteModel.output;
        }
        String str8 = str4;
        if ((i2 & 32) != 0) {
            z = favoriteModel.isFavorite;
        }
        boolean z3 = z;
        if ((i2 & 64) != 0) {
            z2 = favoriteModel.isSelected;
        }
        return favoriteModel.copy(i, str5, str6, str7, str8, z3, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getILangC() {
        return this.iLangC;
    }

    /* renamed from: component3, reason: from getter */
    public final String getOLangC() {
        return this.oLangC;
    }

    /* renamed from: component4, reason: from getter */
    public final String getInput() {
        return this.input;
    }

    /* renamed from: component5, reason: from getter */
    public final String getOutput() {
        return this.output;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsFavorite() {
        return this.isFavorite;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    public final FavoriteModel copy(int id, String iLangC, String oLangC, String input, String output, boolean isFavorite, boolean isSelected) {
        Intrinsics.checkNotNullParameter(iLangC, "iLangC");
        Intrinsics.checkNotNullParameter(oLangC, "oLangC");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(output, "output");
        return new FavoriteModel(id, iLangC, oLangC, input, output, isFavorite, isSelected);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FavoriteModel)) {
            return false;
        }
        FavoriteModel favoriteModel = (FavoriteModel) other;
        return this.id == favoriteModel.id && Intrinsics.areEqual(this.iLangC, favoriteModel.iLangC) && Intrinsics.areEqual(this.oLangC, favoriteModel.oLangC) && Intrinsics.areEqual(this.input, favoriteModel.input) && Intrinsics.areEqual(this.output, favoriteModel.output) && this.isFavorite == favoriteModel.isFavorite && this.isSelected == favoriteModel.isSelected;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((((Integer.hashCode(this.id) * 31) + this.iLangC.hashCode()) * 31) + this.oLangC.hashCode()) * 31) + this.input.hashCode()) * 31) + this.output.hashCode()) * 31;
        boolean z = this.isFavorite;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        boolean z2 = this.isSelected;
        return i2 + (z2 ? 1 : z2 ? 1 : 0);
    }

    public String toString() {
        return "FavoriteModel(id=" + this.id + ", iLangC=" + this.iLangC + ", oLangC=" + this.oLangC + ", input=" + this.input + ", output=" + this.output + ", isFavorite=" + this.isFavorite + ", isSelected=" + this.isSelected + ")";
    }

    public FavoriteModel(int i, String iLangC, String oLangC, String input, String output, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(iLangC, "iLangC");
        Intrinsics.checkNotNullParameter(oLangC, "oLangC");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(output, "output");
        this.id = i;
        this.iLangC = iLangC;
        this.oLangC = oLangC;
        this.input = input;
        this.output = output;
        this.isFavorite = z;
        this.isSelected = z2;
    }

    public /* synthetic */ FavoriteModel(int i, String str, String str2, String str3, String str4, boolean z, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, str2, str3, str4, (i2 & 32) != 0 ? false : z, (i2 & 64) != 0 ? false : z2);
    }

    public final int getId() {
        return this.id;
    }

    public final String getILangC() {
        return this.iLangC;
    }

    public final String getOLangC() {
        return this.oLangC;
    }

    public final String getInput() {
        return this.input;
    }

    public final String getOutput() {
        return this.output;
    }

    public final boolean isFavorite() {
        return this.isFavorite;
    }

    public final void setFavorite(boolean z) {
        this.isFavorite = z;
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public final void setSelected(boolean z) {
        this.isSelected = z;
    }
}
