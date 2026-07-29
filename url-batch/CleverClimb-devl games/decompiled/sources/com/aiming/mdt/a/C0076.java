package com.aiming.mdt.a;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.aiming.mdt.adt.C0226;
import com.aiming.mdt.adt.C0239;
import com.aiming.mdt.utils.C0271;
import com.aiming.mdt.utils.C0280;
import com.aiming.mdt.utils.C0282;
import com.aiming.mdt.utils.C0289;
import com.aiming.mdt.utils.Constants;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.Thread;
import java.lang.reflect.UndeclaredThrowableException;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.aiming.mdt.a.ʻʽʿˈˉ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0076 implements Thread.UncaughtExceptionHandler {

    /* renamed from: ʻ, reason: contains not printable characters */
    private SharedPreferences f180;

    /* renamed from: ʼ, reason: contains not printable characters */
    private Thread.UncaughtExceptionHandler f181;

    /* renamed from: com.aiming.mdt.a.ʻʽʿˈˉ$ʻ, reason: contains not printable characters */
    static class C0077 {

        /* renamed from: ʻ, reason: contains not printable characters */
        private static final C0076 f182 = new C0076(0);
    }

    private C0076() {
    }

    /* synthetic */ C0076(byte b2) {
        this();
    }

    /* renamed from: ʻʼ, reason: contains not printable characters */
    static /* synthetic */ String m230(Throwable th) {
        if (th == null) {
            return "";
        }
        for (Throwable th2 = new Throwable(Constants.SDK_V, th); th2 != null; th2 = th2.getCause()) {
            if (th2 instanceof UnknownHostException) {
                return "";
            }
        }
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        return stringWriter.toString();
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public static C0076 m232() {
        return C0077.f182;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    private static String m233(String str) {
        String str2;
        str2 = "";
        try {
            Matcher matcher = Pattern.compile(".*?(Exception|Error|Death)", 2).matcher(str);
            str2 = matcher.find() ? matcher.group(0) : "";
            if (!TextUtils.isEmpty(str2)) {
                return str2.replaceAll("Caused by:", "").replaceAll(" ", "");
            }
        } catch (Exception e) {
            C0282.m972("CrashUtil", e);
        }
        return str2;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        if (th == null || (th instanceof UndeclaredThrowableException)) {
            return;
        }
        try {
            C0289.m980(new RunnableC0120(this, th));
            if (this.f181 == null || this.f181 == this || (this.f181 instanceof C0076)) {
                return;
            }
            this.f181.uncaughtException(thread, th);
        } catch (Exception e) {
            C0282.m972("CrashUtil", e);
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public final void m234() {
        try {
            this.f180 = C0226.m829().getSharedPreferences("CrashSP", 0);
            if (!(Thread.getDefaultUncaughtExceptionHandler() instanceof C0076)) {
                this.f181 = Thread.getDefaultUncaughtExceptionHandler();
            }
            Thread.setDefaultUncaughtExceptionHandler(this);
        } catch (Exception e) {
            C0282.m972("CrashUtil", e);
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public final void m235(String str, String str2) {
        if (this.f180 == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        Map<String, ?> all = this.f180.getAll();
        if (all.size() == 0) {
            return;
        }
        try {
            this.f180.edit().clear().apply();
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("/xr?");
            sb.append(new C0280().m964("v", "2").m964("k", str2).m964("sdkv", Constants.SDK_V).m964("mv", Integer.valueOf(Constants.VERSION)).m964("mn", "").m964("t", "error").m964("ts", Long.toString(System.currentTimeMillis())).m965());
            String obj = sb.toString();
            String str3 = (String) C0162.m619().m622("Model", String.class);
            String str4 = (String) C0162.m619().m622("Make", String.class);
            String str5 = (String) C0162.m619().m622("Brand", String.class);
            String str6 = (String) C0162.m619().m622("OSVersion", String.class);
            String str7 = (String) C0162.m619().m622("AdvertisingId", String.class);
            Iterator<Map.Entry<String, ?>> it = all.entrySet().iterator();
            while (it.hasNext()) {
                String str8 = (String) it.next().getValue();
                if (!TextUtils.isEmpty(str8) && str8.contains("com.aiming.mdt")) {
                    String m233 = m233(str8);
                    if (TextUtils.isEmpty(m233)) {
                        m233 = "UnknownError";
                    }
                    C0026.m23().m665(new C0271(C0239.m850(TextUtils.join("\u0001", new Object[]{str3, str7, m233, str8.replaceAll("\u0001", " "), str4, str5, str6}).getBytes(Charset.forName("UTF-8"))))).m668(C0226.m826()).m672(obj).m671(30000).m667(60000).m670(C0226.m829());
                }
            }
        } catch (Throwable th) {
            C0282.m972("CrashUtil", th);
        }
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public final void m236(Throwable th) {
        C0289.m980(new RunnableC0120(this, th));
    }
}
