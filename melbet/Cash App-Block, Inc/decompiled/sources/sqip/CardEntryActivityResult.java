package sqip;

import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\b\tB\u0007\b\u0004¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010\u0005\u001a\u00020\u0006J\u0006\u0010\u0007\u001a\u00020\u0006\u0082\u0001\u0002\n\u0004¨\u0006\u000b"}, d2 = {"Lsqip/CardEntryActivityResult;", "", "()V", "getSuccessValue", "Lsqip/CardEntryActivityResult$Success;", "isCanceled", "", "isSuccess", "Canceled", "Success", "Lsqip/CardEntryActivityResult$Canceled;", "card-entry_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public abstract class CardEntryActivityResult {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lsqip/CardEntryActivityResult$Canceled;", "Lsqip/CardEntryActivityResult;", "()V", "card-entry_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Canceled extends CardEntryActivityResult {
        public static final Canceled INSTANCE = new Canceled();

        private Canceled() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0004HÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0004HÖ\u0001R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lsqip/CardEntryActivityResult$Success;", "Lsqip/CardEntryActivityResult;", "Lsqip/CardDetails;", "nonce", "", "card", "Lsqip/Card;", "(Ljava/lang/String;Lsqip/Card;)V", "getCard", "()Lsqip/Card;", "getNonce", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "card-entry_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Success extends CardEntryActivityResult implements CardDetails {
        private final Card card;
        private final String nonce;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(String str, Card card) {
            super(null);
            str.getClass();
            card.getClass();
            this.nonce = str;
            this.card = card;
        }

        public static /* synthetic */ Success copy$default(Success success, String str, Card card, int i, Object obj) {
            if ((i & 1) != 0) {
                str = success.nonce;
            }
            if ((i & 2) != 0) {
                card = success.card;
            }
            return success.copy(str, card);
        }

        /* renamed from: component1, reason: from getter */
        public final String getNonce() {
            return this.nonce;
        }

        /* renamed from: component2, reason: from getter */
        public final Card getCard() {
            return this.card;
        }

        public final Success copy(String nonce, Card card) {
            nonce.getClass();
            card.getClass();
            return new Success(nonce, card);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Success)) {
                return false;
            }
            Success success = (Success) other;
            return Intrinsics.areEqual(this.nonce, success.nonce) && Intrinsics.areEqual(this.card, success.card);
        }

        @Override // sqip.CardDetails
        public Card getCard() {
            return this.card;
        }

        @Override // sqip.CardDetails
        public String getNonce() {
            return this.nonce;
        }

        public int hashCode() {
            return this.card.hashCode() + (this.nonce.hashCode() * 31);
        }

        public String toString() {
            return "Success(nonce=" + this.nonce + ", card=" + this.card + ")";
        }
    }

    public /* synthetic */ CardEntryActivityResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final Success getSuccessValue() {
        Success success = this instanceof Success ? (Success) this : null;
        if (success != null) {
            return success;
        }
        a$$ExternalSyntheticBUOutline0.m$1("Cannot call getSuccessValue() when isSuccess() returns false");
        return null;
    }

    public final boolean isCanceled() {
        return this == Canceled.INSTANCE;
    }

    public final boolean isSuccess() {
        return this instanceof Success;
    }

    private CardEntryActivityResult() {
    }
}
