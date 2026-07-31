package com.yandex.mobile.ads.impl;

import a2.AbstractC1241b;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o2.InterfaceC3316J;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import x2.InterfaceC3515a;

@kotlin.coroutines.jvm.internal.f(c = "com.yandex.mobile.ads.features.debugpanel.data.repo.DebugPanelRepositoryImpl$getAllData$2", f = "DebugPanelRepositoryImpl.kt", l = {46, 25}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class lx extends kotlin.coroutines.jvm.internal.l implements Function2<InterfaceC3316J, kotlin.coroutines.d, Object> {

    /* renamed from: b, reason: collision with root package name */
    InterfaceC3515a f28791b;

    /* renamed from: c, reason: collision with root package name */
    mx f28792c;

    /* renamed from: d, reason: collision with root package name */
    mx f28793d;

    /* renamed from: e, reason: collision with root package name */
    boolean f28794e;

    /* renamed from: f, reason: collision with root package name */
    int f28795f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ mx f28796g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ boolean f28797h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    lx(mx mxVar, boolean z4, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f28796g = mxVar;
        this.f28797h = z4;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d create(@Nullable Object obj, @NotNull kotlin.coroutines.d dVar) {
        return new lx(this.f28796g, this.f28797h, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new lx(this.f28796g, this.f28797h, (kotlin.coroutines.d) obj2).invokeSuspend(Unit.f41027a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0050, code lost:
    
        if (r7.b(null, r6) == r0) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x007b  */
    @Override // kotlin.coroutines.jvm.internal.a
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(@NotNull Object obj) {
        InterfaceC3515a interfaceC3515a;
        mx mxVar;
        boolean z4;
        InterfaceC3515a interfaceC3515a2;
        Throwable th;
        gx gxVar;
        io1 io1Var;
        Object obj2;
        mx mxVar2;
        vr0 vr0Var;
        rw rwVar;
        gx gxVar2;
        Object f4 = AbstractC1241b.f();
        int i4 = this.f28795f;
        try {
            if (i4 == 0) {
                ResultKt.a(obj);
                interfaceC3515a = this.f28796g.f29297f;
                mxVar = this.f28796g;
                z4 = this.f28797h;
                this.f28791b = interfaceC3515a;
                this.f28792c = mxVar;
                this.f28794e = z4;
                this.f28795f = 1;
            } else {
                if (i4 != 1) {
                    if (i4 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    mxVar2 = this.f28793d;
                    mxVar = this.f28792c;
                    interfaceC3515a2 = this.f28791b;
                    try {
                        ResultKt.a(obj);
                        obj2 = ((Result) obj).h();
                        if (Result.m244isFailureimpl(obj2)) {
                            obj2 = null;
                        }
                        mxVar2.f29296e = (gx) obj2;
                        vr0Var = mxVar.f29292a;
                        cx a4 = vr0Var.a();
                        rwVar = mxVar.f29294c;
                        gxVar2 = mxVar.f29296e;
                        qw a5 = rwVar.a(a4, gxVar2);
                        interfaceC3515a2.c(null);
                        return a5;
                    } catch (Throwable th2) {
                        th = th2;
                        interfaceC3515a2.c(null);
                        throw th;
                    }
                }
                boolean z5 = this.f28794e;
                mx mxVar3 = this.f28792c;
                InterfaceC3515a interfaceC3515a3 = this.f28791b;
                ResultKt.a(obj);
                interfaceC3515a = interfaceC3515a3;
                z4 = z5;
                mxVar = mxVar3;
            }
            gxVar = mxVar.f29296e;
            if (gxVar != null && !z4) {
                interfaceC3515a2 = interfaceC3515a;
                vr0Var = mxVar.f29292a;
                cx a42 = vr0Var.a();
                rwVar = mxVar.f29294c;
                gxVar2 = mxVar.f29296e;
                qw a52 = rwVar.a(a42, gxVar2);
                interfaceC3515a2.c(null);
                return a52;
            }
            io1Var = mxVar.f29293b;
            this.f28791b = interfaceC3515a;
            this.f28792c = mxVar;
            this.f28793d = mxVar;
            this.f28795f = 2;
            Object a6 = io1Var.a(this);
            if (a6 != f4) {
                interfaceC3515a2 = interfaceC3515a;
                obj2 = a6;
                mxVar2 = mxVar;
                if (Result.m244isFailureimpl(obj2)) {
                }
                mxVar2.f29296e = (gx) obj2;
                vr0Var = mxVar.f29292a;
                cx a422 = vr0Var.a();
                rwVar = mxVar.f29294c;
                gxVar2 = mxVar.f29296e;
                qw a522 = rwVar.a(a422, gxVar2);
                interfaceC3515a2.c(null);
                return a522;
            }
            return f4;
        } catch (Throwable th3) {
            interfaceC3515a2 = interfaceC3515a;
            th = th3;
            interfaceC3515a2.c(null);
            throw th;
        }
    }
}
