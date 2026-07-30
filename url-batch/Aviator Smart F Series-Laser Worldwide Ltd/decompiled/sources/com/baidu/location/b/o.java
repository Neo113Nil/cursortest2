package com.baidu.location.b;

import android.location.Location;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.baidu.location.BDLocation;
import com.baidu.location.Jni;
import com.baidu.platform.comapi.map.MapBundleKey;
import com.google.android.material.timepicker.TimeModel;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public static String f4803a;

    /* renamed from: h, reason: collision with root package name */
    public a f4810h;

    /* renamed from: b, reason: collision with root package name */
    public com.baidu.location.c.m f4804b = null;

    /* renamed from: c, reason: collision with root package name */
    public com.baidu.location.c.b f4805c = null;

    /* renamed from: d, reason: collision with root package name */
    public HashSet<String> f4806d = null;

    /* renamed from: e, reason: collision with root package name */
    private boolean f4807e = true;

    /* renamed from: f, reason: collision with root package name */
    private boolean f4808f = true;

    /* renamed from: g, reason: collision with root package name */
    private boolean f4809g = false;

    /* renamed from: i, reason: collision with root package name */
    private long f4811i = 0;

    /* renamed from: j, reason: collision with root package name */
    final Handler f4812j = new b();

    /* renamed from: k, reason: collision with root package name */
    private String f4813k = null;

    /* renamed from: l, reason: collision with root package name */
    private String f4814l = null;

    /* renamed from: m, reason: collision with root package name */
    private boolean f4815m = false;

    /* renamed from: n, reason: collision with root package name */
    private long f4816n = 0;

    /* renamed from: o, reason: collision with root package name */
    private int f4817o = 0;

    static class a extends com.baidu.location.e.g {

        /* renamed from: o, reason: collision with root package name */
        private long f4818o;

        /* renamed from: p, reason: collision with root package name */
        private int f4819p;

        public a() {
            this.f5229g = new HashMap();
        }

        @Override // com.baidu.location.e.g
        public void a() {
            StringBuffer stringBuffer = new StringBuffer(256);
            stringBuffer.append("os=A");
            stringBuffer.append(Build.VERSION.SDK_INT);
            stringBuffer.append("&prod=");
            stringBuffer.append(com.baidu.location.e.c.f5164a);
            stringBuffer.append("&resid=");
            stringBuffer.append("12");
            String str = com.baidu.location.e.c.f5168e;
            if (str == null) {
                str = "";
            }
            stringBuffer.append("&mapver=");
            stringBuffer.append(str);
            stringBuffer.append(com.baidu.location.e.i.e(com.baidu.location.f.getServiceContext()));
            stringBuffer.append("&cu=");
            stringBuffer.append(com.baidu.location.e.c.a().b());
            stringBuffer.append("&error=");
            stringBuffer.append(this.f4819p);
            if (this.f4818o > 0) {
                stringBuffer.append("&tm=");
                stringBuffer.append(this.f4818o);
            }
            this.f5229g.put("info", Jni.encodeTp4(stringBuffer.toString()));
            this.f5229g.put("qt", "monitor");
        }

        @Override // com.baidu.location.e.g
        public void a(boolean z7) {
            Map<String, Object> map = this.f5229g;
            if (map != null) {
                map.clear();
            }
        }
    }

    public class b extends Handler {
        public b() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (com.baidu.location.f.isServing) {
                int i8 = message.what;
                if (i8 == 21) {
                    o.this.a(message);
                } else if (i8 == 62 || i8 == 63) {
                    o.this.a();
                }
            }
        }
    }

    class c extends com.baidu.location.e.g {

        /* renamed from: o, reason: collision with root package name */
        String f4821o = null;

        /* renamed from: p, reason: collision with root package name */
        String f4822p = null;

        /* renamed from: q, reason: collision with root package name */
        long f4823q = 0;

        /* renamed from: r, reason: collision with root package name */
        long f4824r = 0;

        /* renamed from: s, reason: collision with root package name */
        long f4825s = 0;

        public c() {
            this.f5229g = new HashMap();
        }

        @Override // com.baidu.location.e.g
        public void a() {
            if ((com.baidu.location.e.i.f5265f || com.baidu.location.e.i.f5269h) && o.this.f4813k != null && o.this.f4814l != null) {
                this.f4822p += String.format(Locale.CHINA, "&ki=%s&sn=%s", o.this.f4813k, o.this.f4814l);
            }
            if (p.a().b()) {
                this.f4822p += "&enc=2";
            }
            String q8 = com.baidu.location.c.h.a().q();
            if (q8 != null) {
                this.f5235m = Jni.encodeTp4(q8);
            }
            String encodeTp4 = Jni.encodeTp4(this.f4822p);
            this.f4822p = null;
            if (this.f4821o == null) {
                this.f4821o = b0.b();
            }
            this.f5229g.put("bloc", encodeTp4);
            String str = this.f4821o;
            if (str != null) {
                this.f5229g.put(MapBundleKey.OfflineMapKey.OFFLINE_UPDATE, str);
            }
            this.f5229g.put("trtm", String.format(Locale.CHINA, TimeModel.NUMBER_FORMAT, Long.valueOf(System.currentTimeMillis())));
            this.f5236n = 0L;
        }

        public void a(String str, long j8) {
            this.f4822p = str;
            this.f4824r = System.currentTimeMillis();
            this.f4823q = j8;
            ExecutorService b8 = z.a().b();
            if (com.baidu.location.e.i.b()) {
                a(b8, false, null);
            } else if (b8 != null) {
                a(b8, com.baidu.location.e.e.f5203b);
            } else {
                b(com.baidu.location.e.e.f5203b);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:3:0x000c, code lost:
        
            r12 = r11.f5227e;
         */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0128  */
        /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
        @Override // com.baidu.location.e.g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void a(boolean z7) {
            Map<String, Object> map;
            String str;
            BDLocation bDLocation;
            Message obtainMessage;
            if (z7 && str != null) {
                try {
                    o.f4803a = str;
                    if (str.contains("enc3")) {
                        str = com.baidu.location.e.i.d(str);
                    } else if (str.contains("enc") && p.a().b()) {
                        try {
                            JSONObject jSONObject = new JSONObject(str);
                            if (jSONObject.has("enc")) {
                                str = p.a().b(jSONObject.getString("enc"));
                            }
                        } catch (Exception unused) {
                        }
                    }
                    int i8 = 1;
                    if (str.contains("net_loc_save")) {
                        try {
                            JSONObject jSONObject2 = new JSONObject(str);
                            JSONObject jSONObject3 = jSONObject2.has(FirebaseAnalytics.Param.CONTENT) ? jSONObject2.getJSONObject(FirebaseAnalytics.Param.CONTENT) : null;
                            if (jSONObject3 != null && jSONObject3.has("net_loc_save")) {
                                i8 = jSONObject3.optInt("net_loc_save", 1);
                            }
                        } catch (Exception unused2) {
                        }
                    }
                    try {
                        bDLocation = new BDLocation(str);
                        bDLocation.getLocType();
                        if (com.baidu.location.e.i.h(com.baidu.location.f.getServiceContext()) && bDLocation.getLocType() == 161) {
                            bDLocation.setLocType(BDLocation.TypeCoarseLocation);
                            bDLocation.setRadius(2000.0f);
                        }
                        if (bDLocation.getLocType() == 161) {
                            m.a().a(str);
                        }
                        if (w.a().d()) {
                            bDLocation.setDirection(w.a().e());
                        }
                    } catch (Exception e8) {
                        e8.printStackTrace();
                        bDLocation = new BDLocation();
                        bDLocation.setLocType(0);
                    }
                    this.f4821o = null;
                    if (bDLocation.getLocType() == 0 && bDLocation.getLatitude() == Double.MIN_VALUE && bDLocation.getLongitude() == Double.MIN_VALUE) {
                        obtainMessage = o.this.f4812j.obtainMessage(63);
                        obtainMessage.obj = "HttpStatus error";
                    } else {
                        long currentTimeMillis = (System.currentTimeMillis() - this.f4824r) / 1000;
                        if (currentTimeMillis < 0) {
                            currentTimeMillis = 0;
                        }
                        if (this.f4823q < 0) {
                            this.f4823q = 0L;
                        }
                        bDLocation.setDelayTime(this.f4823q + currentTimeMillis);
                        obtainMessage = o.this.f4812j.obtainMessage(21);
                        obtainMessage.obj = bDLocation;
                        obtainMessage.arg1 = i8;
                    }
                    obtainMessage.sendToTarget();
                } catch (Exception unused3) {
                }
                map = this.f5229g;
                if (map == null) {
                    map.clear();
                    return;
                }
                return;
            }
            Message obtainMessage2 = o.this.f4812j.obtainMessage(63);
            obtainMessage2.obj = "HttpStatus error";
            obtainMessage2.sendToTarget();
            map = this.f5229g;
            if (map == null) {
            }
        }
    }

    public abstract void a();

    public abstract void a(Message message);

    public String b() {
        String c8 = d.a().c();
        String format = com.baidu.location.c.h.a().l() ? "&cn=32" : String.format(Locale.CHINA, "&cn=%d", Integer.valueOf(com.baidu.location.c.h.a().g()));
        if (System.currentTimeMillis() - this.f4816n > 60000) {
            this.f4816n = System.currentTimeMillis();
            String c9 = com.baidu.location.e.i.c();
            if (!TextUtils.isEmpty(c9)) {
                format = format + "&qcip6c=" + c9;
            }
        }
        if (this.f4807e) {
            this.f4807e = false;
        } else if (!this.f4809g) {
            String e8 = b0.e();
            if (e8 != null) {
                format = format + e8;
            }
            this.f4809g = true;
        }
        return format + c8;
    }

    public String a(String str) {
        com.baidu.location.c.m mVar;
        String o8;
        if (this.f4813k == null) {
            this.f4813k = com.baidu.location.a.a.b(com.baidu.location.f.getServiceContext());
        }
        if (this.f4814l == null) {
            this.f4814l = com.baidu.location.a.a.c(com.baidu.location.f.getServiceContext());
        }
        com.baidu.location.c.b bVar = this.f4805c;
        if (bVar == null || !bVar.a()) {
            this.f4805c = com.baidu.location.c.h.a().f();
        }
        com.baidu.location.c.m mVar2 = this.f4804b;
        if (mVar2 == null || !mVar2.b()) {
            this.f4804b = com.baidu.location.c.h.a().r();
        }
        Location g8 = com.baidu.location.c.f.a().j() ? com.baidu.location.c.f.a().g() : null;
        com.baidu.location.c.b bVar2 = this.f4805c;
        if ((bVar2 == null || bVar2.d() || this.f4805c.c()) && (((mVar = this.f4804b) == null || mVar.a() == 0) && g8 == null)) {
            return null;
        }
        String b8 = b();
        if (m.a().d() == -2) {
            b8 = b8 + "&imo=1";
        }
        int b9 = com.baidu.location.e.i.b(com.baidu.location.f.getServiceContext());
        if (b9 >= 0) {
            b8 = b8 + "&lmd=" + b9;
            if (Build.VERSION.SDK_INT >= 28 && !this.f4815m) {
                this.f4815m = true;
                try {
                    if (com.baidu.location.f.getServiceContext().getPackageManager().hasSystemFeature("android.hardware.wifi.rtt")) {
                        b8 = b8 + "&rtt=1";
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
        com.baidu.location.c.m mVar3 = this.f4804b;
        if ((mVar3 == null || mVar3.a() == 0) && (o8 = com.baidu.location.c.h.a().o()) != null) {
            b8 = o8 + b8;
        }
        if (com.baidu.location.c.h.a().m()) {
            b8 = b8 + "&wf_freq=1";
        }
        String str2 = b8;
        if (!this.f4808f) {
            return com.baidu.location.e.i.a(this.f4805c, this.f4804b, g8, str2, 0);
        }
        this.f4808f = false;
        return com.baidu.location.e.i.a(this.f4805c, this.f4804b, g8, str2, 0, true);
    }
}
