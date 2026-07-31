package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.view.Surface;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class ut0 extends jq0 implements vt1, s04 {
    public static final /* synthetic */ int A = 0;

    /* renamed from: h, reason: collision with root package name */
    private final Context f12964h;

    /* renamed from: i, reason: collision with root package name */
    private final ft0 f12965i;

    /* renamed from: j, reason: collision with root package name */
    private final k84 f12966j;

    /* renamed from: k, reason: collision with root package name */
    private final sq0 f12967k;

    /* renamed from: l, reason: collision with root package name */
    private final WeakReference<tq0> f12968l;

    /* renamed from: m, reason: collision with root package name */
    private final x64 f12969m;

    /* renamed from: n, reason: collision with root package name */
    private gy3 f12970n;

    /* renamed from: o, reason: collision with root package name */
    private ByteBuffer f12971o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f12972p;

    /* renamed from: q, reason: collision with root package name */
    private iq0 f12973q;

    /* renamed from: r, reason: collision with root package name */
    private int f12974r;

    /* renamed from: s, reason: collision with root package name */
    private int f12975s;

    /* renamed from: t, reason: collision with root package name */
    private long f12976t;

    /* renamed from: u, reason: collision with root package name */
    private final String f12977u;

    /* renamed from: v, reason: collision with root package name */
    private final int f12978v;

    /* renamed from: x, reason: collision with root package name */
    private final ArrayList<tr1> f12980x;

    /* renamed from: y, reason: collision with root package name */
    private volatile ht0 f12981y;

    /* renamed from: w, reason: collision with root package name */
    private final Object f12979w = new Object();

    /* renamed from: z, reason: collision with root package name */
    private final Set<WeakReference<et0>> f12982z = new HashSet();

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00f4, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.sw.c().b(com.google.android.gms.internal.ads.m10.f8290r1)).booleanValue() == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00fa, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00fd, code lost:
    
        if (r7.f11926i <= 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ff, code lost:
    
        r8 = new com.google.android.gms.internal.ads.lt0(r5, r6, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x010c, code lost:
    
        if (r7.f11927j == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x010e, code lost:
    
        r7 = new com.google.android.gms.internal.ads.kt0(r5, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0116, code lost:
    
        r6 = r5.f12971o;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0118, code lost:
    
        if (r6 == null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x011e, code lost:
    
        if (r6.limit() <= 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0120, code lost:
    
        r6 = new byte[r5.f12971o.limit()];
        r5.f12971o.get(r6);
        r7 = new com.google.android.gms.internal.ads.jt0(r7, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0115, code lost:
    
        r7 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0105, code lost:
    
        r8 = new com.google.android.gms.internal.ads.mt0(r5, r6, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00f8, code lost:
    
        if (r7.f11927j == false) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ut0(Context context, sq0 sq0Var, tq0 tq0Var) {
        final gd1 gd1Var;
        this.f12964h = context;
        this.f12967k = sq0Var;
        this.f12968l = new WeakReference<>(tq0Var);
        ft0 ft0Var = new ft0();
        this.f12965i = ft0Var;
        k84 k84Var = new k84(context);
        this.f12966j = k84Var;
        if (a3.r1.m()) {
            a3.r1.k("OfficialSimpleExoPlayerAdapter initialize ".concat(toString()));
        }
        jq0.f7215f.incrementAndGet();
        nn3 nn3Var = new nn3(context, new pt0(this), null);
        nn3Var.b(k84Var);
        nn3Var.a(ft0Var);
        this.f12970n = nn3Var.c();
        final boolean z6 = false;
        if (!((Boolean) sw.c().b(m10.f8313u1)).booleanValue()) {
            this.f12970n.L(false);
        }
        this.f12970n.F(this);
        this.f12974r = 0;
        this.f12976t = 0L;
        this.f12975s = 0;
        this.f12980x = new ArrayList<>();
        this.f12981y = null;
        this.f12977u = (tq0Var == null || tq0Var.q() == null) ? "" : tq0Var.q();
        this.f12978v = tq0Var != null ? tq0Var.f() : 0;
        final String L = y2.t.q().L(context, tq0Var.l().f10301f);
        if (!this.f12972p || this.f12971o.limit() <= 0) {
            if (((Boolean) sw.c().b(m10.f8327w1)).booleanValue()) {
            }
        } else {
            final byte[] bArr = new byte[this.f12971o.limit()];
            this.f12971o.get(bArr);
            gd1Var = new gd1() { // from class: com.google.android.gms.internal.ads.nt0
                @Override // com.google.android.gms.internal.ads.gd1
                public final he1 zza() {
                    return new b94(bArr);
                }
            };
        }
        this.f12969m = new x64(gd1Var, ((Boolean) sw.c().b(m10.f8248m)).booleanValue() ? new vc4() { // from class: com.google.android.gms.internal.ads.qt0
            @Override // com.google.android.gms.internal.ads.vc4
            public final /* synthetic */ oc4[] a(Uri uri, Map map) {
                return uc4.a(this, uri, map);
            }

            @Override // com.google.android.gms.internal.ads.vc4
            public final oc4[] zza() {
                int i7 = ut0.A;
                return new oc4[]{new j1(0), new a0(0), new e1(0, null)};
            }
        } : new vc4() { // from class: com.google.android.gms.internal.ads.rt0
            @Override // com.google.android.gms.internal.ads.vc4
            public final /* synthetic */ oc4[] a(Uri uri, Map map) {
                return uc4.a(this, uri, map);
            }

            @Override // com.google.android.gms.internal.ads.vc4
            public final oc4[] zza() {
                int i7 = ut0.A;
                return new oc4[]{new j1(0), new a0(0)};
            }
        });
    }

    private final boolean g0() {
        return this.f12981y != null && this.f12981y.y();
    }

    @Override // com.google.android.gms.internal.ads.s04
    public final void A(r04 r04Var, int i7) {
        iq0 iq0Var = this.f12973q;
        if (iq0Var != null) {
            iq0Var.n(i7);
        }
    }

    @Override // com.google.android.gms.internal.ads.jq0
    public final void B(Uri[] uriArr, String str) {
        C(uriArr, str, ByteBuffer.allocate(0), false);
    }

    @Override // com.google.android.gms.internal.ads.jq0
    public final void C(Uri[] uriArr, String str, ByteBuffer byteBuffer, boolean z6) {
        v54 j64Var;
        if (this.f12970n == null) {
            return;
        }
        this.f12971o = byteBuffer;
        this.f12972p = z6;
        int length = uriArr.length;
        if (length == 1) {
            j64Var = d0(uriArr[0]);
        } else {
            v54[] v54VarArr = new v54[length];
            for (int i7 = 0; i7 < uriArr.length; i7++) {
                v54VarArr[i7] = d0(uriArr[i7]);
            }
            j64Var = new j64(false, false, v54VarArr);
        }
        this.f12970n.J(j64Var);
        this.f12970n.G();
        jq0.f7216g.incrementAndGet();
    }

    @Override // com.google.android.gms.internal.ads.jq0
    public final void D() {
        gy3 gy3Var = this.f12970n;
        if (gy3Var != null) {
            gy3Var.I(this);
            this.f12970n.H();
            this.f12970n = null;
            jq0.f7216g.decrementAndGet();
        }
    }

    @Override // com.google.android.gms.internal.ads.jq0
    public final void E(long j7) {
        gy3 gy3Var = this.f12970n;
        gy3Var.a(gy3Var.e(), j7);
    }

    @Override // com.google.android.gms.internal.ads.jq0
    public final void F(int i7) {
        this.f12965i.j(i7);
    }

    @Override // com.google.android.gms.internal.ads.jq0
    public final void G(int i7) {
        this.f12965i.k(i7);
    }

    @Override // com.google.android.gms.internal.ads.jq0
    public final void H(iq0 iq0Var) {
        this.f12973q = iq0Var;
    }

    @Override // com.google.android.gms.internal.ads.jq0
    public final void I(int i7) {
        this.f12965i.l(i7);
    }

    @Override // com.google.android.gms.internal.ads.jq0
    public final void J(int i7) {
        this.f12965i.m(i7);
    }

    @Override // com.google.android.gms.internal.ads.jq0
    public final void K(boolean z6) {
        this.f12970n.K(z6);
    }

    @Override // com.google.android.gms.internal.ads.jq0
    public final void L(boolean z6) {
        if (this.f12970n == null) {
            return;
        }
        int i7 = 0;
        while (true) {
            this.f12970n.b0();
            if (i7 >= 2) {
                return;
            }
            k84 k84Var = this.f12966j;
            f84 d7 = k84Var.h().d();
            d7.o(i7, !z6);
            k84Var.l(d7);
            i7++;
        }
    }

    @Override // com.google.android.gms.internal.ads.jq0
    public final void M(int i7) {
        Iterator<WeakReference<et0>> it = this.f12982z.iterator();
        while (it.hasNext()) {
            et0 et0Var = it.next().get();
            if (et0Var != null) {
                et0Var.u(i7);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.jq0
    public final void N(Surface surface, boolean z6) {
        gy3 gy3Var = this.f12970n;
        if (gy3Var == null) {
            return;
        }
        gy3Var.M(surface);
    }

    @Override // com.google.android.gms.internal.ads.jq0
    public final void O(float f7, boolean z6) {
        gy3 gy3Var = this.f12970n;
        if (gy3Var == null) {
            return;
        }
        gy3Var.N(f7);
    }

    @Override // com.google.android.gms.internal.ads.jq0
    public final void P() {
        this.f12970n.O(false);
    }

    @Override // com.google.android.gms.internal.ads.jq0
    public final boolean Q() {
        return this.f12970n != null;
    }

    @Override // com.google.android.gms.internal.ads.jq0
    public final boolean R() {
        return this.f12970n.Q();
    }

    @Override // com.google.android.gms.internal.ads.jq0
    public final int S() {
        return this.f12975s;
    }

    @Override // com.google.android.gms.internal.ads.jq0
    public final int U() {
        return this.f12970n.a0();
    }

    @Override // com.google.android.gms.internal.ads.jq0
    public final long W() {
        return this.f12970n.c0();
    }

    @Override // com.google.android.gms.internal.ads.jq0
    public final long X() {
        return this.f12974r;
    }

    @Override // com.google.android.gms.internal.ads.jq0
    public final long Y() {
        if (g0() && this.f12981y.x()) {
            return Math.min(this.f12974r, this.f12981y.s());
        }
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.jq0
    public final long Z() {
        return this.f12970n.j();
    }

    @Override // com.google.android.gms.internal.ads.vt1
    public final void a(he1 he1Var, li1 li1Var, boolean z6) {
    }

    @Override // com.google.android.gms.internal.ads.jq0
    public final long a0() {
        return this.f12970n.d0();
    }

    @Override // com.google.android.gms.internal.ads.jq0
    public final long b0() {
        if (g0()) {
            return 0L;
        }
        return this.f12974r;
    }

    @Override // com.google.android.gms.internal.ads.jq0
    public final long c0() {
        if (g0()) {
            return this.f12981y.t();
        }
        synchronized (this.f12979w) {
            while (!this.f12980x.isEmpty()) {
                long j7 = this.f12976t;
                Map<String, List<String>> zza = this.f12980x.remove(0).zza();
                long j8 = 0;
                if (zza != null) {
                    Iterator<Map.Entry<String, List<String>>> it = zza.entrySet().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Map.Entry<String, List<String>> next = it.next();
                        if (next != null) {
                            try {
                                if (next.getKey() != null && w33.c("content-length", next.getKey()) && next.getValue() != null && next.getValue().get(0) != null) {
                                    j8 = Long.parseLong(next.getValue().get(0));
                                    break;
                                }
                            } catch (NumberFormatException unused) {
                                continue;
                            }
                        }
                    }
                }
                this.f12976t = j7 + j8;
            }
        }
        return this.f12976t;
    }

    @Override // com.google.android.gms.internal.ads.s04
    public final void d(r04 r04Var, c0 c0Var, de3 de3Var) {
        tq0 tq0Var = this.f12968l.get();
        if (!((Boolean) sw.c().b(m10.f8290r1)).booleanValue() || tq0Var == null || c0Var == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("audioMime", c0Var.f3659k);
        hashMap.put("audioSampleMime", c0Var.f3660l);
        hashMap.put("audioCodec", c0Var.f3657i);
        tq0Var.t("onMetadataEvent", hashMap);
    }

    final v54 d0(Uri uri) {
        g4 g4Var = new g4();
        g4Var.b(uri);
        zo c7 = g4Var.c();
        x64 x64Var = this.f12969m;
        x64Var.a(this.f12967k.f11924g);
        return x64Var.b(c7);
    }

    @Override // com.google.android.gms.internal.ads.vt1
    public final void e(he1 he1Var, li1 li1Var, boolean z6, int i7) {
        this.f12974r += i7;
    }

    final /* synthetic */ void e0(boolean z6, long j7) {
        iq0 iq0Var = this.f12973q;
        if (iq0Var != null) {
            iq0Var.c(z6, j7);
        }
    }

    final /* synthetic */ xx3[] f0(Handler handler, nb4 nb4Var, i14 i14Var, p74 p74Var, u44 u44Var) {
        Context context = this.f12964h;
        d44 d44Var = d44.f4068a;
        h24 h24Var = new h24(null, new w04[0], false);
        w34 w34Var = w34.f13693a;
        return new xx3[]{new l24(context, w34Var, d44Var, false, handler, i14Var, h24Var), new sa4(this.f12964h, w34Var, d44Var, 0L, false, handler, nb4Var, -1)};
    }

    public final void finalize() {
        jq0.f7215f.decrementAndGet();
        if (a3.r1.m()) {
            a3.r1.k("OfficialSimpleExoPlayerAdapter finalize ".concat(toString()));
        }
    }

    final /* synthetic */ he1 h0(String str, boolean z6) {
        ut0 ut0Var = true != z6 ? null : this;
        sq0 sq0Var = this.f12967k;
        et0 et0Var = new et0(str, ut0Var, sq0Var.f11921d, sq0Var.f11923f, sq0Var.f11926i);
        this.f12982z.add(new WeakReference<>(et0Var));
        return et0Var;
    }

    @Override // com.google.android.gms.internal.ads.vt1
    public final void i(he1 he1Var, li1 li1Var, boolean z6) {
    }

    final /* synthetic */ he1 i0(String str, boolean z6) {
        mj1 mj1Var = new mj1();
        mj1Var.e(str);
        mj1Var.d(true != z6 ? null : this);
        mj1Var.b(this.f12967k.f11921d);
        mj1Var.c(this.f12967k.f11923f);
        mj1Var.a(true);
        return mj1Var.zza();
    }

    final /* synthetic */ he1 j0(gd1 gd1Var) {
        return new ht0(this.f12964h, gd1Var.zza(), this.f12977u, this.f12978v, this, new st0(this), null);
    }

    @Override // com.google.android.gms.internal.ads.s04
    public final void o(r04 r04Var, c0 c0Var, de3 de3Var) {
        tq0 tq0Var = this.f12968l.get();
        if (!((Boolean) sw.c().b(m10.f8290r1)).booleanValue() || tq0Var == null || c0Var == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("frameRate", String.valueOf(c0Var.f3667s));
        hashMap.put("bitRate", String.valueOf(c0Var.f3656h));
        int i7 = c0Var.f3665q;
        int i8 = c0Var.f3666r;
        StringBuilder sb = new StringBuilder(23);
        sb.append(i7);
        sb.append("x");
        sb.append(i8);
        hashMap.put("resolution", sb.toString());
        hashMap.put("videoMime", c0Var.f3659k);
        hashMap.put("videoSampleMime", c0Var.f3660l);
        hashMap.put("videoCodec", c0Var.f3657i);
        tq0Var.t("onMetadataEvent", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.s04
    public final void q(r04 r04Var, c10 c10Var) {
        iq0 iq0Var = this.f12973q;
        if (iq0Var != null) {
            iq0Var.e("onPlayerError", c10Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.s04
    public final void r(r04 r04Var, int i7, long j7) {
        this.f12975s += i7;
    }

    @Override // com.google.android.gms.internal.ads.s04
    public final void u(r04 r04Var, ry0 ry0Var) {
        iq0 iq0Var = this.f12973q;
        if (iq0Var != null) {
            iq0Var.d(ry0Var.f11567a, ry0Var.f11568b);
        }
    }

    @Override // com.google.android.gms.internal.ads.vt1
    public final void v(he1 he1Var, li1 li1Var, boolean z6) {
        if (he1Var instanceof tr1) {
            synchronized (this.f12979w) {
                this.f12980x.add((tr1) he1Var);
            }
        } else if (he1Var instanceof ht0) {
            this.f12981y = (ht0) he1Var;
            final tq0 tq0Var = this.f12968l.get();
            if (((Boolean) sw.c().b(m10.f8290r1)).booleanValue() && tq0Var != null && this.f12981y.v()) {
                final HashMap hashMap = new HashMap();
                hashMap.put("gcacheHit", String.valueOf(this.f12981y.x()));
                hashMap.put("gcacheDownloaded", String.valueOf(this.f12981y.w()));
                a3.g2.f72i.post(new Runnable() { // from class: com.google.android.gms.internal.ads.tt0
                    @Override // java.lang.Runnable
                    public final void run() {
                        tq0 tq0Var2 = tq0.this;
                        Map<String, ?> map = hashMap;
                        int i7 = ut0.A;
                        tq0Var2.t("onGcacheInfoEvent", map);
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.s04
    public final void x(r04 r04Var, Object obj, long j7) {
        iq0 iq0Var = this.f12973q;
        if (iq0Var != null) {
            iq0Var.x();
        }
    }

    @Override // com.google.android.gms.internal.ads.s04
    public final void z(r04 r04Var, k54 k54Var, p54 p54Var, IOException iOException, boolean z6) {
        iq0 iq0Var = this.f12973q;
        if (iq0Var != null) {
            if (this.f12967k.f11929l) {
                iq0Var.b("onLoadException", iOException);
            } else {
                iq0Var.e("onLoadError", iOException);
            }
        }
    }
}
