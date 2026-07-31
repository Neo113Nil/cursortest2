package com.ironsource;

import android.content.Context;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.jp;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.yr;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class yr {

    /* renamed from: b, reason: collision with root package name */
    private static ps f20467b;

    /* renamed from: h, reason: collision with root package name */
    @Nullable
    private static lr f20473h;

    /* renamed from: i, reason: collision with root package name */
    @Nullable
    private static nr f20474i;

    /* renamed from: j, reason: collision with root package name */
    private static boolean f20475j;

    /* renamed from: k, reason: collision with root package name */
    private static long f20476k;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final yr f20466a = new yr();

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final W1.h f20468c = W1.i.b(a.f20477a);

    /* renamed from: d, reason: collision with root package name */
    private static final String f20469d = yr.class.getSimpleName();

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private static final cs f20470e = new cs();

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private static final ks f20471f = new ks();

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private static final List<rr> f20472g = new ArrayList();

    @Metadata
    static final class a extends kotlin.jvm.internal.s implements Function0<cf> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f20477a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final cf invoke() {
            return nm.f18364r.d().v();
        }
    }

    @Metadata
    public static final class b implements rr {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f20478a;

        b(Context context) {
            this.f20478a = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(Context applicationContext, lr sdkConfig) {
            Intrinsics.checkNotNullParameter(sdkConfig, "$sdkConfig");
            yr yrVar = yr.f20466a;
            Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
            yrVar.a(applicationContext, sdkConfig);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(nr error) {
            Intrinsics.checkNotNullParameter(error, "$error");
            yr.f20466a.a(error);
        }

        @Override // com.ironsource.rr
        public void a(@NotNull final lr sdkConfig) {
            Intrinsics.checkNotNullParameter(sdkConfig, "sdkConfig");
            cs csVar = yr.f20470e;
            final Context context = this.f20478a;
            csVar.a(new Runnable() { // from class: com.ironsource.J5
                @Override // java.lang.Runnable
                public final void run() {
                    yr.b.a(context, sdkConfig);
                }
            });
        }

        @Override // com.ironsource.rr
        public void a(@NotNull final nr error) {
            Intrinsics.checkNotNullParameter(error, "error");
            yr.f20470e.a(new Runnable() { // from class: com.ironsource.I5
                @Override // java.lang.Runnable
                public final void run() {
                    yr.b.b(nr.this);
                }
            });
        }
    }

    private yr() {
    }

    private final as b() {
        return f20473h != null ? as.INITIATED : f20474i != null ? as.INIT_FAILED : f20475j ? as.INIT_IN_PROGRESS : as.NOT_INIT;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f() {
        f20466a.a(true);
    }

    public final void e() {
        f20470e.c(new Runnable() { // from class: com.ironsource.H5
            @Override // java.lang.Runnable
            public final void run() {
                yr.f();
            }
        });
    }

    private final void a(Context context, bk bkVar, ms msVar) {
        bkVar.h(msVar.f().h());
        bkVar.b(msVar.f().d());
        C1428a4 b4 = msVar.c().b();
        Intrinsics.checkNotNull(b4);
        bkVar.a(b4.a());
        bkVar.c(b4.b().b());
        bkVar.b(b4.j().b());
        bkVar.a(Boolean.valueOf(IronSourceUtils.getFirstSession(context)));
        C1428a4 b5 = msVar.c().b();
        Intrinsics.checkNotNull(b5);
        bkVar.b(b5.e().b());
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void b(Context context, lr lrVar) {
        C1477h4 g4;
        String str;
        boolean a4;
        sm e4;
        C1477h4 g5;
        u6 c4;
        C1477h4 g6;
        nj d4;
        C1477h4 i4;
        zq f4;
        C1477h4 m4;
        ms d5 = lrVar.d();
        s8 c5 = d5.c();
        boolean l4 = (c5 == null || (f4 = c5.f()) == null || (m4 = f4.m()) == null) ? false : m4.l();
        s8 c6 = d5.c();
        boolean l5 = (c6 == null || (d4 = c6.d()) == null || (i4 = d4.i()) == null) ? false : i4.l();
        s8 c7 = d5.c();
        boolean l6 = (c7 == null || (c4 = c7.c()) == null || (g6 = c4.g()) == null) ? false : g6.l();
        s8 c8 = d5.c();
        boolean l7 = (c8 == null || (e4 = c8.e()) == null || (g5 = e4.g()) == null) ? false : g5.l();
        if (l4) {
            s8 c9 = d5.c();
            zq f5 = c9 != null ? c9.f() : null;
            Intrinsics.checkNotNull(f5);
            C1477h4 rewardedVideoConfig = f5.m();
            Intrinsics.checkNotNullExpressionValue(rewardedVideoConfig, "rewardedVideoConfig");
            b(rewardedVideoConfig, context, d5);
        } else {
            br.i().b(false);
        }
        if (l5) {
            s8 c10 = d5.c();
            nj d6 = c10 != null ? c10.d() : null;
            Intrinsics.checkNotNull(d6);
            g4 = d6.i();
            str = "interstitialConfig";
        } else if (l6) {
            s8 c11 = d5.c();
            u6 c12 = c11 != null ? c11.c() : null;
            Intrinsics.checkNotNull(c12);
            g4 = c12.g();
            str = "bannerConfig";
        } else {
            if (l7) {
                s8 c13 = d5.c();
                sm e5 = c13 != null ? c13.e() : null;
                Intrinsics.checkNotNull(e5);
                g4 = e5.g();
                a(g4, context, d5);
                s8 c14 = d5.c();
                C1428a4 b4 = c14 != null ? c14.b() : null;
                Intrinsics.checkNotNull(b4);
                kp h4 = b4.h();
                a4 = h4.a();
                String b5 = h4.b();
                boolean c15 = h4.c();
                int d7 = h4.d();
                int[] e6 = h4.e();
                int[] f6 = h4.f();
                jp jpVar = jp.f16866P;
                jpVar.b(a4);
                if (a4) {
                    jpVar.b(b5, context);
                    jpVar.c(e6, context);
                    jpVar.a(f6, context);
                    jpVar.a(c15);
                    jpVar.d(d7);
                    return;
                }
                return;
            }
            pj.i().b(false);
            s8 c142 = d5.c();
            if (c142 != null) {
            }
            Intrinsics.checkNotNull(b4);
            kp h42 = b4.h();
            a4 = h42.a();
            String b52 = h42.b();
            boolean c152 = h42.c();
            int d72 = h42.d();
            int[] e62 = h42.e();
            int[] f62 = h42.f();
            jp jpVar2 = jp.f16866P;
            jpVar2.b(a4);
            if (a4) {
            }
        }
        Intrinsics.checkNotNullExpressionValue(g4, str);
        a(g4, context, d5);
        s8 c1422 = d5.c();
        if (c1422 != null) {
        }
        Intrinsics.checkNotNull(b4);
        kp h422 = b4.h();
        a4 = h422.a();
        String b522 = h422.b();
        boolean c1522 = h422.c();
        int d722 = h422.d();
        int[] e622 = h422.e();
        int[] f622 = h422.f();
        jp jpVar22 = jp.f16866P;
        jpVar22.b(a4);
        if (a4) {
        }
    }

    private final cf c() {
        return (cf) f20468c.getValue();
    }

    private final void d() {
        if (nm.f18364r.d().d().g()) {
            br.i().a(new zb(IronSourceConstants.EP_CONFIG_RECEIVED, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(Context context, lr lrVar) {
        b(lrVar);
        C1498k4 a4 = lrVar.a();
        xa xaVar = xa.f20303a;
        xaVar.c(a4.g());
        nm.f18364r.a().x().a(a4.c());
        xaVar.a(a4.f());
        xaVar.a(a4.j());
        IronSourceThreadManager.INSTANCE.setUseSharedExecutorService(a4.h());
        c().a(a4);
        cs csVar = f20470e;
        a(context, csVar.c(), lrVar.d());
        csVar.a(new Date().getTime() - f20476k, lrVar.f());
        ps psVar = new ps();
        f20467b = psVar;
        psVar.a(c());
        IronSourceUtils.saveLastResponse(context, lrVar.d().toString());
        pj.i().c(true);
        br.i().c(true);
        jp.f16866P.c(true);
        b(context, lrVar);
        IronSourceLoggerManager.getLogger(0).setDebugLevel(lrVar.e().b());
        C1449d4 b4 = lrVar.b();
        if (b4.f()) {
            csVar.a(b4);
        }
        a(lrVar);
        new jp.a().a();
        d();
    }

    private final void b(C1477h4 c1477h4, Context context, ms msVar) {
        br.i().a(c1477h4.c(), context);
        br.i().b(c1477h4.d(), context);
        br.i().b(c1477h4.f());
        br.i().a(c1477h4.e());
        br.i().c(c1477h4.a());
        br.i().c(c1477h4.i(), context);
        br.i().a(c1477h4.h(), context);
        br.i().b(c1477h4.j(), context);
        br.i().d(c1477h4.g(), context);
        br i4 = br.i();
        C1428a4 b4 = msVar.c().b();
        Intrinsics.checkNotNull(b4);
        i4.a(b4.i());
        br.i().a(c1477h4.k());
        br.i().d(c1477h4.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(nr error) {
        Intrinsics.checkNotNullParameter(error, "$error");
        f20466a.a(error);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Context context, rr listener, sr initRequest, Context context2) {
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(listener, "$listener");
        Intrinsics.checkNotNullParameter(initRequest, "$initRequest");
        C1486j.f16777a.a(context);
        lr lrVar = f20473h;
        if (lrVar != null) {
            f20466a.a(listener, lrVar);
            return;
        }
        f20472g.add(listener);
        if (f20475j) {
            return;
        }
        f20474i = null;
        f20466a.a(true);
        f20476k = new Date().getTime();
        f20471f.a(context, initRequest, f20470e, new b(context2));
    }

    private final void b(lr lrVar) {
        f20473h = lrVar;
        a(false);
    }

    public final void a(@NotNull final Context context, @NotNull final sr initRequest, @NotNull final rr listener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(initRequest, "initRequest");
        Intrinsics.checkNotNullParameter(listener, "listener");
        final Context applicationContext = context.getApplicationContext();
        f20470e.c(new Runnable() { // from class: com.ironsource.G5
            @Override // java.lang.Runnable
            public final void run() {
                yr.a(context, listener, initRequest, applicationContext);
            }
        });
    }

    public final void b(@NotNull final nr error) {
        Intrinsics.checkNotNullParameter(error, "error");
        f20470e.c(new Runnable() { // from class: com.ironsource.D5
            @Override // java.lang.Runnable
            public final void run() {
                yr.c(nr.this);
            }
        });
    }

    private final void a(C1477h4 c1477h4, Context context, ms msVar) {
        pj.i().a(c1477h4.c(), context);
        pj.i().b(c1477h4.d(), context);
        pj.i().b(c1477h4.f());
        pj.i().a(c1477h4.e());
        pj.i().c(c1477h4.a());
        pj.i().c(c1477h4.i(), context);
        pj.i().a(c1477h4.h(), context);
        pj.i().b(c1477h4.j(), context);
        pj.i().d(c1477h4.g(), context);
        pj i4 = pj.i();
        C1428a4 b4 = msVar.c().b();
        Intrinsics.checkNotNull(b4);
        i4.a(b4.i());
        pj.i().a(c1477h4.k());
        pj.i().d(c1477h4.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(rr listener, lr sdkConfig) {
        Intrinsics.checkNotNullParameter(listener, "$listener");
        Intrinsics.checkNotNullParameter(sdkConfig, "$sdkConfig");
        listener.a(sdkConfig);
    }

    private final void a(lr lrVar) {
        Iterator<rr> it = f20472g.iterator();
        while (it.hasNext()) {
            a(it.next(), lrVar);
        }
        f20472g.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(rr listener, nr error) {
        Intrinsics.checkNotNullParameter(listener, "$listener");
        Intrinsics.checkNotNullParameter(error, "$error");
        listener.a(error);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(nr nrVar) {
        f20474i = nrVar;
        a(false);
        Iterator<rr> it = f20472g.iterator();
        while (it.hasNext()) {
            a(it.next(), nrVar);
        }
        f20472g.clear();
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, "Mediation availability false reason: " + nrVar, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(tr serverResponse) {
        Intrinsics.checkNotNullParameter(serverResponse, "$serverResponse");
        lr lrVar = new lr(serverResponse);
        yr yrVar = f20466a;
        yrVar.b(lrVar);
        yrVar.a(lrVar);
    }

    private final void a(final rr rrVar, final lr lrVar) {
        f20470e.e(new Runnable() { // from class: com.ironsource.F5
            @Override // java.lang.Runnable
            public final void run() {
                yr.b(rr.this, lrVar);
            }
        });
    }

    private final void a(final rr rrVar, final nr nrVar) {
        f20470e.e(new Runnable() { // from class: com.ironsource.E5
            @Override // java.lang.Runnable
            public final void run() {
                yr.b(rr.this, nrVar);
            }
        });
    }

    public final void a(@NotNull final tr serverResponse) {
        Intrinsics.checkNotNullParameter(serverResponse, "serverResponse");
        f20470e.c(new Runnable() { // from class: com.ironsource.C5
            @Override // java.lang.Runnable
            public final void run() {
                yr.b(tr.this);
            }
        });
    }

    private final void a(boolean z4) {
        f20475j = z4;
        f20470e.a(b());
    }
}
