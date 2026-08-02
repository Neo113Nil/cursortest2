package com.squareup.protos.cash.grantly.api;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import app.cash.zipline.internal.SignaturePayloadKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.UriKt;
import coil3.decode.StaticImageDecoderKt;
import coil3.util.BitmapsKt;
import coil3.util.DrawableUtils;
import coil3.util.FileSystemsKt;
import coil3.util.IntPair;
import com.android.volley.toolbox.HttpHeaderParser;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashlimitsxp.api.v1.Empty;
import com.squareup.protos.cash.cashsuggest.api.ImageLayout;
import com.squareup.protos.cash.commerce.CommerceRefund;
import com.squareup.protos.cash.compass.api.RadioType;
import com.squareup.protos.cash.composer.app.Asset;
import com.squareup.protos.cash.cryptoinvestflow.api.blockers.v1.BitcoinP2pConversionPercentageInputs;
import com.squareup.protos.cash.cryptoinvestflow.service.DisableRecurringCryptoBuyInitiationData;
import com.squareup.protos.cash.cryptoinvestflow.service.UserInteractionContext;
import com.squareup.protos.cash.customersearch.api.Filter;
import com.squareup.protos.cash.customersearch.api.ProfileDirectorySearchResponse;
import com.squareup.protos.cash.dataprivacy.settings.DataPrivacySetting;
import com.squareup.protos.cash.discover.api.app.v1.model.Button;
import com.squareup.protos.cash.discover.api.app.v1.model.PlaceholderSection;
import com.squareup.protos.cash.discover.api.app.v1.model.PreloadRequestContext;
import com.squareup.protos.cash.discover.api.app.v1.model.Text;
import com.squareup.protos.cash.discover.api.app.v2.api.Summary;
import com.squareup.protos.cash.discover.api.app.v2.model.RowSection;
import com.squareup.protos.cash.discover.api.app.v2.model.Section;
import com.squareup.protos.cash.disputron.Pagination;
import com.squareup.protos.cash.disputron.core.ListClaimResolutionStatusesRequest;
import com.squareup.protos.cash.disputron.core.TransactionType;
import com.squareup.protos.cash.favorites.Favorite;
import com.squareup.protos.cash.fiatly.api.v1.P2PControls;
import com.squareup.protos.cash.fiatly.api.v1.SetP2PControlsRequest;
import com.squareup.protos.cash.fx.app.CurrencyInfo;
import com.squareup.protos.cash.fx.app.ExchangeRate;
import com.squareup.protos.cash.fx.app.StreamExchangeRateRequest;
import com.squareup.protos.cash.gambit.api.v1.checkdeposit.DeclineReason;
import com.squareup.protos.cash.genericelements.ui.Alignment;
import com.squareup.protos.cash.genericelements.ui.AnalyticsData;
import com.squareup.protos.cash.genericelements.ui.AnalyticsEvent;
import com.squareup.protos.cash.genericelements.ui.ArcadeBadgedAvatarElement;
import com.squareup.protos.cash.genericelements.ui.CompactInfoComponent;
import com.squareup.protos.cash.genericelements.ui.ContainerElement;
import com.squareup.protos.cash.genericelements.ui.IconTextDetailElement;
import com.squareup.protos.cash.genericelements.ui.ImageElement;
import com.squareup.protos.cash.genericelements.ui.ListUnorderedComponent;
import com.squareup.protos.cash.genericelements.ui.SemanticIconColor;
import com.squareup.protos.cash.genericelements.ui.StyleAttributes;
import com.squareup.protos.cash.genericelements.ui.TextElement;
import com.squareup.protos.cash.genericelements.ui.TwoColumnComponent;
import com.squareup.protos.cash.genericelements.ui.ValueUnitComponent;
import com.squareup.protos.cash.grantly.api.Card;
import com.squareup.protos.cash.grantly.api.Channel;
import com.squareup.protos.cash.grantly.api.FullName;
import com.squareup.protos.cash.grantly.api.LoanOption;
import com.squareup.protos.cash.groups.GroupParticipant;
import com.squareup.protos.cash.incidentalerts.app.v1.GetIncidentsListRequest;
import com.squareup.protos.cash.incidentalerts.app.v1.SubscribeToIncidentResponse;
import com.squareup.protos.cash.incidentalerts.app.v1.UnsubscribeFromIncidentResponse;
import com.squareup.protos.cash.investflow.flows.SubmitInvestmentEntitySelectionRequest;
import com.squareup.protos.cash.janus.api.GetAccountSettingsRequest;
import com.squareup.protos.cash.janus.api.GetAuthorizedAccountRequest;
import com.squareup.protos.cash.janus.api.GetPublicContactAliasesRequest;
import com.squareup.protos.cash.janus.api.GetWebAuthnCredentialsRequest;
import com.squareup.protos.cash.janus.api.StartWebAuthnRegistrationRequest;
import com.squareup.protos.cash.local.client.app.internal.ClearAllCheckInsResponse;
import com.squareup.protos.cash.local.client.app.v1.ReportPresenceResponse;
import com.squareup.protos.cash.local.client.v1.AddressInputSpec;
import com.squareup.protos.cash.local.client.v1.GetBrandCollectionRequest;
import com.squareup.protos.cash.local.client.v1.GetNeighborhoodsTabContentRequest;
import com.squareup.protos.cash.local.client.v1.LocalMenuItem;
import com.squareup.protos.cash.local.client.v1.LocalProfileWidget;
import com.squareup.protos.cash.orderly.plasma.OmsInitiateLoanPaymentFlowParameters;
import com.squareup.protos.cash.semaphore.api.VendedFlagNode;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.SupportConfig;
import com.squareup.protos.franklin.common.PaymentRewardStatus;
import com.squareup.protos.franklin.ui.UiAppLock;
import com.squareup.protos.lending.sync_values.LendingInfo;
import com.squareup.protos.repeatedly.common.RecurringSchedule;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;
import squareup.cash.bankingbenefits.ui.GreenBenefitsV1;

/* loaded from: classes7.dex */
public final class Action extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Action> CREATOR;
    public final DrawableUtils details;

    /* renamed from: type, reason: collision with root package name */
    public final Type f1267type;

    public final class CheckingBalance extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<CheckingBalance> CREATOR;

        static {
            Action$CheckingBalance$Companion$ADAPTER$1 action$CheckingBalance$Companion$ADAPTER$1 = new Action$CheckingBalance$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CheckingBalance.class), "type.googleapis.com/squareup.cash.grantly.api.Action.CheckingBalance", Syntax.PROTO_2, null, "squareup/cash/grantly/api/action.proto");
            ADAPTER = action$CheckingBalance$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(action$CheckingBalance$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CheckingBalance(ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof CheckingBalance) && Intrinsics.areEqual(unknownFields(), ((CheckingBalance) obj).unknownFields());
        }

        public final int hashCode() {
            return unknownFields().hashCode();
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Empty.Builder builder = new Empty.Builder(29);
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            return "CheckingBalance{}";
        }
    }

    public final class CustomerProfileSharing extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<CustomerProfileSharing> CREATOR;
        public final String scope_id;

        static {
            Action$CustomerProfileSharing$Companion$ADAPTER$1 action$CustomerProfileSharing$Companion$ADAPTER$1 = new Action$CustomerProfileSharing$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CustomerProfileSharing.class), "type.googleapis.com/squareup.cash.grantly.api.Action.CustomerProfileSharing", Syntax.PROTO_2, null, "squareup/cash/grantly/api/action.proto");
            ADAPTER = action$CustomerProfileSharing$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(action$CustomerProfileSharing$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CustomerProfileSharing(String str, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.scope_id = str;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CustomerProfileSharing)) {
                return false;
            }
            CustomerProfileSharing customerProfileSharing = (CustomerProfileSharing) obj;
            return Intrinsics.areEqual(unknownFields(), customerProfileSharing.unknownFields()) && Intrinsics.areEqual(this.scope_id, customerProfileSharing.scope_id);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.scope_id;
            int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Favorite.Builder builder = new Favorite.Builder(8);
            builder.favorite_customer_token = this.scope_id;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.scope_id;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "scope_id=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "CustomerProfileSharing{", "}", 0, null, null, 56);
        }
    }

    public final class LinkAccount extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<LinkAccount> CREATOR;
        public final String primary_alias;
        public final String secondary_alias;

        static {
            Action$LinkAccount$Companion$ADAPTER$1 action$LinkAccount$Companion$ADAPTER$1 = new Action$LinkAccount$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LinkAccount.class), "type.googleapis.com/squareup.cash.grantly.api.Action.LinkAccount", Syntax.PROTO_2, null, "squareup/cash/grantly/api/action.proto");
            ADAPTER = action$LinkAccount$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(action$LinkAccount$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LinkAccount(String str, String str2, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.primary_alias = str;
            this.secondary_alias = str2;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof LinkAccount)) {
                return false;
            }
            LinkAccount linkAccount = (LinkAccount) obj;
            return Intrinsics.areEqual(unknownFields(), linkAccount.unknownFields()) && Intrinsics.areEqual(this.primary_alias, linkAccount.primary_alias) && Intrinsics.areEqual(this.secondary_alias, linkAccount.secondary_alias);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.primary_alias;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.secondary_alias;
            int hashCode3 = hashCode2 + (str2 != null ? str2.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            FullName.Builder builder = new FullName.Builder(3);
            builder.given_name = this.primary_alias;
            builder.family_name = this.secondary_alias;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            if (this.primary_alias != null) {
                arrayList.add("primary_alias=██");
            }
            if (this.secondary_alias != null) {
                arrayList.add("secondary_alias=██");
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "LinkAccount{", "}", 0, null, null, 56);
        }
    }

    public final class LinkAccountTidal extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<LinkAccountTidal> CREATOR;
        public final String account_reference_id;
        public final Boolean pre_verify;

        static {
            Action$LinkAccountTidal$Companion$ADAPTER$1 action$LinkAccountTidal$Companion$ADAPTER$1 = new Action$LinkAccountTidal$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LinkAccountTidal.class), "type.googleapis.com/squareup.cash.grantly.api.Action.LinkAccountTidal", Syntax.PROTO_2, null, "squareup/cash/grantly/api/action.proto");
            ADAPTER = action$LinkAccountTidal$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(action$LinkAccountTidal$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LinkAccountTidal(String str, Boolean bool, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.account_reference_id = str;
            this.pre_verify = bool;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof LinkAccountTidal)) {
                return false;
            }
            LinkAccountTidal linkAccountTidal = (LinkAccountTidal) obj;
            return Intrinsics.areEqual(unknownFields(), linkAccountTidal.unknownFields()) && Intrinsics.areEqual(this.account_reference_id, linkAccountTidal.account_reference_id) && Intrinsics.areEqual(this.pre_verify, linkAccountTidal.pre_verify);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.account_reference_id;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            Boolean bool = this.pre_verify;
            int hashCode3 = hashCode2 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            PaymentRewardStatus.Builder builder = new PaymentRewardStatus.Builder(5);
            builder.main_text = this.account_reference_id;
            builder.show_payments = this.pre_verify;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.account_reference_id;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "account_reference_id=", arrayList);
            }
            Boolean bool = this.pre_verify;
            if (bool != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("pre_verify=", bool, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "LinkAccountTidal{", "}", 0, null, null, 56);
        }
    }

    public final class OAuth extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<OAuth> CREATOR;
        public final Metadata metadata;
        public final List permissions;
        public final List scopes_requested;

        public final class Metadata extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<Metadata> CREATOR;
            public final HttpHeaderParser metadata;

            /* renamed from: type, reason: collision with root package name */
            public final Type f1269type;

            public final class AgentConnection extends AndroidMessage {
                public static final ProtoAdapter ADAPTER;
                public static final Parcelable.Creator<AgentConnection> CREATOR;
                public final String agent_account_token;

                static {
                    Action$OAuth$Metadata$AgentConnection$Companion$ADAPTER$1 action$OAuth$Metadata$AgentConnection$Companion$ADAPTER$1 = new Action$OAuth$Metadata$AgentConnection$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(AgentConnection.class), "type.googleapis.com/squareup.cash.grantly.api.Action.OAuth.Metadata.AgentConnection", Syntax.PROTO_2, null, "squareup/cash/grantly/api/action.proto");
                    ADAPTER = action$OAuth$Metadata$AgentConnection$Companion$ADAPTER$1;
                    AndroidMessage.Companion.getClass();
                    CREATOR = new AndroidMessage.ProtoAdapterCreator(action$OAuth$Metadata$AgentConnection$Companion$ADAPTER$1);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AgentConnection(String str, ByteString byteString) {
                    super(ADAPTER, byteString);
                    byteString.getClass();
                    this.agent_account_token = str;
                }

                public final boolean equals(Object obj) {
                    if (obj == this) {
                        return true;
                    }
                    if (!(obj instanceof AgentConnection)) {
                        return false;
                    }
                    AgentConnection agentConnection = (AgentConnection) obj;
                    return Intrinsics.areEqual(unknownFields(), agentConnection.unknownFields()) && Intrinsics.areEqual(this.agent_account_token, agentConnection.agent_account_token);
                }

                public final int hashCode() {
                    int i = this.hashCode;
                    if (i != 0) {
                        return i;
                    }
                    int hashCode = unknownFields().hashCode() * 37;
                    String str = this.agent_account_token;
                    int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
                    this.hashCode = hashCode2;
                    return hashCode2;
                }

                @Override // com.squareup.wire.Message
                public final Message.Builder newBuilder() {
                    Favorite.Builder builder = new Favorite.Builder(9);
                    builder.favorite_customer_token = this.agent_account_token;
                    builder.addUnknownFields(unknownFields());
                    return builder;
                }

                public final String toString() {
                    ArrayList arrayList = new ArrayList();
                    String str = this.agent_account_token;
                    if (str != null) {
                        BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "agent_account_token=", arrayList);
                    }
                    return CollectionsKt.joinToString$default(arrayList, ", ", "AgentConnection{", "}", 0, null, null, 56);
                }
            }

            public final class FinancialDataSharing extends AndroidMessage {
                public static final ProtoAdapter ADAPTER;
                public static final Parcelable.Creator<FinancialDataSharing> CREATOR;
                public final AuthorizedAccountTypes authorized_account_types;
                public final DataRecipient data_recipient;
                public final List intermediaries;
                public final DataSharingDuration selected_duration;

                public final class AuthorizedAccountTypes extends AndroidMessage {
                    public static final ProtoAdapter ADAPTER;
                    public static final Parcelable.Creator<AuthorizedAccountTypes> CREATOR;
                    public final IntPair authorized_account_types;

                    /* renamed from: type, reason: collision with root package name */
                    public final Type f1270type;

                    public enum AccountType implements WireEnum {
                        SVB(1),
                        SAVINGS(2),
                        BNPL(3);

                        public final int value;
                        public static final ImageLayout.Companion Companion = new ImageLayout.Companion();
                        public static final Action$OAuth$Metadata$FinancialDataSharing$AuthorizedAccountTypes$AccountType$Companion$ADAPTER$1 ADAPTER = new Action$OAuth$Metadata$FinancialDataSharing$AuthorizedAccountTypes$AccountType$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(AccountType.class), Syntax.PROTO_2, null);

                        AccountType(int i) {
                            this.value = i;
                        }

                        public static final AccountType fromValue(int i) {
                            Companion.getClass();
                            if (i == 1) {
                                return SVB;
                            }
                            if (i == 2) {
                                return SAVINGS;
                            }
                            if (i != 3) {
                                return null;
                            }
                            return BNPL;
                        }

                        @Override // com.squareup.wire.WireEnum
                        public final int getValue() {
                            return this.value;
                        }
                    }

                    public final class AllAccountTypes extends AndroidMessage {
                        public static final ProtoAdapter ADAPTER;
                        public static final Parcelable.Creator<AllAccountTypes> CREATOR;

                        static {
                            Action$OAuth$Metadata$FinancialDataSharing$AuthorizedAccountTypes$AllAccountTypes$Companion$ADAPTER$1 action$OAuth$Metadata$FinancialDataSharing$AuthorizedAccountTypes$AllAccountTypes$Companion$ADAPTER$1 = new Action$OAuth$Metadata$FinancialDataSharing$AuthorizedAccountTypes$AllAccountTypes$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(AllAccountTypes.class), "type.googleapis.com/squareup.cash.grantly.api.Action.OAuth.Metadata.FinancialDataSharing.AuthorizedAccountTypes.AllAccountTypes", Syntax.PROTO_2, null, "squareup/cash/grantly/api/action.proto");
                            ADAPTER = action$OAuth$Metadata$FinancialDataSharing$AuthorizedAccountTypes$AllAccountTypes$Companion$ADAPTER$1;
                            AndroidMessage.Companion.getClass();
                            CREATOR = new AndroidMessage.ProtoAdapterCreator(action$OAuth$Metadata$FinancialDataSharing$AuthorizedAccountTypes$AllAccountTypes$Companion$ADAPTER$1);
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AllAccountTypes(ByteString byteString) {
                            super(ADAPTER, byteString);
                            byteString.getClass();
                        }

                        public final boolean equals(Object obj) {
                            if (obj == this) {
                                return true;
                            }
                            return (obj instanceof AllAccountTypes) && Intrinsics.areEqual(unknownFields(), ((AllAccountTypes) obj).unknownFields());
                        }

                        public final int hashCode() {
                            return unknownFields().hashCode();
                        }

                        @Override // com.squareup.wire.Message
                        public final Message.Builder newBuilder() {
                            OpenID.Builder builder = new OpenID.Builder(1);
                            builder.addUnknownFields(unknownFields());
                            return builder;
                        }

                        public final String toString() {
                            return "AllAccountTypes{}";
                        }
                    }

                    public final class AuthorizedAccount extends AndroidMessage {
                        public static final ProtoAdapter ADAPTER;
                        public static final Parcelable.Creator<AuthorizedAccount> CREATOR;
                        public final FileSystemsKt account;

                        /* renamed from: type, reason: collision with root package name */
                        public final AccountType f1271type;

                        public final class SavingsAccount extends AndroidMessage {
                            public static final ProtoAdapter ADAPTER;
                            public static final Parcelable.Creator<SavingsAccount> CREATOR;
                            public final String external_account_number;

                            static {
                                Action$OAuth$Metadata$FinancialDataSharing$AuthorizedAccountTypes$AuthorizedAccount$SavingsAccount$Companion$ADAPTER$1 action$OAuth$Metadata$FinancialDataSharing$AuthorizedAccountTypes$AuthorizedAccount$SavingsAccount$Companion$ADAPTER$1 = new Action$OAuth$Metadata$FinancialDataSharing$AuthorizedAccountTypes$AuthorizedAccount$SavingsAccount$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SavingsAccount.class), "type.googleapis.com/squareup.cash.grantly.api.Action.OAuth.Metadata.FinancialDataSharing.AuthorizedAccountTypes.AuthorizedAccount.SavingsAccount", Syntax.PROTO_2, null, "squareup/cash/grantly/api/action.proto");
                                ADAPTER = action$OAuth$Metadata$FinancialDataSharing$AuthorizedAccountTypes$AuthorizedAccount$SavingsAccount$Companion$ADAPTER$1;
                                AndroidMessage.Companion.getClass();
                                CREATOR = new AndroidMessage.ProtoAdapterCreator(action$OAuth$Metadata$FinancialDataSharing$AuthorizedAccountTypes$AuthorizedAccount$SavingsAccount$Companion$ADAPTER$1);
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            public SavingsAccount(String str, ByteString byteString) {
                                super(ADAPTER, byteString);
                                byteString.getClass();
                                this.external_account_number = str;
                            }

                            public final boolean equals(Object obj) {
                                if (obj == this) {
                                    return true;
                                }
                                if (!(obj instanceof SavingsAccount)) {
                                    return false;
                                }
                                SavingsAccount savingsAccount = (SavingsAccount) obj;
                                return Intrinsics.areEqual(unknownFields(), savingsAccount.unknownFields()) && Intrinsics.areEqual(this.external_account_number, savingsAccount.external_account_number);
                            }

                            public final int hashCode() {
                                int i = this.hashCode;
                                if (i != 0) {
                                    return i;
                                }
                                int hashCode = unknownFields().hashCode() * 37;
                                String str = this.external_account_number;
                                int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
                                this.hashCode = hashCode2;
                                return hashCode2;
                            }

                            @Override // com.squareup.wire.Message
                            public final Message.Builder newBuilder() {
                                Favorite.Builder builder = new Favorite.Builder(10);
                                builder.favorite_customer_token = this.external_account_number;
                                builder.addUnknownFields(unknownFields());
                                return builder;
                            }

                            public final String toString() {
                                ArrayList arrayList = new ArrayList();
                                String str = this.external_account_number;
                                if (str != null) {
                                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "external_account_number=", arrayList);
                                }
                                return CollectionsKt.joinToString$default(arrayList, ", ", "SavingsAccount{", "}", 0, null, null, 56);
                            }
                        }

                        public final class SvbAccount extends AndroidMessage {
                            public static final ProtoAdapter ADAPTER;
                            public static final Parcelable.Creator<SvbAccount> CREATOR;
                            public final String external_account_number;

                            static {
                                Action$OAuth$Metadata$FinancialDataSharing$AuthorizedAccountTypes$AuthorizedAccount$SvbAccount$Companion$ADAPTER$1 action$OAuth$Metadata$FinancialDataSharing$AuthorizedAccountTypes$AuthorizedAccount$SvbAccount$Companion$ADAPTER$1 = new Action$OAuth$Metadata$FinancialDataSharing$AuthorizedAccountTypes$AuthorizedAccount$SvbAccount$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SvbAccount.class), "type.googleapis.com/squareup.cash.grantly.api.Action.OAuth.Metadata.FinancialDataSharing.AuthorizedAccountTypes.AuthorizedAccount.SvbAccount", Syntax.PROTO_2, null, "squareup/cash/grantly/api/action.proto");
                                ADAPTER = action$OAuth$Metadata$FinancialDataSharing$AuthorizedAccountTypes$AuthorizedAccount$SvbAccount$Companion$ADAPTER$1;
                                AndroidMessage.Companion.getClass();
                                CREATOR = new AndroidMessage.ProtoAdapterCreator(action$OAuth$Metadata$FinancialDataSharing$AuthorizedAccountTypes$AuthorizedAccount$SvbAccount$Companion$ADAPTER$1);
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            public SvbAccount(String str, ByteString byteString) {
                                super(ADAPTER, byteString);
                                byteString.getClass();
                                this.external_account_number = str;
                            }

                            public final boolean equals(Object obj) {
                                if (obj == this) {
                                    return true;
                                }
                                if (!(obj instanceof SvbAccount)) {
                                    return false;
                                }
                                SvbAccount svbAccount = (SvbAccount) obj;
                                return Intrinsics.areEqual(unknownFields(), svbAccount.unknownFields()) && Intrinsics.areEqual(this.external_account_number, svbAccount.external_account_number);
                            }

                            public final int hashCode() {
                                int i = this.hashCode;
                                if (i != 0) {
                                    return i;
                                }
                                int hashCode = unknownFields().hashCode() * 37;
                                String str = this.external_account_number;
                                int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
                                this.hashCode = hashCode2;
                                return hashCode2;
                            }

                            @Override // com.squareup.wire.Message
                            public final Message.Builder newBuilder() {
                                Favorite.Builder builder = new Favorite.Builder(11);
                                builder.favorite_customer_token = this.external_account_number;
                                builder.addUnknownFields(unknownFields());
                                return builder;
                            }

                            public final String toString() {
                                ArrayList arrayList = new ArrayList();
                                String str = this.external_account_number;
                                if (str != null) {
                                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "external_account_number=", arrayList);
                                }
                                return CollectionsKt.joinToString$default(arrayList, ", ", "SvbAccount{", "}", 0, null, null, 56);
                            }
                        }

                        static {
                            Action$OAuth$Metadata$FinancialDataSharing$AuthorizedAccountTypes$AuthorizedAccount$Companion$ADAPTER$1 action$OAuth$Metadata$FinancialDataSharing$AuthorizedAccountTypes$AuthorizedAccount$Companion$ADAPTER$1 = new Action$OAuth$Metadata$FinancialDataSharing$AuthorizedAccountTypes$AuthorizedAccount$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(AuthorizedAccount.class), "type.googleapis.com/squareup.cash.grantly.api.Action.OAuth.Metadata.FinancialDataSharing.AuthorizedAccountTypes.AuthorizedAccount", Syntax.PROTO_2, null, "squareup/cash/grantly/api/action.proto");
                            ADAPTER = action$OAuth$Metadata$FinancialDataSharing$AuthorizedAccountTypes$AuthorizedAccount$Companion$ADAPTER$1;
                            AndroidMessage.Companion.getClass();
                            CREATOR = new AndroidMessage.ProtoAdapterCreator(action$OAuth$Metadata$FinancialDataSharing$AuthorizedAccountTypes$AuthorizedAccount$Companion$ADAPTER$1);
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AuthorizedAccount(AccountType accountType, FileSystemsKt fileSystemsKt, ByteString byteString) {
                            super(ADAPTER, byteString);
                            byteString.getClass();
                            this.f1271type = accountType;
                            this.account = fileSystemsKt;
                        }

                        public final boolean equals(Object obj) {
                            if (obj == this) {
                                return true;
                            }
                            if (!(obj instanceof AuthorizedAccount)) {
                                return false;
                            }
                            AuthorizedAccount authorizedAccount = (AuthorizedAccount) obj;
                            return Intrinsics.areEqual(unknownFields(), authorizedAccount.unknownFields()) && this.f1271type == authorizedAccount.f1271type && Intrinsics.areEqual(this.account, authorizedAccount.account);
                        }

                        public final int hashCode() {
                            int i = this.hashCode;
                            if (i != 0) {
                                return i;
                            }
                            int hashCode = unknownFields().hashCode() * 37;
                            AccountType accountType = this.f1271type;
                            int hashCode2 = (hashCode + (accountType != null ? accountType.hashCode() : 0)) * 37;
                            FileSystemsKt fileSystemsKt = this.account;
                            int hashCode3 = hashCode2 + (fileSystemsKt != null ? fileSystemsKt.hashCode() : 0);
                            this.hashCode = hashCode3;
                            return hashCode3;
                        }

                        @Override // com.squareup.wire.Message
                        public final Message.Builder newBuilder() {
                            Builder builder = new Builder(28);
                            builder.f1268type = this.f1271type;
                            builder.details = this.account;
                            builder.addUnknownFields(unknownFields());
                            return builder;
                        }

                        public final String toString() {
                            ArrayList arrayList = new ArrayList();
                            AccountType accountType = this.f1271type;
                            if (accountType != null) {
                                arrayList.add("type=" + accountType);
                            }
                            FileSystemsKt fileSystemsKt = this.account;
                            if (fileSystemsKt != null) {
                                arrayList.add("account=" + fileSystemsKt);
                            }
                            return CollectionsKt.joinToString$default(arrayList, ", ", "AuthorizedAccount{", "}", 0, null, null, 56);
                        }
                    }

                    public final class LimitedAccountTypes extends AndroidMessage {
                        public static final ProtoAdapter ADAPTER;
                        public static final Parcelable.Creator<LimitedAccountTypes> CREATOR;
                        public final List account_types;
                        public final List accounts;

                        static {
                            Action$OAuth$Metadata$FinancialDataSharing$AuthorizedAccountTypes$LimitedAccountTypes$Companion$ADAPTER$1 action$OAuth$Metadata$FinancialDataSharing$AuthorizedAccountTypes$LimitedAccountTypes$Companion$ADAPTER$1 = new Action$OAuth$Metadata$FinancialDataSharing$AuthorizedAccountTypes$LimitedAccountTypes$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LimitedAccountTypes.class), "type.googleapis.com/squareup.cash.grantly.api.Action.OAuth.Metadata.FinancialDataSharing.AuthorizedAccountTypes.LimitedAccountTypes", Syntax.PROTO_2, null, "squareup/cash/grantly/api/action.proto");
                            ADAPTER = action$OAuth$Metadata$FinancialDataSharing$AuthorizedAccountTypes$LimitedAccountTypes$Companion$ADAPTER$1;
                            AndroidMessage.Companion.getClass();
                            CREATOR = new AndroidMessage.ProtoAdapterCreator(action$OAuth$Metadata$FinancialDataSharing$AuthorizedAccountTypes$LimitedAccountTypes$Companion$ADAPTER$1);
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public LimitedAccountTypes(List list, List list2, ByteString byteString) {
                            super(ADAPTER, byteString);
                            BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, byteString);
                            this.accounts = TransactorKt.immutableCopyOf("accounts", list);
                            this.account_types = TransactorKt.immutableCopyOf("account_types", list2);
                        }

                        public final boolean equals(Object obj) {
                            if (obj == this) {
                                return true;
                            }
                            if (!(obj instanceof LimitedAccountTypes)) {
                                return false;
                            }
                            LimitedAccountTypes limitedAccountTypes = (LimitedAccountTypes) obj;
                            return Intrinsics.areEqual(unknownFields(), limitedAccountTypes.unknownFields()) && Intrinsics.areEqual(this.accounts, limitedAccountTypes.accounts) && Intrinsics.areEqual(this.account_types, limitedAccountTypes.account_types);
                        }

                        public final int hashCode() {
                            int i = this.hashCode;
                            if (i != 0) {
                                return i;
                            }
                            int hashCode = this.account_types.hashCode() + Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.accounts);
                            this.hashCode = hashCode;
                            return hashCode;
                        }

                        @Override // com.squareup.wire.Message
                        public final Message.Builder newBuilder() {
                            GreenBenefitsV1.Builder builder = new GreenBenefitsV1.Builder(10, false);
                            builder.card_holder_benefits = this.accounts;
                            builder.green_status_benefits = this.account_types;
                            builder.addUnknownFields(unknownFields());
                            return builder;
                        }

                        public final String toString() {
                            ArrayList arrayList = new ArrayList();
                            List list = this.accounts;
                            if (!list.isEmpty()) {
                                re$$ExternalSyntheticOutline0.m("accounts=", arrayList, list);
                            }
                            List list2 = this.account_types;
                            if (!list2.isEmpty()) {
                                re$$ExternalSyntheticOutline0.m("account_types=", arrayList, list2);
                            }
                            return CollectionsKt.joinToString$default(arrayList, ", ", "LimitedAccountTypes{", "}", 0, null, null, 56);
                        }
                    }

                    public enum Type implements WireEnum {
                        ALL_ACCOUNT_TYPES(1),
                        LIMITED_ACCOUNT_TYPES(2);

                        public final int value;
                        public static final Type.Companion Companion = new Type.Companion();
                        public static final Action$OAuth$Metadata$FinancialDataSharing$AuthorizedAccountTypes$Type$Companion$ADAPTER$1 ADAPTER = new Action$OAuth$Metadata$FinancialDataSharing$AuthorizedAccountTypes$Type$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Type.class), Syntax.PROTO_2, null);

                        Type(int i) {
                            this.value = i;
                        }

                        public static final Type fromValue(int i) {
                            Companion.getClass();
                            if (i == 1) {
                                return ALL_ACCOUNT_TYPES;
                            }
                            if (i != 2) {
                                return null;
                            }
                            return LIMITED_ACCOUNT_TYPES;
                        }

                        @Override // com.squareup.wire.WireEnum
                        public final int getValue() {
                            return this.value;
                        }
                    }

                    static {
                        Action$OAuth$Metadata$FinancialDataSharing$AuthorizedAccountTypes$Companion$ADAPTER$1 action$OAuth$Metadata$FinancialDataSharing$AuthorizedAccountTypes$Companion$ADAPTER$1 = new Action$OAuth$Metadata$FinancialDataSharing$AuthorizedAccountTypes$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(AuthorizedAccountTypes.class), "type.googleapis.com/squareup.cash.grantly.api.Action.OAuth.Metadata.FinancialDataSharing.AuthorizedAccountTypes", Syntax.PROTO_2, null, "squareup/cash/grantly/api/action.proto");
                        ADAPTER = action$OAuth$Metadata$FinancialDataSharing$AuthorizedAccountTypes$Companion$ADAPTER$1;
                        AndroidMessage.Companion.getClass();
                        CREATOR = new AndroidMessage.ProtoAdapterCreator(action$OAuth$Metadata$FinancialDataSharing$AuthorizedAccountTypes$Companion$ADAPTER$1);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AuthorizedAccountTypes(Type type2, IntPair intPair, ByteString byteString) {
                        super(ADAPTER, byteString);
                        byteString.getClass();
                        this.f1270type = type2;
                        this.authorized_account_types = intPair;
                    }

                    public final boolean equals(Object obj) {
                        if (obj == this) {
                            return true;
                        }
                        if (!(obj instanceof AuthorizedAccountTypes)) {
                            return false;
                        }
                        AuthorizedAccountTypes authorizedAccountTypes = (AuthorizedAccountTypes) obj;
                        return Intrinsics.areEqual(unknownFields(), authorizedAccountTypes.unknownFields()) && this.f1270type == authorizedAccountTypes.f1270type && Intrinsics.areEqual(this.authorized_account_types, authorizedAccountTypes.authorized_account_types);
                    }

                    public final int hashCode() {
                        int i = this.hashCode;
                        if (i != 0) {
                            return i;
                        }
                        int hashCode = unknownFields().hashCode() * 37;
                        Type type2 = this.f1270type;
                        int hashCode2 = (hashCode + (type2 != null ? type2.hashCode() : 0)) * 37;
                        IntPair intPair = this.authorized_account_types;
                        int hashCode3 = hashCode2 + (intPair != null ? intPair.hashCode() : 0);
                        this.hashCode = hashCode3;
                        return hashCode3;
                    }

                    @Override // com.squareup.wire.Message
                    public final Message.Builder newBuilder() {
                        Builder builder = new Builder(29);
                        builder.f1268type = this.f1270type;
                        builder.details = this.authorized_account_types;
                        builder.addUnknownFields(unknownFields());
                        return builder;
                    }

                    public final String toString() {
                        ArrayList arrayList = new ArrayList();
                        Type type2 = this.f1270type;
                        if (type2 != null) {
                            arrayList.add("type=" + type2);
                        }
                        IntPair intPair = this.authorized_account_types;
                        if (intPair != null) {
                            arrayList.add("authorized_account_types=" + intPair);
                        }
                        return CollectionsKt.joinToString$default(arrayList, ", ", "AuthorizedAccountTypes{", "}", 0, null, null, 56);
                    }
                }

                public final class DataRecipient extends AndroidMessage {
                    public static final ProtoAdapter ADAPTER;
                    public static final Parcelable.Creator<DataRecipient> CREATOR;
                    public final String client_id;

                    static {
                        Action$OAuth$Metadata$FinancialDataSharing$DataRecipient$Companion$ADAPTER$1 action$OAuth$Metadata$FinancialDataSharing$DataRecipient$Companion$ADAPTER$1 = new Action$OAuth$Metadata$FinancialDataSharing$DataRecipient$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(DataRecipient.class), "type.googleapis.com/squareup.cash.grantly.api.Action.OAuth.Metadata.FinancialDataSharing.DataRecipient", Syntax.PROTO_2, null, "squareup/cash/grantly/api/action.proto");
                        ADAPTER = action$OAuth$Metadata$FinancialDataSharing$DataRecipient$Companion$ADAPTER$1;
                        AndroidMessage.Companion.getClass();
                        CREATOR = new AndroidMessage.ProtoAdapterCreator(action$OAuth$Metadata$FinancialDataSharing$DataRecipient$Companion$ADAPTER$1);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public DataRecipient(String str, ByteString byteString) {
                        super(ADAPTER, byteString);
                        byteString.getClass();
                        this.client_id = str;
                    }

                    public final boolean equals(Object obj) {
                        if (obj == this) {
                            return true;
                        }
                        if (!(obj instanceof DataRecipient)) {
                            return false;
                        }
                        DataRecipient dataRecipient = (DataRecipient) obj;
                        return Intrinsics.areEqual(unknownFields(), dataRecipient.unknownFields()) && Intrinsics.areEqual(this.client_id, dataRecipient.client_id);
                    }

                    public final int hashCode() {
                        int i = this.hashCode;
                        if (i != 0) {
                            return i;
                        }
                        int hashCode = unknownFields().hashCode() * 37;
                        String str = this.client_id;
                        int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
                        this.hashCode = hashCode2;
                        return hashCode2;
                    }

                    @Override // com.squareup.wire.Message
                    public final Message.Builder newBuilder() {
                        Favorite.Builder builder = new Favorite.Builder(12);
                        builder.favorite_customer_token = this.client_id;
                        builder.addUnknownFields(unknownFields());
                        return builder;
                    }

                    public final String toString() {
                        ArrayList arrayList = new ArrayList();
                        String str = this.client_id;
                        if (str != null) {
                            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "client_id=", arrayList);
                        }
                        return CollectionsKt.joinToString$default(arrayList, ", ", "DataRecipient{", "}", 0, null, null, 56);
                    }
                }

                public enum DataSharingDuration implements WireEnum {
                    ONE_DAY(1),
                    THIRTY_DAYS(2),
                    THREE_MONTHS(3),
                    ONE_YEAR(4);

                    public final int value;
                    public static final Alignment.Companion Companion = new Alignment.Companion();
                    public static final Action$OAuth$Metadata$FinancialDataSharing$DataSharingDuration$Companion$ADAPTER$1 ADAPTER = new Action$OAuth$Metadata$FinancialDataSharing$DataSharingDuration$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(DataSharingDuration.class), Syntax.PROTO_2, null);

                    DataSharingDuration(int i) {
                        this.value = i;
                    }

                    public static final DataSharingDuration fromValue(int i) {
                        Companion.getClass();
                        if (i == 1) {
                            return ONE_DAY;
                        }
                        if (i == 2) {
                            return THIRTY_DAYS;
                        }
                        if (i == 3) {
                            return THREE_MONTHS;
                        }
                        if (i != 4) {
                            return null;
                        }
                        return ONE_YEAR;
                    }

                    @Override // com.squareup.wire.WireEnum
                    public final int getValue() {
                        return this.value;
                    }
                }

                public final class Intermediary extends AndroidMessage {
                    public static final ProtoAdapter ADAPTER;
                    public static final Parcelable.Creator<Intermediary> CREATOR;
                    public final String intermediary_id;

                    static {
                        Action$OAuth$Metadata$FinancialDataSharing$Intermediary$Companion$ADAPTER$1 action$OAuth$Metadata$FinancialDataSharing$Intermediary$Companion$ADAPTER$1 = new Action$OAuth$Metadata$FinancialDataSharing$Intermediary$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Intermediary.class), "type.googleapis.com/squareup.cash.grantly.api.Action.OAuth.Metadata.FinancialDataSharing.Intermediary", Syntax.PROTO_2, null, "squareup/cash/grantly/api/action.proto");
                        ADAPTER = action$OAuth$Metadata$FinancialDataSharing$Intermediary$Companion$ADAPTER$1;
                        AndroidMessage.Companion.getClass();
                        CREATOR = new AndroidMessage.ProtoAdapterCreator(action$OAuth$Metadata$FinancialDataSharing$Intermediary$Companion$ADAPTER$1);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public Intermediary(String str, ByteString byteString) {
                        super(ADAPTER, byteString);
                        byteString.getClass();
                        this.intermediary_id = str;
                    }

                    public final boolean equals(Object obj) {
                        if (obj == this) {
                            return true;
                        }
                        if (!(obj instanceof Intermediary)) {
                            return false;
                        }
                        Intermediary intermediary = (Intermediary) obj;
                        return Intrinsics.areEqual(unknownFields(), intermediary.unknownFields()) && Intrinsics.areEqual(this.intermediary_id, intermediary.intermediary_id);
                    }

                    public final int hashCode() {
                        int i = this.hashCode;
                        if (i != 0) {
                            return i;
                        }
                        int hashCode = unknownFields().hashCode() * 37;
                        String str = this.intermediary_id;
                        int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
                        this.hashCode = hashCode2;
                        return hashCode2;
                    }

                    @Override // com.squareup.wire.Message
                    public final Message.Builder newBuilder() {
                        Favorite.Builder builder = new Favorite.Builder(13);
                        builder.favorite_customer_token = this.intermediary_id;
                        builder.addUnknownFields(unknownFields());
                        return builder;
                    }

                    public final String toString() {
                        ArrayList arrayList = new ArrayList();
                        String str = this.intermediary_id;
                        if (str != null) {
                            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "intermediary_id=", arrayList);
                        }
                        return CollectionsKt.joinToString$default(arrayList, ", ", "Intermediary{", "}", 0, null, null, 56);
                    }
                }

                static {
                    Action$OAuth$Metadata$FinancialDataSharing$Companion$ADAPTER$1 action$OAuth$Metadata$FinancialDataSharing$Companion$ADAPTER$1 = new Action$OAuth$Metadata$FinancialDataSharing$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(FinancialDataSharing.class), "type.googleapis.com/squareup.cash.grantly.api.Action.OAuth.Metadata.FinancialDataSharing", Syntax.PROTO_2, null, "squareup/cash/grantly/api/action.proto");
                    ADAPTER = action$OAuth$Metadata$FinancialDataSharing$Companion$ADAPTER$1;
                    AndroidMessage.Companion.getClass();
                    CREATOR = new AndroidMessage.ProtoAdapterCreator(action$OAuth$Metadata$FinancialDataSharing$Companion$ADAPTER$1);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public FinancialDataSharing(AuthorizedAccountTypes authorizedAccountTypes, DataRecipient dataRecipient, List list, DataSharingDuration dataSharingDuration, ByteString byteString) {
                    super(ADAPTER, byteString);
                    list.getClass();
                    byteString.getClass();
                    this.authorized_account_types = authorizedAccountTypes;
                    this.data_recipient = dataRecipient;
                    this.selected_duration = dataSharingDuration;
                    this.intermediaries = TransactorKt.immutableCopyOf("intermediaries", list);
                }

                public final boolean equals(Object obj) {
                    if (obj == this) {
                        return true;
                    }
                    if (!(obj instanceof FinancialDataSharing)) {
                        return false;
                    }
                    FinancialDataSharing financialDataSharing = (FinancialDataSharing) obj;
                    return Intrinsics.areEqual(unknownFields(), financialDataSharing.unknownFields()) && Intrinsics.areEqual(this.authorized_account_types, financialDataSharing.authorized_account_types) && Intrinsics.areEqual(this.data_recipient, financialDataSharing.data_recipient) && Intrinsics.areEqual(this.intermediaries, financialDataSharing.intermediaries) && this.selected_duration == financialDataSharing.selected_duration;
                }

                public final int hashCode() {
                    int i = this.hashCode;
                    if (i != 0) {
                        return i;
                    }
                    int hashCode = unknownFields().hashCode() * 37;
                    AuthorizedAccountTypes authorizedAccountTypes = this.authorized_account_types;
                    int hashCode2 = (hashCode + (authorizedAccountTypes != null ? authorizedAccountTypes.hashCode() : 0)) * 37;
                    DataRecipient dataRecipient = this.data_recipient;
                    int m = Recorder$$ExternalSyntheticOutline2.m((hashCode2 + (dataRecipient != null ? dataRecipient.hashCode() : 0)) * 37, 37, this.intermediaries);
                    DataSharingDuration dataSharingDuration = this.selected_duration;
                    int hashCode3 = m + (dataSharingDuration != null ? dataSharingDuration.hashCode() : 0);
                    this.hashCode = hashCode3;
                    return hashCode3;
                }

                @Override // com.squareup.wire.Message
                public final Message.Builder newBuilder() {
                    Card.CardPii.Builder builder = new Card.CardPii.Builder(17, false);
                    builder.postal_code = this.authorized_account_types;
                    builder.last_four_digits = this.data_recipient;
                    builder.expiration = this.intermediaries;
                    builder.ciphertext_ = this.selected_duration;
                    builder.addUnknownFields(unknownFields());
                    return builder;
                }

                public final String toString() {
                    ArrayList arrayList = new ArrayList();
                    AuthorizedAccountTypes authorizedAccountTypes = this.authorized_account_types;
                    if (authorizedAccountTypes != null) {
                        arrayList.add("authorized_account_types=" + authorizedAccountTypes);
                    }
                    DataRecipient dataRecipient = this.data_recipient;
                    if (dataRecipient != null) {
                        arrayList.add("data_recipient=" + dataRecipient);
                    }
                    List list = this.intermediaries;
                    if (!list.isEmpty()) {
                        re$$ExternalSyntheticOutline0.m("intermediaries=", arrayList, list);
                    }
                    DataSharingDuration dataSharingDuration = this.selected_duration;
                    if (dataSharingDuration != null) {
                        arrayList.add("selected_duration=" + dataSharingDuration);
                    }
                    return CollectionsKt.joinToString$default(arrayList, ", ", "FinancialDataSharing{", "}", 0, null, null, 56);
                }
            }

            public enum Type implements WireEnum {
                FINANCIAL_DATA_SHARING(1),
                AGENT_CONNECTION(2);

                public final int value;
                public static final Channel.Companion Companion = new Channel.Companion();
                public static final Action$OAuth$Metadata$Type$Companion$ADAPTER$1 ADAPTER = new Action$OAuth$Metadata$Type$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Type.class), Syntax.PROTO_2, null);

                Type(int i) {
                    this.value = i;
                }

                public static final Type fromValue(int i) {
                    Companion.getClass();
                    if (i == 1) {
                        return FINANCIAL_DATA_SHARING;
                    }
                    if (i != 2) {
                        return null;
                    }
                    return AGENT_CONNECTION;
                }

                @Override // com.squareup.wire.WireEnum
                public final int getValue() {
                    return this.value;
                }
            }

            static {
                Action$OAuth$Metadata$Companion$ADAPTER$1 action$OAuth$Metadata$Companion$ADAPTER$1 = new Action$OAuth$Metadata$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Metadata.class), "type.googleapis.com/squareup.cash.grantly.api.Action.OAuth.Metadata", Syntax.PROTO_2, null, "squareup/cash/grantly/api/action.proto");
                ADAPTER = action$OAuth$Metadata$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(action$OAuth$Metadata$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Metadata(Type type2, HttpHeaderParser httpHeaderParser, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.f1269type = type2;
                this.metadata = httpHeaderParser;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Metadata)) {
                    return false;
                }
                Metadata metadata = (Metadata) obj;
                return Intrinsics.areEqual(unknownFields(), metadata.unknownFields()) && this.f1269type == metadata.f1269type && Intrinsics.areEqual(this.metadata, metadata.metadata);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                Type type2 = this.f1269type;
                int hashCode2 = (hashCode + (type2 != null ? type2.hashCode() : 0)) * 37;
                HttpHeaderParser httpHeaderParser = this.metadata;
                int hashCode3 = hashCode2 + (httpHeaderParser != null ? httpHeaderParser.hashCode() : 0);
                this.hashCode = hashCode3;
                return hashCode3;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                Builder builder = new Builder(27);
                builder.f1268type = this.f1269type;
                builder.details = this.metadata;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                Type type2 = this.f1269type;
                if (type2 != null) {
                    arrayList.add("type=" + type2);
                }
                HttpHeaderParser httpHeaderParser = this.metadata;
                if (httpHeaderParser != null) {
                    arrayList.add("metadata=" + httpHeaderParser);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "Metadata{", "}", 0, null, null, 56);
            }
        }

        public enum Permission implements WireEnum {
            CUSTOMER_CASHTAG_READ(1),
            ACCOUNT_BAL_READ(2);

            public final int value;
            public static final RadioType.Companion Companion = new RadioType.Companion();
            public static final Action$OAuth$Permission$Companion$ADAPTER$1 ADAPTER = new Action$OAuth$Permission$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Permission.class), Syntax.PROTO_2, null);

            Permission(int i) {
                this.value = i;
            }

            public static final Permission fromValue(int i) {
                Companion.getClass();
                if (i == 1) {
                    return CUSTOMER_CASHTAG_READ;
                }
                if (i != 2) {
                    return null;
                }
                return ACCOUNT_BAL_READ;
            }

            @Override // com.squareup.wire.WireEnum
            public final int getValue() {
                return this.value;
            }
        }

        static {
            Action$OAuth$Companion$ADAPTER$1 action$OAuth$Companion$ADAPTER$1 = new Action$OAuth$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(OAuth.class), "type.googleapis.com/squareup.cash.grantly.api.Action.OAuth", Syntax.PROTO_2, null, "squareup/cash/grantly/api/action.proto");
            ADAPTER = action$OAuth$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(action$OAuth$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OAuth(List list, Metadata metadata, List list2, ByteString byteString) {
            super(ADAPTER, byteString);
            BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, byteString);
            this.metadata = metadata;
            this.permissions = TransactorKt.immutableCopyOf("permissions", list);
            this.scopes_requested = TransactorKt.immutableCopyOf("scopes_requested", list2);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof OAuth)) {
                return false;
            }
            OAuth oAuth = (OAuth) obj;
            return Intrinsics.areEqual(unknownFields(), oAuth.unknownFields()) && Intrinsics.areEqual(this.permissions, oAuth.permissions) && Intrinsics.areEqual(this.metadata, oAuth.metadata) && Intrinsics.areEqual(this.scopes_requested, oAuth.scopes_requested);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.permissions);
            Metadata metadata = this.metadata;
            int hashCode = this.scopes_requested.hashCode() + ((m + (metadata != null ? metadata.hashCode() : 0)) * 37);
            this.hashCode = hashCode;
            return hashCode;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            LoanOption.Builder builder = new LoanOption.Builder(24);
            builder.payment_schedule = this.permissions;
            builder.loan_type = this.metadata;
            builder.tila_data = this.scopes_requested;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            List list = this.permissions;
            if (!list.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("permissions=", arrayList, list);
            }
            Metadata metadata = this.metadata;
            if (metadata != null) {
                arrayList.add("metadata=" + metadata);
            }
            List list2 = this.scopes_requested;
            if (!list2.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("scopes_requested=", arrayList, list2);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "OAuth{", "}", 0, null, null, 56);
        }
    }

    public final class OnFileDeposit extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<OnFileDeposit> CREATOR;
        public final String account_reference_id;
        public final String scope_id;

        static {
            Action$OnFileDeposit$Companion$ADAPTER$1 action$OnFileDeposit$Companion$ADAPTER$1 = new Action$OnFileDeposit$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(OnFileDeposit.class), "type.googleapis.com/squareup.cash.grantly.api.Action.OnFileDeposit", Syntax.PROTO_2, null, "squareup/cash/grantly/api/action.proto");
            ADAPTER = action$OnFileDeposit$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(action$OnFileDeposit$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnFileDeposit(String str, String str2, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.scope_id = str;
            this.account_reference_id = str2;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof OnFileDeposit)) {
                return false;
            }
            OnFileDeposit onFileDeposit = (OnFileDeposit) obj;
            return Intrinsics.areEqual(unknownFields(), onFileDeposit.unknownFields()) && Intrinsics.areEqual(this.scope_id, onFileDeposit.scope_id) && Intrinsics.areEqual(this.account_reference_id, onFileDeposit.account_reference_id);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.scope_id;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.account_reference_id;
            int hashCode3 = hashCode2 + (str2 != null ? str2.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            FullName.Builder builder = new FullName.Builder(4);
            builder.given_name = this.scope_id;
            builder.family_name = this.account_reference_id;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.scope_id;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "scope_id=", arrayList);
            }
            String str2 = this.account_reference_id;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "account_reference_id=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "OnFileDeposit{", "}", 0, null, null, 56);
        }
    }

    public final class OnFilePayment extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<OnFilePayment> CREATOR;
        public final String account_reference_id;
        public final CheckoutOptions checkout_options;
        public final Context context;
        public final String scope_id;

        public final class CheckoutOptions extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<CheckoutOptions> CREATOR;
            public final ScopeOptions scope_options;

            static {
                Action$OnFilePayment$CheckoutOptions$Companion$ADAPTER$1 action$OnFilePayment$CheckoutOptions$Companion$ADAPTER$1 = new Action$OnFilePayment$CheckoutOptions$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CheckoutOptions.class), "type.googleapis.com/squareup.cash.grantly.api.Action.OnFilePayment.CheckoutOptions", Syntax.PROTO_2, null, "squareup/cash/grantly/api/action.proto");
                ADAPTER = action$OnFilePayment$CheckoutOptions$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(action$OnFilePayment$CheckoutOptions$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CheckoutOptions(ScopeOptions scopeOptions, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.scope_options = scopeOptions;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof CheckoutOptions)) {
                    return false;
                }
                CheckoutOptions checkoutOptions = (CheckoutOptions) obj;
                return Intrinsics.areEqual(unknownFields(), checkoutOptions.unknownFields()) && Intrinsics.areEqual(this.scope_options, checkoutOptions.scope_options);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                ScopeOptions scopeOptions = this.scope_options;
                int hashCode2 = hashCode + (scopeOptions != null ? scopeOptions.hashCode() : 0);
                this.hashCode = hashCode2;
                return hashCode2;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                Asset.Builder builder = new Asset.Builder(29);
                builder.asset_type = this.scope_options;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                ScopeOptions scopeOptions = this.scope_options;
                if (scopeOptions != null) {
                    arrayList.add("scope_options=" + scopeOptions);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "CheckoutOptions{", "}", 0, null, null, 56);
            }
        }

        public final class Context extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<Context> CREATOR;
            public final String order_id;

            static {
                Action$OnFilePayment$Context$Companion$ADAPTER$1 action$OnFilePayment$Context$Companion$ADAPTER$1 = new Action$OnFilePayment$Context$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Context.class), "type.googleapis.com/squareup.cash.grantly.api.Action.OnFilePayment.Context", Syntax.PROTO_2, null, "squareup/cash/grantly/api/action.proto");
                ADAPTER = action$OnFilePayment$Context$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(action$OnFilePayment$Context$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Context(String str, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.order_id = str;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Context)) {
                    return false;
                }
                Context context = (Context) obj;
                return Intrinsics.areEqual(unknownFields(), context.unknownFields()) && Intrinsics.areEqual(this.order_id, context.order_id);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                String str = this.order_id;
                int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
                this.hashCode = hashCode2;
                return hashCode2;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                Favorite.Builder builder = new Favorite.Builder(14);
                builder.favorite_customer_token = this.order_id;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                String str = this.order_id;
                if (str != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "order_id=", arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "Context{", "}", 0, null, null, 56);
            }
        }

        static {
            Action$OnFilePayment$Companion$ADAPTER$1 action$OnFilePayment$Companion$ADAPTER$1 = new Action$OnFilePayment$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(OnFilePayment.class), "type.googleapis.com/squareup.cash.grantly.api.Action.OnFilePayment", Syntax.PROTO_2, null, "squareup/cash/grantly/api/action.proto");
            ADAPTER = action$OnFilePayment$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(action$OnFilePayment$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnFilePayment(String str, String str2, Context context, CheckoutOptions checkoutOptions, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.scope_id = str;
            this.account_reference_id = str2;
            this.context = context;
            this.checkout_options = checkoutOptions;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof OnFilePayment)) {
                return false;
            }
            OnFilePayment onFilePayment = (OnFilePayment) obj;
            return Intrinsics.areEqual(unknownFields(), onFilePayment.unknownFields()) && Intrinsics.areEqual(this.scope_id, onFilePayment.scope_id) && Intrinsics.areEqual(this.account_reference_id, onFilePayment.account_reference_id) && Intrinsics.areEqual(this.context, onFilePayment.context) && Intrinsics.areEqual(this.checkout_options, onFilePayment.checkout_options);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.scope_id;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.account_reference_id;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
            Context context = this.context;
            int hashCode4 = (hashCode3 + (context != null ? context.hashCode() : 0)) * 37;
            CheckoutOptions checkoutOptions = this.checkout_options;
            int hashCode5 = hashCode4 + (checkoutOptions != null ? checkoutOptions.hashCode() : 0);
            this.hashCode = hashCode5;
            return hashCode5;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Card.CardPii.Builder builder = new Card.CardPii.Builder(18, false);
            builder.postal_code = this.scope_id;
            builder.last_four_digits = this.account_reference_id;
            builder.expiration = this.context;
            builder.ciphertext_ = this.checkout_options;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.scope_id;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "scope_id=", arrayList);
            }
            String str2 = this.account_reference_id;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "account_reference_id=", arrayList);
            }
            Context context = this.context;
            if (context != null) {
                arrayList.add("context=" + context);
            }
            CheckoutOptions checkoutOptions = this.checkout_options;
            if (checkoutOptions != null) {
                arrayList.add("checkout_options=" + checkoutOptions);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "OnFilePayment{", "}", 0, null, null, 56);
        }
    }

    public final class OnFilePayout extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<OnFilePayout> CREATOR;
        public final String account_reference_id;
        public final String scope_id;

        static {
            Action$OnFilePayout$Companion$ADAPTER$1 action$OnFilePayout$Companion$ADAPTER$1 = new Action$OnFilePayout$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(OnFilePayout.class), "type.googleapis.com/squareup.cash.grantly.api.Action.OnFilePayout", Syntax.PROTO_2, null, "squareup/cash/grantly/api/action.proto");
            ADAPTER = action$OnFilePayout$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(action$OnFilePayout$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnFilePayout(String str, String str2, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.scope_id = str;
            this.account_reference_id = str2;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof OnFilePayout)) {
                return false;
            }
            OnFilePayout onFilePayout = (OnFilePayout) obj;
            return Intrinsics.areEqual(unknownFields(), onFilePayout.unknownFields()) && Intrinsics.areEqual(this.scope_id, onFilePayout.scope_id) && Intrinsics.areEqual(this.account_reference_id, onFilePayout.account_reference_id);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.scope_id;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.account_reference_id;
            int hashCode3 = hashCode2 + (str2 != null ? str2.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            FullName.Builder builder = new FullName.Builder(5);
            builder.given_name = this.scope_id;
            builder.family_name = this.account_reference_id;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.scope_id;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "scope_id=", arrayList);
            }
            String str2 = this.account_reference_id;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "account_reference_id=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "OnFilePayout{", "}", 0, null, null, 56);
        }
    }

    public final class OneTimePayment extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<OneTimePayment> CREATOR;
        public final Long amount;
        public final CheckoutOptions checkout_options;
        public final CurrencyCode currency;
        public final String order_id;
        public final String scope_id;

        public final class CheckoutOptions extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<CheckoutOptions> CREATOR;
            public final Boolean automatic_discounts;
            public final ScopeOptions scope_options;

            static {
                Action$OneTimePayment$CheckoutOptions$Companion$ADAPTER$1 action$OneTimePayment$CheckoutOptions$Companion$ADAPTER$1 = new Action$OneTimePayment$CheckoutOptions$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CheckoutOptions.class), "type.googleapis.com/squareup.cash.grantly.api.Action.OneTimePayment.CheckoutOptions", Syntax.PROTO_2, null, "squareup/cash/grantly/api/action.proto");
                ADAPTER = action$OneTimePayment$CheckoutOptions$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(action$OneTimePayment$CheckoutOptions$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CheckoutOptions(Boolean bool, ScopeOptions scopeOptions, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.automatic_discounts = bool;
                this.scope_options = scopeOptions;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof CheckoutOptions)) {
                    return false;
                }
                CheckoutOptions checkoutOptions = (CheckoutOptions) obj;
                return Intrinsics.areEqual(unknownFields(), checkoutOptions.unknownFields()) && Intrinsics.areEqual(this.automatic_discounts, checkoutOptions.automatic_discounts) && Intrinsics.areEqual(this.scope_options, checkoutOptions.scope_options);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                Boolean bool = this.automatic_discounts;
                int hashCode2 = (hashCode + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
                ScopeOptions scopeOptions = this.scope_options;
                int hashCode3 = hashCode2 + (scopeOptions != null ? scopeOptions.hashCode() : 0);
                this.hashCode = hashCode3;
                return hashCode3;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                Card.Builder builder = new Card.Builder(1);
                builder.card_type = this.automatic_discounts;
                builder.card_pii = this.scope_options;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                Boolean bool = this.automatic_discounts;
                if (bool != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m("automatic_discounts=", bool, arrayList);
                }
                ScopeOptions scopeOptions = this.scope_options;
                if (scopeOptions != null) {
                    arrayList.add("scope_options=" + scopeOptions);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "CheckoutOptions{", "}", 0, null, null, 56);
            }
        }

        static {
            Action$OneTimePayment$Companion$ADAPTER$1 action$OneTimePayment$Companion$ADAPTER$1 = new Action$OneTimePayment$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(OneTimePayment.class), "type.googleapis.com/squareup.cash.grantly.api.Action.OneTimePayment", Syntax.PROTO_2, null, "squareup/cash/grantly/api/action.proto");
            ADAPTER = action$OneTimePayment$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(action$OneTimePayment$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OneTimePayment(Long l, CurrencyCode currencyCode, String str, String str2, CheckoutOptions checkoutOptions, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.amount = l;
            this.currency = currencyCode;
            this.scope_id = str;
            this.order_id = str2;
            this.checkout_options = checkoutOptions;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof OneTimePayment)) {
                return false;
            }
            OneTimePayment oneTimePayment = (OneTimePayment) obj;
            return Intrinsics.areEqual(unknownFields(), oneTimePayment.unknownFields()) && Intrinsics.areEqual(this.amount, oneTimePayment.amount) && this.currency == oneTimePayment.currency && Intrinsics.areEqual(this.scope_id, oneTimePayment.scope_id) && Intrinsics.areEqual(this.order_id, oneTimePayment.order_id) && Intrinsics.areEqual(this.checkout_options, oneTimePayment.checkout_options);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Long l = this.amount;
            int hashCode2 = (hashCode + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
            CurrencyCode currencyCode = this.currency;
            int hashCode3 = (hashCode2 + (currencyCode != null ? currencyCode.hashCode() : 0)) * 37;
            String str = this.scope_id;
            int hashCode4 = (hashCode3 + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.order_id;
            int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 37;
            CheckoutOptions checkoutOptions = this.checkout_options;
            int hashCode6 = hashCode5 + (checkoutOptions != null ? checkoutOptions.hashCode() : 0);
            this.hashCode = hashCode6;
            return hashCode6;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Text.Builder builder = new Text.Builder(11);
            builder.text_style = this.amount;
            builder.text_decoration = this.currency;
            builder.text = this.scope_id;
            builder.text_color = this.order_id;
            builder.icon = this.checkout_options;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            Long l = this.amount;
            if (l != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("amount=", l, arrayList);
            }
            CurrencyCode currencyCode = this.currency;
            if (currencyCode != null) {
                Matcher$$ExternalSyntheticOutline0.m("currency=", currencyCode, arrayList);
            }
            String str = this.scope_id;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "scope_id=", arrayList);
            }
            String str2 = this.order_id;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "order_id=", arrayList);
            }
            CheckoutOptions checkoutOptions = this.checkout_options;
            if (checkoutOptions != null) {
                arrayList.add("checkout_options=" + checkoutOptions);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "OneTimePayment{", "}", 0, null, null, 56);
        }
    }

    public final class OpenID extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<OpenID> CREATOR;

        public final class Builder extends Message.Builder {
            public final /* synthetic */ int $r8$classId;

            public /* synthetic */ Builder(int i) {
                this.$r8$classId = i;
            }

            @Override // com.squareup.wire.Message.Builder
            public final Message build() {
                switch (this.$r8$classId) {
                    case 0:
                        return new OpenID(buildUnknownFields());
                    case 1:
                        return new OAuth.Metadata.FinancialDataSharing.AuthorizedAccountTypes.AllAccountTypes(buildUnknownFields());
                    case 2:
                        return new ShadowAccountAppLogin(buildUnknownFields());
                    case 3:
                        return new GroupParticipant.Anonymous(buildUnknownFields());
                    case 4:
                        return new GetIncidentsListRequest(buildUnknownFields());
                    case 5:
                        return new SubscribeToIncidentResponse.Success(buildUnknownFields());
                    case 6:
                        return new UnsubscribeFromIncidentResponse.Success(buildUnknownFields());
                    case 7:
                        return new SubmitInvestmentEntitySelectionRequest.CancelAction(buildUnknownFields());
                    case 8:
                        return new SubmitInvestmentEntitySelectionRequest.CancelWithDisableIntent(buildUnknownFields());
                    case 9:
                        return new GetAccountSettingsRequest(buildUnknownFields());
                    case 10:
                        return new GetAuthorizedAccountRequest(buildUnknownFields());
                    case 11:
                        return new GetPublicContactAliasesRequest(buildUnknownFields());
                    case 12:
                        return new GetWebAuthnCredentialsRequest(buildUnknownFields());
                    case 13:
                        return new StartWebAuthnRegistrationRequest(buildUnknownFields());
                    case 14:
                        return new ClearAllCheckInsResponse(buildUnknownFields());
                    case 15:
                        return new ReportPresenceResponse(buildUnknownFields());
                    case 16:
                        return new AddressInputSpec(buildUnknownFields());
                    case 17:
                        return new GetBrandCollectionRequest(buildUnknownFields());
                    case 18:
                        return new GetNeighborhoodsTabContentRequest(buildUnknownFields());
                    case 19:
                        return new LocalMenuItem.ReservationData(buildUnknownFields());
                    case 20:
                        return new LocalProfileWidget.AboutData(buildUnknownFields());
                    case 21:
                        return new LocalProfileWidget.BookingRebookingData(buildUnknownFields());
                    case 22:
                        return new LocalProfileWidget.BookingServicesData(buildUnknownFields());
                    case 23:
                        return new LocalProfileWidget.BookingTeamMembersData(buildUnknownFields());
                    case 24:
                        return new LocalProfileWidget.ContactData(buildUnknownFields());
                    case 25:
                        return new LocalProfileWidget.HoursData(buildUnknownFields());
                    case 26:
                        return new LocalProfileWidget.OrderingMenusData(buildUnknownFields());
                    case 27:
                        return new LocalProfileWidget.OrderingReorderingData(buildUnknownFields());
                    case 28:
                        return new LocalProfileWidget.PoliciesData(buildUnknownFields());
                    default:
                        return new LocalProfileWidget.RetailData(buildUnknownFields());
                }
            }
        }

        static {
            Action$OpenID$Companion$ADAPTER$1 action$OpenID$Companion$ADAPTER$1 = new Action$OpenID$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(OpenID.class), "type.googleapis.com/squareup.cash.grantly.api.Action.OpenID", Syntax.PROTO_2, null, "squareup/cash/grantly/api/action.proto");
            ADAPTER = action$OpenID$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(action$OpenID$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OpenID(ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof OpenID) && Intrinsics.areEqual(unknownFields(), ((OpenID) obj).unknownFields());
        }

        public final int hashCode() {
            return unknownFields().hashCode();
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Builder builder = new Builder(0);
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            return "OpenID{}";
        }
    }

    public final class RecurringDeposits extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<RecurringDeposits> CREATOR;
        public final String account_reference_id;
        public final String logo_url;
        public final String primary_alias;

        static {
            Action$RecurringDeposits$Companion$ADAPTER$1 action$RecurringDeposits$Companion$ADAPTER$1 = new Action$RecurringDeposits$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(RecurringDeposits.class), "type.googleapis.com/squareup.cash.grantly.api.Action.RecurringDeposits", Syntax.PROTO_2, null, "squareup/cash/grantly/api/action.proto");
            ADAPTER = action$RecurringDeposits$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(action$RecurringDeposits$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RecurringDeposits(String str, String str2, String str3, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.primary_alias = str;
            this.logo_url = str2;
            this.account_reference_id = str3;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof RecurringDeposits)) {
                return false;
            }
            RecurringDeposits recurringDeposits = (RecurringDeposits) obj;
            return Intrinsics.areEqual(unknownFields(), recurringDeposits.unknownFields()) && Intrinsics.areEqual(this.primary_alias, recurringDeposits.primary_alias) && Intrinsics.areEqual(this.logo_url, recurringDeposits.logo_url) && Intrinsics.areEqual(this.account_reference_id, recurringDeposits.account_reference_id);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.primary_alias;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.logo_url;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
            String str3 = this.account_reference_id;
            int hashCode4 = hashCode3 + (str3 != null ? str3.hashCode() : 0);
            this.hashCode = hashCode4;
            return hashCode4;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            SupportConfig.Builder builder = new SupportConfig.Builder(12);
            builder.contact_support_url = this.primary_alias;
            builder.privacy_policy_url = this.logo_url;
            builder.terms_of_service_url = this.account_reference_id;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            if (this.primary_alias != null) {
                arrayList.add("primary_alias=██");
            }
            String str = this.logo_url;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "logo_url=", arrayList);
            }
            String str2 = this.account_reference_id;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "account_reference_id=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "RecurringDeposits{", "}", 0, null, null, 56);
        }
    }

    public final class ScopeOptions extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<ScopeOptions> CREATOR;
        public final Boolean risky;

        static {
            Action$ScopeOptions$Companion$ADAPTER$1 action$ScopeOptions$Companion$ADAPTER$1 = new Action$ScopeOptions$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ScopeOptions.class), "type.googleapis.com/squareup.cash.grantly.api.Action.ScopeOptions", Syntax.PROTO_2, null, "squareup/cash/grantly/api/action.proto");
            ADAPTER = action$ScopeOptions$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(action$ScopeOptions$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ScopeOptions(Boolean bool, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.risky = bool;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ScopeOptions)) {
                return false;
            }
            ScopeOptions scopeOptions = (ScopeOptions) obj;
            return Intrinsics.areEqual(unknownFields(), scopeOptions.unknownFields()) && Intrinsics.areEqual(this.risky, scopeOptions.risky);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Boolean bool = this.risky;
            int hashCode2 = hashCode + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            UiAppLock.Builder builder = new UiAppLock.Builder(11);
            builder.activated = this.risky;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            Boolean bool = this.risky;
            if (bool != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("risky=", bool, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "ScopeOptions{", "}", 0, null, null, 56);
        }
    }

    public final class SessionAuthentication extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<SessionAuthentication> CREATOR;
        public final String associated_client_id;
        public final String associated_redirect_url;
        public final String associated_request_id;
        public final List scopes;

        public final class Builder extends Message.Builder {
            public final /* synthetic */ int $r8$classId;
            public String associated_client_id;
            public String associated_redirect_url;
            public String associated_request_id;
            public List scopes;

            public /* synthetic */ Builder(int i) {
                this.$r8$classId = i;
            }

            @Override // com.squareup.wire.Message.Builder
            public final Message build() {
                switch (this.$r8$classId) {
                    case 0:
                        return new SessionAuthentication(this.associated_request_id, this.associated_redirect_url, this.associated_client_id, this.scopes, buildUnknownFields());
                    case 1:
                        return new OmsInitiateLoanPaymentFlowParameters(this.associated_request_id, this.associated_redirect_url, this.associated_client_id, this.scopes, buildUnknownFields());
                    case 2:
                        return new VendedFlagNode.VendedValue(this.associated_request_id, this.associated_redirect_url, this.associated_client_id, this.scopes, buildUnknownFields());
                    default:
                        return new LendingInfo.FirstTimeBorrowData.LimitInfoScreen(this.associated_request_id, this.associated_redirect_url, this.associated_client_id, this.scopes, buildUnknownFields());
                }
            }
        }

        static {
            Action$SessionAuthentication$Companion$ADAPTER$1 action$SessionAuthentication$Companion$ADAPTER$1 = new Action$SessionAuthentication$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SessionAuthentication.class), "type.googleapis.com/squareup.cash.grantly.api.Action.SessionAuthentication", Syntax.PROTO_2, null, "squareup/cash/grantly/api/action.proto");
            ADAPTER = action$SessionAuthentication$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(action$SessionAuthentication$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SessionAuthentication(String str, String str2, String str3, List list, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.associated_request_id = str;
            this.associated_redirect_url = str2;
            this.associated_client_id = str3;
            this.scopes = TransactorKt.immutableCopyOf("scopes", list);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SessionAuthentication)) {
                return false;
            }
            SessionAuthentication sessionAuthentication = (SessionAuthentication) obj;
            return Intrinsics.areEqual(unknownFields(), sessionAuthentication.unknownFields()) && Intrinsics.areEqual(this.scopes, sessionAuthentication.scopes) && Intrinsics.areEqual(this.associated_request_id, sessionAuthentication.associated_request_id) && Intrinsics.areEqual(this.associated_redirect_url, sessionAuthentication.associated_redirect_url) && Intrinsics.areEqual(this.associated_client_id, sessionAuthentication.associated_client_id);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.scopes);
            String str = this.associated_request_id;
            int hashCode = (m + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.associated_redirect_url;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 37;
            String str3 = this.associated_client_id;
            int hashCode3 = hashCode2 + (str3 != null ? str3.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Builder builder = new Builder(0);
            builder.scopes = this.scopes;
            builder.associated_request_id = this.associated_request_id;
            builder.associated_redirect_url = this.associated_redirect_url;
            builder.associated_client_id = this.associated_client_id;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            List list = this.scopes;
            if (!list.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("scopes=", arrayList, list);
            }
            String str = this.associated_request_id;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "associated_request_id=", arrayList);
            }
            String str2 = this.associated_redirect_url;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "associated_redirect_url=", arrayList);
            }
            String str3 = this.associated_client_id;
            if (str3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "associated_client_id=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "SessionAuthentication{", "}", 0, null, null, 56);
        }
    }

    public final class ShadowAccount extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<ShadowAccount> CREATOR;
        public final Integration integration;
        public final String requester_profile_scope_id;

        public enum Integration implements WireEnum {
            DEFAULT(1),
            APPLE_PAYLATER(2);

            public final int value;
            public static final ImageLayout.Companion Companion = new ImageLayout.Companion();
            public static final Action$ShadowAccount$Integration$Companion$ADAPTER$1 ADAPTER = new Action$ShadowAccount$Integration$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Integration.class), Syntax.PROTO_2, null);

            Integration(int i) {
                this.value = i;
            }

            public static final Integration fromValue(int i) {
                Companion.getClass();
                if (i == 1) {
                    return DEFAULT;
                }
                if (i != 2) {
                    return null;
                }
                return APPLE_PAYLATER;
            }

            @Override // com.squareup.wire.WireEnum
            public final int getValue() {
                return this.value;
            }
        }

        static {
            Action$ShadowAccount$Companion$ADAPTER$1 action$ShadowAccount$Companion$ADAPTER$1 = new Action$ShadowAccount$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ShadowAccount.class), "type.googleapis.com/squareup.cash.grantly.api.Action.ShadowAccount", Syntax.PROTO_2, null, "squareup/cash/grantly/api/action.proto");
            ADAPTER = action$ShadowAccount$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(action$ShadowAccount$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShadowAccount(Integration integration, String str, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.integration = integration;
            this.requester_profile_scope_id = str;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ShadowAccount)) {
                return false;
            }
            ShadowAccount shadowAccount = (ShadowAccount) obj;
            return Intrinsics.areEqual(unknownFields(), shadowAccount.unknownFields()) && this.integration == shadowAccount.integration && Intrinsics.areEqual(this.requester_profile_scope_id, shadowAccount.requester_profile_scope_id);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Integration integration = this.integration;
            int hashCode2 = (hashCode + (integration != null ? integration.hashCode() : 0)) * 37;
            String str = this.requester_profile_scope_id;
            int hashCode3 = hashCode2 + (str != null ? str.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Card.Builder builder = new Card.Builder(2);
            builder.card_type = this.integration;
            builder.card_pii = this.requester_profile_scope_id;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            Integration integration = this.integration;
            if (integration != null) {
                arrayList.add("integration=" + integration);
            }
            String str = this.requester_profile_scope_id;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "requester_profile_scope_id=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "ShadowAccount{", "}", 0, null, null, 56);
        }
    }

    public final class ShadowAccountAppLogin extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<ShadowAccountAppLogin> CREATOR;

        static {
            Action$ShadowAccountAppLogin$Companion$ADAPTER$1 action$ShadowAccountAppLogin$Companion$ADAPTER$1 = new Action$ShadowAccountAppLogin$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ShadowAccountAppLogin.class), "type.googleapis.com/squareup.cash.grantly.api.Action.ShadowAccountAppLogin", Syntax.PROTO_2, null, "squareup/cash/grantly/api/action.proto");
            ADAPTER = action$ShadowAccountAppLogin$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(action$ShadowAccountAppLogin$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShadowAccountAppLogin(ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof ShadowAccountAppLogin) && Intrinsics.areEqual(unknownFields(), ((ShadowAccountAppLogin) obj).unknownFields());
        }

        public final int hashCode() {
            return unknownFields().hashCode();
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            OpenID.Builder builder = new OpenID.Builder(2);
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            return "ShadowAccountAppLogin{}";
        }
    }

    public final class UnlinkedRefund extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<UnlinkedRefund> CREATOR;
        public final Long amount;
        public final CurrencyCode currency;
        public final String scope_id;

        static {
            Action$UnlinkedRefund$Companion$ADAPTER$1 action$UnlinkedRefund$Companion$ADAPTER$1 = new Action$UnlinkedRefund$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(UnlinkedRefund.class), "type.googleapis.com/squareup.cash.grantly.api.Action.UnlinkedRefund", Syntax.PROTO_2, null, "squareup/cash/grantly/api/action.proto");
            ADAPTER = action$UnlinkedRefund$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(action$UnlinkedRefund$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UnlinkedRefund(Long l, CurrencyCode currencyCode, String str, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.amount = l;
            this.currency = currencyCode;
            this.scope_id = str;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof UnlinkedRefund)) {
                return false;
            }
            UnlinkedRefund unlinkedRefund = (UnlinkedRefund) obj;
            return Intrinsics.areEqual(unknownFields(), unlinkedRefund.unknownFields()) && Intrinsics.areEqual(this.amount, unlinkedRefund.amount) && this.currency == unlinkedRefund.currency && Intrinsics.areEqual(this.scope_id, unlinkedRefund.scope_id);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Long l = this.amount;
            int hashCode2 = (hashCode + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
            CurrencyCode currencyCode = this.currency;
            int hashCode3 = (hashCode2 + (currencyCode != null ? currencyCode.hashCode() : 0)) * 37;
            String str = this.scope_id;
            int hashCode4 = hashCode3 + (str != null ? str.hashCode() : 0);
            this.hashCode = hashCode4;
            return hashCode4;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            LoanOption.Builder builder = new LoanOption.Builder(25);
            builder.loan_type = this.amount;
            builder.payment_schedule = this.currency;
            builder.tila_data = this.scope_id;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            Long l = this.amount;
            if (l != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("amount=", l, arrayList);
            }
            CurrencyCode currencyCode = this.currency;
            if (currencyCode != null) {
                Matcher$$ExternalSyntheticOutline0.m("currency=", currencyCode, arrayList);
            }
            String str = this.scope_id;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "scope_id=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "UnlinkedRefund{", "}", 0, null, null, 56);
        }
    }

    static {
        Action$Companion$ADAPTER$1 action$Companion$ADAPTER$1 = new Action$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Action.class), "type.googleapis.com/squareup.cash.grantly.api.Action", Syntax.PROTO_2, null, "squareup/cash/grantly/api/action.proto");
        ADAPTER = action$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(action$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Action(Type type2, DrawableUtils drawableUtils, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.f1267type = type2;
        this.details = drawableUtils;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Action)) {
            return false;
        }
        Action action = (Action) obj;
        return Intrinsics.areEqual(unknownFields(), action.unknownFields()) && this.f1267type == action.f1267type && Intrinsics.areEqual(this.details, action.details);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Type type2 = this.f1267type;
        int hashCode2 = (hashCode + (type2 != null ? type2.hashCode() : 0)) * 37;
        DrawableUtils drawableUtils = this.details;
        int hashCode3 = hashCode2 + (drawableUtils != null ? drawableUtils.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.f1268type = this.f1267type;
        builder.details = this.details;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Type type2 = this.f1267type;
        if (type2 != null) {
            arrayList.add("type=" + type2);
        }
        DrawableUtils drawableUtils = this.details;
        if (drawableUtils != null) {
            arrayList.add("details=" + drawableUtils);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Action{", "}", 0, null, null, 56);
    }

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public Object details;

        /* renamed from: type, reason: collision with root package name */
        public Object f1268type;

        public Builder() {
            this.$r8$classId = 7;
            EmptyMap emptyMap = EmptyMap.INSTANCE;
            emptyMap.getClass();
            this.details = emptyMap;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new Action((Type) this.f1268type, (DrawableUtils) this.details, buildUnknownFields());
                case 1:
                    return new BitcoinP2pConversionPercentageInputs((BitcoinP2pConversionPercentageInputs.SubmissionInteraction) this.f1268type, (Long) this.details, buildUnknownFields());
                case 2:
                    return new DisableRecurringCryptoBuyInitiationData((Money) this.f1268type, (RecurringSchedule) this.details, buildUnknownFields());
                case 3:
                    return new UserInteractionContext((UserInteractionContext.UserInteractionSide) this.f1268type, (UserInteractionContext.Applet) this.details, buildUnknownFields());
                case 4:
                    return new Filter((String) this.f1268type, (SignaturePayloadKt) this.details, buildUnknownFields());
                case 5:
                    return new ProfileDirectorySearchResponse((List) this.f1268type, (ProfileDirectorySearchResponse.DefaultUiElements) this.details, buildUnknownFields());
                case 6:
                    return new DataPrivacySetting((DataPrivacySetting.System) this.f1268type, (Boolean) this.details, buildUnknownFields());
                case 7:
                    return new PlaceholderSection((PlaceholderSection.Identifier) this.f1268type, (Map) this.details, buildUnknownFields());
                case 8:
                    return new PreloadRequestContext((UriKt) this.f1268type, (Map) this.details, buildUnknownFields());
                case 9:
                    return new Summary.LineItem((com.squareup.protos.cash.discover.api.app.v2.model.Text) this.f1268type, (com.squareup.protos.cash.discover.api.app.v2.model.Text) this.details, buildUnknownFields());
                case 10:
                    return new RowSection.Item((StaticImageDecoderKt) this.f1268type, (String) this.details, buildUnknownFields());
                case 11:
                    return new Section.Modal((com.squareup.protos.cash.discover.api.app.v2.model.Text) this.f1268type, (Button) this.details, buildUnknownFields());
                case 12:
                    return new ListClaimResolutionStatusesRequest((Pagination) this.f1268type, (String) this.details, buildUnknownFields());
                case 13:
                    return new SetP2PControlsRequest((String) this.f1268type, (P2PControls) this.details, buildUnknownFields());
                case 14:
                    return new CurrencyInfo((CurrencyCode) this.f1268type, (String) this.details, buildUnknownFields());
                case 15:
                    return new ExchangeRate((CurrencyInfo) this.f1268type, (String) this.details, buildUnknownFields());
                case 16:
                    return new StreamExchangeRateRequest((CurrencyCode) this.f1268type, (CurrencyCode) this.details, buildUnknownFields());
                case 17:
                    return new AnalyticsData((AnalyticsEvent) this.f1268type, (AnalyticsEvent) this.details, buildUnknownFields());
                case 18:
                    return new AnalyticsEvent((String) this.f1268type, (Map) this.details, buildUnknownFields());
                case 19:
                    return new ArcadeBadgedAvatarElement.AvatarImageLocalIcon((String) this.f1268type, (SemanticIconColor) this.details, buildUnknownFields());
                case 20:
                    return new CompactInfoComponent((TwoColumnComponent) this.f1268type, (TextElement) this.details, buildUnknownFields());
                case 21:
                    return new ContainerElement((BitmapsKt) this.f1268type, (ContainerElement.Margin) this.details, buildUnknownFields());
                case 22:
                    return new ContainerElement.Margin((ContainerElement.Margin.MarginSize) this.f1268type, (ContainerElement.Margin.MarginSize) this.details, buildUnknownFields());
                case 23:
                    return new IconTextDetailElement((ImageElement) this.f1268type, (TextElement) this.details, buildUnknownFields());
                case 24:
                    return new ListUnorderedComponent((ListUnorderedComponent.Style) this.f1268type, (List) this.details, buildUnknownFields());
                case 25:
                    return new StyleAttributes((Color) this.f1268type, (Boolean) this.details, buildUnknownFields());
                case 26:
                    return new ValueUnitComponent((TextElement) this.f1268type, (TextElement) this.details, buildUnknownFields());
                case 27:
                    return new OAuth.Metadata((OAuth.Metadata.Type) this.f1268type, (HttpHeaderParser) this.details, buildUnknownFields());
                case 28:
                    return new OAuth.Metadata.FinancialDataSharing.AuthorizedAccountTypes.AuthorizedAccount((OAuth.Metadata.FinancialDataSharing.AuthorizedAccountTypes.AccountType) this.f1268type, (FileSystemsKt) this.details, buildUnknownFields());
                default:
                    return new OAuth.Metadata.FinancialDataSharing.AuthorizedAccountTypes((OAuth.Metadata.FinancialDataSharing.AuthorizedAccountTypes.Type) this.f1268type, (IntPair) this.details, buildUnknownFields());
            }
        }

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }
    }

    public enum Type implements WireEnum {
        ONE_TIME_PAYMENT(1),
        ON_FILE_PAYMENT(2),
        UNLINKED_REFUND(3),
        LINK_ACCOUNT(4),
        SESSION_AUTHENTICATION(5),
        RECURRING_DEPOSITS(6),
        ON_FILE_DEPOSIT(7),
        SHADOW_ACCOUNT(8),
        LINK_ACCOUNT_TIDAL(10),
        CUSTOMER_PROFILE_SHARING(11),
        OAUTH(12),
        SHADOW_ACCOUNT_APP_LOGIN(13),
        ON_FILE_PAYOUT(14),
        OPENID(15),
        CHECKING_BALANCE(16);

        public final int value;
        public static final Companion Companion = new Companion();
        public static final Action$Type$Companion$ADAPTER$1 ADAPTER = new Action$Type$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Type.class), Syntax.PROTO_2, null);

        Type(int i) {
            this.value = i;
        }

        public static final Type fromValue(int i) {
            Companion.getClass();
            return Companion.m3868fromValue(i);
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }

        public final class Companion {
            /* renamed from: fromValue, reason: collision with other method in class */
            public static DeclineReason m3866fromValue(int i) {
                switch (i) {
                    case 0:
                        return DeclineReason.DECLINE_REASON_UNSPECIFIED;
                    case 1:
                        return DeclineReason.DECLINE_REASON_UNEXPECTED;
                    case 2:
                        return DeclineReason.DECLINE_REASON_VOIDED_GENERIC;
                    case 3:
                        return DeclineReason.DECLINE_REASON_ENSENTA_MISSING_TRANSACTION_ID;
                    case 4:
                        return DeclineReason.DECLINE_REASON_ENSENTA_GENERIC;
                    case 5:
                        return DeclineReason.DECLINE_REASON_MANUAL_REVIEW_GENERIC;
                    case 6:
                        return DeclineReason.DECLINE_REASON_MANUAL_REVIEW_AMOUNT_MISMATCH;
                    case 7:
                        return DeclineReason.DECLINE_REASON_MANUAL_REVIEW_MISSING_FOR_MOBILE_DEPOSIT_ONLY;
                    case 8:
                        return DeclineReason.DECLINE_REASON_MANUAL_REVIEW_ENDORSEMENT_DOES_NOT_MEET_REQUIREMENTS;
                    case 9:
                        return DeclineReason.DECLINE_REASON_MANUAL_REVIEW_ENDORSEMENT_MISSING;
                    case 10:
                        return DeclineReason.DECLINE_REASON_MANUAL_REVIEW_ENDORSEMENT_IRREGULAR;
                    case 11:
                        return DeclineReason.DECLINE_REASON_MANUAL_REVIEW_SIGNATURE_MISSING;
                    case 12:
                        return DeclineReason.DECLINE_REASON_MANUAL_REVIEW_SIGNATURE_IRREGULAR;
                    case 13:
                        return DeclineReason.DECLINE_REASON_MANUAL_REVIEW_NON_CASH_ITEM;
                    case 14:
                        return DeclineReason.DECLINE_REASON_MANUAL_REVIEW_ALTERED_FICTITIOUS_ITEM;
                    case 15:
                        return DeclineReason.DECLINE_REASON_MANUAL_REVIEW_IRD_USER_DEFINED;
                    case 16:
                        return DeclineReason.DECLINE_REASON_MANUAL_REVIEW_STALE_DATED;
                    case 17:
                        return DeclineReason.DECLINE_REASON_MANUAL_REVIEW_POST_DATED;
                    case 18:
                        return DeclineReason.DECLINE_REASON_MANUAL_REVIEW_UNABLE_TO_PROCESS;
                    case 19:
                        return DeclineReason.DECLINE_REASON_MANUAL_REVIEW_ITEM_EXCEEDS_DOLLAR_AMOUNT;
                    case 20:
                        return DeclineReason.DECLINE_REASON_MANUAL_REVIEW_NOT_AUTHORIZED;
                    case 21:
                        return DeclineReason.DECLINE_REASON_MANUAL_REVIEW_BRANCH_OR_ACCOUNT_SOLD;
                    case 22:
                        return DeclineReason.DECLINE_REASON_MANUAL_REVIEW_REFER_TO_MAKER;
                    case 23:
                        return DeclineReason.DECLINE_REASON_MANUAL_REVIEW_STOP_PAYMENT_SUSPECT;
                    case 24:
                        return DeclineReason.DECLINE_REASON_MANUAL_REVIEW_POOR_IMAGE_QUALITY;
                    case 25:
                        return DeclineReason.DECLINE_REASON_MANUAL_REVIEW_IMAGE_FAILS_SECURITY_CHECK;
                    case 26:
                        return DeclineReason.DECLINE_REASON_MANUAL_REVIEW_CANNOT_DETERMINE_AMOUNT;
                    case 27:
                        return DeclineReason.DECLINE_REASON_MANUAL_REVIEW_FI_PROHIBITED_ITEM;
                    case 28:
                        return DeclineReason.DECLINE_REASON_MANUAL_REVIEW_MY_DEPOSIT_PROHIBITED_ITEM;
                    case 29:
                        return DeclineReason.DECLINE_REASON_AUTOMATED_RISK_REVIEW_GENERIC;
                    case 30:
                        return DeclineReason.DECLINE_REASON_AUTOMATED_RISK_REVIEW_AMOUNT_MISMATCH;
                    case 31:
                        return DeclineReason.DECLINE_REASON_AUTOMATED_RISK_REVIEW_ENDORSEMENT_MISSING;
                    case 32:
                        return DeclineReason.DECLINE_REASON_AUTOMATED_RISK_REVIEW_SIGNATURE_MISSING;
                    case 33:
                        return DeclineReason.DECLINE_REASON_AUTOMATED_RISK_REVIEW_IRD_USER_DEFINED;
                    case 34:
                        return DeclineReason.DECLINE_REASON_AUTOMATED_RISK_REVIEW_STALE_DATED;
                    case 35:
                        return DeclineReason.DECLINE_REASON_AUTOMATED_RISK_REVIEW_POST_DATED;
                    case 36:
                        return DeclineReason.DECLINE_REASON_AUTOMATED_RISK_REVIEW_UNABLE_TO_PROCESS;
                    case 37:
                        return DeclineReason.DECLINE_REASON_AUTOMATED_RISK_REVIEW_NOT_AUTHORIZED;
                    case 38:
                        return DeclineReason.DECLINE_REASON_AUTOMATED_RISK_REVIEW_REFER_TO_MAKER;
                    case 39:
                        return DeclineReason.DECLINE_REASON_AUTOMATED_RISK_REVIEW_POOR_IMAGE_QUALITY;
                    case 40:
                        return DeclineReason.DECLINE_REASON_AUTOMATED_RISK_REVIEW_CANNOT_DETERMINE_AMOUNT;
                    case 41:
                        return DeclineReason.DECLINE_REASON_AUTOMATED_RISK_REVIEW_FI_PROHIBITED_ITEM;
                    case 42:
                        return DeclineReason.DECLINE_REASON_AUTOMATED_RISK_REVIEW_MY_DEPOSIT_PROHIBITED_ITEM;
                    case 43:
                        return DeclineReason.DECLINE_REASON_AUTOMATED_RISK_REVIEW_ACCOUNT_VALIDATION_FAILED;
                    case 44:
                        return DeclineReason.DECLINE_REASON_VOIDED_INSUFFICIENT_FUNDS;
                    case 45:
                        return DeclineReason.DECLINE_REASON_VOIDED_UNCOLLECTED_FUNDS_HOLD;
                    case 46:
                        return DeclineReason.DECLINE_REASON_VOIDED_STOP_PAYMENT;
                    case 47:
                        return DeclineReason.DECLINE_REASON_VOIDED_CLOSED_ACCOUNT;
                    case 48:
                        return DeclineReason.DECLINE_REASON_VOIDED_UNABLE_TO_LOCATE_ACCOUNT;
                    case 49:
                        return DeclineReason.DECLINE_REASON_VOIDED_FROZEN_OR_BLOCKED_ACCOUNT;
                    case 50:
                        return DeclineReason.DECLINE_REASON_VOIDED_STALE_DATED;
                    case 51:
                        return DeclineReason.DECLINE_REASON_VOIDED_POST_DATED;
                    case 52:
                        return DeclineReason.DECLINE_REASON_VOIDED_ENDORSEMENT_MISSING;
                    case 53:
                        return DeclineReason.DECLINE_REASON_VOIDED_ENDORSEMENT_IRREGULAR;
                    case 54:
                        return DeclineReason.DECLINE_REASON_VOIDED_SIGNATURE_MISSING;
                    case 55:
                        return DeclineReason.DECLINE_REASON_VOIDED_SIGNATURE_IRREGULAR;
                    case 56:
                        return DeclineReason.DECLINE_REASON_VOIDED_NON_CASH_ITEM;
                    case 57:
                        return DeclineReason.DECLINE_REASON_VOIDED_ALTERED_OR_FICTITIOUS;
                    case 58:
                        return DeclineReason.DECLINE_REASON_VOIDED_UNABLE_TO_PROCESS;
                    case 59:
                        return DeclineReason.DECLINE_REASON_VOIDED_EXCEEDS_STATED_MAX_VALUE;
                    case 60:
                        return DeclineReason.DECLINE_REASON_VOIDED_NOT_AUTHORIZED;
                    case 61:
                        return DeclineReason.DECLINE_REASON_VOIDED_BRANCH_ACCOUNT_SOLD;
                    case 62:
                        return DeclineReason.DECLINE_REASON_VOIDED_REFER_TO_MAKER;
                    case 63:
                        return DeclineReason.DECLINE_REASON_VOIDED_EXCEEDS_ALLOWABLE_NUMBER_OF_PRESENTMENTS;
                    case 64:
                        return DeclineReason.DECLINE_REASON_VOIDED_UNUSABLE_IMAGE;
                    case 65:
                        return DeclineReason.DECLINE_REASON_VOIDED_INVALID_IMAGE;
                    case 66:
                        return DeclineReason.DECLINE_REASON_VOIDED_CANNOT_DETERMINE_AMOUNT;
                    case 67:
                        return DeclineReason.DECLINE_REASON_VOIDED_REFER_TO_IMAGE;
                    case 68:
                        return DeclineReason.DECLINE_REASON_VOIDED_DUPLICATE_PRESENTMENT;
                    case 69:
                        return DeclineReason.DECLINE_REASON_VOIDED_FORGERY;
                    case 70:
                        return DeclineReason.DECLINE_REASON_VOIDED_ACH_ADMIN_RETURN;
                    case 71:
                        return DeclineReason.DECLINE_REASON_VOIDED_WARRANTY_BREACH;
                    case 72:
                        return DeclineReason.DECLINE_REASON_VOIDED_RCC_WARRANTY_BREACH;
                    case 73:
                        return DeclineReason.DECLINE_REASON_VOIDED_FORGED_AND_COUNTERFEIT_WARRANTY_BREACH;
                    case 74:
                        return DeclineReason.DECLINE_REASON_VOIDED_RETIRED_INELIGIBLE_ROUTUNG_NUMBER;
                    case 75:
                        return DeclineReason.DECLINE_REASON_VOIDED_UNKNOWN;
                    case 76:
                        return DeclineReason.DECLINE_REASON_MANUAL_REVIEW_CLOSED_ACCOUNT;
                    case 77:
                        return DeclineReason.DECLINE_REASON_MANUAL_REVIEW_MISSING_AUTHORIZATION_CODE;
                    case 78:
                        return DeclineReason.DECLINE_REASON_MANUAL_REVIEW_MICR_CODELINE_OCR_MISMATCH;
                    case 79:
                        return DeclineReason.DECLINE_REASON_CHECK_DEPOSIT_UNSUPPORTED_MICR_CODELINE_FORMAT;
                    case 80:
                        return DeclineReason.DECLINE_REASON_CHECK_DEPOSIT_TIMEOUT_CHECK_SUBMISSION;
                    case 81:
                        return DeclineReason.DECLINE_REASON_CHECK_DEPOSIT_TIMEOUT_DEPOSIT;
                    case 82:
                    default:
                        return null;
                    case 83:
                        return DeclineReason.DECLINE_REASON_CHECK_DEPOSIT_TIMEOUT_REVIEW;
                    case 84:
                        return DeclineReason.DECLINE_REASON_AUTOMATED_RISK_REVIEW_DUPLICATE_PRESENTMENT;
                    case 85:
                        return DeclineReason.DECLINE_REASON_CHECK_DEPOSIT_ALREADY_ACCEPTED;
                    case 86:
                        return DeclineReason.DECLINE_REASON_CHECK_DEPOSIT_INVALID_BALANCE_TYPE;
                    case 87:
                        return DeclineReason.DECLINE_REASON_CHECK_DEPOSIT_CUSTOMER_EXCEEDED_LIMITS;
                    case 88:
                        return DeclineReason.DECLINE_REASON_CHECK_DEPOSIT_GIVEN_AMOUNT_DOES_NOT_MATCH_CHECK_AMOUNT;
                    case 89:
                        return DeclineReason.DECLINE_REASON_CHECK_DEPOSIT_FROZEN_OR_DENYLISTED_CUSTOMER;
                    case 90:
                        return DeclineReason.DECLINE_REASON_CHECK_DEPOSIT_NO_DUPLICATE_PENDING_SUBMISSIONS;
                    case 91:
                        return DeclineReason.DECLINE_REASON_CHECK_DEPOSIT_PREVIOUS_NONRETRYABLE_DECLINE;
                    case 92:
                        return DeclineReason.DECLINE_REASON_ENSENTA_CERTIFICATE_INVALID;
                    case 93:
                        return DeclineReason.DECLINE_REASON_MANUAL_REVIEW_FROZEN_ACCOUNT;
                    case 94:
                        return DeclineReason.DECLINE_REASON_MANUAL_REVIEW_INVALID_DATE;
                    case 95:
                        return DeclineReason.DECLINE_REASON_OTHER_NONRETRYABLE;
                    case 96:
                        return DeclineReason.DECLINE_REASON_OTHER_RETRYABLE;
                    case 97:
                        return DeclineReason.DECLINE_REASON_MANUAL_REVIEW_INSUFFICIENT_FUNDS;
                    case 98:
                        return DeclineReason.DECLINE_REASON_CHECK_DEPOSIT_CHECK_IMAGES_NOT_PROVIDED;
                    case 99:
                        return DeclineReason.DECLINE_REASON_EXPERIMENT_DECLINE_INVALID_ACCOUNT_AFTER_HOLD_PERIOD;
                    case 100:
                        return DeclineReason.DECLINE_REASON_CHECK_DEPOSIT_CANT_RETRIEVE_SQUARE_UNIT_TOKEN;
                    case 101:
                        return DeclineReason.DECLINE_REASON_AUTOMATED_RISK_REVIEW_IDV_NAME_MISMATCH;
                    case 102:
                        return DeclineReason.DECLINE_REASON_AUTOMATED_RISK_REVIEW_SAME_MAKER_SAME_PAYEE;
                    case 103:
                        return DeclineReason.DECLINE_REASON_VOIDED_DEPOSIT_ADJUSTMENT;
                }
            }

            /* renamed from: fromValue, reason: collision with other method in class */
            public static TransactionType m3865fromValue(int i) {
                switch (i) {
                    case 0:
                        return TransactionType.UNKNOWN;
                    case 1:
                        return TransactionType.CASH_CARD;
                    case 2:
                        return TransactionType.PAY_WITH_CASH;
                    case 3:
                        return TransactionType.P2P_PAYMENT;
                    case 4:
                        return TransactionType.ACH_TRANSFER;
                    case 5:
                        return TransactionType.ATO_GROUP;
                    case 6:
                        return TransactionType.PAPER_MONEY_DEPOSIT;
                    case 7:
                        return TransactionType.CASH_IN;
                    case 8:
                        return TransactionType.CASH_OUT;
                    case 9:
                        return TransactionType.BITCOIN;
                    case 10:
                        return TransactionType.STABLECOIN;
                    case 11:
                        return TransactionType.PAYOUT;
                    case 12:
                        return TransactionType.P2P_STABLECOIN;
                    case 13:
                        return TransactionType.AFTERPAY_PSP;
                    case 14:
                        return TransactionType.MISSING_DEPOSIT;
                    default:
                        return null;
                }
            }

            /* renamed from: fromValue, reason: collision with other method in class */
            public static SemanticIconColor m3867fromValue(int i) {
                switch (i) {
                    case 1:
                        return SemanticIconColor.ICON_BRAND;
                    case 2:
                        return SemanticIconColor.ICON_DANGER;
                    case 3:
                        return SemanticIconColor.ICON_DISABLED;
                    case 4:
                        return SemanticIconColor.ICON_EXTRA_SUBTLE;
                    case 5:
                        return SemanticIconColor.ICON_INFO;
                    case 6:
                        return SemanticIconColor.ICON_INVERSE;
                    case 7:
                        return SemanticIconColor.ICON_PROMINENT;
                    case 8:
                        return SemanticIconColor.ICON_STANDARD;
                    case 9:
                        return SemanticIconColor.ICON_SUBTLE;
                    case 10:
                        return SemanticIconColor.ICON_SUCCESS;
                    case 11:
                        return SemanticIconColor.ICON_WARNING;
                    default:
                        return null;
                }
            }

            public static CommerceRefund.RefundState fromValue(int i) {
                if (i == 0) {
                    return CommerceRefund.RefundState.UNKNOWN_REFUND_STATE;
                }
                if (i == 1) {
                    return CommerceRefund.RefundState.AUTHORIZED_REFUND_STATE;
                }
                if (i == 2) {
                    return CommerceRefund.RefundState.CAPTURED_REFUND_STATE;
                }
                if (i == 3) {
                    return CommerceRefund.RefundState.VOIDED_REFUND_STATE;
                }
                if (i != 4) {
                    return null;
                }
                return CommerceRefund.RefundState.DECLINED_REFUND_STATE;
            }

            /* renamed from: fromValue, reason: collision with other method in class */
            public static Button.ButtonAction m3864fromValue(int i) {
                if (i == 1) {
                    return Button.ButtonAction.DISMISS;
                }
                if (i == 2) {
                    return Button.ButtonAction.URL;
                }
                if (i != 3) {
                    return null;
                }
                return Button.ButtonAction.HALF_SHEET;
            }

            /* renamed from: fromValue, reason: collision with other method in class */
            public static Type m3868fromValue(int i) {
                switch (i) {
                    case 1:
                        return Type.ONE_TIME_PAYMENT;
                    case 2:
                        return Type.ON_FILE_PAYMENT;
                    case 3:
                        return Type.UNLINKED_REFUND;
                    case 4:
                        return Type.LINK_ACCOUNT;
                    case 5:
                        return Type.SESSION_AUTHENTICATION;
                    case 6:
                        return Type.RECURRING_DEPOSITS;
                    case 7:
                        return Type.ON_FILE_DEPOSIT;
                    case 8:
                        return Type.SHADOW_ACCOUNT;
                    case 9:
                    default:
                        return null;
                    case 10:
                        return Type.LINK_ACCOUNT_TIDAL;
                    case 11:
                        return Type.CUSTOMER_PROFILE_SHARING;
                    case 12:
                        return Type.OAUTH;
                    case 13:
                        return Type.SHADOW_ACCOUNT_APP_LOGIN;
                    case 14:
                        return Type.ON_FILE_PAYOUT;
                    case 15:
                        return Type.OPENID;
                    case 16:
                        return Type.CHECKING_BALANCE;
                }
            }
        }
    }
}
