package com.chartboost.sdk.impl;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes10.dex */
public final class ie implements ee {
    public final Lazy a;
    public final Lazy b;
    public final Lazy c;

    public static final class a extends Lambda implements Function0 {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final fe mo4828invoke() {
            return new fe(ie.this.a(), ie.this.c());
        }
    }

    public static final class b extends Lambda implements Function0 {
        public final /* synthetic */ m1 b;
        public final /* synthetic */ r1 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(m1 m1Var, r1 r1Var) {
            super(0);
            this.b = m1Var;
            this.c = r1Var;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final he mo4828invoke() {
            return new he(this.b.getContext(), this.b.d(), this.b.k(), this.c.b(), null, 16, null);
        }
    }

    public static final class c extends Lambda implements Function0 {
        public static final c b = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final je mo4828invoke() {
            return new je();
        }
    }

    public ie(m1 androidComponent, r1 applicationComponent) {
        Intrinsics.checkNotNullParameter(androidComponent, "androidComponent");
        Intrinsics.checkNotNullParameter(applicationComponent, "applicationComponent");
        this.a = LazyKt.lazy(new b(androidComponent, applicationComponent));
        this.b = LazyKt.lazy(c.b);
        this.c = LazyKt.lazy(new a());
    }

    @Override // com.chartboost.sdk.impl.ee
    public he a() {
        return (he) this.a.getValue();
    }

    public je c() {
        return (je) this.b.getValue();
    }

    @Override // com.chartboost.sdk.impl.ee
    public fe b() {
        return (fe) this.c.getValue();
    }
}
