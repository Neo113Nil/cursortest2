package com.yandex.mobile.ads.impl;

import android.widget.ImageView;
import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class r40 implements InterfaceC2341xb {
    @Override // com.yandex.mobile.ads.impl.nm0
    public final void a(@NotNull db2 uiElements) {
        Intrinsics.checkNotNullParameter(uiElements, "uiElements");
        TextView p4 = uiElements.p();
        if (p4 != null) {
            p4.setVisibility(8);
        }
        ImageView o4 = uiElements.o();
        if (o4 == null) {
            return;
        }
        o4.setVisibility(8);
    }
}
