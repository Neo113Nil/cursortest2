package com.instagram.common.viewpoint.core;

import com.facebook.ads.sync.SyncModifiableBundle;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Bi, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0318Bi implements InterfaceC1274fK {
    public final By A00;
    public final EnumC1279fP A01;

    public AbstractC0318Bi(By by, EnumC1279fP enumC1279fP) {
        this.A00 = by;
        this.A01 = enumC1279fP;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1274fK
    public void A45(Map<InterfaceC1257f2, EnumC1279fP> map, Map<SyncModifiableBundle, EnumC1266fC> map2) {
        map.put(this.A00, this.A01);
    }
}
