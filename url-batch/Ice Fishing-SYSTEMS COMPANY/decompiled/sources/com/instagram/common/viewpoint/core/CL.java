package com.instagram.common.viewpoint.core;

import com.facebook.ads.sync.SyncModifiableBundle;
import java.util.Map;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class CL implements InterfaceC1833gc {
    public final C0817Cb A00;
    public final EnumC1838gh A01;

    public CL(C0817Cb c0817Cb, EnumC1838gh enumC1838gh) {
        this.A00 = c0817Cb;
        this.A01 = enumC1838gh;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1833gc
    public void A4D(Map<InterfaceC1815gK, EnumC1838gh> map, Map<SyncModifiableBundle, EnumC1825gU> map2) {
        map.put(this.A00, this.A01);
    }
}
