package a1;

import a2.c0;
import a3.e0;
import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Process;
import android.os.StrictMode;
import android.os.SystemClock;
import android.text.Editable;
import android.text.Selection;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import androidx.core.graphics.drawable.IconCompat;
import androidx.lifecycle.t0;
import c2.b1;
import c2.g0;
import c2.y1;
import c2.z1;
import c4.u;
import c4.y;
import com.appsflyer.attribution.RequestError;
import com.google.android.gms.internal.measurement.ba;
import com.google.android.gms.internal.measurement.c1;
import com.google.android.gms.internal.measurement.da;
import com.google.android.gms.internal.measurement.de;
import com.google.android.gms.internal.measurement.ea;
import com.google.android.gms.internal.measurement.fa;
import com.google.android.gms.internal.measurement.fc;
import com.google.android.gms.internal.measurement.h1;
import com.google.android.gms.internal.measurement.hg;
import com.google.android.gms.internal.measurement.ia;
import com.google.android.gms.internal.measurement.j1;
import com.google.android.gms.internal.measurement.j2;
import com.google.android.gms.internal.measurement.k1;
import com.google.android.gms.internal.measurement.kd;
import com.google.android.gms.internal.measurement.l5;
import com.google.android.gms.internal.measurement.m0;
import com.google.android.gms.internal.measurement.mc;
import com.google.android.gms.internal.measurement.md;
import com.google.android.gms.internal.measurement.od;
import com.google.android.gms.internal.measurement.pa;
import com.google.android.gms.internal.measurement.q0;
import com.google.android.gms.internal.measurement.r5;
import com.google.android.gms.internal.measurement.ra;
import com.google.android.gms.internal.measurement.rb;
import com.google.android.gms.internal.measurement.sa;
import com.google.android.gms.internal.measurement.sb;
import com.google.android.gms.internal.measurement.se;
import com.google.android.gms.internal.measurement.v0;
import com.google.android.gms.internal.measurement.v1;
import com.google.android.gms.internal.measurement.v5;
import com.google.android.gms.internal.measurement.vb;
import com.google.android.gms.internal.measurement.zd;
import com.google.firebase.messaging.FirebaseMessagingService;
import d2.v;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.BiFunction;
import java.util.logging.Level;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.collections.i0;
import kotlin.jvm.functions.Function0;
import kotlin.ranges.IntRange;
import kotlin.text.MatchResult;
import m.g2;
import n0.t1;
import org.json.JSONArray;
import org.json.JSONException;
import s.h0;
import s.x;
import te.a1;
import z4.w;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class n implements l, n0.a, b7.i, f6.a, m6.b, MatchResult {

    /* renamed from: s, reason: collision with root package name */
    public static Boolean f38s;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f39d;

    /* renamed from: e, reason: collision with root package name */
    public Object f40e;

    /* renamed from: i, reason: collision with root package name */
    public Object f41i;

    /* renamed from: r, reason: collision with root package name */
    public Object f42r;

    public n(int i3) {
        this.f39d = i3;
        switch (i3) {
            case a4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                this.f41i = new com.google.android.gms.internal.measurement.b("", 0L, null);
                this.f40e = new com.google.android.gms.internal.measurement.b("", 0L, null);
                this.f42r = new ArrayList();
                break;
            case RequestError.STOP_TRACKING /* 11 */:
                this.f41i = new AtomicBoolean(false);
                new ConcurrentHashMap();
                this.f40e = new ConcurrentHashMap();
                new ConcurrentHashMap();
                this.f42r = new ConcurrentHashMap();
                break;
            default:
                this.f41i = new d9.c(9);
                this.f40e = new d9.c(9);
                this.f42r = new d9.c(9);
                break;
        }
    }

    public static Object j(w7.n nVar) {
        try {
            return w.g(nVar, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException | TimeoutException e2) {
            throw new IOException("SERVICE_NOT_AVAILABLE", e2);
        } catch (ExecutionException e9) {
            Throwable cause = e9.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new IOException(e9);
        }
    }

    public static boolean o(Editable editable, KeyEvent keyEvent, boolean z10) {
        y[] yVarArr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (yVarArr = (y[]) editable.getSpans(selectionStart, selectionEnd, y.class)) != null && yVarArr.length > 0) {
                for (y yVar : yVarArr) {
                    int spanStart = editable.getSpanStart(yVar);
                    int spanEnd = editable.getSpanEnd(yVar);
                    if ((z10 && spanStart == selectionStart) || ((!z10 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static n z(Context context, AttributeSet attributeSet, int[] iArr, int i3) {
        return new n(context, context.obtainStyledAttributes(attributeSet, iArr, i3, 0));
    }

    public void A(String str, String str2, String str3, String str4) {
        g8.g gVar = (g8.g) this.f40e;
        if (str2 == null || str3 == null) {
            throw new IOException("FIS auth token or FIS ID is empty");
        }
        gVar.a();
        g8.i iVar = gVar.f4302c;
        String str5 = iVar.f4319h;
        gVar.a();
        String str6 = iVar.f4313a;
        if (str5 == null) {
            throw new IOException("Project ID or API Key is missing");
        }
        StringBuilder sb2 = new StringBuilder("https://fcmregistrations.googleapis.com/v1/projects/");
        sb2.append(str5);
        sb2.append("/registrations/");
        sb2.append(str3);
        sb2.append("/topicSubscriptions/");
        URL url = new URL(v4.a.p(sb2, str, ":", str4));
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Topic " + str4 + " for: " + str + " with url: " + url);
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("x-goog-api-key", str6);
        httpURLConnection.setRequestProperty("x-goog-firebase-installations-auth", str2);
        httpURLConnection.setDoOutput(false);
        try {
            try {
                int responseCode = httpURLConnection.getResponseCode();
                httpURLConnection.disconnect();
                if (responseCode >= 200 && responseCode < 300) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Topic " + str4 + " for: " + str + " succeeded.");
                        return;
                    }
                    return;
                }
                if (responseCode == 404 || responseCode == 403) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        StringBuilder q3 = v4.a.q("Topic ", str4, " failed: ");
                        q3.append(httpURLConnection.getResponseMessage());
                        Log.d("FirebaseMessaging", q3.toString());
                    }
                    StringBuilder q7 = v4.a.q("Topic ", str4, " failed: ");
                    q7.append(httpURLConnection.getResponseMessage());
                    throw new IOException(q7.toString());
                }
                if (responseCode >= 500) {
                    throw new IOException("INTERNAL_SERVER_ERROR");
                }
                throw new IOException("Topic " + str4 + " failed with status: " + responseCode);
            } catch (IOException e2) {
                throw new IOException("SERVICE_NOT_AVAILABLE", e2);
            }
        } catch (Throwable th) {
            httpURLConnection.disconnect();
            throw th;
        }
    }

    public void B(androidx.lifecycle.o oVar) {
        t0 t0Var = (t0) this.f42r;
        if (t0Var != null) {
            t0Var.run();
        }
        t0 t0Var2 = new t0((androidx.lifecycle.w) this.f41i, oVar);
        this.f42r = t0Var2;
        ((Handler) this.f40e).postAtFrontOfQueue(t0Var2);
    }

    public Object C(CharSequence charSequence, int i3, int i10, int i11, boolean z10, c4.q qVar) {
        int i12;
        char c10;
        c4.r rVar = new c4.r((u) ((c6.n) this.f40e).f1835i);
        int codePointAt = Character.codePointAt(charSequence, i3);
        int i13 = 0;
        boolean z11 = true;
        int i14 = i3;
        loop0: while (true) {
            i12 = i14;
            while (i14 < i10 && i13 < i11 && z11) {
                SparseArray sparseArray = ((u) rVar.f1778f).f1788a;
                u uVar = sparseArray == null ? null : (u) sparseArray.get(codePointAt);
                if (rVar.f1774b == 2) {
                    if (uVar != null) {
                        rVar.f1778f = uVar;
                        rVar.f1776d++;
                    } else {
                        if (codePointAt == 65038) {
                            rVar.a();
                        } else if (codePointAt != 65039) {
                            u uVar2 = (u) rVar.f1778f;
                            if (uVar2.f1789b != null) {
                                if (rVar.f1776d != 1) {
                                    rVar.g = uVar2;
                                    rVar.a();
                                } else if (rVar.b()) {
                                    rVar.g = (u) rVar.f1778f;
                                    rVar.a();
                                } else {
                                    rVar.a();
                                }
                                c10 = 3;
                            } else {
                                rVar.a();
                            }
                        }
                        c10 = 1;
                    }
                    c10 = 2;
                } else if (uVar == null) {
                    rVar.a();
                    c10 = 1;
                } else {
                    rVar.f1774b = 2;
                    rVar.f1778f = uVar;
                    rVar.f1776d = 1;
                    c10 = 2;
                }
                rVar.f1775c = codePointAt;
                if (c10 == 1) {
                    i14 = Character.charCount(Character.codePointAt(charSequence, i12)) + i12;
                    if (i14 < i10) {
                        codePointAt = Character.codePointAt(charSequence, i14);
                    }
                } else if (c10 == 2) {
                    int charCount = Character.charCount(codePointAt) + i14;
                    if (charCount < i10) {
                        codePointAt = Character.codePointAt(charSequence, charCount);
                    }
                    i14 = charCount;
                } else if (c10 == 3) {
                    if (z10 || !w(charSequence, i12, i14, ((u) rVar.g).f1789b)) {
                        z11 = qVar.c(charSequence, i12, i14, ((u) rVar.g).f1789b);
                        i13++;
                    }
                }
            }
        }
        if (rVar.f1774b == 2 && ((u) rVar.f1778f).f1789b != null && ((rVar.f1776d > 1 || rVar.b()) && i13 < i11 && z11 && (z10 || !w(charSequence, i12, i14, ((u) rVar.f1778f).f1789b)))) {
            qVar.c(charSequence, i12, i14, ((u) rVar.f1778f).f1789b);
        }
        return qVar.getResult();
    }

    public void D() {
        ((TypedArray) this.f40e).recycle();
    }

    public cf.b E(ce.b bVar, hf.a aVar, hf.a aVar2) {
        String str;
        bVar.getClass();
        aVar2.getClass();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(mf.a.a(bVar));
        sb2.append(':');
        if (aVar == null || (str = aVar.getValue()) == null) {
            str = "";
        }
        sb2.append(str);
        sb2.append(':');
        sb2.append(aVar2);
        return (cf.b) ((ConcurrentHashMap) this.f40e).get(sb2.toString());
    }

    public void F(h6.a aVar) {
        a2.r rVar = new a2.r(28);
        k6.o oVar = (k6.o) this.f42r;
        k6.i iVar = (k6.i) this.f41i;
        h6.c cVar = (h6.c) this.f40e;
        p6.b bVar = oVar.f5483c;
        n a9 = k6.i.a();
        a9.G(iVar.f5464a);
        a9.f42r = h6.d.f4479d;
        a9.f41i = iVar.f5465b;
        k6.i k10 = a9.k();
        ra raVar = new ra();
        raVar.f2742f = new HashMap();
        raVar.f2740d = Long.valueOf(oVar.f5481a.g());
        raVar.f2741e = Long.valueOf(oVar.f5482b.g());
        raVar.f2737a = "FCM_CLIENT_EVENT_LOGGING";
        c9.e eVar = aVar.f4475a;
        p.e eVar2 = com.google.firebase.messaging.r.f3167a;
        eVar2.getClass();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            eVar2.e(eVar, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        raVar.f2739c = new k6.k(cVar, byteArrayOutputStream.toByteArray());
        raVar.f2738b = null;
        bVar.f7684b.execute(new c4.m(bVar, k10, rVar, raVar.c()));
    }

    public void G(String str) {
        if (str != null) {
            this.f40e = str;
        } else {
            a2.r.j("Null backendName");
        }
    }

    public void H(k1.n nVar) {
        ((m1.b) this.f42r).f6405d.f6403c = nVar;
    }

    public void I(x2.c cVar) {
        ((m1.b) this.f42r).f6405d.f6401a = cVar;
    }

    public void J(x2.l lVar) {
        ((m1.b) this.f42r).f6405d.f6402b = lVar;
    }

    public void K(long j) {
        ((m1.b) this.f42r).f6405d.f6404d = j;
    }

    public void L() {
        h0 h0Var = (h0) this.f41i;
        String str = (String) this.f40e;
        List list = (List) h0Var.k(str);
        if (list != null) {
            list.remove((Function0) this.f42r);
        }
        if (list == null || list.isEmpty()) {
            return;
        }
        h0Var.m(str, list);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0237  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public b7.h M() {
        String substring;
        int i3;
        fc fcVar;
        fc fcVar2;
        String str;
        sb sbVar;
        boolean isIsolated;
        String str2 = (String) this.f40e;
        sa saVar = (sa) this.f41i;
        a8.m mVar = saVar.f2791f;
        if (!ia.s(saVar.f2787b)) {
            return new b7.h(od.A(), new md(3, 17));
        }
        if (f38s == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                isIsolated = Process.isIsolated();
                f38s = Boolean.valueOf(isIsolated);
            } else {
                try {
                    Object invoke = Process.class.getMethod("isIsolated", null).invoke(Process.class, null);
                    invoke.getClass();
                    f38s = (Boolean) invoke;
                } catch (ReflectiveOperationException unused) {
                    f38s = Boolean.FALSE;
                }
            }
        }
        if (f38s.booleanValue()) {
            return new b7.h(od.A(), new md(3, 18));
        }
        kd b10 = saVar.g.b();
        v0 v0Var = b10.f2455c;
        m0 m0Var = m0.FILE;
        s.e eVar = pa.f2670a;
        int indexOf = str2.indexOf("#");
        if (indexOf >= 0) {
            substring = str2.substring(0, indexOf);
        } else {
            if (str2.contains("@")) {
                a1.e("Invalid package name: ".concat(str2));
                return null;
            }
            substring = str2;
        }
        if (!b10.f2459h) {
            i3 = 14;
        } else if (!b10.f2453a || !b10.f2454b.contains(m0Var)) {
            i3 = 3;
        } else if (v0Var.c() != 0) {
            List list = b10.f2458f;
            i3 = (list.isEmpty() || list.contains(substring)) ? b10.g.contains(substring) ? 6 : 0 : 5;
        } else {
            i3 = 4;
        }
        if (i3 != 0) {
            fcVar2 = new fc(null, new md(i3));
        } else {
            try {
                str = b10.f2457e;
            } catch (Exception e2) {
                com.google.android.gms.internal.measurement.h.h(Level.WARNING, saVar.a(), e2, "Failed to read shared file for %s", str2);
                fcVar = new fc(sb.f2794c, new md(3, 10));
            }
            if (str.isEmpty()) {
                a8.g gVar = (a8.g) saVar.f2792h.get();
                if (gVar.b()) {
                    str = ((ApplicationInfo) gVar.a()).dataDir;
                } else {
                    com.google.android.gms.internal.measurement.h.h(Level.WARNING, saVar.a(), null, "Unable to get GMS application info, using defaults.", new Object[0]);
                    fcVar = new fc(sb.f2794c, new md(3, 7));
                    fcVar2 = fcVar;
                }
            }
            String str3 = File.separator;
            String str4 = b10.f2456d;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + String.valueOf(str3).length() + String.valueOf(str4).length());
            sb2.append(str);
            sb2.append(str3);
            sb2.append(str4);
            String sb3 = sb2.toString();
            n nVar = new n(v0Var, str2);
            Uri.Builder scheme = new Uri.Builder().scheme("file");
            String obj = nVar.N().toString();
            StringBuilder sb4 = new StringBuilder(String.valueOf(str3).length() + sb3.length() + String.valueOf(str3).length() + obj.length());
            sb4.append(str3);
            sb4.append(sb3);
            sb4.append(str3);
            sb4.append(obj);
            Uri build = scheme.appendEncodedPath(sb4.toString()).build();
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().build());
            try {
                try {
                    zd zdVar = (zd) mVar.get();
                    boolean t6 = b10.f2461k.t();
                    rb rbVar = new rb();
                    rbVar.f2743d = t6;
                    fcVar2 = new fc((sb) zdVar.a(build, rbVar), new md(5, 2));
                } finally {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
            } catch (v1 e9) {
                com.google.android.gms.internal.measurement.h.h(Level.SEVERE, saVar.a(), e9, "Failed to parse snapshot from shared storage for %s", str2);
                fcVar2 = new fc(null, new md(9));
                md mdVar = fcVar2.f2287b;
                sbVar = fcVar2.f2286a;
                if (sbVar != null) {
                }
            } catch (FileNotFoundException unused2) {
                com.google.android.gms.internal.measurement.h.h(Level.INFO, saVar.a(), null, "Shared storage file not found for %s", str2);
                fcVar2 = new fc(null, new md(8));
                md mdVar2 = fcVar2.f2287b;
                sbVar = fcVar2.f2286a;
                if (sbVar != null) {
                }
            }
        }
        md mdVar22 = fcVar2.f2287b;
        sbVar = fcVar2.f2286a;
        if (sbVar != null) {
            return new b7.h(sbVar, mdVar22);
        }
        int i10 = mdVar22.f2540b;
        try {
            zd zdVar2 = (zd) mVar.get();
            Uri uri = (Uri) this.f42r;
            j2 j2Var = (j2) od.A().s(7);
            c1 c1Var = c1.f2180a;
            int i11 = q0.f2690a;
            c1 c1Var2 = c1.f2181b;
            InputStream d10 = hg.d(zdVar2.b(uri));
            try {
                k1 a9 = ((j1) j2Var).a(d10, c1Var2);
                if (d10 != null) {
                    d10.close();
                }
                return new b7.h((od) a9, new md(4, i10));
            } catch (Throwable th) {
                if (d10 != null) {
                    try {
                        d10.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (IOException | RuntimeException unused3) {
            com.google.android.gms.internal.measurement.h.h(Level.INFO, saVar.a(), null, "Unable to retrieve flag snapshot for %s, using defaults.", str2);
            return P() ? new b7.h(sb.f2794c, new md(3, 16)) : new b7.h(od.A(), new md(3, 11));
        }
    }

    public File N() {
        String str = (String) ((a8.m) this.f40e).get();
        String str2 = (String) ((a8.m) this.f42r).get();
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length() + 3);
        sb2.append(str);
        sb2.append("/");
        sb2.append(str2);
        sb2.append(".pb");
        return new File(sb2.toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void O(v0 v0Var, Set set, String str) {
        mc[] mcVarArr;
        if (!set.isEmpty() && !((AtomicBoolean) this.f41i).getAndSet(true)) {
            if (v5.f2866i == null) {
                synchronized (v5.class) {
                    try {
                        if (v5.f2866i == null) {
                            v5.f2866i = new v5(0);
                        }
                    } finally {
                    }
                }
            }
            ((CopyOnWriteArrayList) v5.f2866i.f2870e).add(0, new h1(15));
        }
        final byte[] n10 = v0Var.n();
        ((ConcurrentHashMap) this.f40e).compute(str, new BiFunction() { // from class: com.google.android.gms.internal.measurement.lc
            @Override // java.util.function.BiFunction
            public final /* synthetic */ Object apply(Object obj, Object obj2) {
                byte[] bArr = (byte[]) obj2;
                byte[] bArr2 = n10;
                return Arrays.equals(bArr, bArr2) ? bArr : bArr2;
            }
        });
        Iterator it = set.iterator();
        while (it.hasNext()) {
            AtomicReference atomicReference = (AtomicReference) ((ConcurrentHashMap) this.f42r).putIfAbsent((String) it.next(), new AtomicReference(new mc(str, n10)));
            if (atomicReference != null) {
                while (true) {
                    Object obj = atomicReference.get();
                    if (obj instanceof mc) {
                        mc mcVar = (mc) obj;
                        if (str.equals(mcVar.f2537d)) {
                            mcVar.a(n10);
                            break;
                        }
                        mc mcVar2 = new mc(str, n10);
                        mcVarArr = str.compareTo(mcVar.f2537d) < 0 ? new mc[]{mcVar2, mcVar} : new mc[]{mcVar, mcVar2};
                        while (!atomicReference.compareAndSet(obj, mcVarArr)) {
                            if (atomicReference.get() != obj) {
                                break;
                            }
                        }
                    } else {
                        mc[] mcVarArr2 = (mc[]) obj;
                        int binarySearch = Arrays.binarySearch(mcVarArr2, str);
                        if (binarySearch >= 0) {
                            mcVarArr2[binarySearch].a(n10);
                            break;
                        }
                        int i3 = ~binarySearch;
                        int length = mcVarArr2.length;
                        int i10 = length + 1;
                        int i11 = length - i3;
                        if (i11 == 0) {
                            mcVarArr = (mc[]) Arrays.copyOf(mcVarArr2, i10);
                        } else {
                            mc[] mcVarArr3 = new mc[i10];
                            System.arraycopy(mcVarArr2, 0, mcVarArr3, 0, i3);
                            System.arraycopy(mcVarArr2, i3, mcVarArr3, i3 + 1, i11);
                            mcVarArr = mcVarArr3;
                        }
                        mcVarArr[i3] = new mc(str, n10);
                        while (!atomicReference.compareAndSet(obj, mcVarArr)) {
                        }
                    }
                }
            }
        }
    }

    public boolean P() {
        vb c10 = ((sa) this.f41i).g.c();
        return c10.v() && ((AbstractCollection) c10.A()).contains(m0.FILE);
    }

    @Override // b7.i
    public void accept(Object obj, Object obj2) {
        ea eaVar = (ea) ((fa) obj).m();
        ba baVar = new ba((da) this.f41i, (b7.f) this.f42r);
        String str = (String) this.f40e;
        Parcel F = eaVar.F();
        F.writeString(str);
        r5.c(F, baVar);
        eaVar.G(F, 28);
    }

    @Override // n0.a
    public void b(int i3, Object obj) {
        ((g0) this.f42r).y(i3, (g0) obj);
    }

    @Override // n0.a
    public void c(Object obj) {
        ((ArrayList) this.f40e).add(this.f42r);
        this.f42r = obj;
    }

    public /* bridge */ /* synthetic */ Object clone() {
        switch (this.f39d) {
            case a4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                n nVar = new n(((com.google.android.gms.internal.measurement.b) this.f41i).clone());
                ArrayList arrayList = (ArrayList) this.f42r;
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    ((ArrayList) nVar.f42r).add(((com.google.android.gms.internal.measurement.b) obj).clone());
                }
                return nVar;
            default:
                return super.clone();
        }
    }

    @Override // n0.a
    public void d() {
        k2.b rectManager;
        e1.b bVar;
        k2.b rectManager2;
        g0 g0Var = (g0) this.f42r;
        b1 b1Var = g0Var.S;
        if (!g0Var.E()) {
            z1.a.a("onReuse is only expected on attached node");
        }
        e0 e0Var = g0Var.C;
        if (e0Var != null) {
            View view = e0Var.f234e;
            if (view.getParent() != e0Var) {
                e0Var.addView(view);
            } else {
                e0Var.f238t.invoke();
            }
        }
        c0 c0Var = g0Var.U;
        if (c0Var != null) {
            c0Var.d(false);
        }
        g0Var.H = false;
        if (g0Var.f1549d0) {
            g0Var.f1549d0 = false;
        } else {
            d1.k kVar = (z1) g0Var.S.f1495f;
            for (d1.k kVar2 = kVar; kVar2 != null; kVar2 = kVar2.f3309s) {
                if (kVar2.B) {
                    kVar2.D();
                }
            }
            for (d1.k kVar3 = kVar; kVar3 != null; kVar3 = kVar3.f3309s) {
                if (kVar3.B) {
                    kVar3.F();
                }
            }
            while (kVar != null) {
                if (kVar.B) {
                    kVar.z();
                }
                kVar = kVar.f3309s;
            }
        }
        int i3 = g0Var.f1550e;
        v vVar = g0Var.B;
        if (vVar != null && (rectManager2 = vVar.getRectManager()) != null) {
            rectManager2.g(g0Var);
        }
        g0Var.f1550e = j2.k.f4979a.addAndGet(1);
        v vVar2 = g0Var.B;
        if (vVar2 != null) {
            vVar2.getLayoutNodes().g(i3);
            vVar2.getLayoutNodes().h(g0Var.f1550e, g0Var);
        }
        for (d1.k kVar4 = (d1.k) b1Var.g; kVar4 != null; kVar4 = kVar4.f3310t) {
            kVar4.y();
        }
        b1Var.e();
        if (b1Var.d(8)) {
            g0Var.C();
        }
        g0.S(g0Var);
        v vVar3 = g0Var.B;
        if (vVar3 != null && v.j() && (bVar = vVar3.f3553d0) != null) {
            v vVar4 = bVar.f3773i;
            d9.c cVar = bVar.f3771d;
            x xVar = bVar.f3777u;
            if (xVar.e(i3)) {
                cVar.q(vVar4, i3, false);
            }
            j2.j u2 = g0Var.u();
            if (u2 != null && u2.f4975d.b(j2.q.f5007q)) {
                xVar.a(g0Var.f1550e);
                cVar.q(vVar4, g0Var.f1550e, true);
            }
        }
        v vVar5 = g0Var.B;
        if (vVar5 == null || (rectManager = vVar5.getRectManager()) == null) {
            return;
        }
        rectManager.f(g0Var);
    }

    @Override // n0.a
    public /* bridge */ /* synthetic */ void e(int i3, Object obj) {
    }

    @Override // n0.a
    public void f() {
        v vVar = ((g0) this.f41i).B;
        if (vVar != null) {
            vVar.y();
        }
    }

    @Override // n0.a
    public void g(int i3, int i10, int i11) {
        ((g0) this.f42r).H(i3, i10, i11);
    }

    @Override // gd.a
    public Object get() {
        return new k6.o(new s7.c0(20), new s7.c0(19), (p6.b) ((se) this.f41i).get(), (q6.i) ((g2) this.f40e).get(), (c6.i) ((c6.n) this.f42r).get());
    }

    @Override // n0.a
    public Object getCurrent() {
        return this.f42r;
    }

    @Override // n0.a
    public void h(int i3, int i10) {
        ((g0) this.f42r).N(i3, i10);
    }

    public void i(g0 g0Var, c2.s sVar) {
        d9.c cVar = (d9.c) this.f41i;
        d9.c cVar2 = (d9.c) this.f40e;
        d9.c cVar3 = (d9.c) this.f42r;
        int ordinal = sVar.ordinal();
        if (ordinal == 0) {
            cVar.i(g0Var);
            cVar3.i(g0Var);
            return;
        }
        if (ordinal == 1) {
            cVar2.i(g0Var);
            cVar3.i(g0Var);
            return;
        }
        if (ordinal == 2) {
            if (g0Var.f1556v != null) {
                cVar3.i(g0Var);
                return;
            } else {
                cVar.i(g0Var);
                return;
            }
        }
        if (ordinal != 3) {
            a2.r.p();
        } else if (g0Var.f1556v != null) {
            cVar3.i(g0Var);
        } else {
            cVar2.i(g0Var);
        }
    }

    public k6.i k() {
        String str = ((String) this.f40e) == null ? " backendName" : "";
        if (((h6.d) this.f42r) == null) {
            str = str.concat(" priority");
        }
        if (str.isEmpty()) {
            return new k6.i((String) this.f40e, (byte[]) this.f41i, (h6.d) this.f42r);
        }
        i0.l("Missing required properties:".concat(str));
        return null;
    }

    @Override // n0.a
    public void l() {
        this.f42r = ((ArrayList) this.f40e).remove(r0.size() - 1);
    }

    public void n() {
        ((ArrayList) this.f40e).clear();
        this.f42r = this.f41i;
        ((g0) this.f41i).M();
    }

    public k1.n p() {
        return ((m1.b) this.f42r).f6405d.f6403c;
    }

    public ColorStateList q(int i3) {
        int resourceId;
        ColorStateList t6;
        TypedArray typedArray = (TypedArray) this.f40e;
        return (!typedArray.hasValue(i3) || (resourceId = typedArray.getResourceId(i3, 0)) == 0 || (t6 = w.t((Context) this.f41i, resourceId)) == null) ? typedArray.getColorStateList(i3) : t6;
    }

    public Drawable r(int i3) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f40e;
        return (!typedArray.hasValue(i3) || (resourceId = typedArray.getResourceId(i3, 0)) == 0) ? typedArray.getDrawable(i3) : w.v((Context) this.f41i, resourceId);
    }

    public Typeface s(int i3, int i10, m.u uVar) {
        int resourceId = ((TypedArray) this.f40e).getResourceId(i3, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.f42r) == null) {
            this.f42r = new TypedValue();
        }
        Context context = (Context) this.f41i;
        TypedValue typedValue = (TypedValue) this.f42r;
        ThreadLocal threadLocal = g3.k.f4259a;
        if (context.isRestricted()) {
            return null;
        }
        return g3.k.a(context, resourceId, typedValue, i10, uVar, true);
    }

    public IntRange t() {
        Matcher matcher = (Matcher) this.f41i;
        return be.f.f(matcher.start(), matcher.end());
    }

    public String toString() {
        switch (this.f39d) {
            case 1:
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append((String) this.f40e);
                sb2.append('{');
                c6.s sVar = (c6.s) ((c6.s) this.f41i).f1869e;
                String str = "";
                while (sVar != null) {
                    Object obj = sVar.f1868d;
                    sb2.append(str);
                    if (obj == null || !obj.getClass().isArray()) {
                        sb2.append(obj);
                    } else {
                        String deepToString = Arrays.deepToString(new Object[]{obj});
                        sb2.append((CharSequence) deepToString, 1, deepToString.length() - 1);
                    }
                    sVar = (c6.s) sVar.f1869e;
                    str = ", ";
                }
                sb2.append('}');
                return sb2.toString();
            case 28:
                String str2 = (String) this.f42r;
                String str3 = (String) this.f40e;
                StringBuilder sb3 = new StringBuilder("NavDeepLinkRequest{");
                Uri uri = (Uri) this.f41i;
                if (uri != null) {
                    sb3.append(" uri=");
                    sb3.append(String.valueOf(uri));
                }
                if (str3 != null) {
                    sb3.append(" action=");
                    sb3.append(str3);
                }
                if (str2 != null) {
                    sb3.append(" mimetype=");
                    sb3.append(str2);
                }
                sb3.append(" }");
                return sb3.toString();
            default:
                return super.toString();
        }
    }

    public long u() {
        return ((m1.b) this.f42r).f6405d.f6404d;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(85:5|(2:7|(2:9|(2:10|(2:12|(3:14|15|(1:17)(0))(1:18))(1:19)))(0))(0)|20|(82:276|277|23|(1:25)|26|27|28|(1:30)|273|32|33|(3:248|249|(76:251|(68:253|(1:255)|36|(1:38)|39|(1:41)|42|(2:44|(1:232)(58:48|49|(1:51)|52|(1:54)(2:222|(1:227)(1:226))|(1:56)|57|(1:59)(5:210|(1:212)|213|(1:215)(1:221)|(1:217)(2:218|(1:220)))|60|(1:62)(6:192|(4:195|(2:203|204)(1:201)|202|193)|205|206|(1:208)|209)|63|(1:65)(1:191)|(1:67)|68|(42:187|188|(1:74)|75|(1:77)|78|(36:178|(1:182)|(1:82)|83|(32:173|(1:177)|(1:87)|88|(28:170|(1:172)|(1:92)|93|(24:166|167|(1:97)|98|(3:156|157|(21:159|(1:161)|162|(1:102)|103|(4:141|142|143|(2:145|(15:147|(3:107|(1:112)(1:110)|111)|113|(1:115)|116|(1:118)|119|(1:140)|121|(4:129|130|(1:132)(1:135)|133)|123|124|(1:126)|127|128)(2:148|149))(2:150|151))|105|(0)|113|(0)|116|(0)|119|(0)|121|(0)|123|124|(0)|127|128)(2:163|164))|100|(0)|103|(0)|105|(0)|113|(0)|116|(0)|119|(0)|121|(0)|123|124|(0)|127|128)|95|(0)|98|(0)|100|(0)|103|(0)|105|(0)|113|(0)|116|(0)|119|(0)|121|(0)|123|124|(0)|127|128)|90|(0)|93|(0)|95|(0)|98|(0)|100|(0)|103|(0)|105|(0)|113|(0)|116|(0)|119|(0)|121|(0)|123|124|(0)|127|128)|85|(0)|88|(0)|90|(0)|93|(0)|95|(0)|98|(0)|100|(0)|103|(0)|105|(0)|113|(0)|116|(0)|119|(0)|121|(0)|123|124|(0)|127|128)|80|(0)|83|(0)|85|(0)|88|(0)|90|(0)|93|(0)|95|(0)|98|(0)|100|(0)|103|(0)|105|(0)|113|(0)|116|(0)|119|(0)|121|(0)|123|124|(0)|127|128)|70|(42:183|184|(0)|75|(0)|78|(0)|80|(0)|83|(0)|85|(0)|88|(0)|90|(0)|93|(0)|95|(0)|98|(0)|100|(0)|103|(0)|105|(0)|113|(0)|116|(0)|119|(0)|121|(0)|123|124|(0)|127|128)|72|(0)|75|(0)|78|(0)|80|(0)|83|(0)|85|(0)|88|(0)|90|(0)|93|(0)|95|(0)|98|(0)|100|(0)|103|(0)|105|(0)|113|(0)|116|(0)|119|(0)|121|(0)|123|124|(0)|127|128))(1:247)|233|(2:242|243)|(1:241)(1:240)|49|(0)|52|(0)(0)|(0)|57|(0)(0)|60|(0)(0)|63|(0)(0)|(0)|68|(0)|70|(0)|72|(0)|75|(0)|78|(0)|80|(0)|83|(0)|85|(0)|88|(0)|90|(0)|93|(0)|95|(0)|98|(0)|100|(0)|103|(0)|105|(0)|113|(0)|116|(0)|119|(0)|121|(0)|123|124|(0)|127|128)|256|(71:258|(1:260)|36|(0)|39|(0)|42|(0)(0)|233|(1:235)|242|243|(1:238)|241|49|(0)|52|(0)(0)|(0)|57|(0)(0)|60|(0)(0)|63|(0)(0)|(0)|68|(0)|70|(0)|72|(0)|75|(0)|78|(0)|80|(0)|83|(0)|85|(0)|88|(0)|90|(0)|93|(0)|95|(0)|98|(0)|100|(0)|103|(0)|105|(0)|113|(0)|116|(0)|119|(0)|121|(0)|123|124|(0)|127|128)(1:269)|261|(3:263|(1:265)(1:267)|266)|268|36|(0)|39|(0)|42|(0)(0)|233|(0)|242|243|(0)|241|49|(0)|52|(0)(0)|(0)|57|(0)(0)|60|(0)(0)|63|(0)(0)|(0)|68|(0)|70|(0)|72|(0)|75|(0)|78|(0)|80|(0)|83|(0)|85|(0)|88|(0)|90|(0)|93|(0)|95|(0)|98|(0)|100|(0)|103|(0)|105|(0)|113|(0)|116|(0)|119|(0)|121|(0)|123|124|(0)|127|128))|35|36|(0)|39|(0)|42|(0)(0)|233|(0)|242|243|(0)|241|49|(0)|52|(0)(0)|(0)|57|(0)(0)|60|(0)(0)|63|(0)(0)|(0)|68|(0)|70|(0)|72|(0)|75|(0)|78|(0)|80|(0)|83|(0)|85|(0)|88|(0)|90|(0)|93|(0)|95|(0)|98|(0)|100|(0)|103|(0)|105|(0)|113|(0)|116|(0)|119|(0)|121|(0)|123|124|(0)|127|128)|22|23|(0)|26|27|28|(0)|273|32|33|(0)|35|36|(0)|39|(0)|42|(0)(0)|233|(0)|242|243|(0)|241|49|(0)|52|(0)(0)|(0)|57|(0)(0)|60|(0)(0)|63|(0)(0)|(0)|68|(0)|70|(0)|72|(0)|75|(0)|78|(0)|80|(0)|83|(0)|85|(0)|88|(0)|90|(0)|93|(0)|95|(0)|98|(0)|100|(0)|103|(0)|105|(0)|113|(0)|116|(0)|119|(0)|121|(0)|123|124|(0)|127|128) */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x020b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x020c, code lost:
    
        android.util.Log.w("FirebaseMessaging", "Couldn't get own application info: " + r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x00c1, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x00c2, code lost:
    
        android.util.Log.w("FirebaseMessaging", "Couldn't get own application info: " + r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00bd, code lost:
    
        if (r0 != null) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0505  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0583  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x05b0  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x05ba  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x064a  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x05e3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x05cd  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0517  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x04cb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0488 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0457  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x03a0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0379 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x00e3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00bb A[Catch: NameNotFoundException -> 0x00c1, TRY_LEAVE, TryCatch #6 {NameNotFoundException -> 0x00c1, blocks: (B:28:0x00b5, B:30:0x00bb), top: B:27:0x00b5 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0447  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0476  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x04b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean v() {
        com.google.firebase.messaging.q qVar;
        FirebaseMessagingService firebaseMessagingService;
        d9.c cVar;
        Bundle bundle;
        NotificationChannel notificationChannel;
        String string;
        NotificationChannel notificationChannel2;
        NotificationChannel notificationChannel3;
        AtomicInteger atomicInteger;
        String packageName;
        PackageManager packageManager;
        String m10;
        String m11;
        String n10;
        int i3;
        int i10;
        int i11;
        String n11;
        Uri defaultUri;
        String n12;
        Intent launchIntentForPackage;
        PendingIntent activity;
        PendingIntent broadcast;
        String n13;
        Integer valueOf;
        String n14;
        Integer k10;
        Integer k11;
        Integer k12;
        String n15;
        Long valueOf2;
        JSONArray l10;
        long[] jArr;
        JSONArray l11;
        int[] iArr;
        String n16;
        IconCompat iconCompat;
        boolean z10;
        int i12;
        ApplicationInfo applicationInfo;
        if (((d9.c) this.f42r).j("gcm.n.noui")) {
            return true;
        }
        FirebaseMessagingService firebaseMessagingService2 = (FirebaseMessagingService) this.f40e;
        if (!((KeyguardManager) firebaseMessagingService2.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            int myPid = Process.myPid();
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) firebaseMessagingService2.getSystemService("activity")).getRunningAppProcesses();
            if (runningAppProcesses != null) {
                Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    ActivityManager.RunningAppProcessInfo next = it.next();
                    if (next.pid == myPid) {
                        if (next.importance == 100) {
                            return false;
                        }
                    }
                }
            }
        }
        String n17 = ((d9.c) this.f42r).n("gcm.n.image");
        if (!TextUtils.isEmpty(n17)) {
            try {
                qVar = new com.google.firebase.messaging.q(new URL(n17));
            } catch (MalformedURLException unused) {
                Log.w("FirebaseMessaging", "Not downloading image, bad URL: " + n17);
            }
            int i13 = 3;
            if (qVar != null) {
                ExecutorService executorService = (ExecutorService) this.f41i;
                w7.g gVar = new w7.g();
                qVar.f3165e = executorService.submit(new a6.f(i13, qVar, gVar));
                qVar.f3166i = gVar.f10117a;
            }
            firebaseMessagingService = (FirebaseMessagingService) this.f40e;
            cVar = (d9.c) this.f42r;
            AtomicInteger atomicInteger2 = com.google.firebase.messaging.e.f3128a;
            applicationInfo = firebaseMessagingService.getPackageManager().getApplicationInfo(firebaseMessagingService.getPackageName(), 128);
            if (applicationInfo != null) {
                bundle = applicationInfo.metaData;
            }
            bundle = Bundle.EMPTY;
            Bundle bundle2 = bundle;
            String n18 = cVar.n("gcm.n.android_channel_id");
            if (Build.VERSION.SDK_INT >= 26) {
                if (firebaseMessagingService.getPackageManager().getApplicationInfo(firebaseMessagingService.getPackageName(), 0).targetSdkVersion >= 26) {
                    NotificationManager notificationManager = (NotificationManager) firebaseMessagingService.getSystemService(NotificationManager.class);
                    if (!TextUtils.isEmpty(n18)) {
                        notificationChannel3 = notificationManager.getNotificationChannel(n18);
                        if (notificationChannel3 == null) {
                            Log.w("FirebaseMessaging", "Notification Channel requested (" + n18 + ") has not been created by the app. Manifest configuration, or default, value will be used.");
                        }
                        atomicInteger = com.google.firebase.messaging.e.f3128a;
                        packageName = firebaseMessagingService.getPackageName();
                        Resources resources = firebaseMessagingService.getResources();
                        packageManager = firebaseMessagingService.getPackageManager();
                        e3.g gVar2 = new e3.g(firebaseMessagingService, n18);
                        m10 = cVar.m(resources, packageName, "gcm.n.title");
                        if (!TextUtils.isEmpty(m10)) {
                            gVar2.f3806e = e3.g.b(m10);
                        }
                        m11 = cVar.m(resources, packageName, "gcm.n.body");
                        if (!TextUtils.isEmpty(m11)) {
                            gVar2.f3807f = e3.g.b(m11);
                            e3.f fVar = new e3.f(0);
                            fVar.f3801f = e3.g.b(m11);
                            gVar2.g(fVar);
                        }
                        n10 = cVar.n("gcm.n.icon");
                        if (TextUtils.isEmpty(n10)) {
                            i3 = 1;
                        } else {
                            i11 = resources.getIdentifier(n10, "drawable", packageName);
                            if ((i11 != 0 && com.google.firebase.messaging.e.a(resources, i11)) || ((i11 = resources.getIdentifier(n10, "mipmap", packageName)) != 0 && com.google.firebase.messaging.e.a(resources, i11))) {
                                i3 = 1;
                                gVar2.f3821v.icon = i11;
                                n11 = cVar.n("gcm.n.sound2");
                                if (TextUtils.isEmpty(n11)) {
                                    n11 = cVar.n("gcm.n.sound");
                                }
                                if (!TextUtils.isEmpty(n11)) {
                                    defaultUri = null;
                                } else if ("default".equals(n11) || resources.getIdentifier(n11, "raw", packageName) == 0) {
                                    defaultUri = RingtoneManager.getDefaultUri(2);
                                } else {
                                    defaultUri = Uri.parse("android.resource://" + packageName + "/raw/" + n11);
                                }
                                if (defaultUri != null) {
                                    gVar2.f(defaultUri);
                                }
                                n12 = cVar.n("gcm.n.click_action");
                                if (TextUtils.isEmpty(n12)) {
                                    launchIntentForPackage = new Intent(n12);
                                    launchIntentForPackage.setPackage(packageName);
                                    launchIntentForPackage.setFlags(268435456);
                                } else {
                                    String n19 = cVar.n("gcm.n.link_android");
                                    if (TextUtils.isEmpty(n19)) {
                                        n19 = cVar.n("gcm.n.link");
                                    }
                                    Uri parse = !TextUtils.isEmpty(n19) ? Uri.parse(n19) : null;
                                    if (parse != null) {
                                        launchIntentForPackage = new Intent("android.intent.action.VIEW");
                                        launchIntentForPackage.setPackage(packageName);
                                        launchIntentForPackage.setData(parse);
                                    } else {
                                        launchIntentForPackage = packageManager.getLaunchIntentForPackage(packageName);
                                        if (launchIntentForPackage == null) {
                                            Log.w("FirebaseMessaging", "No activity found to launch app");
                                        }
                                    }
                                }
                                if (launchIntentForPackage != null) {
                                    activity = null;
                                } else {
                                    launchIntentForPackage.addFlags(67108864);
                                    Bundle bundle3 = (Bundle) cVar.f3701e;
                                    Bundle bundle4 = new Bundle(bundle3);
                                    for (String str : bundle3.keySet()) {
                                        if (str.startsWith("google.c.") || str.startsWith("gcm.n.") || str.startsWith("gcm.notification.")) {
                                            bundle4.remove(str);
                                        }
                                    }
                                    launchIntentForPackage.putExtras(bundle4);
                                    if (cVar.j("google.c.a.e")) {
                                        launchIntentForPackage.putExtra("gcm.n.analytics_data", cVar.r());
                                    }
                                    activity = PendingIntent.getActivity(firebaseMessagingService, atomicInteger.incrementAndGet(), launchIntentForPackage, 1140850688);
                                }
                                gVar2.g = activity;
                                broadcast = cVar.j("google.c.a.e") ? null : PendingIntent.getBroadcast(firebaseMessagingService, atomicInteger.incrementAndGet(), new Intent("com.google.android.c2dm.intent.RECEIVE").setPackage(firebaseMessagingService.getPackageName()).putExtra("wrapped_intent", new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(cVar.r())), 1140850688);
                                if (broadcast != null) {
                                    gVar2.f3821v.deleteIntent = broadcast;
                                }
                                n13 = cVar.n("gcm.n.color");
                                if (!TextUtils.isEmpty(n13)) {
                                    try {
                                        valueOf = Integer.valueOf(Color.parseColor(n13));
                                    } catch (IllegalArgumentException unused2) {
                                        Log.w("FirebaseMessaging", "Color is invalid: " + n13 + ". Notification will use default color.");
                                    }
                                    if (valueOf != null) {
                                        gVar2.f3816q = valueOf.intValue();
                                    }
                                    gVar2.d(16, !cVar.j("gcm.n.sticky"));
                                    gVar2.f3814o = cVar.j("gcm.n.local_only");
                                    n14 = cVar.n("gcm.n.ticker");
                                    if (n14 != null) {
                                        gVar2.f3821v.tickerText = e3.g.b(n14);
                                    }
                                    k10 = cVar.k("gcm.n.notification_priority");
                                    if (k10 != null) {
                                        if (k10.intValue() < -2 || k10.intValue() > 2) {
                                            Log.w("FirebaseMessaging", "notificationPriority is invalid " + k10 + ". Skipping setting notificationPriority.");
                                        }
                                        if (k10 != null) {
                                            gVar2.j = k10.intValue();
                                        }
                                        k11 = cVar.k("gcm.n.visibility");
                                        if (k11 != null) {
                                            if (k11.intValue() < -1 || k11.intValue() > i3) {
                                                Log.w("NotificationParams", "visibility is invalid: " + k11 + ". Skipping setting visibility.");
                                            }
                                            if (k11 != null) {
                                                gVar2.f3817r = k11.intValue();
                                            }
                                            k12 = cVar.k("gcm.n.notification_count");
                                            if (k12 != null) {
                                                if (k12.intValue() < 0) {
                                                    Log.w("FirebaseMessaging", "notificationCount is invalid: " + k12 + ". Skipping setting notificationCount.");
                                                }
                                                if (k12 != null) {
                                                    gVar2.f3809i = k12.intValue();
                                                }
                                                n15 = cVar.n("gcm.n.event_time");
                                                if (!TextUtils.isEmpty(n15)) {
                                                    try {
                                                        valueOf2 = Long.valueOf(Long.parseLong(n15));
                                                    } catch (NumberFormatException unused3) {
                                                        Log.w("NotificationParams", "Couldn't parse value of " + d9.c.u("gcm.n.event_time") + "(" + n15 + ") into a long");
                                                    }
                                                    if (valueOf2 != null) {
                                                        gVar2.f3810k = true;
                                                        gVar2.f3821v.when = valueOf2.longValue();
                                                    }
                                                    l10 = cVar.l("gcm.n.vibrate_timings");
                                                    if (l10 != null) {
                                                        try {
                                                        } catch (NumberFormatException | JSONException unused4) {
                                                            Log.w("NotificationParams", "User defined vibrateTimings is invalid: " + l10 + ". Skipping setting vibrateTimings.");
                                                        }
                                                        if (l10.length() <= 1) {
                                                            throw new JSONException("vibrateTimings have invalid length");
                                                        }
                                                        int length = l10.length();
                                                        jArr = new long[length];
                                                        for (int i14 = 0; i14 < length; i14++) {
                                                            jArr[i14] = l10.optLong(i14);
                                                        }
                                                        if (jArr != null) {
                                                            gVar2.f3821v.vibrate = jArr;
                                                        }
                                                        l11 = cVar.l("gcm.n.light_settings");
                                                        if (l11 != null) {
                                                            iArr = new int[3];
                                                            try {
                                                            } catch (IllegalArgumentException e2) {
                                                                Log.w("NotificationParams", "LightSettings is invalid: " + l11 + ". " + e2.getMessage() + ". Skipping setting LightSettings");
                                                            } catch (JSONException unused5) {
                                                                Log.w("NotificationParams", "LightSettings is invalid: " + l11 + ". Skipping setting LightSettings");
                                                            }
                                                            if (l11.length() != 3) {
                                                                throw new JSONException("lightSettings don't have all three fields");
                                                            }
                                                            int parseColor = Color.parseColor(l11.optString(0));
                                                            if (parseColor == -16777216) {
                                                                throw new IllegalArgumentException("Transparent color is invalid");
                                                            }
                                                            iArr[0] = parseColor;
                                                            iArr[1] = l11.optInt(1);
                                                            iArr[2] = l11.optInt(2);
                                                            if (iArr != null) {
                                                                int i15 = iArr[0];
                                                                int i16 = iArr[1];
                                                                int i17 = iArr[2];
                                                                Notification notification = gVar2.f3821v;
                                                                notification.ledARGB = i15;
                                                                notification.ledOnMS = i16;
                                                                notification.ledOffMS = i17;
                                                                notification.flags = ((i16 == 0 || i17 == 0) ? 0 : 1) | ((-2) & notification.flags);
                                                            }
                                                            boolean j = cVar.j("gcm.n.default_sound");
                                                            boolean z11 = j;
                                                            if (cVar.j("gcm.n.default_vibrate_timings")) {
                                                                z11 = (j ? 1 : 0) | 2;
                                                            }
                                                            int i18 = z11;
                                                            if (cVar.j("gcm.n.default_light_settings")) {
                                                                i18 = (z11 ? 1 : 0) | 4;
                                                            }
                                                            gVar2.c(i18);
                                                            n16 = cVar.n("gcm.n.tag");
                                                            if (TextUtils.isEmpty(n16)) {
                                                                n16 = "FCM-Notification:" + SystemClock.uptimeMillis();
                                                            }
                                                            String str2 = n16;
                                                            if (qVar != null) {
                                                                try {
                                                                    w7.n nVar = qVar.f3166i;
                                                                    c7.c0.g(nVar);
                                                                    Bitmap bitmap = (Bitmap) w.g(nVar, 5L, TimeUnit.SECONDS);
                                                                    gVar2.e(bitmap);
                                                                    e3.e eVar = new e3.e();
                                                                    if (bitmap == null) {
                                                                        iconCompat = null;
                                                                        z10 = true;
                                                                    } else {
                                                                        z10 = true;
                                                                        iconCompat = new IconCompat(1);
                                                                        iconCompat.f478b = bitmap;
                                                                    }
                                                                    eVar.f3798e = iconCompat;
                                                                    eVar.f3799f = null;
                                                                    eVar.g = z10;
                                                                    gVar2.g(eVar);
                                                                } catch (InterruptedException unused6) {
                                                                    Log.w("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
                                                                    qVar.close();
                                                                    Thread.currentThread().interrupt();
                                                                } catch (ExecutionException e9) {
                                                                    Log.w("FirebaseMessaging", "Failed to download image: " + e9.getCause());
                                                                } catch (TimeoutException unused7) {
                                                                    Log.w("FirebaseMessaging", "Failed to download image in time, showing notification without it");
                                                                    qVar.close();
                                                                }
                                                            }
                                                            if (Log.isLoggable("FirebaseMessaging", 3)) {
                                                                Log.d("FirebaseMessaging", "Showing notification");
                                                            }
                                                            ((NotificationManager) ((FirebaseMessagingService) this.f40e).getSystemService("notification")).notify(str2, 0, gVar2.a());
                                                            return true;
                                                        }
                                                        iArr = null;
                                                        if (iArr != null) {
                                                        }
                                                        boolean j3 = cVar.j("gcm.n.default_sound");
                                                        boolean z112 = j3;
                                                        if (cVar.j("gcm.n.default_vibrate_timings")) {
                                                        }
                                                        int i182 = z112;
                                                        if (cVar.j("gcm.n.default_light_settings")) {
                                                        }
                                                        gVar2.c(i182);
                                                        n16 = cVar.n("gcm.n.tag");
                                                        if (TextUtils.isEmpty(n16)) {
                                                        }
                                                        String str22 = n16;
                                                        if (qVar != null) {
                                                        }
                                                        if (Log.isLoggable("FirebaseMessaging", 3)) {
                                                        }
                                                        ((NotificationManager) ((FirebaseMessagingService) this.f40e).getSystemService("notification")).notify(str22, 0, gVar2.a());
                                                        return true;
                                                    }
                                                    jArr = null;
                                                    if (jArr != null) {
                                                    }
                                                    l11 = cVar.l("gcm.n.light_settings");
                                                    if (l11 != null) {
                                                    }
                                                    iArr = null;
                                                    if (iArr != null) {
                                                    }
                                                    boolean j32 = cVar.j("gcm.n.default_sound");
                                                    boolean z1122 = j32;
                                                    if (cVar.j("gcm.n.default_vibrate_timings")) {
                                                    }
                                                    int i1822 = z1122;
                                                    if (cVar.j("gcm.n.default_light_settings")) {
                                                    }
                                                    gVar2.c(i1822);
                                                    n16 = cVar.n("gcm.n.tag");
                                                    if (TextUtils.isEmpty(n16)) {
                                                    }
                                                    String str222 = n16;
                                                    if (qVar != null) {
                                                    }
                                                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                                                    }
                                                    ((NotificationManager) ((FirebaseMessagingService) this.f40e).getSystemService("notification")).notify(str222, 0, gVar2.a());
                                                    return true;
                                                }
                                                valueOf2 = null;
                                                if (valueOf2 != null) {
                                                }
                                                l10 = cVar.l("gcm.n.vibrate_timings");
                                                if (l10 != null) {
                                                }
                                                jArr = null;
                                                if (jArr != null) {
                                                }
                                                l11 = cVar.l("gcm.n.light_settings");
                                                if (l11 != null) {
                                                }
                                                iArr = null;
                                                if (iArr != null) {
                                                }
                                                boolean j322 = cVar.j("gcm.n.default_sound");
                                                boolean z11222 = j322;
                                                if (cVar.j("gcm.n.default_vibrate_timings")) {
                                                }
                                                int i18222 = z11222;
                                                if (cVar.j("gcm.n.default_light_settings")) {
                                                }
                                                gVar2.c(i18222);
                                                n16 = cVar.n("gcm.n.tag");
                                                if (TextUtils.isEmpty(n16)) {
                                                }
                                                String str2222 = n16;
                                                if (qVar != null) {
                                                }
                                                if (Log.isLoggable("FirebaseMessaging", 3)) {
                                                }
                                                ((NotificationManager) ((FirebaseMessagingService) this.f40e).getSystemService("notification")).notify(str2222, 0, gVar2.a());
                                                return true;
                                            }
                                            k12 = null;
                                            if (k12 != null) {
                                            }
                                            n15 = cVar.n("gcm.n.event_time");
                                            if (!TextUtils.isEmpty(n15)) {
                                            }
                                            valueOf2 = null;
                                            if (valueOf2 != null) {
                                            }
                                            l10 = cVar.l("gcm.n.vibrate_timings");
                                            if (l10 != null) {
                                            }
                                            jArr = null;
                                            if (jArr != null) {
                                            }
                                            l11 = cVar.l("gcm.n.light_settings");
                                            if (l11 != null) {
                                            }
                                            iArr = null;
                                            if (iArr != null) {
                                            }
                                            boolean j3222 = cVar.j("gcm.n.default_sound");
                                            boolean z112222 = j3222;
                                            if (cVar.j("gcm.n.default_vibrate_timings")) {
                                            }
                                            int i182222 = z112222;
                                            if (cVar.j("gcm.n.default_light_settings")) {
                                            }
                                            gVar2.c(i182222);
                                            n16 = cVar.n("gcm.n.tag");
                                            if (TextUtils.isEmpty(n16)) {
                                            }
                                            String str22222 = n16;
                                            if (qVar != null) {
                                            }
                                            if (Log.isLoggable("FirebaseMessaging", 3)) {
                                            }
                                            ((NotificationManager) ((FirebaseMessagingService) this.f40e).getSystemService("notification")).notify(str22222, 0, gVar2.a());
                                            return true;
                                        }
                                        k11 = null;
                                        if (k11 != null) {
                                        }
                                        k12 = cVar.k("gcm.n.notification_count");
                                        if (k12 != null) {
                                        }
                                        k12 = null;
                                        if (k12 != null) {
                                        }
                                        n15 = cVar.n("gcm.n.event_time");
                                        if (!TextUtils.isEmpty(n15)) {
                                        }
                                        valueOf2 = null;
                                        if (valueOf2 != null) {
                                        }
                                        l10 = cVar.l("gcm.n.vibrate_timings");
                                        if (l10 != null) {
                                        }
                                        jArr = null;
                                        if (jArr != null) {
                                        }
                                        l11 = cVar.l("gcm.n.light_settings");
                                        if (l11 != null) {
                                        }
                                        iArr = null;
                                        if (iArr != null) {
                                        }
                                        boolean j32222 = cVar.j("gcm.n.default_sound");
                                        boolean z1122222 = j32222;
                                        if (cVar.j("gcm.n.default_vibrate_timings")) {
                                        }
                                        int i1822222 = z1122222;
                                        if (cVar.j("gcm.n.default_light_settings")) {
                                        }
                                        gVar2.c(i1822222);
                                        n16 = cVar.n("gcm.n.tag");
                                        if (TextUtils.isEmpty(n16)) {
                                        }
                                        String str222222 = n16;
                                        if (qVar != null) {
                                        }
                                        if (Log.isLoggable("FirebaseMessaging", 3)) {
                                        }
                                        ((NotificationManager) ((FirebaseMessagingService) this.f40e).getSystemService("notification")).notify(str222222, 0, gVar2.a());
                                        return true;
                                    }
                                    k10 = null;
                                    if (k10 != null) {
                                    }
                                    k11 = cVar.k("gcm.n.visibility");
                                    if (k11 != null) {
                                    }
                                    k11 = null;
                                    if (k11 != null) {
                                    }
                                    k12 = cVar.k("gcm.n.notification_count");
                                    if (k12 != null) {
                                    }
                                    k12 = null;
                                    if (k12 != null) {
                                    }
                                    n15 = cVar.n("gcm.n.event_time");
                                    if (!TextUtils.isEmpty(n15)) {
                                    }
                                    valueOf2 = null;
                                    if (valueOf2 != null) {
                                    }
                                    l10 = cVar.l("gcm.n.vibrate_timings");
                                    if (l10 != null) {
                                    }
                                    jArr = null;
                                    if (jArr != null) {
                                    }
                                    l11 = cVar.l("gcm.n.light_settings");
                                    if (l11 != null) {
                                    }
                                    iArr = null;
                                    if (iArr != null) {
                                    }
                                    boolean j322222 = cVar.j("gcm.n.default_sound");
                                    boolean z11222222 = j322222;
                                    if (cVar.j("gcm.n.default_vibrate_timings")) {
                                    }
                                    int i18222222 = z11222222;
                                    if (cVar.j("gcm.n.default_light_settings")) {
                                    }
                                    gVar2.c(i18222222);
                                    n16 = cVar.n("gcm.n.tag");
                                    if (TextUtils.isEmpty(n16)) {
                                    }
                                    String str2222222 = n16;
                                    if (qVar != null) {
                                    }
                                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                                    }
                                    ((NotificationManager) ((FirebaseMessagingService) this.f40e).getSystemService("notification")).notify(str2222222, 0, gVar2.a());
                                    return true;
                                }
                                i12 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
                                if (i12 != 0) {
                                    try {
                                        valueOf = Integer.valueOf(firebaseMessagingService.getColor(i12));
                                    } catch (Resources.NotFoundException unused8) {
                                        Log.w("FirebaseMessaging", "Cannot find the color resource referenced in AndroidManifest.");
                                    }
                                    if (valueOf != null) {
                                    }
                                    gVar2.d(16, !cVar.j("gcm.n.sticky"));
                                    gVar2.f3814o = cVar.j("gcm.n.local_only");
                                    n14 = cVar.n("gcm.n.ticker");
                                    if (n14 != null) {
                                    }
                                    k10 = cVar.k("gcm.n.notification_priority");
                                    if (k10 != null) {
                                    }
                                    k10 = null;
                                    if (k10 != null) {
                                    }
                                    k11 = cVar.k("gcm.n.visibility");
                                    if (k11 != null) {
                                    }
                                    k11 = null;
                                    if (k11 != null) {
                                    }
                                    k12 = cVar.k("gcm.n.notification_count");
                                    if (k12 != null) {
                                    }
                                    k12 = null;
                                    if (k12 != null) {
                                    }
                                    n15 = cVar.n("gcm.n.event_time");
                                    if (!TextUtils.isEmpty(n15)) {
                                    }
                                    valueOf2 = null;
                                    if (valueOf2 != null) {
                                    }
                                    l10 = cVar.l("gcm.n.vibrate_timings");
                                    if (l10 != null) {
                                    }
                                    jArr = null;
                                    if (jArr != null) {
                                    }
                                    l11 = cVar.l("gcm.n.light_settings");
                                    if (l11 != null) {
                                    }
                                    iArr = null;
                                    if (iArr != null) {
                                    }
                                    boolean j3222222 = cVar.j("gcm.n.default_sound");
                                    boolean z112222222 = j3222222;
                                    if (cVar.j("gcm.n.default_vibrate_timings")) {
                                    }
                                    int i182222222 = z112222222;
                                    if (cVar.j("gcm.n.default_light_settings")) {
                                    }
                                    gVar2.c(i182222222);
                                    n16 = cVar.n("gcm.n.tag");
                                    if (TextUtils.isEmpty(n16)) {
                                    }
                                    String str22222222 = n16;
                                    if (qVar != null) {
                                    }
                                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                                    }
                                    ((NotificationManager) ((FirebaseMessagingService) this.f40e).getSystemService("notification")).notify(str22222222, 0, gVar2.a());
                                    return true;
                                }
                                valueOf = null;
                                if (valueOf != null) {
                                }
                                gVar2.d(16, !cVar.j("gcm.n.sticky"));
                                gVar2.f3814o = cVar.j("gcm.n.local_only");
                                n14 = cVar.n("gcm.n.ticker");
                                if (n14 != null) {
                                }
                                k10 = cVar.k("gcm.n.notification_priority");
                                if (k10 != null) {
                                }
                                k10 = null;
                                if (k10 != null) {
                                }
                                k11 = cVar.k("gcm.n.visibility");
                                if (k11 != null) {
                                }
                                k11 = null;
                                if (k11 != null) {
                                }
                                k12 = cVar.k("gcm.n.notification_count");
                                if (k12 != null) {
                                }
                                k12 = null;
                                if (k12 != null) {
                                }
                                n15 = cVar.n("gcm.n.event_time");
                                if (!TextUtils.isEmpty(n15)) {
                                }
                                valueOf2 = null;
                                if (valueOf2 != null) {
                                }
                                l10 = cVar.l("gcm.n.vibrate_timings");
                                if (l10 != null) {
                                }
                                jArr = null;
                                if (jArr != null) {
                                }
                                l11 = cVar.l("gcm.n.light_settings");
                                if (l11 != null) {
                                }
                                iArr = null;
                                if (iArr != null) {
                                }
                                boolean j32222222 = cVar.j("gcm.n.default_sound");
                                boolean z1122222222 = j32222222;
                                if (cVar.j("gcm.n.default_vibrate_timings")) {
                                }
                                int i1822222222 = z1122222222;
                                if (cVar.j("gcm.n.default_light_settings")) {
                                }
                                gVar2.c(i1822222222);
                                n16 = cVar.n("gcm.n.tag");
                                if (TextUtils.isEmpty(n16)) {
                                }
                                String str222222222 = n16;
                                if (qVar != null) {
                                }
                                if (Log.isLoggable("FirebaseMessaging", 3)) {
                                }
                                ((NotificationManager) ((FirebaseMessagingService) this.f40e).getSystemService("notification")).notify(str222222222, 0, gVar2.a());
                                return true;
                            }
                            i3 = 1;
                            Log.w("FirebaseMessaging", "Icon resource " + n10 + " not found. Notification will use default icon.");
                        }
                        i10 = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
                        if (i10 != 0 || !com.google.firebase.messaging.e.a(resources, i10)) {
                            i10 = packageManager.getApplicationInfo(packageName, 0).icon;
                        }
                        i11 = (i10 == 0 && com.google.firebase.messaging.e.a(resources, i10)) ? i10 : 17301651;
                        gVar2.f3821v.icon = i11;
                        n11 = cVar.n("gcm.n.sound2");
                        if (TextUtils.isEmpty(n11)) {
                        }
                        if (!TextUtils.isEmpty(n11)) {
                        }
                        if (defaultUri != null) {
                        }
                        n12 = cVar.n("gcm.n.click_action");
                        if (TextUtils.isEmpty(n12)) {
                        }
                        if (launchIntentForPackage != null) {
                        }
                        gVar2.g = activity;
                        if (cVar.j("google.c.a.e")) {
                        }
                        if (broadcast != null) {
                        }
                        n13 = cVar.n("gcm.n.color");
                        if (!TextUtils.isEmpty(n13)) {
                        }
                        i12 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
                        if (i12 != 0) {
                        }
                        valueOf = null;
                        if (valueOf != null) {
                        }
                        gVar2.d(16, !cVar.j("gcm.n.sticky"));
                        gVar2.f3814o = cVar.j("gcm.n.local_only");
                        n14 = cVar.n("gcm.n.ticker");
                        if (n14 != null) {
                        }
                        k10 = cVar.k("gcm.n.notification_priority");
                        if (k10 != null) {
                        }
                        k10 = null;
                        if (k10 != null) {
                        }
                        k11 = cVar.k("gcm.n.visibility");
                        if (k11 != null) {
                        }
                        k11 = null;
                        if (k11 != null) {
                        }
                        k12 = cVar.k("gcm.n.notification_count");
                        if (k12 != null) {
                        }
                        k12 = null;
                        if (k12 != null) {
                        }
                        n15 = cVar.n("gcm.n.event_time");
                        if (!TextUtils.isEmpty(n15)) {
                        }
                        valueOf2 = null;
                        if (valueOf2 != null) {
                        }
                        l10 = cVar.l("gcm.n.vibrate_timings");
                        if (l10 != null) {
                        }
                        jArr = null;
                        if (jArr != null) {
                        }
                        l11 = cVar.l("gcm.n.light_settings");
                        if (l11 != null) {
                        }
                        iArr = null;
                        if (iArr != null) {
                        }
                        boolean j322222222 = cVar.j("gcm.n.default_sound");
                        boolean z11222222222 = j322222222;
                        if (cVar.j("gcm.n.default_vibrate_timings")) {
                        }
                        int i18222222222 = z11222222222;
                        if (cVar.j("gcm.n.default_light_settings")) {
                        }
                        gVar2.c(i18222222222);
                        n16 = cVar.n("gcm.n.tag");
                        if (TextUtils.isEmpty(n16)) {
                        }
                        String str2222222222 = n16;
                        if (qVar != null) {
                        }
                        if (Log.isLoggable("FirebaseMessaging", 3)) {
                        }
                        ((NotificationManager) ((FirebaseMessagingService) this.f40e).getSystemService("notification")).notify(str2222222222, 0, gVar2.a());
                        return true;
                    }
                    n18 = bundle2.getString("com.google.firebase.messaging.default_notification_channel_id");
                    if (!TextUtils.isEmpty(n18)) {
                        notificationChannel2 = notificationManager.getNotificationChannel(n18);
                        if (notificationChannel2 == null) {
                            Log.w("FirebaseMessaging", "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.");
                        }
                        atomicInteger = com.google.firebase.messaging.e.f3128a;
                        packageName = firebaseMessagingService.getPackageName();
                        Resources resources2 = firebaseMessagingService.getResources();
                        packageManager = firebaseMessagingService.getPackageManager();
                        e3.g gVar22 = new e3.g(firebaseMessagingService, n18);
                        m10 = cVar.m(resources2, packageName, "gcm.n.title");
                        if (!TextUtils.isEmpty(m10)) {
                        }
                        m11 = cVar.m(resources2, packageName, "gcm.n.body");
                        if (!TextUtils.isEmpty(m11)) {
                        }
                        n10 = cVar.n("gcm.n.icon");
                        if (TextUtils.isEmpty(n10)) {
                        }
                        i10 = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
                        if (i10 != 0) {
                        }
                        i10 = packageManager.getApplicationInfo(packageName, 0).icon;
                        if (i10 == 0) {
                        }
                        gVar22.f3821v.icon = i11;
                        n11 = cVar.n("gcm.n.sound2");
                        if (TextUtils.isEmpty(n11)) {
                        }
                        if (!TextUtils.isEmpty(n11)) {
                        }
                        if (defaultUri != null) {
                        }
                        n12 = cVar.n("gcm.n.click_action");
                        if (TextUtils.isEmpty(n12)) {
                        }
                        if (launchIntentForPackage != null) {
                        }
                        gVar22.g = activity;
                        if (cVar.j("google.c.a.e")) {
                        }
                        if (broadcast != null) {
                        }
                        n13 = cVar.n("gcm.n.color");
                        if (!TextUtils.isEmpty(n13)) {
                        }
                        i12 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
                        if (i12 != 0) {
                        }
                        valueOf = null;
                        if (valueOf != null) {
                        }
                        gVar22.d(16, !cVar.j("gcm.n.sticky"));
                        gVar22.f3814o = cVar.j("gcm.n.local_only");
                        n14 = cVar.n("gcm.n.ticker");
                        if (n14 != null) {
                        }
                        k10 = cVar.k("gcm.n.notification_priority");
                        if (k10 != null) {
                        }
                        k10 = null;
                        if (k10 != null) {
                        }
                        k11 = cVar.k("gcm.n.visibility");
                        if (k11 != null) {
                        }
                        k11 = null;
                        if (k11 != null) {
                        }
                        k12 = cVar.k("gcm.n.notification_count");
                        if (k12 != null) {
                        }
                        k12 = null;
                        if (k12 != null) {
                        }
                        n15 = cVar.n("gcm.n.event_time");
                        if (!TextUtils.isEmpty(n15)) {
                        }
                        valueOf2 = null;
                        if (valueOf2 != null) {
                        }
                        l10 = cVar.l("gcm.n.vibrate_timings");
                        if (l10 != null) {
                        }
                        jArr = null;
                        if (jArr != null) {
                        }
                        l11 = cVar.l("gcm.n.light_settings");
                        if (l11 != null) {
                        }
                        iArr = null;
                        if (iArr != null) {
                        }
                        boolean j3222222222 = cVar.j("gcm.n.default_sound");
                        boolean z112222222222 = j3222222222;
                        if (cVar.j("gcm.n.default_vibrate_timings")) {
                        }
                        int i182222222222 = z112222222222;
                        if (cVar.j("gcm.n.default_light_settings")) {
                        }
                        gVar22.c(i182222222222);
                        n16 = cVar.n("gcm.n.tag");
                        if (TextUtils.isEmpty(n16)) {
                        }
                        String str22222222222 = n16;
                        if (qVar != null) {
                        }
                        if (Log.isLoggable("FirebaseMessaging", 3)) {
                        }
                        ((NotificationManager) ((FirebaseMessagingService) this.f40e).getSystemService("notification")).notify(str22222222222, 0, gVar22.a());
                        return true;
                    }
                    Log.w("FirebaseMessaging", "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.");
                    notificationChannel = notificationManager.getNotificationChannel("fcm_fallback_notification_channel");
                    if (notificationChannel == null) {
                        int identifier = firebaseMessagingService.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", firebaseMessagingService.getPackageName());
                        if (identifier == 0) {
                            Log.e("FirebaseMessaging", "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name.");
                            string = "Misc";
                        } else {
                            string = firebaseMessagingService.getString(identifier);
                        }
                        notificationManager.createNotificationChannel(ac.a.g(string));
                    }
                    n18 = "fcm_fallback_notification_channel";
                    atomicInteger = com.google.firebase.messaging.e.f3128a;
                    packageName = firebaseMessagingService.getPackageName();
                    Resources resources22 = firebaseMessagingService.getResources();
                    packageManager = firebaseMessagingService.getPackageManager();
                    e3.g gVar222 = new e3.g(firebaseMessagingService, n18);
                    m10 = cVar.m(resources22, packageName, "gcm.n.title");
                    if (!TextUtils.isEmpty(m10)) {
                    }
                    m11 = cVar.m(resources22, packageName, "gcm.n.body");
                    if (!TextUtils.isEmpty(m11)) {
                    }
                    n10 = cVar.n("gcm.n.icon");
                    if (TextUtils.isEmpty(n10)) {
                    }
                    i10 = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
                    if (i10 != 0) {
                    }
                    i10 = packageManager.getApplicationInfo(packageName, 0).icon;
                    if (i10 == 0) {
                    }
                    gVar222.f3821v.icon = i11;
                    n11 = cVar.n("gcm.n.sound2");
                    if (TextUtils.isEmpty(n11)) {
                    }
                    if (!TextUtils.isEmpty(n11)) {
                    }
                    if (defaultUri != null) {
                    }
                    n12 = cVar.n("gcm.n.click_action");
                    if (TextUtils.isEmpty(n12)) {
                    }
                    if (launchIntentForPackage != null) {
                    }
                    gVar222.g = activity;
                    if (cVar.j("google.c.a.e")) {
                    }
                    if (broadcast != null) {
                    }
                    n13 = cVar.n("gcm.n.color");
                    if (!TextUtils.isEmpty(n13)) {
                    }
                    i12 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
                    if (i12 != 0) {
                    }
                    valueOf = null;
                    if (valueOf != null) {
                    }
                    gVar222.d(16, !cVar.j("gcm.n.sticky"));
                    gVar222.f3814o = cVar.j("gcm.n.local_only");
                    n14 = cVar.n("gcm.n.ticker");
                    if (n14 != null) {
                    }
                    k10 = cVar.k("gcm.n.notification_priority");
                    if (k10 != null) {
                    }
                    k10 = null;
                    if (k10 != null) {
                    }
                    k11 = cVar.k("gcm.n.visibility");
                    if (k11 != null) {
                    }
                    k11 = null;
                    if (k11 != null) {
                    }
                    k12 = cVar.k("gcm.n.notification_count");
                    if (k12 != null) {
                    }
                    k12 = null;
                    if (k12 != null) {
                    }
                    n15 = cVar.n("gcm.n.event_time");
                    if (!TextUtils.isEmpty(n15)) {
                    }
                    valueOf2 = null;
                    if (valueOf2 != null) {
                    }
                    l10 = cVar.l("gcm.n.vibrate_timings");
                    if (l10 != null) {
                    }
                    jArr = null;
                    if (jArr != null) {
                    }
                    l11 = cVar.l("gcm.n.light_settings");
                    if (l11 != null) {
                    }
                    iArr = null;
                    if (iArr != null) {
                    }
                    boolean j32222222222 = cVar.j("gcm.n.default_sound");
                    boolean z1122222222222 = j32222222222;
                    if (cVar.j("gcm.n.default_vibrate_timings")) {
                    }
                    int i1822222222222 = z1122222222222;
                    if (cVar.j("gcm.n.default_light_settings")) {
                    }
                    gVar222.c(i1822222222222);
                    n16 = cVar.n("gcm.n.tag");
                    if (TextUtils.isEmpty(n16)) {
                    }
                    String str222222222222 = n16;
                    if (qVar != null) {
                    }
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                    }
                    ((NotificationManager) ((FirebaseMessagingService) this.f40e).getSystemService("notification")).notify(str222222222222, 0, gVar222.a());
                    return true;
                }
            }
            n18 = null;
            atomicInteger = com.google.firebase.messaging.e.f3128a;
            packageName = firebaseMessagingService.getPackageName();
            Resources resources222 = firebaseMessagingService.getResources();
            packageManager = firebaseMessagingService.getPackageManager();
            e3.g gVar2222 = new e3.g(firebaseMessagingService, n18);
            m10 = cVar.m(resources222, packageName, "gcm.n.title");
            if (!TextUtils.isEmpty(m10)) {
            }
            m11 = cVar.m(resources222, packageName, "gcm.n.body");
            if (!TextUtils.isEmpty(m11)) {
            }
            n10 = cVar.n("gcm.n.icon");
            if (TextUtils.isEmpty(n10)) {
            }
            i10 = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
            if (i10 != 0) {
            }
            i10 = packageManager.getApplicationInfo(packageName, 0).icon;
            if (i10 == 0) {
            }
            gVar2222.f3821v.icon = i11;
            n11 = cVar.n("gcm.n.sound2");
            if (TextUtils.isEmpty(n11)) {
            }
            if (!TextUtils.isEmpty(n11)) {
            }
            if (defaultUri != null) {
            }
            n12 = cVar.n("gcm.n.click_action");
            if (TextUtils.isEmpty(n12)) {
            }
            if (launchIntentForPackage != null) {
            }
            gVar2222.g = activity;
            if (cVar.j("google.c.a.e")) {
            }
            if (broadcast != null) {
            }
            n13 = cVar.n("gcm.n.color");
            if (!TextUtils.isEmpty(n13)) {
            }
            i12 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
            if (i12 != 0) {
            }
            valueOf = null;
            if (valueOf != null) {
            }
            gVar2222.d(16, !cVar.j("gcm.n.sticky"));
            gVar2222.f3814o = cVar.j("gcm.n.local_only");
            n14 = cVar.n("gcm.n.ticker");
            if (n14 != null) {
            }
            k10 = cVar.k("gcm.n.notification_priority");
            if (k10 != null) {
            }
            k10 = null;
            if (k10 != null) {
            }
            k11 = cVar.k("gcm.n.visibility");
            if (k11 != null) {
            }
            k11 = null;
            if (k11 != null) {
            }
            k12 = cVar.k("gcm.n.notification_count");
            if (k12 != null) {
            }
            k12 = null;
            if (k12 != null) {
            }
            n15 = cVar.n("gcm.n.event_time");
            if (!TextUtils.isEmpty(n15)) {
            }
            valueOf2 = null;
            if (valueOf2 != null) {
            }
            l10 = cVar.l("gcm.n.vibrate_timings");
            if (l10 != null) {
            }
            jArr = null;
            if (jArr != null) {
            }
            l11 = cVar.l("gcm.n.light_settings");
            if (l11 != null) {
            }
            iArr = null;
            if (iArr != null) {
            }
            boolean j322222222222 = cVar.j("gcm.n.default_sound");
            boolean z11222222222222 = j322222222222;
            if (cVar.j("gcm.n.default_vibrate_timings")) {
            }
            int i18222222222222 = z11222222222222;
            if (cVar.j("gcm.n.default_light_settings")) {
            }
            gVar2222.c(i18222222222222);
            n16 = cVar.n("gcm.n.tag");
            if (TextUtils.isEmpty(n16)) {
            }
            String str2222222222222 = n16;
            if (qVar != null) {
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
            }
            ((NotificationManager) ((FirebaseMessagingService) this.f40e).getSystemService("notification")).notify(str2222222222222, 0, gVar2222.a());
            return true;
        }
        qVar = null;
        int i132 = 3;
        if (qVar != null) {
        }
        firebaseMessagingService = (FirebaseMessagingService) this.f40e;
        cVar = (d9.c) this.f42r;
        AtomicInteger atomicInteger22 = com.google.firebase.messaging.e.f3128a;
        applicationInfo = firebaseMessagingService.getPackageManager().getApplicationInfo(firebaseMessagingService.getPackageName(), 128);
        if (applicationInfo != null) {
        }
        bundle = Bundle.EMPTY;
        Bundle bundle22 = bundle;
        String n182 = cVar.n("gcm.n.android_channel_id");
        if (Build.VERSION.SDK_INT >= 26) {
        }
        n182 = null;
        atomicInteger = com.google.firebase.messaging.e.f3128a;
        packageName = firebaseMessagingService.getPackageName();
        Resources resources2222 = firebaseMessagingService.getResources();
        packageManager = firebaseMessagingService.getPackageManager();
        e3.g gVar22222 = new e3.g(firebaseMessagingService, n182);
        m10 = cVar.m(resources2222, packageName, "gcm.n.title");
        if (!TextUtils.isEmpty(m10)) {
        }
        m11 = cVar.m(resources2222, packageName, "gcm.n.body");
        if (!TextUtils.isEmpty(m11)) {
        }
        n10 = cVar.n("gcm.n.icon");
        if (TextUtils.isEmpty(n10)) {
        }
        i10 = bundle22.getInt("com.google.firebase.messaging.default_notification_icon", 0);
        if (i10 != 0) {
        }
        i10 = packageManager.getApplicationInfo(packageName, 0).icon;
        if (i10 == 0) {
        }
        gVar22222.f3821v.icon = i11;
        n11 = cVar.n("gcm.n.sound2");
        if (TextUtils.isEmpty(n11)) {
        }
        if (!TextUtils.isEmpty(n11)) {
        }
        if (defaultUri != null) {
        }
        n12 = cVar.n("gcm.n.click_action");
        if (TextUtils.isEmpty(n12)) {
        }
        if (launchIntentForPackage != null) {
        }
        gVar22222.g = activity;
        if (cVar.j("google.c.a.e")) {
        }
        if (broadcast != null) {
        }
        n13 = cVar.n("gcm.n.color");
        if (!TextUtils.isEmpty(n13)) {
        }
        i12 = bundle22.getInt("com.google.firebase.messaging.default_notification_color", 0);
        if (i12 != 0) {
        }
        valueOf = null;
        if (valueOf != null) {
        }
        gVar22222.d(16, !cVar.j("gcm.n.sticky"));
        gVar22222.f3814o = cVar.j("gcm.n.local_only");
        n14 = cVar.n("gcm.n.ticker");
        if (n14 != null) {
        }
        k10 = cVar.k("gcm.n.notification_priority");
        if (k10 != null) {
        }
        k10 = null;
        if (k10 != null) {
        }
        k11 = cVar.k("gcm.n.visibility");
        if (k11 != null) {
        }
        k11 = null;
        if (k11 != null) {
        }
        k12 = cVar.k("gcm.n.notification_count");
        if (k12 != null) {
        }
        k12 = null;
        if (k12 != null) {
        }
        n15 = cVar.n("gcm.n.event_time");
        if (!TextUtils.isEmpty(n15)) {
        }
        valueOf2 = null;
        if (valueOf2 != null) {
        }
        l10 = cVar.l("gcm.n.vibrate_timings");
        if (l10 != null) {
        }
        jArr = null;
        if (jArr != null) {
        }
        l11 = cVar.l("gcm.n.light_settings");
        if (l11 != null) {
        }
        iArr = null;
        if (iArr != null) {
        }
        boolean j3222222222222 = cVar.j("gcm.n.default_sound");
        boolean z112222222222222 = j3222222222222;
        if (cVar.j("gcm.n.default_vibrate_timings")) {
        }
        int i182222222222222 = z112222222222222;
        if (cVar.j("gcm.n.default_light_settings")) {
        }
        gVar22222.c(i182222222222222);
        n16 = cVar.n("gcm.n.tag");
        if (TextUtils.isEmpty(n16)) {
        }
        String str22222222222222 = n16;
        if (qVar != null) {
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
        }
        ((NotificationManager) ((FirebaseMessagingService) this.f40e).getSystemService("notification")).notify(str22222222222222, 0, gVar22222.a());
        return true;
    }

    public boolean w(CharSequence charSequence, int i3, int i10, c4.x xVar) {
        if ((xVar.f1797c & 3) == 0) {
            c4.e eVar = (c4.e) this.f42r;
            d4.a b10 = xVar.b();
            int a9 = b10.a(8);
            if (a9 != 0) {
                ((ByteBuffer) b10.f3619r).getShort(a9 + b10.f3616d);
            }
            eVar.getClass();
            ThreadLocal threadLocal = c4.e.f1747b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb2 = (StringBuilder) threadLocal.get();
            sb2.setLength(0);
            while (i3 < i10) {
                sb2.append(charSequence.charAt(i3));
                i3++;
            }
            boolean hasGlyph = eVar.f1748a.hasGlyph(sb2.toString());
            int i11 = xVar.f1797c & 4;
            xVar.f1797c = hasGlyph ? i11 | 2 : i11 | 1;
        }
        return (xVar.f1797c & 3) == 2;
    }

    public boolean x() {
        return !(((y1) ((d9.c) this.f41i).f3701e).isEmpty() && ((y1) ((d9.c) this.f42r).f3701e).isEmpty() && ((y1) ((d9.c) this.f40e).f3701e).isEmpty());
    }

    public n y() {
        CharSequence charSequence = (CharSequence) this.f40e;
        Matcher matcher = (Matcher) this.f41i;
        int end = matcher.end() + (matcher.end() == matcher.start() ? 1 : 0);
        if (end > charSequence.length()) {
            return null;
        }
        Matcher matcher2 = matcher.pattern().matcher(charSequence);
        matcher2.getClass();
        if (matcher2.find(end)) {
            return new n(matcher2, charSequence);
        }
        return null;
    }

    public /* synthetic */ n(Object obj, Object obj2, Object obj3, int i3) {
        this.f39d = i3;
        this.f41i = obj;
        this.f40e = obj2;
        this.f42r = obj3;
    }

    public /* synthetic */ n(Object obj, Object obj2, Object obj3, int i3, boolean z10) {
        this.f39d = i3;
        this.f41i = obj3;
        this.f40e = obj;
        this.f42r = obj2;
    }

    public n(v0 v0Var, String str) {
        this.f39d = 10;
        this.f41i = d8.d.f3692c;
        this.f40e = w.D(new l5(4, this, v0Var));
        this.f42r = w.D(new l5(3, this, str));
    }

    public n(sa saVar, String str) {
        this.f39d = 12;
        this.f41i = saVar;
        this.f40e = str;
        Context context = saVar.f2787b;
        Pattern pattern = de.f2235a;
        ra raVar = new ra(context);
        raVar.j("phenotype");
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 4);
        sb2.append("/");
        sb2.append(str);
        sb2.append(".pb");
        raVar.k(sb2.toString());
        this.f42r = raVar.l();
    }

    public n(com.google.android.gms.internal.measurement.b bVar) {
        this.f39d = 7;
        this.f41i = bVar;
        this.f40e = bVar.clone();
        this.f42r = new ArrayList();
    }

    public n(t1 t1Var) {
        this.f39d = 27;
        this.f41i = new x0.a(0);
        this.f40e = new se(9);
        this.f42r = new a4.a(5, this, t1Var);
    }

    public n(androidx.lifecycle.x xVar) {
        this.f39d = 2;
        this.f41i = new androidx.lifecycle.w(xVar, true);
        this.f40e = new Handler(Looper.getMainLooper());
    }

    public n(k6.i iVar, h6.c cVar, a2.r rVar, k6.o oVar) {
        this.f39d = 21;
        this.f41i = iVar;
        this.f40e = cVar;
        this.f42r = oVar;
    }

    public n(ExecutorService executorService) {
        this.f39d = 16;
        this.f40e = new Handler(Looper.getMainLooper());
        this.f42r = new f6.b(0, this);
        this.f41i = new d6.l(executorService, 0);
    }

    public n(se seVar) {
        this.f39d = 19;
        this.f41i = seVar;
        this.f40e = new ConcurrentHashMap();
        this.f42r = new ConcurrentHashMap();
    }

    public n(m1.b bVar) {
        this.f39d = 26;
        this.f42r = bVar;
        this.f41i = new l.d(8, this);
    }

    public n(Context context, TypedArray typedArray) {
        this.f39d = 25;
        this.f41i = context;
        this.f40e = typedArray;
    }

    public /* synthetic */ n(int i3, boolean z10) {
        this.f39d = i3;
    }

    public n(c6.n nVar, u8.d dVar, c4.e eVar, Set set) {
        this.f39d = 5;
        this.f41i = dVar;
        this.f40e = nVar;
        this.f42r = eVar;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            C(str, 0, str.length(), 1, true, new a8.f(str, 1));
        }
    }

    public n(String str) {
        this.f39d = 1;
        c6.s sVar = new c6.s();
        this.f41i = sVar;
        this.f42r = sVar;
        this.f40e = str;
    }

    public n(g0 g0Var) {
        this.f39d = 4;
        this.f41i = g0Var;
        this.f40e = new ArrayList();
        this.f42r = g0Var;
    }

    public n(Matcher matcher, CharSequence charSequence) {
        this.f39d = 23;
        matcher.getClass();
        charSequence.getClass();
        this.f41i = matcher;
        this.f40e = charSequence;
        this.f42r = new kotlin.collections.i(1, this);
    }

    public n(URL url, j6.i iVar, String str) {
        this.f39d = 18;
        this.f41i = url;
        this.f42r = iVar;
        this.f40e = str;
    }
}
