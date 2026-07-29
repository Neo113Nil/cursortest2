package com.tapjoy;

import com.tapjoy.internal.az;
import com.tapjoy.internal.gm;
import com.tapjoy.internal.gn;
import com.tapjoy.internal.gp;
import com.tapjoy.internal.ha;
import com.tapjoy.internal.hb;

/* loaded from: classes2.dex */
public class FiveRocksIntegration {

    /* renamed from: a, reason: collision with root package name */
    private static az f7579a = new az();

    public static void addPlacementCallback(String str, TJPlacement tJPlacement) {
        synchronized (f7579a) {
            f7579a.put(str, tJPlacement);
        }
    }

    public static void a() {
        ha a2 = ha.a();
        if (!a2.f8236c) {
            a2.f8236c = true;
        }
        gp gpVar = new gp() { // from class: com.tapjoy.FiveRocksIntegration.1
            @Override // com.tapjoy.internal.gp
            public final void a(String str) {
            }

            @Override // com.tapjoy.internal.gp
            public final void d(String str) {
            }

            @Override // com.tapjoy.internal.gp
            public final void b(String str) {
                TJPlacement tJPlacement;
                synchronized (FiveRocksIntegration.f7579a) {
                    tJPlacement = (TJPlacement) FiveRocksIntegration.f7579a.get(str);
                }
                if (tJPlacement == null || tJPlacement.f7712a == null) {
                    return;
                }
                tJPlacement.f7712a.onContentReady(tJPlacement);
            }

            @Override // com.tapjoy.internal.gp
            public final void c(String str) {
                TJPlacement tJPlacement;
                synchronized (FiveRocksIntegration.f7579a) {
                    tJPlacement = (TJPlacement) FiveRocksIntegration.f7579a.get(str);
                }
                if (tJPlacement == null || tJPlacement.f7712a == null) {
                    return;
                }
                tJPlacement.f7712a.onContentShow(tJPlacement);
            }

            @Override // com.tapjoy.internal.gp
            public final void a(String str, gm gmVar) {
                if (gmVar != null) {
                    gmVar.a(e(str));
                }
            }

            @Override // com.tapjoy.internal.gp
            public final void a(String str, String str2, gm gmVar) {
                TJPlacement tJPlacement;
                if (gmVar != null) {
                    gmVar.a(e(str));
                }
                synchronized (FiveRocksIntegration.f7579a) {
                    tJPlacement = (TJPlacement) FiveRocksIntegration.f7579a.get(str);
                }
                if (tJPlacement != null) {
                    TapjoyConnectCore.viewDidClose(str2);
                    if (tJPlacement.f7712a != null) {
                        tJPlacement.f7712a.onContentDismiss(tJPlacement);
                    }
                }
            }

            private gn e(final String str) {
                return new gn() { // from class: com.tapjoy.FiveRocksIntegration.1.1
                    @Override // com.tapjoy.internal.gn
                    public final void a(final String str2, String str3) {
                        TJPlacement tJPlacement;
                        synchronized (FiveRocksIntegration.f7579a) {
                            tJPlacement = (TJPlacement) FiveRocksIntegration.f7579a.get(str);
                        }
                        if (tJPlacement == null || tJPlacement.f7712a == null) {
                            return;
                        }
                        tJPlacement.f7712a.onPurchaseRequest(tJPlacement, new TJActionRequest() { // from class: com.tapjoy.FiveRocksIntegration.1.1.1
                            @Override // com.tapjoy.TJActionRequest
                            public final void cancelled() {
                            }

                            @Override // com.tapjoy.TJActionRequest
                            public final void completed() {
                            }

                            @Override // com.tapjoy.TJActionRequest
                            public final String getToken() {
                                return null;
                            }

                            @Override // com.tapjoy.TJActionRequest
                            public final String getRequestId() {
                                return str2;
                            }
                        }, str3);
                    }

                    @Override // com.tapjoy.internal.gn
                    public final void a(final String str2, String str3, int i, final String str4) {
                        TJPlacement tJPlacement;
                        synchronized (FiveRocksIntegration.f7579a) {
                            tJPlacement = (TJPlacement) FiveRocksIntegration.f7579a.get(str);
                        }
                        if (tJPlacement == null || tJPlacement.f7712a == null) {
                            return;
                        }
                        tJPlacement.f7712a.onRewardRequest(tJPlacement, new TJActionRequest() { // from class: com.tapjoy.FiveRocksIntegration.1.1.2
                            @Override // com.tapjoy.TJActionRequest
                            public final void cancelled() {
                            }

                            @Override // com.tapjoy.TJActionRequest
                            public final void completed() {
                            }

                            @Override // com.tapjoy.TJActionRequest
                            public final String getRequestId() {
                                return str2;
                            }

                            @Override // com.tapjoy.TJActionRequest
                            public final String getToken() {
                                return str4;
                            }
                        }, str3, i);
                    }
                };
            }
        };
        ha.a().p = hb.a(gpVar);
    }
}
