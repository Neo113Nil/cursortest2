package sqip.internal;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lsqip/internal/CardEditorState;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class CreditCardEditor$stateChangedCallback$1 extends Lambda implements Function1<CardEditorState, Unit> {
    public static final CreditCardEditor$stateChangedCallback$1 INSTANCE = new CreditCardEditor$stateChangedCallback$1();

    public CreditCardEditor$stateChangedCallback$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((CardEditorState) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(CardEditorState cardEditorState) {
        cardEditorState.getClass();
    }
}
