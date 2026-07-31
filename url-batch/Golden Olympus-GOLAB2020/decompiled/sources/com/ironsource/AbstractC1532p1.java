package com.ironsource;

import com.ironsource.C1454e2;
import com.ironsource.InterfaceC1488j1;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.vt;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.a;
import n2.EnumC3267b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.ironsource.p1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1532p1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final AbstractC1584w1 f18566a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final me f18567b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C1585w2 f18568c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    private InterfaceC1510m2 f18569d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    private InterfaceC1596y1 f18570e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final zv f18571f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final WeakReference<InterfaceC1496k2> f18572g;

    /* renamed from: h, reason: collision with root package name */
    @Nullable
    private ib f18573h;

    /* renamed from: i, reason: collision with root package name */
    @Nullable
    private vt.a f18574i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final ac f18575j;

    @Metadata
    /* renamed from: com.ironsource.p1$a */
    protected class a implements InterfaceC1452e0 {
        public a() {
        }

        @Override // com.ironsource.InterfaceC1452e0
        public void a(@NotNull AbstractC1424a0 instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            AbstractC1532p1.this.f18575j.a().a(AbstractC1532p1.this.h());
            InterfaceC1496k2 interfaceC1496k2 = (InterfaceC1496k2) AbstractC1532p1.this.f18572g.get();
            if (interfaceC1496k2 != null) {
                interfaceC1496k2.c();
            }
        }

        @Override // com.ironsource.InterfaceC1452e0
        public void b(@NotNull AbstractC1424a0 instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            IronLog.INTERNAL.verbose(AbstractC1532p1.this.a(instance.p()));
            AbstractC1532p1.this.k().b(instance);
            AbstractC1532p1.this.f18575j.a().g(AbstractC1532p1.this.h());
            AbstractC1532p1.this.f().m().b(AbstractC1532p1.this.e().b().a());
        }
    }

    @Metadata
    /* renamed from: com.ironsource.p1$b */
    public static final class b implements gw {
        b() {
        }

        @Override // com.ironsource.gw
        public void a(int i4, @NotNull String errorReason) {
            Intrinsics.checkNotNullParameter(errorReason, "errorReason");
            AbstractC1532p1.this.a(i4, errorReason);
        }

        @Override // com.ironsource.gw
        public void b(@NotNull AbstractC1424a0 instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            AbstractC1532p1.this.f18575j.e().a(ib.a(AbstractC1532p1.this.f18573h), AbstractC1532p1.this.e().u());
            InterfaceC1510m2 j4 = AbstractC1532p1.this.j();
            if (j4 != null) {
                j4.c(new C1565t1(AbstractC1532p1.this, instance.e()));
            }
            AbstractC1532p1.this.l();
        }

        @Override // com.ironsource.gw
        public void a(@NotNull AbstractC1424a0 instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            AbstractC1532p1.this.f().e().a().e(AbstractC1532p1.this.h());
            InterfaceC1510m2 j4 = AbstractC1532p1.this.j();
            if (j4 != null) {
                j4.b(new C1565t1(AbstractC1532p1.this, instance.e()));
            }
            AbstractC1532p1.this.l();
        }
    }

    public AbstractC1532p1(@NotNull C1525o1 adTools, @NotNull AbstractC1584w1 adUnitData, @NotNull InterfaceC1496k2 listener, @NotNull me taskScheduler) {
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(taskScheduler, "taskScheduler");
        this.f18566a = adUnitData;
        this.f18567b = taskScheduler;
        C1585w2 c1585w2 = new C1585w2(adTools, adUnitData, C1454e2.b.MEDIATION);
        this.f18568c = c1585w2;
        this.f18571f = new zv(c1585w2, adUnitData, c());
        this.f18572g = new WeakReference<>(listener);
        this.f18575j = c1585w2.e();
        IronLog.INTERNAL.verbose("adFormat = " + adUnitData.b().a() + ", adUnitId = " + adUnitData.b().c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l() {
        IronLog.INTERNAL.verbose(a("starting expiration scheduled task"));
        vt.a aVar = this.f18574i;
        if (aVar != null) {
            aVar.a();
        }
        long b4 = this.f18568c.b(this.f18566a.b().d());
        me meVar = this.f18567b;
        Runnable runnable = new Runnable() { // from class: com.ironsource.I2
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC1532p1.e(AbstractC1532p1.this);
            }
        };
        a.C0233a c0233a = kotlin.time.a.f41281c;
        this.f18574i = meVar.a(runnable, kotlin.time.b.t(b4, EnumC3267b.f41381e));
    }

    @NotNull
    protected abstract InterfaceC1445d0 a();

    @NotNull
    public C1545r1 b() {
        return new C1545r1(this.f18566a.b());
    }

    @NotNull
    public InterfaceC1488j1 d() {
        return this.f18571f.c() ? InterfaceC1488j1.b.f16783a : new InterfaceC1488j1.a(null, 1, null);
    }

    @NotNull
    protected final AbstractC1584w1 e() {
        return this.f18566a;
    }

    @Nullable
    protected final Placement g() {
        return this.f18566a.b().e();
    }

    @NotNull
    protected final String h() {
        return this.f18566a.l();
    }

    @Nullable
    protected final InterfaceC1596y1 i() {
        return this.f18570e;
    }

    @Nullable
    protected final InterfaceC1510m2 j() {
        return this.f18569d;
    }

    @NotNull
    protected final zv k() {
        return this.f18571f;
    }

    public /* synthetic */ AbstractC1532p1(C1525o1 c1525o1, AbstractC1584w1 abstractC1584w1, InterfaceC1496k2 interfaceC1496k2, me meVar, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(c1525o1, abstractC1584w1, interfaceC1496k2, (i4 & 8) != 0 ? new me(ne.a(c1525o1.a())) : meVar);
    }

    private final b c() {
        return new b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(AbstractC1532p1 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        InterfaceC1510m2 interfaceC1510m2 = this$0.f18569d;
        if (interfaceC1510m2 != null) {
            interfaceC1510m2.a();
        }
    }

    @NotNull
    protected final String a(@Nullable String str) {
        return C1525o1.a(this.f18568c, str, (String) null, 2, (Object) null);
    }

    @NotNull
    protected final C1585w2 f() {
        return this.f18568c;
    }

    protected final void a(int i4, @NotNull String errorReason) {
        Intrinsics.checkNotNullParameter(errorReason, "errorReason");
        IronLog.INTERNAL.verbose(a("errorCode = " + i4 + ", errorReason = " + errorReason));
        this.f18575j.e().a(ib.a(this.f18573h), i4, errorReason, this.f18566a.u());
        InterfaceC1510m2 interfaceC1510m2 = this.f18569d;
        if (interfaceC1510m2 != null) {
            interfaceC1510m2.a(new IronSourceError(i4, errorReason));
        }
    }

    protected final void b(@Nullable InterfaceC1510m2 interfaceC1510m2) {
        this.f18569d = interfaceC1510m2;
    }

    public final void a(@NotNull InterfaceC1487j0 adInstancePresenter, @NotNull InterfaceC1596y1 displayListener) {
        Intrinsics.checkNotNullParameter(adInstancePresenter, "adInstancePresenter");
        Intrinsics.checkNotNullParameter(displayListener, "displayListener");
        this.f18570e = displayListener;
        vt.a aVar = this.f18574i;
        if (aVar != null) {
            aVar.a();
        }
        this.f18571f.a(adInstancePresenter);
    }

    public final void a(@NotNull InterfaceC1510m2 loadListener) {
        Intrinsics.checkNotNullParameter(loadListener, "loadListener");
        IronLog.INTERNAL.verbose(C1525o1.a(this.f18568c, (String) null, (String) null, 3, (Object) null));
        this.f18568c.a(b());
        this.f18569d = loadListener;
        this.f18575j.a(this.f18566a.u());
        this.f18573h = new ib();
        this.f18571f.a(a());
    }

    protected final void a(@Nullable InterfaceC1596y1 interfaceC1596y1) {
        this.f18570e = interfaceC1596y1;
    }

    public final void a(boolean z4) {
        IronLog.INTERNAL.verbose(C1525o1.a(this.f18568c, (String) null, (String) null, 3, (Object) null));
        this.f18571f.a();
        if (z4) {
            this.f18568c.e().e().a(this.f18568c.f());
        }
    }
}
