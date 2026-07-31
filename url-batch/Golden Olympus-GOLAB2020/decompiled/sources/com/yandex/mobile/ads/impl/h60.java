package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.AudioTrack;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import com.ironsource.b9;
import com.yandex.mobile.ads.impl.C1880dh;
import com.yandex.mobile.ads.impl.C1952gh;
import com.yandex.mobile.ads.impl.d60;
import com.yandex.mobile.ads.impl.dw0;
import com.yandex.mobile.ads.impl.f12;
import com.yandex.mobile.ads.impl.fi1;
import com.yandex.mobile.ads.impl.gw0;
import com.yandex.mobile.ads.impl.h60;
import com.yandex.mobile.ads.impl.ir0;
import com.yandex.mobile.ads.impl.j60;
import com.yandex.mobile.ads.impl.p22;
import com.yandex.mobile.ads.impl.uv0;
import com.yandex.mobile.ads.impl.x42;
import com.yandex.mobile.ads.impl.xx1;
import com.yandex.mobile.ads.impl.zh1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;

/* loaded from: classes3.dex */
final class h60 extends AbstractC2395zj implements d60 {

    /* renamed from: A, reason: collision with root package name */
    private int f26568A;

    /* renamed from: B, reason: collision with root package name */
    private int f26569B;

    /* renamed from: C, reason: collision with root package name */
    private boolean f26570C;

    /* renamed from: D, reason: collision with root package name */
    private int f26571D;

    /* renamed from: E, reason: collision with root package name */
    private xx1 f26572E;

    /* renamed from: F, reason: collision with root package name */
    private zh1.a f26573F;

    /* renamed from: G, reason: collision with root package name */
    private uv0 f26574G;

    /* renamed from: H, reason: collision with root package name */
    private AudioTrack f26575H;

    /* renamed from: I, reason: collision with root package name */
    private Object f26576I;

    /* renamed from: J, reason: collision with root package name */
    private Surface f26577J;

    /* renamed from: K, reason: collision with root package name */
    private TextureView f26578K;

    /* renamed from: L, reason: collision with root package name */
    private int f26579L;

    /* renamed from: M, reason: collision with root package name */
    private int f26580M;

    /* renamed from: N, reason: collision with root package name */
    private int f26581N;

    /* renamed from: O, reason: collision with root package name */
    private int f26582O;

    /* renamed from: P, reason: collision with root package name */
    private C1856ch f26583P;

    /* renamed from: Q, reason: collision with root package name */
    private float f26584Q;

    /* renamed from: R, reason: collision with root package name */
    private boolean f26585R;

    /* renamed from: S, reason: collision with root package name */
    private boolean f26586S;

    /* renamed from: T, reason: collision with root package name */
    private boolean f26587T;

    /* renamed from: U, reason: collision with root package name */
    private x00 f26588U;

    /* renamed from: V, reason: collision with root package name */
    private uv0 f26589V;

    /* renamed from: W, reason: collision with root package name */
    private rh1 f26590W;

    /* renamed from: X, reason: collision with root package name */
    private int f26591X;

    /* renamed from: Y, reason: collision with root package name */
    private long f26592Y;

    /* renamed from: b, reason: collision with root package name */
    final v52 f26593b;

    /* renamed from: c, reason: collision with root package name */
    final zh1.a f26594c;

    /* renamed from: d, reason: collision with root package name */
    private final vq f26595d;

    /* renamed from: e, reason: collision with root package name */
    private final zh1 f26596e;

    /* renamed from: f, reason: collision with root package name */
    private final so1[] f26597f;

    /* renamed from: g, reason: collision with root package name */
    private final u52 f26598g;

    /* renamed from: h, reason: collision with root package name */
    private final we0 f26599h;

    /* renamed from: i, reason: collision with root package name */
    private final j60 f26600i;

    /* renamed from: j, reason: collision with root package name */
    private final ir0<zh1.b> f26601j;

    /* renamed from: k, reason: collision with root package name */
    private final CopyOnWriteArraySet<d60.a> f26602k;

    /* renamed from: l, reason: collision with root package name */
    private final x42.b f26603l;

    /* renamed from: m, reason: collision with root package name */
    private final ArrayList f26604m;

    /* renamed from: n, reason: collision with root package name */
    private final boolean f26605n;

    /* renamed from: o, reason: collision with root package name */
    private final dw0.a f26606o;

    /* renamed from: p, reason: collision with root package name */
    private final InterfaceC2296vc f26607p;

    /* renamed from: q, reason: collision with root package name */
    private final Looper f26608q;

    /* renamed from: r, reason: collision with root package name */
    private final InterfaceC1881di f26609r;

    /* renamed from: s, reason: collision with root package name */
    private final n32 f26610s;

    /* renamed from: t, reason: collision with root package name */
    private final b f26611t;

    /* renamed from: u, reason: collision with root package name */
    private final C1880dh f26612u;

    /* renamed from: v, reason: collision with root package name */
    private final C1952gh f26613v;

    /* renamed from: w, reason: collision with root package name */
    private final p22 f26614w;

    /* renamed from: x, reason: collision with root package name */
    private final xi2 f26615x;

    /* renamed from: y, reason: collision with root package name */
    private final xj2 f26616y;

    /* renamed from: z, reason: collision with root package name */
    private final long f26617z;

    private static final class a {
        public static ei1 a(Context context, h60 h60Var, boolean z4) {
            LogSessionId logSessionId;
            vv0 a4 = vv0.a(context);
            if (a4 == null) {
                ms0.d("ExoPlayerImpl", "MediaMetricsService unavailable.");
                logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
                return new ei1(logSessionId);
            }
            if (z4) {
                h60Var.getClass();
                h60Var.f26607p.a(a4);
            }
            return new ei1(a4.b());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class b implements kf2, InterfaceC1999ih, i42, a01, SurfaceHolder.Callback, TextureView.SurfaceTextureListener, f12.b, C1952gh.b, C1880dh.b, p22.a, d60.a {
        public final void a(int i4) {
            h60 h60Var = h60.this;
            h60Var.j();
            boolean z4 = h60Var.f26590W.f31203l;
            h60 h60Var2 = h60.this;
            int i5 = 1;
            if (z4 && i4 != 1) {
                i5 = 2;
            }
            h60Var2.a(i4, i5, z4);
        }

        @Override // com.yandex.mobile.ads.impl.i42
        public final void onCues(final List<uu> list) {
            ir0 ir0Var = h60.this.f26601j;
            ir0Var.a(27, new ir0.a() { // from class: com.yandex.mobile.ads.impl.X5
                @Override // com.yandex.mobile.ads.impl.ir0.a
                public final void invoke(Object obj) {
                    ((zh1.b) obj).onCues(list);
                }
            });
            ir0Var.a();
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC1999ih
        public final void onSkipSilenceEnabledChanged(final boolean z4) {
            h60 h60Var = h60.this;
            if (h60Var.f26585R == z4) {
                return;
            }
            h60Var.f26585R = z4;
            ir0 ir0Var = h60Var.f26601j;
            ir0Var.a(23, new ir0.a() { // from class: com.yandex.mobile.ads.impl.U5
                @Override // com.yandex.mobile.ads.impl.ir0.a
                public final void invoke(Object obj) {
                    ((zh1.b) obj).onSkipSilenceEnabledChanged(z4);
                }
            });
            ir0Var.a();
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i4, int i5) {
            h60.this.a(surfaceTexture);
            h60.this.a(i4, i5);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            h60.this.a((Surface) null);
            h60.this.a(0, 0);
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i4, int i5) {
            h60.this.a(i4, i5);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceChanged(SurfaceHolder surfaceHolder, int i4, int i5, int i6) {
            h60.this.a(i5, i6);
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceCreated(SurfaceHolder surfaceHolder) {
            h60.this.getClass();
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            h60.this.getClass();
            h60.this.a(0, 0);
        }

        private b() {
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC1999ih
        public final void b(Exception exc) {
            h60.this.f26607p.b(exc);
        }

        public final void c() {
            h60.this.a(-1, 3, false);
        }

        public final void d() {
            final x00 a4 = h60.a(h60.this.f26614w);
            if (a4.equals(h60.this.f26588U)) {
                return;
            }
            h60 h60Var = h60.this;
            h60Var.f26588U = a4;
            ir0 ir0Var = h60Var.f26601j;
            ir0Var.a(29, new ir0.a() { // from class: com.yandex.mobile.ads.impl.Y5
                @Override // com.yandex.mobile.ads.impl.ir0.a
                public final void invoke(Object obj) {
                    ((zh1.b) obj).a(x00.this);
                }
            });
            ir0Var.a();
        }

        public final void e() {
            h60 h60Var = h60.this;
            h60Var.a(1, 2, Float.valueOf(h60Var.f26584Q * h60Var.f26613v.b()));
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC1999ih
        public final void b(String str, long j4, long j5) {
            h60.this.f26607p.b(str, j4, j5);
        }

        @Override // com.yandex.mobile.ads.impl.kf2
        public final void c(Exception exc) {
            h60.this.f26607p.c(exc);
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC1999ih
        public final void b(String str) {
            h60.this.f26607p.b(str);
        }

        @Override // com.yandex.mobile.ads.impl.kf2
        public final void c(ey eyVar) {
            h60.this.f26607p.c(eyVar);
            h60.this.getClass();
            h60.this.getClass();
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC1999ih
        public final void b(ey eyVar) {
            h60.this.getClass();
            h60.this.f26607p.b(eyVar);
        }

        @Override // com.yandex.mobile.ads.impl.kf2
        public final void b(int i4, long j4) {
            h60.this.f26607p.b(i4, j4);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(zh1.b bVar) {
            bVar.a(h60.this.f26574G);
        }

        @Override // com.yandex.mobile.ads.impl.kf2
        public final void b(yb0 yb0Var, iy iyVar) {
            h60.this.getClass();
            h60.this.f26607p.b(yb0Var, iyVar);
        }

        @Override // com.yandex.mobile.ads.impl.kf2
        public final void d(ey eyVar) {
            h60.this.getClass();
            h60.this.f26607p.d(eyVar);
        }

        @Override // com.yandex.mobile.ads.impl.f12.b
        public final void b() {
            h60.this.a((Surface) null);
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC1999ih
        public final void a(ey eyVar) {
            h60.this.f26607p.a(eyVar);
            h60.this.getClass();
            h60.this.getClass();
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC1999ih
        public final void a(yb0 yb0Var, iy iyVar) {
            h60.this.getClass();
            h60.this.f26607p.a(yb0Var, iyVar);
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC1999ih
        public final void a(long j4) {
            h60.this.f26607p.a(j4);
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC1999ih
        public final void a(Exception exc) {
            h60.this.f26607p.a(exc);
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC1999ih
        public final void a(int i4, long j4, long j5) {
            h60.this.f26607p.a(i4, j4, j5);
        }

        @Override // com.yandex.mobile.ads.impl.i42
        public final void a(final wu wuVar) {
            h60.this.getClass();
            ir0 ir0Var = h60.this.f26601j;
            ir0Var.a(27, new ir0.a() { // from class: com.yandex.mobile.ads.impl.A6
                @Override // com.yandex.mobile.ads.impl.ir0.a
                public final void invoke(Object obj) {
                    ((zh1.b) obj).a(wu.this);
                }
            });
            ir0Var.a();
        }

        @Override // com.yandex.mobile.ads.impl.d60.a
        public final void a() {
            h60.this.i();
        }

        @Override // com.yandex.mobile.ads.impl.a01
        public final void a(final wz0 wz0Var) {
            h60 h60Var = h60.this;
            uv0.a a4 = h60Var.f26589V.a();
            for (int i4 = 0; i4 < wz0Var.c(); i4++) {
                wz0Var.a(i4).a(a4);
            }
            h60Var.f26589V = a4.a();
            h60 h60Var2 = h60.this;
            h60Var2.j();
            x42 x42Var = h60Var2.f26590W.f31192a;
            uv0 a5 = x42Var.c() ? h60Var2.f26589V : h60Var2.f26589V.a().a(x42Var.a(h60Var2.getCurrentMediaItemIndex(), h60Var2.f35608a, 0L).f34420d.f31381e).a();
            if (!a5.equals(h60.this.f26574G)) {
                h60 h60Var3 = h60.this;
                h60Var3.f26574G = a5;
                h60Var3.f26601j.a(14, new ir0.a() { // from class: com.yandex.mobile.ads.impl.S5
                    @Override // com.yandex.mobile.ads.impl.ir0.a
                    public final void invoke(Object obj) {
                        h60.b.this.a((zh1.b) obj);
                    }
                });
            }
            h60.this.f26601j.a(28, new ir0.a() { // from class: com.yandex.mobile.ads.impl.T5
                @Override // com.yandex.mobile.ads.impl.ir0.a
                public final void invoke(Object obj) {
                    ((zh1.b) obj).a(wz0.this);
                }
            });
            h60.this.f26601j.a();
        }

        @Override // com.yandex.mobile.ads.impl.kf2
        public final void a(Object obj, long j4) {
            h60.this.f26607p.a(obj, j4);
            h60 h60Var = h60.this;
            if (h60Var.f26576I == obj) {
                ir0 ir0Var = h60Var.f26601j;
                ir0Var.a(26, new ir0.a() { // from class: com.yandex.mobile.ads.impl.V5
                    @Override // com.yandex.mobile.ads.impl.ir0.a
                    public final void invoke(Object obj2) {
                        ((zh1.b) obj2).onRenderedFirstFrame();
                    }
                });
                ir0Var.a();
            }
        }

        public final void a(final boolean z4, final int i4) {
            ir0 ir0Var = h60.this.f26601j;
            ir0Var.a(30, new ir0.a() { // from class: com.yandex.mobile.ads.impl.W5
                @Override // com.yandex.mobile.ads.impl.ir0.a
                public final void invoke(Object obj) {
                    zh1.b bVar = (zh1.b) obj;
                    bVar.a(z4, i4);
                }
            });
            ir0Var.a();
        }

        @Override // com.yandex.mobile.ads.impl.kf2
        public final void a(String str, long j4, long j5) {
            h60.this.f26607p.a(str, j4, j5);
        }

        @Override // com.yandex.mobile.ads.impl.kf2
        public final void a(String str) {
            h60.this.f26607p.a(str);
        }

        @Override // com.yandex.mobile.ads.impl.kf2
        public final void a(int i4, long j4) {
            h60.this.f26607p.a(i4, j4);
        }

        @Override // com.yandex.mobile.ads.impl.kf2
        public final void a(final rf2 rf2Var) {
            h60.this.getClass();
            ir0 ir0Var = h60.this.f26601j;
            ir0Var.a(25, new ir0.a() { // from class: com.yandex.mobile.ads.impl.Z5
                @Override // com.yandex.mobile.ads.impl.ir0.a
                public final void invoke(Object obj) {
                    ((zh1.b) obj).a(rf2.this);
                }
            });
            ir0Var.a();
        }

        @Override // com.yandex.mobile.ads.impl.f12.b
        public final void a(Surface surface) {
            h60.this.a(surface);
        }
    }

    private static final class c implements he2, fn, fi1.b {

        /* renamed from: b, reason: collision with root package name */
        private he2 f26619b;

        /* renamed from: c, reason: collision with root package name */
        private fn f26620c;

        /* renamed from: d, reason: collision with root package name */
        private he2 f26621d;

        /* renamed from: e, reason: collision with root package name */
        private fn f26622e;

        @Override // com.yandex.mobile.ads.impl.fi1.b
        public final void a(int i4, Object obj) {
            if (i4 == 7) {
                this.f26619b = (he2) obj;
                return;
            }
            if (i4 == 8) {
                this.f26620c = (fn) obj;
                return;
            }
            if (i4 != 10000) {
                return;
            }
            f12 f12Var = (f12) obj;
            if (f12Var == null) {
                this.f26621d = null;
                this.f26622e = null;
            } else {
                this.f26621d = f12Var.b();
                this.f26622e = f12Var.a();
            }
        }

        @Override // com.yandex.mobile.ads.impl.fn
        public final void f() {
            fn fnVar = this.f26622e;
            if (fnVar != null) {
                fnVar.f();
            }
            fn fnVar2 = this.f26620c;
            if (fnVar2 != null) {
                fnVar2.f();
            }
        }

        private c() {
        }

        @Override // com.yandex.mobile.ads.impl.fn
        public final void a(long j4, float[] fArr) {
            fn fnVar = this.f26622e;
            if (fnVar != null) {
                fnVar.a(j4, fArr);
            }
            fn fnVar2 = this.f26620c;
            if (fnVar2 != null) {
                fnVar2.a(j4, fArr);
            }
        }

        @Override // com.yandex.mobile.ads.impl.he2
        public final void a(long j4, long j5, yb0 yb0Var, MediaFormat mediaFormat) {
            long j6;
            long j7;
            yb0 yb0Var2;
            MediaFormat mediaFormat2;
            he2 he2Var = this.f26621d;
            if (he2Var != null) {
                he2Var.a(j4, j5, yb0Var, mediaFormat);
                mediaFormat2 = mediaFormat;
                yb0Var2 = yb0Var;
                j7 = j5;
                j6 = j4;
            } else {
                j6 = j4;
                j7 = j5;
                yb0Var2 = yb0Var;
                mediaFormat2 = mediaFormat;
            }
            he2 he2Var2 = this.f26619b;
            if (he2Var2 != null) {
                he2Var2.a(j6, j7, yb0Var2, mediaFormat2);
            }
        }
    }

    private static final class d implements fw0 {

        /* renamed from: a, reason: collision with root package name */
        private final Object f26623a;

        /* renamed from: b, reason: collision with root package name */
        private x42 f26624b;

        public d(x42 x42Var, Object obj) {
            this.f26623a = obj;
            this.f26624b = x42Var;
        }

        @Override // com.yandex.mobile.ads.impl.fw0
        public final x42 b() {
            return this.f26624b;
        }

        @Override // com.yandex.mobile.ads.impl.fw0
        public final Object a() {
            return this.f26623a;
        }
    }

    static {
        k60.a("goog.exo.exoplayer");
    }

    @SuppressLint({"HandlerLeak"})
    public h60(d60.b bVar) {
        vq vqVar = new vq();
        this.f26595d = vqVar;
        try {
            ms0.c("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [ExoPlayerLib/2.18.1] [" + u82.f32877e + b9.i.f15552e);
            Context applicationContext = bVar.f24443a.getApplicationContext();
            InterfaceC2296vc apply = bVar.f24450h.apply(bVar.f24444b);
            this.f26607p = apply;
            C1856ch c1856ch = bVar.f24452j;
            this.f26583P = c1856ch;
            this.f26579L = bVar.f24453k;
            this.f26585R = false;
            this.f26617z = bVar.f24458p;
            b bVar2 = new b();
            this.f26611t = bVar2;
            Object cVar = new c();
            Handler handler = new Handler(bVar.f24451i);
            so1[] a4 = bVar.f24445c.get().a(handler, bVar2, bVar2, bVar2, bVar2);
            this.f26597f = a4;
            C2253tf.b(a4.length > 0);
            u52 u52Var = bVar.f24447e.get();
            this.f26598g = u52Var;
            this.f26606o = bVar.f24446d.get();
            InterfaceC1881di interfaceC1881di = bVar.f24449g.get();
            this.f26609r = interfaceC1881di;
            this.f26605n = bVar.f24454l;
            uw1 uw1Var = bVar.f24455m;
            Looper looper = bVar.f24451i;
            this.f26608q = looper;
            n32 n32Var = bVar.f24444b;
            this.f26610s = n32Var;
            this.f26596e = this;
            this.f26601j = new ir0<>(looper, n32Var, new ir0.b() { // from class: com.yandex.mobile.ads.impl.M5
                @Override // com.yandex.mobile.ads.impl.ir0.b
                public final void a(Object obj, qb0 qb0Var) {
                    h60.this.a((zh1.b) obj, qb0Var);
                }
            });
            this.f26602k = new CopyOnWriteArraySet<>();
            this.f26604m = new ArrayList();
            this.f26572E = new xx1.a();
            v52 v52Var = new v52(new uo1[a4.length], new x60[a4.length], q62.f30688c, null);
            this.f26593b = v52Var;
            this.f26603l = new x42.b();
            zh1.a a5 = new zh1.a.C0208a().a(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 22, 23, 24, 25, 26, 27, 28).a(u52Var.c(), 29).a();
            this.f26594c = a5;
            this.f26573F = new zh1.a.C0208a().a(a5).a(4).a(10).a();
            this.f26599h = n32Var.a(looper, null);
            j60.e eVar = new j60.e() { // from class: com.yandex.mobile.ads.impl.N5
                @Override // com.yandex.mobile.ads.impl.j60.e
                public final void a(j60.d dVar) {
                    h60.this.b(dVar);
                }
            };
            this.f26590W = rh1.a(v52Var);
            apply.a(this, looper);
            int i4 = u82.f32873a;
            this.f26600i = new j60(a4, u52Var, v52Var, bVar.f24448f.get(), interfaceC1881di, 0, apply, uw1Var, bVar.f24456n, bVar.f24457o, looper, n32Var, eVar, i4 < 31 ? new ei1() : a.a(applicationContext, this, bVar.f24459q));
            this.f26584Q = 1.0f;
            uv0 uv0Var = uv0.f33360H;
            this.f26574G = uv0Var;
            this.f26589V = uv0Var;
            this.f26591X = -1;
            if (i4 < 21) {
                this.f26582O = f();
            } else {
                this.f26582O = u82.a(applicationContext);
            }
            int i5 = wu.f34183b;
            this.f26586S = true;
            b(apply);
            interfaceC1881di.a(new Handler(looper), apply);
            a(bVar2);
            C1880dh c1880dh = new C1880dh(bVar.f24443a, handler, bVar2);
            this.f26612u = c1880dh;
            c1880dh.a();
            C1952gh c1952gh = new C1952gh(bVar.f24443a, handler, bVar2);
            this.f26613v = c1952gh;
            c1952gh.d();
            p22 p22Var = new p22(bVar.f24443a, handler, bVar2);
            this.f26614w = p22Var;
            p22Var.a(u82.c(c1856ch.f24210d));
            xi2 xi2Var = new xi2(bVar.f24443a);
            this.f26615x = xi2Var;
            xi2Var.a();
            xj2 xj2Var = new xj2(bVar.f24443a);
            this.f26616y = xj2Var;
            xj2Var.a();
            this.f26588U = a(p22Var);
            int i6 = rf2.f31176f;
            u52Var.a(this.f26583P);
            a(1, 10, Integer.valueOf(this.f26582O));
            a(2, 10, Integer.valueOf(this.f26582O));
            a(1, 3, this.f26583P);
            a(2, 4, Integer.valueOf(this.f26579L));
            a(2, 5, (Object) 0);
            a(1, 9, Boolean.valueOf(this.f26585R));
            a(2, 7, cVar);
            a(6, 8, cVar);
            vqVar.e();
        } catch (Throwable th) {
            this.f26595d.e();
            throw th;
        }
    }

    private int f() {
        AudioTrack audioTrack = this.f26575H;
        if (audioTrack != null && audioTrack.getAudioSessionId() != 0) {
            this.f26575H.release();
            this.f26575H = null;
        }
        if (this.f26575H == null) {
            this.f26575H = new AudioTrack(3, 4000, 4, 2, 2, 0, 0);
        }
        return this.f26575H.getAudioSessionId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void g(rh1 rh1Var, zh1.b bVar) {
        bVar.onPlaybackSuppressionReasonChanged(rh1Var.f31204m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void h(rh1 rh1Var, zh1.b bVar) {
        bVar.onIsPlayingChanged(rh1Var.f31196e == 3 && rh1Var.f31203l && rh1Var.f31204m == 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void i(rh1 rh1Var, zh1.b bVar) {
        bVar.a(rh1Var.f31205n);
    }

    public final void a(d60.a aVar) {
        this.f26602k.add(aVar);
    }

    @Override // com.yandex.mobile.ads.impl.zh1
    public final void b(zh1.b bVar) {
        bVar.getClass();
        this.f26601j.a((ir0<zh1.b>) bVar);
    }

    public final void d() {
        j();
    }

    public final void e() {
        j();
    }

    @Override // com.yandex.mobile.ads.impl.zh1
    public final long getContentPosition() {
        j();
        j();
        if (!this.f26590W.f31193b.a()) {
            j();
            return u82.b(a(this.f26590W));
        }
        rh1 rh1Var = this.f26590W;
        rh1Var.f31192a.a(rh1Var.f31193b.f35792a, this.f26603l);
        rh1 rh1Var2 = this.f26590W;
        if (rh1Var2.f31194c == -9223372036854775807L) {
            return u82.b(rh1Var2.f31192a.a(getCurrentMediaItemIndex(), this.f35608a, 0L).f34430n);
        }
        return u82.b(this.f26590W.f31194c) + u82.b(this.f26603l.f34407f);
    }

    @Override // com.yandex.mobile.ads.impl.zh1
    public final int getCurrentAdGroupIndex() {
        j();
        j();
        if (this.f26590W.f31193b.a()) {
            return this.f26590W.f31193b.f35793b;
        }
        return -1;
    }

    @Override // com.yandex.mobile.ads.impl.zh1
    public final int getCurrentAdIndexInAdGroup() {
        j();
        j();
        if (this.f26590W.f31193b.a()) {
            return this.f26590W.f31193b.f35794c;
        }
        return -1;
    }

    @Override // com.yandex.mobile.ads.impl.zh1
    public final int getCurrentMediaItemIndex() {
        j();
        int c4 = c();
        if (c4 == -1) {
            return 0;
        }
        return c4;
    }

    @Override // com.yandex.mobile.ads.impl.zh1
    public final int getCurrentPeriodIndex() {
        j();
        if (this.f26590W.f31192a.c()) {
            return 0;
        }
        rh1 rh1Var = this.f26590W;
        return rh1Var.f31192a.a(rh1Var.f31193b.f35792a);
    }

    @Override // com.yandex.mobile.ads.impl.zh1
    public final long getCurrentPosition() {
        j();
        return u82.b(a(this.f26590W));
    }

    @Override // com.yandex.mobile.ads.impl.zh1
    public final x42 getCurrentTimeline() {
        j();
        return this.f26590W.f31192a;
    }

    @Override // com.yandex.mobile.ads.impl.zh1
    public final q62 getCurrentTracks() {
        j();
        return this.f26590W.f31200i.f33514d;
    }

    @Override // com.yandex.mobile.ads.impl.zh1
    public final long getDuration() {
        j();
        j();
        if (this.f26590W.f31193b.a()) {
            rh1 rh1Var = this.f26590W;
            dw0.b bVar = rh1Var.f31193b;
            rh1Var.f31192a.a(bVar.f35792a, this.f26603l);
            return u82.b(this.f26603l.a(bVar.f35793b, bVar.f35794c));
        }
        j();
        x42 x42Var = this.f26590W.f31192a;
        if (x42Var.c()) {
            return -9223372036854775807L;
        }
        return u82.b(x42Var.a(getCurrentMediaItemIndex(), this.f35608a, 0L).f34431o);
    }

    @Override // com.yandex.mobile.ads.impl.zh1
    public final boolean getPlayWhenReady() {
        j();
        return this.f26590W.f31203l;
    }

    @Override // com.yandex.mobile.ads.impl.zh1
    public final int getPlaybackState() {
        j();
        return this.f26590W.f31196e;
    }

    @Override // com.yandex.mobile.ads.impl.zh1
    public final int getPlaybackSuppressionReason() {
        j();
        return this.f26590W.f31204m;
    }

    @Override // com.yandex.mobile.ads.impl.zh1
    public final long getTotalBufferedDuration() {
        j();
        return u82.b(this.f26590W.f31208q);
    }

    @Override // com.yandex.mobile.ads.impl.zh1
    public final float getVolume() {
        j();
        return this.f26584Q;
    }

    @Override // com.yandex.mobile.ads.impl.zh1
    public final boolean isPlayingAd() {
        j();
        return this.f26590W.f31193b.a();
    }

    @Override // com.yandex.mobile.ads.impl.zh1
    public final void prepare() {
        j();
        j();
        boolean z4 = this.f26590W.f31203l;
        int a4 = this.f26613v.a(z4, 2);
        a(a4, (!z4 || a4 == 1) ? 1 : 2, z4);
        rh1 rh1Var = this.f26590W;
        if (rh1Var.f31196e != 1) {
            return;
        }
        rh1 a5 = rh1Var.a((c60) null);
        rh1 a6 = a5.a(a5.f31192a.c() ? 4 : 2);
        this.f26568A++;
        this.f26600i.i();
        a(a6, 1, 1, false, 5, -9223372036854775807L);
    }

    @Override // com.yandex.mobile.ads.impl.zh1
    public final void release() {
        AudioTrack audioTrack;
        ms0.c("ExoPlayerImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [ExoPlayerLib/2.18.1] [" + u82.f32877e + "] [" + k60.a() + b9.i.f15552e);
        j();
        if (u82.f32873a < 21 && (audioTrack = this.f26575H) != null) {
            audioTrack.release();
            this.f26575H = null;
        }
        this.f26612u.a();
        this.f26614w.c();
        this.f26615x.a(false);
        this.f26616y.a(false);
        this.f26613v.c();
        if (!this.f26600i.k()) {
            ir0<zh1.b> ir0Var = this.f26601j;
            ir0Var.a(10, new ir0.a() { // from class: com.yandex.mobile.ads.impl.I5
                @Override // com.yandex.mobile.ads.impl.ir0.a
                public final void invoke(Object obj) {
                    h60.c((zh1.b) obj);
                }
            });
            ir0Var.a();
        }
        this.f26601j.b();
        this.f26599h.a();
        this.f26609r.a(this.f26607p);
        rh1 a4 = this.f26590W.a(1);
        this.f26590W = a4;
        rh1 a5 = a4.a(a4.f31193b);
        this.f26590W = a5;
        a5.f31207p = a5.f31209r;
        this.f26590W.f31208q = 0L;
        this.f26607p.release();
        this.f26598g.d();
        g();
        Surface surface = this.f26577J;
        if (surface != null) {
            surface.release();
            this.f26577J = null;
        }
        int i4 = wu.f34183b;
    }

    @Override // com.yandex.mobile.ads.impl.zh1
    public final void setPlayWhenReady(boolean z4) {
        j();
        C1952gh c1952gh = this.f26613v;
        j();
        int a4 = c1952gh.a(z4, this.f26590W.f31196e);
        int i4 = 1;
        if (z4 && a4 != 1) {
            i4 = 2;
        }
        a(a4, i4, z4);
    }

    @Override // com.yandex.mobile.ads.impl.zh1
    public final void setVideoTextureView(TextureView textureView) {
        j();
        if (textureView == null) {
            j();
            g();
            a((Surface) null);
            a(0, 0);
            return;
        }
        g();
        this.f26578K = textureView;
        if (textureView.getSurfaceTextureListener() != null) {
            ms0.d("ExoPlayerImpl", "Replacing existing SurfaceTextureListener.");
        }
        textureView.setSurfaceTextureListener(this.f26611t);
        SurfaceTexture surfaceTexture = textureView.isAvailable() ? textureView.getSurfaceTexture() : null;
        if (surfaceTexture == null) {
            a((Surface) null);
            a(0, 0);
        } else {
            Surface surface = new Surface(surfaceTexture);
            a(surface);
            this.f26577J = surface;
            a(textureView.getWidth(), textureView.getHeight());
        }
    }

    @Override // com.yandex.mobile.ads.impl.zh1
    public final void setVolume(float f4) {
        j();
        int i4 = u82.f32873a;
        final float max = Math.max(0.0f, Math.min(f4, 1.0f));
        if (this.f26584Q == max) {
            return;
        }
        this.f26584Q = max;
        a(1, 2, Float.valueOf(this.f26613v.b() * max));
        ir0<zh1.b> ir0Var = this.f26601j;
        ir0Var.a(22, new ir0.a() { // from class: com.yandex.mobile.ads.impl.X4
            @Override // com.yandex.mobile.ads.impl.ir0.a
            public final void invoke(Object obj) {
                ((zh1.b) obj).onVolumeChanged(max);
            }
        });
        ir0Var.a();
    }

    @Override // com.yandex.mobile.ads.impl.zh1
    public final void stop() {
        j();
        j();
        C1952gh c1952gh = this.f26613v;
        j();
        c1952gh.a(this.f26590W.f31203l, 1);
        a((c60) null);
        int i4 = wu.f34183b;
    }

    private long a(rh1 rh1Var) {
        if (rh1Var.f31192a.c()) {
            return u82.a(this.f26592Y);
        }
        if (rh1Var.f31193b.a()) {
            return rh1Var.f31209r;
        }
        x42 x42Var = rh1Var.f31192a;
        dw0.b bVar = rh1Var.f31193b;
        long j4 = rh1Var.f31209r;
        x42Var.a(bVar.f35792a, this.f26603l);
        return j4 + this.f26603l.f34407f;
    }

    private int c() {
        if (this.f26590W.f31192a.c()) {
            return this.f26591X;
        }
        rh1 rh1Var = this.f26590W;
        return rh1Var.f31192a.a(rh1Var.f31193b.f35792a, this.f26603l).f34405d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(zh1.b bVar) {
        bVar.a(this.f26573F);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void e(rh1 rh1Var, zh1.b bVar) {
        bVar.onPlayerStateChanged(rh1Var.f31203l, rh1Var.f31196e);
    }

    private void g() {
        TextureView textureView = this.f26578K;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != this.f26611t) {
                ms0.d("ExoPlayerImpl", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.f26578K.setSurfaceTextureListener(null);
            }
            this.f26578K = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        j();
        int i4 = this.f26590W.f31196e;
        if (i4 != 1) {
            if (i4 == 2 || i4 == 3) {
                j();
                boolean z4 = this.f26590W.f31206o;
                xi2 xi2Var = this.f26615x;
                j();
                xi2Var.a(this.f26590W.f31203l && !z4);
                xj2 xj2Var = this.f26616y;
                j();
                xj2Var.a(this.f26590W.f31203l);
                return;
            }
            if (i4 != 4) {
                throw new IllegalStateException();
            }
        }
        this.f26615x.a(false);
        this.f26616y.a(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        this.f26595d.b();
        if (Thread.currentThread() != this.f26608q.getThread()) {
            String name = Thread.currentThread().getName();
            String name2 = this.f26608q.getThread().getName();
            int i4 = u82.f32873a;
            Locale locale = Locale.US;
            String str = "Player is accessed on the wrong thread.\nCurrent thread: '" + name + "'\nExpected thread: '" + name2 + "'\nSee https://exoplayer.dev/issues/player-accessed-on-wrong-thread";
            if (this.f26586S) {
                throw new IllegalStateException(str);
            }
            ms0.b("ExoPlayerImpl", str, this.f26587T ? null : new IllegalStateException());
            this.f26587T = true;
        }
    }

    private static long b(rh1 rh1Var) {
        x42.d dVar = new x42.d();
        x42.b bVar = new x42.b();
        rh1Var.f31192a.a(rh1Var.f31193b.f35792a, bVar);
        long j4 = rh1Var.f31194c;
        if (j4 == -9223372036854775807L) {
            return rh1Var.f31192a.a(bVar.f34405d, dVar, 0L).f34430n;
        }
        return bVar.f34407f + j4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d(rh1 rh1Var, zh1.b bVar) {
        boolean z4 = rh1Var.f31198g;
        bVar.getClass();
        bVar.onIsLoadingChanged(rh1Var.f31198g);
    }

    private void h() {
        zh1.a aVar = this.f26573F;
        zh1 zh1Var = this.f26596e;
        zh1.a aVar2 = this.f26594c;
        int i4 = u82.f32873a;
        boolean isPlayingAd = zh1Var.isPlayingAd();
        boolean isCurrentMediaItemSeekable = zh1Var.isCurrentMediaItemSeekable();
        boolean hasPreviousMediaItem = zh1Var.hasPreviousMediaItem();
        boolean hasNextMediaItem = zh1Var.hasNextMediaItem();
        boolean isCurrentMediaItemLive = zh1Var.isCurrentMediaItemLive();
        boolean isCurrentMediaItemDynamic = zh1Var.isCurrentMediaItemDynamic();
        boolean c4 = zh1Var.getCurrentTimeline().c();
        boolean z4 = !isPlayingAd;
        zh1.a a4 = new zh1.a.C0208a().a(aVar2).a(z4, 4).a(isCurrentMediaItemSeekable && !isPlayingAd, 5).a(hasPreviousMediaItem && !isPlayingAd, 6).a(!c4 && (hasPreviousMediaItem || !isCurrentMediaItemLive || isCurrentMediaItemSeekable) && !isPlayingAd, 7).a(hasNextMediaItem && !isPlayingAd, 8).a(!c4 && (hasNextMediaItem || (isCurrentMediaItemLive && isCurrentMediaItemDynamic)) && !isPlayingAd, 9).a(z4, 10).a(isCurrentMediaItemSeekable && !isPlayingAd, 11).a(isCurrentMediaItemSeekable && !isPlayingAd, 12).a();
        this.f26573F = a4;
        if (a4.equals(aVar)) {
            return;
        }
        this.f26601j.a(13, new ir0.a() { // from class: com.yandex.mobile.ads.impl.L5
            @Override // com.yandex.mobile.ads.impl.ir0.a
            public final void invoke(Object obj) {
                h60.this.d((zh1.b) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c(zh1.b bVar) {
        bVar.b(c60.a(new w60(1), 1003));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c(rh1 rh1Var, zh1.b bVar) {
        bVar.a(rh1Var.f31200i.f33514d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void f(rh1 rh1Var, zh1.b bVar) {
        bVar.onPlaybackStateChanged(rh1Var.f31196e);
    }

    @Override // com.yandex.mobile.ads.impl.zh1
    public final c60 a() {
        j();
        return this.f26590W.f31197f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(final j60.d dVar) {
        this.f26599h.a(new Runnable() { // from class: com.yandex.mobile.ads.impl.J5
            @Override // java.lang.Runnable
            public final void run() {
                h60.this.a(dVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(rh1 rh1Var, zh1.b bVar) {
        bVar.b(rh1Var.f31197f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(zh1.b bVar, qb0 qb0Var) {
        bVar.getClass();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(rh1 rh1Var, int i4, zh1.b bVar) {
        bVar.onPlayWhenReadyChanged(rh1Var.f31203l, i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(j60.d dVar) {
        boolean z4;
        int i4 = this.f26568A - dVar.f27532c;
        this.f26568A = i4;
        boolean z5 = true;
        if (dVar.f27533d) {
            this.f26569B = dVar.f27534e;
            this.f26570C = true;
        }
        if (dVar.f27535f) {
            this.f26571D = dVar.f27536g;
        }
        if (i4 == 0) {
            x42 x42Var = dVar.f27531b.f31192a;
            if (!this.f26590W.f31192a.c() && x42Var.c()) {
                this.f26591X = -1;
                this.f26592Y = 0L;
            }
            if (!x42Var.c()) {
                List<x42> d4 = ((aj1) x42Var).d();
                if (d4.size() == this.f26604m.size()) {
                    for (int i5 = 0; i5 < d4.size(); i5++) {
                        ((d) this.f26604m.get(i5)).f26624b = d4.get(i5);
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
            long j4 = -9223372036854775807L;
            if (this.f26570C) {
                if (dVar.f27531b.f31193b.equals(this.f26590W.f31193b) && dVar.f27531b.f31195d == this.f26590W.f31209r) {
                    z5 = false;
                }
                if (z5) {
                    if (!x42Var.c() && !dVar.f27531b.f31193b.a()) {
                        rh1 rh1Var = dVar.f27531b;
                        dw0.b bVar = rh1Var.f31193b;
                        long j5 = rh1Var.f31195d;
                        x42Var.a(bVar.f35792a, this.f26603l);
                        j4 = j5 + this.f26603l.f34407f;
                    } else {
                        j4 = dVar.f27531b.f31195d;
                    }
                }
                z4 = z5;
            } else {
                z4 = false;
            }
            long j6 = j4;
            this.f26570C = false;
            a(dVar.f27531b, 1, this.f26571D, z4, this.f26569B, j6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(rh1 rh1Var, int i4, zh1.b bVar) {
        x42 x42Var = rh1Var.f31192a;
        bVar.a(i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(int i4, zh1.c cVar, zh1.c cVar2, zh1.b bVar) {
        bVar.getClass();
        bVar.a(cVar, cVar2, i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(rh1 rh1Var, zh1.b bVar) {
        bVar.a(rh1Var.f31197f);
    }

    private rh1 a(rh1 rh1Var, x42 x42Var, Pair<Object, Long> pair) {
        long j4;
        if (!x42Var.c() && pair == null) {
            throw new IllegalArgumentException();
        }
        x42 x42Var2 = rh1Var.f31192a;
        rh1 a4 = rh1Var.a(x42Var);
        if (x42Var.c()) {
            dw0.b a5 = rh1.a();
            long a6 = u82.a(this.f26592Y);
            rh1 a7 = a4.a(a5, a6, a6, a6, 0L, o52.f29910e, this.f26593b, sj0.h()).a(a5);
            a7.f31207p = a7.f31209r;
            return a7;
        }
        Object obj = a4.f31193b.f35792a;
        int i4 = u82.f32873a;
        boolean equals = obj.equals(pair.first);
        dw0.b bVar = !equals ? new dw0.b(pair.first) : a4.f31193b;
        long longValue = ((Long) pair.second).longValue();
        long a8 = u82.a(getContentPosition());
        if (!x42Var2.c()) {
            a8 -= x42Var2.a(obj, this.f26603l).f34407f;
        }
        if (!equals || longValue < a8) {
            dw0.b bVar2 = bVar;
            if (!bVar2.a()) {
                rh1 a9 = a4.a(bVar2, longValue, longValue, longValue, 0L, !equals ? o52.f29910e : a4.f31199h, !equals ? this.f26593b : a4.f31200i, !equals ? sj0.h() : a4.f31201j).a(bVar2);
                a9.f31207p = longValue;
                return a9;
            }
            throw new IllegalStateException();
        }
        if (longValue == a8) {
            int a10 = x42Var.a(a4.f31202k.f35792a);
            if (a10 != -1 && x42Var.a(a10, this.f26603l, false).f34405d == x42Var.a(bVar.f35792a, this.f26603l).f34405d) {
                return a4;
            }
            x42Var.a(bVar.f35792a, this.f26603l);
            if (bVar.a()) {
                j4 = this.f26603l.a(bVar.f35793b, bVar.f35794c);
            } else {
                j4 = this.f26603l.f34406e;
            }
            dw0.b bVar3 = bVar;
            rh1 a11 = a4.a(bVar3, a4.f31209r, a4.f31209r, a4.f31195d, j4 - a4.f31209r, a4.f31199h, a4.f31200i, a4.f31201j).a(bVar3);
            a11.f31207p = j4;
            return a11;
        }
        dw0.b bVar4 = bVar;
        if (!bVar4.a()) {
            long max = Math.max(0L, a4.f31208q - (longValue - a8));
            long j5 = a4.f31207p;
            if (a4.f31202k.equals(a4.f31193b)) {
                j5 = longValue + max;
            }
            rh1 a12 = a4.a(bVar4, longValue, longValue, longValue, max, a4.f31199h, a4.f31200i, a4.f31201j);
            a12.f31207p = j5;
            return a12;
        }
        throw new IllegalStateException();
    }

    private Pair<Object, Long> a(x42 x42Var, int i4, long j4) {
        if (x42Var.c()) {
            this.f26591X = i4;
            if (j4 == -9223372036854775807L) {
                j4 = 0;
            }
            this.f26592Y = j4;
            return null;
        }
        if (i4 == -1 || i4 >= x42Var.b()) {
            i4 = x42Var.a(false);
            j4 = u82.b(x42Var.a(i4, this.f35608a, 0L).f34430n);
        }
        return x42Var.a(this.f35608a, this.f26603l, i4, u82.a(j4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final int i4, final int i5) {
        if (i4 == this.f26580M && i5 == this.f26581N) {
            return;
        }
        this.f26580M = i4;
        this.f26581N = i5;
        ir0<zh1.b> ir0Var = this.f26601j;
        ir0Var.a(24, new ir0.a() { // from class: com.yandex.mobile.ads.impl.K5
            @Override // com.yandex.mobile.ads.impl.ir0.a
            public final void invoke(Object obj) {
                ((zh1.b) obj).onSurfaceSizeChanged(i4, i5);
            }
        });
        ir0Var.a();
    }

    @Override // com.yandex.mobile.ads.impl.zh1
    public final void a(zh1.b bVar) {
        bVar.getClass();
        this.f26601j.b(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i4, int i5, Object obj) {
        for (so1 so1Var : this.f26597f) {
            if (so1Var.m() == i4) {
                int c4 = c();
                j60 j60Var = this.f26600i;
                x42 x42Var = this.f26590W.f31192a;
                if (c4 == -1) {
                    c4 = 0;
                }
                new fi1(j60Var, so1Var, x42Var, c4, this.f26610s, j60Var.d()).a(i5).a(obj).e();
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.d60
    public final void a(am1 am1Var) {
        j();
        List singletonList = Collections.singletonList(am1Var);
        j();
        j();
        c();
        j();
        a(this.f26590W);
        int i4 = u82.f32873a;
        this.f26568A++;
        if (!this.f26604m.isEmpty()) {
            int size = this.f26604m.size();
            for (int i5 = size - 1; i5 >= 0; i5--) {
                this.f26604m.remove(i5);
            }
            this.f26572E = this.f26572E.c(size);
        }
        ArrayList arrayList = new ArrayList();
        for (int i6 = 0; i6 < singletonList.size(); i6++) {
            gw0.c cVar = new gw0.c((dw0) singletonList.get(i6), this.f26605n);
            arrayList.add(cVar);
            this.f26604m.add(i6, new d(cVar.f26335a.f(), cVar.f26336b));
        }
        this.f26572E = this.f26572E.b(arrayList.size());
        aj1 aj1Var = new aj1(this.f26604m, this.f26572E);
        if (!aj1Var.c() && -1 >= aj1Var.b()) {
            throw new ji0();
        }
        int a4 = aj1Var.a(false);
        rh1 a5 = a(this.f26590W, aj1Var, a(aj1Var, a4, -9223372036854775807L));
        int i7 = a5.f31196e;
        if (a4 != -1 && i7 != 1) {
            i7 = (aj1Var.c() || a4 >= aj1Var.b()) ? 4 : 2;
        }
        rh1 a6 = a5.a(i7);
        this.f26600i.a(a4, u82.a(-9223372036854775807L), this.f26572E, arrayList);
        a(a6, 0, 1, (this.f26590W.f31193b.f35792a.equals(a6.f31193b.f35792a) || this.f26590W.f31192a.c()) ? false : true, 4, a(a6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        a(surface);
        this.f26577J = surface;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Surface surface) {
        ArrayList arrayList = new ArrayList();
        boolean z4 = false;
        for (so1 so1Var : this.f26597f) {
            if (so1Var.m() == 2) {
                int c4 = c();
                j60 j60Var = this.f26600i;
                x42 x42Var = this.f26590W.f31192a;
                if (c4 == -1) {
                    c4 = 0;
                }
                arrayList.add(new fi1(j60Var, so1Var, x42Var, c4, this.f26610s, j60Var.d()).a(1).a(surface).e());
            }
        }
        Object obj = this.f26576I;
        if (obj != null && obj != surface) {
            try {
                int size = arrayList.size();
                int i4 = 0;
                while (i4 < size) {
                    Object obj2 = arrayList.get(i4);
                    i4++;
                    ((fi1) obj2).a(this.f26617z);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                z4 = true;
            }
            Object obj3 = this.f26576I;
            Surface surface2 = this.f26577J;
            if (obj3 == surface2) {
                surface2.release();
                this.f26577J = null;
            }
        }
        this.f26576I = surface;
        if (z4) {
            a(c60.a(new w60(3), 1003));
        }
    }

    private void a(c60 c60Var) {
        rh1 rh1Var = this.f26590W;
        rh1 a4 = rh1Var.a(rh1Var.f31193b);
        a4.f31207p = a4.f31209r;
        a4.f31208q = 0L;
        rh1 a5 = a4.a(1);
        if (c60Var != null) {
            a5 = a5.a(c60Var);
        }
        rh1 rh1Var2 = a5;
        this.f26568A++;
        this.f26600i.p();
        a(rh1Var2, 0, 1, rh1Var2.f31192a.c() && !this.f26590W.f31192a.c(), 4, a(rh1Var2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i4, int i5, boolean z4) {
        int i6 = 0;
        boolean z5 = z4 && i4 != -1;
        if (z5 && i4 != 1) {
            i6 = 1;
        }
        rh1 rh1Var = this.f26590W;
        if (rh1Var.f31203l == z5 && rh1Var.f31204m == i6) {
            return;
        }
        this.f26568A++;
        int i7 = i6;
        boolean z6 = z5;
        rh1 rh1Var2 = new rh1(rh1Var.f31192a, rh1Var.f31193b, rh1Var.f31194c, rh1Var.f31195d, rh1Var.f31196e, rh1Var.f31197f, rh1Var.f31198g, rh1Var.f31199h, rh1Var.f31200i, rh1Var.f31201j, rh1Var.f31202k, z6, i7, rh1Var.f31205n, rh1Var.f31207p, rh1Var.f31208q, rh1Var.f31209r, rh1Var.f31206o);
        this.f26600i.a(z6, i7);
        a(rh1Var2, 0, i5, false, 5, -9223372036854775807L);
    }

    private void a(final rh1 rh1Var, final int i4, final int i5, boolean z4, final int i6, long j4) {
        int i7;
        Pair pair;
        int i8;
        final rv0 rv0Var;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        Object obj;
        int i9;
        rv0 rv0Var2;
        Object obj2;
        int i10;
        long j5;
        long j6;
        long j7;
        long b4;
        Object obj3;
        rv0 rv0Var3;
        Object obj4;
        int i11;
        rh1 rh1Var2 = this.f26590W;
        this.f26590W = rh1Var;
        boolean equals = rh1Var2.f31192a.equals(rh1Var.f31192a);
        x42 x42Var = rh1Var2.f31192a;
        x42 x42Var2 = rh1Var.f31192a;
        if (x42Var2.c() && x42Var.c()) {
            pair = new Pair(Boolean.FALSE, -1);
            i7 = 3;
        } else {
            i7 = 3;
            if (x42Var2.c() != x42Var.c()) {
                pair = new Pair(Boolean.TRUE, 3);
            } else if (!x42Var.a(x42Var.a(rh1Var2.f31193b.f35792a, this.f26603l).f34405d, this.f35608a, 0L).f34418b.equals(x42Var2.a(x42Var2.a(rh1Var.f31193b.f35792a, this.f26603l).f34405d, this.f35608a, 0L).f34418b)) {
                if (z4 && i6 == 0) {
                    i8 = 1;
                } else if (z4 && i6 == 1) {
                    i8 = 2;
                } else {
                    if (equals) {
                        throw new IllegalStateException();
                    }
                    i8 = 3;
                }
                pair = new Pair(Boolean.TRUE, Integer.valueOf(i8));
            } else if (z4 && i6 == 0 && rh1Var2.f31193b.f35795d < rh1Var.f31193b.f35795d) {
                pair = new Pair(Boolean.TRUE, 0);
            } else {
                pair = new Pair(Boolean.FALSE, -1);
            }
        }
        boolean booleanValue = ((Boolean) pair.first).booleanValue();
        final int intValue = ((Integer) pair.second).intValue();
        uv0 uv0Var = this.f26574G;
        if (booleanValue) {
            rv0Var = !rh1Var.f31192a.c() ? rh1Var.f31192a.a(rh1Var.f31192a.a(rh1Var.f31193b.f35792a, this.f26603l).f34405d, this.f35608a, 0L).f34420d : null;
            this.f26589V = uv0.f33360H;
        } else {
            rv0Var = null;
        }
        if (booleanValue || !rh1Var2.f31201j.equals(rh1Var.f31201j)) {
            uv0.a a4 = this.f26589V.a();
            List<wz0> list = rh1Var.f31201j;
            for (int i12 = 0; i12 < list.size(); i12++) {
                wz0 wz0Var = list.get(i12);
                for (int i13 = 0; i13 < wz0Var.c(); i13++) {
                    wz0Var.a(i13).a(a4);
                }
            }
            this.f26589V = a4.a();
            j();
            x42 x42Var3 = this.f26590W.f31192a;
            if (x42Var3.c()) {
                uv0Var = this.f26589V;
            } else {
                uv0Var = this.f26589V.a().a(x42Var3.a(getCurrentMediaItemIndex(), this.f35608a, 0L).f34420d.f31381e).a();
            }
        }
        boolean equals2 = uv0Var.equals(this.f26574G);
        this.f26574G = uv0Var;
        boolean z9 = rh1Var2.f31203l != rh1Var.f31203l;
        boolean z10 = rh1Var2.f31196e != rh1Var.f31196e;
        if (z10 || z9) {
            i();
        }
        boolean z11 = rh1Var2.f31198g != rh1Var.f31198g;
        if (!rh1Var2.f31192a.equals(rh1Var.f31192a)) {
            this.f26601j.a(0, new ir0.a() { // from class: com.yandex.mobile.ads.impl.O5
                @Override // com.yandex.mobile.ads.impl.ir0.a
                public final void invoke(Object obj5) {
                    h60.a(rh1.this, i4, (zh1.b) obj5);
                }
            });
        }
        if (z4) {
            x42.b bVar = new x42.b();
            if (rh1Var2.f31192a.c()) {
                z5 = booleanValue;
                z6 = equals2;
                z7 = z10;
                obj = null;
                i9 = -1;
                rv0Var2 = null;
                obj2 = null;
                i10 = -1;
            } else {
                Object obj5 = rh1Var2.f31193b.f35792a;
                rh1Var2.f31192a.a(obj5, bVar);
                int i14 = bVar.f34405d;
                int a5 = rh1Var2.f31192a.a(obj5);
                z5 = booleanValue;
                z6 = equals2;
                z7 = z10;
                obj = rh1Var2.f31192a.a(i14, this.f35608a, 0L).f34418b;
                rv0Var2 = this.f35608a.f34420d;
                obj2 = obj5;
                i9 = i14;
                i10 = a5;
            }
            if (i6 == 0) {
                if (rh1Var2.f31193b.a()) {
                    dw0.b bVar2 = rh1Var2.f31193b;
                    j7 = bVar.a(bVar2.f35793b, bVar2.f35794c);
                    b4 = b(rh1Var2);
                } else if (rh1Var2.f31193b.f35796e != -1) {
                    j7 = b(this.f26590W);
                    b4 = j7;
                } else {
                    j5 = bVar.f34407f;
                    j6 = bVar.f34406e;
                    j7 = j5 + j6;
                    b4 = j7;
                }
            } else if (rh1Var2.f31193b.a()) {
                j7 = rh1Var2.f31209r;
                b4 = b(rh1Var2);
            } else {
                j5 = bVar.f34407f;
                j6 = rh1Var2.f31209r;
                j7 = j5 + j6;
                b4 = j7;
            }
            long b5 = u82.b(j7);
            long b6 = u82.b(b4);
            dw0.b bVar3 = rh1Var2.f31193b;
            final zh1.c cVar = new zh1.c(obj, i9, rv0Var2, obj2, i10, b5, b6, bVar3.f35793b, bVar3.f35794c);
            int currentMediaItemIndex = getCurrentMediaItemIndex();
            if (this.f26590W.f31192a.c()) {
                obj3 = null;
                rv0Var3 = null;
                obj4 = null;
                i11 = -1;
            } else {
                rh1 rh1Var3 = this.f26590W;
                Object obj6 = rh1Var3.f31193b.f35792a;
                rh1Var3.f31192a.a(obj6, this.f26603l);
                i11 = this.f26590W.f31192a.a(obj6);
                obj4 = obj6;
                obj3 = this.f26590W.f31192a.a(currentMediaItemIndex, this.f35608a, 0L).f34418b;
                rv0Var3 = this.f35608a.f34420d;
            }
            long b7 = u82.b(j4);
            long b8 = this.f26590W.f31193b.a() ? u82.b(b(this.f26590W)) : b7;
            dw0.b bVar4 = this.f26590W.f31193b;
            final zh1.c cVar2 = new zh1.c(obj3, currentMediaItemIndex, rv0Var3, obj4, i11, b7, b8, bVar4.f35793b, bVar4.f35794c);
            this.f26601j.a(11, new ir0.a() { // from class: com.yandex.mobile.ads.impl.Z4
                @Override // com.yandex.mobile.ads.impl.ir0.a
                public final void invoke(Object obj7) {
                    h60.a(i6, cVar, cVar2, (zh1.b) obj7);
                }
            });
        } else {
            z5 = booleanValue;
            z6 = equals2;
            z7 = z10;
        }
        if (z5) {
            ir0<zh1.b> ir0Var = this.f26601j;
            ir0.a<zh1.b> aVar = new ir0.a() { // from class: com.yandex.mobile.ads.impl.A5
                @Override // com.yandex.mobile.ads.impl.ir0.a
                public final void invoke(Object obj7) {
                    ((zh1.b) obj7).a(rv0.this, intValue);
                }
            };
            z8 = true;
            ir0Var.a(1, aVar);
        } else {
            z8 = true;
        }
        if (rh1Var2.f31197f != rh1Var.f31197f) {
            this.f26601j.a(10, new ir0.a() { // from class: com.yandex.mobile.ads.impl.B5
                @Override // com.yandex.mobile.ads.impl.ir0.a
                public final void invoke(Object obj7) {
                    h60.a(rh1.this, (zh1.b) obj7);
                }
            });
            if (rh1Var.f31197f != null) {
                this.f26601j.a(10, new ir0.a() { // from class: com.yandex.mobile.ads.impl.C5
                    @Override // com.yandex.mobile.ads.impl.ir0.a
                    public final void invoke(Object obj7) {
                        h60.b(rh1.this, (zh1.b) obj7);
                    }
                });
            }
        }
        v52 v52Var = rh1Var2.f31200i;
        v52 v52Var2 = rh1Var.f31200i;
        if (v52Var != v52Var2) {
            this.f26598g.a(v52Var2.f33515e);
            this.f26601j.a(2, new ir0.a() { // from class: com.yandex.mobile.ads.impl.D5
                @Override // com.yandex.mobile.ads.impl.ir0.a
                public final void invoke(Object obj7) {
                    h60.c(rh1.this, (zh1.b) obj7);
                }
            });
        }
        if (!z6) {
            final uv0 uv0Var2 = this.f26574G;
            this.f26601j.a(14, new ir0.a() { // from class: com.yandex.mobile.ads.impl.E5
                @Override // com.yandex.mobile.ads.impl.ir0.a
                public final void invoke(Object obj7) {
                    ((zh1.b) obj7).a(uv0.this);
                }
            });
        }
        if (z11) {
            this.f26601j.a(i7, new ir0.a() { // from class: com.yandex.mobile.ads.impl.F5
                @Override // com.yandex.mobile.ads.impl.ir0.a
                public final void invoke(Object obj7) {
                    h60.d(rh1.this, (zh1.b) obj7);
                }
            });
        }
        if (z7 || z9) {
            this.f26601j.a(-1, new ir0.a() { // from class: com.yandex.mobile.ads.impl.G5
                @Override // com.yandex.mobile.ads.impl.ir0.a
                public final void invoke(Object obj7) {
                    h60.e(rh1.this, (zh1.b) obj7);
                }
            });
        }
        if (z7) {
            this.f26601j.a(4, new ir0.a() { // from class: com.yandex.mobile.ads.impl.H5
                @Override // com.yandex.mobile.ads.impl.ir0.a
                public final void invoke(Object obj7) {
                    h60.f(rh1.this, (zh1.b) obj7);
                }
            });
        }
        if (z9) {
            this.f26601j.a(5, new ir0.a() { // from class: com.yandex.mobile.ads.impl.P5
                @Override // com.yandex.mobile.ads.impl.ir0.a
                public final void invoke(Object obj7) {
                    h60.b(rh1.this, i5, (zh1.b) obj7);
                }
            });
        }
        if (rh1Var2.f31204m != rh1Var.f31204m) {
            this.f26601j.a(6, new ir0.a() { // from class: com.yandex.mobile.ads.impl.Q5
                @Override // com.yandex.mobile.ads.impl.ir0.a
                public final void invoke(Object obj7) {
                    h60.g(rh1.this, (zh1.b) obj7);
                }
            });
        }
        if (((rh1Var2.f31196e == 3 && rh1Var2.f31203l && rh1Var2.f31204m == 0) ? z8 : false) != ((rh1Var.f31196e == 3 && rh1Var.f31203l && rh1Var.f31204m == 0) ? z8 : false)) {
            this.f26601j.a(7, new ir0.a() { // from class: com.yandex.mobile.ads.impl.R5
                @Override // com.yandex.mobile.ads.impl.ir0.a
                public final void invoke(Object obj7) {
                    h60.h(rh1.this, (zh1.b) obj7);
                }
            });
        }
        if (!rh1Var2.f31205n.equals(rh1Var.f31205n)) {
            this.f26601j.a(12, new ir0.a() { // from class: com.yandex.mobile.ads.impl.Y4
                @Override // com.yandex.mobile.ads.impl.ir0.a
                public final void invoke(Object obj7) {
                    h60.i(rh1.this, (zh1.b) obj7);
                }
            });
        }
        h();
        this.f26601j.a();
        if (rh1Var2.f31206o != rh1Var.f31206o) {
            Iterator<d60.a> it = this.f26602k.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static x00 a(p22 p22Var) {
        return new x00(0, p22Var.b(), p22Var.a());
    }
}
