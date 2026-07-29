package com.tapjoy.internal;

import android.content.Context;
import com.tapjoy.TJPlacement;
import com.tapjoy.TJPlacementListener;

/* loaded from: classes2.dex */
final class ge extends gd {
    ge() {
    }

    @Override // com.tapjoy.internal.gd
    public final Object a(Context context, String str, TJPlacementListener tJPlacementListener) {
        return new TJPlacement(context, str, tJPlacementListener);
    }
}
