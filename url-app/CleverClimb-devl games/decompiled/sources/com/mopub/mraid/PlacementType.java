package com.mopub.mraid;

import java.util.Locale;

/* loaded from: classes2.dex */
public enum PlacementType {
    INLINE,
    INTERSTITIAL;

    String toJavascriptString() {
        return toString().toLowerCase(Locale.US);
    }
}
