package defpackage;

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
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class hz implements iz {
    public static final Object m = new Object();
    public final ez a;
    public final fz b;
    public final yw c;
    public final cm1 d;
    public final be0 e;
    public final z01 f;
    public final Object g;
    public final ExecutorService h;
    public final n91 i;
    public String j;
    public final HashSet k;
    public final ArrayList l;

    static {
        new AtomicInteger(1);
    }

    public hz(ez ezVar, p01 p01Var, ExecutorService executorService, n91 n91Var) {
        ezVar.a();
        fz fzVar = new fz(ezVar.a, p01Var);
        yw ywVar = new yw(ezVar);
        if (tc1.e == null) {
            tc1.e = new tc1(2);
        }
        tc1 tc1Var = tc1.e;
        if (cm1.c == null) {
            cm1.c = new cm1(tc1Var);
        }
        cm1 cm1Var = cm1.c;
        be0 be0Var = new be0(new zj(2, ezVar));
        z01 z01Var = new z01();
        this.g = new Object();
        this.k = new HashSet();
        this.l = new ArrayList();
        this.a = ezVar;
        this.b = fzVar;
        this.c = ywVar;
        this.d = cm1Var;
        this.e = be0Var;
        this.f = z01Var;
        this.h = executorService;
        this.i = n91Var;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0022 A[Catch: all -> 0x0039, TRY_LEAVE, TryCatch #1 {all -> 0x0039, blocks: (B:6:0x000e, B:12:0x0022), top: B:5:0x000e, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003d A[Catch: all -> 0x0041, TRY_ENTER, TryCatch #0 {all -> 0x0041, blocks: (B:4:0x0003, B:15:0x003d, B:16:0x0043, B:23:0x0054, B:24:0x0057, B:6:0x000e, B:12:0x0022), top: B:3:0x0003, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        wb q;
        int i;
        boolean z;
        synchronized (m) {
            try {
                ez ezVar = this.a;
                ezVar.a();
                yw e = yw.e(ezVar.a);
                try {
                    q = this.c.q();
                    int i2 = q.b;
                    i = 1;
                    if (i2 != 2 && i2 != 1) {
                        z = false;
                        if (z) {
                            String f = f(q);
                            yw ywVar = this.c;
                            vb a = q.a();
                            a.a = f;
                            a.b = 3;
                            q = a.a();
                            ywVar.m(q);
                        }
                        if (e != null) {
                            e.r();
                        }
                    }
                    z = true;
                    if (z) {
                    }
                    if (e != null) {
                    }
                } catch (Throwable th) {
                    if (e != null) {
                        e.r();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        i(q);
        this.i.execute(new gz(this, i));
    }

    public final wb b(wb wbVar) {
        int i;
        int responseCode;
        bc bcVar;
        bc bcVar2;
        fz fzVar = this.b;
        ez ezVar = this.a;
        ezVar.a();
        String str = ezVar.c.a;
        String str2 = wbVar.a;
        ez ezVar2 = this.a;
        ezVar2.a();
        String str3 = ezVar2.c.g;
        String str4 = wbVar.d;
        bg bgVar = fzVar.c;
        if (!bgVar.a()) {
            throw new jz("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL a = fz.a("projects/" + str3 + "/installations/" + str2 + "/authTokens:generate");
        for (int i2 = 0; i2 <= 1; i2 = i + 1) {
            TrafficStats.setThreadStatsTag(32771);
            HttpURLConnection c = fzVar.c(a, str);
            try {
                try {
                    c.setRequestMethod("POST");
                    c.addRequestProperty("Authorization", "FIS_v2 " + str4);
                    c.setDoOutput(true);
                    fz.h(c);
                    responseCode = c.getResponseCode();
                    bgVar.b(responseCode);
                } finally {
                    c.disconnect();
                    TrafficStats.clearThreadStatsTag();
                }
            } catch (IOException | AssertionError unused) {
                i = i2;
            }
            if (responseCode >= 200 && responseCode < 300) {
                bcVar2 = fz.f(c);
            } else {
                fz.b(c, null, str, str3);
                i = i2;
                if (responseCode == 401 || responseCode == 404) {
                    if (((byte) (0 | 1)) != 1) {
                        throw new IllegalStateException("Missing required properties: tokenExpirationTimestamp");
                    }
                    bcVar = new bc(3, 0L, null);
                } else {
                    if (responseCode == 429) {
                        throw new jz("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                    }
                    if (responseCode < 500 || responseCode >= 600) {
                        Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                        if (((byte) (0 | 1)) != 1) {
                            throw new IllegalStateException("Missing required properties: tokenExpirationTimestamp");
                        }
                        bcVar = new bc(2, 0L, null);
                    }
                }
                c.disconnect();
                TrafficStats.clearThreadStatsTag();
                bcVar2 = bcVar;
            }
            int v = qy0.v(bcVar2.c);
            if (v == 0) {
                String str5 = bcVar2.a;
                long j = bcVar2.b;
                this.d.a.getClass();
                long currentTimeMillis = System.currentTimeMillis() / 1000;
                vb a2 = wbVar.a();
                a2.c = str5;
                a2.e = j;
                byte b = (byte) (a2.h | 1);
                a2.f = currentTimeMillis;
                a2.h = (byte) (b | 2);
                return a2.a();
            }
            if (v == 1) {
                vb a3 = wbVar.a();
                a3.g = "BAD CONFIG";
                a3.b = 5;
                return a3.a();
            }
            if (v != 2) {
                throw new jz("Firebase Installations Service is unavailable. Please try again later.");
            }
            synchronized (this) {
                this.j = null;
            }
            vb a4 = wbVar.a();
            a4.b = 2;
            return a4.a();
        }
        throw new jz("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final zu1 c() {
        String str;
        e();
        synchronized (this) {
            str = this.j;
        }
        if (str != null) {
            return t80.p(str);
        }
        ng1 ng1Var = new ng1();
        q40 q40Var = new q40(ng1Var);
        synchronized (this.g) {
            this.l.add(q40Var);
        }
        zu1 zu1Var = ng1Var.a;
        this.h.execute(new gz(this, 0));
        return zu1Var;
    }

    public final zu1 d() {
        e();
        ng1 ng1Var = new ng1();
        p40 p40Var = new p40(this.d, ng1Var);
        synchronized (this.g) {
            this.l.add(p40Var);
        }
        zu1 zu1Var = ng1Var.a;
        this.h.execute(new gz(this, 2));
        return zu1Var;
    }

    public final void e() {
        ez ezVar = this.a;
        ezVar.a();
        y90.f(ezVar.c.b, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        ezVar.a();
        y90.f(ezVar.c.g, "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        ezVar.a();
        y90.f(ezVar.c.a, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        ezVar.a();
        String str = ezVar.c.b;
        Pattern pattern = cm1.b;
        if (!str.contains(":")) {
            dd0.e("Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
            return;
        }
        ezVar.a();
        if (cm1.b.matcher(ezVar.c.a).matches()) {
            return;
        }
        dd0.e("Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001c, code lost:
    
        if ("[DEFAULT]".equals(r0.b) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String f(wb wbVar) {
        String string;
        ez ezVar = this.a;
        ezVar.a();
        if (!ezVar.b.equals("CHIME_ANDROID_SDK")) {
            ez ezVar2 = this.a;
            ezVar2.a();
        }
        if (wbVar.b == 1) {
            a70 a70Var = (a70) this.e.get();
            synchronized (a70Var.a) {
                try {
                    synchronized (a70Var.a) {
                        string = a70Var.a.getString("|S|id", null);
                    }
                    if (string == null) {
                        string = a70Var.a();
                    }
                } finally {
                }
            }
            if (!TextUtils.isEmpty(string)) {
                return string;
            }
            this.f.getClass();
            return z01.a();
        }
        this.f.getClass();
        return z01.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2, types: [fz] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [nb] */
    public final wb g(wb wbVar) {
        int responseCode;
        String str = wbVar.a;
        String str2 = null;
        if (str != null && str.length() == 11) {
            a70 a70Var = (a70) this.e.get();
            synchronized (a70Var.a) {
                try {
                    String[] strArr = a70.c;
                    int i = 0;
                    while (true) {
                        if (i < 4) {
                            String str3 = strArr[i];
                            String string = a70Var.a.getString("|T|" + a70Var.b + "|" + str3, null);
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
        fz fzVar = this.b;
        ez ezVar = this.a;
        ezVar.a();
        String str4 = ezVar.c.a;
        String str5 = wbVar.a;
        ez ezVar2 = this.a;
        ezVar2.a();
        String str6 = ezVar2.c.g;
        ez ezVar3 = this.a;
        ezVar3.a();
        String str7 = ezVar3.c.b;
        bg bgVar = fzVar.c;
        if (!bgVar.a()) {
            throw new jz("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL a = fz.a("projects/" + str6 + "/installations");
        int i2 = 0;
        nb nbVar = fzVar;
        while (i2 <= 1) {
            TrafficStats.setThreadStatsTag(32769);
            HttpURLConnection c = nbVar.c(a, str4);
            try {
                try {
                    c.setRequestMethod("POST");
                    c.setDoOutput(true);
                    if (str2 != null) {
                        c.addRequestProperty("x-goog-fis-android-iid-migration-auth", str2);
                    }
                    fz.g(c, str5, str7);
                    responseCode = c.getResponseCode();
                    bgVar.b(responseCode);
                } finally {
                    c.disconnect();
                    TrafficStats.clearThreadStatsTag();
                }
            } catch (IOException | AssertionError unused2) {
            }
            if (responseCode >= 200 && responseCode < 300) {
                nb e = fz.e(c);
                c.disconnect();
                TrafficStats.clearThreadStatsTag();
                nbVar = e;
            } else {
                try {
                    fz.b(c, str7, str4, str6);
                } catch (IOException | AssertionError unused3) {
                    c.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    i2++;
                    nbVar = nbVar;
                }
                if (responseCode == 429) {
                    throw new jz("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                }
                if (responseCode < 500 || responseCode >= 600) {
                    Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                    nb nbVar2 = new nb(null, null, null, null, 2);
                    c.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    nbVar = nbVar2;
                } else {
                    c.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    i2++;
                    nbVar = nbVar;
                }
            }
            int v = qy0.v(nbVar.e);
            if (v != 0) {
                if (v != 1) {
                    throw new jz("Firebase Installations Service is unavailable. Please try again later.");
                }
                vb a2 = wbVar.a();
                a2.g = "BAD CONFIG";
                a2.b = 5;
                return a2.a();
            }
            String str8 = nbVar.b;
            String str9 = nbVar.c;
            this.d.a.getClass();
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            bc bcVar = nbVar.d;
            String str10 = bcVar.a;
            long j = bcVar.b;
            vb a3 = wbVar.a();
            a3.a = str8;
            a3.b = 4;
            a3.c = str10;
            a3.d = str9;
            a3.e = j;
            byte b = (byte) (a3.h | 1);
            a3.f = currentTimeMillis;
            a3.h = (byte) (b | 2);
            return a3.a();
        }
        throw new jz("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final void h(Exception exc) {
        synchronized (this.g) {
            try {
                Iterator it = this.l.iterator();
                while (it.hasNext()) {
                    if (((fe1) it.next()).a(exc)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i(wb wbVar) {
        synchronized (this.g) {
            try {
                Iterator it = this.l.iterator();
                while (it.hasNext()) {
                    if (((fe1) it.next()).b(wbVar)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
