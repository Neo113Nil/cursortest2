package com.instagram.common.viewpoint.core;

import com.google.common.primitives.ElementTypesAreNonnullByDefault;

@ElementTypesAreNonnullByDefault
/* loaded from: assets/audience_network.dex */
public abstract class PD {
    public static int A00(boolean a2, boolean b) {
        if (a2 == b) {
            return 0;
        }
        return a2 ? 1 : -1;
    }
}
