package com.baidu.location.b;

import android.content.Intent;
import android.location.Location;
import android.net.wifi.WifiInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import android.text.TextUtils;
import android.util.LruCache;
import com.baidu.location.Address;
import com.baidu.location.BDLocation;
import com.baidu.location.Jni;
import com.baidu.location.LocationClientOption;
import com.baidu.location.LocationConst;
import com.baidu.location.Poi;
import com.baidu.location.PoiRegion;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public static long f4511a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static int f4512b = -1;

    /* renamed from: c, reason: collision with root package name */
    private ArrayList<b> f4513c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f4514d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f4515e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f4516f;

    /* renamed from: g, reason: collision with root package name */
    boolean f4517g;

    /* renamed from: h, reason: collision with root package name */
    private BDLocation f4518h;

    /* renamed from: i, reason: collision with root package name */
    private BDLocation f4519i;

    /* renamed from: j, reason: collision with root package name */
    private Object f4520j;

    /* renamed from: k, reason: collision with root package name */
    private long f4521k;

    /* renamed from: l, reason: collision with root package name */
    private LruCache<String, JSONObject> f4522l;

    /* renamed from: m, reason: collision with root package name */
    private String f4523m;

    /* renamed from: n, reason: collision with root package name */
    private String f4524n;

    /* renamed from: o, reason: collision with root package name */
    private String f4525o;

    /* renamed from: p, reason: collision with root package name */
    private final String[] f4526p;

    /* renamed from: q, reason: collision with root package name */
    int f4527q;

    /* renamed from: r, reason: collision with root package name */
    private BDLocation f4528r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f4529s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f4530t;

    private class b {

        /* renamed from: a, reason: collision with root package name */
        public String f4531a;

        /* renamed from: b, reason: collision with root package name */
        public Messenger f4532b;

        /* renamed from: c, reason: collision with root package name */
        public LocationClientOption f4533c = new LocationClientOption();

        /* renamed from: d, reason: collision with root package name */
        public int f4534d = 0;

        /* renamed from: e, reason: collision with root package name */
        public int f4535e;

        public b(Message message) {
            this.f4531a = null;
            this.f4532b = null;
            this.f4535e = 1;
            this.f4532b = message.replyTo;
            this.f4535e = message.arg1;
            this.f4531a = message.getData().getString("packName");
            this.f4533c.prodName = message.getData().getString("prodName");
            com.baidu.location.e.c.a().a(this.f4533c.prodName, this.f4531a);
            this.f4533c.coorType = message.getData().getString("coorType");
            this.f4533c.addrType = message.getData().getString("addrType");
            this.f4533c.enableSimulateGps = message.getData().getBoolean("enableSimulateGps", false);
            com.baidu.location.e.i.f5275k = com.baidu.location.e.i.f5275k || this.f4533c.enableSimulateGps;
            if (!com.baidu.location.e.i.f5261d.equals(TtmlNode.COMBINE_ALL)) {
                com.baidu.location.e.i.f5261d = this.f4533c.addrType;
            }
            this.f4533c.openGps = message.getData().getBoolean("openGPS");
            this.f4533c.scanSpan = message.getData().getInt("scanSpan");
            this.f4533c.timeOut = message.getData().getInt("timeOut");
            this.f4533c.priority = message.getData().getInt("priority");
            this.f4533c.location_change_notify = message.getData().getBoolean("location_change_notify");
            this.f4533c.mIsNeedDeviceDirect = message.getData().getBoolean("needDirect", false);
            this.f4533c.isNeedAltitude = message.getData().getBoolean("isneedaltitude", false);
            this.f4533c.isNeedNewVersionRgc = message.getData().getBoolean("isneednewrgc", false);
            com.baidu.location.e.i.f5267g = com.baidu.location.e.i.f5267g || this.f4533c.isNeedNewVersionRgc;
            com.baidu.location.e.i.f5265f = com.baidu.location.e.i.f5265f || message.getData().getBoolean("isneedaptag", false);
            com.baidu.location.e.i.f5269h = com.baidu.location.e.i.f5269h || message.getData().getBoolean("isneedaptagd", false);
            com.baidu.location.e.i.f5292v = message.getData().getFloat("autoNotifyLocSensitivity", 0.5f);
            int i8 = message.getData().getInt("wfnum", com.baidu.location.e.i.L);
            float f8 = message.getData().getFloat("wfsm", com.baidu.location.e.i.N);
            int i9 = message.getData().getInt("gnmcon", com.baidu.location.e.i.P);
            double d8 = message.getData().getDouble("gnmcrm", com.baidu.location.e.i.O);
            int i10 = message.getData().getInt("iupl", 1);
            com.baidu.location.e.i.f5262d0 = message.getData().getInt("ct", 10);
            com.baidu.location.e.i.f5264e0 = message.getData().getInt("suci", 3);
            com.baidu.location.e.i.f5268g0 = message.getData().getDoubleArray("cgs");
            com.baidu.location.e.i.f5270h0 = message.getData().getInt("ums", 1);
            com.baidu.location.e.i.f5266f0 = message.getData().getInt("smn", 40);
            if (i10 <= 0) {
                com.baidu.location.e.i.f5260c0 = 0;
            } else if (com.baidu.location.e.i.f5260c0 == -1) {
                com.baidu.location.e.i.f5260c0 = 1;
            }
            if (message.getData().getInt("opetco", 1) == 0) {
                com.baidu.location.e.i.f5272i0 = 0;
            }
            if (message.getData().getInt("lpcs", com.baidu.location.e.i.f5274j0) == 0) {
                com.baidu.location.e.i.f5274j0 = 0;
            }
            if (i9 == 1) {
                com.baidu.location.e.i.P = 1;
            }
            if (d8 > com.baidu.location.e.i.O) {
                com.baidu.location.e.i.O = d8;
            }
            com.baidu.location.e.i.K = com.baidu.location.e.i.K || message.getData().getBoolean("ischeckper", false);
            boolean z7 = message.getData().getBoolean("isEnableBeidouMode", false);
            if (Build.VERSION.SDK_INT >= 28) {
                com.baidu.location.e.i.f5278l0 = com.baidu.location.e.i.f5278l0 || z7;
            }
            if (i8 > com.baidu.location.e.i.L) {
                com.baidu.location.e.i.L = i8;
            }
            if (f8 > com.baidu.location.e.i.N) {
                com.baidu.location.e.i.N = f8;
            }
            int i11 = message.getData().getInt("wifitimeout", Integer.MAX_VALUE);
            if (i11 < com.baidu.location.e.i.D) {
                com.baidu.location.e.i.D = i11;
            }
            int i12 = message.getData().getInt("autoNotifyMaxInterval", 0);
            if (i12 >= com.baidu.location.e.i.f5296z) {
                com.baidu.location.e.i.f5296z = i12;
            }
            int i13 = message.getData().getInt("autoNotifyMinDistance", 0);
            if (i13 >= com.baidu.location.e.i.B) {
                com.baidu.location.e.i.B = i13;
            }
            int i14 = message.getData().getInt("autoNotifyMinTimeInterval", 0);
            if (i14 >= com.baidu.location.e.i.A) {
                com.baidu.location.e.i.A = i14;
            }
            LocationClientOption locationClientOption = this.f4533c;
            if (locationClientOption.mIsNeedDeviceDirect || locationClientOption.isNeedAltitude) {
                w.a().a(this.f4533c.mIsNeedDeviceDirect);
                w.a().b();
            }
            d.this.f4517g = d.this.f4517g || this.f4533c.isNeedAltitude;
            if (message.getData().getInt("hpdts", com.baidu.location.e.i.Q) == 1) {
                com.baidu.location.e.i.Q = 1;
            } else {
                com.baidu.location.e.i.Q = 0;
            }
            if (message.getData().getInt("oldts", com.baidu.location.e.i.R) == 1) {
                com.baidu.location.e.i.R = 1;
            } else {
                com.baidu.location.e.i.R = 0;
            }
            int i15 = message.getData().getInt("onic", com.baidu.location.e.i.S);
            if (i15 == 0) {
                com.baidu.location.e.i.S = i15;
            }
            int i16 = message.getData().getInt("nlcs", com.baidu.location.e.i.T);
            if (i16 == 1) {
                com.baidu.location.e.i.T = i16;
            }
            com.baidu.location.e.i.U = message.getData().getFloat("ncsr", com.baidu.location.e.i.U);
            com.baidu.location.e.i.V = message.getData().getFloat("cscr", com.baidu.location.e.i.V);
            com.baidu.location.e.i.W = message.getData().getInt("cls", com.baidu.location.e.i.W);
            int[] intArray = message.getData().getIntArray("ocs");
            com.baidu.location.e.i.X = intArray;
            com.baidu.location.e.i.Y = com.baidu.location.e.i.a(intArray);
            com.baidu.location.e.i.Z = message.getData().getInt("topCellNumber");
            com.baidu.location.e.i.f5256a0 = message.getData().getInt("locStrLength");
            com.baidu.location.e.i.f5258b0 = message.getData().getInt("hils");
            com.baidu.location.c.h.a().a((WifiInfo) null, message.getData().getString("connectBssid", null));
        }

        private double a(boolean z7, BDLocation bDLocation, BDLocation bDLocation2) {
            double d8;
            double a8;
            double latitude;
            double longitude;
            double latitude2;
            double longitude2;
            double[] dArr;
            if (!z7) {
                if (!TextUtils.equals(bDLocation2.getCoorType(), bDLocation.getCoorType())) {
                    double[] coorEncrypt = Jni.coorEncrypt(bDLocation.getLongitude(), bDLocation.getLatitude(), "gcj2wgs");
                    bDLocation.setLatitude(coorEncrypt[1]);
                    d8 = coorEncrypt[0];
                    bDLocation.setLongitude(d8);
                    bDLocation.setTime(com.baidu.location.e.i.a());
                    bDLocation.setCoorType("wgs84");
                    a8 = com.baidu.location.e.i.a(bDLocation2.getLatitude(), bDLocation2.getLongitude(), bDLocation.getLatitude(), bDLocation.getLongitude());
                }
                latitude = bDLocation2.getLatitude();
                longitude = bDLocation2.getLongitude();
                latitude2 = bDLocation.getLatitude();
                longitude2 = bDLocation.getLongitude();
                a8 = com.baidu.location.e.i.a(latitude, longitude, latitude2, longitude2);
            } else if (TextUtils.equals(bDLocation2.getCoorType(), bDLocation.getCoorType())) {
                if (TextUtils.equals("bd09", bDLocation2.getCoorType())) {
                    double[] coorEncrypt2 = Jni.coorEncrypt(bDLocation2.getLongitude(), bDLocation2.getLatitude(), BDLocation.BDLOCATION_BD09_TO_GCJ02);
                    double[] coorEncrypt3 = Jni.coorEncrypt(bDLocation.getLongitude(), bDLocation.getLatitude(), BDLocation.BDLOCATION_BD09_TO_GCJ02);
                    latitude = coorEncrypt2[1];
                    longitude = coorEncrypt2[0];
                    latitude2 = coorEncrypt3[1];
                    longitude2 = coorEncrypt3[0];
                    a8 = com.baidu.location.e.i.a(latitude, longitude, latitude2, longitude2);
                }
                latitude = bDLocation2.getLatitude();
                longitude = bDLocation2.getLongitude();
                latitude2 = bDLocation.getLatitude();
                longitude2 = bDLocation.getLongitude();
                a8 = com.baidu.location.e.i.a(latitude, longitude, latitude2, longitude2);
            } else {
                if (TextUtils.equals("wgs84", bDLocation.getCoorType())) {
                    dArr = new double[]{bDLocation.getLongitude(), bDLocation.getLatitude()};
                } else {
                    double[] coorEncrypt4 = TextUtils.equals("bd09", bDLocation.getCoorType()) ? Jni.coorEncrypt(bDLocation.getLongitude(), bDLocation.getLatitude(), BDLocation.BDLOCATION_BD09_TO_GCJ02) : TextUtils.equals("bd09ll", bDLocation.getCoorType()) ? Jni.coorEncrypt(bDLocation.getLongitude(), bDLocation.getLatitude(), BDLocation.BDLOCATION_BD09LL_TO_GCJ02) : new double[]{bDLocation.getLongitude(), bDLocation.getLatitude()};
                    dArr = Jni.coorEncrypt(coorEncrypt4[0], coorEncrypt4[1], "gcj2wgs");
                }
                bDLocation.setLatitude(dArr[1]);
                d8 = dArr[0];
                bDLocation.setLongitude(d8);
                bDLocation.setTime(com.baidu.location.e.i.a());
                bDLocation.setCoorType("wgs84");
                a8 = com.baidu.location.e.i.a(bDLocation2.getLatitude(), bDLocation2.getLongitude(), bDLocation.getLatitude(), bDLocation.getLongitude());
            }
            bDLocation2.setDisToRealLocation(a8);
            if (bDLocation != null) {
                bDLocation2.setReallLocation(bDLocation);
            }
            return a8;
        }

        private BDLocation b() {
            BDLocation h8 = com.baidu.location.c.f.a().h();
            if (h8 == null) {
                return null;
            }
            double[] coorEncrypt = Jni.coorEncrypt(h8.getLongitude(), h8.getLatitude(), BDLocation.BDLOCATION_WGS84_TO_GCJ02);
            double[] coorEncrypt2 = Jni.coorEncrypt(coorEncrypt[0], coorEncrypt[1], this.f4533c.coorType);
            BDLocation bDLocation = new BDLocation();
            bDLocation.setLongitude(coorEncrypt2[0]);
            bDLocation.setLatitude(coorEncrypt2[1]);
            bDLocation.setTime(com.baidu.location.e.i.a());
            bDLocation.setLocType(61);
            bDLocation.setCoorType(this.f4533c.coorType);
            return bDLocation;
        }

        private BDLocation c() {
            BDLocation h8 = com.baidu.location.c.f.a().h();
            if (h8 == null) {
                return null;
            }
            double[] coorEncrypt = Jni.coorEncrypt(h8.getLongitude(), h8.getLatitude(), BDLocation.BDLOCATION_WGS84_TO_GCJ02);
            BDLocation bDLocation = new BDLocation();
            bDLocation.setLongitude(coorEncrypt[0]);
            bDLocation.setLatitude(coorEncrypt[1]);
            bDLocation.setTime(com.baidu.location.e.i.a());
            bDLocation.setLocType(61);
            bDLocation.setCoorType("gcj02");
            return bDLocation;
        }

        private int a(double d8) {
            if (d8 >= com.github.mikephil.charting.utils.i.DOUBLE_EPSILON && d8 <= 10.0d) {
                return 0;
            }
            if (d8 <= 10.0d || d8 > 100.0d) {
                return (d8 <= 100.0d || d8 > 200.0d) ? 3 : 2;
            }
            return 1;
        }

        public int a(int i8, boolean z7, BDLocation bDLocation) {
            double a8;
            if (i8 == 100) {
                if (z7) {
                    BDLocation b8 = b();
                    if (b8 == null) {
                        return 3;
                    }
                    a(true, b8, bDLocation);
                    return 3;
                }
                BDLocation c8 = c();
                if (c8 == null) {
                    return 3;
                }
                a(false, c8, bDLocation);
                return 3;
            }
            if (i8 == 200 || i8 == 300) {
                return 1;
            }
            if (i8 != 400) {
                return i8 == 500 ? 1 : 0;
            }
            if (z7) {
                BDLocation b9 = b();
                if (b9 == null) {
                    return -1;
                }
                a8 = a(true, b9, bDLocation);
            } else {
                BDLocation c9 = c();
                if (c9 == null) {
                    return -1;
                }
                a8 = a(false, c9, bDLocation);
            }
            return a(a8);
        }

        public void a() {
            if (this.f4533c.location_change_notify) {
                a(com.baidu.location.e.i.f5257b ? 54 : 55);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(int i8) {
            Message obtain = Message.obtain((Handler) null, i8);
            try {
                Messenger messenger = this.f4532b;
                if (messenger != null) {
                    messenger.send(obtain);
                }
                this.f4534d = 0;
            } catch (Exception e8) {
                if (e8 instanceof DeadObjectException) {
                    this.f4534d++;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(int i8, Bundle bundle) {
            Message obtain = Message.obtain((Handler) null, i8);
            obtain.setData(bundle);
            try {
                Messenger messenger = this.f4532b;
                if (messenger != null) {
                    messenger.send(obtain);
                }
                this.f4534d = 0;
            } catch (Exception e8) {
                if (e8 instanceof DeadObjectException) {
                    this.f4534d++;
                }
                e8.printStackTrace();
            }
        }

        private void a(int i8, String str, BDLocation bDLocation) {
            Bundle bundle = new Bundle();
            bundle.putParcelable(str, bDLocation);
            bundle.setClassLoader(BDLocation.class.getClassLoader());
            Message obtain = Message.obtain((Handler) null, i8);
            obtain.setData(bundle);
            try {
                Messenger messenger = this.f4532b;
                if (messenger != null) {
                    messenger.send(obtain);
                }
                this.f4534d = 0;
            } catch (Exception e8) {
                if (e8 instanceof DeadObjectException) {
                    this.f4534d++;
                }
            }
        }

        public void a(BDLocation bDLocation) {
            a(bDLocation, 21);
        }

        public void a(BDLocation bDLocation, int i8) {
            int a8;
            String str;
            BDLocation bDLocation2 = new BDLocation(bDLocation);
            if (i8 == 21) {
                a(27, "locStr", bDLocation2);
            }
            String str2 = this.f4533c.coorType;
            if (str2 != null && !str2.equals("gcj02")) {
                double longitude = bDLocation2.getLongitude();
                double latitude = bDLocation2.getLatitude();
                if (longitude != Double.MIN_VALUE && latitude != Double.MIN_VALUE) {
                    if ((bDLocation2.getCoorType() != null && bDLocation2.getCoorType().equals("gcj02")) || bDLocation2.getCoorType() == null) {
                        double[] coorEncrypt = Jni.coorEncrypt(longitude, latitude, this.f4533c.coorType);
                        bDLocation2.setLongitude(coorEncrypt[0]);
                        bDLocation2.setLatitude(coorEncrypt[1]);
                        str = this.f4533c.coorType;
                    } else if (bDLocation2.getCoorType() != null && bDLocation2.getCoorType().equals("wgs84") && !this.f4533c.coorType.equals("bd09ll")) {
                        double[] coorEncrypt2 = Jni.coorEncrypt(longitude, latitude, "wgs842mc");
                        bDLocation2.setLongitude(coorEncrypt2[0]);
                        bDLocation2.setLatitude(coorEncrypt2[1]);
                        str = "wgs84mc";
                    }
                    bDLocation2.setCoorType(str);
                }
                if (!com.baidu.location.e.i.f5275k && bDLocation2.getMockGpsStrategy() > 0) {
                    a8 = a(bDLocation2.getMockGpsStrategy(), true, bDLocation2);
                    bDLocation2.setMockGpsProbability(a8);
                }
            } else if (!com.baidu.location.e.i.f5275k && bDLocation2.getMockGpsStrategy() > 0) {
                a8 = a(bDLocation2.getMockGpsStrategy(), false, bDLocation2);
                bDLocation2.setMockGpsProbability(a8);
            }
            a(i8, "locStr", bDLocation2);
        }
    }

    private static class c {

        /* renamed from: a, reason: collision with root package name */
        private static d f4537a = new d();
    }

    private d() {
        this.f4513c = null;
        this.f4514d = false;
        this.f4515e = true;
        this.f4516f = false;
        this.f4517g = false;
        this.f4518h = null;
        this.f4519i = null;
        this.f4520j = new Object();
        this.f4521k = -1L;
        this.f4523m = null;
        this.f4524n = null;
        this.f4525o = null;
        this.f4526p = new String[]{"name", "mac", "onLng", "onLat", "onLocType", "onTime", "offLng", "offLat", "offLocType", "offTime"};
        this.f4527q = 0;
        this.f4528r = null;
        this.f4529s = false;
        this.f4530t = false;
        this.f4513c = new ArrayList<>();
        this.f4522l = new LruCache<>(3);
        this.f4524n = u.a().a("sp_loc_map_end_str", "");
        this.f4523m = u.a().a("sp_loc_navi_end_str", "");
        this.f4525o = u.a().a("sp_loc_last_navi_end_str", "");
        String a8 = u.a().a("sp_bluetooth_info", "");
        if (a8 == null || "".equals(a8)) {
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray(a8);
            for (int i8 = 0; i8 < jSONArray.length(); i8++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i8);
                this.f4522l.put(jSONObject.getString("mac"), jSONObject);
            }
        } catch (JSONException e8) {
            e8.printStackTrace();
        }
    }

    private b a(Messenger messenger) {
        if (this.f4513c == null) {
            return null;
        }
        try {
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        synchronized (this.f4520j) {
            try {
                Iterator<b> it = this.f4513c.iterator();
                while (it.hasNext()) {
                    b next = it.next();
                    if (next.f4532b.equals(messenger)) {
                        return next;
                    }
                }
                return null;
            } finally {
            }
        }
    }

    private void f() {
        boolean z7;
        boolean z8 = false;
        try {
            try {
                synchronized (this.f4520j) {
                    try {
                        Iterator<b> it = this.f4513c.iterator();
                        z7 = false;
                        while (it.hasNext()) {
                            LocationClientOption locationClientOption = it.next().f4533c;
                            if (locationClientOption.openGps) {
                                z8 = true;
                            }
                            if (locationClientOption.location_change_notify) {
                                z7 = true;
                            }
                        }
                    } catch (Throwable th) {
                        th = th;
                        z7 = false;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e8) {
            e = e8;
            z7 = false;
        }
        try {
            throw th;
        } catch (Exception e9) {
            e = e9;
            e.printStackTrace();
            com.baidu.location.e.i.f5255a = z7;
            if (this.f4514d != z8 || (!com.baidu.location.c.f.a().k() && this.f4514d)) {
                this.f4514d = z8;
                com.baidu.location.c.f.a().a(this.f4514d);
            }
        }
    }

    private void g() {
        try {
            Iterator<b> it = this.f4513c.iterator();
            while (it.hasNext()) {
                com.baidu.location.e.i.f5263e = Math.min(com.baidu.location.e.i.f5263e, it.next().f4533c.priority);
            }
            if (com.baidu.location.f.isServing) {
                return;
            }
            com.baidu.location.e.i.f5263e = 4;
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public void b() {
        synchronized (this.f4520j) {
            try {
                ArrayList<b> arrayList = this.f4513c;
                if (arrayList != null) {
                    arrayList.clear();
                }
            } catch (Throwable unused) {
            }
        }
        this.f4518h = null;
        e();
    }

    public String c() {
        StringBuilder sb;
        StringBuffer stringBuffer = new StringBuffer(256);
        if (this.f4513c.isEmpty()) {
            return "&prod=" + com.baidu.location.e.c.f5165b + ":" + com.baidu.location.e.c.f5164a;
        }
        String stringBuffer2 = stringBuffer.toString();
        try {
            b bVar = this.f4513c.get(0);
            String str = bVar.f4533c.prodName;
            if (str != null) {
                stringBuffer.append(str);
            }
            if (bVar.f4531a != null) {
                stringBuffer.append(":");
                stringBuffer.append(bVar.f4531a);
                stringBuffer.append(b5.b.VERTICAL);
            }
            if (stringBuffer2 == null || stringBuffer2.equals("")) {
                sb = new StringBuilder();
                sb.append("&prod=");
                sb.append(com.baidu.location.e.c.f5165b);
                sb.append(":");
                stringBuffer2 = com.baidu.location.e.c.f5164a;
            } else {
                sb = new StringBuilder();
                sb.append("&prod=");
            }
            sb.append(stringBuffer2);
            return sb.toString();
        } catch (Exception unused) {
            return "&prod=" + com.baidu.location.e.c.f5165b + ":" + com.baidu.location.e.c.f5164a;
        }
    }

    public int d(Message message) {
        Messenger messenger;
        b a8;
        if (message == null || (messenger = message.replyTo) == null || (a8 = a(messenger)) == null || a8.f4533c == null) {
            return 1;
        }
        return com.baidu.location.e.i.f5263e;
    }

    public int e(Message message) {
        Messenger messenger;
        b a8;
        LocationClientOption locationClientOption;
        if (message == null || (messenger = message.replyTo) == null || (a8 = a(messenger)) == null || (locationClientOption = a8.f4533c) == null) {
            return 1000;
        }
        return locationClientOption.scanSpan;
    }

    public static d a() {
        return c.f4537a;
    }

    private void e() {
        f();
        d();
        g();
    }

    public void b(Message message) {
        synchronized (this.f4520j) {
            try {
                b a8 = a(message.replyTo);
                if (a8 != null) {
                    this.f4513c.remove(a8);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        w.a().c();
        e();
        if (this.f4529s) {
            a("stop");
            this.f4527q = 0;
        }
    }

    public void c(BDLocation bDLocation) {
        Address a8 = r.c().a(bDLocation);
        String f8 = r.c().f();
        List<Poi> g8 = r.c().g();
        PoiRegion h8 = r.c().h();
        if (a8 != null) {
            bDLocation.setAddr(a8);
        }
        if (f8 != null) {
            bDLocation.setLocationDescribe(f8);
        }
        if (g8 != null) {
            bDLocation.setPoiList(g8);
        }
        if (h8 != null) {
            bDLocation.setPoiRegion(h8);
        }
        a(bDLocation);
        r.c().c(bDLocation);
    }

    public void d() {
        try {
            synchronized (this.f4520j) {
                try {
                    Iterator<b> it = this.f4513c.iterator();
                    while (it.hasNext()) {
                        it.next().a();
                    }
                } finally {
                }
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public void a(Bundle bundle, int i8) {
        synchronized (this.f4520j) {
            Iterator<b> it = this.f4513c.iterator();
            while (it.hasNext()) {
                try {
                    b next = it.next();
                    next.a(i8, bundle);
                    if (next.f4534d > 4) {
                        it.remove();
                    }
                } catch (Exception unused) {
                }
            }
        }
    }

    public void b(BDLocation bDLocation) {
        BDLocation bDLocation2;
        if (bDLocation == null || bDLocation.getLocType() != 161 || com.baidu.location.a.a.a().c()) {
            synchronized (this.f4520j) {
                Iterator<b> it = this.f4513c.iterator();
                while (it.hasNext()) {
                    try {
                        b next = it.next();
                        next.a(bDLocation);
                        if (next.f4534d > 4) {
                            it.remove();
                        }
                    } catch (Exception unused) {
                    }
                }
            }
        } else {
            if (this.f4519i == null) {
                BDLocation bDLocation3 = new BDLocation();
                this.f4519i = bDLocation3;
                bDLocation3.setLocType(505);
            }
            synchronized (this.f4520j) {
                Iterator<b> it2 = this.f4513c.iterator();
                while (it2.hasNext()) {
                    try {
                        b next2 = it2.next();
                        next2.a(this.f4519i);
                        if (next2.f4534d > 4) {
                            it2.remove();
                        }
                    } catch (Exception unused2) {
                    }
                }
            }
        }
        if (bDLocation != null && (bDLocation.getLocType() == 61 || bDLocation.getLocType() == 161 || bDLocation.getLocType() == 66)) {
            e.b().a(bDLocation.getLatitude(), bDLocation.getLongitude());
            e.b().a(bDLocation.getCityCode());
        }
        boolean z7 = r.f4853r;
        if (z7) {
            r.f4853r = false;
        }
        if (com.baidu.location.e.i.f5296z >= 10000) {
            if (bDLocation.getLocType() == 61 || bDLocation.getLocType() == 161 || bDLocation.getLocType() == 66) {
                BDLocation bDLocation4 = this.f4518h;
                if (bDLocation4 != null) {
                    float[] fArr = new float[1];
                    Location.distanceBetween(bDLocation4.getLatitude(), this.f4518h.getLongitude(), bDLocation.getLatitude(), bDLocation.getLongitude(), fArr);
                    if (fArr[0] <= com.baidu.location.e.i.B && !z7) {
                        return;
                    }
                    this.f4518h = null;
                    bDLocation2 = new BDLocation(bDLocation);
                } else {
                    bDLocation2 = new BDLocation(bDLocation);
                }
                this.f4518h = bDLocation2;
            }
        }
    }

    public boolean c(Message message) {
        b a8 = a(message.replyTo);
        if (a8 == null) {
            return false;
        }
        LocationClientOption locationClientOption = a8.f4533c;
        int i8 = locationClientOption.scanSpan;
        locationClientOption.scanSpan = message.getData().getInt("scanSpan", a8.f4533c.scanSpan);
        if (a8.f4533c.scanSpan < 1000) {
            w.a().c();
            this.f4516f = false;
        } else {
            this.f4516f = true;
        }
        LocationClientOption locationClientOption2 = a8.f4533c;
        if (locationClientOption2.scanSpan > 999 && i8 < 1000) {
            if (locationClientOption2.mIsNeedDeviceDirect || locationClientOption2.isNeedAltitude) {
                w.a().a(a8.f4533c.mIsNeedDeviceDirect);
                w.a().b();
            }
            this.f4517g = this.f4517g || a8.f4533c.isNeedAltitude;
            r1 = true;
        }
        a8.f4533c.openGps = message.getData().getBoolean("openGPS", a8.f4533c.openGps);
        String string = message.getData().getString("coorType");
        LocationClientOption locationClientOption3 = a8.f4533c;
        if (string == null || string.equals("")) {
            string = a8.f4533c.coorType;
        }
        locationClientOption3.coorType = string;
        String string2 = message.getData().getString("addrType");
        LocationClientOption locationClientOption4 = a8.f4533c;
        if (string2 == null || string2.equals("")) {
            string2 = a8.f4533c.addrType;
        }
        locationClientOption4.addrType = string2;
        if (!com.baidu.location.e.i.f5261d.equals(a8.f4533c.addrType)) {
            r.c().k();
        }
        a8.f4533c.timeOut = message.getData().getInt("timeOut", a8.f4533c.timeOut);
        a8.f4533c.location_change_notify = message.getData().getBoolean("location_change_notify", a8.f4533c.location_change_notify);
        a8.f4533c.priority = message.getData().getInt("priority", a8.f4533c.priority);
        com.baidu.location.e.i.f5263e = a8.f4533c.priority;
        int i9 = message.getData().getInt("wifitimeout", Integer.MAX_VALUE);
        if (i9 < com.baidu.location.e.i.D) {
            com.baidu.location.e.i.D = i9;
        }
        e();
        return r1;
    }

    public void d(BDLocation bDLocation) {
        c(bDLocation);
    }

    public void a(Message message) {
        if (message == null || message.replyTo == null) {
            return;
        }
        f4511a = System.currentTimeMillis();
        this.f4516f = true;
        com.baidu.location.c.h.a().i();
        a(new b(message));
        e();
        if (this.f4529s) {
            a("start");
            this.f4527q = 0;
        }
    }

    public void a(BDLocation bDLocation) {
        b(bDLocation);
    }

    private void a(b bVar) {
        if (bVar == null) {
            return;
        }
        synchronized (this.f4520j) {
            try {
                if (a(bVar.f4532b) != null) {
                    bVar.a(14);
                } else {
                    this.f4513c.add(bVar);
                    bVar.a(13);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void a(String str) {
        Intent intent = new Intent("com.baidu.location.flp.log");
        intent.setPackage("com.baidu.baidulocationdemo");
        intent.putExtra("data", str);
        intent.putExtra("pack", com.baidu.location.e.c.f5164a);
        intent.putExtra("tag", LocationConst.HDYawConst.KEY_HD_YAW_STATE);
        com.baidu.location.f.getServiceContext().sendBroadcast(intent);
    }

    public void a(boolean z7) {
        this.f4516f = z7;
        f4512b = z7 ? 1 : 0;
    }
}
