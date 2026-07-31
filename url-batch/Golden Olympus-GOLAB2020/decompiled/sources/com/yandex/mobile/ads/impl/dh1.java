package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.AbstractC2372yj;
import com.yandex.mobile.ads.impl.aq1;
import com.yandex.mobile.ads.impl.ew1;
import com.yandex.mobile.ads.impl.ip1;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class dh1 implements j82 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final o62 f24626a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final j62 f24627b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final aq1 f24628c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final h82 f24629d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final Context f24630e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ dh1(Context context, C2286v2 c2286v2, o62 o62Var) {
        this(context, c2286v2, o62Var, r4, aq1.a.a(), new h82(context));
        j62 j62Var = new j62(context, c2286v2);
        int i4 = aq1.f23419c;
    }

    @Override // com.yandex.mobile.ads.impl.j82
    public final void a(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        String a4 = this.f24629d.a(url);
        int i4 = ew1.f25476l;
        ch1 request = new ch1(this.f24630e, a4, new a(url, ew1.a.a().a(this.f24630e), this.f24627b, this.f24626a));
        aq1 aq1Var = this.f24628c;
        Context context = this.f24630e;
        synchronized (aq1Var) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(request, "request");
            vc1.a(context).a(request);
        }
    }

    public dh1(@NotNull Context context, @NotNull C2286v2 adConfiguration, @NotNull o62 trackingUrlType, @NotNull j62 trackingReporter, @NotNull aq1 requestManager, @NotNull h82 urlModifier) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(trackingUrlType, "trackingUrlType");
        Intrinsics.checkNotNullParameter(trackingReporter, "trackingReporter");
        Intrinsics.checkNotNullParameter(requestManager, "requestManager");
        Intrinsics.checkNotNullParameter(urlModifier, "urlModifier");
        this.f24626a = trackingUrlType;
        this.f24627b = trackingReporter;
        this.f24628c = requestManager;
        this.f24629d = urlModifier;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        this.f24630e = applicationContext;
    }

    private static final class a implements AbstractC2372yj.a<lc1> {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f24631a;

        /* renamed from: b, reason: collision with root package name */
        @Nullable
        private final du1 f24632b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final j62 f24633c;

        /* renamed from: d, reason: collision with root package name */
        @NotNull
        private final o62 f24634d;

        public a(@NotNull String trackingUrl, @Nullable du1 du1Var, @NotNull j62 trackingReporter, @NotNull o62 trackingUrlType) {
            Intrinsics.checkNotNullParameter(trackingUrl, "trackingUrl");
            Intrinsics.checkNotNullParameter(trackingReporter, "trackingReporter");
            Intrinsics.checkNotNullParameter(trackingUrlType, "trackingUrlType");
            this.f24631a = trackingUrl;
            this.f24632b = du1Var;
            this.f24633c = trackingReporter;
            this.f24634d = trackingUrlType;
        }

        @Override // com.yandex.mobile.ads.impl.qq1.a
        public final void a(@NotNull hi2 error) {
            Intrinsics.checkNotNullParameter(error, "error");
            Object[] args = {this.f24631a, error.toString()};
            int i4 = ap0.f23396b;
            Intrinsics.checkNotNullParameter(args, "args");
            Pair pair = TuplesKt.to("tracking_result", "failure");
            String lowerCase = this.f24634d.name().toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            Pair pair2 = TuplesKt.to("tracking_url_type", lowerCase);
            String message = error.getMessage();
            if (message == null) {
                message = "Unknown Volley error";
            }
            Map mutableMapOf = MapsKt.mutableMapOf(pair, pair2, TuplesKt.to("error_message", message));
            j62 j62Var = this.f24633c;
            ip1.b bVar = ip1.b.f27341c;
            j62Var.a(mutableMapOf, this.f24632b);
        }

        @Override // com.yandex.mobile.ads.impl.qq1.b
        public final void a(Object obj) {
            lc1 response = (lc1) obj;
            Intrinsics.checkNotNullParameter(response, "response");
            int i4 = response.f28505a;
            Object[] args = {this.f24631a, Integer.valueOf(i4)};
            int i5 = ap0.f23396b;
            Intrinsics.checkNotNullParameter(args, "args");
            Pair pair = TuplesKt.to("tracking_result", "success");
            String lowerCase = this.f24634d.name().toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            Map mutableMapOf = MapsKt.mutableMapOf(pair, TuplesKt.to("tracking_url_type", lowerCase), TuplesKt.to("code", Integer.valueOf(i4)));
            j62 j62Var = this.f24633c;
            ip1.b bVar = ip1.b.f27341c;
            j62Var.a(mutableMapOf, this.f24632b);
        }
    }
}
