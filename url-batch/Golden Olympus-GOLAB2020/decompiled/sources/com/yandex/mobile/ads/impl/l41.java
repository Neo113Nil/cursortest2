package com.yandex.mobile.ads.impl;

import a2.AbstractC1241b;
import android.content.Context;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.yandex.mobile.ads.impl.ew1;
import java.util.List;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import o2.AbstractC3333i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class l41 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ew1 f28413a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final dc1 f28414b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final zb1 f28415c;

    @kotlin.coroutines.jvm.internal.f(c = "com.monetization.ads.nativeads.creator.videowrapper.NativeAdBlockVideoWrapperLoader", f = "NativeAdBlockVideoWrapperLoader.kt", l = {AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE}, m = "updateNativeAdBlockWithWrapperVideo")
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        h41 f28416b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f28417c;

        /* renamed from: e, reason: collision with root package name */
        int f28419e;

        a(kotlin.coroutines.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f28417c = obj;
            this.f28419e |= Integer.MIN_VALUE;
            return l41.this.a((Context) null, (h41) null, this);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l41(Context context, C2286v2 c2286v2) {
        this(context, c2286v2, ew1.a.a(), new dc1(context, c2286v2), new zb1());
        int i4 = ew1.f25476l;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(l41 l41Var, C2276uf c2276uf, kotlin.coroutines.d dVar) {
        k41 k41Var;
        int i4;
        C2276uf c2276uf2;
        C2276uf c2276uf3;
        ab2 ab2Var;
        l41Var.getClass();
        if (dVar instanceof k41) {
            k41Var = (k41) dVar;
            int i5 = k41Var.f28050e;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                k41Var.f28050e = i5 - Integer.MIN_VALUE;
                Object obj = k41Var.f28048c;
                Object f4 = AbstractC1241b.f();
                i4 = k41Var.f28050e;
                if (i4 != 0) {
                    ResultKt.a(obj);
                    if (c2276uf.d() instanceof mw0) {
                        Intrinsics.checkNotNull(c2276uf, "null cannot be cast to non-null type com.monetization.ads.network.model.Asset<R of com.monetization.ads.network.model.AssetKt.castGeneric>");
                        c2276uf2 = c2276uf;
                    } else {
                        c2276uf2 = null;
                    }
                    if (c2276uf2 == null) {
                        return c2276uf;
                    }
                    dc1 dc1Var = l41Var.f28414b;
                    ab2 c4 = ((mw0) c2276uf2.d()).c();
                    k41Var.f28047b = c2276uf2;
                    k41Var.f28050e = 1;
                    dc1Var.getClass();
                    Object g4 = AbstractC3333i.g(o2.Z.b(), new ac1(c4, dc1Var, null), k41Var);
                    if (g4 == f4) {
                        return f4;
                    }
                    C2276uf c2276uf4 = c2276uf2;
                    obj = g4;
                    c2276uf3 = c2276uf4;
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c2276uf3 = k41Var.f28047b;
                    ResultKt.a(obj);
                }
                ab2Var = (ab2) obj;
                if (ab2Var != null && ((mw0) c2276uf3.d()).a() == null && ((mw0) c2276uf3.d()).b() == null) {
                    return null;
                }
                return C2276uf.a(c2276uf3, mw0.a((mw0) c2276uf3.d(), ab2Var));
            }
        }
        k41Var = new k41(l41Var, dVar);
        Object obj2 = k41Var.f28048c;
        Object f42 = AbstractC1241b.f();
        i4 = k41Var.f28050e;
        if (i4 != 0) {
        }
        ab2Var = (ab2) obj2;
        if (ab2Var != null) {
        }
        return C2276uf.a(c2276uf3, mw0.a((mw0) c2276uf3.d(), ab2Var));
    }

    public l41(@NotNull Context context, @NotNull C2286v2 adConfiguration, @NotNull ew1 sdkSettings, @NotNull dc1 nativeWrapperVideoLoader, @NotNull zb1 nativeWrapperVideoAssetChecker) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(sdkSettings, "sdkSettings");
        Intrinsics.checkNotNullParameter(nativeWrapperVideoLoader, "nativeWrapperVideoLoader");
        Intrinsics.checkNotNullParameter(nativeWrapperVideoAssetChecker, "nativeWrapperVideoAssetChecker");
        this.f28413a = sdkSettings;
        this.f28414b = nativeWrapperVideoLoader;
        this.f28415c = nativeWrapperVideoAssetChecker;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0065 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(@NotNull Context context, @NotNull h41 h41Var, @NotNull kotlin.coroutines.d dVar) {
        a aVar;
        int i4;
        List list;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i5 = aVar.f28419e;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                aVar.f28419e = i5 - Integer.MIN_VALUE;
                Object obj = aVar.f28417c;
                Object f4 = AbstractC1241b.f();
                i4 = aVar.f28419e;
                if (i4 != 0) {
                    ResultKt.a(obj);
                    du1 a4 = this.f28413a.a(context);
                    if (a4 == null || !a4.H()) {
                        return h41Var;
                    }
                    List<u31> e4 = h41Var.c().e();
                    aVar.f28416b = h41Var;
                    aVar.f28419e = 1;
                    obj = AbstractC3333i.g(o2.Z.b(), new m41(e4, this, null), aVar);
                    if (obj == f4) {
                        return f4;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h41Var = aVar.f28416b;
                    ResultKt.a(obj);
                }
                list = (List) obj;
                if (list != null) {
                    return null;
                }
                return h41.a(h41Var, n61.a(h41Var.c(), list));
            }
        }
        aVar = new a(dVar);
        Object obj2 = aVar.f28417c;
        Object f42 = AbstractC1241b.f();
        i4 = aVar.f28419e;
        if (i4 != 0) {
        }
        list = (List) obj2;
        if (list != null) {
        }
    }
}
