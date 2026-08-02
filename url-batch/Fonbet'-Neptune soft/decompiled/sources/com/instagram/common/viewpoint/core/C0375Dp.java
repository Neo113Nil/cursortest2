package com.instagram.common.viewpoint.core;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import javax.annotation.Nullable;

@MetaExoPlayerCustomization(type = {"NEW_CLASS"}, value = "Encapsulate error info from subtitle decoder")
/* renamed from: com.facebook.ads.redexgen.X.Dp, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0375Dp {

    @Nullable
    public final C1830or A00;
    public final Throwable A01;

    public C0375Dp(@Nullable C1830or c1830or, Throwable th) {
        this.A00 = c1830or;
        this.A01 = th;
    }
}
