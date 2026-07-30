package com.baidu.location.b;

import android.content.Context;
import android.content.SharedPreferences;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import com.baidu.ar.util.SystemInfoUtil;
import com.baidu.lbsapi.auth.LBSAuthManager;
import com.baidu.location.Address;
import com.baidu.location.BDLocation;
import com.baidu.location.Jni;
import com.baidu.location.LocationClientOption;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.material.timepicker.TimeModel;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    private static char[] f4697a = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_.".toCharArray();

    /* renamed from: b, reason: collision with root package name */
    private Context f4698b;

    /* renamed from: c, reason: collision with root package name */
    private TelephonyManager f4699c;

    /* renamed from: e, reason: collision with root package name */
    private WifiManager f4701e;

    /* renamed from: g, reason: collision with root package name */
    private String f4703g;

    /* renamed from: h, reason: collision with root package name */
    private String f4704h;

    /* renamed from: i, reason: collision with root package name */
    private LocationClientOption f4705i;

    /* renamed from: j, reason: collision with root package name */
    private b f4706j;

    /* renamed from: l, reason: collision with root package name */
    private String f4708l;

    /* renamed from: m, reason: collision with root package name */
    private String f4709m;

    /* renamed from: n, reason: collision with root package name */
    String f4710n;

    /* renamed from: o, reason: collision with root package name */
    String f4711o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f4712p;

    /* renamed from: d, reason: collision with root package name */
    private com.baidu.location.c.b f4700d = new com.baidu.location.c.b();

    /* renamed from: f, reason: collision with root package name */
    private com.baidu.location.c.m f4702f = null;

    /* renamed from: k, reason: collision with root package name */
    private String f4707k = null;

    /* renamed from: q, reason: collision with root package name */
    c f4713q = new c();

    /* renamed from: r, reason: collision with root package name */
    private String f4714r = null;

    /* renamed from: s, reason: collision with root package name */
    private long f4715s = 0;

    /* renamed from: t, reason: collision with root package name */
    private boolean f4716t = false;

    /* renamed from: u, reason: collision with root package name */
    private long f4717u = 0;

    /* renamed from: v, reason: collision with root package name */
    private boolean f4718v = false;

    class a implements Comparator<d> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(d dVar, d dVar2) {
            int i8 = dVar.f4729b;
            int i9 = dVar2.f4729b;
            if (i8 > i9) {
                return -1;
            }
            return i8 == i9 ? 0 : 1;
        }
    }

    public interface b {
        void onReceiveLocation(BDLocation bDLocation);
    }

    class c extends com.baidu.location.e.g {

        /* renamed from: p, reason: collision with root package name */
        LocationManager f4721p;

        /* renamed from: q, reason: collision with root package name */
        b f4722q;

        /* renamed from: o, reason: collision with root package name */
        String f4720o = null;

        /* renamed from: r, reason: collision with root package name */
        boolean f4723r = false;

        class a extends TimerTask {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Timer f4725a;

            a(Timer timer) {
                this.f4725a = timer;
            }

            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                c cVar = c.this;
                if (!cVar.f4723r) {
                    cVar.c();
                }
                this.f4725a.cancel();
                this.f4725a.purge();
            }
        }

        private class b implements LocationListener {
            private b() {
            }

            @Override // android.location.LocationListener
            public void onLocationChanged(Location location) {
                c.this.c();
                c.this.f4723r = true;
            }

            @Override // android.location.LocationListener
            public void onProviderDisabled(String str) {
            }

            @Override // android.location.LocationListener
            public void onProviderEnabled(String str) {
            }

            @Override // android.location.LocationListener
            public void onStatusChanged(String str, int i8, Bundle bundle) {
            }

            /* synthetic */ b(c cVar, a aVar) {
                this();
            }
        }

        c() {
            this.f5229g = new HashMap();
        }

        private void b() {
            try {
                this.f4721p = (LocationManager) i.this.f4698b.getSystemService("location");
                b bVar = new b(this, null);
                this.f4722q = bVar;
                LocationManager locationManager = this.f4721p;
                if (locationManager != null) {
                    try {
                        locationManager.requestLocationUpdates("network", 1000L, 0.0f, bVar, Looper.getMainLooper());
                    } catch (SecurityException e8) {
                        e8.printStackTrace();
                    }
                }
            } catch (Throwable unused) {
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c() {
            LocationManager locationManager;
            b bVar = this.f4722q;
            if (bVar == null || (locationManager = this.f4721p) == null) {
                return;
            }
            try {
                locationManager.removeUpdates(bVar);
            } catch (Exception unused) {
            }
        }

        @Override // com.baidu.location.e.g
        public void a() {
            if (i.this.f4708l != null && i.this.f4709m != null) {
                this.f4720o += String.format(Locale.CHINA, "&ki=%s&sn=%s", i.this.f4708l, i.this.f4709m);
            }
            String str = this.f4720o + "&enc=2";
            this.f4720o = str;
            String encodeTp4 = Jni.encodeTp4(str);
            this.f4720o = null;
            this.f5229g.put("bloc", encodeTp4);
            this.f5229g.put("trtm", String.format(Locale.CHINA, TimeModel.NUMBER_FORMAT, Long.valueOf(System.currentTimeMillis())));
        }

        private void a(BDLocation bDLocation) {
            try {
                if (bDLocation.hasAddr()) {
                    Address address = bDLocation.getAddress();
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append(address.country);
                    stringBuffer.append(";");
                    stringBuffer.append(address.countryCode);
                    stringBuffer.append(";");
                    stringBuffer.append(address.province);
                    stringBuffer.append(";");
                    stringBuffer.append(address.city);
                    stringBuffer.append(";");
                    stringBuffer.append(address.cityCode);
                    stringBuffer.append(";");
                    stringBuffer.append(address.district);
                    stringBuffer.append(";");
                    stringBuffer.append(address.street);
                    stringBuffer.append(";");
                    stringBuffer.append(address.streetNumber);
                    stringBuffer.append(";");
                    stringBuffer.append(address.adcode);
                    stringBuffer.append(";");
                    stringBuffer.append(address.town);
                    stringBuffer.append(";");
                    stringBuffer.append(address.townCode);
                    String encodeToString = Base64.encodeToString((System.currentTimeMillis() + "_" + stringBuffer.toString()).getBytes(cn.hutool.core.util.l.UTF_8), 0);
                    SharedPreferences a8 = u.a(i.this.f4698b);
                    if (a8 != null) {
                        SharedPreferences.Editor edit = a8.edit();
                        edit.putString("FirstLocAddr", encodeToString);
                        edit.apply();
                    }
                }
            } catch (Exception unused) {
            }
        }

        public void a(String str) {
            this.f4720o = str;
            b(com.baidu.location.e.e.f5203b);
            if (i.this.f4716t) {
                b();
                Timer timer = new Timer();
                timer.schedule(new a(timer), 10000L);
                SharedPreferences.Editor edit = i.this.f4698b.getSharedPreferences("cuidRelate", 0).edit();
                edit.putLong("reqtime", System.currentTimeMillis());
                edit.apply();
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:3:0x0008, code lost:
        
            r6 = r5.f5227e;
         */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00a3 A[Catch: Exception -> 0x0019, TryCatch #2 {Exception -> 0x0019, blocks: (B:6:0x000c, B:8:0x0014, B:14:0x0062, B:18:0x006d, B:20:0x0077, B:23:0x008a, B:24:0x0097, B:26:0x00a3, B:27:0x00a8, B:34:0x008e, B:35:0x00ef, B:36:0x005a, B:37:0x001c, B:45:0x003d, B:40:0x0024, B:42:0x002f, B:10:0x0040, B:12:0x0056), top: B:5:0x000c, inners: #0, #1 }] */
        @Override // com.baidu.location.e.g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void a(boolean z7) {
            String str;
            BDLocation bDLocation;
            String str2;
            i iVar;
            if (!z7 || str == null) {
                i.this.b(63);
            } else {
                try {
                    if (str.contains("enc3")) {
                        str = com.baidu.location.e.i.d(str);
                    } else if (str.contains("\"enc\"")) {
                        try {
                            JSONObject jSONObject = new JSONObject(str);
                            if (jSONObject.has("enc")) {
                                str = p.a().b(jSONObject.getString("enc"));
                            }
                        } catch (Exception e8) {
                            e8.printStackTrace();
                        }
                    }
                    try {
                        bDLocation = new BDLocation(str);
                        i.this.a(str);
                        if (!i.this.f4705i.isOnceLocation()) {
                            a(bDLocation);
                        }
                    } catch (Exception unused) {
                        bDLocation = new BDLocation();
                        bDLocation.setLocType(63);
                    }
                    if (bDLocation.getLocType() != 161) {
                        i.this.b(bDLocation.getLocType());
                    } else {
                        if ("wgs84".equals(bDLocation.getCoorType())) {
                            if (i.this.f4705i.coorType.equals("bd09")) {
                                str2 = "wgs84mc";
                            }
                            iVar = i.this;
                            if (iVar.a(iVar.f4705i)) {
                                bDLocation.setLocType(BDLocation.TypeCoarseLocation);
                            }
                            n.a().a(bDLocation);
                            bDLocation.setLocationID(Jni.en1(i.this.f4710n + ";" + i.this.f4711o + ";" + bDLocation.getTime()));
                            bDLocation.setRoadLocString(0.0f, 0.0f, null, null);
                            i.this.f4718v = true;
                            i.this.f4706j.onReceiveLocation(bDLocation);
                        } else {
                            str2 = i.this.f4705i.coorType;
                        }
                        bDLocation.setCoorType(str2);
                        iVar = i.this;
                        if (iVar.a(iVar.f4705i)) {
                        }
                        n.a().a(bDLocation);
                        bDLocation.setLocationID(Jni.en1(i.this.f4710n + ";" + i.this.f4711o + ";" + bDLocation.getTime()));
                        bDLocation.setRoadLocString(0.0f, 0.0f, null, null);
                        i.this.f4718v = true;
                        i.this.f4706j.onReceiveLocation(bDLocation);
                    }
                } catch (Exception e9) {
                    i.this.b(63);
                    e9.printStackTrace();
                }
            }
            Map<String, Object> map = this.f5229g;
            if (map != null) {
                map.clear();
            }
        }
    }

    private class d {

        /* renamed from: a, reason: collision with root package name */
        public String f4728a;

        /* renamed from: b, reason: collision with root package name */
        public int f4729b;

        d(String str, int i8) {
            this.f4728a = str;
            this.f4729b = i8;
        }
    }

    public i(Context context, LocationClientOption locationClientOption, b bVar, String str, boolean z7) {
        StringBuilder sb;
        String str2 = null;
        this.f4698b = null;
        this.f4699c = null;
        this.f4701e = null;
        this.f4703g = null;
        this.f4704h = null;
        this.f4708l = null;
        this.f4709m = null;
        this.f4710n = null;
        this.f4711o = null;
        this.f4712p = false;
        Context applicationContext = context.getApplicationContext();
        this.f4698b = applicationContext;
        try {
            com.baidu.location.e.i.J = applicationContext.getPackageName();
        } catch (Exception unused) {
        }
        this.f4712p = true;
        this.f4705i = new LocationClientOption(locationClientOption);
        this.f4706j = bVar;
        this.f4710n = this.f4698b.getPackageName();
        this.f4711o = null;
        try {
            this.f4699c = (TelephonyManager) this.f4698b.getSystemService("phone");
            this.f4701e = (WifiManager) this.f4698b.getApplicationContext().getSystemService("wifi");
        } catch (Exception unused2) {
        }
        if (this.f4705i.firstLocType == LocationClientOption.FirstLocType.ACCURACY_IN_FIRST_LOC) {
            com.baidu.location.c.h.a().a(this.f4698b);
        }
        this.f4704h = "&" + this.f4710n + "&" + ((String) null);
        try {
            this.f4711o = LBSAuthManager.getInstance(this.f4698b).getCUID();
        } catch (Throwable unused3) {
            this.f4711o = null;
            this.f4699c = null;
            this.f4701e = null;
        }
        if (this.f4711o != null) {
            com.baidu.location.e.i.f5277l = "" + this.f4711o;
            sb = new StringBuilder();
            sb.append("&prod=");
            sb.append(this.f4705i.prodName);
            sb.append(":");
            sb.append(this.f4710n);
            sb.append("|&cu=");
            str2 = this.f4711o;
        } else {
            sb = new StringBuilder();
            sb.append("&prod=");
            sb.append(this.f4705i.prodName);
            sb.append(":");
            sb.append(this.f4710n);
            sb.append("|&im=");
        }
        sb.append(str2);
        sb.append("&coor=");
        sb.append(locationClientOption.getCoorType());
        this.f4703g = sb.toString();
        StringBuffer stringBuffer = new StringBuffer(256);
        stringBuffer.append("&fw=");
        stringBuffer.append("9.653");
        stringBuffer.append("&sdk=");
        stringBuffer.append("9.653");
        stringBuffer.append("&lt=1");
        stringBuffer.append("&mb=");
        stringBuffer.append(Build.MODEL);
        stringBuffer.append("&resid=");
        stringBuffer.append("12");
        locationClientOption.getAddrType();
        if (locationClientOption.getAddrType() != null && locationClientOption.getAddrType().equals(TtmlNode.COMBINE_ALL)) {
            this.f4703g += "&addr=allj2";
            if (locationClientOption.isNeedNewVersionRgc) {
                stringBuffer.append("&adtp=n2");
            }
        }
        if (locationClientOption.isNeedAptag || locationClientOption.isNeedAptagd) {
            this.f4703g += "&sema=";
            if (locationClientOption.isNeedAptag) {
                this.f4703g += "aptag|";
            }
            if (locationClientOption.isNeedAptagd) {
                this.f4703g += "aptagd2|";
            }
            this.f4708l = com.baidu.location.a.a.b(this.f4698b);
            this.f4709m = com.baidu.location.a.a.c(this.f4698b);
        }
        stringBuffer.append("&first=1");
        if (z7) {
            stringBuffer.append("&state=fore");
        }
        stringBuffer.append("&os=A");
        stringBuffer.append(Build.VERSION.SDK);
        this.f4703g += stringBuffer.toString();
    }

    private Object a(Object obj, String str) {
        return obj.getClass().getField(str).get(obj);
    }

    private boolean i() {
        if (com.baidu.location.b.a.a().f4439g == 0) {
            return false;
        }
        SharedPreferences sharedPreferences = this.f4698b.getApplicationContext().getSharedPreferences("cuidRelate", 0);
        if (!sharedPreferences.contains("isInstalled")) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            if (!com.baidu.location.e.i.b(this.f4698b, "com.baidu.map.location")) {
                edit.putInt("isInstalled", 0);
                return false;
            }
            edit.putInt("isInstalled", 1);
            edit.apply();
        } else if (sharedPreferences.getInt("isInstalled", -1) == 0) {
            return false;
        }
        return sharedPreferences.getInt("cuidoc", 1) != 0 && (System.currentTimeMillis() - sharedPreferences.getLong("reqtime", 0L)) / 1000 >= sharedPreferences.getLong("cuidfreq", 60L) && com.baidu.location.e.i.b(this.f4698b) >= 2 && a(this.f4701e) && this.f4702f.a() > 3;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void j() {
        String str;
        String a8;
        if (!i()) {
            this.f4716t = false;
            return;
        }
        this.f4716t = true;
        com.baidu.location.c.m mVar = this.f4702f;
        if (mVar != null) {
            if (mVar.a() >= 10) {
                String a9 = com.baidu.location.c.h.a().a(this.f4702f, 9, h(), this.f4716t, com.baidu.location.b.a.a().f4436d);
                if (!TextUtils.isEmpty(a9)) {
                    str = com.baidu.location.e.i.a(a9.getBytes(), false);
                }
            } else {
                com.baidu.location.c.h a10 = com.baidu.location.c.h.a();
                com.baidu.location.c.m mVar2 = this.f4702f;
                String a11 = a10.a(mVar2, mVar2.a(), h(), this.f4716t, com.baidu.location.b.a.a().f4436d);
                if (!TextUtils.isEmpty(a11)) {
                    str = com.baidu.location.e.i.a(a11.getBytes(), false);
                }
            }
            String a12 = a(k());
            a8 = TextUtils.isEmpty(a12) ? null : com.baidu.location.e.i.a(a12.getBytes(), false);
            if (TextUtils.isEmpty(str)) {
                this.f4707k += "&swf5=" + str;
                this.f4716t = true;
            } else {
                this.f4716t = false;
            }
            if (TextUtils.isEmpty(a8)) {
                this.f4707k += "&hwf5=" + a8;
                this.f4716t = true;
                return;
            }
            return;
        }
        str = null;
        String a122 = a(k());
        if (TextUtils.isEmpty(a122)) {
        }
        if (TextUtils.isEmpty(str)) {
        }
        if (TextUtils.isEmpty(a8)) {
        }
    }

    private List<WifiConfiguration> k() {
        try {
            WifiManager wifiManager = this.f4701e;
            if (wifiManager != null) {
                return wifiManager.getConfiguredNetworks();
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public String b() {
        try {
            return a(15);
        } catch (Exception unused) {
            return null;
        }
    }

    public void e() {
        com.baidu.location.c.h.a().c();
    }

    public String g() {
        WifiInfo connectionInfo;
        if (this.f4701e == null) {
            return null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.f4715s > 1000 && (connectionInfo = this.f4701e.getConnectionInfo()) != null) {
            this.f4714r = connectionInfo.getBSSID();
            this.f4715s = currentTimeMillis;
        }
        return this.f4714r;
    }

    public String h() {
        try {
            String g8 = g();
            String replace = g8 != null ? g8.replace(":", "") : null;
            if (replace == null || replace.length() == 12) {
                return new String(replace);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00af A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private String a(int i8) {
        String str;
        String str2;
        com.baidu.location.c.b bVar;
        try {
            com.baidu.location.c.b a8 = com.baidu.location.c.h.a().a(this.f4700d, this.f4699c);
            this.f4700d = a8;
            str = (a8 == null || !a8.b()) ? null : com.baidu.location.c.h.a().b(this.f4700d);
            try {
                if (!TextUtils.isEmpty(str) && (bVar = this.f4700d) != null && bVar.f4995n != null) {
                    str = str + this.f4700d.f4995n;
                }
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            str = null;
        }
        try {
            this.f4702f = null;
        } catch (Exception unused3) {
        }
        if (a(this.f4701e) && this.f4705i.priority != 4) {
            this.f4702f = new com.baidu.location.c.m(this.f4701e.getScanResults(), 0L);
            str2 = com.baidu.location.c.h.a().a(this.f4702f, i8, h(), this.f4716t, com.baidu.location.b.a.a().f4436d);
            try {
                LocationClientOption locationClientOption = this.f4705i;
                if (locationClientOption != null && locationClientOption.isOnceLocation()) {
                    this.f4701e.startScan();
                }
            } catch (Exception unused4) {
            }
            if (str != null && str2 == null) {
                this.f4707k = null;
                return null;
            }
            if (str2 != null) {
                if (str == null) {
                    str = str2;
                } else {
                    str = str + str2;
                }
            }
            if (str != null) {
                return null;
            }
            this.f4707k = str;
            if (this.f4703g != null) {
                this.f4707k += this.f4703g;
            }
            j();
            return str + this.f4703g;
        }
        str2 = null;
        if (str != null) {
        }
        if (str2 != null) {
        }
        if (str != null) {
        }
    }

    public void c() {
        if (this.f4707k == null) {
            int g8 = com.baidu.location.e.i.g(this.f4698b);
            int i8 = g8 == -1 ? 69 : g8 == -2 ? 70 : g8 == 0 ? 71 : 62;
            if (!a(this.f4705i)) {
                b(i8);
                return;
            }
        }
        if (a(this.f4705i)) {
            com.baidu.location.c.e a8 = com.baidu.location.c.e.a();
            String b8 = a8.b(a8.c());
            com.baidu.location.c.e.a().b();
            if (b8 == null) {
                b(62);
                return;
            }
            this.f4707k = b8 + this.f4703g + "&per_c=1";
        }
        if (this.f4712p) {
            if (this.f4698b != null) {
                g.a().a(this.f4698b);
                this.f4707k += g.a().b();
            }
            String b9 = com.baidu.location.a.a.a().b();
            if (b9 != null) {
                this.f4707k += "&ak=" + b9 + "&aks=lbs_locsdk";
            }
            String str = this.f4707k + "&cnloc=" + n.a().b();
            this.f4707k = str;
            this.f4713q.a(str);
        }
    }

    public void d() {
        if ((this.f4701e.isWifiEnabled() || this.f4701e.isScanAlwaysAvailable()) && this.f4705i.priority != 4) {
            com.baidu.location.c.h.a().a(0);
        }
        if (com.baidu.location.e.i.a(this.f4698b, "android.permission.ACCESS_FINE_LOCATION") == 1) {
            com.baidu.location.c.h.a().f();
        }
    }

    public void f() {
        com.baidu.location.c.h.a().d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i8) {
        LocationClientOption locationClientOption = this.f4705i;
        if (locationClientOption == null || !locationClientOption.isOnceLocation()) {
            return;
        }
        BDLocation bDLocation = new BDLocation();
        bDLocation.setLocType(i8);
        bDLocation.setLocationID(Jni.en1(this.f4710n + ";" + this.f4711o + ";" + new SimpleDateFormat(cn.hutool.core.date.d.NORM_DATETIME_PATTERN, Locale.US).format(new Date(System.currentTimeMillis()))));
        b bVar = this.f4706j;
        if (bVar != null) {
            bVar.onReceiveLocation(bDLocation);
        }
    }

    private String a(List<WifiConfiguration> list) {
        ArrayList<d> arrayList;
        int i8;
        int i9 = 0;
        if (list == null || list.size() <= 0) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            for (WifiConfiguration wifiConfiguration : list) {
                String str = wifiConfiguration.SSID;
                try {
                    i8 = ((Integer) a(wifiConfiguration, "numAssociation")).intValue();
                } catch (Throwable unused) {
                    i8 = 0;
                }
                if (i8 > 0 && !TextUtils.isEmpty(str)) {
                    arrayList.add(new d(str, i8));
                }
            }
        }
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        if (arrayList.size() > 1) {
            Collections.sort(arrayList, new a());
        }
        StringBuffer stringBuffer = new StringBuffer(200);
        for (d dVar : arrayList) {
            stringBuffer.append(dVar.f4728a);
            stringBuffer.append(SystemInfoUtil.COMMA);
            stringBuffer.append(dVar.f4729b);
            stringBuffer.append(b5.b.VERTICAL);
            i9++;
            if (i9 == 4) {
                break;
            }
        }
        if (arrayList.size() >= 5) {
            stringBuffer.append(((d) arrayList.get(4)).f4728a);
            stringBuffer.append(SystemInfoUtil.COMMA);
            stringBuffer.append(((d) arrayList.get(4)).f4729b);
        }
        return stringBuffer.toString();
    }

    public void a() {
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        String[] split;
        try {
            JSONObject jSONObject = new JSONObject(str).getJSONObject(FirebaseAnalytics.Param.CONTENT);
            String string = jSONObject.has("ideocfre") ? jSONObject.getString("ideocfre") : null;
            if (TextUtils.isEmpty(string) || !string.contains(b5.b.VERTICAL) || (split = string.split("\\|")) == null || split.length < 2) {
                return;
            }
            int parseInt = Integer.parseInt(split[0]);
            long parseLong = Long.parseLong(split[1]);
            SharedPreferences.Editor edit = this.f4698b.getSharedPreferences("cuidRelate", 0).edit();
            edit.putInt("cuidoc", parseInt);
            edit.putLong("cuidfreq", parseLong);
            edit.apply();
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public static boolean a(WifiManager wifiManager) {
        if (!wifiManager.isWifiEnabled()) {
            if (!wifiManager.isScanAlwaysAvailable()) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(LocationClientOption locationClientOption) {
        return locationClientOption != null && locationClientOption.isOnceLocation() && com.baidu.location.e.i.h(this.f4698b);
    }
}
