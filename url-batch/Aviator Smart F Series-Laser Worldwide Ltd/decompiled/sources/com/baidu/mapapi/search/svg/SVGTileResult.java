package com.baidu.mapapi.search.svg;

import android.os.Parcel;
import android.os.Parcelable;
import com.baidu.mapapi.search.core.SearchResult;

/* loaded from: classes2.dex */
public class SVGTileResult extends SearchResult {
    public static final Parcelable.Creator<SVGTileResult> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private String f7448a;

    /* renamed from: b, reason: collision with root package name */
    private String f7449b;

    static class a implements Parcelable.Creator<SVGTileResult> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public SVGTileResult createFromParcel(Parcel parcel) {
            return new SVGTileResult(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public SVGTileResult[] newArray(int i8) {
            return new SVGTileResult[i8];
        }
    }

    public SVGTileResult() {
    }

    @Override // com.baidu.mapapi.search.core.SearchResult, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getTilePath() {
        return this.f7448a;
    }

    public String getTileZipPath() {
        return this.f7449b;
    }

    public void setTilePath(String str) {
        this.f7448a = str;
    }

    public void setTileZipPath(String str) {
        this.f7449b = str;
    }

    @Override // com.baidu.mapapi.search.core.SearchResult, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        super.writeToParcel(parcel, i8);
    }

    protected SVGTileResult(Parcel parcel) {
        this.f7448a = parcel.readString();
    }
}
