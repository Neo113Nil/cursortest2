package com.baidu.mapapi.search.share;

import android.os.Parcel;
import android.os.Parcelable;
import com.baidu.mapapi.search.core.SearchResult;

/* loaded from: classes2.dex */
public class ShareUrlResult extends SearchResult {
    public static final Parcelable.Creator<ShareUrlResult> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private String f7439a;

    /* renamed from: b, reason: collision with root package name */
    private int f7440b;

    static class a implements Parcelable.Creator<ShareUrlResult> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ShareUrlResult createFromParcel(Parcel parcel) {
            return new ShareUrlResult(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ShareUrlResult[] newArray(int i8) {
            return new ShareUrlResult[i8];
        }
    }

    public ShareUrlResult() {
    }

    @Override // com.baidu.mapapi.search.core.SearchResult, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getUrl() {
        return this.f7439a;
    }

    public void setType(int i8) {
        this.f7440b = i8;
    }

    public void setUrl(String str) {
        this.f7439a = str;
    }

    @Override // com.baidu.mapapi.search.core.SearchResult, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        parcel.writeString(this.f7439a);
        parcel.writeInt(this.f7440b);
    }

    protected ShareUrlResult(Parcel parcel) {
        this.f7439a = parcel.readString();
        this.f7440b = parcel.readInt();
    }
}
