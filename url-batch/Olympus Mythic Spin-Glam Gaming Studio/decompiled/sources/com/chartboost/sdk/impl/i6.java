package com.chartboost.sdk.impl;

import android.content.Context;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class i6 implements h6 {
    public final xg a;
    public final Lazy b;
    public final Lazy c;
    public final Lazy d;
    public final Lazy e;
    public final Lazy f;
    public final Lazy g;
    public final Lazy h;
    public final Lazy i;
    public final Lazy j;
    public final Lazy k;

    public static final class a extends Lambda implements Function0 {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final n1 mo4828invoke() {
            Context applicationContext = i6.this.a.a().getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            return new n1(applicationContext, i6.this.a.a());
        }
    }

    public static final class b extends Lambda implements Function0 {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final t1 mo4828invoke() {
            return new t1(i6.this.d(), i6.this.e(), i6.this.h(), null, i6.this.b(), 8, null);
        }
    }

    public static final class c extends Lambda implements Function0 {
        public static final c b = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final y7 mo4828invoke() {
            return new y7();
        }
    }

    public static final class d extends Lambda implements Function0 {
        public static final d b = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ha mo4828invoke() {
            return new ha();
        }
    }

    public static final class e extends Lambda implements Function0 {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ie mo4828invoke() {
            return new ie(i6.this.d(), i6.this.a());
        }
    }

    public static final class f extends Lambda implements Function0 {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ff mo4828invoke() {
            return new ff(i6.this.d(), i6.this.b());
        }
    }

    public static final class g extends Lambda implements Function0 {
        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final uf mo4828invoke() {
            return new uf(i6.this.d(), i6.this.b());
        }
    }

    public static final class h extends Lambda implements Function0 {
        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final wg mo4828invoke() {
            return new wg(i6.this.d(), i6.this.e(), i6.this.a(), i6.this.g(), i6.this.b());
        }
    }

    public static final class j extends Lambda implements Function0 {
        public j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final fl mo4828invoke() {
            return new fl(i6.this.d(), i6.this.a());
        }
    }

    public i6(xg startupManager) {
        Intrinsics.checkNotNullParameter(startupManager, "startupManager");
        this.a = startupManager;
        this.b = LazyKt.lazy(new a());
        this.c = LazyKt.lazy(new b());
        this.d = LazyKt.lazy(new f());
        this.e = LazyKt.lazy(c.b);
        this.f = LazyKt.lazy(new e());
        this.g = LazyKt.lazy(d.b);
        this.h = LazyKt.lazy(new i());
        this.i = LazyKt.lazy(new h());
        this.j = LazyKt.lazy(new g());
        this.k = LazyKt.lazy(new j());
    }

    @Override // com.chartboost.sdk.impl.h6
    public m1 d() {
        return (m1) this.b.getValue();
    }

    public ef h() {
        return (ef) this.d.getValue();
    }

    public x7 e() {
        return (x7) this.e.getValue();
    }

    public ee g() {
        return (ee) this.f.getValue();
    }

    @Override // com.chartboost.sdk.impl.h6
    public r1 a() {
        return (r1) this.c.getValue();
    }

    public ga f() {
        return (ga) this.g.getValue();
    }

    public static final class i extends Lambda implements Function0 {
        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gi mo4828invoke() {
            return new gi(LazyKt.lazy(new a(i6.this)), LazyKt.lazy(new b(i6.this)), LazyKt.lazy(new c(i6.this)));
        }

        public static final class a extends Lambda implements Function0 {
            public final /* synthetic */ i6 b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(i6 i6Var) {
                super(0);
                this.b = i6Var;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final m1 mo4828invoke() {
                return this.b.d();
            }
        }

        public static final class b extends Lambda implements Function0 {
            public final /* synthetic */ i6 b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(i6 i6Var) {
                super(0);
                this.b = i6Var;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final r1 mo4828invoke() {
                return this.b.a();
            }
        }

        public static final class c extends Lambda implements Function0 {
            public final /* synthetic */ i6 b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(i6 i6Var) {
                super(0);
                this.b = i6Var;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final bf mo4828invoke() {
                return this.b.h().a();
            }
        }
    }

    @Override // com.chartboost.sdk.impl.h6
    public di b() {
        return (di) this.h.getValue();
    }

    public rg j() {
        return (rg) this.i.getValue();
    }

    public sf i() {
        return (sf) this.j.getValue();
    }

    @Override // com.chartboost.sdk.impl.h6
    public dl c() {
        return (dl) this.k.getValue();
    }

    public /* synthetic */ i6(xg xgVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? h4.b : xgVar);
    }
}
