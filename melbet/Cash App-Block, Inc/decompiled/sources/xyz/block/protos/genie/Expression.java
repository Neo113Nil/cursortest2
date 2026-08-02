package xyz.block.protos.genie;

import androidx.room.TransactorKt;
import app.cash.zipline.internal.JsonEngineKt;
import app.cash.zipline.internal.bridge.InternalSerializersKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.google.android.gms.internal.mlkit_vision_face.zzjg;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.mosaic.models.v1.TextFormat;
import com.squareup.cash.mosaic.resources.api.v1.BackgroundResource;
import com.squareup.cash.mosaic.resources.api.v2.Font;
import com.squareup.cash.mosaic.resources.api.v2.FontStyle;
import com.squareup.cash.mosaic.resources.api.v2.ReleaseState;
import com.squareup.cash.p2p.engine.api.v1.PaymentSponsorApprovalStatus;
import com.squareup.cash.p2p.engine.api.v1.PaymentType;
import com.squareup.cash.p2pencore.v1.RecurringPayment;
import com.squareup.cash.p2pencore.v1.Schedule;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.compass.api.LocationAttributes;
import com.squareup.protos.cash.contacts.app.PostalAddress;
import com.squareup.protos.cash.cryptoinvestflow.service.CashInInstrument;
import com.squareup.protos.cash.cryptoinvestflow.service.ExchangeRequest;
import com.squareup.protos.cash.cryptoinvestflow.service.UserInteractionContext;
import com.squareup.protos.cash.customersearch.api.Metadata;
import com.squareup.protos.cash.customersearch.api.ProfileDirectoryRow;
import com.squareup.protos.cash.grantly.api.AddressVerificationStatus;
import com.squareup.protos.cash.grantly.api.DeliveryInstructions;
import com.squareup.protos.cash.grantly.api.FullName;
import com.squareup.protos.cash.grantly.api.ShippingAddress;
import com.squareup.protos.cash.grantly.api.ShippingAddressSource;
import com.squareup.protos.cash.groups.GroupExpense;
import com.squareup.protos.cash.groups.PrimaryAction;
import com.squareup.protos.cash.investcrypto.resources.Order;
import com.squareup.protos.cash.local.client.app.v1.ActiveOffer;
import com.squareup.protos.cash.local.client.app.v1.MarketScreenRowCell;
import com.squareup.protos.cash.local.client.v1.BrandCollection;
import com.squareup.protos.cash.local.client.v1.GetNeighborhoodsTabContentResponse;
import com.squareup.protos.cash.local.client.v1.LocalAppointment;
import com.squareup.protos.cash.local.client.v1.LocalCashBackOfferPercentage;
import com.squareup.protos.cash.local.client.v1.LocalCheckoutBrandSummary;
import com.squareup.protos.cash.local.client.v1.LocalCheckoutLocationSummary;
import com.squareup.protos.cash.local.client.v1.LocalEstimatedCompletionDuration;
import com.squareup.protos.cash.local.client.v1.LocalImage;
import com.squareup.protos.cash.local.client.v1.LocalMoney;
import com.squareup.protos.cash.local.client.v1.LocalOpenHours;
import com.squareup.protos.cash.local.client.v1.LocalOpenStatus;
import com.squareup.protos.cash.local.client.v1.MapboxConfiguration;
import com.squareup.protos.cash.local.client.v1.POSBrandOnboarding;
import com.squareup.protos.cash.local.client.v1.ShortlinkAction;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.p2p.profile_directory.ui.Avatar;
import com.squareup.protos.cash.p2p.profile_directory.ui.Button;
import com.squareup.protos.cash.p2p.profile_directory.ui.HighlightText;
import com.squareup.protos.cash.pay.CashAppPayPaymentScheduleRenderData;
import com.squareup.protos.cash.pools.Instrument;
import com.squareup.protos.cash.pools.SendPoolContributionRequest;
import com.squareup.protos.cash.shop.rendering.api.AnalyticsEvent;
import com.squareup.protos.cash.shop.rendering.api.AnalyticsMetadata;
import com.squareup.protos.cash.shop.rendering.api.EngagedItemToken;
import com.squareup.protos.cash.shop.rendering.api.RecentlyViewedSection;
import com.squareup.protos.cash.shop.rendering.api.StyledText;
import com.squareup.protos.cash.shop.rendering.api.TapAction;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.cash.ui.SegmentedCircle;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.common.address.Verification;
import com.squareup.protos.common.countries.Country;
import com.squareup.protos.common.location.GlobalAddress;
import com.squareup.protos.common.location.Phone;
import com.squareup.protos.franklin.app.AccountListConfig;
import com.squareup.protos.franklin.app.AppIntroData;
import com.squareup.protos.franklin.app.InitiateSessionResponse;
import com.squareup.protos.franklin.app.ProfileListConfig;
import com.squareup.protos.franklin.common.AllowanceRenderData;
import com.squareup.protos.franklin.common.FiatP2pRenderData;
import com.squareup.protos.franklin.common.InvestPaymentRenderData;
import com.squareup.protos.franklin.common.RecurringPaymentRenderData;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.protos.franklin.common.RetryContext;
import com.squareup.protos.franklin.common.RewardsData;
import com.squareup.protos.franklin.common.SessionStatus;
import com.squareup.protos.franklin.common.SquarePayrollRenderData;
import com.squareup.protos.franklin.common.SyncedContact;
import com.squareup.protos.franklin.experiments.bouncer.CardScanResult;
import com.squareup.protos.franklin.investing.resources.OrderType;
import com.squareup.protos.lending.sync_values.BorrowAppletBulletinsTile;
import com.squareup.protos.timecards.DatetimeInterval;
import com.squareup.protos.timecards.GetShiftsOverviewResponse;
import com.squareup.protos.timecards.TimecardAndBreaks;
import com.squareup.protos.timecards.TimecardEditRequest;
import com.squareup.protos.wire.roster.mds.AddressEntry;
import com.squareup.protos.wire.roster.mds.Names;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes10.dex */
public final class Expression extends Message {
    public static final ProtoAdapter ADAPTER = new Expression$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Expression.class), "type.googleapis.com/xyz.block.genie.v1.Expression", Syntax.PROTO_2, null, "xyz/block/genie/v1/expression.proto");
    public final BinaryOp binary_op;
    public final ByteString blob_literal;
    public final Boolean bool_literal;
    public final CollectionLiteral collection_literal;
    public final ConditionalOp conditional_op;
    public final FilterOp filter_op;
    public final Double float_literal;
    public final FormatStringOp format_string_op;
    public final Long int_literal;
    public final KeyPath key_path_ref;
    public final String string_literal;
    public final UnaryOp unary_op;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Expression(KeyPath keyPath, String str, Long l, Double d, Boolean bool, ByteString byteString, UnaryOp unaryOp, BinaryOp binaryOp, ConditionalOp conditionalOp, FilterOp filterOp, CollectionLiteral collectionLiteral, FormatStringOp formatStringOp, ByteString byteString2) {
        super(ADAPTER, byteString2);
        byteString2.getClass();
        this.key_path_ref = keyPath;
        this.string_literal = str;
        this.int_literal = l;
        this.float_literal = d;
        this.bool_literal = bool;
        this.blob_literal = byteString;
        this.unary_op = unaryOp;
        this.binary_op = binaryOp;
        this.conditional_op = conditionalOp;
        this.filter_op = filterOp;
        this.collection_literal = collectionLiteral;
        this.format_string_op = formatStringOp;
        if (TransactorKt.countNonNull(keyPath, str, l, d, bool, byteString, unaryOp, binaryOp, conditionalOp, filterOp, collectionLiteral, formatStringOp) <= 1) {
            return;
        }
        a$$ExternalSyntheticBUOutline0.m$3("At most one of key_path_ref, string_literal, int_literal, float_literal, bool_literal, blob_literal, unary_op, binary_op, conditional_op, filter_op, collection_literal, format_string_op may be non-null");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Expression)) {
            return false;
        }
        Expression expression = (Expression) obj;
        return Intrinsics.areEqual(unknownFields(), expression.unknownFields()) && Intrinsics.areEqual(this.key_path_ref, expression.key_path_ref) && Intrinsics.areEqual(this.string_literal, expression.string_literal) && Intrinsics.areEqual(this.int_literal, expression.int_literal) && Intrinsics.areEqual(this.float_literal, expression.float_literal) && Intrinsics.areEqual(this.bool_literal, expression.bool_literal) && Intrinsics.areEqual(this.blob_literal, expression.blob_literal) && Intrinsics.areEqual(this.unary_op, expression.unary_op) && Intrinsics.areEqual(this.binary_op, expression.binary_op) && Intrinsics.areEqual(this.conditional_op, expression.conditional_op) && Intrinsics.areEqual(this.filter_op, expression.filter_op) && Intrinsics.areEqual(this.collection_literal, expression.collection_literal) && Intrinsics.areEqual(this.format_string_op, expression.format_string_op);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        KeyPath keyPath = this.key_path_ref;
        int hashCode2 = (hashCode + (keyPath != null ? keyPath.hashCode() : 0)) * 37;
        String str = this.string_literal;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        Long l = this.int_literal;
        int hashCode4 = (hashCode3 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        Double d = this.float_literal;
        int hashCode5 = (hashCode4 + (d != null ? Double.hashCode(d.doubleValue()) : 0)) * 37;
        Boolean bool = this.bool_literal;
        int hashCode6 = (hashCode5 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        ByteString byteString = this.blob_literal;
        int hashCode7 = (hashCode6 + (byteString != null ? byteString.hashCode() : 0)) * 37;
        UnaryOp unaryOp = this.unary_op;
        int hashCode8 = (hashCode7 + (unaryOp != null ? unaryOp.hashCode() : 0)) * 37;
        BinaryOp binaryOp = this.binary_op;
        int hashCode9 = (hashCode8 + (binaryOp != null ? binaryOp.hashCode() : 0)) * 37;
        ConditionalOp conditionalOp = this.conditional_op;
        int hashCode10 = (hashCode9 + (conditionalOp != null ? conditionalOp.hashCode() : 0)) * 37;
        FilterOp filterOp = this.filter_op;
        int hashCode11 = (hashCode10 + (filterOp != null ? filterOp.hashCode() : 0)) * 37;
        CollectionLiteral collectionLiteral = this.collection_literal;
        int hashCode12 = (hashCode11 + (collectionLiteral != null ? collectionLiteral.hashCode() : 0)) * 37;
        FormatStringOp formatStringOp = this.format_string_op;
        int hashCode13 = hashCode12 + (formatStringOp != null ? formatStringOp.hashCode() : 0);
        this.hashCode = hashCode13;
        return hashCode13;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0, false);
        builder.key_path_ref = this.key_path_ref;
        builder.string_literal = this.string_literal;
        builder.int_literal = this.int_literal;
        builder.float_literal = this.float_literal;
        builder.bool_literal = this.bool_literal;
        builder.blob_literal = this.blob_literal;
        builder.unary_op = this.unary_op;
        builder.binary_op = this.binary_op;
        builder.conditional_op = this.conditional_op;
        builder.filter_op = this.filter_op;
        builder.collection_literal = this.collection_literal;
        builder.format_string_op = this.format_string_op;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        KeyPath keyPath = this.key_path_ref;
        if (keyPath != null) {
            arrayList.add("key_path_ref=" + keyPath);
        }
        String str = this.string_literal;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "string_literal=", arrayList);
        }
        Long l = this.int_literal;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("int_literal=", l, arrayList);
        }
        Double d = this.float_literal;
        if (d != null) {
            SizeMode$EnumUnboxingLocalUtility.m("float_literal=", d, arrayList);
        }
        Boolean bool = this.bool_literal;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("bool_literal=", bool, arrayList);
        }
        ByteString byteString = this.blob_literal;
        if (byteString != null) {
            Request$Priority$EnumUnboxingLocalUtility.m("blob_literal=", byteString, arrayList);
        }
        UnaryOp unaryOp = this.unary_op;
        if (unaryOp != null) {
            arrayList.add("unary_op=" + unaryOp);
        }
        BinaryOp binaryOp = this.binary_op;
        if (binaryOp != null) {
            arrayList.add("binary_op=" + binaryOp);
        }
        ConditionalOp conditionalOp = this.conditional_op;
        if (conditionalOp != null) {
            arrayList.add("conditional_op=" + conditionalOp);
        }
        FilterOp filterOp = this.filter_op;
        if (filterOp != null) {
            arrayList.add("filter_op=" + filterOp);
        }
        CollectionLiteral collectionLiteral = this.collection_literal;
        if (collectionLiteral != null) {
            arrayList.add("collection_literal=" + collectionLiteral);
        }
        FormatStringOp formatStringOp = this.format_string_op;
        if (formatStringOp != null) {
            arrayList.add("format_string_op=" + formatStringOp);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Expression{", "}", 0, null, null, 56);
    }

    /* loaded from: classes7.dex */
    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public Object binary_op;
        public Object blob_literal;
        public Serializable bool_literal;
        public Object collection_literal;
        public Object conditional_op;
        public Object filter_op;
        public Object float_literal;
        public Object format_string_op;
        public Object int_literal;
        public Object key_path_ref;
        public Object string_literal;
        public Object unary_op;

        public Builder(int i) {
            this.$r8$classId = i;
            switch (i) {
                case 19:
                    this.float_literal = EmptyList.INSTANCE;
                    break;
                case 22:
                    EmptyList emptyList = EmptyList.INSTANCE;
                    this.key_path_ref = emptyList;
                    this.string_literal = emptyList;
                    this.int_literal = emptyList;
                    this.float_literal = emptyList;
                    this.blob_literal = emptyList;
                    this.unary_op = emptyList;
                    this.filter_op = emptyList;
                    break;
                default:
                    EmptyList emptyList2 = EmptyList.INSTANCE;
                    this.key_path_ref = emptyList2;
                    this.conditional_op = emptyList2;
                    break;
            }
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new Expression((KeyPath) this.key_path_ref, (String) this.string_literal, (Long) this.int_literal, (Double) this.float_literal, (Boolean) this.bool_literal, (ByteString) this.blob_literal, (UnaryOp) this.unary_op, (BinaryOp) this.binary_op, (ConditionalOp) this.conditional_op, (FilterOp) this.filter_op, (CollectionLiteral) this.collection_literal, (FormatStringOp) this.format_string_op, buildUnknownFields());
                case 1:
                    return new BackgroundResource((String) this.string_literal, (String) this.key_path_ref, (String) this.int_literal, (String) this.float_literal, (Boolean) this.bool_literal, (Color) this.blob_literal, (TextFormat) this.unary_op, (List) this.binary_op, (String) this.conditional_op, (String) this.filter_op, (String) this.collection_literal, (String) this.format_string_op, buildUnknownFields());
                case 2:
                    return new Font((String) this.string_literal, (String) this.key_path_ref, (String) this.int_literal, (String) this.float_literal, (FontStyle) this.blob_literal, (String) this.unary_op, (String) this.binary_op, (Integer) this.conditional_op, (ReleaseState) this.filter_op, (List) this.collection_literal, (Boolean) this.bool_literal, (String) this.format_string_op, buildUnknownFields());
                case 3:
                    return new RecurringPayment((String) this.string_literal, (String) this.key_path_ref, (String) this.float_literal, (Money) this.bool_literal, (String) this.blob_literal, (Schedule) this.unary_op, (String) this.binary_op, (Long) this.int_literal, (Long) this.conditional_op, (Long) this.filter_op, (Long) this.collection_literal, (String) this.format_string_op, buildUnknownFields());
                case 4:
                    return new LocationAttributes((Float) this.key_path_ref, (Double) this.float_literal, (Float) this.string_literal, (Float) this.blob_literal, (Float) this.unary_op, (Float) this.binary_op, (Float) this.conditional_op, (Boolean) this.bool_literal, (Boolean) this.filter_op, (Long) this.int_literal, (Long) this.collection_literal, (Long) this.format_string_op, buildUnknownFields());
                case 5:
                    return new PostalAddress((String) this.string_literal, (String) this.key_path_ref, (String) this.int_literal, (String) this.float_literal, (String) this.bool_literal, (String) this.blob_literal, (String) this.unary_op, (String) this.binary_op, (String) this.conditional_op, (String) this.filter_op, (String) this.collection_literal, (String) this.format_string_op, buildUnknownFields());
                case 6:
                    return new ExchangeRequest((CurrencyCode) this.key_path_ref, (CurrencyCode) this.int_literal, (JsonEngineKt) this.float_literal, (String) this.string_literal, (String) this.bool_literal, (String) this.blob_literal, (RequestContext) this.unary_op, (String) this.binary_op, (Order.CustomOrderConfiguration) this.conditional_op, (Order.RecurringSchedule) this.filter_op, (UserInteractionContext) this.collection_literal, (CashInInstrument) this.format_string_op, buildUnknownFields());
                case 7:
                    return new ProfileDirectoryRow((String) this.string_literal, (String) this.key_path_ref, (String) this.int_literal, (Avatar) this.float_literal, (HighlightText) this.bool_literal, (HighlightText) this.blob_literal, (HighlightText) this.unary_op, (Image) this.binary_op, (String) this.conditional_op, (Button) this.filter_op, (Metadata) this.collection_literal, (InternalSerializersKt) this.format_string_op, buildUnknownFields());
                case 8:
                    return new ShippingAddress((String) this.string_literal, (Long) this.int_literal, (Long) this.key_path_ref, (Boolean) this.bool_literal, (ShippingAddressSource) this.float_literal, (AddressVerificationStatus) this.blob_literal, (String) this.unary_op, (FullName) this.binary_op, (GlobalAddress) this.conditional_op, (Phone) this.filter_op, (String) this.collection_literal, (DeliveryInstructions) this.format_string_op, buildUnknownFields());
                case 9:
                    return new GroupExpense((String) this.string_literal, (String) this.key_path_ref, (String) this.float_literal, (Boolean) this.bool_literal, (PrimaryAction) this.blob_literal, (Money) this.unary_op, (Money) this.binary_op, (List) this.conditional_op, (Long) this.int_literal, (Money) this.filter_op, (Integer) this.collection_literal, (String) this.format_string_op, buildUnknownFields());
                case 10:
                    return new ActiveOffer((String) this.string_literal, (String) this.key_path_ref, (String) this.float_literal, (String) this.bool_literal, (Long) this.int_literal, (Long) this.blob_literal, (String) this.unary_op, (String) this.binary_op, (String) this.conditional_op, (Long) this.filter_op, (Integer) this.collection_literal, (Long) this.format_string_op, buildUnknownFields());
                case 11:
                    return new MarketScreenRowCell((String) this.string_literal, (String) this.key_path_ref, (String) this.int_literal, (LocalOpenStatus) this.float_literal, (LocalOpenHours) this.bool_literal, (LocalCashBackOfferPercentage) this.blob_literal, (String) this.unary_op, (String) this.binary_op, (String) this.conditional_op, (String) this.filter_op, (String) this.collection_literal, (LocalEstimatedCompletionDuration) this.format_string_op, buildUnknownFields());
                case 12:
                    return new GetNeighborhoodsTabContentResponse((List) this.key_path_ref, (BrandCollection) this.float_literal, (GetNeighborhoodsTabContentResponse.EnrollmentIncentive) this.blob_literal, (Boolean) this.bool_literal, (Long) this.int_literal, (GetNeighborhoodsTabContentResponse.LocalCashExplainer) this.unary_op, (String) this.string_literal, (MapboxConfiguration) this.binary_op, (List) this.conditional_op, (GetNeighborhoodsTabContentResponse.Incentive) this.filter_op, (ShortlinkAction) this.collection_literal, (GetNeighborhoodsTabContentResponse.Incentive) this.format_string_op, buildUnknownFields());
                case 13:
                    return new GetNeighborhoodsTabContentResponse.EnrollmentIncentive((Long) this.int_literal, (String) this.string_literal, (String) this.key_path_ref, (String) this.float_literal, (String) this.bool_literal, (String) this.blob_literal, (GetNeighborhoodsTabContentResponse.EnrollmentIncentive.LegalConsentContent) this.unary_op, (GetNeighborhoodsTabContentResponse.EnrollmentIncentive.Onboarding) this.binary_op, (LocalImage) this.conditional_op, (String) this.filter_op, (String) this.collection_literal, (String) this.format_string_op, buildUnknownFields());
                case 14:
                    return new LocalAppointment((String) this.string_literal, (String) this.key_path_ref, (String) this.float_literal, (String) this.bool_literal, (String) this.blob_literal, (Long) this.int_literal, (Integer) this.unary_op, (LocalAppointment.AppointmentStatus) this.binary_op, (LocalCheckoutBrandSummary) this.conditional_op, (LocalCheckoutLocationSummary) this.filter_op, (String) this.collection_literal, (LocalMoney) this.format_string_op, buildUnknownFields());
                case 15:
                    return new POSBrandOnboarding((POSBrandOnboarding.LocalCashDetails) this.key_path_ref, (POSBrandOnboarding.BrandCard) this.float_literal, (String) this.string_literal, (String) this.bool_literal, (String) this.blob_literal, (Long) this.int_literal, (String) this.unary_op, (String) this.binary_op, (POSBrandOnboarding.HowItWorks) this.conditional_op, (POSBrandOnboarding.LegalConsent) this.filter_op, (ShortlinkAction) this.collection_literal, (String) this.format_string_op, buildUnknownFields());
                case 16:
                    return new CashAppPayPaymentScheduleRenderData((String) this.string_literal, (Money) this.key_path_ref, (Money) this.float_literal, (Money) this.bool_literal, (Money) this.blob_literal, (Money) this.unary_op, (Money) this.binary_op, (Long) this.int_literal, (CashAppPayPaymentScheduleRenderData.PaymentScheduleState) this.conditional_op, (List) this.filter_op, (List) this.collection_literal, (Integer) this.format_string_op, buildUnknownFields());
                case 17:
                    return new SendPoolContributionRequest((String) this.string_literal, (String) this.key_path_ref, (Money) this.int_literal, (Instrument) this.float_literal, (String) this.blob_literal, (String) this.unary_op, (RetryContext) this.binary_op, (String) this.conditional_op, (Boolean) this.bool_literal, (String) this.filter_op, (RequestContext) this.collection_literal, (String) this.format_string_op, buildUnknownFields());
                case 18:
                    return new RecentlyViewedSection.Logo((EngagedItemToken) this.key_path_ref, (AnalyticsEvent) this.int_literal, (TapAction) this.float_literal, (com.squareup.protos.franklin.ui.Avatar) this.bool_literal, (LocalizedString) this.blob_literal, (LocalizedString) this.unary_op, (String) this.string_literal, (LocalizedString) this.binary_op, (String) this.conditional_op, (StyledText) this.filter_op, (StyledText) this.collection_literal, (AnalyticsMetadata) this.format_string_op, buildUnknownFields());
                case 19:
                    return new InitiateSessionResponse((String) this.string_literal, (SessionStatus) this.key_path_ref, (String) this.int_literal, (List) this.float_literal, (String) this.bool_literal, (String) this.blob_literal, (String) this.unary_op, (AccountListConfig) this.binary_op, (AppIntroData) this.conditional_op, (String) this.filter_op, (ProfileListConfig) this.collection_literal, (String) this.format_string_op, buildUnknownFields());
                case 20:
                    return new FiatP2pRenderData((FiatP2pRenderData.PaymentSource) this.key_path_ref, (AllowanceRenderData) this.int_literal, (FiatP2pRenderData.CustomerRequiredAction) this.float_literal, (String) this.string_literal, (String) this.blob_literal, (String) this.unary_op, (SquarePayrollRenderData) this.binary_op, (String) this.conditional_op, (Boolean) this.bool_literal, (PaymentSponsorApprovalStatus) this.filter_op, (PaymentType) this.collection_literal, (RecurringPaymentRenderData) this.format_string_op, buildUnknownFields());
                case 21:
                    return new InvestPaymentRenderData.RecipientData((String) this.string_literal, (String) this.key_path_ref, (String) this.int_literal, (String) this.float_literal, (InvestPaymentRenderData.RecipientData.Status) this.bool_literal, (String) this.blob_literal, (OrderType) this.unary_op, (Money) this.binary_op, (Money) this.conditional_op, (String) this.filter_op, (String) this.collection_literal, (String) this.format_string_op, buildUnknownFields());
                case 22:
                    return new RewardsData((List) this.key_path_ref, (List) this.string_literal, (List) this.int_literal, (List) this.float_literal, (List) this.blob_literal, (List) this.unary_op, (Boolean) this.bool_literal, (Boolean) this.binary_op, (Boolean) this.conditional_op, (List) this.filter_op, (Boolean) this.collection_literal, (Money) this.format_string_op, buildUnknownFields());
                case 23:
                    return new SyncedContact((ByteString) this.blob_literal, (String) this.string_literal, (String) this.key_path_ref, (String) this.float_literal, (Boolean) this.bool_literal, (String) this.unary_op, (Boolean) this.binary_op, (Boolean) this.conditional_op, (Long) this.int_literal, (Country) this.filter_op, (Boolean) this.collection_literal, (String) this.format_string_op, buildUnknownFields());
                case 24:
                    return new CardScanResult((String) this.string_literal, (String) this.key_path_ref, (String) this.int_literal, (String) this.float_literal, (String) this.unary_op, (String) this.binary_op, (ByteString) this.blob_literal, (String) this.conditional_op, (String) this.filter_op, (String) this.collection_literal, (Boolean) this.bool_literal, (String) this.format_string_op, buildUnknownFields());
                case 25:
                    return new BorrowAppletBulletinsTile.Data.Bulletin((BorrowAppletBulletinsTile.Data.Bulletin.Icon) this.key_path_ref, (BorrowAppletBulletinsTile.Data.Bulletin.IconShape) this.int_literal, (SegmentedCircle) this.float_literal, (LocalizedString) this.blob_literal, (LocalizedString) this.unary_op, (BorrowAppletBulletinsTile.Data.Bulletin.Accessory) this.binary_op, (zzjg) this.conditional_op, (Boolean) this.bool_literal, (String) this.string_literal, (Color) this.filter_op, (Float) this.collection_literal, (LocalizedString) this.format_string_op, buildUnknownFields());
                case 26:
                    return new GetShiftsOverviewResponse((String) this.string_literal, (List) this.key_path_ref, (List) this.int_literal, (List) this.float_literal, (DatetimeInterval) this.bool_literal, (GetShiftsOverviewResponse.IntervalType) this.blob_literal, (String) this.unary_op, (String) this.binary_op, (Money) this.conditional_op, (Money) this.filter_op, (Money) this.collection_literal, (Integer) this.format_string_op, buildUnknownFields());
                case 27:
                    return new TimecardEditRequest((String) this.string_literal, (String) this.key_path_ref, (String) this.int_literal, (String) this.float_literal, (String) this.blob_literal, (Money) this.unary_op, (List) this.binary_op, (TimecardAndBreaks) this.conditional_op, (String) this.filter_op, (String) this.collection_literal, (Money) this.format_string_op, (Boolean) this.bool_literal, buildUnknownFields());
                default:
                    return new AddressEntry((String) this.string_literal, (GlobalAddress) this.key_path_ref, (String) this.float_literal, (List) this.blob_literal, (Boolean) this.bool_literal, (Names) this.unary_op, (Names) this.binary_op, (Phone) this.conditional_op, (Boolean) this.filter_op, (Long) this.int_literal, (List) this.collection_literal, (Verification) this.format_string_op, buildUnknownFields());
            }
        }

        public /* synthetic */ Builder(int i, boolean z) {
            this.$r8$classId = i;
        }
    }
}
