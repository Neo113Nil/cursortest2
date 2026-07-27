package Z1;

import B0.l;
import B0.t;
import I1.o;
import N1.m;
import O1.k;
import a2.C0180a;
import a2.C0181b;
import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.Log;
import b2.C0275a;
import b2.C0276b;
import b2.C0277c;
import b2.C0278d;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
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
import o1.u;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class c implements d {

    /* renamed from: m, reason: collision with root package name */
    public static final Object f3753m = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final K1.g f3754a;

    /* renamed from: b, reason: collision with root package name */
    public final C0277c f3755b;

    /* renamed from: c, reason: collision with root package name */
    public final t f3756c;

    /* renamed from: d, reason: collision with root package name */
    public final j f3757d;

    /* renamed from: e, reason: collision with root package name */
    public final m f3758e;

    /* renamed from: f, reason: collision with root package name */
    public final h f3759f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f3760g;

    /* renamed from: h, reason: collision with root package name */
    public final ExecutorService f3761h;

    /* renamed from: i, reason: collision with root package name */
    public final k f3762i;

    /* renamed from: j, reason: collision with root package name */
    public String f3763j;

    /* renamed from: k, reason: collision with root package name */
    public final HashSet f3764k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f3765l;

    static {
        new AtomicInteger(1);
    }

    public c(K1.g gVar, Y1.a aVar, ExecutorService executorService, k kVar) {
        gVar.a();
        C0277c c0277c = new C0277c(gVar.f1387a, aVar);
        t tVar = new t(gVar);
        if (W1.e.f3404b == null) {
            W1.e.f3404b = new W1.e();
        }
        W1.e eVar = W1.e.f3404b;
        if (j.f3773d == null) {
            j.f3773d = new j(eVar);
        }
        j jVar = j.f3773d;
        m mVar = new m(new N1.c(2, gVar));
        h hVar = new h();
        this.f3760g = new Object();
        this.f3764k = new HashSet();
        this.f3765l = new ArrayList();
        this.f3754a = gVar;
        this.f3755b = c0277c;
        this.f3756c = tVar;
        this.f3757d = jVar;
        this.f3758e = mVar;
        this.f3759f = hVar;
        this.f3761h = executorService;
        this.f3762i = kVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0020, code lost:
    
        r3 = f(r2);
        r4 = r6.f3756c;
        r2 = r2.a();
        r2.f2627b = r3;
        r2.f2628c = 3;
        r2 = r2.a();
        r4.j(r2);
     */
    /* JADX WARN: Finally extract failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        C0180a l2;
        synchronized (f3753m) {
            try {
                K1.g gVar = this.f3754a;
                gVar.a();
                l b6 = l.b(gVar.f1387a);
                try {
                    l2 = this.f3756c.l();
                    int i2 = l2.f3849b;
                    boolean z = true;
                    if (i2 != 2 && i2 != 1) {
                        z = false;
                    }
                    if (b6 != null) {
                        b6.g();
                    }
                } catch (Throwable th) {
                    if (b6 != null) {
                        b6.g();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        i(l2);
        this.f3762i.execute(new b(this, 2));
    }

    public final C0180a b(C0180a c0180a) {
        int responseCode;
        C0276b f3;
        K1.g gVar = this.f3754a;
        gVar.a();
        String str = gVar.f1389c.f1401a;
        String str2 = c0180a.f3848a;
        K1.g gVar2 = this.f3754a;
        gVar2.a();
        String str3 = gVar2.f1389c.f1407g;
        String str4 = c0180a.f3851d;
        C0277c c0277c = this.f3755b;
        C0278d c0278d = c0277c.f4812c;
        if (!c0278d.a()) {
            throw new e("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL a6 = C0277c.a("projects/" + str3 + "/installations/" + str2 + "/authTokens:generate");
        for (int i2 = 0; i2 <= 1; i2++) {
            TrafficStats.setThreadStatsTag(32771);
            HttpURLConnection c2 = c0277c.c(a6, str);
            try {
                try {
                    c2.setRequestMethod("POST");
                    c2.addRequestProperty("Authorization", "FIS_v2 " + str4);
                    c2.setDoOutput(true);
                    C0277c.h(c2);
                    responseCode = c2.getResponseCode();
                    c0278d.b(responseCode);
                } catch (Throwable th) {
                    c2.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th;
                }
            } catch (IOException | AssertionError unused) {
            }
            if (responseCode >= 200 && responseCode < 300) {
                f3 = C0277c.f(c2);
            } else {
                C0277c.b(c2, null, str, str3);
                if (responseCode == 401 || responseCode == 404) {
                    B3.d a7 = C0276b.a();
                    a7.f276b = 3;
                    f3 = a7.a();
                } else {
                    if (responseCode == 429) {
                        throw new e("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                    }
                    if (responseCode < 500 || responseCode >= 600) {
                        Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                        B3.d a8 = C0276b.a();
                        a8.f276b = 2;
                        f3 = a8.a();
                    }
                    c2.disconnect();
                    TrafficStats.clearThreadStatsTag();
                }
            }
            c2.disconnect();
            TrafficStats.clearThreadStatsTag();
            int b6 = O.j.b(f3.f4807c);
            if (b6 == 0) {
                j jVar = this.f3757d;
                jVar.getClass();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                jVar.f3774a.getClass();
                long seconds = timeUnit.toSeconds(System.currentTimeMillis());
                R3.m a9 = c0180a.a();
                a9.f2629d = f3.f4805a;
                a9.f2631f = Long.valueOf(f3.f4806b);
                a9.f2632g = Long.valueOf(seconds);
                return a9.a();
            }
            if (b6 == 1) {
                R3.m a10 = c0180a.a();
                a10.f2633h = "BAD CONFIG";
                a10.f2628c = 5;
                return a10.a();
            }
            if (b6 != 2) {
                throw new e("Firebase Installations Service is unavailable. Please try again later.");
            }
            synchronized (this) {
                this.f3763j = null;
            }
            R3.m a11 = c0180a.a();
            a11.f2628c = 2;
            return a11.a();
        }
        throw new e("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final o c() {
        String str;
        e();
        synchronized (this) {
            str = this.f3763j;
        }
        if (str != null) {
            return B0.f.r(str);
        }
        I1.h hVar = new I1.h();
        g gVar = new g(hVar);
        synchronized (this.f3760g) {
            this.f3765l.add(gVar);
        }
        o oVar = hVar.f1248a;
        this.f3761h.execute(new b(this, 0));
        return oVar;
    }

    public final o d() {
        e();
        I1.h hVar = new I1.h();
        f fVar = new f(this.f3757d, hVar);
        synchronized (this.f3760g) {
            this.f3765l.add(fVar);
        }
        this.f3761h.execute(new b(this, 1));
        return hVar.f1248a;
    }

    public final void e() {
        K1.g gVar = this.f3754a;
        gVar.a();
        u.d(gVar.f1389c.f1402b, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        gVar.a();
        u.d(gVar.f1389c.f1407g, "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        gVar.a();
        u.d(gVar.f1389c.f1401a, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        gVar.a();
        String str = gVar.f1389c.f1402b;
        Pattern pattern = j.f3772c;
        u.a("Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.", str.contains(StringUtils.PROCESS_POSTFIX_DELIMITER));
        gVar.a();
        u.a("Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.", j.f3772c.matcher(gVar.f1389c.f1401a).matches());
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001c, code lost:
    
        if ("[DEFAULT]".equals(r0.f1388b) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String f(C0180a c0180a) {
        String string;
        K1.g gVar = this.f3754a;
        gVar.a();
        if (!gVar.f1388b.equals("CHIME_ANDROID_SDK")) {
            K1.g gVar2 = this.f3754a;
            gVar2.a();
        }
        if (c0180a.f3849b == 1) {
            C0181b c0181b = (C0181b) this.f3758e.get();
            synchronized (c0181b.f3856a) {
                try {
                    synchronized (c0181b.f3856a) {
                        string = c0181b.f3856a.getString("|S|id", null);
                    }
                    if (string == null) {
                        string = c0181b.a();
                    }
                } finally {
                }
            }
            if (!TextUtils.isEmpty(string)) {
                return string;
            }
            this.f3759f.getClass();
            return h.a();
        }
        this.f3759f.getClass();
        return h.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [b2.c] */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [b2.a] */
    public final C0180a g(C0180a c0180a) {
        int responseCode;
        String str = c0180a.f3848a;
        String str2 = null;
        if (str != null && str.length() == 11) {
            C0181b c0181b = (C0181b) this.f3758e.get();
            synchronized (c0181b.f3856a) {
                try {
                    String[] strArr = C0181b.f3855c;
                    int i2 = 0;
                    while (true) {
                        if (i2 < 4) {
                            String str3 = strArr[i2];
                            String string = c0181b.f3856a.getString("|T|" + c0181b.f3857b + "|" + str3, null);
                            if (string == null || string.isEmpty()) {
                                i2++;
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
        C0277c c0277c = this.f3755b;
        K1.g gVar = this.f3754a;
        gVar.a();
        String str4 = gVar.f1389c.f1401a;
        String str5 = c0180a.f3848a;
        K1.g gVar2 = this.f3754a;
        gVar2.a();
        String str6 = gVar2.f1389c.f1407g;
        K1.g gVar3 = this.f3754a;
        gVar3.a();
        String str7 = gVar3.f1389c.f1402b;
        C0278d c0278d = c0277c.f4812c;
        if (!c0278d.a()) {
            throw new e("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL a6 = C0277c.a("projects/" + str6 + "/installations");
        int i3 = 0;
        C0275a c0275a = c0277c;
        while (i3 <= 1) {
            TrafficStats.setThreadStatsTag(32769);
            HttpURLConnection c2 = c0275a.c(a6, str4);
            try {
                try {
                    c2.setRequestMethod("POST");
                    c2.setDoOutput(true);
                    if (str2 != null) {
                        c2.addRequestProperty("x-goog-fis-android-iid-migration-auth", str2);
                    }
                    C0277c.g(c2, str5, str7);
                    responseCode = c2.getResponseCode();
                    c0278d.b(responseCode);
                } catch (IOException | AssertionError unused2) {
                }
                if (responseCode >= 200 && responseCode < 300) {
                    C0275a e3 = C0277c.e(c2);
                    c2.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    c0275a = e3;
                } else {
                    try {
                        C0277c.b(c2, str7, str4, str6);
                    } catch (IOException | AssertionError unused3) {
                        c2.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        i3++;
                        c0275a = c0275a;
                    }
                    if (responseCode == 429) {
                        throw new e("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                    }
                    if (responseCode < 500 || responseCode >= 600) {
                        Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                        C0275a c0275a2 = new C0275a(null, null, null, null, 2);
                        c2.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        c0275a = c0275a2;
                    } else {
                        c2.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        i3++;
                        c0275a = c0275a;
                    }
                }
                int b6 = O.j.b(c0275a.f4804e);
                if (b6 != 0) {
                    if (b6 != 1) {
                        throw new e("Firebase Installations Service is unavailable. Please try again later.");
                    }
                    R3.m a7 = c0180a.a();
                    a7.f2633h = "BAD CONFIG";
                    a7.f2628c = 5;
                    return a7.a();
                }
                String str8 = c0275a.f4801b;
                String str9 = c0275a.f4802c;
                j jVar = this.f3757d;
                jVar.getClass();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                jVar.f3774a.getClass();
                long seconds = timeUnit.toSeconds(System.currentTimeMillis());
                C0276b c0276b = c0275a.f4803d;
                String str10 = c0276b.f4805a;
                long j2 = c0276b.f4806b;
                R3.m a8 = c0180a.a();
                a8.f2627b = str8;
                a8.f2628c = 4;
                a8.f2629d = str10;
                a8.f2630e = str9;
                a8.f2631f = Long.valueOf(j2);
                a8.f2632g = Long.valueOf(seconds);
                return a8.a();
            } finally {
                c2.disconnect();
                TrafficStats.clearThreadStatsTag();
            }
        }
        throw new e("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final void h(Exception exc) {
        synchronized (this.f3760g) {
            try {
                Iterator it = this.f3765l.iterator();
                while (it.hasNext()) {
                    if (((i) it.next()).a(exc)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i(C0180a c0180a) {
        synchronized (this.f3760g) {
            try {
                Iterator it = this.f3765l.iterator();
                while (it.hasNext()) {
                    if (((i) it.next()).b(c0180a)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
