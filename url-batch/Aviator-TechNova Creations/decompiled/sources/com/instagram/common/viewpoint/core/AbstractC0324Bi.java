package com.instagram.common.viewpoint.core;

import com.facebook.ads.sync.SyncModifiableBundle;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Bi, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0324Bi implements InterfaceC1280fK {
    public final By A00;
    public final EnumC1285fP A01;

    public AbstractC0324Bi(By by, EnumC1285fP enumC1285fP) {
        this.A00 = by;
        this.A01 = enumC1285fP;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1280fK
    public void A45(Map<InterfaceC1263f2, EnumC1285fP> map, Map<SyncModifiableBundle, EnumC1272fC> map2) {
        map.put(this.A00, this.A01);
    }
}
