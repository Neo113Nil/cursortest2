package com.yandex.mobile.ads.impl;

import a2.AbstractC1241b;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class de0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final kx f24594a;

    @kotlin.coroutines.jvm.internal.f(c = "com.yandex.mobile.ads.features.debugpanel.domain.GetMediationNetworkDataUseCase", f = "GetMediationNetworkDataUseCase.kt", l = {12}, m = "invoke")
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        String f24595b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f24596c;

        /* renamed from: e, reason: collision with root package name */
        int f24598e;

        a(kotlin.coroutines.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f24596c = obj;
            this.f24598e |= Integer.MIN_VALUE;
            return de0.this.a(null, false, this);
        }
    }

    public de0(@NotNull kx repo) {
        Intrinsics.checkNotNullParameter(repo, "repo");
        this.f24594a = repo;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(@NotNull String str, boolean z4, @NotNull kotlin.coroutines.d dVar) {
        a aVar;
        int i4;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i5 = aVar.f24598e;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                aVar.f24598e = i5 - Integer.MIN_VALUE;
                Object obj = aVar.f24596c;
                Object f4 = AbstractC1241b.f();
                i4 = aVar.f24598e;
                if (i4 != 0) {
                    ResultKt.a(obj);
                    kx kxVar = this.f24594a;
                    aVar.f24595b = str;
                    aVar.f24598e = 1;
                    obj = kxVar.a(z4, aVar);
                    if (obj == f4) {
                        return f4;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = aVar.f24595b;
                    ResultKt.a(obj);
                }
                for (Object obj2 : ((qw) obj).b().a()) {
                    if (Intrinsics.areEqual(((gw) obj2).e(), str)) {
                        return obj2;
                    }
                }
                return null;
            }
        }
        aVar = new a(dVar);
        Object obj3 = aVar.f24596c;
        Object f42 = AbstractC1241b.f();
        i4 = aVar.f24598e;
        if (i4 != 0) {
        }
        while (r6.hasNext()) {
        }
        return null;
    }
}
