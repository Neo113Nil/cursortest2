package com.chartboost.sdk.impl;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class uf implements sf {
    public final Lazy a;

    public static final class a extends Lambda implements Function0 {
        public final /* synthetic */ m1 b;
        public final /* synthetic */ di c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(m1 m1Var, di diVar) {
            super(0);
            this.b = m1Var;
            this.c = diVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final bg mo4828invoke() {
            return new bg(new y9(this.b.getContext()), this.c.a());
        }
    }

    public uf(m1 androidComponent, di trackerComponent) {
        Intrinsics.checkNotNullParameter(androidComponent, "androidComponent");
        Intrinsics.checkNotNullParameter(trackerComponent, "trackerComponent");
        this.a = LazyKt.lazy(new a(androidComponent, trackerComponent));
    }

    @Override // com.chartboost.sdk.impl.sf
    public ag a() {
        return (ag) this.a.getValue();
    }
}
