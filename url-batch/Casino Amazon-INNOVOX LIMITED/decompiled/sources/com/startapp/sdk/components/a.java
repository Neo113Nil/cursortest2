package com.startapp.sdk.components;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Looper;
import android.os.SystemClock;
import androidx.room.FtsOptions;
import com.startapp.sdk.ads.video.downloader.impl.b;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.VideoConfig;
import com.startapp.sdk.adsbase.remoteconfig.EventTracerMetadata;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.WeightedChoice;
import com.startapp.sdk.adsbase.remoteconfig.WvfMetadata;
import com.startapp.sdk.internal.ad;
import com.startapp.sdk.internal.af;
import com.startapp.sdk.internal.b5;
import com.startapp.sdk.internal.bk;
import com.startapp.sdk.internal.c3;
import com.startapp.sdk.internal.c4;
import com.startapp.sdk.internal.c5;
import com.startapp.sdk.internal.c7;
import com.startapp.sdk.internal.cd;
import com.startapp.sdk.internal.e3;
import com.startapp.sdk.internal.e4;
import com.startapp.sdk.internal.f5;
import com.startapp.sdk.internal.g3;
import com.startapp.sdk.internal.g4;
import com.startapp.sdk.internal.g5;
import com.startapp.sdk.internal.h3;
import com.startapp.sdk.internal.h4;
import com.startapp.sdk.internal.i3;
import com.startapp.sdk.internal.i5;
import com.startapp.sdk.internal.j3;
import com.startapp.sdk.internal.j4;
import com.startapp.sdk.internal.j5;
import com.startapp.sdk.internal.k3;
import com.startapp.sdk.internal.k5;
import com.startapp.sdk.internal.kb;
import com.startapp.sdk.internal.l5;
import com.startapp.sdk.internal.m3;
import com.startapp.sdk.internal.m4;
import com.startapp.sdk.internal.m5;
import com.startapp.sdk.internal.n4;
import com.startapp.sdk.internal.n5;
import com.startapp.sdk.internal.n8;
import com.startapp.sdk.internal.o3;
import com.startapp.sdk.internal.o4;
import com.startapp.sdk.internal.o5;
import com.startapp.sdk.internal.o8;
import com.startapp.sdk.internal.oa;
import com.startapp.sdk.internal.p;
import com.startapp.sdk.internal.p3;
import com.startapp.sdk.internal.p4;
import com.startapp.sdk.internal.p5;
import com.startapp.sdk.internal.pa;
import com.startapp.sdk.internal.q4;
import com.startapp.sdk.internal.r4;
import com.startapp.sdk.internal.s3;
import com.startapp.sdk.internal.s4;
import com.startapp.sdk.internal.s5;
import com.startapp.sdk.internal.t0;
import com.startapp.sdk.internal.t4;
import com.startapp.sdk.internal.uj;
import com.startapp.sdk.internal.v3;
import com.startapp.sdk.internal.v4;
import com.startapp.sdk.internal.w4;
import com.startapp.sdk.internal.w6;
import com.startapp.sdk.internal.y3;
import com.startapp.sdk.internal.yj;
import com.startapp.sdk.internal.z2;
import com.startapp.sdk.internal.z3;
import com.startapp.sdk.internal.z4;
import com.startapp.sdk.internal.zj;
import java.io.File;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class a {
    public static final p3 T = new p3();
    public final pa A;
    public final pa B;
    public final pa C;
    public final pa D;
    public final pa E;
    public final pa F;
    public final pa G;
    public final pa H;
    public final pa I;
    public final pa J;
    public final pa K;
    public final pa L;
    public final pa M;
    public final pa N;
    public final pa O;
    public final pa P;
    public final pa Q;
    public final pa R;
    public final pa S;

    /* renamed from: a, reason: collision with root package name */
    public final pa f160a;
    public final pa b;
    public final pa c;
    public final pa d;
    public final pa e;
    public final pa f;
    public final pa g;
    public final pa h;
    public final pa i;
    public final pa j;
    public final pa k;
    public final pa l;
    public final pa m;
    public final pa n;
    public final pa o;
    public final pa p;
    public final pa q;
    public final z3 r;
    public final pa s;
    public final pa t;
    public final pa u;
    public final pa v;
    public final pa w;
    public final pa x;
    public final pa y;
    public final pa z;

    public a(final Context context) {
        this.L = new pa(new n4(context));
        this.f160a = new pa(new c7() { // from class: com.startapp.sdk.components.a$$ExternalSyntheticLambda4
            @Override // com.startapp.sdk.internal.c7
            public final Object call() {
                return a.this.i(context);
            }
        });
        this.b = new pa(new c5(this, context));
        pa paVar = new pa(new l5());
        pa paVar2 = new pa(new m5());
        this.c = new pa(new n5(context));
        this.d = new pa(new o5(context));
        p5 p5Var = new p5();
        this.e = new pa(new s5(this, context, p5Var));
        this.f = new pa(new c3(this, context, p5Var));
        this.g = new pa(new e3(context));
        this.h = new pa(new g3(context));
        this.i = new pa(new h3(this, context));
        this.j = new pa(new i3(context));
        this.k = new pa(new j3());
        this.l = new pa(new k3(context));
        this.m = new pa(new m3(this));
        this.n = new pa(new o3(context));
        this.o = new pa(new s3(context));
        this.p = new pa(new v3(this, context, paVar));
        this.q = new pa(new y3(this, context));
        this.r = new z3(this, context);
        this.s = new pa(new c4(this, context));
        this.t = new pa(new e4(context));
        this.u = new pa(new g4(this, context));
        this.v = new pa(new h4(context));
        this.w = new pa(new j4(context));
        this.x = new pa(new m4(this, context));
        this.y = new pa(new o4());
        this.z = new pa(new c7() { // from class: com.startapp.sdk.components.a$$ExternalSyntheticLambda5
            @Override // com.startapp.sdk.internal.c7
            public final Object call() {
                return a.d();
            }
        });
        this.A = paVar2;
        this.B = paVar2;
        this.C = paVar2;
        this.D = new pa(new p4());
        this.E = new pa(new q4());
        this.F = new pa(new r4());
        this.G = new pa(new s4(context));
        this.H = new pa(new t4(context));
        this.I = new pa(new v4(context));
        this.J = new pa(new w4(context));
        this.K = new pa(new c7() { // from class: com.startapp.sdk.components.a$$ExternalSyntheticLambda6
            @Override // com.startapp.sdk.internal.c7
            public final Object call() {
                return a.this.f();
            }
        });
        this.M = new pa(new c7() { // from class: com.startapp.sdk.components.a$$ExternalSyntheticLambda7
            @Override // com.startapp.sdk.internal.c7
            public final Object call() {
                return a.this.c(context);
            }
        });
        this.N = new pa(new z4());
        this.O = new pa(new b5(this, context));
        this.P = new pa(new f5());
        this.Q = new pa(new g5(this));
        this.R = new pa(new i5(this, context));
        this.S = new pa(new c7() { // from class: com.startapp.sdk.components.a$$ExternalSyntheticLambda8
            @Override // com.startapp.sdk.internal.c7
            public final Object call() {
                return a.g(context);
            }
        });
    }

    public static /* synthetic */ WvfMetadata a(WvfMetadata wvfMetadata) {
        return wvfMetadata;
    }

    public static /* synthetic */ WvfMetadata b(WvfMetadata wvfMetadata) {
        return wvfMetadata;
    }

    public static /* synthetic */ kb c() {
        return new kb(Looper.getMainLooper());
    }

    public static /* synthetic */ ad d(Context context) {
        return new cd(context);
    }

    public static /* synthetic */ b g(final Context context) {
        return new b(new pa(new c7() { // from class: com.startapp.sdk.components.a$$ExternalSyntheticLambda0
            @Override // com.startapp.sdk.internal.c7
            public final Object call() {
                return a.d(context);
            }
        }), new pa(new c7() { // from class: com.startapp.sdk.components.a$$ExternalSyntheticLambda10
            @Override // com.startapp.sdk.internal.c7
            public final Object call() {
                VideoConfig F;
                F = AdsCommonMetaData.k().F();
                return F;
            }
        }), new pa(new c7() { // from class: com.startapp.sdk.components.a$$ExternalSyntheticLambda11
            @Override // com.startapp.sdk.internal.c7
            public final Object call() {
                SharedPreferences sharedPreferences;
                sharedPreferences = context.getSharedPreferences("StartApp-1ca91533efd75045", 0);
                return sharedPreferences;
            }
        }), new pa(new c7() { // from class: com.startapp.sdk.components.a$$ExternalSyntheticLambda12
            @Override // com.startapp.sdk.internal.c7
            public final Object call() {
                return a.f(context);
            }
        }), new z2() { // from class: com.startapp.sdk.components.a$$ExternalSyntheticLambda13
            @Override // com.startapp.sdk.internal.z2
            public final long a() {
                long uptimeMillis;
                uptimeMillis = SystemClock.uptimeMillis();
                return uptimeMillis;
            }
        });
    }

    public static /* synthetic */ af h(Context context) {
        return new af(context.getSharedPreferences("StartApp-fb8245cb9af2e955", 0));
    }

    public final w6 f() {
        return new w6(new a$$ExternalSyntheticLambda1(), new oa(new c7() { // from class: com.startapp.sdk.components.a$$ExternalSyntheticLambda2
            @Override // com.startapp.sdk.internal.c7
            public final Object call() {
                EventTracerMetadata s;
                s = MetaData.A().s();
                return s;
            }
        }), this.D, new Function2() { // from class: com.startapp.sdk.components.a$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return a.a((String) obj, (String) obj2);
            }
        });
    }

    public final uj i(final Context context) {
        final WvfMetadata Y = MetaData.A().Y();
        WeightedChoice c = Y != null ? Y.c() : null;
        String a2 = c != null ? c.a() : null;
        return FtsOptions.TOKENIZER_SIMPLE.equals(a2) ? new zj(context) : "dynamic".equals(a2) ? new yj(context, this.D, this.F, new pa(new c7() { // from class: com.startapp.sdk.components.a$$ExternalSyntheticLambda14
            @Override // com.startapp.sdk.internal.c7
            public final Object call() {
                return a.a();
            }
        }), new c7() { // from class: com.startapp.sdk.components.a$$ExternalSyntheticLambda15
            @Override // com.startapp.sdk.internal.c7
            public final Object call() {
                return a.a(WvfMetadata.this);
            }
        }) : new bk(context, new pa(new c7() { // from class: com.startapp.sdk.components.a$$ExternalSyntheticLambda16
            @Override // com.startapp.sdk.internal.c7
            public final Object call() {
                return a.h(context);
            }
        }), this.D, this.F, new pa(new c7() { // from class: com.startapp.sdk.components.a$$ExternalSyntheticLambda17
            @Override // com.startapp.sdk.internal.c7
            public final Object call() {
                return a.c();
            }
        }), new c7() { // from class: com.startapp.sdk.components.a$$ExternalSyntheticLambda18
            @Override // com.startapp.sdk.internal.c7
            public final Object call() {
                return a.b(WvfMetadata.this);
            }
        }, new a$$ExternalSyntheticLambda1());
    }

    public static a a(Context context) {
        a aVar;
        p3 p3Var = T;
        a aVar2 = p3Var.f374a;
        if (aVar2 != null) {
            return aVar2;
        }
        synchronized (p3Var) {
            aVar = p3Var.f374a;
            if (aVar == null) {
                Context a2 = t0.a(context);
                if (a2 != null) {
                    context = a2;
                }
                aVar = new a(context);
                p3Var.f374a = aVar;
            }
        }
        return aVar;
    }

    public static /* synthetic */ SharedPreferences b(Context context) {
        return new af(context.getSharedPreferences("StartApp-3389de2c2d518660", 0));
    }

    public static ScheduledExecutorService d() {
        return Executors.newScheduledThreadPool(0, new k5("scheduled"));
    }

    public final p c(final Context context) {
        return new p(context, new pa(new c7() { // from class: com.startapp.sdk.components.a$$ExternalSyntheticLambda9
            @Override // com.startapp.sdk.internal.c7
            public final Object call() {
                return a.b(context);
            }
        }), this.G, this.C, this.K, this.i, this.Q, this.S, this.f160a, this.l, this.m, this.A, this.w, this.b);
    }

    public static /* synthetic */ File f(Context context) {
        return new File(context.getCacheDir(), "StartIoVideos");
    }

    public static /* synthetic */ kb a() {
        return new kb(Looper.getMainLooper());
    }

    public static Unit a(String str, String str2) {
        n8 n8Var = new n8(o8.d);
        n8Var.d = "EVT";
        n8Var.i = str;
        n8Var.e = str2;
        n8Var.a();
        return Unit.INSTANCE;
    }

    public static ThreadPoolExecutor a(String str, int i, long j) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, i, j, TimeUnit.SECONDS, new LinkedTransferQueue<Runnable>() { // from class: com.startapp.sdk.components.ComponentLocator$43
            @Override // java.util.concurrent.LinkedTransferQueue, java.util.Queue, java.util.concurrent.BlockingQueue
            public final boolean offer(Object obj) {
                return tryTransfer((Runnable) obj);
            }
        }, new k5(str), new j5());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }
}
