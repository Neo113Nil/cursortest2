package com.yandex.mobile.ads.impl;

import a2.AbstractC1241b;
import android.os.Handler;
import com.yandex.mobile.ads.impl.C2205rd;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o2.AbstractC3333i;
import o2.AbstractC3364y;
import o2.InterfaceC3316J;
import o2.InterfaceC3360w;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.rd, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2205rd {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final CoroutineContext f31117a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Handler f31118b;

    @kotlin.coroutines.jvm.internal.f(c = "com.monetization.ads.core.anr.AnrChecker$isAlive$2", f = "AnrChecker.kt", l = {20}, m = "invokeSuspend")
    /* renamed from: com.yandex.mobile.ads.impl.rd$a */
    static final class a extends kotlin.coroutines.jvm.internal.l implements Function2<InterfaceC3316J, kotlin.coroutines.d, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f31119b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f31121d;

        @kotlin.coroutines.jvm.internal.f(c = "com.monetization.ads.core.anr.AnrChecker$isAlive$2$2", f = "AnrChecker.kt", l = {20}, m = "invokeSuspend")
        /* renamed from: com.yandex.mobile.ads.impl.rd$a$a, reason: collision with other inner class name */
        static final class C0200a extends kotlin.coroutines.jvm.internal.l implements Function2<InterfaceC3316J, kotlin.coroutines.d, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f31122b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC3360w f31123c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0200a(InterfaceC3360w interfaceC3360w, kotlin.coroutines.d dVar) {
                super(2, dVar);
                this.f31123c = interfaceC3360w;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @NotNull
            public final kotlin.coroutines.d create(@Nullable Object obj, @NotNull kotlin.coroutines.d dVar) {
                return new C0200a(this.f31123c, dVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return new C0200a(this.f31123c, (kotlin.coroutines.d) obj2).invokeSuspend(Unit.f41027a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object f4 = AbstractC1241b.f();
                int i4 = this.f31122b;
                if (i4 == 0) {
                    ResultKt.a(obj);
                    InterfaceC3360w interfaceC3360w = this.f31123c;
                    this.f31122b = 1;
                    if (interfaceC3360w.await(this) == f4) {
                        return f4;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.a(obj);
                }
                return Unit.f41027a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(long j4, kotlin.coroutines.d dVar) {
            super(2, dVar);
            this.f31121d = j4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(InterfaceC3360w interfaceC3360w) {
            interfaceC3360w.J(Unit.f41027a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d create(@Nullable Object obj, @NotNull kotlin.coroutines.d dVar) {
            return C2205rd.this.new a(this.f31121d, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return C2205rd.this.new a(this.f31121d, (kotlin.coroutines.d) obj2).invokeSuspend(Unit.f41027a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object f4 = AbstractC1241b.f();
            int i4 = this.f31119b;
            if (i4 == 0) {
                ResultKt.a(obj);
                final InterfaceC3360w c4 = AbstractC3364y.c(null, 1, null);
                C2205rd.this.f31118b.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.Nc
                    @Override // java.lang.Runnable
                    public final void run() {
                        C2205rd.a.a(InterfaceC3360w.this);
                    }
                });
                long j4 = this.f31121d;
                C0200a c0200a = new C0200a(c4, null);
                this.f31119b = 1;
                obj = o2.W0.d(j4, c0200a, this);
                if (obj == f4) {
                    return f4;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.a(obj);
            }
            return kotlin.coroutines.jvm.internal.b.a(obj != null);
        }
    }

    public C2205rd(@NotNull CoroutineContext coroutineContext, @NotNull Handler mainHandler) {
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        Intrinsics.checkNotNullParameter(mainHandler, "mainHandler");
        this.f31117a = coroutineContext;
        this.f31118b = mainHandler;
    }

    @Nullable
    public final Object a(long j4, @NotNull kotlin.coroutines.d dVar) {
        return AbstractC3333i.g(this.f31117a, new a(j4, null), dVar);
    }
}
