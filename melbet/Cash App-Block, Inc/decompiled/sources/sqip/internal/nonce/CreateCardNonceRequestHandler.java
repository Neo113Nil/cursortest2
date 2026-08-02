package sqip.internal.nonce;

import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import sqip.internal.CardEntryResult;
import sqip.internal.Result;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J0\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u001e\u0010\u0006\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b\u0012\u0004\u0012\u00020\u00030\u0007H&JR\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u00052\u001e\u0010\u0006\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b\u0012\u0004\u0012\u00020\u00030\u0007H&¨\u0006\u0010"}, d2 = {"Lsqip/internal/nonce/CreateCardNonceRequestHandler;", "", "retrieveGiftCardNonce", "", InquiryField.FloatField.TYPE2, "", "callback", "Lkotlin/Function1;", "Lsqip/internal/Result;", "Lsqip/internal/CardEntryResult$CardAndNonceResult;", "retrieveNonce", "expirationMonth", "", "expirationYear", "cvv", "billingPostalCode", "card-entry_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface CreateCardNonceRequestHandler {
    void retrieveGiftCardNonce(String number, Function1<? super Result<CardEntryResult.CardAndNonceResult, String>, Unit> callback);

    void retrieveNonce(String number, int expirationMonth, int expirationYear, String cvv, String billingPostalCode, Function1<? super Result<CardEntryResult.CardAndNonceResult, String>, Unit> callback);
}
