package com.squareup.protos.franklin.app;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.api.SupportConfig;
import com.squareup.protos.franklin.app.GetAppConfigResponse;
import com.squareup.protos.franklin.bankbook.InstitutionsConfig;
import com.squareup.protos.franklin.common.BlockersConfig;
import com.squareup.protos.franklin.common.CashDrawerConfig;
import com.squareup.protos.franklin.common.ClientRoutingConfig;
import com.squareup.protos.franklin.common.CryptocurrencyConfig;
import com.squareup.protos.franklin.common.FeatureFlag;
import com.squareup.protos.franklin.common.InstrumentLinkingConfig;
import com.squareup.protos.franklin.common.LocalizationConfig;
import com.squareup.protos.franklin.common.MarketCapabilitiesConfig;
import com.squareup.protos.franklin.common.OfflineConfig;
import com.squareup.protos.franklin.common.PaymentHistoryConfig;
import com.squareup.protos.franklin.common.PoolsConfig;
import com.squareup.protos.franklin.common.RecipientConfig;
import com.squareup.protos.franklin.common.SharingConfig;
import com.squareup.protos.franklin.common.StampsConfig;
import com.squareup.protos.franklin.common.TreehouseConfig;
import com.squareup.protos.franklin.common.WebLoginConfig;
import com.squareup.protos.franklin.common.scenarios.InvitationConfig;
import com.squareup.protos.franklin.common.scenarios.RatePlanConfig;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class GetAppConfigResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    @Override // com.squareup.wire.ProtoAdapter
    public final java.lang.Object decode(com.squareup.wire.ProtoReader r36) {
        /*
            Method dump skipped, instructions count: 678
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.protos.franklin.app.GetAppConfigResponse$Companion$ADAPTER$1.decode(com.squareup.wire.ProtoReader):java.lang.Object");
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetAppConfigResponse getAppConfigResponse = (GetAppConfigResponse) obj;
        reverseProtoWriter.getClass();
        getAppConfigResponse.getClass();
        reverseProtoWriter.writeBytes(getAppConfigResponse.unknownFields());
        InAppBrowserConfig.ADAPTER.encodeWithTag(reverseProtoWriter, 32, getAppConfigResponse.in_app_browser_config);
        CashLiteConfig.ADAPTER.encodeWithTag(reverseProtoWriter, 31, getAppConfigResponse.cash_lite_config);
        LocalizationConfig.ADAPTER.encodeWithTag(reverseProtoWriter, 30, getAppConfigResponse.localization_config);
        PoolsConfig.ADAPTER.encodeWithTag(reverseProtoWriter, 29, getAppConfigResponse.pools_config);
        ClientRoutingConfig.ADAPTER.encodeWithTag(reverseProtoWriter, 28, getAppConfigResponse.client_routing_config);
        MarketCapabilitiesConfig.ADAPTER.encodeWithTag(reverseProtoWriter, 26, getAppConfigResponse.market_capabilities_config);
        FeatureFlag.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 25, getAppConfigResponse.feature_flags);
        TreehouseConfig.ADAPTER.encodeWithTag(reverseProtoWriter, 24, getAppConfigResponse.treehouse_config);
        CheckDepositConfig.ADAPTER.encodeWithTag(reverseProtoWriter, 23, getAppConfigResponse.check_deposit_config);
        BankingConfig.ADAPTER.encodeWithTag(reverseProtoWriter, 22, getAppConfigResponse.banking_config);
        ScheduledPaymentsConfig.ADAPTER.encodeWithTag(reverseProtoWriter, 21, getAppConfigResponse.scheduled_payments_config);
        ReactionConfig.ADAPTER.encodeWithTag(reverseProtoWriter, 20, getAppConfigResponse.reaction_config);
        CashDrawerConfig.ADAPTER.encodeWithTag(reverseProtoWriter, 18, getAppConfigResponse.cash_drawer_config);
        CryptocurrencyConfig.ADAPTER.encodeWithTag(reverseProtoWriter, 17, getAppConfigResponse.cryptocurrency_config);
        StampsConfig.ADAPTER.encodeWithTag(reverseProtoWriter, 16, getAppConfigResponse.stamps_config);
        OfflineConfig.ADAPTER.encodeWithTag(reverseProtoWriter, 15, getAppConfigResponse.offline_config);
        BlockersConfig.ADAPTER.encodeWithTag(reverseProtoWriter, 14, getAppConfigResponse.blockers_config);
        WebLoginConfig.ADAPTER.encodeWithTag(reverseProtoWriter, 13, getAppConfigResponse.web_login_config);
        InstitutionsConfig.ADAPTER.encodeWithTag(reverseProtoWriter, 12, getAppConfigResponse.institutions_config);
        PaymentHistoryConfig.ADAPTER.encodeWithTag(reverseProtoWriter, 11, getAppConfigResponse.payment_history_config);
        SupportConfig.ADAPTER.encodeWithTag(reverseProtoWriter, 10, getAppConfigResponse.support_config);
        SharingConfig.ADAPTER.encodeWithTag(reverseProtoWriter, 8, getAppConfigResponse.sharing_config);
        InstrumentLinkingConfig.ADAPTER.encodeWithTag(reverseProtoWriter, 7, getAppConfigResponse.instrument_linking_config);
        RecipientConfig.ADAPTER.encodeWithTag(reverseProtoWriter, 5, getAppConfigResponse.recipient_config);
        RatePlanConfig.ADAPTER.encodeWithTag(reverseProtoWriter, 4, getAppConfigResponse.rate_plan_config);
        InvitationConfig.ADAPTER.encodeWithTag(reverseProtoWriter, 2, getAppConfigResponse.invitation_config);
        GetAppConfigResponse.Status.ADAPTER.encodeWithTag(reverseProtoWriter, 1, getAppConfigResponse.status);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetAppConfigResponse getAppConfigResponse = (GetAppConfigResponse) obj;
        getAppConfigResponse.getClass();
        return InAppBrowserConfig.ADAPTER.encodedSizeWithTag(32, getAppConfigResponse.in_app_browser_config) + CashLiteConfig.ADAPTER.encodedSizeWithTag(31, getAppConfigResponse.cash_lite_config) + LocalizationConfig.ADAPTER.encodedSizeWithTag(30, getAppConfigResponse.localization_config) + PoolsConfig.ADAPTER.encodedSizeWithTag(29, getAppConfigResponse.pools_config) + ClientRoutingConfig.ADAPTER.encodedSizeWithTag(28, getAppConfigResponse.client_routing_config) + MarketCapabilitiesConfig.ADAPTER.encodedSizeWithTag(26, getAppConfigResponse.market_capabilities_config) + FeatureFlag.ADAPTER.asRepeated().encodedSizeWithTag(25, getAppConfigResponse.feature_flags) + TreehouseConfig.ADAPTER.encodedSizeWithTag(24, getAppConfigResponse.treehouse_config) + CheckDepositConfig.ADAPTER.encodedSizeWithTag(23, getAppConfigResponse.check_deposit_config) + BankingConfig.ADAPTER.encodedSizeWithTag(22, getAppConfigResponse.banking_config) + ScheduledPaymentsConfig.ADAPTER.encodedSizeWithTag(21, getAppConfigResponse.scheduled_payments_config) + ReactionConfig.ADAPTER.encodedSizeWithTag(20, getAppConfigResponse.reaction_config) + CashDrawerConfig.ADAPTER.encodedSizeWithTag(18, getAppConfigResponse.cash_drawer_config) + CryptocurrencyConfig.ADAPTER.encodedSizeWithTag(17, getAppConfigResponse.cryptocurrency_config) + StampsConfig.ADAPTER.encodedSizeWithTag(16, getAppConfigResponse.stamps_config) + OfflineConfig.ADAPTER.encodedSizeWithTag(15, getAppConfigResponse.offline_config) + BlockersConfig.ADAPTER.encodedSizeWithTag(14, getAppConfigResponse.blockers_config) + WebLoginConfig.ADAPTER.encodedSizeWithTag(13, getAppConfigResponse.web_login_config) + InstitutionsConfig.ADAPTER.encodedSizeWithTag(12, getAppConfigResponse.institutions_config) + PaymentHistoryConfig.ADAPTER.encodedSizeWithTag(11, getAppConfigResponse.payment_history_config) + SupportConfig.ADAPTER.encodedSizeWithTag(10, getAppConfigResponse.support_config) + SharingConfig.ADAPTER.encodedSizeWithTag(8, getAppConfigResponse.sharing_config) + InstrumentLinkingConfig.ADAPTER.encodedSizeWithTag(7, getAppConfigResponse.instrument_linking_config) + RecipientConfig.ADAPTER.encodedSizeWithTag(5, getAppConfigResponse.recipient_config) + RatePlanConfig.ADAPTER.encodedSizeWithTag(4, getAppConfigResponse.rate_plan_config) + InvitationConfig.ADAPTER.encodedSizeWithTag(2, getAppConfigResponse.invitation_config) + GetAppConfigResponse.Status.ADAPTER.encodedSizeWithTag(1, getAppConfigResponse.status) + getAppConfigResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetAppConfigResponse getAppConfigResponse = (GetAppConfigResponse) obj;
        getAppConfigResponse.getClass();
        InvitationConfig invitationConfig = getAppConfigResponse.invitation_config;
        InvitationConfig invitationConfig2 = invitationConfig != null ? (InvitationConfig) InvitationConfig.ADAPTER.redact(invitationConfig) : null;
        RatePlanConfig ratePlanConfig = getAppConfigResponse.rate_plan_config;
        RatePlanConfig ratePlanConfig2 = ratePlanConfig != null ? (RatePlanConfig) RatePlanConfig.ADAPTER.redact(ratePlanConfig) : null;
        RecipientConfig recipientConfig = getAppConfigResponse.recipient_config;
        RecipientConfig recipientConfig2 = recipientConfig != null ? (RecipientConfig) RecipientConfig.ADAPTER.redact(recipientConfig) : null;
        InstrumentLinkingConfig instrumentLinkingConfig = getAppConfigResponse.instrument_linking_config;
        InstrumentLinkingConfig instrumentLinkingConfig2 = instrumentLinkingConfig != null ? (InstrumentLinkingConfig) InstrumentLinkingConfig.ADAPTER.redact(instrumentLinkingConfig) : null;
        SharingConfig sharingConfig = getAppConfigResponse.sharing_config;
        SharingConfig sharingConfig2 = sharingConfig != null ? (SharingConfig) SharingConfig.ADAPTER.redact(sharingConfig) : null;
        SupportConfig supportConfig = getAppConfigResponse.support_config;
        SupportConfig supportConfig2 = supportConfig != null ? (SupportConfig) SupportConfig.ADAPTER.redact(supportConfig) : null;
        PaymentHistoryConfig paymentHistoryConfig = getAppConfigResponse.payment_history_config;
        PaymentHistoryConfig paymentHistoryConfig2 = paymentHistoryConfig != null ? (PaymentHistoryConfig) PaymentHistoryConfig.ADAPTER.redact(paymentHistoryConfig) : null;
        InstitutionsConfig institutionsConfig = getAppConfigResponse.institutions_config;
        InstitutionsConfig institutionsConfig2 = institutionsConfig != null ? (InstitutionsConfig) InstitutionsConfig.ADAPTER.redact(institutionsConfig) : null;
        WebLoginConfig webLoginConfig = getAppConfigResponse.web_login_config;
        WebLoginConfig webLoginConfig2 = webLoginConfig != null ? (WebLoginConfig) WebLoginConfig.ADAPTER.redact(webLoginConfig) : null;
        BlockersConfig blockersConfig = getAppConfigResponse.blockers_config;
        BlockersConfig blockersConfig2 = blockersConfig != null ? (BlockersConfig) BlockersConfig.ADAPTER.redact(blockersConfig) : null;
        OfflineConfig offlineConfig = getAppConfigResponse.offline_config;
        OfflineConfig offlineConfig2 = offlineConfig != null ? (OfflineConfig) OfflineConfig.ADAPTER.redact(offlineConfig) : null;
        StampsConfig stampsConfig = getAppConfigResponse.stamps_config;
        StampsConfig stampsConfig2 = stampsConfig != null ? (StampsConfig) StampsConfig.ADAPTER.redact(stampsConfig) : null;
        CryptocurrencyConfig cryptocurrencyConfig = getAppConfigResponse.cryptocurrency_config;
        CryptocurrencyConfig cryptocurrencyConfig2 = cryptocurrencyConfig != null ? (CryptocurrencyConfig) CryptocurrencyConfig.ADAPTER.redact(cryptocurrencyConfig) : null;
        CashDrawerConfig cashDrawerConfig = getAppConfigResponse.cash_drawer_config;
        CashDrawerConfig cashDrawerConfig2 = cashDrawerConfig != null ? (CashDrawerConfig) CashDrawerConfig.ADAPTER.redact(cashDrawerConfig) : null;
        ReactionConfig reactionConfig = getAppConfigResponse.reaction_config;
        ReactionConfig reactionConfig2 = reactionConfig != null ? (ReactionConfig) ReactionConfig.ADAPTER.redact(reactionConfig) : null;
        ScheduledPaymentsConfig scheduledPaymentsConfig = getAppConfigResponse.scheduled_payments_config;
        ScheduledPaymentsConfig scheduledPaymentsConfig2 = scheduledPaymentsConfig != null ? (ScheduledPaymentsConfig) ScheduledPaymentsConfig.ADAPTER.redact(scheduledPaymentsConfig) : null;
        BankingConfig bankingConfig = getAppConfigResponse.banking_config;
        BankingConfig bankingConfig2 = bankingConfig != null ? (BankingConfig) BankingConfig.ADAPTER.redact(bankingConfig) : null;
        CheckDepositConfig checkDepositConfig = getAppConfigResponse.check_deposit_config;
        CheckDepositConfig checkDepositConfig2 = checkDepositConfig != null ? (CheckDepositConfig) CheckDepositConfig.ADAPTER.redact(checkDepositConfig) : null;
        TreehouseConfig treehouseConfig = getAppConfigResponse.treehouse_config;
        TreehouseConfig treehouseConfig2 = treehouseConfig != null ? (TreehouseConfig) TreehouseConfig.ADAPTER.redact(treehouseConfig) : null;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(getAppConfigResponse.feature_flags, FeatureFlag.ADAPTER);
        MarketCapabilitiesConfig marketCapabilitiesConfig = getAppConfigResponse.market_capabilities_config;
        MarketCapabilitiesConfig marketCapabilitiesConfig2 = marketCapabilitiesConfig != null ? (MarketCapabilitiesConfig) MarketCapabilitiesConfig.ADAPTER.redact(marketCapabilitiesConfig) : null;
        ClientRoutingConfig clientRoutingConfig = getAppConfigResponse.client_routing_config;
        ClientRoutingConfig clientRoutingConfig2 = clientRoutingConfig != null ? (ClientRoutingConfig) ClientRoutingConfig.ADAPTER.redact(clientRoutingConfig) : null;
        PoolsConfig poolsConfig = getAppConfigResponse.pools_config;
        PoolsConfig poolsConfig2 = poolsConfig != null ? (PoolsConfig) PoolsConfig.ADAPTER.redact(poolsConfig) : null;
        LocalizationConfig localizationConfig = getAppConfigResponse.localization_config;
        LocalizationConfig localizationConfig2 = localizationConfig != null ? (LocalizationConfig) LocalizationConfig.ADAPTER.redact(localizationConfig) : null;
        CashLiteConfig cashLiteConfig = getAppConfigResponse.cash_lite_config;
        CashLiteConfig cashLiteConfig2 = cashLiteConfig != null ? (CashLiteConfig) CashLiteConfig.ADAPTER.redact(cashLiteConfig) : null;
        InAppBrowserConfig inAppBrowserConfig = getAppConfigResponse.in_app_browser_config;
        InAppBrowserConfig inAppBrowserConfig2 = inAppBrowserConfig != null ? (InAppBrowserConfig) InAppBrowserConfig.ADAPTER.redact(inAppBrowserConfig) : null;
        ByteString byteString = ByteString.EMPTY;
        GetAppConfigResponse.Status status = getAppConfigResponse.status;
        byteString.getClass();
        return new GetAppConfigResponse(status, invitationConfig2, ratePlanConfig2, recipientConfig2, instrumentLinkingConfig2, sharingConfig2, supportConfig2, paymentHistoryConfig2, institutionsConfig2, webLoginConfig2, blockersConfig2, offlineConfig2, stampsConfig2, cryptocurrencyConfig2, cashDrawerConfig2, reactionConfig2, scheduledPaymentsConfig2, bankingConfig2, checkDepositConfig2, treehouseConfig2, m1169redactElements, marketCapabilitiesConfig2, clientRoutingConfig2, poolsConfig2, localizationConfig2, cashLiteConfig2, inAppBrowserConfig2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetAppConfigResponse getAppConfigResponse = (GetAppConfigResponse) obj;
        getAppConfigResponse.getClass();
        GetAppConfigResponse.Status.ADAPTER.encodeWithTag(protoWriter, 1, getAppConfigResponse.status);
        InvitationConfig.ADAPTER.encodeWithTag(protoWriter, 2, getAppConfigResponse.invitation_config);
        RatePlanConfig.ADAPTER.encodeWithTag(protoWriter, 4, getAppConfigResponse.rate_plan_config);
        RecipientConfig.ADAPTER.encodeWithTag(protoWriter, 5, getAppConfigResponse.recipient_config);
        InstrumentLinkingConfig.ADAPTER.encodeWithTag(protoWriter, 7, getAppConfigResponse.instrument_linking_config);
        SharingConfig.ADAPTER.encodeWithTag(protoWriter, 8, getAppConfigResponse.sharing_config);
        SupportConfig.ADAPTER.encodeWithTag(protoWriter, 10, getAppConfigResponse.support_config);
        PaymentHistoryConfig.ADAPTER.encodeWithTag(protoWriter, 11, getAppConfigResponse.payment_history_config);
        InstitutionsConfig.ADAPTER.encodeWithTag(protoWriter, 12, getAppConfigResponse.institutions_config);
        WebLoginConfig.ADAPTER.encodeWithTag(protoWriter, 13, getAppConfigResponse.web_login_config);
        BlockersConfig.ADAPTER.encodeWithTag(protoWriter, 14, getAppConfigResponse.blockers_config);
        OfflineConfig.ADAPTER.encodeWithTag(protoWriter, 15, getAppConfigResponse.offline_config);
        StampsConfig.ADAPTER.encodeWithTag(protoWriter, 16, getAppConfigResponse.stamps_config);
        CryptocurrencyConfig.ADAPTER.encodeWithTag(protoWriter, 17, getAppConfigResponse.cryptocurrency_config);
        CashDrawerConfig.ADAPTER.encodeWithTag(protoWriter, 18, getAppConfigResponse.cash_drawer_config);
        ReactionConfig.ADAPTER.encodeWithTag(protoWriter, 20, getAppConfigResponse.reaction_config);
        ScheduledPaymentsConfig.ADAPTER.encodeWithTag(protoWriter, 21, getAppConfigResponse.scheduled_payments_config);
        BankingConfig.ADAPTER.encodeWithTag(protoWriter, 22, getAppConfigResponse.banking_config);
        CheckDepositConfig.ADAPTER.encodeWithTag(protoWriter, 23, getAppConfigResponse.check_deposit_config);
        TreehouseConfig.ADAPTER.encodeWithTag(protoWriter, 24, getAppConfigResponse.treehouse_config);
        FeatureFlag.ADAPTER.asRepeated().encodeWithTag(protoWriter, 25, getAppConfigResponse.feature_flags);
        MarketCapabilitiesConfig.ADAPTER.encodeWithTag(protoWriter, 26, getAppConfigResponse.market_capabilities_config);
        ClientRoutingConfig.ADAPTER.encodeWithTag(protoWriter, 28, getAppConfigResponse.client_routing_config);
        PoolsConfig.ADAPTER.encodeWithTag(protoWriter, 29, getAppConfigResponse.pools_config);
        LocalizationConfig.ADAPTER.encodeWithTag(protoWriter, 30, getAppConfigResponse.localization_config);
        CashLiteConfig.ADAPTER.encodeWithTag(protoWriter, 31, getAppConfigResponse.cash_lite_config);
        InAppBrowserConfig.ADAPTER.encodeWithTag(protoWriter, 32, getAppConfigResponse.in_app_browser_config);
        protoWriter.writeBytes(getAppConfigResponse.unknownFields());
    }
}
