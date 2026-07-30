package com.baidu.mapapi.search.poi;

import android.os.Parcel;
import android.os.Parcelable;
import com.baidu.mapapi.search.core.SearchResult;
import java.util.List;

/* loaded from: classes2.dex */
public class PoiIndoorResult extends SearchResult {
    public static final Parcelable.Creator<PoiIndoorResult> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private List<PoiIndoorInfo> f6922a;
    public int pageNum;
    public int poiNum;

    static class a implements Parcelable.Creator<PoiIndoorResult> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PoiIndoorResult createFromParcel(Parcel parcel) {
            return new PoiIndoorResult(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PoiIndoorResult[] newArray(int i8) {
            return new PoiIndoorResult[i8];
        }
    }

    public PoiIndoorResult() {
    }

    @Override // com.baidu.mapapi.search.core.SearchResult, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public List<PoiIndoorInfo> getArrayPoiInfo() {
        return this.f6922a;
    }

    public int getPageNum() {
        return this.pageNum;
    }

    public int getPoiNum() {
        return this.poiNum;
    }

    @Deprecated
    public List<PoiIndoorInfo> getmArrayPoiInfo() {
        return this.f6922a;
    }

    public void setArrayPoiInfo(List<PoiIndoorInfo> list) {
        this.f6922a = list;
    }

    public void setPageNum(int i8) {
        this.pageNum = i8;
    }

    public void setPoiNum(int i8) {
        this.poiNum = i8;
    }

    @Deprecated
    public void setmArrayPoiInfo(List<PoiIndoorInfo> list) {
        this.f6922a = list;
    }

    @Override // com.baidu.mapapi.search.core.SearchResult, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        super.writeToParcel(parcel, i8);
        parcel.writeInt(this.poiNum);
        parcel.writeInt(this.pageNum);
    }

    public PoiIndoorResult(SearchResult.ERRORNO errorno) {
        super(errorno);
    }

    protected PoiIndoorResult(Parcel parcel) {
        super(parcel);
        this.poiNum = parcel.readInt();
        this.pageNum = parcel.readInt();
    }
}
