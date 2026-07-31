package com.chartboost.sdk.impl;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class gi implements di {
    public final Lazy a;
    public final Lazy b;
    public final Lazy c;
    public final Lazy d;
    public final Lazy e;

    public static final class c extends Lambda implements Function0 {
        public static final c b = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final li mo4828invoke() {
            return new li(null, 1, null);
        }
    }

    public static final class d extends Lambda implements Function0 {
        public final /* synthetic */ Lazy b;
        public final /* synthetic */ gi c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Lazy lazy, gi giVar) {
            super(0);
            this.b = lazy;
            this.c = giVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ri mo4828invoke() {
            return new ri(((m1) this.b.getValue()).h(), this.c.c(), null, 4, null);
        }
    }

    public static final class e extends Lambda implements Function0 {
        public final /* synthetic */ Lazy b;
        public final /* synthetic */ gi c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Lazy lazy, gi giVar) {
            super(0);
            this.b = lazy;
            this.c = giVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final vi mo4828invoke() {
            return new vi(((r1) this.b.getValue()).g(), this.c.d(), null, this.c.a(), ((r1) this.b.getValue()).k().d(), 4, null);
        }
    }

    public gi(Lazy androidComponent, Lazy applicationComponent, Lazy privacyApi) {
        Intrinsics.checkNotNullParameter(androidComponent, "androidComponent");
        Intrinsics.checkNotNullParameter(applicationComponent, "applicationComponent");
        Intrinsics.checkNotNullParameter(privacyApi, "privacyApi");
        this.a = LazyKt.lazy(new b(privacyApi, this, applicationComponent));
        this.b = LazyKt.lazy(new a(applicationComponent));
        this.c = LazyKt.lazy(new d(androidComponent, this));
        this.d = LazyKt.lazy(c.b);
        this.e = LazyKt.lazy(new e(applicationComponent, this));
    }

    public static final class b extends Lambda implements Function0 {
        public final /* synthetic */ Lazy b;
        public final /* synthetic */ gi c;
        public final /* synthetic */ Lazy d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Lazy lazy, gi giVar, Lazy lazy2) {
            super(0);
            this.b = lazy;
            this.c = giVar;
            this.d = lazy2;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final s7 mo4828invoke() {
            Lazy lazy = LazyKt.lazy(new a(this.c));
            Lazy lazy2 = LazyKt.lazy(new C0221b(this.d));
            return new s7(LazyKt.lazy(new c(this.d)), lazy, lazy2, this.b, LazyKt.lazy(new d(this.c)), LazyKt.lazy(new e(this.c)));
        }

        public static final class a extends Lambda implements Function0 {
            public final /* synthetic */ gi b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(gi giVar) {
                super(0);
                this.b = giVar;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final n7 mo4828invoke() {
                return this.b.b();
            }
        }

        /* renamed from: com.chartboost.sdk.impl.gi$b$b, reason: collision with other inner class name */
        public static final class C0221b extends Lambda implements Function0 {
            public final /* synthetic */ Lazy b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0221b(Lazy lazy) {
                super(0);
                this.b = lazy;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final gg mo4828invoke() {
                return ((r1) this.b.getValue()).u();
            }
        }

        public static final class c extends Lambda implements Function0 {
            public final /* synthetic */ Lazy b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(Lazy lazy) {
                super(0);
                this.b = lazy;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final mi mo4828invoke() {
                return ((sg) ((r1) this.b.getValue()).b().get()).i();
            }
        }

        public static final class d extends Lambda implements Function0 {
            public final /* synthetic */ gi b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(gi giVar) {
                super(0);
                this.b = giVar;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final vi mo4828invoke() {
                return this.b.e();
            }
        }

        public static final class e extends Lambda implements Function0 {
            public final /* synthetic */ gi b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(gi giVar) {
                super(0);
                this.b = giVar;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ri mo4828invoke() {
                return this.b.d();
            }
        }
    }

    @Override // com.chartboost.sdk.impl.di
    public q7 a() {
        return (q7) this.a.getValue();
    }

    public static final class a extends Lambda implements Function0 {
        public final /* synthetic */ Lazy b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Lazy lazy) {
            super(0);
            this.b = lazy;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final n7 mo4828invoke() {
            mi i = ((sg) ((r1) this.b.getValue()).b().get()).i();
            return new n7(i.c(), i.g());
        }
    }

    public n7 b() {
        return (n7) this.b.getValue();
    }

    public ri d() {
        return (ri) this.c.getValue();
    }

    public li c() {
        return (li) this.d.getValue();
    }

    public vi e() {
        return (vi) this.e.getValue();
    }
}
