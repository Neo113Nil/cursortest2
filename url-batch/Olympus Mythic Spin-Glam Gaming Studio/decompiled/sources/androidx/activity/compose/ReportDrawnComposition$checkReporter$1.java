package androidx.activity.compose;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: ReportDrawn.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes13.dex */
/* synthetic */ class ReportDrawnComposition$checkReporter$1 extends FunctionReferenceImpl implements Function1 {
    ReportDrawnComposition$checkReporter$1(Object obj) {
        super(1, obj, ReportDrawnComposition.class, "observeReporter", "observeReporter(Lkotlin/jvm/functions/Function0;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Function0) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(Function0 function0) {
        ((ReportDrawnComposition) this.receiver).observeReporter(function0);
    }
}
