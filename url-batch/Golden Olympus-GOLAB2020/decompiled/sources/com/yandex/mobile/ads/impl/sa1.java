package com.yandex.mobile.ads.impl;

import a2.AbstractC1241b;
import android.content.Context;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import io.appmetrica.analytics.impl.C3139z9;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o2.C3345o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class sa1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final xz f31647a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ya0 f31648b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final l41 f31649c;

    @kotlin.coroutines.jvm.internal.f(c = "com.monetization.ads.nativeads.video.cache.NativeVideoLoadController", f = "NativeVideoLoadController.kt", l = {C3139z9.f40334K, IronSourceConstants.APP_ENTER_BACKGROUND}, m = "loadVideo")
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f31650b;

        /* renamed from: c, reason: collision with root package name */
        Context f31651c;

        /* renamed from: d, reason: collision with root package name */
        sv f31652d;

        /* renamed from: e, reason: collision with root package name */
        boolean f31653e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f31654f;

        /* renamed from: h, reason: collision with root package name */
        int f31656h;

        a(kotlin.coroutines.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f31654f = obj;
            this.f31656h |= Integer.MIN_VALUE;
            return sa1.this.a(false, null, null, null, this);
        }
    }

    public /* synthetic */ sa1(C2286v2 c2286v2, Context context, C2105n4 c2105n4) {
        this(c2286v2, context, c2105n4, new xz(context, c2105n4), new ya0(context, c2105n4), new l41(context, c2286v2));
    }

    public final void a() {
        this.f31647a.a();
        this.f31648b.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0062 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(boolean z4, @NotNull Context context, @NotNull h41 h41Var, @NotNull sv svVar, @NotNull kotlin.coroutines.d dVar) {
        a aVar;
        int i4;
        sa1 sa1Var;
        h41 h41Var2;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i5 = aVar.f31656h;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                aVar.f31656h = i5 - Integer.MIN_VALUE;
                Object obj = aVar.f31654f;
                Object f4 = AbstractC1241b.f();
                i4 = aVar.f31656h;
                if (i4 != 0) {
                    ResultKt.a(obj);
                    l41 l41Var = this.f31649c;
                    aVar.f31650b = this;
                    aVar.f31651c = context;
                    aVar.f31652d = svVar;
                    aVar.f31653e = z4;
                    aVar.f31656h = 1;
                    obj = l41Var.a(context, h41Var, aVar);
                    if (obj != f4) {
                        sa1Var = this;
                    }
                    return f4;
                }
                if (i4 != 1) {
                    if (i4 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h41 h41Var3 = (h41) aVar.f31650b;
                    ResultKt.a(obj);
                    return h41Var3;
                }
                z4 = aVar.f31653e;
                svVar = aVar.f31652d;
                context = aVar.f31651c;
                sa1Var = (sa1) aVar.f31650b;
                ResultKt.a(obj);
                h41Var2 = (h41) obj;
                if (h41Var2 != null) {
                    return null;
                }
                if (z4) {
                    C2360y7<?> b4 = h41Var2.b();
                    if (b4.S()) {
                        aVar.f31650b = h41Var2;
                        aVar.f31651c = null;
                        aVar.f31652d = null;
                        aVar.f31656h = 2;
                        sa1Var.getClass();
                        C3345o c3345o = new C3345o(AbstractC1241b.c(aVar), 1);
                        c3345o.E();
                        ta1 ta1Var = new ta1(c3345o);
                        boolean a4 = n80.a(context, m80.f28940c);
                        if (Intrinsics.areEqual(ab1.f23212c.a(), b4.F()) && a4) {
                            sa1Var.f31648b.a(h41Var2, ta1Var, svVar);
                        } else {
                            sa1Var.f31647a.a(h41Var2, ta1Var, svVar);
                        }
                        Object y4 = c3345o.y();
                        if (y4 == AbstractC1241b.f()) {
                            kotlin.coroutines.jvm.internal.h.c(aVar);
                        }
                        if (y4 != AbstractC1241b.f()) {
                            y4 = Unit.f41027a;
                        }
                        if (y4 == f4) {
                            return f4;
                        }
                    }
                }
                return h41Var2;
            }
        }
        aVar = new a(dVar);
        Object obj2 = aVar.f31654f;
        Object f42 = AbstractC1241b.f();
        i4 = aVar.f31656h;
        if (i4 != 0) {
        }
        h41Var2 = (h41) obj2;
        if (h41Var2 != null) {
        }
    }

    public sa1(@NotNull C2286v2 adConfiguration, @NotNull Context context, @NotNull C2105n4 adLoadingPhasesManager, @NotNull xz defaultNativeVideoLoader, @NotNull ya0 firstNativeVideoLoader, @NotNull l41 nativeAdBlockVideoWrapperLoader) {
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adLoadingPhasesManager, "adLoadingPhasesManager");
        Intrinsics.checkNotNullParameter(defaultNativeVideoLoader, "defaultNativeVideoLoader");
        Intrinsics.checkNotNullParameter(firstNativeVideoLoader, "firstNativeVideoLoader");
        Intrinsics.checkNotNullParameter(nativeAdBlockVideoWrapperLoader, "nativeAdBlockVideoWrapperLoader");
        this.f31647a = defaultNativeVideoLoader;
        this.f31648b = firstNativeVideoLoader;
        this.f31649c = nativeAdBlockVideoWrapperLoader;
    }

    public final void a(@NotNull Context context, @NotNull ob2<ya1> videoAdInfo, @NotNull C2360y7<?> adResponse) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(videoAdInfo, "videoAdInfo");
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        boolean a4 = n80.a(context, m80.f28940c);
        if (Intrinsics.areEqual(ab1.f23212c.a(), adResponse.F()) && a4) {
            this.f31648b.a(videoAdInfo.e());
        }
    }
}
