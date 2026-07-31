package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.ironsource.m4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1512m4 implements cf {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final vf f17165a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private InterfaceC1521n4 f17166b;

    @Metadata
    /* renamed from: com.ironsource.m4$a */
    public static final class a {
        @NotNull
        public final InterfaceC1521n4 a(@Nullable C1498k4 c1498k4, @NotNull vf featureAvailabilityService) {
            Intrinsics.checkNotNullParameter(featureAvailabilityService, "featureAvailabilityService");
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.verbose("isAndroidxApplicationLifecycleAvailable: " + featureAvailabilityService.a());
            StringBuilder sb = new StringBuilder();
            sb.append("isAndroidxApplicationLifecycleEnabled: ");
            sb.append(c1498k4 != null ? Boolean.valueOf(c1498k4.k()) : null);
            ironLog.verbose(sb.toString());
            boolean z4 = false;
            if (featureAvailabilityService.a()) {
                br.i().a(new zb(IronSourceConstants.TROUBLESHOOTING_ANDROIDX_PROCESS_LIFECYCLE_OWNER_AVAILABLE, IronSourceUtils.getMediationAdditionalData(false)));
            }
            if ((c1498k4 != null ? c1498k4.k() : false) && featureAvailabilityService.a()) {
                z4 = true;
            }
            ironLog.verbose("isAndroidxEnabled: " + z4);
            return z4 ? new C1580v3() : new kg();
        }
    }

    public C1512m4(@NotNull vf featureAvailabilityService) {
        Intrinsics.checkNotNullParameter(featureAvailabilityService, "featureAvailabilityService");
        this.f17165a = featureAvailabilityService;
    }

    @Override // com.ironsource.cf
    public void a(@Nullable C1498k4 c1498k4) {
        if (this.f17166b == null) {
            this.f17166b = new a().a(c1498k4, this.f17165a);
        }
    }

    @Override // com.ironsource.InterfaceC1521n4
    public void b(@NotNull ok observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        InterfaceC1521n4 interfaceC1521n4 = this.f17166b;
        if (interfaceC1521n4 != null) {
            interfaceC1521n4.b(observer);
        }
    }

    @Override // com.ironsource.InterfaceC1521n4
    public void a(@NotNull ok observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        InterfaceC1521n4 interfaceC1521n4 = this.f17166b;
        if (interfaceC1521n4 != null) {
            interfaceC1521n4.a(observer);
        }
    }
}
