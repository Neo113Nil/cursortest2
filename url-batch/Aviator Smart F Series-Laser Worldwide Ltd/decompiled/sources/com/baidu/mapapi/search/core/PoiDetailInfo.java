package com.baidu.mapapi.search.core;

import android.os.Parcel;
import android.os.Parcelable;
import com.baidu.mapapi.model.LatLng;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class PoiDetailInfo implements Parcelable {
    public static final Parcelable.Creator<PoiDetailInfo> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private String f6781a;

    /* renamed from: b, reason: collision with root package name */
    private LatLng f6782b;
    public String brand;

    /* renamed from: c, reason: collision with root package name */
    private String f6783c;
    public int checkinNum;
    public int commentNum;

    /* renamed from: d, reason: collision with root package name */
    private String f6784d;
    public String detailUrl;
    public int discountNum;
    public int distance;

    /* renamed from: e, reason: collision with root package name */
    private String f6785e;
    public double environmentRating;

    /* renamed from: f, reason: collision with root package name */
    private String f6786f;
    public double facilityRating;
    public int favoriteNum;

    /* renamed from: g, reason: collision with root package name */
    private int f6787g;
    public int grouponNum;

    /* renamed from: h, reason: collision with root package name */
    private String f6788h;
    public double hygieneRating;

    /* renamed from: i, reason: collision with root package name */
    private String f6789i;
    public String image;
    public int imageNum;

    /* renamed from: j, reason: collision with root package name */
    private String f6790j;

    /* renamed from: k, reason: collision with root package name */
    private int f6791k;

    /* renamed from: l, reason: collision with root package name */
    private List<PoiChildrenInfo> f6792l;

    /* renamed from: m, reason: collision with root package name */
    private List<String> f6793m;

    /* renamed from: n, reason: collision with root package name */
    private String f6794n;
    public LatLng naviLocation;

    /* renamed from: o, reason: collision with root package name */
    private boolean f6795o;
    public double overallRating;

    /* renamed from: p, reason: collision with root package name */
    private String f6796p;
    public double price;

    /* renamed from: q, reason: collision with root package name */
    private String f6797q;
    public double serviceRating;
    public String shopHours;
    public String tag;
    public double tasteRating;
    public double technologyRating;
    public String type;

    static class a implements Parcelable.Creator<PoiDetailInfo> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PoiDetailInfo createFromParcel(Parcel parcel) {
            return new PoiDetailInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PoiDetailInfo[] newArray(int i8) {
            return new PoiDetailInfo[i8];
        }
    }

    public PoiDetailInfo() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getAdCode() {
        return this.f6787g;
    }

    public String getAddress() {
        return this.f6783c;
    }

    public String getArea() {
        return this.f6786f;
    }

    public String getBrand() {
        return this.brand;
    }

    public int getCheckinNum() {
        return this.checkinNum;
    }

    public String getCity() {
        return this.f6785e;
    }

    public int getCommentNum() {
        return this.commentNum;
    }

    public String getContentTag() {
        return this.f6796p;
    }

    public int getDetail() {
        return this.f6791k;
    }

    public String getDetailUrl() {
        return this.detailUrl;
    }

    public int getDiscountNum() {
        return this.discountNum;
    }

    public int getDistance() {
        return this.distance;
    }

    public double getEnvironmentRating() {
        return this.environmentRating;
    }

    public double getFacilityRating() {
        return this.facilityRating;
    }

    public int getFavoriteNum() {
        return this.favoriteNum;
    }

    public int getGrouponNum() {
        return this.grouponNum;
    }

    public double getHygieneRating() {
        return this.hygieneRating;
    }

    public String getImage() {
        return this.image;
    }

    public int getImageNum() {
        return this.imageNum;
    }

    public String getLabel() {
        return this.f6797q;
    }

    public LatLng getLocation() {
        return this.f6782b;
    }

    public String getName() {
        return this.f6781a;
    }

    public LatLng getNaviLocation() {
        return this.naviLocation;
    }

    public double getOverallRating() {
        return this.overallRating;
    }

    public List<String> getPhotos() {
        return this.f6793m;
    }

    public List<PoiChildrenInfo> getPoiChildrenInfoList() {
        return this.f6792l;
    }

    public double getPrice() {
        return this.price;
    }

    public String getProvince() {
        return this.f6784d;
    }

    public double getServiceRating() {
        return this.serviceRating;
    }

    public String getShopHours() {
        return this.shopHours;
    }

    public String getStatus() {
        return this.f6794n;
    }

    public String getStreetId() {
        return this.f6790j;
    }

    public String getTag() {
        return this.tag;
    }

    public double getTasteRating() {
        return this.tasteRating;
    }

    public double getTechnologyRating() {
        return this.technologyRating;
    }

    public String getTelephone() {
        return this.f6788h;
    }

    public String getType() {
        return this.type;
    }

    public String getUid() {
        return this.f6789i;
    }

    public boolean isDefaultImage() {
        return this.f6795o;
    }

    public void setAdCode(int i8) {
        this.f6787g = i8;
    }

    public void setAddress(String str) {
        this.f6783c = str;
    }

    public void setArea(String str) {
        this.f6786f = str;
    }

    public void setBrand(String str) {
        this.brand = str;
    }

    public void setCheckinNum(int i8) {
        this.checkinNum = i8;
    }

    public void setCity(String str) {
        this.f6785e = str;
    }

    public void setCommentNum(int i8) {
        this.commentNum = i8;
    }

    public void setContentTag(String str) {
        this.f6796p = str;
    }

    public void setDetail(String str) {
        try {
            this.f6791k = Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            this.f6791k = 0;
        }
    }

    public void setDetailUrl(String str) {
        this.detailUrl = str;
    }

    public void setDiscountNum(int i8) {
        this.discountNum = i8;
    }

    public void setDistance(int i8) {
        this.distance = i8;
    }

    public void setEnvironmentRating(double d8) {
        this.environmentRating = d8;
    }

    public void setFacilityRating(double d8) {
        this.facilityRating = d8;
    }

    public void setFavoriteNum(int i8) {
        this.favoriteNum = i8;
    }

    public void setGrouponNum(int i8) {
        this.grouponNum = i8;
    }

    public void setHygieneRating(double d8) {
        this.hygieneRating = d8;
    }

    public void setImage(String str) {
        this.image = str;
    }

    public void setImageNum(int i8) {
        this.imageNum = i8;
    }

    public void setIsDefaultImage(boolean z7) {
        this.f6795o = z7;
    }

    public void setLabel(String str) {
        this.f6797q = str;
    }

    public void setLocation(LatLng latLng) {
        this.f6782b = latLng;
    }

    public void setName(String str) {
        this.f6781a = str;
    }

    public void setNaviLocation(LatLng latLng) {
        this.naviLocation = latLng;
    }

    public void setOverallRating(double d8) {
        this.overallRating = d8;
    }

    public void setPhotos(List<String> list) {
        this.f6793m = list;
    }

    public void setPoiChildrenInfoList(List<PoiChildrenInfo> list) {
        this.f6792l = list;
    }

    public void setPrice(double d8) {
        this.price = d8;
    }

    public void setProvince(String str) {
        this.f6784d = str;
    }

    public void setServiceRating(double d8) {
        this.serviceRating = d8;
    }

    public void setShopHours(String str) {
        this.shopHours = str;
    }

    public void setStatus(String str) {
        this.f6794n = str;
    }

    public void setStreetId(String str) {
        this.f6790j = str;
    }

    public void setTag(String str) {
        this.tag = str;
    }

    public void setTasteRating(double d8) {
        this.tasteRating = d8;
    }

    public void setTechnologyRating(double d8) {
        this.technologyRating = d8;
    }

    public void setTelephone(String str) {
        this.f6788h = str;
    }

    public void setType(String str) {
        this.type = str;
    }

    public void setUid(String str) {
        this.f6789i = str;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("PoiDetailInfo: ");
        stringBuffer.append("name = ");
        stringBuffer.append(this.f6781a);
        stringBuffer.append("; location = ");
        LatLng latLng = this.f6782b;
        if (latLng != null) {
            stringBuffer.append(latLng.toString());
        } else {
            stringBuffer.append("null");
        }
        stringBuffer.append("; address = ");
        stringBuffer.append(this.f6783c);
        stringBuffer.append("; province = ");
        stringBuffer.append(this.f6784d);
        stringBuffer.append("; city = ");
        stringBuffer.append(this.f6785e);
        stringBuffer.append("; area = ");
        stringBuffer.append(this.f6786f);
        stringBuffer.append("; telephone = ");
        stringBuffer.append(this.f6788h);
        stringBuffer.append("; uid = ");
        stringBuffer.append(this.f6789i);
        stringBuffer.append("; detail = ");
        stringBuffer.append(this.f6791k);
        stringBuffer.append("; distance = ");
        stringBuffer.append(this.distance);
        stringBuffer.append("; type = ");
        stringBuffer.append(this.type);
        stringBuffer.append("; tag = ");
        stringBuffer.append(this.tag);
        stringBuffer.append("; naviLocation = ");
        LatLng latLng2 = this.naviLocation;
        if (latLng2 != null) {
            stringBuffer.append(latLng2.toString());
        } else {
            stringBuffer.append("null");
        }
        stringBuffer.append("; detailUrl = ");
        stringBuffer.append(this.detailUrl);
        stringBuffer.append("; price = ");
        stringBuffer.append(this.price);
        stringBuffer.append("; shopHours = ");
        stringBuffer.append(this.shopHours);
        stringBuffer.append("; overallRating = ");
        stringBuffer.append(this.overallRating);
        stringBuffer.append("; tasteRating = ");
        stringBuffer.append(this.tasteRating);
        stringBuffer.append("; serviceRating = ");
        stringBuffer.append(this.serviceRating);
        stringBuffer.append("; environmentRating = ");
        stringBuffer.append(this.environmentRating);
        stringBuffer.append("; facilityRating = ");
        stringBuffer.append(this.facilityRating);
        stringBuffer.append("; hygieneRating = ");
        stringBuffer.append(this.hygieneRating);
        stringBuffer.append("; technologyRating = ");
        stringBuffer.append(this.technologyRating);
        stringBuffer.append("; imageNum = ");
        stringBuffer.append(this.imageNum);
        stringBuffer.append("; grouponNum = ");
        stringBuffer.append(this.grouponNum);
        stringBuffer.append("; discountNum = ");
        stringBuffer.append(this.discountNum);
        stringBuffer.append("; commentNum = ");
        stringBuffer.append(this.commentNum);
        stringBuffer.append("; favoriteNum = ");
        stringBuffer.append(this.favoriteNum);
        stringBuffer.append("; checkinNum = ");
        stringBuffer.append(this.checkinNum);
        stringBuffer.append("; status = ");
        stringBuffer.append(this.f6794n);
        stringBuffer.append("; isDefaultImage = ");
        stringBuffer.append(this.f6795o);
        stringBuffer.append("; contentTag = ");
        stringBuffer.append(this.f6796p);
        stringBuffer.append("; label = ");
        stringBuffer.append(this.f6797q);
        List<PoiChildrenInfo> list = this.f6792l;
        if (list != null && !list.isEmpty()) {
            for (int i8 = 0; i8 < this.f6792l.size(); i8++) {
                stringBuffer.append("; The ");
                stringBuffer.append(i8);
                stringBuffer.append(" poiChildrenInfo is: ");
                PoiChildrenInfo poiChildrenInfo = this.f6792l.get(i8);
                if (poiChildrenInfo != null) {
                    stringBuffer.append(poiChildrenInfo.toString());
                } else {
                    stringBuffer.append("null");
                }
            }
        }
        return stringBuffer.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        parcel.writeString(this.f6781a);
        parcel.writeParcelable(this.f6782b, i8);
        parcel.writeString(this.f6783c);
        parcel.writeString(this.f6784d);
        parcel.writeString(this.f6785e);
        parcel.writeString(this.f6786f);
        parcel.writeString(this.f6788h);
        parcel.writeString(this.f6789i);
        parcel.writeString(this.f6790j);
        parcel.writeInt(this.f6791k);
        parcel.writeInt(this.distance);
        parcel.writeString(this.type);
        parcel.writeString(this.tag);
        parcel.writeParcelable(this.naviLocation, i8);
        parcel.writeString(this.detailUrl);
        parcel.writeDouble(this.price);
        parcel.writeString(this.shopHours);
        parcel.writeDouble(this.overallRating);
        parcel.writeDouble(this.tasteRating);
        parcel.writeDouble(this.serviceRating);
        parcel.writeDouble(this.environmentRating);
        parcel.writeDouble(this.facilityRating);
        parcel.writeDouble(this.hygieneRating);
        parcel.writeDouble(this.technologyRating);
        parcel.writeInt(this.imageNum);
        parcel.writeString(this.image);
        parcel.writeInt(this.grouponNum);
        parcel.writeInt(this.discountNum);
        parcel.writeInt(this.commentNum);
        parcel.writeInt(this.favoriteNum);
        parcel.writeInt(this.checkinNum);
        parcel.writeTypedList(this.f6792l);
        parcel.writeStringList(this.f6793m);
        parcel.writeString(this.brand);
        parcel.writeString(this.f6797q);
        parcel.writeString(this.f6794n);
        parcel.writeByte(this.f6795o ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f6796p);
    }

    protected PoiDetailInfo(Parcel parcel) {
        this.f6781a = parcel.readString();
        this.f6782b = (LatLng) parcel.readParcelable(LatLng.class.getClassLoader());
        this.f6783c = parcel.readString();
        this.f6784d = parcel.readString();
        this.f6785e = parcel.readString();
        this.f6786f = parcel.readString();
        this.f6788h = parcel.readString();
        this.f6789i = parcel.readString();
        this.f6790j = parcel.readString();
        this.f6791k = parcel.readInt();
        this.distance = parcel.readInt();
        this.type = parcel.readString();
        this.tag = parcel.readString();
        this.naviLocation = (LatLng) parcel.readParcelable(LatLng.class.getClassLoader());
        this.detailUrl = parcel.readString();
        this.price = parcel.readDouble();
        this.shopHours = parcel.readString();
        this.overallRating = parcel.readDouble();
        this.tasteRating = parcel.readDouble();
        this.serviceRating = parcel.readDouble();
        this.environmentRating = parcel.readDouble();
        this.facilityRating = parcel.readDouble();
        this.hygieneRating = parcel.readDouble();
        this.technologyRating = parcel.readDouble();
        this.imageNum = parcel.readInt();
        this.image = parcel.readString();
        this.grouponNum = parcel.readInt();
        this.discountNum = parcel.readInt();
        this.commentNum = parcel.readInt();
        this.favoriteNum = parcel.readInt();
        this.checkinNum = parcel.readInt();
        this.f6792l = parcel.createTypedArrayList(PoiChildrenInfo.CREATOR);
        ArrayList arrayList = new ArrayList();
        this.f6793m = arrayList;
        parcel.readStringList(arrayList);
        this.brand = parcel.readString();
        this.f6797q = parcel.readString();
        this.f6794n = parcel.readString();
        this.f6795o = parcel.readByte() != 0;
        this.f6796p = parcel.readString();
    }
}
