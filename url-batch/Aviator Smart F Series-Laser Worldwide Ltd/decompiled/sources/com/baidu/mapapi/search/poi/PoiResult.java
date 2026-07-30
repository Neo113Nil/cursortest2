package com.baidu.mapapi.search.poi;

import android.os.Parcel;
import android.os.Parcelable;
import com.baidu.mapapi.search.core.CityInfo;
import com.baidu.mapapi.search.core.PoiInfo;
import com.baidu.mapapi.search.core.SearchResult;
import java.util.List;

/* loaded from: classes2.dex */
public class PoiResult extends SearchResult {
    public static final Parcelable.Creator<PoiResult> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private int f6926a;

    /* renamed from: b, reason: collision with root package name */
    private int f6927b;

    /* renamed from: c, reason: collision with root package name */
    private int f6928c;

    /* renamed from: d, reason: collision with root package name */
    private int f6929d;

    /* renamed from: e, reason: collision with root package name */
    private List<PoiInfo> f6930e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f6931f;

    /* renamed from: g, reason: collision with root package name */
    private List<PoiAddrInfo> f6932g;

    /* renamed from: h, reason: collision with root package name */
    private List<CityInfo> f6933h;

    /* renamed from: i, reason: collision with root package name */
    private String f6934i;

    /* renamed from: j, reason: collision with root package name */
    private String f6935j;

    static class a implements Parcelable.Creator<PoiResult> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PoiResult createFromParcel(Parcel parcel) {
            return new PoiResult(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PoiResult[] newArray(int i8) {
            return new PoiResult[i8];
        }
    }

    public PoiResult() {
        this.f6926a = 0;
        this.f6927b = 0;
        this.f6928c = 0;
        this.f6929d = 0;
        this.f6931f = false;
    }

    @Override // com.baidu.mapapi.search.core.SearchResult, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public List<PoiAddrInfo> getAllAddr() {
        return this.f6932g;
    }

    public List<PoiInfo> getAllPoi() {
        return this.f6930e;
    }

    public int getCurrentPageCapacity() {
        return this.f6928c;
    }

    public int getCurrentPageNum() {
        return this.f6926a;
    }

    public String getQueryType() {
        return this.f6935j;
    }

    public String getResultType() {
        return this.f6934i;
    }

    @Deprecated
    public List<CityInfo> getSuggestCityList() {
        return this.f6933h;
    }

    public int getTotalPageNum() {
        return this.f6927b;
    }

    public int getTotalPoiNum() {
        return this.f6929d;
    }

    public boolean isHasAddrInfo() {
        return this.f6931f;
    }

    public void setAddrInfo(List<PoiAddrInfo> list) {
        this.f6932g = list;
    }

    public void setCurrentPageCapacity(int i8) {
        this.f6928c = i8;
    }

    public void setCurrentPageNum(int i8) {
        this.f6926a = i8;
    }

    public void setHasAddrInfo(boolean z7) {
        this.f6931f = z7;
    }

    public void setPoiInfo(List<PoiInfo> list) {
        this.f6930e = list;
    }

    public void setQueryType(String str) {
        this.f6935j = str;
    }

    public void setResultType(String str) {
        this.f6934i = str;
    }

    @Deprecated
    public void setSuggestCityList(List<CityInfo> list) {
        this.f6933h = list;
    }

    public void setTotalPageNum(int i8) {
        this.f6927b = i8;
    }

    public void setTotalPoiNum(int i8) {
        this.f6929d = i8;
    }

    @Override // com.baidu.mapapi.search.core.SearchResult, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        super.writeToParcel(parcel, i8);
        parcel.writeInt(this.f6926a);
        parcel.writeInt(this.f6927b);
        parcel.writeInt(this.f6928c);
        parcel.writeInt(this.f6929d);
        parcel.writeTypedList(this.f6930e);
        parcel.writeByte(this.f6931f ? (byte) 1 : (byte) 0);
        parcel.writeTypedList(this.f6933h);
        parcel.writeString(this.f6935j);
    }

    public PoiResult(SearchResult.ERRORNO errorno) {
        super(errorno);
        this.f6926a = 0;
        this.f6927b = 0;
        this.f6928c = 0;
        this.f6929d = 0;
        this.f6931f = false;
    }

    protected PoiResult(Parcel parcel) {
        super(parcel);
        this.f6926a = 0;
        this.f6927b = 0;
        this.f6928c = 0;
        this.f6929d = 0;
        this.f6931f = false;
        this.f6926a = parcel.readInt();
        this.f6927b = parcel.readInt();
        this.f6928c = parcel.readInt();
        this.f6929d = parcel.readInt();
        this.f6930e = parcel.createTypedArrayList(PoiInfo.CREATOR);
        this.f6931f = parcel.readByte() != 0;
        this.f6933h = parcel.createTypedArrayList(CityInfo.CREATOR);
        this.f6935j = parcel.readString();
    }
}
