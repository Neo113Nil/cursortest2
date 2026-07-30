package com.artillery.ctc.base;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;

@Keep
/* loaded from: classes.dex */
public final class StParModel implements Parcelable {
    public static final Parcelable.Creator<StParModel> CREATOR = new a();
    public int channel;
    public int flag;
    public int from;
    public String gender;
    public boolean isRollback;
    public int sampleRate;
    public int sampleSizeInBits;
    public int to;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final StParModel createFromParcel(Parcel parcel) {
            s.checkNotNullParameter(parcel, "parcel");
            return new StParModel(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final StParModel[] newArray(int i8) {
            return new StParModel[i8];
        }
    }

    public StParModel(int i8, int i9, int i10, int i11, int i12, int i13, String gender, boolean z7) {
        s.checkNotNullParameter(gender, "gender");
        this.from = i8;
        this.to = i9;
        this.flag = i10;
        this.sampleRate = i11;
        this.channel = i12;
        this.sampleSizeInBits = i13;
        this.gender = gender;
        this.isRollback = z7;
    }

    public final int component1() {
        return this.from;
    }

    public final int component2() {
        return this.to;
    }

    public final int component3() {
        return this.flag;
    }

    public final int component4() {
        return this.sampleRate;
    }

    public final int component5() {
        return this.channel;
    }

    public final int component6() {
        return this.sampleSizeInBits;
    }

    public final String component7() {
        return this.gender;
    }

    public final boolean component8() {
        return this.isRollback;
    }

    public final StParModel copy(int i8, int i9, int i10, int i11, int i12, int i13, String gender, boolean z7) {
        s.checkNotNullParameter(gender, "gender");
        return new StParModel(i8, i9, i10, i11, i12, i13, gender, z7);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StParModel)) {
            return false;
        }
        StParModel stParModel = (StParModel) obj;
        return this.from == stParModel.from && this.to == stParModel.to && this.flag == stParModel.flag && this.sampleRate == stParModel.sampleRate && this.channel == stParModel.channel && this.sampleSizeInBits == stParModel.sampleSizeInBits && s.areEqual(this.gender, stParModel.gender) && this.isRollback == stParModel.isRollback;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((((((((this.from * 31) + this.to) * 31) + this.flag) * 31) + this.sampleRate) * 31) + this.channel) * 31) + this.sampleSizeInBits) * 31) + this.gender.hashCode()) * 31;
        boolean z7 = this.isRollback;
        int i8 = z7;
        if (z7 != 0) {
            i8 = 1;
        }
        return hashCode + i8;
    }

    public String toString() {
        return "StParModel(from=" + this.from + ", to=" + this.to + ", flag=" + this.flag + ", sampleRate=" + this.sampleRate + ", channel=" + this.channel + ", sampleSizeInBits=" + this.sampleSizeInBits + ", gender=" + this.gender + ", isRollback=" + this.isRollback + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        s.checkNotNullParameter(out, "out");
        out.writeInt(this.from);
        out.writeInt(this.to);
        out.writeInt(this.flag);
        out.writeInt(this.sampleRate);
        out.writeInt(this.channel);
        out.writeInt(this.sampleSizeInBits);
        out.writeString(this.gender);
        out.writeInt(this.isRollback ? 1 : 0);
    }

    public /* synthetic */ StParModel(int i8, int i9, int i10, int i11, int i12, int i13, String str, boolean z7, int i14, o oVar) {
        this(i8, i9, (i14 & 4) != 0 ? 2 : i10, (i14 & 8) != 0 ? 16000 : i11, (i14 & 16) != 0 ? 1 : i12, (i14 & 32) != 0 ? 2 : i13, (i14 & 64) != 0 ? "female" : str, (i14 & 128) != 0 ? true : z7);
    }
}
