package com.just.agentweb.filechooser;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes4.dex */
public class FileParcel implements Parcelable {
    public static final Parcelable.Creator<FileParcel> CREATOR = new Parcelable.Creator<FileParcel>() { // from class: com.just.agentweb.filechooser.FileParcel.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public FileParcel createFromParcel(Parcel parcel) {
            return new FileParcel(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public FileParcel[] newArray(int i8) {
            return new FileParcel[i8];
        }
    };
    private String mContentPath;
    private String mFileBase64;
    private int mId;

    protected FileParcel(Parcel parcel) {
        this.mId = parcel.readInt();
        this.mContentPath = parcel.readString();
        this.mFileBase64 = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getContentPath() {
        return this.mContentPath;
    }

    public String getFileBase64() {
        return this.mFileBase64;
    }

    public int getId() {
        return this.mId;
    }

    public void setContentPath(String str) {
        this.mContentPath = str;
    }

    public void setFileBase64(String str) {
        this.mFileBase64 = str;
    }

    public void setId(int i8) {
        this.mId = i8;
    }

    public String toString() {
        return "FileParcel{mId=" + this.mId + ", mContentPath='" + this.mContentPath + "', mFileBase64='" + this.mFileBase64 + "'}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        parcel.writeInt(this.mId);
        parcel.writeString(this.mContentPath);
        parcel.writeString(this.mFileBase64);
    }

    public FileParcel(int i8, String str, String str2) {
        this.mId = i8;
        this.mContentPath = str;
        this.mFileBase64 = str2;
    }
}
