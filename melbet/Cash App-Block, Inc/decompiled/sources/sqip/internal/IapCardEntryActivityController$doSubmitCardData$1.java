package sqip.internal;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import sqip.internal.CardEntryResult;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public /* synthetic */ class IapCardEntryActivityController$doSubmitCardData$1 extends FunctionReferenceImpl implements Function1<Result<CardEntryResult.CardAndNonceResult, String>, Unit> {
    public IapCardEntryActivityController$doSubmitCardData$1(Object obj) {
        super(1, 0, IapCardEntryActivityController.class, obj, "onCardNonceResult", "onCardNonceResult(Lsqip/internal/Result;)V");
    }

    public final void invoke(Result<CardEntryResult.CardAndNonceResult, String> result) {
        result.getClass();
        ((IapCardEntryActivityController) this.receiver).onCardNonceResult(result);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Result<CardEntryResult.CardAndNonceResult, String>) obj);
        return Unit.INSTANCE;
    }
}
