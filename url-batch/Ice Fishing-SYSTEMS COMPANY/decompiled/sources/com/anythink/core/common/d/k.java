package com.anythink.core.common.d;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Debug;
import android.os.Process;
import android.text.TextUtils;
import com.anythink.core.common.d.u;
import com.anythink.core.common.v.af;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.Thread;
import java.net.URLEncoder;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class k implements Thread.UncaughtExceptionHandler {

    /* renamed from: d, reason: collision with root package name */
    private static volatile k f12813d = null;
    private static final String i = "0";

    /* renamed from: j, reason: collision with root package name */
    private static final String f12814j = "1";

    /* renamed from: k, reason: collision with root package name */
    private static final int f12815k = 4;

    /* renamed from: l, reason: collision with root package name */
    private static volatile boolean f12816l = false;

    /* renamed from: b, reason: collision with root package name */
    private Thread.UncaughtExceptionHandler f12818b;

    /* renamed from: c, reason: collision with root package name */
    private Context f12819c;

    /* renamed from: e, reason: collision with root package name */
    private final String f12820e = "crash_type";

    /* renamed from: f, reason: collision with root package name */
    private final String f12821f = "crash_msg";

    /* renamed from: g, reason: collision with root package name */
    private final String f12822g = g.f12488c;

    /* renamed from: h, reason: collision with root package name */
    private final String f12823h = "crash_sdk_type";

    /* renamed from: a, reason: collision with root package name */
    String f12817a = "com.anythink";

    private k(Context context) {
        this.f12819c = context;
    }

    public static k a(Context context) {
        if (f12813d == null) {
            synchronized (k.class) {
                try {
                    if (f12813d == null) {
                        f12813d = new k(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f12813d;
    }

    private String b() {
        try {
            Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
            HashMap hashMap = new HashMap(4);
            Iterator<Map.Entry<Thread, StackTraceElement[]>> it = allStackTraces.entrySet().iterator();
            int i4 = 0;
            while (it.hasNext()) {
                Thread key = it.next().getKey();
                if (key.getName().startsWith("anythink")) {
                    String str = key.getName() + "-" + key.getState();
                    if (hashMap.containsKey(str)) {
                        hashMap.put(str, Integer.valueOf(((Integer) hashMap.get(str)).intValue() + 1));
                    } else {
                        hashMap.put(str, 1);
                    }
                    i4++;
                }
            }
            try {
                JSONObject jSONObject = new JSONObject(hashMap);
                jSONObject.put("anythink_thread_count", i4);
                try {
                    ActivityManager activityManager = (ActivityManager) this.f12819c.getSystemService("activity");
                    Debug.MemoryInfo[] processMemoryInfo = activityManager.getProcessMemoryInfo(new int[]{Process.myPid()});
                    if (processMemoryInfo.length > 0) {
                        jSONObject.put("app_memory", (processMemoryInfo[0].getTotalPss() / 1024) + "MB");
                    }
                    ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                    activityManager.getMemoryInfo(memoryInfo);
                    jSONObject.put("sys_total_memory", (memoryInfo.totalMem / 1048576) + "MB");
                    jSONObject.put("sys_avail_memory", (memoryInfo.availMem / 1048576) + "MB");
                } catch (Throwable unused) {
                }
                return jSONObject.toString();
            } catch (Throwable th) {
                return th.getMessage();
            }
        } catch (Throwable th2) {
            return th2.getMessage();
        }
    }

    private void c() {
        Map<String, ?> b9 = af.b(this.f12819c, u.b.f13007d);
        Iterator<?> it = b9.values().iterator();
        while (it.hasNext()) {
            Object next = it.next();
            String obj = next != null ? next.toString() : "";
            if (!TextUtils.isEmpty(obj)) {
                try {
                    JSONObject jSONObject = new JSONObject(obj);
                    com.anythink.core.common.u.e.b(jSONObject.optString("crash_type"), jSONObject.optString("crash_msg"), jSONObject.optString(g.f12488c), jSONObject.optString("crash_sdk_type"));
                } catch (Exception unused) {
                }
            }
        }
        if (b9.size() > 0) {
            af.a(this.f12819c, u.b.f13007d);
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        if (th != null) {
            try {
                if (f12816l) {
                    return;
                }
                f12816l = true;
                try {
                    String b9 = b(th);
                    if (a(b9)) {
                        String b10 = b(b9);
                        String c4 = c(b9);
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("crash_type", URLEncoder.encode(b10));
                        jSONObject.put("crash_msg", URLEncoder.encode(b() + "\n" + b9));
                        jSONObject.put(g.f12488c, t.b().r());
                        jSONObject.put("crash_sdk_type", c4);
                        af.a(this.f12819c, u.b.f13007d, System.currentTimeMillis() + "_crash", jSONObject.toString());
                    }
                } catch (Throwable unused) {
                }
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f12818b;
                if (uncaughtExceptionHandler == null || uncaughtExceptionHandler == this || (uncaughtExceptionHandler instanceof k)) {
                    return;
                }
                uncaughtExceptionHandler.uncaughtException(thread, th);
            } catch (Exception unused2) {
            }
        }
    }

    public final void a() {
        com.anythink.core.d.b k6 = com.anythink.basead.b.c.i.k(com.anythink.core.d.d.a(this.f12819c));
        if (k6 == null || k6.J() != 0) {
            try {
                Map<String, ?> b9 = af.b(this.f12819c, u.b.f13007d);
                Iterator<?> it = b9.values().iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    String obj = next != null ? next.toString() : "";
                    if (!TextUtils.isEmpty(obj)) {
                        try {
                            JSONObject jSONObject = new JSONObject(obj);
                            com.anythink.core.common.u.e.b(jSONObject.optString("crash_type"), jSONObject.optString("crash_msg"), jSONObject.optString(g.f12488c), jSONObject.optString("crash_sdk_type"));
                        } catch (Exception unused) {
                        }
                    }
                }
                if (b9.size() > 0) {
                    af.a(this.f12819c, u.b.f13007d);
                }
                if (!(Thread.getDefaultUncaughtExceptionHandler() instanceof k)) {
                    this.f12818b = Thread.getDefaultUncaughtExceptionHandler();
                }
                Thread.setDefaultUncaughtExceptionHandler(this);
            } catch (Exception unused2) {
            }
        }
    }

    private String c(String str) {
        String str2 = this.f12817a;
        if (!TextUtils.isEmpty(str) && str.contains(str2)) {
            try {
                for (String str3 : str.split("Caused by:")) {
                    if (str3.contains(str2)) {
                        String[] split = str3.split("\\n");
                        for (int i4 = 0; i4 < split.length; i4++) {
                            if (split[i4].contains(str2) && i4 <= 4) {
                                return "1";
                            }
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
        return "0";
    }

    private static String b(Throwable th) {
        PrintWriter printWriter;
        StringWriter stringWriter;
        if (th == null) {
            return "";
        }
        StringWriter stringWriter2 = null;
        try {
            for (Throwable th2 = new Throwable(com.anythink.core.common.v.p.a(), th); th2 != null; th2 = th2.getCause()) {
                if (th2 instanceof UnknownHostException) {
                    return "";
                }
            }
            stringWriter = new StringWriter();
            try {
                printWriter = new PrintWriter(stringWriter);
            } catch (Exception unused) {
                printWriter = null;
            } catch (Throwable th3) {
                th = th3;
                printWriter = null;
            }
        } catch (Exception unused2) {
            printWriter = null;
        } catch (Throwable th4) {
            th = th4;
            printWriter = null;
        }
        try {
            th.printStackTrace(printWriter);
            printWriter.flush();
            printWriter.close();
            stringWriter.close();
            String stringWriter3 = stringWriter.toString();
            try {
                stringWriter.close();
                stringWriter.close();
            } catch (Throwable unused3) {
            }
            return stringWriter3;
        } catch (Exception unused4) {
            stringWriter2 = stringWriter;
            if (stringWriter2 != null) {
                try {
                    stringWriter2.close();
                } catch (Throwable unused5) {
                    return "";
                }
            }
            if (printWriter != null) {
                stringWriter2.close();
            }
            return "";
        } catch (Throwable th5) {
            th = th5;
            stringWriter2 = stringWriter;
            if (stringWriter2 != null) {
                try {
                    stringWriter2.close();
                } catch (Throwable unused6) {
                    throw th;
                }
            }
            if (printWriter != null) {
                stringWriter2.close();
            }
            throw th;
        }
    }

    private void a(Throwable th) {
        try {
            String b9 = b(th);
            if (a(b9)) {
                String b10 = b(b9);
                String c4 = c(b9);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("crash_type", URLEncoder.encode(b10));
                jSONObject.put("crash_msg", URLEncoder.encode(b() + "\n" + b9));
                jSONObject.put(g.f12488c, t.b().r());
                jSONObject.put("crash_sdk_type", c4);
                af.a(this.f12819c, u.b.f13007d, System.currentTimeMillis() + "_crash", jSONObject.toString());
            }
        } catch (Throwable unused) {
        }
    }

    private boolean a(String str) {
        com.anythink.core.d.b k6 = com.anythink.basead.b.c.i.k(com.anythink.core.d.d.a(this.f12819c));
        if (k6 != null) {
            if (k6.J() == 0) {
                return false;
            }
            String L8 = k6.L();
            try {
                if (TextUtils.isEmpty(L8)) {
                    return true;
                }
                JSONArray jSONArray = new JSONArray(L8);
                for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                    if (str.contains(jSONArray.optString(i4))) {
                        return true;
                    }
                }
            } catch (Throwable unused) {
            }
        } else if (str.contains(this.f12817a)) {
            return true;
        }
        return false;
    }

    private static String b(String str) {
        String str2;
        try {
            Matcher matcher = Pattern.compile(".*?(Exception|Error|Death)", 2).matcher(str);
            if (!matcher.find()) {
                str2 = "";
            } else {
                str2 = matcher.group(0);
            }
            try {
                return !TextUtils.isEmpty(str2) ? str2.replaceAll("Caused by:", "").replaceAll(" ", "") : str2;
            } catch (Exception unused) {
                return str2;
            }
        } catch (Exception unused2) {
            return "";
        }
    }
}
