package com.yandex.mobile.ads.feed;

import android.content.Context;
import com.yandex.mobile.ads.impl.C1918f7;
import com.yandex.mobile.ads.impl.C2286v2;
import com.yandex.mobile.ads.impl.a90;
import com.yandex.mobile.ads.impl.b90;
import com.yandex.mobile.ads.impl.da0;
import com.yandex.mobile.ads.impl.eu;
import com.yandex.mobile.ads.impl.gs;
import com.yandex.mobile.ads.impl.j90;
import com.yandex.mobile.ads.impl.k10;
import com.yandex.mobile.ads.impl.m90;
import com.yandex.mobile.ads.impl.n90;
import com.yandex.mobile.ads.impl.o90;
import com.yandex.mobile.ads.impl.r90;
import com.yandex.mobile.ads.impl.t80;
import com.yandex.mobile.ads.impl.t90;
import com.yandex.mobile.ads.impl.u80;
import com.yandex.mobile.ads.impl.um2;
import com.yandex.mobile.ads.impl.v80;
import com.yandex.mobile.ads.impl.vz0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o2.K;
import o2.R0;
import o2.Z;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r2.t;
import r2.z;

@Metadata
/* loaded from: classes2.dex */
public final class FeedAd extends a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final da0 f22457a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private FeedAdLoadListener f22458b;

    @Metadata
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final Context f22459a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final FeedAdRequestConfiguration f22460b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final FeedAdAppearance f22461c;

        /* renamed from: d, reason: collision with root package name */
        @NotNull
        private final u80 f22462d;

        public Builder(@NotNull Context context, @NotNull FeedAdRequestConfiguration requestConfiguration, @NotNull FeedAdAppearance appearance) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(requestConfiguration, "requestConfiguration");
            Intrinsics.checkNotNullParameter(appearance, "appearance");
            this.f22459a = context;
            this.f22460b = requestConfiguration;
            this.f22461c = appearance;
            this.f22462d = new u80();
        }

        @NotNull
        public final FeedAd build() {
            C1918f7 a4 = this.f22462d.a(this.f22460b, this.f22461c);
            um2 um2Var = new um2(this.f22459a);
            Context applicationContext = this.f22459a.getApplicationContext();
            Intrinsics.checkNotNull(applicationContext);
            a90 a90Var = new a90(applicationContext, um2Var.c());
            b90 b90Var = new b90(a90Var, um2Var.c(), new k10());
            C2286v2 c2286v2 = new C2286v2(gs.f26286j, um2Var);
            t b4 = z.b(1, 0, null, 6, null);
            m90 m90Var = new m90(applicationContext, um2Var, c2286v2);
            n90 n90Var = new n90(m90Var, new v80());
            r90 r90Var = new r90(b90Var);
            vz0 vz0Var = new vz0();
            o90 o90Var = new o90(vz0Var);
            t90 t90Var = new t90(a4, n90Var, r90Var, o90Var);
            return new FeedAd(new da0(applicationContext, um2Var, a4, a90Var, b90Var, c2286v2, b4, m90Var, n90Var, r90Var, vz0Var, o90Var, t90Var, new j90(b4, t90Var, um2Var), K.a(R0.b(null, 1, null).plus(Z.c().p()).plus(new eu(um2Var.c())))), null);
        }
    }

    private FeedAd(da0 da0Var) {
        this.f22457a = da0Var;
    }

    @Override // com.yandex.mobile.ads.feed.a
    @NotNull
    protected final da0 b() {
        return this.f22457a;
    }

    @Nullable
    public final FeedAdLoadListener getLoadListener() {
        return this.f22458b;
    }

    public final void preloadAd() {
        this.f22457a.f();
    }

    public final void setLoadListener(@Nullable FeedAdLoadListener feedAdLoadListener) {
        this.f22457a.a(new t80(feedAdLoadListener));
        this.f22458b = feedAdLoadListener;
    }

    public /* synthetic */ FeedAd(da0 da0Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(da0Var);
    }
}
