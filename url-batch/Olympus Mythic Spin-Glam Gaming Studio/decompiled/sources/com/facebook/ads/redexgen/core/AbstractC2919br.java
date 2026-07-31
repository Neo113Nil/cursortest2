package com.facebook.ads.redexgen.core;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: com.facebook.ads.redexgen.X.br, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC2919br {
    public static final int A00 = YB.A00();

    public static void A00(C3218gi c3218gi, ViewGroup viewGroup, String str) {
        new LM(viewGroup, c3218gi).A07(str);
        View view = new View(c3218gi);
        view.setId(A00);
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        YB.A0U(view, c3218gi);
        viewGroup.addView(view, 0);
    }
}
