package com.ironsource.mediationsdk.demandOnly;

import com.ironsource.mb;
import com.ironsource.mediationsdk.AbstractAdapter;
import com.ironsource.mediationsdk.demandOnly.h;
import com.ironsource.mediationsdk.demandOnly.i;
import com.ironsource.mediationsdk.demandOnly.o;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceAES;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.ng;
import com.ironsource.o9;
import com.ironsource.ra;
import com.ironsource.zq;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public class k implements i.c {

    /* renamed from: a, reason: collision with root package name */
    private final ra f17510a;

    /* renamed from: b, reason: collision with root package name */
    private final ConcurrentHashMap<String, l> f17511b;

    /* renamed from: c, reason: collision with root package name */
    private final ng<ISDemandOnlyRewardedVideoListener> f17512c;

    public k(List<NetworkSettings> list, zq zqVar, com.ironsource.mediationsdk.c cVar, ng<ISDemandOnlyRewardedVideoListener> ngVar, String str, String str2, ra raVar) {
        String sessionId = IronSourceUtils.getSessionId();
        boolean d4 = zqVar.d();
        com.ironsource.mediationsdk.f fVar = new com.ironsource.mediationsdk.f(zqVar.k(), sessionId);
        this.f17511b = new ConcurrentHashMap<>();
        this.f17510a = raVar;
        this.f17512c = ngVar;
        for (NetworkSettings networkSettings : list) {
            if (networkSettings.isIronSource()) {
                AbstractAdapter a4 = cVar.a(networkSettings, networkSettings.getRewardedVideoSettings(), true);
                if (a4 != null) {
                    l lVar = new l(str, str2, networkSettings, this.f17512c.a(networkSettings.getSubProviderId()), zqVar.i(), a4, new com.ironsource.mediationsdk.e(fVar));
                    lVar.a(d4);
                    this.f17511b.put(networkSettings.getSubProviderId(), lVar);
                }
            } else {
                IronLog.INTERNAL.error("cannot load " + networkSettings.getProviderTypeForReflection());
            }
        }
    }

    public ConcurrentHashMap<String, l> a() {
        return this.f17511b;
    }

    @Override // com.ironsource.mediationsdk.demandOnly.i.c
    public void b(String str) {
        try {
            l lVar = this.f17511b.get(str);
            if (lVar != null) {
                lVar.e();
                return;
            }
            this.f17510a.a(1507, str);
            IronSourceError buildNonExistentInstanceError = ErrorBuilder.buildNonExistentInstanceError(IronSourceConstants.REWARDED_VIDEO_AD_UNIT);
            IronLog.API.error(buildNonExistentInstanceError.getErrorMessage());
            this.f17512c.a(str).onRewardedVideoAdShowFailed(str, buildNonExistentInstanceError);
        } catch (Exception e4) {
            o9.d().a(e4);
            IronSourceError buildShowFailedError = ErrorBuilder.buildShowFailedError(IronSourceConstants.REWARDED_VIDEO_AD_UNIT, "showRewardedVideo exception " + e4.getMessage());
            IronLog.API.error(buildShowFailedError.getErrorMessage());
            this.f17512c.a(str).onRewardedVideoAdShowFailed(str, buildShowFailedError);
        }
    }

    @Override // com.ironsource.mediationsdk.demandOnly.i.c
    public void a(@NotNull h.d dVar) {
        String c4 = dVar.c();
        try {
            l lVar = this.f17511b.get(c4);
            if (lVar == null) {
                this.f17510a.a(1503, c4);
                IronSourceError buildNonExistentInstanceError = ErrorBuilder.buildNonExistentInstanceError(IronSourceConstants.REWARDED_VIDEO_AD_UNIT);
                IronLog.API.error(buildNonExistentInstanceError.getErrorMessage());
                this.f17512c.a(c4).onRewardedVideoAdLoadFailed(c4, buildNonExistentInstanceError);
                return;
            }
            if (dVar.d()) {
                lVar.b(new o.a(IronSourceAES.decode(mb.b().c(), dVar.b())));
            } else {
                lVar.d();
            }
        } catch (Exception e4) {
            o9.d().a(e4);
            IronSourceError buildLoadFailedError = ErrorBuilder.buildLoadFailedError("loadRewardedVideo exception " + e4.getMessage());
            IronLog.API.error(buildLoadFailedError.getErrorMessage());
            this.f17512c.a(c4).onRewardedVideoAdLoadFailed(c4, buildLoadFailedError);
        }
    }

    @Override // com.ironsource.mediationsdk.demandOnly.i.c
    public boolean a(String str) {
        l lVar = this.f17511b.get(str);
        if (lVar != null) {
            return lVar.a();
        }
        this.f17510a.a(1500, str);
        return false;
    }
}
