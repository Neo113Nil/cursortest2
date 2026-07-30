package com.crrepa.ble.sifli.dfu;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public class DFUImagePath implements Parcelable {
    public static final Parcelable.Creator<DFUImagePath> CREATOR = new Parcelable.Creator<DFUImagePath>() { // from class: com.crrepa.ble.sifli.dfu.DFUImagePath.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DFUImagePath createFromParcel(Parcel parcel) {
            return new DFUImagePath(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DFUImagePath[] newArray(int i8) {
            return new DFUImagePath[i8];
        }
    };
    private String imagePath;
    private int imageType;
    private Uri imageUri;

    protected DFUImagePath(Parcel parcel) {
        this.imagePath = parcel.readString();
        this.imageUri = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.imageType = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getImagePath() {
        return this.imagePath;
    }

    public int getImageType() {
        return this.imageType;
    }

    public Uri getImageUri() {
        return this.imageUri;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i8) {
        parcel.writeString(this.imagePath);
        parcel.writeParcelable(this.imageUri, i8);
        parcel.writeInt(this.imageType);
    }

    public DFUImagePath(String str, Uri uri, int i8) {
        this.imagePath = str;
        this.imageUri = uri;
        this.imageType = i8;
    }
}
