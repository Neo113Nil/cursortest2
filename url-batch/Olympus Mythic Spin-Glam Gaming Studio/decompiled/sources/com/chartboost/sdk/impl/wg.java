package com.chartboost.sdk.impl;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes8.dex */
public final class wg implements rg {
    public final Lazy a;
    public final Lazy b;
    public final Lazy c;
    public final Lazy d;
    public final Lazy e;
    public final Lazy f;
    public final Lazy g;

    public static final class a extends Lambda implements Function0 {
        public final /* synthetic */ r1 c;
        public final /* synthetic */ di d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(r1 r1Var, di diVar) {
            super(0);
            this.c = r1Var;
            this.d = diVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final k1 mo4828invoke() {
            return new k1(wg.this.b(), this.c.g(), this.c.u(), this.d.a(), this.c.k());
        }
    }

    public static final class b extends Lambda implements Function0 {
        public final /* synthetic */ m1 b;
        public final /* synthetic */ x7 c;
        public final /* synthetic */ wg d;
        public final /* synthetic */ r1 e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(m1 m1Var, x7 x7Var, wg wgVar, r1 r1Var) {
            super(0);
            this.b = m1Var;
            this.c = x7Var;
            this.d = wgVar;
            this.e = r1Var;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final b4 mo4828invoke() {
            return new b4(this.b.getContext(), this.c.b(), this.d.b(), this.d.g(), this.e.p());
        }
    }

    public static final class c extends Lambda implements Function0 {
        public final /* synthetic */ r1 b;
        public final /* synthetic */ di c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(r1 r1Var, di diVar) {
            super(0);
            this.b = r1Var;
            this.c = diVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final cb mo4828invoke() {
            return new cb(this.b.g(), this.b.u(), this.c.a(), this.b.m());
        }
    }

    public static final class d extends Lambda implements Function0 {
        public final /* synthetic */ r1 b;
        public final /* synthetic */ di c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(r1 r1Var, di diVar) {
            super(0);
            this.b = r1Var;
            this.c = diVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final db mo4828invoke() {
            return new db(this.b.g(), this.b.u(), this.c.a(), this.b.m());
        }
    }

    public static final class e extends Lambda implements Function0 {
        public final /* synthetic */ m1 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(m1 m1Var) {
            super(0);
            this.b = m1Var;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kf mo4828invoke() {
            return new kf(this.b.getContext(), this.b.c());
        }
    }

    public static final class g extends Lambda implements Function0 {
        public final /* synthetic */ m1 b;
        public final /* synthetic */ r1 c;
        public final /* synthetic */ ee d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(m1 m1Var, r1 r1Var, ee eeVar) {
            super(0);
            this.b = m1Var;
            this.c = r1Var;
            this.d = eeVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final o2 mo4828invoke() {
            return new o2(this.b.getContext(), this.b.a(), this.c.p(), this.c.b(), this.d.a(), this.c.a(), this.c.k());
        }
    }

    public wg(m1 androidComponent, x7 executorComponent, r1 applicationComponent, ee openMeasurementComponent, di trackerComponent) {
        Intrinsics.checkNotNullParameter(androidComponent, "androidComponent");
        Intrinsics.checkNotNullParameter(executorComponent, "executorComponent");
        Intrinsics.checkNotNullParameter(applicationComponent, "applicationComponent");
        Intrinsics.checkNotNullParameter(openMeasurementComponent, "openMeasurementComponent");
        Intrinsics.checkNotNullParameter(trackerComponent, "trackerComponent");
        this.a = LazyKt.lazy(new b(androidComponent, executorComponent, this, applicationComponent));
        this.b = LazyKt.lazy(new a(applicationComponent, trackerComponent));
        this.c = LazyKt.lazy(new f(androidComponent, applicationComponent, this, openMeasurementComponent));
        this.d = LazyKt.lazy(new d(applicationComponent, trackerComponent));
        this.e = LazyKt.lazy(new c(applicationComponent, trackerComponent));
        this.f = LazyKt.lazy(new e(androidComponent));
        this.g = LazyKt.lazy(new g(androidComponent, applicationComponent, openMeasurementComponent));
    }

    @Override // com.chartboost.sdk.impl.rg
    public b4 c() {
        return (b4) this.a.getValue();
    }

    public static final class f extends Lambda implements Function0 {
        public final /* synthetic */ m1 b;
        public final /* synthetic */ r1 c;
        public final /* synthetic */ wg d;
        public final /* synthetic */ ee e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(m1 m1Var, r1 r1Var, wg wgVar, ee eeVar) {
            super(0);
            this.b = m1Var;
            this.c = r1Var;
            this.d = wgVar;
            this.e = eeVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ug mo4828invoke() {
            return new ug(this.b.getContext(), this.b.i(), this.b.c(), this.c.a(), this.c.b(), this.c.o(), this.c.e(), this.c.k(), this.c.r(), LazyKt.lazy(new a(this.c)), this.d.e(), this.d.d(), this.c.j(), this.d.f(), this.c.p(), this.e.a(), this.c.q(), this.c.g());
        }

        public static final class a extends Lambda implements Function0 {
            public final /* synthetic */ r1 b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(r1 r1Var) {
                super(0);
                this.b = r1Var;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final xk mo4828invoke() {
                return this.b.w();
            }
        }
    }

    @Override // com.chartboost.sdk.impl.rg
    public k1 a() {
        return (k1) this.b.getValue();
    }

    @Override // com.chartboost.sdk.impl.rg
    public ug b() {
        return (ug) this.c.getValue();
    }

    public final db e() {
        return (db) this.d.getValue();
    }

    public final cb d() {
        return (cb) this.e.getValue();
    }

    public final kf f() {
        return (kf) this.f.getValue();
    }

    public o2 g() {
        return (o2) this.g.getValue();
    }
}
