package dev.hyo.openiap.helpers;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: Helpers.kt */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "dev.hyo.openiap.helpers.HelpersKt", f = "Helpers.kt", i = {0, 0, 0, 1, 1, 1}, l = {ConstraintLayout.LayoutParams.Table.LAYOUT_GONE_MARGIN_BASELINE, 56}, m = "restorePurchases", n = {"client", "purchases", "includeSuspended", "client", "purchases", "includeSuspended"}, s = {"L$0", "L$1", "Z$0", "L$0", "L$1", "Z$0"})
/* loaded from: classes3.dex */
final class HelpersKt$restorePurchases$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;

    HelpersKt$restorePurchases$1(Continuation<? super HelpersKt$restorePurchases$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return HelpersKt.restorePurchases(null, false, this);
    }
}
