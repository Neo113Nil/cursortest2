package com.chartboost.sdk.impl;

import com.chartboost.sdk.Mediation;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function9;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class i {
    public final Function0 a;
    public final Mediation b;
    public final f4 c;
    public final Lazy d;
    public final g0 e;
    public final o0 f;
    public final yi g;
    public final Lazy h;
    public final ScheduledExecutorService i;
    public final zg j;
    public final i2 k;
    public final e l;

    public static final class a extends Lambda implements Function0 {
        public final /* synthetic */ c0 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(c0 c0Var) {
            super(0);
            this.c = c0Var;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final l0 mo4828invoke() {
            return new l0(i.this.c.d(), i.this.c.a(), this.c, i.this.c.i(), i.this.c.g(), i.this.b, i.this.c.f(), i.this.c.b());
        }
    }

    public i(c0 adType, Function0 get, Mediation mediation, f4 dependencyContainer) {
        Intrinsics.checkNotNullParameter(adType, "adType");
        Intrinsics.checkNotNullParameter(get, "get");
        Intrinsics.checkNotNullParameter(dependencyContainer, "dependencyContainer");
        this.a = get;
        this.b = mediation;
        this.c = dependencyContainer;
        this.d = LazyKt.lazy(new a(adType));
        this.e = b().b();
        this.f = b().c();
        this.g = dependencyContainer.d().c();
        this.h = LazyKt.lazy(new b());
        this.i = dependencyContainer.e().b();
        this.j = dependencyContainer.a().k();
        this.k = dependencyContainer.d().a();
        this.l = new f(dependencyContainer.d()).a();
    }

    public static final class b extends Lambda implements Function0 {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AtomicReference mo4828invoke() {
            return i.this.c.a().b();
        }
    }

    public final AtomicReference c() {
        return (AtomicReference) this.h.getValue();
    }

    public final l0 b() {
        return (l0) this.d.getValue();
    }

    public final Object a() {
        return ((Function9) this.a.mo4828invoke()).invoke(this.e, this.f, this.g, c(), this.i, this.l, this.j, this.k, this.c.b().a());
    }

    public /* synthetic */ i(c0 c0Var, Function0 function0, Mediation mediation, f4 f4Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c0Var, function0, mediation, (i & 8) != 0 ? f4.b : f4Var);
    }
}
