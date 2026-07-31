package com.chartboost.sdk.impl;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class f {
    public final m1 a;
    public final Lazy b;

    public static final class a extends Lambda implements Function0 {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final e mo4828invoke() {
            return new e(f.this.a.c());
        }
    }

    public f(m1 androidComponent) {
        Intrinsics.checkNotNullParameter(androidComponent, "androidComponent");
        this.a = androidComponent;
        this.b = LazyKt.lazy(new a());
    }

    public e a() {
        return (e) this.b.getValue();
    }
}
