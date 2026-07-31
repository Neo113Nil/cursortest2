package com.ironsource;

import android.content.Context;
import android.os.Handler;
import android.view.Choreographer;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.integration.IntegrationHelper;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.ms;
import com.unity3d.mediation.LevelPlay;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata
/* loaded from: classes2.dex */
public class wl {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final yi f20240a = new yi(null, 1, null);

    @Metadata
    public static final class a extends ir {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Runnable f20241a;

        a(Runnable runnable) {
            this.f20241a = runnable;
        }

        @Override // com.ironsource.ir
        public void a() {
            this.f20241a.run();
        }
    }

    @Metadata
    public static final class b extends ir {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f20242a;

        b(Function0<Unit> function0) {
            this.f20242a = function0;
        }

        @Override // com.ironsource.ir
        public void a() {
            this.f20242a.invoke();
        }
    }

    @NotNull
    public final Handler a() {
        return this.f20240a.a();
    }

    public final void e(@NotNull Runnable callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, callback, 0L, 2, null);
    }

    @NotNull
    public final IronSource.AD_UNIT a(@NotNull LevelPlay.AdFormat adFormat) {
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        return com.unity3d.mediation.a.a(adFormat);
    }

    public final void b(@NotNull ir safeRunnable) {
        Intrinsics.checkNotNullParameter(safeRunnable, "safeRunnable");
        this.f20240a.a(safeRunnable);
    }

    public final void c(@NotNull final Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        a(this, new Runnable() { // from class: com.ironsource.L4
            @Override // java.lang.Runnable
            public final void run() {
                wl.b(wl.this, runnable);
            }
        }, 0L, 2, (Object) null);
    }

    public final void d(@NotNull Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        this.f20240a.b(runnable);
    }

    private final String a(String str, long j4) {
        return "responseOrigin=" + str + ";delayTimeAfterInitProcess=" + j4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(final wl this$0, final Runnable runnable) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(runnable, "$runnable");
        Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: com.ironsource.K4
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j4) {
                wl.a(wl.this, runnable, j4);
            }
        });
    }

    public final void a(long j4, @NotNull ms.a responseOrigin, long j5) {
        Intrinsics.checkNotNullParameter(responseOrigin, "responseOrigin");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("isMultipleAdUnits", 1);
        jSONObject.put(IronSourceConstants.EVENTS_DURATION, j4);
        String a4 = responseOrigin.a();
        Intrinsics.checkNotNullExpressionValue(a4, "responseOrigin.value");
        jSONObject.put(IronSourceConstants.EVENTS_EXT1, a(a4, j5));
        wt.a(IronSourceConstants.SDK_INIT_SUCCESS, jSONObject);
    }

    public final void b(@NotNull final Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        a(this, new Runnable() { // from class: com.ironsource.M4
            @Override // java.lang.Runnable
            public final void run() {
                wl.a(wl.this, runnable);
            }
        }, 0L, 2, (Object) null);
    }

    public final void a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        IntegrationHelper.validateIntegration(context.getApplicationContext());
    }

    public final void b(@NotNull String adUnitId, int i4, @Nullable String str) {
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorCode", i4);
        jSONObject.putOpt("reason", str);
        jSONObject.put("mediationAdUnitId", adUnitId);
        jSONObject.put("isMultipleAdUnits", 1);
        wt.a(IronSourceConstants.TROUBLESHOOTING_AD_UNIT_REWARD_PARSE_ERROR, jSONObject);
    }

    public final void a(@NotNull ir safeRunnable) {
        Intrinsics.checkNotNullParameter(safeRunnable, "safeRunnable");
        a(this, safeRunnable, 0L, 2, (Object) null);
    }

    public final void a(@NotNull ir safeRunnable, long j4) {
        Intrinsics.checkNotNullParameter(safeRunnable, "safeRunnable");
        this.f20240a.a(safeRunnable, j4);
    }

    public final void a(@NotNull nr error, long j4) {
        Intrinsics.checkNotNullParameter(error, "error");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorCode", error.c());
        jSONObject.put("reason", error.d());
        jSONObject.put("isMultipleAdUnits", 1);
        jSONObject.put(IronSourceConstants.EVENTS_DURATION, j4);
        wt.a(IronSourceConstants.SDK_INIT_FAILED, jSONObject);
    }

    public static /* synthetic */ void a(wl wlVar, ir irVar, long j4, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: postTask");
        }
        if ((i4 & 2) != 0) {
            j4 = 0;
        }
        wlVar.a(irVar, j4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(wl this$0, Runnable runnable) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(runnable, "$runnable");
        this$0.f20240a.b(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(wl this$0, Runnable runnable, long j4) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(runnable, "$runnable");
        this$0.b(runnable);
    }

    public static /* synthetic */ void a(wl wlVar, Runnable runnable, long j4, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: postOnUIThread");
        }
        if ((i4 & 2) != 0) {
            j4 = 0;
        }
        wlVar.a(runnable, j4);
    }

    public static /* synthetic */ void a(wl wlVar, Function0 function0, long j4, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: postTask");
        }
        if ((i4 & 2) != 0) {
            j4 = 0;
        }
        wlVar.a((Function0<Unit>) function0, j4);
    }

    public final void a(@NotNull Runnable callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f20240a.a(callback);
    }

    public final void a(@NotNull Runnable runnable, long j4) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new a(runnable), j4);
    }

    public final void a(@NotNull String adUnitId, int i4, @Nullable String str) {
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorCode", i4);
        jSONObject.putOpt("reason", str);
        jSONObject.put("mediationAdUnitId", adUnitId);
        jSONObject.put("isMultipleAdUnits", 1);
        wt.a(IronSourceConstants.TROUBLESHOOTING_AD_UNIT_CAPPING_PARSE_ERROR, jSONObject);
    }

    public final void a(@NotNull String placementName, @NotNull LevelPlay.AdFormat adFormat, int i4, @Nullable String str) {
        Intrinsics.checkNotNullParameter(placementName, "placementName");
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorCode", i4);
        jSONObject.putOpt("reason", str);
        jSONObject.put("placement", placementName);
        jSONObject.put(gl.f16534f, adFormat.getValue());
        jSONObject.put("adf", wt.b(com.unity3d.mediation.a.a(adFormat)));
        jSONObject.put("isMultipleAdUnits", 1);
        wt.a(IronSourceConstants.TROUBLESHOOTING_PLACEMENT_CAPPING_PARSE_ERROR, jSONObject);
    }

    public final void a(@NotNull Function0<Unit> action, long j4) {
        Intrinsics.checkNotNullParameter(action, "action");
        a((ir) new b(action), j4);
    }

    public final boolean a(@NotNull AdapterBaseInterface networkAdapter, @NotNull IronSource.AD_UNIT adFormat, @NotNull String providerName) {
        Intrinsics.checkNotNullParameter(networkAdapter, "networkAdapter");
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        Intrinsics.checkNotNullParameter(providerName, "providerName");
        return wt.a(networkAdapter, adFormat, providerName);
    }

    @NotNull
    public final IronSource.AD_UNIT[] a(@NotNull LevelPlay.AdFormat... adFormats) {
        Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        ArrayList arrayList = new ArrayList();
        for (LevelPlay.AdFormat adFormat : adFormats) {
            arrayList.add(a(adFormat));
        }
        return (IronSource.AD_UNIT[]) arrayList.toArray(new IronSource.AD_UNIT[0]);
    }
}
