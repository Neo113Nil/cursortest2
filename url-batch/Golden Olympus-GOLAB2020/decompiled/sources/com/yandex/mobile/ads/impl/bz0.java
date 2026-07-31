package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.SystemClock;
import com.monetization.ads.mediation.banner.MediatedBannerSize;
import com.monetization.ads.mediation.base.MediatedBidderTokenLoadListener;
import com.monetization.ads.mediation.base.MediatedBidderTokenLoader;
import com.yandex.mobile.ads.impl.ur0;
import java.util.HashMap;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class bz0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Executor f23976a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final kx0<com.monetization.ads.mediation.base.a> f23977b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final az0 f23978c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final zy0 f23979d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final cx0 f23980e;

    public interface a {
        void a(@Nullable JSONObject jSONObject);
    }

    public static final class b implements MediatedBidderTokenLoadListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ xy0 f23981a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ bz0 f23982b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f23983c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ bx0 f23984d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ a f23985e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C2098mk f23986f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ long f23987g;

        b(xy0 xy0Var, bz0 bz0Var, Context context, bx0 bx0Var, a aVar, C2098mk c2098mk, long j4) {
            this.f23981a = xy0Var;
            this.f23982b = bz0Var;
            this.f23983c = context;
            this.f23984d = bx0Var;
            this.f23985e = aVar;
            this.f23986f = c2098mk;
            this.f23987g = j4;
        }

        @Override // com.monetization.ads.mediation.base.MediatedBidderTokenLoadListener
        public final void onBidderTokenFailedToLoad(@NotNull String failureReason) {
            Intrinsics.checkNotNullParameter(failureReason, "failureReason");
            bz0.a(this.f23982b, this.f23983c, this.f23981a, this.f23984d, failureReason, null, this.f23985e);
        }

        @Override // com.monetization.ads.mediation.base.MediatedBidderTokenLoadListener
        public final void onBidderTokenLoaded(@NotNull String bidderToken, @Nullable MediatedBannerSize mediatedBannerSize) {
            Intrinsics.checkNotNullParameter(bidderToken, "bidderToken");
            if (bidderToken.length() == 0) {
                bz0.a(this.f23982b, this.f23983c, this.f23981a, this.f23984d, this.f23981a.e() + " provided empty token", null, this.f23985e);
                return;
            }
            if (this.f23986f.a()) {
                long elapsedRealtime = SystemClock.elapsedRealtime() - this.f23987g;
                bz0.a(this.f23982b, this.f23983c, this.f23981a, this.f23984d, this.f23981a.e() + " didn't provide bidder token after timeout", Long.valueOf(elapsedRealtime), this.f23985e);
                return;
            }
            az0 az0Var = this.f23982b.f23978c;
            xy0 xy0Var = this.f23981a;
            az0Var.getClass();
            JSONObject a4 = az0.a(xy0Var, bidderToken, mediatedBannerSize);
            if (a4 == null) {
                bz0.a(this.f23982b, this.f23983c, this.f23981a, this.f23984d, "Can't create bidding data json object for network.", null, this.f23985e);
            } else {
                bz0.a(this.f23982b, this.f23983c, this.f23981a, this.f23984d, a4, this.f23985e);
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bz0(qx0 qx0Var) {
        this(qx0Var, ur0.a.a().c(), new kx0(qx0Var), new az0(), new zy0(qx0Var), new cx0());
        int i4 = ur0.f33232f;
    }

    public static final void a(bz0 bz0Var, Context context, xy0 xy0Var, bx0 bx0Var, String str, Long l4, a aVar) {
        bz0Var.f23979d.a(context, xy0Var, bx0Var, str, l4);
        aVar.a(null);
    }

    public static final void a(bz0 bz0Var, Context context, xy0 xy0Var, bx0 bx0Var, JSONObject jSONObject, a aVar) {
        bz0Var.f23979d.a(context, xy0Var, bx0Var);
        aVar.a(jSONObject);
    }

    public bz0(@NotNull qx0 mediatedAdapterReporter, @NotNull Executor loadingExecutor, @NotNull kx0<com.monetization.ads.mediation.base.a> mediatedAdapterCreator, @NotNull az0 mediationNetworkBiddingDataJsonCreator, @NotNull zy0 bidderTokenLoadingReporter, @NotNull cx0 mediatedAdDataFactory) {
        Intrinsics.checkNotNullParameter(mediatedAdapterReporter, "mediatedAdapterReporter");
        Intrinsics.checkNotNullParameter(loadingExecutor, "loadingExecutor");
        Intrinsics.checkNotNullParameter(mediatedAdapterCreator, "mediatedAdapterCreator");
        Intrinsics.checkNotNullParameter(mediationNetworkBiddingDataJsonCreator, "mediationNetworkBiddingDataJsonCreator");
        Intrinsics.checkNotNullParameter(bidderTokenLoadingReporter, "bidderTokenLoadingReporter");
        Intrinsics.checkNotNullParameter(mediatedAdDataFactory, "mediatedAdDataFactory");
        this.f23976a = loadingExecutor;
        this.f23977b = mediatedAdapterCreator;
        this.f23978c = mediationNetworkBiddingDataJsonCreator;
        this.f23979d = bidderTokenLoadingReporter;
        this.f23980e = mediatedAdDataFactory;
    }

    public final void a(@NotNull final Context context, @Nullable vy1 vy1Var, @NotNull final xy0 mediationNetwork, @NotNull final C2098mk timeoutHolder, @NotNull final a listener) {
        bx0 bx0Var;
        Throwable th;
        final long elapsedRealtime;
        final bx0 bx0Var2;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mediationNetwork, "mediationNetwork");
        Intrinsics.checkNotNullParameter(timeoutHolder, "timeoutHolder");
        Intrinsics.checkNotNullParameter(listener, "listener");
        final com.monetization.ads.mediation.base.a mediatedAdapter = this.f23977b.a(context, mediationNetwork, com.monetization.ads.mediation.base.a.class);
        if (mediatedAdapter != null) {
            this.f23980e.getClass();
            Intrinsics.checkNotNullParameter(mediatedAdapter, "mediatedAdapter");
            bx0Var = new bx0(mediatedAdapter);
        } else {
            bx0Var = null;
        }
        if (!(mediatedAdapter instanceof MediatedBidderTokenLoader)) {
            if (mediatedAdapter == null) {
                listener.a(null);
                return;
            } else {
                this.f23979d.a(context, mediationNetwork, bx0Var, "Can't create bidder token loader.", null);
                listener.a(null);
                return;
            }
        }
        try {
            elapsedRealtime = SystemClock.elapsedRealtime();
            bx0Var2 = bx0Var;
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            final HashMap hashMap = new HashMap(mediationNetwork.i());
            if (vy1Var != null) {
                try {
                    hashMap.put("width", String.valueOf(vy1Var.getWidth()));
                    hashMap.put("height", String.valueOf(vy1Var.getHeight()));
                } catch (Throwable th3) {
                    th = th3;
                    bx0Var = bx0Var2;
                    this.f23979d.a(context, mediationNetwork, bx0Var, th.toString(), null);
                    listener.a(null);
                }
            }
            Executor executor = this.f23976a;
            Runnable runnable = new Runnable() { // from class: com.yandex.mobile.ads.impl.D0
                @Override // java.lang.Runnable
                public final void run() {
                    bz0.a(com.monetization.ads.mediation.base.a.this, context, hashMap, mediationNetwork, this, bx0Var2, listener, timeoutHolder, elapsedRealtime);
                }
            };
            bx0Var = bx0Var2;
            executor.execute(runnable);
        } catch (Throwable th4) {
            th = th4;
            bx0Var = bx0Var2;
            th = th;
            this.f23979d.a(context, mediationNetwork, bx0Var, th.toString(), null);
            listener.a(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(com.monetization.ads.mediation.base.a aVar, Context context, HashMap extras, xy0 mediationNetwork, bz0 this$0, bx0 bx0Var, a listener, C2098mk timeoutHolder, long j4) {
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(extras, "$extras");
        Intrinsics.checkNotNullParameter(mediationNetwork, "$mediationNetwork");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(listener, "$listener");
        Intrinsics.checkNotNullParameter(timeoutHolder, "$timeoutHolder");
        ((MediatedBidderTokenLoader) aVar).loadBidderToken(context, extras, new b(mediationNetwork, this$0, context, bx0Var, listener, timeoutHolder, j4));
    }
}
