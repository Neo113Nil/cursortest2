package sqip;

import android.app.Activity;
import android.content.Intent;
import kotlin.Metadata;
import sqip.internal.CardEntryActivity;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0007J\u0010\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0006H\u0007J$\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u0004H\u0007J\u001a\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u001b"}, d2 = {"Lsqip/CardEntry;", "", "()V", "DEFAULT_CARD_ENTRY_REQUEST_CODE", "", "cardNonceBackgroundHandler", "Lsqip/CardNonceBackgroundHandler;", "getCardNonceBackgroundHandler$card_entry_release", "()Lsqip/CardNonceBackgroundHandler;", "setCardNonceBackgroundHandler$card_entry_release", "(Lsqip/CardNonceBackgroundHandler;)V", "handleActivityResult", "", "data", "Landroid/content/Intent;", "callback", "Lsqip/Callback;", "Lsqip/CardEntryActivityResult;", "setCardNonceBackgroundHandler", "handler", "startCardEntryActivity", "activity", "Landroid/app/Activity;", "collectPostalCode", "", "requestCode", "startGiftCardEntryActivity", "card-entry_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class CardEntry {
    public static final int DEFAULT_CARD_ENTRY_REQUEST_CODE = 51789;
    public static final CardEntry INSTANCE = new CardEntry();
    private static CardNonceBackgroundHandler cardNonceBackgroundHandler;

    private CardEntry() {
    }

    public static final void handleActivityResult(Intent data, Callback<CardEntryActivityResult> callback) {
        callback.getClass();
        CardEntryActivity.INSTANCE.onActivityResult(data, callback);
    }

    public static final void setCardNonceBackgroundHandler(CardNonceBackgroundHandler handler) {
        handler.getClass();
        cardNonceBackgroundHandler = handler;
    }

    public static final void startCardEntryActivity(Activity activity) {
        activity.getClass();
        startCardEntryActivity$default(activity, false, 0, 6, null);
    }

    public static /* synthetic */ void startCardEntryActivity$default(Activity activity, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = true;
        }
        if ((i2 & 4) != 0) {
            i = DEFAULT_CARD_ENTRY_REQUEST_CODE;
        }
        startCardEntryActivity(activity, z, i);
    }

    public static final void startGiftCardEntryActivity(Activity activity) {
        activity.getClass();
        startGiftCardEntryActivity$default(activity, 0, 2, null);
    }

    public static /* synthetic */ void startGiftCardEntryActivity$default(Activity activity, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = DEFAULT_CARD_ENTRY_REQUEST_CODE;
        }
        startGiftCardEntryActivity(activity, i);
    }

    public final CardNonceBackgroundHandler getCardNonceBackgroundHandler$card_entry_release() {
        return cardNonceBackgroundHandler;
    }

    public final void setCardNonceBackgroundHandler$card_entry_release(CardNonceBackgroundHandler cardNonceBackgroundHandler2) {
        cardNonceBackgroundHandler = cardNonceBackgroundHandler2;
    }

    public static final void startCardEntryActivity(Activity activity, boolean z) {
        activity.getClass();
        startCardEntryActivity$default(activity, z, 0, 4, null);
    }

    public static final void startGiftCardEntryActivity(Activity activity, int requestCode) {
        activity.getClass();
        CardEntryActivity.INSTANCE.startGiftCardFlow(activity, requestCode);
    }

    public static final void startCardEntryActivity(Activity activity, boolean collectPostalCode, int requestCode) {
        activity.getClass();
        CardEntryActivity.INSTANCE.start(activity, collectPostalCode, requestCode);
    }
}
