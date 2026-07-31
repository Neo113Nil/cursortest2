package B1;

import N.p;
import U0.t;
import W4.m;
import a.AbstractC0219a;
import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import k1.n;
import org.json.JSONException;
import org.json.JSONObject;
import u0.C0675e;
import u0.C0682l;
import y1.C0760d;

/* loaded from: classes.dex */
public final class d implements e {

    /* renamed from: m, reason: collision with root package name */
    public static final Object f91m = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final m1.g f92a;

    /* renamed from: b, reason: collision with root package name */
    public final D1.d f93b;

    /* renamed from: c, reason: collision with root package name */
    public final C0682l f94c;

    /* renamed from: d, reason: collision with root package name */
    public final l f95d;

    /* renamed from: e, reason: collision with root package name */
    public final p1.k f96e;

    /* renamed from: f, reason: collision with root package name */
    public final j f97f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f98g;

    /* renamed from: h, reason: collision with root package name */
    public final ExecutorService f99h;

    /* renamed from: i, reason: collision with root package name */
    public final q1.h f100i;

    /* renamed from: j, reason: collision with root package name */
    public String f101j;

    /* renamed from: k, reason: collision with root package name */
    public final HashSet f102k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f103l;

    static {
        new AtomicInteger(1);
    }

    public d(m1.g gVar, A1.a aVar, ExecutorService executorService, q1.h hVar) {
        gVar.a();
        D1.d dVar = new D1.d(gVar.f5425a, aVar);
        C0682l c0682l = new C0682l(gVar);
        if (C0760d.f6234f == null) {
            C0760d.f6234f = new C0760d();
        }
        C0760d c0760d = C0760d.f6234f;
        if (l.f112d == null) {
            l.f112d = new l(c0760d);
        }
        l lVar = l.f112d;
        p1.k kVar = new p1.k(new b(0, gVar));
        j jVar = new j();
        this.f98g = new Object();
        this.f102k = new HashSet();
        this.f103l = new ArrayList();
        this.f92a = gVar;
        this.f93b = dVar;
        this.f94c = c0682l;
        this.f95d = lVar;
        this.f96e = kVar;
        this.f97f = jVar;
        this.f99h = executorService;
        this.f100i = hVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0020, code lost:
    
        r3 = f(r2);
        r4 = r6.f94c;
        r2 = r2.a();
        r2.f2807b = r3;
        r2.f2808c = 3;
        r2 = r2.a();
        r4.l(r2);
     */
    /* JADX WARN: Finally extract failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        C1.a m4;
        synchronized (f91m) {
            try {
                m1.g gVar = this.f92a;
                gVar.a();
                C0675e a7 = C0675e.a(gVar.f5425a);
                try {
                    m4 = this.f94c.m();
                    int i7 = m4.f190b;
                    boolean z5 = true;
                    if (i7 != 2 && i7 != 1) {
                        z5 = false;
                    }
                    if (a7 != null) {
                        a7.h();
                    }
                } catch (Throwable th) {
                    if (a7 != null) {
                        a7.h();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        i(m4);
        this.f100i.execute(new c(this, 2));
    }

    public final C1.a b(C1.a aVar) {
        int responseCode;
        D1.c f7;
        D1.d dVar = this.f93b;
        m1.g gVar = this.f92a;
        gVar.a();
        String str = gVar.f5427c.f5439a;
        String str2 = aVar.f189a;
        m1.g gVar2 = this.f92a;
        gVar2.a();
        String str3 = gVar2.f5427c.f5445g;
        String str4 = aVar.f192d;
        D1.e eVar = dVar.f378c;
        if (!eVar.a()) {
            throw new f("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL a7 = D1.d.a("projects/" + str3 + "/installations/" + str2 + "/authTokens:generate");
        for (int i7 = 0; i7 <= 1; i7++) {
            TrafficStats.setThreadStatsTag(32771);
            HttpURLConnection c7 = dVar.c(a7, str);
            try {
                try {
                    c7.setRequestMethod("POST");
                    c7.addRequestProperty("Authorization", "FIS_v2 " + str4);
                    c7.setDoOutput(true);
                    D1.d.h(c7);
                    responseCode = c7.getResponseCode();
                    eVar.b(responseCode);
                } finally {
                    c7.disconnect();
                    TrafficStats.clearThreadStatsTag();
                }
            } catch (IOException | AssertionError unused) {
            }
            if (responseCode >= 200 && responseCode < 300) {
                f7 = D1.d.f(c7);
            } else {
                D1.d.b(c7, null, str, str3);
                if (responseCode == 401 || responseCode == 404) {
                    D1.b a8 = D1.c.a();
                    a8.f368b = 3;
                    f7 = a8.a();
                } else {
                    if (responseCode == 429) {
                        throw new f("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                    }
                    if (responseCode < 500 || responseCode >= 600) {
                        Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                        D1.b a9 = D1.c.a();
                        a9.f368b = 2;
                        f7 = a9.a();
                    }
                }
            }
            int c8 = p.c(f7.f373c);
            if (c8 != 0) {
                if (c8 == 1) {
                    m a10 = aVar.a();
                    a10.f2813h = "BAD CONFIG";
                    a10.f2808c = 5;
                    return a10.a();
                }
                if (c8 != 2) {
                    throw new f("Firebase Installations Service is unavailable. Please try again later.");
                }
                synchronized (this) {
                    this.f101j = null;
                }
                m a11 = aVar.a();
                a11.f2808c = 2;
                return a11.a();
            }
            String str5 = f7.f371a;
            long j4 = f7.f372b;
            l lVar = this.f95d;
            lVar.getClass();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            lVar.f113a.getClass();
            long seconds = timeUnit.toSeconds(System.currentTimeMillis());
            m a12 = aVar.a();
            a12.f2809d = str5;
            a12.f2811f = Long.valueOf(j4);
            a12.f2812g = Long.valueOf(seconds);
            return a12.a();
        }
        throw new f("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final n c() {
        String str;
        e();
        synchronized (this) {
            str = this.f101j;
        }
        if (str != null) {
            return AbstractC0219a.p(str);
        }
        k1.h hVar = new k1.h();
        i iVar = new i(hVar);
        synchronized (this.f98g) {
            this.f103l.add(iVar);
        }
        n nVar = hVar.f5157a;
        this.f99h.execute(new c(this, 0));
        return nVar;
    }

    public final n d() {
        e();
        k1.h hVar = new k1.h();
        h hVar2 = new h(this.f95d, hVar);
        synchronized (this.f98g) {
            this.f103l.add(hVar2);
        }
        n nVar = hVar.f5157a;
        this.f99h.execute(new c(this, 1));
        return nVar;
    }

    public final void e() {
        m1.g gVar = this.f92a;
        gVar.a();
        t.d(gVar.f5427c.f5440b, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        gVar.a();
        t.d(gVar.f5427c.f5445g, "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        gVar.a();
        t.d(gVar.f5427c.f5439a, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        gVar.a();
        String str = gVar.f5427c.f5440b;
        Pattern pattern = l.f111c;
        t.a("Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.", str.contains(":"));
        gVar.a();
        t.a("Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.", l.f111c.matcher(gVar.f5427c.f5439a).matches());
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001c, code lost:
    
        if ("[DEFAULT]".equals(r0.f5426b) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String f(C1.a aVar) {
        String string;
        m1.g gVar = this.f92a;
        gVar.a();
        if (!gVar.f5426b.equals("CHIME_ANDROID_SDK")) {
            m1.g gVar2 = this.f92a;
            gVar2.a();
        }
        if (aVar.f190b == 1) {
            C1.b bVar = (C1.b) this.f96e.get();
            synchronized (bVar.f197a) {
                try {
                    synchronized (bVar.f197a) {
                        string = bVar.f197a.getString("|S|id", null);
                    }
                    if (string == null) {
                        string = bVar.a();
                    }
                } finally {
                }
            }
            if (!TextUtils.isEmpty(string)) {
                return string;
            }
            this.f97f.getClass();
            return j.a();
        }
        this.f97f.getClass();
        return j.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [D1.d] */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [D1.a] */
    public final C1.a g(C1.a aVar) {
        int responseCode;
        String str = aVar.f189a;
        String str2 = null;
        if (str != null && str.length() == 11) {
            C1.b bVar = (C1.b) this.f96e.get();
            synchronized (bVar.f197a) {
                try {
                    String[] strArr = C1.b.f196c;
                    int i7 = 0;
                    while (true) {
                        if (i7 < 4) {
                            String str3 = strArr[i7];
                            String string = bVar.f197a.getString("|T|" + bVar.f198b + "|" + str3, null);
                            if (string == null || string.isEmpty()) {
                                i7++;
                            } else if (string.startsWith("{")) {
                                try {
                                    str2 = new JSONObject(string).getString("token");
                                } catch (JSONException unused) {
                                }
                            } else {
                                str2 = string;
                            }
                        }
                    }
                } finally {
                }
            }
        }
        D1.d dVar = this.f93b;
        m1.g gVar = this.f92a;
        gVar.a();
        String str4 = gVar.f5427c.f5439a;
        String str5 = aVar.f189a;
        m1.g gVar2 = this.f92a;
        gVar2.a();
        String str6 = gVar2.f5427c.f5445g;
        m1.g gVar3 = this.f92a;
        gVar3.a();
        String str7 = gVar3.f5427c.f5440b;
        D1.e eVar = dVar.f378c;
        if (!eVar.a()) {
            throw new f("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL a7 = D1.d.a("projects/" + str6 + "/installations");
        int i8 = 0;
        D1.a aVar2 = dVar;
        while (i8 <= 1) {
            TrafficStats.setThreadStatsTag(32769);
            HttpURLConnection c7 = aVar2.c(a7, str4);
            try {
                try {
                    c7.setRequestMethod("POST");
                    c7.setDoOutput(true);
                    if (str2 != null) {
                        c7.addRequestProperty("x-goog-fis-android-iid-migration-auth", str2);
                    }
                    D1.d.g(c7, str5, str7);
                    responseCode = c7.getResponseCode();
                    eVar.b(responseCode);
                } catch (IOException | AssertionError unused2) {
                }
                if (responseCode >= 200 && responseCode < 300) {
                    D1.a e4 = D1.d.e(c7);
                    c7.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    aVar2 = e4;
                } else {
                    try {
                        D1.d.b(c7, str7, str4, str6);
                    } catch (IOException | AssertionError unused3) {
                        c7.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        i8++;
                        aVar2 = aVar2;
                    }
                    if (responseCode == 429) {
                        throw new f("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                    }
                    if (responseCode < 500 || responseCode >= 600) {
                        Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                        D1.a aVar3 = new D1.a(null, null, null, null, 2);
                        c7.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        aVar2 = aVar3;
                    } else {
                        c7.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        i8++;
                        aVar2 = aVar2;
                    }
                }
                int c8 = p.c(aVar2.f366e);
                if (c8 != 0) {
                    if (c8 != 1) {
                        throw new f("Firebase Installations Service is unavailable. Please try again later.");
                    }
                    m a8 = aVar.a();
                    a8.f2813h = "BAD CONFIG";
                    a8.f2808c = 5;
                    return a8.a();
                }
                String str8 = aVar2.f363b;
                String str9 = aVar2.f364c;
                l lVar = this.f95d;
                lVar.getClass();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                lVar.f113a.getClass();
                long seconds = timeUnit.toSeconds(System.currentTimeMillis());
                D1.c cVar = aVar2.f365d;
                String str10 = cVar.f371a;
                long j4 = cVar.f372b;
                m a9 = aVar.a();
                a9.f2807b = str8;
                a9.f2808c = 4;
                a9.f2809d = str10;
                a9.f2810e = str9;
                a9.f2811f = Long.valueOf(j4);
                a9.f2812g = Long.valueOf(seconds);
                return a9.a();
            } finally {
                c7.disconnect();
                TrafficStats.clearThreadStatsTag();
            }
        }
        throw new f("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final void h(Exception exc) {
        synchronized (this.f98g) {
            try {
                Iterator it = this.f103l.iterator();
                while (it.hasNext()) {
                    if (((k) it.next()).b(exc)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i(C1.a aVar) {
        synchronized (this.f98g) {
            try {
                Iterator it = this.f103l.iterator();
                while (it.hasNext()) {
                    if (((k) it.next()).a(aVar)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
