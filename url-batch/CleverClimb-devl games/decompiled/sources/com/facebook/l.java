package com.facebook;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.AsyncTask;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Base64;
import com.facebook.GraphRequest;
import com.facebook.internal.BoltsMeasurementEventListener;
import com.facebook.internal.ab;
import com.facebook.internal.ac;
import com.facebook.internal.b;
import com.mopub.common.AdType;
import java.io.File;
import java.net.HttpURLConnection;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: FacebookSdk.java */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: c, reason: collision with root package name */
    private static volatile Executor f6217c;

    /* renamed from: d, reason: collision with root package name */
    private static volatile String f6218d;
    private static volatile String e;
    private static volatile String f;
    private static volatile int g;
    private static com.facebook.internal.s<File> l;
    private static Context m;

    /* renamed from: a, reason: collision with root package name */
    private static final String f6215a = l.class.getCanonicalName();

    /* renamed from: b, reason: collision with root package name */
    private static final HashSet<u> f6216b = new HashSet<>(Arrays.asList(u.DEVELOPER_ERRORS));
    private static volatile String h = "facebook.com";
    private static AtomicLong i = new AtomicLong(PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH);
    private static volatile boolean j = false;
    private static boolean k = false;
    private static int n = 64206;
    private static final Object o = new Object();
    private static final BlockingQueue<Runnable> p = new LinkedBlockingQueue(10);
    private static final ThreadFactory q = new ThreadFactory() { // from class: com.facebook.l.1

        /* renamed from: a, reason: collision with root package name */
        private final AtomicInteger f6219a = new AtomicInteger(0);

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "FacebookSdk #" + this.f6219a.incrementAndGet());
        }
    };
    private static Boolean r = false;

    /* compiled from: FacebookSdk.java */
    public interface a {
        void a();
    }

    public static String g() {
        return "4.12.1";
    }

    public static synchronized void a(Context context) {
        synchronized (l.class) {
            a(context, (a) null);
        }
    }

    public static synchronized void a(final Context context, final a aVar) {
        synchronized (l.class) {
            if (r.booleanValue()) {
                if (aVar != null) {
                    aVar.a();
                }
                return;
            }
            ac.a(context, "applicationContext");
            ac.b(context, false);
            ac.a(context, false);
            m = context.getApplicationContext();
            c(m);
            r = true;
            ab.a(m, f6218d);
            com.facebook.internal.w.b();
            BoltsMeasurementEventListener.a(m);
            l = new com.facebook.internal.s<>(new Callable<File>() { // from class: com.facebook.l.2
                @Override // java.util.concurrent.Callable
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public File call() throws Exception {
                    return l.m.getCacheDir();
                }
            });
            d().execute(new FutureTask(new Callable<Void>() { // from class: com.facebook.l.3
                @Override // java.util.concurrent.Callable
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public Void call() throws Exception {
                    b.a().c();
                    w.a().c();
                    if (AccessToken.getCurrentAccessToken() != null && Profile.getCurrentProfile() == null) {
                        Profile.fetchProfileForCurrentAccessToken();
                    }
                    if (a.this != null) {
                        a.this.a();
                    }
                    com.facebook.appevents.f.c(context.getApplicationContext()).b();
                    return null;
                }
            }));
        }
    }

    public static synchronized boolean a() {
        boolean booleanValue;
        synchronized (l.class) {
            booleanValue = r.booleanValue();
        }
        return booleanValue;
    }

    public static boolean a(u uVar) {
        boolean z;
        synchronized (f6216b) {
            z = b() && f6216b.contains(uVar);
        }
        return z;
    }

    public static boolean b() {
        return j;
    }

    public static boolean c() {
        return k;
    }

    public static Executor d() {
        synchronized (o) {
            if (f6217c == null) {
                f6217c = AsyncTask.THREAD_POOL_EXECUTOR;
            }
        }
        return f6217c;
    }

    public static String e() {
        return h;
    }

    public static Context f() {
        ac.a();
        return m;
    }

    public static void a(Context context, final String str) {
        final Context applicationContext = context.getApplicationContext();
        d().execute(new Runnable() { // from class: com.facebook.l.4
            @Override // java.lang.Runnable
            public void run() {
                l.b(applicationContext, str);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0068 A[Catch: Exception -> 0x00b9, TRY_ENTER, TryCatch #2 {Exception -> 0x00b9, blocks: (B:5:0x0005, B:7:0x003c, B:8:0x004a, B:20:0x005f, B:14:0x0068, B:17:0x007e, B:23:0x0084, B:25:0x0099, B:26:0x00a4, B:30:0x00a9, B:31:0x00b0, B:32:0x00b1, B:33:0x00b8), top: B:2:0x0001, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007e A[Catch: Exception -> 0x00b9, TryCatch #2 {Exception -> 0x00b9, blocks: (B:5:0x0005, B:7:0x003c, B:8:0x004a, B:20:0x005f, B:14:0x0068, B:17:0x007e, B:23:0x0084, B:25:0x0099, B:26:0x00a4, B:30:0x00a9, B:31:0x00b0, B:32:0x00b1, B:33:0x00b8), top: B:2:0x0001, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static q b(Context context, String str) {
        JSONObject jSONObject;
        try {
            if (context == null || str == null) {
                throw new IllegalArgumentException("Both context and applicationId must be non-null");
            }
            com.facebook.internal.c a2 = com.facebook.internal.c.a(context);
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.sdk.attributionTracking", 0);
            String str2 = str + "ping";
            String str3 = str + AdType.STATIC_NATIVE;
            long j2 = sharedPreferences.getLong(str2, 0L);
            String string = sharedPreferences.getString(str3, null);
            try {
                GraphRequest a3 = GraphRequest.a((AccessToken) null, String.format("%s/activities", str), com.facebook.internal.b.a(b.a.MOBILE_INSTALL_EVENT, a2, com.facebook.appevents.f.d(context), b(context), context), (GraphRequest.b) null);
                if (j2 == 0) {
                    q i2 = a3.i();
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    edit.putLong(str2, System.currentTimeMillis());
                    if (i2.b() != null) {
                        edit.putString(str3, i2.b().toString());
                    }
                    edit.apply();
                    return i2;
                }
                if (string != null) {
                    try {
                        jSONObject = new JSONObject(string);
                    } catch (JSONException unused) {
                    }
                    if (jSONObject != null) {
                        return q.a("true", (HttpURLConnection) null, new p(a3)).get(0);
                    }
                    return new q((GraphRequest) null, (HttpURLConnection) null, (String) null, jSONObject);
                }
                jSONObject = null;
                if (jSONObject != null) {
                }
            } catch (JSONException e2) {
                throw new j("An error occurred while publishing install.", e2);
            }
        } catch (Exception e3) {
            ab.a("Facebook-publish", e3);
            return new q(null, null, new FacebookRequestError((HttpURLConnection) null, e3));
        }
    }

    public static boolean b(Context context) {
        ac.a();
        return context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getBoolean("limitEventUsage", false);
    }

    public static long h() {
        ac.a();
        return i.get();
    }

    static void c(Context context) {
        if (context == null) {
            return;
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            if (applicationInfo == null || applicationInfo.metaData == null) {
                return;
            }
            if (f6218d == null) {
                Object obj = applicationInfo.metaData.get("com.facebook.sdk.ApplicationId");
                if (obj instanceof String) {
                    String str = (String) obj;
                    if (str.toLowerCase(Locale.ROOT).startsWith("fb")) {
                        f6218d = str.substring(2);
                    } else {
                        f6218d = str;
                    }
                } else if (obj instanceof Integer) {
                    throw new j("App Ids cannot be directly placed in the manifest.They must be prefixed by 'fb' or be placed in the string resource file.");
                }
            }
            if (e == null) {
                e = applicationInfo.metaData.getString("com.facebook.sdk.ApplicationName");
            }
            if (f == null) {
                f = applicationInfo.metaData.getString("com.facebook.sdk.ClientToken");
            }
            if (g == 0) {
                a(applicationInfo.metaData.getInt("com.facebook.sdk.WebDialogTheme"));
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public static String d(Context context) {
        PackageManager packageManager;
        ac.a();
        if (context == null || (packageManager = context.getPackageManager()) == null) {
            return null;
        }
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(context.getPackageName(), 64);
            Signature[] signatureArr = packageInfo.signatures;
            if (signatureArr == null || signatureArr.length == 0) {
                return null;
            }
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
                messageDigest.update(packageInfo.signatures[0].toByteArray());
                return Base64.encodeToString(messageDigest.digest(), 9);
            } catch (NoSuchAlgorithmException unused) {
                return null;
            }
        } catch (PackageManager.NameNotFoundException unused2) {
            return null;
        }
    }

    public static String i() {
        ac.a();
        return f6218d;
    }

    public static String j() {
        ac.a();
        return e;
    }

    public static String k() {
        ac.a();
        return f;
    }

    public static int l() {
        ac.a();
        return g;
    }

    public static void a(int i2) {
        if (i2 == 0) {
            i2 = android.R.style.Theme.Translucent.NoTitleBar;
        }
        g = i2;
    }

    public static File m() {
        ac.a();
        return l.a();
    }

    public static int n() {
        ac.a();
        return n;
    }

    public static boolean b(int i2) {
        return i2 >= n && i2 < n + 100;
    }
}
