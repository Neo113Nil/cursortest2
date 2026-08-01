package com.facebook.ads.redexgen.X;

import java.util.Comparator;

/* renamed from: com.facebook.ads.redexgen.X.Hq, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0550Hq implements Comparator<C0551Hr> {
    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.Comparator
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compare(C0551Hr c0551Hr, C0551Hr c0551Hr2) {
        if (c0551Hr.A00 < c0551Hr2.A00) {
            return -1;
        }
        return c0551Hr2.A00 < c0551Hr.A00 ? 1 : 0;
    }
}
