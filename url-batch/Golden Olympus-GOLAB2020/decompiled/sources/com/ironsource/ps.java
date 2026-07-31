package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata
/* loaded from: classes2.dex */
public final class ps {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private zc f18728a;

    @Metadata
    private final class a extends os {
        public a() {
        }

        @Override // com.ironsource.os, java.lang.Runnable
        public void run() {
            JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false);
            try {
                mediationAdditionalData.put(IronSourceConstants.EVENTS_DURATION, a());
            } catch (JSONException e4) {
                o9.d().a(e4);
                IronLog.INTERNAL.error(e4.toString());
            }
            jp.f16866P.a(new zb(44, mediationAdditionalData));
        }
    }

    public final void a(@NotNull cf applicationLifecycleService) {
        Intrinsics.checkNotNullParameter(applicationLifecycleService, "applicationLifecycleService");
        this.f18728a = new zc(applicationLifecycleService, new a());
    }
}
