package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
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
public final class as0 extends jq0 implements im, fk, tn, vf, je {
    public static final /* synthetic */ int B = 0;

    /* renamed from: h, reason: collision with root package name */
    private final Context f2933h;

    /* renamed from: i, reason: collision with root package name */
    private final qr0 f2934i;

    /* renamed from: j, reason: collision with root package name */
    private final cf f2935j;

    /* renamed from: k, reason: collision with root package name */
    private final cf f2936k;

    /* renamed from: l, reason: collision with root package name */
    private final kl f2937l;

    /* renamed from: m, reason: collision with root package name */
    private final sq0 f2938m;

    /* renamed from: n, reason: collision with root package name */
    private me f2939n;

    /* renamed from: o, reason: collision with root package name */
    private ByteBuffer f2940o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f2941p;

    /* renamed from: q, reason: collision with root package name */
    private final WeakReference<tq0> f2942q;

    /* renamed from: r, reason: collision with root package name */
    private iq0 f2943r;

    /* renamed from: s, reason: collision with root package name */
    private int f2944s;

    /* renamed from: t, reason: collision with root package name */
    private int f2945t;

    /* renamed from: u, reason: collision with root package name */
    private long f2946u;

    /* renamed from: v, reason: collision with root package name */
    private final String f2947v;

    /* renamed from: w, reason: collision with root package name */
    private final int f2948w;

    /* renamed from: y, reason: collision with root package name */
    private final ArrayList<cm> f2950y;

    /* renamed from: z, reason: collision with root package name */
    private volatile pr0 f2951z;

    /* renamed from: x, reason: collision with root package name */
    private final Object f2949x = new Object();
    private final Set<WeakReference<nr0>> A = new HashSet();

    public as0(Context context, sq0 sq0Var, tq0 tq0Var) {
        this.f2933h = context;
        this.f2938m = sq0Var;
        this.f2942q = new WeakReference<>(tq0Var);
        qr0 qr0Var = new qr0();
        this.f2934i = qr0Var;
        bj bjVar = bj.f3442a;
        s33 s33Var = a3.g2.f72i;
        in inVar = new in(context, bjVar, 0L, s33Var, this, -1);
        this.f2935j = inVar;
        kg kgVar = new kg(bjVar, null, true, s33Var, this);
        this.f2936k = kgVar;
        gl glVar = new gl(null);
        this.f2937l = glVar;
        if (a3.r1.m()) {
            a3.r1.k("ForkedExoPlayerAdapter initialize ".concat(toString()));
        }
        jq0.f7215f.incrementAndGet();
        me a7 = ne.a(new cf[]{kgVar, inVar}, glVar, qr0Var);
        this.f2939n = a7;
        a7.M0(this);
        this.f2944s = 0;
        this.f2946u = 0L;
        this.f2945t = 0;
        this.f2950y = new ArrayList<>();
        this.f2951z = null;
        this.f2947v = (tq0Var == null || tq0Var.q() == null) ? "" : tq0Var.q();
        this.f2948w = tq0Var != null ? tq0Var.f() : 0;
        if (((Boolean) sw.c().b(m10.f8256n)).booleanValue()) {
            this.f2939n.e();
        }
        if (tq0Var != null && tq0Var.e() > 0) {
            this.f2939n.G0(tq0Var.e());
        }
        if (tq0Var == null || tq0Var.d() <= 0) {
            return;
        }
        this.f2939n.n(tq0Var.d());
    }

    private final boolean k0() {
        return this.f2951z != null && this.f2951z.l();
    }

    @Override // com.google.android.gms.internal.ads.jq0
    public final void B(Uri[] uriArr, String str) {
        C(uriArr, str, ByteBuffer.allocate(0), false);
    }

    @Override // com.google.android.gms.internal.ads.jq0
    public final void C(Uri[] uriArr, String str, ByteBuffer byteBuffer, boolean z6) {
        kk okVar;
        if (this.f2939n == null) {
            return;
        }
        this.f2940o = byteBuffer;
        this.f2941p = z6;
        int length = uriArr.length;
        if (length == 1) {
            okVar = d0(uriArr[0], str);
        } else {
            kk[] kkVarArr = new kk[length];
            for (int i7 = 0; i7 < uriArr.length; i7++) {
                kkVarArr[i7] = d0(uriArr[i7], str);
            }
            okVar = new ok(kkVarArr);
        }
        this.f2939n.K0(okVar);
        jq0.f7216g.incrementAndGet();
    }

    @Override // com.google.android.gms.internal.ads.jq0
    public final void D() {
        me meVar = this.f2939n;
        if (meVar != null) {
            meVar.I0(this);
            this.f2939n.h();
            this.f2939n = null;
            jq0.f7216g.decrementAndGet();
        }
    }

    @Override // com.google.android.gms.internal.ads.jq0
    public final void E(long j7) {
        this.f2939n.J0(j7);
    }

    @Override // com.google.android.gms.internal.ads.jq0
    public final void F(int i7) {
        this.f2934i.f(i7);
    }

    @Override // com.google.android.gms.internal.ads.jq0
    public final void G(int i7) {
        this.f2934i.g(i7);
    }

    @Override // com.google.android.gms.internal.ads.jq0
    public final void H(iq0 iq0Var) {
        this.f2943r = iq0Var;
    }

    @Override // com.google.android.gms.internal.ads.jq0
    public final void I(int i7) {
        this.f2934i.h(i7);
    }

    @Override // com.google.android.gms.internal.ads.jq0
    public final void J(int i7) {
        this.f2934i.i(i7);
    }

    @Override // com.google.android.gms.internal.ads.jq0
    public final void K(boolean z6) {
        this.f2939n.F0(z6);
    }

    @Override // com.google.android.gms.internal.ads.jq0
    public final void L(boolean z6) {
        if (this.f2939n != null) {
            for (int i7 = 0; i7 < 2; i7++) {
                this.f2937l.f(i7, !z6);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.jq0
    public final void M(int i7) {
        Iterator<WeakReference<nr0>> it = this.A.iterator();
        while (it.hasNext()) {
            nr0 nr0Var = it.next().get();
            if (nr0Var != null) {
                nr0Var.h(i7);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.jq0
    public final void N(Surface surface, boolean z6) {
        if (this.f2939n == null) {
            return;
        }
        le leVar = new le(this.f2935j, 1, surface);
        if (z6) {
            this.f2939n.L0(leVar);
        } else {
            this.f2939n.H0(leVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.jq0
    public final void O(float f7, boolean z6) {
        if (this.f2939n == null) {
            return;
        }
        le leVar = new le(this.f2936k, 2, Float.valueOf(f7));
        if (z6) {
            this.f2939n.L0(leVar);
        } else {
            this.f2939n.H0(leVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.jq0
    public final void P() {
        this.f2939n.l();
    }

    @Override // com.google.android.gms.internal.ads.jq0
    public final boolean Q() {
        return this.f2939n != null;
    }

    @Override // com.google.android.gms.internal.ads.jq0
    public final boolean R() {
        return this.f2939n.r();
    }

    @Override // com.google.android.gms.internal.ads.jq0
    public final int S() {
        return this.f2945t;
    }

    @Override // com.google.android.gms.internal.ads.jq0
    public final int U() {
        return this.f2939n.zza();
    }

    @Override // com.google.android.gms.internal.ads.jq0
    public final long W() {
        return this.f2939n.a();
    }

    @Override // com.google.android.gms.internal.ads.jq0
    public final long X() {
        return this.f2944s;
    }

    @Override // com.google.android.gms.internal.ads.jq0
    public final long Y() {
        if (k0() && this.f2951z.k()) {
            return Math.min(this.f2944s, this.f2951z.a());
        }
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.jq0
    public final long Z() {
        return this.f2939n.c();
    }

    @Override // com.google.android.gms.internal.ads.jq0
    public final long a0() {
        return this.f2939n.g();
    }

    @Override // com.google.android.gms.internal.ads.je
    public final void b() {
    }

    @Override // com.google.android.gms.internal.ads.jq0
    public final long b0() {
        if (k0()) {
            return 0L;
        }
        return this.f2944s;
    }

    @Override // com.google.android.gms.internal.ads.je
    public final void c(boolean z6) {
    }

    @Override // com.google.android.gms.internal.ads.jq0
    public final long c0() {
        if (k0()) {
            return this.f2951z.f();
        }
        synchronized (this.f2949x) {
            while (!this.f2950y.isEmpty()) {
                long j7 = this.f2946u;
                Map<String, List<String>> b7 = this.f2950y.remove(0).b();
                long j8 = 0;
                if (b7 != null) {
                    Iterator<Map.Entry<String, List<String>>> it = b7.entrySet().iterator();
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
                this.f2946u = j7 + j8;
            }
        }
        return this.f2946u;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0045, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.sw.c().b(com.google.android.gms.internal.ads.m10.f8290r1)).booleanValue() == false) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final kk d0(Uri uri, final String str) {
        final sl slVar;
        sl slVar2;
        if (!this.f2941p || this.f2940o.limit() <= 0) {
            final boolean z6 = true;
            if (((Boolean) sw.c().b(m10.f8327w1)).booleanValue()) {
            }
            if (this.f2938m.f11927j) {
                z6 = false;
            }
            slVar = this.f2938m.f11926i > 0 ? new sl() { // from class: com.google.android.gms.internal.ads.vr0
                @Override // com.google.android.gms.internal.ads.sl
                public final tl zza() {
                    return as0.this.e0(str, z6);
                }
            } : new sl() { // from class: com.google.android.gms.internal.ads.wr0
                @Override // com.google.android.gms.internal.ads.sl
                public final tl zza() {
                    return as0.this.f0(str, z6);
                }
            };
            if (this.f2938m.f11927j) {
                slVar = new sl() { // from class: com.google.android.gms.internal.ads.ur0
                    @Override // com.google.android.gms.internal.ads.sl
                    public final tl zza() {
                        return as0.this.g0(slVar);
                    }
                };
            }
            ByteBuffer byteBuffer = this.f2940o;
            if (byteBuffer != null && byteBuffer.limit() > 0) {
                final byte[] bArr = new byte[this.f2940o.limit()];
                this.f2940o.get(bArr);
                slVar2 = new sl() { // from class: com.google.android.gms.internal.ads.tr0
                    @Override // com.google.android.gms.internal.ads.sl
                    public final tl zza() {
                        sl slVar3 = sl.this;
                        byte[] bArr2 = bArr;
                        int i7 = as0.B;
                        return new bs0(new rl(bArr2), bArr2.length, slVar3.zza());
                    }
                };
                eh ehVar = !((Boolean) sw.c().b(m10.f8248m)).booleanValue() ? new eh() { // from class: com.google.android.gms.internal.ads.rr0
                    @Override // com.google.android.gms.internal.ads.eh
                    public final ch[] zza() {
                        int i7 = as0.B;
                        return new ch[]{new qi(), new vh(0), new mi(0, null, null)};
                    }
                } : new eh() { // from class: com.google.android.gms.internal.ads.sr0
                    @Override // com.google.android.gms.internal.ads.eh
                    public final ch[] zza() {
                        int i7 = as0.B;
                        return new ch[]{new qi(), new vh(0)};
                    }
                };
                sq0 sq0Var = this.f2938m;
                return new gk(uri, slVar2, ehVar, sq0Var.f11928k, a3.g2.f72i, this, null, sq0Var.f11924g);
            }
        } else {
            final byte[] bArr2 = new byte[this.f2940o.limit()];
            this.f2940o.get(bArr2);
            slVar = new sl() { // from class: com.google.android.gms.internal.ads.xr0
                @Override // com.google.android.gms.internal.ads.sl
                public final tl zza() {
                    return new rl(bArr2);
                }
            };
        }
        slVar2 = slVar;
        eh ehVar2 = !((Boolean) sw.c().b(m10.f8248m)).booleanValue() ? new eh() { // from class: com.google.android.gms.internal.ads.rr0
            @Override // com.google.android.gms.internal.ads.eh
            public final ch[] zza() {
                int i7 = as0.B;
                return new ch[]{new qi(), new vh(0), new mi(0, null, null)};
            }
        } : new eh() { // from class: com.google.android.gms.internal.ads.sr0
            @Override // com.google.android.gms.internal.ads.eh
            public final ch[] zza() {
                int i7 = as0.B;
                return new ch[]{new qi(), new vh(0)};
            }
        };
        sq0 sq0Var2 = this.f2938m;
        return new gk(uri, slVar2, ehVar2, sq0Var2.f11928k, a3.g2.f72i, this, null, sq0Var2.f11924g);
    }

    final /* synthetic */ tl e0(String str, boolean z6) {
        as0 as0Var = true != z6 ? null : this;
        sq0 sq0Var = this.f2938m;
        nr0 nr0Var = new nr0(str, as0Var, sq0Var.f11921d, sq0Var.f11923f, sq0Var.f11926i);
        this.A.add(new WeakReference<>(nr0Var));
        return nr0Var;
    }

    @Override // com.google.android.gms.internal.ads.je
    public final void f(al alVar, ml mlVar) {
    }

    final /* synthetic */ tl f0(String str, boolean z6) {
        as0 as0Var = true != z6 ? null : this;
        sq0 sq0Var = this.f2938m;
        return new yl(str, null, as0Var, sq0Var.f11921d, sq0Var.f11923f, true, null);
    }

    public final void finalize() {
        jq0.f7215f.decrementAndGet();
        if (a3.r1.m()) {
            a3.r1.k("ForkedExoPlayerAdapter finalize ".concat(toString()));
        }
    }

    @Override // com.google.android.gms.internal.ads.fk
    public final void g(IOException iOException) {
        iq0 iq0Var = this.f2943r;
        if (iq0Var != null) {
            if (this.f2938m.f11929l) {
                iq0Var.b("onLoadException", iOException);
            } else {
                iq0Var.e("onLoadError", iOException);
            }
        }
    }

    final /* synthetic */ tl g0(sl slVar) {
        return new pr0(this.f2933h, slVar.zza(), this.f2947v, this.f2948w, this, new yr0(this), null);
    }

    @Override // com.google.android.gms.internal.ads.je
    public final void h(Cif cif, Object obj) {
    }

    final /* synthetic */ void h0(boolean z6, long j7) {
        iq0 iq0Var = this.f2943r;
        if (iq0Var != null) {
            iq0Var.c(z6, j7);
        }
    }

    public final void i0(tl tlVar, int i7) {
        this.f2944s += i7;
    }

    @Override // com.google.android.gms.internal.ads.tn
    public final void j(xe xeVar) {
        tq0 tq0Var = this.f2942q.get();
        if (!((Boolean) sw.c().b(m10.f8290r1)).booleanValue() || tq0Var == null || xeVar == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("frameRate", String.valueOf(xeVar.f14171q));
        hashMap.put("bitRate", String.valueOf(xeVar.f14161g));
        int i7 = xeVar.f14169o;
        int i8 = xeVar.f14170p;
        StringBuilder sb = new StringBuilder(23);
        sb.append(i7);
        sb.append("x");
        sb.append(i8);
        hashMap.put("resolution", sb.toString());
        hashMap.put("videoMime", xeVar.f14164j);
        hashMap.put("videoSampleMime", xeVar.f14165k);
        hashMap.put("videoCodec", xeVar.f14162h);
        tq0Var.t("onMetadataEvent", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.im
    /* renamed from: j0, reason: merged with bridge method [inline-methods] */
    public final void k(tl tlVar, vl vlVar) {
        if (tlVar instanceof cm) {
            synchronized (this.f2949x) {
                this.f2950y.add((cm) tlVar);
            }
        } else if (tlVar instanceof pr0) {
            this.f2951z = (pr0) tlVar;
            final tq0 tq0Var = this.f2942q.get();
            if (((Boolean) sw.c().b(m10.f8290r1)).booleanValue() && tq0Var != null && this.f2951z.i()) {
                final HashMap hashMap = new HashMap();
                hashMap.put("gcacheHit", String.valueOf(this.f2951z.k()));
                hashMap.put("gcacheDownloaded", String.valueOf(this.f2951z.j()));
                a3.g2.f72i.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zr0
                    @Override // java.lang.Runnable
                    public final void run() {
                        tq0 tq0Var2 = tq0.this;
                        Map<String, ?> map = hashMap;
                        int i7 = as0.B;
                        tq0Var2.t("onGcacheInfoEvent", map);
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.je
    public final void l(ie ieVar) {
        iq0 iq0Var = this.f2943r;
        if (iq0Var != null) {
            iq0Var.e("onPlayerError", ieVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.tn
    public final void m(int i7, int i8, int i9, float f7) {
        iq0 iq0Var = this.f2943r;
        if (iq0Var != null) {
            iq0Var.d(i7, i8);
        }
    }

    @Override // com.google.android.gms.internal.ads.je
    public final void n(bf bfVar) {
    }

    @Override // com.google.android.gms.internal.ads.im
    public final /* synthetic */ void p(Object obj, int i7) {
        this.f2944s += i7;
    }

    @Override // com.google.android.gms.internal.ads.tn
    public final void s(int i7, long j7) {
        this.f2945t += i7;
    }

    @Override // com.google.android.gms.internal.ads.je
    public final void t(boolean z6, int i7) {
        iq0 iq0Var = this.f2943r;
        if (iq0Var != null) {
            iq0Var.n(i7);
        }
    }

    @Override // com.google.android.gms.internal.ads.tn
    public final void w(Surface surface) {
        iq0 iq0Var = this.f2943r;
        if (iq0Var != null) {
            iq0Var.x();
        }
    }

    @Override // com.google.android.gms.internal.ads.vf
    public final void y(xe xeVar) {
        tq0 tq0Var = this.f2942q.get();
        if (!((Boolean) sw.c().b(m10.f8290r1)).booleanValue() || tq0Var == null || xeVar == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("audioMime", xeVar.f14164j);
        hashMap.put("audioSampleMime", xeVar.f14165k);
        hashMap.put("audioCodec", xeVar.f14162h);
        tq0Var.t("onMetadataEvent", hashMap);
    }
}
