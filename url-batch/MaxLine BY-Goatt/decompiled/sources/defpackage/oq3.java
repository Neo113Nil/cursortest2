package defpackage;

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
import com.facebook.appevents.AppEventsConstants;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.encoders.json.BuildConfig;
import com.google.firebase.messaging.Constants;
import com.google.firebase.messaging.ServiceStarter;
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
import java.nio.charset.Charset;
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

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class oq3 implements qk3 {
    public static volatile oq3 W;
    public long A;
    public ArrayList B;
    public int D;
    public int E;
    public boolean F;
    public boolean G;
    public boolean H;
    public FileLock I;
    public FileChannel J;
    public ArrayList K;
    public ArrayList L;
    public final HashMap N;
    public final HashMap O;
    public final HashMap P;
    public tm3 R;
    public String S;
    public zo3 T;
    public long U;
    public final dj3 m;
    public final bi3 n;
    public tc3 o;
    public hi3 p;
    public kp3 q;
    public nb3 r;
    public final bi3 s;
    public bi3 t;
    public lo3 u;
    public ti3 w;
    public final pj3 x;
    public boolean z;
    public final AtomicBoolean y = new AtomicBoolean(false);
    public final LinkedList C = new LinkedList();
    public final HashMap Q = new HashMap();
    public final hq3 V = new hq3(this);
    public long M = -1;
    public final zp3 v = new zp3(this);

    public oq3(u9 u9Var) {
        this.x = pj3.s(u9Var.m, null, null);
        bi3 bi3Var = new bi3(this, 2);
        bi3Var.y();
        this.s = bi3Var;
        bi3 bi3Var2 = new bi3(this, 0);
        bi3Var2.y();
        this.n = bi3Var2;
        dj3 dj3Var = new dj3(this);
        dj3Var.y();
        this.m = dj3Var;
        this.N = new HashMap();
        this.O = new HashMap();
        this.P = new HashMap();
        c().F(new r7(this, u9Var));
    }

    public static oq3 C(Context context) {
        ll3.v(context);
        ll3.v(context.getApplicationContext());
        if (W == null) {
            synchronized (oq3.class) {
                try {
                    if (W == null) {
                        W = new oq3(new u9(context, 4));
                    }
                } finally {
                }
            }
        }
        return W;
    }

    public static final void D(bj3 bj3Var, int i, String str) {
        List g = bj3Var.g();
        for (int i2 = 0; i2 < g.size(); i2++) {
            if ("_err".equals(((hj3) g.get(i2)).q())) {
                return;
            }
        }
        fj3 B = hj3.B();
        B.g("_err");
        B.i(i);
        hj3 hj3Var = (hj3) B.d();
        fj3 B2 = hj3.B();
        B2.g("_ev");
        B2.h(str);
        hj3 hj3Var2 = (hj3) B2.d();
        bj3Var.j(hj3Var);
        bj3Var.j(hj3Var2);
    }

    public static final void E(bj3 bj3Var, String str) {
        List g = bj3Var.g();
        for (int i = 0; i < g.size(); i++) {
            if (str.equals(((hj3) g.get(i)).q())) {
                bj3Var.l(i);
                return;
            }
        }
    }

    public static String M(String str, Map map) {
        if (map == null) {
            return null;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (str.equalsIgnoreCase((String) entry.getKey())) {
                if (((List) entry.getValue()).isEmpty()) {
                    return null;
                }
                return (String) ((List) entry.getValue()).get(0);
            }
        }
        return null;
    }

    public static void S(Context context, Intent intent) {
        if (Build.VERSION.SDK_INT < 34) {
            context.sendBroadcast(intent);
        } else {
            context.sendBroadcast(intent, null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
        }
    }

    public static final boolean T(cs3 cs3Var) {
        return !TextUtils.isEmpty(cs3Var.n);
    }

    public static final void U(vp3 vp3Var) {
        if (vp3Var == null) {
            lh.g("Upload Component not created");
        } else {
            if (vp3Var.o) {
                return;
            }
            lh.g("Component not initialized: ".concat(String.valueOf(vp3Var.getClass())));
        }
    }

    public static final Boolean V(cs3 cs3Var) {
        Boolean bool = cs3Var.B;
        String str = cs3Var.O;
        if (!TextUtils.isEmpty(str)) {
            int ordinal = ((sk3) ot2.u(str).n).ordinal();
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

    /* JADX WARN: Removed duplicated region for block: B:13:0x004e A[Catch: all -> 0x005f, TRY_LEAVE, TryCatch #1 {all -> 0x005f, blocks: (B:5:0x0030, B:13:0x004e, B:14:0x015d, B:23:0x006c, B:27:0x00c8, B:28:0x00b6, B:29:0x00cd, B:33:0x00de, B:34:0x00f4, B:36:0x010c, B:37:0x0127, B:39:0x0130, B:41:0x0136, B:42:0x013a, B:44:0x0143, B:46:0x0152, B:47:0x015a, B:48:0x0118, B:49:0x00e5, B:51:0x00ee), top: B:4:0x0030, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x010c A[Catch: all -> 0x005f, TryCatch #1 {all -> 0x005f, blocks: (B:5:0x0030, B:13:0x004e, B:14:0x015d, B:23:0x006c, B:27:0x00c8, B:28:0x00b6, B:29:0x00cd, B:33:0x00de, B:34:0x00f4, B:36:0x010c, B:37:0x0127, B:39:0x0130, B:41:0x0136, B:42:0x013a, B:44:0x0143, B:46:0x0152, B:47:0x015a, B:48:0x0118, B:49:0x00e5, B:51:0x00ee), top: B:4:0x0030, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0143 A[Catch: all -> 0x005f, TryCatch #1 {all -> 0x005f, blocks: (B:5:0x0030, B:13:0x004e, B:14:0x015d, B:23:0x006c, B:27:0x00c8, B:28:0x00b6, B:29:0x00cd, B:33:0x00de, B:34:0x00f4, B:36:0x010c, B:37:0x0127, B:39:0x0130, B:41:0x0136, B:42:0x013a, B:44:0x0143, B:46:0x0152, B:47:0x015a, B:48:0x0118, B:49:0x00e5, B:51:0x00ee), top: B:4:0x0030, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0118 A[Catch: all -> 0x005f, TryCatch #1 {all -> 0x005f, blocks: (B:5:0x0030, B:13:0x004e, B:14:0x015d, B:23:0x006c, B:27:0x00c8, B:28:0x00b6, B:29:0x00cd, B:33:0x00de, B:34:0x00f4, B:36:0x010c, B:37:0x0127, B:39:0x0130, B:41:0x0136, B:42:0x013a, B:44:0x0143, B:46:0x0152, B:47:0x015a, B:48:0x0118, B:49:0x00e5, B:51:0x00ee), top: B:4:0x0030, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A(String str, int i, Throwable th, byte[] bArr, Map map) {
        boolean z;
        bi3 bi3Var = this.n;
        c().v();
        l0();
        ll3.s(str);
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } catch (Throwable th2) {
                this.F = false;
                O();
                throw th2;
            }
        }
        g10 g10Var = a().z;
        Integer valueOf = Integer.valueOf(bArr.length);
        g10Var.c(valueOf, "onConfigFetched. Response size");
        tc3 tc3Var = this.o;
        U(tc3Var);
        tc3Var.i0();
        try {
            tc3 tc3Var2 = this.o;
            U(tc3Var2);
            di3 y0 = tc3Var2.y0(str);
            if (i != 200 && i != 204) {
                if (i == 304) {
                    i = 304;
                }
                z = false;
                if (y0 == null) {
                    a().u.c(vh3.E(str), "App does not exist in onConfigFetched. appId");
                } else {
                    dj3 dj3Var = this.m;
                    if (z || i == 404) {
                        String M = M("Last-Modified", map);
                        String M2 = M("ETag", map);
                        if (i != 404 && i != 304) {
                            U(dj3Var);
                            dj3Var.K(str, bArr, M, M2);
                            e().getClass();
                            y0.f(System.currentTimeMillis());
                            tc3 tc3Var3 = this.o;
                            U(tc3Var3);
                            tc3Var3.z0(y0, false);
                            if (i != 404) {
                                a().w.c(str, "Config not found. Using empty config. appId");
                            } else {
                                a().z.d(Integer.valueOf(i), valueOf, "Successfully fetched config. Got network response. code, size");
                            }
                            U(bi3Var);
                            if (bi3Var.Q() || !L()) {
                                U(bi3Var);
                                if (bi3Var.Q()) {
                                    tc3 tc3Var4 = this.o;
                                    U(tc3Var4);
                                    if (tc3Var4.C(y0.D())) {
                                        t(y0.D());
                                    }
                                }
                                N();
                            } else {
                                q();
                            }
                        }
                        U(dj3Var);
                        if (dj3Var.I(str) == null) {
                            U(dj3Var);
                            dj3Var.K(str, null, null, null);
                        }
                        e().getClass();
                        y0.f(System.currentTimeMillis());
                        tc3 tc3Var32 = this.o;
                        U(tc3Var32);
                        tc3Var32.z0(y0, false);
                        if (i != 404) {
                        }
                        U(bi3Var);
                        if (bi3Var.Q()) {
                        }
                        U(bi3Var);
                        if (bi3Var.Q()) {
                        }
                        N();
                    } else {
                        e().getClass();
                        y0.g(System.currentTimeMillis());
                        tc3 tc3Var5 = this.o;
                        U(tc3Var5);
                        tc3Var5.z0(y0, false);
                        a().z.d(Integer.valueOf(i), th, "Fetching config failed. code, error");
                        U(dj3Var);
                        dj3Var.v();
                        dj3Var.y.put(str, null);
                        li3 li3Var = this.u.u;
                        e().getClass();
                        li3Var.b(System.currentTimeMillis());
                        if (i == 503 || i == 429) {
                            li3 li3Var2 = this.u.s;
                            e().getClass();
                            li3Var2.b(System.currentTimeMillis());
                        }
                        N();
                    }
                }
                tc3 tc3Var6 = this.o;
                U(tc3Var6);
                tc3Var6.j0();
                this.F = false;
                O();
            }
            if (th == null) {
                z = true;
                if (y0 == null) {
                }
                tc3 tc3Var62 = this.o;
                U(tc3Var62);
                tc3Var62.j0();
                this.F = false;
                O();
            }
            z = false;
            if (y0 == null) {
            }
            tc3 tc3Var622 = this.o;
            U(tc3Var622);
            tc3Var622.j0();
            this.F = false;
            O();
        } finally {
            tc3 tc3Var7 = this.o;
            U(tc3Var7);
            tc3Var7.k0();
        }
    }

    public final void B() {
        c().v();
        l0();
        if (this.z) {
            return;
        }
        this.z = true;
        c().v();
        FileLock fileLock = this.I;
        pj3 pj3Var = this.x;
        if (fileLock == null || !fileLock.isValid()) {
            ((pj3) this.o.m).getClass();
            try {
                FileChannel channel = new RandomAccessFile(new File(new File(pj3Var.m.getFilesDir(), "google_app_measurement.db").getPath()), "rw").getChannel();
                this.J = channel;
                FileLock tryLock = channel.tryLock();
                this.I = tryLock;
                if (tryLock == null) {
                    a().r.b("Storage concurrent data access panic");
                    return;
                }
                a().z.b("Storage concurrent access okay");
            } catch (FileNotFoundException e) {
                a().r.c(e, "Failed to acquire storage lock");
                return;
            } catch (IOException e2) {
                a().r.c(e2, "Failed to access storage lock file");
                return;
            } catch (OverlappingFileLockException e3) {
                a().u.c(e3, "Storage lock already acquired");
                return;
            }
        } else {
            a().z.b("Storage concurrent access okay");
        }
        FileChannel fileChannel = this.J;
        c().v();
        int i = 0;
        if (fileChannel == null || !fileChannel.isOpen()) {
            a().r.b("Bad channel to read from");
        } else {
            ByteBuffer allocate = ByteBuffer.allocate(4);
            try {
                fileChannel.position(0L);
                int read = fileChannel.read(allocate);
                if (read == 4) {
                    allocate.flip();
                    i = allocate.getInt();
                } else if (read != -1) {
                    a().u.c(Integer.valueOf(read), "Unexpected data length. Bytes read");
                }
            } catch (IOException e4) {
                a().r.c(e4, "Failed to read from channel");
            }
        }
        gh3 r = pj3Var.r();
        r.x();
        int i2 = r.q;
        c().v();
        if (i > i2) {
            a().r.d(Integer.valueOf(i), Integer.valueOf(i2), "Panic: can't downgrade version. Previous, current version");
            return;
        }
        if (i < i2) {
            FileChannel fileChannel2 = this.J;
            c().v();
            if (fileChannel2 == null || !fileChannel2.isOpen()) {
                a().r.b("Bad channel to read from");
            } else {
                ByteBuffer allocate2 = ByteBuffer.allocate(4);
                allocate2.putInt(i2);
                allocate2.flip();
                try {
                    fileChannel2.truncate(0L);
                    fileChannel2.write(allocate2);
                    fileChannel2.force(true);
                    if (fileChannel2.size() != 4) {
                        a().r.c(Long.valueOf(fileChannel2.size()), "Error writing to channel. Bytes written");
                    }
                    a().z.d(Integer.valueOf(i), Integer.valueOf(i2), "Storage version upgraded. Previous, current version");
                    return;
                } catch (IOException e5) {
                    a().r.c(e5, "Failed to write to channel");
                }
            }
            a().r.d(Integer.valueOf(i), Integer.valueOf(i2), "Storage version upgrade failed. Previous, current version");
        }
    }

    public final int F(String str, ot2 ot2Var) {
        sk3 A;
        dj3 dj3Var = this.m;
        dh3 R = dj3Var.R(str);
        vk3 vk3Var = vk3.AD_PERSONALIZATION;
        if (R == null) {
            ot2Var.w(vk3Var, gc3.FAILSAFE);
            return 1;
        }
        tc3 tc3Var = this.o;
        U(tc3Var);
        di3 y0 = tc3Var.y0(str);
        if (y0 == null || ((sk3) ot2.u(y0.s()).n) != sk3.POLICY || (A = dj3Var.A(str, vk3Var)) == sk3.UNINITIALIZED) {
            ot2Var.w(vk3Var, gc3.REMOTE_DEFAULT);
            if (dj3Var.Q(str, vk3Var)) {
                return 0;
            }
        } else {
            ot2Var.w(vk3Var, gc3.REMOTE_ENFORCED_DEFAULT);
            if (A == sk3.GRANTED) {
                return 0;
            }
        }
        return 1;
    }

    public final HashMap G(cj3 cj3Var) {
        Serializable L;
        HashMap hashMap = new HashMap();
        j0();
        HashMap hashMap2 = new HashMap();
        for (hj3 hj3Var : cj3Var.p()) {
            if (hj3Var.q().startsWith("gad_") && (L = bi3.L(hj3Var)) != null) {
                hashMap2.put(hj3Var.q(), L);
            }
        }
        for (Map.Entry entry : hashMap2.entrySet()) {
            hashMap.put((String) entry.getKey(), String.valueOf(entry.getValue()));
        }
        return hashMap;
    }

    public final void H() {
        c().v();
        if (this.C.isEmpty()) {
            return;
        }
        int i = 2;
        if (this.T == null) {
            this.T = new zo3(this, this.x, i);
        }
        if (this.T.c != 0) {
            return;
        }
        e().getClass();
        long max = Math.max(0L, ((Integer) ug3.B0.a(null)).intValue() - (SystemClock.elapsedRealtime() - this.U));
        a().z.c(Long.valueOf(max), "Scheduling notify next app runnable, delay in ms");
        if (this.T == null) {
            this.T = new zo3(this, this.x, i);
        }
        this.T.b(max);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(40:7|(3:8|9|(4:11|12|(4:14|(1:21)|22|23)(29:25|26|(23:33|34|(2:36|(3:38|(4:41|(2:47|48)|49|39)|53))|54|55|(3:57|58|(9:245|(11:114|(5:118|(2:120|121)(2:123|(2:125|126)(1:127))|122|116|115)|128|129|(2:224|(3:229|(1:231)(2:233|(3:235|(3:238|(1:240)(1:241)|236)|242)(0))|232)(1:228))(1:131)|132|(2:134|(2:(2:139|(2:141|142))|189)(3:190|191|192))(2:193|(4:195|(2:(2:200|(2:202|142))|203)|191|192)(3:204|(2:215|(2:216|(2:218|(2:221|222)(1:220))(1:223)))(0)|192))|143|(9:145|(4:148|(2:165|(2:167|168)(1:169))(5:152|(5:155|(2:158|156)|159|160|153)|161|162|163)|164|146)|170|171|(4:174|(3:176|177|178)(1:180)|179|172)|181|182|(1:184)|185)(1:188)|186|187)|243|132|(0)(0)|143|(0)(0)|186|187))(1:246)|62|(3:63|64|(3:66|(2:68|69)(2:71|(2:73|74)(2:75|76))|70)(1:77))|78|(1:81)|(1:83)|84|(1:86)(1:244)|87|(5:92|(4:95|(2:97|98)(2:100|(2:102|103)(1:104))|99|93)|105|(1:(1:108)(1:109))|(1:111)(1:112))|(0)|243|132|(0)(0)|143|(0)(0)|186|187)|247|(2:249|(24:255|256|34|(0)|54|55|(0)(0)|62|(4:63|64|(0)(0)|70)|78|(1:81)|(0)|84|(0)(0)|87|(6:90|92|(1:93)|105|(0)|(0)(0))|(0)|243|132|(0)(0)|143|(0)(0)|186|187))|257|256|34|(0)|54|55|(0)(0)|62|(4:63|64|(0)(0)|70)|78|(0)|(0)|84|(0)(0)|87|(0)|(0)|243|132|(0)(0)|143|(0)(0)|186|187)|24)(1:258))|259|(5:261|(2:263|(3:265|266|267))|268|(1:281)(3:270|(1:272)(1:280)|(2:276|277))|267)|282|283|(3:284|285|(1:515)(2:287|(2:289|290)(1:514)))|291|(1:293)(2:511|(1:513))|294|(1:296)(1:510)|297|(1:299)(1:509)|300|(6:303|(1:305)|306|(2:308|309)(1:311)|310|301)|312|313|(2:504|(1:508))(1:317)|318|(1:320)|321|(1:323)|324|(2:326|(1:332))|333|(8:335|(8:339|340|(4:342|(2:344|(1:346))|(1:367)(5:350|(1:354)|355|(1:365)(1:359)|360)|361)(8:368|(7:431|432|371|(3:373|(3:376|(3:379|380|(3:382|383|(1:385)(6:386|(1:390)|391|(1:393)(1:427)|394|(3:396|(1:404)|405)(5:406|(3:408|(1:410)|411)(4:414|(1:416)(1:426)|417|(3:419|(1:421)|422)(2:423|(1:425)))|412|413|364)))(2:428|(0)(0)))(1:378)|374)|429)|430|383|(0)(0))|370|371|(0)|430|383|(0)(0))|362|363|364|337|336)|436|437|(1:439)|440|(2:443|441)|444)(1:503)|445|(1:447)(2:484|(20:486|(1:488)(1:502)|489|(1:491)(1:501)|492|(1:494)(1:500)|495|(1:497)(1:499)|498|449|(5:451|(2:456|457)|458|(1:460)(1:461)|457)|462|(3:(2:466|467)(1:469)|468|463)|470|471|(1:473)|474|475|476|477))|448|449|(0)|462|(1:463)|470|471|(0)|474|475|476|477) */
    /* JADX WARN: Code restructure failed: missing block: B:482:0x0f20, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:483:0x0f21, code lost:
    
        ((defpackage.pj3) r2.m).a().A().d(defpackage.vh3.E(r1), r0, "Failed to remove unused event metadata. appId");
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x03f6 A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:7:0x003e, B:8:0x005e, B:11:0x0076, B:14:0x00a4, B:16:0x00e1, B:19:0x00fa, B:21:0x0104, B:24:0x0712, B:25:0x0132, B:28:0x0144, B:30:0x014a, B:34:0x018e, B:36:0x01a0, B:39:0x01c7, B:41:0x01cd, B:43:0x01dd, B:45:0x01eb, B:47:0x01fb, B:49:0x0206, B:54:0x0209, B:57:0x0221, B:63:0x0252, B:66:0x025c, B:68:0x026a, B:70:0x02c6, B:71:0x028e, B:73:0x029e, B:81:0x02d5, B:83:0x02ff, B:84:0x0327, B:86:0x035c, B:87:0x0362, B:90:0x036e, B:92:0x03a3, B:93:0x03c0, B:95:0x03c6, B:97:0x03d4, B:99:0x03e8, B:100:0x03dc, B:108:0x03ef, B:111:0x03f6, B:112:0x0415, B:114:0x0430, B:115:0x043c, B:118:0x0446, B:122:0x0469, B:123:0x0458, B:132:0x04e3, B:134:0x04ef, B:137:0x0500, B:139:0x0511, B:141:0x051d, B:143:0x05e2, B:145:0x05e8, B:146:0x05f4, B:148:0x05fa, B:150:0x060a, B:152:0x0614, B:153:0x0627, B:155:0x062d, B:156:0x0646, B:158:0x064c, B:160:0x066a, B:162:0x0678, B:164:0x069f, B:165:0x067e, B:167:0x068a, B:171:0x06a6, B:172:0x06c3, B:174:0x06c9, B:177:0x06dc, B:182:0x06e9, B:184:0x06f0, B:186:0x06fe, B:193:0x0538, B:195:0x0546, B:198:0x0557, B:200:0x0568, B:202:0x0574, B:204:0x0583, B:206:0x0592, B:209:0x059e, B:211:0x05a8, B:213:0x05b2, B:216:0x05bd, B:218:0x05c3, B:222:0x05d3, B:220:0x05de, B:224:0x0471, B:226:0x047d, B:228:0x0489, B:232:0x04cd, B:233:0x04a5, B:236:0x04b7, B:238:0x04bd, B:240:0x04c7, B:247:0x0154, B:249:0x0161, B:251:0x016f, B:253:0x0175, B:256:0x0180, B:261:0x072b, B:263:0x073d, B:265:0x0746, B:267:0x0776, B:268:0x074e, B:270:0x0757, B:272:0x075d, B:274:0x0769, B:276:0x0771, B:283:0x0779, B:284:0x0785, B:287:0x078d, B:290:0x079f, B:291:0x07aa, B:293:0x07b2, B:294:0x07e1, B:296:0x07fd, B:297:0x0812, B:299:0x082e, B:300:0x0843, B:301:0x085f, B:303:0x0865, B:305:0x087d, B:306:0x088b, B:308:0x089b, B:310:0x08a9, B:313:0x08ac, B:315:0x08f6, B:317:0x08fc, B:318:0x0927, B:320:0x092f, B:321:0x094d, B:323:0x0953, B:324:0x0967, B:326:0x097e, B:328:0x098f, B:330:0x09a1, B:332:0x09ab, B:333:0x09ae, B:335:0x0a09, B:336:0x0a1c, B:339:0x0a24, B:342:0x0a43, B:344:0x0a5c, B:346:0x0a71, B:348:0x0a76, B:350:0x0a7a, B:352:0x0a7e, B:354:0x0a88, B:355:0x0a91, B:357:0x0a95, B:359:0x0a9b, B:360:0x0aa6, B:361:0x0ab4, B:364:0x0d1b, B:368:0x0abd, B:432:0x0adb, B:371:0x0af8, B:373:0x0b18, B:374:0x0b20, B:376:0x0b26, B:380:0x0b38, B:383:0x0b4e, B:385:0x0b64, B:386:0x0b87, B:388:0x0b93, B:390:0x0ba9, B:391:0x0be9, B:396:0x0c05, B:398:0x0c10, B:400:0x0c14, B:402:0x0c18, B:404:0x0c1c, B:405:0x0c28, B:406:0x0c2d, B:408:0x0c33, B:410:0x0c4b, B:411:0x0c50, B:412:0x0d18, B:414:0x0c8f, B:416:0x0c94, B:419:0x0ca8, B:421:0x0cc7, B:422:0x0cce, B:425:0x0d0c, B:426:0x0c99, B:435:0x0ae1, B:437:0x0d26, B:439:0x0d33, B:440:0x0d47, B:441:0x0d4f, B:443:0x0d55, B:445:0x0d6b, B:447:0x0d7d, B:449:0x0e2d, B:451:0x0e33, B:453:0x0e48, B:456:0x0e4f, B:457:0x0e92, B:458:0x0e5e, B:460:0x0e6c, B:461:0x0e79, B:462:0x0ea1, B:463:0x0eba, B:466:0x0ec2, B:468:0x0ec7, B:471:0x0ed7, B:473:0x0ef1, B:474:0x0f0e, B:476:0x0f16, B:477:0x0f36, B:483:0x0f21, B:484:0x0d99, B:486:0x0d9f, B:488:0x0daf, B:489:0x0db6, B:494:0x0dcc, B:495:0x0dd3, B:497:0x0e1e, B:498:0x0e25, B:499:0x0e22, B:500:0x0dd0, B:502:0x0db3, B:504:0x090c, B:506:0x0912, B:508:0x0918, B:509:0x0840, B:510:0x080f, B:511:0x07b8, B:513:0x07be, B:517:0x0f3f), top: B:2:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0415 A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:7:0x003e, B:8:0x005e, B:11:0x0076, B:14:0x00a4, B:16:0x00e1, B:19:0x00fa, B:21:0x0104, B:24:0x0712, B:25:0x0132, B:28:0x0144, B:30:0x014a, B:34:0x018e, B:36:0x01a0, B:39:0x01c7, B:41:0x01cd, B:43:0x01dd, B:45:0x01eb, B:47:0x01fb, B:49:0x0206, B:54:0x0209, B:57:0x0221, B:63:0x0252, B:66:0x025c, B:68:0x026a, B:70:0x02c6, B:71:0x028e, B:73:0x029e, B:81:0x02d5, B:83:0x02ff, B:84:0x0327, B:86:0x035c, B:87:0x0362, B:90:0x036e, B:92:0x03a3, B:93:0x03c0, B:95:0x03c6, B:97:0x03d4, B:99:0x03e8, B:100:0x03dc, B:108:0x03ef, B:111:0x03f6, B:112:0x0415, B:114:0x0430, B:115:0x043c, B:118:0x0446, B:122:0x0469, B:123:0x0458, B:132:0x04e3, B:134:0x04ef, B:137:0x0500, B:139:0x0511, B:141:0x051d, B:143:0x05e2, B:145:0x05e8, B:146:0x05f4, B:148:0x05fa, B:150:0x060a, B:152:0x0614, B:153:0x0627, B:155:0x062d, B:156:0x0646, B:158:0x064c, B:160:0x066a, B:162:0x0678, B:164:0x069f, B:165:0x067e, B:167:0x068a, B:171:0x06a6, B:172:0x06c3, B:174:0x06c9, B:177:0x06dc, B:182:0x06e9, B:184:0x06f0, B:186:0x06fe, B:193:0x0538, B:195:0x0546, B:198:0x0557, B:200:0x0568, B:202:0x0574, B:204:0x0583, B:206:0x0592, B:209:0x059e, B:211:0x05a8, B:213:0x05b2, B:216:0x05bd, B:218:0x05c3, B:222:0x05d3, B:220:0x05de, B:224:0x0471, B:226:0x047d, B:228:0x0489, B:232:0x04cd, B:233:0x04a5, B:236:0x04b7, B:238:0x04bd, B:240:0x04c7, B:247:0x0154, B:249:0x0161, B:251:0x016f, B:253:0x0175, B:256:0x0180, B:261:0x072b, B:263:0x073d, B:265:0x0746, B:267:0x0776, B:268:0x074e, B:270:0x0757, B:272:0x075d, B:274:0x0769, B:276:0x0771, B:283:0x0779, B:284:0x0785, B:287:0x078d, B:290:0x079f, B:291:0x07aa, B:293:0x07b2, B:294:0x07e1, B:296:0x07fd, B:297:0x0812, B:299:0x082e, B:300:0x0843, B:301:0x085f, B:303:0x0865, B:305:0x087d, B:306:0x088b, B:308:0x089b, B:310:0x08a9, B:313:0x08ac, B:315:0x08f6, B:317:0x08fc, B:318:0x0927, B:320:0x092f, B:321:0x094d, B:323:0x0953, B:324:0x0967, B:326:0x097e, B:328:0x098f, B:330:0x09a1, B:332:0x09ab, B:333:0x09ae, B:335:0x0a09, B:336:0x0a1c, B:339:0x0a24, B:342:0x0a43, B:344:0x0a5c, B:346:0x0a71, B:348:0x0a76, B:350:0x0a7a, B:352:0x0a7e, B:354:0x0a88, B:355:0x0a91, B:357:0x0a95, B:359:0x0a9b, B:360:0x0aa6, B:361:0x0ab4, B:364:0x0d1b, B:368:0x0abd, B:432:0x0adb, B:371:0x0af8, B:373:0x0b18, B:374:0x0b20, B:376:0x0b26, B:380:0x0b38, B:383:0x0b4e, B:385:0x0b64, B:386:0x0b87, B:388:0x0b93, B:390:0x0ba9, B:391:0x0be9, B:396:0x0c05, B:398:0x0c10, B:400:0x0c14, B:402:0x0c18, B:404:0x0c1c, B:405:0x0c28, B:406:0x0c2d, B:408:0x0c33, B:410:0x0c4b, B:411:0x0c50, B:412:0x0d18, B:414:0x0c8f, B:416:0x0c94, B:419:0x0ca8, B:421:0x0cc7, B:422:0x0cce, B:425:0x0d0c, B:426:0x0c99, B:435:0x0ae1, B:437:0x0d26, B:439:0x0d33, B:440:0x0d47, B:441:0x0d4f, B:443:0x0d55, B:445:0x0d6b, B:447:0x0d7d, B:449:0x0e2d, B:451:0x0e33, B:453:0x0e48, B:456:0x0e4f, B:457:0x0e92, B:458:0x0e5e, B:460:0x0e6c, B:461:0x0e79, B:462:0x0ea1, B:463:0x0eba, B:466:0x0ec2, B:468:0x0ec7, B:471:0x0ed7, B:473:0x0ef1, B:474:0x0f0e, B:476:0x0f16, B:477:0x0f36, B:483:0x0f21, B:484:0x0d99, B:486:0x0d9f, B:488:0x0daf, B:489:0x0db6, B:494:0x0dcc, B:495:0x0dd3, B:497:0x0e1e, B:498:0x0e25, B:499:0x0e22, B:500:0x0dd0, B:502:0x0db3, B:504:0x090c, B:506:0x0912, B:508:0x0918, B:509:0x0840, B:510:0x080f, B:511:0x07b8, B:513:0x07be, B:517:0x0f3f), top: B:2:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0430 A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:7:0x003e, B:8:0x005e, B:11:0x0076, B:14:0x00a4, B:16:0x00e1, B:19:0x00fa, B:21:0x0104, B:24:0x0712, B:25:0x0132, B:28:0x0144, B:30:0x014a, B:34:0x018e, B:36:0x01a0, B:39:0x01c7, B:41:0x01cd, B:43:0x01dd, B:45:0x01eb, B:47:0x01fb, B:49:0x0206, B:54:0x0209, B:57:0x0221, B:63:0x0252, B:66:0x025c, B:68:0x026a, B:70:0x02c6, B:71:0x028e, B:73:0x029e, B:81:0x02d5, B:83:0x02ff, B:84:0x0327, B:86:0x035c, B:87:0x0362, B:90:0x036e, B:92:0x03a3, B:93:0x03c0, B:95:0x03c6, B:97:0x03d4, B:99:0x03e8, B:100:0x03dc, B:108:0x03ef, B:111:0x03f6, B:112:0x0415, B:114:0x0430, B:115:0x043c, B:118:0x0446, B:122:0x0469, B:123:0x0458, B:132:0x04e3, B:134:0x04ef, B:137:0x0500, B:139:0x0511, B:141:0x051d, B:143:0x05e2, B:145:0x05e8, B:146:0x05f4, B:148:0x05fa, B:150:0x060a, B:152:0x0614, B:153:0x0627, B:155:0x062d, B:156:0x0646, B:158:0x064c, B:160:0x066a, B:162:0x0678, B:164:0x069f, B:165:0x067e, B:167:0x068a, B:171:0x06a6, B:172:0x06c3, B:174:0x06c9, B:177:0x06dc, B:182:0x06e9, B:184:0x06f0, B:186:0x06fe, B:193:0x0538, B:195:0x0546, B:198:0x0557, B:200:0x0568, B:202:0x0574, B:204:0x0583, B:206:0x0592, B:209:0x059e, B:211:0x05a8, B:213:0x05b2, B:216:0x05bd, B:218:0x05c3, B:222:0x05d3, B:220:0x05de, B:224:0x0471, B:226:0x047d, B:228:0x0489, B:232:0x04cd, B:233:0x04a5, B:236:0x04b7, B:238:0x04bd, B:240:0x04c7, B:247:0x0154, B:249:0x0161, B:251:0x016f, B:253:0x0175, B:256:0x0180, B:261:0x072b, B:263:0x073d, B:265:0x0746, B:267:0x0776, B:268:0x074e, B:270:0x0757, B:272:0x075d, B:274:0x0769, B:276:0x0771, B:283:0x0779, B:284:0x0785, B:287:0x078d, B:290:0x079f, B:291:0x07aa, B:293:0x07b2, B:294:0x07e1, B:296:0x07fd, B:297:0x0812, B:299:0x082e, B:300:0x0843, B:301:0x085f, B:303:0x0865, B:305:0x087d, B:306:0x088b, B:308:0x089b, B:310:0x08a9, B:313:0x08ac, B:315:0x08f6, B:317:0x08fc, B:318:0x0927, B:320:0x092f, B:321:0x094d, B:323:0x0953, B:324:0x0967, B:326:0x097e, B:328:0x098f, B:330:0x09a1, B:332:0x09ab, B:333:0x09ae, B:335:0x0a09, B:336:0x0a1c, B:339:0x0a24, B:342:0x0a43, B:344:0x0a5c, B:346:0x0a71, B:348:0x0a76, B:350:0x0a7a, B:352:0x0a7e, B:354:0x0a88, B:355:0x0a91, B:357:0x0a95, B:359:0x0a9b, B:360:0x0aa6, B:361:0x0ab4, B:364:0x0d1b, B:368:0x0abd, B:432:0x0adb, B:371:0x0af8, B:373:0x0b18, B:374:0x0b20, B:376:0x0b26, B:380:0x0b38, B:383:0x0b4e, B:385:0x0b64, B:386:0x0b87, B:388:0x0b93, B:390:0x0ba9, B:391:0x0be9, B:396:0x0c05, B:398:0x0c10, B:400:0x0c14, B:402:0x0c18, B:404:0x0c1c, B:405:0x0c28, B:406:0x0c2d, B:408:0x0c33, B:410:0x0c4b, B:411:0x0c50, B:412:0x0d18, B:414:0x0c8f, B:416:0x0c94, B:419:0x0ca8, B:421:0x0cc7, B:422:0x0cce, B:425:0x0d0c, B:426:0x0c99, B:435:0x0ae1, B:437:0x0d26, B:439:0x0d33, B:440:0x0d47, B:441:0x0d4f, B:443:0x0d55, B:445:0x0d6b, B:447:0x0d7d, B:449:0x0e2d, B:451:0x0e33, B:453:0x0e48, B:456:0x0e4f, B:457:0x0e92, B:458:0x0e5e, B:460:0x0e6c, B:461:0x0e79, B:462:0x0ea1, B:463:0x0eba, B:466:0x0ec2, B:468:0x0ec7, B:471:0x0ed7, B:473:0x0ef1, B:474:0x0f0e, B:476:0x0f16, B:477:0x0f36, B:483:0x0f21, B:484:0x0d99, B:486:0x0d9f, B:488:0x0daf, B:489:0x0db6, B:494:0x0dcc, B:495:0x0dd3, B:497:0x0e1e, B:498:0x0e25, B:499:0x0e22, B:500:0x0dd0, B:502:0x0db3, B:504:0x090c, B:506:0x0912, B:508:0x0918, B:509:0x0840, B:510:0x080f, B:511:0x07b8, B:513:0x07be, B:517:0x0f3f), top: B:2:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x04ef A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:7:0x003e, B:8:0x005e, B:11:0x0076, B:14:0x00a4, B:16:0x00e1, B:19:0x00fa, B:21:0x0104, B:24:0x0712, B:25:0x0132, B:28:0x0144, B:30:0x014a, B:34:0x018e, B:36:0x01a0, B:39:0x01c7, B:41:0x01cd, B:43:0x01dd, B:45:0x01eb, B:47:0x01fb, B:49:0x0206, B:54:0x0209, B:57:0x0221, B:63:0x0252, B:66:0x025c, B:68:0x026a, B:70:0x02c6, B:71:0x028e, B:73:0x029e, B:81:0x02d5, B:83:0x02ff, B:84:0x0327, B:86:0x035c, B:87:0x0362, B:90:0x036e, B:92:0x03a3, B:93:0x03c0, B:95:0x03c6, B:97:0x03d4, B:99:0x03e8, B:100:0x03dc, B:108:0x03ef, B:111:0x03f6, B:112:0x0415, B:114:0x0430, B:115:0x043c, B:118:0x0446, B:122:0x0469, B:123:0x0458, B:132:0x04e3, B:134:0x04ef, B:137:0x0500, B:139:0x0511, B:141:0x051d, B:143:0x05e2, B:145:0x05e8, B:146:0x05f4, B:148:0x05fa, B:150:0x060a, B:152:0x0614, B:153:0x0627, B:155:0x062d, B:156:0x0646, B:158:0x064c, B:160:0x066a, B:162:0x0678, B:164:0x069f, B:165:0x067e, B:167:0x068a, B:171:0x06a6, B:172:0x06c3, B:174:0x06c9, B:177:0x06dc, B:182:0x06e9, B:184:0x06f0, B:186:0x06fe, B:193:0x0538, B:195:0x0546, B:198:0x0557, B:200:0x0568, B:202:0x0574, B:204:0x0583, B:206:0x0592, B:209:0x059e, B:211:0x05a8, B:213:0x05b2, B:216:0x05bd, B:218:0x05c3, B:222:0x05d3, B:220:0x05de, B:224:0x0471, B:226:0x047d, B:228:0x0489, B:232:0x04cd, B:233:0x04a5, B:236:0x04b7, B:238:0x04bd, B:240:0x04c7, B:247:0x0154, B:249:0x0161, B:251:0x016f, B:253:0x0175, B:256:0x0180, B:261:0x072b, B:263:0x073d, B:265:0x0746, B:267:0x0776, B:268:0x074e, B:270:0x0757, B:272:0x075d, B:274:0x0769, B:276:0x0771, B:283:0x0779, B:284:0x0785, B:287:0x078d, B:290:0x079f, B:291:0x07aa, B:293:0x07b2, B:294:0x07e1, B:296:0x07fd, B:297:0x0812, B:299:0x082e, B:300:0x0843, B:301:0x085f, B:303:0x0865, B:305:0x087d, B:306:0x088b, B:308:0x089b, B:310:0x08a9, B:313:0x08ac, B:315:0x08f6, B:317:0x08fc, B:318:0x0927, B:320:0x092f, B:321:0x094d, B:323:0x0953, B:324:0x0967, B:326:0x097e, B:328:0x098f, B:330:0x09a1, B:332:0x09ab, B:333:0x09ae, B:335:0x0a09, B:336:0x0a1c, B:339:0x0a24, B:342:0x0a43, B:344:0x0a5c, B:346:0x0a71, B:348:0x0a76, B:350:0x0a7a, B:352:0x0a7e, B:354:0x0a88, B:355:0x0a91, B:357:0x0a95, B:359:0x0a9b, B:360:0x0aa6, B:361:0x0ab4, B:364:0x0d1b, B:368:0x0abd, B:432:0x0adb, B:371:0x0af8, B:373:0x0b18, B:374:0x0b20, B:376:0x0b26, B:380:0x0b38, B:383:0x0b4e, B:385:0x0b64, B:386:0x0b87, B:388:0x0b93, B:390:0x0ba9, B:391:0x0be9, B:396:0x0c05, B:398:0x0c10, B:400:0x0c14, B:402:0x0c18, B:404:0x0c1c, B:405:0x0c28, B:406:0x0c2d, B:408:0x0c33, B:410:0x0c4b, B:411:0x0c50, B:412:0x0d18, B:414:0x0c8f, B:416:0x0c94, B:419:0x0ca8, B:421:0x0cc7, B:422:0x0cce, B:425:0x0d0c, B:426:0x0c99, B:435:0x0ae1, B:437:0x0d26, B:439:0x0d33, B:440:0x0d47, B:441:0x0d4f, B:443:0x0d55, B:445:0x0d6b, B:447:0x0d7d, B:449:0x0e2d, B:451:0x0e33, B:453:0x0e48, B:456:0x0e4f, B:457:0x0e92, B:458:0x0e5e, B:460:0x0e6c, B:461:0x0e79, B:462:0x0ea1, B:463:0x0eba, B:466:0x0ec2, B:468:0x0ec7, B:471:0x0ed7, B:473:0x0ef1, B:474:0x0f0e, B:476:0x0f16, B:477:0x0f36, B:483:0x0f21, B:484:0x0d99, B:486:0x0d9f, B:488:0x0daf, B:489:0x0db6, B:494:0x0dcc, B:495:0x0dd3, B:497:0x0e1e, B:498:0x0e25, B:499:0x0e22, B:500:0x0dd0, B:502:0x0db3, B:504:0x090c, B:506:0x0912, B:508:0x0918, B:509:0x0840, B:510:0x080f, B:511:0x07b8, B:513:0x07be, B:517:0x0f3f), top: B:2:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x05e8 A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:7:0x003e, B:8:0x005e, B:11:0x0076, B:14:0x00a4, B:16:0x00e1, B:19:0x00fa, B:21:0x0104, B:24:0x0712, B:25:0x0132, B:28:0x0144, B:30:0x014a, B:34:0x018e, B:36:0x01a0, B:39:0x01c7, B:41:0x01cd, B:43:0x01dd, B:45:0x01eb, B:47:0x01fb, B:49:0x0206, B:54:0x0209, B:57:0x0221, B:63:0x0252, B:66:0x025c, B:68:0x026a, B:70:0x02c6, B:71:0x028e, B:73:0x029e, B:81:0x02d5, B:83:0x02ff, B:84:0x0327, B:86:0x035c, B:87:0x0362, B:90:0x036e, B:92:0x03a3, B:93:0x03c0, B:95:0x03c6, B:97:0x03d4, B:99:0x03e8, B:100:0x03dc, B:108:0x03ef, B:111:0x03f6, B:112:0x0415, B:114:0x0430, B:115:0x043c, B:118:0x0446, B:122:0x0469, B:123:0x0458, B:132:0x04e3, B:134:0x04ef, B:137:0x0500, B:139:0x0511, B:141:0x051d, B:143:0x05e2, B:145:0x05e8, B:146:0x05f4, B:148:0x05fa, B:150:0x060a, B:152:0x0614, B:153:0x0627, B:155:0x062d, B:156:0x0646, B:158:0x064c, B:160:0x066a, B:162:0x0678, B:164:0x069f, B:165:0x067e, B:167:0x068a, B:171:0x06a6, B:172:0x06c3, B:174:0x06c9, B:177:0x06dc, B:182:0x06e9, B:184:0x06f0, B:186:0x06fe, B:193:0x0538, B:195:0x0546, B:198:0x0557, B:200:0x0568, B:202:0x0574, B:204:0x0583, B:206:0x0592, B:209:0x059e, B:211:0x05a8, B:213:0x05b2, B:216:0x05bd, B:218:0x05c3, B:222:0x05d3, B:220:0x05de, B:224:0x0471, B:226:0x047d, B:228:0x0489, B:232:0x04cd, B:233:0x04a5, B:236:0x04b7, B:238:0x04bd, B:240:0x04c7, B:247:0x0154, B:249:0x0161, B:251:0x016f, B:253:0x0175, B:256:0x0180, B:261:0x072b, B:263:0x073d, B:265:0x0746, B:267:0x0776, B:268:0x074e, B:270:0x0757, B:272:0x075d, B:274:0x0769, B:276:0x0771, B:283:0x0779, B:284:0x0785, B:287:0x078d, B:290:0x079f, B:291:0x07aa, B:293:0x07b2, B:294:0x07e1, B:296:0x07fd, B:297:0x0812, B:299:0x082e, B:300:0x0843, B:301:0x085f, B:303:0x0865, B:305:0x087d, B:306:0x088b, B:308:0x089b, B:310:0x08a9, B:313:0x08ac, B:315:0x08f6, B:317:0x08fc, B:318:0x0927, B:320:0x092f, B:321:0x094d, B:323:0x0953, B:324:0x0967, B:326:0x097e, B:328:0x098f, B:330:0x09a1, B:332:0x09ab, B:333:0x09ae, B:335:0x0a09, B:336:0x0a1c, B:339:0x0a24, B:342:0x0a43, B:344:0x0a5c, B:346:0x0a71, B:348:0x0a76, B:350:0x0a7a, B:352:0x0a7e, B:354:0x0a88, B:355:0x0a91, B:357:0x0a95, B:359:0x0a9b, B:360:0x0aa6, B:361:0x0ab4, B:364:0x0d1b, B:368:0x0abd, B:432:0x0adb, B:371:0x0af8, B:373:0x0b18, B:374:0x0b20, B:376:0x0b26, B:380:0x0b38, B:383:0x0b4e, B:385:0x0b64, B:386:0x0b87, B:388:0x0b93, B:390:0x0ba9, B:391:0x0be9, B:396:0x0c05, B:398:0x0c10, B:400:0x0c14, B:402:0x0c18, B:404:0x0c1c, B:405:0x0c28, B:406:0x0c2d, B:408:0x0c33, B:410:0x0c4b, B:411:0x0c50, B:412:0x0d18, B:414:0x0c8f, B:416:0x0c94, B:419:0x0ca8, B:421:0x0cc7, B:422:0x0cce, B:425:0x0d0c, B:426:0x0c99, B:435:0x0ae1, B:437:0x0d26, B:439:0x0d33, B:440:0x0d47, B:441:0x0d4f, B:443:0x0d55, B:445:0x0d6b, B:447:0x0d7d, B:449:0x0e2d, B:451:0x0e33, B:453:0x0e48, B:456:0x0e4f, B:457:0x0e92, B:458:0x0e5e, B:460:0x0e6c, B:461:0x0e79, B:462:0x0ea1, B:463:0x0eba, B:466:0x0ec2, B:468:0x0ec7, B:471:0x0ed7, B:473:0x0ef1, B:474:0x0f0e, B:476:0x0f16, B:477:0x0f36, B:483:0x0f21, B:484:0x0d99, B:486:0x0d9f, B:488:0x0daf, B:489:0x0db6, B:494:0x0dcc, B:495:0x0dd3, B:497:0x0e1e, B:498:0x0e25, B:499:0x0e22, B:500:0x0dd0, B:502:0x0db3, B:504:0x090c, B:506:0x0912, B:508:0x0918, B:509:0x0840, B:510:0x080f, B:511:0x07b8, B:513:0x07be, B:517:0x0f3f), top: B:2:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x06fc  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0538 A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:7:0x003e, B:8:0x005e, B:11:0x0076, B:14:0x00a4, B:16:0x00e1, B:19:0x00fa, B:21:0x0104, B:24:0x0712, B:25:0x0132, B:28:0x0144, B:30:0x014a, B:34:0x018e, B:36:0x01a0, B:39:0x01c7, B:41:0x01cd, B:43:0x01dd, B:45:0x01eb, B:47:0x01fb, B:49:0x0206, B:54:0x0209, B:57:0x0221, B:63:0x0252, B:66:0x025c, B:68:0x026a, B:70:0x02c6, B:71:0x028e, B:73:0x029e, B:81:0x02d5, B:83:0x02ff, B:84:0x0327, B:86:0x035c, B:87:0x0362, B:90:0x036e, B:92:0x03a3, B:93:0x03c0, B:95:0x03c6, B:97:0x03d4, B:99:0x03e8, B:100:0x03dc, B:108:0x03ef, B:111:0x03f6, B:112:0x0415, B:114:0x0430, B:115:0x043c, B:118:0x0446, B:122:0x0469, B:123:0x0458, B:132:0x04e3, B:134:0x04ef, B:137:0x0500, B:139:0x0511, B:141:0x051d, B:143:0x05e2, B:145:0x05e8, B:146:0x05f4, B:148:0x05fa, B:150:0x060a, B:152:0x0614, B:153:0x0627, B:155:0x062d, B:156:0x0646, B:158:0x064c, B:160:0x066a, B:162:0x0678, B:164:0x069f, B:165:0x067e, B:167:0x068a, B:171:0x06a6, B:172:0x06c3, B:174:0x06c9, B:177:0x06dc, B:182:0x06e9, B:184:0x06f0, B:186:0x06fe, B:193:0x0538, B:195:0x0546, B:198:0x0557, B:200:0x0568, B:202:0x0574, B:204:0x0583, B:206:0x0592, B:209:0x059e, B:211:0x05a8, B:213:0x05b2, B:216:0x05bd, B:218:0x05c3, B:222:0x05d3, B:220:0x05de, B:224:0x0471, B:226:0x047d, B:228:0x0489, B:232:0x04cd, B:233:0x04a5, B:236:0x04b7, B:238:0x04bd, B:240:0x04c7, B:247:0x0154, B:249:0x0161, B:251:0x016f, B:253:0x0175, B:256:0x0180, B:261:0x072b, B:263:0x073d, B:265:0x0746, B:267:0x0776, B:268:0x074e, B:270:0x0757, B:272:0x075d, B:274:0x0769, B:276:0x0771, B:283:0x0779, B:284:0x0785, B:287:0x078d, B:290:0x079f, B:291:0x07aa, B:293:0x07b2, B:294:0x07e1, B:296:0x07fd, B:297:0x0812, B:299:0x082e, B:300:0x0843, B:301:0x085f, B:303:0x0865, B:305:0x087d, B:306:0x088b, B:308:0x089b, B:310:0x08a9, B:313:0x08ac, B:315:0x08f6, B:317:0x08fc, B:318:0x0927, B:320:0x092f, B:321:0x094d, B:323:0x0953, B:324:0x0967, B:326:0x097e, B:328:0x098f, B:330:0x09a1, B:332:0x09ab, B:333:0x09ae, B:335:0x0a09, B:336:0x0a1c, B:339:0x0a24, B:342:0x0a43, B:344:0x0a5c, B:346:0x0a71, B:348:0x0a76, B:350:0x0a7a, B:352:0x0a7e, B:354:0x0a88, B:355:0x0a91, B:357:0x0a95, B:359:0x0a9b, B:360:0x0aa6, B:361:0x0ab4, B:364:0x0d1b, B:368:0x0abd, B:432:0x0adb, B:371:0x0af8, B:373:0x0b18, B:374:0x0b20, B:376:0x0b26, B:380:0x0b38, B:383:0x0b4e, B:385:0x0b64, B:386:0x0b87, B:388:0x0b93, B:390:0x0ba9, B:391:0x0be9, B:396:0x0c05, B:398:0x0c10, B:400:0x0c14, B:402:0x0c18, B:404:0x0c1c, B:405:0x0c28, B:406:0x0c2d, B:408:0x0c33, B:410:0x0c4b, B:411:0x0c50, B:412:0x0d18, B:414:0x0c8f, B:416:0x0c94, B:419:0x0ca8, B:421:0x0cc7, B:422:0x0cce, B:425:0x0d0c, B:426:0x0c99, B:435:0x0ae1, B:437:0x0d26, B:439:0x0d33, B:440:0x0d47, B:441:0x0d4f, B:443:0x0d55, B:445:0x0d6b, B:447:0x0d7d, B:449:0x0e2d, B:451:0x0e33, B:453:0x0e48, B:456:0x0e4f, B:457:0x0e92, B:458:0x0e5e, B:460:0x0e6c, B:461:0x0e79, B:462:0x0ea1, B:463:0x0eba, B:466:0x0ec2, B:468:0x0ec7, B:471:0x0ed7, B:473:0x0ef1, B:474:0x0f0e, B:476:0x0f16, B:477:0x0f36, B:483:0x0f21, B:484:0x0d99, B:486:0x0d9f, B:488:0x0daf, B:489:0x0db6, B:494:0x0dcc, B:495:0x0dd3, B:497:0x0e1e, B:498:0x0e25, B:499:0x0e22, B:500:0x0dd0, B:502:0x0db3, B:504:0x090c, B:506:0x0912, B:508:0x0918, B:509:0x0840, B:510:0x080f, B:511:0x07b8, B:513:0x07be, B:517:0x0f3f), top: B:2:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01a0 A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:7:0x003e, B:8:0x005e, B:11:0x0076, B:14:0x00a4, B:16:0x00e1, B:19:0x00fa, B:21:0x0104, B:24:0x0712, B:25:0x0132, B:28:0x0144, B:30:0x014a, B:34:0x018e, B:36:0x01a0, B:39:0x01c7, B:41:0x01cd, B:43:0x01dd, B:45:0x01eb, B:47:0x01fb, B:49:0x0206, B:54:0x0209, B:57:0x0221, B:63:0x0252, B:66:0x025c, B:68:0x026a, B:70:0x02c6, B:71:0x028e, B:73:0x029e, B:81:0x02d5, B:83:0x02ff, B:84:0x0327, B:86:0x035c, B:87:0x0362, B:90:0x036e, B:92:0x03a3, B:93:0x03c0, B:95:0x03c6, B:97:0x03d4, B:99:0x03e8, B:100:0x03dc, B:108:0x03ef, B:111:0x03f6, B:112:0x0415, B:114:0x0430, B:115:0x043c, B:118:0x0446, B:122:0x0469, B:123:0x0458, B:132:0x04e3, B:134:0x04ef, B:137:0x0500, B:139:0x0511, B:141:0x051d, B:143:0x05e2, B:145:0x05e8, B:146:0x05f4, B:148:0x05fa, B:150:0x060a, B:152:0x0614, B:153:0x0627, B:155:0x062d, B:156:0x0646, B:158:0x064c, B:160:0x066a, B:162:0x0678, B:164:0x069f, B:165:0x067e, B:167:0x068a, B:171:0x06a6, B:172:0x06c3, B:174:0x06c9, B:177:0x06dc, B:182:0x06e9, B:184:0x06f0, B:186:0x06fe, B:193:0x0538, B:195:0x0546, B:198:0x0557, B:200:0x0568, B:202:0x0574, B:204:0x0583, B:206:0x0592, B:209:0x059e, B:211:0x05a8, B:213:0x05b2, B:216:0x05bd, B:218:0x05c3, B:222:0x05d3, B:220:0x05de, B:224:0x0471, B:226:0x047d, B:228:0x0489, B:232:0x04cd, B:233:0x04a5, B:236:0x04b7, B:238:0x04bd, B:240:0x04c7, B:247:0x0154, B:249:0x0161, B:251:0x016f, B:253:0x0175, B:256:0x0180, B:261:0x072b, B:263:0x073d, B:265:0x0746, B:267:0x0776, B:268:0x074e, B:270:0x0757, B:272:0x075d, B:274:0x0769, B:276:0x0771, B:283:0x0779, B:284:0x0785, B:287:0x078d, B:290:0x079f, B:291:0x07aa, B:293:0x07b2, B:294:0x07e1, B:296:0x07fd, B:297:0x0812, B:299:0x082e, B:300:0x0843, B:301:0x085f, B:303:0x0865, B:305:0x087d, B:306:0x088b, B:308:0x089b, B:310:0x08a9, B:313:0x08ac, B:315:0x08f6, B:317:0x08fc, B:318:0x0927, B:320:0x092f, B:321:0x094d, B:323:0x0953, B:324:0x0967, B:326:0x097e, B:328:0x098f, B:330:0x09a1, B:332:0x09ab, B:333:0x09ae, B:335:0x0a09, B:336:0x0a1c, B:339:0x0a24, B:342:0x0a43, B:344:0x0a5c, B:346:0x0a71, B:348:0x0a76, B:350:0x0a7a, B:352:0x0a7e, B:354:0x0a88, B:355:0x0a91, B:357:0x0a95, B:359:0x0a9b, B:360:0x0aa6, B:361:0x0ab4, B:364:0x0d1b, B:368:0x0abd, B:432:0x0adb, B:371:0x0af8, B:373:0x0b18, B:374:0x0b20, B:376:0x0b26, B:380:0x0b38, B:383:0x0b4e, B:385:0x0b64, B:386:0x0b87, B:388:0x0b93, B:390:0x0ba9, B:391:0x0be9, B:396:0x0c05, B:398:0x0c10, B:400:0x0c14, B:402:0x0c18, B:404:0x0c1c, B:405:0x0c28, B:406:0x0c2d, B:408:0x0c33, B:410:0x0c4b, B:411:0x0c50, B:412:0x0d18, B:414:0x0c8f, B:416:0x0c94, B:419:0x0ca8, B:421:0x0cc7, B:422:0x0cce, B:425:0x0d0c, B:426:0x0c99, B:435:0x0ae1, B:437:0x0d26, B:439:0x0d33, B:440:0x0d47, B:441:0x0d4f, B:443:0x0d55, B:445:0x0d6b, B:447:0x0d7d, B:449:0x0e2d, B:451:0x0e33, B:453:0x0e48, B:456:0x0e4f, B:457:0x0e92, B:458:0x0e5e, B:460:0x0e6c, B:461:0x0e79, B:462:0x0ea1, B:463:0x0eba, B:466:0x0ec2, B:468:0x0ec7, B:471:0x0ed7, B:473:0x0ef1, B:474:0x0f0e, B:476:0x0f16, B:477:0x0f36, B:483:0x0f21, B:484:0x0d99, B:486:0x0d9f, B:488:0x0daf, B:489:0x0db6, B:494:0x0dcc, B:495:0x0dd3, B:497:0x0e1e, B:498:0x0e25, B:499:0x0e22, B:500:0x0dd0, B:502:0x0db3, B:504:0x090c, B:506:0x0912, B:508:0x0918, B:509:0x0840, B:510:0x080f, B:511:0x07b8, B:513:0x07be, B:517:0x0f3f), top: B:2:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:373:0x0b18 A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:7:0x003e, B:8:0x005e, B:11:0x0076, B:14:0x00a4, B:16:0x00e1, B:19:0x00fa, B:21:0x0104, B:24:0x0712, B:25:0x0132, B:28:0x0144, B:30:0x014a, B:34:0x018e, B:36:0x01a0, B:39:0x01c7, B:41:0x01cd, B:43:0x01dd, B:45:0x01eb, B:47:0x01fb, B:49:0x0206, B:54:0x0209, B:57:0x0221, B:63:0x0252, B:66:0x025c, B:68:0x026a, B:70:0x02c6, B:71:0x028e, B:73:0x029e, B:81:0x02d5, B:83:0x02ff, B:84:0x0327, B:86:0x035c, B:87:0x0362, B:90:0x036e, B:92:0x03a3, B:93:0x03c0, B:95:0x03c6, B:97:0x03d4, B:99:0x03e8, B:100:0x03dc, B:108:0x03ef, B:111:0x03f6, B:112:0x0415, B:114:0x0430, B:115:0x043c, B:118:0x0446, B:122:0x0469, B:123:0x0458, B:132:0x04e3, B:134:0x04ef, B:137:0x0500, B:139:0x0511, B:141:0x051d, B:143:0x05e2, B:145:0x05e8, B:146:0x05f4, B:148:0x05fa, B:150:0x060a, B:152:0x0614, B:153:0x0627, B:155:0x062d, B:156:0x0646, B:158:0x064c, B:160:0x066a, B:162:0x0678, B:164:0x069f, B:165:0x067e, B:167:0x068a, B:171:0x06a6, B:172:0x06c3, B:174:0x06c9, B:177:0x06dc, B:182:0x06e9, B:184:0x06f0, B:186:0x06fe, B:193:0x0538, B:195:0x0546, B:198:0x0557, B:200:0x0568, B:202:0x0574, B:204:0x0583, B:206:0x0592, B:209:0x059e, B:211:0x05a8, B:213:0x05b2, B:216:0x05bd, B:218:0x05c3, B:222:0x05d3, B:220:0x05de, B:224:0x0471, B:226:0x047d, B:228:0x0489, B:232:0x04cd, B:233:0x04a5, B:236:0x04b7, B:238:0x04bd, B:240:0x04c7, B:247:0x0154, B:249:0x0161, B:251:0x016f, B:253:0x0175, B:256:0x0180, B:261:0x072b, B:263:0x073d, B:265:0x0746, B:267:0x0776, B:268:0x074e, B:270:0x0757, B:272:0x075d, B:274:0x0769, B:276:0x0771, B:283:0x0779, B:284:0x0785, B:287:0x078d, B:290:0x079f, B:291:0x07aa, B:293:0x07b2, B:294:0x07e1, B:296:0x07fd, B:297:0x0812, B:299:0x082e, B:300:0x0843, B:301:0x085f, B:303:0x0865, B:305:0x087d, B:306:0x088b, B:308:0x089b, B:310:0x08a9, B:313:0x08ac, B:315:0x08f6, B:317:0x08fc, B:318:0x0927, B:320:0x092f, B:321:0x094d, B:323:0x0953, B:324:0x0967, B:326:0x097e, B:328:0x098f, B:330:0x09a1, B:332:0x09ab, B:333:0x09ae, B:335:0x0a09, B:336:0x0a1c, B:339:0x0a24, B:342:0x0a43, B:344:0x0a5c, B:346:0x0a71, B:348:0x0a76, B:350:0x0a7a, B:352:0x0a7e, B:354:0x0a88, B:355:0x0a91, B:357:0x0a95, B:359:0x0a9b, B:360:0x0aa6, B:361:0x0ab4, B:364:0x0d1b, B:368:0x0abd, B:432:0x0adb, B:371:0x0af8, B:373:0x0b18, B:374:0x0b20, B:376:0x0b26, B:380:0x0b38, B:383:0x0b4e, B:385:0x0b64, B:386:0x0b87, B:388:0x0b93, B:390:0x0ba9, B:391:0x0be9, B:396:0x0c05, B:398:0x0c10, B:400:0x0c14, B:402:0x0c18, B:404:0x0c1c, B:405:0x0c28, B:406:0x0c2d, B:408:0x0c33, B:410:0x0c4b, B:411:0x0c50, B:412:0x0d18, B:414:0x0c8f, B:416:0x0c94, B:419:0x0ca8, B:421:0x0cc7, B:422:0x0cce, B:425:0x0d0c, B:426:0x0c99, B:435:0x0ae1, B:437:0x0d26, B:439:0x0d33, B:440:0x0d47, B:441:0x0d4f, B:443:0x0d55, B:445:0x0d6b, B:447:0x0d7d, B:449:0x0e2d, B:451:0x0e33, B:453:0x0e48, B:456:0x0e4f, B:457:0x0e92, B:458:0x0e5e, B:460:0x0e6c, B:461:0x0e79, B:462:0x0ea1, B:463:0x0eba, B:466:0x0ec2, B:468:0x0ec7, B:471:0x0ed7, B:473:0x0ef1, B:474:0x0f0e, B:476:0x0f16, B:477:0x0f36, B:483:0x0f21, B:484:0x0d99, B:486:0x0d9f, B:488:0x0daf, B:489:0x0db6, B:494:0x0dcc, B:495:0x0dd3, B:497:0x0e1e, B:498:0x0e25, B:499:0x0e22, B:500:0x0dd0, B:502:0x0db3, B:504:0x090c, B:506:0x0912, B:508:0x0918, B:509:0x0840, B:510:0x080f, B:511:0x07b8, B:513:0x07be, B:517:0x0f3f), top: B:2:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:385:0x0b64 A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:7:0x003e, B:8:0x005e, B:11:0x0076, B:14:0x00a4, B:16:0x00e1, B:19:0x00fa, B:21:0x0104, B:24:0x0712, B:25:0x0132, B:28:0x0144, B:30:0x014a, B:34:0x018e, B:36:0x01a0, B:39:0x01c7, B:41:0x01cd, B:43:0x01dd, B:45:0x01eb, B:47:0x01fb, B:49:0x0206, B:54:0x0209, B:57:0x0221, B:63:0x0252, B:66:0x025c, B:68:0x026a, B:70:0x02c6, B:71:0x028e, B:73:0x029e, B:81:0x02d5, B:83:0x02ff, B:84:0x0327, B:86:0x035c, B:87:0x0362, B:90:0x036e, B:92:0x03a3, B:93:0x03c0, B:95:0x03c6, B:97:0x03d4, B:99:0x03e8, B:100:0x03dc, B:108:0x03ef, B:111:0x03f6, B:112:0x0415, B:114:0x0430, B:115:0x043c, B:118:0x0446, B:122:0x0469, B:123:0x0458, B:132:0x04e3, B:134:0x04ef, B:137:0x0500, B:139:0x0511, B:141:0x051d, B:143:0x05e2, B:145:0x05e8, B:146:0x05f4, B:148:0x05fa, B:150:0x060a, B:152:0x0614, B:153:0x0627, B:155:0x062d, B:156:0x0646, B:158:0x064c, B:160:0x066a, B:162:0x0678, B:164:0x069f, B:165:0x067e, B:167:0x068a, B:171:0x06a6, B:172:0x06c3, B:174:0x06c9, B:177:0x06dc, B:182:0x06e9, B:184:0x06f0, B:186:0x06fe, B:193:0x0538, B:195:0x0546, B:198:0x0557, B:200:0x0568, B:202:0x0574, B:204:0x0583, B:206:0x0592, B:209:0x059e, B:211:0x05a8, B:213:0x05b2, B:216:0x05bd, B:218:0x05c3, B:222:0x05d3, B:220:0x05de, B:224:0x0471, B:226:0x047d, B:228:0x0489, B:232:0x04cd, B:233:0x04a5, B:236:0x04b7, B:238:0x04bd, B:240:0x04c7, B:247:0x0154, B:249:0x0161, B:251:0x016f, B:253:0x0175, B:256:0x0180, B:261:0x072b, B:263:0x073d, B:265:0x0746, B:267:0x0776, B:268:0x074e, B:270:0x0757, B:272:0x075d, B:274:0x0769, B:276:0x0771, B:283:0x0779, B:284:0x0785, B:287:0x078d, B:290:0x079f, B:291:0x07aa, B:293:0x07b2, B:294:0x07e1, B:296:0x07fd, B:297:0x0812, B:299:0x082e, B:300:0x0843, B:301:0x085f, B:303:0x0865, B:305:0x087d, B:306:0x088b, B:308:0x089b, B:310:0x08a9, B:313:0x08ac, B:315:0x08f6, B:317:0x08fc, B:318:0x0927, B:320:0x092f, B:321:0x094d, B:323:0x0953, B:324:0x0967, B:326:0x097e, B:328:0x098f, B:330:0x09a1, B:332:0x09ab, B:333:0x09ae, B:335:0x0a09, B:336:0x0a1c, B:339:0x0a24, B:342:0x0a43, B:344:0x0a5c, B:346:0x0a71, B:348:0x0a76, B:350:0x0a7a, B:352:0x0a7e, B:354:0x0a88, B:355:0x0a91, B:357:0x0a95, B:359:0x0a9b, B:360:0x0aa6, B:361:0x0ab4, B:364:0x0d1b, B:368:0x0abd, B:432:0x0adb, B:371:0x0af8, B:373:0x0b18, B:374:0x0b20, B:376:0x0b26, B:380:0x0b38, B:383:0x0b4e, B:385:0x0b64, B:386:0x0b87, B:388:0x0b93, B:390:0x0ba9, B:391:0x0be9, B:396:0x0c05, B:398:0x0c10, B:400:0x0c14, B:402:0x0c18, B:404:0x0c1c, B:405:0x0c28, B:406:0x0c2d, B:408:0x0c33, B:410:0x0c4b, B:411:0x0c50, B:412:0x0d18, B:414:0x0c8f, B:416:0x0c94, B:419:0x0ca8, B:421:0x0cc7, B:422:0x0cce, B:425:0x0d0c, B:426:0x0c99, B:435:0x0ae1, B:437:0x0d26, B:439:0x0d33, B:440:0x0d47, B:441:0x0d4f, B:443:0x0d55, B:445:0x0d6b, B:447:0x0d7d, B:449:0x0e2d, B:451:0x0e33, B:453:0x0e48, B:456:0x0e4f, B:457:0x0e92, B:458:0x0e5e, B:460:0x0e6c, B:461:0x0e79, B:462:0x0ea1, B:463:0x0eba, B:466:0x0ec2, B:468:0x0ec7, B:471:0x0ed7, B:473:0x0ef1, B:474:0x0f0e, B:476:0x0f16, B:477:0x0f36, B:483:0x0f21, B:484:0x0d99, B:486:0x0d9f, B:488:0x0daf, B:489:0x0db6, B:494:0x0dcc, B:495:0x0dd3, B:497:0x0e1e, B:498:0x0e25, B:499:0x0e22, B:500:0x0dd0, B:502:0x0db3, B:504:0x090c, B:506:0x0912, B:508:0x0918, B:509:0x0840, B:510:0x080f, B:511:0x07b8, B:513:0x07be, B:517:0x0f3f), top: B:2:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:386:0x0b87 A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:7:0x003e, B:8:0x005e, B:11:0x0076, B:14:0x00a4, B:16:0x00e1, B:19:0x00fa, B:21:0x0104, B:24:0x0712, B:25:0x0132, B:28:0x0144, B:30:0x014a, B:34:0x018e, B:36:0x01a0, B:39:0x01c7, B:41:0x01cd, B:43:0x01dd, B:45:0x01eb, B:47:0x01fb, B:49:0x0206, B:54:0x0209, B:57:0x0221, B:63:0x0252, B:66:0x025c, B:68:0x026a, B:70:0x02c6, B:71:0x028e, B:73:0x029e, B:81:0x02d5, B:83:0x02ff, B:84:0x0327, B:86:0x035c, B:87:0x0362, B:90:0x036e, B:92:0x03a3, B:93:0x03c0, B:95:0x03c6, B:97:0x03d4, B:99:0x03e8, B:100:0x03dc, B:108:0x03ef, B:111:0x03f6, B:112:0x0415, B:114:0x0430, B:115:0x043c, B:118:0x0446, B:122:0x0469, B:123:0x0458, B:132:0x04e3, B:134:0x04ef, B:137:0x0500, B:139:0x0511, B:141:0x051d, B:143:0x05e2, B:145:0x05e8, B:146:0x05f4, B:148:0x05fa, B:150:0x060a, B:152:0x0614, B:153:0x0627, B:155:0x062d, B:156:0x0646, B:158:0x064c, B:160:0x066a, B:162:0x0678, B:164:0x069f, B:165:0x067e, B:167:0x068a, B:171:0x06a6, B:172:0x06c3, B:174:0x06c9, B:177:0x06dc, B:182:0x06e9, B:184:0x06f0, B:186:0x06fe, B:193:0x0538, B:195:0x0546, B:198:0x0557, B:200:0x0568, B:202:0x0574, B:204:0x0583, B:206:0x0592, B:209:0x059e, B:211:0x05a8, B:213:0x05b2, B:216:0x05bd, B:218:0x05c3, B:222:0x05d3, B:220:0x05de, B:224:0x0471, B:226:0x047d, B:228:0x0489, B:232:0x04cd, B:233:0x04a5, B:236:0x04b7, B:238:0x04bd, B:240:0x04c7, B:247:0x0154, B:249:0x0161, B:251:0x016f, B:253:0x0175, B:256:0x0180, B:261:0x072b, B:263:0x073d, B:265:0x0746, B:267:0x0776, B:268:0x074e, B:270:0x0757, B:272:0x075d, B:274:0x0769, B:276:0x0771, B:283:0x0779, B:284:0x0785, B:287:0x078d, B:290:0x079f, B:291:0x07aa, B:293:0x07b2, B:294:0x07e1, B:296:0x07fd, B:297:0x0812, B:299:0x082e, B:300:0x0843, B:301:0x085f, B:303:0x0865, B:305:0x087d, B:306:0x088b, B:308:0x089b, B:310:0x08a9, B:313:0x08ac, B:315:0x08f6, B:317:0x08fc, B:318:0x0927, B:320:0x092f, B:321:0x094d, B:323:0x0953, B:324:0x0967, B:326:0x097e, B:328:0x098f, B:330:0x09a1, B:332:0x09ab, B:333:0x09ae, B:335:0x0a09, B:336:0x0a1c, B:339:0x0a24, B:342:0x0a43, B:344:0x0a5c, B:346:0x0a71, B:348:0x0a76, B:350:0x0a7a, B:352:0x0a7e, B:354:0x0a88, B:355:0x0a91, B:357:0x0a95, B:359:0x0a9b, B:360:0x0aa6, B:361:0x0ab4, B:364:0x0d1b, B:368:0x0abd, B:432:0x0adb, B:371:0x0af8, B:373:0x0b18, B:374:0x0b20, B:376:0x0b26, B:380:0x0b38, B:383:0x0b4e, B:385:0x0b64, B:386:0x0b87, B:388:0x0b93, B:390:0x0ba9, B:391:0x0be9, B:396:0x0c05, B:398:0x0c10, B:400:0x0c14, B:402:0x0c18, B:404:0x0c1c, B:405:0x0c28, B:406:0x0c2d, B:408:0x0c33, B:410:0x0c4b, B:411:0x0c50, B:412:0x0d18, B:414:0x0c8f, B:416:0x0c94, B:419:0x0ca8, B:421:0x0cc7, B:422:0x0cce, B:425:0x0d0c, B:426:0x0c99, B:435:0x0ae1, B:437:0x0d26, B:439:0x0d33, B:440:0x0d47, B:441:0x0d4f, B:443:0x0d55, B:445:0x0d6b, B:447:0x0d7d, B:449:0x0e2d, B:451:0x0e33, B:453:0x0e48, B:456:0x0e4f, B:457:0x0e92, B:458:0x0e5e, B:460:0x0e6c, B:461:0x0e79, B:462:0x0ea1, B:463:0x0eba, B:466:0x0ec2, B:468:0x0ec7, B:471:0x0ed7, B:473:0x0ef1, B:474:0x0f0e, B:476:0x0f16, B:477:0x0f36, B:483:0x0f21, B:484:0x0d99, B:486:0x0d9f, B:488:0x0daf, B:489:0x0db6, B:494:0x0dcc, B:495:0x0dd3, B:497:0x0e1e, B:498:0x0e25, B:499:0x0e22, B:500:0x0dd0, B:502:0x0db3, B:504:0x090c, B:506:0x0912, B:508:0x0918, B:509:0x0840, B:510:0x080f, B:511:0x07b8, B:513:0x07be, B:517:0x0f3f), top: B:2:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:451:0x0e33 A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:7:0x003e, B:8:0x005e, B:11:0x0076, B:14:0x00a4, B:16:0x00e1, B:19:0x00fa, B:21:0x0104, B:24:0x0712, B:25:0x0132, B:28:0x0144, B:30:0x014a, B:34:0x018e, B:36:0x01a0, B:39:0x01c7, B:41:0x01cd, B:43:0x01dd, B:45:0x01eb, B:47:0x01fb, B:49:0x0206, B:54:0x0209, B:57:0x0221, B:63:0x0252, B:66:0x025c, B:68:0x026a, B:70:0x02c6, B:71:0x028e, B:73:0x029e, B:81:0x02d5, B:83:0x02ff, B:84:0x0327, B:86:0x035c, B:87:0x0362, B:90:0x036e, B:92:0x03a3, B:93:0x03c0, B:95:0x03c6, B:97:0x03d4, B:99:0x03e8, B:100:0x03dc, B:108:0x03ef, B:111:0x03f6, B:112:0x0415, B:114:0x0430, B:115:0x043c, B:118:0x0446, B:122:0x0469, B:123:0x0458, B:132:0x04e3, B:134:0x04ef, B:137:0x0500, B:139:0x0511, B:141:0x051d, B:143:0x05e2, B:145:0x05e8, B:146:0x05f4, B:148:0x05fa, B:150:0x060a, B:152:0x0614, B:153:0x0627, B:155:0x062d, B:156:0x0646, B:158:0x064c, B:160:0x066a, B:162:0x0678, B:164:0x069f, B:165:0x067e, B:167:0x068a, B:171:0x06a6, B:172:0x06c3, B:174:0x06c9, B:177:0x06dc, B:182:0x06e9, B:184:0x06f0, B:186:0x06fe, B:193:0x0538, B:195:0x0546, B:198:0x0557, B:200:0x0568, B:202:0x0574, B:204:0x0583, B:206:0x0592, B:209:0x059e, B:211:0x05a8, B:213:0x05b2, B:216:0x05bd, B:218:0x05c3, B:222:0x05d3, B:220:0x05de, B:224:0x0471, B:226:0x047d, B:228:0x0489, B:232:0x04cd, B:233:0x04a5, B:236:0x04b7, B:238:0x04bd, B:240:0x04c7, B:247:0x0154, B:249:0x0161, B:251:0x016f, B:253:0x0175, B:256:0x0180, B:261:0x072b, B:263:0x073d, B:265:0x0746, B:267:0x0776, B:268:0x074e, B:270:0x0757, B:272:0x075d, B:274:0x0769, B:276:0x0771, B:283:0x0779, B:284:0x0785, B:287:0x078d, B:290:0x079f, B:291:0x07aa, B:293:0x07b2, B:294:0x07e1, B:296:0x07fd, B:297:0x0812, B:299:0x082e, B:300:0x0843, B:301:0x085f, B:303:0x0865, B:305:0x087d, B:306:0x088b, B:308:0x089b, B:310:0x08a9, B:313:0x08ac, B:315:0x08f6, B:317:0x08fc, B:318:0x0927, B:320:0x092f, B:321:0x094d, B:323:0x0953, B:324:0x0967, B:326:0x097e, B:328:0x098f, B:330:0x09a1, B:332:0x09ab, B:333:0x09ae, B:335:0x0a09, B:336:0x0a1c, B:339:0x0a24, B:342:0x0a43, B:344:0x0a5c, B:346:0x0a71, B:348:0x0a76, B:350:0x0a7a, B:352:0x0a7e, B:354:0x0a88, B:355:0x0a91, B:357:0x0a95, B:359:0x0a9b, B:360:0x0aa6, B:361:0x0ab4, B:364:0x0d1b, B:368:0x0abd, B:432:0x0adb, B:371:0x0af8, B:373:0x0b18, B:374:0x0b20, B:376:0x0b26, B:380:0x0b38, B:383:0x0b4e, B:385:0x0b64, B:386:0x0b87, B:388:0x0b93, B:390:0x0ba9, B:391:0x0be9, B:396:0x0c05, B:398:0x0c10, B:400:0x0c14, B:402:0x0c18, B:404:0x0c1c, B:405:0x0c28, B:406:0x0c2d, B:408:0x0c33, B:410:0x0c4b, B:411:0x0c50, B:412:0x0d18, B:414:0x0c8f, B:416:0x0c94, B:419:0x0ca8, B:421:0x0cc7, B:422:0x0cce, B:425:0x0d0c, B:426:0x0c99, B:435:0x0ae1, B:437:0x0d26, B:439:0x0d33, B:440:0x0d47, B:441:0x0d4f, B:443:0x0d55, B:445:0x0d6b, B:447:0x0d7d, B:449:0x0e2d, B:451:0x0e33, B:453:0x0e48, B:456:0x0e4f, B:457:0x0e92, B:458:0x0e5e, B:460:0x0e6c, B:461:0x0e79, B:462:0x0ea1, B:463:0x0eba, B:466:0x0ec2, B:468:0x0ec7, B:471:0x0ed7, B:473:0x0ef1, B:474:0x0f0e, B:476:0x0f16, B:477:0x0f36, B:483:0x0f21, B:484:0x0d99, B:486:0x0d9f, B:488:0x0daf, B:489:0x0db6, B:494:0x0dcc, B:495:0x0dd3, B:497:0x0e1e, B:498:0x0e25, B:499:0x0e22, B:500:0x0dd0, B:502:0x0db3, B:504:0x090c, B:506:0x0912, B:508:0x0918, B:509:0x0840, B:510:0x080f, B:511:0x07b8, B:513:0x07be, B:517:0x0f3f), top: B:2:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:465:0x0ec0  */
    /* JADX WARN: Removed duplicated region for block: B:473:0x0ef1 A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:7:0x003e, B:8:0x005e, B:11:0x0076, B:14:0x00a4, B:16:0x00e1, B:19:0x00fa, B:21:0x0104, B:24:0x0712, B:25:0x0132, B:28:0x0144, B:30:0x014a, B:34:0x018e, B:36:0x01a0, B:39:0x01c7, B:41:0x01cd, B:43:0x01dd, B:45:0x01eb, B:47:0x01fb, B:49:0x0206, B:54:0x0209, B:57:0x0221, B:63:0x0252, B:66:0x025c, B:68:0x026a, B:70:0x02c6, B:71:0x028e, B:73:0x029e, B:81:0x02d5, B:83:0x02ff, B:84:0x0327, B:86:0x035c, B:87:0x0362, B:90:0x036e, B:92:0x03a3, B:93:0x03c0, B:95:0x03c6, B:97:0x03d4, B:99:0x03e8, B:100:0x03dc, B:108:0x03ef, B:111:0x03f6, B:112:0x0415, B:114:0x0430, B:115:0x043c, B:118:0x0446, B:122:0x0469, B:123:0x0458, B:132:0x04e3, B:134:0x04ef, B:137:0x0500, B:139:0x0511, B:141:0x051d, B:143:0x05e2, B:145:0x05e8, B:146:0x05f4, B:148:0x05fa, B:150:0x060a, B:152:0x0614, B:153:0x0627, B:155:0x062d, B:156:0x0646, B:158:0x064c, B:160:0x066a, B:162:0x0678, B:164:0x069f, B:165:0x067e, B:167:0x068a, B:171:0x06a6, B:172:0x06c3, B:174:0x06c9, B:177:0x06dc, B:182:0x06e9, B:184:0x06f0, B:186:0x06fe, B:193:0x0538, B:195:0x0546, B:198:0x0557, B:200:0x0568, B:202:0x0574, B:204:0x0583, B:206:0x0592, B:209:0x059e, B:211:0x05a8, B:213:0x05b2, B:216:0x05bd, B:218:0x05c3, B:222:0x05d3, B:220:0x05de, B:224:0x0471, B:226:0x047d, B:228:0x0489, B:232:0x04cd, B:233:0x04a5, B:236:0x04b7, B:238:0x04bd, B:240:0x04c7, B:247:0x0154, B:249:0x0161, B:251:0x016f, B:253:0x0175, B:256:0x0180, B:261:0x072b, B:263:0x073d, B:265:0x0746, B:267:0x0776, B:268:0x074e, B:270:0x0757, B:272:0x075d, B:274:0x0769, B:276:0x0771, B:283:0x0779, B:284:0x0785, B:287:0x078d, B:290:0x079f, B:291:0x07aa, B:293:0x07b2, B:294:0x07e1, B:296:0x07fd, B:297:0x0812, B:299:0x082e, B:300:0x0843, B:301:0x085f, B:303:0x0865, B:305:0x087d, B:306:0x088b, B:308:0x089b, B:310:0x08a9, B:313:0x08ac, B:315:0x08f6, B:317:0x08fc, B:318:0x0927, B:320:0x092f, B:321:0x094d, B:323:0x0953, B:324:0x0967, B:326:0x097e, B:328:0x098f, B:330:0x09a1, B:332:0x09ab, B:333:0x09ae, B:335:0x0a09, B:336:0x0a1c, B:339:0x0a24, B:342:0x0a43, B:344:0x0a5c, B:346:0x0a71, B:348:0x0a76, B:350:0x0a7a, B:352:0x0a7e, B:354:0x0a88, B:355:0x0a91, B:357:0x0a95, B:359:0x0a9b, B:360:0x0aa6, B:361:0x0ab4, B:364:0x0d1b, B:368:0x0abd, B:432:0x0adb, B:371:0x0af8, B:373:0x0b18, B:374:0x0b20, B:376:0x0b26, B:380:0x0b38, B:383:0x0b4e, B:385:0x0b64, B:386:0x0b87, B:388:0x0b93, B:390:0x0ba9, B:391:0x0be9, B:396:0x0c05, B:398:0x0c10, B:400:0x0c14, B:402:0x0c18, B:404:0x0c1c, B:405:0x0c28, B:406:0x0c2d, B:408:0x0c33, B:410:0x0c4b, B:411:0x0c50, B:412:0x0d18, B:414:0x0c8f, B:416:0x0c94, B:419:0x0ca8, B:421:0x0cc7, B:422:0x0cce, B:425:0x0d0c, B:426:0x0c99, B:435:0x0ae1, B:437:0x0d26, B:439:0x0d33, B:440:0x0d47, B:441:0x0d4f, B:443:0x0d55, B:445:0x0d6b, B:447:0x0d7d, B:449:0x0e2d, B:451:0x0e33, B:453:0x0e48, B:456:0x0e4f, B:457:0x0e92, B:458:0x0e5e, B:460:0x0e6c, B:461:0x0e79, B:462:0x0ea1, B:463:0x0eba, B:466:0x0ec2, B:468:0x0ec7, B:471:0x0ed7, B:473:0x0ef1, B:474:0x0f0e, B:476:0x0f16, B:477:0x0f36, B:483:0x0f21, B:484:0x0d99, B:486:0x0d9f, B:488:0x0daf, B:489:0x0db6, B:494:0x0dcc, B:495:0x0dd3, B:497:0x0e1e, B:498:0x0e25, B:499:0x0e22, B:500:0x0dd0, B:502:0x0db3, B:504:0x090c, B:506:0x0912, B:508:0x0918, B:509:0x0840, B:510:0x080f, B:511:0x07b8, B:513:0x07be, B:517:0x0f3f), top: B:2:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0221 A[Catch: all -> 0x0121, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:7:0x003e, B:8:0x005e, B:11:0x0076, B:14:0x00a4, B:16:0x00e1, B:19:0x00fa, B:21:0x0104, B:24:0x0712, B:25:0x0132, B:28:0x0144, B:30:0x014a, B:34:0x018e, B:36:0x01a0, B:39:0x01c7, B:41:0x01cd, B:43:0x01dd, B:45:0x01eb, B:47:0x01fb, B:49:0x0206, B:54:0x0209, B:57:0x0221, B:63:0x0252, B:66:0x025c, B:68:0x026a, B:70:0x02c6, B:71:0x028e, B:73:0x029e, B:81:0x02d5, B:83:0x02ff, B:84:0x0327, B:86:0x035c, B:87:0x0362, B:90:0x036e, B:92:0x03a3, B:93:0x03c0, B:95:0x03c6, B:97:0x03d4, B:99:0x03e8, B:100:0x03dc, B:108:0x03ef, B:111:0x03f6, B:112:0x0415, B:114:0x0430, B:115:0x043c, B:118:0x0446, B:122:0x0469, B:123:0x0458, B:132:0x04e3, B:134:0x04ef, B:137:0x0500, B:139:0x0511, B:141:0x051d, B:143:0x05e2, B:145:0x05e8, B:146:0x05f4, B:148:0x05fa, B:150:0x060a, B:152:0x0614, B:153:0x0627, B:155:0x062d, B:156:0x0646, B:158:0x064c, B:160:0x066a, B:162:0x0678, B:164:0x069f, B:165:0x067e, B:167:0x068a, B:171:0x06a6, B:172:0x06c3, B:174:0x06c9, B:177:0x06dc, B:182:0x06e9, B:184:0x06f0, B:186:0x06fe, B:193:0x0538, B:195:0x0546, B:198:0x0557, B:200:0x0568, B:202:0x0574, B:204:0x0583, B:206:0x0592, B:209:0x059e, B:211:0x05a8, B:213:0x05b2, B:216:0x05bd, B:218:0x05c3, B:222:0x05d3, B:220:0x05de, B:224:0x0471, B:226:0x047d, B:228:0x0489, B:232:0x04cd, B:233:0x04a5, B:236:0x04b7, B:238:0x04bd, B:240:0x04c7, B:247:0x0154, B:249:0x0161, B:251:0x016f, B:253:0x0175, B:256:0x0180, B:261:0x072b, B:263:0x073d, B:265:0x0746, B:267:0x0776, B:268:0x074e, B:270:0x0757, B:272:0x075d, B:274:0x0769, B:276:0x0771, B:283:0x0779, B:284:0x0785, B:287:0x078d, B:290:0x079f, B:291:0x07aa, B:293:0x07b2, B:294:0x07e1, B:296:0x07fd, B:297:0x0812, B:299:0x082e, B:300:0x0843, B:301:0x085f, B:303:0x0865, B:305:0x087d, B:306:0x088b, B:308:0x089b, B:310:0x08a9, B:313:0x08ac, B:315:0x08f6, B:317:0x08fc, B:318:0x0927, B:320:0x092f, B:321:0x094d, B:323:0x0953, B:324:0x0967, B:326:0x097e, B:328:0x098f, B:330:0x09a1, B:332:0x09ab, B:333:0x09ae, B:335:0x0a09, B:336:0x0a1c, B:339:0x0a24, B:342:0x0a43, B:344:0x0a5c, B:346:0x0a71, B:348:0x0a76, B:350:0x0a7a, B:352:0x0a7e, B:354:0x0a88, B:355:0x0a91, B:357:0x0a95, B:359:0x0a9b, B:360:0x0aa6, B:361:0x0ab4, B:364:0x0d1b, B:368:0x0abd, B:432:0x0adb, B:371:0x0af8, B:373:0x0b18, B:374:0x0b20, B:376:0x0b26, B:380:0x0b38, B:383:0x0b4e, B:385:0x0b64, B:386:0x0b87, B:388:0x0b93, B:390:0x0ba9, B:391:0x0be9, B:396:0x0c05, B:398:0x0c10, B:400:0x0c14, B:402:0x0c18, B:404:0x0c1c, B:405:0x0c28, B:406:0x0c2d, B:408:0x0c33, B:410:0x0c4b, B:411:0x0c50, B:412:0x0d18, B:414:0x0c8f, B:416:0x0c94, B:419:0x0ca8, B:421:0x0cc7, B:422:0x0cce, B:425:0x0d0c, B:426:0x0c99, B:435:0x0ae1, B:437:0x0d26, B:439:0x0d33, B:440:0x0d47, B:441:0x0d4f, B:443:0x0d55, B:445:0x0d6b, B:447:0x0d7d, B:449:0x0e2d, B:451:0x0e33, B:453:0x0e48, B:456:0x0e4f, B:457:0x0e92, B:458:0x0e5e, B:460:0x0e6c, B:461:0x0e79, B:462:0x0ea1, B:463:0x0eba, B:466:0x0ec2, B:468:0x0ec7, B:471:0x0ed7, B:473:0x0ef1, B:474:0x0f0e, B:476:0x0f16, B:477:0x0f36, B:483:0x0f21, B:484:0x0d99, B:486:0x0d9f, B:488:0x0daf, B:489:0x0db6, B:494:0x0dcc, B:495:0x0dd3, B:497:0x0e1e, B:498:0x0e25, B:499:0x0e22, B:500:0x0dd0, B:502:0x0db3, B:504:0x090c, B:506:0x0912, B:508:0x0918, B:509:0x0840, B:510:0x080f, B:511:0x07b8, B:513:0x07be, B:517:0x0f3f), top: B:2:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x025c A[Catch: all -> 0x0121, TRY_ENTER, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:7:0x003e, B:8:0x005e, B:11:0x0076, B:14:0x00a4, B:16:0x00e1, B:19:0x00fa, B:21:0x0104, B:24:0x0712, B:25:0x0132, B:28:0x0144, B:30:0x014a, B:34:0x018e, B:36:0x01a0, B:39:0x01c7, B:41:0x01cd, B:43:0x01dd, B:45:0x01eb, B:47:0x01fb, B:49:0x0206, B:54:0x0209, B:57:0x0221, B:63:0x0252, B:66:0x025c, B:68:0x026a, B:70:0x02c6, B:71:0x028e, B:73:0x029e, B:81:0x02d5, B:83:0x02ff, B:84:0x0327, B:86:0x035c, B:87:0x0362, B:90:0x036e, B:92:0x03a3, B:93:0x03c0, B:95:0x03c6, B:97:0x03d4, B:99:0x03e8, B:100:0x03dc, B:108:0x03ef, B:111:0x03f6, B:112:0x0415, B:114:0x0430, B:115:0x043c, B:118:0x0446, B:122:0x0469, B:123:0x0458, B:132:0x04e3, B:134:0x04ef, B:137:0x0500, B:139:0x0511, B:141:0x051d, B:143:0x05e2, B:145:0x05e8, B:146:0x05f4, B:148:0x05fa, B:150:0x060a, B:152:0x0614, B:153:0x0627, B:155:0x062d, B:156:0x0646, B:158:0x064c, B:160:0x066a, B:162:0x0678, B:164:0x069f, B:165:0x067e, B:167:0x068a, B:171:0x06a6, B:172:0x06c3, B:174:0x06c9, B:177:0x06dc, B:182:0x06e9, B:184:0x06f0, B:186:0x06fe, B:193:0x0538, B:195:0x0546, B:198:0x0557, B:200:0x0568, B:202:0x0574, B:204:0x0583, B:206:0x0592, B:209:0x059e, B:211:0x05a8, B:213:0x05b2, B:216:0x05bd, B:218:0x05c3, B:222:0x05d3, B:220:0x05de, B:224:0x0471, B:226:0x047d, B:228:0x0489, B:232:0x04cd, B:233:0x04a5, B:236:0x04b7, B:238:0x04bd, B:240:0x04c7, B:247:0x0154, B:249:0x0161, B:251:0x016f, B:253:0x0175, B:256:0x0180, B:261:0x072b, B:263:0x073d, B:265:0x0746, B:267:0x0776, B:268:0x074e, B:270:0x0757, B:272:0x075d, B:274:0x0769, B:276:0x0771, B:283:0x0779, B:284:0x0785, B:287:0x078d, B:290:0x079f, B:291:0x07aa, B:293:0x07b2, B:294:0x07e1, B:296:0x07fd, B:297:0x0812, B:299:0x082e, B:300:0x0843, B:301:0x085f, B:303:0x0865, B:305:0x087d, B:306:0x088b, B:308:0x089b, B:310:0x08a9, B:313:0x08ac, B:315:0x08f6, B:317:0x08fc, B:318:0x0927, B:320:0x092f, B:321:0x094d, B:323:0x0953, B:324:0x0967, B:326:0x097e, B:328:0x098f, B:330:0x09a1, B:332:0x09ab, B:333:0x09ae, B:335:0x0a09, B:336:0x0a1c, B:339:0x0a24, B:342:0x0a43, B:344:0x0a5c, B:346:0x0a71, B:348:0x0a76, B:350:0x0a7a, B:352:0x0a7e, B:354:0x0a88, B:355:0x0a91, B:357:0x0a95, B:359:0x0a9b, B:360:0x0aa6, B:361:0x0ab4, B:364:0x0d1b, B:368:0x0abd, B:432:0x0adb, B:371:0x0af8, B:373:0x0b18, B:374:0x0b20, B:376:0x0b26, B:380:0x0b38, B:383:0x0b4e, B:385:0x0b64, B:386:0x0b87, B:388:0x0b93, B:390:0x0ba9, B:391:0x0be9, B:396:0x0c05, B:398:0x0c10, B:400:0x0c14, B:402:0x0c18, B:404:0x0c1c, B:405:0x0c28, B:406:0x0c2d, B:408:0x0c33, B:410:0x0c4b, B:411:0x0c50, B:412:0x0d18, B:414:0x0c8f, B:416:0x0c94, B:419:0x0ca8, B:421:0x0cc7, B:422:0x0cce, B:425:0x0d0c, B:426:0x0c99, B:435:0x0ae1, B:437:0x0d26, B:439:0x0d33, B:440:0x0d47, B:441:0x0d4f, B:443:0x0d55, B:445:0x0d6b, B:447:0x0d7d, B:449:0x0e2d, B:451:0x0e33, B:453:0x0e48, B:456:0x0e4f, B:457:0x0e92, B:458:0x0e5e, B:460:0x0e6c, B:461:0x0e79, B:462:0x0ea1, B:463:0x0eba, B:466:0x0ec2, B:468:0x0ec7, B:471:0x0ed7, B:473:0x0ef1, B:474:0x0f0e, B:476:0x0f16, B:477:0x0f36, B:483:0x0f21, B:484:0x0d99, B:486:0x0d9f, B:488:0x0daf, B:489:0x0db6, B:494:0x0dcc, B:495:0x0dd3, B:497:0x0e1e, B:498:0x0e25, B:499:0x0e22, B:500:0x0dd0, B:502:0x0db3, B:504:0x090c, B:506:0x0912, B:508:0x0918, B:509:0x0840, B:510:0x080f, B:511:0x07b8, B:513:0x07be, B:517:0x0f3f), top: B:2:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02cd A[EDGE_INSN: B:77:0x02cd->B:78:0x02cd BREAK  A[LOOP:2: B:63:0x0252->B:70:0x02c6], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02d3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02ff A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:7:0x003e, B:8:0x005e, B:11:0x0076, B:14:0x00a4, B:16:0x00e1, B:19:0x00fa, B:21:0x0104, B:24:0x0712, B:25:0x0132, B:28:0x0144, B:30:0x014a, B:34:0x018e, B:36:0x01a0, B:39:0x01c7, B:41:0x01cd, B:43:0x01dd, B:45:0x01eb, B:47:0x01fb, B:49:0x0206, B:54:0x0209, B:57:0x0221, B:63:0x0252, B:66:0x025c, B:68:0x026a, B:70:0x02c6, B:71:0x028e, B:73:0x029e, B:81:0x02d5, B:83:0x02ff, B:84:0x0327, B:86:0x035c, B:87:0x0362, B:90:0x036e, B:92:0x03a3, B:93:0x03c0, B:95:0x03c6, B:97:0x03d4, B:99:0x03e8, B:100:0x03dc, B:108:0x03ef, B:111:0x03f6, B:112:0x0415, B:114:0x0430, B:115:0x043c, B:118:0x0446, B:122:0x0469, B:123:0x0458, B:132:0x04e3, B:134:0x04ef, B:137:0x0500, B:139:0x0511, B:141:0x051d, B:143:0x05e2, B:145:0x05e8, B:146:0x05f4, B:148:0x05fa, B:150:0x060a, B:152:0x0614, B:153:0x0627, B:155:0x062d, B:156:0x0646, B:158:0x064c, B:160:0x066a, B:162:0x0678, B:164:0x069f, B:165:0x067e, B:167:0x068a, B:171:0x06a6, B:172:0x06c3, B:174:0x06c9, B:177:0x06dc, B:182:0x06e9, B:184:0x06f0, B:186:0x06fe, B:193:0x0538, B:195:0x0546, B:198:0x0557, B:200:0x0568, B:202:0x0574, B:204:0x0583, B:206:0x0592, B:209:0x059e, B:211:0x05a8, B:213:0x05b2, B:216:0x05bd, B:218:0x05c3, B:222:0x05d3, B:220:0x05de, B:224:0x0471, B:226:0x047d, B:228:0x0489, B:232:0x04cd, B:233:0x04a5, B:236:0x04b7, B:238:0x04bd, B:240:0x04c7, B:247:0x0154, B:249:0x0161, B:251:0x016f, B:253:0x0175, B:256:0x0180, B:261:0x072b, B:263:0x073d, B:265:0x0746, B:267:0x0776, B:268:0x074e, B:270:0x0757, B:272:0x075d, B:274:0x0769, B:276:0x0771, B:283:0x0779, B:284:0x0785, B:287:0x078d, B:290:0x079f, B:291:0x07aa, B:293:0x07b2, B:294:0x07e1, B:296:0x07fd, B:297:0x0812, B:299:0x082e, B:300:0x0843, B:301:0x085f, B:303:0x0865, B:305:0x087d, B:306:0x088b, B:308:0x089b, B:310:0x08a9, B:313:0x08ac, B:315:0x08f6, B:317:0x08fc, B:318:0x0927, B:320:0x092f, B:321:0x094d, B:323:0x0953, B:324:0x0967, B:326:0x097e, B:328:0x098f, B:330:0x09a1, B:332:0x09ab, B:333:0x09ae, B:335:0x0a09, B:336:0x0a1c, B:339:0x0a24, B:342:0x0a43, B:344:0x0a5c, B:346:0x0a71, B:348:0x0a76, B:350:0x0a7a, B:352:0x0a7e, B:354:0x0a88, B:355:0x0a91, B:357:0x0a95, B:359:0x0a9b, B:360:0x0aa6, B:361:0x0ab4, B:364:0x0d1b, B:368:0x0abd, B:432:0x0adb, B:371:0x0af8, B:373:0x0b18, B:374:0x0b20, B:376:0x0b26, B:380:0x0b38, B:383:0x0b4e, B:385:0x0b64, B:386:0x0b87, B:388:0x0b93, B:390:0x0ba9, B:391:0x0be9, B:396:0x0c05, B:398:0x0c10, B:400:0x0c14, B:402:0x0c18, B:404:0x0c1c, B:405:0x0c28, B:406:0x0c2d, B:408:0x0c33, B:410:0x0c4b, B:411:0x0c50, B:412:0x0d18, B:414:0x0c8f, B:416:0x0c94, B:419:0x0ca8, B:421:0x0cc7, B:422:0x0cce, B:425:0x0d0c, B:426:0x0c99, B:435:0x0ae1, B:437:0x0d26, B:439:0x0d33, B:440:0x0d47, B:441:0x0d4f, B:443:0x0d55, B:445:0x0d6b, B:447:0x0d7d, B:449:0x0e2d, B:451:0x0e33, B:453:0x0e48, B:456:0x0e4f, B:457:0x0e92, B:458:0x0e5e, B:460:0x0e6c, B:461:0x0e79, B:462:0x0ea1, B:463:0x0eba, B:466:0x0ec2, B:468:0x0ec7, B:471:0x0ed7, B:473:0x0ef1, B:474:0x0f0e, B:476:0x0f16, B:477:0x0f36, B:483:0x0f21, B:484:0x0d99, B:486:0x0d9f, B:488:0x0daf, B:489:0x0db6, B:494:0x0dcc, B:495:0x0dd3, B:497:0x0e1e, B:498:0x0e25, B:499:0x0e22, B:500:0x0dd0, B:502:0x0db3, B:504:0x090c, B:506:0x0912, B:508:0x0918, B:509:0x0840, B:510:0x080f, B:511:0x07b8, B:513:0x07be, B:517:0x0f3f), top: B:2:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x035c A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:7:0x003e, B:8:0x005e, B:11:0x0076, B:14:0x00a4, B:16:0x00e1, B:19:0x00fa, B:21:0x0104, B:24:0x0712, B:25:0x0132, B:28:0x0144, B:30:0x014a, B:34:0x018e, B:36:0x01a0, B:39:0x01c7, B:41:0x01cd, B:43:0x01dd, B:45:0x01eb, B:47:0x01fb, B:49:0x0206, B:54:0x0209, B:57:0x0221, B:63:0x0252, B:66:0x025c, B:68:0x026a, B:70:0x02c6, B:71:0x028e, B:73:0x029e, B:81:0x02d5, B:83:0x02ff, B:84:0x0327, B:86:0x035c, B:87:0x0362, B:90:0x036e, B:92:0x03a3, B:93:0x03c0, B:95:0x03c6, B:97:0x03d4, B:99:0x03e8, B:100:0x03dc, B:108:0x03ef, B:111:0x03f6, B:112:0x0415, B:114:0x0430, B:115:0x043c, B:118:0x0446, B:122:0x0469, B:123:0x0458, B:132:0x04e3, B:134:0x04ef, B:137:0x0500, B:139:0x0511, B:141:0x051d, B:143:0x05e2, B:145:0x05e8, B:146:0x05f4, B:148:0x05fa, B:150:0x060a, B:152:0x0614, B:153:0x0627, B:155:0x062d, B:156:0x0646, B:158:0x064c, B:160:0x066a, B:162:0x0678, B:164:0x069f, B:165:0x067e, B:167:0x068a, B:171:0x06a6, B:172:0x06c3, B:174:0x06c9, B:177:0x06dc, B:182:0x06e9, B:184:0x06f0, B:186:0x06fe, B:193:0x0538, B:195:0x0546, B:198:0x0557, B:200:0x0568, B:202:0x0574, B:204:0x0583, B:206:0x0592, B:209:0x059e, B:211:0x05a8, B:213:0x05b2, B:216:0x05bd, B:218:0x05c3, B:222:0x05d3, B:220:0x05de, B:224:0x0471, B:226:0x047d, B:228:0x0489, B:232:0x04cd, B:233:0x04a5, B:236:0x04b7, B:238:0x04bd, B:240:0x04c7, B:247:0x0154, B:249:0x0161, B:251:0x016f, B:253:0x0175, B:256:0x0180, B:261:0x072b, B:263:0x073d, B:265:0x0746, B:267:0x0776, B:268:0x074e, B:270:0x0757, B:272:0x075d, B:274:0x0769, B:276:0x0771, B:283:0x0779, B:284:0x0785, B:287:0x078d, B:290:0x079f, B:291:0x07aa, B:293:0x07b2, B:294:0x07e1, B:296:0x07fd, B:297:0x0812, B:299:0x082e, B:300:0x0843, B:301:0x085f, B:303:0x0865, B:305:0x087d, B:306:0x088b, B:308:0x089b, B:310:0x08a9, B:313:0x08ac, B:315:0x08f6, B:317:0x08fc, B:318:0x0927, B:320:0x092f, B:321:0x094d, B:323:0x0953, B:324:0x0967, B:326:0x097e, B:328:0x098f, B:330:0x09a1, B:332:0x09ab, B:333:0x09ae, B:335:0x0a09, B:336:0x0a1c, B:339:0x0a24, B:342:0x0a43, B:344:0x0a5c, B:346:0x0a71, B:348:0x0a76, B:350:0x0a7a, B:352:0x0a7e, B:354:0x0a88, B:355:0x0a91, B:357:0x0a95, B:359:0x0a9b, B:360:0x0aa6, B:361:0x0ab4, B:364:0x0d1b, B:368:0x0abd, B:432:0x0adb, B:371:0x0af8, B:373:0x0b18, B:374:0x0b20, B:376:0x0b26, B:380:0x0b38, B:383:0x0b4e, B:385:0x0b64, B:386:0x0b87, B:388:0x0b93, B:390:0x0ba9, B:391:0x0be9, B:396:0x0c05, B:398:0x0c10, B:400:0x0c14, B:402:0x0c18, B:404:0x0c1c, B:405:0x0c28, B:406:0x0c2d, B:408:0x0c33, B:410:0x0c4b, B:411:0x0c50, B:412:0x0d18, B:414:0x0c8f, B:416:0x0c94, B:419:0x0ca8, B:421:0x0cc7, B:422:0x0cce, B:425:0x0d0c, B:426:0x0c99, B:435:0x0ae1, B:437:0x0d26, B:439:0x0d33, B:440:0x0d47, B:441:0x0d4f, B:443:0x0d55, B:445:0x0d6b, B:447:0x0d7d, B:449:0x0e2d, B:451:0x0e33, B:453:0x0e48, B:456:0x0e4f, B:457:0x0e92, B:458:0x0e5e, B:460:0x0e6c, B:461:0x0e79, B:462:0x0ea1, B:463:0x0eba, B:466:0x0ec2, B:468:0x0ec7, B:471:0x0ed7, B:473:0x0ef1, B:474:0x0f0e, B:476:0x0f16, B:477:0x0f36, B:483:0x0f21, B:484:0x0d99, B:486:0x0d9f, B:488:0x0daf, B:489:0x0db6, B:494:0x0dcc, B:495:0x0dd3, B:497:0x0e1e, B:498:0x0e25, B:499:0x0e22, B:500:0x0dd0, B:502:0x0db3, B:504:0x090c, B:506:0x0912, B:508:0x0918, B:509:0x0840, B:510:0x080f, B:511:0x07b8, B:513:0x07be, B:517:0x0f3f), top: B:2:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x036c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x03c6 A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:7:0x003e, B:8:0x005e, B:11:0x0076, B:14:0x00a4, B:16:0x00e1, B:19:0x00fa, B:21:0x0104, B:24:0x0712, B:25:0x0132, B:28:0x0144, B:30:0x014a, B:34:0x018e, B:36:0x01a0, B:39:0x01c7, B:41:0x01cd, B:43:0x01dd, B:45:0x01eb, B:47:0x01fb, B:49:0x0206, B:54:0x0209, B:57:0x0221, B:63:0x0252, B:66:0x025c, B:68:0x026a, B:70:0x02c6, B:71:0x028e, B:73:0x029e, B:81:0x02d5, B:83:0x02ff, B:84:0x0327, B:86:0x035c, B:87:0x0362, B:90:0x036e, B:92:0x03a3, B:93:0x03c0, B:95:0x03c6, B:97:0x03d4, B:99:0x03e8, B:100:0x03dc, B:108:0x03ef, B:111:0x03f6, B:112:0x0415, B:114:0x0430, B:115:0x043c, B:118:0x0446, B:122:0x0469, B:123:0x0458, B:132:0x04e3, B:134:0x04ef, B:137:0x0500, B:139:0x0511, B:141:0x051d, B:143:0x05e2, B:145:0x05e8, B:146:0x05f4, B:148:0x05fa, B:150:0x060a, B:152:0x0614, B:153:0x0627, B:155:0x062d, B:156:0x0646, B:158:0x064c, B:160:0x066a, B:162:0x0678, B:164:0x069f, B:165:0x067e, B:167:0x068a, B:171:0x06a6, B:172:0x06c3, B:174:0x06c9, B:177:0x06dc, B:182:0x06e9, B:184:0x06f0, B:186:0x06fe, B:193:0x0538, B:195:0x0546, B:198:0x0557, B:200:0x0568, B:202:0x0574, B:204:0x0583, B:206:0x0592, B:209:0x059e, B:211:0x05a8, B:213:0x05b2, B:216:0x05bd, B:218:0x05c3, B:222:0x05d3, B:220:0x05de, B:224:0x0471, B:226:0x047d, B:228:0x0489, B:232:0x04cd, B:233:0x04a5, B:236:0x04b7, B:238:0x04bd, B:240:0x04c7, B:247:0x0154, B:249:0x0161, B:251:0x016f, B:253:0x0175, B:256:0x0180, B:261:0x072b, B:263:0x073d, B:265:0x0746, B:267:0x0776, B:268:0x074e, B:270:0x0757, B:272:0x075d, B:274:0x0769, B:276:0x0771, B:283:0x0779, B:284:0x0785, B:287:0x078d, B:290:0x079f, B:291:0x07aa, B:293:0x07b2, B:294:0x07e1, B:296:0x07fd, B:297:0x0812, B:299:0x082e, B:300:0x0843, B:301:0x085f, B:303:0x0865, B:305:0x087d, B:306:0x088b, B:308:0x089b, B:310:0x08a9, B:313:0x08ac, B:315:0x08f6, B:317:0x08fc, B:318:0x0927, B:320:0x092f, B:321:0x094d, B:323:0x0953, B:324:0x0967, B:326:0x097e, B:328:0x098f, B:330:0x09a1, B:332:0x09ab, B:333:0x09ae, B:335:0x0a09, B:336:0x0a1c, B:339:0x0a24, B:342:0x0a43, B:344:0x0a5c, B:346:0x0a71, B:348:0x0a76, B:350:0x0a7a, B:352:0x0a7e, B:354:0x0a88, B:355:0x0a91, B:357:0x0a95, B:359:0x0a9b, B:360:0x0aa6, B:361:0x0ab4, B:364:0x0d1b, B:368:0x0abd, B:432:0x0adb, B:371:0x0af8, B:373:0x0b18, B:374:0x0b20, B:376:0x0b26, B:380:0x0b38, B:383:0x0b4e, B:385:0x0b64, B:386:0x0b87, B:388:0x0b93, B:390:0x0ba9, B:391:0x0be9, B:396:0x0c05, B:398:0x0c10, B:400:0x0c14, B:402:0x0c18, B:404:0x0c1c, B:405:0x0c28, B:406:0x0c2d, B:408:0x0c33, B:410:0x0c4b, B:411:0x0c50, B:412:0x0d18, B:414:0x0c8f, B:416:0x0c94, B:419:0x0ca8, B:421:0x0cc7, B:422:0x0cce, B:425:0x0d0c, B:426:0x0c99, B:435:0x0ae1, B:437:0x0d26, B:439:0x0d33, B:440:0x0d47, B:441:0x0d4f, B:443:0x0d55, B:445:0x0d6b, B:447:0x0d7d, B:449:0x0e2d, B:451:0x0e33, B:453:0x0e48, B:456:0x0e4f, B:457:0x0e92, B:458:0x0e5e, B:460:0x0e6c, B:461:0x0e79, B:462:0x0ea1, B:463:0x0eba, B:466:0x0ec2, B:468:0x0ec7, B:471:0x0ed7, B:473:0x0ef1, B:474:0x0f0e, B:476:0x0f16, B:477:0x0f36, B:483:0x0f21, B:484:0x0d99, B:486:0x0d9f, B:488:0x0daf, B:489:0x0db6, B:494:0x0dcc, B:495:0x0dd3, B:497:0x0e1e, B:498:0x0e25, B:499:0x0e22, B:500:0x0dd0, B:502:0x0db3, B:504:0x090c, B:506:0x0912, B:508:0x0918, B:509:0x0840, B:510:0x080f, B:511:0x07b8, B:513:0x07be, B:517:0x0f3f), top: B:2:0x0019, inners: #1, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean I(long j, String str) {
        boolean z;
        int i;
        Long l;
        pj3 pj3Var;
        long j2;
        int i2;
        ArrayList arrayList;
        int i3;
        int delete;
        Long l2;
        long j3;
        long parseLong;
        long j4;
        int i4;
        HashMap hashMap;
        long o;
        Long l3;
        String str2;
        int i5;
        String str3;
        boolean M;
        boolean z2;
        qj3 qj3Var;
        String str4;
        String str5;
        int i6;
        String str6;
        int i7;
        int i8;
        int i9;
        boolean z3;
        boolean z4;
        int i10;
        boolean z5;
        fj3 fj3Var;
        qj3 qj3Var2;
        oq3 oq3Var = this;
        String str7 = AppEventsConstants.EVENT_PARAM_VALUE_YES;
        String str8 = "_ai";
        String str9 = FirebaseAnalytics.Event.PURCHASE;
        String str10 = FirebaseAnalytics.Param.ITEMS;
        Long l4 = 1L;
        oq3Var.g0().i0();
        try {
            ni3 ni3Var = new ni3(oq3Var);
            oq3Var.g0().e0(str, j, oq3Var.M, ni3Var);
            ArrayList arrayList2 = (ArrayList) ni3Var.d;
            if (arrayList2 == null || arrayList2.isEmpty()) {
                g0().j0();
                z = false;
            } else {
                qj3 qj3Var3 = (qj3) ((sj3) ni3Var.b).i();
                qj3Var3.b();
                ((sj3) qj3Var3.n).a0();
                int i11 = -1;
                int i12 = -1;
                int i13 = 0;
                int i14 = 0;
                boolean z6 = false;
                boolean z7 = false;
                bj3 bj3Var = null;
                bj3 bj3Var2 = null;
                while (true) {
                    int size = ((ArrayList) ni3Var.d).size();
                    i = i14;
                    l = l4;
                    pj3Var = oq3Var.x;
                    if (i13 >= size) {
                        break;
                    }
                    bj3 bj3Var3 = (bj3) ((cj3) ((ArrayList) ni3Var.d).get(i13)).i();
                    int i15 = i13;
                    String str11 = str10;
                    if (oq3Var.f0().L(((sj3) ni3Var.b).p(), bj3Var3.m())) {
                        oq3Var.a().B().d(vh3.E(((sj3) ni3Var.b).p()), pj3Var.n().a(bj3Var3.m()), "Dropping blocked raw event. appId");
                        if (!str7.equals(oq3Var.f0().b(((sj3) ni3Var.b).p(), "measurement.upload.blacklist_internal")) && !str7.equals(oq3Var.f0().b(((sj3) ni3Var.b).p(), "measurement.upload.blacklist_public")) && !"_err".equals(bj3Var3.m())) {
                            oq3Var.k0();
                            zq3.M(oq3Var.V, ((sj3) ni3Var.b).p(), 11, "_ev", bj3Var3.m(), 0);
                        }
                        str2 = str7;
                        str5 = str8;
                        str4 = str9;
                        i14 = i;
                        i7 = i15;
                        str6 = str11;
                    } else {
                        String m = bj3Var3.m();
                        str2 = str7;
                        if (!m.equals(str9) && !m.equals("_iap") && !m.equals("ecommerce_purchase")) {
                            i5 = i11;
                            if (bj3Var3.m().equals(th2.p(str8, s93.p, s93.n))) {
                                bj3Var3.b();
                                ((cj3) bj3Var3.n).F(str8);
                                oq3Var.a().D().b("Renaming ad_impression to _ai");
                                if (Log.isLoggable(oq3Var.a().G(), 5)) {
                                    for (int i16 = 0; i16 < bj3Var3.h(); i16++) {
                                        if (FirebaseAnalytics.Param.AD_PLATFORM.equals(bj3Var3.i(i16).q()) && !bj3Var3.i(i16).s().isEmpty() && "admob".equalsIgnoreCase(bj3Var3.i(i16).s())) {
                                            oq3Var.a().w.b("AdMob ad impression logged from app. Potentially duplicative.");
                                        }
                                    }
                                }
                            }
                            M = oq3Var.f0().M(((sj3) ni3Var.b).p(), bj3Var3.m());
                            if (M) {
                                z2 = M;
                            } else {
                                oq3Var.j0();
                                String m2 = bj3Var3.m();
                                ll3.s(m2);
                                z2 = M;
                                if (m2.hashCode() != 95027 || !m2.equals("_ui")) {
                                    str5 = str8;
                                    str4 = str9;
                                    qj3Var = qj3Var3;
                                    z2 = false;
                                    if (z2) {
                                        ArrayList arrayList3 = new ArrayList(bj3Var3.g());
                                        int i17 = -1;
                                        int i18 = -1;
                                        for (int i19 = 0; i19 < arrayList3.size(); i19++) {
                                            if ("value".equals(((hj3) arrayList3.get(i19)).q())) {
                                                i17 = i19;
                                            } else if (FirebaseAnalytics.Param.CURRENCY.equals(((hj3) arrayList3.get(i19)).q())) {
                                                i18 = i19;
                                            }
                                        }
                                        if (i17 != -1) {
                                            if (((hj3) arrayList3.get(i17)).t() || ((hj3) arrayList3.get(i17)).x()) {
                                                if (i18 != -1) {
                                                    String s = ((hj3) arrayList3.get(i18)).s();
                                                    if (s.length() == 3) {
                                                        int i20 = 0;
                                                        while (i20 < s.length()) {
                                                            int codePointAt = s.codePointAt(i20);
                                                            if (Character.isLetter(codePointAt)) {
                                                                i20 += Character.charCount(codePointAt);
                                                            }
                                                        }
                                                    }
                                                }
                                                oq3Var.a().w.b("Value parameter discarded. You must also supply a 3-letter ISO_4217 currency code in the currency parameter.");
                                                bj3Var3.l(i17);
                                                E(bj3Var3, "_c");
                                                D(bj3Var3, 19, FirebaseAnalytics.Param.CURRENCY);
                                                break;
                                            }
                                            oq3Var.a().w.b("Value must be specified with a numeric type.");
                                            bj3Var3.l(i17);
                                            E(bj3Var3, "_c");
                                            D(bj3Var3, 18, "value");
                                        }
                                        if ("_e".equals(bj3Var3.m())) {
                                            oq3Var.j0();
                                            if (bi3.E("_fr", (cj3) bj3Var3.d()) == null) {
                                                if (bj3Var2 != null && Math.abs(bj3Var2.n() - bj3Var3.n()) <= 1000) {
                                                    bj3 bj3Var4 = (bj3) bj3Var2.clone();
                                                    if (oq3Var.K(bj3Var3, bj3Var4)) {
                                                        qj3Var3 = qj3Var;
                                                        qj3Var3.V(i12, bj3Var4);
                                                        i11 = i5;
                                                        bj3Var = null;
                                                        bj3Var2 = null;
                                                    }
                                                }
                                                qj3Var3 = qj3Var;
                                                bj3Var = bj3Var3;
                                                i11 = i;
                                            } else {
                                                qj3Var3 = qj3Var;
                                                i6 = i5;
                                                i11 = i6;
                                            }
                                        } else {
                                            qj3Var3 = qj3Var;
                                            if ("_vs".equals(bj3Var3.m())) {
                                                oq3Var.j0();
                                                if (bi3.E("_et", (cj3) bj3Var3.d()) == null) {
                                                    if (bj3Var != null && Math.abs(bj3Var.n() - bj3Var3.n()) <= 1000) {
                                                        bj3 bj3Var5 = (bj3) bj3Var.clone();
                                                        if (oq3Var.K(bj3Var5, bj3Var3)) {
                                                            int i21 = i5;
                                                            qj3Var3.V(i21, bj3Var5);
                                                            i11 = i21;
                                                            bj3Var = null;
                                                            bj3Var2 = null;
                                                        }
                                                    }
                                                    i11 = i5;
                                                    bj3Var2 = bj3Var3;
                                                    i12 = i;
                                                }
                                                i6 = i5;
                                                i11 = i6;
                                            } else {
                                                i6 = i5;
                                                if (oq3Var.e0().G(null, ug3.j1) && (("_f".equals(bj3Var3.m()) || "_v".equals(bj3Var3.m())) && ("_f".equals(bj3Var3.m()) || "_v".equals(bj3Var3.m())))) {
                                                    int i22 = 0;
                                                    while (true) {
                                                        if (i22 >= bj3Var3.h()) {
                                                            break;
                                                        }
                                                        hj3 i23 = bj3Var3.i(i22);
                                                        if ("_elt".equals(i23.q())) {
                                                            bj3Var3.p(i23.u());
                                                            bj3Var3.l(i22);
                                                            break;
                                                        }
                                                        i22++;
                                                    }
                                                }
                                                i11 = i6;
                                            }
                                        }
                                        if (bj3Var3.h() != 0) {
                                            oq3Var.j0();
                                            Bundle D = bi3.D(bj3Var3.g());
                                            int i24 = 0;
                                            while (i24 < bj3Var3.h()) {
                                                hj3 i25 = bj3Var3.i(i24);
                                                String str12 = str11;
                                                if (!i25.q().equals(str12) || i25.z().isEmpty()) {
                                                    i8 = i24;
                                                    if (!i25.q().equals(str12)) {
                                                        oq3Var.x(bj3Var3.m(), (fj3) i25.i(), D, ((sj3) ni3Var.b).p());
                                                    }
                                                } else {
                                                    String p = ((sj3) ni3Var.b).p();
                                                    List z8 = i25.z();
                                                    Bundle[] bundleArr = new Bundle[z8.size()];
                                                    int i26 = 0;
                                                    while (i26 < z8.size()) {
                                                        hj3 hj3Var = (hj3) z8.get(i26);
                                                        oq3Var.j0();
                                                        Bundle D2 = bi3.D(hj3Var.z());
                                                        Iterator it = hj3Var.z().iterator();
                                                        while (it.hasNext()) {
                                                            oq3Var.x(bj3Var3.m(), (fj3) ((hj3) it.next()).i(), D2, p);
                                                            i24 = i24;
                                                            z8 = z8;
                                                        }
                                                        bundleArr[i26] = D2;
                                                        i26++;
                                                        i24 = i24;
                                                        z8 = z8;
                                                    }
                                                    i8 = i24;
                                                    D.putParcelableArray(str12, bundleArr);
                                                }
                                                i24 = i8 + 1;
                                                str11 = str12;
                                            }
                                            str6 = str11;
                                            bj3Var3.b();
                                            ((cj3) bj3Var3.n).D();
                                            bi3 j0 = oq3Var.j0();
                                            ArrayList arrayList4 = new ArrayList();
                                            for (String str13 : D.keySet()) {
                                                fj3 B = hj3.B();
                                                B.g(str13);
                                                Object obj = D.get(str13);
                                                if (obj != null) {
                                                    j0.W(B, obj);
                                                    arrayList4.add((hj3) B.d());
                                                }
                                            }
                                            int size2 = arrayList4.size();
                                            int i27 = 0;
                                            while (i27 < size2) {
                                                Object obj2 = arrayList4.get(i27);
                                                i27++;
                                                bj3Var3.j((hj3) obj2);
                                            }
                                        } else {
                                            str6 = str11;
                                        }
                                        i7 = i15;
                                        ((ArrayList) ni3Var.d).set(i7, (cj3) bj3Var3.d());
                                        qj3Var3.W(bj3Var3);
                                        i14 = i + 1;
                                    }
                                    if ("_e".equals(bj3Var3.m())) {
                                    }
                                    if (bj3Var3.h() != 0) {
                                    }
                                    i7 = i15;
                                    ((ArrayList) ni3Var.d).set(i7, (cj3) bj3Var3.d());
                                    qj3Var3.W(bj3Var3);
                                    i14 = i + 1;
                                }
                            }
                            str5 = str8;
                            i9 = 0;
                            z3 = false;
                            z4 = false;
                            while (true) {
                                str4 = str9;
                                if (i9 >= bj3Var3.h()) {
                                    break;
                                }
                                if ("_c".equals(bj3Var3.i(i9).q())) {
                                    fj3 fj3Var2 = (fj3) bj3Var3.i(i9).i();
                                    qj3Var2 = qj3Var3;
                                    fj3Var2.i(1L);
                                    hj3 hj3Var2 = (hj3) fj3Var2.d();
                                    bj3Var3.b();
                                    ((cj3) bj3Var3.n).A(i9, hj3Var2);
                                    z3 = true;
                                } else {
                                    qj3Var2 = qj3Var3;
                                    if ("_r".equals(bj3Var3.i(i9).q())) {
                                        fj3 fj3Var3 = (fj3) bj3Var3.i(i9).i();
                                        fj3Var3.i(1L);
                                        hj3 hj3Var3 = (hj3) fj3Var3.d();
                                        bj3Var3.b();
                                        ((cj3) bj3Var3.n).A(i9, hj3Var3);
                                        z4 = true;
                                        z3 = z3;
                                    }
                                }
                                i9++;
                                str9 = str4;
                                qj3Var3 = qj3Var2;
                            }
                            qj3Var = qj3Var3;
                            if (!z3 && z2) {
                                oq3Var.a().D().c(pj3Var.n().a(bj3Var3.m()), "Marking event as conversion");
                                fj3 B2 = hj3.B();
                                B2.g("_c");
                                B2.i(1L);
                                bj3Var3.k(B2);
                            }
                            if (!z4) {
                                oq3Var.a().D().c(pj3Var.n().a(bj3Var3.m()), "Marking event as real-time");
                                fj3 B3 = hj3.B();
                                B3.g("_r");
                                B3.i(1L);
                                bj3Var3.k(B3);
                            }
                            if (oq3Var.g0().A0(oq3Var.g(), ((sj3) ni3Var.b).p(), false, true, false, false).e > oq3Var.e0().E(((sj3) ni3Var.b).p(), ug3.p)) {
                                E(bj3Var3, "_r");
                            } else {
                                z7 = true;
                            }
                            if (zq3.v0(bj3Var3.m()) && z2 && oq3Var.g0().A0(oq3Var.g(), ((sj3) ni3Var.b).p(), true, false, false, false).c > oq3Var.e0().E(((sj3) ni3Var.b).p(), ug3.o)) {
                                oq3Var.a().B().c(vh3.E(((sj3) ni3Var.b).p()), "Too many conversions. Not logging as conversion. appId");
                                z5 = false;
                                fj3Var = null;
                                int i28 = -1;
                                for (i10 = 0; i10 < bj3Var3.h(); i10++) {
                                    hj3 i29 = bj3Var3.i(i10);
                                    if ("_c".equals(i29.q())) {
                                        fj3Var = (fj3) i29.i();
                                        i28 = i10;
                                    } else if ("_err".equals(i29.q())) {
                                        z5 = true;
                                    }
                                }
                                if (z5) {
                                    if (fj3Var != null) {
                                        bj3Var3.l(i28);
                                    } else {
                                        fj3Var = null;
                                    }
                                }
                                if (fj3Var == null) {
                                    fj3 fj3Var4 = (fj3) fj3Var.clone();
                                    fj3Var4.g("_err");
                                    fj3Var4.i(10L);
                                    hj3 hj3Var4 = (hj3) fj3Var4.d();
                                    bj3Var3.b();
                                    ((cj3) bj3Var3.n).A(i28, hj3Var4);
                                } else {
                                    oq3Var.a().A().c(vh3.E(((sj3) ni3Var.b).p()), "Did not find conversion parameter. appId");
                                }
                            }
                            if (z2) {
                            }
                            if ("_e".equals(bj3Var3.m())) {
                            }
                            if (bj3Var3.h() != 0) {
                            }
                            i7 = i15;
                            ((ArrayList) ni3Var.d).set(i7, (cj3) bj3Var3.d());
                            qj3Var3.W(bj3Var3);
                            i14 = i + 1;
                        }
                        fj3 B4 = hj3.B();
                        i5 = i11;
                        B4.g("_ct");
                        if (!z6) {
                            String p2 = ((sj3) ni3Var.b).p();
                            if (oq3Var.R(p2, str9) && oq3Var.R(p2, "_iap") && oq3Var.R(p2, "ecommerce_purchase")) {
                                str3 = "new";
                                B4.h(str3);
                                bj3Var3.j((hj3) B4.d());
                                z6 = true;
                                if (bj3Var3.m().equals(th2.p(str8, s93.p, s93.n))) {
                                }
                                M = oq3Var.f0().M(((sj3) ni3Var.b).p(), bj3Var3.m());
                                if (M) {
                                }
                                str5 = str8;
                                i9 = 0;
                                z3 = false;
                                z4 = false;
                                while (true) {
                                    str4 = str9;
                                    if (i9 >= bj3Var3.h()) {
                                    }
                                    i9++;
                                    str9 = str4;
                                    qj3Var3 = qj3Var2;
                                }
                                qj3Var = qj3Var3;
                                if (!z3) {
                                    oq3Var.a().D().c(pj3Var.n().a(bj3Var3.m()), "Marking event as conversion");
                                    fj3 B22 = hj3.B();
                                    B22.g("_c");
                                    B22.i(1L);
                                    bj3Var3.k(B22);
                                }
                                if (!z4) {
                                }
                                if (oq3Var.g0().A0(oq3Var.g(), ((sj3) ni3Var.b).p(), false, true, false, false).e > oq3Var.e0().E(((sj3) ni3Var.b).p(), ug3.p)) {
                                }
                                if (zq3.v0(bj3Var3.m())) {
                                    oq3Var.a().B().c(vh3.E(((sj3) ni3Var.b).p()), "Too many conversions. Not logging as conversion. appId");
                                    z5 = false;
                                    fj3Var = null;
                                    int i282 = -1;
                                    while (i10 < bj3Var3.h()) {
                                    }
                                    if (z5) {
                                    }
                                    if (fj3Var == null) {
                                    }
                                }
                                if (z2) {
                                }
                                if ("_e".equals(bj3Var3.m())) {
                                }
                                if (bj3Var3.h() != 0) {
                                }
                                i7 = i15;
                                ((ArrayList) ni3Var.d).set(i7, (cj3) bj3Var3.d());
                                qj3Var3.W(bj3Var3);
                                i14 = i + 1;
                            }
                        }
                        str3 = "returning";
                        B4.h(str3);
                        bj3Var3.j((hj3) B4.d());
                        z6 = true;
                        if (bj3Var3.m().equals(th2.p(str8, s93.p, s93.n))) {
                        }
                        M = oq3Var.f0().M(((sj3) ni3Var.b).p(), bj3Var3.m());
                        if (M) {
                        }
                        str5 = str8;
                        i9 = 0;
                        z3 = false;
                        z4 = false;
                        while (true) {
                            str4 = str9;
                            if (i9 >= bj3Var3.h()) {
                            }
                            i9++;
                            str9 = str4;
                            qj3Var3 = qj3Var2;
                        }
                        qj3Var = qj3Var3;
                        if (!z3) {
                        }
                        if (!z4) {
                        }
                        if (oq3Var.g0().A0(oq3Var.g(), ((sj3) ni3Var.b).p(), false, true, false, false).e > oq3Var.e0().E(((sj3) ni3Var.b).p(), ug3.p)) {
                        }
                        if (zq3.v0(bj3Var3.m())) {
                        }
                        if (z2) {
                        }
                        if ("_e".equals(bj3Var3.m())) {
                        }
                        if (bj3Var3.h() != 0) {
                        }
                        i7 = i15;
                        ((ArrayList) ni3Var.d).set(i7, (cj3) bj3Var3.d());
                        qj3Var3.W(bj3Var3);
                        i14 = i + 1;
                    }
                    i13 = i7 + 1;
                    str10 = str6;
                    l4 = l;
                    str7 = str2;
                    str8 = str5;
                    str9 = str4;
                }
                long j5 = 0;
                long j6 = 0;
                int i30 = i;
                int i31 = 0;
                while (i31 < i30) {
                    cj3 T1 = ((sj3) qj3Var3.n).T1(i31);
                    if ("_e".equals(T1.s())) {
                        oq3Var.j0();
                        if (bi3.E("_fr", T1) != null) {
                            qj3Var3.X(i31);
                            i30--;
                            i31--;
                            i31++;
                        }
                    }
                    oq3Var.j0();
                    hj3 E = bi3.E("_et", T1);
                    if (E != null) {
                        Long valueOf = E.t() ? Long.valueOf(E.u()) : null;
                        if (valueOf != null && valueOf.longValue() > 0) {
                            j6 += valueOf.longValue();
                        }
                    }
                    i31++;
                }
                oq3Var.J(qj3Var3, j6, false);
                Iterator it2 = qj3Var3.T().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if ("_s".equals(((cj3) it2.next()).s())) {
                        oq3Var.g0().o0(qj3Var3.n(), "_se");
                        break;
                    }
                }
                if (bi3.k0("_sid", qj3Var3) >= 0) {
                    oq3Var.J(qj3Var3, j6, true);
                } else {
                    int k0 = bi3.k0("_se", qj3Var3);
                    if (k0 >= 0) {
                        qj3Var3.b();
                        ((sj3) qj3Var3.n).e0(k0);
                        oq3Var.a().A().c(vh3.E(((sj3) ni3Var.b).p()), "Session engagement user property is in the bundle without session ID. appId");
                    }
                }
                String p3 = ((sj3) ni3Var.b).p();
                oq3Var.c().v();
                oq3Var.l0();
                di3 y0 = oq3Var.g0().y0(p3);
                if (y0 == null) {
                    oq3Var.a().A().c(vh3.E(p3), "Cannot fix consent fields without appInfo. appId");
                } else {
                    oq3Var.m(y0, qj3Var3);
                }
                String p4 = ((sj3) ni3Var.b).p();
                oq3Var.c().v();
                oq3Var.l0();
                di3 y02 = oq3Var.g0().y0(p4);
                if (y02 == null) {
                    oq3Var.a().B().c(vh3.E(p4), "Cannot populate ad_campaign_info without appInfo. appId");
                } else {
                    oq3Var.n(y02, qj3Var3);
                }
                qj3Var3.b();
                ((sj3) qj3Var3.n).h0(Long.MAX_VALUE);
                qj3Var3.b();
                ((sj3) qj3Var3.n).i0(Long.MIN_VALUE);
                for (int i32 = 0; i32 < qj3Var3.U(); i32++) {
                    cj3 T12 = ((sj3) qj3Var3.n).T1(i32);
                    if (T12.u() < ((sj3) qj3Var3.n).a2()) {
                        long u = T12.u();
                        qj3Var3.b();
                        ((sj3) qj3Var3.n).h0(u);
                    }
                    if (T12.u() > ((sj3) qj3Var3.n).c2()) {
                        long u2 = T12.u();
                        qj3Var3.b();
                        ((sj3) qj3Var3.n).i0(u2);
                    }
                }
                qj3Var3.L();
                xk3 xk3Var = xk3.c;
                xk3 j7 = oq3Var.b(((sj3) ni3Var.b).p()).j(xk3.c(100, ((sj3) ni3Var.b).u0()));
                xk3 b0 = oq3Var.g0().b0(((sj3) ni3Var.b).p());
                oq3Var.g0().a0(((sj3) ni3Var.b).p(), j7);
                vk3 vk3Var = vk3.ANALYTICS_STORAGE;
                if (!j7.i(vk3Var) && b0.i(vk3Var)) {
                    oq3Var.g0().m0(((sj3) ni3Var.b).p());
                } else if (j7.i(vk3Var) && !b0.i(vk3Var)) {
                    oq3Var.g0().n0(((sj3) ni3Var.b).p());
                }
                vk3 vk3Var2 = vk3.AD_STORAGE;
                if (!j7.i(vk3Var2)) {
                    qj3Var3.b();
                    ((sj3) qj3Var3.n).z1();
                    qj3Var3.b();
                    ((sj3) qj3Var3.n).B1();
                    qj3Var3.b();
                    ((sj3) qj3Var3.n).S0();
                }
                if (!j7.i(vk3Var)) {
                    qj3Var3.b();
                    ((sj3) qj3Var3.n).D1();
                    qj3Var3.b();
                    ((sj3) qj3Var3.n).Z0();
                }
                vr3.a();
                if (oq3Var.e0().G(((sj3) ni3Var.b).p(), ug3.P0)) {
                    oq3Var.k0();
                    if (zq3.T(((sj3) ni3Var.b).p()) && oq3Var.b(((sj3) ni3Var.b).p()).i(vk3Var2) && ((sj3) ni3Var.b).z0()) {
                        oq3Var.w(qj3Var3, ni3Var);
                    }
                }
                qj3Var3.b();
                ((sj3) qj3Var3.n).L1();
                qj3Var3.I(oq3Var.i0().A(qj3Var3.n(), qj3Var3.T(), Collections.unmodifiableList(((sj3) qj3Var3.n).U1()), Long.valueOf(((sj3) qj3Var3.n).a2()), Long.valueOf(((sj3) qj3Var3.n).c2()), !j7.i(vk3Var)));
                if (oq3Var.e0().y(((sj3) ni3Var.b).p())) {
                    HashMap hashMap2 = new HashMap();
                    ArrayList arrayList5 = new ArrayList();
                    SecureRandom u0 = oq3Var.k0().u0();
                    int i33 = 0;
                    while (i33 < qj3Var3.U()) {
                        bj3 bj3Var6 = (bj3) ((sj3) qj3Var3.n).T1(i33).i();
                        if (bj3Var6.m().equals("_ep")) {
                            oq3Var.j0();
                            String str14 = (String) bi3.F("_en", (cj3) bj3Var6.d());
                            gd3 gd3Var = (gd3) hashMap2.get(str14);
                            if (gd3Var == null) {
                                tc3 g0 = oq3Var.g0();
                                String p5 = ((sj3) ni3Var.b).p();
                                ll3.v(str14);
                                gd3Var = g0.U("events", p5, str14);
                                if (gd3Var != null) {
                                    hashMap2.put(str14, gd3Var);
                                }
                            }
                            if (gd3Var == null || gd3Var.i != null) {
                                l2 = l;
                            } else {
                                Long l5 = gd3Var.j;
                                if (l5 != null && l5.longValue() > 1) {
                                    oq3Var.j0();
                                    bi3.C(bj3Var6, "_sr", l5);
                                }
                                Boolean bool = gd3Var.k;
                                if (bool == null || !bool.booleanValue()) {
                                    l2 = l;
                                } else {
                                    oq3Var.j0();
                                    l2 = l;
                                    bi3.C(bj3Var6, "_efs", l2);
                                }
                                arrayList5.add((cj3) bj3Var6.d());
                            }
                            qj3Var3.V(i33, bj3Var6);
                            j3 = j5;
                        } else {
                            l2 = l;
                            dj3 f0 = oq3Var.f0();
                            j3 = j5;
                            String p6 = ((sj3) ni3Var.b).p();
                            String b = f0.b(p6, "measurement.account.time_zone_offset_minutes");
                            if (!TextUtils.isEmpty(b)) {
                                try {
                                    parseLong = Long.parseLong(b);
                                } catch (NumberFormatException e) {
                                    ((pj3) f0.m).a().B().d(vh3.E(p6), e, "Unable to parse timezone offset. appId");
                                }
                                oq3Var.k0();
                                long j8 = parseLong * 60000;
                                long n = (bj3Var6.n() + j8) / 86400000;
                                cj3 cj3Var = (cj3) bj3Var6.d();
                                if (!TextUtils.isEmpty("_dbg")) {
                                    for (hj3 hj3Var5 : cj3Var.p()) {
                                        j4 = j8;
                                        if (!"_dbg".equals(hj3Var5.q())) {
                                            j8 = j4;
                                        } else if (l2.equals(Long.valueOf(hj3Var5.u()))) {
                                            i4 = 1;
                                            if (i4 > 0) {
                                            }
                                        } else {
                                            i4 = f0().N(((sj3) ni3Var.b).p(), bj3Var6.m());
                                            if (i4 > 0) {
                                                a().B().d(bj3Var6.m(), Integer.valueOf(i4), "Sample rate must be positive. event, rate");
                                                arrayList5.add((cj3) bj3Var6.d());
                                                qj3Var3.V(i33, bj3Var6);
                                            } else {
                                                gd3 gd3Var2 = (gd3) hashMap2.get(bj3Var6.m());
                                                if (gd3Var2 == null && (gd3Var2 = g0().U("events", ((sj3) ni3Var.b).p(), bj3Var6.m())) == null) {
                                                    a().B().d(((sj3) ni3Var.b).p(), bj3Var6.m(), "Event being bundled has no eventAggregate. appId, eventName");
                                                    gd3Var2 = new gd3(((sj3) ni3Var.b).p(), bj3Var6.m(), 1L, 1L, 1L, bj3Var6.n(), 0L, null, null, null, null);
                                                }
                                                j0();
                                                Long l6 = (Long) bi3.F("_eid", (cj3) bj3Var6.d());
                                                boolean z9 = l6 != null;
                                                if (i4 == 1) {
                                                    arrayList5.add((cj3) bj3Var6.d());
                                                    if (z9 && (gd3Var2.i != null || gd3Var2.j != null || gd3Var2.k != null)) {
                                                        hashMap2.put(bj3Var6.m(), gd3Var2.b(null, null, null));
                                                    }
                                                    qj3Var3.V(i33, bj3Var6);
                                                } else {
                                                    if (u0.nextInt(i4) == 0) {
                                                        j0();
                                                        HashMap hashMap3 = hashMap2;
                                                        Long valueOf2 = Long.valueOf(i4);
                                                        bi3.C(bj3Var6, "_sr", valueOf2);
                                                        arrayList5.add((cj3) bj3Var6.d());
                                                        if (z9) {
                                                            gd3Var2 = gd3Var2.b(null, valueOf2, null);
                                                        }
                                                        hashMap = hashMap3;
                                                        hashMap.put(bj3Var6.m(), new gd3(gd3Var2.a, gd3Var2.b, gd3Var2.c, gd3Var2.d, gd3Var2.e, gd3Var2.f, bj3Var6.n(), Long.valueOf(n), gd3Var2.i, gd3Var2.j, gd3Var2.k));
                                                        l3 = l2;
                                                    } else {
                                                        hashMap = hashMap2;
                                                        Long l7 = gd3Var2.h;
                                                        if (l7 != null) {
                                                            o = l7.longValue();
                                                        } else {
                                                            k0();
                                                            o = (j4 + bj3Var6.o()) / 86400000;
                                                        }
                                                        if (o != n) {
                                                            j0();
                                                            bi3.C(bj3Var6, "_efs", l2);
                                                            j0();
                                                            l3 = l2;
                                                            Long valueOf3 = Long.valueOf(i4);
                                                            bi3.C(bj3Var6, "_sr", valueOf3);
                                                            arrayList5.add((cj3) bj3Var6.d());
                                                            if (z9) {
                                                                gd3Var2 = gd3Var2.b(null, valueOf3, Boolean.TRUE);
                                                            }
                                                            hashMap.put(bj3Var6.m(), new gd3(gd3Var2.a, gd3Var2.b, gd3Var2.c, gd3Var2.d, gd3Var2.e, gd3Var2.f, bj3Var6.n(), Long.valueOf(n), gd3Var2.i, gd3Var2.j, gd3Var2.k));
                                                        } else {
                                                            l3 = l2;
                                                            if (z9) {
                                                                hashMap.put(bj3Var6.m(), gd3Var2.b(l6, null, null));
                                                            }
                                                        }
                                                    }
                                                    qj3Var3.V(i33, bj3Var6);
                                                    i33++;
                                                    oq3Var = this;
                                                    l = l3;
                                                    hashMap2 = hashMap;
                                                    j5 = j3;
                                                }
                                            }
                                        }
                                    }
                                }
                                j4 = j8;
                                i4 = f0().N(((sj3) ni3Var.b).p(), bj3Var6.m());
                                if (i4 > 0) {
                                }
                            }
                            parseLong = j3;
                            oq3Var.k0();
                            long j82 = parseLong * 60000;
                            long n2 = (bj3Var6.n() + j82) / 86400000;
                            cj3 cj3Var2 = (cj3) bj3Var6.d();
                            if (!TextUtils.isEmpty("_dbg")) {
                            }
                            j4 = j82;
                            i4 = f0().N(((sj3) ni3Var.b).p(), bj3Var6.m());
                            if (i4 > 0) {
                            }
                        }
                        hashMap = hashMap2;
                        l3 = l2;
                        i33++;
                        oq3Var = this;
                        l = l3;
                        hashMap2 = hashMap;
                        j5 = j3;
                    }
                    j2 = j5;
                    HashMap hashMap4 = hashMap2;
                    if (arrayList5.size() < qj3Var3.U()) {
                        qj3Var3.b();
                        ((sj3) qj3Var3.n).a0();
                        qj3Var3.b();
                        ((sj3) qj3Var3.n).Z(arrayList5);
                    }
                    Iterator it3 = hashMap4.entrySet().iterator();
                    while (it3.hasNext()) {
                        g0().V("events", (gd3) ((Map.Entry) it3.next()).getValue());
                    }
                } else {
                    j2 = 0;
                }
                String p7 = ((sj3) ni3Var.b).p();
                di3 y03 = g0().y0(p7);
                if (y03 == null) {
                    a().A().c(vh3.E(((sj3) ni3Var.b).p()), "Bundling raw events w/o app info. appId");
                } else if (qj3Var3.U() > 0) {
                    lj3 lj3Var = y03.a.s;
                    pj3.m(lj3Var);
                    lj3Var.v();
                    long j9 = y03.i;
                    if (j9 != j2) {
                        qj3Var3.g(j9);
                    } else {
                        qj3Var3.h();
                    }
                    lj3 lj3Var2 = y03.a.s;
                    pj3.m(lj3Var2);
                    lj3Var2.v();
                    long j10 = y03.h;
                    if (j10 != j2) {
                        j9 = j10;
                    }
                    if (j9 != j2) {
                        qj3Var3.a0(j9);
                    } else {
                        qj3Var3.b0();
                    }
                    y03.h(qj3Var3.U());
                    lj3 lj3Var3 = y03.a.s;
                    pj3.m(lj3Var3);
                    lj3Var3.v();
                    int i34 = (int) y03.F;
                    qj3Var3.b();
                    ((sj3) qj3Var3.n).j1(i34);
                    lj3 lj3Var4 = y03.a.s;
                    pj3.m(lj3Var4);
                    lj3Var4.v();
                    qj3Var3.w((int) y03.g);
                    y03.L(((sj3) qj3Var3.n).a2());
                    y03.M(((sj3) qj3Var3.n).c2());
                    String u3 = y03.u();
                    if (u3 != null) {
                        qj3Var3.E(u3);
                    } else {
                        qj3Var3.F();
                    }
                    i2 = 0;
                    g0().z0(y03, false);
                    if (qj3Var3.U() > 0) {
                        pj3Var.getClass();
                        mh3 I = f0().I(((sj3) ni3Var.b).p());
                        if (I != null && I.p()) {
                            long q = I.q();
                            qj3Var3.b();
                            ((sj3) qj3Var3.n).Q0(q);
                            g0().D0((sj3) qj3Var3.d(), z7);
                        }
                        if (((sj3) ni3Var.b).E().isEmpty()) {
                            qj3Var3.b();
                            ((sj3) qj3Var3.n).Q0(-1L);
                        } else {
                            a().B().c(vh3.E(((sj3) ni3Var.b).p()), "Did not find measurement config or missing version info. appId");
                        }
                        g0().D0((sj3) qj3Var3.d(), z7);
                    }
                    tc3 g02 = g0();
                    arrayList = (ArrayList) ni3Var.c;
                    ll3.v(arrayList);
                    g02.v();
                    g02.x();
                    StringBuilder sb = new StringBuilder("rowid in (");
                    for (i3 = i2; i3 < arrayList.size(); i3++) {
                        if (i3 != 0) {
                            sb.append(",");
                        }
                        sb.append(((Long) arrayList.get(i3)).longValue());
                    }
                    sb.append(")");
                    delete = g02.l0().delete("raw_events", sb.toString(), null);
                    if (delete != arrayList.size()) {
                        ((pj3) g02.m).a().A().d(Integer.valueOf(delete), Integer.valueOf(arrayList.size()), "Deleted fewer rows from raw events table than expected");
                    }
                    tc3 g03 = g0();
                    g03.l0().execSQL("delete from raw_events_metadata where app_id=? and metadata_fingerprint not in (select distinct metadata_fingerprint from raw_events where app_id=?)", new String[]{p7, p7});
                    g0().j0();
                    z = true;
                }
                i2 = 0;
                if (qj3Var3.U() > 0) {
                }
                tc3 g022 = g0();
                arrayList = (ArrayList) ni3Var.c;
                ll3.v(arrayList);
                g022.v();
                g022.x();
                StringBuilder sb2 = new StringBuilder("rowid in (");
                while (i3 < arrayList.size()) {
                }
                sb2.append(")");
                delete = g022.l0().delete("raw_events", sb2.toString(), null);
                if (delete != arrayList.size()) {
                }
                tc3 g032 = g0();
                g032.l0().execSQL("delete from raw_events_metadata where app_id=? and metadata_fingerprint not in (select distinct metadata_fingerprint from raw_events where app_id=?)", new String[]{p7, p7});
                g0().j0();
                z = true;
            }
            g0().k0();
            return z;
        } catch (Throwable th) {
            g0().k0();
            throw th;
        }
    }

    public final void J(qj3 qj3Var, long j, boolean z) {
        vq3 vq3Var;
        Object obj;
        String str = true != z ? "_lte" : "_se";
        tc3 tc3Var = this.o;
        U(tc3Var);
        vq3 q0 = tc3Var.q0(qj3Var.n(), str);
        if (q0 == null || (obj = q0.e) == null) {
            String n = qj3Var.n();
            e().getClass();
            vq3Var = new vq3(n, "auto", str, System.currentTimeMillis(), Long.valueOf(j));
        } else {
            String n2 = qj3Var.n();
            e().getClass();
            vq3Var = new vq3(n2, "auto", str, System.currentTimeMillis(), Long.valueOf(((Long) obj).longValue() + j));
        }
        dk3 A = ek3.A();
        A.b();
        ((ek3) A.n).C(str);
        e().getClass();
        long currentTimeMillis = System.currentTimeMillis();
        A.b();
        ((ek3) A.n).B(currentTimeMillis);
        Object obj2 = vq3Var.e;
        long longValue = ((Long) obj2).longValue();
        A.b();
        ((ek3) A.n).F(longValue);
        ek3 ek3Var = (ek3) A.d();
        int k0 = bi3.k0(str, qj3Var);
        if (k0 >= 0) {
            qj3Var.b();
            ((sj3) qj3Var.n).c0(k0, ek3Var);
        } else {
            qj3Var.b();
            ((sj3) qj3Var.n).d0(ek3Var);
        }
        if (j > 0) {
            tc3 tc3Var2 = this.o;
            U(tc3Var2);
            tc3Var2.p0(vq3Var);
            a().z.d(true != z ? "lifetime" : "session-scoped", obj2, "Updated engagement user property. scope, value");
        }
    }

    public final boolean K(bj3 bj3Var, bj3 bj3Var2) {
        ll3.p("_e".equals(bj3Var.m()));
        j0();
        hj3 E = bi3.E("_sc", (cj3) bj3Var.d());
        String s = E == null ? null : E.s();
        j0();
        hj3 E2 = bi3.E("_pc", (cj3) bj3Var2.d());
        String s2 = E2 != null ? E2.s() : null;
        if (s2 == null || !s2.equals(s)) {
            return false;
        }
        ll3.p("_e".equals(bj3Var.m()));
        j0();
        hj3 E3 = bi3.E("_et", (cj3) bj3Var.d());
        if (E3 == null || !E3.t() || E3.u() <= 0) {
            return true;
        }
        long u = E3.u();
        j0();
        hj3 E4 = bi3.E("_et", (cj3) bj3Var2.d());
        if (E4 != null && E4.u() > 0) {
            u += E4.u();
        }
        j0();
        bi3.C(bj3Var2, "_et", Long.valueOf(u));
        j0();
        bi3.C(bj3Var, "_fr", 1L);
        return true;
    }

    public final boolean L() {
        c().v();
        l0();
        tc3 tc3Var = this.o;
        U(tc3Var);
        if (tc3Var.g0("select count(1) > 0 from raw_events", null) != 0) {
            return true;
        }
        tc3 tc3Var2 = this.o;
        U(tc3Var2);
        return !TextUtils.isEmpty(tc3Var2.E());
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0130  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void N() {
        boolean z;
        long max;
        long max2;
        long j;
        int i;
        Integer num;
        int intValue;
        bi3 bi3Var = this.s;
        c().v();
        l0();
        if (this.A > 0) {
            e().getClass();
            long abs = 3600000 - Math.abs(SystemClock.elapsedRealtime() - this.A);
            if (abs > 0) {
                a().z.c(Long.valueOf(abs), "Upload has been suspended. Will update scheduling later in approximately ms");
                h0().a();
                kp3 kp3Var = this.q;
                U(kp3Var);
                kp3Var.A();
                return;
            }
            this.A = 0L;
        }
        if (!this.x.h() || !L()) {
            a().z.b("Nothing to upload or uploading impossible");
            h0().a();
            kp3 kp3Var2 = this.q;
            U(kp3Var2);
            kp3Var2.A();
            return;
        }
        e().getClass();
        long currentTimeMillis = System.currentTimeMillis();
        e0();
        long max3 = Math.max(0L, ((Long) ug3.O.a(null)).longValue());
        tc3 tc3Var = this.o;
        U(tc3Var);
        if (tc3Var.g0("select count(1) > 0 from raw_events where realtime = 1", null) == 0) {
            tc3 tc3Var2 = this.o;
            U(tc3Var2);
            if (tc3Var2.g0("select count(1) > 0 from queue where has_realtime = 1", null) == 0) {
                z = false;
                if (z) {
                    e0();
                    max = Math.max(0L, ((Long) ug3.H.a(null)).longValue());
                } else {
                    String A = e0().A("debug.firebase.analytics.app");
                    if (TextUtils.isEmpty(A) || ".none.".equals(A)) {
                        e0();
                        max = Math.max(0L, ((Long) ug3.I.a(null)).longValue());
                    } else {
                        e0();
                        max = Math.max(0L, ((Long) ug3.J.a(null)).longValue());
                    }
                }
                long a = this.u.t.a();
                long a2 = this.u.u.a();
                tc3 tc3Var3 = this.o;
                U(tc3Var3);
                long h0 = tc3Var3.h0("select max(bundle_end_timestamp) from queue", null, 0L);
                tc3 tc3Var4 = this.o;
                U(tc3Var4);
                max2 = Math.max(h0, tc3Var4.h0("select max(timestamp) from raw_events", null, 0L));
                if (max2 != 0) {
                    j = 0;
                } else {
                    long abs2 = currentTimeMillis - Math.abs(max2 - currentTimeMillis);
                    long abs3 = currentTimeMillis - Math.abs(a - currentTimeMillis);
                    long abs4 = currentTimeMillis - Math.abs(a2 - currentTimeMillis);
                    long j2 = max3 + abs2;
                    long max4 = Math.max(abs3, abs4);
                    if (z && max4 > 0) {
                        j2 = Math.min(abs2, max4) + max;
                    }
                    U(bi3Var);
                    j = !bi3Var.g0(max4, max) ? max4 + max : j2;
                    if (abs4 != 0 && abs4 >= abs2) {
                        int i2 = 0;
                        while (true) {
                            e0();
                            i = 0;
                            if (i2 >= Math.min(20, Math.max(0, ((Integer) ug3.Q.a(null)).intValue()))) {
                                j = 0;
                                break;
                            }
                            e0();
                            j += Math.max(0L, ((Long) ug3.P.a(null)).longValue()) * (1 << i2);
                            if (j > abs4) {
                                break;
                            } else {
                                i2++;
                            }
                        }
                        if (j == 0) {
                            a().z.b("Next upload time is 0");
                            h0().a();
                            kp3 kp3Var3 = this.q;
                            U(kp3Var3);
                            kp3Var3.A();
                            return;
                        }
                        bi3 bi3Var2 = this.n;
                        U(bi3Var2);
                        if (!bi3Var2.Q()) {
                            a().z.b("No network");
                            hi3 h02 = h0();
                            oq3 oq3Var = h02.a;
                            oq3Var.l0();
                            oq3Var.c().v();
                            if (!h02.b) {
                                oq3Var.x.m.registerReceiver(h02, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                                bi3 bi3Var3 = oq3Var.n;
                                U(bi3Var3);
                                h02.c = bi3Var3.Q();
                                oq3Var.a().z.c(Boolean.valueOf(h02.c), "Registering connectivity change receiver. Network connected");
                                h02.b = true;
                            }
                            kp3 kp3Var4 = this.q;
                            U(kp3Var4);
                            kp3Var4.A();
                            return;
                        }
                        long a3 = this.u.s.a();
                        e0();
                        long max5 = Math.max(0L, ((Long) ug3.G.a(null)).longValue());
                        U(bi3Var);
                        if (!bi3Var.g0(a3, max5)) {
                            j = Math.max(j, a3 + max5);
                        }
                        h0().a();
                        e().getClass();
                        long currentTimeMillis2 = j - System.currentTimeMillis();
                        if (currentTimeMillis2 <= 0) {
                            e0();
                            currentTimeMillis2 = Math.max(0L, ((Long) ug3.K.a(null)).longValue());
                            li3 li3Var = this.u.t;
                            e().getClass();
                            li3Var.b(System.currentTimeMillis());
                        }
                        a().z.c(Long.valueOf(currentTimeMillis2), "Upload scheduled in approximately ms");
                        kp3 kp3Var5 = this.q;
                        U(kp3Var5);
                        kp3Var5.x();
                        pj3 pj3Var = (pj3) kp3Var5.m;
                        pj3Var.getClass();
                        vh3 vh3Var = pj3Var.r;
                        Context context = pj3Var.m;
                        if (!zq3.n0(context)) {
                            pj3.m(vh3Var);
                            vh3Var.y.b("Receiver not registered/enabled");
                        }
                        if (!zq3.P(context)) {
                            pj3.m(vh3Var);
                            vh3Var.y.b("Service not registered/enabled");
                        }
                        kp3Var5.A();
                        pj3.m(vh3Var);
                        vh3Var.z.c(Long.valueOf(currentTimeMillis2), "Scheduling upload, millis");
                        pj3Var.w.getClass();
                        SystemClock.elapsedRealtime();
                        if (currentTimeMillis2 < Math.max(0L, ((Long) ug3.L.a(null)).longValue()) && kp3Var5.B().c == 0) {
                            kp3Var5.B().b(currentTimeMillis2);
                        }
                        ComponentName componentName = new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementJobService");
                        int D = kp3Var5.D();
                        PersistableBundle persistableBundle = new PersistableBundle();
                        persistableBundle.putString("action", "com.google.android.gms.measurement.UPLOAD");
                        JobInfo build = new JobInfo.Builder(D, componentName).setMinimumLatency(currentTimeMillis2).setOverrideDeadline(currentTimeMillis2 + currentTimeMillis2).setExtras(persistableBundle).build();
                        Method method = de3.a;
                        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
                        jobScheduler.getClass();
                        Method method2 = de3.a;
                        if (method2 == null || context.checkSelfPermission("android.permission.UPDATE_DEVICE_STATS") != 0) {
                            jobScheduler.schedule(build);
                            return;
                        }
                        Method method3 = de3.b;
                        try {
                            if (method3 != null) {
                                try {
                                    num = (Integer) method3.invoke(UserHandle.class, null);
                                } catch (IllegalAccessException | InvocationTargetException e) {
                                    if (Log.isLoggable("JobSchedulerCompat", 6)) {
                                        Log.e("JobSchedulerCompat", "myUserId invocation illegal", e);
                                    }
                                }
                                if (num != null) {
                                    intValue = num.intValue();
                                    return;
                                }
                            }
                            return;
                        } catch (IllegalAccessException | InvocationTargetException e2) {
                            Log.e("UploadAlarm", "error calling scheduleAsPackage", e2);
                            jobScheduler.schedule(build);
                            return;
                        }
                        intValue = i;
                    }
                }
                i = 0;
                if (j == 0) {
                }
            }
        }
        z = true;
        if (z) {
        }
        long a4 = this.u.t.a();
        long a22 = this.u.u.a();
        tc3 tc3Var32 = this.o;
        U(tc3Var32);
        long h03 = tc3Var32.h0("select max(bundle_end_timestamp) from queue", null, 0L);
        tc3 tc3Var42 = this.o;
        U(tc3Var42);
        max2 = Math.max(h03, tc3Var42.h0("select max(timestamp) from raw_events", null, 0L));
        if (max2 != 0) {
        }
        i = 0;
        if (j == 0) {
        }
    }

    public final void O() {
        c().v();
        if (this.F || this.G || this.H) {
            a().z.e("Not stopping services. fetch, network, upload", Boolean.valueOf(this.F), Boolean.valueOf(this.G), Boolean.valueOf(this.H));
            return;
        }
        a().z.b("Stopping uploading service(s)");
        ArrayList arrayList = this.B;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((Runnable) obj).run();
        }
        ArrayList arrayList2 = this.B;
        ll3.v(arrayList2);
        arrayList2.clear();
    }

    public final Boolean P(di3 di3Var) {
        try {
            long P = di3Var.P();
            pj3 pj3Var = this.x;
            if (P != -2147483648L) {
                if (di3Var.P() == i93.a(pj3Var.m).c(0, di3Var.D()).versionCode) {
                    return Boolean.TRUE;
                }
            } else {
                String str = i93.a(pj3Var.m).c(0, di3Var.D()).versionName;
                String N = di3Var.N();
                if (N != null && N.equals(str)) {
                    return Boolean.TRUE;
                }
            }
            return Boolean.FALSE;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public final cs3 Q(String str) {
        tc3 tc3Var = this.o;
        U(tc3Var);
        di3 y0 = tc3Var.y0(str);
        if (y0 != null) {
            pj3 pj3Var = y0.a;
            if (!TextUtils.isEmpty(y0.N())) {
                Boolean P = P(y0);
                if (P != null && !P.booleanValue()) {
                    a().r.c(vh3.E(str), "App version does not match; dropping. appId");
                    return null;
                }
                String G = y0.G();
                String N = y0.N();
                long P2 = y0.P();
                lj3 lj3Var = pj3Var.s;
                pj3.m(lj3Var);
                lj3Var.v();
                String str2 = y0.l;
                lj3 lj3Var2 = pj3Var.s;
                pj3.m(lj3Var2);
                lj3Var2.v();
                long j = y0.m;
                lj3 lj3Var3 = pj3Var.s;
                pj3.m(lj3Var3);
                lj3Var3.v();
                long j2 = y0.n;
                lj3 lj3Var4 = pj3Var.s;
                pj3.m(lj3Var4);
                lj3Var4.v();
                boolean z = y0.o;
                String J = y0.J();
                lj3 lj3Var5 = pj3Var.s;
                pj3.m(lj3Var5);
                lj3Var5.v();
                boolean z2 = y0.p;
                Boolean w = y0.w();
                long b = y0.b();
                lj3 lj3Var6 = pj3Var.s;
                pj3.m(lj3Var6);
                lj3Var6.v();
                ArrayList arrayList = y0.s;
                String g = b(str).g();
                boolean y = y0.y();
                lj3 lj3Var7 = pj3Var.s;
                pj3.m(lj3Var7);
                lj3Var7.v();
                long j3 = y0.v;
                int i = b(str).b;
                String str3 = o0(str).b;
                lj3 lj3Var8 = pj3Var.s;
                pj3.m(lj3Var8);
                lj3Var8.v();
                int i2 = y0.x;
                lj3 lj3Var9 = pj3Var.s;
                pj3.m(lj3Var9);
                lj3Var9.v();
                return new cs3(str, G, N, P2, str2, j, j2, (String) null, z, false, J, 0L, 0, z2, false, w, b, (List) arrayList, g, BuildConfig.FLAVOR, (String) null, y, j3, i, str3, i2, y0.B, y0.C(), y0.s(), 0L, y0.t());
            }
        }
        a().y.c(str, "No app data available; dropping");
        return null;
    }

    public final boolean R(String str, String str2) {
        tc3 tc3Var = this.o;
        U(tc3Var);
        gd3 U = tc3Var.U("events", str, str2);
        return U == null || U.c < 1;
    }

    public final void W(tq3 tq3Var, cs3 cs3Var) {
        String str;
        long j;
        c().v();
        l0();
        boolean T = T(cs3Var);
        String str2 = cs3Var.m;
        if (T) {
            if (!cs3Var.t) {
                c0(cs3Var);
                return;
            }
            zq3 k0 = k0();
            String str3 = tq3Var.n;
            int C0 = k0.C0(str3);
            hq3 hq3Var = this.V;
            if (C0 != 0) {
                k0();
                e0();
                String B = zq3.B(str3, 24, true);
                int length = str3 != null ? str3.length() : 0;
                k0();
                zq3.M(hq3Var, cs3Var.m, C0, "_ev", B, length);
                return;
            }
            int J = k0().J(tq3Var.a(), str3);
            if (J != 0) {
                k0();
                e0();
                String B2 = zq3.B(str3, 24, true);
                Object a = tq3Var.a();
                int length2 = (a == null || !((a instanceof String) || (a instanceof CharSequence))) ? 0 : a.toString().length();
                k0();
                zq3.M(hq3Var, cs3Var.m, J, "_ev", B2, length2);
                return;
            }
            Object K = k0().K(tq3Var.a(), str3);
            if (K != null) {
                if ("_sid".equals(str3)) {
                    long j2 = tq3Var.o;
                    String str4 = tq3Var.r;
                    ll3.v(str2);
                    tc3 tc3Var = this.o;
                    U(tc3Var);
                    vq3 q0 = tc3Var.q0(str2, "_sno");
                    if (q0 != null) {
                        Object obj = q0.e;
                        if (obj instanceof Long) {
                            j = ((Long) obj).longValue();
                            str = "_sid";
                            W(new tq3(j2, Long.valueOf(j + 1), "_sno", str4), cs3Var);
                        }
                    }
                    if (q0 != null) {
                        a().u.c(q0.e, "Retrieved last session number from database does not contain a valid (long) value");
                    }
                    tc3 tc3Var2 = this.o;
                    U(tc3Var2);
                    gd3 U = tc3Var2.U("events", str2, "_s");
                    if (U != null) {
                        g10 g10Var = a().z;
                        str = "_sid";
                        long j3 = U.c;
                        g10Var.c(Long.valueOf(j3), "Backfill the session number. Last used session number");
                        j = j3;
                    } else {
                        str = "_sid";
                        j = 0;
                    }
                    W(new tq3(j2, Long.valueOf(j + 1), "_sno", str4), cs3Var);
                } else {
                    str = "_sid";
                }
                ll3.v(str2);
                String str5 = tq3Var.r;
                ll3.v(str5);
                vq3 vq3Var = new vq3(str2, str5, str3, tq3Var.o, K);
                g10 g10Var2 = a().z;
                pj3 pj3Var = this.x;
                nh3 nh3Var = pj3Var.v;
                String str6 = vq3Var.c;
                g10Var2.d(nh3Var.c(str6), K, "Setting user property");
                tc3 tc3Var3 = this.o;
                U(tc3Var3);
                tc3Var3.i0();
                try {
                    boolean equals = "_id".equals(str6);
                    Object obj2 = vq3Var.e;
                    if (equals) {
                        tc3 tc3Var4 = this.o;
                        U(tc3Var4);
                        vq3 q02 = tc3Var4.q0(str2, "_id");
                        if (q02 != null && !obj2.equals(q02.e)) {
                            tc3 tc3Var5 = this.o;
                            U(tc3Var5);
                            tc3Var5.o0(str2, "_lair");
                        }
                    }
                    c0(cs3Var);
                    tc3 tc3Var6 = this.o;
                    U(tc3Var6);
                    boolean p0 = tc3Var6.p0(vq3Var);
                    if (str.equals(str3)) {
                        bi3 bi3Var = this.s;
                        U(bi3Var);
                        String str7 = cs3Var.G;
                        long h0 = TextUtils.isEmpty(str7) ? 0L : bi3Var.h0(str7.getBytes(Charset.forName("UTF-8")));
                        tc3 tc3Var7 = this.o;
                        U(tc3Var7);
                        di3 y0 = tc3Var7.y0(str2);
                        if (y0 != null) {
                            y0.A(h0);
                            if (y0.o()) {
                                tc3 tc3Var8 = this.o;
                                U(tc3Var8);
                                tc3Var8.z0(y0, false);
                            }
                        }
                    }
                    tc3 tc3Var9 = this.o;
                    U(tc3Var9);
                    tc3Var9.j0();
                    if (!p0) {
                        a().r.d(pj3Var.v.c(str6), obj2, "Too many unique user properties are set. Ignoring user property");
                        k0();
                        zq3.M(hq3Var, str2, 9, null, null, 0);
                    }
                    tc3 tc3Var10 = this.o;
                    U(tc3Var10);
                    tc3Var10.k0();
                } catch (Throwable th) {
                    tc3 tc3Var11 = this.o;
                    U(tc3Var11);
                    tc3Var11.k0();
                    throw th;
                }
            }
        }
    }

    public final void X(String str, cs3 cs3Var) {
        c().v();
        l0();
        boolean T = T(cs3Var);
        String str2 = cs3Var.m;
        if (T) {
            if (!cs3Var.t) {
                c0(cs3Var);
                return;
            }
            Boolean V = V(cs3Var);
            if ("_npa".equals(str) && V != null) {
                a().y.b("Falling back to manifest metadata value for ad personalization");
                e().getClass();
                W(new tq3(System.currentTimeMillis(), Long.valueOf(true != V.booleanValue() ? 0L : 1L), "_npa", "auto"), cs3Var);
                return;
            }
            g10 g10Var = a().y;
            pj3 pj3Var = this.x;
            g10Var.c(pj3Var.v.c(str), "Removing user property");
            tc3 tc3Var = this.o;
            U(tc3Var);
            tc3Var.i0();
            try {
                c0(cs3Var);
                if ("_id".equals(str)) {
                    tc3 tc3Var2 = this.o;
                    U(tc3Var2);
                    ll3.v(str2);
                    tc3Var2.o0(str2, "_lair");
                }
                tc3 tc3Var3 = this.o;
                U(tc3Var3);
                ll3.v(str2);
                tc3Var3.o0(str2, str);
                tc3 tc3Var4 = this.o;
                U(tc3Var4);
                tc3Var4.j0();
                a().y.c(pj3Var.v.c(str), "User property removed");
                tc3 tc3Var5 = this.o;
                U(tc3Var5);
                tc3Var5.k0();
            } catch (Throwable th) {
                tc3 tc3Var6 = this.o;
                U(tc3Var6);
                tc3Var6.k0();
                throw th;
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:(3:76|77|78)|(2:80|(8:82|(3:84|(2:86|(1:88))(1:108)|107)(1:109)|89|(1:91)(1:106)|92|93|94|(4:96|(1:98)(1:102)|99|(1:101))))|110|93|94|(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x034a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x034b, code lost:
    
        r2.a().r.d(defpackage.vh3.E(r3), r0, "Application info is null, first open report might be inaccurate. appId");
        r0 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0420 A[Catch: all -> 0x02c8, TryCatch #4 {all -> 0x02c8, blocks: (B:60:0x0295, B:62:0x02b3, B:67:0x037c, B:68:0x037f, B:70:0x038c, B:71:0x039c, B:72:0x0444, B:77:0x02cb, B:80:0x02eb, B:82:0x02f3, B:84:0x02fa, B:88:0x030d, B:89:0x031f, B:92:0x032b, B:94:0x033e, B:96:0x035d, B:98:0x0365, B:99:0x036d, B:101:0x0373, B:105:0x034b, B:108:0x0318, B:113:0x02d9, B:156:0x03b5, B:158:0x03ea, B:159:0x03ed, B:161:0x03fa, B:162:0x0408, B:163:0x0420, B:165:0x0428), top: B:45:0x0136, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x012c A[Catch: all -> 0x00c4, TryCatch #3 {all -> 0x00c4, blocks: (B:25:0x00a4, B:27:0x00b4, B:31:0x00cc, B:34:0x00dc, B:36:0x00eb, B:38:0x0100, B:40:0x010d, B:41:0x0118, B:44:0x0121, B:47:0x0138, B:50:0x0151, B:124:0x0199, B:167:0x012c, B:168:0x0114, B:169:0x00f5, B:173:0x00fd), top: B:24:0x00a4 }] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0114 A[Catch: all -> 0x00c4, TryCatch #3 {all -> 0x00c4, blocks: (B:25:0x00a4, B:27:0x00b4, B:31:0x00cc, B:34:0x00dc, B:36:0x00eb, B:38:0x0100, B:40:0x010d, B:41:0x0118, B:44:0x0121, B:47:0x0138, B:50:0x0151, B:124:0x0199, B:167:0x012c, B:168:0x0114, B:169:0x00f5, B:173:0x00fd), top: B:24:0x00a4 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010d A[Catch: all -> 0x00c4, TryCatch #3 {all -> 0x00c4, blocks: (B:25:0x00a4, B:27:0x00b4, B:31:0x00cc, B:34:0x00dc, B:36:0x00eb, B:38:0x0100, B:40:0x010d, B:41:0x0118, B:44:0x0121, B:47:0x0138, B:50:0x0151, B:124:0x0199, B:167:0x012c, B:168:0x0114, B:169:0x00f5, B:173:0x00fd), top: B:24:0x00a4 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0121 A[Catch: all -> 0x00c4, TRY_ENTER, TryCatch #3 {all -> 0x00c4, blocks: (B:25:0x00a4, B:27:0x00b4, B:31:0x00cc, B:34:0x00dc, B:36:0x00eb, B:38:0x0100, B:40:0x010d, B:41:0x0118, B:44:0x0121, B:47:0x0138, B:50:0x0151, B:124:0x0199, B:167:0x012c, B:168:0x0114, B:169:0x00f5, B:173:0x00fd), top: B:24:0x00a4 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0138 A[Catch: all -> 0x00c4, TRY_LEAVE, TryCatch #3 {all -> 0x00c4, blocks: (B:25:0x00a4, B:27:0x00b4, B:31:0x00cc, B:34:0x00dc, B:36:0x00eb, B:38:0x0100, B:40:0x010d, B:41:0x0118, B:44:0x0121, B:47:0x0138, B:50:0x0151, B:124:0x0199, B:167:0x012c, B:168:0x0114, B:169:0x00f5, B:173:0x00fd), top: B:24:0x00a4 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x028d A[Catch: all -> 0x01df, TryCatch #5 {all -> 0x01df, blocks: (B:120:0x0175, B:122:0x0183, B:55:0x0262, B:57:0x028d, B:58:0x0290, B:128:0x01ab, B:130:0x01d3, B:131:0x01e4, B:133:0x01eb, B:135:0x01f1, B:137:0x01fb, B:139:0x0201, B:141:0x0207, B:143:0x020d, B:145:0x0212, B:148:0x022b, B:153:0x022f, B:154:0x0240, B:155:0x024b, B:54:0x0256), top: B:119:0x0175, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02b3 A[Catch: all -> 0x02c8, TRY_LEAVE, TryCatch #4 {all -> 0x02c8, blocks: (B:60:0x0295, B:62:0x02b3, B:67:0x037c, B:68:0x037f, B:70:0x038c, B:71:0x039c, B:72:0x0444, B:77:0x02cb, B:80:0x02eb, B:82:0x02f3, B:84:0x02fa, B:88:0x030d, B:89:0x031f, B:92:0x032b, B:94:0x033e, B:96:0x035d, B:98:0x0365, B:99:0x036d, B:101:0x0373, B:105:0x034b, B:108:0x0318, B:113:0x02d9, B:156:0x03b5, B:158:0x03ea, B:159:0x03ed, B:161:0x03fa, B:162:0x0408, B:163:0x0420, B:165:0x0428), top: B:45:0x0136, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x037c A[Catch: all -> 0x02c8, TryCatch #4 {all -> 0x02c8, blocks: (B:60:0x0295, B:62:0x02b3, B:67:0x037c, B:68:0x037f, B:70:0x038c, B:71:0x039c, B:72:0x0444, B:77:0x02cb, B:80:0x02eb, B:82:0x02f3, B:84:0x02fa, B:88:0x030d, B:89:0x031f, B:92:0x032b, B:94:0x033e, B:96:0x035d, B:98:0x0365, B:99:0x036d, B:101:0x0373, B:105:0x034b, B:108:0x0318, B:113:0x02d9, B:156:0x03b5, B:158:0x03ea, B:159:0x03ed, B:161:0x03fa, B:162:0x0408, B:163:0x0420, B:165:0x0428), top: B:45:0x0136, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x038c A[Catch: all -> 0x02c8, TryCatch #4 {all -> 0x02c8, blocks: (B:60:0x0295, B:62:0x02b3, B:67:0x037c, B:68:0x037f, B:70:0x038c, B:71:0x039c, B:72:0x0444, B:77:0x02cb, B:80:0x02eb, B:82:0x02f3, B:84:0x02fa, B:88:0x030d, B:89:0x031f, B:92:0x032b, B:94:0x033e, B:96:0x035d, B:98:0x0365, B:99:0x036d, B:101:0x0373, B:105:0x034b, B:108:0x0318, B:113:0x02d9, B:156:0x03b5, B:158:0x03ea, B:159:0x03ed, B:161:0x03fa, B:162:0x0408, B:163:0x0420, B:165:0x0428), top: B:45:0x0136, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02cb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x035d A[Catch: all -> 0x02c8, TryCatch #4 {all -> 0x02c8, blocks: (B:60:0x0295, B:62:0x02b3, B:67:0x037c, B:68:0x037f, B:70:0x038c, B:71:0x039c, B:72:0x0444, B:77:0x02cb, B:80:0x02eb, B:82:0x02f3, B:84:0x02fa, B:88:0x030d, B:89:0x031f, B:92:0x032b, B:94:0x033e, B:96:0x035d, B:98:0x0365, B:99:0x036d, B:101:0x0373, B:105:0x034b, B:108:0x0318, B:113:0x02d9, B:156:0x03b5, B:158:0x03ea, B:159:0x03ed, B:161:0x03fa, B:162:0x0408, B:163:0x0420, B:165:0x0428), top: B:45:0x0136, inners: #0, #1 }] */
    /* JADX WARN: Type inference failed for: r2v0, types: [cs3, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v13, types: [oq3] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v5, types: [oq3] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Y(cs3 cs3Var) {
        vq3 q0;
        Boolean V;
        long j;
        long j2;
        int i;
        gd3 U;
        boolean z;
        String str;
        pj3 pj3Var;
        String str2;
        long K;
        pj3 pj3Var2;
        PackageInfo packageInfo;
        cs3 cs3Var2;
        ApplicationInfo applicationInfo;
        long j3;
        boolean z2;
        oq3 oq3Var = cs3Var;
        pj3 pj3Var3 = this.x;
        c().v();
        l0();
        ll3.v(oq3Var);
        boolean z3 = oq3Var.A;
        String str3 = oq3Var.m;
        ll3.s(str3);
        if (!T(oq3Var)) {
            return;
        }
        tc3 tc3Var = this.o;
        U(tc3Var);
        di3 y0 = tc3Var.y0(str3);
        if (y0 != null && TextUtils.isEmpty(y0.G()) && !TextUtils.isEmpty(oq3Var.n)) {
            y0.f(0L);
            tc3 tc3Var2 = this.o;
            U(tc3Var2);
            tc3Var2.z0(y0, false);
            dj3 dj3Var = this.m;
            U(dj3Var);
            dj3Var.v();
            dj3Var.t.remove(str3);
        }
        if (!oq3Var.t) {
            c0(cs3Var);
            return;
        }
        long j4 = oq3Var.x;
        if (j4 == 0) {
            e().getClass();
            j4 = System.currentTimeMillis();
        }
        long j5 = j4;
        int i2 = oq3Var.y;
        if (i2 != 0 && i2 != 1) {
            a().u.d(vh3.E(str3), Integer.valueOf(i2), "Incorrect app type, assuming installed app. appId, appType");
            i2 = 0;
        }
        tc3 tc3Var3 = this.o;
        U(tc3Var3);
        tc3Var3.i0();
        try {
            tc3 tc3Var4 = this.o;
            U(tc3Var4);
            q0 = tc3Var4.q0(str3, "_npa");
            V = V(oq3Var);
        } catch (Throwable th) {
            th = th;
            oq3Var = this;
        }
        try {
            if (q0 != null) {
                j = 1;
                if (!"auto".equals(q0.b)) {
                    j2 = j5;
                    if (e0().G(null, ug3.b1)) {
                        i = i2;
                        b0(oq3Var, j2);
                    } else {
                        i = i2;
                        b0(oq3Var, oq3Var.P);
                    }
                    c0(cs3Var);
                    tc3 tc3Var5 = this.o;
                    if (i != 0) {
                        U(tc3Var5);
                        U = tc3Var5.U("events", str3, "_f");
                        z = false;
                    } else {
                        U(tc3Var5);
                        U = tc3Var5.U("events", str3, "_v");
                        z = true;
                    }
                    if (U != null) {
                        long j6 = ((j2 / 3600000) + j) * 3600000;
                        if (z) {
                            oq3 oq3Var2 = this;
                            Long valueOf = Long.valueOf(j6);
                            long j7 = j2;
                            oq3Var2.W(new tq3(j7, valueOf, "_fvt", "auto"), oq3Var);
                            oq3Var2.c().v();
                            oq3Var2.l0();
                            Bundle bundle = new Bundle();
                            bundle.putLong("_c", 1L);
                            bundle.putLong("_r", 1L);
                            bundle.putLong("_et", 1L);
                            if (z3) {
                                bundle.putLong("_dac", 1L);
                            }
                            if (oq3Var2.e0().G(null, ug3.j1)) {
                                oq3Var2.e().getClass();
                                bundle.putLong("_elt", System.currentTimeMillis());
                            }
                            oq3Var2.i(new kd3("_v", new jd3(bundle), "auto", j7), oq3Var);
                            oq3Var = oq3Var2;
                        } else {
                            Long valueOf2 = Long.valueOf(j6);
                            long j8 = j2;
                            W(new tq3(j8, valueOf2, "_fot", "auto"), oq3Var);
                            c().v();
                            ti3 ti3Var = this.w;
                            ll3.v(ti3Var);
                            pj3 pj3Var4 = ti3Var.n;
                            if (str3 != null) {
                                try {
                                    if (!str3.isEmpty()) {
                                        str = "_elt";
                                        lj3 lj3Var = pj3Var4.s;
                                        Context context = pj3Var4.m;
                                        vh3 vh3Var = pj3Var4.r;
                                        pj3.m(lj3Var);
                                        lj3Var.v();
                                        if (ti3Var.b()) {
                                            pj3Var = pj3Var3;
                                            si3 si3Var = new si3(ti3Var, str3);
                                            lj3 lj3Var2 = pj3Var4.s;
                                            pj3.m(lj3Var2);
                                            lj3Var2.v();
                                            str2 = str3;
                                            Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
                                            intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
                                            PackageManager packageManager = context.getPackageManager();
                                            if (packageManager == null) {
                                                pj3.m(vh3Var);
                                                vh3Var.v.b("Failed to obtain Package Manager to verify binding conditions for Install Referrer");
                                            } else {
                                                List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
                                                if (queryIntentServices == null || queryIntentServices.isEmpty()) {
                                                    pj3.m(vh3Var);
                                                    vh3Var.x.b("Play Service for fetching Install Referrer is unavailable on device");
                                                } else {
                                                    ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
                                                    if (serviceInfo != null) {
                                                        String str4 = serviceInfo.packageName;
                                                        if (serviceInfo.name != null && "com.android.vending".equals(str4) && ti3Var.b()) {
                                                            try {
                                                                boolean a = i10.b().a(context, new Intent(intent), si3Var, 1);
                                                                pj3.m(vh3Var);
                                                                vh3Var.z.c(a ? "available" : "not available", "Install Referrer Service is");
                                                            } catch (RuntimeException e) {
                                                                vh3 vh3Var2 = pj3Var4.r;
                                                                pj3.m(vh3Var2);
                                                                vh3Var2.r.c(e.getMessage(), "Exception occurred while binding to Install Referrer Service");
                                                            }
                                                        } else {
                                                            pj3.m(vh3Var);
                                                            vh3Var.u.b("Play Store version 8.3.73 or higher required for Install Referrer");
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            pj3.m(vh3Var);
                                            vh3Var.x.b("Install Referrer Reporter is not available");
                                            pj3Var = pj3Var3;
                                            str2 = str3;
                                        }
                                        c().v();
                                        l0();
                                        Bundle bundle2 = new Bundle();
                                        long j9 = j;
                                        bundle2.putLong("_c", j9);
                                        bundle2.putLong("_r", j9);
                                        bundle2.putLong("_uwa", 0L);
                                        bundle2.putLong("_pfo", 0L);
                                        bundle2.putLong("_sys", 0L);
                                        bundle2.putLong("_sysu", 0L);
                                        bundle2.putLong("_et", j9);
                                        if (z3) {
                                            bundle2.putLong("_dac", j9);
                                        }
                                        ll3.v(str2);
                                        oq3Var = this;
                                        tc3 tc3Var6 = oq3Var.o;
                                        U(tc3Var6);
                                        ll3.s(str2);
                                        tc3Var6.v();
                                        tc3Var6.x();
                                        String str5 = str2;
                                        K = tc3Var6.K(str5);
                                        pj3Var2 = pj3Var;
                                        if (pj3Var2.m.getPackageManager() != null) {
                                            oq3Var.a().r.c(vh3.E(str5), "PackageManager is null, first open report might be inaccurate. appId");
                                            cs3Var2 = cs3Var;
                                        } else {
                                            try {
                                                packageInfo = i93.a(pj3Var2.m).c(0, str5);
                                            } catch (PackageManager.NameNotFoundException e2) {
                                                oq3Var.a().r.d(vh3.E(str5), e2, "Package info is null, first open report might be inaccurate. appId");
                                                packageInfo = null;
                                            }
                                            if (packageInfo != null) {
                                                long j10 = packageInfo.firstInstallTime;
                                                if (j10 != 0) {
                                                    if (j10 != packageInfo.lastUpdateTime) {
                                                        if (!oq3Var.e0().G(null, ug3.I0)) {
                                                            bundle2.putLong("_uwa", 1L);
                                                        } else if (K == 0) {
                                                            bundle2.putLong("_uwa", 1L);
                                                            z2 = false;
                                                            K = 0;
                                                        }
                                                        z2 = false;
                                                    } else {
                                                        z2 = true;
                                                    }
                                                    cs3Var2 = cs3Var;
                                                    oq3Var.W(new tq3(j8, Long.valueOf(true != z2 ? 0L : 1L), "_fi", "auto"), cs3Var2);
                                                    applicationInfo = i93.a(pj3Var2.m).b(0, str5);
                                                    if (applicationInfo != null) {
                                                        if ((applicationInfo.flags & 1) != 0) {
                                                            j3 = 1;
                                                            bundle2.putLong("_sys", 1L);
                                                        } else {
                                                            j3 = 1;
                                                        }
                                                        if ((applicationInfo.flags & 128) != 0) {
                                                            bundle2.putLong("_sysu", j3);
                                                        }
                                                    }
                                                }
                                            }
                                            cs3Var2 = cs3Var;
                                            applicationInfo = i93.a(pj3Var2.m).b(0, str5);
                                            if (applicationInfo != null) {
                                            }
                                        }
                                        if (K >= 0) {
                                            bundle2.putLong("_pfo", K);
                                        }
                                        if (oq3Var.e0().G(null, ug3.j1)) {
                                            oq3Var.e().getClass();
                                            bundle2.putLong(str, System.currentTimeMillis());
                                        }
                                        oq3Var.i(new kd3("_f", new jd3(bundle2), "auto", j8), cs3Var2);
                                        oq3Var = oq3Var;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    oq3Var = this;
                                    tc3 tc3Var7 = oq3Var.o;
                                    U(tc3Var7);
                                    tc3Var7.k0();
                                    throw th;
                                }
                            }
                            pj3Var = pj3Var3;
                            str = "_elt";
                            str2 = str3;
                            vh3 vh3Var3 = pj3Var4.r;
                            pj3.m(vh3Var3);
                            vh3Var3.v.b("Install Referrer Reporter was called with invalid app package name");
                            c().v();
                            l0();
                            Bundle bundle22 = new Bundle();
                            long j92 = j;
                            bundle22.putLong("_c", j92);
                            bundle22.putLong("_r", j92);
                            bundle22.putLong("_uwa", 0L);
                            bundle22.putLong("_pfo", 0L);
                            bundle22.putLong("_sys", 0L);
                            bundle22.putLong("_sysu", 0L);
                            bundle22.putLong("_et", j92);
                            if (z3) {
                            }
                            ll3.v(str2);
                            oq3Var = this;
                            tc3 tc3Var62 = oq3Var.o;
                            U(tc3Var62);
                            ll3.s(str2);
                            tc3Var62.v();
                            tc3Var62.x();
                            String str52 = str2;
                            K = tc3Var62.K(str52);
                            pj3Var2 = pj3Var;
                            if (pj3Var2.m.getPackageManager() != null) {
                            }
                            if (K >= 0) {
                            }
                            if (oq3Var.e0().G(null, ug3.j1)) {
                            }
                            oq3Var.i(new kd3("_f", new jd3(bundle22), "auto", j8), cs3Var2);
                            oq3Var = oq3Var;
                        }
                    } else {
                        long j11 = j2;
                        oq3 oq3Var3 = this;
                        boolean z4 = oq3Var.u;
                        oq3Var = oq3Var3;
                        if (z4) {
                            oq3Var3.i(new kd3("_cd", new jd3(new Bundle()), "auto", j11), oq3Var);
                            oq3Var = oq3Var3;
                        }
                    }
                    tc3 tc3Var8 = oq3Var.o;
                    U(tc3Var8);
                    tc3Var8.j0();
                    tc3 tc3Var9 = oq3Var.o;
                    U(tc3Var9);
                    tc3Var9.k0();
                    return;
                }
            } else {
                j = 1;
            }
            if (U != null) {
            }
            tc3 tc3Var82 = oq3Var.o;
            U(tc3Var82);
            tc3Var82.j0();
            tc3 tc3Var92 = oq3Var.o;
            U(tc3Var92);
            tc3Var92.k0();
            return;
        } catch (Throwable th3) {
            th = th3;
            tc3 tc3Var72 = oq3Var.o;
            U(tc3Var72);
            tc3Var72.k0();
            throw th;
        }
        if (V != null) {
            tq3 tq3Var = new tq3(j5, Long.valueOf(true != V.booleanValue() ? 0L : j), "_npa", "auto");
            j2 = j5;
            if (q0 == null || !q0.e.equals(tq3Var.p)) {
                W(tq3Var, oq3Var);
            }
        } else {
            j2 = j5;
            if (q0 != null) {
                X("_npa", oq3Var);
            }
        }
        if (e0().G(null, ug3.b1)) {
        }
        c0(cs3Var);
        tc3 tc3Var52 = this.o;
        if (i != 0) {
        }
    }

    public final void Z(yb3 yb3Var, cs3 cs3Var) {
        kd3 kd3Var;
        ll3.s(yb3Var.m);
        ll3.v(yb3Var.n);
        ll3.v(yb3Var.o);
        ll3.s(yb3Var.o.n);
        c().v();
        l0();
        if (T(cs3Var)) {
            if (!cs3Var.t) {
                c0(cs3Var);
                return;
            }
            yb3 yb3Var2 = new yb3(yb3Var);
            boolean z = false;
            yb3Var2.q = false;
            tc3 tc3Var = this.o;
            U(tc3Var);
            tc3Var.i0();
            try {
                tc3 tc3Var2 = this.o;
                U(tc3Var2);
                String str = yb3Var2.m;
                ll3.v(str);
                yb3 u0 = tc3Var2.u0(str, yb3Var2.o.n);
                pj3 pj3Var = this.x;
                if (u0 != null && !u0.n.equals(yb3Var2.n)) {
                    a().u.e("Updating a conditional user property with different origin. name, origin, origin (from DB)", pj3Var.v.c(yb3Var2.o.n), yb3Var2.n, u0.n);
                }
                if (u0 != null && u0.q) {
                    yb3Var2.n = u0.n;
                    yb3Var2.p = u0.p;
                    yb3Var2.t = u0.t;
                    yb3Var2.r = u0.r;
                    yb3Var2.u = u0.u;
                    yb3Var2.q = true;
                    tq3 tq3Var = yb3Var2.o;
                    yb3Var2.o = new tq3(u0.o.o, tq3Var.a(), tq3Var.n, u0.o.r);
                } else if (TextUtils.isEmpty(yb3Var2.r)) {
                    tq3 tq3Var2 = yb3Var2.o;
                    yb3Var2.o = new tq3(yb3Var2.p, tq3Var2.a(), tq3Var2.n, yb3Var2.o.r);
                    yb3Var2.q = true;
                    z = true;
                }
                if (yb3Var2.q) {
                    tq3 tq3Var3 = yb3Var2.o;
                    String str2 = yb3Var2.m;
                    ll3.v(str2);
                    String str3 = yb3Var2.n;
                    String str4 = tq3Var3.n;
                    long j = tq3Var3.o;
                    Object a = tq3Var3.a();
                    ll3.v(a);
                    vq3 vq3Var = new vq3(str2, str3, str4, j, a);
                    Object obj = vq3Var.e;
                    String str5 = vq3Var.c;
                    tc3 tc3Var3 = this.o;
                    U(tc3Var3);
                    if (tc3Var3.p0(vq3Var)) {
                        a().y.e("User property updated immediately", yb3Var2.m, pj3Var.v.c(str5), obj);
                    } else {
                        a().r.e("(2)Too many active user properties, ignoring", vh3.E(yb3Var2.m), pj3Var.v.c(str5), obj);
                    }
                    if (z && (kd3Var = yb3Var2.u) != null) {
                        l(new kd3(kd3Var, yb3Var2.p), cs3Var);
                    }
                }
                tc3 tc3Var4 = this.o;
                U(tc3Var4);
                if (tc3Var4.t0(yb3Var2)) {
                    a().y.e("Conditional property added", yb3Var2.m, pj3Var.v.c(yb3Var2.o.n), yb3Var2.o.a());
                } else {
                    a().r.e("Too many conditional properties, ignoring", vh3.E(yb3Var2.m), pj3Var.v.c(yb3Var2.o.n), yb3Var2.o.a());
                }
                tc3 tc3Var5 = this.o;
                U(tc3Var5);
                tc3Var5.j0();
                tc3 tc3Var6 = this.o;
                U(tc3Var6);
                tc3Var6.k0();
            } catch (Throwable th) {
                tc3 tc3Var7 = this.o;
                U(tc3Var7);
                tc3Var7.k0();
                throw th;
            }
        }
    }

    @Override // defpackage.qk3
    public final vh3 a() {
        pj3 pj3Var = this.x;
        ll3.v(pj3Var);
        vh3 vh3Var = pj3Var.r;
        pj3.m(vh3Var);
        return vh3Var;
    }

    public final void a0(yb3 yb3Var, cs3 cs3Var) {
        ll3.s(yb3Var.m);
        ll3.v(yb3Var.o);
        ll3.s(yb3Var.o.n);
        c().v();
        l0();
        if (T(cs3Var)) {
            if (!cs3Var.t) {
                c0(cs3Var);
                return;
            }
            tc3 tc3Var = this.o;
            U(tc3Var);
            tc3Var.i0();
            try {
                c0(cs3Var);
                String str = yb3Var.m;
                ll3.v(str);
                tc3 tc3Var2 = this.o;
                U(tc3Var2);
                yb3 u0 = tc3Var2.u0(str, yb3Var.o.n);
                pj3 pj3Var = this.x;
                if (u0 != null) {
                    a().y.d(yb3Var.m, pj3Var.v.c(yb3Var.o.n), "Removing conditional user property");
                    tc3 tc3Var3 = this.o;
                    U(tc3Var3);
                    tc3Var3.v0(str, yb3Var.o.n);
                    if (u0.q) {
                        tc3 tc3Var4 = this.o;
                        U(tc3Var4);
                        tc3Var4.o0(str, yb3Var.o.n);
                    }
                    kd3 kd3Var = yb3Var.w;
                    if (kd3Var != null) {
                        jd3 jd3Var = kd3Var.n;
                        kd3 Z = k0().Z(kd3Var.m, jd3Var != null ? jd3Var.d() : null, u0.n, kd3Var.p, true);
                        ll3.v(Z);
                        l(Z, cs3Var);
                    }
                } else {
                    a().u.d(vh3.E(yb3Var.m), pj3Var.v.c(yb3Var.o.n), "Conditional user property doesn't exist");
                }
                tc3 tc3Var5 = this.o;
                U(tc3Var5);
                tc3Var5.j0();
                tc3 tc3Var6 = this.o;
                U(tc3Var6);
                tc3Var6.k0();
            } catch (Throwable th) {
                tc3 tc3Var7 = this.o;
                U(tc3Var7);
                tc3Var7.k0();
                throw th;
            }
        }
    }

    public final xk3 b(String str) {
        xk3 xk3Var = xk3.c;
        c().v();
        l0();
        HashMap hashMap = this.N;
        xk3 xk3Var2 = (xk3) hashMap.get(str);
        if (xk3Var2 == null) {
            tc3 tc3Var = this.o;
            U(tc3Var);
            xk3Var2 = tc3Var.P(str);
            if (xk3Var2 == null) {
                xk3Var2 = xk3.c;
            }
            c().v();
            l0();
            hashMap.put(str, xk3Var2);
            tc3 tc3Var2 = this.o;
            U(tc3Var2);
            tc3Var2.R(str, xk3Var2);
        }
        return xk3Var2;
    }

    public final void b0(cs3 cs3Var, long j) {
        tc3 tc3Var = this.o;
        U(tc3Var);
        String str = cs3Var.m;
        ll3.v(str);
        di3 y0 = tc3Var.y0(str);
        if (y0 != null) {
            k0();
            String str2 = cs3Var.n;
            String G = y0.G();
            boolean isEmpty = TextUtils.isEmpty(str2);
            boolean isEmpty2 = TextUtils.isEmpty(G);
            if (!isEmpty && !isEmpty2) {
                ll3.v(str2);
                if (!str2.equals(G)) {
                    a().u.c(vh3.E(y0.D()), "New GMP App Id passed in. Removing cached database data. appId");
                    tc3 tc3Var2 = this.o;
                    U(tc3Var2);
                    pj3 pj3Var = (pj3) tc3Var2.m;
                    String D = y0.D();
                    tc3Var2.x();
                    tc3Var2.v();
                    ll3.s(D);
                    try {
                        SQLiteDatabase l0 = tc3Var2.l0();
                        String[] strArr = {D};
                        int delete = l0.delete("events", "app_id=?", strArr) + l0.delete("user_attributes", "app_id=?", strArr) + l0.delete("conditional_properties", "app_id=?", strArr) + l0.delete("apps", "app_id=?", strArr) + l0.delete("raw_events", "app_id=?", strArr) + l0.delete("raw_events_metadata", "app_id=?", strArr) + l0.delete("event_filters", "app_id=?", strArr) + l0.delete("property_filters", "app_id=?", strArr) + l0.delete("audience_filter_values", "app_id=?", strArr) + l0.delete("consent_settings", "app_id=?", strArr) + l0.delete("default_event_params", "app_id=?", strArr) + l0.delete("trigger_uris", "app_id=?", strArr);
                        if (pj3Var.p.G(null, ug3.h1)) {
                            delete += l0.delete("no_data_mode_events", "app_id=?", strArr);
                        }
                        if (delete > 0) {
                            vh3 vh3Var = pj3Var.r;
                            pj3.m(vh3Var);
                            vh3Var.z.d(D, Integer.valueOf(delete), "Deleted application data. app, records");
                        }
                    } catch (SQLiteException e) {
                        vh3 vh3Var2 = pj3Var.r;
                        pj3.m(vh3Var2);
                        vh3Var2.r.d(vh3.E(D), e, "Error deleting application data. appId, error");
                    }
                    y0 = null;
                }
            }
        }
        if (y0 != null) {
            boolean z = (y0.P() == -2147483648L || y0.P() == cs3Var.v) ? false : true;
            String N = y0.N();
            if (z || ((y0.P() != -2147483648L || N == null || N.equals(cs3Var.o)) ? false : true)) {
                Bundle bundle = new Bundle();
                bundle.putString("_pv", N);
                kd3 kd3Var = new kd3("_au", new jd3(bundle), "auto", j);
                if (e0().G(null, ug3.c1)) {
                    i(kd3Var, cs3Var);
                } else {
                    j(kd3Var, cs3Var);
                }
            }
        }
    }

    @Override // defpackage.qk3
    public final lj3 c() {
        pj3 pj3Var = this.x;
        ll3.v(pj3Var);
        lj3 lj3Var = pj3Var.s;
        pj3.m(lj3Var);
        return lj3Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x019f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final di3 c0(cs3 cs3Var) {
        boolean z;
        String str;
        long j;
        String str2;
        String str3;
        String str4;
        c().v();
        l0();
        ll3.v(cs3Var);
        boolean z2 = cs3Var.z;
        String str5 = cs3Var.m;
        ll3.s(str5);
        String str6 = cs3Var.F;
        if (!str6.isEmpty()) {
            this.P.put(str5, new kq3(this, str6));
        }
        tc3 tc3Var = this.o;
        U(tc3Var);
        di3 y0 = tc3Var.y0(str5);
        xk3 j2 = b(str5).j(xk3.c(100, cs3Var.E));
        vk3 vk3Var = vk3.AD_STORAGE;
        String B = j2.i(vk3Var) ? this.u.B(str5, z2) : BuildConfig.FLAVOR;
        boolean z3 = true;
        vk3 vk3Var2 = vk3.ANALYTICS_STORAGE;
        if (y0 == null) {
            y0 = new di3(this.x, str5);
            if (j2.i(vk3Var2)) {
                y0.F(o(j2));
            }
            if (j2.i(vk3Var)) {
                y0.I(B);
            }
        } else {
            pj3 pj3Var = y0.a;
            if (j2.i(vk3Var) && B != null) {
                lj3 lj3Var = pj3Var.s;
                pj3.m(lj3Var);
                lj3Var.v();
                if (!B.equals(y0.e)) {
                    lj3 lj3Var2 = pj3Var.s;
                    pj3.m(lj3Var2);
                    lj3Var2.v();
                    boolean isEmpty = TextUtils.isEmpty(y0.e);
                    y0.I(B);
                    if (z2) {
                        lo3 lo3Var = this.u;
                        lo3Var.getClass();
                        if (!"00000000-0000-0000-0000-000000000000".equals((j2.i(vk3Var) ? lo3Var.A(str5) : new Pair(BuildConfig.FLAVOR, Boolean.FALSE)).first) && !isEmpty) {
                            if (j2.i(vk3Var2)) {
                                y0.F(o(j2));
                                z = false;
                            } else {
                                z = true;
                            }
                            tc3 tc3Var2 = this.o;
                            U(tc3Var2);
                            if (tc3Var2.q0(str5, "_id") != null) {
                                tc3 tc3Var3 = this.o;
                                U(tc3Var3);
                                if (tc3Var3.q0(str5, "_lair") == null) {
                                    e().getClass();
                                    vq3 vq3Var = new vq3(str5, "auto", "_lair", System.currentTimeMillis(), 1L);
                                    tc3 tc3Var4 = this.o;
                                    U(tc3Var4);
                                    tc3Var4.p0(vq3Var);
                                }
                            }
                            pj3 pj3Var2 = y0.a;
                            y0.H(cs3Var.n);
                            str = cs3Var.w;
                            if (!TextUtils.isEmpty(str)) {
                                y0.K(str);
                            }
                            j = cs3Var.q;
                            if (j != 0) {
                                y0.S(j);
                            }
                            str2 = cs3Var.o;
                            if (!TextUtils.isEmpty(str2)) {
                                y0.O(str2);
                            }
                            y0.Q(cs3Var.v);
                            str3 = cs3Var.p;
                            if (str3 != null) {
                                y0.R(str3);
                            }
                            y0.a(cs3Var.r);
                            y0.d(cs3Var.t);
                            str4 = cs3Var.s;
                            if (!TextUtils.isEmpty(str4)) {
                                y0.v(str4);
                            }
                            lj3 lj3Var3 = pj3Var2.s;
                            pj3.m(lj3Var3);
                            lj3Var3.v();
                            y0.Q |= y0.p == z2;
                            y0.p = z2;
                            Boolean bool = cs3Var.B;
                            lj3 lj3Var4 = pj3Var2.s;
                            pj3.m(lj3Var4);
                            lj3Var4.v();
                            y0.Q |= !Objects.equals(y0.q, bool);
                            y0.q = bool;
                            y0.c(cs3Var.C);
                            String str7 = cs3Var.G;
                            lj3 lj3Var5 = pj3Var2.s;
                            pj3.m(lj3Var5);
                            lj3Var5.v();
                            y0.Q |= !Objects.equals(y0.t, str7);
                            y0.t = str7;
                            br3 br3Var = br3.n;
                            if (e0().G(null, ug3.L0)) {
                                if (e0().G(null, ug3.K0)) {
                                    y0.x(null);
                                }
                            } else {
                                y0.x(cs3Var.D);
                            }
                            boolean z4 = cs3Var.H;
                            lj3 lj3Var6 = pj3Var2.s;
                            pj3.m(lj3Var6);
                            lj3Var6.v();
                            y0.Q |= y0.u == z4;
                            y0.u = z4;
                            String str8 = cs3Var.N;
                            lj3 lj3Var7 = pj3Var2.s;
                            pj3.m(lj3Var7);
                            lj3Var7.v();
                            y0.Q |= y0.C == str8;
                            y0.C = str8;
                            vr3.a();
                            if (e0().G(null, ug3.P0)) {
                                int i = cs3Var.L;
                                lj3 lj3Var8 = pj3Var2.s;
                                pj3.m(lj3Var8);
                                lj3Var8.v();
                                y0.Q |= y0.x != i;
                                y0.x = i;
                            }
                            y0.z(cs3Var.I);
                            String str9 = cs3Var.O;
                            lj3 lj3Var9 = pj3Var2.s;
                            pj3.m(lj3Var9);
                            lj3Var9.v();
                            y0.Q |= y0.G == str9;
                            y0.G = str9;
                            int i2 = cs3Var.Q;
                            lj3 lj3Var10 = pj3Var2.s;
                            pj3.m(lj3Var10);
                            lj3Var10.v();
                            y0.Q |= y0.I != i2;
                            y0.I = i2;
                            if (!y0.o()) {
                                z3 = z;
                            } else if (!z) {
                                return y0;
                            }
                            tc3 tc3Var5 = this.o;
                            U(tc3Var5);
                            tc3Var5.z0(y0, z3);
                            return y0;
                        }
                    }
                    if (TextUtils.isEmpty(y0.E()) && j2.i(vk3Var2)) {
                        y0.F(o(j2));
                    }
                }
            }
            if (TextUtils.isEmpty(y0.E()) && j2.i(vk3Var2)) {
                y0.F(o(j2));
            }
        }
        z = false;
        pj3 pj3Var22 = y0.a;
        y0.H(cs3Var.n);
        str = cs3Var.w;
        if (!TextUtils.isEmpty(str)) {
        }
        j = cs3Var.q;
        if (j != 0) {
        }
        str2 = cs3Var.o;
        if (!TextUtils.isEmpty(str2)) {
        }
        y0.Q(cs3Var.v);
        str3 = cs3Var.p;
        if (str3 != null) {
        }
        y0.a(cs3Var.r);
        y0.d(cs3Var.t);
        str4 = cs3Var.s;
        if (!TextUtils.isEmpty(str4)) {
        }
        lj3 lj3Var32 = pj3Var22.s;
        pj3.m(lj3Var32);
        lj3Var32.v();
        y0.Q |= y0.p == z2;
        y0.p = z2;
        Boolean bool2 = cs3Var.B;
        lj3 lj3Var42 = pj3Var22.s;
        pj3.m(lj3Var42);
        lj3Var42.v();
        y0.Q |= !Objects.equals(y0.q, bool2);
        y0.q = bool2;
        y0.c(cs3Var.C);
        String str72 = cs3Var.G;
        lj3 lj3Var52 = pj3Var22.s;
        pj3.m(lj3Var52);
        lj3Var52.v();
        y0.Q |= !Objects.equals(y0.t, str72);
        y0.t = str72;
        br3 br3Var2 = br3.n;
        if (e0().G(null, ug3.L0)) {
        }
        boolean z42 = cs3Var.H;
        lj3 lj3Var62 = pj3Var22.s;
        pj3.m(lj3Var62);
        lj3Var62.v();
        y0.Q |= y0.u == z42;
        y0.u = z42;
        String str82 = cs3Var.N;
        lj3 lj3Var72 = pj3Var22.s;
        pj3.m(lj3Var72);
        lj3Var72.v();
        y0.Q |= y0.C == str82;
        y0.C = str82;
        vr3.a();
        if (e0().G(null, ug3.P0)) {
        }
        y0.z(cs3Var.I);
        String str92 = cs3Var.O;
        lj3 lj3Var92 = pj3Var22.s;
        pj3.m(lj3Var92);
        lj3Var92.v();
        y0.Q |= y0.G == str92;
        y0.G = str92;
        int i22 = cs3Var.Q;
        lj3 lj3Var102 = pj3Var22.s;
        pj3.m(lj3Var102);
        lj3Var102.v();
        y0.Q |= y0.I != i22;
        y0.I = i22;
        if (!y0.o()) {
        }
        tc3 tc3Var52 = this.o;
        U(tc3Var52);
        tc3Var52.z0(y0, z3);
        return y0;
    }

    @Override // defpackage.qk3
    public final Context d() {
        return this.x.m;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List] */
    public final List d0(Bundle bundle, cs3 cs3Var) {
        int[] iArr;
        c().v();
        vr3.a();
        ec3 e0 = e0();
        String str = cs3Var.m;
        if (!e0.G(str, ug3.P0) || str == null) {
            return new ArrayList();
        }
        if (bundle != null) {
            int[] intArray = bundle.getIntArray("uriSources");
            long[] longArray = bundle.getLongArray("uriTimestamps");
            if (intArray != null) {
                if (longArray == null || longArray.length != intArray.length) {
                    a().r.b("Uri sources and timestamps do not match");
                } else {
                    int i = 0;
                    while (i < intArray.length) {
                        tc3 tc3Var = this.o;
                        U(tc3Var);
                        pj3 pj3Var = (pj3) tc3Var.m;
                        int i2 = intArray[i];
                        long j = longArray[i];
                        ll3.s(str);
                        tc3Var.v();
                        tc3Var.x();
                        try {
                            iArr = intArray;
                        } catch (SQLiteException e) {
                            e = e;
                            iArr = intArray;
                        }
                        try {
                            int delete = tc3Var.l0().delete("trigger_uris", "app_id=? and source=? and timestamp_millis<=?", new String[]{str, String.valueOf(i2), String.valueOf(j)});
                            vh3 vh3Var = pj3Var.r;
                            pj3.m(vh3Var);
                            g10 g10Var = vh3Var.z;
                            StringBuilder sb = new StringBuilder(String.valueOf(delete).length() + 46);
                            sb.append("Pruned ");
                            sb.append(delete);
                            sb.append(" trigger URIs. appId, source, timestamp");
                            g10Var.e(sb.toString(), str, Integer.valueOf(i2), Long.valueOf(j));
                        } catch (SQLiteException e2) {
                            e = e2;
                            vh3 vh3Var2 = pj3Var.r;
                            pj3.m(vh3Var2);
                            vh3Var2.r.d(vh3.E(str), e, "Error pruning trigger URIs. appId");
                            i++;
                            intArray = iArr;
                        }
                        i++;
                        intArray = iArr;
                    }
                }
            }
        }
        tc3 tc3Var2 = this.o;
        U(tc3Var2);
        String str2 = cs3Var.m;
        ll3.s(str2);
        tc3Var2.v();
        tc3Var2.x();
        ?? arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                cursor = tc3Var2.l0().query("trigger_uris", new String[]{"trigger_uri", "timestamp_millis", "source"}, "app_id=?", new String[]{str2}, null, null, "rowid", null);
                if (cursor.moveToFirst()) {
                    do {
                        String string = cursor.getString(0);
                        if (string == null) {
                            string = BuildConfig.FLAVOR;
                        }
                        arrayList.add(new ip3(string, cursor.getInt(2), cursor.getLong(1)));
                    } while (cursor.moveToNext());
                }
            } catch (Throwable th) {
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (SQLiteException e3) {
            vh3 vh3Var3 = ((pj3) tc3Var2.m).r;
            pj3.m(vh3Var3);
            vh3Var3.r.d(vh3.E(str2), e3, "Error querying trigger uris. appId");
            arrayList = Collections.EMPTY_LIST;
        }
        if (cursor != null) {
            cursor.close();
        }
        return arrayList;
    }

    @Override // defpackage.qk3
    public final qb2 e() {
        pj3 pj3Var = this.x;
        ll3.v(pj3Var);
        return pj3Var.w;
    }

    public final ec3 e0() {
        pj3 pj3Var = this.x;
        ll3.v(pj3Var);
        return pj3Var.p;
    }

    @Override // defpackage.qk3
    public final dq2 f() {
        return this.x.o;
    }

    public final dj3 f0() {
        dj3 dj3Var = this.m;
        U(dj3Var);
        return dj3Var;
    }

    public final long g() {
        e().getClass();
        long currentTimeMillis = System.currentTimeMillis();
        lo3 lo3Var = this.u;
        lo3Var.x();
        lo3Var.v();
        li3 li3Var = lo3Var.v;
        long a = li3Var.a();
        if (a == 0) {
            pj3.k(((pj3) lo3Var.m).u);
            a = r7.u0().nextInt(86400000) + 1;
            li3Var.b(a);
        }
        return ((((currentTimeMillis + a) / 1000) / 60) / 60) / 24;
    }

    public final tc3 g0() {
        tc3 tc3Var = this.o;
        U(tc3Var);
        return tc3Var;
    }

    public final void h(String str, kd3 kd3Var) {
        tc3 tc3Var = this.o;
        U(tc3Var);
        di3 y0 = tc3Var.y0(str);
        if (y0 != null) {
            pj3 pj3Var = y0.a;
            if (!TextUtils.isEmpty(y0.N())) {
                Boolean P = P(y0);
                if (P == null) {
                    if (!"_ui".equals(kd3Var.m)) {
                        a().u.c(vh3.E(str), "Could not find package. appId");
                    }
                } else if (!P.booleanValue()) {
                    a().r.c(vh3.E(str), "App version does not match; dropping event. appId");
                    return;
                }
                String G = y0.G();
                String N = y0.N();
                long P2 = y0.P();
                lj3 lj3Var = pj3Var.s;
                pj3.m(lj3Var);
                lj3Var.v();
                String str2 = y0.l;
                lj3 lj3Var2 = pj3Var.s;
                pj3.m(lj3Var2);
                lj3Var2.v();
                long j = y0.m;
                lj3 lj3Var3 = pj3Var.s;
                pj3.m(lj3Var3);
                lj3Var3.v();
                long j2 = y0.n;
                lj3 lj3Var4 = pj3Var.s;
                pj3.m(lj3Var4);
                lj3Var4.v();
                boolean z = y0.o;
                String J = y0.J();
                lj3 lj3Var5 = pj3Var.s;
                pj3.m(lj3Var5);
                lj3Var5.v();
                boolean z2 = y0.p;
                Boolean w = y0.w();
                long b = y0.b();
                lj3 lj3Var6 = pj3Var.s;
                pj3.m(lj3Var6);
                lj3Var6.v();
                ArrayList arrayList = y0.s;
                String g = b(str).g();
                boolean y = y0.y();
                lj3 lj3Var7 = pj3Var.s;
                pj3.m(lj3Var7);
                lj3Var7.v();
                long j3 = y0.v;
                int i = b(str).b;
                String str3 = o0(str).b;
                lj3 lj3Var8 = pj3Var.s;
                pj3.m(lj3Var8);
                lj3Var8.v();
                int i2 = y0.x;
                lj3 lj3Var9 = pj3Var.s;
                pj3.m(lj3Var9);
                lj3Var9.v();
                i(kd3Var, new cs3(str, G, N, P2, str2, j, j2, (String) null, z, false, J, 0L, 0, z2, false, w, b, (List) arrayList, g, BuildConfig.FLAVOR, (String) null, y, j3, i, str3, i2, y0.B, y0.C(), y0.s(), 0L, y0.t()));
                return;
            }
        }
        a().y.c(str, "No app data available; dropping event");
    }

    public final hi3 h0() {
        hi3 hi3Var = this.p;
        if (hi3Var != null) {
            return hi3Var;
        }
        lh.g("Network broadcast receiver not created");
        return null;
    }

    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0080: MOVE (r5 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]) (LINE:129), block:B:37:0x0080 */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(kd3 kd3Var, cs3 cs3Var) {
        Throwable th;
        Cursor cursor;
        Cursor cursor2;
        Bundle bundle;
        kd3 e;
        jd3 jd3Var;
        String str = cs3Var.m;
        ll3.s(str);
        w62 c = w62.c(kd3Var);
        Bundle bundle2 = (Bundle) c.e;
        zq3 k0 = k0();
        tc3 tc3Var = this.o;
        U(tc3Var);
        pj3 pj3Var = (pj3) tc3Var.m;
        tc3Var.v();
        tc3Var.x();
        Cursor cursor3 = null;
        try {
            try {
                cursor = tc3Var.l0().rawQuery("select parameters from default_event_params where app_id=?", new String[]{str});
                try {
                } catch (SQLiteException e2) {
                    e = e2;
                    vh3 vh3Var = pj3Var.r;
                    pj3.m(vh3Var);
                    vh3Var.r.c(e, "Error selecting default event parameters");
                    if (cursor != null) {
                    }
                    bundle = null;
                    k0.H(bundle2, bundle);
                    zq3 k02 = k0();
                    ec3 e0 = e0();
                    e0.getClass();
                    k02.F(c, Math.max(Math.min(e0.E(str, ug3.X), 100), 25));
                    e = c.e();
                    if (!e0().G(null, ug3.f1)) {
                    }
                    j(e, cs3Var);
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
        } catch (SQLiteException e3) {
            e = e3;
            cursor = null;
        } catch (Throwable th3) {
            th = th3;
            if (cursor3 != null) {
            }
        }
        if (cursor.moveToFirst()) {
            try {
                cj3 cj3Var = (cj3) ((bj3) bi3.j0(cj3.z(), cursor.getBlob(0))).d();
                tc3Var.n.j0();
                bundle = bi3.D(cj3Var.p());
                cursor.close();
            } catch (IOException e4) {
                vh3 vh3Var2 = pj3Var.r;
                pj3.m(vh3Var2);
                vh3Var2.r.d(vh3.E(str), e4, "Failed to retrieve default event parameters. appId");
            }
            k0.H(bundle2, bundle);
            zq3 k022 = k0();
            ec3 e02 = e0();
            e02.getClass();
            k022.F(c, Math.max(Math.min(e02.E(str, ug3.X), 100), 25));
            e = c.e();
            if (!e0().G(null, ug3.f1) && Constants.ScionAnalytics.EVENT_FIREBASE_CAMPAIGN.equals(e.m)) {
                jd3Var = e.n;
                if ("referrer API v2".equals(jd3Var.m.getString("_cis"))) {
                    String string = jd3Var.m.getString("gclid");
                    if (!TextUtils.isEmpty(string)) {
                        W(new tq3(e.p, string, "_lgclid", "auto"), cs3Var);
                    }
                }
            }
            j(e, cs3Var);
        }
        vh3 vh3Var3 = pj3Var.r;
        pj3.m(vh3Var3);
        vh3Var3.z.b("Default event parameters not found");
        if (cursor != null) {
            cursor.close();
        }
        bundle = null;
        k0.H(bundle2, bundle);
        zq3 k0222 = k0();
        ec3 e022 = e0();
        e022.getClass();
        k0222.F(c, Math.max(Math.min(e022.E(str, ug3.X), 100), 25));
        e = c.e();
        if (!e0().G(null, ug3.f1)) {
            jd3Var = e.n;
            if ("referrer API v2".equals(jd3Var.m.getString("_cis"))) {
            }
        }
        j(e, cs3Var);
    }

    public final nb3 i0() {
        nb3 nb3Var = this.r;
        U(nb3Var);
        return nb3Var;
    }

    public final void j(kd3 kd3Var, cs3 cs3Var) {
        kd3 kd3Var2;
        List x0;
        pj3 pj3Var;
        List x02;
        List<yb3> x03;
        String str;
        ll3.v(cs3Var);
        String str2 = cs3Var.m;
        ll3.s(str2);
        c().v();
        l0();
        long j = kd3Var.p;
        w62 c = w62.c(kd3Var);
        c().v();
        zq3.o0((this.R == null || (str = this.S) == null || !str.equals(str2)) ? null : this.R, (Bundle) c.e, false);
        kd3 e = c.e();
        j0();
        if (TextUtils.isEmpty(cs3Var.n)) {
            return;
        }
        if (!cs3Var.t) {
            c0(cs3Var);
            return;
        }
        List list = cs3Var.D;
        if (list != null) {
            String str3 = e.m;
            if (!list.contains(str3)) {
                a().y.e("Dropping non-safelisted event. appId, event name, origin", str2, e.m, e.o);
                return;
            } else {
                Bundle d = e.n.d();
                d.putLong("ga_safelisted", 1L);
                kd3Var2 = new kd3(str3, new jd3(d), e.o, e.p);
            }
        } else {
            kd3Var2 = e;
        }
        tc3 tc3Var = this.o;
        U(tc3Var);
        tc3Var.i0();
        try {
            String str4 = kd3Var2.m;
            if ("_s".equals(str4)) {
                tc3 tc3Var2 = this.o;
                U(tc3Var2);
                if (!tc3Var2.L(str2, "_s") && kd3Var2.n.m.getLong("_sid") != 0) {
                    tc3 tc3Var3 = this.o;
                    U(tc3Var3);
                    if (!tc3Var3.L(str2, "_f")) {
                        tc3 tc3Var4 = this.o;
                        U(tc3Var4);
                        if (!tc3Var4.L(str2, "_v")) {
                            tc3 tc3Var5 = this.o;
                            U(tc3Var5);
                            e().getClass();
                            tc3Var5.O(str2, Long.valueOf(System.currentTimeMillis() - 15000), "_sid", k(str2, kd3Var2));
                        }
                    }
                    tc3 tc3Var6 = this.o;
                    U(tc3Var6);
                    tc3Var6.O(str2, null, "_sid", k(str2, kd3Var2));
                }
            }
            tc3 tc3Var7 = this.o;
            U(tc3Var7);
            ll3.s(str2);
            tc3Var7.v();
            tc3Var7.x();
            if (j < 0) {
                vh3 vh3Var = ((pj3) tc3Var7.m).r;
                pj3.m(vh3Var);
                vh3Var.u.d(vh3.E(str2), Long.valueOf(j), "Invalid time querying timed out conditional properties");
                x0 = Collections.EMPTY_LIST;
            } else {
                x0 = tc3Var7.x0("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{str2, String.valueOf(j)});
            }
            Iterator it = x0.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                pj3Var = this.x;
                if (!hasNext) {
                    break;
                }
                yb3 yb3Var = (yb3) it.next();
                if (yb3Var != null) {
                    a().z.e("User property timed out", yb3Var.m, pj3Var.v.c(yb3Var.o.n), yb3Var.o.a());
                    kd3 kd3Var3 = yb3Var.s;
                    if (kd3Var3 != null) {
                        l(new kd3(kd3Var3, j), cs3Var);
                    }
                    tc3 tc3Var8 = this.o;
                    U(tc3Var8);
                    tc3Var8.v0(str2, yb3Var.o.n);
                }
            }
            tc3 tc3Var9 = this.o;
            U(tc3Var9);
            ll3.s(str2);
            tc3Var9.v();
            tc3Var9.x();
            if (j < 0) {
                vh3 vh3Var2 = ((pj3) tc3Var9.m).r;
                pj3.m(vh3Var2);
                vh3Var2.u.d(vh3.E(str2), Long.valueOf(j), "Invalid time querying expired conditional properties");
                x02 = Collections.EMPTY_LIST;
            } else {
                x02 = tc3Var9.x0("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{str2, String.valueOf(j)});
            }
            ArrayList arrayList = new ArrayList(x02.size());
            Iterator it2 = x02.iterator();
            while (it2.hasNext()) {
                yb3 yb3Var2 = (yb3) it2.next();
                if (yb3Var2 != null) {
                    Iterator it3 = it2;
                    a().z.e("User property expired", yb3Var2.m, pj3Var.v.c(yb3Var2.o.n), yb3Var2.o.a());
                    tc3 tc3Var10 = this.o;
                    U(tc3Var10);
                    tc3Var10.o0(str2, yb3Var2.o.n);
                    kd3 kd3Var4 = yb3Var2.w;
                    if (kd3Var4 != null) {
                        arrayList.add(kd3Var4);
                    }
                    tc3 tc3Var11 = this.o;
                    U(tc3Var11);
                    tc3Var11.v0(str2, yb3Var2.o.n);
                    it2 = it3;
                }
            }
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                l(new kd3((kd3) obj, j), cs3Var);
            }
            tc3 tc3Var12 = this.o;
            U(tc3Var12);
            ll3.s(str2);
            ll3.s(str4);
            tc3Var12.v();
            tc3Var12.x();
            if (j < 0) {
                pj3 pj3Var2 = (pj3) tc3Var12.m;
                vh3 vh3Var3 = pj3Var2.r;
                pj3.m(vh3Var3);
                vh3Var3.u.e("Invalid time querying triggered conditional properties", vh3.E(str2), pj3Var2.v.a(str4), Long.valueOf(j));
                x03 = Collections.EMPTY_LIST;
            } else {
                x03 = tc3Var12.x0("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{str2, str4, String.valueOf(j)});
            }
            ArrayList arrayList2 = new ArrayList(x03.size());
            for (yb3 yb3Var3 : x03) {
                if (yb3Var3 != null) {
                    tq3 tq3Var = yb3Var3.o;
                    String str5 = yb3Var3.m;
                    ll3.v(str5);
                    String str6 = yb3Var3.n;
                    String str7 = tq3Var.n;
                    Object a = tq3Var.a();
                    ll3.v(a);
                    vq3 vq3Var = new vq3(str5, str6, str7, j, a);
                    Object obj2 = vq3Var.e;
                    String str8 = vq3Var.c;
                    tc3 tc3Var13 = this.o;
                    U(tc3Var13);
                    if (tc3Var13.p0(vq3Var)) {
                        a().z.e("User property triggered", yb3Var3.m, pj3Var.v.c(str8), obj2);
                    } else {
                        a().r.e("Too many active user properties, ignoring", vh3.E(yb3Var3.m), pj3Var.v.c(str8), obj2);
                    }
                    kd3 kd3Var5 = yb3Var3.u;
                    if (kd3Var5 != null) {
                        arrayList2.add(kd3Var5);
                    }
                    yb3Var3.o = new tq3(vq3Var);
                    yb3Var3.q = true;
                    tc3 tc3Var14 = this.o;
                    U(tc3Var14);
                    tc3Var14.t0(yb3Var3);
                }
            }
            l(kd3Var2, cs3Var);
            int size2 = arrayList2.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj3 = arrayList2.get(i2);
                i2++;
                l(new kd3((kd3) obj3, j), cs3Var);
            }
            tc3 tc3Var15 = this.o;
            U(tc3Var15);
            tc3Var15.j0();
            tc3 tc3Var16 = this.o;
            U(tc3Var16);
            tc3Var16.k0();
        } catch (Throwable th) {
            tc3 tc3Var17 = this.o;
            U(tc3Var17);
            tc3Var17.k0();
            throw th;
        }
    }

    public final bi3 j0() {
        bi3 bi3Var = this.s;
        U(bi3Var);
        return bi3Var;
    }

    public final Bundle k(String str, kd3 kd3Var) {
        Bundle bundle = new Bundle();
        bundle.putLong("_sid", kd3Var.n.m.getLong("_sid"));
        tc3 tc3Var = this.o;
        U(tc3Var);
        vq3 q0 = tc3Var.q0(str, "_sno");
        if (q0 != null) {
            Object obj = q0.e;
            if (obj instanceof Long) {
                bundle.putLong("_sno", ((Long) obj).longValue());
            }
        }
        return bundle;
    }

    public final zq3 k0() {
        pj3 pj3Var = this.x;
        ll3.v(pj3Var);
        zq3 zq3Var = pj3Var.u;
        pj3.k(zq3Var);
        return zq3Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(18:393|(2:395|(12:397|398|399|(8:401|58|(0)(0)|61|62|(0)(0)|68|69)|57|58|(0)(0)|61|62|(0)(0)|68|69))|402|403|404|405|406|398|399|(0)|57|58|(0)(0)|61|62|(0)(0)|68|69) */
    /* JADX WARN: Can't wrap try/catch for region: R(70:(2:71|(3:73|(1:75)|76))|77|(2:79|(3:81|(1:83)|84))|85|86|(1:88)|89|(2:93|(1:95))|96|(2:102|(2:104|105))|108|(3:109|110|111)|112|(1:114)|115|(2:117|(2:121|122)(1:120))(1:358)|123|124|(1:126)|127|(1:129)(1:357)|130|(1:132)(1:356)|133|(1:135)(1:355)|136|(1:138)(1:354)|139|140|(1:142)(1:353)|143|144|(2:146|(41:148|(1:152)|153|(1:155)(1:351)|156|(1:158)(15:322|(1:324)(1:350)|325|(1:327)(1:349)|328|(1:330)(1:348)|331|(1:333)(1:347)|334|(1:336)(1:346)|337|(1:339)(1:345)|340|(1:342)(1:344)|343)|159|(1:161)|162|(1:164)(1:321)|(1:320)(33:168|(2:169|(3:171|(3:173|174|(2:176|(2:178|180)(1:311))(1:313))(1:317)|312)(2:318|319))|181|(1:183)|(1:186)|187|(1:189)|190|(5:193|194|(1:196)(1:307)|197|(4:199|(1:201)|202|(2:208|(28:210|(1:212)(1:306)|213|(1:215)|216|217|(2:219|(1:221)(2:222|223))|224|(7:226|227|228|229|(1:231)|232|233)(1:305)|234|(1:238)|239|(1:241)|242|(6:245|(2:247|(5:249|(1:251)(1:258)|252|(2:254|255)(1:257)|256))|259|260|256|243)|261|262|263|264|265|(2:266|(2:268|(1:270)(1:286))(3:287|288|(1:293)(1:292)))|272|273|274|(1:276)(2:282|283)|277|278|279))))|310|217|(0)|224|(0)(0)|234|(2:236|238)|239|(0)|242|(1:243)|261|262|263|264|265|(3:266|(0)(0)|286)|272|273|274|(0)(0)|277|278|279)|184|(0)|187|(0)|190|(5:193|194|(0)(0)|197|(0))|310|217|(0)|224|(0)(0)|234|(0)|239|(0)|242|(1:243)|261|262|263|264|265|(3:266|(0)(0)|286)|272|273|274|(0)(0)|277|278|279))|352|159|(0)|162|(0)(0)|(1:166)|320|184|(0)|187|(0)|190|(0)|310|217|(0)|224|(0)(0)|234|(0)|239|(0)|242|(1:243)|261|262|263|264|265|(3:266|(0)(0)|286)|272|273|274|(0)(0)|277|278|279) */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x0b88, code lost:
    
        r13 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x0c32, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x0c39, code lost:
    
        ((defpackage.pj3) r1.m).a().A().d(defpackage.vh3.E(r3.a), r0, "Error storing raw event. appId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:299:0x0c51, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x0c6e, code lost:
    
        r5.a().A().d(defpackage.vh3.E(r4.n()), r0, "Data loss. Failed to insert raw event metadata. appId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:408:0x02fd, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:409:0x02fe, code lost:
    
        ((defpackage.pj3) r10.m).a().A().d(defpackage.vh3.E(r13), r0, "Error pruning currencies. appId");
     */
    /* JADX WARN: Removed duplicated region for block: B:161:0x07bc A[Catch: all -> 0x01eb, TryCatch #6 {all -> 0x01eb, blocks: (B:43:0x01cc, B:46:0x01d9, B:48:0x01e1, B:51:0x01ef, B:58:0x036c, B:62:0x03a9, B:64:0x03e5, B:66:0x03ea, B:67:0x0401, B:71:0x040c, B:73:0x0426, B:75:0x042c, B:76:0x0443, B:79:0x0462, B:83:0x0484, B:84:0x049b, B:85:0x04a4, B:88:0x04c1, B:89:0x04d5, B:91:0x04dd, B:93:0x04e7, B:95:0x04ed, B:96:0x04f4, B:98:0x0501, B:100:0x0509, B:102:0x0511, B:105:0x0519, B:108:0x0525, B:110:0x0532, B:114:0x057a, B:115:0x058f, B:117:0x05bc, B:120:0x05e6, B:122:0x0636, B:124:0x0664, B:126:0x0691, B:127:0x0694, B:129:0x069a, B:130:0x06a2, B:132:0x06a8, B:133:0x06b0, B:135:0x06b6, B:138:0x06c5, B:140:0x06d4, B:142:0x06dd, B:143:0x06e5, B:146:0x0716, B:148:0x071f, B:152:0x0734, B:156:0x0741, B:161:0x07bc, B:162:0x07c3, B:164:0x07e6, B:166:0x07ef, B:168:0x07fa, B:169:0x0814, B:171:0x081a, B:174:0x0834, B:176:0x0840, B:178:0x084d, B:181:0x0882, B:186:0x088c, B:187:0x088f, B:189:0x089c, B:190:0x089f, B:201:0x08e3, B:315:0x086e, B:321:0x07e9, B:322:0x074a, B:325:0x0757, B:328:0x0765, B:331:0x0773, B:334:0x0781, B:337:0x078f, B:340:0x079b, B:343:0x07a9, B:358:0x0657, B:361:0x055f, B:362:0x037e, B:363:0x038a, B:365:0x0390, B:372:0x039e, B:376:0x020f, B:379:0x021d, B:381:0x0232, B:386:0x024a, B:389:0x027a, B:391:0x0280, B:393:0x028e, B:395:0x029c, B:397:0x02a5, B:399:0x032e, B:401:0x0338, B:403:0x02d2, B:405:0x02eb, B:406:0x0313, B:409:0x02fe, B:411:0x0256, B:413:0x0274), top: B:42:0x01cc, inners: #1, #8, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x07e6 A[Catch: all -> 0x01eb, TryCatch #6 {all -> 0x01eb, blocks: (B:43:0x01cc, B:46:0x01d9, B:48:0x01e1, B:51:0x01ef, B:58:0x036c, B:62:0x03a9, B:64:0x03e5, B:66:0x03ea, B:67:0x0401, B:71:0x040c, B:73:0x0426, B:75:0x042c, B:76:0x0443, B:79:0x0462, B:83:0x0484, B:84:0x049b, B:85:0x04a4, B:88:0x04c1, B:89:0x04d5, B:91:0x04dd, B:93:0x04e7, B:95:0x04ed, B:96:0x04f4, B:98:0x0501, B:100:0x0509, B:102:0x0511, B:105:0x0519, B:108:0x0525, B:110:0x0532, B:114:0x057a, B:115:0x058f, B:117:0x05bc, B:120:0x05e6, B:122:0x0636, B:124:0x0664, B:126:0x0691, B:127:0x0694, B:129:0x069a, B:130:0x06a2, B:132:0x06a8, B:133:0x06b0, B:135:0x06b6, B:138:0x06c5, B:140:0x06d4, B:142:0x06dd, B:143:0x06e5, B:146:0x0716, B:148:0x071f, B:152:0x0734, B:156:0x0741, B:161:0x07bc, B:162:0x07c3, B:164:0x07e6, B:166:0x07ef, B:168:0x07fa, B:169:0x0814, B:171:0x081a, B:174:0x0834, B:176:0x0840, B:178:0x084d, B:181:0x0882, B:186:0x088c, B:187:0x088f, B:189:0x089c, B:190:0x089f, B:201:0x08e3, B:315:0x086e, B:321:0x07e9, B:322:0x074a, B:325:0x0757, B:328:0x0765, B:331:0x0773, B:334:0x0781, B:337:0x078f, B:340:0x079b, B:343:0x07a9, B:358:0x0657, B:361:0x055f, B:362:0x037e, B:363:0x038a, B:365:0x0390, B:372:0x039e, B:376:0x020f, B:379:0x021d, B:381:0x0232, B:386:0x024a, B:389:0x027a, B:391:0x0280, B:393:0x028e, B:395:0x029c, B:397:0x02a5, B:399:0x032e, B:401:0x0338, B:403:0x02d2, B:405:0x02eb, B:406:0x0313, B:409:0x02fe, B:411:0x0256, B:413:0x0274), top: B:42:0x01cc, inners: #1, #8, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x088c A[Catch: all -> 0x01eb, TryCatch #6 {all -> 0x01eb, blocks: (B:43:0x01cc, B:46:0x01d9, B:48:0x01e1, B:51:0x01ef, B:58:0x036c, B:62:0x03a9, B:64:0x03e5, B:66:0x03ea, B:67:0x0401, B:71:0x040c, B:73:0x0426, B:75:0x042c, B:76:0x0443, B:79:0x0462, B:83:0x0484, B:84:0x049b, B:85:0x04a4, B:88:0x04c1, B:89:0x04d5, B:91:0x04dd, B:93:0x04e7, B:95:0x04ed, B:96:0x04f4, B:98:0x0501, B:100:0x0509, B:102:0x0511, B:105:0x0519, B:108:0x0525, B:110:0x0532, B:114:0x057a, B:115:0x058f, B:117:0x05bc, B:120:0x05e6, B:122:0x0636, B:124:0x0664, B:126:0x0691, B:127:0x0694, B:129:0x069a, B:130:0x06a2, B:132:0x06a8, B:133:0x06b0, B:135:0x06b6, B:138:0x06c5, B:140:0x06d4, B:142:0x06dd, B:143:0x06e5, B:146:0x0716, B:148:0x071f, B:152:0x0734, B:156:0x0741, B:161:0x07bc, B:162:0x07c3, B:164:0x07e6, B:166:0x07ef, B:168:0x07fa, B:169:0x0814, B:171:0x081a, B:174:0x0834, B:176:0x0840, B:178:0x084d, B:181:0x0882, B:186:0x088c, B:187:0x088f, B:189:0x089c, B:190:0x089f, B:201:0x08e3, B:315:0x086e, B:321:0x07e9, B:322:0x074a, B:325:0x0757, B:328:0x0765, B:331:0x0773, B:334:0x0781, B:337:0x078f, B:340:0x079b, B:343:0x07a9, B:358:0x0657, B:361:0x055f, B:362:0x037e, B:363:0x038a, B:365:0x0390, B:372:0x039e, B:376:0x020f, B:379:0x021d, B:381:0x0232, B:386:0x024a, B:389:0x027a, B:391:0x0280, B:393:0x028e, B:395:0x029c, B:397:0x02a5, B:399:0x032e, B:401:0x0338, B:403:0x02d2, B:405:0x02eb, B:406:0x0313, B:409:0x02fe, B:411:0x0256, B:413:0x0274), top: B:42:0x01cc, inners: #1, #8, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x089c A[Catch: all -> 0x01eb, TryCatch #6 {all -> 0x01eb, blocks: (B:43:0x01cc, B:46:0x01d9, B:48:0x01e1, B:51:0x01ef, B:58:0x036c, B:62:0x03a9, B:64:0x03e5, B:66:0x03ea, B:67:0x0401, B:71:0x040c, B:73:0x0426, B:75:0x042c, B:76:0x0443, B:79:0x0462, B:83:0x0484, B:84:0x049b, B:85:0x04a4, B:88:0x04c1, B:89:0x04d5, B:91:0x04dd, B:93:0x04e7, B:95:0x04ed, B:96:0x04f4, B:98:0x0501, B:100:0x0509, B:102:0x0511, B:105:0x0519, B:108:0x0525, B:110:0x0532, B:114:0x057a, B:115:0x058f, B:117:0x05bc, B:120:0x05e6, B:122:0x0636, B:124:0x0664, B:126:0x0691, B:127:0x0694, B:129:0x069a, B:130:0x06a2, B:132:0x06a8, B:133:0x06b0, B:135:0x06b6, B:138:0x06c5, B:140:0x06d4, B:142:0x06dd, B:143:0x06e5, B:146:0x0716, B:148:0x071f, B:152:0x0734, B:156:0x0741, B:161:0x07bc, B:162:0x07c3, B:164:0x07e6, B:166:0x07ef, B:168:0x07fa, B:169:0x0814, B:171:0x081a, B:174:0x0834, B:176:0x0840, B:178:0x084d, B:181:0x0882, B:186:0x088c, B:187:0x088f, B:189:0x089c, B:190:0x089f, B:201:0x08e3, B:315:0x086e, B:321:0x07e9, B:322:0x074a, B:325:0x0757, B:328:0x0765, B:331:0x0773, B:334:0x0781, B:337:0x078f, B:340:0x079b, B:343:0x07a9, B:358:0x0657, B:361:0x055f, B:362:0x037e, B:363:0x038a, B:365:0x0390, B:372:0x039e, B:376:0x020f, B:379:0x021d, B:381:0x0232, B:386:0x024a, B:389:0x027a, B:391:0x0280, B:393:0x028e, B:395:0x029c, B:397:0x02a5, B:399:0x032e, B:401:0x0338, B:403:0x02d2, B:405:0x02eb, B:406:0x0313, B:409:0x02fe, B:411:0x0256, B:413:0x0274), top: B:42:0x01cc, inners: #1, #8, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x08b3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:196:0x08c0 A[Catch: all -> 0x0944, TryCatch #2 {all -> 0x0944, blocks: (B:194:0x08b5, B:196:0x08c0, B:197:0x08ce, B:199:0x08d8, B:202:0x08ec, B:204:0x08f6, B:206:0x0902, B:208:0x090c, B:210:0x091a, B:212:0x0932, B:213:0x094b, B:215:0x0959, B:216:0x0962, B:217:0x096d, B:219:0x09b0, B:222:0x09bb, B:223:0x09c5, B:224:0x09c6, B:226:0x09d0, B:307:0x08c5), top: B:193:0x08b5 }] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x08d8 A[Catch: all -> 0x0944, TRY_LEAVE, TryCatch #2 {all -> 0x0944, blocks: (B:194:0x08b5, B:196:0x08c0, B:197:0x08ce, B:199:0x08d8, B:202:0x08ec, B:204:0x08f6, B:206:0x0902, B:208:0x090c, B:210:0x091a, B:212:0x0932, B:213:0x094b, B:215:0x0959, B:216:0x0962, B:217:0x096d, B:219:0x09b0, B:222:0x09bb, B:223:0x09c5, B:224:0x09c6, B:226:0x09d0, B:307:0x08c5), top: B:193:0x08b5 }] */
    /* JADX WARN: Removed duplicated region for block: B:219:0x09b0 A[Catch: all -> 0x0944, TryCatch #2 {all -> 0x0944, blocks: (B:194:0x08b5, B:196:0x08c0, B:197:0x08ce, B:199:0x08d8, B:202:0x08ec, B:204:0x08f6, B:206:0x0902, B:208:0x090c, B:210:0x091a, B:212:0x0932, B:213:0x094b, B:215:0x0959, B:216:0x0962, B:217:0x096d, B:219:0x09b0, B:222:0x09bb, B:223:0x09c5, B:224:0x09c6, B:226:0x09d0, B:307:0x08c5), top: B:193:0x08b5 }] */
    /* JADX WARN: Removed duplicated region for block: B:226:0x09d0 A[Catch: all -> 0x0944, TRY_LEAVE, TryCatch #2 {all -> 0x0944, blocks: (B:194:0x08b5, B:196:0x08c0, B:197:0x08ce, B:199:0x08d8, B:202:0x08ec, B:204:0x08f6, B:206:0x0902, B:208:0x090c, B:210:0x091a, B:212:0x0932, B:213:0x094b, B:215:0x0959, B:216:0x0962, B:217:0x096d, B:219:0x09b0, B:222:0x09bb, B:223:0x09c5, B:224:0x09c6, B:226:0x09d0, B:307:0x08c5), top: B:193:0x08b5 }] */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0a41 A[Catch: all -> 0x09fe, TryCatch #7 {all -> 0x09fe, blocks: (B:229:0x09d9, B:231:0x09f0, B:233:0x0a01, B:234:0x0a39, B:236:0x0a41, B:238:0x0a4b, B:239:0x0a55, B:241:0x0a5f, B:242:0x0a69, B:243:0x0a72, B:245:0x0a78, B:247:0x0ac2, B:249:0x0ad4, B:252:0x0af3, B:254:0x0b03, B:258:0x0ae3, B:262:0x0b16, B:264:0x0b58, B:265:0x0b63, B:266:0x0b76, B:268:0x0b7c, B:272:0x0bc3, B:274:0x0c0b, B:276:0x0c1c, B:277:0x0c83, B:283:0x0c36, B:285:0x0c39, B:288:0x0b8a, B:290:0x0bb0, B:296:0x0c54, B:297:0x0c6d, B:300:0x0c6e), top: B:228:0x09d9, inners: #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0a5f A[Catch: all -> 0x09fe, TryCatch #7 {all -> 0x09fe, blocks: (B:229:0x09d9, B:231:0x09f0, B:233:0x0a01, B:234:0x0a39, B:236:0x0a41, B:238:0x0a4b, B:239:0x0a55, B:241:0x0a5f, B:242:0x0a69, B:243:0x0a72, B:245:0x0a78, B:247:0x0ac2, B:249:0x0ad4, B:252:0x0af3, B:254:0x0b03, B:258:0x0ae3, B:262:0x0b16, B:264:0x0b58, B:265:0x0b63, B:266:0x0b76, B:268:0x0b7c, B:272:0x0bc3, B:274:0x0c0b, B:276:0x0c1c, B:277:0x0c83, B:283:0x0c36, B:285:0x0c39, B:288:0x0b8a, B:290:0x0bb0, B:296:0x0c54, B:297:0x0c6d, B:300:0x0c6e), top: B:228:0x09d9, inners: #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0a78 A[Catch: all -> 0x09fe, TryCatch #7 {all -> 0x09fe, blocks: (B:229:0x09d9, B:231:0x09f0, B:233:0x0a01, B:234:0x0a39, B:236:0x0a41, B:238:0x0a4b, B:239:0x0a55, B:241:0x0a5f, B:242:0x0a69, B:243:0x0a72, B:245:0x0a78, B:247:0x0ac2, B:249:0x0ad4, B:252:0x0af3, B:254:0x0b03, B:258:0x0ae3, B:262:0x0b16, B:264:0x0b58, B:265:0x0b63, B:266:0x0b76, B:268:0x0b7c, B:272:0x0bc3, B:274:0x0c0b, B:276:0x0c1c, B:277:0x0c83, B:283:0x0c36, B:285:0x0c39, B:288:0x0b8a, B:290:0x0bb0, B:296:0x0c54, B:297:0x0c6d, B:300:0x0c6e), top: B:228:0x09d9, inners: #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0b7c A[Catch: all -> 0x09fe, TryCatch #7 {all -> 0x09fe, blocks: (B:229:0x09d9, B:231:0x09f0, B:233:0x0a01, B:234:0x0a39, B:236:0x0a41, B:238:0x0a4b, B:239:0x0a55, B:241:0x0a5f, B:242:0x0a69, B:243:0x0a72, B:245:0x0a78, B:247:0x0ac2, B:249:0x0ad4, B:252:0x0af3, B:254:0x0b03, B:258:0x0ae3, B:262:0x0b16, B:264:0x0b58, B:265:0x0b63, B:266:0x0b76, B:268:0x0b7c, B:272:0x0bc3, B:274:0x0c0b, B:276:0x0c1c, B:277:0x0c83, B:283:0x0c36, B:285:0x0c39, B:288:0x0b8a, B:290:0x0bb0, B:296:0x0c54, B:297:0x0c6d, B:300:0x0c6e), top: B:228:0x09d9, inners: #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0c1c A[Catch: all -> 0x09fe, SQLiteException -> 0x0c32, TRY_LEAVE, TryCatch #5 {SQLiteException -> 0x0c32, blocks: (B:274:0x0c0b, B:276:0x0c1c), top: B:273:0x0c0b, outer: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0c34  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0b8a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0a36  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x08c5 A[Catch: all -> 0x0944, TryCatch #2 {all -> 0x0944, blocks: (B:194:0x08b5, B:196:0x08c0, B:197:0x08ce, B:199:0x08d8, B:202:0x08ec, B:204:0x08f6, B:206:0x0902, B:208:0x090c, B:210:0x091a, B:212:0x0932, B:213:0x094b, B:215:0x0959, B:216:0x0962, B:217:0x096d, B:219:0x09b0, B:222:0x09bb, B:223:0x09c5, B:224:0x09c6, B:226:0x09d0, B:307:0x08c5), top: B:193:0x08b5 }] */
    /* JADX WARN: Removed duplicated region for block: B:321:0x07e9 A[Catch: all -> 0x01eb, TryCatch #6 {all -> 0x01eb, blocks: (B:43:0x01cc, B:46:0x01d9, B:48:0x01e1, B:51:0x01ef, B:58:0x036c, B:62:0x03a9, B:64:0x03e5, B:66:0x03ea, B:67:0x0401, B:71:0x040c, B:73:0x0426, B:75:0x042c, B:76:0x0443, B:79:0x0462, B:83:0x0484, B:84:0x049b, B:85:0x04a4, B:88:0x04c1, B:89:0x04d5, B:91:0x04dd, B:93:0x04e7, B:95:0x04ed, B:96:0x04f4, B:98:0x0501, B:100:0x0509, B:102:0x0511, B:105:0x0519, B:108:0x0525, B:110:0x0532, B:114:0x057a, B:115:0x058f, B:117:0x05bc, B:120:0x05e6, B:122:0x0636, B:124:0x0664, B:126:0x0691, B:127:0x0694, B:129:0x069a, B:130:0x06a2, B:132:0x06a8, B:133:0x06b0, B:135:0x06b6, B:138:0x06c5, B:140:0x06d4, B:142:0x06dd, B:143:0x06e5, B:146:0x0716, B:148:0x071f, B:152:0x0734, B:156:0x0741, B:161:0x07bc, B:162:0x07c3, B:164:0x07e6, B:166:0x07ef, B:168:0x07fa, B:169:0x0814, B:171:0x081a, B:174:0x0834, B:176:0x0840, B:178:0x084d, B:181:0x0882, B:186:0x088c, B:187:0x088f, B:189:0x089c, B:190:0x089f, B:201:0x08e3, B:315:0x086e, B:321:0x07e9, B:322:0x074a, B:325:0x0757, B:328:0x0765, B:331:0x0773, B:334:0x0781, B:337:0x078f, B:340:0x079b, B:343:0x07a9, B:358:0x0657, B:361:0x055f, B:362:0x037e, B:363:0x038a, B:365:0x0390, B:372:0x039e, B:376:0x020f, B:379:0x021d, B:381:0x0232, B:386:0x024a, B:389:0x027a, B:391:0x0280, B:393:0x028e, B:395:0x029c, B:397:0x02a5, B:399:0x032e, B:401:0x0338, B:403:0x02d2, B:405:0x02eb, B:406:0x0313, B:409:0x02fe, B:411:0x0256, B:413:0x0274), top: B:42:0x01cc, inners: #1, #8, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:362:0x037e A[Catch: all -> 0x01eb, TryCatch #6 {all -> 0x01eb, blocks: (B:43:0x01cc, B:46:0x01d9, B:48:0x01e1, B:51:0x01ef, B:58:0x036c, B:62:0x03a9, B:64:0x03e5, B:66:0x03ea, B:67:0x0401, B:71:0x040c, B:73:0x0426, B:75:0x042c, B:76:0x0443, B:79:0x0462, B:83:0x0484, B:84:0x049b, B:85:0x04a4, B:88:0x04c1, B:89:0x04d5, B:91:0x04dd, B:93:0x04e7, B:95:0x04ed, B:96:0x04f4, B:98:0x0501, B:100:0x0509, B:102:0x0511, B:105:0x0519, B:108:0x0525, B:110:0x0532, B:114:0x057a, B:115:0x058f, B:117:0x05bc, B:120:0x05e6, B:122:0x0636, B:124:0x0664, B:126:0x0691, B:127:0x0694, B:129:0x069a, B:130:0x06a2, B:132:0x06a8, B:133:0x06b0, B:135:0x06b6, B:138:0x06c5, B:140:0x06d4, B:142:0x06dd, B:143:0x06e5, B:146:0x0716, B:148:0x071f, B:152:0x0734, B:156:0x0741, B:161:0x07bc, B:162:0x07c3, B:164:0x07e6, B:166:0x07ef, B:168:0x07fa, B:169:0x0814, B:171:0x081a, B:174:0x0834, B:176:0x0840, B:178:0x084d, B:181:0x0882, B:186:0x088c, B:187:0x088f, B:189:0x089c, B:190:0x089f, B:201:0x08e3, B:315:0x086e, B:321:0x07e9, B:322:0x074a, B:325:0x0757, B:328:0x0765, B:331:0x0773, B:334:0x0781, B:337:0x078f, B:340:0x079b, B:343:0x07a9, B:358:0x0657, B:361:0x055f, B:362:0x037e, B:363:0x038a, B:365:0x0390, B:372:0x039e, B:376:0x020f, B:379:0x021d, B:381:0x0232, B:386:0x024a, B:389:0x027a, B:391:0x0280, B:393:0x028e, B:395:0x029c, B:397:0x02a5, B:399:0x032e, B:401:0x0338, B:403:0x02d2, B:405:0x02eb, B:406:0x0313, B:409:0x02fe, B:411:0x0256, B:413:0x0274), top: B:42:0x01cc, inners: #1, #8, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:401:0x0338 A[Catch: all -> 0x01eb, TryCatch #6 {all -> 0x01eb, blocks: (B:43:0x01cc, B:46:0x01d9, B:48:0x01e1, B:51:0x01ef, B:58:0x036c, B:62:0x03a9, B:64:0x03e5, B:66:0x03ea, B:67:0x0401, B:71:0x040c, B:73:0x0426, B:75:0x042c, B:76:0x0443, B:79:0x0462, B:83:0x0484, B:84:0x049b, B:85:0x04a4, B:88:0x04c1, B:89:0x04d5, B:91:0x04dd, B:93:0x04e7, B:95:0x04ed, B:96:0x04f4, B:98:0x0501, B:100:0x0509, B:102:0x0511, B:105:0x0519, B:108:0x0525, B:110:0x0532, B:114:0x057a, B:115:0x058f, B:117:0x05bc, B:120:0x05e6, B:122:0x0636, B:124:0x0664, B:126:0x0691, B:127:0x0694, B:129:0x069a, B:130:0x06a2, B:132:0x06a8, B:133:0x06b0, B:135:0x06b6, B:138:0x06c5, B:140:0x06d4, B:142:0x06dd, B:143:0x06e5, B:146:0x0716, B:148:0x071f, B:152:0x0734, B:156:0x0741, B:161:0x07bc, B:162:0x07c3, B:164:0x07e6, B:166:0x07ef, B:168:0x07fa, B:169:0x0814, B:171:0x081a, B:174:0x0834, B:176:0x0840, B:178:0x084d, B:181:0x0882, B:186:0x088c, B:187:0x088f, B:189:0x089c, B:190:0x089f, B:201:0x08e3, B:315:0x086e, B:321:0x07e9, B:322:0x074a, B:325:0x0757, B:328:0x0765, B:331:0x0773, B:334:0x0781, B:337:0x078f, B:340:0x079b, B:343:0x07a9, B:358:0x0657, B:361:0x055f, B:362:0x037e, B:363:0x038a, B:365:0x0390, B:372:0x039e, B:376:0x020f, B:379:0x021d, B:381:0x0232, B:386:0x024a, B:389:0x027a, B:391:0x0280, B:393:0x028e, B:395:0x029c, B:397:0x02a5, B:399:0x032e, B:401:0x0338, B:403:0x02d2, B:405:0x02eb, B:406:0x0313, B:409:0x02fe, B:411:0x0256, B:413:0x0274), top: B:42:0x01cc, inners: #1, #8, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x03e5 A[Catch: all -> 0x01eb, TryCatch #6 {all -> 0x01eb, blocks: (B:43:0x01cc, B:46:0x01d9, B:48:0x01e1, B:51:0x01ef, B:58:0x036c, B:62:0x03a9, B:64:0x03e5, B:66:0x03ea, B:67:0x0401, B:71:0x040c, B:73:0x0426, B:75:0x042c, B:76:0x0443, B:79:0x0462, B:83:0x0484, B:84:0x049b, B:85:0x04a4, B:88:0x04c1, B:89:0x04d5, B:91:0x04dd, B:93:0x04e7, B:95:0x04ed, B:96:0x04f4, B:98:0x0501, B:100:0x0509, B:102:0x0511, B:105:0x0519, B:108:0x0525, B:110:0x0532, B:114:0x057a, B:115:0x058f, B:117:0x05bc, B:120:0x05e6, B:122:0x0636, B:124:0x0664, B:126:0x0691, B:127:0x0694, B:129:0x069a, B:130:0x06a2, B:132:0x06a8, B:133:0x06b0, B:135:0x06b6, B:138:0x06c5, B:140:0x06d4, B:142:0x06dd, B:143:0x06e5, B:146:0x0716, B:148:0x071f, B:152:0x0734, B:156:0x0741, B:161:0x07bc, B:162:0x07c3, B:164:0x07e6, B:166:0x07ef, B:168:0x07fa, B:169:0x0814, B:171:0x081a, B:174:0x0834, B:176:0x0840, B:178:0x084d, B:181:0x0882, B:186:0x088c, B:187:0x088f, B:189:0x089c, B:190:0x089f, B:201:0x08e3, B:315:0x086e, B:321:0x07e9, B:322:0x074a, B:325:0x0757, B:328:0x0765, B:331:0x0773, B:334:0x0781, B:337:0x078f, B:340:0x079b, B:343:0x07a9, B:358:0x0657, B:361:0x055f, B:362:0x037e, B:363:0x038a, B:365:0x0390, B:372:0x039e, B:376:0x020f, B:379:0x021d, B:381:0x0232, B:386:0x024a, B:389:0x027a, B:391:0x0280, B:393:0x028e, B:395:0x029c, B:397:0x02a5, B:399:0x032e, B:401:0x0338, B:403:0x02d2, B:405:0x02eb, B:406:0x0313, B:409:0x02fe, B:411:0x0256, B:413:0x0274), top: B:42:0x01cc, inners: #1, #8, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x040a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(kd3 kd3Var, cs3 cs3Var) {
        oq3 oq3Var;
        String str;
        String str2;
        String str3;
        String str4;
        long j;
        String str5;
        vq3 vq3Var;
        vq3 vq3Var2;
        hq3 hq3Var;
        long j2;
        long intValue;
        long j3;
        gd3 a;
        String str6;
        String str7;
        String str8;
        long j4;
        String str9;
        long j5;
        Map b;
        String str10;
        ArrayList arrayList;
        xk3 j6;
        String str11;
        di3 y0;
        int i;
        List r0;
        int i2;
        tc3 g0;
        sj3 sj3Var;
        tc3 g02;
        Iterator<String> it;
        int i3;
        ContentValues contentValues;
        String str12;
        long h0;
        Pair A;
        di3 y02;
        vq3 q0;
        ll3.v(cs3Var);
        boolean z = cs3Var.z;
        long j7 = cs3Var.C;
        long j8 = cs3Var.r;
        String str13 = cs3Var.E;
        long j9 = cs3Var.q;
        long j10 = cs3Var.v;
        String str14 = cs3Var.G;
        String str15 = cs3Var.o;
        String str16 = cs3Var.p;
        long j11 = j8;
        boolean z2 = cs3Var.t;
        String str17 = cs3Var.m;
        ll3.s(str17);
        long nanoTime = System.nanoTime();
        c().v();
        l0();
        j0();
        String str18 = cs3Var.n;
        if (TextUtils.isEmpty(str18)) {
            return;
        }
        if (!z2) {
            c0(cs3Var);
            return;
        }
        dj3 f0 = f0();
        String str19 = kd3Var.m;
        boolean L = f0.L(str17, str19);
        pj3 pj3Var = this.x;
        hq3 hq3Var2 = this.V;
        if (L) {
            a().B().d(vh3.E(str17), pj3Var.n().a(str19), "Dropping blocked event. appId");
            if (!AppEventsConstants.EVENT_PARAM_VALUE_YES.equals(f0().b(str17, "measurement.upload.blacklist_internal")) && !AppEventsConstants.EVENT_PARAM_VALUE_YES.equals(f0().b(str17, "measurement.upload.blacklist_public"))) {
                if ("_err".equals(str19)) {
                    return;
                }
                k0();
                zq3.M(hq3Var2, str17, 11, "_ev", str19, 0);
                return;
            }
            di3 y03 = g0().y0(str17);
            if (y03 != null) {
                pj3 pj3Var2 = y03.a;
                lj3 lj3Var = pj3Var2.s;
                pj3.m(lj3Var);
                lj3Var.v();
                long j12 = y03.S;
                lj3 lj3Var2 = pj3Var2.s;
                pj3.m(lj3Var2);
                lj3Var2.v();
                long max = Math.max(j12, y03.R);
                e().getClass();
                long abs = Math.abs(System.currentTimeMillis() - max);
                e0();
                if (abs > ((Long) ug3.N.a(null)).longValue()) {
                    a().C().b("Fetching config for blocked app");
                    z(y03);
                    return;
                }
                return;
            }
            return;
        }
        w62 c = w62.c(kd3Var);
        zq3 k0 = k0();
        ec3 e0 = e0();
        e0.getClass();
        k0.F(c, Math.max(Math.min(e0.E(str17, ug3.X), 100), 25));
        int max2 = Math.max(Math.min(e0().E(str17, ug3.g0), 35), 10);
        Bundle bundle = (Bundle) c.e;
        Iterator it2 = new TreeSet(bundle.keySet()).iterator();
        while (it2.hasNext()) {
            String str20 = (String) it2.next();
            if (FirebaseAnalytics.Param.ITEMS.equals(str20)) {
                k0().G(bundle.getParcelableArray(str20), max2);
            }
        }
        kd3 e = c.e();
        jd3 jd3Var = e.n;
        String str21 = e.m;
        if (Log.isLoggable(a().G(), 2)) {
            a().D().c(pj3Var.n().d(e), "Logging event");
        }
        g0().i0();
        try {
            c0(cs3Var);
            boolean z3 = "ecommerce_purchase".equals(str21) || FirebaseAnalytics.Event.PURCHASE.equals(str21) || FirebaseAnalytics.Event.REFUND.equals(str21);
            if (!"_iap".equals(str21)) {
                if (!z3) {
                    str3 = str16;
                    str4 = "events";
                    str = str14;
                    str5 = str17;
                    str2 = str15;
                    hq3Var = hq3Var2;
                    boolean v0 = zq3.v0(str21);
                    boolean equals = "_err".equals(str21);
                    k0();
                    if (jd3Var == null) {
                        j2 = 0;
                    } else {
                        Iterator<String> it3 = jd3Var.m.keySet().iterator();
                        j2 = 0;
                        while (it3.hasNext()) {
                            if (jd3Var.a(it3.next()) instanceof Parcelable[]) {
                                j2 += ((Parcelable[]) r6).length;
                            }
                        }
                    }
                    String str22 = str5;
                    nc3 B0 = g0().B0(g(), str22, j2 + 1, true, v0, false, equals, false, false, false);
                    long j13 = B0.b;
                    e0();
                    intValue = j13 - ((Integer) ug3.l.a(null)).intValue();
                    if (intValue > 0) {
                        if (intValue % 1000 == 1) {
                            a().A().d(vh3.E(str22), Long.valueOf(B0.b), "Data loss. Too many events logged. appId, count");
                        }
                        g0().j0();
                    } else {
                        if (v0) {
                            long j14 = B0.a;
                            e0();
                            long intValue2 = j14 - ((Integer) ug3.n.a(null)).intValue();
                            if (intValue2 > 0) {
                                if (intValue2 % 1000 == 1) {
                                    a().A().d(vh3.E(str22), Long.valueOf(B0.a), "Data loss. Too many public events logged. appId, count");
                                }
                                k0();
                                zq3.M(hq3Var, str22, 16, "_ev", e.m, 0);
                                g0().j0();
                            }
                        }
                        String str23 = str22;
                        if (equals) {
                            long max3 = B0.d - Math.max(0, Math.min(1000000, e0().E(str23, ug3.m)));
                            if (max3 > 0) {
                                if (max3 == 1) {
                                    a().A().d(vh3.E(str23), Long.valueOf(B0.d), "Too many error events logged. appId, count");
                                }
                                g0().j0();
                            }
                        }
                        Bundle d = jd3Var.d();
                        zq3 k02 = k0();
                        String str24 = e.o;
                        k02.L(d, "_o", str24);
                        if (k0().X(str23, cs3Var.N)) {
                            k0().L(d, "_dbg", 1L);
                            k0().L(d, "_r", 1L);
                        }
                        if ("_s".equals(str21) && (q0 = g0().q0(str23, "_sno")) != null) {
                            Object obj = q0.e;
                            if (obj instanceof Long) {
                                k0().L(d, "_sno", obj);
                            }
                        }
                        if (e0().G(null, ug3.X0) && Objects.equals(str24, "am") && str21.equals("_ai")) {
                            Object obj2 = d.get("value");
                            if (obj2 instanceof String) {
                                try {
                                    double parseDouble = Double.parseDouble((String) obj2);
                                    d.remove("value");
                                    d.putDouble("value", parseDouble);
                                } catch (NumberFormatException unused) {
                                }
                            }
                        }
                        tc3 g03 = g0();
                        ll3.s(str23);
                        g03.v();
                        g03.x();
                        try {
                            j3 = g03.l0().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str23, String.valueOf(Math.max(0, Math.min(1000000, ((pj3) g03.m).p.E(str23, ug3.q))))});
                        } catch (SQLiteException e2) {
                            ((pj3) g03.m).a().A().d(vh3.E(str23), e2, "Error deleting over the limit events. appId");
                            j3 = 0;
                        }
                        if (j3 > 0) {
                            a().B().d(vh3.E(str23), Long.valueOf(j3), "Data lost. Too many events stored on disk, deleted. appId");
                        }
                        pj3 pj3Var3 = this.x;
                        fd3 fd3Var = new fd3(pj3Var3, e.o, str23, e.m, e.p, 0L, d);
                        tc3 g04 = g0();
                        String str25 = fd3Var.b;
                        String str26 = str4;
                        gd3 U = g04.U(str26, str23, str25);
                        if (U == null) {
                            long M = g0().M(str23);
                            e0().getClass();
                            tg3 tg3Var = ug3.W;
                            hq3 hq3Var3 = hq3Var;
                            if (M < Math.max(Math.min(r4.E(str23, tg3Var), 2000), ServiceStarter.ERROR_UNKNOWN) || !v0) {
                                hq3Var = hq3Var3;
                                a = new gd3(str23, str25, 0L, 0L, 0L, fd3Var.d, 0L, null, null, null, null);
                                str23 = str23;
                            } else {
                                g10 A2 = a().A();
                                th3 E = vh3.E(str23);
                                String a2 = pj3Var3.n().a(str25);
                                ec3 e02 = e0();
                                e02.getClass();
                                A2.e("Too many event names used, ignoring event. appId, name, supported count", E, a2, Integer.valueOf(Math.max(Math.min(e02.E(str23, tg3Var), 2000), ServiceStarter.ERROR_UNKNOWN)));
                                k0();
                                zq3.M(hq3Var3, str23, 8, null, null, 0);
                            }
                        } else {
                            fd3Var = fd3Var.a(pj3Var3, U.f);
                            a = U.a(fd3Var.d);
                        }
                        fd3 fd3Var2 = fd3Var;
                        g0().V(str26, a);
                        c().v();
                        l0();
                        String str27 = fd3Var2.a;
                        ll3.s(str27);
                        ll3.p(str27.equals(str23));
                        qj3 U2 = sj3.U();
                        U2.x();
                        U2.i();
                        if (!TextUtils.isEmpty(str23)) {
                            U2.o(str23);
                        }
                        if (TextUtils.isEmpty(str3)) {
                            str6 = str3;
                        } else {
                            str6 = str3;
                            U2.m(str6);
                        }
                        if (TextUtils.isEmpty(str2)) {
                            str7 = str2;
                        } else {
                            str7 = str2;
                            U2.p(str7);
                        }
                        if (TextUtils.isEmpty(str)) {
                            str8 = str;
                        } else {
                            str8 = str;
                            U2.Q(str8);
                        }
                        if (j10 != -2147483648L) {
                            j4 = j10;
                            U2.K((int) j4);
                        } else {
                            j4 = j10;
                        }
                        String str28 = str6;
                        U2.q(j9);
                        if (TextUtils.isEmpty(str18)) {
                            str9 = str18;
                        } else {
                            str9 = str18;
                            U2.G(str9);
                        }
                        ll3.v(str23);
                        String str29 = str8;
                        xk3 j15 = b(str23).j(xk3.c(100, str13));
                        U2.P(j15.f());
                        vr3.a();
                        boolean G = e0().G(str23, ug3.P0);
                        vk3 vk3Var = vk3.AD_STORAGE;
                        try {
                            if (G) {
                                k0();
                                if (zq3.T(str23)) {
                                    U2.y(cs3Var.L);
                                    j5 = j4;
                                    long j16 = cs3Var.M;
                                    if (!j15.i(vk3Var) && j16 != 0) {
                                        j16 = (j16 & (-2)) | 32;
                                    }
                                    U2.S(j16 == 1);
                                    if (j16 != 0) {
                                        ki3 w = mi3.w();
                                        w.g((j16 & 1) != 0);
                                        w.h((j16 & 2) != 0);
                                        w.i((j16 & 4) != 0);
                                        w.j((j16 & 8) != 0);
                                        w.k((j16 & 16) != 0);
                                        w.l((j16 & 32) != 0);
                                        w.m((j16 & 64) != 0);
                                        U2.z((mi3) w.d());
                                    }
                                    if (j11 != 0) {
                                        U2.v(j11);
                                        j11 = j11;
                                    }
                                    U2.N(j7);
                                    bi3 j0 = j0();
                                    dl3 a3 = dl3.a(j0.n.x.d().getContentResolver(), rl3.a(), dg0.n);
                                    b = a3 != null ? Collections.EMPTY_MAP : a3.b();
                                    if (b == null && !b.isEmpty()) {
                                        arrayList = new ArrayList();
                                        int intValue3 = ((Integer) ug3.f0.a(null)).intValue();
                                        Iterator it4 = b.entrySet().iterator();
                                        while (true) {
                                            if (!it4.hasNext()) {
                                                str10 = str7;
                                                break;
                                            }
                                            Map.Entry entry = (Map.Entry) it4.next();
                                            Iterator it5 = it4;
                                            str10 = str7;
                                            if (((String) entry.getKey()).startsWith("measurement.id.")) {
                                                try {
                                                    int parseInt = Integer.parseInt((String) entry.getValue());
                                                    if (parseInt != 0) {
                                                        arrayList.add(Integer.valueOf(parseInt));
                                                        if (arrayList.size() >= intValue3) {
                                                            ((pj3) j0.m).a().B().c(Integer.valueOf(arrayList.size()), "Too many experiment IDs. Number of IDs");
                                                            break;
                                                        }
                                                        continue;
                                                    } else {
                                                        continue;
                                                    }
                                                } catch (NumberFormatException e3) {
                                                    ((pj3) j0.m).a().B().c(e3, "Experiment ID NumberFormatException");
                                                }
                                            }
                                            it4 = it5;
                                            str7 = str10;
                                        }
                                        if (arrayList.isEmpty()) {
                                        }
                                        if (arrayList != null) {
                                            U2.M(arrayList);
                                        }
                                        if (e0().G(null, ug3.a1)) {
                                            U2.C();
                                        }
                                        j6 = b(str23).j(xk3.c(100, str13));
                                        if (j6.i(vk3Var) && z) {
                                            try {
                                                lo3 lo3Var = this.u;
                                                lo3Var.getClass();
                                                A = !j6.i(vk3Var) ? lo3Var.A(str23) : new Pair(BuildConfig.FLAVOR, Boolean.FALSE);
                                                if (!TextUtils.isEmpty((CharSequence) A.first)) {
                                                    U2.s((String) A.first);
                                                    Object obj3 = A.second;
                                                    if (obj3 != null) {
                                                        U2.t(((Boolean) obj3).booleanValue());
                                                    }
                                                    if (!fd3Var2.b.equals("_fx") && !((String) A.first).equals("00000000-0000-0000-0000-000000000000") && (y02 = g0().y0(str23)) != null) {
                                                        lj3 lj3Var3 = y02.a.s;
                                                        pj3.m(lj3Var3);
                                                        lj3Var3.v();
                                                        if (y02.y) {
                                                            u(str23, false, null, null);
                                                            Bundle bundle2 = new Bundle();
                                                            lj3 lj3Var4 = y02.a.s;
                                                            pj3.m(lj3Var4);
                                                            lj3Var4.v();
                                                            Long l = y02.z;
                                                            if (l != null) {
                                                                str11 = str9;
                                                                bundle2.putLong("_pfo", Math.max(0L, l.longValue()));
                                                            } else {
                                                                str11 = str9;
                                                            }
                                                            lj3 lj3Var5 = y02.a.s;
                                                            pj3.m(lj3Var5);
                                                            lj3Var5.v();
                                                            Long l2 = y02.A;
                                                            if (l2 != null) {
                                                                bundle2.putLong("_uwa", l2.longValue());
                                                            }
                                                            bundle2.putLong("_r", 1L);
                                                            hq3Var.zza(str23, "_fx", bundle2);
                                                            pj3Var.q().y();
                                                            String str30 = Build.MODEL;
                                                            U2.j();
                                                            pj3Var.q().y();
                                                            String str31 = Build.VERSION.RELEASE;
                                                            U2.b();
                                                            ((sj3) U2.n).o0(str31);
                                                            U2.l((int) pj3Var.q().A());
                                                            U2.k(pj3Var.q().B());
                                                            U2.R(cs3Var.I);
                                                            if (pj3Var.b()) {
                                                                U2.n();
                                                                if (!TextUtils.isEmpty(null)) {
                                                                    U2.b();
                                                                    ((sj3) U2.n).R0(null);
                                                                    throw null;
                                                                }
                                                            }
                                                            y0 = g0().y0(str23);
                                                            if (y0 != null) {
                                                                y0 = new di3(pj3Var, str23);
                                                                oq3Var = this;
                                                                try {
                                                                    y0.F(oq3Var.o(j6));
                                                                    y0.K(cs3Var.w);
                                                                    y0.H(str11);
                                                                    if (j6.i(vk3Var)) {
                                                                        y0.I(oq3Var.u.B(str23, z));
                                                                    }
                                                                    y0.e(0L);
                                                                    y0.L(0L);
                                                                    y0.M(0L);
                                                                    y0.O(str10);
                                                                    y0.Q(j5);
                                                                    y0.R(str28);
                                                                    y0.S(j9);
                                                                    y0.a(j11);
                                                                    y0.d(z2);
                                                                    y0.c(j7);
                                                                    i = 0;
                                                                    oq3Var.g0().z0(y0, false);
                                                                } catch (Throwable th) {
                                                                    th = th;
                                                                    oq3Var.g0().k0();
                                                                    throw th;
                                                                }
                                                            } else {
                                                                i = 0;
                                                                oq3Var = this;
                                                            }
                                                            if (j6.i(vk3.ANALYTICS_STORAGE) && !TextUtils.isEmpty(y0.E())) {
                                                                String E2 = y0.E();
                                                                ll3.v(E2);
                                                                U2.u(E2);
                                                            }
                                                            if (!TextUtils.isEmpty(y0.J())) {
                                                                String J = y0.J();
                                                                ll3.v(J);
                                                                U2.J(J);
                                                            }
                                                            r0 = oq3Var.g0().r0(str23);
                                                            i2 = i;
                                                            while (i2 < r0.size()) {
                                                                dk3 A3 = ek3.A();
                                                                String str32 = ((vq3) r0.get(i2)).c;
                                                                A3.b();
                                                                ((ek3) A3.n).C(str32);
                                                                long j17 = ((vq3) r0.get(i2)).d;
                                                                A3.b();
                                                                ((ek3) A3.n).B(j17);
                                                                oq3Var.j0().V(A3, ((vq3) r0.get(i2)).e);
                                                                U2.Y(A3);
                                                                if ("_sid".equals(((vq3) r0.get(i2)).c)) {
                                                                    lj3 lj3Var6 = y0.a.s;
                                                                    pj3.m(lj3Var6);
                                                                    lj3Var6.v();
                                                                    if (y0.w != 0) {
                                                                        bi3 j02 = oq3Var.j0();
                                                                        if (TextUtils.isEmpty(str29)) {
                                                                            str12 = str29;
                                                                            h0 = 0;
                                                                        } else {
                                                                            str12 = str29;
                                                                            h0 = j02.h0(str12.getBytes(Charset.forName("UTF-8")));
                                                                        }
                                                                        lj3 lj3Var7 = y0.a.s;
                                                                        pj3.m(lj3Var7);
                                                                        lj3Var7.v();
                                                                        if (h0 != y0.w) {
                                                                            U2.b();
                                                                            ((sj3) U2.n).Z0();
                                                                        }
                                                                        i2++;
                                                                        str29 = str12;
                                                                    }
                                                                }
                                                                str12 = str29;
                                                                i2++;
                                                                str29 = str12;
                                                            }
                                                            g0 = oq3Var.g0();
                                                            sj3Var = (sj3) U2.d();
                                                            g0.v();
                                                            g0.x();
                                                            ll3.s(sj3Var.p());
                                                            byte[] a4 = sj3Var.a();
                                                            long h02 = g0.n.j0().h0(a4);
                                                            ContentValues contentValues2 = new ContentValues();
                                                            contentValues2.put("app_id", sj3Var.p());
                                                            contentValues2.put("metadata_fingerprint", Long.valueOf(h02));
                                                            contentValues2.put("metadata", a4);
                                                            g0.l0().insertWithOnConflict("raw_events_metadata", null, contentValues2, 4);
                                                            g02 = oq3Var.g0();
                                                            jd3 jd3Var2 = fd3Var2.f;
                                                            Objects.requireNonNull(jd3Var2);
                                                            it = jd3Var2.m.keySet().iterator();
                                                            while (true) {
                                                                if (it.hasNext()) {
                                                                    dj3 f02 = oq3Var.f0();
                                                                    String str33 = fd3Var2.a;
                                                                    boolean M2 = f02.M(str33, fd3Var2.b);
                                                                    nc3 A0 = oq3Var.g0().A0(oq3Var.g(), str33, false, false, false, false);
                                                                    if (!M2 || A0.e >= oq3Var.e0().E(str33, ug3.p)) {
                                                                        i3 = i;
                                                                    }
                                                                } else if ("_r".equals(it.next())) {
                                                                    break;
                                                                }
                                                            }
                                                            g02.v();
                                                            g02.x();
                                                            String str34 = fd3Var2.a;
                                                            ll3.s(str34);
                                                            byte[] a5 = g02.n.j0().Y(fd3Var2).a();
                                                            contentValues = new ContentValues();
                                                            contentValues.put("app_id", str34);
                                                            contentValues.put("name", fd3Var2.b);
                                                            contentValues.put(SDKConstants.PARAM_DEBUG_MESSAGE_TIMESTAMP, Long.valueOf(fd3Var2.d));
                                                            contentValues.put("metadata_fingerprint", Long.valueOf(h02));
                                                            contentValues.put("data", a5);
                                                            contentValues.put("realtime", Integer.valueOf(i3));
                                                            if (g02.l0().insert("raw_events", null, contentValues) != -1) {
                                                                ((pj3) g02.m).a().A().c(vh3.E(str34), "Failed to insert raw event (got -1). appId");
                                                            } else {
                                                                oq3Var.A = 0L;
                                                            }
                                                            oq3Var.g0().j0();
                                                            oq3Var.g0().k0();
                                                            oq3Var.N();
                                                            oq3Var.a().D().c(Long.valueOf(((System.nanoTime() - nanoTime) + 500000) / 1000000), "Background event processing time, ms");
                                                            return;
                                                        }
                                                    }
                                                }
                                            } catch (Throwable th2) {
                                                th = th2;
                                                oq3Var = this;
                                                oq3Var.g0().k0();
                                                throw th;
                                            }
                                        }
                                        str11 = str9;
                                        pj3Var.q().y();
                                        String str302 = Build.MODEL;
                                        U2.j();
                                        pj3Var.q().y();
                                        String str312 = Build.VERSION.RELEASE;
                                        U2.b();
                                        ((sj3) U2.n).o0(str312);
                                        U2.l((int) pj3Var.q().A());
                                        U2.k(pj3Var.q().B());
                                        U2.R(cs3Var.I);
                                        if (pj3Var.b()) {
                                        }
                                        y0 = g0().y0(str23);
                                        if (y0 != null) {
                                        }
                                        if (j6.i(vk3.ANALYTICS_STORAGE)) {
                                            String E22 = y0.E();
                                            ll3.v(E22);
                                            U2.u(E22);
                                        }
                                        if (!TextUtils.isEmpty(y0.J())) {
                                        }
                                        r0 = oq3Var.g0().r0(str23);
                                        i2 = i;
                                        while (i2 < r0.size()) {
                                        }
                                        g0 = oq3Var.g0();
                                        sj3Var = (sj3) U2.d();
                                        g0.v();
                                        g0.x();
                                        ll3.s(sj3Var.p());
                                        byte[] a42 = sj3Var.a();
                                        long h022 = g0.n.j0().h0(a42);
                                        ContentValues contentValues22 = new ContentValues();
                                        contentValues22.put("app_id", sj3Var.p());
                                        contentValues22.put("metadata_fingerprint", Long.valueOf(h022));
                                        contentValues22.put("metadata", a42);
                                        g0.l0().insertWithOnConflict("raw_events_metadata", null, contentValues22, 4);
                                        g02 = oq3Var.g0();
                                        jd3 jd3Var22 = fd3Var2.f;
                                        Objects.requireNonNull(jd3Var22);
                                        it = jd3Var22.m.keySet().iterator();
                                        while (true) {
                                            if (it.hasNext()) {
                                            }
                                        }
                                        g02.v();
                                        g02.x();
                                        String str342 = fd3Var2.a;
                                        ll3.s(str342);
                                        byte[] a52 = g02.n.j0().Y(fd3Var2).a();
                                        contentValues = new ContentValues();
                                        contentValues.put("app_id", str342);
                                        contentValues.put("name", fd3Var2.b);
                                        contentValues.put(SDKConstants.PARAM_DEBUG_MESSAGE_TIMESTAMP, Long.valueOf(fd3Var2.d));
                                        contentValues.put("metadata_fingerprint", Long.valueOf(h022));
                                        contentValues.put("data", a52);
                                        contentValues.put("realtime", Integer.valueOf(i3));
                                        if (g02.l0().insert("raw_events", null, contentValues) != -1) {
                                        }
                                        oq3Var.g0().j0();
                                        oq3Var.g0().k0();
                                        oq3Var.N();
                                        oq3Var.a().D().c(Long.valueOf(((System.nanoTime() - nanoTime) + 500000) / 1000000), "Background event processing time, ms");
                                        return;
                                    }
                                    str10 = str7;
                                    arrayList = null;
                                    if (arrayList != null) {
                                    }
                                    if (e0().G(null, ug3.a1)) {
                                    }
                                    j6 = b(str23).j(xk3.c(100, str13));
                                    if (j6.i(vk3Var)) {
                                        lo3 lo3Var2 = this.u;
                                        lo3Var2.getClass();
                                        if (!j6.i(vk3Var)) {
                                        }
                                        if (!TextUtils.isEmpty((CharSequence) A.first)) {
                                        }
                                    }
                                    str11 = str9;
                                    pj3Var.q().y();
                                    String str3022 = Build.MODEL;
                                    U2.j();
                                    pj3Var.q().y();
                                    String str3122 = Build.VERSION.RELEASE;
                                    U2.b();
                                    ((sj3) U2.n).o0(str3122);
                                    U2.l((int) pj3Var.q().A());
                                    U2.k(pj3Var.q().B());
                                    U2.R(cs3Var.I);
                                    if (pj3Var.b()) {
                                    }
                                    y0 = g0().y0(str23);
                                    if (y0 != null) {
                                    }
                                    if (j6.i(vk3.ANALYTICS_STORAGE)) {
                                    }
                                    if (!TextUtils.isEmpty(y0.J())) {
                                    }
                                    r0 = oq3Var.g0().r0(str23);
                                    i2 = i;
                                    while (i2 < r0.size()) {
                                    }
                                    g0 = oq3Var.g0();
                                    sj3Var = (sj3) U2.d();
                                    g0.v();
                                    g0.x();
                                    ll3.s(sj3Var.p());
                                    byte[] a422 = sj3Var.a();
                                    long h0222 = g0.n.j0().h0(a422);
                                    ContentValues contentValues222 = new ContentValues();
                                    contentValues222.put("app_id", sj3Var.p());
                                    contentValues222.put("metadata_fingerprint", Long.valueOf(h0222));
                                    contentValues222.put("metadata", a422);
                                    g0.l0().insertWithOnConflict("raw_events_metadata", null, contentValues222, 4);
                                    g02 = oq3Var.g0();
                                    jd3 jd3Var222 = fd3Var2.f;
                                    Objects.requireNonNull(jd3Var222);
                                    it = jd3Var222.m.keySet().iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                        }
                                    }
                                    g02.v();
                                    g02.x();
                                    String str3422 = fd3Var2.a;
                                    ll3.s(str3422);
                                    byte[] a522 = g02.n.j0().Y(fd3Var2).a();
                                    contentValues = new ContentValues();
                                    contentValues.put("app_id", str3422);
                                    contentValues.put("name", fd3Var2.b);
                                    contentValues.put(SDKConstants.PARAM_DEBUG_MESSAGE_TIMESTAMP, Long.valueOf(fd3Var2.d));
                                    contentValues.put("metadata_fingerprint", Long.valueOf(h0222));
                                    contentValues.put("data", a522);
                                    contentValues.put("realtime", Integer.valueOf(i3));
                                    if (g02.l0().insert("raw_events", null, contentValues) != -1) {
                                    }
                                    oq3Var.g0().j0();
                                    oq3Var.g0().k0();
                                    oq3Var.N();
                                    oq3Var.a().D().c(Long.valueOf(((System.nanoTime() - nanoTime) + 500000) / 1000000), "Background event processing time, ms");
                                    return;
                                }
                            }
                            g0.l0().insertWithOnConflict("raw_events_metadata", null, contentValues222, 4);
                            g02 = oq3Var.g0();
                            jd3 jd3Var2222 = fd3Var2.f;
                            Objects.requireNonNull(jd3Var2222);
                            it = jd3Var2222.m.keySet().iterator();
                            while (true) {
                                if (it.hasNext()) {
                                }
                            }
                            g02.v();
                            g02.x();
                            String str34222 = fd3Var2.a;
                            ll3.s(str34222);
                            byte[] a5222 = g02.n.j0().Y(fd3Var2).a();
                            contentValues = new ContentValues();
                            contentValues.put("app_id", str34222);
                            contentValues.put("name", fd3Var2.b);
                            contentValues.put(SDKConstants.PARAM_DEBUG_MESSAGE_TIMESTAMP, Long.valueOf(fd3Var2.d));
                            contentValues.put("metadata_fingerprint", Long.valueOf(h0222));
                            contentValues.put("data", a5222);
                            contentValues.put("realtime", Integer.valueOf(i3));
                            if (g02.l0().insert("raw_events", null, contentValues) != -1) {
                            }
                            oq3Var.g0().j0();
                            oq3Var.g0().k0();
                            oq3Var.N();
                            oq3Var.a().D().c(Long.valueOf(((System.nanoTime() - nanoTime) + 500000) / 1000000), "Background event processing time, ms");
                            return;
                        } catch (SQLiteException e4) {
                            ((pj3) g0.m).a().A().d(vh3.E(sj3Var.p()), e4, "Error storing raw event metadata. appId");
                            throw e4;
                        }
                        j5 = j4;
                        if (j11 != 0) {
                        }
                        U2.N(j7);
                        bi3 j03 = j0();
                        dl3 a32 = dl3.a(j03.n.x.d().getContentResolver(), rl3.a(), dg0.n);
                        if (a32 != null) {
                        }
                        if (b == null) {
                        }
                        str10 = str7;
                        arrayList = null;
                        if (arrayList != null) {
                        }
                        if (e0().G(null, ug3.a1)) {
                        }
                        j6 = b(str23).j(xk3.c(100, str13));
                        if (j6.i(vk3Var)) {
                        }
                        str11 = str9;
                        pj3Var.q().y();
                        String str30222 = Build.MODEL;
                        U2.j();
                        pj3Var.q().y();
                        String str31222 = Build.VERSION.RELEASE;
                        U2.b();
                        ((sj3) U2.n).o0(str31222);
                        U2.l((int) pj3Var.q().A());
                        U2.k(pj3Var.q().B());
                        U2.R(cs3Var.I);
                        if (pj3Var.b()) {
                        }
                        y0 = g0().y0(str23);
                        if (y0 != null) {
                        }
                        if (j6.i(vk3.ANALYTICS_STORAGE)) {
                        }
                        if (!TextUtils.isEmpty(y0.J())) {
                        }
                        r0 = oq3Var.g0().r0(str23);
                        i2 = i;
                        while (i2 < r0.size()) {
                        }
                        g0 = oq3Var.g0();
                        sj3Var = (sj3) U2.d();
                        g0.v();
                        g0.x();
                        ll3.s(sj3Var.p());
                        byte[] a4222 = sj3Var.a();
                        long h02222 = g0.n.j0().h0(a4222);
                        ContentValues contentValues2222 = new ContentValues();
                        contentValues2222.put("app_id", sj3Var.p());
                        contentValues2222.put("metadata_fingerprint", Long.valueOf(h02222));
                        contentValues2222.put("metadata", a4222);
                    }
                    g0().k0();
                }
                z3 = true;
            }
            str = str14;
            str2 = str15;
            String c2 = jd3Var.c();
            str3 = str16;
            Bundle bundle3 = jd3Var.m;
            if (z3) {
                double doubleValue = jd3Var.b().doubleValue() * 1000000.0d;
                if (doubleValue == 0.0d) {
                    str4 = "events";
                    doubleValue = bundle3.getLong("value") * 1000000.0d;
                } else {
                    str4 = "events";
                }
                if (doubleValue > 9.223372036854776E18d || doubleValue < -9.223372036854776E18d) {
                    a().B().d(vh3.E(str17), Double.valueOf(doubleValue), "Data lost. Currency value is too big. appId");
                    g0().j0();
                    g0().k0();
                } else {
                    j = Math.round(doubleValue);
                    if (FirebaseAnalytics.Event.REFUND.equals(str21)) {
                        j = -j;
                    }
                }
            } else {
                str4 = "events";
                j = bundle3.getLong("value");
            }
            if (!TextUtils.isEmpty(c2)) {
                String upperCase = c2.toUpperCase(Locale.US);
                if (upperCase.matches("[A-Z]{3}")) {
                    String concat = "_ltv_".concat(upperCase);
                    vq3 q02 = g0().q0(str17, concat);
                    if (q02 != null) {
                        Object obj4 = q02.e;
                        if (obj4 instanceof Long) {
                            long longValue = ((Long) obj4).longValue();
                            String str35 = e.o;
                            e().getClass();
                            vq3Var = new vq3(str17, str35, concat, System.currentTimeMillis(), Long.valueOf(longValue + j));
                            str5 = str17;
                            vq3Var2 = vq3Var;
                            if (!g0().p0(vq3Var2)) {
                                a().A().e("Too many unique user properties are set. Ignoring user property. appId", vh3.E(str5), pj3Var.n().c(vq3Var2.c), vq3Var2.e);
                                k0();
                                zq3.M(hq3Var2, str5, 9, null, null, 0);
                                hq3Var = hq3Var2;
                                boolean v02 = zq3.v0(str21);
                                boolean equals2 = "_err".equals(str21);
                                k0();
                                if (jd3Var == null) {
                                }
                                String str222 = str5;
                                nc3 B02 = g0().B0(g(), str222, j2 + 1, true, v02, false, equals2, false, false, false);
                                long j132 = B02.b;
                                e0();
                                intValue = j132 - ((Integer) ug3.l.a(null)).intValue();
                                if (intValue > 0) {
                                }
                                g0().k0();
                            }
                            hq3Var = hq3Var2;
                            boolean v022 = zq3.v0(str21);
                            boolean equals22 = "_err".equals(str21);
                            k0();
                            if (jd3Var == null) {
                            }
                            String str2222 = str5;
                            nc3 B022 = g0().B0(g(), str2222, j2 + 1, true, v022, false, equals22, false, false, false);
                            long j1322 = B022.b;
                            e0();
                            intValue = j1322 - ((Integer) ug3.l.a(null)).intValue();
                            if (intValue > 0) {
                            }
                            g0().k0();
                        }
                    }
                    tc3 g05 = g0();
                    int E3 = e0().E(str17, ug3.T) - 1;
                    ll3.s(str17);
                    g05.v();
                    g05.x();
                    g05.l0().execSQL("delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like '!_ltv!_%' escape '!'order by set_timestamp desc limit ?,10);", new String[]{str17, str17, String.valueOf(E3)});
                    String str36 = e.o;
                    e().getClass();
                    str5 = str17;
                    vq3Var = new vq3(str5, str36, concat, System.currentTimeMillis(), Long.valueOf(j));
                    vq3Var2 = vq3Var;
                    if (!g0().p0(vq3Var2)) {
                    }
                    hq3Var = hq3Var2;
                    boolean v0222 = zq3.v0(str21);
                    boolean equals222 = "_err".equals(str21);
                    k0();
                    if (jd3Var == null) {
                    }
                    String str22222 = str5;
                    nc3 B0222 = g0().B0(g(), str22222, j2 + 1, true, v0222, false, equals222, false, false, false);
                    long j13222 = B0222.b;
                    e0();
                    intValue = j13222 - ((Integer) ug3.l.a(null)).intValue();
                    if (intValue > 0) {
                    }
                    g0().k0();
                }
            }
            str5 = str17;
            hq3Var = hq3Var2;
            boolean v02222 = zq3.v0(str21);
            boolean equals2222 = "_err".equals(str21);
            k0();
            if (jd3Var == null) {
            }
            String str222222 = str5;
            nc3 B02222 = g0().B0(g(), str222222, j2 + 1, true, v02222, false, equals2222, false, false, false);
            long j132222 = B02222.b;
            e0();
            intValue = j132222 - ((Integer) ug3.l.a(null)).intValue();
            if (intValue > 0) {
            }
            g0().k0();
        } catch (Throwable th3) {
            th = th3;
            oq3Var = this;
            oq3Var.g0().k0();
            throw th;
        }
    }

    public final void l0() {
        if (this.y.get()) {
            return;
        }
        lh.g("UploadController is not initialized");
    }

    public final void m(di3 di3Var, qj3 qj3Var) {
        ot2 ot2Var;
        ek3 ek3Var;
        gc3 gc3Var;
        c().v();
        l0();
        String B0 = ((sj3) qj3Var.n).B0();
        EnumMap enumMap = new EnumMap(vk3.class);
        int length = B0.length();
        int length2 = vk3.values().length;
        gc3 gc3Var2 = gc3.UNSET;
        int i = 0;
        if (length < length2 || B0.charAt(0) != '1') {
            ot2Var = new ot2(15);
        } else {
            vk3[] values = vk3.values();
            int length3 = values.length;
            int i2 = 0;
            int i3 = 1;
            while (i2 < length3) {
                vk3 vk3Var = values[i2];
                int i4 = i3 + 1;
                char charAt = B0.charAt(i3);
                gc3[] values2 = gc3.values();
                int length4 = values2.length;
                int i5 = i;
                while (true) {
                    if (i5 >= length4) {
                        gc3Var = gc3Var2;
                        break;
                    }
                    gc3Var = values2[i5];
                    if (gc3Var.m == charAt) {
                        break;
                    } else {
                        i5++;
                    }
                }
                enumMap.put((EnumMap) vk3Var, (vk3) gc3Var);
                i2++;
                i3 = i4;
                i = 0;
            }
            ot2Var = new ot2(enumMap);
        }
        String D = di3Var.D();
        c().v();
        l0();
        xk3 b = b(D);
        EnumMap enumMap2 = b.a;
        vk3 vk3Var2 = vk3.AD_STORAGE;
        sk3 sk3Var = (sk3) enumMap2.get(vk3Var2);
        sk3 sk3Var2 = sk3.UNINITIALIZED;
        if (sk3Var == null) {
            sk3Var = sk3Var2;
        }
        int i6 = b.b;
        int ordinal = sk3Var.ordinal();
        gc3 gc3Var3 = gc3.REMOTE_ENFORCED_DEFAULT;
        gc3 gc3Var4 = gc3.FAILSAFE;
        if (ordinal == 1) {
            ot2Var.w(vk3Var2, gc3Var3);
        } else if (ordinal == 2 || ordinal == 3) {
            ot2Var.t(vk3Var2, i6);
        } else {
            ot2Var.w(vk3Var2, gc3Var4);
        }
        vk3 vk3Var3 = vk3.ANALYTICS_STORAGE;
        sk3 sk3Var3 = (sk3) enumMap2.get(vk3Var3);
        if (sk3Var3 != null) {
            sk3Var2 = sk3Var3;
        }
        int ordinal2 = sk3Var2.ordinal();
        if (ordinal2 == 1) {
            ot2Var.w(vk3Var3, gc3Var3);
        } else if (ordinal2 == 2 || ordinal2 == 3) {
            ot2Var.t(vk3Var3, i6);
        } else {
            ot2Var.w(vk3Var3, gc3Var4);
        }
        String D2 = di3Var.D();
        c().v();
        l0();
        vc3 q0 = q0(D2, o0(D2), b(D2), ot2Var);
        String str = q0.d;
        Boolean bool = q0.c;
        ll3.v(bool);
        boolean booleanValue = bool.booleanValue();
        qj3Var.b();
        ((sj3) qj3Var.n).f1(booleanValue);
        if (!TextUtils.isEmpty(str)) {
            qj3Var.b();
            ((sj3) qj3Var.n).g1(str);
        }
        c().v();
        l0();
        Iterator it = Collections.unmodifiableList(((sj3) qj3Var.n).U1()).iterator();
        while (true) {
            if (it.hasNext()) {
                ek3Var = (ek3) it.next();
                if ("_npa".equals(ek3Var.r())) {
                    break;
                }
            } else {
                ek3Var = null;
                break;
            }
        }
        if (ek3Var != null) {
            EnumMap enumMap3 = (EnumMap) ot2Var.n;
            vk3 vk3Var4 = vk3.AD_PERSONALIZATION;
            gc3 gc3Var5 = (gc3) enumMap3.get(vk3Var4);
            if (gc3Var5 == null) {
                gc3Var5 = gc3Var2;
            }
            if (gc3Var5 == gc3Var2) {
                tc3 tc3Var = this.o;
                U(tc3Var);
                vq3 q02 = tc3Var.q0(di3Var.D(), "_npa");
                gc3 gc3Var6 = gc3.MANIFEST;
                gc3 gc3Var7 = gc3.API;
                if (q02 != null) {
                    String str2 = q02.b;
                    if ("tcf".equals(str2)) {
                        ot2Var.w(vk3Var4, gc3.TCF);
                    } else if ("app".equals(str2)) {
                        ot2Var.w(vk3Var4, gc3Var7);
                    } else {
                        ot2Var.w(vk3Var4, gc3Var6);
                    }
                } else {
                    Boolean w = di3Var.w();
                    if (w == null || ((w.booleanValue() && ek3Var.v() != 1) || !(w.booleanValue() || ek3Var.v() == 0))) {
                        ot2Var.w(vk3Var4, gc3Var7);
                    } else {
                        ot2Var.w(vk3Var4, gc3Var6);
                    }
                }
            }
        } else {
            int F = F(di3Var.D(), ot2Var);
            dk3 A = ek3.A();
            A.b();
            ((ek3) A.n).C("_npa");
            e().getClass();
            long currentTimeMillis = System.currentTimeMillis();
            A.b();
            ((ek3) A.n).B(currentTimeMillis);
            A.b();
            ((ek3) A.n).F(F);
            ek3 ek3Var2 = (ek3) A.d();
            qj3Var.b();
            ((sj3) qj3Var.n).d0(ek3Var2);
            a().z.d("non_personalized_ads(_npa)", Integer.valueOf(F), "Setting user property");
        }
        String ot2Var2 = ot2Var.toString();
        qj3Var.b();
        ((sj3) qj3Var.n).e1(ot2Var2);
        String D3 = di3Var.D();
        dj3 dj3Var = this.m;
        dj3Var.v();
        dj3Var.C(D3);
        dh3 R = dj3Var.R(D3);
        boolean z = R == null || !R.s() || R.t();
        List T = qj3Var.T();
        for (int i7 = 0; i7 < T.size(); i7++) {
            if ("_tcf".equals(((cj3) T.get(i7)).s())) {
                bj3 bj3Var = (bj3) ((cj3) T.get(i7)).i();
                List g = bj3Var.g();
                int i8 = 0;
                while (true) {
                    if (i8 >= g.size()) {
                        break;
                    }
                    if ("_tcfd".equals(((hj3) g.get(i8)).q())) {
                        String s = ((hj3) g.get(i8)).s();
                        if (z && s.length() > 4) {
                            char[] charArray = s.toCharArray();
                            int i9 = 1;
                            while (true) {
                                if (i9 >= 64) {
                                    i9 = 0;
                                    break;
                                } else if (charArray[4] == "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i9)) {
                                    break;
                                } else {
                                    i9++;
                                }
                            }
                            charArray[4] = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i9 | 1);
                            s = String.valueOf(charArray);
                        }
                        fj3 B = hj3.B();
                        B.g("_tcfd");
                        B.h(s);
                        bj3Var.b();
                        ((cj3) bj3Var.n).A(i8, (hj3) B.d());
                    } else {
                        i8++;
                    }
                }
                qj3Var.V(i7, bj3Var);
                return;
            }
        }
    }

    public final void m0(cs3 cs3Var) {
        c().v();
        l0();
        String str = cs3Var.m;
        ll3.s(str);
        xk3 c = xk3.c(cs3Var.J, cs3Var.E);
        b(str);
        a().z.d(str, c, "Setting storage consent for package");
        c().v();
        l0();
        this.N.put(str, c);
        tc3 tc3Var = this.o;
        U(tc3Var);
        tc3Var.R(str, c);
    }

    public final void n(di3 di3Var, qj3 qj3Var) {
        Serializable L;
        c().v();
        l0();
        yh3 O = gi3.O();
        pj3 pj3Var = di3Var.a;
        lj3 lj3Var = pj3Var.s;
        pj3.m(lj3Var);
        lj3Var.v();
        byte[] bArr = di3Var.H;
        if (bArr != null) {
            try {
                O = (yh3) bi3.j0(O, bArr);
            } catch (un3 unused) {
                a().u.c(vh3.E(di3Var.D()), "Failed to parse locally stored ad campaign info. appId");
            }
        }
        Iterator it = qj3Var.T().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            cj3 cj3Var = (cj3) it.next();
            if (cj3Var.s().equals(Constants.ScionAnalytics.EVENT_FIREBASE_CAMPAIGN)) {
                hj3 E = bi3.E("gclid", cj3Var);
                Serializable L2 = E == null ? null : bi3.L(E);
                Object obj = BuildConfig.FLAVOR;
                if (L2 == null) {
                    L2 = BuildConfig.FLAVOR;
                }
                String str = (String) L2;
                hj3 E2 = bi3.E("gbraid", cj3Var);
                Serializable L3 = E2 == null ? null : bi3.L(E2);
                if (L3 == null) {
                    L3 = BuildConfig.FLAVOR;
                }
                String str2 = (String) L3;
                hj3 E3 = bi3.E("gad_source", cj3Var);
                Object L4 = E3 == null ? null : bi3.L(E3);
                if (L4 != null) {
                    obj = L4;
                }
                String str3 = (String) obj;
                String[] split = ((String) ug3.g1.a(null)).split(",");
                j0();
                HashMap hashMap = new HashMap();
                for (hj3 hj3Var : cj3Var.p()) {
                    if (Arrays.asList(split).contains(hj3Var.q()) && (L = bi3.L(hj3Var)) != null) {
                        hashMap.put(hj3Var.q(), L);
                    }
                }
                if (!hashMap.isEmpty()) {
                    hj3 E4 = bi3.E("click_timestamp", cj3Var);
                    Object L5 = E4 == null ? null : bi3.L(E4);
                    long longValue = ((Long) (L5 != null ? L5 : 0L)).longValue();
                    if (longValue <= 0) {
                        longValue = cj3Var.u();
                    }
                    hj3 E5 = bi3.E("_cis", cj3Var);
                    if ("referrer API v2".equals(E5 != null ? bi3.L(E5) : null)) {
                        if (longValue > ((gi3) O.n).N()) {
                            if (str.isEmpty()) {
                                O.b();
                                ((gi3) O.n).q();
                            } else {
                                O.b();
                                ((gi3) O.n).p(str);
                            }
                            if (str2.isEmpty()) {
                                O.b();
                                ((gi3) O.n).s();
                            } else {
                                O.b();
                                ((gi3) O.n).r(str2);
                            }
                            if (str3.isEmpty()) {
                                O.b();
                                ((gi3) O.n).u();
                            } else {
                                O.b();
                                ((gi3) O.n).t(str3);
                            }
                            O.b();
                            ((gi3) O.n).v(longValue);
                            O.b();
                            ((gi3) O.n).x().clear();
                            HashMap G = G(cj3Var);
                            O.b();
                            ((gi3) O.n).x().putAll(G);
                        }
                    } else if (longValue > ((gi3) O.n).F()) {
                        if (str.isEmpty()) {
                            O.b();
                            ((gi3) O.n).R();
                        } else {
                            O.b();
                            ((gi3) O.n).Q(str);
                        }
                        if (str2.isEmpty()) {
                            O.b();
                            ((gi3) O.n).T();
                        } else {
                            O.b();
                            ((gi3) O.n).S(str2);
                        }
                        if (str3.isEmpty()) {
                            O.b();
                            ((gi3) O.n).V();
                        } else {
                            O.b();
                            ((gi3) O.n).U(str3);
                        }
                        O.b();
                        ((gi3) O.n).W(longValue);
                        O.b();
                        ((gi3) O.n).w().clear();
                        HashMap G2 = G(cj3Var);
                        O.b();
                        ((gi3) O.n).w().putAll(G2);
                    }
                }
            }
        }
        if (!((gi3) O.d()).equals(gi3.P())) {
            gi3 gi3Var = (gi3) O.d();
            qj3Var.b();
            ((sj3) qj3Var.n).k1(gi3Var);
        }
        byte[] a = ((gi3) O.d()).a();
        lj3 lj3Var2 = pj3Var.s;
        pj3.m(lj3Var2);
        lj3Var2.v();
        di3Var.Q |= di3Var.H != a;
        di3Var.H = a;
        if (di3Var.o()) {
            tc3 tc3Var = this.o;
            U(tc3Var);
            tc3Var.z0(di3Var, false);
        }
        if (e0().G(null, ug3.f1)) {
            tc3 tc3Var2 = this.o;
            U(tc3Var2);
            tc3Var2.o0(di3Var.D(), "_lgclid");
        }
    }

    public final void n0(cs3 cs3Var) {
        c().v();
        l0();
        String str = cs3Var.m;
        ll3.s(str);
        vc3 b = vc3.b(cs3Var.K);
        a().z.d(str, b, "Setting DMA consent for package");
        c().v();
        l0();
        sk3 a = vc3.c(100, p0(str)).a();
        this.O.put(str, b);
        tc3 tc3Var = this.o;
        U(tc3Var);
        ll3.v(str);
        ll3.v(b);
        tc3Var.v();
        tc3Var.x();
        xk3 P = tc3Var.P(str);
        xk3 xk3Var = xk3.c;
        if (P == xk3Var) {
            tc3Var.R(str, xk3Var);
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("dma_consent_settings", b.b);
        tc3Var.T(contentValues);
        sk3 a2 = vc3.c(100, p0(str)).a();
        c().v();
        l0();
        sk3 sk3Var = sk3.GRANTED;
        sk3 sk3Var2 = sk3.DENIED;
        boolean z = a == sk3Var2 && a2 == sk3Var;
        boolean z2 = a == sk3Var && a2 == sk3Var2;
        if (z || z2) {
            a().z.c(str, "Generated _dcu event for");
            Bundle bundle = new Bundle();
            tc3 tc3Var2 = this.o;
            U(tc3Var2);
            if (tc3Var2.A0(g(), str, false, false, false, false).f < e0().E(str, ug3.m0)) {
                bundle.putLong("_r", 1L);
                tc3 tc3Var3 = this.o;
                U(tc3Var3);
                a().z.d(str, Long.valueOf(tc3Var3.A0(g(), str, false, false, true, false).f), "_dcu realtime event count");
            }
            this.V.zza(str, "_dcu", bundle);
        }
    }

    public final String o(xk3 xk3Var) {
        if (!xk3Var.i(vk3.ANALYTICS_STORAGE)) {
            return null;
        }
        byte[] bArr = new byte[16];
        k0().u0().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    public final vc3 o0(String str) {
        c().v();
        l0();
        HashMap hashMap = this.O;
        vc3 vc3Var = (vc3) hashMap.get(str);
        if (vc3Var != null) {
            return vc3Var;
        }
        tc3 tc3Var = this.o;
        U(tc3Var);
        ll3.v(str);
        tc3Var.v();
        tc3Var.x();
        vc3 b = vc3.b(tc3Var.S("select dma_consent_settings from consent_settings where app_id=? limit 1;", new String[]{str}));
        hashMap.put(str, b);
        return b;
    }

    public final void p(ArrayList arrayList) {
        ll3.p(!arrayList.isEmpty());
        if (this.K != null) {
            a().r.b("Set uploading progress before finishing the previous upload");
        } else {
            this.K = new ArrayList(arrayList);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Bundle p0(String str) {
        c().v();
        l0();
        dj3 dj3Var = this.m;
        U(dj3Var);
        if (dj3Var.R(str) == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        xk3 b = b(str);
        Bundle bundle2 = new Bundle();
        Iterator it = b.a.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            int ordinal = ((sk3) entry.getValue()).ordinal();
            String str2 = ordinal != 2 ? ordinal != 3 ? null : "granted" : "denied";
            if (str2 != null) {
                bundle2.putString(((vk3) entry.getKey()).m, str2);
            }
        }
        bundle.putAll(bundle2);
        vc3 q0 = q0(str, o0(str), b, new ot2(15));
        Bundle bundle3 = new Bundle();
        for (Map.Entry entry2 : q0.e.entrySet()) {
            int ordinal2 = ((sk3) entry2.getValue()).ordinal();
            String str3 = ordinal2 != 2 ? ordinal2 != 3 ? null : "granted" : "denied";
            if (str3 != null) {
                bundle3.putString(((vk3) entry2.getKey()).m, str3);
            }
        }
        Boolean bool = q0.c;
        if (bool != null) {
            bundle3.putString("is_dma_region", bool.toString());
        }
        String str4 = q0.d;
        if (str4 != null) {
            bundle3.putString("cps_display_str", str4);
        }
        bundle.putAll(bundle3);
        tc3 tc3Var = this.o;
        U(tc3Var);
        vq3 q02 = tc3Var.q0(str, "_npa");
        bundle.putString("ad_personalization", 1 != (q02 != null ? q02.e.equals(1L) : F(str, new ot2(15))) ? "granted" : "denied");
        return bundle;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0127, code lost:
    
        if (r7 == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01a2, code lost:
    
        if (r1 == 0) goto L71;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [oq3] */
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
        tc3 tc3Var;
        long longValue;
        SQLiteException e;
        c().v();
        l0();
        this.H = true;
        try {
            pj3 pj3Var = this.x;
            pj3Var.getClass();
            Boolean bool = pj3Var.p().q;
            if (bool == null) {
                a().u.b("Upload data called on the client side before use of service was decided");
            } else if (bool.booleanValue()) {
                a().r.b("Upload called in the client side when service should be used");
            } else if (this.A > 0) {
                N();
            } else {
                c().v();
                if (this.K != null) {
                    a().z.b("Uploading requested multiple times");
                } else {
                    bi3 bi3Var = this.n;
                    U(bi3Var);
                    if (bi3Var.Q()) {
                        e().getClass();
                        ?? currentTimeMillis = System.currentTimeMillis();
                        Cursor cursor = null;
                        r7 = null;
                        Cursor cursor2 = null;
                        r7 = null;
                        r7 = null;
                        String str = null;
                        int E = e0().E(null, ug3.i0);
                        e0();
                        long longValue2 = currentTimeMillis - ((Long) ug3.e.a(null)).longValue();
                        for (int i = 0; i < E && I(longValue2, null); i++) {
                        }
                        vr3.a();
                        c().v();
                        H();
                        long a = this.u.t.a();
                        if (a != 0) {
                            a().y.c(Long.valueOf(Math.abs(currentTimeMillis - a)), "Uploading events. Elapsed time since last upload attempt (ms)");
                        }
                        tc3 tc3Var2 = this.o;
                        U(tc3Var2);
                        String E2 = tc3Var2.E();
                        long j = -1;
                        if (TextUtils.isEmpty(E2)) {
                            try {
                                this.M = -1L;
                                tc3Var = this.o;
                                U(tc3Var);
                                e0();
                                longValue = currentTimeMillis - ((Long) ug3.e.a(null)).longValue();
                                tc3Var.v();
                                tc3Var.x();
                            } catch (Throwable th) {
                                th = th;
                                cursor = currentTimeMillis;
                            }
                            try {
                                currentTimeMillis = tc3Var.l0().rawQuery("select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;", new String[]{String.valueOf(longValue)});
                                try {
                                    if (currentTimeMillis.moveToFirst()) {
                                        str = currentTimeMillis.getString(0);
                                    } else {
                                        vh3 vh3Var = ((pj3) tc3Var.m).r;
                                        pj3.m(vh3Var);
                                        vh3Var.z.b("No expired configs for apps with pending events");
                                    }
                                } catch (SQLiteException e2) {
                                    e = e2;
                                    vh3 vh3Var2 = ((pj3) tc3Var.m).r;
                                    pj3.m(vh3Var2);
                                    vh3Var2.r.c(e, "Error selecting expired configs");
                                }
                            } catch (SQLiteException e3) {
                                e = e3;
                                currentTimeMillis = 0;
                            } catch (Throwable th2) {
                                th = th2;
                                throw th;
                            }
                            currentTimeMillis.close();
                            if (!TextUtils.isEmpty(str)) {
                                tc3 tc3Var3 = this.o;
                                U(tc3Var3);
                                di3 y0 = tc3Var3.y0(str);
                                if (y0 != null) {
                                    z(y0);
                                }
                            }
                        } else {
                            if (this.M == -1) {
                                tc3 tc3Var4 = this.o;
                                U(tc3Var4);
                                try {
                                    try {
                                        cursor2 = tc3Var4.l0().rawQuery("select rowid from raw_events order by rowid desc limit 1;", null);
                                        if (cursor2.moveToFirst()) {
                                            j = cursor2.getLong(0);
                                        }
                                    } finally {
                                        if (cursor2 != null) {
                                            cursor2.close();
                                        }
                                    }
                                } catch (SQLiteException e4) {
                                    vh3 vh3Var3 = ((pj3) tc3Var4.m).r;
                                    pj3.m(vh3Var3);
                                    vh3Var3.r.c(e4, "Error querying raw events");
                                }
                                cursor2.close();
                                this.M = j;
                            }
                            r(currentTimeMillis, E2);
                        }
                    } else {
                        a().z.b("Network not connected, ignoring upload request");
                        N();
                    }
                }
            }
            this.H = false;
            O();
        } catch (Throwable th3) {
            this.H = false;
            O();
            throw th3;
        }
    }

    public final vc3 q0(String str, vc3 vc3Var, xk3 xk3Var, ot2 ot2Var) {
        vk3 vk3Var;
        sk3 A;
        dj3 dj3Var = this.m;
        U(dj3Var);
        dh3 R = dj3Var.R(str);
        int i = 90;
        sk3 sk3Var = sk3.DENIED;
        vk3 vk3Var2 = vk3.AD_USER_DATA;
        if (R == null) {
            if (vc3Var.a() == sk3Var) {
                i = vc3Var.a;
                ot2Var.t(vk3Var2, i);
            } else {
                ot2Var.w(vk3Var2, gc3.FAILSAFE);
            }
            return new vc3(Boolean.FALSE, i, Boolean.TRUE, "-");
        }
        sk3 a = vc3Var.a();
        sk3 sk3Var2 = sk3.GRANTED;
        if (a == sk3Var2 || a == sk3Var) {
            i = vc3Var.a;
            ot2Var.t(vk3Var2, i);
        } else {
            sk3 sk3Var3 = sk3.POLICY;
            sk3 sk3Var4 = sk3.UNINITIALIZED;
            if (a != sk3Var3 || (A = dj3Var.A(str, vk3Var2)) == sk3Var4) {
                dj3Var.v();
                dj3Var.C(str);
                dh3 R2 = dj3Var.R(str);
                if (R2 != null) {
                    for (sg3 sg3Var : R2.q()) {
                        if (vk3Var2 == dj3.H(sg3Var.p())) {
                            vk3Var = dj3.H(sg3Var.q());
                            break;
                        }
                    }
                }
                vk3Var = null;
                EnumMap enumMap = xk3Var.a;
                vk3 vk3Var3 = vk3.AD_STORAGE;
                sk3 sk3Var5 = (sk3) enumMap.get(vk3Var3);
                if (sk3Var5 != null) {
                    sk3Var4 = sk3Var5;
                }
                boolean z = sk3Var4 == sk3Var2 || sk3Var4 == sk3Var;
                if (vk3Var == vk3Var3 && z) {
                    ot2Var.w(vk3Var2, gc3.REMOTE_DELEGATION);
                    a = sk3Var4;
                } else {
                    ot2Var.w(vk3Var2, gc3.REMOTE_DEFAULT);
                    a = true != dj3Var.Q(str, vk3Var2) ? sk3Var : sk3Var2;
                }
            } else {
                ot2Var.w(vk3Var2, gc3.REMOTE_ENFORCED_DEFAULT);
                a = A;
            }
        }
        dj3Var.v();
        dj3Var.C(str);
        dh3 R3 = dj3Var.R(str);
        boolean z2 = R3 == null || !R3.s() || R3.t();
        U(dj3Var);
        dj3Var.v();
        dj3Var.C(str);
        TreeSet treeSet = new TreeSet();
        dh3 R4 = dj3Var.R(str);
        if (R4 != null) {
            Iterator it = R4.r().iterator();
            while (it.hasNext()) {
                treeSet.add(((ah3) it.next()).p());
            }
        }
        if (a == sk3Var || treeSet.isEmpty()) {
            return new vc3(Boolean.FALSE, i, Boolean.valueOf(z2), "-");
        }
        Boolean bool = Boolean.TRUE;
        Boolean valueOf = Boolean.valueOf(z2);
        String str2 = BuildConfig.FLAVOR;
        if (z2) {
            str2 = TextUtils.join(BuildConfig.FLAVOR, treeSet);
        }
        return new vc3(bool, i, valueOf, str2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:375:0x0225, code lost:
    
        if (r11 != null) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:118:0x07af  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x07e9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x07f7 A[EDGE_INSN: B:158:0x07f7->B:159:0x07f7 BREAK  A[LOOP:4: B:97:0x064e->B:126:0x07e9], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0803  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0811  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0a7d  */
    /* JADX WARN: Removed duplicated region for block: B:226:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:245:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:269:0x04a9  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x049b  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x058a  */
    /* JADX WARN: Removed duplicated region for block: B:341:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x05a5  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0617  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0652  */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v58 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r(long j, String str) {
        Cursor cursor;
        pj3 pj3Var;
        long j2;
        Cursor cursor2;
        List list;
        List<Pair> list2;
        List list3;
        xk3 b;
        vk3 vk3Var;
        int i;
        List list4;
        mj3 w;
        int size;
        int i2;
        boolean i3;
        boolean G;
        List list5;
        pj3 pj3Var2;
        boolean z;
        Object obj;
        bi3 bi3Var;
        String str2;
        xp3 xp3Var;
        int i4;
        boolean z2;
        int i5;
        List list6;
        boolean z3;
        String str3;
        List list7;
        boolean isEmpty;
        Cursor cursor3;
        pj3 pj3Var3;
        List list8;
        Cursor cursor4;
        List list9;
        Iterator it;
        Iterator it2;
        int i6;
        int i7;
        SQLiteDatabase l0;
        long currentTimeMillis;
        Cursor query;
        ArrayList arrayList;
        tc3 tc3Var;
        byte[] byteArray;
        long j3;
        long j4;
        String str4 = str;
        int E = e0().E(str4, ug3.h);
        int i8 = 0;
        int max = Math.max(0, e0().E(str4, ug3.i));
        tc3 g0 = g0();
        pj3 pj3Var4 = (pj3) g0.m;
        g0.v();
        g0.x();
        int i9 = 1;
        ll3.p(E > 0);
        ?? r11 = max > 0 ? 1 : 0;
        ll3.p(r11);
        ll3.s(str4);
        try {
            try {
                try {
                    j2 = -1;
                } catch (Throwable th) {
                    th = th;
                    cursor = null;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } catch (SQLiteException e) {
                e = e;
                pj3Var = pj3Var4;
                j2 = -1;
            }
            try {
                cursor2 = g0.l0().query("queue", new String[]{"rowid", "data", "retry_count"}, "app_id=?", new String[]{str4}, null, null, "rowid", String.valueOf(E));
                try {
                } catch (SQLiteException e2) {
                    e = e2;
                    pj3Var = pj3Var4;
                }
            } catch (SQLiteException e3) {
                e = e3;
                pj3Var = pj3Var4;
                cursor2 = null;
                pj3Var.a().A().d(vh3.E(str4), e, "Error querying bundles. appId");
                list = Collections.EMPTY_LIST;
            }
            if (cursor2.moveToFirst()) {
                ArrayList arrayList2 = new ArrayList();
                int i10 = 0;
                while (true) {
                    long j5 = cursor2.getLong(i8);
                    try {
                        byte[] blob = cursor2.getBlob(i9);
                        bi3 j0 = g0.n.j0();
                        try {
                            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(blob);
                            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            byte[] bArr = new byte[1024];
                            tc3Var = g0;
                            while (true) {
                                try {
                                    int read = gZIPInputStream.read(bArr);
                                    if (read <= 0) {
                                        break;
                                    }
                                    pj3Var = pj3Var4;
                                    try {
                                        try {
                                            byteArrayOutputStream.write(bArr, 0, read);
                                            pj3Var4 = pj3Var;
                                        } catch (IOException e4) {
                                            e = e4;
                                            try {
                                                ((pj3) j0.m).a().A().c(e, "Failed to ungzip content");
                                                throw e;
                                            } catch (IOException e5) {
                                                e = e5;
                                                pj3Var.a().A().d(vh3.E(str4), e, "Failed to unzip queued bundle. appId");
                                                if (cursor2.moveToNext()) {
                                                    break;
                                                }
                                                g0 = tc3Var;
                                                pj3Var4 = pj3Var;
                                                i8 = 0;
                                                i9 = 1;
                                                cursor2.close();
                                                list2 = arrayList2;
                                                if (list2.isEmpty()) {
                                                }
                                            }
                                        }
                                    } catch (SQLiteException e6) {
                                        e = e6;
                                        pj3Var.a().A().d(vh3.E(str4), e, "Error querying bundles. appId");
                                        list = Collections.EMPTY_LIST;
                                    }
                                } catch (IOException e7) {
                                    e = e7;
                                    pj3Var = pj3Var4;
                                    ((pj3) j0.m).a().A().c(e, "Failed to ungzip content");
                                    throw e;
                                }
                            }
                            gZIPInputStream.close();
                            byteArrayInputStream.close();
                            byteArray = byteArrayOutputStream.toByteArray();
                        } catch (IOException e8) {
                            e = e8;
                            tc3Var = g0;
                        }
                    } catch (IOException e9) {
                        e = e9;
                        tc3Var = g0;
                        pj3Var = pj3Var4;
                    }
                    if (!arrayList2.isEmpty() && byteArray.length + i10 > max) {
                        break;
                    }
                    try {
                        qj3 qj3Var = (qj3) bi3.j0(sj3.U(), byteArray);
                        if (!arrayList2.isEmpty()) {
                            sj3 sj3Var = (sj3) ((Pair) arrayList2.get(0)).first;
                            sj3 sj3Var2 = (sj3) qj3Var.d();
                            if (!sj3Var.u0().equals(sj3Var2.u0()) || !sj3Var.B0().equals(sj3Var2.B0()) || sj3Var.D0() != sj3Var2.D0() || !sj3Var.F0().equals(sj3Var2.F0())) {
                                break;
                            }
                            Iterator it3 = sj3Var.U1().iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    j3 = -1;
                                    break;
                                }
                                ek3 ek3Var = (ek3) it3.next();
                                Iterator it4 = it3;
                                if ("_npa".equals(ek3Var.r())) {
                                    j3 = ek3Var.v();
                                    break;
                                }
                                it3 = it4;
                            }
                            Iterator it5 = sj3Var2.U1().iterator();
                            while (true) {
                                if (!it5.hasNext()) {
                                    j4 = -1;
                                    break;
                                }
                                ek3 ek3Var2 = (ek3) it5.next();
                                if ("_npa".equals(ek3Var2.r())) {
                                    j4 = ek3Var2.v();
                                    break;
                                }
                            }
                            if (j3 != j4) {
                                break;
                            }
                        }
                        if (!cursor2.isNull(2)) {
                            int i11 = cursor2.getInt(2);
                            qj3Var.b();
                            ((sj3) qj3Var.n).T0(i11);
                        }
                        i10 += byteArray.length;
                        arrayList2.add(Pair.create((sj3) qj3Var.d(), Long.valueOf(j5)));
                    } catch (IOException e10) {
                        pj3Var4.a().A().d(vh3.E(str4), e10, "Failed to merge queued bundle. appId");
                    }
                    pj3Var = pj3Var4;
                    if (cursor2.moveToNext() || i10 > max) {
                        break;
                        break;
                    }
                    g0 = tc3Var;
                    pj3Var4 = pj3Var;
                    i8 = 0;
                    i9 = 1;
                }
                cursor2.close();
                list2 = arrayList2;
                if (list2.isEmpty()) {
                }
            } else {
                list = Collections.EMPTY_LIST;
                cursor2.close();
                list2 = list;
                if (list2.isEmpty()) {
                    return;
                }
                yq3 yq3Var = yq3.n;
                ec3 e0 = e0();
                tg3 tg3Var = ug3.h1;
                boolean G2 = e0.G(null, tg3Var);
                vk3 vk3Var2 = vk3.ANALYTICS_STORAGE;
                if (G2) {
                    if (!e0().G(null, tg3Var)) {
                        list7 = list2;
                    } else if (b(str4).i(vk3Var2) || !f0().B(str4)) {
                        ArrayList arrayList3 = new ArrayList(list2.size());
                        tc3 g02 = g0();
                        pj3 pj3Var5 = (pj3) g02.m;
                        ll3.s(str4);
                        g02.v();
                        g02.x();
                        ArrayList arrayList4 = new ArrayList();
                        try {
                            try {
                                l0 = g02.l0();
                                pj3Var5.e().getClass();
                                currentTimeMillis = System.currentTimeMillis();
                                query = l0.query("no_data_mode_events", new String[]{"data"}, "app_id=? AND timestamp_millis <= CAST(? AS INTEGER)", new String[]{str4, String.valueOf(currentTimeMillis)}, null, null, "rowid", null);
                                pj3Var3 = pj3Var5;
                            } catch (SQLiteException e11) {
                                e = e11;
                                pj3Var3 = pj3Var5;
                                list8 = list2;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            cursor3 = null;
                            if (cursor3 != null) {
                                cursor3.close();
                            }
                            throw th;
                        }
                        try {
                            try {
                                if (query.moveToFirst()) {
                                    list8 = list2;
                                    while (true) {
                                        try {
                                            try {
                                                arrayList4.add((cj3) ((bj3) bi3.j0(cj3.z(), query.getBlob(0))).d());
                                                cursor4 = query;
                                                arrayList = arrayList4;
                                            } catch (SQLiteException e12) {
                                                e = e12;
                                                cursor4 = query;
                                                pj3Var3.a().A().d(vh3.E(str4), e, "Error flushing NO_DATA mode events. appId");
                                                list9 = Collections.EMPTY_LIST;
                                                if (cursor4 != null) {
                                                }
                                                it = list8.iterator();
                                                boolean z4 = true;
                                                while (it.hasNext()) {
                                                }
                                                list7 = arrayList3;
                                                isEmpty = list7.isEmpty();
                                                list3 = list7;
                                                if (isEmpty) {
                                                }
                                                b = b(str4);
                                                vk3Var = vk3.AD_STORAGE;
                                                if (b.i(vk3Var)) {
                                                }
                                                i = 0;
                                                list4 = list3;
                                                w = oj3.w();
                                                size = list4.size();
                                                ArrayList arrayList5 = new ArrayList(list4.size());
                                                if (e0().x(str4)) {
                                                }
                                                boolean i12 = b(str4).i(vk3Var);
                                                i3 = b(str4).i(vk3Var2);
                                                G = e0().G(str4, ug3.M0);
                                                zp3 zp3Var = this.v;
                                                xp3 x = zp3Var.x(str4);
                                                list5 = list4;
                                                while (true) {
                                                    pj3Var2 = this.x;
                                                    if (i < size) {
                                                    }
                                                    i = r23 + 1;
                                                    size = i4;
                                                    i3 = z2;
                                                    list5 = list6;
                                                    i2 = i5;
                                                    G = z3;
                                                }
                                                if (((oj3) w.n).q() != 0) {
                                                }
                                            }
                                        } catch (un3 e13) {
                                            cursor4 = query;
                                            try {
                                                try {
                                                    arrayList = arrayList4;
                                                    pj3Var3.a().w.d(vh3.E(str4), e13, "Failed to parse stored NO_DATA mode event, appId");
                                                } catch (SQLiteException e14) {
                                                    e = e14;
                                                    pj3Var3.a().A().d(vh3.E(str4), e, "Error flushing NO_DATA mode events. appId");
                                                    list9 = Collections.EMPTY_LIST;
                                                    if (cursor4 != null) {
                                                    }
                                                    it = list8.iterator();
                                                    boolean z42 = true;
                                                    while (it.hasNext()) {
                                                    }
                                                    list7 = arrayList3;
                                                    isEmpty = list7.isEmpty();
                                                    list3 = list7;
                                                    if (isEmpty) {
                                                    }
                                                    b = b(str4);
                                                    vk3Var = vk3.AD_STORAGE;
                                                    if (b.i(vk3Var)) {
                                                    }
                                                    i = 0;
                                                    list4 = list3;
                                                    w = oj3.w();
                                                    size = list4.size();
                                                    ArrayList arrayList52 = new ArrayList(list4.size());
                                                    if (e0().x(str4)) {
                                                    }
                                                    boolean i122 = b(str4).i(vk3Var);
                                                    i3 = b(str4).i(vk3Var2);
                                                    G = e0().G(str4, ug3.M0);
                                                    zp3 zp3Var2 = this.v;
                                                    xp3 x2 = zp3Var2.x(str4);
                                                    list5 = list4;
                                                    while (true) {
                                                        pj3Var2 = this.x;
                                                        if (i < size) {
                                                        }
                                                        i = r23 + 1;
                                                        size = i4;
                                                        i3 = z2;
                                                        list5 = list6;
                                                        i2 = i5;
                                                        G = z3;
                                                    }
                                                    if (((oj3) w.n).q() != 0) {
                                                    }
                                                }
                                            } catch (Throwable th3) {
                                                th = th3;
                                                cursor3 = cursor4;
                                                if (cursor3 != null) {
                                                }
                                                throw th;
                                            }
                                        }
                                        if (!cursor4.moveToNext()) {
                                            break;
                                        }
                                        query = cursor4;
                                        arrayList4 = arrayList;
                                    }
                                    cursor4.close();
                                    try {
                                        int delete = l0.delete("no_data_mode_events", "app_id=? AND timestamp_millis <= CAST(? AS INTEGER)", new String[]{str4, String.valueOf(currentTimeMillis)});
                                        g10 D = pj3Var3.a().D();
                                        StringBuilder sb = new StringBuilder(String.valueOf(delete).length() + 34);
                                        sb.append("Pruned ");
                                        sb.append(delete);
                                        sb.append(" NO_DATA mode events. appId");
                                        D.c(str4, sb.toString());
                                    } catch (SQLiteException e15) {
                                        e = e15;
                                        cursor4 = null;
                                        pj3Var3.a().A().d(vh3.E(str4), e, "Error flushing NO_DATA mode events. appId");
                                        list9 = Collections.EMPTY_LIST;
                                        if (cursor4 != null) {
                                            cursor4.close();
                                        }
                                        it = list8.iterator();
                                        boolean z422 = true;
                                        while (it.hasNext()) {
                                        }
                                        list7 = arrayList3;
                                        isEmpty = list7.isEmpty();
                                        list3 = list7;
                                        if (isEmpty) {
                                        }
                                        b = b(str4);
                                        vk3Var = vk3.AD_STORAGE;
                                        if (b.i(vk3Var)) {
                                        }
                                        i = 0;
                                        list4 = list3;
                                        w = oj3.w();
                                        size = list4.size();
                                        ArrayList arrayList522 = new ArrayList(list4.size());
                                        if (e0().x(str4)) {
                                        }
                                        boolean i1222 = b(str4).i(vk3Var);
                                        i3 = b(str4).i(vk3Var2);
                                        G = e0().G(str4, ug3.M0);
                                        zp3 zp3Var22 = this.v;
                                        xp3 x22 = zp3Var22.x(str4);
                                        list5 = list4;
                                        while (true) {
                                            pj3Var2 = this.x;
                                            if (i < size) {
                                            }
                                            i = r23 + 1;
                                            size = i4;
                                            i3 = z2;
                                            list5 = list6;
                                            i2 = i5;
                                            G = z3;
                                        }
                                        if (((oj3) w.n).q() != 0) {
                                        }
                                    }
                                } else {
                                    arrayList = arrayList4;
                                    list8 = list2;
                                    query.close();
                                }
                                list9 = arrayList;
                            } catch (SQLiteException e16) {
                                e = e16;
                                cursor4 = query;
                                list8 = list2;
                            }
                            it = list8.iterator();
                            boolean z4222 = true;
                            while (it.hasNext()) {
                                Pair pair = (Pair) it.next();
                                qj3 qj3Var2 = (qj3) ((sj3) pair.first).i();
                                if (z4222 && !list9.isEmpty()) {
                                    List T = qj3Var2.T();
                                    qj3Var2.b();
                                    ((sj3) qj3Var2.n).a0();
                                    qj3Var2.b();
                                    ((sj3) qj3Var2.n).Z(list9);
                                    qj3Var2.b();
                                    ((sj3) qj3Var2.n).Z(T);
                                    z4222 = false;
                                }
                                ri3 q = wi3.q();
                                dh3 R = f0().R(str4);
                                ArrayList arrayList6 = new ArrayList();
                                if (R != null) {
                                    Iterator it6 = R.p().iterator();
                                    while (it6.hasNext()) {
                                        rg3 rg3Var = (rg3) it6.next();
                                        Iterator it7 = it;
                                        ui3 p = vi3.p();
                                        boolean z5 = z4222;
                                        int p2 = rg3Var.p() - 1;
                                        List list10 = list9;
                                        if (p2 == 1) {
                                            it2 = it6;
                                            i6 = 3;
                                            i7 = 2;
                                        } else if (p2 != 2) {
                                            it2 = it6;
                                            i6 = 3;
                                            i7 = p2 != 3 ? p2 != 4 ? 1 : 5 : 4;
                                        } else {
                                            it2 = it6;
                                            i6 = 3;
                                            i7 = 3;
                                        }
                                        p.g(i7);
                                        int r = rg3Var.r() - 1;
                                        if (r == 1) {
                                            i6 = 2;
                                        } else if (r != 2) {
                                            i6 = 1;
                                        }
                                        p.h(i6);
                                        arrayList6.add((vi3) p.d());
                                        it = it7;
                                        list9 = list10;
                                        z4222 = z5;
                                        it6 = it2;
                                    }
                                }
                                Iterator it8 = it;
                                boolean z6 = z4222;
                                List list11 = list9;
                                q.g(arrayList6);
                                qj3Var2.D(q);
                                arrayList3.add(Pair.create((sj3) qj3Var2.d(), (Long) pair.second));
                                it = it8;
                                list9 = list11;
                                z4222 = z6;
                            }
                            list7 = arrayList3;
                        } catch (Throwable th4) {
                            th = th4;
                            cursor4 = query;
                            cursor3 = cursor4;
                            if (cursor3 != null) {
                            }
                            throw th;
                        }
                    } else {
                        List asList = Arrays.asList(((String) ug3.i1.a(null)).split(","));
                        for (Pair pair2 : list2) {
                            try {
                                g0().F(((Long) pair2.second).longValue());
                                for (cj3 cj3Var : ((sj3) pair2.first).P1()) {
                                    if (asList.contains(cj3Var.s())) {
                                        if (cj3Var.s().equals("_f") || cj3Var.s().equals("_v")) {
                                            bj3 bj3Var = (bj3) cj3Var.i();
                                            j0();
                                            bi3.C(bj3Var, "_dac", 1L);
                                            cj3Var = (cj3) bj3Var.d();
                                        }
                                        tc3 g03 = g0();
                                        g03.v();
                                        g03.x();
                                        ll3.s(str4);
                                        pj3 pj3Var6 = (pj3) g03.m;
                                        pj3Var6.a().D().c(cj3Var, "Caching events in NO_DATA mode");
                                        ContentValues contentValues = new ContentValues();
                                        contentValues.put("app_id", str4);
                                        cj3 cj3Var2 = cj3Var;
                                        contentValues.put("name", cj3Var2.s());
                                        contentValues.put("data", cj3Var2.a());
                                        contentValues.put("timestamp_millis", Long.valueOf(cj3Var2.u()));
                                        try {
                                            if (g03.l0().insert("no_data_mode_events", null, contentValues) == j2) {
                                                pj3Var6.a().A().c(vh3.E(str4), "Failed to insert NO_DATA mode event (got -1). appId");
                                            }
                                        } catch (SQLiteException e17) {
                                            ((pj3) g03.m).a().A().d(vh3.E(str4), e17, "Error storing NO_DATA mode event. appId");
                                        }
                                    }
                                }
                            } catch (SQLiteException unused) {
                                a().w.c(str4, "Failed handling NO_DATA mode bundles. appId");
                            }
                        }
                        list7 = Collections.EMPTY_LIST;
                    }
                    isEmpty = list7.isEmpty();
                    list3 = list7;
                    if (isEmpty) {
                        return;
                    }
                } else {
                    list3 = list2;
                }
                b = b(str4);
                vk3Var = vk3.AD_STORAGE;
                if (b.i(vk3Var)) {
                    Iterator it9 = list3.iterator();
                    while (true) {
                        if (!it9.hasNext()) {
                            str3 = null;
                            break;
                        }
                        sj3 sj3Var3 = (sj3) ((Pair) it9.next()).first;
                        if (!sj3Var3.v().isEmpty()) {
                            str3 = sj3Var3.v();
                            break;
                        }
                    }
                    if (str3 != null) {
                        for (int i13 = 0; i13 < list3.size(); i13++) {
                            sj3 sj3Var4 = (sj3) ((Pair) list3.get(i13)).first;
                            if (!sj3Var4.v().isEmpty() && !sj3Var4.v().equals(str3)) {
                                i = 0;
                                list4 = list3.subList(0, i13);
                                break;
                            }
                        }
                    }
                }
                i = 0;
                list4 = list3;
                w = oj3.w();
                size = list4.size();
                ArrayList arrayList5222 = new ArrayList(list4.size());
                i2 = (e0().x(str4) || !b(str4).i(vk3Var)) ? i : 1;
                boolean i12222 = b(str4).i(vk3Var);
                i3 = b(str4).i(vk3Var2);
                G = e0().G(str4, ug3.M0);
                zp3 zp3Var222 = this.v;
                xp3 x222 = zp3Var222.x(str4);
                list5 = list4;
                while (true) {
                    pj3Var2 = this.x;
                    if (i < size) {
                        break;
                    }
                    qj3 qj3Var3 = (qj3) ((sj3) ((Pair) list5.get(i)).first).i();
                    int i14 = i;
                    arrayList5222.add((Long) ((Pair) list5.get(i)).second);
                    e0().B();
                    qj3Var3.r();
                    qj3Var3.b();
                    ((sj3) qj3Var3.n).f0(j);
                    pj3Var2.getClass();
                    qj3Var3.H();
                    if (i2 == 0) {
                        qj3Var3.b();
                        ((sj3) qj3Var3.n).S0();
                    }
                    if (!i12222) {
                        qj3Var3.b();
                        ((sj3) qj3Var3.n).z1();
                        qj3Var3.b();
                        ((sj3) qj3Var3.n).B1();
                    }
                    if (!i3) {
                        qj3Var3.b();
                        ((sj3) qj3Var3.n).D1();
                    }
                    v(str4, qj3Var3);
                    if (!G) {
                        qj3Var3.b();
                        ((sj3) qj3Var3.n).Z0();
                    }
                    if (!i3) {
                        qj3Var3.b();
                        ((sj3) qj3Var3.n).L1();
                    }
                    String v = ((sj3) qj3Var3.n).v();
                    if (TextUtils.isEmpty(v)) {
                        i4 = size;
                    } else {
                        i4 = size;
                        if (!v.equals("00000000-0000-0000-0000-000000000000")) {
                            z2 = i3;
                            i5 = i2;
                            list6 = list5;
                            z3 = G;
                            if (qj3Var3.U() != 0) {
                                if (e0().G(str4, ug3.C0)) {
                                    qj3Var3.O(j0().h0(((sj3) qj3Var3.d()).a()));
                                }
                                ck3 b2 = x222.b();
                                if (b2 != null) {
                                    qj3Var3.A(b2);
                                }
                                w.b();
                                ((oj3) w.n).z((sj3) qj3Var3.d());
                            }
                            i = i14 + 1;
                            size = i4;
                            i3 = z2;
                            list5 = list6;
                            i2 = i5;
                            G = z3;
                        }
                    }
                    ArrayList arrayList7 = new ArrayList(qj3Var3.T());
                    Iterator it10 = arrayList7.iterator();
                    z2 = i3;
                    Long l = null;
                    Long l2 = null;
                    boolean z7 = false;
                    boolean z8 = false;
                    while (it10.hasNext()) {
                        int i15 = i2;
                        cj3 cj3Var3 = (cj3) it10.next();
                        List list12 = list5;
                        boolean z9 = G;
                        if ("_fx".equals(cj3Var3.s())) {
                            it10.remove();
                            list5 = list12;
                            i2 = i15;
                            G = z9;
                            z7 = true;
                        } else if ("_f".equals(cj3Var3.s())) {
                            j0();
                            hj3 E2 = bi3.E("_pfo", cj3Var3);
                            if (E2 != null) {
                                l = Long.valueOf(E2.u());
                            }
                            j0();
                            hj3 E3 = bi3.E("_uwa", cj3Var3);
                            if (E3 != null) {
                                l2 = Long.valueOf(E3.u());
                            }
                            list5 = list12;
                            i2 = i15;
                            G = z9;
                        } else {
                            list5 = list12;
                            i2 = i15;
                            G = z9;
                        }
                        z8 = true;
                    }
                    i5 = i2;
                    list6 = list5;
                    z3 = G;
                    if (z7) {
                        qj3Var3.b();
                        ((sj3) qj3Var3.n).a0();
                        qj3Var3.b();
                        ((sj3) qj3Var3.n).Z(arrayList7);
                    }
                    if (z8) {
                        u(qj3Var3.n(), true, l, l2);
                    }
                    if (qj3Var3.U() != 0) {
                    }
                    i = i14 + 1;
                    size = i4;
                    i3 = z2;
                    list5 = list6;
                    i2 = i5;
                    G = z3;
                }
                if (((oj3) w.n).q() != 0) {
                    p(arrayList5222);
                    y(false, 204, null, null, str4, Collections.EMPTY_LIST);
                    return;
                }
                oj3 oj3Var = (oj3) w.d();
                ArrayList arrayList8 = new ArrayList();
                sm3 sm3Var = x222.c;
                boolean z10 = sm3Var == sm3.SGTM_CLIENT;
                if (sm3Var == sm3.SGTM) {
                    z = z10;
                } else {
                    if (!z10) {
                        obj = null;
                        bi3Var = this.n;
                        U(bi3Var);
                        if (bi3Var.Q()) {
                            return;
                        }
                        Object Z = Log.isLoggable(a().G(), 2) ? j0().Z(oj3Var) : obj;
                        j0();
                        byte[] a = oj3Var.a();
                        p(arrayList5222);
                        this.u.u.b(j);
                        a().D().e("Uploading data. app, uncompressed size, data", str4, Integer.valueOf(a.length), Z);
                        this.G = true;
                        U(bi3Var);
                        bi3Var.U(str4, x222, oj3Var, new t13(this, str4, arrayList8));
                        return;
                    }
                    z = true;
                }
                Iterator it11 = ((oj3) w.d()).p().iterator();
                while (true) {
                    if (it11.hasNext()) {
                        if (((sj3) it11.next()).N()) {
                            str2 = UUID.randomUUID().toString();
                            break;
                        }
                    } else {
                        str2 = null;
                        break;
                    }
                }
                oj3 oj3Var2 = (oj3) w.d();
                c().v();
                l0();
                mj3 x3 = oj3.x(oj3Var2);
                if (!TextUtils.isEmpty(str2)) {
                    x3.b();
                    ((oj3) x3.n).C(str2);
                }
                String J = f0().J(str4);
                if (!TextUtils.isEmpty(J)) {
                    x3.h(J);
                }
                ArrayList arrayList9 = new ArrayList();
                Iterator it12 = oj3Var2.p().iterator();
                while (it12.hasNext()) {
                    qj3 V = sj3.V((sj3) it12.next());
                    V.b();
                    ((sj3) V.n).S0();
                    arrayList9.add((sj3) V.d());
                }
                x3.b();
                ((oj3) x3.n).B();
                x3.b();
                ((oj3) x3.n).A(arrayList9);
                a().D().c(TextUtils.isEmpty(str2) ? "null" : x3.g(), "[sgtm] Processed MeasurementBatch for sGTM with sgtmJoinId: ");
                oj3 oj3Var3 = (oj3) x3.d();
                if (TextUtils.isEmpty(str2)) {
                    obj = null;
                } else {
                    oj3 oj3Var4 = (oj3) w.d();
                    c().v();
                    l0();
                    mj3 w2 = oj3.w();
                    a().D().c(str2, "[sgtm] Processing Google Signal, sgtmJoinId:");
                    w2.b();
                    ((oj3) w2.n).C(str2);
                    for (sj3 sj3Var5 : oj3Var4.p()) {
                        qj3 U = sj3.U();
                        String O = sj3Var5.O();
                        U.b();
                        ((sj3) U.n).R0(O);
                        int K0 = sj3Var5.K0();
                        U.b();
                        ((sj3) U.n).j1(K0);
                        w2.b();
                        ((oj3) w2.n).z((sj3) U.d());
                    }
                    oj3 oj3Var5 = (oj3) w2.d();
                    String J2 = zp3Var222.n.f0().J(str4);
                    boolean isEmpty2 = TextUtils.isEmpty(J2);
                    sm3 sm3Var2 = sm3.GOOGLE_SIGNAL;
                    sm3 sm3Var3 = sm3.GOOGLE_SIGNAL_PENDING;
                    if (isEmpty2) {
                        obj = null;
                        String str5 = (String) ug3.s.a(null);
                        if (z) {
                            sm3Var2 = sm3Var3;
                        }
                        xp3Var = new xp3(str5, Collections.EMPTY_MAP, sm3Var2, null);
                    } else {
                        Uri parse = Uri.parse((String) ug3.s.a(null));
                        Uri.Builder buildUpon = parse.buildUpon();
                        String authority = parse.getAuthority();
                        StringBuilder sb2 = new StringBuilder(String.valueOf(J2).length() + 1 + String.valueOf(authority).length());
                        sb2.append(J2);
                        sb2.append(".");
                        sb2.append(authority);
                        buildUpon.authority(sb2.toString());
                        String uri = buildUpon.build().toString();
                        if (z) {
                            sm3Var2 = sm3Var3;
                        }
                        obj = null;
                        xp3Var = new xp3(uri, Collections.EMPTY_MAP, sm3Var2, null);
                    }
                    arrayList8.add(Pair.create(oj3Var5, xp3Var));
                }
                if (z) {
                    mj3 mj3Var = (mj3) oj3Var3.i();
                    for (int i16 = 0; i16 < oj3Var3.q(); i16++) {
                        qj3 qj3Var4 = (qj3) oj3Var3.r(i16).i();
                        qj3Var4.Z();
                        qj3Var4.B(j);
                        mj3Var.b();
                        ((oj3) mj3Var.n).y(i16, (sj3) qj3Var4.d());
                    }
                    arrayList8.add(Pair.create((oj3) mj3Var.d(), x222));
                    p(arrayList5222);
                    y(false, 204, null, null, str, arrayList8);
                    if (s(str, x222.a())) {
                        a().D().c(str, "[sgtm] Sending sgtm batches available notification to app");
                        Intent intent = new Intent();
                        intent.setAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                        intent.setPackage(str);
                        S(pj3Var2.d(), intent);
                        return;
                    }
                    return;
                }
                str4 = str;
                oj3Var = oj3Var3;
                bi3Var = this.n;
                U(bi3Var);
                if (bi3Var.Q()) {
                }
            }
        } catch (Throwable th5) {
            th = th5;
            cursor = r11;
        }
    }

    public final boolean s(String str, String str2) {
        tc3 tc3Var = this.o;
        U(tc3Var);
        di3 y0 = tc3Var.y0(str);
        HashMap hashMap = this.Q;
        if (y0 != null && k0().X(str, y0.C())) {
            hashMap.remove(str2);
            return true;
        }
        lq3 lq3Var = (lq3) hashMap.get(str2);
        if (lq3Var != null) {
            lq3Var.a.e().getClass();
            if (System.currentTimeMillis() < lq3Var.c) {
                return false;
            }
        }
        return true;
    }

    public final void t(String str) {
        c().v();
        l0();
        this.H = true;
        try {
            pj3 pj3Var = this.x;
            pj3Var.getClass();
            Boolean bool = pj3Var.p().q;
            if (bool == null) {
                a().u.b("Upload data called on the client side before use of service was decided");
            } else if (bool.booleanValue()) {
                a().r.b("Upload called in the client side when service should be used");
            } else if (this.A > 0) {
                N();
            } else {
                bi3 bi3Var = this.n;
                U(bi3Var);
                if (bi3Var.Q()) {
                    tc3 tc3Var = this.o;
                    U(tc3Var);
                    if (tc3Var.C(str)) {
                        tc3 tc3Var2 = this.o;
                        U(tc3Var2);
                        ll3.s(str);
                        tc3Var2.v();
                        tc3Var2.x();
                        List B = tc3Var2.B(str, qp3.a(sm3.GOOGLE_SIGNAL), 1);
                        rq3 rq3Var = B.isEmpty() ? null : (rq3) B.get(0);
                        if (rq3Var != null) {
                            oj3 oj3Var = rq3Var.b;
                            a().z.e("[sgtm] Uploading data from upload queue. appId, type, url", str, rq3Var.e, rq3Var.c);
                            byte[] a = oj3Var.a();
                            if (Log.isLoggable(a().G(), 2)) {
                                bi3 bi3Var2 = this.s;
                                U(bi3Var2);
                                a().z.e("[sgtm] Uploading data from upload queue. appId, uncompressed size, data", str, Integer.valueOf(a.length), bi3Var2.Z(oj3Var));
                            }
                            xp3 xp3Var = new xp3(rq3Var.c, rq3Var.d, rq3Var.e, null);
                            this.G = true;
                            bi3 bi3Var3 = this.n;
                            U(bi3Var3);
                            bi3Var3.U(str, xp3Var, oj3Var, new t13(this, str, rq3Var));
                        }
                    } else {
                        a().z.c(str, "[sgtm] Upload queue has no batches for appId");
                    }
                } else {
                    a().z.b("Network not connected, ignoring upload request");
                    N();
                }
            }
            this.H = false;
            O();
        } catch (Throwable th) {
            this.H = false;
            O();
            throw th;
        }
    }

    public final void u(String str, boolean z, Long l, Long l2) {
        tc3 tc3Var = this.o;
        U(tc3Var);
        di3 y0 = tc3Var.y0(str);
        if (y0 != null) {
            pj3 pj3Var = y0.a;
            lj3 lj3Var = pj3Var.s;
            pj3.m(lj3Var);
            lj3Var.v();
            y0.Q |= y0.y != z;
            y0.y = z;
            lj3 lj3Var2 = pj3Var.s;
            pj3.m(lj3Var2);
            lj3Var2.v();
            y0.Q |= !Objects.equals(y0.z, l);
            y0.z = l;
            lj3 lj3Var3 = pj3Var.s;
            pj3.m(lj3Var3);
            lj3Var3.v();
            y0.Q |= !Objects.equals(y0.A, l2);
            y0.A = l2;
            if (y0.o()) {
                tc3 tc3Var2 = this.o;
                U(tc3Var2);
                tc3Var2.z0(y0, false);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x011f, code lost:
    
        if (r6 < android.os.SystemClock.elapsedRealtime()) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(String str, qj3 qj3Var) {
        int k0;
        int indexOf;
        dj3 dj3Var = this.m;
        U(dj3Var);
        dj3Var.v();
        dj3Var.C(str);
        hi hiVar = dj3Var.q;
        Set set = (Set) hiVar.get(str);
        if (set != null) {
            qj3Var.b();
            ((sj3) qj3Var.n).a1(set);
        }
        U(dj3Var);
        dj3Var.v();
        dj3Var.C(str);
        if (hiVar.get(str) != null && (((Set) hiVar.get(str)).contains("device_model") || ((Set) hiVar.get(str)).contains(DeviceRequestsHelper.DEVICE_INFO_PARAM))) {
            qj3Var.b();
            ((sj3) qj3Var.n).q1();
        }
        U(dj3Var);
        if (dj3Var.O(str)) {
            String i2 = ((sj3) qj3Var.n).i2();
            if (!TextUtils.isEmpty(i2) && (indexOf = i2.indexOf(".")) != -1) {
                String substring = i2.substring(0, indexOf);
                qj3Var.b();
                ((sj3) qj3Var.n).o0(substring);
            }
        }
        U(dj3Var);
        dj3Var.v();
        dj3Var.C(str);
        if (hiVar.get(str) != null && ((Set) hiVar.get(str)).contains("user_id") && (k0 = bi3.k0("_id", qj3Var)) != -1) {
            qj3Var.b();
            ((sj3) qj3Var.n).e0(k0);
        }
        U(dj3Var);
        dj3Var.v();
        dj3Var.C(str);
        if (hiVar.get(str) != null && ((Set) hiVar.get(str)).contains("google_signals")) {
            qj3Var.b();
            ((sj3) qj3Var.n).S0();
        }
        U(dj3Var);
        if (dj3Var.P(str)) {
            qj3Var.b();
            ((sj3) qj3Var.n).D1();
            if (b(str).i(vk3.ANALYTICS_STORAGE)) {
                HashMap hashMap = this.P;
                kq3 kq3Var = (kq3) hashMap.get(str);
                if (kq3Var != null) {
                    long D = e0().D(str, ug3.k0) + kq3Var.b;
                    e().getClass();
                }
                kq3Var = new kq3(this, k0().p0());
                hashMap.put(str, kq3Var);
                String str2 = kq3Var.a;
                qj3Var.b();
                ((sj3) qj3Var.n).b1(str2);
            }
        }
        U(dj3Var);
        dj3Var.v();
        dj3Var.C(str);
        if (hiVar.get(str) == null || !((Set) hiVar.get(str)).contains("enhanced_user_id")) {
            return;
        }
        qj3Var.b();
        ((sj3) qj3Var.n).Z0();
    }

    public final void w(qj3 qj3Var, ni3 ni3Var) {
        String str;
        String str2;
        for (int i = 0; i < qj3Var.U(); i++) {
            bj3 bj3Var = (bj3) ((sj3) qj3Var.n).T1(i).i();
            Iterator it = bj3Var.g().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if ("_c".equals(((hj3) it.next()).q())) {
                    if (((sj3) ni3Var.b).G0() >= e0().E(((sj3) ni3Var.b).p(), ug3.l0)) {
                        int E = e0().E(((sj3) ni3Var.b).p(), ug3.y0);
                        LinkedList linkedList = this.C;
                        bi3 bi3Var = this.s;
                        if (E > 0) {
                            tc3 tc3Var = this.o;
                            U(tc3Var);
                            if (tc3Var.A0(g(), ((sj3) ni3Var.b).p(), false, false, false, true).g > E) {
                                fj3 B = hj3.B();
                                B.g("_tnr");
                                B.i(1L);
                                bj3Var.j((hj3) B.d());
                            } else {
                                if (e0().G(((sj3) ni3Var.b).p(), ug3.R0)) {
                                    str2 = k0().p0();
                                    fj3 B2 = hj3.B();
                                    B2.g("_tu");
                                    B2.h(str2);
                                    bj3Var.j((hj3) B2.d());
                                } else {
                                    str2 = null;
                                }
                                fj3 B3 = hj3.B();
                                B3.g("_tr");
                                B3.i(1L);
                                bj3Var.j((hj3) B3.d());
                                U(bi3Var);
                                ip3 X = bi3Var.X(((sj3) ni3Var.b).p(), qj3Var, bj3Var, str2);
                                if (X != null) {
                                    a().z.d(((sj3) ni3Var.b).p(), X.m, "Generated trigger URI. appId, uri");
                                    tc3 tc3Var2 = this.o;
                                    U(tc3Var2);
                                    tc3Var2.Q(((sj3) ni3Var.b).p(), X);
                                    if (!linkedList.contains(((sj3) ni3Var.b).p())) {
                                        linkedList.add(((sj3) ni3Var.b).p());
                                    }
                                }
                            }
                        } else {
                            if (e0().G(((sj3) ni3Var.b).p(), ug3.R0)) {
                                str = k0().p0();
                                fj3 B4 = hj3.B();
                                B4.g("_tu");
                                B4.h(str);
                                bj3Var.j((hj3) B4.d());
                            } else {
                                str = null;
                            }
                            fj3 B5 = hj3.B();
                            B5.g("_tr");
                            B5.i(1L);
                            bj3Var.j((hj3) B5.d());
                            U(bi3Var);
                            ip3 X2 = bi3Var.X(((sj3) ni3Var.b).p(), qj3Var, bj3Var, str);
                            if (X2 != null) {
                                a().z.d(((sj3) ni3Var.b).p(), X2.m, "Generated trigger URI. appId, uri");
                                tc3 tc3Var3 = this.o;
                                U(tc3Var3);
                                tc3Var3.Q(((sj3) ni3Var.b).p(), X2);
                                if (!linkedList.contains(((sj3) ni3Var.b).p())) {
                                    linkedList.add(((sj3) ni3Var.b).p());
                                }
                            }
                        }
                    }
                    cj3 cj3Var = (cj3) bj3Var.d();
                    qj3Var.b();
                    ((sj3) qj3Var.n).X(i, cj3Var);
                }
            }
        }
    }

    public final void x(String str, fj3 fj3Var, Bundle bundle, String str2) {
        int max;
        List unmodifiableList = Collections.unmodifiableList(Arrays.asList("_o", "_sn", "_sc", "_si"));
        if (zq3.V(((hj3) fj3Var.n).q()) || zq3.V(str)) {
            ec3 e0 = e0();
            e0.getClass();
            max = Math.max(Math.max(Math.min(e0.E(str2, ug3.h0), ServiceStarter.ERROR_UNKNOWN), 100), 256);
        } else {
            ec3 e02 = e0();
            e02.getClass();
            max = Math.max(Math.min(e02.E(str2, ug3.h0), ServiceStarter.ERROR_UNKNOWN), 100);
        }
        long j = max;
        long codePointCount = ((hj3) fj3Var.n).s().codePointCount(0, ((hj3) fj3Var.n).s().length());
        k0();
        String q = ((hj3) fj3Var.n).q();
        e0();
        String B = zq3.B(q, 40, true);
        if (codePointCount <= j || unmodifiableList.contains(((hj3) fj3Var.n).q())) {
            return;
        }
        if ("_ev".equals(((hj3) fj3Var.n).q())) {
            k0();
            String s = ((hj3) fj3Var.n).s();
            ec3 e03 = e0();
            e03.getClass();
            bundle.putString("_ev", zq3.B(s, Math.max(Math.max(Math.min(e03.E(str2, ug3.h0), ServiceStarter.ERROR_UNKNOWN), 100), 256), true));
            return;
        }
        a().w.d(B, Long.valueOf(codePointCount), "Param value is too long; discarded. Name, value length");
        if (bundle.getLong("_err") == 0) {
            bundle.putLong("_err", 4L);
            if (bundle.getString("_ev") == null) {
                bundle.putString("_ev", B);
                bundle.putLong("_el", codePointCount);
            }
        }
        bundle.remove(((hj3) fj3Var.n).q());
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0030, code lost:
    
        if (r20 != null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y(boolean z, int i, Throwable th, byte[] bArr, String str, List list) {
        byte[] bArr2;
        sm3 sm3Var;
        int i2 = i;
        bi3 bi3Var = this.n;
        c().v();
        l0();
        if (bArr == null) {
            try {
                bArr2 = new byte[0];
            } catch (Throwable th2) {
                this.G = false;
                O();
                throw th2;
            }
        } else {
            bArr2 = bArr;
        }
        ArrayList arrayList = this.K;
        ll3.v(arrayList);
        this.K = null;
        try {
            if (z) {
                if (i2 != 200) {
                    if (i2 == 204) {
                        i2 = 204;
                    }
                    String str2 = new String(bArr2, StandardCharsets.UTF_8);
                    a().w.e("Network upload failed. Will retry later. code, error", Integer.valueOf(i2), th, str2.substring(0, Math.min(32, str2.length())));
                    li3 li3Var = this.u.u;
                    e().getClass();
                    li3Var.b(System.currentTimeMillis());
                    if (i2 == 503 || i2 == 429) {
                        li3 li3Var2 = this.u.s;
                        e().getClass();
                        li3Var2.b(System.currentTimeMillis());
                    }
                    tc3 tc3Var = this.o;
                    U(tc3Var);
                    tc3Var.H(arrayList);
                    N();
                    this.G = false;
                    O();
                    return;
                }
            }
            HashMap hashMap = new HashMap();
            Iterator it = list.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                sm3Var = sm3.SGTM_CLIENT;
                if (!hasNext) {
                    break;
                }
                Pair pair = (Pair) it.next();
                oj3 oj3Var = (oj3) pair.first;
                xp3 xp3Var = (xp3) pair.second;
                sm3 sm3Var2 = xp3Var.c;
                sm3 sm3Var3 = xp3Var.c;
                if (sm3Var2 != sm3Var) {
                    tc3 tc3Var2 = this.o;
                    U(tc3Var2);
                    String str3 = xp3Var.a;
                    Map map = xp3Var.b;
                    if (map == null) {
                        map = Collections.EMPTY_MAP;
                    }
                    long A = tc3Var2.A(str, oj3Var, str3, map, sm3Var3, null);
                    if (sm3Var3 == sm3.GOOGLE_SIGNAL_PENDING && A != -1 && !oj3Var.t().isEmpty()) {
                        hashMap.put(oj3Var.t(), Long.valueOf(A));
                    }
                }
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                Pair pair2 = (Pair) it2.next();
                oj3 oj3Var2 = (oj3) pair2.first;
                xp3 xp3Var2 = (xp3) pair2.second;
                if (xp3Var2.c == sm3Var) {
                    Long l = (Long) hashMap.get(oj3Var2.t());
                    tc3 tc3Var3 = this.o;
                    U(tc3Var3);
                    sm3 sm3Var4 = sm3Var;
                    String str4 = xp3Var2.a;
                    Map map2 = xp3Var2.b;
                    if (map2 == null) {
                        map2 = Collections.EMPTY_MAP;
                    }
                    tc3Var3.A(str, oj3Var2, str4, map2, xp3Var2.c, l);
                    sm3Var = sm3Var4;
                }
            }
            tc3 tc3Var4 = this.o;
            U(tc3Var4);
            List B = tc3Var4.B(str, qp3.a(sm3Var), 1);
            if (!B.isEmpty()) {
                long j = ((rq3) B.get(0)).f;
                e().getClass();
                if (System.currentTimeMillis() > ((Long) ug3.F.a(null)).longValue() + j) {
                    a().u.d(str, Long.valueOf(j), "[sgtm] client batches are queued too long. appId, creationTime");
                }
            }
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                int i4 = i3 + 1;
                Long l2 = (Long) arrayList.get(i3);
                try {
                    tc3 tc3Var5 = this.o;
                    U(tc3Var5);
                    tc3Var5.F(l2.longValue());
                } catch (SQLiteException e) {
                    ArrayList arrayList2 = this.L;
                    if (arrayList2 == null || !arrayList2.contains(l2)) {
                        throw e;
                    }
                }
                i3 = i4;
            }
            tc3 tc3Var6 = this.o;
            U(tc3Var6);
            tc3Var6.j0();
            tc3 tc3Var7 = this.o;
            U(tc3Var7);
            tc3Var7.k0();
            this.L = null;
            U(bi3Var);
            if (bi3Var.Q()) {
                tc3 tc3Var8 = this.o;
                U(tc3Var8);
                if (tc3Var8.C(str)) {
                    t(str);
                    this.A = 0L;
                    this.G = false;
                    O();
                    return;
                }
            }
            U(bi3Var);
            if (bi3Var.Q() && L()) {
                q();
            } else {
                this.M = -1L;
                N();
            }
            this.A = 0L;
            this.G = false;
            O();
            return;
        } catch (Throwable th3) {
            tc3 tc3Var9 = this.o;
            U(tc3Var9);
            tc3Var9.k0();
            throw th3;
        }
        g10 g10Var = a().z;
        Integer valueOf = Integer.valueOf(i2);
        g10Var.d(valueOf, Boolean.valueOf(z), "Network upload successful with code, uploadAttempted");
        if (z) {
            try {
                li3 li3Var3 = this.u.t;
                e().getClass();
                li3Var3.b(System.currentTimeMillis());
            } catch (SQLiteException e2) {
                a().r.c(e2, "Database error while trying to delete uploaded bundles");
                e().getClass();
                this.A = SystemClock.elapsedRealtime();
                a().z.c(Long.valueOf(this.A), "Disable upload, time");
            }
        }
        this.u.u.b(0L);
        N();
        if (z) {
            a().z.d(valueOf, Integer.valueOf(bArr2.length), "Successful upload. Got network response. code, size");
        } else {
            a().z.b("Purged empty bundles");
        }
        tc3 tc3Var10 = this.o;
        U(tc3Var10);
        tc3Var10.i0();
    }

    public final void z(di3 di3Var) {
        hi hiVar;
        hi hiVar2;
        c().v();
        if (TextUtils.isEmpty(di3Var.G())) {
            String D = di3Var.D();
            ll3.v(D);
            A(D, 204, null, null, null);
            return;
        }
        String D2 = di3Var.D();
        ll3.v(D2);
        a().z.c(D2, "Fetching remote configuration");
        dj3 dj3Var = this.m;
        U(dj3Var);
        mh3 I = dj3Var.I(D2);
        U(dj3Var);
        dj3Var.v();
        String str = (String) dj3Var.y.get(D2);
        if (I != null) {
            if (TextUtils.isEmpty(str)) {
                hiVar2 = null;
            } else {
                hiVar2 = new hi(0);
                hiVar2.put("If-Modified-Since", str);
            }
            U(dj3Var);
            dj3Var.v();
            String str2 = (String) dj3Var.z.get(D2);
            if (!TextUtils.isEmpty(str2)) {
                if (hiVar2 == null) {
                    hiVar2 = new hi(0);
                }
                hiVar2.put("If-None-Match", str2);
            }
            hiVar = hiVar2;
        } else {
            hiVar = null;
        }
        this.F = true;
        bi3 bi3Var = this.n;
        U(bi3Var);
        hq3 hq3Var = new hq3(this);
        pj3 pj3Var = (pj3) bi3Var.m;
        bi3Var.v();
        bi3Var.x();
        zp3 zp3Var = bi3Var.n.v;
        Uri.Builder builder = new Uri.Builder();
        Uri.Builder appendQueryParameter = builder.scheme((String) ug3.f.a(null)).encodedAuthority((String) ug3.g.a(null)).path("config/app/".concat(String.valueOf(di3Var.G()))).appendQueryParameter("platform", "android");
        ((pj3) zp3Var.m).p.B();
        appendQueryParameter.appendQueryParameter("gmp_version", String.valueOf(133005L)).appendQueryParameter("runtime_version", AppEventsConstants.EVENT_PARAM_VALUE_NO);
        String uri = builder.build().toString();
        try {
            URL url = new URI(uri).toURL();
            lj3 lj3Var = pj3Var.s;
            pj3.m(lj3Var);
            lj3Var.I(new zh3(bi3Var, di3Var.D(), url, (byte[]) null, hiVar, hq3Var));
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused) {
            vh3 vh3Var = pj3Var.r;
            pj3.m(vh3Var);
            vh3Var.r.d(vh3.E(di3Var.D()), uri, "Failed to parse config URL. Not fetching. appId");
        }
    }
}
