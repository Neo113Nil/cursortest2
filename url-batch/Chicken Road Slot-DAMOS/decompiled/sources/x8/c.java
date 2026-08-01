package x8;

import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.Log;
import c6.l;
import c7.c0;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import l8.n;
import org.json.JSONException;
import org.json.JSONObject;
import z4.w;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class c implements d {

    /* renamed from: m, reason: collision with root package name */
    public static final Object f10546m = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final g8.g f10547a;

    /* renamed from: b, reason: collision with root package name */
    public final z8.c f10548b;

    /* renamed from: c, reason: collision with root package name */
    public final c6.e f10549c;

    /* renamed from: d, reason: collision with root package name */
    public final j f10550d;

    /* renamed from: e, reason: collision with root package name */
    public final n f10551e;

    /* renamed from: f, reason: collision with root package name */
    public final h f10552f;
    public final Object g;

    /* renamed from: h, reason: collision with root package name */
    public final ExecutorService f10553h;

    /* renamed from: i, reason: collision with root package name */
    public final m8.j f10554i;
    public String j;

    /* renamed from: k, reason: collision with root package name */
    public final HashSet f10555k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f10556l;

    static {
        new AtomicInteger(1);
    }

    public c(g8.g gVar, w8.a aVar, ExecutorService executorService, m8.j jVar) {
        gVar.a();
        z8.c cVar = new z8.c(gVar.f4300a, aVar);
        c6.e eVar = new c6.e(gVar);
        if (u8.d.f9691e == null) {
            u8.d.f9691e = new u8.d(3);
        }
        u8.d dVar = u8.d.f9691e;
        if (j.f10563c == null) {
            j.f10563c = new j(dVar);
        }
        j jVar2 = j.f10563c;
        n nVar = new n(new l8.d(2, gVar));
        h hVar = new h();
        this.g = new Object();
        this.f10555k = new HashSet();
        this.f10556l = new ArrayList();
        this.f10547a = gVar;
        this.f10548b = cVar;
        this.f10549c = eVar;
        this.f10550d = jVar2;
        this.f10551e = nVar;
        this.f10552f = hVar;
        this.f10553h = executorService;
        this.f10554i = jVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0020, code lost:
    
        r3 = f(r2);
        r4 = r6.f10549c;
        r2 = r2.a();
        r2.f10667a = r3;
        r2.f10668b = 3;
        r2 = r2.a();
        r4.k(r2);
     */
    /* JADX WARN: Finally extract failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        y8.b n10;
        synchronized (f10546m) {
            try {
                g8.g gVar = this.f10547a;
                gVar.a();
                l a9 = l.a(gVar.f4300a);
                try {
                    n10 = this.f10549c.n();
                    int i3 = n10.f10676b;
                    boolean z10 = true;
                    if (i3 != 2 && i3 != 1) {
                        z10 = false;
                    }
                    if (a9 != null) {
                        a9.j();
                    }
                } catch (Throwable th) {
                    if (a9 != null) {
                        a9.j();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        i(n10);
        this.f10554i.execute(new b(this, 1));
    }

    public final y8.b b(y8.b bVar) {
        int i3;
        int responseCode;
        z8.b bVar2;
        z8.b bVar3;
        z8.c cVar = this.f10548b;
        g8.g gVar = this.f10547a;
        gVar.a();
        String str = gVar.f4302c.f4313a;
        String str2 = bVar.f10675a;
        g8.g gVar2 = this.f10547a;
        gVar2.a();
        String str3 = gVar2.f4302c.f4319h;
        String str4 = bVar.f10678d;
        i6.b bVar4 = cVar.f10962c;
        if (!bVar4.a()) {
            throw new e("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL a9 = z8.c.a("projects/" + str3 + "/installations/" + str2 + "/authTokens:generate");
        for (int i10 = 0; i10 <= 1; i10 = i3 + 1) {
            TrafficStats.setThreadStatsTag(32771);
            HttpURLConnection c10 = cVar.c(a9, str);
            try {
                try {
                    c10.setRequestMethod("POST");
                    c10.addRequestProperty("Authorization", "FIS_v2 " + str4);
                    c10.setDoOutput(true);
                    z8.c.h(c10);
                    responseCode = c10.getResponseCode();
                    bVar4.b(responseCode);
                } finally {
                    c10.disconnect();
                    TrafficStats.clearThreadStatsTag();
                }
            } catch (IOException | AssertionError unused) {
                i3 = i10;
            }
            if (responseCode >= 200 && responseCode < 300) {
                bVar3 = z8.c.f(c10);
            } else {
                z8.c.b(c10, null, str, str3);
                i3 = i10;
                if (responseCode == 401 || responseCode == 404) {
                    if (((byte) (0 | 1)) != 1) {
                        throw new IllegalStateException("Missing required properties: tokenExpirationTimestamp");
                    }
                    bVar2 = new z8.b(3, 0L, null);
                } else {
                    if (responseCode == 429) {
                        throw new e("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                    }
                    if (responseCode < 500 || responseCode >= 600) {
                        Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                        if (((byte) (0 | 1)) != 1) {
                            throw new IllegalStateException("Missing required properties: tokenExpirationTimestamp");
                        }
                        bVar2 = new z8.b(2, 0L, null);
                    }
                }
                c10.disconnect();
                TrafficStats.clearThreadStatsTag();
                bVar3 = bVar2;
            }
            int b10 = a4.i.b(bVar3.f10957c);
            if (b10 == 0) {
                String str5 = bVar3.f10955a;
                long j = bVar3.f10956b;
                this.f10550d.f10564a.getClass();
                long currentTimeMillis = System.currentTimeMillis() / 1000;
                y8.a a10 = bVar.a();
                a10.f10669c = str5;
                a10.f10671e = j;
                byte b11 = (byte) (a10.f10673h | 1);
                a10.f10672f = currentTimeMillis;
                a10.f10673h = (byte) (b11 | 2);
                return a10.a();
            }
            if (b10 == 1) {
                y8.a a11 = bVar.a();
                a11.g = "BAD CONFIG";
                a11.f10668b = 5;
                return a11.a();
            }
            if (b10 != 2) {
                throw new e("Firebase Installations Service is unavailable. Please try again later.");
            }
            synchronized (this) {
                this.j = null;
            }
            y8.a a12 = bVar.a();
            a12.f10668b = 2;
            return a12.a();
        }
        throw new e("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final w7.n c() {
        String str;
        e();
        synchronized (this) {
            str = this.j;
        }
        if (str != null) {
            return w.q(str);
        }
        w7.g gVar = new w7.g();
        g gVar2 = new g(gVar);
        synchronized (this.g) {
            this.f10556l.add(gVar2);
        }
        w7.n nVar = gVar.f10117a;
        this.f10553h.execute(new b(this, 0));
        return nVar;
    }

    public final w7.n d() {
        e();
        w7.g gVar = new w7.g();
        f fVar = new f(this.f10550d, gVar);
        synchronized (this.g) {
            this.f10556l.add(fVar);
        }
        w7.n nVar = gVar.f10117a;
        this.f10553h.execute(new b(this, 2));
        return nVar;
    }

    public final void e() {
        g8.g gVar = this.f10547a;
        gVar.a();
        c0.e(gVar.f4302c.f4314b, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        gVar.a();
        c0.e(gVar.f4302c.f4319h, "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        gVar.a();
        c0.e(gVar.f4302c.f4313a, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        gVar.a();
        String str = gVar.f4302c.f4314b;
        Pattern pattern = j.f10562b;
        c0.a("Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.", str.contains(":"));
        gVar.a();
        c0.a("Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.", j.f10562b.matcher(gVar.f4302c.f4313a).matches());
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001c, code lost:
    
        if ("[DEFAULT]".equals(r0.f4301b) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String f(y8.b bVar) {
        String string;
        g8.g gVar = this.f10547a;
        gVar.a();
        if (!gVar.f4301b.equals("CHIME_ANDROID_SDK")) {
            g8.g gVar2 = this.f10547a;
            gVar2.a();
        }
        if (bVar.f10676b == 1) {
            y8.c cVar = (y8.c) this.f10551e.get();
            synchronized (cVar.f10682a) {
                try {
                    synchronized (cVar.f10682a) {
                        string = cVar.f10682a.getString("|S|id", null);
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
            this.f10552f.getClass();
            return h.a();
        }
        this.f10552f.getClass();
        return h.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [z8.c] */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [z8.a] */
    public final y8.b g(y8.b bVar) {
        int responseCode;
        String str = bVar.f10675a;
        String str2 = null;
        if (str != null && str.length() == 11) {
            y8.c cVar = (y8.c) this.f10551e.get();
            synchronized (cVar.f10682a) {
                try {
                    String[] strArr = y8.c.f10681c;
                    int i3 = 0;
                    while (true) {
                        if (i3 < 4) {
                            String str3 = strArr[i3];
                            String string = cVar.f10682a.getString("|T|" + cVar.f10683b + "|" + str3, null);
                            if (string == null || string.isEmpty()) {
                                i3++;
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
        z8.c cVar2 = this.f10548b;
        g8.g gVar = this.f10547a;
        gVar.a();
        String str4 = gVar.f4302c.f4313a;
        String str5 = bVar.f10675a;
        g8.g gVar2 = this.f10547a;
        gVar2.a();
        String str6 = gVar2.f4302c.f4319h;
        g8.g gVar3 = this.f10547a;
        gVar3.a();
        String str7 = gVar3.f4302c.f4314b;
        i6.b bVar2 = cVar2.f10962c;
        if (!bVar2.a()) {
            throw new e("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL a9 = z8.c.a("projects/" + str6 + "/installations");
        int i10 = 0;
        z8.a aVar = cVar2;
        while (i10 <= 1) {
            TrafficStats.setThreadStatsTag(32769);
            HttpURLConnection c10 = aVar.c(a9, str4);
            try {
                try {
                    c10.setRequestMethod("POST");
                    c10.setDoOutput(true);
                    if (str2 != null) {
                        c10.addRequestProperty("x-goog-fis-android-iid-migration-auth", str2);
                    }
                    z8.c.g(c10, str5, str7);
                    responseCode = c10.getResponseCode();
                    bVar2.b(responseCode);
                } finally {
                    c10.disconnect();
                    TrafficStats.clearThreadStatsTag();
                }
            } catch (IOException | AssertionError unused2) {
            }
            if (responseCode >= 200 && responseCode < 300) {
                z8.a e2 = z8.c.e(c10);
                c10.disconnect();
                TrafficStats.clearThreadStatsTag();
                aVar = e2;
            } else {
                try {
                    z8.c.b(c10, str7, str4, str6);
                } catch (IOException | AssertionError unused3) {
                    c10.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    i10++;
                    aVar = aVar;
                }
                if (responseCode == 429) {
                    throw new e("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                }
                if (responseCode < 500 || responseCode >= 600) {
                    Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                    z8.a aVar2 = new z8.a(null, null, null, null, 2);
                    c10.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    aVar = aVar2;
                } else {
                    c10.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    i10++;
                    aVar = aVar;
                }
            }
            int b10 = a4.i.b(aVar.f10954e);
            if (b10 != 0) {
                if (b10 != 1) {
                    throw new e("Firebase Installations Service is unavailable. Please try again later.");
                }
                y8.a a10 = bVar.a();
                a10.g = "BAD CONFIG";
                a10.f10668b = 5;
                return a10.a();
            }
            String str8 = aVar.f10951b;
            String str9 = aVar.f10952c;
            this.f10550d.f10564a.getClass();
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            z8.b bVar3 = aVar.f10953d;
            String str10 = bVar3.f10955a;
            long j = bVar3.f10956b;
            y8.a a11 = bVar.a();
            a11.f10667a = str8;
            a11.f10668b = 4;
            a11.f10669c = str10;
            a11.f10670d = str9;
            a11.f10671e = j;
            byte b11 = (byte) (a11.f10673h | 1);
            a11.f10672f = currentTimeMillis;
            a11.f10673h = (byte) (b11 | 2);
            return a11.a();
        }
        throw new e("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final void h(Exception exc) {
        synchronized (this.g) {
            try {
                Iterator it = this.f10556l.iterator();
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

    public final void i(y8.b bVar) {
        synchronized (this.g) {
            try {
                Iterator it = this.f10556l.iterator();
                while (it.hasNext()) {
                    if (((i) it.next()).a(bVar)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
