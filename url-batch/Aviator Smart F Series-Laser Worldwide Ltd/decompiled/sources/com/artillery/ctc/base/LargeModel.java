package com.artillery.ctc.base;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;

@Keep
/* loaded from: classes.dex */
public final class LargeModel implements Parcelable {
    public static final Parcelable.Creator<LargeModel> CREATOR = new a();
    public final String icon;
    public final String name;
    public final String type;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final LargeModel createFromParcel(Parcel parcel) {
            s.checkNotNullParameter(parcel, "parcel");
            return new LargeModel(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final LargeModel[] newArray(int i8) {
            return new LargeModel[i8];
        }
    }

    public LargeModel() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ LargeModel copy$default(LargeModel largeModel, String str, String str2, String str3, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = largeModel.icon;
        }
        if ((i8 & 2) != 0) {
            str2 = largeModel.type;
        }
        if ((i8 & 4) != 0) {
            str3 = largeModel.name;
        }
        return largeModel.copy(str, str2, str3);
    }

    public final String component1() {
        return this.icon;
    }

    public final String component2() {
        return this.type;
    }

    public final String component3() {
        return this.name;
    }

    public final LargeModel copy(String str, String str2, String str3) {
        return new LargeModel(str, str2, str3);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LargeModel)) {
            return false;
        }
        LargeModel largeModel = (LargeModel) obj;
        return s.areEqual(this.icon, largeModel.icon) && s.areEqual(this.type, largeModel.type) && s.areEqual(this.name, largeModel.name);
    }

    public int hashCode() {
        String str = this.icon;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.type;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.name;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "LargeModel(icon=" + this.icon + ", type=" + this.type + ", name=" + this.name + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        s.checkNotNullParameter(out, "out");
        out.writeString(this.icon);
        out.writeString(this.type);
        out.writeString(this.name);
    }

    public LargeModel(String str, String str2, String str3) {
        this.icon = str;
        this.type = str2;
        this.name = str3;
    }

    public /* synthetic */ LargeModel(String str, String str2, String str3, int i8, o oVar) {
        this((i8 & 1) != 0 ? null : str, (i8 & 2) != 0 ? null : str2, (i8 & 4) != 0 ? null : str3);
    }
}
