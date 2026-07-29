package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class AppGroupCreationContent implements ShareModel {
    public static final Parcelable.Creator<AppGroupCreationContent> CREATOR = new Parcelable.Creator<AppGroupCreationContent>() { // from class: com.facebook.share.model.AppGroupCreationContent.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public AppGroupCreationContent createFromParcel(Parcel parcel) {
            return new AppGroupCreationContent(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public AppGroupCreationContent[] newArray(int i) {
            return new AppGroupCreationContent[i];
        }
    };
    private final String description;
    private final String name;
    private a privacy;

    public enum a {
        Open,
        Closed
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    AppGroupCreationContent(Parcel parcel) {
        this.name = parcel.readString();
        this.description = parcel.readString();
        this.privacy = (a) parcel.readSerializable();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.name);
        parcel.writeString(this.description);
        parcel.writeSerializable(this.privacy);
    }
}
