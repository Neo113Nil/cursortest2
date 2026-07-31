package com.ironsource;

import android.app.Activity;
import com.ironsource.C1454e2;
import com.ironsource.C1525o1;
import com.ironsource.InterfaceC1488j1;
import com.ironsource.environment.ContextProvider;
import com.ironsource.gd;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.rewarded.LevelPlayReward;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class hl implements fd {

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    public static final a f16600m = new a(null);

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    public static final String f16601n = "Fullscreen Ad Internal";

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final LevelPlay.AdFormat f16602a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f16603b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C1525o1 f16604c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final ed f16605d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final InterfaceC1590x1 f16606e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final yf f16607f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final q9 f16608g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final W1.h f16609h;

    /* renamed from: i, reason: collision with root package name */
    @Nullable
    private il f16610i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final UUID f16611j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private od f16612k;

    /* renamed from: l, reason: collision with root package name */
    @Nullable
    private ib f16613l;

    @Metadata
    public static final class a {
        private a() {
        }

        public final boolean a(@NotNull String placementName, @NotNull LevelPlay.AdFormat adFormat) {
            Intrinsics.checkNotNullParameter(placementName, "placementName");
            Intrinsics.checkNotNullParameter(adFormat, "adFormat");
            C1525o1 a4 = C1525o1.a.a(com.unity3d.mediation.a.a(adFormat), C1454e2.b.MEDIATION);
            if (!a4.g()) {
                a4.e().a().a(placementName, "SDK is not initialized", false);
                return false;
            }
            l8 a5 = nm.f18364r.d().y().a(placementName, adFormat);
            boolean d4 = a5.d();
            a4.e().a().a(placementName, a5.e(), d4);
            return d4;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final C1525o1 f16614a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final ed f16615b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final yf f16616c;

        /* renamed from: d, reason: collision with root package name */
        @NotNull
        private final q9 f16617d;

        /* renamed from: e, reason: collision with root package name */
        @NotNull
        private final mf f16618e;

        public b(@NotNull C1525o1 adTools, @NotNull ed adControllerFactory, @NotNull yf provider, @NotNull q9 currentTimeProvider, @NotNull mf idFactory) {
            Intrinsics.checkNotNullParameter(adTools, "adTools");
            Intrinsics.checkNotNullParameter(adControllerFactory, "adControllerFactory");
            Intrinsics.checkNotNullParameter(provider, "provider");
            Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
            Intrinsics.checkNotNullParameter(idFactory, "idFactory");
            this.f16614a = adTools;
            this.f16615b = adControllerFactory;
            this.f16616c = provider;
            this.f16617d = currentTimeProvider;
            this.f16618e = idFactory;
        }

        @NotNull
        public final ed a() {
            return this.f16615b;
        }

        @NotNull
        public final C1525o1 b() {
            return this.f16614a;
        }

        @NotNull
        public final q9 c() {
            return this.f16617d;
        }

        @NotNull
        public final mf d() {
            return this.f16618e;
        }

        @NotNull
        public final yf e() {
            return this.f16616c;
        }
    }

    @Metadata
    static final class c extends kotlin.jvm.internal.s implements Function0<dd> {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final dd invoke() {
            return hl.this.c();
        }
    }

    @Metadata
    public static final class d implements qd {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C1460f1 f16621b;

        d(C1460f1 c1460f1) {
            this.f16621b = c1460f1;
        }

        @Override // com.ironsource.qd
        @NotNull
        public pd a(boolean z4, @NotNull sd listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            AbstractC1584w1 a4 = hl.this.h().a(z4, this.f16621b);
            return new pd(nm.f18364r.c(), new C1585w2(hl.this.g(), a4, C1454e2.b.MEDIATION), a4, listener, null, null, null, null, 240, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public hl(@NotNull LevelPlay.AdFormat adFormat, @NotNull String adUnitId, @NotNull C1525o1 adTools, @NotNull ed fullscreenAdControllerFactory, @NotNull InterfaceC1590x1 adUnitDataFactory, @NotNull yf mediationServicesProvider, @NotNull q9 currentTimeProvider, @NotNull mf idFactory) {
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(fullscreenAdControllerFactory, "fullscreenAdControllerFactory");
        Intrinsics.checkNotNullParameter(adUnitDataFactory, "adUnitDataFactory");
        Intrinsics.checkNotNullParameter(mediationServicesProvider, "mediationServicesProvider");
        Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        Intrinsics.checkNotNullParameter(idFactory, "idFactory");
        this.f16602a = adFormat;
        this.f16603b = adUnitId;
        this.f16604c = adTools;
        this.f16605d = fullscreenAdControllerFactory;
        this.f16606e = adUnitDataFactory;
        this.f16607f = mediationServicesProvider;
        this.f16608g = currentTimeProvider;
        this.f16609h = W1.i.b(new c());
        UUID a4 = idFactory.a();
        this.f16611j = a4;
        this.f16612k = new gd(this, null, 2, 0 == true ? 1 : 0);
        adTools.e().a(new C1523o(com.unity3d.mediation.a.a(adFormat), a4, adUnitId));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final dd c() {
        C1460f1 c1460f1 = new C1460f1(com.unity3d.mediation.a.a(this.f16602a), this.f16611j, this.f16603b, null, this.f16607f.o().a(), 8, null);
        d dVar = new d(c1460f1);
        ac e4 = this.f16604c.e();
        C1525o1 c1525o1 = this.f16604c;
        e4.a(new C1440c2(c1525o1, c1460f1, c1525o1.b(this.f16602a, this.f16603b).b().b()));
        return this.f16605d.a(this, this.f16604c, c1460f1, dVar);
    }

    @NotNull
    public final dd d() {
        return (dd) this.f16609h.getValue();
    }

    @NotNull
    public final LevelPlay.AdFormat e() {
        return this.f16602a;
    }

    @NotNull
    public final UUID f() {
        return this.f16611j;
    }

    @Override // com.ironsource.fd
    public void onAdClicked() {
        this.f16604c.d(new Runnable() { // from class: com.ironsource.D1
            @Override // java.lang.Runnable
            public final void run() {
                hl.c(hl.this);
            }
        });
    }

    @Override // com.ironsource.fd
    public void onAdClosed() {
        this.f16604c.d(new Runnable() { // from class: com.ironsource.J1
            @Override // java.lang.Runnable
            public final void run() {
                hl.d(hl.this);
            }
        });
    }

    @Override // com.ironsource.fd
    public void onAdInfoChanged(@NotNull final LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f16604c.d(new Runnable() { // from class: com.ironsource.O1
            @Override // java.lang.Runnable
            public final void run() {
                hl.b(hl.this, adInfo);
            }
        });
    }

    @Override // com.ironsource.fd
    public void onAdLoadFailed(@NotNull final LevelPlayAdError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f16604c.d(new Runnable() { // from class: com.ironsource.K1
            @Override // java.lang.Runnable
            public final void run() {
                hl.c(hl.this, error);
            }
        });
    }

    @Override // com.ironsource.fd
    public void onAdLoaded(@NotNull final LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f16604c.d(new Runnable() { // from class: com.ironsource.E1
            @Override // java.lang.Runnable
            public final void run() {
                hl.c(hl.this, adInfo);
            }
        });
    }

    public /* synthetic */ hl(LevelPlay.AdFormat adFormat, String str, C1525o1 c1525o1, ed edVar, InterfaceC1590x1 interfaceC1590x1, yf yfVar, q9 q9Var, mf mfVar, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(adFormat, str, c1525o1, edVar, interfaceC1590x1, (i4 & 32) != 0 ? nm.f18364r.d() : yfVar, q9Var, mfVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(hl this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f16612k.onAdClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(hl this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f16612k.onAdClosed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(hl this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f16612k.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(hl this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f16612k.a();
    }

    @Override // com.ironsource.fd
    public void a() {
        this.f16604c.d(new Runnable() { // from class: com.ironsource.R1
            @Override // java.lang.Runnable
            public final void run() {
                hl.f(hl.this);
            }
        });
    }

    @Override // com.ironsource.fd
    public void b() {
        this.f16604c.d(new Runnable() { // from class: com.ironsource.C1
            @Override // java.lang.Runnable
            public final void run() {
                hl.e(hl.this);
            }
        });
    }

    @NotNull
    public final C1525o1 g() {
        return this.f16604c;
    }

    @NotNull
    public final InterfaceC1590x1 h() {
        return this.f16606e;
    }

    @NotNull
    public final String i() {
        return this.f16603b;
    }

    @NotNull
    public final q9 j() {
        return this.f16608g;
    }

    @NotNull
    public final ed k() {
        return this.f16605d;
    }

    @Nullable
    public final il l() {
        return this.f16610i;
    }

    @NotNull
    public final yf m() {
        return this.f16607f;
    }

    public final boolean n() {
        InterfaceC1488j1 d4 = this.f16612k.d();
        this.f16604c.e().e().a(Boolean.valueOf(d4.a()), d4 instanceof InterfaceC1488j1.a ? ((InterfaceC1488j1.a) d4).c() : null);
        return d4.a();
    }

    public final void o() {
        this.f16613l = new ib();
        this.f16604c.d(new Runnable() { // from class: com.ironsource.M1
            @Override // java.lang.Runnable
            public final void run() {
                hl.b(hl.this);
            }
        });
    }

    public final void p() {
        a(new ld(this, this.f16608g));
        d().i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Activity activity, hl this$0, String str) {
        Intrinsics.checkNotNullParameter(activity, "$activity");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ContextProvider.getInstance().updateActivity(activity);
        this$0.f16604c.e().h().d();
        this$0.f16612k.a(activity, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(hl this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f16604c.e().f().a();
        this$0.f16612k.loadAd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(hl this$0, LevelPlayAdError error) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(error, "$error");
        this$0.f16612k.onAdLoadFailed(error);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(hl this$0, LevelPlayAdError error) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(error, "$error");
        this$0.f16612k.a(error);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(hl this$0, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(adInfo, "$adInfo");
        this$0.f16612k.onAdLoaded(adInfo);
    }

    public final void a(@NotNull final Activity activity, @Nullable final String str) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f16604c.d(new Runnable() { // from class: com.ironsource.N1
            @Override // java.lang.Runnable
            public final void run() {
                hl.a(activity, this, str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(hl this$0, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(adInfo, "$adInfo");
        this$0.f16612k.onAdInfoChanged(adInfo);
    }

    public final void a(@NotNull gd.a status) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.f16612k = new gd(this, status);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(hl this$0, long j4) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f16604c.e().f().a(j4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(hl this$0, long j4, LevelPlayAdError levelPlayAdError) {
        String str;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        wo f4 = this$0.f16604c.e().f();
        int errorCode = levelPlayAdError != null ? levelPlayAdError.getErrorCode() : 0;
        if (levelPlayAdError == null || (str = levelPlayAdError.getErrorMessage()) == null) {
            str = "";
        }
        f4.a(j4, errorCode, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(hl this$0, LevelPlayAdError error) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(error, "$error");
        this$0.f16604c.e().h().a(error);
    }

    public static /* synthetic */ void a(hl hlVar, LevelPlayAdError levelPlayAdError, long j4, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            j4 = 0;
        }
        hlVar.a(levelPlayAdError, j4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(hl this$0, LevelPlayAdError error, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(error, "$error");
        Intrinsics.checkNotNullParameter(adInfo, "$adInfo");
        il ilVar = this$0.f16610i;
        if (ilVar != null) {
            ilVar.onAdDisplayFailed(error, adInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(hl this$0, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(adInfo, "$adInfo");
        il ilVar = this$0.f16610i;
        if (ilVar != null) {
            ilVar.onAdLoaded(adInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(hl this$0, LevelPlayReward reward) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(reward, "$reward");
        il ilVar = this$0.f16610i;
        if (ilVar != null) {
            ilVar.onAdRewarded(reward, this$0.f16612k.c());
        }
    }

    public final void a(@Nullable il ilVar) {
        this.f16610i = ilVar;
    }

    public final void a(@NotNull od state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f16612k = state;
    }

    @Override // com.ironsource.fd
    public void a(@NotNull final LevelPlayAdError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f16604c.d(new Runnable() { // from class: com.ironsource.L1
            @Override // java.lang.Runnable
            public final void run() {
                hl.b(hl.this, error);
            }
        });
    }

    public final void a(@Nullable final LevelPlayAdError levelPlayAdError, final long j4) {
        IronLog.INTERNAL.verbose(C1525o1.a(this.f16604c, "onAdLoadFailed error: " + levelPlayAdError, (String) null, 2, (Object) null));
        this.f16604c.d(new Runnable() { // from class: com.ironsource.P1
            @Override // java.lang.Runnable
            public final void run() {
                hl.a(hl.this, j4, levelPlayAdError);
            }
        });
        this.f16604c.e(new Runnable() { // from class: com.ironsource.Q1
            @Override // java.lang.Runnable
            public final void run() {
                hl.a(LevelPlayAdError.this, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(LevelPlayAdError levelPlayAdError, hl this$0) {
        il ilVar;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (levelPlayAdError == null || (ilVar = this$0.f16610i) == null) {
            return;
        }
        ilVar.onAdLoadFailed(levelPlayAdError);
    }

    public final void a(@NotNull final LevelPlayAdError error, @NotNull final LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        IronLog.INTERNAL.verbose(C1525o1.a(this.f16604c, "onAdDisplayFailed error: " + error + ", adInfo: " + adInfo, (String) null, 2, (Object) null));
        this.f16604c.d(new Runnable() { // from class: com.ironsource.H1
            @Override // java.lang.Runnable
            public final void run() {
                hl.a(hl.this, error);
            }
        });
        this.f16604c.e(new Runnable() { // from class: com.ironsource.I1
            @Override // java.lang.Runnable
            public final void run() {
                hl.a(hl.this, error, adInfo);
            }
        });
    }

    public final void a(@NotNull final LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        IronLog.INTERNAL.verbose(C1525o1.a(this.f16604c, "onAdLoaded adInfo: " + adInfo, (String) null, 2, (Object) null));
        final long a4 = ib.a(this.f16613l);
        this.f16604c.d(new Runnable() { // from class: com.ironsource.F1
            @Override // java.lang.Runnable
            public final void run() {
                hl.a(hl.this, a4);
            }
        });
        this.f16604c.e(new Runnable() { // from class: com.ironsource.G1
            @Override // java.lang.Runnable
            public final void run() {
                hl.a(hl.this, adInfo);
            }
        });
    }

    @Override // com.ironsource.fd
    public void a(@NotNull final LevelPlayReward reward) {
        Intrinsics.checkNotNullParameter(reward, "reward");
        IronLog.INTERNAL.verbose(C1525o1.a(this.f16604c, "onAdRewarded adInfo: " + this.f16612k.c() + " reward: " + reward, (String) null, 2, (Object) null));
        this.f16604c.e(new Runnable() { // from class: com.ironsource.S1
            @Override // java.lang.Runnable
            public final void run() {
                hl.a(hl.this, reward);
            }
        });
    }

    public final void a(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f16604c.e().h().f("Fullscreen Ad Internal - " + message);
    }
}
