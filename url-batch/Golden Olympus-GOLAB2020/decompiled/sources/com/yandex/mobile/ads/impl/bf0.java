package com.yandex.mobile.ads.impl;

import a2.AbstractC1241b;
import android.content.Context;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class bf0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2286v2 f23731a;

    @kotlin.coroutines.jvm.internal.f(c = "com.monetization.ads.base.mediation.bidding.HeaderBiddingDataLoader", f = "HeaderBiddingDataLoader.kt", l = {18}, m = "loadHeaderBiddingData")
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f23732b;

        /* renamed from: d, reason: collision with root package name */
        int f23734d;

        a(kotlin.coroutines.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f23732b = obj;
            this.f23734d |= Integer.MIN_VALUE;
            return bf0.this.a(null, null, this);
        }
    }

    public bf0(@NotNull C2286v2 adConfiguration) {
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        this.f23731a = adConfiguration;
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
            int i5 = aVar.f23734d;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                aVar.f23734d = i5 - Integer.MIN_VALUE;
                Object obj = aVar.f23732b;
                Object f4 = AbstractC1241b.f();
                i4 = aVar.f23734d;
                if (i4 != 0) {
                    ResultKt.a(obj);
                    C2286v2 c2286v2 = this.f23731a;
                    C1834bj c1834bj = new C1834bj();
                    C2110n9 c2110n9 = new C2110n9(c2144ok);
                    qx0 qx0Var = new qx0(c2286v2, null);
                    x40 x40Var = new x40(c2286v2, c2144ok, c1834bj, c2110n9, qx0Var, new zc1(qx0Var));
                    aVar.f23734d = 1;
                    obj = x40Var.a(context, aVar);
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
        Object obj2 = aVar.f23732b;
        Object f42 = AbstractC1241b.f();
        i4 = aVar.f23734d;
        if (i4 != 0) {
        }
        return (String) obj2;
    }
}
