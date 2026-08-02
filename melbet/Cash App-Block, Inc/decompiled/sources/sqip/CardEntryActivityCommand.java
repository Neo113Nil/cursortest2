package sqip;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lsqip/CardEntryActivityCommand;", "", "()V", "Finish", "ShowError", "Lsqip/CardEntryActivityCommand$Finish;", "Lsqip/CardEntryActivityCommand$ShowError;", "card-entry_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public abstract class CardEntryActivityCommand {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lsqip/CardEntryActivityCommand$Finish;", "Lsqip/CardEntryActivityCommand;", "()V", "card-entry_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Finish extends CardEntryActivityCommand {
        public Finish() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lsqip/CardEntryActivityCommand$ShowError;", "Lsqip/CardEntryActivityCommand;", "message", "", "(Ljava/lang/CharSequence;)V", "getMessage", "()Ljava/lang/CharSequence;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "card-entry_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowError extends CardEntryActivityCommand {
        private final CharSequence message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowError(CharSequence charSequence) {
            super(null);
            charSequence.getClass();
            this.message = charSequence;
        }

        public static /* synthetic */ ShowError copy$default(ShowError showError, CharSequence charSequence, int i, Object obj) {
            if ((i & 1) != 0) {
                charSequence = showError.message;
            }
            return showError.copy(charSequence);
        }

        /* renamed from: component1, reason: from getter */
        public final CharSequence getMessage() {
            return this.message;
        }

        public final ShowError copy(CharSequence message) {
            message.getClass();
            return new ShowError(message);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ShowError) && Intrinsics.areEqual(this.message, ((ShowError) other).message);
        }

        public final CharSequence getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        public String toString() {
            return "ShowError(message=" + ((Object) this.message) + ")";
        }
    }

    public /* synthetic */ CardEntryActivityCommand(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private CardEntryActivityCommand() {
    }
}
