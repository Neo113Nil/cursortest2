package com.squareup.protos.cash.grantly.api;

import com.squareup.protos.cash.cashoauth.apiProto.Scope;
import com.squareup.protos.cash.cashstorefronts.api.Feature;
import com.squareup.protos.cash.cashsuggest.api.CreditLineType;
import com.squareup.protos.cash.discover.api.app.v1.model.Button;
import com.squareup.protos.cash.discover.api.app.v1.model.PlaceholderSection;
import com.squareup.protos.cash.genericelements.ui.ArcadeTextElement;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum Channel implements WireEnum {
    IN_PERSON(1),
    ONLINE(2),
    IN_APP(3);

    public final int value;
    public static final Companion Companion = new Companion();
    public static final Channel$Companion$ADAPTER$1 ADAPTER = new Channel$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Channel.class), Syntax.PROTO_2, null);

    Channel(int i) {
        this.value = i;
    }

    public static final Channel fromValue(int i) {
        Companion.getClass();
        if (i == 1) {
            return IN_PERSON;
        }
        if (i == 2) {
            return ONLINE;
        }
        if (i != 3) {
            return null;
        }
        return IN_APP;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }

    public final class Companion {
        public static Scope fromValue(int i) {
            switch (i) {
                case 1:
                    return Scope.API_KEYS_READ;
                case 2:
                    return Scope.API_KEYS_WRITE;
                case 3:
                    return Scope.BRANDS_READ;
                case 4:
                    return Scope.BRANDS_WRITE;
                case 5:
                    return Scope.CUSTOMERS_READ;
                case 6:
                    return Scope.DISPUTES_READ;
                case 7:
                    return Scope.DISPUTES_WRITE;
                case 8:
                    return Scope.GRANTS_READ;
                case 9:
                    return Scope.GRANTS_WRITE;
                case 10:
                    return Scope.MERCHANTS_READ;
                case 11:
                    return Scope.MERCHANTS_WRITE;
                case 12:
                    return Scope.PAYMENTS_READ;
                case 13:
                    return Scope.PAYMENTS_WRITE;
                case 14:
                    return Scope.REFUNDS_READ;
                case 15:
                    return Scope.REFUNDS_WRITE;
                case 16:
                    return Scope.WEBHOOK_CONFIG_READ;
                case 17:
                    return Scope.WEBHOOK_CONFIG_WRITE;
                case 18:
                    return Scope.WEBHOOK_EVENTS_READ;
                case 19:
                    return Scope.OFFERS_WRITE;
                case 20:
                    return Scope.OFFERS_READ;
                case 21:
                    return Scope.ORDERS_WRITE;
                case 22:
                    return Scope.ORDERS_READ;
                case 23:
                    return Scope.MESSAGES_WRITE;
                case 24:
                    return Scope.MESSAGES_READ;
                case 25:
                    return Scope.FEE_PLANS_READ;
                case 26:
                    return Scope.BTC_WITHDRAWALS_WRITE;
                case 27:
                    return Scope.BTC_WITHDRAWALS_READ;
                case 28:
                    return Scope.DEPOSITS_READ;
                case 29:
                    return Scope.DEPOSITS_WRITE;
                case 30:
                    return Scope.BANK_ACCOUNTS_READ;
                case 31:
                    return Scope.BANK_ACCOUNTS_WRITE;
                case 32:
                    return Scope.SETTLEMENT_CONFIGURATIONS_READ;
                case 33:
                    return Scope.SETTLEMENT_CONFIGURATIONS_WRITE;
                case 34:
                    return Scope.FINPLAT_ISSUING_3DS_WRITE;
                case 35:
                    return Scope.FDX_TRANSACTIONS_READ;
                case 36:
                    return Scope.FDX_ACCOUNT_BASIC_READ;
                case 37:
                    return Scope.FDX_ACCOUNT_DETAILED_READ;
                case 38:
                    return Scope.CUSTOMER_PROFILE_READ;
                case 39:
                    return Scope.FDX_CUSTOMER_CONTACT_READ;
                case 40:
                    return Scope.FDX_CUSTOMER_PERSONAL_READ;
                case 41:
                    return Scope.PAYOUTS_READ;
                case 42:
                    return Scope.PAYOUTS_WRITE;
                case 43:
                    return Scope.OPENID;
                case 44:
                    return Scope.FDX_STATEMENTS;
                case 45:
                    return Scope.CASH_C_TOKEN;
                case 46:
                    return Scope.FDX_TRANSACTIONS;
                case 47:
                    return Scope.CLIENT_CREATE;
                case 48:
                    return Scope.BALANCES_READ;
                case 49:
                    return Scope.CLIENT_READ;
                case 50:
                    return Scope.CLIENT_UPDATE;
                case 51:
                    return Scope.CLIENT_DELETE;
                case 52:
                    return Scope.ISSUING_ALIAS_DIRECTORY_READ;
                case 53:
                    return Scope.FDX_STATEMENTS_READ;
                case 54:
                    return Scope.FDX_RECIPIENT_CREATE;
                case 55:
                    return Scope.FDX_RECIPIENT_READ;
                case 56:
                    return Scope.FDX_RECIPIENT_UPDATE;
                case 57:
                    return Scope.FDX_RECIPIENT_DELETE;
                case 58:
                    return Scope.FDX_CONSENT_READ;
                case 59:
                    return Scope.FDX_CONSENT_REVOKE;
                case 60:
                    return Scope.AGENT_PAYMENT_REQUEST_WRITE;
                case 61:
                    return Scope.FDX_PAYMENT_SUPPORT_READ;
                default:
                    return null;
            }
        }

        /* renamed from: fromValue, reason: collision with other method in class */
        public static Feature m3869fromValue(int i) {
            switch (i) {
                case 0:
                    return Feature.UNKNOWN_FEATURE;
                case 1:
                    return Feature.CASH_APP_PAY_LATER;
                case 2:
                    return Feature.AFTERPAY_APP;
                case 3:
                    return Feature.CASH_APP_PAY_OFFER;
                case 4:
                    return Feature.CASH_CARD_BOOST;
                case 5:
                    return Feature.SQ_LOYALTY_PROGRAM;
                case 6:
                    return Feature.SQ_COUPON;
                case 7:
                    return Feature.AFTERPAY_APP_SUP;
                case 8:
                    return Feature.CASH_APP_SUP;
                case 9:
                    return Feature.AFTERPAY_APP_IN_STORE;
                case 10:
                    return Feature.AFTERPAY_APP_GIFT_CARD;
                case 11:
                    return Feature.CASH_APP_PAY;
                case 12:
                    return Feature.CASH_AP_INN;
                case 13:
                    return Feature.CASH_AP_OON;
                default:
                    return null;
            }
        }

        /* renamed from: fromValue, reason: collision with other method in class */
        public static CreditLineType m3870fromValue(int i) {
            if (i == 1) {
                return CreditLineType.INN;
            }
            if (i == 2) {
                return CreditLineType.OON;
            }
            if (i == 3) {
                return CreditLineType.ALL;
            }
            if (i == 4) {
                return CreditLineType.RETRO;
            }
            if (i != 5) {
                return null;
            }
            return CreditLineType.APCAC;
        }

        /* renamed from: fromValue, reason: collision with other method in class */
        public static PlaceholderSection.Identifier m3872fromValue(int i) {
            if (i == 1) {
                return PlaceholderSection.Identifier.CLIENT_SUGGESTIONS;
            }
            if (i == 2) {
                return PlaceholderSection.Identifier.CONTACTS_ON_CASH;
            }
            if (i == 3) {
                return PlaceholderSection.Identifier.CONTACTS_OFF_CASH;
            }
            if (i == 4) {
                return PlaceholderSection.Identifier.CARD_BOOSTS;
            }
            if (i != 5) {
                return null;
            }
            return PlaceholderSection.Identifier.BTC_PRICE_CHART;
        }

        /* renamed from: fromValue, reason: collision with other method in class */
        public static Button.ButtonStyle m3871fromValue(int i) {
            if (i == 1) {
                return Button.ButtonStyle.PRIMARY;
            }
            if (i == 2) {
                return Button.ButtonStyle.SECONDARY;
            }
            if (i == 3) {
                return Button.ButtonStyle.TERTIARY;
            }
            if (i != 4) {
                return null;
            }
            return Button.ButtonStyle.OUTLINE;
        }

        /* renamed from: fromValue, reason: collision with other method in class */
        public static ArcadeTextElement.Style m3873fromValue(int i) {
            switch (i) {
                case 1:
                    return ArcadeTextElement.Style.KEYPAD_TOTAL;
                case 2:
                    return ArcadeTextElement.Style.HERO_NUMERICS;
                case 3:
                    return ArcadeTextElement.Style.HERO;
                case 4:
                    return ArcadeTextElement.Style.HEADER;
                case 5:
                    return ArcadeTextElement.Style.KEYPAD_NUMBERS;
                case 6:
                    return ArcadeTextElement.Style.LARGE_LABEL;
                case 7:
                    return ArcadeTextElement.Style.TAB_TITLE;
                case 8:
                    return ArcadeTextElement.Style.SECTION_TITLE;
                case 9:
                    return ArcadeTextElement.Style.PAGE_TITLE;
                case 10:
                    return ArcadeTextElement.Style.LABEL;
                case 11:
                    return ArcadeTextElement.Style.BODY;
                case 12:
                    return ArcadeTextElement.Style.BODY_LINK;
                case 13:
                    return ArcadeTextElement.Style.INPUT;
                case 14:
                    return ArcadeTextElement.Style.BUTTON;
                case 15:
                    return ArcadeTextElement.Style.COMPACT_BUTTON;
                case 16:
                    return ArcadeTextElement.Style.CELL_BODY;
                case 17:
                    return ArcadeTextElement.Style.HELP_TEXT;
                case 18:
                    return ArcadeTextElement.Style.DISCLAIMER;
                case 19:
                    return ArcadeTextElement.Style.DISCLAIMER_LINK;
                case 20:
                    return ArcadeTextElement.Style.META_TEXT;
                case 21:
                    return ArcadeTextElement.Style.BADGE_LARGE_ASSET;
                case 22:
                    return ArcadeTextElement.Style.BADGE_LARGE_INLINE;
                default:
                    return null;
            }
        }
    }
}
