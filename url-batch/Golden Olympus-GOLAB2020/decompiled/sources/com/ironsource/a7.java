package com.ironsource;

import com.ironsource.C1526o2;
import com.ironsource.a7;
import com.ironsource.mediationsdk.logger.IronLog;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class a7 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C1526o2 f15012a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C1482i2 f15013b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final f6 f15014c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final W1.h f15015d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final W1.h f15016e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f15017f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f15018g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f15019h;

    @Metadata
    static final class a extends kotlin.jvm.internal.s implements Function0<xl> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final xl invoke() {
            final a7 a7Var = a7.this;
            return new xl(new Runnable() { // from class: com.ironsource.G
                @Override // java.lang.Runnable
                public final void run() {
                    a7.a.a(a7.this);
                }
            }, com.ironsource.lifecycle.b.d(), new zu());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(a7 this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.f15014c.e();
        }
    }

    @Metadata
    static final class b extends kotlin.jvm.internal.s implements Function0<xl> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final xl invoke() {
            final a7 a7Var = a7.this;
            return new xl(new Runnable() { // from class: com.ironsource.H
                @Override // java.lang.Runnable
                public final void run() {
                    a7.b.a(a7.this);
                }
            }, com.ironsource.lifecycle.b.d(), new zu());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(a7 this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.f15014c.f();
        }
    }

    public a7(@NotNull C1526o2 loadingData, @NotNull C1482i2 interactionData, @NotNull f6 mListener) {
        Intrinsics.checkNotNullParameter(loadingData, "loadingData");
        Intrinsics.checkNotNullParameter(interactionData, "interactionData");
        Intrinsics.checkNotNullParameter(mListener, "mListener");
        this.f15012a = loadingData;
        this.f15013b = interactionData;
        this.f15014c = mListener;
        this.f15015d = W1.i.b(new a());
        this.f15016e = W1.i.b(new b());
        this.f15017f = loadingData.b() > 0;
        this.f15018g = interactionData.b() > 0;
        this.f15019h = loadingData.a() == C1526o2.a.MANUAL_WITH_LOAD_ON_SHOW;
    }

    private final xl c() {
        return (xl) this.f15015d.getValue();
    }

    private final xl d() {
        return (xl) this.f15016e.getValue();
    }

    private final void f() {
        if (this.f15019h) {
            c().b();
        }
    }

    private final void g() {
        if (this.f15019h) {
            d().b();
        }
    }

    public final void b() {
        IronLog.INTERNAL.verbose();
        g();
    }

    public final void e() {
        IronLog.INTERNAL.verbose();
        b(this.f15013b.b());
    }

    public final void h() {
        if (!this.f15017f) {
            IronLog.INTERNAL.verbose("banner reload interval is disabled");
        } else {
            IronLog.INTERNAL.verbose();
            a(this.f15012a.b());
        }
    }

    private final void b(long j4) {
        if (this.f15019h && this.f15018g) {
            d().a(j4);
        }
    }

    public final void a() {
        IronLog.INTERNAL.verbose();
        f();
    }

    private final void a(long j4) {
        if (this.f15019h && this.f15017f) {
            c().a(j4);
        }
    }
}
