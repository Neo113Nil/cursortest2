package sqip;

import android.content.Intent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a2\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0014\b\u0004\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\u0005H\u0086\bø\u0001\u0000\u001a0\u0010\u0006\u001a\u00020\u0001*\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0014\b\u0004\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\u0005H\u0086\bø\u0001\u0000\u001a&\u0010\u000b\u001a\u00020\u0001*\u00020\u00072\u0014\b\u0004\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\u0005H\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000f"}, d2 = {"enqueue", "", "T", "Lsqip/Call;", "callback", "Lkotlin/Function1;", "handleActivityResult", "Lsqip/CardEntry;", "data", "Landroid/content/Intent;", "Lsqip/CardEntryActivityResult;", "setCardNonceBackgroundHandler", "handler", "Lsqip/CardDetails;", "Lsqip/CardEntryActivityCommand;", "card-entry_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class KotlinExtensions {
    public static final <T> void enqueue(Call<T> call, final Function1<? super T, Unit> function1) {
        call.getClass();
        function1.getClass();
        call.enqueue(new Callback<T>() { // from class: sqip.KotlinExtensions$enqueue$1
            @Override // sqip.Callback
            public void onResult(T result) {
                function1.invoke(result);
            }
        });
    }

    public static final void handleActivityResult(CardEntry cardEntry, Intent intent, final Function1<? super CardEntryActivityResult, Unit> function1) {
        cardEntry.getClass();
        function1.getClass();
        CardEntry.handleActivityResult(intent, new Callback<CardEntryActivityResult>() { // from class: sqip.KotlinExtensions$handleActivityResult$1
            @Override // sqip.Callback
            public void onResult(CardEntryActivityResult result) {
                result.getClass();
                function1.invoke(result);
            }
        });
    }

    public static final void setCardNonceBackgroundHandler(CardEntry cardEntry, final Function1<? super CardDetails, ? extends CardEntryActivityCommand> function1) {
        cardEntry.getClass();
        function1.getClass();
        CardEntry.setCardNonceBackgroundHandler(new CardNonceBackgroundHandler() { // from class: sqip.KotlinExtensions$setCardNonceBackgroundHandler$1
            @Override // sqip.CardNonceBackgroundHandler
            public CardEntryActivityCommand handleEnteredCardInBackground(CardDetails cardDetails) {
                cardDetails.getClass();
                return (CardEntryActivityCommand) function1.invoke(cardDetails);
            }
        });
    }
}
