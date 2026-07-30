package com.instagram.common.viewpoint.core;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import javax.annotation.Nullable;

@MetaExoPlayerCustomization(type = {"NEW_CLASS"}, value = "Encapsulate error info from subtitle decoder")
/* renamed from: com.facebook.ads.redexgen.X.Dp, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0381Dp {

    @Nullable
    public final C1836or A00;
    public final Throwable A01;

    public C0381Dp(@Nullable C1836or c1836or, Throwable th) {
        this.A00 = c1836or;
        this.A01 = th;
    }
}
