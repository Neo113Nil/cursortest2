package com.yandex.div.core.view2;

import O1.Xb;
import android.os.Handler;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
final class DivVisibilityActionTracker$cancelTracking$2 extends s implements Function1<Map<CompositeLogId, ? extends Xb>, Unit> {
    final /* synthetic */ DivVisibilityActionTracker this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DivVisibilityActionTracker$cancelTracking$2(DivVisibilityActionTracker divVisibilityActionTracker) {
        super(1);
        this.this$0 = divVisibilityActionTracker;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Map<CompositeLogId, ? extends Xb>) obj);
        return Unit.f41027a;
    }

    public final void invoke(@NotNull Map<CompositeLogId, ? extends Xb> emptyToken) {
        Handler handler;
        Intrinsics.checkNotNullParameter(emptyToken, "emptyToken");
        handler = this.this$0.handler;
        handler.removeCallbacksAndMessages(emptyToken);
    }
}
