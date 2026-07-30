package com.baidu.mapapi.search.aoi;

import android.os.Parcel;
import android.os.Parcelable;
import cn.hutool.core.text.l;
import com.baidu.mapapi.search.core.AoiInfo;
import com.baidu.mapapi.search.core.SearchResult;
import java.util.List;

/* loaded from: classes2.dex */
public class AoiResult extends SearchResult {
    public static final Parcelable.Creator<AoiResult> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private List<AoiInfo> f6609a;

    static class a implements Parcelable.Creator<AoiResult> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public AoiResult createFromParcel(Parcel parcel) {
            return new AoiResult(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public AoiResult[] newArray(int i8) {
            return new AoiResult[i8];
        }
    }

    public AoiResult() {
    }

    @Override // com.baidu.mapapi.search.core.SearchResult, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public List<AoiInfo> getAoiList() {
        return this.f6609a;
    }

    public void setAoiList(List<AoiInfo> list) {
        this.f6609a = list;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("AoiResult: ");
        List<AoiInfo> list = this.f6609a;
        if (list == null || list.isEmpty()) {
            stringBuffer.append("null");
        } else {
            for (int i8 = 0; i8 < this.f6609a.size(); i8++) {
                stringBuffer.append(l.SPACE);
                stringBuffer.append(i8);
                stringBuffer.append(l.SPACE);
                AoiInfo aoiInfo = this.f6609a.get(i8);
                if (aoiInfo == null) {
                    stringBuffer.append("null");
                } else {
                    stringBuffer.append(aoiInfo.toString());
                }
            }
        }
        return stringBuffer.toString();
    }

    @Override // com.baidu.mapapi.search.core.SearchResult, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        parcel.writeTypedList(this.f6609a);
    }

    protected AoiResult(Parcel parcel) {
        this.f6609a = parcel.createTypedArrayList(AoiInfo.CREATOR);
    }
}
