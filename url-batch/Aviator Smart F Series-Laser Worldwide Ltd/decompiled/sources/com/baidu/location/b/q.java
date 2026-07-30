package com.baidu.location.b;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.webkit.JavascriptInterface;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.baidu.location.BDAbstractLocationListener;
import com.baidu.location.BDLocation;
import com.baidu.location.LocationClient;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class q {

    /* renamed from: a, reason: collision with root package name */
    private static long f4830a = 12000;

    /* renamed from: b, reason: collision with root package name */
    private Context f4831b;

    /* renamed from: c, reason: collision with root package name */
    private WebView f4832c;

    /* renamed from: d, reason: collision with root package name */
    private LocationClient f4833d;

    /* renamed from: e, reason: collision with root package name */
    public f f4834e;

    /* renamed from: f, reason: collision with root package name */
    private b f4835f;

    /* renamed from: g, reason: collision with root package name */
    private List<c> f4836g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f4837h;

    /* renamed from: i, reason: collision with root package name */
    private long f4838i;

    /* renamed from: j, reason: collision with root package name */
    private BDLocation f4839j;

    /* renamed from: k, reason: collision with root package name */
    private g f4840k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f4841l;

    private class b extends Handler {
        b(Looper looper) {
            super(looper);
        }

        private String a(BDLocation bDLocation) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(d2.c.XML_TAG_LATITUDE, bDLocation.getLatitude());
                jSONObject.put(d2.c.XML_TAG_LONGITUDE, bDLocation.getLongitude());
                jSONObject.put("radius", bDLocation.getRadius());
                jSONObject.put("errorcode", 1);
                if (bDLocation.hasAltitude()) {
                    jSONObject.put("altitude", bDLocation.getAltitude());
                }
                if (bDLocation.hasSpeed()) {
                    jSONObject.put("speed", bDLocation.getSpeed() / 3.6f);
                }
                if (bDLocation.getLocType() == 61) {
                    jSONObject.put("direction", bDLocation.getDirection());
                }
                if (bDLocation.getBuildingName() != null) {
                    jSONObject.put("buildingname", bDLocation.getBuildingName());
                }
                if (bDLocation.getBuildingID() != null) {
                    jSONObject.put("buildingid", bDLocation.getBuildingID());
                }
                if (bDLocation.getFloor() != null) {
                    jSONObject.put("floor", bDLocation.getFloor());
                }
                return jSONObject.toString();
            } catch (Exception unused) {
                return null;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v9 */
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            String str = 0;
            str = 0;
            switch (message.what) {
                case 1:
                    c cVar = (c) message.obj;
                    if (q.this.f4836g != null) {
                        q.this.f4836g.add(cVar);
                    }
                    if (q.this.f4833d != null) {
                        if (q.this.f4833d.requestLocation() != 0) {
                            long currentTimeMillis = System.currentTimeMillis() - q.this.f4838i;
                            if (q.this.f4839j != null && currentTimeMillis <= 10000) {
                                Message obtainMessage = q.this.f4835f.obtainMessage(2);
                                obtainMessage.obj = q.this.f4839j;
                                obtainMessage.sendToTarget();
                                return;
                            }
                        }
                        if (q.this.f4841l) {
                            q.this.f4835f.removeCallbacks(q.this.f4840k);
                            q.this.f4841l = false;
                        }
                        if (q.this.f4840k == null) {
                            q qVar = q.this;
                            qVar.f4840k = new g();
                        }
                        q.this.f4835f.postDelayed(q.this.f4840k, q.f4830a);
                        q.this.f4841l = true;
                        return;
                    }
                    return;
                case 2:
                    a(a((BDLocation) message.obj));
                    return;
                case 3:
                    if (q.this.f4836g == null) {
                        q.this.f4836g = new ArrayList();
                    } else {
                        q.this.f4836g.clear();
                    }
                    q.this.f4833d.registerLocationListener(q.this.f4834e);
                    return;
                case 4:
                    if (q.this.f4836g != null) {
                        q.this.f4836g.clear();
                        q.this.f4836g = null;
                    }
                    q.this.f4833d.unRegisterLocationListener(q.this.f4834e);
                    q.this.f4838i = 0L;
                    q.this.f4839j = null;
                    if (q.this.f4840k != null && q.this.f4841l) {
                        q.this.f4835f.removeCallbacks(q.this.f4840k);
                    }
                    q.this.f4841l = false;
                    q.this.f4832c.removeJavascriptInterface("BaiduLocAssistant");
                    return;
                case 5:
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("errorcode", 0);
                        str = jSONObject.toString();
                    } catch (Exception unused) {
                    }
                    if (str == 0) {
                        return;
                    }
                    break;
                case 6:
                    try {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("errorcode", 2);
                        str = jSONObject2.toString();
                    } catch (Exception unused2) {
                    }
                    if (str == 0) {
                        return;
                    }
                    break;
                default:
                    return;
            }
            a(str);
        }

        private void a(String str) {
            if (q.this.f4841l) {
                q.this.f4835f.removeCallbacks(q.this.f4840k);
                q.this.f4841l = false;
            }
            if (q.this.f4836g == null || q.this.f4836g.size() <= 0) {
                return;
            }
            Iterator it = q.this.f4836g.iterator();
            while (it.hasNext()) {
                try {
                    c cVar = (c) it.next();
                    if (cVar.b() != null) {
                        q.this.f4832c.loadUrl("javascript:" + cVar.b() + "('" + str + "')");
                    }
                    it.remove();
                } catch (Exception unused) {
                    return;
                }
            }
        }
    }

    private class c {

        /* renamed from: a, reason: collision with root package name */
        private String f4843a;

        /* renamed from: b, reason: collision with root package name */
        private String f4844b;

        /* renamed from: c, reason: collision with root package name */
        private long f4845c;

        c(String str) {
            this.f4843a = null;
            this.f4844b = null;
            this.f4845c = 0L;
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("action")) {
                    this.f4843a = jSONObject.getString("action");
                }
                if (jSONObject.has("callback")) {
                    this.f4844b = jSONObject.getString("callback");
                }
                if (jSONObject.has("timeout")) {
                    long j8 = jSONObject.getLong("timeout");
                    if (j8 >= 1000) {
                        long unused = q.f4830a = j8;
                    }
                }
                this.f4845c = System.currentTimeMillis();
            } catch (Exception unused2) {
                this.f4843a = null;
                this.f4844b = null;
            }
        }

        public String a() {
            return this.f4843a;
        }

        public String b() {
            return this.f4844b;
        }
    }

    private static final class d {

        /* renamed from: a, reason: collision with root package name */
        private static final q f4847a = new q();
    }

    private class e {
        private e() {
        }

        @JavascriptInterface
        public void sendMessage(String str) {
            if (str == null || !q.this.f4837h) {
                return;
            }
            c cVar = q.this.new c(str);
            if (cVar.a() == null || !cVar.a().equals("requestLoc") || q.this.f4835f == null) {
                return;
            }
            Message obtainMessage = q.this.f4835f.obtainMessage(1);
            obtainMessage.obj = cVar;
            obtainMessage.sendToTarget();
        }

        @JavascriptInterface
        public void showLog(String str) {
        }
    }

    public class f extends BDAbstractLocationListener {
        public f() {
        }

        @Override // com.baidu.location.BDAbstractLocationListener
        public void onReceiveLocation(BDLocation bDLocation) {
            Message obtainMessage;
            String str;
            if (!q.this.f4837h || bDLocation == null) {
                return;
            }
            BDLocation bDLocation2 = new BDLocation(bDLocation);
            int locType = bDLocation2.getLocType();
            String coorType = bDLocation2.getCoorType();
            if (locType == 61 || locType == 161 || locType == 66) {
                if (coorType != null) {
                    if (coorType.equals("gcj02")) {
                        bDLocation2 = LocationClient.getBDLocationInCoorType(bDLocation2, "gcj2wgs");
                    } else {
                        if (coorType.equals("bd09")) {
                            str = BDLocation.BDLOCATION_BD09_TO_GCJ02;
                        } else if (coorType.equals("bd09ll")) {
                            str = BDLocation.BDLOCATION_BD09LL_TO_GCJ02;
                        }
                        bDLocation2 = LocationClient.getBDLocationInCoorType(LocationClient.getBDLocationInCoorType(bDLocation2, str), "gcj2wgs");
                    }
                }
                q.this.f4838i = System.currentTimeMillis();
                q.this.f4839j = new BDLocation(bDLocation2);
                obtainMessage = q.this.f4835f.obtainMessage(2);
                obtainMessage.obj = bDLocation2;
            } else {
                obtainMessage = q.this.f4835f.obtainMessage(5);
            }
            obtainMessage.sendToTarget();
        }
    }

    private class g implements Runnable {
        private g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            q.this.f4841l = false;
            q.this.f4835f.obtainMessage(6).sendToTarget();
        }
    }

    private q() {
        this.f4831b = null;
        this.f4833d = null;
        this.f4834e = new f();
        this.f4835f = null;
        this.f4836g = null;
        this.f4837h = false;
        this.f4838i = 0L;
        this.f4839j = null;
        this.f4840k = null;
        this.f4841l = false;
    }

    public void b() {
        if (this.f4837h) {
            this.f4835f.obtainMessage(4).sendToTarget();
            this.f4837h = false;
        }
    }

    public static q a() {
        return d.f4847a;
    }

    public void a(Context context, WebView webView, LocationClient locationClient) {
        if (!this.f4837h && Integer.valueOf(Build.VERSION.SDK_INT).intValue() >= 17) {
            this.f4831b = context;
            this.f4832c = webView;
            this.f4833d = locationClient;
            b bVar = new b(Looper.getMainLooper());
            this.f4835f = bVar;
            bVar.obtainMessage(3).sendToTarget();
            WebSettings settings = webView.getSettings();
            settings.setJavaScriptEnabled(true);
            settings.setAllowFileAccess(false);
            settings.setSavePassword(false);
            this.f4832c.removeJavascriptInterface("searchBoxJavaBridge_");
            this.f4832c.removeJavascriptInterface("accessibility");
            this.f4832c.removeJavascriptInterface("accessibilityTraversal");
            a(this.f4832c);
            this.f4837h = true;
        }
    }

    @SuppressLint({"JavascriptInterface", "AddJavascriptInterface"})
    private void a(WebView webView) {
        webView.addJavascriptInterface(new e(), "BaiduLocAssistant");
    }
}
