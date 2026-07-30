package com.baidu.location.c;

import android.annotation.TargetApi;
import android.content.Context;
import android.location.GnssMeasurementsEvent;
import android.location.GnssNavigationMessage;
import android.location.GnssStatus;
import android.location.GpsSatellite;
import android.location.GpsStatus;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.location.OnNmeaMessageListener;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.baidu.ar.util.SystemInfoUtil;
import com.baidu.location.BDLocation;
import com.baidu.location.Jni;
import com.google.android.exoplayer2.C;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes2.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private static f f5011a = null;

    /* renamed from: b, reason: collision with root package name */
    private static Location f5012b = null;

    /* renamed from: c, reason: collision with root package name */
    private static int f5013c = -1;

    /* renamed from: d, reason: collision with root package name */
    public static int f5014d = 0;

    /* renamed from: e, reason: collision with root package name */
    private static int f5015e = 0;

    /* renamed from: f, reason: collision with root package name */
    private static int f5016f = 0;

    /* renamed from: g, reason: collision with root package name */
    private static int f5017g = 0;

    /* renamed from: h, reason: collision with root package name */
    private static int f5018h = 0;

    /* renamed from: i, reason: collision with root package name */
    private static int f5019i = 0;

    /* renamed from: j, reason: collision with root package name */
    private static int f5020j = 0;

    /* renamed from: k, reason: collision with root package name */
    private static int f5021k = 0;

    /* renamed from: l, reason: collision with root package name */
    private static int f5022l = 0;

    /* renamed from: m, reason: collision with root package name */
    private static int f5023m = 0;

    /* renamed from: n, reason: collision with root package name */
    private static long f5024n = 0;

    /* renamed from: o, reason: collision with root package name */
    private static String f5025o = null;

    /* renamed from: p, reason: collision with root package name */
    private static double f5026p = 100.0d;

    /* renamed from: q, reason: collision with root package name */
    public static String f5027q = "";

    /* renamed from: r, reason: collision with root package name */
    public static String f5028r = "";

    /* renamed from: s, reason: collision with root package name */
    private static float f5029s = -1.0f;

    /* renamed from: t, reason: collision with root package name */
    private static final Lock f5030t = new ReentrantLock();
    private d A;
    private boolean B;
    private boolean D;
    private b W;

    /* renamed from: q0, reason: collision with root package name */
    private BDLocation f5047q0;

    /* renamed from: u, reason: collision with root package name */
    private Context f5051u;

    /* renamed from: u0, reason: collision with root package name */
    private String f5052u0;

    /* renamed from: w, reason: collision with root package name */
    private Location f5055w;

    /* renamed from: z, reason: collision with root package name */
    private GpsStatus f5061z;

    /* renamed from: v, reason: collision with root package name */
    private LocationManager f5053v = null;

    /* renamed from: x, reason: collision with root package name */
    private g f5057x = null;

    /* renamed from: y, reason: collision with root package name */
    private i f5059y = null;
    private e C = null;
    private GpsStatus.NmeaListener E = null;
    private OnNmeaMessageListener F = null;
    private long G = 0;
    private boolean H = false;
    private boolean I = false;
    private String J = null;
    private boolean K = false;
    private long L = 0;
    private long M = 0;
    private double N = -1.0d;
    private double O = com.github.mikephil.charting.utils.i.DOUBLE_EPSILON;
    private double P = com.github.mikephil.charting.utils.i.DOUBLE_EPSILON;
    private long Q = 0;
    private long R = 0;
    private long S = 0;
    private HandlerC0052f T = null;
    private long U = 0;
    private long V = 0;
    private c X = null;
    public ArrayList<ArrayList<Float>> Y = new ArrayList<>();
    private ArrayList<ArrayList<Float>> Z = new ArrayList<>();

    /* renamed from: a0, reason: collision with root package name */
    private ArrayList<ArrayList<Float>> f5031a0 = new ArrayList<>();

    /* renamed from: b0, reason: collision with root package name */
    private ArrayList<ArrayList<Float>> f5032b0 = new ArrayList<>();

    /* renamed from: c0, reason: collision with root package name */
    private ArrayList<ArrayList<Float>> f5033c0 = new ArrayList<>();

    /* renamed from: d0, reason: collision with root package name */
    private ArrayList<ArrayList<Float>> f5034d0 = new ArrayList<>();

    /* renamed from: e0, reason: collision with root package name */
    private ArrayList<ArrayList<Float>> f5035e0 = new ArrayList<>();

    /* renamed from: f0, reason: collision with root package name */
    private ArrayList<ArrayList<Float>> f5036f0 = new ArrayList<>();

    /* renamed from: g0, reason: collision with root package name */
    private String f5037g0 = null;

    /* renamed from: h0, reason: collision with root package name */
    private long f5038h0 = 0;

    /* renamed from: i0, reason: collision with root package name */
    private ArrayList<Integer> f5039i0 = new ArrayList<>();

    /* renamed from: j0, reason: collision with root package name */
    private final LinkedHashMap<String, Float> f5040j0 = new LinkedHashMap<>();

    /* renamed from: k0, reason: collision with root package name */
    private long f5041k0 = 0;

    /* renamed from: l0, reason: collision with root package name */
    private String f5042l0 = null;

    /* renamed from: m0, reason: collision with root package name */
    private String f5043m0 = null;

    /* renamed from: n0, reason: collision with root package name */
    private long f5044n0 = 0;

    /* renamed from: o0, reason: collision with root package name */
    private long f5045o0 = -1;

    /* renamed from: p0, reason: collision with root package name */
    private long f5046p0 = -1;

    /* renamed from: r0, reason: collision with root package name */
    private boolean f5048r0 = false;

    /* renamed from: s0, reason: collision with root package name */
    private boolean f5049s0 = false;

    /* renamed from: t0, reason: collision with root package name */
    private long f5050t0 = 0;

    /* renamed from: v0, reason: collision with root package name */
    private long f5054v0 = 0;

    /* renamed from: w0, reason: collision with root package name */
    private boolean f5056w0 = false;

    /* renamed from: x0, reason: collision with root package name */
    private boolean f5058x0 = false;

    /* renamed from: y0, reason: collision with root package name */
    private boolean f5060y0 = false;

    /* renamed from: z0, reason: collision with root package name */
    private StringBuilder f5062z0 = new StringBuilder();
    private String A0 = "";
    private long B0 = -1;
    private long C0 = 0;
    private long D0 = 0;
    private boolean E0 = false;
    private long F0 = 0;
    private long G0 = 0;
    private long H0 = 0;
    private long I0 = 0;
    public long J0 = 0;

    class a implements OnNmeaMessageListener {
        a() {
        }

        @Override // android.location.OnNmeaMessageListener
        public void onNmeaMessage(String str, long j8) {
            if (f.this.T != null) {
                f.this.T.sendMessage(f.this.T.obtainMessage(5, str));
            }
        }
    }

    @TargetApi(24)
    private class b extends GnssMeasurementsEvent.Callback {
    }

    @TargetApi(24)
    private class c extends GnssNavigationMessage.Callback {

        /* renamed from: a, reason: collision with root package name */
        public int f5064a;

        private c() {
            this.f5064a = 0;
        }

        @Override // android.location.GnssNavigationMessage.Callback
        public void onGnssNavigationMessageReceived(GnssNavigationMessage gnssNavigationMessage) {
            com.baidu.location.b.b.a().a(gnssNavigationMessage, f.this.S != 0 ? f.this.S : System.currentTimeMillis() / 1000);
        }

        @Override // android.location.GnssNavigationMessage.Callback
        public void onStatusChanged(int i8) {
            this.f5064a = i8;
        }

        /* synthetic */ c(f fVar, a aVar) {
            this();
        }
    }

    @TargetApi(24)
    private class d extends GnssStatus.Callback {
        private d() {
        }

        @Override // android.location.GnssStatus.Callback
        public void onFirstFix(int i8) {
        }

        @Override // android.location.GnssStatus.Callback
        public void onSatelliteStatusChanged(GnssStatus gnssStatus) {
            int satelliteCount;
            int constellationType;
            float azimuthDegrees;
            float elevationDegrees;
            float cn0DbHz;
            boolean usedInFix;
            int svid;
            ArrayList arrayList;
            if (f.this.f5053v == null || gnssStatus == null) {
                return;
            }
            f.this.V = System.currentTimeMillis();
            satelliteCount = gnssStatus.getSatelliteCount();
            f.this.f5033c0.clear();
            f.this.f5034d0.clear();
            f.this.f5035e0.clear();
            f.this.f5036f0.clear();
            int i8 = 0;
            int i9 = 0;
            int i10 = 0;
            for (int i11 = 0; i11 < satelliteCount; i11++) {
                i8++;
                ArrayList arrayList2 = new ArrayList();
                constellationType = gnssStatus.getConstellationType(i11);
                azimuthDegrees = gnssStatus.getAzimuthDegrees(i11);
                arrayList2.add(Float.valueOf(azimuthDegrees));
                elevationDegrees = gnssStatus.getElevationDegrees(i11);
                arrayList2.add(Float.valueOf(elevationDegrees));
                cn0DbHz = gnssStatus.getCn0DbHz(i11);
                arrayList2.add(Float.valueOf(cn0DbHz));
                usedInFix = gnssStatus.usedInFix(i11);
                if (usedInFix) {
                    i9++;
                    arrayList2.add(Float.valueOf(1.0f));
                    if (constellationType == 1) {
                        i10++;
                    }
                } else {
                    arrayList2.add(Float.valueOf(0.0f));
                }
                svid = gnssStatus.getSvid(i11);
                arrayList2.add(Float.valueOf(svid));
                if (constellationType == 1) {
                    arrayList2.add(Float.valueOf(1.0f));
                    arrayList = f.this.f5033c0;
                } else {
                    if (constellationType == 5) {
                        arrayList2.add(Float.valueOf(2.0f));
                        f.this.f5034d0.add(arrayList2);
                        f.this.C0 = System.currentTimeMillis();
                    } else if (constellationType == 3) {
                        arrayList2.add(Float.valueOf(3.0f));
                        arrayList = f.this.f5035e0;
                    } else if (constellationType == 6) {
                        arrayList2.add(Float.valueOf(4.0f));
                        arrayList = f.this.f5036f0;
                    }
                }
                arrayList.add(arrayList2);
            }
            ArrayList arrayList3 = new ArrayList();
            arrayList3.addAll(f.this.f5033c0);
            arrayList3.addAll(f.this.f5034d0);
            arrayList3.addAll(f.this.f5035e0);
            arrayList3.addAll(f.this.f5036f0);
            f.this.b((ArrayList<ArrayList<Float>>) arrayList3);
            f fVar = f.this;
            fVar.Z = fVar.a(true, false, false, false, true, -1.0f);
            f fVar2 = f.this;
            f.f5027q = fVar2.a((ArrayList<ArrayList<Float>>) fVar2.Z);
            f fVar3 = f.this;
            fVar3.f5031a0 = fVar3.a(true, true, true, true, true, -1.0f);
            f fVar4 = f.this;
            fVar4.f5032b0 = fVar4.a(true, true, true, true, false, -1.0f);
            f fVar5 = f.this;
            f.f5028r = fVar5.a((ArrayList<ArrayList<Float>>) fVar5.f5032b0);
            if (com.baidu.location.b.e.b().f4647u2 == 1) {
                com.baidu.location.b.j.a().a(f.this.f5032b0);
            }
            f.f5014d = i9;
            int unused = f.f5015e = i10;
            int unused2 = f.f5023m = i8;
            long unused3 = f.f5024n = System.currentTimeMillis();
            f fVar6 = f.this;
            int unused4 = f.f5016f = fVar6.a((ArrayList<ArrayList<Float>>) fVar6.f5035e0, true, -1.0f).size();
            f fVar7 = f.this;
            int unused5 = f.f5017g = fVar7.a((ArrayList<ArrayList<Float>>) fVar7.f5036f0, true, -1.0f).size();
            f fVar8 = f.this;
            int unused6 = f.f5018h = fVar8.a((ArrayList<ArrayList<Float>>) fVar8.f5034d0, true, -1.0f).size();
            f fVar9 = f.this;
            int unused7 = f.f5019i = fVar9.a((ArrayList<ArrayList<Float>>) fVar9.f5033c0, false, -1.0f).size();
            f fVar10 = f.this;
            int unused8 = f.f5020j = fVar10.a((ArrayList<ArrayList<Float>>) fVar10.f5035e0, false, -1.0f).size();
            f fVar11 = f.this;
            int unused9 = f.f5021k = fVar11.a((ArrayList<ArrayList<Float>>) fVar11.f5036f0, false, -1.0f).size();
            f fVar12 = f.this;
            int unused10 = f.f5022l = fVar12.a((ArrayList<ArrayList<Float>>) fVar12.f5034d0, false, -1.0f).size();
        }

        @Override // android.location.GnssStatus.Callback
        public void onStarted() {
        }

        @Override // android.location.GnssStatus.Callback
        public void onStopped() {
            f.this.e((Location) null);
            f.this.b(false);
            f.f5014d = 0;
            int unused = f.f5015e = 0;
            int unused2 = f.f5016f = 0;
            int unused3 = f.f5017g = 0;
            int unused4 = f.f5018h = 0;
            int unused5 = f.f5019i = 0;
            int unused6 = f.f5020j = 0;
            int unused7 = f.f5021k = 0;
            int unused8 = f.f5022l = 0;
            int unused9 = f.f5023m = 0;
            int unused10 = f.f5013c = -1;
            Location unused11 = f.f5012b = null;
        }

        /* synthetic */ d(f fVar, a aVar) {
            this();
        }
    }

    private class e implements GpsStatus.Listener {

        /* renamed from: a, reason: collision with root package name */
        private long f5067a;

        private e() {
            this.f5067a = 0L;
        }

        @Override // android.location.GpsStatus.Listener
        public void onGpsStatusChanged(int i8) {
            ArrayList arrayList;
            if (f.this.f5053v == null) {
                return;
            }
            int i9 = 0;
            if (i8 == 2) {
                f.this.e((Location) null);
                f.this.b(false);
                f.f5014d = 0;
                int unused = f.f5015e = 0;
                int unused2 = f.f5016f = 0;
                int unused3 = f.f5017g = 0;
                int unused4 = f.f5018h = 0;
                return;
            }
            if (i8 == 4 && f.this.I) {
                try {
                    if (f.this.f5061z == null) {
                        f fVar = f.this;
                        fVar.f5061z = fVar.f5053v.getGpsStatus(null);
                    } else {
                        f.this.f5053v.getGpsStatus(f.this.f5061z);
                    }
                    f.this.V = System.currentTimeMillis();
                    f.this.f5033c0.clear();
                    f.this.f5034d0.clear();
                    f.this.f5035e0.clear();
                    f.this.f5036f0.clear();
                    int i10 = 0;
                    for (GpsSatellite gpsSatellite : f.this.f5061z.getSatellites()) {
                        ArrayList arrayList2 = new ArrayList();
                        int prn = gpsSatellite.getPrn();
                        arrayList2.add(Float.valueOf(gpsSatellite.getAzimuth()));
                        arrayList2.add(Float.valueOf(gpsSatellite.getElevation()));
                        arrayList2.add(Float.valueOf(gpsSatellite.getSnr()));
                        if (gpsSatellite.usedInFix()) {
                            i9++;
                            arrayList2.add(Float.valueOf(1.0f));
                            if (prn >= 1 && prn <= 32) {
                                i10++;
                            }
                        } else {
                            arrayList2.add(Float.valueOf(0.0f));
                        }
                        arrayList2.add(Float.valueOf(prn));
                        if (prn >= 1 && prn <= 32) {
                            arrayList2.add(Float.valueOf(1.0f));
                            arrayList = f.this.f5033c0;
                        } else if (prn >= 201 && prn <= 261) {
                            arrayList2.add(Float.valueOf(2.0f));
                            arrayList = f.this.f5034d0;
                        } else if (prn >= 65 && prn <= 96) {
                            arrayList2.add(Float.valueOf(3.0f));
                            arrayList = f.this.f5035e0;
                        } else if (prn >= 301 && prn <= 336) {
                            arrayList2.add(Float.valueOf(4.0f));
                            arrayList = f.this.f5036f0;
                        }
                        arrayList.add(arrayList2);
                    }
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.addAll(f.this.f5033c0);
                    arrayList3.addAll(f.this.f5034d0);
                    arrayList3.addAll(f.this.f5035e0);
                    arrayList3.addAll(f.this.f5036f0);
                    f.this.b((ArrayList<ArrayList<Float>>) arrayList3);
                    f fVar2 = f.this;
                    fVar2.Z = fVar2.a(true, false, false, false, true, -1.0f);
                    f fVar3 = f.this;
                    f.f5027q = fVar3.a((ArrayList<ArrayList<Float>>) fVar3.Z);
                    f fVar4 = f.this;
                    fVar4.f5031a0 = fVar4.a(true, true, true, true, true, -1.0f);
                    f fVar5 = f.this;
                    fVar5.f5032b0 = fVar5.a(true, true, true, true, false, -1.0f);
                    f fVar6 = f.this;
                    f.f5028r = fVar6.a((ArrayList<ArrayList<Float>>) fVar6.f5032b0);
                    if (com.baidu.location.b.e.b().f4647u2 == 1) {
                        com.baidu.location.b.j.a().a(f.this.f5032b0);
                    }
                    if (i10 > 0) {
                        int unused5 = f.f5015e = i10;
                    }
                    if (i9 <= 0) {
                        if (System.currentTimeMillis() - this.f5067a > 100) {
                        }
                        long unused6 = f.f5024n = System.currentTimeMillis();
                    }
                    this.f5067a = System.currentTimeMillis();
                    f.f5014d = i9;
                    long unused62 = f.f5024n = System.currentTimeMillis();
                } catch (Exception unused7) {
                }
            }
        }

        /* synthetic */ e(f fVar, a aVar) {
            this();
        }
    }

    /* renamed from: com.baidu.location.c.f$f, reason: collision with other inner class name */
    private static class HandlerC0052f extends Handler {

        /* renamed from: a, reason: collision with root package name */
        WeakReference<f> f5069a;

        /* renamed from: b, reason: collision with root package name */
        f f5070b;

        HandlerC0052f(f fVar) {
            this.f5069a = new WeakReference<>(fVar);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Location location;
            String str;
            if (com.baidu.location.f.isServing) {
                f fVar = this.f5069a.get();
                this.f5070b = fVar;
                if (fVar == null) {
                    return;
                }
                int i8 = message.what;
                if (i8 == 1) {
                    Location location2 = (Location) message.obj;
                    this.f5070b.a(location2, com.baidu.location.b.e.b().f4647u2 == 1 ? com.baidu.location.b.j.a().a(location2) : -1);
                    return;
                }
                if (i8 == 3) {
                    location = (Location) message.obj;
                    str = "&og=1";
                } else {
                    if (i8 != 4) {
                        if (i8 != 5) {
                            return;
                        }
                        fVar.a((String) message.obj);
                        return;
                    }
                    location = (Location) message.obj;
                    str = "&og=2";
                }
                fVar.a(str, location);
            }
        }
    }

    private class g implements LocationListener {
        private g() {
        }

        @Override // android.location.LocationListener
        public void onLocationChanged(Location location) {
            if (location == null && com.baidu.location.e.i.f5263e == 4) {
                return;
            }
            if (com.baidu.location.e.i.h(com.baidu.location.f.getServiceContext())) {
                com.baidu.location.c.e.a().a(location);
                return;
            }
            if (!com.baidu.location.e.i.a(location) && Math.abs(location.getLatitude()) <= 360.0d && Math.abs(location.getLongitude()) <= 360.0d) {
                f.this.S = location.getTime() / 1000;
                f.this.f5045o0 = System.currentTimeMillis();
                if (f.this.R != 0) {
                    f.this.Q = System.currentTimeMillis() - f.this.R;
                }
                f.this.R = System.currentTimeMillis();
                int i8 = f.f5014d;
                if (i8 == 0) {
                    try {
                        i8 = location.getExtras().getInt("satellites");
                    } catch (Exception unused) {
                    }
                }
                if (i8 == 0 || com.baidu.location.b.r.c().j()) {
                    long unused2 = f.this.V;
                }
                f.this.b(true);
                f.this.e(location);
                f.this.H = false;
            }
        }

        @Override // android.location.LocationListener
        public void onProviderDisabled(String str) {
            f.this.e((Location) null);
            f.this.b(false);
        }

        @Override // android.location.LocationListener
        public void onProviderEnabled(String str) {
        }

        @Override // android.location.LocationListener
        public void onStatusChanged(String str, int i8, Bundle bundle) {
            if (i8 == 0) {
                f.this.e((Location) null);
            } else if (i8 != 1) {
                if (i8 != 2) {
                    return;
                }
                f.this.H = false;
                return;
            } else {
                f.this.G = System.currentTimeMillis();
                f.this.H = true;
            }
            f.this.b(false);
        }

        /* synthetic */ g(f fVar, a aVar) {
            this();
        }
    }

    private class h implements GpsStatus.NmeaListener {
        private h() {
        }

        @Override // android.location.GpsStatus.NmeaListener
        public void onNmeaReceived(long j8, String str) {
            if (f.this.T != null) {
                f.this.T.sendMessage(f.this.T.obtainMessage(5, str));
            }
        }

        /* synthetic */ h(f fVar, a aVar) {
            this();
        }
    }

    private class i implements LocationListener {

        /* renamed from: a, reason: collision with root package name */
        private long f5073a;

        private i() {
            this.f5073a = 0L;
        }

        @Override // android.location.LocationListener
        public void onLocationChanged(Location location) {
            if (!(f.this.I && com.baidu.location.e.i.f5263e == 4) && location != null && TextUtils.equals(location.getProvider(), "gps") && System.currentTimeMillis() - this.f5073a >= 10000 && Math.abs(location.getLatitude()) <= 360.0d && Math.abs(location.getLongitude()) <= 360.0d && com.baidu.location.b.b0.a(location, false)) {
                this.f5073a = System.currentTimeMillis();
                if (f.this.T != null) {
                    f.this.J0 = System.currentTimeMillis();
                    f.this.T.sendMessage(f.this.T.obtainMessage(4, location));
                }
            }
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

        /* synthetic */ i(f fVar, a aVar) {
            this();
        }
    }

    private f() {
        this.B = false;
        this.D = false;
        this.f5052u0 = null;
        if (Build.VERSION.SDK_INT >= 24) {
            try {
                Class.forName("android.location.GnssStatus");
                this.B = true;
            } catch (ClassNotFoundException unused) {
                this.B = false;
            }
        }
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                this.f5052u0 = Build.MANUFACTURER;
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        this.D = false;
    }

    public static String l() {
        long currentTimeMillis = System.currentTimeMillis() - f5024n;
        if (currentTimeMillis < 0 || currentTimeMillis >= C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS) {
            return null;
        }
        return String.format(Locale.US, "&gsvn=%d&gsfn=%d", Integer.valueOf(f5023m), Integer.valueOf(f5014d));
    }

    private int f(Location location) {
        if (location == null) {
            return 0;
        }
        if (location.isFromMockProvider()) {
            return 100;
        }
        if (Math.abs(this.f5045o0 - this.f5046p0) >= C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS) {
            this.f5046p0 = -1L;
            this.f5049s0 = false;
            this.f5048r0 = false;
            this.f5047q0 = null;
        } else if (this.f5047q0 == null) {
            if (!this.f5048r0) {
                return 200;
            }
            if (this.f5049s0) {
                return 300;
            }
        } else if (!this.f5049s0 && this.f5048r0) {
            return 400;
        }
        if (this.f5045o0 > 0) {
            if (this.f5046p0 == -1) {
                return 500;
            }
        }
        return 0;
    }

    public BDLocation h() {
        if (this.f5047q0 != null && Math.abs(System.currentTimeMillis() - this.f5046p0) <= C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS) {
            return this.f5047q0;
        }
        return null;
    }

    public synchronized String m() {
        String str;
        str = "-2";
        try {
            try {
                if (Math.abs(System.currentTimeMillis() - this.f5038h0) < C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS) {
                    str = this.f5037g0;
                    if (str == null) {
                        str = "0";
                    }
                } else {
                    str = "-1";
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return "&gnsf=" + str;
    }

    public static String b(Location location) {
        String a8 = a(location);
        if (a8 == null) {
            return a8;
        }
        return a8 + "&g_tp=0";
    }

    public Location g() {
        if (this.f5055w != null && Math.abs(System.currentTimeMillis() - this.f5055w.getTime()) <= 60000) {
            return this.f5055w;
        }
        return null;
    }

    public boolean i() {
        try {
            if (f5014d == 0) {
                try {
                    this.f5055w.getExtras().getInt("satellites");
                } catch (Exception unused) {
                }
            }
            Location location = this.f5055w;
            if (location != null && location.getLatitude() != com.github.mikephil.charting.utils.i.DOUBLE_EPSILON) {
                if (this.f5055w.getLongitude() != com.github.mikephil.charting.utils.i.DOUBLE_EPSILON) {
                    return true;
                }
            }
            return false;
        } catch (Exception unused2) {
            Location location2 = this.f5055w;
            return (location2 == null || location2.getLatitude() == com.github.mikephil.charting.utils.i.DOUBLE_EPSILON || this.f5055w.getLongitude() == com.github.mikephil.charting.utils.i.DOUBLE_EPSILON) ? false : true;
        }
    }

    public boolean j() {
        if (!i() || com.baidu.location.e.i.h(com.baidu.location.f.getServiceContext()) || System.currentTimeMillis() - this.L > 10000) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (!this.H || currentTimeMillis - this.G >= C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS) {
            return this.K;
        }
        return true;
    }

    public boolean k() {
        return this.E0;
    }

    public static String c(Location location) {
        String a8 = a(location);
        if (a8 == null) {
            return a8;
        }
        return a8 + f5025o;
    }

    public static synchronized f a() {
        f fVar;
        synchronized (f.class) {
            try {
                if (f5011a == null) {
                    f5011a = new f();
                }
                fVar = f5011a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return fVar;
    }

    public synchronized void b() {
        if (com.baidu.location.f.isServing) {
            Context serviceContext = com.baidu.location.f.getServiceContext();
            this.f5051u = serviceContext;
            try {
                this.f5053v = (LocationManager) serviceContext.getSystemService("location");
            } catch (Exception unused) {
            }
            this.T = new HandlerC0052f(this);
        }
    }

    public synchronized void e() {
        d();
        if (this.f5053v == null) {
            return;
        }
        try {
            HandlerC0052f handlerC0052f = this.T;
            if (handlerC0052f != null) {
                handlerC0052f.removeCallbacksAndMessages(null);
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        this.f5053v = null;
        if (com.baidu.location.b.e.b().f4647u2 == 1 && com.baidu.location.b.j.a().b()) {
            com.baidu.location.b.j.a().c();
        }
    }

    public String f() {
        boolean z7;
        StringBuilder sb;
        String str;
        if (this.f5055w == null) {
            return null;
        }
        String str2 = "{\"result\":{\"time\":\"" + com.baidu.location.e.i.a() + "\",\"error\":\"61\"},\"content\":{\"point\":{\"x\":\"%f\",\"y\":\"%f\"},\"radius\":\"%d\",\"d\":\"%f\",\"s\":\"%f\",\"n\":\"%d\"";
        int accuracy = (int) (this.f5055w.hasAccuracy() ? this.f5055w.getAccuracy() : 10.0f);
        float speed = (float) (this.f5055w.getSpeed() * 3.6d);
        if (!this.f5055w.hasSpeed()) {
            speed = -1.0f;
        }
        double[] dArr = new double[2];
        if (com.baidu.location.e.f.a().a(this.f5055w.getLongitude(), this.f5055w.getLatitude())) {
            dArr = Jni.coorEncrypt(this.f5055w.getLongitude(), this.f5055w.getLatitude(), BDLocation.BDLOCATION_WGS84_TO_GCJ02);
            if (dArr[0] <= com.github.mikephil.charting.utils.i.DOUBLE_EPSILON && dArr[1] <= com.github.mikephil.charting.utils.i.DOUBLE_EPSILON) {
                dArr[0] = this.f5055w.getLongitude();
                dArr[1] = this.f5055w.getLatitude();
            }
            z7 = true;
        } else {
            dArr[0] = this.f5055w.getLongitude();
            double latitude = this.f5055w.getLatitude();
            dArr[1] = latitude;
            if (dArr[0] <= com.github.mikephil.charting.utils.i.DOUBLE_EPSILON && latitude <= com.github.mikephil.charting.utils.i.DOUBLE_EPSILON) {
                dArr[0] = this.f5055w.getLongitude();
                dArr[1] = this.f5055w.getLatitude();
            }
            z7 = false;
        }
        Locale locale = Locale.CHINA;
        String format = String.format(locale, str2, Double.valueOf(dArr[0]), Double.valueOf(dArr[1]), Integer.valueOf(accuracy), Float.valueOf(this.f5055w.getBearing()), Float.valueOf(speed), Integer.valueOf(f5014d));
        if (!z7) {
            format = format + ",\"in_cn\":\"0\"";
        }
        if (!com.baidu.location.e.i.f5275k) {
            format = format + String.format(locale, ",\"is_mock\":%d", Integer.valueOf(f(this.f5055w)));
        }
        if (this.f5055w.hasAltitude()) {
            sb = new StringBuilder();
            sb.append(format);
            str = String.format(locale, ",\"h\":%.2f}}", Double.valueOf(this.f5055w.getAltitude()));
        } else {
            sb = new StringBuilder();
            sb.append(format);
            str = "}}";
        }
        sb.append(str);
        return sb.toString();
    }

    public static String a(Location location) {
        StringBuilder sb;
        if (location == null) {
            return null;
        }
        float speed = (float) (location.getSpeed() * 3.6d);
        if (!location.hasSpeed()) {
            speed = -1.0f;
        }
        int accuracy = (int) (location.hasAccuracy() ? location.getAccuracy() : -1.0f);
        double altitude = location.hasAltitude() ? location.getAltitude() : 555.0d;
        float bearing = location.hasBearing() ? location.getBearing() : -1.0f;
        String format = f5029s < -0.01f ? String.format(Locale.CHINA, "&ll=%.5f|%.5f&s=%.1f&d=%.1f&ll_r=%d&ll_n=%d&ll_h=%.2f&ll_t=%d&ll_sn=%d|%d|%d|%d|%d&ll_asn=%d|%d|%d|%d|%d&ll_snr=%.1f", Double.valueOf(location.getLongitude()), Double.valueOf(location.getLatitude()), Float.valueOf(speed), Float.valueOf(bearing), Integer.valueOf(accuracy), Integer.valueOf(f5014d), Double.valueOf(altitude), Long.valueOf(location.getTime() / 1000), Integer.valueOf(f5014d), Integer.valueOf(f5015e), Integer.valueOf(f5016f), Integer.valueOf(f5017g), Integer.valueOf(f5018h), Integer.valueOf(f5023m), Integer.valueOf(f5019i), Integer.valueOf(f5020j), Integer.valueOf(f5021k), Integer.valueOf(f5022l), Double.valueOf(f5026p)) : String.format(Locale.CHINA, "&ll=%.5f|%.5f&s=%.1f&d=%.1f&ll_r=%d&ll_n=%d&ll_h=%.2f&ll_t=%d&ll_sn=%d|%d|%d|%d|%d&ll_asn=%d|%d|%d|%d|%d&ll_snr=%.1f&ll_bp=%.2f", Double.valueOf(location.getLongitude()), Double.valueOf(location.getLatitude()), Float.valueOf(speed), Float.valueOf(bearing), Integer.valueOf(accuracy), Integer.valueOf(f5014d), Double.valueOf(altitude), Long.valueOf(location.getTime() / 1000), Integer.valueOf(f5014d), Integer.valueOf(f5015e), Integer.valueOf(f5016f), Integer.valueOf(f5017g), Integer.valueOf(f5018h), Integer.valueOf(f5023m), Integer.valueOf(f5019i), Integer.valueOf(f5020j), Integer.valueOf(f5021k), Integer.valueOf(f5022l), Double.valueOf(f5026p), Float.valueOf(f5029s));
        try {
            if (f5013c != 2 || f5012b == null) {
                sb = new StringBuilder();
                sb.append(format);
                sb.append("&ll_fake=");
                sb.append(f5013c);
            } else {
                sb = new StringBuilder();
                sb.append(format);
                sb.append(String.format(Locale.CHINA, "&ll_fake=%d|%.5f|%.5f|%d", Integer.valueOf(f5013c), Double.valueOf(f5012b.getLongitude()), Double.valueOf(f5012b.getLatitude()), Long.valueOf(f5012b.getTime() / 1000)));
            }
            return sb.toString();
        } catch (Exception e8) {
            e8.printStackTrace();
            return format;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(ArrayList<ArrayList<Float>> arrayList) {
        String str;
        if (arrayList == null || arrayList.size() <= 0) {
            str = null;
        } else {
            StringBuilder sb = new StringBuilder(100);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(this.f5033c0);
            sb.append(com.baidu.location.e.d.g(arrayList2));
            sb.append(b5.b.VERTICAL);
            sb.append(com.baidu.location.e.d.f(arrayList2));
            sb.append(b5.b.VERTICAL);
            sb.append(com.baidu.location.e.d.a(arrayList2));
            sb.append(b5.b.VERTICAL);
            sb.append(com.baidu.location.e.d.h(arrayList2));
            sb.append(b5.b.VERTICAL);
            sb.append(com.baidu.location.e.d.b(arrayList2));
            sb.append(b5.b.VERTICAL);
            sb.append(com.baidu.location.e.d.c(arrayList2));
            sb.append(b5.b.VERTICAL);
            sb.append(com.baidu.location.e.d.e(arrayList2));
            sb.append(b5.b.VERTICAL);
            sb.append(com.baidu.location.e.d.d(arrayList2));
            str = sb.toString();
        }
        this.f5037g0 = str;
        this.f5038h0 = System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(Location location) {
        if (this.T == null || System.currentTimeMillis() - this.f5054v0 <= C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS) {
            return;
        }
        this.T.sendMessage(this.T.obtainMessage(1, location));
    }

    public void c() {
        if (this.I) {
            return;
        }
        a aVar = null;
        try {
            if (!this.B) {
                e eVar = new e(this, aVar);
                this.C = eVar;
                this.f5053v.addGpsStatusListener(eVar);
            } else if (com.baidu.location.e.i.a(this.f5051u, "android.permission.ACCESS_FINE_LOCATION") == 1) {
                d dVar = new d(this, aVar);
                this.A = dVar;
                this.f5053v.registerGnssStatusCallback(dVar);
            }
            i iVar = new i(this, aVar);
            this.f5059y = iVar;
            this.f5053v.requestLocationUpdates("passive", 9000L, 0.0f, iVar);
        } catch (Exception unused) {
        }
        try {
            this.f5057x = new g(this, aVar);
            try {
                if (com.baidu.location.e.i.a(this.f5051u, "android.permission.ACCESS_LOCATION_EXTRA_COMMANDS") == 1) {
                    this.f5053v.sendExtraCommand("gps", "force_xtra_injection", new Bundle());
                }
            } catch (Exception unused2) {
            }
            if (com.baidu.location.e.i.a(this.f5051u, "android.permission.ACCESS_FINE_LOCATION") == 1) {
                this.f5053v.requestLocationUpdates("gps", 1000L, 0.0f, this.f5057x);
                this.E0 = true;
            }
            if (this.B && this.X == null && com.baidu.location.e.i.P == 1 && new Random().nextDouble() < com.baidu.location.e.i.O) {
                this.X = new c(this, aVar);
            }
            c cVar = this.X;
            if (cVar != null) {
                this.f5053v.registerGnssNavigationMessageCallback(cVar);
            }
            this.U = System.currentTimeMillis();
            if (!com.baidu.location.e.i.f5275k && com.baidu.location.e.i.f5274j0 == 1) {
                if (Build.VERSION.SDK_INT >= 24) {
                    a aVar2 = new a();
                    this.F = aVar2;
                    this.f5053v.addNmeaListener(aVar2);
                } else {
                    this.E = new h(this, aVar);
                    Class.forName("android.location.LocationManager").getMethod("addNmeaListener", GpsStatus.NmeaListener.class).invoke(this.f5053v, this.E);
                }
            }
            this.I = true;
        } catch (Exception unused3) {
        }
    }

    public void d() {
        d dVar;
        if (this.I) {
            LocationManager locationManager = this.f5053v;
            if (locationManager != null) {
                try {
                    e eVar = this.C;
                    if (eVar != null) {
                        locationManager.removeGpsStatusListener(eVar);
                        this.C = null;
                    }
                    if (this.B && (dVar = this.A) != null) {
                        this.f5053v.unregisterGnssStatusCallback(dVar);
                        this.A = null;
                    }
                    i iVar = this.f5059y;
                    if (iVar != null) {
                        this.f5053v.removeUpdates(iVar);
                        this.f5059y = null;
                    }
                } catch (Exception unused) {
                }
                try {
                    g gVar = this.f5057x;
                    if (gVar != null) {
                        this.f5053v.removeUpdates(gVar);
                        this.E0 = false;
                    }
                    OnNmeaMessageListener onNmeaMessageListener = this.F;
                    if (onNmeaMessageListener != null) {
                        this.f5053v.removeNmeaListener(onNmeaMessageListener);
                    }
                    if (this.E != null) {
                        Class.forName("android.location.LocationManager").getMethod("removeNmeaListener", GpsStatus.NmeaListener.class).invoke(this.f5053v, this.E);
                    }
                    c cVar = this.X;
                    if (cVar != null) {
                        this.f5053v.unregisterGnssNavigationMessageCallback(cVar);
                    }
                    a(0);
                } catch (Exception unused2) {
                }
            }
            com.baidu.location.e.i.f5259c = 0;
            com.baidu.location.e.i.f5281n = 0;
            this.f5057x = null;
            this.I = false;
            b(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(ArrayList<ArrayList<Float>> arrayList) {
        StringBuilder sb = new StringBuilder();
        if (arrayList.size() == 0) {
            return sb.toString();
        }
        Iterator<ArrayList<Float>> it = arrayList.iterator();
        boolean z7 = true;
        while (it.hasNext()) {
            ArrayList<Float> next = it.next();
            if (next.size() == 6) {
                if (z7) {
                    z7 = false;
                } else {
                    sb.append(b5.b.VERTICAL);
                }
                sb.append(String.format("%.1f;", next.get(0)));
                sb.append(String.format("%.1f;", next.get(1)));
                sb.append(String.format("%.1f;", next.get(2)));
                sb.append(String.format("%.0f;", next.get(3)));
                sb.append(String.format("%.0f;", next.get(4)));
                sb.append(String.format("%.0f", next.get(5)));
            }
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(boolean z7) {
        this.K = z7;
        f5029s = -1.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ArrayList<ArrayList<Float>> a(ArrayList<ArrayList<Float>> arrayList, boolean z7, float f8) {
        ArrayList<ArrayList<Float>> arrayList2 = new ArrayList<>();
        if (arrayList.size() <= 40 && arrayList.size() != 0) {
            Iterator<ArrayList<Float>> it = arrayList.iterator();
            while (it.hasNext()) {
                ArrayList<Float> next = it.next();
                if (next.size() == 6) {
                    float floatValue = next.get(3).floatValue();
                    float floatValue2 = next.get(2).floatValue();
                    if (!z7 || floatValue >= 1.0f) {
                        if (f8 <= 0.0f || floatValue2 >= f8) {
                            arrayList2.add(next);
                        }
                    }
                }
            }
        }
        return arrayList2;
    }

    private boolean b(String str) {
        String str2;
        int i8;
        if (str.indexOf("*") != -1 && str.indexOf("$") != -1 && str.indexOf("$") <= str.indexOf("*") && str.length() >= str.indexOf("*")) {
            byte[] bytes = str.substring(0, str.indexOf("*")).getBytes();
            if (bytes.length >= 2) {
                int i9 = bytes[1];
                for (int i10 = 2; i10 < bytes.length; i10++) {
                    i9 ^= bytes[i10];
                }
                str2 = String.format("%02x", Integer.valueOf(i9));
            } else {
                str2 = "";
            }
            int indexOf = str.indexOf("*");
            if (indexOf != -1 && str.length() >= (i8 = indexOf + 3) && str2.equalsIgnoreCase(str.substring(indexOf + 1, i8))) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ArrayList<ArrayList<Float>> a(boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, float f8) {
        ArrayList<ArrayList<Float>> arrayList = new ArrayList<>();
        if (z7) {
            arrayList.addAll(a(this.f5033c0, z11, f8));
        }
        if (z8) {
            arrayList.addAll(a(this.f5034d0, z11, f8));
        }
        if (z9) {
            arrayList.addAll(a(this.f5035e0, z11, f8));
        }
        if (z10) {
            arrayList.addAll(a(this.f5036f0, z11, f8));
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x000f, code lost:
    
        if (r3 == 1) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(int i8) {
        b bVar;
        LocationManager locationManager;
        if (i8 != 0) {
            if (i8 == 2) {
                this.f5060y0 = false;
            }
            if (!this.f5058x0 || this.f5060y0 || !this.B || (bVar = this.W) == null || (locationManager = this.f5053v) == null) {
                return;
            }
            try {
                locationManager.unregisterGnssMeasurementsCallback(bVar);
            } catch (Exception e8) {
                e8.printStackTrace();
            }
            this.f5056w0 = false;
            return;
        }
        this.f5060y0 = false;
        this.f5058x0 = false;
        if (this.f5058x0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Location location, int i8) {
        if (location == null) {
            this.f5055w = null;
            return;
        }
        if (f5014d == 0) {
            try {
                location.getExtras().getInt("satellites");
            } catch (Exception unused) {
            }
        }
        if (this.D && com.baidu.location.e.i.a(location.getSpeed(), 0.0f) && !com.baidu.location.e.i.a(this.O, com.github.mikephil.charting.utils.i.DOUBLE_EPSILON) && System.currentTimeMillis() - this.P < 2000.0d) {
            location.setSpeed((float) this.O);
        }
        Location location2 = new Location(location);
        this.L = System.currentTimeMillis();
        this.f5055w = location;
        int i9 = f5014d;
        long currentTimeMillis = System.currentTimeMillis();
        this.f5055w.setTime(currentTimeMillis);
        float speed = (float) (this.f5055w.getSpeed() * 3.6d);
        if (!this.f5055w.hasSpeed()) {
            speed = -1.0f;
        }
        if (i9 == 0) {
            try {
                i9 = this.f5055w.getExtras().getInt("satellites");
            } catch (Exception unused2) {
            }
        }
        this.J = String.format(Locale.CHINA, "&ll=%.5f|%.5f&s=%.1f&d=%.1f&ll_n=%d&ll_t=%d", Double.valueOf(this.f5055w.getLongitude()), Double.valueOf(this.f5055w.getLatitude()), Float.valueOf(speed), Float.valueOf(this.f5055w.getBearing()), Integer.valueOf(i9), Long.valueOf(currentTimeMillis));
        if (this.f5055w != null) {
            BDLocation bDLocation = new BDLocation(f());
            com.baidu.location.b.g.a().a(bDLocation, "gcj02", this.f5055w);
            Bundle extras = location.getExtras();
            if (extras == null) {
                extras = new Bundle();
            }
            extras.putInt("sat_num", i9);
            if (Math.abs(System.currentTimeMillis() - this.C0) >= C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS) {
                extras.putBoolean("is_support_beidou", false);
            } else {
                extras.putBoolean("is_support_beidou", true);
            }
            bDLocation.setExtrainfo(extras);
            Location location3 = this.f5055w;
            if (location3 != null && BDLocation.BDLOCATION_GNSS_PROVIDER_FROM_BAIDU_BEIDOU.equals(location3.getProvider())) {
                bDLocation.setGnssProvider(BDLocation.BDLOCATION_GNSS_PROVIDER_FROM_BAIDU_BEIDOU);
            }
            a(bDLocation);
            if (f5014d > 2 && com.baidu.location.b.b0.a(this.f5055w, true) && "gps".equals(this.f5055w.getProvider())) {
                boolean j8 = com.baidu.location.c.h.a().j();
                com.baidu.location.c.b f8 = com.baidu.location.c.h.a().f();
                if (f8 != null) {
                    com.baidu.location.b.x.a(new com.baidu.location.c.b(f8));
                }
                com.baidu.location.b.x.a(System.currentTimeMillis());
                com.baidu.location.b.x.a(new Location(this.f5055w));
                com.baidu.location.b.x.a(com.baidu.location.b.d.a().c());
                com.baidu.location.b.x.b(com.baidu.location.b.g.a().c());
                if (!j8) {
                    com.baidu.location.b.b.a().b();
                }
            }
        }
        if ("gps".equals(location2.getProvider())) {
            com.baidu.location.b.b.a().a(location2, f5014d);
        }
    }

    public void a(BDLocation bDLocation) {
        if (com.baidu.location.e.i.f5275k || f(this.f5055w) <= 0) {
            com.baidu.location.b.d.a().d(bDLocation);
        } else {
            com.baidu.location.b.d.a().c(bDLocation);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        if (TextUtils.isEmpty(str) || !b(str)) {
            return;
        }
        if (str.startsWith("$GPGGA,")) {
            a(str, 2, 4, 6);
        } else if (str.startsWith("$GPRMC,")) {
            a(str, 3, 5, 2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00e7, code lost:
    
        if (android.text.TextUtils.equals(r0[r14], androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_IN_PROGRESS) != false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00f9, code lost:
    
        r10.f5048r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00f4, code lost:
    
        if (android.text.TextUtils.equals(r0[r14], "0") != false) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void a(String str, int i8, int i9, int i10) {
        if (TextUtils.isEmpty(str) || !b(str)) {
            return;
        }
        String[] split = str.split(SystemInfoUtil.COMMA);
        if (str.startsWith("$GPGGA,")) {
            if (split.length < 7) {
                return;
            }
        } else if (str.startsWith("$GPRMC,") && split.length < 6) {
            return;
        }
        if (TextUtils.isEmpty(split[i8].trim()) || split[i8].trim().length() <= 2) {
            this.f5047q0 = null;
        } else {
            try {
                double doubleValue = Double.valueOf(split[i8].substring(0, 2)).doubleValue() + (Double.valueOf(split[i8].substring(2)).doubleValue() / 60.0d);
                if (this.f5047q0 == null) {
                    this.f5047q0 = new BDLocation();
                }
                this.f5047q0.setLatitude(doubleValue);
            } catch (NumberFormatException unused) {
                this.f5049s0 = true;
            }
        }
        if (this.f5047q0 == null || TextUtils.isEmpty(split[i9].trim()) || split[i9].trim().length() <= 3) {
            this.f5047q0 = null;
        } else {
            try {
                this.f5047q0.setLongitude(Double.valueOf(split[i9].substring(0, 3)).doubleValue() + (Double.valueOf(split[i9].substring(3)).doubleValue() / 60.0d));
            } catch (NumberFormatException unused2) {
                this.f5049s0 = true;
            }
        }
        if (!TextUtils.isEmpty(split[i10].trim())) {
            if (i10 == 2) {
                if (!TextUtils.equals(split[i10], "V")) {
                }
                this.f5048r0 = false;
            } else if (i10 == 6) {
            }
        }
        if (this.f5047q0 != null) {
            this.f5049s0 = false;
        }
        this.f5046p0 = System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, Location location) {
        if (location == null) {
            return;
        }
        String str2 = str + com.baidu.location.b.d.a().c();
        boolean j8 = com.baidu.location.c.h.a().j();
        com.baidu.location.c.b f8 = com.baidu.location.c.h.a().f();
        if (f8 != null) {
            com.baidu.location.b.x.a(new com.baidu.location.c.b(f8));
        }
        com.baidu.location.b.x.a(System.currentTimeMillis());
        com.baidu.location.b.x.a(new Location(location));
        com.baidu.location.b.x.a(str2);
        com.baidu.location.b.x.b(com.baidu.location.b.g.a().c());
        if (j8) {
            return;
        }
        com.baidu.location.b.b0.a(com.baidu.location.b.x.c(), (m) null, com.baidu.location.b.x.d(), str2, com.baidu.location.b.x.e());
    }

    public void a(boolean z7) {
        if (z7) {
            c();
        } else {
            d();
        }
    }

    public static boolean a(Location location, Location location2, boolean z7) {
        if (location == location2) {
            return false;
        }
        if (location == null || location2 == null) {
            return true;
        }
        float speed = location2.getSpeed();
        if (z7 && ((com.baidu.location.e.i.f5281n == 3 || !com.baidu.location.e.f.a().a(location2.getLongitude(), location2.getLatitude())) && speed < 5.0f)) {
            return true;
        }
        float distanceTo = location2.distanceTo(location);
        return speed > com.baidu.location.e.i.f5287q ? distanceTo > com.baidu.location.e.i.f5289s : speed > com.baidu.location.e.i.f5285p ? distanceTo > com.baidu.location.e.i.f5288r : distanceTo > 5.0f;
    }
}
