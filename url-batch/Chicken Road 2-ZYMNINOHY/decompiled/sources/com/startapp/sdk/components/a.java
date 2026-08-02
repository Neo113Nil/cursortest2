package com.startapp.sdk.components;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Looper;
import c3.C0297i;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.WeightedChoice;
import com.startapp.sdk.adsbase.remoteconfig.WvfMetadata;
import com.startapp.sdk.internal.a4;
import com.startapp.sdk.internal.a5;
import com.startapp.sdk.internal.a6;
import com.startapp.sdk.internal.c5;
import com.startapp.sdk.internal.d4;
import com.startapp.sdk.internal.d5;
import com.startapp.sdk.internal.d9;
import com.startapp.sdk.internal.dc;
import com.startapp.sdk.internal.e5;
import com.startapp.sdk.internal.e9;
import com.startapp.sdk.internal.g4;
import com.startapp.sdk.internal.h5;
import com.startapp.sdk.internal.hb;
import com.startapp.sdk.internal.i3;
import com.startapp.sdk.internal.i5;
import com.startapp.sdk.internal.i7;
import com.startapp.sdk.internal.ib;
import com.startapp.sdk.internal.j4;
import com.startapp.sdk.internal.k3;
import com.startapp.sdk.internal.k5;
import com.startapp.sdk.internal.l4;
import com.startapp.sdk.internal.m3;
import com.startapp.sdk.internal.n4;
import com.startapp.sdk.internal.n5;
import com.startapp.sdk.internal.o3;
import com.startapp.sdk.internal.o4;
import com.startapp.sdk.internal.o5;
import com.startapp.sdk.internal.p;
import com.startapp.sdk.internal.p3;
import com.startapp.sdk.internal.q3;
import com.startapp.sdk.internal.q4;
import com.startapp.sdk.internal.q5;
import com.startapp.sdk.internal.r3;
import com.startapp.sdk.internal.rk;
import com.startapp.sdk.internal.s3;
import com.startapp.sdk.internal.s5;
import com.startapp.sdk.internal.sf;
import com.startapp.sdk.internal.t4;
import com.startapp.sdk.internal.t5;
import com.startapp.sdk.internal.u3;
import com.startapp.sdk.internal.u4;
import com.startapp.sdk.internal.u5;
import com.startapp.sdk.internal.v3;
import com.startapp.sdk.internal.v4;
import com.startapp.sdk.internal.v5;
import com.startapp.sdk.internal.vk;
import com.startapp.sdk.internal.w0;
import com.startapp.sdk.internal.w4;
import com.startapp.sdk.internal.w5;
import com.startapp.sdk.internal.wk;
import com.startapp.sdk.internal.x4;
import com.startapp.sdk.internal.x5;
import com.startapp.sdk.internal.x6;
import com.startapp.sdk.internal.y4;
import com.startapp.sdk.internal.y5;
import com.startapp.sdk.internal.y6;
import com.startapp.sdk.internal.yk;
import com.startapp.sdk.internal.z3;
import com.startapp.sdk.internal.z4;
import com.startapp.sdk.internal.z5;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: U, reason: collision with root package name */
    public static final v3 f6540U = new v3();

    /* renamed from: A, reason: collision with root package name */
    public final ib f6541A;

    /* renamed from: B, reason: collision with root package name */
    public final ib f6542B;

    /* renamed from: C, reason: collision with root package name */
    public final ib f6543C;

    /* renamed from: D, reason: collision with root package name */
    public final ib f6544D;

    /* renamed from: E, reason: collision with root package name */
    public final ib f6545E;

    /* renamed from: F, reason: collision with root package name */
    public final ib f6546F;

    /* renamed from: G, reason: collision with root package name */
    public final ib f6547G;

    /* renamed from: H, reason: collision with root package name */
    public final ib f6548H;

    /* renamed from: I, reason: collision with root package name */
    public final ib f6549I;

    /* renamed from: J, reason: collision with root package name */
    public final ib f6550J;

    /* renamed from: K, reason: collision with root package name */
    public final ib f6551K;
    public final ib L;

    /* renamed from: M, reason: collision with root package name */
    public final ib f6552M;

    /* renamed from: N, reason: collision with root package name */
    public final ib f6553N;

    /* renamed from: O, reason: collision with root package name */
    public final ib f6554O;

    /* renamed from: P, reason: collision with root package name */
    public final ib f6555P;

    /* renamed from: Q, reason: collision with root package name */
    public final ib f6556Q;

    /* renamed from: R, reason: collision with root package name */
    public final ib f6557R;

    /* renamed from: S, reason: collision with root package name */
    public final ib f6558S;

    /* renamed from: T, reason: collision with root package name */
    public final ib f6559T;

    /* renamed from: a, reason: collision with root package name */
    public final ib f6560a;

    /* renamed from: b, reason: collision with root package name */
    public final ib f6561b;

    /* renamed from: c, reason: collision with root package name */
    public final ib f6562c;

    /* renamed from: d, reason: collision with root package name */
    public final ib f6563d;

    /* renamed from: e, reason: collision with root package name */
    public final ib f6564e;

    /* renamed from: f, reason: collision with root package name */
    public final ib f6565f;

    /* renamed from: g, reason: collision with root package name */
    public final ib f6566g;

    /* renamed from: h, reason: collision with root package name */
    public final ib f6567h;

    /* renamed from: i, reason: collision with root package name */
    public final ib f6568i;

    /* renamed from: j, reason: collision with root package name */
    public final ib f6569j;

    /* renamed from: k, reason: collision with root package name */
    public final ib f6570k;

    /* renamed from: l, reason: collision with root package name */
    public final ib f6571l;

    /* renamed from: m, reason: collision with root package name */
    public final ib f6572m;
    public final ib n;
    public final ib o;

    /* renamed from: p, reason: collision with root package name */
    public final ib f6573p;

    /* renamed from: q, reason: collision with root package name */
    public final ib f6574q;

    /* renamed from: r, reason: collision with root package name */
    public final ib f6575r;

    /* renamed from: s, reason: collision with root package name */
    public final ib f6576s;

    /* renamed from: t, reason: collision with root package name */
    public final ib f6577t;

    /* renamed from: u, reason: collision with root package name */
    public final ib f6578u;
    public final ib v;

    /* renamed from: w, reason: collision with root package name */
    public final ib f6579w;

    /* renamed from: x, reason: collision with root package name */
    public final ib f6580x;

    /* renamed from: y, reason: collision with root package name */
    public final ib f6581y;
    public final ib z;

    public a(final Context context) {
        this.L = new ib(new u4(context));
        this.f6560a = new ib(new i5(this, context));
        final int i4 = 0;
        this.f6561b = new ib(new i7(this) { // from class: com.startapp.sdk.components.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a f6583b;

            {
                this.f6583b = this;
            }

            @Override // com.startapp.sdk.internal.i7
            public final Object a() {
                switch (i4) {
                    case 0:
                        return this.f6583b.e(context);
                    default:
                        return this.f6583b.c(context);
                }
            }
        });
        this.f6562c = new ib(new v5(this, context));
        ib ibVar = new ib(new w5());
        ib ibVar2 = new ib(new x5());
        this.f6563d = new ib(new y5(context));
        this.f6564e = new ib(new z5(context));
        a6 a6Var = new a6();
        this.f6565f = new ib(new i3(this, context, a6Var));
        this.f6566g = new ib(new k3(this, context, a6Var));
        this.f6567h = new ib(new m3(context));
        this.f6568i = new ib(new o3(context));
        this.f6569j = new ib(new p3(this, context));
        this.f6570k = new ib(new q3(context));
        this.f6571l = new ib(new r3());
        this.f6572m = new ib(new s3(context));
        this.n = new ib(new u3(this));
        this.o = new ib(new z3(context));
        this.f6573p = new ib(new a4(context));
        this.f6574q = new ib(new d4(this, context, ibVar));
        this.f6575r = new ib(new g4(this, context));
        this.f6576s = new ib(new j4(this, context));
        this.f6577t = new ib(new l4(context));
        this.f6578u = new ib(new n4(this, context));
        this.v = new ib(new o4(context));
        this.f6579w = new ib(new q4(context));
        this.f6580x = new ib(new t4(this, context));
        this.f6581y = new ib(new v4());
        this.z = new ib(new e(0));
        this.f6541A = ibVar2;
        this.f6542B = ibVar2;
        this.f6543C = ibVar2;
        this.f6544D = new ib(new w4());
        this.f6545E = new ib(new x4());
        this.f6546F = new ib(new y4());
        this.f6547G = new ib(new z4(context));
        this.f6548H = new ib(new a5(context));
        this.f6549I = new ib(new c5(context));
        this.f6550J = new ib(new d5(context));
        final int i5 = 1;
        this.f6551K = new ib(new T2.a(1, this));
        this.f6552M = new ib(new i7(this) { // from class: com.startapp.sdk.components.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a f6583b;

            {
                this.f6583b = this;
            }

            @Override // com.startapp.sdk.internal.i7
            public final Object a() {
                switch (i5) {
                    case 0:
                        return this.f6583b.e(context);
                    default:
                        return this.f6583b.c(context);
                }
            }
        });
        this.f6553N = new ib(new e5(this, context));
        this.f6554O = new ib(new h5());
        this.f6555P = new ib(new k5(this, context));
        this.f6556Q = new ib(new n5());
        this.f6557R = new ib(new o5(this));
        this.f6558S = new ib(new q5(this, context));
        this.f6559T = new ib(new s5(this, context));
    }

    public static /* synthetic */ WvfMetadata a(WvfMetadata wvfMetadata) {
        return wvfMetadata;
    }

    public static /* synthetic */ WvfMetadata b(WvfMetadata wvfMetadata) {
        return wvfMetadata;
    }

    public static ScheduledExecutorService c() {
        return Executors.newScheduledThreadPool(0, new u5("scheduled"));
    }

    public static /* synthetic */ sf d(Context context) {
        return new sf(context.getSharedPreferences("StartApp-fb8245cb9af2e955", 0));
    }

    public final rk e(Context context) {
        final WvfMetadata e02 = MetaData.E().e0();
        WeightedChoice c4 = e02 != null ? e02.c() : null;
        String a3 = c4 != null ? c4.a() : null;
        if ("simple".equals(a3)) {
            return new wk(context);
        }
        if ("dynamic".equals(a3)) {
            final int i4 = 0;
            return new vk(context, this.f6544D, this.f6546F, new ib(new e(1)), new i7() { // from class: com.startapp.sdk.components.f
                @Override // com.startapp.sdk.internal.i7
                public final Object a() {
                    switch (i4) {
                        case 0:
                            return a.a(e02);
                        default:
                            return a.b(e02);
                    }
                }
            });
        }
        final int i5 = 1;
        return new yk(context, new ib(new d(context, 1)), this.f6544D, this.f6546F, new ib(new e(2)), new i7() { // from class: com.startapp.sdk.components.f
            @Override // com.startapp.sdk.internal.i7
            public final Object a() {
                switch (i5) {
                    case 0:
                        return a.a(e02);
                    default:
                        return a.b(e02);
                }
            }
        }, new b0.c(14));
    }

    public static a a(Context context) {
        a aVar;
        v3 v3Var = f6540U;
        a aVar2 = v3Var.f7743a;
        if (aVar2 != null) {
            return aVar2;
        }
        synchronized (v3Var) {
            try {
                aVar = v3Var.f7743a;
                if (aVar == null) {
                    Context a3 = w0.a(context);
                    if (a3 != null) {
                        context = a3;
                    }
                    aVar = new a(context);
                    v3Var.f7743a = aVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVar;
    }

    public static /* synthetic */ dc b() {
        return new dc(Looper.getMainLooper());
    }

    public static /* synthetic */ SharedPreferences b(Context context) {
        return new sf(context.getSharedPreferences("StartApp-3389de2c2d518660", 0));
    }

    public final p c(Context context) {
        return new p(context, new ib(new d(context, 0)), this.f6547G, this.f6543C, this.f6551K, this.f6569j, this.f6557R, this.f6553N, this.f6561b, this.f6572m, this.n, this.f6541A, this.f6579w, this.f6562c);
    }

    public static /* synthetic */ dc a() {
        return new dc(Looper.getMainLooper());
    }

    public static C0297i a(String str, String str2) {
        d9 d9Var = new d9(e9.f6838d);
        d9Var.f6792d = "EVT";
        d9Var.f6797i = str;
        d9Var.f6793e = str2;
        d9Var.a();
        return C0297i.f5732a;
    }

    public final x6 e() {
        return new y6(new b0.c(14), new hb(new e(3)), this.f6544D, new c(0));
    }

    public static ThreadPoolExecutor a(String str, int i4, long j4) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, i4, j4, TimeUnit.SECONDS, new LinkedTransferQueue<Runnable>() { // from class: com.startapp.sdk.components.ComponentLocator$45
            @Override // java.util.concurrent.LinkedTransferQueue, java.util.Queue, java.util.concurrent.BlockingQueue
            public final boolean offer(Object obj) {
                return tryTransfer((Runnable) obj);
            }
        }, new u5(str), new t5());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }
}
