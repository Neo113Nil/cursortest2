package com.ironsource.mediationsdk.demandOnly;

import android.text.TextUtils;
import com.ironsource.mb;
import com.ironsource.mediationsdk.AbstractAdapter;
import com.ironsource.mediationsdk.demandOnly.e;
import com.ironsource.mediationsdk.demandOnly.h;
import com.ironsource.mediationsdk.demandOnly.i;
import com.ironsource.mediationsdk.demandOnly.o;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceAES;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.ng;
import com.ironsource.nj;
import com.ironsource.o9;
import com.ironsource.ra;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public class f implements i.b {

    /* renamed from: a, reason: collision with root package name */
    private final ra f17445a;

    /* renamed from: b, reason: collision with root package name */
    private final ConcurrentHashMap<String, g> f17446b;

    /* renamed from: c, reason: collision with root package name */
    private final ng<ISDemandOnlyInterstitialListener> f17447c;

    public f(List<NetworkSettings> list, nj njVar, com.ironsource.mediationsdk.c cVar, ng<ISDemandOnlyInterstitialListener> ngVar, String str, String str2, ra raVar) {
        String sessionId = IronSourceUtils.getSessionId();
        boolean j4 = njVar.j();
        com.ironsource.mediationsdk.f fVar = new com.ironsource.mediationsdk.f(njVar.g(), sessionId);
        this.f17446b = new ConcurrentHashMap<>();
        this.f17445a = raVar;
        this.f17447c = ngVar;
        for (NetworkSettings networkSettings : list) {
            if (networkSettings.isIronSource()) {
                AbstractAdapter a4 = cVar.a(networkSettings, networkSettings.getInterstitialSettings(), true);
                if (a4 != null) {
                    g gVar = new g(str, str2, networkSettings, this.f17447c.a(networkSettings.getSubProviderId()), njVar.e(), a4, new com.ironsource.mediationsdk.e(fVar));
                    gVar.a(j4);
                    this.f17446b.put(networkSettings.getSubProviderId(), gVar);
                }
            } else {
                IronLog.INTERNAL.error("cannot load " + networkSettings.getProviderTypeForReflection());
            }
        }
    }

    public ConcurrentHashMap<String, g> a() {
        return this.f17446b;
    }

    @Override // com.ironsource.mediationsdk.demandOnly.i.b
    public boolean b(String str) {
        g gVar = this.f17446b.get(str);
        if (gVar != null) {
            return gVar.a();
        }
        this.f17445a.a(e.b.f17432p, str);
        return false;
    }

    @Override // com.ironsource.mediationsdk.demandOnly.i.b
    public void a(@NotNull h.d dVar) {
        String c4 = dVar.c();
        String b4 = dVar.b();
        try {
            g gVar = this.f17446b.get(c4);
            if (gVar == null) {
                this.f17445a.a(2503, c4);
                IronSourceError buildNonExistentInstanceError = ErrorBuilder.buildNonExistentInstanceError("Interstitial");
                IronLog.API.error(buildNonExistentInstanceError.getErrorMessage());
                this.f17447c.a(c4).onInterstitialAdLoadFailed(c4, buildNonExistentInstanceError);
                return;
            }
            if (TextUtils.isEmpty(b4)) {
                gVar.c();
            } else {
                gVar.a(new o.a(IronSourceAES.decode(mb.b().c(), b4)));
            }
        } catch (Exception e4) {
            o9.d().a(e4);
            IronSourceError buildLoadFailedError = ErrorBuilder.buildLoadFailedError("loadInterstitial exception " + e4.getMessage());
            IronLog.API.error(buildLoadFailedError.getErrorMessage());
            this.f17447c.a(c4).onInterstitialAdLoadFailed(c4, buildLoadFailedError);
        }
    }

    @Override // com.ironsource.mediationsdk.demandOnly.i.b
    public void a(String str) {
        try {
            g gVar = this.f17446b.get(str);
            if (gVar != null) {
                gVar.b();
                return;
            }
            this.f17445a.a(2507, str);
            IronSourceError buildNonExistentInstanceError = ErrorBuilder.buildNonExistentInstanceError("Interstitial");
            IronLog.API.error(buildNonExistentInstanceError.getErrorMessage());
            this.f17447c.a(str).onInterstitialAdShowFailed(str, buildNonExistentInstanceError);
        } catch (Exception e4) {
            o9.d().a(e4);
            IronSourceError buildShowFailedError = ErrorBuilder.buildShowFailedError("Interstitial", "showInterstitial exception " + e4.getMessage());
            IronLog.API.error(buildShowFailedError.getErrorMessage());
            this.f17447c.a(str).onInterstitialAdShowFailed(str, buildShowFailedError);
        }
    }
}
