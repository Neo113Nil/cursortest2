package com.baidu.lbsapi.auth;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Log;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.baidu.android.bbalbs.common.util.DeviceId;
import com.baidu.lbsapi.auth.e;
import com.baidu.lbsapi.auth.f;
import com.baidu.mapapi.http.wrapper.annotation.BodyData;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class LBSAuthManager {
    public static final int CODE_AUTHENTICATE_SUCC = 0;
    public static final int CODE_AUTHENTICATING = 602;
    public static final int CODE_INNER_ERROR = -1;
    public static final int CODE_KEY_NOT_EXIST = 101;
    public static final int CODE_NETWORK_FAILED = -11;
    public static final int CODE_NETWORK_INVALID = -10;
    public static final int CODE_UNAUTHENTICATE = 601;
    public static final String VERSION = "1.0.32";

    /* renamed from: a, reason: collision with root package name */
    private static Context f4279a = null;

    /* renamed from: b, reason: collision with root package name */
    private static String f4280b = null;

    /* renamed from: c, reason: collision with root package name */
    private static int f4281c = -1;

    /* renamed from: d, reason: collision with root package name */
    private static String f4282d;

    /* renamed from: e, reason: collision with root package name */
    private static String f4283e;

    /* renamed from: f, reason: collision with root package name */
    private static h f4284f;

    /* renamed from: g, reason: collision with root package name */
    private static int f4285g;

    /* renamed from: i, reason: collision with root package name */
    private static LBSAuthManager f4287i;

    /* renamed from: r, reason: collision with root package name */
    private byte[] f4296r;

    /* renamed from: h, reason: collision with root package name */
    private static Hashtable<String, LBSAuthManagerListener> f4286h = new Hashtable<>();

    /* renamed from: j, reason: collision with root package name */
    private static String f4288j = "";

    /* renamed from: k, reason: collision with root package name */
    private static String f4289k = "";

    /* renamed from: l, reason: collision with root package name */
    private static String f4290l = "";

    /* renamed from: m, reason: collision with root package name */
    private static boolean f4291m = false;

    /* renamed from: n, reason: collision with root package name */
    private static String f4292n = null;

    /* renamed from: o, reason: collision with root package name */
    private e f4293o = null;

    /* renamed from: p, reason: collision with root package name */
    private f f4294p = null;

    /* renamed from: q, reason: collision with root package name */
    private boolean f4295q = false;

    /* renamed from: s, reason: collision with root package name */
    private final Handler f4297s = new a(Looper.getMainLooper());

    class a extends Handler {
        a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            com.baidu.lbsapi.auth.b.a("handleMessage !!");
            if (message.what == 0) {
                LBSAuthManager.this.b((JSONObject) message.obj);
            }
            LBSAuthManagerListener lBSAuthManagerListener = (LBSAuthManagerListener) LBSAuthManager.f4286h.get(message.getData().getString("listenerKey"));
            com.baidu.lbsapi.auth.b.a("handleMessage listener = " + lBSAuthManagerListener);
            if (lBSAuthManagerListener != null) {
                lBSAuthManagerListener.onAuthResult(message.what, message.obj.toString());
            }
        }
    }

    class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f4299a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f4300b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f4301c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f4302d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Hashtable f4303e;

        b(int i8, boolean z7, String str, String str2, Hashtable hashtable) {
            this.f4299a = i8;
            this.f4300b = z7;
            this.f4301c = str;
            this.f4302d = str2;
            this.f4303e = hashtable;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.baidu.lbsapi.auth.b.a("status = " + this.f4299a + "; forced = " + this.f4300b + "checkAK = " + LBSAuthManager.this.a(this.f4301c, this.f4302d));
            int i8 = this.f4299a;
            if (i8 != 601 && !this.f4300b && i8 != -1 && !LBSAuthManager.this.a(this.f4301c, this.f4302d)) {
                if (602 == this.f4299a) {
                    com.baidu.lbsapi.auth.b.a("authenticate wait ");
                    if (LBSAuthManager.f4284f != null) {
                        LBSAuthManager.f4284f.c();
                    }
                } else {
                    com.baidu.lbsapi.auth.b.a("authenticate else");
                }
                LBSAuthManager.this.a(this.f4301c, (String) null, this.f4302d);
                return;
            }
            com.baidu.lbsapi.auth.b.a("authenticate sendAuthRequest");
            String[] b8 = com.baidu.lbsapi.auth.d.b(LBSAuthManager.f4279a);
            if (b8 == null || b8.length <= 1) {
                LBSAuthManager.this.a(this.f4300b, this.f4301c, this.f4303e, this.f4302d, LBSAuthManager.f4280b, LBSAuthManager.f4281c, LBSAuthManager.f4282d, LBSAuthManager.f4283e);
                return;
            }
            com.baidu.lbsapi.auth.b.a("authStrings.length:" + b8.length);
            com.baidu.lbsapi.auth.b.a("more sha1 auth");
            LBSAuthManager.this.a(this.f4300b, this.f4301c, (Hashtable<String, String>) this.f4303e, b8, this.f4302d, LBSAuthManager.f4280b, LBSAuthManager.f4281c, LBSAuthManager.f4282d, LBSAuthManager.f4283e);
        }
    }

    class c implements e.b<String> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f4305a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f4306b;

        c(String str, String str2) {
            this.f4305a = str;
            this.f4306b = str2;
        }

        @Override // com.baidu.lbsapi.auth.e.b
        public void a(String str) {
            LBSAuthManager.this.a(this.f4305a, str, this.f4306b);
        }
    }

    class d implements f.b<String> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f4308a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f4309b;

        d(String str, String str2) {
            this.f4308a = str;
            this.f4309b = str2;
        }

        @Override // com.baidu.lbsapi.auth.f.b
        public void a(String str) {
            LBSAuthManager.this.a(this.f4308a, str, this.f4309b);
        }
    }

    private LBSAuthManager(Context context) {
        f4279a = context;
        h hVar = f4284f;
        if (hVar != null && !hVar.isAlive()) {
            f4284f = null;
        }
        com.baidu.lbsapi.auth.b.c("BaiduApiAuth SDK Version:1.0.32");
        h();
    }

    private String a(int i8) {
        FileInputStream fileInputStream;
        try {
            fileInputStream = new FileInputStream("/proc/" + i8 + "/cmdline");
            try {
                byte[] bArr = new byte[256];
                int i9 = 0;
                while (true) {
                    int read = fileInputStream.read();
                    if (read <= 0 || i9 >= 256) {
                        break;
                    }
                    bArr[i9] = (byte) read;
                    i9++;
                }
                if (i9 > 0) {
                    String str = new String(bArr, 0, i9, cn.hutool.core.util.l.UTF_8);
                    try {
                        fileInputStream.close();
                    } catch (IOException e8) {
                        e8.printStackTrace();
                    }
                    return str;
                }
            } catch (Throwable th) {
                th = th;
                try {
                    th.printStackTrace();
                } finally {
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException e9) {
                            e9.printStackTrace();
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
            fileInputStream = null;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x005c, code lost:
    
        if (r13.format(java.lang.Long.valueOf(r6)).equals(r13.format(java.lang.Long.valueOf(r4))) == false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int c(String str) {
        int i8 = -1;
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!jSONObject.has("status")) {
                jSONObject.put("status", -1);
            }
            i8 = jSONObject.getInt("status");
            if (jSONObject.has("current") && i8 == 0) {
                long j8 = jSONObject.getLong("current");
                long currentTimeMillis = System.currentTimeMillis();
                if ((currentTimeMillis - j8) / 3600000.0d < 24.0d) {
                    if (this.f4295q) {
                        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(cn.hutool.core.date.d.NORM_DATE_PATTERN);
                    }
                }
                i8 = 601;
            }
            if (jSONObject.has("current") && i8 == 602) {
                if ((System.currentTimeMillis() - jSONObject.getLong("current")) / 1000 > 180.0d) {
                    return 601;
                }
            }
        } catch (JSONException e8) {
            e8.printStackTrace();
        }
        return i8;
    }

    public static LBSAuthManager getInstance(Context context) {
        if (f4287i == null) {
            synchronized (LBSAuthManager.class) {
                try {
                    if (f4287i == null) {
                        f4287i = new LBSAuthManager(context);
                    }
                } finally {
                }
            }
        } else if (context != null) {
            f4279a = context;
        } else if (com.baidu.lbsapi.auth.b.f4311a) {
            com.baidu.lbsapi.auth.b.b("input context is null");
            new RuntimeException("here").printStackTrace();
        }
        return f4287i;
    }

    private void h() {
        synchronized (LBSAuthManager.class) {
            if (f4284f == null) {
                h hVar = new h("auth");
                f4284f = hVar;
                hVar.start();
                while (f4284f.f4340a == null) {
                    try {
                        com.baidu.lbsapi.auth.b.a("wait for create auth thread.");
                        Thread.sleep(3L);
                    } catch (InterruptedException e8) {
                        e8.printStackTrace();
                    }
                }
            }
        }
    }

    public int authenticate(boolean z7, String str, Hashtable<String, String> hashtable, LBSAuthManagerListener lBSAuthManagerListener) {
        synchronized (LBSAuthManager.class) {
            boolean z8 = false;
            if (hashtable != null) {
                try {
                    String str2 = hashtable.get("zero_auth");
                    if (str2 != null && Integer.valueOf(str2).intValue() == 1) {
                        z8 = true;
                    }
                } finally {
                }
            }
            this.f4295q = z8;
            String str3 = System.currentTimeMillis() + "";
            if (lBSAuthManagerListener != null) {
                f4286h.put(str3, lBSAuthManagerListener);
            }
            String a8 = a(f4279a, str3);
            if (a8 != null && !a8.equals("")) {
                f4285g++;
                com.baidu.lbsapi.auth.b.a(" mAuthCounter  ++ = " + f4285g);
                String a9 = a(str);
                com.baidu.lbsapi.auth.b.a("getAuthMessage from cache:" + a9);
                int c8 = c(a9);
                if (c8 == 601) {
                    try {
                        b(str, new JSONObject().put("status", 602).toString());
                    } catch (JSONException e8) {
                        e8.printStackTrace();
                    }
                }
                h();
                h hVar = f4284f;
                if (hVar != null && hVar.f4340a != null) {
                    com.baidu.lbsapi.auth.b.a("mThreadLooper.mHandler = " + f4284f.f4340a);
                    f4284f.f4340a.post(new b(c8, z7, str, str3, hashtable));
                    return c8;
                }
                return -1;
            }
            return 101;
        }
    }

    public String decodeAESMessage(String str) {
        byte[] bArr;
        if (str != null && str.length() > 0 && (bArr = this.f4296r) != null && bArr.length > 0) {
            try {
                Charset charset = StandardCharsets.UTF_8;
                byte[] a8 = com.baidu.lbsapi.auth.c.a(str.getBytes(charset));
                byte[] bArr2 = this.f4296r;
                return new String(com.baidu.lbsapi.auth.a.a(bArr2, bArr2, a8), charset);
            } catch (Exception e8) {
                Log.e("LBSAuthManager", "decodeAESMessage", e8);
            }
        }
        return null;
    }

    public String getCUID() {
        if (!TextUtils.isEmpty(f4292n)) {
            return f4292n;
        }
        if (f4279a == null) {
            return "";
        }
        try {
            com.baidu.lbsapi.auth.b.a("mIsPrivacyMode " + f4291m);
            if (f4291m) {
                DeviceId.setAndroidId(!TextUtils.isEmpty(f4289k) ? f4289k : Settings.Secure.getString(f4279a.getContentResolver(), "android_id"));
                String cuid = DeviceId.getCUID(f4279a);
                f4292n = cuid;
                com.baidu.lbsapi.auth.b.a("getCUID: " + cuid);
                return cuid;
            }
            SharedPreferences sharedPreferences = f4279a.getSharedPreferences("Map_Privacy", 0);
            if (sharedPreferences.contains("cuid")) {
                return sharedPreferences.getString("cuid", "");
            }
            String str = i.a(UUID.randomUUID().toString().getBytes(), true) + "|MAPSDK001";
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putString("cuid", str);
            edit.apply();
            return str;
        } catch (Exception e8) {
            e8.printStackTrace();
            return "";
        }
    }

    public String getKey() {
        Context context = f4279a;
        if (context == null) {
            return "";
        }
        try {
            return getPublicKey(context);
        } catch (PackageManager.NameNotFoundException e8) {
            e8.printStackTrace();
            return "";
        }
    }

    public String getMCode() {
        Context context = f4279a;
        return context == null ? "" : com.baidu.lbsapi.auth.d.a(context);
    }

    public boolean getPrivacyMode() {
        return f4291m;
    }

    public String getPublicKey(Context context) {
        if (!TextUtils.isEmpty(f4288j)) {
            return f4288j;
        }
        return context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getString("com.baidu.lbsapi.API_KEY");
    }

    public void setAndroidId(String str) {
        if (f4279a == null || TextUtils.isEmpty(str)) {
            return;
        }
        f4289k = str;
    }

    public void setHttpProxyUsernameAndPassword(String str, String str2) {
        f4282d = str;
        f4283e = str2;
    }

    public void setKey(String str) {
        if (f4279a == null || TextUtils.isEmpty(str)) {
            return;
        }
        f4288j = str;
    }

    public void setPackageName(String str) {
        f4290l = str;
    }

    public void setPrivacyMode(boolean z7) {
        Context context = f4279a;
        if (context == null) {
            return;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("Map_Privacy", 0);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        if (z7) {
            edit.putBoolean("privacyMode", z7);
            edit.apply();
        } else {
            z7 = sharedPreferences.getBoolean("privacyMode", false);
        }
        f4291m = z7;
    }

    public void setProxy(String str, int i8) {
        f4280b = str;
        f4281c = i8;
    }

    private String a(Context context) {
        String str;
        String processName;
        if (Build.VERSION.SDK_INT >= 28) {
            processName = Application.getProcessName();
            return processName;
        }
        try {
            str = a(Process.myPid());
        } catch (IOException unused) {
            str = null;
        }
        return str != null ? str : context == null ? "" : context.getPackageName();
    }

    private String b(String str) {
        try {
            JSONObject jSONObject = new JSONObject(a(str));
            return !jSONObject.has("extend") ? "" : jSONObject.getString("extend");
        } catch (JSONException unused) {
            return "";
        }
    }

    private String a(Context context, String str) {
        String a8;
        LBSAuthManagerListener lBSAuthManagerListener;
        String str2 = "";
        if (!TextUtils.isEmpty(f4288j)) {
            return f4288j;
        }
        try {
            Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            if (bundle != null) {
                String string = bundle.getString("com.baidu.lbsapi.API_KEY");
                if (string != null) {
                    try {
                        if (string.equals("")) {
                        }
                        return string;
                    } catch (PackageManager.NameNotFoundException unused) {
                        str2 = string;
                        LBSAuthManagerListener lBSAuthManagerListener2 = f4286h.get(str);
                        if (lBSAuthManagerListener2 == null) {
                            return str2;
                        }
                        lBSAuthManagerListener2.onAuthResult(101, ErrorMessage.a(101, "无法在AndroidManifest.xml中获取com.baidu.android.lbs.API_KEY的值"));
                        return str2;
                    }
                }
                LBSAuthManagerListener lBSAuthManagerListener3 = f4286h.get(str);
                if (lBSAuthManagerListener3 != null) {
                    a8 = ErrorMessage.a(101, "无法在AndroidManifest.xml中获取com.baidu.android.lbs.API_KEY的值");
                    str2 = string;
                    lBSAuthManagerListener = lBSAuthManagerListener3;
                }
                return string;
            }
            lBSAuthManagerListener = f4286h.get(str);
            if (lBSAuthManagerListener == null) {
                return "";
            }
            a8 = ErrorMessage.a(101, "AndroidManifest.xml的application中没有meta-data标签");
            lBSAuthManagerListener.onAuthResult(101, a8);
            return str2;
        } catch (PackageManager.NameNotFoundException unused2) {
        }
    }

    private void b(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            str = "status";
        }
        f4279a.getSharedPreferences("authStatus_" + a(f4279a), 0).edit().putString(str, str2).apply();
    }

    private String a(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "status";
        }
        return f4279a.getSharedPreferences("authStatus_" + a(f4279a), 0).getString(str, "{\"status\":601}");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() <= 0 || !jSONObject.has("en")) {
            return;
        }
        if (jSONObject.optInt("en", 0) == 0) {
            if (jSONObject.optString("ck").length() > 0) {
                this.f4296r = com.baidu.lbsapi.auth.c.a(jSONObject.optString("ck").getBytes(StandardCharsets.UTF_8));
            }
        } else {
            a(jSONObject, "ak");
            a(jSONObject, "ck");
            a(jSONObject, "sk");
            a(jSONObject, "uid");
            a(jSONObject);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2, String str3) {
        h hVar;
        synchronized (LBSAuthManager.class) {
            if (str2 == null) {
                try {
                    str2 = a(str);
                } catch (Throwable th) {
                    throw th;
                }
            }
            Message obtainMessage = this.f4297s.obtainMessage();
            int i8 = -1;
            try {
                JSONObject jSONObject = new JSONObject(str2);
                if (!jSONObject.has("status")) {
                    jSONObject.put("status", -1);
                }
                if (!jSONObject.has("current")) {
                    jSONObject.put("current", System.currentTimeMillis());
                }
                b(str, jSONObject.toString());
                if (jSONObject.has("current")) {
                    jSONObject.remove("current");
                }
                i8 = jSONObject.getInt("status");
                obtainMessage.what = i8;
                obtainMessage.obj = jSONObject;
                Bundle bundle = new Bundle();
                bundle.putString("listenerKey", str3);
                obtainMessage.setData(bundle);
                this.f4297s.sendMessage(obtainMessage);
            } catch (JSONException e8) {
                e8.printStackTrace();
                obtainMessage.what = i8;
                obtainMessage.obj = new JSONObject();
                Bundle bundle2 = new Bundle();
                bundle2.putString("listenerKey", str3);
                obtainMessage.setData(bundle2);
                this.f4297s.sendMessage(obtainMessage);
            }
            h hVar2 = f4284f;
            if (hVar2 != null) {
                hVar2.b();
            }
            f4285g--;
            com.baidu.lbsapi.auth.b.a("httpRequest called mAuthCounter-- = " + f4285g);
            if (f4285g == 0 && (hVar = f4284f) != null) {
                hVar.d();
                f4284f = null;
            }
        }
    }

    private void a(HashMap<String, String> hashMap, String str, String str2) {
        if (hashMap == null || hashMap.size() <= 0 || str == null || str.length() <= 0 || str2 == null || str2.length() <= 0) {
            return;
        }
        try {
            String b8 = j.b(str2);
            if (b8 == null || b8.length() <= 0) {
                hashMap.put(str, str2);
            } else {
                hashMap.put(str, b8);
            }
        } catch (Exception e8) {
            hashMap.put(str, str2);
            Log.e("LBSAuthManager", "encodeAuthParam", e8);
        }
    }

    private void a(JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() <= 0) {
            return;
        }
        if (jSONObject.has("ck")) {
            jSONObject.remove("ck");
        }
        if (jSONObject.has("en")) {
            jSONObject.remove("en");
        }
    }

    private void a(JSONObject jSONObject, String str) {
        if (jSONObject == null || jSONObject.length() <= 0 || str == null || str.length() <= 0 || !jSONObject.has(str)) {
            return;
        }
        try {
            byte[] a8 = j.a(jSONObject.optString(str));
            if (a8 != null && a8.length > 0) {
                jSONObject.put(str, new String(a8, StandardCharsets.UTF_8));
                if ("ck".equals(str)) {
                    this.f4296r = a8;
                    return;
                }
                return;
            }
            jSONObject.put(str, "");
            jSONObject.put("decode_status", -1);
        } catch (Exception e8) {
            Log.e("LBSAuthManager", " decodeAuthResult ", e8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z7, String str, Hashtable<String, String> hashtable, String str2, String str3, int i8, String str4, String str5) {
        String str6;
        String a8 = a(f4279a, str2);
        if (a8 == null || a8.equals("")) {
            return;
        }
        HashMap<String, String> hashMap = new HashMap<>();
        j.a();
        hashMap.put("pk", j.b() != null ? j.b() : "");
        hashMap.put("url", "https://api.map.baidu.com/sdkcs/verify");
        com.baidu.lbsapi.auth.b.a("url:https://api.map.baidu.com/sdkcs/verify");
        hashMap.put("output", BodyData.TYPE_JSON);
        a(hashMap, "ak", a8);
        com.baidu.lbsapi.auth.b.a("ak:" + hashMap.get("ak"));
        a(hashMap, "mcode", com.baidu.lbsapi.auth.d.a(f4279a));
        hashMap.put(TypedValues.TransitionType.S_FROM, "lbs_yunsdk");
        if (hashtable != null && hashtable.size() > 0) {
            for (Map.Entry<String, String> entry : hashtable.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (!TextUtils.isEmpty(key) && !TextUtils.isEmpty(value)) {
                    hashMap.put(key, value);
                }
            }
        }
        String cuid = !TextUtils.isEmpty(f4289k) ? getCUID() : f4292n;
        com.baidu.lbsapi.auth.b.a("cuid:" + f4292n);
        if (TextUtils.isEmpty(cuid)) {
            hashMap.put("cuid", "");
        } else {
            hashMap.put("cuid", cuid);
        }
        hashMap.put("pcn", f4279a.getPackageName());
        hashMap.put("version", VERSION);
        hashMap.put("macaddr", "");
        try {
            str6 = com.baidu.lbsapi.auth.d.a();
        } catch (Exception unused) {
            str6 = "";
        }
        if (TextUtils.isEmpty(str6)) {
            hashMap.put("language", "");
        } else {
            hashMap.put("language", str6);
        }
        if (z7) {
            hashMap.put("force", z7 ? "1" : "0");
        }
        if (str == null) {
            hashMap.put("from_service", "");
        } else {
            hashMap.put("from_service", str);
        }
        String b8 = b(str);
        if (!TextUtils.isEmpty(b8)) {
            hashMap.put("extend", b8);
        }
        e eVar = new e(f4279a);
        this.f4293o = eVar;
        eVar.a(hashMap, str3, i8, str4, str5, new c(str, str2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z7, String str, Hashtable<String, String> hashtable, String[] strArr, String str2, String str3, int i8, String str4, String str5) {
        String str6;
        String a8 = a(f4279a, str2);
        if (a8 == null || a8.equals("")) {
            return;
        }
        HashMap<String, String> hashMap = new HashMap<>();
        j.a();
        hashMap.put("pk", j.b() != null ? j.b() : "");
        hashMap.put("url", "https://api.map.baidu.com/sdkcs/verify");
        hashMap.put("output", BodyData.TYPE_JSON);
        a(hashMap, "ak", a8);
        hashMap.put(TypedValues.TransitionType.S_FROM, "lbs_yunsdk");
        if (hashtable != null && hashtable.size() > 0) {
            for (Map.Entry<String, String> entry : hashtable.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (!TextUtils.isEmpty(key) && !TextUtils.isEmpty(value)) {
                    hashMap.put(key, value);
                }
            }
        }
        String cuid = !TextUtils.isEmpty(f4289k) ? getCUID() : f4292n;
        com.baidu.lbsapi.auth.b.a("sendAuthRequests : cuid: " + cuid);
        if (TextUtils.isEmpty(cuid)) {
            hashMap.put("cuid", "");
        } else {
            hashMap.put("cuid", cuid);
        }
        hashMap.put("pcn", f4279a.getPackageName());
        hashMap.put("version", VERSION);
        hashMap.put("macaddr", "");
        try {
            str6 = com.baidu.lbsapi.auth.d.a();
        } catch (Exception unused) {
            str6 = "";
        }
        if (TextUtils.isEmpty(str6)) {
            hashMap.put("language", "");
        } else {
            hashMap.put("language", str6);
        }
        if (z7) {
            hashMap.put("force", z7 ? "1" : "0");
        }
        if (str == null) {
            hashMap.put("from_service", "");
        } else {
            hashMap.put("from_service", str);
        }
        String b8 = b(str);
        if (!TextUtils.isEmpty(b8)) {
            hashMap.put("extend", b8);
        }
        String[] strArr2 = new String[strArr.length];
        for (int i9 = 0; i9 < strArr.length; i9++) {
            String b9 = j.b(strArr[i9]);
            if (b9 == null || b9.length() <= 0) {
                strArr2[i9] = strArr[i9];
            } else {
                strArr2[i9] = b9;
            }
        }
        f fVar = new f(f4279a);
        this.f4294p = fVar;
        fVar.a(hashMap, strArr2, str3, i8, str4, str5, new d(str, str2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(String str, String str2) {
        String str3;
        JSONObject jSONObject;
        String a8 = a(f4279a, str2);
        try {
            jSONObject = new JSONObject(a(str));
        } catch (JSONException e8) {
            e8.printStackTrace();
            str3 = "";
        }
        if (!jSONObject.has("ak")) {
            return true;
        }
        if (jSONObject.has("en") && jSONObject.getInt("en") == 1) {
            a(jSONObject, "ak");
        }
        str3 = jSONObject.getString("ak");
        return (a8 == null || str3 == null || a8.equals(str3)) ? false : true;
    }
}
