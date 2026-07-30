package com.baidu.mapapi.search.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.baidu.mapapi.search.core.SearchResult;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class BikingRouteResult extends SearchResult {
    public static final Parcelable.Creator<BikingRouteResult> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private List<BikingRouteLine> f7208a;

    /* renamed from: b, reason: collision with root package name */
    private SuggestAddrInfo f7209b;

    /* renamed from: c, reason: collision with root package name */
    private String f7210c = "";

    static class a implements Parcelable.Creator<BikingRouteResult> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public BikingRouteResult createFromParcel(Parcel parcel) {
            return new BikingRouteResult(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public BikingRouteResult[] newArray(int i8) {
            return new BikingRouteResult[i8];
        }
    }

    public BikingRouteResult() {
    }

    @Override // com.baidu.mapapi.search.core.SearchResult, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getMessage() {
        return this.f7210c;
    }

    public List<BikingRouteLine> getRouteLines() {
        return this.f7208a;
    }

    public SuggestAddrInfo getSuggestAddrInfo() {
        return this.f7209b;
    }

    public void setMessage(String str) {
        this.f7210c = str;
    }

    public void setRouteLines(List<BikingRouteLine> list) {
        this.f7208a = list;
    }

    public void setSuggestAddrInfo(SuggestAddrInfo suggestAddrInfo) {
        this.f7209b = suggestAddrInfo;
    }

    @Override // com.baidu.mapapi.search.core.SearchResult, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        parcel.writeList(this.f7208a);
        parcel.writeParcelable(this.f7209b, 1);
    }

    protected BikingRouteResult(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        this.f7208a = arrayList;
        parcel.readList(arrayList, BikingRouteLine.class.getClassLoader());
        this.f7209b = (SuggestAddrInfo) parcel.readParcelable(SuggestAddrInfo.class.getClassLoader());
    }
}
