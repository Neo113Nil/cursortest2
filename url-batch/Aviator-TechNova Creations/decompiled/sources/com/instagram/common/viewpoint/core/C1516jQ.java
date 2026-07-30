package com.instagram.common.viewpoint.core;

import java.io.File;

/* renamed from: com.facebook.ads.redexgen.X.jQ, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1516jQ implements InterfaceC0565Ks<File> {
    @Override // com.instagram.common.viewpoint.core.InterfaceC0565Ks
    public final C0564Kr<File> A3p(File file, LA la) {
        if (file.exists()) {
            return new C0564Kr<>(true, file);
        }
        return new C0564Kr<>(false, null);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0565Ks
    public final void A55(File file, LA la) {
    }
}
