package com.facebook.ads.internal.adapters;

import com.facebook.ads.internal.protocol.AdPlacementType;

/* loaded from: classes.dex */
public interface AdAdapter {
    AdPlacementType getPlacementType();

    void onDestroy();
}
