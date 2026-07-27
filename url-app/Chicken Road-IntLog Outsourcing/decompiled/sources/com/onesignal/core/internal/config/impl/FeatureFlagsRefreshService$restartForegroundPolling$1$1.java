package com.onesignal.core.internal.config.impl;

import D4.AbstractC0024y;
import D4.C0021v;
import D4.X;
import com.onesignal.core.internal.application.IApplicationService;
import com.onesignal.core.internal.config.ConfigModelStore;
import com.onesignal.debug.internal.logging.Logging;
import e5.g;
import f4.v;
import java.util.concurrent.CancellationException;
import k4.InterfaceC1218d;
import l4.EnumC1260a;
import m4.e;
import m4.h;
import t4.InterfaceC1441l;

@e(c = "com.onesignal.core.internal.config.impl.FeatureFlagsRefreshService$restartForegroundPolling$1$1", f = "FeatureFlagsRefreshService.kt", l = {140, 147}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class FeatureFlagsRefreshService$restartForegroundPolling$1$1 extends h implements InterfaceC1441l {
    int label;
    final /* synthetic */ FeatureFlagsRefreshService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeatureFlagsRefreshService$restartForegroundPolling$1$1(FeatureFlagsRefreshService featureFlagsRefreshService, InterfaceC1218d interfaceC1218d) {
        super(1, interfaceC1218d);
        this.this$0 = featureFlagsRefreshService;
    }

    @Override // m4.AbstractC1293a
    public final InterfaceC1218d create(InterfaceC1218d interfaceC1218d) {
        return new FeatureFlagsRefreshService$restartForegroundPolling$1$1(this.this$0, interfaceC1218d);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007e A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x007c -> B:12:0x0020). Please report as a decompilation issue!!! */
    @Override // m4.AbstractC1293a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        X x5;
        IApplicationService iApplicationService;
        ConfigModelStore configModelStore;
        Object fetchAndApply;
        EnumC1260a enumC1260a = EnumC1260a.f11058a;
        int i2 = this.label;
        if (i2 != 0) {
            if (i2 == 1) {
                try {
                    g.y(obj);
                } catch (CancellationException e3) {
                    throw e3;
                } catch (Exception e6) {
                    Logging.warn("FeatureFlagsRefreshService: fetch failed", e6);
                }
                long refreshIntervalMs$com_onesignal_core = this.this$0.getRefreshIntervalMs$com_onesignal_core();
                this.label = 2;
                if (AbstractC0024y.d(refreshIntervalMs$com_onesignal_core, this) == enumC1260a) {
                    return enumC1260a;
                }
                x5 = (X) getContext().o(C0021v.f545b);
                if (x5 != null ? x5.a() : true) {
                    iApplicationService = this.this$0.applicationService;
                    if (iApplicationService.isInForeground()) {
                        configModelStore = this.this$0.configModelStore;
                        String appId = configModelStore.getModel().getAppId();
                        if (appId.length() > 0) {
                            FeatureFlagsRefreshService featureFlagsRefreshService = this.this$0;
                            this.label = 1;
                            fetchAndApply = featureFlagsRefreshService.fetchAndApply(appId, this);
                            if (fetchAndApply == enumC1260a) {
                                return enumC1260a;
                            }
                        }
                        long refreshIntervalMs$com_onesignal_core2 = this.this$0.getRefreshIntervalMs$com_onesignal_core();
                        this.label = 2;
                        if (AbstractC0024y.d(refreshIntervalMs$com_onesignal_core2, this) == enumC1260a) {
                        }
                        x5 = (X) getContext().o(C0021v.f545b);
                        if (x5 != null ? x5.a() : true) {
                        }
                    }
                }
                return v.f5689a;
            }
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
        g.y(obj);
        x5 = (X) getContext().o(C0021v.f545b);
        if (x5 != null ? x5.a() : true) {
        }
        return v.f5689a;
    }

    @Override // t4.InterfaceC1441l
    public final Object invoke(InterfaceC1218d interfaceC1218d) {
        return ((FeatureFlagsRefreshService$restartForegroundPolling$1$1) create(interfaceC1218d)).invokeSuspend(v.f5689a);
    }
}
