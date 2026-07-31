package com.ironsource;

import android.text.TextUtils;
import com.ironsource.AbstractC1532p1;
import com.ironsource.C1454e2;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.AdapterUtils;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.Placement;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class l6 extends AbstractC1532p1 {

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final WeakReference<o6> f16989k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final a f16990l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private final m6 f16991m;

    @Metadata
    private final class a extends AbstractC1532p1.a implements z5 {
        public a() {
            super();
        }

        @Override // com.ironsource.z5
        public void a(@NotNull x5 instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            IronLog.INTERNAL.verbose(l6.this.a(instance.p()));
            o6 o6Var = (o6) l6.this.f16989k.get();
            if (o6Var != null) {
                o6Var.d();
            }
        }

        @Override // com.ironsource.AbstractC1532p1.a, com.ironsource.InterfaceC1452e0
        public void b(@NotNull AbstractC1424a0 instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            super.b(instance);
            InterfaceC1596y1 i4 = l6.this.i();
            if (i4 != null) {
                i4.b();
            }
        }

        @Override // com.ironsource.z5
        public void c(@NotNull x5 instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            IronLog.INTERNAL.verbose(l6.this.a(instance.p()));
            o6 o6Var = (o6) l6.this.f16989k.get();
            if (o6Var != null) {
                o6Var.e();
            }
        }

        @Override // com.ironsource.z5
        public void b(@NotNull x5 instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            IronLog.INTERNAL.verbose(l6.this.a(instance.p()));
            o6 o6Var = (o6) l6.this.f16989k.get();
            if (o6Var != null) {
                o6Var.g();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l6(@NotNull C1525o1 tools, @NotNull m6 adUnitData, @NotNull o6 listener) {
        super(tools, adUnitData, listener, null, 8, null);
        String format;
        int b4;
        Intrinsics.checkNotNullParameter(tools, "tools");
        Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f16989k = new WeakReference<>(listener);
        this.f16990l = new a();
        this.f16991m = adUnitData;
        Placement g4 = g();
        IronLog.INTERNAL.verbose("placement = " + g4);
        if (g4 == null || TextUtils.isEmpty(g4.getPlacementName())) {
            kotlin.jvm.internal.L l4 = kotlin.jvm.internal.L.f41137a;
            format = String.format("can't load banner - %s", Arrays.copyOf(new Object[]{g4 == null ? "placement is null" : "placement name is empty"}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
            b4 = C1426a2.b(adUnitData.b().a());
        } else {
            format = null;
            b4 = 510;
        }
        if (format != null) {
            IronLog.API.error(a(format));
            a(b4, format);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractC1424a0 a(l6 this$0, C1431b0 instanceData, C1473h0 adInstancePayload) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(instanceData, "instanceData");
        Intrinsics.checkNotNullParameter(adInstancePayload, "adInstancePayload");
        return new x5(new C1585w2(this$0.f(), C1454e2.b.PROVIDER), instanceData, adInstancePayload, this$0.f16990l);
    }

    @Override // com.ironsource.AbstractC1532p1
    @NotNull
    public C1545r1 b() {
        return new s6(this.f16991m.b(), a(m()));
    }

    private final ISBannerSize m() {
        return f().a(this.f16991m.b().g());
    }

    @Override // com.ironsource.AbstractC1532p1
    @NotNull
    protected InterfaceC1445d0 a() {
        return new InterfaceC1445d0() { // from class: com.ironsource.X1
            @Override // com.ironsource.InterfaceC1445d0
            public final AbstractC1424a0 a(C1431b0 c1431b0, C1473h0 c1473h0) {
                AbstractC1424a0 a4;
                a4 = l6.a(l6.this, c1431b0, c1473h0);
                return a4;
            }
        };
    }

    private final ISBannerSize a(ISBannerSize iSBannerSize) {
        return iSBannerSize.isSmart() ? AdapterUtils.isLargeScreen(ContextProvider.getInstance().getApplicationContext()) ? com.ironsource.mediationsdk.l.a() : ISBannerSize.BANNER : iSBannerSize;
    }

    public final void a(@Nullable sv svVar, @NotNull InterfaceC1596y1 displayListener) {
        Intrinsics.checkNotNullParameter(displayListener, "displayListener");
        if (svVar != null) {
            a(new b6(svVar), displayListener);
        }
    }
}
