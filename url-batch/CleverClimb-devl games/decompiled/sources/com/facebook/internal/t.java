package com.facebook.internal;

import android.util.Log;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Logger.java */
/* loaded from: classes.dex */
public class t {

    /* renamed from: a, reason: collision with root package name */
    private static final HashMap<String, String> f6187a = new HashMap<>();

    /* renamed from: b, reason: collision with root package name */
    private final com.facebook.u f6188b;

    /* renamed from: c, reason: collision with root package name */
    private final String f6189c;

    /* renamed from: d, reason: collision with root package name */
    private StringBuilder f6190d;
    private int e = 3;

    public static synchronized void a(String str, String str2) {
        synchronized (t.class) {
            f6187a.put(str, str2);
        }
    }

    public static synchronized void a(String str) {
        synchronized (t.class) {
            if (!com.facebook.l.a(com.facebook.u.INCLUDE_ACCESS_TOKENS)) {
                a(str, "ACCESS_TOKEN_REMOVED");
            }
        }
    }

    public static void a(com.facebook.u uVar, String str, String str2) {
        a(uVar, 3, str, str2);
    }

    public static void a(com.facebook.u uVar, String str, String str2, Object... objArr) {
        if (com.facebook.l.a(uVar)) {
            a(uVar, 3, str, String.format(str2, objArr));
        }
    }

    public static void a(com.facebook.u uVar, int i, String str, String str2, Object... objArr) {
        if (com.facebook.l.a(uVar)) {
            a(uVar, i, str, String.format(str2, objArr));
        }
    }

    public static void a(com.facebook.u uVar, int i, String str, String str2) {
        if (com.facebook.l.a(uVar)) {
            String d2 = d(str2);
            if (!str.startsWith("FacebookSDK.")) {
                str = "FacebookSDK." + str;
            }
            Log.println(i, str, d2);
            if (uVar == com.facebook.u.DEVELOPER_ERRORS) {
                new Exception().printStackTrace();
            }
        }
    }

    private static synchronized String d(String str) {
        synchronized (t.class) {
            for (Map.Entry<String, String> entry : f6187a.entrySet()) {
                str = str.replace(entry.getKey(), entry.getValue());
            }
        }
        return str;
    }

    public t(com.facebook.u uVar, String str) {
        ac.a(str, "tag");
        this.f6188b = uVar;
        this.f6189c = "FacebookSDK." + str;
        this.f6190d = new StringBuilder();
    }

    public void a() {
        b(this.f6190d.toString());
        this.f6190d = new StringBuilder();
    }

    public void b(String str) {
        a(this.f6188b, this.e, this.f6189c, str);
    }

    public void c(String str) {
        if (b()) {
            this.f6190d.append(str);
        }
    }

    public void a(String str, Object... objArr) {
        if (b()) {
            this.f6190d.append(String.format(str, objArr));
        }
    }

    public void a(String str, Object obj) {
        a("  %s:\t%s\n", str, obj);
    }

    private boolean b() {
        return com.facebook.l.a(this.f6188b);
    }
}
