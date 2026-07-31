package com.chartboost.sdk.impl;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes10.dex */
public final class fl implements dl {
    public final Lazy a;
    public final Lazy b;

    public static final class a extends Lambda implements Function0 {
        public final /* synthetic */ m1 b;
        public final /* synthetic */ r1 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(m1 m1Var, r1 r1Var) {
            super(0);
            this.b = m1Var;
            this.c = r1Var;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final sc mo4828invoke() {
            return new sc(this.b.getContext(), this.b.d(), this.b.k(), this.c.b());
        }
    }

    public static final class b extends Lambda implements Function0 {
        public static final b b = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final vc mo4828invoke() {
            return new vc();
        }
    }

    public fl(m1 androidComponent, r1 applicationComponent) {
        Intrinsics.checkNotNullParameter(androidComponent, "androidComponent");
        Intrinsics.checkNotNullParameter(applicationComponent, "applicationComponent");
        this.a = LazyKt.lazy(new a(androidComponent, applicationComponent));
        this.b = LazyKt.lazy(b.b);
    }

    @Override // com.chartboost.sdk.impl.dl
    public el b() {
        return (el) this.a.getValue();
    }

    @Override // com.chartboost.sdk.impl.dl
    public jl a() {
        return (jl) this.b.getValue();
    }
}
