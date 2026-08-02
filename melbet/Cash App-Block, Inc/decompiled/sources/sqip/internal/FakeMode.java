package sqip.internal;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import sqip.internal.CardEntryResult;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u00020\u00042\u001e\u0010\u0005\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u0012\u0004\u0012\u00020\u00040\u0006J \u0010\n\u001a\u00020\u00042\u0018\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00070\u000b¨\u0006\f"}, d2 = {"Lsqip/internal/FakeMode;", "", "()V", "sendResult", "", "callback", "Lkotlin/Function1;", "Lsqip/internal/Result;", "Lsqip/internal/CardEntryResult$CardAndNonceResult;", "", "setResultsProvider", "Lkotlin/Function0;", "sqip_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class FakeMode {
    public static final FakeMode INSTANCE = new FakeMode();

    private FakeMode() {
    }

    public final void sendResult(Function1<? super Result<CardEntryResult.CardAndNonceResult, String>, Unit> callback) {
        callback.getClass();
    }

    public final void setResultsProvider(Function0<Result<CardEntryResult.CardAndNonceResult, String>> callback) {
        callback.getClass();
    }
}
