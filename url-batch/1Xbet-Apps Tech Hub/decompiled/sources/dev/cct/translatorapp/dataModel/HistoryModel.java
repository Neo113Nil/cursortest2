package dev.cct.translatorapp.dataModel;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import io.ktor.http.ContentDisposition;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jacoco.core.runtime.AgentOptions;

/* compiled from: TranslationModel.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0001,B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004BA\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0002\u0010\u000fJ\t\u0010\u001b\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001c\u001a\u00020\bHÆ\u0003J\t\u0010\u001d\u001a\u00020\bHÆ\u0003J\t\u0010\u001e\u001a\u00020\bHÆ\u0003J\t\u0010\u001f\u001a\u00020\bHÆ\u0003J\t\u0010 \u001a\u00020\rHÆ\u0003J\t\u0010!\u001a\u00020\rHÆ\u0003JO\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\rHÆ\u0001J\b\u0010#\u001a\u00020\u0006H\u0016J\u0013\u0010$\u001a\u00020\r2\b\u0010%\u001a\u0004\u0018\u00010&HÖ\u0003J\t\u0010'\u001a\u00020\u0006HÖ\u0001J\t\u0010(\u001a\u00020\bHÖ\u0001J\u0018\u0010)\u001a\u00020*2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010+\u001a\u00020\u0006H\u0016R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u000e\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0015\"\u0004\b\u0018\u0010\u0017R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0011\u0010\u000b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011¨\u0006-"}, d2 = {"Ldev/cct/translatorapp/dataModel/HistoryModel;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", FacebookMediationAdapter.KEY_ID, "", "iLangC", "", "oLangC", "input", AgentOptions.OUTPUT, "isFavorite", "", "isSelected", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V", "getILangC", "()Ljava/lang/String;", "getId", "()I", "getInput", "()Z", "setFavorite", "(Z)V", "setSelected", "getOLangC", "getOutput", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "flags", "CREATOR", "Translator_1.0.32_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class HistoryModel implements Parcelable {

    /* renamed from: CREATOR, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String iLangC;
    private final int id;
    private final String input;
    private boolean isFavorite;
    private boolean isSelected;
    private final String oLangC;
    private final String output;

    public static /* synthetic */ HistoryModel copy$default(HistoryModel historyModel, int i, String str, String str2, String str3, String str4, boolean z, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = historyModel.id;
        }
        if ((i2 & 2) != 0) {
            str = historyModel.iLangC;
        }
        String str5 = str;
        if ((i2 & 4) != 0) {
            str2 = historyModel.oLangC;
        }
        String str6 = str2;
        if ((i2 & 8) != 0) {
            str3 = historyModel.input;
        }
        String str7 = str3;
        if ((i2 & 16) != 0) {
            str4 = historyModel.output;
        }
        String str8 = str4;
        if ((i2 & 32) != 0) {
            z = historyModel.isFavorite;
        }
        boolean z3 = z;
        if ((i2 & 64) != 0) {
            z2 = historyModel.isSelected;
        }
        return historyModel.copy(i, str5, str6, str7, str8, z3, z2);
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

    public final HistoryModel copy(int id, String iLangC, String oLangC, String input, String output, boolean isFavorite, boolean isSelected) {
        Intrinsics.checkNotNullParameter(iLangC, "iLangC");
        Intrinsics.checkNotNullParameter(oLangC, "oLangC");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(output, "output");
        return new HistoryModel(id, iLangC, oLangC, input, output, isFavorite, isSelected);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HistoryModel)) {
            return false;
        }
        HistoryModel historyModel = (HistoryModel) other;
        return this.id == historyModel.id && Intrinsics.areEqual(this.iLangC, historyModel.iLangC) && Intrinsics.areEqual(this.oLangC, historyModel.oLangC) && Intrinsics.areEqual(this.input, historyModel.input) && Intrinsics.areEqual(this.output, historyModel.output) && this.isFavorite == historyModel.isFavorite && this.isSelected == historyModel.isSelected;
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
        return "HistoryModel(id=" + this.id + ", iLangC=" + this.iLangC + ", oLangC=" + this.oLangC + ", input=" + this.input + ", output=" + this.output + ", isFavorite=" + this.isFavorite + ", isSelected=" + this.isSelected + ")";
    }

    public HistoryModel(int i, String iLangC, String oLangC, String input, String output, boolean z, boolean z2) {
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

    public /* synthetic */ HistoryModel(int i, String str, String str2, String str3, String str4, boolean z, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
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

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HistoryModel(Parcel parcel) {
        this(parcel.readInt(), String.valueOf(parcel.readString()), String.valueOf(parcel.readString()), String.valueOf(parcel.readString()), String.valueOf(parcel.readString()), parcel.readByte() != 0, parcel.readByte() != 0);
        Intrinsics.checkNotNullParameter(parcel, "parcel");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeInt(this.id);
        parcel.writeString(this.iLangC);
        parcel.writeString(this.oLangC);
        parcel.writeString(this.input);
        parcel.writeString(this.output);
        parcel.writeByte(this.isFavorite ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isSelected ? (byte) 1 : (byte) 0);
    }

    /* compiled from: TranslationModel.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Ldev/cct/translatorapp/dataModel/HistoryModel$CREATOR;", "Landroid/os/Parcelable$Creator;", "Ldev/cct/translatorapp/dataModel/HistoryModel;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", ContentDisposition.Parameters.Size, "", "(I)[Ldev/cct/translatorapp/dataModel/HistoryModel;", "Translator_1.0.32_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: dev.cct.translatorapp.dataModel.HistoryModel$CREATOR, reason: from kotlin metadata */
    public static final class Companion implements Parcelable.Creator<HistoryModel> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public HistoryModel createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new HistoryModel(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public HistoryModel[] newArray(int size) {
            return new HistoryModel[size];
        }
    }
}
