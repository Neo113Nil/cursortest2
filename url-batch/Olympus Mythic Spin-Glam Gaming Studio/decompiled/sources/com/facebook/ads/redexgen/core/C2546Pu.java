package com.facebook.ads.redexgen.core;

import android.view.View;
import java.util.Comparator;

/* renamed from: com.facebook.ads.redexgen.X.Pu, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2546Pu implements Comparator<View> {
    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.Comparator
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compare(View view, View view2) {
        C2540Po c2540Po = (C2540Po) view.getLayoutParams();
        C2540Po c2540Po2 = (C2540Po) view2.getLayoutParams();
        if (c2540Po.A05 != c2540Po2.A05) {
            return c2540Po.A05 ? 1 : -1;
        }
        return c2540Po.A02 - c2540Po2.A02;
    }
}
