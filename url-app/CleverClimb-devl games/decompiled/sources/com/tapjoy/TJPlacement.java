package com.tapjoy;

import android.content.Context;
import android.content.Intent;
import com.tapjoy.TapjoyErrorMessage;
import com.tapjoy.internal.fo;
import com.tapjoy.internal.fr;
import com.tapjoy.internal.fx;
import com.tapjoy.internal.gf;
import com.tapjoy.internal.gg;
import com.tapjoy.internal.gt;
import com.tapjoy.internal.gw;
import com.tapjoy.internal.ha;
import com.tapjoy.internal.hf;
import com.tapjoy.internal.jr;
import java.util.HashMap;
import java.util.UUID;

/* loaded from: classes2.dex */
public class TJPlacement {

    /* renamed from: a, reason: collision with root package name */
    TJPlacementListener f7712a;

    /* renamed from: b, reason: collision with root package name */
    private TJCorePlacement f7713b;

    /* renamed from: c, reason: collision with root package name */
    private TJPlacementListener f7714c;

    /* renamed from: d, reason: collision with root package name */
    private TJPlacementVideoListener f7715d;
    private String e;
    public String pushId;

    @Deprecated
    public TJPlacement(Context context, String str, TJPlacementListener tJPlacementListener) {
        TJCorePlacement a2 = TJPlacementManager.a(str);
        a2 = a2 == null ? TJPlacementManager.a(str, "", "", false, false) : a2;
        a2.setContext(context);
        a(a2, tJPlacementListener);
    }

    TJPlacement(TJCorePlacement tJCorePlacement, TJPlacementListener tJPlacementListener) {
        a(tJCorePlacement, tJPlacementListener);
    }

    private void a(TJCorePlacement tJCorePlacement, TJPlacementListener tJPlacementListener) {
        this.f7713b = tJCorePlacement;
        this.e = UUID.randomUUID().toString();
        this.f7714c = tJPlacementListener;
        this.f7712a = tJPlacementListener != null ? (TJPlacementListener) fo.a(tJPlacementListener, TJPlacementListener.class) : null;
        FiveRocksIntegration.addPlacementCallback(getName(), this);
    }

    public TJPlacementListener getListener() {
        return this.f7714c;
    }

    public void setVideoListener(TJPlacementVideoListener tJPlacementVideoListener) {
        this.f7715d = tJPlacementVideoListener;
    }

    public TJPlacementVideoListener getVideoListener() {
        return this.f7715d;
    }

    public String getName() {
        return this.f7713b.getPlacementData() != null ? this.f7713b.getPlacementData().getPlacementName() : "";
    }

    public boolean isLimited() {
        return this.f7713b.isLimited();
    }

    public boolean isContentReady() {
        boolean isContentReady = this.f7713b.isContentReady();
        fx fxVar = this.f7713b.f;
        if (isContentReady) {
            fxVar.a(4);
        } else {
            fxVar.a(2);
        }
        return isContentReady;
    }

    public boolean isContentAvailable() {
        this.f7713b.f.a(1);
        return this.f7713b.isContentAvailable();
    }

    public void setMediationId(String str) {
        this.f7713b.p = str;
    }

    public void requestContent() {
        boolean isLimitedConnected;
        String name = getName();
        TapjoyLog.i("TJPlacement", "requestContent() called for placement " + name);
        gg.a("TJPlacement.requestContent").a("placement", name).a("placement_type", this.f7713b.f7681c.getPlacementType());
        if (gf.a() != null && jr.c(gf.a().f8181b)) {
            TapjoyLog.w("TJPlacement", "[INFO] Your application calls requestContent without having previously called setUserConsent. You can review Tapjoy supported consent API here - https://dev.tapjoy.com/sdk-integration/#sdk11122_gdpr_release.");
        }
        if (!isLimited()) {
            isLimitedConnected = TapjoyConnectCore.isConnected();
        } else {
            isLimitedConnected = TapjoyConnectCore.isLimitedConnected();
        }
        if (!isLimitedConnected) {
            gg.b("TJPlacement.requestContent").b("not connected").c();
            a(new TJError(0, "SDK not connected -- connect must be called first with a successful callback"));
            return;
        }
        if (this.f7713b.getContext() == null) {
            gg.b("TJPlacement.requestContent").b("no context").c();
            a(new TJError(0, "Context is null -- TJPlacement requires a valid Context."));
        } else if (jr.c(name)) {
            gg.b("TJPlacement.requestContent").b("invalid name").c();
            a(new TJError(0, "Invalid placement name -- TJPlacement requires a valid placement name."));
        } else {
            try {
                this.f7713b.a(this);
            } finally {
                gg.d("TJPlacement.requestContent");
            }
        }
    }

    public void showContent() {
        int i;
        TapjoyLog.i("TJPlacement", "showContent() called for placement " + getName());
        TJCorePlacement tJCorePlacement = this.f7713b;
        gg.a("TJPlacement.showContent").a("placement", tJCorePlacement.f7681c.getPlacementName()).a("placement_type", tJCorePlacement.f7681c.getPlacementType()).a("content_type", tJCorePlacement.a());
        fx fxVar = tJCorePlacement.f;
        fxVar.a(8);
        fr frVar = fxVar.f8134a;
        if (frVar != null) {
            frVar.a();
        }
        if (!this.f7713b.isContentAvailable()) {
            TapjoyLog.e("TJPlacement", new TapjoyErrorMessage(TapjoyErrorMessage.ErrorType.INTEGRATION_ERROR, "No placement content available. Can not show content for non-200 placement."));
            gg.b("TJPlacement.showContent").b("no content").c();
            return;
        }
        try {
            final TJCorePlacement tJCorePlacement2 = this.f7713b;
            if (TapjoyConnectCore.isFullScreenViewOpen()) {
                TapjoyLog.w(TJCorePlacement.f7679a, "Only one view can be presented at a time.");
                gg.b("TJPlacement.showContent").b("another content showing").c();
            } else {
                if (TapjoyConnectCore.isViewOpen()) {
                    TapjoyLog.w(TJCorePlacement.f7679a, "Will close N2E content.");
                    TJPlacementManager.dismissContentShowing(false);
                }
                tJCorePlacement2.a("SHOW", this);
                gg.a d2 = gg.d("TJPlacement.showContent");
                if (tJCorePlacement2.g.isPrerendered()) {
                    d2.a("prerendered", (Object) true);
                }
                if (tJCorePlacement2.isContentReady()) {
                    d2.a("content_ready", (Object) true);
                }
                tJCorePlacement2.f.f8137d = d2;
                final String uuid = UUID.randomUUID().toString();
                if (tJCorePlacement2.i == null) {
                    tJCorePlacement2.f7681c.setContentViewId(uuid);
                    Intent intent = new Intent(tJCorePlacement2.f7680b, (Class<?>) TJAdUnitActivity.class);
                    intent.putExtra(TJAdUnitConstants.EXTRA_TJ_PLACEMENT_DATA, tJCorePlacement2.f7681c);
                    intent.setFlags(268435456);
                    tJCorePlacement2.f7680b.startActivity(intent);
                } else {
                    tJCorePlacement2.i.f = uuid;
                    if (tJCorePlacement2.i == null) {
                        i = 1;
                    } else if (tJCorePlacement2.i instanceof gw) {
                        i = 3;
                    } else {
                        i = tJCorePlacement2.i instanceof hf ? 2 : 0;
                    }
                    TapjoyConnectCore.viewWillOpen(uuid, i);
                    tJCorePlacement2.i.e = new gt() { // from class: com.tapjoy.TJCorePlacement.4
                        @Override // com.tapjoy.internal.gt
                        public final void a(Context context, String str, String str2) {
                            if (str2 == null) {
                                TJCorePlacement.this.f7681c.setRedirectURL(str);
                            } else {
                                TJCorePlacement.this.f7681c.setBaseURL(str);
                                TJCorePlacement.this.f7681c.setHttpResponse(str2);
                            }
                            TJCorePlacement.this.f7681c.setHasProgressSpinner(true);
                            TJCorePlacement.this.f7681c.setContentViewId(uuid);
                            Intent intent2 = new Intent(TJCorePlacement.this.f7680b, (Class<?>) TJAdUnitActivity.class);
                            intent2.putExtra(TJAdUnitConstants.EXTRA_TJ_PLACEMENT_DATA, TJCorePlacement.this.f7681c);
                            intent2.setFlags(268435456);
                            context.startActivity(intent2);
                        }
                    };
                    ha.a(new Runnable() { // from class: com.tapjoy.TJCorePlacement.5
                        @Override // java.lang.Runnable
                        public final void run() {
                            TJCorePlacement.this.i.a(ha.a().p, TJCorePlacement.this.f);
                        }
                    });
                }
                tJCorePlacement2.e = 0L;
                tJCorePlacement2.k = false;
                tJCorePlacement2.l = false;
            }
        } finally {
            gg.d("TJPlacement.showContent");
        }
    }

    public void setAuctionData(HashMap hashMap) {
        if (hashMap == null || hashMap.isEmpty()) {
            TapjoyLog.d("TJPlacement", "auctionData can not be null or empty");
            return;
        }
        TJCorePlacement tJCorePlacement = this.f7713b;
        tJCorePlacement.q = hashMap;
        String b2 = tJCorePlacement.b();
        if (!jr.c(b2)) {
            tJCorePlacement.f7681c.setAuctionMediationURL(TapjoyConnectCore.getPlacementURL() + "v1/apps/" + b2 + "/bid_content?");
            return;
        }
        TapjoyLog.i(TJCorePlacement.f7679a, "Placement auction data can not be set for a null app ID");
    }

    public void setMediationName(String str) {
        TapjoyLog.d("TJPlacement", "setMediationName=" + str);
        if (jr.c(str)) {
            return;
        }
        Context context = this.f7713b != null ? this.f7713b.getContext() : null;
        this.f7713b = TJPlacementManager.a(getName(), str, "", false, isLimited());
        TJCorePlacement tJCorePlacement = this.f7713b;
        tJCorePlacement.o = str;
        tJCorePlacement.m = str;
        tJCorePlacement.f7681c.setPlacementType(str);
        String b2 = tJCorePlacement.b();
        if (!jr.c(b2)) {
            tJCorePlacement.f7681c.setMediationURL(TapjoyConnectCore.getPlacementURL() + "v1/apps/" + b2 + "/mediation_content?");
        } else {
            TapjoyLog.i(TJCorePlacement.f7679a, "Placement mediation name can not be set for a null app ID");
        }
        if (context != null) {
            this.f7713b.setContext(context);
        }
    }

    public void setAdapterVersion(String str) {
        this.f7713b.n = str;
    }

    public static void dismissContent() {
        TJPlacementManager.dismissContentShowing("true".equals(TapjoyConnectCore.getConnectFlagValue("TJC_OPTION_DISMISS_CONTENT_ALL")));
    }

    public String getGUID() {
        return this.e;
    }

    private void a(TJError tJError) {
        this.f7713b.a(this, TapjoyErrorMessage.ErrorType.INTEGRATION_ERROR, tJError);
    }
}
