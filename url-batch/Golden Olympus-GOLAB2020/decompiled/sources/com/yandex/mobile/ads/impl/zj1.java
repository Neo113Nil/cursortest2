package com.yandex.mobile.ads.impl;

import a2.AbstractC1241b;
import android.content.Context;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class zj1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2286v2 f35609a;

    @kotlin.coroutines.jvm.internal.f(c = "com.monetization.ads.base.mediation.prefetch.PrefetchedMediationDataLoader", f = "PrefetchedMediationDataLoader.kt", l = {19}, m = "loadPrefetchedMediationData")
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f35610b;

        /* renamed from: d, reason: collision with root package name */
        int f35612d;

        a(kotlin.coroutines.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f35610b = obj;
            this.f35612d |= Integer.MIN_VALUE;
            return zj1.this.a(null, null, this);
        }
    }

    public zj1(@NotNull C2286v2 adConfiguration) {
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        this.f35609a = adConfiguration;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(@NotNull Context context, @NotNull C2144ok c2144ok, @NotNull kotlin.coroutines.d dVar) {
        a aVar;
        int i4;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i5 = aVar.f35612d;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                aVar.f35612d = i5 - Integer.MIN_VALUE;
                Object obj = aVar.f35610b;
                Object f4 = AbstractC1241b.f();
                i4 = aVar.f35612d;
                if (i4 != 0) {
                    ResultKt.a(obj);
                    C2286v2 c2286v2 = this.f35609a;
                    C2133o9 c2133o9 = new C2133o9(c2144ok);
                    qx0 qx0Var = new qx0(c2286v2, null);
                    ro roVar = new ro(c2286v2);
                    y40 y40Var = new y40(c2286v2, c2144ok, c2133o9, qx0Var, roVar, new lk1(qx0Var, roVar), dq0.a());
                    aVar.f35612d = 1;
                    obj = y40Var.a(context, aVar);
                    if (obj == f4) {
                        return f4;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.a(obj);
                }
                return (String) obj;
            }
        }
        aVar = new a(dVar);
        Object obj2 = aVar.f35610b;
        Object f42 = AbstractC1241b.f();
        i4 = aVar.f35612d;
        if (i4 != 0) {
        }
        return (String) obj2;
    }
}
