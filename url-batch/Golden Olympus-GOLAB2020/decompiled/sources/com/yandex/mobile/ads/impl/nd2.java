package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class nd2 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f29541a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ik2 f29542b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final md2 f29543c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final ArrayList f29544d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ nd2(Context context, C2286v2 c2286v2, cd2 cd2Var, x92 x92Var) {
        this(context, c2286v2, cd2Var, x92Var, r5, new ik2(r5, c2286v2, x92Var, cd2Var), new md2());
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
    }

    public final void a(@NotNull List<bb2> videoAds, @NotNull xp1<List<bb2>> listener) {
        Intrinsics.checkNotNullParameter(videoAds, "videoAds");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f29543c.getClass();
        ld2 a4 = md2.a(videoAds);
        this.f29544d.addAll(a4.a());
        this.f29542b.a(this.f29541a, a4.b(), new a(this, listener));
    }

    public nd2(@NotNull Context context, @NotNull C2286v2 adConfiguration, @NotNull cd2 reportParametersProvider, @NotNull x92 requestConfigurationParametersProvider, @NotNull Context applicationContext, @NotNull ik2 wrapperAdsLoadManager, @NotNull md2 videoAdsResponseFactory) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(reportParametersProvider, "reportParametersProvider");
        Intrinsics.checkNotNullParameter(requestConfigurationParametersProvider, "requestConfigurationParametersProvider");
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(wrapperAdsLoadManager, "wrapperAdsLoadManager");
        Intrinsics.checkNotNullParameter(videoAdsResponseFactory, "videoAdsResponseFactory");
        this.f29541a = applicationContext;
        this.f29542b = wrapperAdsLoadManager;
        this.f29543c = videoAdsResponseFactory;
        this.f29544d = new ArrayList();
    }

    private final class a implements xp1<List<? extends bb2>> {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final xp1<List<bb2>> f29545a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ nd2 f29546b;

        public a(nd2 nd2Var, @NotNull xp1<List<bb2>> requestListener) {
            Intrinsics.checkNotNullParameter(requestListener, "requestListener");
            this.f29546b = nd2Var;
            this.f29545a = requestListener;
        }

        private final void a() {
            if (!this.f29546b.f29544d.isEmpty()) {
                this.f29545a.a((xp1<List<bb2>>) this.f29546b.f29544d);
                return;
            }
            v40 error = new v40();
            xp1<List<bb2>> xp1Var = this.f29545a;
            Intrinsics.checkNotNullParameter(error, "error");
            String message = error.getMessage();
            if (message == null) {
                message = "Ad request completed successfully, but there are no ads available.";
            }
            xp1Var.a(new hb2(3, message));
        }

        @Override // com.yandex.mobile.ads.impl.xp1
        public final void a(@NotNull hb2 error) {
            Intrinsics.checkNotNullParameter(error, "error");
            a();
        }

        @Override // com.yandex.mobile.ads.impl.xp1
        public final void a(List<? extends bb2> list) {
            List<? extends bb2> result = list;
            Intrinsics.checkNotNullParameter(result, "result");
            this.f29546b.f29543c.getClass();
            ld2 a4 = md2.a(result);
            this.f29546b.f29544d.addAll(a4.a());
            List<bb2> b4 = a4.b();
            if (!b4.isEmpty()) {
                this.f29546b.f29542b.a(this.f29546b.f29541a, b4, this);
            } else {
                a();
            }
        }
    }
}
