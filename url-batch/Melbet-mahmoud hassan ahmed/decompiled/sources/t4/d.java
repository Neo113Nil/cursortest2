package t4;

import android.content.Context;
import android.media.audiofx.AudioEffect;
import android.media.audiofx.Equalizer;
import android.media.audiofx.LoudnessEnhancer;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import c4.w0;
import com.google.android.exoplayer2.source.dash.DashMediaSource;
import com.google.android.exoplayer2.source.hls.HlsMediaSource;
import j1.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import m5.j;
import m5.k;
import n2.l;
import n2.t;
import n2.u;
import o2.m0;
import p2.z;
import r0.a2;
import r0.f2;
import r0.k;
import r0.l;
import r0.n;
import r0.p;
import r0.r;
import r0.r2;
import r0.r3;
import r0.t;
import r0.u2;
import r0.v2;
import r0.w3;
import r0.x1;
import r0.x2;
import r0.y1;
import t0.e;
import t1.l0;
import t1.s0;
import t1.t0;
import t1.x;
import w0.i;

/* loaded from: classes.dex */
public class d implements k.c, v2.d, j1.f {
    private static Random N = new Random();
    private x1 A;
    private List<Object> B;
    private Map<String, Object> F;
    private t G;
    private Integer I;
    private x J;
    private Integer K;

    /* renamed from: f, reason: collision with root package name */
    private final Context f22286f;

    /* renamed from: g, reason: collision with root package name */
    private final k f22287g;

    /* renamed from: h, reason: collision with root package name */
    private final e f22288h;

    /* renamed from: i, reason: collision with root package name */
    private final e f22289i;

    /* renamed from: j, reason: collision with root package name */
    private c f22290j;

    /* renamed from: k, reason: collision with root package name */
    private long f22291k;

    /* renamed from: l, reason: collision with root package name */
    private long f22292l;

    /* renamed from: m, reason: collision with root package name */
    private long f22293m;

    /* renamed from: n, reason: collision with root package name */
    private Long f22294n;

    /* renamed from: o, reason: collision with root package name */
    private long f22295o;

    /* renamed from: p, reason: collision with root package name */
    private Integer f22296p;

    /* renamed from: q, reason: collision with root package name */
    private k.d f22297q;

    /* renamed from: r, reason: collision with root package name */
    private k.d f22298r;

    /* renamed from: s, reason: collision with root package name */
    private k.d f22299s;

    /* renamed from: u, reason: collision with root package name */
    private n1.c f22301u;

    /* renamed from: v, reason: collision with root package name */
    private n1.b f22302v;

    /* renamed from: w, reason: collision with root package name */
    private int f22303w;

    /* renamed from: x, reason: collision with root package name */
    private t0.e f22304x;

    /* renamed from: y, reason: collision with root package name */
    private y1 f22305y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f22306z;

    /* renamed from: t, reason: collision with root package name */
    private Map<String, x> f22300t = new HashMap();
    private List<AudioEffect> C = new ArrayList();
    private Map<String, AudioEffect> D = new HashMap();
    private int E = 0;
    private i H = new i();
    private final Handler L = new Handler(Looper.getMainLooper());
    private final Runnable M = new a();

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Handler handler;
            long j7;
            if (d.this.G == null) {
                return;
            }
            if (d.this.G.o() != d.this.f22293m) {
                d.this.g0();
            }
            int T = d.this.G.T();
            if (T == 2) {
                handler = d.this.L;
                j7 = 200;
            } else {
                if (T != 3) {
                    return;
                }
                if (d.this.G.p()) {
                    handler = d.this.L;
                    j7 = 500;
                } else {
                    handler = d.this.L;
                    j7 = 1000;
                }
            }
            handler.postDelayed(this, j7);
        }
    }

    static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f22308a;

        static {
            int[] iArr = new int[c.values().length];
            f22308a = iArr;
            try {
                iArr[c.none.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22308a[c.loading.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    enum c {
        none,
        loading,
        buffering,
        ready,
        completed
    }

    public d(Context context, m5.c cVar, String str, Map<?, ?> map, List<Object> list, Boolean bool) {
        this.f22286f = context;
        this.B = list;
        this.f22306z = bool != null ? bool.booleanValue() : false;
        k kVar = new k(cVar, "com.ryanheise.just_audio.methods." + str);
        this.f22287g = kVar;
        kVar.e(this);
        this.f22288h = new e(cVar, "com.ryanheise.just_audio.events." + str);
        this.f22289i = new e(cVar, "com.ryanheise.just_audio.data." + str);
        this.f22290j = c.none;
        this.H.h(true);
        if (map != null) {
            Map map2 = (Map) map.get("androidLoadControl");
            if (map2 != null) {
                l.a b7 = new l.a().c((int) (J0(map2.get("minBufferDuration")).longValue() / 1000), (int) (J0(map2.get("maxBufferDuration")).longValue() / 1000), (int) (J0(map2.get("bufferForPlaybackDuration")).longValue() / 1000), (int) (J0(map2.get("bufferForPlaybackAfterRebufferDuration")).longValue() / 1000)).d(((Boolean) map2.get("prioritizeTimeOverSizeThresholds")).booleanValue()).b((int) (J0(map2.get("backBufferDuration")).longValue() / 1000), false);
                if (map2.get("targetBufferBytes") != null) {
                    b7.e(((Integer) map2.get("targetBufferBytes")).intValue());
                }
                this.f22305y = b7.a();
            }
            Map map3 = (Map) map.get("androidLivePlaybackSpeedControl");
            if (map3 != null) {
                this.A = new k.b().c((float) ((Double) map3.get("fallbackMinPlaybackSpeed")).doubleValue()).b((float) ((Double) map3.get("fallbackMaxPlaybackSpeed")).doubleValue()).f(J0(map3.get("minUpdateInterval")).longValue() / 1000).g((float) ((Double) map3.get("proportionalControlFactor")).doubleValue()).d(J0(map3.get("maxLiveOffsetErrorForUnitSpeed")).longValue() / 1000).h(J0(map3.get("targetLiveOffsetIncrementOnRebuffer")).longValue() / 1000).e((float) ((Double) map3.get("minPossibleLiveOffsetSmoothingFactor")).doubleValue()).a();
            }
        }
    }

    private void A0() {
        new HashMap();
        this.F = v0();
    }

    private void B0() {
        if (this.G == null) {
            t.b bVar = new t.b(this.f22286f);
            y1 y1Var = this.f22305y;
            if (y1Var != null) {
                bVar.o(y1Var);
            }
            x1 x1Var = this.A;
            if (x1Var != null) {
                bVar.n(x1Var);
            }
            if (this.f22306z) {
                bVar.p(new n(this.f22286f).j(true));
            }
            t g7 = bVar.g();
            this.G = g7;
            g7.w(this.f22306z);
            W0(this.G.J());
            this.G.u(this);
        }
    }

    private Map<String, Object> C0() {
        Equalizer equalizer = (Equalizer) this.D.get("AndroidEqualizer");
        ArrayList arrayList = new ArrayList();
        for (short s7 = 0; s7 < equalizer.getNumberOfBands(); s7 = (short) (s7 + 1)) {
            double d7 = equalizer.getBandFreqRange(s7)[0];
            Double.isNaN(d7);
            double d8 = equalizer.getBandFreqRange(s7)[1];
            Double.isNaN(d8);
            double centerFreq = equalizer.getCenterFreq(s7);
            Double.isNaN(centerFreq);
            double bandLevel = equalizer.getBandLevel(s7);
            Double.isNaN(bandLevel);
            arrayList.add(Q0("index", Short.valueOf(s7), "lowerFrequency", Double.valueOf(d7 / 1000.0d), "upperFrequency", Double.valueOf(d8 / 1000.0d), "centerFrequency", Double.valueOf(centerFreq / 1000.0d), "gain", Double.valueOf(bandLevel / 1000.0d)));
        }
        double d9 = equalizer.getBandLevelRange()[0];
        Double.isNaN(d9);
        double d10 = equalizer.getBandLevelRange()[1];
        Double.isNaN(d10);
        return Q0("parameters", Q0("minDecibels", Double.valueOf(d9 / 1000.0d), "maxDecibels", Double.valueOf(d10 / 1000.0d), "bands", arrayList));
    }

    private void D0(int i7, double d7) {
        ((Equalizer) this.D.get("AndroidEqualizer")).setBandLevel((short) i7, (short) Math.round(d7 * 1000.0d));
    }

    private x E0(Object obj) {
        Map map = (Map) obj;
        String str = (String) map.get("id");
        x xVar = this.f22300t.get(str);
        if (xVar != null) {
            return xVar;
        }
        x x02 = x0(map);
        this.f22300t.put(str, x02);
        return x02;
    }

    private List<x> F0(Object obj) {
        if (!(obj instanceof List)) {
            throw new RuntimeException("List expected: " + obj);
        }
        List list = (List) obj;
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < list.size(); i7++) {
            arrayList.add(E0(list.get(i7)));
        }
        return arrayList;
    }

    private x[] G0(Object obj) {
        List<x> F0 = F0(obj);
        x[] xVarArr = new x[F0.size()];
        F0.toArray(xVarArr);
        return xVarArr;
    }

    private long H0() {
        long j7 = this.f22295o;
        if (j7 != -9223372036854775807L) {
            return j7;
        }
        c cVar = this.f22290j;
        if (cVar != c.none && cVar != c.loading) {
            Long l7 = this.f22294n;
            return (l7 == null || l7.longValue() == -9223372036854775807L) ? this.G.N() : this.f22294n.longValue();
        }
        long N2 = this.G.N();
        if (N2 < 0) {
            return 0L;
        }
        return N2;
    }

    private long I0() {
        c cVar = this.f22290j;
        if (cVar == c.none || cVar == c.loading) {
            return -9223372036854775807L;
        }
        return this.G.H();
    }

    public static Long J0(Object obj) {
        return (obj == null || (obj instanceof Long)) ? (Long) obj : Long.valueOf(((Integer) obj).intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void K0(k.d dVar) {
        dVar.a(new HashMap());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void L0(k.d dVar) {
        dVar.a(new HashMap());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void M0(k.d dVar) {
        dVar.a(new HashMap());
    }

    private void N0(x xVar, long j7, Integer num, k.d dVar) {
        this.f22295o = j7;
        this.f22296p = num;
        this.K = Integer.valueOf(num != null ? num.intValue() : 0);
        int i7 = b.f22308a[this.f22290j.ordinal()];
        if (i7 != 1) {
            if (i7 == 2) {
                O();
            }
            this.G.B();
        }
        this.f22303w = 0;
        this.f22297q = dVar;
        g1();
        this.f22290j = c.loading;
        A0();
        this.J = xVar;
        this.G.M(xVar);
        this.G.W();
    }

    private void O() {
        U0("abort", "Connection aborted");
    }

    private void O0(double d7) {
        ((LoudnessEnhancer) this.D.get("AndroidLoudnessEnhancer")).setTargetGain((int) Math.round(d7 * 1000.0d));
    }

    static <T> T P0(Object obj, String str) {
        if (obj instanceof Map) {
            return (T) ((Map) obj).get(str);
        }
        return null;
    }

    private void Q() {
        k.d dVar = this.f22299s;
        if (dVar != null) {
            try {
                dVar.a(new HashMap());
            } catch (RuntimeException unused) {
            }
            this.f22299s = null;
            this.f22294n = null;
        }
    }

    static Map<String, Object> Q0(Object... objArr) {
        HashMap hashMap = new HashMap();
        for (int i7 = 0; i7 < objArr.length; i7 += 2) {
            hashMap.put((String) objArr[i7], objArr[i7 + 1]);
        }
        return hashMap;
    }

    private void U0(String str, String str2) {
        k.d dVar = this.f22297q;
        if (dVar != null) {
            dVar.b(str, str2, null);
            this.f22297q = null;
        }
        this.f22288h.b(str, str2, null);
    }

    private void V0(int i7, int i8, int i9) {
        e.C0138e c0138e = new e.C0138e();
        c0138e.c(i7);
        c0138e.d(i8);
        c0138e.f(i9);
        t0.e a7 = c0138e.a();
        if (this.f22290j == c.loading) {
            this.f22304x = a7;
        } else {
            this.G.F(a7, false);
        }
    }

    private void W0(int i7) {
        this.I = i7 == 0 ? null : Integer.valueOf(i7);
        r0();
        if (this.I != null) {
            for (Object obj : this.B) {
                Map map = (Map) obj;
                AudioEffect w02 = w0(obj, this.I.intValue());
                if (((Boolean) map.get("enabled")).booleanValue()) {
                    w02.setEnabled(true);
                }
                this.C.add(w02);
                this.D.put((String) map.get("type"), w02);
            }
        }
        A0();
    }

    private void a1(Object obj) {
        Map map = (Map) obj;
        x xVar = this.f22300t.get((String) P0(map, "id"));
        if (xVar == null) {
            return;
        }
        String str = (String) P0(map, "type");
        str.hashCode();
        if (!str.equals("concatenating")) {
            if (str.equals("looping")) {
                a1(P0(map, "child"));
            }
        } else {
            ((t1.k) xVar).u0(y0((List) P0(map, "shuffleOrder")));
            Iterator it = ((List) P0(map, "children")).iterator();
            while (it.hasNext()) {
                a1(it.next());
            }
        }
    }

    private void d0(String str, boolean z6) {
        this.D.get(str).setEnabled(z6);
    }

    private void e1() {
        this.L.removeCallbacks(this.M);
        this.L.post(this.M);
    }

    private boolean f1() {
        Integer valueOf = Integer.valueOf(this.G.A());
        if (valueOf.equals(this.K)) {
            return false;
        }
        this.K = valueOf;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g0() {
        A0();
        h0();
    }

    private void g1() {
        this.f22291k = H0();
        this.f22292l = System.currentTimeMillis();
    }

    private void h0() {
        Map<String, Object> map = this.F;
        if (map != null) {
            this.f22288h.a(map);
            this.F = null;
        }
    }

    private boolean h1() {
        if (H0() == this.f22291k) {
            return false;
        }
        this.f22291k = H0();
        this.f22292l = System.currentTimeMillis();
        return true;
    }

    private l.a q0() {
        return new t.a(this.f22286f, new u.b().e(m0.l0(this.f22286f, "just_audio")).c(true));
    }

    private void r0() {
        Iterator<AudioEffect> it = this.C.iterator();
        while (it.hasNext()) {
            it.next().release();
            it.remove();
        }
        this.D.clear();
    }

    private Map<String, Object> s0() {
        HashMap hashMap = new HashMap();
        if (this.f22301u != null) {
            HashMap hashMap2 = new HashMap();
            hashMap2.put("title", this.f22301u.f19386g);
            hashMap2.put("url", this.f22301u.f19387h);
            hashMap.put("info", hashMap2);
        }
        if (this.f22302v != null) {
            HashMap hashMap3 = new HashMap();
            hashMap3.put("bitrate", Integer.valueOf(this.f22302v.f19379f));
            hashMap3.put("genre", this.f22302v.f19380g);
            hashMap3.put("name", this.f22302v.f19381h);
            hashMap3.put("metadataInterval", Integer.valueOf(this.f22302v.f19384k));
            hashMap3.put("url", this.f22302v.f19382i);
            hashMap3.put("isPublic", Boolean.valueOf(this.f22302v.f19383j));
            hashMap.put("headers", hashMap3);
        }
        return hashMap;
    }

    private void t0() {
        this.f22294n = null;
        this.f22299s.a(new HashMap());
        this.f22299s = null;
    }

    private t1.k u0(Object obj) {
        return (t1.k) this.f22300t.get((String) obj);
    }

    private Map<String, Object> v0() {
        HashMap hashMap = new HashMap();
        Long valueOf = I0() == -9223372036854775807L ? null : Long.valueOf(I0() * 1000);
        r0.t tVar = this.G;
        this.f22293m = tVar != null ? tVar.o() : 0L;
        hashMap.put("processingState", Integer.valueOf(this.f22290j.ordinal()));
        hashMap.put("updatePosition", Long.valueOf(this.f22291k * 1000));
        hashMap.put("updateTime", Long.valueOf(this.f22292l));
        hashMap.put("bufferedPosition", Long.valueOf(Math.max(this.f22291k, this.f22293m) * 1000));
        hashMap.put("icyMetadata", s0());
        hashMap.put("duration", valueOf);
        hashMap.put("currentIndex", this.K);
        hashMap.put("androidAudioSessionId", this.I);
        return hashMap;
    }

    private AudioEffect w0(Object obj, int i7) {
        Map map = (Map) obj;
        String str = (String) map.get("type");
        str.hashCode();
        if (str.equals("AndroidEqualizer")) {
            return new Equalizer(0, i7);
        }
        if (!str.equals("AndroidLoudnessEnhancer")) {
            throw new IllegalArgumentException("Unknown AudioEffect type: " + map.get("type"));
        }
        if (Build.VERSION.SDK_INT < 19) {
            throw new RuntimeException("AndroidLoudnessEnhancer requires minSdkVersion >= 19");
        }
        int round = (int) Math.round(((Double) map.get("targetGain")).doubleValue() * 1000.0d);
        LoudnessEnhancer loudnessEnhancer = new LoudnessEnhancer(i7);
        loudnessEnhancer.setTargetGain(round);
        return loudnessEnhancer;
    }

    private x x0(Object obj) {
        Map map;
        String str;
        int i7;
        map = (Map) obj;
        str = (String) map.get("id");
        String str2 = (String) map.get("type");
        str2.hashCode();
        switch (str2) {
            case "concatenating":
                return new t1.k(false, ((Boolean) map.get("useLazyPreparation")).booleanValue(), y0((List) P0(map, "shuffleOrder")), G0(map.get("children")));
            case "hls":
                return new HlsMediaSource.Factory(q0()).a(new a2.c().f(Uri.parse((String) map.get("uri"))).d("application/x-mpegURL").a());
            case "dash":
                return new DashMediaSource.Factory(q0()).a(new a2.c().f(Uri.parse((String) map.get("uri"))).d("application/dash+xml").e(str).a());
            case "looping":
                Integer num = (Integer) map.get("count");
                x E0 = E0(map.get("child"));
                int intValue = num.intValue();
                x[] xVarArr = new x[intValue];
                for (i7 = 0; i7 < intValue; i7++) {
                    xVarArr[i7] = E0;
                }
                return new t1.k(xVarArr);
            case "clipping":
                Long J0 = J0(map.get("start"));
                Long J02 = J0(map.get("end"));
                return new t1.e(E0(map.get("child")), J0 != null ? J0.longValue() : 0L, J02 != null ? J02.longValue() : Long.MIN_VALUE);
            case "progressive":
                return new l0.b(q0(), this.H).b(new a2.c().f(Uri.parse((String) map.get("uri"))).e(str).a());
            case "silence":
                return new t0.b().b(J0(map.get("duration")).longValue()).c(str).a();
            default:
                throw new IllegalArgumentException("Unknown AudioSource type: " + map.get("type"));
        }
    }

    private s0 y0(List<Integer> list) {
        int size = list.size();
        int[] iArr = new int[size];
        for (int i7 = 0; i7 < size; i7++) {
            iArr[i7] = list.get(i7).intValue();
        }
        return new s0.a(iArr, N.nextLong());
    }

    @Override // r0.v2.d
    public /* synthetic */ void A(boolean z6, int i7) {
        x2.r(this, z6, i7);
    }

    @Override // r0.v2.d
    public /* synthetic */ void B(w3 w3Var) {
        x2.B(this, w3Var);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // m5.k.c
    public void C(j jVar, final k.d dVar) {
        String str;
        Object hashMap;
        t1.k u02;
        s0 y02;
        B0();
        try {
            try {
                String str2 = jVar.f19247a;
                char c7 = 65535;
                switch (str2.hashCode()) {
                    case -2058172951:
                        if (str2.equals("androidEqualizerBandSetGain")) {
                            c7 = 21;
                            break;
                        }
                        break;
                    case -1987605894:
                        if (str2.equals("setShuffleMode")) {
                            c7 = '\b';
                            break;
                        }
                        break;
                    case -1875704736:
                        if (str2.equals("setSkipSilence")) {
                            c7 = 6;
                            break;
                        }
                        break;
                    case -1540835818:
                        if (str2.equals("concatenatingInsertAll")) {
                            c7 = 14;
                            break;
                        }
                        break;
                    case -1484304041:
                        if (str2.equals("setShuffleOrder")) {
                            c7 = '\t';
                            break;
                        }
                        break;
                    case -704119678:
                        if (str2.equals("setCanUseNetworkResourcesForLiveStreamingWhilePaused")) {
                            c7 = 11;
                            break;
                        }
                        break;
                    case -345307082:
                        if (str2.equals("androidLoudnessEnhancerSetTargetGain")) {
                            c7 = 19;
                            break;
                        }
                        break;
                    case -104999328:
                        if (str2.equals("setAndroidAudioAttributes")) {
                            c7 = 17;
                            break;
                        }
                        break;
                    case -48357143:
                        if (str2.equals("setLoopMode")) {
                            c7 = 7;
                            break;
                        }
                        break;
                    case 3327206:
                        if (str2.equals("load")) {
                            c7 = 0;
                            break;
                        }
                        break;
                    case 3443508:
                        if (str2.equals("play")) {
                            c7 = 1;
                            break;
                        }
                        break;
                    case 3526264:
                        if (str2.equals("seek")) {
                            c7 = '\r';
                            break;
                        }
                        break;
                    case 106440182:
                        if (str2.equals("pause")) {
                            c7 = 2;
                            break;
                        }
                        break;
                    case 670514716:
                        if (str2.equals("setVolume")) {
                            c7 = 3;
                            break;
                        }
                        break;
                    case 845471111:
                        if (str2.equals("concatenatingRemoveRange")) {
                            c7 = 15;
                            break;
                        }
                        break;
                    case 986980643:
                        if (str2.equals("concatenatingMove")) {
                            c7 = 16;
                            break;
                        }
                        break;
                    case 1401390078:
                        if (str2.equals("setPitch")) {
                            c7 = 5;
                            break;
                        }
                        break;
                    case 1404354821:
                        if (str2.equals("setSpeed")) {
                            c7 = 4;
                            break;
                        }
                        break;
                    case 1454606831:
                        if (str2.equals("setPreferredPeakBitRate")) {
                            c7 = '\f';
                            break;
                        }
                        break;
                    case 1624925565:
                        if (str2.equals("androidEqualizerGetParameters")) {
                            c7 = 20;
                            break;
                        }
                        break;
                    case 1631191096:
                        if (str2.equals("setAutomaticallyWaitsToMinimizeStalling")) {
                            c7 = '\n';
                            break;
                        }
                        break;
                    case 2117606630:
                        if (str2.equals("audioEffectSetEnabled")) {
                            c7 = 18;
                            break;
                        }
                        break;
                }
                long j7 = -9223372036854775807L;
                switch (c7) {
                    case 0:
                        Long J0 = J0(jVar.a("initialPosition"));
                        Integer num = (Integer) jVar.a("initialIndex");
                        x E0 = E0(jVar.a("audioSource"));
                        if (J0 != null) {
                            j7 = J0.longValue() / 1000;
                        }
                        N0(E0, j7, num, dVar);
                        break;
                    case 1:
                        S0(dVar);
                        break;
                    case 2:
                        R0();
                        hashMap = new HashMap();
                        dVar.a(hashMap);
                        break;
                    case 3:
                        d1((float) ((Double) jVar.a("volume")).doubleValue());
                        hashMap = new HashMap();
                        dVar.a(hashMap);
                        break;
                    case 4:
                        c1((float) ((Double) jVar.a("speed")).doubleValue());
                        hashMap = new HashMap();
                        dVar.a(hashMap);
                        break;
                    case 5:
                        Y0((float) ((Double) jVar.a("pitch")).doubleValue());
                        hashMap = new HashMap();
                        dVar.a(hashMap);
                        break;
                    case 6:
                        b1(((Boolean) jVar.a("enabled")).booleanValue());
                        hashMap = new HashMap();
                        dVar.a(hashMap);
                        break;
                    case w0.f2149o /* 7 */:
                        X0(((Integer) jVar.a("loopMode")).intValue());
                        hashMap = new HashMap();
                        dVar.a(hashMap);
                        break;
                    case w0.f2150p /* 8 */:
                        Z0(((Integer) jVar.a("shuffleMode")).intValue() == 1);
                        hashMap = new HashMap();
                        dVar.a(hashMap);
                        break;
                    case '\t':
                        a1(jVar.a("audioSource"));
                        hashMap = new HashMap();
                        dVar.a(hashMap);
                        break;
                    case '\n':
                        hashMap = new HashMap();
                        dVar.a(hashMap);
                        break;
                    case 11:
                        hashMap = new HashMap();
                        dVar.a(hashMap);
                        break;
                    case '\f':
                        hashMap = new HashMap();
                        dVar.a(hashMap);
                        break;
                    case '\r':
                        Long J02 = J0(jVar.a("position"));
                        Integer num2 = (Integer) jVar.a("index");
                        if (J02 != null) {
                            j7 = J02.longValue() / 1000;
                        }
                        T0(j7, num2, dVar);
                        break;
                    case 14:
                        u0(jVar.a("id")).S(((Integer) jVar.a("index")).intValue(), F0(jVar.a("children")), this.L, new Runnable() { // from class: t4.b
                            @Override // java.lang.Runnable
                            public final void run() {
                                d.K0(k.d.this);
                            }
                        });
                        u02 = u0(jVar.a("id"));
                        y02 = y0((List) jVar.a("shuffleOrder"));
                        u02.u0(y02);
                        break;
                    case 15:
                        u0(jVar.a("id")).p0(((Integer) jVar.a("startIndex")).intValue(), ((Integer) jVar.a("endIndex")).intValue(), this.L, new Runnable() { // from class: t4.c
                            @Override // java.lang.Runnable
                            public final void run() {
                                d.L0(k.d.this);
                            }
                        });
                        u02 = u0(jVar.a("id"));
                        y02 = y0((List) jVar.a("shuffleOrder"));
                        u02.u0(y02);
                        break;
                    case 16:
                        u0(jVar.a("id")).k0(((Integer) jVar.a("currentIndex")).intValue(), ((Integer) jVar.a("newIndex")).intValue(), this.L, new Runnable() { // from class: t4.a
                            @Override // java.lang.Runnable
                            public final void run() {
                                d.M0(k.d.this);
                            }
                        });
                        u02 = u0(jVar.a("id"));
                        y02 = y0((List) jVar.a("shuffleOrder"));
                        u02.u0(y02);
                        break;
                    case 17:
                        V0(((Integer) jVar.a("contentType")).intValue(), ((Integer) jVar.a("flags")).intValue(), ((Integer) jVar.a("usage")).intValue());
                        hashMap = new HashMap();
                        dVar.a(hashMap);
                        break;
                    case 18:
                        d0((String) jVar.a("type"), ((Boolean) jVar.a("enabled")).booleanValue());
                        hashMap = new HashMap();
                        dVar.a(hashMap);
                        break;
                    case 19:
                        O0(((Double) jVar.a("targetGain")).doubleValue());
                        hashMap = new HashMap();
                        dVar.a(hashMap);
                        break;
                    case 20:
                        hashMap = C0();
                        dVar.a(hashMap);
                        break;
                    case 21:
                        D0(((Integer) jVar.a("bandIndex")).intValue(), ((Double) jVar.a("gain")).doubleValue());
                        hashMap = new HashMap();
                        dVar.a(hashMap);
                        break;
                    default:
                        dVar.c();
                        break;
                }
            } catch (IllegalStateException e7) {
                e7.printStackTrace();
                str = "Illegal state: " + e7.getMessage();
                dVar.b(str, null, null);
                h0();
            } catch (Exception e8) {
                e8.printStackTrace();
                str = "Error: " + e8;
                dVar.b(str, null, null);
                h0();
            }
            h0();
        } catch (Throwable th) {
            h0();
            throw th;
        }
    }

    @Override // r0.v2.d
    public /* synthetic */ void E(boolean z6) {
        x2.j(this, z6);
    }

    @Override // r0.v2.d
    public /* synthetic */ void F(int i7) {
        x2.s(this, i7);
    }

    @Override // r0.v2.d
    public /* synthetic */ void G(v2 v2Var, v2.c cVar) {
        x2.g(this, v2Var, cVar);
    }

    @Override // r0.v2.d
    public void H(v2.e eVar, v2.e eVar2, int i7) {
        g1();
        if (i7 == 0 || i7 == 1) {
            f1();
        }
        g0();
    }

    @Override // r0.v2.d
    public /* synthetic */ void K(boolean z6) {
        x2.h(this, z6);
    }

    @Override // r0.v2.d
    public /* synthetic */ void L() {
        x2.u(this);
    }

    @Override // r0.v2.d
    public /* synthetic */ void M() {
        x2.w(this);
    }

    @Override // r0.v2.d
    public /* synthetic */ void R(float f7) {
        x2.D(this, f7);
    }

    public void R0() {
        if (this.G.p()) {
            this.G.i(false);
            g1();
            k.d dVar = this.f22298r;
            if (dVar != null) {
                dVar.a(new HashMap());
                this.f22298r = null;
            }
        }
    }

    public void S0(k.d dVar) {
        k.d dVar2;
        if (this.G.p()) {
            dVar.a(new HashMap());
            return;
        }
        k.d dVar3 = this.f22298r;
        if (dVar3 != null) {
            dVar3.a(new HashMap());
        }
        this.f22298r = dVar;
        this.G.i(true);
        g1();
        if (this.f22290j != c.completed || (dVar2 = this.f22298r) == null) {
            return;
        }
        dVar2.a(new HashMap());
        this.f22298r = null;
    }

    @Override // r0.v2.d
    public /* synthetic */ void T(v2.b bVar) {
        x2.b(this, bVar);
    }

    public void T0(long j7, Integer num, k.d dVar) {
        c cVar = this.f22290j;
        if (cVar == c.none || cVar == c.loading) {
            dVar.a(new HashMap());
            return;
        }
        Q();
        this.f22294n = Long.valueOf(j7);
        this.f22299s = dVar;
        try {
            this.G.n(num != null ? num.intValue() : this.G.A(), j7);
        } catch (RuntimeException e7) {
            this.f22299s = null;
            this.f22294n = null;
            throw e7;
        }
    }

    @Override // r0.v2.d
    public void V(int i7) {
        if (i7 == 2) {
            h1();
            c cVar = this.f22290j;
            c cVar2 = c.buffering;
            if (cVar != cVar2 && cVar != c.loading) {
                this.f22290j = cVar2;
                g0();
            }
            e1();
            return;
        }
        if (i7 == 3) {
            if (this.G.p()) {
                g1();
            }
            this.f22290j = c.ready;
            g0();
            if (this.f22297q != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("duration", I0() == -9223372036854775807L ? null : Long.valueOf(I0() * 1000));
                this.f22297q.a(hashMap);
                this.f22297q = null;
                t0.e eVar = this.f22304x;
                if (eVar != null) {
                    this.G.F(eVar, false);
                    this.f22304x = null;
                }
            }
            if (this.f22299s != null) {
                t0();
                return;
            }
            return;
        }
        if (i7 != 4) {
            return;
        }
        c cVar3 = this.f22290j;
        c cVar4 = c.completed;
        if (cVar3 != cVar4) {
            g1();
            this.f22290j = cVar4;
            g0();
        }
        if (this.f22297q != null) {
            this.f22297q.a(new HashMap());
            this.f22297q = null;
            t0.e eVar2 = this.f22304x;
            if (eVar2 != null) {
                this.G.F(eVar2, false);
                this.f22304x = null;
            }
        }
        k.d dVar = this.f22298r;
        if (dVar != null) {
            dVar.a(new HashMap());
            this.f22298r = null;
        }
    }

    @Override // r0.v2.d
    public /* synthetic */ void W(boolean z6, int i7) {
        x2.n(this, z6, i7);
    }

    public void X0(int i7) {
        this.G.X(i7);
    }

    public void Y0(float f7) {
        u2 d7 = this.G.d();
        if (d7.f21049g == f7) {
            return;
        }
        this.G.e(new u2(d7.f21048f, f7));
        A0();
    }

    public void Z0(boolean z6) {
        this.G.r(z6);
    }

    @Override // r0.v2.d
    public /* synthetic */ void a0(boolean z6) {
        x2.x(this, z6);
    }

    @Override // r0.v2.d
    public /* synthetic */ void b(boolean z6) {
        x2.y(this, z6);
    }

    @Override // r0.v2.d
    public void b0(r3 r3Var, int i7) {
        if (this.f22295o != -9223372036854775807L || this.f22296p != null) {
            Integer num = this.f22296p;
            this.G.n(num != null ? num.intValue() : 0, this.f22295o);
            this.f22296p = null;
            this.f22295o = -9223372036854775807L;
        }
        if (f1()) {
            g0();
        }
        if (this.G.T() == 4) {
            try {
                if (this.G.p()) {
                    if (this.E == 0 && this.G.K() > 0) {
                        this.G.n(0, 0L);
                    } else if (this.G.x()) {
                        this.G.s();
                    }
                } else if (this.G.A() < this.G.K()) {
                    r0.t tVar = this.G;
                    tVar.n(tVar.A(), 0L);
                }
            } catch (Exception e7) {
                e7.printStackTrace();
            }
        }
        this.E = this.G.K();
    }

    public void b1(boolean z6) {
        this.G.f(z6);
    }

    @Override // r0.v2.d
    public /* synthetic */ void c0(int i7, int i8) {
        x2.z(this, i7, i8);
    }

    public void c1(float f7) {
        u2 d7 = this.G.d();
        if (d7.f21048f == f7) {
            return;
        }
        this.G.e(new u2(f7, d7.f21049g));
        if (this.G.p()) {
            g1();
        }
        A0();
    }

    public void d1(float f7) {
        this.G.g(f7);
    }

    @Override // r0.v2.d
    public /* synthetic */ void e0(f2 f2Var) {
        x2.l(this, f2Var);
    }

    @Override // r0.v2.d
    public /* synthetic */ void f0(t0.e eVar) {
        x2.a(this, eVar);
    }

    @Override // r0.v2.d
    public /* synthetic */ void i(List list) {
        x2.d(this, list);
    }

    @Override // r0.v2.d
    public void i0(r2 r2Var) {
        int i7;
        r2 r2Var2;
        Integer num;
        int intValue;
        StringBuilder sb;
        String message;
        String str;
        if (r2Var instanceof r) {
            r rVar = (r) r2Var;
            int i8 = rVar.f20897i;
            if (i8 == 0) {
                sb = new StringBuilder();
                sb.append("TYPE_SOURCE: ");
                message = rVar.m().getMessage();
            } else if (i8 != 1) {
                if (i8 != 2) {
                    sb = new StringBuilder();
                    str = "default ExoPlaybackException: ";
                } else {
                    sb = new StringBuilder();
                    str = "TYPE_UNEXPECTED: ";
                }
                sb.append(str);
                message = rVar.n().getMessage();
            } else {
                sb = new StringBuilder();
                sb.append("TYPE_RENDERER: ");
                message = rVar.l().getMessage();
            }
            sb.append(message);
            z4.b.b("AudioPlayer", sb.toString());
            i7 = rVar.f20897i;
            r2Var2 = rVar;
        } else {
            z4.b.b("AudioPlayer", "default PlaybackException: " + r2Var.getMessage());
            i7 = r2Var.f20907f;
            r2Var2 = r2Var;
        }
        U0(String.valueOf(i7), r2Var2.getMessage());
        this.f22303w++;
        if (!this.G.x() || (num = this.K) == null || this.f22303w > 5 || (intValue = num.intValue() + 1) >= this.G.I().t()) {
            return;
        }
        this.G.M(this.J);
        this.G.W();
        this.G.n(intValue, 0L);
    }

    @Override // r0.v2.d
    public /* synthetic */ void j(u2 u2Var) {
        x2.o(this, u2Var);
    }

    @Override // r0.v2.d
    public /* synthetic */ void j0(p pVar) {
        x2.e(this, pVar);
    }

    @Override // r0.v2.d
    public /* synthetic */ void l0(r2 r2Var) {
        x2.q(this, r2Var);
    }

    @Override // r0.v2.d
    public /* synthetic */ void m0(int i7, boolean z6) {
        x2.f(this, i7, z6);
    }

    @Override // r0.v2.d
    public /* synthetic */ void n0(int i7) {
        x2.v(this, i7);
    }

    @Override // r0.v2.d
    public /* synthetic */ void o0(a2 a2Var, int i7) {
        x2.k(this, a2Var, i7);
    }

    @Override // r0.v2.d
    public /* synthetic */ void p0(boolean z6) {
        x2.i(this, z6);
    }

    @Override // r0.v2.d
    public /* synthetic */ void r(z zVar) {
        x2.C(this, zVar);
    }

    @Override // r0.v2.d
    public /* synthetic */ void s(c2.e eVar) {
        x2.c(this, eVar);
    }

    @Override // r0.v2.d
    public void u(j1.a aVar) {
        for (int i7 = 0; i7 < aVar.h(); i7++) {
            a.b g7 = aVar.g(i7);
            if (g7 instanceof n1.c) {
                this.f22301u = (n1.c) g7;
                g0();
            }
        }
    }

    @Override // r0.v2.d
    public /* synthetic */ void z(int i7) {
        x2.p(this, i7);
    }

    public void z0() {
        if (this.f22290j == c.loading) {
            O();
        }
        k.d dVar = this.f22298r;
        if (dVar != null) {
            dVar.a(new HashMap());
            this.f22298r = null;
        }
        this.f22300t.clear();
        this.J = null;
        r0();
        r0.t tVar = this.G;
        if (tVar != null) {
            tVar.a();
            this.G = null;
            this.f22290j = c.none;
            g0();
        }
        this.f22288h.c();
        this.f22289i.c();
    }
}
