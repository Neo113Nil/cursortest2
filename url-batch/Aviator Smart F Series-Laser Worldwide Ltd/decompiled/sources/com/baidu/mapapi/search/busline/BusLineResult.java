package com.baidu.mapapi.search.busline;

import android.os.Parcel;
import android.os.Parcelable;
import com.baidu.mapapi.search.core.RouteNode;
import com.baidu.mapapi.search.core.RouteStep;
import com.baidu.mapapi.search.core.SearchResult;
import java.util.Date;
import java.util.List;

/* loaded from: classes2.dex */
public class BusLineResult extends SearchResult {
    public static final Parcelable.Creator<BusLineResult> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private String f6719a;

    /* renamed from: b, reason: collision with root package name */
    private String f6720b;

    /* renamed from: c, reason: collision with root package name */
    private String f6721c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f6722d;

    /* renamed from: e, reason: collision with root package name */
    private Date f6723e;

    /* renamed from: f, reason: collision with root package name */
    private Date f6724f;

    /* renamed from: g, reason: collision with root package name */
    private String f6725g;

    /* renamed from: h, reason: collision with root package name */
    private List<BusStation> f6726h;

    /* renamed from: i, reason: collision with root package name */
    private List<BusStep> f6727i;

    /* renamed from: j, reason: collision with root package name */
    private float f6728j;

    /* renamed from: k, reason: collision with root package name */
    private float f6729k;

    /* renamed from: l, reason: collision with root package name */
    private int f6730l;

    /* renamed from: m, reason: collision with root package name */
    private String f6731m;

    /* renamed from: n, reason: collision with root package name */
    private int f6732n;

    /* renamed from: o, reason: collision with root package name */
    private int f6733o;

    /* renamed from: p, reason: collision with root package name */
    private String f6734p;

    public static class BusStation extends RouteNode {

        /* renamed from: d, reason: collision with root package name */
        private List<BusSubway> f6735d;

        /* renamed from: e, reason: collision with root package name */
        private List<BusTransfer> f6736e;

        public static class BusSubway {

            /* renamed from: a, reason: collision with root package name */
            private String f6737a;

            /* renamed from: b, reason: collision with root package name */
            private String f6738b;

            public String getBackgroundColor() {
                return this.f6738b;
            }

            public String getName() {
                return this.f6737a;
            }

            public void setBackgroundColor(String str) {
                this.f6738b = str;
            }

            public void setName(String str) {
                this.f6737a = str;
            }
        }

        public static class BusTransfer {

            /* renamed from: a, reason: collision with root package name */
            private String f6739a;

            /* renamed from: b, reason: collision with root package name */
            private String f6740b;

            public String getName() {
                return this.f6740b;
            }

            public String getUid() {
                return this.f6739a;
            }

            public void setName(String str) {
                this.f6740b = str;
            }

            public void setUid(String str) {
                this.f6739a = str;
            }
        }

        public List<BusSubway> getSubways() {
            return this.f6735d;
        }

        public List<BusTransfer> getTransfers() {
            return this.f6736e;
        }

        public void setSubways(List<BusSubway> list) {
            this.f6735d = list;
        }

        public void setTransfers(List<BusTransfer> list) {
            this.f6736e = list;
        }
    }

    public static class BusStep extends RouteStep {
    }

    static class a implements Parcelable.Creator<BusLineResult> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public BusLineResult[] newArray(int i8) {
            return new BusLineResult[i8];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public BusLineResult createFromParcel(Parcel parcel) {
            return new BusLineResult(parcel);
        }
    }

    public BusLineResult() {
        this.f6719a = null;
        this.f6720b = null;
        this.f6726h = null;
        this.f6727i = null;
        this.f6734p = null;
    }

    @Override // com.baidu.mapapi.search.core.SearchResult, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public float getBasePrice() {
        return this.f6728j;
    }

    public String getBusCompany() {
        return this.f6719a;
    }

    public String getBusLineName() {
        return this.f6720b;
    }

    public int getCityId() {
        return this.f6732n;
    }

    public Date getEndTime() {
        return this.f6724f;
    }

    public int getKindType() {
        return this.f6733o;
    }

    public String getLineDirection() {
        return this.f6734p;
    }

    public int getLineType() {
        return this.f6730l;
    }

    public float getMaxPrice() {
        return this.f6729k;
    }

    public String getRawName() {
        return this.f6721c;
    }

    public Date getStartTime() {
        return this.f6723e;
    }

    public List<BusStation> getStations() {
        return this.f6726h;
    }

    public List<BusStep> getSteps() {
        return this.f6727i;
    }

    public String getTimeTable() {
        return this.f6731m;
    }

    public String getUid() {
        return this.f6725g;
    }

    public boolean isMonthTicket() {
        return this.f6722d;
    }

    public void setBasePrice(float f8) {
        this.f6728j = f8;
    }

    public void setBusCompany(String str) {
        this.f6719a = str;
    }

    public void setBusLineName(String str) {
        this.f6720b = str;
    }

    public void setCityId(int i8) {
        this.f6732n = i8;
    }

    public void setEndTime(Date date) {
        this.f6724f = date;
    }

    public void setKindType(int i8) {
        this.f6733o = i8;
    }

    public void setLineDirection(String str) {
        this.f6734p = str;
    }

    public void setLineType(int i8) {
        this.f6730l = i8;
    }

    public void setMaxPrice(float f8) {
        this.f6729k = f8;
    }

    public void setMonthTicket(boolean z7) {
        this.f6722d = z7;
    }

    public void setRawName(String str) {
        this.f6721c = str;
    }

    public void setStartTime(Date date) {
        this.f6723e = date;
    }

    public void setStations(List<BusStation> list) {
        this.f6726h = list;
    }

    public void setSteps(List<BusStep> list) {
        this.f6727i = list;
    }

    public void setTimeTable(String str) {
        this.f6731m = str;
    }

    public void setUid(String str) {
        this.f6725g = str;
    }

    @Override // com.baidu.mapapi.search.core.SearchResult, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        parcel.writeString(this.f6719a);
        parcel.writeString(this.f6720b);
        parcel.writeValue(Boolean.valueOf(this.f6722d));
        parcel.writeValue(this.f6723e);
        parcel.writeValue(this.f6724f);
        parcel.writeString(this.f6725g);
        parcel.writeList(this.f6726h);
        parcel.writeList(this.f6727i);
        parcel.writeString(this.f6721c);
        parcel.writeString(this.f6734p);
        parcel.writeFloat(this.f6729k);
        parcel.writeFloat(this.f6728j);
    }

    BusLineResult(Parcel parcel) {
        this.f6719a = null;
        this.f6720b = null;
        this.f6726h = null;
        this.f6727i = null;
        this.f6734p = null;
        this.f6719a = parcel.readString();
        this.f6720b = parcel.readString();
        this.f6722d = ((Boolean) parcel.readValue(Boolean.class.getClassLoader())).booleanValue();
        this.f6723e = (Date) parcel.readValue(Date.class.getClassLoader());
        this.f6724f = (Date) parcel.readValue(Date.class.getClassLoader());
        this.f6725g = parcel.readString();
        this.f6726h = parcel.readArrayList(BusStation.class.getClassLoader());
        this.f6727i = parcel.readArrayList(RouteStep.class.getClassLoader());
        this.f6721c = parcel.readString();
        this.f6734p = parcel.readString();
        this.f6729k = parcel.readFloat();
        this.f6728j = parcel.readFloat();
    }
}
