package com.my.tracker.obfuscated;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.FileReader;
import org.json.JSONObject;

/* renamed from: com.my.tracker.obfuscated.p1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1672p1 {

    /* renamed from: a, reason: collision with root package name */
    final C1631f0 f21487a;

    /* renamed from: b, reason: collision with root package name */
    final C1712z2 f21488b;

    /* renamed from: c, reason: collision with root package name */
    final Context f21489c;

    /* renamed from: com.my.tracker.obfuscated.p1$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f21490a;

        /* renamed from: b, reason: collision with root package name */
        public final String f21491b;

        /* renamed from: c, reason: collision with root package name */
        public final String f21492c;

        public a(int i4, String str, String str2) {
            this.f21490a = i4;
            this.f21491b = str;
            this.f21492c = str2;
        }
    }

    C1672p1(C1631f0 c1631f0, C1712z2 c1712z2, Context context) {
        this.f21487a = c1631f0;
        this.f21488b = c1712z2;
        this.f21489c = context.getApplicationContext();
    }

    static a a(int i4, String str, String str2) {
        try {
            AbstractC1708y2.a("PreInstallHandler: converting raw data to json");
            return new a(i4, new JSONObject(str).toString(), str2);
        } catch (Throwable th) {
            AbstractC1708y2.a("PreInstallHandler error: exception when converting raw data to json", th);
            try {
                AbstractC1708y2.a("PreInstallHandler: converting raw data to json with pid");
                return new a(i4, new JSONObject().put("pid", str).toString(), str2);
            } catch (Throwable th2) {
                AbstractC1708y2.b("PreInstallHandler error: exception when converting raw data to json with pid", th2);
                AbstractC1708y2.a("PreInstallHandler: nothing has been found for source: " + i4);
                return null;
            }
        }
    }

    a b() {
        String format = String.format("ro.mtpi.%s", this.f21488b.g());
        String a4 = AbstractC1624d2.a(format);
        if (TextUtils.isEmpty(a4)) {
            AbstractC1708y2.a("PreInstallHandler: empty data for source: 3");
            return null;
        }
        AbstractC1708y2.a("PreInstallHandler: raw data in SystemProperties has been found: " + a4);
        return a(3, a4, format);
    }

    public void c() {
        String r4 = this.f21488b.r();
        if (TextUtils.isEmpty(r4)) {
            return;
        }
        C1676q1 a4 = C1676q1.a(this.f21489c);
        if (a4.q()) {
            return;
        }
        AbstractC1708y2.a("PreInstallHandler: checking preinstall");
        try {
            String a5 = a(this.f21489c.getPackageManager().getResourcesForApplication(r4), this.f21489c.getPackageName(), r4);
            a4.u();
            if (TextUtils.isEmpty(a5)) {
                AbstractC1708y2.a("PreInstallHandler: referrer is empty");
                return;
            }
            AbstractC1708y2.a("PreInstallHandler: referrer " + a5);
            this.f21487a.a(a5, AbstractC1689u.b(this.f21489c), (Runnable) null);
            C1676q1.a(this.f21489c).v();
        } catch (Throwable unused) {
            AbstractC1708y2.a("PreInstallHandler: unable to locate vendor app " + r4);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x008a, code lost:
    
        if (r3 == null) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    String a(String str) {
        BufferedReader bufferedReader;
        String str2;
        int length;
        try {
            AbstractC1708y2.a("PreInstallHandler: searching string in file " + str);
            str2 = this.f21489c.getPackageName() + "=";
            length = str2.length();
            bufferedReader = new BufferedReader(new FileReader(str));
        } catch (Throwable th) {
            th = th;
            bufferedReader = null;
        }
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    AbstractC1708y2.a("PreInstallHandler: processing string " + readLine);
                    if (readLine.startsWith(str2) && readLine.length() > length) {
                        String substring = readLine.substring(length);
                        if (!TextUtils.isEmpty(substring)) {
                            try {
                                bufferedReader.close();
                            } catch (Throwable unused) {
                            }
                            return substring;
                        }
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                try {
                    AbstractC1708y2.b("PreInstallHandler error: exception while retrieving data in file" + str, th);
                } catch (Throwable th3) {
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (Throwable unused2) {
                        }
                    }
                    throw th3;
                }
            }
            try {
                bufferedReader.close();
                break;
            } catch (Throwable unused3) {
            }
        }
        return null;
    }

    a a(int i4) {
        String str;
        String str2;
        StringBuilder sb;
        String str3;
        if (i4 == 1) {
            str2 = "ro.mytracker.preinstall.path";
        } else {
            if (i4 != 2) {
                str = "PreInstallHandler: wrong property property key";
                AbstractC1708y2.a(str);
                return null;
            }
            str2 = "ro.appsflyer.preinstall.path";
        }
        String a4 = AbstractC1624d2.a(str2);
        if (TextUtils.isEmpty(a4)) {
            sb = new StringBuilder();
            str3 = "PreInstallHandler: empty path for source: ";
        } else {
            String a5 = a(a4);
            if (!TextUtils.isEmpty(a5)) {
                AbstractC1708y2.a("PreInstallHandler: raw data for source has been found: " + a5);
                return a(i4, a5, a4);
            }
            sb = new StringBuilder();
            str3 = "PreInstallHandler: empty data for source: ";
        }
        sb.append(str3);
        sb.append(i4);
        str = sb.toString();
        AbstractC1708y2.a(str);
        return null;
    }

    public a a() {
        if (!this.f21488b.v()) {
            AbstractC1708y2.a("PreInstallHandler: tracking preinstall is disabled");
            return null;
        }
        a b4 = b();
        if (b4 != null) {
            return b4;
        }
        a a4 = a(1);
        if (a4 != null) {
            return a4;
        }
        if (this.f21488b.w()) {
            return a(2);
        }
        return null;
    }

    static String a(Resources resources, String str, String str2) {
        int identifier = resources.getIdentifier(str + "_mytracker", "string", str2);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }

    public static C1672p1 a(C1631f0 c1631f0, C1712z2 c1712z2, Context context) {
        return new C1672p1(c1631f0, c1712z2, context);
    }
}
