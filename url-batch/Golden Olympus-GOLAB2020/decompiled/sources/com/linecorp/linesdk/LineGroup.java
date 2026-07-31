package com.linecorp.linesdk;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* loaded from: classes2.dex */
public class LineGroup implements Parcelable {
    public static final Parcelable.Creator<LineGroup> CREATOR = new Parcelable.Creator<LineGroup>() { // from class: com.linecorp.linesdk.LineGroup.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public LineGroup createFromParcel(Parcel parcel) {
            return new LineGroup(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public LineGroup[] newArray(int i4) {
            return new LineGroup[i4];
        }
    };

    @NonNull
    private final String groupId;

    @NonNull
    private final String groupName;
    private final Uri pictureUrl;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LineGroup lineGroup = (LineGroup) obj;
        if (!this.groupId.equals(lineGroup.groupId) || !this.groupName.equals(lineGroup.groupName)) {
            return false;
        }
        Uri uri = this.pictureUrl;
        Uri uri2 = lineGroup.pictureUrl;
        return uri == null ? uri2 == null : uri.equals(uri2);
    }

    @NonNull
    public String getGroupId() {
        return this.groupId;
    }

    @NonNull
    public String getGroupName() {
        return this.groupName;
    }

    public Uri getPictureUrl() {
        return this.pictureUrl;
    }

    public int hashCode() {
        int hashCode = ((this.groupId.hashCode() * 31) + this.groupName.hashCode()) * 31;
        Uri uri = this.pictureUrl;
        return hashCode + (uri != null ? uri.hashCode() : 0);
    }

    public String toString() {
        return "LineProfile{groupName='" + this.groupName + "', groupId='" + this.groupId + "', pictureUrl='" + this.pictureUrl + "'}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        parcel.writeString(this.groupId);
        parcel.writeString(this.groupName);
        parcel.writeParcelable(this.pictureUrl, i4);
    }

    public LineGroup(@NonNull String str, @NonNull String str2, Uri uri) {
        this.groupId = str;
        this.groupName = str2;
        this.pictureUrl = uri;
    }

    private LineGroup(@NonNull Parcel parcel) {
        this.groupId = parcel.readString();
        this.groupName = parcel.readString();
        this.pictureUrl = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
    }
}
