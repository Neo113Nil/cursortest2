package sqip.internal.event;

import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.appsflyer.AppsFlyerProperties;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import sqip.internal.nonce.RealCreateCardNonceRequestHandler;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002:;B\u0081\u0002\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\t\u0012\b\b\u0002\u0010\u0010\u001a\u00020\t\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u001b¢\u0006\u0002\u0010\u001cJ\f\u00109\u001a\u00020\u0003*\u00020\u0003H\u0002R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u0014\u0010\u000f\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001eR\u0016\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010 R\u0016\u0010\f\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010 R\u0016\u0010\r\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010 R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010 R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010 R\u0014\u0010\u0011\u001a\u00020\u0012X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010 R\u0011\u0010+\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b,\u0010 R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010 R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010 R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010 R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010 R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010 R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010 R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010 R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u0010 R\u0014\u0010\u0010\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u0010\u001eR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u0010 R\u0014\u0010\u001a\u001a\u00020\u001bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u00108\u0082\u0001\u0002<=¨\u0006>"}, d2 = {"Lsqip/internal/event/IapEvent;", "", "flowType", "", "validationErrorField", "nonceErrorCode", "appErrorMessage", "buyerAction", "amount", "", AppsFlyerProperties.CURRENCY_CODE, "locationId", "emptyContactFields", "errorCode", "errorDescription", "challengesCompleted", "totalChallenges", "hasChallengedUser", "", "threeDSTransactionStatus", "threeDSServerTransactionID", "threeDSWarningSeverity", "threeDSWarningCode", "threeDSWarningDescription", "threeDSChallengeType", "threeDSVerificationToken", "verificationDuration", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V", "getAmount", "()I", "getAppErrorMessage", "()Ljava/lang/String;", "getBuyerAction", "getChallengesCompleted", "getCurrencyCode", "getEmptyContactFields", "getErrorCode", "getErrorDescription", "getFlowType", "getHasChallengedUser", "()Z", "getLocationId", "name", "getName", "getNonceErrorCode", "getThreeDSChallengeType", "getThreeDSServerTransactionID", "getThreeDSTransactionStatus", "getThreeDSVerificationToken", "getThreeDSWarningCode", "getThreeDSWarningDescription", "getThreeDSWarningSeverity", "getTotalChallenges", "getValidationErrorField", "getVerificationDuration", "()J", "camelCaseToWords", "BuyerVerification", "CardEntry", "Lsqip/internal/event/IapEvent$BuyerVerification;", "Lsqip/internal/event/IapEvent$CardEntry;", "sqip_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public abstract class IapEvent {
    private final int amount;
    private final String appErrorMessage;
    private final String buyerAction;
    private final int challengesCompleted;
    private final String currencyCode;
    private final String emptyContactFields;
    private final String errorCode;
    private final String errorDescription;
    private final String flowType;
    private final boolean hasChallengedUser;
    private final String locationId;
    private final String nonceErrorCode;
    private final String threeDSChallengeType;
    private final String threeDSServerTransactionID;
    private final String threeDSTransactionStatus;
    private final String threeDSVerificationToken;
    private final String threeDSWarningCode;
    private final String threeDSWarningDescription;
    private final String threeDSWarningSeverity;
    private final int totalChallenges;
    private final String validationErrorField;
    private final long verificationDuration;

    public /* synthetic */ IapEvent(String str, String str2, String str3, String str4, String str5, int i, String str6, String str7, String str8, String str9, String str10, int i2, int i3, boolean z, String str11, String str12, String str13, String str14, String str15, String str16, String str17, long j, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i4 & 2) != 0 ? null : str2, (i4 & 4) != 0 ? null : str3, (i4 & 8) != 0 ? null : str4, (i4 & 16) != 0 ? null : str5, (i4 & 32) != 0 ? -1 : i, (i4 & 64) != 0 ? null : str6, (i4 & 128) != 0 ? null : str7, (i4 & 256) != 0 ? null : str8, (i4 & 512) != 0 ? null : str9, (i4 & 1024) != 0 ? null : str10, (i4 & 2048) != 0 ? -1 : i2, (i4 & 4096) != 0 ? -1 : i3, (i4 & PKIFailureInfo.certRevoked) != 0 ? false : z, (i4 & 16384) != 0 ? null : str11, (32768 & i4) != 0 ? null : str12, (65536 & i4) != 0 ? null : str13, (131072 & i4) != 0 ? null : str14, (262144 & i4) != 0 ? null : str15, (524288 & i4) != 0 ? null : str16, (1048576 & i4) != 0 ? null : str17, (i4 & PKIFailureInfo.badSenderNonce) != 0 ? -1L : j, null);
    }

    private final String camelCaseToWords(String str) {
        StringBuilder sb = new StringBuilder(str.length());
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (sb.length() > 0 && Character.isUpperCase(charAt)) {
                sb.append(' ');
            }
            sb.append(charAt);
        }
        return sb.toString();
    }

    public int getAmount() {
        return this.amount;
    }

    public String getAppErrorMessage() {
        return this.appErrorMessage;
    }

    public String getBuyerAction() {
        return this.buyerAction;
    }

    public int getChallengesCompleted() {
        return this.challengesCompleted;
    }

    public String getCurrencyCode() {
        return this.currencyCode;
    }

    public String getEmptyContactFields() {
        return this.emptyContactFields;
    }

    public String getErrorCode() {
        return this.errorCode;
    }

    public String getErrorDescription() {
        return this.errorDescription;
    }

    public final String getFlowType() {
        return this.flowType;
    }

    public boolean getHasChallengedUser() {
        return this.hasChallengedUser;
    }

    public String getLocationId() {
        return this.locationId;
    }

    public final String getName() {
        return camelCaseToWords(getClass().getSimpleName());
    }

    public String getNonceErrorCode() {
        return this.nonceErrorCode;
    }

    public String getThreeDSChallengeType() {
        return this.threeDSChallengeType;
    }

    public String getThreeDSServerTransactionID() {
        return this.threeDSServerTransactionID;
    }

    public String getThreeDSTransactionStatus() {
        return this.threeDSTransactionStatus;
    }

    public String getThreeDSVerificationToken() {
        return this.threeDSVerificationToken;
    }

    public String getThreeDSWarningCode() {
        return this.threeDSWarningCode;
    }

    public String getThreeDSWarningDescription() {
        return this.threeDSWarningDescription;
    }

    public String getThreeDSWarningSeverity() {
        return this.threeDSWarningSeverity;
    }

    public int getTotalChallenges() {
        return this.totalChallenges;
    }

    public String getValidationErrorField() {
        return this.validationErrorField;
    }

    public long getVerificationDuration() {
        return this.verificationDuration;
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014B+\b\u0004\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b\u0082\u0001\n\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e¨\u0006\u001f"}, d2 = {"Lsqip/internal/event/IapEvent$CardEntry;", "Lsqip/internal/event/IapEvent;", "validationErrorField", "", "nonceErrorCode", "appErrorMessage", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAppErrorMessage", "()Ljava/lang/String;", "getNonceErrorCode", "getValidationErrorField", "AppError", "Cancel", "ConfigurationChange", "NonceBackgroundHandling", "NonceError", "NonceReceived", "Started", "Submit", "Success", "ValidationError", "Lsqip/internal/event/IapEvent$CardEntry$AppError;", "Lsqip/internal/event/IapEvent$CardEntry$Cancel;", "Lsqip/internal/event/IapEvent$CardEntry$ConfigurationChange;", "Lsqip/internal/event/IapEvent$CardEntry$NonceBackgroundHandling;", "Lsqip/internal/event/IapEvent$CardEntry$NonceError;", "Lsqip/internal/event/IapEvent$CardEntry$NonceReceived;", "Lsqip/internal/event/IapEvent$CardEntry$Started;", "Lsqip/internal/event/IapEvent$CardEntry$Submit;", "Lsqip/internal/event/IapEvent$CardEntry$Success;", "Lsqip/internal/event/IapEvent$CardEntry$ValidationError;", "sqip_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class CardEntry extends IapEvent {
        private final String appErrorMessage;
        private final String nonceErrorCode;
        private final String validationErrorField;

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lsqip/internal/event/IapEvent$CardEntry$AppError;", "Lsqip/internal/event/IapEvent$CardEntry;", "errorMessage", "", "(Ljava/lang/String;)V", "sqip_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class AppError extends CardEntry {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AppError(String str) {
                super(null, null, str, 3, null);
                str.getClass();
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lsqip/internal/event/IapEvent$CardEntry$Cancel;", "Lsqip/internal/event/IapEvent$CardEntry;", "()V", "sqip_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Cancel extends CardEntry {
            public static final Cancel INSTANCE = new Cancel();

            private Cancel() {
                super(null, null, null, 7, null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lsqip/internal/event/IapEvent$CardEntry$ConfigurationChange;", "Lsqip/internal/event/IapEvent$CardEntry;", "()V", "sqip_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class ConfigurationChange extends CardEntry {
            public static final ConfigurationChange INSTANCE = new ConfigurationChange();

            private ConfigurationChange() {
                super(null, null, null, 7, null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lsqip/internal/event/IapEvent$CardEntry$NonceBackgroundHandling;", "Lsqip/internal/event/IapEvent$CardEntry;", "()V", "sqip_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class NonceBackgroundHandling extends CardEntry {
            public static final NonceBackgroundHandling INSTANCE = new NonceBackgroundHandling();

            private NonceBackgroundHandling() {
                super(null, null, null, 7, null);
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lsqip/internal/event/IapEvent$CardEntry$NonceError;", "Lsqip/internal/event/IapEvent$CardEntry;", "errorCode", "", "(Ljava/lang/String;)V", "sqip_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class NonceError extends CardEntry {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public NonceError(String str) {
                super(null, str, null, 5, null);
                str.getClass();
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lsqip/internal/event/IapEvent$CardEntry$NonceReceived;", "Lsqip/internal/event/IapEvent$CardEntry;", "()V", "sqip_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class NonceReceived extends CardEntry {
            public static final NonceReceived INSTANCE = new NonceReceived();

            private NonceReceived() {
                super(null, null, null, 7, null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lsqip/internal/event/IapEvent$CardEntry$Started;", "Lsqip/internal/event/IapEvent$CardEntry;", "()V", "sqip_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Started extends CardEntry {
            public static final Started INSTANCE = new Started();

            private Started() {
                super(null, null, null, 7, null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lsqip/internal/event/IapEvent$CardEntry$Submit;", "Lsqip/internal/event/IapEvent$CardEntry;", "()V", "sqip_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Submit extends CardEntry {
            public static final Submit INSTANCE = new Submit();

            private Submit() {
                super(null, null, null, 7, null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lsqip/internal/event/IapEvent$CardEntry$Success;", "Lsqip/internal/event/IapEvent$CardEntry;", "()V", "sqip_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Success extends CardEntry {
            public static final Success INSTANCE = new Success();

            private Success() {
                super(null, null, null, 7, null);
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lsqip/internal/event/IapEvent$CardEntry$ValidationError;", "Lsqip/internal/event/IapEvent$CardEntry;", "field", "", "(Ljava/lang/String;)V", "sqip_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class ValidationError extends CardEntry {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ValidationError(String str) {
                super(str, null, null, 6, null);
                str.getClass();
            }
        }

        private CardEntry(String str, String str2, String str3) {
            super(RealCreateCardNonceRequestHandler.DEBUG_CODE_PREFIX, null, null, null, null, 0, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, 0L, 4194302, null);
            this.validationErrorField = str;
            this.nonceErrorCode = str2;
            this.appErrorMessage = str3;
        }

        @Override // sqip.internal.event.IapEvent
        public String getAppErrorMessage() {
            return this.appErrorMessage;
        }

        @Override // sqip.internal.event.IapEvent
        public String getNonceErrorCode() {
            return this.nonceErrorCode;
        }

        @Override // sqip.internal.event.IapEvent
        public String getValidationErrorField() {
            return this.validationErrorField;
        }

        public /* synthetic */ CardEntry(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, null);
        }

        public /* synthetic */ CardEntry(String str, String str2, String str3, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3);
        }
    }

    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\t/01234567BÕ\u0001\b\u0004\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0017¢\u0006\u0002\u0010\u0018R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u000b\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001cR\u0016\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001cR\u0016\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001cR\u0016\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001cR\u0014\u0010\r\u001a\u00020\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001cR\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001cR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001cR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001cR\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001cR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001cR\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001cR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001cR\u0014\u0010\f\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001aR\u0014\u0010\u0016\u001a\u00020\u0017X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.\u0082\u0001\t89:;<=>?@¨\u0006A"}, d2 = {"Lsqip/internal/event/IapEvent$BuyerVerification;", "Lsqip/internal/event/IapEvent;", "buyerAction", "", "amount", "", AppsFlyerProperties.CURRENCY_CODE, "locationId", "emptyContactFields", "errorCode", "errorDescription", "challengesCompleted", "totalChallenges", "hasChallengedUser", "", "threeDSTransactionStatus", "threeDSServerTransactionID", "threeDSWarningSeverity", "threeDSWarningCode", "threeDSWarningDescription", "threeDSChallengeType", "threeDSVerificationToken", "verificationDuration", "", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V", "getAmount", "()I", "getBuyerAction", "()Ljava/lang/String;", "getChallengesCompleted", "getCurrencyCode", "getEmptyContactFields", "getErrorCode", "getErrorDescription", "getHasChallengedUser", "()Z", "getLocationId", "getThreeDSChallengeType", "getThreeDSServerTransactionID", "getThreeDSTransactionStatus", "getThreeDSVerificationToken", "getThreeDSWarningCode", "getThreeDSWarningDescription", "getThreeDSWarningSeverity", "getTotalChallenges", "getVerificationDuration", "()J", "BuyerVerificationCancel", "BuyerVerificationChallengePending", "BuyerVerificationError", "BuyerVerificationStarted", "BuyerVerificationSuccess", "ThreeDSAuthenticationRequestCompleted", "ThreeDSChallengeCompleted", "ThreeDSError", "ThreeDSSecurityWarning", "Lsqip/internal/event/IapEvent$BuyerVerification$BuyerVerificationCancel;", "Lsqip/internal/event/IapEvent$BuyerVerification$BuyerVerificationChallengePending;", "Lsqip/internal/event/IapEvent$BuyerVerification$BuyerVerificationError;", "Lsqip/internal/event/IapEvent$BuyerVerification$BuyerVerificationStarted;", "Lsqip/internal/event/IapEvent$BuyerVerification$BuyerVerificationSuccess;", "Lsqip/internal/event/IapEvent$BuyerVerification$ThreeDSAuthenticationRequestCompleted;", "Lsqip/internal/event/IapEvent$BuyerVerification$ThreeDSChallengeCompleted;", "Lsqip/internal/event/IapEvent$BuyerVerification$ThreeDSError;", "Lsqip/internal/event/IapEvent$BuyerVerification$ThreeDSSecurityWarning;", "sqip_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class BuyerVerification extends IapEvent {
        private final int amount;
        private final String buyerAction;
        private final int challengesCompleted;
        private final String currencyCode;
        private final String emptyContactFields;
        private final String errorCode;
        private final String errorDescription;
        private final boolean hasChallengedUser;
        private final String locationId;
        private final String threeDSChallengeType;
        private final String threeDSServerTransactionID;
        private final String threeDSTransactionStatus;
        private final String threeDSVerificationToken;
        private final String threeDSWarningCode;
        private final String threeDSWarningDescription;
        private final String threeDSWarningSeverity;
        private final int totalChallenges;
        private final long verificationDuration;

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lsqip/internal/event/IapEvent$BuyerVerification$BuyerVerificationCancel;", "Lsqip/internal/event/IapEvent$BuyerVerification;", "time", "", "(J)V", "sqip_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class BuyerVerificationCancel extends BuyerVerification {
            public BuyerVerificationCancel(long j) {
                super(null, 0, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, j, 131071, null);
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"Lsqip/internal/event/IapEvent$BuyerVerification$BuyerVerificationChallengePending;", "Lsqip/internal/event/IapEvent$BuyerVerification;", "challengesCompleted", "", "totalChallenges", "(II)V", "sqip_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class BuyerVerificationChallengePending extends BuyerVerification {
            public BuyerVerificationChallengePending(int i, int i2) {
                super(null, 0, null, null, null, null, null, i, i2, false, null, null, null, null, null, null, null, 0L, 261759, null);
            }
        }

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"Lsqip/internal/event/IapEvent$BuyerVerification$BuyerVerificationError;", "Lsqip/internal/event/IapEvent$BuyerVerification;", "code", "", "description", "time", "", "(Ljava/lang/String;Ljava/lang/String;J)V", "sqip_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class BuyerVerificationError extends BuyerVerification {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public BuyerVerificationError(String str, String str2, long j) {
                super(null, 0, null, null, null, str, str2, 0, 0, false, null, null, null, null, null, null, null, j, 130975, null);
                str.getClass();
                str2.getClass();
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"Lsqip/internal/event/IapEvent$BuyerVerification$BuyerVerificationStarted;", "Lsqip/internal/event/IapEvent$BuyerVerification;", "buyerAction", "", "amount", "", "currency", "locationId", "emptyContactFields", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "sqip_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class BuyerVerificationStarted extends BuyerVerification {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public BuyerVerificationStarted(String str, int i, String str2, String str3, String str4) {
                super(str, i, str2, str3, str4, null, null, 0, 0, false, null, null, null, null, null, null, null, 0L, 262112, null);
                str.getClass();
                str4.getClass();
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lsqip/internal/event/IapEvent$BuyerVerification$BuyerVerificationSuccess;", "Lsqip/internal/event/IapEvent$BuyerVerification;", "hasChallengedUser", "", "duration", "", "(ZJ)V", "sqip_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class BuyerVerificationSuccess extends BuyerVerification {
            public BuyerVerificationSuccess(boolean z, long j) {
                super(null, 0, null, null, null, null, null, 0, 0, z, null, null, null, null, null, null, null, j, 130559, null);
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"Lsqip/internal/event/IapEvent$BuyerVerification$ThreeDSAuthenticationRequestCompleted;", "Lsqip/internal/event/IapEvent$BuyerVerification;", "status", "", "challengeType", "verificationToken", "serverTransId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "sqip_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class ThreeDSAuthenticationRequestCompleted extends BuyerVerification {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ThreeDSAuthenticationRequestCompleted(String str, String str2, String str3, String str4) {
                super(null, 0, null, null, null, null, null, 0, 0, false, str, str4, null, null, null, str2, str3, 0L, 160767, null);
                Request$Priority$EnumUnboxingLocalUtility.m(str, str2, str3, str4);
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"Lsqip/internal/event/IapEvent$BuyerVerification$ThreeDSChallengeCompleted;", "Lsqip/internal/event/IapEvent$BuyerVerification;", "status", "", "challengeType", "verificationToken", "serverTransId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "sqip_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class ThreeDSChallengeCompleted extends BuyerVerification {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ThreeDSChallengeCompleted(String str, String str2, String str3, String str4) {
                super(null, 0, null, null, null, null, null, 0, 0, false, str, str4, null, null, null, str2, str3, 0L, 160767, null);
                Request$Priority$EnumUnboxingLocalUtility.m(str, str2, str3, str4);
            }
        }

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"Lsqip/internal/event/IapEvent$BuyerVerification$ThreeDSError;", "Lsqip/internal/event/IapEvent$BuyerVerification;", "code", "", "description", "verificationDuration", "", "verificationToken", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V", "sqip_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class ThreeDSError extends BuyerVerification {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ThreeDSError(String str, String str2, long j, String str3) {
                super(null, 0, null, null, null, str, str2, 0, 0, false, null, null, null, null, null, null, str3, j, 65439, null);
                str.getClass();
                str3.getClass();
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lsqip/internal/event/IapEvent$BuyerVerification$ThreeDSSecurityWarning;", "Lsqip/internal/event/IapEvent$BuyerVerification;", "warningCode", "", "warningDescription", "warningSeverity", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "sqip_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class ThreeDSSecurityWarning extends BuyerVerification {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ThreeDSSecurityWarning(String str, String str2, String str3) {
                super(null, 0, null, null, null, null, null, 0, 0, false, null, null, str3, str, str2, null, null, 0L, 233471, null);
                str.getClass();
                str3.getClass();
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ BuyerVerification(String str, int i, String str2, String str3, String str4, String str5, String str6, int i2, int i3, boolean z, String str7, String str8, String str9, String str10, String str11, String str12, String str13, long j, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this(r1, r3, r5, r6, r7, r8, r9, r10, r4, (i4 & 512) != 0 ? false : z, (i4 & 1024) != 0 ? null : str7, (i4 & 2048) != 0 ? null : str8, (i4 & 4096) != 0 ? null : str9, (i4 & PKIFailureInfo.certRevoked) != 0 ? null : str10, (i4 & 16384) != 0 ? null : str11, (i4 & 32768) != 0 ? null : str12, (i4 & 65536) != 0 ? null : str13, (i4 & PKIFailureInfo.unsupportedVersion) != 0 ? -1L : j, null);
            String str14 = (i4 & 1) != 0 ? null : str;
            int i5 = (i4 & 2) != 0 ? -1 : i;
            String str15 = (i4 & 4) != 0 ? null : str2;
            String str16 = (i4 & 8) != 0 ? null : str3;
            String str17 = (i4 & 16) != 0 ? null : str4;
            String str18 = (i4 & 32) != 0 ? null : str5;
            String str19 = (i4 & 64) != 0 ? null : str6;
            int i6 = (i4 & 128) != 0 ? -1 : i2;
            int i7 = (i4 & 256) == 0 ? i3 : -1;
        }

        @Override // sqip.internal.event.IapEvent
        public int getAmount() {
            return this.amount;
        }

        @Override // sqip.internal.event.IapEvent
        public String getBuyerAction() {
            return this.buyerAction;
        }

        @Override // sqip.internal.event.IapEvent
        public int getChallengesCompleted() {
            return this.challengesCompleted;
        }

        @Override // sqip.internal.event.IapEvent
        public String getCurrencyCode() {
            return this.currencyCode;
        }

        @Override // sqip.internal.event.IapEvent
        public String getEmptyContactFields() {
            return this.emptyContactFields;
        }

        @Override // sqip.internal.event.IapEvent
        public String getErrorCode() {
            return this.errorCode;
        }

        @Override // sqip.internal.event.IapEvent
        public String getErrorDescription() {
            return this.errorDescription;
        }

        @Override // sqip.internal.event.IapEvent
        public boolean getHasChallengedUser() {
            return this.hasChallengedUser;
        }

        @Override // sqip.internal.event.IapEvent
        public String getLocationId() {
            return this.locationId;
        }

        @Override // sqip.internal.event.IapEvent
        public String getThreeDSChallengeType() {
            return this.threeDSChallengeType;
        }

        @Override // sqip.internal.event.IapEvent
        public String getThreeDSServerTransactionID() {
            return this.threeDSServerTransactionID;
        }

        @Override // sqip.internal.event.IapEvent
        public String getThreeDSTransactionStatus() {
            return this.threeDSTransactionStatus;
        }

        @Override // sqip.internal.event.IapEvent
        public String getThreeDSVerificationToken() {
            return this.threeDSVerificationToken;
        }

        @Override // sqip.internal.event.IapEvent
        public String getThreeDSWarningCode() {
            return this.threeDSWarningCode;
        }

        @Override // sqip.internal.event.IapEvent
        public String getThreeDSWarningDescription() {
            return this.threeDSWarningDescription;
        }

        @Override // sqip.internal.event.IapEvent
        public String getThreeDSWarningSeverity() {
            return this.threeDSWarningSeverity;
        }

        @Override // sqip.internal.event.IapEvent
        public int getTotalChallenges() {
            return this.totalChallenges;
        }

        @Override // sqip.internal.event.IapEvent
        public long getVerificationDuration() {
            return this.verificationDuration;
        }

        public /* synthetic */ BuyerVerification(String str, int i, String str2, String str3, String str4, String str5, String str6, int i2, int i3, boolean z, String str7, String str8, String str9, String str10, String str11, String str12, String str13, long j, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, str2, str3, str4, str5, str6, i2, i3, z, str7, str8, str9, str10, str11, str12, str13, j);
        }

        private BuyerVerification(String str, int i, String str2, String str3, String str4, String str5, String str6, int i2, int i3, boolean z, String str7, String str8, String str9, String str10, String str11, String str12, String str13, long j) {
            super("buyer_verification", null, null, null, null, 0, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, 0L, 4194302, null);
            this.buyerAction = str;
            this.amount = i;
            this.currencyCode = str2;
            this.locationId = str3;
            this.emptyContactFields = str4;
            this.errorCode = str5;
            this.errorDescription = str6;
            this.challengesCompleted = i2;
            this.totalChallenges = i3;
            this.hasChallengedUser = z;
            this.threeDSTransactionStatus = str7;
            this.threeDSServerTransactionID = str8;
            this.threeDSWarningSeverity = str9;
            this.threeDSWarningCode = str10;
            this.threeDSWarningDescription = str11;
            this.threeDSChallengeType = str12;
            this.threeDSVerificationToken = str13;
            this.verificationDuration = j;
        }
    }

    private IapEvent(String str, String str2, String str3, String str4, String str5, int i, String str6, String str7, String str8, String str9, String str10, int i2, int i3, boolean z, String str11, String str12, String str13, String str14, String str15, String str16, String str17, long j) {
        this.flowType = str;
        this.validationErrorField = str2;
        this.nonceErrorCode = str3;
        this.appErrorMessage = str4;
        this.buyerAction = str5;
        this.amount = i;
        this.currencyCode = str6;
        this.locationId = str7;
        this.emptyContactFields = str8;
        this.errorCode = str9;
        this.errorDescription = str10;
        this.challengesCompleted = i2;
        this.totalChallenges = i3;
        this.hasChallengedUser = z;
        this.threeDSTransactionStatus = str11;
        this.threeDSServerTransactionID = str12;
        this.threeDSWarningSeverity = str13;
        this.threeDSWarningCode = str14;
        this.threeDSWarningDescription = str15;
        this.threeDSChallengeType = str16;
        this.threeDSVerificationToken = str17;
        this.verificationDuration = j;
    }

    public /* synthetic */ IapEvent(String str, String str2, String str3, String str4, String str5, int i, String str6, String str7, String str8, String str9, String str10, int i2, int i3, boolean z, String str11, String str12, String str13, String str14, String str15, String str16, String str17, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, i, str6, str7, str8, str9, str10, i2, i3, z, str11, str12, str13, str14, str15, str16, str17, j);
    }
}
