package com.squareup.cash.userjourneys.tracker;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import okhttp3.internal.Tags;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\"\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$¨\u0006%"}, d2 = {"com/squareup/cash/userjourneys/tracker/UserJourney$Name", "", "Lcom/squareup/cash/userjourneys/tracker/UserJourney$Name;", "", AnnotatedPrivateKey.LABEL, "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getLabel", "()Ljava/lang/String;", "LOGIN", "CASH_TAG_PROVISIONING", "BITCOIN_BUY", "BITCOIN_SELL", "SEND_MONEY", "REQUEST_MONEY", "STOCK_BUY", "STOCK_SALE", "IDENTITY_VERIFICATION", "ADD_MONEY", "WITHDRAW_MONEY", "OPEN_THE_APP", "SAVINGS_TRANSFER_IN", "SAVINGS_TRANSFER_OUT", "SAM_ACCOUNT_LINKING", "MINT_TAG_LOCK", "MINT_PRODUCT_DETAIL", "MONEYBOT_CHAT", "LINK_INSTRUMENT", "TEEN_LED_SPONSORSHIP_REQUEST", "NEIGHBORHOODS_CREATE_ORDER", "CONTROL_SPENDING", "VIEW_PAPER_MONEY_DEPOSIT_BARCODE", "SEND_MONEY_OON", "OPEN_DEEP_LINK", "NEARBY_PAYMENT", "INITIATE_DISPUTE_CLAIM", "api"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class UserJourney$Name {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ UserJourney$Name[] $VALUES;
    private final String label;
    public static final UserJourney$Name LOGIN = new UserJourney$Name("LOGIN", 0, "login");
    public static final UserJourney$Name CASH_TAG_PROVISIONING = new UserJourney$Name("CASH_TAG_PROVISIONING", 1, "cash-tag-provisioning");
    public static final UserJourney$Name BITCOIN_BUY = new UserJourney$Name("BITCOIN_BUY", 2, "bitcoin-buy");
    public static final UserJourney$Name BITCOIN_SELL = new UserJourney$Name("BITCOIN_SELL", 3, "bitcoin-sell");
    public static final UserJourney$Name SEND_MONEY = new UserJourney$Name("SEND_MONEY", 4, "send-money");
    public static final UserJourney$Name REQUEST_MONEY = new UserJourney$Name("REQUEST_MONEY", 5, "request-money");
    public static final UserJourney$Name STOCK_BUY = new UserJourney$Name("STOCK_BUY", 6, "stock-buy");
    public static final UserJourney$Name STOCK_SALE = new UserJourney$Name("STOCK_SALE", 7, "stock-sale");
    public static final UserJourney$Name IDENTITY_VERIFICATION = new UserJourney$Name("IDENTITY_VERIFICATION", 8, "identity-verification");
    public static final UserJourney$Name ADD_MONEY = new UserJourney$Name("ADD_MONEY", 9, "add-money");
    public static final UserJourney$Name WITHDRAW_MONEY = new UserJourney$Name("WITHDRAW_MONEY", 10, "withdraw-money");
    public static final UserJourney$Name OPEN_THE_APP = new UserJourney$Name("OPEN_THE_APP", 11, "open-the-app");
    public static final UserJourney$Name SAVINGS_TRANSFER_IN = new UserJourney$Name("SAVINGS_TRANSFER_IN", 12, "savings-transfer-in");
    public static final UserJourney$Name SAVINGS_TRANSFER_OUT = new UserJourney$Name("SAVINGS_TRANSFER_OUT", 13, "savings-transfer-out");
    public static final UserJourney$Name SAM_ACCOUNT_LINKING = new UserJourney$Name("SAM_ACCOUNT_LINKING", 14, "sam-account-linking");
    public static final UserJourney$Name MINT_TAG_LOCK = new UserJourney$Name("MINT_TAG_LOCK", 15, "mint-tag-lock");
    public static final UserJourney$Name MINT_PRODUCT_DETAIL = new UserJourney$Name("MINT_PRODUCT_DETAIL", 16, "mint-product-detail");
    public static final UserJourney$Name MONEYBOT_CHAT = new UserJourney$Name("MONEYBOT_CHAT", 17, "moneybot-chat");
    public static final UserJourney$Name LINK_INSTRUMENT = new UserJourney$Name("LINK_INSTRUMENT", 18, "link-instrument");
    public static final UserJourney$Name TEEN_LED_SPONSORSHIP_REQUEST = new UserJourney$Name("TEEN_LED_SPONSORSHIP_REQUEST", 19, "teen-led-sponsorship-request");
    public static final UserJourney$Name NEIGHBORHOODS_CREATE_ORDER = new UserJourney$Name("NEIGHBORHOODS_CREATE_ORDER", 20, "neighborhoods-create-order");
    public static final UserJourney$Name CONTROL_SPENDING = new UserJourney$Name("CONTROL_SPENDING", 21, "control-spending");
    public static final UserJourney$Name VIEW_PAPER_MONEY_DEPOSIT_BARCODE = new UserJourney$Name("VIEW_PAPER_MONEY_DEPOSIT_BARCODE", 22, "view-paper-money-deposit-barcode");
    public static final UserJourney$Name SEND_MONEY_OON = new UserJourney$Name("SEND_MONEY_OON", 23, "send-money-oon");
    public static final UserJourney$Name OPEN_DEEP_LINK = new UserJourney$Name("OPEN_DEEP_LINK", 24, "open-deep-link");
    public static final UserJourney$Name NEARBY_PAYMENT = new UserJourney$Name("NEARBY_PAYMENT", 25, "nearby-payment");
    public static final UserJourney$Name INITIATE_DISPUTE_CLAIM = new UserJourney$Name("INITIATE_DISPUTE_CLAIM", 26, "initiate-dispute-claim");

    private static final /* synthetic */ UserJourney$Name[] $values() {
        return new UserJourney$Name[]{LOGIN, CASH_TAG_PROVISIONING, BITCOIN_BUY, BITCOIN_SELL, SEND_MONEY, REQUEST_MONEY, STOCK_BUY, STOCK_SALE, IDENTITY_VERIFICATION, ADD_MONEY, WITHDRAW_MONEY, OPEN_THE_APP, SAVINGS_TRANSFER_IN, SAVINGS_TRANSFER_OUT, SAM_ACCOUNT_LINKING, MINT_TAG_LOCK, MINT_PRODUCT_DETAIL, MONEYBOT_CHAT, LINK_INSTRUMENT, TEEN_LED_SPONSORSHIP_REQUEST, NEIGHBORHOODS_CREATE_ORDER, CONTROL_SPENDING, VIEW_PAPER_MONEY_DEPOSIT_BARCODE, SEND_MONEY_OON, OPEN_DEEP_LINK, NEARBY_PAYMENT, INITIATE_DISPUTE_CLAIM};
    }

    static {
        UserJourney$Name[] $values = $values();
        $VALUES = $values;
        $ENTRIES = Tags.enumEntries($values);
    }

    private UserJourney$Name(String str, int i, String str2) {
        this.label = str2;
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static UserJourney$Name valueOf(String str) {
        return (UserJourney$Name) Enum.valueOf(UserJourney$Name.class, str);
    }

    public static UserJourney$Name[] values() {
        return (UserJourney$Name[]) $VALUES.clone();
    }

    public final String getLabel() {
        return this.label;
    }
}
