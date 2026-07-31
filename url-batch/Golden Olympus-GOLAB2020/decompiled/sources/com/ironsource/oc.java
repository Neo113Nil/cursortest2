package com.ironsource;

import android.content.Context;
import com.ironsource.b9;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.server.HttpFunctions;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata
/* loaded from: classes2.dex */
public final class oc implements no {

    /* renamed from: a, reason: collision with root package name */
    private boolean f18514a = true;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private String f18515b = pc.f18627j;

    @Metadata
    public static final class a implements ye {
        a() {
        }

        @Override // com.ironsource.ye
        public void a(boolean z4) {
            if (z4) {
                return;
            }
            IronLog.API.error("failed to send impression data");
        }
    }

    private final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("deviceOS", "android");
        Context applicationContext = ContextProvider.getInstance().getApplicationContext();
        if (applicationContext != null) {
            jSONObject.put("deviceType", IronSourceUtils.getDeviceType(applicationContext));
            xj ironSourceAdvId = IronSourceUtils.getIronSourceAdvId(applicationContext);
            if (ironSourceAdvId != null) {
                jSONObject.put("advId", ironSourceAdvId.c());
                jSONObject.put("advIdType", ironSourceAdvId.d());
            }
        }
        String n4 = com.ironsource.mediationsdk.p.m().n();
        if (n4 != null) {
            jSONObject.put(b9.i.f15556g, n4);
        }
        return jSONObject;
    }

    @Override // com.ironsource.no
    public void a() {
    }

    @Override // com.ironsource.no
    public void d(@Nullable String str) {
    }

    public final void a(@NotNull String dataSource, @NotNull JSONObject impressionData) {
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        Intrinsics.checkNotNullParameter(impressionData, "impressionData");
        if (!this.f18514a) {
            IronLog.INTERNAL.verbose("disabled from server");
            return;
        }
        try {
            JSONObject b4 = b();
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("externalMediationSource", dataSource);
            jSONObject.putOpt("externalMediationData", impressionData);
            jSONObject.putOpt("clientParams", b4);
            IronLog.API.info("impressionData: " + jSONObject);
            HttpFunctions.sendPostRequest(this.f18515b, jSONObject.toString(), new a());
        } catch (Exception e4) {
            o9.d().a(e4);
            IronLog.API.error("exception " + e4.getMessage() + " sending impression data");
        }
    }

    @Override // com.ironsource.no
    public void a(@Nullable List<IronSource.AD_UNIT> list, boolean z4, @Nullable s8 s8Var) {
        if (s8Var != null) {
            C1428a4 b4 = s8Var.b();
            C1498k4 e4 = b4 != null ? b4.e() : null;
            Intrinsics.checkNotNull(e4);
            this.f18514a = e4.l();
            this.f18515b = s8Var.b().e().d();
        }
    }
}
