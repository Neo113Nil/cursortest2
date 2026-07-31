package com.ironsource;

import android.content.Context;
import com.ironsource.C1454e2;
import com.ironsource.ag;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.lj;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.nm;
import com.ironsource.tq;
import com.ironsource.vl;
import com.ironsource.xh;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.LevelPlayConfiguration;
import com.unity3d.mediation.LevelPlayInitError;
import com.unity3d.mediation.LevelPlayInitListener;
import com.unity3d.mediation.LevelPlayInitRequest;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.AbstractC3219i;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class vl {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final vl f20083a = new vl();

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final wl f20084b = new wl();

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f20085c = false;

    @Metadata
    public static final class a implements rr {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LevelPlayInitRequest f20086a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f20087b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ib f20088c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ LevelPlayInitListener f20089d;

        a(LevelPlayInitRequest levelPlayInitRequest, Context context, ib ibVar, LevelPlayInitListener levelPlayInitListener) {
            this.f20086a = levelPlayInitRequest;
            this.f20087b = context;
            this.f20088c = ibVar;
            this.f20089d = levelPlayInitListener;
        }

        @Override // com.ironsource.rr
        public void a(@NotNull final lr sdkConfig) {
            Intrinsics.checkNotNullParameter(sdkConfig, "sdkConfig");
            wl wlVar = vl.f20084b;
            final LevelPlayInitRequest levelPlayInitRequest = this.f20086a;
            final Context context = this.f20087b;
            final ib ibVar = this.f20088c;
            final LevelPlayInitListener levelPlayInitListener = this.f20089d;
            wlVar.a(new Runnable() { // from class: com.ironsource.V3
                @Override // java.lang.Runnable
                public final void run() {
                    vl.a.a(LevelPlayInitRequest.this, sdkConfig, context, ibVar, levelPlayInitListener);
                }
            });
        }

        @Override // com.ironsource.rr
        public void a(@NotNull final nr error) {
            Intrinsics.checkNotNullParameter(error, "error");
            wl wlVar = vl.f20084b;
            final LevelPlayInitListener levelPlayInitListener = this.f20089d;
            final ib ibVar = this.f20088c;
            wlVar.a(new Runnable() { // from class: com.ironsource.W3
                @Override // java.lang.Runnable
                public final void run() {
                    vl.a.a(LevelPlayInitListener.this, ibVar, error);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(LevelPlayInitListener levelPlayInitListener, ib initDuration, nr error) {
            Intrinsics.checkNotNullParameter(initDuration, "$initDuration");
            Intrinsics.checkNotNullParameter(error, "$error");
            vl.f20083a.a(levelPlayInitListener, initDuration, error);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(LevelPlayInitRequest initRequest, lr sdkConfig, Context context, ib initDuration, LevelPlayInitListener levelPlayInitListener) {
            Intrinsics.checkNotNullParameter(initRequest, "$initRequest");
            Intrinsics.checkNotNullParameter(sdkConfig, "$sdkConfig");
            Intrinsics.checkNotNullParameter(context, "$context");
            Intrinsics.checkNotNullParameter(initDuration, "$initDuration");
            vl.f20083a.a(initRequest, sdkConfig, context, initDuration, levelPlayInitListener);
        }
    }

    @Metadata
    public static final class b implements rr {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LevelPlayInitRequest f20090a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f20091b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ib f20092c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ LevelPlayInitListener f20093d;

        b(LevelPlayInitRequest levelPlayInitRequest, Context context, ib ibVar, LevelPlayInitListener levelPlayInitListener) {
            this.f20090a = levelPlayInitRequest;
            this.f20091b = context;
            this.f20092c = ibVar;
            this.f20093d = levelPlayInitListener;
        }

        @Override // com.ironsource.rr
        public void a(@NotNull final lr sdkConfig) {
            Intrinsics.checkNotNullParameter(sdkConfig, "sdkConfig");
            wl wlVar = vl.f20084b;
            final LevelPlayInitRequest levelPlayInitRequest = this.f20090a;
            final Context context = this.f20091b;
            final ib ibVar = this.f20092c;
            final LevelPlayInitListener levelPlayInitListener = this.f20093d;
            wlVar.a(new Runnable() { // from class: com.ironsource.Y3
                @Override // java.lang.Runnable
                public final void run() {
                    vl.b.a(LevelPlayInitRequest.this, sdkConfig, context, ibVar, levelPlayInitListener);
                }
            });
        }

        @Override // com.ironsource.rr
        public void a(@NotNull final nr error) {
            Intrinsics.checkNotNullParameter(error, "error");
            wl wlVar = vl.f20084b;
            final LevelPlayInitListener levelPlayInitListener = this.f20093d;
            final ib ibVar = this.f20092c;
            wlVar.a(new Runnable() { // from class: com.ironsource.X3
                @Override // java.lang.Runnable
                public final void run() {
                    vl.b.a(LevelPlayInitListener.this, ibVar, error);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(LevelPlayInitListener levelPlayInitListener, ib initDuration, nr error) {
            Intrinsics.checkNotNullParameter(initDuration, "$initDuration");
            Intrinsics.checkNotNullParameter(error, "$error");
            vl.f20083a.a(levelPlayInitListener, initDuration, error);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(LevelPlayInitRequest initRequest, lr sdkConfig, Context context, ib initDuration, LevelPlayInitListener levelPlayInitListener) {
            Intrinsics.checkNotNullParameter(initRequest, "$initRequest");
            Intrinsics.checkNotNullParameter(sdkConfig, "$sdkConfig");
            Intrinsics.checkNotNullParameter(context, "$context");
            Intrinsics.checkNotNullParameter(initDuration, "$initDuration");
            vl.f20083a.a(initRequest, sdkConfig, context, initDuration, levelPlayInitListener);
        }
    }

    @Metadata
    static final class c extends kotlin.jvm.internal.s implements Function0<Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ fl f20094a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ib f20095b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f20096c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ LevelPlayInitListener f20097d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(fl flVar, ib ibVar, long j4, LevelPlayInitListener levelPlayInitListener) {
            super(0);
            this.f20094a = flVar;
            this.f20095b = ibVar;
            this.f20096c = j4;
            this.f20097d = levelPlayInitListener;
        }

        public final void a() {
            vl.f20083a.a(this.f20094a, this.f20095b, this.f20096c, this.f20097d);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f41027a;
        }
    }

    private vl() {
    }

    private final void c(Context context, LevelPlayInitRequest levelPlayInitRequest, LevelPlayInitListener levelPlayInitListener) {
        IronLog.API.info("LevelPlay.init() appkey: " + levelPlayInitRequest.getAppKey() + ", userId: " + levelPlayInitRequest.getUserId() + ", legacyAdFormats: " + levelPlayInitRequest.getLegacyAdFormats() + ", context: " + context.getClass().getSimpleName());
        ib ibVar = new ib();
        wl wlVar = f20084b;
        LevelPlay.AdFormat[] adFormatArr = (LevelPlay.AdFormat[]) levelPlayInitRequest.getLegacyAdFormats().toArray(new LevelPlay.AdFormat[0]);
        sr srVar = new sr(levelPlayInitRequest.getAppKey(), levelPlayInitRequest.getUserId(), AbstractC3219i.N0(wlVar.a((LevelPlay.AdFormat[]) Arrays.copyOf(adFormatArr, adFormatArr.length))));
        srVar.e().isEmpty();
        zr.f20581a.a(context, srVar, new a(levelPlayInitRequest, context, ibVar, levelPlayInitListener));
    }

    private final void a(long j4, Function0<Unit> function0) {
        if (nm.f18364r.d().t().c() || j4 <= 0) {
            function0.invoke();
        } else {
            f20084b.a(function0, j4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Context context, LevelPlayInitRequest initRequest, LevelPlayInitListener levelPlayInitListener) {
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(initRequest, "$initRequest");
        f20083a.c(context, initRequest, levelPlayInitListener);
    }

    public final void a(@NotNull final Context context, @NotNull final LevelPlayInitRequest initRequest, @Nullable final LevelPlayInitListener levelPlayInitListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(initRequest, "initRequest");
        f20084b.d(new Runnable() { // from class: com.ironsource.U3
            @Override // java.lang.Runnable
            public final void run() {
                vl.b(context, initRequest, levelPlayInitListener);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(final fl flVar, ib ibVar, long j4, final LevelPlayInitListener levelPlayInitListener) {
        nm.f18364r.a().D().d();
        long a4 = ib.a(ibVar);
        wl wlVar = f20084b;
        wlVar.a(a4, flVar.f(), j4);
        wlVar.e(new Runnable() { // from class: com.ironsource.T3
            @Override // java.lang.Runnable
            public final void run() {
                vl.a(LevelPlayInitListener.this, flVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(nr error, LevelPlayInitListener levelPlayInitListener) {
        Intrinsics.checkNotNullParameter(error, "$error");
        IronLog.CALLBACK.info("LevelPlayInitListener.LevelPlayInitError() error: " + error);
        if (levelPlayInitListener != null) {
            levelPlayInitListener.onInitFailed(new LevelPlayInitError(error));
        }
    }

    public static /* synthetic */ void a(vl vlVar, Context context, LevelPlayInitRequest levelPlayInitRequest, LevelPlayInitListener levelPlayInitListener, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            levelPlayInitListener = null;
        }
        vlVar.a(context, levelPlayInitRequest, levelPlayInitListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(LevelPlayInitListener levelPlayInitListener, fl levelPlayConfig) {
        Intrinsics.checkNotNullParameter(levelPlayConfig, "$levelPlayConfig");
        IronLog.CALLBACK.info("LevelPlayInitListener.onInitSuccess()");
        if (levelPlayInitListener != null) {
            levelPlayInitListener.onInitSuccess(new LevelPlayConfiguration(levelPlayConfig.j()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(final LevelPlayInitListener levelPlayInitListener, ib ibVar, final nr nrVar) {
        long a4 = ib.a(ibVar);
        wl wlVar = f20084b;
        wlVar.a(nrVar, a4);
        wlVar.e(new Runnable() { // from class: com.ironsource.S3
            @Override // java.lang.Runnable
            public final void run() {
                vl.a(nr.this, levelPlayInitListener);
            }
        });
    }

    private final void a(LevelPlayInitRequest levelPlayInitRequest, fl flVar) {
        LevelPlay.AdFormat adFormat = LevelPlay.AdFormat.REWARDED;
        if (a(levelPlayInitRequest, adFormat) && flVar.d().c().f() != null) {
            tq.a aVar = tq.f19813z;
            IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.REWARDED_VIDEO;
            tq a4 = aVar.a(new C1460f1(ad_unit, mf.f18026a.a(), "", null, null, 24, null), flVar, true);
            List<ao> c4 = flVar.c(adFormat);
            C1454e2.b bVar = C1454e2.b.MEDIATION;
            new yp(new C1585w2(new C1525o1(ad_unit, bVar), a4, bVar), adFormat, c4, a4).a();
        }
        LevelPlay.AdFormat adFormat2 = LevelPlay.AdFormat.INTERSTITIAL;
        if (a(levelPlayInitRequest, adFormat2) && flVar.d().c().d() != null) {
            lj.a aVar2 = lj.f17088z;
            IronSource.AD_UNIT ad_unit2 = IronSource.AD_UNIT.INTERSTITIAL;
            lj a5 = aVar2.a(new C1460f1(ad_unit2, mf.f18026a.a(), "", null, null, 24, null), flVar, true);
            List<ao> c5 = flVar.c(adFormat2);
            C1454e2.b bVar2 = C1454e2.b.MEDIATION;
            new yp(new C1585w2(new C1525o1(ad_unit2, bVar2), a5, bVar2), adFormat2, c5, a5).a();
        }
        LevelPlay.AdFormat adFormat3 = LevelPlay.AdFormat.BANNER;
        if (!a(levelPlayInitRequest, adFormat3) || flVar.d().c().c() == null) {
            return;
        }
        m6 a6 = m6.f17194z.a(new j6(), flVar, true);
        List<ao> c6 = flVar.c(adFormat3);
        IronSource.AD_UNIT ad_unit3 = IronSource.AD_UNIT.BANNER;
        C1454e2.b bVar3 = C1454e2.b.MEDIATION;
        new yp(new C1585w2(new C1525o1(ad_unit3, bVar3), a6, bVar3), adFormat3, c6, a6).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(LevelPlayInitRequest levelPlayInitRequest, lr lrVar, Context context, ib ibVar, LevelPlayInitListener levelPlayInitListener) {
        nm.b bVar = nm.f18364r;
        xh.a D4 = bVar.a().D();
        fl flVar = new fl(lrVar);
        if (flVar.k()) {
            f20084b.a(context);
        }
        ag.a a4 = bVar.a().a();
        wl wlVar = f20084b;
        flVar.b(wlVar).a(a4);
        flVar.a(wlVar).a(bVar.a().w());
        flVar.c(wlVar).a(bVar.a().A());
        vl vlVar = f20083a;
        vlVar.a(levelPlayInitRequest, flVar);
        long b4 = bVar.d().d().b();
        vlVar.a(b4, new c(flVar, ibVar, b4, levelPlayInitListener));
        D4.a(flVar);
        if (lrVar.a().e()) {
            new fq(null, null, null, IronSourceThreadManager.INSTANCE.getThreadPoolExecutor(), 7, null).c(context);
        }
    }

    private final boolean a(LevelPlayInitRequest levelPlayInitRequest, LevelPlay.AdFormat adFormat) {
        return !levelPlayInitRequest.getLegacyAdFormats().contains(adFormat);
    }
}
