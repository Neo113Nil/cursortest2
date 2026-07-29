package com.umeng.commonsdk.statistics.internal;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.umeng.commonsdk.statistics.common.HelperUtils;
import com.umeng.commonsdk.utils.UMUtils;

/* compiled from: HeaderHelper.java */
/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static Context f9204a;

    /* renamed from: b, reason: collision with root package name */
    private String f9205b;

    /* renamed from: c, reason: collision with root package name */
    private String f9206c;

    private a() {
        this.f9205b = null;
        this.f9206c = null;
    }

    /* compiled from: HeaderHelper.java */
    /* renamed from: com.umeng.commonsdk.statistics.internal.a$a, reason: collision with other inner class name */
    private static class C0397a {

        /* renamed from: a, reason: collision with root package name */
        private static final a f9207a = new a();

        private C0397a() {
        }
    }

    public static a a(Context context) {
        if (f9204a == null && context != null) {
            f9204a = context.getApplicationContext();
        }
        return C0397a.f9207a;
    }

    public boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith("a");
    }

    public void b(String str) {
        String substring = str.substring(0, str.indexOf(95));
        d(substring);
        c(substring);
    }

    private void c(String str) {
        try {
            this.f9205b = str.replaceAll("&=", " ").replaceAll("&&", " ").replaceAll("==", "/") + "/Android/" + Build.DISPLAY + "/" + Build.MODEL + "/" + Build.VERSION.RELEASE + " " + HelperUtils.getUmengMD5(UMUtils.getAppkey(f9204a));
        } catch (Throwable th) {
            com.umeng.commonsdk.proguard.b.a(f9204a, th);
        }
    }

    private void d(String str) {
        try {
            String str2 = str.split("&&")[0];
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            String[] split = str2.split("&=");
            StringBuilder sb = new StringBuilder();
            sb.append(com.umeng.commonsdk.proguard.d.av);
            for (String str3 : split) {
                if (!TextUtils.isEmpty(str3)) {
                    String substring = str3.substring(0, 2);
                    if (substring.endsWith("=")) {
                        substring = substring.replace("=", "");
                    }
                    sb.append(substring);
                }
            }
            this.f9206c = sb.toString();
        } catch (Throwable th) {
            com.umeng.commonsdk.proguard.b.a(f9204a, th);
        }
    }

    public String a() {
        return this.f9206c;
    }

    public String b() {
        return this.f9205b;
    }
}
