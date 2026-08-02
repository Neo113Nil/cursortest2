package sqip.internal.nonce;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import okhttp3.internal.Tags;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lsqip/internal/nonce/CreateCardNonceErrorCode;", "", "(Ljava/lang/String;I)V", "INVALID_CARD", "NO_NETWORK", "UNSUPPORTED_CARD", "USAGE_ERROR", "sqip_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class CreateCardNonceErrorCode {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CreateCardNonceErrorCode[] $VALUES;
    public static final CreateCardNonceErrorCode INVALID_CARD = new CreateCardNonceErrorCode("INVALID_CARD", 0);
    public static final CreateCardNonceErrorCode NO_NETWORK = new CreateCardNonceErrorCode("NO_NETWORK", 1);
    public static final CreateCardNonceErrorCode UNSUPPORTED_CARD = new CreateCardNonceErrorCode("UNSUPPORTED_CARD", 2);
    public static final CreateCardNonceErrorCode USAGE_ERROR = new CreateCardNonceErrorCode("USAGE_ERROR", 3);

    private static final /* synthetic */ CreateCardNonceErrorCode[] $values() {
        return new CreateCardNonceErrorCode[]{INVALID_CARD, NO_NETWORK, UNSUPPORTED_CARD, USAGE_ERROR};
    }

    static {
        CreateCardNonceErrorCode[] $values = $values();
        $VALUES = $values;
        $ENTRIES = Tags.enumEntries($values);
    }

    private CreateCardNonceErrorCode(String str, int i) {
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static CreateCardNonceErrorCode valueOf(String str) {
        return (CreateCardNonceErrorCode) Enum.valueOf(CreateCardNonceErrorCode.class, str);
    }

    public static CreateCardNonceErrorCode[] values() {
        return (CreateCardNonceErrorCode[]) $VALUES.clone();
    }
}
