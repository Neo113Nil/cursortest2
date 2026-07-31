package com.chartboost.sdk.impl;

import android.view.ViewGroup;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class ha implements ga {
    public final Function2 a = new d();
    public final Function1 b = a.b;
    public final Function1 c = c.b;
    public final Function1 d = b.b;
    public final Function2 e = e.b;

    public static final class a extends Lambda implements Function1 {
        public static final a b = new a();

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ba invoke(ja impressionDependency) {
            Intrinsics.checkNotNullParameter(impressionDependency, "impressionDependency");
            return new ba(impressionDependency.b(), impressionDependency.q(), impressionDependency.m(), impressionDependency.e(), impressionDependency.f(), impressionDependency.o(), impressionDependency.k(), impressionDependency.p(), impressionDependency.c(), null, 512, null);
        }
    }

    public static final class b extends Lambda implements Function1 {
        public static final b b = new b();

        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final fa invoke(ja impressionDependency) {
            Intrinsics.checkNotNullParameter(impressionDependency, "impressionDependency");
            return new fa(impressionDependency.b(), impressionDependency.a(), impressionDependency.g(), impressionDependency.c());
        }
    }

    public static final class c extends Lambda implements Function1 {
        public static final c b = new c();

        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ka invoke(ja impressionDependency) {
            Intrinsics.checkNotNullParameter(impressionDependency, "impressionDependency");
            return new ka(impressionDependency.b(), impressionDependency.n(), impressionDependency.a(), impressionDependency.c(), impressionDependency.j(), impressionDependency.d(), impressionDependency.h(), impressionDependency.p(), impressionDependency.i());
        }
    }

    public static final class d extends Lambda implements Function2 {
        public d() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a3 invoke(ja impressionDependency, ViewGroup viewGroup) {
            Intrinsics.checkNotNullParameter(impressionDependency, "impressionDependency");
            return new a3(impressionDependency, (da) ha.this.b.invoke(impressionDependency), (la) ha.this.c.invoke(impressionDependency), (ea) ha.this.d.invoke(impressionDependency), (va) ha.this.e.invoke(impressionDependency, viewGroup));
        }
    }

    public static final class e extends Lambda implements Function2 {
        public static final e b = new e();

        public e() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ta invoke(ja impressionDependency, ViewGroup viewGroup) {
            Intrinsics.checkNotNullParameter(impressionDependency, "impressionDependency");
            return new ta(impressionDependency.d(), impressionDependency.r(), impressionDependency.h(), viewGroup, impressionDependency.c(), impressionDependency.j(), impressionDependency.k());
        }
    }

    @Override // com.chartboost.sdk.impl.ga
    public Function2 a() {
        return this.a;
    }
}
