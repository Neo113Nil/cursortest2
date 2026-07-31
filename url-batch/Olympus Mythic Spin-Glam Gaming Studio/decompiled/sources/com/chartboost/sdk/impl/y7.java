package com.chartboost.sdk.impl;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class y7 implements x7 {
    public final Lazy a = LazyKt.lazy(b.b);
    public final Lazy b = LazyKt.lazy(a.b);

    public static final class b extends Lambda implements Function0 {
        public static final b b = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ExecutorService mo4828invoke() {
            return r2.a(4, 0L, null, 6, null);
        }
    }

    @Override // com.chartboost.sdk.impl.x7
    public ExecutorService a() {
        return (ExecutorService) this.a.getValue();
    }

    public static final class a extends Lambda implements Function0 {
        public static final a b = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ScheduledExecutorService mo4828invoke() {
            return r2.a(0, null, 3, null);
        }
    }

    @Override // com.chartboost.sdk.impl.x7
    public ScheduledExecutorService b() {
        return (ScheduledExecutorService) this.b.getValue();
    }
}
