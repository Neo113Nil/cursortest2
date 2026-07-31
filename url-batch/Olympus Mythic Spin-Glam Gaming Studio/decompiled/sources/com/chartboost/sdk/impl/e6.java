package com.chartboost.sdk.impl;

import android.content.Context;
import com.chartboost.sdk.Mediation;
import com.chartboost.sdk.events.ChartboostError;
import com.ironsource.X3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class e6 implements yf {
    public final tl a;
    public final he b;
    public final y2 c;

    public e6(tl webViewFactory, he openMeasurementManager, y2 cbIdentity) {
        Intrinsics.checkNotNullParameter(webViewFactory, "webViewFactory");
        Intrinsics.checkNotNullParameter(openMeasurementManager, "openMeasurementManager");
        Intrinsics.checkNotNullParameter(cbIdentity, "cbIdentity");
        this.a = webViewFactory;
        this.b = openMeasurementManager;
        this.c = cbIdentity;
    }

    @Override // com.chartboost.sdk.impl.yf
    public m2 a(Context context, wf renderableConfig, a0 adMarkupConfig, u adFormat, di trackerComponent, rh telemetryManager, dl viewabilityComponent, Mediation mediation, v vVar, boolean z) {
        ChartboostError chartboostError;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(renderableConfig, "renderableConfig");
        Intrinsics.checkNotNullParameter(adMarkupConfig, "adMarkupConfig");
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        Intrinsics.checkNotNullParameter(trackerComponent, "trackerComponent");
        Intrinsics.checkNotNullParameter(telemetryManager, "telemetryManager");
        Intrinsics.checkNotNullParameter(viewabilityComponent, "viewabilityComponent");
        try {
            String l = renderableConfig.l();
            dc dcVar = dc.c;
            if (Intrinsics.areEqual(l, dcVar.b())) {
                return new pj(context, renderableConfig.b(), renderableConfig, adMarkupConfig, trackerComponent, telemetryManager, viewabilityComponent, f4.b.a().f(), adFormat, this.a, mediation, this.b, this.c, z);
            }
            dc dcVar2 = dc.d;
            if (Intrinsics.areEqual(l, dcVar2.b())) {
                return new rl(context, renderableConfig.b(), null, adFormat.b() ? yc.c : yc.d, null, this.a, renderableConfig, adMarkupConfig, trackerComponent, telemetryManager, adFormat, viewabilityComponent, mediation, vVar, this.b, this.c, null, 65552, null);
            }
            ChartboostError.Load.InvalidAdm invalidAdm = new ChartboostError.Load.InvalidAdm("Unsupported markup type: " + renderableConfig.l() + ". Supported types: " + dcVar.b() + ", " + dcVar2.b(), null);
            xb.b(X3.j.d + invalidAdm.getCode() + "] Skipping unknown renderable config with type " + renderableConfig.l(), invalidAdm);
            return null;
        } catch (Exception e) {
            if (e instanceof ChartboostError.Load) {
                chartboostError = (ChartboostError.Load) e;
            } else if (e instanceof IllegalArgumentException) {
                chartboostError = new ChartboostError.Load.InvalidAdm("Invalid renderable configuration: " + e.getMessage(), e);
            } else {
                chartboostError = new ChartboostError.Load.Internal("Failed to create renderable: " + e.getMessage(), e);
            }
            xb.b(X3.j.d + chartboostError.getCode() + "] Failed to create renderable for markup type: " + renderableConfig.l(), chartboostError);
            throw chartboostError;
        }
    }

    public /* synthetic */ e6(tl tlVar, he heVar, y2 y2Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new nd() : tlVar, heVar, y2Var);
    }
}
