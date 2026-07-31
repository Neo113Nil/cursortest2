package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.od0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public abstract class yc0<T extends od0<T>> extends vf0 {

    /* renamed from: A, reason: collision with root package name */
    @NotNull
    private final tc0 f35053A;

    /* renamed from: B, reason: collision with root package name */
    @Nullable
    private rc0<T> f35054B;

    /* renamed from: C, reason: collision with root package name */
    @Nullable
    private rc0<T> f35055C;

    /* renamed from: D, reason: collision with root package name */
    @Nullable
    private T f35056D;

    /* renamed from: x, reason: collision with root package name */
    @NotNull
    private final zc0<T> f35057x;

    /* renamed from: y, reason: collision with root package name */
    @NotNull
    private final id0<T> f35058y;

    /* renamed from: z, reason: collision with root package name */
    @NotNull
    private final yf0 f35059z;

    public /* synthetic */ yc0(Context context, C2286v2 c2286v2, vu1 vu1Var, zc0 zc0Var, C2105n4 c2105n4, id0 id0Var, yf0 yf0Var) {
        this(context, c2286v2, vu1Var, zc0Var, c2105n4, id0Var, yf0Var, new tc0(vu1Var));
    }

    @NotNull
    protected abstract rc0<T> a(@NotNull sc0 sc0Var);

    @Override // com.yandex.mobile.ads.impl.AbstractC2025jj
    protected final void a(@NotNull C1866d3 error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f35057x.a(error);
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC2025jj
    public final void d() {
        if (C2362y9.a((ao) this)) {
            return;
        }
        Context k4 = k();
        rc0[] rc0VarArr = {this.f35055C, this.f35054B};
        for (int i4 = 0; i4 < 2; i4++) {
            rc0 rc0Var = rc0VarArr[i4];
            if (rc0Var != null) {
                rc0Var.a(k4);
            }
        }
        super.d();
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC2025jj
    protected final void q() {
        C1866d3 error = C1942g7.q();
        Intrinsics.checkNotNullParameter(error, "error");
        this.f35057x.a(error);
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC2025jj
    protected final void r() {
        T t4 = this.f35056D;
        if (t4 != null) {
            this.f35057x.a(t4);
        } else {
            this.f35057x.a(C1942g7.m());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yc0(@NotNull Context context, @NotNull C2286v2 adConfiguration, @NotNull vu1 sdkEnvironmentModule, @NotNull zc0<T> fullScreenLoadEventListener, @NotNull C2105n4 adLoadingPhasesManager, @NotNull id0<T> fullscreenAdContentFactory, @NotNull yf0 htmlAdResponseReportManager, @NotNull tc0 adResponseControllerFactoryCreator) {
        super(context, adConfiguration, adLoadingPhasesManager);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(sdkEnvironmentModule, "sdkEnvironmentModule");
        Intrinsics.checkNotNullParameter(fullScreenLoadEventListener, "fullScreenLoadEventListener");
        Intrinsics.checkNotNullParameter(adLoadingPhasesManager, "adLoadingPhasesManager");
        Intrinsics.checkNotNullParameter(fullscreenAdContentFactory, "fullscreenAdContentFactory");
        Intrinsics.checkNotNullParameter(htmlAdResponseReportManager, "htmlAdResponseReportManager");
        Intrinsics.checkNotNullParameter(adResponseControllerFactoryCreator, "adResponseControllerFactoryCreator");
        this.f35057x = fullScreenLoadEventListener;
        this.f35058y = fullscreenAdContentFactory;
        this.f35059z = htmlAdResponseReportManager;
        this.f35053A = adResponseControllerFactoryCreator;
        a(C2223s8.f31620a.a());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yandex.mobile.ads.impl.AbstractC2025jj, com.yandex.mobile.ads.impl.qq1.b
    public void a(@NotNull C2360y7<String> adResponse) {
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        super.a((C2360y7) adResponse);
        this.f35059z.a(adResponse);
        this.f35059z.a(e());
        rc0<T> a4 = a(this.f35053A.a(adResponse));
        this.f35055C = this.f35054B;
        this.f35054B = a4;
        this.f35056D = this.f35058y.a(adResponse, e(), a4);
        Context a5 = C2054l0.a();
        if (a5 != null) {
            ap0.a(new Object[0]);
        }
        if (a5 == null) {
            a5 = k();
        }
        a4.a(a5, adResponse);
    }
}
