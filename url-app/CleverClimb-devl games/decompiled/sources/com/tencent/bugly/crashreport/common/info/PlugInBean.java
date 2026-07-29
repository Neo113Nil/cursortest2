package com.tencent.bugly.crashreport.common.info;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: BUGLY */
/* loaded from: classes2.dex */
public class PlugInBean implements Parcelable {
    public static final Parcelable.Creator<PlugInBean> CREATOR = new Parcelable.Creator<PlugInBean>() { // from class: com.tencent.bugly.crashreport.common.info.PlugInBean.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ PlugInBean createFromParcel(Parcel parcel) {
            return new PlugInBean(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ PlugInBean[] newArray(int i) {
            return new PlugInBean[i];
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final String f8595a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8596b;

    /* renamed from: c, reason: collision with root package name */
    public final String f8597c;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public PlugInBean(String str, String str2, String str3) {
        this.f8595a = str;
        this.f8596b = str2;
        this.f8597c = str3;
    }

    public String toString() {
        return "plid:" + this.f8595a + " plV:" + this.f8596b + " plUUID:" + this.f8597c;
    }

    public PlugInBean(Parcel parcel) {
        this.f8595a = parcel.readString();
        this.f8596b = parcel.readString();
        this.f8597c = parcel.readString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f8595a);
        parcel.writeString(this.f8596b);
        parcel.writeString(this.f8597c);
    }
}
