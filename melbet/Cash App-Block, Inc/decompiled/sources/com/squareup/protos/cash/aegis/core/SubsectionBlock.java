package com.squareup.protos.cash.aegis.core;

import android.os.Parcelable;
import androidx.compose.ui.text.input.InputState_androidKt;
import androidx.room.TransactorKt;
import app.cash.local.primitives.BrandCardDetailsKt;
import app.cash.local.primitives.BrandCollectionDataKt;
import app.cash.local.primitives.DiscountCodeKt;
import app.cash.local.primitives.LocalBrandBanner;
import com.google.android.gms.internal.mlkit_vision_barcode.zztj;
import com.squareup.cash.bankingbenefits.api.v1_0.app.BenefitsHub;
import com.squareup.cash.bankingbenefits.api.v1_0.app.GetBankingBenefitsHubResponse;
import com.squareup.cash.bankingbenefits.api.v1_0.app.GetBenefitLeafletResponse;
import com.squareup.cash.bankingbenefits.api.v1_0.core.ui.elements.ButtonRow;
import com.squareup.cash.bankingbenefits.ui.BankingBenefitsConfig;
import com.squareup.cash.cashsubscriptions.phoneplans.api.v1_0.app.MobilePlanHome;
import com.squareup.cash.cryptonauts.api.SetBtcP2pConversionBpsV2Response;
import com.squareup.cash.cryptonauts.api.SetCryptoControlsResponse;
import com.squareup.cash.cryptonauts.api.SetCryptoControlsResponse$CustomerControl$CryptoExchangeCustomerControl;
import com.squareup.cash.lynx.api.v1_0.model.BrowserInteractionDetails;
import com.squareup.cash.moneta.api.v1_0.EnqueueCashInRequirementsResponse;
import com.squareup.cash.moneta.plasma.LinkBankAccountPlaidThenRedirectFlowParameters;
import com.squareup.cash.moneybot.genie.protos.ComposePlatform;
import com.squareup.cash.moneybot.genie.protos.Node;
import com.squareup.cash.mooncake.theming.RipplesKt;
import com.squareup.cash.mosaic.resources.api.v2.GetMusicStreamingUrlResponse;
import com.squareup.cash.mosaic.resources.api.v2.Music;
import com.squareup.cash.supportarticles.app.v1.SupportArticle;
import com.squareup.lending.CashCreditScoreEntryPointData;
import com.squareup.protos.cash.aegis.api.GetFamilyAccountsResponse;
import com.squareup.protos.cash.aegis.api.GetFamilyPendingRequestsRequest;
import com.squareup.protos.cash.aegis.api.GetFamilyPendingRequestsResponse;
import com.squareup.protos.cash.aegis.api.GetSafetyEducationHubResponse;
import com.squareup.protos.cash.aegis.client_routes.DependentDetailsEntryDialog;
import com.squareup.protos.cash.aegis.client_routes.DependentDetailsParams;
import com.squareup.protos.cash.aegis.sync_values.FamilyAccount;
import com.squareup.protos.cash.aegis.sync_values.FamilyTileContent;
import com.squareup.protos.cash.aegis.sync_values.FamilyTileContent$Type$SponsorTileContent;
import com.squareup.protos.cash.aegis.sync_values.UiFamilyAccount;
import com.squareup.protos.cash.agentcore.api.v1.RevokeAgentAccountResponse;
import com.squareup.protos.cash.badging.api.BadgeCounts;
import com.squareup.protos.cash.badging.api.GetBadgeCountsClientResponse;
import com.squareup.protos.cash.balancemover.api.v1.SavingsTransferContext;
import com.squareup.protos.cash.blockly.api.AllowlistSearchResponse;
import com.squareup.protos.cash.blockly.api.BlockSearchResponse;
import com.squareup.protos.cash.blockly.api.ModifyAllowlistEntryResponse;
import com.squareup.protos.franklin.data.BrowserInteraction;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class SubsectionBlock extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SubsectionBlock> CREATOR;

    /* renamed from: type, reason: collision with root package name */
    public final BrandCardDetailsKt f1244type;

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;

        /* renamed from: type, reason: collision with root package name */
        public Object f1245type;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new SubsectionBlock((BrandCardDetailsKt) this.f1245type, buildUnknownFields());
                case 1:
                    return new BenefitsHub.CallToActions((ButtonRow) this.f1245type, buildUnknownFields());
                case 2:
                    return new GetBankingBenefitsHubResponse((BenefitsHub) this.f1245type, buildUnknownFields());
                case 3:
                    return new GetBenefitLeafletResponse.BenefitLeafletElement((RipplesKt) this.f1245type, buildUnknownFields());
                case 4:
                    return new BankingBenefitsConfig((BankingBenefitsConfig.ActivitySection) this.f1245type, buildUnknownFields());
                case 5:
                    return new MobilePlanHome.Header((InputState_androidKt) this.f1245type, buildUnknownFields());
                case 6:
                    return new SetBtcP2pConversionBpsV2Response((SetBtcP2pConversionBpsV2Response.Status) this.f1245type, buildUnknownFields());
                case 7:
                    return new SetCryptoControlsResponse((SetCryptoControlsResponse$CustomerControl$CryptoExchangeCustomerControl) this.f1245type, buildUnknownFields());
                case 8:
                    return new BrowserInteractionDetails((BrowserInteraction) this.f1245type, buildUnknownFields());
                case 9:
                    return new EnqueueCashInRequirementsResponse((EnqueueCashInRequirementsResponse.Status) this.f1245type, buildUnknownFields());
                case 10:
                    return new LinkBankAccountPlaidThenRedirectFlowParameters((LinkBankAccountPlaidThenRedirectFlowParameters.BitcoinBuyClientRouteContext) this.f1245type, buildUnknownFields());
                case 11:
                    Node node = (Node) this.f1245type;
                    if (node != null) {
                        return new ComposePlatform.Modifier.Overlay(node, buildUnknownFields());
                    }
                    TransactorKt.missingRequiredFields(node, "content");
                    throw null;
                case 12:
                    return new GetMusicStreamingUrlResponse((Music) this.f1245type, buildUnknownFields());
                case 13:
                    return new SupportArticle.ContactOption((SupportArticle.Channel) this.f1245type, buildUnknownFields());
                case 14:
                    return new CashCreditScoreEntryPointData.InstalledState.Graph.Item((Float) this.f1245type, buildUnknownFields());
                case 15:
                    return new GetFamilyAccountsResponse((FamilyAccountsParameters) this.f1245type, buildUnknownFields());
                case 16:
                    return new GetFamilyPendingRequestsRequest((GetFamilyPendingRequestsRequest.RequestType) this.f1245type, buildUnknownFields());
                case 17:
                    return new GetFamilyPendingRequestsResponse((PendingRequestsParams) this.f1245type, buildUnknownFields());
                case 18:
                    return new GetSafetyEducationHubResponse((SafetyEducationHub) this.f1245type, buildUnknownFields());
                case 19:
                    return new DependentDetailsParams((DependentDetailsEntryDialog) this.f1245type, buildUnknownFields());
                case 20:
                    return new PendingRequestSection((zztj) this.f1245type, buildUnknownFields());
                case 21:
                    return new FamilyAccount((BrandCollectionDataKt) this.f1245type, buildUnknownFields());
                case 22:
                    return new FamilyTileContent((FamilyTileContent$Type$SponsorTileContent) this.f1245type, buildUnknownFields());
                case 23:
                    return new UiFamilyAccount((FamilyAccount) this.f1245type, buildUnknownFields());
                case 24:
                    return new RevokeAgentAccountResponse((RevokeAgentAccountResponse.Status) this.f1245type, buildUnknownFields());
                case 25:
                    return new GetBadgeCountsClientResponse((BadgeCounts) this.f1245type, buildUnknownFields());
                case 26:
                    return new SavingsTransferContext((DiscountCodeKt) this.f1245type, buildUnknownFields());
                case 27:
                    return new AllowlistSearchResponse((LocalBrandBanner.Action) this.f1245type, buildUnknownFields());
                case 28:
                    return new BlockSearchResponse((LocalBrandBanner.Companion) this.f1245type, buildUnknownFields());
                default:
                    return new ModifyAllowlistEntryResponse((ModifyAllowlistEntryResponse.FailureReason) this.f1245type, buildUnknownFields());
            }
        }
    }

    static {
        SubsectionBlock$Companion$ADAPTER$1 subsectionBlock$Companion$ADAPTER$1 = new SubsectionBlock$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SubsectionBlock.class), "type.googleapis.com/squareup.cash.aegis.core.SubsectionBlock", Syntax.PROTO_2, null, "squareup/cash/aegis/core/SafetyEducationHub.proto");
        ADAPTER = subsectionBlock$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(subsectionBlock$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubsectionBlock(BrandCardDetailsKt brandCardDetailsKt, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.f1244type = brandCardDetailsKt;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SubsectionBlock)) {
            return false;
        }
        SubsectionBlock subsectionBlock = (SubsectionBlock) obj;
        return Intrinsics.areEqual(unknownFields(), subsectionBlock.unknownFields()) && Intrinsics.areEqual(this.f1244type, subsectionBlock.f1244type);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        BrandCardDetailsKt brandCardDetailsKt = this.f1244type;
        int hashCode2 = hashCode + (brandCardDetailsKt != null ? brandCardDetailsKt.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.f1245type = this.f1244type;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        BrandCardDetailsKt brandCardDetailsKt = this.f1244type;
        if (brandCardDetailsKt != null) {
            arrayList.add("type=" + brandCardDetailsKt);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SubsectionBlock{", "}", 0, null, null, 56);
    }

    public /* synthetic */ SubsectionBlock(BrandCardDetailsKt brandCardDetailsKt) {
        this(brandCardDetailsKt, ByteString.EMPTY);
    }
}
