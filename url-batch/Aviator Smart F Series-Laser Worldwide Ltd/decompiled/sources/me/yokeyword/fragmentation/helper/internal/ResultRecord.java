package me.yokeyword.fragmentation.helper.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes5.dex */
public final class ResultRecord implements Parcelable {
    public static final Parcelable.Creator<ResultRecord> CREATOR = new a();
    public int requestCode;
    public Bundle resultBundle;
    public int resultCode;

    static class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public ResultRecord createFromParcel(Parcel parcel) {
            return new ResultRecord(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public ResultRecord[] newArray(int i8) {
            return new ResultRecord[i8];
        }
    }

    public ResultRecord() {
        this.resultCode = 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        parcel.writeInt(this.requestCode);
        parcel.writeInt(this.resultCode);
        parcel.writeBundle(this.resultBundle);
    }

    protected ResultRecord(Parcel parcel) {
        this.resultCode = 0;
        this.requestCode = parcel.readInt();
        this.resultCode = parcel.readInt();
        this.resultBundle = parcel.readBundle(ResultRecord.class.getClassLoader());
    }
}
