package com.instagram.common.viewpoint.core;

import com.facebook.ads.sync.SyncModifiableBundle;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Bj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0319Bj implements InterfaceC1274fK {
    public final EnumC1266fC A00;
    public final AbstractC00911z A01;

    public AbstractC0319Bj(AbstractC00911z abstractC00911z, EnumC1266fC enumC1266fC) {
        this.A01 = abstractC00911z;
        this.A00 = enumC1266fC;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1274fK
    public void A45(Map<InterfaceC1257f2, EnumC1279fP> map, Map<SyncModifiableBundle, EnumC1266fC> map2) {
        map2.put(null, this.A00);
    }
}
