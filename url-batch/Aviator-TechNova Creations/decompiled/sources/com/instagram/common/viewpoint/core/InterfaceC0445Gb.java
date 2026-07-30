package com.instagram.common.viewpoint.core;

import android.net.Uri;
import java.util.List;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Gb, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public interface InterfaceC0445Gb {
    public static final InterfaceC0445Gb A00 = new InterfaceC0445Gb() { // from class: com.facebook.ads.redexgen.X.lL
        @Override // com.instagram.common.viewpoint.core.InterfaceC0445Gb
        public final GX[] A5F() {
            return AbstractC0444Ga.A00();
        }

        @Override // com.instagram.common.viewpoint.core.InterfaceC0445Gb
        public final /* synthetic */ GX[] A5G(Uri uri, Map map) {
            return AbstractC0444Ga.A01(this, uri, map);
        }
    };

    GX[] A5F();

    GX[] A5G(Uri uri, Map<String, List<String>> map);
}
