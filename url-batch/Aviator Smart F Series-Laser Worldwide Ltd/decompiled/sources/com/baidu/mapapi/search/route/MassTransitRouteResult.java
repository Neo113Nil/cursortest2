package com.baidu.mapapi.search.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.baidu.mapapi.search.core.SearchResult;
import com.baidu.mapapi.search.core.TaxiInfo;
import com.baidu.mapapi.search.core.TransitResultNode;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class MassTransitRouteResult extends SearchResult {
    public static final Parcelable.Creator<MassTransitRouteResult> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private TransitResultNode f7275a;

    /* renamed from: b, reason: collision with root package name */
    private TransitResultNode f7276b;

    /* renamed from: c, reason: collision with root package name */
    private TaxiInfo f7277c;

    /* renamed from: d, reason: collision with root package name */
    private int f7278d;

    /* renamed from: e, reason: collision with root package name */
    private List<MassTransitRouteLine> f7279e;

    /* renamed from: f, reason: collision with root package name */
    private SuggestAddrInfo f7280f;

    static class a implements Parcelable.Creator<MassTransitRouteResult> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public MassTransitRouteResult createFromParcel(Parcel parcel) {
            return new MassTransitRouteResult(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public MassTransitRouteResult[] newArray(int i8) {
            return new MassTransitRouteResult[i8];
        }
    }

    public MassTransitRouteResult() {
    }

    @Override // com.baidu.mapapi.search.core.SearchResult, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public TransitResultNode getDestination() {
        return this.f7276b;
    }

    public TransitResultNode getOrigin() {
        return this.f7275a;
    }

    public List<MassTransitRouteLine> getRouteLines() {
        return this.f7279e;
    }

    public SuggestAddrInfo getSuggestAddrInfo() {
        return this.f7280f;
    }

    public TaxiInfo getTaxiInfo() {
        return this.f7277c;
    }

    public int getTotal() {
        return this.f7278d;
    }

    public void setDestination(TransitResultNode transitResultNode) {
        this.f7276b = transitResultNode;
    }

    public void setOrigin(TransitResultNode transitResultNode) {
        this.f7275a = transitResultNode;
    }

    public void setRoutelines(List<MassTransitRouteLine> list) {
        this.f7279e = list;
    }

    public void setSuggestAddrInfo(SuggestAddrInfo suggestAddrInfo) {
        this.f7280f = suggestAddrInfo;
    }

    public void setTaxiInfo(TaxiInfo taxiInfo) {
        this.f7277c = taxiInfo;
    }

    public void setTotal(int i8) {
        this.f7278d = i8;
    }

    @Override // com.baidu.mapapi.search.core.SearchResult, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        parcel.writeParcelable(this.f7275a, 1);
        parcel.writeParcelable(this.f7276b, 1);
        parcel.writeParcelable(this.f7277c, 1);
        parcel.writeInt(this.f7278d);
        parcel.writeList(this.f7279e);
        parcel.writeParcelable(this.f7280f, 1);
    }

    MassTransitRouteResult(Parcel parcel) {
        this.f7275a = (TransitResultNode) parcel.readParcelable(TransitResultNode.class.getClassLoader());
        this.f7276b = (TransitResultNode) parcel.readParcelable(TransitResultNode.class.getClassLoader());
        this.f7277c = (TaxiInfo) parcel.readParcelable(TaxiInfo.class.getClassLoader());
        this.f7278d = parcel.readInt();
        ArrayList arrayList = new ArrayList();
        this.f7279e = arrayList;
        parcel.readList(arrayList, MassTransitRouteLine.class.getClassLoader());
        this.f7280f = (SuggestAddrInfo) parcel.readParcelable(SuggestAddrInfo.class.getClassLoader());
    }
}
