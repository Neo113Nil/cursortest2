package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.yandex.mobile.ads.impl.AbstractC2372yj;
import com.yandex.mobile.ads.impl.ew1;
import com.yandex.mobile.ads.impl.ip1;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public abstract class x52<R, T> extends AbstractC2372yj<T> {

    /* renamed from: A, reason: collision with root package name */
    @NotNull
    private final C2388zc f34449A;

    /* renamed from: B, reason: collision with root package name */
    @NotNull
    private final C2131o7 f34450B;

    /* renamed from: w, reason: collision with root package name */
    @NotNull
    private final C2286v2 f34451w;

    /* renamed from: x, reason: collision with root package name */
    private final R f34452x;

    /* renamed from: y, reason: collision with root package name */
    @NotNull
    private final fq1<R, T> f34453y;

    /* renamed from: z, reason: collision with root package name */
    @NotNull
    private final mp1 f34454z;

    public /* synthetic */ x52(Context context, C2286v2 c2286v2, int i4, String str, AbstractC2372yj.a aVar, Object obj, fq1 fq1Var, yp1 yp1Var, int i5) {
        this(context, c2286v2, i4, str, aVar, obj, fq1Var, (i5 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : yp1Var, c2286v2.p().c(), new C2388zc(context), new C2131o7());
    }

    private final void x() {
        ip1 a4 = this.f34453y.a(this.f34452x);
        this.f34454z.a(a4);
        String c4 = a4.c();
        ip1.b bVar = ip1.b.f27352k;
        if (Intrinsics.areEqual(c4, bVar.a())) {
            this.f34449A.a(bVar, a4.b(), null, null);
        }
    }

    @Override // com.yandex.mobile.ads.impl.op1
    @NotNull
    public final qq1<T> a(@NotNull lc1 networkResponse) {
        Intrinsics.checkNotNullParameter(networkResponse, "networkResponse");
        int i4 = networkResponse.f28505a;
        qq1<T> a4 = a(networkResponse, i4);
        ip1 a5 = this.f34453y.a(a4, i4, this.f34452x);
        jp1 jp1Var = new jp1(a5.b(), 2);
        jp1Var.a(cf0.a(networkResponse.f28507c, bh0.f23803x), "server_log_id");
        Map<String, String> map = networkResponse.f28507c;
        if (map != null) {
            jp1Var.a(C2383z7.a(map));
        }
        this.f34454z.a(a5);
        return a4;
    }

    @NotNull
    protected abstract qq1<T> a(@NotNull lc1 lc1Var, int i4);

    @Override // com.yandex.mobile.ads.impl.AbstractC2372yj, com.yandex.mobile.ads.impl.op1
    @NotNull
    public hi2 b(@NotNull hi2 volleyError) {
        Intrinsics.checkNotNullParameter(volleyError, "requestError");
        lc1 lc1Var = volleyError.f26761b;
        this.f34454z.a(this.f34453y.a(null, lc1Var != null ? lc1Var.f28505a : -1, this.f34452x));
        Intrinsics.checkNotNullParameter(volleyError, "volleyError");
        Intrinsics.checkNotNullExpressionValue(volleyError, "parseNetworkError(...)");
        return volleyError;
    }

    @Override // com.yandex.mobile.ads.impl.op1
    @NotNull
    public Map<String, String> e() {
        Map createMapBuilder = MapsKt.createMapBuilder();
        createMapBuilder.putAll(this.f34451w.j().d());
        return MapsKt.build(createMapBuilder);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x52(@NotNull Context context, @NotNull C2286v2 adConfiguration, int i4, @NotNull String url, @NotNull AbstractC2372yj.a<T> listener, R r4, @NotNull fq1<R, T> requestReporter, @Nullable yp1 yp1Var, @NotNull mp1 metricaReporter, @NotNull C2388zc metricaLibraryEventReporter, @NotNull C2131o7 adRequestRetryPolicyCreator) {
        super(context, i4, url, listener, yp1Var);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(requestReporter, "requestReporter");
        Intrinsics.checkNotNullParameter(metricaReporter, "metricaReporter");
        Intrinsics.checkNotNullParameter(metricaLibraryEventReporter, "metricaLibraryEventReporter");
        Intrinsics.checkNotNullParameter(adRequestRetryPolicyCreator, "adRequestRetryPolicyCreator");
        this.f34451w = adConfiguration;
        this.f34452x = r4;
        this.f34453y = requestReporter;
        this.f34454z = metricaReporter;
        this.f34449A = metricaLibraryEventReporter;
        this.f34450B = adRequestRetryPolicyCreator;
        a(context);
        r();
        s();
        x();
    }

    private final void a(Context context) {
        Integer U3;
        int i4 = ew1.f25476l;
        du1 a4 = ew1.a.a().a(context);
        a(this.f34450B.a(context, (a4 == null || (U3 = a4.U()) == null) ? gh0.a() : U3.intValue()));
    }
}
