package com.ironsource;

import android.adservices.measurement.MeasurementManager;
import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.OutcomeReceiver;
import com.ironsource.b9;
import com.ironsource.da;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata
/* loaded from: classes2.dex */
public final class fq {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final sf f16265a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function0<Long> f16266b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final yf f16267c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Executor f16268d;

    @Metadata
    /* synthetic */ class a extends kotlin.jvm.internal.p implements Function0<Long> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f16269a = new a();

        a() {
            super(0, System.class, "currentTimeMillis", "currentTimeMillis()J", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Long invoke() {
            return Long.valueOf(System.currentTimeMillis());
        }
    }

    @Metadata
    public static final class b implements OutcomeReceiver {
        b() {
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onError(@NotNull Exception error) {
            Intrinsics.checkNotNullParameter(error, "error");
            fq.this.a(error.getMessage());
        }

        public void onResult(@Nullable Object obj) {
            fq.this.c();
        }
    }

    public fq() {
        this(null, null, null, null, 15, null);
    }

    private final Uri a(Context context) {
        of f4 = this.f16267c.f();
        String connectionType = IronSourceUtils.getConnectionType(context);
        Uri build = new Uri.Builder().scheme("https").authority("android-att.ironsrc.mobi").path("register_trigger").appendQueryParameter("osVersion", Build.VERSION.RELEASE).appendQueryParameter("apiLevel", String.valueOf(Build.VERSION.SDK_INT)).appendQueryParameter(b9.i.f15566l, Build.MODEL).appendQueryParameter("sdkVersion", IronSourceUtils.getSDKVersion()).appendQueryParameter("bundleID", context.getPackageName()).appendQueryParameter(ge.f16424S0, f4.p(context)).appendQueryParameter(ge.f16404I0, f4.G(context)).appendQueryParameter(ge.f16408K0, f4.t(context)).appendQueryParameter("isFirstSession", String.valueOf(b(context))).appendQueryParameter("coppa", b()).appendQueryParameter(ge.f16458g0, String.valueOf(C1495k1.a())).appendQueryParameter("origin", "1").appendQueryParameter(da.a.f15878d, String.valueOf(((Number) this.f16266b.invoke()).longValue())).appendQueryParameter(b9.i.f15585x, f4.b(context)).appendQueryParameter("deviceCarrier", f4.j(context)).appendQueryParameter(b9.i.f15581t, connectionType).appendQueryParameter(x8.f20294b, String.valueOf(StringsKt.w(connectionType, x8.f20294b, true))).build();
        Intrinsics.checkNotNullExpressionValue(build, "Builder()\n        .schem…arameter\n        .build()");
        return build;
    }

    private final String b() {
        ConcurrentHashMap<String, List<String>> c4 = rk.b().c();
        List<String> list = c4 != null ? c4.get(com.ironsource.mediationsdk.metadata.a.f17676b) : null;
        String str = list != null ? (String) CollectionsKt.first((List) list) : null;
        return str == null ? "" : str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c() {
        this.f16265a.a(new zb(55, null));
    }

    private final void d() {
        this.f16265a.a(new zb(54, null));
    }

    public fq(@NotNull sf eventManager, @NotNull Function0<Long> getTimeFunction, @NotNull yf serviceProvider, @NotNull Executor executor) {
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(getTimeFunction, "getTimeFunction");
        Intrinsics.checkNotNullParameter(serviceProvider, "serviceProvider");
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.f16265a = eventManager;
        this.f16266b = getTimeFunction;
        this.f16267c = serviceProvider;
        this.f16268d = executor;
    }

    @SuppressLint({"NewApi"})
    private final OutcomeReceiver a() {
        return new b();
    }

    private final boolean b(Context context) {
        return IronSourceUtils.getFirstSession(context);
    }

    @SuppressLint({"NewApi"})
    public final void c(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        d();
        try {
            MeasurementManager a4 = C1495k1.a(context);
            if (a4 == null) {
                a("could not obtain measurement manager");
            } else {
                a4.registerTrigger(a(context), this.f16268d, a());
            }
        } catch (Exception e4) {
            a(e4.getMessage());
            o9.d().a(e4);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ fq(sf sfVar, Function0 function0, yf yfVar, Executor executor, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(sfVar, function0, yfVar, executor);
        if ((i4 & 1) != 0) {
            sfVar = br.i();
            Intrinsics.checkNotNullExpressionValue(sfVar, "getInstance()");
        }
        function0 = (i4 & 2) != 0 ? a.f16269a : function0;
        yfVar = (i4 & 4) != 0 ? nm.f18364r.d() : yfVar;
        if ((i4 & 8) != 0) {
            executor = Executors.newSingleThreadExecutor();
            Intrinsics.checkNotNullExpressionValue(executor, "newSingleThreadExecutor()");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(String str) {
        this.f16265a.a(new zb(56, new JSONObject().put("reason", str)));
    }
}
