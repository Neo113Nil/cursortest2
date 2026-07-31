package com.yandex.mobile.ads.impl;

import a2.AbstractC1241b;
import android.content.Context;
import com.huawei.hms.adapter.internal.AvailableCode;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o2.AbstractC3337k;
import o2.InterfaceC3316J;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class hv1 implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private static final CopyOnWriteArrayList<jv1> f26952f = new CopyOnWriteArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final vu1 f26953b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC3316J f26954c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final s01 f26955d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final Context f26956e;

    @kotlin.coroutines.jvm.internal.f(c = "com.monetization.ads.core.initializer.SdkInitializeRunnable$run$1", f = "SdkInitializeRunnable.kt", l = {AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.l implements Function2<InterfaceC3316J, kotlin.coroutines.d, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f26957b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ jv1 f26958c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ hv1 f26959d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(jv1 jv1Var, hv1 hv1Var, kotlin.coroutines.d dVar) {
            super(2, dVar);
            this.f26958c = jv1Var;
            this.f26959d = hv1Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d create(@Nullable Object obj, @NotNull kotlin.coroutines.d dVar) {
            return new a(this.f26958c, this.f26959d, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return new a(this.f26958c, this.f26959d, (kotlin.coroutines.d) obj2).invokeSuspend(Unit.f41027a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object f4 = AbstractC1241b.f();
            int i4 = this.f26957b;
            try {
                if (i4 == 0) {
                    ResultKt.a(obj);
                    jv1 jv1Var = this.f26958c;
                    ok0 ok0Var = ok0.f30066c;
                    this.f26957b = 1;
                    obj = jv1Var.a(ok0Var, this);
                    if (obj == f4) {
                        return f4;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.a(obj);
                }
                this.f26959d.f26955d.a((gv1) obj);
                hv1.f26952f.remove(this.f26958c);
                return Unit.f41027a;
            } catch (Throwable th) {
                hv1.f26952f.remove(this.f26958c);
                throw th;
            }
        }
    }

    public hv1(@NotNull Context context, @NotNull vu1 sdkEnvironmentModule, @NotNull InterfaceC3316J coroutineScope, @NotNull s01 initializeController) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sdkEnvironmentModule, "sdkEnvironmentModule");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(initializeController, "initializeController");
        this.f26953b = sdkEnvironmentModule;
        this.f26954c = coroutineScope;
        this.f26955d = initializeController;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        this.f26956e = applicationContext;
    }

    @Override // java.lang.Runnable
    public final void run() {
        jv1 jv1Var = new jv1(this.f26956e, this.f26953b, this.f26954c, new C2105n4(), null, null, 1048560);
        f26952f.add(jv1Var);
        AbstractC3337k.d(this.f26954c, null, null, new a(jv1Var, this, null), 3, null);
    }
}
