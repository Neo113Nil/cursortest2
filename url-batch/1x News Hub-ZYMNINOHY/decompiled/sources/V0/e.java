package V0;

import B.i;
import C0.n;
import E1.A;
import E1.AbstractC0033i;
import E1.B;
import E1.C;
import E1.E;
import E1.I;
import E1.z;
import E2.h;
import E2.p;
import M.j;
import O1.l;
import P1.m;
import P1.o;
import P1.u;
import U.M;
import U.N;
import U1.C0080a;
import a2.InterfaceC0133a;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.media.AudioAttributes;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.SparseIntArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import b0.C0178i;
import b0.s;
import b2.C0190d;
import c2.q;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import d1.k;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import io.appmetrica.analytics.impl.C0642l9;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.t;
import org.json.JSONArray;
import org.json.JSONObject;
import x0.InterfaceC1239b;

/* loaded from: classes.dex */
public final class e implements InterfaceC1239b, C, h, d1.b, m, P1.c, P1.d {

    /* renamed from: d, reason: collision with root package name */
    public static e f1596d;

    /* renamed from: e, reason: collision with root package name */
    public static e f1597e;
    public static E f;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1598a;

    /* renamed from: b, reason: collision with root package name */
    public Object f1599b;

    /* renamed from: c, reason: collision with root package name */
    public Object f1600c;

    public /* synthetic */ e(Object obj, int i3, Object obj2) {
        this.f1598a = i3;
        this.f1599b = obj;
        this.f1600c = obj2;
    }

    public static final SharedPreferences G(Context context) {
        return context.getSharedPreferences("app_set_id_storage", 0);
    }

    public static final void H(Context context) {
        if (G(context).edit().putLong("app_set_id_last_used_time", System.currentTimeMillis()).commit()) {
            return;
        }
        String valueOf = String.valueOf(context.getPackageName());
        Log.e("AppSet", valueOf.length() != 0 ? "Failed to store app set ID last used time for App ".concat(valueOf) : new String("Failed to store app set ID last used time for App "));
        throw new d("Failed to store the app set ID last used time.");
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0084 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0083 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int q(e eVar, JSONArray jSONArray) {
        String str;
        eVar.getClass();
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < jSONArray.length(); i5++) {
            String string = jSONArray.getString(i5);
            for (int i6 : j.c(4)) {
                if (i6 == 1) {
                    str = "DeviceOrientation.portraitUp";
                } else if (i6 == 2) {
                    str = "DeviceOrientation.portraitDown";
                } else if (i6 == 3) {
                    str = "DeviceOrientation.landscapeLeft";
                } else {
                    if (i6 != 4) {
                        throw null;
                    }
                    str = "DeviceOrientation.landscapeRight";
                }
                if (str.equals(string)) {
                    int b3 = j.b(i6);
                    if (b3 == 0) {
                        i3 |= 1;
                    } else if (b3 == 1) {
                        i3 |= 4;
                    } else if (b3 == 2) {
                        i3 |= 2;
                    } else if (b3 == 3) {
                        i3 |= 8;
                    }
                    if (i4 == 0) {
                        i4 = i3;
                    }
                }
            }
            throw new NoSuchFieldException(AbstractC0033i.j("No such DeviceOrientation: ", string));
        }
        if (i3 == 0) {
            return -1;
        }
        switch (i3) {
            case 2:
                return 0;
            case 3:
            case 6:
            case 7:
            case 9:
            case 12:
            case 13:
            case 14:
                if (i4 == 2) {
                    return 0;
                }
                if (i4 != 4) {
                    return i4 != 8 ? 1 : 8;
                }
                return 9;
            case 4:
                return 9;
            case 5:
                return 12;
            case 10:
                return 11;
            case 11:
                return 2;
            case 15:
                return 13;
        }
    }

    public static ArrayList r(e eVar, JSONArray jSONArray) {
        eVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < jSONArray.length(); i3++) {
            String string = jSONArray.getString(i3);
            for (O1.d dVar : O1.d.values()) {
                if (dVar.f1150a.equals(string)) {
                    int ordinal = dVar.ordinal();
                    if (ordinal == 0) {
                        arrayList.add(O1.d.TOP_OVERLAYS);
                    } else if (ordinal == 1) {
                        arrayList.add(O1.d.BOTTOM_OVERLAYS);
                    }
                }
            }
            throw new NoSuchFieldException(AbstractC0033i.j("No such SystemUiOverlay: ", string));
        }
        return arrayList;
    }

    public static int s(e eVar, String str) {
        String str2;
        eVar.getClass();
        for (int i3 : j.c(4)) {
            if (i3 == 1) {
                str2 = "SystemUiMode.leanBack";
            } else if (i3 == 2) {
                str2 = "SystemUiMode.immersive";
            } else if (i3 == 3) {
                str2 = "SystemUiMode.immersiveSticky";
            } else {
                if (i3 != 4) {
                    throw null;
                }
                str2 = "SystemUiMode.edgeToEdge";
            }
            if (str2.equals(str)) {
                int b3 = j.b(i3);
                if (b3 == 0) {
                    return 1;
                }
                if (b3 != 1) {
                    return b3 != 2 ? 4 : 3;
                }
                return 2;
            }
        }
        throw new NoSuchFieldException(AbstractC0033i.j("No such SystemUiMode: ", str));
    }

    public static O1.c t(e eVar, JSONObject jSONObject) {
        eVar.getClass();
        return new O1.c(!jSONObject.isNull("statusBarColor") ? Integer.valueOf(jSONObject.getInt("statusBarColor")) : null, !jSONObject.isNull("statusBarIconBrightness") ? AbstractC0033i.a(jSONObject.getString("statusBarIconBrightness")) : 0, !jSONObject.isNull("systemStatusBarContrastEnforced") ? Boolean.valueOf(jSONObject.getBoolean("systemStatusBarContrastEnforced")) : null, !jSONObject.isNull("systemNavigationBarColor") ? Integer.valueOf(jSONObject.getInt("systemNavigationBarColor")) : null, jSONObject.isNull("systemNavigationBarIconBrightness") ? 0 : AbstractC0033i.a(jSONObject.getString("systemNavigationBarIconBrightness")), !jSONObject.isNull("systemNavigationBarDividerColor") ? Integer.valueOf(jSONObject.getInt("systemNavigationBarDividerColor")) : null, jSONObject.isNull("systemNavigationBarContrastEnforced") ? null : Boolean.valueOf(jSONObject.getBoolean("systemNavigationBarContrastEnforced")));
    }

    public static HashMap v(String str, int i3, int i4, int i5, int i6) {
        HashMap hashMap = new HashMap();
        hashMap.put("text", str);
        hashMap.put("selectionBase", Integer.valueOf(i3));
        hashMap.put("selectionExtent", Integer.valueOf(i4));
        hashMap.put("composingBase", Integer.valueOf(i5));
        hashMap.put("composingExtent", Integer.valueOf(i6));
        return hashMap;
    }

    public k A() {
        k kVar;
        g gVar = (g) this.f1599b;
        if (gVar.f1604j.b(gVar.f1603i, 212800000) == 0) {
            B b3 = new B();
            b3.f313d = new K0.d[]{H0.c.f601a};
            b3.f312c = new C0080a(4, gVar);
            b3.f310a = false;
            b3.f311b = 27601;
            kVar = gVar.b(0, b3.a());
        } else {
            L0.d dVar = new L0.d(new Status(17, null, null, null));
            k kVar2 = new k();
            kVar2.d(dVar);
            kVar = kVar2;
        }
        C0.e eVar = new C0.e(26, this);
        kVar.getClass();
        M0.j jVar = d1.f.f4932a;
        k kVar3 = new k();
        kVar.f4943b.d(new d1.g(jVar, eVar, kVar3));
        kVar.g();
        return kVar3;
    }

    public List B() {
        ArrayList arrayList;
        if (((ArrayList) this.f1599b).isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (((ArrayList) this.f1599b)) {
            arrayList = new ArrayList((ArrayList) this.f1599b);
        }
        return arrayList;
    }

    public void C(i iVar) {
        int i3 = iVar.f98b;
        A.b bVar = (A.b) this.f1600c;
        s sVar = (s) this.f1599b;
        if (i3 != 0) {
            bVar.execute(new B.b(sVar, i3));
        } else {
            bVar.execute(new B.a(sVar, 0, iVar.f97a));
        }
    }

    public MotionEvent D(I i3) {
        PriorityQueue priorityQueue;
        LongSparseArray longSparseArray;
        long j3;
        while (true) {
            priorityQueue = (PriorityQueue) this.f1600c;
            boolean isEmpty = priorityQueue.isEmpty();
            longSparseArray = (LongSparseArray) this.f1599b;
            j3 = i3.f321a;
            if (isEmpty || ((Long) priorityQueue.peek()).longValue() >= j3) {
                break;
            }
            longSparseArray.remove(((Long) priorityQueue.poll()).longValue());
        }
        if (!priorityQueue.isEmpty() && ((Long) priorityQueue.peek()).longValue() == j3) {
            priorityQueue.poll();
        }
        MotionEvent motionEvent = (MotionEvent) longSparseArray.get(j3);
        longSparseArray.remove(j3);
        return motionEvent;
    }

    public void E(String str, HashMap hashMap) {
        Map map;
        P1.g gVar = (P1.g) this.f1600c;
        if (gVar != null) {
            C0190d c0190d = new C0190d("event", str);
            if (hashMap.isEmpty()) {
                map = q.a0(c0190d);
            } else {
                LinkedHashMap linkedHashMap = new LinkedHashMap(hashMap);
                linkedHashMap.put("event", str);
                map = linkedHashMap;
            }
            if (gVar.f1260a.get()) {
                return;
            }
            A0.f fVar = gVar.f1261b;
            if (((AtomicReference) fVar.f24c).get() != gVar) {
                return;
            }
            A0.f fVar2 = (A0.f) fVar.f25d;
            ((P1.f) fVar2.f23b).k((String) fVar2.f24c, ((u) fVar2.f25d).b(map));
        }
    }

    public void F(boolean z, Status status) {
        HashMap hashMap;
        HashMap hashMap2;
        synchronized (((Map) this.f1599b)) {
            hashMap = new HashMap((Map) this.f1599b);
        }
        synchronized (((Map) this.f1600c)) {
            hashMap2 = new HashMap((Map) this.f1600c);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                entry.getKey().getClass();
                throw new ClassCastException();
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((d1.e) entry2.getKey()).a(new L0.d(status));
            }
        }
    }

    @Override // E2.h
    public void a() {
        k(((p) this.f1599b).f466i);
    }

    @Override // E2.h
    public void b() {
        ((MediaPlayer) this.f1600c).pause();
    }

    @Override // E2.h
    public void c(boolean z) {
        ((MediaPlayer) this.f1600c).setLooping(z);
    }

    @Override // P1.d
    public void d(ByteBuffer byteBuffer, G1.g gVar) {
        switch (this.f1598a) {
            case 24:
                B0.p pVar = (B0.p) this.f1600c;
                try {
                    ((P1.b) this.f1599b).a(((P1.k) pVar.f164c).decodeMessage(byteBuffer), new e(this, gVar, 23, false));
                    break;
                } catch (RuntimeException e3) {
                    Log.e("BasicMessageChannel#" + ((String) pVar.f163b), "Failed to handle message", e3);
                    gVar.a(null);
                    return;
                }
            default:
                o oVar = (o) this.f1600c;
                try {
                    ((m) this.f1599b).onMethodCall(oVar.f1270c.e(byteBuffer), new O1.j(this, 1, gVar));
                    break;
                } catch (RuntimeException e4) {
                    Log.e("MethodChannel#" + oVar.f1269b, "Failed to handle method call", e4);
                    gVar.a(oVar.f1270c.c(e4.getMessage(), Log.getStackTraceString(e4)));
                }
        }
    }

    @Override // E2.h
    public void e() {
        ((MediaPlayer) this.f1600c).stop();
    }

    @Override // E1.C
    public void f(KeyEvent keyEvent, A a3) {
        int action = keyEvent.getAction();
        if (action != 0 && action != 1) {
            a3.a(false);
            return;
        }
        Character a4 = ((A2.j) this.f1600c).a(keyEvent.getUnicodeChar());
        boolean z = action != 0;
        B0.g gVar = new B0.g(5, a3);
        C0.e eVar = (C0.e) this.f1599b;
        HashMap hashMap = new HashMap();
        hashMap.put("type", z ? "keyup" : "keydown");
        hashMap.put("keymap", ConstantDeviceInfo.APP_PLATFORM);
        hashMap.put("flags", Integer.valueOf(keyEvent.getFlags()));
        hashMap.put("plainCodePoint", Integer.valueOf(keyEvent.getUnicodeChar(0)));
        hashMap.put("codePoint", Integer.valueOf(keyEvent.getUnicodeChar()));
        hashMap.put("keyCode", Integer.valueOf(keyEvent.getKeyCode()));
        hashMap.put("scanCode", Integer.valueOf(keyEvent.getScanCode()));
        hashMap.put("metaState", Integer.valueOf(keyEvent.getMetaState()));
        hashMap.put("character", a4.toString());
        hashMap.put(AdRevenueConstants.SOURCE_KEY, Integer.valueOf(keyEvent.getSource()));
        hashMap.put("deviceId", Integer.valueOf(keyEvent.getDeviceId()));
        hashMap.put("repeatCount", Integer.valueOf(keyEvent.getRepeatCount()));
        ((B0.p) eVar.f201b).h(hashMap, new B0.g(6, gVar));
    }

    @Override // E2.h
    public void g(F2.c source) {
        kotlin.jvm.internal.j.e(source, "source");
        reset();
        source.a((MediaPlayer) this.f1600c);
    }

    @Override // a2.InterfaceC0133a
    public Object get() {
        return new C0.k(new K0.j(4), new K0.j(3), C0.a.f, (C0.m) ((n) this.f1599b).get(), (InterfaceC0133a) this.f1600c);
    }

    @Override // E2.h
    public void h() {
        ((MediaPlayer) this.f1600c).prepareAsync();
    }

    @Override // E2.h
    public Integer i() {
        Integer valueOf = Integer.valueOf(((MediaPlayer) this.f1600c).getDuration());
        if (valueOf.intValue() == -1) {
            return null;
        }
        return valueOf;
    }

    @Override // E2.h
    public boolean j() {
        Integer i3 = i();
        return i3 == null || i3.intValue() == 0;
    }

    @Override // E2.h
    public void k(float f3) {
        MediaPlayer mediaPlayer = (MediaPlayer) this.f1600c;
        mediaPlayer.setPlaybackParams(mediaPlayer.getPlaybackParams().setSpeed(f3));
    }

    @Override // E2.h
    public void l(D2.a aVar) {
        MediaPlayer player = (MediaPlayer) this.f1600c;
        kotlin.jvm.internal.j.e(player, "player");
        player.setAudioAttributes(aVar.a());
        if (aVar.f226b) {
            Context context = ((p) this.f1599b).f459a.f234b;
            if (context == null) {
                kotlin.jvm.internal.j.g("context");
                throw null;
            }
            Context applicationContext = context.getApplicationContext();
            kotlin.jvm.internal.j.d(applicationContext, "getApplicationContext(...)");
            player.setWakeMode(applicationContext, 1);
        }
    }

    @Override // E2.h
    public void m(int i3) {
        ((MediaPlayer) this.f1600c).seekTo(i3);
    }

    @Override // P1.c
    public void n(Object obj) {
        switch (this.f1598a) {
            case C0642l9.f7778D /* 20 */:
                A0.f fVar = (A0.f) this.f1600c;
                ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) fVar.f23b;
                l lVar = (l) this.f1599b;
                concurrentLinkedQueue.remove(lVar);
                if (!((ConcurrentLinkedQueue) fVar.f23b).isEmpty()) {
                    Log.e("SettingsChannel", "The queue becomes empty after removing config generation " + lVar.f1186a);
                    break;
                }
                break;
            default:
                ((G1.g) this.f1599b).a(((P1.k) ((B0.p) ((e) this.f1600c).f1600c).f164c).encodeMessage(obj));
                break;
        }
    }

    @Override // E2.h
    public void o(float f3, float f4) {
        ((MediaPlayer) this.f1600c).setVolume(f3, f4);
    }

    @Override // d1.b
    public void onComplete(Task task) {
        ((Map) ((e) this.f1600c).f1600c).remove((d1.e) this.f1599b);
    }

    @Override // P1.m
    public void onMethodCall(P1.l lVar, P1.n nVar) {
        C0178i c0178i = (C0178i) this.f1600c;
        if (((A0.f) c0178i.f2532b) == null) {
            ((O1.j) nVar).success((Map) this.f1599b);
            return;
        }
        String str = lVar.f1266a;
        str.getClass();
        if (!str.equals("getKeyboardState")) {
            ((O1.j) nVar).a();
            return;
        }
        try {
            this.f1599b = Collections.unmodifiableMap(((z) ((C[]) ((A0.f) c0178i.f2532b).f23b)[0]).f420b);
        } catch (IllegalStateException e3) {
            ((O1.j) nVar).b("error", e3.getMessage(), null);
        }
        ((O1.j) nVar).success((Map) this.f1599b);
    }

    @Override // E2.h
    public Integer p() {
        return Integer.valueOf(((MediaPlayer) this.f1600c).getCurrentPosition());
    }

    @Override // E2.h
    public void release() {
        MediaPlayer mediaPlayer = (MediaPlayer) this.f1600c;
        mediaPlayer.reset();
        mediaPlayer.release();
    }

    @Override // E2.h
    public void reset() {
        ((MediaPlayer) this.f1600c).reset();
    }

    public String toString() {
        switch (this.f1598a) {
            case 12:
                StringBuilder sb = new StringBuilder(100);
                sb.append(this.f1600c.getClass().getSimpleName());
                sb.append('{');
                ArrayList arrayList = (ArrayList) this.f1599b;
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    sb.append((String) arrayList.get(i3));
                    if (i3 < size - 1) {
                        sb.append(", ");
                    }
                }
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public void u(Object obj, String str) {
        ((ArrayList) this.f1599b).add(AbstractC0033i.k(str, "=", String.valueOf(obj)));
    }

    public void w(D2.a aVar) {
        AudioAttributes a3 = aVar.a();
        HashMap hashMap = (HashMap) this.f1600c;
        if (hashMap.containsKey(a3)) {
            return;
        }
        SoundPool build = new SoundPool.Builder().setAudioAttributes(a3).setMaxStreams(32).build();
        ((D2.d) this.f1599b).b("Create SoundPool with " + a3);
        kotlin.jvm.internal.j.b(build);
        final E2.m mVar = new E2.m(build);
        build.setOnLoadCompleteListener(new SoundPool.OnLoadCompleteListener() { // from class: E2.i
            @Override // android.media.SoundPool.OnLoadCompleteListener
            public final void onLoadComplete(SoundPool soundPool, int i3, int i4) {
                V0.e eVar = V0.e.this;
                m mVar2 = mVar;
                ((D2.d) eVar.f1599b).b("Loaded " + i3);
                l lVar = (l) mVar2.f453b.get(Integer.valueOf(i3));
                F2.d dVar = lVar != null ? lVar.f451h : null;
                if (dVar != null) {
                    t.a(mVar2.f453b).remove(lVar.f448d);
                    synchronized (mVar2.f454c) {
                        List<l> list = (List) mVar2.f454c.get(dVar);
                        if (list == null) {
                            list = c2.m.f2637a;
                        }
                        for (l lVar2 : list) {
                            lVar2.f445a.c("Marking " + lVar2 + " as loaded");
                            lVar2.f445a.h(true);
                            p pVar = lVar2.f445a;
                            if (pVar.f471n) {
                                pVar.c("Delayed start of " + lVar2);
                                lVar2.a();
                            }
                        }
                    }
                }
            }
        });
        hashMap.put(a3, mVar);
    }

    public void x() {
        P1.g gVar = (P1.g) this.f1600c;
        if (gVar != null) {
            if (!gVar.f1260a.getAndSet(true)) {
                A0.f fVar = gVar.f1261b;
                if (((AtomicReference) fVar.f24c).get() == gVar) {
                    A0.f fVar2 = (A0.f) fVar.f25d;
                    ((P1.f) fVar2.f23b).k((String) fVar2.f24c, null);
                }
            }
            this.f1600c = null;
        }
        ((A0.f) this.f1599b).S(null);
    }

    public void y(String str, String str2, String str3) {
        P1.g gVar = (P1.g) this.f1600c;
        if (gVar == null || gVar.f1260a.get()) {
            return;
        }
        A0.f fVar = gVar.f1261b;
        if (((AtomicReference) fVar.f24c).get() != gVar) {
            return;
        }
        A0.f fVar2 = (A0.f) fVar.f25d;
        ((P1.f) fVar2.f23b).k((String) fVar2.f24c, ((u) fVar2.f25d).d(str, str2, str3));
    }

    public View z(int i3, int i4, int i5, int i6) {
        N n3 = (N) this.f1599b;
        int o = n3.o();
        int f3 = n3.f();
        int i7 = i4 > i3 ? 1 : -1;
        View view = null;
        while (i3 != i4) {
            View m3 = n3.m(i3);
            int h3 = n3.h(m3);
            int p3 = n3.p(m3);
            M m4 = (M) this.f1600c;
            m4.f1384b = o;
            m4.f1385c = f3;
            m4.f1386d = h3;
            m4.f1387e = p3;
            if (i5 != 0) {
                m4.f1383a = i5;
                if (m4.a()) {
                    return m3;
                }
            }
            if (i6 != 0) {
                m4.f1383a = i6;
                if (m4.a()) {
                    view = m3;
                }
            }
            i3 += i7;
        }
        return view;
    }

    public /* synthetic */ e(Object obj, Object obj2, int i3, boolean z) {
        this.f1598a = i3;
        this.f1600c = obj;
        this.f1599b = obj2;
    }

    public e(Context context, int i3) {
        e eVar;
        this.f1598a = i3;
        switch (i3) {
            case 28:
                this.f1599b = new g(context, K0.f.f848b);
                synchronized (e.class) {
                    try {
                        if (f1596d == null) {
                            f1596d = new e(context.getApplicationContext(), 0);
                        }
                        eVar = f1596d;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                this.f1600c = eVar;
                return;
            default:
                ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
                this.f1600c = Executors.newSingleThreadExecutor();
                this.f1599b = context;
                newSingleThreadScheduledExecutor.scheduleAtFixedRate(new B.b(10, this), 0L, 86400L, TimeUnit.SECONDS);
                return;
        }
    }

    public /* synthetic */ e(Object obj) {
        this.f1598a = 12;
        this.f1600c = obj;
        this.f1599b = new ArrayList();
    }

    public e(String str, C2.b bVar, K0.j jVar) {
        this.f1598a = 8;
        this.f1600c = str;
        this.f1599b = bVar;
    }

    public e(final p wrappedPlayer) {
        this.f1598a = 6;
        kotlin.jvm.internal.j.e(wrappedPlayer, "wrappedPlayer");
        this.f1599b = wrappedPlayer;
        MediaPlayer mediaPlayer = new MediaPlayer();
        mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: E2.c
            @Override // android.media.MediaPlayer.OnPreparedListener
            public final void onPrepared(MediaPlayer mediaPlayer2) {
                h hVar;
                h hVar2;
                p pVar = p.this;
                pVar.h(true);
                pVar.f459a.getClass();
                Integer i3 = (!pVar.f470m || (hVar2 = pVar.f463e) == null) ? null : hVar2.i();
                pVar.f460b.E("audio.onDuration", c2.p.b0(new C0190d("value", Integer.valueOf(i3 != null ? i3.intValue() : 0))));
                if (pVar.f471n) {
                    pVar.f();
                }
                if (pVar.o >= 0) {
                    h hVar3 = pVar.f463e;
                    if ((hVar3 == null || !hVar3.j()) && (hVar = pVar.f463e) != null) {
                        hVar.m(pVar.o);
                    }
                }
            }
        });
        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: E2.d
            @Override // android.media.MediaPlayer.OnCompletionListener
            public final void onCompletion(MediaPlayer mediaPlayer2) {
                p pVar = p.this;
                if (pVar.f467j != D2.f.f241b) {
                    pVar.k();
                }
                pVar.f459a.getClass();
                pVar.f460b.E("audio.onComplete", new HashMap());
            }
        });
        mediaPlayer.setOnSeekCompleteListener(new MediaPlayer.OnSeekCompleteListener() { // from class: E2.e
            @Override // android.media.MediaPlayer.OnSeekCompleteListener
            public final void onSeekComplete(MediaPlayer mediaPlayer2) {
                p pVar = p.this;
                pVar.f459a.getClass();
                pVar.f460b.E("audio.onSeekComplete", new HashMap());
            }
        });
        mediaPlayer.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: E2.f
            @Override // android.media.MediaPlayer.OnErrorListener
            public final boolean onError(MediaPlayer mediaPlayer2, int i3, int i4) {
                String str;
                String str2;
                p pVar = p.this;
                pVar.getClass();
                if (i3 == 100) {
                    str = "MEDIA_ERROR_SERVER_DIED";
                } else {
                    str = "MEDIA_ERROR_UNKNOWN {what:" + i3 + '}';
                }
                if (i4 == Integer.MIN_VALUE) {
                    str2 = "MEDIA_ERROR_SYSTEM";
                } else if (i4 == -1010) {
                    str2 = "MEDIA_ERROR_UNSUPPORTED";
                } else if (i4 == -1007) {
                    str2 = "MEDIA_ERROR_MALFORMED";
                } else if (i4 == -1004) {
                    str2 = "MEDIA_ERROR_IO";
                } else if (i4 != -110) {
                    str2 = "MEDIA_ERROR_UNKNOWN {extra:" + i4 + '}';
                } else {
                    str2 = "MEDIA_ERROR_TIMED_OUT";
                }
                boolean z = pVar.f470m;
                V0.e eVar = pVar.f460b;
                D2.d dVar = pVar.f459a;
                if (z || !kotlin.jvm.internal.j.a(str2, "MEDIA_ERROR_SYSTEM")) {
                    pVar.h(false);
                    dVar.getClass();
                    eVar.y("AndroidAudioError", str, str2);
                    return false;
                }
                dVar.getClass();
                eVar.y("AndroidAudioError", "Failed to set source. For troubleshooting, see: https://github.com/bluefireteam/audioplayers/blob/main/troubleshooting.md", str + ", " + str2);
                return false;
            }
        });
        mediaPlayer.setOnBufferingUpdateListener(new MediaPlayer.OnBufferingUpdateListener() { // from class: E2.g
            @Override // android.media.MediaPlayer.OnBufferingUpdateListener
            public final void onBufferingUpdate(MediaPlayer mediaPlayer2, int i3) {
                p.this.getClass();
            }
        });
        mediaPlayer.setAudioAttributes(wrappedPlayer.f461c.a());
        this.f1600c = mediaPlayer;
    }

    public e(R1.a aVar, C0.e eVar) {
        this.f1598a = 26;
        this.f1599b = aVar;
        this.f1600c = eVar;
        eVar.f201b = new C0.e(22, this);
    }

    public e(C0.e eVar) {
        this.f1598a = 4;
        this.f1600c = new A2.j();
        this.f1599b = eVar;
    }

    public e(C0178i c0178i) {
        this.f1598a = 14;
        this.f1600c = c0178i;
        this.f1599b = new HashMap();
    }

    public e(int i3) {
        this.f1598a = i3;
        switch (i3) {
            case 10:
                this.f1599b = Collections.synchronizedMap(new WeakHashMap());
                this.f1600c = Collections.synchronizedMap(new WeakHashMap());
                break;
            case 13:
                K0.e eVar = K0.e.f846d;
                this.f1599b = new SparseIntArray();
                this.f1600c = eVar;
                break;
            case 22:
                this.f1599b = new ArrayList();
                this.f1600c = new HashMap();
                new HashMap();
                break;
            case C0642l9.f7783I /* 29 */:
                this.f1599b = new ReentrantLock();
                this.f1600c = new LinkedHashMap();
                break;
            default:
                this.f1599b = new LongSparseArray();
                this.f1600c = new PriorityQueue();
                break;
        }
    }

    public e(G1.b bVar, int i3) {
        this.f1598a = i3;
        switch (i3) {
            case 16:
                C0.e eVar = new C0.e(14, this);
                o oVar = new o(bVar, "flutter/platform", P1.j.f1265a, null);
                this.f1599b = oVar;
                oVar.b(eVar);
                break;
            case 17:
                C0.e eVar2 = new C0.e(15, this);
                o oVar2 = new o(bVar, "flutter/platform_views_2", u.f1272b, null);
                this.f1599b = oVar2;
                oVar2.b(eVar2);
                break;
            case 18:
                C0178i c0178i = new C0178i(15, this);
                o oVar3 = new o(bVar, "flutter/platform_views", u.f1272b, null);
                this.f1599b = oVar3;
                oVar3.b(c0178i);
                break;
            case C0642l9.f7777C /* 19 */:
            case C0642l9.f7778D /* 20 */:
            default:
                C0.e eVar3 = new C0.e(12, this);
                o oVar4 = new o(bVar, "flutter/localization", P1.j.f1265a, null);
                this.f1599b = oVar4;
                oVar4.b(eVar3);
                break;
            case C0642l9.f7779E /* 21 */:
                C0.e eVar4 = new C0.e(20, this);
                o oVar5 = new o(bVar, "flutter/textinput", P1.j.f1265a, null);
                this.f1599b = oVar5;
                oVar5.b(eVar4);
                break;
        }
    }

    public e(G1.b bVar, PackageManager packageManager) {
        this.f1598a = 19;
        C0178i c0178i = new C0178i(16, this);
        this.f1599b = packageManager;
        new o(bVar, "flutter/processtext", u.f1272b, null).b(c0178i);
    }

    public e(N n3) {
        this.f1598a = 27;
        this.f1599b = n3;
        M m3 = new M();
        m3.f1383a = 0;
        this.f1600c = m3;
    }

    public e(D2.d ref) {
        this.f1598a = 7;
        kotlin.jvm.internal.j.e(ref, "ref");
        this.f1599b = ref;
        this.f1600c = new HashMap();
    }

    public e(A0.f fVar) {
        this.f1598a = 3;
        this.f1599b = fVar;
        fVar.S(this);
    }
}
