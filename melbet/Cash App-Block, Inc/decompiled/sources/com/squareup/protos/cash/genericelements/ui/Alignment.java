package com.squareup.protos.cash.genericelements.ui;

import com.squareup.protos.cash.cashliteorchestrator.api.v1.OperationType;
import com.squareup.protos.cash.cashstorefronts.api.BusinessType;
import com.squareup.protos.cash.cashsuggest.api.OfferSheetKey;
import com.squareup.protos.cash.discover.api.app.v1.model.HorizontalAlignment;
import com.squareup.protos.cash.discover.api.app.v1.model.TileSection;
import com.squareup.protos.cash.genericelements.ui.ArcadeTextElement;
import com.squareup.protos.cash.genericelements.ui.ContainerElement;
import com.squareup.protos.cash.grantly.api.Grant;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum Alignment implements WireEnum {
    LEFT(1),
    RIGHT(2),
    CENTER(3),
    JUSTIFY(4);

    public final int value;
    public static final Companion Companion = new Companion();
    public static final Alignment$Companion$ADAPTER$1 ADAPTER = new Alignment$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Alignment.class), Syntax.PROTO_2, null);

    Alignment(int i) {
        this.value = i;
    }

    public static final Alignment fromValue(int i) {
        Companion.getClass();
        if (i == 1) {
            return LEFT;
        }
        if (i == 2) {
            return RIGHT;
        }
        if (i == 3) {
            return CENTER;
        }
        if (i != 4) {
            return null;
        }
        return JUSTIFY;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }

    public final class Companion {
        /* renamed from: fromValue, reason: collision with other method in class */
        public static ArcadeTextElement.SemanticTextColor m3861fromValue(int i) {
            switch (i) {
                case 1:
                    return ArcadeTextElement.SemanticTextColor.BRAND;
                case 2:
                    return ArcadeTextElement.SemanticTextColor.DANGER;
                case 3:
                    return ArcadeTextElement.SemanticTextColor.DISABLED;
                case 4:
                    return ArcadeTextElement.SemanticTextColor.INVERSE;
                case 5:
                    return ArcadeTextElement.SemanticTextColor.LINK;
                case 6:
                    return ArcadeTextElement.SemanticTextColor.LINK_VISITED;
                case 7:
                    return ArcadeTextElement.SemanticTextColor.PLACEHOLDER;
                case 8:
                    return ArcadeTextElement.SemanticTextColor.PROMINENT;
                case 9:
                    return ArcadeTextElement.SemanticTextColor.STANDARD;
                case 10:
                    return ArcadeTextElement.SemanticTextColor.SUBTLE;
                case 11:
                    return ArcadeTextElement.SemanticTextColor.SUCCESS;
                case 12:
                    return ArcadeTextElement.SemanticTextColor.WARNING;
                default:
                    return null;
            }
        }

        /* renamed from: fromValue, reason: collision with other method in class */
        public static BusinessType m3857fromValue(int i) {
            if (i == 0) {
                return BusinessType.UNKNOWN_BUSINESS_TYPE;
            }
            if (i == 1) {
                return BusinessType.AP_STORE;
            }
            if (i == 2) {
                return BusinessType.BOOST_MERCHANT;
            }
            if (i == 3) {
                return BusinessType.CAP_MERCHANT;
            }
            if (i == 4) {
                return BusinessType.SQ_LOYALTY_MERCHANT;
            }
            if (i != 5) {
                return null;
            }
            return BusinessType.SQ_OFFER_MERCHANT;
        }

        public static OperationType fromValue(int i) {
            switch (i) {
                case 0:
                    return OperationType.OPERATION_TYPE_UNSPECIFIED;
                case 1:
                    return OperationType.OPERATION_TYPE_SAME_CHAIN_SEND;
                case 2:
                    return OperationType.OPERATION_TYPE_CROSS_CHAIN_SEND;
                case 3:
                    return OperationType.OPERATION_TYPE_RECEIVE;
                case 4:
                    return OperationType.OPERATION_TYPE_CARD_SPEND;
                case 5:
                    return OperationType.OPERATION_TYPE_LITE_P2P_SEND;
                case 6:
                    return OperationType.OPERATION_TYPE_CROSS_CHAIN_RECEIVE;
                case 7:
                    return OperationType.OPERATION_TYPE_APPROVE_CARD;
                case 8:
                    return OperationType.OPERATION_TYPE_REVOKE_CARD;
                case 9:
                    return OperationType.OPERATION_TYPE_SWAP;
                default:
                    return null;
            }
        }

        /* renamed from: fromValue, reason: collision with other method in class */
        public static OfferSheetKey.PresentingContext m3858fromValue(int i) {
            switch (i) {
                case 0:
                    return OfferSheetKey.PresentingContext.DEFAULT;
                case 1:
                    return OfferSheetKey.PresentingContext.OFFERS_BROWSE;
                case 2:
                    return OfferSheetKey.PresentingContext.OFFERS_SEARCH;
                case 3:
                    return OfferSheetKey.PresentingContext.MERCHANT_PROFILE;
                case 4:
                    return OfferSheetKey.PresentingContext.DISCOVER;
                case 5:
                    return OfferSheetKey.PresentingContext.IN_APP_BROWSER;
                case 6:
                    return OfferSheetKey.PresentingContext.CARD_TAB;
                case 7:
                    return OfferSheetKey.PresentingContext.ACTIVITY_TAB;
                case 8:
                default:
                    return null;
                case 9:
                    return OfferSheetKey.PresentingContext.AP_APPLET_BROWSE;
                case 10:
                    return OfferSheetKey.PresentingContext.AP_APPLET_SEARCH;
            }
        }

        /* renamed from: fromValue, reason: collision with other method in class */
        public static TileSection.ElementPlacement m3860fromValue(int i) {
            if (i == 0) {
                return TileSection.ElementPlacement.ELEMENT_PLACEMENT_UNSPECIFIED;
            }
            if (i == 1) {
                return TileSection.ElementPlacement.ELEMENT_PLACEMENT_TOP_LEFT;
            }
            if (i == 2) {
                return TileSection.ElementPlacement.ELEMENT_PLACEMENT_BOTTOM_LEFT;
            }
            if (i == 3) {
                return TileSection.ElementPlacement.ELEMENT_PLACEMENT_TOP_RIGHT;
            }
            if (i != 4) {
                return null;
            }
            return TileSection.ElementPlacement.ELEMENT_PLACEMENT_BOTTOM_RIGHT;
        }

        /* renamed from: fromValue, reason: collision with other method in class */
        public static ContainerElement.Margin.MarginSize m3862fromValue(int i) {
            if (i == 1) {
                return ContainerElement.Margin.MarginSize.SMALL;
            }
            if (i == 2) {
                return ContainerElement.Margin.MarginSize.MEDIUM;
            }
            if (i == 3) {
                return ContainerElement.Margin.MarginSize.LARGE;
            }
            if (i == 4) {
                return ContainerElement.Margin.MarginSize.PROFILE;
            }
            if (i != 5) {
                return null;
            }
            return ContainerElement.Margin.MarginSize.XLARGE;
        }

        /* renamed from: fromValue, reason: collision with other method in class */
        public static HorizontalAlignment m3859fromValue(int i) {
            if (i == 1) {
                return HorizontalAlignment.LEFT;
            }
            if (i == 2) {
                return HorizontalAlignment.CENTER;
            }
            if (i != 3) {
                return null;
            }
            return HorizontalAlignment.RIGHT;
        }

        /* renamed from: fromValue, reason: collision with other method in class */
        public static Grant.AppData.Type m3863fromValue(int i) {
            switch (i) {
                case 1:
                    return Grant.AppData.Type.MERBRO_PREAUTHORIZATION;
                case 2:
                    return Grant.AppData.Type.MERBRO_IN_TRANSACTION_TOP_UP;
                case 3:
                    return Grant.AppData.Type.INTERNALLY_CREATED_ORDER;
                case 4:
                    return Grant.AppData.Type.SANDBOX_METADATA;
                case 5:
                    return Grant.AppData.Type.MANAGED_CUSTOMER_REQUEST_FLOW;
                case 6:
                    return Grant.AppData.Type.DYNAMIC_GRANT_APPROVAL_METADATA;
                case 7:
                    return Grant.AppData.Type.RISK_METADATA;
                case 8:
                    return Grant.AppData.Type.OAUTH_APP_DATA;
                case 9:
                    return Grant.AppData.Type.SECURITY_LOCK_METADATA;
                default:
                    return null;
            }
        }
    }
}
