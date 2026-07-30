package com.baidu.mapapi.search.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.baidu.mapapi.search.core.SearchResult;
import java.util.List;

/* loaded from: classes2.dex */
public class IndoorRouteResult extends SearchResult {
    public static final Parcelable.Creator<IndoorRouteResult> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private List<IndoorRouteLine> f7249a;

    static class a implements Parcelable.Creator<IndoorRouteResult> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public IndoorRouteResult createFromParcel(Parcel parcel) {
            return new IndoorRouteResult(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public IndoorRouteResult[] newArray(int i8) {
            return new IndoorRouteResult[i8];
        }
    }

    public IndoorRouteResult() {
    }

    @Override // com.baidu.mapapi.search.core.SearchResult, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public List<IndoorRouteLine> getRouteLines() {
        return this.f7249a;
    }

    public void setRouteLines(List<IndoorRouteLine> list) {
        this.f7249a = list;
    }

    @Override // com.baidu.mapapi.search.core.SearchResult, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        super.writeToParcel(parcel, i8);
        parcel.writeTypedList(this.f7249a);
    }

    protected IndoorRouteResult(Parcel parcel) {
        super(parcel);
        this.f7249a = parcel.createTypedArrayList(IndoorRouteLine.CREATOR);
    }
}
