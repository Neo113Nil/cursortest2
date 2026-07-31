package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.e50;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.q1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2171q1 implements u32 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2360y7<String> f30631a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C2286v2 f30632b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C1871d8 f30633c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final C2148p1 f30634d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final e50 f30635e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final WeakReference<Context> f30636f;

    public C2171q1(@NotNull Context context, @NotNull C2148p1 adActivityShowManager, @NotNull C2360y7 adResponse, @NotNull C1871d8 resultReceiver, @NotNull vu1 sdkEnvironmentModule, @NotNull e50 environmentController, @NotNull C2286v2 adConfiguration) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sdkEnvironmentModule, "sdkEnvironmentModule");
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(resultReceiver, "resultReceiver");
        Intrinsics.checkNotNullParameter(adActivityShowManager, "adActivityShowManager");
        Intrinsics.checkNotNullParameter(environmentController, "environmentController");
        this.f30631a = adResponse;
        this.f30632b = adConfiguration;
        this.f30633c = resultReceiver;
        this.f30634d = adActivityShowManager;
        this.f30635e = environmentController;
        this.f30636f = new WeakReference<>(context);
    }

    @Override // com.yandex.mobile.ads.impl.u32
    public final void a(@NotNull np1 reporter, @NotNull String targetUrl) {
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(targetUrl, "targetUrl");
        this.f30635e.c().getClass();
        this.f30634d.a(this.f30636f.get(), this.f30632b, this.f30631a, reporter, targetUrl, this.f30633c, Intrinsics.areEqual((Object) null, Boolean.TRUE) || this.f30631a.G());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C2171q1(Context context, C2360y7 c2360y7, C1871d8 c1871d8, vu1 vu1Var, C2286v2 c2286v2) {
        this(context, r2, c2360y7, c1871d8, vu1Var, e50.a.a(context), c2286v2);
        C2148p1 c2148p1 = new C2148p1(vu1Var);
        int i4 = e50.f25096e;
    }
}
