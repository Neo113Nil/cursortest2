package com.pgl.ssdk.ces;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.net.wifi.WifiManager;
import android.os.Environment;
import android.os.LocaleList;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import androidx.work.WorkRequest;
import com.pgl.ssdk.A;
import com.pgl.ssdk.AbstractC1123c;
import com.pgl.ssdk.B;
import com.pgl.ssdk.C;
import com.pgl.ssdk.C1137q;
import com.pgl.ssdk.C1141v;
import com.pgl.ssdk.D;
import com.pgl.ssdk.F;
import com.pgl.ssdk.H;
import com.pgl.ssdk.K;
import com.pgl.ssdk.L;
import com.pgl.ssdk.M;
import com.pgl.ssdk.Q;
import com.pgl.ssdk.S;
import com.pgl.ssdk.ces.out.PglSSConfig;
import com.pgl.ssdk.x;
import com.pgl.ssdk.y;
import com.pgl.ssdk.z;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;
import org.json.JSONObject;
import org.objectweb.asm.Opcodes;

/* compiled from: PglSSManagerImpl.java */
/* loaded from: classes3.dex */
public class c {
    private static volatile c h = null;
    private static boolean i = false;
    private static Map<String, Object> j = null;
    private static int k = 1;
    private static K.a l;
    public Context a;
    private String b;
    private int c;
    private int d;
    private String e = null;
    private String f = null;
    private String g = null;

    /* compiled from: PglSSManagerImpl.java */
    static class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C1141v.a(C1141v.b());
        }
    }

    /* compiled from: PglSSManagerImpl.java */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            D.a(c.this.a).a();
            C.a(c.this.a).a();
        }
    }

    /* compiled from: PglSSManagerImpl.java */
    /* renamed from: com.pgl.ssdk.ces.c$c, reason: collision with other inner class name */
    class RunnableC0121c implements Runnable {
        RunnableC0121c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            x.b(c.this.a);
        }
    }

    private c(Context context, String str) {
        this.a = context;
        this.b = str;
    }

    public static c a(Context context, String str, int i2, int i3, int i4) {
        Application application;
        if (h == null) {
            synchronized (c.class) {
                if (h == null) {
                    if (context == null) {
                        try {
                            application = (Application) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null);
                        } catch (Throwable unused) {
                            application = null;
                        }
                        context = application.getApplicationContext();
                    }
                    if (context == null) {
                        k = 4;
                        return null;
                    }
                    F.a = i2;
                    K.a a2 = K.a(context, "nms");
                    if (a2 != null) {
                        k = a2.a;
                        l = a2;
                        return null;
                    }
                    c cVar = new c(context, str);
                    h = cVar;
                    cVar.c = i3;
                    h.d = i4;
                    h.a(context);
                    c cVar2 = h;
                    String a3 = L.a(context, "iid", "");
                    if (TextUtils.isEmpty(a3)) {
                        a3 = UUID.randomUUID().toString();
                        L.b(context, "iid", a3);
                    }
                    cVar2.getClass();
                    if (!TextUtils.isEmpty(a3)) {
                        com.pgl.ssdk.ces.a.meta(104, null, a3);
                    }
                    C1141v.b(context);
                    k = 0;
                    AbstractC1123c.a(new a());
                }
            }
        }
        return h;
    }

    public static String d() {
        if (h != null) {
            return h.b;
        }
        return null;
    }

    public static String e() {
        if (h != null) {
            return h.e;
        }
        return null;
    }

    public static int f() {
        return k;
    }

    public static c g() {
        return h;
    }

    public static K.a h() {
        return l;
    }

    public void b() {
        Map<String, Object> map = j;
        if (map != null) {
            Object obj = map.get(PglSSConfig.CUSTOMINFO_KEY_CHECKCLAZZ);
            if (obj instanceof String) {
                String str = (String) obj;
                String[] split = !TextUtils.isEmpty(str) ? str.split("//") : null;
                ArrayList arrayList = new ArrayList();
                if (split != null && split.length > 0) {
                    for (String str2 : split) {
                        try {
                            Class.forName(str2);
                            arrayList.add(str2);
                        } catch (ClassNotFoundException unused) {
                        }
                    }
                }
                String obj2 = !arrayList.isEmpty() ? arrayList.toString() : null;
                if (TextUtils.isEmpty(obj2)) {
                    return;
                }
                com.pgl.ssdk.ces.a.meta(Opcodes.IF_ICMPEQ, null, obj2);
            }
        }
    }

    public synchronized void c(String str) {
        if (!TextUtils.isEmpty(str) && !str.equals(this.g)) {
            com.pgl.ssdk.ces.a.meta(111, null, str);
            this.g = str;
            S.c();
        }
    }

    public synchronized void d(String str) {
        if (!TextUtils.isEmpty(str) && !str.equals(this.f)) {
            com.pgl.ssdk.ces.a.meta(112, null, str);
            this.f = str;
            S.c();
        }
    }

    public void c() {
        AbstractC1123c.a(new RunnableC0121c());
    }

    public synchronized void b(String str) {
        if (!TextUtils.isEmpty(str) && !str.equals(this.e)) {
            com.pgl.ssdk.ces.a.meta(103, null, str);
            S.c();
            this.e = str;
        }
    }

    private void a(Context context) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        if (context == null || i) {
            return;
        }
        try {
            com.pgl.ssdk.ces.a.meta(101, null, "1");
            com.pgl.ssdk.ces.a.meta(102, null, this.b);
            com.pgl.ssdk.ces.a.meta(114, null, Integer.valueOf(this.c));
            com.pgl.ssdk.ces.a.meta(105, null, new StringBuilder().append(x.c(context)).toString());
            StringBuilder sb = new StringBuilder();
            try {
                str = context.getPackageName();
            } catch (Throwable unused) {
                str = null;
            }
            com.pgl.ssdk.ces.a.meta(106, null, sb.append(str == null ? "" : str.trim()).toString());
            StringBuilder sb2 = new StringBuilder();
            try {
                str2 = context.getFilesDir().getAbsolutePath();
            } catch (Throwable unused2) {
                str2 = null;
            }
            com.pgl.ssdk.ces.a.meta(107, null, sb2.append(str2 == null ? "" : str2.trim()).toString());
            StringBuilder sb3 = new StringBuilder();
            try {
                str3 = context.getApplicationInfo().sourceDir;
            } catch (Throwable unused3) {
                str3 = null;
            }
            com.pgl.ssdk.ces.a.meta(108, null, sb3.append(str3 == null ? "" : str3.trim()).toString());
            StringBuilder sb4 = new StringBuilder();
            try {
                str4 = Environment.getExternalStorageDirectory().getAbsolutePath();
            } catch (Throwable unused4) {
                str4 = null;
            }
            com.pgl.ssdk.ces.a.meta(109, null, sb4.append(str4 == null ? "" : str4.trim()).toString());
            StringBuilder sb5 = new StringBuilder();
            try {
                str5 = Environment.getDataDirectory().getPath();
            } catch (Throwable unused5) {
                str5 = null;
            }
            com.pgl.ssdk.ces.a.meta(110, null, sb5.append(str5 != null ? str5.trim() : "").toString());
            i = true;
        } catch (Throwable unused6) {
        }
    }

    public void a(String str, String str2, String str3, String str4) {
        this.e = str2;
        this.f = str3;
        com.pgl.ssdk.ces.a.meta(113, null, str);
        com.pgl.ssdk.ces.a.meta(112, null, str3);
        com.pgl.ssdk.ces.a.meta(103, null, str2);
        com.pgl.ssdk.ces.a.meta(111, null, str4);
        try {
            H.b();
            S.a(this.a, this.b);
            a("CZL-L1st");
        } catch (Throwable unused) {
        }
    }

    public void a(String str) {
        try {
            long j2 = "CZL-L1st".equals(str) ? WorkRequest.MIN_BACKOFF_MILLIS : 0L;
            Q c = M.a().c();
            if (c != null) {
                c.postDelayed(new d(this.a, str), j2);
            }
            AbstractC1123c.a(new b());
            C1141v.a();
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:148:0x029a, code lost:
    
        if (r8 != 1) goto L139;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object a(int i2, Object obj) {
        PackageManager packageManager;
        List<ResolveInfo> queryIntentActivities;
        ResolveInfo resolveInfo;
        if (i2 == 123) {
            return B.a(this.a);
        }
        boolean z = false;
        if (i2 == 121) {
            return LocaleList.getDefault().get(0).getLanguage();
        }
        String str = null;
        if (i2 == 122) {
            try {
                str = TimeZone.getDefault().getDisplayName(false, 0);
            } catch (Throwable unused) {
            }
            if (str != null) {
                return str.trim();
            }
        } else {
            if (i2 == 126) {
                return z.a(this.a);
            }
            if (i2 != 128) {
                if (i2 == 120) {
                    return y.b();
                }
                if (i2 == 124) {
                    return "[]";
                }
                if (i2 != 130) {
                    if (i2 == 145) {
                        Context context = this.a;
                        WifiManager wifiManager = (WifiManager) context.getApplicationContext().getSystemService("wifi");
                        String str2 = (wifiManager == null || !wifiManager.isWifiEnabled()) ? "0" : "1";
                        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                        if (telephonyManager != null) {
                            return str2 + (telephonyManager.getSimState() != 5 ? "0" : "1");
                        }
                        return str2 + "0";
                    }
                    if (i2 != 125) {
                        if (i2 == 129) {
                            return A.b(this.a);
                        }
                        if (i2 == 141) {
                            Context context2 = this.a;
                            int i3 = -1;
                            if (context2 != null) {
                                try {
                                    i3 = Settings.System.getInt(context2.getContentResolver(), "screen_brightness", -1);
                                } catch (Throwable unused2) {
                                }
                            }
                            return String.valueOf(i3);
                        }
                        if (i2 == 131) {
                            return S.a();
                        }
                        if (i2 == 132) {
                            a((String) obj);
                        } else {
                            if (i2 == 134) {
                                return D.a(this.a).b();
                            }
                            if (i2 == 140) {
                                return C.a(this.a).c();
                            }
                            if (i2 == 144) {
                                return C.a(this.a).b();
                            }
                            if (i2 == 133) {
                                try {
                                    JSONObject jSONObject = new JSONObject();
                                    for (Map.Entry<String, Object> entry : j.entrySet()) {
                                        if (entry.getValue() == null) {
                                            jSONObject.put(entry.getKey(), "");
                                        } else {
                                            jSONObject.put(entry.getKey(), entry.getValue());
                                        }
                                    }
                                    str = jSONObject.toString();
                                } catch (Throwable unused3) {
                                }
                                return str == null ? "{}" : str.trim();
                            }
                            try {
                                if (i2 == 135) {
                                    byte[] byteArray = this.a.getPackageManager().getPackageInfo(this.a.getPackageName(), 64).signatures[0].toByteArray();
                                    MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
                                    if (messageDigest != null) {
                                        byte[] digest = messageDigest.digest(byteArray);
                                        StringBuilder sb = new StringBuilder();
                                        for (byte b2 : digest) {
                                            sb.append(Integer.toHexString((b2 & 255) | 256).substring(1, 3).toUpperCase());
                                            sb.append(":");
                                        }
                                        return sb.substring(0, sb.length() - 1);
                                    }
                                } else {
                                    if (i2 == 136) {
                                        return this.a.getPackageManager().getPackageInfo(this.a.getPackageName(), 64).signatures[0].toByteArray();
                                    }
                                    if (i2 == 201) {
                                        try {
                                            str = Settings.Secure.getString(this.a.getContentResolver(), "android_id");
                                        } catch (Throwable unused4) {
                                        }
                                        if (str != null) {
                                            return str.trim();
                                        }
                                    } else if (i2 != 202) {
                                        if (i2 == 236) {
                                            try {
                                                return (String) Class.forName("android.os.SystemProperties").getDeclaredMethod("get", String.class).invoke(null, (String) obj);
                                            } catch (Throwable unused5) {
                                                return null;
                                            }
                                        }
                                        if (i2 == 142) {
                                            try {
                                                str = this.a.getPackageResourcePath();
                                            } catch (Throwable unused6) {
                                            }
                                            if (str != null) {
                                                return str.trim();
                                            }
                                        } else {
                                            if (i2 == 143) {
                                                return B.b(this.a);
                                            }
                                            if (i2 == 146) {
                                                try {
                                                    return C1137q.b();
                                                } catch (Throwable unused7) {
                                                    return null;
                                                }
                                            }
                                            if (i2 == 147) {
                                                Context context3 = this.a;
                                                try {
                                                    packageManager = context3.getPackageManager();
                                                    Intent intent = new Intent("android.intent.action.MAIN", (Uri) null);
                                                    intent.addCategory("android.intent.category.LAUNCHER");
                                                    intent.setPackage(context3.getPackageName());
                                                    queryIntentActivities = packageManager.queryIntentActivities(intent, 0);
                                                } catch (Throwable unused8) {
                                                }
                                                if (queryIntentActivities != null && !queryIntentActivities.isEmpty() && (resolveInfo = queryIntentActivities.get(0)) != null) {
                                                    int componentEnabledSetting = packageManager.getComponentEnabledSetting(new ComponentName(resolveInfo.activityInfo.packageName, resolveInfo.activityInfo.name));
                                                    if (componentEnabledSetting != 0) {
                                                    }
                                                    z = true;
                                                }
                                                return Boolean.valueOf(z);
                                            }
                                        }
                                    }
                                }
                            } catch (Throwable unused9) {
                            }
                        }
                    }
                }
                return null;
            }
        }
        return "";
    }

    public void a(Map<String, Object> map) {
        if (map != null) {
            j = map;
        }
    }

    public void a() {
        AbstractC1123c.a(new b());
    }
}
