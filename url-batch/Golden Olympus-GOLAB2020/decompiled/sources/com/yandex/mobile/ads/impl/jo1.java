package com.yandex.mobile.ads.impl;

import a2.AbstractC1241b;
import android.content.Context;
import com.yandex.mobile.ads.impl.aq1;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o2.C3345o;
import o2.InterfaceC3343n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import y2.C3534i;

/* loaded from: classes3.dex */
public final class jo1 implements io1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f27786a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final bq1<gx> f27787b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final xx f27788c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final wk0 f27789d;

    @kotlin.coroutines.jvm.internal.f(c = "com.yandex.mobile.ads.features.debugpanel.data.remote.RemoteDataSourceImpl", f = "RemoteDataSourceImpl.kt", l = {47}, m = "getRemoteData-IoAF18A")
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f27790b;

        /* renamed from: d, reason: collision with root package name */
        int f27792d;

        a(kotlin.coroutines.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f27790b = obj;
            this.f27792d |= Integer.MIN_VALUE;
            Object a4 = jo1.this.a(this);
            return a4 == AbstractC1241b.f() ? a4 : Result.a(a4);
        }
    }

    static final class b extends kotlin.jvm.internal.s implements Function1<gx, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC3343n f27793b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C3345o c3345o) {
            super(1);
            this.f27793b = c3345o;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            gx response = (gx) obj;
            Intrinsics.checkNotNullParameter(response, "response");
            this.f27793b.resumeWith(Result.m243constructorimpl(Result.a(Result.m243constructorimpl(response))));
            return Unit.f41027a;
        }
    }

    static final class c extends kotlin.jvm.internal.s implements Function1<hi2, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC3343n f27794b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(C3345o c3345o) {
            super(1);
            this.f27794b = c3345o;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            hi2 error = (hi2) obj;
            Intrinsics.checkNotNullParameter(error, "error");
            if (error.getCause() instanceof C3534i) {
                throw error;
            }
            InterfaceC3343n interfaceC3343n = this.f27794b;
            Result.Companion companion = Result.Companion;
            interfaceC3343n.resumeWith(Result.m243constructorimpl(Result.a(Result.m243constructorimpl(ResultKt.createFailure(error)))));
            return Unit.f41027a;
        }
    }

    public jo1(@NotNull Context context, @NotNull bq1<gx> requestPolicy, @NotNull xx urlConfigurator, @NotNull wk0 responseListenerCreator) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(requestPolicy, "requestPolicy");
        Intrinsics.checkNotNullParameter(urlConfigurator, "urlConfigurator");
        Intrinsics.checkNotNullParameter(responseListenerCreator, "responseListenerCreator");
        this.f27786a = context;
        this.f27787b = requestPolicy;
        this.f27788c = urlConfigurator;
        this.f27789d = responseListenerCreator;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.yandex.mobile.ads.impl.io1
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(@NotNull kotlin.coroutines.d dVar) {
        a aVar;
        int i4;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i5 = aVar.f27792d;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                aVar.f27792d = i5 - Integer.MIN_VALUE;
                Object obj = aVar.f27790b;
                Object f4 = AbstractC1241b.f();
                i4 = aVar.f27792d;
                if (i4 != 0) {
                    ResultKt.a(obj);
                    aVar.f27792d = 1;
                    C3345o c3345o = new C3345o(AbstractC1241b.c(aVar), 1);
                    c3345o.E();
                    wk0 wk0Var = this.f27789d;
                    b onSuccess = new b(c3345o);
                    c onError = new c(c3345o);
                    wk0Var.getClass();
                    Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
                    Intrinsics.checkNotNullParameter(onError, "onError");
                    ko0 request = new ko0(this.f27786a, this.f27788c.b(), this.f27787b, this.f27788c.a(), new vk0(onSuccess, onError));
                    int i6 = aq1.f23419c;
                    aq1 a4 = aq1.a.a();
                    Context context = this.f27786a;
                    synchronized (a4) {
                        Intrinsics.checkNotNullParameter(context, "context");
                        Intrinsics.checkNotNullParameter(request, "request");
                        vc1.a(context).a(request);
                    }
                    obj = c3345o.y();
                    if (obj == AbstractC1241b.f()) {
                        kotlin.coroutines.jvm.internal.h.c(aVar);
                    }
                    if (obj == f4) {
                        return f4;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.a(obj);
                }
                return ((Result) obj).h();
            }
        }
        aVar = new a(dVar);
        Object obj2 = aVar.f27790b;
        Object f42 = AbstractC1241b.f();
        i4 = aVar.f27792d;
        if (i4 != 0) {
        }
        return ((Result) obj2).h();
    }
}
