package com.baidu.mapapi.search.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.baidu.mapapi.search.core.SearchResult;
import com.baidu.mapapi.search.core.TaxiInfo;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class TransitRouteResult extends SearchResult {
    public static final Parcelable.Creator<TransitRouteResult> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private TaxiInfo f7306a;

    /* renamed from: b, reason: collision with root package name */
    private List<TransitRouteLine> f7307b;

    /* renamed from: c, reason: collision with root package name */
    private SuggestAddrInfo f7308c;

    static class a implements Parcelable.Creator<TransitRouteResult> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public TransitRouteResult createFromParcel(Parcel parcel) {
            return new TransitRouteResult(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public TransitRouteResult[] newArray(int i8) {
            return new TransitRouteResult[i8];
        }
    }

    public TransitRouteResult() {
    }

    @Override // com.baidu.mapapi.search.core.SearchResult, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public List<TransitRouteLine> getRouteLines() {
        return this.f7307b;
    }

    public SuggestAddrInfo getSuggestAddrInfo() {
        return this.f7308c;
    }

    public TaxiInfo getTaxiInfo() {
        return this.f7306a;
    }

    public void setRoutelines(List<TransitRouteLine> list) {
        this.f7307b = list;
    }

    public void setSuggestAddrInfo(SuggestAddrInfo suggestAddrInfo) {
        this.f7308c = suggestAddrInfo;
    }

    public void setTaxiInfo(TaxiInfo taxiInfo) {
        this.f7306a = taxiInfo;
    }

    @Override // com.baidu.mapapi.search.core.SearchResult, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        parcel.writeParcelable(this.f7306a, 1);
        parcel.writeList(this.f7307b);
        parcel.writeParcelable(this.f7308c, 1);
    }

    protected TransitRouteResult(Parcel parcel) {
        this.f7306a = (TaxiInfo) parcel.readParcelable(TaxiInfo.class.getClassLoader());
        ArrayList arrayList = new ArrayList();
        this.f7307b = arrayList;
        parcel.readList(arrayList, TransitRouteLine.class.getClassLoader());
        this.f7308c = (SuggestAddrInfo) parcel.readParcelable(SuggestAddrInfo.class.getClassLoader());
    }
}
