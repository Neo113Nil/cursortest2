package com.squareup.protos.cash.api;

import android.os.Parcelable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.media3.muxer.AnnexBUtils;
import androidx.room.TransactorKt;
import androidx.sqlite.db.SupportSQLiteProgram;
import app.cash.local.presenters.LocalPresenterFactoryKt;
import app.cash.local.primitives.LocalErrorKt;
import app.cash.local.primitives.math.LocalMoneysKt;
import app.cash.local.views.internal.menus.LocalMenuHoursViewKt;
import app.cash.local.views.internal.menus.LocalMenuSelectorKt;
import app.cash.redwood.protocol.host.NodeReuseKt;
import app.cash.redwood.ui.DensityKt;
import app.cash.redwood.yoga.internal.YGNode;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.bankingbenefits.api.v1_0.core.ui.elements.ActionableButtonCtaGroup;
import com.squareup.cash.bankingbenefits.api.v1_0.core.ui.elements.ActionableButtonDefault;
import com.squareup.cash.cashcommercebrowser.api.v1.RestrictedItemCheckRequest;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.lynx.api.v1_0.model.BinfoDetails;
import com.squareup.cash.moneybot.components.api.ClientRenderableUi;
import com.squareup.cash.moneybot.genie.protos.ComposePlatform;
import com.squareup.cash.moneybot.viewmodels.plugins.ActionCardViewModel;
import com.squareup.cash.moneybot.viewmodels.plugins.BriefViewModel;
import com.squareup.cash.moneybot.viewmodels.plugins.SuggestionListViewModel;
import com.squareup.cash.moneybot.views.plugins.ActionCardKt;
import com.squareup.cash.moneybot.views.plugins.BriefKt;
import com.squareup.cash.moneybot.views.plugins.TextCardKt;
import com.squareup.cash.music.views.MusicViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.p2pencore.v1.Date;
import com.squareup.cash.p2pencore.v1.Schedule;
import com.squareup.cash.supportarticles.app.v1.SupportArticle;
import com.squareup.cash.supportarticles.app.v1.SupportLink;
import com.squareup.cash.treehouse.sqldelight.SqlType;
import com.squareup.cash.work.data.api.LoaderState;
import com.squareup.cash.work.identifiers.MerchantIdentifier;
import com.squareup.cash.work.service.api.BrandDetails;
import com.squareup.cash.work.service.api.ThemedColor;
import com.squareup.cash.work.service.api.ThemedImage;
import com.squareup.cash.work.tinygraph.models.Merchant;
import com.squareup.cash.work.tinygraph.models.MerchantKt;
import com.squareup.cash.work.viewmodels.SellerCardViewModel;
import com.squareup.lending.CashCreditScoreHomeData;
import com.squareup.protos.binfo.api.CardProduct;
import com.squareup.protos.binfo.api.PrepaidStatus;
import com.squareup.protos.cash.aegis.core.ContentSection;
import com.squareup.protos.cash.aegis.core.DropDownSection;
import com.squareup.protos.cash.aegis.core.LinkSection;
import com.squareup.protos.cash.aegis.core.SafetyEducationPage;
import com.squareup.protos.cash.balancebasedaddcash.core.models.DisablePreferenceReason;
import com.squareup.protos.cash.blockly.api.AllowlistCustomer;
import com.squareup.protos.cash.blockly.api.BlocklyCustomerMetadata;
import com.squareup.protos.cash.blockly.api.ReportAbuseRequest;
import com.squareup.protos.cash.blockly.common.BlockingContext;
import com.squareup.protos.cash.cashabilities.api.CapabilityName;
import com.squareup.protos.cash.cashapproxy.api.AfterpayHubRowItem;
import com.squareup.protos.cash.cashapproxy.api.Avatar;
import com.squareup.protos.cash.cashapproxy.api.OrderPaymentMethod;
import com.squareup.protos.cash.cashapproxy.api.ScheduledPaymentStatus;
import com.squareup.protos.cash.cashapproxy.api.SingleUsePaymentSummary;
import com.squareup.protos.cash.cashapproxy.api.Text;
import com.squareup.protos.cash.cashbusinessaccounts.BusinessCategory;
import com.squareup.protos.cash.cashbusinessaccounts.BusinessProfileData;
import com.squareup.protos.cash.cashbusinessaccounts.api.v1.CustomerData;
import com.squareup.protos.cash.cashface.api.AnalyticsData;
import com.squareup.protos.cash.cashface.api.GetProfileDetailsResponse;
import com.squareup.protos.cash.cashface.api.ReportState;
import com.squareup.protos.cash.cashface.ui.GenericProfileElement;
import com.squareup.protos.cash.cashliteorchestrator.api.v1.LightningInvoiceState;
import com.squareup.protos.cash.cashliteorchestrator.api.v1.LightningReceiveArtifact;
import com.squareup.protos.cash.cashstorefronts.api.AfterpayAppMetadata;
import com.squareup.protos.cash.cashstorefronts.api.BusinessMetadata;
import com.squareup.protos.cash.cashstorefronts.api.CashAppAfterpayMetadata;
import com.squareup.protos.cash.cashstorefronts.api.CashAppGenericBusinessMetadata;
import com.squareup.protos.cash.cashstorefronts.api.CashAppPayLaterMetadata;
import com.squareup.protos.cash.cashstorefronts.api.ExternalAppLink;
import com.squareup.protos.cash.cashsuggest.api.AfterpayAppletActivityResponse;
import com.squareup.protos.cash.cashsuggest.api.AfterpayAppletHomeSection;
import com.squareup.protos.cash.cashsuggest.api.AfterpayAppletSearchResponse;
import com.squareup.protos.cash.cashsuggest.api.CreditDetailSheet;
import com.squareup.protos.cash.cashsuggest.api.CreditLineSectionHeader;
import com.squareup.protos.cash.cashsuggest.api.CreditLineType;
import com.squareup.protos.cash.cashsuggest.api.InAppBrowserMetadata;
import com.squareup.protos.cash.cashsuggest.api.RetroOrderSelectionResponse;
import com.squareup.protos.cash.cashsuggest.api.SearchBar;
import com.squareup.protos.cash.cashsuggest.api.ShopBrowseResponse;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.shop.rendering.api.AnalyticsEvent;
import com.squareup.protos.cash.shop.rendering.api.Button;
import com.squareup.protos.cash.shop.rendering.api.FilterGroupSection;
import com.squareup.protos.cash.shop.rendering.api.Footer;
import com.squareup.protos.cash.shop.rendering.api.PageHeader;
import com.squareup.protos.cash.shop.rendering.api.SearchSection;
import com.squareup.protos.cash.shop.rendering.api.SectionHeader;
import com.squareup.protos.cash.shop.rendering.api.TapAction;
import com.squareup.protos.cash.shop.rendering.api.TappableIcon;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.common.Money;
import com.squareup.protos.common.countries.Country;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.AnyMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import com.withpersona.sdk2.inquiry.network.core.HttpStatusCode;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Function;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptyMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import squareup.cash.ui.arcade.elements.ButtonCtaGroup;

/* loaded from: classes7.dex */
public final class Error extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Error> CREATOR;
    public final Category category;
    public final Code code;
    public final String description;
    public final String field;
    public final AnyMessage metadata;
    public final Boolean retryable;

    public enum Category implements WireEnum {
        API_ERROR(1),
        AUTHENTICATION_ERROR(2),
        INVALID_REQUEST_ERROR(3),
        RATE_LIMIT_ERROR(4),
        PAYMENT_PROCESSING_ERROR(5),
        MERCHANT_ERROR(7),
        BRAND_ERROR(8),
        DISPUTE_ERROR(9),
        GRANT_ERROR(10),
        API_KEY_ERROR(11),
        WEBHOOK_ERROR(12),
        ORDER_ERROR(13),
        MESSAGE_ERROR(14),
        OFFER_ERROR(15),
        CUSTOMER_ERROR(16),
        REQUEST_CHAINING_ERROR(17),
        BANK_ACCOUNT_ERROR(18),
        PAYOUT_PROCESSING_ERROR(19);

        public final int value;
        public static final CardProduct.Companion Companion = new CardProduct.Companion(16);
        public static final Error$Category$Companion$ADAPTER$1 ADAPTER = new Error$Category$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Category.class), Syntax.PROTO_2, null);

        Category(int i) {
            this.value = i;
        }

        public static final Category fromValue(int i) {
            Companion.getClass();
            return CardProduct.Companion.m3833fromValue(i);
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        Error$Companion$ADAPTER$1 error$Companion$ADAPTER$1 = new Error$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Error.class), "type.googleapis.com/squareup.cash.api.Error", Syntax.PROTO_2, null, "squareup/cash/api/errors.proto");
        ADAPTER = error$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(error$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Error(Category category, Code code, String str, String str2, Boolean bool, AnyMessage anyMessage, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.category = category;
        this.code = code;
        this.description = str;
        this.field = str2;
        this.retryable = bool;
        this.metadata = anyMessage;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Error)) {
            return false;
        }
        Error error = (Error) obj;
        return Intrinsics.areEqual(unknownFields(), error.unknownFields()) && this.category == error.category && this.code == error.code && Intrinsics.areEqual(this.description, error.description) && Intrinsics.areEqual(this.field, error.field) && Intrinsics.areEqual(this.retryable, error.retryable) && Intrinsics.areEqual(this.metadata, error.metadata);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Category category = this.category;
        int hashCode2 = (hashCode + (category != null ? category.hashCode() : 0)) * 37;
        Code code = this.code;
        int hashCode3 = (hashCode2 + (code != null ? code.hashCode() : 0)) * 37;
        String str = this.description;
        int hashCode4 = (hashCode3 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.field;
        int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Boolean bool = this.retryable;
        int hashCode6 = (hashCode5 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        AnyMessage anyMessage = this.metadata;
        int hashCode7 = hashCode6 + (anyMessage != null ? anyMessage.hashCode() : 0);
        this.hashCode = hashCode7;
        return hashCode7;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0, false);
        builder.category = this.category;
        builder.code = this.code;
        builder.description = this.description;
        builder.field = this.field;
        builder.retryable = this.retryable;
        builder.metadata = this.metadata;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Category category = this.category;
        if (category != null) {
            arrayList.add("category=" + category);
        }
        Code code = this.code;
        if (code != null) {
            arrayList.add("code=" + code);
        }
        String str = this.description;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "description=", arrayList);
        }
        String str2 = this.field;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "field=", arrayList);
        }
        Boolean bool = this.retryable;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("retryable=", bool, arrayList);
        }
        AnyMessage anyMessage = this.metadata;
        if (anyMessage != null) {
            arrayList.add("metadata=" + anyMessage);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Error{", "}", 0, null, null, 56);
    }

    public enum Code implements WireEnum {
        INTERNAL_SERVER_ERROR(100),
        SERVICE_UNAVAILABLE(101),
        GATEWAY_TIMEOUT(102),
        UNAUTHORIZED(200),
        ACCESS_TOKEN_REVOKED(EnumC0170g.SDK_ASSET_ICON_CHEVRON_LEFT_DOUBLE_S2_VALUE),
        ACCESS_TOKEN_EXPIRED(EnumC0170g.SDK_ASSET_ICON_CHEVRON_RIGHT_DOUBLE_S1_VALUE),
        CLIENT_DISABLED(EnumC0170g.SDK_ASSET_ICON_CHEVRON_RIGHT_DOUBLE_S2_VALUE),
        FORBIDDEN(EnumC0170g.SDK_ASSET_ICON_CLEARED_REC_VALUE),
        INSUFFICIENT_SCOPES(EnumC0170g.SDK_ASSET_ICON_CLIPBOARD_VALUE),
        EXPECTED_JSON_BODY(EnumC0170g.SDK_ASSET_TRANSFER_ICON_CIRCLE_VALUE),
        MISSING_REQUIRED_PARAMETER(EnumC0170g.SDK_ASSET_CASH_ICON_CIRCLE_VALUE),
        CONFLICTING_PARAMETERS(EnumC0170g.SDK_ASSET_ANIMATION_MOBILE_AUTH_LOADING_VALUE),
        UNKNOWN_QUERY_PARAMETER(EnumC0170g.SDK_ASSET_ANIMATION_MOBILE_AUTH_LOADING_DARK_APPEARANCE_VALUE),
        UNKNOWN_BODY_PARAMETER(EnumC0170g.SDK_ASSET_ICON_INLINE_LIGHTNING_VALUE),
        INVALID_CONTENT_TYPE(EnumC0170g.SDK_ASSET_ICON_INLINE_LIGHTNING_DARK_APPEARANCE_VALUE),
        MISSING_REGION(EnumC0170g.SDK_ASSET_ILLUSTRATION_CLIPBOARD_CIRCLE_VALUE),
        INVALID_REGION(EnumC0170g.SDK_ASSET_ILLUSTRATION_CLIPBOARD_CIRCLE_DARK_APPEARANCE_VALUE),
        FEATURE_DISABLED(EnumC0170g.SDK_ASSET_PLAID_LOGO_LOADING_INDICATOR_VALUE),
        VERSION_MISMATCH(EnumC0170g.SDK_ASSET_PLAID_LOGO_LOADING_INDICATOR_DARK_APPEARANCE_VALUE),
        EXPECTED_STRING(400),
        VALUE_TOO_LONG(HttpStatusCode.UNAUTHORIZED_401),
        VALUE_TOO_SHORT(402),
        VALUE_EMPTY(403),
        INVALID_ENUM_VALUE(HttpStatusCode.NOT_FOUND_404),
        VALUE_REGEX_MISMATCH(405),
        INVALID_TIME(406),
        INVALID_EMAIL_ADDRESS(407),
        INVALID_PHONE_NUMBER(408),
        INVALID_URL(HttpStatusCode.CONFLICT_409),
        FILE_TOO_LARGE(410),
        FILE_EMPTY(414),
        INVALID_WALLET_ADDRESS(411),
        INVALID_BANK_ACCOUNT_NUMBER(412),
        INVALID_BANK_IDENTIFICATION_NUMBER(HttpStatusCode.PAYLOAD_TOO_LARGE_413),
        INVALID_DATE_RANGE(415),
        EXPECTED_INTEGER(500),
        VALUE_TOO_HIGH(501),
        VALUE_TOO_LOW(HttpStatusCode.BAD_GATEWAY_502),
        EXPECTED_BOOLEAN(600),
        EXPECTED_ARRAY(700),
        ARRAY_LENGTH_TOO_LONG(701),
        ARRAY_LENGTH_TOO_SHORT(702),
        INVALID_ARRAY_TYPE(703),
        ARRAY_CONTAINS_DUPLICATES(704),
        EXPECTED_OBJECT(800),
        NOT_FOUND(900),
        CONFLICT(901),
        INVALID_CURSOR(902),
        IDEMPOTENCY_KEY_REUSED(903),
        RATE_LIMITED(904),
        INVALID_STATE_TRANSITION(905),
        CLIENT_NOT_FOUND(906),
        IDEMPOTENCY_PAYLOAD_MISMATCH(907),
        MERCHANT_NOT_FOUND(IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO),
        PAYMENT_NOT_FOUND(IptcConstants.IMAGE_RESOURCE_BLOCK_MACINTOSH_PRINT_INFO),
        REFUND_NOT_FOUND(IptcConstants.IMAGE_RESOURCE_BLOCK_XML_DATA),
        CUSTOMER_DISABLED(IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_COLOR_TABLE),
        MERCHANT_DISABLED(1004),
        MERCHANT_PENDING(IptcConstants.IMAGE_RESOURCE_BLOCK_RESOLUTION_INFO),
        PAYMENT_DECLINED_COMPLIANCE(IptcConstants.IMAGE_RESOURCE_BLOCK_ALPHA_CHANNELS_NAMES),
        PAYMENT_DECLINED_INSUFFICIENT_FUNDS(IptcConstants.IMAGE_RESOURCE_BLOCK_DISPLAY_INFO),
        PAYMENT_DECLINED_LIMIT_REACHED(IptcConstants.IMAGE_RESOURCE_BLOCK_PSTRING_CAPTION),
        PAYMENT_DECLINED_OTHER(IptcConstants.IMAGE_RESOURCE_BLOCK_BORDER_INFORMATION),
        PAYMENT_DECLINED_RISK(IptcConstants.IMAGE_RESOURCE_BLOCK_BACKGROUND_COLOR),
        PAYMENT_INVALID_AMOUNT_MISMATCH(IptcConstants.IMAGE_RESOURCE_BLOCK_PRINT_FLAGS),
        PAYMENT_INVALID_CURRENCY_MISMATCH(IptcConstants.IMAGE_RESOURCE_BLOCK_BW_HALFTONING_INFO),
        PAYMENT_INVALID_TOO_LARGE(IptcConstants.IMAGE_RESOURCE_BLOCK_COLOR_HALFTONING_INFO),
        PAYMENT_INVALID_TOO_SMALL(IptcConstants.IMAGE_RESOURCE_BLOCK_DUOTONE_HALFTONING_INFO),
        REFUND_DECLINED_COMPLIANCE(IptcConstants.IMAGE_RESOURCE_BLOCK_BW_TRANSFER_FUNC),
        REFUND_DECLINED_OTHER(IptcConstants.IMAGE_RESOURCE_BLOCK_COLOR_TRANSFER_FUNCS),
        REFUND_DECLINED_RISK(IptcConstants.IMAGE_RESOURCE_BLOCK_DUOTONE_TRANSFER_FUNCS),
        REFUND_INVALID_AMOUNT_MISMATCH(IptcConstants.IMAGE_RESOURCE_BLOCK_DUOTONE_IMAGE_INFO),
        REFUND_INVALID_CURRENCY_MISMATCH(IptcConstants.IMAGE_RESOURCE_BLOCK_EFFECTIVE_BW),
        REFUND_INVALID_PAYMENT_UNCAPTURED(IptcConstants.IMAGE_RESOURCE_BLOCK_OBSOLETE_PHOTOSHOP_TAG1),
        REFUND_INVALID_TOO_LARGE(IptcConstants.IMAGE_RESOURCE_BLOCK_EPS_OPTIONS),
        REFUND_INVALID_TOO_SMALL(IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO),
        PAYMENT_INVALID_SCOPE_MISMATCH(IptcConstants.IMAGE_RESOURCE_BLOCK_OBSOLETE_PHOTOSHOP_TAG2),
        REFUND_INVALID_SCOPE_MISMATCH(1024),
        MISSING_SETTLEMENT_CONFIGURATION(IptcConstants.IMAGE_RESOURCE_BLOCK_WORKING_PATH),
        MISSING_REPORTING_CONFIGURATION(IptcConstants.IMAGE_RESOURCE_BLOCK_LAYERS_GROUP_INFO),
        LIGHTNING_PAYMENT_NO_ROUTE_FOUND(IptcConstants.IMAGE_RESOURCE_BLOCK_OBSOLETE_PHOTOSHOP_TAG3),
        LIGHTNING_INVOICE_EXPIRED(IptcConstants.IMAGE_RESOURCE_BLOCK_IPTC_DATA),
        INCREMENTAL_AUTHORIZATION_DECLINED_ATTEMPT_LIMIT_REACHED(IptcConstants.IMAGE_RESOURCE_BLOCK_RAW_IMAGE_MODE),
        PAYMENT_DECLINED_CUSTOMER_BLOCKED_MERCHANT(IptcConstants.IMAGE_RESOURCE_BLOCK_JPEG_QUALITY),
        PAYMENT_DECLINED_SELF_SEND(1031),
        PAYMENT_PRE_FUNDING_FAILED(IptcConstants.IMAGE_RESOURCE_BLOCK_GRID_GUIDES_INFO),
        BRAND_NOT_FOUND(1100),
        MERCHANT_MISSING_ADDRESS_OR_SITE(1101),
        GRANT_ACTION_TYPE_MISMATCH(1200),
        GRANT_CONSUMED(1201),
        GRANT_EXPIRED(1202),
        GRANT_NOT_FOUND(1203),
        GRANT_REVOKED(1204),
        GRANT_INVALID_SCOPE_MISMATCH(1205),
        DISPUTE_MISSING_EVIDENCE(1300),
        API_KEY_INVALID_TOO_MANY(1400),
        WEBHOOK_ENDPOINT_NOT_FOUND(1500),
        WEBHOOK_ENDPOINT_TOO_MANY(1501),
        CUSTOMER_UNSUPPORTED_REGION(1600),
        CUSTOMER_NOT_VERIFIED(1601),
        CUSTOMER_MISSING_INSTRUMENT(1602),
        CUSTOMER_DELETED_ACCOUNT(1603),
        TOO_FEW_MAP_ENTRIES(1700),
        TOO_MANY_MAP_ENTRIES(1701),
        INVALID_SUB_REQUEST_BODY(1800),
        SUB_REQUEST_NOT_FOUND(1801),
        ORDER_TOTAL_TOO_HIGH(1900),
        ORDER_TOTAL_TOO_LOW(1901),
        ORDER_LINE_ITEM_MISMATCH(1902),
        BANK_ACCOUNT_DISABLED(2000),
        PAYOUT_DECLINED_INSUFFICIENT_FUNDS(2100),
        PAYOUT_INVALID_CURRENCY(2101),
        PAYOUT_DECLINED_RISK(2102),
        PAYOUT_DECLINED_OTHER(2103),
        PAYOUT_DECLINED_LIMIT_REACHED(2104);

        public final int value;
        public static final Companion Companion = new Companion(0);
        public static final Error$Code$Companion$ADAPTER$1 ADAPTER = new Error$Code$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Code.class), Syntax.PROTO_2, null);

        Code(int i) {
            this.value = i;
        }

        public static final Code fromValue(int i) {
            Companion.getClass();
            return Companion.m3837fromValue(i);
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }

        public final class Companion implements ClientRenderableUi {
            public final /* synthetic */ int $r8$classId;

            public Companion(FeatureFlagManager featureFlagManager) {
                this.$r8$classId = 8;
            }

            public static final void access$bindArgs(SupportSQLiteProgram supportSQLiteProgram, List list) {
                int i = 0;
                for (Object obj : list) {
                    int i2 = i + 1;
                    if (i < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                        throw null;
                    }
                    SqlType sqlType = (SqlType) obj;
                    if (sqlType instanceof SqlType.Boolean) {
                        supportSQLiteProgram.bindLong(i2, ((SqlType.Boolean) sqlType).value ? 1L : 0L);
                    } else if (sqlType instanceof SqlType.Bytes) {
                        supportSQLiteProgram.bindBlob(i2, ((SqlType.Bytes) sqlType).value);
                    } else if (sqlType instanceof SqlType.Double) {
                        supportSQLiteProgram.bindDouble(i2, ((SqlType.Double) sqlType).value);
                    } else if (sqlType instanceof SqlType.Long) {
                        supportSQLiteProgram.bindLong(i2, ((SqlType.Long) sqlType).value);
                    } else if (sqlType instanceof SqlType.String) {
                        supportSQLiteProgram.bindString(i2, ((SqlType.String) sqlType).value);
                    } else {
                        if (sqlType != null) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return;
                        }
                        supportSQLiteProgram.bindNull(i2);
                    }
                    i = i2;
                }
            }

            public static Map asBrandDetailsMap(LoaderState loaderState) {
                loaderState.getClass();
                if (loaderState instanceof LoaderState.Success) {
                    return (Map) ((LoaderState.Success) loaderState).data;
                }
                if (!(loaderState instanceof LoaderState.Loading) && !(loaderState instanceof LoaderState.Error)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                EmptyMap emptyMap = EmptyMap.INSTANCE;
                emptyMap.getClass();
                return emptyMap;
            }

            /* renamed from: fromValue, reason: collision with other method in class */
            public static Code m3837fromValue(int i) {
                if (i == 1100) {
                    return Code.BRAND_NOT_FOUND;
                }
                if (i == 1101) {
                    return Code.MERCHANT_MISSING_ADDRESS_OR_SITE;
                }
                switch (i) {
                    case 100:
                        return Code.INTERNAL_SERVER_ERROR;
                    case 101:
                        return Code.SERVICE_UNAVAILABLE;
                    case 102:
                        return Code.GATEWAY_TIMEOUT;
                    default:
                        switch (i) {
                            case 200:
                                return Code.UNAUTHORIZED;
                            case SDK_ASSET_ICON_CHEVRON_LEFT_DOUBLE_S2_VALUE:
                                return Code.ACCESS_TOKEN_REVOKED;
                            case SDK_ASSET_ICON_CHEVRON_RIGHT_DOUBLE_S1_VALUE:
                                return Code.ACCESS_TOKEN_EXPIRED;
                            case SDK_ASSET_ICON_CHEVRON_RIGHT_DOUBLE_S2_VALUE:
                                return Code.CLIENT_DISABLED;
                            case SDK_ASSET_ICON_CLEARED_REC_VALUE:
                                return Code.FORBIDDEN;
                            case SDK_ASSET_ICON_CLIPBOARD_VALUE:
                                return Code.INSUFFICIENT_SCOPES;
                            default:
                                switch (i) {
                                    case SDK_ASSET_TRANSFER_ICON_CIRCLE_VALUE:
                                        return Code.EXPECTED_JSON_BODY;
                                    case SDK_ASSET_CASH_ICON_CIRCLE_VALUE:
                                        return Code.MISSING_REQUIRED_PARAMETER;
                                    case SDK_ASSET_ANIMATION_MOBILE_AUTH_LOADING_VALUE:
                                        return Code.CONFLICTING_PARAMETERS;
                                    case SDK_ASSET_ANIMATION_MOBILE_AUTH_LOADING_DARK_APPEARANCE_VALUE:
                                        return Code.UNKNOWN_QUERY_PARAMETER;
                                    case SDK_ASSET_ICON_INLINE_LIGHTNING_VALUE:
                                        return Code.UNKNOWN_BODY_PARAMETER;
                                    case SDK_ASSET_ICON_INLINE_LIGHTNING_DARK_APPEARANCE_VALUE:
                                        return Code.INVALID_CONTENT_TYPE;
                                    case SDK_ASSET_ILLUSTRATION_CLIPBOARD_CIRCLE_VALUE:
                                        return Code.MISSING_REGION;
                                    case SDK_ASSET_ILLUSTRATION_CLIPBOARD_CIRCLE_DARK_APPEARANCE_VALUE:
                                        return Code.INVALID_REGION;
                                    case SDK_ASSET_PLAID_LOGO_LOADING_INDICATOR_VALUE:
                                        return Code.FEATURE_DISABLED;
                                    case SDK_ASSET_PLAID_LOGO_LOADING_INDICATOR_DARK_APPEARANCE_VALUE:
                                        return Code.VERSION_MISMATCH;
                                    default:
                                        switch (i) {
                                            case 400:
                                                return Code.EXPECTED_STRING;
                                            case HttpStatusCode.UNAUTHORIZED_401 /* 401 */:
                                                return Code.VALUE_TOO_LONG;
                                            case 402:
                                                return Code.VALUE_TOO_SHORT;
                                            case 403:
                                                return Code.VALUE_EMPTY;
                                            case HttpStatusCode.NOT_FOUND_404 /* 404 */:
                                                return Code.INVALID_ENUM_VALUE;
                                            case 405:
                                                return Code.VALUE_REGEX_MISMATCH;
                                            case 406:
                                                return Code.INVALID_TIME;
                                            case 407:
                                                return Code.INVALID_EMAIL_ADDRESS;
                                            case 408:
                                                return Code.INVALID_PHONE_NUMBER;
                                            case HttpStatusCode.CONFLICT_409 /* 409 */:
                                                return Code.INVALID_URL;
                                            case 410:
                                                return Code.FILE_TOO_LARGE;
                                            case 411:
                                                return Code.INVALID_WALLET_ADDRESS;
                                            case 412:
                                                return Code.INVALID_BANK_ACCOUNT_NUMBER;
                                            case HttpStatusCode.PAYLOAD_TOO_LARGE_413 /* 413 */:
                                                return Code.INVALID_BANK_IDENTIFICATION_NUMBER;
                                            case 414:
                                                return Code.FILE_EMPTY;
                                            case 415:
                                                return Code.INVALID_DATE_RANGE;
                                            default:
                                                switch (i) {
                                                    case 500:
                                                        return Code.EXPECTED_INTEGER;
                                                    case 501:
                                                        return Code.VALUE_TOO_HIGH;
                                                    case HttpStatusCode.BAD_GATEWAY_502 /* 502 */:
                                                        return Code.VALUE_TOO_LOW;
                                                    default:
                                                        if (i == 600) {
                                                            return Code.EXPECTED_BOOLEAN;
                                                        }
                                                        if (i == 800) {
                                                            return Code.EXPECTED_OBJECT;
                                                        }
                                                        if (i == 1300) {
                                                            return Code.DISPUTE_MISSING_EVIDENCE;
                                                        }
                                                        if (i == 1400) {
                                                            return Code.API_KEY_INVALID_TOO_MANY;
                                                        }
                                                        if (i == 2000) {
                                                            return Code.BANK_ACCOUNT_DISABLED;
                                                        }
                                                        if (i == 1500) {
                                                            return Code.WEBHOOK_ENDPOINT_NOT_FOUND;
                                                        }
                                                        if (i == 1501) {
                                                            return Code.WEBHOOK_ENDPOINT_TOO_MANY;
                                                        }
                                                        if (i == 1700) {
                                                            return Code.TOO_FEW_MAP_ENTRIES;
                                                        }
                                                        if (i == 1701) {
                                                            return Code.TOO_MANY_MAP_ENTRIES;
                                                        }
                                                        if (i == 1800) {
                                                            return Code.INVALID_SUB_REQUEST_BODY;
                                                        }
                                                        if (i == 1801) {
                                                            return Code.SUB_REQUEST_NOT_FOUND;
                                                        }
                                                        switch (i) {
                                                            case IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO /* 1000 */:
                                                                return Code.MERCHANT_NOT_FOUND;
                                                            case IptcConstants.IMAGE_RESOURCE_BLOCK_MACINTOSH_PRINT_INFO /* 1001 */:
                                                                return Code.PAYMENT_NOT_FOUND;
                                                            case IptcConstants.IMAGE_RESOURCE_BLOCK_XML_DATA /* 1002 */:
                                                                return Code.REFUND_NOT_FOUND;
                                                            case IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_COLOR_TABLE /* 1003 */:
                                                                return Code.CUSTOMER_DISABLED;
                                                            case 1004:
                                                                return Code.MERCHANT_DISABLED;
                                                            case IptcConstants.IMAGE_RESOURCE_BLOCK_RESOLUTION_INFO /* 1005 */:
                                                                return Code.MERCHANT_PENDING;
                                                            case IptcConstants.IMAGE_RESOURCE_BLOCK_ALPHA_CHANNELS_NAMES /* 1006 */:
                                                                return Code.PAYMENT_DECLINED_COMPLIANCE;
                                                            case IptcConstants.IMAGE_RESOURCE_BLOCK_DISPLAY_INFO /* 1007 */:
                                                                return Code.PAYMENT_DECLINED_INSUFFICIENT_FUNDS;
                                                            case IptcConstants.IMAGE_RESOURCE_BLOCK_PSTRING_CAPTION /* 1008 */:
                                                                return Code.PAYMENT_DECLINED_LIMIT_REACHED;
                                                            case IptcConstants.IMAGE_RESOURCE_BLOCK_BORDER_INFORMATION /* 1009 */:
                                                                return Code.PAYMENT_DECLINED_OTHER;
                                                            case IptcConstants.IMAGE_RESOURCE_BLOCK_BACKGROUND_COLOR /* 1010 */:
                                                                return Code.PAYMENT_DECLINED_RISK;
                                                            case IptcConstants.IMAGE_RESOURCE_BLOCK_PRINT_FLAGS /* 1011 */:
                                                                return Code.PAYMENT_INVALID_AMOUNT_MISMATCH;
                                                            case IptcConstants.IMAGE_RESOURCE_BLOCK_BW_HALFTONING_INFO /* 1012 */:
                                                                return Code.PAYMENT_INVALID_CURRENCY_MISMATCH;
                                                            case IptcConstants.IMAGE_RESOURCE_BLOCK_COLOR_HALFTONING_INFO /* 1013 */:
                                                                return Code.PAYMENT_INVALID_TOO_LARGE;
                                                            case IptcConstants.IMAGE_RESOURCE_BLOCK_DUOTONE_HALFTONING_INFO /* 1014 */:
                                                                return Code.PAYMENT_INVALID_TOO_SMALL;
                                                            case IptcConstants.IMAGE_RESOURCE_BLOCK_BW_TRANSFER_FUNC /* 1015 */:
                                                                return Code.REFUND_DECLINED_COMPLIANCE;
                                                            case IptcConstants.IMAGE_RESOURCE_BLOCK_COLOR_TRANSFER_FUNCS /* 1016 */:
                                                                return Code.REFUND_DECLINED_OTHER;
                                                            case IptcConstants.IMAGE_RESOURCE_BLOCK_DUOTONE_TRANSFER_FUNCS /* 1017 */:
                                                                return Code.REFUND_DECLINED_RISK;
                                                            case IptcConstants.IMAGE_RESOURCE_BLOCK_DUOTONE_IMAGE_INFO /* 1018 */:
                                                                return Code.REFUND_INVALID_AMOUNT_MISMATCH;
                                                            case IptcConstants.IMAGE_RESOURCE_BLOCK_EFFECTIVE_BW /* 1019 */:
                                                                return Code.REFUND_INVALID_CURRENCY_MISMATCH;
                                                            case IptcConstants.IMAGE_RESOURCE_BLOCK_OBSOLETE_PHOTOSHOP_TAG1 /* 1020 */:
                                                                return Code.REFUND_INVALID_PAYMENT_UNCAPTURED;
                                                            case IptcConstants.IMAGE_RESOURCE_BLOCK_EPS_OPTIONS /* 1021 */:
                                                                return Code.REFUND_INVALID_TOO_LARGE;
                                                            case IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO /* 1022 */:
                                                                return Code.REFUND_INVALID_TOO_SMALL;
                                                            case IptcConstants.IMAGE_RESOURCE_BLOCK_OBSOLETE_PHOTOSHOP_TAG2 /* 1023 */:
                                                                return Code.PAYMENT_INVALID_SCOPE_MISMATCH;
                                                            case 1024:
                                                                return Code.REFUND_INVALID_SCOPE_MISMATCH;
                                                            case IptcConstants.IMAGE_RESOURCE_BLOCK_WORKING_PATH /* 1025 */:
                                                                return Code.MISSING_SETTLEMENT_CONFIGURATION;
                                                            case IptcConstants.IMAGE_RESOURCE_BLOCK_LAYERS_GROUP_INFO /* 1026 */:
                                                                return Code.MISSING_REPORTING_CONFIGURATION;
                                                            case IptcConstants.IMAGE_RESOURCE_BLOCK_OBSOLETE_PHOTOSHOP_TAG3 /* 1027 */:
                                                                return Code.LIGHTNING_PAYMENT_NO_ROUTE_FOUND;
                                                            case IptcConstants.IMAGE_RESOURCE_BLOCK_IPTC_DATA /* 1028 */:
                                                                return Code.LIGHTNING_INVOICE_EXPIRED;
                                                            case IptcConstants.IMAGE_RESOURCE_BLOCK_RAW_IMAGE_MODE /* 1029 */:
                                                                return Code.INCREMENTAL_AUTHORIZATION_DECLINED_ATTEMPT_LIMIT_REACHED;
                                                            case IptcConstants.IMAGE_RESOURCE_BLOCK_JPEG_QUALITY /* 1030 */:
                                                                return Code.PAYMENT_DECLINED_CUSTOMER_BLOCKED_MERCHANT;
                                                            case 1031:
                                                                return Code.PAYMENT_DECLINED_SELF_SEND;
                                                            case IptcConstants.IMAGE_RESOURCE_BLOCK_GRID_GUIDES_INFO /* 1032 */:
                                                                return Code.PAYMENT_PRE_FUNDING_FAILED;
                                                            default:
                                                                switch (i) {
                                                                    case 1600:
                                                                        return Code.CUSTOMER_UNSUPPORTED_REGION;
                                                                    case 1601:
                                                                        return Code.CUSTOMER_NOT_VERIFIED;
                                                                    case 1602:
                                                                        return Code.CUSTOMER_MISSING_INSTRUMENT;
                                                                    case 1603:
                                                                        return Code.CUSTOMER_DELETED_ACCOUNT;
                                                                    default:
                                                                        switch (i) {
                                                                            case 1900:
                                                                                return Code.ORDER_TOTAL_TOO_HIGH;
                                                                            case 1901:
                                                                                return Code.ORDER_TOTAL_TOO_LOW;
                                                                            case 1902:
                                                                                return Code.ORDER_LINE_ITEM_MISMATCH;
                                                                            default:
                                                                                switch (i) {
                                                                                    case 2100:
                                                                                        return Code.PAYOUT_DECLINED_INSUFFICIENT_FUNDS;
                                                                                    case 2101:
                                                                                        return Code.PAYOUT_INVALID_CURRENCY;
                                                                                    case 2102:
                                                                                        return Code.PAYOUT_DECLINED_RISK;
                                                                                    case 2103:
                                                                                        return Code.PAYOUT_DECLINED_OTHER;
                                                                                    case 2104:
                                                                                        return Code.PAYOUT_DECLINED_LIMIT_REACHED;
                                                                                    default:
                                                                                        switch (i) {
                                                                                            case 700:
                                                                                                return Code.EXPECTED_ARRAY;
                                                                                            case 701:
                                                                                                return Code.ARRAY_LENGTH_TOO_LONG;
                                                                                            case 702:
                                                                                                return Code.ARRAY_LENGTH_TOO_SHORT;
                                                                                            case 703:
                                                                                                return Code.INVALID_ARRAY_TYPE;
                                                                                            case 704:
                                                                                                return Code.ARRAY_CONTAINS_DUPLICATES;
                                                                                            default:
                                                                                                switch (i) {
                                                                                                    case 900:
                                                                                                        return Code.NOT_FOUND;
                                                                                                    case 901:
                                                                                                        return Code.CONFLICT;
                                                                                                    case 902:
                                                                                                        return Code.INVALID_CURSOR;
                                                                                                    case 903:
                                                                                                        return Code.IDEMPOTENCY_KEY_REUSED;
                                                                                                    case 904:
                                                                                                        return Code.RATE_LIMITED;
                                                                                                    case 905:
                                                                                                        return Code.INVALID_STATE_TRANSITION;
                                                                                                    case 906:
                                                                                                        return Code.CLIENT_NOT_FOUND;
                                                                                                    case 907:
                                                                                                        return Code.IDEMPOTENCY_PAYLOAD_MISMATCH;
                                                                                                    default:
                                                                                                        switch (i) {
                                                                                                            case 1200:
                                                                                                                return Code.GRANT_ACTION_TYPE_MISMATCH;
                                                                                                            case 1201:
                                                                                                                return Code.GRANT_CONSUMED;
                                                                                                            case 1202:
                                                                                                                return Code.GRANT_EXPIRED;
                                                                                                            case 1203:
                                                                                                                return Code.GRANT_NOT_FOUND;
                                                                                                            case 1204:
                                                                                                                return Code.GRANT_REVOKED;
                                                                                                            case 1205:
                                                                                                                return Code.GRANT_INVALID_SCOPE_MISMATCH;
                                                                                                            default:
                                                                                                                return null;
                                                                                                        }
                                                                                                }
                                                                                        }
                                                                                }
                                                                        }
                                                                }
                                                        }
                                                }
                                        }
                                }
                        }
                }
            }

            public static SellerCardViewModel toSellerCardViewModel(Merchant merchant, Map map) {
                ThemedImage themedImage;
                ThemedImage themedImage2;
                ThemedColor themedColor;
                ThemedColor themedColor2;
                ThemedColor themedColor3;
                ThemedColor themedColor4;
                ThemedColor themedColor5;
                ThemedColor themedColor6;
                String str;
                map.getClass();
                if (merchant == null) {
                    return SellerCardViewModel.FALLBACK;
                }
                MerchantIdentifier identifier = LocalPresenterFactoryKt.getIdentifier(merchant);
                String str2 = null;
                BrandDetails brandDetails = (identifier == null || (str = identifier.token) == null) ? null : (BrandDetails) map.get(str);
                String initials = MerchantKt.getInitials(merchant);
                if (initials.length() == 0) {
                    initials = "?";
                }
                String str3 = initials;
                String str4 = (brandDetails == null || (themedColor6 = brandDetails.foregroundColor) == null) ? null : themedColor6.lightHex;
                String str5 = (brandDetails == null || (themedColor5 = brandDetails.foregroundColor) == null) ? null : themedColor5.darkHex;
                String str6 = (brandDetails == null || (themedColor4 = brandDetails.backgroundColor) == null) ? null : themedColor4.lightHex;
                String str7 = (brandDetails == null || (themedColor3 = brandDetails.backgroundColor) == null) ? null : themedColor3.darkHex;
                String str8 = (brandDetails == null || (themedColor2 = brandDetails.outlineColor) == null) ? null : themedColor2.lightHex;
                String str9 = (brandDetails == null || (themedColor = brandDetails.outlineColor) == null) ? null : themedColor.darkHex;
                String str10 = (brandDetails == null || (themedImage2 = brandDetails.artworkImage) == null) ? null : themedImage2.lightUrl;
                if (brandDetails != null && (themedImage = brandDetails.artworkImage) != null) {
                    str2 = themedImage.darkUrl;
                }
                return new SellerCardViewModel(str3, str4, str5, str6, str7, str8, str9, str10, str2);
            }

            public void Content(SuggestionListViewModel suggestionListViewModel, Function1 function1, Composer composer, int i) {
                GapComposer gapComposer = (GapComposer) composer;
                gapComposer.startRestartGroup(-220933036);
                int i2 = (gapComposer.changedInstance(suggestionListViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
                if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
                    TextCardKt.SuggestionList(suggestionListViewModel, function1, null, gapComposer, i2 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.block = new MusicViewKt$$ExternalSyntheticLambda5((Object) this, (Object) suggestionListViewModel, (Function) function1, i, 8);
                }
            }

            public /* synthetic */ Companion(int i) {
                this.$r8$classId = i;
            }

            public void Content(BriefViewModel briefViewModel, Function1 function1, Composer composer, int i) {
                GapComposer gapComposer = (GapComposer) composer;
                gapComposer.startRestartGroup(-1510859940);
                int i2 = (gapComposer.changedInstance(briefViewModel) ? 4 : 2) | i;
                if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
                    BriefKt.Brief(briefViewModel, null, gapComposer, i2 & 14);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.block = new MusicViewKt$$ExternalSyntheticLambda5((Object) this, (Object) briefViewModel, (Function) function1, i, 2);
                }
            }

            @Override // com.squareup.cash.moneybot.components.api.ClientRenderableUi
            public void Content(Object obj, Function1 function1, Composer composer) {
                switch (this.$r8$classId) {
                    case 1:
                        Content((BriefViewModel) obj, function1, composer, 0);
                        break;
                    case 2:
                        Content((SuggestionListViewModel) obj, function1, composer, 0);
                        break;
                    default:
                        GapComposer gapComposer = (GapComposer) composer;
                        gapComposer.startReplaceGroup(460261144);
                        ActionCardKt.ActionCard((ActionCardViewModel) obj, null, function1, gapComposer, 0);
                        gapComposer.end(false);
                        break;
                }
            }

            /* renamed from: fromValue, reason: collision with other method in class */
            public static DisablePreferenceReason m3838fromValue(int i) {
                switch (i) {
                    case 1:
                        return DisablePreferenceReason.USER_DISABLED;
                    case 2:
                        return DisablePreferenceReason.ADMIN_DISABLED;
                    case 3:
                        return DisablePreferenceReason.INSTRUMENT_UNLINKED;
                    case 4:
                        return DisablePreferenceReason.OVERDRAFT_DETECTED;
                    case 5:
                        return DisablePreferenceReason.OVERDUE_LOAN_DETECTED;
                    case 6:
                        return DisablePreferenceReason.AUTO_RELOAD_FAILED;
                    case 7:
                        return DisablePreferenceReason.CASH_OUT_BELOW_MINIMUM;
                    case 8:
                        return DisablePreferenceReason.ELIGIBILITY_VIOLATION;
                    case 9:
                        return DisablePreferenceReason.EXPIRED_OR_INACTIVE_DEBIT_CARD;
                    default:
                        return null;
                }
            }

            /* renamed from: fromValue, reason: collision with other method in class */
            public static BlockingContext m3839fromValue(int i) {
                switch (i) {
                    case 0:
                        return BlockingContext.UNSPECIFIED;
                    case 1:
                        return BlockingContext.PROFILE_BLOCK;
                    case 2:
                        return BlockingContext.PROFILE_REPORT;
                    case 3:
                        return BlockingContext.ACTIVITY_BLOCK;
                    case 4:
                        return BlockingContext.ACTIVITY_REPORT;
                    case 5:
                        return BlockingContext.BLOCKLIST;
                    case 6:
                        return BlockingContext.FAMILY_ACTIVITY_BLOCK;
                    case 7:
                        return BlockingContext.FAMILY_BLOCKLIST;
                    case 8:
                        return BlockingContext.SPONSORSHIP_CANCELLATION;
                    case 9:
                        return BlockingContext.BLOCK_SEARCH;
                    case 10:
                        return BlockingContext.FAMILY_BLOCK_SEARCH;
                    case 11:
                        return BlockingContext.BACKFILL;
                    case 12:
                        return BlockingContext.SPONSOR_P2P_APPROVAL;
                    case 13:
                        return BlockingContext.LEAVE_MONEY_POOL;
                    case 14:
                        return BlockingContext.SPONSORSHIP_ACTIVATION;
                    default:
                        return null;
                }
            }

            /* renamed from: fromValue, reason: collision with other method in class */
            public static CapabilityName m3840fromValue(int i) {
                if (i == 0) {
                    return CapabilityName.UNDEFINED;
                }
                if (i == 1) {
                    return CapabilityName.CRYPTO_BITCOIN;
                }
                if (i != 2) {
                    switch (i) {
                        case 5:
                            return CapabilityName.CRYPTO_BITCOIN_DEPOSIT;
                        case 6:
                            return CapabilityName.CRYPTO_BITCOIN_WITHDRAW;
                        case 7:
                            return CapabilityName.CRYPTO_BITCOIN_LIGHTNING;
                        case 8:
                            return CapabilityName.CARDS;
                        case 9:
                            return CapabilityName.INVESTING;
                        case 10:
                            return CapabilityName.BANKING;
                        case 11:
                            return CapabilityName.FIAT_P2P;
                        case 12:
                            return CapabilityName.FIAT_P2P_MULTI_CURRENCY_SELECTION;
                        case 13:
                            return CapabilityName.ONBOARDING_IDV_INTERNATIONAL;
                        case 14:
                            return CapabilityName.CRYPTO_BITCOIN_LIGHTNING_DEPOSIT;
                        case 15:
                            return CapabilityName.CRYPTO_BITCOIN_LIGHTNING_WITHDRAW;
                        case 16:
                            return CapabilityName.CRYPTO_BITCOIN_BUY_MARKET;
                        case 17:
                            return CapabilityName.CRYPTO_BITCOIN_SELL_MARKET;
                        case 18:
                            return CapabilityName.CRYPTO_BITCOIN_BUY_CUSTOM;
                        case 19:
                            return CapabilityName.CRYPTO_BITCOIN_AUTO_INVEST_BUY;
                        case 20:
                            return CapabilityName.CRYPTO_BITCOIN_PAYROLL;
                        case 21:
                            return CapabilityName.CRYPTO_BITCOIN_ROUNDUP;
                        case 22:
                            return CapabilityName.CRYPTO_BITCOIN_BOOSTS;
                        case 23:
                            return CapabilityName.CRYPTO_BITCOIN_GIFTING;
                        case 24:
                            return CapabilityName.CRYPTO_BITCOIN_SELL_CUSTOM;
                        case 25:
                            return CapabilityName.CRYPTO_XUS;
                        case 26:
                            return CapabilityName.CRYPTO_FIAT_TO_XUS_MARKET;
                        case 27:
                            return CapabilityName.CRYPTO_BTC_TO_XUS_MARKET;
                        case 28:
                            return CapabilityName.CRYPTO_XUS_TO_BTC_MARKET;
                        case 29:
                            return CapabilityName.CRYPTO_XUS_TO_FIAT_MARKET;
                        case 30:
                            return CapabilityName.CRYPTO_XUS_P2P;
                        case 31:
                            return CapabilityName.CRYPTO_BITKEY_TRANSFER;
                        case 32:
                            return CapabilityName.CRYPTO_BITKEY_BUY_AND_TRANSFER;
                        case 33:
                            return CapabilityName.CRYPTO_BITKEY_SELL;
                        case 34:
                            return CapabilityName.CRYPTO_STABLECOIN_WITHDRAW;
                        case 35:
                            return CapabilityName.CRYPTO_STABLECOIN_DEPOSIT;
                        case 36:
                            return CapabilityName.CRYPTO_BTC_MAP;
                        default:
                            return null;
                    }
                }
                return CapabilityName.CRYPTO_BITCOIN_P2P;
            }

            /* renamed from: fromValue, reason: collision with other method in class */
            public static SupportArticle.Appearance m3836fromValue(int i) {
                if (i == 0) {
                    return SupportArticle.Appearance.APPEARANCE_UNSPECIFIED;
                }
                if (i == 1) {
                    return SupportArticle.Appearance.APPEARANCE_ARTICLE;
                }
                if (i == 2) {
                    return SupportArticle.Appearance.APPEARANCE_CATEGORY;
                }
                if (i == 3) {
                    return SupportArticle.Appearance.APPEARANCE_SUBCATEGORY;
                }
                if (i != 4) {
                    return null;
                }
                return SupportArticle.Appearance.APPEARANCE_ISSUE;
            }

            /* renamed from: fromValue, reason: collision with other method in class */
            public static ScheduledPaymentStatus m3841fromValue(int i) {
                switch (i) {
                    case 1:
                        return ScheduledPaymentStatus.SCHEDULED_PAYMENT_STATUS_UNSPECIFIED;
                    case 2:
                        return ScheduledPaymentStatus.SCHEDULED_PAYMENT_STATUS_OWED;
                    case 3:
                        return ScheduledPaymentStatus.SCHEDULED_PAYMENT_STATUS_PAID;
                    case 4:
                        return ScheduledPaymentStatus.SCHEDULED_PAYMENT_STATUS_OVERDUE;
                    case 5:
                        return ScheduledPaymentStatus.SCHEDULED_PAYMENT_STATUS_REFUNDED;
                    case 6:
                        return ScheduledPaymentStatus.SCHEDULED_PAYMENT_STATUS_DEFERRED;
                    case 7:
                        return ScheduledPaymentStatus.SCHEDULED_PAYMENT_STATUS_PAYMENT_PENDING;
                    case 8:
                        return ScheduledPaymentStatus.SCHEDULED_PAYMENT_STATUS_PARTIALLY_REFUNDED;
                    case 9:
                        return ScheduledPaymentStatus.SCHEDULED_PAYMENT_STATUS_CANCELED;
                    case 10:
                        return ScheduledPaymentStatus.SCHEDULED_PAYMENT_STATUS_ON_HOLD;
                    default:
                        return null;
                }
            }

            public static ComposePlatform.FontWeight fromValue(int i) {
                switch (i) {
                    case 0:
                        return ComposePlatform.FontWeight.FONT_WEIGHT_UNSPECIFIED;
                    case 1:
                        return ComposePlatform.FontWeight.FONT_WEIGHT_THIN;
                    case 2:
                        return ComposePlatform.FontWeight.FONT_WEIGHT_EXTRA_LIGHT;
                    case 3:
                        return ComposePlatform.FontWeight.FONT_WEIGHT_LIGHT;
                    case 4:
                        return ComposePlatform.FontWeight.FONT_WEIGHT_NORMAL;
                    case 5:
                        return ComposePlatform.FontWeight.FONT_WEIGHT_MEDIUM;
                    case 6:
                        return ComposePlatform.FontWeight.FONT_WEIGHT_SEMI_BOLD;
                    case 7:
                        return ComposePlatform.FontWeight.FONT_WEIGHT_BOLD;
                    case 8:
                        return ComposePlatform.FontWeight.FONT_WEIGHT_EXTRA_BOLD;
                    case 9:
                        return ComposePlatform.FontWeight.FONT_WEIGHT_BLACK;
                    default:
                        return null;
                }
            }
        }
    }

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public Object category;
        public Object code;
        public Object description;
        public Object field;
        public Object metadata;
        public Object retryable;

        public Builder(int i) {
            this.$r8$classId = i;
            switch (i) {
                case 17:
                    EmptyList emptyList = EmptyList.INSTANCE;
                    this.category = emptyList;
                    this.field = emptyList;
                    break;
                default:
                    this.category = EmptyList.INSTANCE;
                    break;
            }
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new Error((Category) this.category, (Code) this.code, (String) this.description, (String) this.field, (Boolean) this.retryable, (AnyMessage) this.metadata, buildUnknownFields());
                case 1:
                    return new ActionableButtonCtaGroup((ActionableButtonDefault) this.category, (ActionableButtonDefault) this.code, (ActionableButtonDefault) this.description, (ButtonCtaGroup.Direction) this.field, (LocalizedString) this.metadata, (Boolean) this.retryable, buildUnknownFields());
                case 2:
                    return new RestrictedItemCheckRequest((List) this.category, (RestrictedItemCheckRequest.PaymentMethod) this.code, (String) this.description, (String) this.field, (String) this.retryable, (String) this.metadata, buildUnknownFields());
                case 3:
                    return new BinfoDetails((String) this.description, (Country) this.category, (String) this.field, (PrepaidStatus) this.code, (String) this.retryable, (CardProduct) this.metadata, buildUnknownFields());
                case 4:
                    return new Schedule((Schedule.Cadence) this.category, (Integer) this.code, (Long) this.retryable, (String) this.description, (String) this.field, (Date) this.metadata, buildUnknownFields());
                case 5:
                    return new SupportLink((String) this.description, (String) this.field, (AnnexBUtils) this.category, (List) this.code, (String) this.metadata, (Boolean) this.retryable, buildUnknownFields());
                case 6:
                    return new CashCreditScoreHomeData.ScoreSummaryOverlayData((LocalizedString) this.category, (LocalizedString) this.code, (LocalizedString) this.description, (List) this.field, (CashCreditScoreHomeData.DisclaimerSection) this.metadata, (Boolean) this.retryable, buildUnknownFields());
                case 7:
                    return new CashCreditScoreHomeData.ScoreSummaryOverlayData.ListItem((LocalizedString) this.category, (LocalizedString) this.code, (Icon) this.description, (LocalizedString) this.field, (LocalizedString) this.retryable, (Color) this.metadata, buildUnknownFields());
                case 8:
                    return new SafetyEducationPage((String) this.description, (LocalizedString) this.category, (List) this.code, (ContentSection) this.field, (DropDownSection) this.retryable, (LinkSection) this.metadata, buildUnknownFields());
                case 9:
                    return new RequestMetadata((ByteString) this.category, (InternalRegion) this.code, (Integer) this.field, (String) this.description, (Boolean) this.retryable, (ByteString) this.metadata, buildUnknownFields());
                case 10:
                    return new AllowlistCustomer((BlocklyCustomerMetadata) this.category, (Boolean) this.retryable, (String) this.description, (Long) this.code, (Long) this.field, (Long) this.metadata, buildUnknownFields());
                case 11:
                    return new ReportAbuseRequest((Boolean) this.retryable, (String) this.description, (String) this.field, (RequestContext) this.category, (String) this.code, (BlockingContext) this.metadata, buildUnknownFields());
                case 12:
                    return new AfterpayHubRowItem((Avatar) this.category, (Text) this.code, (Text) this.retryable, (String) this.description, (String) this.field, (LocalErrorKt) this.metadata, buildUnknownFields());
                case 13:
                    return new OrderPaymentMethod((Image) this.category, (Text) this.code, (Text) this.field, (Text) this.retryable, (Text) this.metadata, (String) this.description, buildUnknownFields());
                case 14:
                    return new SingleUsePaymentSummary((Text) this.category, (Money) this.code, (Money) this.description, (Text) this.field, (Text) this.retryable, (Image) this.metadata, buildUnknownFields());
                case 15:
                    return new BusinessProfileData((String) this.description, (String) this.field, (BusinessCategory) this.category, (LocalizedString) this.code, (String) this.retryable, (Image) this.metadata, buildUnknownFields());
                case 16:
                    return new CustomerData((Integer) this.category, (Integer) this.code, (Money) this.retryable, (String) this.description, (String) this.field, (String) this.metadata, buildUnknownFields());
                case 17:
                    String str = (String) this.description;
                    List list = (List) this.category;
                    ReportState reportState = (ReportState) this.code;
                    if (reportState != null) {
                        return new GetProfileDetailsResponse(str, list, reportState, (List) this.field, (AnalyticsData) this.retryable, (LocalMoneysKt) this.metadata, buildUnknownFields());
                    }
                    TransactorKt.missingRequiredFields(reportState, "report_state");
                    throw null;
                case 18:
                    return new GenericProfileElement.TrustElement((Image) this.category, (String) this.description, (Boolean) this.retryable, (GenericProfileElement.TrustElement.Id) this.code, (Icon) this.field, (Icon) this.metadata, buildUnknownFields());
                case 19:
                    return new LightningReceiveArtifact((String) this.description, (String) this.field, (Long) this.category, (String) this.code, (LightningInvoiceState) this.retryable, (Long) this.metadata, buildUnknownFields());
                case 20:
                    return new BusinessMetadata((CashAppGenericBusinessMetadata) this.category, (AfterpayAppMetadata) this.code, (CashAppAfterpayMetadata) this.description, (CashAppPayLaterMetadata) this.field, (CashAppPayLaterMetadata) this.retryable, (AfterpayAppMetadata) this.metadata, buildUnknownFields());
                case 21:
                    return new CashAppPayLaterMetadata((String) this.description, (List) this.category, (String) this.field, (String) this.code, (Boolean) this.retryable, (Money) this.metadata, buildUnknownFields());
                case 22:
                    return new AfterpayAppletActivityResponse((LocalizedString) this.category, (LocalizedString) this.code, (LocalizedString) this.description, (LocalizedString) this.field, (LocalizedString) this.retryable, (Footer) this.metadata, buildUnknownFields());
                case 23:
                    return new AfterpayAppletHomeSection((SectionHeader) this.category, (LocalMenuSelectorKt) this.code, (Boolean) this.retryable, (LocalMenuHoursViewKt) this.field, (AnalyticsEvent) this.metadata, (String) this.description, buildUnknownFields());
                case 24:
                    return new AfterpayAppletSearchResponse((String) this.description, (List) this.category, (FilterGroupSection) this.code, (Long) this.field, (List) this.retryable, (SearchSection) this.metadata, buildUnknownFields());
                case 25:
                    return new CreditDetailSheet((LocalizedString) this.category, (LocalizedString) this.code, (List) this.description, (Button) this.field, (AnalyticsEvent) this.retryable, (AnalyticsEvent) this.metadata, buildUnknownFields());
                case 26:
                    return new CreditLineSectionHeader((LocalizedString) this.category, (TappableIcon) this.code, (CreditLineType) this.description, (TapAction) this.field, (NodeReuseKt) this.retryable, (CreditLineSectionHeader.DisplayEffect) this.metadata, buildUnknownFields());
                case 27:
                    return new InAppBrowserMetadata((String) this.description, (ExternalAppLink) this.category, (String) this.field, (InAppBrowserMetadata.EntityInformation) this.code, (InAppBrowserMetadata.PresentingSource) this.retryable, (DensityKt) this.metadata, buildUnknownFields());
                case 28:
                    return new RetroOrderSelectionResponse((PageHeader) this.category, (YGNode.Companion) this.code, (LocalizedString) this.description, (Long) this.field, (AnalyticsEvent) this.retryable, (TappableIcon) this.metadata, buildUnknownFields());
                default:
                    return new ShopBrowseResponse((List) this.category, (Integer) this.code, (String) this.description, (String) this.field, (com.squareup.protos.cash.p2p.profile_directory.ui.Button) this.retryable, (SearchBar) this.metadata, buildUnknownFields());
            }
        }

        public /* synthetic */ Builder(int i, boolean z) {
            this.$r8$classId = i;
        }
    }
}
