package com.baidu.location;

import android.app.Notification;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import cn.hutool.core.util.l;
import com.baidu.ar.auth.FeatureCodes;
import com.baidu.lbsapi.auth.LBSAuthManager;
import com.baidu.location.LocationClientOption;
import com.baidu.location.b.i;
import com.baidu.location.b.q;
import com.baidu.location.c.h;
import com.google.android.exoplayer2.C;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class LocationClient implements i.b {
    public static final int CONNECT_HOT_SPOT_FALSE = 0;
    public static final int CONNECT_HOT_SPOT_TRUE = 1;
    public static final int CONNECT_HOT_SPOT_UNKNOWN = -1;
    public static final int LOC_DIAGNOSTIC_TYPE_BETTER_OPEN_FINE_PERMISSION = 10;
    public static final int LOC_DIAGNOSTIC_TYPE_BETTER_OPEN_GPS = 1;
    public static final int LOC_DIAGNOSTIC_TYPE_BETTER_OPEN_WIFI = 2;
    public static final int LOC_DIAGNOSTIC_TYPE_COARSE_FAIL = 11;
    public static final int LOC_DIAGNOSTIC_TYPE_FAIL_UNKNOWN = 9;
    public static final int LOC_DIAGNOSTIC_TYPE_NEED_CHECK_LOC_PERMISSION = 4;
    public static final int LOC_DIAGNOSTIC_TYPE_NEED_CHECK_NET = 3;
    public static final int LOC_DIAGNOSTIC_TYPE_NEED_CLOSE_FLYMODE = 7;
    public static final int LOC_DIAGNOSTIC_TYPE_NEED_INSERT_SIMCARD_OR_OPEN_WIFI = 6;
    public static final int LOC_DIAGNOSTIC_TYPE_NEED_OPEN_PHONE_LOC_SWITCH = 5;
    public static final int LOC_DIAGNOSTIC_TYPE_SERVER_FAIL = 8;

    /* renamed from: a, reason: collision with root package name */
    private static String f4393a = null;

    /* renamed from: b, reason: collision with root package name */
    private static boolean f4394b = false;
    private Boolean B;
    private Boolean C;
    private Boolean D;
    private boolean E;
    private i F;
    private boolean G;
    private boolean H;
    private boolean I;
    private String J;
    private ServiceConnection K;

    /* renamed from: e, reason: collision with root package name */
    private LocationClientOption f4397e;

    /* renamed from: f, reason: collision with root package name */
    private LocationClientOption f4398f;

    /* renamed from: h, reason: collision with root package name */
    private Context f4400h;

    /* renamed from: j, reason: collision with root package name */
    private c f4402j;

    /* renamed from: k, reason: collision with root package name */
    private final Messenger f4403k;

    /* renamed from: y, reason: collision with root package name */
    private String f4417y;

    /* renamed from: c, reason: collision with root package name */
    private long f4395c = 0;

    /* renamed from: d, reason: collision with root package name */
    private String f4396d = null;

    /* renamed from: g, reason: collision with root package name */
    private boolean f4399g = false;

    /* renamed from: i, reason: collision with root package name */
    private Messenger f4401i = null;

    /* renamed from: l, reason: collision with root package name */
    private ArrayList<BDLocationListener> f4404l = null;

    /* renamed from: m, reason: collision with root package name */
    private ArrayList<BDAbstractLocationListener> f4405m = null;

    /* renamed from: n, reason: collision with root package name */
    private BDLocation f4406n = null;

    /* renamed from: o, reason: collision with root package name */
    private BDLocation f4407o = null;

    /* renamed from: p, reason: collision with root package name */
    private boolean f4408p = false;

    /* renamed from: q, reason: collision with root package name */
    private boolean f4409q = false;

    /* renamed from: r, reason: collision with root package name */
    private boolean f4410r = false;

    /* renamed from: s, reason: collision with root package name */
    private d f4411s = null;

    /* renamed from: t, reason: collision with root package name */
    private boolean f4412t = false;

    /* renamed from: u, reason: collision with root package name */
    private final Object f4413u = new Object();

    /* renamed from: v, reason: collision with root package name */
    private long f4414v = 0;

    /* renamed from: w, reason: collision with root package name */
    private long f4415w = 0;

    /* renamed from: x, reason: collision with root package name */
    private String f4416x = null;

    /* renamed from: z, reason: collision with root package name */
    private boolean f4418z = false;
    private boolean A = true;

    class a implements ServiceConnection {
        a() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            LocationClient.this.f4401i = new Messenger(iBinder);
            if (LocationClient.this.f4401i == null) {
                return;
            }
            LocationClient.this.f4399g = true;
            if (LocationClient.this.A) {
                LocationClient.this.f4402j.obtainMessage(2).sendToTarget();
                return;
            }
            try {
                Message obtain = Message.obtain((Handler) null, 11);
                obtain.replyTo = LocationClient.this.f4403k;
                obtain.setData(LocationClient.this.d());
                LocationClient.this.f4401i.send(obtain);
                LocationClient.this.f4399g = true;
                if (LocationClient.this.f4397e != null) {
                    LocationClient.this.D.booleanValue();
                    LocationClient.this.f4402j.obtainMessage(4).sendToTarget();
                }
            } catch (Exception unused) {
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            LocationClient.this.f4401i = null;
            LocationClient.this.f4399g = false;
        }
    }

    class b extends Thread {
        b() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                if (LocationClient.this.F != null) {
                    if (com.baidu.location.e.i.g(LocationClient.this.f4400h) > 0) {
                        LocationClient.this.F.a();
                    }
                    LocationClient.this.F.c();
                }
            } catch (Exception e8) {
                e8.printStackTrace();
            }
        }
    }

    private static class c extends Handler {

        /* renamed from: a, reason: collision with root package name */
        private final WeakReference<LocationClient> f4421a;

        c(Looper looper, LocationClient locationClient) {
            super(looper);
            this.f4421a = new WeakReference<>(locationClient);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            LocationClient locationClient = this.f4421a.get();
            if (locationClient == null) {
                return;
            }
            int i8 = message.what;
            boolean z7 = true;
            if (i8 == 21) {
                Bundle data = message.getData();
                data.setClassLoader(BDLocation.class.getClassLoader());
                BDLocation bDLocation = (BDLocation) data.getParcelable("locStr");
                if (!locationClient.H && locationClient.G && bDLocation.getLocType() == 66) {
                    return;
                }
                if (!locationClient.H && locationClient.G) {
                    locationClient.H = true;
                    return;
                }
                if (!locationClient.H) {
                    locationClient.H = true;
                }
                locationClient.a(message, 21);
                return;
            }
            try {
                if (i8 == 303) {
                    Bundle data2 = message.getData();
                    int i9 = data2.getInt("loctype");
                    int i10 = data2.getInt("diagtype");
                    byte[] byteArray = data2.getByteArray("diagmessage");
                    if (i9 <= 0 || i10 <= 0 || byteArray == null || locationClient.f4405m == null) {
                        return;
                    }
                    Iterator it = locationClient.f4405m.iterator();
                    while (it.hasNext()) {
                        ((BDAbstractLocationListener) it.next()).onLocDiagnosticMessage(i9, i10, new String(byteArray, l.UTF_8));
                    }
                    return;
                }
                if (i8 == 406) {
                    Bundle data3 = message.getData();
                    byte[] byteArray2 = data3.getByteArray("mac");
                    String str = byteArray2 != null ? new String(byteArray2, l.UTF_8) : null;
                    int i11 = data3.getInt("hotspot", -1);
                    if (locationClient.f4405m != null) {
                        Iterator it2 = locationClient.f4405m.iterator();
                        while (it2.hasNext()) {
                            ((BDAbstractLocationListener) it2.next()).onConnectHotSpotMessage(str, i11);
                        }
                        return;
                    }
                    return;
                }
                if (i8 == 701) {
                    locationClient.b((BDLocation) message.obj);
                    return;
                }
                if (i8 == 1300) {
                    locationClient.c(message);
                    return;
                }
                if (i8 == 1400) {
                    locationClient.d(message);
                    return;
                }
                if (i8 != 54) {
                    z7 = false;
                    if (i8 != 55) {
                        if (i8 == 703) {
                            Bundle data4 = message.getData();
                            int i12 = data4.getInt("id", 0);
                            if (i12 > 0) {
                                locationClient.a(i12, (Notification) data4.getParcelable("notification"));
                                return;
                            }
                            return;
                        }
                        if (i8 == 704) {
                            locationClient.a(message.getData().getBoolean("removenotify"));
                            return;
                        }
                        switch (i8) {
                            case 1:
                                locationClient.a();
                                break;
                            case 2:
                                locationClient.b();
                                break;
                            case 3:
                                locationClient.a(message);
                                break;
                            case 4:
                                locationClient.e();
                                break;
                            case 5:
                                locationClient.b(message);
                                break;
                            case 6:
                                locationClient.e(message);
                                break;
                            default:
                                super.handleMessage(message);
                                break;
                        }
                        return;
                    }
                    if (!locationClient.f4397e.location_change_notify) {
                        return;
                    }
                } else if (!locationClient.f4397e.location_change_notify) {
                    return;
                }
                locationClient.f4412t = z7;
            } catch (Exception unused) {
            }
        }
    }

    private class d implements Runnable {
        private d() {
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0054 A[Catch: all -> 0x0035, TryCatch #0 {all -> 0x0035, blocks: (B:4:0x0007, B:6:0x0015, B:9:0x001f, B:11:0x0028, B:14:0x004c, B:16:0x0054, B:18:0x005c, B:19:0x0066, B:20:0x007e, B:23:0x0080, B:24:0x008e, B:26:0x0037, B:28:0x003f, B:31:0x0090, B:33:0x0092), top: B:3:0x0007 }] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0080 A[Catch: all -> 0x0035, TryCatch #0 {all -> 0x0035, blocks: (B:4:0x0007, B:6:0x0015, B:9:0x001f, B:11:0x0028, B:14:0x004c, B:16:0x0054, B:18:0x005c, B:19:0x0066, B:20:0x007e, B:23:0x0080, B:24:0x008e, B:26:0x0037, B:28:0x003f, B:31:0x0090, B:33:0x0092), top: B:3:0x0007 }] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void run() {
            synchronized (LocationClient.this.f4413u) {
                try {
                    LocationClient.this.f4410r = false;
                    if (LocationClient.this.f4401i != null && LocationClient.this.f4403k != null) {
                        if (LocationClient.this.f4404l != null) {
                            if (LocationClient.this.f4404l.size() < 1) {
                            }
                            if (LocationClient.this.f4409q) {
                                LocationClient.this.f4402j.obtainMessage(4).sendToTarget();
                                return;
                            }
                            if (LocationClient.this.f4411s == null) {
                                LocationClient locationClient = LocationClient.this;
                                locationClient.f4411s = locationClient.new d();
                            }
                            LocationClient.this.f4402j.postDelayed(LocationClient.this.f4411s, LocationClient.this.f4397e.scanSpan);
                            return;
                        }
                        if (LocationClient.this.f4405m != null) {
                            if (LocationClient.this.f4405m.size() < 1) {
                            }
                            if (LocationClient.this.f4409q) {
                            }
                        }
                    }
                } finally {
                }
            }
        }

        /* synthetic */ d(LocationClient locationClient, a aVar) {
            this();
        }
    }

    private class e extends Thread {
        private e() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                if (LocationClient.this.f4398f.isOnceLocation()) {
                    com.baidu.location.c.e.a().b(LocationClient.this.f4400h);
                }
                if (LocationClient.this.D.booleanValue()) {
                    if (LocationClient.this.F == null) {
                        h.a().b();
                        LocationClient.this.F = new i(LocationClient.this.f4400h, LocationClient.this.f4398f, LocationClient.this, null, false);
                    }
                    LocationClient locationClient = LocationClient.this;
                    locationClient.J = locationClient.F.g();
                    if (LocationClient.this.f4398f.firstLocType == LocationClientOption.FirstLocType.ACCURACY_IN_FIRST_LOC) {
                        LocationClient.this.F.d();
                        LocationClient.this.F.e();
                    }
                }
                LocationClient.this.f4402j.obtainMessage(1).sendToTarget();
            } catch (Exception e8) {
                e8.printStackTrace();
            }
        }

        /* synthetic */ e(LocationClient locationClient, a aVar) {
            this();
        }
    }

    public LocationClient(Context context) {
        this.f4397e = new LocationClientOption();
        this.f4398f = new LocationClientOption();
        this.f4400h = null;
        Boolean bool = Boolean.FALSE;
        this.B = bool;
        this.C = bool;
        this.D = Boolean.TRUE;
        this.F = null;
        this.G = false;
        this.H = false;
        this.I = false;
        this.J = null;
        this.K = new a();
        c();
        this.f4400h = context;
        this.f4397e = new LocationClientOption();
        this.f4398f = new LocationClientOption();
        this.f4402j = new c(Looper.getMainLooper(), this);
        this.f4403k = new Messenger(this.f4402j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        if (!this.f4399g || this.f4401i == null) {
            return;
        }
        Message obtain = Message.obtain((Handler) null, 12);
        obtain.replyTo = this.f4403k;
        try {
            this.f4401i.send(obtain);
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        try {
            this.f4400h.unbindService(this.K);
            if (this.I) {
                try {
                    this.f4400h.stopService(new Intent(this.f4400h, (Class<?>) f.class));
                } catch (Exception unused) {
                }
                this.I = false;
            }
        } catch (Exception unused2) {
        }
        synchronized (this.f4413u) {
            try {
                if (this.f4410r) {
                    this.f4402j.removeCallbacks(this.f4411s);
                    this.f4410r = false;
                }
            } catch (Exception unused3) {
            }
        }
        this.f4401i = null;
        this.f4409q = false;
        this.f4418z = false;
        this.f4399g = false;
        this.G = false;
        this.H = false;
        this.D = Boolean.TRUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Bundle d() {
        if (this.f4397e == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putString("packName", this.f4396d);
        bundle.putString("prodName", this.f4397e.prodName);
        bundle.putString("coorType", this.f4397e.coorType);
        bundle.putString("addrType", this.f4397e.addrType);
        bundle.putBoolean("openGPS", this.f4397e.openGps);
        bundle.putBoolean("location_change_notify", this.f4397e.location_change_notify);
        bundle.putInt("scanSpan", this.f4397e.scanSpan);
        bundle.putBoolean("enableSimulateGps", this.f4397e.enableSimulateGps);
        bundle.putInt("timeOut", this.f4397e.timeOut);
        bundle.putInt("priority", this.f4397e.priority);
        bundle.putBoolean("map", this.B.booleanValue());
        bundle.putBoolean("import", this.C.booleanValue());
        bundle.putBoolean("needDirect", this.f4397e.mIsNeedDeviceDirect);
        bundle.putBoolean("isneedaptag", this.f4397e.isNeedAptag);
        bundle.putBoolean("isneedpoiregion", this.f4397e.isNeedPoiRegion);
        bundle.putBoolean("isneedregular", this.f4397e.isNeedRegular);
        bundle.putBoolean("isneedaptagd", this.f4397e.isNeedAptagd);
        bundle.putBoolean("isneedaltitude", this.f4397e.isNeedAltitude);
        bundle.putBoolean("isneednewrgc", this.f4397e.isNeedNewVersionRgc);
        bundle.putInt("autoNotifyMaxInterval", this.f4397e.a());
        bundle.putInt("autoNotifyMinTimeInterval", this.f4397e.getAutoNotifyMinTimeInterval());
        bundle.putInt("autoNotifyMinDistance", this.f4397e.getAutoNotifyMinDistance());
        bundle.putFloat("autoNotifyLocSensitivity", this.f4397e.b());
        bundle.putInt("wifitimeout", this.f4397e.wifiCacheTimeOut);
        bundle.putInt("wfnum", com.baidu.location.b.a.a().f4436d);
        bundle.putBoolean("ischeckper", com.baidu.location.b.a.a().f4435c);
        bundle.putFloat("wfsm", (float) com.baidu.location.b.a.a().f4438f);
        bundle.putDouble("gnmcrm", com.baidu.location.b.a.a().f4441i);
        bundle.putInt("gnmcon", com.baidu.location.b.a.a().f4442j);
        bundle.putInt("iupl", com.baidu.location.b.a.a().f4443k);
        bundle.putInt("lpcs", com.baidu.location.b.a.a().f4440h);
        bundle.putInt("hpdts", com.baidu.location.b.a.a().f4450r);
        bundle.putInt("oldts", com.baidu.location.b.a.a().f4451s);
        bundle.putInt("onic", com.baidu.location.b.a.a().f4452t);
        bundle.putInt("nlcs", com.baidu.location.b.a.a().f4453u);
        bundle.putFloat("ncsr", com.baidu.location.b.a.a().f4454v);
        bundle.putFloat("cscr", com.baidu.location.b.a.a().f4455w);
        bundle.putString("connectBssid", this.J);
        bundle.putInt("cls", com.baidu.location.b.a.a().f4456x);
        bundle.putIntArray("ocs", com.baidu.location.b.a.a().f4457y);
        bundle.putInt("topCellNumber", com.baidu.location.b.a.a().f4458z);
        bundle.putInt("locStrLength", com.baidu.location.b.a.a().A);
        return bundle;
    }

    public static BDLocation getBDLocationInCoorType(BDLocation bDLocation, String str) {
        BDLocation bDLocation2 = new BDLocation(bDLocation);
        double[] coorEncrypt = Jni.coorEncrypt(bDLocation.getLongitude(), bDLocation.getLatitude(), str);
        bDLocation2.setLatitude(coorEncrypt[1]);
        bDLocation2.setLongitude(coorEncrypt[0]);
        return bDLocation2;
    }

    public static void setAgreePrivacy(boolean z7) {
        f4394b = z7;
    }

    public static void setKey(String str) {
        f4393a = str;
    }

    public void disableAssistantLocation() {
        q.a().b();
    }

    public void disableLocInForeground(boolean z7) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("removenotify", z7);
        Message obtainMessage = this.f4402j.obtainMessage(TypedValues.TransitionType.TYPE_AUTO_TRANSITION);
        obtainMessage.setData(bundle);
        obtainMessage.sendToTarget();
    }

    public void enableAssistantLocation(WebView webView) {
        q.a().a(this.f4400h, webView, this);
    }

    public void enableLocInForeground(int i8, Notification notification) {
        if (i8 <= 0 || notification == null) {
            Log.e("baidu_location_Client", "can not startLocInForeground if the param is unlegal");
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("id", i8);
        bundle.putParcelable("notification", notification);
        Message obtainMessage = this.f4402j.obtainMessage(703);
        obtainMessage.setData(bundle);
        obtainMessage.sendToTarget();
    }

    public String getAccessKey() {
        try {
            String b8 = com.baidu.location.a.a.b(this.f4400h);
            this.f4417y = b8;
            if (TextUtils.isEmpty(b8)) {
                throw new IllegalStateException("please setting key from Manifest.xml");
            }
            return String.format("KEY=%s", this.f4417y);
        } catch (Exception unused) {
            return null;
        }
    }

    public BDLocation getLastKnownLocation() {
        return this.f4406n;
    }

    public LocationClientOption getLocOption() {
        return this.f4397e;
    }

    public String getVersion() {
        return "9.6.5.3";
    }

    public boolean isStarted() {
        return this.f4399g;
    }

    public void onReceiveLightLocString(String str) {
    }

    @Override // com.baidu.location.b.i.b
    public void onReceiveLocation(BDLocation bDLocation) {
        if ((!this.H || this.G) && bDLocation != null) {
            Message obtainMessage = this.f4402j.obtainMessage(TypedValues.TransitionType.TYPE_FROM);
            obtainMessage.obj = bDLocation;
            obtainMessage.sendToTarget();
        }
    }

    public void registerLocationListener(BDAbstractLocationListener bDAbstractLocationListener) {
        if (bDAbstractLocationListener == null) {
            throw new IllegalStateException("please set a non-null listener");
        }
        Message obtainMessage = this.f4402j.obtainMessage(FeatureCodes.VO);
        obtainMessage.obj = bDAbstractLocationListener;
        obtainMessage.sendToTarget();
    }

    public boolean requestHotSpotState() {
        if (this.f4401i != null && this.f4399g) {
            try {
                this.f4401i.send(Message.obtain((Handler) null, 406));
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public int requestLocation() {
        ArrayList<BDAbstractLocationListener> arrayList;
        if (this.f4401i == null || this.f4403k == null) {
            return 1;
        }
        ArrayList<BDLocationListener> arrayList2 = this.f4404l;
        if ((arrayList2 == null || arrayList2.size() < 1) && ((arrayList = this.f4405m) == null || arrayList.size() < 1)) {
            return 2;
        }
        if (System.currentTimeMillis() - this.f4395c < 1000) {
            return 6;
        }
        this.f4409q = true;
        Message obtainMessage = this.f4402j.obtainMessage(4);
        obtainMessage.arg1 = 0;
        obtainMessage.sendToTarget();
        return 0;
    }

    public void restart() {
        stop();
        this.A = false;
        this.f4402j.sendEmptyMessageDelayed(1, 1000L);
    }

    public void setLocOption(LocationClientOption locationClientOption) {
        if (locationClientOption == null) {
            locationClientOption = new LocationClientOption();
        }
        if (locationClientOption.a() > 0) {
            locationClientOption.setScanSpan(0);
            locationClientOption.setLocationNotify(true);
        }
        this.f4398f = new LocationClientOption(locationClientOption);
        Message obtainMessage = this.f4402j.obtainMessage(3);
        obtainMessage.obj = locationClientOption;
        obtainMessage.sendToTarget();
    }

    public void start() {
        this.A = false;
        f();
        g();
        LBSAuthManager.getInstance(this.f4400h.getApplicationContext()).setPrivacyMode(f4394b);
        com.baidu.location.b.a.a().a(this.f4400h, this.f4398f, (String) null);
        new e(this, null).start();
    }

    public void stop() {
        this.A = true;
        this.f4402j.obtainMessage(2).sendToTarget();
        i iVar = this.F;
        if (iVar != null) {
            iVar.f();
            this.F = null;
        }
    }

    public void unRegisterLocationListener(BDAbstractLocationListener bDAbstractLocationListener) {
        if (bDAbstractLocationListener == null) {
            throw new IllegalStateException("please set a non-null listener");
        }
        Message obtainMessage = this.f4402j.obtainMessage(FeatureCodes.POSE);
        obtainMessage.obj = bDAbstractLocationListener;
        obtainMessage.sendToTarget();
    }

    public boolean updateLocation(Location location) {
        if (this.f4401i == null || this.f4403k == null || location == null) {
            return false;
        }
        try {
            Message obtain = Message.obtain((Handler) null, 57);
            obtain.obj = location;
            this.f4401i.send(obtain);
            return true;
        } catch (Exception e8) {
            e8.printStackTrace();
            return true;
        }
    }

    public LocationClient(Context context, LocationClientOption locationClientOption) {
        this.f4397e = new LocationClientOption();
        this.f4398f = new LocationClientOption();
        this.f4400h = null;
        Boolean bool = Boolean.FALSE;
        this.B = bool;
        this.C = bool;
        this.D = Boolean.TRUE;
        this.F = null;
        this.G = false;
        this.H = false;
        this.I = false;
        this.J = null;
        this.K = new a();
        c();
        this.f4400h = context;
        this.f4397e = locationClientOption;
        this.f4398f = new LocationClientOption(locationClientOption);
        this.f4402j = new c(Looper.getMainLooper(), this);
        this.f4403k = new Messenger(this.f4402j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Message message) {
        Object obj;
        if (message == null || (obj = message.obj) == null) {
            return;
        }
        BDLocationListener bDLocationListener = (BDLocationListener) obj;
        if (this.f4404l == null) {
            this.f4404l = new ArrayList<>();
        }
        if (this.f4404l.contains(bDLocationListener)) {
            return;
        }
        this.f4404l.add(bDLocationListener);
    }

    private void c() {
        if (f4394b) {
            return;
        }
        Log.e("baidu_location_Client", "The location function has been stopped because you do not agree with the privacy compliance policy. Please recheck the setAgreePrivacy interface");
        throw new Exception("The location function has been stopped because you do not agree with the privacy compliance policy. Please recheck the setAgreePrivacy interface");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        int i8;
        if (this.f4401i == null) {
            return;
        }
        int g8 = com.baidu.location.e.i.g(this.f4400h);
        a aVar = null;
        if ((System.currentTimeMillis() - this.f4414v > C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS || !this.f4397e.location_change_notify || this.f4409q) && g8 == 1) {
            if (!this.f4418z || System.currentTimeMillis() - this.f4415w > 20000 || this.f4409q) {
                Message obtain = Message.obtain((Handler) null, 22);
                if (this.f4409q) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("isWaitingLocTag", this.f4409q);
                    this.f4409q = false;
                    obtain.setData(bundle);
                }
                try {
                    obtain.replyTo = this.f4403k;
                    this.f4401i.send(obtain);
                    this.f4395c = System.currentTimeMillis();
                    this.f4408p = true;
                } catch (Exception e8) {
                    e8.printStackTrace();
                }
            }
        } else if (g8 < 1) {
            BDLocation bDLocation = new BDLocation();
            if (g8 == -1) {
                i8 = 69;
            } else if (g8 == -2) {
                i8 = 70;
            } else {
                if (g8 == 0) {
                    i8 = 71;
                }
                a(bDLocation);
            }
            bDLocation.setLocType(i8);
            a(bDLocation);
        }
        synchronized (this.f4413u) {
            try {
                LocationClientOption locationClientOption = this.f4397e;
                if (locationClientOption != null && locationClientOption.scanSpan >= 1000 && !this.f4410r) {
                    if (this.f4411s == null) {
                        this.f4411s = new d(this, aVar);
                    }
                    this.f4402j.postDelayed(this.f4411s, this.f4397e.scanSpan);
                    this.f4410r = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void f() {
        LocationClientOption locationClientOption = this.f4398f;
        if (locationClientOption == null) {
            return;
        }
        com.baidu.location.e.i.f5280m0 = locationClientOption.mProxyHost;
        com.baidu.location.e.i.f5282n0 = locationClientOption.mProxyPort;
        com.baidu.location.e.i.f5284o0 = locationClientOption.mUsername;
        com.baidu.location.e.i.f5286p0 = locationClientOption.mPassword;
    }

    private void g() {
        LBSAuthManager.getInstance(this.f4400h.getApplicationContext()).setPrivacyMode(f4394b);
        com.baidu.location.a.a.a().a(this.f4400h, f4393a);
    }

    public void registerLocationListener(BDLocationListener bDLocationListener) {
        if (bDLocationListener == null) {
            throw new IllegalStateException("please set a non-null listener");
        }
        Message obtainMessage = this.f4402j.obtainMessage(5);
        obtainMessage.obj = bDLocationListener;
        obtainMessage.sendToTarget();
    }

    public void unRegisterLocationListener(BDLocationListener bDLocationListener) {
        if (bDLocationListener == null) {
            throw new IllegalStateException("please set a non-null listener");
        }
        Message obtainMessage = this.f4402j.obtainMessage(6);
        obtainMessage.obj = bDLocationListener;
        obtainMessage.sendToTarget();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(BDLocation bDLocation) {
        if (this.A) {
            return;
        }
        this.f4406n = bDLocation;
        if (!this.H && bDLocation.getLocType() == 161) {
            this.G = true;
            com.baidu.location.b.a.a().a(bDLocation.getLatitude(), bDLocation.getLongitude(), bDLocation.getCoorType());
        }
        ArrayList<BDLocationListener> arrayList = this.f4404l;
        if (arrayList != null) {
            Iterator<BDLocationListener> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().onReceiveLocation(bDLocation);
            }
        }
        ArrayList<BDAbstractLocationListener> arrayList2 = this.f4405m;
        if (arrayList2 != null) {
            Iterator<BDAbstractLocationListener> it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                it2.next().onReceiveLocation(bDLocation);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(Message message) {
        Object obj;
        if (message == null || (obj = message.obj) == null) {
            return;
        }
        BDAbstractLocationListener bDAbstractLocationListener = (BDAbstractLocationListener) obj;
        if (this.f4405m == null) {
            this.f4405m = new ArrayList<>();
        }
        if (this.f4405m.contains(bDAbstractLocationListener)) {
            return;
        }
        this.f4405m.add(bDAbstractLocationListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(Message message) {
        Object obj;
        if (message == null || (obj = message.obj) == null) {
            return;
        }
        BDAbstractLocationListener bDAbstractLocationListener = (BDAbstractLocationListener) obj;
        ArrayList<BDAbstractLocationListener> arrayList = this.f4405m;
        if (arrayList == null || !arrayList.contains(bDAbstractLocationListener)) {
            return;
        }
        this.f4405m.remove(bDAbstractLocationListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(Message message) {
        Object obj;
        if (message == null || (obj = message.obj) == null) {
            return;
        }
        BDLocationListener bDLocationListener = (BDLocationListener) obj;
        ArrayList<BDLocationListener> arrayList = this.f4404l;
        if (arrayList == null || !arrayList.contains(bDLocationListener)) {
            return;
        }
        this.f4404l.remove(bDLocationListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        if (this.f4399g) {
            return;
        }
        if (this.D.booleanValue()) {
            boolean c8 = com.baidu.location.e.i.c(this.f4400h);
            if (this.f4398f.isOnceLocation() || c8) {
                try {
                    new b().start();
                } catch (Throwable unused) {
                }
            }
        }
        if (this.f4398f.isOnceLocation()) {
            return;
        }
        this.D = Boolean.FALSE;
        this.f4396d = this.f4400h.getPackageName();
        this.f4416x = this.f4396d + "_bdls_v2.9";
        Intent intent = new Intent(this.f4400h, (Class<?>) f.class);
        try {
            intent.putExtra("debug_dev", this.E);
        } catch (Exception unused2) {
        }
        if (this.f4397e == null) {
            this.f4397e = new LocationClientOption();
        }
        intent.putExtra("cache_exception", this.f4397e.isIgnoreCacheException);
        intent.putExtra("kill_process", this.f4397e.isIgnoreKillProcess);
        intent.putExtra("auth_key", f4393a);
        intent.putExtra("proxyHost", this.f4397e.mProxyHost);
        intent.putExtra("proxyPort", this.f4397e.mProxyPort);
        intent.putExtra("username", this.f4397e.mUsername);
        intent.putExtra("password", this.f4397e.mPassword);
        intent.putExtra("cuid", LBSAuthManager.getInstance(this.f4400h).getCUID());
        try {
            this.f4400h.bindService(intent, this.K, 1);
        } catch (Exception e8) {
            e8.printStackTrace();
            this.f4399g = false;
        }
    }

    private void a(int i8) {
        if (this.f4406n.getCoorType() == null) {
            this.f4406n.setCoorType(this.f4397e.coorType);
        }
        if (this.f4408p || ((this.f4397e.location_change_notify && this.f4406n.getLocType() == 61) || this.f4406n.getLocType() == 66 || this.f4406n.getLocType() == 67 || this.f4418z || this.f4406n.getLocType() == 161)) {
            ArrayList<BDLocationListener> arrayList = this.f4404l;
            if (arrayList != null) {
                Iterator<BDLocationListener> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().onReceiveLocation(this.f4406n);
                }
            }
            ArrayList<BDAbstractLocationListener> arrayList2 = this.f4405m;
            if (arrayList2 != null) {
                Iterator<BDAbstractLocationListener> it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    it2.next().onReceiveLocation(this.f4406n);
                }
            }
            if (this.f4406n.getLocType() == 66 || this.f4406n.getLocType() == 67) {
                return;
            }
            this.f4408p = false;
            this.f4415w = System.currentTimeMillis();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i8, Notification notification) {
        try {
            Intent intent = new Intent(this.f4400h, (Class<?>) f.class);
            intent.putExtra("notification", notification);
            intent.putExtra("id", i8);
            intent.putExtra("command", 1);
            if (Build.VERSION.SDK_INT >= 26) {
                this.f4400h.startForegroundService(intent);
            } else {
                this.f4400h.startService(intent);
            }
            this.I = true;
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Message message) {
        Object obj;
        this.f4409q = false;
        if (message == null || (obj = message.obj) == null) {
            return;
        }
        LocationClientOption locationClientOption = (LocationClientOption) obj;
        if (this.f4397e.optionEquals(locationClientOption)) {
            return;
        }
        a aVar = null;
        if (this.f4397e.scanSpan != locationClientOption.scanSpan) {
            try {
                synchronized (this.f4413u) {
                    try {
                        if (this.f4410r) {
                            this.f4402j.removeCallbacks(this.f4411s);
                            this.f4410r = false;
                        }
                        if (locationClientOption.scanSpan >= 1000 && !this.f4410r) {
                            if (this.f4411s == null) {
                                this.f4411s = new d(this, aVar);
                            }
                            this.f4402j.postDelayed(this.f4411s, locationClientOption.scanSpan);
                            this.f4410r = true;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Exception unused) {
            }
        }
        this.f4397e = new LocationClientOption(locationClientOption);
        if (this.f4401i != null && com.baidu.location.e.i.g(this.f4400h) >= 1) {
            try {
                Message obtain = Message.obtain((Handler) null, 15);
                obtain.replyTo = this.f4403k;
                obtain.setData(d());
                this.f4401i.send(obtain);
            } catch (Exception e8) {
                e8.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Message message, int i8) {
        if (this.f4399g) {
            try {
                Bundle data = message.getData();
                data.setClassLoader(BDLocation.class.getClassLoader());
                BDLocation bDLocation = (BDLocation) data.getParcelable("locStr");
                this.f4406n = bDLocation;
                if (bDLocation.getLocType() == 61) {
                    this.f4414v = System.currentTimeMillis();
                }
                if (this.f4406n.getLocType() == 61 || this.f4406n.getLocType() == 161) {
                    com.baidu.location.b.a.a().a(this.f4406n.getLatitude(), this.f4406n.getLongitude(), this.f4406n.getCoorType());
                }
                a(i8);
            } catch (Exception unused) {
            }
        }
    }

    private void a(BDLocation bDLocation) {
        ArrayList<BDLocationListener> arrayList = this.f4404l;
        if (arrayList != null) {
            Iterator<BDLocationListener> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().onReceiveLocation(bDLocation);
            }
        }
        ArrayList<BDAbstractLocationListener> arrayList2 = this.f4405m;
        if (arrayList2 != null) {
            Iterator<BDAbstractLocationListener> it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                it2.next().onReceiveLocation(bDLocation);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z7) {
        try {
            Intent intent = new Intent(this.f4400h, (Class<?>) f.class);
            intent.putExtra("removenotify", z7);
            intent.putExtra("command", 2);
            this.f4400h.startService(intent);
            this.I = true;
        } catch (Exception unused) {
        }
    }
}
