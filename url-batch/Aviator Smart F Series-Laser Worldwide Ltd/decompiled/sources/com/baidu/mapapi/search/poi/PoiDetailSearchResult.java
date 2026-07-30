package com.baidu.mapapi.search.poi;

import android.os.Parcel;
import android.os.Parcelable;
import cn.hutool.core.text.l;
import com.baidu.mapapi.search.core.PoiDetailInfo;
import com.baidu.mapapi.search.core.SearchResult;
import java.util.List;

/* loaded from: classes2.dex */
public class PoiDetailSearchResult extends SearchResult {
    public static final Parcelable.Creator<PoiDetailSearchResult> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private List<PoiDetailInfo> f6903a;

    static class a implements Parcelable.Creator<PoiDetailSearchResult> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PoiDetailSearchResult createFromParcel(Parcel parcel) {
            return new PoiDetailSearchResult(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PoiDetailSearchResult[] newArray(int i8) {
            return new PoiDetailSearchResult[i8];
        }
    }

    public PoiDetailSearchResult() {
    }

    @Override // com.baidu.mapapi.search.core.SearchResult, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public List<PoiDetailInfo> getPoiDetailInfoList() {
        return this.f6903a;
    }

    public void setPoiDetailInfoList(List<PoiDetailInfo> list) {
        this.f6903a = list;
    }

    public String toString() {
        List<PoiDetailInfo> list = this.f6903a;
        if (list == null || list.isEmpty()) {
            return "PoiDetailSearchResult is null";
        }
        StringBuffer stringBuffer = new StringBuffer("PoiDetailSearchResult:");
        for (int i8 = 0; i8 < this.f6903a.size(); i8++) {
            stringBuffer.append(l.SPACE);
            stringBuffer.append(i8);
            stringBuffer.append(l.SPACE);
            PoiDetailInfo poiDetailInfo = this.f6903a.get(i8);
            if (poiDetailInfo != null) {
                stringBuffer.append(poiDetailInfo.toString());
            } else {
                stringBuffer.append("null");
            }
        }
        return stringBuffer.toString();
    }

    @Override // com.baidu.mapapi.search.core.SearchResult, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        super.writeToParcel(parcel, i8);
        parcel.writeTypedList(this.f6903a);
    }

    public PoiDetailSearchResult(SearchResult.ERRORNO errorno) {
        super(errorno);
    }

    protected PoiDetailSearchResult(Parcel parcel) {
        super(parcel);
        this.f6903a = parcel.createTypedArrayList(PoiDetailInfo.CREATOR);
    }
}
