package com.squareup.scannerview;

import com.plaid.internal.EnumC0170g;
import io.noties.markwon.LinkResolverDef;

/* loaded from: classes8.dex */
public enum Rotation {
    ROTATION_0(0),
    ROTATION_90(90),
    ROTATION_180(EnumC0170g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE),
    ROTATION_270(EnumC0170g.SDK_ASSET_HEADER_RTP_AUTHORIZE_MICRODEPOSITS_VALUE);

    public static final LinkResolverDef Companion = new LinkResolverDef(8);
    public final int r;

    Rotation(int i) {
        this.r = i;
    }
}
