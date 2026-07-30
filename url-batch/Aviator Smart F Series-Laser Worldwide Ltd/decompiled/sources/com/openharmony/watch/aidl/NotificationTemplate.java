package com.openharmony.watch.aidl;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* loaded from: classes4.dex */
public class NotificationTemplate implements Parcelable {
    public static final Parcelable.Creator<NotificationTemplate> CREATOR = new a();

    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public NotificationTemplate createFromParcel(Parcel parcel) {
            return new NotificationTemplate(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public NotificationTemplate[] newArray(int i8) {
            return new NotificationTemplate[i8];
        }
    }

    protected NotificationTemplate(Parcel parcel) {
    }

    public static int getTemplateForTemplateId(int i8) {
        switch (i8) {
            case 50:
                return 50;
            case 51:
                return 51;
            case 52:
                return 52;
            case 53:
                return 53;
            default:
                return -1;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @NonNull
    public String toString() {
        return "";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i8) {
    }
}
