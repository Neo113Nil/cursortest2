package com.yandex.mobile.ads.impl;

import a2.AbstractC1241b;
import com.yandex.mobile.ads.impl.tk0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o2.AbstractC3313G;
import o2.AbstractC3333i;
import o2.InterfaceC3316J;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class jx implements ix {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final vr0 f27882a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final io1 f27883b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final lz0 f27884c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final sk0 f27885d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final uk0 f27886e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final AbstractC3313G f27887f;

    @kotlin.coroutines.jvm.internal.f(c = "com.yandex.mobile.ads.features.debugpanel.data.repo.DebugPanelReportRepositoryImpl$getReport$2", f = "DebugPanelReportRepositoryImpl.kt", l = {26}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.l implements Function2<InterfaceC3316J, kotlin.coroutines.d, Object> {

        /* renamed from: b, reason: collision with root package name */
        cx f27888b;

        /* renamed from: c, reason: collision with root package name */
        dx f27889c;

        /* renamed from: d, reason: collision with root package name */
        int f27890d;

        a(kotlin.coroutines.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d create(@Nullable Object obj, @NotNull kotlin.coroutines.d dVar) {
            return jx.this.new a(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return jx.this.new a((kotlin.coroutines.d) obj2).invokeSuspend(Unit.f41027a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            cx a4;
            dx dxVar;
            Object obj2;
            List<fx> emptyList;
            Object f4 = AbstractC1241b.f();
            int i4 = this.f27890d;
            if (i4 == 0) {
                ResultKt.a(obj);
                a4 = jx.this.f27882a.a();
                dx d4 = a4.d();
                if (d4 == null) {
                    return tk0.b.f32472a;
                }
                io1 io1Var = jx.this.f27883b;
                this.f27888b = a4;
                this.f27889c = d4;
                this.f27890d = 1;
                Object a5 = io1Var.a(this);
                if (a5 == f4) {
                    return f4;
                }
                dxVar = d4;
                obj2 = a5;
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                dxVar = this.f27889c;
                a4 = this.f27888b;
                ResultKt.a(obj);
                obj2 = ((Result) obj).h();
            }
            if (Result.m244isFailureimpl(obj2)) {
                obj2 = null;
            }
            gx gxVar = (gx) obj2;
            if (gxVar == null || (emptyList = gxVar.f()) == null) {
                emptyList = CollectionsKt.emptyList();
            }
            List<cz0> e4 = a4.e();
            ArrayList a6 = jx.this.f27884c.a(emptyList);
            return jx.this.f27886e.a(jx.this.f27885d.a(new hx(a4.a(), a4.f(), a6.isEmpty() ? e4 : a6, a4.b(), dxVar.b(), dxVar.a())));
        }
    }

    public jx(@NotNull vr0 localDataSource, @NotNull io1 remoteDataSource, @NotNull lz0 networksMapper, @NotNull sk0 inspectorReportMapper, @NotNull uk0 reportStorage, @NotNull AbstractC3313G ioDispatcher) {
        Intrinsics.checkNotNullParameter(localDataSource, "localDataSource");
        Intrinsics.checkNotNullParameter(remoteDataSource, "remoteDataSource");
        Intrinsics.checkNotNullParameter(networksMapper, "networksMapper");
        Intrinsics.checkNotNullParameter(inspectorReportMapper, "inspectorReportMapper");
        Intrinsics.checkNotNullParameter(reportStorage, "reportStorage");
        Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        this.f27882a = localDataSource;
        this.f27883b = remoteDataSource;
        this.f27884c = networksMapper;
        this.f27885d = inspectorReportMapper;
        this.f27886e = reportStorage;
        this.f27887f = ioDispatcher;
    }

    @Override // com.yandex.mobile.ads.impl.ix
    @Nullable
    public final Object a(@NotNull kotlin.coroutines.d dVar) {
        return AbstractC3333i.g(this.f27887f, new a(null), dVar);
    }
}
