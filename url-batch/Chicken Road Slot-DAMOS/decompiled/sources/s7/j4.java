package s7;

import android.app.BroadcastOptions;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.PersistableBundle;
import android.os.SystemClock;
import android.os.UserHandle;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.internal.measurement.a8;
import com.google.android.gms.internal.measurement.b9;
import com.google.android.gms.internal.measurement.c9;
import com.google.android.gms.internal.measurement.d9;
import com.google.android.gms.internal.measurement.e9;
import com.google.android.gms.internal.measurement.g8;
import com.google.android.gms.internal.measurement.j8;
import com.google.android.gms.internal.measurement.l8;
import com.google.android.gms.internal.measurement.l9;
import com.google.android.gms.internal.measurement.m8;
import com.google.android.gms.internal.measurement.m9;
import com.google.android.gms.internal.measurement.n9;
import com.google.android.gms.internal.measurement.p8;
import com.google.android.gms.internal.measurement.q8;
import com.google.android.gms.internal.measurement.r8;
import com.google.android.gms.internal.measurement.s7;
import com.google.android.gms.internal.measurement.s8;
import com.google.android.gms.internal.measurement.t7;
import com.google.android.gms.internal.measurement.u7;
import com.google.android.gms.internal.measurement.v7;
import com.google.android.gms.internal.measurement.v8;
import com.google.android.gms.internal.measurement.w8;
import com.google.android.gms.internal.measurement.y5;
import com.google.android.gms.internal.measurement.y8;
import com.google.android.gms.internal.measurement.z8;
import com.onesignal.core.activities.PermissionsActivity;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.GZIPInputStream;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class j4 implements y1 {
    public static volatile j4 Y;
    public boolean B;
    public long C;
    public ArrayList D;
    public int F;
    public int G;
    public boolean H;
    public boolean I;
    public boolean J;
    public FileLock K;
    public FileChannel L;
    public ArrayList M;
    public ArrayList N;
    public final HashMap P;
    public final HashMap Q;
    public final HashMap R;
    public y2 T;
    public String U;
    public r3 V;
    public long W;

    /* renamed from: d, reason: collision with root package name */
    public final k1 f8760d;

    /* renamed from: e, reason: collision with root package name */
    public final z0 f8761e;

    /* renamed from: i, reason: collision with root package name */
    public m f8762i;

    /* renamed from: r, reason: collision with root package name */
    public b1 f8763r;

    /* renamed from: s, reason: collision with root package name */
    public y3 f8764s;

    /* renamed from: t, reason: collision with root package name */
    public c f8765t;

    /* renamed from: u, reason: collision with root package name */
    public final l4 f8766u;

    /* renamed from: v, reason: collision with root package name */
    public z0 f8767v;

    /* renamed from: w, reason: collision with root package name */
    public n3 f8768w;

    /* renamed from: y, reason: collision with root package name */
    public h1 f8770y;

    /* renamed from: z, reason: collision with root package name */
    public final q1 f8771z;
    public final AtomicBoolean A = new AtomicBoolean(false);
    public final LinkedList E = new LinkedList();
    public final HashMap S = new HashMap();
    public final g4 X = new g4(this);
    public long O = -1;

    /* renamed from: x, reason: collision with root package name */
    public final f4 f8769x = new f4(this);

    public j4(c4.o oVar) {
        this.f8771z = q1.r(oVar.f1772d, null, null, null);
        l4 l4Var = new l4(this);
        l4Var.u();
        this.f8766u = l4Var;
        z0 z0Var = new z0(this, 0);
        z0Var.u();
        this.f8761e = z0Var;
        k1 k1Var = new k1(this);
        k1Var.u();
        this.f8760d = k1Var;
        this.P = new HashMap();
        this.Q = new HashMap();
        this.R = new HashMap();
        d().B(new b7.k(this, oVar));
    }

    public static j4 C(Context context) {
        c7.c0.g(context);
        c7.c0.g(context.getApplicationContext());
        if (Y == null) {
            synchronized (j4.class) {
                try {
                    if (Y == null) {
                        Y = new j4(new c4.o(context, 5));
                    }
                } finally {
                }
            }
        }
        return Y;
    }

    public static final void D(v8 v8Var, int i3, String str) {
        List g = v8Var.g();
        for (int i10 = 0; i10 < g.size(); i10++) {
            if ("_err".equals(((z8) g.get(i10)).u())) {
                return;
            }
        }
        y8 F = z8.F();
        F.g("_err");
        F.i(i3);
        z8 z8Var = (z8) F.d();
        y8 F2 = z8.F();
        F2.g("_ev");
        F2.h(str);
        z8 z8Var2 = (z8) F2.d();
        v8Var.j(z8Var);
        v8Var.j(z8Var2);
    }

    public static final void E(v8 v8Var, String str) {
        List g = v8Var.g();
        for (int i3 = 0; i3 < g.size(); i3++) {
            if (str.equals(((z8) g.get(i3)).u())) {
                v8Var.l(i3);
                return;
            }
        }
    }

    public static final boolean S(r4 r4Var) {
        return !TextUtils.isEmpty(r4Var.f8977e);
    }

    public static final void T(d4 d4Var) {
        if (d4Var == null) {
            kotlin.collections.i0.l("Upload Component not created");
        } else {
            if (d4Var.f8593i) {
                return;
            }
            kotlin.collections.i0.l("Component not initialized: ".concat(String.valueOf(d4Var.getClass())));
        }
    }

    public static final Boolean U(r4 r4Var) {
        Boolean bool = r4Var.D;
        String str = r4Var.Q;
        if (!TextUtils.isEmpty(str)) {
            int ordinal = ((z1) l.d.F(str).f5643e).ordinal();
            if (ordinal == 0 || ordinal == 1) {
                return null;
            }
            if (ordinal == 2) {
                return Boolean.TRUE;
            }
            if (ordinal == 3) {
                return Boolean.FALSE;
            }
        }
        return bool;
    }

    public final void A(a1 a1Var) {
        s.e eVar;
        s.e eVar2;
        d().s();
        if (TextUtils.isEmpty(a1Var.H())) {
            String E = a1Var.E();
            c7.c0.g(E);
            B(E, 204, null, null, null);
            return;
        }
        String E2 = a1Var.E();
        c7.c0.g(E2);
        b().B.b(E2, "Fetching remote configuration");
        k1 k1Var = this.f8760d;
        T(k1Var);
        a8 E3 = k1Var.E(E2);
        T(k1Var);
        k1Var.s();
        String str = (String) k1Var.B.get(E2);
        if (E3 != null) {
            if (TextUtils.isEmpty(str)) {
                eVar2 = null;
            } else {
                eVar2 = new s.e(0);
                eVar2.put("If-Modified-Since", str);
            }
            T(k1Var);
            k1Var.s();
            String str2 = (String) k1Var.C.get(E2);
            if (!TextUtils.isEmpty(str2)) {
                if (eVar2 == null) {
                    eVar2 = new s.e(0);
                }
                eVar2.put("If-None-Match", str2);
            }
            eVar = eVar2;
        } else {
            eVar = null;
        }
        this.H = true;
        z0 z0Var = this.f8761e;
        T(z0Var);
        g4 g4Var = new g4(this);
        q1 q1Var = (q1) z0Var.f1478d;
        z0Var.s();
        z0Var.t();
        f4 f4Var = z0Var.f9150e.f8769x;
        Uri.Builder builder = new Uri.Builder();
        Uri.Builder appendQueryParameter = builder.scheme((String) e0.f8620f.a(null)).encodedAuthority((String) e0.g.a(null)).path("config/app/".concat(String.valueOf(a1Var.H()))).appendQueryParameter("platform", "android");
        ((q1) f4Var.f1478d).f8935r.y();
        appendQueryParameter.appendQueryParameter("gmp_version", String.valueOf(161000L)).appendQueryParameter("runtime_version", "0");
        String uri = builder.build().toString();
        try {
            URL url = new URI(uri).toURL();
            o1 o1Var = q1Var.f8938u;
            q1.l(o1Var);
            o1Var.E(new y0(z0Var, a1Var.E(), url, (byte[]) null, eVar, g4Var));
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused) {
            v0 v0Var = q1Var.f8937t;
            q1.l(v0Var);
            v0Var.f9050t.c(v0.A(a1Var.E()), uri, "Failed to parse config URL. Not fetching. appId");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0063 A[Catch: all -> 0x0074, TRY_LEAVE, TryCatch #0 {all -> 0x0074, blocks: (B:8:0x0045, B:16:0x0063, B:17:0x0177, B:26:0x0080, B:30:0x00dc, B:31:0x00ca, B:32:0x00e1, B:36:0x00f8, B:37:0x010e, B:39:0x0126, B:40:0x0141, B:42:0x014a, B:44:0x0150, B:45:0x0154, B:47:0x015d, B:49:0x016c, B:50:0x0174, B:51:0x0132, B:52:0x00ff, B:54:0x0108), top: B:7:0x0045, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0126 A[Catch: all -> 0x0074, TryCatch #0 {all -> 0x0074, blocks: (B:8:0x0045, B:16:0x0063, B:17:0x0177, B:26:0x0080, B:30:0x00dc, B:31:0x00ca, B:32:0x00e1, B:36:0x00f8, B:37:0x010e, B:39:0x0126, B:40:0x0141, B:42:0x014a, B:44:0x0150, B:45:0x0154, B:47:0x015d, B:49:0x016c, B:50:0x0174, B:51:0x0132, B:52:0x00ff, B:54:0x0108), top: B:7:0x0045, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x015d A[Catch: all -> 0x0074, TryCatch #0 {all -> 0x0074, blocks: (B:8:0x0045, B:16:0x0063, B:17:0x0177, B:26:0x0080, B:30:0x00dc, B:31:0x00ca, B:32:0x00e1, B:36:0x00f8, B:37:0x010e, B:39:0x0126, B:40:0x0141, B:42:0x014a, B:44:0x0150, B:45:0x0154, B:47:0x015d, B:49:0x016c, B:50:0x0174, B:51:0x0132, B:52:0x00ff, B:54:0x0108), top: B:7:0x0045, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0132 A[Catch: all -> 0x0074, TryCatch #0 {all -> 0x0074, blocks: (B:8:0x0045, B:16:0x0063, B:17:0x0177, B:26:0x0080, B:30:0x00dc, B:31:0x00ca, B:32:0x00e1, B:36:0x00f8, B:37:0x010e, B:39:0x0126, B:40:0x0141, B:42:0x014a, B:44:0x0150, B:45:0x0154, B:47:0x015d, B:49:0x016c, B:50:0x0174, B:51:0x0132, B:52:0x00ff, B:54:0x0108), top: B:7:0x0045, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B(String str, int i3, Throwable th, byte[] bArr, Map map) {
        boolean z10;
        z0 z0Var = this.f8761e;
        d().s();
        l0();
        c7.c0.d(str);
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } catch (Throwable th2) {
                this.H = false;
                O();
                throw th2;
            }
        }
        t0 t0Var = b().B;
        Integer valueOf = Integer.valueOf(bArr.length);
        t0Var.b(valueOf, "onConfigFetched. Response size");
        if (e0().D(null, e0.f8619e1)) {
            l4 l4Var = this.f8766u;
            T(l4Var);
            l4Var.y(map);
        }
        m mVar = this.f8762i;
        T(mVar);
        mVar.g0();
        try {
            m mVar2 = this.f8762i;
            T(mVar2);
            a1 w02 = mVar2.w0(str);
            if (i3 != 200 && i3 != 204) {
                if (i3 == 304) {
                    i3 = 304;
                }
                z10 = false;
                if (w02 == null) {
                    b().f9053w.b(v0.A(str), "App does not exist in onConfigFetched. appId");
                } else {
                    k1 k1Var = this.f8760d;
                    if (z10 || i3 == 404) {
                        j0();
                        String D = l4.D("Last-Modified", map);
                        j0();
                        String D2 = l4.D("ETag", map);
                        if (i3 != 404 && i3 != 304) {
                            T(k1Var);
                            k1Var.G(str, bArr, D, D2);
                            f().getClass();
                            w02.f(System.currentTimeMillis());
                            m mVar3 = this.f8762i;
                            T(mVar3);
                            mVar3.x0(w02, false);
                            if (i3 != 404) {
                                b().f9055y.b(str, "Config not found. Using empty config. appId");
                            } else {
                                b().B.c(Integer.valueOf(i3), valueOf, "Successfully fetched config. Got network response. code, size");
                            }
                            T(z0Var);
                            if (z0Var.w() || !M()) {
                                T(z0Var);
                                if (z0Var.w()) {
                                    m mVar4 = this.f8762i;
                                    T(mVar4);
                                    if (mVar4.y(w02.E())) {
                                        t(w02.E());
                                    }
                                }
                                N();
                            } else {
                                q();
                            }
                        }
                        T(k1Var);
                        if (k1Var.E(str) == null) {
                            T(k1Var);
                            k1Var.G(str, null, null, null);
                        }
                        f().getClass();
                        w02.f(System.currentTimeMillis());
                        m mVar32 = this.f8762i;
                        T(mVar32);
                        mVar32.x0(w02, false);
                        if (i3 != 404) {
                        }
                        T(z0Var);
                        if (z0Var.w()) {
                        }
                        T(z0Var);
                        if (z0Var.w()) {
                        }
                        N();
                    } else {
                        f().getClass();
                        w02.g(System.currentTimeMillis());
                        m mVar5 = this.f8762i;
                        T(mVar5);
                        mVar5.x0(w02, false);
                        b().B.c(Integer.valueOf(i3), th, "Fetching config failed. code, error");
                        T(k1Var);
                        k1Var.s();
                        k1Var.B.put(str, null);
                        d1 d1Var = this.f8768w.f8879w;
                        f().getClass();
                        d1Var.b(System.currentTimeMillis());
                        if (i3 == 503 || i3 == 429) {
                            d1 d1Var2 = this.f8768w.f8877u;
                            f().getClass();
                            d1Var2.b(System.currentTimeMillis());
                        }
                        N();
                    }
                }
                m mVar6 = this.f8762i;
                T(mVar6);
                mVar6.h0();
                this.H = false;
                O();
            }
            if (th == null) {
                z10 = true;
                if (w02 == null) {
                }
                m mVar62 = this.f8762i;
                T(mVar62);
                mVar62.h0();
                this.H = false;
                O();
            }
            z10 = false;
            if (w02 == null) {
            }
            m mVar622 = this.f8762i;
            T(mVar622);
            mVar622.h0();
            this.H = false;
            O();
        } finally {
            m mVar7 = this.f8762i;
            T(mVar7);
            mVar7.i0();
        }
    }

    public final int F(String str, l.d dVar) {
        z1 w6;
        k1 k1Var = this.f8760d;
        v7 O = k1Var.O(str);
        b2 b2Var = b2.AD_PERSONALIZATION;
        if (O == null) {
            dVar.H(b2Var, h.FAILSAFE);
            return 1;
        }
        m mVar = this.f8762i;
        T(mVar);
        a1 w02 = mVar.w0(str);
        if (w02 == null || ((z1) l.d.F(w02.s()).f5643e) != z1.POLICY || (w6 = k1Var.w(str, b2Var)) == z1.UNINITIALIZED) {
            dVar.H(b2Var, h.REMOTE_DEFAULT);
            if (k1Var.N(str, b2Var)) {
                return 0;
            }
        } else {
            dVar.H(b2Var, h.REMOTE_ENFORCED_DEFAULT);
            if (w6 == z1.GRANTED) {
                return 0;
            }
        }
        return 1;
    }

    public final HashMap G(w8 w8Var) {
        Serializable K;
        HashMap hashMap = new HashMap();
        j0();
        HashMap hashMap2 = new HashMap();
        for (z8 z8Var : w8Var.v()) {
            if (z8Var.u().startsWith("gad_") && (K = l4.K(z8Var)) != null) {
                hashMap2.put(z8Var.u(), K);
            }
        }
        for (Map.Entry entry : hashMap2.entrySet()) {
            hashMap.put((String) entry.getKey(), String.valueOf(entry.getValue()));
        }
        return hashMap;
    }

    public final void H() {
        d().s();
        if (this.E.isEmpty()) {
            return;
        }
        if (this.V == null) {
            this.V = new r3(this, this.f8771z, 2);
        }
        if (this.V.f8861c != 0) {
            return;
        }
        f().getClass();
        long max = Math.max(0L, ((Integer) e0.A0.a(null)).intValue() - (SystemClock.elapsedRealtime() - this.W));
        b().B.b(Long.valueOf(max), "Scheduling notify next app runnable, delay in ms");
        if (this.V == null) {
            this.V = new r3(this, this.f8771z, 2);
        }
        this.V.b(max);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x04d5 A[Catch: all -> 0x0125, TryCatch #1 {all -> 0x0125, blocks: (B:3:0x0019, B:5:0x0035, B:7:0x003e, B:8:0x005e, B:11:0x007a, B:14:0x00a6, B:16:0x00e5, B:19:0x00fe, B:21:0x0108, B:24:0x074f, B:25:0x0135, B:28:0x014b, B:30:0x0151, B:32:0x0157, B:34:0x016a, B:37:0x0177, B:39:0x0182, B:41:0x0190, B:43:0x0196, B:46:0x01a1, B:48:0x01af, B:50:0x01c1, B:53:0x01e1, B:55:0x01e7, B:57:0x01f7, B:59:0x0205, B:61:0x0215, B:63:0x0220, B:68:0x0223, B:70:0x0230, B:72:0x023a, B:73:0x024a, B:75:0x0269, B:77:0x0273, B:79:0x0289, B:80:0x0293, B:83:0x029e, B:84:0x02a8, B:87:0x02b0, B:89:0x02c1, B:93:0x02c4, B:95:0x02db, B:102:0x04d5, B:103:0x04d8, B:105:0x04e4, B:108:0x04f5, B:110:0x0506, B:112:0x0512, B:113:0x05dd, B:115:0x05ea, B:117:0x05f0, B:119:0x05f6, B:121:0x0606, B:122:0x0609, B:123:0x0615, B:125:0x061b, B:126:0x0627, B:128:0x062d, B:130:0x063d, B:132:0x0647, B:133:0x065c, B:135:0x0662, B:136:0x067d, B:138:0x0683, B:140:0x06a1, B:142:0x06ae, B:144:0x06d7, B:145:0x06b4, B:147:0x06c2, B:151:0x06df, B:152:0x06fe, B:154:0x0704, B:157:0x0717, B:162:0x0724, B:164:0x072b, B:166:0x073b, B:174:0x0535, B:176:0x0545, B:179:0x0558, B:181:0x056a, B:183:0x0576, B:185:0x058a, B:188:0x0598, B:190:0x05a2, B:192:0x05ac, B:195:0x05b7, B:197:0x05bd, B:201:0x05cd, B:199:0x05d8, B:204:0x0301, B:207:0x030b, B:209:0x0319, B:211:0x036a, B:212:0x033b, B:214:0x0349, B:220:0x0371, B:222:0x03a4, B:223:0x03cc, B:225:0x0401, B:226:0x0407, B:229:0x0413, B:231:0x0448, B:232:0x0465, B:234:0x046b, B:236:0x0479, B:238:0x048d, B:239:0x0481, B:247:0x0494, B:250:0x049b, B:251:0x04ba, B:258:0x0766, B:260:0x0778, B:262:0x0781, B:264:0x07b3, B:265:0x0789, B:267:0x0792, B:269:0x0798, B:271:0x07a4, B:273:0x07ae, B:280:0x07b6, B:281:0x07c2, B:284:0x07ca, B:287:0x07dc, B:288:0x07e7, B:290:0x07ef, B:291:0x081e, B:293:0x083a, B:294:0x084f, B:296:0x086b, B:297:0x0880, B:298:0x089c, B:300:0x08a2, B:302:0x08ba, B:303:0x08c8, B:305:0x08d8, B:307:0x08e6, B:310:0x08e9, B:312:0x0933, B:314:0x0939, B:315:0x0964, B:317:0x096c, B:318:0x098a, B:320:0x0990, B:321:0x09a4, B:323:0x09bb, B:325:0x09d5, B:327:0x09e7, B:329:0x09f1, B:330:0x09f4, B:332:0x0a4f, B:333:0x0a62, B:336:0x0a6a, B:339:0x0a89, B:341:0x0aa2, B:343:0x0ab7, B:345:0x0abc, B:347:0x0ac0, B:349:0x0ac4, B:351:0x0ace, B:352:0x0ad7, B:354:0x0adb, B:356:0x0ae1, B:357:0x0aec, B:358:0x0afa, B:361:0x0d5b, B:365:0x0b02, B:430:0x0b1e, B:368:0x0b3b, B:370:0x0b5b, B:371:0x0b63, B:373:0x0b69, B:377:0x0b7b, B:380:0x0b91, B:382:0x0ba7, B:383:0x0bca, B:385:0x0bd6, B:387:0x0bec, B:388:0x0c2c, B:393:0x0c48, B:395:0x0c53, B:397:0x0c57, B:399:0x0c5b, B:401:0x0c5f, B:402:0x0c6b, B:403:0x0c70, B:405:0x0c76, B:407:0x0c8c, B:408:0x0c91, B:410:0x0d58, B:412:0x0cd0, B:414:0x0cd4, B:417:0x0ce8, B:419:0x0d04, B:420:0x0d0b, B:423:0x0d4c, B:424:0x0cd9, B:433:0x0b24, B:435:0x0d61, B:437:0x0d6b, B:438:0x0d7f, B:439:0x0d87, B:441:0x0d8d, B:443:0x0da1, B:445:0x0db3, B:446:0x0e66, B:448:0x0e6c, B:450:0x0e83, B:453:0x0e8e, B:455:0x0e98, B:457:0x0ebf, B:459:0x0ecf, B:460:0x0ed9, B:462:0x0ee7, B:463:0x0ef1, B:464:0x0efc, B:466:0x0f0e, B:469:0x0f15, B:470:0x0f58, B:471:0x0f24, B:473:0x0f32, B:474:0x0f3f, B:475:0x0f67, B:477:0x0f7a, B:478:0x0f9a, B:484:0x0f85, B:485:0x0dce, B:487:0x0dd4, B:489:0x0de6, B:490:0x0ded, B:495:0x0e05, B:496:0x0e0c, B:498:0x0e57, B:499:0x0e5e, B:500:0x0e5b, B:501:0x0e09, B:503:0x0dea, B:504:0x0949, B:506:0x094f, B:508:0x0955, B:509:0x087d, B:510:0x084c, B:511:0x07f5, B:513:0x07fb, B:517:0x0fa3), top: B:2:0x0019, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x04e4 A[Catch: all -> 0x0125, TryCatch #1 {all -> 0x0125, blocks: (B:3:0x0019, B:5:0x0035, B:7:0x003e, B:8:0x005e, B:11:0x007a, B:14:0x00a6, B:16:0x00e5, B:19:0x00fe, B:21:0x0108, B:24:0x074f, B:25:0x0135, B:28:0x014b, B:30:0x0151, B:32:0x0157, B:34:0x016a, B:37:0x0177, B:39:0x0182, B:41:0x0190, B:43:0x0196, B:46:0x01a1, B:48:0x01af, B:50:0x01c1, B:53:0x01e1, B:55:0x01e7, B:57:0x01f7, B:59:0x0205, B:61:0x0215, B:63:0x0220, B:68:0x0223, B:70:0x0230, B:72:0x023a, B:73:0x024a, B:75:0x0269, B:77:0x0273, B:79:0x0289, B:80:0x0293, B:83:0x029e, B:84:0x02a8, B:87:0x02b0, B:89:0x02c1, B:93:0x02c4, B:95:0x02db, B:102:0x04d5, B:103:0x04d8, B:105:0x04e4, B:108:0x04f5, B:110:0x0506, B:112:0x0512, B:113:0x05dd, B:115:0x05ea, B:117:0x05f0, B:119:0x05f6, B:121:0x0606, B:122:0x0609, B:123:0x0615, B:125:0x061b, B:126:0x0627, B:128:0x062d, B:130:0x063d, B:132:0x0647, B:133:0x065c, B:135:0x0662, B:136:0x067d, B:138:0x0683, B:140:0x06a1, B:142:0x06ae, B:144:0x06d7, B:145:0x06b4, B:147:0x06c2, B:151:0x06df, B:152:0x06fe, B:154:0x0704, B:157:0x0717, B:162:0x0724, B:164:0x072b, B:166:0x073b, B:174:0x0535, B:176:0x0545, B:179:0x0558, B:181:0x056a, B:183:0x0576, B:185:0x058a, B:188:0x0598, B:190:0x05a2, B:192:0x05ac, B:195:0x05b7, B:197:0x05bd, B:201:0x05cd, B:199:0x05d8, B:204:0x0301, B:207:0x030b, B:209:0x0319, B:211:0x036a, B:212:0x033b, B:214:0x0349, B:220:0x0371, B:222:0x03a4, B:223:0x03cc, B:225:0x0401, B:226:0x0407, B:229:0x0413, B:231:0x0448, B:232:0x0465, B:234:0x046b, B:236:0x0479, B:238:0x048d, B:239:0x0481, B:247:0x0494, B:250:0x049b, B:251:0x04ba, B:258:0x0766, B:260:0x0778, B:262:0x0781, B:264:0x07b3, B:265:0x0789, B:267:0x0792, B:269:0x0798, B:271:0x07a4, B:273:0x07ae, B:280:0x07b6, B:281:0x07c2, B:284:0x07ca, B:287:0x07dc, B:288:0x07e7, B:290:0x07ef, B:291:0x081e, B:293:0x083a, B:294:0x084f, B:296:0x086b, B:297:0x0880, B:298:0x089c, B:300:0x08a2, B:302:0x08ba, B:303:0x08c8, B:305:0x08d8, B:307:0x08e6, B:310:0x08e9, B:312:0x0933, B:314:0x0939, B:315:0x0964, B:317:0x096c, B:318:0x098a, B:320:0x0990, B:321:0x09a4, B:323:0x09bb, B:325:0x09d5, B:327:0x09e7, B:329:0x09f1, B:330:0x09f4, B:332:0x0a4f, B:333:0x0a62, B:336:0x0a6a, B:339:0x0a89, B:341:0x0aa2, B:343:0x0ab7, B:345:0x0abc, B:347:0x0ac0, B:349:0x0ac4, B:351:0x0ace, B:352:0x0ad7, B:354:0x0adb, B:356:0x0ae1, B:357:0x0aec, B:358:0x0afa, B:361:0x0d5b, B:365:0x0b02, B:430:0x0b1e, B:368:0x0b3b, B:370:0x0b5b, B:371:0x0b63, B:373:0x0b69, B:377:0x0b7b, B:380:0x0b91, B:382:0x0ba7, B:383:0x0bca, B:385:0x0bd6, B:387:0x0bec, B:388:0x0c2c, B:393:0x0c48, B:395:0x0c53, B:397:0x0c57, B:399:0x0c5b, B:401:0x0c5f, B:402:0x0c6b, B:403:0x0c70, B:405:0x0c76, B:407:0x0c8c, B:408:0x0c91, B:410:0x0d58, B:412:0x0cd0, B:414:0x0cd4, B:417:0x0ce8, B:419:0x0d04, B:420:0x0d0b, B:423:0x0d4c, B:424:0x0cd9, B:433:0x0b24, B:435:0x0d61, B:437:0x0d6b, B:438:0x0d7f, B:439:0x0d87, B:441:0x0d8d, B:443:0x0da1, B:445:0x0db3, B:446:0x0e66, B:448:0x0e6c, B:450:0x0e83, B:453:0x0e8e, B:455:0x0e98, B:457:0x0ebf, B:459:0x0ecf, B:460:0x0ed9, B:462:0x0ee7, B:463:0x0ef1, B:464:0x0efc, B:466:0x0f0e, B:469:0x0f15, B:470:0x0f58, B:471:0x0f24, B:473:0x0f32, B:474:0x0f3f, B:475:0x0f67, B:477:0x0f7a, B:478:0x0f9a, B:484:0x0f85, B:485:0x0dce, B:487:0x0dd4, B:489:0x0de6, B:490:0x0ded, B:495:0x0e05, B:496:0x0e0c, B:498:0x0e57, B:499:0x0e5e, B:500:0x0e5b, B:501:0x0e09, B:503:0x0dea, B:504:0x0949, B:506:0x094f, B:508:0x0955, B:509:0x087d, B:510:0x084c, B:511:0x07f5, B:513:0x07fb, B:517:0x0fa3), top: B:2:0x0019, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x05ea A[Catch: all -> 0x0125, TryCatch #1 {all -> 0x0125, blocks: (B:3:0x0019, B:5:0x0035, B:7:0x003e, B:8:0x005e, B:11:0x007a, B:14:0x00a6, B:16:0x00e5, B:19:0x00fe, B:21:0x0108, B:24:0x074f, B:25:0x0135, B:28:0x014b, B:30:0x0151, B:32:0x0157, B:34:0x016a, B:37:0x0177, B:39:0x0182, B:41:0x0190, B:43:0x0196, B:46:0x01a1, B:48:0x01af, B:50:0x01c1, B:53:0x01e1, B:55:0x01e7, B:57:0x01f7, B:59:0x0205, B:61:0x0215, B:63:0x0220, B:68:0x0223, B:70:0x0230, B:72:0x023a, B:73:0x024a, B:75:0x0269, B:77:0x0273, B:79:0x0289, B:80:0x0293, B:83:0x029e, B:84:0x02a8, B:87:0x02b0, B:89:0x02c1, B:93:0x02c4, B:95:0x02db, B:102:0x04d5, B:103:0x04d8, B:105:0x04e4, B:108:0x04f5, B:110:0x0506, B:112:0x0512, B:113:0x05dd, B:115:0x05ea, B:117:0x05f0, B:119:0x05f6, B:121:0x0606, B:122:0x0609, B:123:0x0615, B:125:0x061b, B:126:0x0627, B:128:0x062d, B:130:0x063d, B:132:0x0647, B:133:0x065c, B:135:0x0662, B:136:0x067d, B:138:0x0683, B:140:0x06a1, B:142:0x06ae, B:144:0x06d7, B:145:0x06b4, B:147:0x06c2, B:151:0x06df, B:152:0x06fe, B:154:0x0704, B:157:0x0717, B:162:0x0724, B:164:0x072b, B:166:0x073b, B:174:0x0535, B:176:0x0545, B:179:0x0558, B:181:0x056a, B:183:0x0576, B:185:0x058a, B:188:0x0598, B:190:0x05a2, B:192:0x05ac, B:195:0x05b7, B:197:0x05bd, B:201:0x05cd, B:199:0x05d8, B:204:0x0301, B:207:0x030b, B:209:0x0319, B:211:0x036a, B:212:0x033b, B:214:0x0349, B:220:0x0371, B:222:0x03a4, B:223:0x03cc, B:225:0x0401, B:226:0x0407, B:229:0x0413, B:231:0x0448, B:232:0x0465, B:234:0x046b, B:236:0x0479, B:238:0x048d, B:239:0x0481, B:247:0x0494, B:250:0x049b, B:251:0x04ba, B:258:0x0766, B:260:0x0778, B:262:0x0781, B:264:0x07b3, B:265:0x0789, B:267:0x0792, B:269:0x0798, B:271:0x07a4, B:273:0x07ae, B:280:0x07b6, B:281:0x07c2, B:284:0x07ca, B:287:0x07dc, B:288:0x07e7, B:290:0x07ef, B:291:0x081e, B:293:0x083a, B:294:0x084f, B:296:0x086b, B:297:0x0880, B:298:0x089c, B:300:0x08a2, B:302:0x08ba, B:303:0x08c8, B:305:0x08d8, B:307:0x08e6, B:310:0x08e9, B:312:0x0933, B:314:0x0939, B:315:0x0964, B:317:0x096c, B:318:0x098a, B:320:0x0990, B:321:0x09a4, B:323:0x09bb, B:325:0x09d5, B:327:0x09e7, B:329:0x09f1, B:330:0x09f4, B:332:0x0a4f, B:333:0x0a62, B:336:0x0a6a, B:339:0x0a89, B:341:0x0aa2, B:343:0x0ab7, B:345:0x0abc, B:347:0x0ac0, B:349:0x0ac4, B:351:0x0ace, B:352:0x0ad7, B:354:0x0adb, B:356:0x0ae1, B:357:0x0aec, B:358:0x0afa, B:361:0x0d5b, B:365:0x0b02, B:430:0x0b1e, B:368:0x0b3b, B:370:0x0b5b, B:371:0x0b63, B:373:0x0b69, B:377:0x0b7b, B:380:0x0b91, B:382:0x0ba7, B:383:0x0bca, B:385:0x0bd6, B:387:0x0bec, B:388:0x0c2c, B:393:0x0c48, B:395:0x0c53, B:397:0x0c57, B:399:0x0c5b, B:401:0x0c5f, B:402:0x0c6b, B:403:0x0c70, B:405:0x0c76, B:407:0x0c8c, B:408:0x0c91, B:410:0x0d58, B:412:0x0cd0, B:414:0x0cd4, B:417:0x0ce8, B:419:0x0d04, B:420:0x0d0b, B:423:0x0d4c, B:424:0x0cd9, B:433:0x0b24, B:435:0x0d61, B:437:0x0d6b, B:438:0x0d7f, B:439:0x0d87, B:441:0x0d8d, B:443:0x0da1, B:445:0x0db3, B:446:0x0e66, B:448:0x0e6c, B:450:0x0e83, B:453:0x0e8e, B:455:0x0e98, B:457:0x0ebf, B:459:0x0ecf, B:460:0x0ed9, B:462:0x0ee7, B:463:0x0ef1, B:464:0x0efc, B:466:0x0f0e, B:469:0x0f15, B:470:0x0f58, B:471:0x0f24, B:473:0x0f32, B:474:0x0f3f, B:475:0x0f67, B:477:0x0f7a, B:478:0x0f9a, B:484:0x0f85, B:485:0x0dce, B:487:0x0dd4, B:489:0x0de6, B:490:0x0ded, B:495:0x0e05, B:496:0x0e0c, B:498:0x0e57, B:499:0x0e5e, B:500:0x0e5b, B:501:0x0e09, B:503:0x0dea, B:504:0x0949, B:506:0x094f, B:508:0x0955, B:509:0x087d, B:510:0x084c, B:511:0x07f5, B:513:0x07fb, B:517:0x0fa3), top: B:2:0x0019, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0606 A[Catch: all -> 0x0125, TryCatch #1 {all -> 0x0125, blocks: (B:3:0x0019, B:5:0x0035, B:7:0x003e, B:8:0x005e, B:11:0x007a, B:14:0x00a6, B:16:0x00e5, B:19:0x00fe, B:21:0x0108, B:24:0x074f, B:25:0x0135, B:28:0x014b, B:30:0x0151, B:32:0x0157, B:34:0x016a, B:37:0x0177, B:39:0x0182, B:41:0x0190, B:43:0x0196, B:46:0x01a1, B:48:0x01af, B:50:0x01c1, B:53:0x01e1, B:55:0x01e7, B:57:0x01f7, B:59:0x0205, B:61:0x0215, B:63:0x0220, B:68:0x0223, B:70:0x0230, B:72:0x023a, B:73:0x024a, B:75:0x0269, B:77:0x0273, B:79:0x0289, B:80:0x0293, B:83:0x029e, B:84:0x02a8, B:87:0x02b0, B:89:0x02c1, B:93:0x02c4, B:95:0x02db, B:102:0x04d5, B:103:0x04d8, B:105:0x04e4, B:108:0x04f5, B:110:0x0506, B:112:0x0512, B:113:0x05dd, B:115:0x05ea, B:117:0x05f0, B:119:0x05f6, B:121:0x0606, B:122:0x0609, B:123:0x0615, B:125:0x061b, B:126:0x0627, B:128:0x062d, B:130:0x063d, B:132:0x0647, B:133:0x065c, B:135:0x0662, B:136:0x067d, B:138:0x0683, B:140:0x06a1, B:142:0x06ae, B:144:0x06d7, B:145:0x06b4, B:147:0x06c2, B:151:0x06df, B:152:0x06fe, B:154:0x0704, B:157:0x0717, B:162:0x0724, B:164:0x072b, B:166:0x073b, B:174:0x0535, B:176:0x0545, B:179:0x0558, B:181:0x056a, B:183:0x0576, B:185:0x058a, B:188:0x0598, B:190:0x05a2, B:192:0x05ac, B:195:0x05b7, B:197:0x05bd, B:201:0x05cd, B:199:0x05d8, B:204:0x0301, B:207:0x030b, B:209:0x0319, B:211:0x036a, B:212:0x033b, B:214:0x0349, B:220:0x0371, B:222:0x03a4, B:223:0x03cc, B:225:0x0401, B:226:0x0407, B:229:0x0413, B:231:0x0448, B:232:0x0465, B:234:0x046b, B:236:0x0479, B:238:0x048d, B:239:0x0481, B:247:0x0494, B:250:0x049b, B:251:0x04ba, B:258:0x0766, B:260:0x0778, B:262:0x0781, B:264:0x07b3, B:265:0x0789, B:267:0x0792, B:269:0x0798, B:271:0x07a4, B:273:0x07ae, B:280:0x07b6, B:281:0x07c2, B:284:0x07ca, B:287:0x07dc, B:288:0x07e7, B:290:0x07ef, B:291:0x081e, B:293:0x083a, B:294:0x084f, B:296:0x086b, B:297:0x0880, B:298:0x089c, B:300:0x08a2, B:302:0x08ba, B:303:0x08c8, B:305:0x08d8, B:307:0x08e6, B:310:0x08e9, B:312:0x0933, B:314:0x0939, B:315:0x0964, B:317:0x096c, B:318:0x098a, B:320:0x0990, B:321:0x09a4, B:323:0x09bb, B:325:0x09d5, B:327:0x09e7, B:329:0x09f1, B:330:0x09f4, B:332:0x0a4f, B:333:0x0a62, B:336:0x0a6a, B:339:0x0a89, B:341:0x0aa2, B:343:0x0ab7, B:345:0x0abc, B:347:0x0ac0, B:349:0x0ac4, B:351:0x0ace, B:352:0x0ad7, B:354:0x0adb, B:356:0x0ae1, B:357:0x0aec, B:358:0x0afa, B:361:0x0d5b, B:365:0x0b02, B:430:0x0b1e, B:368:0x0b3b, B:370:0x0b5b, B:371:0x0b63, B:373:0x0b69, B:377:0x0b7b, B:380:0x0b91, B:382:0x0ba7, B:383:0x0bca, B:385:0x0bd6, B:387:0x0bec, B:388:0x0c2c, B:393:0x0c48, B:395:0x0c53, B:397:0x0c57, B:399:0x0c5b, B:401:0x0c5f, B:402:0x0c6b, B:403:0x0c70, B:405:0x0c76, B:407:0x0c8c, B:408:0x0c91, B:410:0x0d58, B:412:0x0cd0, B:414:0x0cd4, B:417:0x0ce8, B:419:0x0d04, B:420:0x0d0b, B:423:0x0d4c, B:424:0x0cd9, B:433:0x0b24, B:435:0x0d61, B:437:0x0d6b, B:438:0x0d7f, B:439:0x0d87, B:441:0x0d8d, B:443:0x0da1, B:445:0x0db3, B:446:0x0e66, B:448:0x0e6c, B:450:0x0e83, B:453:0x0e8e, B:455:0x0e98, B:457:0x0ebf, B:459:0x0ecf, B:460:0x0ed9, B:462:0x0ee7, B:463:0x0ef1, B:464:0x0efc, B:466:0x0f0e, B:469:0x0f15, B:470:0x0f58, B:471:0x0f24, B:473:0x0f32, B:474:0x0f3f, B:475:0x0f67, B:477:0x0f7a, B:478:0x0f9a, B:484:0x0f85, B:485:0x0dce, B:487:0x0dd4, B:489:0x0de6, B:490:0x0ded, B:495:0x0e05, B:496:0x0e0c, B:498:0x0e57, B:499:0x0e5e, B:500:0x0e5b, B:501:0x0e09, B:503:0x0dea, B:504:0x0949, B:506:0x094f, B:508:0x0955, B:509:0x087d, B:510:0x084c, B:511:0x07f5, B:513:0x07fb, B:517:0x0fa3), top: B:2:0x0019, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x061b A[Catch: all -> 0x0125, TryCatch #1 {all -> 0x0125, blocks: (B:3:0x0019, B:5:0x0035, B:7:0x003e, B:8:0x005e, B:11:0x007a, B:14:0x00a6, B:16:0x00e5, B:19:0x00fe, B:21:0x0108, B:24:0x074f, B:25:0x0135, B:28:0x014b, B:30:0x0151, B:32:0x0157, B:34:0x016a, B:37:0x0177, B:39:0x0182, B:41:0x0190, B:43:0x0196, B:46:0x01a1, B:48:0x01af, B:50:0x01c1, B:53:0x01e1, B:55:0x01e7, B:57:0x01f7, B:59:0x0205, B:61:0x0215, B:63:0x0220, B:68:0x0223, B:70:0x0230, B:72:0x023a, B:73:0x024a, B:75:0x0269, B:77:0x0273, B:79:0x0289, B:80:0x0293, B:83:0x029e, B:84:0x02a8, B:87:0x02b0, B:89:0x02c1, B:93:0x02c4, B:95:0x02db, B:102:0x04d5, B:103:0x04d8, B:105:0x04e4, B:108:0x04f5, B:110:0x0506, B:112:0x0512, B:113:0x05dd, B:115:0x05ea, B:117:0x05f0, B:119:0x05f6, B:121:0x0606, B:122:0x0609, B:123:0x0615, B:125:0x061b, B:126:0x0627, B:128:0x062d, B:130:0x063d, B:132:0x0647, B:133:0x065c, B:135:0x0662, B:136:0x067d, B:138:0x0683, B:140:0x06a1, B:142:0x06ae, B:144:0x06d7, B:145:0x06b4, B:147:0x06c2, B:151:0x06df, B:152:0x06fe, B:154:0x0704, B:157:0x0717, B:162:0x0724, B:164:0x072b, B:166:0x073b, B:174:0x0535, B:176:0x0545, B:179:0x0558, B:181:0x056a, B:183:0x0576, B:185:0x058a, B:188:0x0598, B:190:0x05a2, B:192:0x05ac, B:195:0x05b7, B:197:0x05bd, B:201:0x05cd, B:199:0x05d8, B:204:0x0301, B:207:0x030b, B:209:0x0319, B:211:0x036a, B:212:0x033b, B:214:0x0349, B:220:0x0371, B:222:0x03a4, B:223:0x03cc, B:225:0x0401, B:226:0x0407, B:229:0x0413, B:231:0x0448, B:232:0x0465, B:234:0x046b, B:236:0x0479, B:238:0x048d, B:239:0x0481, B:247:0x0494, B:250:0x049b, B:251:0x04ba, B:258:0x0766, B:260:0x0778, B:262:0x0781, B:264:0x07b3, B:265:0x0789, B:267:0x0792, B:269:0x0798, B:271:0x07a4, B:273:0x07ae, B:280:0x07b6, B:281:0x07c2, B:284:0x07ca, B:287:0x07dc, B:288:0x07e7, B:290:0x07ef, B:291:0x081e, B:293:0x083a, B:294:0x084f, B:296:0x086b, B:297:0x0880, B:298:0x089c, B:300:0x08a2, B:302:0x08ba, B:303:0x08c8, B:305:0x08d8, B:307:0x08e6, B:310:0x08e9, B:312:0x0933, B:314:0x0939, B:315:0x0964, B:317:0x096c, B:318:0x098a, B:320:0x0990, B:321:0x09a4, B:323:0x09bb, B:325:0x09d5, B:327:0x09e7, B:329:0x09f1, B:330:0x09f4, B:332:0x0a4f, B:333:0x0a62, B:336:0x0a6a, B:339:0x0a89, B:341:0x0aa2, B:343:0x0ab7, B:345:0x0abc, B:347:0x0ac0, B:349:0x0ac4, B:351:0x0ace, B:352:0x0ad7, B:354:0x0adb, B:356:0x0ae1, B:357:0x0aec, B:358:0x0afa, B:361:0x0d5b, B:365:0x0b02, B:430:0x0b1e, B:368:0x0b3b, B:370:0x0b5b, B:371:0x0b63, B:373:0x0b69, B:377:0x0b7b, B:380:0x0b91, B:382:0x0ba7, B:383:0x0bca, B:385:0x0bd6, B:387:0x0bec, B:388:0x0c2c, B:393:0x0c48, B:395:0x0c53, B:397:0x0c57, B:399:0x0c5b, B:401:0x0c5f, B:402:0x0c6b, B:403:0x0c70, B:405:0x0c76, B:407:0x0c8c, B:408:0x0c91, B:410:0x0d58, B:412:0x0cd0, B:414:0x0cd4, B:417:0x0ce8, B:419:0x0d04, B:420:0x0d0b, B:423:0x0d4c, B:424:0x0cd9, B:433:0x0b24, B:435:0x0d61, B:437:0x0d6b, B:438:0x0d7f, B:439:0x0d87, B:441:0x0d8d, B:443:0x0da1, B:445:0x0db3, B:446:0x0e66, B:448:0x0e6c, B:450:0x0e83, B:453:0x0e8e, B:455:0x0e98, B:457:0x0ebf, B:459:0x0ecf, B:460:0x0ed9, B:462:0x0ee7, B:463:0x0ef1, B:464:0x0efc, B:466:0x0f0e, B:469:0x0f15, B:470:0x0f58, B:471:0x0f24, B:473:0x0f32, B:474:0x0f3f, B:475:0x0f67, B:477:0x0f7a, B:478:0x0f9a, B:484:0x0f85, B:485:0x0dce, B:487:0x0dd4, B:489:0x0de6, B:490:0x0ded, B:495:0x0e05, B:496:0x0e0c, B:498:0x0e57, B:499:0x0e5e, B:500:0x0e5b, B:501:0x0e09, B:503:0x0dea, B:504:0x0949, B:506:0x094f, B:508:0x0955, B:509:0x087d, B:510:0x084c, B:511:0x07f5, B:513:0x07fb, B:517:0x0fa3), top: B:2:0x0019, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0737  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0535 A[Catch: all -> 0x0125, TryCatch #1 {all -> 0x0125, blocks: (B:3:0x0019, B:5:0x0035, B:7:0x003e, B:8:0x005e, B:11:0x007a, B:14:0x00a6, B:16:0x00e5, B:19:0x00fe, B:21:0x0108, B:24:0x074f, B:25:0x0135, B:28:0x014b, B:30:0x0151, B:32:0x0157, B:34:0x016a, B:37:0x0177, B:39:0x0182, B:41:0x0190, B:43:0x0196, B:46:0x01a1, B:48:0x01af, B:50:0x01c1, B:53:0x01e1, B:55:0x01e7, B:57:0x01f7, B:59:0x0205, B:61:0x0215, B:63:0x0220, B:68:0x0223, B:70:0x0230, B:72:0x023a, B:73:0x024a, B:75:0x0269, B:77:0x0273, B:79:0x0289, B:80:0x0293, B:83:0x029e, B:84:0x02a8, B:87:0x02b0, B:89:0x02c1, B:93:0x02c4, B:95:0x02db, B:102:0x04d5, B:103:0x04d8, B:105:0x04e4, B:108:0x04f5, B:110:0x0506, B:112:0x0512, B:113:0x05dd, B:115:0x05ea, B:117:0x05f0, B:119:0x05f6, B:121:0x0606, B:122:0x0609, B:123:0x0615, B:125:0x061b, B:126:0x0627, B:128:0x062d, B:130:0x063d, B:132:0x0647, B:133:0x065c, B:135:0x0662, B:136:0x067d, B:138:0x0683, B:140:0x06a1, B:142:0x06ae, B:144:0x06d7, B:145:0x06b4, B:147:0x06c2, B:151:0x06df, B:152:0x06fe, B:154:0x0704, B:157:0x0717, B:162:0x0724, B:164:0x072b, B:166:0x073b, B:174:0x0535, B:176:0x0545, B:179:0x0558, B:181:0x056a, B:183:0x0576, B:185:0x058a, B:188:0x0598, B:190:0x05a2, B:192:0x05ac, B:195:0x05b7, B:197:0x05bd, B:201:0x05cd, B:199:0x05d8, B:204:0x0301, B:207:0x030b, B:209:0x0319, B:211:0x036a, B:212:0x033b, B:214:0x0349, B:220:0x0371, B:222:0x03a4, B:223:0x03cc, B:225:0x0401, B:226:0x0407, B:229:0x0413, B:231:0x0448, B:232:0x0465, B:234:0x046b, B:236:0x0479, B:238:0x048d, B:239:0x0481, B:247:0x0494, B:250:0x049b, B:251:0x04ba, B:258:0x0766, B:260:0x0778, B:262:0x0781, B:264:0x07b3, B:265:0x0789, B:267:0x0792, B:269:0x0798, B:271:0x07a4, B:273:0x07ae, B:280:0x07b6, B:281:0x07c2, B:284:0x07ca, B:287:0x07dc, B:288:0x07e7, B:290:0x07ef, B:291:0x081e, B:293:0x083a, B:294:0x084f, B:296:0x086b, B:297:0x0880, B:298:0x089c, B:300:0x08a2, B:302:0x08ba, B:303:0x08c8, B:305:0x08d8, B:307:0x08e6, B:310:0x08e9, B:312:0x0933, B:314:0x0939, B:315:0x0964, B:317:0x096c, B:318:0x098a, B:320:0x0990, B:321:0x09a4, B:323:0x09bb, B:325:0x09d5, B:327:0x09e7, B:329:0x09f1, B:330:0x09f4, B:332:0x0a4f, B:333:0x0a62, B:336:0x0a6a, B:339:0x0a89, B:341:0x0aa2, B:343:0x0ab7, B:345:0x0abc, B:347:0x0ac0, B:349:0x0ac4, B:351:0x0ace, B:352:0x0ad7, B:354:0x0adb, B:356:0x0ae1, B:357:0x0aec, B:358:0x0afa, B:361:0x0d5b, B:365:0x0b02, B:430:0x0b1e, B:368:0x0b3b, B:370:0x0b5b, B:371:0x0b63, B:373:0x0b69, B:377:0x0b7b, B:380:0x0b91, B:382:0x0ba7, B:383:0x0bca, B:385:0x0bd6, B:387:0x0bec, B:388:0x0c2c, B:393:0x0c48, B:395:0x0c53, B:397:0x0c57, B:399:0x0c5b, B:401:0x0c5f, B:402:0x0c6b, B:403:0x0c70, B:405:0x0c76, B:407:0x0c8c, B:408:0x0c91, B:410:0x0d58, B:412:0x0cd0, B:414:0x0cd4, B:417:0x0ce8, B:419:0x0d04, B:420:0x0d0b, B:423:0x0d4c, B:424:0x0cd9, B:433:0x0b24, B:435:0x0d61, B:437:0x0d6b, B:438:0x0d7f, B:439:0x0d87, B:441:0x0d8d, B:443:0x0da1, B:445:0x0db3, B:446:0x0e66, B:448:0x0e6c, B:450:0x0e83, B:453:0x0e8e, B:455:0x0e98, B:457:0x0ebf, B:459:0x0ecf, B:460:0x0ed9, B:462:0x0ee7, B:463:0x0ef1, B:464:0x0efc, B:466:0x0f0e, B:469:0x0f15, B:470:0x0f58, B:471:0x0f24, B:473:0x0f32, B:474:0x0f3f, B:475:0x0f67, B:477:0x0f7a, B:478:0x0f9a, B:484:0x0f85, B:485:0x0dce, B:487:0x0dd4, B:489:0x0de6, B:490:0x0ded, B:495:0x0e05, B:496:0x0e0c, B:498:0x0e57, B:499:0x0e5e, B:500:0x0e5b, B:501:0x0e09, B:503:0x0dea, B:504:0x0949, B:506:0x094f, B:508:0x0955, B:509:0x087d, B:510:0x084c, B:511:0x07f5, B:513:0x07fb, B:517:0x0fa3), top: B:2:0x0019, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x030b A[Catch: all -> 0x0125, TRY_ENTER, TryCatch #1 {all -> 0x0125, blocks: (B:3:0x0019, B:5:0x0035, B:7:0x003e, B:8:0x005e, B:11:0x007a, B:14:0x00a6, B:16:0x00e5, B:19:0x00fe, B:21:0x0108, B:24:0x074f, B:25:0x0135, B:28:0x014b, B:30:0x0151, B:32:0x0157, B:34:0x016a, B:37:0x0177, B:39:0x0182, B:41:0x0190, B:43:0x0196, B:46:0x01a1, B:48:0x01af, B:50:0x01c1, B:53:0x01e1, B:55:0x01e7, B:57:0x01f7, B:59:0x0205, B:61:0x0215, B:63:0x0220, B:68:0x0223, B:70:0x0230, B:72:0x023a, B:73:0x024a, B:75:0x0269, B:77:0x0273, B:79:0x0289, B:80:0x0293, B:83:0x029e, B:84:0x02a8, B:87:0x02b0, B:89:0x02c1, B:93:0x02c4, B:95:0x02db, B:102:0x04d5, B:103:0x04d8, B:105:0x04e4, B:108:0x04f5, B:110:0x0506, B:112:0x0512, B:113:0x05dd, B:115:0x05ea, B:117:0x05f0, B:119:0x05f6, B:121:0x0606, B:122:0x0609, B:123:0x0615, B:125:0x061b, B:126:0x0627, B:128:0x062d, B:130:0x063d, B:132:0x0647, B:133:0x065c, B:135:0x0662, B:136:0x067d, B:138:0x0683, B:140:0x06a1, B:142:0x06ae, B:144:0x06d7, B:145:0x06b4, B:147:0x06c2, B:151:0x06df, B:152:0x06fe, B:154:0x0704, B:157:0x0717, B:162:0x0724, B:164:0x072b, B:166:0x073b, B:174:0x0535, B:176:0x0545, B:179:0x0558, B:181:0x056a, B:183:0x0576, B:185:0x058a, B:188:0x0598, B:190:0x05a2, B:192:0x05ac, B:195:0x05b7, B:197:0x05bd, B:201:0x05cd, B:199:0x05d8, B:204:0x0301, B:207:0x030b, B:209:0x0319, B:211:0x036a, B:212:0x033b, B:214:0x0349, B:220:0x0371, B:222:0x03a4, B:223:0x03cc, B:225:0x0401, B:226:0x0407, B:229:0x0413, B:231:0x0448, B:232:0x0465, B:234:0x046b, B:236:0x0479, B:238:0x048d, B:239:0x0481, B:247:0x0494, B:250:0x049b, B:251:0x04ba, B:258:0x0766, B:260:0x0778, B:262:0x0781, B:264:0x07b3, B:265:0x0789, B:267:0x0792, B:269:0x0798, B:271:0x07a4, B:273:0x07ae, B:280:0x07b6, B:281:0x07c2, B:284:0x07ca, B:287:0x07dc, B:288:0x07e7, B:290:0x07ef, B:291:0x081e, B:293:0x083a, B:294:0x084f, B:296:0x086b, B:297:0x0880, B:298:0x089c, B:300:0x08a2, B:302:0x08ba, B:303:0x08c8, B:305:0x08d8, B:307:0x08e6, B:310:0x08e9, B:312:0x0933, B:314:0x0939, B:315:0x0964, B:317:0x096c, B:318:0x098a, B:320:0x0990, B:321:0x09a4, B:323:0x09bb, B:325:0x09d5, B:327:0x09e7, B:329:0x09f1, B:330:0x09f4, B:332:0x0a4f, B:333:0x0a62, B:336:0x0a6a, B:339:0x0a89, B:341:0x0aa2, B:343:0x0ab7, B:345:0x0abc, B:347:0x0ac0, B:349:0x0ac4, B:351:0x0ace, B:352:0x0ad7, B:354:0x0adb, B:356:0x0ae1, B:357:0x0aec, B:358:0x0afa, B:361:0x0d5b, B:365:0x0b02, B:430:0x0b1e, B:368:0x0b3b, B:370:0x0b5b, B:371:0x0b63, B:373:0x0b69, B:377:0x0b7b, B:380:0x0b91, B:382:0x0ba7, B:383:0x0bca, B:385:0x0bd6, B:387:0x0bec, B:388:0x0c2c, B:393:0x0c48, B:395:0x0c53, B:397:0x0c57, B:399:0x0c5b, B:401:0x0c5f, B:402:0x0c6b, B:403:0x0c70, B:405:0x0c76, B:407:0x0c8c, B:408:0x0c91, B:410:0x0d58, B:412:0x0cd0, B:414:0x0cd4, B:417:0x0ce8, B:419:0x0d04, B:420:0x0d0b, B:423:0x0d4c, B:424:0x0cd9, B:433:0x0b24, B:435:0x0d61, B:437:0x0d6b, B:438:0x0d7f, B:439:0x0d87, B:441:0x0d8d, B:443:0x0da1, B:445:0x0db3, B:446:0x0e66, B:448:0x0e6c, B:450:0x0e83, B:453:0x0e8e, B:455:0x0e98, B:457:0x0ebf, B:459:0x0ecf, B:460:0x0ed9, B:462:0x0ee7, B:463:0x0ef1, B:464:0x0efc, B:466:0x0f0e, B:469:0x0f15, B:470:0x0f58, B:471:0x0f24, B:473:0x0f32, B:474:0x0f3f, B:475:0x0f67, B:477:0x0f7a, B:478:0x0f9a, B:484:0x0f85, B:485:0x0dce, B:487:0x0dd4, B:489:0x0de6, B:490:0x0ded, B:495:0x0e05, B:496:0x0e0c, B:498:0x0e57, B:499:0x0e5e, B:500:0x0e5b, B:501:0x0e09, B:503:0x0dea, B:504:0x0949, B:506:0x094f, B:508:0x0955, B:509:0x087d, B:510:0x084c, B:511:0x07f5, B:513:0x07fb, B:517:0x0fa3), top: B:2:0x0019, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:219:0x036f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:222:0x03a4 A[Catch: all -> 0x0125, TryCatch #1 {all -> 0x0125, blocks: (B:3:0x0019, B:5:0x0035, B:7:0x003e, B:8:0x005e, B:11:0x007a, B:14:0x00a6, B:16:0x00e5, B:19:0x00fe, B:21:0x0108, B:24:0x074f, B:25:0x0135, B:28:0x014b, B:30:0x0151, B:32:0x0157, B:34:0x016a, B:37:0x0177, B:39:0x0182, B:41:0x0190, B:43:0x0196, B:46:0x01a1, B:48:0x01af, B:50:0x01c1, B:53:0x01e1, B:55:0x01e7, B:57:0x01f7, B:59:0x0205, B:61:0x0215, B:63:0x0220, B:68:0x0223, B:70:0x0230, B:72:0x023a, B:73:0x024a, B:75:0x0269, B:77:0x0273, B:79:0x0289, B:80:0x0293, B:83:0x029e, B:84:0x02a8, B:87:0x02b0, B:89:0x02c1, B:93:0x02c4, B:95:0x02db, B:102:0x04d5, B:103:0x04d8, B:105:0x04e4, B:108:0x04f5, B:110:0x0506, B:112:0x0512, B:113:0x05dd, B:115:0x05ea, B:117:0x05f0, B:119:0x05f6, B:121:0x0606, B:122:0x0609, B:123:0x0615, B:125:0x061b, B:126:0x0627, B:128:0x062d, B:130:0x063d, B:132:0x0647, B:133:0x065c, B:135:0x0662, B:136:0x067d, B:138:0x0683, B:140:0x06a1, B:142:0x06ae, B:144:0x06d7, B:145:0x06b4, B:147:0x06c2, B:151:0x06df, B:152:0x06fe, B:154:0x0704, B:157:0x0717, B:162:0x0724, B:164:0x072b, B:166:0x073b, B:174:0x0535, B:176:0x0545, B:179:0x0558, B:181:0x056a, B:183:0x0576, B:185:0x058a, B:188:0x0598, B:190:0x05a2, B:192:0x05ac, B:195:0x05b7, B:197:0x05bd, B:201:0x05cd, B:199:0x05d8, B:204:0x0301, B:207:0x030b, B:209:0x0319, B:211:0x036a, B:212:0x033b, B:214:0x0349, B:220:0x0371, B:222:0x03a4, B:223:0x03cc, B:225:0x0401, B:226:0x0407, B:229:0x0413, B:231:0x0448, B:232:0x0465, B:234:0x046b, B:236:0x0479, B:238:0x048d, B:239:0x0481, B:247:0x0494, B:250:0x049b, B:251:0x04ba, B:258:0x0766, B:260:0x0778, B:262:0x0781, B:264:0x07b3, B:265:0x0789, B:267:0x0792, B:269:0x0798, B:271:0x07a4, B:273:0x07ae, B:280:0x07b6, B:281:0x07c2, B:284:0x07ca, B:287:0x07dc, B:288:0x07e7, B:290:0x07ef, B:291:0x081e, B:293:0x083a, B:294:0x084f, B:296:0x086b, B:297:0x0880, B:298:0x089c, B:300:0x08a2, B:302:0x08ba, B:303:0x08c8, B:305:0x08d8, B:307:0x08e6, B:310:0x08e9, B:312:0x0933, B:314:0x0939, B:315:0x0964, B:317:0x096c, B:318:0x098a, B:320:0x0990, B:321:0x09a4, B:323:0x09bb, B:325:0x09d5, B:327:0x09e7, B:329:0x09f1, B:330:0x09f4, B:332:0x0a4f, B:333:0x0a62, B:336:0x0a6a, B:339:0x0a89, B:341:0x0aa2, B:343:0x0ab7, B:345:0x0abc, B:347:0x0ac0, B:349:0x0ac4, B:351:0x0ace, B:352:0x0ad7, B:354:0x0adb, B:356:0x0ae1, B:357:0x0aec, B:358:0x0afa, B:361:0x0d5b, B:365:0x0b02, B:430:0x0b1e, B:368:0x0b3b, B:370:0x0b5b, B:371:0x0b63, B:373:0x0b69, B:377:0x0b7b, B:380:0x0b91, B:382:0x0ba7, B:383:0x0bca, B:385:0x0bd6, B:387:0x0bec, B:388:0x0c2c, B:393:0x0c48, B:395:0x0c53, B:397:0x0c57, B:399:0x0c5b, B:401:0x0c5f, B:402:0x0c6b, B:403:0x0c70, B:405:0x0c76, B:407:0x0c8c, B:408:0x0c91, B:410:0x0d58, B:412:0x0cd0, B:414:0x0cd4, B:417:0x0ce8, B:419:0x0d04, B:420:0x0d0b, B:423:0x0d4c, B:424:0x0cd9, B:433:0x0b24, B:435:0x0d61, B:437:0x0d6b, B:438:0x0d7f, B:439:0x0d87, B:441:0x0d8d, B:443:0x0da1, B:445:0x0db3, B:446:0x0e66, B:448:0x0e6c, B:450:0x0e83, B:453:0x0e8e, B:455:0x0e98, B:457:0x0ebf, B:459:0x0ecf, B:460:0x0ed9, B:462:0x0ee7, B:463:0x0ef1, B:464:0x0efc, B:466:0x0f0e, B:469:0x0f15, B:470:0x0f58, B:471:0x0f24, B:473:0x0f32, B:474:0x0f3f, B:475:0x0f67, B:477:0x0f7a, B:478:0x0f9a, B:484:0x0f85, B:485:0x0dce, B:487:0x0dd4, B:489:0x0de6, B:490:0x0ded, B:495:0x0e05, B:496:0x0e0c, B:498:0x0e57, B:499:0x0e5e, B:500:0x0e5b, B:501:0x0e09, B:503:0x0dea, B:504:0x0949, B:506:0x094f, B:508:0x0955, B:509:0x087d, B:510:0x084c, B:511:0x07f5, B:513:0x07fb, B:517:0x0fa3), top: B:2:0x0019, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0401 A[Catch: all -> 0x0125, TryCatch #1 {all -> 0x0125, blocks: (B:3:0x0019, B:5:0x0035, B:7:0x003e, B:8:0x005e, B:11:0x007a, B:14:0x00a6, B:16:0x00e5, B:19:0x00fe, B:21:0x0108, B:24:0x074f, B:25:0x0135, B:28:0x014b, B:30:0x0151, B:32:0x0157, B:34:0x016a, B:37:0x0177, B:39:0x0182, B:41:0x0190, B:43:0x0196, B:46:0x01a1, B:48:0x01af, B:50:0x01c1, B:53:0x01e1, B:55:0x01e7, B:57:0x01f7, B:59:0x0205, B:61:0x0215, B:63:0x0220, B:68:0x0223, B:70:0x0230, B:72:0x023a, B:73:0x024a, B:75:0x0269, B:77:0x0273, B:79:0x0289, B:80:0x0293, B:83:0x029e, B:84:0x02a8, B:87:0x02b0, B:89:0x02c1, B:93:0x02c4, B:95:0x02db, B:102:0x04d5, B:103:0x04d8, B:105:0x04e4, B:108:0x04f5, B:110:0x0506, B:112:0x0512, B:113:0x05dd, B:115:0x05ea, B:117:0x05f0, B:119:0x05f6, B:121:0x0606, B:122:0x0609, B:123:0x0615, B:125:0x061b, B:126:0x0627, B:128:0x062d, B:130:0x063d, B:132:0x0647, B:133:0x065c, B:135:0x0662, B:136:0x067d, B:138:0x0683, B:140:0x06a1, B:142:0x06ae, B:144:0x06d7, B:145:0x06b4, B:147:0x06c2, B:151:0x06df, B:152:0x06fe, B:154:0x0704, B:157:0x0717, B:162:0x0724, B:164:0x072b, B:166:0x073b, B:174:0x0535, B:176:0x0545, B:179:0x0558, B:181:0x056a, B:183:0x0576, B:185:0x058a, B:188:0x0598, B:190:0x05a2, B:192:0x05ac, B:195:0x05b7, B:197:0x05bd, B:201:0x05cd, B:199:0x05d8, B:204:0x0301, B:207:0x030b, B:209:0x0319, B:211:0x036a, B:212:0x033b, B:214:0x0349, B:220:0x0371, B:222:0x03a4, B:223:0x03cc, B:225:0x0401, B:226:0x0407, B:229:0x0413, B:231:0x0448, B:232:0x0465, B:234:0x046b, B:236:0x0479, B:238:0x048d, B:239:0x0481, B:247:0x0494, B:250:0x049b, B:251:0x04ba, B:258:0x0766, B:260:0x0778, B:262:0x0781, B:264:0x07b3, B:265:0x0789, B:267:0x0792, B:269:0x0798, B:271:0x07a4, B:273:0x07ae, B:280:0x07b6, B:281:0x07c2, B:284:0x07ca, B:287:0x07dc, B:288:0x07e7, B:290:0x07ef, B:291:0x081e, B:293:0x083a, B:294:0x084f, B:296:0x086b, B:297:0x0880, B:298:0x089c, B:300:0x08a2, B:302:0x08ba, B:303:0x08c8, B:305:0x08d8, B:307:0x08e6, B:310:0x08e9, B:312:0x0933, B:314:0x0939, B:315:0x0964, B:317:0x096c, B:318:0x098a, B:320:0x0990, B:321:0x09a4, B:323:0x09bb, B:325:0x09d5, B:327:0x09e7, B:329:0x09f1, B:330:0x09f4, B:332:0x0a4f, B:333:0x0a62, B:336:0x0a6a, B:339:0x0a89, B:341:0x0aa2, B:343:0x0ab7, B:345:0x0abc, B:347:0x0ac0, B:349:0x0ac4, B:351:0x0ace, B:352:0x0ad7, B:354:0x0adb, B:356:0x0ae1, B:357:0x0aec, B:358:0x0afa, B:361:0x0d5b, B:365:0x0b02, B:430:0x0b1e, B:368:0x0b3b, B:370:0x0b5b, B:371:0x0b63, B:373:0x0b69, B:377:0x0b7b, B:380:0x0b91, B:382:0x0ba7, B:383:0x0bca, B:385:0x0bd6, B:387:0x0bec, B:388:0x0c2c, B:393:0x0c48, B:395:0x0c53, B:397:0x0c57, B:399:0x0c5b, B:401:0x0c5f, B:402:0x0c6b, B:403:0x0c70, B:405:0x0c76, B:407:0x0c8c, B:408:0x0c91, B:410:0x0d58, B:412:0x0cd0, B:414:0x0cd4, B:417:0x0ce8, B:419:0x0d04, B:420:0x0d0b, B:423:0x0d4c, B:424:0x0cd9, B:433:0x0b24, B:435:0x0d61, B:437:0x0d6b, B:438:0x0d7f, B:439:0x0d87, B:441:0x0d8d, B:443:0x0da1, B:445:0x0db3, B:446:0x0e66, B:448:0x0e6c, B:450:0x0e83, B:453:0x0e8e, B:455:0x0e98, B:457:0x0ebf, B:459:0x0ecf, B:460:0x0ed9, B:462:0x0ee7, B:463:0x0ef1, B:464:0x0efc, B:466:0x0f0e, B:469:0x0f15, B:470:0x0f58, B:471:0x0f24, B:473:0x0f32, B:474:0x0f3f, B:475:0x0f67, B:477:0x0f7a, B:478:0x0f9a, B:484:0x0f85, B:485:0x0dce, B:487:0x0dd4, B:489:0x0de6, B:490:0x0ded, B:495:0x0e05, B:496:0x0e0c, B:498:0x0e57, B:499:0x0e5e, B:500:0x0e5b, B:501:0x0e09, B:503:0x0dea, B:504:0x0949, B:506:0x094f, B:508:0x0955, B:509:0x087d, B:510:0x084c, B:511:0x07f5, B:513:0x07fb, B:517:0x0fa3), top: B:2:0x0019, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0411 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:234:0x046b A[Catch: all -> 0x0125, TryCatch #1 {all -> 0x0125, blocks: (B:3:0x0019, B:5:0x0035, B:7:0x003e, B:8:0x005e, B:11:0x007a, B:14:0x00a6, B:16:0x00e5, B:19:0x00fe, B:21:0x0108, B:24:0x074f, B:25:0x0135, B:28:0x014b, B:30:0x0151, B:32:0x0157, B:34:0x016a, B:37:0x0177, B:39:0x0182, B:41:0x0190, B:43:0x0196, B:46:0x01a1, B:48:0x01af, B:50:0x01c1, B:53:0x01e1, B:55:0x01e7, B:57:0x01f7, B:59:0x0205, B:61:0x0215, B:63:0x0220, B:68:0x0223, B:70:0x0230, B:72:0x023a, B:73:0x024a, B:75:0x0269, B:77:0x0273, B:79:0x0289, B:80:0x0293, B:83:0x029e, B:84:0x02a8, B:87:0x02b0, B:89:0x02c1, B:93:0x02c4, B:95:0x02db, B:102:0x04d5, B:103:0x04d8, B:105:0x04e4, B:108:0x04f5, B:110:0x0506, B:112:0x0512, B:113:0x05dd, B:115:0x05ea, B:117:0x05f0, B:119:0x05f6, B:121:0x0606, B:122:0x0609, B:123:0x0615, B:125:0x061b, B:126:0x0627, B:128:0x062d, B:130:0x063d, B:132:0x0647, B:133:0x065c, B:135:0x0662, B:136:0x067d, B:138:0x0683, B:140:0x06a1, B:142:0x06ae, B:144:0x06d7, B:145:0x06b4, B:147:0x06c2, B:151:0x06df, B:152:0x06fe, B:154:0x0704, B:157:0x0717, B:162:0x0724, B:164:0x072b, B:166:0x073b, B:174:0x0535, B:176:0x0545, B:179:0x0558, B:181:0x056a, B:183:0x0576, B:185:0x058a, B:188:0x0598, B:190:0x05a2, B:192:0x05ac, B:195:0x05b7, B:197:0x05bd, B:201:0x05cd, B:199:0x05d8, B:204:0x0301, B:207:0x030b, B:209:0x0319, B:211:0x036a, B:212:0x033b, B:214:0x0349, B:220:0x0371, B:222:0x03a4, B:223:0x03cc, B:225:0x0401, B:226:0x0407, B:229:0x0413, B:231:0x0448, B:232:0x0465, B:234:0x046b, B:236:0x0479, B:238:0x048d, B:239:0x0481, B:247:0x0494, B:250:0x049b, B:251:0x04ba, B:258:0x0766, B:260:0x0778, B:262:0x0781, B:264:0x07b3, B:265:0x0789, B:267:0x0792, B:269:0x0798, B:271:0x07a4, B:273:0x07ae, B:280:0x07b6, B:281:0x07c2, B:284:0x07ca, B:287:0x07dc, B:288:0x07e7, B:290:0x07ef, B:291:0x081e, B:293:0x083a, B:294:0x084f, B:296:0x086b, B:297:0x0880, B:298:0x089c, B:300:0x08a2, B:302:0x08ba, B:303:0x08c8, B:305:0x08d8, B:307:0x08e6, B:310:0x08e9, B:312:0x0933, B:314:0x0939, B:315:0x0964, B:317:0x096c, B:318:0x098a, B:320:0x0990, B:321:0x09a4, B:323:0x09bb, B:325:0x09d5, B:327:0x09e7, B:329:0x09f1, B:330:0x09f4, B:332:0x0a4f, B:333:0x0a62, B:336:0x0a6a, B:339:0x0a89, B:341:0x0aa2, B:343:0x0ab7, B:345:0x0abc, B:347:0x0ac0, B:349:0x0ac4, B:351:0x0ace, B:352:0x0ad7, B:354:0x0adb, B:356:0x0ae1, B:357:0x0aec, B:358:0x0afa, B:361:0x0d5b, B:365:0x0b02, B:430:0x0b1e, B:368:0x0b3b, B:370:0x0b5b, B:371:0x0b63, B:373:0x0b69, B:377:0x0b7b, B:380:0x0b91, B:382:0x0ba7, B:383:0x0bca, B:385:0x0bd6, B:387:0x0bec, B:388:0x0c2c, B:393:0x0c48, B:395:0x0c53, B:397:0x0c57, B:399:0x0c5b, B:401:0x0c5f, B:402:0x0c6b, B:403:0x0c70, B:405:0x0c76, B:407:0x0c8c, B:408:0x0c91, B:410:0x0d58, B:412:0x0cd0, B:414:0x0cd4, B:417:0x0ce8, B:419:0x0d04, B:420:0x0d0b, B:423:0x0d4c, B:424:0x0cd9, B:433:0x0b24, B:435:0x0d61, B:437:0x0d6b, B:438:0x0d7f, B:439:0x0d87, B:441:0x0d8d, B:443:0x0da1, B:445:0x0db3, B:446:0x0e66, B:448:0x0e6c, B:450:0x0e83, B:453:0x0e8e, B:455:0x0e98, B:457:0x0ebf, B:459:0x0ecf, B:460:0x0ed9, B:462:0x0ee7, B:463:0x0ef1, B:464:0x0efc, B:466:0x0f0e, B:469:0x0f15, B:470:0x0f58, B:471:0x0f24, B:473:0x0f32, B:474:0x0f3f, B:475:0x0f67, B:477:0x0f7a, B:478:0x0f9a, B:484:0x0f85, B:485:0x0dce, B:487:0x0dd4, B:489:0x0de6, B:490:0x0ded, B:495:0x0e05, B:496:0x0e0c, B:498:0x0e57, B:499:0x0e5e, B:500:0x0e5b, B:501:0x0e09, B:503:0x0dea, B:504:0x0949, B:506:0x094f, B:508:0x0955, B:509:0x087d, B:510:0x084c, B:511:0x07f5, B:513:0x07fb, B:517:0x0fa3), top: B:2:0x0019, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0492  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x049b A[Catch: all -> 0x0125, TryCatch #1 {all -> 0x0125, blocks: (B:3:0x0019, B:5:0x0035, B:7:0x003e, B:8:0x005e, B:11:0x007a, B:14:0x00a6, B:16:0x00e5, B:19:0x00fe, B:21:0x0108, B:24:0x074f, B:25:0x0135, B:28:0x014b, B:30:0x0151, B:32:0x0157, B:34:0x016a, B:37:0x0177, B:39:0x0182, B:41:0x0190, B:43:0x0196, B:46:0x01a1, B:48:0x01af, B:50:0x01c1, B:53:0x01e1, B:55:0x01e7, B:57:0x01f7, B:59:0x0205, B:61:0x0215, B:63:0x0220, B:68:0x0223, B:70:0x0230, B:72:0x023a, B:73:0x024a, B:75:0x0269, B:77:0x0273, B:79:0x0289, B:80:0x0293, B:83:0x029e, B:84:0x02a8, B:87:0x02b0, B:89:0x02c1, B:93:0x02c4, B:95:0x02db, B:102:0x04d5, B:103:0x04d8, B:105:0x04e4, B:108:0x04f5, B:110:0x0506, B:112:0x0512, B:113:0x05dd, B:115:0x05ea, B:117:0x05f0, B:119:0x05f6, B:121:0x0606, B:122:0x0609, B:123:0x0615, B:125:0x061b, B:126:0x0627, B:128:0x062d, B:130:0x063d, B:132:0x0647, B:133:0x065c, B:135:0x0662, B:136:0x067d, B:138:0x0683, B:140:0x06a1, B:142:0x06ae, B:144:0x06d7, B:145:0x06b4, B:147:0x06c2, B:151:0x06df, B:152:0x06fe, B:154:0x0704, B:157:0x0717, B:162:0x0724, B:164:0x072b, B:166:0x073b, B:174:0x0535, B:176:0x0545, B:179:0x0558, B:181:0x056a, B:183:0x0576, B:185:0x058a, B:188:0x0598, B:190:0x05a2, B:192:0x05ac, B:195:0x05b7, B:197:0x05bd, B:201:0x05cd, B:199:0x05d8, B:204:0x0301, B:207:0x030b, B:209:0x0319, B:211:0x036a, B:212:0x033b, B:214:0x0349, B:220:0x0371, B:222:0x03a4, B:223:0x03cc, B:225:0x0401, B:226:0x0407, B:229:0x0413, B:231:0x0448, B:232:0x0465, B:234:0x046b, B:236:0x0479, B:238:0x048d, B:239:0x0481, B:247:0x0494, B:250:0x049b, B:251:0x04ba, B:258:0x0766, B:260:0x0778, B:262:0x0781, B:264:0x07b3, B:265:0x0789, B:267:0x0792, B:269:0x0798, B:271:0x07a4, B:273:0x07ae, B:280:0x07b6, B:281:0x07c2, B:284:0x07ca, B:287:0x07dc, B:288:0x07e7, B:290:0x07ef, B:291:0x081e, B:293:0x083a, B:294:0x084f, B:296:0x086b, B:297:0x0880, B:298:0x089c, B:300:0x08a2, B:302:0x08ba, B:303:0x08c8, B:305:0x08d8, B:307:0x08e6, B:310:0x08e9, B:312:0x0933, B:314:0x0939, B:315:0x0964, B:317:0x096c, B:318:0x098a, B:320:0x0990, B:321:0x09a4, B:323:0x09bb, B:325:0x09d5, B:327:0x09e7, B:329:0x09f1, B:330:0x09f4, B:332:0x0a4f, B:333:0x0a62, B:336:0x0a6a, B:339:0x0a89, B:341:0x0aa2, B:343:0x0ab7, B:345:0x0abc, B:347:0x0ac0, B:349:0x0ac4, B:351:0x0ace, B:352:0x0ad7, B:354:0x0adb, B:356:0x0ae1, B:357:0x0aec, B:358:0x0afa, B:361:0x0d5b, B:365:0x0b02, B:430:0x0b1e, B:368:0x0b3b, B:370:0x0b5b, B:371:0x0b63, B:373:0x0b69, B:377:0x0b7b, B:380:0x0b91, B:382:0x0ba7, B:383:0x0bca, B:385:0x0bd6, B:387:0x0bec, B:388:0x0c2c, B:393:0x0c48, B:395:0x0c53, B:397:0x0c57, B:399:0x0c5b, B:401:0x0c5f, B:402:0x0c6b, B:403:0x0c70, B:405:0x0c76, B:407:0x0c8c, B:408:0x0c91, B:410:0x0d58, B:412:0x0cd0, B:414:0x0cd4, B:417:0x0ce8, B:419:0x0d04, B:420:0x0d0b, B:423:0x0d4c, B:424:0x0cd9, B:433:0x0b24, B:435:0x0d61, B:437:0x0d6b, B:438:0x0d7f, B:439:0x0d87, B:441:0x0d8d, B:443:0x0da1, B:445:0x0db3, B:446:0x0e66, B:448:0x0e6c, B:450:0x0e83, B:453:0x0e8e, B:455:0x0e98, B:457:0x0ebf, B:459:0x0ecf, B:460:0x0ed9, B:462:0x0ee7, B:463:0x0ef1, B:464:0x0efc, B:466:0x0f0e, B:469:0x0f15, B:470:0x0f58, B:471:0x0f24, B:473:0x0f32, B:474:0x0f3f, B:475:0x0f67, B:477:0x0f7a, B:478:0x0f9a, B:484:0x0f85, B:485:0x0dce, B:487:0x0dd4, B:489:0x0de6, B:490:0x0ded, B:495:0x0e05, B:496:0x0e0c, B:498:0x0e57, B:499:0x0e5e, B:500:0x0e5b, B:501:0x0e09, B:503:0x0dea, B:504:0x0949, B:506:0x094f, B:508:0x0955, B:509:0x087d, B:510:0x084c, B:511:0x07f5, B:513:0x07fb, B:517:0x0fa3), top: B:2:0x0019, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:251:0x04ba A[Catch: all -> 0x0125, TryCatch #1 {all -> 0x0125, blocks: (B:3:0x0019, B:5:0x0035, B:7:0x003e, B:8:0x005e, B:11:0x007a, B:14:0x00a6, B:16:0x00e5, B:19:0x00fe, B:21:0x0108, B:24:0x074f, B:25:0x0135, B:28:0x014b, B:30:0x0151, B:32:0x0157, B:34:0x016a, B:37:0x0177, B:39:0x0182, B:41:0x0190, B:43:0x0196, B:46:0x01a1, B:48:0x01af, B:50:0x01c1, B:53:0x01e1, B:55:0x01e7, B:57:0x01f7, B:59:0x0205, B:61:0x0215, B:63:0x0220, B:68:0x0223, B:70:0x0230, B:72:0x023a, B:73:0x024a, B:75:0x0269, B:77:0x0273, B:79:0x0289, B:80:0x0293, B:83:0x029e, B:84:0x02a8, B:87:0x02b0, B:89:0x02c1, B:93:0x02c4, B:95:0x02db, B:102:0x04d5, B:103:0x04d8, B:105:0x04e4, B:108:0x04f5, B:110:0x0506, B:112:0x0512, B:113:0x05dd, B:115:0x05ea, B:117:0x05f0, B:119:0x05f6, B:121:0x0606, B:122:0x0609, B:123:0x0615, B:125:0x061b, B:126:0x0627, B:128:0x062d, B:130:0x063d, B:132:0x0647, B:133:0x065c, B:135:0x0662, B:136:0x067d, B:138:0x0683, B:140:0x06a1, B:142:0x06ae, B:144:0x06d7, B:145:0x06b4, B:147:0x06c2, B:151:0x06df, B:152:0x06fe, B:154:0x0704, B:157:0x0717, B:162:0x0724, B:164:0x072b, B:166:0x073b, B:174:0x0535, B:176:0x0545, B:179:0x0558, B:181:0x056a, B:183:0x0576, B:185:0x058a, B:188:0x0598, B:190:0x05a2, B:192:0x05ac, B:195:0x05b7, B:197:0x05bd, B:201:0x05cd, B:199:0x05d8, B:204:0x0301, B:207:0x030b, B:209:0x0319, B:211:0x036a, B:212:0x033b, B:214:0x0349, B:220:0x0371, B:222:0x03a4, B:223:0x03cc, B:225:0x0401, B:226:0x0407, B:229:0x0413, B:231:0x0448, B:232:0x0465, B:234:0x046b, B:236:0x0479, B:238:0x048d, B:239:0x0481, B:247:0x0494, B:250:0x049b, B:251:0x04ba, B:258:0x0766, B:260:0x0778, B:262:0x0781, B:264:0x07b3, B:265:0x0789, B:267:0x0792, B:269:0x0798, B:271:0x07a4, B:273:0x07ae, B:280:0x07b6, B:281:0x07c2, B:284:0x07ca, B:287:0x07dc, B:288:0x07e7, B:290:0x07ef, B:291:0x081e, B:293:0x083a, B:294:0x084f, B:296:0x086b, B:297:0x0880, B:298:0x089c, B:300:0x08a2, B:302:0x08ba, B:303:0x08c8, B:305:0x08d8, B:307:0x08e6, B:310:0x08e9, B:312:0x0933, B:314:0x0939, B:315:0x0964, B:317:0x096c, B:318:0x098a, B:320:0x0990, B:321:0x09a4, B:323:0x09bb, B:325:0x09d5, B:327:0x09e7, B:329:0x09f1, B:330:0x09f4, B:332:0x0a4f, B:333:0x0a62, B:336:0x0a6a, B:339:0x0a89, B:341:0x0aa2, B:343:0x0ab7, B:345:0x0abc, B:347:0x0ac0, B:349:0x0ac4, B:351:0x0ace, B:352:0x0ad7, B:354:0x0adb, B:356:0x0ae1, B:357:0x0aec, B:358:0x0afa, B:361:0x0d5b, B:365:0x0b02, B:430:0x0b1e, B:368:0x0b3b, B:370:0x0b5b, B:371:0x0b63, B:373:0x0b69, B:377:0x0b7b, B:380:0x0b91, B:382:0x0ba7, B:383:0x0bca, B:385:0x0bd6, B:387:0x0bec, B:388:0x0c2c, B:393:0x0c48, B:395:0x0c53, B:397:0x0c57, B:399:0x0c5b, B:401:0x0c5f, B:402:0x0c6b, B:403:0x0c70, B:405:0x0c76, B:407:0x0c8c, B:408:0x0c91, B:410:0x0d58, B:412:0x0cd0, B:414:0x0cd4, B:417:0x0ce8, B:419:0x0d04, B:420:0x0d0b, B:423:0x0d4c, B:424:0x0cd9, B:433:0x0b24, B:435:0x0d61, B:437:0x0d6b, B:438:0x0d7f, B:439:0x0d87, B:441:0x0d8d, B:443:0x0da1, B:445:0x0db3, B:446:0x0e66, B:448:0x0e6c, B:450:0x0e83, B:453:0x0e8e, B:455:0x0e98, B:457:0x0ebf, B:459:0x0ecf, B:460:0x0ed9, B:462:0x0ee7, B:463:0x0ef1, B:464:0x0efc, B:466:0x0f0e, B:469:0x0f15, B:470:0x0f58, B:471:0x0f24, B:473:0x0f32, B:474:0x0f3f, B:475:0x0f67, B:477:0x0f7a, B:478:0x0f9a, B:484:0x0f85, B:485:0x0dce, B:487:0x0dd4, B:489:0x0de6, B:490:0x0ded, B:495:0x0e05, B:496:0x0e0c, B:498:0x0e57, B:499:0x0e5e, B:500:0x0e5b, B:501:0x0e09, B:503:0x0dea, B:504:0x0949, B:506:0x094f, B:508:0x0955, B:509:0x087d, B:510:0x084c, B:511:0x07f5, B:513:0x07fb, B:517:0x0fa3), top: B:2:0x0019, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x0b5b A[Catch: all -> 0x0125, TryCatch #1 {all -> 0x0125, blocks: (B:3:0x0019, B:5:0x0035, B:7:0x003e, B:8:0x005e, B:11:0x007a, B:14:0x00a6, B:16:0x00e5, B:19:0x00fe, B:21:0x0108, B:24:0x074f, B:25:0x0135, B:28:0x014b, B:30:0x0151, B:32:0x0157, B:34:0x016a, B:37:0x0177, B:39:0x0182, B:41:0x0190, B:43:0x0196, B:46:0x01a1, B:48:0x01af, B:50:0x01c1, B:53:0x01e1, B:55:0x01e7, B:57:0x01f7, B:59:0x0205, B:61:0x0215, B:63:0x0220, B:68:0x0223, B:70:0x0230, B:72:0x023a, B:73:0x024a, B:75:0x0269, B:77:0x0273, B:79:0x0289, B:80:0x0293, B:83:0x029e, B:84:0x02a8, B:87:0x02b0, B:89:0x02c1, B:93:0x02c4, B:95:0x02db, B:102:0x04d5, B:103:0x04d8, B:105:0x04e4, B:108:0x04f5, B:110:0x0506, B:112:0x0512, B:113:0x05dd, B:115:0x05ea, B:117:0x05f0, B:119:0x05f6, B:121:0x0606, B:122:0x0609, B:123:0x0615, B:125:0x061b, B:126:0x0627, B:128:0x062d, B:130:0x063d, B:132:0x0647, B:133:0x065c, B:135:0x0662, B:136:0x067d, B:138:0x0683, B:140:0x06a1, B:142:0x06ae, B:144:0x06d7, B:145:0x06b4, B:147:0x06c2, B:151:0x06df, B:152:0x06fe, B:154:0x0704, B:157:0x0717, B:162:0x0724, B:164:0x072b, B:166:0x073b, B:174:0x0535, B:176:0x0545, B:179:0x0558, B:181:0x056a, B:183:0x0576, B:185:0x058a, B:188:0x0598, B:190:0x05a2, B:192:0x05ac, B:195:0x05b7, B:197:0x05bd, B:201:0x05cd, B:199:0x05d8, B:204:0x0301, B:207:0x030b, B:209:0x0319, B:211:0x036a, B:212:0x033b, B:214:0x0349, B:220:0x0371, B:222:0x03a4, B:223:0x03cc, B:225:0x0401, B:226:0x0407, B:229:0x0413, B:231:0x0448, B:232:0x0465, B:234:0x046b, B:236:0x0479, B:238:0x048d, B:239:0x0481, B:247:0x0494, B:250:0x049b, B:251:0x04ba, B:258:0x0766, B:260:0x0778, B:262:0x0781, B:264:0x07b3, B:265:0x0789, B:267:0x0792, B:269:0x0798, B:271:0x07a4, B:273:0x07ae, B:280:0x07b6, B:281:0x07c2, B:284:0x07ca, B:287:0x07dc, B:288:0x07e7, B:290:0x07ef, B:291:0x081e, B:293:0x083a, B:294:0x084f, B:296:0x086b, B:297:0x0880, B:298:0x089c, B:300:0x08a2, B:302:0x08ba, B:303:0x08c8, B:305:0x08d8, B:307:0x08e6, B:310:0x08e9, B:312:0x0933, B:314:0x0939, B:315:0x0964, B:317:0x096c, B:318:0x098a, B:320:0x0990, B:321:0x09a4, B:323:0x09bb, B:325:0x09d5, B:327:0x09e7, B:329:0x09f1, B:330:0x09f4, B:332:0x0a4f, B:333:0x0a62, B:336:0x0a6a, B:339:0x0a89, B:341:0x0aa2, B:343:0x0ab7, B:345:0x0abc, B:347:0x0ac0, B:349:0x0ac4, B:351:0x0ace, B:352:0x0ad7, B:354:0x0adb, B:356:0x0ae1, B:357:0x0aec, B:358:0x0afa, B:361:0x0d5b, B:365:0x0b02, B:430:0x0b1e, B:368:0x0b3b, B:370:0x0b5b, B:371:0x0b63, B:373:0x0b69, B:377:0x0b7b, B:380:0x0b91, B:382:0x0ba7, B:383:0x0bca, B:385:0x0bd6, B:387:0x0bec, B:388:0x0c2c, B:393:0x0c48, B:395:0x0c53, B:397:0x0c57, B:399:0x0c5b, B:401:0x0c5f, B:402:0x0c6b, B:403:0x0c70, B:405:0x0c76, B:407:0x0c8c, B:408:0x0c91, B:410:0x0d58, B:412:0x0cd0, B:414:0x0cd4, B:417:0x0ce8, B:419:0x0d04, B:420:0x0d0b, B:423:0x0d4c, B:424:0x0cd9, B:433:0x0b24, B:435:0x0d61, B:437:0x0d6b, B:438:0x0d7f, B:439:0x0d87, B:441:0x0d8d, B:443:0x0da1, B:445:0x0db3, B:446:0x0e66, B:448:0x0e6c, B:450:0x0e83, B:453:0x0e8e, B:455:0x0e98, B:457:0x0ebf, B:459:0x0ecf, B:460:0x0ed9, B:462:0x0ee7, B:463:0x0ef1, B:464:0x0efc, B:466:0x0f0e, B:469:0x0f15, B:470:0x0f58, B:471:0x0f24, B:473:0x0f32, B:474:0x0f3f, B:475:0x0f67, B:477:0x0f7a, B:478:0x0f9a, B:484:0x0f85, B:485:0x0dce, B:487:0x0dd4, B:489:0x0de6, B:490:0x0ded, B:495:0x0e05, B:496:0x0e0c, B:498:0x0e57, B:499:0x0e5e, B:500:0x0e5b, B:501:0x0e09, B:503:0x0dea, B:504:0x0949, B:506:0x094f, B:508:0x0955, B:509:0x087d, B:510:0x084c, B:511:0x07f5, B:513:0x07fb, B:517:0x0fa3), top: B:2:0x0019, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:382:0x0ba7 A[Catch: all -> 0x0125, TryCatch #1 {all -> 0x0125, blocks: (B:3:0x0019, B:5:0x0035, B:7:0x003e, B:8:0x005e, B:11:0x007a, B:14:0x00a6, B:16:0x00e5, B:19:0x00fe, B:21:0x0108, B:24:0x074f, B:25:0x0135, B:28:0x014b, B:30:0x0151, B:32:0x0157, B:34:0x016a, B:37:0x0177, B:39:0x0182, B:41:0x0190, B:43:0x0196, B:46:0x01a1, B:48:0x01af, B:50:0x01c1, B:53:0x01e1, B:55:0x01e7, B:57:0x01f7, B:59:0x0205, B:61:0x0215, B:63:0x0220, B:68:0x0223, B:70:0x0230, B:72:0x023a, B:73:0x024a, B:75:0x0269, B:77:0x0273, B:79:0x0289, B:80:0x0293, B:83:0x029e, B:84:0x02a8, B:87:0x02b0, B:89:0x02c1, B:93:0x02c4, B:95:0x02db, B:102:0x04d5, B:103:0x04d8, B:105:0x04e4, B:108:0x04f5, B:110:0x0506, B:112:0x0512, B:113:0x05dd, B:115:0x05ea, B:117:0x05f0, B:119:0x05f6, B:121:0x0606, B:122:0x0609, B:123:0x0615, B:125:0x061b, B:126:0x0627, B:128:0x062d, B:130:0x063d, B:132:0x0647, B:133:0x065c, B:135:0x0662, B:136:0x067d, B:138:0x0683, B:140:0x06a1, B:142:0x06ae, B:144:0x06d7, B:145:0x06b4, B:147:0x06c2, B:151:0x06df, B:152:0x06fe, B:154:0x0704, B:157:0x0717, B:162:0x0724, B:164:0x072b, B:166:0x073b, B:174:0x0535, B:176:0x0545, B:179:0x0558, B:181:0x056a, B:183:0x0576, B:185:0x058a, B:188:0x0598, B:190:0x05a2, B:192:0x05ac, B:195:0x05b7, B:197:0x05bd, B:201:0x05cd, B:199:0x05d8, B:204:0x0301, B:207:0x030b, B:209:0x0319, B:211:0x036a, B:212:0x033b, B:214:0x0349, B:220:0x0371, B:222:0x03a4, B:223:0x03cc, B:225:0x0401, B:226:0x0407, B:229:0x0413, B:231:0x0448, B:232:0x0465, B:234:0x046b, B:236:0x0479, B:238:0x048d, B:239:0x0481, B:247:0x0494, B:250:0x049b, B:251:0x04ba, B:258:0x0766, B:260:0x0778, B:262:0x0781, B:264:0x07b3, B:265:0x0789, B:267:0x0792, B:269:0x0798, B:271:0x07a4, B:273:0x07ae, B:280:0x07b6, B:281:0x07c2, B:284:0x07ca, B:287:0x07dc, B:288:0x07e7, B:290:0x07ef, B:291:0x081e, B:293:0x083a, B:294:0x084f, B:296:0x086b, B:297:0x0880, B:298:0x089c, B:300:0x08a2, B:302:0x08ba, B:303:0x08c8, B:305:0x08d8, B:307:0x08e6, B:310:0x08e9, B:312:0x0933, B:314:0x0939, B:315:0x0964, B:317:0x096c, B:318:0x098a, B:320:0x0990, B:321:0x09a4, B:323:0x09bb, B:325:0x09d5, B:327:0x09e7, B:329:0x09f1, B:330:0x09f4, B:332:0x0a4f, B:333:0x0a62, B:336:0x0a6a, B:339:0x0a89, B:341:0x0aa2, B:343:0x0ab7, B:345:0x0abc, B:347:0x0ac0, B:349:0x0ac4, B:351:0x0ace, B:352:0x0ad7, B:354:0x0adb, B:356:0x0ae1, B:357:0x0aec, B:358:0x0afa, B:361:0x0d5b, B:365:0x0b02, B:430:0x0b1e, B:368:0x0b3b, B:370:0x0b5b, B:371:0x0b63, B:373:0x0b69, B:377:0x0b7b, B:380:0x0b91, B:382:0x0ba7, B:383:0x0bca, B:385:0x0bd6, B:387:0x0bec, B:388:0x0c2c, B:393:0x0c48, B:395:0x0c53, B:397:0x0c57, B:399:0x0c5b, B:401:0x0c5f, B:402:0x0c6b, B:403:0x0c70, B:405:0x0c76, B:407:0x0c8c, B:408:0x0c91, B:410:0x0d58, B:412:0x0cd0, B:414:0x0cd4, B:417:0x0ce8, B:419:0x0d04, B:420:0x0d0b, B:423:0x0d4c, B:424:0x0cd9, B:433:0x0b24, B:435:0x0d61, B:437:0x0d6b, B:438:0x0d7f, B:439:0x0d87, B:441:0x0d8d, B:443:0x0da1, B:445:0x0db3, B:446:0x0e66, B:448:0x0e6c, B:450:0x0e83, B:453:0x0e8e, B:455:0x0e98, B:457:0x0ebf, B:459:0x0ecf, B:460:0x0ed9, B:462:0x0ee7, B:463:0x0ef1, B:464:0x0efc, B:466:0x0f0e, B:469:0x0f15, B:470:0x0f58, B:471:0x0f24, B:473:0x0f32, B:474:0x0f3f, B:475:0x0f67, B:477:0x0f7a, B:478:0x0f9a, B:484:0x0f85, B:485:0x0dce, B:487:0x0dd4, B:489:0x0de6, B:490:0x0ded, B:495:0x0e05, B:496:0x0e0c, B:498:0x0e57, B:499:0x0e5e, B:500:0x0e5b, B:501:0x0e09, B:503:0x0dea, B:504:0x0949, B:506:0x094f, B:508:0x0955, B:509:0x087d, B:510:0x084c, B:511:0x07f5, B:513:0x07fb, B:517:0x0fa3), top: B:2:0x0019, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:383:0x0bca A[Catch: all -> 0x0125, TryCatch #1 {all -> 0x0125, blocks: (B:3:0x0019, B:5:0x0035, B:7:0x003e, B:8:0x005e, B:11:0x007a, B:14:0x00a6, B:16:0x00e5, B:19:0x00fe, B:21:0x0108, B:24:0x074f, B:25:0x0135, B:28:0x014b, B:30:0x0151, B:32:0x0157, B:34:0x016a, B:37:0x0177, B:39:0x0182, B:41:0x0190, B:43:0x0196, B:46:0x01a1, B:48:0x01af, B:50:0x01c1, B:53:0x01e1, B:55:0x01e7, B:57:0x01f7, B:59:0x0205, B:61:0x0215, B:63:0x0220, B:68:0x0223, B:70:0x0230, B:72:0x023a, B:73:0x024a, B:75:0x0269, B:77:0x0273, B:79:0x0289, B:80:0x0293, B:83:0x029e, B:84:0x02a8, B:87:0x02b0, B:89:0x02c1, B:93:0x02c4, B:95:0x02db, B:102:0x04d5, B:103:0x04d8, B:105:0x04e4, B:108:0x04f5, B:110:0x0506, B:112:0x0512, B:113:0x05dd, B:115:0x05ea, B:117:0x05f0, B:119:0x05f6, B:121:0x0606, B:122:0x0609, B:123:0x0615, B:125:0x061b, B:126:0x0627, B:128:0x062d, B:130:0x063d, B:132:0x0647, B:133:0x065c, B:135:0x0662, B:136:0x067d, B:138:0x0683, B:140:0x06a1, B:142:0x06ae, B:144:0x06d7, B:145:0x06b4, B:147:0x06c2, B:151:0x06df, B:152:0x06fe, B:154:0x0704, B:157:0x0717, B:162:0x0724, B:164:0x072b, B:166:0x073b, B:174:0x0535, B:176:0x0545, B:179:0x0558, B:181:0x056a, B:183:0x0576, B:185:0x058a, B:188:0x0598, B:190:0x05a2, B:192:0x05ac, B:195:0x05b7, B:197:0x05bd, B:201:0x05cd, B:199:0x05d8, B:204:0x0301, B:207:0x030b, B:209:0x0319, B:211:0x036a, B:212:0x033b, B:214:0x0349, B:220:0x0371, B:222:0x03a4, B:223:0x03cc, B:225:0x0401, B:226:0x0407, B:229:0x0413, B:231:0x0448, B:232:0x0465, B:234:0x046b, B:236:0x0479, B:238:0x048d, B:239:0x0481, B:247:0x0494, B:250:0x049b, B:251:0x04ba, B:258:0x0766, B:260:0x0778, B:262:0x0781, B:264:0x07b3, B:265:0x0789, B:267:0x0792, B:269:0x0798, B:271:0x07a4, B:273:0x07ae, B:280:0x07b6, B:281:0x07c2, B:284:0x07ca, B:287:0x07dc, B:288:0x07e7, B:290:0x07ef, B:291:0x081e, B:293:0x083a, B:294:0x084f, B:296:0x086b, B:297:0x0880, B:298:0x089c, B:300:0x08a2, B:302:0x08ba, B:303:0x08c8, B:305:0x08d8, B:307:0x08e6, B:310:0x08e9, B:312:0x0933, B:314:0x0939, B:315:0x0964, B:317:0x096c, B:318:0x098a, B:320:0x0990, B:321:0x09a4, B:323:0x09bb, B:325:0x09d5, B:327:0x09e7, B:329:0x09f1, B:330:0x09f4, B:332:0x0a4f, B:333:0x0a62, B:336:0x0a6a, B:339:0x0a89, B:341:0x0aa2, B:343:0x0ab7, B:345:0x0abc, B:347:0x0ac0, B:349:0x0ac4, B:351:0x0ace, B:352:0x0ad7, B:354:0x0adb, B:356:0x0ae1, B:357:0x0aec, B:358:0x0afa, B:361:0x0d5b, B:365:0x0b02, B:430:0x0b1e, B:368:0x0b3b, B:370:0x0b5b, B:371:0x0b63, B:373:0x0b69, B:377:0x0b7b, B:380:0x0b91, B:382:0x0ba7, B:383:0x0bca, B:385:0x0bd6, B:387:0x0bec, B:388:0x0c2c, B:393:0x0c48, B:395:0x0c53, B:397:0x0c57, B:399:0x0c5b, B:401:0x0c5f, B:402:0x0c6b, B:403:0x0c70, B:405:0x0c76, B:407:0x0c8c, B:408:0x0c91, B:410:0x0d58, B:412:0x0cd0, B:414:0x0cd4, B:417:0x0ce8, B:419:0x0d04, B:420:0x0d0b, B:423:0x0d4c, B:424:0x0cd9, B:433:0x0b24, B:435:0x0d61, B:437:0x0d6b, B:438:0x0d7f, B:439:0x0d87, B:441:0x0d8d, B:443:0x0da1, B:445:0x0db3, B:446:0x0e66, B:448:0x0e6c, B:450:0x0e83, B:453:0x0e8e, B:455:0x0e98, B:457:0x0ebf, B:459:0x0ecf, B:460:0x0ed9, B:462:0x0ee7, B:463:0x0ef1, B:464:0x0efc, B:466:0x0f0e, B:469:0x0f15, B:470:0x0f58, B:471:0x0f24, B:473:0x0f32, B:474:0x0f3f, B:475:0x0f67, B:477:0x0f7a, B:478:0x0f9a, B:484:0x0f85, B:485:0x0dce, B:487:0x0dd4, B:489:0x0de6, B:490:0x0ded, B:495:0x0e05, B:496:0x0e0c, B:498:0x0e57, B:499:0x0e5e, B:500:0x0e5b, B:501:0x0e09, B:503:0x0dea, B:504:0x0949, B:506:0x094f, B:508:0x0955, B:509:0x087d, B:510:0x084c, B:511:0x07f5, B:513:0x07fb, B:517:0x0fa3), top: B:2:0x0019, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01c1 A[Catch: all -> 0x0125, TryCatch #1 {all -> 0x0125, blocks: (B:3:0x0019, B:5:0x0035, B:7:0x003e, B:8:0x005e, B:11:0x007a, B:14:0x00a6, B:16:0x00e5, B:19:0x00fe, B:21:0x0108, B:24:0x074f, B:25:0x0135, B:28:0x014b, B:30:0x0151, B:32:0x0157, B:34:0x016a, B:37:0x0177, B:39:0x0182, B:41:0x0190, B:43:0x0196, B:46:0x01a1, B:48:0x01af, B:50:0x01c1, B:53:0x01e1, B:55:0x01e7, B:57:0x01f7, B:59:0x0205, B:61:0x0215, B:63:0x0220, B:68:0x0223, B:70:0x0230, B:72:0x023a, B:73:0x024a, B:75:0x0269, B:77:0x0273, B:79:0x0289, B:80:0x0293, B:83:0x029e, B:84:0x02a8, B:87:0x02b0, B:89:0x02c1, B:93:0x02c4, B:95:0x02db, B:102:0x04d5, B:103:0x04d8, B:105:0x04e4, B:108:0x04f5, B:110:0x0506, B:112:0x0512, B:113:0x05dd, B:115:0x05ea, B:117:0x05f0, B:119:0x05f6, B:121:0x0606, B:122:0x0609, B:123:0x0615, B:125:0x061b, B:126:0x0627, B:128:0x062d, B:130:0x063d, B:132:0x0647, B:133:0x065c, B:135:0x0662, B:136:0x067d, B:138:0x0683, B:140:0x06a1, B:142:0x06ae, B:144:0x06d7, B:145:0x06b4, B:147:0x06c2, B:151:0x06df, B:152:0x06fe, B:154:0x0704, B:157:0x0717, B:162:0x0724, B:164:0x072b, B:166:0x073b, B:174:0x0535, B:176:0x0545, B:179:0x0558, B:181:0x056a, B:183:0x0576, B:185:0x058a, B:188:0x0598, B:190:0x05a2, B:192:0x05ac, B:195:0x05b7, B:197:0x05bd, B:201:0x05cd, B:199:0x05d8, B:204:0x0301, B:207:0x030b, B:209:0x0319, B:211:0x036a, B:212:0x033b, B:214:0x0349, B:220:0x0371, B:222:0x03a4, B:223:0x03cc, B:225:0x0401, B:226:0x0407, B:229:0x0413, B:231:0x0448, B:232:0x0465, B:234:0x046b, B:236:0x0479, B:238:0x048d, B:239:0x0481, B:247:0x0494, B:250:0x049b, B:251:0x04ba, B:258:0x0766, B:260:0x0778, B:262:0x0781, B:264:0x07b3, B:265:0x0789, B:267:0x0792, B:269:0x0798, B:271:0x07a4, B:273:0x07ae, B:280:0x07b6, B:281:0x07c2, B:284:0x07ca, B:287:0x07dc, B:288:0x07e7, B:290:0x07ef, B:291:0x081e, B:293:0x083a, B:294:0x084f, B:296:0x086b, B:297:0x0880, B:298:0x089c, B:300:0x08a2, B:302:0x08ba, B:303:0x08c8, B:305:0x08d8, B:307:0x08e6, B:310:0x08e9, B:312:0x0933, B:314:0x0939, B:315:0x0964, B:317:0x096c, B:318:0x098a, B:320:0x0990, B:321:0x09a4, B:323:0x09bb, B:325:0x09d5, B:327:0x09e7, B:329:0x09f1, B:330:0x09f4, B:332:0x0a4f, B:333:0x0a62, B:336:0x0a6a, B:339:0x0a89, B:341:0x0aa2, B:343:0x0ab7, B:345:0x0abc, B:347:0x0ac0, B:349:0x0ac4, B:351:0x0ace, B:352:0x0ad7, B:354:0x0adb, B:356:0x0ae1, B:357:0x0aec, B:358:0x0afa, B:361:0x0d5b, B:365:0x0b02, B:430:0x0b1e, B:368:0x0b3b, B:370:0x0b5b, B:371:0x0b63, B:373:0x0b69, B:377:0x0b7b, B:380:0x0b91, B:382:0x0ba7, B:383:0x0bca, B:385:0x0bd6, B:387:0x0bec, B:388:0x0c2c, B:393:0x0c48, B:395:0x0c53, B:397:0x0c57, B:399:0x0c5b, B:401:0x0c5f, B:402:0x0c6b, B:403:0x0c70, B:405:0x0c76, B:407:0x0c8c, B:408:0x0c91, B:410:0x0d58, B:412:0x0cd0, B:414:0x0cd4, B:417:0x0ce8, B:419:0x0d04, B:420:0x0d0b, B:423:0x0d4c, B:424:0x0cd9, B:433:0x0b24, B:435:0x0d61, B:437:0x0d6b, B:438:0x0d7f, B:439:0x0d87, B:441:0x0d8d, B:443:0x0da1, B:445:0x0db3, B:446:0x0e66, B:448:0x0e6c, B:450:0x0e83, B:453:0x0e8e, B:455:0x0e98, B:457:0x0ebf, B:459:0x0ecf, B:460:0x0ed9, B:462:0x0ee7, B:463:0x0ef1, B:464:0x0efc, B:466:0x0f0e, B:469:0x0f15, B:470:0x0f58, B:471:0x0f24, B:473:0x0f32, B:474:0x0f3f, B:475:0x0f67, B:477:0x0f7a, B:478:0x0f9a, B:484:0x0f85, B:485:0x0dce, B:487:0x0dd4, B:489:0x0de6, B:490:0x0ded, B:495:0x0e05, B:496:0x0e0c, B:498:0x0e57, B:499:0x0e5e, B:500:0x0e5b, B:501:0x0e09, B:503:0x0dea, B:504:0x0949, B:506:0x094f, B:508:0x0955, B:509:0x087d, B:510:0x084c, B:511:0x07f5, B:513:0x07fb, B:517:0x0fa3), top: B:2:0x0019, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0230 A[Catch: all -> 0x0125, TryCatch #1 {all -> 0x0125, blocks: (B:3:0x0019, B:5:0x0035, B:7:0x003e, B:8:0x005e, B:11:0x007a, B:14:0x00a6, B:16:0x00e5, B:19:0x00fe, B:21:0x0108, B:24:0x074f, B:25:0x0135, B:28:0x014b, B:30:0x0151, B:32:0x0157, B:34:0x016a, B:37:0x0177, B:39:0x0182, B:41:0x0190, B:43:0x0196, B:46:0x01a1, B:48:0x01af, B:50:0x01c1, B:53:0x01e1, B:55:0x01e7, B:57:0x01f7, B:59:0x0205, B:61:0x0215, B:63:0x0220, B:68:0x0223, B:70:0x0230, B:72:0x023a, B:73:0x024a, B:75:0x0269, B:77:0x0273, B:79:0x0289, B:80:0x0293, B:83:0x029e, B:84:0x02a8, B:87:0x02b0, B:89:0x02c1, B:93:0x02c4, B:95:0x02db, B:102:0x04d5, B:103:0x04d8, B:105:0x04e4, B:108:0x04f5, B:110:0x0506, B:112:0x0512, B:113:0x05dd, B:115:0x05ea, B:117:0x05f0, B:119:0x05f6, B:121:0x0606, B:122:0x0609, B:123:0x0615, B:125:0x061b, B:126:0x0627, B:128:0x062d, B:130:0x063d, B:132:0x0647, B:133:0x065c, B:135:0x0662, B:136:0x067d, B:138:0x0683, B:140:0x06a1, B:142:0x06ae, B:144:0x06d7, B:145:0x06b4, B:147:0x06c2, B:151:0x06df, B:152:0x06fe, B:154:0x0704, B:157:0x0717, B:162:0x0724, B:164:0x072b, B:166:0x073b, B:174:0x0535, B:176:0x0545, B:179:0x0558, B:181:0x056a, B:183:0x0576, B:185:0x058a, B:188:0x0598, B:190:0x05a2, B:192:0x05ac, B:195:0x05b7, B:197:0x05bd, B:201:0x05cd, B:199:0x05d8, B:204:0x0301, B:207:0x030b, B:209:0x0319, B:211:0x036a, B:212:0x033b, B:214:0x0349, B:220:0x0371, B:222:0x03a4, B:223:0x03cc, B:225:0x0401, B:226:0x0407, B:229:0x0413, B:231:0x0448, B:232:0x0465, B:234:0x046b, B:236:0x0479, B:238:0x048d, B:239:0x0481, B:247:0x0494, B:250:0x049b, B:251:0x04ba, B:258:0x0766, B:260:0x0778, B:262:0x0781, B:264:0x07b3, B:265:0x0789, B:267:0x0792, B:269:0x0798, B:271:0x07a4, B:273:0x07ae, B:280:0x07b6, B:281:0x07c2, B:284:0x07ca, B:287:0x07dc, B:288:0x07e7, B:290:0x07ef, B:291:0x081e, B:293:0x083a, B:294:0x084f, B:296:0x086b, B:297:0x0880, B:298:0x089c, B:300:0x08a2, B:302:0x08ba, B:303:0x08c8, B:305:0x08d8, B:307:0x08e6, B:310:0x08e9, B:312:0x0933, B:314:0x0939, B:315:0x0964, B:317:0x096c, B:318:0x098a, B:320:0x0990, B:321:0x09a4, B:323:0x09bb, B:325:0x09d5, B:327:0x09e7, B:329:0x09f1, B:330:0x09f4, B:332:0x0a4f, B:333:0x0a62, B:336:0x0a6a, B:339:0x0a89, B:341:0x0aa2, B:343:0x0ab7, B:345:0x0abc, B:347:0x0ac0, B:349:0x0ac4, B:351:0x0ace, B:352:0x0ad7, B:354:0x0adb, B:356:0x0ae1, B:357:0x0aec, B:358:0x0afa, B:361:0x0d5b, B:365:0x0b02, B:430:0x0b1e, B:368:0x0b3b, B:370:0x0b5b, B:371:0x0b63, B:373:0x0b69, B:377:0x0b7b, B:380:0x0b91, B:382:0x0ba7, B:383:0x0bca, B:385:0x0bd6, B:387:0x0bec, B:388:0x0c2c, B:393:0x0c48, B:395:0x0c53, B:397:0x0c57, B:399:0x0c5b, B:401:0x0c5f, B:402:0x0c6b, B:403:0x0c70, B:405:0x0c76, B:407:0x0c8c, B:408:0x0c91, B:410:0x0d58, B:412:0x0cd0, B:414:0x0cd4, B:417:0x0ce8, B:419:0x0d04, B:420:0x0d0b, B:423:0x0d4c, B:424:0x0cd9, B:433:0x0b24, B:435:0x0d61, B:437:0x0d6b, B:438:0x0d7f, B:439:0x0d87, B:441:0x0d8d, B:443:0x0da1, B:445:0x0db3, B:446:0x0e66, B:448:0x0e6c, B:450:0x0e83, B:453:0x0e8e, B:455:0x0e98, B:457:0x0ebf, B:459:0x0ecf, B:460:0x0ed9, B:462:0x0ee7, B:463:0x0ef1, B:464:0x0efc, B:466:0x0f0e, B:469:0x0f15, B:470:0x0f58, B:471:0x0f24, B:473:0x0f32, B:474:0x0f3f, B:475:0x0f67, B:477:0x0f7a, B:478:0x0f9a, B:484:0x0f85, B:485:0x0dce, B:487:0x0dd4, B:489:0x0de6, B:490:0x0ded, B:495:0x0e05, B:496:0x0e0c, B:498:0x0e57, B:499:0x0e5e, B:500:0x0e5b, B:501:0x0e09, B:503:0x0dea, B:504:0x0949, B:506:0x094f, B:508:0x0955, B:509:0x087d, B:510:0x084c, B:511:0x07f5, B:513:0x07fb, B:517:0x0fa3), top: B:2:0x0019, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0269 A[Catch: all -> 0x0125, TryCatch #1 {all -> 0x0125, blocks: (B:3:0x0019, B:5:0x0035, B:7:0x003e, B:8:0x005e, B:11:0x007a, B:14:0x00a6, B:16:0x00e5, B:19:0x00fe, B:21:0x0108, B:24:0x074f, B:25:0x0135, B:28:0x014b, B:30:0x0151, B:32:0x0157, B:34:0x016a, B:37:0x0177, B:39:0x0182, B:41:0x0190, B:43:0x0196, B:46:0x01a1, B:48:0x01af, B:50:0x01c1, B:53:0x01e1, B:55:0x01e7, B:57:0x01f7, B:59:0x0205, B:61:0x0215, B:63:0x0220, B:68:0x0223, B:70:0x0230, B:72:0x023a, B:73:0x024a, B:75:0x0269, B:77:0x0273, B:79:0x0289, B:80:0x0293, B:83:0x029e, B:84:0x02a8, B:87:0x02b0, B:89:0x02c1, B:93:0x02c4, B:95:0x02db, B:102:0x04d5, B:103:0x04d8, B:105:0x04e4, B:108:0x04f5, B:110:0x0506, B:112:0x0512, B:113:0x05dd, B:115:0x05ea, B:117:0x05f0, B:119:0x05f6, B:121:0x0606, B:122:0x0609, B:123:0x0615, B:125:0x061b, B:126:0x0627, B:128:0x062d, B:130:0x063d, B:132:0x0647, B:133:0x065c, B:135:0x0662, B:136:0x067d, B:138:0x0683, B:140:0x06a1, B:142:0x06ae, B:144:0x06d7, B:145:0x06b4, B:147:0x06c2, B:151:0x06df, B:152:0x06fe, B:154:0x0704, B:157:0x0717, B:162:0x0724, B:164:0x072b, B:166:0x073b, B:174:0x0535, B:176:0x0545, B:179:0x0558, B:181:0x056a, B:183:0x0576, B:185:0x058a, B:188:0x0598, B:190:0x05a2, B:192:0x05ac, B:195:0x05b7, B:197:0x05bd, B:201:0x05cd, B:199:0x05d8, B:204:0x0301, B:207:0x030b, B:209:0x0319, B:211:0x036a, B:212:0x033b, B:214:0x0349, B:220:0x0371, B:222:0x03a4, B:223:0x03cc, B:225:0x0401, B:226:0x0407, B:229:0x0413, B:231:0x0448, B:232:0x0465, B:234:0x046b, B:236:0x0479, B:238:0x048d, B:239:0x0481, B:247:0x0494, B:250:0x049b, B:251:0x04ba, B:258:0x0766, B:260:0x0778, B:262:0x0781, B:264:0x07b3, B:265:0x0789, B:267:0x0792, B:269:0x0798, B:271:0x07a4, B:273:0x07ae, B:280:0x07b6, B:281:0x07c2, B:284:0x07ca, B:287:0x07dc, B:288:0x07e7, B:290:0x07ef, B:291:0x081e, B:293:0x083a, B:294:0x084f, B:296:0x086b, B:297:0x0880, B:298:0x089c, B:300:0x08a2, B:302:0x08ba, B:303:0x08c8, B:305:0x08d8, B:307:0x08e6, B:310:0x08e9, B:312:0x0933, B:314:0x0939, B:315:0x0964, B:317:0x096c, B:318:0x098a, B:320:0x0990, B:321:0x09a4, B:323:0x09bb, B:325:0x09d5, B:327:0x09e7, B:329:0x09f1, B:330:0x09f4, B:332:0x0a4f, B:333:0x0a62, B:336:0x0a6a, B:339:0x0a89, B:341:0x0aa2, B:343:0x0ab7, B:345:0x0abc, B:347:0x0ac0, B:349:0x0ac4, B:351:0x0ace, B:352:0x0ad7, B:354:0x0adb, B:356:0x0ae1, B:357:0x0aec, B:358:0x0afa, B:361:0x0d5b, B:365:0x0b02, B:430:0x0b1e, B:368:0x0b3b, B:370:0x0b5b, B:371:0x0b63, B:373:0x0b69, B:377:0x0b7b, B:380:0x0b91, B:382:0x0ba7, B:383:0x0bca, B:385:0x0bd6, B:387:0x0bec, B:388:0x0c2c, B:393:0x0c48, B:395:0x0c53, B:397:0x0c57, B:399:0x0c5b, B:401:0x0c5f, B:402:0x0c6b, B:403:0x0c70, B:405:0x0c76, B:407:0x0c8c, B:408:0x0c91, B:410:0x0d58, B:412:0x0cd0, B:414:0x0cd4, B:417:0x0ce8, B:419:0x0d04, B:420:0x0d0b, B:423:0x0d4c, B:424:0x0cd9, B:433:0x0b24, B:435:0x0d61, B:437:0x0d6b, B:438:0x0d7f, B:439:0x0d87, B:441:0x0d8d, B:443:0x0da1, B:445:0x0db3, B:446:0x0e66, B:448:0x0e6c, B:450:0x0e83, B:453:0x0e8e, B:455:0x0e98, B:457:0x0ebf, B:459:0x0ecf, B:460:0x0ed9, B:462:0x0ee7, B:463:0x0ef1, B:464:0x0efc, B:466:0x0f0e, B:469:0x0f15, B:470:0x0f58, B:471:0x0f24, B:473:0x0f32, B:474:0x0f3f, B:475:0x0f67, B:477:0x0f7a, B:478:0x0f9a, B:484:0x0f85, B:485:0x0dce, B:487:0x0dd4, B:489:0x0de6, B:490:0x0ded, B:495:0x0e05, B:496:0x0e0c, B:498:0x0e57, B:499:0x0e5e, B:500:0x0e5b, B:501:0x0e09, B:503:0x0dea, B:504:0x0949, B:506:0x094f, B:508:0x0955, B:509:0x087d, B:510:0x084c, B:511:0x07f5, B:513:0x07fb, B:517:0x0fa3), top: B:2:0x0019, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0289 A[Catch: all -> 0x0125, TryCatch #1 {all -> 0x0125, blocks: (B:3:0x0019, B:5:0x0035, B:7:0x003e, B:8:0x005e, B:11:0x007a, B:14:0x00a6, B:16:0x00e5, B:19:0x00fe, B:21:0x0108, B:24:0x074f, B:25:0x0135, B:28:0x014b, B:30:0x0151, B:32:0x0157, B:34:0x016a, B:37:0x0177, B:39:0x0182, B:41:0x0190, B:43:0x0196, B:46:0x01a1, B:48:0x01af, B:50:0x01c1, B:53:0x01e1, B:55:0x01e7, B:57:0x01f7, B:59:0x0205, B:61:0x0215, B:63:0x0220, B:68:0x0223, B:70:0x0230, B:72:0x023a, B:73:0x024a, B:75:0x0269, B:77:0x0273, B:79:0x0289, B:80:0x0293, B:83:0x029e, B:84:0x02a8, B:87:0x02b0, B:89:0x02c1, B:93:0x02c4, B:95:0x02db, B:102:0x04d5, B:103:0x04d8, B:105:0x04e4, B:108:0x04f5, B:110:0x0506, B:112:0x0512, B:113:0x05dd, B:115:0x05ea, B:117:0x05f0, B:119:0x05f6, B:121:0x0606, B:122:0x0609, B:123:0x0615, B:125:0x061b, B:126:0x0627, B:128:0x062d, B:130:0x063d, B:132:0x0647, B:133:0x065c, B:135:0x0662, B:136:0x067d, B:138:0x0683, B:140:0x06a1, B:142:0x06ae, B:144:0x06d7, B:145:0x06b4, B:147:0x06c2, B:151:0x06df, B:152:0x06fe, B:154:0x0704, B:157:0x0717, B:162:0x0724, B:164:0x072b, B:166:0x073b, B:174:0x0535, B:176:0x0545, B:179:0x0558, B:181:0x056a, B:183:0x0576, B:185:0x058a, B:188:0x0598, B:190:0x05a2, B:192:0x05ac, B:195:0x05b7, B:197:0x05bd, B:201:0x05cd, B:199:0x05d8, B:204:0x0301, B:207:0x030b, B:209:0x0319, B:211:0x036a, B:212:0x033b, B:214:0x0349, B:220:0x0371, B:222:0x03a4, B:223:0x03cc, B:225:0x0401, B:226:0x0407, B:229:0x0413, B:231:0x0448, B:232:0x0465, B:234:0x046b, B:236:0x0479, B:238:0x048d, B:239:0x0481, B:247:0x0494, B:250:0x049b, B:251:0x04ba, B:258:0x0766, B:260:0x0778, B:262:0x0781, B:264:0x07b3, B:265:0x0789, B:267:0x0792, B:269:0x0798, B:271:0x07a4, B:273:0x07ae, B:280:0x07b6, B:281:0x07c2, B:284:0x07ca, B:287:0x07dc, B:288:0x07e7, B:290:0x07ef, B:291:0x081e, B:293:0x083a, B:294:0x084f, B:296:0x086b, B:297:0x0880, B:298:0x089c, B:300:0x08a2, B:302:0x08ba, B:303:0x08c8, B:305:0x08d8, B:307:0x08e6, B:310:0x08e9, B:312:0x0933, B:314:0x0939, B:315:0x0964, B:317:0x096c, B:318:0x098a, B:320:0x0990, B:321:0x09a4, B:323:0x09bb, B:325:0x09d5, B:327:0x09e7, B:329:0x09f1, B:330:0x09f4, B:332:0x0a4f, B:333:0x0a62, B:336:0x0a6a, B:339:0x0a89, B:341:0x0aa2, B:343:0x0ab7, B:345:0x0abc, B:347:0x0ac0, B:349:0x0ac4, B:351:0x0ace, B:352:0x0ad7, B:354:0x0adb, B:356:0x0ae1, B:357:0x0aec, B:358:0x0afa, B:361:0x0d5b, B:365:0x0b02, B:430:0x0b1e, B:368:0x0b3b, B:370:0x0b5b, B:371:0x0b63, B:373:0x0b69, B:377:0x0b7b, B:380:0x0b91, B:382:0x0ba7, B:383:0x0bca, B:385:0x0bd6, B:387:0x0bec, B:388:0x0c2c, B:393:0x0c48, B:395:0x0c53, B:397:0x0c57, B:399:0x0c5b, B:401:0x0c5f, B:402:0x0c6b, B:403:0x0c70, B:405:0x0c76, B:407:0x0c8c, B:408:0x0c91, B:410:0x0d58, B:412:0x0cd0, B:414:0x0cd4, B:417:0x0ce8, B:419:0x0d04, B:420:0x0d0b, B:423:0x0d4c, B:424:0x0cd9, B:433:0x0b24, B:435:0x0d61, B:437:0x0d6b, B:438:0x0d7f, B:439:0x0d87, B:441:0x0d8d, B:443:0x0da1, B:445:0x0db3, B:446:0x0e66, B:448:0x0e6c, B:450:0x0e83, B:453:0x0e8e, B:455:0x0e98, B:457:0x0ebf, B:459:0x0ecf, B:460:0x0ed9, B:462:0x0ee7, B:463:0x0ef1, B:464:0x0efc, B:466:0x0f0e, B:469:0x0f15, B:470:0x0f58, B:471:0x0f24, B:473:0x0f32, B:474:0x0f3f, B:475:0x0f67, B:477:0x0f7a, B:478:0x0f9a, B:484:0x0f85, B:485:0x0dce, B:487:0x0dd4, B:489:0x0de6, B:490:0x0ded, B:495:0x0e05, B:496:0x0e0c, B:498:0x0e57, B:499:0x0e5e, B:500:0x0e5b, B:501:0x0e09, B:503:0x0dea, B:504:0x0949, B:506:0x094f, B:508:0x0955, B:509:0x087d, B:510:0x084c, B:511:0x07f5, B:513:0x07fb, B:517:0x0fa3), top: B:2:0x0019, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x029e A[Catch: all -> 0x0125, TryCatch #1 {all -> 0x0125, blocks: (B:3:0x0019, B:5:0x0035, B:7:0x003e, B:8:0x005e, B:11:0x007a, B:14:0x00a6, B:16:0x00e5, B:19:0x00fe, B:21:0x0108, B:24:0x074f, B:25:0x0135, B:28:0x014b, B:30:0x0151, B:32:0x0157, B:34:0x016a, B:37:0x0177, B:39:0x0182, B:41:0x0190, B:43:0x0196, B:46:0x01a1, B:48:0x01af, B:50:0x01c1, B:53:0x01e1, B:55:0x01e7, B:57:0x01f7, B:59:0x0205, B:61:0x0215, B:63:0x0220, B:68:0x0223, B:70:0x0230, B:72:0x023a, B:73:0x024a, B:75:0x0269, B:77:0x0273, B:79:0x0289, B:80:0x0293, B:83:0x029e, B:84:0x02a8, B:87:0x02b0, B:89:0x02c1, B:93:0x02c4, B:95:0x02db, B:102:0x04d5, B:103:0x04d8, B:105:0x04e4, B:108:0x04f5, B:110:0x0506, B:112:0x0512, B:113:0x05dd, B:115:0x05ea, B:117:0x05f0, B:119:0x05f6, B:121:0x0606, B:122:0x0609, B:123:0x0615, B:125:0x061b, B:126:0x0627, B:128:0x062d, B:130:0x063d, B:132:0x0647, B:133:0x065c, B:135:0x0662, B:136:0x067d, B:138:0x0683, B:140:0x06a1, B:142:0x06ae, B:144:0x06d7, B:145:0x06b4, B:147:0x06c2, B:151:0x06df, B:152:0x06fe, B:154:0x0704, B:157:0x0717, B:162:0x0724, B:164:0x072b, B:166:0x073b, B:174:0x0535, B:176:0x0545, B:179:0x0558, B:181:0x056a, B:183:0x0576, B:185:0x058a, B:188:0x0598, B:190:0x05a2, B:192:0x05ac, B:195:0x05b7, B:197:0x05bd, B:201:0x05cd, B:199:0x05d8, B:204:0x0301, B:207:0x030b, B:209:0x0319, B:211:0x036a, B:212:0x033b, B:214:0x0349, B:220:0x0371, B:222:0x03a4, B:223:0x03cc, B:225:0x0401, B:226:0x0407, B:229:0x0413, B:231:0x0448, B:232:0x0465, B:234:0x046b, B:236:0x0479, B:238:0x048d, B:239:0x0481, B:247:0x0494, B:250:0x049b, B:251:0x04ba, B:258:0x0766, B:260:0x0778, B:262:0x0781, B:264:0x07b3, B:265:0x0789, B:267:0x0792, B:269:0x0798, B:271:0x07a4, B:273:0x07ae, B:280:0x07b6, B:281:0x07c2, B:284:0x07ca, B:287:0x07dc, B:288:0x07e7, B:290:0x07ef, B:291:0x081e, B:293:0x083a, B:294:0x084f, B:296:0x086b, B:297:0x0880, B:298:0x089c, B:300:0x08a2, B:302:0x08ba, B:303:0x08c8, B:305:0x08d8, B:307:0x08e6, B:310:0x08e9, B:312:0x0933, B:314:0x0939, B:315:0x0964, B:317:0x096c, B:318:0x098a, B:320:0x0990, B:321:0x09a4, B:323:0x09bb, B:325:0x09d5, B:327:0x09e7, B:329:0x09f1, B:330:0x09f4, B:332:0x0a4f, B:333:0x0a62, B:336:0x0a6a, B:339:0x0a89, B:341:0x0aa2, B:343:0x0ab7, B:345:0x0abc, B:347:0x0ac0, B:349:0x0ac4, B:351:0x0ace, B:352:0x0ad7, B:354:0x0adb, B:356:0x0ae1, B:357:0x0aec, B:358:0x0afa, B:361:0x0d5b, B:365:0x0b02, B:430:0x0b1e, B:368:0x0b3b, B:370:0x0b5b, B:371:0x0b63, B:373:0x0b69, B:377:0x0b7b, B:380:0x0b91, B:382:0x0ba7, B:383:0x0bca, B:385:0x0bd6, B:387:0x0bec, B:388:0x0c2c, B:393:0x0c48, B:395:0x0c53, B:397:0x0c57, B:399:0x0c5b, B:401:0x0c5f, B:402:0x0c6b, B:403:0x0c70, B:405:0x0c76, B:407:0x0c8c, B:408:0x0c91, B:410:0x0d58, B:412:0x0cd0, B:414:0x0cd4, B:417:0x0ce8, B:419:0x0d04, B:420:0x0d0b, B:423:0x0d4c, B:424:0x0cd9, B:433:0x0b24, B:435:0x0d61, B:437:0x0d6b, B:438:0x0d7f, B:439:0x0d87, B:441:0x0d8d, B:443:0x0da1, B:445:0x0db3, B:446:0x0e66, B:448:0x0e6c, B:450:0x0e83, B:453:0x0e8e, B:455:0x0e98, B:457:0x0ebf, B:459:0x0ecf, B:460:0x0ed9, B:462:0x0ee7, B:463:0x0ef1, B:464:0x0efc, B:466:0x0f0e, B:469:0x0f15, B:470:0x0f58, B:471:0x0f24, B:473:0x0f32, B:474:0x0f3f, B:475:0x0f67, B:477:0x0f7a, B:478:0x0f9a, B:484:0x0f85, B:485:0x0dce, B:487:0x0dd4, B:489:0x0de6, B:490:0x0ded, B:495:0x0e05, B:496:0x0e0c, B:498:0x0e57, B:499:0x0e5e, B:500:0x0e5b, B:501:0x0e09, B:503:0x0dea, B:504:0x0949, B:506:0x094f, B:508:0x0955, B:509:0x087d, B:510:0x084c, B:511:0x07f5, B:513:0x07fb, B:517:0x0fa3), top: B:2:0x0019, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02db A[Catch: all -> 0x0125, TRY_LEAVE, TryCatch #1 {all -> 0x0125, blocks: (B:3:0x0019, B:5:0x0035, B:7:0x003e, B:8:0x005e, B:11:0x007a, B:14:0x00a6, B:16:0x00e5, B:19:0x00fe, B:21:0x0108, B:24:0x074f, B:25:0x0135, B:28:0x014b, B:30:0x0151, B:32:0x0157, B:34:0x016a, B:37:0x0177, B:39:0x0182, B:41:0x0190, B:43:0x0196, B:46:0x01a1, B:48:0x01af, B:50:0x01c1, B:53:0x01e1, B:55:0x01e7, B:57:0x01f7, B:59:0x0205, B:61:0x0215, B:63:0x0220, B:68:0x0223, B:70:0x0230, B:72:0x023a, B:73:0x024a, B:75:0x0269, B:77:0x0273, B:79:0x0289, B:80:0x0293, B:83:0x029e, B:84:0x02a8, B:87:0x02b0, B:89:0x02c1, B:93:0x02c4, B:95:0x02db, B:102:0x04d5, B:103:0x04d8, B:105:0x04e4, B:108:0x04f5, B:110:0x0506, B:112:0x0512, B:113:0x05dd, B:115:0x05ea, B:117:0x05f0, B:119:0x05f6, B:121:0x0606, B:122:0x0609, B:123:0x0615, B:125:0x061b, B:126:0x0627, B:128:0x062d, B:130:0x063d, B:132:0x0647, B:133:0x065c, B:135:0x0662, B:136:0x067d, B:138:0x0683, B:140:0x06a1, B:142:0x06ae, B:144:0x06d7, B:145:0x06b4, B:147:0x06c2, B:151:0x06df, B:152:0x06fe, B:154:0x0704, B:157:0x0717, B:162:0x0724, B:164:0x072b, B:166:0x073b, B:174:0x0535, B:176:0x0545, B:179:0x0558, B:181:0x056a, B:183:0x0576, B:185:0x058a, B:188:0x0598, B:190:0x05a2, B:192:0x05ac, B:195:0x05b7, B:197:0x05bd, B:201:0x05cd, B:199:0x05d8, B:204:0x0301, B:207:0x030b, B:209:0x0319, B:211:0x036a, B:212:0x033b, B:214:0x0349, B:220:0x0371, B:222:0x03a4, B:223:0x03cc, B:225:0x0401, B:226:0x0407, B:229:0x0413, B:231:0x0448, B:232:0x0465, B:234:0x046b, B:236:0x0479, B:238:0x048d, B:239:0x0481, B:247:0x0494, B:250:0x049b, B:251:0x04ba, B:258:0x0766, B:260:0x0778, B:262:0x0781, B:264:0x07b3, B:265:0x0789, B:267:0x0792, B:269:0x0798, B:271:0x07a4, B:273:0x07ae, B:280:0x07b6, B:281:0x07c2, B:284:0x07ca, B:287:0x07dc, B:288:0x07e7, B:290:0x07ef, B:291:0x081e, B:293:0x083a, B:294:0x084f, B:296:0x086b, B:297:0x0880, B:298:0x089c, B:300:0x08a2, B:302:0x08ba, B:303:0x08c8, B:305:0x08d8, B:307:0x08e6, B:310:0x08e9, B:312:0x0933, B:314:0x0939, B:315:0x0964, B:317:0x096c, B:318:0x098a, B:320:0x0990, B:321:0x09a4, B:323:0x09bb, B:325:0x09d5, B:327:0x09e7, B:329:0x09f1, B:330:0x09f4, B:332:0x0a4f, B:333:0x0a62, B:336:0x0a6a, B:339:0x0a89, B:341:0x0aa2, B:343:0x0ab7, B:345:0x0abc, B:347:0x0ac0, B:349:0x0ac4, B:351:0x0ace, B:352:0x0ad7, B:354:0x0adb, B:356:0x0ae1, B:357:0x0aec, B:358:0x0afa, B:361:0x0d5b, B:365:0x0b02, B:430:0x0b1e, B:368:0x0b3b, B:370:0x0b5b, B:371:0x0b63, B:373:0x0b69, B:377:0x0b7b, B:380:0x0b91, B:382:0x0ba7, B:383:0x0bca, B:385:0x0bd6, B:387:0x0bec, B:388:0x0c2c, B:393:0x0c48, B:395:0x0c53, B:397:0x0c57, B:399:0x0c5b, B:401:0x0c5f, B:402:0x0c6b, B:403:0x0c70, B:405:0x0c76, B:407:0x0c8c, B:408:0x0c91, B:410:0x0d58, B:412:0x0cd0, B:414:0x0cd4, B:417:0x0ce8, B:419:0x0d04, B:420:0x0d0b, B:423:0x0d4c, B:424:0x0cd9, B:433:0x0b24, B:435:0x0d61, B:437:0x0d6b, B:438:0x0d7f, B:439:0x0d87, B:441:0x0d8d, B:443:0x0da1, B:445:0x0db3, B:446:0x0e66, B:448:0x0e6c, B:450:0x0e83, B:453:0x0e8e, B:455:0x0e98, B:457:0x0ebf, B:459:0x0ecf, B:460:0x0ed9, B:462:0x0ee7, B:463:0x0ef1, B:464:0x0efc, B:466:0x0f0e, B:469:0x0f15, B:470:0x0f58, B:471:0x0f24, B:473:0x0f32, B:474:0x0f3f, B:475:0x0f67, B:477:0x0f7a, B:478:0x0f9a, B:484:0x0f85, B:485:0x0dce, B:487:0x0dd4, B:489:0x0de6, B:490:0x0ded, B:495:0x0e05, B:496:0x0e0c, B:498:0x0e57, B:499:0x0e5e, B:500:0x0e5b, B:501:0x0e09, B:503:0x0dea, B:504:0x0949, B:506:0x094f, B:508:0x0955, B:509:0x087d, B:510:0x084c, B:511:0x07f5, B:513:0x07fb, B:517:0x0fa3), top: B:2:0x0019, inners: #0, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean I(String str, long j) {
        boolean z10;
        int i3;
        Long l10;
        q1 q1Var;
        a1 w02;
        Long l11;
        long parseLong;
        long j3;
        int i10;
        long p4;
        String str2;
        d9 d9Var;
        int i11;
        int i12;
        g e02;
        d0 d0Var;
        boolean I;
        int i13;
        boolean z11;
        boolean z12;
        boolean z13;
        String str3;
        String str4;
        int i14;
        boolean z14;
        y8 y8Var;
        int i15;
        int i16;
        String str5;
        String str6;
        int i17;
        int i18;
        String str7;
        long z15;
        String str8;
        j4 j4Var = this;
        String str9 = "1";
        String str10 = "_ai";
        String str11 = "purchase";
        String str12 = "items";
        Long l12 = 1L;
        j4Var.g0().g0();
        try {
            e1 e1Var = new e1(j4Var);
            j4Var.g0().e0(str, j, j4Var.O, e1Var);
            ArrayList arrayList = (ArrayList) e1Var.f8667d;
            if (arrayList == null || arrayList.isEmpty()) {
                g0().h0();
                z10 = false;
            } else {
                d9 d9Var2 = (d9) ((e9) e1Var.f8665b).k();
                d9Var2.b();
                ((e9) d9Var2.f2389e).e0();
                int i19 = -1;
                int i20 = -1;
                int i21 = 0;
                int i22 = 0;
                boolean z16 = false;
                v8 v8Var = null;
                v8 v8Var2 = null;
                boolean z17 = false;
                while (true) {
                    int size = ((ArrayList) e1Var.f8667d).size();
                    i3 = i22;
                    l10 = l12;
                    q1Var = j4Var.f8771z;
                    if (i21 >= size) {
                        break;
                    }
                    v8 v8Var3 = (v8) ((w8) ((ArrayList) e1Var.f8667d).get(i21)).k();
                    int i23 = i21;
                    if (j4Var.f0().H(((e9) e1Var.f8665b).t(), v8Var3.m())) {
                        String str13 = str12;
                        j4Var.b().x().c(v0.A(((e9) e1Var.f8665b).t()), q1Var.m().a(v8Var3.m()), "Dropping blocked raw event. appId");
                        if (!str9.equals(j4Var.f0().c(((e9) e1Var.f8665b).t(), "measurement.upload.blacklist_internal")) && !str9.equals(j4Var.f0().c(((e9) e1Var.f8665b).t(), "measurement.upload.blacklist_public")) && !"_err".equals(v8Var3.m())) {
                            j4Var.k0();
                            p4.K(j4Var.X, ((e9) e1Var.f8665b).t(), 11, "_ev", v8Var3.m(), 0);
                        }
                        str2 = str9;
                        str4 = str11;
                        i22 = i3;
                        i17 = i23;
                        str5 = str13;
                        str6 = str10;
                    } else {
                        String str14 = str12;
                        String m10 = v8Var3.m();
                        str2 = str9;
                        if (m10.equals(str11) || m10.equals("_iap") || m10.equals("ecommerce_purchase")) {
                            d9Var = d9Var2;
                            i11 = i19;
                            i12 = i20;
                        } else {
                            i12 = i20;
                            d9Var = d9Var2;
                            i11 = i19;
                            if (j4Var.e0().D(null, e0.f8622f1) && m10.equals("in_app_purchase")) {
                            }
                            if (v8Var3.m().equals(d2.g(str10, d2.f8585f, d2.f8580a))) {
                                v8Var3.n(str10);
                                j4Var.b().z().a("Renaming ad_impression to _ai");
                                if (Log.isLoggable(j4Var.b().C(), 5)) {
                                    for (int i24 = 0; i24 < v8Var3.h(); i24++) {
                                        if ("ad_platform".equals(v8Var3.i(i24).u()) && !v8Var3.i(i24).w().isEmpty() && "admob".equalsIgnoreCase(v8Var3.i(i24).w())) {
                                            j4Var.b().f9055y.a("AdMob ad impression logged from app. Potentially duplicative.");
                                        }
                                    }
                                }
                            }
                            e02 = j4Var.e0();
                            d0Var = e0.f8622f1;
                            if (e02.D(null, d0Var) && v8Var3.m().equals("in_app_purchase")) {
                                v8Var3.n("_iap");
                                j4Var.b().z().a("Renaming in_app_purchase to _iap");
                            }
                            I = j4Var.f0().I(((e9) e1Var.f8665b).t(), v8Var3.m());
                            if (j4Var.e0().D(null, d0Var) && "_iap".equals(v8Var3.m())) {
                                I = j4Var.y(v8Var3);
                                String t6 = ((e9) e1Var.f8665b).t();
                                if ("_iap".equals(v8Var3.m())) {
                                    j4Var.L(v8Var3, "value", t6);
                                    j4Var.L(v8Var3, "price", t6);
                                }
                                if (!"_iap".equals(v8Var3.m())) {
                                    ArrayList arrayList2 = new ArrayList(v8Var3.g());
                                    int i25 = 0;
                                    while (true) {
                                        if (i25 >= arrayList2.size()) {
                                            y8 F = z8.F();
                                            F.g("quantity");
                                            F.i(1L);
                                            v8Var3.j((z8) F.d());
                                            break;
                                        }
                                        if ("quantity".equals(((z8) arrayList2.get(i25)).u())) {
                                            break;
                                        }
                                        i25++;
                                    }
                                }
                            }
                            if (!I) {
                                j4Var.j0();
                                String m11 = v8Var3.m();
                                c7.c0.d(m11);
                                if (m11.hashCode() != 95027 || !m11.equals("_ui")) {
                                    str3 = str10;
                                    str4 = str11;
                                    z13 = false;
                                    if (z13) {
                                        j4Var.y(v8Var3);
                                    }
                                    if ("_e".equals(v8Var3.m())) {
                                        d9Var2 = d9Var;
                                        i15 = i11;
                                        if ("_vs".equals(v8Var3.m())) {
                                            j4Var.j0();
                                            if (l4.C((w8) v8Var3.d(), "_et") == null) {
                                                if (v8Var != null && Math.abs(v8Var.o() - v8Var3.o()) <= 1000) {
                                                    v8 v8Var4 = (v8) v8Var.clone();
                                                    if (j4Var.K(v8Var4, v8Var3)) {
                                                        i16 = i12;
                                                        d9Var2.V(i16, v8Var4);
                                                        i19 = i15;
                                                        v8Var = null;
                                                        v8Var2 = null;
                                                    }
                                                }
                                                i20 = i12;
                                                v8Var2 = v8Var3;
                                                i19 = i3;
                                                if (j4Var.e0().D(null, e0.f8619e1)) {
                                                }
                                                if (v8Var3.h() != 0) {
                                                }
                                                i17 = i23;
                                                ((ArrayList) e1Var.f8667d).set(i17, (w8) v8Var3.d());
                                                d9Var2.W(v8Var3);
                                                i22 = i3 + 1;
                                            }
                                            i16 = i12;
                                            i19 = i15;
                                        } else {
                                            i16 = i12;
                                            if (("_f".equals(v8Var3.m()) || "_v".equals(v8Var3.m())) && ("_f".equals(v8Var3.m()) || "_v".equals(v8Var3.m()))) {
                                                int i26 = 0;
                                                while (true) {
                                                    if (i26 >= v8Var3.h()) {
                                                        break;
                                                    }
                                                    z8 i27 = v8Var3.i(i26);
                                                    if ("_elt".equals(i27.u())) {
                                                        v8Var3.q(i27.y());
                                                        v8Var3.l(i26);
                                                        break;
                                                    }
                                                    i26++;
                                                }
                                            }
                                            i19 = i15;
                                        }
                                    } else {
                                        j4Var.j0();
                                        if (l4.C((w8) v8Var3.d(), "_fr") == null) {
                                            if (v8Var2 != null && Math.abs(v8Var2.o() - v8Var3.o()) <= 1000) {
                                                v8 v8Var5 = (v8) v8Var2.clone();
                                                if (j4Var.K(v8Var3, v8Var5)) {
                                                    d9Var2 = d9Var;
                                                    int i28 = i11;
                                                    d9Var2.V(i28, v8Var5);
                                                    i19 = i28;
                                                    i20 = i12;
                                                    v8Var = null;
                                                    v8Var2 = null;
                                                    if (j4Var.e0().D(null, e0.f8619e1) && v8Var3.t() && !v8Var3.r()) {
                                                        z15 = j4Var.j0().z(v8Var3.u());
                                                        if (z15 != 0) {
                                                            v8Var3.s(z15);
                                                        }
                                                        v8Var3.b();
                                                        ((w8) v8Var3.f2389e).t(0L);
                                                    }
                                                    if (v8Var3.h() != 0) {
                                                        j4Var.j0();
                                                        Bundle B = l4.B(v8Var3.g());
                                                        int i29 = 0;
                                                        while (i29 < v8Var3.h()) {
                                                            z8 i30 = v8Var3.i(i29);
                                                            String str15 = str14;
                                                            if (!i30.u().equals(str15) || i30.D().isEmpty()) {
                                                                i18 = i29;
                                                                str7 = str3;
                                                                if (!i30.u().equals(str15)) {
                                                                    j4Var.x(v8Var3.m(), (y8) i30.k(), B, ((e9) e1Var.f8665b).t());
                                                                }
                                                            } else {
                                                                String t10 = ((e9) e1Var.f8665b).t();
                                                                com.google.android.gms.internal.measurement.t1 D = i30.D();
                                                                Bundle[] bundleArr = new Bundle[D.size()];
                                                                i18 = i29;
                                                                int i31 = 0;
                                                                while (i31 < D.size()) {
                                                                    z8 z8Var = (z8) D.get(i31);
                                                                    j4Var.j0();
                                                                    Bundle B2 = l4.B(z8Var.D());
                                                                    Iterator it = z8Var.D().iterator();
                                                                    while (it.hasNext()) {
                                                                        j4Var.x(v8Var3.m(), (y8) ((z8) it.next()).k(), B2, t10);
                                                                        D = D;
                                                                        str3 = str3;
                                                                    }
                                                                    bundleArr[i31] = B2;
                                                                    i31++;
                                                                    D = D;
                                                                    str3 = str3;
                                                                }
                                                                str7 = str3;
                                                                B.putParcelableArray(str15, bundleArr);
                                                            }
                                                            i29 = i18 + 1;
                                                            str3 = str7;
                                                            str14 = str15;
                                                        }
                                                        str5 = str14;
                                                        str6 = str3;
                                                        v8Var3.b();
                                                        ((w8) v8Var3.f2389e).N();
                                                        l4 j02 = j4Var.j0();
                                                        ArrayList arrayList3 = new ArrayList();
                                                        for (String str16 : B.keySet()) {
                                                            y8 F2 = z8.F();
                                                            F2.g(str16);
                                                            Object obj = B.get(str16);
                                                            if (obj != null) {
                                                                j02.Q(F2, obj);
                                                                arrayList3.add((z8) F2.d());
                                                            }
                                                        }
                                                        int size2 = arrayList3.size();
                                                        int i32 = 0;
                                                        while (i32 < size2) {
                                                            Object obj2 = arrayList3.get(i32);
                                                            i32++;
                                                            v8Var3.j((z8) obj2);
                                                        }
                                                    } else {
                                                        str5 = str14;
                                                        str6 = str3;
                                                    }
                                                    i17 = i23;
                                                    ((ArrayList) e1Var.f8667d).set(i17, (w8) v8Var3.d());
                                                    d9Var2.W(v8Var3);
                                                    i22 = i3 + 1;
                                                }
                                            }
                                            d9Var2 = d9Var;
                                            v8Var = v8Var3;
                                            i19 = i11;
                                            i20 = i3;
                                            if (j4Var.e0().D(null, e0.f8619e1)) {
                                                z15 = j4Var.j0().z(v8Var3.u());
                                                if (z15 != 0) {
                                                }
                                                v8Var3.b();
                                                ((w8) v8Var3.f2389e).t(0L);
                                            }
                                            if (v8Var3.h() != 0) {
                                            }
                                            i17 = i23;
                                            ((ArrayList) e1Var.f8667d).set(i17, (w8) v8Var3.d());
                                            d9Var2.W(v8Var3);
                                            i22 = i3 + 1;
                                        } else {
                                            d9Var2 = d9Var;
                                            i15 = i11;
                                            i16 = i12;
                                            i19 = i15;
                                        }
                                    }
                                    i20 = i16;
                                    if (j4Var.e0().D(null, e0.f8619e1)) {
                                    }
                                    if (v8Var3.h() != 0) {
                                    }
                                    i17 = i23;
                                    ((ArrayList) e1Var.f8667d).set(i17, (w8) v8Var3.d());
                                    d9Var2.W(v8Var3);
                                    i22 = i3 + 1;
                                }
                            }
                            z11 = false;
                            z12 = false;
                            for (i13 = 0; i13 < v8Var3.h(); i13++) {
                                if ("_c".equals(v8Var3.i(i13).u())) {
                                    y8 y8Var2 = (y8) v8Var3.i(i13).k();
                                    y8Var2.i(1L);
                                    z8 z8Var2 = (z8) y8Var2.d();
                                    v8Var3.b();
                                    ((w8) v8Var3.f2389e).K(i13, z8Var2);
                                    z11 = true;
                                } else if ("_r".equals(v8Var3.i(i13).u())) {
                                    y8 y8Var3 = (y8) v8Var3.i(i13).k();
                                    y8Var3.i(1L);
                                    z8 z8Var3 = (z8) y8Var3.d();
                                    v8Var3.b();
                                    ((w8) v8Var3.f2389e).K(i13, z8Var3);
                                    z12 = true;
                                }
                            }
                            if (z11 && I) {
                                z13 = I;
                                j4Var.b().z().b(q1Var.m().a(v8Var3.m()), "Marking event as conversion");
                                y8 F3 = z8.F();
                                F3.g("_c");
                                str3 = str10;
                                str4 = str11;
                                F3.i(1L);
                                v8Var3.k(F3);
                            } else {
                                z13 = I;
                                str3 = str10;
                                str4 = str11;
                            }
                            if (!z12) {
                                j4Var.b().z().b(q1Var.m().a(v8Var3.m()), "Marking event as real-time");
                                y8 F4 = z8.F();
                                F4.g("_r");
                                F4.i(1L);
                                v8Var3.k(F4);
                            }
                            if (j4Var.g0().y0(j4Var.g(), ((e9) e1Var.f8665b).t(), false, true, false, false).f8751e > j4Var.e0().B(((e9) e1Var.f8665b).t(), e0.f8642p)) {
                                E(v8Var3, "_r");
                            } else {
                                z17 = true;
                            }
                            if (p4.s0(v8Var3.m()) && z13 && j4Var.g0().y0(j4Var.g(), ((e9) e1Var.f8665b).t(), true, false, false, false).f8749c > j4Var.e0().B(((e9) e1Var.f8665b).t(), e0.f8640o)) {
                                j4Var.b().x().b(v0.A(((e9) e1Var.f8665b).t()), "Too many conversions. Not logging as conversion. appId");
                                z14 = false;
                                y8Var = null;
                                int i33 = -1;
                                for (i14 = 0; i14 < v8Var3.h(); i14++) {
                                    z8 i34 = v8Var3.i(i14);
                                    if ("_c".equals(i34.u())) {
                                        y8Var = (y8) i34.k();
                                        i33 = i14;
                                    } else if ("_err".equals(i34.u())) {
                                        z14 = true;
                                    }
                                }
                                if (z14) {
                                    if (y8Var != null) {
                                        v8Var3.l(i33);
                                    } else {
                                        y8Var = null;
                                    }
                                }
                                if (y8Var == null) {
                                    y8 y8Var4 = (y8) y8Var.clone();
                                    y8Var4.g("_err");
                                    y8Var4.i(10L);
                                    z8 z8Var4 = (z8) y8Var4.d();
                                    v8Var3.b();
                                    ((w8) v8Var3.f2389e).K(i33, z8Var4);
                                } else {
                                    j4Var.b().w().b(v0.A(((e9) e1Var.f8665b).t()), "Did not find conversion parameter. appId");
                                }
                            }
                            if (z13) {
                            }
                            if ("_e".equals(v8Var3.m())) {
                            }
                            i20 = i16;
                            if (j4Var.e0().D(null, e0.f8619e1)) {
                            }
                            if (v8Var3.h() != 0) {
                            }
                            i17 = i23;
                            ((ArrayList) e1Var.f8667d).set(i17, (w8) v8Var3.d());
                            d9Var2.W(v8Var3);
                            i22 = i3 + 1;
                        }
                        y8 F5 = z8.F();
                        F5.g("_ct");
                        if (!z16) {
                            String t11 = ((e9) e1Var.f8665b).t();
                            if (j4Var.R(t11, str11) && j4Var.R(t11, "_iap") && j4Var.R(t11, "ecommerce_purchase")) {
                                str8 = "new";
                                F5.h(str8);
                                v8Var3.j((z8) F5.d());
                                z16 = true;
                                if (v8Var3.m().equals(d2.g(str10, d2.f8585f, d2.f8580a))) {
                                }
                                e02 = j4Var.e0();
                                d0Var = e0.f8622f1;
                                if (e02.D(null, d0Var)) {
                                    v8Var3.n("_iap");
                                    j4Var.b().z().a("Renaming in_app_purchase to _iap");
                                }
                                I = j4Var.f0().I(((e9) e1Var.f8665b).t(), v8Var3.m());
                                if (j4Var.e0().D(null, d0Var)) {
                                    I = j4Var.y(v8Var3);
                                    String t62 = ((e9) e1Var.f8665b).t();
                                    if ("_iap".equals(v8Var3.m())) {
                                    }
                                    if (!"_iap".equals(v8Var3.m())) {
                                    }
                                }
                                if (!I) {
                                }
                                z11 = false;
                                z12 = false;
                                while (i13 < v8Var3.h()) {
                                }
                                if (z11) {
                                }
                                z13 = I;
                                str3 = str10;
                                str4 = str11;
                                if (!z12) {
                                }
                                if (j4Var.g0().y0(j4Var.g(), ((e9) e1Var.f8665b).t(), false, true, false, false).f8751e > j4Var.e0().B(((e9) e1Var.f8665b).t(), e0.f8642p)) {
                                }
                                if (p4.s0(v8Var3.m())) {
                                    j4Var.b().x().b(v0.A(((e9) e1Var.f8665b).t()), "Too many conversions. Not logging as conversion. appId");
                                    z14 = false;
                                    y8Var = null;
                                    int i332 = -1;
                                    while (i14 < v8Var3.h()) {
                                    }
                                    if (z14) {
                                    }
                                    if (y8Var == null) {
                                    }
                                }
                                if (z13) {
                                }
                                if ("_e".equals(v8Var3.m())) {
                                }
                                i20 = i16;
                                if (j4Var.e0().D(null, e0.f8619e1)) {
                                }
                                if (v8Var3.h() != 0) {
                                }
                                i17 = i23;
                                ((ArrayList) e1Var.f8667d).set(i17, (w8) v8Var3.d());
                                d9Var2.W(v8Var3);
                                i22 = i3 + 1;
                            }
                        }
                        str8 = "returning";
                        F5.h(str8);
                        v8Var3.j((z8) F5.d());
                        z16 = true;
                        if (v8Var3.m().equals(d2.g(str10, d2.f8585f, d2.f8580a))) {
                        }
                        e02 = j4Var.e0();
                        d0Var = e0.f8622f1;
                        if (e02.D(null, d0Var)) {
                        }
                        I = j4Var.f0().I(((e9) e1Var.f8665b).t(), v8Var3.m());
                        if (j4Var.e0().D(null, d0Var)) {
                        }
                        if (!I) {
                        }
                        z11 = false;
                        z12 = false;
                        while (i13 < v8Var3.h()) {
                        }
                        if (z11) {
                        }
                        z13 = I;
                        str3 = str10;
                        str4 = str11;
                        if (!z12) {
                        }
                        if (j4Var.g0().y0(j4Var.g(), ((e9) e1Var.f8665b).t(), false, true, false, false).f8751e > j4Var.e0().B(((e9) e1Var.f8665b).t(), e0.f8642p)) {
                        }
                        if (p4.s0(v8Var3.m())) {
                        }
                        if (z13) {
                        }
                        if ("_e".equals(v8Var3.m())) {
                        }
                        i20 = i16;
                        if (j4Var.e0().D(null, e0.f8619e1)) {
                        }
                        if (v8Var3.h() != 0) {
                        }
                        i17 = i23;
                        ((ArrayList) e1Var.f8667d).set(i17, (w8) v8Var3.d());
                        d9Var2.W(v8Var3);
                        i22 = i3 + 1;
                    }
                    i21 = i17 + 1;
                    str11 = str4;
                    str12 = str5;
                    l12 = l10;
                    str10 = str6;
                    str9 = str2;
                }
                int i35 = i3;
                int i36 = 0;
                long j10 = 0;
                while (i36 < i35) {
                    w8 Y1 = ((e9) d9Var2.f2389e).Y1(i36);
                    if ("_e".equals(Y1.y())) {
                        j4Var.j0();
                        if (l4.C(Y1, "_fr") != null) {
                            d9Var2.X(i36);
                            i35--;
                            i36--;
                            i36++;
                        }
                    }
                    j4Var.j0();
                    z8 C = l4.C(Y1, "_et");
                    if (C != null) {
                        Long valueOf = C.x() ? Long.valueOf(C.y()) : null;
                        if (valueOf != null && valueOf.longValue() > 0) {
                            j10 += valueOf.longValue();
                        }
                    }
                    i36++;
                }
                j4Var.J(d9Var2, j10, false);
                Iterator it2 = d9Var2.T().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if ("_s".equals(((w8) it2.next()).y())) {
                        j4Var.g0().m0(d9Var2.n(), "_se");
                        break;
                    }
                }
                if (l4.e0(d9Var2, "_sid") >= 0) {
                    j4Var.J(d9Var2, j10, true);
                } else {
                    int e03 = l4.e0(d9Var2, "_se");
                    if (e03 >= 0) {
                        d9Var2.b();
                        ((e9) d9Var2.f2389e).i0(e03);
                        j4Var.b().w().b(v0.A(((e9) e1Var.f8665b).t()), "Session engagement user property is in the bundle without session ID. appId");
                    }
                }
                String t12 = ((e9) e1Var.f8665b).t();
                j4Var.d().s();
                j4Var.l0();
                a1 w03 = j4Var.g0().w0(t12);
                if (w03 == null) {
                    j4Var.b().w().b(v0.A(t12), "Cannot fix consent fields without appInfo. appId");
                } else {
                    j4Var.m(w03, d9Var2);
                }
                String t13 = ((e9) e1Var.f8665b).t();
                j4Var.d().s();
                j4Var.l0();
                a1 w04 = j4Var.g0().w0(t13);
                if (w04 == null) {
                    j4Var.b().x().b(v0.A(t13), "Cannot populate ad_campaign_info without appInfo. appId");
                } else {
                    j4Var.n(w04, d9Var2);
                }
                d9Var2.b();
                ((e9) d9Var2.f2389e).l0(Long.MAX_VALUE);
                d9Var2.b();
                ((e9) d9Var2.f2389e).m0(Long.MIN_VALUE);
                for (int i37 = 0; i37 < d9Var2.U(); i37++) {
                    w8 Y12 = ((e9) d9Var2.f2389e).Y1(i37);
                    if (Y12.A() < ((e9) d9Var2.f2389e).f2()) {
                        long A = Y12.A();
                        d9Var2.b();
                        ((e9) d9Var2.f2389e).l0(A);
                    }
                    if (Y12.A() > ((e9) d9Var2.f2389e).h2()) {
                        long A2 = Y12.A();
                        d9Var2.b();
                        ((e9) d9Var2.f2389e).m0(A2);
                    }
                }
                d9Var2.L();
                c2 c2Var = c2.f8555c;
                c2 j11 = j4Var.c(((e9) e1Var.f8665b).t()).j(c2.c(100, ((e9) e1Var.f8665b).y0()));
                c2 b02 = j4Var.g0().b0(((e9) e1Var.f8665b).t());
                j4Var.g0().a0(((e9) e1Var.f8665b).t(), j11);
                b2 b2Var = b2.ANALYTICS_STORAGE;
                if (!j11.i(b2Var) && b02.i(b2Var)) {
                    j4Var.g0().k0(((e9) e1Var.f8665b).t());
                } else if (j11.i(b2Var) && !b02.i(b2Var)) {
                    j4Var.g0().l0(((e9) e1Var.f8665b).t());
                }
                b2 b2Var2 = b2.AD_STORAGE;
                if (!j11.i(b2Var2)) {
                    d9Var2.b();
                    ((e9) d9Var2.f2389e).D1();
                    d9Var2.b();
                    ((e9) d9Var2.f2389e).F1();
                    d9Var2.b();
                    ((e9) d9Var2.f2389e).W0();
                }
                if (!j11.i(b2Var)) {
                    d9Var2.b();
                    ((e9) d9Var2.f2389e).H1();
                    d9Var2.b();
                    ((e9) d9Var2.f2389e).d1();
                }
                com.google.android.gms.internal.measurement.i4.a();
                if (j4Var.e0().D(((e9) e1Var.f8665b).t(), e0.O0)) {
                    j4Var.k0();
                    if (p4.U((String) e0.f8645q0.a(null), ((e9) e1Var.f8665b).t()) && j4Var.c(((e9) e1Var.f8665b).t()).i(b2Var2) && ((e9) e1Var.f8665b).D0()) {
                        j4Var.w(d9Var2, e1Var);
                    }
                }
                d9Var2.b();
                ((e9) d9Var2.f2389e).P1();
                d9Var2.I(j4Var.i0().w(d9Var2.n(), d9Var2.T(), Collections.unmodifiableList(((e9) d9Var2.f2389e).Z1()), Long.valueOf(((e9) d9Var2.f2389e).f2()), Long.valueOf(((e9) d9Var2.f2389e).h2()), !j11.i(b2Var)));
                if (j4Var.e0().u(((e9) e1Var.f8665b).t())) {
                    HashMap hashMap = new HashMap();
                    ArrayList arrayList4 = new ArrayList();
                    SecureRandom r02 = j4Var.k0().r0();
                    int i38 = 0;
                    while (i38 < d9Var2.U()) {
                        v8 v8Var6 = (v8) ((e9) d9Var2.f2389e).Y1(i38).k();
                        if (v8Var6.m().equals("_ep")) {
                            j4Var.j0();
                            String str17 = (String) l4.E((w8) v8Var6.d(), "_en");
                            r rVar = (r) hashMap.get(str17);
                            if (rVar == null) {
                                m g02 = j4Var.g0();
                                String t14 = ((e9) e1Var.f8665b).t();
                                c7.c0.g(str17);
                                rVar = g02.S("events", t14, str17);
                                if (rVar != null) {
                                    hashMap.put(str17, rVar);
                                }
                            }
                            if (rVar == null || rVar.f8966i != null) {
                                l11 = l10;
                            } else {
                                Long l13 = rVar.j;
                                if (l13 != null && l13.longValue() > 1) {
                                    j4Var.j0();
                                    l4.A(v8Var6, "_sr", l13);
                                }
                                Boolean bool = rVar.f8967k;
                                if (bool == null || !bool.booleanValue()) {
                                    l11 = l10;
                                } else {
                                    j4Var.j0();
                                    l11 = l10;
                                    l4.A(v8Var6, "_efs", l11);
                                }
                                arrayList4.add((w8) v8Var6.d());
                            }
                            d9Var2.V(i38, v8Var6);
                        } else {
                            l11 = l10;
                            k1 f02 = j4Var.f0();
                            String t15 = ((e9) e1Var.f8665b).t();
                            String c10 = f02.c(t15, "measurement.account.time_zone_offset_minutes");
                            if (!TextUtils.isEmpty(c10)) {
                                try {
                                    parseLong = Long.parseLong(c10);
                                } catch (NumberFormatException e2) {
                                    ((q1) f02.f1478d).b().x().c(v0.A(t15), e2, "Unable to parse timezone offset. appId");
                                }
                                j4Var.k0();
                                long j12 = parseLong * 60000;
                                long o6 = (v8Var6.o() + j12) / 86400000;
                                w8 w8Var = (w8) v8Var6.d();
                                if (!TextUtils.isEmpty("_dbg")) {
                                    for (z8 z8Var5 : w8Var.v()) {
                                        j3 = j12;
                                        if (!"_dbg".equals(z8Var5.u())) {
                                            j12 = j3;
                                        } else if (l11.equals(Long.valueOf(z8Var5.y()))) {
                                            i10 = 1;
                                            if (i10 > 0) {
                                            }
                                        } else {
                                            i10 = f0().K(((e9) e1Var.f8665b).t(), v8Var6.m());
                                            if (i10 > 0) {
                                                b().x().c(v8Var6.m(), Integer.valueOf(i10), "Sample rate must be positive. event, rate");
                                                arrayList4.add((w8) v8Var6.d());
                                                d9Var2.V(i38, v8Var6);
                                            } else {
                                                r rVar2 = (r) hashMap.get(v8Var6.m());
                                                if (rVar2 == null && (rVar2 = g0().S("events", ((e9) e1Var.f8665b).t(), v8Var6.m())) == null) {
                                                    b().x().c(((e9) e1Var.f8665b).t(), v8Var6.m(), "Event being bundled has no eventAggregate. appId, eventName");
                                                    rVar2 = new r(((e9) e1Var.f8665b).t(), v8Var6.m(), 1L, 1L, 1L, v8Var6.o(), 0L, null, null, null, null);
                                                }
                                                j0();
                                                Long l14 = (Long) l4.E((w8) v8Var6.d(), "_eid");
                                                boolean z18 = l14 != null;
                                                if (i10 == 1) {
                                                    arrayList4.add((w8) v8Var6.d());
                                                    if (z18 && (rVar2.f8966i != null || rVar2.j != null || rVar2.f8967k != null)) {
                                                        hashMap.put(v8Var6.m(), rVar2.b(null, null, null));
                                                    }
                                                    d9Var2.V(i38, v8Var6);
                                                } else {
                                                    if (r02.nextInt(i10) == 0) {
                                                        j0();
                                                        Long valueOf2 = Long.valueOf(i10);
                                                        l4.A(v8Var6, "_sr", valueOf2);
                                                        arrayList4.add((w8) v8Var6.d());
                                                        if (z18) {
                                                            rVar2 = rVar2.b(null, valueOf2, null);
                                                        }
                                                        hashMap.put(v8Var6.m(), new r(rVar2.f8959a, rVar2.f8960b, rVar2.f8961c, rVar2.f8962d, rVar2.f8963e, rVar2.f8964f, v8Var6.o(), Long.valueOf(o6), rVar2.f8966i, rVar2.j, rVar2.f8967k));
                                                        l10 = l11;
                                                    } else {
                                                        Long l15 = rVar2.f8965h;
                                                        if (l15 != null) {
                                                            p4 = l15.longValue();
                                                        } else {
                                                            k0();
                                                            p4 = (j3 + v8Var6.p()) / 86400000;
                                                        }
                                                        if (p4 != o6) {
                                                            j0();
                                                            l4.A(v8Var6, "_efs", l11);
                                                            j0();
                                                            Long valueOf3 = Long.valueOf(i10);
                                                            l4.A(v8Var6, "_sr", valueOf3);
                                                            arrayList4.add((w8) v8Var6.d());
                                                            if (z18) {
                                                                rVar2 = rVar2.b(null, valueOf3, Boolean.TRUE);
                                                            }
                                                            l10 = l11;
                                                            hashMap.put(v8Var6.m(), new r(rVar2.f8959a, rVar2.f8960b, rVar2.f8961c, rVar2.f8962d, rVar2.f8963e, rVar2.f8964f, v8Var6.o(), Long.valueOf(o6), rVar2.f8966i, rVar2.j, rVar2.f8967k));
                                                        } else {
                                                            l10 = l11;
                                                            if (z18) {
                                                                hashMap.put(v8Var6.m(), rVar2.b(l14, null, null));
                                                                d9Var2.V(i38, v8Var6);
                                                                i38++;
                                                                j4Var = this;
                                                            }
                                                        }
                                                    }
                                                    d9Var2.V(i38, v8Var6);
                                                    i38++;
                                                    j4Var = this;
                                                }
                                            }
                                        }
                                    }
                                }
                                j3 = j12;
                                i10 = f0().K(((e9) e1Var.f8665b).t(), v8Var6.m());
                                if (i10 > 0) {
                                }
                            }
                            parseLong = 0;
                            j4Var.k0();
                            long j122 = parseLong * 60000;
                            long o62 = (v8Var6.o() + j122) / 86400000;
                            w8 w8Var2 = (w8) v8Var6.d();
                            if (!TextUtils.isEmpty("_dbg")) {
                            }
                            j3 = j122;
                            i10 = f0().K(((e9) e1Var.f8665b).t(), v8Var6.m());
                            if (i10 > 0) {
                            }
                        }
                        l10 = l11;
                        i38++;
                        j4Var = this;
                    }
                    if (arrayList4.size() < d9Var2.U()) {
                        d9Var2.b();
                        ((e9) d9Var2.f2389e).e0();
                        d9Var2.b();
                        ((e9) d9Var2.f2389e).d0(arrayList4);
                    }
                    Iterator it3 = hashMap.entrySet().iterator();
                    while (it3.hasNext()) {
                        g0().T("events", (r) ((Map.Entry) it3.next()).getValue());
                    }
                }
                String t16 = ((e9) e1Var.f8665b).t();
                a1 w05 = g0().w0(t16);
                if (w05 == null) {
                    b().w().b(v0.A(((e9) e1Var.f8665b).t()), "Bundling raw events w/o app info. appId");
                } else if (d9Var2.U() > 0) {
                    o1 o1Var = w05.f8474a.f8938u;
                    q1.l(o1Var);
                    o1Var.s();
                    long j13 = w05.f8481i;
                    if (j13 != 0) {
                        d9Var2.g(j13);
                    } else {
                        d9Var2.h();
                    }
                    o1 o1Var2 = w05.f8474a.f8938u;
                    q1.l(o1Var2);
                    o1Var2.s();
                    long j14 = w05.f8480h;
                    if (j14 != 0) {
                        j13 = j14;
                    }
                    if (j13 != 0) {
                        d9Var2.a0(j13);
                    } else {
                        d9Var2.b0();
                    }
                    w05.h(d9Var2.U());
                    o1 o1Var3 = w05.f8474a.f8938u;
                    q1.l(o1Var3);
                    o1Var3.s();
                    int i39 = (int) w05.F;
                    d9Var2.b();
                    ((e9) d9Var2.f2389e).n1(i39);
                    o1 o1Var4 = w05.f8474a.f8938u;
                    q1.l(o1Var4);
                    o1Var4.s();
                    d9Var2.w((int) w05.g);
                    w05.M(((e9) d9Var2.f2389e).f2());
                    w05.N(((e9) d9Var2.f2389e).h2());
                    String v10 = w05.v();
                    if (v10 != null) {
                        d9Var2.E(v10);
                    } else {
                        d9Var2.F();
                    }
                    g0().x0(w05, false);
                }
                if (d9Var2.U() > 0) {
                    q1Var.getClass();
                    if (e0().D(((e9) e1Var.f8665b).t(), e0.f8631j1)) {
                        String n10 = d9Var2.n();
                        if (!TextUtils.isEmpty(n10) && (w02 = g0().w0(n10)) != null) {
                            f().getClass();
                            long currentTimeMillis = System.currentTimeMillis();
                            o1 o1Var5 = w02.f8474a.f8938u;
                            q1.l(o1Var5);
                            o1Var5.s();
                            if (currentTimeMillis - w02.J >= e0().A(n10, e0.B0)) {
                                List Z = g0().Z("");
                                if (!Z.isEmpty()) {
                                    d9Var2.b();
                                    ((e9) d9Var2.f2389e).W1(Z);
                                }
                                List Z2 = g0().Z(n10);
                                if (!Z2.isEmpty()) {
                                    d9Var2.b();
                                    ((e9) d9Var2.f2389e).W1(Z2);
                                }
                                w02.u(currentTimeMillis);
                                g0().x0(w02, false);
                            }
                        }
                    }
                    a8 E = f0().E(((e9) e1Var.f8665b).t());
                    if (E != null && E.t()) {
                        long u2 = E.u();
                        d9Var2.b();
                        ((e9) d9Var2.f2389e).U0(u2);
                        g0().B0((e9) d9Var2.d(), z17);
                    }
                    if (((e9) e1Var.f8665b).I().isEmpty()) {
                        d9Var2.b();
                        ((e9) d9Var2.f2389e).U0(-1L);
                    } else {
                        b().x().b(v0.A(((e9) e1Var.f8665b).t()), "Did not find measurement config or missing version info. appId");
                    }
                    g0().B0((e9) d9Var2.d(), z17);
                }
                g0().I((ArrayList) e1Var.f8666c);
                m g03 = g0();
                try {
                    g03.j0().execSQL("delete from raw_events_metadata where app_id=? and metadata_fingerprint not in (select distinct metadata_fingerprint from raw_events where app_id=?)", new String[]{t16, t16});
                } catch (SQLiteException e9) {
                    ((q1) g03.f1478d).b().w().c(v0.A(t16), e9, "Failed to remove unused event metadata. appId");
                }
                g0().h0();
                z10 = true;
            }
            g0().i0();
            return z10;
        } catch (Throwable th) {
            g0().i0();
            throw th;
        }
    }

    public final void J(d9 d9Var, long j, boolean z10) {
        n4 n4Var;
        Object obj;
        String str = true != z10 ? "_lte" : "_se";
        m mVar = this.f8762i;
        T(mVar);
        n4 o02 = mVar.o0(d9Var.n(), str);
        if (o02 == null || (obj = o02.f8885e) == null) {
            String n10 = d9Var.n();
            f().getClass();
            n4Var = new n4(n10, "auto", str, System.currentTimeMillis(), Long.valueOf(j));
        } else {
            String n11 = d9Var.n();
            f().getClass();
            n4Var = new n4(n11, "auto", str, System.currentTimeMillis(), Long.valueOf(((Long) obj).longValue() + j));
        }
        m9 E = n9.E();
        E.b();
        ((n9) E.f2389e).G(str);
        f().getClass();
        long currentTimeMillis = System.currentTimeMillis();
        E.b();
        ((n9) E.f2389e).F(currentTimeMillis);
        Object obj2 = n4Var.f8885e;
        long longValue = ((Long) obj2).longValue();
        E.b();
        ((n9) E.f2389e).J(longValue);
        n9 n9Var = (n9) E.d();
        int e02 = l4.e0(d9Var, str);
        if (e02 >= 0) {
            d9Var.b();
            ((e9) d9Var.f2389e).g0(e02, n9Var);
        } else {
            d9Var.b();
            ((e9) d9Var.f2389e).h0(n9Var);
        }
        if (j > 0) {
            m mVar2 = this.f8762i;
            T(mVar2);
            mVar2.n0(n4Var);
            b().B.c(true != z10 ? "lifetime" : "session-scoped", obj2, "Updated engagement user property. scope, value");
        }
    }

    public final boolean K(v8 v8Var, v8 v8Var2) {
        c7.c0.b("_e".equals(v8Var.m()));
        j0();
        z8 C = l4.C((w8) v8Var.d(), "_sc");
        String w6 = C == null ? null : C.w();
        j0();
        z8 C2 = l4.C((w8) v8Var2.d(), "_pc");
        String w10 = C2 != null ? C2.w() : null;
        if (w10 == null || !w10.equals(w6)) {
            return false;
        }
        c7.c0.b("_e".equals(v8Var.m()));
        j0();
        z8 C3 = l4.C((w8) v8Var.d(), "_et");
        if (C3 == null || !C3.x() || C3.y() <= 0) {
            return true;
        }
        long y3 = C3.y();
        j0();
        z8 C4 = l4.C((w8) v8Var2.d(), "_et");
        if (C4 != null && C4.y() > 0) {
            y3 += C4.y();
        }
        j0();
        l4.A(v8Var2, "_et", Long.valueOf(y3));
        j0();
        l4.A(v8Var, "_fr", 1L);
        return true;
    }

    public final void L(v8 v8Var, String str, String str2) {
        ArrayList arrayList = new ArrayList(v8Var.g());
        int i3 = 0;
        while (true) {
            if (i3 >= arrayList.size()) {
                i3 = -1;
                break;
            } else if (str.equals(((z8) arrayList.get(i3)).u())) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 == -1) {
            return;
        }
        double C = v8Var.i(i3).C() * 1000000.0d;
        if (C == 0.0d) {
            C = v8Var.i(i3).y() * 1000000.0d;
        }
        if (C > 9.223372036854776E18d || C < -9.223372036854776E18d) {
            b().f9053w.c(v0.A(str2), Double.valueOf(C), n0.l.g("Data lost. Purchase ", str, " is too big. appId"));
            return;
        }
        v8Var.l(i3);
        y8 F = z8.F();
        F.g(str);
        F.i(Math.round(C));
        v8Var.j((z8) F.d());
    }

    public final boolean M() {
        d().s();
        l0();
        m mVar = this.f8762i;
        T(mVar);
        if (mVar.O("select count(1) > 0 from raw_events", null) != 0) {
            return true;
        }
        m mVar2 = this.f8762i;
        T(mVar2);
        return !TextUtils.isEmpty(mVar2.A());
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x012e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void N() {
        boolean z10;
        long max;
        long max2;
        long j;
        int i3;
        Integer num;
        int intValue;
        l4 l4Var = this.f8766u;
        d().s();
        l0();
        if (this.C > 0) {
            f().getClass();
            long abs = 3600000 - Math.abs(SystemClock.elapsedRealtime() - this.C);
            if (abs > 0) {
                b().B.b(Long.valueOf(abs), "Upload has been suspended. Will update scheduling later in approximately ms");
                h0().a();
                y3 y3Var = this.f8764s;
                T(y3Var);
                y3Var.x();
                return;
            }
            this.C = 0L;
        }
        if (!this.f8771z.h() || !M()) {
            b().B.a("Nothing to upload or uploading impossible");
            h0().a();
            y3 y3Var2 = this.f8764s;
            T(y3Var2);
            y3Var2.x();
            return;
        }
        f().getClass();
        long currentTimeMillis = System.currentTimeMillis();
        e0();
        long max3 = Math.max(0L, ((Long) e0.O.a(null)).longValue());
        m mVar = this.f8762i;
        T(mVar);
        if (mVar.O("select count(1) > 0 from raw_events where realtime = 1", null) == 0) {
            m mVar2 = this.f8762i;
            T(mVar2);
            if (mVar2.O("select count(1) > 0 from queue where has_realtime = 1", null) == 0) {
                z10 = false;
                if (z10) {
                    e0();
                    max = Math.max(0L, ((Long) e0.H.a(null)).longValue());
                } else {
                    String w6 = e0().w("debug.firebase.analytics.app");
                    if (TextUtils.isEmpty(w6) || ".none.".equals(w6)) {
                        e0();
                        max = Math.max(0L, ((Long) e0.I.a(null)).longValue());
                    } else {
                        e0();
                        max = Math.max(0L, ((Long) e0.J.a(null)).longValue());
                    }
                }
                long a9 = this.f8768w.f8878v.a();
                long a10 = this.f8768w.f8879w.a();
                m mVar3 = this.f8762i;
                T(mVar3);
                long P = mVar3.P("select max(bundle_end_timestamp) from queue", null, 0L);
                m mVar4 = this.f8762i;
                T(mVar4);
                max2 = Math.max(P, mVar4.P("select max(timestamp) from raw_events", null, 0L));
                if (max2 != 0) {
                    j = 0;
                } else {
                    long abs2 = currentTimeMillis - Math.abs(max2 - currentTimeMillis);
                    long abs3 = currentTimeMillis - Math.abs(a9 - currentTimeMillis);
                    long abs4 = currentTimeMillis - Math.abs(a10 - currentTimeMillis);
                    long j3 = max3 + abs2;
                    long max4 = Math.max(abs3, abs4);
                    if (z10 && max4 > 0) {
                        j3 = Math.min(abs2, max4) + max;
                    }
                    T(l4Var);
                    j = !l4Var.a0(max4, max) ? max4 + max : j3;
                    if (abs4 != 0 && abs4 >= abs2) {
                        int i10 = 0;
                        while (true) {
                            e0();
                            i3 = 0;
                            if (i10 >= Math.min(20, Math.max(0, ((Integer) e0.Q.a(null)).intValue()))) {
                                j = 0;
                                break;
                            }
                            e0();
                            j += Math.max(0L, ((Long) e0.P.a(null)).longValue()) * (1 << i10);
                            if (j > abs4) {
                                break;
                            } else {
                                i10++;
                            }
                        }
                        if (j == 0) {
                            b().B.a("Next upload time is 0");
                            h0().a();
                            y3 y3Var3 = this.f8764s;
                            T(y3Var3);
                            y3Var3.x();
                            return;
                        }
                        z0 z0Var = this.f8761e;
                        T(z0Var);
                        if (!z0Var.w()) {
                            b().B.a("No network");
                            b1 h0 = h0();
                            j4 j4Var = h0.f8513a;
                            j4Var.l0();
                            j4Var.d().s();
                            if (!h0.f8514b) {
                                j4Var.f8771z.f8932d.registerReceiver(h0, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                                z0 z0Var2 = j4Var.f8761e;
                                T(z0Var2);
                                h0.f8515c = z0Var2.w();
                                j4Var.b().B.b(Boolean.valueOf(h0.f8515c), "Registering connectivity change receiver. Network connected");
                                h0.f8514b = true;
                            }
                            y3 y3Var4 = this.f8764s;
                            T(y3Var4);
                            y3Var4.x();
                            return;
                        }
                        long a11 = this.f8768w.f8877u.a();
                        e0();
                        long max5 = Math.max(0L, ((Long) e0.G.a(null)).longValue());
                        T(l4Var);
                        if (!l4Var.a0(a11, max5)) {
                            j = Math.max(j, a11 + max5);
                        }
                        h0().a();
                        f().getClass();
                        long currentTimeMillis2 = j - System.currentTimeMillis();
                        if (currentTimeMillis2 <= 0) {
                            e0();
                            currentTimeMillis2 = Math.max(0L, ((Long) e0.K.a(null)).longValue());
                            d1 d1Var = this.f8768w.f8878v;
                            f().getClass();
                            d1Var.b(System.currentTimeMillis());
                        }
                        b().B.b(Long.valueOf(currentTimeMillis2), "Upload scheduled in approximately ms");
                        y3 y3Var5 = this.f8764s;
                        T(y3Var5);
                        y3Var5.t();
                        q1 q1Var = (q1) y3Var5.f1478d;
                        q1Var.getClass();
                        v0 v0Var = q1Var.f8937t;
                        Context context = q1Var.f8932d;
                        if (!p4.n0(context)) {
                            q1.l(v0Var);
                            v0Var.A.a("Receiver not registered/enabled");
                        }
                        if (!p4.N(context)) {
                            q1.l(v0Var);
                            v0Var.A.a("Service not registered/enabled");
                        }
                        y3Var5.x();
                        q1.l(v0Var);
                        v0Var.B.b(Long.valueOf(currentTimeMillis2), "Scheduling upload, millis");
                        q1Var.f8942y.getClass();
                        SystemClock.elapsedRealtime();
                        if (currentTimeMillis2 < Math.max(0L, ((Long) e0.L.a(null)).longValue()) && y3Var5.w().f8861c == 0) {
                            y3Var5.w().b(currentTimeMillis2);
                        }
                        ComponentName componentName = new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementJobService");
                        int z11 = y3Var5.z();
                        PersistableBundle persistableBundle = new PersistableBundle();
                        persistableBundle.putString("action", "com.google.android.gms.measurement.UPLOAD");
                        JobInfo build = new JobInfo.Builder(z11, componentName).setMinimumLatency(currentTimeMillis2).setOverrideDeadline(currentTimeMillis2 + currentTimeMillis2).setExtras(persistableBundle).build();
                        Method method = y5.f3006a;
                        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
                        jobScheduler.getClass();
                        Method method2 = y5.f3006a;
                        if (method2 == null || context.checkSelfPermission("android.permission.UPDATE_DEVICE_STATS") != 0) {
                            jobScheduler.schedule(build);
                            return;
                        }
                        Method method3 = y5.f3007b;
                        try {
                            if (method3 != null) {
                                try {
                                    num = (Integer) method3.invoke(UserHandle.class, null);
                                } catch (IllegalAccessException | InvocationTargetException e2) {
                                    if (Log.isLoggable("JobSchedulerCompat", 6)) {
                                        Log.e("JobSchedulerCompat", "myUserId invocation illegal", e2);
                                    }
                                }
                                if (num != null) {
                                    intValue = num.intValue();
                                    return;
                                }
                            }
                            return;
                        } catch (IllegalAccessException | InvocationTargetException e9) {
                            Log.e("UploadAlarm", "error calling scheduleAsPackage", e9);
                            jobScheduler.schedule(build);
                            return;
                        }
                        intValue = i3;
                    }
                }
                i3 = 0;
                if (j == 0) {
                }
            }
        }
        z10 = true;
        if (z10) {
        }
        long a92 = this.f8768w.f8878v.a();
        long a102 = this.f8768w.f8879w.a();
        m mVar32 = this.f8762i;
        T(mVar32);
        long P2 = mVar32.P("select max(bundle_end_timestamp) from queue", null, 0L);
        m mVar42 = this.f8762i;
        T(mVar42);
        max2 = Math.max(P2, mVar42.P("select max(timestamp) from raw_events", null, 0L));
        if (max2 != 0) {
        }
        i3 = 0;
        if (j == 0) {
        }
    }

    public final void O() {
        d().s();
        if (this.H || this.I || this.J) {
            b().B.d("Not stopping services. fetch, network, upload", Boolean.valueOf(this.H), Boolean.valueOf(this.I), Boolean.valueOf(this.J));
            return;
        }
        b().B.a("Stopping uploading service(s)");
        ArrayList arrayList = this.D;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            ((Runnable) obj).run();
        }
        ArrayList arrayList2 = this.D;
        c7.c0.g(arrayList2);
        arrayList2.clear();
    }

    public final Boolean P(a1 a1Var) {
        try {
            long Q = a1Var.Q();
            q1 q1Var = this.f8771z;
            if (Q != -2147483648L) {
                if (a1Var.Q() == i7.b.a(q1Var.f8932d).e(0, a1Var.E()).versionCode) {
                    return Boolean.TRUE;
                }
            } else {
                String str = i7.b.a(q1Var.f8932d).e(0, a1Var.E()).versionName;
                String O = a1Var.O();
                if (O != null && O.equals(str)) {
                    return Boolean.TRUE;
                }
            }
            return Boolean.FALSE;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public final r4 Q(String str) {
        m mVar = this.f8762i;
        T(mVar);
        a1 w02 = mVar.w0(str);
        if (w02 != null) {
            q1 q1Var = w02.f8474a;
            if (!TextUtils.isEmpty(w02.O())) {
                Boolean P = P(w02);
                if (P != null && !P.booleanValue()) {
                    b().f9050t.b(v0.A(str), "App version does not match; dropping. appId");
                    return null;
                }
                String H = w02.H();
                String O = w02.O();
                long Q = w02.Q();
                o1 o1Var = q1Var.f8938u;
                q1.l(o1Var);
                o1Var.s();
                String str2 = w02.f8483l;
                o1 o1Var2 = q1Var.f8938u;
                q1.l(o1Var2);
                o1Var2.s();
                long j = w02.f8484m;
                o1 o1Var3 = q1Var.f8938u;
                q1.l(o1Var3);
                o1Var3.s();
                long j3 = w02.f8485n;
                o1 o1Var4 = q1Var.f8938u;
                q1.l(o1Var4);
                o1Var4.s();
                boolean z10 = w02.f8486o;
                String K = w02.K();
                o1 o1Var5 = q1Var.f8938u;
                q1.l(o1Var5);
                o1Var5.s();
                boolean z11 = w02.f8487p;
                Boolean x10 = w02.x();
                long b10 = w02.b();
                o1 o1Var6 = q1Var.f8938u;
                q1.l(o1Var6);
                o1Var6.s();
                ArrayList arrayList = w02.f8490s;
                String g = c(str).g();
                boolean z12 = w02.z();
                o1 o1Var7 = q1Var.f8938u;
                q1.l(o1Var7);
                o1Var7.s();
                long j10 = w02.f8493v;
                int i3 = c(str).f8557b;
                String str3 = o0(str).f8888b;
                o1 o1Var8 = q1Var.f8938u;
                q1.l(o1Var8);
                o1Var8.s();
                int i10 = w02.f8495x;
                o1 o1Var9 = q1Var.f8938u;
                q1.l(o1Var9);
                o1Var9.s();
                return new r4(str, H, O, Q, str2, j, j3, (String) null, z10, false, K, 0L, 0, z11, false, x10, b10, (List) arrayList, g, "", (String) null, z12, j10, i3, str3, i10, w02.B, w02.D(), w02.s(), 0L, w02.t(), 0L);
            }
        }
        b().A.b(str, "No app data available; dropping");
        return null;
    }

    public final boolean R(String str, String str2) {
        m mVar = this.f8762i;
        T(mVar);
        r S = mVar.S("events", str, str2);
        return S == null || S.f8961c < 1;
    }

    public final void V() {
        d().s();
        l0();
        if (this.B) {
            return;
        }
        this.B = true;
        d().s();
        FileLock fileLock = this.K;
        q1 q1Var = this.f8771z;
        if (fileLock == null || !fileLock.isValid()) {
            ((q1) this.f8762i.f1478d).getClass();
            try {
                FileChannel channel = new RandomAccessFile(new File(new File(q1Var.f8932d.getFilesDir(), "google_app_measurement.db").getPath()), "rw").getChannel();
                this.L = channel;
                FileLock tryLock = channel.tryLock();
                this.K = tryLock;
                if (tryLock == null) {
                    b().f9050t.a("Storage concurrent data access panic");
                    return;
                }
                b().B.a("Storage concurrent access okay");
            } catch (FileNotFoundException e2) {
                b().f9050t.b(e2, "Failed to acquire storage lock");
                return;
            } catch (IOException e9) {
                b().f9050t.b(e9, "Failed to access storage lock file");
                return;
            } catch (OverlappingFileLockException e10) {
                b().f9053w.b(e10, "Storage lock already acquired");
                return;
            }
        } else {
            b().B.a("Storage concurrent access okay");
        }
        FileChannel fileChannel = this.L;
        d().s();
        int i3 = 0;
        if (fileChannel == null || !fileChannel.isOpen()) {
            b().f9050t.a("Bad channel to read from");
        } else {
            ByteBuffer allocate = ByteBuffer.allocate(4);
            try {
                fileChannel.position(0L);
                int read = fileChannel.read(allocate);
                if (read == 4) {
                    allocate.flip();
                    i3 = allocate.getInt();
                } else if (read != -1) {
                    b().f9053w.b(Integer.valueOf(read), "Unexpected data length. Bytes read");
                }
            } catch (IOException e11) {
                b().f9050t.b(e11, "Failed to read from channel");
            }
        }
        m0 q3 = q1Var.q();
        q3.t();
        int i10 = q3.f8833s;
        d().s();
        if (i3 > i10) {
            b().f9050t.c(Integer.valueOf(i3), Integer.valueOf(i10), "Panic: can't downgrade version. Previous, current version");
            return;
        }
        if (i3 < i10) {
            FileChannel fileChannel2 = this.L;
            d().s();
            if (fileChannel2 == null || !fileChannel2.isOpen()) {
                b().f9050t.a("Bad channel to read from");
            } else {
                ByteBuffer allocate2 = ByteBuffer.allocate(4);
                allocate2.putInt(i10);
                allocate2.flip();
                try {
                    fileChannel2.truncate(0L);
                    fileChannel2.write(allocate2);
                    fileChannel2.force(true);
                    if (fileChannel2.size() != 4) {
                        b().f9050t.b(Long.valueOf(fileChannel2.size()), "Error writing to channel. Bytes written");
                    }
                    b().B.c(Integer.valueOf(i3), Integer.valueOf(i10), "Storage version upgraded. Previous, current version");
                    return;
                } catch (IOException e12) {
                    b().f9050t.b(e12, "Failed to write to channel");
                }
            }
            b().f9050t.c(Integer.valueOf(i3), Integer.valueOf(i10), "Storage version upgrade failed. Previous, current version");
        }
    }

    public final void W(m4 m4Var, r4 r4Var) {
        String str;
        long j;
        d().s();
        l0();
        boolean S = S(r4Var);
        String str2 = r4Var.f8976d;
        if (S) {
            if (!r4Var.f8983v) {
                c0(r4Var);
                return;
            }
            p4 k02 = k0();
            String str3 = m4Var.f8852e;
            int B0 = k02.B0(str3);
            g4 g4Var = this.X;
            if (B0 != 0) {
                k0();
                e0();
                String z10 = p4.z(str3, true, 24);
                int length = str3 != null ? str3.length() : 0;
                k0();
                p4.K(g4Var, r4Var.f8976d, B0, "_ev", z10, length);
                return;
            }
            int H = k0().H(m4Var.b(), str3);
            if (H != 0) {
                k0();
                e0();
                String z11 = p4.z(str3, true, 24);
                Object b10 = m4Var.b();
                int length2 = (b10 == null || !((b10 instanceof String) || (b10 instanceof CharSequence))) ? 0 : b10.toString().length();
                k0();
                p4.K(g4Var, r4Var.f8976d, H, "_ev", z11, length2);
                return;
            }
            Object I = k0().I(m4Var.b(), str3);
            if (I != null) {
                if ("_sid".equals(str3)) {
                    long j3 = m4Var.f8853i;
                    String str4 = m4Var.f8856t;
                    c7.c0.g(str2);
                    m mVar = this.f8762i;
                    T(mVar);
                    n4 o02 = mVar.o0(str2, "_sno");
                    if (o02 != null) {
                        Object obj = o02.f8885e;
                        if (obj instanceof Long) {
                            j = ((Long) obj).longValue();
                            str = "_sid";
                            W(new m4(j3, Long.valueOf(j + 1), "_sno", str4), r4Var);
                        }
                    }
                    if (o02 != null) {
                        b().f9053w.b(o02.f8885e, "Retrieved last session number from database does not contain a valid (long) value");
                    }
                    m mVar2 = this.f8762i;
                    T(mVar2);
                    r S2 = mVar2.S("events", str2, "_s");
                    if (S2 != null) {
                        t0 t0Var = b().B;
                        str = "_sid";
                        long j10 = S2.f8961c;
                        t0Var.b(Long.valueOf(j10), "Backfill the session number. Last used session number");
                        j = j10;
                    } else {
                        str = "_sid";
                        j = 0;
                    }
                    W(new m4(j3, Long.valueOf(j + 1), "_sno", str4), r4Var);
                } else {
                    str = "_sid";
                }
                c7.c0.g(str2);
                String str5 = m4Var.f8856t;
                c7.c0.g(str5);
                n4 n4Var = new n4(str2, str5, str3, m4Var.f8853i, I);
                t0 t0Var2 = b().B;
                q1 q1Var = this.f8771z;
                p0 p0Var = q1Var.f8941x;
                String str6 = n4Var.f8883c;
                t0Var2.c(p0Var.c(str6), I, "Setting user property");
                m mVar3 = this.f8762i;
                T(mVar3);
                mVar3.g0();
                try {
                    boolean equals = "_id".equals(str6);
                    Object obj2 = n4Var.f8885e;
                    if (equals) {
                        m mVar4 = this.f8762i;
                        T(mVar4);
                        n4 o03 = mVar4.o0(str2, "_id");
                        if (o03 != null && !obj2.equals(o03.f8885e)) {
                            m mVar5 = this.f8762i;
                            T(mVar5);
                            mVar5.m0(str2, "_lair");
                        }
                    }
                    c0(r4Var);
                    m mVar6 = this.f8762i;
                    T(mVar6);
                    boolean n02 = mVar6.n0(n4Var);
                    if (str.equals(str3)) {
                        l4 l4Var = this.f8766u;
                        T(l4Var);
                        String str7 = r4Var.I;
                        long b02 = TextUtils.isEmpty(str7) ? 0L : l4Var.b0(str7.getBytes(StandardCharsets.UTF_8));
                        m mVar7 = this.f8762i;
                        T(mVar7);
                        a1 w02 = mVar7.w0(str2);
                        if (w02 != null) {
                            w02.B(b02);
                            if (w02.o()) {
                                m mVar8 = this.f8762i;
                                T(mVar8);
                                mVar8.x0(w02, false);
                            }
                        }
                    }
                    m mVar9 = this.f8762i;
                    T(mVar9);
                    mVar9.h0();
                    if (!n02) {
                        b().f9050t.c(q1Var.f8941x.c(str6), obj2, "Too many unique user properties are set. Ignoring user property");
                        k0();
                        p4.K(g4Var, str2, 9, null, null, 0);
                    }
                    m mVar10 = this.f8762i;
                    T(mVar10);
                    mVar10.i0();
                } catch (Throwable th) {
                    m mVar11 = this.f8762i;
                    T(mVar11);
                    mVar11.i0();
                    throw th;
                }
            }
        }
    }

    public final void X(String str, r4 r4Var) {
        d().s();
        l0();
        boolean S = S(r4Var);
        String str2 = r4Var.f8976d;
        if (S) {
            if (!r4Var.f8983v) {
                c0(r4Var);
                return;
            }
            Boolean U = U(r4Var);
            if ("_npa".equals(str) && U != null) {
                b().A.a("Falling back to manifest metadata value for ad personalization");
                f().getClass();
                W(new m4(System.currentTimeMillis(), Long.valueOf(true != U.booleanValue() ? 0L : 1L), "_npa", "auto"), r4Var);
                return;
            }
            t0 t0Var = b().A;
            q1 q1Var = this.f8771z;
            t0Var.b(q1Var.f8941x.c(str), "Removing user property");
            m mVar = this.f8762i;
            T(mVar);
            mVar.g0();
            try {
                c0(r4Var);
                if ("_id".equals(str)) {
                    m mVar2 = this.f8762i;
                    T(mVar2);
                    c7.c0.g(str2);
                    mVar2.m0(str2, "_lair");
                }
                m mVar3 = this.f8762i;
                T(mVar3);
                c7.c0.g(str2);
                mVar3.m0(str2, str);
                m mVar4 = this.f8762i;
                T(mVar4);
                mVar4.h0();
                b().A.b(q1Var.f8941x.c(str), "User property removed");
                m mVar5 = this.f8762i;
                T(mVar5);
                mVar5.i0();
            } catch (Throwable th) {
                m mVar6 = this.f8762i;
                T(mVar6);
                mVar6.i0();
                throw th;
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:(2:79|80)|(2:82|(8:84|(3:86|(2:88|(1:90))(1:110)|109)(1:111)|91|(1:93)(1:108)|94|95|96|(4:98|(1:100)(1:104)|101|(1:103))))|112|95|96|(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x037e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x037f, code lost:
    
        b().f9050t.c(s7.v0.A(r3), r0, "Application info is null, first open report might be inaccurate. appId");
        r12 = r11;
     */
    /* JADX WARN: Removed duplicated region for block: B:150:0x043a A[Catch: all -> 0x00fc, TryCatch #2 {all -> 0x00fc, blocks: (B:31:0x00dc, B:33:0x00ec, B:37:0x0103, B:40:0x0113, B:42:0x0122, B:44:0x0137, B:46:0x0144, B:47:0x014f, B:50:0x0158, B:52:0x016f, B:55:0x0188, B:58:0x01ac, B:60:0x01bc, B:62:0x01d4, B:63:0x0298, B:65:0x02c4, B:66:0x02c7, B:68:0x02e8, B:73:0x03b0, B:74:0x03b3, B:75:0x045f, B:80:0x02ff, B:82:0x031e, B:84:0x0326, B:86:0x032c, B:90:0x033f, B:91:0x0352, B:94:0x035e, B:96:0x0372, B:98:0x0391, B:100:0x0399, B:101:0x03a1, B:103:0x03a7, B:107:0x037f, B:110:0x034a, B:115:0x030c, B:116:0x01e4, B:118:0x020e, B:119:0x021a, B:121:0x0221, B:123:0x0227, B:125:0x0231, B:127:0x0237, B:129:0x023d, B:131:0x0243, B:133:0x0248, B:136:0x0261, B:141:0x0265, B:142:0x0276, B:143:0x0281, B:145:0x028c, B:146:0x03dc, B:148:0x0411, B:149:0x0414, B:150:0x043a, B:152:0x0441, B:153:0x0163, B:154:0x014b, B:155:0x012c, B:159:0x0134), top: B:30:0x00dc, inners: #0, #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0163 A[Catch: all -> 0x00fc, TryCatch #2 {all -> 0x00fc, blocks: (B:31:0x00dc, B:33:0x00ec, B:37:0x0103, B:40:0x0113, B:42:0x0122, B:44:0x0137, B:46:0x0144, B:47:0x014f, B:50:0x0158, B:52:0x016f, B:55:0x0188, B:58:0x01ac, B:60:0x01bc, B:62:0x01d4, B:63:0x0298, B:65:0x02c4, B:66:0x02c7, B:68:0x02e8, B:73:0x03b0, B:74:0x03b3, B:75:0x045f, B:80:0x02ff, B:82:0x031e, B:84:0x0326, B:86:0x032c, B:90:0x033f, B:91:0x0352, B:94:0x035e, B:96:0x0372, B:98:0x0391, B:100:0x0399, B:101:0x03a1, B:103:0x03a7, B:107:0x037f, B:110:0x034a, B:115:0x030c, B:116:0x01e4, B:118:0x020e, B:119:0x021a, B:121:0x0221, B:123:0x0227, B:125:0x0231, B:127:0x0237, B:129:0x023d, B:131:0x0243, B:133:0x0248, B:136:0x0261, B:141:0x0265, B:142:0x0276, B:143:0x0281, B:145:0x028c, B:146:0x03dc, B:148:0x0411, B:149:0x0414, B:150:0x043a, B:152:0x0441, B:153:0x0163, B:154:0x014b, B:155:0x012c, B:159:0x0134), top: B:30:0x00dc, inners: #0, #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x014b A[Catch: all -> 0x00fc, TryCatch #2 {all -> 0x00fc, blocks: (B:31:0x00dc, B:33:0x00ec, B:37:0x0103, B:40:0x0113, B:42:0x0122, B:44:0x0137, B:46:0x0144, B:47:0x014f, B:50:0x0158, B:52:0x016f, B:55:0x0188, B:58:0x01ac, B:60:0x01bc, B:62:0x01d4, B:63:0x0298, B:65:0x02c4, B:66:0x02c7, B:68:0x02e8, B:73:0x03b0, B:74:0x03b3, B:75:0x045f, B:80:0x02ff, B:82:0x031e, B:84:0x0326, B:86:0x032c, B:90:0x033f, B:91:0x0352, B:94:0x035e, B:96:0x0372, B:98:0x0391, B:100:0x0399, B:101:0x03a1, B:103:0x03a7, B:107:0x037f, B:110:0x034a, B:115:0x030c, B:116:0x01e4, B:118:0x020e, B:119:0x021a, B:121:0x0221, B:123:0x0227, B:125:0x0231, B:127:0x0237, B:129:0x023d, B:131:0x0243, B:133:0x0248, B:136:0x0261, B:141:0x0265, B:142:0x0276, B:143:0x0281, B:145:0x028c, B:146:0x03dc, B:148:0x0411, B:149:0x0414, B:150:0x043a, B:152:0x0441, B:153:0x0163, B:154:0x014b, B:155:0x012c, B:159:0x0134), top: B:30:0x00dc, inners: #0, #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0144 A[Catch: all -> 0x00fc, TryCatch #2 {all -> 0x00fc, blocks: (B:31:0x00dc, B:33:0x00ec, B:37:0x0103, B:40:0x0113, B:42:0x0122, B:44:0x0137, B:46:0x0144, B:47:0x014f, B:50:0x0158, B:52:0x016f, B:55:0x0188, B:58:0x01ac, B:60:0x01bc, B:62:0x01d4, B:63:0x0298, B:65:0x02c4, B:66:0x02c7, B:68:0x02e8, B:73:0x03b0, B:74:0x03b3, B:75:0x045f, B:80:0x02ff, B:82:0x031e, B:84:0x0326, B:86:0x032c, B:90:0x033f, B:91:0x0352, B:94:0x035e, B:96:0x0372, B:98:0x0391, B:100:0x0399, B:101:0x03a1, B:103:0x03a7, B:107:0x037f, B:110:0x034a, B:115:0x030c, B:116:0x01e4, B:118:0x020e, B:119:0x021a, B:121:0x0221, B:123:0x0227, B:125:0x0231, B:127:0x0237, B:129:0x023d, B:131:0x0243, B:133:0x0248, B:136:0x0261, B:141:0x0265, B:142:0x0276, B:143:0x0281, B:145:0x028c, B:146:0x03dc, B:148:0x0411, B:149:0x0414, B:150:0x043a, B:152:0x0441, B:153:0x0163, B:154:0x014b, B:155:0x012c, B:159:0x0134), top: B:30:0x00dc, inners: #0, #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0158 A[Catch: all -> 0x00fc, TRY_ENTER, TryCatch #2 {all -> 0x00fc, blocks: (B:31:0x00dc, B:33:0x00ec, B:37:0x0103, B:40:0x0113, B:42:0x0122, B:44:0x0137, B:46:0x0144, B:47:0x014f, B:50:0x0158, B:52:0x016f, B:55:0x0188, B:58:0x01ac, B:60:0x01bc, B:62:0x01d4, B:63:0x0298, B:65:0x02c4, B:66:0x02c7, B:68:0x02e8, B:73:0x03b0, B:74:0x03b3, B:75:0x045f, B:80:0x02ff, B:82:0x031e, B:84:0x0326, B:86:0x032c, B:90:0x033f, B:91:0x0352, B:94:0x035e, B:96:0x0372, B:98:0x0391, B:100:0x0399, B:101:0x03a1, B:103:0x03a7, B:107:0x037f, B:110:0x034a, B:115:0x030c, B:116:0x01e4, B:118:0x020e, B:119:0x021a, B:121:0x0221, B:123:0x0227, B:125:0x0231, B:127:0x0237, B:129:0x023d, B:131:0x0243, B:133:0x0248, B:136:0x0261, B:141:0x0265, B:142:0x0276, B:143:0x0281, B:145:0x028c, B:146:0x03dc, B:148:0x0411, B:149:0x0414, B:150:0x043a, B:152:0x0441, B:153:0x0163, B:154:0x014b, B:155:0x012c, B:159:0x0134), top: B:30:0x00dc, inners: #0, #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x016f A[Catch: all -> 0x00fc, TRY_LEAVE, TryCatch #2 {all -> 0x00fc, blocks: (B:31:0x00dc, B:33:0x00ec, B:37:0x0103, B:40:0x0113, B:42:0x0122, B:44:0x0137, B:46:0x0144, B:47:0x014f, B:50:0x0158, B:52:0x016f, B:55:0x0188, B:58:0x01ac, B:60:0x01bc, B:62:0x01d4, B:63:0x0298, B:65:0x02c4, B:66:0x02c7, B:68:0x02e8, B:73:0x03b0, B:74:0x03b3, B:75:0x045f, B:80:0x02ff, B:82:0x031e, B:84:0x0326, B:86:0x032c, B:90:0x033f, B:91:0x0352, B:94:0x035e, B:96:0x0372, B:98:0x0391, B:100:0x0399, B:101:0x03a1, B:103:0x03a7, B:107:0x037f, B:110:0x034a, B:115:0x030c, B:116:0x01e4, B:118:0x020e, B:119:0x021a, B:121:0x0221, B:123:0x0227, B:125:0x0231, B:127:0x0237, B:129:0x023d, B:131:0x0243, B:133:0x0248, B:136:0x0261, B:141:0x0265, B:142:0x0276, B:143:0x0281, B:145:0x028c, B:146:0x03dc, B:148:0x0411, B:149:0x0414, B:150:0x043a, B:152:0x0441, B:153:0x0163, B:154:0x014b, B:155:0x012c, B:159:0x0134), top: B:30:0x00dc, inners: #0, #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0391 A[Catch: all -> 0x00fc, TryCatch #2 {all -> 0x00fc, blocks: (B:31:0x00dc, B:33:0x00ec, B:37:0x0103, B:40:0x0113, B:42:0x0122, B:44:0x0137, B:46:0x0144, B:47:0x014f, B:50:0x0158, B:52:0x016f, B:55:0x0188, B:58:0x01ac, B:60:0x01bc, B:62:0x01d4, B:63:0x0298, B:65:0x02c4, B:66:0x02c7, B:68:0x02e8, B:73:0x03b0, B:74:0x03b3, B:75:0x045f, B:80:0x02ff, B:82:0x031e, B:84:0x0326, B:86:0x032c, B:90:0x033f, B:91:0x0352, B:94:0x035e, B:96:0x0372, B:98:0x0391, B:100:0x0399, B:101:0x03a1, B:103:0x03a7, B:107:0x037f, B:110:0x034a, B:115:0x030c, B:116:0x01e4, B:118:0x020e, B:119:0x021a, B:121:0x0221, B:123:0x0227, B:125:0x0231, B:127:0x0237, B:129:0x023d, B:131:0x0243, B:133:0x0248, B:136:0x0261, B:141:0x0265, B:142:0x0276, B:143:0x0281, B:145:0x028c, B:146:0x03dc, B:148:0x0411, B:149:0x0414, B:150:0x043a, B:152:0x0441, B:153:0x0163, B:154:0x014b, B:155:0x012c, B:159:0x0134), top: B:30:0x00dc, inners: #0, #1, #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Y(r4 r4Var) {
        long j;
        long j3;
        long j10;
        long j11;
        long j12;
        long j13;
        int i3;
        r S;
        boolean z10;
        q1 q1Var;
        String str;
        String str2;
        String str3;
        PackageInfo packageInfo;
        r4 r4Var2;
        ApplicationInfo applicationInfo;
        ApplicationInfo applicationInfo2;
        long j14;
        boolean z11;
        long j15;
        q1 q1Var2 = this.f8771z;
        d().s();
        l0();
        c7.c0.g(r4Var);
        boolean z12 = r4Var.C;
        String str4 = r4Var.f8976d;
        c7.c0.d(str4);
        if (S(r4Var)) {
            m mVar = this.f8762i;
            T(mVar);
            a1 w02 = mVar.w0(str4);
            if (w02 != null && TextUtils.isEmpty(w02.H()) && !TextUtils.isEmpty(r4Var.f8977e)) {
                w02.f(0L);
                m mVar2 = this.f8762i;
                T(mVar2);
                mVar2.x0(w02, false);
                k1 k1Var = this.f8760d;
                T(k1Var);
                k1Var.s();
                k1Var.f8781w.remove(str4);
            }
            if (!r4Var.f8983v) {
                c0(r4Var);
                return;
            }
            long j16 = r4Var.f8987z;
            g e02 = e0();
            d0 d0Var = e0.f8619e1;
            if (e02.D(null, d0Var)) {
                j = j16;
                j3 = r4Var.T;
            } else {
                j = j16;
                j3 = 0;
            }
            if (j == 0) {
                f().getClass();
                long currentTimeMillis = System.currentTimeMillis();
                if (e0().D(null, d0Var)) {
                    f().getClass();
                    j15 = SystemClock.elapsedRealtime();
                } else {
                    j15 = 0;
                }
                j11 = currentTimeMillis;
                j10 = j15;
            } else {
                j10 = j3;
                j11 = j;
            }
            int i10 = r4Var.A;
            if (i10 != 0 && i10 != 1) {
                b().f9053w.c(v0.A(str4), Integer.valueOf(i10), "Incorrect app type, assuming installed app. appId, appType");
                i10 = 0;
            }
            m mVar3 = this.f8762i;
            T(mVar3);
            mVar3.g0();
            try {
                m mVar4 = this.f8762i;
                T(mVar4);
                n4 o02 = mVar4.o0(str4, "_npa");
                Boolean U = U(r4Var);
                if (o02 != null) {
                    j12 = 1;
                    if (!"auto".equals(o02.f8882b)) {
                        j13 = j11;
                        if (e0().D(null, e0.W0)) {
                            i3 = i10;
                            b0(r4Var, j13);
                        } else {
                            i3 = i10;
                            b0(r4Var, r4Var.R);
                        }
                        c0(r4Var);
                        m mVar5 = this.f8762i;
                        if (i3 != 0) {
                            T(mVar5);
                            S = mVar5.S("events", str4, "_f");
                            z10 = false;
                        } else {
                            T(mVar5);
                            S = mVar5.S("events", str4, "_v");
                            z10 = true;
                        }
                        if (S != null) {
                            long j17 = ((j13 / 3600000) + j12) * 3600000;
                            if (z10) {
                                Long valueOf = Long.valueOf(j17);
                                long j18 = j13;
                                W(new m4(j18, valueOf, "_fvt", "auto"), r4Var);
                                d().s();
                                l0();
                                Bundle bundle = new Bundle();
                                bundle.putLong("_c", 1L);
                                bundle.putLong("_r", 1L);
                                bundle.putLong("_et", 1L);
                                if (z12) {
                                    bundle.putLong("_dac", 1L);
                                }
                                f().getClass();
                                bundle.putLong("_elt", System.currentTimeMillis());
                                i(new u("_v", new t(bundle), "auto", j18, j10), r4Var);
                            } else {
                                Long valueOf2 = Long.valueOf(j17);
                                long j19 = j13;
                                W(new m4(j19, valueOf2, "_fot", "auto"), r4Var);
                                d().s();
                                h1 h1Var = this.f8770y;
                                c7.c0.g(h1Var);
                                q1 q1Var3 = h1Var.f8724e;
                                if (str4 == null || str4.isEmpty()) {
                                    q1Var = q1Var2;
                                    str = "_elt";
                                    str2 = str4;
                                    str3 = "_et";
                                    v0 v0Var = q1Var3.f8937t;
                                    q1.l(v0Var);
                                    v0Var.f9054x.a("Install Referrer Reporter was called with invalid app package name");
                                } else {
                                    str3 = "_et";
                                    o1 o1Var = q1Var3.f8938u;
                                    v0 v0Var2 = q1Var3.f8937t;
                                    str = "_elt";
                                    Context context = q1Var3.f8932d;
                                    q1.l(o1Var);
                                    o1Var.s();
                                    if (h1Var.b()) {
                                        g1 g1Var = new g1(h1Var, str4);
                                        o1 o1Var2 = q1Var3.f8938u;
                                        q1.l(o1Var2);
                                        o1Var2.s();
                                        q1Var = q1Var2;
                                        Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
                                        str2 = str4;
                                        intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
                                        PackageManager packageManager = context.getPackageManager();
                                        if (packageManager == null) {
                                            q1.l(v0Var2);
                                            v0Var2.f9054x.a("Failed to obtain Package Manager to verify binding conditions for Install Referrer");
                                        } else {
                                            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
                                            if (queryIntentServices == null || queryIntentServices.isEmpty()) {
                                                q1.l(v0Var2);
                                                v0Var2.f9056z.a("Play Service for fetching Install Referrer is unavailable on device");
                                            } else {
                                                ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
                                                if (serviceInfo != null) {
                                                    String str5 = serviceInfo.packageName;
                                                    if (serviceInfo.name != null && "com.android.vending".equals(str5) && h1Var.b()) {
                                                        try {
                                                            boolean a9 = f7.a.b().a(context, new Intent(intent), g1Var, 1);
                                                            q1.l(v0Var2);
                                                            v0Var2.B.b(a9 ? "available" : "not available", "Install Referrer Service is");
                                                        } catch (RuntimeException e2) {
                                                            v0 v0Var3 = q1Var3.f8937t;
                                                            q1.l(v0Var3);
                                                            v0Var3.f9050t.b(e2.getMessage(), "Exception occurred while binding to Install Referrer Service");
                                                        }
                                                    } else {
                                                        q1.l(v0Var2);
                                                        v0Var2.f9053w.a("Play Store version 8.3.73 or higher required for Install Referrer");
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        q1.l(v0Var2);
                                        v0Var2.f9056z.a("Install Referrer Reporter is not available");
                                        q1Var = q1Var2;
                                        str2 = str4;
                                    }
                                }
                                d().s();
                                l0();
                                Bundle bundle2 = new Bundle();
                                long j20 = j12;
                                bundle2.putLong("_c", j20);
                                bundle2.putLong("_r", j20);
                                bundle2.putLong("_uwa", 0L);
                                bundle2.putLong("_pfo", 0L);
                                bundle2.putLong("_sys", 0L);
                                bundle2.putLong("_sysu", 0L);
                                bundle2.putLong(str3, j20);
                                if (z12) {
                                    bundle2.putLong("_dac", j20);
                                }
                                c7.c0.g(str2);
                                m mVar6 = this.f8762i;
                                T(mVar6);
                                c7.c0.d(str2);
                                mVar6.s();
                                mVar6.t();
                                String str6 = str2;
                                long G = mVar6.G(str6);
                                q1 q1Var4 = q1Var;
                                if (q1Var4.f8932d.getPackageManager() == null) {
                                    b().f9050t.b(v0.A(str6), "PackageManager is null, first open report might be inaccurate. appId");
                                    r4Var2 = r4Var;
                                } else {
                                    try {
                                        packageInfo = i7.b.a(q1Var4.f8932d).e(0, str6);
                                    } catch (PackageManager.NameNotFoundException e9) {
                                        b().f9050t.c(v0.A(str6), e9, "Package info is null, first open report might be inaccurate. appId");
                                        packageInfo = null;
                                    }
                                    if (packageInfo != null) {
                                        long j21 = packageInfo.firstInstallTime;
                                        if (j21 != 0) {
                                            if (j21 != packageInfo.lastUpdateTime) {
                                                applicationInfo = null;
                                                if (!e0().D(null, e0.I0)) {
                                                    bundle2.putLong("_uwa", 1L);
                                                } else if (G == 0) {
                                                    bundle2.putLong("_uwa", 1L);
                                                    z11 = false;
                                                    G = 0;
                                                }
                                                z11 = false;
                                            } else {
                                                applicationInfo = null;
                                                z11 = true;
                                            }
                                            r4Var2 = r4Var;
                                            W(new m4(j19, Long.valueOf(true != z11 ? 0L : 1L), "_fi", "auto"), r4Var2);
                                            applicationInfo2 = i7.b.a(q1Var4.f8932d).d(0, str6);
                                            if (applicationInfo2 != null) {
                                                if ((applicationInfo2.flags & 1) != 0) {
                                                    j14 = 1;
                                                    bundle2.putLong("_sys", 1L);
                                                } else {
                                                    j14 = 1;
                                                }
                                                if ((applicationInfo2.flags & 128) != 0) {
                                                    bundle2.putLong("_sysu", j14);
                                                }
                                            }
                                        }
                                    }
                                    r4Var2 = r4Var;
                                    applicationInfo = null;
                                    applicationInfo2 = i7.b.a(q1Var4.f8932d).d(0, str6);
                                    if (applicationInfo2 != null) {
                                    }
                                }
                                long j22 = G;
                                if (j22 >= 0) {
                                    bundle2.putLong("_pfo", j22);
                                }
                                f().getClass();
                                bundle2.putLong(str, System.currentTimeMillis());
                                i(new u("_f", new t(bundle2), "auto", j19, j10), r4Var2);
                            }
                        } else {
                            long j23 = j13;
                            if (r4Var.f8984w) {
                                i(new u("_cd", new t(new Bundle()), "auto", j23, 0L), r4Var);
                            }
                        }
                        m mVar7 = this.f8762i;
                        T(mVar7);
                        mVar7.h0();
                        m mVar8 = this.f8762i;
                        T(mVar8);
                        mVar8.i0();
                    }
                } else {
                    j12 = 1;
                }
                if (U != null) {
                    m4 m4Var = new m4(j11, Long.valueOf(true != U.booleanValue() ? 0L : j12), "_npa", "auto");
                    j13 = j11;
                    if (o02 == null || !o02.f8885e.equals(m4Var.f8854r)) {
                        W(m4Var, r4Var);
                    }
                } else {
                    j13 = j11;
                    if (o02 != null) {
                        X("_npa", r4Var);
                    }
                }
                if (e0().D(null, e0.W0)) {
                }
                c0(r4Var);
                m mVar52 = this.f8762i;
                if (i3 != 0) {
                }
                if (S != null) {
                }
                m mVar72 = this.f8762i;
                T(mVar72);
                mVar72.h0();
                m mVar82 = this.f8762i;
                T(mVar82);
                mVar82.i0();
            } catch (Throwable th) {
                m mVar9 = this.f8762i;
                T(mVar9);
                mVar9.i0();
                throw th;
            }
        }
    }

    public final void Z(e eVar, r4 r4Var) {
        u uVar;
        c7.c0.d(eVar.f8594d);
        c7.c0.g(eVar.f8595e);
        c7.c0.g(eVar.f8596i);
        c7.c0.d(eVar.f8596i.f8852e);
        d().s();
        l0();
        if (S(r4Var)) {
            if (!r4Var.f8983v) {
                c0(r4Var);
                return;
            }
            e eVar2 = new e(eVar);
            boolean z10 = false;
            eVar2.f8598s = false;
            m mVar = this.f8762i;
            T(mVar);
            mVar.g0();
            try {
                m mVar2 = this.f8762i;
                T(mVar2);
                String str = eVar2.f8594d;
                c7.c0.g(str);
                e s02 = mVar2.s0(str, eVar2.f8596i.f8852e);
                q1 q1Var = this.f8771z;
                if (s02 != null && !s02.f8595e.equals(eVar2.f8595e)) {
                    b().f9053w.d("Updating a conditional user property with different origin. name, origin, origin (from DB)", q1Var.f8941x.c(eVar2.f8596i.f8852e), eVar2.f8595e, s02.f8595e);
                }
                if (s02 != null && s02.f8598s) {
                    eVar2.f8595e = s02.f8595e;
                    eVar2.f8597r = s02.f8597r;
                    eVar2.f8601v = s02.f8601v;
                    eVar2.f8599t = s02.f8599t;
                    eVar2.f8602w = s02.f8602w;
                    eVar2.f8598s = true;
                    m4 m4Var = eVar2.f8596i;
                    eVar2.f8596i = new m4(s02.f8596i.f8853i, m4Var.b(), m4Var.f8852e, s02.f8596i.f8856t);
                } else if (TextUtils.isEmpty(eVar2.f8599t)) {
                    m4 m4Var2 = eVar2.f8596i;
                    eVar2.f8596i = new m4(eVar2.f8597r, m4Var2.b(), m4Var2.f8852e, eVar2.f8596i.f8856t);
                    eVar2.f8598s = true;
                    z10 = true;
                }
                if (eVar2.f8598s) {
                    m4 m4Var3 = eVar2.f8596i;
                    String str2 = eVar2.f8594d;
                    c7.c0.g(str2);
                    String str3 = eVar2.f8595e;
                    String str4 = m4Var3.f8852e;
                    long j = m4Var3.f8853i;
                    Object b10 = m4Var3.b();
                    c7.c0.g(b10);
                    n4 n4Var = new n4(str2, str3, str4, j, b10);
                    Object obj = n4Var.f8885e;
                    String str5 = n4Var.f8883c;
                    m mVar3 = this.f8762i;
                    T(mVar3);
                    if (mVar3.n0(n4Var)) {
                        b().A.d("User property updated immediately", eVar2.f8594d, q1Var.f8941x.c(str5), obj);
                    } else {
                        b().f9050t.d("(2)Too many active user properties, ignoring", v0.A(eVar2.f8594d), q1Var.f8941x.c(str5), obj);
                    }
                    if (z10 && (uVar = eVar2.f8602w) != null) {
                        l(new u(uVar, eVar2.f8597r, 0L), r4Var);
                    }
                }
                m mVar4 = this.f8762i;
                T(mVar4);
                if (mVar4.r0(eVar2)) {
                    b().A.d("Conditional property added", eVar2.f8594d, q1Var.f8941x.c(eVar2.f8596i.f8852e), eVar2.f8596i.b());
                } else {
                    b().f9050t.d("Too many conditional properties, ignoring", v0.A(eVar2.f8594d), q1Var.f8941x.c(eVar2.f8596i.f8852e), eVar2.f8596i.b());
                }
                m mVar5 = this.f8762i;
                T(mVar5);
                mVar5.h0();
                m mVar6 = this.f8762i;
                T(mVar6);
                mVar6.i0();
            } catch (Throwable th) {
                m mVar7 = this.f8762i;
                T(mVar7);
                mVar7.i0();
                throw th;
            }
        }
    }

    @Override // s7.y1
    public final k5.c a() {
        return this.f8771z.f8934i;
    }

    public final void a0(e eVar, r4 r4Var) {
        c7.c0.d(eVar.f8594d);
        c7.c0.g(eVar.f8596i);
        c7.c0.d(eVar.f8596i.f8852e);
        d().s();
        l0();
        if (S(r4Var)) {
            if (!r4Var.f8983v) {
                c0(r4Var);
                return;
            }
            m mVar = this.f8762i;
            T(mVar);
            mVar.g0();
            try {
                c0(r4Var);
                String str = eVar.f8594d;
                c7.c0.g(str);
                m mVar2 = this.f8762i;
                T(mVar2);
                e s02 = mVar2.s0(str, eVar.f8596i.f8852e);
                q1 q1Var = this.f8771z;
                if (s02 != null) {
                    b().A.c(eVar.f8594d, q1Var.f8941x.c(eVar.f8596i.f8852e), "Removing conditional user property");
                    m mVar3 = this.f8762i;
                    T(mVar3);
                    mVar3.t0(str, eVar.f8596i.f8852e);
                    if (s02.f8598s) {
                        m mVar4 = this.f8762i;
                        T(mVar4);
                        mVar4.m0(str, eVar.f8596i.f8852e);
                    }
                    u uVar = eVar.f8604y;
                    if (uVar != null) {
                        t tVar = uVar.f9036e;
                        u Z = k0().Z(uVar.f9035d, tVar != null ? tVar.f() : null, s02.f8595e, uVar.f9038r, uVar.f9039s, true);
                        c7.c0.g(Z);
                        l(Z, r4Var);
                    }
                } else {
                    b().f9053w.c(v0.A(eVar.f8594d), q1Var.f8941x.c(eVar.f8596i.f8852e), "Conditional user property doesn't exist");
                }
                m mVar5 = this.f8762i;
                T(mVar5);
                mVar5.h0();
                m mVar6 = this.f8762i;
                T(mVar6);
                mVar6.i0();
            } catch (Throwable th) {
                m mVar7 = this.f8762i;
                T(mVar7);
                mVar7.i0();
                throw th;
            }
        }
    }

    @Override // s7.y1
    public final v0 b() {
        q1 q1Var = this.f8771z;
        c7.c0.g(q1Var);
        v0 v0Var = q1Var.f8937t;
        q1.l(v0Var);
        return v0Var;
    }

    public final void b0(r4 r4Var, long j) {
        m mVar = this.f8762i;
        T(mVar);
        String str = r4Var.f8976d;
        c7.c0.g(str);
        a1 w02 = mVar.w0(str);
        if (w02 != null) {
            k0();
            String str2 = r4Var.f8977e;
            String H = w02.H();
            boolean isEmpty = TextUtils.isEmpty(str2);
            boolean isEmpty2 = TextUtils.isEmpty(H);
            if (!isEmpty && !isEmpty2) {
                c7.c0.g(str2);
                if (!str2.equals(H)) {
                    b().f9053w.b(v0.A(w02.E()), "New GMP App Id passed in. Removing cached database data. appId");
                    m mVar2 = this.f8762i;
                    T(mVar2);
                    q1 q1Var = (q1) mVar2.f1478d;
                    String E = w02.E();
                    mVar2.t();
                    mVar2.s();
                    c7.c0.d(E);
                    try {
                        SQLiteDatabase j02 = mVar2.j0();
                        String[] strArr = {E};
                        int delete = j02.delete("events", "app_id=?", strArr) + j02.delete("user_attributes", "app_id=?", strArr) + j02.delete("conditional_properties", "app_id=?", strArr) + j02.delete("apps", "app_id=?", strArr) + j02.delete("raw_events", "app_id=?", strArr) + j02.delete("raw_events_metadata", "app_id=?", strArr) + j02.delete("event_filters", "app_id=?", strArr) + j02.delete("property_filters", "app_id=?", strArr) + j02.delete("audience_filter_values", "app_id=?", strArr) + j02.delete("consent_settings", "app_id=?", strArr) + j02.delete("default_event_params", "app_id=?", strArr) + j02.delete("trigger_uris", "app_id=?", strArr) + j02.delete("diagnostic_signals", "app_id=?", strArr);
                        if (q1Var.f8935r.D(null, e0.f8613c1)) {
                            delete += j02.delete("no_data_mode_events", "app_id=?", strArr);
                        }
                        if (delete > 0) {
                            v0 v0Var = q1Var.f8937t;
                            q1.l(v0Var);
                            v0Var.B.c(E, Integer.valueOf(delete), "Deleted application data. app, records");
                        }
                    } catch (SQLiteException e2) {
                        v0 v0Var2 = q1Var.f8937t;
                        q1.l(v0Var2);
                        v0Var2.f9050t.c(v0.A(E), e2, "Error deleting application data. appId, error");
                    }
                    w02 = null;
                }
            }
        }
        if (w02 != null) {
            boolean z10 = (w02.Q() == -2147483648L || w02.Q() == r4Var.f8985x) ? false : true;
            String O = w02.O();
            if (z10 || ((w02.Q() != -2147483648L || O == null || O.equals(r4Var.f8978i)) ? false : true)) {
                Bundle bundle = new Bundle();
                bundle.putString("_pv", O);
                u uVar = new u("_au", new t(bundle), "auto", j, 0L);
                if (e0().D(null, e0.X0)) {
                    i(uVar, r4Var);
                } else {
                    j(uVar, r4Var);
                }
            }
        }
    }

    public final c2 c(String str) {
        c2 c2Var = c2.f8555c;
        d().s();
        l0();
        HashMap hashMap = this.P;
        c2 c2Var2 = (c2) hashMap.get(str);
        if (c2Var2 == null) {
            m mVar = this.f8762i;
            T(mVar);
            c2Var2 = mVar.M(str);
            if (c2Var2 == null) {
                c2Var2 = c2.f8555c;
            }
            d().s();
            l0();
            hashMap.put(str, c2Var2);
            m mVar2 = this.f8762i;
            T(mVar2);
            mVar2.Y(str, c2Var2);
        }
        return c2Var2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0184  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final a1 c0(r4 r4Var) {
        boolean z10;
        String str;
        long j;
        String str2;
        String str3;
        String str4;
        d().s();
        l0();
        c7.c0.g(r4Var);
        boolean z11 = r4Var.B;
        String str5 = r4Var.f8976d;
        c7.c0.d(str5);
        String str6 = r4Var.H;
        if (!str6.isEmpty()) {
            this.R.put(str5, new h4(this, str6));
        }
        m mVar = this.f8762i;
        T(mVar);
        a1 w02 = mVar.w0(str5);
        c2 j3 = c(str5).j(c2.c(100, r4Var.G));
        String y3 = this.f8768w.y(r4Var, j3);
        boolean z12 = true;
        b2 b2Var = b2.AD_STORAGE;
        b2 b2Var2 = b2.ANALYTICS_STORAGE;
        if (w02 == null) {
            w02 = new a1(this.f8771z, str5);
            if (j3.i(b2Var2)) {
                w02.G(o(j3));
            }
            if (j3.i(b2Var)) {
                w02.J(y3);
            }
        } else {
            q1 q1Var = w02.f8474a;
            if (j3.i(b2Var) && y3 != null) {
                o1 o1Var = q1Var.f8938u;
                q1.l(o1Var);
                o1Var.s();
                if (!y3.equals(w02.f8478e)) {
                    o1 o1Var2 = q1Var.f8938u;
                    q1.l(o1Var2);
                    o1Var2.s();
                    boolean isEmpty = TextUtils.isEmpty(w02.f8478e);
                    w02.J(y3);
                    if (z11 && !"00000000-0000-0000-0000-000000000000".equals(this.f8768w.w(r4Var, j3).first) && !isEmpty) {
                        if (j3.i(b2Var2)) {
                            w02.G(o(j3));
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        m mVar2 = this.f8762i;
                        T(mVar2);
                        if (mVar2.o0(str5, "_id") != null) {
                            m mVar3 = this.f8762i;
                            T(mVar3);
                            if (mVar3.o0(str5, "_lair") == null) {
                                f().getClass();
                                n4 n4Var = new n4(str5, "auto", "_lair", System.currentTimeMillis(), 1L);
                                m mVar4 = this.f8762i;
                                T(mVar4);
                                mVar4.n0(n4Var);
                            }
                        }
                        q1 q1Var2 = w02.f8474a;
                        w02.I(r4Var.f8977e);
                        str = r4Var.f8986y;
                        if (!TextUtils.isEmpty(str)) {
                            w02.L(str);
                        }
                        j = r4Var.f8980s;
                        if (j != 0) {
                            w02.T(j);
                        }
                        str2 = r4Var.f8978i;
                        if (!TextUtils.isEmpty(str2)) {
                            w02.P(str2);
                        }
                        w02.R(r4Var.f8985x);
                        str3 = r4Var.f8979r;
                        if (str3 != null) {
                            w02.S(str3);
                        }
                        w02.a(r4Var.f8981t);
                        w02.d(r4Var.f8983v);
                        str4 = r4Var.f8982u;
                        if (!TextUtils.isEmpty(str4)) {
                            w02.w(str4);
                        }
                        o1 o1Var3 = q1Var2.f8938u;
                        q1.l(o1Var3);
                        o1Var3.s();
                        w02.R |= w02.f8487p == z11;
                        w02.f8487p = z11;
                        Boolean bool = r4Var.D;
                        o1 o1Var4 = q1Var2.f8938u;
                        q1.l(o1Var4);
                        o1Var4.s();
                        w02.R |= !Objects.equals(w02.f8488q, bool);
                        w02.f8488q = bool;
                        w02.c(r4Var.E);
                        String str7 = r4Var.I;
                        o1 o1Var5 = q1Var2.f8938u;
                        q1.l(o1Var5);
                        o1Var5.s();
                        w02.R |= !Objects.equals(w02.f8491t, str7);
                        w02.f8491t = str7;
                        com.google.android.gms.internal.measurement.t3 t3Var = com.google.android.gms.internal.measurement.t3.f2807e;
                        if (e0().D(null, e0.L0)) {
                            if (e0().D(null, e0.K0)) {
                                w02.y(null);
                            }
                        } else {
                            w02.y(r4Var.F);
                        }
                        boolean z13 = r4Var.J;
                        o1 o1Var6 = q1Var2.f8938u;
                        q1.l(o1Var6);
                        o1Var6.s();
                        w02.R |= w02.f8492u == z13;
                        w02.f8492u = z13;
                        String str8 = r4Var.P;
                        o1 o1Var7 = q1Var2.f8938u;
                        q1.l(o1Var7);
                        o1Var7.s();
                        w02.R |= w02.C == str8;
                        w02.C = str8;
                        com.google.android.gms.internal.measurement.i4.a();
                        if (e0().D(null, e0.O0)) {
                            int i3 = r4Var.N;
                            o1 o1Var8 = q1Var2.f8938u;
                            q1.l(o1Var8);
                            o1Var8.s();
                            w02.R |= w02.f8495x != i3;
                            w02.f8495x = i3;
                        }
                        w02.A(r4Var.K);
                        String str9 = r4Var.Q;
                        o1 o1Var9 = q1Var2.f8938u;
                        q1.l(o1Var9);
                        o1Var9.s();
                        w02.R |= w02.G == str9;
                        w02.G = str9;
                        int i10 = r4Var.S;
                        o1 o1Var10 = q1Var2.f8938u;
                        q1.l(o1Var10);
                        o1Var10.s();
                        w02.R |= w02.I != i10;
                        w02.I = i10;
                        if (!w02.o()) {
                            z12 = z10;
                        } else if (!z10) {
                            return w02;
                        }
                        m mVar5 = this.f8762i;
                        T(mVar5);
                        mVar5.x0(w02, z12);
                        return w02;
                    }
                    if (TextUtils.isEmpty(w02.F()) && j3.i(b2Var2)) {
                        w02.G(o(j3));
                    }
                }
            }
            if (TextUtils.isEmpty(w02.F()) && j3.i(b2Var2)) {
                w02.G(o(j3));
            }
        }
        z10 = false;
        q1 q1Var22 = w02.f8474a;
        w02.I(r4Var.f8977e);
        str = r4Var.f8986y;
        if (!TextUtils.isEmpty(str)) {
        }
        j = r4Var.f8980s;
        if (j != 0) {
        }
        str2 = r4Var.f8978i;
        if (!TextUtils.isEmpty(str2)) {
        }
        w02.R(r4Var.f8985x);
        str3 = r4Var.f8979r;
        if (str3 != null) {
        }
        w02.a(r4Var.f8981t);
        w02.d(r4Var.f8983v);
        str4 = r4Var.f8982u;
        if (!TextUtils.isEmpty(str4)) {
        }
        o1 o1Var32 = q1Var22.f8938u;
        q1.l(o1Var32);
        o1Var32.s();
        w02.R |= w02.f8487p == z11;
        w02.f8487p = z11;
        Boolean bool2 = r4Var.D;
        o1 o1Var42 = q1Var22.f8938u;
        q1.l(o1Var42);
        o1Var42.s();
        w02.R |= !Objects.equals(w02.f8488q, bool2);
        w02.f8488q = bool2;
        w02.c(r4Var.E);
        String str72 = r4Var.I;
        o1 o1Var52 = q1Var22.f8938u;
        q1.l(o1Var52);
        o1Var52.s();
        w02.R |= !Objects.equals(w02.f8491t, str72);
        w02.f8491t = str72;
        com.google.android.gms.internal.measurement.t3 t3Var2 = com.google.android.gms.internal.measurement.t3.f2807e;
        if (e0().D(null, e0.L0)) {
        }
        boolean z132 = r4Var.J;
        o1 o1Var62 = q1Var22.f8938u;
        q1.l(o1Var62);
        o1Var62.s();
        w02.R |= w02.f8492u == z132;
        w02.f8492u = z132;
        String str82 = r4Var.P;
        o1 o1Var72 = q1Var22.f8938u;
        q1.l(o1Var72);
        o1Var72.s();
        w02.R |= w02.C == str82;
        w02.C = str82;
        com.google.android.gms.internal.measurement.i4.a();
        if (e0().D(null, e0.O0)) {
        }
        w02.A(r4Var.K);
        String str92 = r4Var.Q;
        o1 o1Var92 = q1Var22.f8938u;
        q1.l(o1Var92);
        o1Var92.s();
        w02.R |= w02.G == str92;
        w02.G = str92;
        int i102 = r4Var.S;
        o1 o1Var102 = q1Var22.f8938u;
        q1.l(o1Var102);
        o1Var102.s();
        w02.R |= w02.I != i102;
        w02.I = i102;
        if (!w02.o()) {
        }
        m mVar52 = this.f8762i;
        T(mVar52);
        mVar52.x0(w02, z12);
        return w02;
    }

    @Override // s7.y1
    public final o1 d() {
        q1 q1Var = this.f8771z;
        c7.c0.g(q1Var);
        o1 o1Var = q1Var.f8938u;
        q1.l(o1Var);
        return o1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List] */
    public final List d0(Bundle bundle, r4 r4Var) {
        int[] iArr;
        d().s();
        com.google.android.gms.internal.measurement.i4.a();
        g e02 = e0();
        String str = r4Var.f8976d;
        if (!e02.D(str, e0.O0) || str == null) {
            return new ArrayList();
        }
        if (bundle != null) {
            int[] intArray = bundle.getIntArray("uriSources");
            long[] longArray = bundle.getLongArray("uriTimestamps");
            if (intArray != null) {
                if (longArray == null || longArray.length != intArray.length) {
                    b().f9050t.a("Uri sources and timestamps do not match");
                } else {
                    int i3 = 0;
                    while (i3 < intArray.length) {
                        m mVar = this.f8762i;
                        T(mVar);
                        q1 q1Var = (q1) mVar.f1478d;
                        int i10 = intArray[i3];
                        long j = longArray[i3];
                        c7.c0.d(str);
                        mVar.s();
                        mVar.t();
                        try {
                            iArr = intArray;
                        } catch (SQLiteException e2) {
                            e = e2;
                            iArr = intArray;
                        }
                        try {
                            int delete = mVar.j0().delete("trigger_uris", "app_id=? and source=? and timestamp_millis<=?", new String[]{str, String.valueOf(i10), String.valueOf(j)});
                            v0 v0Var = q1Var.f8937t;
                            q1.l(v0Var);
                            t0 t0Var = v0Var.B;
                            StringBuilder sb2 = new StringBuilder(String.valueOf(delete).length() + 46);
                            sb2.append("Pruned ");
                            sb2.append(delete);
                            sb2.append(" trigger URIs. appId, source, timestamp");
                            t0Var.d(sb2.toString(), str, Integer.valueOf(i10), Long.valueOf(j));
                        } catch (SQLiteException e9) {
                            e = e9;
                            v0 v0Var2 = q1Var.f8937t;
                            q1.l(v0Var2);
                            v0Var2.f9050t.c(v0.A(str), e, "Error pruning trigger URIs. appId");
                            i3++;
                            intArray = iArr;
                        }
                        i3++;
                        intArray = iArr;
                    }
                }
            }
        }
        m mVar2 = this.f8762i;
        T(mVar2);
        String str2 = r4Var.f8976d;
        c7.c0.d(str2);
        mVar2.s();
        mVar2.t();
        ?? arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                cursor = mVar2.j0().query("trigger_uris", new String[]{"trigger_uri", "timestamp_millis", "source"}, "app_id=?", new String[]{str2}, null, null, "rowid", null);
                if (cursor.moveToFirst()) {
                    do {
                        String string = cursor.getString(0);
                        if (string == null) {
                            string = "";
                        }
                        arrayList.add(new x3(cursor.getInt(2), cursor.getLong(1), string));
                    } while (cursor.moveToNext());
                }
            } catch (Throwable th) {
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (SQLiteException e10) {
            v0 v0Var3 = ((q1) mVar2.f1478d).f8937t;
            q1.l(v0Var3);
            v0Var3.f9050t.c(v0.A(str2), e10, "Error querying trigger uris. appId");
            arrayList = Collections.EMPTY_LIST;
        }
        if (cursor != null) {
            cursor.close();
        }
        return arrayList;
    }

    @Override // s7.y1
    public final Context e() {
        return this.f8771z.f8932d;
    }

    public final g e0() {
        q1 q1Var = this.f8771z;
        c7.c0.g(q1Var);
        return q1Var.f8935r;
    }

    @Override // s7.y1
    public final g7.a f() {
        q1 q1Var = this.f8771z;
        c7.c0.g(q1Var);
        return q1Var.f8942y;
    }

    public final k1 f0() {
        k1 k1Var = this.f8760d;
        T(k1Var);
        return k1Var;
    }

    public final long g() {
        f().getClass();
        long currentTimeMillis = System.currentTimeMillis();
        n3 n3Var = this.f8768w;
        n3Var.t();
        n3Var.s();
        d1 d1Var = n3Var.f8880x;
        long a9 = d1Var.a();
        if (a9 == 0) {
            q1.j(((q1) n3Var.f1478d).f8940w);
            a9 = r2.r0().nextInt(86400000) + 1;
            d1Var.b(a9);
        }
        return ((((currentTimeMillis + a9) / 1000) / 60) / 60) / 24;
    }

    public final m g0() {
        m mVar = this.f8762i;
        T(mVar);
        return mVar;
    }

    public final void h(String str, u uVar) {
        m mVar = this.f8762i;
        T(mVar);
        a1 w02 = mVar.w0(str);
        if (w02 != null) {
            q1 q1Var = w02.f8474a;
            if (!TextUtils.isEmpty(w02.O())) {
                Boolean P = P(w02);
                if (P == null) {
                    if (!"_ui".equals(uVar.f9035d)) {
                        b().f9053w.b(v0.A(str), "Could not find package. appId");
                    }
                } else if (!P.booleanValue()) {
                    b().f9050t.b(v0.A(str), "App version does not match; dropping event. appId");
                    return;
                }
                String H = w02.H();
                String O = w02.O();
                long Q = w02.Q();
                o1 o1Var = q1Var.f8938u;
                q1.l(o1Var);
                o1Var.s();
                String str2 = w02.f8483l;
                o1 o1Var2 = q1Var.f8938u;
                q1.l(o1Var2);
                o1Var2.s();
                long j = w02.f8484m;
                o1 o1Var3 = q1Var.f8938u;
                q1.l(o1Var3);
                o1Var3.s();
                long j3 = w02.f8485n;
                o1 o1Var4 = q1Var.f8938u;
                q1.l(o1Var4);
                o1Var4.s();
                boolean z10 = w02.f8486o;
                String K = w02.K();
                o1 o1Var5 = q1Var.f8938u;
                q1.l(o1Var5);
                o1Var5.s();
                boolean z11 = w02.f8487p;
                Boolean x10 = w02.x();
                long b10 = w02.b();
                o1 o1Var6 = q1Var.f8938u;
                q1.l(o1Var6);
                o1Var6.s();
                ArrayList arrayList = w02.f8490s;
                String g = c(str).g();
                boolean z12 = w02.z();
                o1 o1Var7 = q1Var.f8938u;
                q1.l(o1Var7);
                o1Var7.s();
                long j10 = w02.f8493v;
                int i3 = c(str).f8557b;
                String str3 = o0(str).f8888b;
                o1 o1Var8 = q1Var.f8938u;
                q1.l(o1Var8);
                o1Var8.s();
                int i10 = w02.f8495x;
                o1 o1Var9 = q1Var.f8938u;
                q1.l(o1Var9);
                o1Var9.s();
                i(uVar, new r4(str, H, O, Q, str2, j, j3, (String) null, z10, false, K, 0L, 0, z11, false, x10, b10, (List) arrayList, g, "", (String) null, z12, j10, i3, str3, i10, w02.B, w02.D(), w02.s(), 0L, w02.t(), 0L));
                return;
            }
        }
        b().A.b(str, "No app data available; dropping event");
    }

    public final b1 h0() {
        b1 b1Var = this.f8763r;
        if (b1Var != null) {
            return b1Var;
        }
        kotlin.collections.i0.l("Network broadcast receiver not created");
        return null;
    }

    /* JADX WARN: Not initialized variable reg: 6, insn: 0x007d: MOVE (r5 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]) (LINE:126), block:B:37:0x007d */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(u uVar, r4 r4Var) {
        Throwable th;
        Cursor cursor;
        Cursor cursor2;
        Bundle bundle;
        u b10;
        t tVar;
        String str = r4Var.f8976d;
        c7.c0.d(str);
        w0 a9 = w0.a(uVar);
        Bundle bundle2 = a9.f9081e;
        p4 k02 = k0();
        m mVar = this.f8762i;
        T(mVar);
        q1 q1Var = (q1) mVar.f1478d;
        mVar.s();
        mVar.t();
        Cursor cursor3 = null;
        try {
            try {
                cursor = mVar.j0().rawQuery("select parameters from default_event_params where app_id=?", new String[]{str});
                try {
                } catch (SQLiteException e2) {
                    e = e2;
                    v0 v0Var = q1Var.f8937t;
                    q1.l(v0Var);
                    v0Var.f9050t.b(e, "Error selecting default event parameters");
                    if (cursor != null) {
                    }
                    bundle = null;
                    k02.F(bundle2, bundle);
                    p4 k03 = k0();
                    g e02 = e0();
                    e02.getClass();
                    k03.D(a9, Math.max(Math.min(e02.B(str, e0.X), 100), 25));
                    b10 = a9.b();
                    if (!e0().D(null, e0.Z0)) {
                    }
                    j(b10, r4Var);
                }
            } catch (Throwable th2) {
                th = th2;
                cursor3 = cursor2;
                if (cursor3 != null) {
                    throw th;
                }
                cursor3.close();
                throw th;
            }
        } catch (SQLiteException e9) {
            e = e9;
            cursor = null;
        } catch (Throwable th3) {
            th = th3;
            if (cursor3 != null) {
            }
        }
        if (cursor.moveToFirst()) {
            try {
                w8 w8Var = (w8) ((v8) l4.d0(w8.J(), cursor.getBlob(0))).d();
                mVar.f9150e.j0();
                bundle = l4.B(w8Var.v());
                cursor.close();
            } catch (IOException e10) {
                v0 v0Var2 = q1Var.f8937t;
                q1.l(v0Var2);
                v0Var2.f9050t.c(v0.A(str), e10, "Failed to retrieve default event parameters. appId");
            }
            k02.F(bundle2, bundle);
            p4 k032 = k0();
            g e022 = e0();
            e022.getClass();
            k032.D(a9, Math.max(Math.min(e022.B(str, e0.X), 100), 25));
            b10 = a9.b();
            if (!e0().D(null, e0.Z0) && "_cmp".equals(b10.f9035d)) {
                tVar = b10.f9036e;
                if ("referrer API v2".equals(tVar.f9010d.getString("_cis"))) {
                    String string = tVar.f9010d.getString("gclid");
                    if (!TextUtils.isEmpty(string)) {
                        W(new m4(b10.f9038r, string, "_lgclid", "auto"), r4Var);
                    }
                }
            }
            j(b10, r4Var);
        }
        v0 v0Var3 = q1Var.f8937t;
        q1.l(v0Var3);
        v0Var3.B.a("Default event parameters not found");
        if (cursor != null) {
            cursor.close();
        }
        bundle = null;
        k02.F(bundle2, bundle);
        p4 k0322 = k0();
        g e0222 = e0();
        e0222.getClass();
        k0322.D(a9, Math.max(Math.min(e0222.B(str, e0.X), 100), 25));
        b10 = a9.b();
        if (!e0().D(null, e0.Z0)) {
            tVar = b10.f9036e;
            if ("referrer API v2".equals(tVar.f9010d.getString("_cis"))) {
            }
        }
        j(b10, r4Var);
    }

    public final c i0() {
        c cVar = this.f8765t;
        T(cVar);
        return cVar;
    }

    public final void j(u uVar, r4 r4Var) {
        List v02;
        q1 q1Var;
        List v03;
        List v04;
        Iterator it;
        String str;
        c7.c0.g(r4Var);
        String str2 = r4Var.f8976d;
        c7.c0.d(str2);
        d().s();
        l0();
        long j = uVar.f9038r;
        long j3 = uVar.f9039s;
        w0 a9 = w0.a(uVar);
        d().s();
        y2 y2Var = this.T;
        if (y2Var == null || (str = this.U) == null || !str.equals(str2)) {
            y2Var = null;
        }
        p4.o0(y2Var, a9.f9081e, false);
        u b10 = a9.b();
        j0();
        if (TextUtils.isEmpty(r4Var.f8977e)) {
            return;
        }
        if (!r4Var.f8983v) {
            c0(r4Var);
            return;
        }
        List list = r4Var.F;
        if (list != null) {
            String str3 = b10.f9035d;
            if (!list.contains(str3)) {
                b().A.d("Dropping non-safelisted event. appId, event name, origin", str2, str3, b10.f9037i);
                return;
            } else {
                Bundle f3 = b10.f9036e.f();
                f3.putLong("ga_safelisted", 1L);
                b10 = new u(str3, new t(f3), b10.f9037i, b10.f9038r, b10.f9039s);
            }
        }
        m mVar = this.f8762i;
        T(mVar);
        mVar.g0();
        try {
            String str4 = b10.f9035d;
            if ("_s".equals(str4)) {
                m mVar2 = this.f8762i;
                T(mVar2);
                if (!mVar2.H(str2, "_s") && b10.f9036e.f9010d.getLong("_sid") != 0) {
                    m mVar3 = this.f8762i;
                    T(mVar3);
                    if (!mVar3.H(str2, "_f")) {
                        m mVar4 = this.f8762i;
                        T(mVar4);
                        if (!mVar4.H(str2, "_v")) {
                            m mVar5 = this.f8762i;
                            T(mVar5);
                            f().getClass();
                            mVar5.L(str2, Long.valueOf(System.currentTimeMillis() - 15000), "_sid", k(str2, b10));
                        }
                    }
                    m mVar6 = this.f8762i;
                    T(mVar6);
                    mVar6.L(str2, null, "_sid", k(str2, b10));
                }
            }
            m mVar7 = this.f8762i;
            T(mVar7);
            c7.c0.d(str2);
            mVar7.s();
            mVar7.t();
            int i3 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
            if (i3 < 0) {
                v0 v0Var = ((q1) mVar7.f1478d).f8937t;
                q1.l(v0Var);
                v0Var.f9053w.c(v0.A(str2), Long.valueOf(j), "Invalid time querying timed out conditional properties");
                v02 = Collections.EMPTY_LIST;
            } else {
                v02 = mVar7.v0("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{str2, String.valueOf(j)});
            }
            Iterator it2 = v02.iterator();
            while (true) {
                boolean hasNext = it2.hasNext();
                q1Var = this.f8771z;
                if (!hasNext) {
                    break;
                }
                e eVar = (e) it2.next();
                if (eVar != null) {
                    Iterator it3 = it2;
                    b().B.d("User property timed out", eVar.f8594d, q1Var.f8941x.c(eVar.f8596i.f8852e), eVar.f8596i.b());
                    u uVar2 = eVar.f8600u;
                    if (uVar2 != null) {
                        l(new u(uVar2, j, j3), r4Var);
                    }
                    m mVar8 = this.f8762i;
                    T(mVar8);
                    mVar8.t0(str2, eVar.f8596i.f8852e);
                    it2 = it3;
                }
            }
            m mVar9 = this.f8762i;
            T(mVar9);
            c7.c0.d(str2);
            mVar9.s();
            mVar9.t();
            if (i3 < 0) {
                v0 v0Var2 = ((q1) mVar9.f1478d).f8937t;
                q1.l(v0Var2);
                v0Var2.f9053w.c(v0.A(str2), Long.valueOf(j), "Invalid time querying expired conditional properties");
                v03 = Collections.EMPTY_LIST;
            } else {
                v03 = mVar9.v0("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{str2, String.valueOf(j)});
            }
            ArrayList arrayList = new ArrayList(v03.size());
            Iterator it4 = v03.iterator();
            while (it4.hasNext()) {
                e eVar2 = (e) it4.next();
                if (eVar2 != null) {
                    Iterator it5 = it4;
                    int i10 = i3;
                    long j10 = j;
                    b().B.d("User property expired", eVar2.f8594d, q1Var.f8941x.c(eVar2.f8596i.f8852e), eVar2.f8596i.b());
                    m mVar10 = this.f8762i;
                    T(mVar10);
                    mVar10.m0(str2, eVar2.f8596i.f8852e);
                    u uVar3 = eVar2.f8604y;
                    if (uVar3 != null) {
                        arrayList.add(uVar3);
                    }
                    m mVar11 = this.f8762i;
                    T(mVar11);
                    mVar11.t0(str2, eVar2.f8596i.f8852e);
                    it4 = it5;
                    i3 = i10;
                    j = j10;
                }
            }
            int i11 = i3;
            long j11 = j;
            int size = arrayList.size();
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList.get(i12);
                i12++;
                long j12 = j11;
                l(new u((u) obj, j12, j3), r4Var);
                j11 = j12;
                j3 = j3;
            }
            long j13 = j3;
            long j14 = j11;
            m mVar12 = this.f8762i;
            T(mVar12);
            c7.c0.d(str2);
            c7.c0.d(str4);
            mVar12.s();
            mVar12.t();
            if (i11 < 0) {
                q1 q1Var2 = (q1) mVar12.f1478d;
                v0 v0Var3 = q1Var2.f8937t;
                q1.l(v0Var3);
                v0Var3.f9053w.d("Invalid time querying triggered conditional properties", v0.A(str2), q1Var2.f8941x.a(str4), Long.valueOf(j14));
                v04 = Collections.EMPTY_LIST;
            } else {
                v04 = mVar12.v0("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{str2, str4, String.valueOf(j14)});
            }
            ArrayList arrayList2 = new ArrayList(v04.size());
            Iterator it6 = v04.iterator();
            while (it6.hasNext()) {
                e eVar3 = (e) it6.next();
                if (eVar3 != null) {
                    m4 m4Var = eVar3.f8596i;
                    String str5 = eVar3.f8594d;
                    c7.c0.g(str5);
                    long j15 = j14;
                    String str6 = eVar3.f8595e;
                    String str7 = m4Var.f8852e;
                    Object b11 = m4Var.b();
                    c7.c0.g(b11);
                    n4 n4Var = new n4(str5, str6, str7, j15, b11);
                    j14 = j15;
                    Object obj2 = n4Var.f8885e;
                    String str8 = n4Var.f8883c;
                    m mVar13 = this.f8762i;
                    T(mVar13);
                    if (mVar13.n0(n4Var)) {
                        it = it6;
                        b().B.d("User property triggered", eVar3.f8594d, q1Var.f8941x.c(str8), obj2);
                    } else {
                        it = it6;
                        b().f9050t.d("Too many active user properties, ignoring", v0.A(eVar3.f8594d), q1Var.f8941x.c(str8), obj2);
                    }
                    u uVar4 = eVar3.f8602w;
                    if (uVar4 != null) {
                        arrayList2.add(uVar4);
                    }
                    eVar3.f8596i = new m4(n4Var);
                    eVar3.f8598s = true;
                    m mVar14 = this.f8762i;
                    T(mVar14);
                    mVar14.r0(eVar3);
                    it6 = it;
                }
            }
            l(b10, r4Var);
            int size2 = arrayList2.size();
            int i13 = 0;
            while (i13 < size2) {
                Object obj3 = arrayList2.get(i13);
                i13++;
                long j16 = j13;
                l(new u((u) obj3, j14, j16), r4Var);
                j13 = j16;
            }
            m mVar15 = this.f8762i;
            T(mVar15);
            mVar15.h0();
            m mVar16 = this.f8762i;
            T(mVar16);
            mVar16.i0();
        } catch (Throwable th) {
            m mVar17 = this.f8762i;
            T(mVar17);
            mVar17.i0();
            throw th;
        }
    }

    public final l4 j0() {
        l4 l4Var = this.f8766u;
        T(l4Var);
        return l4Var;
    }

    public final Bundle k(String str, u uVar) {
        Bundle bundle = new Bundle();
        bundle.putLong("_sid", uVar.f9036e.f9010d.getLong("_sid"));
        m mVar = this.f8762i;
        T(mVar);
        n4 o02 = mVar.o0(str, "_sno");
        if (o02 != null) {
            Object obj = o02.f8885e;
            if (obj instanceof Long) {
                bundle.putLong("_sno", ((Long) obj).longValue());
            }
        }
        return bundle;
    }

    public final p4 k0() {
        q1 q1Var = this.f8771z;
        c7.c0.g(q1Var);
        p4 p4Var = q1Var.f8940w;
        q1.j(p4Var);
        return p4Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:335|(2:337|(9:339|340|(1:342)(1:343)|54|(0)(0)|57|(0)(0)|63|64))|344|345|346|347|348|340|(0)(0)|54|(0)(0)|57|(0)(0)|63|64) */
    /* JADX WARN: Can't wrap try/catch for region: R(64:(2:66|(3:68|(1:70)|71))|72|(2:74|(3:76|(1:78)|79))|80|81|(1:83)|84|(2:88|(1:90))|91|92|93|94|95|(1:97)|98|(2:100|(2:106|107)(1:105))(1:303)|108|(1:110)|111|(1:113)|114|(1:116)|117|(1:119)|120|(1:122)|123|(1:125)|126|127|(2:129|(38:131|(1:135)|136|(1:138)(1:301)|139|(1:141)(15:272|(1:274)(1:300)|275|(1:277)(1:299)|278|(1:280)(1:298)|281|(1:283)(1:297)|284|(1:286)(1:296)|287|(1:289)(1:295)|290|(1:292)(1:294)|293)|142|(1:144)|145|(1:147)|148|(1:152)|153|(3:245|246|(2:248|(4:251|(1:253)|254|(2:260|(28:262|(1:264)(1:269)|265|(1:267)|268|156|(2:158|(1:160)(2:161|162))|163|(7:165|166|167|168|(1:170)|171|172)(1:244)|173|(1:177)|178|(1:180)|181|(6:184|(2:186|(5:188|(1:190)(1:197)|191|(2:193|194)(1:196)|195))|198|199|195|182)|200|201|202|203|204|(2:205|(2:207|(2:209|210)(1:225))(3:226|227|(1:232)(1:231)))|211|212|213|(1:215)(2:221|222)|216|217|218)))))|155|156|(0)|163|(0)(0)|173|(2:175|177)|178|(0)|181|(1:182)|200|201|202|203|204|(3:205|(0)(0)|225)|211|212|213|(0)(0)|216|217|218))|302|142|(0)|145|(0)|148|(2:150|152)|153|(0)|155|156|(0)|163|(0)(0)|173|(0)|178|(0)|181|(1:182)|200|201|202|203|204|(3:205|(0)(0)|225)|211|212|213|(0)(0)|216|217|218) */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x0b46, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x0b4d, code lost:
    
        ((s7.q1) r1.f1478d).b().w().c(s7.v0.A(r2.f8926a), r0, "Error storing raw event. appId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x0b65, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x0b82, code lost:
    
        r3.b().w().c(s7.v0.A(r6.n()), r0, "Data loss. Failed to insert raw event metadata. appId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:350:0x02e4, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:351:0x02e5, code lost:
    
        ((s7.q1) r10.f1478d).b().w().c(s7.v0.A(r11), r0, "Error pruning currencies. appId");
     */
    /* JADX WARN: Removed duplicated region for block: B:144:0x077a A[Catch: all -> 0x01c3, TryCatch #2 {all -> 0x01c3, blocks: (B:41:0x01a1, B:44:0x01b0, B:46:0x01b8, B:49:0x01c7, B:54:0x0356, B:57:0x038e, B:59:0x03d1, B:61:0x03d6, B:62:0x03ed, B:66:0x03f8, B:68:0x0412, B:70:0x0418, B:71:0x042f, B:74:0x044c, B:78:0x046b, B:79:0x0482, B:80:0x048b, B:83:0x04a8, B:84:0x04bc, B:86:0x04c4, B:88:0x04ce, B:90:0x04d4, B:91:0x04db, B:93:0x04e8, B:97:0x052d, B:98:0x0542, B:100:0x0571, B:103:0x059b, B:105:0x05a5, B:107:0x05f2, B:108:0x061d, B:110:0x064a, B:111:0x064d, B:113:0x0655, B:114:0x0658, B:116:0x0660, B:117:0x0663, B:119:0x066b, B:120:0x066e, B:122:0x0677, B:123:0x067b, B:125:0x0689, B:126:0x068c, B:129:0x06bd, B:131:0x06cf, B:135:0x06e4, B:139:0x06f2, B:142:0x0774, B:144:0x077a, B:145:0x077d, B:147:0x0795, B:148:0x079f, B:150:0x07ac, B:152:0x07b6, B:153:0x07b9, B:253:0x07ee, B:272:0x06fb, B:275:0x070d, B:278:0x071c, B:281:0x072b, B:284:0x073a, B:287:0x0749, B:290:0x0756, B:293:0x0765, B:303:0x060d, B:306:0x0512, B:307:0x0368, B:308:0x0374, B:310:0x037a, B:313:0x0388, B:318:0x01e5, B:321:0x01f7, B:323:0x020c, B:328:0x0224, B:331:0x0254, B:333:0x025a, B:335:0x0268, B:337:0x0276, B:339:0x0289, B:340:0x0310, B:342:0x031a, B:345:0x02b9, B:347:0x02d2, B:348:0x02fa, B:351:0x02e5, B:353:0x0230, B:355:0x024e), top: B:40:0x01a1, inners: #3, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0795 A[Catch: all -> 0x01c3, TryCatch #2 {all -> 0x01c3, blocks: (B:41:0x01a1, B:44:0x01b0, B:46:0x01b8, B:49:0x01c7, B:54:0x0356, B:57:0x038e, B:59:0x03d1, B:61:0x03d6, B:62:0x03ed, B:66:0x03f8, B:68:0x0412, B:70:0x0418, B:71:0x042f, B:74:0x044c, B:78:0x046b, B:79:0x0482, B:80:0x048b, B:83:0x04a8, B:84:0x04bc, B:86:0x04c4, B:88:0x04ce, B:90:0x04d4, B:91:0x04db, B:93:0x04e8, B:97:0x052d, B:98:0x0542, B:100:0x0571, B:103:0x059b, B:105:0x05a5, B:107:0x05f2, B:108:0x061d, B:110:0x064a, B:111:0x064d, B:113:0x0655, B:114:0x0658, B:116:0x0660, B:117:0x0663, B:119:0x066b, B:120:0x066e, B:122:0x0677, B:123:0x067b, B:125:0x0689, B:126:0x068c, B:129:0x06bd, B:131:0x06cf, B:135:0x06e4, B:139:0x06f2, B:142:0x0774, B:144:0x077a, B:145:0x077d, B:147:0x0795, B:148:0x079f, B:150:0x07ac, B:152:0x07b6, B:153:0x07b9, B:253:0x07ee, B:272:0x06fb, B:275:0x070d, B:278:0x071c, B:281:0x072b, B:284:0x073a, B:287:0x0749, B:290:0x0756, B:293:0x0765, B:303:0x060d, B:306:0x0512, B:307:0x0368, B:308:0x0374, B:310:0x037a, B:313:0x0388, B:318:0x01e5, B:321:0x01f7, B:323:0x020c, B:328:0x0224, B:331:0x0254, B:333:0x025a, B:335:0x0268, B:337:0x0276, B:339:0x0289, B:340:0x0310, B:342:0x031a, B:345:0x02b9, B:347:0x02d2, B:348:0x02fa, B:351:0x02e5, B:353:0x0230, B:355:0x024e), top: B:40:0x01a1, inners: #3, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x08c1 A[Catch: all -> 0x0853, TryCatch #1 {all -> 0x0853, blocks: (B:246:0x07cd, B:248:0x07d1, B:251:0x07e3, B:254:0x07f7, B:256:0x0801, B:258:0x080d, B:260:0x0817, B:262:0x0825, B:264:0x083f, B:265:0x085a, B:267:0x0868, B:268:0x0871, B:156:0x087e, B:158:0x08c1, B:161:0x08cc, B:162:0x08d6, B:163:0x08d7, B:165:0x08e1), top: B:245:0x07cd }] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x08e1 A[Catch: all -> 0x0853, TRY_LEAVE, TryCatch #1 {all -> 0x0853, blocks: (B:246:0x07cd, B:248:0x07d1, B:251:0x07e3, B:254:0x07f7, B:256:0x0801, B:258:0x080d, B:260:0x0817, B:262:0x0825, B:264:0x083f, B:265:0x085a, B:267:0x0868, B:268:0x0871, B:156:0x087e, B:158:0x08c1, B:161:0x08cc, B:162:0x08d6, B:163:0x08d7, B:165:0x08e1), top: B:245:0x07cd }] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x094c A[Catch: all -> 0x090b, TryCatch #6 {all -> 0x090b, blocks: (B:168:0x08e8, B:170:0x08ff, B:172:0x090e, B:173:0x0944, B:175:0x094c, B:177:0x0956, B:178:0x0960, B:180:0x096a, B:181:0x0974, B:182:0x097d, B:184:0x0983, B:186:0x09cd, B:188:0x09df, B:191:0x09fa, B:193:0x0a0a, B:197:0x09ee, B:201:0x0a1d, B:203:0x0a5f, B:204:0x0a6a, B:205:0x0a7f, B:207:0x0a85, B:211:0x0acc, B:213:0x0b1f, B:215:0x0b30, B:216:0x0b97, B:222:0x0b4a, B:224:0x0b4d, B:227:0x0a92, B:229:0x0ab8, B:235:0x0b68, B:236:0x0b81, B:239:0x0b82), top: B:167:0x08e8, inners: #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x096a A[Catch: all -> 0x090b, TryCatch #6 {all -> 0x090b, blocks: (B:168:0x08e8, B:170:0x08ff, B:172:0x090e, B:173:0x0944, B:175:0x094c, B:177:0x0956, B:178:0x0960, B:180:0x096a, B:181:0x0974, B:182:0x097d, B:184:0x0983, B:186:0x09cd, B:188:0x09df, B:191:0x09fa, B:193:0x0a0a, B:197:0x09ee, B:201:0x0a1d, B:203:0x0a5f, B:204:0x0a6a, B:205:0x0a7f, B:207:0x0a85, B:211:0x0acc, B:213:0x0b1f, B:215:0x0b30, B:216:0x0b97, B:222:0x0b4a, B:224:0x0b4d, B:227:0x0a92, B:229:0x0ab8, B:235:0x0b68, B:236:0x0b81, B:239:0x0b82), top: B:167:0x08e8, inners: #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0983 A[Catch: all -> 0x090b, TryCatch #6 {all -> 0x090b, blocks: (B:168:0x08e8, B:170:0x08ff, B:172:0x090e, B:173:0x0944, B:175:0x094c, B:177:0x0956, B:178:0x0960, B:180:0x096a, B:181:0x0974, B:182:0x097d, B:184:0x0983, B:186:0x09cd, B:188:0x09df, B:191:0x09fa, B:193:0x0a0a, B:197:0x09ee, B:201:0x0a1d, B:203:0x0a5f, B:204:0x0a6a, B:205:0x0a7f, B:207:0x0a85, B:211:0x0acc, B:213:0x0b1f, B:215:0x0b30, B:216:0x0b97, B:222:0x0b4a, B:224:0x0b4d, B:227:0x0a92, B:229:0x0ab8, B:235:0x0b68, B:236:0x0b81, B:239:0x0b82), top: B:167:0x08e8, inners: #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0a85 A[Catch: all -> 0x090b, TryCatch #6 {all -> 0x090b, blocks: (B:168:0x08e8, B:170:0x08ff, B:172:0x090e, B:173:0x0944, B:175:0x094c, B:177:0x0956, B:178:0x0960, B:180:0x096a, B:181:0x0974, B:182:0x097d, B:184:0x0983, B:186:0x09cd, B:188:0x09df, B:191:0x09fa, B:193:0x0a0a, B:197:0x09ee, B:201:0x0a1d, B:203:0x0a5f, B:204:0x0a6a, B:205:0x0a7f, B:207:0x0a85, B:211:0x0acc, B:213:0x0b1f, B:215:0x0b30, B:216:0x0b97, B:222:0x0b4a, B:224:0x0b4d, B:227:0x0a92, B:229:0x0ab8, B:235:0x0b68, B:236:0x0b81, B:239:0x0b82), top: B:167:0x08e8, inners: #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0b30 A[Catch: all -> 0x090b, SQLiteException -> 0x0b46, TRY_LEAVE, TryCatch #5 {SQLiteException -> 0x0b46, blocks: (B:213:0x0b1f, B:215:0x0b30), top: B:212:0x0b1f, outer: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0b48  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0a92 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0941  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x07cd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0368 A[Catch: all -> 0x01c3, TryCatch #2 {all -> 0x01c3, blocks: (B:41:0x01a1, B:44:0x01b0, B:46:0x01b8, B:49:0x01c7, B:54:0x0356, B:57:0x038e, B:59:0x03d1, B:61:0x03d6, B:62:0x03ed, B:66:0x03f8, B:68:0x0412, B:70:0x0418, B:71:0x042f, B:74:0x044c, B:78:0x046b, B:79:0x0482, B:80:0x048b, B:83:0x04a8, B:84:0x04bc, B:86:0x04c4, B:88:0x04ce, B:90:0x04d4, B:91:0x04db, B:93:0x04e8, B:97:0x052d, B:98:0x0542, B:100:0x0571, B:103:0x059b, B:105:0x05a5, B:107:0x05f2, B:108:0x061d, B:110:0x064a, B:111:0x064d, B:113:0x0655, B:114:0x0658, B:116:0x0660, B:117:0x0663, B:119:0x066b, B:120:0x066e, B:122:0x0677, B:123:0x067b, B:125:0x0689, B:126:0x068c, B:129:0x06bd, B:131:0x06cf, B:135:0x06e4, B:139:0x06f2, B:142:0x0774, B:144:0x077a, B:145:0x077d, B:147:0x0795, B:148:0x079f, B:150:0x07ac, B:152:0x07b6, B:153:0x07b9, B:253:0x07ee, B:272:0x06fb, B:275:0x070d, B:278:0x071c, B:281:0x072b, B:284:0x073a, B:287:0x0749, B:290:0x0756, B:293:0x0765, B:303:0x060d, B:306:0x0512, B:307:0x0368, B:308:0x0374, B:310:0x037a, B:313:0x0388, B:318:0x01e5, B:321:0x01f7, B:323:0x020c, B:328:0x0224, B:331:0x0254, B:333:0x025a, B:335:0x0268, B:337:0x0276, B:339:0x0289, B:340:0x0310, B:342:0x031a, B:345:0x02b9, B:347:0x02d2, B:348:0x02fa, B:351:0x02e5, B:353:0x0230, B:355:0x024e), top: B:40:0x01a1, inners: #3, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:342:0x031a A[Catch: all -> 0x01c3, TryCatch #2 {all -> 0x01c3, blocks: (B:41:0x01a1, B:44:0x01b0, B:46:0x01b8, B:49:0x01c7, B:54:0x0356, B:57:0x038e, B:59:0x03d1, B:61:0x03d6, B:62:0x03ed, B:66:0x03f8, B:68:0x0412, B:70:0x0418, B:71:0x042f, B:74:0x044c, B:78:0x046b, B:79:0x0482, B:80:0x048b, B:83:0x04a8, B:84:0x04bc, B:86:0x04c4, B:88:0x04ce, B:90:0x04d4, B:91:0x04db, B:93:0x04e8, B:97:0x052d, B:98:0x0542, B:100:0x0571, B:103:0x059b, B:105:0x05a5, B:107:0x05f2, B:108:0x061d, B:110:0x064a, B:111:0x064d, B:113:0x0655, B:114:0x0658, B:116:0x0660, B:117:0x0663, B:119:0x066b, B:120:0x066e, B:122:0x0677, B:123:0x067b, B:125:0x0689, B:126:0x068c, B:129:0x06bd, B:131:0x06cf, B:135:0x06e4, B:139:0x06f2, B:142:0x0774, B:144:0x077a, B:145:0x077d, B:147:0x0795, B:148:0x079f, B:150:0x07ac, B:152:0x07b6, B:153:0x07b9, B:253:0x07ee, B:272:0x06fb, B:275:0x070d, B:278:0x071c, B:281:0x072b, B:284:0x073a, B:287:0x0749, B:290:0x0756, B:293:0x0765, B:303:0x060d, B:306:0x0512, B:307:0x0368, B:308:0x0374, B:310:0x037a, B:313:0x0388, B:318:0x01e5, B:321:0x01f7, B:323:0x020c, B:328:0x0224, B:331:0x0254, B:333:0x025a, B:335:0x0268, B:337:0x0276, B:339:0x0289, B:340:0x0310, B:342:0x031a, B:345:0x02b9, B:347:0x02d2, B:348:0x02fa, B:351:0x02e5, B:353:0x0230, B:355:0x024e), top: B:40:0x01a1, inners: #3, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x03d1 A[Catch: all -> 0x01c3, TryCatch #2 {all -> 0x01c3, blocks: (B:41:0x01a1, B:44:0x01b0, B:46:0x01b8, B:49:0x01c7, B:54:0x0356, B:57:0x038e, B:59:0x03d1, B:61:0x03d6, B:62:0x03ed, B:66:0x03f8, B:68:0x0412, B:70:0x0418, B:71:0x042f, B:74:0x044c, B:78:0x046b, B:79:0x0482, B:80:0x048b, B:83:0x04a8, B:84:0x04bc, B:86:0x04c4, B:88:0x04ce, B:90:0x04d4, B:91:0x04db, B:93:0x04e8, B:97:0x052d, B:98:0x0542, B:100:0x0571, B:103:0x059b, B:105:0x05a5, B:107:0x05f2, B:108:0x061d, B:110:0x064a, B:111:0x064d, B:113:0x0655, B:114:0x0658, B:116:0x0660, B:117:0x0663, B:119:0x066b, B:120:0x066e, B:122:0x0677, B:123:0x067b, B:125:0x0689, B:126:0x068c, B:129:0x06bd, B:131:0x06cf, B:135:0x06e4, B:139:0x06f2, B:142:0x0774, B:144:0x077a, B:145:0x077d, B:147:0x0795, B:148:0x079f, B:150:0x07ac, B:152:0x07b6, B:153:0x07b9, B:253:0x07ee, B:272:0x06fb, B:275:0x070d, B:278:0x071c, B:281:0x072b, B:284:0x073a, B:287:0x0749, B:290:0x0756, B:293:0x0765, B:303:0x060d, B:306:0x0512, B:307:0x0368, B:308:0x0374, B:310:0x037a, B:313:0x0388, B:318:0x01e5, B:321:0x01f7, B:323:0x020c, B:328:0x0224, B:331:0x0254, B:333:0x025a, B:335:0x0268, B:337:0x0276, B:339:0x0289, B:340:0x0310, B:342:0x031a, B:345:0x02b9, B:347:0x02d2, B:348:0x02fa, B:351:0x02e5, B:353:0x0230, B:355:0x024e), top: B:40:0x01a1, inners: #3, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x03f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(u uVar, r4 r4Var) {
        String str;
        j4 j4Var;
        String str2;
        boolean z10;
        long j;
        String str3;
        String str4;
        String str5;
        g4 g4Var;
        String str6;
        t tVar;
        n4 n4Var;
        long j3;
        long intValue;
        long j10;
        g4 g4Var2;
        q qVar;
        r rVar;
        String str7;
        String str8;
        long j11;
        c2 j12;
        a1 w02;
        q qVar2;
        long j13;
        a1 w03;
        int i3;
        List p02;
        int i10;
        m g02;
        e9 e9Var;
        m g03;
        Iterator<String> it;
        ContentValues contentValues;
        String str9;
        long b02;
        List J;
        long j14;
        boolean z11;
        n4 o02;
        c7.c0.g(r4Var);
        boolean z12 = r4Var.f8983v;
        String str10 = r4Var.f8976d;
        c7.c0.d(str10);
        long nanoTime = System.nanoTime();
        d().s();
        l0();
        j0();
        String str11 = r4Var.f8977e;
        if (TextUtils.isEmpty(str11)) {
            return;
        }
        if (!z12) {
            c0(r4Var);
            return;
        }
        k1 f02 = f0();
        String str12 = uVar.f9035d;
        boolean H = f02.H(str10, str12);
        q1 q1Var = this.f8771z;
        g4 g4Var3 = this.X;
        if (H) {
            b().x().c(v0.A(str10), q1Var.m().a(str12), "Dropping blocked event. appId");
            if (!"1".equals(f0().c(str10, "measurement.upload.blacklist_internal")) && !"1".equals(f0().c(str10, "measurement.upload.blacklist_public"))) {
                if ("_err".equals(str12)) {
                    return;
                }
                k0();
                p4.K(g4Var3, str10, 11, "_ev", str12, 0);
                return;
            }
            a1 w04 = g0().w0(str10);
            if (w04 != null) {
                q1 q1Var2 = w04.f8474a;
                o1 o1Var = q1Var2.f8938u;
                q1.l(o1Var);
                o1Var.s();
                long j15 = w04.T;
                o1 o1Var2 = q1Var2.f8938u;
                q1.l(o1Var2);
                o1Var2.s();
                long max = Math.max(j15, w04.S);
                f().getClass();
                long abs = Math.abs(System.currentTimeMillis() - max);
                e0();
                if (abs > ((Long) e0.N.a(null)).longValue()) {
                    b().y().a("Fetching config for blocked app");
                    A(w04);
                    return;
                }
                return;
            }
            return;
        }
        w0 a9 = w0.a(uVar);
        p4 k02 = k0();
        g e02 = e0();
        e02.getClass();
        k02.D(a9, Math.max(Math.min(e02.B(str10, e0.X), 100), 25));
        int max2 = Math.max(Math.min(e0().B(str10, e0.f8621f0), 35), 10);
        Bundle bundle = a9.f9081e;
        Iterator it2 = new TreeSet(bundle.keySet()).iterator();
        while (it2.hasNext()) {
            String str13 = (String) it2.next();
            Iterator it3 = it2;
            if ("items".equals(str13)) {
                k0().E(bundle.getParcelableArray(str13), max2);
            }
            it2 = it3;
        }
        u b10 = a9.b();
        t tVar2 = b10.f9036e;
        String str14 = b10.f9035d;
        if (Log.isLoggable(b().C(), 2)) {
            str = "_err";
            b().z().b(q1Var.m().d(b10), "Logging event");
        } else {
            str = "_err";
        }
        g0().g0();
        try {
            c0(r4Var);
            int i11 = 1;
            boolean z13 = "ecommerce_purchase".equals(str14) || "purchase".equals(str14) || "refund".equals(str14);
            if (!"_iap".equals(str14)) {
                if (!z13) {
                    str2 = "app_id";
                    str3 = "_fx";
                    z10 = z12;
                    tVar = tVar2;
                    str4 = str14;
                    str5 = str11;
                    g4Var = g4Var3;
                    str6 = str;
                    boolean s02 = p4.s0(str4);
                    String str15 = str4;
                    boolean equals = str6.equals(str15);
                    k0();
                    if (tVar != null) {
                        j3 = 0;
                    } else {
                        Iterator<String> it4 = tVar.f9010d.keySet().iterator();
                        j3 = 0;
                        while (it4.hasNext()) {
                            if (tVar.b(it4.next()) instanceof Parcelable[]) {
                                j3 += ((Parcelable[]) r5).length;
                            }
                        }
                    }
                    t tVar3 = tVar;
                    j z02 = g0().z0(g(), str10, j3 + 1, true, s02, false, equals, false, false, false);
                    long j16 = z02.f8748b;
                    e0();
                    intValue = j16 - ((Integer) e0.f8634l.a(null)).intValue();
                    if (intValue <= 0) {
                        if (intValue % 1000 == 1) {
                            b().w().c(v0.A(str10), Long.valueOf(z02.f8748b), "Data loss. Too many events logged. appId, count");
                        }
                        g0().h0();
                    } else {
                        if (s02) {
                            long j17 = z02.f8747a;
                            e0();
                            long intValue2 = j17 - ((Integer) e0.f8638n.a(null)).intValue();
                            if (intValue2 > 0) {
                                if (intValue2 % 1000 == 1) {
                                    b().w().c(v0.A(str10), Long.valueOf(z02.f8747a), "Data loss. Too many public events logged. appId, count");
                                }
                                k0();
                                p4.K(g4Var, str10, 16, "_ev", b10.f9035d, 0);
                                g0().h0();
                            }
                        }
                        if (equals) {
                            long max3 = z02.f8750d - Math.max(0, Math.min(1000000, e0().B(str10, e0.f8636m)));
                            if (max3 > 0) {
                                if (max3 == 1) {
                                    b().w().c(v0.A(str10), Long.valueOf(z02.f8750d), "Too many error events logged. appId, count");
                                }
                                g0().h0();
                            }
                        }
                        Bundle f3 = tVar3.f();
                        k0().J(f3, "_o", b10.f9037i);
                        if (k0().X(str10, r4Var.P)) {
                            k0().J(f3, "_dbg", 1L);
                            k0().J(f3, "_r", 1L);
                        }
                        if ("_s".equals(str15) && (o02 = g0().o0(str10, "_sno")) != null) {
                            Object obj = o02.f8885e;
                            if (obj instanceof Long) {
                                k0().J(f3, "_sno", obj);
                            }
                        }
                        m g04 = g0();
                        c7.c0.d(str10);
                        g04.s();
                        g04.t();
                        try {
                            j10 = g04.j0().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str10, String.valueOf(Math.max(0, Math.min(1000000, ((q1) g04.f1478d).f8935r.B(str10, e0.f8644q))))});
                        } catch (SQLiteException e2) {
                            ((q1) g04.f1478d).b().w().c(v0.A(str10), e2, "Error deleting over the limit events. appId");
                            j10 = 0;
                        }
                        if (j10 > 0) {
                            b().x().c(v0.A(str10), Long.valueOf(j10), "Data lost. Too many events stored on disk, deleted. appId");
                        }
                        q1 q1Var3 = this.f8771z;
                        q qVar3 = new q(q1Var3, b10.f9037i, str10, b10.f9035d, b10.f9038r, b10.f9039s, 0L, f3);
                        String str16 = str10;
                        m g05 = g0();
                        String str17 = qVar3.f8927b;
                        r S = g05.S("events", str16, str17);
                        if (S == null) {
                            long J2 = g0().J(str16);
                            e0().getClass();
                            d0 d0Var = e0.W;
                            if (J2 < Math.max(Math.min(r5.B(str16, d0Var), 2000), PermissionsActivity.DELAY_TIME_CALLBACK_CALL) || !s02 || k0().A0(str17)) {
                                str16 = str16;
                                g4Var2 = g4Var;
                                rVar = new r(str16, str17, 0L, 0L, 0L, qVar3.f8929d, 0L, null, null, null, null);
                                qVar = qVar3;
                            } else {
                                t0 w6 = b().w();
                                u0 A = v0.A(str16);
                                String a10 = q1Var3.m().a(str17);
                                g e03 = e0();
                                e03.getClass();
                                w6.d("Too many event names used, ignoring event. appId, name, supported count", A, a10, Integer.valueOf(Math.max(Math.min(e03.B(str16, d0Var), 2000), PermissionsActivity.DELAY_TIME_CALLBACK_CALL)));
                                k0();
                                p4.K(g4Var, str16, 8, null, null, 0);
                            }
                        } else {
                            g4Var2 = g4Var;
                            q a11 = qVar3.a(q1Var3, S.f8964f);
                            r a12 = S.a(a11.f8929d);
                            qVar = a11;
                            rVar = a12;
                        }
                        g0().T("events", rVar);
                        d().s();
                        l0();
                        String str18 = qVar.f8926a;
                        c7.c0.d(str18);
                        c7.c0.b(str18.equals(str16));
                        d9 Y2 = e9.Y();
                        Y2.x();
                        Y2.i();
                        if (!TextUtils.isEmpty(str16)) {
                            Y2.o(str16);
                        }
                        String str19 = r4Var.f8979r;
                        if (!TextUtils.isEmpty(str19)) {
                            Y2.m(str19);
                        }
                        String str20 = r4Var.f8978i;
                        if (!TextUtils.isEmpty(str20)) {
                            Y2.p(str20);
                        }
                        String str21 = r4Var.I;
                        if (!TextUtils.isEmpty(str21)) {
                            Y2.Q(str21);
                        }
                        long j18 = r4Var.f8985x;
                        if (j18 != -2147483648L) {
                            Y2.K((int) j18);
                        }
                        long j19 = r4Var.f8980s;
                        Y2.q(j19);
                        if (!TextUtils.isEmpty(str5)) {
                            Y2.G(str5);
                        }
                        c7.c0.g(str16);
                        c2 c10 = c(str16);
                        String str22 = str21;
                        String str23 = r4Var.G;
                        c2 j20 = c10.j(c2.c(100, str23));
                        Y2.P(j20.f());
                        com.google.android.gms.internal.measurement.i4.a();
                        boolean D = e0().D(str16, e0.O0);
                        b2 b2Var = b2.AD_STORAGE;
                        try {
                            if (D) {
                                k0();
                                if (p4.U((String) e0.f8645q0.a(null), str16)) {
                                    Y2.y(r4Var.N);
                                    str7 = str5;
                                    str8 = str20;
                                    long j21 = r4Var.O;
                                    if (!j20.i(b2Var) && j21 != 0) {
                                        j21 = (j21 & (-2)) | 32;
                                    }
                                    Y2.S(j21 == 1);
                                    if (j21 != 0) {
                                        l8 A2 = m8.A();
                                        if ((j21 & 1) != 0) {
                                            j14 = j21;
                                            z11 = true;
                                        } else {
                                            j14 = j21;
                                            z11 = false;
                                        }
                                        A2.g(z11);
                                        A2.h((j14 & 2) != 0);
                                        A2.i((j14 & 4) != 0);
                                        A2.j((j14 & 8) != 0);
                                        A2.k((j14 & 16) != 0);
                                        A2.l((j14 & 32) != 0);
                                        A2.m((j14 & 64) != 0);
                                        Y2.z((m8) A2.d());
                                    }
                                    j11 = r4Var.f8981t;
                                    if (j11 != 0) {
                                        Y2.v(j11);
                                    }
                                    long j22 = r4Var.E;
                                    Y2.N(j22);
                                    String str24 = str7;
                                    String str25 = str8;
                                    if (e0().D(null, e0.U0)) {
                                        e0();
                                        Y2.D(com.google.android.gms.internal.measurement.f3.a());
                                    }
                                    if (e0().D(null, e0.V0) && (J = f0().J(str16)) != null) {
                                        Y2.M(J);
                                    }
                                    j12 = c(str16).j(c2.c(100, str23));
                                    if (j12.i(b2Var)) {
                                        try {
                                            boolean z14 = r4Var.B;
                                            if (z14) {
                                                Pair w10 = this.f8768w.w(r4Var, j12);
                                                if (!TextUtils.isEmpty((CharSequence) w10.first) && z14) {
                                                    Y2.s((String) w10.first);
                                                    Object obj2 = w10.second;
                                                    if (obj2 != null) {
                                                        Y2.t(((Boolean) obj2).booleanValue());
                                                    }
                                                    String str26 = str3;
                                                    if (!qVar.f8927b.equals(str26) && !((String) w10.first).equals("00000000-0000-0000-0000-000000000000") && (w02 = g0().w0(str16)) != null) {
                                                        o1 o1Var3 = w02.f8474a.f8938u;
                                                        q1.l(o1Var3);
                                                        o1Var3.s();
                                                        if (w02.f8496y) {
                                                            qVar2 = qVar;
                                                            u(str16, false, null, null);
                                                            Bundle bundle2 = new Bundle();
                                                            o1 o1Var4 = w02.f8474a.f8938u;
                                                            q1.l(o1Var4);
                                                            o1Var4.s();
                                                            Long l10 = w02.f8497z;
                                                            if (l10 != null) {
                                                                j13 = j22;
                                                                bundle2.putLong("_pfo", Math.max(0L, l10.longValue()));
                                                            } else {
                                                                j13 = j22;
                                                            }
                                                            o1 o1Var5 = w02.f8474a.f8938u;
                                                            q1.l(o1Var5);
                                                            o1Var5.s();
                                                            Long l11 = w02.A;
                                                            if (l11 != null) {
                                                                bundle2.putLong("_uwa", l11.longValue());
                                                            }
                                                            bundle2.putLong("_r", 1L);
                                                            g4Var2.a(str16, str26, bundle2);
                                                            q1Var3.p().u();
                                                            String str27 = Build.MODEL;
                                                            Y2.j();
                                                            q1Var3.p().u();
                                                            String str28 = Build.VERSION.RELEASE;
                                                            Y2.b();
                                                            ((e9) Y2.f2389e).s0(str28);
                                                            Y2.l((int) q1Var3.p().w());
                                                            Y2.k(q1Var3.p().x());
                                                            Y2.R(r4Var.K);
                                                            if (q1Var3.c()) {
                                                                Y2.n();
                                                                if (!TextUtils.isEmpty(null)) {
                                                                    Y2.b();
                                                                    ((e9) Y2.f2389e).V0(null);
                                                                    throw null;
                                                                }
                                                            }
                                                            w03 = g0().w0(str16);
                                                            if (w03 == null) {
                                                                w03 = new a1(q1Var3, str16);
                                                                j4Var = this;
                                                                try {
                                                                    w03.G(j4Var.o(j12));
                                                                    w03.L(r4Var.f8986y);
                                                                    w03.I(str24);
                                                                    if (j12.i(b2Var)) {
                                                                        w03.J(j4Var.f8768w.y(r4Var, j12));
                                                                    }
                                                                    w03.e(0L);
                                                                    w03.M(0L);
                                                                    w03.N(0L);
                                                                    w03.P(str25);
                                                                    w03.R(j18);
                                                                    w03.S(str19);
                                                                    w03.T(j19);
                                                                    w03.a(j11);
                                                                    w03.d(z10);
                                                                    w03.c(j13);
                                                                    i3 = 0;
                                                                    j4Var.g0().x0(w03, false);
                                                                } catch (Throwable th) {
                                                                    th = th;
                                                                    j4Var.g0().i0();
                                                                    throw th;
                                                                }
                                                            } else {
                                                                i3 = 0;
                                                                j4Var = this;
                                                            }
                                                            if (j12.i(b2.ANALYTICS_STORAGE) && !TextUtils.isEmpty(w03.F())) {
                                                                String F = w03.F();
                                                                c7.c0.g(F);
                                                                Y2.u(F);
                                                            }
                                                            if (!TextUtils.isEmpty(w03.K())) {
                                                                String K = w03.K();
                                                                c7.c0.g(K);
                                                                Y2.J(K);
                                                            }
                                                            p02 = j4Var.g0().p0(str16);
                                                            i10 = i3;
                                                            while (i10 < p02.size()) {
                                                                m9 E = n9.E();
                                                                String str29 = ((n4) p02.get(i10)).f8883c;
                                                                E.b();
                                                                ((n9) E.f2389e).G(str29);
                                                                long j23 = ((n4) p02.get(i10)).f8884d;
                                                                E.b();
                                                                ((n9) E.f2389e).F(j23);
                                                                j4Var.j0().P(E, ((n4) p02.get(i10)).f8885e);
                                                                Y2.Y(E);
                                                                if ("_sid".equals(((n4) p02.get(i10)).f8883c)) {
                                                                    o1 o1Var6 = w03.f8474a.f8938u;
                                                                    q1.l(o1Var6);
                                                                    o1Var6.s();
                                                                    if (w03.f8494w != 0) {
                                                                        l4 j02 = j4Var.j0();
                                                                        if (TextUtils.isEmpty(str22)) {
                                                                            str9 = str22;
                                                                            b02 = 0;
                                                                        } else {
                                                                            str9 = str22;
                                                                            b02 = j02.b0(str9.getBytes(StandardCharsets.UTF_8));
                                                                        }
                                                                        o1 o1Var7 = w03.f8474a.f8938u;
                                                                        q1.l(o1Var7);
                                                                        o1Var7.s();
                                                                        if (b02 != w03.f8494w) {
                                                                            Y2.b();
                                                                            ((e9) Y2.f2389e).d1();
                                                                        }
                                                                        i10++;
                                                                        str22 = str9;
                                                                    }
                                                                }
                                                                str9 = str22;
                                                                i10++;
                                                                str22 = str9;
                                                            }
                                                            g02 = j4Var.g0();
                                                            e9Var = (e9) Y2.d();
                                                            g02.s();
                                                            g02.t();
                                                            c7.c0.d(e9Var.t());
                                                            byte[] a13 = e9Var.a();
                                                            long b03 = g02.f9150e.j0().b0(a13);
                                                            ContentValues contentValues2 = new ContentValues();
                                                            String str30 = str2;
                                                            contentValues2.put(str30, e9Var.t());
                                                            contentValues2.put("metadata_fingerprint", Long.valueOf(b03));
                                                            contentValues2.put("metadata", a13);
                                                            g02.j0().insertWithOnConflict("raw_events_metadata", null, contentValues2, 4);
                                                            g03 = j4Var.g0();
                                                            q qVar4 = qVar2;
                                                            t tVar4 = qVar4.g;
                                                            Objects.requireNonNull(tVar4);
                                                            it = tVar4.f9010d.keySet().iterator();
                                                            while (true) {
                                                                if (!it.hasNext()) {
                                                                    k1 f03 = j4Var.f0();
                                                                    String str31 = qVar4.f8926a;
                                                                    boolean I = f03.I(str31, qVar4.f8927b);
                                                                    j y02 = j4Var.g0().y0(j4Var.g(), str31, false, false, false, false);
                                                                    if (!I || y02.f8751e >= j4Var.e0().B(str31, e0.f8642p)) {
                                                                        i11 = i3;
                                                                    }
                                                                } else if ("_r".equals(it.next())) {
                                                                    break;
                                                                }
                                                            }
                                                            g03.s();
                                                            g03.t();
                                                            String str32 = qVar4.f8926a;
                                                            c7.c0.d(str32);
                                                            byte[] a14 = g03.f9150e.j0().S(qVar4).a();
                                                            contentValues = new ContentValues();
                                                            contentValues.put(str30, str32);
                                                            contentValues.put("name", qVar4.f8927b);
                                                            contentValues.put("timestamp", Long.valueOf(qVar4.f8929d));
                                                            contentValues.put("metadata_fingerprint", Long.valueOf(b03));
                                                            contentValues.put("data", a14);
                                                            contentValues.put("realtime", Integer.valueOf(i11));
                                                            contentValues.put("elapsed_time", Long.valueOf(qVar4.f8930e));
                                                            if (g03.j0().insert("raw_events", null, contentValues) == -1) {
                                                                ((q1) g03.f1478d).b().w().b(v0.A(str32), "Failed to insert raw event (got -1). appId");
                                                            } else {
                                                                j4Var.C = 0L;
                                                            }
                                                            j4Var.g0().h0();
                                                            j4Var.g0().i0();
                                                            j4Var.N();
                                                            j4Var.b().z().b(Long.valueOf(((System.nanoTime() - nanoTime) + 500000) / 1000000), "Background event processing time, ms");
                                                            return;
                                                        }
                                                    }
                                                }
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            j4Var = this;
                                            j4Var.g0().i0();
                                            throw th;
                                        }
                                    }
                                    qVar2 = qVar;
                                    j13 = j22;
                                    q1Var3.p().u();
                                    String str272 = Build.MODEL;
                                    Y2.j();
                                    q1Var3.p().u();
                                    String str282 = Build.VERSION.RELEASE;
                                    Y2.b();
                                    ((e9) Y2.f2389e).s0(str282);
                                    Y2.l((int) q1Var3.p().w());
                                    Y2.k(q1Var3.p().x());
                                    Y2.R(r4Var.K);
                                    if (q1Var3.c()) {
                                    }
                                    w03 = g0().w0(str16);
                                    if (w03 == null) {
                                    }
                                    if (j12.i(b2.ANALYTICS_STORAGE)) {
                                        String F2 = w03.F();
                                        c7.c0.g(F2);
                                        Y2.u(F2);
                                    }
                                    if (!TextUtils.isEmpty(w03.K())) {
                                    }
                                    p02 = j4Var.g0().p0(str16);
                                    i10 = i3;
                                    while (i10 < p02.size()) {
                                    }
                                    g02 = j4Var.g0();
                                    e9Var = (e9) Y2.d();
                                    g02.s();
                                    g02.t();
                                    c7.c0.d(e9Var.t());
                                    byte[] a132 = e9Var.a();
                                    long b032 = g02.f9150e.j0().b0(a132);
                                    ContentValues contentValues22 = new ContentValues();
                                    String str302 = str2;
                                    contentValues22.put(str302, e9Var.t());
                                    contentValues22.put("metadata_fingerprint", Long.valueOf(b032));
                                    contentValues22.put("metadata", a132);
                                    g02.j0().insertWithOnConflict("raw_events_metadata", null, contentValues22, 4);
                                    g03 = j4Var.g0();
                                    q qVar42 = qVar2;
                                    t tVar42 = qVar42.g;
                                    Objects.requireNonNull(tVar42);
                                    it = tVar42.f9010d.keySet().iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                        }
                                    }
                                    g03.s();
                                    g03.t();
                                    String str322 = qVar42.f8926a;
                                    c7.c0.d(str322);
                                    byte[] a142 = g03.f9150e.j0().S(qVar42).a();
                                    contentValues = new ContentValues();
                                    contentValues.put(str302, str322);
                                    contentValues.put("name", qVar42.f8927b);
                                    contentValues.put("timestamp", Long.valueOf(qVar42.f8929d));
                                    contentValues.put("metadata_fingerprint", Long.valueOf(b032));
                                    contentValues.put("data", a142);
                                    contentValues.put("realtime", Integer.valueOf(i11));
                                    contentValues.put("elapsed_time", Long.valueOf(qVar42.f8930e));
                                    if (g03.j0().insert("raw_events", null, contentValues) == -1) {
                                    }
                                    j4Var.g0().h0();
                                    j4Var.g0().i0();
                                    j4Var.N();
                                    j4Var.b().z().b(Long.valueOf(((System.nanoTime() - nanoTime) + 500000) / 1000000), "Background event processing time, ms");
                                    return;
                                }
                            }
                            g02.j0().insertWithOnConflict("raw_events_metadata", null, contentValues22, 4);
                            g03 = j4Var.g0();
                            q qVar422 = qVar2;
                            t tVar422 = qVar422.g;
                            Objects.requireNonNull(tVar422);
                            it = tVar422.f9010d.keySet().iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                }
                            }
                            g03.s();
                            g03.t();
                            String str3222 = qVar422.f8926a;
                            c7.c0.d(str3222);
                            byte[] a1422 = g03.f9150e.j0().S(qVar422).a();
                            contentValues = new ContentValues();
                            contentValues.put(str302, str3222);
                            contentValues.put("name", qVar422.f8927b);
                            contentValues.put("timestamp", Long.valueOf(qVar422.f8929d));
                            contentValues.put("metadata_fingerprint", Long.valueOf(b032));
                            contentValues.put("data", a1422);
                            contentValues.put("realtime", Integer.valueOf(i11));
                            contentValues.put("elapsed_time", Long.valueOf(qVar422.f8930e));
                            if (g03.j0().insert("raw_events", null, contentValues) == -1) {
                            }
                            j4Var.g0().h0();
                            j4Var.g0().i0();
                            j4Var.N();
                            j4Var.b().z().b(Long.valueOf(((System.nanoTime() - nanoTime) + 500000) / 1000000), "Background event processing time, ms");
                            return;
                        } catch (SQLiteException e9) {
                            ((q1) g02.f1478d).b().w().c(v0.A(e9Var.t()), e9, "Error storing raw event metadata. appId");
                            throw e9;
                        }
                        str7 = str5;
                        str8 = str20;
                        j11 = r4Var.f8981t;
                        if (j11 != 0) {
                        }
                        long j222 = r4Var.E;
                        Y2.N(j222);
                        String str242 = str7;
                        String str252 = str8;
                        if (e0().D(null, e0.U0)) {
                        }
                        if (e0().D(null, e0.V0)) {
                            Y2.M(J);
                        }
                        j12 = c(str16).j(c2.c(100, str23));
                        if (j12.i(b2Var)) {
                        }
                        qVar2 = qVar;
                        j13 = j222;
                        q1Var3.p().u();
                        String str2722 = Build.MODEL;
                        Y2.j();
                        q1Var3.p().u();
                        String str2822 = Build.VERSION.RELEASE;
                        Y2.b();
                        ((e9) Y2.f2389e).s0(str2822);
                        Y2.l((int) q1Var3.p().w());
                        Y2.k(q1Var3.p().x());
                        Y2.R(r4Var.K);
                        if (q1Var3.c()) {
                        }
                        w03 = g0().w0(str16);
                        if (w03 == null) {
                        }
                        if (j12.i(b2.ANALYTICS_STORAGE)) {
                        }
                        if (!TextUtils.isEmpty(w03.K())) {
                        }
                        p02 = j4Var.g0().p0(str16);
                        i10 = i3;
                        while (i10 < p02.size()) {
                        }
                        g02 = j4Var.g0();
                        e9Var = (e9) Y2.d();
                        g02.s();
                        g02.t();
                        c7.c0.d(e9Var.t());
                        byte[] a1322 = e9Var.a();
                        long b0322 = g02.f9150e.j0().b0(a1322);
                        ContentValues contentValues222 = new ContentValues();
                        String str3022 = str2;
                        contentValues222.put(str3022, e9Var.t());
                        contentValues222.put("metadata_fingerprint", Long.valueOf(b0322));
                        contentValues222.put("metadata", a1322);
                    }
                    g0().i0();
                }
                z13 = true;
            }
            String e10 = tVar2.e();
            str2 = "app_id";
            Bundle bundle3 = tVar2.f9010d;
            if (z13) {
                double doubleValue = tVar2.c().doubleValue() * 1000000.0d;
                if (doubleValue == 0.0d) {
                    z10 = z12;
                    doubleValue = bundle3.getLong("value") * 1000000.0d;
                } else {
                    z10 = z12;
                }
                if (doubleValue > 9.223372036854776E18d || doubleValue < -9.223372036854776E18d) {
                    b().x().c(v0.A(str10), Double.valueOf(doubleValue), "Data lost. Currency value is too big. appId");
                    g0().h0();
                    g0().i0();
                } else {
                    j = Math.round(doubleValue);
                    if ("refund".equals(str14)) {
                        j = -j;
                    }
                }
            } else {
                z10 = z12;
                j = bundle3.getLong("value");
            }
            if (!TextUtils.isEmpty(e10)) {
                String upperCase = e10.toUpperCase(Locale.US);
                if (upperCase.matches("[A-Z]{3}")) {
                    String concat = "_ltv_".concat(upperCase);
                    n4 o03 = g0().o0(str10, concat);
                    if (o03 != null) {
                        Object obj3 = o03.f8885e;
                        if (obj3 instanceof Long) {
                            String str33 = b10.f9037i;
                            f().getClass();
                            long currentTimeMillis = System.currentTimeMillis();
                            Long valueOf = Long.valueOf(((Long) obj3).longValue() + j);
                            str4 = str14;
                            str3 = "_fx";
                            str5 = str11;
                            str6 = str;
                            tVar = tVar2;
                            n4Var = new n4(str10, str33, concat, currentTimeMillis, valueOf);
                            if (g0().n0(n4Var)) {
                                b().w().d("Too many unique user properties are set. Ignoring user property. appId", v0.A(str10), q1Var.m().c(n4Var.f8883c), n4Var.f8885e);
                                k0();
                                p4.K(g4Var3, str10, 9, null, null, 0);
                                g4Var = g4Var3;
                            } else {
                                g4Var = g4Var3;
                            }
                            boolean s022 = p4.s0(str4);
                            String str152 = str4;
                            boolean equals2 = str6.equals(str152);
                            k0();
                            if (tVar != null) {
                            }
                            t tVar32 = tVar;
                            j z022 = g0().z0(g(), str10, j3 + 1, true, s022, false, equals2, false, false, false);
                            long j162 = z022.f8748b;
                            e0();
                            intValue = j162 - ((Integer) e0.f8634l.a(null)).intValue();
                            if (intValue <= 0) {
                            }
                            g0().i0();
                        }
                    }
                    str3 = "_fx";
                    long j24 = j;
                    str4 = str14;
                    str5 = str11;
                    str6 = str;
                    tVar = tVar2;
                    m g06 = g0();
                    int B = e0().B(str10, e0.T) - 1;
                    c7.c0.d(str10);
                    g06.s();
                    g06.t();
                    g06.j0().execSQL("delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like '!_ltv!_%' escape '!'order by set_timestamp desc limit ?,10);", new String[]{str10, str10, String.valueOf(B)});
                    String str34 = b10.f9037i;
                    f().getClass();
                    n4Var = new n4(str10, str34, concat, System.currentTimeMillis(), Long.valueOf(j24));
                    if (g0().n0(n4Var)) {
                    }
                    boolean s0222 = p4.s0(str4);
                    String str1522 = str4;
                    boolean equals22 = str6.equals(str1522);
                    k0();
                    if (tVar != null) {
                    }
                    t tVar322 = tVar;
                    j z0222 = g0().z0(g(), str10, j3 + 1, true, s0222, false, equals22, false, false, false);
                    long j1622 = z0222.f8748b;
                    e0();
                    intValue = j1622 - ((Integer) e0.f8634l.a(null)).intValue();
                    if (intValue <= 0) {
                    }
                    g0().i0();
                }
            }
            str3 = "_fx";
            str4 = str14;
            str5 = str11;
            g4Var = g4Var3;
            str6 = str;
            tVar = tVar2;
            boolean s02222 = p4.s0(str4);
            String str15222 = str4;
            boolean equals222 = str6.equals(str15222);
            k0();
            if (tVar != null) {
            }
            t tVar3222 = tVar;
            j z02222 = g0().z0(g(), str10, j3 + 1, true, s02222, false, equals222, false, false, false);
            long j16222 = z02222.f8748b;
            e0();
            intValue = j16222 - ((Integer) e0.f8634l.a(null)).intValue();
            if (intValue <= 0) {
            }
            g0().i0();
        } catch (Throwable th3) {
            th = th3;
            j4Var = this;
        }
    }

    public final void l0() {
        if (this.A.get()) {
            return;
        }
        kotlin.collections.i0.l("UploadController is not initialized");
    }

    public final void m(a1 a1Var, d9 d9Var) {
        l.d dVar;
        n9 n9Var;
        h hVar;
        d().s();
        l0();
        String F0 = ((e9) d9Var.f2389e).F0();
        EnumMap enumMap = new EnumMap(b2.class);
        int length = F0.length();
        int length2 = b2.values().length;
        h hVar2 = h.UNSET;
        int i3 = 0;
        if (length < length2 || F0.charAt(0) != '1') {
            dVar = new l.d(19);
        } else {
            b2[] values = b2.values();
            int length3 = values.length;
            int i10 = 0;
            int i11 = 1;
            while (i10 < length3) {
                b2 b2Var = values[i10];
                int i12 = i11 + 1;
                char charAt = F0.charAt(i11);
                h[] values2 = h.values();
                int length4 = values2.length;
                int i13 = i3;
                while (true) {
                    if (i13 >= length4) {
                        hVar = hVar2;
                        break;
                    }
                    hVar = values2[i13];
                    if (hVar.f8722d == charAt) {
                        break;
                    } else {
                        i13++;
                    }
                }
                enumMap.put((EnumMap) b2Var, (b2) hVar);
                i10++;
                i11 = i12;
                i3 = 0;
            }
            dVar = new l.d(enumMap);
        }
        String E = a1Var.E();
        d().s();
        l0();
        c2 c10 = c(E);
        EnumMap enumMap2 = c10.f8556a;
        b2 b2Var2 = b2.AD_STORAGE;
        z1 z1Var = (z1) enumMap2.get(b2Var2);
        z1 z1Var2 = z1.UNINITIALIZED;
        if (z1Var == null) {
            z1Var = z1Var2;
        }
        int i14 = c10.f8557b;
        int ordinal = z1Var.ordinal();
        h hVar3 = h.REMOTE_ENFORCED_DEFAULT;
        h hVar4 = h.FAILSAFE;
        if (ordinal == 1) {
            dVar.H(b2Var2, hVar3);
        } else if (ordinal == 2 || ordinal == 3) {
            dVar.E(b2Var2, i14);
        } else {
            dVar.H(b2Var2, hVar4);
        }
        b2 b2Var3 = b2.ANALYTICS_STORAGE;
        z1 z1Var3 = (z1) enumMap2.get(b2Var3);
        if (z1Var3 != null) {
            z1Var2 = z1Var3;
        }
        int ordinal2 = z1Var2.ordinal();
        if (ordinal2 == 1) {
            dVar.H(b2Var3, hVar3);
        } else if (ordinal2 == 2 || ordinal2 == 3) {
            dVar.E(b2Var3, i14);
        } else {
            dVar.H(b2Var3, hVar4);
        }
        String E2 = a1Var.E();
        d().s();
        l0();
        o q02 = q0(E2, o0(E2), c(E2), dVar);
        String str = q02.f8890d;
        Boolean bool = q02.f8889c;
        c7.c0.g(bool);
        boolean booleanValue = bool.booleanValue();
        d9Var.b();
        ((e9) d9Var.f2389e).j1(booleanValue);
        if (!TextUtils.isEmpty(str)) {
            d9Var.b();
            ((e9) d9Var.f2389e).k1(str);
        }
        d().s();
        l0();
        Iterator it = Collections.unmodifiableList(((e9) d9Var.f2389e).Z1()).iterator();
        while (true) {
            if (it.hasNext()) {
                n9Var = (n9) it.next();
                if ("_npa".equals(n9Var.v())) {
                    break;
                }
            } else {
                n9Var = null;
                break;
            }
        }
        if (n9Var != null) {
            EnumMap enumMap3 = (EnumMap) dVar.f5643e;
            b2 b2Var4 = b2.AD_PERSONALIZATION;
            h hVar5 = (h) enumMap3.get(b2Var4);
            if (hVar5 == null) {
                hVar5 = hVar2;
            }
            if (hVar5 == hVar2) {
                m mVar = this.f8762i;
                T(mVar);
                n4 o02 = mVar.o0(a1Var.E(), "_npa");
                h hVar6 = h.MANIFEST;
                h hVar7 = h.API;
                if (o02 != null) {
                    String str2 = o02.f8882b;
                    if ("tcf".equals(str2)) {
                        dVar.H(b2Var4, h.TCF);
                    } else if ("app".equals(str2)) {
                        dVar.H(b2Var4, hVar7);
                    } else {
                        dVar.H(b2Var4, hVar6);
                    }
                } else {
                    Boolean x10 = a1Var.x();
                    if (x10 == null || ((x10.booleanValue() && n9Var.z() != 1) || !(x10.booleanValue() || n9Var.z() == 0))) {
                        dVar.H(b2Var4, hVar7);
                    } else {
                        dVar.H(b2Var4, hVar6);
                    }
                }
            }
        } else {
            int F = F(a1Var.E(), dVar);
            m9 E3 = n9.E();
            E3.b();
            ((n9) E3.f2389e).G("_npa");
            f().getClass();
            long currentTimeMillis = System.currentTimeMillis();
            E3.b();
            ((n9) E3.f2389e).F(currentTimeMillis);
            E3.b();
            ((n9) E3.f2389e).J(F);
            n9 n9Var2 = (n9) E3.d();
            d9Var.b();
            ((e9) d9Var.f2389e).h0(n9Var2);
            b().B.c("non_personalized_ads(_npa)", Integer.valueOf(F), "Setting user property");
        }
        String dVar2 = dVar.toString();
        d9Var.b();
        ((e9) d9Var.f2389e).i1(dVar2);
        String E4 = a1Var.E();
        k1 k1Var = this.f8760d;
        k1Var.s();
        k1Var.y(E4);
        v7 O = k1Var.O(E4);
        boolean z10 = O == null || !O.w() || O.x();
        List T = d9Var.T();
        for (int i15 = 0; i15 < T.size(); i15++) {
            if ("_tcf".equals(((w8) T.get(i15)).y())) {
                v8 v8Var = (v8) ((w8) T.get(i15)).k();
                List g = v8Var.g();
                int i16 = 0;
                while (true) {
                    if (i16 >= g.size()) {
                        break;
                    }
                    if ("_tcfd".equals(((z8) g.get(i16)).u())) {
                        String w6 = ((z8) g.get(i16)).w();
                        if (z10 && w6.length() > 4) {
                            char[] charArray = w6.toCharArray();
                            int i17 = 1;
                            while (true) {
                                if (i17 >= 64) {
                                    i17 = 0;
                                    break;
                                } else if (charArray[4] == "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i17)) {
                                    break;
                                } else {
                                    i17++;
                                }
                            }
                            charArray[4] = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i17 | 1);
                            w6 = String.valueOf(charArray);
                        }
                        y8 F2 = z8.F();
                        F2.g("_tcfd");
                        F2.h(w6);
                        v8Var.b();
                        ((w8) v8Var.f2389e).K(i16, (z8) F2.d());
                    } else {
                        i16++;
                    }
                }
                d9Var.V(i15, v8Var);
                return;
            }
        }
    }

    public final void m0(r4 r4Var) {
        d().s();
        l0();
        String str = r4Var.f8976d;
        c7.c0.d(str);
        c2 c10 = c2.c(r4Var.L, r4Var.G);
        c(str);
        b().B.c(str, c10, "Setting storage consent for package");
        d().s();
        l0();
        this.P.put(str, c10);
        m mVar = this.f8762i;
        T(mVar);
        mVar.Y(str, c10);
    }

    public final void n(a1 a1Var, d9 d9Var) {
        Serializable K;
        d().s();
        l0();
        g8 Y2 = j8.Y();
        q1 q1Var = a1Var.f8474a;
        o1 o1Var = q1Var.f8938u;
        q1.l(o1Var);
        o1Var.s();
        byte[] bArr = a1Var.H;
        if (bArr != null) {
            try {
                Y2 = (g8) l4.d0(Y2, bArr);
            } catch (com.google.android.gms.internal.measurement.v1 unused) {
                b().f9053w.b(v0.A(a1Var.E()), "Failed to parse locally stored ad campaign info. appId");
            }
        }
        Iterator it = d9Var.T().iterator();
        while (it.hasNext()) {
            w8 w8Var = (w8) it.next();
            if (w8Var.y().equals("_cmp")) {
                z8 C = l4.C(w8Var, "gclid");
                Serializable K2 = C == null ? null : l4.K(C);
                if (K2 == null) {
                    K2 = "";
                }
                String str = (String) K2;
                z8 C2 = l4.C(w8Var, "gbraid");
                Serializable K3 = C2 == null ? null : l4.K(C2);
                if (K3 == null) {
                    K3 = "";
                }
                String str2 = (String) K3;
                z8 C3 = l4.C(w8Var, "gad_source");
                Serializable K4 = C3 == null ? null : l4.K(C3);
                if (K4 == null) {
                    K4 = "";
                }
                String str3 = (String) K4;
                z8 C4 = l4.C(w8Var, "deep_link_url");
                Object K5 = C4 == null ? null : l4.K(C4);
                String str4 = (String) (K5 != null ? K5 : "");
                String[] split = ((String) e0.f8610b1.a(null)).split(",");
                j0();
                HashMap hashMap = new HashMap();
                for (z8 z8Var : w8Var.v()) {
                    Iterator it2 = it;
                    if (Arrays.asList(split).contains(z8Var.u()) && (K = l4.K(z8Var)) != null) {
                        hashMap.put(z8Var.u(), K);
                    }
                    it = it2;
                }
                Iterator it3 = it;
                if (!hashMap.isEmpty()) {
                    z8 C5 = l4.C(w8Var, "click_timestamp");
                    Object K6 = C5 == null ? null : l4.K(C5);
                    long longValue = ((Long) (K6 != null ? K6 : 0L)).longValue();
                    if (longValue <= 0) {
                        longValue = w8Var.A();
                    }
                    long j = longValue;
                    z8 C6 = l4.C(w8Var, "_cis");
                    if ("referrer API v2".equals(C6 == null ? null : l4.K(C6))) {
                        if (j > ((j8) Y2.f2389e).V()) {
                            if (str.isEmpty()) {
                                Y2.b();
                                ((j8) Y2.f2389e).w();
                            } else {
                                Y2.b();
                                ((j8) Y2.f2389e).v(str);
                            }
                            if (str2.isEmpty()) {
                                Y2.b();
                                ((j8) Y2.f2389e).y();
                            } else {
                                Y2.b();
                                ((j8) Y2.f2389e).x(str2);
                            }
                            if (str3.isEmpty()) {
                                Y2.b();
                                ((j8) Y2.f2389e).A();
                            } else {
                                Y2.b();
                                ((j8) Y2.f2389e).z(str3);
                            }
                            Y2.b();
                            ((j8) Y2.f2389e).B(j);
                            Y2.b();
                            ((j8) Y2.f2389e).D().clear();
                            HashMap G = G(w8Var);
                            Y2.b();
                            ((j8) Y2.f2389e).D().putAll(G);
                        }
                    } else if (j > ((j8) Y2.f2389e).N()) {
                        if (str.isEmpty()) {
                            Y2.b();
                            ((j8) Y2.f2389e).b0();
                        } else {
                            Y2.b();
                            ((j8) Y2.f2389e).a0(str);
                        }
                        if (str2.isEmpty()) {
                            Y2.b();
                            ((j8) Y2.f2389e).d0();
                        } else {
                            Y2.b();
                            ((j8) Y2.f2389e).c0(str2);
                        }
                        if (str3.isEmpty()) {
                            Y2.b();
                            ((j8) Y2.f2389e).t();
                        } else {
                            Y2.b();
                            ((j8) Y2.f2389e).e0(str3);
                        }
                        if (e0().D(null, e0.f8607a1)) {
                            if (str4.isEmpty()) {
                                Y2.b();
                                ((j8) Y2.f2389e).F();
                            } else {
                                Y2.b();
                                ((j8) Y2.f2389e).E(str4);
                            }
                        }
                        Y2.b();
                        ((j8) Y2.f2389e).u(j);
                        Y2.b();
                        ((j8) Y2.f2389e).C().clear();
                        HashMap G2 = G(w8Var);
                        Y2.b();
                        ((j8) Y2.f2389e).C().putAll(G2);
                    }
                }
                it = it3;
            }
        }
        if (!((j8) Y2.d()).equals(j8.Z())) {
            j8 j8Var = (j8) Y2.d();
            d9Var.b();
            ((e9) d9Var.f2389e).o1(j8Var);
        }
        byte[] a9 = ((j8) Y2.d()).a();
        o1 o1Var2 = q1Var.f8938u;
        q1.l(o1Var2);
        o1Var2.s();
        a1Var.R |= a1Var.H != a9;
        a1Var.H = a9;
        if (a1Var.o()) {
            m mVar = this.f8762i;
            T(mVar);
            mVar.x0(a1Var, false);
        }
        if (e0().D(null, e0.f8607a1)) {
            for (int i3 = 0; i3 < d9Var.U(); i3++) {
                w8 Y1 = ((e9) d9Var.f2389e).Y1(i3);
                if ("_cmp".equals(Y1.y())) {
                    v8 v8Var = (v8) Y1.k();
                    List g = v8Var.g();
                    int i10 = 0;
                    while (true) {
                        if (i10 >= g.size()) {
                            break;
                        }
                        if ("deep_link_url".equals(((z8) g.get(i10)).u())) {
                            v8Var.l(i10);
                            d9Var.V(i3, v8Var);
                            break;
                        }
                        i10++;
                    }
                }
            }
        }
        if (e0().D(null, e0.Z0)) {
            m mVar2 = this.f8762i;
            T(mVar2);
            mVar2.m0(a1Var.E(), "_lgclid");
        }
    }

    public final void n0(r4 r4Var) {
        d().s();
        l0();
        String str = r4Var.f8976d;
        c7.c0.d(str);
        o b10 = o.b(r4Var.M);
        b().B.c(str, b10, "Setting DMA consent for package");
        d().s();
        l0();
        z1 a9 = o.c(p0(str), 100).a();
        this.Q.put(str, b10);
        m mVar = this.f8762i;
        T(mVar);
        c7.c0.g(str);
        c7.c0.g(b10);
        mVar.s();
        mVar.t();
        c2 M = mVar.M(str);
        c2 c2Var = c2.f8555c;
        if (M == c2Var) {
            mVar.Y(str, c2Var);
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("dma_consent_settings", b10.f8888b);
        mVar.R(contentValues);
        z1 a10 = o.c(p0(str), 100).a();
        d().s();
        l0();
        z1 z1Var = z1.GRANTED;
        z1 z1Var2 = z1.DENIED;
        boolean z10 = a9 == z1Var2 && a10 == z1Var;
        boolean z11 = a9 == z1Var && a10 == z1Var2;
        if (z10 || z11) {
            b().B.b(str, "Generated _dcu event for");
            Bundle bundle = new Bundle();
            m mVar2 = this.f8762i;
            T(mVar2);
            if (mVar2.y0(g(), str, false, false, false, false).f8752f < e0().B(str, e0.f8635l0)) {
                bundle.putLong("_r", 1L);
                m mVar3 = this.f8762i;
                T(mVar3);
                b().B.c(str, Long.valueOf(mVar3.y0(g(), str, false, false, true, false).f8752f), "_dcu realtime event count");
            }
            this.X.a(str, "_dcu", bundle);
        }
    }

    public final String o(c2 c2Var) {
        if (!c2Var.i(b2.ANALYTICS_STORAGE)) {
            return null;
        }
        byte[] bArr = new byte[16];
        k0().r0().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    public final o o0(String str) {
        d().s();
        l0();
        HashMap hashMap = this.Q;
        o oVar = (o) hashMap.get(str);
        if (oVar != null) {
            return oVar;
        }
        m mVar = this.f8762i;
        T(mVar);
        c7.c0.g(str);
        mVar.s();
        mVar.t();
        o b10 = o.b(mVar.Q("select dma_consent_settings from consent_settings where app_id=? limit 1;", new String[]{str}));
        hashMap.put(str, b10);
        return b10;
    }

    public final void p(ArrayList arrayList) {
        c7.c0.b(!arrayList.isEmpty());
        if (this.M != null) {
            b().f9050t.a("Set uploading progress before finishing the previous upload");
        } else {
            this.M = new ArrayList(arrayList);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Bundle p0(String str) {
        d().s();
        l0();
        k1 k1Var = this.f8760d;
        T(k1Var);
        if (k1Var.O(str) == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        c2 c10 = c(str);
        Bundle bundle2 = new Bundle();
        Iterator it = c10.f8556a.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            int ordinal = ((z1) entry.getValue()).ordinal();
            String str2 = ordinal != 2 ? ordinal != 3 ? null : "granted" : "denied";
            if (str2 != null) {
                bundle2.putString(((b2) entry.getKey()).f8521d, str2);
            }
        }
        bundle.putAll(bundle2);
        o q02 = q0(str, o0(str), c10, new l.d(19));
        Bundle bundle3 = new Bundle();
        for (Map.Entry entry2 : q02.f8891e.entrySet()) {
            int ordinal2 = ((z1) entry2.getValue()).ordinal();
            String str3 = ordinal2 != 2 ? ordinal2 != 3 ? null : "granted" : "denied";
            if (str3 != null) {
                bundle3.putString(((b2) entry2.getKey()).f8521d, str3);
            }
        }
        Boolean bool = q02.f8889c;
        if (bool != null) {
            bundle3.putString("is_dma_region", bool.toString());
        }
        String str4 = q02.f8890d;
        if (str4 != null) {
            bundle3.putString("cps_display_str", str4);
        }
        bundle.putAll(bundle3);
        m mVar = this.f8762i;
        T(mVar);
        n4 o02 = mVar.o0(str, "_npa");
        bundle.putString("ad_personalization", 1 != (o02 != null ? o02.f8885e.equals(1L) : F(str, new l.d(19))) ? "granted" : "denied");
        return bundle;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0127, code lost:
    
        if (r7 == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01a2, code lost:
    
        if (r1 == 0) goto L71;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [s7.j4] */
    /* JADX WARN: Type inference failed for: r1v12, types: [long] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v22, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v25, types: [android.database.Cursor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void q() {
        m mVar;
        long longValue;
        SQLiteException e2;
        d().s();
        l0();
        this.J = true;
        try {
            q1 q1Var = this.f8771z;
            q1Var.getClass();
            Boolean bool = q1Var.o().f8814s;
            if (bool == null) {
                b().f9053w.a("Upload data called on the client side before use of service was decided");
            } else if (bool.booleanValue()) {
                b().f9050t.a("Upload called in the client side when service should be used");
            } else if (this.C > 0) {
                N();
            } else {
                d().s();
                if (this.M != null) {
                    b().B.a("Uploading requested multiple times");
                } else {
                    z0 z0Var = this.f8761e;
                    T(z0Var);
                    if (z0Var.w()) {
                        f().getClass();
                        ?? currentTimeMillis = System.currentTimeMillis();
                        Cursor cursor = null;
                        r7 = null;
                        Cursor cursor2 = null;
                        r7 = null;
                        r7 = null;
                        String str = null;
                        int B = e0().B(null, e0.h0);
                        e0();
                        long longValue2 = currentTimeMillis - ((Long) e0.f8617e.a(null)).longValue();
                        for (int i3 = 0; i3 < B && I(null, longValue2); i3++) {
                        }
                        com.google.android.gms.internal.measurement.i4.a();
                        d().s();
                        H();
                        long a9 = this.f8768w.f8878v.a();
                        if (a9 != 0) {
                            b().A.b(Long.valueOf(Math.abs(currentTimeMillis - a9)), "Uploading events. Elapsed time since last upload attempt (ms)");
                        }
                        m mVar2 = this.f8762i;
                        T(mVar2);
                        String A = mVar2.A();
                        long j = -1;
                        if (TextUtils.isEmpty(A)) {
                            try {
                                this.O = -1L;
                                mVar = this.f8762i;
                                T(mVar);
                                e0();
                                longValue = currentTimeMillis - ((Long) e0.f8617e.a(null)).longValue();
                                mVar.s();
                                mVar.t();
                            } catch (Throwable th) {
                                th = th;
                                cursor = currentTimeMillis;
                            }
                            try {
                                currentTimeMillis = mVar.j0().rawQuery("select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;", new String[]{String.valueOf(longValue)});
                                try {
                                    if (currentTimeMillis.moveToFirst()) {
                                        str = currentTimeMillis.getString(0);
                                    } else {
                                        v0 v0Var = ((q1) mVar.f1478d).f8937t;
                                        q1.l(v0Var);
                                        v0Var.B.a("No expired configs for apps with pending events");
                                    }
                                } catch (SQLiteException e9) {
                                    e2 = e9;
                                    v0 v0Var2 = ((q1) mVar.f1478d).f8937t;
                                    q1.l(v0Var2);
                                    v0Var2.f9050t.b(e2, "Error selecting expired configs");
                                }
                            } catch (SQLiteException e10) {
                                e2 = e10;
                                currentTimeMillis = 0;
                            } catch (Throwable th2) {
                                th = th2;
                                throw th;
                            }
                            currentTimeMillis.close();
                            if (!TextUtils.isEmpty(str)) {
                                m mVar3 = this.f8762i;
                                T(mVar3);
                                a1 w02 = mVar3.w0(str);
                                if (w02 != null) {
                                    A(w02);
                                }
                            }
                        } else {
                            if (this.O == -1) {
                                m mVar4 = this.f8762i;
                                T(mVar4);
                                try {
                                    try {
                                        cursor2 = mVar4.j0().rawQuery("select rowid from raw_events order by rowid desc limit 1;", null);
                                        if (cursor2.moveToFirst()) {
                                            j = cursor2.getLong(0);
                                        }
                                    } finally {
                                        if (cursor2 != null) {
                                            cursor2.close();
                                        }
                                    }
                                } catch (SQLiteException e11) {
                                    v0 v0Var3 = ((q1) mVar4.f1478d).f8937t;
                                    q1.l(v0Var3);
                                    v0Var3.f9050t.b(e11, "Error querying raw events");
                                }
                                cursor2.close();
                                this.O = j;
                            }
                            r(A, currentTimeMillis);
                        }
                    } else {
                        b().B.a("Network not connected, ignoring upload request");
                        N();
                    }
                }
            }
            this.J = false;
            O();
        } catch (Throwable th3) {
            this.J = false;
            O();
            throw th3;
        }
    }

    public final o q0(String str, o oVar, c2 c2Var, l.d dVar) {
        b2 b2Var;
        z1 w6;
        k1 k1Var = this.f8760d;
        T(k1Var);
        v7 O = k1Var.O(str);
        int i3 = 90;
        z1 z1Var = z1.DENIED;
        b2 b2Var2 = b2.AD_USER_DATA;
        if (O == null) {
            if (oVar.a() == z1Var) {
                i3 = oVar.f8887a;
                dVar.E(b2Var2, i3);
            } else {
                dVar.H(b2Var2, h.FAILSAFE);
            }
            return new o(Boolean.FALSE, i3, Boolean.TRUE, "-");
        }
        z1 a9 = oVar.a();
        z1 z1Var2 = z1.GRANTED;
        if (a9 == z1Var2 || a9 == z1Var) {
            i3 = oVar.f8887a;
            dVar.E(b2Var2, i3);
        } else {
            z1 z1Var3 = z1.POLICY;
            z1 z1Var4 = z1.UNINITIALIZED;
            if (a9 != z1Var3 || (w6 = k1Var.w(str, b2Var2)) == z1Var4) {
                k1Var.s();
                k1Var.y(str);
                v7 O2 = k1Var.O(str);
                if (O2 != null) {
                    for (t7 t7Var : O2.u()) {
                        if (b2Var2 == k1.D(t7Var.t())) {
                            b2Var = k1.D(t7Var.u());
                            break;
                        }
                    }
                }
                b2Var = null;
                EnumMap enumMap = c2Var.f8556a;
                b2 b2Var3 = b2.AD_STORAGE;
                z1 z1Var5 = (z1) enumMap.get(b2Var3);
                if (z1Var5 != null) {
                    z1Var4 = z1Var5;
                }
                boolean z10 = z1Var4 == z1Var2 || z1Var4 == z1Var;
                if (b2Var == b2Var3 && z10) {
                    dVar.H(b2Var2, h.REMOTE_DELEGATION);
                    a9 = z1Var4;
                } else {
                    dVar.H(b2Var2, h.REMOTE_DEFAULT);
                    a9 = true != k1Var.N(str, b2Var2) ? z1Var : z1Var2;
                }
            } else {
                dVar.H(b2Var2, h.REMOTE_ENFORCED_DEFAULT);
                a9 = w6;
            }
        }
        k1Var.s();
        k1Var.y(str);
        v7 O3 = k1Var.O(str);
        boolean z11 = O3 == null || !O3.w() || O3.x();
        T(k1Var);
        k1Var.s();
        k1Var.y(str);
        TreeSet treeSet = new TreeSet();
        v7 O4 = k1Var.O(str);
        if (O4 != null) {
            Iterator it = O4.v().iterator();
            while (it.hasNext()) {
                treeSet.add(((u7) it.next()).t());
            }
        }
        if (a9 == z1Var || treeSet.isEmpty()) {
            return new o(Boolean.FALSE, i3, Boolean.valueOf(z11), "-");
        }
        return new o(Boolean.TRUE, i3, Boolean.valueOf(z11), z11 ? TextUtils.join("", treeSet) : "");
    }

    /* JADX WARN: Code restructure failed: missing block: B:386:0x0225, code lost:
    
        if (r11 != null) goto L17;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x061c  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0657  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x07b4  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x07ee A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x07fc A[EDGE_INSN: B:165:0x07fc->B:166:0x07fc BREAK  A[LOOP:4: B:104:0x0653->B:133:0x07ee], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0808  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0817  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0a9d  */
    /* JADX WARN: Removed duplicated region for block: B:188:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:256:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:281:0x04ae  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x04a0  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x058f  */
    /* JADX WARN: Removed duplicated region for block: B:352:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x034e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x02ad A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x05aa  */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v50 */
    /* JADX WARN: Type inference failed for: r22v1 */
    /* JADX WARN: Type inference failed for: r22v30, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r22v31 */
    /* JADX WARN: Type inference failed for: r22v32 */
    /* JADX WARN: Type inference failed for: r22v33 */
    /* JADX WARN: Type inference failed for: r22v34 */
    /* JADX WARN: Type inference failed for: r22v35 */
    /* JADX WARN: Type inference failed for: r22v36 */
    /* JADX WARN: Type inference failed for: r22v37 */
    /* JADX WARN: Type inference failed for: r22v38 */
    /* JADX WARN: Type inference failed for: r22v39 */
    /* JADX WARN: Type inference failed for: r22v46 */
    /* JADX WARN: Type inference failed for: r22v47 */
    /* JADX WARN: Type inference failed for: r33v0, types: [s7.j4] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r(String str, long j) {
        Cursor cursor;
        q1 q1Var;
        long j3;
        Cursor cursor2;
        ?? r22;
        List list;
        Cursor cursor3;
        List<Pair> list2;
        int i3;
        List list3;
        c2 c10;
        b2 b2Var;
        int i10;
        List list4;
        b9 A;
        int size;
        int i11;
        boolean i12;
        boolean D;
        List list5;
        q1 q1Var2;
        String str2;
        String str3;
        BroadcastOptions makeBasic;
        BroadcastOptions shareIdentityEnabled;
        Bundle bundle;
        e4 e4Var;
        z0 z0Var;
        int i13;
        int i14;
        boolean z10;
        List list6;
        boolean z11;
        String str4;
        List list7;
        boolean isEmpty;
        Cursor cursor4;
        q1 q1Var3;
        Cursor cursor5;
        List list8;
        Iterator it;
        Iterator it2;
        int i15;
        int i16;
        ArrayList arrayList;
        m g02;
        ContentValues contentValues;
        Cursor cursor6;
        Cursor cursor7;
        byte[] byteArray;
        long j10;
        long j11;
        String str5 = str;
        int B = e0().B(str5, e0.f8625h);
        int i17 = 0;
        int max = Math.max(0, e0().B(str5, e0.f8627i));
        m g03 = g0();
        q1 q1Var4 = (q1) g03.f1478d;
        g03.s();
        g03.t();
        int i18 = 1;
        c7.c0.b(B > 0);
        ?? r11 = max > 0 ? 1 : 0;
        c7.c0.b(r11);
        c7.c0.d(str5);
        try {
            try {
                try {
                    j3 = -1;
                } catch (Throwable th) {
                    th = th;
                    cursor = null;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } catch (SQLiteException e2) {
                e = e2;
                q1Var = q1Var4;
                j3 = -1;
            }
            try {
                r22 = "rowid";
                cursor2 = g03.j0().query("queue", new String[]{"rowid", "data", "retry_count"}, "app_id=?", new String[]{str5}, null, null, "rowid", String.valueOf(B));
                try {
                } catch (SQLiteException e9) {
                    e = e9;
                    q1Var = q1Var4;
                }
            } catch (SQLiteException e10) {
                e = e10;
                q1Var = q1Var4;
                cursor2 = null;
                q1Var.b().w().c(v0.A(str5), e, "Error querying bundles. appId");
                list = Collections.EMPTY_LIST;
                cursor7 = r22;
                cursor6 = r22;
            }
            if (cursor2.moveToFirst()) {
                ArrayList arrayList2 = new ArrayList();
                int i19 = 0;
                while (true) {
                    long j12 = cursor2.getLong(i17);
                    try {
                        byte[] blob = cursor2.getBlob(i18);
                        l4 j02 = g03.f9150e.j0();
                        try {
                            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(blob);
                            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            byte[] bArr = new byte[1024];
                            r22 = g03;
                            while (true) {
                                try {
                                    int read = gZIPInputStream.read(bArr);
                                    if (read <= 0) {
                                        break;
                                    }
                                    q1Var = q1Var4;
                                    try {
                                        try {
                                            byteArrayOutputStream.write(bArr, 0, read);
                                            q1Var4 = q1Var;
                                        } catch (IOException e11) {
                                            e = e11;
                                            try {
                                                ((q1) j02.f1478d).b().w().b(e, "Failed to ungzip content");
                                                throw e;
                                            } catch (IOException e12) {
                                                e = e12;
                                                q1Var.b().w().c(v0.A(str5), e, "Failed to unzip queued bundle. appId");
                                                r22 = r22;
                                                if (cursor2.moveToNext()) {
                                                    break;
                                                }
                                                g03 = r22;
                                                q1Var4 = q1Var;
                                                i17 = 0;
                                                i18 = 1;
                                                cursor2.close();
                                                list2 = arrayList2;
                                                cursor3 = r22;
                                                if (list2.isEmpty()) {
                                                }
                                            }
                                        }
                                    } catch (SQLiteException e13) {
                                        e = e13;
                                        q1Var.b().w().c(v0.A(str5), e, "Error querying bundles. appId");
                                        list = Collections.EMPTY_LIST;
                                        cursor7 = r22;
                                        cursor6 = r22;
                                    }
                                } catch (IOException e14) {
                                    e = e14;
                                    q1Var = q1Var4;
                                    ((q1) j02.f1478d).b().w().b(e, "Failed to ungzip content");
                                    throw e;
                                }
                            }
                            gZIPInputStream.close();
                            byteArrayInputStream.close();
                            byteArray = byteArrayOutputStream.toByteArray();
                        } catch (IOException e15) {
                            e = e15;
                            r22 = g03;
                        }
                    } catch (IOException e16) {
                        e = e16;
                        r22 = g03;
                        q1Var = q1Var4;
                    }
                    if (!arrayList2.isEmpty() && byteArray.length + i19 > max) {
                        break;
                    }
                    try {
                        d9 d9Var = (d9) l4.d0(e9.Y(), byteArray);
                        if (!arrayList2.isEmpty()) {
                            e9 e9Var = (e9) ((Pair) arrayList2.get(0)).first;
                            e9 e9Var2 = (e9) d9Var.d();
                            if (!e9Var.y0().equals(e9Var2.y0()) || !e9Var.F0().equals(e9Var2.F0()) || e9Var.H0() != e9Var2.H0() || !e9Var.J0().equals(e9Var2.J0())) {
                                break;
                            }
                            Iterator it3 = e9Var.Z1().iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    j10 = -1;
                                    break;
                                }
                                n9 n9Var = (n9) it3.next();
                                Iterator it4 = it3;
                                if ("_npa".equals(n9Var.v())) {
                                    j10 = n9Var.z();
                                    break;
                                }
                                it3 = it4;
                            }
                            Iterator it5 = e9Var2.Z1().iterator();
                            while (true) {
                                if (!it5.hasNext()) {
                                    j11 = -1;
                                    break;
                                }
                                n9 n9Var2 = (n9) it5.next();
                                if ("_npa".equals(n9Var2.v())) {
                                    j11 = n9Var2.z();
                                    break;
                                }
                            }
                            if (j10 != j11) {
                                break;
                            }
                        }
                        if (!cursor2.isNull(2)) {
                            int i20 = cursor2.getInt(2);
                            d9Var.b();
                            ((e9) d9Var.f2389e).X0(i20);
                        }
                        i19 += byteArray.length;
                        arrayList2.add(Pair.create((e9) d9Var.d(), Long.valueOf(j12)));
                    } catch (IOException e17) {
                        q1Var4.b().w().c(v0.A(str5), e17, "Failed to merge queued bundle. appId");
                    }
                    q1Var = q1Var4;
                    r22 = r22;
                    if (cursor2.moveToNext() || i19 > max) {
                        break;
                        break;
                    }
                    g03 = r22;
                    q1Var4 = q1Var;
                    i17 = 0;
                    i18 = 1;
                }
                cursor2.close();
                list2 = arrayList2;
                cursor3 = r22;
                if (list2.isEmpty()) {
                }
            } else {
                list = Collections.EMPTY_LIST;
                cursor7 = "rowid";
                cursor2.close();
                cursor6 = cursor7;
                list2 = list;
                cursor3 = cursor6;
                if (list2.isEmpty()) {
                    return;
                }
                com.google.android.gms.internal.measurement.r3 r3Var = com.google.android.gms.internal.measurement.r3.f2728e;
                g e02 = e0();
                d0 d0Var = e0.f8613c1;
                boolean D2 = e02.D(null, d0Var);
                b2 b2Var2 = b2.ANALYTICS_STORAGE;
                if (D2) {
                    if (!e0().D(null, d0Var)) {
                        i3 = 34;
                        list7 = list2;
                    } else if (c(str).i(b2Var2) || !f0().x(str5)) {
                        i3 = 34;
                        ArrayList arrayList3 = new ArrayList(list2.size());
                        m g04 = g0();
                        q1 q1Var5 = (q1) g04.f1478d;
                        c7.c0.d(str5);
                        g04.s();
                        g04.t();
                        ArrayList arrayList4 = new ArrayList();
                        try {
                            try {
                                try {
                                    SQLiteDatabase j03 = g04.j0();
                                    q1Var5.f().getClass();
                                    long currentTimeMillis = System.currentTimeMillis();
                                    Cursor query = j03.query("no_data_mode_events", new String[]{"data"}, "app_id=? AND timestamp_millis <= CAST(? AS INTEGER)", new String[]{str5, String.valueOf(currentTimeMillis)}, null, null, "rowid", null);
                                    try {
                                        try {
                                            if (query.moveToFirst()) {
                                                q1Var3 = q1Var5;
                                                while (true) {
                                                    try {
                                                        try {
                                                            arrayList4.add((w8) ((v8) l4.d0(w8.J(), query.getBlob(0))).d());
                                                            cursor5 = query;
                                                            arrayList = arrayList4;
                                                        } catch (com.google.android.gms.internal.measurement.v1 e18) {
                                                            cursor5 = query;
                                                            try {
                                                                arrayList = arrayList4;
                                                                q1Var3.b().f9055y.c(v0.A(str5), e18, "Failed to parse stored NO_DATA mode event, appId");
                                                            } catch (SQLiteException e19) {
                                                                e = e19;
                                                                q1Var3.b().w().c(v0.A(str5), e, "Error flushing NO_DATA mode events. appId");
                                                                list8 = Collections.EMPTY_LIST;
                                                                if (cursor5 != null) {
                                                                }
                                                                it = list2.iterator();
                                                                boolean z12 = true;
                                                                while (it.hasNext()) {
                                                                }
                                                                list7 = arrayList3;
                                                                isEmpty = list7.isEmpty();
                                                                list3 = list7;
                                                                if (isEmpty) {
                                                                }
                                                                c10 = c(str);
                                                                b2Var = b2.AD_STORAGE;
                                                                if (c10.i(b2Var)) {
                                                                }
                                                                i10 = 0;
                                                                list4 = list3;
                                                                A = c9.A();
                                                                size = list4.size();
                                                                ArrayList arrayList5 = new ArrayList(list4.size());
                                                                if (e0().t(str5)) {
                                                                }
                                                                boolean i21 = c(str).i(b2Var);
                                                                i12 = c(str).i(b2Var2);
                                                                D = e0().D(str5, e0.M0);
                                                                f4 f4Var = this.f8769x;
                                                                e4 t6 = f4Var.t(str5);
                                                                list5 = list4;
                                                                while (true) {
                                                                    q1Var2 = this.f8771z;
                                                                    if (i10 < size) {
                                                                    }
                                                                    i10 = i14 + 1;
                                                                    i11 = i13;
                                                                    size = r24;
                                                                    list5 = list6;
                                                                    i12 = z10;
                                                                    D = z11;
                                                                }
                                                                if (((c9) A.f2389e).u() != 0) {
                                                                }
                                                            }
                                                        }
                                                        if (!cursor5.moveToNext()) {
                                                            break;
                                                        }
                                                        query = cursor5;
                                                        arrayList4 = arrayList;
                                                    } catch (SQLiteException e20) {
                                                        e = e20;
                                                        cursor5 = query;
                                                        q1Var3.b().w().c(v0.A(str5), e, "Error flushing NO_DATA mode events. appId");
                                                        list8 = Collections.EMPTY_LIST;
                                                        if (cursor5 != null) {
                                                        }
                                                        it = list2.iterator();
                                                        boolean z122 = true;
                                                        while (it.hasNext()) {
                                                        }
                                                        list7 = arrayList3;
                                                        isEmpty = list7.isEmpty();
                                                        list3 = list7;
                                                        if (isEmpty) {
                                                        }
                                                        c10 = c(str);
                                                        b2Var = b2.AD_STORAGE;
                                                        if (c10.i(b2Var)) {
                                                        }
                                                        i10 = 0;
                                                        list4 = list3;
                                                        A = c9.A();
                                                        size = list4.size();
                                                        ArrayList arrayList52 = new ArrayList(list4.size());
                                                        if (e0().t(str5)) {
                                                        }
                                                        boolean i212 = c(str).i(b2Var);
                                                        i12 = c(str).i(b2Var2);
                                                        D = e0().D(str5, e0.M0);
                                                        f4 f4Var2 = this.f8769x;
                                                        e4 t62 = f4Var2.t(str5);
                                                        list5 = list4;
                                                        while (true) {
                                                            q1Var2 = this.f8771z;
                                                            if (i10 < size) {
                                                            }
                                                            i10 = i14 + 1;
                                                            i11 = i13;
                                                            size = r24;
                                                            list5 = list6;
                                                            i12 = z10;
                                                            D = z11;
                                                        }
                                                        if (((c9) A.f2389e).u() != 0) {
                                                        }
                                                    }
                                                }
                                                cursor5.close();
                                                try {
                                                    int delete = j03.delete("no_data_mode_events", "app_id=? AND timestamp_millis <= CAST(? AS INTEGER)", new String[]{str5, String.valueOf(currentTimeMillis)});
                                                    t0 z13 = q1Var3.b().z();
                                                    StringBuilder sb2 = new StringBuilder(String.valueOf(delete).length() + 34);
                                                    sb2.append("Pruned ");
                                                    sb2.append(delete);
                                                    sb2.append(" NO_DATA mode events. appId");
                                                    z13.b(str5, sb2.toString());
                                                } catch (SQLiteException e21) {
                                                    e = e21;
                                                    cursor5 = null;
                                                    q1Var3.b().w().c(v0.A(str5), e, "Error flushing NO_DATA mode events. appId");
                                                    list8 = Collections.EMPTY_LIST;
                                                    if (cursor5 != null) {
                                                        cursor5.close();
                                                    }
                                                    it = list2.iterator();
                                                    boolean z1222 = true;
                                                    while (it.hasNext()) {
                                                    }
                                                    list7 = arrayList3;
                                                    isEmpty = list7.isEmpty();
                                                    list3 = list7;
                                                    if (isEmpty) {
                                                    }
                                                    c10 = c(str);
                                                    b2Var = b2.AD_STORAGE;
                                                    if (c10.i(b2Var)) {
                                                    }
                                                    i10 = 0;
                                                    list4 = list3;
                                                    A = c9.A();
                                                    size = list4.size();
                                                    ArrayList arrayList522 = new ArrayList(list4.size());
                                                    if (e0().t(str5)) {
                                                    }
                                                    boolean i2122 = c(str).i(b2Var);
                                                    i12 = c(str).i(b2Var2);
                                                    D = e0().D(str5, e0.M0);
                                                    f4 f4Var22 = this.f8769x;
                                                    e4 t622 = f4Var22.t(str5);
                                                    list5 = list4;
                                                    while (true) {
                                                        q1Var2 = this.f8771z;
                                                        if (i10 < size) {
                                                        }
                                                        i10 = i14 + 1;
                                                        i11 = i13;
                                                        size = r24;
                                                        list5 = list6;
                                                        i12 = z10;
                                                        D = z11;
                                                    }
                                                    if (((c9) A.f2389e).u() != 0) {
                                                    }
                                                }
                                            } else {
                                                arrayList = arrayList4;
                                                query.close();
                                            }
                                            list8 = arrayList;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            cursor3 = query;
                                            cursor4 = cursor3;
                                            if (cursor4 != null) {
                                            }
                                            throw th;
                                        }
                                    } catch (SQLiteException e22) {
                                        e = e22;
                                        cursor5 = query;
                                        q1Var3 = q1Var5;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    cursor4 = null;
                                    if (cursor4 != null) {
                                        cursor4.close();
                                    }
                                    throw th;
                                }
                            } catch (SQLiteException e23) {
                                e = e23;
                                q1Var3 = q1Var5;
                            }
                            it = list2.iterator();
                            boolean z12222 = true;
                            while (it.hasNext()) {
                                Pair pair = (Pair) it.next();
                                d9 d9Var2 = (d9) ((e9) pair.first).k();
                                if (z12222 && !list8.isEmpty()) {
                                    List T = d9Var2.T();
                                    d9Var2.b();
                                    ((e9) d9Var2.f2389e).e0();
                                    d9Var2.b();
                                    ((e9) d9Var2.f2389e).d0(list8);
                                    d9Var2.b();
                                    ((e9) d9Var2.f2389e).d0(T);
                                    z12222 = false;
                                }
                                p8 u2 = s8.u();
                                v7 O = f0().O(str5);
                                ArrayList arrayList6 = new ArrayList();
                                if (O != null) {
                                    Iterator it6 = O.t().iterator();
                                    while (it6.hasNext()) {
                                        s7 s7Var = (s7) it6.next();
                                        Iterator it7 = it;
                                        q8 t10 = r8.t();
                                        boolean z14 = z12222;
                                        int t11 = s7Var.t() - 1;
                                        List list9 = list8;
                                        if (t11 == 1) {
                                            it2 = it6;
                                            i15 = 3;
                                            i16 = 2;
                                        } else if (t11 != 2) {
                                            it2 = it6;
                                            i15 = 3;
                                            i16 = t11 != 3 ? t11 != 4 ? 1 : 5 : 4;
                                        } else {
                                            it2 = it6;
                                            i15 = 3;
                                            i16 = 3;
                                        }
                                        t10.g(i16);
                                        int v10 = s7Var.v() - 1;
                                        if (v10 == 1) {
                                            i15 = 2;
                                        } else if (v10 != 2) {
                                            i15 = 1;
                                        }
                                        t10.h(i15);
                                        arrayList6.add((r8) t10.d());
                                        it = it7;
                                        list8 = list9;
                                        z12222 = z14;
                                        it6 = it2;
                                    }
                                }
                                Iterator it8 = it;
                                boolean z15 = z12222;
                                List list10 = list8;
                                u2.g(arrayList6);
                                d9Var2.C(u2);
                                arrayList3.add(Pair.create((e9) d9Var2.d(), (Long) pair.second));
                                it = it8;
                                list8 = list10;
                                z12222 = z15;
                            }
                            list7 = arrayList3;
                        } catch (Throwable th4) {
                            th = th4;
                        }
                    } else {
                        List asList = Arrays.asList(((String) e0.f8616d1.a(null)).split(","));
                        for (Pair pair2 : list2) {
                            try {
                                g0().B(((Long) pair2.second).longValue());
                                for (w8 w8Var : ((e9) pair2.first).T1()) {
                                    if (asList.contains(w8Var.y())) {
                                        try {
                                            try {
                                                if (!w8Var.y().equals("_f")) {
                                                    if (w8Var.y().equals("_v")) {
                                                    }
                                                    g02 = g0();
                                                    g02.s();
                                                    g02.t();
                                                    c7.c0.d(str5);
                                                    q1 q1Var6 = (q1) g02.f1478d;
                                                    q1Var6.b().z().b(w8Var, "Caching events in NO_DATA mode");
                                                    contentValues = new ContentValues();
                                                    contentValues.put("app_id", str5);
                                                    w8 w8Var2 = w8Var;
                                                    contentValues.put("name", w8Var2.y());
                                                    contentValues.put("data", w8Var2.a());
                                                    contentValues.put("timestamp_millis", Long.valueOf(w8Var2.A()));
                                                    if (g02.j0().insert("no_data_mode_events", null, contentValues) != j3) {
                                                        q1Var6.b().w().b(v0.A(str5), "Failed to insert NO_DATA mode event (got -1). appId");
                                                    }
                                                }
                                                if (g02.j0().insert("no_data_mode_events", null, contentValues) != j3) {
                                                }
                                            } catch (SQLiteException e24) {
                                                ((q1) g02.f1478d).b().w().c(v0.A(str5), e24, "Error storing NO_DATA mode event. appId");
                                            }
                                            q1Var6.b().z().b(w8Var, "Caching events in NO_DATA mode");
                                            contentValues = new ContentValues();
                                            contentValues.put("app_id", str5);
                                            w8 w8Var22 = w8Var;
                                            contentValues.put("name", w8Var22.y());
                                            contentValues.put("data", w8Var22.a());
                                            contentValues.put("timestamp_millis", Long.valueOf(w8Var22.A()));
                                        } catch (SQLiteException unused) {
                                            b().f9055y.b(str5, "Failed handling NO_DATA mode bundles. appId");
                                        }
                                        v8 v8Var = (v8) w8Var.k();
                                        j0();
                                        l4.A(v8Var, "_dac", 1L);
                                        w8Var = (w8) v8Var.d();
                                        g02 = g0();
                                        g02.s();
                                        g02.t();
                                        c7.c0.d(str5);
                                        q1 q1Var62 = (q1) g02.f1478d;
                                    }
                                }
                            } catch (SQLiteException unused2) {
                            }
                        }
                        i3 = 34;
                        list7 = Collections.EMPTY_LIST;
                    }
                    isEmpty = list7.isEmpty();
                    list3 = list7;
                    if (isEmpty) {
                        return;
                    }
                } else {
                    i3 = 34;
                    list3 = list2;
                }
                c10 = c(str);
                b2Var = b2.AD_STORAGE;
                if (c10.i(b2Var)) {
                    Iterator it9 = list3.iterator();
                    while (true) {
                        if (!it9.hasNext()) {
                            str4 = null;
                            break;
                        }
                        e9 e9Var3 = (e9) ((Pair) it9.next()).first;
                        if (!e9Var3.z().isEmpty()) {
                            str4 = e9Var3.z();
                            break;
                        }
                    }
                    if (str4 != null) {
                        for (int i22 = 0; i22 < list3.size(); i22++) {
                            e9 e9Var4 = (e9) ((Pair) list3.get(i22)).first;
                            if (!e9Var4.z().isEmpty() && !e9Var4.z().equals(str4)) {
                                i10 = 0;
                                list4 = list3.subList(0, i22);
                                break;
                            }
                        }
                    }
                }
                i10 = 0;
                list4 = list3;
                A = c9.A();
                size = list4.size();
                ArrayList arrayList5222 = new ArrayList(list4.size());
                i11 = (e0().t(str5) || !c(str).i(b2Var)) ? i10 : 1;
                boolean i21222 = c(str).i(b2Var);
                i12 = c(str).i(b2Var2);
                D = e0().D(str5, e0.M0);
                f4 f4Var222 = this.f8769x;
                e4 t6222 = f4Var222.t(str5);
                list5 = list4;
                while (true) {
                    q1Var2 = this.f8771z;
                    if (i10 < size) {
                        break;
                    }
                    d9 d9Var3 = (d9) ((e9) ((Pair) list5.get(i10)).first).k();
                    int i23 = size;
                    arrayList5222.add((Long) ((Pair) list5.get(i10)).second);
                    e0().y();
                    d9Var3.r();
                    d9Var3.b();
                    ((e9) d9Var3.f2389e).j0(j);
                    q1Var2.getClass();
                    d9Var3.H();
                    if (i11 == 0) {
                        d9Var3.b();
                        ((e9) d9Var3.f2389e).W0();
                    }
                    if (!i21222) {
                        d9Var3.b();
                        ((e9) d9Var3.f2389e).D1();
                        d9Var3.b();
                        ((e9) d9Var3.f2389e).F1();
                    }
                    if (!i12) {
                        d9Var3.b();
                        ((e9) d9Var3.f2389e).H1();
                    }
                    v(d9Var3, str5);
                    if (!D) {
                        d9Var3.b();
                        ((e9) d9Var3.f2389e).d1();
                    }
                    if (!i12) {
                        d9Var3.b();
                        ((e9) d9Var3.f2389e).P1();
                    }
                    String z16 = ((e9) d9Var3.f2389e).z();
                    if (TextUtils.isEmpty(z16)) {
                        i13 = i11;
                    } else {
                        i13 = i11;
                        if (!z16.equals("00000000-0000-0000-0000-000000000000")) {
                            i14 = i10;
                            z10 = i12;
                            list6 = list5;
                            z11 = D;
                            if (d9Var3.U() != 0) {
                                if (e0().D(str5, e0.C0)) {
                                    d9Var3.O(j0().b0(((e9) d9Var3.d()).a()));
                                }
                                l9 b10 = t6222.b();
                                if (b10 != null) {
                                    d9Var3.A(b10);
                                }
                                A.b();
                                ((c9) A.f2389e).D((e9) d9Var3.d());
                            }
                            i10 = i14 + 1;
                            i11 = i13;
                            size = i23;
                            list5 = list6;
                            i12 = z10;
                            D = z11;
                        }
                    }
                    ArrayList arrayList7 = new ArrayList(d9Var3.T());
                    Iterator it10 = arrayList7.iterator();
                    i14 = i10;
                    Long l10 = null;
                    Long l11 = null;
                    boolean z17 = false;
                    boolean z18 = false;
                    while (it10.hasNext()) {
                        boolean z19 = i12;
                        w8 w8Var3 = (w8) it10.next();
                        List list11 = list5;
                        boolean z20 = D;
                        if ("_fx".equals(w8Var3.y())) {
                            it10.remove();
                            list5 = list11;
                            i12 = z19;
                            D = z20;
                            z17 = true;
                        } else if ("_f".equals(w8Var3.y())) {
                            j0();
                            z8 C = l4.C(w8Var3, "_pfo");
                            if (C != null) {
                                l10 = Long.valueOf(C.y());
                            }
                            j0();
                            z8 C2 = l4.C(w8Var3, "_uwa");
                            if (C2 != null) {
                                l11 = Long.valueOf(C2.y());
                            }
                            list5 = list11;
                            i12 = z19;
                            D = z20;
                        } else {
                            list5 = list11;
                            i12 = z19;
                            D = z20;
                        }
                        z18 = true;
                    }
                    z10 = i12;
                    list6 = list5;
                    z11 = D;
                    if (z17) {
                        d9Var3.b();
                        ((e9) d9Var3.f2389e).e0();
                        d9Var3.b();
                        ((e9) d9Var3.f2389e).d0(arrayList7);
                    }
                    if (z18) {
                        u(d9Var3.n(), true, l10, l11);
                    }
                    if (d9Var3.U() != 0) {
                    }
                    i10 = i14 + 1;
                    i11 = i13;
                    size = i23;
                    list5 = list6;
                    i12 = z10;
                    D = z11;
                }
                if (((c9) A.f2389e).u() != 0) {
                    p(arrayList5222);
                    z(false, 204, null, null, str5, Collections.EMPTY_LIST, null);
                    return;
                }
                c9 c9Var = (c9) A.d();
                ArrayList arrayList8 = new ArrayList();
                x2 x2Var = t6222.f8680c;
                boolean z21 = x2Var == x2.SGTM_CLIENT;
                if (x2Var != x2.SGTM) {
                    if (!z21) {
                        str3 = null;
                        z0Var = this.f8761e;
                        T(z0Var);
                        if (z0Var.w()) {
                            return;
                        }
                        String T2 = Log.isLoggable(b().C(), 2) ? j0().T(c9Var) : str3;
                        j0();
                        byte[] a9 = c9Var.a();
                        p(arrayList5222);
                        this.f8768w.f8879w.b(j);
                        b().z().d("Uploading data. app, uncompressed size, data", str5, Integer.valueOf(a9.length), T2);
                        this.I = true;
                        T(z0Var);
                        z0Var.z(str5, t6222, c9Var, new p.e((j4) this, str5, (Object) arrayList8, 8));
                        return;
                    }
                    z21 = true;
                }
                Iterator it11 = ((c9) A.d()).t().iterator();
                while (true) {
                    if (it11.hasNext()) {
                        if (((e9) it11.next()).R()) {
                            str2 = UUID.randomUUID().toString();
                            break;
                        }
                    } else {
                        str2 = null;
                        break;
                    }
                }
                c9 c9Var2 = (c9) A.d();
                d().s();
                l0();
                b9 B2 = c9.B(c9Var2);
                if (!TextUtils.isEmpty(str2)) {
                    B2.b();
                    ((c9) B2.f2389e).G(str2);
                }
                String F = f0().F(str5);
                if (!TextUtils.isEmpty(F)) {
                    B2.h(F);
                }
                ArrayList arrayList9 = new ArrayList();
                Iterator it12 = c9Var2.t().iterator();
                while (it12.hasNext()) {
                    d9 Z = e9.Z((e9) it12.next());
                    Z.b();
                    ((e9) Z.f2389e).W0();
                    arrayList9.add((e9) Z.d());
                }
                B2.b();
                ((c9) B2.f2389e).F();
                B2.b();
                ((c9) B2.f2389e).E(arrayList9);
                b().z().b(TextUtils.isEmpty(str2) ? "null" : B2.g(), "[sgtm] Processed MeasurementBatch for sGTM with sgtmJoinId: ");
                c9 c9Var3 = (c9) B2.d();
                if (TextUtils.isEmpty(str2)) {
                    str3 = null;
                } else {
                    c9 c9Var4 = (c9) A.d();
                    d().s();
                    l0();
                    b9 A2 = c9.A();
                    b().z().b(str2, "[sgtm] Processing Google Signal, sgtmJoinId:");
                    A2.b();
                    ((c9) A2.f2389e).G(str2);
                    for (e9 e9Var5 : c9Var4.t()) {
                        d9 Y2 = e9.Y();
                        String S = e9Var5.S();
                        Y2.b();
                        ((e9) Y2.f2389e).V0(S);
                        int O0 = e9Var5.O0();
                        Y2.b();
                        ((e9) Y2.f2389e).n1(O0);
                        A2.b();
                        ((c9) A2.f2389e).D((e9) Y2.d());
                    }
                    c9 c9Var5 = (c9) A2.d();
                    String F2 = f4Var222.f9150e.f0().F(str5);
                    boolean isEmpty2 = TextUtils.isEmpty(F2);
                    x2 x2Var2 = x2.GOOGLE_SIGNAL;
                    x2 x2Var3 = x2.GOOGLE_SIGNAL_PENDING;
                    if (isEmpty2) {
                        str3 = null;
                        String str6 = (String) e0.f8648s.a(null);
                        if (z21) {
                            x2Var2 = x2Var3;
                        }
                        e4Var = new e4(str6, Collections.EMPTY_MAP, x2Var2, null);
                    } else {
                        Uri parse = Uri.parse((String) e0.f8648s.a(null));
                        Uri.Builder buildUpon = parse.buildUpon();
                        String authority = parse.getAuthority();
                        StringBuilder sb3 = new StringBuilder(String.valueOf(F2).length() + 1 + String.valueOf(authority).length());
                        sb3.append(F2);
                        sb3.append(".");
                        sb3.append(authority);
                        buildUpon.authority(sb3.toString());
                        String uri = buildUpon.build().toString();
                        if (z21) {
                            x2Var2 = x2Var3;
                        }
                        str3 = null;
                        e4Var = new e4(uri, Collections.EMPTY_MAP, x2Var2, null);
                    }
                    arrayList8.add(Pair.create(c9Var5, e4Var));
                }
                if (z21) {
                    b9 b9Var = (b9) c9Var3.k();
                    for (int i24 = 0; i24 < c9Var3.u(); i24++) {
                        d9 d9Var4 = (d9) c9Var3.v(i24).k();
                        d9Var4.Z();
                        d9Var4.B(j);
                        b9Var.b();
                        ((c9) b9Var.f2389e).C(i24, (e9) d9Var4.d());
                    }
                    arrayList8.add(Pair.create((c9) b9Var.d(), t6222));
                    p(arrayList5222);
                    z(false, 204, null, null, str, arrayList8, null);
                    if (s(str, t6222.a())) {
                        b().z().b(str, "[sgtm] Sending sgtm batches available notification to app");
                        Intent intent = new Intent();
                        intent.setAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                        intent.setPackage(str);
                        Context e25 = q1Var2.e();
                        if (Build.VERSION.SDK_INT < i3) {
                            e25.sendBroadcast(intent);
                            return;
                        }
                        makeBasic = BroadcastOptions.makeBasic();
                        shareIdentityEnabled = makeBasic.setShareIdentityEnabled(true);
                        bundle = shareIdentityEnabled.toBundle();
                        e25.sendBroadcast(intent, null, bundle);
                        return;
                    }
                    return;
                }
                str5 = str;
                c9Var = c9Var3;
                z0Var = this.f8761e;
                T(z0Var);
                if (z0Var.w()) {
                }
            }
        } catch (Throwable th5) {
            th = th5;
            cursor = r11;
        }
    }

    public final boolean s(String str, String str2) {
        m mVar = this.f8762i;
        T(mVar);
        a1 w02 = mVar.w0(str);
        HashMap hashMap = this.S;
        if (w02 != null && k0().X(str, w02.D())) {
            hashMap.remove(str2);
            return true;
        }
        i4 i4Var = (i4) hashMap.get(str2);
        if (i4Var != null) {
            i4Var.f8744a.f().getClass();
            if (System.currentTimeMillis() < i4Var.f8746c) {
                return false;
            }
        }
        return true;
    }

    public final void t(String str) {
        d().s();
        l0();
        this.J = true;
        try {
            q1 q1Var = this.f8771z;
            q1Var.getClass();
            Boolean bool = q1Var.o().f8814s;
            if (bool == null) {
                b().f9053w.a("Upload data called on the client side before use of service was decided");
            } else if (bool.booleanValue()) {
                b().f9050t.a("Upload called in the client side when service should be used");
            } else if (this.C > 0) {
                N();
            } else {
                z0 z0Var = this.f8761e;
                T(z0Var);
                if (z0Var.w()) {
                    m mVar = this.f8762i;
                    T(mVar);
                    if (mVar.y(str)) {
                        m mVar2 = this.f8762i;
                        T(mVar2);
                        c7.c0.d(str);
                        mVar2.s();
                        mVar2.t();
                        List x10 = mVar2.x(str, b4.b(x2.GOOGLE_SIGNAL), 1);
                        k4 k4Var = x10.isEmpty() ? null : (k4) x10.get(0);
                        if (k4Var != null) {
                            c9 c9Var = k4Var.f8798b;
                            b().B.d("[sgtm] Uploading data from upload queue. appId, type, url", str, k4Var.f8801e, k4Var.f8799c);
                            byte[] a9 = c9Var.a();
                            if (Log.isLoggable(b().C(), 2)) {
                                l4 l4Var = this.f8766u;
                                T(l4Var);
                                b().B.d("[sgtm] Uploading data from upload queue. appId, uncompressed size, data", str, Integer.valueOf(a9.length), l4Var.T(c9Var));
                            }
                            e4 e4Var = new e4(k4Var.f8799c, k4Var.f8800d, k4Var.f8801e, null);
                            this.I = true;
                            z0 z0Var2 = this.f8761e;
                            T(z0Var2);
                            z0Var2.z(str, e4Var, c9Var, new p.e(this, str, (Object) k4Var, 9));
                        }
                    } else {
                        b().B.b(str, "[sgtm] Upload queue has no batches for appId");
                    }
                } else {
                    b().B.a("Network not connected, ignoring upload request");
                    N();
                }
            }
            this.J = false;
            O();
        } catch (Throwable th) {
            this.J = false;
            O();
            throw th;
        }
    }

    public final void u(String str, boolean z10, Long l10, Long l11) {
        m mVar = this.f8762i;
        T(mVar);
        a1 w02 = mVar.w0(str);
        if (w02 != null) {
            q1 q1Var = w02.f8474a;
            o1 o1Var = q1Var.f8938u;
            q1.l(o1Var);
            o1Var.s();
            w02.R |= w02.f8496y != z10;
            w02.f8496y = z10;
            o1 o1Var2 = q1Var.f8938u;
            q1.l(o1Var2);
            o1Var2.s();
            w02.R |= !Objects.equals(w02.f8497z, l10);
            w02.f8497z = l10;
            o1 o1Var3 = q1Var.f8938u;
            q1.l(o1Var3);
            o1Var3.s();
            w02.R |= !Objects.equals(w02.A, l11);
            w02.A = l11;
            if (w02.o()) {
                m mVar2 = this.f8762i;
                T(mVar2);
                mVar2.x0(w02, false);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x011f, code lost:
    
        if (r6 < android.os.SystemClock.elapsedRealtime()) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(d9 d9Var, String str) {
        int e02;
        int indexOf;
        k1 k1Var = this.f8760d;
        T(k1Var);
        k1Var.s();
        k1Var.y(str);
        s.e eVar = k1Var.f8777s;
        Set set = (Set) eVar.get(str);
        if (set != null) {
            d9Var.b();
            ((e9) d9Var.f2389e).e1(set);
        }
        T(k1Var);
        k1Var.s();
        k1Var.y(str);
        if (eVar.get(str) != null && (((Set) eVar.get(str)).contains("device_model") || ((Set) eVar.get(str)).contains("device_info"))) {
            d9Var.b();
            ((e9) d9Var.f2389e).u1();
        }
        T(k1Var);
        if (k1Var.L(str)) {
            String n22 = ((e9) d9Var.f2389e).n2();
            if (!TextUtils.isEmpty(n22) && (indexOf = n22.indexOf(".")) != -1) {
                String substring = n22.substring(0, indexOf);
                d9Var.b();
                ((e9) d9Var.f2389e).s0(substring);
            }
        }
        T(k1Var);
        k1Var.s();
        k1Var.y(str);
        if (eVar.get(str) != null && ((Set) eVar.get(str)).contains("user_id") && (e02 = l4.e0(d9Var, "_id")) != -1) {
            d9Var.b();
            ((e9) d9Var.f2389e).i0(e02);
        }
        T(k1Var);
        k1Var.s();
        k1Var.y(str);
        if (eVar.get(str) != null && ((Set) eVar.get(str)).contains("google_signals")) {
            d9Var.b();
            ((e9) d9Var.f2389e).W0();
        }
        T(k1Var);
        if (k1Var.M(str)) {
            d9Var.b();
            ((e9) d9Var.f2389e).H1();
            if (c(str).i(b2.ANALYTICS_STORAGE)) {
                HashMap hashMap = this.R;
                h4 h4Var = (h4) hashMap.get(str);
                if (h4Var != null) {
                    long A = e0().A(str, e0.f8630j0) + h4Var.f8730b;
                    f().getClass();
                }
                h4Var = new h4(this, k0().p0());
                hashMap.put(str, h4Var);
                String str2 = h4Var.f8729a;
                d9Var.b();
                ((e9) d9Var.f2389e).f1(str2);
            }
        }
        T(k1Var);
        k1Var.s();
        k1Var.y(str);
        if (eVar.get(str) == null || !((Set) eVar.get(str)).contains("enhanced_user_id")) {
            return;
        }
        d9Var.b();
        ((e9) d9Var.f2389e).d1();
    }

    public final void w(d9 d9Var, e1 e1Var) {
        String str;
        String str2;
        for (int i3 = 0; i3 < d9Var.U(); i3++) {
            v8 v8Var = (v8) ((e9) d9Var.f2389e).Y1(i3).k();
            Iterator it = v8Var.g().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if ("_c".equals(((z8) it.next()).u())) {
                    if (((e9) e1Var.f8665b).K0() >= e0().B(((e9) e1Var.f8665b).t(), e0.f8633k0)) {
                        int B = e0().B(((e9) e1Var.f8665b).t(), e0.f8659x0);
                        LinkedList linkedList = this.E;
                        l4 l4Var = this.f8766u;
                        if (B > 0) {
                            m mVar = this.f8762i;
                            T(mVar);
                            if (mVar.y0(g(), ((e9) e1Var.f8665b).t(), false, false, false, true).g > B) {
                                y8 F = z8.F();
                                F.g("_tnr");
                                F.i(1L);
                                v8Var.j((z8) F.d());
                            } else {
                                if (e0().D(((e9) e1Var.f8665b).t(), e0.Q0)) {
                                    str2 = k0().p0();
                                    y8 F2 = z8.F();
                                    F2.g("_tu");
                                    F2.h(str2);
                                    v8Var.j((z8) F2.d());
                                } else {
                                    str2 = null;
                                }
                                y8 F3 = z8.F();
                                F3.g("_tr");
                                F3.i(1L);
                                v8Var.j((z8) F3.d());
                                T(l4Var);
                                x3 R = l4Var.R(((e9) e1Var.f8665b).t(), d9Var, v8Var, str2);
                                if (R != null) {
                                    b().B.c(((e9) e1Var.f8665b).t(), R.f9104d, "Generated trigger URI. appId, uri");
                                    m mVar2 = this.f8762i;
                                    T(mVar2);
                                    mVar2.N(((e9) e1Var.f8665b).t(), R);
                                    if (!linkedList.contains(((e9) e1Var.f8665b).t())) {
                                        linkedList.add(((e9) e1Var.f8665b).t());
                                    }
                                }
                            }
                        } else {
                            if (e0().D(((e9) e1Var.f8665b).t(), e0.Q0)) {
                                str = k0().p0();
                                y8 F4 = z8.F();
                                F4.g("_tu");
                                F4.h(str);
                                v8Var.j((z8) F4.d());
                            } else {
                                str = null;
                            }
                            y8 F5 = z8.F();
                            F5.g("_tr");
                            F5.i(1L);
                            v8Var.j((z8) F5.d());
                            T(l4Var);
                            x3 R2 = l4Var.R(((e9) e1Var.f8665b).t(), d9Var, v8Var, str);
                            if (R2 != null) {
                                b().B.c(((e9) e1Var.f8665b).t(), R2.f9104d, "Generated trigger URI. appId, uri");
                                m mVar3 = this.f8762i;
                                T(mVar3);
                                mVar3.N(((e9) e1Var.f8665b).t(), R2);
                                if (!linkedList.contains(((e9) e1Var.f8665b).t())) {
                                    linkedList.add(((e9) e1Var.f8665b).t());
                                }
                            }
                        }
                    }
                    w8 w8Var = (w8) v8Var.d();
                    d9Var.b();
                    ((e9) d9Var.f2389e).b0(i3, w8Var);
                }
            }
        }
    }

    public final void x(String str, y8 y8Var, Bundle bundle, String str2) {
        int x10;
        List e2 = e0().D(str2, e0.f8607a1) ? g7.b.e("_o", "_sn", "_sc", "_si", "deep_link_url") : g7.b.e("_o", "_sn", "_sc", "_si");
        if (p4.W(((z8) y8Var.f2389e).u()) || p4.W(str)) {
            x10 = e0().x(str2, true);
        } else {
            g e02 = e0();
            e02.getClass();
            x10 = Math.max(Math.min(e02.B(str2, e0.f8623g0), PermissionsActivity.DELAY_TIME_CALLBACK_CALL), 100);
        }
        long j = x10;
        long codePointCount = ((z8) y8Var.f2389e).w().codePointCount(0, ((z8) y8Var.f2389e).w().length());
        k0();
        String u2 = ((z8) y8Var.f2389e).u();
        e0();
        String z10 = p4.z(u2, true, 40);
        if (codePointCount <= j || e2.contains(((z8) y8Var.f2389e).u())) {
            return;
        }
        if ("_ev".equals(((z8) y8Var.f2389e).u())) {
            k0();
            bundle.putString("_ev", p4.z(((z8) y8Var.f2389e).w(), true, e0().x(str2, true)));
            return;
        }
        b().f9055y.c(z10, Long.valueOf(codePointCount), "Param value is too long; discarded. Name, value length");
        if (bundle.getLong("_err") == 0) {
            bundle.putLong("_err", 4L);
            if (bundle.getString("_ev") == null) {
                bundle.putString("_ev", z10);
                bundle.putLong("_el", codePointCount);
            }
        }
        bundle.remove(((z8) y8Var.f2389e).u());
    }

    public final boolean y(v8 v8Var) {
        ArrayList arrayList = new ArrayList(v8Var.g());
        int i3 = -1;
        int i10 = -1;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if ("value".equals(((z8) arrayList.get(i11)).u())) {
                i3 = i11;
            } else if ("currency".equals(((z8) arrayList.get(i11)).u())) {
                i10 = i11;
            }
        }
        if (i3 == -1) {
            if (!e0().D(null, e0.f8622f1) || !"_iap".equals(v8Var.m())) {
                return true;
            }
            E(v8Var, "_c");
            D(v8Var, 18, "value");
            return false;
        }
        if (!((z8) arrayList.get(i3)).x() && !((z8) arrayList.get(i3)).B()) {
            b().f9055y.a("Value must be specified with a numeric type.");
            v8Var.l(i3);
            E(v8Var, "_c");
            D(v8Var, 18, "value");
            return false;
        }
        if (i10 != -1) {
            String w6 = ((z8) arrayList.get(i10)).w();
            if (w6.length() == 3) {
                int i12 = 0;
                while (i12 < w6.length()) {
                    int codePointAt = w6.codePointAt(i12);
                    if (Character.isLetter(codePointAt)) {
                        i12 += Character.charCount(codePointAt);
                    }
                }
                return true;
            }
        }
        b().f9055y.a("Value parameter discarded. You must also supply a 3-letter ISO_4217 currency code in the currency parameter.");
        v8Var.l(i3);
        E(v8Var, "_c");
        D(v8Var, 19, "currency");
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0046, code lost:
    
        if (r20 != null) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void z(boolean z10, int i3, Throwable th, byte[] bArr, String str, List list, Map map) {
        byte[] bArr2;
        x2 x2Var;
        int i10 = i3;
        z0 z0Var = this.f8761e;
        d().s();
        l0();
        if (bArr == null) {
            try {
                bArr2 = new byte[0];
            } catch (Throwable th2) {
                this.I = false;
                O();
                throw th2;
            }
        } else {
            bArr2 = bArr;
        }
        if (e0().D(null, e0.f8619e1)) {
            l4 l4Var = this.f8766u;
            T(l4Var);
            l4Var.y(map);
        }
        ArrayList arrayList = this.M;
        c7.c0.g(arrayList);
        this.M = null;
        try {
            if (z10) {
                if (i10 != 200) {
                    if (i10 == 204) {
                        i10 = 204;
                    }
                    String str2 = new String(bArr2, StandardCharsets.UTF_8);
                    b().f9055y.d("Network upload failed. Will retry later. code, error", Integer.valueOf(i10), th, str2.substring(0, Math.min(32, str2.length())));
                    d1 d1Var = this.f8768w.f8879w;
                    f().getClass();
                    d1Var.b(System.currentTimeMillis());
                    if (i10 == 503 || i10 == 429) {
                        d1 d1Var2 = this.f8768w.f8877u;
                        f().getClass();
                        d1Var2.b(System.currentTimeMillis());
                    }
                    m mVar = this.f8762i;
                    T(mVar);
                    mVar.D(arrayList);
                    N();
                    this.I = false;
                    O();
                    return;
                }
            }
            HashMap hashMap = new HashMap();
            Iterator it = list.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                x2Var = x2.SGTM_CLIENT;
                if (!hasNext) {
                    break;
                }
                Pair pair = (Pair) it.next();
                c9 c9Var = (c9) pair.first;
                e4 e4Var = (e4) pair.second;
                x2 x2Var2 = e4Var.f8680c;
                x2 x2Var3 = e4Var.f8680c;
                if (x2Var2 != x2Var) {
                    m mVar2 = this.f8762i;
                    T(mVar2);
                    String str3 = e4Var.f8678a;
                    Map map2 = e4Var.f8679b;
                    if (map2 == null) {
                        map2 = Collections.EMPTY_MAP;
                    }
                    long w6 = mVar2.w(str, c9Var, str3, map2, x2Var3, null);
                    if (x2Var3 == x2.GOOGLE_SIGNAL_PENDING && w6 != -1 && !c9Var.x().isEmpty()) {
                        hashMap.put(c9Var.x(), Long.valueOf(w6));
                    }
                }
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                Pair pair2 = (Pair) it2.next();
                c9 c9Var2 = (c9) pair2.first;
                e4 e4Var2 = (e4) pair2.second;
                if (e4Var2.f8680c == x2Var) {
                    Long l10 = (Long) hashMap.get(c9Var2.x());
                    m mVar3 = this.f8762i;
                    T(mVar3);
                    x2 x2Var4 = x2Var;
                    String str4 = e4Var2.f8678a;
                    Map map3 = e4Var2.f8679b;
                    if (map3 == null) {
                        map3 = Collections.EMPTY_MAP;
                    }
                    mVar3.w(str, c9Var2, str4, map3, e4Var2.f8680c, l10);
                    x2Var = x2Var4;
                }
            }
            m mVar4 = this.f8762i;
            T(mVar4);
            List x10 = mVar4.x(str, b4.b(x2Var), 1);
            if (!x10.isEmpty()) {
                long j = ((k4) x10.get(0)).f8802f;
                f().getClass();
                if (System.currentTimeMillis() > ((Long) e0.F.a(null)).longValue() + j) {
                    b().f9053w.c(str, Long.valueOf(j), "[sgtm] client batches are queued too long. appId, creationTime");
                }
            }
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                int i12 = i11 + 1;
                Long l11 = (Long) arrayList.get(i11);
                try {
                    m mVar5 = this.f8762i;
                    T(mVar5);
                    mVar5.B(l11.longValue());
                } catch (SQLiteException e2) {
                    ArrayList arrayList2 = this.N;
                    if (arrayList2 == null || !arrayList2.contains(l11)) {
                        throw e2;
                    }
                }
                i11 = i12;
            }
            m mVar6 = this.f8762i;
            T(mVar6);
            mVar6.h0();
            m mVar7 = this.f8762i;
            T(mVar7);
            mVar7.i0();
            this.N = null;
            T(z0Var);
            if (z0Var.w()) {
                m mVar8 = this.f8762i;
                T(mVar8);
                if (mVar8.y(str)) {
                    t(str);
                    this.C = 0L;
                    this.I = false;
                    O();
                    return;
                }
            }
            T(z0Var);
            if (z0Var.w() && M()) {
                q();
            } else {
                this.O = -1L;
                N();
            }
            this.C = 0L;
            this.I = false;
            O();
            return;
        } catch (Throwable th3) {
            m mVar9 = this.f8762i;
            T(mVar9);
            mVar9.i0();
            throw th3;
        }
        t0 t0Var = b().B;
        Integer valueOf = Integer.valueOf(i10);
        t0Var.c(valueOf, Boolean.valueOf(z10), "Network upload successful with code, uploadAttempted");
        if (z10) {
            try {
                d1 d1Var3 = this.f8768w.f8878v;
                f().getClass();
                d1Var3.b(System.currentTimeMillis());
            } catch (SQLiteException e9) {
                b().f9050t.b(e9, "Database error while trying to delete uploaded bundles");
                f().getClass();
                this.C = SystemClock.elapsedRealtime();
                b().B.b(Long.valueOf(this.C), "Disable upload, time");
            }
        }
        this.f8768w.f8879w.b(0L);
        N();
        if (z10) {
            b().B.c(valueOf, Integer.valueOf(bArr2.length), "Successful upload. Got network response. code, size");
        } else {
            b().B.a("Purged empty bundles");
        }
        m mVar10 = this.f8762i;
        T(mVar10);
        mVar10.g0();
    }
}
