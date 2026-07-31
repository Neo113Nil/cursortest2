package com.ironsource;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class xt {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final xt f20339a = new xt();

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final W1.h f20340b = W1.i.b(a.f20341a);

    @Metadata
    static final class a extends kotlin.jvm.internal.s implements Function0<jr> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f20341a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final jr invoke() {
            return new jr(16, null, null, 6, null);
        }
    }

    private xt() {
    }

    private final jr a() {
        return (jr) f20340b.getValue();
    }

    public static /* synthetic */ void a(xt xtVar, Runnable runnable, long j4, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            j4 = 0;
        }
        xtVar.a(runnable, j4);
    }

    public final void a(@NotNull Runnable action) {
        Intrinsics.checkNotNullParameter(action, "action");
        a(this, action, 0L, 2, null);
    }

    public final void a(@NotNull Runnable action, long j4) {
        Intrinsics.checkNotNullParameter(action, "action");
        a().schedule(action, j4, TimeUnit.MILLISECONDS);
    }
}
