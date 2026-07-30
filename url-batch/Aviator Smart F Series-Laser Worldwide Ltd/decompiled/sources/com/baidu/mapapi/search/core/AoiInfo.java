package com.baidu.mapapi.search.core;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public class AoiInfo implements Parcelable {
    public static final Parcelable.Creator<AoiInfo> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private String f6743a;

    /* renamed from: b, reason: collision with root package name */
    private String f6744b;

    /* renamed from: c, reason: collision with root package name */
    private String f6745c;

    /* renamed from: d, reason: collision with root package name */
    private AoiType f6746d;

    /* renamed from: e, reason: collision with root package name */
    private int f6747e;

    /* renamed from: f, reason: collision with root package name */
    private int f6748f;

    /* renamed from: g, reason: collision with root package name */
    private int f6749g;

    public enum AoiType {
        AOI_TYPE_UNKNOWN(0),
        AOI_TYPE_AIRPORT(1),
        AOI_TYPE_RAILWAT_STATION(2),
        AOI_TYPE_SHOPPINGMALL(3),
        AOI_TYPE_GAS_STATION(4),
        AOI_TYPE_SCHOOL(5),
        AOI_TYPE_HOSPITAL(6),
        AOI_TYPE_RESIDENTIAL_DISTRICT(7),
        AOI_TYPE_SCENIC_AREA(8),
        AOI_TYPE_PARK(9),
        AOI_TYPE_FREEWAY_SERVICE(10),
        AOI_TYPE_WATER(11);


        /* renamed from: b, reason: collision with root package name */
        private final int f6751b;

        AoiType(int i8) {
            this.f6751b = i8;
        }

        public static AoiType valueOf(int i8) {
            switch (i8) {
                case 1:
                    return AOI_TYPE_AIRPORT;
                case 2:
                    return AOI_TYPE_RAILWAT_STATION;
                case 3:
                    return AOI_TYPE_SHOPPINGMALL;
                case 4:
                    return AOI_TYPE_GAS_STATION;
                case 5:
                    return AOI_TYPE_SCHOOL;
                case 6:
                    return AOI_TYPE_HOSPITAL;
                case 7:
                    return AOI_TYPE_RESIDENTIAL_DISTRICT;
                case 8:
                    return AOI_TYPE_SCENIC_AREA;
                case 9:
                    return AOI_TYPE_PARK;
                case 10:
                    return AOI_TYPE_FREEWAY_SERVICE;
                case 11:
                    return AOI_TYPE_WATER;
                default:
                    return AOI_TYPE_UNKNOWN;
            }
        }

        public int toInt() {
            return this.f6751b;
        }
    }

    static class a implements Parcelable.Creator<AoiInfo> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public AoiInfo createFromParcel(Parcel parcel) {
            return new AoiInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public AoiInfo[] newArray(int i8) {
            return new AoiInfo[i8];
        }
    }

    public AoiInfo() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAoiName() {
        return this.f6744b;
    }

    public AoiType getAoiType() {
        return this.f6746d;
    }

    public int getNearestDistance() {
        return this.f6747e;
    }

    public int getOrder() {
        return this.f6748f;
    }

    public String getPolygon() {
        return this.f6745c;
    }

    public int getRelation() {
        return this.f6749g;
    }

    public String getUid() {
        return this.f6743a;
    }

    public void setAoiName(String str) {
        this.f6744b = str;
    }

    public void setAoiType(AoiType aoiType) {
        this.f6746d = aoiType;
    }

    public void setNearestDistance(int i8) {
        this.f6747e = i8;
    }

    public void setOrder(int i8) {
        this.f6748f = i8;
    }

    public void setPolygon(String str) {
        this.f6745c = str;
    }

    public void setRelation(int i8) {
        this.f6749g = i8;
    }

    public void setUid(String str) {
        this.f6743a = str;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("AoiInfo: \n");
        stringBuffer.append("; uid = ");
        stringBuffer.append(this.f6743a);
        stringBuffer.append("; polygon = ");
        stringBuffer.append(this.f6745c);
        stringBuffer.append("; aoiName = ");
        stringBuffer.append(this.f6744b);
        stringBuffer.append("; aoiType = ");
        stringBuffer.append(this.f6746d);
        stringBuffer.append("; nearestDistance= ");
        stringBuffer.append(this.f6747e);
        stringBuffer.append("; order= ");
        stringBuffer.append(this.f6748f);
        stringBuffer.append("; relation= ");
        stringBuffer.append(this.f6749g);
        return stringBuffer.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        parcel.writeString(this.f6743a);
        parcel.writeString(this.f6745c);
        parcel.writeString(this.f6744b);
        parcel.writeInt(this.f6746d.ordinal());
        parcel.writeInt(this.f6747e);
        parcel.writeInt(this.f6748f);
        parcel.writeInt(this.f6749g);
    }

    protected AoiInfo(Parcel parcel) {
        this.f6745c = parcel.readString();
        this.f6744b = parcel.readString();
    }
}
