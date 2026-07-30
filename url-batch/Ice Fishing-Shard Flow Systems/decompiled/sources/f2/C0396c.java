package f2;

import K1.p;
import P0.s;
import S1.n;
import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.Log;
import e2.InterfaceC0372a;
import g2.C0447a;
import g2.C0448b;
import h2.C0470a;
import h2.C0471b;
import h2.C0472c;
import h2.C0473d;
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
import t1.u;
import z1.AbstractC1053a;

/* renamed from: f2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0396c implements InterfaceC0397d {

    /* renamed from: m, reason: collision with root package name */
    public static final Object f4778m = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final P1.g f4779a;

    /* renamed from: b, reason: collision with root package name */
    public final C0472c f4780b;

    /* renamed from: c, reason: collision with root package name */
    public final P0.e f4781c;

    /* renamed from: d, reason: collision with root package name */
    public final j f4782d;

    /* renamed from: e, reason: collision with root package name */
    public final n f4783e;

    /* renamed from: f, reason: collision with root package name */
    public final h f4784f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f4785g;

    /* renamed from: h, reason: collision with root package name */
    public final ExecutorService f4786h;

    /* renamed from: i, reason: collision with root package name */
    public final T1.j f4787i;
    public String j;

    /* renamed from: k, reason: collision with root package name */
    public final HashSet f4788k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f4789l;

    static {
        new AtomicInteger(1);
    }

    public C0396c(P1.g gVar, InterfaceC0372a interfaceC0372a, ExecutorService executorService, T1.j jVar) {
        gVar.a();
        C0472c c0472c = new C0472c(gVar.f2270a, interfaceC0372a);
        P0.e eVar = new P0.e(gVar);
        if (c2.e.f4187i == null) {
            c2.e.f4187i = new c2.e();
        }
        c2.e eVar2 = c2.e.f4187i;
        if (j.f4797d == null) {
            j.f4797d = new j(eVar2);
        }
        j jVar2 = j.f4797d;
        n nVar = new n(new S1.d(2, gVar));
        h hVar = new h();
        this.f4785g = new Object();
        this.f4788k = new HashSet();
        this.f4789l = new ArrayList();
        this.f4779a = gVar;
        this.f4780b = c0472c;
        this.f4781c = eVar;
        this.f4782d = jVar2;
        this.f4783e = nVar;
        this.f4784f = hVar;
        this.f4786h = executorService;
        this.f4787i = jVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0020, code lost:
    
        r3 = f(r2);
        r4 = r6.f4781c;
        r2 = r2.a();
        r2.f5011a = r3;
        r2.f5012b = 3;
        r2 = r2.a();
        r4.s(r2);
     */
    /* JADX WARN: Finally extract failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        C0448b u7;
        synchronized (f4778m) {
            try {
                P1.g gVar = this.f4779a;
                gVar.a();
                s v7 = s.v(gVar.f2270a);
                try {
                    u7 = this.f4781c.u();
                    int i2 = u7.f5021b;
                    boolean z7 = true;
                    if (i2 != 2 && i2 != 1) {
                        z7 = false;
                    }
                    if (v7 != null) {
                        v7.y();
                    }
                } catch (Throwable th) {
                    if (v7 != null) {
                        v7.y();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        i(u7);
        this.f4787i.execute(new RunnableC0395b(this, 1));
    }

    public final C0448b b(C0448b c0448b) {
        int i2;
        int responseCode;
        C0471b c0471b;
        C0471b c0471b2;
        C0472c c0472c = this.f4780b;
        P1.g gVar = this.f4779a;
        gVar.a();
        String str = gVar.f2272c.f2279a;
        String str2 = c0448b.f5020a;
        P1.g gVar2 = this.f4779a;
        gVar2.a();
        String str3 = gVar2.f2272c.f2286h;
        String str4 = c0448b.f5023d;
        C0473d c0473d = c0472c.f5159c;
        if (!c0473d.a()) {
            throw new C0398e("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL a7 = C0472c.a("projects/" + str3 + "/installations/" + str2 + "/authTokens:generate");
        for (int i5 = 0; i5 <= 1; i5 = i2 + 1) {
            TrafficStats.setThreadStatsTag(32771);
            HttpURLConnection c7 = c0472c.c(a7, str);
            try {
                try {
                    c7.setRequestMethod("POST");
                    c7.addRequestProperty("Authorization", "FIS_v2 " + str4);
                    c7.setDoOutput(true);
                    C0472c.h(c7);
                    responseCode = c7.getResponseCode();
                    c0473d.b(responseCode);
                } finally {
                    c7.disconnect();
                    TrafficStats.clearThreadStatsTag();
                }
            } catch (IOException | AssertionError unused) {
                i2 = i5;
            }
            if (responseCode >= 200 && responseCode < 300) {
                c0471b2 = C0472c.f(c7);
            } else {
                C0472c.b(c7, null, str, str3);
                i2 = i5;
                if (responseCode == 401 || responseCode == 404) {
                    if (((byte) (0 | 1)) != 1) {
                        throw new IllegalStateException("Missing required properties: tokenExpirationTimestamp");
                    }
                    c0471b = new C0471b(0L, null, 3);
                } else {
                    if (responseCode == 429) {
                        throw new C0398e("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                    }
                    if (responseCode < 500 || responseCode >= 600) {
                        Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                        if (((byte) (0 | 1)) != 1) {
                            throw new IllegalStateException("Missing required properties: tokenExpirationTimestamp");
                        }
                        c0471b = new C0471b(0L, null, 2);
                    }
                }
                c7.disconnect();
                TrafficStats.clearThreadStatsTag();
                c0471b2 = c0471b;
            }
            int b7 = S.i.b(c0471b2.f5154c);
            if (b7 != 0) {
                if (b7 == 1) {
                    C0447a a8 = c0448b.a();
                    a8.f5017g = "BAD CONFIG";
                    a8.f5012b = 5;
                    return a8.a();
                }
                if (b7 != 2) {
                    throw new C0398e("Firebase Installations Service is unavailable. Please try again later.");
                }
                synchronized (this) {
                    this.j = null;
                }
                C0447a a9 = c0448b.a();
                a9.f5012b = 2;
                return a9.a();
            }
            String str5 = c0471b2.f5152a;
            long j = c0471b2.f5153b;
            j jVar = this.f4782d;
            jVar.getClass();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            jVar.f4798a.getClass();
            long seconds = timeUnit.toSeconds(System.currentTimeMillis());
            C0447a a10 = c0448b.a();
            a10.f5013c = str5;
            a10.f5015e = j;
            byte b8 = (byte) (a10.f5018h | 1);
            a10.f5016f = seconds;
            a10.f5018h = (byte) (b8 | 2);
            return a10.a();
        }
        throw new C0398e("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final p c() {
        String str;
        e();
        synchronized (this) {
            str = this.j;
        }
        if (str != null) {
            return AbstractC1053a.w(str);
        }
        K1.h hVar = new K1.h();
        C0400g c0400g = new C0400g(hVar);
        synchronized (this.f4785g) {
            this.f4789l.add(c0400g);
        }
        p pVar = hVar.f1428a;
        this.f4786h.execute(new RunnableC0395b(this, 0));
        return pVar;
    }

    public final p d() {
        e();
        K1.h hVar = new K1.h();
        C0399f c0399f = new C0399f(this.f4782d, hVar);
        synchronized (this.f4785g) {
            this.f4789l.add(c0399f);
        }
        p pVar = hVar.f1428a;
        this.f4786h.execute(new RunnableC0395b(this, 2));
        return pVar;
    }

    public final void e() {
        P1.g gVar = this.f4779a;
        gVar.a();
        u.d(gVar.f2272c.f2280b, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        gVar.a();
        u.d(gVar.f2272c.f2286h, "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        gVar.a();
        u.d(gVar.f2272c.f2279a, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        gVar.a();
        String str = gVar.f2272c.f2280b;
        Pattern pattern = j.f4796c;
        u.a("Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.", str.contains(":"));
        gVar.a();
        u.a("Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.", j.f4796c.matcher(gVar.f2272c.f2279a).matches());
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001c, code lost:
    
        if ("[DEFAULT]".equals(r0.f2271b) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String f(C0448b c0448b) {
        String string;
        P1.g gVar = this.f4779a;
        gVar.a();
        if (!gVar.f2271b.equals("CHIME_ANDROID_SDK")) {
            P1.g gVar2 = this.f4779a;
            gVar2.a();
        }
        if (c0448b.f5021b == 1) {
            g2.c cVar = (g2.c) this.f4783e.get();
            synchronized (cVar.f5028a) {
                try {
                    synchronized (cVar.f5028a) {
                        string = cVar.f5028a.getString("|S|id", null);
                    }
                    if (string == null) {
                        string = cVar.a();
                    }
                } finally {
                }
            }
            if (!TextUtils.isEmpty(string)) {
                return string;
            }
            this.f4784f.getClass();
            return h.a();
        }
        this.f4784f.getClass();
        return h.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [h2.c] */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [h2.a] */
    public final C0448b g(C0448b c0448b) {
        int responseCode;
        String str = c0448b.f5020a;
        String str2 = null;
        if (str != null && str.length() == 11) {
            g2.c cVar = (g2.c) this.f4783e.get();
            synchronized (cVar.f5028a) {
                try {
                    String[] strArr = g2.c.f5027c;
                    int i2 = 0;
                    while (true) {
                        if (i2 < 4) {
                            String str3 = strArr[i2];
                            String string = cVar.f5028a.getString("|T|" + cVar.f5029b + "|" + str3, null);
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
        C0472c c0472c = this.f4780b;
        P1.g gVar = this.f4779a;
        gVar.a();
        String str4 = gVar.f2272c.f2279a;
        String str5 = c0448b.f5020a;
        P1.g gVar2 = this.f4779a;
        gVar2.a();
        String str6 = gVar2.f2272c.f2286h;
        P1.g gVar3 = this.f4779a;
        gVar3.a();
        String str7 = gVar3.f2272c.f2280b;
        C0473d c0473d = c0472c.f5159c;
        if (!c0473d.a()) {
            throw new C0398e("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL a7 = C0472c.a("projects/" + str6 + "/installations");
        int i5 = 0;
        C0470a c0470a = c0472c;
        while (i5 <= 1) {
            TrafficStats.setThreadStatsTag(32769);
            HttpURLConnection c7 = c0470a.c(a7, str4);
            try {
                try {
                    c7.setRequestMethod("POST");
                    c7.setDoOutput(true);
                    if (str2 != null) {
                        c7.addRequestProperty("x-goog-fis-android-iid-migration-auth", str2);
                    }
                    C0472c.g(c7, str5, str7);
                    responseCode = c7.getResponseCode();
                    c0473d.b(responseCode);
                } catch (IOException | AssertionError unused2) {
                }
                if (responseCode >= 200 && responseCode < 300) {
                    C0470a e7 = C0472c.e(c7);
                    c7.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    c0470a = e7;
                } else {
                    try {
                        C0472c.b(c7, str7, str4, str6);
                    } catch (IOException | AssertionError unused3) {
                        c7.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        i5++;
                        c0470a = c0470a;
                    }
                    if (responseCode == 429) {
                        throw new C0398e("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                    }
                    if (responseCode < 500 || responseCode >= 600) {
                        Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                        C0470a c0470a2 = new C0470a(null, null, null, null, 2);
                        c7.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        c0470a = c0470a2;
                    } else {
                        c7.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        i5++;
                        c0470a = c0470a;
                    }
                }
                int b7 = S.i.b(c0470a.f5151e);
                if (b7 != 0) {
                    if (b7 != 1) {
                        throw new C0398e("Firebase Installations Service is unavailable. Please try again later.");
                    }
                    C0447a a8 = c0448b.a();
                    a8.f5017g = "BAD CONFIG";
                    a8.f5012b = 5;
                    return a8.a();
                }
                String str8 = c0470a.f5148b;
                String str9 = c0470a.f5149c;
                j jVar = this.f4782d;
                jVar.getClass();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                jVar.f4798a.getClass();
                long seconds = timeUnit.toSeconds(System.currentTimeMillis());
                C0471b c0471b = c0470a.f5150d;
                String str10 = c0471b.f5152a;
                long j = c0471b.f5153b;
                C0447a a9 = c0448b.a();
                a9.f5011a = str8;
                a9.f5012b = 4;
                a9.f5013c = str10;
                a9.f5014d = str9;
                a9.f5015e = j;
                byte b8 = (byte) (a9.f5018h | 1);
                a9.f5016f = seconds;
                a9.f5018h = (byte) (b8 | 2);
                return a9.a();
            } finally {
                c7.disconnect();
                TrafficStats.clearThreadStatsTag();
            }
        }
        throw new C0398e("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final void h(Exception exc) {
        synchronized (this.f4785g) {
            try {
                Iterator it = this.f4789l.iterator();
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

    public final void i(C0448b c0448b) {
        synchronized (this.f4785g) {
            try {
                Iterator it = this.f4789l.iterator();
                while (it.hasNext()) {
                    if (((i) it.next()).a(c0448b)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
