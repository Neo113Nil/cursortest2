package com.squareup.lending;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import app.cash.local.presenters.internal.CashBalanceKt;
import app.cash.local.presenters.internal.CashBannerKt;
import app.cash.local.presenters.internal.LocalBrandBannersKt;
import app.cash.local.presenters.internal.LocalMenuItemsKt;
import app.cash.local.presenters.internal.LoyaltyKt;
import app.cash.redwood.yoga.internal.detail.GlobalMembers;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.decode.ImageSource;
import coil3.decode.ImageSourceKt;
import com.google.android.gms.internal.mlkit_vision_barcode.zztc;
import com.google.android.gms.internal.mlkit_vision_common.zzjr;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.cash.idv.DisplayName;
import com.squareup.cash.lynx.api.v1_0.model.BankMetadata;
import com.squareup.cash.lynx.api.v1_0.model.BankinfoDetails;
import com.squareup.cash.lynx.api.v1_0.model.BinfoDetails;
import com.squareup.cash.lynx.api.v1_0.model.BrowserInteractionDetails;
import com.squareup.cash.lynx.api.v1_0.model.EnrichedInstrumentLink;
import com.squareup.cash.lynx.api.v1_0.model.InstrumentLink;
import com.squareup.cash.lynx.api.v1_0.model.InstrumentLinkMetadata;
import com.squareup.cash.lynx.api.v1_0.model.InstrumentLinkOwnerDetails;
import com.squareup.cash.lynx.api.v1_0.model.InstrumentVerificationDetails;
import com.squareup.cash.lynx.api.v1_0.model.StoredValueBalanceDetails;
import com.squareup.lending.sync_values.ToggleEntryPointData;
import com.squareup.protos.binfo.api.CardProduct;
import com.squareup.protos.cash.aegis.core.Section;
import com.squareup.protos.cash.balancemover.api.v1.SavingsCashInRequest;
import com.squareup.protos.cash.balancemover.api.v1.SavingsTransferContext;
import com.squareup.protos.cash.bankinfo.api.Bank$DisplaySettings;
import com.squareup.protos.cash.btcnetwork.external.BitcoinSellerLocation;
import com.squareup.protos.cash.btcnetwork.external.PaymentMethods;
import com.squareup.protos.cash.cashapproxy.api.Divider;
import com.squareup.protos.cash.cashautomationtooling.api.v1.external.DeviceContext;
import com.squareup.protos.cash.cashautomationtooling.api.v1.external.Platform;
import com.squareup.protos.cash.cashbusinesspayments.api.v1beta1.CreateWebListingPaymentResponse;
import com.squareup.protos.cash.cashlimitsxp.api.v1.GetInlineMessageResponse;
import com.squareup.protos.cash.cashsuggest.api.HorizontalAlignment;
import com.squareup.protos.cash.cashsuggest.api.OffersTabHomeResponse;
import com.squareup.protos.cash.cashsuggest.api.OffersTabSearchResponse;
import com.squareup.protos.cash.cashsuggest.api.ShopInfoResponse;
import com.squareup.protos.cash.cashtes.app.v1beta1.ReturnStatus;
import com.squareup.protos.cash.cashtes.app.v1beta1.UserData2Response;
import com.squareup.protos.cash.cryptoinvestflow.service.InitiateInstrumentSelectionRequest;
import com.squareup.protos.cash.discover.api.app.v1.model.DisplayCriteria;
import com.squareup.protos.cash.discover.api.app.v1.model.ShopInfoHalfSheet;
import com.squareup.protos.cash.genericelements.ui.Action;
import com.squareup.protos.cash.genericelements.ui.Alignment;
import com.squareup.protos.cash.genericelements.ui.AvatarElement;
import com.squareup.protos.cash.genericelements.ui.Button$TextButtonElement;
import com.squareup.protos.cash.genericelements.ui.Button$Type;
import com.squareup.protos.cash.incidentalerts.app.v1.Incident;
import com.squareup.protos.cash.investautomator.model.Automation;
import com.squareup.protos.cash.janus.api.FinishWebAuthnAuthenticationRequest;
import com.squareup.protos.cash.local.client.v1.BrandCollection;
import com.squareup.protos.cash.local.client.v1.EducationalSheet;
import com.squareup.protos.cash.local.client.v1.EducationalSheetButton;
import com.squareup.protos.cash.local.client.v1.GetBrandProfileRequest;
import com.squareup.protos.cash.local.client.v1.LocalActions;
import com.squareup.protos.cash.local.client.v1.LocalBuyer;
import com.squareup.protos.cash.local.client.v1.LocalCashMarketingContent;
import com.squareup.protos.cash.local.client.v1.LocalImage;
import com.squareup.protos.cash.local.client.v1.LocalLocationDetail;
import com.squareup.protos.cash.local.client.v1.LocalLocationLinks;
import com.squareup.protos.cash.local.client.v1.LocalLocationSummary;
import com.squareup.protos.cash.local.client.v1.LocalLoyaltyAccount;
import com.squareup.protos.cash.local.client.v1.LocalLoyaltyProgram;
import com.squareup.protos.cash.local.client.v1.LocalMenu;
import com.squareup.protos.cash.local.client.v1.LocalRelatedContent;
import com.squareup.protos.cash.local.client.v1.PreferredPaymentMethod;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.loyalizer.app.LoyaltyPromotionDetailsPlaceholder;
import com.squareup.protos.cash.messagingplatformcommon.app.AppMessageAction;
import com.squareup.protos.cash.messagingplatformcommon.app.HalfSheetMessage;
import com.squareup.protos.cash.messagingplatformcommon.app.HalfSheetMessage$VisualAsset$Image;
import com.squareup.protos.cash.messagingplatformcommon.app.ShareSheet;
import com.squareup.protos.cash.p2p.profile_directory.ui.Button;
import com.squareup.protos.cash.p2p.profile_directory.ui.Text;
import com.squareup.protos.cash.postcard.CardModule;
import com.squareup.protos.cash.shop.rendering.api.AnalyticsEvent;
import com.squareup.protos.cash.shop.rendering.api.FilterGroupSection;
import com.squareup.protos.cash.shop.rendering.api.StyledText;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.common.Money;
import com.squareup.protos.common.location.GlobalAddress;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.protos.franklin.ui.BalanceSnapshot;
import com.squareup.protos.lending.LoanRepaymentSelectionData;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.io.Serializable;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;
import squareup.cash.earnings.ActionButton;
import squareup.cash.earnings.AddPaycheckTool;
import squareup.cash.earnings.EarnerModeSheetData;
import squareup.cash.ui.arcade.elements.ListUnordered;

/* loaded from: classes7.dex */
public final class PrepurchaseCashCardAppletData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<PrepurchaseCashCardAppletData> CREATOR;
    public final LocalizedString footer_text;
    public final List info_rows;
    public final LocalizedString info_rows_header;
    public final zztc loadable_subtitle;
    public final Locale locale;
    public final PaymentPlansData payment_plans_data;
    public final LocalBrandBannersKt primary_footer_button_state;
    public final LocalMenuItemsKt secondary_footer_button_state;
    public final LocalizedString title;

    public final class FooterButtonContent extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<FooterButtonContent> CREATOR;
        public final CashBalanceKt action;
        public final Boolean should_action_dismiss_half_sheet;
        public final LocalizedString text;

        public final class Dismiss extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<Dismiss> CREATOR;

            static {
                PrepurchaseCashCardAppletData$FooterButtonContent$Dismiss$Companion$ADAPTER$1 prepurchaseCashCardAppletData$FooterButtonContent$Dismiss$Companion$ADAPTER$1 = new PrepurchaseCashCardAppletData$FooterButtonContent$Dismiss$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Dismiss.class), "type.googleapis.com/squareup.lending.PrepurchaseCashCardAppletData.FooterButtonContent.Dismiss", Syntax.PROTO_2, null, "squareup/lending/prepurchase_cash_card_applet_data.proto");
                ADAPTER = prepurchaseCashCardAppletData$FooterButtonContent$Dismiss$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(prepurchaseCashCardAppletData$FooterButtonContent$Dismiss$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Dismiss(ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                return (obj instanceof Dismiss) && Intrinsics.areEqual(unknownFields(), ((Dismiss) obj).unknownFields());
            }

            public final int hashCode() {
                return unknownFields().hashCode();
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                Divider.Builder builder = new Divider.Builder(12);
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                return "Dismiss{}";
            }
        }

        static {
            PrepurchaseCashCardAppletData$FooterButtonContent$Companion$ADAPTER$1 prepurchaseCashCardAppletData$FooterButtonContent$Companion$ADAPTER$1 = new PrepurchaseCashCardAppletData$FooterButtonContent$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(FooterButtonContent.class), "type.googleapis.com/squareup.lending.PrepurchaseCashCardAppletData.FooterButtonContent", Syntax.PROTO_2, null, "squareup/lending/prepurchase_cash_card_applet_data.proto");
            ADAPTER = prepurchaseCashCardAppletData$FooterButtonContent$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(prepurchaseCashCardAppletData$FooterButtonContent$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FooterButtonContent(LocalizedString localizedString, CashBalanceKt cashBalanceKt, Boolean bool, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.text = localizedString;
            this.action = cashBalanceKt;
            this.should_action_dismiss_half_sheet = bool;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof FooterButtonContent)) {
                return false;
            }
            FooterButtonContent footerButtonContent = (FooterButtonContent) obj;
            return Intrinsics.areEqual(unknownFields(), footerButtonContent.unknownFields()) && Intrinsics.areEqual(this.text, footerButtonContent.text) && Intrinsics.areEqual(this.action, footerButtonContent.action) && Intrinsics.areEqual(this.should_action_dismiss_half_sheet, footerButtonContent.should_action_dismiss_half_sheet);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            LocalizedString localizedString = this.text;
            int hashCode2 = (hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
            CashBalanceKt cashBalanceKt = this.action;
            int hashCode3 = (hashCode2 + (cashBalanceKt != null ? cashBalanceKt.hashCode() : 0)) * 37;
            Boolean bool = this.should_action_dismiss_half_sheet;
            int hashCode4 = hashCode3 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0);
            this.hashCode = hashCode4;
            return hashCode4;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Section.Builder builder = new Section.Builder(1);
            builder.header_text = this.text;
            builder.header_button = this.action;
            builder.groups = this.should_action_dismiss_half_sheet;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            LocalizedString localizedString = this.text;
            if (localizedString != null) {
                Matcher$$ExternalSyntheticOutline0.m("text=", localizedString, arrayList);
            }
            CashBalanceKt cashBalanceKt = this.action;
            if (cashBalanceKt != null) {
                arrayList.add("action=" + cashBalanceKt);
            }
            Boolean bool = this.should_action_dismiss_half_sheet;
            if (bool != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("should_action_dismiss_half_sheet=", bool, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "FooterButtonContent{", "}", 0, null, null, 56);
        }
    }

    public final class InfoRow extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<InfoRow> CREATOR;
        public final LocalizedString leading_text;
        public final PrepurchaseCashCardAppletData$InfoRow$LeadingTextAction$ShowInfoViewData leading_text_action;
        public final CashBannerKt trailing_content;

        public final class PaymentPlanAction extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<PaymentPlanAction> CREATOR;
            public final LocalizedString action_accessibility_hint;
            public final String initial_selected_option_identifier;

            static {
                PrepurchaseCashCardAppletData$InfoRow$PaymentPlanAction$Companion$ADAPTER$1 prepurchaseCashCardAppletData$InfoRow$PaymentPlanAction$Companion$ADAPTER$1 = new PrepurchaseCashCardAppletData$InfoRow$PaymentPlanAction$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(PaymentPlanAction.class), "type.googleapis.com/squareup.lending.PrepurchaseCashCardAppletData.InfoRow.PaymentPlanAction", Syntax.PROTO_2, null, "squareup/lending/prepurchase_cash_card_applet_data.proto");
                ADAPTER = prepurchaseCashCardAppletData$InfoRow$PaymentPlanAction$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(prepurchaseCashCardAppletData$InfoRow$PaymentPlanAction$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PaymentPlanAction(LocalizedString localizedString, String str, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.initial_selected_option_identifier = str;
                this.action_accessibility_hint = localizedString;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof PaymentPlanAction)) {
                    return false;
                }
                PaymentPlanAction paymentPlanAction = (PaymentPlanAction) obj;
                return Intrinsics.areEqual(unknownFields(), paymentPlanAction.unknownFields()) && Intrinsics.areEqual(this.initial_selected_option_identifier, paymentPlanAction.initial_selected_option_identifier) && Intrinsics.areEqual(this.action_accessibility_hint, paymentPlanAction.action_accessibility_hint);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                String str = this.initial_selected_option_identifier;
                int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
                LocalizedString localizedString = this.action_accessibility_hint;
                int hashCode3 = hashCode2 + (localizedString != null ? localizedString.hashCode() : 0);
                this.hashCode = hashCode3;
                return hashCode3;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                ActionButton.Builder builder = new ActionButton.Builder(1);
                builder.client_route = this.initial_selected_option_identifier;
                builder.title = this.action_accessibility_hint;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                String str = this.initial_selected_option_identifier;
                if (str != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "initial_selected_option_identifier=", arrayList);
                }
                LocalizedString localizedString = this.action_accessibility_hint;
                if (localizedString != null) {
                    Matcher$$ExternalSyntheticOutline0.m("action_accessibility_hint=", localizedString, arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "PaymentPlanAction{", "}", 0, null, null, 56);
            }
        }

        static {
            PrepurchaseCashCardAppletData$InfoRow$Companion$ADAPTER$1 prepurchaseCashCardAppletData$InfoRow$Companion$ADAPTER$1 = new PrepurchaseCashCardAppletData$InfoRow$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(InfoRow.class), "type.googleapis.com/squareup.lending.PrepurchaseCashCardAppletData.InfoRow", Syntax.PROTO_2, null, "squareup/lending/prepurchase_cash_card_applet_data.proto");
            ADAPTER = prepurchaseCashCardAppletData$InfoRow$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(prepurchaseCashCardAppletData$InfoRow$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InfoRow(LocalizedString localizedString, PrepurchaseCashCardAppletData$InfoRow$LeadingTextAction$ShowInfoViewData prepurchaseCashCardAppletData$InfoRow$LeadingTextAction$ShowInfoViewData, CashBannerKt cashBannerKt, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.leading_text = localizedString;
            this.leading_text_action = prepurchaseCashCardAppletData$InfoRow$LeadingTextAction$ShowInfoViewData;
            this.trailing_content = cashBannerKt;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof InfoRow)) {
                return false;
            }
            InfoRow infoRow = (InfoRow) obj;
            return Intrinsics.areEqual(unknownFields(), infoRow.unknownFields()) && Intrinsics.areEqual(this.leading_text, infoRow.leading_text) && Intrinsics.areEqual(this.leading_text_action, infoRow.leading_text_action) && Intrinsics.areEqual(this.trailing_content, infoRow.trailing_content);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            LocalizedString localizedString = this.leading_text;
            int hashCode2 = (hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
            PrepurchaseCashCardAppletData$InfoRow$LeadingTextAction$ShowInfoViewData prepurchaseCashCardAppletData$InfoRow$LeadingTextAction$ShowInfoViewData = this.leading_text_action;
            int hashCode3 = (hashCode2 + (prepurchaseCashCardAppletData$InfoRow$LeadingTextAction$ShowInfoViewData != null ? prepurchaseCashCardAppletData$InfoRow$LeadingTextAction$ShowInfoViewData.hashCode() : 0)) * 37;
            CashBannerKt cashBannerKt = this.trailing_content;
            int hashCode4 = hashCode3 + (cashBannerKt != null ? cashBannerKt.hashCode() : 0);
            this.hashCode = hashCode4;
            return hashCode4;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Section.Builder builder = new Section.Builder(2);
            builder.header_text = this.leading_text;
            builder.header_button = this.leading_text_action;
            builder.groups = this.trailing_content;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            LocalizedString localizedString = this.leading_text;
            if (localizedString != null) {
                Matcher$$ExternalSyntheticOutline0.m("leading_text=", localizedString, arrayList);
            }
            PrepurchaseCashCardAppletData$InfoRow$LeadingTextAction$ShowInfoViewData prepurchaseCashCardAppletData$InfoRow$LeadingTextAction$ShowInfoViewData = this.leading_text_action;
            if (prepurchaseCashCardAppletData$InfoRow$LeadingTextAction$ShowInfoViewData != null) {
                arrayList.add("leading_text_action=" + prepurchaseCashCardAppletData$InfoRow$LeadingTextAction$ShowInfoViewData);
            }
            CashBannerKt cashBannerKt = this.trailing_content;
            if (cashBannerKt != null) {
                arrayList.add("trailing_content=" + cashBannerKt);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "InfoRow{", "}", 0, null, null, 56);
        }
    }

    public final class InfoViewData extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<InfoViewData> CREATOR;
        public final LocalizedString primary_footer_button_text;
        public final List text_blocks;
        public final LocalizedString title;

        public final class TextBlock extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<TextBlock> CREATOR;
            public final LocalizedString body;
            public final LocalizedString header;
            public final List rows;

            public final class Row extends AndroidMessage {
                public static final ProtoAdapter ADAPTER;
                public static final Parcelable.Creator<Row> CREATOR;
                public final LocalizedString leading_text;
                public final RowStyle style;
                public final LocalizedString trailing_text;

                static {
                    PrepurchaseCashCardAppletData$InfoViewData$TextBlock$Row$Companion$ADAPTER$1 prepurchaseCashCardAppletData$InfoViewData$TextBlock$Row$Companion$ADAPTER$1 = new PrepurchaseCashCardAppletData$InfoViewData$TextBlock$Row$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Row.class), "type.googleapis.com/squareup.lending.PrepurchaseCashCardAppletData.InfoViewData.TextBlock.Row", Syntax.PROTO_2, null, "squareup/lending/prepurchase_cash_card_applet_data.proto");
                    ADAPTER = prepurchaseCashCardAppletData$InfoViewData$TextBlock$Row$Companion$ADAPTER$1;
                    AndroidMessage.Companion.getClass();
                    CREATOR = new AndroidMessage.ProtoAdapterCreator(prepurchaseCashCardAppletData$InfoViewData$TextBlock$Row$Companion$ADAPTER$1);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Row(LocalizedString localizedString, LocalizedString localizedString2, RowStyle rowStyle, ByteString byteString) {
                    super(ADAPTER, byteString);
                    byteString.getClass();
                    this.leading_text = localizedString;
                    this.trailing_text = localizedString2;
                    this.style = rowStyle;
                }

                public final boolean equals(Object obj) {
                    if (obj == this) {
                        return true;
                    }
                    if (!(obj instanceof Row)) {
                        return false;
                    }
                    Row row = (Row) obj;
                    return Intrinsics.areEqual(unknownFields(), row.unknownFields()) && Intrinsics.areEqual(this.leading_text, row.leading_text) && Intrinsics.areEqual(this.trailing_text, row.trailing_text) && this.style == row.style;
                }

                public final int hashCode() {
                    int i = this.hashCode;
                    if (i != 0) {
                        return i;
                    }
                    int hashCode = unknownFields().hashCode() * 37;
                    LocalizedString localizedString = this.leading_text;
                    int hashCode2 = (hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
                    LocalizedString localizedString2 = this.trailing_text;
                    int hashCode3 = (hashCode2 + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37;
                    RowStyle rowStyle = this.style;
                    int hashCode4 = hashCode3 + (rowStyle != null ? rowStyle.hashCode() : 0);
                    this.hashCode = hashCode4;
                    return hashCode4;
                }

                @Override // com.squareup.wire.Message
                public final Message.Builder newBuilder() {
                    Section.Builder builder = new Section.Builder(3);
                    builder.header_text = this.leading_text;
                    builder.header_button = this.trailing_text;
                    builder.groups = this.style;
                    builder.addUnknownFields(unknownFields());
                    return builder;
                }

                public final String toString() {
                    ArrayList arrayList = new ArrayList();
                    LocalizedString localizedString = this.leading_text;
                    if (localizedString != null) {
                        Matcher$$ExternalSyntheticOutline0.m("leading_text=", localizedString, arrayList);
                    }
                    LocalizedString localizedString2 = this.trailing_text;
                    if (localizedString2 != null) {
                        Matcher$$ExternalSyntheticOutline0.m("trailing_text=", localizedString2, arrayList);
                    }
                    RowStyle rowStyle = this.style;
                    if (rowStyle != null) {
                        arrayList.add("style=" + rowStyle);
                    }
                    return CollectionsKt.joinToString$default(arrayList, ", ", "Row{", "}", 0, null, null, 56);
                }
            }

            public enum RowStyle implements WireEnum {
                STANDARD(1),
                PROMINENT(2);

                public final int value;
                public static final CardProduct.Companion Companion = new CardProduct.Companion(14);
                public static final PrepurchaseCashCardAppletData$InfoViewData$TextBlock$RowStyle$Companion$ADAPTER$1 ADAPTER = new PrepurchaseCashCardAppletData$InfoViewData$TextBlock$RowStyle$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(RowStyle.class), Syntax.PROTO_2, null);

                RowStyle(int i) {
                    this.value = i;
                }

                public static final RowStyle fromValue(int i) {
                    Companion.getClass();
                    if (i == 1) {
                        return STANDARD;
                    }
                    if (i != 2) {
                        return null;
                    }
                    return PROMINENT;
                }

                @Override // com.squareup.wire.WireEnum
                public final int getValue() {
                    return this.value;
                }
            }

            static {
                PrepurchaseCashCardAppletData$InfoViewData$TextBlock$Companion$ADAPTER$1 prepurchaseCashCardAppletData$InfoViewData$TextBlock$Companion$ADAPTER$1 = new PrepurchaseCashCardAppletData$InfoViewData$TextBlock$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(TextBlock.class), "type.googleapis.com/squareup.lending.PrepurchaseCashCardAppletData.InfoViewData.TextBlock", Syntax.PROTO_2, null, "squareup/lending/prepurchase_cash_card_applet_data.proto");
                ADAPTER = prepurchaseCashCardAppletData$InfoViewData$TextBlock$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(prepurchaseCashCardAppletData$InfoViewData$TextBlock$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TextBlock(LocalizedString localizedString, LocalizedString localizedString2, List list, ByteString byteString) {
                super(ADAPTER, byteString);
                list.getClass();
                byteString.getClass();
                this.header = localizedString;
                this.body = localizedString2;
                this.rows = TransactorKt.immutableCopyOf("rows", list);
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof TextBlock)) {
                    return false;
                }
                TextBlock textBlock = (TextBlock) obj;
                return Intrinsics.areEqual(unknownFields(), textBlock.unknownFields()) && Intrinsics.areEqual(this.header, textBlock.header) && Intrinsics.areEqual(this.body, textBlock.body) && Intrinsics.areEqual(this.rows, textBlock.rows);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                LocalizedString localizedString = this.header;
                int hashCode2 = (hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
                LocalizedString localizedString2 = this.body;
                int hashCode3 = this.rows.hashCode() + ((hashCode2 + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37);
                this.hashCode = hashCode3;
                return hashCode3;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                LoanRepaymentSelectionData.Builder builder = new LoanRepaymentSelectionData.Builder(2);
                builder.title = this.header;
                builder.dismiss_button_text = this.body;
                builder.repayment_choices = this.rows;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                LocalizedString localizedString = this.header;
                if (localizedString != null) {
                    Matcher$$ExternalSyntheticOutline0.m("header=", localizedString, arrayList);
                }
                LocalizedString localizedString2 = this.body;
                if (localizedString2 != null) {
                    Matcher$$ExternalSyntheticOutline0.m("body=", localizedString2, arrayList);
                }
                List list = this.rows;
                if (!list.isEmpty()) {
                    re$$ExternalSyntheticOutline0.m("rows=", arrayList, list);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "TextBlock{", "}", 0, null, null, 56);
            }
        }

        static {
            PrepurchaseCashCardAppletData$InfoViewData$Companion$ADAPTER$1 prepurchaseCashCardAppletData$InfoViewData$Companion$ADAPTER$1 = new PrepurchaseCashCardAppletData$InfoViewData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(InfoViewData.class), "type.googleapis.com/squareup.lending.PrepurchaseCashCardAppletData.InfoViewData", Syntax.PROTO_2, null, "squareup/lending/prepurchase_cash_card_applet_data.proto");
            ADAPTER = prepurchaseCashCardAppletData$InfoViewData$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(prepurchaseCashCardAppletData$InfoViewData$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InfoViewData(LocalizedString localizedString, LocalizedString localizedString2, List list, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.title = localizedString;
            this.primary_footer_button_text = localizedString2;
            this.text_blocks = TransactorKt.immutableCopyOf("text_blocks", list);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof InfoViewData)) {
                return false;
            }
            InfoViewData infoViewData = (InfoViewData) obj;
            return Intrinsics.areEqual(unknownFields(), infoViewData.unknownFields()) && Intrinsics.areEqual(this.title, infoViewData.title) && Intrinsics.areEqual(this.text_blocks, infoViewData.text_blocks) && Intrinsics.areEqual(this.primary_footer_button_text, infoViewData.primary_footer_button_text);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            LocalizedString localizedString = this.title;
            int m = Recorder$$ExternalSyntheticOutline2.m((hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37, 37, this.text_blocks);
            LocalizedString localizedString2 = this.primary_footer_button_text;
            int hashCode2 = m + (localizedString2 != null ? localizedString2.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            LoanRepaymentSelectionData.Builder builder = new LoanRepaymentSelectionData.Builder(1);
            builder.title = this.title;
            builder.repayment_choices = this.text_blocks;
            builder.dismiss_button_text = this.primary_footer_button_text;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            LocalizedString localizedString = this.title;
            if (localizedString != null) {
                Matcher$$ExternalSyntheticOutline0.m("title=", localizedString, arrayList);
            }
            List list = this.text_blocks;
            if (!list.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("text_blocks=", arrayList, list);
            }
            LocalizedString localizedString2 = this.primary_footer_button_text;
            if (localizedString2 != null) {
                Matcher$$ExternalSyntheticOutline0.m("primary_footer_button_text=", localizedString2, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "InfoViewData{", "}", 0, null, null, 56);
        }
    }

    public final class Locale extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Locale> CREATOR;
        public final String display_name;

        static {
            PrepurchaseCashCardAppletData$Locale$Companion$ADAPTER$1 prepurchaseCashCardAppletData$Locale$Companion$ADAPTER$1 = new PrepurchaseCashCardAppletData$Locale$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Locale.class), "type.googleapis.com/squareup.lending.PrepurchaseCashCardAppletData.Locale", Syntax.PROTO_2, null, "squareup/lending/prepurchase_cash_card_applet_data.proto");
            ADAPTER = prepurchaseCashCardAppletData$Locale$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(prepurchaseCashCardAppletData$Locale$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Locale(String str, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.display_name = str;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Locale)) {
                return false;
            }
            Locale locale = (Locale) obj;
            return Intrinsics.areEqual(unknownFields(), locale.unknownFields()) && Intrinsics.areEqual(this.display_name, locale.display_name);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.display_name;
            int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            DisplayName.Builder builder = new DisplayName.Builder(12);
            builder.display_name = this.display_name;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.display_name;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "display_name=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Locale{", "}", 0, null, null, 56);
        }
    }

    public final class PaymentPlansData extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<PaymentPlansData> CREATOR;
        public final List options;
        public final LocalizedString primary_button_text;
        public final LocalizedString subtitle;
        public final LocalizedString title;

        public final class Option extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<Option> CREATOR;
            public final String identifier;
            public final LocalizedString subtitle;
            public final LocalizedString title;

            static {
                PrepurchaseCashCardAppletData$PaymentPlansData$Option$Companion$ADAPTER$1 prepurchaseCashCardAppletData$PaymentPlansData$Option$Companion$ADAPTER$1 = new PrepurchaseCashCardAppletData$PaymentPlansData$Option$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Option.class), "type.googleapis.com/squareup.lending.PrepurchaseCashCardAppletData.PaymentPlansData.Option", Syntax.PROTO_2, null, "squareup/lending/prepurchase_cash_card_applet_data.proto");
                ADAPTER = prepurchaseCashCardAppletData$PaymentPlansData$Option$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(prepurchaseCashCardAppletData$PaymentPlansData$Option$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Option(LocalizedString localizedString, LocalizedString localizedString2, String str, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.title = localizedString;
                this.subtitle = localizedString2;
                this.identifier = str;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Option)) {
                    return false;
                }
                Option option = (Option) obj;
                return Intrinsics.areEqual(unknownFields(), option.unknownFields()) && Intrinsics.areEqual(this.title, option.title) && Intrinsics.areEqual(this.subtitle, option.subtitle) && Intrinsics.areEqual(this.identifier, option.identifier);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                LocalizedString localizedString = this.title;
                int hashCode2 = (hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
                LocalizedString localizedString2 = this.subtitle;
                int hashCode3 = (hashCode2 + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37;
                String str = this.identifier;
                int hashCode4 = hashCode3 + (str != null ? str.hashCode() : 0);
                this.hashCode = hashCode4;
                return hashCode4;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                AddPaycheckTool.Builder builder = new AddPaycheckTool.Builder(1);
                builder.title = this.title;
                builder.subtitle = this.subtitle;
                builder.client_route = this.identifier;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                LocalizedString localizedString = this.title;
                if (localizedString != null) {
                    Matcher$$ExternalSyntheticOutline0.m("title=", localizedString, arrayList);
                }
                LocalizedString localizedString2 = this.subtitle;
                if (localizedString2 != null) {
                    Matcher$$ExternalSyntheticOutline0.m("subtitle=", localizedString2, arrayList);
                }
                String str = this.identifier;
                if (str != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "identifier=", arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "Option{", "}", 0, null, null, 56);
            }
        }

        static {
            PrepurchaseCashCardAppletData$PaymentPlansData$Companion$ADAPTER$1 prepurchaseCashCardAppletData$PaymentPlansData$Companion$ADAPTER$1 = new PrepurchaseCashCardAppletData$PaymentPlansData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(PaymentPlansData.class), "type.googleapis.com/squareup.lending.PrepurchaseCashCardAppletData.PaymentPlansData", Syntax.PROTO_2, null, "squareup/lending/prepurchase_cash_card_applet_data.proto");
            ADAPTER = prepurchaseCashCardAppletData$PaymentPlansData$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(prepurchaseCashCardAppletData$PaymentPlansData$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PaymentPlansData(LocalizedString localizedString, LocalizedString localizedString2, List list, LocalizedString localizedString3, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.title = localizedString;
            this.subtitle = localizedString2;
            this.primary_button_text = localizedString3;
            this.options = TransactorKt.immutableCopyOf("options", list);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof PaymentPlansData)) {
                return false;
            }
            PaymentPlansData paymentPlansData = (PaymentPlansData) obj;
            return Intrinsics.areEqual(unknownFields(), paymentPlansData.unknownFields()) && Intrinsics.areEqual(this.title, paymentPlansData.title) && Intrinsics.areEqual(this.subtitle, paymentPlansData.subtitle) && Intrinsics.areEqual(this.options, paymentPlansData.options) && Intrinsics.areEqual(this.primary_button_text, paymentPlansData.primary_button_text);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            LocalizedString localizedString = this.title;
            int hashCode2 = (hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
            LocalizedString localizedString2 = this.subtitle;
            int m = Recorder$$ExternalSyntheticOutline2.m((hashCode2 + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37, 37, this.options);
            LocalizedString localizedString3 = this.primary_button_text;
            int hashCode3 = m + (localizedString3 != null ? localizedString3.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            EarnerModeSheetData.Builder builder = new EarnerModeSheetData.Builder(1);
            builder.title = this.title;
            builder.body = this.subtitle;
            builder.durations = this.options;
            builder.primary_button_text = this.primary_button_text;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            LocalizedString localizedString = this.title;
            if (localizedString != null) {
                Matcher$$ExternalSyntheticOutline0.m("title=", localizedString, arrayList);
            }
            LocalizedString localizedString2 = this.subtitle;
            if (localizedString2 != null) {
                Matcher$$ExternalSyntheticOutline0.m("subtitle=", localizedString2, arrayList);
            }
            List list = this.options;
            if (!list.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("options=", arrayList, list);
            }
            LocalizedString localizedString3 = this.primary_button_text;
            if (localizedString3 != null) {
                Matcher$$ExternalSyntheticOutline0.m("primary_button_text=", localizedString3, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "PaymentPlansData{", "}", 0, null, null, 56);
        }
    }

    public final class UnknownContent extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<UnknownContent> CREATOR;

        static {
            PrepurchaseCashCardAppletData$UnknownContent$Companion$ADAPTER$1 prepurchaseCashCardAppletData$UnknownContent$Companion$ADAPTER$1 = new PrepurchaseCashCardAppletData$UnknownContent$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(UnknownContent.class), "type.googleapis.com/squareup.lending.PrepurchaseCashCardAppletData.UnknownContent", Syntax.PROTO_2, null, "squareup/lending/prepurchase_cash_card_applet_data.proto");
            ADAPTER = prepurchaseCashCardAppletData$UnknownContent$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(prepurchaseCashCardAppletData$UnknownContent$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UnknownContent(ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof UnknownContent) && Intrinsics.areEqual(unknownFields(), ((UnknownContent) obj).unknownFields());
        }

        public final int hashCode() {
            return unknownFields().hashCode();
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Divider.Builder builder = new Divider.Builder(13);
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            return "UnknownContent{}";
        }
    }

    static {
        PrepurchaseCashCardAppletData$Companion$ADAPTER$1 prepurchaseCashCardAppletData$Companion$ADAPTER$1 = new PrepurchaseCashCardAppletData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(PrepurchaseCashCardAppletData.class), "type.googleapis.com/squareup.lending.PrepurchaseCashCardAppletData", Syntax.PROTO_2, null, "squareup/lending/prepurchase_cash_card_applet_data.proto");
        ADAPTER = prepurchaseCashCardAppletData$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(prepurchaseCashCardAppletData$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrepurchaseCashCardAppletData(Locale locale, LocalizedString localizedString, zztc zztcVar, LocalizedString localizedString2, List list, LocalizedString localizedString3, LocalBrandBannersKt localBrandBannersKt, LocalMenuItemsKt localMenuItemsKt, PaymentPlansData paymentPlansData, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.locale = locale;
        this.title = localizedString;
        this.loadable_subtitle = zztcVar;
        this.info_rows_header = localizedString2;
        this.footer_text = localizedString3;
        this.primary_footer_button_state = localBrandBannersKt;
        this.secondary_footer_button_state = localMenuItemsKt;
        this.payment_plans_data = paymentPlansData;
        this.info_rows = TransactorKt.immutableCopyOf("info_rows", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PrepurchaseCashCardAppletData)) {
            return false;
        }
        PrepurchaseCashCardAppletData prepurchaseCashCardAppletData = (PrepurchaseCashCardAppletData) obj;
        return Intrinsics.areEqual(unknownFields(), prepurchaseCashCardAppletData.unknownFields()) && Intrinsics.areEqual(this.locale, prepurchaseCashCardAppletData.locale) && Intrinsics.areEqual(this.title, prepurchaseCashCardAppletData.title) && Intrinsics.areEqual(this.loadable_subtitle, prepurchaseCashCardAppletData.loadable_subtitle) && Intrinsics.areEqual(this.info_rows_header, prepurchaseCashCardAppletData.info_rows_header) && Intrinsics.areEqual(this.info_rows, prepurchaseCashCardAppletData.info_rows) && Intrinsics.areEqual(this.footer_text, prepurchaseCashCardAppletData.footer_text) && Intrinsics.areEqual(this.primary_footer_button_state, prepurchaseCashCardAppletData.primary_footer_button_state) && Intrinsics.areEqual(this.secondary_footer_button_state, prepurchaseCashCardAppletData.secondary_footer_button_state) && Intrinsics.areEqual(this.payment_plans_data, prepurchaseCashCardAppletData.payment_plans_data);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Locale locale = this.locale;
        int hashCode2 = (hashCode + (locale != null ? locale.hashCode() : 0)) * 37;
        LocalizedString localizedString = this.title;
        int hashCode3 = (hashCode2 + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
        zztc zztcVar = this.loadable_subtitle;
        int hashCode4 = (hashCode3 + (zztcVar != null ? zztcVar.hashCode() : 0)) * 37;
        LocalizedString localizedString2 = this.info_rows_header;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode4 + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37, 37, this.info_rows);
        LocalizedString localizedString3 = this.footer_text;
        int hashCode5 = (m + (localizedString3 != null ? localizedString3.hashCode() : 0)) * 37;
        LocalBrandBannersKt localBrandBannersKt = this.primary_footer_button_state;
        int hashCode6 = (hashCode5 + (localBrandBannersKt != null ? localBrandBannersKt.hashCode() : 0)) * 37;
        LocalMenuItemsKt localMenuItemsKt = this.secondary_footer_button_state;
        int hashCode7 = (hashCode6 + (localMenuItemsKt != null ? localMenuItemsKt.hashCode() : 0)) * 37;
        PaymentPlansData paymentPlansData = this.payment_plans_data;
        int hashCode8 = hashCode7 + (paymentPlansData != null ? paymentPlansData.hashCode() : 0);
        this.hashCode = hashCode8;
        return hashCode8;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0, false);
        builder.locale = this.locale;
        builder.title = this.title;
        builder.loadable_subtitle = this.loadable_subtitle;
        builder.info_rows_header = this.info_rows_header;
        builder.info_rows = this.info_rows;
        builder.footer_text = this.footer_text;
        builder.primary_footer_button_state = this.primary_footer_button_state;
        builder.secondary_footer_button_state = this.secondary_footer_button_state;
        builder.payment_plans_data = this.payment_plans_data;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Locale locale = this.locale;
        if (locale != null) {
            arrayList.add("locale=" + locale);
        }
        LocalizedString localizedString = this.title;
        if (localizedString != null) {
            Matcher$$ExternalSyntheticOutline0.m("title=", localizedString, arrayList);
        }
        zztc zztcVar = this.loadable_subtitle;
        if (zztcVar != null) {
            arrayList.add("loadable_subtitle=" + zztcVar);
        }
        LocalizedString localizedString2 = this.info_rows_header;
        if (localizedString2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("info_rows_header=", localizedString2, arrayList);
        }
        List list = this.info_rows;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("info_rows=", arrayList, list);
        }
        LocalizedString localizedString3 = this.footer_text;
        if (localizedString3 != null) {
            Matcher$$ExternalSyntheticOutline0.m("footer_text=", localizedString3, arrayList);
        }
        LocalBrandBannersKt localBrandBannersKt = this.primary_footer_button_state;
        if (localBrandBannersKt != null) {
            arrayList.add("primary_footer_button_state=" + localBrandBannersKt);
        }
        LocalMenuItemsKt localMenuItemsKt = this.secondary_footer_button_state;
        if (localMenuItemsKt != null) {
            arrayList.add("secondary_footer_button_state=" + localMenuItemsKt);
        }
        PaymentPlansData paymentPlansData = this.payment_plans_data;
        if (paymentPlansData != null) {
            arrayList.add("payment_plans_data=" + paymentPlansData);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PrepurchaseCashCardAppletData{", "}", 0, null, null, 56);
    }

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public Serializable footer_text;
        public Object info_rows;
        public Object info_rows_header;
        public Object loadable_subtitle;
        public Object locale;
        public Object payment_plans_data;
        public Object primary_footer_button_state;
        public Object secondary_footer_button_state;
        public Object title;

        public Builder(int i) {
            this.$r8$classId = i;
            switch (i) {
                case 11:
                    EmptyList emptyList = EmptyList.INSTANCE;
                    this.info_rows = emptyList;
                    this.info_rows_header = emptyList;
                    this.primary_footer_button_state = emptyList;
                    this.secondary_footer_button_state = emptyList;
                    break;
                case 12:
                    this.info_rows = EmptyList.INSTANCE;
                    break;
                case 24:
                    this.info_rows = EmptyList.INSTANCE;
                    break;
                default:
                    EmptyList emptyList2 = EmptyList.INSTANCE;
                    this.info_rows = emptyList2;
                    this.primary_footer_button_state = emptyList2;
                    this.secondary_footer_button_state = emptyList2;
                    break;
            }
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new PrepurchaseCashCardAppletData((Locale) this.locale, (LocalizedString) this.title, (zztc) this.loadable_subtitle, (LocalizedString) this.info_rows_header, (List) this.info_rows, (LocalizedString) this.footer_text, (LocalBrandBannersKt) this.primary_footer_button_state, (LocalMenuItemsKt) this.secondary_footer_button_state, (PaymentPlansData) this.payment_plans_data, buildUnknownFields());
                case 1:
                    return new BankMetadata.DisplaySettings((BankMetadata.DisplaySettings.Theme) this.locale, (String) this.title, (String) this.info_rows_header, (String) this.footer_text, (String) this.loadable_subtitle, (String) this.info_rows, (String) this.primary_footer_button_state, (String) this.secondary_footer_button_state, (String) this.payment_plans_data, buildUnknownFields());
                case 2:
                    return new EnrichedInstrumentLink((InstrumentLink) this.locale, (BinfoDetails) this.title, (BankinfoDetails) this.info_rows_header, (BrowserInteractionDetails) this.footer_text, (InstrumentVerificationDetails) this.loadable_subtitle, (StoredValueBalanceDetails) this.info_rows, (InstrumentLinkMetadata) this.primary_footer_button_state, (InstrumentLinkOwnerDetails) this.secondary_footer_button_state, (BankMetadata) this.payment_plans_data, buildUnknownFields());
                case 3:
                    return new ToggleEntryPointData((Icon) this.locale, (ToggleEntryPointData.ToggleState) this.footer_text, (LoyaltyKt) this.loadable_subtitle, (LocalizedString) this.title, (LocalizedString) this.info_rows_header, (ToggleEntryPointData.CardHeader) this.info_rows, (ToggleEntryPointData.CardTabCta) this.primary_footer_button_state, (String) this.secondary_footer_button_state, (String) this.payment_plans_data, buildUnknownFields());
                case 4:
                    return new SavingsCashInRequest((RequestContext) this.locale, (String) this.title, (String) this.info_rows_header, (BalanceSnapshot) this.footer_text, (Money) this.loadable_subtitle, (String) this.info_rows, (SavingsTransferContext) this.primary_footer_button_state, (String) this.secondary_footer_button_state, (BalanceSnapshot) this.payment_plans_data, buildUnknownFields());
                case 5:
                    return new Bank$DisplaySettings((Bank$DisplaySettings.Theme) this.locale, (String) this.title, (String) this.info_rows_header, (String) this.footer_text, (String) this.loadable_subtitle, (String) this.info_rows, (String) this.primary_footer_button_state, (String) this.secondary_footer_button_state, (String) this.payment_plans_data, buildUnknownFields());
                case 6:
                    return new BitcoinSellerLocation((Double) this.locale, (Double) this.title, (GlobalAddress) this.info_rows_header, (String) this.footer_text, (PaymentMethods) this.loadable_subtitle, (Boolean) this.info_rows, (String) this.primary_footer_button_state, (String) this.secondary_footer_button_state, (String) this.payment_plans_data, buildUnknownFields());
                case 7:
                    return new DeviceContext((Platform) this.locale, (String) this.title, (String) this.info_rows_header, (String) this.footer_text, (Integer) this.loadable_subtitle, (Integer) this.info_rows, (Integer) this.primary_footer_button_state, (String) this.secondary_footer_button_state, (String) this.payment_plans_data, buildUnknownFields());
                case 8:
                    return new CreateWebListingPaymentResponse((CreateWebListingPaymentResponse.Result) this.locale, (String) this.footer_text, (String) this.loadable_subtitle, (String) this.primary_footer_button_state, (LocalizedString) this.title, (LocalizedString) this.info_rows_header, (List) this.info_rows, (Instant) this.secondary_footer_button_state, (String) this.payment_plans_data, buildUnknownFields());
                case 9:
                    return new GetInlineMessageResponse.LimitsHubInlineMessage((GetInlineMessageResponse.LimitsHubInlineMessage.Icon) this.locale, (String) this.title, (String) this.info_rows_header, (GetInlineMessageResponse.LimitsHubInlineMessageButton) this.footer_text, (Long) this.loadable_subtitle, (GetInlineMessageResponse.LimitsHubInlineMessageButton) this.info_rows, (GetInlineMessageResponse.LimitsHubInlineMessage.Illustration) this.primary_footer_button_state, (String) this.secondary_footer_button_state, (String) this.payment_plans_data, buildUnknownFields());
                case 10:
                    return new OffersTabHomeResponse((String) this.locale, (String) this.title, (String) this.info_rows_header, (List) this.info_rows, (StyledText) this.footer_text, (Long) this.loadable_subtitle, (List) this.primary_footer_button_state, (List) this.secondary_footer_button_state, (AnalyticsEvent) this.payment_plans_data, buildUnknownFields());
                case 11:
                    return new OffersTabSearchResponse((List) this.info_rows, (String) this.locale, (FilterGroupSection) this.title, (List) this.info_rows_header, (Long) this.footer_text, (AnalyticsEvent) this.loadable_subtitle, (List) this.primary_footer_button_state, (List) this.secondary_footer_button_state, (AnalyticsEvent) this.payment_plans_data, buildUnknownFields());
                case 12:
                    return new ShopInfoResponse((GlobalMembers) this.locale, (Integer) this.title, (HorizontalAlignment) this.info_rows_header, (Text) this.footer_text, (Text) this.loadable_subtitle, (List) this.info_rows, (Button) this.primary_footer_button_state, (Text) this.secondary_footer_button_state, (ShopInfoResponse.DisplayCriteria) this.payment_plans_data, buildUnknownFields());
                case 13:
                    return new UserData2Response((Boolean) this.locale, (UserData2Response.InteractionEvents) this.title, (ReturnStatus) this.info_rows_header, (String) this.footer_text, (String) this.loadable_subtitle, (Integer) this.info_rows, (String) this.primary_footer_button_state, (String) this.secondary_footer_button_state, (Boolean) this.payment_plans_data, buildUnknownFields());
                case 14:
                    return new InitiateInstrumentSelectionRequest((String) this.locale, (Long) this.title, (String) this.info_rows_header, (Long) this.footer_text, (String) this.loadable_subtitle, (Long) this.info_rows, (Long) this.primary_footer_button_state, (RequestContext) this.secondary_footer_button_state, (Boolean) this.payment_plans_data, buildUnknownFields());
                case 15:
                    return new ShopInfoHalfSheet((ImageSource.Metadata) this.locale, (Integer) this.title, (com.squareup.protos.cash.discover.api.app.v1.model.HorizontalAlignment) this.info_rows_header, (com.squareup.protos.cash.discover.api.app.v1.model.Text) this.footer_text, (com.squareup.protos.cash.discover.api.app.v1.model.Text) this.loadable_subtitle, (List) this.info_rows, (com.squareup.protos.cash.discover.api.app.v1.model.Button) this.primary_footer_button_state, (com.squareup.protos.cash.discover.api.app.v1.model.Text) this.secondary_footer_button_state, (DisplayCriteria) this.payment_plans_data, buildUnknownFields());
                case 16:
                    return new com.squareup.protos.cash.discover.api.app.v1.model.ShopInfoResponse((ImageSourceKt) this.locale, (Integer) this.title, (com.squareup.protos.cash.discover.api.app.v1.model.HorizontalAlignment) this.info_rows_header, (com.squareup.protos.cash.discover.api.app.v1.model.Text) this.footer_text, (com.squareup.protos.cash.discover.api.app.v1.model.Text) this.loadable_subtitle, (List) this.info_rows, (com.squareup.protos.cash.discover.api.app.v1.model.Button) this.primary_footer_button_state, (com.squareup.protos.cash.discover.api.app.v1.model.Text) this.secondary_footer_button_state, (DisplayCriteria) this.payment_plans_data, buildUnknownFields());
                case 17:
                    return new AvatarElement((Image) this.locale, (AvatarElement.Size) this.title, (Boolean) this.info_rows_header, (Color) this.footer_text, (Alignment) this.loadable_subtitle, (String) this.info_rows, (AvatarElement.Badge) this.primary_footer_button_state, (Action) this.secondary_footer_button_state, (Image) this.payment_plans_data, buildUnknownFields());
                case 18:
                    return new Button$TextButtonElement((String) this.locale, (Action) this.title, (Button$Type) this.info_rows_header, (Button$TextButtonElement.State) this.footer_text, (Button$TextButtonElement.Size) this.loadable_subtitle, (Alignment) this.info_rows, (Color) this.primary_footer_button_state, (Color) this.secondary_footer_button_state, (Color) this.payment_plans_data, buildUnknownFields());
                case 19:
                    return new Incident((String) this.locale, (String) this.title, (String) this.info_rows_header, (Long) this.footer_text, (Boolean) this.loadable_subtitle, (Incident.Status) this.info_rows, (Long) this.primary_footer_button_state, (Boolean) this.secondary_footer_button_state, (Incident.Workflow) this.payment_plans_data, buildUnknownFields());
                case 20:
                    return new Automation((String) this.locale, (String) this.title, (Integer) this.info_rows_header, (Automation.AutomationStatus) this.footer_text, (Automation.AutomationTrigger) this.loadable_subtitle, (Automation.AllocationStrategy) this.info_rows, (Automation.AutomationTarget) this.primary_footer_button_state, (Instant) this.secondary_footer_button_state, (Instant) this.payment_plans_data, buildUnknownFields());
                case 21:
                    return new FinishWebAuthnAuthenticationRequest((String) this.locale, (String) this.title, (String) this.info_rows_header, (RequestContext) this.footer_text, (ByteString) this.loadable_subtitle, (ByteString) this.info_rows, (ByteString) this.primary_footer_button_state, (ByteString) this.secondary_footer_button_state, (ByteString) this.payment_plans_data, buildUnknownFields());
                case 22:
                    return new BrandCollection((String) this.locale, (String) this.title, (String) this.info_rows_header, (List) this.info_rows, (BrandCollection.GeoFence) this.footer_text, (LocalImage) this.loadable_subtitle, (String) this.primary_footer_button_state, (String) this.secondary_footer_button_state, (List) this.payment_plans_data, buildUnknownFields());
                case 23:
                    return new EducationalSheet((List) this.info_rows, (List) this.locale, (String) this.title, (Boolean) this.info_rows_header, (EducationalSheetButton) this.footer_text, (String) this.loadable_subtitle, (Boolean) this.primary_footer_button_state, (EducationalSheetButton) this.secondary_footer_button_state, (Boolean) this.payment_plans_data, buildUnknownFields());
                case 24:
                    String str = (String) this.locale;
                    if (str != null) {
                        return new GetBrandProfileRequest(str, (String) this.title, (String) this.info_rows_header, (String) this.footer_text, (String) this.loadable_subtitle, (String) this.primary_footer_button_state, (String) this.secondary_footer_button_state, (List) this.info_rows, (String) this.payment_plans_data, buildUnknownFields());
                    }
                    TransactorKt.missingRequiredFields(str, "brand_token");
                    throw null;
                case 25:
                    return new LocalBuyer.LocalBuyerAccount((String) this.locale, (String) this.title, (String) this.info_rows_header, (String) this.footer_text, (String) this.loadable_subtitle, (String) this.primary_footer_button_state, (String) this.secondary_footer_button_state, (List) this.info_rows, (PreferredPaymentMethod) this.payment_plans_data, buildUnknownFields());
                case 26:
                    LocalLocationSummary localLocationSummary = (LocalLocationSummary) this.locale;
                    if (localLocationSummary != null) {
                        return new LocalLocationDetail(localLocationSummary, (LocalMenu) this.title, (LocalActions) this.info_rows_header, (LocalLocationLinks) this.footer_text, (LocalRelatedContent) this.loadable_subtitle, (LocalCashMarketingContent) this.primary_footer_button_state, (LocalLoyaltyProgram) this.secondary_footer_button_state, (LocalLoyaltyAccount) this.payment_plans_data, (List) this.info_rows, buildUnknownFields());
                    }
                    TransactorKt.missingRequiredFields(localLocationSummary, "summary");
                    throw null;
                case 27:
                    return new LoyaltyPromotionDetailsPlaceholder.LoyaltyPromotionData((String) this.locale, (String) this.title, (String) this.info_rows_header, (List) this.info_rows, (com.squareup.protos.cash.genericelements.ui.AnalyticsEvent) this.footer_text, (com.squareup.protos.cash.genericelements.ui.AnalyticsEvent) this.loadable_subtitle, (Action) this.primary_footer_button_state, (com.squareup.protos.cash.genericelements.ui.AnalyticsEvent) this.secondary_footer_button_state, (Color) this.payment_plans_data, buildUnknownFields());
                case 28:
                    return new HalfSheetMessage((HalfSheetMessage.Placement) this.locale, (HalfSheetMessage$VisualAsset$Image) this.title, (String) this.info_rows_header, (String) this.footer_text, (Color) this.loadable_subtitle, (AppMessageAction) this.info_rows, (zzjr) this.primary_footer_button_state, (ShareSheet) this.secondary_footer_button_state, (HalfSheetMessage.OverlayColorTreatment) this.payment_plans_data, buildUnknownFields());
                default:
                    return new CardModule.HeroNullStateModule.UnifiedCardHomeNUX.Content((LocalizedString) this.title, (LocalizedString) this.info_rows_header, (CardModule.Button) this.locale, (CardModule.Button) this.footer_text, (List) this.info_rows, (ListUnordered) this.loadable_subtitle, (Boolean) this.primary_footer_button_state, (CardModule.HeroNullStateModule.UnifiedCardHomeNUX.Content.GreenContent) this.secondary_footer_button_state, (CardModule.HeroNullStateModule.UnifiedCardHomeNUX.Content.ParentAsKidContent) this.payment_plans_data, buildUnknownFields());
            }
        }

        public /* synthetic */ Builder(int i, boolean z) {
            this.$r8$classId = i;
        }
    }
}
