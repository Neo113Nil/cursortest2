package com.facebook.ads.internal.i;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64OutputStream;
import com.facebook.ads.internal.f.e;
import com.facebook.ads.internal.q.a.f;
import com.facebook.ads.internal.q.a.g;
import com.facebook.ads.internal.q.a.h;
import com.facebook.ads.internal.q.a.j;
import com.facebook.ads.internal.q.a.m;
import com.facebook.ads.internal.q.a.r;
import com.facebook.ads.internal.q.a.v;
import com.facebook.ads.internal.q.c.d;
import com.facebook.ads.internal.settings.AdInternalSettings;
import com.tapjoy.TapjoyConstants;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.zip.DeflaterOutputStream;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private static final AtomicInteger f5153a = new AtomicInteger(0);

    /* renamed from: b, reason: collision with root package name */
    private static String f5154b = null;

    /* renamed from: c, reason: collision with root package name */
    private static final f.a f5155c = f.a();

    /* renamed from: d, reason: collision with root package name */
    private final Context f5156d;
    private final com.facebook.ads.internal.g.b e;

    public c(Context context, boolean z) {
        this.f5156d = context;
        this.e = new com.facebook.ads.internal.g.b(context);
        a(context, z);
    }

    private static void a(final Context context, boolean z) {
        if (f5153a.compareAndSet(0, 1)) {
            try {
                m.a();
                final SharedPreferences sharedPreferences = context.getSharedPreferences("FBAdPrefs", 0);
                final String str = "AFP;" + new com.facebook.ads.internal.g.b(context).g();
                f5154b = sharedPreferences.getString(str, null);
                FutureTask futureTask = new FutureTask(new Callable<Boolean>() { // from class: com.facebook.ads.internal.i.c.1
                    @Override // java.util.concurrent.Callable
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public Boolean call() {
                        String unused = c.f5154b = c.b(context, context.getPackageName());
                        sharedPreferences.edit().putString(str, c.f5154b).apply();
                        c.f5153a.set(2);
                        return true;
                    }
                });
                Executors.newSingleThreadExecutor().submit(futureTask);
                if (z) {
                    futureTask.get();
                }
            } catch (Exception unused) {
                f5153a.set(0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String b(Context context, String str) {
        try {
            return h.a(context.getPackageManager().getApplicationInfo(str, 0).sourceDir);
        } catch (Exception e) {
            e.a(e, context, new c(context, false).b());
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.io.ByteArrayOutputStream, java.io.OutputStream] */
    public String a() {
        Base64OutputStream base64OutputStream;
        DeflaterOutputStream deflaterOutputStream;
        Throwable th;
        IOException e;
        ?? r1 = 1;
        a(this.f5156d, true);
        try {
            try {
                r1 = new ByteArrayOutputStream();
                try {
                    base64OutputStream = new Base64OutputStream(r1, 0);
                    try {
                        DeflaterOutputStream deflaterOutputStream2 = new DeflaterOutputStream(base64OutputStream);
                        try {
                            deflaterOutputStream2.write(new JSONObject(b()).toString().getBytes());
                            deflaterOutputStream2.close();
                            String byteArrayOutputStream = r1.toString();
                            try {
                                deflaterOutputStream2.close();
                                base64OutputStream.close();
                                r1.close();
                            } catch (IOException unused) {
                            }
                            return byteArrayOutputStream;
                        } catch (IOException e2) {
                            e = e2;
                            throw new RuntimeException("Failed to build user token", e);
                        }
                    } catch (IOException e3) {
                        e = e3;
                    } catch (Throwable th2) {
                        deflaterOutputStream = null;
                        th = th2;
                        if (deflaterOutputStream != null) {
                            try {
                                deflaterOutputStream.close();
                            } catch (IOException unused2) {
                                throw th;
                            }
                        }
                        if (base64OutputStream != null) {
                            base64OutputStream.close();
                        }
                        if (r1 != 0) {
                            r1.close();
                        }
                        throw th;
                    }
                } catch (IOException e4) {
                    e = e4;
                } catch (Throwable th3) {
                    deflaterOutputStream = null;
                    th = th3;
                    base64OutputStream = null;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (IOException e5) {
            e = e5;
        } catch (Throwable th5) {
            base64OutputStream = null;
            deflaterOutputStream = null;
            th = th5;
            r1 = 0;
        }
    }

    public Map<String, String> b() {
        a(this.f5156d, false);
        com.facebook.ads.internal.g.a.a(this.f5156d);
        HashMap hashMap = new HashMap();
        hashMap.put("SDK", TapjoyConstants.TJC_DEVICE_PLATFORM_TYPE);
        hashMap.put("SDK_VERSION", "4.28.2");
        hashMap.put("LOCALE", Locale.getDefault().toString());
        float f = v.f5438b;
        int i = this.f5156d.getResources().getDisplayMetrics().widthPixels;
        int i2 = this.f5156d.getResources().getDisplayMetrics().heightPixels;
        hashMap.put("DENSITY", String.valueOf(f));
        hashMap.put("SCREEN_WIDTH", String.valueOf((int) (i / f)));
        hashMap.put("SCREEN_HEIGHT", String.valueOf((int) (i2 / f)));
        hashMap.put("ATTRIBUTION_ID", com.facebook.ads.internal.c.b.f5050a);
        hashMap.put("ID_SOURCE", com.facebook.ads.internal.c.b.f5053d);
        hashMap.put("OS", "Android");
        hashMap.put("OSVERS", com.facebook.ads.internal.g.b.f5127a);
        hashMap.put("BUNDLE", this.e.f());
        hashMap.put("APPNAME", this.e.d());
        hashMap.put("APPVERS", this.e.g());
        hashMap.put("APPBUILD", String.valueOf(this.e.h()));
        hashMap.put("CARRIER", this.e.c());
        hashMap.put("MAKE", this.e.a());
        hashMap.put("MODEL", this.e.b());
        hashMap.put("ROOTED", String.valueOf(f5155c.f5411d));
        hashMap.put("INSTALLER", this.e.e());
        hashMap.put("SDK_CAPABILITY", com.facebook.ads.internal.q.a.c.b());
        hashMap.put("NETWORK_TYPE", String.valueOf(d.c(this.f5156d).g));
        hashMap.put("SESSION_TIME", r.a(m.b()));
        hashMap.put("SESSION_ID", m.c());
        if (f5154b != null) {
            hashMap.put("AFP", f5154b);
        }
        String a2 = f.a(this.f5156d);
        if (a2 != null) {
            hashMap.put("ASHAS", a2);
        }
        hashMap.put("UNITY", String.valueOf(g.a(this.f5156d)));
        String mediationService = AdInternalSettings.getMediationService();
        if (mediationService != null) {
            hashMap.put("MEDIATION_SERVICE", mediationService);
        }
        hashMap.put("ACCESSIBILITY_ENABLED", String.valueOf(this.e.i()));
        if (this.e.j() != -1) {
            hashMap.put("APP_MIN_SDK_VERSION", String.valueOf(this.e.j()));
        }
        hashMap.put("VALPARAMS", b.a());
        hashMap.put("ANALOG", j.a(com.facebook.ads.internal.g.a.a()));
        return hashMap;
    }
}
