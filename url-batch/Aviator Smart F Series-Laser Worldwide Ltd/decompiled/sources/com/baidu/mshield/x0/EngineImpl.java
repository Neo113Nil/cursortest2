package com.baidu.mshield.x0;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.text.TextUtils;
import com.baidu.mshield.x0.d.d;
import com.baidu.mshield.x0.d.e;
import com.baidu.mshield.x0.d.g;
import com.baidu.mshield.x0.j.a;
import com.baidu.mshield.x0.l.c;
import com.baidu.mshield.x0.receiver.ReceiverWork;
import java.util.HashMap;
import java.util.Timer;
import java.util.TimerTask;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class EngineImpl {
    public static final String KEY_ACCOUNT_ID = "aid";
    public static final String KEY_ANDROID_ID = "arid";
    public static final String KEY_ANDROID_LEVEL = "arl";
    public static final String KEY_ANDROID_VERSION = "arv";
    public static final String KEY_CUID = "cuid";
    public static final String KEY_MODEL = "mod";
    public static final String KEY_PACKAGE = "p";
    public static final String KEY_SENSOR_LIST = "sl";
    public static final String KEY_SIGNATURE = "s";
    public static final String KEY_WIFI_STATE = "ws";
    public static boolean isUnload = false;
    public static Context mContext = null;
    public static String sAppkey = "";
    private static EngineImpl sInstance = null;
    public static boolean sIsArm = true;
    public static boolean sIsX86 = false;
    public static String sSecKey = "";
    public String ids = "{}";
    private IntentFilter mSecAlarmFilter;
    private IntentFilter mSecSystemFilter;
    private com.baidu.mshield.x0.l.a pref;
    private ReceiverWork secReceiver;
    private c sofirePreferences;
    public static final HashMap<String, String> PROPERTY_MAP = new HashMap<>();
    public static int sScreenStatus = 1;
    public static String sLoadVersion = com.baidu.mshield.x0.a.f8414c;
    public static String secName = com.baidu.mshield.x0.a.f8415d;
    public static String secPackageName = com.baidu.mshield.x0.a.f8412a;

    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f8408a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f8409b;

        public a(int i8, boolean z7) {
            this.f8408a = i8;
            this.f8409b = z7;
        }

        @Override // java.lang.Runnable
        public void run() {
            EngineImpl.this.doInit(this.f8408a, this.f8409b);
        }
    }

    public class b extends com.baidu.mshield.x0.d.h.b {

        public class a extends TimerTask {
            public a(b bVar) {
            }

            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                d.b(EngineImpl.mContext);
            }
        }

        public b() {
        }

        @Override // com.baidu.mshield.x0.d.h.b
        public void b() {
            try {
                com.baidu.mshield.b.c.a.b("setAliveDate");
                d.q(EngineImpl.mContext);
                d.a(EngineImpl.mContext.getApplicationContext(), com.baidu.mshield.x0.a.f8415d, com.baidu.mshield.x0.a.f8412a, EngineImpl.sLoadVersion, "1001003", "1001002");
                if (EngineImpl.this.pref.d("1001003").equals("")) {
                    new Timer().schedule(new a(this), 60000L);
                } else {
                    d.b(EngineImpl.mContext);
                }
            } catch (Throwable th) {
                d.a(th);
            }
        }
    }

    private EngineImpl(Context context) {
        mContext = context;
        this.pref = new com.baidu.mshield.x0.l.a(context);
        this.sofirePreferences = new c(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doInit(int i8, boolean z7) {
        try {
            isUnload = false;
            d.m(mContext);
            com.baidu.xclient.gdid.a.a(mContext, sAppkey, sSecKey);
            this.pref.g(sLoadVersion);
            registerReceiver();
            com.baidu.mshield.x0.d.b.a(mContext, true);
            initReport();
            setAlarms();
            com.baidu.mshield.x0.c.a.a(mContext);
            com.baidu.mshield.x0.c.c.a(mContext);
            com.baidu.mshield.x6.EngineImpl.getInstance(mContext).init(i8, z7);
            com.baidu.mshield.x6.EngineImpl.getInstance(mContext).setSecImpl(new com.baidu.mshield.x0.b());
        } catch (Throwable th) {
            d.a(th);
        }
    }

    public static synchronized EngineImpl getInstance(Context context) {
        EngineImpl engineImpl;
        synchronized (EngineImpl.class) {
            try {
                if (sInstance == null) {
                    sInstance = new EngineImpl(context);
                }
                engineImpl = sInstance;
            } catch (Throwable th) {
                throw th;
            }
        }
        return engineImpl;
    }

    private void handleTokenLogic() {
        try {
            if (d.a(mContext, "plc95", false, this.pref)) {
                long currentTimeMillis = System.currentTimeMillis();
                com.baidu.mshield.x6.b.b bVar = new com.baidu.mshield.x6.b.b(mContext);
                String B = bVar.B();
                int w7 = bVar.w();
                int v7 = bVar.v();
                JSONArray jSONArray = TextUtils.isEmpty(B) ? new JSONArray() : new JSONArray(B);
                if (jSONArray.length() + 1 > w7) {
                    jSONArray.remove(0);
                }
                StringBuilder sb = new StringBuilder();
                int i8 = v7 + 1;
                sb.append(i8);
                sb.append("#");
                sb.append(this.sofirePreferences.d());
                sb.append("#");
                sb.append(currentTimeMillis);
                jSONArray.put(sb.toString());
                bVar.a(i8);
                bVar.j(jSONArray.toString());
                String e8 = this.sofirePreferences.e();
                long o8 = this.pref.o();
                long currentTimeMillis2 = System.currentTimeMillis();
                d.a(mContext, "plc95", new com.baidu.mshield.x0.d.c(), this.pref);
                long j8 = r7.f8431d * 60000;
                if (TextUtils.isEmpty(e8)) {
                    new com.baidu.mshield.x0.h.a().a(mContext, 6, 1, j8);
                    this.pref.f(currentTimeMillis2);
                } else if (currentTimeMillis2 - o8 >= j8) {
                    this.sofirePreferences.d(e8);
                    this.sofirePreferences.e("");
                    this.pref.f(currentTimeMillis2);
                    new com.baidu.mshield.x0.h.a().a(mContext, 6, 1, j8);
                }
            }
        } catch (Throwable th) {
            d.a(th);
        }
    }

    private void initReport() {
        com.baidu.mshield.x0.d.h.d.b().a(new b());
    }

    private void registerReceiver() {
        try {
            this.secReceiver = new ReceiverWork();
            if (this.mSecAlarmFilter == null) {
                IntentFilter intentFilter = new IntentFilter();
                this.mSecAlarmFilter = intentFilter;
                intentFilter.addAction("com.baidu.mshield.x0.alarm.action");
                if (Build.VERSION.SDK_INT >= 33) {
                    try {
                        mContext.registerReceiver(this.secReceiver, this.mSecAlarmFilter, 4);
                    } catch (Throwable th) {
                        d.a(th);
                    }
                } else {
                    mContext.registerReceiver(this.secReceiver, this.mSecAlarmFilter);
                }
            }
        } catch (Throwable th2) {
            d.a(th2);
        }
    }

    private void setAlarms() {
        long currentTimeMillis;
        try {
            com.baidu.mshield.x0.l.a aVar = new com.baidu.mshield.x0.l.a(mContext);
            com.baidu.mshield.x0.d.b.a(mContext, false);
            long n8 = aVar.n();
            if (n8 == 0) {
                currentTimeMillis = com.baidu.mshield.x0.d.b.b(mContext) * 60000;
                aVar.e(System.currentTimeMillis() + currentTimeMillis);
            } else {
                currentTimeMillis = n8 - System.currentTimeMillis();
                if (currentTimeMillis < 0) {
                    currentTimeMillis = 50;
                }
            }
            com.baidu.mshield.x0.d.b.a(mContext, currentTimeMillis);
        } catch (Throwable th) {
            d.a(th);
        }
    }

    public int adm(String str) {
        return 0;
    }

    public int aen(String str) {
        return 0;
    }

    public String getAidFWM() {
        return e.a(mContext);
    }

    public String getIccFWM() {
        return "";
    }

    public String getIds() {
        return this.ids;
    }

    public String getImeFWM() {
        return "";
    }

    public String getImsFWM() {
        return "";
    }

    public String getMaFWM() {
        return "";
    }

    public String getNui() {
        return g.b(mContext);
    }

    public String getPropertyByType(String str) {
        try {
            HashMap<String, String> hashMap = PROPERTY_MAP;
            if (hashMap.size() <= 0) {
                return "";
            }
            synchronized (hashMap) {
                try {
                    if (!hashMap.containsKey(str)) {
                        return "";
                    }
                    return hashMap.get(str);
                } finally {
                }
            }
        } catch (Throwable th) {
            d.a(th);
            return "";
        }
    }

    public int gpol() {
        return com.baidu.mshield.x0.j.a.a(mContext).a((a.b) null, false);
    }

    public String gtdid() {
        try {
            return com.baidu.xclient.gdid.a.b();
        } catch (Throwable th) {
            d.a(th);
            return "";
        }
    }

    public String ice() {
        return ice(-1);
    }

    public synchronized boolean init(int i8, boolean z7) {
        new Thread(new a(i8, z7)).start();
        return true;
    }

    public String mqa(int i8, String str, int i9) {
        return "";
    }

    public void reportAlive() {
        d.b(mContext);
    }

    public void sendWMCrashLog(int i8) {
        try {
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("0", i8);
            jSONArray.put(jSONObject);
            d.a(mContext, jSONArray, "1001133");
        } catch (Throwable th) {
            d.a(th);
        }
    }

    public void setBusy(boolean z7) {
    }

    public void setPkgNameVersion(String str, String str2) {
        try {
            com.baidu.mshield.b.c.a.b("p : " + str + " : v : " + str2);
            com.baidu.mshield.x6.EngineImpl.getInstance(mContext).setPkgNameVersion(str, str2);
            if (!TextUtils.isEmpty(str)) {
                com.baidu.mshield.x0.a.f8412a = str;
            }
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            sLoadVersion = str2;
            this.pref.g(str2);
        } catch (Throwable th) {
            d.a(th);
        }
    }

    public void setRunStatus(int i8) {
        try {
            this.pref.e(i8);
            com.baidu.mshield.x6.EngineImpl.getInstance(mContext).setRunStatus(i8);
        } catch (Throwable th) {
            d.a(th);
        }
    }

    public void setSecurityVerifyInfo(String str, String str2, HashMap<String, String> hashMap) {
        try {
            com.baidu.mshield.b.c.a.b("a : " + str + " s : " + str2);
            com.baidu.mshield.x6.EngineImpl.getInstance(mContext).setSecurityVerifyInfo(str, str2, hashMap);
            com.baidu.xclient.gdid.a.a(mContext, str, str2, hashMap);
            sAppkey = str;
            sSecKey = str2;
            if (hashMap != null) {
                HashMap<String, String> hashMap2 = PROPERTY_MAP;
                synchronized (hashMap2) {
                    hashMap2.putAll(hashMap);
                }
            }
        } catch (Throwable th) {
            d.a(th);
        }
    }

    public Boolean stop() {
        return Boolean.TRUE;
    }

    public void ud(HashMap<String, String> hashMap) {
        if (hashMap != null) {
            try {
                if (hashMap.size() == 0) {
                    return;
                }
                synchronized (PROPERTY_MAP) {
                    try {
                        for (String str : hashMap.keySet()) {
                            PROPERTY_MAP.put(str, hashMap.get(str));
                        }
                    } finally {
                    }
                }
                com.baidu.mshield.x6.EngineImpl.getInstance(mContext).ud(hashMap);
            } catch (Throwable th) {
                d.a(th);
            }
        }
    }

    public void unload() {
        try {
            mContext.unregisterReceiver(this.secReceiver);
        } catch (Throwable th) {
            d.a(th);
        }
        com.baidu.mshield.x0.d.b.a(mContext);
        stop();
        com.baidu.mshield.x0.e.a.a().b();
        com.baidu.xclient.gdid.a.c();
        com.baidu.mshield.x0.d.h.d.b().c();
        com.baidu.mshield.x6.EngineImpl.getInstance(mContext).unload();
        isUnload = true;
    }

    public String uqi() {
        return "";
    }

    public String xgz(String str) {
        return "";
    }

    public String ice(int i8) {
        return ice("", i8);
    }

    public String ice(String str, int i8) {
        return ice(str, i8, "");
    }

    public String ice(String str, int i8, String str2) {
        handleTokenLogic();
        return com.baidu.mshield.x0.g.a.a(mContext, str, i8, str2);
    }
}
