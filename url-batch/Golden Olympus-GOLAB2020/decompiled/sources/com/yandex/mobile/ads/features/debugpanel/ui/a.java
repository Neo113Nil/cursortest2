package com.yandex.mobile.ads.features.debugpanel.ui;

import com.yandex.mobile.ads.impl.no0;
import com.yandex.mobile.ads.impl.rx;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
final /* synthetic */ class a extends p implements Function1<rx, Unit> {
    a(no0 no0Var) {
        super(1, no0Var, no0.class, "onAction", "onAction(Lcom/yandex/mobile/ads/features/debugpanel/ui/model/DebugPanelUiAction;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        rx p02 = (rx) obj;
        Intrinsics.checkNotNullParameter(p02, "p0");
        ((no0) this.receiver).a(p02);
        return Unit.f41027a;
    }
}
