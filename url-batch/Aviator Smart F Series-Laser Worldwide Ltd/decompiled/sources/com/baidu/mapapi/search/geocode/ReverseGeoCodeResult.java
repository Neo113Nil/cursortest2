package com.baidu.mapapi.search.geocode;

import android.os.Parcel;
import android.os.Parcelable;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.search.core.PoiInfo;
import com.baidu.mapapi.search.core.SearchResult;
import java.util.List;

/* loaded from: classes2.dex */
public class ReverseGeoCodeResult extends SearchResult {
    public static final Parcelable.Creator<ReverseGeoCodeResult> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private String f6877a;

    /* renamed from: b, reason: collision with root package name */
    private String f6878b;

    /* renamed from: c, reason: collision with root package name */
    private AddressComponent f6879c;

    /* renamed from: d, reason: collision with root package name */
    private LatLng f6880d;

    /* renamed from: e, reason: collision with root package name */
    private int f6881e;

    /* renamed from: f, reason: collision with root package name */
    private List<PoiInfo> f6882f;

    /* renamed from: g, reason: collision with root package name */
    private String f6883g;

    /* renamed from: h, reason: collision with root package name */
    private String f6884h;

    /* renamed from: i, reason: collision with root package name */
    private List<PoiRegionsInfo> f6885i;

    /* renamed from: j, reason: collision with root package name */
    private List<RoadInfo> f6886j;

    /* renamed from: k, reason: collision with root package name */
    private int f6887k;

    public static class AddressComponent implements Parcelable {
        public static final Parcelable.Creator<AddressComponent> CREATOR = new a();
        public int adcode;
        public String city;
        public int cityLevel;
        public int countryCode;
        public String countryCodeIso;
        public String countryCodeIso2;
        public String countryName;
        public String direction;
        public String distance;
        public String district;
        public String province;
        public String street;
        public String streetNumber;
        public String town;
        public String townCode;

        static class a implements Parcelable.Creator<AddressComponent> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public AddressComponent createFromParcel(Parcel parcel) {
                return new AddressComponent(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public AddressComponent[] newArray(int i8) {
                return new AddressComponent[i8];
            }
        }

        public AddressComponent() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String getDirection() {
            return this.direction;
        }

        public String getDistance() {
            return this.distance;
        }

        public String getTown() {
            return this.town;
        }

        public void setDirection(String str) {
            this.direction = str;
        }

        public void setDistance(String str) {
            this.distance = str;
        }

        public void setTown(String str) {
            this.town = str;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i8) {
            parcel.writeString(this.streetNumber);
            parcel.writeString(this.street);
            parcel.writeString(this.town);
            parcel.writeString(this.district);
            parcel.writeString(this.city);
            parcel.writeString(this.province);
            parcel.writeString(this.countryName);
            parcel.writeInt(this.countryCode);
            parcel.writeInt(this.adcode);
            parcel.writeString(this.direction);
            parcel.writeString(this.distance);
            parcel.writeString(this.countryCodeIso);
            parcel.writeString(this.countryCodeIso2);
            parcel.writeString(this.townCode);
            parcel.writeInt(this.cityLevel);
        }

        protected AddressComponent(Parcel parcel) {
            this.streetNumber = parcel.readString();
            this.street = parcel.readString();
            this.town = parcel.readString();
            this.district = parcel.readString();
            this.city = parcel.readString();
            this.province = parcel.readString();
            this.countryName = parcel.readString();
            this.countryCode = parcel.readInt();
            this.adcode = parcel.readInt();
            this.direction = parcel.readString();
            this.distance = parcel.readString();
            this.countryCodeIso = parcel.readString();
            this.countryCodeIso2 = parcel.readString();
            this.townCode = parcel.readString();
            this.cityLevel = parcel.readInt();
        }
    }

    public static class PoiRegionsInfo implements Parcelable {
        public static final Parcelable.Creator<PoiRegionsInfo> CREATOR = new a();
        public String directionDesc;
        public String regionName;
        public String regionTag;

        static class a implements Parcelable.Creator<PoiRegionsInfo> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public PoiRegionsInfo createFromParcel(Parcel parcel) {
                return new PoiRegionsInfo(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public PoiRegionsInfo[] newArray(int i8) {
                return new PoiRegionsInfo[i8];
            }
        }

        public PoiRegionsInfo() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String getDirectionDesc() {
            return this.directionDesc;
        }

        public String getRegionName() {
            return this.regionName;
        }

        public String getRegionTag() {
            return this.regionTag;
        }

        public void setDirectionDesc(String str) {
            this.directionDesc = str;
        }

        public void setRegionName(String str) {
            this.regionName = str;
        }

        public void setRegionTag(String str) {
            this.regionTag = str;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i8) {
            parcel.writeString(this.directionDesc);
            parcel.writeString(this.regionName);
            parcel.writeString(this.regionTag);
        }

        protected PoiRegionsInfo(Parcel parcel) {
            this.directionDesc = parcel.readString();
            this.regionName = parcel.readString();
            this.regionTag = parcel.readString();
        }
    }

    public static class RoadInfo implements Parcelable {
        public static final Parcelable.Creator<RoadInfo> CREATOR = new a();
        public String distance;
        public String name;

        static class a implements Parcelable.Creator<RoadInfo> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public RoadInfo createFromParcel(Parcel parcel) {
                return new RoadInfo(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public RoadInfo[] newArray(int i8) {
                return new RoadInfo[i8];
            }
        }

        public RoadInfo() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i8) {
            parcel.writeString(this.name);
            parcel.writeString(this.distance);
        }

        protected RoadInfo(Parcel parcel) {
            this.name = parcel.readString();
            this.distance = parcel.readString();
        }
    }

    static class a implements Parcelable.Creator<ReverseGeoCodeResult> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ReverseGeoCodeResult createFromParcel(Parcel parcel) {
            return new ReverseGeoCodeResult(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ReverseGeoCodeResult[] newArray(int i8) {
            return new ReverseGeoCodeResult[i8];
        }
    }

    public ReverseGeoCodeResult() {
    }

    @Override // com.baidu.mapapi.search.core.SearchResult, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getAdcode() {
        return this.f6887k;
    }

    public String getAddress() {
        return this.f6878b;
    }

    public AddressComponent getAddressDetail() {
        return this.f6879c;
    }

    public String getBusinessCircle() {
        return this.f6877a;
    }

    public int getCityCode() {
        return this.f6881e;
    }

    public String getFormattedPoiAddress() {
        return this.f6884h;
    }

    public LatLng getLocation() {
        return this.f6880d;
    }

    public List<PoiInfo> getPoiList() {
        return this.f6882f;
    }

    public List<PoiRegionsInfo> getPoiRegionsInfoList() {
        return this.f6885i;
    }

    public List<RoadInfo> getRoadInfoList() {
        return this.f6886j;
    }

    public String getSematicDescription() {
        return this.f6883g;
    }

    public void setAdcode(int i8) {
        this.f6887k = i8;
    }

    public void setAddress(String str) {
        this.f6878b = str;
    }

    public void setAddressDetail(AddressComponent addressComponent) {
        this.f6879c = addressComponent;
    }

    public void setBusinessCircle(String str) {
        this.f6877a = str;
    }

    public void setCityCode(int i8) {
        this.f6881e = i8;
    }

    public void setFormattedPoiAddress(String str) {
        this.f6884h = str;
    }

    public void setLocation(LatLng latLng) {
        this.f6880d = latLng;
    }

    public void setPoiList(List<PoiInfo> list) {
        this.f6882f = list;
    }

    public void setPoiRegionsInfoList(List<PoiRegionsInfo> list) {
        this.f6885i = list;
    }

    public void setRoadInfoList(List<RoadInfo> list) {
        this.f6886j = list;
    }

    public void setSematicDescription(String str) {
        this.f6883g = str;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("ReverseGeoCodeResult: \n");
        stringBuffer.append("businessCircle = ");
        stringBuffer.append(this.f6877a);
        stringBuffer.append("; address = ");
        stringBuffer.append(this.f6878b);
        stringBuffer.append("; location = ");
        stringBuffer.append(this.f6880d);
        stringBuffer.append("; sematicDescription = ");
        stringBuffer.append(this.f6883g);
        stringBuffer.append("; formattedPoiAddress = ");
        stringBuffer.append(this.f6884h);
        if (this.f6879c != null) {
            stringBuffer.append("\n#AddressComponent Info BEGIN# \n");
            stringBuffer.append("streetNumber = ");
            stringBuffer.append(this.f6879c.streetNumber);
            stringBuffer.append("; street = ");
            stringBuffer.append(this.f6879c.street);
            stringBuffer.append("; town = ");
            stringBuffer.append(this.f6879c.town);
            stringBuffer.append("; district = ");
            stringBuffer.append(this.f6879c.district);
            stringBuffer.append("; city = ");
            stringBuffer.append(this.f6879c.city);
            stringBuffer.append("; province = ");
            stringBuffer.append(this.f6879c.province);
            stringBuffer.append("; countryName = ");
            stringBuffer.append(this.f6879c.countryName);
            stringBuffer.append("; countryCode = ");
            stringBuffer.append(this.f6879c.countryCode);
            stringBuffer.append("; adcode = ");
            stringBuffer.append(this.f6879c.adcode);
            stringBuffer.append("; direction = ");
            stringBuffer.append(this.f6879c.direction);
            stringBuffer.append("; distance = ");
            stringBuffer.append(this.f6879c.distance);
            stringBuffer.append("; countryCodeIso = ");
            stringBuffer.append(this.f6879c.countryCodeIso);
            stringBuffer.append("; countryCodeIso2 = ");
            stringBuffer.append(this.f6879c.countryCodeIso2);
            stringBuffer.append("; townCode = ");
            stringBuffer.append(this.f6879c.townCode);
            stringBuffer.append("; cityLevel = ");
            stringBuffer.append(this.f6879c.cityLevel);
            stringBuffer.append("\n#AddressComponent Info END# \n");
        }
        List<PoiRegionsInfo> list = this.f6885i;
        if (list != null && !list.isEmpty()) {
            stringBuffer.append("\n#PoiRegions Info  BEGIN#");
            for (int i8 = 0; i8 < this.f6885i.size(); i8++) {
                PoiRegionsInfo poiRegionsInfo = this.f6885i.get(i8);
                if (poiRegionsInfo != null) {
                    stringBuffer.append("\ndirectionDesc = ");
                    stringBuffer.append(poiRegionsInfo.getDirectionDesc());
                    stringBuffer.append("; regionName = ");
                    stringBuffer.append(poiRegionsInfo.getRegionName());
                    stringBuffer.append("; regionTag = ");
                    stringBuffer.append(poiRegionsInfo.getRegionTag());
                }
            }
            stringBuffer.append("\n#PoiRegions Info  END# \n");
        }
        List<PoiInfo> list2 = this.f6882f;
        if (list2 != null && !list2.isEmpty()) {
            stringBuffer.append("\n #PoiList Info  BEGIN#");
            for (int i9 = 0; i9 < this.f6882f.size(); i9++) {
                PoiInfo poiInfo = this.f6882f.get(i9);
                if (poiInfo != null) {
                    stringBuffer.append("\n address = ");
                    stringBuffer.append(poiInfo.getAddress());
                    stringBuffer.append("; phoneNumber = ");
                    stringBuffer.append(poiInfo.getPhoneNum());
                    stringBuffer.append("; uid = ");
                    stringBuffer.append(poiInfo.getUid());
                    stringBuffer.append("; postCode = ");
                    stringBuffer.append(poiInfo.getPostCode());
                    stringBuffer.append("; name = ");
                    stringBuffer.append(poiInfo.getName());
                    stringBuffer.append("; location = ");
                    stringBuffer.append(poiInfo.getLocation());
                    stringBuffer.append("; city = ");
                    stringBuffer.append(poiInfo.getCity());
                    stringBuffer.append("; direction = ");
                    stringBuffer.append(poiInfo.getDirection());
                    stringBuffer.append("; distance = ");
                    stringBuffer.append(poiInfo.getDistance());
                    if (poiInfo.getParentPoi() != null) {
                        stringBuffer.append("\n parentPoiAddress = ");
                        stringBuffer.append(poiInfo.getParentPoi().getParentPoiAddress());
                        stringBuffer.append("; parentPoiDirection = ");
                        stringBuffer.append(poiInfo.getParentPoi().getParentPoiDirection());
                        stringBuffer.append("; parentPoiDistance = ");
                        stringBuffer.append(poiInfo.getParentPoi().getParentPoiDistance());
                        stringBuffer.append("; parentPoiName = ");
                        stringBuffer.append(poiInfo.getParentPoi().getParentPoiName());
                        stringBuffer.append("; parentPoiTag = ");
                        stringBuffer.append(poiInfo.getParentPoi().getParentPoiTag());
                        stringBuffer.append("; parentPoiUid = ");
                        stringBuffer.append(poiInfo.getParentPoi().getParentPoiUid());
                        stringBuffer.append("; parentPoiLocation = ");
                        stringBuffer.append(poiInfo.getParentPoi().getParentPoiLocation());
                    }
                }
            }
            stringBuffer.append("\n #PoiList Info  END# \n");
        }
        List<RoadInfo> list3 = this.f6886j;
        if (list3 != null && !list3.isEmpty()) {
            stringBuffer.append("\n #RoadInfoList Info  BEGIN#");
            for (int i10 = 0; i10 < this.f6886j.size(); i10++) {
                RoadInfo roadInfo = this.f6886j.get(i10);
                if (roadInfo != null) {
                    stringBuffer.append("; name = ");
                    stringBuffer.append(roadInfo.name);
                    stringBuffer.append("; distance = ");
                    stringBuffer.append(roadInfo.distance);
                }
            }
            stringBuffer.append("\n #RoadInfoList Info  END# \n");
        }
        return stringBuffer.toString();
    }

    @Override // com.baidu.mapapi.search.core.SearchResult, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        super.writeToParcel(parcel, i8);
        parcel.writeString(this.f6877a);
        parcel.writeString(this.f6878b);
        parcel.writeParcelable(this.f6879c, 0);
        parcel.writeValue(this.f6880d);
        parcel.writeTypedList(this.f6882f);
        parcel.writeString(this.f6883g);
        parcel.writeString(this.f6884h);
        parcel.writeTypedList(this.f6885i);
        parcel.writeTypedList(this.f6886j);
    }

    protected ReverseGeoCodeResult(Parcel parcel) {
        super(parcel);
        this.f6877a = parcel.readString();
        this.f6878b = parcel.readString();
        this.f6879c = (AddressComponent) parcel.readParcelable(AddressComponent.class.getClassLoader());
        this.f6880d = (LatLng) parcel.readValue(LatLng.class.getClassLoader());
        this.f6882f = parcel.createTypedArrayList(PoiInfo.CREATOR);
        this.f6883g = parcel.readString();
        this.f6884h = parcel.readString();
        this.f6885i = parcel.createTypedArrayList(PoiRegionsInfo.CREATOR);
        this.f6886j = parcel.createTypedArrayList(RoadInfo.CREATOR);
    }
}
