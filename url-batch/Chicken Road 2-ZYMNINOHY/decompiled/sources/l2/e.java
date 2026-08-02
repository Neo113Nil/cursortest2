package l2;

import E1.V;
import E1.X;
import L1.r;
import S1.j;
import T.C0086d;
import T.C0097o;
import T.F;
import W.AbstractC0108a;
import W.J;
import X3.o;
import Y.h;
import Y.l;
import Y.m;
import a0.C0136b;
import a0.C0144j;
import android.content.ComponentName;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.MediaCodec;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
import android.util.Log;
import android.webkit.WebView;
import b3.InterfaceC0264a;
import c0.C0273f;
import c3.C0292d;
import com.google.android.datatransport.cct.CctBackendFactory;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.play_billing.A1;
import com.google.android.gms.internal.play_billing.AbstractC0352w;
import com.google.android.gms.internal.play_billing.B1;
import com.google.android.gms.internal.play_billing.C0312e1;
import com.google.android.gms.internal.play_billing.C0315f1;
import com.google.android.gms.internal.play_billing.C0318g1;
import com.google.android.gms.internal.play_billing.C0321h1;
import com.google.android.gms.internal.play_billing.C0330k1;
import com.google.android.gms.internal.play_billing.n1;
import com.google.android.gms.internal.play_billing.o1;
import com.google.android.gms.internal.play_billing.t1;
import com.google.android.gms.internal.play_billing.v1;
import com.google.android.gms.internal.play_billing.w1;
import com.google.android.gms.internal.play_billing.x1;
import com.google.android.gms.tasks.Task;
import d3.q;
import e0.t;
import i2.AbstractC0457a;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.impl.C0583e9;
import io.flutter.Build;
import io.flutter.plugin.common.EventChannel;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.s;
import p3.InterfaceC1349a;
import t2.InterfaceC1440a;

/* loaded from: classes.dex */
public final class e implements V, N1.b, X3.g, Y.g, InterfaceC1440a {

    /* renamed from: d, reason: collision with root package name */
    public static e f14268d;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14269a;

    /* renamed from: b, reason: collision with root package name */
    public Object f14270b;

    /* renamed from: c, reason: collision with root package name */
    public Object f14271c;

    public /* synthetic */ e(int i4, boolean z) {
        this.f14269a = i4;
    }

    public static final SharedPreferences A(Context context) {
        return context.getSharedPreferences("app_set_id_storage", 0);
    }

    public static final void B(Context context) {
        if (A(context).edit().putLong("app_set_id_last_used_time", System.currentTimeMillis()).commit()) {
            return;
        }
        String valueOf = String.valueOf(context.getPackageName());
        Log.e("AppSet", valueOf.length() != 0 ? "Failed to store app set ID last used time for App ".concat(valueOf) : new String("Failed to store app set ID last used time for App "));
        throw new d("Failed to store the app set ID last used time.");
    }

    public static void i(e eVar, boolean z, boolean z4) {
        synchronized (eVar) {
            boolean z5 = false;
            if (z) {
                if (((PowerManager.WakeLock) eVar.f14271c) == null) {
                    if (((Context) eVar.f14270b).checkSelfPermission("android.permission.WAKE_LOCK") != 0) {
                        AbstractC0108a.s("WakeLockManager", "WAKE_LOCK permission not granted, can't acquire wake lock for playback");
                        return;
                    }
                    PowerManager powerManager = (PowerManager) ((Context) eVar.f14270b).getSystemService("power");
                    if (powerManager == null) {
                        AbstractC0108a.s("WakeLockManager", "PowerManager is null, therefore not creating the WakeLock.");
                        return;
                    } else {
                        PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, "ExoPlayer:WakeLockManager");
                        eVar.f14271c = newWakeLock;
                        newWakeLock.setReferenceCounted(false);
                    }
                }
            }
            PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) eVar.f14271c;
            if (wakeLock == null) {
                return;
            }
            if (z && z4) {
                z5 = true;
            }
            if (z5) {
                wakeLock.acquire();
            } else {
                wakeLock.release();
            }
        }
    }

    public static void j(e eVar, C0136b c0136b) {
        eVar.getClass();
        for (Map.Entry entry : new HashMap((HashMap) eVar.f14270b).entrySet()) {
            if (entry.getKey() != null) {
                throw new ClassCastException();
            }
            List list = (List) entry.getValue();
            if (!m(c0136b, list).equals(m((C0136b) eVar.f14271c, list))) {
                throw null;
            }
        }
        eVar.f14271c = c0136b;
    }

    public static e l(F2.d dVar, F2.g gVar) {
        if (dVar != F2.d.DEFINED_BY_JAVASCRIPT) {
            return new e(dVar, gVar, 5, false);
        }
        throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
    }

    public static C0136b m(C0136b c0136b, List list) {
        c0136b.getClass();
        Map map = c0136b.f4059a;
        HashMap hashMap = new HashMap(map);
        HashSet hashSet = new HashSet(list);
        for (String str : map.keySet()) {
            if (!hashSet.contains(str)) {
                hashMap.remove(str);
            }
        }
        return new C0136b(hashMap);
    }

    public void C(C0321h1 c0321h1, long j4, boolean z) {
        o1 o1Var;
        try {
            C0318g1 c0318g1 = (C0318g1) c0321h1.g();
            t1 t1Var = (t1) c0321h1.n().g();
            t1Var.c();
            v1.n((v1) t1Var.f6024b, z);
            c0318g1.c();
            C0321h1.q((C0321h1) c0318g1.f6024b, (v1) t1Var.a());
            C0321h1 c0321h12 = (C0321h1) c0318g1.a();
            if (j4 == 0) {
                o1Var = (o1) this.f14270b;
            } else {
                n1 n1Var = (n1) ((o1) this.f14270b).g();
                n1Var.c();
                o1.r((o1) n1Var.f6024b, j4);
                o1Var = (o1) n1Var.a();
            }
            H(c0321h12, o1Var);
        } catch (Throwable th) {
            AbstractC0352w.i("BillingLogger", "Unable to log.", th);
        }
    }

    public void D(C0330k1 c0330k1) {
        try {
            w1 t4 = x1.t();
            t4.d((o1) this.f14270b);
            t4.c();
            x1.p((x1) t4.f6024b, c0330k1);
            ((X) this.f14271c).c((x1) t4.a());
        } catch (Throwable th) {
            AbstractC0352w.i("BillingLogger", "Unable to log.", th);
        }
    }

    public void E(A1 a12) {
        try {
            X x4 = (X) this.f14271c;
            w1 t4 = x1.t();
            t4.d((o1) this.f14270b);
            t4.c();
            x1.r((x1) t4.f6024b, a12);
            x4.c((x1) t4.a());
        } catch (Throwable th) {
            AbstractC0352w.i("BillingLogger", "Unable to log.", th);
        }
    }

    public void F(B1 b12) {
        if (b12 == null) {
            return;
        }
        try {
            w1 t4 = x1.t();
            t4.d((o1) this.f14270b);
            t4.c();
            x1.s((x1) t4.f6024b, b12);
            ((X) this.f14271c).c((x1) t4.a());
        } catch (Throwable th) {
            AbstractC0352w.i("BillingLogger", "Unable to log.", th);
        }
    }

    public void G(C0315f1 c0315f1, o1 o1Var) {
        if (c0315f1 == null) {
            return;
        }
        try {
            w1 t4 = x1.t();
            t4.d(o1Var);
            t4.c();
            x1.n((x1) t4.f6024b, c0315f1);
            ((X) this.f14271c).c((x1) t4.a());
        } catch (Throwable th) {
            AbstractC0352w.i("BillingLogger", "Unable to log.", th);
        }
    }

    public void H(C0321h1 c0321h1, o1 o1Var) {
        if (c0321h1 == null) {
            return;
        }
        try {
            w1 t4 = x1.t();
            t4.d(o1Var);
            t4.c();
            x1.o((x1) t4.f6024b, c0321h1);
            ((X) this.f14271c).c((x1) t4.a());
        } catch (Throwable th) {
            AbstractC0352w.i("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // X3.g
    public void a() {
        ((MediaPlayer) this.f14271c).prepareAsync();
    }

    @Override // X3.g
    public void b(W3.a aVar) {
        MediaPlayer player = (MediaPlayer) this.f14271c;
        i.e(player, "player");
        player.setAudioAttributes(aVar.a());
        if (aVar.f3466b) {
            Context context = ((o) this.f14270b).f3652a.f3474b;
            if (context == null) {
                i.i("context");
                throw null;
            }
            Context applicationContext = context.getApplicationContext();
            i.d(applicationContext, "getApplicationContext(...)");
            player.setWakeMode(applicationContext, 1);
        }
    }

    @Override // X3.g
    public void c(float f4, float f5) {
        ((MediaPlayer) this.f14271c).setVolume(f4, f5);
    }

    @Override // X3.g
    public void d(Y3.c source) {
        i.e(source, "source");
        reset();
        source.a((MediaPlayer) this.f14271c);
    }

    @Override // X3.g
    public void e() {
        ((MediaPlayer) this.f14271c).stop();
    }

    @Override // Y.g
    public h f() {
        return new l((Context) this.f14270b, ((Y.g) this.f14271c).f());
    }

    @Override // X3.g
    public boolean g() {
        Integer duration = getDuration();
        return duration == null || duration.intValue() == 0;
    }

    @Override // b3.InterfaceC0264a
    public Object get() {
        switch (this.f14269a) {
            case 12:
                return new M1.e((Context) ((N1.c) this.f14270b).f1805a, (M1.d) ((t1.h) this.f14271c).get());
            default:
                a2.i iVar = new a2.i(25);
                a2.i iVar2 = new a2.i(24);
                Object obj = ((InterfaceC0264a) this.f14270b).get();
                InterfaceC0264a interfaceC0264a = (InterfaceC0264a) this.f14271c;
                return new j(iVar, iVar2, S1.a.f2569f, (S1.l) obj, interfaceC0264a);
        }
    }

    @Override // X3.g
    public Integer getCurrentPosition() {
        return Integer.valueOf(((MediaPlayer) this.f14271c).getCurrentPosition());
    }

    @Override // X3.g
    public Integer getDuration() {
        Integer valueOf = Integer.valueOf(((MediaPlayer) this.f14271c).getDuration());
        if (valueOf.intValue() == -1) {
            return null;
        }
        return valueOf;
    }

    @Override // X3.g
    public void h(float f4) {
        MediaPlayer mediaPlayer = (MediaPlayer) this.f14271c;
        mediaPlayer.setPlaybackParams(mediaPlayer.getPlaybackParams().setSpeed(f4));
    }

    public void k() {
        this.f14270b = null;
        this.f14271c = null;
    }

    public void n(W3.a aVar) {
        AudioAttributes a3 = aVar.a();
        HashMap hashMap = (HashMap) this.f14271c;
        if (hashMap.containsKey(a3)) {
            return;
        }
        SoundPool build = new SoundPool.Builder().setAudioAttributes(a3).setMaxStreams(32).build();
        ((W3.e) this.f14270b).b("Create SoundPool with " + a3);
        i.b(build);
        final X3.l lVar = new X3.l(build);
        build.setOnLoadCompleteListener(new SoundPool.OnLoadCompleteListener() { // from class: X3.h
            @Override // android.media.SoundPool.OnLoadCompleteListener
            public final void onLoadComplete(SoundPool soundPool, int i4, int i5) {
                l2.e eVar = l2.e.this;
                l lVar2 = lVar;
                ((W3.e) eVar.f14270b).b("Loaded " + i4);
                k kVar = (k) lVar2.f3646b.get(Integer.valueOf(i4));
                Y3.d dVar = kVar != null ? kVar.f3644h : null;
                if (dVar != null) {
                    Map map = lVar2.f3646b;
                    Integer num = kVar.f3640d;
                    if (map instanceof InterfaceC1349a) {
                        s.e(map, "kotlin.collections.MutableMap");
                        throw null;
                    }
                    try {
                        map.remove(num);
                        synchronized (lVar2.f3647c) {
                            try {
                                List<k> list = (List) lVar2.f3647c.get(dVar);
                                if (list == null) {
                                    list = q.f8333a;
                                }
                                for (k kVar2 : list) {
                                    kVar2.f3637a.c("Marking " + kVar2 + " as loaded");
                                    kVar2.f3637a.h(true);
                                    o oVar = kVar2.f3637a;
                                    if (oVar.n) {
                                        oVar.c("Delayed start of " + kVar2);
                                        kVar2.start();
                                    }
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    } catch (ClassCastException e4) {
                        kotlin.jvm.internal.i.g(e4, s.class.getName());
                        throw e4;
                    }
                }
            }
        });
        hashMap.put(a3, lVar);
    }

    public byte[] o(J0.a aVar) {
        DataOutputStream dataOutputStream = (DataOutputStream) this.f14271c;
        ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) this.f14270b;
        byteArrayOutputStream.reset();
        try {
            dataOutputStream.writeBytes(aVar.f1145a);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeBytes(aVar.f1146b);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeLong(aVar.f1147c);
            dataOutputStream.writeLong(aVar.f1148d);
            dataOutputStream.write(aVar.f1149e);
            dataOutputStream.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e4) {
            throw new RuntimeException(e4);
        }
    }

    @Override // t2.InterfaceC1440a
    public void onComplete(Task task) {
        ((Map) ((e) this.f14271c).f14271c).remove((t2.d) this.f14270b);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CctBackendFactory p(String str) {
        Bundle bundle;
        Map map;
        PackageManager packageManager;
        if (((Map) this.f14271c) == null) {
            Context context = (Context) this.f14270b;
            try {
                packageManager = context.getPackageManager();
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("BackendRegistry", "Application info not found.");
            }
            if (packageManager == null) {
                Log.w("BackendRegistry", "Context has no PackageManager.");
            } else {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) TransportBackendDiscovery.class), 128);
                if (serviceInfo == null) {
                    Log.w("BackendRegistry", "TransportBackendDiscovery has no service info.");
                } else {
                    bundle = serviceInfo.metaData;
                    if (bundle != null) {
                        Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                        map = Collections.EMPTY_MAP;
                    } else {
                        HashMap hashMap = new HashMap();
                        for (String str2 : bundle.keySet()) {
                            Object obj = bundle.get(str2);
                            if ((obj instanceof String) && str2.startsWith("backend:")) {
                                for (String str3 : ((String) obj).split(StringUtils.COMMA, -1)) {
                                    String trim = str3.trim();
                                    if (!trim.isEmpty()) {
                                        hashMap.put(trim, str2.substring(8));
                                    }
                                }
                            }
                        }
                        map = hashMap;
                    }
                    this.f14271c = map;
                }
            }
            bundle = null;
            if (bundle != null) {
            }
            this.f14271c = map;
        }
        String str4 = (String) ((Map) this.f14271c).get(str);
        if (str4 == null) {
            return null;
        }
        try {
            return (CctBackendFactory) Class.forName(str4).asSubclass(CctBackendFactory.class).getDeclaredConstructor(null).newInstance(null);
        } catch (ClassNotFoundException e4) {
            Log.w("BackendRegistry", "Class " + str4 + " is not found.", e4);
            return null;
        } catch (IllegalAccessException e5) {
            Log.w("BackendRegistry", "Could not instantiate " + str4 + ".", e5);
            return null;
        } catch (InstantiationException e6) {
            Log.w("BackendRegistry", "Could not instantiate " + str4 + ".", e6);
            return null;
        } catch (NoSuchMethodException e7) {
            Log.w("BackendRegistry", "Could not instantiate ".concat(str4), e7);
            return null;
        } catch (InvocationTargetException e8) {
            Log.w("BackendRegistry", "Could not instantiate ".concat(str4), e8);
            return null;
        }
    }

    @Override // X3.g
    public void pause() {
        ((MediaPlayer) this.f14271c).pause();
    }

    public C0273f q(C0097o c0097o, C0086d c0086d) {
        boolean booleanValue;
        boolean isOffloadedPlaybackSupported;
        int playbackOffloadSupport;
        c0097o.getClass();
        int i4 = c0097o.f2847G;
        c0086d.getClass();
        int i5 = Build.VERSION.SDK_INT;
        if (i5 < 29 || i4 == -1) {
            return C0273f.f5551d;
        }
        Context context = (Context) this.f14270b;
        Boolean bool = (Boolean) this.f14271c;
        boolean z = false;
        if (bool != null) {
            booleanValue = bool.booleanValue();
        } else {
            if (context != null) {
                String parameters = U.i.j(context).getParameters("offloadVariableRateSupported");
                this.f14271c = Boolean.valueOf(parameters != null && parameters.equals("offloadVariableRateSupported=1"));
            } else {
                this.f14271c = Boolean.FALSE;
            }
            booleanValue = ((Boolean) this.f14271c).booleanValue();
        }
        String str = c0097o.n;
        str.getClass();
        int c4 = F.c(str, c0097o.f2866k);
        if (c4 == 0 || i5 < J.q(c4)) {
            return C0273f.f5551d;
        }
        int r4 = J.r(c0097o.f2846F);
        if (r4 == 0) {
            return C0273f.f5551d;
        }
        try {
            AudioFormat build = new AudioFormat.Builder().setSampleRate(i4).setChannelMask(r4).setEncoding(c4).build();
            if (i5 < 31) {
                isOffloadedPlaybackSupported = AudioManager.isOffloadedPlaybackSupported(build, c0086d.a());
                if (!isOffloadedPlaybackSupported) {
                    return C0273f.f5551d;
                }
                S0.f fVar = new S0.f();
                fVar.f2411a = true;
                fVar.f2413c = booleanValue;
                return fVar.a();
            }
            playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(build, c0086d.a());
            if (playbackOffloadSupport == 0) {
                return C0273f.f5551d;
            }
            S0.f fVar2 = new S0.f();
            if (i5 > 32 && playbackOffloadSupport == 2) {
                z = true;
            }
            fVar2.f2411a = true;
            fVar2.f2412b = z;
            fVar2.f2413c = booleanValue;
            return fVar2.a();
        } catch (IllegalArgumentException unused) {
            return C0273f.f5551d;
        }
    }

    public synchronized Map r() {
        try {
            if (((Map) this.f14271c) == null) {
                this.f14271c = Collections.unmodifiableMap(new HashMap((HashMap) this.f14270b));
            }
        } catch (Throwable th) {
            throw th;
        }
        return (Map) this.f14271c;
    }

    @Override // X3.g
    public void release() {
        MediaPlayer mediaPlayer = (MediaPlayer) this.f14271c;
        mediaPlayer.reset();
        mediaPlayer.release();
    }

    @Override // X3.g
    public void reset() {
        ((MediaPlayer) this.f14271c).reset();
    }

    public void s(B.i iVar) {
        A.c cVar = (A.c) this.f14271c;
        t tVar = (t) this.f14270b;
        int i4 = iVar.f171b;
        if (i4 != 0) {
            cVar.execute(new B.b(tVar, i4));
        } else {
            cVar.execute(new B.a(tVar, 0, iVar.f170a));
        }
    }

    @Override // X3.g
    public void seekTo(int i4) {
        ((MediaPlayer) this.f14271c).seekTo(i4);
    }

    @Override // X3.g
    public void setLooping(boolean z) {
        ((MediaPlayer) this.f14271c).setLooping(z);
    }

    @Override // X3.g
    public void start() {
        h(((o) this.f14270b).f3660i);
    }

    public void t(boolean z, boolean z4) {
        Context context = (Context) this.f14270b;
        if (z && ((WifiManager.WifiLock) this.f14271c) == null) {
            if (context.checkSelfPermission("android.permission.WAKE_LOCK") != 0) {
                AbstractC0108a.s("WifiLockManager", "WAKE_LOCK permission not granted, can't acquire wake lock for playback");
                return;
            }
            WifiManager wifiManager = (WifiManager) context.getApplicationContext().getSystemService("wifi");
            if (wifiManager == null) {
                AbstractC0108a.s("WifiLockManager", "WifiManager is null, therefore not creating the WifiLock.");
                return;
            } else {
                WifiManager.WifiLock createWifiLock = wifiManager.createWifiLock(3, "ExoPlayer:WifiLockManager");
                this.f14271c = createWifiLock;
                createWifiLock.setReferenceCounted(false);
            }
        }
        WifiManager.WifiLock wifiLock = (WifiManager.WifiLock) this.f14271c;
        if (wifiLock == null) {
            return;
        }
        if (z && z4) {
            wifiLock.acquire();
        } else {
            wifiLock.release();
        }
    }

    public void u(boolean z, Status status) {
        HashMap hashMap;
        HashMap hashMap2;
        synchronized (((Map) this.f14270b)) {
            hashMap = new HashMap((Map) this.f14270b);
        }
        synchronized (((Map) this.f14271c)) {
            hashMap2 = new HashMap((Map) this.f14271c);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                entry.getKey().getClass();
                throw new ClassCastException();
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((t2.d) entry2.getKey()).a(new b2.d(status));
            }
        }
    }

    public void v(C0315f1 c0315f1) {
        try {
            G(c0315f1, (o1) this.f14270b);
        } catch (Throwable th) {
            AbstractC0352w.i("BillingLogger", "Unable to log.", th);
        }
    }

    public void w(C0315f1 c0315f1, int i4) {
        try {
            n1 n1Var = (n1) ((o1) this.f14270b).g();
            n1Var.c();
            o1.p((o1) n1Var.f6024b, i4);
            this.f14270b = (o1) n1Var.a();
            v(c0315f1);
        } catch (Throwable th) {
            AbstractC0352w.i("BillingLogger", "Unable to log.", th);
        }
    }

    public void x(C0315f1 c0315f1, int i4, long j4) {
        try {
            n1 n1Var = (n1) ((o1) this.f14270b).g();
            n1Var.c();
            o1.p((o1) n1Var.f6024b, i4);
            o1 o1Var = (o1) n1Var.a();
            this.f14270b = o1Var;
            if (j4 != 0) {
                n1 n1Var2 = (n1) o1Var.g();
                n1Var2.c();
                o1.r((o1) n1Var2.f6024b, j4);
                o1Var = (o1) n1Var2.a();
            }
            G(c0315f1, o1Var);
        } catch (Throwable th) {
            AbstractC0352w.i("BillingLogger", "Unable to log.", th);
        }
    }

    public void y(C0315f1 c0315f1, long j4, boolean z) {
        o1 o1Var;
        try {
            C0312e1 c0312e1 = (C0312e1) c0315f1.g();
            t1 t1Var = (t1) c0315f1.o().g();
            t1Var.c();
            v1.n((v1) t1Var.f6024b, z);
            c0312e1.c();
            C0315f1.s((C0315f1) c0312e1.f6024b, (v1) t1Var.a());
            C0315f1 c0315f12 = (C0315f1) c0312e1.a();
            if (j4 == 0) {
                o1Var = (o1) this.f14270b;
            } else {
                n1 n1Var = (n1) ((o1) this.f14270b).g();
                n1Var.c();
                o1.r((o1) n1Var.f6024b, j4);
                o1Var = (o1) n1Var.a();
            }
            G(c0315f12, o1Var);
        } catch (Throwable th) {
            AbstractC0352w.i("BillingLogger", "Unable to log.", th);
        }
    }

    public void z(C0315f1 c0315f1, int i4, long j4, boolean z) {
        o1 o1Var;
        try {
            n1 n1Var = (n1) ((o1) this.f14270b).g();
            n1Var.c();
            o1.p((o1) n1Var.f6024b, i4);
            this.f14270b = (o1) n1Var.a();
            C0312e1 c0312e1 = (C0312e1) c0315f1.g();
            t1 t1Var = (t1) c0315f1.o().g();
            t1Var.c();
            v1.n((v1) t1Var.f6024b, z);
            c0312e1.c();
            C0315f1.s((C0315f1) c0312e1.f6024b, (v1) t1Var.a());
            C0315f1 c0315f12 = (C0315f1) c0312e1.a();
            if (j4 == 0) {
                o1Var = (o1) this.f14270b;
            } else {
                n1 n1Var2 = (n1) ((o1) this.f14270b).g();
                n1Var2.c();
                o1.r((o1) n1Var2.f6024b, j4);
                o1Var = (o1) n1Var2.a();
            }
            G(c0315f12, o1Var);
        } catch (Throwable th) {
            AbstractC0352w.i("BillingLogger", "Unable to log.", th);
        }
    }

    public e(B1.j jVar) {
        this.f14269a = 13;
        this.f14271c = jVar;
    }

    public /* synthetic */ e(Context context, int i4, boolean z) {
        this.f14269a = i4;
        this.f14270b = context;
    }

    public e(WebView webView, a2.i iVar) {
        this.f14269a = 9;
        V3.b.b(webView, "WebView is null");
        this.f14270b = webView;
        this.f14271c = iVar;
    }

    public /* synthetic */ e(Object obj, int i4, Object obj2) {
        this.f14269a = i4;
        this.f14270b = obj;
        this.f14271c = obj2;
    }

    public /* synthetic */ e(Object obj, Object obj2, int i4, boolean z) {
        this.f14269a = i4;
        this.f14270b = obj2;
        this.f14271c = obj;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(Context context, int i4) {
        this(context, new m());
        this.f14269a = i4;
        switch (i4) {
            case 11:
                this.f14271c = null;
                this.f14270b = context;
                break;
            case C0583e9.f11744D /* 20 */:
                break;
            case 26:
                this.f14270b = context == null ? null : context.getApplicationContext();
                break;
            default:
                ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
                this.f14271c = Executors.newSingleThreadExecutor();
                this.f14270b = context;
                newSingleThreadScheduledExecutor.scheduleAtFixedRate(new B.b(18, this), 0L, 86400L, TimeUnit.SECONDS);
                break;
        }
    }

    public e(Context context, o1 o1Var) {
        B1.j c4;
        I1.b bVar;
        a2.i iVar;
        Set set;
        this.f14269a = 3;
        X x4 = new X();
        try {
            r.b(context);
            c4 = r.a().c(J1.a.f1153e);
            bVar = new I1.b("proto");
            iVar = new a2.i(2);
            set = (Set) c4.f201b;
        } catch (Throwable unused) {
            x4.f555a = true;
        }
        if (set.contains(bVar)) {
            x4.f556b = new B1.j((L1.j) c4.f202c, bVar, iVar, (r) c4.f203d);
            this.f14271c = x4;
            this.f14270b = o1Var;
            return;
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", bVar, set));
    }

    public e(String str, AbstractC0457a abstractC0457a, C0144j c0144j) {
        this.f14269a = 25;
        this.f14271c = str;
        this.f14270b = abstractC0457a;
    }

    public e(final o oVar) {
        this.f14269a = 18;
        this.f14270b = oVar;
        MediaPlayer mediaPlayer = new MediaPlayer();
        mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: X3.b
            @Override // android.media.MediaPlayer.OnPreparedListener
            public final void onPrepared(MediaPlayer mediaPlayer2) {
                g gVar;
                g gVar2;
                o oVar2 = o.this;
                oVar2.h(true);
                oVar2.f3652a.getClass();
                W3.f fVar = oVar2.f3653b;
                Integer duration = (!oVar2.f3664m || (gVar2 = oVar2.f3656e) == null) ? null : gVar2.getDuration();
                fVar.a("audio.onDuration", d3.t.B(new C0292d("value", Integer.valueOf(duration != null ? duration.intValue() : 0))));
                if (oVar2.n) {
                    oVar2.f();
                }
                if (oVar2.o >= 0) {
                    g gVar3 = oVar2.f3656e;
                    if ((gVar3 == null || !gVar3.g()) && (gVar = oVar2.f3656e) != null) {
                        gVar.seekTo(oVar2.o);
                    }
                }
            }
        });
        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: X3.c
            @Override // android.media.MediaPlayer.OnCompletionListener
            public final void onCompletion(MediaPlayer mediaPlayer2) {
                o oVar2 = o.this;
                if (oVar2.f3661j != W3.h.f3484b) {
                    oVar2.k();
                }
                oVar2.f3652a.getClass();
                oVar2.f3653b.a("audio.onComplete", new HashMap());
            }
        });
        mediaPlayer.setOnSeekCompleteListener(new MediaPlayer.OnSeekCompleteListener() { // from class: X3.d
            @Override // android.media.MediaPlayer.OnSeekCompleteListener
            public final void onSeekComplete(MediaPlayer mediaPlayer2) {
                o oVar2 = o.this;
                oVar2.f3652a.getClass();
                oVar2.f3653b.a("audio.onSeekComplete", new HashMap());
            }
        });
        mediaPlayer.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: X3.e
            @Override // android.media.MediaPlayer.OnErrorListener
            public final boolean onError(MediaPlayer mediaPlayer2, int i4, int i5) {
                String str;
                String str2;
                o oVar2 = o.this;
                W3.f fVar = oVar2.f3653b;
                W3.e eVar = oVar2.f3652a;
                if (i4 == 100) {
                    str = "MEDIA_ERROR_SERVER_DIED";
                } else {
                    str = "MEDIA_ERROR_UNKNOWN {what:" + i4 + '}';
                }
                if (i5 == Integer.MIN_VALUE) {
                    str2 = "MEDIA_ERROR_SYSTEM";
                } else if (i5 == -1010) {
                    str2 = "MEDIA_ERROR_UNSUPPORTED";
                } else if (i5 == -1007) {
                    str2 = "MEDIA_ERROR_MALFORMED";
                } else if (i5 == -1004) {
                    str2 = "MEDIA_ERROR_IO";
                } else if (i5 != -110) {
                    str2 = "MEDIA_ERROR_UNKNOWN {extra:" + i5 + '}';
                } else {
                    str2 = "MEDIA_ERROR_TIMED_OUT";
                }
                if (oVar2.f3664m || !kotlin.jvm.internal.i.a(str2, "MEDIA_ERROR_SYSTEM")) {
                    oVar2.h(false);
                    eVar.getClass();
                    EventChannel.EventSink eventSink = fVar.f3480b;
                    if (eventSink != null) {
                        eventSink.error("AndroidAudioError", str, str2);
                    }
                } else {
                    String str3 = str + ", " + str2;
                    eVar.getClass();
                    EventChannel.EventSink eventSink2 = fVar.f3480b;
                    if (eventSink2 != null) {
                        eventSink2.error("AndroidAudioError", "Failed to set source. For troubleshooting, see: https://github.com/bluefireteam/audioplayers/blob/main/troubleshooting.md", str3);
                        return false;
                    }
                }
                return false;
            }
        });
        mediaPlayer.setOnBufferingUpdateListener(new MediaPlayer.OnBufferingUpdateListener() { // from class: X3.f
            @Override // android.media.MediaPlayer.OnBufferingUpdateListener
            public final void onBufferingUpdate(MediaPlayer mediaPlayer2, int i4) {
                o.this.getClass();
            }
        });
        mediaPlayer.setAudioAttributes(oVar.f3654c.a());
        this.f14271c = mediaPlayer;
    }

    public e(int i4) {
        this.f14269a = i4;
        switch (i4) {
            case 10:
                t1.h hVar = new t1.h(13);
                this.f14270b = hVar;
                this.f14271c = new t1.h(12, hVar);
                break;
            case 21:
                this.f14270b = new HashMap();
                break;
            case Build.API_LEVELS.API_23 /* 23 */:
                this.f14270b = new HashMap();
                this.f14271c = C0136b.f4058b;
                break;
            case Build.API_LEVELS.API_28 /* 28 */:
                this.f14270b = Collections.synchronizedMap(new WeakHashMap());
                this.f14271c = Collections.synchronizedMap(new WeakHashMap());
                break;
            default:
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
                this.f14270b = byteArrayOutputStream;
                this.f14271c = new DataOutputStream(byteArrayOutputStream);
                break;
        }
    }

    public e(Context context, m mVar) {
        this.f14269a = 20;
        this.f14270b = context.getApplicationContext();
        mVar.getClass();
        this.f14271c = mVar;
    }

    public e(MediaCodec.CryptoInfo cryptoInfo) {
        this.f14269a = 22;
        this.f14270b = cryptoInfo;
        this.f14271c = new MediaCodec.CryptoInfo.Pattern(0, 0);
    }

    public e(W3.e eVar) {
        this.f14269a = 19;
        this.f14270b = eVar;
        this.f14271c = new HashMap();
    }
}
