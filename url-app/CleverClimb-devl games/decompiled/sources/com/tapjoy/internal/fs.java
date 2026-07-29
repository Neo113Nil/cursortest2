package com.tapjoy.internal;

import android.content.Context;
import com.tapjoy.TJPlacement;
import com.tapjoy.TJPlacementListener;
import com.tapjoy.TJPlacementManager;

/* loaded from: classes2.dex */
public final class fs {

    /* renamed from: a, reason: collision with root package name */
    private static final ga f8127a = new ga() { // from class: com.tapjoy.internal.fs.1
        @Override // com.tapjoy.internal.ga
        protected final /* bridge */ /* synthetic */ String a(Object obj) {
            return "InsufficientCurrency";
        }

        @Override // com.tapjoy.internal.ga
        protected final /* synthetic */ TJPlacement a(Context context, TJPlacementListener tJPlacementListener, Object obj) {
            return TJPlacementManager.createPlacement(context, "InsufficientCurrency", true, tJPlacementListener);
        }
    };

    public static void a() {
        f8127a.c(null);
    }
}
