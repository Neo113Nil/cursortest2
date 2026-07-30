package com.baidu.location.b;

import android.location.Location;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.baidu.location.Address;
import com.baidu.location.BDLocation;
import com.baidu.location.Poi;
import com.baidu.location.PoiRegion;
import com.baidu.location.b.o;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class r extends o {

    /* renamed from: p, reason: collision with root package name */
    private static r f4851p = null;

    /* renamed from: q, reason: collision with root package name */
    public static String f4852q = "0";

    /* renamed from: r, reason: collision with root package name */
    public static boolean f4853r = false;
    private long J;
    private double N;
    private double O;
    private b S;

    /* renamed from: t, reason: collision with root package name */
    public o.c f4866t;

    /* renamed from: s, reason: collision with root package name */
    private boolean f4865s = true;

    /* renamed from: u, reason: collision with root package name */
    private String f4867u = null;

    /* renamed from: v, reason: collision with root package name */
    private BDLocation f4868v = null;

    /* renamed from: w, reason: collision with root package name */
    private BDLocation f4869w = null;

    /* renamed from: x, reason: collision with root package name */
    private Location f4870x = null;

    /* renamed from: y, reason: collision with root package name */
    private com.baidu.location.c.m f4871y = null;

    /* renamed from: z, reason: collision with root package name */
    private com.baidu.location.c.b f4872z = null;
    private HashSet<String> A = null;
    private com.baidu.location.c.m B = null;
    private com.baidu.location.c.b C = null;
    private boolean D = true;
    private volatile boolean E = false;
    private boolean F = false;
    private long G = 0;
    private long H = 0;
    private Address I = null;
    private String K = null;
    private List<Poi> L = null;
    private PoiRegion M = null;
    private boolean P = false;
    private long Q = 0;
    private long R = 0;
    private boolean T = false;
    private boolean U = false;
    private boolean V = true;
    public final Handler W = new o.b();
    private boolean X = false;
    private boolean Y = false;
    private c Z = null;

    /* renamed from: a0, reason: collision with root package name */
    private boolean f4854a0 = false;

    /* renamed from: b0, reason: collision with root package name */
    private int f4855b0 = 0;

    /* renamed from: c0, reason: collision with root package name */
    private long f4856c0 = 0;

    /* renamed from: d0, reason: collision with root package name */
    private boolean f4857d0 = false;

    /* renamed from: e0, reason: collision with root package name */
    private String f4858e0 = null;

    /* renamed from: f0, reason: collision with root package name */
    private boolean f4859f0 = false;

    /* renamed from: g0, reason: collision with root package name */
    private boolean f4860g0 = false;

    /* renamed from: h0, reason: collision with root package name */
    private boolean f4861h0 = false;

    /* renamed from: i0, reason: collision with root package name */
    private long f4862i0 = 0;

    /* renamed from: j0, reason: collision with root package name */
    private Address f4863j0 = null;

    /* renamed from: k0, reason: collision with root package name */
    private boolean f4864k0 = true;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            r.this.g(null);
        }
    }

    private class b implements Runnable {
    }

    private class c implements Runnable {
        private c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (r.this.f4854a0) {
                r.this.f4854a0 = false;
            }
            if (r.this.F) {
                r.this.F = false;
                r.this.h(null);
            }
        }

        /* synthetic */ c(r rVar, a aVar) {
            this();
        }
    }

    private r() {
        this.f4866t = null;
        this.f4866t = new o.c();
        this.f4810h = new o.a();
    }

    public static synchronized r c() {
        r rVar;
        synchronized (r.class) {
            try {
                if (f4851p == null) {
                    f4851p = new r();
                }
                rVar = f4851p;
            } catch (Throwable th) {
                throw th;
            }
        }
        return rVar;
    }

    private void l() {
        try {
            String str = null;
            String a8 = u.a().a("FirstLocAddr", (String) null);
            if (a8 != null) {
                String[] split = new String(Base64.decode(a8.getBytes(), 0)).split("_");
                if (split.length == 2) {
                    this.f4862i0 = Long.parseLong(split[0]);
                    str = split[1];
                }
                if (str != null) {
                    String[] split2 = str.split(";");
                    if (split2.length == 11) {
                        this.f4863j0 = new Address.Builder().country(split2[0]).countryCode(split2[1]).province(split2[2]).city(split2[3]).cityCode(split2[4]).district(split2[5]).street(split2[6]).streetNumber(split2[7]).adcode(split2[8]).town(split2[9]).townCode(split2[10]).build();
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    private String[] m() {
        boolean z7;
        h a8;
        int i8;
        String[] strArr = {"", "Location failed beacuse we can not get any loc information!"};
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("&apl=");
        int a9 = com.baidu.location.e.i.a(com.baidu.location.f.getServiceContext());
        String str = "Location failed beacuse we can not get any loc information in airplane mode, you can turn it off and try again!!";
        if (a9 == 1) {
            strArr[1] = "Location failed beacuse we can not get any loc information in airplane mode, you can turn it off and try again!!";
        }
        stringBuffer.append(a9);
        String d8 = com.baidu.location.e.i.d(com.baidu.location.f.getServiceContext());
        if (d8.contains("per=0|0|")) {
            strArr[1] = "Location failed beacuse we can not get any loc information without any location permission!";
        }
        stringBuffer.append(d8);
        if (Build.VERSION.SDK_INT >= 23) {
            stringBuffer.append("&loc=");
            int b8 = com.baidu.location.e.i.b(com.baidu.location.f.getServiceContext());
            if (b8 == 0) {
                strArr[1] = "Location failed beacuse we can not get any loc information with the phone loc mode is off, you can turn it on and try again!";
                z7 = true;
            } else {
                z7 = false;
            }
            stringBuffer.append(b8);
        } else {
            z7 = false;
        }
        stringBuffer.append("&lmd=");
        int b9 = com.baidu.location.e.i.b(com.baidu.location.f.getServiceContext());
        if (b9 >= 0) {
            stringBuffer.append(b9);
        }
        String h8 = com.baidu.location.c.h.a().h();
        String n8 = com.baidu.location.c.h.a().n();
        stringBuffer.append(n8);
        stringBuffer.append(h8);
        stringBuffer.append(com.baidu.location.e.i.e(com.baidu.location.f.getServiceContext()));
        if (a9 != 1) {
            if (d8.contains("per=0|0|")) {
                h.a().a(62, 4, "Location failed beacuse we can not get any loc information without any location permission!");
            } else if (z7) {
                h.a().a(62, 5, "Location failed beacuse we can not get any loc information with the phone loc mode is off, you can turn it on and try again!");
            } else if (h8 != null && n8 != null && h8.equals("&sim=1") && !n8.equals("&wifio=1")) {
                a8 = h.a();
                i8 = 6;
                str = "Location failed beacuse we can not get any loc information , you can insert a sim card or open wifi and try again!";
            } else if (!com.baidu.location.e.i.h(com.baidu.location.f.getServiceContext())) {
                h.a().a(62, 9, "Location failed beacuse we can not get any loc information!");
            }
            strArr[0] = stringBuffer.toString();
            return strArr;
        }
        a8 = h.a();
        i8 = 7;
        a8.a(62, i8, str);
        strArr[0] = stringBuffer.toString();
        return strArr;
    }

    private void n() {
        this.E = false;
        this.U = false;
        this.V = false;
        this.P = false;
        o();
        if (this.f4864k0) {
            this.f4864k0 = false;
        }
    }

    private void o() {
        if (this.f4868v == null || !com.baidu.location.c.h.a().l()) {
            return;
        }
        com.baidu.location.b.b.a().d();
    }

    public Address a(BDLocation bDLocation) {
        Address build;
        if (com.baidu.location.e.i.f5261d.equals(TtmlNode.COMBINE_ALL) || com.baidu.location.e.i.f5265f || com.baidu.location.e.i.f5269h) {
            float[] fArr = new float[2];
            Location.distanceBetween(this.O, this.N, bDLocation.getLatitude(), bDLocation.getLongitude(), fArr);
            float f8 = fArr[0];
            if (f8 >= 100.0d) {
                if (this.I == null) {
                    if (System.currentTimeMillis() - this.f4862i0 < C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS) {
                        build = this.f4863j0;
                    }
                    build = null;
                } else {
                    if (f8 < 1000.0d) {
                        build = new Address.Builder().country(this.I.country).countryCode(this.I.countryCode).province(this.I.province).city(this.I.city).cityCode(this.I.cityCode).district(this.I.district).adcode(this.I.adcode).town(this.I.town).townCode(this.I.townCode).build();
                    }
                    build = null;
                }
                this.K = null;
                this.L = null;
                this.M = null;
                this.P = true;
                this.W.post(new a());
                return build;
            }
            Address address = this.I;
            if (address != null) {
                return address;
            }
        }
        return null;
    }

    public void b(Message message) {
        if (this.X) {
            c(message);
        }
    }

    public void d() {
        this.D = true;
        this.E = false;
        this.X = true;
        l();
    }

    public void e() {
        this.E = false;
        this.F = false;
        this.U = false;
        this.V = true;
        k();
        this.X = false;
    }

    public String f() {
        return this.K;
    }

    public List<Poi> g() {
        return this.L;
    }

    public PoiRegion h() {
        return this.M;
    }

    public void i() {
        if (this.F) {
            h(null);
            this.F = false;
        }
    }

    public boolean j() {
        return this.f4861h0;
    }

    public void k() {
        this.f4868v = null;
    }

    private void c(Message message) {
        if (!com.baidu.location.e.i.c(com.baidu.location.f.getServiceContext())) {
            BDLocation bDLocation = new BDLocation();
            bDLocation.setLocType(62);
            d.a().a(bDLocation);
            return;
        }
        if (com.baidu.location.e.i.b()) {
            Log.d("baidu_location_service", "isInforbiddenTime on request location ...");
        }
        if (message.getData().getBoolean("isWaitingLocTag", false)) {
            f4853r = true;
        }
        com.baidu.location.c.e.a().a(com.baidu.location.f.getServiceContext());
        int d8 = d.a().d(message);
        if (d8 == 1) {
            d(message);
            return;
        }
        if (d8 == 2) {
            if (com.baidu.location.c.f.a().j()) {
                e(message);
            }
        } else {
            if (d8 != 3 && d8 != 4) {
                throw new IllegalArgumentException(String.format("this type %d is illegal", Integer.valueOf(d8)));
            }
            g(message);
        }
    }

    private void d(Message message) {
        if (com.baidu.location.c.f.a().j()) {
            e(message);
            w.a().c();
        } else {
            g(message);
            w.a().b();
        }
    }

    private void e(Message message) {
        BDLocation bDLocation = new BDLocation(com.baidu.location.c.f.a().f());
        Location g8 = com.baidu.location.c.f.a().g();
        if (g8 != null && BDLocation.BDLOCATION_GNSS_PROVIDER_FROM_BAIDU_BEIDOU.equals(g8.getProvider())) {
            bDLocation.setGnssProvider(BDLocation.BDLOCATION_GNSS_PROVIDER_FROM_BAIDU_BEIDOU);
        }
        if (g8 != null) {
            bDLocation.setExtrainfo(g8.getExtras());
        }
        if (com.baidu.location.e.i.f5261d.equals(TtmlNode.COMBINE_ALL) || com.baidu.location.e.i.f5265f || com.baidu.location.e.i.f5269h) {
            float[] fArr = new float[2];
            Location.distanceBetween(this.O, this.N, bDLocation.getLatitude(), bDLocation.getLongitude(), fArr);
            if (fArr[0] < 100.0f) {
                Address address = this.I;
                if (address != null) {
                    bDLocation.setAddr(address);
                }
                String str = this.K;
                if (str != null) {
                    bDLocation.setLocationDescribe(str);
                }
                List<Poi> list = this.L;
                if (list != null) {
                    bDLocation.setPoiList(list);
                }
                PoiRegion poiRegion = this.M;
                if (poiRegion != null) {
                    bDLocation.setPoiRegion(poiRegion);
                }
            } else {
                this.P = true;
                g(null);
            }
        }
        this.f4868v = bDLocation;
        this.f4869w = null;
        d(bDLocation);
    }

    private void f(Message message) {
        c cVar;
        if (!com.baidu.location.c.h.a().k()) {
            h(message);
            return;
        }
        this.F = true;
        if (this.Z == null) {
            this.Z = new c(this, null);
        }
        if (this.f4854a0 && (cVar = this.Z) != null) {
            this.W.removeCallbacks(cVar);
        }
        this.W.postDelayed(this.Z, 3500L);
        this.f4854a0 = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(Message message) {
        this.f4855b0 = 0;
        if (!this.D) {
            f(message);
            this.R = SystemClock.uptimeMillis();
            return;
        }
        this.f4855b0 = 1;
        this.R = SystemClock.uptimeMillis();
        if (com.baidu.location.c.h.a().b(com.baidu.location.e.i.D)) {
            f(message);
        } else {
            h(message);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d0, code lost:
    
        if (r11 <= 0) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void h(Message message) {
        Location location;
        boolean z7;
        String str;
        long j8;
        long currentTimeMillis = System.currentTimeMillis() - this.G;
        if (!this.E || currentTimeMillis > 12000) {
            if (System.currentTimeMillis() - this.G > 0 && System.currentTimeMillis() - this.G < 1000) {
                if (this.f4868v != null) {
                    d.a().a(this.f4868v);
                }
                n();
                return;
            }
            this.E = true;
            this.f4865s = a(this.f4872z, this.A);
            boolean a8 = a(this.f4871y);
            boolean h8 = com.baidu.location.e.i.h(com.baidu.location.f.getServiceContext());
            if (h8) {
                location = com.baidu.location.c.e.a().c();
                z7 = com.baidu.location.c.e.a().a(this.f4870x, location);
            } else {
                location = null;
                z7 = false;
            }
            if (!a8 && !this.f4865s && this.f4868v != null && !this.P && !com.baidu.location.c.h.a().m() && !z7) {
                if (this.f4869w != null && System.currentTimeMillis() - this.H > 30000) {
                    this.f4868v = this.f4869w;
                    this.f4869w = null;
                }
                if (w.a().d()) {
                    this.f4868v.setDirection(w.a().e());
                }
                if (this.f4868v.getLocType() == 62) {
                    j8 = System.currentTimeMillis() - this.f4856c0;
                }
                j8 = 0;
                if (this.f4868v.getLocType() == 61 || this.f4868v.getLocType() == 161 || this.f4868v.getLocType() == 160 || (this.f4868v.getLocType() == 62 && j8 < C.DEFAULT_SEEK_FORWARD_INCREMENT_MS)) {
                    d.a().a(this.f4868v);
                    n();
                    return;
                }
            }
            this.G = System.currentTimeMillis();
            String a9 = a((String) null);
            this.Y = false;
            if (a9 == null) {
                this.Y = true;
                this.f4856c0 = System.currentTimeMillis();
                String[] strArr = new String[2];
                try {
                    strArr = m();
                } catch (Exception e8) {
                    e8.printStackTrace();
                }
                long currentTimeMillis2 = System.currentTimeMillis();
                if (currentTimeMillis2 - this.Q > 60000) {
                    this.Q = currentTimeMillis2;
                }
                String o8 = com.baidu.location.c.h.a().o();
                if (o8 != null) {
                    str = o8 + b() + strArr[0];
                } else {
                    str = "" + b() + strArr[0];
                }
                if (this.f4805c != null && com.baidu.location.c.h.a().b(this.f4805c) != null) {
                    str = com.baidu.location.c.h.a().b(this.f4805c) + str;
                }
                String a10 = com.baidu.location.e.c.a().a(true);
                if (a10 != null) {
                    str = str + a10;
                }
            } else {
                str = a9 + com.baidu.location.e.i.d(com.baidu.location.f.getServiceContext());
            }
            String b8 = com.baidu.location.a.a.a().b();
            if (b8 != null) {
                str = str + "&ak=" + b8 + "&aks=lbs_locsdk";
            }
            if (h8) {
                String b9 = com.baidu.location.c.e.a().b(location);
                if (b9 != null) {
                    str = str + b9 + "&per_c=1";
                }
                this.f4870x = location;
            }
            if (this.f4867u != null) {
                str = str + this.f4867u;
                this.f4867u = null;
            }
            String str2 = (str + g.a().c()) + "&cnloc=" + n.a().b();
            long b10 = this.f4804b != null ? com.baidu.location.c.h.a().b(this.f4804b) : 0L;
            if (str2.length() > com.baidu.location.e.i.f5256a0) {
                String[] split = str2.split("&cl_list=");
                if (split.length == 2) {
                    String[] split2 = split[1].split("&", 2);
                    if (split2.length == 2) {
                        str2 = split[0] + "&cl_list=null&" + split2[1];
                    } else {
                        str2 = split[0] + "&cl_list=null";
                    }
                }
            }
            this.f4866t.a(str2, b10);
            this.f4872z = this.f4805c;
            this.A = this.f4806d;
            this.f4871y = this.f4804b;
            if (this.D) {
                this.D = false;
                if (com.baidu.location.c.h.a().l() && message != null) {
                    d.a().e(message);
                }
            }
            int i8 = this.f4855b0;
            if (i8 > 0) {
                if (i8 == 2) {
                    com.baidu.location.c.h.a().k();
                }
                this.f4855b0 = 0;
            }
        }
    }

    @Override // com.baidu.location.b.o
    public void a() {
        b bVar = this.S;
        if (bVar != null && this.T) {
            this.T = false;
            this.W.removeCallbacks(bVar);
        }
        if (com.baidu.location.c.f.a().j()) {
            BDLocation bDLocation = new BDLocation(com.baidu.location.c.f.a().f());
            Location g8 = com.baidu.location.c.f.a().g();
            if (g8 != null && BDLocation.BDLOCATION_GNSS_PROVIDER_FROM_BAIDU_BEIDOU.equals(g8.getProvider())) {
                bDLocation.setGnssProvider(BDLocation.BDLOCATION_GNSS_PROVIDER_FROM_BAIDU_BEIDOU);
            }
            if (g8 != null) {
                bDLocation.setExtrainfo(g8.getExtras());
            }
            if (com.baidu.location.e.i.f5261d.equals(TtmlNode.COMBINE_ALL) || com.baidu.location.e.i.f5265f || com.baidu.location.e.i.f5269h) {
                float[] fArr = new float[2];
                Location.distanceBetween(this.O, this.N, bDLocation.getLatitude(), bDLocation.getLongitude(), fArr);
                if (fArr[0] < 100.0f) {
                    Address address = this.I;
                    if (address != null) {
                        bDLocation.setAddr(address);
                    }
                    String str = this.K;
                    if (str != null) {
                        bDLocation.setLocationDescribe(str);
                    }
                    List<Poi> list = this.L;
                    if (list != null) {
                        bDLocation.setPoiList(list);
                    }
                    PoiRegion poiRegion = this.M;
                    if (poiRegion != null) {
                        bDLocation.setPoiRegion(poiRegion);
                    }
                }
            }
            d.a().a(bDLocation);
        } else {
            if (this.U) {
                n();
                return;
            }
            if (this.f4865s || this.f4868v == null) {
                BDLocation bDLocation2 = new BDLocation();
                bDLocation2.setLocType(63);
                this.f4868v = null;
                d.a().a(bDLocation2);
            } else {
                d.a().a(this.f4868v);
            }
            this.f4869w = null;
        }
        n();
    }

    public void b(BDLocation bDLocation) {
        h a8;
        int i8;
        String str;
        String n8;
        BDLocation bDLocation2;
        String str2;
        new BDLocation(bDLocation);
        if (bDLocation.hasAddr()) {
            Address address = bDLocation.getAddress();
            this.I = address;
            if (address != null && (str2 = address.cityCode) != null) {
                f4852q = str2;
                this.J = System.currentTimeMillis();
            }
            this.N = bDLocation.getLongitude();
            this.O = bDLocation.getLatitude();
        }
        if (bDLocation.getLocationDescribe() != null) {
            this.K = bDLocation.getLocationDescribe();
            this.N = bDLocation.getLongitude();
            this.O = bDLocation.getLatitude();
        }
        if (bDLocation.getPoiList() != null) {
            this.L = bDLocation.getPoiList();
            this.N = bDLocation.getLongitude();
            this.O = bDLocation.getLatitude();
        }
        if (bDLocation.getPoiRegion() != null) {
            this.M = bDLocation.getPoiRegion();
            this.N = bDLocation.getLongitude();
            this.O = bDLocation.getLatitude();
        }
        boolean z7 = false;
        if (com.baidu.location.c.f.a().j()) {
            BDLocation bDLocation3 = new BDLocation(com.baidu.location.c.f.a().f());
            Location g8 = com.baidu.location.c.f.a().g();
            if (g8 != null && BDLocation.BDLOCATION_GNSS_PROVIDER_FROM_BAIDU_BEIDOU.equals(g8.getProvider())) {
                bDLocation3.setGnssProvider(BDLocation.BDLOCATION_GNSS_PROVIDER_FROM_BAIDU_BEIDOU);
            }
            if (g8 != null) {
                bDLocation3.setExtrainfo(g8.getExtras());
            }
            if (com.baidu.location.e.i.f5261d.equals(TtmlNode.COMBINE_ALL) || com.baidu.location.e.i.f5265f || com.baidu.location.e.i.f5269h) {
                float[] fArr = new float[2];
                Location.distanceBetween(this.O, this.N, bDLocation3.getLatitude(), bDLocation3.getLongitude(), fArr);
                if (fArr[0] < 100.0f) {
                    Address address2 = this.I;
                    if (address2 != null) {
                        bDLocation3.setAddr(address2);
                    }
                    String str3 = this.K;
                    if (str3 != null) {
                        bDLocation3.setLocationDescribe(str3);
                    }
                    List<Poi> list = this.L;
                    if (list != null) {
                        bDLocation3.setPoiList(list);
                    }
                    PoiRegion poiRegion = this.M;
                    if (poiRegion != null) {
                        bDLocation3.setPoiRegion(poiRegion);
                    }
                }
            }
            d(bDLocation3);
        } else {
            if (this.U) {
                float[] fArr2 = new float[2];
                BDLocation bDLocation4 = this.f4868v;
                if (bDLocation4 != null) {
                    Location.distanceBetween(bDLocation4.getLatitude(), this.f4868v.getLongitude(), bDLocation.getLatitude(), bDLocation.getLongitude(), fArr2);
                }
                if (fArr2[0] <= 10.0f) {
                    if (bDLocation.getUserIndoorState() > -1) {
                        this.f4868v = bDLocation;
                        d.a().a(bDLocation);
                    }
                    n();
                    return;
                }
                this.f4868v = bDLocation;
                if (!this.V) {
                    this.V = false;
                    d.a().a(bDLocation);
                }
                n();
                return;
            }
            if (bDLocation.getLocType() == 167) {
                h.a().a(BDLocation.TypeServerError, 8, "NetWork location failed because baidu location service can not caculate the location!");
            } else if (bDLocation.getLocType() == 161) {
                int b8 = com.baidu.location.e.i.b(com.baidu.location.f.getServiceContext());
                if (b8 == 0 || b8 == 2) {
                    h.a().a(161, 1, "NetWork location successful, open gps will be better!");
                } else if (bDLocation.getRadius() >= 100.0f && bDLocation.getNetworkLocationType() != null && bDLocation.getNetworkLocationType().equals("cl") && (n8 = com.baidu.location.c.h.a().n()) != null && !n8.equals("&wifio=1")) {
                    h.a().a(161, 2, "NetWork location successful, open wifi will be better!");
                }
            } else {
                int locType = bDLocation.getLocType();
                int i9 = BDLocation.TypeCoarseLocation;
                if (locType == 160) {
                    a8 = h.a();
                    i8 = 10;
                    str = "Coarse location successful, open Accurately locate permission will be better!";
                } else if (com.baidu.location.e.i.h(com.baidu.location.f.getServiceContext())) {
                    i9 = 62;
                    if (bDLocation.getLocType() == 62) {
                        a8 = h.a();
                        i8 = 11;
                        str = "Coarse location failed because we can not get any loc result";
                    }
                }
                a8.a(i9, i8, str);
            }
            this.f4869w = null;
            if (bDLocation.getLocType() == 161 && "cl".equals(bDLocation.getNetworkLocationType()) && (bDLocation2 = this.f4868v) != null && bDLocation2.getLocType() == 161 && com.crrepa.b1.g.f10873s.equals(this.f4868v.getNetworkLocationType()) && System.currentTimeMillis() - this.H < 30000) {
                this.f4869w = bDLocation;
                z7 = true;
            }
            d a9 = d.a();
            if (z7) {
                a9.a(this.f4868v);
            } else {
                a9.a(bDLocation);
                this.H = System.currentTimeMillis();
            }
            if (!com.baidu.location.e.i.a(bDLocation)) {
                this.f4868v = null;
            } else if (!z7) {
                this.f4868v = bDLocation;
            }
            int a10 = com.baidu.location.e.i.a(o.f4803a, "ssid\":\"", "\"");
            if (a10 == Integer.MIN_VALUE || this.f4871y == null) {
                this.f4867u = null;
            } else {
                this.f4867u = com.baidu.location.c.h.a().a(a10, this.f4871y);
            }
            com.baidu.location.c.h.a().l();
        }
        n();
    }

    private void d(BDLocation bDLocation) {
        if (com.baidu.location.e.i.f5275k || bDLocation.getMockGpsStrategy() <= 0) {
            d.a().a(bDLocation);
        } else {
            d.a().c(bDLocation);
        }
    }

    private void e(BDLocation bDLocation) {
        this.f4861h0 = bDLocation != null && bDLocation.isInIndoorPark();
    }

    @Override // com.baidu.location.b.o
    public void a(Message message) {
        b bVar = this.S;
        if (bVar != null && this.T) {
            this.T = false;
            this.W.removeCallbacks(bVar);
        }
        BDLocation bDLocation = (BDLocation) message.obj;
        int i8 = message.arg1;
        if (bDLocation != null && bDLocation.getLocType() == 161) {
            b(bDLocation.getTraffic());
            e(bDLocation);
            if (i8 == 1) {
                g.a().a(bDLocation, "gcj02", null);
            }
        }
        if (bDLocation != null && bDLocation.getLocType() == 167 && this.Y) {
            bDLocation.setLocType(62);
        }
        if (!this.f4857d0 && bDLocation != null && bDLocation.getLocType() == 161) {
            String cityCode = bDLocation.getCityCode();
            if (!TextUtils.isEmpty(cityCode)) {
                u.a().b("mapcity", cityCode);
                e.b().a(cityCode);
                this.f4857d0 = true;
            }
        }
        if (bDLocation != null) {
            n.a().a(bDLocation);
        }
        b(bDLocation);
    }

    public void c(BDLocation bDLocation) {
        this.f4868v = new BDLocation(bDLocation);
    }

    private void b(String str) {
        this.f4860g0 = str != null && "subway".equals(str.toLowerCase());
    }

    private boolean a(com.baidu.location.c.b bVar, com.baidu.location.c.b bVar2) {
        if (bVar2 == bVar) {
            return false;
        }
        if (bVar2 == null || bVar == null) {
            return true;
        }
        return !bVar.a(bVar2);
    }

    private boolean a(com.baidu.location.c.b bVar, HashSet<String> hashSet) {
        com.baidu.location.c.b f8 = com.baidu.location.c.h.a().f();
        this.f4805c = f8;
        boolean a8 = a(bVar, f8);
        if (com.baidu.location.e.i.T == 0) {
            return a8;
        }
        boolean z7 = a8 || com.baidu.location.c.h.a().a(bVar, this.f4805c);
        HashSet<String> c8 = com.baidu.location.c.h.a().c(this.f4805c);
        this.f4806d = c8;
        return z7 || a(hashSet, c8);
    }

    private boolean a(com.baidu.location.c.m mVar) {
        com.baidu.location.c.m r8 = com.baidu.location.c.h.a().r();
        this.f4804b = r8;
        if (mVar == r8) {
            return false;
        }
        if (r8 == null || mVar == null) {
            return true;
        }
        return !com.baidu.location.c.h.a().a(this.f4804b, mVar, com.baidu.location.e.i.N);
    }

    private boolean a(HashSet<String> hashSet, HashSet<String> hashSet2) {
        if ((hashSet == null || hashSet.isEmpty()) && (hashSet2 == null || hashSet2.isEmpty())) {
            return false;
        }
        if (hashSet == null || hashSet.isEmpty() || hashSet2 == null || hashSet2.isEmpty()) {
            return true;
        }
        int size = hashSet.size();
        Iterator<String> it = hashSet.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            if (hashSet2.contains(it.next())) {
                i8++;
            }
        }
        return ((float) i8) < ((float) size) * com.baidu.location.e.i.U;
    }
}
