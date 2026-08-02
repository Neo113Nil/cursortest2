package com.squareup.protos.cash.moneymap.app;

import com.squareup.protos.cash.janus.api.CreateSecondaryPersonalAccountEntryPoint;
import com.squareup.protos.cash.janus.api.RegisterProspectTokenResponse;
import com.squareup.protos.cash.kgoosememorystore.api.v1.MemoryOrigin;
import com.squareup.protos.cash.local.client.app.v1.poscheckin.LocalPOSCheckIn;
import com.squareup.protos.cash.local.client.v1.GetEditorialResponse;
import com.squareup.protos.cash.local.client.v1.LocalIngredient;
import com.squareup.protos.cash.messagingplatformcommon.app.MoneybotSuggestionView;
import com.squareup.protos.cash.p2p.profile_directory.ui.TextStyle;
import com.squareup.protos.cash.pay.CashAppPayDisputeRenderData;
import com.squareup.protos.cash.pay.CashAppPayRefundRenderData;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class RetailerType implements WireEnum {
    public static final /* synthetic */ RetailerType[] $VALUES;
    public static final RetailerType$Companion$ADAPTER$1 ADAPTER;
    public static final Companion Companion;
    public static final RetailerType IN_NETWORK_WITHDRAWAL;

    static {
        RetailerType retailerType = new RetailerType("IN_NETWORK_WITHDRAWAL", 0);
        IN_NETWORK_WITHDRAWAL = retailerType;
        $VALUES = new RetailerType[]{retailerType};
        Companion = new Companion();
        ADAPTER = new RetailerType$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(RetailerType.class), Syntax.PROTO_2, null);
    }

    public static final RetailerType fromValue(int i) {
        Companion.getClass();
        if (i == 1) {
            return IN_NETWORK_WITHDRAWAL;
        }
        return null;
    }

    public static RetailerType valueOf(String str) {
        return (RetailerType) Enum.valueOf(RetailerType.class, str);
    }

    public static RetailerType[] values() {
        return (RetailerType[]) $VALUES.clone();
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return 1;
    }

    public final class Companion {
        public static CreateSecondaryPersonalAccountEntryPoint fromValue(int i) {
            switch (i) {
                case 0:
                    return CreateSecondaryPersonalAccountEntryPoint.CREATE_SECONDARY_PERSONAL_ACCOUNT_ENTRY_POINT_UNSPECIFIED;
                case 1:
                    return CreateSecondaryPersonalAccountEntryPoint.KYB;
                case 2:
                    return CreateSecondaryPersonalAccountEntryPoint.ACCOUNT_SWITCHER;
                case 3:
                    return CreateSecondaryPersonalAccountEntryPoint.FAMILIES;
                case 4:
                    return CreateSecondaryPersonalAccountEntryPoint.CASH_CARD;
                case 5:
                    return CreateSecondaryPersonalAccountEntryPoint.INVESTING;
                case 6:
                    return CreateSecondaryPersonalAccountEntryPoint.BTC;
                case 7:
                    return CreateSecondaryPersonalAccountEntryPoint.DDA;
                case 8:
                    return CreateSecondaryPersonalAccountEntryPoint.WIRE_TRANSFERS;
                case 9:
                    return CreateSecondaryPersonalAccountEntryPoint.BORROW;
                case 10:
                    return CreateSecondaryPersonalAccountEntryPoint.SAVINGS;
                case 11:
                    return CreateSecondaryPersonalAccountEntryPoint.TAXES;
                case 12:
                    return CreateSecondaryPersonalAccountEntryPoint.ACCOUNT_FOOTER;
                case 13:
                    return CreateSecondaryPersonalAccountEntryPoint.PAYCHECKS;
                case 14:
                    return CreateSecondaryPersonalAccountEntryPoint.MONEY_TAB;
                case 15:
                default:
                    return null;
                case 16:
                    return CreateSecondaryPersonalAccountEntryPoint.RESTRICTION_BANNER;
                case 17:
                    return CreateSecondaryPersonalAccountEntryPoint.ELIGIBILITY_FLOW;
                case 18:
                    return CreateSecondaryPersonalAccountEntryPoint.ACTIVITY_ROW_UPSELL;
            }
        }

        /* renamed from: fromValue, reason: collision with other method in class */
        public static TextStyle m3906fromValue(int i) {
            switch (i) {
                case 1:
                    return TextStyle.BIG_MONEY;
                case 2:
                    return TextStyle.HEADER_1;
                case 3:
                    return TextStyle.HEADER_2;
                case 4:
                    return TextStyle.HEADER_3;
                case 5:
                    return TextStyle.HEADER_4;
                case 6:
                    return TextStyle.INPUT;
                case 7:
                    return TextStyle.MAIN_TITLE;
                case 8:
                    return TextStyle.MAIN_BODY;
                case 9:
                    return TextStyle.SMALL_TITLE;
                case 10:
                    return TextStyle.SMALL_BODY;
                case 11:
                    return TextStyle.STRONG_CAPTION;
                case 12:
                    return TextStyle.CAPTION;
                case 13:
                    return TextStyle.IDENTIFIER;
                default:
                    return null;
            }
        }

        /* renamed from: fromValue, reason: collision with other method in class */
        public static LocalIngredient m3904fromValue(int i) {
            switch (i) {
                case 0:
                    return LocalIngredient.LOCAL_INGREDIENT_UNSPECIFIED;
                case 1:
                    return LocalIngredient.LOCAL_INGREDIENT_CELERY;
                case 2:
                    return LocalIngredient.LOCAL_INGREDIENT_CRUSTACEANS;
                case 3:
                    return LocalIngredient.LOCAL_INGREDIENT_EGGS;
                case 4:
                    return LocalIngredient.LOCAL_INGREDIENT_FISH;
                case 5:
                    return LocalIngredient.LOCAL_INGREDIENT_GLUTEN;
                case 6:
                    return LocalIngredient.LOCAL_INGREDIENT_LUPIN;
                case 7:
                    return LocalIngredient.LOCAL_INGREDIENT_MILK;
                case 8:
                    return LocalIngredient.LOCAL_INGREDIENT_MOLLUSCS;
                case 9:
                    return LocalIngredient.LOCAL_INGREDIENT_MUSTARD;
                case 10:
                    return LocalIngredient.LOCAL_INGREDIENT_PEANUTS;
                case 11:
                    return LocalIngredient.LOCAL_INGREDIENT_SESAME;
                case 12:
                    return LocalIngredient.LOCAL_INGREDIENT_SOY;
                case 13:
                    return LocalIngredient.LOCAL_INGREDIENT_SULPHITES;
                case 14:
                    return LocalIngredient.LOCAL_INGREDIENT_TREE_NUTS;
                default:
                    return null;
            }
        }

        /* renamed from: fromValue, reason: collision with other method in class */
        public static MemoryOrigin m3901fromValue(int i) {
            if (i == 0) {
                return MemoryOrigin.MEMORY_ORIGIN_UNSPECIFIED;
            }
            if (i == 1) {
                return MemoryOrigin.MEMORY_ORIGIN_SESSION_EXTRACTION;
            }
            if (i == 2) {
                return MemoryOrigin.MEMORY_ORIGIN_MCP;
            }
            if (i == 3) {
                return MemoryOrigin.MEMORY_ORIGIN_TOOLBOX;
            }
            if (i != 4) {
                return null;
            }
            return MemoryOrigin.MEMORY_ORIGIN_USER_EDIT;
        }

        /* renamed from: fromValue, reason: collision with other method in class */
        public static RegisterProspectTokenResponse.Status m3900fromValue(int i) {
            if (i == 0) {
                return RegisterProspectTokenResponse.Status.INVALID;
            }
            if (i == 1) {
                return RegisterProspectTokenResponse.Status.SUCCESS;
            }
            if (i == 2) {
                return RegisterProspectTokenResponse.Status.TOO_MANY_REQUESTS;
            }
            if (i == 3) {
                return RegisterProspectTokenResponse.Status.INVALID_ALIAS;
            }
            if (i != 4) {
                return null;
            }
            return RegisterProspectTokenResponse.Status.DUPLICATE_ALIAS;
        }

        /* renamed from: fromValue, reason: collision with other method in class */
        public static MoneybotSuggestionView.Category m3905fromValue(int i) {
            switch (i) {
                case 0:
                    return MoneybotSuggestionView.Category.CATEGORY_UNDEFINED;
                case 1:
                    return MoneybotSuggestionView.Category.CATEGORY_INVESTING;
                case 2:
                    return MoneybotSuggestionView.Category.CATEGORY_BITCOIN;
                case 3:
                    return MoneybotSuggestionView.Category.CATEGORY_P2P;
                case 4:
                    return MoneybotSuggestionView.Category.CATEGORY_SAVINGS;
                case 5:
                    return MoneybotSuggestionView.Category.CATEGORY_ACTIVITIES;
                case 6:
                    return MoneybotSuggestionView.Category.CATEGORY_MOVING_MONEY;
                case 7:
                    return MoneybotSuggestionView.Category.CATEGORY_GENERAL;
                case 8:
                    return MoneybotSuggestionView.Category.CATEGORY_SPENDING;
                case 9:
                    return MoneybotSuggestionView.Category.CATEGORY_OTHERS;
                default:
                    return null;
            }
        }

        /* renamed from: fromValue, reason: collision with other method in class */
        public static LocalPOSCheckIn.State m3902fromValue(int i) {
            if (i == 0) {
                return LocalPOSCheckIn.State.STATE_UNSPECIFIED;
            }
            if (i == 1) {
                return LocalPOSCheckIn.State.STATE_OPEN;
            }
            if (i == 2) {
                return LocalPOSCheckIn.State.STATE_IN_CHECKOUT;
            }
            if (i == 3) {
                return LocalPOSCheckIn.State.STATE_COMPLETE;
            }
            if (i != 4) {
                return null;
            }
            return LocalPOSCheckIn.State.STATE_ABANDONED;
        }

        /* renamed from: fromValue, reason: collision with other method in class */
        public static CashAppPayDisputeRenderData.DisputeReason m3907fromValue(int i) {
            switch (i) {
                case 0:
                    return CashAppPayDisputeRenderData.DisputeReason.UNKNOWN_DISPUTE_REASON;
                case 1:
                    return CashAppPayDisputeRenderData.DisputeReason.NO_KNOWLEDGE_DISPUTE_REASON;
                case 2:
                    return CashAppPayDisputeRenderData.DisputeReason.NO_KNOWLEDGE_MERCHANT_LIABLE_DISPUTE_REASON;
                case 3:
                    return CashAppPayDisputeRenderData.DisputeReason.DUPLICATE_DISPUTE_REASON;
                case 4:
                    return CashAppPayDisputeRenderData.DisputeReason.AMOUNT_DIFFERS_DISPUTE_REASON;
                case 5:
                    return CashAppPayDisputeRenderData.DisputeReason.PAID_BY_OTHER_MEANS_DISPUTE_REASON;
                case 6:
                    return CashAppPayDisputeRenderData.DisputeReason.CANCELLED_DISPUTE_REASON;
                case 7:
                    return CashAppPayDisputeRenderData.DisputeReason.NOT_AS_DESCRIBED_DISPUTE_REASON;
                case 8:
                    return CashAppPayDisputeRenderData.DisputeReason.NOT_RECEIVED_DISPUTE_REASON;
                case 9:
                    return CashAppPayDisputeRenderData.DisputeReason.CUSTOMER_REQUESTS_CREDIT_DISPUTE_REASON;
                default:
                    return null;
            }
        }

        /* renamed from: fromValue, reason: collision with other method in class */
        public static CashAppPayRefundRenderData.RefundState m3908fromValue(int i) {
            if (i == 0) {
                return CashAppPayRefundRenderData.RefundState.UNKNOWN_REFUND_STATE;
            }
            if (i == 1) {
                return CashAppPayRefundRenderData.RefundState.PENDING_REFUND_STATE;
            }
            if (i == 2) {
                return CashAppPayRefundRenderData.RefundState.COMPLETED_REFUND_STATE;
            }
            if (i == 3) {
                return CashAppPayRefundRenderData.RefundState.CANCELLED_REFUND_STATE;
            }
            if (i == 4) {
                return CashAppPayRefundRenderData.RefundState.FAILED_REFUND_STATE;
            }
            if (i != 5) {
                return null;
            }
            return CashAppPayRefundRenderData.RefundState.AUTHORIZED_REFUND_STATE;
        }

        /* renamed from: fromValue, reason: collision with other method in class */
        public static GetEditorialResponse.EditorialContent.Text.Font.Weight m3903fromValue(int i) {
            if (i == 0) {
                return GetEditorialResponse.EditorialContent.Text.Font.Weight.WEIGHT_UNSPECIFIED;
            }
            if (i == 1) {
                return GetEditorialResponse.EditorialContent.Text.Font.Weight.WEIGHT_REGULAR;
            }
            if (i == 2) {
                return GetEditorialResponse.EditorialContent.Text.Font.Weight.WEIGHT_MEDIUM;
            }
            if (i == 3) {
                return GetEditorialResponse.EditorialContent.Text.Font.Weight.WEIGHT_SEMIBOLD;
            }
            if (i != 4) {
                return null;
            }
            return GetEditorialResponse.EditorialContent.Text.Font.Weight.WEIGHT_BOLD;
        }
    }
}
