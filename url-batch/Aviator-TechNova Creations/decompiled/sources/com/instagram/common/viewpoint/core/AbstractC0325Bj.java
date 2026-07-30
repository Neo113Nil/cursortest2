package com.instagram.common.viewpoint.core;

import com.facebook.ads.sync.SyncModifiableBundle;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Bj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0325Bj implements InterfaceC1280fK {
    public final EnumC1272fC A00;
    public final AbstractC00971z A01;

    public AbstractC0325Bj(AbstractC00971z abstractC00971z, EnumC1272fC enumC1272fC) {
        this.A01 = abstractC00971z;
        this.A00 = enumC1272fC;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1280fK
    public void A45(Map<InterfaceC1263f2, EnumC1285fP> map, Map<SyncModifiableBundle, EnumC1272fC> map2) {
        map2.put(null, this.A00);
    }
}
