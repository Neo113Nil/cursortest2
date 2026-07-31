package com.ironsource;

import android.app.Activity;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.ironsource.C1454e2;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.q9;
import com.ironsource.sl;
import com.ironsource.vt;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.rewarded.LevelPlayReward;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.a;
import n2.EnumC3267b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class pd implements id {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final nm f18628a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C1585w2 f18629b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final AbstractC1584w1 f18630c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final sd f18631d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    private final h2.n f18632e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final vt f18633f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final q9 f18634g;

    /* renamed from: h, reason: collision with root package name */
    @Nullable
    private a f18635h;

    /* renamed from: i, reason: collision with root package name */
    @Nullable
    private InterfaceC1596y1 f18636i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final zv f18637j;

    /* renamed from: k, reason: collision with root package name */
    @Nullable
    private vt.a f18638k;

    /* renamed from: l, reason: collision with root package name */
    @Nullable
    private Long f18639l;

    @Metadata
    public interface a {
        void a();

        void a(@Nullable IronSourceError ironSourceError);

        void a(@NotNull LevelPlayAdInfo levelPlayAdInfo);

        void b(@NotNull LevelPlayAdInfo levelPlayAdInfo);
    }

    @Metadata
    public static final class b implements gw {
        b() {
        }

        @Override // com.ironsource.gw
        public void a(int i4, @NotNull String errorReason) {
            Long l4;
            Intrinsics.checkNotNullParameter(errorReason, "errorReason");
            Long l5 = pd.this.f18639l;
            if (l5 != null) {
                l4 = Long.valueOf(pd.this.f18634g.a() - l5.longValue());
            } else {
                l4 = null;
            }
            pd.this.f18629b.e().e().a(l4 != null ? l4.longValue() : 0L, i4, errorReason, pd.this.f18630c.u());
            a aVar = pd.this.f18635h;
            if (aVar != null) {
                aVar.a(new IronSourceError(i4, errorReason));
            }
        }

        @Override // com.ironsource.gw
        public void b(@NotNull AbstractC1424a0 instance) {
            Long l4;
            Intrinsics.checkNotNullParameter(instance, "instance");
            Long l5 = pd.this.f18639l;
            if (l5 != null) {
                l4 = Long.valueOf(pd.this.f18634g.a() - l5.longValue());
            } else {
                l4 = null;
            }
            pd.this.f18629b.e().e().a(l4 != null ? l4.longValue() : 0L, pd.this.f18630c.u());
            pd.this.e();
            a aVar = pd.this.f18635h;
            if (aVar != null) {
                aVar.b(instance.e());
            }
        }

        @Override // com.ironsource.gw
        public void a(@NotNull AbstractC1424a0 instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            pd.this.f18629b.e().a().e(pd.this.c());
            pd.this.e();
            a aVar = pd.this.f18635h;
            if (aVar != null) {
                aVar.a(instance.e());
            }
        }
    }

    @Metadata
    /* synthetic */ class c extends kotlin.jvm.internal.p implements h2.n {
        c(Object obj) {
            super(3, obj, pd.class, "createAdInstance", "createAdInstance(Lcom/unity3d/mediation/internal/ads/controllers/adunits/adinstances/AdInstanceData;Lcom/unity3d/mediation/internal/ads/controllers/adunits/adinstances/AdInstancePayload;Lcom/unity3d/mediation/internal/ads/controllers/adunits/adinstances/listeners/FullscreenAdInstanceListener;)Lcom/unity3d/mediation/internal/ads/controllers/adunits/adinstances/FullscreenAdInstance;", 0);
        }

        @Override // h2.n
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final hd invoke(@NotNull C1431b0 p02, @NotNull C1473h0 p12, @NotNull id p22) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            Intrinsics.checkNotNullParameter(p12, "p1");
            Intrinsics.checkNotNullParameter(p22, "p2");
            return ((pd) this.receiver).a(p02, p12, p22);
        }
    }

    public pd(@NotNull nm mediationServices, @NotNull C1585w2 adUnitTools, @NotNull AbstractC1584w1 adUnitData, @NotNull sd fullscreenListener, @Nullable aw awVar, @Nullable h2.n nVar, @NotNull vt taskScheduler, @NotNull q9 currentTimeProvider) {
        Intrinsics.checkNotNullParameter(mediationServices, "mediationServices");
        Intrinsics.checkNotNullParameter(adUnitTools, "adUnitTools");
        Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        Intrinsics.checkNotNullParameter(fullscreenListener, "fullscreenListener");
        Intrinsics.checkNotNullParameter(taskScheduler, "taskScheduler");
        Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        this.f18628a = mediationServices;
        this.f18629b = adUnitTools;
        this.f18630c = adUnitData;
        this.f18631d = fullscreenListener;
        this.f18632e = nVar;
        this.f18633f = taskScheduler;
        this.f18634g = currentTimeProvider;
        this.f18637j = a(awVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractC1424a0 a(pd this$0, C1431b0 instanceData, C1473h0 adInstancePayload) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(instanceData, "instanceData");
        Intrinsics.checkNotNullParameter(adInstancePayload, "adInstancePayload");
        h2.n nVar = this$0.f18632e;
        if (nVar == null) {
            nVar = new c(this$0);
        }
        return (AbstractC1424a0) nVar.invoke(instanceData, adInstancePayload, this$0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String c() {
        return this.f18630c.l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(pd this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        a aVar = this$0.f18635h;
        if (aVar != null) {
            aVar.a();
        }
        this$0.f18637j.b();
    }

    public /* synthetic */ pd(nm nmVar, C1585w2 c1585w2, AbstractC1584w1 abstractC1584w1, sd sdVar, aw awVar, h2.n nVar, vt vtVar, q9 q9Var, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(nmVar, c1585w2, abstractC1584w1, sdVar, (i4 & 16) != 0 ? null : awVar, (i4 & 32) != 0 ? null : nVar, (i4 & 64) != 0 ? new me(ne.a(c1585w2.a())) : vtVar, (i4 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? new q9.a() : q9Var);
    }

    private final gw a() {
        return new b();
    }

    private final sl<Unit> d() {
        if (!this.f18637j.c()) {
            return new sl.a(new IronSourceError(IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW, "show called while ad unit is not ready to show"));
        }
        if (this.f18628a.y().a(c(), b()).d()) {
            return new sl.a(new IronSourceError(IronSourceError.ERROR_PLACEMENT_CAPPED, "placement " + c() + " is capped"));
        }
        if (!this.f18628a.u().a(this.f18630c.b().c()).d()) {
            return new sl.b(Unit.f41027a);
        }
        return new sl.a(new IronSourceError(IronSourceError.ERROR_AD_UNIT_CAPPED, "adUnitId " + this.f18630c.b().c() + " is capped"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e() {
        vt.a aVar = this.f18638k;
        if (aVar != null) {
            aVar.a();
        }
        long b4 = this.f18629b.b(b());
        vt vtVar = this.f18633f;
        Runnable runnable = new Runnable() { // from class: com.ironsource.P2
            @Override // java.lang.Runnable
            public final void run() {
                pd.h(pd.this);
            }
        };
        a.C0233a c0233a = kotlin.time.a.f41281c;
        this.f18638k = vtVar.a(runnable, kotlin.time.b.t(b4, EnumC3267b.f41381e));
    }

    private final void f() {
        String c4 = c();
        if (c4.length() > 0) {
            this.f18628a.a().b(c4, b());
            l8 a4 = this.f18628a.y().a(c4, b());
            if (a4.d()) {
                this.f18629b.e().a().b(c4, a4.e());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final hd a(C1431b0 c1431b0, C1473h0 c1473h0, id idVar) {
        return new hd(new C1585w2(this.f18629b, C1454e2.b.PROVIDER), c1431b0, c1473h0, idVar);
    }

    private final LevelPlay.AdFormat b() {
        return this.f18630c.b().d();
    }

    @Override // com.ironsource.InterfaceC1452e0
    public void b(@NotNull AbstractC1424a0 instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        this.f18637j.b(instance);
        this.f18629b.e().a().g(c());
        this.f18628a.e().b(com.unity3d.mediation.a.a(b()));
    }

    @Override // com.ironsource.id
    public void b(@NotNull hd fullscreenInstance) {
        Intrinsics.checkNotNullParameter(fullscreenInstance, "fullscreenInstance");
        this.f18629b.e().a().b(c());
        this.f18631d.onClosed();
    }

    private final zv a(aw awVar) {
        gw a4 = a();
        return awVar != null ? awVar.a(a4) : new zv(this.f18629b, this.f18630c, a4);
    }

    public final void a(@NotNull Activity activity, @NotNull InterfaceC1596y1 displayListener) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(displayListener, "displayListener");
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(C1525o1.a(this.f18629b, (String) null, (String) null, 3, (Object) null));
        this.f18636i = displayListener;
        this.f18629b.e().a().a(activity, c());
        sl<Unit> d4 = d();
        if (d4 instanceof sl.a) {
            IronSourceError b4 = ((sl.a) d4).b();
            ironLog.verbose(C1525o1.a(this.f18629b, b4.getErrorMessage(), (String) null, 2, (Object) null));
            this.f18629b.e().a().a(c(), b4.getErrorCode(), b4.getErrorMessage(), "");
            displayListener.b(b4);
            return;
        }
        vt.a aVar = this.f18638k;
        if (aVar != null) {
            aVar.a();
        }
        this.f18637j.a(new jd(activity));
    }

    @Override // com.ironsource.InterfaceC1452e0
    public void a(@NotNull AbstractC1424a0 instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        this.f18629b.e().a().a(c());
        this.f18631d.c();
    }

    @Override // com.ironsource.id
    public void a(@NotNull hd fullscreenInstance) {
        Intrinsics.checkNotNullParameter(fullscreenInstance, "fullscreenInstance");
        this.f18629b.e().a().l(c());
        InterfaceC1596y1 interfaceC1596y1 = this.f18636i;
        if (interfaceC1596y1 != null) {
            interfaceC1596y1.b();
        }
        f();
        this.f18628a.w().b(this.f18630c.b().c());
    }

    @Override // com.ironsource.id
    public void a(@NotNull hd fullscreenInstance, @NotNull IronSourceError error) {
        Intrinsics.checkNotNullParameter(fullscreenInstance, "fullscreenInstance");
        Intrinsics.checkNotNullParameter(error, "error");
        IronLog.INTERNAL.verbose(C1525o1.a(this.f18629b, error.toString(), (String) null, 2, (Object) null));
        this.f18629b.e().a().a(c(), error.getErrorCode(), error.getErrorMessage(), "");
        InterfaceC1596y1 interfaceC1596y1 = this.f18636i;
        if (interfaceC1596y1 != null) {
            interfaceC1596y1.b(error);
        }
    }

    @Override // com.ironsource.id
    public void a(@NotNull hd fullscreenInstance, @NotNull LevelPlayReward reward) {
        Intrinsics.checkNotNullParameter(fullscreenInstance, "fullscreenInstance");
        Intrinsics.checkNotNullParameter(reward, "reward");
        IronLog.INTERNAL.verbose(C1525o1.a(this.f18629b, fullscreenInstance.p(), (String) null, 2, (Object) null));
        this.f18631d.a(reward);
    }

    public final void a(@NotNull a loadListener) {
        Intrinsics.checkNotNullParameter(loadListener, "loadListener");
        IronLog.INTERNAL.verbose(C1525o1.a(this.f18629b, (String) null, (String) null, 3, (Object) null));
        this.f18635h = loadListener;
        this.f18639l = Long.valueOf(this.f18634g.a());
        this.f18629b.a(new C1545r1(this.f18630c.b()));
        InterfaceC1445d0 interfaceC1445d0 = new InterfaceC1445d0() { // from class: com.ironsource.O2
            @Override // com.ironsource.InterfaceC1445d0
            public final AbstractC1424a0 a(C1431b0 c1431b0, C1473h0 c1473h0) {
                AbstractC1424a0 a4;
                a4 = pd.a(pd.this, c1431b0, c1473h0);
                return a4;
            }
        };
        this.f18629b.e().e().a(this.f18630c.u());
        this.f18637j.a(interfaceC1445d0);
    }
}
