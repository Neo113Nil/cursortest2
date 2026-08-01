package dev.cct.translatorapp.dataModel;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jacoco.core.runtime.AgentOptions;

/* compiled from: TranslationModel.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\"\b\u0087\b\u0018\u00002\u00020\u0001Be\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0002\u0010\u000fJ\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\rHÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010)\u001a\u00020\rHÆ\u0003Js\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\rHÆ\u0001J\u0013\u0010+\u001a\u00020\r2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020\u0003HÖ\u0001J\t\u0010.\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u000e\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0016\"\u0004\b\u0019\u0010\u0018R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0011\"\u0004\b\u001b\u0010\u001cR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0011¨\u0006/"}, d2 = {"Ldev/cct/translatorapp/dataModel/ConversationModel;", "", FacebookMediationAdapter.KEY_ID, "", "input", "", AgentOptions.OUTPUT, "inputLang", "outputLang", "itemType", "iLangC", "oLangC", "isFavorite", "", "isSelected", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V", "getILangC", "()Ljava/lang/String;", "getId", "()I", "getInput", "getInputLang", "()Z", "setFavorite", "(Z)V", "setSelected", "getItemType", "setItemType", "(Ljava/lang/String;)V", "getOLangC", "getOutput", "getOutputLang", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "Translator_1.0.32_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ConversationModel {
    private final String iLangC;
    private final int id;
    private final String input;
    private final String inputLang;
    private boolean isFavorite;
    private boolean isSelected;
    private String itemType;
    private final String oLangC;
    private final String output;
    private final String outputLang;

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    /* renamed from: component2, reason: from getter */
    public final String getInput() {
        return this.input;
    }

    /* renamed from: component3, reason: from getter */
    public final String getOutput() {
        return this.output;
    }

    /* renamed from: component4, reason: from getter */
    public final String getInputLang() {
        return this.inputLang;
    }

    /* renamed from: component5, reason: from getter */
    public final String getOutputLang() {
        return this.outputLang;
    }

    /* renamed from: component6, reason: from getter */
    public final String getItemType() {
        return this.itemType;
    }

    /* renamed from: component7, reason: from getter */
    public final String getILangC() {
        return this.iLangC;
    }

    /* renamed from: component8, reason: from getter */
    public final String getOLangC() {
        return this.oLangC;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getIsFavorite() {
        return this.isFavorite;
    }

    public final ConversationModel copy(int id, String input, String output, String inputLang, String outputLang, String itemType, String iLangC, String oLangC, boolean isFavorite, boolean isSelected) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(inputLang, "inputLang");
        Intrinsics.checkNotNullParameter(outputLang, "outputLang");
        return new ConversationModel(id, input, output, inputLang, outputLang, itemType, iLangC, oLangC, isFavorite, isSelected);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConversationModel)) {
            return false;
        }
        ConversationModel conversationModel = (ConversationModel) other;
        return this.id == conversationModel.id && Intrinsics.areEqual(this.input, conversationModel.input) && Intrinsics.areEqual(this.output, conversationModel.output) && Intrinsics.areEqual(this.inputLang, conversationModel.inputLang) && Intrinsics.areEqual(this.outputLang, conversationModel.outputLang) && Intrinsics.areEqual(this.itemType, conversationModel.itemType) && Intrinsics.areEqual(this.iLangC, conversationModel.iLangC) && Intrinsics.areEqual(this.oLangC, conversationModel.oLangC) && this.isFavorite == conversationModel.isFavorite && this.isSelected == conversationModel.isSelected;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((((Integer.hashCode(this.id) * 31) + this.input.hashCode()) * 31) + this.output.hashCode()) * 31) + this.inputLang.hashCode()) * 31) + this.outputLang.hashCode()) * 31;
        String str = this.itemType;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.iLangC;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.oLangC;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        boolean z = this.isFavorite;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode4 + i) * 31;
        boolean z2 = this.isSelected;
        return i2 + (z2 ? 1 : z2 ? 1 : 0);
    }

    public String toString() {
        return "ConversationModel(id=" + this.id + ", input=" + this.input + ", output=" + this.output + ", inputLang=" + this.inputLang + ", outputLang=" + this.outputLang + ", itemType=" + this.itemType + ", iLangC=" + this.iLangC + ", oLangC=" + this.oLangC + ", isFavorite=" + this.isFavorite + ", isSelected=" + this.isSelected + ")";
    }

    public ConversationModel(int i, String input, String output, String inputLang, String outputLang, String str, String str2, String str3, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(inputLang, "inputLang");
        Intrinsics.checkNotNullParameter(outputLang, "outputLang");
        this.id = i;
        this.input = input;
        this.output = output;
        this.inputLang = inputLang;
        this.outputLang = outputLang;
        this.itemType = str;
        this.iLangC = str2;
        this.oLangC = str3;
        this.isFavorite = z;
        this.isSelected = z2;
    }

    public /* synthetic */ ConversationModel(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, str2, str3, str4, (i2 & 32) != 0 ? null : str5, (i2 & 64) != 0 ? null : str6, (i2 & 128) != 0 ? null : str7, (i2 & 256) != 0 ? false : z, (i2 & 512) != 0 ? false : z2);
    }

    public final int getId() {
        return this.id;
    }

    public final String getInput() {
        return this.input;
    }

    public final String getOutput() {
        return this.output;
    }

    public final String getInputLang() {
        return this.inputLang;
    }

    public final String getOutputLang() {
        return this.outputLang;
    }

    public final String getItemType() {
        return this.itemType;
    }

    public final void setItemType(String str) {
        this.itemType = str;
    }

    public final String getILangC() {
        return this.iLangC;
    }

    public final String getOLangC() {
        return this.oLangC;
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
