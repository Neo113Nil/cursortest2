package com.artillery.ctc.base;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;

@Keep
/* loaded from: classes.dex */
public final class OverseasConfigModel implements Parcelable {
    public static final Parcelable.Creator<OverseasConfigModel> CREATOR = new a();
    private final String ak;
    private final String sn;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final OverseasConfigModel createFromParcel(Parcel parcel) {
            s.checkNotNullParameter(parcel, "parcel");
            return new OverseasConfigModel(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final OverseasConfigModel[] newArray(int i8) {
            return new OverseasConfigModel[i8];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OverseasConfigModel() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ OverseasConfigModel copy$default(OverseasConfigModel overseasConfigModel, String str, String str2, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = overseasConfigModel.ak;
        }
        if ((i8 & 2) != 0) {
            str2 = overseasConfigModel.sn;
        }
        return overseasConfigModel.copy(str, str2);
    }

    public final String component1() {
        return this.ak;
    }

    public final String component2() {
        return this.sn;
    }

    public final OverseasConfigModel copy(String ak, String sn) {
        s.checkNotNullParameter(ak, "ak");
        s.checkNotNullParameter(sn, "sn");
        return new OverseasConfigModel(ak, sn);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OverseasConfigModel)) {
            return false;
        }
        OverseasConfigModel overseasConfigModel = (OverseasConfigModel) obj;
        return s.areEqual(this.ak, overseasConfigModel.ak) && s.areEqual(this.sn, overseasConfigModel.sn);
    }

    public final String getAk() {
        return this.ak;
    }

    public final String getSn() {
        return this.sn;
    }

    public int hashCode() {
        return (this.ak.hashCode() * 31) + this.sn.hashCode();
    }

    public final boolean isEmpty() {
        return this.ak.length() == 0 || this.sn.length() == 0;
    }

    public String toString() {
        return "OverseasConfigModel(ak=" + this.ak + ", sn=" + this.sn + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        s.checkNotNullParameter(out, "out");
        out.writeString(this.ak);
        out.writeString(this.sn);
    }

    public OverseasConfigModel(String ak, String sn) {
        s.checkNotNullParameter(ak, "ak");
        s.checkNotNullParameter(sn, "sn");
        this.ak = ak;
        this.sn = sn;
    }

    public /* synthetic */ OverseasConfigModel(String str, String str2, int i8, o oVar) {
        this((i8 & 1) != 0 ? "" : str, (i8 & 2) != 0 ? "" : str2);
    }
}
