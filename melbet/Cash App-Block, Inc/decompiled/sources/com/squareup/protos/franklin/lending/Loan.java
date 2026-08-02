package com.squareup.protos.franklin.lending;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import array.SortOrder;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.Uri_androidKt;
import coil3.svg.internal.Utils_androidKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.cash.supportarticles.app.v1.Icon;
import com.squareup.cash.supportarticles.app.v1.SupportArticle;
import com.squareup.cash.supportarticles.app.v1.SupportLink;
import com.squareup.protos.cash.cashbusinessaccounts.api.v1.EarningsTrackerDataResponse;
import com.squareup.protos.cash.cashbusinessaccounts.api.v1.Trend;
import com.squareup.protos.cash.client.ClientInfo;
import com.squareup.protos.cash.discover.api.app.v1.model.Button;
import com.squareup.protos.cash.discover.api.app.v1.model.DetailsPage;
import com.squareup.protos.cash.discover.api.app.v1.model.NavigationIcon;
import com.squareup.protos.cash.discover.api.app.v1.model.Section;
import com.squareup.protos.cash.discover.api.app.v1.model.ShareSheet;
import com.squareup.protos.cash.discover.api.app.v1.model.TapAction;
import com.squareup.protos.cash.discover.api.app.v1.model.Text;
import com.squareup.protos.cash.genericelements.ui.Action;
import com.squareup.protos.cash.genericelements.ui.ArcadeTextElement;
import com.squareup.protos.cash.genericelements.ui.BaseElement;
import com.squareup.protos.cash.genericelements.ui.CellDefaultComponent;
import com.squareup.protos.cash.grantly.api.LoanParty;
import com.squareup.protos.cash.grantly.api.TilaData;
import com.squareup.protos.cash.localization.LocalizableString;
import com.squareup.protos.cash.moneymap.app.GetRetailerLocationsResponse;
import com.squareup.protos.cash.papermate.app.GetRetailerLocationsResponse;
import com.squareup.protos.cash.pay.CashAppPayInstrumentRenderData;
import com.squareup.protos.cash.pay.CashAppPayMerchantRenderData;
import com.squareup.protos.cash.pay.CashAppPayRefundRenderData;
import com.squareup.protos.cash.requirements.AddressCollectionValidationPolicy;
import com.squareup.protos.cash.requirements.SetAddressRequirementData;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.common.Money;
import com.squareup.protos.common.location.GlobalAddress;
import com.squareup.protos.franklin.accounts.AddressSource;
import com.squareup.protos.franklin.common.PoolsConfig;
import com.squareup.protos.franklin.common.RemittancePaymentRenderData;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.protos.franklin.common.SyncInvestmentCategory;
import com.squareup.protos.franklin.common.Trigger;
import com.squareup.protos.lending.sync_values.LendingInfo;
import com.squareup.protos.timecards.BreakRule;
import com.squareup.protos.timecards.ConfigurationType;
import com.squareup.protos.timecards.TimecardBreakDefinition;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class Loan extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Loan> CREATOR;
    public final BnplData bnpl_data;
    public final Long borrowed_at;
    public final String credit_line_token;
    public final List detail_rows;
    public final Long due_at;
    public final Money interest_amount;
    public final Money late_fee_amount;
    public final LendingProduct lending_product;
    public final Money outstanding_amount;
    public final Money principal_amount;
    public final Money setup_fee_amount;
    public final Integer setup_fee_bps;
    public final State state;
    public final String token;

    public final class BnplData extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<BnplData> CREATOR;
        public final String loan_details_description;
        public final String merchant_customer_token;
        public final String split_payment_description;

        static {
            Loan$BnplData$Companion$ADAPTER$1 loan$BnplData$Companion$ADAPTER$1 = new Loan$BnplData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(BnplData.class), "type.googleapis.com/squareup.franklin.lending.Loan.BnplData", Syntax.PROTO_2, null, "squareup/franklin/lending.proto");
            ADAPTER = loan$BnplData$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(loan$BnplData$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BnplData(String str, String str2, String str3, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.split_payment_description = str;
            this.loan_details_description = str2;
            this.merchant_customer_token = str3;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BnplData)) {
                return false;
            }
            BnplData bnplData = (BnplData) obj;
            return Intrinsics.areEqual(unknownFields(), bnplData.unknownFields()) && Intrinsics.areEqual(this.split_payment_description, bnplData.split_payment_description) && Intrinsics.areEqual(this.loan_details_description, bnplData.loan_details_description) && Intrinsics.areEqual(this.merchant_customer_token, bnplData.merchant_customer_token);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.split_payment_description;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.loan_details_description;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
            String str3 = this.merchant_customer_token;
            int hashCode4 = hashCode3 + (str3 != null ? str3.hashCode() : 0);
            this.hashCode = hashCode4;
            return hashCode4;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            PoolsConfig.Builder builder = new PoolsConfig.Builder(9);
            builder.nux_details_img_url = this.split_payment_description;
            builder.nux_activity_img_url = this.loan_details_description;
            builder.share_background_img_url = this.merchant_customer_token;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.split_payment_description;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "split_payment_description=", arrayList);
            }
            String str2 = this.loan_details_description;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "loan_details_description=", arrayList);
            }
            String str3 = this.merchant_customer_token;
            if (str3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "merchant_customer_token=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "BnplData{", "}", 0, null, null, 56);
        }
    }

    /* loaded from: classes7.dex */
    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public Object bnpl_data;
        public Object borrowed_at;
        public Object credit_line_token;
        public Object detail_rows;
        public Object due_at;
        public Object interest_amount;
        public Serializable late_fee_amount;
        public Serializable lending_product;
        public Object outstanding_amount;
        public Object principal_amount;
        public Serializable setup_fee_amount;
        public Serializable setup_fee_bps;
        public Object state;
        public Object token;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new Loan((String) this.token, (String) this.credit_line_token, (Long) this.borrowed_at, (Money) this.principal_amount, (Money) this.setup_fee_amount, (Money) this.outstanding_amount, (Money) this.late_fee_amount, (Money) this.interest_amount, (Integer) this.setup_fee_bps, (List) this.detail_rows, (State) this.state, (Long) this.due_at, (LendingProduct) this.lending_product, (BnplData) this.bnpl_data, buildUnknownFields());
                case 1:
                    return new SupportArticle((String) this.token, (String) this.credit_line_token, (String) this.borrowed_at, (String) this.due_at, (List) this.detail_rows, (List) this.principal_amount, (Boolean) this.setup_fee_amount, (Boolean) this.outstanding_amount, (Icon) this.late_fee_amount, (List) this.interest_amount, (String) this.setup_fee_bps, (SupportArticle.Appearance) this.state, (Boolean) this.lending_product, (SupportLink) this.bnpl_data, buildUnknownFields());
                case 2:
                    return new EarningsTrackerDataResponse((List) this.detail_rows, (List) this.token, (List) this.credit_line_token, (Trend) this.borrowed_at, (Money) this.principal_amount, (Money) this.setup_fee_amount, (Integer) this.setup_fee_bps, (List) this.due_at, (Money) this.outstanding_amount, (ResponseContext) this.late_fee_amount, (Integer) this.interest_amount, (Integer) this.state, (Integer) this.lending_product, (Integer) this.bnpl_data, buildUnknownFields());
                case 3:
                    return new DetailsPage((String) this.token, (Text) this.borrowed_at, (Text) this.due_at, (Text) this.principal_amount, (DetailsPage.TextPlacement) this.setup_fee_amount, (Button) this.outstanding_amount, (Button) this.late_fee_amount, (ShareSheet) this.interest_amount, (String) this.credit_line_token, (String) this.setup_fee_bps, (NavigationIcon) this.detail_rows, (Button) this.state, (Button) this.lending_product, (SortOrder) this.bnpl_data, buildUnknownFields());
                case 4:
                    return new Section((String) this.token, (Uri_androidKt) this.borrowed_at, (Integer) this.setup_fee_bps, (Text) this.due_at, (Text) this.principal_amount, (Text) this.setup_fee_amount, (Button) this.outstanding_amount, (Text) this.late_fee_amount, (TapAction) this.interest_amount, (Section.Layout) this.detail_rows, (String) this.credit_line_token, (Color) this.state, (Button) this.lending_product, (Boolean) this.bnpl_data, buildUnknownFields());
                case 5:
                    return new CellDefaultComponent((Action) this.borrowed_at, (BaseElement) this.due_at, (String) this.token, (Color) this.principal_amount, (Color) this.setup_fee_amount, (String) this.credit_line_token, (BaseElement) this.outstanding_amount, (BaseElement) this.late_fee_amount, (BaseElement) this.interest_amount, (CellDefaultComponent.Type) this.setup_fee_bps, (Utils_androidKt) this.detail_rows, (String) this.state, (String) this.lending_product, (ArcadeTextElement.SemanticTextColor) this.bnpl_data, buildUnknownFields());
                case 6:
                    return new TilaData((Long) this.borrowed_at, (Money) this.principal_amount, (Money) this.setup_fee_amount, (Money) this.outstanding_amount, (Long) this.due_at, (Integer) this.setup_fee_bps, (Long) this.token, (Long) this.credit_line_token, (Money) this.late_fee_amount, (Integer) this.detail_rows, (Money) this.interest_amount, (Long) this.state, (LoanParty) this.lending_product, (LoanParty) this.bnpl_data, buildUnknownFields());
                case 7:
                    return new GetRetailerLocationsResponse.RetailerLocation((GlobalAddress) this.borrowed_at, (List) this.detail_rows, (Double) this.due_at, (Double) this.setup_fee_amount, (Color) this.outstanding_amount, (String) this.token, (String) this.credit_line_token, (String) this.late_fee_amount, (List) this.interest_amount, (String) this.setup_fee_bps, (List) this.state, (com.squareup.protos.cash.moneymap.app.Button) this.lending_product, (Image) this.bnpl_data, (Money) this.principal_amount, buildUnknownFields());
                case 8:
                    return new GetRetailerLocationsResponse.RetailerLocation((Double) this.borrowed_at, (Double) this.due_at, (GlobalAddress) this.setup_fee_amount, (String) this.token, (String) this.credit_line_token, (Color) this.outstanding_amount, (String) this.late_fee_amount, (String) this.interest_amount, (String) this.setup_fee_bps, (String) this.detail_rows, (Color) this.state, (GetRetailerLocationsResponse.DepositMethods) this.lending_product, (String) this.bnpl_data, (Money) this.principal_amount, buildUnknownFields());
                case 9:
                    return new CashAppPayRefundRenderData((String) this.token, (CashAppPayMerchantRenderData) this.outstanding_amount, (CashAppPayRefundRenderData.RefundState) this.late_fee_amount, (Money) this.principal_amount, (Money) this.setup_fee_amount, (Long) this.borrowed_at, (Long) this.due_at, (Long) this.interest_amount, (Long) this.setup_fee_bps, (Long) this.detail_rows, (String) this.credit_line_token, (String) this.state, (CashAppPayInstrumentRenderData) this.lending_product, (String) this.bnpl_data, buildUnknownFields());
                case 10:
                    return new SetAddressRequirementData((ClientInfo) this.borrowed_at, (Boolean) this.due_at, (Boolean) this.principal_amount, (Boolean) this.setup_fee_amount, (Boolean) this.outstanding_amount, (String) this.token, (Boolean) this.late_fee_amount, (String) this.credit_line_token, (String) this.interest_amount, (String) this.setup_fee_bps, (AddressSource) this.detail_rows, (AddressCollectionValidationPolicy) this.state, (String) this.lending_product, (String) this.bnpl_data, buildUnknownFields());
                case 11:
                    return new RemittancePaymentRenderData((String) this.token, (List) this.detail_rows, (RemittancePaymentRenderData.DeliveryType) this.principal_amount, (String) this.credit_line_token, (String) this.setup_fee_amount, (String) this.outstanding_amount, (String) this.late_fee_amount, (Long) this.borrowed_at, (String) this.interest_amount, (Long) this.due_at, (RemittancePaymentRenderData.RecipientPaymentRenderData) this.setup_fee_bps, (String) this.state, (String) this.lending_product, (RemittancePaymentRenderData.ScamReportStatus) this.bnpl_data, buildUnknownFields());
                case 12:
                    return new SyncInvestmentCategory((String) this.token, (String) this.credit_line_token, (SyncInvestmentCategory.PrefixIcon) this.borrowed_at, (String) this.due_at, (String) this.principal_amount, (String) this.setup_fee_amount, (List) this.detail_rows, (List) this.outstanding_amount, (SyncInvestmentCategory.CategoryType) this.late_fee_amount, (String) this.interest_amount, (String) this.state, (Color) this.lending_product, (Integer) this.setup_fee_bps, (Boolean) this.bnpl_data, buildUnknownFields());
                default:
                    return new TimecardBreakDefinition((String) this.token, (String) this.credit_line_token, (String) this.principal_amount, (String) this.setup_fee_amount, (Integer) this.setup_fee_bps, (Boolean) this.outstanding_amount, (Boolean) this.late_fee_amount, (Long) this.borrowed_at, (Long) this.due_at, (String) this.interest_amount, (String) this.detail_rows, (ConfigurationType) this.state, (Boolean) this.lending_product, (BreakRule) this.bnpl_data, buildUnknownFields());
            }
        }
    }

    public final class DetailRow extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<DetailRow> CREATOR;
        public final String label;
        public final LocalizableString localizable_label;
        public final LocalizableString localizable_value;
        public final String value;

        public final class Builder extends Message.Builder {
            public final /* synthetic */ int $r8$classId;
            public String label;
            public LocalizableString localizable_label;
            public LocalizableString localizable_value;
            public String value;

            public /* synthetic */ Builder(int i) {
                this.$r8$classId = i;
            }

            @Override // com.squareup.wire.Message.Builder
            public final Message build() {
                switch (this.$r8$classId) {
                    case 0:
                        return new DetailRow(this.label, this.localizable_label, this.value, this.localizable_value, buildUnknownFields());
                    default:
                        return new LendingInfo.FirstTimeBorrowData.HomeScreen.NoticeContent(this.label, this.localizable_label, this.value, this.localizable_value, buildUnknownFields());
                }
            }
        }

        static {
            Loan$DetailRow$Companion$ADAPTER$1 loan$DetailRow$Companion$ADAPTER$1 = new Loan$DetailRow$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(DetailRow.class), "type.googleapis.com/squareup.franklin.lending.Loan.DetailRow", Syntax.PROTO_2, null, "squareup/franklin/lending.proto");
            ADAPTER = loan$DetailRow$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(loan$DetailRow$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DetailRow(String str, LocalizableString localizableString, String str2, LocalizableString localizableString2, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.label = str;
            this.value = str2;
            this.localizable_label = localizableString;
            this.localizable_value = localizableString2;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DetailRow)) {
                return false;
            }
            DetailRow detailRow = (DetailRow) obj;
            return Intrinsics.areEqual(unknownFields(), detailRow.unknownFields()) && Intrinsics.areEqual(this.label, detailRow.label) && Intrinsics.areEqual(this.value, detailRow.value) && Intrinsics.areEqual(this.localizable_label, detailRow.localizable_label) && Intrinsics.areEqual(this.localizable_value, detailRow.localizable_value);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.label;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.value;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
            LocalizableString localizableString = this.localizable_label;
            int hashCode4 = (hashCode3 + (localizableString != null ? localizableString.hashCode() : 0)) * 37;
            LocalizableString localizableString2 = this.localizable_value;
            int hashCode5 = hashCode4 + (localizableString2 != null ? localizableString2.hashCode() : 0);
            this.hashCode = hashCode5;
            return hashCode5;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Builder builder = new Builder(0);
            builder.label = this.label;
            builder.value = this.value;
            builder.localizable_label = this.localizable_label;
            builder.localizable_value = this.localizable_value;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.label;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "label=", arrayList);
            }
            String str2 = this.value;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "value=", arrayList);
            }
            LocalizableString localizableString = this.localizable_label;
            if (localizableString != null) {
                Matcher$$ExternalSyntheticOutline0.m("localizable_label=", localizableString, arrayList);
            }
            LocalizableString localizableString2 = this.localizable_value;
            if (localizableString2 != null) {
                Matcher$$ExternalSyntheticOutline0.m("localizable_value=", localizableString2, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "DetailRow{", "}", 0, null, null, 56);
        }
    }

    public enum State implements WireEnum {
        OPEN(1),
        COMPLETE(2),
        OVERDUE(3),
        WRITTEN_OFF(4),
        LONG_OVERDUE(5);

        public final int value;
        public static final Trigger.Companion Companion = new Trigger.Companion();
        public static final Loan$State$Companion$ADAPTER$1 ADAPTER = new Loan$State$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(State.class), Syntax.PROTO_2, null);

        State(int i) {
            this.value = i;
        }

        public static final State fromValue(int i) {
            Companion.getClass();
            return Trigger.Companion.m3953fromValue(i);
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        Loan$Companion$ADAPTER$1 loan$Companion$ADAPTER$1 = new Loan$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Loan.class), "type.googleapis.com/squareup.franklin.lending.Loan", Syntax.PROTO_2, null, "squareup/franklin/lending.proto");
        ADAPTER = loan$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(loan$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Loan(String str, String str2, Long l, Money money, Money money2, Money money3, Money money4, Money money5, Integer num, List list, State state, Long l2, LendingProduct lendingProduct, BnplData bnplData, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.token = str;
        this.credit_line_token = str2;
        this.borrowed_at = l;
        this.principal_amount = money;
        this.setup_fee_amount = money2;
        this.outstanding_amount = money3;
        this.late_fee_amount = money4;
        this.interest_amount = money5;
        this.setup_fee_bps = num;
        this.state = state;
        this.due_at = l2;
        this.lending_product = lendingProduct;
        this.bnpl_data = bnplData;
        this.detail_rows = TransactorKt.immutableCopyOf("detail_rows", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Loan)) {
            return false;
        }
        Loan loan = (Loan) obj;
        return Intrinsics.areEqual(unknownFields(), loan.unknownFields()) && Intrinsics.areEqual(this.token, loan.token) && Intrinsics.areEqual(this.credit_line_token, loan.credit_line_token) && Intrinsics.areEqual(this.borrowed_at, loan.borrowed_at) && Intrinsics.areEqual(this.principal_amount, loan.principal_amount) && Intrinsics.areEqual(this.setup_fee_amount, loan.setup_fee_amount) && Intrinsics.areEqual(this.outstanding_amount, loan.outstanding_amount) && Intrinsics.areEqual(this.late_fee_amount, loan.late_fee_amount) && Intrinsics.areEqual(this.interest_amount, loan.interest_amount) && Intrinsics.areEqual(this.setup_fee_bps, loan.setup_fee_bps) && Intrinsics.areEqual(this.detail_rows, loan.detail_rows) && this.state == loan.state && Intrinsics.areEqual(this.due_at, loan.due_at) && this.lending_product == loan.lending_product && Intrinsics.areEqual(this.bnpl_data, loan.bnpl_data);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.credit_line_token;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Long l = this.borrowed_at;
        int hashCode4 = (hashCode3 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        Money money = this.principal_amount;
        int hashCode5 = (hashCode4 + (money != null ? money.hashCode() : 0)) * 37;
        Money money2 = this.setup_fee_amount;
        int hashCode6 = (hashCode5 + (money2 != null ? money2.hashCode() : 0)) * 37;
        Money money3 = this.outstanding_amount;
        int hashCode7 = (hashCode6 + (money3 != null ? money3.hashCode() : 0)) * 37;
        Money money4 = this.late_fee_amount;
        int hashCode8 = (hashCode7 + (money4 != null ? money4.hashCode() : 0)) * 37;
        Money money5 = this.interest_amount;
        int hashCode9 = (hashCode8 + (money5 != null ? money5.hashCode() : 0)) * 37;
        Integer num = this.setup_fee_bps;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode9 + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37, 37, this.detail_rows);
        State state = this.state;
        int hashCode10 = (m + (state != null ? state.hashCode() : 0)) * 37;
        Long l2 = this.due_at;
        int hashCode11 = (hashCode10 + (l2 != null ? Long.hashCode(l2.longValue()) : 0)) * 37;
        LendingProduct lendingProduct = this.lending_product;
        int hashCode12 = (hashCode11 + (lendingProduct != null ? lendingProduct.hashCode() : 0)) * 37;
        BnplData bnplData = this.bnpl_data;
        int hashCode13 = hashCode12 + (bnplData != null ? bnplData.hashCode() : 0);
        this.hashCode = hashCode13;
        return hashCode13;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.token = this.token;
        builder.credit_line_token = this.credit_line_token;
        builder.borrowed_at = this.borrowed_at;
        builder.principal_amount = this.principal_amount;
        builder.setup_fee_amount = this.setup_fee_amount;
        builder.outstanding_amount = this.outstanding_amount;
        builder.late_fee_amount = this.late_fee_amount;
        builder.interest_amount = this.interest_amount;
        builder.setup_fee_bps = this.setup_fee_bps;
        builder.detail_rows = this.detail_rows;
        builder.state = this.state;
        builder.due_at = this.due_at;
        builder.lending_product = this.lending_product;
        builder.bnpl_data = this.bnpl_data;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "token=", arrayList);
        }
        String str2 = this.credit_line_token;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "credit_line_token=", arrayList);
        }
        Long l = this.borrowed_at;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("borrowed_at=", l, arrayList);
        }
        Money money = this.principal_amount;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("principal_amount=", money, arrayList);
        }
        Money money2 = this.setup_fee_amount;
        if (money2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("setup_fee_amount=", money2, arrayList);
        }
        Money money3 = this.outstanding_amount;
        if (money3 != null) {
            Matcher$$ExternalSyntheticOutline0.m("outstanding_amount=", money3, arrayList);
        }
        Money money4 = this.late_fee_amount;
        if (money4 != null) {
            Matcher$$ExternalSyntheticOutline0.m("late_fee_amount=", money4, arrayList);
        }
        Money money5 = this.interest_amount;
        if (money5 != null) {
            Matcher$$ExternalSyntheticOutline0.m("interest_amount=", money5, arrayList);
        }
        Integer num = this.setup_fee_bps;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("setup_fee_bps=", num, arrayList);
        }
        List list = this.detail_rows;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("detail_rows=", arrayList, list);
        }
        State state = this.state;
        if (state != null) {
            arrayList.add("state=" + state);
        }
        Long l2 = this.due_at;
        if (l2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("due_at=", l2, arrayList);
        }
        LendingProduct lendingProduct = this.lending_product;
        if (lendingProduct != null) {
            arrayList.add("lending_product=" + lendingProduct);
        }
        BnplData bnplData = this.bnpl_data;
        if (bnplData != null) {
            arrayList.add("bnpl_data=" + bnplData);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Loan{", "}", 0, null, null, 56);
    }
}
