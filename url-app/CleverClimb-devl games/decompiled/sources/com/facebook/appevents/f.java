package com.facebook.appevents;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.facebook.AccessToken;
import com.facebook.internal.ab;
import com.facebook.internal.ac;
import com.facebook.internal.t;
import com.facebook.u;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: AppEventsLogger.java */
/* loaded from: classes.dex */
public class f {

    /* renamed from: d, reason: collision with root package name */
    private static ScheduledThreadPoolExecutor f5971d;
    private static Context f;
    private static String h;
    private static String i;
    private static boolean j;
    private static boolean k;
    private static String l;

    /* renamed from: b, reason: collision with root package name */
    private final String f5972b;

    /* renamed from: c, reason: collision with root package name */
    private final com.facebook.appevents.a f5973c;

    /* renamed from: a, reason: collision with root package name */
    private static final String f5970a = f.class.getCanonicalName();
    private static a e = a.AUTO;
    private static Object g = new Object();

    /* compiled from: AppEventsLogger.java */
    public enum a {
        AUTO,
        EXPLICIT_ONLY
    }

    @Deprecated
    public static void a(Context context) {
        if (com.facebook.appevents.a.a.a()) {
            Log.w(f5970a, "activateApp events are being logged automatically. There's no need to call activateApp explicitly, this is safe to remove.");
        } else {
            com.facebook.l.a(context);
            a(context, ab.a(context));
        }
    }

    @Deprecated
    public static void a(Context context, String str) {
        if (com.facebook.appevents.a.a.a()) {
            Log.w(f5970a, "activateApp events are being logged automatically. There's no need to call activateApp explicitly, this is safe to remove.");
            return;
        }
        if (context == null || str == null) {
            throw new IllegalArgumentException("Both context and applicationId must be non-null");
        }
        if (context instanceof Activity) {
            a((Activity) context);
        } else {
            f();
            Log.d(f.class.getName(), "To set source application the context of activateApp must be an instance of Activity");
        }
        com.facebook.l.a(context, str);
        f fVar = new f(context, str, null);
        final long currentTimeMillis = System.currentTimeMillis();
        final String e2 = e();
        f5971d.execute(new Runnable() { // from class: com.facebook.appevents.f.1
            @Override // java.lang.Runnable
            public void run() {
                f.this.a(currentTimeMillis, e2);
            }
        });
    }

    @Deprecated
    public static void b(Context context) {
        if (com.facebook.appevents.a.a.a()) {
            Log.w(f5970a, "deactivateApp events are being logged automatically. There's no need to call deactivateApp, this is safe to remove.");
        } else {
            b(context, ab.a(context));
        }
    }

    @Deprecated
    public static void b(Context context, String str) {
        if (com.facebook.appevents.a.a.a()) {
            Log.w(f5970a, "deactivateApp events are being logged automatically. There's no need to call deactivateApp, this is safe to remove.");
            return;
        }
        if (context == null || str == null) {
            throw new IllegalArgumentException("Both context and applicationId must be non-null");
        }
        f();
        f fVar = new f(context, str, null);
        final long currentTimeMillis = System.currentTimeMillis();
        f5971d.execute(new Runnable() { // from class: com.facebook.appevents.f.2
            @Override // java.lang.Runnable
            public void run() {
                f.this.a(currentTimeMillis);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(long j2, String str) {
        b.a(f, this.f5973c, this, j2, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(long j2) {
        b.a(f, this.f5973c, this, j2);
    }

    public static f c(Context context) {
        return new f(context, null, null);
    }

    public static f c(Context context, String str) {
        return new f(context, str, null);
    }

    public static a a() {
        a aVar;
        synchronized (g) {
            aVar = e;
        }
        return aVar;
    }

    public void a(String str, Bundle bundle) {
        a(str, null, bundle, false, com.facebook.appevents.a.a.b());
    }

    public void a(String str, double d2, Bundle bundle) {
        a(str, Double.valueOf(d2), bundle, false, com.facebook.appevents.a.a.b());
    }

    public void b() {
        d.a(h.EXPLICIT);
    }

    static String c() {
        String str;
        synchronized (g) {
            str = l;
        }
        return str;
    }

    public void a(String str, Double d2, Bundle bundle) {
        a(str, d2, bundle, true, com.facebook.appevents.a.a.b());
    }

    private f(Context context, String str, AccessToken accessToken) {
        ac.a(context, com.umeng.analytics.pro.b.M);
        this.f5972b = ab.c(context);
        accessToken = accessToken == null ? AccessToken.getCurrentAccessToken() : accessToken;
        if (accessToken != null && (str == null || str.equals(accessToken.getApplicationId()))) {
            this.f5973c = new com.facebook.appevents.a(accessToken);
        } else {
            this.f5973c = new com.facebook.appevents.a(null, str == null ? ab.a(context) : str);
        }
        synchronized (g) {
            if (f == null) {
                f = context.getApplicationContext();
            }
        }
        k();
    }

    private static void k() {
        synchronized (g) {
            if (f5971d != null) {
                return;
            }
            f5971d = new ScheduledThreadPoolExecutor(1);
            f5971d.scheduleAtFixedRate(new Runnable() { // from class: com.facebook.appevents.f.3
                @Override // java.lang.Runnable
                public void run() {
                    HashSet hashSet = new HashSet();
                    synchronized (f.g) {
                        Iterator<com.facebook.appevents.a> it = d.a().iterator();
                        while (it.hasNext()) {
                            hashSet.add(it.next().b());
                        }
                    }
                    Iterator it2 = hashSet.iterator();
                    while (it2.hasNext()) {
                        ab.a((String) it2.next(), true);
                    }
                }
            }, 0L, 86400L, TimeUnit.SECONDS);
        }
    }

    static Context d() {
        return f;
    }

    private void a(String str, Double d2, Bundle bundle, boolean z, UUID uuid) {
        a(f, new com.facebook.appevents.b(this.f5972b, str, d2, bundle, z, uuid), this.f5973c);
    }

    private static void a(Context context, com.facebook.appevents.b bVar, com.facebook.appevents.a aVar) {
        d.a(aVar, bVar);
        if (bVar.b() || k) {
            return;
        }
        if (bVar.a() == "fb_mobile_activate_app") {
            k = true;
        } else {
            t.a(u.APP_EVENTS, "AppEvents", "Warning: Please call AppEventsLogger.activateApp(...)from the long-lived activity's onResume() methodbefore logging other app events.");
        }
    }

    private static void a(Activity activity) {
        ComponentName callingActivity = activity.getCallingActivity();
        if (callingActivity != null) {
            String packageName = callingActivity.getPackageName();
            if (packageName.equals(activity.getPackageName())) {
                f();
                return;
            }
            i = packageName;
        }
        Intent intent = activity.getIntent();
        if (intent == null || intent.getBooleanExtra("_fbSourceApplicationHasBeenSet", false)) {
            f();
            return;
        }
        Bundle a2 = a.a.a(intent);
        if (a2 == null) {
            f();
            return;
        }
        j = true;
        Bundle bundle = a2.getBundle("referer_app_link");
        if (bundle == null) {
            i = null;
        } else {
            i = bundle.getString("package");
            intent.putExtra("_fbSourceApplicationHasBeenSet", true);
        }
    }

    static String e() {
        String str = j ? "Applink" : "Unclassified";
        if (i == null) {
            return str;
        }
        return str + "(" + i + ")";
    }

    static void f() {
        i = null;
        j = false;
    }

    public static String d(Context context) {
        if (h == null) {
            synchronized (g) {
                if (h == null) {
                    h = context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getString("anonymousAppDeviceGUID", null);
                    if (h == null) {
                        h = "XZ" + UUID.randomUUID().toString();
                        context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putString("anonymousAppDeviceGUID", h).apply();
                    }
                }
            }
        }
        return h;
    }

    /* compiled from: AppEventsLogger.java */
    static class b {

        /* renamed from: d, reason: collision with root package name */
        private static Map<com.facebook.appevents.a, g> f5985d;

        /* renamed from: a, reason: collision with root package name */
        private static final Object f5982a = new Object();

        /* renamed from: b, reason: collision with root package name */
        private static boolean f5983b = false;

        /* renamed from: c, reason: collision with root package name */
        private static boolean f5984c = false;
        private static final Runnable e = new Runnable() { // from class: com.facebook.appevents.f.b.1
            @Override // java.lang.Runnable
            public void run() {
                b.a(f.f);
            }
        };

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0089 A[Catch: all -> 0x00ae, TryCatch #6 {, blocks: (B:4:0x0003, B:11:0x0026, B:13:0x0032, B:14:0x0039, B:16:0x003b, B:26:0x0066, B:28:0x0072, B:29:0x0079, B:32:0x007d, B:34:0x0089, B:35:0x0090, B:36:0x0094, B:20:0x0096, B:22:0x00a2, B:23:0x00a9, B:43:0x00ac), top: B:3:0x0003 }] */
        /* JADX WARN: Type inference failed for: r9v12, types: [java.util.Map<com.facebook.appevents.a, com.facebook.appevents.g>] */
        /* JADX WARN: Type inference failed for: r9v14, types: [java.util.HashMap, java.util.Map<com.facebook.appevents.a, com.facebook.appevents.g>] */
        /* JADX WARN: Type inference failed for: r9v6, types: [java.util.Map<com.facebook.appevents.a, com.facebook.appevents.g>] */
        /* JADX WARN: Type inference failed for: r9v8, types: [java.util.HashMap, java.util.Map<com.facebook.appevents.a, com.facebook.appevents.g>] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void b(Context context) {
            ObjectInputStream objectInputStream;
            Throwable th;
            Exception e2;
            synchronized (f5982a) {
                if (!f5984c) {
                    try {
                        try {
                            objectInputStream = new ObjectInputStream(context.openFileInput("AppEventsLogger.persistedsessioninfo"));
                            try {
                                f5985d = (HashMap) objectInputStream.readObject();
                                t.a(u.APP_EVENTS, "AppEvents", "App session info loaded");
                                ab.a((Closeable) objectInputStream);
                                context.deleteFile("AppEventsLogger.persistedsessioninfo");
                                ?? r9 = f5985d;
                                Context context2 = r9;
                                if (r9 == 0) {
                                    ?? hashMap = new HashMap();
                                    f5985d = hashMap;
                                    context2 = hashMap;
                                }
                                f5984c = true;
                                context = context2;
                            } catch (FileNotFoundException unused) {
                                ab.a((Closeable) objectInputStream);
                                context.deleteFile("AppEventsLogger.persistedsessioninfo");
                                if (f5985d == null) {
                                    f5985d = new HashMap();
                                }
                                f5984c = true;
                                f5983b = false;
                            } catch (Exception e3) {
                                e2 = e3;
                                Log.w(f.f5970a, "Got unexpected exception restoring app session info: " + e2.toString());
                                ab.a((Closeable) objectInputStream);
                                context.deleteFile("AppEventsLogger.persistedsessioninfo");
                                ?? r92 = f5985d;
                                Context context3 = r92;
                                if (r92 == 0) {
                                    ?? hashMap2 = new HashMap();
                                    f5985d = hashMap2;
                                    context3 = hashMap2;
                                }
                                f5984c = true;
                                context = context3;
                                f5983b = false;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            ab.a((Closeable) objectInputStream);
                            context.deleteFile("AppEventsLogger.persistedsessioninfo");
                            if (f5985d == null) {
                                f5985d = new HashMap();
                            }
                            f5984c = true;
                            f5983b = false;
                            throw th;
                        }
                    } catch (FileNotFoundException unused2) {
                        objectInputStream = null;
                    } catch (Exception e4) {
                        objectInputStream = null;
                        e2 = e4;
                    } catch (Throwable th3) {
                        objectInputStream = null;
                        th = th3;
                        ab.a((Closeable) objectInputStream);
                        context.deleteFile("AppEventsLogger.persistedsessioninfo");
                        if (f5985d == null) {
                        }
                        f5984c = true;
                        f5983b = false;
                        throw th;
                    }
                    f5983b = false;
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.String] */
        static void a(Context context) {
            ObjectOutputStream objectOutputStream;
            synchronized (f5982a) {
                if (f5983b) {
                    ObjectOutputStream objectOutputStream2 = null;
                    ObjectOutputStream objectOutputStream3 = null;
                    try {
                        try {
                            objectOutputStream = new ObjectOutputStream(new BufferedOutputStream(context.openFileOutput("AppEventsLogger.persistedsessioninfo", 0)));
                        } catch (Throwable th) {
                            th = th;
                        }
                    } catch (Exception e2) {
                        e = e2;
                    }
                    try {
                        objectOutputStream.writeObject(f5985d);
                        f5983b = false;
                        ?? r1 = "AppEvents";
                        t.a(u.APP_EVENTS, "AppEvents", "App session info saved");
                        ab.a(objectOutputStream);
                        objectOutputStream2 = r1;
                    } catch (Exception e3) {
                        e = e3;
                        objectOutputStream3 = objectOutputStream;
                        Log.w(f.f5970a, "Got unexpected exception while writing app session info: " + e.toString());
                        ab.a(objectOutputStream3);
                        objectOutputStream2 = objectOutputStream3;
                    } catch (Throwable th2) {
                        th = th2;
                        objectOutputStream2 = objectOutputStream;
                        ab.a(objectOutputStream2);
                        throw th;
                    }
                }
            }
        }

        static void a(Context context, com.facebook.appevents.a aVar, f fVar, long j, String str) {
            synchronized (f5982a) {
                a(context, aVar).a(fVar, j, str);
                a();
            }
        }

        static void a(Context context, com.facebook.appevents.a aVar, f fVar, long j) {
            synchronized (f5982a) {
                a(context, aVar).a(fVar, j);
                a();
            }
        }

        private static g a(Context context, com.facebook.appevents.a aVar) {
            b(context);
            g gVar = f5985d.get(aVar);
            if (gVar != null) {
                return gVar;
            }
            g gVar2 = new g();
            f5985d.put(aVar, gVar2);
            return gVar2;
        }

        private static void a() {
            if (f5983b) {
                return;
            }
            f5983b = true;
            f.f5971d.schedule(e, 30L, TimeUnit.SECONDS);
        }
    }
}
