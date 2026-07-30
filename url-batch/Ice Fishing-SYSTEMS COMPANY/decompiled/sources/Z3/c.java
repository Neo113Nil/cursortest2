package Z3;

import N3.n;
import O2.w;
import S0.l;
import a.AbstractC0415a;
import a4.C0428a;
import a4.C0429b;
import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.Log;
import b4.C0527a;
import c7.m;
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
import org.json.JSONException;
import org.json.JSONObject;
import u.AbstractC5088e;

/* loaded from: classes2.dex */
public final class c implements d {

    /* renamed from: m, reason: collision with root package name */
    public static final Object f4255m = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final K3.g f4256a;

    /* renamed from: b, reason: collision with root package name */
    public final b4.c f4257b;

    /* renamed from: c, reason: collision with root package name */
    public final S0.e f4258c;

    /* renamed from: d, reason: collision with root package name */
    public final j f4259d;

    /* renamed from: e, reason: collision with root package name */
    public final n f4260e;

    /* renamed from: f, reason: collision with root package name */
    public final h f4261f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f4262g;

    /* renamed from: h, reason: collision with root package name */
    public final ExecutorService f4263h;
    public final O3.j i;

    /* renamed from: j, reason: collision with root package name */
    public String f4264j;

    /* renamed from: k, reason: collision with root package name */
    public final HashSet f4265k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f4266l;

    static {
        new AtomicInteger(1);
    }

    public c(K3.g gVar, Y3.a aVar, ExecutorService executorService, O3.j jVar) {
        gVar.a();
        b4.c cVar = new b4.c(gVar.f1623a, aVar);
        S0.e eVar = new S0.e(8, gVar);
        if (C3.e.f382u == null) {
            C3.e.f382u = new C3.e();
        }
        C3.e eVar2 = C3.e.f382u;
        if (j.f4274d == null) {
            j.f4274d = new j(eVar2);
        }
        j jVar2 = j.f4274d;
        n nVar = new n(new N3.d(2, gVar));
        h hVar = new h();
        this.f4262g = new Object();
        this.f4265k = new HashSet();
        this.f4266l = new ArrayList();
        this.f4256a = gVar;
        this.f4257b = cVar;
        this.f4258c = eVar;
        this.f4259d = jVar2;
        this.f4260e = nVar;
        this.f4261f = hVar;
        this.f4263h = executorService;
        this.i = jVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0020, code lost:
    
        r3 = f(r2);
        r4 = r6.f4258c;
        r2 = r2.a();
        r2.f5719b = r3;
        r2.f5720c = 3;
        r2 = r2.a();
        r4.h(r2);
     */
    /* JADX WARN: Finally extract failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        C0428a m8;
        synchronized (f4255m) {
            try {
                K3.g gVar = this.f4256a;
                gVar.a();
                l h9 = l.h(gVar.f1623a);
                try {
                    m8 = this.f4258c.m();
                    int i = m8.f4377b;
                    boolean z8 = true;
                    if (i != 2 && i != 1) {
                        z8 = false;
                    }
                    if (h9 != null) {
                        h9.s();
                    }
                } catch (Throwable th) {
                    if (h9 != null) {
                        h9.s();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        i(m8);
        this.i.execute(new b(this, 2));
    }

    public final C0428a b(C0428a c0428a) {
        int responseCode;
        b4.b f6;
        K3.g gVar = this.f4256a;
        gVar.a();
        String str = gVar.f1625c.f1636a;
        String str2 = c0428a.f4376a;
        K3.g gVar2 = this.f4256a;
        gVar2.a();
        String str3 = gVar2.f1625c.f1642g;
        String str4 = c0428a.f4379d;
        b4.c cVar = this.f4257b;
        b4.d dVar = cVar.f5550c;
        if (!dVar.a()) {
            throw new e("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL a9 = b4.c.a("projects/" + str3 + "/installations/" + str2 + "/authTokens:generate");
        for (int i = 0; i <= 1; i++) {
            TrafficStats.setThreadStatsTag(32771);
            HttpURLConnection c4 = cVar.c(a9, str);
            try {
                try {
                    c4.setRequestMethod("POST");
                    c4.addRequestProperty("Authorization", "FIS_v2 " + str4);
                    c4.setDoOutput(true);
                    b4.c.h(c4);
                    responseCode = c4.getResponseCode();
                    dVar.b(responseCode);
                } catch (Throwable th) {
                    c4.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th;
                }
            } catch (IOException | AssertionError unused) {
            }
            if (responseCode >= 200 && responseCode < 300) {
                f6 = b4.c.f(c4);
            } else {
                b4.c.b(c4, null, str, str3);
                if (responseCode == 401 || responseCode == 404) {
                    F.d a10 = b4.b.a();
                    a10.f908b = 3;
                    f6 = a10.c();
                } else {
                    if (responseCode == 429) {
                        throw new e("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                    }
                    if (responseCode < 500 || responseCode >= 600) {
                        Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                        F.d a11 = b4.b.a();
                        a11.f908b = 2;
                        f6 = a11.c();
                    }
                    c4.disconnect();
                    TrafficStats.clearThreadStatsTag();
                }
            }
            c4.disconnect();
            TrafficStats.clearThreadStatsTag();
            int d2 = AbstractC5088e.d(f6.f5545c);
            if (d2 == 0) {
                j jVar = this.f4259d;
                jVar.getClass();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                jVar.f4275a.getClass();
                long seconds = timeUnit.toSeconds(System.currentTimeMillis());
                m a12 = c0428a.a();
                a12.f5721d = f6.f5543a;
                a12.f5723f = Long.valueOf(f6.f5544b);
                a12.f5724g = Long.valueOf(seconds);
                return a12.a();
            }
            if (d2 == 1) {
                m a13 = c0428a.a();
                a13.f5725h = "BAD CONFIG";
                a13.f5720c = 5;
                return a13.a();
            }
            if (d2 != 2) {
                throw new e("Firebase Installations Service is unavailable. Please try again later.");
            }
            synchronized (this) {
                this.f4264j = null;
            }
            m a14 = c0428a.a();
            a14.f5720c = 2;
            return a14.a();
        }
        throw new e("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final h3.n c() {
        String str;
        e();
        synchronized (this) {
            str = this.f4264j;
        }
        if (str != null) {
            return AbstractC0415a.r(str);
        }
        h3.h hVar = new h3.h();
        g gVar = new g(hVar);
        synchronized (this.f4262g) {
            this.f4266l.add(gVar);
        }
        h3.n nVar = hVar.f38206a;
        this.f4263h.execute(new b(this, 0));
        return nVar;
    }

    public final h3.n d() {
        e();
        h3.h hVar = new h3.h();
        f fVar = new f(this.f4259d, hVar);
        synchronized (this.f4262g) {
            this.f4266l.add(fVar);
        }
        this.f4263h.execute(new b(this, 1));
        return hVar.f38206a;
    }

    public final void e() {
        K3.g gVar = this.f4256a;
        gVar.a();
        w.f(gVar.f1625c.f1637b, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        gVar.a();
        w.f(gVar.f1625c.f1642g, "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        gVar.a();
        w.f(gVar.f1625c.f1636a, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        gVar.a();
        String str = gVar.f1625c.f1637b;
        Pattern pattern = j.f4273c;
        w.a("Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.", str.contains(":"));
        gVar.a();
        w.a("Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.", j.f4273c.matcher(gVar.f1625c.f1636a).matches());
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001c, code lost:
    
        if ("[DEFAULT]".equals(r0.f1624b) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String f(C0428a c0428a) {
        String string;
        K3.g gVar = this.f4256a;
        gVar.a();
        if (!gVar.f1624b.equals("CHIME_ANDROID_SDK")) {
            K3.g gVar2 = this.f4256a;
            gVar2.a();
        }
        if (c0428a.f4377b == 1) {
            C0429b c0429b = (C0429b) this.f4260e.get();
            synchronized (c0429b.f4384a) {
                try {
                    synchronized (c0429b.f4384a) {
                        string = c0429b.f4384a.getString("|S|id", null);
                    }
                    if (string == null) {
                        string = c0429b.a();
                    }
                } finally {
                }
            }
            if (!TextUtils.isEmpty(string)) {
                return string;
            }
            this.f4261f.getClass();
            return h.a();
        }
        this.f4261f.getClass();
        return h.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [b4.c] */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [b4.a] */
    public final C0428a g(C0428a c0428a) {
        int responseCode;
        String str = c0428a.f4376a;
        String str2 = null;
        if (str != null && str.length() == 11) {
            C0429b c0429b = (C0429b) this.f4260e.get();
            synchronized (c0429b.f4384a) {
                try {
                    String[] strArr = C0429b.f4383c;
                    int i = 0;
                    while (true) {
                        if (i < 4) {
                            String str3 = strArr[i];
                            String string = c0429b.f4384a.getString("|T|" + c0429b.f4385b + com.anythink.expressad.foundation.g.a.bU + str3, null);
                            if (string == null || string.isEmpty()) {
                                i++;
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
        b4.c cVar = this.f4257b;
        K3.g gVar = this.f4256a;
        gVar.a();
        String str4 = gVar.f1625c.f1636a;
        String str5 = c0428a.f4376a;
        K3.g gVar2 = this.f4256a;
        gVar2.a();
        String str6 = gVar2.f1625c.f1642g;
        K3.g gVar3 = this.f4256a;
        gVar3.a();
        String str7 = gVar3.f1625c.f1637b;
        b4.d dVar = cVar.f5550c;
        if (!dVar.a()) {
            throw new e("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL a9 = b4.c.a("projects/" + str6 + "/installations");
        int i4 = 0;
        C0527a c0527a = cVar;
        while (i4 <= 1) {
            TrafficStats.setThreadStatsTag(32769);
            HttpURLConnection c4 = c0527a.c(a9, str4);
            try {
                try {
                    c4.setRequestMethod("POST");
                    c4.setDoOutput(true);
                    if (str2 != null) {
                        c4.addRequestProperty("x-goog-fis-android-iid-migration-auth", str2);
                    }
                    b4.c.g(c4, str5, str7);
                    responseCode = c4.getResponseCode();
                    dVar.b(responseCode);
                } catch (IOException | AssertionError unused2) {
                }
                if (responseCode >= 200 && responseCode < 300) {
                    C0527a e6 = b4.c.e(c4);
                    c4.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    c0527a = e6;
                } else {
                    try {
                        b4.c.b(c4, str7, str4, str6);
                    } catch (IOException | AssertionError unused3) {
                        c4.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        i4++;
                        c0527a = c0527a;
                    }
                    if (responseCode == 429) {
                        throw new e("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                    }
                    if (responseCode < 500 || responseCode >= 600) {
                        Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                        C0527a c0527a2 = new C0527a(null, null, null, null, 2);
                        c4.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        c0527a = c0527a2;
                    } else {
                        c4.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        i4++;
                        c0527a = c0527a;
                    }
                }
                int d2 = AbstractC5088e.d(c0527a.f5542e);
                if (d2 != 0) {
                    if (d2 != 1) {
                        throw new e("Firebase Installations Service is unavailable. Please try again later.");
                    }
                    m a10 = c0428a.a();
                    a10.f5725h = "BAD CONFIG";
                    a10.f5720c = 5;
                    return a10.a();
                }
                String str8 = c0527a.f5539b;
                String str9 = c0527a.f5540c;
                j jVar = this.f4259d;
                jVar.getClass();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                jVar.f4275a.getClass();
                long seconds = timeUnit.toSeconds(System.currentTimeMillis());
                b4.b bVar = c0527a.f5541d;
                String str10 = bVar.f5543a;
                long j9 = bVar.f5544b;
                m a11 = c0428a.a();
                a11.f5719b = str8;
                a11.f5720c = 4;
                a11.f5721d = str10;
                a11.f5722e = str9;
                a11.f5723f = Long.valueOf(j9);
                a11.f5724g = Long.valueOf(seconds);
                return a11.a();
            } finally {
                c4.disconnect();
                TrafficStats.clearThreadStatsTag();
            }
        }
        throw new e("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final void h(Exception exc) {
        synchronized (this.f4262g) {
            try {
                Iterator it = this.f4266l.iterator();
                while (it.hasNext()) {
                    if (((i) it.next()).b(exc)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i(C0428a c0428a) {
        synchronized (this.f4262g) {
            try {
                Iterator it = this.f4266l.iterator();
                while (it.hasNext()) {
                    if (((i) it.next()).a(c0428a)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
