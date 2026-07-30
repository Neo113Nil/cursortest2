package com.baidu.location;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.baidu.ar.util.SystemInfoUtil;
import com.baidu.location.Address;
import com.baidu.location.e.i;
import com.baidu.platform.comapi.map.MapBundleKey;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class BDLocation implements Parcelable {
    public static final String BDLOCATION_BD09LL_TO_GCJ02 = "bd09ll2gcj";
    public static final String BDLOCATION_BD09_TO_GCJ02 = "bd092gcj";
    public static final String BDLOCATION_COOR_TYPE_BD09LL = "bd09";
    public static final String BDLOCATION_COOR_TYPE_BD09MC = "bd09mc";
    public static final String BDLOCATION_COOR_TYPE_GCJ02 = "gcj02";
    public static final String BDLOCATION_COOR_TYPE_GCJ03 = "gcj03";
    public static final String BDLOCATION_COOR_TYPE_WGS84 = "wgs84";
    public static final String BDLOCATION_GCJ02_TO_BD09 = "bd09";
    public static final String BDLOCATION_GCJ02_TO_BD09LL = "bd09ll";
    public static final String BDLOCATION_GNSS_PROVIDER_FROM_BAIDU_BEIDOU = "bd_beidou";
    public static final String BDLOCATION_GNSS_PROVIDER_FROM_SYSTEM = "system";
    public static final String BDLOCATION_WGS84_TO_GCJ02 = "gps2gcj";
    public static final Parcelable.Creator<BDLocation> CREATOR = new a();
    public static final int GNSS_ACCURACY_BAD = 3;
    public static final int GNSS_ACCURACY_GOOD = 1;
    public static final int GNSS_ACCURACY_MID = 2;
    public static final int GNSS_ACCURACY_UNKNOWN = 0;
    public static final int GPS_ACCURACY_BAD = 3;
    public static final int GPS_ACCURACY_GOOD = 1;
    public static final int GPS_ACCURACY_MID = 2;
    public static final int GPS_ACCURACY_UNKNOWN = 0;
    public static final int GPS_RECTIFY_INDOOR = 1;
    public static final int GPS_RECTIFY_NONE = 0;
    public static final int GPS_RECTIFY_OUTDOOR = 2;
    public static final int INDOOR_LOCATION_NEARBY_SURPPORT_TRUE = 2;
    public static final int INDOOR_LOCATION_SOURCE_BLUETOOTH = 4;
    public static final int INDOOR_LOCATION_SOURCE_MAGNETIC = 2;
    public static final int INDOOR_LOCATION_SOURCE_SMALLCELLSTATION = 8;
    public static final int INDOOR_LOCATION_SOURCE_UNKNOWN = 0;
    public static final int INDOOR_LOCATION_SOURCE_WIFI = 1;
    public static final int INDOOR_LOCATION_SURPPORT_FALSE = 0;
    public static final int INDOOR_LOCATION_SURPPORT_TRUE = 1;
    public static final int INDOOR_NETWORK_STATE_HIGH = 2;
    public static final int INDOOR_NETWORK_STATE_LOW = 0;
    public static final int INDOOR_NETWORK_STATE_MIDDLE = 1;
    public static final int LOCATION_WHERE_IN_CN = 1;
    public static final int LOCATION_WHERE_OUT_CN = 0;
    public static final int LOCATION_WHERE_UNKNOW = 2;
    public static final int MOCK_GNSS_PROBABILITY_HIGH = 3;
    public static final int MOCK_GNSS_PROBABILITY_LOW = 1;
    public static final int MOCK_GNSS_PROBABILITY_MIDDLE = 2;
    public static final int MOCK_GNSS_PROBABILITY_UNKNOW = -1;
    public static final int MOCK_GNSS_PROBABILITY_ZERO = 0;
    public static final int MOCK_GPS_PROBABILITY_HIGH = 3;
    public static final int MOCK_GPS_PROBABILITY_LOW = 1;
    public static final int MOCK_GPS_PROBABILITY_MIDDLE = 2;
    public static final int MOCK_GPS_PROBABILITY_UNKNOW = -1;
    public static final int MOCK_GPS_PROBABILITY_ZERO = 0;
    public static final int OPERATORS_TYPE_MOBILE = 1;
    public static final int OPERATORS_TYPE_TELECOMU = 3;
    public static final int OPERATORS_TYPE_UNICOM = 2;
    public static final int OPERATORS_TYPE_UNKONW = 0;
    public static final int TYPE_BMS_HD_LOCATION = 602;
    public static final int TYPE_CLOSE_LOCATION_SERVICE_SWITCH_FAIL = 69;
    public static final int TYPE_HD_LOCATION = 601;
    public static final int TYPE_LANE_HD_LOCATION = 603;
    public static final int TYPE_NO_PERMISSION_AND_CLOSE_SWITCH_FAIL = 71;
    public static final int TYPE_NO_PERMISSION_LOCATION_FAIL = 70;
    public static final int TypeCacheLocation = 65;
    public static final int TypeCoarseLocation = 160;
    public static final int TypeCriteriaException = 62;
    public static final int TypeGnssLocation = 61;
    public static final int TypeGpsLocation = 61;
    public static final int TypeNetWorkException = 63;
    public static final int TypeNetWorkLocation = 161;
    public static final int TypeNone = 0;
    public static final int TypeOffLineLocation = 66;
    public static final int TypeOffLineLocationFail = 67;
    public static final int TypeOffLineLocationNetworkFail = 68;
    public static final int TypeServerCheckFlowError = 506;
    public static final int TypeServerCheckKeyError = 505;
    public static final int TypeServerDecryptError = 162;
    public static final int TypeServerError = 167;
    public static final int USER_INDDOR_TRUE = 1;
    public static final int USER_INDOOR_FALSE = 0;
    public static final int USER_INDOOR_UNKNOW = -1;
    private String A;
    private String B;
    private String C;
    private double D;
    private boolean E;
    private int F;
    private int G;
    private String H;
    private int I;
    private String J;
    private int K;
    private int L;
    private int M;
    private int N;
    private String O;
    private String P;
    private String Q;
    private int R;
    private List<Poi> S;
    private String T;
    private String U;
    private String V;
    private Bundle W;
    private int X;
    private int Y;
    private long Z;

    /* renamed from: a, reason: collision with root package name */
    private int f4344a;

    /* renamed from: a0, reason: collision with root package name */
    private String f4345a0;

    /* renamed from: b, reason: collision with root package name */
    private String f4346b;

    /* renamed from: b0, reason: collision with root package name */
    private String f4347b0;

    /* renamed from: c, reason: collision with root package name */
    private double f4348c;

    /* renamed from: c0, reason: collision with root package name */
    private double f4349c0;

    /* renamed from: d, reason: collision with root package name */
    private double f4350d;

    /* renamed from: d0, reason: collision with root package name */
    private double f4351d0;

    /* renamed from: e, reason: collision with root package name */
    private boolean f4352e;

    /* renamed from: e0, reason: collision with root package name */
    private boolean f4353e0;

    /* renamed from: f, reason: collision with root package name */
    private double f4354f;

    /* renamed from: f0, reason: collision with root package name */
    private PoiRegion f4355f0;

    /* renamed from: g, reason: collision with root package name */
    private boolean f4356g;

    /* renamed from: g0, reason: collision with root package name */
    private float f4357g0;

    /* renamed from: h, reason: collision with root package name */
    private float f4358h;

    /* renamed from: h0, reason: collision with root package name */
    private double f4359h0;

    /* renamed from: i, reason: collision with root package name */
    private boolean f4360i;

    /* renamed from: i0, reason: collision with root package name */
    private int f4361i0;

    /* renamed from: j, reason: collision with root package name */
    private float f4362j;

    /* renamed from: j0, reason: collision with root package name */
    private int f4363j0;

    /* renamed from: k, reason: collision with root package name */
    private String f4364k;

    /* renamed from: k0, reason: collision with root package name */
    private BDLocation f4365k0;

    /* renamed from: l, reason: collision with root package name */
    private float f4366l;

    /* renamed from: l0, reason: collision with root package name */
    private Bundle f4367l0;

    /* renamed from: m, reason: collision with root package name */
    private int f4368m;

    /* renamed from: m0, reason: collision with root package name */
    private String f4369m0;

    /* renamed from: n, reason: collision with root package name */
    private float f4370n;

    /* renamed from: n0, reason: collision with root package name */
    private long f4371n0;

    /* renamed from: o, reason: collision with root package name */
    private boolean f4372o;

    /* renamed from: p, reason: collision with root package name */
    private int f4373p;

    /* renamed from: q, reason: collision with root package name */
    private float f4374q;

    /* renamed from: r, reason: collision with root package name */
    private String f4375r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f4376s;

    /* renamed from: t, reason: collision with root package name */
    private String f4377t;

    /* renamed from: u, reason: collision with root package name */
    private String f4378u;

    /* renamed from: v, reason: collision with root package name */
    private String f4379v;

    /* renamed from: w, reason: collision with root package name */
    private String f4380w;

    /* renamed from: x, reason: collision with root package name */
    private String f4381x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f4382y;

    /* renamed from: z, reason: collision with root package name */
    private Address f4383z;

    class a implements Parcelable.Creator<BDLocation> {
        a() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public BDLocation createFromParcel(Parcel parcel) {
            return new BDLocation(parcel, null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public BDLocation[] newArray(int i8) {
            return new BDLocation[i8];
        }
    }

    public BDLocation() {
        this.f4344a = 0;
        this.f4346b = null;
        this.f4348c = Double.MIN_VALUE;
        this.f4350d = Double.MIN_VALUE;
        this.f4352e = false;
        this.f4354f = Double.MIN_VALUE;
        this.f4356g = false;
        this.f4358h = 0.0f;
        this.f4360i = false;
        this.f4362j = 0.0f;
        this.f4366l = 0.0f;
        this.f4368m = -1;
        this.f4370n = 0.0f;
        this.f4372o = false;
        this.f4373p = -1;
        this.f4374q = -1.0f;
        this.f4375r = null;
        this.f4376s = false;
        this.f4377t = null;
        this.f4378u = null;
        this.f4379v = null;
        this.f4380w = null;
        this.f4381x = null;
        this.f4382y = false;
        this.f4383z = new Address.Builder().build();
        this.A = null;
        this.B = null;
        this.C = null;
        this.E = false;
        this.F = 0;
        this.G = 1;
        this.H = null;
        this.J = "";
        this.K = -1;
        this.L = 0;
        this.M = 2;
        this.N = 0;
        this.O = null;
        this.P = null;
        this.Q = null;
        this.R = -1;
        this.S = null;
        this.T = null;
        this.U = null;
        this.V = null;
        this.W = new Bundle();
        this.X = 0;
        this.Y = 0;
        this.Z = 0L;
        this.f4345a0 = null;
        this.f4347b0 = null;
        this.f4349c0 = Double.MIN_VALUE;
        this.f4351d0 = Double.MIN_VALUE;
        this.f4353e0 = false;
        this.f4355f0 = null;
        this.f4357g0 = -1.0f;
        this.f4359h0 = -1.0d;
        this.f4361i0 = 0;
        this.f4363j0 = -1;
        this.f4367l0 = null;
        this.f4369m0 = null;
        this.f4371n0 = -1L;
    }

    private void a(Boolean bool) {
        this.f4382y = bool.booleanValue();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public double getAcc() {
        return this.D;
    }

    public String getAdCode() {
        return this.f4383z.adcode;
    }

    public String getAddrStr() {
        return this.f4383z.address;
    }

    public Address getAddress() {
        return this.f4383z;
    }

    public double getAltitude() {
        return this.f4354f;
    }

    public String getBuildingID() {
        return this.B;
    }

    public String getBuildingName() {
        return this.C;
    }

    public String getCity() {
        return this.f4383z.city;
    }

    public String getCityCode() {
        return this.f4383z.cityCode;
    }

    public String getCoorType() {
        return this.f4375r;
    }

    public String getCountry() {
        return this.f4383z.country;
    }

    public String getCountryCode() {
        return this.f4383z.countryCode;
    }

    public long getDelayTime() {
        return this.Z;
    }

    @Deprecated
    public float getDerect() {
        return this.f4374q;
    }

    public float getDirection() {
        return this.f4374q;
    }

    public double getDisToRealLocation() {
        return this.f4359h0;
    }

    public String getDistrict() {
        return this.f4383z.district;
    }

    public Bundle getExtraInfo() {
        return this.f4367l0;
    }

    public Location getExtraLocation(String str) {
        Bundle bundle = this.W;
        if (bundle == null) {
            return null;
        }
        Parcelable parcelable = bundle.getParcelable(str);
        if (parcelable instanceof Location) {
            return (Location) parcelable;
        }
        return null;
    }

    public String getFloor() {
        return this.A;
    }

    public double[] getFusionLocInfo(String str) {
        return this.W.getDoubleArray(str);
    }

    public int getGnssAccuracyStatus() {
        return this.X;
    }

    public float getGnssBiasProb() {
        return this.f4357g0;
    }

    public int getGnssCheckStatus() {
        return this.Y;
    }

    public String getGnssProvider() {
        return this.f4369m0;
    }

    @Deprecated
    public int getGpsAccuracyStatus() {
        return this.X;
    }

    @Deprecated
    public float getGpsBiasProb() {
        return this.f4357g0;
    }

    @Deprecated
    public int getGpsCheckStatus() {
        return this.Y;
    }

    public int getInOutStatus() {
        return this.R;
    }

    public int getIndoorLocationSource() {
        return this.N;
    }

    public int getIndoorLocationSurpport() {
        return this.L;
    }

    public String getIndoorLocationSurpportBuidlingID() {
        return this.P;
    }

    public String getIndoorLocationSurpportBuidlingName() {
        return this.O;
    }

    public int getIndoorNetworkState() {
        return this.M;
    }

    public String getIndoorSurpportPolygon() {
        return this.Q;
    }

    public double getLatitude() {
        return this.f4348c;
    }

    public int getLocType() {
        return this.f4344a;
    }

    public String getLocTypeDescription() {
        return this.T;
    }

    public String getLocationDescribe() {
        return this.f4379v;
    }

    public String getLocationID() {
        return this.U;
    }

    public int getLocationWhere() {
        return this.G;
    }

    public double getLongitude() {
        return this.f4350d;
    }

    public int getMockGnssProbability() {
        return this.f4363j0;
    }

    public int getMockGnssStrategy() {
        return this.f4361i0;
    }

    @Deprecated
    public int getMockGpsProbability() {
        return this.f4363j0;
    }

    @Deprecated
    public int getMockGpsStrategy() {
        return this.f4361i0;
    }

    public String getNetworkLocationType() {
        return this.H;
    }

    public double getNrlLat() {
        return this.f4349c0;
    }

    public double getNrlLon() {
        return this.f4351d0;
    }

    public String getNrlResult() {
        return this.f4345a0;
    }

    @Deprecated
    public int getOperators() {
        return this.I;
    }

    public List<Poi> getPoiList() {
        return this.S;
    }

    public PoiRegion getPoiRegion() {
        return this.f4355f0;
    }

    public String getProvince() {
        return this.f4383z.province;
    }

    public float getRadius() {
        return this.f4362j;
    }

    public BDLocation getReallLocation() {
        if (getMockGpsStrategy() > 0) {
            return this.f4365k0;
        }
        return null;
    }

    public String getRetFields(String str) {
        return this.W.getString(str);
    }

    public String getRoadLocString() {
        return this.V;
    }

    public int getSatelliteNumber() {
        this.f4372o = true;
        return this.f4373p;
    }

    @Deprecated
    public String getSemaAptag() {
        return this.f4379v;
    }

    public String getSemanticParams() {
        return this.f4378u;
    }

    public float getSpeed() {
        return this.f4358h;
    }

    public String getStreet() {
        return this.f4383z.street;
    }

    public String getStreetNumber() {
        return this.f4383z.streetNumber;
    }

    public String getTime() {
        return this.f4346b;
    }

    public long getTimeStamp() {
        return this.f4371n0;
    }

    public String getTown() {
        return this.f4383z.town;
    }

    public String getTownCode() {
        return this.f4383z.townCode;
    }

    public String getTraffic() {
        return this.f4364k;
    }

    public float getTrafficConfidence() {
        return this.f4366l;
    }

    public float getTrafficSkipProb() {
        return this.f4370n;
    }

    public int getUserIndoorState() {
        return this.K;
    }

    public String getVdrJsonString() {
        Bundle bundle = this.W;
        if (bundle == null || !bundle.containsKey("vdr")) {
            return null;
        }
        return this.W.getString("vdr");
    }

    public String getViaductResult() {
        return this.f4347b0;
    }

    public boolean hasAddr() {
        return this.f4376s;
    }

    public boolean hasAltitude() {
        return this.f4352e;
    }

    public boolean hasRadius() {
        return this.f4360i;
    }

    public boolean hasSateNumber() {
        return this.f4372o;
    }

    public boolean hasSpeed() {
        return this.f4356g;
    }

    public boolean isCellChangeFlag() {
        return this.f4382y;
    }

    public boolean isInIndoorPark() {
        return this.f4353e0;
    }

    public boolean isIndoorLocMode() {
        return this.E;
    }

    public boolean isNrlAvailable() {
        return (this.f4351d0 == Double.MIN_VALUE || this.f4349c0 == Double.MIN_VALUE) ? false : true;
    }

    public int isParkAvailable() {
        return this.F;
    }

    public int isTrafficStation() {
        return this.f4368m;
    }

    public void setAcc(double d8) {
        this.D = d8;
    }

    public void setAddr(Address address) {
        if (address != null) {
            this.f4383z = address;
            this.f4376s = true;
        }
    }

    public void setAddrStr(String str) {
        this.f4377t = str;
        this.f4376s = str != null;
    }

    public void setAltitude(double d8) {
        if (d8 < 9999.0d) {
            this.f4354f = d8;
            this.f4352e = true;
        }
    }

    public void setBuildingID(String str) {
        this.B = str;
    }

    public void setBuildingName(String str) {
        this.C = str;
    }

    public void setCoorType(String str) {
        this.f4375r = str;
    }

    public void setDelayTime(long j8) {
        this.Z = j8;
    }

    public void setDirection(float f8) {
        this.f4374q = f8;
    }

    public void setDisToRealLocation(double d8) {
        this.f4359h0 = d8;
    }

    public void setExtraLocation(String str, Location location) {
        if (this.W == null) {
            this.W = new Bundle();
        }
        this.W.putParcelable(str, location);
    }

    public void setExtrainfo(Bundle bundle) {
        this.f4367l0 = bundle == null ? null : new Bundle(bundle);
    }

    public void setFloor(String str) {
        this.A = str;
    }

    public void setFusionLocInfo(String str, double[] dArr) {
        if (this.W == null) {
            this.W = new Bundle();
        }
        this.W.putDoubleArray(str, dArr);
    }

    public void setGnssAccuracyStatus(int i8) {
        this.X = i8;
    }

    public void setGnssBiasProb(float f8) {
        this.f4357g0 = f8;
    }

    public void setGnssCheckStatus(int i8) {
        this.Y = i8;
    }

    public void setGnssProvider(String str) {
        this.f4369m0 = str;
    }

    @Deprecated
    public void setGpsAccuracyStatus(int i8) {
        this.X = i8;
    }

    @Deprecated
    public void setGpsBiasProb(float f8) {
        this.f4357g0 = f8;
    }

    @Deprecated
    public void setGpsCheckStatus(int i8) {
        this.Y = i8;
    }

    public void setInOutStatus(int i8) {
        this.R = i8;
    }

    public void setIndoorLocMode(boolean z7) {
        this.E = z7;
    }

    public void setIndoorLocationSource(int i8) {
        this.N = i8;
    }

    public void setIndoorLocationSurpport(int i8) {
        this.L = i8;
    }

    public void setIndoorNetworkState(int i8) {
        this.M = i8;
    }

    public void setIndoorSurpportPolygon(String str) {
        this.Q = str;
    }

    public void setIsInIndoorPark(boolean z7) {
        this.f4353e0 = z7;
    }

    public void setIsTrafficStation(int i8) {
        this.f4368m = i8;
    }

    public void setLatitude(double d8) {
        this.f4348c = d8;
    }

    public void setLocType(int i8) {
        String str;
        this.f4344a = i8;
        if (i8 != 66) {
            if (i8 != 67) {
                if (i8 == 167) {
                    str = "NetWork location failed because baidu location service can not caculate the location!";
                } else if (i8 != 505) {
                    switch (i8) {
                        case 61:
                            setLocTypeDescription("GPS location successful!");
                            setUserIndoorState(0);
                            setGnssProvider("system");
                            return;
                        case 62:
                            str = "Location failed beacuse we can not get any loc information!";
                            break;
                        case 63:
                            break;
                        default:
                            switch (i8) {
                                case 69:
                                    str = "Location failed because the location service switch is not on";
                                    break;
                                case 70:
                                    str = "Location failed because the location permission is not enabled";
                                    break;
                                case 71:
                                    str = "Location failed because the location service switch is not on and the location permission is not enabled";
                                    break;
                                default:
                                    switch (i8) {
                                        case TypeCoarseLocation /* 160 */:
                                            str = "Coarse location successful";
                                            break;
                                        case 161:
                                            str = "NetWork location successful!";
                                            break;
                                        case TypeServerDecryptError /* 162 */:
                                            str = "NetWork location failed because baidu location service can not decrypt the request query, please check the so file !";
                                            break;
                                        default:
                                            str = "UnKnown!";
                                            break;
                                    }
                            }
                    }
                } else {
                    str = "NetWork location failed because baidu location service check the key is unlegal, please check the key in AndroidManifest.xml !";
                }
            }
            str = "Offline location failed, please check the net (wifi/cell)!";
        } else {
            str = "Offline location successful!";
        }
        setLocTypeDescription(str);
    }

    public void setLocTypeDescription(String str) {
        this.T = str;
    }

    public void setLocationDescribe(String str) {
        this.f4379v = str;
    }

    public void setLocationID(String str) {
        this.U = str;
    }

    public void setLocationWhere(int i8) {
        this.G = i8;
    }

    public void setLongitude(double d8) {
        this.f4350d = d8;
    }

    public void setMockGnssProbability(int i8) {
        this.f4363j0 = i8;
    }

    public void setMockGnssStrategy(int i8) {
        this.f4361i0 = i8;
    }

    @Deprecated
    public void setMockGpsProbability(int i8) {
        this.f4363j0 = i8;
    }

    @Deprecated
    public void setMockGpsStrategy(int i8) {
        this.f4361i0 = i8;
    }

    public void setNetworkLocationType(String str) {
        this.H = str;
    }

    public void setNrlData(String str) {
        this.f4345a0 = str;
    }

    public void setOperators(int i8) {
        this.I = i8;
    }

    public void setParkAvailable(int i8) {
        this.F = i8;
    }

    public void setPoiList(List<Poi> list) {
        this.S = list;
    }

    public void setPoiRegion(PoiRegion poiRegion) {
        this.f4355f0 = poiRegion;
    }

    public void setRadius(float f8) {
        this.f4362j = f8;
        this.f4360i = true;
    }

    public void setReallLocation(BDLocation bDLocation) {
        if (getMockGpsStrategy() > 0) {
            this.f4365k0 = bDLocation;
        }
    }

    public void setRetFields(String str, String str2) {
        if (this.W == null) {
            this.W = new Bundle();
        }
        this.W.putString(str, str2);
    }

    public void setRoadLocString(float f8, float f9, String str, String str2) {
        String str3;
        String format = ((double) f8) > 0.001d ? String.format("%.2f", Float.valueOf(f8)) : "";
        String format2 = ((double) f9) > 0.001d ? String.format("%.2f", Float.valueOf(f9)) : "";
        String str4 = this.f4345a0;
        if (str4 != null) {
            Locale locale = Locale.US;
            str3 = String.format(locale, "%s|%s,%s", str4, format, format2);
            String str5 = this.f4347b0;
            if (str5 != null) {
                str3 = String.format(locale, "%s|%s", str3, str5);
            }
        } else {
            str3 = null;
        }
        if (str == null) {
            str = str3;
        } else if (str3 != null) {
            str = String.format(Locale.US, "%s|%s", str3, str);
        }
        if (str2 == null) {
            str2 = str;
        } else if (str != null) {
            str2 = String.format(Locale.US, "%s|%s", str, str2);
        }
        this.V = str2;
    }

    public void setSatelliteNumber(int i8) {
        this.f4373p = i8;
    }

    public void setSemanticParams(String str) {
        this.f4378u = str;
    }

    public void setSpeed(float f8) {
        this.f4358h = f8;
        this.f4356g = true;
    }

    public void setTime(String str) {
        this.f4346b = str;
        setLocationID(i.a(str));
    }

    public void setTimeStamp(long j8) {
        this.f4371n0 = j8;
    }

    public void setTraffic(String str) {
        this.f4364k = str;
    }

    public void setTrafficConfidence(float f8) {
        this.f4366l = f8;
    }

    public void setTrafficSkipProb(float f8) {
        this.f4370n = f8;
    }

    public void setUserIndoorState(int i8) {
        this.K = i8;
    }

    public void setVdrJsonValue(String str) {
        try {
            if (this.W == null) {
                this.W = new Bundle();
            }
            this.W.putString("vdr", str);
        } catch (Exception unused) {
        }
    }

    public void setViaductData(String str) {
        this.f4347b0 = str;
    }

    public String toString() {
        return "&loctype=" + getLocType() + "&lat=" + getLatitude() + "&lon=" + getLongitude() + "&radius=" + getRadius() + "&biasprob=" + getGpsBiasProb() + "&altitude=" + getAltitude() + "&speed=" + getSpeed() + "&time=" + getTimeStamp() + "&extrainfo=" + getExtraInfo();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        parcel.writeInt(this.f4344a);
        parcel.writeString(this.f4346b);
        parcel.writeLong(this.f4371n0);
        parcel.writeDouble(this.f4348c);
        parcel.writeDouble(this.f4350d);
        parcel.writeDouble(this.f4354f);
        parcel.writeFloat(this.f4358h);
        parcel.writeFloat(this.f4362j);
        parcel.writeString(this.f4364k);
        parcel.writeFloat(this.f4366l);
        parcel.writeInt(this.f4368m);
        parcel.writeFloat(this.f4370n);
        parcel.writeInt(this.f4373p);
        parcel.writeFloat(this.f4374q);
        parcel.writeString(this.A);
        parcel.writeInt(this.F);
        parcel.writeString(this.B);
        parcel.writeString(this.C);
        parcel.writeDouble(this.D);
        parcel.writeString(this.H);
        parcel.writeString(this.f4383z.province);
        parcel.writeString(this.f4383z.city);
        parcel.writeString(this.f4383z.district);
        parcel.writeString(this.f4383z.street);
        parcel.writeString(this.f4383z.streetNumber);
        parcel.writeString(this.f4383z.cityCode);
        parcel.writeString(this.f4383z.address);
        parcel.writeString(this.f4383z.country);
        parcel.writeString(this.f4383z.countryCode);
        parcel.writeString(this.f4383z.adcode);
        parcel.writeString(this.f4383z.town);
        parcel.writeString(this.f4383z.townCode);
        parcel.writeInt(this.I);
        parcel.writeString(this.J);
        parcel.writeString(this.f4379v);
        parcel.writeString(this.f4380w);
        parcel.writeString(this.f4381x);
        parcel.writeInt(this.G);
        parcel.writeString(this.T);
        parcel.writeInt(this.K);
        parcel.writeInt(this.L);
        parcel.writeInt(this.M);
        parcel.writeInt(this.N);
        parcel.writeString(this.O);
        parcel.writeString(this.P);
        parcel.writeString(this.Q);
        parcel.writeInt(this.R);
        parcel.writeInt(this.X);
        parcel.writeString(this.U);
        parcel.writeInt(this.Y);
        parcel.writeString(this.V);
        parcel.writeString(this.f4345a0);
        parcel.writeString(this.f4347b0);
        parcel.writeLong(this.Z);
        parcel.writeDouble(this.f4349c0);
        parcel.writeDouble(this.f4351d0);
        parcel.writeFloat(this.f4357g0);
        parcel.writeDouble(this.f4359h0);
        parcel.writeInt(this.f4361i0);
        parcel.writeInt(this.f4363j0);
        parcel.writeString(this.f4375r);
        parcel.writeString(this.f4369m0);
        parcel.writeString(this.f4378u);
        parcel.writeParcelable(this.f4365k0, i8);
        parcel.writeBooleanArray(new boolean[]{this.f4352e, this.f4356g, this.f4360i, this.f4372o, this.f4376s, this.f4382y, this.E, this.f4353e0});
        parcel.writeList(this.S);
        parcel.writeBundle(this.W);
        parcel.writeBundle(this.f4367l0);
        parcel.writeParcelable(this.f4355f0, i8);
    }

    private BDLocation(Parcel parcel) {
        this.f4344a = 0;
        this.f4346b = null;
        this.f4348c = Double.MIN_VALUE;
        this.f4350d = Double.MIN_VALUE;
        this.f4352e = false;
        this.f4354f = Double.MIN_VALUE;
        this.f4356g = false;
        this.f4358h = 0.0f;
        this.f4360i = false;
        this.f4362j = 0.0f;
        this.f4366l = 0.0f;
        this.f4368m = -1;
        this.f4370n = 0.0f;
        this.f4372o = false;
        this.f4373p = -1;
        this.f4374q = -1.0f;
        this.f4375r = null;
        this.f4376s = false;
        this.f4377t = null;
        this.f4378u = null;
        this.f4379v = null;
        this.f4380w = null;
        this.f4381x = null;
        this.f4382y = false;
        this.f4383z = new Address.Builder().build();
        this.A = null;
        this.B = null;
        this.C = null;
        this.E = false;
        this.F = 0;
        this.G = 1;
        this.H = null;
        this.J = "";
        this.K = -1;
        this.L = 0;
        this.M = 2;
        this.N = 0;
        this.O = null;
        this.P = null;
        this.Q = null;
        this.R = -1;
        this.S = null;
        this.T = null;
        this.U = null;
        this.V = null;
        this.W = new Bundle();
        this.X = 0;
        this.Y = 0;
        this.Z = 0L;
        this.f4345a0 = null;
        this.f4347b0 = null;
        this.f4349c0 = Double.MIN_VALUE;
        this.f4351d0 = Double.MIN_VALUE;
        this.f4353e0 = false;
        this.f4355f0 = null;
        this.f4357g0 = -1.0f;
        this.f4359h0 = -1.0d;
        this.f4361i0 = 0;
        this.f4363j0 = -1;
        this.f4367l0 = null;
        this.f4369m0 = null;
        this.f4371n0 = -1L;
        this.f4344a = parcel.readInt();
        this.f4346b = parcel.readString();
        this.f4371n0 = parcel.readLong();
        this.f4348c = parcel.readDouble();
        this.f4350d = parcel.readDouble();
        this.f4354f = parcel.readDouble();
        this.f4358h = parcel.readFloat();
        this.f4362j = parcel.readFloat();
        this.f4364k = parcel.readString();
        this.f4366l = parcel.readFloat();
        this.f4368m = parcel.readInt();
        this.f4370n = parcel.readFloat();
        this.f4373p = parcel.readInt();
        this.f4374q = parcel.readFloat();
        this.A = parcel.readString();
        this.F = parcel.readInt();
        this.B = parcel.readString();
        this.C = parcel.readString();
        this.D = parcel.readDouble();
        this.H = parcel.readString();
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        String readString3 = parcel.readString();
        String readString4 = parcel.readString();
        String readString5 = parcel.readString();
        String readString6 = parcel.readString();
        parcel.readString();
        String readString7 = parcel.readString();
        String readString8 = parcel.readString();
        String readString9 = parcel.readString();
        String readString10 = parcel.readString();
        this.f4383z = new Address.Builder().country(readString7).countryCode(readString8).province(readString).city(readString2).cityCode(readString6).district(readString3).street(readString4).streetNumber(readString5).adcode(readString9).town(readString10).townCode(parcel.readString()).build();
        boolean[] zArr = new boolean[8];
        this.I = parcel.readInt();
        this.J = parcel.readString();
        this.f4379v = parcel.readString();
        this.f4380w = parcel.readString();
        this.f4381x = parcel.readString();
        this.G = parcel.readInt();
        this.T = parcel.readString();
        this.K = parcel.readInt();
        this.L = parcel.readInt();
        this.M = parcel.readInt();
        this.N = parcel.readInt();
        this.O = parcel.readString();
        this.P = parcel.readString();
        this.Q = parcel.readString();
        this.R = parcel.readInt();
        this.X = parcel.readInt();
        this.U = parcel.readString();
        this.Y = parcel.readInt();
        this.V = parcel.readString();
        this.f4345a0 = parcel.readString();
        this.f4347b0 = parcel.readString();
        this.Z = parcel.readLong();
        this.f4349c0 = parcel.readDouble();
        this.f4351d0 = parcel.readDouble();
        this.f4357g0 = parcel.readFloat();
        this.f4359h0 = parcel.readDouble();
        this.f4361i0 = parcel.readInt();
        this.f4363j0 = parcel.readInt();
        this.f4375r = parcel.readString();
        this.f4369m0 = parcel.readString();
        this.f4378u = parcel.readString();
        try {
            this.f4365k0 = (BDLocation) parcel.readParcelable(BDLocation.class.getClassLoader());
        } catch (Exception e8) {
            this.f4365k0 = null;
            e8.printStackTrace();
        }
        try {
            parcel.readBooleanArray(zArr);
            this.f4352e = zArr[0];
            this.f4356g = zArr[1];
            this.f4360i = zArr[2];
            this.f4372o = zArr[3];
            this.f4376s = zArr[4];
            this.f4382y = zArr[5];
            this.E = zArr[6];
            this.f4353e0 = zArr[7];
        } catch (Exception unused) {
        }
        ArrayList arrayList = new ArrayList();
        try {
            parcel.readList(arrayList, Poi.class.getClassLoader());
        } catch (Exception e9) {
            e9.printStackTrace();
        }
        if (arrayList.size() == 0) {
            this.S = null;
        } else {
            this.S = arrayList;
        }
        try {
            this.W = parcel.readBundle();
        } catch (Exception e10) {
            e10.printStackTrace();
            this.W = new Bundle();
        }
        try {
            this.f4367l0 = parcel.readBundle();
        } catch (Exception e11) {
            e11.printStackTrace();
            this.f4367l0 = new Bundle();
        }
        try {
            this.f4355f0 = (PoiRegion) parcel.readParcelable(PoiRegion.class.getClassLoader());
        } catch (Exception e12) {
            this.f4355f0 = null;
            e12.printStackTrace();
        }
    }

    /* synthetic */ BDLocation(Parcel parcel, a aVar) {
        this(parcel);
    }

    public BDLocation(BDLocation bDLocation) {
        this.f4344a = 0;
        ArrayList arrayList = null;
        this.f4346b = null;
        this.f4348c = Double.MIN_VALUE;
        this.f4350d = Double.MIN_VALUE;
        this.f4352e = false;
        this.f4354f = Double.MIN_VALUE;
        this.f4356g = false;
        this.f4358h = 0.0f;
        this.f4360i = false;
        this.f4362j = 0.0f;
        this.f4366l = 0.0f;
        this.f4368m = -1;
        this.f4370n = 0.0f;
        this.f4372o = false;
        this.f4373p = -1;
        this.f4374q = -1.0f;
        this.f4375r = null;
        this.f4376s = false;
        this.f4377t = null;
        this.f4378u = null;
        this.f4379v = null;
        this.f4380w = null;
        this.f4381x = null;
        this.f4382y = false;
        this.f4383z = new Address.Builder().build();
        this.A = null;
        this.B = null;
        this.C = null;
        this.E = false;
        this.F = 0;
        this.G = 1;
        this.H = null;
        this.J = "";
        this.K = -1;
        this.L = 0;
        this.M = 2;
        this.N = 0;
        this.O = null;
        this.P = null;
        this.Q = null;
        this.R = -1;
        this.S = null;
        this.T = null;
        this.U = null;
        this.V = null;
        this.W = new Bundle();
        this.X = 0;
        this.Y = 0;
        this.Z = 0L;
        this.f4345a0 = null;
        this.f4347b0 = null;
        this.f4349c0 = Double.MIN_VALUE;
        this.f4351d0 = Double.MIN_VALUE;
        this.f4353e0 = false;
        this.f4355f0 = null;
        this.f4357g0 = -1.0f;
        this.f4359h0 = -1.0d;
        this.f4361i0 = 0;
        this.f4363j0 = -1;
        this.f4367l0 = null;
        this.f4369m0 = null;
        this.f4371n0 = -1L;
        this.f4344a = bDLocation.f4344a;
        this.f4346b = bDLocation.f4346b;
        this.f4371n0 = bDLocation.f4371n0;
        this.f4348c = bDLocation.f4348c;
        this.f4350d = bDLocation.f4350d;
        this.f4352e = bDLocation.f4352e;
        this.f4354f = bDLocation.f4354f;
        this.f4356g = bDLocation.f4356g;
        this.f4358h = bDLocation.f4358h;
        this.f4360i = bDLocation.f4360i;
        this.f4362j = bDLocation.f4362j;
        this.f4364k = bDLocation.f4364k;
        this.f4366l = bDLocation.f4366l;
        this.f4368m = bDLocation.f4368m;
        this.f4370n = bDLocation.f4370n;
        this.f4372o = bDLocation.f4372o;
        this.f4373p = bDLocation.f4373p;
        this.f4374q = bDLocation.f4374q;
        this.f4375r = bDLocation.f4375r;
        this.f4376s = bDLocation.f4376s;
        this.f4377t = bDLocation.f4377t;
        this.f4382y = bDLocation.f4382y;
        this.f4383z = new Address.Builder().country(bDLocation.f4383z.country).countryCode(bDLocation.f4383z.countryCode).province(bDLocation.f4383z.province).city(bDLocation.f4383z.city).cityCode(bDLocation.f4383z.cityCode).district(bDLocation.f4383z.district).street(bDLocation.f4383z.street).streetNumber(bDLocation.f4383z.streetNumber).adcode(bDLocation.f4383z.adcode).town(bDLocation.f4383z.town).townCode(bDLocation.f4383z.townCode).build();
        this.A = bDLocation.A;
        this.B = bDLocation.B;
        this.C = bDLocation.C;
        this.D = bDLocation.D;
        this.G = bDLocation.G;
        this.F = bDLocation.F;
        this.E = bDLocation.E;
        this.H = bDLocation.H;
        this.I = bDLocation.I;
        this.J = bDLocation.J;
        this.f4379v = bDLocation.f4379v;
        this.f4380w = bDLocation.f4380w;
        this.f4381x = bDLocation.f4381x;
        this.K = bDLocation.K;
        this.L = bDLocation.L;
        this.M = bDLocation.L;
        this.N = bDLocation.N;
        this.O = bDLocation.O;
        this.P = bDLocation.P;
        this.Q = bDLocation.Q;
        this.R = bDLocation.R;
        this.X = bDLocation.X;
        this.V = bDLocation.V;
        this.f4345a0 = bDLocation.f4345a0;
        this.f4347b0 = bDLocation.f4347b0;
        this.f4349c0 = bDLocation.f4349c0;
        this.f4351d0 = bDLocation.f4351d0;
        this.Z = bDLocation.Z;
        this.f4359h0 = bDLocation.f4359h0;
        this.f4361i0 = bDLocation.f4361i0;
        this.f4363j0 = bDLocation.f4363j0;
        this.f4365k0 = bDLocation.f4365k0;
        this.U = bDLocation.U;
        if (bDLocation.S != null) {
            arrayList = new ArrayList();
            for (int i8 = 0; i8 < bDLocation.S.size(); i8++) {
                Poi poi = bDLocation.S.get(i8);
                arrayList.add(new Poi(poi.getId(), poi.getName(), poi.getRank(), poi.getTags(), poi.getAddr()));
            }
        }
        this.S = arrayList;
        this.T = bDLocation.T;
        this.W = bDLocation.W;
        this.Y = bDLocation.Y;
        this.f4353e0 = bDLocation.f4353e0;
        this.f4355f0 = bDLocation.f4355f0;
        this.f4357g0 = bDLocation.f4357g0;
        this.f4367l0 = bDLocation.f4367l0;
        this.f4369m0 = bDLocation.f4369m0;
        this.f4378u = bDLocation.f4378u;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x032a A[Catch: Error -> 0x0155, Exception -> 0x0159, TryCatch #14 {Exception -> 0x0159, blocks: (B:9:0x00be, B:12:0x00f3, B:14:0x014b, B:15:0x015e, B:25:0x0185, B:28:0x018c, B:31:0x0191, B:37:0x019b, B:39:0x01ca, B:40:0x01d1, B:42:0x01d7, B:43:0x01e2, B:45:0x01e8, B:46:0x01ef, B:48:0x01f5, B:49:0x0200, B:52:0x020a, B:54:0x0218, B:56:0x0224, B:57:0x0229, B:58:0x022d, B:60:0x0235, B:61:0x0247, B:63:0x024d, B:65:0x026b, B:66:0x0276, B:68:0x027c, B:70:0x0285, B:75:0x0292, B:76:0x0294, B:78:0x029c, B:80:0x02a8, B:81:0x02aa, B:83:0x02b2, B:85:0x02c0, B:86:0x02cb, B:88:0x02d3, B:89:0x02de, B:91:0x02e6, B:92:0x02f1, B:94:0x02f9, B:95:0x0304, B:97:0x030d, B:98:0x0319, B:104:0x0322, B:106:0x032a, B:108:0x0336, B:109:0x033b, B:257:0x034e, B:259:0x0356, B:260:0x035e, B:262:0x0366, B:263:0x036e, B:265:0x0376, B:266:0x037e, B:268:0x0386, B:269:0x038e, B:271:0x0396, B:272:0x03a2, B:274:0x03aa, B:275:0x03b5, B:277:0x03bd, B:278:0x03c8, B:280:0x03d0, B:281:0x03db, B:283:0x03e3, B:284:0x03ee, B:286:0x03f7, B:287:0x0403, B:289:0x040c, B:293:0x04ff, B:113:0x054e, B:115:0x0556, B:117:0x0564, B:118:0x0567, B:120:0x056f, B:122:0x057b, B:123:0x0586, B:125:0x058e, B:127:0x059c, B:128:0x059f, B:130:0x05a7, B:132:0x05b5, B:133:0x05b8, B:135:0x05c0, B:137:0x05ce, B:138:0x05d1, B:140:0x05d9, B:141:0x05e1, B:143:0x05e9, B:146:0x0600, B:147:0x05f7, B:150:0x0603, B:151:0x060c, B:153:0x06e4, B:155:0x06ec, B:160:0x0710, B:162:0x0714, B:163:0x0720, B:165:0x0728, B:166:0x0730, B:168:0x0738, B:184:0x076e, B:185:0x0771, B:187:0x07aa, B:189:0x07b2, B:200:0x07a6, B:201:0x071b, B:204:0x06f6, B:252:0x06e1, B:352:0x04e5, B:112:0x053f, B:406:0x07cb, B:409:0x07d0), top: B:8:0x00be }] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0556 A[Catch: Error -> 0x0155, Exception -> 0x0159, TryCatch #14 {Exception -> 0x0159, blocks: (B:9:0x00be, B:12:0x00f3, B:14:0x014b, B:15:0x015e, B:25:0x0185, B:28:0x018c, B:31:0x0191, B:37:0x019b, B:39:0x01ca, B:40:0x01d1, B:42:0x01d7, B:43:0x01e2, B:45:0x01e8, B:46:0x01ef, B:48:0x01f5, B:49:0x0200, B:52:0x020a, B:54:0x0218, B:56:0x0224, B:57:0x0229, B:58:0x022d, B:60:0x0235, B:61:0x0247, B:63:0x024d, B:65:0x026b, B:66:0x0276, B:68:0x027c, B:70:0x0285, B:75:0x0292, B:76:0x0294, B:78:0x029c, B:80:0x02a8, B:81:0x02aa, B:83:0x02b2, B:85:0x02c0, B:86:0x02cb, B:88:0x02d3, B:89:0x02de, B:91:0x02e6, B:92:0x02f1, B:94:0x02f9, B:95:0x0304, B:97:0x030d, B:98:0x0319, B:104:0x0322, B:106:0x032a, B:108:0x0336, B:109:0x033b, B:257:0x034e, B:259:0x0356, B:260:0x035e, B:262:0x0366, B:263:0x036e, B:265:0x0376, B:266:0x037e, B:268:0x0386, B:269:0x038e, B:271:0x0396, B:272:0x03a2, B:274:0x03aa, B:275:0x03b5, B:277:0x03bd, B:278:0x03c8, B:280:0x03d0, B:281:0x03db, B:283:0x03e3, B:284:0x03ee, B:286:0x03f7, B:287:0x0403, B:289:0x040c, B:293:0x04ff, B:113:0x054e, B:115:0x0556, B:117:0x0564, B:118:0x0567, B:120:0x056f, B:122:0x057b, B:123:0x0586, B:125:0x058e, B:127:0x059c, B:128:0x059f, B:130:0x05a7, B:132:0x05b5, B:133:0x05b8, B:135:0x05c0, B:137:0x05ce, B:138:0x05d1, B:140:0x05d9, B:141:0x05e1, B:143:0x05e9, B:146:0x0600, B:147:0x05f7, B:150:0x0603, B:151:0x060c, B:153:0x06e4, B:155:0x06ec, B:160:0x0710, B:162:0x0714, B:163:0x0720, B:165:0x0728, B:166:0x0730, B:168:0x0738, B:184:0x076e, B:185:0x0771, B:187:0x07aa, B:189:0x07b2, B:200:0x07a6, B:201:0x071b, B:204:0x06f6, B:252:0x06e1, B:352:0x04e5, B:112:0x053f, B:406:0x07cb, B:409:0x07d0), top: B:8:0x00be }] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x056f A[Catch: Error -> 0x0155, Exception -> 0x0159, TryCatch #14 {Exception -> 0x0159, blocks: (B:9:0x00be, B:12:0x00f3, B:14:0x014b, B:15:0x015e, B:25:0x0185, B:28:0x018c, B:31:0x0191, B:37:0x019b, B:39:0x01ca, B:40:0x01d1, B:42:0x01d7, B:43:0x01e2, B:45:0x01e8, B:46:0x01ef, B:48:0x01f5, B:49:0x0200, B:52:0x020a, B:54:0x0218, B:56:0x0224, B:57:0x0229, B:58:0x022d, B:60:0x0235, B:61:0x0247, B:63:0x024d, B:65:0x026b, B:66:0x0276, B:68:0x027c, B:70:0x0285, B:75:0x0292, B:76:0x0294, B:78:0x029c, B:80:0x02a8, B:81:0x02aa, B:83:0x02b2, B:85:0x02c0, B:86:0x02cb, B:88:0x02d3, B:89:0x02de, B:91:0x02e6, B:92:0x02f1, B:94:0x02f9, B:95:0x0304, B:97:0x030d, B:98:0x0319, B:104:0x0322, B:106:0x032a, B:108:0x0336, B:109:0x033b, B:257:0x034e, B:259:0x0356, B:260:0x035e, B:262:0x0366, B:263:0x036e, B:265:0x0376, B:266:0x037e, B:268:0x0386, B:269:0x038e, B:271:0x0396, B:272:0x03a2, B:274:0x03aa, B:275:0x03b5, B:277:0x03bd, B:278:0x03c8, B:280:0x03d0, B:281:0x03db, B:283:0x03e3, B:284:0x03ee, B:286:0x03f7, B:287:0x0403, B:289:0x040c, B:293:0x04ff, B:113:0x054e, B:115:0x0556, B:117:0x0564, B:118:0x0567, B:120:0x056f, B:122:0x057b, B:123:0x0586, B:125:0x058e, B:127:0x059c, B:128:0x059f, B:130:0x05a7, B:132:0x05b5, B:133:0x05b8, B:135:0x05c0, B:137:0x05ce, B:138:0x05d1, B:140:0x05d9, B:141:0x05e1, B:143:0x05e9, B:146:0x0600, B:147:0x05f7, B:150:0x0603, B:151:0x060c, B:153:0x06e4, B:155:0x06ec, B:160:0x0710, B:162:0x0714, B:163:0x0720, B:165:0x0728, B:166:0x0730, B:168:0x0738, B:184:0x076e, B:185:0x0771, B:187:0x07aa, B:189:0x07b2, B:200:0x07a6, B:201:0x071b, B:204:0x06f6, B:252:0x06e1, B:352:0x04e5, B:112:0x053f, B:406:0x07cb, B:409:0x07d0), top: B:8:0x00be }] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x058e A[Catch: Error -> 0x0155, Exception -> 0x0159, TryCatch #14 {Exception -> 0x0159, blocks: (B:9:0x00be, B:12:0x00f3, B:14:0x014b, B:15:0x015e, B:25:0x0185, B:28:0x018c, B:31:0x0191, B:37:0x019b, B:39:0x01ca, B:40:0x01d1, B:42:0x01d7, B:43:0x01e2, B:45:0x01e8, B:46:0x01ef, B:48:0x01f5, B:49:0x0200, B:52:0x020a, B:54:0x0218, B:56:0x0224, B:57:0x0229, B:58:0x022d, B:60:0x0235, B:61:0x0247, B:63:0x024d, B:65:0x026b, B:66:0x0276, B:68:0x027c, B:70:0x0285, B:75:0x0292, B:76:0x0294, B:78:0x029c, B:80:0x02a8, B:81:0x02aa, B:83:0x02b2, B:85:0x02c0, B:86:0x02cb, B:88:0x02d3, B:89:0x02de, B:91:0x02e6, B:92:0x02f1, B:94:0x02f9, B:95:0x0304, B:97:0x030d, B:98:0x0319, B:104:0x0322, B:106:0x032a, B:108:0x0336, B:109:0x033b, B:257:0x034e, B:259:0x0356, B:260:0x035e, B:262:0x0366, B:263:0x036e, B:265:0x0376, B:266:0x037e, B:268:0x0386, B:269:0x038e, B:271:0x0396, B:272:0x03a2, B:274:0x03aa, B:275:0x03b5, B:277:0x03bd, B:278:0x03c8, B:280:0x03d0, B:281:0x03db, B:283:0x03e3, B:284:0x03ee, B:286:0x03f7, B:287:0x0403, B:289:0x040c, B:293:0x04ff, B:113:0x054e, B:115:0x0556, B:117:0x0564, B:118:0x0567, B:120:0x056f, B:122:0x057b, B:123:0x0586, B:125:0x058e, B:127:0x059c, B:128:0x059f, B:130:0x05a7, B:132:0x05b5, B:133:0x05b8, B:135:0x05c0, B:137:0x05ce, B:138:0x05d1, B:140:0x05d9, B:141:0x05e1, B:143:0x05e9, B:146:0x0600, B:147:0x05f7, B:150:0x0603, B:151:0x060c, B:153:0x06e4, B:155:0x06ec, B:160:0x0710, B:162:0x0714, B:163:0x0720, B:165:0x0728, B:166:0x0730, B:168:0x0738, B:184:0x076e, B:185:0x0771, B:187:0x07aa, B:189:0x07b2, B:200:0x07a6, B:201:0x071b, B:204:0x06f6, B:252:0x06e1, B:352:0x04e5, B:112:0x053f, B:406:0x07cb, B:409:0x07d0), top: B:8:0x00be }] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x05a7 A[Catch: Error -> 0x0155, Exception -> 0x0159, TryCatch #14 {Exception -> 0x0159, blocks: (B:9:0x00be, B:12:0x00f3, B:14:0x014b, B:15:0x015e, B:25:0x0185, B:28:0x018c, B:31:0x0191, B:37:0x019b, B:39:0x01ca, B:40:0x01d1, B:42:0x01d7, B:43:0x01e2, B:45:0x01e8, B:46:0x01ef, B:48:0x01f5, B:49:0x0200, B:52:0x020a, B:54:0x0218, B:56:0x0224, B:57:0x0229, B:58:0x022d, B:60:0x0235, B:61:0x0247, B:63:0x024d, B:65:0x026b, B:66:0x0276, B:68:0x027c, B:70:0x0285, B:75:0x0292, B:76:0x0294, B:78:0x029c, B:80:0x02a8, B:81:0x02aa, B:83:0x02b2, B:85:0x02c0, B:86:0x02cb, B:88:0x02d3, B:89:0x02de, B:91:0x02e6, B:92:0x02f1, B:94:0x02f9, B:95:0x0304, B:97:0x030d, B:98:0x0319, B:104:0x0322, B:106:0x032a, B:108:0x0336, B:109:0x033b, B:257:0x034e, B:259:0x0356, B:260:0x035e, B:262:0x0366, B:263:0x036e, B:265:0x0376, B:266:0x037e, B:268:0x0386, B:269:0x038e, B:271:0x0396, B:272:0x03a2, B:274:0x03aa, B:275:0x03b5, B:277:0x03bd, B:278:0x03c8, B:280:0x03d0, B:281:0x03db, B:283:0x03e3, B:284:0x03ee, B:286:0x03f7, B:287:0x0403, B:289:0x040c, B:293:0x04ff, B:113:0x054e, B:115:0x0556, B:117:0x0564, B:118:0x0567, B:120:0x056f, B:122:0x057b, B:123:0x0586, B:125:0x058e, B:127:0x059c, B:128:0x059f, B:130:0x05a7, B:132:0x05b5, B:133:0x05b8, B:135:0x05c0, B:137:0x05ce, B:138:0x05d1, B:140:0x05d9, B:141:0x05e1, B:143:0x05e9, B:146:0x0600, B:147:0x05f7, B:150:0x0603, B:151:0x060c, B:153:0x06e4, B:155:0x06ec, B:160:0x0710, B:162:0x0714, B:163:0x0720, B:165:0x0728, B:166:0x0730, B:168:0x0738, B:184:0x076e, B:185:0x0771, B:187:0x07aa, B:189:0x07b2, B:200:0x07a6, B:201:0x071b, B:204:0x06f6, B:252:0x06e1, B:352:0x04e5, B:112:0x053f, B:406:0x07cb, B:409:0x07d0), top: B:8:0x00be }] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x05c0 A[Catch: Error -> 0x0155, Exception -> 0x0159, TryCatch #14 {Exception -> 0x0159, blocks: (B:9:0x00be, B:12:0x00f3, B:14:0x014b, B:15:0x015e, B:25:0x0185, B:28:0x018c, B:31:0x0191, B:37:0x019b, B:39:0x01ca, B:40:0x01d1, B:42:0x01d7, B:43:0x01e2, B:45:0x01e8, B:46:0x01ef, B:48:0x01f5, B:49:0x0200, B:52:0x020a, B:54:0x0218, B:56:0x0224, B:57:0x0229, B:58:0x022d, B:60:0x0235, B:61:0x0247, B:63:0x024d, B:65:0x026b, B:66:0x0276, B:68:0x027c, B:70:0x0285, B:75:0x0292, B:76:0x0294, B:78:0x029c, B:80:0x02a8, B:81:0x02aa, B:83:0x02b2, B:85:0x02c0, B:86:0x02cb, B:88:0x02d3, B:89:0x02de, B:91:0x02e6, B:92:0x02f1, B:94:0x02f9, B:95:0x0304, B:97:0x030d, B:98:0x0319, B:104:0x0322, B:106:0x032a, B:108:0x0336, B:109:0x033b, B:257:0x034e, B:259:0x0356, B:260:0x035e, B:262:0x0366, B:263:0x036e, B:265:0x0376, B:266:0x037e, B:268:0x0386, B:269:0x038e, B:271:0x0396, B:272:0x03a2, B:274:0x03aa, B:275:0x03b5, B:277:0x03bd, B:278:0x03c8, B:280:0x03d0, B:281:0x03db, B:283:0x03e3, B:284:0x03ee, B:286:0x03f7, B:287:0x0403, B:289:0x040c, B:293:0x04ff, B:113:0x054e, B:115:0x0556, B:117:0x0564, B:118:0x0567, B:120:0x056f, B:122:0x057b, B:123:0x0586, B:125:0x058e, B:127:0x059c, B:128:0x059f, B:130:0x05a7, B:132:0x05b5, B:133:0x05b8, B:135:0x05c0, B:137:0x05ce, B:138:0x05d1, B:140:0x05d9, B:141:0x05e1, B:143:0x05e9, B:146:0x0600, B:147:0x05f7, B:150:0x0603, B:151:0x060c, B:153:0x06e4, B:155:0x06ec, B:160:0x0710, B:162:0x0714, B:163:0x0720, B:165:0x0728, B:166:0x0730, B:168:0x0738, B:184:0x076e, B:185:0x0771, B:187:0x07aa, B:189:0x07b2, B:200:0x07a6, B:201:0x071b, B:204:0x06f6, B:252:0x06e1, B:352:0x04e5, B:112:0x053f, B:406:0x07cb, B:409:0x07d0), top: B:8:0x00be }] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x05d9 A[Catch: Error -> 0x0155, Exception -> 0x0159, TryCatch #14 {Exception -> 0x0159, blocks: (B:9:0x00be, B:12:0x00f3, B:14:0x014b, B:15:0x015e, B:25:0x0185, B:28:0x018c, B:31:0x0191, B:37:0x019b, B:39:0x01ca, B:40:0x01d1, B:42:0x01d7, B:43:0x01e2, B:45:0x01e8, B:46:0x01ef, B:48:0x01f5, B:49:0x0200, B:52:0x020a, B:54:0x0218, B:56:0x0224, B:57:0x0229, B:58:0x022d, B:60:0x0235, B:61:0x0247, B:63:0x024d, B:65:0x026b, B:66:0x0276, B:68:0x027c, B:70:0x0285, B:75:0x0292, B:76:0x0294, B:78:0x029c, B:80:0x02a8, B:81:0x02aa, B:83:0x02b2, B:85:0x02c0, B:86:0x02cb, B:88:0x02d3, B:89:0x02de, B:91:0x02e6, B:92:0x02f1, B:94:0x02f9, B:95:0x0304, B:97:0x030d, B:98:0x0319, B:104:0x0322, B:106:0x032a, B:108:0x0336, B:109:0x033b, B:257:0x034e, B:259:0x0356, B:260:0x035e, B:262:0x0366, B:263:0x036e, B:265:0x0376, B:266:0x037e, B:268:0x0386, B:269:0x038e, B:271:0x0396, B:272:0x03a2, B:274:0x03aa, B:275:0x03b5, B:277:0x03bd, B:278:0x03c8, B:280:0x03d0, B:281:0x03db, B:283:0x03e3, B:284:0x03ee, B:286:0x03f7, B:287:0x0403, B:289:0x040c, B:293:0x04ff, B:113:0x054e, B:115:0x0556, B:117:0x0564, B:118:0x0567, B:120:0x056f, B:122:0x057b, B:123:0x0586, B:125:0x058e, B:127:0x059c, B:128:0x059f, B:130:0x05a7, B:132:0x05b5, B:133:0x05b8, B:135:0x05c0, B:137:0x05ce, B:138:0x05d1, B:140:0x05d9, B:141:0x05e1, B:143:0x05e9, B:146:0x0600, B:147:0x05f7, B:150:0x0603, B:151:0x060c, B:153:0x06e4, B:155:0x06ec, B:160:0x0710, B:162:0x0714, B:163:0x0720, B:165:0x0728, B:166:0x0730, B:168:0x0738, B:184:0x076e, B:185:0x0771, B:187:0x07aa, B:189:0x07b2, B:200:0x07a6, B:201:0x071b, B:204:0x06f6, B:252:0x06e1, B:352:0x04e5, B:112:0x053f, B:406:0x07cb, B:409:0x07d0), top: B:8:0x00be }] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x05e9 A[Catch: Error -> 0x0155, Exception -> 0x0159, TryCatch #14 {Exception -> 0x0159, blocks: (B:9:0x00be, B:12:0x00f3, B:14:0x014b, B:15:0x015e, B:25:0x0185, B:28:0x018c, B:31:0x0191, B:37:0x019b, B:39:0x01ca, B:40:0x01d1, B:42:0x01d7, B:43:0x01e2, B:45:0x01e8, B:46:0x01ef, B:48:0x01f5, B:49:0x0200, B:52:0x020a, B:54:0x0218, B:56:0x0224, B:57:0x0229, B:58:0x022d, B:60:0x0235, B:61:0x0247, B:63:0x024d, B:65:0x026b, B:66:0x0276, B:68:0x027c, B:70:0x0285, B:75:0x0292, B:76:0x0294, B:78:0x029c, B:80:0x02a8, B:81:0x02aa, B:83:0x02b2, B:85:0x02c0, B:86:0x02cb, B:88:0x02d3, B:89:0x02de, B:91:0x02e6, B:92:0x02f1, B:94:0x02f9, B:95:0x0304, B:97:0x030d, B:98:0x0319, B:104:0x0322, B:106:0x032a, B:108:0x0336, B:109:0x033b, B:257:0x034e, B:259:0x0356, B:260:0x035e, B:262:0x0366, B:263:0x036e, B:265:0x0376, B:266:0x037e, B:268:0x0386, B:269:0x038e, B:271:0x0396, B:272:0x03a2, B:274:0x03aa, B:275:0x03b5, B:277:0x03bd, B:278:0x03c8, B:280:0x03d0, B:281:0x03db, B:283:0x03e3, B:284:0x03ee, B:286:0x03f7, B:287:0x0403, B:289:0x040c, B:293:0x04ff, B:113:0x054e, B:115:0x0556, B:117:0x0564, B:118:0x0567, B:120:0x056f, B:122:0x057b, B:123:0x0586, B:125:0x058e, B:127:0x059c, B:128:0x059f, B:130:0x05a7, B:132:0x05b5, B:133:0x05b8, B:135:0x05c0, B:137:0x05ce, B:138:0x05d1, B:140:0x05d9, B:141:0x05e1, B:143:0x05e9, B:146:0x0600, B:147:0x05f7, B:150:0x0603, B:151:0x060c, B:153:0x06e4, B:155:0x06ec, B:160:0x0710, B:162:0x0714, B:163:0x0720, B:165:0x0728, B:166:0x0730, B:168:0x0738, B:184:0x076e, B:185:0x0771, B:187:0x07aa, B:189:0x07b2, B:200:0x07a6, B:201:0x071b, B:204:0x06f6, B:252:0x06e1, B:352:0x04e5, B:112:0x053f, B:406:0x07cb, B:409:0x07d0), top: B:8:0x00be }] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x06ec A[Catch: Error -> 0x0155, Exception -> 0x0159, TryCatch #14 {Exception -> 0x0159, blocks: (B:9:0x00be, B:12:0x00f3, B:14:0x014b, B:15:0x015e, B:25:0x0185, B:28:0x018c, B:31:0x0191, B:37:0x019b, B:39:0x01ca, B:40:0x01d1, B:42:0x01d7, B:43:0x01e2, B:45:0x01e8, B:46:0x01ef, B:48:0x01f5, B:49:0x0200, B:52:0x020a, B:54:0x0218, B:56:0x0224, B:57:0x0229, B:58:0x022d, B:60:0x0235, B:61:0x0247, B:63:0x024d, B:65:0x026b, B:66:0x0276, B:68:0x027c, B:70:0x0285, B:75:0x0292, B:76:0x0294, B:78:0x029c, B:80:0x02a8, B:81:0x02aa, B:83:0x02b2, B:85:0x02c0, B:86:0x02cb, B:88:0x02d3, B:89:0x02de, B:91:0x02e6, B:92:0x02f1, B:94:0x02f9, B:95:0x0304, B:97:0x030d, B:98:0x0319, B:104:0x0322, B:106:0x032a, B:108:0x0336, B:109:0x033b, B:257:0x034e, B:259:0x0356, B:260:0x035e, B:262:0x0366, B:263:0x036e, B:265:0x0376, B:266:0x037e, B:268:0x0386, B:269:0x038e, B:271:0x0396, B:272:0x03a2, B:274:0x03aa, B:275:0x03b5, B:277:0x03bd, B:278:0x03c8, B:280:0x03d0, B:281:0x03db, B:283:0x03e3, B:284:0x03ee, B:286:0x03f7, B:287:0x0403, B:289:0x040c, B:293:0x04ff, B:113:0x054e, B:115:0x0556, B:117:0x0564, B:118:0x0567, B:120:0x056f, B:122:0x057b, B:123:0x0586, B:125:0x058e, B:127:0x059c, B:128:0x059f, B:130:0x05a7, B:132:0x05b5, B:133:0x05b8, B:135:0x05c0, B:137:0x05ce, B:138:0x05d1, B:140:0x05d9, B:141:0x05e1, B:143:0x05e9, B:146:0x0600, B:147:0x05f7, B:150:0x0603, B:151:0x060c, B:153:0x06e4, B:155:0x06ec, B:160:0x0710, B:162:0x0714, B:163:0x0720, B:165:0x0728, B:166:0x0730, B:168:0x0738, B:184:0x076e, B:185:0x0771, B:187:0x07aa, B:189:0x07b2, B:200:0x07a6, B:201:0x071b, B:204:0x06f6, B:252:0x06e1, B:352:0x04e5, B:112:0x053f, B:406:0x07cb, B:409:0x07d0), top: B:8:0x00be }] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0700 A[Catch: Error -> 0x0155, Exception -> 0x0710, TryCatch #1 {Exception -> 0x0710, blocks: (B:157:0x06fa, B:159:0x0700, B:202:0x070c), top: B:156:0x06fa }] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0714 A[Catch: Error -> 0x0155, Exception -> 0x0159, TryCatch #14 {Exception -> 0x0159, blocks: (B:9:0x00be, B:12:0x00f3, B:14:0x014b, B:15:0x015e, B:25:0x0185, B:28:0x018c, B:31:0x0191, B:37:0x019b, B:39:0x01ca, B:40:0x01d1, B:42:0x01d7, B:43:0x01e2, B:45:0x01e8, B:46:0x01ef, B:48:0x01f5, B:49:0x0200, B:52:0x020a, B:54:0x0218, B:56:0x0224, B:57:0x0229, B:58:0x022d, B:60:0x0235, B:61:0x0247, B:63:0x024d, B:65:0x026b, B:66:0x0276, B:68:0x027c, B:70:0x0285, B:75:0x0292, B:76:0x0294, B:78:0x029c, B:80:0x02a8, B:81:0x02aa, B:83:0x02b2, B:85:0x02c0, B:86:0x02cb, B:88:0x02d3, B:89:0x02de, B:91:0x02e6, B:92:0x02f1, B:94:0x02f9, B:95:0x0304, B:97:0x030d, B:98:0x0319, B:104:0x0322, B:106:0x032a, B:108:0x0336, B:109:0x033b, B:257:0x034e, B:259:0x0356, B:260:0x035e, B:262:0x0366, B:263:0x036e, B:265:0x0376, B:266:0x037e, B:268:0x0386, B:269:0x038e, B:271:0x0396, B:272:0x03a2, B:274:0x03aa, B:275:0x03b5, B:277:0x03bd, B:278:0x03c8, B:280:0x03d0, B:281:0x03db, B:283:0x03e3, B:284:0x03ee, B:286:0x03f7, B:287:0x0403, B:289:0x040c, B:293:0x04ff, B:113:0x054e, B:115:0x0556, B:117:0x0564, B:118:0x0567, B:120:0x056f, B:122:0x057b, B:123:0x0586, B:125:0x058e, B:127:0x059c, B:128:0x059f, B:130:0x05a7, B:132:0x05b5, B:133:0x05b8, B:135:0x05c0, B:137:0x05ce, B:138:0x05d1, B:140:0x05d9, B:141:0x05e1, B:143:0x05e9, B:146:0x0600, B:147:0x05f7, B:150:0x0603, B:151:0x060c, B:153:0x06e4, B:155:0x06ec, B:160:0x0710, B:162:0x0714, B:163:0x0720, B:165:0x0728, B:166:0x0730, B:168:0x0738, B:184:0x076e, B:185:0x0771, B:187:0x07aa, B:189:0x07b2, B:200:0x07a6, B:201:0x071b, B:204:0x06f6, B:252:0x06e1, B:352:0x04e5, B:112:0x053f, B:406:0x07cb, B:409:0x07d0), top: B:8:0x00be }] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0728 A[Catch: Error -> 0x0155, Exception -> 0x0159, TryCatch #14 {Exception -> 0x0159, blocks: (B:9:0x00be, B:12:0x00f3, B:14:0x014b, B:15:0x015e, B:25:0x0185, B:28:0x018c, B:31:0x0191, B:37:0x019b, B:39:0x01ca, B:40:0x01d1, B:42:0x01d7, B:43:0x01e2, B:45:0x01e8, B:46:0x01ef, B:48:0x01f5, B:49:0x0200, B:52:0x020a, B:54:0x0218, B:56:0x0224, B:57:0x0229, B:58:0x022d, B:60:0x0235, B:61:0x0247, B:63:0x024d, B:65:0x026b, B:66:0x0276, B:68:0x027c, B:70:0x0285, B:75:0x0292, B:76:0x0294, B:78:0x029c, B:80:0x02a8, B:81:0x02aa, B:83:0x02b2, B:85:0x02c0, B:86:0x02cb, B:88:0x02d3, B:89:0x02de, B:91:0x02e6, B:92:0x02f1, B:94:0x02f9, B:95:0x0304, B:97:0x030d, B:98:0x0319, B:104:0x0322, B:106:0x032a, B:108:0x0336, B:109:0x033b, B:257:0x034e, B:259:0x0356, B:260:0x035e, B:262:0x0366, B:263:0x036e, B:265:0x0376, B:266:0x037e, B:268:0x0386, B:269:0x038e, B:271:0x0396, B:272:0x03a2, B:274:0x03aa, B:275:0x03b5, B:277:0x03bd, B:278:0x03c8, B:280:0x03d0, B:281:0x03db, B:283:0x03e3, B:284:0x03ee, B:286:0x03f7, B:287:0x0403, B:289:0x040c, B:293:0x04ff, B:113:0x054e, B:115:0x0556, B:117:0x0564, B:118:0x0567, B:120:0x056f, B:122:0x057b, B:123:0x0586, B:125:0x058e, B:127:0x059c, B:128:0x059f, B:130:0x05a7, B:132:0x05b5, B:133:0x05b8, B:135:0x05c0, B:137:0x05ce, B:138:0x05d1, B:140:0x05d9, B:141:0x05e1, B:143:0x05e9, B:146:0x0600, B:147:0x05f7, B:150:0x0603, B:151:0x060c, B:153:0x06e4, B:155:0x06ec, B:160:0x0710, B:162:0x0714, B:163:0x0720, B:165:0x0728, B:166:0x0730, B:168:0x0738, B:184:0x076e, B:185:0x0771, B:187:0x07aa, B:189:0x07b2, B:200:0x07a6, B:201:0x071b, B:204:0x06f6, B:252:0x06e1, B:352:0x04e5, B:112:0x053f, B:406:0x07cb, B:409:0x07d0), top: B:8:0x00be }] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0738 A[Catch: Error -> 0x0155, Exception -> 0x0159, TRY_LEAVE, TryCatch #14 {Exception -> 0x0159, blocks: (B:9:0x00be, B:12:0x00f3, B:14:0x014b, B:15:0x015e, B:25:0x0185, B:28:0x018c, B:31:0x0191, B:37:0x019b, B:39:0x01ca, B:40:0x01d1, B:42:0x01d7, B:43:0x01e2, B:45:0x01e8, B:46:0x01ef, B:48:0x01f5, B:49:0x0200, B:52:0x020a, B:54:0x0218, B:56:0x0224, B:57:0x0229, B:58:0x022d, B:60:0x0235, B:61:0x0247, B:63:0x024d, B:65:0x026b, B:66:0x0276, B:68:0x027c, B:70:0x0285, B:75:0x0292, B:76:0x0294, B:78:0x029c, B:80:0x02a8, B:81:0x02aa, B:83:0x02b2, B:85:0x02c0, B:86:0x02cb, B:88:0x02d3, B:89:0x02de, B:91:0x02e6, B:92:0x02f1, B:94:0x02f9, B:95:0x0304, B:97:0x030d, B:98:0x0319, B:104:0x0322, B:106:0x032a, B:108:0x0336, B:109:0x033b, B:257:0x034e, B:259:0x0356, B:260:0x035e, B:262:0x0366, B:263:0x036e, B:265:0x0376, B:266:0x037e, B:268:0x0386, B:269:0x038e, B:271:0x0396, B:272:0x03a2, B:274:0x03aa, B:275:0x03b5, B:277:0x03bd, B:278:0x03c8, B:280:0x03d0, B:281:0x03db, B:283:0x03e3, B:284:0x03ee, B:286:0x03f7, B:287:0x0403, B:289:0x040c, B:293:0x04ff, B:113:0x054e, B:115:0x0556, B:117:0x0564, B:118:0x0567, B:120:0x056f, B:122:0x057b, B:123:0x0586, B:125:0x058e, B:127:0x059c, B:128:0x059f, B:130:0x05a7, B:132:0x05b5, B:133:0x05b8, B:135:0x05c0, B:137:0x05ce, B:138:0x05d1, B:140:0x05d9, B:141:0x05e1, B:143:0x05e9, B:146:0x0600, B:147:0x05f7, B:150:0x0603, B:151:0x060c, B:153:0x06e4, B:155:0x06ec, B:160:0x0710, B:162:0x0714, B:163:0x0720, B:165:0x0728, B:166:0x0730, B:168:0x0738, B:184:0x076e, B:185:0x0771, B:187:0x07aa, B:189:0x07b2, B:200:0x07a6, B:201:0x071b, B:204:0x06f6, B:252:0x06e1, B:352:0x04e5, B:112:0x053f, B:406:0x07cb, B:409:0x07d0), top: B:8:0x00be }] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0769 A[Catch: all -> 0x076c, TRY_LEAVE, TryCatch #10 {all -> 0x076c, blocks: (B:172:0x0742, B:174:0x0748, B:176:0x074e, B:178:0x0752, B:180:0x0769), top: B:171:0x0742 }] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x07b2 A[Catch: Error -> 0x0155, Exception -> 0x0159, TryCatch #14 {Exception -> 0x0159, blocks: (B:9:0x00be, B:12:0x00f3, B:14:0x014b, B:15:0x015e, B:25:0x0185, B:28:0x018c, B:31:0x0191, B:37:0x019b, B:39:0x01ca, B:40:0x01d1, B:42:0x01d7, B:43:0x01e2, B:45:0x01e8, B:46:0x01ef, B:48:0x01f5, B:49:0x0200, B:52:0x020a, B:54:0x0218, B:56:0x0224, B:57:0x0229, B:58:0x022d, B:60:0x0235, B:61:0x0247, B:63:0x024d, B:65:0x026b, B:66:0x0276, B:68:0x027c, B:70:0x0285, B:75:0x0292, B:76:0x0294, B:78:0x029c, B:80:0x02a8, B:81:0x02aa, B:83:0x02b2, B:85:0x02c0, B:86:0x02cb, B:88:0x02d3, B:89:0x02de, B:91:0x02e6, B:92:0x02f1, B:94:0x02f9, B:95:0x0304, B:97:0x030d, B:98:0x0319, B:104:0x0322, B:106:0x032a, B:108:0x0336, B:109:0x033b, B:257:0x034e, B:259:0x0356, B:260:0x035e, B:262:0x0366, B:263:0x036e, B:265:0x0376, B:266:0x037e, B:268:0x0386, B:269:0x038e, B:271:0x0396, B:272:0x03a2, B:274:0x03aa, B:275:0x03b5, B:277:0x03bd, B:278:0x03c8, B:280:0x03d0, B:281:0x03db, B:283:0x03e3, B:284:0x03ee, B:286:0x03f7, B:287:0x0403, B:289:0x040c, B:293:0x04ff, B:113:0x054e, B:115:0x0556, B:117:0x0564, B:118:0x0567, B:120:0x056f, B:122:0x057b, B:123:0x0586, B:125:0x058e, B:127:0x059c, B:128:0x059f, B:130:0x05a7, B:132:0x05b5, B:133:0x05b8, B:135:0x05c0, B:137:0x05ce, B:138:0x05d1, B:140:0x05d9, B:141:0x05e1, B:143:0x05e9, B:146:0x0600, B:147:0x05f7, B:150:0x0603, B:151:0x060c, B:153:0x06e4, B:155:0x06ec, B:160:0x0710, B:162:0x0714, B:163:0x0720, B:165:0x0728, B:166:0x0730, B:168:0x0738, B:184:0x076e, B:185:0x0771, B:187:0x07aa, B:189:0x07b2, B:200:0x07a6, B:201:0x071b, B:204:0x06f6, B:252:0x06e1, B:352:0x04e5, B:112:0x053f, B:406:0x07cb, B:409:0x07d0), top: B:8:0x00be }] */
    /* JADX WARN: Removed duplicated region for block: B:191:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0779 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:201:0x071b A[Catch: Error -> 0x0155, Exception -> 0x0159, TryCatch #14 {Exception -> 0x0159, blocks: (B:9:0x00be, B:12:0x00f3, B:14:0x014b, B:15:0x015e, B:25:0x0185, B:28:0x018c, B:31:0x0191, B:37:0x019b, B:39:0x01ca, B:40:0x01d1, B:42:0x01d7, B:43:0x01e2, B:45:0x01e8, B:46:0x01ef, B:48:0x01f5, B:49:0x0200, B:52:0x020a, B:54:0x0218, B:56:0x0224, B:57:0x0229, B:58:0x022d, B:60:0x0235, B:61:0x0247, B:63:0x024d, B:65:0x026b, B:66:0x0276, B:68:0x027c, B:70:0x0285, B:75:0x0292, B:76:0x0294, B:78:0x029c, B:80:0x02a8, B:81:0x02aa, B:83:0x02b2, B:85:0x02c0, B:86:0x02cb, B:88:0x02d3, B:89:0x02de, B:91:0x02e6, B:92:0x02f1, B:94:0x02f9, B:95:0x0304, B:97:0x030d, B:98:0x0319, B:104:0x0322, B:106:0x032a, B:108:0x0336, B:109:0x033b, B:257:0x034e, B:259:0x0356, B:260:0x035e, B:262:0x0366, B:263:0x036e, B:265:0x0376, B:266:0x037e, B:268:0x0386, B:269:0x038e, B:271:0x0396, B:272:0x03a2, B:274:0x03aa, B:275:0x03b5, B:277:0x03bd, B:278:0x03c8, B:280:0x03d0, B:281:0x03db, B:283:0x03e3, B:284:0x03ee, B:286:0x03f7, B:287:0x0403, B:289:0x040c, B:293:0x04ff, B:113:0x054e, B:115:0x0556, B:117:0x0564, B:118:0x0567, B:120:0x056f, B:122:0x057b, B:123:0x0586, B:125:0x058e, B:127:0x059c, B:128:0x059f, B:130:0x05a7, B:132:0x05b5, B:133:0x05b8, B:135:0x05c0, B:137:0x05ce, B:138:0x05d1, B:140:0x05d9, B:141:0x05e1, B:143:0x05e9, B:146:0x0600, B:147:0x05f7, B:150:0x0603, B:151:0x060c, B:153:0x06e4, B:155:0x06ec, B:160:0x0710, B:162:0x0714, B:163:0x0720, B:165:0x0728, B:166:0x0730, B:168:0x0738, B:184:0x076e, B:185:0x0771, B:187:0x07aa, B:189:0x07b2, B:200:0x07a6, B:201:0x071b, B:204:0x06f6, B:252:0x06e1, B:352:0x04e5, B:112:0x053f, B:406:0x07cb, B:409:0x07d0), top: B:8:0x00be }] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x070c A[Catch: Error -> 0x0155, Exception -> 0x0710, TRY_LEAVE, TryCatch #1 {Exception -> 0x0710, blocks: (B:157:0x06fa, B:159:0x0700, B:202:0x070c), top: B:156:0x06fa }] */
    /* JADX WARN: Removed duplicated region for block: B:204:0x06f6 A[Catch: Error -> 0x0155, Exception -> 0x0159, TRY_LEAVE, TryCatch #14 {Exception -> 0x0159, blocks: (B:9:0x00be, B:12:0x00f3, B:14:0x014b, B:15:0x015e, B:25:0x0185, B:28:0x018c, B:31:0x0191, B:37:0x019b, B:39:0x01ca, B:40:0x01d1, B:42:0x01d7, B:43:0x01e2, B:45:0x01e8, B:46:0x01ef, B:48:0x01f5, B:49:0x0200, B:52:0x020a, B:54:0x0218, B:56:0x0224, B:57:0x0229, B:58:0x022d, B:60:0x0235, B:61:0x0247, B:63:0x024d, B:65:0x026b, B:66:0x0276, B:68:0x027c, B:70:0x0285, B:75:0x0292, B:76:0x0294, B:78:0x029c, B:80:0x02a8, B:81:0x02aa, B:83:0x02b2, B:85:0x02c0, B:86:0x02cb, B:88:0x02d3, B:89:0x02de, B:91:0x02e6, B:92:0x02f1, B:94:0x02f9, B:95:0x0304, B:97:0x030d, B:98:0x0319, B:104:0x0322, B:106:0x032a, B:108:0x0336, B:109:0x033b, B:257:0x034e, B:259:0x0356, B:260:0x035e, B:262:0x0366, B:263:0x036e, B:265:0x0376, B:266:0x037e, B:268:0x0386, B:269:0x038e, B:271:0x0396, B:272:0x03a2, B:274:0x03aa, B:275:0x03b5, B:277:0x03bd, B:278:0x03c8, B:280:0x03d0, B:281:0x03db, B:283:0x03e3, B:284:0x03ee, B:286:0x03f7, B:287:0x0403, B:289:0x040c, B:293:0x04ff, B:113:0x054e, B:115:0x0556, B:117:0x0564, B:118:0x0567, B:120:0x056f, B:122:0x057b, B:123:0x0586, B:125:0x058e, B:127:0x059c, B:128:0x059f, B:130:0x05a7, B:132:0x05b5, B:133:0x05b8, B:135:0x05c0, B:137:0x05ce, B:138:0x05d1, B:140:0x05d9, B:141:0x05e1, B:143:0x05e9, B:146:0x0600, B:147:0x05f7, B:150:0x0603, B:151:0x060c, B:153:0x06e4, B:155:0x06ec, B:160:0x0710, B:162:0x0714, B:163:0x0720, B:165:0x0728, B:166:0x0730, B:168:0x0738, B:184:0x076e, B:185:0x0771, B:187:0x07aa, B:189:0x07b2, B:200:0x07a6, B:201:0x071b, B:204:0x06f6, B:252:0x06e1, B:352:0x04e5, B:112:0x053f, B:406:0x07cb, B:409:0x07d0), top: B:8:0x00be }] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0614 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:293:0x04ff A[Catch: Error -> 0x0155, Exception -> 0x0159, TryCatch #14 {Exception -> 0x0159, blocks: (B:9:0x00be, B:12:0x00f3, B:14:0x014b, B:15:0x015e, B:25:0x0185, B:28:0x018c, B:31:0x0191, B:37:0x019b, B:39:0x01ca, B:40:0x01d1, B:42:0x01d7, B:43:0x01e2, B:45:0x01e8, B:46:0x01ef, B:48:0x01f5, B:49:0x0200, B:52:0x020a, B:54:0x0218, B:56:0x0224, B:57:0x0229, B:58:0x022d, B:60:0x0235, B:61:0x0247, B:63:0x024d, B:65:0x026b, B:66:0x0276, B:68:0x027c, B:70:0x0285, B:75:0x0292, B:76:0x0294, B:78:0x029c, B:80:0x02a8, B:81:0x02aa, B:83:0x02b2, B:85:0x02c0, B:86:0x02cb, B:88:0x02d3, B:89:0x02de, B:91:0x02e6, B:92:0x02f1, B:94:0x02f9, B:95:0x0304, B:97:0x030d, B:98:0x0319, B:104:0x0322, B:106:0x032a, B:108:0x0336, B:109:0x033b, B:257:0x034e, B:259:0x0356, B:260:0x035e, B:262:0x0366, B:263:0x036e, B:265:0x0376, B:266:0x037e, B:268:0x0386, B:269:0x038e, B:271:0x0396, B:272:0x03a2, B:274:0x03aa, B:275:0x03b5, B:277:0x03bd, B:278:0x03c8, B:280:0x03d0, B:281:0x03db, B:283:0x03e3, B:284:0x03ee, B:286:0x03f7, B:287:0x0403, B:289:0x040c, B:293:0x04ff, B:113:0x054e, B:115:0x0556, B:117:0x0564, B:118:0x0567, B:120:0x056f, B:122:0x057b, B:123:0x0586, B:125:0x058e, B:127:0x059c, B:128:0x059f, B:130:0x05a7, B:132:0x05b5, B:133:0x05b8, B:135:0x05c0, B:137:0x05ce, B:138:0x05d1, B:140:0x05d9, B:141:0x05e1, B:143:0x05e9, B:146:0x0600, B:147:0x05f7, B:150:0x0603, B:151:0x060c, B:153:0x06e4, B:155:0x06ec, B:160:0x0710, B:162:0x0714, B:163:0x0720, B:165:0x0728, B:166:0x0730, B:168:0x0738, B:184:0x076e, B:185:0x0771, B:187:0x07aa, B:189:0x07b2, B:200:0x07a6, B:201:0x071b, B:204:0x06f6, B:252:0x06e1, B:352:0x04e5, B:112:0x053f, B:406:0x07cb, B:409:0x07d0), top: B:8:0x00be }] */
    /* JADX WARN: Removed duplicated region for block: B:294:0x053c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0235 A[Catch: Error -> 0x0155, Exception -> 0x0159, TryCatch #14 {Exception -> 0x0159, blocks: (B:9:0x00be, B:12:0x00f3, B:14:0x014b, B:15:0x015e, B:25:0x0185, B:28:0x018c, B:31:0x0191, B:37:0x019b, B:39:0x01ca, B:40:0x01d1, B:42:0x01d7, B:43:0x01e2, B:45:0x01e8, B:46:0x01ef, B:48:0x01f5, B:49:0x0200, B:52:0x020a, B:54:0x0218, B:56:0x0224, B:57:0x0229, B:58:0x022d, B:60:0x0235, B:61:0x0247, B:63:0x024d, B:65:0x026b, B:66:0x0276, B:68:0x027c, B:70:0x0285, B:75:0x0292, B:76:0x0294, B:78:0x029c, B:80:0x02a8, B:81:0x02aa, B:83:0x02b2, B:85:0x02c0, B:86:0x02cb, B:88:0x02d3, B:89:0x02de, B:91:0x02e6, B:92:0x02f1, B:94:0x02f9, B:95:0x0304, B:97:0x030d, B:98:0x0319, B:104:0x0322, B:106:0x032a, B:108:0x0336, B:109:0x033b, B:257:0x034e, B:259:0x0356, B:260:0x035e, B:262:0x0366, B:263:0x036e, B:265:0x0376, B:266:0x037e, B:268:0x0386, B:269:0x038e, B:271:0x0396, B:272:0x03a2, B:274:0x03aa, B:275:0x03b5, B:277:0x03bd, B:278:0x03c8, B:280:0x03d0, B:281:0x03db, B:283:0x03e3, B:284:0x03ee, B:286:0x03f7, B:287:0x0403, B:289:0x040c, B:293:0x04ff, B:113:0x054e, B:115:0x0556, B:117:0x0564, B:118:0x0567, B:120:0x056f, B:122:0x057b, B:123:0x0586, B:125:0x058e, B:127:0x059c, B:128:0x059f, B:130:0x05a7, B:132:0x05b5, B:133:0x05b8, B:135:0x05c0, B:137:0x05ce, B:138:0x05d1, B:140:0x05d9, B:141:0x05e1, B:143:0x05e9, B:146:0x0600, B:147:0x05f7, B:150:0x0603, B:151:0x060c, B:153:0x06e4, B:155:0x06ec, B:160:0x0710, B:162:0x0714, B:163:0x0720, B:165:0x0728, B:166:0x0730, B:168:0x0738, B:184:0x076e, B:185:0x0771, B:187:0x07aa, B:189:0x07b2, B:200:0x07a6, B:201:0x071b, B:204:0x06f6, B:252:0x06e1, B:352:0x04e5, B:112:0x053f, B:406:0x07cb, B:409:0x07d0), top: B:8:0x00be }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x029c A[Catch: Error -> 0x0155, Exception -> 0x0159, TryCatch #14 {Exception -> 0x0159, blocks: (B:9:0x00be, B:12:0x00f3, B:14:0x014b, B:15:0x015e, B:25:0x0185, B:28:0x018c, B:31:0x0191, B:37:0x019b, B:39:0x01ca, B:40:0x01d1, B:42:0x01d7, B:43:0x01e2, B:45:0x01e8, B:46:0x01ef, B:48:0x01f5, B:49:0x0200, B:52:0x020a, B:54:0x0218, B:56:0x0224, B:57:0x0229, B:58:0x022d, B:60:0x0235, B:61:0x0247, B:63:0x024d, B:65:0x026b, B:66:0x0276, B:68:0x027c, B:70:0x0285, B:75:0x0292, B:76:0x0294, B:78:0x029c, B:80:0x02a8, B:81:0x02aa, B:83:0x02b2, B:85:0x02c0, B:86:0x02cb, B:88:0x02d3, B:89:0x02de, B:91:0x02e6, B:92:0x02f1, B:94:0x02f9, B:95:0x0304, B:97:0x030d, B:98:0x0319, B:104:0x0322, B:106:0x032a, B:108:0x0336, B:109:0x033b, B:257:0x034e, B:259:0x0356, B:260:0x035e, B:262:0x0366, B:263:0x036e, B:265:0x0376, B:266:0x037e, B:268:0x0386, B:269:0x038e, B:271:0x0396, B:272:0x03a2, B:274:0x03aa, B:275:0x03b5, B:277:0x03bd, B:278:0x03c8, B:280:0x03d0, B:281:0x03db, B:283:0x03e3, B:284:0x03ee, B:286:0x03f7, B:287:0x0403, B:289:0x040c, B:293:0x04ff, B:113:0x054e, B:115:0x0556, B:117:0x0564, B:118:0x0567, B:120:0x056f, B:122:0x057b, B:123:0x0586, B:125:0x058e, B:127:0x059c, B:128:0x059f, B:130:0x05a7, B:132:0x05b5, B:133:0x05b8, B:135:0x05c0, B:137:0x05ce, B:138:0x05d1, B:140:0x05d9, B:141:0x05e1, B:143:0x05e9, B:146:0x0600, B:147:0x05f7, B:150:0x0603, B:151:0x060c, B:153:0x06e4, B:155:0x06ec, B:160:0x0710, B:162:0x0714, B:163:0x0720, B:165:0x0728, B:166:0x0730, B:168:0x0738, B:184:0x076e, B:185:0x0771, B:187:0x07aa, B:189:0x07b2, B:200:0x07a6, B:201:0x071b, B:204:0x06f6, B:252:0x06e1, B:352:0x04e5, B:112:0x053f, B:406:0x07cb, B:409:0x07d0), top: B:8:0x00be }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02b2 A[Catch: Error -> 0x0155, Exception -> 0x0159, TryCatch #14 {Exception -> 0x0159, blocks: (B:9:0x00be, B:12:0x00f3, B:14:0x014b, B:15:0x015e, B:25:0x0185, B:28:0x018c, B:31:0x0191, B:37:0x019b, B:39:0x01ca, B:40:0x01d1, B:42:0x01d7, B:43:0x01e2, B:45:0x01e8, B:46:0x01ef, B:48:0x01f5, B:49:0x0200, B:52:0x020a, B:54:0x0218, B:56:0x0224, B:57:0x0229, B:58:0x022d, B:60:0x0235, B:61:0x0247, B:63:0x024d, B:65:0x026b, B:66:0x0276, B:68:0x027c, B:70:0x0285, B:75:0x0292, B:76:0x0294, B:78:0x029c, B:80:0x02a8, B:81:0x02aa, B:83:0x02b2, B:85:0x02c0, B:86:0x02cb, B:88:0x02d3, B:89:0x02de, B:91:0x02e6, B:92:0x02f1, B:94:0x02f9, B:95:0x0304, B:97:0x030d, B:98:0x0319, B:104:0x0322, B:106:0x032a, B:108:0x0336, B:109:0x033b, B:257:0x034e, B:259:0x0356, B:260:0x035e, B:262:0x0366, B:263:0x036e, B:265:0x0376, B:266:0x037e, B:268:0x0386, B:269:0x038e, B:271:0x0396, B:272:0x03a2, B:274:0x03aa, B:275:0x03b5, B:277:0x03bd, B:278:0x03c8, B:280:0x03d0, B:281:0x03db, B:283:0x03e3, B:284:0x03ee, B:286:0x03f7, B:287:0x0403, B:289:0x040c, B:293:0x04ff, B:113:0x054e, B:115:0x0556, B:117:0x0564, B:118:0x0567, B:120:0x056f, B:122:0x057b, B:123:0x0586, B:125:0x058e, B:127:0x059c, B:128:0x059f, B:130:0x05a7, B:132:0x05b5, B:133:0x05b8, B:135:0x05c0, B:137:0x05ce, B:138:0x05d1, B:140:0x05d9, B:141:0x05e1, B:143:0x05e9, B:146:0x0600, B:147:0x05f7, B:150:0x0603, B:151:0x060c, B:153:0x06e4, B:155:0x06ec, B:160:0x0710, B:162:0x0714, B:163:0x0720, B:165:0x0728, B:166:0x0730, B:168:0x0738, B:184:0x076e, B:185:0x0771, B:187:0x07aa, B:189:0x07b2, B:200:0x07a6, B:201:0x071b, B:204:0x06f6, B:252:0x06e1, B:352:0x04e5, B:112:0x053f, B:406:0x07cb, B:409:0x07d0), top: B:8:0x00be }] */
    /* JADX WARN: Type inference failed for: r2v122 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public BDLocation(String str) {
        ?? r22;
        boolean z7;
        Exception exc;
        String str2;
        String str3;
        JSONObject jSONObject;
        boolean z8;
        Exception exc2;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        String str18;
        boolean z9;
        String str19;
        String str20;
        String str21;
        String str22;
        int i8;
        int i9;
        String str23;
        String str24;
        String str25;
        String str26;
        String str27;
        String string;
        String str28;
        String[] split;
        int intValue;
        int intValue2;
        this.f4344a = 0;
        this.f4346b = null;
        this.f4348c = Double.MIN_VALUE;
        this.f4350d = Double.MIN_VALUE;
        this.f4352e = false;
        this.f4354f = Double.MIN_VALUE;
        this.f4356g = false;
        this.f4358h = 0.0f;
        this.f4360i = false;
        this.f4362j = 0.0f;
        this.f4366l = 0.0f;
        this.f4368m = -1;
        this.f4370n = 0.0f;
        this.f4372o = false;
        this.f4373p = -1;
        this.f4374q = -1.0f;
        this.f4375r = null;
        this.f4376s = false;
        this.f4377t = null;
        this.f4378u = null;
        this.f4379v = null;
        this.f4380w = null;
        this.f4381x = null;
        this.f4382y = false;
        this.f4383z = new Address.Builder().build();
        this.A = null;
        this.B = null;
        this.C = null;
        this.E = false;
        this.F = 0;
        this.G = 1;
        this.H = null;
        this.J = "";
        this.K = -1;
        this.L = 0;
        this.M = 2;
        this.N = 0;
        this.O = null;
        this.P = null;
        this.Q = null;
        this.R = -1;
        this.S = null;
        this.T = null;
        this.U = null;
        this.V = null;
        this.W = new Bundle();
        this.X = 0;
        this.Y = 0;
        this.Z = 0L;
        this.f4345a0 = null;
        this.f4347b0 = null;
        this.f4349c0 = Double.MIN_VALUE;
        this.f4351d0 = Double.MIN_VALUE;
        this.f4353e0 = false;
        this.f4355f0 = null;
        this.f4357g0 = -1.0f;
        this.f4359h0 = -1.0d;
        this.f4361i0 = 0;
        this.f4363j0 = -1;
        this.f4367l0 = null;
        this.f4369m0 = null;
        this.f4371n0 = -1L;
        if (str == null || str.equals("")) {
            return;
        }
        try {
            try {
            } catch (Exception e8) {
                z7 = false;
                exc = e8;
            }
            try {
                JSONObject jSONObject2 = new JSONObject(str);
                JSONObject jSONObject3 = jSONObject2.getJSONObject("result");
                int parseInt = Integer.parseInt(jSONObject3.getString("error"));
                setLocType(parseInt);
                setTime(jSONObject3.getString("time"));
                if (parseInt == 61) {
                    JSONObject jSONObject4 = jSONObject2.getJSONObject(FirebaseAnalytics.Param.CONTENT);
                    JSONObject jSONObject5 = jSONObject4.getJSONObject("point");
                    setLatitude(Double.parseDouble(jSONObject5.getString("y")));
                    setLongitude(Double.parseDouble(jSONObject5.getString("x")));
                    setRadius(Float.parseFloat(jSONObject4.getString("radius")));
                    setSpeed(Float.parseFloat(jSONObject4.getString("s")));
                    setDirection(Float.parseFloat(jSONObject4.getString("d")));
                    setSatelliteNumber(Integer.parseInt(jSONObject4.getString("n")));
                    if (jSONObject4.has("is_mock")) {
                        setMockGpsStrategy(jSONObject4.getInt("is_mock"));
                    }
                    if (jSONObject4.has(CmcdHeadersFactory.STREAMING_FORMAT_HLS)) {
                        try {
                            setAltitude(jSONObject4.getDouble(CmcdHeadersFactory.STREAMING_FORMAT_HLS));
                        } catch (Exception unused) {
                        }
                    }
                    try {
                        if (jSONObject4.has("in_cn")) {
                            setLocationWhere(Integer.parseInt(jSONObject4.getString("in_cn")));
                        } else {
                            setLocationWhere(1);
                        }
                    } catch (Exception unused2) {
                    }
                    if (this.G != 0) {
                        setCoorType("gcj02");
                        return;
                    }
                    str2 = "wgs84";
                } else {
                    str2 = "gcj02";
                    if (parseInt == 161) {
                        JSONObject jSONObject6 = jSONObject2.getJSONObject(FirebaseAnalytics.Param.CONTENT);
                        JSONObject jSONObject7 = jSONObject6.getJSONObject("point");
                        setLatitude(Double.parseDouble(jSONObject7.getString("y")));
                        setLongitude(Double.parseDouble(jSONObject7.getString("x")));
                        setRadius(Float.parseFloat(jSONObject6.getString("radius")));
                        if (jSONObject6.has("traffic")) {
                            setTraffic(jSONObject6.getString("traffic"));
                        }
                        if (jSONObject6.has("traffic_prop")) {
                            setTrafficConfidence(Float.parseFloat(jSONObject6.optString("traffic_prop")));
                        }
                        if (jSONObject6.has("is_station")) {
                            setIsTrafficStation(jSONObject6.optInt("is_station"));
                        }
                        if (jSONObject6.has("traffic_skip_prop")) {
                            setTrafficSkipProb(Float.parseFloat(jSONObject6.optString("traffic_skip_prop")));
                        }
                        if (jSONObject6.has("sema")) {
                            JSONObject jSONObject8 = jSONObject6.getJSONObject("sema");
                            if (jSONObject8.has("aptag")) {
                                String string2 = jSONObject8.getString("aptag");
                                if (!TextUtils.isEmpty(string2)) {
                                    this.f4379v = string2;
                                } else {
                                    str3 = "";
                                    this.f4379v = str3;
                                    if (jSONObject8.has("aptagd")) {
                                        JSONArray jSONArray = jSONObject8.getJSONObject("aptagd").getJSONArray("pois");
                                        ArrayList arrayList = new ArrayList();
                                        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                                            JSONObject jSONObject9 = jSONArray.getJSONObject(i10);
                                            arrayList.add(new Poi(jSONObject9.getString(MapBundleKey.MapObjKey.OBJ_SS_ARROW_PANOID), jSONObject9.getString("pname"), jSONObject9.getDouble("pr"), jSONObject9.has("tags") ? jSONObject9.getString("tags") : str3, jSONObject9.has("addr") ? jSONObject9.getString("addr") : str3));
                                        }
                                        this.S = arrayList;
                                    }
                                    if (jSONObject8.has("poiregion")) {
                                        String string3 = jSONObject8.getString("poiregion");
                                        if (!TextUtils.isEmpty(string3)) {
                                            this.f4380w = string3;
                                        }
                                    }
                                    if (jSONObject8.has("poi_regions")) {
                                        JSONObject jSONObject10 = jSONObject8.getJSONObject("poi_regions");
                                        this.f4355f0 = new PoiRegion(jSONObject10.has("direction_desc") ? jSONObject10.getString("direction_desc") : str3, jSONObject10.has("name") ? jSONObject10.getString("name") : str3, jSONObject10.has("tag") ? jSONObject10.getString("tag") : str3, jSONObject10.has("uid") ? jSONObject10.getString("uid") : str3, jSONObject10.has(MapBundleKey.MapObjKey.OBJ_BID) ? jSONObject10.getString(MapBundleKey.MapObjKey.OBJ_BID) : str3);
                                    }
                                    if (jSONObject8.has("regular")) {
                                        String string4 = jSONObject8.getString("regular");
                                        if (!TextUtils.isEmpty(string4)) {
                                            this.f4381x = string4;
                                        }
                                    }
                                }
                            }
                            str3 = "";
                            if (jSONObject8.has("aptagd")) {
                            }
                            if (jSONObject8.has("poiregion")) {
                            }
                            if (jSONObject8.has("poi_regions")) {
                            }
                            if (jSONObject8.has("regular")) {
                            }
                        } else {
                            str3 = "";
                        }
                        if (jSONObject6.has("addr")) {
                            try {
                                jSONObject = jSONObject6.getJSONObject("addr");
                                z8 = true;
                            } catch (Exception unused3) {
                                jSONObject = null;
                                z8 = false;
                            }
                            if (jSONObject != null) {
                                String string5 = jSONObject.has("city") ? jSONObject.getString("city") : str3;
                                str22 = jSONObject.has("city_code") ? jSONObject.getString("city_code") : str3;
                                str15 = jSONObject.has("country") ? jSONObject.getString("country") : str3;
                                String string6 = jSONObject.has("country_code") ? jSONObject.getString("country_code") : str3;
                                if (jSONObject.has("province")) {
                                    str27 = jSONObject.getString("province");
                                    str26 = string5;
                                } else {
                                    str26 = string5;
                                    str27 = str3;
                                }
                                String string7 = jSONObject.has("district") ? jSONObject.getString("district") : str3;
                                String string8 = jSONObject.has("street") ? jSONObject.getString("street") : str3;
                                String string9 = jSONObject.has("street_number") ? jSONObject.getString("street_number") : str3;
                                String string10 = jSONObject.has("adcode") ? jSONObject.getString("adcode") : str3;
                                String string11 = jSONObject.has("town") ? jSONObject.getString("town") : null;
                                if (jSONObject.has("town_code")) {
                                    str13 = str26;
                                    str14 = "y";
                                    str4 = string8;
                                    str18 = jSONObject.getString("town_code");
                                    str19 = "x";
                                    str16 = string6;
                                    str7 = string7;
                                    str20 = string10;
                                    z9 = z8;
                                    str21 = str27;
                                    str8 = string9;
                                } else {
                                    str13 = str26;
                                    str14 = "y";
                                    str16 = string6;
                                    str7 = string7;
                                    str18 = str3;
                                    z9 = z8;
                                    str4 = string8;
                                    str19 = "x";
                                    str21 = str27;
                                    str8 = string9;
                                    str20 = string10;
                                }
                                str12 = SystemInfoUtil.COMMA;
                                str17 = string11;
                            } else {
                                try {
                                    String[] split2 = jSONObject6.getString("addr").split(SystemInfoUtil.COMMA);
                                    int length = split2.length;
                                    if (length > 0) {
                                        str5 = split2[0];
                                        i8 = 1;
                                    } else {
                                        i8 = 1;
                                        str5 = null;
                                    }
                                    if (length > i8) {
                                        try {
                                            str6 = split2[i8];
                                            i9 = 2;
                                        } catch (Exception e9) {
                                            exc2 = e9;
                                            str4 = null;
                                            str6 = null;
                                            str7 = null;
                                            str8 = null;
                                            str9 = null;
                                            str10 = null;
                                            str11 = null;
                                            exc2.printStackTrace();
                                            str12 = SystemInfoUtil.COMMA;
                                            str13 = str6;
                                            str14 = "y";
                                            str15 = str10;
                                            str16 = str11;
                                            str17 = null;
                                            str18 = null;
                                            z9 = false;
                                            str19 = "x";
                                            str20 = null;
                                            String str29 = str9;
                                            str21 = str5;
                                            str22 = str29;
                                            if (z9) {
                                            }
                                            if (jSONObject6.has("floor")) {
                                            }
                                            if (jSONObject6.has("indoor")) {
                                            }
                                            if (jSONObject6.has("loctp")) {
                                            }
                                            if (jSONObject6.has("bldgid")) {
                                            }
                                            if (jSONObject6.has("bldg")) {
                                            }
                                            if (jSONObject6.has("acc")) {
                                            }
                                            if (jSONObject6.has("ibav")) {
                                            }
                                            if (jSONObject6.has("indoorflags")) {
                                            }
                                            if (jSONObject6.has("gpscs")) {
                                            }
                                            if (jSONObject6.has("in_cn")) {
                                            }
                                            if (this.G == 0) {
                                            }
                                            if (jSONObject6.has("navi")) {
                                            }
                                            if (jSONObject6.has("navi_client")) {
                                            }
                                            if (jSONObject6.has("nrl_point")) {
                                            }
                                            if (jSONObject6.has("loc_nlp")) {
                                            }
                                        }
                                    } else {
                                        i9 = 2;
                                        str6 = null;
                                    }
                                    if (length > i9) {
                                        try {
                                            str7 = split2[i9];
                                        } catch (Exception e10) {
                                            exc2 = e10;
                                            str4 = null;
                                            str7 = null;
                                            str8 = null;
                                            str9 = null;
                                            str10 = null;
                                            str11 = null;
                                            exc2.printStackTrace();
                                            str12 = SystemInfoUtil.COMMA;
                                            str13 = str6;
                                            str14 = "y";
                                            str15 = str10;
                                            str16 = str11;
                                            str17 = null;
                                            str18 = null;
                                            z9 = false;
                                            str19 = "x";
                                            str20 = null;
                                            String str292 = str9;
                                            str21 = str5;
                                            str22 = str292;
                                            if (z9) {
                                            }
                                            if (jSONObject6.has("floor")) {
                                            }
                                            if (jSONObject6.has("indoor")) {
                                            }
                                            if (jSONObject6.has("loctp")) {
                                            }
                                            if (jSONObject6.has("bldgid")) {
                                            }
                                            if (jSONObject6.has("bldg")) {
                                            }
                                            if (jSONObject6.has("acc")) {
                                            }
                                            if (jSONObject6.has("ibav")) {
                                            }
                                            if (jSONObject6.has("indoorflags")) {
                                            }
                                            if (jSONObject6.has("gpscs")) {
                                            }
                                            if (jSONObject6.has("in_cn")) {
                                            }
                                            if (this.G == 0) {
                                            }
                                            if (jSONObject6.has("navi")) {
                                            }
                                            if (jSONObject6.has("navi_client")) {
                                            }
                                            if (jSONObject6.has("nrl_point")) {
                                            }
                                            if (jSONObject6.has("loc_nlp")) {
                                            }
                                        }
                                    } else {
                                        str7 = null;
                                    }
                                    if (length > 3) {
                                        try {
                                            str4 = split2[3];
                                        } catch (Exception e11) {
                                            exc2 = e11;
                                            str4 = null;
                                            str8 = null;
                                            str9 = null;
                                            str10 = null;
                                            str11 = null;
                                            exc2.printStackTrace();
                                            str12 = SystemInfoUtil.COMMA;
                                            str13 = str6;
                                            str14 = "y";
                                            str15 = str10;
                                            str16 = str11;
                                            str17 = null;
                                            str18 = null;
                                            z9 = false;
                                            str19 = "x";
                                            str20 = null;
                                            String str2922 = str9;
                                            str21 = str5;
                                            str22 = str2922;
                                            if (z9) {
                                            }
                                            if (jSONObject6.has("floor")) {
                                            }
                                            if (jSONObject6.has("indoor")) {
                                            }
                                            if (jSONObject6.has("loctp")) {
                                            }
                                            if (jSONObject6.has("bldgid")) {
                                            }
                                            if (jSONObject6.has("bldg")) {
                                            }
                                            if (jSONObject6.has("acc")) {
                                            }
                                            if (jSONObject6.has("ibav")) {
                                            }
                                            if (jSONObject6.has("indoorflags")) {
                                            }
                                            if (jSONObject6.has("gpscs")) {
                                            }
                                            if (jSONObject6.has("in_cn")) {
                                            }
                                            if (this.G == 0) {
                                            }
                                            if (jSONObject6.has("navi")) {
                                            }
                                            if (jSONObject6.has("navi_client")) {
                                            }
                                            if (jSONObject6.has("nrl_point")) {
                                            }
                                            if (jSONObject6.has("loc_nlp")) {
                                            }
                                        }
                                    } else {
                                        str4 = null;
                                    }
                                    if (length > 4) {
                                        try {
                                            str8 = split2[4];
                                        } catch (Exception e12) {
                                            exc2 = e12;
                                            str8 = null;
                                            str9 = null;
                                            str10 = null;
                                            str11 = null;
                                            exc2.printStackTrace();
                                            str12 = SystemInfoUtil.COMMA;
                                            str13 = str6;
                                            str14 = "y";
                                            str15 = str10;
                                            str16 = str11;
                                            str17 = null;
                                            str18 = null;
                                            z9 = false;
                                            str19 = "x";
                                            str20 = null;
                                            String str29222 = str9;
                                            str21 = str5;
                                            str22 = str29222;
                                            if (z9) {
                                            }
                                            if (jSONObject6.has("floor")) {
                                            }
                                            if (jSONObject6.has("indoor")) {
                                            }
                                            if (jSONObject6.has("loctp")) {
                                            }
                                            if (jSONObject6.has("bldgid")) {
                                            }
                                            if (jSONObject6.has("bldg")) {
                                            }
                                            if (jSONObject6.has("acc")) {
                                            }
                                            if (jSONObject6.has("ibav")) {
                                            }
                                            if (jSONObject6.has("indoorflags")) {
                                            }
                                            if (jSONObject6.has("gpscs")) {
                                            }
                                            if (jSONObject6.has("in_cn")) {
                                            }
                                            if (this.G == 0) {
                                            }
                                            if (jSONObject6.has("navi")) {
                                            }
                                            if (jSONObject6.has("navi_client")) {
                                                str28 = str12;
                                                try {
                                                    if (string.contains(str28)) {
                                                        intValue = Integer.valueOf(split[0]).intValue();
                                                        Integer.valueOf(split[1]).intValue();
                                                        if (intValue > 0) {
                                                        }
                                                    }
                                                } catch (Throwable th) {
                                                    th.printStackTrace();
                                                }
                                            }
                                            if (jSONObject6.has("nrl_point")) {
                                            }
                                            if (jSONObject6.has("loc_nlp")) {
                                            }
                                        }
                                    } else {
                                        str8 = null;
                                    }
                                    if (length > 5) {
                                        try {
                                            str9 = split2[5];
                                            str23 = str4;
                                        } catch (Exception e13) {
                                            exc2 = e13;
                                            str9 = null;
                                            str10 = null;
                                            str11 = null;
                                            exc2.printStackTrace();
                                            str12 = SystemInfoUtil.COMMA;
                                            str13 = str6;
                                            str14 = "y";
                                            str15 = str10;
                                            str16 = str11;
                                            str17 = null;
                                            str18 = null;
                                            z9 = false;
                                            str19 = "x";
                                            str20 = null;
                                            String str292222 = str9;
                                            str21 = str5;
                                            str22 = str292222;
                                            if (z9) {
                                            }
                                            if (jSONObject6.has("floor")) {
                                            }
                                            if (jSONObject6.has("indoor")) {
                                            }
                                            if (jSONObject6.has("loctp")) {
                                            }
                                            if (jSONObject6.has("bldgid")) {
                                            }
                                            if (jSONObject6.has("bldg")) {
                                            }
                                            if (jSONObject6.has("acc")) {
                                            }
                                            if (jSONObject6.has("ibav")) {
                                            }
                                            if (jSONObject6.has("indoorflags")) {
                                            }
                                            if (jSONObject6.has("gpscs")) {
                                            }
                                            if (jSONObject6.has("in_cn")) {
                                            }
                                            if (this.G == 0) {
                                            }
                                            if (jSONObject6.has("navi")) {
                                            }
                                            if (jSONObject6.has("navi_client")) {
                                            }
                                            if (jSONObject6.has("nrl_point")) {
                                            }
                                            if (jSONObject6.has("loc_nlp")) {
                                            }
                                        }
                                    } else {
                                        str23 = str4;
                                        str9 = null;
                                    }
                                    if (length > 6) {
                                        try {
                                            str10 = split2[6];
                                        } catch (Exception e14) {
                                            str4 = str23;
                                            exc2 = e14;
                                            str10 = null;
                                            str11 = null;
                                            exc2.printStackTrace();
                                            str12 = SystemInfoUtil.COMMA;
                                            str13 = str6;
                                            str14 = "y";
                                            str15 = str10;
                                            str16 = str11;
                                            str17 = null;
                                            str18 = null;
                                            z9 = false;
                                            str19 = "x";
                                            str20 = null;
                                            String str2922222 = str9;
                                            str21 = str5;
                                            str22 = str2922222;
                                            if (z9) {
                                            }
                                            if (jSONObject6.has("floor")) {
                                            }
                                            if (jSONObject6.has("indoor")) {
                                            }
                                            if (jSONObject6.has("loctp")) {
                                            }
                                            if (jSONObject6.has("bldgid")) {
                                            }
                                            if (jSONObject6.has("bldg")) {
                                            }
                                            if (jSONObject6.has("acc")) {
                                            }
                                            if (jSONObject6.has("ibav")) {
                                            }
                                            if (jSONObject6.has("indoorflags")) {
                                            }
                                            if (jSONObject6.has("gpscs")) {
                                            }
                                            if (jSONObject6.has("in_cn")) {
                                            }
                                            if (this.G == 0) {
                                            }
                                            if (jSONObject6.has("navi")) {
                                            }
                                            if (jSONObject6.has("navi_client")) {
                                            }
                                            if (jSONObject6.has("nrl_point")) {
                                            }
                                            if (jSONObject6.has("loc_nlp")) {
                                            }
                                        }
                                    } else {
                                        str10 = null;
                                    }
                                    if (length > 7) {
                                        try {
                                            str11 = split2[7];
                                        } catch (Exception e15) {
                                            str4 = str23;
                                            exc2 = e15;
                                            str11 = null;
                                            exc2.printStackTrace();
                                            str12 = SystemInfoUtil.COMMA;
                                            str13 = str6;
                                            str14 = "y";
                                            str15 = str10;
                                            str16 = str11;
                                            str17 = null;
                                            str18 = null;
                                            z9 = false;
                                            str19 = "x";
                                            str20 = null;
                                            String str29222222 = str9;
                                            str21 = str5;
                                            str22 = str29222222;
                                            if (z9) {
                                            }
                                            if (jSONObject6.has("floor")) {
                                            }
                                            if (jSONObject6.has("indoor")) {
                                            }
                                            if (jSONObject6.has("loctp")) {
                                            }
                                            if (jSONObject6.has("bldgid")) {
                                            }
                                            if (jSONObject6.has("bldg")) {
                                            }
                                            if (jSONObject6.has("acc")) {
                                            }
                                            if (jSONObject6.has("ibav")) {
                                            }
                                            if (jSONObject6.has("indoorflags")) {
                                            }
                                            if (jSONObject6.has("gpscs")) {
                                            }
                                            if (jSONObject6.has("in_cn")) {
                                            }
                                            if (this.G == 0) {
                                            }
                                            if (jSONObject6.has("navi")) {
                                            }
                                            if (jSONObject6.has("navi_client")) {
                                            }
                                            if (jSONObject6.has("nrl_point")) {
                                            }
                                            if (jSONObject6.has("loc_nlp")) {
                                            }
                                        }
                                    } else {
                                        str11 = null;
                                    }
                                    if (length > 8) {
                                        try {
                                            str24 = split2[8];
                                        } catch (Exception e16) {
                                            str4 = str23;
                                            exc2 = e16;
                                            exc2.printStackTrace();
                                            str12 = SystemInfoUtil.COMMA;
                                            str13 = str6;
                                            str14 = "y";
                                            str15 = str10;
                                            str16 = str11;
                                            str17 = null;
                                            str18 = null;
                                            z9 = false;
                                            str19 = "x";
                                            str20 = null;
                                            String str292222222 = str9;
                                            str21 = str5;
                                            str22 = str292222222;
                                            if (z9) {
                                            }
                                            if (jSONObject6.has("floor")) {
                                            }
                                            if (jSONObject6.has("indoor")) {
                                            }
                                            if (jSONObject6.has("loctp")) {
                                            }
                                            if (jSONObject6.has("bldgid")) {
                                            }
                                            if (jSONObject6.has("bldg")) {
                                            }
                                            if (jSONObject6.has("acc")) {
                                            }
                                            if (jSONObject6.has("ibav")) {
                                            }
                                            if (jSONObject6.has("indoorflags")) {
                                            }
                                            if (jSONObject6.has("gpscs")) {
                                            }
                                            if (jSONObject6.has("in_cn")) {
                                            }
                                            if (this.G == 0) {
                                            }
                                            if (jSONObject6.has("navi")) {
                                            }
                                            if (jSONObject6.has("navi_client")) {
                                            }
                                            if (jSONObject6.has("nrl_point")) {
                                            }
                                            if (jSONObject6.has("loc_nlp")) {
                                            }
                                        }
                                    } else {
                                        str24 = null;
                                    }
                                    str4 = str23;
                                    str12 = SystemInfoUtil.COMMA;
                                    str13 = str6;
                                    str14 = "y";
                                    str15 = str10;
                                    str17 = null;
                                    str18 = null;
                                    z9 = true;
                                    str20 = str24;
                                    str16 = str11;
                                    str19 = "x";
                                    String str30 = str9;
                                    str21 = str5;
                                    str22 = str30;
                                } catch (Exception e17) {
                                    exc2 = e17;
                                    str4 = null;
                                    str5 = null;
                                }
                            }
                            if (z9) {
                                str25 = str2;
                                this.f4383z = new Address.Builder().country(str15).countryCode(str16).province(str21).city(str13).cityCode(str22).district(str7).street(str4).streetNumber(str8).adcode(str20).town(str17).townCode(str18).build();
                                this.f4376s = true;
                            } else {
                                str25 = str2;
                            }
                        } else {
                            str25 = str2;
                            str12 = SystemInfoUtil.COMMA;
                            str19 = "x";
                            str14 = "y";
                            this.f4376s = false;
                            setAddrStr(null);
                        }
                        if (jSONObject6.has("floor")) {
                            String string12 = jSONObject6.getString("floor");
                            this.A = string12;
                            if (TextUtils.isEmpty(string12)) {
                                this.A = null;
                            }
                        }
                        if (jSONObject6.has("indoor")) {
                            String string13 = jSONObject6.getString("indoor");
                            if (!TextUtils.isEmpty(string13)) {
                                setUserIndoorState(Integer.valueOf(string13).intValue());
                            }
                        }
                        if (jSONObject6.has("loctp")) {
                            String string14 = jSONObject6.getString("loctp");
                            this.H = string14;
                            if (TextUtils.isEmpty(string14)) {
                                this.H = null;
                            }
                        }
                        if (jSONObject6.has("bldgid")) {
                            String string15 = jSONObject6.getString("bldgid");
                            this.B = string15;
                            if (TextUtils.isEmpty(string15)) {
                                this.B = null;
                            }
                        }
                        if (jSONObject6.has("bldg")) {
                            String string16 = jSONObject6.getString("bldg");
                            this.C = string16;
                            if (TextUtils.isEmpty(string16)) {
                                this.C = null;
                            }
                        }
                        if (jSONObject6.has("acc")) {
                            this.D = jSONObject6.getDouble("acc");
                        }
                        if (jSONObject6.has("ibav")) {
                            String string17 = jSONObject6.getString("ibav");
                            if (!TextUtils.isEmpty(string17) && !string17.equals("0")) {
                                intValue2 = Integer.valueOf(string17).intValue();
                                this.F = intValue2;
                            }
                            intValue2 = 0;
                            this.F = intValue2;
                        }
                        if (jSONObject6.has("indoorflags")) {
                            try {
                                JSONObject jSONObject11 = jSONObject6.getJSONObject("indoorflags");
                                if (jSONObject11.has("area")) {
                                    int intValue3 = Integer.valueOf(jSONObject11.getString("area")).intValue();
                                    if (intValue3 == 0) {
                                        setIndoorLocationSurpport(2);
                                    } else if (intValue3 == 1) {
                                        setIndoorLocationSurpport(1);
                                    }
                                }
                                if (jSONObject11.has("support")) {
                                    setIndoorLocationSource(Integer.valueOf(jSONObject11.getString("support")).intValue());
                                }
                                if (jSONObject11.has("inbldg")) {
                                    this.O = jSONObject11.getString("inbldg");
                                }
                                if (jSONObject11.has("inbldgid")) {
                                    this.P = jSONObject11.getString("inbldgid");
                                }
                                if (jSONObject11.has("polygon")) {
                                    setIndoorSurpportPolygon(jSONObject11.getString("polygon"));
                                }
                                if (jSONObject11.has("ret_fields")) {
                                    try {
                                        for (String str31 : jSONObject11.getString("ret_fields").split("\\|")) {
                                            String[] split3 = str31.split("=");
                                            if (split3 != null && split3.length >= 2) {
                                                this.W.putString(split3[0], split3[1]);
                                            }
                                        }
                                    } catch (Exception unused4) {
                                    }
                                }
                                if (jSONObject11.has("inout_ble")) {
                                    int optInt = jSONObject11.optInt("inout_ble");
                                    setInOutStatus(optInt);
                                    if (optInt == 1) {
                                        setIsInIndoorPark(true);
                                    } else {
                                        setIsInIndoorPark(false);
                                    }
                                } else {
                                    setInOutStatus(-1);
                                }
                            } catch (Exception e18) {
                                e18.printStackTrace();
                            }
                        }
                        if (jSONObject6.has("gpscs")) {
                            setGpsCheckStatus(jSONObject6.getInt("gpscs"));
                        } else {
                            setGpsCheckStatus(0);
                        }
                        try {
                            if (jSONObject6.has("in_cn")) {
                                setLocationWhere(Integer.parseInt(jSONObject6.getString("in_cn")));
                            } else {
                                setLocationWhere(1);
                            }
                        } catch (Exception unused5) {
                        }
                        if (this.G == 0) {
                            setCoorType("wgs84");
                        } else {
                            setCoorType(str25);
                        }
                        if (jSONObject6.has("navi")) {
                            this.f4345a0 = jSONObject6.getString("navi");
                        }
                        if (jSONObject6.has("navi_client") && (string = jSONObject6.getString("navi_client")) != null) {
                            str28 = str12;
                            if (string.contains(str28) && (split = string.split(str28)) != null && split.length >= 2) {
                                intValue = Integer.valueOf(split[0]).intValue();
                                Integer.valueOf(split[1]).intValue();
                                if (intValue > 0) {
                                    this.f4353e0 = true;
                                }
                            }
                        }
                        if (jSONObject6.has("nrl_point")) {
                            try {
                                JSONObject jSONObject12 = jSONObject6.getJSONObject("nrl_point");
                                String str32 = str19;
                                if (jSONObject12.has(str32)) {
                                    String str33 = str14;
                                    if (jSONObject12.has(str33)) {
                                        this.f4349c0 = Double.parseDouble(jSONObject12.getString(str33));
                                        this.f4351d0 = Double.parseDouble(jSONObject12.getString(str32));
                                    }
                                }
                            } catch (Throwable unused6) {
                                this.f4349c0 = Double.MIN_VALUE;
                                this.f4351d0 = Double.MIN_VALUE;
                            }
                        }
                        if (jSONObject6.has("loc_nlp")) {
                            setSemanticParams(jSONObject6.getString("loc_nlp"));
                            return;
                        }
                        return;
                    }
                    if (parseInt != 66 && parseInt != 68) {
                        if (parseInt == 167) {
                            setLocationWhere(2);
                            return;
                        }
                        return;
                    }
                    JSONObject jSONObject13 = jSONObject2.getJSONObject(FirebaseAnalytics.Param.CONTENT);
                    JSONObject jSONObject14 = jSONObject13.getJSONObject("point");
                    setLatitude(Double.parseDouble(jSONObject14.getString("y")));
                    setLongitude(Double.parseDouble(jSONObject14.getString("x")));
                    setRadius(Float.parseFloat(jSONObject13.getString("radius")));
                    a(Boolean.valueOf(Boolean.parseBoolean(jSONObject13.getString("isCellChanged"))));
                }
                setCoorType(str2);
            } catch (Exception e19) {
                exc = e19;
                z7 = false;
                exc.printStackTrace();
                r22 = z7;
                this.f4344a = r22;
                this.f4376s = r22;
            }
        } catch (Error e20) {
            e20.printStackTrace();
            r22 = 0;
            this.f4344a = r22;
            this.f4376s = r22;
        }
    }
}
