package com.ironsource;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.IronSourceSegment;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.ms;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class cs {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final bk f15787a = new bk();

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final yi f15788b = new yi(IronSourceThreadManager.INSTANCE.getInitHandler());

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final of f15789c = nm.f18364r.d().f();

    @Metadata
    public static final class a extends ir {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Runnable f15790a;

        a(Runnable runnable) {
            this.f15790a = runnable;
        }

        @Override // com.ironsource.ir
        public void a() {
            this.f15790a.run();
        }
    }

    @Nullable
    public final ms a(@NotNull Context context, @NotNull String appKey) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appKey, "appKey");
        return com.ironsource.mediationsdk.p.m().a(context, appKey);
    }

    @NotNull
    public final of b() {
        return this.f15789c;
    }

    @NotNull
    public final bk c() {
        return this.f15787a;
    }

    @Nullable
    public final IronSourceSegment d() {
        return com.ironsource.mediationsdk.p.m().t();
    }

    public final void e(@NotNull Runnable callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, new a(callback), 0L, 2, null);
    }

    public final void f() {
        com.ironsource.mediationsdk.p.m().U();
    }

    public final void g() {
        br.i().a(new zb(IronSourceConstants.USING_CACHE_FOR_INIT_EVENT, IronSourceUtils.getMediationAdditionalData(false)));
    }

    @NotNull
    public final String a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String b4 = com.ironsource.mediationsdk.p.m().b(context);
        Intrinsics.checkNotNullExpressionValue(b4, "getInstance().getAdvertiserId(context)");
        return b4;
    }

    @NotNull
    public final String b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String M3 = this.f15789c.M(context);
        Intrinsics.checkNotNullExpressionValue(M3, "deviceInfoService.getOrG…UniqueIdentifier(context)");
        return M3;
    }

    public final void c(@NotNull Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        this.f15788b.b(runnable);
    }

    public final void d(@NotNull Runnable callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, callback, 0L, 2, null);
    }

    public final boolean e() {
        return IronSourceUtils.isEncryptedResponse();
    }

    public final void a() {
        dq.c().a();
    }

    public final void b(@NotNull ir safeRunnable) {
        Intrinsics.checkNotNullParameter(safeRunnable, "safeRunnable");
        this.f15788b.a(safeRunnable);
    }

    public final boolean c(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return IronSourceUtils.isNetworkConnected(context);
    }

    public final void a(long j4, @NotNull ms.a responseOrigin) {
        Intrinsics.checkNotNullParameter(responseOrigin, "responseOrigin");
        com.ironsource.mediationsdk.p.m().a(j4, responseOrigin);
    }

    public final void b(@NotNull Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        IronSourceThreadManager.postMediationBackgroundTask$default(IronSourceThreadManager.INSTANCE, runnable, 0L, 2, null);
    }

    public final void a(@NotNull as initStatus) {
        Intrinsics.checkNotNullParameter(initStatus, "initStatus");
        bs.f15648a.a(initStatus);
    }

    public static /* synthetic */ void a(cs csVar, ir irVar, long j4, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            j4 = 0;
        }
        csVar.a(irVar, j4);
    }

    public static /* synthetic */ void a(cs csVar, Runnable runnable, long j4, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            j4 = 0;
        }
        csVar.a(runnable, j4);
    }

    public final void a(@NotNull C1449d4 reporterSettings) {
        Intrinsics.checkNotNullParameter(reporterSettings, "reporterSettings");
        o9.d().a(reporterSettings.b(), reporterSettings.d(), reporterSettings.c(), reporterSettings.e(), IronSourceUtils.getSessionId(), reporterSettings.a(), reporterSettings.g());
    }

    public final void a(@NotNull ir safeRunnable) {
        Intrinsics.checkNotNullParameter(safeRunnable, "safeRunnable");
        a(this, safeRunnable, 0L, 2, (Object) null);
    }

    public final void a(@NotNull ir safeRunnable, long j4) {
        Intrinsics.checkNotNullParameter(safeRunnable, "safeRunnable");
        this.f15788b.a(safeRunnable, j4);
    }

    public final void a(@NotNull Runnable callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f15788b.a(callback);
    }

    public final void a(@NotNull Runnable runnable, long j4) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        IronSourceThreadManager.INSTANCE.postOnUiThreadTask(runnable, j4);
    }

    public final void a(@NotNull String key, @NotNull String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        if (TextUtils.isEmpty(value)) {
            return;
        }
        de.a().a(key, value);
    }
}
