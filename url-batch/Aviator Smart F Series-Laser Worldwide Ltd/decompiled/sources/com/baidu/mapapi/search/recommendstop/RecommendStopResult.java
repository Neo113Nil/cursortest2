package com.baidu.mapapi.search.recommendstop;

import android.os.Parcel;
import android.os.Parcelable;
import cn.hutool.core.text.l;
import com.baidu.mapapi.search.core.RecommendStationStopInfo;
import com.baidu.mapapi.search.core.RecommendStopInfo;
import com.baidu.mapapi.search.core.SearchResult;
import java.util.List;

/* loaded from: classes2.dex */
public class RecommendStopResult extends SearchResult {
    public static final Parcelable.Creator<RecommendStopResult> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private List<RecommendStopInfo> f7192a;

    /* renamed from: b, reason: collision with root package name */
    private List<RecommendStationStopInfo> f7193b;

    static class a implements Parcelable.Creator<RecommendStopResult> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public RecommendStopResult createFromParcel(Parcel parcel) {
            return new RecommendStopResult(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public RecommendStopResult[] newArray(int i8) {
            return new RecommendStopResult[i8];
        }
    }

    public RecommendStopResult() {
    }

    @Override // com.baidu.mapapi.search.core.SearchResult, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public List<RecommendStopInfo> getRecommendStopInfoList() {
        return this.f7192a;
    }

    public List<RecommendStationStopInfo> getStationInfoList() {
        return this.f7193b;
    }

    public void setRecommendStopInfoList(List<RecommendStopInfo> list) {
        this.f7192a = list;
    }

    public void setStationInfoList(List<RecommendStationStopInfo> list) {
        this.f7193b = list;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("RecommendStopResult: ");
        List<RecommendStopInfo> list = this.f7192a;
        if (list == null || list.isEmpty()) {
            stringBuffer.append("null");
        } else {
            for (int i8 = 0; i8 < this.f7192a.size(); i8++) {
                stringBuffer.append(l.SPACE);
                stringBuffer.append(i8);
                stringBuffer.append(l.SPACE);
                RecommendStopInfo recommendStopInfo = this.f7192a.get(i8);
                if (recommendStopInfo == null) {
                    stringBuffer.append("null");
                } else {
                    stringBuffer.append(recommendStopInfo.toString());
                }
            }
        }
        return stringBuffer.toString();
    }

    @Override // com.baidu.mapapi.search.core.SearchResult, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        super.writeToParcel(parcel, i8);
        parcel.writeTypedList(this.f7192a);
    }

    protected RecommendStopResult(Parcel parcel) {
        super(parcel);
        this.f7192a = parcel.createTypedArrayList(RecommendStopInfo.CREATOR);
    }
}
