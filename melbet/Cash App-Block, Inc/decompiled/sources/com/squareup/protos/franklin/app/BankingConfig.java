package com.squareup.protos.franklin.app;

import android.os.Parcelable;
import com.google.android.gms.internal.mlkit_vision_face.zzdb;
import com.google.android.gms.internal.mlkit_vision_face.zzdc;
import com.google.android.gms.internal.mlkit_vision_face.zzde;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.SetNotificationPreferencesResponse;
import com.squareup.protos.franklin.app.CheckDepositConfig;
import com.squareup.protos.franklin.app.ClaimByPaymentTokenResponse;
import com.squareup.protos.franklin.app.ClearProfilePhotoResponse;
import com.squareup.protos.franklin.app.CompleteScenarioResponse;
import com.squareup.protos.franklin.app.CreditMultiStepLoadPollingResponse;
import com.squareup.protos.franklin.app.GetBoostConfigResponse;
import com.squareup.protos.franklin.app.GetCashtagStatusRequest;
import com.squareup.protos.franklin.app.GetFlowRequest;
import com.squareup.protos.franklin.app.GetScenarioPlanResponse;
import com.squareup.protos.franklin.app.MultiCurrencyPaymentReviewRequest;
import com.squareup.protos.franklin.app.RegisterEmailResponse;
import com.squareup.protos.franklin.app.RegisterInvitationsResponse;
import com.squareup.protos.franklin.app.RegisterSmsResponse;
import com.squareup.protos.franklin.app.ResolveMergeResponse;
import com.squareup.protos.franklin.common.DigitalWalletTokenProvisioningCompletionData;
import com.squareup.protos.franklin.common.DigitalWalletTokenProvisioningRequestData;
import com.squareup.protos.franklin.common.DigitalWalletTokenProvisioningResponseData;
import com.squareup.protos.franklin.common.ExchangeData;
import com.squareup.protos.franklin.common.PaymentRewardStatus;
import com.squareup.protos.franklin.common.PoolsConfig;
import com.squareup.protos.franklin.common.Reaction;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.protos.franklin.common.RewardStatus;
import com.squareup.protos.franklin.ui.UiPayment;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class BankingConfig extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<BankingConfig> CREATOR;
    public final RecurringDepositsDdaUpsell recurring_deposits_dda_upsell;
    public final Strings strings;

    /* loaded from: classes.dex */
    public final class RecurringDepositsDdaUpsell extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<RecurringDepositsDdaUpsell> CREATOR;
        public final String body;
        public final String cta;
        public final String title;

        static {
            BankingConfig$RecurringDepositsDdaUpsell$Companion$ADAPTER$1 bankingConfig$RecurringDepositsDdaUpsell$Companion$ADAPTER$1 = new BankingConfig$RecurringDepositsDdaUpsell$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(RecurringDepositsDdaUpsell.class), "type.googleapis.com/squareup.franklin.app.BankingConfig.RecurringDepositsDdaUpsell", Syntax.PROTO_2, null, "squareup/franklin/app/banking_config.proto");
            ADAPTER = bankingConfig$RecurringDepositsDdaUpsell$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(bankingConfig$RecurringDepositsDdaUpsell$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RecurringDepositsDdaUpsell(String str, String str2, String str3, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.title = str;
            this.body = str2;
            this.cta = str3;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof RecurringDepositsDdaUpsell)) {
                return false;
            }
            RecurringDepositsDdaUpsell recurringDepositsDdaUpsell = (RecurringDepositsDdaUpsell) obj;
            return Intrinsics.areEqual(unknownFields(), recurringDepositsDdaUpsell.unknownFields()) && Intrinsics.areEqual(this.title, recurringDepositsDdaUpsell.title) && Intrinsics.areEqual(this.body, recurringDepositsDdaUpsell.body) && Intrinsics.areEqual(this.cta, recurringDepositsDdaUpsell.cta);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.title;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.body;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
            String str3 = this.cta;
            int hashCode4 = hashCode3 + (str3 != null ? str3.hashCode() : 0);
            this.hashCode = hashCode4;
            return hashCode4;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            PoolsConfig.Builder builder = new PoolsConfig.Builder(1);
            builder.nux_details_img_url = this.title;
            builder.nux_activity_img_url = this.body;
            builder.share_background_img_url = this.cta;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.title;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title=", arrayList);
            }
            String str2 = this.body;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "body=", arrayList);
            }
            String str3 = this.cta;
            if (str3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "cta=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "RecurringDepositsDdaUpsell{", "}", 0, null, null, 56);
        }
    }

    static {
        BankingConfig$Companion$ADAPTER$1 bankingConfig$Companion$ADAPTER$1 = new BankingConfig$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(BankingConfig.class), "type.googleapis.com/squareup.franklin.app.BankingConfig", Syntax.PROTO_2, null, "squareup/franklin/app/banking_config.proto");
        ADAPTER = bankingConfig$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(bankingConfig$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BankingConfig(Strings strings, RecurringDepositsDdaUpsell recurringDepositsDdaUpsell, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.strings = strings;
        this.recurring_deposits_dda_upsell = recurringDepositsDdaUpsell;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BankingConfig)) {
            return false;
        }
        BankingConfig bankingConfig = (BankingConfig) obj;
        return Intrinsics.areEqual(unknownFields(), bankingConfig.unknownFields()) && Intrinsics.areEqual(this.strings, bankingConfig.strings) && Intrinsics.areEqual(this.recurring_deposits_dda_upsell, bankingConfig.recurring_deposits_dda_upsell);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Strings strings = this.strings;
        int hashCode2 = (hashCode + (strings != null ? strings.hashCode() : 0)) * 37;
        RecurringDepositsDdaUpsell recurringDepositsDdaUpsell = this.recurring_deposits_dda_upsell;
        int hashCode3 = hashCode2 + (recurringDepositsDdaUpsell != null ? recurringDepositsDdaUpsell.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.strings = this.strings;
        builder.recurring_deposits_dda_upsell = this.recurring_deposits_dda_upsell;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Strings strings = this.strings;
        if (strings != null) {
            arrayList.add("strings=" + strings);
        }
        RecurringDepositsDdaUpsell recurringDepositsDdaUpsell = this.recurring_deposits_dda_upsell;
        if (recurringDepositsDdaUpsell != null) {
            arrayList.add("recurring_deposits_dda_upsell=" + recurringDepositsDdaUpsell);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "BankingConfig{", "}", 0, null, null, 56);
    }

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public Object recurring_deposits_dda_upsell;
        public Object strings;

        public Builder() {
            this.$r8$classId = 4;
            this.recurring_deposits_dda_upsell = EmptyList.INSTANCE;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new BankingConfig((Strings) this.strings, (RecurringDepositsDdaUpsell) this.recurring_deposits_dda_upsell, buildUnknownFields());
                case 1:
                    return new SetNotificationPreferencesResponse((SetNotificationPreferencesResponse.Status) this.strings, (ResponseContext) this.recurring_deposits_dda_upsell, buildUnknownFields());
                case 2:
                    return new AddReactionRequest((RequestContext) this.strings, (Reaction) this.recurring_deposits_dda_upsell, buildUnknownFields());
                case 3:
                    return new CardCustomizationInputs((zzdb) this.strings, (Boolean) this.recurring_deposits_dda_upsell, buildUnknownFields());
                case 4:
                    return new CashLiteConfig((BitcoinAppletConfig) this.strings, (List) this.recurring_deposits_dda_upsell, buildUnknownFields());
                case 5:
                    return new CheckDepositConfig((CheckDepositConfig.Image) this.strings, (String) this.recurring_deposits_dda_upsell, buildUnknownFields());
                case 6:
                    return new ClabeEntryRequest((RequestContext) this.strings, (zzdc) this.recurring_deposits_dda_upsell, buildUnknownFields());
                case 7:
                    return new ClaimByPaymentTokenResponse((ResponseContext) this.strings, (ClaimByPaymentTokenResponse.Status) this.recurring_deposits_dda_upsell, buildUnknownFields());
                case 8:
                    return new ClearProfilePhotoResponse((ClearProfilePhotoResponse.Status) this.strings, (ResponseContext) this.recurring_deposits_dda_upsell, buildUnknownFields());
                case 9:
                    return new CompleteDigitalWalletTokenProvisioningRequest((RequestContext) this.strings, (DigitalWalletTokenProvisioningCompletionData) this.recurring_deposits_dda_upsell, buildUnknownFields());
                case 10:
                    return new CompleteScenarioResponse((ResponseContext) this.strings, (CompleteScenarioResponse.Status) this.recurring_deposits_dda_upsell, buildUnknownFields());
                case 11:
                    return new CreditFirstTimeBorrowRequest((RequestContext) this.strings, (Money) this.recurring_deposits_dda_upsell, buildUnknownFields());
                case 12:
                    return new CreditMultiStepLoadPollingResponse((ResponseContext) this.strings, (CreditMultiStepLoadPollingResponse.Status) this.recurring_deposits_dda_upsell, buildUnknownFields());
                case 13:
                    return new GetBoostConfigResponse((Long) this.strings, (GetBoostConfigResponse.BtcBoostUpsell) this.recurring_deposits_dda_upsell, buildUnknownFields());
                case 14:
                    return new GetCashtagStatusRequest((String) this.strings, (GetCashtagStatusRequest.CashtagRestriction) this.recurring_deposits_dda_upsell, buildUnknownFields());
                case 15:
                    return new GetExchangeDataResponse((ExchangeData) this.strings, (List) this.recurring_deposits_dda_upsell, buildUnknownFields());
                case 16:
                    return new GetFlowRequest((RequestContext) this.strings, (GetFlowRequest.Input) this.recurring_deposits_dda_upsell, buildUnknownFields());
                case 17:
                    return new GetPaymentRewardStatusResponse((PaymentRewardStatus) this.strings, (RewardStatus) this.recurring_deposits_dda_upsell, buildUnknownFields());
                case 18:
                    return new GetScenarioPlanResponse((ResponseContext) this.strings, (GetScenarioPlanResponse.Status) this.recurring_deposits_dda_upsell, buildUnknownFields());
                case 19:
                    return new LoanAmountPickerRequest((RequestContext) this.strings, (Long) this.recurring_deposits_dda_upsell, buildUnknownFields());
                case 20:
                    return new MultiCurrencyPaymentReviewRequest((RequestContext) this.strings, (MultiCurrencyPaymentReviewRequest.Action) this.recurring_deposits_dda_upsell, buildUnknownFields());
                case 21:
                    return new P2pInstrumentSelectionRequest((RequestContext) this.strings, (zzde) this.recurring_deposits_dda_upsell, buildUnknownFields());
                case 22:
                    return new ProvisionDigitalWalletTokenRequest((DigitalWalletTokenProvisioningRequestData) this.strings, (RequestContext) this.recurring_deposits_dda_upsell, buildUnknownFields());
                case 23:
                    return new ProvisionDigitalWalletTokenResponse((DigitalWalletTokenProvisioningResponseData) this.strings, (ResponseContext) this.recurring_deposits_dda_upsell, buildUnknownFields());
                case 24:
                    return new RefreshSessionRequest((String) this.strings, (ClientSecurityContext) this.recurring_deposits_dda_upsell, buildUnknownFields());
                case 25:
                    return new RefundPaymentResponse((ResponseContext) this.strings, (UiPayment) this.recurring_deposits_dda_upsell, buildUnknownFields());
                case 26:
                    return new RegisterEmailResponse((ResponseContext) this.strings, (RegisterEmailResponse.Status) this.recurring_deposits_dda_upsell, buildUnknownFields());
                case 27:
                    return new RegisterInvitationsResponse((RegisterInvitationsResponse.Status) this.strings, (List) this.recurring_deposits_dda_upsell, buildUnknownFields());
                case 28:
                    return new RegisterSmsResponse((ResponseContext) this.strings, (RegisterSmsResponse.Status) this.recurring_deposits_dda_upsell, buildUnknownFields());
                default:
                    return new ResolveMergeResponse((ResponseContext) this.strings, (ResolveMergeResponse.Status) this.recurring_deposits_dda_upsell, buildUnknownFields());
            }
        }

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }
    }

    public /* synthetic */ BankingConfig(Strings strings, RecurringDepositsDdaUpsell recurringDepositsDdaUpsell) {
        this(strings, recurringDepositsDdaUpsell, ByteString.EMPTY);
    }

    public final class Strings extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Strings> CREATOR;
        public final String balance_screen_title;
        public final String main_screen_balance_subtitle;
        public final String main_screen_title;

        static {
            BankingConfig$Strings$Companion$ADAPTER$1 bankingConfig$Strings$Companion$ADAPTER$1 = new BankingConfig$Strings$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Strings.class), "type.googleapis.com/squareup.franklin.app.BankingConfig.Strings", Syntax.PROTO_2, null, "squareup/franklin/app/banking_config.proto");
            ADAPTER = bankingConfig$Strings$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(bankingConfig$Strings$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Strings(String str, String str2, String str3, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.main_screen_title = str;
            this.main_screen_balance_subtitle = str2;
            this.balance_screen_title = str3;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Strings)) {
                return false;
            }
            Strings strings = (Strings) obj;
            return Intrinsics.areEqual(unknownFields(), strings.unknownFields()) && Intrinsics.areEqual(this.main_screen_title, strings.main_screen_title) && Intrinsics.areEqual(this.main_screen_balance_subtitle, strings.main_screen_balance_subtitle) && Intrinsics.areEqual(this.balance_screen_title, strings.balance_screen_title);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.main_screen_title;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.main_screen_balance_subtitle;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
            String str3 = this.balance_screen_title;
            int hashCode4 = hashCode3 + (str3 != null ? str3.hashCode() : 0);
            this.hashCode = hashCode4;
            return hashCode4;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            PoolsConfig.Builder builder = new PoolsConfig.Builder(2);
            builder.nux_details_img_url = this.main_screen_title;
            builder.nux_activity_img_url = this.main_screen_balance_subtitle;
            builder.share_background_img_url = this.balance_screen_title;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.main_screen_title;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "main_screen_title=", arrayList);
            }
            String str2 = this.main_screen_balance_subtitle;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "main_screen_balance_subtitle=", arrayList);
            }
            String str3 = this.balance_screen_title;
            if (str3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "balance_screen_title=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Strings{", "}", 0, null, null, 56);
        }

        public /* synthetic */ Strings(String str, String str2) {
            this(str, str2, null, ByteString.EMPTY);
        }
    }
}
