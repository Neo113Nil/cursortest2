package com.openharmony.watch.aidl;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class Notification implements Parcelable {
    public static final Parcelable.Creator<Notification> CREATOR = new a();
    private Map<Integer, String> buttonContents;
    private String packageName;
    private Integer templatedId;
    private String text;
    private String title;

    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public Notification createFromParcel(Parcel parcel) {
            return new Notification(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public Notification[] newArray(int i8) {
            return new Notification[i8];
        }
    }

    public Notification(Parcel parcel) {
        this.buttonContents = new HashMap();
        this.buttonContents = parcel.readHashMap(HashMap.class.getClassLoader());
        this.packageName = parcel.readString();
        this.templatedId = Integer.valueOf(parcel.readInt());
        this.text = parcel.readString();
        this.title = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Map<Integer, String> getButtonContents() {
        return this.buttonContents;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public Integer getTemplatedId() {
        return this.templatedId;
    }

    public String getText() {
        return this.text;
    }

    public String getTitle() {
        return this.title;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i8) {
        parcel.writeMap(this.buttonContents);
        parcel.writeString(this.packageName);
        parcel.writeInt(this.templatedId.intValue());
        parcel.writeString(this.text);
        parcel.writeString(this.title);
    }

    public Notification(Map<Integer, String> map, String str, Integer num, String str2, String str3) {
        new HashMap();
        this.buttonContents = map;
        this.packageName = str;
        this.templatedId = num;
        this.text = str2;
        this.title = str3;
    }
}
